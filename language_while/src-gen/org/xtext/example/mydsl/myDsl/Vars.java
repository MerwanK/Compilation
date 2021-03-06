/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vars</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Vars#getVar2 <em>Var2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Vars#getVar3 <em>Var3</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVars()
 * @model
 * @generated
 */
public interface Vars extends EObject
{
  /**
   * Returns the value of the '<em><b>Var2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var2</em>' attribute.
   * @see #setVar2(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVars_Var2()
   * @model
   * @generated
   */
  String getVar2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Vars#getVar2 <em>Var2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var2</em>' attribute.
   * @see #getVar2()
   * @generated
   */
  void setVar2(String value);

  /**
   * Returns the value of the '<em><b>Var3</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var3</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var3</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVars_Var3()
   * @model unique="false"
   * @generated
   */
  EList<String> getVar3();

} // Vars
