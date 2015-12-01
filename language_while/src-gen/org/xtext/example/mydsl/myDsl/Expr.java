/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Expr#getExpA <em>Exp A</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Expr#getExpS <em>Exp S</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExpr()
 * @model
 * @generated
 */
public interface Expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp A</em>' containment reference.
   * @see #setExpA(ExprAnd)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExpr_ExpA()
   * @model containment="true"
   * @generated
   */
  ExprAnd getExpA();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Expr#getExpA <em>Exp A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp A</em>' containment reference.
   * @see #getExpA()
   * @generated
   */
  void setExpA(ExprAnd value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExpr_ExpS()
   * @model containment="true"
   * @generated
   */
  ExprSimple getExpS();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Expr#getExpS <em>Exp S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp S</em>' containment reference.
   * @see #getExpS()
   * @generated
   */
  void setExpS(ExprSimple value);

} // Expr
