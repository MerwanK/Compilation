/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Cons;
import org.xtext.example.mydsl.myDsl.ExprSimple;
import org.xtext.example.mydsl.myDsl.Hd;
import org.xtext.example.mydsl.myDsl.Liste;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SymboleEx;
import org.xtext.example.mydsl.myDsl.Tl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getVide <em>Vide</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getSymbole <em>Symbole</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getCons <em>Cons</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getListe <em>Liste</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getHd <em>Hd</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getTl <em>Tl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getSymbolEx <em>Symbol Ex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprSimpleImpl extends MinimalEObjectImpl.Container implements ExprSimple
{
  /**
   * The default value of the '{@link #getVide() <em>Vide</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVide()
   * @generated
   * @ordered
   */
  protected static final String VIDE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVide() <em>Vide</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVide()
   * @generated
   * @ordered
   */
  protected String vide = VIDE_EDEFAULT;

  /**
   * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected String variable = VARIABLE_EDEFAULT;

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
   * The cached value of the '{@link #getCons() <em>Cons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCons()
   * @generated
   * @ordered
   */
  protected Cons cons;

  /**
   * The cached value of the '{@link #getListe() <em>Liste</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListe()
   * @generated
   * @ordered
   */
  protected Liste liste;

  /**
   * The cached value of the '{@link #getHd() <em>Hd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHd()
   * @generated
   * @ordered
   */
  protected Hd hd;

  /**
   * The cached value of the '{@link #getTl() <em>Tl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTl()
   * @generated
   * @ordered
   */
  protected Tl tl;

  /**
   * The cached value of the '{@link #getSymbolEx() <em>Symbol Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbolEx()
   * @generated
   * @ordered
   */
  protected SymboleEx symbolEx;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprSimpleImpl()
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
    return MyDslPackage.Literals.EXPR_SIMPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVide()
  {
    return vide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVide(String newVide)
  {
    String oldVide = vide;
    vide = newVide;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__VIDE, oldVide, vide));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(String newVariable)
  {
    String oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__VARIABLE, oldVariable, variable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__SYMBOLE, oldSymbole, symbole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cons getCons()
  {
    return cons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCons(Cons newCons, NotificationChain msgs)
  {
    Cons oldCons = cons;
    cons = newCons;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__CONS, oldCons, newCons);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCons(Cons newCons)
  {
    if (newCons != cons)
    {
      NotificationChain msgs = null;
      if (cons != null)
        msgs = ((InternalEObject)cons).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__CONS, null, msgs);
      if (newCons != null)
        msgs = ((InternalEObject)newCons).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__CONS, null, msgs);
      msgs = basicSetCons(newCons, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__CONS, newCons, newCons));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Liste getListe()
  {
    return liste;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetListe(Liste newListe, NotificationChain msgs)
  {
    Liste oldListe = liste;
    liste = newListe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__LISTE, oldListe, newListe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListe(Liste newListe)
  {
    if (newListe != liste)
    {
      NotificationChain msgs = null;
      if (liste != null)
        msgs = ((InternalEObject)liste).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__LISTE, null, msgs);
      if (newListe != null)
        msgs = ((InternalEObject)newListe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__LISTE, null, msgs);
      msgs = basicSetListe(newListe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__LISTE, newListe, newListe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hd getHd()
  {
    return hd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHd(Hd newHd, NotificationChain msgs)
  {
    Hd oldHd = hd;
    hd = newHd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__HD, oldHd, newHd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHd(Hd newHd)
  {
    if (newHd != hd)
    {
      NotificationChain msgs = null;
      if (hd != null)
        msgs = ((InternalEObject)hd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__HD, null, msgs);
      if (newHd != null)
        msgs = ((InternalEObject)newHd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__HD, null, msgs);
      msgs = basicSetHd(newHd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__HD, newHd, newHd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tl getTl()
  {
    return tl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTl(Tl newTl, NotificationChain msgs)
  {
    Tl oldTl = tl;
    tl = newTl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__TL, oldTl, newTl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTl(Tl newTl)
  {
    if (newTl != tl)
    {
      NotificationChain msgs = null;
      if (tl != null)
        msgs = ((InternalEObject)tl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__TL, null, msgs);
      if (newTl != null)
        msgs = ((InternalEObject)newTl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__TL, null, msgs);
      msgs = basicSetTl(newTl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__TL, newTl, newTl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymboleEx getSymbolEx()
  {
    return symbolEx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSymbolEx(SymboleEx newSymbolEx, NotificationChain msgs)
  {
    SymboleEx oldSymbolEx = symbolEx;
    symbolEx = newSymbolEx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__SYMBOL_EX, oldSymbolEx, newSymbolEx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbolEx(SymboleEx newSymbolEx)
  {
    if (newSymbolEx != symbolEx)
    {
      NotificationChain msgs = null;
      if (symbolEx != null)
        msgs = ((InternalEObject)symbolEx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__SYMBOL_EX, null, msgs);
      if (newSymbolEx != null)
        msgs = ((InternalEObject)newSymbolEx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__SYMBOL_EX, null, msgs);
      msgs = basicSetSymbolEx(newSymbolEx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__SYMBOL_EX, newSymbolEx, newSymbolEx));
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
      case MyDslPackage.EXPR_SIMPLE__CONS:
        return basicSetCons(null, msgs);
      case MyDslPackage.EXPR_SIMPLE__LISTE:
        return basicSetListe(null, msgs);
      case MyDslPackage.EXPR_SIMPLE__HD:
        return basicSetHd(null, msgs);
      case MyDslPackage.EXPR_SIMPLE__TL:
        return basicSetTl(null, msgs);
      case MyDslPackage.EXPR_SIMPLE__SYMBOL_EX:
        return basicSetSymbolEx(null, msgs);
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
      case MyDslPackage.EXPR_SIMPLE__VIDE:
        return getVide();
      case MyDslPackage.EXPR_SIMPLE__VARIABLE:
        return getVariable();
      case MyDslPackage.EXPR_SIMPLE__SYMBOLE:
        return getSymbole();
      case MyDslPackage.EXPR_SIMPLE__CONS:
        return getCons();
      case MyDslPackage.EXPR_SIMPLE__LISTE:
        return getListe();
      case MyDslPackage.EXPR_SIMPLE__HD:
        return getHd();
      case MyDslPackage.EXPR_SIMPLE__TL:
        return getTl();
      case MyDslPackage.EXPR_SIMPLE__SYMBOL_EX:
        return getSymbolEx();
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
      case MyDslPackage.EXPR_SIMPLE__VIDE:
        setVide((String)newValue);
        return;
      case MyDslPackage.EXPR_SIMPLE__VARIABLE:
        setVariable((String)newValue);
        return;
      case MyDslPackage.EXPR_SIMPLE__SYMBOLE:
        setSymbole((String)newValue);
        return;
      case MyDslPackage.EXPR_SIMPLE__CONS:
        setCons((Cons)newValue);
        return;
      case MyDslPackage.EXPR_SIMPLE__LISTE:
        setListe((Liste)newValue);
        return;
      case MyDslPackage.EXPR_SIMPLE__HD:
        setHd((Hd)newValue);
        return;
      case MyDslPackage.EXPR_SIMPLE__TL:
        setTl((Tl)newValue);
        return;
      case MyDslPackage.EXPR_SIMPLE__SYMBOL_EX:
        setSymbolEx((SymboleEx)newValue);
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
      case MyDslPackage.EXPR_SIMPLE__VIDE:
        setVide(VIDE_EDEFAULT);
        return;
      case MyDslPackage.EXPR_SIMPLE__VARIABLE:
        setVariable(VARIABLE_EDEFAULT);
        return;
      case MyDslPackage.EXPR_SIMPLE__SYMBOLE:
        setSymbole(SYMBOLE_EDEFAULT);
        return;
      case MyDslPackage.EXPR_SIMPLE__CONS:
        setCons((Cons)null);
        return;
      case MyDslPackage.EXPR_SIMPLE__LISTE:
        setListe((Liste)null);
        return;
      case MyDslPackage.EXPR_SIMPLE__HD:
        setHd((Hd)null);
        return;
      case MyDslPackage.EXPR_SIMPLE__TL:
        setTl((Tl)null);
        return;
      case MyDslPackage.EXPR_SIMPLE__SYMBOL_EX:
        setSymbolEx((SymboleEx)null);
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
      case MyDslPackage.EXPR_SIMPLE__VIDE:
        return VIDE_EDEFAULT == null ? vide != null : !VIDE_EDEFAULT.equals(vide);
      case MyDslPackage.EXPR_SIMPLE__VARIABLE:
        return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
      case MyDslPackage.EXPR_SIMPLE__SYMBOLE:
        return SYMBOLE_EDEFAULT == null ? symbole != null : !SYMBOLE_EDEFAULT.equals(symbole);
      case MyDslPackage.EXPR_SIMPLE__CONS:
        return cons != null;
      case MyDslPackage.EXPR_SIMPLE__LISTE:
        return liste != null;
      case MyDslPackage.EXPR_SIMPLE__HD:
        return hd != null;
      case MyDslPackage.EXPR_SIMPLE__TL:
        return tl != null;
      case MyDslPackage.EXPR_SIMPLE__SYMBOL_EX:
        return symbolEx != null;
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
    result.append(" (vide: ");
    result.append(vide);
    result.append(", variable: ");
    result.append(variable);
    result.append(", symbole: ");
    result.append(symbole);
    result.append(')');
    return result.toString();
  }

} //ExprSimpleImpl
