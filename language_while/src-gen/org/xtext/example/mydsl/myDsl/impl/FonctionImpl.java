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
import org.xtext.example.mydsl.myDsl.Fonction;
import org.xtext.example.mydsl.myDsl.Input;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Output;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fonction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FonctionImpl#getSymbole <em>Symbole</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FonctionImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FonctionImpl#getCom <em>Com</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FonctionImpl#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FonctionImpl extends MinimalEObjectImpl.Container implements Fonction
{
  /**
   * The default value of the '{@link #getSymbole() <em>Symbole</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbole()
   * @generated
   * @ordered
   */
  protected static final String SYMBOLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSymbole() <em>Symbole</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbole()
   * @generated
   * @ordered
   */
  protected String symbole = SYMBOLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getIn() <em>In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn()
   * @generated
   * @ordered
   */
  protected Input in;

  /**
   * The cached value of the '{@link #getCom() <em>Com</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCom()
   * @generated
   * @ordered
   */
  protected Commandes com;

  /**
   * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOut()
   * @generated
   * @ordered
   */
  protected Output out;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FonctionImpl()
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
    return MyDslPackage.Literals.FONCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSymbole()
  {
    return symbole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbole(String newSymbole)
  {
    String oldSymbole = symbole;
    symbole = newSymbole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FONCTION__SYMBOLE, oldSymbole, symbole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input getIn()
  {
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIn(Input newIn, NotificationChain msgs)
  {
    Input oldIn = in;
    in = newIn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FONCTION__IN, oldIn, newIn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIn(Input newIn)
  {
    if (newIn != in)
    {
      NotificationChain msgs = null;
      if (in != null)
        msgs = ((InternalEObject)in).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FONCTION__IN, null, msgs);
      if (newIn != null)
        msgs = ((InternalEObject)newIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FONCTION__IN, null, msgs);
      msgs = basicSetIn(newIn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FONCTION__IN, newIn, newIn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commandes getCom()
  {
    return com;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCom(Commandes newCom, NotificationChain msgs)
  {
    Commandes oldCom = com;
    com = newCom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FONCTION__COM, oldCom, newCom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCom(Commandes newCom)
  {
    if (newCom != com)
    {
      NotificationChain msgs = null;
      if (com != null)
        msgs = ((InternalEObject)com).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FONCTION__COM, null, msgs);
      if (newCom != null)
        msgs = ((InternalEObject)newCom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FONCTION__COM, null, msgs);
      msgs = basicSetCom(newCom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FONCTION__COM, newCom, newCom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output getOut()
  {
    return out;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOut(Output newOut, NotificationChain msgs)
  {
    Output oldOut = out;
    out = newOut;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FONCTION__OUT, oldOut, newOut);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOut(Output newOut)
  {
    if (newOut != out)
    {
      NotificationChain msgs = null;
      if (out != null)
        msgs = ((InternalEObject)out).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FONCTION__OUT, null, msgs);
      if (newOut != null)
        msgs = ((InternalEObject)newOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FONCTION__OUT, null, msgs);
      msgs = basicSetOut(newOut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FONCTION__OUT, newOut, newOut));
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
      case MyDslPackage.FONCTION__IN:
        return basicSetIn(null, msgs);
      case MyDslPackage.FONCTION__COM:
        return basicSetCom(null, msgs);
      case MyDslPackage.FONCTION__OUT:
        return basicSetOut(null, msgs);
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
      case MyDslPackage.FONCTION__SYMBOLE:
        return getSymbole();
      case MyDslPackage.FONCTION__IN:
        return getIn();
      case MyDslPackage.FONCTION__COM:
        return getCom();
      case MyDslPackage.FONCTION__OUT:
        return getOut();
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
      case MyDslPackage.FONCTION__SYMBOLE:
        setSymbole((String)newValue);
        return;
      case MyDslPackage.FONCTION__IN:
        setIn((Input)newValue);
        return;
      case MyDslPackage.FONCTION__COM:
        setCom((Commandes)newValue);
        return;
      case MyDslPackage.FONCTION__OUT:
        setOut((Output)newValue);
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
      case MyDslPackage.FONCTION__SYMBOLE:
        setSymbole(SYMBOLE_EDEFAULT);
        return;
      case MyDslPackage.FONCTION__IN:
        setIn((Input)null);
        return;
      case MyDslPackage.FONCTION__COM:
        setCom((Commandes)null);
        return;
      case MyDslPackage.FONCTION__OUT:
        setOut((Output)null);
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
      case MyDslPackage.FONCTION__SYMBOLE:
        return SYMBOLE_EDEFAULT == null ? symbole != null : !SYMBOLE_EDEFAULT.equals(symbole);
      case MyDslPackage.FONCTION__IN:
        return in != null;
      case MyDslPackage.FONCTION__COM:
        return com != null;
      case MyDslPackage.FONCTION__OUT:
        return out != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (symbole: ");
    result.append(symbole);
    result.append(')');
    return result.toString();
  }

} //FonctionImpl
