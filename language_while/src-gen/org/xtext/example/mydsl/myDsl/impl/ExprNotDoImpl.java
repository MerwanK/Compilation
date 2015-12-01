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
import org.xtext.example.mydsl.myDsl.ExprNotDo;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Not Do</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprNotDoImpl#getExpEq2 <em>Exp Eq2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprNotDoImpl extends MinimalEObjectImpl.Container implements ExprNotDo
{
  /**
   * The cached value of the '{@link #getExpEq2() <em>Exp Eq2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpEq2()
   * @generated
   * @ordered
   */
  protected ExprEq expEq2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprNotDoImpl()
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
    return MyDslPackage.Literals.EXPR_NOT_DO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprEq getExpEq2()
  {
    return expEq2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpEq2(ExprEq newExpEq2, NotificationChain msgs)
  {
    ExprEq oldExpEq2 = expEq2;
    expEq2 = newExpEq2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_NOT_DO__EXP_EQ2, oldExpEq2, newExpEq2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpEq2(ExprEq newExpEq2)
  {
    if (newExpEq2 != expEq2)
    {
      NotificationChain msgs = null;
      if (expEq2 != null)
        msgs = ((InternalEObject)expEq2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_NOT_DO__EXP_EQ2, null, msgs);
      if (newExpEq2 != null)
        msgs = ((InternalEObject)newExpEq2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_NOT_DO__EXP_EQ2, null, msgs);
      msgs = basicSetExpEq2(newExpEq2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_NOT_DO__EXP_EQ2, newExpEq2, newExpEq2));
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
      case MyDslPackage.EXPR_NOT_DO__EXP_EQ2:
        return basicSetExpEq2(null, msgs);
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
      case MyDslPackage.EXPR_NOT_DO__EXP_EQ2:
        return getExpEq2();
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
      case MyDslPackage.EXPR_NOT_DO__EXP_EQ2:
        setExpEq2((ExprEq)newValue);
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
      case MyDslPackage.EXPR_NOT_DO__EXP_EQ2:
        setExpEq2((ExprEq)null);
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
      case MyDslPackage.EXPR_NOT_DO__EXP_EQ2:
        return expEq2 != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprNotDoImpl
