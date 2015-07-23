/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.lunifera.dsl.common.xtext.valueconverter;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractValueConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("restriction")
@Singleton
public class CommonValueConverterService extends XbaseValueConverterService {

	@Inject
	private LDecimalValueConverter lDecimalConverter;

	@ValueConverter(rule = "QualifiedNameWithWildCard")
	public IValueConverter<String> getQualifiedNameWithWildCard() {
		return getQualifiedNameValueConverter();
	}

	@ValueConverter(rule = "LDecimal")
	public IValueConverter<Float> getLDecimalConverter() {
		return lDecimalConverter;
	}

	public static class LDecimalValueConverter extends
			AbstractValueConverter<Float> {

		public Float toValue(String string, INode node)
				throws ValueConverterException {
			return Float.valueOf(string);
		}

		public String toString(Float value) throws ValueConverterException {
			return value.toString();
		}

	}

}
