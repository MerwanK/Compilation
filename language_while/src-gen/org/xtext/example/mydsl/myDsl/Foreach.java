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
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Foreach#getExp5 <em>Exp5</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Foreach#getExp6 <em>Exp6</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Foreach#getCom7 <em>Com7</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForeach()
 * @model
 * @generated
 */
public interface Foreach extends EObject
{
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
   * Returns the value of the '<em><b>Exp6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp6</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp6</em>' containment reference.
   * @see #setExp6(Expr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForeach_Exp6()
   * @model containment="true"
   * @generated
   */
  Expr getExp6();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Foreach#getExp6 <em>Exp6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp6</em>' containment reference.
   * @see #getExp6()
   * @generated
   */
  void setExp6(Expr value);

  /**
   * Returns the value of the '<em><b>Com7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Com7</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Com7</em>' containment reference.
   * @see #setCom7(Commandes)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForeach_Com7()
   * @model containment="true"
   * @generated
   */
  Commandes getCom7();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Foreach#getCom7 <em>Com7</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Com7</em>' containment reference.
   * @see #getCom7()
   * @generated
   */
  void setCom7(Commandes value);

} // Foreach
