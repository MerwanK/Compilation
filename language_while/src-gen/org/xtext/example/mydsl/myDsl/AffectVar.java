/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affect Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.AffectVar#getVar1 <em>Var1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.AffectVar#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAffectVar()
 * @model
 * @generated
 */
public interface AffectVar extends EObject
{
  /**
   * Returns the value of the '<em><b>Var1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var1</em>' containment reference.
   * @see #setVar1(Vars)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAffectVar_Var1()
   * @model containment="true"
   * @generated
   */
  Vars getVar1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.AffectVar#getVar1 <em>Var1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var1</em>' containment reference.
   * @see #getVar1()
   * @generated
   */
  void setVar1(Vars value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Exprs)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAffectVar_Exp()
   * @model containment="true"
   * @generated
   */
  Exprs getExp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.AffectVar#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Exprs value);

} // AffectVar
