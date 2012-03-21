/**
 * <copyright>
 * </copyright>
 *

 */
package org.example.mongoemf.sQLQuery;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.example.mongoemf.sQLQuery.SQLQueryFactory
 * @model kind="package"
 * @generated
 */
public interface SQLQueryPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sQLQuery";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.org/mongoemf/SQLQuery";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sQLQuery";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SQLQueryPackage eINSTANCE = org.example.mongoemf.sQLQuery.impl.SQLQueryPackageImpl.init();

  /**
   * The meta object id for the '{@link org.example.mongoemf.sQLQuery.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.mongoemf.sQLQuery.impl.ModelImpl
   * @see org.example.mongoemf.sQLQuery.impl.SQLQueryPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Attrs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ATTRS = 0;

  /**
   * The feature id for the '<em><b>Db</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DB = 1;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__QUERY = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.example.mongoemf.sQLQuery.impl.DatabaseImpl <em>Database</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.mongoemf.sQLQuery.impl.DatabaseImpl
   * @see org.example.mongoemf.sQLQuery.impl.SQLQueryPackageImpl#getDatabase()
   * @generated
   */
  int DATABASE = 1;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__URL = 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__PORT = 1;

  /**
   * The feature id for the '<em><b>Db Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__DB_NAME = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__NAME = 3;

  /**
   * The number of structural features of the '<em>Database</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.example.mongoemf.sQLQuery.impl.QueryConditionImpl <em>Query Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.mongoemf.sQLQuery.impl.QueryConditionImpl
   * @see org.example.mongoemf.sQLQuery.impl.SQLQueryPackageImpl#getQueryCondition()
   * @generated
   */
  int QUERY_CONDITION = 2;

  /**
   * The feature id for the '<em><b>Startcond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_CONDITION__STARTCOND = 0;

  /**
   * The feature id for the '<em><b>Followcond</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_CONDITION__FOLLOWCOND = 1;

  /**
   * The number of structural features of the '<em>Query Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_CONDITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.mongoemf.sQLQuery.impl.FollowConditionImpl <em>Follow Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.mongoemf.sQLQuery.impl.FollowConditionImpl
   * @see org.example.mongoemf.sQLQuery.impl.SQLQueryPackageImpl#getFollowCondition()
   * @generated
   */
  int FOLLOW_CONDITION = 3;

  /**
   * The feature id for the '<em><b>Conjunction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLLOW_CONDITION__CONJUNCTION = 0;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLLOW_CONDITION__COND = 1;

  /**
   * The number of structural features of the '<em>Follow Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOLLOW_CONDITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.mongoemf.sQLQuery.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.mongoemf.sQLQuery.impl.ConditionImpl
   * @see org.example.mongoemf.sQLQuery.impl.SQLQueryPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Comp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__COMP = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__VALUE = 2;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.example.mongoemf.sQLQuery.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.example.mongoemf.sQLQuery.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.example.mongoemf.sQLQuery.Model#getAttrs <em>Attrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attrs</em>'.
   * @see org.example.mongoemf.sQLQuery.Model#getAttrs()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Attrs();

  /**
   * Returns the meta object for the containment reference '{@link org.example.mongoemf.sQLQuery.Model#getDb <em>Db</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db</em>'.
   * @see org.example.mongoemf.sQLQuery.Model#getDb()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Db();

  /**
   * Returns the meta object for the containment reference '{@link org.example.mongoemf.sQLQuery.Model#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see org.example.mongoemf.sQLQuery.Model#getQuery()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Query();

  /**
   * Returns the meta object for class '{@link org.example.mongoemf.sQLQuery.Database <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database</em>'.
   * @see org.example.mongoemf.sQLQuery.Database
   * @generated
   */
  EClass getDatabase();

  /**
   * Returns the meta object for the attribute '{@link org.example.mongoemf.sQLQuery.Database#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.example.mongoemf.sQLQuery.Database#getUrl()
   * @see #getDatabase()
   * @generated
   */
  EAttribute getDatabase_Url();

  /**
   * Returns the meta object for the attribute '{@link org.example.mongoemf.sQLQuery.Database#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see org.example.mongoemf.sQLQuery.Database#getPort()
   * @see #getDatabase()
   * @generated
   */
  EAttribute getDatabase_Port();

  /**
   * Returns the meta object for the attribute '{@link org.example.mongoemf.sQLQuery.Database#getDbName <em>Db Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Name</em>'.
   * @see org.example.mongoemf.sQLQuery.Database#getDbName()
   * @see #getDatabase()
   * @generated
   */
  EAttribute getDatabase_DbName();

  /**
   * Returns the meta object for the attribute '{@link org.example.mongoemf.sQLQuery.Database#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.mongoemf.sQLQuery.Database#getName()
   * @see #getDatabase()
   * @generated
   */
  EAttribute getDatabase_Name();

  /**
   * Returns the meta object for class '{@link org.example.mongoemf.sQLQuery.QueryCondition <em>Query Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Condition</em>'.
   * @see org.example.mongoemf.sQLQuery.QueryCondition
   * @generated
   */
  EClass getQueryCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.example.mongoemf.sQLQuery.QueryCondition#getStartcond <em>Startcond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Startcond</em>'.
   * @see org.example.mongoemf.sQLQuery.QueryCondition#getStartcond()
   * @see #getQueryCondition()
   * @generated
   */
  EReference getQueryCondition_Startcond();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.mongoemf.sQLQuery.QueryCondition#getFollowcond <em>Followcond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Followcond</em>'.
   * @see org.example.mongoemf.sQLQuery.QueryCondition#getFollowcond()
   * @see #getQueryCondition()
   * @generated
   */
  EReference getQueryCondition_Followcond();

  /**
   * Returns the meta object for class '{@link org.example.mongoemf.sQLQuery.FollowCondition <em>Follow Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Follow Condition</em>'.
   * @see org.example.mongoemf.sQLQuery.FollowCondition
   * @generated
   */
  EClass getFollowCondition();

  /**
   * Returns the meta object for the attribute '{@link org.example.mongoemf.sQLQuery.FollowCondition#getConjunction <em>Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Conjunction</em>'.
   * @see org.example.mongoemf.sQLQuery.FollowCondition#getConjunction()
   * @see #getFollowCondition()
   * @generated
   */
  EAttribute getFollowCondition_Conjunction();

  /**
   * Returns the meta object for the containment reference '{@link org.example.mongoemf.sQLQuery.FollowCondition#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.example.mongoemf.sQLQuery.FollowCondition#getCond()
   * @see #getFollowCondition()
   * @generated
   */
  EReference getFollowCondition_Cond();

  /**
   * Returns the meta object for class '{@link org.example.mongoemf.sQLQuery.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.example.mongoemf.sQLQuery.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute '{@link org.example.mongoemf.sQLQuery.Condition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.mongoemf.sQLQuery.Condition#getName()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.example.mongoemf.sQLQuery.Condition#getComp <em>Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comp</em>'.
   * @see org.example.mongoemf.sQLQuery.Condition#getComp()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Comp();

  /**
   * Returns the meta object for the attribute '{@link org.example.mongoemf.sQLQuery.Condition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.example.mongoemf.sQLQuery.Condition#getValue()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SQLQueryFactory getSQLQueryFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.example.mongoemf.sQLQuery.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.mongoemf.sQLQuery.impl.ModelImpl
     * @see org.example.mongoemf.sQLQuery.impl.SQLQueryPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Attrs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__ATTRS = eINSTANCE.getModel_Attrs();

    /**
     * The meta object literal for the '<em><b>Db</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DB = eINSTANCE.getModel_Db();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__QUERY = eINSTANCE.getModel_Query();

    /**
     * The meta object literal for the '{@link org.example.mongoemf.sQLQuery.impl.DatabaseImpl <em>Database</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.mongoemf.sQLQuery.impl.DatabaseImpl
     * @see org.example.mongoemf.sQLQuery.impl.SQLQueryPackageImpl#getDatabase()
     * @generated
     */
    EClass DATABASE = eINSTANCE.getDatabase();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE__URL = eINSTANCE.getDatabase_Url();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE__PORT = eINSTANCE.getDatabase_Port();

    /**
     * The meta object literal for the '<em><b>Db Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE__DB_NAME = eINSTANCE.getDatabase_DbName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE__NAME = eINSTANCE.getDatabase_Name();

    /**
     * The meta object literal for the '{@link org.example.mongoemf.sQLQuery.impl.QueryConditionImpl <em>Query Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.mongoemf.sQLQuery.impl.QueryConditionImpl
     * @see org.example.mongoemf.sQLQuery.impl.SQLQueryPackageImpl#getQueryCondition()
     * @generated
     */
    EClass QUERY_CONDITION = eINSTANCE.getQueryCondition();

    /**
     * The meta object literal for the '<em><b>Startcond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_CONDITION__STARTCOND = eINSTANCE.getQueryCondition_Startcond();

    /**
     * The meta object literal for the '<em><b>Followcond</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_CONDITION__FOLLOWCOND = eINSTANCE.getQueryCondition_Followcond();

    /**
     * The meta object literal for the '{@link org.example.mongoemf.sQLQuery.impl.FollowConditionImpl <em>Follow Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.mongoemf.sQLQuery.impl.FollowConditionImpl
     * @see org.example.mongoemf.sQLQuery.impl.SQLQueryPackageImpl#getFollowCondition()
     * @generated
     */
    EClass FOLLOW_CONDITION = eINSTANCE.getFollowCondition();

    /**
     * The meta object literal for the '<em><b>Conjunction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOLLOW_CONDITION__CONJUNCTION = eINSTANCE.getFollowCondition_Conjunction();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOLLOW_CONDITION__COND = eINSTANCE.getFollowCondition_Cond();

    /**
     * The meta object literal for the '{@link org.example.mongoemf.sQLQuery.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.mongoemf.sQLQuery.impl.ConditionImpl
     * @see org.example.mongoemf.sQLQuery.impl.SQLQueryPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

    /**
     * The meta object literal for the '<em><b>Comp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__COMP = eINSTANCE.getCondition_Comp();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__VALUE = eINSTANCE.getCondition_Value();

  }

} //SQLQueryPackage
