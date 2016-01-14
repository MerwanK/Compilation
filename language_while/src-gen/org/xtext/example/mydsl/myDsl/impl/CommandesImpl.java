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

import org.xtext.example.mydsl.myDsl.Commande;
import org.xtext.example.mydsl.myDsl.Commandes;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commandes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandesImpl#getCom1 <em>Com1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandesImpl#getCom2 <em>Com2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandesImpl extends MinimalEObjectImpl.Container implements Commandes
{
  /**
   * The cached value of the '{@link #getCom1() <em>Com1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCom1()
   * @generated
   * @ordered
   */
  protected Commande com1;

  /**
   * The cached value of the '{@link #getCom2() <em>Com2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCom2()
   * @generated
   * @ordered
   */
  protected EList<Commande> com2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandesImpl()
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
    return MyDslPackage.Literals.COMMANDES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commande getCom1()
  {
    return com1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCom1(Commande newCom1, NotificationChain msgs)
  {
    Commande oldCom1 = com1;
    com1 = newCom1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDES__COM1, oldCom1, newCom1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCom1(Commande newCom1)
  {
    if (newCom1 != com1)
    {
      NotificationChain msgs = null;
      if (com1 != null)
        msgs = ((InternalEObject)com1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDES__COM1, null, msgs);
      if (newCom1 != null)
        msgs = ((InternalEObject)newCom1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDES__COM1, null, msgs);
      msgs = basicSetCom1(newCom1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDES__COM1, newCom1, newCom1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Commande> getCom2()
  {
    if (com2 == null)
    {
      com2 = new EObjectContainmentEList<Commande>(Commande.class, this, MyDslPackage.COMMANDES__COM2);
    }
    return com2;
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
      case MyDslPackage.COMMANDES__COM1:
        return basicSetCom1(null, msgs);
      case MyDslPackage.COMMANDES__COM2:
        return ((InternalEList<?>)getCom2()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.COMMANDES__COM1:
        return getCom1();
      case MyDslPackage.COMMANDES__COM2:
        return getCom2();
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
      case MyDslPackage.COMMANDES__COM1:
        setCom1((Commande)newValue);
        return;
      case MyDslPackage.COMMANDES__COM2:
        getCom2().clear();
        getCom2().addAll((Collection<? extends Commande>)newValue);
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
      case MyDslPackage.COMMANDES__COM1:
        setCom1((Commande)null);
        return;
      case MyDslPackage.COMMANDES__COM2:
        getCom2().clear();
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
      case MyDslPackage.COMMANDES__COM1:
        return com1 != null;
      case MyDslPackage.COMMANDES__COM2:
        return com2 != null && !com2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CommandesImpl
