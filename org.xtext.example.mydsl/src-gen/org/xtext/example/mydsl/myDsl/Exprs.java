/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exprs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Exprs#getExprS <em>Expr S</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Exprs#getExprS2 <em>Expr S2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprs()
 * @model
 * @generated
 */
public interface Exprs extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr S</em>' containment reference.
   * @see #setExprS(Expr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprs_ExprS()
   * @model containment="true"
   * @generated
   */
  Expr getExprS();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Exprs#getExprS <em>Expr S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr S</em>' containment reference.
   * @see #getExprS()
   * @generated
   */
  void setExprS(Expr value);

  /**
   * Returns the value of the '<em><b>Expr S2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr S2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr S2</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprs_ExprS2()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getExprS2();

} // Exprs
