/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.While#getExp2 <em>Exp2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.While#getCom <em>Com</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp2</em>' containment reference.
   * @see #setExp2(Expr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getWhile_Exp2()
   * @model containment="true"
   * @generated
   */
  Expr getExp2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.While#getExp2 <em>Exp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp2</em>' containment reference.
   * @see #getExp2()
   * @generated
   */
  void setExp2(Expr value);

  /**
   * Returns the value of the '<em><b>Com</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Com</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Com</em>' containment reference.
   * @see #setCom(Commandes)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getWhile_Com()
   * @model containment="true"
   * @generated
   */
  Commandes getCom();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.While#getCom <em>Com</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Com</em>' containment reference.
   * @see #getCom()
   * @generated
   */
  void setCom(Commandes value);

} // While
