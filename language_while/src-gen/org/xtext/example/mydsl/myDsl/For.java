/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For#getExp3 <em>Exp3</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.For#getCom4 <em>Com4</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor()
 * @model
 * @generated
 */
public interface For extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp3</em>' containment reference.
   * @see #setExp3(Expr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_Exp3()
   * @model containment="true"
   * @generated
   */
  Expr getExp3();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For#getExp3 <em>Exp3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp3</em>' containment reference.
   * @see #getExp3()
   * @generated
   */
  void setExp3(Expr value);

  /**
   * Returns the value of the '<em><b>Com4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Com4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Com4</em>' containment reference.
   * @see #setCom4(Commandes)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFor_Com4()
   * @model containment="true"
   * @generated
   */
  Commandes getCom4();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.For#getCom4 <em>Com4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Com4</em>' containment reference.
   * @see #getCom4()
   * @generated
   */
  void setCom4(Commandes value);

} // For
