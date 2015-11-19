/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Eq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprEq#getExpS <em>Exp S</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprEq#getExpS2 <em>Exp S2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprEq#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprEq()
 * @model
 * @generated
 */
public interface ExprEq extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp S</em>' containment reference.
   * @see #setExpS(ExprSimple)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprEq_ExpS()
   * @model containment="true"
   * @generated
   */
  ExprSimple getExpS();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprEq#getExpS <em>Exp S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp S</em>' containment reference.
   * @see #getExpS()
   * @generated
   */
  void setExpS(ExprSimple value);

  /**
   * Returns the value of the '<em><b>Exp S2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp S2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp S2</em>' containment reference.
   * @see #setExpS2(ExprSimple)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprEq_ExpS2()
   * @model containment="true"
   * @generated
   */
  ExprSimple getExpS2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprEq#getExpS2 <em>Exp S2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp S2</em>' containment reference.
   * @see #getExpS2()
   * @generated
   */
  void setExpS2(ExprSimple value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprEq_Exp()
   * @model containment="true"
   * @generated
   */
  Expr getExp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprEq#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expr value);

} // ExprEq
