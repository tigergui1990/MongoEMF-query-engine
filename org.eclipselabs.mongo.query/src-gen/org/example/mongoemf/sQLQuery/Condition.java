/**
 * <copyright>
 * </copyright>
 *

 */
package org.example.mongoemf.sQLQuery;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.mongoemf.sQLQuery.Condition#getName <em>Name</em>}</li>
 *   <li>{@link org.example.mongoemf.sQLQuery.Condition#getComp <em>Comp</em>}</li>
 *   <li>{@link org.example.mongoemf.sQLQuery.Condition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getCondition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.mongoemf.sQLQuery.Condition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Comp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp</em>' attribute.
   * @see #setComp(String)
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getCondition_Comp()
   * @model
   * @generated
   */
  String getComp();

  /**
   * Sets the value of the '{@link org.example.mongoemf.sQLQuery.Condition#getComp <em>Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comp</em>' attribute.
   * @see #getComp()
   * @generated
   */
  void setComp(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getCondition_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.example.mongoemf.sQLQuery.Condition#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // Condition
