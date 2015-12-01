/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.ExprNot;
import org.xtext.example.mydsl.myDsl.ExprNotDo;
import org.xtext.example.mydsl.myDsl.ExprNotNot;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprNotImpl#getExprNotNot <em>Expr Not Not</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprNotImpl#getExprNotDo <em>Expr Not Do</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprNotImpl extends MinimalEObjectImpl.Container implements ExprNot
{
  /**
   * The cached value of the '{@link #getExprNotNot() <em>Expr Not Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprNotNot()
   * @generated
   * @ordered
   */
  protected ExprNotNot exprNotNot;

  /**
   * The cached value of the '{@link #getExprNotDo() <em>Expr Not Do</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprNotDo()
   * @generated
   * @ordered
   */
  protected ExprNotDo exprNotDo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprNotImpl()
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
    return MyDslPackage.Literals.EXPR_NOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprNotNot getExprNotNot()
  {
    return exprNotNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprNotNot(ExprNotNot newExprNotNot, NotificationChain msgs)
  {
    ExprNotNot oldExprNotNot = exprNotNot;
    exprNotNot = newExprNotNot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_NOT__EXPR_NOT_NOT, oldExprNotNot, newExprNotNot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprNotNot(ExprNotNot newExprNotNot)
  {
    if (newExprNotNot != exprNotNot)
    {
      NotificationChain msgs = null;
      if (exprNotNot != null)
        msgs = ((InternalEObject)exprNotNot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_NOT__EXPR_NOT_NOT, null, msgs);
      if (newExprNotNot != null)
        msgs = ((InternalEObject)newExprNotNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_NOT__EXPR_NOT_NOT, null, msgs);
      msgs = basicSetExprNotNot(newExprNotNot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_NOT__EXPR_NOT_NOT, newExprNotNot, newExprNotNot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprNotDo getExprNotDo()
  {
    return exprNotDo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprNotDo(ExprNotDo newExprNotDo, NotificationChain msgs)
  {
    ExprNotDo oldExprNotDo = exprNotDo;
    exprNotDo = newExprNotDo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_NOT__EXPR_NOT_DO, oldExprNotDo, newExprNotDo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprNotDo(ExprNotDo newExprNotDo)
  {
    if (newExprNotDo != exprNotDo)
    {
      NotificationChain msgs = null;
      if (exprNotDo != null)
        msgs = ((InternalEObject)exprNotDo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_NOT__EXPR_NOT_DO, null, msgs);
      if (newExprNotDo != null)
        msgs = ((InternalEObject)newExprNotDo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_NOT__EXPR_NOT_DO, null, msgs);
      msgs = basicSetExprNotDo(newExprNotDo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_NOT__EXPR_NOT_DO, newExprNotDo, newExprNotDo));
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
      case MyDslPackage.EXPR_NOT__EXPR_NOT_NOT:
        return basicSetExprNotNot(null, msgs);
      case MyDslPackage.EXPR_NOT__EXPR_NOT_DO:
        return basicSetExprNotDo(null, msgs);
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
      case MyDslPackage.EXPR_NOT__EXPR_NOT_NOT:
        return getExprNotNot();
      case MyDslPackage.EXPR_NOT__EXPR_NOT_DO:
        return getExprNotDo();
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
      case MyDslPackage.EXPR_NOT__EXPR_NOT_NOT:
        setExprNotNot((ExprNotNot)newValue);
        return;
      case MyDslPackage.EXPR_NOT__EXPR_NOT_DO:
        setExprNotDo((ExprNotDo)newValue);
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
      case MyDslPackage.EXPR_NOT__EXPR_NOT_NOT:
        setExprNotNot((ExprNotNot)null);
        return;
      case MyDslPackage.EXPR_NOT__EXPR_NOT_DO:
        setExprNotDo((ExprNotDo)null);
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
      case MyDslPackage.EXPR_NOT__EXPR_NOT_NOT:
        return exprNotNot != null;
      case MyDslPackage.EXPR_NOT__EXPR_NOT_DO:
        return exprNotDo != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprNotImpl
