/**
 * Copyright (c) 2011 - 2014, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.dsl.dto.xtext.scope;

import java.util.ArrayList;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.lunifera.dsl.semantic.common.types.LType;

public class InheritTypesFilterScope extends AbstractScope {
	private final LType context;
	private final IScope scope;

	public InheritTypesFilterScope(LType context, IScope scope) {
		super(IScope.NULLSCOPE, true);
		this.context = context;
		this.scope = scope;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription desc : scope.getAllElements()) {
			LType type = (LType) desc.getEObjectOrProxy();
			if (type != context && type.getName() != null) {
				result.add(desc);
			}
		}

		return result;
	}
}