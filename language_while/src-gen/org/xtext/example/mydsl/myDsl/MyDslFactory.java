/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Programme</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Programme</em>'.
   * @generated
   */
  Programme createProgramme();

  /**
   * Returns a new object of class '<em>Fonction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fonction</em>'.
   * @generated
   */
  Fonction createFonction();

  /**
   * Returns a new object of class '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input</em>'.
   * @generated
   */
  Input createInput();

  /**
   * Returns a new object of class '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output</em>'.
   * @generated
   */
  Output createOutput();

  /**
   * Returns a new object of class '<em>Commandes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Commandes</em>'.
   * @generated
   */
  Commandes createCommandes();

  /**
   * Returns a new object of class '<em>Commande</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Commande</em>'.
   * @generated
   */
  Commande createCommande();

  /**
   * Returns a new object of class '<em>Affect Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Affect Var</em>'.
   * @generated
   */
  AffectVar createAffectVar();

  /**
   * Returns a new object of class '<em>While</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While</em>'.
   * @generated
   */
  While createWhile();

  /**
   * Returns a new object of class '<em>For</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For</em>'.
   * @generated
   */
  For createFor();

  /**
   * Returns a new object of class '<em>If</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If</em>'.
   * @generated
   */
  If createIf();

  /**
   * Returns a new object of class '<em>Foreach</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foreach</em>'.
   * @generated
   */
  Foreach createForeach();

  /**
   * Returns a new object of class '<em>Vars</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vars</em>'.
   * @generated
   */
  Vars createVars();

  /**
   * Returns a new object of class '<em>Exprs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exprs</em>'.
   * @generated
   */
  Exprs createExprs();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>Expr Simple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Simple</em>'.
   * @generated
   */
  ExprSimple createExprSimple();

  /**
   * Returns a new object of class '<em>Cons</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cons</em>'.
   * @generated
   */
  Cons createCons();

  /**
   * Returns a new object of class '<em>Liste</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Liste</em>'.
   * @generated
   */
  Liste createListe();

  /**
   * Returns a new object of class '<em>Hd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hd</em>'.
   * @generated
   */
  Hd createHd();

  /**
   * Returns a new object of class '<em>Tl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tl</em>'.
   * @generated
   */
  Tl createTl();

  /**
   * Returns a new object of class '<em>Symbole Ex</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbole Ex</em>'.
   * @generated
   */
  SymboleEx createSymboleEx();

  /**
   * Returns a new object of class '<em>LExpr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LExpr</em>'.
   * @generated
   */
  LExpr createLExpr();

  /**
   * Returns a new object of class '<em>Expr And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr And</em>'.
   * @generated
   */
  ExprAnd createExprAnd();

  /**
   * Returns a new object of class '<em>Expr Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Or</em>'.
   * @generated
   */
  ExprOr createExprOr();

  /**
   * Returns a new object of class '<em>Expr Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Not</em>'.
   * @generated
   */
  ExprNot createExprNot();

  /**
   * Returns a new object of class '<em>Expr Eq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Eq</em>'.
   * @generated
   */
  ExprEq createExprEq();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
