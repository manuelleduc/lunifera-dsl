/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Sources generated by Xtext  
 * 
 * Contributors:
 *  		Florian Pirchner - Initial implementation
 */
package org.lunifera.dsl.entity.xtext.jvmmodel.bean

import com.google.inject.Inject
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.lunifera.dsl.entity.xtext.extensions.ModelExtensions
import org.lunifera.dsl.entity.xtext.jvmmodel.ClassJvmModelInferrer
import org.lunifera.dsl.semantic.common.types.LAttribute
import org.lunifera.dsl.semantic.common.types.LFeature
import org.lunifera.dsl.semantic.common.types.LReference
import org.lunifera.dsl.semantic.entity.LBean
import org.lunifera.dsl.semantic.entity.LBeanReference
import org.lunifera.dsl.semantic.entity.LEntity

/**
 * Infers a JVM model from {@link LEntity} model elements
 * using JPA as persistence provider.
 */
class BeanJvmModelInferrer extends ClassJvmModelInferrer {

	@Inject extension IQualifiedNameProvider
	@Inject extension ModelExtensions
	@Inject TypeReferences references

	/**
	 * Is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 */
	def void infer(LBean bean, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		acceptor.accept(bean.toJvmType).initializeLater [
			documentation = bean.getDocumentation
			if (bean.getSuperType != null && !bean.getSuperType.fullyQualifiedName.toString.empty) {
				superTypes += references.getTypeForName(bean.getSuperType.fullyQualifiedName.toString, bean, null)
			}
			//
			// Constructor
			//
			members += bean.toConstructor()[]
			if (bean.getSuperType == null) {
				members += bean.toPrimitiveTypeField("disposed", Boolean::TYPE)
			}
			//
			// Fields
			//
			for (f : bean.getFeatures) {
				switch f {
					LFeature: {
						if (f.fullyQualifiedName != null && !f.fullyQualifiedName.toString.empty) {
							members += f.toField
						}
					}
				}
			}
			//
			// Field accessors
			//
			if (bean.getSuperType == null) {
				members += bean.toIsDisposed()
			}
			members += bean.toCheckDisposed()
			members += bean.toDispose()
			for (f : bean.getFeatures) {
				switch f {
					case f instanceof LAttribute: {
						members += f.toGetter()
						if (f.isToMany) {
							members += f.toInternalCollectionGetter(f.getName)
							members += f.toAdder(f.getName)
							members += f.toRemover(f.getName)
						} else {
							members += f.toSetter()
						}
					}
					case f instanceof LReference: {
						members += f.toGetter()
						if (f.isToMany) {
							members += f.toInternalCollectionGetter(f.getName)
							members += f.toAdder(f.getName)
							members += f.toRemover(f.getName)
							members += f.toInternalAdder
							members += f.toInternalRemover
						} else {
							members += f.toSetter()

							if (f.isCascading && (f as LBeanReference).getOpposite != null) {
								members += f.toInternalSetter
							}
						}
					}
				}
			}
			//
			// Methods.
			//
			for (op : bean.getOperations) {
				members += op.toMethod(op.getName, op.getType) [
					documentation = op.getDocumentation
					for (p : op.getParams) {
						parameters += p.toParameter(p.name, p.parameterType)
					}
					body = op.getBody
				]
			}
		]
	}

}
