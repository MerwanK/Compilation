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
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprEq#getExpS1 <em>Exp S1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprEq#getExpS2 <em>Exp S2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprEq#getExpR <em>Exp R</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprEq()
 * @model
 * @generated
 */
public interface ExprEq extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp S1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp S1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp S1</em>' containment reference.
   * @see #setExpS1(ExprSimple)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprEq_ExpS1()
   * @model containment="true"
   * @generated
   */
  ExprSimple getExpS1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprEq#getExpS1 <em>Exp S1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp S1</em>' containment reference.
   * @see #getExpS1()
   * @generated
   */
  void setExpS1(ExprSimple value);

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
   * Returns the value of the '<em><b>Exp R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp R</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp R</em>' containment reference.
   * @see #setExpR(Expr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprEq_ExpR()
   * @model containment="true"
   * @generated
   */
  Expr getExpR();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprEq#getExpR <em>Exp R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp R</em>' containment reference.
   * @see #getExpR()
   * @generated
   */
  void setExpR(Expr value);

} // ExprEq
