/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.LExpr;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SymboleEx;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbole Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SymboleExImpl#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SymboleExImpl#getLe5 <em>Le5</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymboleExImpl extends MinimalEObjectImpl.Container implements SymboleEx
{
  /**
   * The default value of the '{@link #getP() <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected static final String P_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getP() <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected String p = P_EDEFAULT;

  /**
   * The cached value of the '{@link #getLe5() <em>Le5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLe5()
   * @generated
   * @ordered
   */
  protected LExpr le5;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SymboleExImpl()
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
    return MyDslPackage.Literals.SYMBOLE_EX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getP()
  {
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setP(String newP)
  {
    String oldP = p;
    p = newP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SYMBOLE_EX__P, oldP, p));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LExpr getLe5()
  {
    return le5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLe5(LExpr newLe5, NotificationChain msgs)
  {
    LExpr oldLe5 = le5;
    le5 = newLe5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SYMBOLE_EX__LE5, oldLe5, newLe5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLe5(LExpr newLe5)
  {
    if (newLe5 != le5)
    {
      NotificationChain msgs = null;
      if (le5 != null)
        msgs = ((InternalEObject)le5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SYMBOLE_EX__LE5, null, msgs);
      if (newLe5 != null)
        msgs = ((InternalEObject)newLe5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SYMBOLE_EX__LE5, null, msgs);
      msgs = basicSetLe5(newLe5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SYMBOLE_EX__LE5, newLe5, newLe5));
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
      case MyDslPackage.SYMBOLE_EX__LE5:
        return basicSetLe5(null, msgs);
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
      case MyDslPackage.SYMBOLE_EX__P:
        return getP();
      case MyDslPackage.SYMBOLE_EX__LE5:
        return getLe5();
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
      case MyDslPackage.SYMBOLE_EX__P:
        setP((String)newValue);
        return;
      case MyDslPackage.SYMBOLE_EX__LE5:
        setLe5((LExpr)newValue);
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
      case MyDslPackage.SYMBOLE_EX__P:
        setP(P_EDEFAULT);
        return;
      case MyDslPackage.SYMBOLE_EX__LE5:
        setLe5((LExpr)null);
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
      case MyDslPackage.SYMBOLE_EX__P:
        return P_EDEFAULT == null ? p != null : !P_EDEFAULT.equals(p);
      case MyDslPackage.SYMBOLE_EX__LE5:
        return le5 != null;
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
    result.append(" (p: ");
    result.append(p);
    result.append(')');
    return result.toString();
  }

} //SymboleExImpl
