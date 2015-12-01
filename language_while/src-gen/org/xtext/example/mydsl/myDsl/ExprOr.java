/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprOr#getExpN <em>Exp N</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprOr#getExpN2 <em>Exp N2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprOr()
 * @model
 * @generated
 */
public interface ExprOr extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp N</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp N</em>' containment reference.
   * @see #setExpN(ExprNot)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprOr_ExpN()
   * @model containment="true"
   * @generated
   */
  ExprNot getExpN();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprOr#getExpN <em>Exp N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp N</em>' containment reference.
   * @see #getExpN()
   * @generated
   */
  void setExpN(ExprNot value);

  /**
   * Returns the value of the '<em><b>Exp N2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ExprNot}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp N2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp N2</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprOr_ExpN2()
   * @model containment="true"
   * @generated
   */
  EList<ExprNot> getExpN2();

} // ExprOr
