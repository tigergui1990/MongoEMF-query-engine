/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.mongo.query.query.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.mongo.query.query.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryFactoryImpl extends EFactoryImpl implements QueryFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QueryFactory init()
  {
    try
    {
      QueryFactory theQueryFactory = (QueryFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/mongoemf/SQLQuery"); 
      if (theQueryFactory != null)
      {
        return theQueryFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QueryFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryFactoryImpl()
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
      case QueryPackage.MODEL: return createModel();
      case QueryPackage.DATABASE: return createDatabase();
      case QueryPackage.WHERE_ENTRY: return createWhereEntry();
      case QueryPackage.EXPRESSION_WHERE_ENTRY: return createExpressionWhereEntry();
      case QueryPackage.EXPRESSION: return createExpression();
      case QueryPackage.REPLACABLE_VALUE: return createReplacableValue();
      case QueryPackage.DOUBLE_EXPRESSION: return createDoubleExpression();
      case QueryPackage.LONG_EXPRESSION: return createLongExpression();
      case QueryPackage.STRING_EXPRESSION: return createStringExpression();
      case QueryPackage.NULL_EXPRESSION: return createNullExpression();
      case QueryPackage.DATE_EXPRESSION: return createDateExpression();
      case QueryPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case QueryPackage.OR_WHERE_ENTRY: return createOrWhereEntry();
      case QueryPackage.AND_WHERE_ENTRY: return createAndWhereEntry();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case QueryPackage.OPERATOR:
        return createOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case QueryPackage.OPERATOR:
        return convertOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
  public WhereEntry createWhereEntry()
  {
    WhereEntryImpl whereEntry = new WhereEntryImpl();
    return whereEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionWhereEntry createExpressionWhereEntry()
  {
    ExpressionWhereEntryImpl expressionWhereEntry = new ExpressionWhereEntryImpl();
    return expressionWhereEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReplacableValue createReplacableValue()
  {
    ReplacableValueImpl replacableValue = new ReplacableValueImpl();
    return replacableValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleExpression createDoubleExpression()
  {
    DoubleExpressionImpl doubleExpression = new DoubleExpressionImpl();
    return doubleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongExpression createLongExpression()
  {
    LongExpressionImpl longExpression = new LongExpressionImpl();
    return longExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringExpression createStringExpression()
  {
    StringExpressionImpl stringExpression = new StringExpressionImpl();
    return stringExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullExpression createNullExpression()
  {
    NullExpressionImpl nullExpression = new NullExpressionImpl();
    return nullExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateExpression createDateExpression()
  {
    DateExpressionImpl dateExpression = new DateExpressionImpl();
    return dateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrWhereEntry createOrWhereEntry()
  {
    OrWhereEntryImpl orWhereEntry = new OrWhereEntryImpl();
    return orWhereEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndWhereEntry createAndWhereEntry()
  {
    AndWhereEntryImpl andWhereEntry = new AndWhereEntryImpl();
    return andWhereEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperatorFromString(EDataType eDataType, String initialValue)
  {
    Operator result = Operator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryPackage getQueryPackage()
  {
    return (QueryPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QueryPackage getPackage()
  {
    return QueryPackage.eINSTANCE;
  }

} //QueryFactoryImpl
