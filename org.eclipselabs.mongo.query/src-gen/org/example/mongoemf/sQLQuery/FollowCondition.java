/**
 * <copyright>
 * </copyright>
 *

 */
package org.example.mongoemf.sQLQuery;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Follow Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.mongoemf.sQLQuery.FollowCondition#getConjunction <em>Conjunction</em>}</li>
 *   <li>{@link org.example.mongoemf.sQLQuery.FollowCondition#getCond <em>Cond</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getFollowCondition()
 * @model
 * @generated
 */
public interface FollowCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Conjunction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conjunction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conjunction</em>' attribute.
   * @see #setConjunction(String)
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getFollowCondition_Conjunction()
   * @model
   * @generated
   */
  String getConjunction();

  /**
   * Sets the value of the '{@link org.example.mongoemf.sQLQuery.FollowCondition#getConjunction <em>Conjunction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conjunction</em>' attribute.
   * @see #getConjunction()
   * @generated
   */
  void setConjunction(String value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Condition)
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getFollowCondition_Cond()
   * @model containment="true"
   * @generated
   */
  Condition getCond();

  /**
   * Sets the value of the '{@link org.example.mongoemf.sQLQuery.FollowCondition#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Condition value);

} // FollowCondition
