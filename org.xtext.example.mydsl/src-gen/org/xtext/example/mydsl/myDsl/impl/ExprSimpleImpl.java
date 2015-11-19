/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Expr;
import org.xtext.example.mydsl.myDsl.ExprSimple;
import org.xtext.example.mydsl.myDsl.LExpr;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getSymbole <em>Symbole</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getLe <em>Le</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getLe2 <em>Le2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getLe3 <em>Le3</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getLe4 <em>Le4</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl#getLe5 <em>Le5</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprSimpleImpl extends MinimalEObjectImpl.Container implements ExprSimple
{
  /**
   * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected static final String VAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected String var = VAR_EDEFAULT;

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
   * The cached value of the '{@link #getLe() <em>Le</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLe()
   * @generated
   * @ordered
   */
  protected LExpr le;

  /**
   * The cached value of the '{@link #getLe2() <em>Le2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLe2()
   * @generated
   * @ordered
   */
  protected LExpr le2;

  /**
   * The cached value of the '{@link #getLe3() <em>Le3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLe3()
   * @generated
   * @ordered
   */
  protected Expr le3;

  /**
   * The cached value of the '{@link #getLe4() <em>Le4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLe4()
   * @generated
   * @ordered
   */
  protected Expr le4;

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
  public String getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(String newVar)
  {
    String oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__VAR, oldVar, var));
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
  public LExpr getLe()
  {
    return le;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLe(LExpr newLe, NotificationChain msgs)
  {
    LExpr oldLe = le;
    le = newLe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__LE, oldLe, newLe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLe(LExpr newLe)
  {
    if (newLe != le)
    {
      NotificationChain msgs = null;
      if (le != null)
        msgs = ((InternalEObject)le).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__LE, null, msgs);
      if (newLe != null)
        msgs = ((InternalEObject)newLe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__LE, null, msgs);
      msgs = basicSetLe(newLe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__LE, newLe, newLe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LExpr getLe2()
  {
    return le2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLe2(LExpr newLe2, NotificationChain msgs)
  {
    LExpr oldLe2 = le2;
    le2 = newLe2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__LE2, oldLe2, newLe2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLe2(LExpr newLe2)
  {
    if (newLe2 != le2)
    {
      NotificationChain msgs = null;
      if (le2 != null)
        msgs = ((InternalEObject)le2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__LE2, null, msgs);
      if (newLe2 != null)
        msgs = ((InternalEObject)newLe2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__LE2, null, msgs);
      msgs = basicSetLe2(newLe2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__LE2, newLe2, newLe2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getLe3()
  {
    return le3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLe3(Expr newLe3, NotificationChain msgs)
  {
    Expr oldLe3 = le3;
    le3 = newLe3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__LE3, oldLe3, newLe3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLe3(Expr newLe3)
  {
    if (newLe3 != le3)
    {
      NotificationChain msgs = null;
      if (le3 != null)
        msgs = ((InternalEObject)le3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__LE3, null, msgs);
      if (newLe3 != null)
        msgs = ((InternalEObject)newLe3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__LE3, null, msgs);
      msgs = basicSetLe3(newLe3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__LE3, newLe3, newLe3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getLe4()
  {
    return le4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLe4(Expr newLe4, NotificationChain msgs)
  {
    Expr oldLe4 = le4;
    le4 = newLe4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__LE4, oldLe4, newLe4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLe4(Expr newLe4)
  {
    if (newLe4 != le4)
    {
      NotificationChain msgs = null;
      if (le4 != null)
        msgs = ((InternalEObject)le4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__LE4, null, msgs);
      if (newLe4 != null)
        msgs = ((InternalEObject)newLe4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__LE4, null, msgs);
      msgs = basicSetLe4(newLe4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__LE4, newLe4, newLe4));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__LE5, oldLe5, newLe5);
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
        msgs = ((InternalEObject)le5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__LE5, null, msgs);
      if (newLe5 != null)
        msgs = ((InternalEObject)newLe5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SIMPLE__LE5, null, msgs);
      msgs = basicSetLe5(newLe5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SIMPLE__LE5, newLe5, newLe5));
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
      case MyDslPackage.EXPR_SIMPLE__LE:
        return basicSetLe(null, msgs);
      case MyDslPackage.EXPR_SIMPLE__LE2:
        return basicSetLe2(null, msgs);
      case MyDslPackage.EXPR_SIMPLE__LE3:
        return basicSetLe3(null, msgs);
      case MyDslPackage.EXPR_SIMPLE__LE4:
        return basicSetLe4(null, msgs);
      case MyDslPackage.EXPR_SIMPLE__LE5:
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
      case MyDslPackage.EXPR_SIMPLE__VAR:
        return getVar();
      case MyDslPackage.EXPR_SIMPLE__SYMBOLE:
        return getSymbole();
      case MyDslPackage.EXPR_SIMPLE__LE:
        return getLe();
      case MyDslPackage.EXPR_SIMPLE__LE2:
        return getLe2();
      case MyDslPackage.EXPR_SIMPLE__LE3:
        return getLe3();
      case MyDslPackage.EXPR_SIMPLE__LE4:
        return getLe4();
      case MyDslPackage.EXPR_SIMPLE__LE5:
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
      case MyDslPackage.EXPR_SIMPLE__VAR:
        setVar((String)newValue);
        return;
      case MyDslPackage.EXPR_SIMPLE__SYMBOLE:
        setSymbole((String)newValue);
        return;
      case MyDslPackage.EXPR_SIMPLE__LE:
        setLe((LExpr)newValue);
        return;
      case MyDslPackage.EXPR_SIMPLE__LE2:
        setLe2((LExpr)newValue);
        return;
      case MyDslPackage.EXPR_SIMPLE__LE3:
        setLe3((Expr)newValue);
        return;
      case MyDslPackage.EXPR_SIMPLE__LE4:
        setLe4((Expr)newValue);
        return;
      case MyDslPackage.EXPR_SIMPLE__LE5:
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
      case MyDslPackage.EXPR_SIMPLE__VAR:
        setVar(VAR_EDEFAULT);
        return;
      case MyDslPackage.EXPR_SIMPLE__SYMBOLE:
        setSymbole(SYMBOLE_EDEFAULT);
        return;
      case MyDslPackage.EXPR_SIMPLE__LE:
        setLe((LExpr)null);
        return;
      case MyDslPackage.EXPR_SIMPLE__LE2:
        setLe2((LExpr)null);
        return;
      case MyDslPackage.EXPR_SIMPLE__LE3:
        setLe3((Expr)null);
        return;
      case MyDslPackage.EXPR_SIMPLE__LE4:
        setLe4((Expr)null);
        return;
      case MyDslPackage.EXPR_SIMPLE__LE5:
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
      case MyDslPackage.EXPR_SIMPLE__VAR:
        return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
      case MyDslPackage.EXPR_SIMPLE__SYMBOLE:
        return SYMBOLE_EDEFAULT == null ? symbole != null : !SYMBOLE_EDEFAULT.equals(symbole);
      case MyDslPackage.EXPR_SIMPLE__LE:
        return le != null;
      case MyDslPackage.EXPR_SIMPLE__LE2:
        return le2 != null;
      case MyDslPackage.EXPR_SIMPLE__LE3:
        return le3 != null;
      case MyDslPackage.EXPR_SIMPLE__LE4:
        return le4 != null;
      case MyDslPackage.EXPR_SIMPLE__LE5:
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
    result.append(" (var: ");
    result.append(var);
    result.append(", symbole: ");
    result.append(symbole);
    result.append(')');
    return result.toString();
  }

} //ExprSimpleImpl
