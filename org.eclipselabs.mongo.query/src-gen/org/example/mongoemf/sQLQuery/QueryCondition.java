/**
 * <copyright>
 * </copyright>
 *

 */
package org.example.mongoemf.sQLQuery;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.mongoemf.sQLQuery.QueryCondition#getStartcond <em>Startcond</em>}</li>
 *   <li>{@link org.example.mongoemf.sQLQuery.QueryCondition#getFollowcond <em>Followcond</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getQueryCondition()
 * @model
 * @generated
 */
public interface QueryCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Startcond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Startcond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Startcond</em>' containment reference.
   * @see #setStartcond(Condition)
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getQueryCondition_Startcond()
   * @model containment="true"
   * @generated
   */
  Condition getStartcond();

  /**
   * Sets the value of the '{@link org.example.mongoemf.sQLQuery.QueryCondition#getStartcond <em>Startcond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Startcond</em>' containment reference.
   * @see #getStartcond()
   * @generated
   */
  void setStartcond(Condition value);

  /**
   * Returns the value of the '<em><b>Followcond</b></em>' containment reference list.
   * The list contents are of type {@link org.example.mongoemf.sQLQuery.FollowCondition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Followcond</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Followcond</em>' containment reference list.
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getQueryCondition_Followcond()
   * @model containment="true"
   * @generated
   */
  EList<FollowCondition> getFollowcond();

} // QueryCondition
