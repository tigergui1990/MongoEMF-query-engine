/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.mongo.query.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Where Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.mongo.query.query.ExpressionWhereEntry#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.mongo.query.query.ExpressionWhereEntry#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipselabs.mongo.query.query.ExpressionWhereEntry#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.mongo.query.query.QueryPackage#getExpressionWhereEntry()
 * @model
 * @generated
 */
public interface ExpressionWhereEntry extends WhereEntry
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
   * @see org.eclipselabs.mongo.query.query.QueryPackage#getExpressionWhereEntry_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipselabs.mongo.query.query.ExpressionWhereEntry#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.mongo.query.query.Operator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.eclipselabs.mongo.query.query.Operator
   * @see #setOperator(Operator)
   * @see org.eclipselabs.mongo.query.query.QueryPackage#getExpressionWhereEntry_Operator()
   * @model
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link org.eclipselabs.mongo.query.query.ExpressionWhereEntry#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.eclipselabs.mongo.query.query.Operator
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(Expression)
   * @see org.eclipselabs.mongo.query.query.QueryPackage#getExpressionWhereEntry_Rhs()
   * @model containment="true"
   * @generated
   */
  Expression getRhs();

  /**
   * Sets the value of the '{@link org.eclipselabs.mongo.query.query.ExpressionWhereEntry#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Expression value);

} // ExpressionWhereEntry
