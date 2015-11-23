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
import org.xtext.example.mydsl.myDsl.Foreach;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ForeachImpl#getExp4 <em>Exp4</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ForeachImpl#getExp5 <em>Exp5</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ForeachImpl#getCom4 <em>Com4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeachImpl extends MinimalEObjectImpl.Container implements Foreach
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
   * The cached value of the '{@link #getExp5() <em>Exp5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp5()
   * @generated
   * @ordered
   */
  protected Expr exp5;

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
  protected ForeachImpl()
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
    return MyDslPackage.Literals.FOREACH;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__EXP4, oldExp4, newExp4);
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
        msgs = ((InternalEObject)exp4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOREACH__EXP4, null, msgs);
      if (newExp4 != null)
        msgs = ((InternalEObject)newExp4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOREACH__EXP4, null, msgs);
      msgs = basicSetExp4(newExp4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__EXP4, newExp4, newExp4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExp5()
  {
    return exp5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp5(Expr newExp5, NotificationChain msgs)
  {
    Expr oldExp5 = exp5;
    exp5 = newExp5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__EXP5, oldExp5, newExp5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp5(Expr newExp5)
  {
    if (newExp5 != exp5)
    {
      NotificationChain msgs = null;
      if (exp5 != null)
        msgs = ((InternalEObject)exp5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOREACH__EXP5, null, msgs);
      if (newExp5 != null)
        msgs = ((InternalEObject)newExp5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOREACH__EXP5, null, msgs);
      msgs = basicSetExp5(newExp5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__EXP5, newExp5, newExp5));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__COM4, oldCom4, newCom4);
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
        msgs = ((InternalEObject)com4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOREACH__COM4, null, msgs);
      if (newCom4 != null)
        msgs = ((InternalEObject)newCom4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOREACH__COM4, null, msgs);
      msgs = basicSetCom4(newCom4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__COM4, newCom4, newCom4));
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
      case MyDslPackage.FOREACH__EXP4:
        return basicSetExp4(null, msgs);
      case MyDslPackage.FOREACH__EXP5:
        return basicSetExp5(null, msgs);
      case MyDslPackage.FOREACH__COM4:
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
      case MyDslPackage.FOREACH__EXP4:
        return getExp4();
      case MyDslPackage.FOREACH__EXP5:
        return getExp5();
      case MyDslPackage.FOREACH__COM4:
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
      case MyDslPackage.FOREACH__EXP4:
        setExp4((Expr)newValue);
        return;
      case MyDslPackage.FOREACH__EXP5:
        setExp5((Expr)newValue);
        return;
      case MyDslPackage.FOREACH__COM4:
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
      case MyDslPackage.FOREACH__EXP4:
        setExp4((Expr)null);
        return;
      case MyDslPackage.FOREACH__EXP5:
        setExp5((Expr)null);
        return;
      case MyDslPackage.FOREACH__COM4:
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
      case MyDslPackage.FOREACH__EXP4:
        return exp4 != null;
      case MyDslPackage.FOREACH__EXP5:
        return exp5 != null;
      case MyDslPackage.FOREACH__COM4:
        return com4 != null;
    }
    return super.eIsSet(featureID);
  }

} //ForeachImpl
