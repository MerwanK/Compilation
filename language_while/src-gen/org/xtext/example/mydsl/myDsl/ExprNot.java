/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprNot#getExpEq <em>Exp Eq</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprNot()
 * @model
 * @generated
 */
public interface ExprNot extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp Eq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Eq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Eq</em>' containment reference.
   * @see #setExpEq(ExprEq)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprNot_ExpEq()
   * @model containment="true"
   * @generated
   */
  ExprEq getExpEq();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprNot#getExpEq <em>Exp Eq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Eq</em>' containment reference.
   * @see #getExpEq()
   * @generated
   */
  void setExpEq(ExprEq value);

} // ExprNot
