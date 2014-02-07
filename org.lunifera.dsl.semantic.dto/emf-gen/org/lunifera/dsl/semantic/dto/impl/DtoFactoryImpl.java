/**
 */
package org.lunifera.dsl.semantic.dto.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.dsl.semantic.dto.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DtoFactoryImpl extends EFactoryImpl implements DtoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DtoFactory init()
  {
    try
    {
      DtoFactory theDtoFactory = (DtoFactory)EPackage.Registry.INSTANCE.getEFactory(DtoPackage.eNS_URI);
      if (theDtoFactory != null)
      {
        return theDtoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DtoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DtoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DtoPackage.LDTO_MODEL: return createLDtoModel();
      case DtoPackage.LDTO: return createLDto();
      case DtoPackage.LDTO_MAPPER: return createLDtoMapper();
      case DtoPackage.LDTO_FEATURE: return createLDtoFeature();
      case DtoPackage.LDTO_INHERITED_ATTRIBUTE: return createLDtoInheritedAttribute();
      case DtoPackage.LDTO_ATTRIBUTE: return createLDtoAttribute();
      case DtoPackage.LDTO_INHERITED_REFERENCE: return createLDtoInheritedReference();
      case DtoPackage.LDTO_REFERENCE: return createLDtoReference();
      case DtoPackage.LDTO_OPERATION: return createLDtoOperation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DtoPackage.DTO_FEATURE_LIST:
        return createDtoFeatureListFromString(eDataType, initialValue);
      case DtoPackage.OPERATIONS_LIST:
        return createOperationsListFromString(eDataType, initialValue);
      case DtoPackage.DTO_REFERENCE_LIST:
        return createDtoReferenceListFromString(eDataType, initialValue);
      case DtoPackage.DTO_ATTRIBUTE_LIST:
        return createDtoAttributeListFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DtoPackage.DTO_FEATURE_LIST:
        return convertDtoFeatureListToString(eDataType, instanceValue);
      case DtoPackage.OPERATIONS_LIST:
        return convertOperationsListToString(eDataType, instanceValue);
      case DtoPackage.DTO_REFERENCE_LIST:
        return convertDtoReferenceListToString(eDataType, instanceValue);
      case DtoPackage.DTO_ATTRIBUTE_LIST:
        return convertDtoAttributeListToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDtoModel createLDtoModel()
  {
    LDtoModelImpl lDtoModel = new LDtoModelImpl();
    return lDtoModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDto createLDto()
  {
    LDtoImpl lDto = new LDtoImpl();
    return lDto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDtoMapper createLDtoMapper()
  {
    LDtoMapperImpl lDtoMapper = new LDtoMapperImpl();
    return lDtoMapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDtoFeature createLDtoFeature()
  {
    LDtoFeatureImpl lDtoFeature = new LDtoFeatureImpl();
    return lDtoFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDtoInheritedAttribute createLDtoInheritedAttribute()
  {
    LDtoInheritedAttributeImpl lDtoInheritedAttribute = new LDtoInheritedAttributeImpl();
    return lDtoInheritedAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDtoAttribute createLDtoAttribute()
  {
    LDtoAttributeImpl lDtoAttribute = new LDtoAttributeImpl();
    return lDtoAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDtoInheritedReference createLDtoInheritedReference()
  {
    LDtoInheritedReferenceImpl lDtoInheritedReference = new LDtoInheritedReferenceImpl();
    return lDtoInheritedReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDtoReference createLDtoReference()
  {
    LDtoReferenceImpl lDtoReference = new LDtoReferenceImpl();
    return lDtoReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDtoOperation createLDtoOperation()
  {
    LDtoOperationImpl lDtoOperation = new LDtoOperationImpl();
    return lDtoOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public List<LDtoFeature> createDtoFeatureListFromString(EDataType eDataType, String initialValue)
  {
    return (List<LDtoFeature>)super.createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDtoFeatureListToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public List<LDtoOperation> createOperationsListFromString(EDataType eDataType, String initialValue)
  {
    return (List<LDtoOperation>)super.createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperationsListToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public List<LDtoReference> createDtoReferenceListFromString(EDataType eDataType, String initialValue)
  {
    return (List<LDtoReference>)super.createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDtoReferenceListToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public List<LDtoAttribute> createDtoAttributeListFromString(EDataType eDataType, String initialValue)
  {
    return (List<LDtoAttribute>)super.createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDtoAttributeListToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DtoPackage getDtoPackage()
  {
    return (DtoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DtoPackage getPackage()
  {
    return DtoPackage.eINSTANCE;
  }

} //DtoFactoryImpl
