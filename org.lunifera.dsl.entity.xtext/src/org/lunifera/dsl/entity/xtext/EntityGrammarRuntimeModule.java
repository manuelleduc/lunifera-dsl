/*
 * generated by Xtext
 */
package org.lunifera.dsl.entity.xtext;

import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.lunifera.dsl.common.xtext.scope.CommonImportedNamespaceAwareLocalScopeProvider;
import org.lunifera.dsl.common.xtext.scope.CommonScopeProvider;
import org.lunifera.dsl.entity.xtext.extensions.EntityTypesBuilder;
import org.lunifera.dsl.entity.xtext.formatting.EntityGrammarFormatter;
import org.lunifera.dsl.entity.xtext.jvmmodel.EntityJvmModelGenerator;
import org.lunifera.dsl.entity.xtext.valueconverter.EntityQualifiedNameProvider;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class EntityGrammarRuntimeModule extends
		org.lunifera.dsl.entity.xtext.AbstractEntityGrammarRuntimeModule {

	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return EntityQualifiedNameProvider.class;
	}

	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return CommonScopeProvider.class;
	}

	@Override
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider.class)
				.annotatedWith(
						Names.named("org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.delegate"))
				.to(CommonImportedNamespaceAwareLocalScopeProvider.class);
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends IGenerator> bindIGenerator() {
		return EntityJvmModelGenerator.class;
	}

	public Class<? extends IFormatter> bindIFormatter() {
		return EntityGrammarFormatter.class;
	}

	public Class<? extends org.lunifera.dsl.common.xtext.jvmmodel.AnnotationCompiler> bindAnnotationCompiler() {
		return org.lunifera.dsl.entity.xtext.jvmmodel.AnnotationCompiler.class;
	}
 
	@SuppressWarnings("restriction")
	public Class<? extends JvmTypesBuilder> bindJvmTypesBuilder() {
		return EntityTypesBuilder.class;
	}

	public Class<? extends org.lunifera.dsl.common.xtext.extensions.ModelExtensions> bindModelExtensions() {
		return org.lunifera.dsl.entity.xtext.extensions.ModelExtensions.class;
	}

}
