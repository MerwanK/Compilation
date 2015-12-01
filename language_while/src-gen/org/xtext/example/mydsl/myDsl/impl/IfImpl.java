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
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IfImpl#getExp4 <em>Exp4</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IfImpl#getCom5 <em>Com5</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IfImpl#getCom6 <em>Com6</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfImpl extends MinimalEObjectImpl.Container implements If
{
  /**
   * The cached value of the '{@link #getExp4() <em>Exp4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp4()
   * @generated
   * @ordered
   */
  protected Expr exp4;

  /**
   * The cached value of the '{@link #getCom5() <em>Com5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCom5()
   * @generated
   * @ordered
   */
  protected Commandes com5;

  /**
   * The cached value of the '{@link #getCom6() <em>Com6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCom6()
   * @generated
   * @ordered
   */
  protected Commandes com6;

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
  public Expr getExp4()
  {
    return exp4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp4(Expr newExp4, NotificationChain msgs)
  {
    Expr oldExp4 = exp4;
    exp4 = newExp4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IF__EXP4, oldExp4, newExp4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp4(Expr newExp4)
  {
    if (newExp4 != exp4)
    {
      NotificationChain msgs = null;
      if (exp4 != null)
        msgs = ((InternalEObject)exp4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF__EXP4, null, msgs);
      if (newExp4 != null)
        msgs = ((InternalEObject)newExp4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF__EXP4, null, msgs);
      msgs = basicSetExp4(newExp4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF__EXP4, newExp4, newExp4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commandes getCom5()
  {
    return com5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCom5(Commandes newCom5, NotificationChain msgs)
  {
    Commandes oldCom5 = com5;
    com5 = newCom5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IF__COM5, oldCom5, newCom5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCom5(Commandes newCom5)
  {
    if (newCom5 != com5)
    {
      NotificationChain msgs = null;
      if (com5 != null)
        msgs = ((InternalEObject)com5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF__COM5, null, msgs);
      if (newCom5 != null)
        msgs = ((InternalEObject)newCom5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF__COM5, null, msgs);
      msgs = basicSetCom5(newCom5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF__COM5, newCom5, newCom5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commandes getCom6()
  {
    return com6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCom6(Commandes newCom6, NotificationChain msgs)
  {
    Commandes oldCom6 = com6;
    com6 = newCom6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IF__COM6, oldCom6, newCom6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCom6(Commandes newCom6)
  {
    if (newCom6 != com6)
    {
      NotificationChain msgs = null;
      if (com6 != null)
        msgs = ((InternalEObject)com6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF__COM6, null, msgs);
      if (newCom6 != null)
        msgs = ((InternalEObject)newCom6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF__COM6, null, msgs);
      msgs = basicSetCom6(newCom6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF__COM6, newCom6, newCom6));
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
      case MyDslPackage.IF__EXP4:
        return basicSetExp4(null, msgs);
      case MyDslPackage.IF__COM5:
        return basicSetCom5(null, msgs);
      case MyDslPackage.IF__COM6:
        return basicSetCom6(null, msgs);
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
      case MyDslPackage.IF__EXP4:
        return getExp4();
      case MyDslPackage.IF__COM5:
        return getCom5();
      case MyDslPackage.IF__COM6:
        return getCom6();
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
      case MyDslPackage.IF__EXP4:
        setExp4((Expr)newValue);
        return;
      case MyDslPackage.IF__COM5:
        setCom5((Commandes)newValue);
        return;
      case MyDslPackage.IF__COM6:
        setCom6((Commandes)newValue);
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
      case MyDslPackage.IF__EXP4:
        setExp4((Expr)null);
        return;
      case MyDslPackage.IF__COM5:
        setCom5((Commandes)null);
        return;
      case MyDslPackage.IF__COM6:
        setCom6((Commandes)null);
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
      case MyDslPackage.IF__EXP4:
        return exp4 != null;
      case MyDslPackage.IF__COM5:
        return com5 != null;
      case MyDslPackage.IF__COM6:
        return com6 != null;
    }
    return super.eIsSet(featureID);
  }

} //IfImpl
