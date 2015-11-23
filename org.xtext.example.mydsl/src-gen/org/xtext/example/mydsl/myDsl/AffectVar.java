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
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.AffectVar#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.AffectVar#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAffectVar()
 * @model
 * @generated
 */
public interface AffectVar extends EObject
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Vars)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAffectVar_Var()
   * @model containment="true"
   * @generated
   */
  Vars getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.AffectVar#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Vars value);

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
