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
import org.xtext.example.mydsl.myDsl.If;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IfImpl#getExp3 <em>Exp3</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IfImpl#getCom2 <em>Com2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IfImpl#getCom3 <em>Com3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfImpl extends MinimalEObjectImpl.Container implements If
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
   * The cached value of the '{@link #getCom2() <em>Com2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCom2()
   * @generated
   * @ordered
   */
  protected Commandes com2;

  /**
   * The cached value of the '{@link #getCom3() <em>Com3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCom3()
   * @generated
   * @ordered
   */
  protected Commandes com3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfImpl()
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
    return MyDslPackage.Literals.IF;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IF__EXP3, oldExp3, newExp3);
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
        msgs = ((InternalEObject)exp3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF__EXP3, null, msgs);
      if (newExp3 != null)
        msgs = ((InternalEObject)newExp3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF__EXP3, null, msgs);
      msgs = basicSetExp3(newExp3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF__EXP3, newExp3, newExp3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commandes getCom2()
  {
    return com2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCom2(Commandes newCom2, NotificationChain msgs)
  {
    Commandes oldCom2 = com2;
    com2 = newCom2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IF__COM2, oldCom2, newCom2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCom2(Commandes newCom2)
  {
    if (newCom2 != com2)
    {
      NotificationChain msgs = null;
      if (com2 != null)
        msgs = ((InternalEObject)com2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF__COM2, null, msgs);
      if (newCom2 != null)
        msgs = ((InternalEObject)newCom2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF__COM2, null, msgs);
      msgs = basicSetCom2(newCom2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF__COM2, newCom2, newCom2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commandes getCom3()
  {
    return com3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCom3(Commandes newCom3, NotificationChain msgs)
  {
    Commandes oldCom3 = com3;
    com3 = newCom3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IF__COM3, oldCom3, newCom3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCom3(Commandes newCom3)
  {
    if (newCom3 != com3)
    {
      NotificationChain msgs = null;
      if (com3 != null)
        msgs = ((InternalEObject)com3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF__COM3, null, msgs);
      if (newCom3 != null)
        msgs = ((InternalEObject)newCom3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF__COM3, null, msgs);
      msgs = basicSetCom3(newCom3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF__COM3, newCom3, newCom3));
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
      case MyDslPackage.IF__EXP3:
        return basicSetExp3(null, msgs);
      case MyDslPackage.IF__COM2:
        return basicSetCom2(null, msgs);
      case MyDslPackage.IF__COM3:
        return basicSetCom3(null, msgs);
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
      case MyDslPackage.IF__EXP3:
        return getExp3();
      case MyDslPackage.IF__COM2:
        return getCom2();
      case MyDslPackage.IF__COM3:
        return getCom3();
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
      case MyDslPackage.IF__EXP3:
        setExp3((Expr)newValue);
        return;
      case MyDslPackage.IF__COM2:
        setCom2((Commandes)newValue);
        return;
      case MyDslPackage.IF__COM3:
        setCom3((Commandes)newValue);
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
      case MyDslPackage.IF__EXP3:
        setExp3((Expr)null);
        return;
      case MyDslPackage.IF__COM2:
        setCom2((Commandes)null);
        return;
      case MyDslPackage.IF__COM3:
        setCom3((Commandes)null);
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
      case MyDslPackage.IF__EXP3:
        return exp3 != null;
      case MyDslPackage.IF__COM2:
        return com2 != null;
      case MyDslPackage.IF__COM3:
        return com3 != null;
    }
    return super.eIsSet(featureID);
  }

} //IfImpl
