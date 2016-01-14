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

import org.xtext.example.mydsl.myDsl.ExprNot;
import org.xtext.example.mydsl.myDsl.ExprOr;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprOrImpl#getExpN <em>Exp N</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprOrImpl#getExpN2 <em>Exp N2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprOrImpl extends MinimalEObjectImpl.Container implements ExprOr
{
  /**
   * The cached value of the '{@link #getExpN() <em>Exp N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpN()
   * @generated
   * @ordered
   */
  protected ExprNot expN;

  /**
   * The cached value of the '{@link #getExpN2() <em>Exp N2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpN2()
   * @generated
   * @ordered
   */
  protected EList<ExprNot> expN2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprOrImpl()
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
    return MyDslPackage.Literals.EXPR_OR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprNot getExpN()
  {
    return expN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpN(ExprNot newExpN, NotificationChain msgs)
  {
    ExprNot oldExpN = expN;
    expN = newExpN;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_OR__EXP_N, oldExpN, newExpN);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpN(ExprNot newExpN)
  {
    if (newExpN != expN)
    {
      NotificationChain msgs = null;
      if (expN != null)
        msgs = ((InternalEObject)expN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_OR__EXP_N, null, msgs);
      if (newExpN != null)
        msgs = ((InternalEObject)newExpN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_OR__EXP_N, null, msgs);
      msgs = basicSetExpN(newExpN, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_OR__EXP_N, newExpN, newExpN));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExprNot> getExpN2()
  {
    if (expN2 == null)
    {
      expN2 = new EObjectContainmentEList<ExprNot>(ExprNot.class, this, MyDslPackage.EXPR_OR__EXP_N2);
    }
    return expN2;
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
      case MyDslPackage.EXPR_OR__EXP_N:
        return basicSetExpN(null, msgs);
      case MyDslPackage.EXPR_OR__EXP_N2:
        return ((InternalEList<?>)getExpN2()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.EXPR_OR__EXP_N:
        return getExpN();
      case MyDslPackage.EXPR_OR__EXP_N2:
        return getExpN2();
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
      case MyDslPackage.EXPR_OR__EXP_N:
        setExpN((ExprNot)newValue);
        return;
      case MyDslPackage.EXPR_OR__EXP_N2:
        getExpN2().clear();
        getExpN2().addAll((Collection<? extends ExprNot>)newValue);
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
      case MyDslPackage.EXPR_OR__EXP_N:
        setExpN((ExprNot)null);
        return;
      case MyDslPackage.EXPR_OR__EXP_N2:
        getExpN2().clear();
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
      case MyDslPackage.EXPR_OR__EXP_N:
        return expN != null;
      case MyDslPackage.EXPR_OR__EXP_N2:
        return expN2 != null && !expN2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExprOrImpl
