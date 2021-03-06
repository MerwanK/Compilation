/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LExpr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LExpr#getExpLe <em>Exp Le</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLExpr()
 * @model
 * @generated
 */
public interface LExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp Le</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Le</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Le</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLExpr_ExpLe()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getExpLe();

} // LExpr
