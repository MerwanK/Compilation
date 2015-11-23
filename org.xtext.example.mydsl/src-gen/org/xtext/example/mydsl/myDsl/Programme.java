/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Programme#getFonct <em>Fonct</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject
{
  /**
   * Returns the value of the '<em><b>Fonct</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Fonction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fonct</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fonct</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProgramme_Fonct()
   * @model containment="true"
   * @generated
   */
  EList<Fonction> getFonct();

} // Programme
