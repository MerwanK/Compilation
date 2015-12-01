/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Liste</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Liste#getLe2 <em>Le2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getListe()
 * @model
 * @generated
 */
public interface Liste extends EObject
{
  /**
   * Returns the value of the '<em><b>Le2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Le2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Le2</em>' containment reference.
   * @see #setLe2(LExpr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getListe_Le2()
   * @model containment="true"
   * @generated
   */
  LExpr getLe2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Liste#getLe2 <em>Le2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Le2</em>' containment reference.
   * @see #getLe2()
   * @generated
   */
  void setLe2(LExpr value);

} // Liste
