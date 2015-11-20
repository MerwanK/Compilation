/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Commande;
import org.xtext.example.mydsl.myDsl.Commandes;
import org.xtext.example.mydsl.myDsl.Expr;
import org.xtext.example.mydsl.myDsl.Exprs;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Vars;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commande</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getNop <em>Nop</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getExp2 <em>Exp2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getCom <em>Com</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getExp3 <em>Exp3</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getCom2 <em>Com2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getCom3 <em>Com3</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getExp4 <em>Exp4</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getExp5 <em>Exp5</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl#getCom4 <em>Com4</em>}</li>
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
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected Vars var;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected Exprs exp;

  /**
   * The cached value of the '{@link #getExp2() <em>Exp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp2()
   * @generated
   * @ordered
   */
  protected Expr exp2;

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
  public Vars getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(Vars newVar, NotificationChain msgs)
  {
    Vars oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(Vars newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exprs getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(Exprs newExp, NotificationChain msgs)
  {
    Exprs oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(Exprs newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__EXP, newExp, newExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExp2()
  {
    return exp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp2(Expr newExp2, NotificationChain msgs)
  {
    Expr oldExp2 = exp2;
    exp2 = newExp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__EXP2, oldExp2, newExp2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp2(Expr newExp2)
  {
    if (newExp2 != exp2)
    {
      NotificationChain msgs = null;
      if (exp2 != null)
        msgs = ((InternalEObject)exp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__EXP2, null, msgs);
      if (newExp2 != null)
        msgs = ((InternalEObject)newExp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__EXP2, null, msgs);
      msgs = basicSetExp2(newExp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__EXP2, newExp2, newExp2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__COM, oldCom, newCom);
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
        msgs = ((InternalEObject)com).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__COM, null, msgs);
      if (newCom != null)
        msgs = ((InternalEObject)newCom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__COM, null, msgs);
      msgs = basicSetCom(newCom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__COM, newCom, newCom));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__EXP3, oldExp3, newExp3);
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
        msgs = ((InternalEObject)exp3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__EXP3, null, msgs);
      if (newExp3 != null)
        msgs = ((InternalEObject)newExp3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__EXP3, null, msgs);
      msgs = basicSetExp3(newExp3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__EXP3, newExp3, newExp3));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__COM2, oldCom2, newCom2);
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
        msgs = ((InternalEObject)com2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__COM2, null, msgs);
      if (newCom2 != null)
        msgs = ((InternalEObject)newCom2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__COM2, null, msgs);
      msgs = basicSetCom2(newCom2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__COM2, newCom2, newCom2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__COM3, oldCom3, newCom3);
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
        msgs = ((InternalEObject)com3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__COM3, null, msgs);
      if (newCom3 != null)
        msgs = ((InternalEObject)newCom3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__COM3, null, msgs);
      msgs = basicSetCom3(newCom3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__COM3, newCom3, newCom3));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__EXP4, oldExp4, newExp4);
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
        msgs = ((InternalEObject)exp4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__EXP4, null, msgs);
      if (newExp4 != null)
        msgs = ((InternalEObject)newExp4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__EXP4, null, msgs);
      msgs = basicSetExp4(newExp4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__EXP4, newExp4, newExp4));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__EXP5, oldExp5, newExp5);
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
        msgs = ((InternalEObject)exp5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__EXP5, null, msgs);
      if (newExp5 != null)
        msgs = ((InternalEObject)newExp5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__EXP5, null, msgs);
      msgs = basicSetExp5(newExp5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__EXP5, newExp5, newExp5));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__COM4, oldCom4, newCom4);
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
        msgs = ((InternalEObject)com4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__COM4, null, msgs);
      if (newCom4 != null)
        msgs = ((InternalEObject)newCom4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMMANDE__COM4, null, msgs);
      msgs = basicSetCom4(newCom4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMMANDE__COM4, newCom4, newCom4));
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
      case MyDslPackage.COMMANDE__VAR:
        return basicSetVar(null, msgs);
      case MyDslPackage.COMMANDE__EXP:
        return basicSetExp(null, msgs);
      case MyDslPackage.COMMANDE__EXP2:
        return basicSetExp2(null, msgs);
      case MyDslPackage.COMMANDE__COM:
        return basicSetCom(null, msgs);
      case MyDslPackage.COMMANDE__EXP3:
        return basicSetExp3(null, msgs);
      case MyDslPackage.COMMANDE__COM2:
        return basicSetCom2(null, msgs);
      case MyDslPackage.COMMANDE__COM3:
        return basicSetCom3(null, msgs);
      case MyDslPackage.COMMANDE__EXP4:
        return basicSetExp4(null, msgs);
      case MyDslPackage.COMMANDE__EXP5:
        return basicSetExp5(null, msgs);
      case MyDslPackage.COMMANDE__COM4:
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
      case MyDslPackage.COMMANDE__NOP:
        return getNop();
      case MyDslPackage.COMMANDE__VAR:
        return getVar();
      case MyDslPackage.COMMANDE__EXP:
        return getExp();
      case MyDslPackage.COMMANDE__EXP2:
        return getExp2();
      case MyDslPackage.COMMANDE__COM:
        return getCom();
      case MyDslPackage.COMMANDE__EXP3:
        return getExp3();
      case MyDslPackage.COMMANDE__COM2:
        return getCom2();
      case MyDslPackage.COMMANDE__COM3:
        return getCom3();
      case MyDslPackage.COMMANDE__EXP4:
        return getExp4();
      case MyDslPackage.COMMANDE__EXP5:
        return getExp5();
      case MyDslPackage.COMMANDE__COM4:
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
      case MyDslPackage.COMMANDE__NOP:
        setNop((String)newValue);
        return;
      case MyDslPackage.COMMANDE__VAR:
        setVar((Vars)newValue);
        return;
      case MyDslPackage.COMMANDE__EXP:
        setExp((Exprs)newValue);
        return;
      case MyDslPackage.COMMANDE__EXP2:
        setExp2((Expr)newValue);
        return;
      case MyDslPackage.COMMANDE__COM:
        setCom((Commandes)newValue);
        return;
      case MyDslPackage.COMMANDE__EXP3:
        setExp3((Expr)newValue);
        return;
      case MyDslPackage.COMMANDE__COM2:
        setCom2((Commandes)newValue);
        return;
      case MyDslPackage.COMMANDE__COM3:
        setCom3((Commandes)newValue);
        return;
      case MyDslPackage.COMMANDE__EXP4:
        setExp4((Expr)newValue);
        return;
      case MyDslPackage.COMMANDE__EXP5:
        setExp5((Expr)newValue);
        return;
      case MyDslPackage.COMMANDE__COM4:
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
      case MyDslPackage.COMMANDE__NOP:
        setNop(NOP_EDEFAULT);
        return;
      case MyDslPackage.COMMANDE__VAR:
        setVar((Vars)null);
        return;
      case MyDslPackage.COMMANDE__EXP:
        setExp((Exprs)null);
        return;
      case MyDslPackage.COMMANDE__EXP2:
        setExp2((Expr)null);
        return;
      case MyDslPackage.COMMANDE__COM:
        setCom((Commandes)null);
        return;
      case MyDslPackage.COMMANDE__EXP3:
        setExp3((Expr)null);
        return;
      case MyDslPackage.COMMANDE__COM2:
        setCom2((Commandes)null);
        return;
      case MyDslPackage.COMMANDE__COM3:
        setCom3((Commandes)null);
        return;
      case MyDslPackage.COMMANDE__EXP4:
        setExp4((Expr)null);
        return;
      case MyDslPackage.COMMANDE__EXP5:
        setExp5((Expr)null);
        return;
      case MyDslPackage.COMMANDE__COM4:
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
      case MyDslPackage.COMMANDE__NOP:
        return NOP_EDEFAULT == null ? nop != null : !NOP_EDEFAULT.equals(nop);
      case MyDslPackage.COMMANDE__VAR:
        return var != null;
      case MyDslPackage.COMMANDE__EXP:
        return exp != null;
      case MyDslPackage.COMMANDE__EXP2:
        return exp2 != null;
      case MyDslPackage.COMMANDE__COM:
        return com != null;
      case MyDslPackage.COMMANDE__EXP3:
        return exp3 != null;
      case MyDslPackage.COMMANDE__COM2:
        return com2 != null;
      case MyDslPackage.COMMANDE__COM3:
        return com3 != null;
      case MyDslPackage.COMMANDE__EXP4:
        return exp4 != null;
      case MyDslPackage.COMMANDE__EXP5:
        return exp5 != null;
      case MyDslPackage.COMMANDE__COM4:
        return com4 != null;
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
