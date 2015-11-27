package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SP", "RULE_CR", "RULE_TAB", "RULE_LF", "RULE_PARAG", "RULE_PARAD", "RULE_SYM", "RULE_VAR", "RULE_CONF", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fonction'", "':'", "'read'", "'%'", "'write'", "','", "';'", "':='", "'while'", "'do'", "'od'", "'for'", "'if'", "'then'", "'fi'", "'else'", "'foreach'", "'in'", "'cons'", "'list'", "'hd'", "'tl'", "'and'", "'or'", "'not'", "'=?'", "'nop'", "'nil'"
    };
    public static final int RULE_LF=7;
    public static final int RULE_CR=5;
    public static final int RULE_TAB=6;
    public static final int RULE_SP=4;
    public static final int RULE_ID=13;
    public static final int RULE_CONF=12;
    public static final int RULE_PARAD=9;
    public static final int RULE_PARAG=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=14;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=15;
    public static final int RULE_SL_COMMENT=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SYM=10;
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_VAR=11;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ( ruleModel EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:70:1: ruleModel : ( ( rule__Model__ProgrammeAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:2: ( ( ( rule__Model__ProgrammeAssignment ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( ( rule__Model__ProgrammeAssignment ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( ( rule__Model__ProgrammeAssignment ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Model__ProgrammeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getProgrammeAssignment()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:77:1: ( rule__Model__ProgrammeAssignment )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:77:2: rule__Model__ProgrammeAssignment
            {
            pushFollow(FOLLOW_rule__Model__ProgrammeAssignment_in_ruleModel100);
            rule__Model__ProgrammeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getProgrammeAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProgramme"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: entryRuleProgramme : ruleProgramme EOF ;
    public final void entryRuleProgramme() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ( ruleProgramme EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:91:1: ruleProgramme EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeRule()); 
            }
            pushFollow(FOLLOW_ruleProgramme_in_entryRuleProgramme127);
            ruleProgramme();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgrammeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgramme134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgramme"


    // $ANTLR start "ruleProgramme"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:98:1: ruleProgramme : ( ( rule__Programme__Group__0 ) ) ;
    public final void ruleProgramme() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:2: ( ( ( rule__Programme__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( ( rule__Programme__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( ( rule__Programme__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Programme__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:105:1: ( rule__Programme__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:105:2: rule__Programme__Group__0
            {
            pushFollow(FOLLOW_rule__Programme__Group__0_in_ruleProgramme160);
            rule__Programme__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgrammeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgramme"


    // $ANTLR start "entryRuleFonction"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: entryRuleFonction : ruleFonction EOF ;
    public final void entryRuleFonction() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ( ruleFonction EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:119:1: ruleFonction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionRule()); 
            }
            pushFollow(FOLLOW_ruleFonction_in_entryRuleFonction187);
            ruleFonction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFonction194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFonction"


    // $ANTLR start "ruleFonction"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:126:1: ruleFonction : ( ( rule__Fonction__Group__0 ) ) ;
    public final void ruleFonction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:2: ( ( ( rule__Fonction__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( ( rule__Fonction__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( ( rule__Fonction__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Fonction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:133:1: ( rule__Fonction__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:133:2: rule__Fonction__Group__0
            {
            pushFollow(FOLLOW_rule__Fonction__Group__0_in_ruleFonction220);
            rule__Fonction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFonction"


    // $ANTLR start "entryRuleInput"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ( ruleInput EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:147:1: ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput247);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:154:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:2: ( ( ( rule__Input__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( ( rule__Input__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( ( rule__Input__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Input__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: ( rule__Input__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:2: rule__Input__Group__0
            {
            pushFollow(FOLLOW_rule__Input__Group__0_in_ruleInput280);
            rule__Input__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ( ruleOutput EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:175:1: ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput307);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:182:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:2: ( ( ( rule__Output__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( ( rule__Output__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( ( rule__Output__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__Output__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( rule__Output__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:189:2: rule__Output__Group__0
            {
            pushFollow(FOLLOW_rule__Output__Group__0_in_ruleOutput340);
            rule__Output__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommandes"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: entryRuleCommandes : ruleCommandes EOF ;
    public final void entryRuleCommandes() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ( ruleCommandes EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:203:1: ruleCommandes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesRule()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_entryRuleCommandes367);
            ruleCommandes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandes374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommandes"


    // $ANTLR start "ruleCommandes"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:1: ruleCommandes : ( ( rule__Commandes__Group__0 ) ) ;
    public final void ruleCommandes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:2: ( ( ( rule__Commandes__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( ( rule__Commandes__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( ( rule__Commandes__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__Commandes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:217:1: ( rule__Commandes__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:217:2: rule__Commandes__Group__0
            {
            pushFollow(FOLLOW_rule__Commandes__Group__0_in_ruleCommandes400);
            rule__Commandes__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandes"


    // $ANTLR start "entryRuleCommande"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: entryRuleCommande : ruleCommande EOF ;
    public final void entryRuleCommande() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ( ruleCommande EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:231:1: ruleCommande EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeRule()); 
            }
            pushFollow(FOLLOW_ruleCommande_in_entryRuleCommande427);
            ruleCommande();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommande434); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommande"


    // $ANTLR start "ruleCommande"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:238:1: ruleCommande : ( ( rule__Commande__Alternatives ) ) ;
    public final void ruleCommande() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:2: ( ( ( rule__Commande__Alternatives ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( ( rule__Commande__Alternatives ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( ( rule__Commande__Alternatives ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__Commande__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getAlternatives()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:245:1: ( rule__Commande__Alternatives )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:245:2: rule__Commande__Alternatives
            {
            pushFollow(FOLLOW_rule__Commande__Alternatives_in_ruleCommande460);
            rule__Commande__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommande"


    // $ANTLR start "entryRuleAffectVar"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: entryRuleAffectVar : ruleAffectVar EOF ;
    public final void entryRuleAffectVar() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ( ruleAffectVar EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:259:1: ruleAffectVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarRule()); 
            }
            pushFollow(FOLLOW_ruleAffectVar_in_entryRuleAffectVar487);
            ruleAffectVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectVarRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectVar494); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAffectVar"


    // $ANTLR start "ruleAffectVar"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:266:1: ruleAffectVar : ( ( rule__AffectVar__Group__0 ) ) ;
    public final void ruleAffectVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:2: ( ( ( rule__AffectVar__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( ( rule__AffectVar__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( ( rule__AffectVar__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__AffectVar__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: ( rule__AffectVar__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:273:2: rule__AffectVar__Group__0
            {
            pushFollow(FOLLOW_rule__AffectVar__Group__0_in_ruleAffectVar520);
            rule__AffectVar__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectVarAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAffectVar"


    // $ANTLR start "entryRuleWhile"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ( ruleWhile EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:287:1: ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile547);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile554); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:294:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:2: ( ( ( rule__While__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( ( rule__While__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( ( rule__While__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__While__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:301:1: ( rule__While__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:301:2: rule__While__Group__0
            {
            pushFollow(FOLLOW_rule__While__Group__0_in_ruleWhile580);
            rule__While__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleFor"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: entryRuleFor : ruleFor EOF ;
    public final void entryRuleFor() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ( ruleFor EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:315:1: ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor607);
            ruleFor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor614); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:322:1: ruleFor : ( ( rule__For__Group__0 ) ) ;
    public final void ruleFor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:2: ( ( ( rule__For__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( ( rule__For__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( ( rule__For__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__For__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( rule__For__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:2: rule__For__Group__0
            {
            pushFollow(FOLLOW_rule__For__Group__0_in_ruleFor640);
            rule__For__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleIf"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ( ruleIf EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf667);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf674); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:350:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:2: ( ( ( rule__If__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( ( rule__If__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( ( rule__If__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ( rule__If__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:357:2: rule__If__Group__0
            {
            pushFollow(FOLLOW_rule__If__Group__0_in_ruleIf700);
            rule__If__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleForeach"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: entryRuleForeach : ruleForeach EOF ;
    public final void entryRuleForeach() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ( ruleForeach EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ruleForeach EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachRule()); 
            }
            pushFollow(FOLLOW_ruleForeach_in_entryRuleForeach727);
            ruleForeach();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeach734); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForeach"


    // $ANTLR start "ruleForeach"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:378:1: ruleForeach : ( ( rule__Foreach__Group__0 ) ) ;
    public final void ruleForeach() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:2: ( ( ( rule__Foreach__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( ( rule__Foreach__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( ( rule__Foreach__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( rule__Foreach__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: ( rule__Foreach__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:385:2: rule__Foreach__Group__0
            {
            pushFollow(FOLLOW_rule__Foreach__Group__0_in_ruleForeach760);
            rule__Foreach__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForeach"


    // $ANTLR start "entryRuleVars"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: entryRuleVars : ruleVars EOF ;
    public final void entryRuleVars() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ( ruleVars EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:399:1: ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars787);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars794); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:406:1: ruleVars : ( ( rule__Vars__Group__0 ) ) ;
    public final void ruleVars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:2: ( ( ( rule__Vars__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( ( rule__Vars__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( ( rule__Vars__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( rule__Vars__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:413:1: ( rule__Vars__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:413:2: rule__Vars__Group__0
            {
            pushFollow(FOLLOW_rule__Vars__Group__0_in_ruleVars820);
            rule__Vars__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExprs"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: entryRuleExprs : ruleExprs EOF ;
    public final void entryRuleExprs() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ( ruleExprs EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs847);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs854); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:434:1: ruleExprs : ( ( rule__Exprs__Group__0 ) ) ;
    public final void ruleExprs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:2: ( ( ( rule__Exprs__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( ( rule__Exprs__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( ( rule__Exprs__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( rule__Exprs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: ( rule__Exprs__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:441:2: rule__Exprs__Group__0
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0_in_ruleExprs880);
            rule__Exprs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpr"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: ( ruleExpr EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:455:1: ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr907);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr914); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: ruleExpr : ( ( rule__Expr__Alternatives ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:2: ( ( ( rule__Expr__Alternatives ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( ( rule__Expr__Alternatives ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( ( rule__Expr__Alternatives ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( rule__Expr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAlternatives()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( rule__Expr__Alternatives )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:2: rule__Expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Expr__Alternatives_in_ruleExpr940);
            rule__Expr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSimple"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: entryRuleExprSimple : ruleExprSimple EOF ;
    public final void entryRuleExprSimple() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: ( ruleExprSimple EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple967);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple974); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:490:1: ruleExprSimple : ( ( rule__ExprSimple__Alternatives ) ) ;
    public final void ruleExprSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:2: ( ( ( rule__ExprSimple__Alternatives ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( ( rule__ExprSimple__Alternatives ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( ( rule__ExprSimple__Alternatives ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( rule__ExprSimple__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getAlternatives()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( rule__ExprSimple__Alternatives )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:497:2: rule__ExprSimple__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprSimple__Alternatives_in_ruleExprSimple1000);
            rule__ExprSimple__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleCons"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: entryRuleCons : ruleCons EOF ;
    public final void entryRuleCons() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ( ruleCons EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: ruleCons EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsRule()); 
            }
            pushFollow(FOLLOW_ruleCons_in_entryRuleCons1027);
            ruleCons();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCons1034); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCons"


    // $ANTLR start "ruleCons"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:518:1: ruleCons : ( ( rule__Cons__Group__0 ) ) ;
    public final void ruleCons() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:2: ( ( ( rule__Cons__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( ( rule__Cons__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( ( rule__Cons__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( rule__Cons__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( rule__Cons__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:525:2: rule__Cons__Group__0
            {
            pushFollow(FOLLOW_rule__Cons__Group__0_in_ruleCons1060);
            rule__Cons__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCons"


    // $ANTLR start "entryRuleListe"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: entryRuleListe : ruleListe EOF ;
    public final void entryRuleListe() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: ( ruleListe EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:539:1: ruleListe EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeRule()); 
            }
            pushFollow(FOLLOW_ruleListe_in_entryRuleListe1087);
            ruleListe();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListe1094); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListe"


    // $ANTLR start "ruleListe"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: ruleListe : ( ( rule__Liste__Group__0 ) ) ;
    public final void ruleListe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:2: ( ( ( rule__Liste__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( ( rule__Liste__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( ( rule__Liste__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( rule__Liste__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( rule__Liste__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:553:2: rule__Liste__Group__0
            {
            pushFollow(FOLLOW_rule__Liste__Group__0_in_ruleListe1120);
            rule__Liste__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListe"


    // $ANTLR start "entryRuleHd"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: entryRuleHd : ruleHd EOF ;
    public final void entryRuleHd() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ( ruleHd EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: ruleHd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdRule()); 
            }
            pushFollow(FOLLOW_ruleHd_in_entryRuleHd1147);
            ruleHd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHdRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHd1154); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHd"


    // $ANTLR start "ruleHd"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:574:1: ruleHd : ( ( rule__Hd__Group__0 ) ) ;
    public final void ruleHd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:2: ( ( ( rule__Hd__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( rule__Hd__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( rule__Hd__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( rule__Hd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ( rule__Hd__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:581:2: rule__Hd__Group__0
            {
            pushFollow(FOLLOW_rule__Hd__Group__0_in_ruleHd1180);
            rule__Hd__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHdAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHd"


    // $ANTLR start "entryRuleTl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:593:1: entryRuleTl : ruleTl EOF ;
    public final void entryRuleTl() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ( ruleTl EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: ruleTl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlRule()); 
            }
            pushFollow(FOLLOW_ruleTl_in_entryRuleTl1207);
            ruleTl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTlRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTl1214); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTl"


    // $ANTLR start "ruleTl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: ruleTl : ( ( rule__Tl__Group__0 ) ) ;
    public final void ruleTl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:2: ( ( ( rule__Tl__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( ( rule__Tl__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( ( rule__Tl__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( rule__Tl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( rule__Tl__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:609:2: rule__Tl__Group__0
            {
            pushFollow(FOLLOW_rule__Tl__Group__0_in_ruleTl1240);
            rule__Tl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTlAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTl"


    // $ANTLR start "entryRuleSymboleEx"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: entryRuleSymboleEx : ruleSymboleEx EOF ;
    public final void entryRuleSymboleEx() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: ( ruleSymboleEx EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ruleSymboleEx EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExRule()); 
            }
            pushFollow(FOLLOW_ruleSymboleEx_in_entryRuleSymboleEx1267);
            ruleSymboleEx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymboleExRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymboleEx1274); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymboleEx"


    // $ANTLR start "ruleSymboleEx"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: ruleSymboleEx : ( ( rule__SymboleEx__Group__0 ) ) ;
    public final void ruleSymboleEx() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:2: ( ( ( rule__SymboleEx__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( ( rule__SymboleEx__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( ( rule__SymboleEx__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( rule__SymboleEx__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: ( rule__SymboleEx__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:637:2: rule__SymboleEx__Group__0
            {
            pushFollow(FOLLOW_rule__SymboleEx__Group__0_in_ruleSymboleEx1300);
            rule__SymboleEx__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymboleExAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymboleEx"


    // $ANTLR start "entryRuleLExpr"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: entryRuleLExpr : ruleLExpr EOF ;
    public final void entryRuleLExpr() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ( ruleLExpr EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ruleLExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprRule()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_entryRuleLExpr1327);
            ruleLExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLExpr1334); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLExpr"


    // $ANTLR start "ruleLExpr"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: ruleLExpr : ( ( ( rule__LExpr__Group__0 ) ) ( ( rule__LExpr__Group__0 )* ) ) ;
    public final void ruleLExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:2: ( ( ( ( rule__LExpr__Group__0 ) ) ( ( rule__LExpr__Group__0 )* ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( ( ( rule__LExpr__Group__0 ) ) ( ( rule__LExpr__Group__0 )* ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( ( ( rule__LExpr__Group__0 ) ) ( ( rule__LExpr__Group__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( ( rule__LExpr__Group__0 ) ) ( ( rule__LExpr__Group__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( ( rule__LExpr__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:665:1: ( rule__LExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( rule__LExpr__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:2: rule__LExpr__Group__0
            {
            pushFollow(FOLLOW_rule__LExpr__Group__0_in_ruleLExpr1362);
            rule__LExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExprAccess().getGroup()); 
            }

            }

            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( ( rule__LExpr__Group__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: ( rule__LExpr__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:671:1: ( rule__LExpr__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_SP && LA1_0<=RULE_PARAG)||(LA1_0>=RULE_SYM && LA1_0<=RULE_VAR)||LA1_0==44||LA1_0==47) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:671:2: rule__LExpr__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__LExpr__Group__0_in_ruleLExpr1374);
            	    rule__LExpr__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExprAccess().getGroup()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLExpr"


    // $ANTLR start "entryRuleExprAnd"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:684:1: entryRuleExprAnd : ruleExprAnd EOF ;
    public final void entryRuleExprAnd() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:685:1: ( ruleExprAnd EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd1404);
            ruleExprAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd1411); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprAnd"


    // $ANTLR start "ruleExprAnd"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ruleExprAnd : ( ( rule__ExprAnd__Group__0 ) ) ;
    public final void ruleExprAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:697:2: ( ( ( rule__ExprAnd__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: ( ( rule__ExprAnd__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: ( ( rule__ExprAnd__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:699:1: ( rule__ExprAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: ( rule__ExprAnd__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:700:2: rule__ExprAnd__Group__0
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__0_in_ruleExprAnd1437);
            rule__ExprAnd__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:712:1: entryRuleExprOr : ruleExprOr EOF ;
    public final void entryRuleExprOr() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( ruleExprOr EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr1464);
            ruleExprOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr1471); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprOr"


    // $ANTLR start "ruleExprOr"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ruleExprOr : ( ( rule__ExprOr__Group__0 ) ) ;
    public final void ruleExprOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:725:2: ( ( ( rule__ExprOr__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:726:1: ( ( rule__ExprOr__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:726:1: ( ( rule__ExprOr__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:727:1: ( rule__ExprOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: ( rule__ExprOr__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:728:2: rule__ExprOr__Group__0
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__0_in_ruleExprOr1497);
            rule__ExprOr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleExprNot"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:740:1: entryRuleExprNot : ruleExprNot EOF ;
    public final void entryRuleExprNot() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: ( ruleExprNot EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_entryRuleExprNot1524);
            ruleExprNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNot1531); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprNot"


    // $ANTLR start "ruleExprNot"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ruleExprNot : ( ( rule__ExprNot__Group__0 ) ) ;
    public final void ruleExprNot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:753:2: ( ( ( rule__ExprNot__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:1: ( ( rule__ExprNot__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:1: ( ( rule__ExprNot__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: ( rule__ExprNot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: ( rule__ExprNot__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:756:2: rule__ExprNot__Group__0
            {
            pushFollow(FOLLOW_rule__ExprNot__Group__0_in_ruleExprNot1557);
            rule__ExprNot__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprNot"


    // $ANTLR start "entryRuleExprEq"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: entryRuleExprEq : ruleExprEq EOF ;
    public final void entryRuleExprEq() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ( ruleExprEq EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_entryRuleExprEq1584);
            ruleExprEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEq1591); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprEq"


    // $ANTLR start "ruleExprEq"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:777:1: ruleExprEq : ( ( rule__ExprEq__Alternatives ) ) ;
    public final void ruleExprEq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:781:2: ( ( ( rule__ExprEq__Alternatives ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: ( ( rule__ExprEq__Alternatives ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: ( ( rule__ExprEq__Alternatives ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( rule__ExprEq__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getAlternatives()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: ( rule__ExprEq__Alternatives )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:784:2: rule__ExprEq__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprEq__Alternatives_in_ruleExprEq1617);
            rule__ExprEq__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprEq"


    // $ANTLR start "entryRuleLC"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: entryRuleLC : ruleLC EOF ;
    public final void entryRuleLC() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( ruleLC EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ruleLC EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCRule()); 
            }
            pushFollow(FOLLOW_ruleLC_in_entryRuleLC1644);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLC1651); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLC"


    // $ANTLR start "ruleLC"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:805:1: ruleLC : ( ( rule__LC__Alternatives )? ) ;
    public final void ruleLC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:809:2: ( ( ( rule__LC__Alternatives )? ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: ( ( rule__LC__Alternatives )? )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: ( ( rule__LC__Alternatives )? )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: ( rule__LC__Alternatives )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCAccess().getAlternatives()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:812:1: ( rule__LC__Alternatives )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_SP && LA2_0<=RULE_LF)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:812:2: rule__LC__Alternatives
                    {
                    pushFollow(FOLLOW_rule__LC__Alternatives_in_ruleLC1677);
                    rule__LC__Alternatives();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLC"


    // $ANTLR start "rule__Commande__Alternatives"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:824:1: rule__Commande__Alternatives : ( ( ( rule__Commande__Group_0__0 ) ) | ( ( rule__Commande__AffectVarAssignment_1 ) ) | ( ( rule__Commande__WhileCAssignment_2 ) ) | ( ( rule__Commande__ForCAssignment_3 ) ) | ( ( rule__Commande__IfCAssignment_4 ) ) | ( ( rule__Commande__ForeachCAssignment_5 ) ) );
    public final void rule__Commande__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: ( ( ( rule__Commande__Group_0__0 ) ) | ( ( rule__Commande__AffectVarAssignment_1 ) ) | ( ( rule__Commande__WhileCAssignment_2 ) ) | ( ( rule__Commande__ForCAssignment_3 ) ) | ( ( rule__Commande__IfCAssignment_4 ) ) | ( ( rule__Commande__ForeachCAssignment_5 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt3=1;
                }
                break;
            case RULE_VAR:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 31:
                {
                alt3=4;
                }
                break;
            case 32:
                {
                alt3=5;
                }
                break;
            case 36:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: ( ( rule__Commande__Group_0__0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: ( ( rule__Commande__Group_0__0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( rule__Commande__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getGroup_0()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( rule__Commande__Group_0__0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:2: rule__Commande__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Commande__Group_0__0_in_rule__Commande__Alternatives1714);
                    rule__Commande__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandeAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:835:6: ( ( rule__Commande__AffectVarAssignment_1 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:835:6: ( ( rule__Commande__AffectVarAssignment_1 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:836:1: ( rule__Commande__AffectVarAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getAffectVarAssignment_1()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:837:1: ( rule__Commande__AffectVarAssignment_1 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:837:2: rule__Commande__AffectVarAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Commande__AffectVarAssignment_1_in_rule__Commande__Alternatives1732);
                    rule__Commande__AffectVarAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandeAccess().getAffectVarAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:841:6: ( ( rule__Commande__WhileCAssignment_2 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:841:6: ( ( rule__Commande__WhileCAssignment_2 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:842:1: ( rule__Commande__WhileCAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getWhileCAssignment_2()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:843:1: ( rule__Commande__WhileCAssignment_2 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:843:2: rule__Commande__WhileCAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Commande__WhileCAssignment_2_in_rule__Commande__Alternatives1750);
                    rule__Commande__WhileCAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandeAccess().getWhileCAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:847:6: ( ( rule__Commande__ForCAssignment_3 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:847:6: ( ( rule__Commande__ForCAssignment_3 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:848:1: ( rule__Commande__ForCAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getForCAssignment_3()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: ( rule__Commande__ForCAssignment_3 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:849:2: rule__Commande__ForCAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Commande__ForCAssignment_3_in_rule__Commande__Alternatives1768);
                    rule__Commande__ForCAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandeAccess().getForCAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:853:6: ( ( rule__Commande__IfCAssignment_4 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:853:6: ( ( rule__Commande__IfCAssignment_4 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: ( rule__Commande__IfCAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getIfCAssignment_4()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: ( rule__Commande__IfCAssignment_4 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:855:2: rule__Commande__IfCAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Commande__IfCAssignment_4_in_rule__Commande__Alternatives1786);
                    rule__Commande__IfCAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandeAccess().getIfCAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:6: ( ( rule__Commande__ForeachCAssignment_5 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:6: ( ( rule__Commande__ForeachCAssignment_5 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ( rule__Commande__ForeachCAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getForeachCAssignment_5()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ( rule__Commande__ForeachCAssignment_5 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:2: rule__Commande__ForeachCAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Commande__ForeachCAssignment_5_in_rule__Commande__Alternatives1804);
                    rule__Commande__ForeachCAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandeAccess().getForeachCAssignment_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commande__Alternatives"


    // $ANTLR start "rule__Expr__Alternatives"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:870:1: rule__Expr__Alternatives : ( ( ( rule__Expr__ExpAAssignment_0 ) ) | ( ( rule__Expr__ExpSAssignment_1 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: ( ( ( rule__Expr__ExpAAssignment_0 ) ) | ( ( rule__Expr__ExpSAssignment_1 ) ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt4=1;
                }
                break;
            case 47:
                {
                int LA4_2 = input.LA(2);

                if ( (synpred8_InternalMyDsl()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VAR:
                {
                int LA4_3 = input.LA(2);

                if ( (synpred8_InternalMyDsl()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYM:
                {
                int LA4_4 = input.LA(2);

                if ( (synpred8_InternalMyDsl()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_PARAG:
                {
                int LA4_5 = input.LA(2);

                if ( (synpred8_InternalMyDsl()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: ( ( rule__Expr__ExpAAssignment_0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: ( ( rule__Expr__ExpAAssignment_0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:876:1: ( rule__Expr__ExpAAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExpAAssignment_0()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:877:1: ( rule__Expr__ExpAAssignment_0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:877:2: rule__Expr__ExpAAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expr__ExpAAssignment_0_in_rule__Expr__Alternatives1837);
                    rule__Expr__ExpAAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExpAAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:881:6: ( ( rule__Expr__ExpSAssignment_1 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:881:6: ( ( rule__Expr__ExpSAssignment_1 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( rule__Expr__ExpSAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExpSAssignment_1()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: ( rule__Expr__ExpSAssignment_1 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:883:2: rule__Expr__ExpSAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expr__ExpSAssignment_1_in_rule__Expr__Alternatives1855);
                    rule__Expr__ExpSAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExpSAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Alternatives"


    // $ANTLR start "rule__ExprSimple__Alternatives"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: rule__ExprSimple__Alternatives : ( ( ( rule__ExprSimple__Group_0__0 ) ) | ( ( rule__ExprSimple__VariableAssignment_1 ) ) | ( ( rule__ExprSimple__SymboleAssignment_2 ) ) | ( ( rule__ExprSimple__ConsAssignment_3 ) ) | ( ( rule__ExprSimple__ListeAssignment_4 ) ) | ( ( rule__ExprSimple__HdAssignment_5 ) ) | ( ( rule__ExprSimple__TlAssignment_6 ) ) | ( ( rule__ExprSimple__SymbolExAssignment_7 ) ) );
    public final void rule__ExprSimple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: ( ( ( rule__ExprSimple__Group_0__0 ) ) | ( ( rule__ExprSimple__VariableAssignment_1 ) ) | ( ( rule__ExprSimple__SymboleAssignment_2 ) ) | ( ( rule__ExprSimple__ConsAssignment_3 ) ) | ( ( rule__ExprSimple__ListeAssignment_4 ) ) | ( ( rule__ExprSimple__HdAssignment_5 ) ) | ( ( rule__ExprSimple__TlAssignment_6 ) ) | ( ( rule__ExprSimple__SymbolExAssignment_7 ) ) )
            int alt5=8;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: ( ( rule__ExprSimple__Group_0__0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: ( ( rule__ExprSimple__Group_0__0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:898:1: ( rule__ExprSimple__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_0()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( rule__ExprSimple__Group_0__0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:899:2: rule__ExprSimple__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_0__0_in_rule__ExprSimple__Alternatives1888);
                    rule__ExprSimple__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:903:6: ( ( rule__ExprSimple__VariableAssignment_1 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:903:6: ( ( rule__ExprSimple__VariableAssignment_1 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: ( rule__ExprSimple__VariableAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getVariableAssignment_1()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: ( rule__ExprSimple__VariableAssignment_1 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:905:2: rule__ExprSimple__VariableAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__VariableAssignment_1_in_rule__ExprSimple__Alternatives1906);
                    rule__ExprSimple__VariableAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getVariableAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:6: ( ( rule__ExprSimple__SymboleAssignment_2 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:6: ( ( rule__ExprSimple__SymboleAssignment_2 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( rule__ExprSimple__SymboleAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getSymboleAssignment_2()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: ( rule__ExprSimple__SymboleAssignment_2 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:911:2: rule__ExprSimple__SymboleAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__SymboleAssignment_2_in_rule__ExprSimple__Alternatives1924);
                    rule__ExprSimple__SymboleAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getSymboleAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:915:6: ( ( rule__ExprSimple__ConsAssignment_3 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:915:6: ( ( rule__ExprSimple__ConsAssignment_3 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( rule__ExprSimple__ConsAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getConsAssignment_3()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:1: ( rule__ExprSimple__ConsAssignment_3 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:2: rule__ExprSimple__ConsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__ConsAssignment_3_in_rule__ExprSimple__Alternatives1942);
                    rule__ExprSimple__ConsAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getConsAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:921:6: ( ( rule__ExprSimple__ListeAssignment_4 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:921:6: ( ( rule__ExprSimple__ListeAssignment_4 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: ( rule__ExprSimple__ListeAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getListeAssignment_4()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( rule__ExprSimple__ListeAssignment_4 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:923:2: rule__ExprSimple__ListeAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__ListeAssignment_4_in_rule__ExprSimple__Alternatives1960);
                    rule__ExprSimple__ListeAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getListeAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:927:6: ( ( rule__ExprSimple__HdAssignment_5 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:927:6: ( ( rule__ExprSimple__HdAssignment_5 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: ( rule__ExprSimple__HdAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getHdAssignment_5()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:929:1: ( rule__ExprSimple__HdAssignment_5 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:929:2: rule__ExprSimple__HdAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__HdAssignment_5_in_rule__ExprSimple__Alternatives1978);
                    rule__ExprSimple__HdAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getHdAssignment_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:6: ( ( rule__ExprSimple__TlAssignment_6 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:6: ( ( rule__ExprSimple__TlAssignment_6 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:934:1: ( rule__ExprSimple__TlAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getTlAssignment_6()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:935:1: ( rule__ExprSimple__TlAssignment_6 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:935:2: rule__ExprSimple__TlAssignment_6
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__TlAssignment_6_in_rule__ExprSimple__Alternatives1996);
                    rule__ExprSimple__TlAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getTlAssignment_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:6: ( ( rule__ExprSimple__SymbolExAssignment_7 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:6: ( ( rule__ExprSimple__SymbolExAssignment_7 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: ( rule__ExprSimple__SymbolExAssignment_7 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getSymbolExAssignment_7()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: ( rule__ExprSimple__SymbolExAssignment_7 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:941:2: rule__ExprSimple__SymbolExAssignment_7
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__SymbolExAssignment_7_in_rule__ExprSimple__Alternatives2014);
                    rule__ExprSimple__SymbolExAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getSymbolExAssignment_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Alternatives"


    // $ANTLR start "rule__ExprEq__Alternatives"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: rule__ExprEq__Alternatives : ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) );
    public final void rule__ExprEq__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_SYM && LA6_0<=RULE_VAR)||LA6_0==47) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_PARAG) ) {
                int LA6_4 = input.LA(2);

                if ( (synpred16_InternalMyDsl()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( ( rule__ExprEq__Group_0__0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( ( rule__ExprEq__Group_0__0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: ( rule__ExprEq__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_0()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:957:1: ( rule__ExprEq__Group_0__0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:957:2: rule__ExprEq__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives2047);
                    rule__ExprEq__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprEqAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:6: ( ( rule__ExprEq__Group_1__0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:6: ( ( rule__ExprEq__Group_1__0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:962:1: ( rule__ExprEq__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_1()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:963:1: ( rule__ExprEq__Group_1__0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:963:2: rule__ExprEq__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives2065);
                    rule__ExprEq__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprEqAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Alternatives"


    // $ANTLR start "rule__LC__Alternatives"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: rule__LC__Alternatives : ( ( RULE_SP ) | ( RULE_CR ) | ( RULE_TAB ) | ( RULE_LF ) );
    public final void rule__LC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:976:1: ( ( RULE_SP ) | ( RULE_CR ) | ( RULE_TAB ) | ( RULE_LF ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_SP:
                {
                alt7=1;
                }
                break;
            case RULE_CR:
                {
                alt7=2;
                }
                break;
            case RULE_TAB:
                {
                alt7=3;
                }
                break;
            case RULE_LF:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: ( RULE_SP )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: ( RULE_SP )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: RULE_SP
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getSPTerminalRuleCall_0()); 
                    }
                    match(input,RULE_SP,FOLLOW_RULE_SP_in_rule__LC__Alternatives2098); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCAccess().getSPTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:983:6: ( RULE_CR )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:983:6: ( RULE_CR )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:984:1: RULE_CR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getCRTerminalRuleCall_1()); 
                    }
                    match(input,RULE_CR,FOLLOW_RULE_CR_in_rule__LC__Alternatives2115); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCAccess().getCRTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:989:6: ( RULE_TAB )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:989:6: ( RULE_TAB )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: RULE_TAB
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getTABTerminalRuleCall_2()); 
                    }
                    match(input,RULE_TAB,FOLLOW_RULE_TAB_in_rule__LC__Alternatives2132); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCAccess().getTABTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:6: ( RULE_LF )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:6: ( RULE_LF )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:996:1: RULE_LF
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getLFTerminalRuleCall_3()); 
                    }
                    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__LC__Alternatives2149); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCAccess().getLFTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LC__Alternatives"


    // $ANTLR start "rule__Programme__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: rule__Programme__Group__0 : rule__Programme__Group__0__Impl rule__Programme__Group__1 ;
    public final void rule__Programme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: ( rule__Programme__Group__0__Impl rule__Programme__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:2: rule__Programme__Group__0__Impl rule__Programme__Group__1
            {
            pushFollow(FOLLOW_rule__Programme__Group__0__Impl_in_rule__Programme__Group__02179);
            rule__Programme__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Programme__Group__1_in_rule__Programme__Group__02182);
            rule__Programme__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__0"


    // $ANTLR start "rule__Programme__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1020:1: rule__Programme__Group__0__Impl : ( () ) ;
    public final void rule__Programme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:1: ( ( () ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: ( () )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: ( () )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getProgrammeAction_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:1: ()
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgrammeAccess().getProgrammeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__0__Impl"


    // $ANTLR start "rule__Programme__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: rule__Programme__Group__1 : rule__Programme__Group__1__Impl ;
    public final void rule__Programme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:1: ( rule__Programme__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:2: rule__Programme__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Programme__Group__1__Impl_in_rule__Programme__Group__12240);
            rule__Programme__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__1"


    // $ANTLR start "rule__Programme__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:1: rule__Programme__Group__1__Impl : ( ( rule__Programme__Group_1__0 )* ) ;
    public final void rule__Programme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( ( ( rule__Programme__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( ( rule__Programme__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( ( rule__Programme__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: ( rule__Programme__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:1: ( rule__Programme__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:2: rule__Programme__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Programme__Group_1__0_in_rule__Programme__Group__1__Impl2267);
            	    rule__Programme__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgrammeAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__1__Impl"


    // $ANTLR start "rule__Programme__Group_1__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:1: rule__Programme__Group_1__0 : rule__Programme__Group_1__0__Impl rule__Programme__Group_1__1 ;
    public final void rule__Programme__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( rule__Programme__Group_1__0__Impl rule__Programme__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:2: rule__Programme__Group_1__0__Impl rule__Programme__Group_1__1
            {
            pushFollow(FOLLOW_rule__Programme__Group_1__0__Impl_in_rule__Programme__Group_1__02302);
            rule__Programme__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Programme__Group_1__1_in_rule__Programme__Group_1__02305);
            rule__Programme__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_1__0"


    // $ANTLR start "rule__Programme__Group_1__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: rule__Programme__Group_1__0__Impl : ( ( rule__Programme__FonctAssignment_1_0 ) ) ;
    public final void rule__Programme__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:1: ( ( ( rule__Programme__FonctAssignment_1_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:1: ( ( rule__Programme__FonctAssignment_1_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:1: ( ( rule__Programme__FonctAssignment_1_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: ( rule__Programme__FonctAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getFonctAssignment_1_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:1: ( rule__Programme__FonctAssignment_1_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:2: rule__Programme__FonctAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Programme__FonctAssignment_1_0_in_rule__Programme__Group_1__0__Impl2332);
            rule__Programme__FonctAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgrammeAccess().getFonctAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_1__0__Impl"


    // $ANTLR start "rule__Programme__Group_1__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:1: rule__Programme__Group_1__1 : rule__Programme__Group_1__1__Impl ;
    public final void rule__Programme__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( rule__Programme__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:2: rule__Programme__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Programme__Group_1__1__Impl_in_rule__Programme__Group_1__12362);
            rule__Programme__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_1__1"


    // $ANTLR start "rule__Programme__Group_1__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: rule__Programme__Group_1__1__Impl : ( ( RULE_CR )* ) ;
    public final void rule__Programme__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1115:1: ( ( ( RULE_CR )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: ( ( RULE_CR )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: ( ( RULE_CR )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: ( RULE_CR )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getCRTerminalRuleCall_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:1: ( RULE_CR )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_CR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:3: RULE_CR
            	    {
            	    match(input,RULE_CR,FOLLOW_RULE_CR_in_rule__Programme__Group_1__1__Impl2390); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgrammeAccess().getCRTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_1__1__Impl"


    // $ANTLR start "rule__Fonction__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: rule__Fonction__Group__0 : rule__Fonction__Group__0__Impl rule__Fonction__Group__1 ;
    public final void rule__Fonction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:1: ( rule__Fonction__Group__0__Impl rule__Fonction__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:2: rule__Fonction__Group__0__Impl rule__Fonction__Group__1
            {
            pushFollow(FOLLOW_rule__Fonction__Group__0__Impl_in_rule__Fonction__Group__02425);
            rule__Fonction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__1_in_rule__Fonction__Group__02428);
            rule__Fonction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__0"


    // $ANTLR start "rule__Fonction__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:1: rule__Fonction__Group__0__Impl : ( 'fonction' ) ;
    public final void rule__Fonction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:1: ( ( 'fonction' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: ( 'fonction' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: ( 'fonction' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: 'fonction'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getFonctionKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Fonction__Group__0__Impl2456); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getFonctionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__0__Impl"


    // $ANTLR start "rule__Fonction__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:1: rule__Fonction__Group__1 : rule__Fonction__Group__1__Impl rule__Fonction__Group__2 ;
    public final void rule__Fonction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: ( rule__Fonction__Group__1__Impl rule__Fonction__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:2: rule__Fonction__Group__1__Impl rule__Fonction__Group__2
            {
            pushFollow(FOLLOW_rule__Fonction__Group__1__Impl_in_rule__Fonction__Group__12487);
            rule__Fonction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__2_in_rule__Fonction__Group__12490);
            rule__Fonction__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__1"


    // $ANTLR start "rule__Fonction__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: rule__Fonction__Group__1__Impl : ( ruleLC ) ;
    public final void rule__Fonction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Fonction__Group__1__Impl2517);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getLCParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__1__Impl"


    // $ANTLR start "rule__Fonction__Group__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:1: rule__Fonction__Group__2 : rule__Fonction__Group__2__Impl rule__Fonction__Group__3 ;
    public final void rule__Fonction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: ( rule__Fonction__Group__2__Impl rule__Fonction__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:2: rule__Fonction__Group__2__Impl rule__Fonction__Group__3
            {
            pushFollow(FOLLOW_rule__Fonction__Group__2__Impl_in_rule__Fonction__Group__22546);
            rule__Fonction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__3_in_rule__Fonction__Group__22549);
            rule__Fonction__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__2"


    // $ANTLR start "rule__Fonction__Group__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: rule__Fonction__Group__2__Impl : ( ( rule__Fonction__SymboleAssignment_2 ) ) ;
    public final void rule__Fonction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1208:1: ( ( ( rule__Fonction__SymboleAssignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( ( rule__Fonction__SymboleAssignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( ( rule__Fonction__SymboleAssignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ( rule__Fonction__SymboleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getSymboleAssignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: ( rule__Fonction__SymboleAssignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:2: rule__Fonction__SymboleAssignment_2
            {
            pushFollow(FOLLOW_rule__Fonction__SymboleAssignment_2_in_rule__Fonction__Group__2__Impl2576);
            rule__Fonction__SymboleAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getSymboleAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__2__Impl"


    // $ANTLR start "rule__Fonction__Group__3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1221:1: rule__Fonction__Group__3 : rule__Fonction__Group__3__Impl rule__Fonction__Group__4 ;
    public final void rule__Fonction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:1: ( rule__Fonction__Group__3__Impl rule__Fonction__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1226:2: rule__Fonction__Group__3__Impl rule__Fonction__Group__4
            {
            pushFollow(FOLLOW_rule__Fonction__Group__3__Impl_in_rule__Fonction__Group__32606);
            rule__Fonction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__4_in_rule__Fonction__Group__32609);
            rule__Fonction__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__3"


    // $ANTLR start "rule__Fonction__Group__3__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: rule__Fonction__Group__3__Impl : ( ':' ) ;
    public final void rule__Fonction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: ( ( ':' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: ( ':' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: ( ':' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1239:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getColonKeyword_3()); 
            }
            match(input,21,FOLLOW_21_in_rule__Fonction__Group__3__Impl2637); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__3__Impl"


    // $ANTLR start "rule__Fonction__Group__4"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: rule__Fonction__Group__4 : rule__Fonction__Group__4__Impl rule__Fonction__Group__5 ;
    public final void rule__Fonction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1256:1: ( rule__Fonction__Group__4__Impl rule__Fonction__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:2: rule__Fonction__Group__4__Impl rule__Fonction__Group__5
            {
            pushFollow(FOLLOW_rule__Fonction__Group__4__Impl_in_rule__Fonction__Group__42668);
            rule__Fonction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__5_in_rule__Fonction__Group__42671);
            rule__Fonction__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__4"


    // $ANTLR start "rule__Fonction__Group__4__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:1: rule__Fonction__Group__4__Impl : ( ruleLC ) ;
    public final void rule__Fonction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getLCParserRuleCall_4()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Fonction__Group__4__Impl2698);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getLCParserRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__4__Impl"


    // $ANTLR start "rule__Fonction__Group__5"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1281:1: rule__Fonction__Group__5 : rule__Fonction__Group__5__Impl rule__Fonction__Group__6 ;
    public final void rule__Fonction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: ( rule__Fonction__Group__5__Impl rule__Fonction__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:2: rule__Fonction__Group__5__Impl rule__Fonction__Group__6
            {
            pushFollow(FOLLOW_rule__Fonction__Group__5__Impl_in_rule__Fonction__Group__52727);
            rule__Fonction__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__6_in_rule__Fonction__Group__52730);
            rule__Fonction__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__5"


    // $ANTLR start "rule__Fonction__Group__5__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: rule__Fonction__Group__5__Impl : ( 'read' ) ;
    public final void rule__Fonction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: ( ( 'read' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ( 'read' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ( 'read' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getReadKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__Fonction__Group__5__Impl2758); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getReadKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__5__Impl"


    // $ANTLR start "rule__Fonction__Group__6"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1312:1: rule__Fonction__Group__6 : rule__Fonction__Group__6__Impl rule__Fonction__Group__7 ;
    public final void rule__Fonction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1316:1: ( rule__Fonction__Group__6__Impl rule__Fonction__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:2: rule__Fonction__Group__6__Impl rule__Fonction__Group__7
            {
            pushFollow(FOLLOW_rule__Fonction__Group__6__Impl_in_rule__Fonction__Group__62789);
            rule__Fonction__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__7_in_rule__Fonction__Group__62792);
            rule__Fonction__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__6"


    // $ANTLR start "rule__Fonction__Group__6__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1324:1: rule__Fonction__Group__6__Impl : ( ruleLC ) ;
    public final void rule__Fonction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getLCParserRuleCall_6()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Fonction__Group__6__Impl2819);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getLCParserRuleCall_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__6__Impl"


    // $ANTLR start "rule__Fonction__Group__7"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: rule__Fonction__Group__7 : rule__Fonction__Group__7__Impl rule__Fonction__Group__8 ;
    public final void rule__Fonction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1345:1: ( rule__Fonction__Group__7__Impl rule__Fonction__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:2: rule__Fonction__Group__7__Impl rule__Fonction__Group__8
            {
            pushFollow(FOLLOW_rule__Fonction__Group__7__Impl_in_rule__Fonction__Group__72848);
            rule__Fonction__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__8_in_rule__Fonction__Group__72851);
            rule__Fonction__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__7"


    // $ANTLR start "rule__Fonction__Group__7__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1353:1: rule__Fonction__Group__7__Impl : ( ( rule__Fonction__InAssignment_7 ) ) ;
    public final void rule__Fonction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1357:1: ( ( ( rule__Fonction__InAssignment_7 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: ( ( rule__Fonction__InAssignment_7 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: ( ( rule__Fonction__InAssignment_7 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: ( rule__Fonction__InAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getInAssignment_7()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: ( rule__Fonction__InAssignment_7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:2: rule__Fonction__InAssignment_7
            {
            pushFollow(FOLLOW_rule__Fonction__InAssignment_7_in_rule__Fonction__Group__7__Impl2878);
            rule__Fonction__InAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getInAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__7__Impl"


    // $ANTLR start "rule__Fonction__Group__8"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:1: rule__Fonction__Group__8 : rule__Fonction__Group__8__Impl rule__Fonction__Group__9 ;
    public final void rule__Fonction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:1: ( rule__Fonction__Group__8__Impl rule__Fonction__Group__9 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:2: rule__Fonction__Group__8__Impl rule__Fonction__Group__9
            {
            pushFollow(FOLLOW_rule__Fonction__Group__8__Impl_in_rule__Fonction__Group__82908);
            rule__Fonction__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__9_in_rule__Fonction__Group__82911);
            rule__Fonction__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__8"


    // $ANTLR start "rule__Fonction__Group__8__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: rule__Fonction__Group__8__Impl : ( '%' ) ;
    public final void rule__Fonction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:1: ( ( '%' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: ( '%' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: ( '%' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getPercentSignKeyword_8()); 
            }
            match(input,23,FOLLOW_23_in_rule__Fonction__Group__8__Impl2939); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getPercentSignKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__8__Impl"


    // $ANTLR start "rule__Fonction__Group__9"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:1: rule__Fonction__Group__9 : rule__Fonction__Group__9__Impl rule__Fonction__Group__10 ;
    public final void rule__Fonction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1405:1: ( rule__Fonction__Group__9__Impl rule__Fonction__Group__10 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:2: rule__Fonction__Group__9__Impl rule__Fonction__Group__10
            {
            pushFollow(FOLLOW_rule__Fonction__Group__9__Impl_in_rule__Fonction__Group__92970);
            rule__Fonction__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__10_in_rule__Fonction__Group__92973);
            rule__Fonction__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__9"


    // $ANTLR start "rule__Fonction__Group__9__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1413:1: rule__Fonction__Group__9__Impl : ( ( rule__Fonction__ComAssignment_9 ) ) ;
    public final void rule__Fonction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:1: ( ( ( rule__Fonction__ComAssignment_9 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:1: ( ( rule__Fonction__ComAssignment_9 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:1: ( ( rule__Fonction__ComAssignment_9 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:1: ( rule__Fonction__ComAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getComAssignment_9()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1420:1: ( rule__Fonction__ComAssignment_9 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1420:2: rule__Fonction__ComAssignment_9
            {
            pushFollow(FOLLOW_rule__Fonction__ComAssignment_9_in_rule__Fonction__Group__9__Impl3000);
            rule__Fonction__ComAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getComAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__9__Impl"


    // $ANTLR start "rule__Fonction__Group__10"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:1: rule__Fonction__Group__10 : rule__Fonction__Group__10__Impl rule__Fonction__Group__11 ;
    public final void rule__Fonction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1434:1: ( rule__Fonction__Group__10__Impl rule__Fonction__Group__11 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:2: rule__Fonction__Group__10__Impl rule__Fonction__Group__11
            {
            pushFollow(FOLLOW_rule__Fonction__Group__10__Impl_in_rule__Fonction__Group__103030);
            rule__Fonction__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__11_in_rule__Fonction__Group__103033);
            rule__Fonction__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__10"


    // $ANTLR start "rule__Fonction__Group__10__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: rule__Fonction__Group__10__Impl : ( '%' ) ;
    public final void rule__Fonction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1446:1: ( ( '%' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1447:1: ( '%' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1447:1: ( '%' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getPercentSignKeyword_10()); 
            }
            match(input,23,FOLLOW_23_in_rule__Fonction__Group__10__Impl3061); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getPercentSignKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__10__Impl"


    // $ANTLR start "rule__Fonction__Group__11"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1461:1: rule__Fonction__Group__11 : rule__Fonction__Group__11__Impl rule__Fonction__Group__12 ;
    public final void rule__Fonction__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:1: ( rule__Fonction__Group__11__Impl rule__Fonction__Group__12 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1466:2: rule__Fonction__Group__11__Impl rule__Fonction__Group__12
            {
            pushFollow(FOLLOW_rule__Fonction__Group__11__Impl_in_rule__Fonction__Group__113092);
            rule__Fonction__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__12_in_rule__Fonction__Group__113095);
            rule__Fonction__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__11"


    // $ANTLR start "rule__Fonction__Group__11__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: rule__Fonction__Group__11__Impl : ( 'write' ) ;
    public final void rule__Fonction__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:1: ( ( 'write' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: ( 'write' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: ( 'write' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1479:1: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getWriteKeyword_11()); 
            }
            match(input,24,FOLLOW_24_in_rule__Fonction__Group__11__Impl3123); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getWriteKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__11__Impl"


    // $ANTLR start "rule__Fonction__Group__12"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:1: rule__Fonction__Group__12 : rule__Fonction__Group__12__Impl rule__Fonction__Group__13 ;
    public final void rule__Fonction__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: ( rule__Fonction__Group__12__Impl rule__Fonction__Group__13 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1497:2: rule__Fonction__Group__12__Impl rule__Fonction__Group__13
            {
            pushFollow(FOLLOW_rule__Fonction__Group__12__Impl_in_rule__Fonction__Group__123154);
            rule__Fonction__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__13_in_rule__Fonction__Group__123157);
            rule__Fonction__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__12"


    // $ANTLR start "rule__Fonction__Group__12__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: rule__Fonction__Group__12__Impl : ( ruleLC ) ;
    public final void rule__Fonction__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1508:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1509:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1509:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1510:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getLCParserRuleCall_12()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Fonction__Group__12__Impl3184);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getLCParserRuleCall_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__12__Impl"


    // $ANTLR start "rule__Fonction__Group__13"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1521:1: rule__Fonction__Group__13 : rule__Fonction__Group__13__Impl ;
    public final void rule__Fonction__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1525:1: ( rule__Fonction__Group__13__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1526:2: rule__Fonction__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__Fonction__Group__13__Impl_in_rule__Fonction__Group__133213);
            rule__Fonction__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__13"


    // $ANTLR start "rule__Fonction__Group__13__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:1: rule__Fonction__Group__13__Impl : ( ( rule__Fonction__OutAssignment_13 ) ) ;
    public final void rule__Fonction__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:1: ( ( ( rule__Fonction__OutAssignment_13 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:1: ( ( rule__Fonction__OutAssignment_13 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:1: ( ( rule__Fonction__OutAssignment_13 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:1: ( rule__Fonction__OutAssignment_13 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getOutAssignment_13()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:1: ( rule__Fonction__OutAssignment_13 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:2: rule__Fonction__OutAssignment_13
            {
            pushFollow(FOLLOW_rule__Fonction__OutAssignment_13_in_rule__Fonction__Group__13__Impl3240);
            rule__Fonction__OutAssignment_13();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getOutAssignment_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__Group__13__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1582:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__03298);
            rule__Input__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__03301);
            rule__Input__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1589:1: rule__Input__Group__0__Impl : ( ( rule__Input__Var1Assignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:1: ( ( ( rule__Input__Var1Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: ( ( rule__Input__Var1Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: ( ( rule__Input__Var1Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1595:1: ( rule__Input__Var1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVar1Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: ( rule__Input__Var1Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:2: rule__Input__Var1Assignment_0
            {
            pushFollow(FOLLOW_rule__Input__Var1Assignment_0_in_rule__Input__Group__0__Impl3328);
            rule__Input__Var1Assignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVar1Assignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1610:1: ( rule__Input__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1611:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__13358);
            rule__Input__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:1: rule__Input__Group__1__Impl : ( ( rule__Input__Group_1__0 )* ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:1: ( ( ( rule__Input__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: ( ( rule__Input__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: ( ( rule__Input__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: ( rule__Input__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1624:1: ( rule__Input__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1624:2: rule__Input__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3385);
            	    rule__Input__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group_1__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:1: rule__Input__Group_1__0 : rule__Input__Group_1__0__Impl rule__Input__Group_1__1 ;
    public final void rule__Input__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: ( rule__Input__Group_1__0__Impl rule__Input__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:2: rule__Input__Group_1__0__Impl rule__Input__Group_1__1
            {
            pushFollow(FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03420);
            rule__Input__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03423);
            rule__Input__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__0"


    // $ANTLR start "rule__Input__Group_1__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: rule__Input__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Input__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1654:1: ( ( ',' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1655:1: ( ',' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1655:1: ( ',' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Input__Group_1__0__Impl3451); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__0__Impl"


    // $ANTLR start "rule__Input__Group_1__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:1: rule__Input__Group_1__1 : rule__Input__Group_1__1__Impl ;
    public final void rule__Input__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: ( rule__Input__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:2: rule__Input__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13482);
            rule__Input__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__1"


    // $ANTLR start "rule__Input__Group_1__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: rule__Input__Group_1__1__Impl : ( ( rule__Input__Var2Assignment_1_1 ) ) ;
    public final void rule__Input__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: ( ( ( rule__Input__Var2Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:1: ( ( rule__Input__Var2Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:1: ( ( rule__Input__Var2Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:1: ( rule__Input__Var2Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVar2Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1687:1: ( rule__Input__Var2Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1687:2: rule__Input__Var2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Input__Var2Assignment_1_1_in_rule__Input__Group_1__1__Impl3509);
            rule__Input__Var2Assignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVar2Assignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__1__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03543);
            rule__Output__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03546);
            rule__Output__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: rule__Output__Group__0__Impl : ( ( rule__Output__Var1Assignment_0 ) ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1717:1: ( ( ( rule__Output__Var1Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1718:1: ( ( rule__Output__Var1Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1718:1: ( ( rule__Output__Var1Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1719:1: ( rule__Output__Var1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVar1Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: ( rule__Output__Var1Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:2: rule__Output__Var1Assignment_0
            {
            pushFollow(FOLLOW_rule__Output__Var1Assignment_0_in_rule__Output__Group__0__Impl3573);
            rule__Output__Var1Assignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVar1Assignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1730:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1734:1: ( rule__Output__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1735:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13603);
            rule__Output__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: rule__Output__Group__1__Impl : ( ( rule__Output__Group_1__0 )* ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ( ( ( rule__Output__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:1: ( ( rule__Output__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:1: ( ( rule__Output__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1747:1: ( rule__Output__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1748:1: ( rule__Output__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1748:2: rule__Output__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3630);
            	    rule__Output__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group_1__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:1: rule__Output__Group_1__0 : rule__Output__Group_1__0__Impl rule__Output__Group_1__1 ;
    public final void rule__Output__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1766:1: ( rule__Output__Group_1__0__Impl rule__Output__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:2: rule__Output__Group_1__0__Impl rule__Output__Group_1__1
            {
            pushFollow(FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03665);
            rule__Output__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03668);
            rule__Output__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__0"


    // $ANTLR start "rule__Output__Group_1__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: rule__Output__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1778:1: ( ( ',' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: ( ',' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: ( ',' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Output__Group_1__0__Impl3696); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__0__Impl"


    // $ANTLR start "rule__Output__Group_1__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: rule__Output__Group_1__1 : rule__Output__Group_1__1__Impl ;
    public final void rule__Output__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1797:1: ( rule__Output__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:2: rule__Output__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__13727);
            rule__Output__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__1"


    // $ANTLR start "rule__Output__Group_1__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: rule__Output__Group_1__1__Impl : ( ( rule__Output__Var2Assignment_1_1 ) ) ;
    public final void rule__Output__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: ( ( ( rule__Output__Var2Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:1: ( ( rule__Output__Var2Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:1: ( ( rule__Output__Var2Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1810:1: ( rule__Output__Var2Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVar2Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1811:1: ( rule__Output__Var2Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1811:2: rule__Output__Var2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Output__Var2Assignment_1_1_in_rule__Output__Group_1__1__Impl3754);
            rule__Output__Var2Assignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVar2Assignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__1__Impl"


    // $ANTLR start "rule__Commandes__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1825:1: rule__Commandes__Group__0 : rule__Commandes__Group__0__Impl rule__Commandes__Group__1 ;
    public final void rule__Commandes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ( rule__Commandes__Group__0__Impl rule__Commandes__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:2: rule__Commandes__Group__0__Impl rule__Commandes__Group__1
            {
            pushFollow(FOLLOW_rule__Commandes__Group__0__Impl_in_rule__Commandes__Group__03788);
            rule__Commandes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commandes__Group__1_in_rule__Commandes__Group__03791);
            rule__Commandes__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commandes__Group__0"


    // $ANTLR start "rule__Commandes__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:1: rule__Commandes__Group__0__Impl : ( ( rule__Commandes__Com1Assignment_0 ) ) ;
    public final void rule__Commandes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: ( ( ( rule__Commandes__Com1Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:1: ( ( rule__Commandes__Com1Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:1: ( ( rule__Commandes__Com1Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:1: ( rule__Commandes__Com1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getCom1Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1844:1: ( rule__Commandes__Com1Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1844:2: rule__Commandes__Com1Assignment_0
            {
            pushFollow(FOLLOW_rule__Commandes__Com1Assignment_0_in_rule__Commandes__Group__0__Impl3818);
            rule__Commandes__Com1Assignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandesAccess().getCom1Assignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commandes__Group__0__Impl"


    // $ANTLR start "rule__Commandes__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: rule__Commandes__Group__1 : rule__Commandes__Group__1__Impl ;
    public final void rule__Commandes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( rule__Commandes__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:2: rule__Commandes__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Commandes__Group__1__Impl_in_rule__Commandes__Group__13848);
            rule__Commandes__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commandes__Group__1"


    // $ANTLR start "rule__Commandes__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:1: rule__Commandes__Group__1__Impl : ( ( rule__Commandes__Group_1__0 )* ) ;
    public final void rule__Commandes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1869:1: ( ( ( rule__Commandes__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1870:1: ( ( rule__Commandes__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1870:1: ( ( rule__Commandes__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1871:1: ( rule__Commandes__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: ( rule__Commandes__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:2: rule__Commandes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Commandes__Group_1__0_in_rule__Commandes__Group__1__Impl3875);
            	    rule__Commandes__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandesAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commandes__Group__1__Impl"


    // $ANTLR start "rule__Commandes__Group_1__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: rule__Commandes__Group_1__0 : rule__Commandes__Group_1__0__Impl rule__Commandes__Group_1__1 ;
    public final void rule__Commandes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: ( rule__Commandes__Group_1__0__Impl rule__Commandes__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:2: rule__Commandes__Group_1__0__Impl rule__Commandes__Group_1__1
            {
            pushFollow(FOLLOW_rule__Commandes__Group_1__0__Impl_in_rule__Commandes__Group_1__03910);
            rule__Commandes__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commandes__Group_1__1_in_rule__Commandes__Group_1__03913);
            rule__Commandes__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commandes__Group_1__0"


    // $ANTLR start "rule__Commandes__Group_1__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1898:1: rule__Commandes__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Commandes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:1: ( ( ';' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1903:1: ( ';' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1903:1: ( ';' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1904:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Commandes__Group_1__0__Impl3941); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandesAccess().getSemicolonKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commandes__Group_1__0__Impl"


    // $ANTLR start "rule__Commandes__Group_1__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: rule__Commandes__Group_1__1 : rule__Commandes__Group_1__1__Impl ;
    public final void rule__Commandes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: ( rule__Commandes__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:2: rule__Commandes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Commandes__Group_1__1__Impl_in_rule__Commandes__Group_1__13972);
            rule__Commandes__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commandes__Group_1__1"


    // $ANTLR start "rule__Commandes__Group_1__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1928:1: rule__Commandes__Group_1__1__Impl : ( ( rule__Commandes__Com2Assignment_1_1 ) ) ;
    public final void rule__Commandes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: ( ( ( rule__Commandes__Com2Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: ( ( rule__Commandes__Com2Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: ( ( rule__Commandes__Com2Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1934:1: ( rule__Commandes__Com2Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getCom2Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: ( rule__Commandes__Com2Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:2: rule__Commandes__Com2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Commandes__Com2Assignment_1_1_in_rule__Commandes__Group_1__1__Impl3999);
            rule__Commandes__Com2Assignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandesAccess().getCom2Assignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commandes__Group_1__1__Impl"


    // $ANTLR start "rule__Commande__Group_0__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: rule__Commande__Group_0__0 : rule__Commande__Group_0__0__Impl rule__Commande__Group_0__1 ;
    public final void rule__Commande__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( rule__Commande__Group_0__0__Impl rule__Commande__Group_0__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:2: rule__Commande__Group_0__0__Impl rule__Commande__Group_0__1
            {
            pushFollow(FOLLOW_rule__Commande__Group_0__0__Impl_in_rule__Commande__Group_0__04033);
            rule__Commande__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commande__Group_0__1_in_rule__Commande__Group_0__04036);
            rule__Commande__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commande__Group_0__0"


    // $ANTLR start "rule__Commande__Group_0__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: rule__Commande__Group_0__0__Impl : ( () ) ;
    public final void rule__Commande__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( ( () ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: ( () )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: ( () )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getCommandeAction_0_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: ()
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1970:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandeAccess().getCommandeAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commande__Group_0__0__Impl"


    // $ANTLR start "rule__Commande__Group_0__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:1: rule__Commande__Group_0__1 : rule__Commande__Group_0__1__Impl ;
    public final void rule__Commande__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( rule__Commande__Group_0__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:2: rule__Commande__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Commande__Group_0__1__Impl_in_rule__Commande__Group_0__14094);
            rule__Commande__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commande__Group_0__1"


    // $ANTLR start "rule__Commande__Group_0__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:1: rule__Commande__Group_0__1__Impl : ( ( rule__Commande__NopAssignment_0_1 ) ) ;
    public final void rule__Commande__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1995:1: ( ( ( rule__Commande__NopAssignment_0_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: ( ( rule__Commande__NopAssignment_0_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: ( ( rule__Commande__NopAssignment_0_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:1: ( rule__Commande__NopAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getNopAssignment_0_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1998:1: ( rule__Commande__NopAssignment_0_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1998:2: rule__Commande__NopAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Commande__NopAssignment_0_1_in_rule__Commande__Group_0__1__Impl4121);
            rule__Commande__NopAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandeAccess().getNopAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commande__Group_0__1__Impl"


    // $ANTLR start "rule__AffectVar__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: rule__AffectVar__Group__0 : rule__AffectVar__Group__0__Impl rule__AffectVar__Group__1 ;
    public final void rule__AffectVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2016:1: ( rule__AffectVar__Group__0__Impl rule__AffectVar__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2017:2: rule__AffectVar__Group__0__Impl rule__AffectVar__Group__1
            {
            pushFollow(FOLLOW_rule__AffectVar__Group__0__Impl_in_rule__AffectVar__Group__04155);
            rule__AffectVar__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AffectVar__Group__1_in_rule__AffectVar__Group__04158);
            rule__AffectVar__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectVar__Group__0"


    // $ANTLR start "rule__AffectVar__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2024:1: rule__AffectVar__Group__0__Impl : ( ( rule__AffectVar__Var1Assignment_0 ) ) ;
    public final void rule__AffectVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:1: ( ( ( rule__AffectVar__Var1Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:1: ( ( rule__AffectVar__Var1Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:1: ( ( rule__AffectVar__Var1Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:1: ( rule__AffectVar__Var1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getVar1Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:1: ( rule__AffectVar__Var1Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:2: rule__AffectVar__Var1Assignment_0
            {
            pushFollow(FOLLOW_rule__AffectVar__Var1Assignment_0_in_rule__AffectVar__Group__0__Impl4185);
            rule__AffectVar__Var1Assignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectVarAccess().getVar1Assignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectVar__Group__0__Impl"


    // $ANTLR start "rule__AffectVar__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: rule__AffectVar__Group__1 : rule__AffectVar__Group__1__Impl rule__AffectVar__Group__2 ;
    public final void rule__AffectVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2045:1: ( rule__AffectVar__Group__1__Impl rule__AffectVar__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:2: rule__AffectVar__Group__1__Impl rule__AffectVar__Group__2
            {
            pushFollow(FOLLOW_rule__AffectVar__Group__1__Impl_in_rule__AffectVar__Group__14215);
            rule__AffectVar__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AffectVar__Group__2_in_rule__AffectVar__Group__14218);
            rule__AffectVar__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectVar__Group__1"


    // $ANTLR start "rule__AffectVar__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2053:1: rule__AffectVar__Group__1__Impl : ( ':=' ) ;
    public final void rule__AffectVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: ( ( ':=' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:1: ( ':=' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:1: ( ':=' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__AffectVar__Group__1__Impl4246); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectVarAccess().getColonEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectVar__Group__1__Impl"


    // $ANTLR start "rule__AffectVar__Group__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2072:1: rule__AffectVar__Group__2 : rule__AffectVar__Group__2__Impl ;
    public final void rule__AffectVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:1: ( rule__AffectVar__Group__2__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:2: rule__AffectVar__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AffectVar__Group__2__Impl_in_rule__AffectVar__Group__24277);
            rule__AffectVar__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectVar__Group__2"


    // $ANTLR start "rule__AffectVar__Group__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2083:1: rule__AffectVar__Group__2__Impl : ( ( rule__AffectVar__ExpAssignment_2 ) ) ;
    public final void rule__AffectVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: ( ( ( rule__AffectVar__ExpAssignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2088:1: ( ( rule__AffectVar__ExpAssignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2088:1: ( ( rule__AffectVar__ExpAssignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2089:1: ( rule__AffectVar__ExpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getExpAssignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:1: ( rule__AffectVar__ExpAssignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:2: rule__AffectVar__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__AffectVar__ExpAssignment_2_in_rule__AffectVar__Group__2__Impl4304);
            rule__AffectVar__ExpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectVarAccess().getExpAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectVar__Group__2__Impl"


    // $ANTLR start "rule__While__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04340);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__04343);
            rule__While__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: ( ( 'while' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: ( 'while' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: ( 'while' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2124:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__While__Group__0__Impl4371); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2141:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14402);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__14405);
            rule__While__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: rule__While__Group__1__Impl : ( ruleLC ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2153:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2155:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__1__Impl4432);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLCParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2170:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24461);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__24464);
            rule__While__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2178:1: rule__While__Group__2__Impl : ( ( rule__While__Exp2Assignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2182:1: ( ( ( rule__While__Exp2Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2183:1: ( ( rule__While__Exp2Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2183:1: ( ( rule__While__Exp2Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2184:1: ( rule__While__Exp2Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExp2Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: ( rule__While__Exp2Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:2: rule__While__Exp2Assignment_2
            {
            pushFollow(FOLLOW_rule__While__Exp2Assignment_2_in_rule__While__Group__2__Impl4491);
            rule__While__Exp2Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getExp2Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__While__Group__3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2199:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2200:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34521);
            rule__While__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__34524);
            rule__While__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3"


    // $ANTLR start "rule__While__Group__3__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:1: rule__While__Group__3__Impl : ( ruleLC ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2211:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2212:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2212:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2213:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__3__Impl4551);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLCParserRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3__Impl"


    // $ANTLR start "rule__While__Group__4"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2228:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2229:2: rule__While__Group__4__Impl rule__While__Group__5
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44580);
            rule__While__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__5_in_rule__While__Group__44583);
            rule__While__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__4"


    // $ANTLR start "rule__While__Group__4__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: rule__While__Group__4__Impl : ( 'do' ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2240:1: ( ( 'do' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: ( 'do' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: ( 'do' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2242:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getDoKeyword_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__While__Group__4__Impl4611); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getDoKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__4__Impl"


    // $ANTLR start "rule__While__Group__5"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:1: rule__While__Group__5 : rule__While__Group__5__Impl rule__While__Group__6 ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2259:1: ( rule__While__Group__5__Impl rule__While__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:2: rule__While__Group__5__Impl rule__While__Group__6
            {
            pushFollow(FOLLOW_rule__While__Group__5__Impl_in_rule__While__Group__54642);
            rule__While__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__6_in_rule__While__Group__54645);
            rule__While__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__5"


    // $ANTLR start "rule__While__Group__5__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: rule__While__Group__5__Impl : ( ruleLC ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2273:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__5__Impl4672);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLCParserRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__5__Impl"


    // $ANTLR start "rule__While__Group__6"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:1: rule__While__Group__6 : rule__While__Group__6__Impl rule__While__Group__7 ;
    public final void rule__While__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2288:1: ( rule__While__Group__6__Impl rule__While__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2289:2: rule__While__Group__6__Impl rule__While__Group__7
            {
            pushFollow(FOLLOW_rule__While__Group__6__Impl_in_rule__While__Group__64701);
            rule__While__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__7_in_rule__While__Group__64704);
            rule__While__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__6"


    // $ANTLR start "rule__While__Group__6__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: rule__While__Group__6__Impl : ( ( rule__While__Com3Assignment_6 ) ) ;
    public final void rule__While__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2300:1: ( ( ( rule__While__Com3Assignment_6 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2301:1: ( ( rule__While__Com3Assignment_6 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2301:1: ( ( rule__While__Com3Assignment_6 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: ( rule__While__Com3Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getCom3Assignment_6()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ( rule__While__Com3Assignment_6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:2: rule__While__Com3Assignment_6
            {
            pushFollow(FOLLOW_rule__While__Com3Assignment_6_in_rule__While__Group__6__Impl4731);
            rule__While__Com3Assignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getCom3Assignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__6__Impl"


    // $ANTLR start "rule__While__Group__7"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:1: rule__While__Group__7 : rule__While__Group__7__Impl rule__While__Group__8 ;
    public final void rule__While__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2317:1: ( rule__While__Group__7__Impl rule__While__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2318:2: rule__While__Group__7__Impl rule__While__Group__8
            {
            pushFollow(FOLLOW_rule__While__Group__7__Impl_in_rule__While__Group__74761);
            rule__While__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__8_in_rule__While__Group__74764);
            rule__While__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__7"


    // $ANTLR start "rule__While__Group__7__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: rule__While__Group__7__Impl : ( ruleLC ) ;
    public final void rule__While__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2330:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2330:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__7__Impl4791);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLCParserRuleCall_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__7__Impl"


    // $ANTLR start "rule__While__Group__8"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: rule__While__Group__8 : rule__While__Group__8__Impl ;
    public final void rule__While__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: ( rule__While__Group__8__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2347:2: rule__While__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__8__Impl_in_rule__While__Group__84820);
            rule__While__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__8"


    // $ANTLR start "rule__While__Group__8__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:1: rule__While__Group__8__Impl : ( 'od' ) ;
    public final void rule__While__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2357:1: ( ( 'od' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: ( 'od' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: ( 'od' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2359:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getOdKeyword_8()); 
            }
            match(input,30,FOLLOW_30_in_rule__While__Group__8__Impl4848); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getOdKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__8__Impl"


    // $ANTLR start "rule__For__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2390:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2395:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__04897);
            rule__For__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__1_in_rule__For__Group__04900);
            rule__For__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__0"


    // $ANTLR start "rule__For__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: rule__For__Group__0__Impl : ( 'for' ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: ( ( 'for' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2407:1: ( 'for' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2407:1: ( 'for' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2408:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getForKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__For__Group__0__Impl4928); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getForKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__0__Impl"


    // $ANTLR start "rule__For__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2425:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2426:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__14959);
            rule__For__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__2_in_rule__For__Group__14962);
            rule__For__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__1"


    // $ANTLR start "rule__For__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: rule__For__Group__1__Impl : ( ruleLC ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2439:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__1__Impl4989);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getLCParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__1__Impl"


    // $ANTLR start "rule__For__Group__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2455:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__25018);
            rule__For__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__3_in_rule__For__Group__25021);
            rule__For__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__2"


    // $ANTLR start "rule__For__Group__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2462:1: rule__For__Group__2__Impl : ( ( rule__For__Exp3Assignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: ( ( ( rule__For__Exp3Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2467:1: ( ( rule__For__Exp3Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2467:1: ( ( rule__For__Exp3Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:1: ( rule__For__Exp3Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getExp3Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2469:1: ( rule__For__Exp3Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2469:2: rule__For__Exp3Assignment_2
            {
            pushFollow(FOLLOW_rule__For__Exp3Assignment_2_in_rule__For__Group__2__Impl5048);
            rule__For__Exp3Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getExp3Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__2__Impl"


    // $ANTLR start "rule__For__Group__3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2479:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2484:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__35078);
            rule__For__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__4_in_rule__For__Group__35081);
            rule__For__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__3"


    // $ANTLR start "rule__For__Group__3__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:1: rule__For__Group__3__Impl : ( ruleLC ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__3__Impl5108);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getLCParserRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__3__Impl"


    // $ANTLR start "rule__For__Group__4"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2508:1: rule__For__Group__4 : rule__For__Group__4__Impl rule__For__Group__5 ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:1: ( rule__For__Group__4__Impl rule__For__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2513:2: rule__For__Group__4__Impl rule__For__Group__5
            {
            pushFollow(FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__45137);
            rule__For__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__5_in_rule__For__Group__45140);
            rule__For__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__4"


    // $ANTLR start "rule__For__Group__4__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2520:1: rule__For__Group__4__Impl : ( 'do' ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: ( ( 'do' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:1: ( 'do' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:1: ( 'do' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getDoKeyword_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__For__Group__4__Impl5168); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getDoKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__4__Impl"


    // $ANTLR start "rule__For__Group__5"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:1: rule__For__Group__5 : rule__For__Group__5__Impl rule__For__Group__6 ;
    public final void rule__For__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:1: ( rule__For__Group__5__Impl rule__For__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2544:2: rule__For__Group__5__Impl rule__For__Group__6
            {
            pushFollow(FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__55199);
            rule__For__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__6_in_rule__For__Group__55202);
            rule__For__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__5"


    // $ANTLR start "rule__For__Group__5__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: rule__For__Group__5__Impl : ( ruleLC ) ;
    public final void rule__For__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2557:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__5__Impl5229);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getLCParserRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__5__Impl"


    // $ANTLR start "rule__For__Group__6"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2568:1: rule__For__Group__6 : rule__For__Group__6__Impl rule__For__Group__7 ;
    public final void rule__For__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2572:1: ( rule__For__Group__6__Impl rule__For__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2573:2: rule__For__Group__6__Impl rule__For__Group__7
            {
            pushFollow(FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__65258);
            rule__For__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__7_in_rule__For__Group__65261);
            rule__For__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__6"


    // $ANTLR start "rule__For__Group__6__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2580:1: rule__For__Group__6__Impl : ( ( rule__For__Com4Assignment_6 ) ) ;
    public final void rule__For__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: ( ( ( rule__For__Com4Assignment_6 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:1: ( ( rule__For__Com4Assignment_6 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:1: ( ( rule__For__Com4Assignment_6 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: ( rule__For__Com4Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCom4Assignment_6()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2587:1: ( rule__For__Com4Assignment_6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2587:2: rule__For__Com4Assignment_6
            {
            pushFollow(FOLLOW_rule__For__Com4Assignment_6_in_rule__For__Group__6__Impl5288);
            rule__For__Com4Assignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getCom4Assignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__6__Impl"


    // $ANTLR start "rule__For__Group__7"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2597:1: rule__For__Group__7 : rule__For__Group__7__Impl rule__For__Group__8 ;
    public final void rule__For__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:1: ( rule__For__Group__7__Impl rule__For__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2602:2: rule__For__Group__7__Impl rule__For__Group__8
            {
            pushFollow(FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__75318);
            rule__For__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__8_in_rule__For__Group__75321);
            rule__For__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__7"


    // $ANTLR start "rule__For__Group__7__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:1: rule__For__Group__7__Impl : ( ruleLC ) ;
    public final void rule__For__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2614:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2614:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2615:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__7__Impl5348);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getLCParserRuleCall_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__7__Impl"


    // $ANTLR start "rule__For__Group__8"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2626:1: rule__For__Group__8 : rule__For__Group__8__Impl ;
    public final void rule__For__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:1: ( rule__For__Group__8__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2631:2: rule__For__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__85377);
            rule__For__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__8"


    // $ANTLR start "rule__For__Group__8__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:1: rule__For__Group__8__Impl : ( 'od' ) ;
    public final void rule__For__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:1: ( ( 'od' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: ( 'od' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: ( 'od' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getOdKeyword_8()); 
            }
            match(input,30,FOLLOW_30_in_rule__For__Group__8__Impl5405); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getOdKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__8__Impl"


    // $ANTLR start "rule__If__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2674:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2678:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2679:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__05454);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__05457);
            rule__If__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2686:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2690:1: ( ( 'if' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2691:1: ( 'if' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2691:1: ( 'if' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2692:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__If__Group__0__Impl5485); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2709:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2710:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__15516);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__15519);
            rule__If__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2717:1: rule__If__Group__1__Impl : ( ruleLC ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2721:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2722:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2722:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__1__Impl5546);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLCParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2734:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2738:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2739:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__25575);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__25578);
            rule__If__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2746:1: rule__If__Group__2__Impl : ( ( rule__If__Exp4Assignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2750:1: ( ( ( rule__If__Exp4Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2751:1: ( ( rule__If__Exp4Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2751:1: ( ( rule__If__Exp4Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2752:1: ( rule__If__Exp4Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExp4Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2753:1: ( rule__If__Exp4Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2753:2: rule__If__Exp4Assignment_2
            {
            pushFollow(FOLLOW_rule__If__Exp4Assignment_2_in_rule__If__Group__2__Impl5605);
            rule__If__Exp4Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getExp4Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2763:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2767:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2768:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__35635);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__35638);
            rule__If__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: rule__If__Group__3__Impl : ( ruleLC ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2779:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2780:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2780:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2781:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__3__Impl5665);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLCParserRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2796:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2797:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__45694);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__5_in_rule__If__Group__45697);
            rule__If__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: rule__If__Group__4__Impl : ( 'then' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2808:1: ( ( 'then' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:1: ( 'then' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:1: ( 'then' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2810:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenKeyword_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__If__Group__4__Impl5725); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getThenKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group__5"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2823:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2827:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2828:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__55756);
            rule__If__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__6_in_rule__If__Group__55759);
            rule__If__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5"


    // $ANTLR start "rule__If__Group__5__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:1: rule__If__Group__5__Impl : ( ruleLC ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2839:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2840:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2840:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2841:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__5__Impl5786);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLCParserRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5__Impl"


    // $ANTLR start "rule__If__Group__6"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2852:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2856:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2857:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__65815);
            rule__If__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__7_in_rule__If__Group__65818);
            rule__If__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6"


    // $ANTLR start "rule__If__Group__6__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: rule__If__Group__6__Impl : ( ( rule__If__Com5Assignment_6 ) ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2868:1: ( ( ( rule__If__Com5Assignment_6 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2869:1: ( ( rule__If__Com5Assignment_6 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2869:1: ( ( rule__If__Com5Assignment_6 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2870:1: ( rule__If__Com5Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCom5Assignment_6()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2871:1: ( rule__If__Com5Assignment_6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2871:2: rule__If__Com5Assignment_6
            {
            pushFollow(FOLLOW_rule__If__Com5Assignment_6_in_rule__If__Group__6__Impl5845);
            rule__If__Com5Assignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getCom5Assignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6__Impl"


    // $ANTLR start "rule__If__Group__7"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2885:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2886:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__75875);
            rule__If__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__8_in_rule__If__Group__75878);
            rule__If__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7"


    // $ANTLR start "rule__If__Group__7__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2893:1: rule__If__Group__7__Impl : ( ruleLC ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2898:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2898:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2899:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__7__Impl5905);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLCParserRuleCall_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7__Impl"


    // $ANTLR start "rule__If__Group__8"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: rule__If__Group__8 : rule__If__Group__8__Impl rule__If__Group__9 ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: ( rule__If__Group__8__Impl rule__If__Group__9 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2915:2: rule__If__Group__8__Impl rule__If__Group__9
            {
            pushFollow(FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__85934);
            rule__If__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__9_in_rule__If__Group__85937);
            rule__If__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__8"


    // $ANTLR start "rule__If__Group__8__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ( ( ( rule__If__Group_8__0 )? ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( ( rule__If__Group_8__0 )? )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( ( rule__If__Group_8__0 )? )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:1: ( rule__If__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_8()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:1: ( rule__If__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:2: rule__If__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__If__Group_8__0_in_rule__If__Group__8__Impl5964);
                    rule__If__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__8__Impl"


    // $ANTLR start "rule__If__Group__9"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: rule__If__Group__9 : rule__If__Group__9__Impl ;
    public final void rule__If__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: ( rule__If__Group__9__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:2: rule__If__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__9__Impl_in_rule__If__Group__95995);
            rule__If__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__9"


    // $ANTLR start "rule__If__Group__9__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2950:1: rule__If__Group__9__Impl : ( 'fi' ) ;
    public final void rule__If__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: ( ( 'fi' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: ( 'fi' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: ( 'fi' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2956:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getFiKeyword_9()); 
            }
            match(input,34,FOLLOW_34_in_rule__If__Group__9__Impl6023); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getFiKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__9__Impl"


    // $ANTLR start "rule__If__Group_8__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2993:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2994:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
            {
            pushFollow(FOLLOW_rule__If__Group_8__0__Impl_in_rule__If__Group_8__06074);
            rule__If__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__1_in_rule__If__Group_8__06077);
            rule__If__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__0"


    // $ANTLR start "rule__If__Group_8__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3001:1: rule__If__Group_8__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3005:1: ( ( 'else' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3006:1: ( 'else' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3006:1: ( 'else' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3007:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__If__Group_8__0__Impl6105); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__0__Impl"


    // $ANTLR start "rule__If__Group_8__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3020:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl rule__If__Group_8__2 ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3024:1: ( rule__If__Group_8__1__Impl rule__If__Group_8__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3025:2: rule__If__Group_8__1__Impl rule__If__Group_8__2
            {
            pushFollow(FOLLOW_rule__If__Group_8__1__Impl_in_rule__If__Group_8__16136);
            rule__If__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__2_in_rule__If__Group_8__16139);
            rule__If__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__1"


    // $ANTLR start "rule__If__Group_8__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3032:1: rule__If__Group_8__1__Impl : ( ruleLC ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3036:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3037:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3037:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_8_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group_8__1__Impl6166);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLCParserRuleCall_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__1__Impl"


    // $ANTLR start "rule__If__Group_8__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3049:1: rule__If__Group_8__2 : rule__If__Group_8__2__Impl rule__If__Group_8__3 ;
    public final void rule__If__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3053:1: ( rule__If__Group_8__2__Impl rule__If__Group_8__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3054:2: rule__If__Group_8__2__Impl rule__If__Group_8__3
            {
            pushFollow(FOLLOW_rule__If__Group_8__2__Impl_in_rule__If__Group_8__26195);
            rule__If__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__3_in_rule__If__Group_8__26198);
            rule__If__Group_8__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__2"


    // $ANTLR start "rule__If__Group_8__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3061:1: rule__If__Group_8__2__Impl : ( ( rule__If__Com6Assignment_8_2 ) ) ;
    public final void rule__If__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3065:1: ( ( ( rule__If__Com6Assignment_8_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3066:1: ( ( rule__If__Com6Assignment_8_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3066:1: ( ( rule__If__Com6Assignment_8_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: ( rule__If__Com6Assignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCom6Assignment_8_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( rule__If__Com6Assignment_8_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:2: rule__If__Com6Assignment_8_2
            {
            pushFollow(FOLLOW_rule__If__Com6Assignment_8_2_in_rule__If__Group_8__2__Impl6225);
            rule__If__Com6Assignment_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getCom6Assignment_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__2__Impl"


    // $ANTLR start "rule__If__Group_8__3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3078:1: rule__If__Group_8__3 : rule__If__Group_8__3__Impl ;
    public final void rule__If__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: ( rule__If__Group_8__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3083:2: rule__If__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__If__Group_8__3__Impl_in_rule__If__Group_8__36255);
            rule__If__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__3"


    // $ANTLR start "rule__If__Group_8__3__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3089:1: rule__If__Group_8__3__Impl : ( ruleLC ) ;
    public final void rule__If__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3093:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3094:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3094:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3095:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_8_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group_8__3__Impl6282);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLCParserRuleCall_8_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__3__Impl"


    // $ANTLR start "rule__Foreach__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3114:1: rule__Foreach__Group__0 : rule__Foreach__Group__0__Impl rule__Foreach__Group__1 ;
    public final void rule__Foreach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3118:1: ( rule__Foreach__Group__0__Impl rule__Foreach__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3119:2: rule__Foreach__Group__0__Impl rule__Foreach__Group__1
            {
            pushFollow(FOLLOW_rule__Foreach__Group__0__Impl_in_rule__Foreach__Group__06319);
            rule__Foreach__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__1_in_rule__Foreach__Group__06322);
            rule__Foreach__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__0"


    // $ANTLR start "rule__Foreach__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3126:1: rule__Foreach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__Foreach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3130:1: ( ( 'foreach' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3131:1: ( 'foreach' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3131:1: ( 'foreach' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3132:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getForeachKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Foreach__Group__0__Impl6350); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getForeachKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__0__Impl"


    // $ANTLR start "rule__Foreach__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:1: rule__Foreach__Group__1 : rule__Foreach__Group__1__Impl rule__Foreach__Group__2 ;
    public final void rule__Foreach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3149:1: ( rule__Foreach__Group__1__Impl rule__Foreach__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:2: rule__Foreach__Group__1__Impl rule__Foreach__Group__2
            {
            pushFollow(FOLLOW_rule__Foreach__Group__1__Impl_in_rule__Foreach__Group__16381);
            rule__Foreach__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__2_in_rule__Foreach__Group__16384);
            rule__Foreach__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__1"


    // $ANTLR start "rule__Foreach__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3157:1: rule__Foreach__Group__1__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3161:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3162:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3162:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__1__Impl6411);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLCParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__1__Impl"


    // $ANTLR start "rule__Foreach__Group__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3174:1: rule__Foreach__Group__2 : rule__Foreach__Group__2__Impl rule__Foreach__Group__3 ;
    public final void rule__Foreach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:1: ( rule__Foreach__Group__2__Impl rule__Foreach__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:2: rule__Foreach__Group__2__Impl rule__Foreach__Group__3
            {
            pushFollow(FOLLOW_rule__Foreach__Group__2__Impl_in_rule__Foreach__Group__26440);
            rule__Foreach__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__3_in_rule__Foreach__Group__26443);
            rule__Foreach__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__2"


    // $ANTLR start "rule__Foreach__Group__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3186:1: rule__Foreach__Group__2__Impl : ( ( rule__Foreach__Exp5Assignment_2 ) ) ;
    public final void rule__Foreach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: ( ( ( rule__Foreach__Exp5Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: ( ( rule__Foreach__Exp5Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: ( ( rule__Foreach__Exp5Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: ( rule__Foreach__Exp5Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getExp5Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3193:1: ( rule__Foreach__Exp5Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3193:2: rule__Foreach__Exp5Assignment_2
            {
            pushFollow(FOLLOW_rule__Foreach__Exp5Assignment_2_in_rule__Foreach__Group__2__Impl6470);
            rule__Foreach__Exp5Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getExp5Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__2__Impl"


    // $ANTLR start "rule__Foreach__Group__3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3203:1: rule__Foreach__Group__3 : rule__Foreach__Group__3__Impl rule__Foreach__Group__4 ;
    public final void rule__Foreach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3207:1: ( rule__Foreach__Group__3__Impl rule__Foreach__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:2: rule__Foreach__Group__3__Impl rule__Foreach__Group__4
            {
            pushFollow(FOLLOW_rule__Foreach__Group__3__Impl_in_rule__Foreach__Group__36500);
            rule__Foreach__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__4_in_rule__Foreach__Group__36503);
            rule__Foreach__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__3"


    // $ANTLR start "rule__Foreach__Group__3__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3215:1: rule__Foreach__Group__3__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3219:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__3__Impl6530);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLCParserRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__3__Impl"


    // $ANTLR start "rule__Foreach__Group__4"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3232:1: rule__Foreach__Group__4 : rule__Foreach__Group__4__Impl rule__Foreach__Group__5 ;
    public final void rule__Foreach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3236:1: ( rule__Foreach__Group__4__Impl rule__Foreach__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:2: rule__Foreach__Group__4__Impl rule__Foreach__Group__5
            {
            pushFollow(FOLLOW_rule__Foreach__Group__4__Impl_in_rule__Foreach__Group__46559);
            rule__Foreach__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__5_in_rule__Foreach__Group__46562);
            rule__Foreach__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__4"


    // $ANTLR start "rule__Foreach__Group__4__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3244:1: rule__Foreach__Group__4__Impl : ( 'in' ) ;
    public final void rule__Foreach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3248:1: ( ( 'in' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3249:1: ( 'in' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3249:1: ( 'in' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getInKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__Foreach__Group__4__Impl6590); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getInKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__4__Impl"


    // $ANTLR start "rule__Foreach__Group__5"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3263:1: rule__Foreach__Group__5 : rule__Foreach__Group__5__Impl rule__Foreach__Group__6 ;
    public final void rule__Foreach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3267:1: ( rule__Foreach__Group__5__Impl rule__Foreach__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3268:2: rule__Foreach__Group__5__Impl rule__Foreach__Group__6
            {
            pushFollow(FOLLOW_rule__Foreach__Group__5__Impl_in_rule__Foreach__Group__56621);
            rule__Foreach__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__6_in_rule__Foreach__Group__56624);
            rule__Foreach__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__5"


    // $ANTLR start "rule__Foreach__Group__5__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3275:1: rule__Foreach__Group__5__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3279:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__5__Impl6651);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLCParserRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__5__Impl"


    // $ANTLR start "rule__Foreach__Group__6"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:1: rule__Foreach__Group__6 : rule__Foreach__Group__6__Impl rule__Foreach__Group__7 ;
    public final void rule__Foreach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3296:1: ( rule__Foreach__Group__6__Impl rule__Foreach__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:2: rule__Foreach__Group__6__Impl rule__Foreach__Group__7
            {
            pushFollow(FOLLOW_rule__Foreach__Group__6__Impl_in_rule__Foreach__Group__66680);
            rule__Foreach__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__7_in_rule__Foreach__Group__66683);
            rule__Foreach__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__6"


    // $ANTLR start "rule__Foreach__Group__6__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3304:1: rule__Foreach__Group__6__Impl : ( ( rule__Foreach__Exp6Assignment_6 ) ) ;
    public final void rule__Foreach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3308:1: ( ( ( rule__Foreach__Exp6Assignment_6 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3309:1: ( ( rule__Foreach__Exp6Assignment_6 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3309:1: ( ( rule__Foreach__Exp6Assignment_6 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3310:1: ( rule__Foreach__Exp6Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getExp6Assignment_6()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3311:1: ( rule__Foreach__Exp6Assignment_6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3311:2: rule__Foreach__Exp6Assignment_6
            {
            pushFollow(FOLLOW_rule__Foreach__Exp6Assignment_6_in_rule__Foreach__Group__6__Impl6710);
            rule__Foreach__Exp6Assignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getExp6Assignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__6__Impl"


    // $ANTLR start "rule__Foreach__Group__7"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:1: rule__Foreach__Group__7 : rule__Foreach__Group__7__Impl rule__Foreach__Group__8 ;
    public final void rule__Foreach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3325:1: ( rule__Foreach__Group__7__Impl rule__Foreach__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3326:2: rule__Foreach__Group__7__Impl rule__Foreach__Group__8
            {
            pushFollow(FOLLOW_rule__Foreach__Group__7__Impl_in_rule__Foreach__Group__76740);
            rule__Foreach__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__8_in_rule__Foreach__Group__76743);
            rule__Foreach__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__7"


    // $ANTLR start "rule__Foreach__Group__7__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3333:1: rule__Foreach__Group__7__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3337:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3338:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3338:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3339:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__7__Impl6770);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLCParserRuleCall_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__7__Impl"


    // $ANTLR start "rule__Foreach__Group__8"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3350:1: rule__Foreach__Group__8 : rule__Foreach__Group__8__Impl rule__Foreach__Group__9 ;
    public final void rule__Foreach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3354:1: ( rule__Foreach__Group__8__Impl rule__Foreach__Group__9 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:2: rule__Foreach__Group__8__Impl rule__Foreach__Group__9
            {
            pushFollow(FOLLOW_rule__Foreach__Group__8__Impl_in_rule__Foreach__Group__86799);
            rule__Foreach__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__9_in_rule__Foreach__Group__86802);
            rule__Foreach__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__8"


    // $ANTLR start "rule__Foreach__Group__8__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3362:1: rule__Foreach__Group__8__Impl : ( 'do' ) ;
    public final void rule__Foreach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3366:1: ( ( 'do' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: ( 'do' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: ( 'do' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3368:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getDoKeyword_8()); 
            }
            match(input,29,FOLLOW_29_in_rule__Foreach__Group__8__Impl6830); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getDoKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__8__Impl"


    // $ANTLR start "rule__Foreach__Group__9"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3381:1: rule__Foreach__Group__9 : rule__Foreach__Group__9__Impl rule__Foreach__Group__10 ;
    public final void rule__Foreach__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3385:1: ( rule__Foreach__Group__9__Impl rule__Foreach__Group__10 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:2: rule__Foreach__Group__9__Impl rule__Foreach__Group__10
            {
            pushFollow(FOLLOW_rule__Foreach__Group__9__Impl_in_rule__Foreach__Group__96861);
            rule__Foreach__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__10_in_rule__Foreach__Group__96864);
            rule__Foreach__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__9"


    // $ANTLR start "rule__Foreach__Group__9__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3393:1: rule__Foreach__Group__9__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3397:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3398:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3398:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3399:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_9()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__9__Impl6891);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLCParserRuleCall_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__9__Impl"


    // $ANTLR start "rule__Foreach__Group__10"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3410:1: rule__Foreach__Group__10 : rule__Foreach__Group__10__Impl rule__Foreach__Group__11 ;
    public final void rule__Foreach__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3414:1: ( rule__Foreach__Group__10__Impl rule__Foreach__Group__11 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3415:2: rule__Foreach__Group__10__Impl rule__Foreach__Group__11
            {
            pushFollow(FOLLOW_rule__Foreach__Group__10__Impl_in_rule__Foreach__Group__106920);
            rule__Foreach__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__11_in_rule__Foreach__Group__106923);
            rule__Foreach__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__10"


    // $ANTLR start "rule__Foreach__Group__10__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:1: rule__Foreach__Group__10__Impl : ( ( rule__Foreach__Com7Assignment_10 ) ) ;
    public final void rule__Foreach__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3426:1: ( ( ( rule__Foreach__Com7Assignment_10 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3427:1: ( ( rule__Foreach__Com7Assignment_10 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3427:1: ( ( rule__Foreach__Com7Assignment_10 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3428:1: ( rule__Foreach__Com7Assignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getCom7Assignment_10()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:1: ( rule__Foreach__Com7Assignment_10 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:2: rule__Foreach__Com7Assignment_10
            {
            pushFollow(FOLLOW_rule__Foreach__Com7Assignment_10_in_rule__Foreach__Group__10__Impl6950);
            rule__Foreach__Com7Assignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getCom7Assignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__10__Impl"


    // $ANTLR start "rule__Foreach__Group__11"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:1: rule__Foreach__Group__11 : rule__Foreach__Group__11__Impl rule__Foreach__Group__12 ;
    public final void rule__Foreach__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3443:1: ( rule__Foreach__Group__11__Impl rule__Foreach__Group__12 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3444:2: rule__Foreach__Group__11__Impl rule__Foreach__Group__12
            {
            pushFollow(FOLLOW_rule__Foreach__Group__11__Impl_in_rule__Foreach__Group__116980);
            rule__Foreach__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__12_in_rule__Foreach__Group__116983);
            rule__Foreach__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__11"


    // $ANTLR start "rule__Foreach__Group__11__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: rule__Foreach__Group__11__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3456:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3456:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3457:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_11()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__11__Impl7010);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getLCParserRuleCall_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__11__Impl"


    // $ANTLR start "rule__Foreach__Group__12"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3468:1: rule__Foreach__Group__12 : rule__Foreach__Group__12__Impl ;
    public final void rule__Foreach__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:1: ( rule__Foreach__Group__12__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3473:2: rule__Foreach__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Foreach__Group__12__Impl_in_rule__Foreach__Group__127039);
            rule__Foreach__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__12"


    // $ANTLR start "rule__Foreach__Group__12__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3479:1: rule__Foreach__Group__12__Impl : ( 'od' ) ;
    public final void rule__Foreach__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3483:1: ( ( 'od' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3484:1: ( 'od' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3484:1: ( 'od' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3485:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getOdKeyword_12()); 
            }
            match(input,30,FOLLOW_30_in_rule__Foreach__Group__12__Impl7067); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getOdKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Group__12__Impl"


    // $ANTLR start "rule__Vars__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3524:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3528:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3529:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__07124);
            rule__Vars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__07127);
            rule__Vars__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__0"


    // $ANTLR start "rule__Vars__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3536:1: rule__Vars__Group__0__Impl : ( ( rule__Vars__Var2Assignment_0 ) ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3540:1: ( ( ( rule__Vars__Var2Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:1: ( ( rule__Vars__Var2Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:1: ( ( rule__Vars__Var2Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: ( rule__Vars__Var2Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVar2Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:1: ( rule__Vars__Var2Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:2: rule__Vars__Var2Assignment_0
            {
            pushFollow(FOLLOW_rule__Vars__Var2Assignment_0_in_rule__Vars__Group__0__Impl7154);
            rule__Vars__Var2Assignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVar2Assignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__0__Impl"


    // $ANTLR start "rule__Vars__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3553:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3557:1: ( rule__Vars__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3558:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__17184);
            rule__Vars__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__1"


    // $ANTLR start "rule__Vars__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3564:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__Group_1__0 )* ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:1: ( ( ( rule__Vars__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: ( ( rule__Vars__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: ( ( rule__Vars__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3570:1: ( rule__Vars__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: ( rule__Vars__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:2: rule__Vars__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl7211);
            	    rule__Vars__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__1__Impl"


    // $ANTLR start "rule__Vars__Group_1__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3585:1: rule__Vars__Group_1__0 : rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 ;
    public final void rule__Vars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3589:1: ( rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3590:2: rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__07246);
            rule__Vars__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__07249);
            rule__Vars__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__0"


    // $ANTLR start "rule__Vars__Group_1__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: rule__Vars__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Vars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: ( ( ',' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: ( ',' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: ( ',' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3603:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Vars__Group_1__0__Impl7277); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__0__Impl"


    // $ANTLR start "rule__Vars__Group_1__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:1: rule__Vars__Group_1__1 : rule__Vars__Group_1__1__Impl ;
    public final void rule__Vars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3620:1: ( rule__Vars__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3621:2: rule__Vars__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__17308);
            rule__Vars__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__1"


    // $ANTLR start "rule__Vars__Group_1__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3627:1: rule__Vars__Group_1__1__Impl : ( ( rule__Vars__Var3Assignment_1_1 ) ) ;
    public final void rule__Vars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: ( ( ( rule__Vars__Var3Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3632:1: ( ( rule__Vars__Var3Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3632:1: ( ( rule__Vars__Var3Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: ( rule__Vars__Var3Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVar3Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3634:1: ( rule__Vars__Var3Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3634:2: rule__Vars__Var3Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Vars__Var3Assignment_1_1_in_rule__Vars__Group_1__1__Impl7335);
            rule__Vars__Var3Assignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVar3Assignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__1__Impl"


    // $ANTLR start "rule__Exprs__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3652:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3653:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__07369);
            rule__Exprs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__07372);
            rule__Exprs__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__0"


    // $ANTLR start "rule__Exprs__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3660:1: rule__Exprs__Group__0__Impl : ( ( rule__Exprs__ExprSAssignment_0 ) ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3664:1: ( ( ( rule__Exprs__ExprSAssignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3665:1: ( ( rule__Exprs__ExprSAssignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3665:1: ( ( rule__Exprs__ExprSAssignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3666:1: ( rule__Exprs__ExprSAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprSAssignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3667:1: ( rule__Exprs__ExprSAssignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3667:2: rule__Exprs__ExprSAssignment_0
            {
            pushFollow(FOLLOW_rule__Exprs__ExprSAssignment_0_in_rule__Exprs__Group__0__Impl7399);
            rule__Exprs__ExprSAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExprSAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__0__Impl"


    // $ANTLR start "rule__Exprs__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3681:1: ( rule__Exprs__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3682:2: rule__Exprs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__17429);
            rule__Exprs__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__1"


    // $ANTLR start "rule__Exprs__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3688:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__Group_1__0 )* ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3692:1: ( ( ( rule__Exprs__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( ( rule__Exprs__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( ( rule__Exprs__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:1: ( rule__Exprs__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:1: ( rule__Exprs__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:2: rule__Exprs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl7456);
            	    rule__Exprs__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__1__Impl"


    // $ANTLR start "rule__Exprs__Group_1__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:1: rule__Exprs__Group_1__0 : rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 ;
    public final void rule__Exprs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3713:1: ( rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3714:2: rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__07491);
            rule__Exprs__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__07494);
            rule__Exprs__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_1__0"


    // $ANTLR start "rule__Exprs__Group_1__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3721:1: rule__Exprs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:1: ( ( ',' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3726:1: ( ',' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3726:1: ( ',' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3727:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Exprs__Group_1__0__Impl7522); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_1__0__Impl"


    // $ANTLR start "rule__Exprs__Group_1__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: rule__Exprs__Group_1__1 : rule__Exprs__Group_1__1__Impl ;
    public final void rule__Exprs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3744:1: ( rule__Exprs__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3745:2: rule__Exprs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__17553);
            rule__Exprs__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_1__1"


    // $ANTLR start "rule__Exprs__Group_1__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3751:1: rule__Exprs__Group_1__1__Impl : ( ( rule__Exprs__ExprS2Assignment_1_1 ) ) ;
    public final void rule__Exprs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:1: ( ( ( rule__Exprs__ExprS2Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: ( ( rule__Exprs__ExprS2Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: ( ( rule__Exprs__ExprS2Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3757:1: ( rule__Exprs__ExprS2Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprS2Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3758:1: ( rule__Exprs__ExprS2Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3758:2: rule__Exprs__ExprS2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Exprs__ExprS2Assignment_1_1_in_rule__Exprs__Group_1__1__Impl7580);
            rule__Exprs__ExprS2Assignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExprS2Assignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_1__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_0__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3772:1: rule__ExprSimple__Group_0__0 : rule__ExprSimple__Group_0__0__Impl rule__ExprSimple__Group_0__1 ;
    public final void rule__ExprSimple__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3776:1: ( rule__ExprSimple__Group_0__0__Impl rule__ExprSimple__Group_0__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3777:2: rule__ExprSimple__Group_0__0__Impl rule__ExprSimple__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_0__0__Impl_in_rule__ExprSimple__Group_0__07614);
            rule__ExprSimple__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_0__1_in_rule__ExprSimple__Group_0__07617);
            rule__ExprSimple__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_0__0"


    // $ANTLR start "rule__ExprSimple__Group_0__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3784:1: rule__ExprSimple__Group_0__0__Impl : ( () ) ;
    public final void rule__ExprSimple__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3788:1: ( ( () ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3789:1: ( () )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3789:1: ( () )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprSimpleAction_0_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3791:1: ()
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3793:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprSimpleAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_0__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_0__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:1: rule__ExprSimple__Group_0__1 : rule__ExprSimple__Group_0__1__Impl ;
    public final void rule__ExprSimple__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3807:1: ( rule__ExprSimple__Group_0__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3808:2: rule__ExprSimple__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_0__1__Impl_in_rule__ExprSimple__Group_0__17675);
            rule__ExprSimple__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_0__1"


    // $ANTLR start "rule__ExprSimple__Group_0__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3814:1: rule__ExprSimple__Group_0__1__Impl : ( ( rule__ExprSimple__VideAssignment_0_1 ) ) ;
    public final void rule__ExprSimple__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3818:1: ( ( ( rule__ExprSimple__VideAssignment_0_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3819:1: ( ( rule__ExprSimple__VideAssignment_0_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3819:1: ( ( rule__ExprSimple__VideAssignment_0_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3820:1: ( rule__ExprSimple__VideAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVideAssignment_0_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3821:1: ( rule__ExprSimple__VideAssignment_0_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3821:2: rule__ExprSimple__VideAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__VideAssignment_0_1_in_rule__ExprSimple__Group_0__1__Impl7702);
            rule__ExprSimple__VideAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getVideAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_0__1__Impl"


    // $ANTLR start "rule__Cons__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3835:1: rule__Cons__Group__0 : rule__Cons__Group__0__Impl rule__Cons__Group__1 ;
    public final void rule__Cons__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3839:1: ( rule__Cons__Group__0__Impl rule__Cons__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3840:2: rule__Cons__Group__0__Impl rule__Cons__Group__1
            {
            pushFollow(FOLLOW_rule__Cons__Group__0__Impl_in_rule__Cons__Group__07736);
            rule__Cons__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Cons__Group__1_in_rule__Cons__Group__07739);
            rule__Cons__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cons__Group__0"


    // $ANTLR start "rule__Cons__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3847:1: rule__Cons__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__Cons__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3852:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3852:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3853:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__Cons__Group__0__Impl7766); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getPARAGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cons__Group__0__Impl"


    // $ANTLR start "rule__Cons__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: rule__Cons__Group__1 : rule__Cons__Group__1__Impl rule__Cons__Group__2 ;
    public final void rule__Cons__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3868:1: ( rule__Cons__Group__1__Impl rule__Cons__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3869:2: rule__Cons__Group__1__Impl rule__Cons__Group__2
            {
            pushFollow(FOLLOW_rule__Cons__Group__1__Impl_in_rule__Cons__Group__17795);
            rule__Cons__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Cons__Group__2_in_rule__Cons__Group__17798);
            rule__Cons__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cons__Group__1"


    // $ANTLR start "rule__Cons__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3876:1: rule__Cons__Group__1__Impl : ( 'cons' ) ;
    public final void rule__Cons__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3880:1: ( ( 'cons' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3881:1: ( 'cons' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3881:1: ( 'cons' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:1: 'cons'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getConsKeyword_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__Cons__Group__1__Impl7826); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getConsKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cons__Group__1__Impl"


    // $ANTLR start "rule__Cons__Group__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3895:1: rule__Cons__Group__2 : rule__Cons__Group__2__Impl rule__Cons__Group__3 ;
    public final void rule__Cons__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3899:1: ( rule__Cons__Group__2__Impl rule__Cons__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3900:2: rule__Cons__Group__2__Impl rule__Cons__Group__3
            {
            pushFollow(FOLLOW_rule__Cons__Group__2__Impl_in_rule__Cons__Group__27857);
            rule__Cons__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Cons__Group__3_in_rule__Cons__Group__27860);
            rule__Cons__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cons__Group__2"


    // $ANTLR start "rule__Cons__Group__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3907:1: rule__Cons__Group__2__Impl : ( ( rule__Cons__Le1Assignment_2 ) ) ;
    public final void rule__Cons__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:1: ( ( ( rule__Cons__Le1Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3912:1: ( ( rule__Cons__Le1Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3912:1: ( ( rule__Cons__Le1Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3913:1: ( rule__Cons__Le1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getLe1Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3914:1: ( rule__Cons__Le1Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3914:2: rule__Cons__Le1Assignment_2
            {
            pushFollow(FOLLOW_rule__Cons__Le1Assignment_2_in_rule__Cons__Group__2__Impl7887);
            rule__Cons__Le1Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getLe1Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cons__Group__2__Impl"


    // $ANTLR start "rule__Cons__Group__3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3924:1: rule__Cons__Group__3 : rule__Cons__Group__3__Impl ;
    public final void rule__Cons__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3928:1: ( rule__Cons__Group__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3929:2: rule__Cons__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Cons__Group__3__Impl_in_rule__Cons__Group__37917);
            rule__Cons__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cons__Group__3"


    // $ANTLR start "rule__Cons__Group__3__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3935:1: rule__Cons__Group__3__Impl : ( RULE_PARAD ) ;
    public final void rule__Cons__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3939:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3940:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3940:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3941:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getPARADTerminalRuleCall_3()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__Cons__Group__3__Impl7944); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getPARADTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cons__Group__3__Impl"


    // $ANTLR start "rule__Liste__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3960:1: rule__Liste__Group__0 : rule__Liste__Group__0__Impl rule__Liste__Group__1 ;
    public final void rule__Liste__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3964:1: ( rule__Liste__Group__0__Impl rule__Liste__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3965:2: rule__Liste__Group__0__Impl rule__Liste__Group__1
            {
            pushFollow(FOLLOW_rule__Liste__Group__0__Impl_in_rule__Liste__Group__07981);
            rule__Liste__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Liste__Group__1_in_rule__Liste__Group__07984);
            rule__Liste__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liste__Group__0"


    // $ANTLR start "rule__Liste__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3972:1: rule__Liste__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__Liste__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3976:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3978:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__Liste__Group__0__Impl8011); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListeAccess().getPARAGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liste__Group__0__Impl"


    // $ANTLR start "rule__Liste__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: rule__Liste__Group__1 : rule__Liste__Group__1__Impl rule__Liste__Group__2 ;
    public final void rule__Liste__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3993:1: ( rule__Liste__Group__1__Impl rule__Liste__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:2: rule__Liste__Group__1__Impl rule__Liste__Group__2
            {
            pushFollow(FOLLOW_rule__Liste__Group__1__Impl_in_rule__Liste__Group__18040);
            rule__Liste__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Liste__Group__2_in_rule__Liste__Group__18043);
            rule__Liste__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liste__Group__1"


    // $ANTLR start "rule__Liste__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4001:1: rule__Liste__Group__1__Impl : ( 'list' ) ;
    public final void rule__Liste__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4005:1: ( ( 'list' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: ( 'list' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: ( 'list' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4007:1: 'list'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getListKeyword_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__Liste__Group__1__Impl8071); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListeAccess().getListKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liste__Group__1__Impl"


    // $ANTLR start "rule__Liste__Group__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: rule__Liste__Group__2 : rule__Liste__Group__2__Impl rule__Liste__Group__3 ;
    public final void rule__Liste__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:1: ( rule__Liste__Group__2__Impl rule__Liste__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4025:2: rule__Liste__Group__2__Impl rule__Liste__Group__3
            {
            pushFollow(FOLLOW_rule__Liste__Group__2__Impl_in_rule__Liste__Group__28102);
            rule__Liste__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Liste__Group__3_in_rule__Liste__Group__28105);
            rule__Liste__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liste__Group__2"


    // $ANTLR start "rule__Liste__Group__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4032:1: rule__Liste__Group__2__Impl : ( ( rule__Liste__Le2Assignment_2 ) ) ;
    public final void rule__Liste__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4036:1: ( ( ( rule__Liste__Le2Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:1: ( ( rule__Liste__Le2Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:1: ( ( rule__Liste__Le2Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4038:1: ( rule__Liste__Le2Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getLe2Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4039:1: ( rule__Liste__Le2Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4039:2: rule__Liste__Le2Assignment_2
            {
            pushFollow(FOLLOW_rule__Liste__Le2Assignment_2_in_rule__Liste__Group__2__Impl8132);
            rule__Liste__Le2Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListeAccess().getLe2Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liste__Group__2__Impl"


    // $ANTLR start "rule__Liste__Group__3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4049:1: rule__Liste__Group__3 : rule__Liste__Group__3__Impl ;
    public final void rule__Liste__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4053:1: ( rule__Liste__Group__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4054:2: rule__Liste__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Liste__Group__3__Impl_in_rule__Liste__Group__38162);
            rule__Liste__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liste__Group__3"


    // $ANTLR start "rule__Liste__Group__3__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4060:1: rule__Liste__Group__3__Impl : ( RULE_PARAD ) ;
    public final void rule__Liste__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4064:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4065:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4065:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4066:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getPARADTerminalRuleCall_3()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__Liste__Group__3__Impl8189); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListeAccess().getPARADTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liste__Group__3__Impl"


    // $ANTLR start "rule__Hd__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: rule__Hd__Group__0 : rule__Hd__Group__0__Impl rule__Hd__Group__1 ;
    public final void rule__Hd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4089:1: ( rule__Hd__Group__0__Impl rule__Hd__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:2: rule__Hd__Group__0__Impl rule__Hd__Group__1
            {
            pushFollow(FOLLOW_rule__Hd__Group__0__Impl_in_rule__Hd__Group__08226);
            rule__Hd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Hd__Group__1_in_rule__Hd__Group__08229);
            rule__Hd__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hd__Group__0"


    // $ANTLR start "rule__Hd__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4097:1: rule__Hd__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__Hd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4101:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4102:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4102:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4103:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__Hd__Group__0__Impl8256); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHdAccess().getPARAGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hd__Group__0__Impl"


    // $ANTLR start "rule__Hd__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4114:1: rule__Hd__Group__1 : rule__Hd__Group__1__Impl rule__Hd__Group__2 ;
    public final void rule__Hd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4118:1: ( rule__Hd__Group__1__Impl rule__Hd__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4119:2: rule__Hd__Group__1__Impl rule__Hd__Group__2
            {
            pushFollow(FOLLOW_rule__Hd__Group__1__Impl_in_rule__Hd__Group__18285);
            rule__Hd__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Hd__Group__2_in_rule__Hd__Group__18288);
            rule__Hd__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hd__Group__1"


    // $ANTLR start "rule__Hd__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4126:1: rule__Hd__Group__1__Impl : ( 'hd' ) ;
    public final void rule__Hd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4130:1: ( ( 'hd' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4131:1: ( 'hd' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4131:1: ( 'hd' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4132:1: 'hd'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getHdKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__Hd__Group__1__Impl8316); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHdAccess().getHdKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hd__Group__1__Impl"


    // $ANTLR start "rule__Hd__Group__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:1: rule__Hd__Group__2 : rule__Hd__Group__2__Impl rule__Hd__Group__3 ;
    public final void rule__Hd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4149:1: ( rule__Hd__Group__2__Impl rule__Hd__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4150:2: rule__Hd__Group__2__Impl rule__Hd__Group__3
            {
            pushFollow(FOLLOW_rule__Hd__Group__2__Impl_in_rule__Hd__Group__28347);
            rule__Hd__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Hd__Group__3_in_rule__Hd__Group__28350);
            rule__Hd__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hd__Group__2"


    // $ANTLR start "rule__Hd__Group__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4157:1: rule__Hd__Group__2__Impl : ( ruleLC ) ;
    public final void rule__Hd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4161:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4162:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4162:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4163:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getLCParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Hd__Group__2__Impl8377);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHdAccess().getLCParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hd__Group__2__Impl"


    // $ANTLR start "rule__Hd__Group__3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4174:1: rule__Hd__Group__3 : rule__Hd__Group__3__Impl rule__Hd__Group__4 ;
    public final void rule__Hd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4178:1: ( rule__Hd__Group__3__Impl rule__Hd__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4179:2: rule__Hd__Group__3__Impl rule__Hd__Group__4
            {
            pushFollow(FOLLOW_rule__Hd__Group__3__Impl_in_rule__Hd__Group__38406);
            rule__Hd__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Hd__Group__4_in_rule__Hd__Group__38409);
            rule__Hd__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hd__Group__3"


    // $ANTLR start "rule__Hd__Group__3__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4186:1: rule__Hd__Group__3__Impl : ( ( rule__Hd__Le3Assignment_3 ) ) ;
    public final void rule__Hd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4190:1: ( ( ( rule__Hd__Le3Assignment_3 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4191:1: ( ( rule__Hd__Le3Assignment_3 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4191:1: ( ( rule__Hd__Le3Assignment_3 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4192:1: ( rule__Hd__Le3Assignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getLe3Assignment_3()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4193:1: ( rule__Hd__Le3Assignment_3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4193:2: rule__Hd__Le3Assignment_3
            {
            pushFollow(FOLLOW_rule__Hd__Le3Assignment_3_in_rule__Hd__Group__3__Impl8436);
            rule__Hd__Le3Assignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHdAccess().getLe3Assignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hd__Group__3__Impl"


    // $ANTLR start "rule__Hd__Group__4"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4203:1: rule__Hd__Group__4 : rule__Hd__Group__4__Impl ;
    public final void rule__Hd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4207:1: ( rule__Hd__Group__4__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4208:2: rule__Hd__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Hd__Group__4__Impl_in_rule__Hd__Group__48466);
            rule__Hd__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hd__Group__4"


    // $ANTLR start "rule__Hd__Group__4__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:1: rule__Hd__Group__4__Impl : ( RULE_PARAD ) ;
    public final void rule__Hd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4218:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4219:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4219:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4220:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getPARADTerminalRuleCall_4()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__Hd__Group__4__Impl8493); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHdAccess().getPARADTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hd__Group__4__Impl"


    // $ANTLR start "rule__Tl__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4241:1: rule__Tl__Group__0 : rule__Tl__Group__0__Impl rule__Tl__Group__1 ;
    public final void rule__Tl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:1: ( rule__Tl__Group__0__Impl rule__Tl__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4246:2: rule__Tl__Group__0__Impl rule__Tl__Group__1
            {
            pushFollow(FOLLOW_rule__Tl__Group__0__Impl_in_rule__Tl__Group__08532);
            rule__Tl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tl__Group__1_in_rule__Tl__Group__08535);
            rule__Tl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tl__Group__0"


    // $ANTLR start "rule__Tl__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4253:1: rule__Tl__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__Tl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4257:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4258:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4258:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4259:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__Tl__Group__0__Impl8562); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTlAccess().getPARAGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tl__Group__0__Impl"


    // $ANTLR start "rule__Tl__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4270:1: rule__Tl__Group__1 : rule__Tl__Group__1__Impl rule__Tl__Group__2 ;
    public final void rule__Tl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4274:1: ( rule__Tl__Group__1__Impl rule__Tl__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:2: rule__Tl__Group__1__Impl rule__Tl__Group__2
            {
            pushFollow(FOLLOW_rule__Tl__Group__1__Impl_in_rule__Tl__Group__18591);
            rule__Tl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tl__Group__2_in_rule__Tl__Group__18594);
            rule__Tl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tl__Group__1"


    // $ANTLR start "rule__Tl__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4282:1: rule__Tl__Group__1__Impl : ( 'tl' ) ;
    public final void rule__Tl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4286:1: ( ( 'tl' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4287:1: ( 'tl' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4287:1: ( 'tl' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4288:1: 'tl'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getTlKeyword_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__Tl__Group__1__Impl8622); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTlAccess().getTlKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tl__Group__1__Impl"


    // $ANTLR start "rule__Tl__Group__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4301:1: rule__Tl__Group__2 : rule__Tl__Group__2__Impl rule__Tl__Group__3 ;
    public final void rule__Tl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4305:1: ( rule__Tl__Group__2__Impl rule__Tl__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4306:2: rule__Tl__Group__2__Impl rule__Tl__Group__3
            {
            pushFollow(FOLLOW_rule__Tl__Group__2__Impl_in_rule__Tl__Group__28653);
            rule__Tl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tl__Group__3_in_rule__Tl__Group__28656);
            rule__Tl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tl__Group__2"


    // $ANTLR start "rule__Tl__Group__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4313:1: rule__Tl__Group__2__Impl : ( ruleLC ) ;
    public final void rule__Tl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4317:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4318:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4318:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4319:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getLCParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Tl__Group__2__Impl8683);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTlAccess().getLCParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tl__Group__2__Impl"


    // $ANTLR start "rule__Tl__Group__3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4330:1: rule__Tl__Group__3 : rule__Tl__Group__3__Impl rule__Tl__Group__4 ;
    public final void rule__Tl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4334:1: ( rule__Tl__Group__3__Impl rule__Tl__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4335:2: rule__Tl__Group__3__Impl rule__Tl__Group__4
            {
            pushFollow(FOLLOW_rule__Tl__Group__3__Impl_in_rule__Tl__Group__38712);
            rule__Tl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tl__Group__4_in_rule__Tl__Group__38715);
            rule__Tl__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tl__Group__3"


    // $ANTLR start "rule__Tl__Group__3__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4342:1: rule__Tl__Group__3__Impl : ( ( rule__Tl__Le4Assignment_3 ) ) ;
    public final void rule__Tl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4346:1: ( ( ( rule__Tl__Le4Assignment_3 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4347:1: ( ( rule__Tl__Le4Assignment_3 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4347:1: ( ( rule__Tl__Le4Assignment_3 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4348:1: ( rule__Tl__Le4Assignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getLe4Assignment_3()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4349:1: ( rule__Tl__Le4Assignment_3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4349:2: rule__Tl__Le4Assignment_3
            {
            pushFollow(FOLLOW_rule__Tl__Le4Assignment_3_in_rule__Tl__Group__3__Impl8742);
            rule__Tl__Le4Assignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTlAccess().getLe4Assignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tl__Group__3__Impl"


    // $ANTLR start "rule__Tl__Group__4"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:1: rule__Tl__Group__4 : rule__Tl__Group__4__Impl ;
    public final void rule__Tl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4363:1: ( rule__Tl__Group__4__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4364:2: rule__Tl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Tl__Group__4__Impl_in_rule__Tl__Group__48772);
            rule__Tl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tl__Group__4"


    // $ANTLR start "rule__Tl__Group__4__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4370:1: rule__Tl__Group__4__Impl : ( RULE_PARAD ) ;
    public final void rule__Tl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4374:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4375:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4375:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4376:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getPARADTerminalRuleCall_4()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__Tl__Group__4__Impl8799); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTlAccess().getPARADTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tl__Group__4__Impl"


    // $ANTLR start "rule__SymboleEx__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4397:1: rule__SymboleEx__Group__0 : rule__SymboleEx__Group__0__Impl rule__SymboleEx__Group__1 ;
    public final void rule__SymboleEx__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4401:1: ( rule__SymboleEx__Group__0__Impl rule__SymboleEx__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4402:2: rule__SymboleEx__Group__0__Impl rule__SymboleEx__Group__1
            {
            pushFollow(FOLLOW_rule__SymboleEx__Group__0__Impl_in_rule__SymboleEx__Group__08838);
            rule__SymboleEx__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SymboleEx__Group__1_in_rule__SymboleEx__Group__08841);
            rule__SymboleEx__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymboleEx__Group__0"


    // $ANTLR start "rule__SymboleEx__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4409:1: rule__SymboleEx__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__SymboleEx__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4413:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4414:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4414:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4415:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__SymboleEx__Group__0__Impl8868); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymboleExAccess().getPARAGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymboleEx__Group__0__Impl"


    // $ANTLR start "rule__SymboleEx__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4426:1: rule__SymboleEx__Group__1 : rule__SymboleEx__Group__1__Impl rule__SymboleEx__Group__2 ;
    public final void rule__SymboleEx__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4430:1: ( rule__SymboleEx__Group__1__Impl rule__SymboleEx__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4431:2: rule__SymboleEx__Group__1__Impl rule__SymboleEx__Group__2
            {
            pushFollow(FOLLOW_rule__SymboleEx__Group__1__Impl_in_rule__SymboleEx__Group__18897);
            rule__SymboleEx__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SymboleEx__Group__2_in_rule__SymboleEx__Group__18900);
            rule__SymboleEx__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymboleEx__Group__1"


    // $ANTLR start "rule__SymboleEx__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4438:1: rule__SymboleEx__Group__1__Impl : ( ( rule__SymboleEx__PAssignment_1 ) ) ;
    public final void rule__SymboleEx__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4442:1: ( ( ( rule__SymboleEx__PAssignment_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4443:1: ( ( rule__SymboleEx__PAssignment_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4443:1: ( ( rule__SymboleEx__PAssignment_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4444:1: ( rule__SymboleEx__PAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getPAssignment_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4445:1: ( rule__SymboleEx__PAssignment_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4445:2: rule__SymboleEx__PAssignment_1
            {
            pushFollow(FOLLOW_rule__SymboleEx__PAssignment_1_in_rule__SymboleEx__Group__1__Impl8927);
            rule__SymboleEx__PAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymboleExAccess().getPAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymboleEx__Group__1__Impl"


    // $ANTLR start "rule__SymboleEx__Group__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4455:1: rule__SymboleEx__Group__2 : rule__SymboleEx__Group__2__Impl rule__SymboleEx__Group__3 ;
    public final void rule__SymboleEx__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4459:1: ( rule__SymboleEx__Group__2__Impl rule__SymboleEx__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4460:2: rule__SymboleEx__Group__2__Impl rule__SymboleEx__Group__3
            {
            pushFollow(FOLLOW_rule__SymboleEx__Group__2__Impl_in_rule__SymboleEx__Group__28957);
            rule__SymboleEx__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SymboleEx__Group__3_in_rule__SymboleEx__Group__28960);
            rule__SymboleEx__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymboleEx__Group__2"


    // $ANTLR start "rule__SymboleEx__Group__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4467:1: rule__SymboleEx__Group__2__Impl : ( ( rule__SymboleEx__Le5Assignment_2 ) ) ;
    public final void rule__SymboleEx__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4471:1: ( ( ( rule__SymboleEx__Le5Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4472:1: ( ( rule__SymboleEx__Le5Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4472:1: ( ( rule__SymboleEx__Le5Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4473:1: ( rule__SymboleEx__Le5Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getLe5Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4474:1: ( rule__SymboleEx__Le5Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4474:2: rule__SymboleEx__Le5Assignment_2
            {
            pushFollow(FOLLOW_rule__SymboleEx__Le5Assignment_2_in_rule__SymboleEx__Group__2__Impl8987);
            rule__SymboleEx__Le5Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymboleExAccess().getLe5Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymboleEx__Group__2__Impl"


    // $ANTLR start "rule__SymboleEx__Group__3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4484:1: rule__SymboleEx__Group__3 : rule__SymboleEx__Group__3__Impl ;
    public final void rule__SymboleEx__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4488:1: ( rule__SymboleEx__Group__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4489:2: rule__SymboleEx__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SymboleEx__Group__3__Impl_in_rule__SymboleEx__Group__39017);
            rule__SymboleEx__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymboleEx__Group__3"


    // $ANTLR start "rule__SymboleEx__Group__3__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4495:1: rule__SymboleEx__Group__3__Impl : ( RULE_PARAD ) ;
    public final void rule__SymboleEx__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4499:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4500:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4500:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4501:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getPARADTerminalRuleCall_3()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__SymboleEx__Group__3__Impl9044); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymboleExAccess().getPARADTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymboleEx__Group__3__Impl"


    // $ANTLR start "rule__LExpr__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4520:1: rule__LExpr__Group__0 : rule__LExpr__Group__0__Impl rule__LExpr__Group__1 ;
    public final void rule__LExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4524:1: ( rule__LExpr__Group__0__Impl rule__LExpr__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4525:2: rule__LExpr__Group__0__Impl rule__LExpr__Group__1
            {
            pushFollow(FOLLOW_rule__LExpr__Group__0__Impl_in_rule__LExpr__Group__09081);
            rule__LExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LExpr__Group__1_in_rule__LExpr__Group__09084);
            rule__LExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LExpr__Group__0"


    // $ANTLR start "rule__LExpr__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4532:1: rule__LExpr__Group__0__Impl : ( ruleLC ) ;
    public final void rule__LExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4536:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4537:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4537:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4538:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getLCParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__LExpr__Group__0__Impl9111);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExprAccess().getLCParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LExpr__Group__0__Impl"


    // $ANTLR start "rule__LExpr__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:1: rule__LExpr__Group__1 : rule__LExpr__Group__1__Impl ;
    public final void rule__LExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:1: ( rule__LExpr__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4554:2: rule__LExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LExpr__Group__1__Impl_in_rule__LExpr__Group__19140);
            rule__LExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LExpr__Group__1"


    // $ANTLR start "rule__LExpr__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4560:1: rule__LExpr__Group__1__Impl : ( ( rule__LExpr__ExpLeAssignment_1 ) ) ;
    public final void rule__LExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4564:1: ( ( ( rule__LExpr__ExpLeAssignment_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4565:1: ( ( rule__LExpr__ExpLeAssignment_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4565:1: ( ( rule__LExpr__ExpLeAssignment_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4566:1: ( rule__LExpr__ExpLeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getExpLeAssignment_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:1: ( rule__LExpr__ExpLeAssignment_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:2: rule__LExpr__ExpLeAssignment_1
            {
            pushFollow(FOLLOW_rule__LExpr__ExpLeAssignment_1_in_rule__LExpr__Group__1__Impl9167);
            rule__LExpr__ExpLeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExprAccess().getExpLeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LExpr__Group__1__Impl"


    // $ANTLR start "rule__ExprAnd__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4581:1: rule__ExprAnd__Group__0 : rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 ;
    public final void rule__ExprAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4585:1: ( rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4586:2: rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__09201);
            rule__ExprAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__09204);
            rule__ExprAnd__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group__0"


    // $ANTLR start "rule__ExprAnd__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4593:1: rule__ExprAnd__Group__0__Impl : ( ( rule__ExprAnd__ExpOAssignment_0 ) ) ;
    public final void rule__ExprAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4597:1: ( ( ( rule__ExprAnd__ExpOAssignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4598:1: ( ( rule__ExprAnd__ExpOAssignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4598:1: ( ( rule__ExprAnd__ExpOAssignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4599:1: ( rule__ExprAnd__ExpOAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExpOAssignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4600:1: ( rule__ExprAnd__ExpOAssignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4600:2: rule__ExprAnd__ExpOAssignment_0
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExpOAssignment_0_in_rule__ExprAnd__Group__0__Impl9231);
            rule__ExprAnd__ExpOAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExpOAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group__0__Impl"


    // $ANTLR start "rule__ExprAnd__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4610:1: rule__ExprAnd__Group__1 : rule__ExprAnd__Group__1__Impl ;
    public final void rule__ExprAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4614:1: ( rule__ExprAnd__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4615:2: rule__ExprAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__19261);
            rule__ExprAnd__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group__1"


    // $ANTLR start "rule__ExprAnd__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4621:1: rule__ExprAnd__Group__1__Impl : ( ( rule__ExprAnd__Group_1__0 )* ) ;
    public final void rule__ExprAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4625:1: ( ( ( rule__ExprAnd__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4626:1: ( ( rule__ExprAnd__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4626:1: ( ( rule__ExprAnd__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4627:1: ( rule__ExprAnd__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4628:1: ( rule__ExprAnd__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==42) ) {
                        alt16=1;
                    }


                    }
                    break;
                case RULE_CR:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (LA16_3==42) ) {
                        alt16=1;
                    }


                    }
                    break;
                case RULE_TAB:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (LA16_4==42) ) {
                        alt16=1;
                    }


                    }
                    break;
                case RULE_LF:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (LA16_5==42) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 42:
                    {
                    alt16=1;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4628:2: rule__ExprAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl9288);
            	    rule__ExprAnd__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group__1__Impl"


    // $ANTLR start "rule__ExprAnd__Group_1__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4642:1: rule__ExprAnd__Group_1__0 : rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 ;
    public final void rule__ExprAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4646:1: ( rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4647:2: rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__09323);
            rule__ExprAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__09326);
            rule__ExprAnd__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__0"


    // $ANTLR start "rule__ExprAnd__Group_1__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4654:1: rule__ExprAnd__Group_1__0__Impl : ( ruleLC ) ;
    public final void rule__ExprAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4658:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4659:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4659:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4660:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__0__Impl9353);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__0__Impl"


    // $ANTLR start "rule__ExprAnd__Group_1__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4671:1: rule__ExprAnd__Group_1__1 : rule__ExprAnd__Group_1__1__Impl rule__ExprAnd__Group_1__2 ;
    public final void rule__ExprAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4675:1: ( rule__ExprAnd__Group_1__1__Impl rule__ExprAnd__Group_1__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4676:2: rule__ExprAnd__Group_1__1__Impl rule__ExprAnd__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__19382);
            rule__ExprAnd__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__2_in_rule__ExprAnd__Group_1__19385);
            rule__ExprAnd__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__1"


    // $ANTLR start "rule__ExprAnd__Group_1__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4683:1: rule__ExprAnd__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__ExprAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4687:1: ( ( 'and' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4688:1: ( 'and' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4688:1: ( 'and' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4689:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getAndKeyword_1_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__ExprAnd__Group_1__1__Impl9413); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getAndKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__1__Impl"


    // $ANTLR start "rule__ExprAnd__Group_1__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4702:1: rule__ExprAnd__Group_1__2 : rule__ExprAnd__Group_1__2__Impl rule__ExprAnd__Group_1__3 ;
    public final void rule__ExprAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4706:1: ( rule__ExprAnd__Group_1__2__Impl rule__ExprAnd__Group_1__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4707:2: rule__ExprAnd__Group_1__2__Impl rule__ExprAnd__Group_1__3
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__2__Impl_in_rule__ExprAnd__Group_1__29444);
            rule__ExprAnd__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__3_in_rule__ExprAnd__Group_1__29447);
            rule__ExprAnd__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__2"


    // $ANTLR start "rule__ExprAnd__Group_1__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4714:1: rule__ExprAnd__Group_1__2__Impl : ( ruleLC ) ;
    public final void rule__ExprAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4718:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4719:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4719:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4720:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__2__Impl9474);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__2__Impl"


    // $ANTLR start "rule__ExprAnd__Group_1__3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4731:1: rule__ExprAnd__Group_1__3 : rule__ExprAnd__Group_1__3__Impl ;
    public final void rule__ExprAnd__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:1: ( rule__ExprAnd__Group_1__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4736:2: rule__ExprAnd__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__3__Impl_in_rule__ExprAnd__Group_1__39503);
            rule__ExprAnd__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__3"


    // $ANTLR start "rule__ExprAnd__Group_1__3__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4742:1: rule__ExprAnd__Group_1__3__Impl : ( ( rule__ExprAnd__ExpO2Assignment_1_3 ) ) ;
    public final void rule__ExprAnd__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4746:1: ( ( ( rule__ExprAnd__ExpO2Assignment_1_3 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4747:1: ( ( rule__ExprAnd__ExpO2Assignment_1_3 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4747:1: ( ( rule__ExprAnd__ExpO2Assignment_1_3 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4748:1: ( rule__ExprAnd__ExpO2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExpO2Assignment_1_3()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4749:1: ( rule__ExprAnd__ExpO2Assignment_1_3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4749:2: rule__ExprAnd__ExpO2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExpO2Assignment_1_3_in_rule__ExprAnd__Group_1__3__Impl9530);
            rule__ExprAnd__ExpO2Assignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExpO2Assignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__3__Impl"


    // $ANTLR start "rule__ExprOr__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4767:1: rule__ExprOr__Group__0 : rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 ;
    public final void rule__ExprOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4771:1: ( rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4772:2: rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__09568);
            rule__ExprOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__09571);
            rule__ExprOr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group__0"


    // $ANTLR start "rule__ExprOr__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4779:1: rule__ExprOr__Group__0__Impl : ( ( rule__ExprOr__ExpNAssignment_0 ) ) ;
    public final void rule__ExprOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4783:1: ( ( ( rule__ExprOr__ExpNAssignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4784:1: ( ( rule__ExprOr__ExpNAssignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4784:1: ( ( rule__ExprOr__ExpNAssignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4785:1: ( rule__ExprOr__ExpNAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExpNAssignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4786:1: ( rule__ExprOr__ExpNAssignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4786:2: rule__ExprOr__ExpNAssignment_0
            {
            pushFollow(FOLLOW_rule__ExprOr__ExpNAssignment_0_in_rule__ExprOr__Group__0__Impl9598);
            rule__ExprOr__ExpNAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExpNAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group__0__Impl"


    // $ANTLR start "rule__ExprOr__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: rule__ExprOr__Group__1 : rule__ExprOr__Group__1__Impl ;
    public final void rule__ExprOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4800:1: ( rule__ExprOr__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4801:2: rule__ExprOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__19628);
            rule__ExprOr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group__1"


    // $ANTLR start "rule__ExprOr__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4807:1: rule__ExprOr__Group__1__Impl : ( ( rule__ExprOr__Group_1__0 )* ) ;
    public final void rule__ExprOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4811:1: ( ( ( rule__ExprOr__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4812:1: ( ( rule__ExprOr__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4812:1: ( ( rule__ExprOr__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4813:1: ( rule__ExprOr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4814:1: ( rule__ExprOr__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==43) ) {
                        alt17=1;
                    }


                    }
                    break;
                case RULE_CR:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (LA17_3==43) ) {
                        alt17=1;
                    }


                    }
                    break;
                case RULE_TAB:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (LA17_4==43) ) {
                        alt17=1;
                    }


                    }
                    break;
                case RULE_LF:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (LA17_5==43) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 43:
                    {
                    alt17=1;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4814:2: rule__ExprOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl9655);
            	    rule__ExprOr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group__1__Impl"


    // $ANTLR start "rule__ExprOr__Group_1__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4828:1: rule__ExprOr__Group_1__0 : rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 ;
    public final void rule__ExprOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4832:1: ( rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4833:2: rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__09690);
            rule__ExprOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__09693);
            rule__ExprOr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__0"


    // $ANTLR start "rule__ExprOr__Group_1__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4840:1: rule__ExprOr__Group_1__0__Impl : ( ruleLC ) ;
    public final void rule__ExprOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4844:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4845:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4845:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprOr__Group_1__0__Impl9720);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__0__Impl"


    // $ANTLR start "rule__ExprOr__Group_1__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4857:1: rule__ExprOr__Group_1__1 : rule__ExprOr__Group_1__1__Impl rule__ExprOr__Group_1__2 ;
    public final void rule__ExprOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4861:1: ( rule__ExprOr__Group_1__1__Impl rule__ExprOr__Group_1__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4862:2: rule__ExprOr__Group_1__1__Impl rule__ExprOr__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__19749);
            rule__ExprOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__2_in_rule__ExprOr__Group_1__19752);
            rule__ExprOr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__1"


    // $ANTLR start "rule__ExprOr__Group_1__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4869:1: rule__ExprOr__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__ExprOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4873:1: ( ( 'or' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4874:1: ( 'or' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4874:1: ( 'or' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4875:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getOrKeyword_1_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__ExprOr__Group_1__1__Impl9780); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getOrKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__1__Impl"


    // $ANTLR start "rule__ExprOr__Group_1__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4888:1: rule__ExprOr__Group_1__2 : rule__ExprOr__Group_1__2__Impl rule__ExprOr__Group_1__3 ;
    public final void rule__ExprOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4892:1: ( rule__ExprOr__Group_1__2__Impl rule__ExprOr__Group_1__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4893:2: rule__ExprOr__Group_1__2__Impl rule__ExprOr__Group_1__3
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__2__Impl_in_rule__ExprOr__Group_1__29811);
            rule__ExprOr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__3_in_rule__ExprOr__Group_1__29814);
            rule__ExprOr__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__2"


    // $ANTLR start "rule__ExprOr__Group_1__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4900:1: rule__ExprOr__Group_1__2__Impl : ( ruleLC ) ;
    public final void rule__ExprOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4904:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4905:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4905:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4906:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprOr__Group_1__2__Impl9841);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__2__Impl"


    // $ANTLR start "rule__ExprOr__Group_1__3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4917:1: rule__ExprOr__Group_1__3 : rule__ExprOr__Group_1__3__Impl ;
    public final void rule__ExprOr__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:1: ( rule__ExprOr__Group_1__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4922:2: rule__ExprOr__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__3__Impl_in_rule__ExprOr__Group_1__39870);
            rule__ExprOr__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__3"


    // $ANTLR start "rule__ExprOr__Group_1__3__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4928:1: rule__ExprOr__Group_1__3__Impl : ( ( rule__ExprOr__ExpN2Assignment_1_3 ) ) ;
    public final void rule__ExprOr__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4932:1: ( ( ( rule__ExprOr__ExpN2Assignment_1_3 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4933:1: ( ( rule__ExprOr__ExpN2Assignment_1_3 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4933:1: ( ( rule__ExprOr__ExpN2Assignment_1_3 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4934:1: ( rule__ExprOr__ExpN2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExpN2Assignment_1_3()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4935:1: ( rule__ExprOr__ExpN2Assignment_1_3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4935:2: rule__ExprOr__ExpN2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__ExprOr__ExpN2Assignment_1_3_in_rule__ExprOr__Group_1__3__Impl9897);
            rule__ExprOr__ExpN2Assignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExpN2Assignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__3__Impl"


    // $ANTLR start "rule__ExprNot__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4953:1: rule__ExprNot__Group__0 : rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1 ;
    public final void rule__ExprNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4957:1: ( rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4958:2: rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1
            {
            pushFollow(FOLLOW_rule__ExprNot__Group__0__Impl_in_rule__ExprNot__Group__09935);
            rule__ExprNot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprNot__Group__1_in_rule__ExprNot__Group__09938);
            rule__ExprNot__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group__0"


    // $ANTLR start "rule__ExprNot__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4965:1: rule__ExprNot__Group__0__Impl : ( ( rule__ExprNot__Group_0__0 )? ) ;
    public final void rule__ExprNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4969:1: ( ( ( rule__ExprNot__Group_0__0 )? ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4970:1: ( ( rule__ExprNot__Group_0__0 )? )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4970:1: ( ( rule__ExprNot__Group_0__0 )? )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:1: ( rule__ExprNot__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getGroup_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4972:1: ( rule__ExprNot__Group_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4972:2: rule__ExprNot__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprNot__Group_0__0_in_rule__ExprNot__Group__0__Impl9965);
                    rule__ExprNot__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group__0__Impl"


    // $ANTLR start "rule__ExprNot__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4982:1: rule__ExprNot__Group__1 : rule__ExprNot__Group__1__Impl ;
    public final void rule__ExprNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4986:1: ( rule__ExprNot__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4987:2: rule__ExprNot__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprNot__Group__1__Impl_in_rule__ExprNot__Group__19996);
            rule__ExprNot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group__1"


    // $ANTLR start "rule__ExprNot__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4993:1: rule__ExprNot__Group__1__Impl : ( ( rule__ExprNot__ExpEqAssignment_1 ) ) ;
    public final void rule__ExprNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4997:1: ( ( ( rule__ExprNot__ExpEqAssignment_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4998:1: ( ( rule__ExprNot__ExpEqAssignment_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4998:1: ( ( rule__ExprNot__ExpEqAssignment_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4999:1: ( rule__ExprNot__ExpEqAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExpEqAssignment_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5000:1: ( rule__ExprNot__ExpEqAssignment_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5000:2: rule__ExprNot__ExpEqAssignment_1
            {
            pushFollow(FOLLOW_rule__ExprNot__ExpEqAssignment_1_in_rule__ExprNot__Group__1__Impl10023);
            rule__ExprNot__ExpEqAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getExpEqAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group__1__Impl"


    // $ANTLR start "rule__ExprNot__Group_0__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5014:1: rule__ExprNot__Group_0__0 : rule__ExprNot__Group_0__0__Impl rule__ExprNot__Group_0__1 ;
    public final void rule__ExprNot__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5018:1: ( rule__ExprNot__Group_0__0__Impl rule__ExprNot__Group_0__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5019:2: rule__ExprNot__Group_0__0__Impl rule__ExprNot__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprNot__Group_0__0__Impl_in_rule__ExprNot__Group_0__010057);
            rule__ExprNot__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprNot__Group_0__1_in_rule__ExprNot__Group_0__010060);
            rule__ExprNot__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group_0__0"


    // $ANTLR start "rule__ExprNot__Group_0__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5026:1: rule__ExprNot__Group_0__0__Impl : ( 'not' ) ;
    public final void rule__ExprNot__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5030:1: ( ( 'not' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5031:1: ( 'not' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5031:1: ( 'not' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5032:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getNotKeyword_0_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__ExprNot__Group_0__0__Impl10088); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getNotKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group_0__0__Impl"


    // $ANTLR start "rule__ExprNot__Group_0__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5045:1: rule__ExprNot__Group_0__1 : rule__ExprNot__Group_0__1__Impl ;
    public final void rule__ExprNot__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5049:1: ( rule__ExprNot__Group_0__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5050:2: rule__ExprNot__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprNot__Group_0__1__Impl_in_rule__ExprNot__Group_0__110119);
            rule__ExprNot__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group_0__1"


    // $ANTLR start "rule__ExprNot__Group_0__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5056:1: rule__ExprNot__Group_0__1__Impl : ( ruleLC ) ;
    public final void rule__ExprNot__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5060:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5061:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5061:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5062:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getLCParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprNot__Group_0__1__Impl10146);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getLCParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group_0__1__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5077:1: rule__ExprEq__Group_0__0 : rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 ;
    public final void rule__ExprEq__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5081:1: ( rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5082:2: rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__010179);
            rule__ExprEq__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__010182);
            rule__ExprEq__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__0"


    // $ANTLR start "rule__ExprEq__Group_0__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5089:1: rule__ExprEq__Group_0__0__Impl : ( ( rule__ExprEq__ExpS1Assignment_0_0 ) ) ;
    public final void rule__ExprEq__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5093:1: ( ( ( rule__ExprEq__ExpS1Assignment_0_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5094:1: ( ( rule__ExprEq__ExpS1Assignment_0_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5094:1: ( ( rule__ExprEq__ExpS1Assignment_0_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5095:1: ( rule__ExprEq__ExpS1Assignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpS1Assignment_0_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5096:1: ( rule__ExprEq__ExpS1Assignment_0_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5096:2: rule__ExprEq__ExpS1Assignment_0_0
            {
            pushFollow(FOLLOW_rule__ExprEq__ExpS1Assignment_0_0_in_rule__ExprEq__Group_0__0__Impl10209);
            rule__ExprEq__ExpS1Assignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExpS1Assignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__0__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5106:1: rule__ExprEq__Group_0__1 : rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 ;
    public final void rule__ExprEq__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5110:1: ( rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5111:2: rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__110239);
            rule__ExprEq__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__110242);
            rule__ExprEq__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__1"


    // $ANTLR start "rule__ExprEq__Group_0__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5118:1: rule__ExprEq__Group_0__1__Impl : ( '=?' ) ;
    public final void rule__ExprEq__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5122:1: ( ( '=?' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5123:1: ( '=?' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5123:1: ( '=?' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5124:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__ExprEq__Group_0__1__Impl10270); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__1__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5137:1: rule__ExprEq__Group_0__2 : rule__ExprEq__Group_0__2__Impl ;
    public final void rule__ExprEq__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5141:1: ( rule__ExprEq__Group_0__2__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5142:2: rule__ExprEq__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__210301);
            rule__ExprEq__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__2"


    // $ANTLR start "rule__ExprEq__Group_0__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5148:1: rule__ExprEq__Group_0__2__Impl : ( ( rule__ExprEq__ExpS2Assignment_0_2 ) ) ;
    public final void rule__ExprEq__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5152:1: ( ( ( rule__ExprEq__ExpS2Assignment_0_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5153:1: ( ( rule__ExprEq__ExpS2Assignment_0_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5153:1: ( ( rule__ExprEq__ExpS2Assignment_0_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5154:1: ( rule__ExprEq__ExpS2Assignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpS2Assignment_0_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5155:1: ( rule__ExprEq__ExpS2Assignment_0_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5155:2: rule__ExprEq__ExpS2Assignment_0_2
            {
            pushFollow(FOLLOW_rule__ExprEq__ExpS2Assignment_0_2_in_rule__ExprEq__Group_0__2__Impl10328);
            rule__ExprEq__ExpS2Assignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExpS2Assignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__2__Impl"


    // $ANTLR start "rule__ExprEq__Group_1__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5171:1: rule__ExprEq__Group_1__0 : rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 ;
    public final void rule__ExprEq__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5175:1: ( rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5176:2: rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__010364);
            rule__ExprEq__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__010367);
            rule__ExprEq__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__0"


    // $ANTLR start "rule__ExprEq__Group_1__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5183:1: rule__ExprEq__Group_1__0__Impl : ( RULE_PARAG ) ;
    public final void rule__ExprEq__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5187:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5188:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5188:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5189:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getPARAGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__ExprEq__Group_1__0__Impl10394); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getPARAGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__0__Impl"


    // $ANTLR start "rule__ExprEq__Group_1__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5200:1: rule__ExprEq__Group_1__1 : rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 ;
    public final void rule__ExprEq__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5204:1: ( rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:2: rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__110423);
            rule__ExprEq__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__110426);
            rule__ExprEq__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__1"


    // $ANTLR start "rule__ExprEq__Group_1__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5212:1: rule__ExprEq__Group_1__1__Impl : ( ( rule__ExprEq__ExpRAssignment_1_1 ) ) ;
    public final void rule__ExprEq__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5216:1: ( ( ( rule__ExprEq__ExpRAssignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5217:1: ( ( rule__ExprEq__ExpRAssignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5217:1: ( ( rule__ExprEq__ExpRAssignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5218:1: ( rule__ExprEq__ExpRAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpRAssignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:1: ( rule__ExprEq__ExpRAssignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:2: rule__ExprEq__ExpRAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprEq__ExpRAssignment_1_1_in_rule__ExprEq__Group_1__1__Impl10453);
            rule__ExprEq__ExpRAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExpRAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__1__Impl"


    // $ANTLR start "rule__ExprEq__Group_1__2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5229:1: rule__ExprEq__Group_1__2 : rule__ExprEq__Group_1__2__Impl ;
    public final void rule__ExprEq__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5233:1: ( rule__ExprEq__Group_1__2__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5234:2: rule__ExprEq__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__210483);
            rule__ExprEq__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__2"


    // $ANTLR start "rule__ExprEq__Group_1__2__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5240:1: rule__ExprEq__Group_1__2__Impl : ( RULE_PARAD ) ;
    public final void rule__ExprEq__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5244:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5245:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5245:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5246:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getPARADTerminalRuleCall_1_2()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__ExprEq__Group_1__2__Impl10510); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getPARADTerminalRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__2__Impl"


    // $ANTLR start "rule__Model__ProgrammeAssignment"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5264:1: rule__Model__ProgrammeAssignment : ( ruleProgramme ) ;
    public final void rule__Model__ProgrammeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5268:1: ( ( ruleProgramme ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5269:1: ( ruleProgramme )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5269:1: ( ruleProgramme )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5270:1: ruleProgramme
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getProgrammeProgrammeParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleProgramme_in_rule__Model__ProgrammeAssignment10550);
            ruleProgramme();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getProgrammeProgrammeParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProgrammeAssignment"


    // $ANTLR start "rule__Programme__FonctAssignment_1_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5279:1: rule__Programme__FonctAssignment_1_0 : ( ruleFonction ) ;
    public final void rule__Programme__FonctAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5283:1: ( ( ruleFonction ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5284:1: ( ruleFonction )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5284:1: ( ruleFonction )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5285:1: ruleFonction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getFonctFonctionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleFonction_in_rule__Programme__FonctAssignment_1_010581);
            ruleFonction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgrammeAccess().getFonctFonctionParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__FonctAssignment_1_0"


    // $ANTLR start "rule__Fonction__SymboleAssignment_2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5294:1: rule__Fonction__SymboleAssignment_2 : ( RULE_SYM ) ;
    public final void rule__Fonction__SymboleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5298:1: ( ( RULE_SYM ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5299:1: ( RULE_SYM )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5299:1: ( RULE_SYM )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5300:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getSymboleSYMTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__Fonction__SymboleAssignment_210612); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getSymboleSYMTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__SymboleAssignment_2"


    // $ANTLR start "rule__Fonction__InAssignment_7"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5309:1: rule__Fonction__InAssignment_7 : ( ruleInput ) ;
    public final void rule__Fonction__InAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5313:1: ( ( ruleInput ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5314:1: ( ruleInput )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5314:1: ( ruleInput )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5315:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getInInputParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Fonction__InAssignment_710643);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getInInputParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__InAssignment_7"


    // $ANTLR start "rule__Fonction__ComAssignment_9"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5324:1: rule__Fonction__ComAssignment_9 : ( ruleCommandes ) ;
    public final void rule__Fonction__ComAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5328:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5329:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5329:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5330:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getComCommandesParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__Fonction__ComAssignment_910674);
            ruleCommandes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getComCommandesParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__ComAssignment_9"


    // $ANTLR start "rule__Fonction__OutAssignment_13"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5339:1: rule__Fonction__OutAssignment_13 : ( ruleOutput ) ;
    public final void rule__Fonction__OutAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5343:1: ( ( ruleOutput ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5344:1: ( ruleOutput )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5344:1: ( ruleOutput )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5345:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getOutOutputParserRuleCall_13_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Fonction__OutAssignment_1310705);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFonctionAccess().getOutOutputParserRuleCall_13_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fonction__OutAssignment_13"


    // $ANTLR start "rule__Input__Var1Assignment_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5354:1: rule__Input__Var1Assignment_0 : ( RULE_VAR ) ;
    public final void rule__Input__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5358:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5359:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5359:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5360:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVar1VARTerminalRuleCall_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Input__Var1Assignment_010736); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVar1VARTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Var1Assignment_0"


    // $ANTLR start "rule__Input__Var2Assignment_1_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5369:1: rule__Input__Var2Assignment_1_1 : ( RULE_VAR ) ;
    public final void rule__Input__Var2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5373:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5374:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5374:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5375:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVar2VARTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Input__Var2Assignment_1_110767); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVar2VARTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Var2Assignment_1_1"


    // $ANTLR start "rule__Output__Var1Assignment_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5384:1: rule__Output__Var1Assignment_0 : ( RULE_VAR ) ;
    public final void rule__Output__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5388:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5389:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5389:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5390:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVar1VARTerminalRuleCall_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Output__Var1Assignment_010798); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVar1VARTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Var1Assignment_0"


    // $ANTLR start "rule__Output__Var2Assignment_1_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5399:1: rule__Output__Var2Assignment_1_1 : ( RULE_VAR ) ;
    public final void rule__Output__Var2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5403:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5404:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5404:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5405:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVar2VARTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Output__Var2Assignment_1_110829); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVar2VARTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Var2Assignment_1_1"


    // $ANTLR start "rule__Commandes__Com1Assignment_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5414:1: rule__Commandes__Com1Assignment_0 : ( ruleCommande ) ;
    public final void rule__Commandes__Com1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5418:1: ( ( ruleCommande ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5419:1: ( ruleCommande )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5419:1: ( ruleCommande )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5420:1: ruleCommande
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getCom1CommandeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommande_in_rule__Commandes__Com1Assignment_010860);
            ruleCommande();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandesAccess().getCom1CommandeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commandes__Com1Assignment_0"


    // $ANTLR start "rule__Commandes__Com2Assignment_1_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5429:1: rule__Commandes__Com2Assignment_1_1 : ( ruleCommande ) ;
    public final void rule__Commandes__Com2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5433:1: ( ( ruleCommande ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5434:1: ( ruleCommande )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5434:1: ( ruleCommande )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5435:1: ruleCommande
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getCom2CommandeParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCommande_in_rule__Commandes__Com2Assignment_1_110891);
            ruleCommande();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandesAccess().getCom2CommandeParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commandes__Com2Assignment_1_1"


    // $ANTLR start "rule__Commande__NopAssignment_0_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5444:1: rule__Commande__NopAssignment_0_1 : ( ( 'nop' ) ) ;
    public final void rule__Commande__NopAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5448:1: ( ( ( 'nop' ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5449:1: ( ( 'nop' ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5449:1: ( ( 'nop' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5450:1: ( 'nop' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getNopNopKeyword_0_1_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5451:1: ( 'nop' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5452:1: 'nop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getNopNopKeyword_0_1_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Commande__NopAssignment_0_110927); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandeAccess().getNopNopKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandeAccess().getNopNopKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commande__NopAssignment_0_1"


    // $ANTLR start "rule__Commande__AffectVarAssignment_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5467:1: rule__Commande__AffectVarAssignment_1 : ( ruleAffectVar ) ;
    public final void rule__Commande__AffectVarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5471:1: ( ( ruleAffectVar ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5472:1: ( ruleAffectVar )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5472:1: ( ruleAffectVar )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5473:1: ruleAffectVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getAffectVarAffectVarParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAffectVar_in_rule__Commande__AffectVarAssignment_110966);
            ruleAffectVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandeAccess().getAffectVarAffectVarParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commande__AffectVarAssignment_1"


    // $ANTLR start "rule__Commande__WhileCAssignment_2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5482:1: rule__Commande__WhileCAssignment_2 : ( ruleWhile ) ;
    public final void rule__Commande__WhileCAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5486:1: ( ( ruleWhile ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5487:1: ( ruleWhile )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5487:1: ( ruleWhile )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5488:1: ruleWhile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getWhileCWhileParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_rule__Commande__WhileCAssignment_210997);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandeAccess().getWhileCWhileParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commande__WhileCAssignment_2"


    // $ANTLR start "rule__Commande__ForCAssignment_3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5497:1: rule__Commande__ForCAssignment_3 : ( ruleFor ) ;
    public final void rule__Commande__ForCAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5501:1: ( ( ruleFor ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5502:1: ( ruleFor )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5502:1: ( ruleFor )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5503:1: ruleFor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getForCForParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFor_in_rule__Commande__ForCAssignment_311028);
            ruleFor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandeAccess().getForCForParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commande__ForCAssignment_3"


    // $ANTLR start "rule__Commande__IfCAssignment_4"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5512:1: rule__Commande__IfCAssignment_4 : ( ruleIf ) ;
    public final void rule__Commande__IfCAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5516:1: ( ( ruleIf ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5517:1: ( ruleIf )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5517:1: ( ruleIf )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5518:1: ruleIf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getIfCIfParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleIf_in_rule__Commande__IfCAssignment_411059);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandeAccess().getIfCIfParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commande__IfCAssignment_4"


    // $ANTLR start "rule__Commande__ForeachCAssignment_5"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5527:1: rule__Commande__ForeachCAssignment_5 : ( ruleForeach ) ;
    public final void rule__Commande__ForeachCAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5531:1: ( ( ruleForeach ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5532:1: ( ruleForeach )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5532:1: ( ruleForeach )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5533:1: ruleForeach
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getForeachCForeachParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleForeach_in_rule__Commande__ForeachCAssignment_511090);
            ruleForeach();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandeAccess().getForeachCForeachParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commande__ForeachCAssignment_5"


    // $ANTLR start "rule__AffectVar__Var1Assignment_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5542:1: rule__AffectVar__Var1Assignment_0 : ( ruleVars ) ;
    public final void rule__AffectVar__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5546:1: ( ( ruleVars ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: ( ruleVars )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: ( ruleVars )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5548:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getVar1VarsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__AffectVar__Var1Assignment_011121);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectVarAccess().getVar1VarsParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectVar__Var1Assignment_0"


    // $ANTLR start "rule__AffectVar__ExpAssignment_2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5557:1: rule__AffectVar__ExpAssignment_2 : ( ruleExprs ) ;
    public final void rule__AffectVar__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5561:1: ( ( ruleExprs ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5562:1: ( ruleExprs )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5562:1: ( ruleExprs )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5563:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getExpExprsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__AffectVar__ExpAssignment_211152);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAffectVarAccess().getExpExprsParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectVar__ExpAssignment_2"


    // $ANTLR start "rule__While__Exp2Assignment_2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5572:1: rule__While__Exp2Assignment_2 : ( ruleExpr ) ;
    public final void rule__While__Exp2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5576:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5577:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5577:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5578:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExp2ExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__While__Exp2Assignment_211183);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getExp2ExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Exp2Assignment_2"


    // $ANTLR start "rule__While__Com3Assignment_6"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5587:1: rule__While__Com3Assignment_6 : ( ruleCommandes ) ;
    public final void rule__While__Com3Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5591:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5592:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5592:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5593:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getCom3CommandesParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__While__Com3Assignment_611214);
            ruleCommandes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getCom3CommandesParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Com3Assignment_6"


    // $ANTLR start "rule__For__Exp3Assignment_2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5602:1: rule__For__Exp3Assignment_2 : ( ruleExpr ) ;
    public final void rule__For__Exp3Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5606:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5607:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5607:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5608:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getExp3ExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__For__Exp3Assignment_211245);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getExp3ExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Exp3Assignment_2"


    // $ANTLR start "rule__For__Com4Assignment_6"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5617:1: rule__For__Com4Assignment_6 : ( ruleCommandes ) ;
    public final void rule__For__Com4Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5621:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5622:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5622:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5623:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCom4CommandesParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__For__Com4Assignment_611276);
            ruleCommandes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getCom4CommandesParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Com4Assignment_6"


    // $ANTLR start "rule__If__Exp4Assignment_2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5632:1: rule__If__Exp4Assignment_2 : ( ruleExpr ) ;
    public final void rule__If__Exp4Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5636:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5637:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5637:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5638:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExp4ExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__If__Exp4Assignment_211307);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getExp4ExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Exp4Assignment_2"


    // $ANTLR start "rule__If__Com5Assignment_6"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5647:1: rule__If__Com5Assignment_6 : ( ruleCommandes ) ;
    public final void rule__If__Com5Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5651:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5652:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5652:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5653:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCom5CommandesParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__If__Com5Assignment_611338);
            ruleCommandes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getCom5CommandesParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Com5Assignment_6"


    // $ANTLR start "rule__If__Com6Assignment_8_2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5662:1: rule__If__Com6Assignment_8_2 : ( ruleCommandes ) ;
    public final void rule__If__Com6Assignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5666:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5667:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5667:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5668:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCom6CommandesParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__If__Com6Assignment_8_211369);
            ruleCommandes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getCom6CommandesParserRuleCall_8_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Com6Assignment_8_2"


    // $ANTLR start "rule__Foreach__Exp5Assignment_2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5677:1: rule__Foreach__Exp5Assignment_2 : ( ruleExpr ) ;
    public final void rule__Foreach__Exp5Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5681:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5682:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5682:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5683:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getExp5ExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Foreach__Exp5Assignment_211400);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getExp5ExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Exp5Assignment_2"


    // $ANTLR start "rule__Foreach__Exp6Assignment_6"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5692:1: rule__Foreach__Exp6Assignment_6 : ( ruleExpr ) ;
    public final void rule__Foreach__Exp6Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5696:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5697:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5697:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5698:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getExp6ExprParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Foreach__Exp6Assignment_611431);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getExp6ExprParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Exp6Assignment_6"


    // $ANTLR start "rule__Foreach__Com7Assignment_10"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5707:1: rule__Foreach__Com7Assignment_10 : ( ruleCommandes ) ;
    public final void rule__Foreach__Com7Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5711:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5712:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5712:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5713:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getCom7CommandesParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__Foreach__Com7Assignment_1011462);
            ruleCommandes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachAccess().getCom7CommandesParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foreach__Com7Assignment_10"


    // $ANTLR start "rule__Vars__Var2Assignment_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5722:1: rule__Vars__Var2Assignment_0 : ( RULE_VAR ) ;
    public final void rule__Vars__Var2Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5726:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5727:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5727:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5728:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVar2VARTerminalRuleCall_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Vars__Var2Assignment_011493); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVar2VARTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Var2Assignment_0"


    // $ANTLR start "rule__Vars__Var3Assignment_1_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5737:1: rule__Vars__Var3Assignment_1_1 : ( RULE_VAR ) ;
    public final void rule__Vars__Var3Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5741:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5742:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5742:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5743:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVar3VARTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Vars__Var3Assignment_1_111524); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVar3VARTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Var3Assignment_1_1"


    // $ANTLR start "rule__Exprs__ExprSAssignment_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5752:1: rule__Exprs__ExprSAssignment_0 : ( ruleExpr ) ;
    public final void rule__Exprs__ExprSAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5756:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5757:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5757:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5758:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprSExprParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExprSAssignment_011555);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExprSExprParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__ExprSAssignment_0"


    // $ANTLR start "rule__Exprs__ExprS2Assignment_1_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5767:1: rule__Exprs__ExprS2Assignment_1_1 : ( ruleExpr ) ;
    public final void rule__Exprs__ExprS2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5771:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5772:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5772:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5773:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprS2ExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExprS2Assignment_1_111586);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExprS2ExprParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__ExprS2Assignment_1_1"


    // $ANTLR start "rule__Expr__ExpAAssignment_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5782:1: rule__Expr__ExpAAssignment_0 : ( ruleExprAnd ) ;
    public final void rule__Expr__ExpAAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5786:1: ( ( ruleExprAnd ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5787:1: ( ruleExprAnd )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5787:1: ( ruleExprAnd )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5788:1: ruleExprAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExpAExprAndParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_rule__Expr__ExpAAssignment_011617);
            ruleExprAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExpAExprAndParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExpAAssignment_0"


    // $ANTLR start "rule__Expr__ExpSAssignment_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5797:1: rule__Expr__ExpSAssignment_1 : ( ruleExprSimple ) ;
    public final void rule__Expr__ExpSAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5801:1: ( ( ruleExprSimple ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5802:1: ( ruleExprSimple )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5802:1: ( ruleExprSimple )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5803:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExpSExprSimpleParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__Expr__ExpSAssignment_111648);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExpSExprSimpleParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExpSAssignment_1"


    // $ANTLR start "rule__ExprSimple__VideAssignment_0_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5812:1: rule__ExprSimple__VideAssignment_0_1 : ( ( 'nil' ) ) ;
    public final void rule__ExprSimple__VideAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5816:1: ( ( ( 'nil' ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5817:1: ( ( 'nil' ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5817:1: ( ( 'nil' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5818:1: ( 'nil' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVideNilKeyword_0_1_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5819:1: ( 'nil' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5820:1: 'nil'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVideNilKeyword_0_1_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__ExprSimple__VideAssignment_0_111684); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getVideNilKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getVideNilKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__VideAssignment_0_1"


    // $ANTLR start "rule__ExprSimple__VariableAssignment_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5835:1: rule__ExprSimple__VariableAssignment_1 : ( RULE_VAR ) ;
    public final void rule__ExprSimple__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5839:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5840:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5840:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5841:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVariableVARTerminalRuleCall_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__ExprSimple__VariableAssignment_111723); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getVariableVARTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__VariableAssignment_1"


    // $ANTLR start "rule__ExprSimple__SymboleAssignment_2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5850:1: rule__ExprSimple__SymboleAssignment_2 : ( RULE_SYM ) ;
    public final void rule__ExprSimple__SymboleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5854:1: ( ( RULE_SYM ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5855:1: ( RULE_SYM )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5855:1: ( RULE_SYM )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5856:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymboleSYMTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__ExprSimple__SymboleAssignment_211754); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getSymboleSYMTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__SymboleAssignment_2"


    // $ANTLR start "rule__ExprSimple__ConsAssignment_3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5865:1: rule__ExprSimple__ConsAssignment_3 : ( ruleCons ) ;
    public final void rule__ExprSimple__ConsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5869:1: ( ( ruleCons ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5870:1: ( ruleCons )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5870:1: ( ruleCons )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5871:1: ruleCons
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getConsConsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCons_in_rule__ExprSimple__ConsAssignment_311785);
            ruleCons();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getConsConsParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ConsAssignment_3"


    // $ANTLR start "rule__ExprSimple__ListeAssignment_4"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5880:1: rule__ExprSimple__ListeAssignment_4 : ( ruleListe ) ;
    public final void rule__ExprSimple__ListeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5884:1: ( ( ruleListe ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5885:1: ( ruleListe )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5885:1: ( ruleListe )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5886:1: ruleListe
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getListeListeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleListe_in_rule__ExprSimple__ListeAssignment_411816);
            ruleListe();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getListeListeParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ListeAssignment_4"


    // $ANTLR start "rule__ExprSimple__HdAssignment_5"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5895:1: rule__ExprSimple__HdAssignment_5 : ( ruleHd ) ;
    public final void rule__ExprSimple__HdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5899:1: ( ( ruleHd ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5900:1: ( ruleHd )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5900:1: ( ruleHd )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5901:1: ruleHd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getHdHdParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleHd_in_rule__ExprSimple__HdAssignment_511847);
            ruleHd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getHdHdParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__HdAssignment_5"


    // $ANTLR start "rule__ExprSimple__TlAssignment_6"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5910:1: rule__ExprSimple__TlAssignment_6 : ( ruleTl ) ;
    public final void rule__ExprSimple__TlAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5914:1: ( ( ruleTl ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5915:1: ( ruleTl )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5915:1: ( ruleTl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5916:1: ruleTl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getTlTlParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleTl_in_rule__ExprSimple__TlAssignment_611878);
            ruleTl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getTlTlParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__TlAssignment_6"


    // $ANTLR start "rule__ExprSimple__SymbolExAssignment_7"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5925:1: rule__ExprSimple__SymbolExAssignment_7 : ( ruleSymboleEx ) ;
    public final void rule__ExprSimple__SymbolExAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5929:1: ( ( ruleSymboleEx ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5930:1: ( ruleSymboleEx )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5930:1: ( ruleSymboleEx )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5931:1: ruleSymboleEx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymbolExSymboleExParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleSymboleEx_in_rule__ExprSimple__SymbolExAssignment_711909);
            ruleSymboleEx();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getSymbolExSymboleExParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__SymbolExAssignment_7"


    // $ANTLR start "rule__Cons__Le1Assignment_2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5940:1: rule__Cons__Le1Assignment_2 : ( ruleLExpr ) ;
    public final void rule__Cons__Le1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5944:1: ( ( ruleLExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5945:1: ( ruleLExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5945:1: ( ruleLExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5946:1: ruleLExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getLe1LExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_rule__Cons__Le1Assignment_211940);
            ruleLExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getLe1LExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cons__Le1Assignment_2"


    // $ANTLR start "rule__Liste__Le2Assignment_2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5955:1: rule__Liste__Le2Assignment_2 : ( ruleLExpr ) ;
    public final void rule__Liste__Le2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5959:1: ( ( ruleLExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5960:1: ( ruleLExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5960:1: ( ruleLExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5961:1: ruleLExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getLe2LExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_rule__Liste__Le2Assignment_211971);
            ruleLExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListeAccess().getLe2LExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Liste__Le2Assignment_2"


    // $ANTLR start "rule__Hd__Le3Assignment_3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5970:1: rule__Hd__Le3Assignment_3 : ( ruleExpr ) ;
    public final void rule__Hd__Le3Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5974:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5975:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5975:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5976:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getLe3ExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Hd__Le3Assignment_312002);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHdAccess().getLe3ExprParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hd__Le3Assignment_3"


    // $ANTLR start "rule__Tl__Le4Assignment_3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5985:1: rule__Tl__Le4Assignment_3 : ( ruleExpr ) ;
    public final void rule__Tl__Le4Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5989:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5990:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5990:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5991:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getLe4ExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Tl__Le4Assignment_312033);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTlAccess().getLe4ExprParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tl__Le4Assignment_3"


    // $ANTLR start "rule__SymboleEx__PAssignment_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6000:1: rule__SymboleEx__PAssignment_1 : ( RULE_SYM ) ;
    public final void rule__SymboleEx__PAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6004:1: ( ( RULE_SYM ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6005:1: ( RULE_SYM )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6005:1: ( RULE_SYM )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getPSYMTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__SymboleEx__PAssignment_112064); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymboleExAccess().getPSYMTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymboleEx__PAssignment_1"


    // $ANTLR start "rule__SymboleEx__Le5Assignment_2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6015:1: rule__SymboleEx__Le5Assignment_2 : ( ruleLExpr ) ;
    public final void rule__SymboleEx__Le5Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6019:1: ( ( ruleLExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6020:1: ( ruleLExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6020:1: ( ruleLExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6021:1: ruleLExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getLe5LExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_rule__SymboleEx__Le5Assignment_212095);
            ruleLExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymboleExAccess().getLe5LExprParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymboleEx__Le5Assignment_2"


    // $ANTLR start "rule__LExpr__ExpLeAssignment_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6030:1: rule__LExpr__ExpLeAssignment_1 : ( ruleExpr ) ;
    public final void rule__LExpr__ExpLeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6034:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6035:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6035:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6036:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getExpLeExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__LExpr__ExpLeAssignment_112126);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExprAccess().getExpLeExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LExpr__ExpLeAssignment_1"


    // $ANTLR start "rule__ExprAnd__ExpOAssignment_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6045:1: rule__ExprAnd__ExpOAssignment_0 : ( ruleExprOr ) ;
    public final void rule__ExprAnd__ExpOAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6049:1: ( ( ruleExprOr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6050:1: ( ruleExprOr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6050:1: ( ruleExprOr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6051:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExpOExprOrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprAnd__ExpOAssignment_012157);
            ruleExprOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExpOExprOrParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__ExpOAssignment_0"


    // $ANTLR start "rule__ExprAnd__ExpO2Assignment_1_3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6060:1: rule__ExprAnd__ExpO2Assignment_1_3 : ( ruleExprOr ) ;
    public final void rule__ExprAnd__ExpO2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6064:1: ( ( ruleExprOr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6065:1: ( ruleExprOr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6065:1: ( ruleExprOr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6066:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExpO2ExprOrParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprAnd__ExpO2Assignment_1_312188);
            ruleExprOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExpO2ExprOrParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__ExpO2Assignment_1_3"


    // $ANTLR start "rule__ExprOr__ExpNAssignment_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6075:1: rule__ExprOr__ExpNAssignment_0 : ( ruleExprNot ) ;
    public final void rule__ExprOr__ExpNAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6079:1: ( ( ruleExprNot ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6080:1: ( ruleExprNot )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6080:1: ( ruleExprNot )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6081:1: ruleExprNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExpNExprNotParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_rule__ExprOr__ExpNAssignment_012219);
            ruleExprNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExpNExprNotParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__ExpNAssignment_0"


    // $ANTLR start "rule__ExprOr__ExpN2Assignment_1_3"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6090:1: rule__ExprOr__ExpN2Assignment_1_3 : ( ruleExprNot ) ;
    public final void rule__ExprOr__ExpN2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6094:1: ( ( ruleExprNot ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6095:1: ( ruleExprNot )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6095:1: ( ruleExprNot )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6096:1: ruleExprNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExpN2ExprNotParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_rule__ExprOr__ExpN2Assignment_1_312250);
            ruleExprNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExpN2ExprNotParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__ExpN2Assignment_1_3"


    // $ANTLR start "rule__ExprNot__ExpEqAssignment_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6105:1: rule__ExprNot__ExpEqAssignment_1 : ( ruleExprEq ) ;
    public final void rule__ExprNot__ExpEqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6109:1: ( ( ruleExprEq ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6110:1: ( ruleExprEq )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6110:1: ( ruleExprEq )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6111:1: ruleExprEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExpEqExprEqParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_rule__ExprNot__ExpEqAssignment_112281);
            ruleExprEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getExpEqExprEqParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__ExpEqAssignment_1"


    // $ANTLR start "rule__ExprEq__ExpS1Assignment_0_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6120:1: rule__ExprEq__ExpS1Assignment_0_0 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExpS1Assignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6124:1: ( ( ruleExprSimple ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6125:1: ( ruleExprSimple )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6125:1: ( ruleExprSimple )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6126:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpS1ExprSimpleParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExpS1Assignment_0_012312);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExpS1ExprSimpleParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__ExpS1Assignment_0_0"


    // $ANTLR start "rule__ExprEq__ExpS2Assignment_0_2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6135:1: rule__ExprEq__ExpS2Assignment_0_2 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExpS2Assignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6139:1: ( ( ruleExprSimple ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6140:1: ( ruleExprSimple )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6140:1: ( ruleExprSimple )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6141:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpS2ExprSimpleParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExpS2Assignment_0_212343);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExpS2ExprSimpleParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__ExpS2Assignment_0_2"


    // $ANTLR start "rule__ExprEq__ExpRAssignment_1_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6150:1: rule__ExprEq__ExpRAssignment_1_1 : ( ruleExpr ) ;
    public final void rule__ExprEq__ExpRAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6154:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6155:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6155:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6156:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpRExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprEq__ExpRAssignment_1_112374);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExpRExprParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__ExpRAssignment_1_1"

    // $ANTLR start synpred8_InternalMyDsl
    public final void synpred8_InternalMyDsl_fragment() throws RecognitionException {   
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: ( ( ( rule__Expr__ExpAAssignment_0 ) ) )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: ( ( rule__Expr__ExpAAssignment_0 ) )
        {
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: ( ( rule__Expr__ExpAAssignment_0 ) )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:876:1: ( rule__Expr__ExpAAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getExpAAssignment_0()); 
        }
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:877:1: ( rule__Expr__ExpAAssignment_0 )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:877:2: rule__Expr__ExpAAssignment_0
        {
        pushFollow(FOLLOW_rule__Expr__ExpAAssignment_0_in_synpred8_InternalMyDsl1837);
        rule__Expr__ExpAAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalMyDsl

    // $ANTLR start synpred16_InternalMyDsl
    public final void synpred16_InternalMyDsl_fragment() throws RecognitionException {   
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( ( ( rule__ExprEq__Group_0__0 ) ) )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( ( rule__ExprEq__Group_0__0 ) )
        {
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( ( rule__ExprEq__Group_0__0 ) )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: ( rule__ExprEq__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprEqAccess().getGroup_0()); 
        }
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:957:1: ( rule__ExprEq__Group_0__0 )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:957:2: rule__ExprEq__Group_0__0
        {
        pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_synpred16_InternalMyDsl2047);
        rule__ExprEq__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalMyDsl

    // Delegated rules

    public final boolean synpred16_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\12\uffff";
    static final String DFA5_eofS =
        "\12\uffff";
    static final String DFA5_minS =
        "\1\10\3\uffff\1\12\5\uffff";
    static final String DFA5_maxS =
        "\1\57\3\uffff\1\51\5\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\7\1\10\1\6\1\5";
    static final String DFA5_specialS =
        "\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\4\1\uffff\1\3\1\2\43\uffff\1\1",
            "",
            "",
            "",
            "\1\7\33\uffff\1\5\1\11\1\10\1\6",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "892:1: rule__ExprSimple__Alternatives : ( ( ( rule__ExprSimple__Group_0__0 ) ) | ( ( rule__ExprSimple__VariableAssignment_1 ) ) | ( ( rule__ExprSimple__SymboleAssignment_2 ) ) | ( ( rule__ExprSimple__ConsAssignment_3 ) ) | ( ( rule__ExprSimple__ListeAssignment_4 ) ) | ( ( rule__ExprSimple__HdAssignment_5 ) ) | ( ( rule__ExprSimple__TlAssignment_6 ) ) | ( ( rule__ExprSimple__SymbolExAssignment_7 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ProgrammeAssignment_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgramme_in_entryRuleProgramme127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgramme134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__Group__0_in_ruleProgramme160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFonction_in_entryRuleFonction187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFonction194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__0_in_ruleFonction220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0_in_ruleInput280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0_in_ruleOutput340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_entryRuleCommandes367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandes374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group__0_in_ruleCommandes400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommande_in_entryRuleCommande427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommande434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__Alternatives_in_ruleCommande460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectVar_in_entryRuleAffectVar487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectVar494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__0_in_ruleAffectVar520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0_in_ruleWhile580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0_in_ruleFor640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0_in_ruleIf700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_entryRuleForeach727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeach734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__0_in_ruleForeach760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0_in_ruleVars820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0_in_ruleExprs880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Alternatives_in_ruleExpr940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_in_ruleExprSimple1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCons_in_entryRuleCons1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCons1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__0_in_ruleCons1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListe_in_entryRuleListe1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListe1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Group__0_in_ruleListe1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHd_in_entryRuleHd1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHd1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__0_in_ruleHd1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTl_in_entryRuleTl1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTl1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__0_in_ruleTl1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymboleEx_in_entryRuleSymboleEx1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymboleEx1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__0_in_ruleSymboleEx1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_entryRuleLExpr1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLExpr1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr__Group__0_in_ruleLExpr1362 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__LExpr__Group__0_in_ruleLExpr1374 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd1404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__0_in_ruleExprAnd1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr1464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__0_in_ruleExprOr1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_entryRuleExprNot1524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNot1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__0_in_ruleExprNot1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_entryRuleExprEq1584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEq1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Alternatives_in_ruleExprEq1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_entryRuleLC1644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLC1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LC__Alternatives_in_ruleLC1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__Group_0__0_in_rule__Commande__Alternatives1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__AffectVarAssignment_1_in_rule__Commande__Alternatives1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__WhileCAssignment_2_in_rule__Commande__Alternatives1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__ForCAssignment_3_in_rule__Commande__Alternatives1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__IfCAssignment_4_in_rule__Commande__Alternatives1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__ForeachCAssignment_5_in_rule__Commande__Alternatives1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpAAssignment_0_in_rule__Expr__Alternatives1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpSAssignment_1_in_rule__Expr__Alternatives1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_0__0_in_rule__ExprSimple__Alternatives1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__VariableAssignment_1_in_rule__ExprSimple__Alternatives1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymboleAssignment_2_in_rule__ExprSimple__Alternatives1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ConsAssignment_3_in_rule__ExprSimple__Alternatives1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ListeAssignment_4_in_rule__ExprSimple__Alternatives1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__HdAssignment_5_in_rule__ExprSimple__Alternatives1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__TlAssignment_6_in_rule__ExprSimple__Alternatives1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymbolExAssignment_7_in_rule__ExprSimple__Alternatives2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_rule__LC__Alternatives2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_rule__LC__Alternatives2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAB_in_rule__LC__Alternatives2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__LC__Alternatives2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__Group__0__Impl_in_rule__Programme__Group__02179 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Programme__Group__1_in_rule__Programme__Group__02182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__Group__1__Impl_in_rule__Programme__Group__12240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__Group_1__0_in_rule__Programme__Group__1__Impl2267 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Programme__Group_1__0__Impl_in_rule__Programme__Group_1__02302 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Programme__Group_1__1_in_rule__Programme__Group_1__02305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__FonctAssignment_1_0_in_rule__Programme__Group_1__0__Impl2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__Group_1__1__Impl_in_rule__Programme__Group_1__12362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_rule__Programme__Group_1__1__Impl2390 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Fonction__Group__0__Impl_in_rule__Fonction__Group__02425 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Fonction__Group__1_in_rule__Fonction__Group__02428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Fonction__Group__0__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__1__Impl_in_rule__Fonction__Group__12487 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Fonction__Group__2_in_rule__Fonction__Group__12490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Fonction__Group__1__Impl2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__2__Impl_in_rule__Fonction__Group__22546 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__3_in_rule__Fonction__Group__22549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__SymboleAssignment_2_in_rule__Fonction__Group__2__Impl2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__3__Impl_in_rule__Fonction__Group__32606 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Fonction__Group__4_in_rule__Fonction__Group__32609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Fonction__Group__3__Impl2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__4__Impl_in_rule__Fonction__Group__42668 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__5_in_rule__Fonction__Group__42671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Fonction__Group__4__Impl2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__5__Impl_in_rule__Fonction__Group__52727 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Fonction__Group__6_in_rule__Fonction__Group__52730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Fonction__Group__5__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__6__Impl_in_rule__Fonction__Group__62789 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Fonction__Group__7_in_rule__Fonction__Group__62792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Fonction__Group__6__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__7__Impl_in_rule__Fonction__Group__72848 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__8_in_rule__Fonction__Group__72851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__InAssignment_7_in_rule__Fonction__Group__7__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__8__Impl_in_rule__Fonction__Group__82908 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__Fonction__Group__9_in_rule__Fonction__Group__82911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Fonction__Group__8__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__9__Impl_in_rule__Fonction__Group__92970 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__10_in_rule__Fonction__Group__92973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__ComAssignment_9_in_rule__Fonction__Group__9__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__10__Impl_in_rule__Fonction__Group__103030 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__11_in_rule__Fonction__Group__103033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Fonction__Group__10__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__11__Impl_in_rule__Fonction__Group__113092 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Fonction__Group__12_in_rule__Fonction__Group__113095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Fonction__Group__11__Impl3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__12__Impl_in_rule__Fonction__Group__123154 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Fonction__Group__13_in_rule__Fonction__Group__123157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Fonction__Group__12__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__13__Impl_in_rule__Fonction__Group__133213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__OutAssignment_13_in_rule__Fonction__Group__13__Impl3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__03298 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__03301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Var1Assignment_0_in_rule__Input__Group__0__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__13358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3385 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03420 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Input__Group_1__0__Impl3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Var2Assignment_1_1_in_rule__Input__Group_1__1__Impl3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03543 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Var1Assignment_0_in_rule__Output__Group__0__Impl3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3630 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03665 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Output__Group_1__0__Impl3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__13727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Var2Assignment_1_1_in_rule__Output__Group_1__1__Impl3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group__0__Impl_in_rule__Commandes__Group__03788 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Commandes__Group__1_in_rule__Commandes__Group__03791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Com1Assignment_0_in_rule__Commandes__Group__0__Impl3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group__1__Impl_in_rule__Commandes__Group__13848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group_1__0_in_rule__Commandes__Group__1__Impl3875 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group_1__0__Impl_in_rule__Commandes__Group_1__03910 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__Commandes__Group_1__1_in_rule__Commandes__Group_1__03913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Commandes__Group_1__0__Impl3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group_1__1__Impl_in_rule__Commandes__Group_1__13972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Com2Assignment_1_1_in_rule__Commandes__Group_1__1__Impl3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__Group_0__0__Impl_in_rule__Commande__Group_0__04033 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Commande__Group_0__1_in_rule__Commande__Group_0__04036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__Group_0__1__Impl_in_rule__Commande__Group_0__14094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__NopAssignment_0_1_in_rule__Commande__Group_0__1__Impl4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__0__Impl_in_rule__AffectVar__Group__04155 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__1_in_rule__AffectVar__Group__04158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__Var1Assignment_0_in_rule__AffectVar__Group__0__Impl4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__1__Impl_in_rule__AffectVar__Group__14215 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__2_in_rule__AffectVar__Group__14218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AffectVar__Group__1__Impl4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__2__Impl_in_rule__AffectVar__Group__24277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__ExpAssignment_2_in_rule__AffectVar__Group__2__Impl4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04340 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__04343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__While__Group__0__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14402 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__14405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__1__Impl4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24461 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__24464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Exp2Assignment_2_in_rule__While__Group__2__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34521 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__34524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__3__Impl4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44580 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__5_in_rule__While__Group__44583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__While__Group__4__Impl4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__5__Impl_in_rule__While__Group__54642 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__While__Group__6_in_rule__While__Group__54645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__5__Impl4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__6__Impl_in_rule__While__Group__64701 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__7_in_rule__While__Group__64704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Com3Assignment_6_in_rule__While__Group__6__Impl4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__7__Impl_in_rule__While__Group__74761 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__While__Group__8_in_rule__While__Group__74764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__7__Impl4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__8__Impl_in_rule__While__Group__84820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__While__Group__8__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__04897 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__1_in_rule__For__Group__04900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__For__Group__0__Impl4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__14959 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__For__Group__2_in_rule__For__Group__14962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__1__Impl4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__25018 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__3_in_rule__For__Group__25021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Exp3Assignment_2_in_rule__For__Group__2__Impl5048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__35078 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__For__Group__4_in_rule__For__Group__35081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__3__Impl5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__45137 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__5_in_rule__For__Group__45140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__For__Group__4__Impl5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__55199 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__For__Group__6_in_rule__For__Group__55202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__5__Impl5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__65258 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__7_in_rule__For__Group__65261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Com4Assignment_6_in_rule__For__Group__6__Impl5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__75318 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__For__Group__8_in_rule__For__Group__75321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__7__Impl5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__85377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__For__Group__8__Impl5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__05454 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__05457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__If__Group__0__Impl5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__15516 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__15519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__1__Impl5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__25575 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__25578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Exp4Assignment_2_in_rule__If__Group__2__Impl5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__35635 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__35638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__3__Impl5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__45694 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__5_in_rule__If__Group__45697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__If__Group__4__Impl5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__55756 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__If__Group__6_in_rule__If__Group__55759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__5__Impl5786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__65815 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__7_in_rule__If__Group__65818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Com5Assignment_6_in_rule__If__Group__6__Impl5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__75875 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__If__Group__8_in_rule__If__Group__75878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__7__Impl5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__85934 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__If__Group__9_in_rule__If__Group__85937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__0_in_rule__If__Group__8__Impl5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__9__Impl_in_rule__If__Group__95995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__If__Group__9__Impl6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__0__Impl_in_rule__If__Group_8__06074 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group_8__1_in_rule__If__Group_8__06077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__If__Group_8__0__Impl6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__1__Impl_in_rule__If__Group_8__16136 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__If__Group_8__2_in_rule__If__Group_8__16139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group_8__1__Impl6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__2__Impl_in_rule__If__Group_8__26195 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group_8__3_in_rule__If__Group_8__26198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Com6Assignment_8_2_in_rule__If__Group_8__2__Impl6225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__3__Impl_in_rule__If__Group_8__36255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group_8__3__Impl6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__0__Impl_in_rule__Foreach__Group__06319 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__1_in_rule__Foreach__Group__06322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Foreach__Group__0__Impl6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__1__Impl_in_rule__Foreach__Group__16381 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Foreach__Group__2_in_rule__Foreach__Group__16384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__1__Impl6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__2__Impl_in_rule__Foreach__Group__26440 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__3_in_rule__Foreach__Group__26443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Exp5Assignment_2_in_rule__Foreach__Group__2__Impl6470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__3__Impl_in_rule__Foreach__Group__36500 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__4_in_rule__Foreach__Group__36503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__3__Impl6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__4__Impl_in_rule__Foreach__Group__46559 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__5_in_rule__Foreach__Group__46562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Foreach__Group__4__Impl6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__5__Impl_in_rule__Foreach__Group__56621 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Foreach__Group__6_in_rule__Foreach__Group__56624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__5__Impl6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__6__Impl_in_rule__Foreach__Group__66680 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__7_in_rule__Foreach__Group__66683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Exp6Assignment_6_in_rule__Foreach__Group__6__Impl6710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__7__Impl_in_rule__Foreach__Group__76740 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__8_in_rule__Foreach__Group__76743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__7__Impl6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__8__Impl_in_rule__Foreach__Group__86799 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__9_in_rule__Foreach__Group__86802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Foreach__Group__8__Impl6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__9__Impl_in_rule__Foreach__Group__96861 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__Foreach__Group__10_in_rule__Foreach__Group__96864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__9__Impl6891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__10__Impl_in_rule__Foreach__Group__106920 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__11_in_rule__Foreach__Group__106923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Com7Assignment_10_in_rule__Foreach__Group__10__Impl6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__11__Impl_in_rule__Foreach__Group__116980 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__12_in_rule__Foreach__Group__116983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__11__Impl7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__12__Impl_in_rule__Foreach__Group__127039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Foreach__Group__12__Impl7067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__07124 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__07127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Var2Assignment_0_in_rule__Vars__Group__0__Impl7154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__17184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl7211 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__07246 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__07249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Vars__Group_1__0__Impl7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__17308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Var3Assignment_1_1_in_rule__Vars__Group_1__1__Impl7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__07369 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__07372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExprSAssignment_0_in_rule__Exprs__Group__0__Impl7399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__17429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl7456 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__07491 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__07494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Exprs__Group_1__0__Impl7522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__17553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExprS2Assignment_1_1_in_rule__Exprs__Group_1__1__Impl7580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_0__0__Impl_in_rule__ExprSimple__Group_0__07614 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_0__1_in_rule__ExprSimple__Group_0__07617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_0__1__Impl_in_rule__ExprSimple__Group_0__17675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__VideAssignment_0_1_in_rule__ExprSimple__Group_0__1__Impl7702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__0__Impl_in_rule__Cons__Group__07736 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Cons__Group__1_in_rule__Cons__Group__07739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__Cons__Group__0__Impl7766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__1__Impl_in_rule__Cons__Group__17795 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Cons__Group__2_in_rule__Cons__Group__17798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Cons__Group__1__Impl7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__2__Impl_in_rule__Cons__Group__27857 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Cons__Group__3_in_rule__Cons__Group__27860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Le1Assignment_2_in_rule__Cons__Group__2__Impl7887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__3__Impl_in_rule__Cons__Group__37917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__Cons__Group__3__Impl7944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Group__0__Impl_in_rule__Liste__Group__07981 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Liste__Group__1_in_rule__Liste__Group__07984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__Liste__Group__0__Impl8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Group__1__Impl_in_rule__Liste__Group__18040 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Liste__Group__2_in_rule__Liste__Group__18043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Liste__Group__1__Impl8071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Group__2__Impl_in_rule__Liste__Group__28102 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Liste__Group__3_in_rule__Liste__Group__28105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Le2Assignment_2_in_rule__Liste__Group__2__Impl8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Group__3__Impl_in_rule__Liste__Group__38162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__Liste__Group__3__Impl8189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__0__Impl_in_rule__Hd__Group__08226 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Hd__Group__1_in_rule__Hd__Group__08229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__Hd__Group__0__Impl8256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__1__Impl_in_rule__Hd__Group__18285 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Hd__Group__2_in_rule__Hd__Group__18288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Hd__Group__1__Impl8316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__2__Impl_in_rule__Hd__Group__28347 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Hd__Group__3_in_rule__Hd__Group__28350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Hd__Group__2__Impl8377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__3__Impl_in_rule__Hd__Group__38406 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Hd__Group__4_in_rule__Hd__Group__38409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Le3Assignment_3_in_rule__Hd__Group__3__Impl8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__4__Impl_in_rule__Hd__Group__48466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__Hd__Group__4__Impl8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__0__Impl_in_rule__Tl__Group__08532 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Tl__Group__1_in_rule__Tl__Group__08535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__Tl__Group__0__Impl8562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__1__Impl_in_rule__Tl__Group__18591 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Tl__Group__2_in_rule__Tl__Group__18594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Tl__Group__1__Impl8622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__2__Impl_in_rule__Tl__Group__28653 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Tl__Group__3_in_rule__Tl__Group__28656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Tl__Group__2__Impl8683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__3__Impl_in_rule__Tl__Group__38712 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Tl__Group__4_in_rule__Tl__Group__38715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Le4Assignment_3_in_rule__Tl__Group__3__Impl8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__4__Impl_in_rule__Tl__Group__48772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__Tl__Group__4__Impl8799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__0__Impl_in_rule__SymboleEx__Group__08838 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__1_in_rule__SymboleEx__Group__08841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__SymboleEx__Group__0__Impl8868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__1__Impl_in_rule__SymboleEx__Group__18897 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__2_in_rule__SymboleEx__Group__18900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__PAssignment_1_in_rule__SymboleEx__Group__1__Impl8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__2__Impl_in_rule__SymboleEx__Group__28957 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__3_in_rule__SymboleEx__Group__28960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Le5Assignment_2_in_rule__SymboleEx__Group__2__Impl8987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__3__Impl_in_rule__SymboleEx__Group__39017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__SymboleEx__Group__3__Impl9044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr__Group__0__Impl_in_rule__LExpr__Group__09081 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__LExpr__Group__1_in_rule__LExpr__Group__09084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__LExpr__Group__0__Impl9111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr__Group__1__Impl_in_rule__LExpr__Group__19140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr__ExpLeAssignment_1_in_rule__LExpr__Group__1__Impl9167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__09201 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__09204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExpOAssignment_0_in_rule__ExprAnd__Group__0__Impl9231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__19261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl9288 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__09323 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__09326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__0__Impl9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__19382 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__2_in_rule__ExprAnd__Group_1__19385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ExprAnd__Group_1__1__Impl9413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__2__Impl_in_rule__ExprAnd__Group_1__29444 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__3_in_rule__ExprAnd__Group_1__29447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__2__Impl9474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__3__Impl_in_rule__ExprAnd__Group_1__39503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExpO2Assignment_1_3_in_rule__ExprAnd__Group_1__3__Impl9530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__09568 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__09571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExpNAssignment_0_in_rule__ExprOr__Group__0__Impl9598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__19628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl9655 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__09690 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__09693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprOr__Group_1__0__Impl9720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__19749 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__2_in_rule__ExprOr__Group_1__19752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExprOr__Group_1__1__Impl9780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__2__Impl_in_rule__ExprOr__Group_1__29811 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__3_in_rule__ExprOr__Group_1__29814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprOr__Group_1__2__Impl9841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__3__Impl_in_rule__ExprOr__Group_1__39870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExpN2Assignment_1_3_in_rule__ExprOr__Group_1__3__Impl9897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__0__Impl_in_rule__ExprNot__Group__09935 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__1_in_rule__ExprNot__Group__09938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group_0__0_in_rule__ExprNot__Group__0__Impl9965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__1__Impl_in_rule__ExprNot__Group__19996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__ExpEqAssignment_1_in_rule__ExprNot__Group__1__Impl10023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group_0__0__Impl_in_rule__ExprNot__Group_0__010057 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprNot__Group_0__1_in_rule__ExprNot__Group_0__010060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ExprNot__Group_0__0__Impl10088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group_0__1__Impl_in_rule__ExprNot__Group_0__110119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprNot__Group_0__1__Impl10146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__010179 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__010182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExpS1Assignment_0_0_in_rule__ExprEq__Group_0__0__Impl10209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__110239 = new BitSet(new long[]{0x0000800000000D00L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__110242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ExprEq__Group_0__1__Impl10270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__210301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExpS2Assignment_0_2_in_rule__ExprEq__Group_0__2__Impl10328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__010364 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__010367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__ExprEq__Group_1__0__Impl10394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__110423 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__110426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExpRAssignment_1_1_in_rule__ExprEq__Group_1__1__Impl10453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__210483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__ExprEq__Group_1__2__Impl10510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgramme_in_rule__Model__ProgrammeAssignment10550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFonction_in_rule__Programme__FonctAssignment_1_010581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__Fonction__SymboleAssignment_210612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Fonction__InAssignment_710643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__Fonction__ComAssignment_910674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Fonction__OutAssignment_1310705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Input__Var1Assignment_010736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Input__Var2Assignment_1_110767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Output__Var1Assignment_010798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Output__Var2Assignment_1_110829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommande_in_rule__Commandes__Com1Assignment_010860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommande_in_rule__Commandes__Com2Assignment_1_110891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Commande__NopAssignment_0_110927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectVar_in_rule__Commande__AffectVarAssignment_110966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__Commande__WhileCAssignment_210997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_rule__Commande__ForCAssignment_311028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__Commande__IfCAssignment_411059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_rule__Commande__ForeachCAssignment_511090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__AffectVar__Var1Assignment_011121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__AffectVar__ExpAssignment_211152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__While__Exp2Assignment_211183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__While__Com3Assignment_611214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__For__Exp3Assignment_211245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__For__Com4Assignment_611276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__If__Exp4Assignment_211307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__If__Com5Assignment_611338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__If__Com6Assignment_8_211369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Foreach__Exp5Assignment_211400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Foreach__Exp6Assignment_611431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__Foreach__Com7Assignment_1011462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Vars__Var2Assignment_011493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Vars__Var3Assignment_1_111524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExprSAssignment_011555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExprS2Assignment_1_111586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_rule__Expr__ExpAAssignment_011617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Expr__ExpSAssignment_111648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ExprSimple__VideAssignment_0_111684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__ExprSimple__VariableAssignment_111723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__ExprSimple__SymboleAssignment_211754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCons_in_rule__ExprSimple__ConsAssignment_311785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListe_in_rule__ExprSimple__ListeAssignment_411816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHd_in_rule__ExprSimple__HdAssignment_511847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTl_in_rule__ExprSimple__TlAssignment_611878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymboleEx_in_rule__ExprSimple__SymbolExAssignment_711909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_rule__Cons__Le1Assignment_211940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_rule__Liste__Le2Assignment_211971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Hd__Le3Assignment_312002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Tl__Le4Assignment_312033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__SymboleEx__PAssignment_112064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_rule__SymboleEx__Le5Assignment_212095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__LExpr__ExpLeAssignment_112126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprAnd__ExpOAssignment_012157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprAnd__ExpO2Assignment_1_312188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_rule__ExprOr__ExpNAssignment_012219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_rule__ExprOr__ExpN2Assignment_1_312250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_rule__ExprNot__ExpEqAssignment_112281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExpS1Assignment_0_012312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExpS2Assignment_0_212343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprEq__ExpRAssignment_1_112374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpAAssignment_0_in_synpred8_InternalMyDsl1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_synpred16_InternalMyDsl2047 = new BitSet(new long[]{0x0000000000000002L});

}