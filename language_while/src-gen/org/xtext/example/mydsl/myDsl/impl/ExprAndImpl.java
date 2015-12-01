/**
 */
package org.xtext.example.mydsl.myDsl.impl;

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

import org.xtext.example.mydsl.myDsl.ExprAnd;
import org.xtext.example.mydsl.myDsl.ExprOr;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprAndImpl#getExpO <em>Exp O</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprAndImpl#getExpO2 <em>Exp O2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprAndImpl extends MinimalEObjectImpl.Container implements ExprAnd
{
  /**
   * The cached value of the '{@link #getExpO() <em>Exp O</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpO()
   * @generated
   * @ordered
   */
  protected ExprOr expO;

  /**
   * The cached value of the '{@link #getExpO2() <em>Exp O2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpO2()
   * @generated
   * @ordered
   */
  protected EList<ExprOr> expO2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprAndImpl()
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
    return MyDslPackage.Literals.EXPR_AND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprOr getExpO()
  {
    return expO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpO(ExprOr newExpO, NotificationChain msgs)
  {
    ExprOr oldExpO = expO;
    expO = newExpO;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_AND__EXP_O, oldExpO, newExpO);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpO(ExprOr newExpO)
  {
    if (newExpO != expO)
    {
      NotificationChain msgs = null;
      if (expO != null)
        msgs = ((InternalEObject)expO).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_AND__EXP_O, null, msgs);
      if (newExpO != null)
        msgs = ((InternalEObject)newExpO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_AND__EXP_O, null, msgs);
      msgs = basicSetExpO(newExpO, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_AND__EXP_O, newExpO, newExpO));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExprOr> getExpO2()
  {
    if (expO2 == null)
    {
      expO2 = new EObjectContainmentEList<ExprOr>(ExprOr.class, this, MyDslPackage.EXPR_AND__EXP_O2);
    }
    return expO2;
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
      case MyDslPackage.EXPR_AND__EXP_O:
        return basicSetExpO(null, msgs);
      case MyDslPackage.EXPR_AND__EXP_O2:
        return ((InternalEList<?>)getExpO2()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.EXPR_AND__EXP_O:
        return getExpO();
      case MyDslPackage.EXPR_AND__EXP_O2:
        return getExpO2();
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
      case MyDslPackage.EXPR_AND__EXP_O:
        setExpO((ExprOr)newValue);
        return;
      case MyDslPackage.EXPR_AND__EXP_O2:
        getExpO2().clear();
        getExpO2().addAll((Collection<? extends ExprOr>)newValue);
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
      case MyDslPackage.EXPR_AND__EXP_O:
        setExpO((ExprOr)null);
        return;
      case MyDslPackage.EXPR_AND__EXP_O2:
        getExpO2().clear();
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
      case MyDslPackage.EXPR_AND__EXP_O:
        return expO != null;
      case MyDslPackage.EXPR_AND__EXP_O2:
        return expO2 != null && !expO2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExprAndImpl
