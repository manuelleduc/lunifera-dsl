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
package org.lunifera.dsl.semantic.common.types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.dsl.semantic.common.types.LunTypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel fileExtensions='typesmodel' editDirectory='/org.lunifera.dsl.semantic.common.edit/src' editorDirectory='/org.lunifera.dsl.semantic.common.editor/src' extensibleProviderFactory='true' modelName='Types' prefix='LunTypes' copyrightText='Copyright (c) 2011 - 2014, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)\n All rights reserved. This program and the accompanying materials \n are made available under the terms of the Eclipse Public License v1.0 \n which accompanies this distribution, and is available at \n http://www.eclipse.org/legal/epl-v10.html \n\n Based on ideas from Xtext, Xtend, Xcore\n  \n Contributors:  \n \t\tFlorian Pirchner - Initial implementation \n ' basePackage='org.lunifera.dsl.semantic.common'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore rootPackage='types'"
 * @generated
 */
public interface LunTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lunifera.org/dsl/common/types/v1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LunTypesPackage eINSTANCE = org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LLazyResolverImpl <em>LLazy Resolver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LLazyResolverImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLLazyResolver()
	 * @generated
	 */
	int LLAZY_RESOLVER = 1;

	/**
	 * The number of structural features of the '<em>LLazy Resolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAZY_RESOLVER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAZY_RESOLVER___ERESOLVE_PROXY__INTERNALEOBJECT = 0;

	/**
	 * The number of operations of the '<em>LLazy Resolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAZY_RESOLVER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LCommonModelImpl <em>LCommon Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LCommonModelImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLCommonModel()
	 * @generated
	 */
	int LCOMMON_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCOMMON_MODEL__PACKAGES = LLAZY_RESOLVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LCommon Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCOMMON_MODEL_FEATURE_COUNT = LLAZY_RESOLVER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCOMMON_MODEL___ERESOLVE_PROXY__INTERNALEOBJECT = LLAZY_RESOLVER___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LCommon Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCOMMON_MODEL_OPERATION_COUNT = LLAZY_RESOLVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LPackageImpl <em>LPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LPackageImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLPackage()
	 * @generated
	 */
	int LPACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPACKAGE__NAME = LLAZY_RESOLVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPACKAGE__IMPORTS = LLAZY_RESOLVER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPACKAGE_FEATURE_COUNT = LLAZY_RESOLVER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPACKAGE___ERESOLVE_PROXY__INTERNALEOBJECT = LLAZY_RESOLVER___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPACKAGE_OPERATION_COUNT = LLAZY_RESOLVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LTypedPackageImpl <em>LTyped Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LTypedPackageImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLTypedPackage()
	 * @generated
	 */
	int LTYPED_PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTYPED_PACKAGE__NAME = LPACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTYPED_PACKAGE__IMPORTS = LPACKAGE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTYPED_PACKAGE__TYPES = LPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LTyped Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTYPED_PACKAGE_FEATURE_COUNT = LPACKAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTYPED_PACKAGE___ERESOLVE_PROXY__INTERNALEOBJECT = LPACKAGE___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The operation id for the '<em>Get Resource Simple Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTYPED_PACKAGE___GET_RESOURCE_SIMPLE_NAME = LPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>LTyped Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTYPED_PACKAGE_OPERATION_COUNT = LPACKAGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LImportImpl <em>LImport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LImportImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLImport()
	 * @generated
	 */
	int LIMPORT = 4;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>LImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>LImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LAnnotationTargetImpl <em>LAnnotation Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LAnnotationTargetImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLAnnotationTarget()
	 * @generated
	 */
	int LANNOTATION_TARGET = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANNOTATION_TARGET__ANNOTATIONS = LLAZY_RESOLVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LAnnotation Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANNOTATION_TARGET_FEATURE_COUNT = LLAZY_RESOLVER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANNOTATION_TARGET___ERESOLVE_PROXY__INTERNALEOBJECT = LLAZY_RESOLVER___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LAnnotation Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANNOTATION_TARGET_OPERATION_COUNT = LLAZY_RESOLVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LTypeImpl <em>LType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LTypeImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLType()
	 * @generated
	 */
	int LTYPE = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTYPE__ANNOTATIONS = LANNOTATION_TARGET__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTYPE__NAME = LANNOTATION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTYPE__ANNOTATION_INFO = LANNOTATION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTYPE_FEATURE_COUNT = LANNOTATION_TARGET_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTYPE___ERESOLVE_PROXY__INTERNALEOBJECT = LANNOTATION_TARGET___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The operation id for the '<em>Get Resolved Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTYPE___GET_RESOLVED_ANNOTATIONS = LANNOTATION_TARGET_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>LType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTYPE_OPERATION_COUNT = LANNOTATION_TARGET_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LAnnotationDefImpl <em>LAnnotation Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LAnnotationDefImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLAnnotationDef()
	 * @generated
	 */
	int LANNOTATION_DEF = 6;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANNOTATION_DEF__EXCLUDE = LLAZY_RESOLVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANNOTATION_DEF__ANNOTATION = LLAZY_RESOLVER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LAnnotation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANNOTATION_DEF_FEATURE_COUNT = LLAZY_RESOLVER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANNOTATION_DEF___ERESOLVE_PROXY__INTERNALEOBJECT = LLAZY_RESOLVER___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LAnnotation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANNOTATION_DEF_OPERATION_COUNT = LLAZY_RESOLVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LScalarTypeImpl <em>LScalar Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LScalarTypeImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLScalarType()
	 * @generated
	 */
	int LSCALAR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LSCALAR_TYPE__ANNOTATIONS = LTYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LSCALAR_TYPE__NAME = LTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LSCALAR_TYPE__ANNOTATION_INFO = LTYPE__ANNOTATION_INFO;

	/**
	 * The number of structural features of the '<em>LScalar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LSCALAR_TYPE_FEATURE_COUNT = LTYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LSCALAR_TYPE___ERESOLVE_PROXY__INTERNALEOBJECT = LTYPE___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The operation id for the '<em>Get Resolved Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LSCALAR_TYPE___GET_RESOLVED_ANNOTATIONS = LTYPE___GET_RESOLVED_ANNOTATIONS;

	/**
	 * The number of operations of the '<em>LScalar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LSCALAR_TYPE_OPERATION_COUNT = LTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDataTypeImpl <em>LData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LDataTypeImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDataType()
	 * @generated
	 */
	int LDATA_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE__ANNOTATIONS = LSCALAR_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE__NAME = LSCALAR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE__ANNOTATION_INFO = LSCALAR_TYPE__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Jvm Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE__JVM_TYPE_REFERENCE = LSCALAR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>As Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE__AS_PRIMITIVE = LSCALAR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE__DATE = LSCALAR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>As Blob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE__AS_BLOB = LSCALAR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE__LENGTH = LSCALAR_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Date Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE__DATE_TYPE = LSCALAR_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Synthetic Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE__SYNTHETIC_FLAG = LSCALAR_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Synthetic Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE__SYNTHETIC_SELECTOR = LSCALAR_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Synthetic Type Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE__SYNTHETIC_TYPE_REFERENCE = LSCALAR_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Synthetic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE__SYNTHETIC_TYPE = LSCALAR_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE__CONSTRAINTS = LSCALAR_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>LData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE_FEATURE_COUNT = LSCALAR_TYPE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE___ERESOLVE_PROXY__INTERNALEOBJECT = LSCALAR_TYPE___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The operation id for the '<em>Get Resolved Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE___GET_RESOLVED_ANNOTATIONS = LSCALAR_TYPE___GET_RESOLVED_ANNOTATIONS;

	/**
	 * The number of operations of the '<em>LData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATA_TYPE_OPERATION_COUNT = LSCALAR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LEnumImpl <em>LEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LEnumImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLEnum()
	 * @generated
	 */
	int LENUM = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM__ANNOTATIONS = LSCALAR_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM__NAME = LSCALAR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM__ANNOTATION_INFO = LSCALAR_TYPE__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM__LITERALS = LSCALAR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM_FEATURE_COUNT = LSCALAR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM___ERESOLVE_PROXY__INTERNALEOBJECT = LSCALAR_TYPE___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The operation id for the '<em>Get Resolved Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM___GET_RESOLVED_ANNOTATIONS = LSCALAR_TYPE___GET_RESOLVED_ANNOTATIONS;

	/**
	 * The number of operations of the '<em>LEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM_OPERATION_COUNT = LSCALAR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LEnumLiteralImpl <em>LEnum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LEnumLiteralImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLEnumLiteral()
	 * @generated
	 */
	int LENUM_LITERAL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM_LITERAL__NAME = LLAZY_RESOLVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM_LITERAL__DEFAULT = LLAZY_RESOLVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM_LITERAL__NULL = LLAZY_RESOLVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM_LITERAL__VALUE = LLAZY_RESOLVER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>LEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM_LITERAL_FEATURE_COUNT = LLAZY_RESOLVER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM_LITERAL___ERESOLVE_PROXY__INTERNALEOBJECT = LLAZY_RESOLVER___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENUM_LITERAL_OPERATION_COUNT = LLAZY_RESOLVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LClassImpl <em>LClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LClassImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLClass()
	 * @generated
	 */
	int LCLASS = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCLASS__ANNOTATIONS = LTYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCLASS__NAME = LTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCLASS__ANNOTATION_INFO = LTYPE__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCLASS__ABSTRACT = LTYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCLASS__SERIALIZABLE = LTYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCLASS__SHORT_NAME = LTYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCLASS_FEATURE_COUNT = LTYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCLASS___ERESOLVE_PROXY__INTERNALEOBJECT = LTYPE___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The operation id for the '<em>Get Resolved Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCLASS___GET_RESOLVED_ANNOTATIONS = LTYPE___GET_RESOLVED_ANNOTATIONS;

	/**
	 * The number of operations of the '<em>LClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCLASS_OPERATION_COUNT = LTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.LFeaturesHolder <em>LFeatures Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.LFeaturesHolder
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLFeaturesHolder()
	 * @generated
	 */
	int LFEATURES_HOLDER = 13;

	/**
	 * The number of structural features of the '<em>LFeatures Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFEATURES_HOLDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFEATURES_HOLDER___GET_FEATURES = 0;

	/**
	 * The operation id for the '<em>Get All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFEATURES_HOLDER___GET_ALL_FEATURES = 1;

	/**
	 * The number of operations of the '<em>LFeatures Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFEATURES_HOLDER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.LFeature <em>LFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.LFeature
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLFeature()
	 * @generated
	 */
	int LFEATURE = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFEATURE__ANNOTATIONS = LANNOTATION_TARGET__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFEATURE__NAME = LANNOTATION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFEATURE__MULTIPLICITY = LANNOTATION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFEATURE__ANNOTATION_INFO = LANNOTATION_TARGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFEATURE_FEATURE_COUNT = LANNOTATION_TARGET_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFEATURE___ERESOLVE_PROXY__INTERNALEOBJECT = LANNOTATION_TARGET___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The operation id for the '<em>Get Resolved Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFEATURE___GET_RESOLVED_ANNOTATIONS = LANNOTATION_TARGET_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>LFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LFEATURE_OPERATION_COUNT = LANNOTATION_TARGET_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.LReference <em>LReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.LReference
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLReference()
	 * @generated
	 */
	int LREFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LREFERENCE__ANNOTATIONS = LFEATURE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LREFERENCE__NAME = LFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LREFERENCE__MULTIPLICITY = LFEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LREFERENCE__ANNOTATION_INFO = LFEATURE__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LREFERENCE__LAZY = LFEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cascading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LREFERENCE__CASCADING = LFEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LREFERENCE__PROPERTIES = LFEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LREFERENCE_FEATURE_COUNT = LFEATURE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LREFERENCE___ERESOLVE_PROXY__INTERNALEOBJECT = LFEATURE___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The operation id for the '<em>Get Resolved Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LREFERENCE___GET_RESOLVED_ANNOTATIONS = LFEATURE___GET_RESOLVED_ANNOTATIONS;

	/**
	 * The number of operations of the '<em>LReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LREFERENCE_OPERATION_COUNT = LFEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.LAttribute <em>LAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLAttribute()
	 * @generated
	 */
	int LATTRIBUTE = 16;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__ANNOTATIONS = LFEATURE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__NAME = LFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__MULTIPLICITY = LFEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__ANNOTATION_INFO = LFEATURE__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__ID = LFEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__UUID = LFEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__VERSION = LFEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__LAZY = LFEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cascading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__CASCADING = LFEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__TRANSIENT = LFEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__DERIVED = LFEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__DIRTY = LFEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Domain Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__DOMAIN_KEY = LFEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Domain Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__DOMAIN_DESCRIPTION = LFEATURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Derived Getter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__DERIVED_GETTER_EXPRESSION = LFEATURE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__TYPE = LFEATURE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Type Jvm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__TYPE_JVM = LFEATURE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE__PROPERTIES = LFEATURE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>LAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE_FEATURE_COUNT = LFEATURE_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE___ERESOLVE_PROXY__INTERNALEOBJECT = LFEATURE___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The operation id for the '<em>Get Resolved Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE___GET_RESOLVED_ANNOTATIONS = LFEATURE___GET_RESOLVED_ANNOTATIONS;

	/**
	 * The number of operations of the '<em>LAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE_OPERATION_COUNT = LFEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LKeyAndValueImpl <em>LKey And Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LKeyAndValueImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLKeyAndValue()
	 * @generated
	 */
	int LKEY_AND_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LKEY_AND_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LKEY_AND_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>LKey And Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LKEY_AND_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>LKey And Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LKEY_AND_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LOperationImpl <em>LOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LOperationImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLOperation()
	 * @generated
	 */
	int LOPERATION = 18;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOPERATION__ANNOTATIONS = LANNOTATION_TARGET__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOPERATION__MODIFIER = LANNOTATION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOPERATION__TYPE = LANNOTATION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOPERATION__PARAMS = LANNOTATION_TARGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOPERATION__BODY = LANNOTATION_TARGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>LOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOPERATION_FEATURE_COUNT = LANNOTATION_TARGET_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOPERATION___ERESOLVE_PROXY__INTERNALEOBJECT = LANNOTATION_TARGET___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The operation id for the '<em>Get Resolved Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOPERATION___GET_RESOLVED_ANNOTATIONS = LANNOTATION_TARGET_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>LOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOPERATION_OPERATION_COUNT = LANNOTATION_TARGET_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LModifierImpl <em>LModifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LModifierImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLModifier()
	 * @generated
	 */
	int LMODIFIER = 19;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMODIFIER__FINAL = LLAZY_RESOLVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMODIFIER__STATIC = LLAZY_RESOLVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMODIFIER__VISIBILITY = LLAZY_RESOLVER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LModifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMODIFIER_FEATURE_COUNT = LLAZY_RESOLVER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMODIFIER___ERESOLVE_PROXY__INTERNALEOBJECT = LLAZY_RESOLVER___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LModifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMODIFIER_OPERATION_COUNT = LLAZY_RESOLVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LMultiplicityImpl <em>LMultiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LMultiplicityImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLMultiplicity()
	 * @generated
	 */
	int LMULTIPLICITY = 20;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMULTIPLICITY__LOWER = 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMULTIPLICITY__UPPER = 1;

	/**
	 * The feature id for the '<em><b>To Multiplicity String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMULTIPLICITY__TO_MULTIPLICITY_STRING = 2;

	/**
	 * The number of structural features of the '<em>LMultiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMULTIPLICITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>LMultiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMULTIPLICITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LConstraintsImpl <em>LConstraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LConstraintsImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLConstraints()
	 * @generated
	 */
	int LCONSTRAINTS = 21;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCONSTRAINTS__CONSTRAINTS = LLAZY_RESOLVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LConstraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCONSTRAINTS_FEATURE_COUNT = LLAZY_RESOLVER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCONSTRAINTS___ERESOLVE_PROXY__INTERNALEOBJECT = LLAZY_RESOLVER___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LConstraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCONSTRAINTS_OPERATION_COUNT = LLAZY_RESOLVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.LConstraint <em>LConstraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.LConstraint
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLConstraint()
	 * @generated
	 */
	int LCONSTRAINT = 22;

	/**
	 * The number of structural features of the '<em>LConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCONSTRAINT_FEATURE_COUNT = LLAZY_RESOLVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT = LLAZY_RESOLVER___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCONSTRAINT_OPERATION_COUNT = LLAZY_RESOLVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.LDatatypeConstraint <em>LDatatype Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.LDatatypeConstraint
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDatatypeConstraint()
	 * @generated
	 */
	int LDATATYPE_CONSTRAINT = 23;

	/**
	 * The number of structural features of the '<em>LDatatype Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATATYPE_CONSTRAINT_FEATURE_COUNT = LCONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATATYPE_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT = LCONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LDatatype Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDATATYPE_CONSTRAINT_OPERATION_COUNT = LCONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCAssertFalseImpl <em>LDt CAssert False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCAssertFalseImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCAssertFalse()
	 * @generated
	 */
	int LDT_CASSERT_FALSE = 24;

	/**
	 * The number of structural features of the '<em>LDt CAssert False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CASSERT_FALSE_FEATURE_COUNT = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CASSERT_FALSE___ERESOLVE_PROXY__INTERNALEOBJECT = LDATATYPE_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LDt CAssert False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CASSERT_FALSE_OPERATION_COUNT = LDATATYPE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCAssertTrueImpl <em>LDt CAssert True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCAssertTrueImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCAssertTrue()
	 * @generated
	 */
	int LDT_CASSERT_TRUE = 25;

	/**
	 * The number of structural features of the '<em>LDt CAssert True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CASSERT_TRUE_FEATURE_COUNT = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CASSERT_TRUE___ERESOLVE_PROXY__INTERNALEOBJECT = LDATATYPE_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LDt CAssert True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CASSERT_TRUE_OPERATION_COUNT = LDATATYPE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCDecimalMaxImpl <em>LDt CDecimal Max</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCDecimalMaxImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCDecimalMax()
	 * @generated
	 */
	int LDT_CDECIMAL_MAX = 26;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CDECIMAL_MAX__MAX = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LDt CDecimal Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CDECIMAL_MAX_FEATURE_COUNT = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CDECIMAL_MAX___ERESOLVE_PROXY__INTERNALEOBJECT = LDATATYPE_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LDt CDecimal Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CDECIMAL_MAX_OPERATION_COUNT = LDATATYPE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCDecimalMinImpl <em>LDt CDecimal Min</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCDecimalMinImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCDecimalMin()
	 * @generated
	 */
	int LDT_CDECIMAL_MIN = 27;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CDECIMAL_MIN__MIN = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LDt CDecimal Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CDECIMAL_MIN_FEATURE_COUNT = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CDECIMAL_MIN___ERESOLVE_PROXY__INTERNALEOBJECT = LDATATYPE_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LDt CDecimal Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CDECIMAL_MIN_OPERATION_COUNT = LDATATYPE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCDigitsImpl <em>LDt CDigits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCDigitsImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCDigits()
	 * @generated
	 */
	int LDT_CDIGITS = 28;

	/**
	 * The feature id for the '<em><b>Int Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CDIGITS__INT_DIGITS = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fraction Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CDIGITS__FRACTION_DIGITS = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LDt CDigits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CDIGITS_FEATURE_COUNT = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CDIGITS___ERESOLVE_PROXY__INTERNALEOBJECT = LDATATYPE_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LDt CDigits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CDIGITS_OPERATION_COUNT = LDATATYPE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCFutureImpl <em>LDt CFuture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCFutureImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCFuture()
	 * @generated
	 */
	int LDT_CFUTURE = 29;

	/**
	 * The number of structural features of the '<em>LDt CFuture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CFUTURE_FEATURE_COUNT = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CFUTURE___ERESOLVE_PROXY__INTERNALEOBJECT = LDATATYPE_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LDt CFuture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CFUTURE_OPERATION_COUNT = LDATATYPE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCPastImpl <em>LDt CPast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCPastImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCPast()
	 * @generated
	 */
	int LDT_CPAST = 30;

	/**
	 * The number of structural features of the '<em>LDt CPast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CPAST_FEATURE_COUNT = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CPAST___ERESOLVE_PROXY__INTERNALEOBJECT = LDATATYPE_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LDt CPast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CPAST_OPERATION_COUNT = LDATATYPE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCNumericMaxImpl <em>LDt CNumeric Max</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCNumericMaxImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCNumericMax()
	 * @generated
	 */
	int LDT_CNUMERIC_MAX = 31;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CNUMERIC_MAX__MAX = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LDt CNumeric Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CNUMERIC_MAX_FEATURE_COUNT = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CNUMERIC_MAX___ERESOLVE_PROXY__INTERNALEOBJECT = LDATATYPE_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LDt CNumeric Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CNUMERIC_MAX_OPERATION_COUNT = LDATATYPE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCNumericMinImpl <em>LDt CNumeric Min</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCNumericMinImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCNumericMin()
	 * @generated
	 */
	int LDT_CNUMERIC_MIN = 32;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CNUMERIC_MIN__MIN = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LDt CNumeric Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CNUMERIC_MIN_FEATURE_COUNT = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CNUMERIC_MIN___ERESOLVE_PROXY__INTERNALEOBJECT = LDATATYPE_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LDt CNumeric Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CNUMERIC_MIN_OPERATION_COUNT = LDATATYPE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCNotNullImpl <em>LDt CNot Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCNotNullImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCNotNull()
	 * @generated
	 */
	int LDT_CNOT_NULL = 33;

	/**
	 * The number of structural features of the '<em>LDt CNot Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CNOT_NULL_FEATURE_COUNT = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CNOT_NULL___ERESOLVE_PROXY__INTERNALEOBJECT = LDATATYPE_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LDt CNot Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CNOT_NULL_OPERATION_COUNT = LDATATYPE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCNullImpl <em>LDt CNull</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCNullImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCNull()
	 * @generated
	 */
	int LDT_CNULL = 34;

	/**
	 * The number of structural features of the '<em>LDt CNull</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CNULL_FEATURE_COUNT = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CNULL___ERESOLVE_PROXY__INTERNALEOBJECT = LDATATYPE_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LDt CNull</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CNULL_OPERATION_COUNT = LDATATYPE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCRegExImpl <em>LDt CReg Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCRegExImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCRegEx()
	 * @generated
	 */
	int LDT_CREG_EX = 35;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CREG_EX__PATTERN = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LDt CReg Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CREG_EX_FEATURE_COUNT = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CREG_EX___ERESOLVE_PROXY__INTERNALEOBJECT = LDATATYPE_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LDt CReg Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CREG_EX_OPERATION_COUNT = LDATATYPE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCSizeImpl <em>LDt CSize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCSizeImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCSize()
	 * @generated
	 */
	int LDT_CSIZE = 36;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CSIZE__MIN = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CSIZE__MAX = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LDt CSize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CSIZE_FEATURE_COUNT = LDATATYPE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CSIZE___ERESOLVE_PROXY__INTERNALEOBJECT = LDATATYPE_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LDt CSize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDT_CSIZE_OPERATION_COUNT = LDATATYPE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.impl.LAttributeMatchingConstraintImpl <em>LAttribute Matching Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.impl.LAttributeMatchingConstraintImpl
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLAttributeMatchingConstraint()
	 * @generated
	 */
	int LATTRIBUTE_MATCHING_CONSTRAINT = 37;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE_MATCHING_CONSTRAINT__ATTRIBUTE = LCONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE_MATCHING_CONSTRAINT__COMPARATOR_TYPE = LCONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Matching Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE_MATCHING_CONSTRAINT__MATCHING_VALUE = LCONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Matching Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE_MATCHING_CONSTRAINT__MATCHING_LITERAL = LCONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>LAttribute Matching Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE_MATCHING_CONSTRAINT_FEATURE_COUNT = LCONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EResolve Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE_MATCHING_CONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT = LCONSTRAINT___ERESOLVE_PROXY__INTERNALEOBJECT;

	/**
	 * The number of operations of the '<em>LAttribute Matching Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATTRIBUTE_MATCHING_CONSTRAINT_OPERATION_COUNT = LCONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.LDateType <em>LDate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.LDateType
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDateType()
	 * @generated
	 */
	int LDATE_TYPE = 38;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.LVisibility <em>LVisibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.LVisibility
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLVisibility()
	 * @generated
	 */
	int LVISIBILITY = 39;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.LLowerBound <em>LLower Bound</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.LLowerBound
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLLowerBound()
	 * @generated
	 */
	int LLOWER_BOUND = 40;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.LUpperBound <em>LUpper Bound</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.LUpperBound
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLUpperBound()
	 * @generated
	 */
	int LUPPER_BOUND = 41;

	/**
	 * The meta object id for the '{@link org.lunifera.dsl.semantic.common.types.LComparatorType <em>LComparator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.dsl.semantic.common.types.LComparatorType
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLComparatorType()
	 * @generated
	 */
	int LCOMPARATOR_TYPE = 42;

	/**
	 * The meta object id for the '<em>Operations List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getOperationsList()
	 * @generated
	 */
	int OPERATIONS_LIST = 43;

	/**
	 * The meta object id for the '<em>Features List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getFeaturesList()
	 * @generated
	 */
	int FEATURES_LIST = 44;

	/**
	 * The meta object id for the '<em>Annotation List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EList
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getAnnotationList()
	 * @generated
	 */
	int ANNOTATION_LIST = 45;

	/**
	 * The meta object id for the '<em>Internal EObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.InternalEObject
	 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getInternalEObject()
	 * @generated
	 */
	int INTERNAL_EOBJECT = 46;


	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LCommonModel <em>LCommon Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LCommon Model</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LCommonModel
	 * @generated
	 */
	EClass getLCommonModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.dsl.semantic.common.types.LCommonModel#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LCommonModel#getPackages()
	 * @see #getLCommonModel()
	 * @generated
	 */
	EReference getLCommonModel_Packages();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LLazyResolver <em>LLazy Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LLazy Resolver</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LLazyResolver
	 * @generated
	 */
	EClass getLLazyResolver();

	/**
	 * Returns the meta object for the '{@link org.lunifera.dsl.semantic.common.types.LLazyResolver#eResolveProxy(org.eclipse.emf.ecore.InternalEObject) <em>EResolve Proxy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EResolve Proxy</em>' operation.
	 * @see org.lunifera.dsl.semantic.common.types.LLazyResolver#eResolveProxy(org.eclipse.emf.ecore.InternalEObject)
	 * @generated
	 */
	EOperation getLLazyResolver__EResolveProxy__InternalEObject();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LPackage <em>LPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LPackage</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LPackage
	 * @generated
	 */
	EClass getLPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LPackage#getName()
	 * @see #getLPackage()
	 * @generated
	 */
	EAttribute getLPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.dsl.semantic.common.types.LPackage#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LPackage#getImports()
	 * @see #getLPackage()
	 * @generated
	 */
	EReference getLPackage_Imports();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LTypedPackage <em>LTyped Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTyped Package</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LTypedPackage
	 * @generated
	 */
	EClass getLTypedPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.dsl.semantic.common.types.LTypedPackage#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LTypedPackage#getTypes()
	 * @see #getLTypedPackage()
	 * @generated
	 */
	EReference getLTypedPackage_Types();

	/**
	 * Returns the meta object for the '{@link org.lunifera.dsl.semantic.common.types.LTypedPackage#getResourceSimpleName() <em>Get Resource Simple Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource Simple Name</em>' operation.
	 * @see org.lunifera.dsl.semantic.common.types.LTypedPackage#getResourceSimpleName()
	 * @generated
	 */
	EOperation getLTypedPackage__GetResourceSimpleName();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LImport <em>LImport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LImport</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LImport
	 * @generated
	 */
	EClass getLImport();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LImport#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LImport#getImportedNamespace()
	 * @see #getLImport()
	 * @generated
	 */
	EAttribute getLImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LType <em>LType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LType</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LType
	 * @generated
	 */
	EClass getLType();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LType#getName()
	 * @see #getLType()
	 * @generated
	 */
	EAttribute getLType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.dsl.semantic.common.types.LType#getAnnotationInfo <em>Annotation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation Info</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LType#getAnnotationInfo()
	 * @see #getLType()
	 * @generated
	 */
	EReference getLType_AnnotationInfo();

	/**
	 * Returns the meta object for the '{@link org.lunifera.dsl.semantic.common.types.LType#getResolvedAnnotations() <em>Get Resolved Annotations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resolved Annotations</em>' operation.
	 * @see org.lunifera.dsl.semantic.common.types.LType#getResolvedAnnotations()
	 * @generated
	 */
	EOperation getLType__GetResolvedAnnotations();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LAnnotationDef <em>LAnnotation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LAnnotation Def</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAnnotationDef
	 * @generated
	 */
	EClass getLAnnotationDef();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LAnnotationDef#isExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAnnotationDef#isExclude()
	 * @see #getLAnnotationDef()
	 * @generated
	 */
	EAttribute getLAnnotationDef_Exclude();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.dsl.semantic.common.types.LAnnotationDef#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAnnotationDef#getAnnotation()
	 * @see #getLAnnotationDef()
	 * @generated
	 */
	EReference getLAnnotationDef_Annotation();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LAnnotationTarget <em>LAnnotation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LAnnotation Target</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAnnotationTarget
	 * @generated
	 */
	EClass getLAnnotationTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.dsl.semantic.common.types.LAnnotationTarget#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAnnotationTarget#getAnnotations()
	 * @see #getLAnnotationTarget()
	 * @generated
	 */
	EReference getLAnnotationTarget_Annotations();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LScalarType <em>LScalar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LScalar Type</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LScalarType
	 * @generated
	 */
	EClass getLScalarType();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDataType <em>LData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LData Type</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDataType
	 * @generated
	 */
	EClass getLDataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.dsl.semantic.common.types.LDataType#getJvmTypeReference <em>Jvm Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jvm Type Reference</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDataType#getJvmTypeReference()
	 * @see #getLDataType()
	 * @generated
	 */
	EReference getLDataType_JvmTypeReference();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDataType#isAsPrimitive <em>As Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As Primitive</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDataType#isAsPrimitive()
	 * @see #getLDataType()
	 * @generated
	 */
	EAttribute getLDataType_AsPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDataType#isDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDataType#isDate()
	 * @see #getLDataType()
	 * @generated
	 */
	EAttribute getLDataType_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDataType#isAsBlob <em>As Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As Blob</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDataType#isAsBlob()
	 * @see #getLDataType()
	 * @generated
	 */
	EAttribute getLDataType_AsBlob();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDataType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDataType#getLength()
	 * @see #getLDataType()
	 * @generated
	 */
	EAttribute getLDataType_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDataType#getDateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Type</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDataType#getDateType()
	 * @see #getLDataType()
	 * @generated
	 */
	EAttribute getLDataType_DateType();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDataType#isSyntheticFlag <em>Synthetic Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synthetic Flag</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDataType#isSyntheticFlag()
	 * @see #getLDataType()
	 * @generated
	 */
	EAttribute getLDataType_SyntheticFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDataType#getSyntheticSelector <em>Synthetic Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synthetic Selector</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDataType#getSyntheticSelector()
	 * @see #getLDataType()
	 * @generated
	 */
	EAttribute getLDataType_SyntheticSelector();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.dsl.semantic.common.types.LDataType#getSyntheticTypeReference <em>Synthetic Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synthetic Type Reference</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDataType#getSyntheticTypeReference()
	 * @see #getLDataType()
	 * @generated
	 */
	EReference getLDataType_SyntheticTypeReference();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.dsl.semantic.common.types.LDataType#getSyntheticType <em>Synthetic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synthetic Type</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDataType#getSyntheticType()
	 * @see #getLDataType()
	 * @generated
	 */
	EReference getLDataType_SyntheticType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.dsl.semantic.common.types.LDataType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDataType#getConstraints()
	 * @see #getLDataType()
	 * @generated
	 */
	EReference getLDataType_Constraints();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LEnum <em>LEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LEnum</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LEnum
	 * @generated
	 */
	EClass getLEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.dsl.semantic.common.types.LEnum#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LEnum#getLiterals()
	 * @see #getLEnum()
	 * @generated
	 */
	EReference getLEnum_Literals();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LEnumLiteral <em>LEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LEnum Literal</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LEnumLiteral
	 * @generated
	 */
	EClass getLEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LEnumLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LEnumLiteral#getName()
	 * @see #getLEnumLiteral()
	 * @generated
	 */
	EAttribute getLEnumLiteral_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LEnumLiteral#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LEnumLiteral#isDefault()
	 * @see #getLEnumLiteral()
	 * @generated
	 */
	EAttribute getLEnumLiteral_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LEnumLiteral#isNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LEnumLiteral#isNull()
	 * @see #getLEnumLiteral()
	 * @generated
	 */
	EAttribute getLEnumLiteral_Null();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LEnumLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LEnumLiteral#getValue()
	 * @see #getLEnumLiteral()
	 * @generated
	 */
	EAttribute getLEnumLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LClass <em>LClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LClass</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LClass
	 * @generated
	 */
	EClass getLClass();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LClass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LClass#isAbstract()
	 * @see #getLClass()
	 * @generated
	 */
	EAttribute getLClass_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LClass#isSerializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serializable</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LClass#isSerializable()
	 * @see #getLClass()
	 * @generated
	 */
	EAttribute getLClass_Serializable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LClass#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LClass#getShortName()
	 * @see #getLClass()
	 * @generated
	 */
	EAttribute getLClass_ShortName();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LFeaturesHolder <em>LFeatures Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LFeatures Holder</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LFeaturesHolder
	 * @generated
	 */
	EClass getLFeaturesHolder();

	/**
	 * Returns the meta object for the '{@link org.lunifera.dsl.semantic.common.types.LFeaturesHolder#getFeatures() <em>Get Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Features</em>' operation.
	 * @see org.lunifera.dsl.semantic.common.types.LFeaturesHolder#getFeatures()
	 * @generated
	 */
	EOperation getLFeaturesHolder__GetFeatures();

	/**
	 * Returns the meta object for the '{@link org.lunifera.dsl.semantic.common.types.LFeaturesHolder#getAllFeatures() <em>Get All Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Features</em>' operation.
	 * @see org.lunifera.dsl.semantic.common.types.LFeaturesHolder#getAllFeatures()
	 * @generated
	 */
	EOperation getLFeaturesHolder__GetAllFeatures();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LFeature <em>LFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LFeature</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LFeature
	 * @generated
	 */
	EClass getLFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LFeature#getName()
	 * @see #getLFeature()
	 * @generated
	 */
	EAttribute getLFeature_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.dsl.semantic.common.types.LFeature#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LFeature#getMultiplicity()
	 * @see #getLFeature()
	 * @generated
	 */
	EReference getLFeature_Multiplicity();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.dsl.semantic.common.types.LFeature#getAnnotationInfo <em>Annotation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation Info</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LFeature#getAnnotationInfo()
	 * @see #getLFeature()
	 * @generated
	 */
	EReference getLFeature_AnnotationInfo();

	/**
	 * Returns the meta object for the '{@link org.lunifera.dsl.semantic.common.types.LFeature#getResolvedAnnotations() <em>Get Resolved Annotations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resolved Annotations</em>' operation.
	 * @see org.lunifera.dsl.semantic.common.types.LFeature#getResolvedAnnotations()
	 * @generated
	 */
	EOperation getLFeature__GetResolvedAnnotations();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LReference <em>LReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LReference</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LReference
	 * @generated
	 */
	EClass getLReference();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LReference#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LReference#isLazy()
	 * @see #getLReference()
	 * @generated
	 */
	EAttribute getLReference_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LReference#isCascading <em>Cascading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascading</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LReference#isCascading()
	 * @see #getLReference()
	 * @generated
	 */
	EAttribute getLReference_Cascading();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.dsl.semantic.common.types.LReference#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LReference#getProperties()
	 * @see #getLReference()
	 * @generated
	 */
	EReference getLReference_Properties();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LAttribute <em>LAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LAttribute</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute
	 * @generated
	 */
	EClass getLAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LAttribute#isId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute#isId()
	 * @see #getLAttribute()
	 * @generated
	 */
	EAttribute getLAttribute_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LAttribute#isUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute#isUuid()
	 * @see #getLAttribute()
	 * @generated
	 */
	EAttribute getLAttribute_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LAttribute#isVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute#isVersion()
	 * @see #getLAttribute()
	 * @generated
	 */
	EAttribute getLAttribute_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LAttribute#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute#isLazy()
	 * @see #getLAttribute()
	 * @generated
	 */
	EAttribute getLAttribute_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LAttribute#isCascading <em>Cascading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascading</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute#isCascading()
	 * @see #getLAttribute()
	 * @generated
	 */
	EAttribute getLAttribute_Cascading();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LAttribute#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute#isTransient()
	 * @see #getLAttribute()
	 * @generated
	 */
	EAttribute getLAttribute_Transient();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LAttribute#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute#isDerived()
	 * @see #getLAttribute()
	 * @generated
	 */
	EAttribute getLAttribute_Derived();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LAttribute#isDirty <em>Dirty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dirty</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute#isDirty()
	 * @see #getLAttribute()
	 * @generated
	 */
	EAttribute getLAttribute_Dirty();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LAttribute#isDomainKey <em>Domain Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Key</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute#isDomainKey()
	 * @see #getLAttribute()
	 * @generated
	 */
	EAttribute getLAttribute_DomainKey();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LAttribute#isDomainDescription <em>Domain Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Description</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute#isDomainDescription()
	 * @see #getLAttribute()
	 * @generated
	 */
	EAttribute getLAttribute_DomainDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.dsl.semantic.common.types.LAttribute#getDerivedGetterExpression <em>Derived Getter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived Getter Expression</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute#getDerivedGetterExpression()
	 * @see #getLAttribute()
	 * @generated
	 */
	EReference getLAttribute_DerivedGetterExpression();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.dsl.semantic.common.types.LAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute#getType()
	 * @see #getLAttribute()
	 * @generated
	 */
	EReference getLAttribute_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.dsl.semantic.common.types.LAttribute#getTypeJvm <em>Type Jvm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Jvm</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute#getTypeJvm()
	 * @see #getLAttribute()
	 * @generated
	 */
	EReference getLAttribute_TypeJvm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.dsl.semantic.common.types.LAttribute#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttribute#getProperties()
	 * @see #getLAttribute()
	 * @generated
	 */
	EReference getLAttribute_Properties();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LKeyAndValue <em>LKey And Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LKey And Value</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LKeyAndValue
	 * @generated
	 */
	EClass getLKeyAndValue();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LKeyAndValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LKeyAndValue#getKey()
	 * @see #getLKeyAndValue()
	 * @generated
	 */
	EAttribute getLKeyAndValue_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LKeyAndValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LKeyAndValue#getValue()
	 * @see #getLKeyAndValue()
	 * @generated
	 */
	EAttribute getLKeyAndValue_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LOperation <em>LOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LOperation</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LOperation
	 * @generated
	 */
	EClass getLOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.dsl.semantic.common.types.LOperation#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modifier</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LOperation#getModifier()
	 * @see #getLOperation()
	 * @generated
	 */
	EReference getLOperation_Modifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.dsl.semantic.common.types.LOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LOperation#getType()
	 * @see #getLOperation()
	 * @generated
	 */
	EReference getLOperation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.dsl.semantic.common.types.LOperation#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LOperation#getParams()
	 * @see #getLOperation()
	 * @generated
	 */
	EReference getLOperation_Params();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.dsl.semantic.common.types.LOperation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LOperation#getBody()
	 * @see #getLOperation()
	 * @generated
	 */
	EReference getLOperation_Body();

	/**
	 * Returns the meta object for the '{@link org.lunifera.dsl.semantic.common.types.LOperation#getResolvedAnnotations() <em>Get Resolved Annotations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resolved Annotations</em>' operation.
	 * @see org.lunifera.dsl.semantic.common.types.LOperation#getResolvedAnnotations()
	 * @generated
	 */
	EOperation getLOperation__GetResolvedAnnotations();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LModifier <em>LModifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LModifier</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LModifier
	 * @generated
	 */
	EClass getLModifier();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LModifier#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LModifier#isFinal()
	 * @see #getLModifier()
	 * @generated
	 */
	EAttribute getLModifier_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LModifier#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LModifier#isStatic()
	 * @see #getLModifier()
	 * @generated
	 */
	EAttribute getLModifier_Static();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LModifier#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LModifier#getVisibility()
	 * @see #getLModifier()
	 * @generated
	 */
	EAttribute getLModifier_Visibility();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LMultiplicity <em>LMultiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LMultiplicity</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LMultiplicity
	 * @generated
	 */
	EClass getLMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LMultiplicity#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LMultiplicity#getLower()
	 * @see #getLMultiplicity()
	 * @generated
	 */
	EAttribute getLMultiplicity_Lower();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LMultiplicity#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LMultiplicity#getUpper()
	 * @see #getLMultiplicity()
	 * @generated
	 */
	EAttribute getLMultiplicity_Upper();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LMultiplicity#getToMultiplicityString <em>To Multiplicity String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Multiplicity String</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LMultiplicity#getToMultiplicityString()
	 * @see #getLMultiplicity()
	 * @generated
	 */
	EAttribute getLMultiplicity_ToMultiplicityString();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LConstraints <em>LConstraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LConstraints</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LConstraints
	 * @generated
	 */
	EClass getLConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.dsl.semantic.common.types.LConstraints#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LConstraints#getConstraints()
	 * @see #getLConstraints()
	 * @generated
	 */
	EReference getLConstraints_Constraints();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LConstraint <em>LConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LConstraint</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LConstraint
	 * @generated
	 */
	EClass getLConstraint();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDatatypeConstraint <em>LDatatype Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDatatype Constraint</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDatatypeConstraint
	 * @generated
	 */
	EClass getLDatatypeConstraint();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDtCAssertFalse <em>LDt CAssert False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDt CAssert False</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCAssertFalse
	 * @generated
	 */
	EClass getLDtCAssertFalse();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDtCAssertTrue <em>LDt CAssert True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDt CAssert True</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCAssertTrue
	 * @generated
	 */
	EClass getLDtCAssertTrue();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDtCDecimalMax <em>LDt CDecimal Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDt CDecimal Max</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCDecimalMax
	 * @generated
	 */
	EClass getLDtCDecimalMax();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDtCDecimalMax#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCDecimalMax#getMax()
	 * @see #getLDtCDecimalMax()
	 * @generated
	 */
	EAttribute getLDtCDecimalMax_Max();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDtCDecimalMin <em>LDt CDecimal Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDt CDecimal Min</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCDecimalMin
	 * @generated
	 */
	EClass getLDtCDecimalMin();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDtCDecimalMin#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCDecimalMin#getMin()
	 * @see #getLDtCDecimalMin()
	 * @generated
	 */
	EAttribute getLDtCDecimalMin_Min();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDtCDigits <em>LDt CDigits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDt CDigits</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCDigits
	 * @generated
	 */
	EClass getLDtCDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDtCDigits#getIntDigits <em>Int Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Digits</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCDigits#getIntDigits()
	 * @see #getLDtCDigits()
	 * @generated
	 */
	EAttribute getLDtCDigits_IntDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDtCDigits#getFractionDigits <em>Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fraction Digits</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCDigits#getFractionDigits()
	 * @see #getLDtCDigits()
	 * @generated
	 */
	EAttribute getLDtCDigits_FractionDigits();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDtCFuture <em>LDt CFuture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDt CFuture</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCFuture
	 * @generated
	 */
	EClass getLDtCFuture();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDtCPast <em>LDt CPast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDt CPast</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCPast
	 * @generated
	 */
	EClass getLDtCPast();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDtCNumericMax <em>LDt CNumeric Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDt CNumeric Max</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCNumericMax
	 * @generated
	 */
	EClass getLDtCNumericMax();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDtCNumericMax#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCNumericMax#getMax()
	 * @see #getLDtCNumericMax()
	 * @generated
	 */
	EAttribute getLDtCNumericMax_Max();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDtCNumericMin <em>LDt CNumeric Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDt CNumeric Min</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCNumericMin
	 * @generated
	 */
	EClass getLDtCNumericMin();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDtCNumericMin#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCNumericMin#getMin()
	 * @see #getLDtCNumericMin()
	 * @generated
	 */
	EAttribute getLDtCNumericMin_Min();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDtCNotNull <em>LDt CNot Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDt CNot Null</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCNotNull
	 * @generated
	 */
	EClass getLDtCNotNull();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDtCNull <em>LDt CNull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDt CNull</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCNull
	 * @generated
	 */
	EClass getLDtCNull();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDtCRegEx <em>LDt CReg Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDt CReg Ex</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCRegEx
	 * @generated
	 */
	EClass getLDtCRegEx();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDtCRegEx#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCRegEx#getPattern()
	 * @see #getLDtCRegEx()
	 * @generated
	 */
	EAttribute getLDtCRegEx_Pattern();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LDtCSize <em>LDt CSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDt CSize</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCSize
	 * @generated
	 */
	EClass getLDtCSize();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDtCSize#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCSize#getMin()
	 * @see #getLDtCSize()
	 * @generated
	 */
	EAttribute getLDtCSize_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LDtCSize#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDtCSize#getMax()
	 * @see #getLDtCSize()
	 * @generated
	 */
	EAttribute getLDtCSize_Max();

	/**
	 * Returns the meta object for class '{@link org.lunifera.dsl.semantic.common.types.LAttributeMatchingConstraint <em>LAttribute Matching Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LAttribute Matching Constraint</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttributeMatchingConstraint
	 * @generated
	 */
	EClass getLAttributeMatchingConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.dsl.semantic.common.types.LAttributeMatchingConstraint#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttributeMatchingConstraint#getAttribute()
	 * @see #getLAttributeMatchingConstraint()
	 * @generated
	 */
	EReference getLAttributeMatchingConstraint_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LAttributeMatchingConstraint#getComparatorType <em>Comparator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator Type</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttributeMatchingConstraint#getComparatorType()
	 * @see #getLAttributeMatchingConstraint()
	 * @generated
	 */
	EAttribute getLAttributeMatchingConstraint_ComparatorType();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.dsl.semantic.common.types.LAttributeMatchingConstraint#getMatchingValue <em>Matching Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matching Value</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttributeMatchingConstraint#getMatchingValue()
	 * @see #getLAttributeMatchingConstraint()
	 * @generated
	 */
	EAttribute getLAttributeMatchingConstraint_MatchingValue();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.dsl.semantic.common.types.LAttributeMatchingConstraint#getMatchingLiteral <em>Matching Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matching Literal</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LAttributeMatchingConstraint#getMatchingLiteral()
	 * @see #getLAttributeMatchingConstraint()
	 * @generated
	 */
	EReference getLAttributeMatchingConstraint_MatchingLiteral();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.dsl.semantic.common.types.LDateType <em>LDate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LDate Type</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LDateType
	 * @generated
	 */
	EEnum getLDateType();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.dsl.semantic.common.types.LVisibility <em>LVisibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LVisibility</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LVisibility
	 * @generated
	 */
	EEnum getLVisibility();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.dsl.semantic.common.types.LLowerBound <em>LLower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LLower Bound</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LLowerBound
	 * @generated
	 */
	EEnum getLLowerBound();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.dsl.semantic.common.types.LUpperBound <em>LUpper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LUpper Bound</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LUpperBound
	 * @generated
	 */
	EEnum getLUpperBound();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.dsl.semantic.common.types.LComparatorType <em>LComparator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LComparator Type</em>'.
	 * @see org.lunifera.dsl.semantic.common.types.LComparatorType
	 * @generated
	 */
	EEnum getLComparatorType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Operations List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operations List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List<org.lunifera.dsl.semantic.common.types.LOperation>"
	 * @generated
	 */
	EDataType getOperationsList();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Features List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Features List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List<? extends org.lunifera.dsl.semantic.common.types.LFeature>"
	 * @generated
	 */
	EDataType getFeaturesList();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EList <em>Annotation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Annotation List</em>'.
	 * @see org.eclipse.emf.common.util.EList
	 * @model instanceClass="org.eclipse.emf.common.util.EList<org.lunifera.dsl.semantic.common.types.LAnnotationDef>"
	 * @generated
	 */
	EDataType getAnnotationList();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.InternalEObject <em>Internal EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Internal EObject</em>'.
	 * @see org.eclipse.emf.ecore.InternalEObject
	 * @model instanceClass="org.eclipse.emf.ecore.InternalEObject"
	 * @generated
	 */
	EDataType getInternalEObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LunTypesFactory getLunTypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LCommonModelImpl <em>LCommon Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LCommonModelImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLCommonModel()
		 * @generated
		 */
		EClass LCOMMON_MODEL = eINSTANCE.getLCommonModel();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LCOMMON_MODEL__PACKAGES = eINSTANCE.getLCommonModel_Packages();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LLazyResolverImpl <em>LLazy Resolver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LLazyResolverImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLLazyResolver()
		 * @generated
		 */
		EClass LLAZY_RESOLVER = eINSTANCE.getLLazyResolver();

		/**
		 * The meta object literal for the '<em><b>EResolve Proxy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LLAZY_RESOLVER___ERESOLVE_PROXY__INTERNALEOBJECT = eINSTANCE.getLLazyResolver__EResolveProxy__InternalEObject();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LPackageImpl <em>LPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LPackageImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLPackage()
		 * @generated
		 */
		EClass LPACKAGE = eINSTANCE.getLPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LPACKAGE__NAME = eINSTANCE.getLPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LPACKAGE__IMPORTS = eINSTANCE.getLPackage_Imports();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LTypedPackageImpl <em>LTyped Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LTypedPackageImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLTypedPackage()
		 * @generated
		 */
		EClass LTYPED_PACKAGE = eINSTANCE.getLTypedPackage();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTYPED_PACKAGE__TYPES = eINSTANCE.getLTypedPackage_Types();

		/**
		 * The meta object literal for the '<em><b>Get Resource Simple Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LTYPED_PACKAGE___GET_RESOURCE_SIMPLE_NAME = eINSTANCE.getLTypedPackage__GetResourceSimpleName();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LImportImpl <em>LImport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LImportImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLImport()
		 * @generated
		 */
		EClass LIMPORT = eINSTANCE.getLImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMPORT__IMPORTED_NAMESPACE = eINSTANCE.getLImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LTypeImpl <em>LType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LTypeImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLType()
		 * @generated
		 */
		EClass LTYPE = eINSTANCE.getLType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LTYPE__NAME = eINSTANCE.getLType_Name();

		/**
		 * The meta object literal for the '<em><b>Annotation Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTYPE__ANNOTATION_INFO = eINSTANCE.getLType_AnnotationInfo();

		/**
		 * The meta object literal for the '<em><b>Get Resolved Annotations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LTYPE___GET_RESOLVED_ANNOTATIONS = eINSTANCE.getLType__GetResolvedAnnotations();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LAnnotationDefImpl <em>LAnnotation Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LAnnotationDefImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLAnnotationDef()
		 * @generated
		 */
		EClass LANNOTATION_DEF = eINSTANCE.getLAnnotationDef();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANNOTATION_DEF__EXCLUDE = eINSTANCE.getLAnnotationDef_Exclude();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANNOTATION_DEF__ANNOTATION = eINSTANCE.getLAnnotationDef_Annotation();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LAnnotationTargetImpl <em>LAnnotation Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LAnnotationTargetImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLAnnotationTarget()
		 * @generated
		 */
		EClass LANNOTATION_TARGET = eINSTANCE.getLAnnotationTarget();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANNOTATION_TARGET__ANNOTATIONS = eINSTANCE.getLAnnotationTarget_Annotations();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LScalarTypeImpl <em>LScalar Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LScalarTypeImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLScalarType()
		 * @generated
		 */
		EClass LSCALAR_TYPE = eINSTANCE.getLScalarType();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDataTypeImpl <em>LData Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LDataTypeImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDataType()
		 * @generated
		 */
		EClass LDATA_TYPE = eINSTANCE.getLDataType();

		/**
		 * The meta object literal for the '<em><b>Jvm Type Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDATA_TYPE__JVM_TYPE_REFERENCE = eINSTANCE.getLDataType_JvmTypeReference();

		/**
		 * The meta object literal for the '<em><b>As Primitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDATA_TYPE__AS_PRIMITIVE = eINSTANCE.getLDataType_AsPrimitive();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDATA_TYPE__DATE = eINSTANCE.getLDataType_Date();

		/**
		 * The meta object literal for the '<em><b>As Blob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDATA_TYPE__AS_BLOB = eINSTANCE.getLDataType_AsBlob();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDATA_TYPE__LENGTH = eINSTANCE.getLDataType_Length();

		/**
		 * The meta object literal for the '<em><b>Date Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDATA_TYPE__DATE_TYPE = eINSTANCE.getLDataType_DateType();

		/**
		 * The meta object literal for the '<em><b>Synthetic Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDATA_TYPE__SYNTHETIC_FLAG = eINSTANCE.getLDataType_SyntheticFlag();

		/**
		 * The meta object literal for the '<em><b>Synthetic Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDATA_TYPE__SYNTHETIC_SELECTOR = eINSTANCE.getLDataType_SyntheticSelector();

		/**
		 * The meta object literal for the '<em><b>Synthetic Type Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDATA_TYPE__SYNTHETIC_TYPE_REFERENCE = eINSTANCE.getLDataType_SyntheticTypeReference();

		/**
		 * The meta object literal for the '<em><b>Synthetic Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDATA_TYPE__SYNTHETIC_TYPE = eINSTANCE.getLDataType_SyntheticType();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDATA_TYPE__CONSTRAINTS = eINSTANCE.getLDataType_Constraints();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LEnumImpl <em>LEnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LEnumImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLEnum()
		 * @generated
		 */
		EClass LENUM = eINSTANCE.getLEnum();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LENUM__LITERALS = eINSTANCE.getLEnum_Literals();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LEnumLiteralImpl <em>LEnum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LEnumLiteralImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLEnumLiteral()
		 * @generated
		 */
		EClass LENUM_LITERAL = eINSTANCE.getLEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENUM_LITERAL__NAME = eINSTANCE.getLEnumLiteral_Name();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENUM_LITERAL__DEFAULT = eINSTANCE.getLEnumLiteral_Default();

		/**
		 * The meta object literal for the '<em><b>Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENUM_LITERAL__NULL = eINSTANCE.getLEnumLiteral_Null();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENUM_LITERAL__VALUE = eINSTANCE.getLEnumLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LClassImpl <em>LClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LClassImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLClass()
		 * @generated
		 */
		EClass LCLASS = eINSTANCE.getLClass();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LCLASS__ABSTRACT = eINSTANCE.getLClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>Serializable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LCLASS__SERIALIZABLE = eINSTANCE.getLClass_Serializable();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LCLASS__SHORT_NAME = eINSTANCE.getLClass_ShortName();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.LFeaturesHolder <em>LFeatures Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.LFeaturesHolder
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLFeaturesHolder()
		 * @generated
		 */
		EClass LFEATURES_HOLDER = eINSTANCE.getLFeaturesHolder();

		/**
		 * The meta object literal for the '<em><b>Get Features</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LFEATURES_HOLDER___GET_FEATURES = eINSTANCE.getLFeaturesHolder__GetFeatures();

		/**
		 * The meta object literal for the '<em><b>Get All Features</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LFEATURES_HOLDER___GET_ALL_FEATURES = eINSTANCE.getLFeaturesHolder__GetAllFeatures();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.LFeature <em>LFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.LFeature
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLFeature()
		 * @generated
		 */
		EClass LFEATURE = eINSTANCE.getLFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LFEATURE__NAME = eINSTANCE.getLFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LFEATURE__MULTIPLICITY = eINSTANCE.getLFeature_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Annotation Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LFEATURE__ANNOTATION_INFO = eINSTANCE.getLFeature_AnnotationInfo();

		/**
		 * The meta object literal for the '<em><b>Get Resolved Annotations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LFEATURE___GET_RESOLVED_ANNOTATIONS = eINSTANCE.getLFeature__GetResolvedAnnotations();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.LReference <em>LReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.LReference
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLReference()
		 * @generated
		 */
		EClass LREFERENCE = eINSTANCE.getLReference();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LREFERENCE__LAZY = eINSTANCE.getLReference_Lazy();

		/**
		 * The meta object literal for the '<em><b>Cascading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LREFERENCE__CASCADING = eINSTANCE.getLReference_Cascading();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LREFERENCE__PROPERTIES = eINSTANCE.getLReference_Properties();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.LAttribute <em>LAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.LAttribute
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLAttribute()
		 * @generated
		 */
		EClass LATTRIBUTE = eINSTANCE.getLAttribute();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTRIBUTE__ID = eINSTANCE.getLAttribute_Id();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTRIBUTE__UUID = eINSTANCE.getLAttribute_Uuid();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTRIBUTE__VERSION = eINSTANCE.getLAttribute_Version();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTRIBUTE__LAZY = eINSTANCE.getLAttribute_Lazy();

		/**
		 * The meta object literal for the '<em><b>Cascading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTRIBUTE__CASCADING = eINSTANCE.getLAttribute_Cascading();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTRIBUTE__TRANSIENT = eINSTANCE.getLAttribute_Transient();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTRIBUTE__DERIVED = eINSTANCE.getLAttribute_Derived();

		/**
		 * The meta object literal for the '<em><b>Dirty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTRIBUTE__DIRTY = eINSTANCE.getLAttribute_Dirty();

		/**
		 * The meta object literal for the '<em><b>Domain Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTRIBUTE__DOMAIN_KEY = eINSTANCE.getLAttribute_DomainKey();

		/**
		 * The meta object literal for the '<em><b>Domain Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTRIBUTE__DOMAIN_DESCRIPTION = eINSTANCE.getLAttribute_DomainDescription();

		/**
		 * The meta object literal for the '<em><b>Derived Getter Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATTRIBUTE__DERIVED_GETTER_EXPRESSION = eINSTANCE.getLAttribute_DerivedGetterExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATTRIBUTE__TYPE = eINSTANCE.getLAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Type Jvm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATTRIBUTE__TYPE_JVM = eINSTANCE.getLAttribute_TypeJvm();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATTRIBUTE__PROPERTIES = eINSTANCE.getLAttribute_Properties();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LKeyAndValueImpl <em>LKey And Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LKeyAndValueImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLKeyAndValue()
		 * @generated
		 */
		EClass LKEY_AND_VALUE = eINSTANCE.getLKeyAndValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LKEY_AND_VALUE__KEY = eINSTANCE.getLKeyAndValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LKEY_AND_VALUE__VALUE = eINSTANCE.getLKeyAndValue_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LOperationImpl <em>LOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LOperationImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLOperation()
		 * @generated
		 */
		EClass LOPERATION = eINSTANCE.getLOperation();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOPERATION__MODIFIER = eINSTANCE.getLOperation_Modifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOPERATION__TYPE = eINSTANCE.getLOperation_Type();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOPERATION__PARAMS = eINSTANCE.getLOperation_Params();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOPERATION__BODY = eINSTANCE.getLOperation_Body();

		/**
		 * The meta object literal for the '<em><b>Get Resolved Annotations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOPERATION___GET_RESOLVED_ANNOTATIONS = eINSTANCE.getLOperation__GetResolvedAnnotations();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LModifierImpl <em>LModifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LModifierImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLModifier()
		 * @generated
		 */
		EClass LMODIFIER = eINSTANCE.getLModifier();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LMODIFIER__FINAL = eINSTANCE.getLModifier_Final();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LMODIFIER__STATIC = eINSTANCE.getLModifier_Static();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LMODIFIER__VISIBILITY = eINSTANCE.getLModifier_Visibility();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LMultiplicityImpl <em>LMultiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LMultiplicityImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLMultiplicity()
		 * @generated
		 */
		EClass LMULTIPLICITY = eINSTANCE.getLMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LMULTIPLICITY__LOWER = eINSTANCE.getLMultiplicity_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LMULTIPLICITY__UPPER = eINSTANCE.getLMultiplicity_Upper();

		/**
		 * The meta object literal for the '<em><b>To Multiplicity String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LMULTIPLICITY__TO_MULTIPLICITY_STRING = eINSTANCE.getLMultiplicity_ToMultiplicityString();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LConstraintsImpl <em>LConstraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LConstraintsImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLConstraints()
		 * @generated
		 */
		EClass LCONSTRAINTS = eINSTANCE.getLConstraints();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LCONSTRAINTS__CONSTRAINTS = eINSTANCE.getLConstraints_Constraints();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.LConstraint <em>LConstraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.LConstraint
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLConstraint()
		 * @generated
		 */
		EClass LCONSTRAINT = eINSTANCE.getLConstraint();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.LDatatypeConstraint <em>LDatatype Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.LDatatypeConstraint
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDatatypeConstraint()
		 * @generated
		 */
		EClass LDATATYPE_CONSTRAINT = eINSTANCE.getLDatatypeConstraint();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCAssertFalseImpl <em>LDt CAssert False</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCAssertFalseImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCAssertFalse()
		 * @generated
		 */
		EClass LDT_CASSERT_FALSE = eINSTANCE.getLDtCAssertFalse();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCAssertTrueImpl <em>LDt CAssert True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCAssertTrueImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCAssertTrue()
		 * @generated
		 */
		EClass LDT_CASSERT_TRUE = eINSTANCE.getLDtCAssertTrue();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCDecimalMaxImpl <em>LDt CDecimal Max</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCDecimalMaxImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCDecimalMax()
		 * @generated
		 */
		EClass LDT_CDECIMAL_MAX = eINSTANCE.getLDtCDecimalMax();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDT_CDECIMAL_MAX__MAX = eINSTANCE.getLDtCDecimalMax_Max();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCDecimalMinImpl <em>LDt CDecimal Min</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCDecimalMinImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCDecimalMin()
		 * @generated
		 */
		EClass LDT_CDECIMAL_MIN = eINSTANCE.getLDtCDecimalMin();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDT_CDECIMAL_MIN__MIN = eINSTANCE.getLDtCDecimalMin_Min();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCDigitsImpl <em>LDt CDigits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCDigitsImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCDigits()
		 * @generated
		 */
		EClass LDT_CDIGITS = eINSTANCE.getLDtCDigits();

		/**
		 * The meta object literal for the '<em><b>Int Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDT_CDIGITS__INT_DIGITS = eINSTANCE.getLDtCDigits_IntDigits();

		/**
		 * The meta object literal for the '<em><b>Fraction Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDT_CDIGITS__FRACTION_DIGITS = eINSTANCE.getLDtCDigits_FractionDigits();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCFutureImpl <em>LDt CFuture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCFutureImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCFuture()
		 * @generated
		 */
		EClass LDT_CFUTURE = eINSTANCE.getLDtCFuture();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCPastImpl <em>LDt CPast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCPastImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCPast()
		 * @generated
		 */
		EClass LDT_CPAST = eINSTANCE.getLDtCPast();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCNumericMaxImpl <em>LDt CNumeric Max</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCNumericMaxImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCNumericMax()
		 * @generated
		 */
		EClass LDT_CNUMERIC_MAX = eINSTANCE.getLDtCNumericMax();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDT_CNUMERIC_MAX__MAX = eINSTANCE.getLDtCNumericMax_Max();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCNumericMinImpl <em>LDt CNumeric Min</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCNumericMinImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCNumericMin()
		 * @generated
		 */
		EClass LDT_CNUMERIC_MIN = eINSTANCE.getLDtCNumericMin();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDT_CNUMERIC_MIN__MIN = eINSTANCE.getLDtCNumericMin_Min();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCNotNullImpl <em>LDt CNot Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCNotNullImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCNotNull()
		 * @generated
		 */
		EClass LDT_CNOT_NULL = eINSTANCE.getLDtCNotNull();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCNullImpl <em>LDt CNull</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCNullImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCNull()
		 * @generated
		 */
		EClass LDT_CNULL = eINSTANCE.getLDtCNull();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCRegExImpl <em>LDt CReg Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCRegExImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCRegEx()
		 * @generated
		 */
		EClass LDT_CREG_EX = eINSTANCE.getLDtCRegEx();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDT_CREG_EX__PATTERN = eINSTANCE.getLDtCRegEx_Pattern();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LDtCSizeImpl <em>LDt CSize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LDtCSizeImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDtCSize()
		 * @generated
		 */
		EClass LDT_CSIZE = eINSTANCE.getLDtCSize();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDT_CSIZE__MIN = eINSTANCE.getLDtCSize_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDT_CSIZE__MAX = eINSTANCE.getLDtCSize_Max();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.impl.LAttributeMatchingConstraintImpl <em>LAttribute Matching Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.impl.LAttributeMatchingConstraintImpl
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLAttributeMatchingConstraint()
		 * @generated
		 */
		EClass LATTRIBUTE_MATCHING_CONSTRAINT = eINSTANCE.getLAttributeMatchingConstraint();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATTRIBUTE_MATCHING_CONSTRAINT__ATTRIBUTE = eINSTANCE.getLAttributeMatchingConstraint_Attribute();

		/**
		 * The meta object literal for the '<em><b>Comparator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTRIBUTE_MATCHING_CONSTRAINT__COMPARATOR_TYPE = eINSTANCE.getLAttributeMatchingConstraint_ComparatorType();

		/**
		 * The meta object literal for the '<em><b>Matching Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATTRIBUTE_MATCHING_CONSTRAINT__MATCHING_VALUE = eINSTANCE.getLAttributeMatchingConstraint_MatchingValue();

		/**
		 * The meta object literal for the '<em><b>Matching Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATTRIBUTE_MATCHING_CONSTRAINT__MATCHING_LITERAL = eINSTANCE.getLAttributeMatchingConstraint_MatchingLiteral();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.LDateType <em>LDate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.LDateType
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLDateType()
		 * @generated
		 */
		EEnum LDATE_TYPE = eINSTANCE.getLDateType();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.LVisibility <em>LVisibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.LVisibility
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLVisibility()
		 * @generated
		 */
		EEnum LVISIBILITY = eINSTANCE.getLVisibility();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.LLowerBound <em>LLower Bound</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.LLowerBound
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLLowerBound()
		 * @generated
		 */
		EEnum LLOWER_BOUND = eINSTANCE.getLLowerBound();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.LUpperBound <em>LUpper Bound</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.LUpperBound
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLUpperBound()
		 * @generated
		 */
		EEnum LUPPER_BOUND = eINSTANCE.getLUpperBound();

		/**
		 * The meta object literal for the '{@link org.lunifera.dsl.semantic.common.types.LComparatorType <em>LComparator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.dsl.semantic.common.types.LComparatorType
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getLComparatorType()
		 * @generated
		 */
		EEnum LCOMPARATOR_TYPE = eINSTANCE.getLComparatorType();

		/**
		 * The meta object literal for the '<em>Operations List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getOperationsList()
		 * @generated
		 */
		EDataType OPERATIONS_LIST = eINSTANCE.getOperationsList();

		/**
		 * The meta object literal for the '<em>Features List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getFeaturesList()
		 * @generated
		 */
		EDataType FEATURES_LIST = eINSTANCE.getFeaturesList();

		/**
		 * The meta object literal for the '<em>Annotation List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.EList
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getAnnotationList()
		 * @generated
		 */
		EDataType ANNOTATION_LIST = eINSTANCE.getAnnotationList();

		/**
		 * The meta object literal for the '<em>Internal EObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.InternalEObject
		 * @see org.lunifera.dsl.semantic.common.types.impl.LunTypesPackageImpl#getInternalEObject()
		 * @generated
		 */
		EDataType INTERNAL_EOBJECT = eINSTANCE.getInternalEObject();

	}

} //LunTypesPackage
