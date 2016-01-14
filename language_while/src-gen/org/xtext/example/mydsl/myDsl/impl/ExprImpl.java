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
import org.xtext.example.mydsl.myDsl.ExprAnd;
import org.xtext.example.mydsl.myDsl.ExprSimple;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprImpl#getExpA <em>Exp A</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprImpl#getExpS <em>Exp S</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprImpl extends MinimalEObjectImpl.Container implements Expr
{
  /**
   * The cached value of the '{@link #getExpA() <em>Exp A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpA()
   * @generated
   * @ordered
   */
  protected ExprAnd expA;

  /**
   * The cached value of the '{@link #getExpS() <em>Exp S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpS()
   * @generated
   * @ordered
   */
  protected ExprSimple expS;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprImpl()
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
    return MyDslPackage.Literals.EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAnd getExpA()
  {
    return expA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpA(ExprAnd newExpA, NotificationChain msgs)
  {
    ExprAnd oldExpA = expA;
    expA = newExpA;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR__EXP_A, oldExpA, newExpA);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpA(ExprAnd newExpA)
  {
    if (newExpA != expA)
    {
      NotificationChain msgs = null;
      if (expA != null)
        msgs = ((InternalEObject)expA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR__EXP_A, null, msgs);
      if (newExpA != null)
        msgs = ((InternalEObject)newExpA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR__EXP_A, null, msgs);
      msgs = basicSetExpA(newExpA, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR__EXP_A, newExpA, newExpA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple getExpS()
  {
    return expS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpS(ExprSimple newExpS, NotificationChain msgs)
  {
    ExprSimple oldExpS = expS;
    expS = newExpS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR__EXP_S, oldExpS, newExpS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpS(ExprSimple newExpS)
  {
    if (newExpS != expS)
    {
      NotificationChain msgs = null;
      if (expS != null)
        msgs = ((InternalEObject)expS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR__EXP_S, null, msgs);
      if (newExpS != null)
        msgs = ((InternalEObject)newExpS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR__EXP_S, null, msgs);
      msgs = basicSetExpS(newExpS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR__EXP_S, newExpS, newExpS));
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
      case MyDslPackage.EXPR__EXP_A:
        return basicSetExpA(null, msgs);
      case MyDslPackage.EXPR__EXP_S:
        return basicSetExpS(null, msgs);
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
      case MyDslPackage.EXPR__EXP_A:
        return getExpA();
      case MyDslPackage.EXPR__EXP_S:
        return getExpS();
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
      case MyDslPackage.EXPR__EXP_A:
        setExpA((ExprAnd)newValue);
        return;
      case MyDslPackage.EXPR__EXP_S:
        setExpS((ExprSimple)newValue);
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
      case MyDslPackage.EXPR__EXP_A:
        setExpA((ExprAnd)null);
        return;
      case MyDslPackage.EXPR__EXP_S:
        setExpS((ExprSimple)null);
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
      case MyDslPackage.EXPR__EXP_A:
        return expA != null;
      case MyDslPackage.EXPR__EXP_S:
        return expS != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprImpl
