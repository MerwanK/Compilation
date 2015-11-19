/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fonction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Fonction#getSymbole <em>Symbole</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Fonction#getIn <em>In</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Fonction#getCom <em>Com</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Fonction#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFonction()
 * @model
 * @generated
 */
public interface Fonction extends EObject
{
  /**
   * Returns the value of the '<em><b>Symbole</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbole</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbole</em>' attribute.
   * @see #setSymbole(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFonction_Symbole()
   * @model
   * @generated
   */
  String getSymbole();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Fonction#getSymbole <em>Symbole</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbole</em>' attribute.
   * @see #getSymbole()
   * @generated
   */
  void setSymbole(String value);

  /**
   * Returns the value of the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In</em>' containment reference.
   * @see #setIn(Input)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFonction_In()
   * @model containment="true"
   * @generated
   */
  Input getIn();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Fonction#getIn <em>In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In</em>' containment reference.
   * @see #getIn()
   * @generated
   */
  void setIn(Input value);

  /**
   * Returns the value of the '<em><b>Com</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Com</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Com</em>' containment reference.
   * @see #setCom(Commandes)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFonction_Com()
   * @model containment="true"
   * @generated
   */
  Commandes getCom();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Fonction#getCom <em>Com</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Com</em>' containment reference.
   * @see #getCom()
   * @generated
   */
  void setCom(Commandes value);

  /**
   * Returns the value of the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out</em>' containment reference.
   * @see #setOut(Output)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFonction_Out()
   * @model containment="true"
   * @generated
   */
  Output getOut();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Fonction#getOut <em>Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out</em>' containment reference.
   * @see #getOut()
   * @generated
   */
  void setOut(Output value);

} // Fonction
