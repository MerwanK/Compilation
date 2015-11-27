/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ExprNot___NotKeyword_0_0_LCParserRuleCall_0_1__q;
	protected AbstractElementAlias match_Programme_CRTerminalRuleCall_1_1_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_ExprNot___NotKeyword_0_0_LCParserRuleCall_0_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getExprNotAccess().getNotKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getExprNotAccess().getLCParserRuleCall_0_1()));
		match_Programme_CRTerminalRuleCall_1_1_a = new TokenAlias(true, true, grammarAccess.getProgrammeAccess().getCRTerminalRuleCall_1_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCRRule())
			return getCRToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLCRule())
			return getLCToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPARADRule())
			return getPARADToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPARAGRule())
			return getPARAGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal CR : '\n';
	 */
	protected String getCRToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	/**
	 * LC :
	 * 	(SP|CR|TAB|LF)*;
	 */
	protected String getLCToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal PARAD : ')';
	 */
	protected String getPARADToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal PARAG : '(';
	 */
	protected String getPARAGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ExprNot___NotKeyword_0_0_LCParserRuleCall_0_1__q.equals(syntax))
				emit_ExprNot___NotKeyword_0_0_LCParserRuleCall_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Programme_CRTerminalRuleCall_1_1_a.equals(syntax))
				emit_Programme_CRTerminalRuleCall_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('not' LC)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) expEq=ExprEq
	 */
	protected void emit_ExprNot___NotKeyword_0_0_LCParserRuleCall_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     CR*
	 *
	 * This ambiguous syntax occurs at:
	 *     fonct+=Fonction (ambiguity) (rule end)
	 *     fonct+=Fonction (ambiguity) fonct+=Fonction
	 */
	protected void emit_Programme_CRTerminalRuleCall_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}