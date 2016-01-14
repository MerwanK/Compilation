/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprAnd#getExpO <em>Exp O</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprAnd#getExpO2 <em>Exp O2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprAnd()
 * @model
 * @generated
 */
public interface ExprAnd extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp O</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp O</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp O</em>' containment reference.
   * @see #setExpO(ExprOr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprAnd_ExpO()
   * @model containment="true"
   * @generated
   */
  ExprOr getExpO();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprAnd#getExpO <em>Exp O</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp O</em>' containment reference.
   * @see #getExpO()
   * @generated
   */
  void setExpO(ExprOr value);

  /**
   * Returns the value of the '<em><b>Exp O2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ExprOr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp O2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp O2</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprAnd_ExpO2()
   * @model containment="true"
   * @generated
   */
  EList<ExprOr> getExpO2();

} // ExprAnd
