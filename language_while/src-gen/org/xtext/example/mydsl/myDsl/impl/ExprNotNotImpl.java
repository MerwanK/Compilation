/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.ExprEq;
import org.xtext.example.mydsl.myDsl.ExprNotNot;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Not Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprNotNotImpl#getExpEq1 <em>Exp Eq1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprNotNotImpl extends MinimalEObjectImpl.Container implements ExprNotNot
{
  /**
   * The cached value of the '{@link #getExpEq1() <em>Exp Eq1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpEq1()
   * @generated
   * @ordered
   */
  protected ExprEq expEq1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprNotNotImpl()
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
    return MyDslPackage.Literals.EXPR_NOT_NOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprEq getExpEq1()
  {
    return expEq1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpEq1(ExprEq newExpEq1, NotificationChain msgs)
  {
    ExprEq oldExpEq1 = expEq1;
    expEq1 = newExpEq1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_NOT_NOT__EXP_EQ1, oldExpEq1, newExpEq1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpEq1(ExprEq newExpEq1)
  {
    if (newExpEq1 != expEq1)
    {
      NotificationChain msgs = null;
      if (expEq1 != null)
        msgs = ((InternalEObject)expEq1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_NOT_NOT__EXP_EQ1, null, msgs);
      if (newExpEq1 != null)
        msgs = ((InternalEObject)newExpEq1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_NOT_NOT__EXP_EQ1, null, msgs);
      msgs = basicSetExpEq1(newExpEq1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_NOT_NOT__EXP_EQ1, newExpEq1, newExpEq1));
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
      case MyDslPackage.EXPR_NOT_NOT__EXP_EQ1:
        return basicSetExpEq1(null, msgs);
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
      case MyDslPackage.EXPR_NOT_NOT__EXP_EQ1:
        return getExpEq1();
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
      case MyDslPackage.EXPR_NOT_NOT__EXP_EQ1:
        setExpEq1((ExprEq)newValue);
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
      case MyDslPackage.EXPR_NOT_NOT__EXP_EQ1:
        setExpEq1((ExprEq)null);
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
      case MyDslPackage.EXPR_NOT_NOT__EXP_EQ1:
        return expEq1 != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprNotNotImpl
