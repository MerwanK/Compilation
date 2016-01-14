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


    // $ANTLR start "entryRuleLExpr2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:684:1: entryRuleLExpr2 : ruleLExpr2 EOF ;
    public final void entryRuleLExpr2() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:685:1: ( ruleLExpr2 EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: ruleLExpr2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExpr2Rule()); 
            }
            pushFollow(FOLLOW_ruleLExpr2_in_entryRuleLExpr21404);
            ruleLExpr2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExpr2Rule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLExpr21411); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLExpr2"


    // $ANTLR start "ruleLExpr2"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ruleLExpr2 : ( ( ( rule__LExpr2__Group__0 ) ) ( ( rule__LExpr2__Group__0 )* ) ) ;
    public final void ruleLExpr2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:697:2: ( ( ( ( rule__LExpr2__Group__0 ) ) ( ( rule__LExpr2__Group__0 )* ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: ( ( ( rule__LExpr2__Group__0 ) ) ( ( rule__LExpr2__Group__0 )* ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: ( ( ( rule__LExpr2__Group__0 ) ) ( ( rule__LExpr2__Group__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:699:1: ( ( rule__LExpr2__Group__0 ) ) ( ( rule__LExpr2__Group__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:699:1: ( ( rule__LExpr2__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: ( rule__LExpr2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExpr2Access().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:701:1: ( rule__LExpr2__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:701:2: rule__LExpr2__Group__0
            {
            pushFollow(FOLLOW_rule__LExpr2__Group__0_in_ruleLExpr21439);
            rule__LExpr2__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExpr2Access().getGroup()); 
            }

            }

            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: ( ( rule__LExpr2__Group__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: ( rule__LExpr2__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExpr2Access().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ( rule__LExpr2__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_SP && LA2_0<=RULE_PARAG)||(LA2_0>=RULE_SYM && LA2_0<=RULE_VAR)||LA2_0==44||LA2_0==47) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:2: rule__LExpr2__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__LExpr2__Group__0_in_ruleLExpr21451);
            	    rule__LExpr2__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExpr2Access().getGroup()); 
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
    // $ANTLR end "ruleLExpr2"


    // $ANTLR start "entryRuleExprAnd"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: entryRuleExprAnd : ruleExprAnd EOF ;
    public final void entryRuleExprAnd() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( ruleExprAnd EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd1481);
            ruleExprAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd1488); if (state.failed) return ;

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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: ruleExprAnd : ( ( rule__ExprAnd__Group__0 ) ) ;
    public final void ruleExprAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:732:2: ( ( ( rule__ExprAnd__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( ( rule__ExprAnd__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( ( rule__ExprAnd__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ( rule__ExprAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ( rule__ExprAnd__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:735:2: rule__ExprAnd__Group__0
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__0_in_ruleExprAnd1514);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: entryRuleExprOr : ruleExprOr EOF ;
    public final void entryRuleExprOr() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( ruleExprOr EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr1541);
            ruleExprOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr1548); if (state.failed) return ;

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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: ruleExprOr : ( ( rule__ExprOr__Group__0 ) ) ;
    public final void ruleExprOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:760:2: ( ( ( rule__ExprOr__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( ( rule__ExprOr__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( ( rule__ExprOr__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ( rule__ExprOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: ( rule__ExprOr__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:763:2: rule__ExprOr__Group__0
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__0_in_ruleExprOr1574);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: entryRuleExprNot : ruleExprNot EOF ;
    public final void entryRuleExprNot() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( ruleExprNot EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:777:1: ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_entryRuleExprNot1601);
            ruleExprNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNot1608); if (state.failed) return ;

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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: ruleExprNot : ( ( rule__ExprNot__Alternatives ) ) ;
    public final void ruleExprNot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:788:2: ( ( ( rule__ExprNot__Alternatives ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( ( rule__ExprNot__Alternatives ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( ( rule__ExprNot__Alternatives ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( rule__ExprNot__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getAlternatives()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: ( rule__ExprNot__Alternatives )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:791:2: rule__ExprNot__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprNot__Alternatives_in_ruleExprNot1634);
            rule__ExprNot__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getAlternatives()); 
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


    // $ANTLR start "entryRuleExprNotNot"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: entryRuleExprNotNot : ruleExprNotNot EOF ;
    public final void entryRuleExprNotNot() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ( ruleExprNotNot EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:805:1: ruleExprNotNot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotNotRule()); 
            }
            pushFollow(FOLLOW_ruleExprNotNot_in_entryRuleExprNotNot1661);
            ruleExprNotNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotNotRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNotNot1668); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExprNotNot"


    // $ANTLR start "ruleExprNotNot"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:812:1: ruleExprNotNot : ( ( rule__ExprNotNot__Group__0 ) ) ;
    public final void ruleExprNotNot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:816:2: ( ( ( rule__ExprNotNot__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: ( ( rule__ExprNotNot__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: ( ( rule__ExprNotNot__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: ( rule__ExprNotNot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotNotAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:819:1: ( rule__ExprNotNot__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:819:2: rule__ExprNotNot__Group__0
            {
            pushFollow(FOLLOW_rule__ExprNotNot__Group__0_in_ruleExprNotNot1694);
            rule__ExprNotNot__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotNotAccess().getGroup()); 
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
    // $ANTLR end "ruleExprNotNot"


    // $ANTLR start "entryRuleExprNotDo"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: entryRuleExprNotDo : ruleExprNotDo EOF ;
    public final void entryRuleExprNotDo() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( ruleExprNotDo EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ruleExprNotDo EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotDoRule()); 
            }
            pushFollow(FOLLOW_ruleExprNotDo_in_entryRuleExprNotDo1721);
            ruleExprNotDo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotDoRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNotDo1728); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExprNotDo"


    // $ANTLR start "ruleExprNotDo"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ruleExprNotDo : ( ( rule__ExprNotDo__ExpEq2Assignment ) ) ;
    public final void ruleExprNotDo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:844:2: ( ( ( rule__ExprNotDo__ExpEq2Assignment ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: ( ( rule__ExprNotDo__ExpEq2Assignment ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: ( ( rule__ExprNotDo__ExpEq2Assignment ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:846:1: ( rule__ExprNotDo__ExpEq2Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotDoAccess().getExpEq2Assignment()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: ( rule__ExprNotDo__ExpEq2Assignment )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:847:2: rule__ExprNotDo__ExpEq2Assignment
            {
            pushFollow(FOLLOW_rule__ExprNotDo__ExpEq2Assignment_in_ruleExprNotDo1754);
            rule__ExprNotDo__ExpEq2Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotDoAccess().getExpEq2Assignment()); 
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
    // $ANTLR end "ruleExprNotDo"


    // $ANTLR start "entryRuleExprEq"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: entryRuleExprEq : ruleExprEq EOF ;
    public final void entryRuleExprEq() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ( ruleExprEq EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_entryRuleExprEq1781);
            ruleExprEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEq1788); if (state.failed) return ;

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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: ruleExprEq : ( ( rule__ExprEq__Alternatives ) ) ;
    public final void ruleExprEq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:872:2: ( ( ( rule__ExprEq__Alternatives ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: ( ( rule__ExprEq__Alternatives ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: ( ( rule__ExprEq__Alternatives ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: ( rule__ExprEq__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getAlternatives()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: ( rule__ExprEq__Alternatives )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:2: rule__ExprEq__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprEq__Alternatives_in_ruleExprEq1814);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: entryRuleLC : ruleLC EOF ;
    public final void entryRuleLC() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( ruleLC EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:889:1: ruleLC EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCRule()); 
            }
            pushFollow(FOLLOW_ruleLC_in_entryRuleLC1841);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLC1848); if (state.failed) return ;

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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: ruleLC : ( ( rule__LC__Alternatives )* ) ;
    public final void ruleLC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:900:2: ( ( ( rule__LC__Alternatives )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: ( ( rule__LC__Alternatives )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: ( ( rule__LC__Alternatives )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ( rule__LC__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCAccess().getAlternatives()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:903:1: ( rule__LC__Alternatives )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_SP && LA3_0<=RULE_LF)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:903:2: rule__LC__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__LC__Alternatives_in_ruleLC1874);
            	    rule__LC__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:915:1: rule__Commande__Alternatives : ( ( ( rule__Commande__Group_0__0 ) ) | ( ( rule__Commande__AffectVarAssignment_1 ) ) | ( ( rule__Commande__WhileCAssignment_2 ) ) | ( ( rule__Commande__ForCAssignment_3 ) ) | ( ( rule__Commande__IfCAssignment_4 ) ) | ( ( rule__Commande__ForeachCAssignment_5 ) ) );
    public final void rule__Commande__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:919:1: ( ( ( rule__Commande__Group_0__0 ) ) | ( ( rule__Commande__AffectVarAssignment_1 ) ) | ( ( rule__Commande__WhileCAssignment_2 ) ) | ( ( rule__Commande__ForCAssignment_3 ) ) | ( ( rule__Commande__IfCAssignment_4 ) ) | ( ( rule__Commande__ForeachCAssignment_5 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt4=1;
                }
                break;
            case RULE_VAR:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=5;
                }
                break;
            case 36:
                {
                alt4=6;
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:920:1: ( ( rule__Commande__Group_0__0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:920:1: ( ( rule__Commande__Group_0__0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:921:1: ( rule__Commande__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getGroup_0()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: ( rule__Commande__Group_0__0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:2: rule__Commande__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Commande__Group_0__0_in_rule__Commande__Alternatives1911);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:926:6: ( ( rule__Commande__AffectVarAssignment_1 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:926:6: ( ( rule__Commande__AffectVarAssignment_1 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:927:1: ( rule__Commande__AffectVarAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getAffectVarAssignment_1()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: ( rule__Commande__AffectVarAssignment_1 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:928:2: rule__Commande__AffectVarAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Commande__AffectVarAssignment_1_in_rule__Commande__Alternatives1929);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:6: ( ( rule__Commande__WhileCAssignment_2 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:6: ( ( rule__Commande__WhileCAssignment_2 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( rule__Commande__WhileCAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getWhileCAssignment_2()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:934:1: ( rule__Commande__WhileCAssignment_2 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:934:2: rule__Commande__WhileCAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Commande__WhileCAssignment_2_in_rule__Commande__Alternatives1947);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:938:6: ( ( rule__Commande__ForCAssignment_3 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:938:6: ( ( rule__Commande__ForCAssignment_3 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ( rule__Commande__ForCAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getForCAssignment_3()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: ( rule__Commande__ForCAssignment_3 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:940:2: rule__Commande__ForCAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Commande__ForCAssignment_3_in_rule__Commande__Alternatives1965);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:944:6: ( ( rule__Commande__IfCAssignment_4 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:944:6: ( ( rule__Commande__IfCAssignment_4 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: ( rule__Commande__IfCAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getIfCAssignment_4()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( rule__Commande__IfCAssignment_4 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:2: rule__Commande__IfCAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Commande__IfCAssignment_4_in_rule__Commande__Alternatives1983);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:950:6: ( ( rule__Commande__ForeachCAssignment_5 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:950:6: ( ( rule__Commande__ForeachCAssignment_5 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: ( rule__Commande__ForeachCAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getForeachCAssignment_5()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( rule__Commande__ForeachCAssignment_5 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:2: rule__Commande__ForeachCAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Commande__ForeachCAssignment_5_in_rule__Commande__Alternatives2001);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: rule__Expr__Alternatives : ( ( ( rule__Expr__ExpAAssignment_0 ) ) | ( ( rule__Expr__ExpSAssignment_1 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:965:1: ( ( ( rule__Expr__ExpAAssignment_0 ) ) | ( ( rule__Expr__ExpSAssignment_1 ) ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt5=1;
                }
                break;
            case 47:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred9_InternalMyDsl()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VAR:
                {
                int LA5_3 = input.LA(2);

                if ( (synpred9_InternalMyDsl()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYM:
                {
                int LA5_4 = input.LA(2);

                if ( (synpred9_InternalMyDsl()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_PARAG:
                {
                int LA5_5 = input.LA(2);

                if ( (synpred9_InternalMyDsl()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( ( rule__Expr__ExpAAssignment_0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( ( rule__Expr__ExpAAssignment_0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( rule__Expr__ExpAAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExpAAssignment_0()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: ( rule__Expr__ExpAAssignment_0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:968:2: rule__Expr__ExpAAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expr__ExpAAssignment_0_in_rule__Expr__Alternatives2034);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:972:6: ( ( rule__Expr__ExpSAssignment_1 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:972:6: ( ( rule__Expr__ExpSAssignment_1 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: ( rule__Expr__ExpSAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExpSAssignment_1()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ( rule__Expr__ExpSAssignment_1 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:2: rule__Expr__ExpSAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expr__ExpSAssignment_1_in_rule__Expr__Alternatives2052);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:983:1: rule__ExprSimple__Alternatives : ( ( ( rule__ExprSimple__Group_0__0 ) ) | ( ( rule__ExprSimple__VariableAssignment_1 ) ) | ( ( rule__ExprSimple__SymboleAssignment_2 ) ) | ( ( rule__ExprSimple__ConsAssignment_3 ) ) | ( ( rule__ExprSimple__ListeAssignment_4 ) ) | ( ( rule__ExprSimple__HdAssignment_5 ) ) | ( ( rule__ExprSimple__TlAssignment_6 ) ) | ( ( rule__ExprSimple__SymbolExAssignment_7 ) ) );
    public final void rule__ExprSimple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:987:1: ( ( ( rule__ExprSimple__Group_0__0 ) ) | ( ( rule__ExprSimple__VariableAssignment_1 ) ) | ( ( rule__ExprSimple__SymboleAssignment_2 ) ) | ( ( rule__ExprSimple__ConsAssignment_3 ) ) | ( ( rule__ExprSimple__ListeAssignment_4 ) ) | ( ( rule__ExprSimple__HdAssignment_5 ) ) | ( ( rule__ExprSimple__TlAssignment_6 ) ) | ( ( rule__ExprSimple__SymbolExAssignment_7 ) ) )
            int alt6=8;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:988:1: ( ( rule__ExprSimple__Group_0__0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:988:1: ( ( rule__ExprSimple__Group_0__0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:989:1: ( rule__ExprSimple__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_0()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: ( rule__ExprSimple__Group_0__0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:990:2: rule__ExprSimple__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_0__0_in_rule__ExprSimple__Alternatives2085);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:994:6: ( ( rule__ExprSimple__VariableAssignment_1 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:994:6: ( ( rule__ExprSimple__VariableAssignment_1 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:1: ( rule__ExprSimple__VariableAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getVariableAssignment_1()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:996:1: ( rule__ExprSimple__VariableAssignment_1 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:996:2: rule__ExprSimple__VariableAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__VariableAssignment_1_in_rule__ExprSimple__Alternatives2103);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:6: ( ( rule__ExprSimple__SymboleAssignment_2 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:6: ( ( rule__ExprSimple__SymboleAssignment_2 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:1: ( rule__ExprSimple__SymboleAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getSymboleAssignment_2()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( rule__ExprSimple__SymboleAssignment_2 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:2: rule__ExprSimple__SymboleAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__SymboleAssignment_2_in_rule__ExprSimple__Alternatives2121);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:6: ( ( rule__ExprSimple__ConsAssignment_3 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:6: ( ( rule__ExprSimple__ConsAssignment_3 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: ( rule__ExprSimple__ConsAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getConsAssignment_3()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: ( rule__ExprSimple__ConsAssignment_3 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:2: rule__ExprSimple__ConsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__ConsAssignment_3_in_rule__ExprSimple__Alternatives2139);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:6: ( ( rule__ExprSimple__ListeAssignment_4 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:6: ( ( rule__ExprSimple__ListeAssignment_4 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ( rule__ExprSimple__ListeAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getListeAssignment_4()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: ( rule__ExprSimple__ListeAssignment_4 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:2: rule__ExprSimple__ListeAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__ListeAssignment_4_in_rule__ExprSimple__Alternatives2157);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:6: ( ( rule__ExprSimple__HdAssignment_5 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:6: ( ( rule__ExprSimple__HdAssignment_5 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1019:1: ( rule__ExprSimple__HdAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getHdAssignment_5()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1020:1: ( rule__ExprSimple__HdAssignment_5 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1020:2: rule__ExprSimple__HdAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__HdAssignment_5_in_rule__ExprSimple__Alternatives2175);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:6: ( ( rule__ExprSimple__TlAssignment_6 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:6: ( ( rule__ExprSimple__TlAssignment_6 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: ( rule__ExprSimple__TlAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getTlAssignment_6()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( rule__ExprSimple__TlAssignment_6 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:2: rule__ExprSimple__TlAssignment_6
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__TlAssignment_6_in_rule__ExprSimple__Alternatives2193);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:6: ( ( rule__ExprSimple__SymbolExAssignment_7 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:6: ( ( rule__ExprSimple__SymbolExAssignment_7 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:1: ( rule__ExprSimple__SymbolExAssignment_7 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getSymbolExAssignment_7()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: ( rule__ExprSimple__SymbolExAssignment_7 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:2: rule__ExprSimple__SymbolExAssignment_7
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__SymbolExAssignment_7_in_rule__ExprSimple__Alternatives2211);
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


    // $ANTLR start "rule__ExprNot__Alternatives"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: rule__ExprNot__Alternatives : ( ( ( rule__ExprNot__ExprNotNotAssignment_0 ) ) | ( ( rule__ExprNot__ExprNotDoAssignment_1 ) ) );
    public final void rule__ExprNot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: ( ( ( rule__ExprNot__ExprNotNotAssignment_0 ) ) | ( ( rule__ExprNot__ExprNotDoAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==44) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_PARAG||(LA7_0>=RULE_SYM && LA7_0<=RULE_VAR)||LA7_0==47) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: ( ( rule__ExprNot__ExprNotNotAssignment_0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: ( ( rule__ExprNot__ExprNotNotAssignment_0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:1: ( rule__ExprNot__ExprNotNotAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprNotAccess().getExprNotNotAssignment_0()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:1: ( rule__ExprNot__ExprNotNotAssignment_0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:2: rule__ExprNot__ExprNotNotAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ExprNot__ExprNotNotAssignment_0_in_rule__ExprNot__Alternatives2244);
                    rule__ExprNot__ExprNotNotAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprNotAccess().getExprNotNotAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:6: ( ( rule__ExprNot__ExprNotDoAssignment_1 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:6: ( ( rule__ExprNot__ExprNotDoAssignment_1 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:1: ( rule__ExprNot__ExprNotDoAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprNotAccess().getExprNotDoAssignment_1()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( rule__ExprNot__ExprNotDoAssignment_1 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:2: rule__ExprNot__ExprNotDoAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ExprNot__ExprNotDoAssignment_1_in_rule__ExprNot__Alternatives2262);
                    rule__ExprNot__ExprNotDoAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprNotAccess().getExprNotDoAssignment_1()); 
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
    // $ANTLR end "rule__ExprNot__Alternatives"


    // $ANTLR start "rule__ExprEq__Alternatives"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: rule__ExprEq__Alternatives : ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) );
    public final void rule__ExprEq__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_SYM && LA8_0<=RULE_VAR)||LA8_0==47) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_PARAG) ) {
                int LA8_4 = input.LA(2);

                if ( (synpred18_InternalMyDsl()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( ( rule__ExprEq__Group_0__0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( ( rule__ExprEq__Group_0__0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: ( rule__ExprEq__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_0()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: ( rule__ExprEq__Group_0__0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:2: rule__ExprEq__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives2295);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:6: ( ( rule__ExprEq__Group_1__0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:6: ( ( rule__ExprEq__Group_1__0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( rule__ExprEq__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_1()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: ( rule__ExprEq__Group_1__0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:2: rule__ExprEq__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives2313);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: rule__LC__Alternatives : ( ( RULE_SP ) | ( RULE_CR ) | ( RULE_TAB ) | ( RULE_LF ) );
    public final void rule__LC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: ( ( RULE_SP ) | ( RULE_CR ) | ( RULE_TAB ) | ( RULE_LF ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_SP:
                {
                alt9=1;
                }
                break;
            case RULE_CR:
                {
                alt9=2;
                }
                break;
            case RULE_TAB:
                {
                alt9=3;
                }
                break;
            case RULE_LF:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:1: ( RULE_SP )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:1: ( RULE_SP )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:1: RULE_SP
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getSPTerminalRuleCall_0()); 
                    }
                    match(input,RULE_SP,FOLLOW_RULE_SP_in_rule__LC__Alternatives2346); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCAccess().getSPTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:6: ( RULE_CR )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:6: ( RULE_CR )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: RULE_CR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getCRTerminalRuleCall_1()); 
                    }
                    match(input,RULE_CR,FOLLOW_RULE_CR_in_rule__LC__Alternatives2363); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCAccess().getCRTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:6: ( RULE_TAB )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:6: ( RULE_TAB )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:1: RULE_TAB
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getTABTerminalRuleCall_2()); 
                    }
                    match(input,RULE_TAB,FOLLOW_RULE_TAB_in_rule__LC__Alternatives2380); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCAccess().getTABTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:6: ( RULE_LF )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:6: ( RULE_LF )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: RULE_LF
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getLFTerminalRuleCall_3()); 
                    }
                    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__LC__Alternatives2397); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: rule__Programme__Group__0 : rule__Programme__Group__0__Impl rule__Programme__Group__1 ;
    public final void rule__Programme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1125:1: ( rule__Programme__Group__0__Impl rule__Programme__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:2: rule__Programme__Group__0__Impl rule__Programme__Group__1
            {
            pushFollow(FOLLOW_rule__Programme__Group__0__Impl_in_rule__Programme__Group__02427);
            rule__Programme__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Programme__Group__1_in_rule__Programme__Group__02430);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: rule__Programme__Group__0__Impl : ( () ) ;
    public final void rule__Programme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:1: ( ( () ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( () )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( () )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getProgrammeAction_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:1: ()
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: 
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: rule__Programme__Group__1 : rule__Programme__Group__1__Impl ;
    public final void rule__Programme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: ( rule__Programme__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:2: rule__Programme__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Programme__Group__1__Impl_in_rule__Programme__Group__12488);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:1: rule__Programme__Group__1__Impl : ( ( rule__Programme__Group_1__0 )* ) ;
    public final void rule__Programme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: ( ( ( rule__Programme__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: ( ( rule__Programme__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: ( ( rule__Programme__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: ( rule__Programme__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: ( rule__Programme__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:2: rule__Programme__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Programme__Group_1__0_in_rule__Programme__Group__1__Impl2515);
            	    rule__Programme__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:1: rule__Programme__Group_1__0 : rule__Programme__Group_1__0__Impl rule__Programme__Group_1__1 ;
    public final void rule__Programme__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: ( rule__Programme__Group_1__0__Impl rule__Programme__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:2: rule__Programme__Group_1__0__Impl rule__Programme__Group_1__1
            {
            pushFollow(FOLLOW_rule__Programme__Group_1__0__Impl_in_rule__Programme__Group_1__02550);
            rule__Programme__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Programme__Group_1__1_in_rule__Programme__Group_1__02553);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: rule__Programme__Group_1__0__Impl : ( ( rule__Programme__FonctAssignment_1_0 ) ) ;
    public final void rule__Programme__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ( ( ( rule__Programme__FonctAssignment_1_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( ( rule__Programme__FonctAssignment_1_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( ( rule__Programme__FonctAssignment_1_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: ( rule__Programme__FonctAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getFonctAssignment_1_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( rule__Programme__FonctAssignment_1_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:2: rule__Programme__FonctAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Programme__FonctAssignment_1_0_in_rule__Programme__Group_1__0__Impl2580);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:1: rule__Programme__Group_1__1 : rule__Programme__Group_1__1__Impl ;
    public final void rule__Programme__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: ( rule__Programme__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:2: rule__Programme__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Programme__Group_1__1__Impl_in_rule__Programme__Group_1__12610);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1224:1: rule__Programme__Group_1__1__Impl : ( ( RULE_CR )* ) ;
    public final void rule__Programme__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: ( ( ( RULE_CR )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( ( RULE_CR )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( ( RULE_CR )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ( RULE_CR )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getCRTerminalRuleCall_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: ( RULE_CR )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_CR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:3: RULE_CR
            	    {
            	    match(input,RULE_CR,FOLLOW_RULE_CR_in_rule__Programme__Group_1__1__Impl2638); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: rule__Fonction__Group__0 : rule__Fonction__Group__0__Impl rule__Fonction__Group__1 ;
    public final void rule__Fonction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1249:1: ( rule__Fonction__Group__0__Impl rule__Fonction__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1250:2: rule__Fonction__Group__0__Impl rule__Fonction__Group__1
            {
            pushFollow(FOLLOW_rule__Fonction__Group__0__Impl_in_rule__Fonction__Group__02673);
            rule__Fonction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__1_in_rule__Fonction__Group__02676);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: rule__Fonction__Group__0__Impl : ( 'fonction' ) ;
    public final void rule__Fonction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: ( ( 'fonction' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:1: ( 'fonction' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:1: ( 'fonction' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:1: 'fonction'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getFonctionKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Fonction__Group__0__Impl2704); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: rule__Fonction__Group__1 : rule__Fonction__Group__1__Impl rule__Fonction__Group__2 ;
    public final void rule__Fonction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: ( rule__Fonction__Group__1__Impl rule__Fonction__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1281:2: rule__Fonction__Group__1__Impl rule__Fonction__Group__2
            {
            pushFollow(FOLLOW_rule__Fonction__Group__1__Impl_in_rule__Fonction__Group__12735);
            rule__Fonction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__2_in_rule__Fonction__Group__12738);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: rule__Fonction__Group__1__Impl : ( ruleLC ) ;
    public final void rule__Fonction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Fonction__Group__1__Impl2765);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1305:1: rule__Fonction__Group__2 : rule__Fonction__Group__2__Impl rule__Fonction__Group__3 ;
    public final void rule__Fonction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:1: ( rule__Fonction__Group__2__Impl rule__Fonction__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1310:2: rule__Fonction__Group__2__Impl rule__Fonction__Group__3
            {
            pushFollow(FOLLOW_rule__Fonction__Group__2__Impl_in_rule__Fonction__Group__22794);
            rule__Fonction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__3_in_rule__Fonction__Group__22797);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: rule__Fonction__Group__2__Impl : ( ( rule__Fonction__SymboleAssignment_2 ) ) ;
    public final void rule__Fonction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:1: ( ( ( rule__Fonction__SymboleAssignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: ( ( rule__Fonction__SymboleAssignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: ( ( rule__Fonction__SymboleAssignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1323:1: ( rule__Fonction__SymboleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getSymboleAssignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1324:1: ( rule__Fonction__SymboleAssignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1324:2: rule__Fonction__SymboleAssignment_2
            {
            pushFollow(FOLLOW_rule__Fonction__SymboleAssignment_2_in_rule__Fonction__Group__2__Impl2824);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: rule__Fonction__Group__3 : rule__Fonction__Group__3__Impl rule__Fonction__Group__4 ;
    public final void rule__Fonction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1338:1: ( rule__Fonction__Group__3__Impl rule__Fonction__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1339:2: rule__Fonction__Group__3__Impl rule__Fonction__Group__4
            {
            pushFollow(FOLLOW_rule__Fonction__Group__3__Impl_in_rule__Fonction__Group__32854);
            rule__Fonction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__4_in_rule__Fonction__Group__32857);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: rule__Fonction__Group__3__Impl : ( ':' ) ;
    public final void rule__Fonction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ( ( ':' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:1: ( ':' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:1: ( ':' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1352:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getColonKeyword_3()); 
            }
            match(input,21,FOLLOW_21_in_rule__Fonction__Group__3__Impl2885); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: rule__Fonction__Group__4 : rule__Fonction__Group__4__Impl rule__Fonction__Group__5 ;
    public final void rule__Fonction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:1: ( rule__Fonction__Group__4__Impl rule__Fonction__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:2: rule__Fonction__Group__4__Impl rule__Fonction__Group__5
            {
            pushFollow(FOLLOW_rule__Fonction__Group__4__Impl_in_rule__Fonction__Group__42916);
            rule__Fonction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__5_in_rule__Fonction__Group__42919);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1377:1: rule__Fonction__Group__4__Impl : ( ruleLC ) ;
    public final void rule__Fonction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1381:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getLCParserRuleCall_4()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Fonction__Group__4__Impl2946);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: rule__Fonction__Group__5 : rule__Fonction__Group__5__Impl rule__Fonction__Group__6 ;
    public final void rule__Fonction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:1: ( rule__Fonction__Group__5__Impl rule__Fonction__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1399:2: rule__Fonction__Group__5__Impl rule__Fonction__Group__6
            {
            pushFollow(FOLLOW_rule__Fonction__Group__5__Impl_in_rule__Fonction__Group__52975);
            rule__Fonction__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__6_in_rule__Fonction__Group__52978);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: rule__Fonction__Group__5__Impl : ( 'read' ) ;
    public final void rule__Fonction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:1: ( ( 'read' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( 'read' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( 'read' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getReadKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__Fonction__Group__5__Impl3006); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: rule__Fonction__Group__6 : rule__Fonction__Group__6__Impl rule__Fonction__Group__7 ;
    public final void rule__Fonction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( rule__Fonction__Group__6__Impl rule__Fonction__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:2: rule__Fonction__Group__6__Impl rule__Fonction__Group__7
            {
            pushFollow(FOLLOW_rule__Fonction__Group__6__Impl_in_rule__Fonction__Group__63037);
            rule__Fonction__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__7_in_rule__Fonction__Group__63040);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: rule__Fonction__Group__6__Impl : ( ruleLC ) ;
    public final void rule__Fonction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getLCParserRuleCall_6()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Fonction__Group__6__Impl3067);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: rule__Fonction__Group__7 : rule__Fonction__Group__7__Impl rule__Fonction__Group__8 ;
    public final void rule__Fonction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: ( rule__Fonction__Group__7__Impl rule__Fonction__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:2: rule__Fonction__Group__7__Impl rule__Fonction__Group__8
            {
            pushFollow(FOLLOW_rule__Fonction__Group__7__Impl_in_rule__Fonction__Group__73096);
            rule__Fonction__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__8_in_rule__Fonction__Group__73099);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1466:1: rule__Fonction__Group__7__Impl : ( ( rule__Fonction__InAssignment_7 ) ) ;
    public final void rule__Fonction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1470:1: ( ( ( rule__Fonction__InAssignment_7 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: ( ( rule__Fonction__InAssignment_7 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: ( ( rule__Fonction__InAssignment_7 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:1: ( rule__Fonction__InAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getInAssignment_7()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( rule__Fonction__InAssignment_7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:2: rule__Fonction__InAssignment_7
            {
            pushFollow(FOLLOW_rule__Fonction__InAssignment_7_in_rule__Fonction__Group__7__Impl3126);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: rule__Fonction__Group__8 : rule__Fonction__Group__8__Impl rule__Fonction__Group__9 ;
    public final void rule__Fonction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: ( rule__Fonction__Group__8__Impl rule__Fonction__Group__9 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:2: rule__Fonction__Group__8__Impl rule__Fonction__Group__9
            {
            pushFollow(FOLLOW_rule__Fonction__Group__8__Impl_in_rule__Fonction__Group__83156);
            rule__Fonction__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__9_in_rule__Fonction__Group__83159);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: rule__Fonction__Group__8__Impl : ( '%' ) ;
    public final void rule__Fonction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1499:1: ( ( '%' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: ( '%' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: ( '%' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1501:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getPercentSignKeyword_8()); 
            }
            match(input,23,FOLLOW_23_in_rule__Fonction__Group__8__Impl3187); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: rule__Fonction__Group__9 : rule__Fonction__Group__9__Impl rule__Fonction__Group__10 ;
    public final void rule__Fonction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( rule__Fonction__Group__9__Impl rule__Fonction__Group__10 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:2: rule__Fonction__Group__9__Impl rule__Fonction__Group__10
            {
            pushFollow(FOLLOW_rule__Fonction__Group__9__Impl_in_rule__Fonction__Group__93218);
            rule__Fonction__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__10_in_rule__Fonction__Group__93221);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1526:1: rule__Fonction__Group__9__Impl : ( ( rule__Fonction__ComAssignment_9 ) ) ;
    public final void rule__Fonction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1530:1: ( ( ( rule__Fonction__ComAssignment_9 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: ( ( rule__Fonction__ComAssignment_9 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: ( ( rule__Fonction__ComAssignment_9 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:1: ( rule__Fonction__ComAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getComAssignment_9()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: ( rule__Fonction__ComAssignment_9 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:2: rule__Fonction__ComAssignment_9
            {
            pushFollow(FOLLOW_rule__Fonction__ComAssignment_9_in_rule__Fonction__Group__9__Impl3248);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: rule__Fonction__Group__10 : rule__Fonction__Group__10__Impl rule__Fonction__Group__11 ;
    public final void rule__Fonction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:1: ( rule__Fonction__Group__10__Impl rule__Fonction__Group__11 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:2: rule__Fonction__Group__10__Impl rule__Fonction__Group__11
            {
            pushFollow(FOLLOW_rule__Fonction__Group__10__Impl_in_rule__Fonction__Group__103278);
            rule__Fonction__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__11_in_rule__Fonction__Group__103281);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: rule__Fonction__Group__10__Impl : ( '%' ) ;
    public final void rule__Fonction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: ( ( '%' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1560:1: ( '%' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1560:1: ( '%' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1561:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getPercentSignKeyword_10()); 
            }
            match(input,23,FOLLOW_23_in_rule__Fonction__Group__10__Impl3309); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:1: rule__Fonction__Group__11 : rule__Fonction__Group__11__Impl rule__Fonction__Group__12 ;
    public final void rule__Fonction__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:1: ( rule__Fonction__Group__11__Impl rule__Fonction__Group__12 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:2: rule__Fonction__Group__11__Impl rule__Fonction__Group__12
            {
            pushFollow(FOLLOW_rule__Fonction__Group__11__Impl_in_rule__Fonction__Group__113340);
            rule__Fonction__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__12_in_rule__Fonction__Group__113343);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: rule__Fonction__Group__11__Impl : ( 'write' ) ;
    public final void rule__Fonction__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1590:1: ( ( 'write' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: ( 'write' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: ( 'write' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getWriteKeyword_11()); 
            }
            match(input,24,FOLLOW_24_in_rule__Fonction__Group__11__Impl3371); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:1: rule__Fonction__Group__12 : rule__Fonction__Group__12__Impl rule__Fonction__Group__13 ;
    public final void rule__Fonction__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:1: ( rule__Fonction__Group__12__Impl rule__Fonction__Group__13 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1610:2: rule__Fonction__Group__12__Impl rule__Fonction__Group__13
            {
            pushFollow(FOLLOW_rule__Fonction__Group__12__Impl_in_rule__Fonction__Group__123402);
            rule__Fonction__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__13_in_rule__Fonction__Group__123405);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:1: rule__Fonction__Group__12__Impl : ( ruleLC ) ;
    public final void rule__Fonction__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getLCParserRuleCall_12()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Fonction__Group__12__Impl3432);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: rule__Fonction__Group__13 : rule__Fonction__Group__13__Impl ;
    public final void rule__Fonction__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:1: ( rule__Fonction__Group__13__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1639:2: rule__Fonction__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__Fonction__Group__13__Impl_in_rule__Fonction__Group__133461);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: rule__Fonction__Group__13__Impl : ( ( rule__Fonction__OutAssignment_13 ) ) ;
    public final void rule__Fonction__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( ( ( rule__Fonction__OutAssignment_13 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ( ( rule__Fonction__OutAssignment_13 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ( ( rule__Fonction__OutAssignment_13 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( rule__Fonction__OutAssignment_13 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getOutAssignment_13()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:1: ( rule__Fonction__OutAssignment_13 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:2: rule__Fonction__OutAssignment_13
            {
            pushFollow(FOLLOW_rule__Fonction__OutAssignment_13_in_rule__Fonction__Group__13__Impl3488);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1690:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__03546);
            rule__Input__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__03549);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:1: rule__Input__Group__0__Impl : ( ( rule__Input__Var1Assignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:1: ( ( ( rule__Input__Var1Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: ( ( rule__Input__Var1Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: ( ( rule__Input__Var1Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:1: ( rule__Input__Var1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVar1Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: ( rule__Input__Var1Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:2: rule__Input__Var1Assignment_0
            {
            pushFollow(FOLLOW_rule__Input__Var1Assignment_0_in_rule__Input__Group__0__Impl3576);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1719:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1723:1: ( rule__Input__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__13606);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1730:1: rule__Input__Group__1__Impl : ( ( rule__Input__Group_1__0 )* ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1734:1: ( ( ( rule__Input__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1735:1: ( ( rule__Input__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1735:1: ( ( rule__Input__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: ( rule__Input__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( rule__Input__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:2: rule__Input__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3633);
            	    rule__Input__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: rule__Input__Group_1__0 : rule__Input__Group_1__0__Impl rule__Input__Group_1__1 ;
    public final void rule__Input__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: ( rule__Input__Group_1__0__Impl rule__Input__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:2: rule__Input__Group_1__0__Impl rule__Input__Group_1__1
            {
            pushFollow(FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03668);
            rule__Input__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03671);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1763:1: rule__Input__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Input__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( ( ',' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( ',' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( ',' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Input__Group_1__0__Impl3699); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1782:1: rule__Input__Group_1__1 : rule__Input__Group_1__1__Impl ;
    public final void rule__Input__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:1: ( rule__Input__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:2: rule__Input__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13730);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: rule__Input__Group_1__1__Impl : ( ( rule__Input__Var2Assignment_1_1 ) ) ;
    public final void rule__Input__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1797:1: ( ( ( rule__Input__Var2Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: ( ( rule__Input__Var2Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: ( ( rule__Input__Var2Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: ( rule__Input__Var2Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVar2Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( rule__Input__Var2Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:2: rule__Input__Var2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Input__Var2Assignment_1_1_in_rule__Input__Group_1__1__Impl3757);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1814:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1818:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03791);
            rule__Output__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03794);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1826:1: rule__Output__Group__0__Impl : ( ( rule__Output__Var1Assignment_0 ) ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: ( ( ( rule__Output__Var1Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ( ( rule__Output__Var1Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ( ( rule__Output__Var1Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:1: ( rule__Output__Var1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVar1Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:1: ( rule__Output__Var1Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:2: rule__Output__Var1Assignment_0
            {
            pushFollow(FOLLOW_rule__Output__Var1Assignment_0_in_rule__Output__Group__0__Impl3821);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: ( rule__Output__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13851);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: rule__Output__Group__1__Impl : ( ( rule__Output__Group_1__0 )* ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( ( ( rule__Output__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( ( rule__Output__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( ( rule__Output__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: ( rule__Output__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: ( rule__Output__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:2: rule__Output__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3878);
            	    rule__Output__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:1: rule__Output__Group_1__0 : rule__Output__Group_1__0__Impl rule__Output__Group_1__1 ;
    public final void rule__Output__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( rule__Output__Group_1__0__Impl rule__Output__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:2: rule__Output__Group_1__0__Impl rule__Output__Group_1__1
            {
            pushFollow(FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03913);
            rule__Output__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03916);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:1: rule__Output__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( ( ',' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: ( ',' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: ( ',' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Output__Group_1__0__Impl3944); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:1: rule__Output__Group_1__1 : rule__Output__Group_1__1__Impl ;
    public final void rule__Output__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:1: ( rule__Output__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:2: rule__Output__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__13975);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: rule__Output__Group_1__1__Impl : ( ( rule__Output__Var2Assignment_1_1 ) ) ;
    public final void rule__Output__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: ( ( ( rule__Output__Var2Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( ( rule__Output__Var2Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( ( rule__Output__Var2Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: ( rule__Output__Var2Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVar2Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: ( rule__Output__Var2Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:2: rule__Output__Var2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Output__Var2Assignment_1_1_in_rule__Output__Group_1__1__Impl4002);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:1: rule__Commandes__Group__0 : rule__Commandes__Group__0__Impl rule__Commandes__Group__1 ;
    public final void rule__Commandes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:1: ( rule__Commandes__Group__0__Impl rule__Commandes__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:2: rule__Commandes__Group__0__Impl rule__Commandes__Group__1
            {
            pushFollow(FOLLOW_rule__Commandes__Group__0__Impl_in_rule__Commandes__Group__04036);
            rule__Commandes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commandes__Group__1_in_rule__Commandes__Group__04039);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:1: rule__Commandes__Group__0__Impl : ( ( rule__Commandes__Com1Assignment_0 ) ) ;
    public final void rule__Commandes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ( ( ( rule__Commandes__Com1Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: ( ( rule__Commandes__Com1Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: ( ( rule__Commandes__Com1Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:1: ( rule__Commandes__Com1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getCom1Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:1: ( rule__Commandes__Com1Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:2: rule__Commandes__Com1Assignment_0
            {
            pushFollow(FOLLOW_rule__Commandes__Com1Assignment_0_in_rule__Commandes__Group__0__Impl4066);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: rule__Commandes__Group__1 : rule__Commandes__Group__1__Impl ;
    public final void rule__Commandes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1971:1: ( rule__Commandes__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1972:2: rule__Commandes__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Commandes__Group__1__Impl_in_rule__Commandes__Group__14096);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: rule__Commandes__Group__1__Impl : ( ( rule__Commandes__Group_1__0 )* ) ;
    public final void rule__Commandes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1982:1: ( ( ( rule__Commandes__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:1: ( ( rule__Commandes__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:1: ( ( rule__Commandes__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( rule__Commandes__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( rule__Commandes__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:2: rule__Commandes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Commandes__Group_1__0_in_rule__Commandes__Group__1__Impl4123);
            	    rule__Commandes__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:1: rule__Commandes__Group_1__0 : rule__Commandes__Group_1__0__Impl rule__Commandes__Group_1__1 ;
    public final void rule__Commandes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: ( rule__Commandes__Group_1__0__Impl rule__Commandes__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2004:2: rule__Commandes__Group_1__0__Impl rule__Commandes__Group_1__1
            {
            pushFollow(FOLLOW_rule__Commandes__Group_1__0__Impl_in_rule__Commandes__Group_1__04158);
            rule__Commandes__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commandes__Group_1__1_in_rule__Commandes__Group_1__04161);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: rule__Commandes__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Commandes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2015:1: ( ( ';' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2016:1: ( ';' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2016:1: ( ';' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2017:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Commandes__Group_1__0__Impl4189); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:1: rule__Commandes__Group_1__1 : rule__Commandes__Group_1__1__Impl ;
    public final void rule__Commandes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: ( rule__Commandes__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:2: rule__Commandes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Commandes__Group_1__1__Impl_in_rule__Commandes__Group_1__14220);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: rule__Commandes__Group_1__1__Impl : ( ( rule__Commandes__Com2Assignment_1_1 ) ) ;
    public final void rule__Commandes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2045:1: ( ( ( rule__Commandes__Com2Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: ( ( rule__Commandes__Com2Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: ( ( rule__Commandes__Com2Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: ( rule__Commandes__Com2Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getCom2Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:1: ( rule__Commandes__Com2Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:2: rule__Commandes__Com2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Commandes__Com2Assignment_1_1_in_rule__Commandes__Group_1__1__Impl4247);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: rule__Commande__Group_0__0 : rule__Commande__Group_0__0__Impl rule__Commande__Group_0__1 ;
    public final void rule__Commande__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2066:1: ( rule__Commande__Group_0__0__Impl rule__Commande__Group_0__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2067:2: rule__Commande__Group_0__0__Impl rule__Commande__Group_0__1
            {
            pushFollow(FOLLOW_rule__Commande__Group_0__0__Impl_in_rule__Commande__Group_0__04281);
            rule__Commande__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commande__Group_0__1_in_rule__Commande__Group_0__04284);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: rule__Commande__Group_0__0__Impl : ( () ) ;
    public final void rule__Commande__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2078:1: ( ( () ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:1: ( () )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:1: ( () )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2080:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getCommandeAction_0_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: ()
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2083:1: 
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2093:1: rule__Commande__Group_0__1 : rule__Commande__Group_0__1__Impl ;
    public final void rule__Commande__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:1: ( rule__Commande__Group_0__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:2: rule__Commande__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Commande__Group_0__1__Impl_in_rule__Commande__Group_0__14342);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: rule__Commande__Group_0__1__Impl : ( ( rule__Commande__NopAssignment_0_1 ) ) ;
    public final void rule__Commande__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2108:1: ( ( ( rule__Commande__NopAssignment_0_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( ( rule__Commande__NopAssignment_0_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( ( rule__Commande__NopAssignment_0_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:1: ( rule__Commande__NopAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getNopAssignment_0_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: ( rule__Commande__NopAssignment_0_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:2: rule__Commande__NopAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Commande__NopAssignment_0_1_in_rule__Commande__Group_0__1__Impl4369);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2125:1: rule__AffectVar__Group__0 : rule__AffectVar__Group__0__Impl rule__AffectVar__Group__1 ;
    public final void rule__AffectVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:1: ( rule__AffectVar__Group__0__Impl rule__AffectVar__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:2: rule__AffectVar__Group__0__Impl rule__AffectVar__Group__1
            {
            pushFollow(FOLLOW_rule__AffectVar__Group__0__Impl_in_rule__AffectVar__Group__04403);
            rule__AffectVar__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AffectVar__Group__1_in_rule__AffectVar__Group__04406);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:1: rule__AffectVar__Group__0__Impl : ( ( rule__AffectVar__Var1Assignment_0 ) ) ;
    public final void rule__AffectVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2141:1: ( ( ( rule__AffectVar__Var1Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:1: ( ( rule__AffectVar__Var1Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:1: ( ( rule__AffectVar__Var1Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: ( rule__AffectVar__Var1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getVar1Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( rule__AffectVar__Var1Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:2: rule__AffectVar__Var1Assignment_0
            {
            pushFollow(FOLLOW_rule__AffectVar__Var1Assignment_0_in_rule__AffectVar__Group__0__Impl4433);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:1: rule__AffectVar__Group__1 : rule__AffectVar__Group__1__Impl rule__AffectVar__Group__2 ;
    public final void rule__AffectVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: ( rule__AffectVar__Group__1__Impl rule__AffectVar__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:2: rule__AffectVar__Group__1__Impl rule__AffectVar__Group__2
            {
            pushFollow(FOLLOW_rule__AffectVar__Group__1__Impl_in_rule__AffectVar__Group__14463);
            rule__AffectVar__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AffectVar__Group__2_in_rule__AffectVar__Group__14466);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: rule__AffectVar__Group__1__Impl : ( ':=' ) ;
    public final void rule__AffectVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2170:1: ( ( ':=' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:1: ( ':=' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:1: ( ':=' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__AffectVar__Group__1__Impl4494); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: rule__AffectVar__Group__2 : rule__AffectVar__Group__2__Impl ;
    public final void rule__AffectVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2189:1: ( rule__AffectVar__Group__2__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:2: rule__AffectVar__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AffectVar__Group__2__Impl_in_rule__AffectVar__Group__24525);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2196:1: rule__AffectVar__Group__2__Impl : ( ( rule__AffectVar__ExpAssignment_2 ) ) ;
    public final void rule__AffectVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2200:1: ( ( ( rule__AffectVar__ExpAssignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: ( ( rule__AffectVar__ExpAssignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: ( ( rule__AffectVar__ExpAssignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: ( rule__AffectVar__ExpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getExpAssignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:1: ( rule__AffectVar__ExpAssignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:2: rule__AffectVar__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__AffectVar__ExpAssignment_2_in_rule__AffectVar__Group__2__Impl4552);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04588);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__04591);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2235:1: ( ( 'while' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: ( 'while' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: ( 'while' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2237:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__While__Group__0__Impl4619); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14650);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__14653);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: rule__While__Group__1__Impl : ( ruleLC ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2268:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__1__Impl4680);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24709);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__24712);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: rule__While__Group__2__Impl : ( ( rule__While__Exp2Assignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: ( ( ( rule__While__Exp2Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ( ( rule__While__Exp2Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ( ( rule__While__Exp2Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2297:1: ( rule__While__Exp2Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExp2Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: ( rule__While__Exp2Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:2: rule__While__Exp2Assignment_2
            {
            pushFollow(FOLLOW_rule__While__Exp2Assignment_2_in_rule__While__Group__2__Impl4739);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34769);
            rule__While__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__34772);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:1: rule__While__Group__3__Impl : ( ruleLC ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__3__Impl4799);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2337:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:2: rule__While__Group__4__Impl rule__While__Group__5
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44828);
            rule__While__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__5_in_rule__While__Group__44831);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2349:1: rule__While__Group__4__Impl : ( 'do' ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:1: ( ( 'do' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2354:1: ( 'do' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2354:1: ( 'do' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2355:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getDoKeyword_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__While__Group__4__Impl4859); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:1: rule__While__Group__5 : rule__While__Group__5__Impl rule__While__Group__6 ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: ( rule__While__Group__5__Impl rule__While__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:2: rule__While__Group__5__Impl rule__While__Group__6
            {
            pushFollow(FOLLOW_rule__While__Group__5__Impl_in_rule__While__Group__54890);
            rule__While__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__6_in_rule__While__Group__54893);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: rule__While__Group__5__Impl : ( ruleLC ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2386:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__5__Impl4920);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: rule__While__Group__6 : rule__While__Group__6__Impl rule__While__Group__7 ;
    public final void rule__While__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: ( rule__While__Group__6__Impl rule__While__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:2: rule__While__Group__6__Impl rule__While__Group__7
            {
            pushFollow(FOLLOW_rule__While__Group__6__Impl_in_rule__While__Group__64949);
            rule__While__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__7_in_rule__While__Group__64952);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2409:1: rule__While__Group__6__Impl : ( ( rule__While__Com3Assignment_6 ) ) ;
    public final void rule__While__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:1: ( ( ( rule__While__Com3Assignment_6 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2414:1: ( ( rule__While__Com3Assignment_6 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2414:1: ( ( rule__While__Com3Assignment_6 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:1: ( rule__While__Com3Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getCom3Assignment_6()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:1: ( rule__While__Com3Assignment_6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:2: rule__While__Com3Assignment_6
            {
            pushFollow(FOLLOW_rule__While__Com3Assignment_6_in_rule__While__Group__6__Impl4979);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2426:1: rule__While__Group__7 : rule__While__Group__7__Impl rule__While__Group__8 ;
    public final void rule__While__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2430:1: ( rule__While__Group__7__Impl rule__While__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2431:2: rule__While__Group__7__Impl rule__While__Group__8
            {
            pushFollow(FOLLOW_rule__While__Group__7__Impl_in_rule__While__Group__75009);
            rule__While__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__8_in_rule__While__Group__75012);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:1: rule__While__Group__7__Impl : ( ruleLC ) ;
    public final void rule__While__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2442:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2443:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2443:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2444:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__7__Impl5039);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2455:1: rule__While__Group__8 : rule__While__Group__8__Impl ;
    public final void rule__While__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:1: ( rule__While__Group__8__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2460:2: rule__While__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__8__Impl_in_rule__While__Group__85068);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: rule__While__Group__8__Impl : ( 'od' ) ;
    public final void rule__While__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2470:1: ( ( 'od' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: ( 'od' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: ( 'od' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getOdKeyword_8()); 
            }
            match(input,30,FOLLOW_30_in_rule__While__Group__8__Impl5096); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2508:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__05145);
            rule__For__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__1_in_rule__For__Group__05148);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2515:1: rule__For__Group__0__Impl : ( 'for' ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: ( ( 'for' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2520:1: ( 'for' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2520:1: ( 'for' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getForKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__For__Group__0__Impl5176); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__15207);
            rule__For__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__2_in_rule__For__Group__15210);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: rule__For__Group__1__Impl : ( ruleLC ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__1__Impl5237);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2568:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__25266);
            rule__For__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__3_in_rule__For__Group__25269);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2575:1: rule__For__Group__2__Impl : ( ( rule__For__Exp3Assignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:1: ( ( ( rule__For__Exp3Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2580:1: ( ( rule__For__Exp3Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2580:1: ( ( rule__For__Exp3Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2581:1: ( rule__For__Exp3Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getExp3Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: ( rule__For__Exp3Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:2: rule__For__Exp3Assignment_2
            {
            pushFollow(FOLLOW_rule__For__Exp3Assignment_2_in_rule__For__Group__2__Impl5296);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2592:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2597:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__35326);
            rule__For__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__4_in_rule__For__Group__35329);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2604:1: rule__For__Group__3__Impl : ( ruleLC ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2608:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2610:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__3__Impl5356);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2621:1: rule__For__Group__4 : rule__For__Group__4__Impl rule__For__Group__5 ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2625:1: ( rule__For__Group__4__Impl rule__For__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2626:2: rule__For__Group__4__Impl rule__For__Group__5
            {
            pushFollow(FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__45385);
            rule__For__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__5_in_rule__For__Group__45388);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2633:1: rule__For__Group__4__Impl : ( 'do' ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:1: ( ( 'do' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2638:1: ( 'do' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2638:1: ( 'do' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2639:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getDoKeyword_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__For__Group__4__Impl5416); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2652:1: rule__For__Group__5 : rule__For__Group__5__Impl rule__For__Group__6 ;
    public final void rule__For__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:1: ( rule__For__Group__5__Impl rule__For__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:2: rule__For__Group__5__Impl rule__For__Group__6
            {
            pushFollow(FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__55447);
            rule__For__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__6_in_rule__For__Group__55450);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: rule__For__Group__5__Impl : ( ruleLC ) ;
    public final void rule__For__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__5__Impl5477);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2681:1: rule__For__Group__6 : rule__For__Group__6__Impl rule__For__Group__7 ;
    public final void rule__For__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2685:1: ( rule__For__Group__6__Impl rule__For__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2686:2: rule__For__Group__6__Impl rule__For__Group__7
            {
            pushFollow(FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__65506);
            rule__For__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__7_in_rule__For__Group__65509);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:1: rule__For__Group__6__Impl : ( ( rule__For__Com4Assignment_6 ) ) ;
    public final void rule__For__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2697:1: ( ( ( rule__For__Com4Assignment_6 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2698:1: ( ( rule__For__Com4Assignment_6 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2698:1: ( ( rule__For__Com4Assignment_6 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2699:1: ( rule__For__Com4Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCom4Assignment_6()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:1: ( rule__For__Com4Assignment_6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:2: rule__For__Com4Assignment_6
            {
            pushFollow(FOLLOW_rule__For__Com4Assignment_6_in_rule__For__Group__6__Impl5536);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2710:1: rule__For__Group__7 : rule__For__Group__7__Impl rule__For__Group__8 ;
    public final void rule__For__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2714:1: ( rule__For__Group__7__Impl rule__For__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2715:2: rule__For__Group__7__Impl rule__For__Group__8
            {
            pushFollow(FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__75566);
            rule__For__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__8_in_rule__For__Group__75569);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2722:1: rule__For__Group__7__Impl : ( ruleLC ) ;
    public final void rule__For__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__7__Impl5596);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2739:1: rule__For__Group__8 : rule__For__Group__8__Impl ;
    public final void rule__For__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2743:1: ( rule__For__Group__8__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:2: rule__For__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__85625);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2750:1: rule__For__Group__8__Impl : ( 'od' ) ;
    public final void rule__For__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2754:1: ( ( 'od' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2755:1: ( 'od' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2755:1: ( 'od' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getOdKeyword_8()); 
            }
            match(input,30,FOLLOW_30_in_rule__For__Group__8__Impl5653); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2791:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__05702);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__05705);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2803:1: ( ( 'if' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: ( 'if' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: ( 'if' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2805:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__If__Group__0__Impl5733); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2822:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2823:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__15764);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__15767);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2830:1: rule__If__Group__1__Impl : ( ruleLC ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2836:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__1__Impl5794);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2852:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__25823);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__25826);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: rule__If__Group__2__Impl : ( ( rule__If__Exp4Assignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: ( ( ( rule__If__Exp4Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: ( ( rule__If__Exp4Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: ( ( rule__If__Exp4Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:1: ( rule__If__Exp4Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExp4Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2866:1: ( rule__If__Exp4Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2866:2: rule__If__Exp4Assignment_2
            {
            pushFollow(FOLLOW_rule__If__Exp4Assignment_2_in_rule__If__Group__2__Impl5853);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__35883);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__35886);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2888:1: rule__If__Group__3__Impl : ( ruleLC ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2892:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2893:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2893:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__3__Impl5913);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2905:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2909:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__45942);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__5_in_rule__If__Group__45945);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2917:1: rule__If__Group__4__Impl : ( 'then' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2921:1: ( ( 'then' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: ( 'then' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: ( 'then' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenKeyword_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__If__Group__4__Impl5973); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2936:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2940:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2941:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__56004);
            rule__If__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__6_in_rule__If__Group__56007);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:1: rule__If__Group__5__Impl : ( ruleLC ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2952:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__5__Impl6034);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2969:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2970:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__66063);
            rule__If__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__7_in_rule__If__Group__66066);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2977:1: rule__If__Group__6__Impl : ( ( rule__If__Com5Assignment_6 ) ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2981:1: ( ( ( rule__If__Com5Assignment_6 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2982:1: ( ( rule__If__Com5Assignment_6 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2982:1: ( ( rule__If__Com5Assignment_6 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:1: ( rule__If__Com5Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCom5Assignment_6()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: ( rule__If__Com5Assignment_6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:2: rule__If__Com5Assignment_6
            {
            pushFollow(FOLLOW_rule__If__Com5Assignment_6_in_rule__If__Group__6__Impl6093);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2994:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2998:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2999:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__76123);
            rule__If__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__8_in_rule__If__Group__76126);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3006:1: rule__If__Group__7__Impl : ( ruleLC ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3012:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__7__Impl6153);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3023:1: rule__If__Group__8 : rule__If__Group__8__Impl rule__If__Group__9 ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3027:1: ( rule__If__Group__8__Impl rule__If__Group__9 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3028:2: rule__If__Group__8__Impl rule__If__Group__9
            {
            pushFollow(FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__86182);
            rule__If__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__9_in_rule__If__Group__86185);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3035:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( ( ( rule__If__Group_8__0 )? ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: ( ( rule__If__Group_8__0 )? )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: ( ( rule__If__Group_8__0 )? )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: ( rule__If__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_8()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:1: ( rule__If__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:2: rule__If__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__If__Group_8__0_in_rule__If__Group__8__Impl6212);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3052:1: rule__If__Group__9 : rule__If__Group__9__Impl ;
    public final void rule__If__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3056:1: ( rule__If__Group__9__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:2: rule__If__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__9__Impl_in_rule__If__Group__96243);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3063:1: rule__If__Group__9__Impl : ( 'fi' ) ;
    public final void rule__If__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: ( ( 'fi' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( 'fi' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( 'fi' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getFiKeyword_9()); 
            }
            match(input,34,FOLLOW_34_in_rule__If__Group__9__Impl6271); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3102:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3106:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3107:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
            {
            pushFollow(FOLLOW_rule__If__Group_8__0__Impl_in_rule__If__Group_8__06322);
            rule__If__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__1_in_rule__If__Group_8__06325);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3114:1: rule__If__Group_8__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3118:1: ( ( 'else' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3119:1: ( 'else' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3119:1: ( 'else' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3120:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__If__Group_8__0__Impl6353); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3133:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl rule__If__Group_8__2 ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3137:1: ( rule__If__Group_8__1__Impl rule__If__Group_8__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3138:2: rule__If__Group_8__1__Impl rule__If__Group_8__2
            {
            pushFollow(FOLLOW_rule__If__Group_8__1__Impl_in_rule__If__Group_8__16384);
            rule__If__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__2_in_rule__If__Group_8__16387);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:1: rule__If__Group_8__1__Impl : ( ruleLC ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3149:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_8_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group_8__1__Impl6414);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3162:1: rule__If__Group_8__2 : rule__If__Group_8__2__Impl rule__If__Group_8__3 ;
    public final void rule__If__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:1: ( rule__If__Group_8__2__Impl rule__If__Group_8__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3167:2: rule__If__Group_8__2__Impl rule__If__Group_8__3
            {
            pushFollow(FOLLOW_rule__If__Group_8__2__Impl_in_rule__If__Group_8__26443);
            rule__If__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__3_in_rule__If__Group_8__26446);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3174:1: rule__If__Group_8__2__Impl : ( ( rule__If__Com6Assignment_8_2 ) ) ;
    public final void rule__If__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:1: ( ( ( rule__If__Com6Assignment_8_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:1: ( ( rule__If__Com6Assignment_8_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:1: ( ( rule__If__Com6Assignment_8_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3180:1: ( rule__If__Com6Assignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCom6Assignment_8_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3181:1: ( rule__If__Com6Assignment_8_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3181:2: rule__If__Com6Assignment_8_2
            {
            pushFollow(FOLLOW_rule__If__Com6Assignment_8_2_in_rule__If__Group_8__2__Impl6473);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: rule__If__Group_8__3 : rule__If__Group_8__3__Impl ;
    public final void rule__If__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3195:1: ( rule__If__Group_8__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3196:2: rule__If__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__If__Group_8__3__Impl_in_rule__If__Group_8__36503);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3202:1: rule__If__Group_8__3__Impl : ( ruleLC ) ;
    public final void rule__If__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3206:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3207:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3207:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_8_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group_8__3__Impl6530);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: rule__Foreach__Group__0 : rule__Foreach__Group__0__Impl rule__Foreach__Group__1 ;
    public final void rule__Foreach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3231:1: ( rule__Foreach__Group__0__Impl rule__Foreach__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3232:2: rule__Foreach__Group__0__Impl rule__Foreach__Group__1
            {
            pushFollow(FOLLOW_rule__Foreach__Group__0__Impl_in_rule__Foreach__Group__06567);
            rule__Foreach__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__1_in_rule__Foreach__Group__06570);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3239:1: rule__Foreach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__Foreach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3243:1: ( ( 'foreach' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3244:1: ( 'foreach' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3244:1: ( 'foreach' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3245:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getForeachKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Foreach__Group__0__Impl6598); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3258:1: rule__Foreach__Group__1 : rule__Foreach__Group__1__Impl rule__Foreach__Group__2 ;
    public final void rule__Foreach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3262:1: ( rule__Foreach__Group__1__Impl rule__Foreach__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3263:2: rule__Foreach__Group__1__Impl rule__Foreach__Group__2
            {
            pushFollow(FOLLOW_rule__Foreach__Group__1__Impl_in_rule__Foreach__Group__16629);
            rule__Foreach__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__2_in_rule__Foreach__Group__16632);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3270:1: rule__Foreach__Group__1__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3274:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3275:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3275:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3276:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__1__Impl6659);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3287:1: rule__Foreach__Group__2 : rule__Foreach__Group__2__Impl rule__Foreach__Group__3 ;
    public final void rule__Foreach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3291:1: ( rule__Foreach__Group__2__Impl rule__Foreach__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:2: rule__Foreach__Group__2__Impl rule__Foreach__Group__3
            {
            pushFollow(FOLLOW_rule__Foreach__Group__2__Impl_in_rule__Foreach__Group__26688);
            rule__Foreach__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__3_in_rule__Foreach__Group__26691);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3299:1: rule__Foreach__Group__2__Impl : ( ( rule__Foreach__Exp5Assignment_2 ) ) ;
    public final void rule__Foreach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3303:1: ( ( ( rule__Foreach__Exp5Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3304:1: ( ( rule__Foreach__Exp5Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3304:1: ( ( rule__Foreach__Exp5Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3305:1: ( rule__Foreach__Exp5Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getExp5Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3306:1: ( rule__Foreach__Exp5Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3306:2: rule__Foreach__Exp5Assignment_2
            {
            pushFollow(FOLLOW_rule__Foreach__Exp5Assignment_2_in_rule__Foreach__Group__2__Impl6718);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3316:1: rule__Foreach__Group__3 : rule__Foreach__Group__3__Impl rule__Foreach__Group__4 ;
    public final void rule__Foreach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3320:1: ( rule__Foreach__Group__3__Impl rule__Foreach__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:2: rule__Foreach__Group__3__Impl rule__Foreach__Group__4
            {
            pushFollow(FOLLOW_rule__Foreach__Group__3__Impl_in_rule__Foreach__Group__36748);
            rule__Foreach__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__4_in_rule__Foreach__Group__36751);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:1: rule__Foreach__Group__3__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3332:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3333:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3333:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3334:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__3__Impl6778);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: rule__Foreach__Group__4 : rule__Foreach__Group__4__Impl rule__Foreach__Group__5 ;
    public final void rule__Foreach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3349:1: ( rule__Foreach__Group__4__Impl rule__Foreach__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3350:2: rule__Foreach__Group__4__Impl rule__Foreach__Group__5
            {
            pushFollow(FOLLOW_rule__Foreach__Group__4__Impl_in_rule__Foreach__Group__46807);
            rule__Foreach__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__5_in_rule__Foreach__Group__46810);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: rule__Foreach__Group__4__Impl : ( 'in' ) ;
    public final void rule__Foreach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3361:1: ( ( 'in' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3362:1: ( 'in' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3362:1: ( 'in' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3363:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getInKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__Foreach__Group__4__Impl6838); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3376:1: rule__Foreach__Group__5 : rule__Foreach__Group__5__Impl rule__Foreach__Group__6 ;
    public final void rule__Foreach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3380:1: ( rule__Foreach__Group__5__Impl rule__Foreach__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3381:2: rule__Foreach__Group__5__Impl rule__Foreach__Group__6
            {
            pushFollow(FOLLOW_rule__Foreach__Group__5__Impl_in_rule__Foreach__Group__56869);
            rule__Foreach__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__6_in_rule__Foreach__Group__56872);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3388:1: rule__Foreach__Group__5__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3392:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3393:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3393:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3394:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__5__Impl6899);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3405:1: rule__Foreach__Group__6 : rule__Foreach__Group__6__Impl rule__Foreach__Group__7 ;
    public final void rule__Foreach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3409:1: ( rule__Foreach__Group__6__Impl rule__Foreach__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3410:2: rule__Foreach__Group__6__Impl rule__Foreach__Group__7
            {
            pushFollow(FOLLOW_rule__Foreach__Group__6__Impl_in_rule__Foreach__Group__66928);
            rule__Foreach__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__7_in_rule__Foreach__Group__66931);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:1: rule__Foreach__Group__6__Impl : ( ( rule__Foreach__Exp6Assignment_6 ) ) ;
    public final void rule__Foreach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3421:1: ( ( ( rule__Foreach__Exp6Assignment_6 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:1: ( ( rule__Foreach__Exp6Assignment_6 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:1: ( ( rule__Foreach__Exp6Assignment_6 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3423:1: ( rule__Foreach__Exp6Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getExp6Assignment_6()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3424:1: ( rule__Foreach__Exp6Assignment_6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3424:2: rule__Foreach__Exp6Assignment_6
            {
            pushFollow(FOLLOW_rule__Foreach__Exp6Assignment_6_in_rule__Foreach__Group__6__Impl6958);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: rule__Foreach__Group__7 : rule__Foreach__Group__7__Impl rule__Foreach__Group__8 ;
    public final void rule__Foreach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3438:1: ( rule__Foreach__Group__7__Impl rule__Foreach__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:2: rule__Foreach__Group__7__Impl rule__Foreach__Group__8
            {
            pushFollow(FOLLOW_rule__Foreach__Group__7__Impl_in_rule__Foreach__Group__76988);
            rule__Foreach__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__8_in_rule__Foreach__Group__76991);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:1: rule__Foreach__Group__7__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3452:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__7__Impl7018);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3463:1: rule__Foreach__Group__8 : rule__Foreach__Group__8__Impl rule__Foreach__Group__9 ;
    public final void rule__Foreach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: ( rule__Foreach__Group__8__Impl rule__Foreach__Group__9 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3468:2: rule__Foreach__Group__8__Impl rule__Foreach__Group__9
            {
            pushFollow(FOLLOW_rule__Foreach__Group__8__Impl_in_rule__Foreach__Group__87047);
            rule__Foreach__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__9_in_rule__Foreach__Group__87050);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3475:1: rule__Foreach__Group__8__Impl : ( 'do' ) ;
    public final void rule__Foreach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3479:1: ( ( 'do' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3480:1: ( 'do' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3480:1: ( 'do' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getDoKeyword_8()); 
            }
            match(input,29,FOLLOW_29_in_rule__Foreach__Group__8__Impl7078); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:1: rule__Foreach__Group__9 : rule__Foreach__Group__9__Impl rule__Foreach__Group__10 ;
    public final void rule__Foreach__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3498:1: ( rule__Foreach__Group__9__Impl rule__Foreach__Group__10 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:2: rule__Foreach__Group__9__Impl rule__Foreach__Group__10
            {
            pushFollow(FOLLOW_rule__Foreach__Group__9__Impl_in_rule__Foreach__Group__97109);
            rule__Foreach__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__10_in_rule__Foreach__Group__97112);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: rule__Foreach__Group__9__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3510:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3512:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_9()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__9__Impl7139);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:1: rule__Foreach__Group__10 : rule__Foreach__Group__10__Impl rule__Foreach__Group__11 ;
    public final void rule__Foreach__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3527:1: ( rule__Foreach__Group__10__Impl rule__Foreach__Group__11 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3528:2: rule__Foreach__Group__10__Impl rule__Foreach__Group__11
            {
            pushFollow(FOLLOW_rule__Foreach__Group__10__Impl_in_rule__Foreach__Group__107168);
            rule__Foreach__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__11_in_rule__Foreach__Group__107171);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3535:1: rule__Foreach__Group__10__Impl : ( ( rule__Foreach__Com7Assignment_10 ) ) ;
    public final void rule__Foreach__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:1: ( ( ( rule__Foreach__Com7Assignment_10 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3540:1: ( ( rule__Foreach__Com7Assignment_10 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3540:1: ( ( rule__Foreach__Com7Assignment_10 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:1: ( rule__Foreach__Com7Assignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getCom7Assignment_10()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: ( rule__Foreach__Com7Assignment_10 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:2: rule__Foreach__Com7Assignment_10
            {
            pushFollow(FOLLOW_rule__Foreach__Com7Assignment_10_in_rule__Foreach__Group__10__Impl7198);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3552:1: rule__Foreach__Group__11 : rule__Foreach__Group__11__Impl rule__Foreach__Group__12 ;
    public final void rule__Foreach__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3556:1: ( rule__Foreach__Group__11__Impl rule__Foreach__Group__12 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3557:2: rule__Foreach__Group__11__Impl rule__Foreach__Group__12
            {
            pushFollow(FOLLOW_rule__Foreach__Group__11__Impl_in_rule__Foreach__Group__117228);
            rule__Foreach__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__12_in_rule__Foreach__Group__117231);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3564:1: rule__Foreach__Group__11__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3570:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_11()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__11__Impl7258);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3581:1: rule__Foreach__Group__12 : rule__Foreach__Group__12__Impl ;
    public final void rule__Foreach__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3585:1: ( rule__Foreach__Group__12__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:2: rule__Foreach__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Foreach__Group__12__Impl_in_rule__Foreach__Group__127287);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3592:1: rule__Foreach__Group__12__Impl : ( 'od' ) ;
    public final void rule__Foreach__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3596:1: ( ( 'od' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: ( 'od' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: ( 'od' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3598:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getOdKeyword_12()); 
            }
            match(input,30,FOLLOW_30_in_rule__Foreach__Group__12__Impl7315); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3637:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3641:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3642:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__07372);
            rule__Vars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__07375);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:1: rule__Vars__Group__0__Impl : ( ( rule__Vars__Var2Assignment_0 ) ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3653:1: ( ( ( rule__Vars__Var2Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3654:1: ( ( rule__Vars__Var2Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3654:1: ( ( rule__Vars__Var2Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3655:1: ( rule__Vars__Var2Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVar2Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: ( rule__Vars__Var2Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:2: rule__Vars__Var2Assignment_0
            {
            pushFollow(FOLLOW_rule__Vars__Var2Assignment_0_in_rule__Vars__Group__0__Impl7402);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3666:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3670:1: ( rule__Vars__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3671:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__17432);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__Group_1__0 )* ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3681:1: ( ( ( rule__Vars__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3682:1: ( ( rule__Vars__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3682:1: ( ( rule__Vars__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3683:1: ( rule__Vars__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3684:1: ( rule__Vars__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3684:2: rule__Vars__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl7459);
            	    rule__Vars__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3698:1: rule__Vars__Group_1__0 : rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 ;
    public final void rule__Vars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3702:1: ( rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3703:2: rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__07494);
            rule__Vars__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__07497);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:1: rule__Vars__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Vars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3714:1: ( ( ',' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3715:1: ( ',' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3715:1: ( ',' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3716:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Vars__Group_1__0__Impl7525); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3729:1: rule__Vars__Group_1__1 : rule__Vars__Group_1__1__Impl ;
    public final void rule__Vars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3733:1: ( rule__Vars__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3734:2: rule__Vars__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__17556);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: rule__Vars__Group_1__1__Impl : ( ( rule__Vars__Var3Assignment_1_1 ) ) ;
    public final void rule__Vars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3744:1: ( ( ( rule__Vars__Var3Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3745:1: ( ( rule__Vars__Var3Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3745:1: ( ( rule__Vars__Var3Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3746:1: ( rule__Vars__Var3Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVar3Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3747:1: ( rule__Vars__Var3Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3747:2: rule__Vars__Var3Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Vars__Var3Assignment_1_1_in_rule__Vars__Group_1__1__Impl7583);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3761:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3765:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__07617);
            rule__Exprs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__07620);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3773:1: rule__Exprs__Group__0__Impl : ( ( rule__Exprs__ExprSAssignment_0 ) ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3777:1: ( ( ( rule__Exprs__ExprSAssignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: ( ( rule__Exprs__ExprSAssignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: ( ( rule__Exprs__ExprSAssignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3779:1: ( rule__Exprs__ExprSAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprSAssignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3780:1: ( rule__Exprs__ExprSAssignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3780:2: rule__Exprs__ExprSAssignment_0
            {
            pushFollow(FOLLOW_rule__Exprs__ExprSAssignment_0_in_rule__Exprs__Group__0__Impl7647);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3794:1: ( rule__Exprs__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3795:2: rule__Exprs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__17677);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__Group_1__0 )* ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3805:1: ( ( ( rule__Exprs__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3806:1: ( ( rule__Exprs__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3806:1: ( ( rule__Exprs__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3807:1: ( rule__Exprs__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3808:1: ( rule__Exprs__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3808:2: rule__Exprs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl7704);
            	    rule__Exprs__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3822:1: rule__Exprs__Group_1__0 : rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 ;
    public final void rule__Exprs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3826:1: ( rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3827:2: rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__07739);
            rule__Exprs__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__07742);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: rule__Exprs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3838:1: ( ( ',' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3839:1: ( ',' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3839:1: ( ',' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3840:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Exprs__Group_1__0__Impl7770); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3853:1: rule__Exprs__Group_1__1 : rule__Exprs__Group_1__1__Impl ;
    public final void rule__Exprs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3857:1: ( rule__Exprs__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:2: rule__Exprs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__17801);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: rule__Exprs__Group_1__1__Impl : ( ( rule__Exprs__ExprS2Assignment_1_1 ) ) ;
    public final void rule__Exprs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3868:1: ( ( ( rule__Exprs__ExprS2Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3869:1: ( ( rule__Exprs__ExprS2Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3869:1: ( ( rule__Exprs__ExprS2Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3870:1: ( rule__Exprs__ExprS2Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprS2Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3871:1: ( rule__Exprs__ExprS2Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3871:2: rule__Exprs__ExprS2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Exprs__ExprS2Assignment_1_1_in_rule__Exprs__Group_1__1__Impl7828);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3885:1: rule__ExprSimple__Group_0__0 : rule__ExprSimple__Group_0__0__Impl rule__ExprSimple__Group_0__1 ;
    public final void rule__ExprSimple__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: ( rule__ExprSimple__Group_0__0__Impl rule__ExprSimple__Group_0__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3890:2: rule__ExprSimple__Group_0__0__Impl rule__ExprSimple__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_0__0__Impl_in_rule__ExprSimple__Group_0__07862);
            rule__ExprSimple__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_0__1_in_rule__ExprSimple__Group_0__07865);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3897:1: rule__ExprSimple__Group_0__0__Impl : ( () ) ;
    public final void rule__ExprSimple__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3901:1: ( ( () ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3902:1: ( () )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3902:1: ( () )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3903:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprSimpleAction_0_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3904:1: ()
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:1: 
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3916:1: rule__ExprSimple__Group_0__1 : rule__ExprSimple__Group_0__1__Impl ;
    public final void rule__ExprSimple__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3920:1: ( rule__ExprSimple__Group_0__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3921:2: rule__ExprSimple__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_0__1__Impl_in_rule__ExprSimple__Group_0__17923);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3927:1: rule__ExprSimple__Group_0__1__Impl : ( ( rule__ExprSimple__VideAssignment_0_1 ) ) ;
    public final void rule__ExprSimple__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3931:1: ( ( ( rule__ExprSimple__VideAssignment_0_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:1: ( ( rule__ExprSimple__VideAssignment_0_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:1: ( ( rule__ExprSimple__VideAssignment_0_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3933:1: ( rule__ExprSimple__VideAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVideAssignment_0_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:1: ( rule__ExprSimple__VideAssignment_0_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:2: rule__ExprSimple__VideAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__VideAssignment_0_1_in_rule__ExprSimple__Group_0__1__Impl7950);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3948:1: rule__Cons__Group__0 : rule__Cons__Group__0__Impl rule__Cons__Group__1 ;
    public final void rule__Cons__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3952:1: ( rule__Cons__Group__0__Impl rule__Cons__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3953:2: rule__Cons__Group__0__Impl rule__Cons__Group__1
            {
            pushFollow(FOLLOW_rule__Cons__Group__0__Impl_in_rule__Cons__Group__07984);
            rule__Cons__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Cons__Group__1_in_rule__Cons__Group__07987);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3960:1: rule__Cons__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__Cons__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3964:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3965:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3965:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3966:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__Cons__Group__0__Impl8014); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: rule__Cons__Group__1 : rule__Cons__Group__1__Impl rule__Cons__Group__2 ;
    public final void rule__Cons__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3981:1: ( rule__Cons__Group__1__Impl rule__Cons__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:2: rule__Cons__Group__1__Impl rule__Cons__Group__2
            {
            pushFollow(FOLLOW_rule__Cons__Group__1__Impl_in_rule__Cons__Group__18043);
            rule__Cons__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Cons__Group__2_in_rule__Cons__Group__18046);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: rule__Cons__Group__1__Impl : ( 'cons' ) ;
    public final void rule__Cons__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3993:1: ( ( 'cons' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: ( 'cons' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: ( 'cons' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3995:1: 'cons'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getConsKeyword_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__Cons__Group__1__Impl8074); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4008:1: rule__Cons__Group__2 : rule__Cons__Group__2__Impl rule__Cons__Group__3 ;
    public final void rule__Cons__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4012:1: ( rule__Cons__Group__2__Impl rule__Cons__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4013:2: rule__Cons__Group__2__Impl rule__Cons__Group__3
            {
            pushFollow(FOLLOW_rule__Cons__Group__2__Impl_in_rule__Cons__Group__28105);
            rule__Cons__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Cons__Group__3_in_rule__Cons__Group__28108);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: rule__Cons__Group__2__Impl : ( ( rule__Cons__Le1Assignment_2 ) ) ;
    public final void rule__Cons__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:1: ( ( ( rule__Cons__Le1Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4025:1: ( ( rule__Cons__Le1Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4025:1: ( ( rule__Cons__Le1Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4026:1: ( rule__Cons__Le1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getLe1Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4027:1: ( rule__Cons__Le1Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4027:2: rule__Cons__Le1Assignment_2
            {
            pushFollow(FOLLOW_rule__Cons__Le1Assignment_2_in_rule__Cons__Group__2__Impl8135);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:1: rule__Cons__Group__3 : rule__Cons__Group__3__Impl ;
    public final void rule__Cons__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4041:1: ( rule__Cons__Group__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4042:2: rule__Cons__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Cons__Group__3__Impl_in_rule__Cons__Group__38165);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4048:1: rule__Cons__Group__3__Impl : ( RULE_PARAD ) ;
    public final void rule__Cons__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4052:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4053:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4053:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4054:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getPARADTerminalRuleCall_3()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__Cons__Group__3__Impl8192); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4073:1: rule__Liste__Group__0 : rule__Liste__Group__0__Impl rule__Liste__Group__1 ;
    public final void rule__Liste__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4077:1: ( rule__Liste__Group__0__Impl rule__Liste__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4078:2: rule__Liste__Group__0__Impl rule__Liste__Group__1
            {
            pushFollow(FOLLOW_rule__Liste__Group__0__Impl_in_rule__Liste__Group__08229);
            rule__Liste__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Liste__Group__1_in_rule__Liste__Group__08232);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: rule__Liste__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__Liste__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4089:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4091:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__Liste__Group__0__Impl8259); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4102:1: rule__Liste__Group__1 : rule__Liste__Group__1__Impl rule__Liste__Group__2 ;
    public final void rule__Liste__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:1: ( rule__Liste__Group__1__Impl rule__Liste__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4107:2: rule__Liste__Group__1__Impl rule__Liste__Group__2
            {
            pushFollow(FOLLOW_rule__Liste__Group__1__Impl_in_rule__Liste__Group__18288);
            rule__Liste__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Liste__Group__2_in_rule__Liste__Group__18291);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4114:1: rule__Liste__Group__1__Impl : ( 'list' ) ;
    public final void rule__Liste__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4118:1: ( ( 'list' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4119:1: ( 'list' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4119:1: ( 'list' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4120:1: 'list'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getListKeyword_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__Liste__Group__1__Impl8319); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4133:1: rule__Liste__Group__2 : rule__Liste__Group__2__Impl rule__Liste__Group__3 ;
    public final void rule__Liste__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4137:1: ( rule__Liste__Group__2__Impl rule__Liste__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4138:2: rule__Liste__Group__2__Impl rule__Liste__Group__3
            {
            pushFollow(FOLLOW_rule__Liste__Group__2__Impl_in_rule__Liste__Group__28350);
            rule__Liste__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Liste__Group__3_in_rule__Liste__Group__28353);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:1: rule__Liste__Group__2__Impl : ( ( rule__Liste__Le2Assignment_2 ) ) ;
    public final void rule__Liste__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4149:1: ( ( ( rule__Liste__Le2Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4150:1: ( ( rule__Liste__Le2Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4150:1: ( ( rule__Liste__Le2Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4151:1: ( rule__Liste__Le2Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getLe2Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4152:1: ( rule__Liste__Le2Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4152:2: rule__Liste__Le2Assignment_2
            {
            pushFollow(FOLLOW_rule__Liste__Le2Assignment_2_in_rule__Liste__Group__2__Impl8380);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4162:1: rule__Liste__Group__3 : rule__Liste__Group__3__Impl ;
    public final void rule__Liste__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4166:1: ( rule__Liste__Group__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4167:2: rule__Liste__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Liste__Group__3__Impl_in_rule__Liste__Group__38410);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4173:1: rule__Liste__Group__3__Impl : ( RULE_PARAD ) ;
    public final void rule__Liste__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4177:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4178:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4178:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4179:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getPARADTerminalRuleCall_3()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__Liste__Group__3__Impl8437); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4198:1: rule__Hd__Group__0 : rule__Hd__Group__0__Impl rule__Hd__Group__1 ;
    public final void rule__Hd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4202:1: ( rule__Hd__Group__0__Impl rule__Hd__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4203:2: rule__Hd__Group__0__Impl rule__Hd__Group__1
            {
            pushFollow(FOLLOW_rule__Hd__Group__0__Impl_in_rule__Hd__Group__08474);
            rule__Hd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Hd__Group__1_in_rule__Hd__Group__08477);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4210:1: rule__Hd__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__Hd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4215:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4215:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4216:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__Hd__Group__0__Impl8504); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4227:1: rule__Hd__Group__1 : rule__Hd__Group__1__Impl rule__Hd__Group__2 ;
    public final void rule__Hd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4231:1: ( rule__Hd__Group__1__Impl rule__Hd__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4232:2: rule__Hd__Group__1__Impl rule__Hd__Group__2
            {
            pushFollow(FOLLOW_rule__Hd__Group__1__Impl_in_rule__Hd__Group__18533);
            rule__Hd__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Hd__Group__2_in_rule__Hd__Group__18536);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4239:1: rule__Hd__Group__1__Impl : ( 'hd' ) ;
    public final void rule__Hd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4243:1: ( ( 'hd' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: ( 'hd' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: ( 'hd' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:1: 'hd'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getHdKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__Hd__Group__1__Impl8564); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4258:1: rule__Hd__Group__2 : rule__Hd__Group__2__Impl rule__Hd__Group__3 ;
    public final void rule__Hd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4262:1: ( rule__Hd__Group__2__Impl rule__Hd__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4263:2: rule__Hd__Group__2__Impl rule__Hd__Group__3
            {
            pushFollow(FOLLOW_rule__Hd__Group__2__Impl_in_rule__Hd__Group__28595);
            rule__Hd__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Hd__Group__3_in_rule__Hd__Group__28598);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4270:1: rule__Hd__Group__2__Impl : ( ruleLC ) ;
    public final void rule__Hd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4274:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4276:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getLCParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Hd__Group__2__Impl8625);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4287:1: rule__Hd__Group__3 : rule__Hd__Group__3__Impl rule__Hd__Group__4 ;
    public final void rule__Hd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4291:1: ( rule__Hd__Group__3__Impl rule__Hd__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4292:2: rule__Hd__Group__3__Impl rule__Hd__Group__4
            {
            pushFollow(FOLLOW_rule__Hd__Group__3__Impl_in_rule__Hd__Group__38654);
            rule__Hd__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Hd__Group__4_in_rule__Hd__Group__38657);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4299:1: rule__Hd__Group__3__Impl : ( ( rule__Hd__Le3Assignment_3 ) ) ;
    public final void rule__Hd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4303:1: ( ( ( rule__Hd__Le3Assignment_3 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4304:1: ( ( rule__Hd__Le3Assignment_3 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4304:1: ( ( rule__Hd__Le3Assignment_3 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4305:1: ( rule__Hd__Le3Assignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getLe3Assignment_3()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4306:1: ( rule__Hd__Le3Assignment_3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4306:2: rule__Hd__Le3Assignment_3
            {
            pushFollow(FOLLOW_rule__Hd__Le3Assignment_3_in_rule__Hd__Group__3__Impl8684);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4316:1: rule__Hd__Group__4 : rule__Hd__Group__4__Impl ;
    public final void rule__Hd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4320:1: ( rule__Hd__Group__4__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4321:2: rule__Hd__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Hd__Group__4__Impl_in_rule__Hd__Group__48714);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4327:1: rule__Hd__Group__4__Impl : ( RULE_PARAD ) ;
    public final void rule__Hd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4331:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4332:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4332:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4333:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getPARADTerminalRuleCall_4()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__Hd__Group__4__Impl8741); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4354:1: rule__Tl__Group__0 : rule__Tl__Group__0__Impl rule__Tl__Group__1 ;
    public final void rule__Tl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:1: ( rule__Tl__Group__0__Impl rule__Tl__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:2: rule__Tl__Group__0__Impl rule__Tl__Group__1
            {
            pushFollow(FOLLOW_rule__Tl__Group__0__Impl_in_rule__Tl__Group__08780);
            rule__Tl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tl__Group__1_in_rule__Tl__Group__08783);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4366:1: rule__Tl__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__Tl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4370:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4371:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4371:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4372:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__Tl__Group__0__Impl8810); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4383:1: rule__Tl__Group__1 : rule__Tl__Group__1__Impl rule__Tl__Group__2 ;
    public final void rule__Tl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4387:1: ( rule__Tl__Group__1__Impl rule__Tl__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4388:2: rule__Tl__Group__1__Impl rule__Tl__Group__2
            {
            pushFollow(FOLLOW_rule__Tl__Group__1__Impl_in_rule__Tl__Group__18839);
            rule__Tl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tl__Group__2_in_rule__Tl__Group__18842);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4395:1: rule__Tl__Group__1__Impl : ( 'tl' ) ;
    public final void rule__Tl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4399:1: ( ( 'tl' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4400:1: ( 'tl' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4400:1: ( 'tl' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4401:1: 'tl'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getTlKeyword_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__Tl__Group__1__Impl8870); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4414:1: rule__Tl__Group__2 : rule__Tl__Group__2__Impl rule__Tl__Group__3 ;
    public final void rule__Tl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4418:1: ( rule__Tl__Group__2__Impl rule__Tl__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4419:2: rule__Tl__Group__2__Impl rule__Tl__Group__3
            {
            pushFollow(FOLLOW_rule__Tl__Group__2__Impl_in_rule__Tl__Group__28901);
            rule__Tl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tl__Group__3_in_rule__Tl__Group__28904);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4426:1: rule__Tl__Group__2__Impl : ( ruleLC ) ;
    public final void rule__Tl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4430:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4431:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4431:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4432:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getLCParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Tl__Group__2__Impl8931);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4443:1: rule__Tl__Group__3 : rule__Tl__Group__3__Impl rule__Tl__Group__4 ;
    public final void rule__Tl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4447:1: ( rule__Tl__Group__3__Impl rule__Tl__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4448:2: rule__Tl__Group__3__Impl rule__Tl__Group__4
            {
            pushFollow(FOLLOW_rule__Tl__Group__3__Impl_in_rule__Tl__Group__38960);
            rule__Tl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tl__Group__4_in_rule__Tl__Group__38963);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4455:1: rule__Tl__Group__3__Impl : ( ( rule__Tl__Le4Assignment_3 ) ) ;
    public final void rule__Tl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4459:1: ( ( ( rule__Tl__Le4Assignment_3 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4460:1: ( ( rule__Tl__Le4Assignment_3 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4460:1: ( ( rule__Tl__Le4Assignment_3 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4461:1: ( rule__Tl__Le4Assignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getLe4Assignment_3()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4462:1: ( rule__Tl__Le4Assignment_3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4462:2: rule__Tl__Le4Assignment_3
            {
            pushFollow(FOLLOW_rule__Tl__Le4Assignment_3_in_rule__Tl__Group__3__Impl8990);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4472:1: rule__Tl__Group__4 : rule__Tl__Group__4__Impl ;
    public final void rule__Tl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4476:1: ( rule__Tl__Group__4__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4477:2: rule__Tl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Tl__Group__4__Impl_in_rule__Tl__Group__49020);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4483:1: rule__Tl__Group__4__Impl : ( RULE_PARAD ) ;
    public final void rule__Tl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4487:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4488:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4488:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4489:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getPARADTerminalRuleCall_4()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__Tl__Group__4__Impl9047); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4510:1: rule__SymboleEx__Group__0 : rule__SymboleEx__Group__0__Impl rule__SymboleEx__Group__1 ;
    public final void rule__SymboleEx__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4514:1: ( rule__SymboleEx__Group__0__Impl rule__SymboleEx__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4515:2: rule__SymboleEx__Group__0__Impl rule__SymboleEx__Group__1
            {
            pushFollow(FOLLOW_rule__SymboleEx__Group__0__Impl_in_rule__SymboleEx__Group__09086);
            rule__SymboleEx__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SymboleEx__Group__1_in_rule__SymboleEx__Group__09089);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4522:1: rule__SymboleEx__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__SymboleEx__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4526:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4527:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4527:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4528:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__SymboleEx__Group__0__Impl9116); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4539:1: rule__SymboleEx__Group__1 : rule__SymboleEx__Group__1__Impl rule__SymboleEx__Group__2 ;
    public final void rule__SymboleEx__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4543:1: ( rule__SymboleEx__Group__1__Impl rule__SymboleEx__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4544:2: rule__SymboleEx__Group__1__Impl rule__SymboleEx__Group__2
            {
            pushFollow(FOLLOW_rule__SymboleEx__Group__1__Impl_in_rule__SymboleEx__Group__19145);
            rule__SymboleEx__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SymboleEx__Group__2_in_rule__SymboleEx__Group__19148);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:1: rule__SymboleEx__Group__1__Impl : ( ( rule__SymboleEx__PAssignment_1 ) ) ;
    public final void rule__SymboleEx__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4555:1: ( ( ( rule__SymboleEx__PAssignment_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4556:1: ( ( rule__SymboleEx__PAssignment_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4556:1: ( ( rule__SymboleEx__PAssignment_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4557:1: ( rule__SymboleEx__PAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getPAssignment_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4558:1: ( rule__SymboleEx__PAssignment_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4558:2: rule__SymboleEx__PAssignment_1
            {
            pushFollow(FOLLOW_rule__SymboleEx__PAssignment_1_in_rule__SymboleEx__Group__1__Impl9175);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4568:1: rule__SymboleEx__Group__2 : rule__SymboleEx__Group__2__Impl rule__SymboleEx__Group__3 ;
    public final void rule__SymboleEx__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4572:1: ( rule__SymboleEx__Group__2__Impl rule__SymboleEx__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4573:2: rule__SymboleEx__Group__2__Impl rule__SymboleEx__Group__3
            {
            pushFollow(FOLLOW_rule__SymboleEx__Group__2__Impl_in_rule__SymboleEx__Group__29205);
            rule__SymboleEx__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SymboleEx__Group__3_in_rule__SymboleEx__Group__29208);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4580:1: rule__SymboleEx__Group__2__Impl : ( ( rule__SymboleEx__Le5Assignment_2 ) ) ;
    public final void rule__SymboleEx__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4584:1: ( ( ( rule__SymboleEx__Le5Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4585:1: ( ( rule__SymboleEx__Le5Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4585:1: ( ( rule__SymboleEx__Le5Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4586:1: ( rule__SymboleEx__Le5Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getLe5Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4587:1: ( rule__SymboleEx__Le5Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4587:2: rule__SymboleEx__Le5Assignment_2
            {
            pushFollow(FOLLOW_rule__SymboleEx__Le5Assignment_2_in_rule__SymboleEx__Group__2__Impl9235);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4597:1: rule__SymboleEx__Group__3 : rule__SymboleEx__Group__3__Impl ;
    public final void rule__SymboleEx__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4601:1: ( rule__SymboleEx__Group__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4602:2: rule__SymboleEx__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SymboleEx__Group__3__Impl_in_rule__SymboleEx__Group__39265);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4608:1: rule__SymboleEx__Group__3__Impl : ( RULE_PARAD ) ;
    public final void rule__SymboleEx__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4612:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4613:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4613:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4614:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getPARADTerminalRuleCall_3()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__SymboleEx__Group__3__Impl9292); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4633:1: rule__LExpr__Group__0 : rule__LExpr__Group__0__Impl rule__LExpr__Group__1 ;
    public final void rule__LExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4637:1: ( rule__LExpr__Group__0__Impl rule__LExpr__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4638:2: rule__LExpr__Group__0__Impl rule__LExpr__Group__1
            {
            pushFollow(FOLLOW_rule__LExpr__Group__0__Impl_in_rule__LExpr__Group__09329);
            rule__LExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LExpr__Group__1_in_rule__LExpr__Group__09332);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4645:1: rule__LExpr__Group__0__Impl : ( ruleLC ) ;
    public final void rule__LExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4649:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4650:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4650:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4651:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getLCParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__LExpr__Group__0__Impl9359);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4662:1: rule__LExpr__Group__1 : rule__LExpr__Group__1__Impl ;
    public final void rule__LExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4666:1: ( rule__LExpr__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4667:2: rule__LExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LExpr__Group__1__Impl_in_rule__LExpr__Group__19388);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4673:1: rule__LExpr__Group__1__Impl : ( ( rule__LExpr__ExpLeAssignment_1 ) ) ;
    public final void rule__LExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4677:1: ( ( ( rule__LExpr__ExpLeAssignment_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4678:1: ( ( rule__LExpr__ExpLeAssignment_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4678:1: ( ( rule__LExpr__ExpLeAssignment_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4679:1: ( rule__LExpr__ExpLeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getExpLeAssignment_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4680:1: ( rule__LExpr__ExpLeAssignment_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4680:2: rule__LExpr__ExpLeAssignment_1
            {
            pushFollow(FOLLOW_rule__LExpr__ExpLeAssignment_1_in_rule__LExpr__Group__1__Impl9415);
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


    // $ANTLR start "rule__LExpr2__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4694:1: rule__LExpr2__Group__0 : rule__LExpr2__Group__0__Impl rule__LExpr2__Group__1 ;
    public final void rule__LExpr2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4698:1: ( rule__LExpr2__Group__0__Impl rule__LExpr2__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4699:2: rule__LExpr2__Group__0__Impl rule__LExpr2__Group__1
            {
            pushFollow(FOLLOW_rule__LExpr2__Group__0__Impl_in_rule__LExpr2__Group__09449);
            rule__LExpr2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LExpr2__Group__1_in_rule__LExpr2__Group__09452);
            rule__LExpr2__Group__1();

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
    // $ANTLR end "rule__LExpr2__Group__0"


    // $ANTLR start "rule__LExpr2__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4706:1: rule__LExpr2__Group__0__Impl : ( ruleLC ) ;
    public final void rule__LExpr2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4710:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4711:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4711:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4712:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExpr2Access().getLCParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__LExpr2__Group__0__Impl9479);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExpr2Access().getLCParserRuleCall_0()); 
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
    // $ANTLR end "rule__LExpr2__Group__0__Impl"


    // $ANTLR start "rule__LExpr2__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4723:1: rule__LExpr2__Group__1 : rule__LExpr2__Group__1__Impl ;
    public final void rule__LExpr2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4727:1: ( rule__LExpr2__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4728:2: rule__LExpr2__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LExpr2__Group__1__Impl_in_rule__LExpr2__Group__19508);
            rule__LExpr2__Group__1__Impl();

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
    // $ANTLR end "rule__LExpr2__Group__1"


    // $ANTLR start "rule__LExpr2__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4734:1: rule__LExpr2__Group__1__Impl : ( ( rule__LExpr2__ExpLe2Assignment_1 ) ) ;
    public final void rule__LExpr2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4738:1: ( ( ( rule__LExpr2__ExpLe2Assignment_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4739:1: ( ( rule__LExpr2__ExpLe2Assignment_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4739:1: ( ( rule__LExpr2__ExpLe2Assignment_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4740:1: ( rule__LExpr2__ExpLe2Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExpr2Access().getExpLe2Assignment_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4741:1: ( rule__LExpr2__ExpLe2Assignment_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4741:2: rule__LExpr2__ExpLe2Assignment_1
            {
            pushFollow(FOLLOW_rule__LExpr2__ExpLe2Assignment_1_in_rule__LExpr2__Group__1__Impl9535);
            rule__LExpr2__ExpLe2Assignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExpr2Access().getExpLe2Assignment_1()); 
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
    // $ANTLR end "rule__LExpr2__Group__1__Impl"


    // $ANTLR start "rule__ExprAnd__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4755:1: rule__ExprAnd__Group__0 : rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 ;
    public final void rule__ExprAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4759:1: ( rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4760:2: rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__09569);
            rule__ExprAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__09572);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4767:1: rule__ExprAnd__Group__0__Impl : ( ( rule__ExprAnd__ExpOAssignment_0 ) ) ;
    public final void rule__ExprAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4771:1: ( ( ( rule__ExprAnd__ExpOAssignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4772:1: ( ( rule__ExprAnd__ExpOAssignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4772:1: ( ( rule__ExprAnd__ExpOAssignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4773:1: ( rule__ExprAnd__ExpOAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExpOAssignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4774:1: ( rule__ExprAnd__ExpOAssignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4774:2: rule__ExprAnd__ExpOAssignment_0
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExpOAssignment_0_in_rule__ExprAnd__Group__0__Impl9599);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4784:1: rule__ExprAnd__Group__1 : rule__ExprAnd__Group__1__Impl ;
    public final void rule__ExprAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4788:1: ( rule__ExprAnd__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4789:2: rule__ExprAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__19629);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4795:1: rule__ExprAnd__Group__1__Impl : ( ( rule__ExprAnd__Group_1__0 )* ) ;
    public final void rule__ExprAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4799:1: ( ( ( rule__ExprAnd__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4800:1: ( ( rule__ExprAnd__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4800:1: ( ( rule__ExprAnd__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4801:1: ( rule__ExprAnd__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4802:1: ( rule__ExprAnd__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4802:2: rule__ExprAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl9656);
            	    rule__ExprAnd__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4816:1: rule__ExprAnd__Group_1__0 : rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 ;
    public final void rule__ExprAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4820:1: ( rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4821:2: rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__09691);
            rule__ExprAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__09694);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4828:1: rule__ExprAnd__Group_1__0__Impl : ( ruleLC ) ;
    public final void rule__ExprAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4832:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4833:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4833:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4834:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__0__Impl9721);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4845:1: rule__ExprAnd__Group_1__1 : rule__ExprAnd__Group_1__1__Impl rule__ExprAnd__Group_1__2 ;
    public final void rule__ExprAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4849:1: ( rule__ExprAnd__Group_1__1__Impl rule__ExprAnd__Group_1__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4850:2: rule__ExprAnd__Group_1__1__Impl rule__ExprAnd__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__19750);
            rule__ExprAnd__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__2_in_rule__ExprAnd__Group_1__19753);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4857:1: rule__ExprAnd__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__ExprAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4861:1: ( ( 'and' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4862:1: ( 'and' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4862:1: ( 'and' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4863:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getAndKeyword_1_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__ExprAnd__Group_1__1__Impl9781); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4876:1: rule__ExprAnd__Group_1__2 : rule__ExprAnd__Group_1__2__Impl rule__ExprAnd__Group_1__3 ;
    public final void rule__ExprAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4880:1: ( rule__ExprAnd__Group_1__2__Impl rule__ExprAnd__Group_1__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4881:2: rule__ExprAnd__Group_1__2__Impl rule__ExprAnd__Group_1__3
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__2__Impl_in_rule__ExprAnd__Group_1__29812);
            rule__ExprAnd__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__3_in_rule__ExprAnd__Group_1__29815);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4888:1: rule__ExprAnd__Group_1__2__Impl : ( ruleLC ) ;
    public final void rule__ExprAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4892:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4893:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4893:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4894:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__2__Impl9842);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4905:1: rule__ExprAnd__Group_1__3 : rule__ExprAnd__Group_1__3__Impl ;
    public final void rule__ExprAnd__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4909:1: ( rule__ExprAnd__Group_1__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4910:2: rule__ExprAnd__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__3__Impl_in_rule__ExprAnd__Group_1__39871);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4916:1: rule__ExprAnd__Group_1__3__Impl : ( ( rule__ExprAnd__ExpO2Assignment_1_3 ) ) ;
    public final void rule__ExprAnd__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4920:1: ( ( ( rule__ExprAnd__ExpO2Assignment_1_3 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:1: ( ( rule__ExprAnd__ExpO2Assignment_1_3 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:1: ( ( rule__ExprAnd__ExpO2Assignment_1_3 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4922:1: ( rule__ExprAnd__ExpO2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExpO2Assignment_1_3()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4923:1: ( rule__ExprAnd__ExpO2Assignment_1_3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4923:2: rule__ExprAnd__ExpO2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExpO2Assignment_1_3_in_rule__ExprAnd__Group_1__3__Impl9898);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4941:1: rule__ExprOr__Group__0 : rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 ;
    public final void rule__ExprOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4945:1: ( rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4946:2: rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__09936);
            rule__ExprOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__09939);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4953:1: rule__ExprOr__Group__0__Impl : ( ( rule__ExprOr__ExpNAssignment_0 ) ) ;
    public final void rule__ExprOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4957:1: ( ( ( rule__ExprOr__ExpNAssignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4958:1: ( ( rule__ExprOr__ExpNAssignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4958:1: ( ( rule__ExprOr__ExpNAssignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4959:1: ( rule__ExprOr__ExpNAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExpNAssignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4960:1: ( rule__ExprOr__ExpNAssignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4960:2: rule__ExprOr__ExpNAssignment_0
            {
            pushFollow(FOLLOW_rule__ExprOr__ExpNAssignment_0_in_rule__ExprOr__Group__0__Impl9966);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4970:1: rule__ExprOr__Group__1 : rule__ExprOr__Group__1__Impl ;
    public final void rule__ExprOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4974:1: ( rule__ExprOr__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4975:2: rule__ExprOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__19996);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4981:1: rule__ExprOr__Group__1__Impl : ( ( rule__ExprOr__Group_1__0 )* ) ;
    public final void rule__ExprOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4985:1: ( ( ( rule__ExprOr__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4986:1: ( ( rule__ExprOr__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4986:1: ( ( rule__ExprOr__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4987:1: ( rule__ExprOr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4988:1: ( rule__ExprOr__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4988:2: rule__ExprOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl10023);
            	    rule__ExprOr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5002:1: rule__ExprOr__Group_1__0 : rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 ;
    public final void rule__ExprOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5006:1: ( rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5007:2: rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__010058);
            rule__ExprOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__010061);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5014:1: rule__ExprOr__Group_1__0__Impl : ( ruleLC ) ;
    public final void rule__ExprOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5018:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5019:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5019:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5020:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprOr__Group_1__0__Impl10088);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5031:1: rule__ExprOr__Group_1__1 : rule__ExprOr__Group_1__1__Impl rule__ExprOr__Group_1__2 ;
    public final void rule__ExprOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5035:1: ( rule__ExprOr__Group_1__1__Impl rule__ExprOr__Group_1__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5036:2: rule__ExprOr__Group_1__1__Impl rule__ExprOr__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__110117);
            rule__ExprOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__2_in_rule__ExprOr__Group_1__110120);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5043:1: rule__ExprOr__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__ExprOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5047:1: ( ( 'or' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: ( 'or' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: ( 'or' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5049:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getOrKeyword_1_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__ExprOr__Group_1__1__Impl10148); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5062:1: rule__ExprOr__Group_1__2 : rule__ExprOr__Group_1__2__Impl rule__ExprOr__Group_1__3 ;
    public final void rule__ExprOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5066:1: ( rule__ExprOr__Group_1__2__Impl rule__ExprOr__Group_1__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:2: rule__ExprOr__Group_1__2__Impl rule__ExprOr__Group_1__3
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__2__Impl_in_rule__ExprOr__Group_1__210179);
            rule__ExprOr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__3_in_rule__ExprOr__Group_1__210182);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5074:1: rule__ExprOr__Group_1__2__Impl : ( ruleLC ) ;
    public final void rule__ExprOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5078:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5079:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5079:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5080:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprOr__Group_1__2__Impl10209);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5091:1: rule__ExprOr__Group_1__3 : rule__ExprOr__Group_1__3__Impl ;
    public final void rule__ExprOr__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5095:1: ( rule__ExprOr__Group_1__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5096:2: rule__ExprOr__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__3__Impl_in_rule__ExprOr__Group_1__310238);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5102:1: rule__ExprOr__Group_1__3__Impl : ( ( rule__ExprOr__ExpN2Assignment_1_3 ) ) ;
    public final void rule__ExprOr__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5106:1: ( ( ( rule__ExprOr__ExpN2Assignment_1_3 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5107:1: ( ( rule__ExprOr__ExpN2Assignment_1_3 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5107:1: ( ( rule__ExprOr__ExpN2Assignment_1_3 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5108:1: ( rule__ExprOr__ExpN2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExpN2Assignment_1_3()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5109:1: ( rule__ExprOr__ExpN2Assignment_1_3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5109:2: rule__ExprOr__ExpN2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__ExprOr__ExpN2Assignment_1_3_in_rule__ExprOr__Group_1__3__Impl10265);
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


    // $ANTLR start "rule__ExprNotNot__Group__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5127:1: rule__ExprNotNot__Group__0 : rule__ExprNotNot__Group__0__Impl rule__ExprNotNot__Group__1 ;
    public final void rule__ExprNotNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5131:1: ( rule__ExprNotNot__Group__0__Impl rule__ExprNotNot__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5132:2: rule__ExprNotNot__Group__0__Impl rule__ExprNotNot__Group__1
            {
            pushFollow(FOLLOW_rule__ExprNotNot__Group__0__Impl_in_rule__ExprNotNot__Group__010303);
            rule__ExprNotNot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprNotNot__Group__1_in_rule__ExprNotNot__Group__010306);
            rule__ExprNotNot__Group__1();

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
    // $ANTLR end "rule__ExprNotNot__Group__0"


    // $ANTLR start "rule__ExprNotNot__Group__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5139:1: rule__ExprNotNot__Group__0__Impl : ( ( rule__ExprNotNot__Group_0__0 ) ) ;
    public final void rule__ExprNotNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5143:1: ( ( ( rule__ExprNotNot__Group_0__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5144:1: ( ( rule__ExprNotNot__Group_0__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5144:1: ( ( rule__ExprNotNot__Group_0__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:1: ( rule__ExprNotNot__Group_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotNotAccess().getGroup_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5146:1: ( rule__ExprNotNot__Group_0__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5146:2: rule__ExprNotNot__Group_0__0
            {
            pushFollow(FOLLOW_rule__ExprNotNot__Group_0__0_in_rule__ExprNotNot__Group__0__Impl10333);
            rule__ExprNotNot__Group_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotNotAccess().getGroup_0()); 
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
    // $ANTLR end "rule__ExprNotNot__Group__0__Impl"


    // $ANTLR start "rule__ExprNotNot__Group__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5156:1: rule__ExprNotNot__Group__1 : rule__ExprNotNot__Group__1__Impl ;
    public final void rule__ExprNotNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5160:1: ( rule__ExprNotNot__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5161:2: rule__ExprNotNot__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprNotNot__Group__1__Impl_in_rule__ExprNotNot__Group__110363);
            rule__ExprNotNot__Group__1__Impl();

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
    // $ANTLR end "rule__ExprNotNot__Group__1"


    // $ANTLR start "rule__ExprNotNot__Group__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5167:1: rule__ExprNotNot__Group__1__Impl : ( ( rule__ExprNotNot__ExpEq1Assignment_1 ) ) ;
    public final void rule__ExprNotNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5171:1: ( ( ( rule__ExprNotNot__ExpEq1Assignment_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5172:1: ( ( rule__ExprNotNot__ExpEq1Assignment_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5172:1: ( ( rule__ExprNotNot__ExpEq1Assignment_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5173:1: ( rule__ExprNotNot__ExpEq1Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotNotAccess().getExpEq1Assignment_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5174:1: ( rule__ExprNotNot__ExpEq1Assignment_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5174:2: rule__ExprNotNot__ExpEq1Assignment_1
            {
            pushFollow(FOLLOW_rule__ExprNotNot__ExpEq1Assignment_1_in_rule__ExprNotNot__Group__1__Impl10390);
            rule__ExprNotNot__ExpEq1Assignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotNotAccess().getExpEq1Assignment_1()); 
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
    // $ANTLR end "rule__ExprNotNot__Group__1__Impl"


    // $ANTLR start "rule__ExprNotNot__Group_0__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5188:1: rule__ExprNotNot__Group_0__0 : rule__ExprNotNot__Group_0__0__Impl rule__ExprNotNot__Group_0__1 ;
    public final void rule__ExprNotNot__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5192:1: ( rule__ExprNotNot__Group_0__0__Impl rule__ExprNotNot__Group_0__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5193:2: rule__ExprNotNot__Group_0__0__Impl rule__ExprNotNot__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprNotNot__Group_0__0__Impl_in_rule__ExprNotNot__Group_0__010424);
            rule__ExprNotNot__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprNotNot__Group_0__1_in_rule__ExprNotNot__Group_0__010427);
            rule__ExprNotNot__Group_0__1();

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
    // $ANTLR end "rule__ExprNotNot__Group_0__0"


    // $ANTLR start "rule__ExprNotNot__Group_0__0__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5200:1: rule__ExprNotNot__Group_0__0__Impl : ( 'not' ) ;
    public final void rule__ExprNotNot__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5204:1: ( ( 'not' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:1: ( 'not' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:1: ( 'not' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5206:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotNotAccess().getNotKeyword_0_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__ExprNotNot__Group_0__0__Impl10455); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotNotAccess().getNotKeyword_0_0()); 
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
    // $ANTLR end "rule__ExprNotNot__Group_0__0__Impl"


    // $ANTLR start "rule__ExprNotNot__Group_0__1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:1: rule__ExprNotNot__Group_0__1 : rule__ExprNotNot__Group_0__1__Impl ;
    public final void rule__ExprNotNot__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5223:1: ( rule__ExprNotNot__Group_0__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5224:2: rule__ExprNotNot__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprNotNot__Group_0__1__Impl_in_rule__ExprNotNot__Group_0__110486);
            rule__ExprNotNot__Group_0__1__Impl();

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
    // $ANTLR end "rule__ExprNotNot__Group_0__1"


    // $ANTLR start "rule__ExprNotNot__Group_0__1__Impl"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5230:1: rule__ExprNotNot__Group_0__1__Impl : ( ruleLC ) ;
    public final void rule__ExprNotNot__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5234:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5235:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5235:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5236:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotNotAccess().getLCParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprNotNot__Group_0__1__Impl10513);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotNotAccess().getLCParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__ExprNotNot__Group_0__1__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5251:1: rule__ExprEq__Group_0__0 : rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 ;
    public final void rule__ExprEq__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5255:1: ( rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5256:2: rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__010546);
            rule__ExprEq__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__010549);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5263:1: rule__ExprEq__Group_0__0__Impl : ( ( rule__ExprEq__ExpS1Assignment_0_0 ) ) ;
    public final void rule__ExprEq__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5267:1: ( ( ( rule__ExprEq__ExpS1Assignment_0_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5268:1: ( ( rule__ExprEq__ExpS1Assignment_0_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5268:1: ( ( rule__ExprEq__ExpS1Assignment_0_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5269:1: ( rule__ExprEq__ExpS1Assignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpS1Assignment_0_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5270:1: ( rule__ExprEq__ExpS1Assignment_0_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5270:2: rule__ExprEq__ExpS1Assignment_0_0
            {
            pushFollow(FOLLOW_rule__ExprEq__ExpS1Assignment_0_0_in_rule__ExprEq__Group_0__0__Impl10576);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5280:1: rule__ExprEq__Group_0__1 : rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 ;
    public final void rule__ExprEq__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5284:1: ( rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5285:2: rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__110606);
            rule__ExprEq__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__110609);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5292:1: rule__ExprEq__Group_0__1__Impl : ( '=?' ) ;
    public final void rule__ExprEq__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5296:1: ( ( '=?' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5297:1: ( '=?' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5297:1: ( '=?' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5298:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__ExprEq__Group_0__1__Impl10637); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5311:1: rule__ExprEq__Group_0__2 : rule__ExprEq__Group_0__2__Impl ;
    public final void rule__ExprEq__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5315:1: ( rule__ExprEq__Group_0__2__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5316:2: rule__ExprEq__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__210668);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5322:1: rule__ExprEq__Group_0__2__Impl : ( ( rule__ExprEq__ExpS2Assignment_0_2 ) ) ;
    public final void rule__ExprEq__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5326:1: ( ( ( rule__ExprEq__ExpS2Assignment_0_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5327:1: ( ( rule__ExprEq__ExpS2Assignment_0_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5327:1: ( ( rule__ExprEq__ExpS2Assignment_0_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5328:1: ( rule__ExprEq__ExpS2Assignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpS2Assignment_0_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5329:1: ( rule__ExprEq__ExpS2Assignment_0_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5329:2: rule__ExprEq__ExpS2Assignment_0_2
            {
            pushFollow(FOLLOW_rule__ExprEq__ExpS2Assignment_0_2_in_rule__ExprEq__Group_0__2__Impl10695);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5345:1: rule__ExprEq__Group_1__0 : rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 ;
    public final void rule__ExprEq__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5349:1: ( rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5350:2: rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__010731);
            rule__ExprEq__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__010734);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5357:1: rule__ExprEq__Group_1__0__Impl : ( RULE_PARAG ) ;
    public final void rule__ExprEq__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5361:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5362:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5362:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5363:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getPARAGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__ExprEq__Group_1__0__Impl10761); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5374:1: rule__ExprEq__Group_1__1 : rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 ;
    public final void rule__ExprEq__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5378:1: ( rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5379:2: rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__110790);
            rule__ExprEq__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__110793);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5386:1: rule__ExprEq__Group_1__1__Impl : ( ( rule__ExprEq__ExpRAssignment_1_1 ) ) ;
    public final void rule__ExprEq__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5390:1: ( ( ( rule__ExprEq__ExpRAssignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5391:1: ( ( rule__ExprEq__ExpRAssignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5391:1: ( ( rule__ExprEq__ExpRAssignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5392:1: ( rule__ExprEq__ExpRAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpRAssignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5393:1: ( rule__ExprEq__ExpRAssignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5393:2: rule__ExprEq__ExpRAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprEq__ExpRAssignment_1_1_in_rule__ExprEq__Group_1__1__Impl10820);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5403:1: rule__ExprEq__Group_1__2 : rule__ExprEq__Group_1__2__Impl ;
    public final void rule__ExprEq__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5407:1: ( rule__ExprEq__Group_1__2__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5408:2: rule__ExprEq__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__210850);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5414:1: rule__ExprEq__Group_1__2__Impl : ( RULE_PARAD ) ;
    public final void rule__ExprEq__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5418:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5419:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5419:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5420:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getPARADTerminalRuleCall_1_2()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__ExprEq__Group_1__2__Impl10877); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5438:1: rule__Model__ProgrammeAssignment : ( ruleProgramme ) ;
    public final void rule__Model__ProgrammeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5442:1: ( ( ruleProgramme ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5443:1: ( ruleProgramme )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5443:1: ( ruleProgramme )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5444:1: ruleProgramme
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getProgrammeProgrammeParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleProgramme_in_rule__Model__ProgrammeAssignment10917);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5453:1: rule__Programme__FonctAssignment_1_0 : ( ruleFonction ) ;
    public final void rule__Programme__FonctAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5457:1: ( ( ruleFonction ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5458:1: ( ruleFonction )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5458:1: ( ruleFonction )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5459:1: ruleFonction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getFonctFonctionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleFonction_in_rule__Programme__FonctAssignment_1_010948);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5468:1: rule__Fonction__SymboleAssignment_2 : ( RULE_SYM ) ;
    public final void rule__Fonction__SymboleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5472:1: ( ( RULE_SYM ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5473:1: ( RULE_SYM )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5473:1: ( RULE_SYM )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5474:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getSymboleSYMTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__Fonction__SymboleAssignment_210979); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5483:1: rule__Fonction__InAssignment_7 : ( ruleInput ) ;
    public final void rule__Fonction__InAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5487:1: ( ( ruleInput ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5488:1: ( ruleInput )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5488:1: ( ruleInput )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5489:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getInInputParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Fonction__InAssignment_711010);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5498:1: rule__Fonction__ComAssignment_9 : ( ruleCommandes ) ;
    public final void rule__Fonction__ComAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5502:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5503:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5503:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5504:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getComCommandesParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__Fonction__ComAssignment_911041);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5513:1: rule__Fonction__OutAssignment_13 : ( ruleOutput ) ;
    public final void rule__Fonction__OutAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5517:1: ( ( ruleOutput ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5518:1: ( ruleOutput )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5518:1: ( ruleOutput )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5519:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getOutOutputParserRuleCall_13_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Fonction__OutAssignment_1311072);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5528:1: rule__Input__Var1Assignment_0 : ( RULE_VAR ) ;
    public final void rule__Input__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5532:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5533:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5533:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5534:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVar1VARTerminalRuleCall_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Input__Var1Assignment_011103); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5543:1: rule__Input__Var2Assignment_1_1 : ( RULE_VAR ) ;
    public final void rule__Input__Var2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5548:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5548:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5549:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVar2VARTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Input__Var2Assignment_1_111134); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5558:1: rule__Output__Var1Assignment_0 : ( RULE_VAR ) ;
    public final void rule__Output__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5562:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5563:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5563:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5564:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVar1VARTerminalRuleCall_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Output__Var1Assignment_011165); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5573:1: rule__Output__Var2Assignment_1_1 : ( RULE_VAR ) ;
    public final void rule__Output__Var2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5577:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5578:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5578:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5579:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVar2VARTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Output__Var2Assignment_1_111196); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5588:1: rule__Commandes__Com1Assignment_0 : ( ruleCommande ) ;
    public final void rule__Commandes__Com1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5592:1: ( ( ruleCommande ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5593:1: ( ruleCommande )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5593:1: ( ruleCommande )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5594:1: ruleCommande
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getCom1CommandeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommande_in_rule__Commandes__Com1Assignment_011227);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5603:1: rule__Commandes__Com2Assignment_1_1 : ( ruleCommande ) ;
    public final void rule__Commandes__Com2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5607:1: ( ( ruleCommande ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5608:1: ( ruleCommande )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5608:1: ( ruleCommande )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5609:1: ruleCommande
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getCom2CommandeParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCommande_in_rule__Commandes__Com2Assignment_1_111258);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5618:1: rule__Commande__NopAssignment_0_1 : ( ( 'nop' ) ) ;
    public final void rule__Commande__NopAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5622:1: ( ( ( 'nop' ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5623:1: ( ( 'nop' ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5623:1: ( ( 'nop' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5624:1: ( 'nop' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getNopNopKeyword_0_1_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5625:1: ( 'nop' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5626:1: 'nop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getNopNopKeyword_0_1_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Commande__NopAssignment_0_111294); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5641:1: rule__Commande__AffectVarAssignment_1 : ( ruleAffectVar ) ;
    public final void rule__Commande__AffectVarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5645:1: ( ( ruleAffectVar ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5646:1: ( ruleAffectVar )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5646:1: ( ruleAffectVar )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5647:1: ruleAffectVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getAffectVarAffectVarParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAffectVar_in_rule__Commande__AffectVarAssignment_111333);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5656:1: rule__Commande__WhileCAssignment_2 : ( ruleWhile ) ;
    public final void rule__Commande__WhileCAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5660:1: ( ( ruleWhile ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5661:1: ( ruleWhile )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5661:1: ( ruleWhile )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5662:1: ruleWhile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getWhileCWhileParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_rule__Commande__WhileCAssignment_211364);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5671:1: rule__Commande__ForCAssignment_3 : ( ruleFor ) ;
    public final void rule__Commande__ForCAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5675:1: ( ( ruleFor ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:1: ( ruleFor )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:1: ( ruleFor )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5677:1: ruleFor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getForCForParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFor_in_rule__Commande__ForCAssignment_311395);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5686:1: rule__Commande__IfCAssignment_4 : ( ruleIf ) ;
    public final void rule__Commande__IfCAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5690:1: ( ( ruleIf ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5691:1: ( ruleIf )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5691:1: ( ruleIf )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5692:1: ruleIf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getIfCIfParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleIf_in_rule__Commande__IfCAssignment_411426);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5701:1: rule__Commande__ForeachCAssignment_5 : ( ruleForeach ) ;
    public final void rule__Commande__ForeachCAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5705:1: ( ( ruleForeach ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5706:1: ( ruleForeach )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5706:1: ( ruleForeach )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5707:1: ruleForeach
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getForeachCForeachParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleForeach_in_rule__Commande__ForeachCAssignment_511457);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5716:1: rule__AffectVar__Var1Assignment_0 : ( ruleVars ) ;
    public final void rule__AffectVar__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5720:1: ( ( ruleVars ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5721:1: ( ruleVars )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5721:1: ( ruleVars )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5722:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getVar1VarsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__AffectVar__Var1Assignment_011488);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5731:1: rule__AffectVar__ExpAssignment_2 : ( ruleExprs ) ;
    public final void rule__AffectVar__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5735:1: ( ( ruleExprs ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5736:1: ( ruleExprs )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5736:1: ( ruleExprs )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5737:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getExpExprsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__AffectVar__ExpAssignment_211519);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5746:1: rule__While__Exp2Assignment_2 : ( ruleExpr ) ;
    public final void rule__While__Exp2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5750:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5751:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5751:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5752:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExp2ExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__While__Exp2Assignment_211550);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5761:1: rule__While__Com3Assignment_6 : ( ruleCommandes ) ;
    public final void rule__While__Com3Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5765:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5766:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5766:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5767:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getCom3CommandesParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__While__Com3Assignment_611581);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5776:1: rule__For__Exp3Assignment_2 : ( ruleExpr ) ;
    public final void rule__For__Exp3Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5780:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5781:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5781:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5782:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getExp3ExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__For__Exp3Assignment_211612);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5791:1: rule__For__Com4Assignment_6 : ( ruleCommandes ) ;
    public final void rule__For__Com4Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5795:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5796:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5796:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5797:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCom4CommandesParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__For__Com4Assignment_611643);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5806:1: rule__If__Exp4Assignment_2 : ( ruleExpr ) ;
    public final void rule__If__Exp4Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5810:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5811:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5811:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5812:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExp4ExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__If__Exp4Assignment_211674);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5821:1: rule__If__Com5Assignment_6 : ( ruleCommandes ) ;
    public final void rule__If__Com5Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5825:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5826:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5826:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5827:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCom5CommandesParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__If__Com5Assignment_611705);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5836:1: rule__If__Com6Assignment_8_2 : ( ruleCommandes ) ;
    public final void rule__If__Com6Assignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5840:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5841:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5841:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5842:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCom6CommandesParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__If__Com6Assignment_8_211736);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5851:1: rule__Foreach__Exp5Assignment_2 : ( ruleExpr ) ;
    public final void rule__Foreach__Exp5Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5855:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5856:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5856:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5857:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getExp5ExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Foreach__Exp5Assignment_211767);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5866:1: rule__Foreach__Exp6Assignment_6 : ( ruleExpr ) ;
    public final void rule__Foreach__Exp6Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5870:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5871:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5871:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5872:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getExp6ExprParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Foreach__Exp6Assignment_611798);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5881:1: rule__Foreach__Com7Assignment_10 : ( ruleCommandes ) ;
    public final void rule__Foreach__Com7Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5885:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5886:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5886:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5887:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getCom7CommandesParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__Foreach__Com7Assignment_1011829);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5896:1: rule__Vars__Var2Assignment_0 : ( RULE_VAR ) ;
    public final void rule__Vars__Var2Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5900:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5901:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5901:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5902:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVar2VARTerminalRuleCall_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Vars__Var2Assignment_011860); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5911:1: rule__Vars__Var3Assignment_1_1 : ( RULE_VAR ) ;
    public final void rule__Vars__Var3Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5915:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5916:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5916:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5917:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVar3VARTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Vars__Var3Assignment_1_111891); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5926:1: rule__Exprs__ExprSAssignment_0 : ( ruleExpr ) ;
    public final void rule__Exprs__ExprSAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5930:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5931:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5931:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5932:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprSExprParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExprSAssignment_011922);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5941:1: rule__Exprs__ExprS2Assignment_1_1 : ( ruleExpr ) ;
    public final void rule__Exprs__ExprS2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5945:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5946:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5946:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5947:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprS2ExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExprS2Assignment_1_111953);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5956:1: rule__Expr__ExpAAssignment_0 : ( ruleExprAnd ) ;
    public final void rule__Expr__ExpAAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5960:1: ( ( ruleExprAnd ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5961:1: ( ruleExprAnd )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5961:1: ( ruleExprAnd )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5962:1: ruleExprAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExpAExprAndParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_rule__Expr__ExpAAssignment_011984);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5971:1: rule__Expr__ExpSAssignment_1 : ( ruleExprSimple ) ;
    public final void rule__Expr__ExpSAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5975:1: ( ( ruleExprSimple ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5976:1: ( ruleExprSimple )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5976:1: ( ruleExprSimple )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5977:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExpSExprSimpleParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__Expr__ExpSAssignment_112015);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5986:1: rule__ExprSimple__VideAssignment_0_1 : ( ( 'nil' ) ) ;
    public final void rule__ExprSimple__VideAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5990:1: ( ( ( 'nil' ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5991:1: ( ( 'nil' ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5991:1: ( ( 'nil' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5992:1: ( 'nil' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVideNilKeyword_0_1_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5993:1: ( 'nil' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5994:1: 'nil'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVideNilKeyword_0_1_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__ExprSimple__VideAssignment_0_112051); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6009:1: rule__ExprSimple__VariableAssignment_1 : ( RULE_VAR ) ;
    public final void rule__ExprSimple__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6013:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6014:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6014:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6015:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVariableVARTerminalRuleCall_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__ExprSimple__VariableAssignment_112090); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6024:1: rule__ExprSimple__SymboleAssignment_2 : ( RULE_SYM ) ;
    public final void rule__ExprSimple__SymboleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6028:1: ( ( RULE_SYM ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6029:1: ( RULE_SYM )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6029:1: ( RULE_SYM )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6030:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymboleSYMTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__ExprSimple__SymboleAssignment_212121); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6039:1: rule__ExprSimple__ConsAssignment_3 : ( ruleCons ) ;
    public final void rule__ExprSimple__ConsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6043:1: ( ( ruleCons ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6044:1: ( ruleCons )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6044:1: ( ruleCons )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6045:1: ruleCons
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getConsConsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCons_in_rule__ExprSimple__ConsAssignment_312152);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6054:1: rule__ExprSimple__ListeAssignment_4 : ( ruleListe ) ;
    public final void rule__ExprSimple__ListeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6058:1: ( ( ruleListe ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6059:1: ( ruleListe )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6059:1: ( ruleListe )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6060:1: ruleListe
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getListeListeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleListe_in_rule__ExprSimple__ListeAssignment_412183);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6069:1: rule__ExprSimple__HdAssignment_5 : ( ruleHd ) ;
    public final void rule__ExprSimple__HdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6073:1: ( ( ruleHd ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6074:1: ( ruleHd )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6074:1: ( ruleHd )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6075:1: ruleHd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getHdHdParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleHd_in_rule__ExprSimple__HdAssignment_512214);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6084:1: rule__ExprSimple__TlAssignment_6 : ( ruleTl ) ;
    public final void rule__ExprSimple__TlAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6088:1: ( ( ruleTl ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6089:1: ( ruleTl )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6089:1: ( ruleTl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6090:1: ruleTl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getTlTlParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleTl_in_rule__ExprSimple__TlAssignment_612245);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6099:1: rule__ExprSimple__SymbolExAssignment_7 : ( ruleSymboleEx ) ;
    public final void rule__ExprSimple__SymbolExAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6103:1: ( ( ruleSymboleEx ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6104:1: ( ruleSymboleEx )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6104:1: ( ruleSymboleEx )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6105:1: ruleSymboleEx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymbolExSymboleExParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleSymboleEx_in_rule__ExprSimple__SymbolExAssignment_712276);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6114:1: rule__Cons__Le1Assignment_2 : ( ruleLExpr ) ;
    public final void rule__Cons__Le1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6118:1: ( ( ruleLExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6119:1: ( ruleLExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6119:1: ( ruleLExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6120:1: ruleLExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getLe1LExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_rule__Cons__Le1Assignment_212307);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6129:1: rule__Liste__Le2Assignment_2 : ( ruleLExpr ) ;
    public final void rule__Liste__Le2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6133:1: ( ( ruleLExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6134:1: ( ruleLExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6134:1: ( ruleLExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6135:1: ruleLExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getLe2LExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_rule__Liste__Le2Assignment_212338);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6144:1: rule__Hd__Le3Assignment_3 : ( ruleExpr ) ;
    public final void rule__Hd__Le3Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6148:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6149:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6149:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6150:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getLe3ExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Hd__Le3Assignment_312369);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6159:1: rule__Tl__Le4Assignment_3 : ( ruleExpr ) ;
    public final void rule__Tl__Le4Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6163:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6164:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6164:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6165:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getLe4ExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Tl__Le4Assignment_312400);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6174:1: rule__SymboleEx__PAssignment_1 : ( RULE_SYM ) ;
    public final void rule__SymboleEx__PAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6178:1: ( ( RULE_SYM ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6179:1: ( RULE_SYM )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6179:1: ( RULE_SYM )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6180:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getPSYMTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__SymboleEx__PAssignment_112431); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6189:1: rule__SymboleEx__Le5Assignment_2 : ( ruleLExpr2 ) ;
    public final void rule__SymboleEx__Le5Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6193:1: ( ( ruleLExpr2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6194:1: ( ruleLExpr2 )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6194:1: ( ruleLExpr2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6195:1: ruleLExpr2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getLe5LExpr2ParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLExpr2_in_rule__SymboleEx__Le5Assignment_212462);
            ruleLExpr2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymboleExAccess().getLe5LExpr2ParserRuleCall_2_0()); 
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6204:1: rule__LExpr__ExpLeAssignment_1 : ( ruleExpr ) ;
    public final void rule__LExpr__ExpLeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6208:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6209:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6209:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6210:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getExpLeExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__LExpr__ExpLeAssignment_112493);
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


    // $ANTLR start "rule__LExpr2__ExpLe2Assignment_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6219:1: rule__LExpr2__ExpLe2Assignment_1 : ( ruleExpr ) ;
    public final void rule__LExpr2__ExpLe2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6223:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6224:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6224:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6225:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExpr2Access().getExpLe2ExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__LExpr2__ExpLe2Assignment_112524);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExpr2Access().getExpLe2ExprParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__LExpr2__ExpLe2Assignment_1"


    // $ANTLR start "rule__ExprAnd__ExpOAssignment_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6234:1: rule__ExprAnd__ExpOAssignment_0 : ( ruleExprOr ) ;
    public final void rule__ExprAnd__ExpOAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6238:1: ( ( ruleExprOr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6239:1: ( ruleExprOr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6239:1: ( ruleExprOr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6240:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExpOExprOrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprAnd__ExpOAssignment_012555);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6249:1: rule__ExprAnd__ExpO2Assignment_1_3 : ( ruleExprOr ) ;
    public final void rule__ExprAnd__ExpO2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6253:1: ( ( ruleExprOr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6254:1: ( ruleExprOr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6254:1: ( ruleExprOr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6255:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExpO2ExprOrParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprAnd__ExpO2Assignment_1_312586);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6264:1: rule__ExprOr__ExpNAssignment_0 : ( ruleExprNot ) ;
    public final void rule__ExprOr__ExpNAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6268:1: ( ( ruleExprNot ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6269:1: ( ruleExprNot )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6269:1: ( ruleExprNot )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6270:1: ruleExprNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExpNExprNotParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_rule__ExprOr__ExpNAssignment_012617);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6279:1: rule__ExprOr__ExpN2Assignment_1_3 : ( ruleExprNot ) ;
    public final void rule__ExprOr__ExpN2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6283:1: ( ( ruleExprNot ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6284:1: ( ruleExprNot )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6284:1: ( ruleExprNot )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6285:1: ruleExprNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExpN2ExprNotParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_rule__ExprOr__ExpN2Assignment_1_312648);
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


    // $ANTLR start "rule__ExprNot__ExprNotNotAssignment_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6294:1: rule__ExprNot__ExprNotNotAssignment_0 : ( ruleExprNotNot ) ;
    public final void rule__ExprNot__ExprNotNotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6298:1: ( ( ruleExprNotNot ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6299:1: ( ruleExprNotNot )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6299:1: ( ruleExprNotNot )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6300:1: ruleExprNotNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExprNotNotExprNotNotParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprNotNot_in_rule__ExprNot__ExprNotNotAssignment_012679);
            ruleExprNotNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getExprNotNotExprNotNotParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__ExprNot__ExprNotNotAssignment_0"


    // $ANTLR start "rule__ExprNot__ExprNotDoAssignment_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6309:1: rule__ExprNot__ExprNotDoAssignment_1 : ( ruleExprNotDo ) ;
    public final void rule__ExprNot__ExprNotDoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6313:1: ( ( ruleExprNotDo ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6314:1: ( ruleExprNotDo )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6314:1: ( ruleExprNotDo )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6315:1: ruleExprNotDo
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExprNotDoExprNotDoParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprNotDo_in_rule__ExprNot__ExprNotDoAssignment_112710);
            ruleExprNotDo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getExprNotDoExprNotDoParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ExprNot__ExprNotDoAssignment_1"


    // $ANTLR start "rule__ExprNotNot__ExpEq1Assignment_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6324:1: rule__ExprNotNot__ExpEq1Assignment_1 : ( ruleExprEq ) ;
    public final void rule__ExprNotNot__ExpEq1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6328:1: ( ( ruleExprEq ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6329:1: ( ruleExprEq )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6329:1: ( ruleExprEq )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6330:1: ruleExprEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotNotAccess().getExpEq1ExprEqParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_rule__ExprNotNot__ExpEq1Assignment_112741);
            ruleExprEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotNotAccess().getExpEq1ExprEqParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ExprNotNot__ExpEq1Assignment_1"


    // $ANTLR start "rule__ExprNotDo__ExpEq2Assignment"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6339:1: rule__ExprNotDo__ExpEq2Assignment : ( ruleExprEq ) ;
    public final void rule__ExprNotDo__ExpEq2Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6343:1: ( ( ruleExprEq ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6344:1: ( ruleExprEq )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6344:1: ( ruleExprEq )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6345:1: ruleExprEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotDoAccess().getExpEq2ExprEqParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_rule__ExprNotDo__ExpEq2Assignment12772);
            ruleExprEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotDoAccess().getExpEq2ExprEqParserRuleCall_0()); 
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
    // $ANTLR end "rule__ExprNotDo__ExpEq2Assignment"


    // $ANTLR start "rule__ExprEq__ExpS1Assignment_0_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6354:1: rule__ExprEq__ExpS1Assignment_0_0 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExpS1Assignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6358:1: ( ( ruleExprSimple ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6359:1: ( ruleExprSimple )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6359:1: ( ruleExprSimple )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6360:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpS1ExprSimpleParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExpS1Assignment_0_012803);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6369:1: rule__ExprEq__ExpS2Assignment_0_2 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExpS2Assignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6373:1: ( ( ruleExprSimple ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6374:1: ( ruleExprSimple )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6374:1: ( ruleExprSimple )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6375:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpS2ExprSimpleParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExpS2Assignment_0_212834);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6384:1: rule__ExprEq__ExpRAssignment_1_1 : ( ruleExpr ) ;
    public final void rule__ExprEq__ExpRAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6388:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6389:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6389:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6390:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpRExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprEq__ExpRAssignment_1_112865);
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

    // $ANTLR start synpred9_InternalMyDsl
    public final void synpred9_InternalMyDsl_fragment() throws RecognitionException {   
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( ( ( rule__Expr__ExpAAssignment_0 ) ) )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( ( rule__Expr__ExpAAssignment_0 ) )
        {
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( ( rule__Expr__ExpAAssignment_0 ) )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( rule__Expr__ExpAAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getExpAAssignment_0()); 
        }
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: ( rule__Expr__ExpAAssignment_0 )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:968:2: rule__Expr__ExpAAssignment_0
        {
        pushFollow(FOLLOW_rule__Expr__ExpAAssignment_0_in_synpred9_InternalMyDsl2034);
        rule__Expr__ExpAAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9_InternalMyDsl

    // $ANTLR start synpred18_InternalMyDsl
    public final void synpred18_InternalMyDsl_fragment() throws RecognitionException {   
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( ( ( rule__ExprEq__Group_0__0 ) ) )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( ( rule__ExprEq__Group_0__0 ) )
        {
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( ( rule__ExprEq__Group_0__0 ) )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: ( rule__ExprEq__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprEqAccess().getGroup_0()); 
        }
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: ( rule__ExprEq__Group_0__0 )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:2: rule__ExprEq__Group_0__0
        {
        pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_synpred18_InternalMyDsl2295);
        rule__ExprEq__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalMyDsl

    // Delegated rules

    public final boolean synpred9_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA6_eotS =
        "\12\uffff";
    static final String DFA6_eofS =
        "\12\uffff";
    static final String DFA6_minS =
        "\1\10\3\uffff\1\12\5\uffff";
    static final String DFA6_maxS =
        "\1\57\3\uffff\1\51\5\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\10\1\6\1\5\1\4\1\7";
    static final String DFA6_specialS =
        "\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\4\1\uffff\1\3\1\2\43\uffff\1\1",
            "",
            "",
            "",
            "\1\5\33\uffff\1\10\1\7\1\6\1\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "983:1: rule__ExprSimple__Alternatives : ( ( ( rule__ExprSimple__Group_0__0 ) ) | ( ( rule__ExprSimple__VariableAssignment_1 ) ) | ( ( rule__ExprSimple__SymboleAssignment_2 ) ) | ( ( rule__ExprSimple__ConsAssignment_3 ) ) | ( ( rule__ExprSimple__ListeAssignment_4 ) ) | ( ( rule__ExprSimple__HdAssignment_5 ) ) | ( ( rule__ExprSimple__TlAssignment_6 ) ) | ( ( rule__ExprSimple__SymbolExAssignment_7 ) ) );";
        }
    }
    static final String DFA18_eotS =
        "\7\uffff";
    static final String DFA18_eofS =
        "\1\1\1\uffff\4\1\1\uffff";
    static final String DFA18_minS =
        "\1\4\1\uffff\4\4\1\uffff";
    static final String DFA18_maxS =
        "\1\57\1\uffff\4\57\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\4\uffff\1\1";
    static final String DFA18_specialS =
        "\7\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\3\1\4\1\5\4\1\13\uffff\1\1\1\uffff\2\1\2\uffff\2\1\2"+
            "\uffff\3\1\1\uffff\1\1\4\uffff\1\6\1\uffff\1\1\2\uffff\1\1",
            "",
            "\1\2\1\3\1\4\1\5\1\1\1\uffff\2\1\21\uffff\2\1\2\uffff\3\1"+
            "\1\uffff\1\1\4\uffff\1\6\1\uffff\1\1\2\uffff\1\1",
            "\1\2\1\3\1\4\1\5\1\1\1\uffff\2\1\21\uffff\2\1\2\uffff\3\1"+
            "\1\uffff\1\1\4\uffff\1\6\1\uffff\1\1\2\uffff\1\1",
            "\1\2\1\3\1\4\1\5\1\1\1\uffff\2\1\21\uffff\2\1\2\uffff\3\1"+
            "\1\uffff\1\1\4\uffff\1\6\1\uffff\1\1\2\uffff\1\1",
            "\1\2\1\3\1\4\1\5\1\1\1\uffff\2\1\21\uffff\2\1\2\uffff\3\1"+
            "\1\uffff\1\1\4\uffff\1\6\1\uffff\1\1\2\uffff\1\1",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 4802:1: ( rule__ExprAnd__Group_1__0 )*";
        }
    }
    static final String DFA19_eotS =
        "\7\uffff";
    static final String DFA19_eofS =
        "\1\1\1\uffff\4\1\1\uffff";
    static final String DFA19_minS =
        "\1\4\1\uffff\4\4\1\uffff";
    static final String DFA19_maxS =
        "\1\57\1\uffff\4\57\1\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\2\4\uffff\1\1";
    static final String DFA19_specialS =
        "\7\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\1\3\1\4\1\5\4\1\13\uffff\1\1\1\uffff\2\1\2\uffff\2\1\2"+
            "\uffff\3\1\1\uffff\1\1\4\uffff\1\1\1\6\1\1\2\uffff\1\1",
            "",
            "\1\2\1\3\1\4\1\5\1\1\1\uffff\2\1\21\uffff\2\1\2\uffff\3\1"+
            "\1\uffff\1\1\4\uffff\1\1\1\6\1\1\2\uffff\1\1",
            "\1\2\1\3\1\4\1\5\1\1\1\uffff\2\1\21\uffff\2\1\2\uffff\3\1"+
            "\1\uffff\1\1\4\uffff\1\1\1\6\1\1\2\uffff\1\1",
            "\1\2\1\3\1\4\1\5\1\1\1\uffff\2\1\21\uffff\2\1\2\uffff\3\1"+
            "\1\uffff\1\1\4\uffff\1\1\1\6\1\1\2\uffff\1\1",
            "\1\2\1\3\1\4\1\5\1\1\1\uffff\2\1\21\uffff\2\1\2\uffff\3\1"+
            "\1\uffff\1\1\4\uffff\1\1\1\6\1\1\2\uffff\1\1",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 4988:1: ( rule__ExprOr__Group_1__0 )*";
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
    public static final BitSet FOLLOW_ruleLExpr2_in_entryRuleLExpr21404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLExpr21411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr2__Group__0_in_ruleLExpr21439 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__LExpr2__Group__0_in_ruleLExpr21451 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd1481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__0_in_ruleExprAnd1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr1541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__0_in_ruleExprOr1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_entryRuleExprNot1601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNot1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Alternatives_in_ruleExprNot1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNotNot_in_entryRuleExprNotNot1661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNotNot1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group__0_in_ruleExprNotNot1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNotDo_in_entryRuleExprNotDo1721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNotDo1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotDo__ExpEq2Assignment_in_ruleExprNotDo1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_entryRuleExprEq1781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEq1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Alternatives_in_ruleExprEq1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_entryRuleLC1841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLC1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LC__Alternatives_in_ruleLC1874 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__Commande__Group_0__0_in_rule__Commande__Alternatives1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__AffectVarAssignment_1_in_rule__Commande__Alternatives1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__WhileCAssignment_2_in_rule__Commande__Alternatives1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__ForCAssignment_3_in_rule__Commande__Alternatives1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__IfCAssignment_4_in_rule__Commande__Alternatives1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__ForeachCAssignment_5_in_rule__Commande__Alternatives2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpAAssignment_0_in_rule__Expr__Alternatives2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpSAssignment_1_in_rule__Expr__Alternatives2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_0__0_in_rule__ExprSimple__Alternatives2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__VariableAssignment_1_in_rule__ExprSimple__Alternatives2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymboleAssignment_2_in_rule__ExprSimple__Alternatives2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ConsAssignment_3_in_rule__ExprSimple__Alternatives2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ListeAssignment_4_in_rule__ExprSimple__Alternatives2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__HdAssignment_5_in_rule__ExprSimple__Alternatives2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__TlAssignment_6_in_rule__ExprSimple__Alternatives2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymbolExAssignment_7_in_rule__ExprSimple__Alternatives2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__ExprNotNotAssignment_0_in_rule__ExprNot__Alternatives2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__ExprNotDoAssignment_1_in_rule__ExprNot__Alternatives2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_rule__LC__Alternatives2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_rule__LC__Alternatives2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAB_in_rule__LC__Alternatives2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__LC__Alternatives2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__Group__0__Impl_in_rule__Programme__Group__02427 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Programme__Group__1_in_rule__Programme__Group__02430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__Group__1__Impl_in_rule__Programme__Group__12488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__Group_1__0_in_rule__Programme__Group__1__Impl2515 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Programme__Group_1__0__Impl_in_rule__Programme__Group_1__02550 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Programme__Group_1__1_in_rule__Programme__Group_1__02553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__FonctAssignment_1_0_in_rule__Programme__Group_1__0__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__Group_1__1__Impl_in_rule__Programme__Group_1__12610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_rule__Programme__Group_1__1__Impl2638 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Fonction__Group__0__Impl_in_rule__Fonction__Group__02673 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Fonction__Group__1_in_rule__Fonction__Group__02676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Fonction__Group__0__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__1__Impl_in_rule__Fonction__Group__12735 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Fonction__Group__2_in_rule__Fonction__Group__12738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Fonction__Group__1__Impl2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__2__Impl_in_rule__Fonction__Group__22794 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__3_in_rule__Fonction__Group__22797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__SymboleAssignment_2_in_rule__Fonction__Group__2__Impl2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__3__Impl_in_rule__Fonction__Group__32854 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Fonction__Group__4_in_rule__Fonction__Group__32857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Fonction__Group__3__Impl2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__4__Impl_in_rule__Fonction__Group__42916 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__5_in_rule__Fonction__Group__42919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Fonction__Group__4__Impl2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__5__Impl_in_rule__Fonction__Group__52975 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Fonction__Group__6_in_rule__Fonction__Group__52978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Fonction__Group__5__Impl3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__6__Impl_in_rule__Fonction__Group__63037 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Fonction__Group__7_in_rule__Fonction__Group__63040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Fonction__Group__6__Impl3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__7__Impl_in_rule__Fonction__Group__73096 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__8_in_rule__Fonction__Group__73099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__InAssignment_7_in_rule__Fonction__Group__7__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__8__Impl_in_rule__Fonction__Group__83156 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__Fonction__Group__9_in_rule__Fonction__Group__83159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Fonction__Group__8__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__9__Impl_in_rule__Fonction__Group__93218 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__10_in_rule__Fonction__Group__93221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__ComAssignment_9_in_rule__Fonction__Group__9__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__10__Impl_in_rule__Fonction__Group__103278 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__11_in_rule__Fonction__Group__103281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Fonction__Group__10__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__11__Impl_in_rule__Fonction__Group__113340 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Fonction__Group__12_in_rule__Fonction__Group__113343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Fonction__Group__11__Impl3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__12__Impl_in_rule__Fonction__Group__123402 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Fonction__Group__13_in_rule__Fonction__Group__123405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Fonction__Group__12__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__13__Impl_in_rule__Fonction__Group__133461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__OutAssignment_13_in_rule__Fonction__Group__13__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__03546 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__03549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Var1Assignment_0_in_rule__Input__Group__0__Impl3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__13606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3633 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03668 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Input__Group_1__0__Impl3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Var2Assignment_1_1_in_rule__Input__Group_1__1__Impl3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03791 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Var1Assignment_0_in_rule__Output__Group__0__Impl3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3878 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03913 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Output__Group_1__0__Impl3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__13975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Var2Assignment_1_1_in_rule__Output__Group_1__1__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group__0__Impl_in_rule__Commandes__Group__04036 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Commandes__Group__1_in_rule__Commandes__Group__04039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Com1Assignment_0_in_rule__Commandes__Group__0__Impl4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group__1__Impl_in_rule__Commandes__Group__14096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group_1__0_in_rule__Commandes__Group__1__Impl4123 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group_1__0__Impl_in_rule__Commandes__Group_1__04158 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__Commandes__Group_1__1_in_rule__Commandes__Group_1__04161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Commandes__Group_1__0__Impl4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group_1__1__Impl_in_rule__Commandes__Group_1__14220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Com2Assignment_1_1_in_rule__Commandes__Group_1__1__Impl4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__Group_0__0__Impl_in_rule__Commande__Group_0__04281 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Commande__Group_0__1_in_rule__Commande__Group_0__04284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__Group_0__1__Impl_in_rule__Commande__Group_0__14342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__NopAssignment_0_1_in_rule__Commande__Group_0__1__Impl4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__0__Impl_in_rule__AffectVar__Group__04403 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__1_in_rule__AffectVar__Group__04406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__Var1Assignment_0_in_rule__AffectVar__Group__0__Impl4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__1__Impl_in_rule__AffectVar__Group__14463 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__2_in_rule__AffectVar__Group__14466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AffectVar__Group__1__Impl4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__2__Impl_in_rule__AffectVar__Group__24525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__ExpAssignment_2_in_rule__AffectVar__Group__2__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04588 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__04591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__While__Group__0__Impl4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14650 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__14653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__1__Impl4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24709 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__24712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Exp2Assignment_2_in_rule__While__Group__2__Impl4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34769 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__34772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__3__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44828 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__5_in_rule__While__Group__44831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__While__Group__4__Impl4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__5__Impl_in_rule__While__Group__54890 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__While__Group__6_in_rule__While__Group__54893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__5__Impl4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__6__Impl_in_rule__While__Group__64949 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__7_in_rule__While__Group__64952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Com3Assignment_6_in_rule__While__Group__6__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__7__Impl_in_rule__While__Group__75009 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__While__Group__8_in_rule__While__Group__75012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__7__Impl5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__8__Impl_in_rule__While__Group__85068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__While__Group__8__Impl5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__05145 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__1_in_rule__For__Group__05148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__For__Group__0__Impl5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__15207 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__For__Group__2_in_rule__For__Group__15210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__1__Impl5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__25266 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__3_in_rule__For__Group__25269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Exp3Assignment_2_in_rule__For__Group__2__Impl5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__35326 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__For__Group__4_in_rule__For__Group__35329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__3__Impl5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__45385 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__5_in_rule__For__Group__45388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__For__Group__4__Impl5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__55447 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__For__Group__6_in_rule__For__Group__55450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__5__Impl5477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__65506 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__7_in_rule__For__Group__65509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Com4Assignment_6_in_rule__For__Group__6__Impl5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__75566 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__For__Group__8_in_rule__For__Group__75569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__7__Impl5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__85625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__For__Group__8__Impl5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__05702 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__05705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__If__Group__0__Impl5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__15764 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__15767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__1__Impl5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__25823 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__25826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Exp4Assignment_2_in_rule__If__Group__2__Impl5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__35883 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__35886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__3__Impl5913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__45942 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__5_in_rule__If__Group__45945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__If__Group__4__Impl5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__56004 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__If__Group__6_in_rule__If__Group__56007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__5__Impl6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__66063 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__7_in_rule__If__Group__66066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Com5Assignment_6_in_rule__If__Group__6__Impl6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__76123 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__If__Group__8_in_rule__If__Group__76126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__7__Impl6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__86182 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__If__Group__9_in_rule__If__Group__86185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__0_in_rule__If__Group__8__Impl6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__9__Impl_in_rule__If__Group__96243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__If__Group__9__Impl6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__0__Impl_in_rule__If__Group_8__06322 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group_8__1_in_rule__If__Group_8__06325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__If__Group_8__0__Impl6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__1__Impl_in_rule__If__Group_8__16384 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__If__Group_8__2_in_rule__If__Group_8__16387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group_8__1__Impl6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__2__Impl_in_rule__If__Group_8__26443 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group_8__3_in_rule__If__Group_8__26446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Com6Assignment_8_2_in_rule__If__Group_8__2__Impl6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__3__Impl_in_rule__If__Group_8__36503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group_8__3__Impl6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__0__Impl_in_rule__Foreach__Group__06567 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__1_in_rule__Foreach__Group__06570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Foreach__Group__0__Impl6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__1__Impl_in_rule__Foreach__Group__16629 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Foreach__Group__2_in_rule__Foreach__Group__16632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__1__Impl6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__2__Impl_in_rule__Foreach__Group__26688 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__3_in_rule__Foreach__Group__26691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Exp5Assignment_2_in_rule__Foreach__Group__2__Impl6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__3__Impl_in_rule__Foreach__Group__36748 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__4_in_rule__Foreach__Group__36751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__3__Impl6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__4__Impl_in_rule__Foreach__Group__46807 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__5_in_rule__Foreach__Group__46810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Foreach__Group__4__Impl6838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__5__Impl_in_rule__Foreach__Group__56869 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Foreach__Group__6_in_rule__Foreach__Group__56872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__5__Impl6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__6__Impl_in_rule__Foreach__Group__66928 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__7_in_rule__Foreach__Group__66931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Exp6Assignment_6_in_rule__Foreach__Group__6__Impl6958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__7__Impl_in_rule__Foreach__Group__76988 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__8_in_rule__Foreach__Group__76991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__7__Impl7018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__8__Impl_in_rule__Foreach__Group__87047 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__9_in_rule__Foreach__Group__87050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Foreach__Group__8__Impl7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__9__Impl_in_rule__Foreach__Group__97109 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__Foreach__Group__10_in_rule__Foreach__Group__97112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__9__Impl7139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__10__Impl_in_rule__Foreach__Group__107168 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__11_in_rule__Foreach__Group__107171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Com7Assignment_10_in_rule__Foreach__Group__10__Impl7198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__11__Impl_in_rule__Foreach__Group__117228 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__12_in_rule__Foreach__Group__117231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__11__Impl7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__12__Impl_in_rule__Foreach__Group__127287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Foreach__Group__12__Impl7315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__07372 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__07375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Var2Assignment_0_in_rule__Vars__Group__0__Impl7402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__17432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl7459 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__07494 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__07497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Vars__Group_1__0__Impl7525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__17556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Var3Assignment_1_1_in_rule__Vars__Group_1__1__Impl7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__07617 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__07620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExprSAssignment_0_in_rule__Exprs__Group__0__Impl7647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__17677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl7704 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__07739 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__07742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Exprs__Group_1__0__Impl7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__17801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExprS2Assignment_1_1_in_rule__Exprs__Group_1__1__Impl7828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_0__0__Impl_in_rule__ExprSimple__Group_0__07862 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_0__1_in_rule__ExprSimple__Group_0__07865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_0__1__Impl_in_rule__ExprSimple__Group_0__17923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__VideAssignment_0_1_in_rule__ExprSimple__Group_0__1__Impl7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__0__Impl_in_rule__Cons__Group__07984 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Cons__Group__1_in_rule__Cons__Group__07987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__Cons__Group__0__Impl8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__1__Impl_in_rule__Cons__Group__18043 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Cons__Group__2_in_rule__Cons__Group__18046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Cons__Group__1__Impl8074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__2__Impl_in_rule__Cons__Group__28105 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Cons__Group__3_in_rule__Cons__Group__28108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Le1Assignment_2_in_rule__Cons__Group__2__Impl8135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__3__Impl_in_rule__Cons__Group__38165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__Cons__Group__3__Impl8192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Group__0__Impl_in_rule__Liste__Group__08229 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Liste__Group__1_in_rule__Liste__Group__08232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__Liste__Group__0__Impl8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Group__1__Impl_in_rule__Liste__Group__18288 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Liste__Group__2_in_rule__Liste__Group__18291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Liste__Group__1__Impl8319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Group__2__Impl_in_rule__Liste__Group__28350 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Liste__Group__3_in_rule__Liste__Group__28353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Le2Assignment_2_in_rule__Liste__Group__2__Impl8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Group__3__Impl_in_rule__Liste__Group__38410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__Liste__Group__3__Impl8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__0__Impl_in_rule__Hd__Group__08474 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Hd__Group__1_in_rule__Hd__Group__08477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__Hd__Group__0__Impl8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__1__Impl_in_rule__Hd__Group__18533 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Hd__Group__2_in_rule__Hd__Group__18536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Hd__Group__1__Impl8564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__2__Impl_in_rule__Hd__Group__28595 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Hd__Group__3_in_rule__Hd__Group__28598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Hd__Group__2__Impl8625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__3__Impl_in_rule__Hd__Group__38654 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Hd__Group__4_in_rule__Hd__Group__38657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Le3Assignment_3_in_rule__Hd__Group__3__Impl8684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__4__Impl_in_rule__Hd__Group__48714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__Hd__Group__4__Impl8741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__0__Impl_in_rule__Tl__Group__08780 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Tl__Group__1_in_rule__Tl__Group__08783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__Tl__Group__0__Impl8810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__1__Impl_in_rule__Tl__Group__18839 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Tl__Group__2_in_rule__Tl__Group__18842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Tl__Group__1__Impl8870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__2__Impl_in_rule__Tl__Group__28901 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Tl__Group__3_in_rule__Tl__Group__28904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Tl__Group__2__Impl8931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__3__Impl_in_rule__Tl__Group__38960 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Tl__Group__4_in_rule__Tl__Group__38963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Le4Assignment_3_in_rule__Tl__Group__3__Impl8990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__4__Impl_in_rule__Tl__Group__49020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__Tl__Group__4__Impl9047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__0__Impl_in_rule__SymboleEx__Group__09086 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__1_in_rule__SymboleEx__Group__09089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__SymboleEx__Group__0__Impl9116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__1__Impl_in_rule__SymboleEx__Group__19145 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__2_in_rule__SymboleEx__Group__19148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__PAssignment_1_in_rule__SymboleEx__Group__1__Impl9175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__2__Impl_in_rule__SymboleEx__Group__29205 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__3_in_rule__SymboleEx__Group__29208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Le5Assignment_2_in_rule__SymboleEx__Group__2__Impl9235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__3__Impl_in_rule__SymboleEx__Group__39265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__SymboleEx__Group__3__Impl9292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr__Group__0__Impl_in_rule__LExpr__Group__09329 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__LExpr__Group__1_in_rule__LExpr__Group__09332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__LExpr__Group__0__Impl9359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr__Group__1__Impl_in_rule__LExpr__Group__19388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr__ExpLeAssignment_1_in_rule__LExpr__Group__1__Impl9415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr2__Group__0__Impl_in_rule__LExpr2__Group__09449 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__LExpr2__Group__1_in_rule__LExpr2__Group__09452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__LExpr2__Group__0__Impl9479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr2__Group__1__Impl_in_rule__LExpr2__Group__19508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr2__ExpLe2Assignment_1_in_rule__LExpr2__Group__1__Impl9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__09569 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__09572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExpOAssignment_0_in_rule__ExprAnd__Group__0__Impl9599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__19629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl9656 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__09691 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__09694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__0__Impl9721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__19750 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__2_in_rule__ExprAnd__Group_1__19753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ExprAnd__Group_1__1__Impl9781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__2__Impl_in_rule__ExprAnd__Group_1__29812 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__3_in_rule__ExprAnd__Group_1__29815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__2__Impl9842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__3__Impl_in_rule__ExprAnd__Group_1__39871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExpO2Assignment_1_3_in_rule__ExprAnd__Group_1__3__Impl9898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__09936 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__09939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExpNAssignment_0_in_rule__ExprOr__Group__0__Impl9966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__19996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl10023 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__010058 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__010061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprOr__Group_1__0__Impl10088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__110117 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__2_in_rule__ExprOr__Group_1__110120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExprOr__Group_1__1__Impl10148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__2__Impl_in_rule__ExprOr__Group_1__210179 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__3_in_rule__ExprOr__Group_1__210182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprOr__Group_1__2__Impl10209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__3__Impl_in_rule__ExprOr__Group_1__310238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExpN2Assignment_1_3_in_rule__ExprOr__Group_1__3__Impl10265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group__0__Impl_in_rule__ExprNotNot__Group__010303 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group__1_in_rule__ExprNotNot__Group__010306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group_0__0_in_rule__ExprNotNot__Group__0__Impl10333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group__1__Impl_in_rule__ExprNotNot__Group__110363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotNot__ExpEq1Assignment_1_in_rule__ExprNotNot__Group__1__Impl10390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group_0__0__Impl_in_rule__ExprNotNot__Group_0__010424 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group_0__1_in_rule__ExprNotNot__Group_0__010427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ExprNotNot__Group_0__0__Impl10455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group_0__1__Impl_in_rule__ExprNotNot__Group_0__110486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprNotNot__Group_0__1__Impl10513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__010546 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__010549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExpS1Assignment_0_0_in_rule__ExprEq__Group_0__0__Impl10576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__110606 = new BitSet(new long[]{0x0000800000000D00L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__110609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ExprEq__Group_0__1__Impl10637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__210668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExpS2Assignment_0_2_in_rule__ExprEq__Group_0__2__Impl10695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__010731 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__010734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__ExprEq__Group_1__0__Impl10761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__110790 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__110793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExpRAssignment_1_1_in_rule__ExprEq__Group_1__1__Impl10820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__210850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__ExprEq__Group_1__2__Impl10877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgramme_in_rule__Model__ProgrammeAssignment10917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFonction_in_rule__Programme__FonctAssignment_1_010948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__Fonction__SymboleAssignment_210979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Fonction__InAssignment_711010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__Fonction__ComAssignment_911041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Fonction__OutAssignment_1311072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Input__Var1Assignment_011103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Input__Var2Assignment_1_111134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Output__Var1Assignment_011165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Output__Var2Assignment_1_111196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommande_in_rule__Commandes__Com1Assignment_011227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommande_in_rule__Commandes__Com2Assignment_1_111258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Commande__NopAssignment_0_111294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectVar_in_rule__Commande__AffectVarAssignment_111333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__Commande__WhileCAssignment_211364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_rule__Commande__ForCAssignment_311395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__Commande__IfCAssignment_411426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_rule__Commande__ForeachCAssignment_511457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__AffectVar__Var1Assignment_011488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__AffectVar__ExpAssignment_211519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__While__Exp2Assignment_211550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__While__Com3Assignment_611581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__For__Exp3Assignment_211612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__For__Com4Assignment_611643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__If__Exp4Assignment_211674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__If__Com5Assignment_611705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__If__Com6Assignment_8_211736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Foreach__Exp5Assignment_211767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Foreach__Exp6Assignment_611798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__Foreach__Com7Assignment_1011829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Vars__Var2Assignment_011860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Vars__Var3Assignment_1_111891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExprSAssignment_011922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExprS2Assignment_1_111953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_rule__Expr__ExpAAssignment_011984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Expr__ExpSAssignment_112015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ExprSimple__VideAssignment_0_112051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__ExprSimple__VariableAssignment_112090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__ExprSimple__SymboleAssignment_212121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCons_in_rule__ExprSimple__ConsAssignment_312152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListe_in_rule__ExprSimple__ListeAssignment_412183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHd_in_rule__ExprSimple__HdAssignment_512214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTl_in_rule__ExprSimple__TlAssignment_612245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymboleEx_in_rule__ExprSimple__SymbolExAssignment_712276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_rule__Cons__Le1Assignment_212307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_rule__Liste__Le2Assignment_212338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Hd__Le3Assignment_312369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Tl__Le4Assignment_312400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__SymboleEx__PAssignment_112431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr2_in_rule__SymboleEx__Le5Assignment_212462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__LExpr__ExpLeAssignment_112493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__LExpr2__ExpLe2Assignment_112524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprAnd__ExpOAssignment_012555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprAnd__ExpO2Assignment_1_312586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_rule__ExprOr__ExpNAssignment_012617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_rule__ExprOr__ExpN2Assignment_1_312648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNotNot_in_rule__ExprNot__ExprNotNotAssignment_012679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNotDo_in_rule__ExprNot__ExprNotDoAssignment_112710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_rule__ExprNotNot__ExpEq1Assignment_112741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_rule__ExprNotDo__ExpEq2Assignment12772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExpS1Assignment_0_012803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExpS2Assignment_0_212834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprEq__ExpRAssignment_1_112865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpAAssignment_0_in_synpred9_InternalMyDsl2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_synpred18_InternalMyDsl2295 = new BitSet(new long[]{0x0000000000000002L});

}