/**
 * <copyright>
 * </copyright>
 *

 */
package org.example.mongoemf.sQLQuery;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.mongoemf.sQLQuery.Database#getUrl <em>Url</em>}</li>
 *   <li>{@link org.example.mongoemf.sQLQuery.Database#getPort <em>Port</em>}</li>
 *   <li>{@link org.example.mongoemf.sQLQuery.Database#getDbName <em>Db Name</em>}</li>
 *   <li>{@link org.example.mongoemf.sQLQuery.Database#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject
{
  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getDatabase_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link org.example.mongoemf.sQLQuery.Database#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(int)
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getDatabase_Port()
   * @model
   * @generated
   */
  int getPort();

  /**
   * Sets the value of the '{@link org.example.mongoemf.sQLQuery.Database#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(int value);

  /**
   * Returns the value of the '<em><b>Db Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Name</em>' attribute.
   * @see #setDbName(String)
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getDatabase_DbName()
   * @model
   * @generated
   */
  String getDbName();

  /**
   * Sets the value of the '{@link org.example.mongoemf.sQLQuery.Database#getDbName <em>Db Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Name</em>' attribute.
   * @see #getDbName()
   * @generated
   */
  void setDbName(String value);

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
   * @see org.example.mongoemf.sQLQuery.SQLQueryPackage#getDatabase_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.mongoemf.sQLQuery.Database#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Database
