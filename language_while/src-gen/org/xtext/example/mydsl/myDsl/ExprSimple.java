/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprSimple#getVide <em>Vide</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprSimple#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprSimple#getSymbole <em>Symbole</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprSimple#getCons <em>Cons</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprSimple#getListe <em>Liste</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprSimple#getHd <em>Hd</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprSimple#getTl <em>Tl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprSimple#getSymbolEx <em>Symbol Ex</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprSimple()
 * @model
 * @generated
 */
public interface ExprSimple extends EObject
{
  /**
   * Returns the value of the '<em><b>Vide</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vide</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vide</em>' attribute.
   * @see #setVide(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprSimple_Vide()
   * @model
   * @generated
   */
  String getVide();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getVide <em>Vide</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vide</em>' attribute.
   * @see #getVide()
   * @generated
   */
  void setVide(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute.
   * @see #setVariable(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprSimple_Variable()
   * @model
   * @generated
   */
  String getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getVariable <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' attribute.
   * @see #getVariable()
   * @generated
   */
  void setVariable(String value);

  /**
   * Returns the value of the '<em><b>Symbole</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbole</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbole</em>' attribute.
   * @see #setSymbole(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprSimple_Symbole()
   * @model
   * @generated
   */
  String getSymbole();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getSymbole <em>Symbole</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbole</em>' attribute.
   * @see #getSymbole()
   * @generated
   */
  void setSymbole(String value);

  /**
   * Returns the value of the '<em><b>Cons</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cons</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cons</em>' containment reference.
   * @see #setCons(Cons)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprSimple_Cons()
   * @model containment="true"
   * @generated
   */
  Cons getCons();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getCons <em>Cons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cons</em>' containment reference.
   * @see #getCons()
   * @generated
   */
  void setCons(Cons value);

  /**
   * Returns the value of the '<em><b>Liste</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Liste</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Liste</em>' containment reference.
   * @see #setListe(Liste)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprSimple_Liste()
   * @model containment="true"
   * @generated
   */
  Liste getListe();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getListe <em>Liste</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Liste</em>' containment reference.
   * @see #getListe()
   * @generated
   */
  void setListe(Liste value);

  /**
   * Returns the value of the '<em><b>Hd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hd</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hd</em>' containment reference.
   * @see #setHd(Hd)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprSimple_Hd()
   * @model containment="true"
   * @generated
   */
  Hd getHd();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getHd <em>Hd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hd</em>' containment reference.
   * @see #getHd()
   * @generated
   */
  void setHd(Hd value);

  /**
   * Returns the value of the '<em><b>Tl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tl</em>' containment reference.
   * @see #setTl(Tl)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprSimple_Tl()
   * @model containment="true"
   * @generated
   */
  Tl getTl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getTl <em>Tl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tl</em>' containment reference.
   * @see #getTl()
   * @generated
   */
  void setTl(Tl value);

  /**
   * Returns the value of the '<em><b>Symbol Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbol Ex</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol Ex</em>' containment reference.
   * @see #setSymbolEx(SymboleEx)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprSimple_SymbolEx()
   * @model containment="true"
   * @generated
   */
  SymboleEx getSymbolEx();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getSymbolEx <em>Symbol Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol Ex</em>' containment reference.
   * @see #getSymbolEx()
   * @generated
   */
  void setSymbolEx(SymboleEx value);

} // ExprSimple
