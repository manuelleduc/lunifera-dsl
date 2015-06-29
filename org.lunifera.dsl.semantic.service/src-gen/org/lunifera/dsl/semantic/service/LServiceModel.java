/**
 * Copyright (c) 2011 - 2014, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 *  All rights reserved. This program and the accompanying materials 
 *  are made available under the terms of the Eclipse Public License v1.0 
 *  which accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html 
 * 
 *  Based on ideas from Xtext, Xtend, Xcore
 *    
 *  Contributors:  
 *  		Florian Pirchner - Initial implementation 
 *  
 */
package org.lunifera.dsl.semantic.service;

import org.eclipse.emf.common.util.EList;

import org.lunifera.dsl.semantic.common.types.LLazyResolver;
import org.lunifera.dsl.semantic.common.types.LTypedPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LService Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.dsl.semantic.service.LServiceModel#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.dsl.semantic.service.LunServicePackage#getLServiceModel()
 * @model
 * @generated
 */
public interface LServiceModel extends LLazyResolver {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.dsl.semantic.common.types.LTypedPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.lunifera.dsl.semantic.service.LunServicePackage#getLServiceModel_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<LTypedPackage> getPackages();

} // LServiceModel