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
 *   <li>{@link org.example.mongoemf.sQLQuery.QueryCondition#getCond <em>Cond</em>}</li>
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
   * Returns the value of the '<em><b>Cond</b></em>' containment reference list.
   * The list contents are of type {@link org.example.mongoemf.sQLQuery.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference list.
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getQueryCondition_Cond()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getCond();

} // QueryCondition
