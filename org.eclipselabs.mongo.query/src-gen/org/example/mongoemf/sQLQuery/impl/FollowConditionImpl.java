/**
 * <copyright>
 * </copyright>
 *

 */
package org.example.mongoemf.sQLQuery.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.mongoemf.sQLQuery.Condition;
import org.example.mongoemf.sQLQuery.FollowCondition;
import org.example.mongoemf.sQLQuery.SQLQueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Follow Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.example.mongoemf.sQLQuery.impl.FollowConditionImpl#getConjunction <em>Conjunction</em>}</li>
 *   <li>{@link org.example.mongoemf.sQLQuery.impl.FollowConditionImpl#getCond <em>Cond</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FollowConditionImpl extends MinimalEObjectImpl.Container implements FollowCondition
{
  /**
   * The default value of the '{@link #getConjunction() <em>Conjunction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConjunction()
   * @generated
   * @ordered
   */
  protected static final String CONJUNCTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConjunction() <em>Conjunction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConjunction()
   * @generated
   * @ordered
   */
  protected String conjunction = CONJUNCTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected Condition cond;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FollowConditionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SQLQueryPackage.Literals.FOLLOW_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConjunction()
  {
    return conjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConjunction(String newConjunction)
  {
    String oldConjunction = conjunction;
    conjunction = newConjunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SQLQueryPackage.FOLLOW_CONDITION__CONJUNCTION, oldConjunction, conjunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(Condition newCond, NotificationChain msgs)
  {
    Condition oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLQueryPackage.FOLLOW_CONDITION__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(Condition newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLQueryPackage.FOLLOW_CONDITION__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SQLQueryPackage.FOLLOW_CONDITION__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SQLQueryPackage.FOLLOW_CONDITION__COND, newCond, newCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SQLQueryPackage.FOLLOW_CONDITION__COND:
        return basicSetCond(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SQLQueryPackage.FOLLOW_CONDITION__CONJUNCTION:
        return getConjunction();
      case SQLQueryPackage.FOLLOW_CONDITION__COND:
        return getCond();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SQLQueryPackage.FOLLOW_CONDITION__CONJUNCTION:
        setConjunction((String)newValue);
        return;
      case SQLQueryPackage.FOLLOW_CONDITION__COND:
        setCond((Condition)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SQLQueryPackage.FOLLOW_CONDITION__CONJUNCTION:
        setConjunction(CONJUNCTION_EDEFAULT);
        return;
      case SQLQueryPackage.FOLLOW_CONDITION__COND:
        setCond((Condition)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SQLQueryPackage.FOLLOW_CONDITION__CONJUNCTION:
        return CONJUNCTION_EDEFAULT == null ? conjunction != null : !CONJUNCTION_EDEFAULT.equals(conjunction);
      case SQLQueryPackage.FOLLOW_CONDITION__COND:
        return cond != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (conjunction: ");
    result.append(conjunction);
    result.append(')');
    return result.toString();
  }

} //FollowConditionImpl
