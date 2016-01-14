/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbole Ex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SymboleEx#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SymboleEx#getLe5 <em>Le5</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSymboleEx()
 * @model
 * @generated
 */
public interface SymboleEx extends EObject
{
  /**
   * Returns the value of the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' attribute.
   * @see #setP(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSymboleEx_P()
   * @model
   * @generated
   */
  String getP();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.SymboleEx#getP <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' attribute.
   * @see #getP()
   * @generated
   */
  void setP(String value);

  /**
   * Returns the value of the '<em><b>Le5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Le5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Le5</em>' containment reference.
   * @see #setLe5(LExpr2)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSymboleEx_Le5()
   * @model containment="true"
   * @generated
   */
  LExpr2 getLe5();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.SymboleEx#getLe5 <em>Le5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Le5</em>' containment reference.
   * @see #getLe5()
   * @generated
   */
  void setLe5(LExpr2 value);

} // SymboleEx
