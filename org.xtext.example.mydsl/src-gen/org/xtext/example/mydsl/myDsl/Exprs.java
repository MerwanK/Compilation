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
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Exprs#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Exprs#getExp2 <em>Exp2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprs()
 * @model
 * @generated
 */
public interface Exprs extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp1</em>' containment reference.
   * @see #setExp1(Expr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprs_Exp1()
   * @model containment="true"
   * @generated
   */
  Expr getExp1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Exprs#getExp1 <em>Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp1</em>' containment reference.
   * @see #getExp1()
   * @generated
   */
  void setExp1(Expr value);

  /**
   * Returns the value of the '<em><b>Exp2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp2</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprs_Exp2()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getExp2();

} // Exprs
