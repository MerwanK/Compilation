/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Not Do</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprNotDo#getExpEq2 <em>Exp Eq2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprNotDo()
 * @model
 * @generated
 */
public interface ExprNotDo extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp Eq2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Eq2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Eq2</em>' containment reference.
   * @see #setExpEq2(ExprEq)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprNotDo_ExpEq2()
   * @model containment="true"
   * @generated
   */
  ExprEq getExpEq2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprNotDo#getExpEq2 <em>Exp Eq2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Eq2</em>' containment reference.
   * @see #getExpEq2()
   * @generated
   */
  void setExpEq2(ExprEq value);

} // ExprNotDo
