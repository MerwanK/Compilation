/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Foreach#getExp4 <em>Exp4</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Foreach#getExp5 <em>Exp5</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Foreach#getCom4 <em>Com4</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForeach()
 * @model
 * @generated
 */
public interface Foreach extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp4</em>' containment reference.
   * @see #setExp4(Expr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForeach_Exp4()
   * @model containment="true"
   * @generated
   */
  Expr getExp4();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Foreach#getExp4 <em>Exp4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp4</em>' containment reference.
   * @see #getExp4()
   * @generated
   */
  void setExp4(Expr value);

  /**
   * Returns the value of the '<em><b>Exp5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp5</em>' containment reference.
   * @see #setExp5(Expr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForeach_Exp5()
   * @model containment="true"
   * @generated
   */
  Expr getExp5();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Foreach#getExp5 <em>Exp5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp5</em>' containment reference.
   * @see #getExp5()
   * @generated
   */
  void setExp5(Expr value);

  /**
   * Returns the value of the '<em><b>Com4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Com4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Com4</em>' containment reference.
   * @see #setCom4(Commandes)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForeach_Com4()
   * @model containment="true"
   * @generated
   */
  Commandes getCom4();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Foreach#getCom4 <em>Com4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Com4</em>' containment reference.
   * @see #getCom4()
   * @generated
   */
  void setCom4(Commandes value);

} // Foreach
