/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Not Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprNotNot#getExpEq1 <em>Exp Eq1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprNotNot()
 * @model
 * @generated
 */
public interface ExprNotNot extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp Eq1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Eq1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Eq1</em>' containment reference.
   * @see #setExpEq1(ExprEq)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprNotNot_ExpEq1()
   * @model containment="true"
   * @generated
   */
  ExprEq getExpEq1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprNotNot#getExpEq1 <em>Exp Eq1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Eq1</em>' containment reference.
   * @see #getExpEq1()
   * @generated
   */
  void setExpEq1(ExprEq value);

} // ExprNotNot
