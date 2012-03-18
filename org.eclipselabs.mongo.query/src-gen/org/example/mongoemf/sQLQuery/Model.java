/**
 * <copyright>
 * </copyright>
 *

 */
package org.example.mongoemf.sQLQuery;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.mongoemf.sQLQuery.Model#getAttrs <em>Attrs</em>}</li>
 *   <li>{@link org.example.mongoemf.sQLQuery.Model#getDb <em>Db</em>}</li>
 *   <li>{@link org.example.mongoemf.sQLQuery.Model#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Attrs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrs</em>' attribute.
   * @see #setAttrs(String)
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getModel_Attrs()
   * @model
   * @generated
   */
  String getAttrs();

  /**
   * Sets the value of the '{@link org.example.mongoemf.sQLQuery.Model#getAttrs <em>Attrs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attrs</em>' attribute.
   * @see #getAttrs()
   * @generated
   */
  void setAttrs(String value);

  /**
   * Returns the value of the '<em><b>Db</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db</em>' containment reference.
   * @see #setDb(Database)
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getModel_Db()
   * @model containment="true"
   * @generated
   */
  Database getDb();

  /**
   * Sets the value of the '{@link org.example.mongoemf.sQLQuery.Model#getDb <em>Db</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db</em>' containment reference.
   * @see #getDb()
   * @generated
   */
  void setDb(Database value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(QueryCondition)
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getModel_Query()
   * @model containment="true"
   * @generated
   */
  QueryCondition getQuery();

  /**
   * Sets the value of the '{@link org.example.mongoemf.sQLQuery.Model#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(QueryCondition value);

} // Model
