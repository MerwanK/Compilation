/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Expr;
import org.xtext.example.mydsl.myDsl.ExprEq;
import org.xtext.example.mydsl.myDsl.ExprSimple;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Eq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprEqImpl#getExpSi <em>Exp Si</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprEqImpl#getExpS2 <em>Exp S2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprEqImpl#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprEqImpl extends MinimalEObjectImpl.Container implements ExprEq
{
  /**
   * The cached value of the '{@link #getExpSi() <em>Exp Si</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpSi()
   * @generated
   * @ordered
   */
  protected ExprSimple expSi;

  /**
   * The cached value of the '{@link #getExpS2() <em>Exp S2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpS2()
   * @generated
   * @ordered
   */
  protected ExprSimple expS2;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected Expr exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprEqImpl()
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
    return MyDslPackage.Literals.EXPR_EQ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple getExpSi()
  {
    return expSi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpSi(ExprSimple newExpSi, NotificationChain msgs)
  {
    ExprSimple oldExpSi = expSi;
    expSi = newExpSi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_EQ__EXP_SI, oldExpSi, newExpSi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpSi(ExprSimple newExpSi)
  {
    if (newExpSi != expSi)
    {
      NotificationChain msgs = null;
      if (expSi != null)
        msgs = ((InternalEObject)expSi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_EQ__EXP_SI, null, msgs);
      if (newExpSi != null)
        msgs = ((InternalEObject)newExpSi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_EQ__EXP_SI, null, msgs);
      msgs = basicSetExpSi(newExpSi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_EQ__EXP_SI, newExpSi, newExpSi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple getExpS2()
  {
    return expS2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpS2(ExprSimple newExpS2, NotificationChain msgs)
  {
    ExprSimple oldExpS2 = expS2;
    expS2 = newExpS2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_EQ__EXP_S2, oldExpS2, newExpS2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpS2(ExprSimple newExpS2)
  {
    if (newExpS2 != expS2)
    {
      NotificationChain msgs = null;
      if (expS2 != null)
        msgs = ((InternalEObject)expS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_EQ__EXP_S2, null, msgs);
      if (newExpS2 != null)
        msgs = ((InternalEObject)newExpS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_EQ__EXP_S2, null, msgs);
      msgs = basicSetExpS2(newExpS2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_EQ__EXP_S2, newExpS2, newExpS2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(Expr newExp, NotificationChain msgs)
  {
    Expr oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_EQ__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(Expr newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_EQ__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_EQ__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_EQ__EXP, newExp, newExp));
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
      case MyDslPackage.EXPR_EQ__EXP_SI:
        return basicSetExpSi(null, msgs);
      case MyDslPackage.EXPR_EQ__EXP_S2:
        return basicSetExpS2(null, msgs);
      case MyDslPackage.EXPR_EQ__EXP:
        return basicSetExp(null, msgs);
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
      case MyDslPackage.EXPR_EQ__EXP_SI:
        return getExpSi();
      case MyDslPackage.EXPR_EQ__EXP_S2:
        return getExpS2();
      case MyDslPackage.EXPR_EQ__EXP:
        return getExp();
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
      case MyDslPackage.EXPR_EQ__EXP_SI:
        setExpSi((ExprSimple)newValue);
        return;
      case MyDslPackage.EXPR_EQ__EXP_S2:
        setExpS2((ExprSimple)newValue);
        return;
      case MyDslPackage.EXPR_EQ__EXP:
        setExp((Expr)newValue);
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
      case MyDslPackage.EXPR_EQ__EXP_SI:
        setExpSi((ExprSimple)null);
        return;
      case MyDslPackage.EXPR_EQ__EXP_S2:
        setExpS2((ExprSimple)null);
        return;
      case MyDslPackage.EXPR_EQ__EXP:
        setExp((Expr)null);
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
      case MyDslPackage.EXPR_EQ__EXP_SI:
        return expSi != null;
      case MyDslPackage.EXPR_EQ__EXP_S2:
        return expS2 != null;
      case MyDslPackage.EXPR_EQ__EXP:
        return exp != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprEqImpl
