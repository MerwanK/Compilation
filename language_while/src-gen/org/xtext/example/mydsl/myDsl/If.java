/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If#getExp4 <em>Exp4</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If#getCom5 <em>Com5</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If#getCom6 <em>Com6</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf()
 * @model
 * @generated
 */
public interface If extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_Exp4()
   * @model containment="true"
   * @generated
   */
  Expr getExp4();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If#getExp4 <em>Exp4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp4</em>' containment reference.
   * @see #getExp4()
   * @generated
   */
  void setExp4(Expr value);

  /**
   * Returns the value of the '<em><b>Com5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Com5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Com5</em>' containment reference.
   * @see #setCom5(Commandes)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_Com5()
   * @model containment="true"
   * @generated
   */
  Commandes getCom5();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If#getCom5 <em>Com5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Com5</em>' containment reference.
   * @see #getCom5()
   * @generated
   */
  void setCom5(Commandes value);

  /**
   * Returns the value of the '<em><b>Com6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Com6</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Com6</em>' containment reference.
   * @see #setCom6(Commandes)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_Com6()
   * @model containment="true"
   * @generated
   */
  Commandes getCom6();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If#getCom6 <em>Com6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Com6</em>' containment reference.
   * @see #getCom6()
   * @generated
   */
  void setCom6(Commandes value);

} // If
