/**
 * <copyright>
 * </copyright>
 *

 */
package org.example.mongoemf.sQLQuery.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.mongoemf.sQLQuery.Condition;
import org.example.mongoemf.sQLQuery.FollowCondition;
import org.example.mongoemf.sQLQuery.QueryCondition;
import org.example.mongoemf.sQLQuery.SQLQueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.example.mongoemf.sQLQuery.impl.QueryConditionImpl#getStartcond <em>Startcond</em>}</li>
 *   <li>{@link org.example.mongoemf.sQLQuery.impl.QueryConditionImpl#getFollowcond <em>Followcond</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryConditionImpl extends MinimalEObjectImpl.Container implements QueryCondition
{
  /**
   * The cached value of the '{@link #getStartcond() <em>Startcond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartcond()
   * @generated
   * @ordered
   */
  protected Condition startcond;

  /**
   * The cached value of the '{@link #getFollowcond() <em>Followcond</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFollowcond()
   * @generated
   * @ordered
   */
  protected EList<FollowCondition> followcond;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryConditionImpl()
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
    return SQLQueryPackage.Literals.QUERY_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getStartcond()
  {
    return startcond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStartcond(Condition newStartcond, NotificationChain msgs)
  {
    Condition oldStartcond = startcond;
    startcond = newStartcond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLQueryPackage.QUERY_CONDITION__STARTCOND, oldStartcond, newStartcond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartcond(Condition newStartcond)
  {
    if (newStartcond != startcond)
    {
      NotificationChain msgs = null;
      if (startcond != null)
        msgs = ((InternalEObject)startcond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLQueryPackage.QUERY_CONDITION__STARTCOND, null, msgs);
      if (newStartcond != null)
        msgs = ((InternalEObject)newStartcond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SQLQueryPackage.QUERY_CONDITION__STARTCOND, null, msgs);
      msgs = basicSetStartcond(newStartcond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SQLQueryPackage.QUERY_CONDITION__STARTCOND, newStartcond, newStartcond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FollowCondition> getFollowcond()
  {
    if (followcond == null)
    {
      followcond = new EObjectContainmentEList<FollowCondition>(FollowCondition.class, this, SQLQueryPackage.QUERY_CONDITION__FOLLOWCOND);
    }
    return followcond;
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
      case SQLQueryPackage.QUERY_CONDITION__STARTCOND:
        return basicSetStartcond(null, msgs);
      case SQLQueryPackage.QUERY_CONDITION__FOLLOWCOND:
        return ((InternalEList<?>)getFollowcond()).basicRemove(otherEnd, msgs);
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
      case SQLQueryPackage.QUERY_CONDITION__STARTCOND:
        return getStartcond();
      case SQLQueryPackage.QUERY_CONDITION__FOLLOWCOND:
        return getFollowcond();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SQLQueryPackage.QUERY_CONDITION__STARTCOND:
        setStartcond((Condition)newValue);
        return;
      case SQLQueryPackage.QUERY_CONDITION__FOLLOWCOND:
        getFollowcond().clear();
        getFollowcond().addAll((Collection<? extends FollowCondition>)newValue);
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
      case SQLQueryPackage.QUERY_CONDITION__STARTCOND:
        setStartcond((Condition)null);
        return;
      case SQLQueryPackage.QUERY_CONDITION__FOLLOWCOND:
        getFollowcond().clear();
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
      case SQLQueryPackage.QUERY_CONDITION__STARTCOND:
        return startcond != null;
      case SQLQueryPackage.QUERY_CONDITION__FOLLOWCOND:
        return followcond != null && !followcond.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QueryConditionImpl
