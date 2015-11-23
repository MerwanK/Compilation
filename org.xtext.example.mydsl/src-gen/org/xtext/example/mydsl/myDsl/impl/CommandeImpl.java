/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.AffectVar;
import org.xtext.example.mydsl.myDsl.Commande;
import org.xtext.example.mydsl.myDsl.For;
import org.xtext.example.mydsl.myDsl.Foreach;
import org.xtext.example.mydsl.myDsl.If;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commande</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getNop <em>Nop</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getAffectVar <em>Affect Var</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getWhileC <em>While C</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getForC <em>For C</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getIfC <em>If C</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getForeachC <em>Foreach C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandeImpl extends MinimalEObjectImpl.Container implements Commande
{
  /**
   * The default value of the '{@link #getNop() <em>Nop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNop()
   * @generated
   * @ordered
   */
  protected static final String NOP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNop() <em>Nop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNop()
   * @generated
   * @ordered
   */
  protected String nop = NOP_EDEFAULT;

  /**
   * The cached value of the '{@link #getAffectVar() <em>Affect Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAffectVar()
   * @generated
   * @ordered
   */
  protected AffectVar affectVar;

  /**
   * The cached value of the '{@link #getWhileC() <em>While C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhileC()
   * @generated
   * @ordered
   */
  protected While whileC;

  /**
   * The cached value of the '{@link #getForC() <em>For C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForC()
   * @generated
   * @ordered
   */
  protected For forC;

  /**
   * The cached value of the '{@link #getIfC() <em>If C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfC()
   * @generated
   * @ordered
   */
  protected If ifC;

  /**
   * The cached value of the '{@link #getForeachC() <em>Foreach C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeachC()
   * @generated
   * @ordered
   */
  protected Foreach foreachC;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandeImpl()
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
    return MyDslPackage.Literals.COMMANDE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNop()
  {
    return nop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNop(String newNop)
  {
    String oldNop = nop;
    nop = newNop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__NOP, oldNop, nop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AffectVar getAffectVar()
  {
    return affectVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAffectVar(AffectVar newAffectVar, NotificationChain msgs)
  {
    AffectVar oldAffectVar = affectVar;
    affectVar = newAffectVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__AFFECT_VAR, oldAffectVar, newAffectVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAffectVar(AffectVar newAffectVar)
  {
    if (newAffectVar != affectVar)
    {
      NotificationChain msgs = null;
      if (affectVar != null)
        msgs = ((InternalEObject)affectVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__AFFECT_VAR, null, msgs);
      if (newAffectVar != null)
        msgs = ((InternalEObject)newAffectVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__AFFECT_VAR, null, msgs);
      msgs = basicSetAffectVar(newAffectVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__AFFECT_VAR, newAffectVar, newAffectVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While getWhileC()
  {
    return whileC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhileC(While newWhileC, NotificationChain msgs)
  {
    While oldWhileC = whileC;
    whileC = newWhileC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__WHILE_C, oldWhileC, newWhileC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhileC(While newWhileC)
  {
    if (newWhileC != whileC)
    {
      NotificationChain msgs = null;
      if (whileC != null)
        msgs = ((InternalEObject)whileC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__WHILE_C, null, msgs);
      if (newWhileC != null)
        msgs = ((InternalEObject)newWhileC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__WHILE_C, null, msgs);
      msgs = basicSetWhileC(newWhileC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__WHILE_C, newWhileC, newWhileC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For getForC()
  {
    return forC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForC(For newForC, NotificationChain msgs)
  {
    For oldForC = forC;
    forC = newForC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__FOR_C, oldForC, newForC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForC(For newForC)
  {
    if (newForC != forC)
    {
      NotificationChain msgs = null;
      if (forC != null)
        msgs = ((InternalEObject)forC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__FOR_C, null, msgs);
      if (newForC != null)
        msgs = ((InternalEObject)newForC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__FOR_C, null, msgs);
      msgs = basicSetForC(newForC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__FOR_C, newForC, newForC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If getIfC()
  {
    return ifC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfC(If newIfC, NotificationChain msgs)
  {
    If oldIfC = ifC;
    ifC = newIfC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__IF_C, oldIfC, newIfC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfC(If newIfC)
  {
    if (newIfC != ifC)
    {
      NotificationChain msgs = null;
      if (ifC != null)
        msgs = ((InternalEObject)ifC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__IF_C, null, msgs);
      if (newIfC != null)
        msgs = ((InternalEObject)newIfC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__IF_C, null, msgs);
      msgs = basicSetIfC(newIfC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__IF_C, newIfC, newIfC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Foreach getForeachC()
  {
    return foreachC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForeachC(Foreach newForeachC, NotificationChain msgs)
  {
    Foreach oldForeachC = foreachC;
    foreachC = newForeachC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__FOREACH_C, oldForeachC, newForeachC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForeachC(Foreach newForeachC)
  {
    if (newForeachC != foreachC)
    {
      NotificationChain msgs = null;
      if (foreachC != null)
        msgs = ((InternalEObject)foreachC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__FOREACH_C, null, msgs);
      if (newForeachC != null)
        msgs = ((InternalEObject)newForeachC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__FOREACH_C, null, msgs);
      msgs = basicSetForeachC(newForeachC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__FOREACH_C, newForeachC, newForeachC));
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
      case MyDslPackage.COMMANDE__AFFECT_VAR:
        return basicSetAffectVar(null, msgs);
      case MyDslPackage.COMMANDE__WHILE_C:
        return basicSetWhileC(null, msgs);
      case MyDslPackage.COMMANDE__FOR_C:
        return basicSetForC(null, msgs);
      case MyDslPackage.COMMANDE__IF_C:
        return basicSetIfC(null, msgs);
      case MyDslPackage.COMMANDE__FOREACH_C:
        return basicSetForeachC(null, msgs);
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
      case MyDslPackage.COMMANDE__NOP:
        return getNop();
      case MyDslPackage.COMMANDE__AFFECT_VAR:
        return getAffectVar();
      case MyDslPackage.COMMANDE__WHILE_C:
        return getWhileC();
      case MyDslPackage.COMMANDE__FOR_C:
        return getForC();
      case MyDslPackage.COMMANDE__IF_C:
        return getIfC();
      case MyDslPackage.COMMANDE__FOREACH_C:
        return getForeachC();
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
      case MyDslPackage.COMMANDE__NOP:
        setNop((String)newValue);
        return;
      case MyDslPackage.COMMANDE__AFFECT_VAR:
        setAffectVar((AffectVar)newValue);
        return;
      case MyDslPackage.COMMANDE__WHILE_C:
        setWhileC((While)newValue);
        return;
      case MyDslPackage.COMMANDE__FOR_C:
        setForC((For)newValue);
        return;
      case MyDslPackage.COMMANDE__IF_C:
        setIfC((If)newValue);
        return;
      case MyDslPackage.COMMANDE__FOREACH_C:
        setForeachC((Foreach)newValue);
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
      case MyDslPackage.COMMANDE__NOP:
        setNop(NOP_EDEFAULT);
        return;
      case MyDslPackage.COMMANDE__AFFECT_VAR:
        setAffectVar((AffectVar)null);
        return;
      case MyDslPackage.COMMANDE__WHILE_C:
        setWhileC((While)null);
        return;
      case MyDslPackage.COMMANDE__FOR_C:
        setForC((For)null);
        return;
      case MyDslPackage.COMMANDE__IF_C:
        setIfC((If)null);
        return;
      case MyDslPackage.COMMANDE__FOREACH_C:
        setForeachC((Foreach)null);
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
      case MyDslPackage.COMMANDE__NOP:
        return NOP_EDEFAULT == null ? nop != null : !NOP_EDEFAULT.equals(nop);
      case MyDslPackage.COMMANDE__AFFECT_VAR:
        return affectVar != null;
      case MyDslPackage.COMMANDE__WHILE_C:
        return whileC != null;
      case MyDslPackage.COMMANDE__FOR_C:
        return forC != null;
      case MyDslPackage.COMMANDE__IF_C:
        return ifC != null;
      case MyDslPackage.COMMANDE__FOREACH_C:
        return foreachC != null;
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
    result.append(" (nop: ");
    result.append(nop);
    result.append(')');
    return result.toString();
  }

} //CommandeImpl
