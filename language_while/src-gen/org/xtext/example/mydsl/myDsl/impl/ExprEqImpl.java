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
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprEqImpl#getExpS1 <em>Exp S1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprEqImpl#getExpS2 <em>Exp S2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprEqImpl#getExpR <em>Exp R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprEqImpl extends MinimalEObjectImpl.Container implements ExprEq
{
  /**
   * The cached value of the '{@link #getExpS1() <em>Exp S1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpS1()
   * @generated
   * @ordered
   */
  protected ExprSimple expS1;

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
   * The cached value of the '{@link #getExpR() <em>Exp R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpR()
   * @generated
   * @ordered
   */
  protected Expr expR;

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
  public ExprSimple getExpS1()
  {
    return expS1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpS1(ExprSimple newExpS1, NotificationChain msgs)
  {
    ExprSimple oldExpS1 = expS1;
    expS1 = newExpS1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_EQ__EXP_S1, oldExpS1, newExpS1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpS1(ExprSimple newExpS1)
  {
    if (newExpS1 != expS1)
    {
      NotificationChain msgs = null;
      if (expS1 != null)
        msgs = ((InternalEObject)expS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_EQ__EXP_S1, null, msgs);
      if (newExpS1 != null)
        msgs = ((InternalEObject)newExpS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_EQ__EXP_S1, null, msgs);
      msgs = basicSetExpS1(newExpS1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_EQ__EXP_S1, newExpS1, newExpS1));
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
  public Expr getExpR()
  {
    return expR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpR(Expr newExpR, NotificationChain msgs)
  {
    Expr oldExpR = expR;
    expR = newExpR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_EQ__EXP_R, oldExpR, newExpR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpR(Expr newExpR)
  {
    if (newExpR != expR)
    {
      NotificationChain msgs = null;
      if (expR != null)
        msgs = ((InternalEObject)expR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_EQ__EXP_R, null, msgs);
      if (newExpR != null)
        msgs = ((InternalEObject)newExpR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_EQ__EXP_R, null, msgs);
      msgs = basicSetExpR(newExpR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_EQ__EXP_R, newExpR, newExpR));
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
      case MyDslPackage.EXPR_EQ__EXP_S1:
        return basicSetExpS1(null, msgs);
      case MyDslPackage.EXPR_EQ__EXP_S2:
        return basicSetExpS2(null, msgs);
      case MyDslPackage.EXPR_EQ__EXP_R:
        return basicSetExpR(null, msgs);
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
      case MyDslPackage.EXPR_EQ__EXP_S1:
        return getExpS1();
      case MyDslPackage.EXPR_EQ__EXP_S2:
        return getExpS2();
      case MyDslPackage.EXPR_EQ__EXP_R:
        return getExpR();
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
      case MyDslPackage.EXPR_EQ__EXP_S1:
        setExpS1((ExprSimple)newValue);
        return;
      case MyDslPackage.EXPR_EQ__EXP_S2:
        setExpS2((ExprSimple)newValue);
        return;
      case MyDslPackage.EXPR_EQ__EXP_R:
        setExpR((Expr)newValue);
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
      case MyDslPackage.EXPR_EQ__EXP_S1:
        setExpS1((ExprSimple)null);
        return;
      case MyDslPackage.EXPR_EQ__EXP_S2:
        setExpS2((ExprSimple)null);
        return;
      case MyDslPackage.EXPR_EQ__EXP_R:
        setExpR((Expr)null);
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
      case MyDslPackage.EXPR_EQ__EXP_S1:
        return expS1 != null;
      case MyDslPackage.EXPR_EQ__EXP_S2:
        return expS2 != null;
      case MyDslPackage.EXPR_EQ__EXP_R:
        return expR != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprEqImpl
