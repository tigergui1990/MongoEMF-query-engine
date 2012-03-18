/**
 * <copyright>
 * </copyright>
 *

 */
package org.example.mongoemf.sQLQuery.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.example.mongoemf.sQLQuery.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SQLQueryFactoryImpl extends EFactoryImpl implements SQLQueryFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SQLQueryFactory init()
  {
    try
    {
      SQLQueryFactory theSQLQueryFactory = (SQLQueryFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.example.org/mongoemf/SQLQuery"); 
      if (theSQLQueryFactory != null)
      {
        return theSQLQueryFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SQLQueryFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SQLQueryFactoryImpl()
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
      case SQLQueryPackage.MODEL: return createModel();
      case SQLQueryPackage.DATABASE: return createDatabase();
      case SQLQueryPackage.QUERY_CONDITION: return createQueryCondition();
      case SQLQueryPackage.CONDITION: return createCondition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Database createDatabase()
  {
    DatabaseImpl database = new DatabaseImpl();
    return database;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryCondition createQueryCondition()
  {
    QueryConditionImpl queryCondition = new QueryConditionImpl();
    return queryCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SQLQueryPackage getSQLQueryPackage()
  {
    return (SQLQueryPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SQLQueryPackage getPackage()
  {
    return SQLQueryPackage.eINSTANCE;
  }

} //SQLQueryFactoryImpl
