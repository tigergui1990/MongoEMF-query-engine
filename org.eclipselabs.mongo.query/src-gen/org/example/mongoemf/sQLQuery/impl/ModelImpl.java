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

import org.example.mongoemf.sQLQuery.Database;
import org.example.mongoemf.sQLQuery.Model;
import org.example.mongoemf.sQLQuery.QueryCondition;
import org.example.mongoemf.sQLQuery.SQLQueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.example.mongoemf.sQLQuery.impl.ModelImpl#getAttrs <em>Attrs</em>}</li>
 *   <li>{@link org.example.mongoemf.sQLQuery.impl.ModelImpl#getDb <em>Db</em>}</li>
 *   <li>{@link org.example.mongoemf.sQLQuery.impl.ModelImpl#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getAttrs() <em>Attrs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrs()
   * @generated
   * @ordered
   */
  protected static final String ATTRS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttrs() <em>Attrs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrs()
   * @generated
   * @ordered
   */
  protected String attrs = ATTRS_EDEFAULT;

  /**
   * The cached value of the '{@link #getDb() <em>Db</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDb()
   * @generated
   * @ordered
   */
  protected Database db;

  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected QueryCondition query;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return SQLQueryPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttrs()
  {
    return attrs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttrs(String newAttrs)
  {
    String oldAttrs = attrs;
    attrs = newAttrs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SQLQueryPackage.MODEL__ATTRS, oldAttrs, attrs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Database getDb()
  {
    return db;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDb(Database newDb, NotificationChain msgs)
  {
    Database oldDb = db;
    db = newDb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLQueryPackage.MODEL__DB, oldDb, newDb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDb(Database newDb)
  {
    if (newDb != db)
    {
      NotificationChain msgs = null;
      if (db != null)
        msgs = ((InternalEObject)db).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLQueryPackage.MODEL__DB, null, msgs);
      if (newDb != null)
        msgs = ((InternalEObject)newDb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SQLQueryPackage.MODEL__DB, null, msgs);
      msgs = basicSetDb(newDb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SQLQueryPackage.MODEL__DB, newDb, newDb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryCondition getQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuery(QueryCondition newQuery, NotificationChain msgs)
  {
    QueryCondition oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLQueryPackage.MODEL__QUERY, oldQuery, newQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(QueryCondition newQuery)
  {
    if (newQuery != query)
    {
      NotificationChain msgs = null;
      if (query != null)
        msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLQueryPackage.MODEL__QUERY, null, msgs);
      if (newQuery != null)
        msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SQLQueryPackage.MODEL__QUERY, null, msgs);
      msgs = basicSetQuery(newQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SQLQueryPackage.MODEL__QUERY, newQuery, newQuery));
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
      case SQLQueryPackage.MODEL__DB:
        return basicSetDb(null, msgs);
      case SQLQueryPackage.MODEL__QUERY:
        return basicSetQuery(null, msgs);
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
      case SQLQueryPackage.MODEL__ATTRS:
        return getAttrs();
      case SQLQueryPackage.MODEL__DB:
        return getDb();
      case SQLQueryPackage.MODEL__QUERY:
        return getQuery();
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
      case SQLQueryPackage.MODEL__ATTRS:
        setAttrs((String)newValue);
        return;
      case SQLQueryPackage.MODEL__DB:
        setDb((Database)newValue);
        return;
      case SQLQueryPackage.MODEL__QUERY:
        setQuery((QueryCondition)newValue);
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
      case SQLQueryPackage.MODEL__ATTRS:
        setAttrs(ATTRS_EDEFAULT);
        return;
      case SQLQueryPackage.MODEL__DB:
        setDb((Database)null);
        return;
      case SQLQueryPackage.MODEL__QUERY:
        setQuery((QueryCondition)null);
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
      case SQLQueryPackage.MODEL__ATTRS:
        return ATTRS_EDEFAULT == null ? attrs != null : !ATTRS_EDEFAULT.equals(attrs);
      case SQLQueryPackage.MODEL__DB:
        return db != null;
      case SQLQueryPackage.MODEL__QUERY:
        return query != null;
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
    result.append(" (attrs: ");
    result.append(attrs);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
