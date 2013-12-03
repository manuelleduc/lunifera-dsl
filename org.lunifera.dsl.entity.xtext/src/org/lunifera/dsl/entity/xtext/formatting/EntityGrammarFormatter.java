/*
 * generated by Xtext
 */
package org.lunifera.dsl.entity.xtext.formatting;

import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.lunifera.dsl.common.xtext.formatting.CommonGrammarFormatter;
import org.lunifera.dsl.entity.xtext.services.EntityGrammarGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class EntityGrammarFormatter extends CommonGrammarFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {
		configure(c, (EntityGrammarGrammarAccess) getGrammarAccess());
	}

	public void configure(FormattingConfig c, EntityGrammarGrammarAccess ga) {
		EntityGrammarGrammarAccess f = (EntityGrammarGrammarAccess) getGrammarAccess();

		super.configure(c, ga.getCommonGrammarGrammarAccess());
		configureClassDef(c, f.getClassAccess());
		configureEntityDef(c, f.getEntityFeatureAccess());
		configureBeanDef(c, f.getBeanFeatureAccess());
	}

	protected void configureClassDef(FormattingConfig c,
			EntityGrammarGrammarAccess.ClassElements ele) {
		c.setLinewrap().around(ele.getAnnotationsAssignment_1());
		c.setLinewrap(1).around(ele.getRule());

		// entity
		c.setIndentationIncrement().after(
				ele.getLeftCurlyBracketKeyword_2_0_5());
		c.setIndentationDecrement().before(
				ele.getRightCurlyBracketKeyword_2_0_8());
		c.setLinewrap(2).after(ele.getRightCurlyBracketKeyword_2_0_8());

		// bean
		c.setIndentationIncrement().after(
				ele.getLeftCurlyBracketKeyword_2_1_4());
		c.setIndentationDecrement().before(
				ele.getRightCurlyBracketKeyword_2_1_6());
		c.setLinewrap(2).after(ele.getRightCurlyBracketKeyword_2_1_6());
	}

	protected void configureEntityDef(FormattingConfig c,
			EntityGrammarGrammarAccess.EntityFeatureElements ele) {
		c.setLinewrap(1).around(ele.getAnnotationsAssignment_1());
		c.setLinewrap(1, 1, 2).around(ele.getRule());
	}

	protected void configureBeanDef(FormattingConfig c,
			EntityGrammarGrammarAccess.BeanFeatureElements ele) {
		c.setLinewrap(1, 1, 2).around(ele.getRule());
	}

}
