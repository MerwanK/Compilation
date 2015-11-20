/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Programme</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROGRAMME = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ProgrammeImpl <em>Programme</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ProgrammeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getProgramme()
   * @generated
   */
  int PROGRAMME = 1;

  /**
   * The feature id for the '<em><b>Fonct</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMME__FONCT = 0;

  /**
   * The number of structural features of the '<em>Programme</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FonctionImpl <em>Fonction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FonctionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFonction()
   * @generated
   */
  int FONCTION = 2;

  /**
   * The feature id for the '<em><b>Symbole</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONCTION__SYMBOLE = 0;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONCTION__IN = 1;

  /**
   * The feature id for the '<em><b>Com</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONCTION__COM = 2;

  /**
   * The feature id for the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONCTION__OUT = 3;

  /**
   * The number of structural features of the '<em>Fonction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONCTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.InputImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInput()
   * @generated
   */
  int INPUT = 3;

  /**
   * The feature id for the '<em><b>Var1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__VAR1 = 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__VAR2 = 1;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.OutputImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 4;

  /**
   * The feature id for the '<em><b>Var1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__VAR1 = 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__VAR2 = 1;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CommandesImpl <em>Commandes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CommandesImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCommandes()
   * @generated
   */
  int COMMANDES = 5;

  /**
   * The feature id for the '<em><b>Com1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDES__COM1 = 0;

  /**
   * The feature id for the '<em><b>Com2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDES__COM2 = 1;

  /**
   * The number of structural features of the '<em>Commandes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl <em>Commande</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CommandeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCommande()
   * @generated
   */
  int COMMANDE = 6;

  /**
   * The feature id for the '<em><b>Nop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__NOP = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__VAR = 1;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__EXP = 2;

  /**
   * The feature id for the '<em><b>Exp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__EXP2 = 3;

  /**
   * The feature id for the '<em><b>Com</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__COM = 4;

  /**
   * The feature id for the '<em><b>Exp3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__EXP3 = 5;

  /**
   * The feature id for the '<em><b>Com2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__COM2 = 6;

  /**
   * The feature id for the '<em><b>Com3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__COM3 = 7;

  /**
   * The feature id for the '<em><b>Exp4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__EXP4 = 8;

  /**
   * The feature id for the '<em><b>Exp5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__EXP5 = 9;

  /**
   * The feature id for the '<em><b>Com4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__COM4 = 10;

  /**
   * The number of structural features of the '<em>Commande</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VarsImpl <em>Vars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VarsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVars()
   * @generated
   */
  int VARS = 7;

  /**
   * The feature id for the '<em><b>Var1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS__VAR1 = 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS__VAR2 = 1;

  /**
   * The number of structural features of the '<em>Vars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprsImpl <em>Exprs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExprsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprs()
   * @generated
   */
  int EXPRS = 8;

  /**
   * The feature id for the '<em><b>Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRS__EXP1 = 0;

  /**
   * The feature id for the '<em><b>Exp2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRS__EXP2 = 1;

  /**
   * The number of structural features of the '<em>Exprs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExprImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 9;

  /**
   * The feature id for the '<em><b>Exp A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXP_A = 0;

  /**
   * The feature id for the '<em><b>Exp S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXP_S = 1;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl <em>Expr Simple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprSimple()
   * @generated
   */
  int EXPR_SIMPLE = 10;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__VAR = 0;

  /**
   * The feature id for the '<em><b>Symbole</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__SYMBOLE = 1;

  /**
   * The feature id for the '<em><b>Le</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__LE = 2;

  /**
   * The feature id for the '<em><b>Le2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__LE2 = 3;

  /**
   * The feature id for the '<em><b>Le3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__LE3 = 4;

  /**
   * The feature id for the '<em><b>Le4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__LE4 = 5;

  /**
   * The feature id for the '<em><b>Le5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__LE5 = 6;

  /**
   * The number of structural features of the '<em>Expr Simple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LExprImpl <em>LExpr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LExprImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLExpr()
   * @generated
   */
  int LEXPR = 11;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPR__EXP = 0;

  /**
   * The number of structural features of the '<em>LExpr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprAndImpl <em>Expr And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExprAndImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprAnd()
   * @generated
   */
  int EXPR_AND = 12;

  /**
   * The feature id for the '<em><b>Exp O</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AND__EXP_O = 0;

  /**
   * The feature id for the '<em><b>Exp O2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AND__EXP_O2 = 1;

  /**
   * The number of structural features of the '<em>Expr And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprOrImpl <em>Expr Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExprOrImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprOr()
   * @generated
   */
  int EXPR_OR = 13;

  /**
   * The feature id for the '<em><b>Exp N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR__EXP_N = 0;

  /**
   * The feature id for the '<em><b>Exp N2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR__EXP_N2 = 1;

  /**
   * The number of structural features of the '<em>Expr Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprNotImpl <em>Expr Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExprNotImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprNot()
   * @generated
   */
  int EXPR_NOT = 14;

  /**
   * The feature id for the '<em><b>Exp Eq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT__EXP_EQ = 0;

  /**
   * The number of structural features of the '<em>Expr Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprEqImpl <em>Expr Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExprEqImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprEq()
   * @generated
   */
  int EXPR_EQ = 15;

  /**
   * The feature id for the '<em><b>Exp S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ__EXP_S = 0;

  /**
   * The feature id for the '<em><b>Exp S2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ__EXP_S2 = 1;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ__EXP = 2;

  /**
   * The number of structural features of the '<em>Expr Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Model#getProgramme <em>Programme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Programme</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getProgramme()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Programme();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Programme <em>Programme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Programme</em>'.
   * @see org.xtext.example.mydsl.myDsl.Programme
   * @generated
   */
  EClass getProgramme();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Programme#getFonct <em>Fonct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fonct</em>'.
   * @see org.xtext.example.mydsl.myDsl.Programme#getFonct()
   * @see #getProgramme()
   * @generated
   */
  EReference getProgramme_Fonct();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Fonction <em>Fonction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fonction</em>'.
   * @see org.xtext.example.mydsl.myDsl.Fonction
   * @generated
   */
  EClass getFonction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Fonction#getSymbole <em>Symbole</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symbole</em>'.
   * @see org.xtext.example.mydsl.myDsl.Fonction#getSymbole()
   * @see #getFonction()
   * @generated
   */
  EAttribute getFonction_Symbole();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Fonction#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In</em>'.
   * @see org.xtext.example.mydsl.myDsl.Fonction#getIn()
   * @see #getFonction()
   * @generated
   */
  EReference getFonction_In();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Fonction#getCom <em>Com</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Com</em>'.
   * @see org.xtext.example.mydsl.myDsl.Fonction#getCom()
   * @see #getFonction()
   * @generated
   */
  EReference getFonction_Com();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Fonction#getOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Out</em>'.
   * @see org.xtext.example.mydsl.myDsl.Fonction#getOut()
   * @see #getFonction()
   * @generated
   */
  EReference getFonction_Out();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see org.xtext.example.mydsl.myDsl.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Input#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Input#getVar1()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Var1();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Input#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Var2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Input#getVar2()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Var2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see org.xtext.example.mydsl.myDsl.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Output#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Output#getVar1()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Var1();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Output#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Var2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Output#getVar2()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Var2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Commandes <em>Commandes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Commandes</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commandes
   * @generated
   */
  EClass getCommandes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commandes#getCom1 <em>Com1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Com1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commandes#getCom1()
   * @see #getCommandes()
   * @generated
   */
  EReference getCommandes_Com1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Commandes#getCom2 <em>Com2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Com2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commandes#getCom2()
   * @see #getCommandes()
   * @generated
   */
  EReference getCommandes_Com2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Commande <em>Commande</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Commande</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande
   * @generated
   */
  EClass getCommande();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Commande#getNop <em>Nop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nop</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getNop()
   * @see #getCommande()
   * @generated
   */
  EAttribute getCommande_Nop();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getVar()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getExp()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_Exp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getExp2 <em>Exp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getExp2()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_Exp2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getCom <em>Com</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Com</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getCom()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_Com();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getExp3 <em>Exp3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp3</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getExp3()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_Exp3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getCom2 <em>Com2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Com2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getCom2()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_Com2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getCom3 <em>Com3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Com3</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getCom3()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_Com3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getExp4 <em>Exp4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp4</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getExp4()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_Exp4();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getExp5 <em>Exp5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp5</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getExp5()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_Exp5();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getCom4 <em>Com4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Com4</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getCom4()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_Com4();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Vars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vars</em>'.
   * @see org.xtext.example.mydsl.myDsl.Vars
   * @generated
   */
  EClass getVars();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Vars#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Vars#getVar1()
   * @see #getVars()
   * @generated
   */
  EAttribute getVars_Var1();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Vars#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Var2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Vars#getVar2()
   * @see #getVars()
   * @generated
   */
  EAttribute getVars_Var2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Exprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exprs</em>'.
   * @see org.xtext.example.mydsl.myDsl.Exprs
   * @generated
   */
  EClass getExprs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Exprs#getExp1 <em>Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Exprs#getExp1()
   * @see #getExprs()
   * @generated
   */
  EReference getExprs_Exp1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Exprs#getExp2 <em>Exp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Exprs#getExp2()
   * @see #getExprs()
   * @generated
   */
  EReference getExprs_Exp2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expr#getExpA <em>Exp A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp A</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expr#getExpA()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_ExpA();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expr#getExpS <em>Exp S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp S</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expr#getExpS()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_ExpS();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ExprSimple <em>Expr Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Simple</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple
   * @generated
   */
  EClass getExprSimple();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple#getVar()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getSymbole <em>Symbole</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symbole</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple#getSymbole()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_Symbole();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getLe <em>Le</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Le</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple#getLe()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_Le();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getLe2 <em>Le2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Le2</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple#getLe2()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_Le2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getLe3 <em>Le3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Le3</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple#getLe3()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_Le3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getLe4 <em>Le4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Le4</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple#getLe4()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_Le4();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getLe5 <em>Le5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Le5</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple#getLe5()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_Le5();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.LExpr <em>LExpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LExpr</em>'.
   * @see org.xtext.example.mydsl.myDsl.LExpr
   * @generated
   */
  EClass getLExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.LExpr#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.xtext.example.mydsl.myDsl.LExpr#getExp()
   * @see #getLExpr()
   * @generated
   */
  EReference getLExpr_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ExprAnd <em>Expr And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr And</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprAnd
   * @generated
   */
  EClass getExprAnd();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprAnd#getExpO <em>Exp O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp O</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprAnd#getExpO()
   * @see #getExprAnd()
   * @generated
   */
  EReference getExprAnd_ExpO();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.ExprAnd#getExpO2 <em>Exp O2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp O2</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprAnd#getExpO2()
   * @see #getExprAnd()
   * @generated
   */
  EReference getExprAnd_ExpO2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ExprOr <em>Expr Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Or</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprOr
   * @generated
   */
  EClass getExprOr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprOr#getExpN <em>Exp N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp N</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprOr#getExpN()
   * @see #getExprOr()
   * @generated
   */
  EReference getExprOr_ExpN();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.ExprOr#getExpN2 <em>Exp N2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp N2</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprOr#getExpN2()
   * @see #getExprOr()
   * @generated
   */
  EReference getExprOr_ExpN2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ExprNot <em>Expr Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Not</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprNot
   * @generated
   */
  EClass getExprNot();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprNot#getExpEq <em>Exp Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Eq</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprNot#getExpEq()
   * @see #getExprNot()
   * @generated
   */
  EReference getExprNot_ExpEq();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ExprEq <em>Expr Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Eq</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprEq
   * @generated
   */
  EClass getExprEq();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprEq#getExpS <em>Exp S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp S</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprEq#getExpS()
   * @see #getExprEq()
   * @generated
   */
  EReference getExprEq_ExpS();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprEq#getExpS2 <em>Exp S2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp S2</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprEq#getExpS2()
   * @see #getExprEq()
   * @generated
   */
  EReference getExprEq_ExpS2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprEq#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprEq#getExp()
   * @see #getExprEq()
   * @generated
   */
  EReference getExprEq_Exp();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Programme</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROGRAMME = eINSTANCE.getModel_Programme();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ProgrammeImpl <em>Programme</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ProgrammeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getProgramme()
     * @generated
     */
    EClass PROGRAMME = eINSTANCE.getProgramme();

    /**
     * The meta object literal for the '<em><b>Fonct</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAMME__FONCT = eINSTANCE.getProgramme_Fonct();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FonctionImpl <em>Fonction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FonctionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFonction()
     * @generated
     */
    EClass FONCTION = eINSTANCE.getFonction();

    /**
     * The meta object literal for the '<em><b>Symbole</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONCTION__SYMBOLE = eINSTANCE.getFonction_Symbole();

    /**
     * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONCTION__IN = eINSTANCE.getFonction_In();

    /**
     * The meta object literal for the '<em><b>Com</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONCTION__COM = eINSTANCE.getFonction_Com();

    /**
     * The meta object literal for the '<em><b>Out</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONCTION__OUT = eINSTANCE.getFonction_Out();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.InputImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__VAR1 = eINSTANCE.getInput_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__VAR2 = eINSTANCE.getInput_Var2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.OutputImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__VAR1 = eINSTANCE.getOutput_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__VAR2 = eINSTANCE.getOutput_Var2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CommandesImpl <em>Commandes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CommandesImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCommandes()
     * @generated
     */
    EClass COMMANDES = eINSTANCE.getCommandes();

    /**
     * The meta object literal for the '<em><b>Com1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDES__COM1 = eINSTANCE.getCommandes_Com1();

    /**
     * The meta object literal for the '<em><b>Com2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDES__COM2 = eINSTANCE.getCommandes_Com2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CommandeImpl <em>Commande</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CommandeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCommande()
     * @generated
     */
    EClass COMMANDE = eINSTANCE.getCommande();

    /**
     * The meta object literal for the '<em><b>Nop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMANDE__NOP = eINSTANCE.getCommande_Nop();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__VAR = eINSTANCE.getCommande_Var();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__EXP = eINSTANCE.getCommande_Exp();

    /**
     * The meta object literal for the '<em><b>Exp2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__EXP2 = eINSTANCE.getCommande_Exp2();

    /**
     * The meta object literal for the '<em><b>Com</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__COM = eINSTANCE.getCommande_Com();

    /**
     * The meta object literal for the '<em><b>Exp3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__EXP3 = eINSTANCE.getCommande_Exp3();

    /**
     * The meta object literal for the '<em><b>Com2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__COM2 = eINSTANCE.getCommande_Com2();

    /**
     * The meta object literal for the '<em><b>Com3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__COM3 = eINSTANCE.getCommande_Com3();

    /**
     * The meta object literal for the '<em><b>Exp4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__EXP4 = eINSTANCE.getCommande_Exp4();

    /**
     * The meta object literal for the '<em><b>Exp5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__EXP5 = eINSTANCE.getCommande_Exp5();

    /**
     * The meta object literal for the '<em><b>Com4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__COM4 = eINSTANCE.getCommande_Com4();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.VarsImpl <em>Vars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.VarsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVars()
     * @generated
     */
    EClass VARS = eINSTANCE.getVars();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARS__VAR1 = eINSTANCE.getVars_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARS__VAR2 = eINSTANCE.getVars_Var2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprsImpl <em>Exprs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExprsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprs()
     * @generated
     */
    EClass EXPRS = eINSTANCE.getExprs();

    /**
     * The meta object literal for the '<em><b>Exp1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRS__EXP1 = eINSTANCE.getExprs_Exp1();

    /**
     * The meta object literal for the '<em><b>Exp2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRS__EXP2 = eINSTANCE.getExprs_Exp2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExprImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '<em><b>Exp A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXP_A = eINSTANCE.getExpr_ExpA();

    /**
     * The meta object literal for the '<em><b>Exp S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXP_S = eINSTANCE.getExpr_ExpS();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl <em>Expr Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExprSimpleImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprSimple()
     * @generated
     */
    EClass EXPR_SIMPLE = eINSTANCE.getExprSimple();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__VAR = eINSTANCE.getExprSimple_Var();

    /**
     * The meta object literal for the '<em><b>Symbole</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__SYMBOLE = eINSTANCE.getExprSimple_Symbole();

    /**
     * The meta object literal for the '<em><b>Le</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__LE = eINSTANCE.getExprSimple_Le();

    /**
     * The meta object literal for the '<em><b>Le2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__LE2 = eINSTANCE.getExprSimple_Le2();

    /**
     * The meta object literal for the '<em><b>Le3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__LE3 = eINSTANCE.getExprSimple_Le3();

    /**
     * The meta object literal for the '<em><b>Le4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__LE4 = eINSTANCE.getExprSimple_Le4();

    /**
     * The meta object literal for the '<em><b>Le5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__LE5 = eINSTANCE.getExprSimple_Le5();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.LExprImpl <em>LExpr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.LExprImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLExpr()
     * @generated
     */
    EClass LEXPR = eINSTANCE.getLExpr();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEXPR__EXP = eINSTANCE.getLExpr_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprAndImpl <em>Expr And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExprAndImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprAnd()
     * @generated
     */
    EClass EXPR_AND = eINSTANCE.getExprAnd();

    /**
     * The meta object literal for the '<em><b>Exp O</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_AND__EXP_O = eINSTANCE.getExprAnd_ExpO();

    /**
     * The meta object literal for the '<em><b>Exp O2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_AND__EXP_O2 = eINSTANCE.getExprAnd_ExpO2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprOrImpl <em>Expr Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExprOrImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprOr()
     * @generated
     */
    EClass EXPR_OR = eINSTANCE.getExprOr();

    /**
     * The meta object literal for the '<em><b>Exp N</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_OR__EXP_N = eINSTANCE.getExprOr_ExpN();

    /**
     * The meta object literal for the '<em><b>Exp N2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_OR__EXP_N2 = eINSTANCE.getExprOr_ExpN2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprNotImpl <em>Expr Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExprNotImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprNot()
     * @generated
     */
    EClass EXPR_NOT = eINSTANCE.getExprNot();

    /**
     * The meta object literal for the '<em><b>Exp Eq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_NOT__EXP_EQ = eINSTANCE.getExprNot_ExpEq();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprEqImpl <em>Expr Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExprEqImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprEq()
     * @generated
     */
    EClass EXPR_EQ = eINSTANCE.getExprEq();

    /**
     * The meta object literal for the '<em><b>Exp S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQ__EXP_S = eINSTANCE.getExprEq_ExpS();

    /**
     * The meta object literal for the '<em><b>Exp S2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQ__EXP_S2 = eINSTANCE.getExprEq_ExpS2();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQ__EXP = eINSTANCE.getExprEq_Exp();

  }

} //MyDslPackage
