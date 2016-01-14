/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.AffectVar;
import org.xtext.example.mydsl.myDsl.Commande;
import org.xtext.example.mydsl.myDsl.Commandes;
import org.xtext.example.mydsl.myDsl.Cons;
import org.xtext.example.mydsl.myDsl.Expr;
import org.xtext.example.mydsl.myDsl.ExprAnd;
import org.xtext.example.mydsl.myDsl.ExprEq;
import org.xtext.example.mydsl.myDsl.ExprNot;
import org.xtext.example.mydsl.myDsl.ExprNotDo;
import org.xtext.example.mydsl.myDsl.ExprNotNot;
import org.xtext.example.mydsl.myDsl.ExprOr;
import org.xtext.example.mydsl.myDsl.ExprSimple;
import org.xtext.example.mydsl.myDsl.Exprs;
import org.xtext.example.mydsl.myDsl.Fonction;
import org.xtext.example.mydsl.myDsl.For;
import org.xtext.example.mydsl.myDsl.Foreach;
import org.xtext.example.mydsl.myDsl.Hd;
import org.xtext.example.mydsl.myDsl.If;
import org.xtext.example.mydsl.myDsl.Input;
import org.xtext.example.mydsl.myDsl.LExpr;
import org.xtext.example.mydsl.myDsl.LExpr2;
import org.xtext.example.mydsl.myDsl.Liste;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Output;
import org.xtext.example.mydsl.myDsl.Programme;
import org.xtext.example.mydsl.myDsl.SymboleEx;
import org.xtext.example.mydsl.myDsl.Tl;
import org.xtext.example.mydsl.myDsl.Vars;
import org.xtext.example.mydsl.myDsl.While;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.AFFECT_VAR:
				sequence_AffectVar(context, (AffectVar) semanticObject); 
				return; 
			case MyDslPackage.COMMANDE:
				sequence_Commande(context, (Commande) semanticObject); 
				return; 
			case MyDslPackage.COMMANDES:
				sequence_Commandes(context, (Commandes) semanticObject); 
				return; 
			case MyDslPackage.CONS:
				sequence_Cons(context, (Cons) semanticObject); 
				return; 
			case MyDslPackage.EXPR:
				sequence_Expr(context, (Expr) semanticObject); 
				return; 
			case MyDslPackage.EXPR_AND:
				sequence_ExprAnd(context, (ExprAnd) semanticObject); 
				return; 
			case MyDslPackage.EXPR_EQ:
				sequence_ExprEq(context, (ExprEq) semanticObject); 
				return; 
			case MyDslPackage.EXPR_NOT:
				sequence_ExprNot(context, (ExprNot) semanticObject); 
				return; 
			case MyDslPackage.EXPR_NOT_DO:
				sequence_ExprNotDo(context, (ExprNotDo) semanticObject); 
				return; 
			case MyDslPackage.EXPR_NOT_NOT:
				sequence_ExprNotNot(context, (ExprNotNot) semanticObject); 
				return; 
			case MyDslPackage.EXPR_OR:
				sequence_ExprOr(context, (ExprOr) semanticObject); 
				return; 
			case MyDslPackage.EXPR_SIMPLE:
				sequence_ExprSimple(context, (ExprSimple) semanticObject); 
				return; 
			case MyDslPackage.EXPRS:
				sequence_Exprs(context, (Exprs) semanticObject); 
				return; 
			case MyDslPackage.FONCTION:
				sequence_Fonction(context, (Fonction) semanticObject); 
				return; 
			case MyDslPackage.FOR:
				sequence_For(context, (For) semanticObject); 
				return; 
			case MyDslPackage.FOREACH:
				sequence_Foreach(context, (Foreach) semanticObject); 
				return; 
			case MyDslPackage.HD:
				sequence_Hd(context, (Hd) semanticObject); 
				return; 
			case MyDslPackage.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case MyDslPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case MyDslPackage.LEXPR:
				sequence_LExpr(context, (LExpr) semanticObject); 
				return; 
			case MyDslPackage.LEXPR2:
				sequence_LExpr2(context, (LExpr2) semanticObject); 
				return; 
			case MyDslPackage.LISTE:
				sequence_Liste(context, (Liste) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case MyDslPackage.PROGRAMME:
				sequence_Programme(context, (Programme) semanticObject); 
				return; 
			case MyDslPackage.SYMBOLE_EX:
				sequence_SymboleEx(context, (SymboleEx) semanticObject); 
				return; 
			case MyDslPackage.TL:
				sequence_Tl(context, (Tl) semanticObject); 
				return; 
			case MyDslPackage.VARS:
				sequence_Vars(context, (Vars) semanticObject); 
				return; 
			case MyDslPackage.WHILE:
				sequence_While(context, (While) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (var1=Vars exp=Exprs)
	 */
	protected void sequence_AffectVar(EObject context, AffectVar semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.AFFECT_VAR__VAR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.AFFECT_VAR__VAR1));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.AFFECT_VAR__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.AFFECT_VAR__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAffectVarAccess().getVar1VarsParserRuleCall_0_0(), semanticObject.getVar1());
		feeder.accept(grammarAccess.getAffectVarAccess().getExpExprsParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nop='nop'
	 */
	protected void sequence_Commande(EObject context, Commande semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (com1=Commande com2+=Commande*)
	 */
	protected void sequence_Commandes(EObject context, Commandes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     le1=LExpr
	 */
	protected void sequence_Cons(EObject context, Cons semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CONS__LE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CONS__LE1));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConsAccess().getLe1LExprParserRuleCall_2_0(), semanticObject.getLe1());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expO=ExprOr expO2+=ExprOr*)
	 */
	protected void sequence_ExprAnd(EObject context, ExprAnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((expS1=ExprSimple expS2=ExprSimple) | expR=Expr)
	 */
	protected void sequence_ExprEq(EObject context, ExprEq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expEq2=ExprEq
	 */
	protected void sequence_ExprNotDo(EObject context, ExprNotDo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EXPR_NOT_DO__EXP_EQ2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EXPR_NOT_DO__EXP_EQ2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExprNotDoAccess().getExpEq2ExprEqParserRuleCall_0(), semanticObject.getExpEq2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expEq1=ExprEq
	 */
	protected void sequence_ExprNotNot(EObject context, ExprNotNot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EXPR_NOT_NOT__EXP_EQ1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EXPR_NOT_NOT__EXP_EQ1));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExprNotNotAccess().getExpEq1ExprEqParserRuleCall_1_0(), semanticObject.getExpEq1());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (exprNotNot=ExprNotNot | exprNotDo=ExprNotDo)
	 */
	protected void sequence_ExprNot(EObject context, ExprNot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expN=ExprNot expN2+=ExprNot*)
	 */
	protected void sequence_ExprOr(EObject context, ExprOr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     vide='nil'
	 */
	protected void sequence_ExprSimple(EObject context, ExprSimple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expA=ExprAnd | expS=ExprSimple)
	 */
	protected void sequence_Expr(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exprS=Expr exprS2+=Expr*)
	 */
	protected void sequence_Exprs(EObject context, Exprs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (symbole=SYM in=Input com=Commandes out=Output)
	 */
	protected void sequence_Fonction(EObject context, Fonction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FONCTION__SYMBOLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FONCTION__SYMBOLE));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FONCTION__IN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FONCTION__IN));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FONCTION__COM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FONCTION__COM));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FONCTION__OUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FONCTION__OUT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFonctionAccess().getSymboleSYMTerminalRuleCall_2_0(), semanticObject.getSymbole());
		feeder.accept(grammarAccess.getFonctionAccess().getInInputParserRuleCall_7_0(), semanticObject.getIn());
		feeder.accept(grammarAccess.getFonctionAccess().getComCommandesParserRuleCall_9_0(), semanticObject.getCom());
		feeder.accept(grammarAccess.getFonctionAccess().getOutOutputParserRuleCall_13_0(), semanticObject.getOut());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (exp3=Expr com4=Commandes)
	 */
	protected void sequence_For(EObject context, For semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR__EXP3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR__EXP3));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR__COM4) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR__COM4));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForAccess().getExp3ExprParserRuleCall_2_0(), semanticObject.getExp3());
		feeder.accept(grammarAccess.getForAccess().getCom4CommandesParserRuleCall_6_0(), semanticObject.getCom4());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (exp5=Expr exp6=Expr com7=Commandes)
	 */
	protected void sequence_Foreach(EObject context, Foreach semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOREACH__EXP5) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOREACH__EXP5));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOREACH__EXP6) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOREACH__EXP6));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOREACH__COM7) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOREACH__COM7));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForeachAccess().getExp5ExprParserRuleCall_2_0(), semanticObject.getExp5());
		feeder.accept(grammarAccess.getForeachAccess().getExp6ExprParserRuleCall_6_0(), semanticObject.getExp6());
		feeder.accept(grammarAccess.getForeachAccess().getCom7CommandesParserRuleCall_10_0(), semanticObject.getCom7());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     le3=Expr
	 */
	protected void sequence_Hd(EObject context, Hd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.HD__LE3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.HD__LE3));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHdAccess().getLe3ExprParserRuleCall_3_0(), semanticObject.getLe3());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (exp4=Expr com5=Commandes com6=Commandes?)
	 */
	protected void sequence_If(EObject context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var1=VAR var2+=VAR*)
	 */
	protected void sequence_Input(EObject context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expLe2+=Expr+
	 */
	protected void sequence_LExpr2(EObject context, LExpr2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expLe+=Expr+
	 */
	protected void sequence_LExpr(EObject context, LExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     le2=LExpr
	 */
	protected void sequence_Liste(EObject context, Liste semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LISTE__LE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LISTE__LE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getListeAccess().getLe2LExprParserRuleCall_2_0(), semanticObject.getLe2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     programme=Programme
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MODEL__PROGRAMME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MODEL__PROGRAMME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getProgrammeProgrammeParserRuleCall_0(), semanticObject.getProgramme());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var1=VAR var2+=VAR*)
	 */
	protected void sequence_Output(EObject context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fonct+=Fonction*)
	 */
	protected void sequence_Programme(EObject context, Programme semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (p=SYM le5=LExpr2)
	 */
	protected void sequence_SymboleEx(EObject context, SymboleEx semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SYMBOLE_EX__P) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SYMBOLE_EX__P));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SYMBOLE_EX__LE5) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SYMBOLE_EX__LE5));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSymboleExAccess().getPSYMTerminalRuleCall_1_0(), semanticObject.getP());
		feeder.accept(grammarAccess.getSymboleExAccess().getLe5LExpr2ParserRuleCall_2_0(), semanticObject.getLe5());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     le4=Expr
	 */
	protected void sequence_Tl(EObject context, Tl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TL__LE4) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TL__LE4));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTlAccess().getLe4ExprParserRuleCall_3_0(), semanticObject.getLe4());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var2=VAR var3+=VAR*)
	 */
	protected void sequence_Vars(EObject context, Vars semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp2=Expr com3=Commandes)
	 */
	protected void sequence_While(EObject context, While semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.WHILE__EXP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.WHILE__EXP2));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.WHILE__COM3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.WHILE__COM3));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileAccess().getExp2ExprParserRuleCall_2_0(), semanticObject.getExp2());
		feeder.accept(grammarAccess.getWhileAccess().getCom3CommandesParserRuleCall_6_0(), semanticObject.getCom3());
		feeder.finish();
	}
}
