/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Cons#getLe1 <em>Le1</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCons()
 * @model
 * @generated
 */
public interface Cons extends EObject
{
  /**
   * Returns the value of the '<em><b>Le1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Le1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Le1</em>' containment reference.
   * @see #setLe1(LExpr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCons_Le1()
   * @model containment="true"
   * @generated
   */
  LExpr getLe1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Cons#getLe1 <em>Le1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Le1</em>' containment reference.
   * @see #getLe1()
   * @generated
   */
  void setLe1(LExpr value);

} // Cons
