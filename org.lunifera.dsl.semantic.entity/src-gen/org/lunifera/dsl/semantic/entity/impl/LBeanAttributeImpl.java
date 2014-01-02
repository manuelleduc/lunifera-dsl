/**
 */
package org.lunifera.dsl.semantic.entity.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.dsl.semantic.common.types.LAttribute;
import org.lunifera.dsl.semantic.common.types.LScalarType;
import org.lunifera.dsl.semantic.common.types.LunTypesPackage;

import org.lunifera.dsl.semantic.entity.EntityPackage;
import org.lunifera.dsl.semantic.entity.LBeanAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LBean Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.dsl.semantic.entity.impl.LBeanAttributeImpl#isId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.dsl.semantic.entity.impl.LBeanAttributeImpl#isVersion <em>Version</em>}</li>
 *   <li>{@link org.lunifera.dsl.semantic.entity.impl.LBeanAttributeImpl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.lunifera.dsl.semantic.entity.impl.LBeanAttributeImpl#isCascading <em>Cascading</em>}</li>
 *   <li>{@link org.lunifera.dsl.semantic.entity.impl.LBeanAttributeImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.lunifera.dsl.semantic.entity.impl.LBeanAttributeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LBeanAttributeImpl extends LBeanFeatureImpl implements LBeanAttribute
{
  /**
   * The default value of the '{@link #isId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isId()
   * @generated
   * @ordered
   */
  protected static final boolean ID_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isId()
   * @generated
   * @ordered
   */
  protected boolean id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #isVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVersion()
   * @generated
   * @ordered
   */
  protected static final boolean VERSION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVersion()
   * @generated
   * @ordered
   */
  protected boolean version = VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLazy()
   * @generated
   * @ordered
   */
  protected static final boolean LAZY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLazy()
   * @generated
   * @ordered
   */
  protected boolean lazy = LAZY_EDEFAULT;

  /**
   * The default value of the '{@link #isCascading() <em>Cascading</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCascading()
   * @generated
   * @ordered
   */
  protected static final boolean CASCADING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCascading() <em>Cascading</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCascading()
   * @generated
   * @ordered
   */
  protected boolean cascading = CASCADING_EDEFAULT;

  /**
   * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTransient()
   * @generated
   * @ordered
   */
  protected static final boolean TRANSIENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTransient()
   * @generated
   * @ordered
   */
  protected boolean transient_ = TRANSIENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected LScalarType type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LBeanAttributeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EntityPackage.Literals.LBEAN_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(boolean newId)
  {
    boolean oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LBEAN_ATTRIBUTE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(boolean newVersion)
  {
    boolean oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LBEAN_ATTRIBUTE__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLazy()
  {
    return lazy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLazy(boolean newLazy)
  {
    boolean oldLazy = lazy;
    lazy = newLazy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LBEAN_ATTRIBUTE__LAZY, oldLazy, lazy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCascading()
  {
    return cascading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCascading(boolean newCascading)
  {
    boolean oldCascading = cascading;
    cascading = newCascading;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LBEAN_ATTRIBUTE__CASCADING, oldCascading, cascading));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTransient()
  {
    return transient_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransient(boolean newTransient)
  {
    boolean oldTransient = transient_;
    transient_ = newTransient;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LBEAN_ATTRIBUTE__TRANSIENT, oldTransient, transient_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LScalarType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (LScalarType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityPackage.LBEAN_ATTRIBUTE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LScalarType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(LScalarType newType)
  {
    LScalarType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LBEAN_ATTRIBUTE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EntityPackage.LBEAN_ATTRIBUTE__ID:
        return isId();
      case EntityPackage.LBEAN_ATTRIBUTE__VERSION:
        return isVersion();
      case EntityPackage.LBEAN_ATTRIBUTE__LAZY:
        return isLazy();
      case EntityPackage.LBEAN_ATTRIBUTE__CASCADING:
        return isCascading();
      case EntityPackage.LBEAN_ATTRIBUTE__TRANSIENT:
        return isTransient();
      case EntityPackage.LBEAN_ATTRIBUTE__TYPE:
        if (resolve) return getType();
        return basicGetType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EntityPackage.LBEAN_ATTRIBUTE__ID:
        setId((Boolean)newValue);
        return;
      case EntityPackage.LBEAN_ATTRIBUTE__VERSION:
        setVersion((Boolean)newValue);
        return;
      case EntityPackage.LBEAN_ATTRIBUTE__LAZY:
        setLazy((Boolean)newValue);
        return;
      case EntityPackage.LBEAN_ATTRIBUTE__CASCADING:
        setCascading((Boolean)newValue);
        return;
      case EntityPackage.LBEAN_ATTRIBUTE__TRANSIENT:
        setTransient((Boolean)newValue);
        return;
      case EntityPackage.LBEAN_ATTRIBUTE__TYPE:
        setType((LScalarType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EntityPackage.LBEAN_ATTRIBUTE__ID:
        setId(ID_EDEFAULT);
        return;
      case EntityPackage.LBEAN_ATTRIBUTE__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case EntityPackage.LBEAN_ATTRIBUTE__LAZY:
        setLazy(LAZY_EDEFAULT);
        return;
      case EntityPackage.LBEAN_ATTRIBUTE__CASCADING:
        setCascading(CASCADING_EDEFAULT);
        return;
      case EntityPackage.LBEAN_ATTRIBUTE__TRANSIENT:
        setTransient(TRANSIENT_EDEFAULT);
        return;
      case EntityPackage.LBEAN_ATTRIBUTE__TYPE:
        setType((LScalarType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EntityPackage.LBEAN_ATTRIBUTE__ID:
        return id != ID_EDEFAULT;
      case EntityPackage.LBEAN_ATTRIBUTE__VERSION:
        return version != VERSION_EDEFAULT;
      case EntityPackage.LBEAN_ATTRIBUTE__LAZY:
        return lazy != LAZY_EDEFAULT;
      case EntityPackage.LBEAN_ATTRIBUTE__CASCADING:
        return cascading != CASCADING_EDEFAULT;
      case EntityPackage.LBEAN_ATTRIBUTE__TRANSIENT:
        return transient_ != TRANSIENT_EDEFAULT;
      case EntityPackage.LBEAN_ATTRIBUTE__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == LAttribute.class)
    {
      switch (derivedFeatureID)
      {
        case EntityPackage.LBEAN_ATTRIBUTE__ID: return LunTypesPackage.LATTRIBUTE__ID;
        case EntityPackage.LBEAN_ATTRIBUTE__VERSION: return LunTypesPackage.LATTRIBUTE__VERSION;
        case EntityPackage.LBEAN_ATTRIBUTE__LAZY: return LunTypesPackage.LATTRIBUTE__LAZY;
        case EntityPackage.LBEAN_ATTRIBUTE__CASCADING: return LunTypesPackage.LATTRIBUTE__CASCADING;
        case EntityPackage.LBEAN_ATTRIBUTE__TRANSIENT: return LunTypesPackage.LATTRIBUTE__TRANSIENT;
        case EntityPackage.LBEAN_ATTRIBUTE__TYPE: return LunTypesPackage.LATTRIBUTE__TYPE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == LAttribute.class)
    {
      switch (baseFeatureID)
      {
        case LunTypesPackage.LATTRIBUTE__ID: return EntityPackage.LBEAN_ATTRIBUTE__ID;
        case LunTypesPackage.LATTRIBUTE__VERSION: return EntityPackage.LBEAN_ATTRIBUTE__VERSION;
        case LunTypesPackage.LATTRIBUTE__LAZY: return EntityPackage.LBEAN_ATTRIBUTE__LAZY;
        case LunTypesPackage.LATTRIBUTE__CASCADING: return EntityPackage.LBEAN_ATTRIBUTE__CASCADING;
        case LunTypesPackage.LATTRIBUTE__TRANSIENT: return EntityPackage.LBEAN_ATTRIBUTE__TRANSIENT;
        case LunTypesPackage.LATTRIBUTE__TYPE: return EntityPackage.LBEAN_ATTRIBUTE__TYPE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(", version: ");
    result.append(version);
    result.append(", lazy: ");
    result.append(lazy);
    result.append(", cascading: ");
    result.append(cascading);
    result.append(", transient: ");
    result.append(transient_);
    result.append(')');
    return result.toString();
  }

} //LBeanAttributeImpl