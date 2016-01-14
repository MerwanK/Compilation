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
   * The feature id for the '<em><b>Affect Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__AFFECT_VAR = 1;

  /**
   * The feature id for the '<em><b>While C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__WHILE_C = 2;

  /**
   * The feature id for the '<em><b>For C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__FOR_C = 3;

  /**
   * The feature id for the '<em><b>If C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__IF_C = 4;

  /**
   * The feature id for the '<em><b>Foreach C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE__FOREACH_C = 5;

  /**
   * The number of structural features of the '<em>Commande</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AffectVarImpl <em>Affect Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AffectVarImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAffectVar()
   * @generated
   */
  int AFFECT_VAR = 7;

  /**
   * The feature id for the '<em><b>Var1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECT_VAR__VAR1 = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECT_VAR__EXP = 1;

  /**
   * The number of structural features of the '<em>Affect Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECT_VAR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.WhileImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getWhile()
   * @generated
   */
  int WHILE = 8;

  /**
   * The feature id for the '<em><b>Exp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__EXP2 = 0;

  /**
   * The feature id for the '<em><b>Com3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__COM3 = 1;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ForImpl <em>For</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ForImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor()
   * @generated
   */
  int FOR = 9;

  /**
   * The feature id for the '<em><b>Exp3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__EXP3 = 0;

  /**
   * The feature id for the '<em><b>Com4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__COM4 = 1;

  /**
   * The number of structural features of the '<em>For</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.IfImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIf()
   * @generated
   */
  int IF = 10;

  /**
   * The feature id for the '<em><b>Exp4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__EXP4 = 0;

  /**
   * The feature id for the '<em><b>Com5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__COM5 = 1;

  /**
   * The feature id for the '<em><b>Com6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__COM6 = 2;

  /**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ForeachImpl <em>Foreach</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ForeachImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getForeach()
   * @generated
   */
  int FOREACH = 11;

  /**
   * The feature id for the '<em><b>Exp5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__EXP5 = 0;

  /**
   * The feature id for the '<em><b>Exp6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__EXP6 = 1;

  /**
   * The feature id for the '<em><b>Com7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH__COM7 = 2;

  /**
   * The number of structural features of the '<em>Foreach</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VarsImpl <em>Vars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VarsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVars()
   * @generated
   */
  int VARS = 12;

  /**
   * The feature id for the '<em><b>Var2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS__VAR2 = 0;

  /**
   * The feature id for the '<em><b>Var3</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS__VAR3 = 1;

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
  int EXPRS = 13;

  /**
   * The feature id for the '<em><b>Expr S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRS__EXPR_S = 0;

  /**
   * The feature id for the '<em><b>Expr S2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRS__EXPR_S2 = 1;

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
  int EXPR = 14;

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
  int EXPR_SIMPLE = 15;

  /**
   * The feature id for the '<em><b>Vide</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__VIDE = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__VARIABLE = 1;

  /**
   * The feature id for the '<em><b>Symbole</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__SYMBOLE = 2;

  /**
   * The feature id for the '<em><b>Cons</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__CONS = 3;

  /**
   * The feature id for the '<em><b>Liste</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__LISTE = 4;

  /**
   * The feature id for the '<em><b>Hd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__HD = 5;

  /**
   * The feature id for the '<em><b>Tl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__TL = 6;

  /**
   * The feature id for the '<em><b>Symbol Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__SYMBOL_EX = 7;

  /**
   * The number of structural features of the '<em>Expr Simple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ConsImpl <em>Cons</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ConsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCons()
   * @generated
   */
  int CONS = 16;

  /**
   * The feature id for the '<em><b>Le1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONS__LE1 = 0;

  /**
   * The number of structural features of the '<em>Cons</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ListeImpl <em>Liste</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ListeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getListe()
   * @generated
   */
  int LISTE = 17;

  /**
   * The feature id for the '<em><b>Le2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTE__LE2 = 0;

  /**
   * The number of structural features of the '<em>Liste</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.HdImpl <em>Hd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.HdImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHd()
   * @generated
   */
  int HD = 18;

  /**
   * The feature id for the '<em><b>Le3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HD__LE3 = 0;

  /**
   * The number of structural features of the '<em>Hd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TlImpl <em>Tl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TlImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTl()
   * @generated
   */
  int TL = 19;

  /**
   * The feature id for the '<em><b>Le4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TL__LE4 = 0;

  /**
   * The number of structural features of the '<em>Tl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SymboleExImpl <em>Symbole Ex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SymboleExImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSymboleEx()
   * @generated
   */
  int SYMBOLE_EX = 20;

  /**
   * The feature id for the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOLE_EX__P = 0;

  /**
   * The feature id for the '<em><b>Le5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOLE_EX__LE5 = 1;

  /**
   * The number of structural features of the '<em>Symbole Ex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOLE_EX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LExprImpl <em>LExpr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LExprImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLExpr()
   * @generated
   */
  int LEXPR = 21;

  /**
   * The feature id for the '<em><b>Exp Le</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPR__EXP_LE = 0;

  /**
   * The number of structural features of the '<em>LExpr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LExpr2Impl <em>LExpr2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LExpr2Impl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLExpr2()
   * @generated
   */
  int LEXPR2 = 22;

  /**
   * The feature id for the '<em><b>Exp Le2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPR2__EXP_LE2 = 0;

  /**
   * The number of structural features of the '<em>LExpr2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXPR2_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprAndImpl <em>Expr And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExprAndImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprAnd()
   * @generated
   */
  int EXPR_AND = 23;

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
  int EXPR_OR = 24;

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
  int EXPR_NOT = 25;

  /**
   * The feature id for the '<em><b>Expr Not Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT__EXPR_NOT_NOT = 0;

  /**
   * The feature id for the '<em><b>Expr Not Do</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT__EXPR_NOT_DO = 1;

  /**
   * The number of structural features of the '<em>Expr Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprNotNotImpl <em>Expr Not Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExprNotNotImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprNotNot()
   * @generated
   */
  int EXPR_NOT_NOT = 26;

  /**
   * The feature id for the '<em><b>Exp Eq1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT_NOT__EXP_EQ1 = 0;

  /**
   * The number of structural features of the '<em>Expr Not Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT_NOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprNotDoImpl <em>Expr Not Do</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExprNotDoImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprNotDo()
   * @generated
   */
  int EXPR_NOT_DO = 27;

  /**
   * The feature id for the '<em><b>Exp Eq2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT_DO__EXP_EQ2 = 0;

  /**
   * The number of structural features of the '<em>Expr Not Do</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT_DO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprEqImpl <em>Expr Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExprEqImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprEq()
   * @generated
   */
  int EXPR_EQ = 28;

  /**
   * The feature id for the '<em><b>Exp S1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ__EXP_S1 = 0;

  /**
   * The feature id for the '<em><b>Exp S2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ__EXP_S2 = 1;

  /**
   * The feature id for the '<em><b>Exp R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ__EXP_R = 2;

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getAffectVar <em>Affect Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Affect Var</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getAffectVar()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_AffectVar();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getWhileC <em>While C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While C</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getWhileC()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_WhileC();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getForC <em>For C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For C</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getForC()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_ForC();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getIfC <em>If C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If C</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getIfC()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_IfC();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Commande#getForeachC <em>Foreach C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Foreach C</em>'.
   * @see org.xtext.example.mydsl.myDsl.Commande#getForeachC()
   * @see #getCommande()
   * @generated
   */
  EReference getCommande_ForeachC();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.AffectVar <em>Affect Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Affect Var</em>'.
   * @see org.xtext.example.mydsl.myDsl.AffectVar
   * @generated
   */
  EClass getAffectVar();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.AffectVar#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var1</em>'.
   * @see org.xtext.example.mydsl.myDsl.AffectVar#getVar1()
   * @see #getAffectVar()
   * @generated
   */
  EReference getAffectVar_Var1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.AffectVar#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.mydsl.myDsl.AffectVar#getExp()
   * @see #getAffectVar()
   * @generated
   */
  EReference getAffectVar_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see org.xtext.example.mydsl.myDsl.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.While#getExp2 <em>Exp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp2</em>'.
   * @see org.xtext.example.mydsl.myDsl.While#getExp2()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Exp2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.While#getCom3 <em>Com3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Com3</em>'.
   * @see org.xtext.example.mydsl.myDsl.While#getCom3()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Com3();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.For <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For</em>'.
   * @see org.xtext.example.mydsl.myDsl.For
   * @generated
   */
  EClass getFor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For#getExp3 <em>Exp3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp3</em>'.
   * @see org.xtext.example.mydsl.myDsl.For#getExp3()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Exp3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For#getCom4 <em>Com4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Com4</em>'.
   * @see org.xtext.example.mydsl.myDsl.For#getCom4()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Com4();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If</em>'.
   * @see org.xtext.example.mydsl.myDsl.If
   * @generated
   */
  EClass getIf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.If#getExp4 <em>Exp4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp4</em>'.
   * @see org.xtext.example.mydsl.myDsl.If#getExp4()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Exp4();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.If#getCom5 <em>Com5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Com5</em>'.
   * @see org.xtext.example.mydsl.myDsl.If#getCom5()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Com5();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.If#getCom6 <em>Com6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Com6</em>'.
   * @see org.xtext.example.mydsl.myDsl.If#getCom6()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Com6();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Foreach <em>Foreach</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreach</em>'.
   * @see org.xtext.example.mydsl.myDsl.Foreach
   * @generated
   */
  EClass getForeach();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Foreach#getExp5 <em>Exp5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp5</em>'.
   * @see org.xtext.example.mydsl.myDsl.Foreach#getExp5()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Exp5();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Foreach#getExp6 <em>Exp6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp6</em>'.
   * @see org.xtext.example.mydsl.myDsl.Foreach#getExp6()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Exp6();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Foreach#getCom7 <em>Com7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Com7</em>'.
   * @see org.xtext.example.mydsl.myDsl.Foreach#getCom7()
   * @see #getForeach()
   * @generated
   */
  EReference getForeach_Com7();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Vars#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Vars#getVar2()
   * @see #getVars()
   * @generated
   */
  EAttribute getVars_Var2();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Vars#getVar3 <em>Var3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Var3</em>'.
   * @see org.xtext.example.mydsl.myDsl.Vars#getVar3()
   * @see #getVars()
   * @generated
   */
  EAttribute getVars_Var3();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Exprs#getExprS <em>Expr S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr S</em>'.
   * @see org.xtext.example.mydsl.myDsl.Exprs#getExprS()
   * @see #getExprs()
   * @generated
   */
  EReference getExprs_ExprS();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Exprs#getExprS2 <em>Expr S2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr S2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Exprs#getExprS2()
   * @see #getExprs()
   * @generated
   */
  EReference getExprs_ExprS2();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getVide <em>Vide</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vide</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple#getVide()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_Vide();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple#getVariable()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_Variable();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getCons <em>Cons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cons</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple#getCons()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_Cons();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getListe <em>Liste</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Liste</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple#getListe()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_Liste();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getHd <em>Hd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hd</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple#getHd()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_Hd();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getTl <em>Tl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tl</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple#getTl()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_Tl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprSimple#getSymbolEx <em>Symbol Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Symbol Ex</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprSimple#getSymbolEx()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_SymbolEx();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Cons <em>Cons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cons</em>'.
   * @see org.xtext.example.mydsl.myDsl.Cons
   * @generated
   */
  EClass getCons();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Cons#getLe1 <em>Le1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Le1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Cons#getLe1()
   * @see #getCons()
   * @generated
   */
  EReference getCons_Le1();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Liste <em>Liste</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Liste</em>'.
   * @see org.xtext.example.mydsl.myDsl.Liste
   * @generated
   */
  EClass getListe();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Liste#getLe2 <em>Le2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Le2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Liste#getLe2()
   * @see #getListe()
   * @generated
   */
  EReference getListe_Le2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Hd <em>Hd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hd</em>'.
   * @see org.xtext.example.mydsl.myDsl.Hd
   * @generated
   */
  EClass getHd();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Hd#getLe3 <em>Le3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Le3</em>'.
   * @see org.xtext.example.mydsl.myDsl.Hd#getLe3()
   * @see #getHd()
   * @generated
   */
  EReference getHd_Le3();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Tl <em>Tl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tl</em>'.
   * @see org.xtext.example.mydsl.myDsl.Tl
   * @generated
   */
  EClass getTl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Tl#getLe4 <em>Le4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Le4</em>'.
   * @see org.xtext.example.mydsl.myDsl.Tl#getLe4()
   * @see #getTl()
   * @generated
   */
  EReference getTl_Le4();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.SymboleEx <em>Symbole Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbole Ex</em>'.
   * @see org.xtext.example.mydsl.myDsl.SymboleEx
   * @generated
   */
  EClass getSymboleEx();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.SymboleEx#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>P</em>'.
   * @see org.xtext.example.mydsl.myDsl.SymboleEx#getP()
   * @see #getSymboleEx()
   * @generated
   */
  EAttribute getSymboleEx_P();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.SymboleEx#getLe5 <em>Le5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Le5</em>'.
   * @see org.xtext.example.mydsl.myDsl.SymboleEx#getLe5()
   * @see #getSymboleEx()
   * @generated
   */
  EReference getSymboleEx_Le5();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.LExpr#getExpLe <em>Exp Le</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp Le</em>'.
   * @see org.xtext.example.mydsl.myDsl.LExpr#getExpLe()
   * @see #getLExpr()
   * @generated
   */
  EReference getLExpr_ExpLe();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.LExpr2 <em>LExpr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LExpr2</em>'.
   * @see org.xtext.example.mydsl.myDsl.LExpr2
   * @generated
   */
  EClass getLExpr2();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.LExpr2#getExpLe2 <em>Exp Le2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp Le2</em>'.
   * @see org.xtext.example.mydsl.myDsl.LExpr2#getExpLe2()
   * @see #getLExpr2()
   * @generated
   */
  EReference getLExpr2_ExpLe2();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprNot#getExprNotNot <em>Expr Not Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Not Not</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprNot#getExprNotNot()
   * @see #getExprNot()
   * @generated
   */
  EReference getExprNot_ExprNotNot();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprNot#getExprNotDo <em>Expr Not Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Not Do</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprNot#getExprNotDo()
   * @see #getExprNot()
   * @generated
   */
  EReference getExprNot_ExprNotDo();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ExprNotNot <em>Expr Not Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Not Not</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprNotNot
   * @generated
   */
  EClass getExprNotNot();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprNotNot#getExpEq1 <em>Exp Eq1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Eq1</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprNotNot#getExpEq1()
   * @see #getExprNotNot()
   * @generated
   */
  EReference getExprNotNot_ExpEq1();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ExprNotDo <em>Expr Not Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Not Do</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprNotDo
   * @generated
   */
  EClass getExprNotDo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprNotDo#getExpEq2 <em>Exp Eq2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Eq2</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprNotDo#getExpEq2()
   * @see #getExprNotDo()
   * @generated
   */
  EReference getExprNotDo_ExpEq2();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprEq#getExpS1 <em>Exp S1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp S1</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprEq#getExpS1()
   * @see #getExprEq()
   * @generated
   */
  EReference getExprEq_ExpS1();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ExprEq#getExpR <em>Exp R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp R</em>'.
   * @see org.xtext.example.mydsl.myDsl.ExprEq#getExpR()
   * @see #getExprEq()
   * @generated
   */
  EReference getExprEq_ExpR();

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
     * The meta object literal for the '<em><b>Affect Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__AFFECT_VAR = eINSTANCE.getCommande_AffectVar();

    /**
     * The meta object literal for the '<em><b>While C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__WHILE_C = eINSTANCE.getCommande_WhileC();

    /**
     * The meta object literal for the '<em><b>For C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__FOR_C = eINSTANCE.getCommande_ForC();

    /**
     * The meta object literal for the '<em><b>If C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__IF_C = eINSTANCE.getCommande_IfC();

    /**
     * The meta object literal for the '<em><b>Foreach C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDE__FOREACH_C = eINSTANCE.getCommande_ForeachC();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AffectVarImpl <em>Affect Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AffectVarImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAffectVar()
     * @generated
     */
    EClass AFFECT_VAR = eINSTANCE.getAffectVar();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AFFECT_VAR__VAR1 = eINSTANCE.getAffectVar_Var1();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AFFECT_VAR__EXP = eINSTANCE.getAffectVar_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.WhileImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>Exp2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__EXP2 = eINSTANCE.getWhile_Exp2();

    /**
     * The meta object literal for the '<em><b>Com3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__COM3 = eINSTANCE.getWhile_Com3();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ForImpl <em>For</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ForImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor()
     * @generated
     */
    EClass FOR = eINSTANCE.getFor();

    /**
     * The meta object literal for the '<em><b>Exp3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__EXP3 = eINSTANCE.getFor_Exp3();

    /**
     * The meta object literal for the '<em><b>Com4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__COM4 = eINSTANCE.getFor_Com4();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.IfImpl <em>If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.IfImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIf()
     * @generated
     */
    EClass IF = eINSTANCE.getIf();

    /**
     * The meta object literal for the '<em><b>Exp4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__EXP4 = eINSTANCE.getIf_Exp4();

    /**
     * The meta object literal for the '<em><b>Com5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__COM5 = eINSTANCE.getIf_Com5();

    /**
     * The meta object literal for the '<em><b>Com6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__COM6 = eINSTANCE.getIf_Com6();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ForeachImpl <em>Foreach</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ForeachImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getForeach()
     * @generated
     */
    EClass FOREACH = eINSTANCE.getForeach();

    /**
     * The meta object literal for the '<em><b>Exp5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__EXP5 = eINSTANCE.getForeach_Exp5();

    /**
     * The meta object literal for the '<em><b>Exp6</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__EXP6 = eINSTANCE.getForeach_Exp6();

    /**
     * The meta object literal for the '<em><b>Com7</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH__COM7 = eINSTANCE.getForeach_Com7();

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
     * The meta object literal for the '<em><b>Var2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARS__VAR2 = eINSTANCE.getVars_Var2();

    /**
     * The meta object literal for the '<em><b>Var3</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARS__VAR3 = eINSTANCE.getVars_Var3();

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
     * The meta object literal for the '<em><b>Expr S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRS__EXPR_S = eINSTANCE.getExprs_ExprS();

    /**
     * The meta object literal for the '<em><b>Expr S2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRS__EXPR_S2 = eINSTANCE.getExprs_ExprS2();

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
     * The meta object literal for the '<em><b>Vide</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__VIDE = eINSTANCE.getExprSimple_Vide();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__VARIABLE = eINSTANCE.getExprSimple_Variable();

    /**
     * The meta object literal for the '<em><b>Symbole</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__SYMBOLE = eINSTANCE.getExprSimple_Symbole();

    /**
     * The meta object literal for the '<em><b>Cons</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__CONS = eINSTANCE.getExprSimple_Cons();

    /**
     * The meta object literal for the '<em><b>Liste</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__LISTE = eINSTANCE.getExprSimple_Liste();

    /**
     * The meta object literal for the '<em><b>Hd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__HD = eINSTANCE.getExprSimple_Hd();

    /**
     * The meta object literal for the '<em><b>Tl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__TL = eINSTANCE.getExprSimple_Tl();

    /**
     * The meta object literal for the '<em><b>Symbol Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__SYMBOL_EX = eINSTANCE.getExprSimple_SymbolEx();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ConsImpl <em>Cons</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ConsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCons()
     * @generated
     */
    EClass CONS = eINSTANCE.getCons();

    /**
     * The meta object literal for the '<em><b>Le1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONS__LE1 = eINSTANCE.getCons_Le1();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ListeImpl <em>Liste</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ListeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getListe()
     * @generated
     */
    EClass LISTE = eINSTANCE.getListe();

    /**
     * The meta object literal for the '<em><b>Le2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LISTE__LE2 = eINSTANCE.getListe_Le2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.HdImpl <em>Hd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.HdImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHd()
     * @generated
     */
    EClass HD = eINSTANCE.getHd();

    /**
     * The meta object literal for the '<em><b>Le3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HD__LE3 = eINSTANCE.getHd_Le3();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TlImpl <em>Tl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TlImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTl()
     * @generated
     */
    EClass TL = eINSTANCE.getTl();

    /**
     * The meta object literal for the '<em><b>Le4</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TL__LE4 = eINSTANCE.getTl_Le4();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SymboleExImpl <em>Symbole Ex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SymboleExImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSymboleEx()
     * @generated
     */
    EClass SYMBOLE_EX = eINSTANCE.getSymboleEx();

    /**
     * The meta object literal for the '<em><b>P</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOLE_EX__P = eINSTANCE.getSymboleEx_P();

    /**
     * The meta object literal for the '<em><b>Le5</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOLE_EX__LE5 = eINSTANCE.getSymboleEx_Le5();

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
     * The meta object literal for the '<em><b>Exp Le</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEXPR__EXP_LE = eINSTANCE.getLExpr_ExpLe();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.LExpr2Impl <em>LExpr2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.LExpr2Impl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLExpr2()
     * @generated
     */
    EClass LEXPR2 = eINSTANCE.getLExpr2();

    /**
     * The meta object literal for the '<em><b>Exp Le2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEXPR2__EXP_LE2 = eINSTANCE.getLExpr2_ExpLe2();

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
     * The meta object literal for the '<em><b>Expr Not Not</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_NOT__EXPR_NOT_NOT = eINSTANCE.getExprNot_ExprNotNot();

    /**
     * The meta object literal for the '<em><b>Expr Not Do</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_NOT__EXPR_NOT_DO = eINSTANCE.getExprNot_ExprNotDo();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprNotNotImpl <em>Expr Not Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExprNotNotImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprNotNot()
     * @generated
     */
    EClass EXPR_NOT_NOT = eINSTANCE.getExprNotNot();

    /**
     * The meta object literal for the '<em><b>Exp Eq1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_NOT_NOT__EXP_EQ1 = eINSTANCE.getExprNotNot_ExpEq1();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExprNotDoImpl <em>Expr Not Do</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExprNotDoImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExprNotDo()
     * @generated
     */
    EClass EXPR_NOT_DO = eINSTANCE.getExprNotDo();

    /**
     * The meta object literal for the '<em><b>Exp Eq2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_NOT_DO__EXP_EQ2 = eINSTANCE.getExprNotDo_ExpEq2();

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
     * The meta object literal for the '<em><b>Exp S1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQ__EXP_S1 = eINSTANCE.getExprEq_ExpS1();

    /**
     * The meta object literal for the '<em><b>Exp S2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQ__EXP_S2 = eINSTANCE.getExprEq_ExpS2();

    /**
     * The meta object literal for the '<em><b>Exp R</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQ__EXP_R = eINSTANCE.getExprEq_ExpR();

  }

} //MyDslPackage
