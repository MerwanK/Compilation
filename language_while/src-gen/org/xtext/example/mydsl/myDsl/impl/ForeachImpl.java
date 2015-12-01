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
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ForeachImpl#getExp5 <em>Exp5</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ForeachImpl#getExp6 <em>Exp6</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ForeachImpl#getCom7 <em>Com7</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeachImpl extends MinimalEObjectImpl.Container implements Foreach
{
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
   * The cached value of the '{@link #getExp6() <em>Exp6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp6()
   * @generated
   * @ordered
   */
  protected Expr exp6;

  /**
   * The cached value of the '{@link #getCom7() <em>Com7</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCom7()
   * @generated
   * @ordered
   */
  protected Commandes com7;

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
  public Expr getExp6()
  {
    return exp6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp6(Expr newExp6, NotificationChain msgs)
  {
    Expr oldExp6 = exp6;
    exp6 = newExp6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__EXP6, oldExp6, newExp6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp6(Expr newExp6)
  {
    if (newExp6 != exp6)
    {
      NotificationChain msgs = null;
      if (exp6 != null)
        msgs = ((InternalEObject)exp6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOREACH__EXP6, null, msgs);
      if (newExp6 != null)
        msgs = ((InternalEObject)newExp6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOREACH__EXP6, null, msgs);
      msgs = basicSetExp6(newExp6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__EXP6, newExp6, newExp6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commandes getCom7()
  {
    return com7;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCom7(Commandes newCom7, NotificationChain msgs)
  {
    Commandes oldCom7 = com7;
    com7 = newCom7;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__COM7, oldCom7, newCom7);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCom7(Commandes newCom7)
  {
    if (newCom7 != com7)
    {
      NotificationChain msgs = null;
      if (com7 != null)
        msgs = ((InternalEObject)com7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOREACH__COM7, null, msgs);
      if (newCom7 != null)
        msgs = ((InternalEObject)newCom7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOREACH__COM7, null, msgs);
      msgs = basicSetCom7(newCom7, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOREACH__COM7, newCom7, newCom7));
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
      case MyDslPackage.FOREACH__EXP5:
        return basicSetExp5(null, msgs);
      case MyDslPackage.FOREACH__EXP6:
        return basicSetExp6(null, msgs);
      case MyDslPackage.FOREACH__COM7:
        return basicSetCom7(null, msgs);
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
      case MyDslPackage.FOREACH__EXP5:
        return getExp5();
      case MyDslPackage.FOREACH__EXP6:
        return getExp6();
      case MyDslPackage.FOREACH__COM7:
        return getCom7();
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
      case MyDslPackage.FOREACH__EXP5:
        setExp5((Expr)newValue);
        return;
      case MyDslPackage.FOREACH__EXP6:
        setExp6((Expr)newValue);
        return;
      case MyDslPackage.FOREACH__COM7:
        setCom7((Commandes)newValue);
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
      case MyDslPackage.FOREACH__EXP5:
        setExp5((Expr)null);
        return;
      case MyDslPackage.FOREACH__EXP6:
        setExp6((Expr)null);
        return;
      case MyDslPackage.FOREACH__COM7:
        setCom7((Commandes)null);
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
      case MyDslPackage.FOREACH__EXP5:
        return exp5 != null;
      case MyDslPackage.FOREACH__EXP6:
        return exp6 != null;
      case MyDslPackage.FOREACH__COM7:
        return com7 != null;
    }
    return super.eIsSet(featureID);
  }

} //ForeachImpl
