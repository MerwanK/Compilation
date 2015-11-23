/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commandes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Commandes#getCom1 <em>Com1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Commandes#getCom2 <em>Com2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommandes()
 * @model
 * @generated
 */
public interface Commandes extends EObject
{
  /**
   * Returns the value of the '<em><b>Com1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Com1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Com1</em>' containment reference.
   * @see #setCom1(Commande)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommandes_Com1()
   * @model containment="true"
   * @generated
   */
  Commande getCom1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Commandes#getCom1 <em>Com1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Com1</em>' containment reference.
   * @see #getCom1()
   * @generated
   */
  void setCom1(Commande value);

  /**
   * Returns the value of the '<em><b>Com2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Commande}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Com2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Com2</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommandes_Com2()
   * @model containment="true"
   * @generated
   */
  EList<Commande> getCom2();

} // Commandes
