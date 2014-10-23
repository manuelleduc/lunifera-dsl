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

package org.lunifera.dsl.dto.xtext.extensions

import com.google.inject.Inject
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider
import org.eclipse.xtext.xbase.XExpression
import org.lunifera.dsl.common.xtext.extensions.NamingExtensions
import org.lunifera.dsl.semantic.common.types.LType
import org.lunifera.dsl.semantic.dto.LDtoFeature
import org.lunifera.dsl.semantic.entity.DtoNamings

class MethodNamingExtensions extends NamingExtensions {

	@Inject extension DtoModelExtensions;
	@Inject extension QualifiedNameProvider;

	def toMapPropertyToDto(LDtoFeature prop) {
		"toDto_" + prop.toName
	}

	def toMapPropertyToEntity(LDtoFeature prop) {
		"toEntity_" + prop.toName
	}

	def toMapperFieldName(LDtoFeature prop) {
		prop.toName + "Mapper"
	}

	def toMapperName(LType dto) {
		if (dto == null || dto.toName == null) {
			return "setMISSING_NAME"
		}
		dto.toName + "Mapper"
	}

	def toFqnMapperName(LType dto) {
		if (dto == null || dto.toName == null) {
			return "setMISSING_NAME"
		}
		dto.toMapperNamePackage + "." + dto.toMapperName
	}

	def toMapperNamePackage(LType dto) {
		if (dto == null || dto.fullyQualifiedName == null) {
			return "setMISSING_NAME"
		}
		dto.fullyQualifiedName.skipLast(1).append("mapper").toString
	}
	
	def String toDTOBeanFullyQualifiedName(LType type) {
		return DtoNamings.getDtoClassFullyQualifiedName(type)
	}
	 
	def String toDTOBeanSimpleName(LType type) {
		return DtoNamings.getDtoClassSimpleName(type)
	}

	def XExpression toMapToEntityExpression(LDtoFeature prop) {
		if(prop.mapper != null) return prop.mapper.fromDTO else null
	}

	def XExpression toMapToDtoExpression(LDtoFeature prop) {
		if(prop.mapper != null) return prop.mapper.toDTO else null
	}

}
