/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Hd#getLe3 <em>Le3</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHd()
 * @model
 * @generated
 */
public interface Hd extends EObject
{
  /**
   * Returns the value of the '<em><b>Le3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Le3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Le3</em>' containment reference.
   * @see #setLe3(Expr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getHd_Le3()
   * @model containment="true"
   * @generated
   */
  Expr getLe3();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Hd#getLe3 <em>Le3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Le3</em>' containment reference.
   * @see #getLe3()
   * @generated
   */
  void setLe3(Expr value);

} // Hd
