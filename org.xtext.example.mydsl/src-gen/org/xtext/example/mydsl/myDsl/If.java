/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If#getExp3 <em>Exp3</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If#getCom2 <em>Com2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If#getCom3 <em>Com3</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf()
 * @model
 * @generated
 */
public interface If extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_Exp3()
   * @model containment="true"
   * @generated
   */
  Expr getExp3();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If#getExp3 <em>Exp3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp3</em>' containment reference.
   * @see #getExp3()
   * @generated
   */
  void setExp3(Expr value);

  /**
   * Returns the value of the '<em><b>Com2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Com2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Com2</em>' containment reference.
   * @see #setCom2(Commandes)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_Com2()
   * @model containment="true"
   * @generated
   */
  Commandes getCom2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If#getCom2 <em>Com2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Com2</em>' containment reference.
   * @see #getCom2()
   * @generated
   */
  void setCom2(Commandes value);

  /**
   * Returns the value of the '<em><b>Com3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Com3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Com3</em>' containment reference.
   * @see #setCom3(Commandes)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_Com3()
   * @model containment="true"
   * @generated
   */
  Commandes getCom3();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If#getCom3 <em>Com3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Com3</em>' containment reference.
   * @see #getCom3()
   * @generated
   */
  void setCom3(Commandes value);

} // If
