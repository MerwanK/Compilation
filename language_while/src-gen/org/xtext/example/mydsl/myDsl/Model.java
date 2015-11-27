/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getProgramme <em>Programme</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Programme</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Programme</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Programme</em>' containment reference.
   * @see #setProgramme(Programme)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Programme()
   * @model containment="true"
   * @generated
   */
  Programme getProgramme();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Model#getProgramme <em>Programme</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Programme</em>' containment reference.
   * @see #getProgramme()
   * @generated
   */
  void setProgramme(Programme value);

} // Model
