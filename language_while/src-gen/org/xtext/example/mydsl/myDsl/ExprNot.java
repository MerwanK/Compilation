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
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprNot#getExprNotNot <em>Expr Not Not</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ExprNot#getExprNotDo <em>Expr Not Do</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprNot()
 * @model
 * @generated
 */
public interface ExprNot extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr Not Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Not Not</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Not Not</em>' containment reference.
   * @see #setExprNotNot(ExprNotNot)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprNot_ExprNotNot()
   * @model containment="true"
   * @generated
   */
  ExprNotNot getExprNotNot();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprNot#getExprNotNot <em>Expr Not Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Not Not</em>' containment reference.
   * @see #getExprNotNot()
   * @generated
   */
  void setExprNotNot(ExprNotNot value);

  /**
   * Returns the value of the '<em><b>Expr Not Do</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Not Do</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Not Do</em>' containment reference.
   * @see #setExprNotDo(ExprNotDo)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExprNot_ExprNotDo()
   * @model containment="true"
   * @generated
   */
  ExprNotDo getExprNotDo();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ExprNot#getExprNotDo <em>Expr Not Do</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Not Do</em>' containment reference.
   * @see #getExprNotDo()
   * @generated
   */
  void setExprNotDo(ExprNotDo value);

} // ExprNot
