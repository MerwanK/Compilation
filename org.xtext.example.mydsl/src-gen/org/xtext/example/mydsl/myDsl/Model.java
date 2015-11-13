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
   * Returns the value of the '<em><b>Programme</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Programme</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Programme</em>' attribute.
   * @see #setProgramme(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Programme()
   * @model
   * @generated
   */
  String getProgramme();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Model#getProgramme <em>Programme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Programme</em>' attribute.
   * @see #getProgramme()
   * @generated
   */
  void setProgramme(String value);

} // Model
