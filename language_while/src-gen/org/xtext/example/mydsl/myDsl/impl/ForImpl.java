/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Commandes;
import org.xtext.example.mydsl.myDsl.Expr;
import org.xtext.example.mydsl.myDsl.For;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ForImpl#getExp3 <em>Exp3</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ForImpl#getCom4 <em>Com4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForImpl extends MinimalEObjectImpl.Container implements For
{
  /**
   * The cached value of the '{@link #getExp3() <em>Exp3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp3()
   * @generated
   * @ordered
   */
  protected Expr exp3;

  /**
   * The cached value of the '{@link #getCom4() <em>Com4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCom4()
   * @generated
   * @ordered
   */
  protected Commandes com4;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForImpl()
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
    return MyDslPackage.Literals.FOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExp3()
  {
    return exp3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp3(Expr newExp3, NotificationChain msgs)
  {
    Expr oldExp3 = exp3;
    exp3 = newExp3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR__EXP3, oldExp3, newExp3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp3(Expr newExp3)
  {
    if (newExp3 != exp3)
    {
      NotificationChain msgs = null;
      if (exp3 != null)
        msgs = ((InternalEObject)exp3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR__EXP3, null, msgs);
      if (newExp3 != null)
        msgs = ((InternalEObject)newExp3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR__EXP3, null, msgs);
      msgs = basicSetExp3(newExp3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR__EXP3, newExp3, newExp3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commandes getCom4()
  {
    return com4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCom4(Commandes newCom4, NotificationChain msgs)
  {
    Commandes oldCom4 = com4;
    com4 = newCom4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR__COM4, oldCom4, newCom4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCom4(Commandes newCom4)
  {
    if (newCom4 != com4)
    {
      NotificationChain msgs = null;
      if (com4 != null)
        msgs = ((InternalEObject)com4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR__COM4, null, msgs);
      if (newCom4 != null)
        msgs = ((InternalEObject)newCom4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOR__COM4, null, msgs);
      msgs = basicSetCom4(newCom4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOR__COM4, newCom4, newCom4));
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
      case MyDslPackage.FOR__EXP3:
        return basicSetExp3(null, msgs);
      case MyDslPackage.FOR__COM4:
        return basicSetCom4(null, msgs);
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
      case MyDslPackage.FOR__EXP3:
        return getExp3();
      case MyDslPackage.FOR__COM4:
        return getCom4();
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
      case MyDslPackage.FOR__EXP3:
        setExp3((Expr)newValue);
        return;
      case MyDslPackage.FOR__COM4:
        setCom4((Commandes)newValue);
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
      case MyDslPackage.FOR__EXP3:
        setExp3((Expr)null);
        return;
      case MyDslPackage.FOR__COM4:
        setCom4((Commandes)null);
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
      case MyDslPackage.FOR__EXP3:
        return exp3 != null;
      case MyDslPackage.FOR__COM4:
        return com4 != null;
    }
    return super.eIsSet(featureID);
  }

} //ForImpl
