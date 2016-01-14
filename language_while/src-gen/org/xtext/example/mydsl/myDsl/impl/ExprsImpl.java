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

import org.xtext.example.mydsl.myDsl.Expr;
import org.xtext.example.mydsl.myDsl.Exprs;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exprs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprsImpl#getExprS <em>Expr S</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprsImpl#getExprS2 <em>Expr S2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprsImpl extends MinimalEObjectImpl.Container implements Exprs
{
  /**
   * The cached value of the '{@link #getExprS() <em>Expr S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprS()
   * @generated
   * @ordered
   */
  protected Expr exprS;

  /**
   * The cached value of the '{@link #getExprS2() <em>Expr S2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprS2()
   * @generated
   * @ordered
   */
  protected EList<Expr> exprS2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprsImpl()
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
    return MyDslPackage.Literals.EXPRS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExprS()
  {
    return exprS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprS(Expr newExprS, NotificationChain msgs)
  {
    Expr oldExprS = exprS;
    exprS = newExprS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRS__EXPR_S, oldExprS, newExprS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprS(Expr newExprS)
  {
    if (newExprS != exprS)
    {
      NotificationChain msgs = null;
      if (exprS != null)
        msgs = ((InternalEObject)exprS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRS__EXPR_S, null, msgs);
      if (newExprS != null)
        msgs = ((InternalEObject)newExprS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRS__EXPR_S, null, msgs);
      msgs = basicSetExprS(newExprS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRS__EXPR_S, newExprS, newExprS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getExprS2()
  {
    if (exprS2 == null)
    {
      exprS2 = new EObjectContainmentEList<Expr>(Expr.class, this, MyDslPackage.EXPRS__EXPR_S2);
    }
    return exprS2;
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
      case MyDslPackage.EXPRS__EXPR_S:
        return basicSetExprS(null, msgs);
      case MyDslPackage.EXPRS__EXPR_S2:
        return ((InternalEList<?>)getExprS2()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.EXPRS__EXPR_S:
        return getExprS();
      case MyDslPackage.EXPRS__EXPR_S2:
        return getExprS2();
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
      case MyDslPackage.EXPRS__EXPR_S:
        setExprS((Expr)newValue);
        return;
      case MyDslPackage.EXPRS__EXPR_S2:
        getExprS2().clear();
        getExprS2().addAll((Collection<? extends Expr>)newValue);
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
      case MyDslPackage.EXPRS__EXPR_S:
        setExprS((Expr)null);
        return;
      case MyDslPackage.EXPRS__EXPR_S2:
        getExprS2().clear();
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
      case MyDslPackage.EXPRS__EXPR_S:
        return exprS != null;
      case MyDslPackage.EXPRS__EXPR_S2:
        return exprS2 != null && !exprS2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExprsImpl
