/**
 */
package org.lunifera.dsl.semantic.entity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.dsl.semantic.common.types.LTypedPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEntity Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.dsl.semantic.entity.LEntityModel#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.dsl.semantic.entity.EntityPackage#getLEntityModel()
 * @model
 * @generated
 */
public interface LEntityModel extends EObject
{
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
   * @see org.lunifera.dsl.semantic.entity.EntityPackage#getLEntityModel_Packages()
   * @model containment="true"
   * @generated
   */
  EList<LTypedPackage> getPackages();

} // LEntityModel