/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Tl#getLe4 <em>Le4</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTl()
 * @model
 * @generated
 */
public interface Tl extends EObject
{
  /**
   * Returns the value of the '<em><b>Le4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Le4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Le4</em>' containment reference.
   * @see #setLe4(Expr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTl_Le4()
   * @model containment="true"
   * @generated
   */
  Expr getLe4();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Tl#getLe4 <em>Le4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Le4</em>' containment reference.
   * @see #getLe4()
   * @generated
   */
  void setLe4(Expr value);

} // Tl
