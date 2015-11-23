/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commande</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Commande#getNop <em>Nop</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Commande#getAffectVar <em>Affect Var</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Commande#getWhileC <em>While C</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Commande#getForC <em>For C</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Commande#getIfC <em>If C</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Commande#getForeachC <em>Foreach C</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommande()
 * @model
 * @generated
 */
public interface Commande extends EObject
{
  /**
   * Returns the value of the '<em><b>Nop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nop</em>' attribute.
   * @see #setNop(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommande_Nop()
   * @model
   * @generated
   */
  String getNop();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Commande#getNop <em>Nop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nop</em>' attribute.
   * @see #getNop()
   * @generated
   */
  void setNop(String value);

  /**
   * Returns the value of the '<em><b>Affect Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Affect Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Affect Var</em>' containment reference.
   * @see #setAffectVar(AffectVar)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommande_AffectVar()
   * @model containment="true"
   * @generated
   */
  AffectVar getAffectVar();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Commande#getAffectVar <em>Affect Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Affect Var</em>' containment reference.
   * @see #getAffectVar()
   * @generated
   */
  void setAffectVar(AffectVar value);

  /**
   * Returns the value of the '<em><b>While C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While C</em>' containment reference.
   * @see #setWhileC(While)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommande_WhileC()
   * @model containment="true"
   * @generated
   */
  While getWhileC();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Commande#getWhileC <em>While C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While C</em>' containment reference.
   * @see #getWhileC()
   * @generated
   */
  void setWhileC(While value);

  /**
   * Returns the value of the '<em><b>For C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For C</em>' containment reference.
   * @see #setForC(For)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommande_ForC()
   * @model containment="true"
   * @generated
   */
  For getForC();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Commande#getForC <em>For C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For C</em>' containment reference.
   * @see #getForC()
   * @generated
   */
  void setForC(For value);

  /**
   * Returns the value of the '<em><b>If C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If C</em>' containment reference.
   * @see #setIfC(If)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommande_IfC()
   * @model containment="true"
   * @generated
   */
  If getIfC();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Commande#getIfC <em>If C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If C</em>' containment reference.
   * @see #getIfC()
   * @generated
   */
  void setIfC(If value);

  /**
   * Returns the value of the '<em><b>Foreach C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreach C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreach C</em>' containment reference.
   * @see #setForeachC(Foreach)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommande_ForeachC()
   * @model containment="true"
   * @generated
   */
  Foreach getForeachC();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Commande#getForeachC <em>Foreach C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreach C</em>' containment reference.
   * @see #getForeachC()
   * @generated
   */
  void setForeachC(Foreach value);

} // Commande
