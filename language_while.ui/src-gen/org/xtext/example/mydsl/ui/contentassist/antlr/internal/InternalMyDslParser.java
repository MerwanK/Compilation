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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ruleExprNot : ( ( rule__ExprNot__Alternatives ) ) ;
    public final void ruleExprNot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:753:2: ( ( ( rule__ExprNot__Alternatives ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:1: ( ( rule__ExprNot__Alternatives ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:1: ( ( rule__ExprNot__Alternatives ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: ( rule__ExprNot__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getAlternatives()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: ( rule__ExprNot__Alternatives )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:756:2: rule__ExprNot__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprNot__Alternatives_in_ruleExprNot1557);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: entryRuleExprNotNot : ruleExprNotNot EOF ;
    public final void entryRuleExprNotNot() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ( ruleExprNotNot EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ruleExprNotNot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotNotRule()); 
            }
            pushFollow(FOLLOW_ruleExprNotNot_in_entryRuleExprNotNot1584);
            ruleExprNotNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotNotRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNotNot1591); if (state.failed) return ;

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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:777:1: ruleExprNotNot : ( ( rule__ExprNotNot__Group__0 ) ) ;
    public final void ruleExprNotNot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:781:2: ( ( ( rule__ExprNotNot__Group__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: ( ( rule__ExprNotNot__Group__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: ( ( rule__ExprNotNot__Group__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( rule__ExprNotNot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotNotAccess().getGroup()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: ( rule__ExprNotNot__Group__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:784:2: rule__ExprNotNot__Group__0
            {
            pushFollow(FOLLOW_rule__ExprNotNot__Group__0_in_ruleExprNotNot1617);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: entryRuleExprNotDo : ruleExprNotDo EOF ;
    public final void entryRuleExprNotDo() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( ruleExprNotDo EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ruleExprNotDo EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotDoRule()); 
            }
            pushFollow(FOLLOW_ruleExprNotDo_in_entryRuleExprNotDo1644);
            ruleExprNotDo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotDoRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNotDo1651); if (state.failed) return ;

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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:805:1: ruleExprNotDo : ( ( rule__ExprNotDo__ExpEq2Assignment ) ) ;
    public final void ruleExprNotDo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:809:2: ( ( ( rule__ExprNotDo__ExpEq2Assignment ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: ( ( rule__ExprNotDo__ExpEq2Assignment ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: ( ( rule__ExprNotDo__ExpEq2Assignment ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: ( rule__ExprNotDo__ExpEq2Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotDoAccess().getExpEq2Assignment()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:812:1: ( rule__ExprNotDo__ExpEq2Assignment )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:812:2: rule__ExprNotDo__ExpEq2Assignment
            {
            pushFollow(FOLLOW_rule__ExprNotDo__ExpEq2Assignment_in_ruleExprNotDo1677);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:824:1: entryRuleExprEq : ruleExprEq EOF ;
    public final void entryRuleExprEq() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: ( ruleExprEq EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_entryRuleExprEq1704);
            ruleExprEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEq1711); if (state.failed) return ;

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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ruleExprEq : ( ( rule__ExprEq__Alternatives ) ) ;
    public final void ruleExprEq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:837:2: ( ( ( rule__ExprEq__Alternatives ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:838:1: ( ( rule__ExprEq__Alternatives ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:838:1: ( ( rule__ExprEq__Alternatives ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( rule__ExprEq__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getAlternatives()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ( rule__ExprEq__Alternatives )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:840:2: rule__ExprEq__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprEq__Alternatives_in_ruleExprEq1737);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: entryRuleLC : ruleLC EOF ;
    public final void entryRuleLC() throws RecognitionException {
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: ( ruleLC EOF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: ruleLC EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCRule()); 
            }
            pushFollow(FOLLOW_ruleLC_in_entryRuleLC1764);
            ruleLC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLCRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLC1771); if (state.failed) return ;

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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ruleLC : ( ( rule__LC__Alternatives )* ) ;
    public final void ruleLC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:865:2: ( ( ( rule__LC__Alternatives )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:866:1: ( ( rule__LC__Alternatives )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:866:1: ( ( rule__LC__Alternatives )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:867:1: ( rule__LC__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLCAccess().getAlternatives()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: ( rule__LC__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_SP && LA2_0<=RULE_LF)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:868:2: rule__LC__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__LC__Alternatives_in_ruleLC1797);
            	    rule__LC__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: rule__Commande__Alternatives : ( ( ( rule__Commande__Group_0__0 ) ) | ( ( rule__Commande__AffectVarAssignment_1 ) ) | ( ( rule__Commande__WhileCAssignment_2 ) ) | ( ( rule__Commande__ForCAssignment_3 ) ) | ( ( rule__Commande__IfCAssignment_4 ) ) | ( ( rule__Commande__ForeachCAssignment_5 ) ) );
    public final void rule__Commande__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:884:1: ( ( ( rule__Commande__Group_0__0 ) ) | ( ( rule__Commande__AffectVarAssignment_1 ) ) | ( ( rule__Commande__WhileCAssignment_2 ) ) | ( ( rule__Commande__ForCAssignment_3 ) ) | ( ( rule__Commande__IfCAssignment_4 ) ) | ( ( rule__Commande__ForeachCAssignment_5 ) ) )
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ( ( rule__Commande__Group_0__0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ( ( rule__Commande__Group_0__0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( rule__Commande__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getGroup_0()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( rule__Commande__Group_0__0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:2: rule__Commande__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Commande__Group_0__0_in_rule__Commande__Alternatives1834);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:891:6: ( ( rule__Commande__AffectVarAssignment_1 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:891:6: ( ( rule__Commande__AffectVarAssignment_1 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: ( rule__Commande__AffectVarAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getAffectVarAssignment_1()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: ( rule__Commande__AffectVarAssignment_1 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:893:2: rule__Commande__AffectVarAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Commande__AffectVarAssignment_1_in_rule__Commande__Alternatives1852);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:897:6: ( ( rule__Commande__WhileCAssignment_2 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:897:6: ( ( rule__Commande__WhileCAssignment_2 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:898:1: ( rule__Commande__WhileCAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getWhileCAssignment_2()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( rule__Commande__WhileCAssignment_2 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:899:2: rule__Commande__WhileCAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Commande__WhileCAssignment_2_in_rule__Commande__Alternatives1870);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:903:6: ( ( rule__Commande__ForCAssignment_3 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:903:6: ( ( rule__Commande__ForCAssignment_3 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: ( rule__Commande__ForCAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getForCAssignment_3()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: ( rule__Commande__ForCAssignment_3 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:905:2: rule__Commande__ForCAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Commande__ForCAssignment_3_in_rule__Commande__Alternatives1888);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:6: ( ( rule__Commande__IfCAssignment_4 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:6: ( ( rule__Commande__IfCAssignment_4 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( rule__Commande__IfCAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getIfCAssignment_4()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: ( rule__Commande__IfCAssignment_4 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:911:2: rule__Commande__IfCAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Commande__IfCAssignment_4_in_rule__Commande__Alternatives1906);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:915:6: ( ( rule__Commande__ForeachCAssignment_5 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:915:6: ( ( rule__Commande__ForeachCAssignment_5 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( rule__Commande__ForeachCAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandeAccess().getForeachCAssignment_5()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:1: ( rule__Commande__ForeachCAssignment_5 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:2: rule__Commande__ForeachCAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Commande__ForeachCAssignment_5_in_rule__Commande__Alternatives1924);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:926:1: rule__Expr__Alternatives : ( ( ( rule__Expr__ExpSAssignment_0 ) ) | ( ( rule__Expr__ExpAAssignment_1 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: ( ( ( rule__Expr__ExpSAssignment_0 ) ) | ( ( rule__Expr__ExpAAssignment_1 ) ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 47:
                {
                int LA4_1 = input.LA(2);

                if ( (synpred8_InternalMyDsl()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VAR:
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
            case RULE_SYM:
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
            case RULE_PARAG:
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
            case 44:
                {
                alt4=2;
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: ( ( rule__Expr__ExpSAssignment_0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: ( ( rule__Expr__ExpSAssignment_0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: ( rule__Expr__ExpSAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExpSAssignment_0()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( rule__Expr__ExpSAssignment_0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:2: rule__Expr__ExpSAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expr__ExpSAssignment_0_in_rule__Expr__Alternatives1957);
                    rule__Expr__ExpSAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExpSAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:937:6: ( ( rule__Expr__ExpAAssignment_1 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:937:6: ( ( rule__Expr__ExpAAssignment_1 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:938:1: ( rule__Expr__ExpAAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExpAAssignment_1()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ( rule__Expr__ExpAAssignment_1 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:2: rule__Expr__ExpAAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expr__ExpAAssignment_1_in_rule__Expr__Alternatives1975);
                    rule__Expr__ExpAAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExpAAssignment_1()); 
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:948:1: rule__ExprSimple__Alternatives : ( ( ( rule__ExprSimple__Group_0__0 ) ) | ( ( rule__ExprSimple__VariableAssignment_1 ) ) | ( ( rule__ExprSimple__SymboleAssignment_2 ) ) | ( ( rule__ExprSimple__ConsAssignment_3 ) ) | ( ( rule__ExprSimple__ListeAssignment_4 ) ) | ( ( rule__ExprSimple__HdAssignment_5 ) ) | ( ( rule__ExprSimple__TlAssignment_6 ) ) | ( ( rule__ExprSimple__SymbolExAssignment_7 ) ) );
    public final void rule__ExprSimple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( ( ( rule__ExprSimple__Group_0__0 ) ) | ( ( rule__ExprSimple__VariableAssignment_1 ) ) | ( ( rule__ExprSimple__SymboleAssignment_2 ) ) | ( ( rule__ExprSimple__ConsAssignment_3 ) ) | ( ( rule__ExprSimple__ListeAssignment_4 ) ) | ( ( rule__ExprSimple__HdAssignment_5 ) ) | ( ( rule__ExprSimple__TlAssignment_6 ) ) | ( ( rule__ExprSimple__SymbolExAssignment_7 ) ) )
            int alt5=8;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: ( ( rule__ExprSimple__Group_0__0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: ( ( rule__ExprSimple__Group_0__0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( rule__ExprSimple__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_0()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( rule__ExprSimple__Group_0__0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:2: rule__ExprSimple__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_0__0_in_rule__ExprSimple__Alternatives2008);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:959:6: ( ( rule__ExprSimple__VariableAssignment_1 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:959:6: ( ( rule__ExprSimple__VariableAssignment_1 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:960:1: ( rule__ExprSimple__VariableAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getVariableAssignment_1()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: ( rule__ExprSimple__VariableAssignment_1 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:2: rule__ExprSimple__VariableAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__VariableAssignment_1_in_rule__ExprSimple__Alternatives2026);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:965:6: ( ( rule__ExprSimple__SymboleAssignment_2 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:965:6: ( ( rule__ExprSimple__SymboleAssignment_2 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( rule__ExprSimple__SymboleAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getSymboleAssignment_2()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( rule__ExprSimple__SymboleAssignment_2 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:967:2: rule__ExprSimple__SymboleAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__SymboleAssignment_2_in_rule__ExprSimple__Alternatives2044);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:971:6: ( ( rule__ExprSimple__ConsAssignment_3 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:971:6: ( ( rule__ExprSimple__ConsAssignment_3 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: ( rule__ExprSimple__ConsAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getConsAssignment_3()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: ( rule__ExprSimple__ConsAssignment_3 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:973:2: rule__ExprSimple__ConsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__ConsAssignment_3_in_rule__ExprSimple__Alternatives2062);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:977:6: ( ( rule__ExprSimple__ListeAssignment_4 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:977:6: ( ( rule__ExprSimple__ListeAssignment_4 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: ( rule__ExprSimple__ListeAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getListeAssignment_4()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( rule__ExprSimple__ListeAssignment_4 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:2: rule__ExprSimple__ListeAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__ListeAssignment_4_in_rule__ExprSimple__Alternatives2080);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:983:6: ( ( rule__ExprSimple__HdAssignment_5 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:983:6: ( ( rule__ExprSimple__HdAssignment_5 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:984:1: ( rule__ExprSimple__HdAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getHdAssignment_5()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:985:1: ( rule__ExprSimple__HdAssignment_5 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:985:2: rule__ExprSimple__HdAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__HdAssignment_5_in_rule__ExprSimple__Alternatives2098);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:989:6: ( ( rule__ExprSimple__TlAssignment_6 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:989:6: ( ( rule__ExprSimple__TlAssignment_6 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: ( rule__ExprSimple__TlAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getTlAssignment_6()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:991:1: ( rule__ExprSimple__TlAssignment_6 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:991:2: rule__ExprSimple__TlAssignment_6
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__TlAssignment_6_in_rule__ExprSimple__Alternatives2116);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:6: ( ( rule__ExprSimple__SymbolExAssignment_7 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:6: ( ( rule__ExprSimple__SymbolExAssignment_7 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:996:1: ( rule__ExprSimple__SymbolExAssignment_7 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getSymbolExAssignment_7()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: ( rule__ExprSimple__SymbolExAssignment_7 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:997:2: rule__ExprSimple__SymbolExAssignment_7
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__SymbolExAssignment_7_in_rule__ExprSimple__Alternatives2134);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:1: rule__ExprNot__Alternatives : ( ( ( rule__ExprNot__ExprNotNotAssignment_0 ) ) | ( ( rule__ExprNot__ExprNotDoAssignment_1 ) ) );
    public final void rule__ExprNot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:1: ( ( ( rule__ExprNot__ExprNotNotAssignment_0 ) ) | ( ( rule__ExprNot__ExprNotDoAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==44) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_PARAG||(LA6_0>=RULE_SYM && LA6_0<=RULE_VAR)||LA6_0==47) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:1: ( ( rule__ExprNot__ExprNotNotAssignment_0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:1: ( ( rule__ExprNot__ExprNotNotAssignment_0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: ( rule__ExprNot__ExprNotNotAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprNotAccess().getExprNotNotAssignment_0()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ( rule__ExprNot__ExprNotNotAssignment_0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:2: rule__ExprNot__ExprNotNotAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ExprNot__ExprNotNotAssignment_0_in_rule__ExprNot__Alternatives2167);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:6: ( ( rule__ExprNot__ExprNotDoAssignment_1 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:6: ( ( rule__ExprNot__ExprNotDoAssignment_1 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:1: ( rule__ExprNot__ExprNotDoAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprNotAccess().getExprNotDoAssignment_1()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1019:1: ( rule__ExprNot__ExprNotDoAssignment_1 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1019:2: rule__ExprNot__ExprNotDoAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ExprNot__ExprNotDoAssignment_1_in_rule__ExprNot__Alternatives2185);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: rule__ExprEq__Alternatives : ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) );
    public final void rule__ExprEq__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_SYM && LA7_0<=RULE_VAR)||LA7_0==47) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_PARAG) ) {
                int LA7_4 = input.LA(2);

                if ( (synpred17_InternalMyDsl()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: ( ( rule__ExprEq__Group_0__0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: ( ( rule__ExprEq__Group_0__0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:1: ( rule__ExprEq__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_0()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:1: ( rule__ExprEq__Group_0__0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:2: rule__ExprEq__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives2218);
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
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:6: ( ( rule__ExprEq__Group_1__0 ) )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:6: ( ( rule__ExprEq__Group_1__0 ) )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: ( rule__ExprEq__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_1()); 
                    }
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( rule__ExprEq__Group_1__0 )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:2: rule__ExprEq__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives2236);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:1: rule__LC__Alternatives : ( ( RULE_SP ) | ( RULE_CR ) | ( RULE_TAB ) | ( RULE_LF ) );
    public final void rule__LC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( ( RULE_SP ) | ( RULE_CR ) | ( RULE_TAB ) | ( RULE_LF ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_SP:
                {
                alt8=1;
                }
                break;
            case RULE_CR:
                {
                alt8=2;
                }
                break;
            case RULE_TAB:
                {
                alt8=3;
                }
                break;
            case RULE_LF:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( RULE_SP )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( RULE_SP )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: RULE_SP
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getSPTerminalRuleCall_0()); 
                    }
                    match(input,RULE_SP,FOLLOW_RULE_SP_in_rule__LC__Alternatives2269); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCAccess().getSPTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:6: ( RULE_CR )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:6: ( RULE_CR )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: RULE_CR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getCRTerminalRuleCall_1()); 
                    }
                    match(input,RULE_CR,FOLLOW_RULE_CR_in_rule__LC__Alternatives2286); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCAccess().getCRTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:6: ( RULE_TAB )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:6: ( RULE_TAB )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: RULE_TAB
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getTABTerminalRuleCall_2()); 
                    }
                    match(input,RULE_TAB,FOLLOW_RULE_TAB_in_rule__LC__Alternatives2303); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLCAccess().getTABTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:6: ( RULE_LF )
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:6: ( RULE_LF )
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: RULE_LF
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLCAccess().getLFTerminalRuleCall_3()); 
                    }
                    match(input,RULE_LF,FOLLOW_RULE_LF_in_rule__LC__Alternatives2320); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: rule__Programme__Group__0 : rule__Programme__Group__0__Impl rule__Programme__Group__1 ;
    public final void rule__Programme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:1: ( rule__Programme__Group__0__Impl rule__Programme__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:2: rule__Programme__Group__0__Impl rule__Programme__Group__1
            {
            pushFollow(FOLLOW_rule__Programme__Group__0__Impl_in_rule__Programme__Group__02350);
            rule__Programme__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Programme__Group__1_in_rule__Programme__Group__02353);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: rule__Programme__Group__0__Impl : ( () ) ;
    public final void rule__Programme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:1: ( ( () ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:1: ( () )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:1: ( () )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getProgrammeAction_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ()
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:1: 
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: rule__Programme__Group__1 : rule__Programme__Group__1__Impl ;
    public final void rule__Programme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: ( rule__Programme__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1122:2: rule__Programme__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Programme__Group__1__Impl_in_rule__Programme__Group__12411);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: rule__Programme__Group__1__Impl : ( ( rule__Programme__Group_1__0 )* ) ;
    public final void rule__Programme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( ( ( rule__Programme__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: ( ( rule__Programme__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: ( ( rule__Programme__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1134:1: ( rule__Programme__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1135:1: ( rule__Programme__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1135:2: rule__Programme__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Programme__Group_1__0_in_rule__Programme__Group__1__Impl2438);
            	    rule__Programme__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: rule__Programme__Group_1__0 : rule__Programme__Group_1__0__Impl rule__Programme__Group_1__1 ;
    public final void rule__Programme__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1153:1: ( rule__Programme__Group_1__0__Impl rule__Programme__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:2: rule__Programme__Group_1__0__Impl rule__Programme__Group_1__1
            {
            pushFollow(FOLLOW_rule__Programme__Group_1__0__Impl_in_rule__Programme__Group_1__02473);
            rule__Programme__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Programme__Group_1__1_in_rule__Programme__Group_1__02476);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:1: rule__Programme__Group_1__0__Impl : ( ( rule__Programme__FonctAssignment_1_0 ) ) ;
    public final void rule__Programme__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: ( ( ( rule__Programme__FonctAssignment_1_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:1: ( ( rule__Programme__FonctAssignment_1_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:1: ( ( rule__Programme__FonctAssignment_1_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: ( rule__Programme__FonctAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getFonctAssignment_1_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: ( rule__Programme__FonctAssignment_1_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:2: rule__Programme__FonctAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Programme__FonctAssignment_1_0_in_rule__Programme__Group_1__0__Impl2503);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1178:1: rule__Programme__Group_1__1 : rule__Programme__Group_1__1__Impl ;
    public final void rule__Programme__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: ( rule__Programme__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:2: rule__Programme__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Programme__Group_1__1__Impl_in_rule__Programme__Group_1__12533);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: rule__Programme__Group_1__1__Impl : ( ( RULE_CR )* ) ;
    public final void rule__Programme__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1193:1: ( ( ( RULE_CR )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: ( ( RULE_CR )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: ( ( RULE_CR )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:1: ( RULE_CR )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getCRTerminalRuleCall_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: ( RULE_CR )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_CR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:3: RULE_CR
            	    {
            	    match(input,RULE_CR,FOLLOW_RULE_CR_in_rule__Programme__Group_1__1__Impl2561); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: rule__Fonction__Group__0 : rule__Fonction__Group__0__Impl rule__Fonction__Group__1 ;
    public final void rule__Fonction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:1: ( rule__Fonction__Group__0__Impl rule__Fonction__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:2: rule__Fonction__Group__0__Impl rule__Fonction__Group__1
            {
            pushFollow(FOLLOW_rule__Fonction__Group__0__Impl_in_rule__Fonction__Group__02596);
            rule__Fonction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__1_in_rule__Fonction__Group__02599);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:1: rule__Fonction__Group__0__Impl : ( 'fonction' ) ;
    public final void rule__Fonction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1226:1: ( ( 'fonction' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:1: ( 'fonction' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:1: ( 'fonction' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: 'fonction'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getFonctionKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Fonction__Group__0__Impl2627); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: rule__Fonction__Group__1 : rule__Fonction__Group__1__Impl rule__Fonction__Group__2 ;
    public final void rule__Fonction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( rule__Fonction__Group__1__Impl rule__Fonction__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:2: rule__Fonction__Group__1__Impl rule__Fonction__Group__2
            {
            pushFollow(FOLLOW_rule__Fonction__Group__1__Impl_in_rule__Fonction__Group__12658);
            rule__Fonction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__2_in_rule__Fonction__Group__12661);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:1: rule__Fonction__Group__1__Impl : ( ruleLC ) ;
    public final void rule__Fonction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Fonction__Group__1__Impl2688);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: rule__Fonction__Group__2 : rule__Fonction__Group__2__Impl rule__Fonction__Group__3 ;
    public final void rule__Fonction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:1: ( rule__Fonction__Group__2__Impl rule__Fonction__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:2: rule__Fonction__Group__2__Impl rule__Fonction__Group__3
            {
            pushFollow(FOLLOW_rule__Fonction__Group__2__Impl_in_rule__Fonction__Group__22717);
            rule__Fonction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__3_in_rule__Fonction__Group__22720);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1282:1: rule__Fonction__Group__2__Impl : ( ( rule__Fonction__SymboleAssignment_2 ) ) ;
    public final void rule__Fonction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ( ( ( rule__Fonction__SymboleAssignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:1: ( ( rule__Fonction__SymboleAssignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:1: ( ( rule__Fonction__SymboleAssignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: ( rule__Fonction__SymboleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getSymboleAssignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:1: ( rule__Fonction__SymboleAssignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:2: rule__Fonction__SymboleAssignment_2
            {
            pushFollow(FOLLOW_rule__Fonction__SymboleAssignment_2_in_rule__Fonction__Group__2__Impl2747);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: rule__Fonction__Group__3 : rule__Fonction__Group__3__Impl rule__Fonction__Group__4 ;
    public final void rule__Fonction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: ( rule__Fonction__Group__3__Impl rule__Fonction__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:2: rule__Fonction__Group__3__Impl rule__Fonction__Group__4
            {
            pushFollow(FOLLOW_rule__Fonction__Group__3__Impl_in_rule__Fonction__Group__32777);
            rule__Fonction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__4_in_rule__Fonction__Group__32780);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1311:1: rule__Fonction__Group__3__Impl : ( ':' ) ;
    public final void rule__Fonction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:1: ( ( ':' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1316:1: ( ':' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1316:1: ( ':' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getColonKeyword_3()); 
            }
            match(input,21,FOLLOW_21_in_rule__Fonction__Group__3__Impl2808); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: rule__Fonction__Group__4 : rule__Fonction__Group__4__Impl rule__Fonction__Group__5 ;
    public final void rule__Fonction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: ( rule__Fonction__Group__4__Impl rule__Fonction__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:2: rule__Fonction__Group__4__Impl rule__Fonction__Group__5
            {
            pushFollow(FOLLOW_rule__Fonction__Group__4__Impl_in_rule__Fonction__Group__42839);
            rule__Fonction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__5_in_rule__Fonction__Group__42842);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: rule__Fonction__Group__4__Impl : ( ruleLC ) ;
    public final void rule__Fonction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getLCParserRuleCall_4()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Fonction__Group__4__Impl2869);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: rule__Fonction__Group__5 : rule__Fonction__Group__5__Impl rule__Fonction__Group__6 ;
    public final void rule__Fonction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( rule__Fonction__Group__5__Impl rule__Fonction__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:2: rule__Fonction__Group__5__Impl rule__Fonction__Group__6
            {
            pushFollow(FOLLOW_rule__Fonction__Group__5__Impl_in_rule__Fonction__Group__52898);
            rule__Fonction__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__6_in_rule__Fonction__Group__52901);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: rule__Fonction__Group__5__Impl : ( 'read' ) ;
    public final void rule__Fonction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: ( ( 'read' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:1: ( 'read' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:1: ( 'read' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1377:1: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getReadKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__Fonction__Group__5__Impl2929); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: rule__Fonction__Group__6 : rule__Fonction__Group__6__Impl rule__Fonction__Group__7 ;
    public final void rule__Fonction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: ( rule__Fonction__Group__6__Impl rule__Fonction__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1395:2: rule__Fonction__Group__6__Impl rule__Fonction__Group__7
            {
            pushFollow(FOLLOW_rule__Fonction__Group__6__Impl_in_rule__Fonction__Group__62960);
            rule__Fonction__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__7_in_rule__Fonction__Group__62963);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: rule__Fonction__Group__6__Impl : ( ruleLC ) ;
    public final void rule__Fonction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1408:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getLCParserRuleCall_6()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Fonction__Group__6__Impl2990);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:1: rule__Fonction__Group__7 : rule__Fonction__Group__7__Impl rule__Fonction__Group__8 ;
    public final void rule__Fonction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( rule__Fonction__Group__7__Impl rule__Fonction__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:2: rule__Fonction__Group__7__Impl rule__Fonction__Group__8
            {
            pushFollow(FOLLOW_rule__Fonction__Group__7__Impl_in_rule__Fonction__Group__73019);
            rule__Fonction__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__8_in_rule__Fonction__Group__73022);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:1: rule__Fonction__Group__7__Impl : ( ( rule__Fonction__InAssignment_7 ) ) ;
    public final void rule__Fonction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:1: ( ( ( rule__Fonction__InAssignment_7 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:1: ( ( rule__Fonction__InAssignment_7 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:1: ( ( rule__Fonction__InAssignment_7 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: ( rule__Fonction__InAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getInAssignment_7()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: ( rule__Fonction__InAssignment_7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:2: rule__Fonction__InAssignment_7
            {
            pushFollow(FOLLOW_rule__Fonction__InAssignment_7_in_rule__Fonction__Group__7__Impl3049);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:1: rule__Fonction__Group__8 : rule__Fonction__Group__8__Impl rule__Fonction__Group__9 ;
    public final void rule__Fonction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( rule__Fonction__Group__8__Impl rule__Fonction__Group__9 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:2: rule__Fonction__Group__8__Impl rule__Fonction__Group__9
            {
            pushFollow(FOLLOW_rule__Fonction__Group__8__Impl_in_rule__Fonction__Group__83079);
            rule__Fonction__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__9_in_rule__Fonction__Group__83082);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1460:1: rule__Fonction__Group__8__Impl : ( '%' ) ;
    public final void rule__Fonction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:1: ( ( '%' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:1: ( '%' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:1: ( '%' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1466:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getPercentSignKeyword_8()); 
            }
            match(input,23,FOLLOW_23_in_rule__Fonction__Group__8__Impl3110); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1479:1: rule__Fonction__Group__9 : rule__Fonction__Group__9__Impl rule__Fonction__Group__10 ;
    public final void rule__Fonction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: ( rule__Fonction__Group__9__Impl rule__Fonction__Group__10 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:2: rule__Fonction__Group__9__Impl rule__Fonction__Group__10
            {
            pushFollow(FOLLOW_rule__Fonction__Group__9__Impl_in_rule__Fonction__Group__93141);
            rule__Fonction__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__10_in_rule__Fonction__Group__93144);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: rule__Fonction__Group__9__Impl : ( ( rule__Fonction__ComAssignment_9 ) ) ;
    public final void rule__Fonction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: ( ( ( rule__Fonction__ComAssignment_9 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: ( ( rule__Fonction__ComAssignment_9 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: ( ( rule__Fonction__ComAssignment_9 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1497:1: ( rule__Fonction__ComAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getComAssignment_9()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1498:1: ( rule__Fonction__ComAssignment_9 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1498:2: rule__Fonction__ComAssignment_9
            {
            pushFollow(FOLLOW_rule__Fonction__ComAssignment_9_in_rule__Fonction__Group__9__Impl3171);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1508:1: rule__Fonction__Group__10 : rule__Fonction__Group__10__Impl rule__Fonction__Group__11 ;
    public final void rule__Fonction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: ( rule__Fonction__Group__10__Impl rule__Fonction__Group__11 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:2: rule__Fonction__Group__10__Impl rule__Fonction__Group__11
            {
            pushFollow(FOLLOW_rule__Fonction__Group__10__Impl_in_rule__Fonction__Group__103201);
            rule__Fonction__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__11_in_rule__Fonction__Group__103204);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:1: rule__Fonction__Group__10__Impl : ( '%' ) ;
    public final void rule__Fonction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:1: ( ( '%' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1525:1: ( '%' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1525:1: ( '%' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1526:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getPercentSignKeyword_10()); 
            }
            match(input,23,FOLLOW_23_in_rule__Fonction__Group__10__Impl3232); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:1: rule__Fonction__Group__11 : rule__Fonction__Group__11__Impl rule__Fonction__Group__12 ;
    public final void rule__Fonction__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: ( rule__Fonction__Group__11__Impl rule__Fonction__Group__12 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:2: rule__Fonction__Group__11__Impl rule__Fonction__Group__12
            {
            pushFollow(FOLLOW_rule__Fonction__Group__11__Impl_in_rule__Fonction__Group__113263);
            rule__Fonction__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__12_in_rule__Fonction__Group__113266);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1551:1: rule__Fonction__Group__11__Impl : ( 'write' ) ;
    public final void rule__Fonction__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: ( ( 'write' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ( 'write' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ( 'write' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:1: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getWriteKeyword_11()); 
            }
            match(input,24,FOLLOW_24_in_rule__Fonction__Group__11__Impl3294); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: rule__Fonction__Group__12 : rule__Fonction__Group__12__Impl rule__Fonction__Group__13 ;
    public final void rule__Fonction__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:1: ( rule__Fonction__Group__12__Impl rule__Fonction__Group__13 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:2: rule__Fonction__Group__12__Impl rule__Fonction__Group__13
            {
            pushFollow(FOLLOW_rule__Fonction__Group__12__Impl_in_rule__Fonction__Group__123325);
            rule__Fonction__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fonction__Group__13_in_rule__Fonction__Group__123328);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1582:1: rule__Fonction__Group__12__Impl : ( ruleLC ) ;
    public final void rule__Fonction__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getLCParserRuleCall_12()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Fonction__Group__12__Impl3355);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1599:1: rule__Fonction__Group__13 : rule__Fonction__Group__13__Impl ;
    public final void rule__Fonction__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:1: ( rule__Fonction__Group__13__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:2: rule__Fonction__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__Fonction__Group__13__Impl_in_rule__Fonction__Group__133384);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1610:1: rule__Fonction__Group__13__Impl : ( ( rule__Fonction__OutAssignment_13 ) ) ;
    public final void rule__Fonction__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: ( ( ( rule__Fonction__OutAssignment_13 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: ( ( rule__Fonction__OutAssignment_13 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: ( ( rule__Fonction__OutAssignment_13 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: ( rule__Fonction__OutAssignment_13 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getOutAssignment_13()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:1: ( rule__Fonction__OutAssignment_13 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:2: rule__Fonction__OutAssignment_13
            {
            pushFollow(FOLLOW_rule__Fonction__OutAssignment_13_in_rule__Fonction__Group__13__Impl3411);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1655:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__03469);
            rule__Input__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__03472);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1667:1: rule__Input__Group__0__Impl : ( ( rule__Input__Var1Assignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:1: ( ( ( rule__Input__Var1Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1672:1: ( ( rule__Input__Var1Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1672:1: ( ( rule__Input__Var1Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: ( rule__Input__Var1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVar1Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:1: ( rule__Input__Var1Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:2: rule__Input__Var1Assignment_0
            {
            pushFollow(FOLLOW_rule__Input__Var1Assignment_0_in_rule__Input__Group__0__Impl3499);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1688:1: ( rule__Input__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1689:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__13529);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:1: rule__Input__Group__1__Impl : ( ( rule__Input__Group_1__0 )* ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: ( ( ( rule__Input__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: ( ( rule__Input__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: ( ( rule__Input__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: ( rule__Input__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:1: ( rule__Input__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:2: rule__Input__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3556);
            	    rule__Input__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1716:1: rule__Input__Group_1__0 : rule__Input__Group_1__0__Impl rule__Input__Group_1__1 ;
    public final void rule__Input__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: ( rule__Input__Group_1__0__Impl rule__Input__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1721:2: rule__Input__Group_1__0__Impl rule__Input__Group_1__1
            {
            pushFollow(FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03591);
            rule__Input__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03594);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: rule__Input__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Input__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:1: ( ( ',' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1733:1: ( ',' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1733:1: ( ',' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1734:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Input__Group_1__0__Impl3622); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1747:1: rule__Input__Group_1__1 : rule__Input__Group_1__1__Impl ;
    public final void rule__Input__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: ( rule__Input__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1752:2: rule__Input__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13653);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1758:1: rule__Input__Group_1__1__Impl : ( ( rule__Input__Var2Assignment_1_1 ) ) ;
    public final void rule__Input__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:1: ( ( ( rule__Input__Var2Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1763:1: ( ( rule__Input__Var2Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1763:1: ( ( rule__Input__Var2Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1764:1: ( rule__Input__Var2Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVar2Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1765:1: ( rule__Input__Var2Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1765:2: rule__Input__Var2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Input__Var2Assignment_1_1_in_rule__Input__Group_1__1__Impl3680);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1783:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1784:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03714);
            rule__Output__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03717);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1791:1: rule__Output__Group__0__Impl : ( ( rule__Output__Var1Assignment_0 ) ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: ( ( ( rule__Output__Var1Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1796:1: ( ( rule__Output__Var1Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1796:1: ( ( rule__Output__Var1Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1797:1: ( rule__Output__Var1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVar1Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: ( rule__Output__Var1Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:2: rule__Output__Var1Assignment_0
            {
            pushFollow(FOLLOW_rule__Output__Var1Assignment_0_in_rule__Output__Group__0__Impl3744);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: ( rule__Output__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1813:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13774);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:1: rule__Output__Group__1__Impl : ( ( rule__Output__Group_1__0 )* ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: ( ( ( rule__Output__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: ( ( rule__Output__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: ( ( rule__Output__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1825:1: ( rule__Output__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1826:1: ( rule__Output__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1826:2: rule__Output__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3801);
            	    rule__Output__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1840:1: rule__Output__Group_1__0 : rule__Output__Group_1__0__Impl rule__Output__Group_1__1 ;
    public final void rule__Output__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1844:1: ( rule__Output__Group_1__0__Impl rule__Output__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1845:2: rule__Output__Group_1__0__Impl rule__Output__Group_1__1
            {
            pushFollow(FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03836);
            rule__Output__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03839);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1852:1: rule__Output__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( ( ',' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: ( ',' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: ( ',' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Output__Group_1__0__Impl3867); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1871:1: rule__Output__Group_1__1 : rule__Output__Group_1__1__Impl ;
    public final void rule__Output__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:1: ( rule__Output__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1876:2: rule__Output__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__13898);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:1: rule__Output__Group_1__1__Impl : ( ( rule__Output__Var2Assignment_1_1 ) ) ;
    public final void rule__Output__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: ( ( ( rule__Output__Var2Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:1: ( ( rule__Output__Var2Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:1: ( ( rule__Output__Var2Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1888:1: ( rule__Output__Var2Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVar2Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: ( rule__Output__Var2Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:2: rule__Output__Var2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Output__Var2Assignment_1_1_in_rule__Output__Group_1__1__Impl3925);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1903:1: rule__Commandes__Group__0 : rule__Commandes__Group__0__Impl rule__Commandes__Group__1 ;
    public final void rule__Commandes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1907:1: ( rule__Commandes__Group__0__Impl rule__Commandes__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1908:2: rule__Commandes__Group__0__Impl rule__Commandes__Group__1
            {
            pushFollow(FOLLOW_rule__Commandes__Group__0__Impl_in_rule__Commandes__Group__03959);
            rule__Commandes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commandes__Group__1_in_rule__Commandes__Group__03962);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1915:1: rule__Commandes__Group__0__Impl : ( ( rule__Commandes__Com1Assignment_0 ) ) ;
    public final void rule__Commandes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: ( ( ( rule__Commandes__Com1Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: ( ( rule__Commandes__Com1Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: ( ( rule__Commandes__Com1Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: ( rule__Commandes__Com1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getCom1Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( rule__Commandes__Com1Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:2: rule__Commandes__Com1Assignment_0
            {
            pushFollow(FOLLOW_rule__Commandes__Com1Assignment_0_in_rule__Commandes__Group__0__Impl3989);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: rule__Commandes__Group__1 : rule__Commandes__Group__1__Impl ;
    public final void rule__Commandes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: ( rule__Commandes__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1937:2: rule__Commandes__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Commandes__Group__1__Impl_in_rule__Commandes__Group__14019);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:1: rule__Commandes__Group__1__Impl : ( ( rule__Commandes__Group_1__0 )* ) ;
    public final void rule__Commandes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1947:1: ( ( ( rule__Commandes__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: ( ( rule__Commandes__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: ( ( rule__Commandes__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: ( rule__Commandes__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:1: ( rule__Commandes__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:2: rule__Commandes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Commandes__Group_1__0_in_rule__Commandes__Group__1__Impl4046);
            	    rule__Commandes__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:1: rule__Commandes__Group_1__0 : rule__Commandes__Group_1__0__Impl rule__Commandes__Group_1__1 ;
    public final void rule__Commandes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: ( rule__Commandes__Group_1__0__Impl rule__Commandes__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:2: rule__Commandes__Group_1__0__Impl rule__Commandes__Group_1__1
            {
            pushFollow(FOLLOW_rule__Commandes__Group_1__0__Impl_in_rule__Commandes__Group_1__04081);
            rule__Commandes__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commandes__Group_1__1_in_rule__Commandes__Group_1__04084);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1976:1: rule__Commandes__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Commandes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:1: ( ( ';' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1981:1: ( ';' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1981:1: ( ';' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1982:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Commandes__Group_1__0__Impl4112); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1995:1: rule__Commandes__Group_1__1 : rule__Commandes__Group_1__1__Impl ;
    public final void rule__Commandes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:1: ( rule__Commandes__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:2: rule__Commandes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Commandes__Group_1__1__Impl_in_rule__Commandes__Group_1__14143);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:1: rule__Commandes__Group_1__1__Impl : ( ( rule__Commandes__Com2Assignment_1_1 ) ) ;
    public final void rule__Commandes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: ( ( ( rule__Commandes__Com2Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: ( ( rule__Commandes__Com2Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: ( ( rule__Commandes__Com2Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: ( rule__Commandes__Com2Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getCom2Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: ( rule__Commandes__Com2Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:2: rule__Commandes__Com2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Commandes__Com2Assignment_1_1_in_rule__Commandes__Group_1__1__Impl4170);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: rule__Commande__Group_0__0 : rule__Commande__Group_0__0__Impl rule__Commande__Group_0__1 ;
    public final void rule__Commande__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:1: ( rule__Commande__Group_0__0__Impl rule__Commande__Group_0__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:2: rule__Commande__Group_0__0__Impl rule__Commande__Group_0__1
            {
            pushFollow(FOLLOW_rule__Commande__Group_0__0__Impl_in_rule__Commande__Group_0__04204);
            rule__Commande__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commande__Group_0__1_in_rule__Commande__Group_0__04207);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: rule__Commande__Group_0__0__Impl : ( () ) ;
    public final void rule__Commande__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: ( ( () ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2044:1: ( () )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2044:1: ( () )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2045:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getCommandeAction_0_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: ()
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:1: 
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:1: rule__Commande__Group_0__1 : rule__Commande__Group_0__1__Impl ;
    public final void rule__Commande__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: ( rule__Commande__Group_0__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2063:2: rule__Commande__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Commande__Group_0__1__Impl_in_rule__Commande__Group_0__14265);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: rule__Commande__Group_0__1__Impl : ( ( rule__Commande__NopAssignment_0_1 ) ) ;
    public final void rule__Commande__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:1: ( ( ( rule__Commande__NopAssignment_0_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: ( ( rule__Commande__NopAssignment_0_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: ( ( rule__Commande__NopAssignment_0_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:1: ( rule__Commande__NopAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getNopAssignment_0_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:1: ( rule__Commande__NopAssignment_0_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:2: rule__Commande__NopAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Commande__NopAssignment_0_1_in_rule__Commande__Group_0__1__Impl4292);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:1: rule__AffectVar__Group__0 : rule__AffectVar__Group__0__Impl rule__AffectVar__Group__1 ;
    public final void rule__AffectVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2094:1: ( rule__AffectVar__Group__0__Impl rule__AffectVar__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:2: rule__AffectVar__Group__0__Impl rule__AffectVar__Group__1
            {
            pushFollow(FOLLOW_rule__AffectVar__Group__0__Impl_in_rule__AffectVar__Group__04326);
            rule__AffectVar__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AffectVar__Group__1_in_rule__AffectVar__Group__04329);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: rule__AffectVar__Group__0__Impl : ( ( rule__AffectVar__Var1Assignment_0 ) ) ;
    public final void rule__AffectVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: ( ( ( rule__AffectVar__Var1Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2107:1: ( ( rule__AffectVar__Var1Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2107:1: ( ( rule__AffectVar__Var1Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2108:1: ( rule__AffectVar__Var1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getVar1Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( rule__AffectVar__Var1Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:2: rule__AffectVar__Var1Assignment_0
            {
            pushFollow(FOLLOW_rule__AffectVar__Var1Assignment_0_in_rule__AffectVar__Group__0__Impl4356);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2119:1: rule__AffectVar__Group__1 : rule__AffectVar__Group__1__Impl rule__AffectVar__Group__2 ;
    public final void rule__AffectVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: ( rule__AffectVar__Group__1__Impl rule__AffectVar__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2124:2: rule__AffectVar__Group__1__Impl rule__AffectVar__Group__2
            {
            pushFollow(FOLLOW_rule__AffectVar__Group__1__Impl_in_rule__AffectVar__Group__14386);
            rule__AffectVar__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AffectVar__Group__2_in_rule__AffectVar__Group__14389);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: rule__AffectVar__Group__1__Impl : ( ':=' ) ;
    public final void rule__AffectVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: ( ( ':=' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2136:1: ( ':=' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2136:1: ( ':=' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__AffectVar__Group__1__Impl4417); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:1: rule__AffectVar__Group__2 : rule__AffectVar__Group__2__Impl ;
    public final void rule__AffectVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:1: ( rule__AffectVar__Group__2__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2155:2: rule__AffectVar__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AffectVar__Group__2__Impl_in_rule__AffectVar__Group__24448);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: rule__AffectVar__Group__2__Impl : ( ( rule__AffectVar__ExpAssignment_2 ) ) ;
    public final void rule__AffectVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2165:1: ( ( ( rule__AffectVar__ExpAssignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: ( ( rule__AffectVar__ExpAssignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: ( ( rule__AffectVar__ExpAssignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: ( rule__AffectVar__ExpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getExpAssignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: ( rule__AffectVar__ExpAssignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:2: rule__AffectVar__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__AffectVar__ExpAssignment_2_in_rule__AffectVar__Group__2__Impl4475);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2184:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2188:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2189:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04511);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__04514);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2196:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2200:1: ( ( 'while' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: ( 'while' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: ( 'while' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__While__Group__0__Impl4542); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2220:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14573);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__14576);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2227:1: rule__While__Group__1__Impl : ( ruleLC ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__1__Impl4603);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2244:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24632);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__24635);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2256:1: rule__While__Group__2__Impl : ( ( rule__While__Exp2Assignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: ( ( ( rule__While__Exp2Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: ( ( rule__While__Exp2Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: ( ( rule__While__Exp2Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: ( rule__While__Exp2Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExp2Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2263:1: ( rule__While__Exp2Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2263:2: rule__While__Exp2Assignment_2
            {
            pushFollow(FOLLOW_rule__While__Exp2Assignment_2_in_rule__While__Group__2__Impl4662);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2273:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34692);
            rule__While__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__34695);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2285:1: rule__While__Group__3__Impl : ( ruleLC ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2289:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2290:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2290:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__3__Impl4722);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2307:2: rule__While__Group__4__Impl rule__While__Group__5
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44751);
            rule__While__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__5_in_rule__While__Group__44754);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2314:1: rule__While__Group__4__Impl : ( 'do' ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2318:1: ( ( 'do' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: ( 'do' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: ( 'do' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getDoKeyword_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__While__Group__4__Impl4782); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2333:1: rule__While__Group__5 : rule__While__Group__5__Impl rule__While__Group__6 ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2337:1: ( rule__While__Group__5__Impl rule__While__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2338:2: rule__While__Group__5__Impl rule__While__Group__6
            {
            pushFollow(FOLLOW_rule__While__Group__5__Impl_in_rule__While__Group__54813);
            rule__While__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__6_in_rule__While__Group__54816);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2345:1: rule__While__Group__5__Impl : ( ruleLC ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2349:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2350:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2350:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__5__Impl4843);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2362:1: rule__While__Group__6 : rule__While__Group__6__Impl rule__While__Group__7 ;
    public final void rule__While__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2366:1: ( rule__While__Group__6__Impl rule__While__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:2: rule__While__Group__6__Impl rule__While__Group__7
            {
            pushFollow(FOLLOW_rule__While__Group__6__Impl_in_rule__While__Group__64872);
            rule__While__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__7_in_rule__While__Group__64875);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2374:1: rule__While__Group__6__Impl : ( ( rule__While__Com3Assignment_6 ) ) ;
    public final void rule__While__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2378:1: ( ( ( rule__While__Com3Assignment_6 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: ( ( rule__While__Com3Assignment_6 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: ( ( rule__While__Com3Assignment_6 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: ( rule__While__Com3Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getCom3Assignment_6()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2381:1: ( rule__While__Com3Assignment_6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2381:2: rule__While__Com3Assignment_6
            {
            pushFollow(FOLLOW_rule__While__Com3Assignment_6_in_rule__While__Group__6__Impl4902);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2391:1: rule__While__Group__7 : rule__While__Group__7__Impl rule__While__Group__8 ;
    public final void rule__While__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2395:1: ( rule__While__Group__7__Impl rule__While__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2396:2: rule__While__Group__7__Impl rule__While__Group__8
            {
            pushFollow(FOLLOW_rule__While__Group__7__Impl_in_rule__While__Group__74932);
            rule__While__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__8_in_rule__While__Group__74935);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:1: rule__While__Group__7__Impl : ( ruleLC ) ;
    public final void rule__While__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2407:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2408:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2408:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2409:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__While__Group__7__Impl4962);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:1: rule__While__Group__8 : rule__While__Group__8__Impl ;
    public final void rule__While__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:1: ( rule__While__Group__8__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2425:2: rule__While__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__8__Impl_in_rule__While__Group__84991);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2431:1: rule__While__Group__8__Impl : ( 'od' ) ;
    public final void rule__While__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:1: ( ( 'od' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: ( 'od' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: ( 'od' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getOdKeyword_8()); 
            }
            match(input,30,FOLLOW_30_in_rule__While__Group__8__Impl5019); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2473:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__05068);
            rule__For__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__1_in_rule__For__Group__05071);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2480:1: rule__For__Group__0__Impl : ( 'for' ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2484:1: ( ( 'for' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:1: ( 'for' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:1: ( 'for' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getForKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__For__Group__0__Impl5099); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2499:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2504:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__15130);
            rule__For__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__2_in_rule__For__Group__15133);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: rule__For__Group__1__Impl : ( ruleLC ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2515:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2516:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2516:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__1__Impl5160);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2528:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2532:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2533:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__25189);
            rule__For__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__3_in_rule__For__Group__25192);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2540:1: rule__For__Group__2__Impl : ( ( rule__For__Exp3Assignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2544:1: ( ( ( rule__For__Exp3Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2545:1: ( ( rule__For__Exp3Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2545:1: ( ( rule__For__Exp3Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: ( rule__For__Exp3Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getExp3Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:1: ( rule__For__Exp3Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:2: rule__For__Exp3Assignment_2
            {
            pushFollow(FOLLOW_rule__For__Exp3Assignment_2_in_rule__For__Group__2__Impl5219);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2557:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2561:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__35249);
            rule__For__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__4_in_rule__For__Group__35252);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2569:1: rule__For__Group__3__Impl : ( ruleLC ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2573:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2575:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__3__Impl5279);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: rule__For__Group__4 : rule__For__Group__4__Impl rule__For__Group__5 ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2590:1: ( rule__For__Group__4__Impl rule__For__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:2: rule__For__Group__4__Impl rule__For__Group__5
            {
            pushFollow(FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__45308);
            rule__For__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__5_in_rule__For__Group__45311);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: rule__For__Group__4__Impl : ( 'do' ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2602:1: ( ( 'do' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2603:1: ( 'do' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2603:1: ( 'do' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2604:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getDoKeyword_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__For__Group__4__Impl5339); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:1: rule__For__Group__5 : rule__For__Group__5__Impl rule__For__Group__6 ;
    public final void rule__For__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2621:1: ( rule__For__Group__5__Impl rule__For__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:2: rule__For__Group__5__Impl rule__For__Group__6
            {
            pushFollow(FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__55370);
            rule__For__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__6_in_rule__For__Group__55373);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:1: rule__For__Group__5__Impl : ( ruleLC ) ;
    public final void rule__For__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2633:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2634:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2634:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2635:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__5__Impl5400);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: rule__For__Group__6 : rule__For__Group__6__Impl rule__For__Group__7 ;
    public final void rule__For__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2650:1: ( rule__For__Group__6__Impl rule__For__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:2: rule__For__Group__6__Impl rule__For__Group__7
            {
            pushFollow(FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__65429);
            rule__For__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__7_in_rule__For__Group__65432);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: rule__For__Group__6__Impl : ( ( rule__For__Com4Assignment_6 ) ) ;
    public final void rule__For__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2662:1: ( ( ( rule__For__Com4Assignment_6 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: ( ( rule__For__Com4Assignment_6 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: ( ( rule__For__Com4Assignment_6 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: ( rule__For__Com4Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCom4Assignment_6()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: ( rule__For__Com4Assignment_6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:2: rule__For__Com4Assignment_6
            {
            pushFollow(FOLLOW_rule__For__Com4Assignment_6_in_rule__For__Group__6__Impl5459);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2675:1: rule__For__Group__7 : rule__For__Group__7__Impl rule__For__Group__8 ;
    public final void rule__For__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2679:1: ( rule__For__Group__7__Impl rule__For__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2680:2: rule__For__Group__7__Impl rule__For__Group__8
            {
            pushFollow(FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__75489);
            rule__For__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__8_in_rule__For__Group__75492);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2687:1: rule__For__Group__7__Impl : ( ruleLC ) ;
    public final void rule__For__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2691:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2692:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2692:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__For__Group__7__Impl5519);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2704:1: rule__For__Group__8 : rule__For__Group__8__Impl ;
    public final void rule__For__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2708:1: ( rule__For__Group__8__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2709:2: rule__For__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__85548);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2715:1: rule__For__Group__8__Impl : ( 'od' ) ;
    public final void rule__For__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:1: ( ( 'od' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2720:1: ( 'od' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2720:1: ( 'od' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2721:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getOdKeyword_8()); 
            }
            match(input,30,FOLLOW_30_in_rule__For__Group__8__Impl5576); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2752:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__05625);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__05628);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2764:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2768:1: ( ( 'if' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: ( 'if' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: ( 'if' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2770:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__If__Group__0__Impl5656); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__15687);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__15690);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2795:1: rule__If__Group__1__Impl : ( ruleLC ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2800:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2800:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2801:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__1__Impl5717);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2812:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__25746);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__25749);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2824:1: rule__If__Group__2__Impl : ( ( rule__If__Exp4Assignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2828:1: ( ( ( rule__If__Exp4Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2829:1: ( ( rule__If__Exp4Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2829:1: ( ( rule__If__Exp4Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2830:1: ( rule__If__Exp4Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExp4Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:1: ( rule__If__Exp4Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:2: rule__If__Exp4Assignment_2
            {
            pushFollow(FOLLOW_rule__If__Exp4Assignment_2_in_rule__If__Group__2__Impl5776);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2841:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2846:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__35806);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__35809);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2853:1: rule__If__Group__3__Impl : ( ruleLC ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2857:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2858:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2858:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__3__Impl5836);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2870:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2874:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2875:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__45865);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__5_in_rule__If__Group__45868);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2882:1: rule__If__Group__4__Impl : ( 'then' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2886:1: ( ( 'then' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2887:1: ( 'then' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2887:1: ( 'then' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2888:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenKeyword_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__If__Group__4__Impl5896); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2901:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2905:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2906:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__55927);
            rule__If__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__6_in_rule__If__Group__55930);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2913:1: rule__If__Group__5__Impl : ( ruleLC ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2917:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2919:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__5__Impl5957);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2930:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2934:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__65986);
            rule__If__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__7_in_rule__If__Group__65989);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2942:1: rule__If__Group__6__Impl : ( ( rule__If__Com5Assignment_6 ) ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2946:1: ( ( ( rule__If__Com5Assignment_6 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2947:1: ( ( rule__If__Com5Assignment_6 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2947:1: ( ( rule__If__Com5Assignment_6 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:1: ( rule__If__Com5Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCom5Assignment_6()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: ( rule__If__Com5Assignment_6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:2: rule__If__Com5Assignment_6
            {
            pushFollow(FOLLOW_rule__If__Com5Assignment_6_in_rule__If__Group__6__Impl6016);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2959:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2963:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2964:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__76046);
            rule__If__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__8_in_rule__If__Group__76049);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2971:1: rule__If__Group__7__Impl : ( ruleLC ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2975:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2976:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2976:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2977:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group__7__Impl6076);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2988:1: rule__If__Group__8 : rule__If__Group__8__Impl rule__If__Group__9 ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2992:1: ( rule__If__Group__8__Impl rule__If__Group__9 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2993:2: rule__If__Group__8__Impl rule__If__Group__9
            {
            pushFollow(FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__86105);
            rule__If__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__9_in_rule__If__Group__86108);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3000:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:1: ( ( ( rule__If__Group_8__0 )? ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3005:1: ( ( rule__If__Group_8__0 )? )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3005:1: ( ( rule__If__Group_8__0 )? )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3006:1: ( rule__If__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_8()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3007:1: ( rule__If__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3007:2: rule__If__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__If__Group_8__0_in_rule__If__Group__8__Impl6135);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: rule__If__Group__9 : rule__If__Group__9__Impl ;
    public final void rule__If__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3021:1: ( rule__If__Group__9__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:2: rule__If__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__9__Impl_in_rule__If__Group__96166);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3028:1: rule__If__Group__9__Impl : ( 'fi' ) ;
    public final void rule__If__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3032:1: ( ( 'fi' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3033:1: ( 'fi' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3033:1: ( 'fi' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getFiKeyword_9()); 
            }
            match(input,34,FOLLOW_34_in_rule__If__Group__9__Impl6194); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3071:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3072:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
            {
            pushFollow(FOLLOW_rule__If__Group_8__0__Impl_in_rule__If__Group_8__06245);
            rule__If__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__1_in_rule__If__Group_8__06248);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3079:1: rule__If__Group_8__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3083:1: ( ( 'else' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3084:1: ( 'else' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3084:1: ( 'else' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3085:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__If__Group_8__0__Impl6276); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl rule__If__Group_8__2 ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3102:1: ( rule__If__Group_8__1__Impl rule__If__Group_8__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:2: rule__If__Group_8__1__Impl rule__If__Group_8__2
            {
            pushFollow(FOLLOW_rule__If__Group_8__1__Impl_in_rule__If__Group_8__16307);
            rule__If__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__2_in_rule__If__Group_8__16310);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:1: rule__If__Group_8__1__Impl : ( ruleLC ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3114:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_8_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group_8__1__Impl6337);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: rule__If__Group_8__2 : rule__If__Group_8__2__Impl rule__If__Group_8__3 ;
    public final void rule__If__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3131:1: ( rule__If__Group_8__2__Impl rule__If__Group_8__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3132:2: rule__If__Group_8__2__Impl rule__If__Group_8__3
            {
            pushFollow(FOLLOW_rule__If__Group_8__2__Impl_in_rule__If__Group_8__26366);
            rule__If__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group_8__3_in_rule__If__Group_8__26369);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3139:1: rule__If__Group_8__2__Impl : ( ( rule__If__Com6Assignment_8_2 ) ) ;
    public final void rule__If__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3143:1: ( ( ( rule__If__Com6Assignment_8_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3144:1: ( ( rule__If__Com6Assignment_8_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3144:1: ( ( rule__If__Com6Assignment_8_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:1: ( rule__If__Com6Assignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCom6Assignment_8_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3146:1: ( rule__If__Com6Assignment_8_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3146:2: rule__If__Com6Assignment_8_2
            {
            pushFollow(FOLLOW_rule__If__Com6Assignment_8_2_in_rule__If__Group_8__2__Impl6396);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3156:1: rule__If__Group_8__3 : rule__If__Group_8__3__Impl ;
    public final void rule__If__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3160:1: ( rule__If__Group_8__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3161:2: rule__If__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__If__Group_8__3__Impl_in_rule__If__Group_8__36426);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3167:1: rule__If__Group_8__3__Impl : ( ruleLC ) ;
    public final void rule__If__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3171:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3172:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3172:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3173:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLCParserRuleCall_8_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__If__Group_8__3__Impl6453);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: rule__Foreach__Group__0 : rule__Foreach__Group__0__Impl rule__Foreach__Group__1 ;
    public final void rule__Foreach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3196:1: ( rule__Foreach__Group__0__Impl rule__Foreach__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3197:2: rule__Foreach__Group__0__Impl rule__Foreach__Group__1
            {
            pushFollow(FOLLOW_rule__Foreach__Group__0__Impl_in_rule__Foreach__Group__06490);
            rule__Foreach__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__1_in_rule__Foreach__Group__06493);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3204:1: rule__Foreach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__Foreach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:1: ( ( 'foreach' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:1: ( 'foreach' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:1: ( 'foreach' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getForeachKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Foreach__Group__0__Impl6521); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:1: rule__Foreach__Group__1 : rule__Foreach__Group__1__Impl rule__Foreach__Group__2 ;
    public final void rule__Foreach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: ( rule__Foreach__Group__1__Impl rule__Foreach__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:2: rule__Foreach__Group__1__Impl rule__Foreach__Group__2
            {
            pushFollow(FOLLOW_rule__Foreach__Group__1__Impl_in_rule__Foreach__Group__16552);
            rule__Foreach__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__2_in_rule__Foreach__Group__16555);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: rule__Foreach__Group__1__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3239:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3241:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__1__Impl6582);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:1: rule__Foreach__Group__2 : rule__Foreach__Group__2__Impl rule__Foreach__Group__3 ;
    public final void rule__Foreach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3256:1: ( rule__Foreach__Group__2__Impl rule__Foreach__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3257:2: rule__Foreach__Group__2__Impl rule__Foreach__Group__3
            {
            pushFollow(FOLLOW_rule__Foreach__Group__2__Impl_in_rule__Foreach__Group__26611);
            rule__Foreach__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__3_in_rule__Foreach__Group__26614);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:1: rule__Foreach__Group__2__Impl : ( ( rule__Foreach__Exp5Assignment_2 ) ) ;
    public final void rule__Foreach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3268:1: ( ( ( rule__Foreach__Exp5Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3269:1: ( ( rule__Foreach__Exp5Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3269:1: ( ( rule__Foreach__Exp5Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3270:1: ( rule__Foreach__Exp5Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getExp5Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:1: ( rule__Foreach__Exp5Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:2: rule__Foreach__Exp5Assignment_2
            {
            pushFollow(FOLLOW_rule__Foreach__Exp5Assignment_2_in_rule__Foreach__Group__2__Impl6641);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: rule__Foreach__Group__3 : rule__Foreach__Group__3__Impl rule__Foreach__Group__4 ;
    public final void rule__Foreach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3285:1: ( rule__Foreach__Group__3__Impl rule__Foreach__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:2: rule__Foreach__Group__3__Impl rule__Foreach__Group__4
            {
            pushFollow(FOLLOW_rule__Foreach__Group__3__Impl_in_rule__Foreach__Group__36671);
            rule__Foreach__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__4_in_rule__Foreach__Group__36674);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3293:1: rule__Foreach__Group__3__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3298:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3298:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3299:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__3__Impl6701);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3310:1: rule__Foreach__Group__4 : rule__Foreach__Group__4__Impl rule__Foreach__Group__5 ;
    public final void rule__Foreach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: ( rule__Foreach__Group__4__Impl rule__Foreach__Group__5 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3315:2: rule__Foreach__Group__4__Impl rule__Foreach__Group__5
            {
            pushFollow(FOLLOW_rule__Foreach__Group__4__Impl_in_rule__Foreach__Group__46730);
            rule__Foreach__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__5_in_rule__Foreach__Group__46733);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3322:1: rule__Foreach__Group__4__Impl : ( 'in' ) ;
    public final void rule__Foreach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3326:1: ( ( 'in' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3327:1: ( 'in' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3327:1: ( 'in' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getInKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__Foreach__Group__4__Impl6761); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3341:1: rule__Foreach__Group__5 : rule__Foreach__Group__5__Impl rule__Foreach__Group__6 ;
    public final void rule__Foreach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: ( rule__Foreach__Group__5__Impl rule__Foreach__Group__6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3346:2: rule__Foreach__Group__5__Impl rule__Foreach__Group__6
            {
            pushFollow(FOLLOW_rule__Foreach__Group__5__Impl_in_rule__Foreach__Group__56792);
            rule__Foreach__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__6_in_rule__Foreach__Group__56795);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3353:1: rule__Foreach__Group__5__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3358:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3358:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3359:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_5()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__5__Impl6822);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3370:1: rule__Foreach__Group__6 : rule__Foreach__Group__6__Impl rule__Foreach__Group__7 ;
    public final void rule__Foreach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3374:1: ( rule__Foreach__Group__6__Impl rule__Foreach__Group__7 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3375:2: rule__Foreach__Group__6__Impl rule__Foreach__Group__7
            {
            pushFollow(FOLLOW_rule__Foreach__Group__6__Impl_in_rule__Foreach__Group__66851);
            rule__Foreach__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__7_in_rule__Foreach__Group__66854);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3382:1: rule__Foreach__Group__6__Impl : ( ( rule__Foreach__Exp6Assignment_6 ) ) ;
    public final void rule__Foreach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:1: ( ( ( rule__Foreach__Exp6Assignment_6 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3387:1: ( ( rule__Foreach__Exp6Assignment_6 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3387:1: ( ( rule__Foreach__Exp6Assignment_6 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3388:1: ( rule__Foreach__Exp6Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getExp6Assignment_6()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3389:1: ( rule__Foreach__Exp6Assignment_6 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3389:2: rule__Foreach__Exp6Assignment_6
            {
            pushFollow(FOLLOW_rule__Foreach__Exp6Assignment_6_in_rule__Foreach__Group__6__Impl6881);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3399:1: rule__Foreach__Group__7 : rule__Foreach__Group__7__Impl rule__Foreach__Group__8 ;
    public final void rule__Foreach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: ( rule__Foreach__Group__7__Impl rule__Foreach__Group__8 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3404:2: rule__Foreach__Group__7__Impl rule__Foreach__Group__8
            {
            pushFollow(FOLLOW_rule__Foreach__Group__7__Impl_in_rule__Foreach__Group__76911);
            rule__Foreach__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__8_in_rule__Foreach__Group__76914);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3411:1: rule__Foreach__Group__7__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3415:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_7()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__7__Impl6941);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3428:1: rule__Foreach__Group__8 : rule__Foreach__Group__8__Impl rule__Foreach__Group__9 ;
    public final void rule__Foreach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3432:1: ( rule__Foreach__Group__8__Impl rule__Foreach__Group__9 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3433:2: rule__Foreach__Group__8__Impl rule__Foreach__Group__9
            {
            pushFollow(FOLLOW_rule__Foreach__Group__8__Impl_in_rule__Foreach__Group__86970);
            rule__Foreach__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__9_in_rule__Foreach__Group__86973);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3440:1: rule__Foreach__Group__8__Impl : ( 'do' ) ;
    public final void rule__Foreach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3444:1: ( ( 'do' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3445:1: ( 'do' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3445:1: ( 'do' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getDoKeyword_8()); 
            }
            match(input,29,FOLLOW_29_in_rule__Foreach__Group__8__Impl7001); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3459:1: rule__Foreach__Group__9 : rule__Foreach__Group__9__Impl rule__Foreach__Group__10 ;
    public final void rule__Foreach__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3463:1: ( rule__Foreach__Group__9__Impl rule__Foreach__Group__10 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3464:2: rule__Foreach__Group__9__Impl rule__Foreach__Group__10
            {
            pushFollow(FOLLOW_rule__Foreach__Group__9__Impl_in_rule__Foreach__Group__97032);
            rule__Foreach__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__10_in_rule__Foreach__Group__97035);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3471:1: rule__Foreach__Group__9__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3475:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3476:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3476:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_9()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__9__Impl7062);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3488:1: rule__Foreach__Group__10 : rule__Foreach__Group__10__Impl rule__Foreach__Group__11 ;
    public final void rule__Foreach__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3492:1: ( rule__Foreach__Group__10__Impl rule__Foreach__Group__11 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3493:2: rule__Foreach__Group__10__Impl rule__Foreach__Group__11
            {
            pushFollow(FOLLOW_rule__Foreach__Group__10__Impl_in_rule__Foreach__Group__107091);
            rule__Foreach__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__11_in_rule__Foreach__Group__107094);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3500:1: rule__Foreach__Group__10__Impl : ( ( rule__Foreach__Com7Assignment_10 ) ) ;
    public final void rule__Foreach__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3504:1: ( ( ( rule__Foreach__Com7Assignment_10 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3505:1: ( ( rule__Foreach__Com7Assignment_10 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3505:1: ( ( rule__Foreach__Com7Assignment_10 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: ( rule__Foreach__Com7Assignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getCom7Assignment_10()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3507:1: ( rule__Foreach__Com7Assignment_10 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3507:2: rule__Foreach__Com7Assignment_10
            {
            pushFollow(FOLLOW_rule__Foreach__Com7Assignment_10_in_rule__Foreach__Group__10__Impl7121);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3517:1: rule__Foreach__Group__11 : rule__Foreach__Group__11__Impl rule__Foreach__Group__12 ;
    public final void rule__Foreach__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3521:1: ( rule__Foreach__Group__11__Impl rule__Foreach__Group__12 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3522:2: rule__Foreach__Group__11__Impl rule__Foreach__Group__12
            {
            pushFollow(FOLLOW_rule__Foreach__Group__11__Impl_in_rule__Foreach__Group__117151);
            rule__Foreach__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Foreach__Group__12_in_rule__Foreach__Group__117154);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3529:1: rule__Foreach__Group__11__Impl : ( ruleLC ) ;
    public final void rule__Foreach__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3533:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3534:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3534:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3535:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getLCParserRuleCall_11()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Foreach__Group__11__Impl7181);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3546:1: rule__Foreach__Group__12 : rule__Foreach__Group__12__Impl ;
    public final void rule__Foreach__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3550:1: ( rule__Foreach__Group__12__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3551:2: rule__Foreach__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Foreach__Group__12__Impl_in_rule__Foreach__Group__127210);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3557:1: rule__Foreach__Group__12__Impl : ( 'od' ) ;
    public final void rule__Foreach__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3561:1: ( ( 'od' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3562:1: ( 'od' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3562:1: ( 'od' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3563:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getOdKeyword_12()); 
            }
            match(input,30,FOLLOW_30_in_rule__Foreach__Group__12__Impl7238); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3606:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3607:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__07295);
            rule__Vars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__07298);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3614:1: rule__Vars__Group__0__Impl : ( ( rule__Vars__Var2Assignment_0 ) ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:1: ( ( ( rule__Vars__Var2Assignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3619:1: ( ( rule__Vars__Var2Assignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3619:1: ( ( rule__Vars__Var2Assignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3620:1: ( rule__Vars__Var2Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVar2Assignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3621:1: ( rule__Vars__Var2Assignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3621:2: rule__Vars__Var2Assignment_0
            {
            pushFollow(FOLLOW_rule__Vars__Var2Assignment_0_in_rule__Vars__Group__0__Impl7325);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3635:1: ( rule__Vars__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3636:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__17355);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3642:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__Group_1__0 )* ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3646:1: ( ( ( rule__Vars__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: ( ( rule__Vars__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: ( ( rule__Vars__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ( rule__Vars__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:1: ( rule__Vars__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:2: rule__Vars__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl7382);
            	    rule__Vars__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:1: rule__Vars__Group_1__0 : rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 ;
    public final void rule__Vars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3667:1: ( rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3668:2: rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__07417);
            rule__Vars__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__07420);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3675:1: rule__Vars__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Vars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:1: ( ( ',' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3680:1: ( ',' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3680:1: ( ',' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3681:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Vars__Group_1__0__Impl7448); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:1: rule__Vars__Group_1__1 : rule__Vars__Group_1__1__Impl ;
    public final void rule__Vars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3698:1: ( rule__Vars__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3699:2: rule__Vars__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__17479);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3705:1: rule__Vars__Group_1__1__Impl : ( ( rule__Vars__Var3Assignment_1_1 ) ) ;
    public final void rule__Vars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:1: ( ( ( rule__Vars__Var3Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:1: ( ( rule__Vars__Var3Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:1: ( ( rule__Vars__Var3Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3711:1: ( rule__Vars__Var3Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVar3Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3712:1: ( rule__Vars__Var3Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3712:2: rule__Vars__Var3Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Vars__Var3Assignment_1_1_in_rule__Vars__Group_1__1__Impl7506);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3726:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3730:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3731:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__07540);
            rule__Exprs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__07543);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: rule__Exprs__Group__0__Impl : ( ( rule__Exprs__ExprSAssignment_0 ) ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3742:1: ( ( ( rule__Exprs__ExprSAssignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3743:1: ( ( rule__Exprs__ExprSAssignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3743:1: ( ( rule__Exprs__ExprSAssignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3744:1: ( rule__Exprs__ExprSAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprSAssignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3745:1: ( rule__Exprs__ExprSAssignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3745:2: rule__Exprs__ExprSAssignment_0
            {
            pushFollow(FOLLOW_rule__Exprs__ExprSAssignment_0_in_rule__Exprs__Group__0__Impl7570);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3759:1: ( rule__Exprs__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3760:2: rule__Exprs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__17600);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__Group_1__0 )* ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: ( ( ( rule__Exprs__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:1: ( ( rule__Exprs__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:1: ( ( rule__Exprs__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3772:1: ( rule__Exprs__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3773:1: ( rule__Exprs__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3773:2: rule__Exprs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl7627);
            	    rule__Exprs__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3787:1: rule__Exprs__Group_1__0 : rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 ;
    public final void rule__Exprs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3791:1: ( rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3792:2: rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__07662);
            rule__Exprs__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__07665);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3799:1: rule__Exprs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:1: ( ( ',' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3804:1: ( ',' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3804:1: ( ',' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3805:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Exprs__Group_1__0__Impl7693); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3818:1: rule__Exprs__Group_1__1 : rule__Exprs__Group_1__1__Impl ;
    public final void rule__Exprs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3822:1: ( rule__Exprs__Group_1__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3823:2: rule__Exprs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__17724);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3829:1: rule__Exprs__Group_1__1__Impl : ( ( rule__Exprs__ExprS2Assignment_1_1 ) ) ;
    public final void rule__Exprs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:1: ( ( ( rule__Exprs__ExprS2Assignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: ( ( rule__Exprs__ExprS2Assignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: ( ( rule__Exprs__ExprS2Assignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3835:1: ( rule__Exprs__ExprS2Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprS2Assignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3836:1: ( rule__Exprs__ExprS2Assignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3836:2: rule__Exprs__ExprS2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Exprs__ExprS2Assignment_1_1_in_rule__Exprs__Group_1__1__Impl7751);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:1: rule__ExprSimple__Group_0__0 : rule__ExprSimple__Group_0__0__Impl rule__ExprSimple__Group_0__1 ;
    public final void rule__ExprSimple__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3854:1: ( rule__ExprSimple__Group_0__0__Impl rule__ExprSimple__Group_0__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3855:2: rule__ExprSimple__Group_0__0__Impl rule__ExprSimple__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_0__0__Impl_in_rule__ExprSimple__Group_0__07785);
            rule__ExprSimple__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_0__1_in_rule__ExprSimple__Group_0__07788);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: rule__ExprSimple__Group_0__0__Impl : ( () ) ;
    public final void rule__ExprSimple__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3866:1: ( ( () ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3867:1: ( () )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3867:1: ( () )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3868:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprSimpleAction_0_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3869:1: ()
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3871:1: 
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3881:1: rule__ExprSimple__Group_0__1 : rule__ExprSimple__Group_0__1__Impl ;
    public final void rule__ExprSimple__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3885:1: ( rule__ExprSimple__Group_0__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3886:2: rule__ExprSimple__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_0__1__Impl_in_rule__ExprSimple__Group_0__17846);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3892:1: rule__ExprSimple__Group_0__1__Impl : ( ( rule__ExprSimple__VideAssignment_0_1 ) ) ;
    public final void rule__ExprSimple__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3896:1: ( ( ( rule__ExprSimple__VideAssignment_0_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3897:1: ( ( rule__ExprSimple__VideAssignment_0_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3897:1: ( ( rule__ExprSimple__VideAssignment_0_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3898:1: ( rule__ExprSimple__VideAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVideAssignment_0_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3899:1: ( rule__ExprSimple__VideAssignment_0_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3899:2: rule__ExprSimple__VideAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__VideAssignment_0_1_in_rule__ExprSimple__Group_0__1__Impl7873);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3913:1: rule__Cons__Group__0 : rule__Cons__Group__0__Impl rule__Cons__Group__1 ;
    public final void rule__Cons__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3917:1: ( rule__Cons__Group__0__Impl rule__Cons__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:2: rule__Cons__Group__0__Impl rule__Cons__Group__1
            {
            pushFollow(FOLLOW_rule__Cons__Group__0__Impl_in_rule__Cons__Group__07907);
            rule__Cons__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Cons__Group__1_in_rule__Cons__Group__07910);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3925:1: rule__Cons__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__Cons__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3929:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3930:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3930:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3931:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__Cons__Group__0__Impl7937); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:1: rule__Cons__Group__1 : rule__Cons__Group__1__Impl rule__Cons__Group__2 ;
    public final void rule__Cons__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3946:1: ( rule__Cons__Group__1__Impl rule__Cons__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3947:2: rule__Cons__Group__1__Impl rule__Cons__Group__2
            {
            pushFollow(FOLLOW_rule__Cons__Group__1__Impl_in_rule__Cons__Group__17966);
            rule__Cons__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Cons__Group__2_in_rule__Cons__Group__17969);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:1: rule__Cons__Group__1__Impl : ( 'cons' ) ;
    public final void rule__Cons__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3958:1: ( ( 'cons' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: ( 'cons' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: ( 'cons' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3960:1: 'cons'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getConsKeyword_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__Cons__Group__1__Impl7997); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3973:1: rule__Cons__Group__2 : rule__Cons__Group__2__Impl rule__Cons__Group__3 ;
    public final void rule__Cons__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: ( rule__Cons__Group__2__Impl rule__Cons__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3978:2: rule__Cons__Group__2__Impl rule__Cons__Group__3
            {
            pushFollow(FOLLOW_rule__Cons__Group__2__Impl_in_rule__Cons__Group__28028);
            rule__Cons__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Cons__Group__3_in_rule__Cons__Group__28031);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3985:1: rule__Cons__Group__2__Impl : ( ( rule__Cons__Le1Assignment_2 ) ) ;
    public final void rule__Cons__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: ( ( ( rule__Cons__Le1Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3990:1: ( ( rule__Cons__Le1Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3990:1: ( ( rule__Cons__Le1Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3991:1: ( rule__Cons__Le1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getLe1Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3992:1: ( rule__Cons__Le1Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3992:2: rule__Cons__Le1Assignment_2
            {
            pushFollow(FOLLOW_rule__Cons__Le1Assignment_2_in_rule__Cons__Group__2__Impl8058);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4002:1: rule__Cons__Group__3 : rule__Cons__Group__3__Impl ;
    public final void rule__Cons__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: ( rule__Cons__Group__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4007:2: rule__Cons__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Cons__Group__3__Impl_in_rule__Cons__Group__38088);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4013:1: rule__Cons__Group__3__Impl : ( RULE_PARAD ) ;
    public final void rule__Cons__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4017:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4018:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4018:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getPARADTerminalRuleCall_3()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__Cons__Group__3__Impl8115); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4038:1: rule__Liste__Group__0 : rule__Liste__Group__0__Impl rule__Liste__Group__1 ;
    public final void rule__Liste__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4042:1: ( rule__Liste__Group__0__Impl rule__Liste__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4043:2: rule__Liste__Group__0__Impl rule__Liste__Group__1
            {
            pushFollow(FOLLOW_rule__Liste__Group__0__Impl_in_rule__Liste__Group__08152);
            rule__Liste__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Liste__Group__1_in_rule__Liste__Group__08155);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4050:1: rule__Liste__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__Liste__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4054:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4055:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4055:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4056:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__Liste__Group__0__Impl8182); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4067:1: rule__Liste__Group__1 : rule__Liste__Group__1__Impl rule__Liste__Group__2 ;
    public final void rule__Liste__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4071:1: ( rule__Liste__Group__1__Impl rule__Liste__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4072:2: rule__Liste__Group__1__Impl rule__Liste__Group__2
            {
            pushFollow(FOLLOW_rule__Liste__Group__1__Impl_in_rule__Liste__Group__18211);
            rule__Liste__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Liste__Group__2_in_rule__Liste__Group__18214);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4079:1: rule__Liste__Group__1__Impl : ( 'list' ) ;
    public final void rule__Liste__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4083:1: ( ( 'list' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4084:1: ( 'list' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4084:1: ( 'list' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: 'list'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getListKeyword_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__Liste__Group__1__Impl8242); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4098:1: rule__Liste__Group__2 : rule__Liste__Group__2__Impl rule__Liste__Group__3 ;
    public final void rule__Liste__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4102:1: ( rule__Liste__Group__2__Impl rule__Liste__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4103:2: rule__Liste__Group__2__Impl rule__Liste__Group__3
            {
            pushFollow(FOLLOW_rule__Liste__Group__2__Impl_in_rule__Liste__Group__28273);
            rule__Liste__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Liste__Group__3_in_rule__Liste__Group__28276);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4110:1: rule__Liste__Group__2__Impl : ( ( rule__Liste__Le2Assignment_2 ) ) ;
    public final void rule__Liste__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4114:1: ( ( ( rule__Liste__Le2Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4115:1: ( ( rule__Liste__Le2Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4115:1: ( ( rule__Liste__Le2Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:1: ( rule__Liste__Le2Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getLe2Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4117:1: ( rule__Liste__Le2Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4117:2: rule__Liste__Le2Assignment_2
            {
            pushFollow(FOLLOW_rule__Liste__Le2Assignment_2_in_rule__Liste__Group__2__Impl8303);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4127:1: rule__Liste__Group__3 : rule__Liste__Group__3__Impl ;
    public final void rule__Liste__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4131:1: ( rule__Liste__Group__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4132:2: rule__Liste__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Liste__Group__3__Impl_in_rule__Liste__Group__38333);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4138:1: rule__Liste__Group__3__Impl : ( RULE_PARAD ) ;
    public final void rule__Liste__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4142:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4143:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4143:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4144:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getPARADTerminalRuleCall_3()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__Liste__Group__3__Impl8360); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4163:1: rule__Hd__Group__0 : rule__Hd__Group__0__Impl rule__Hd__Group__1 ;
    public final void rule__Hd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4167:1: ( rule__Hd__Group__0__Impl rule__Hd__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:2: rule__Hd__Group__0__Impl rule__Hd__Group__1
            {
            pushFollow(FOLLOW_rule__Hd__Group__0__Impl_in_rule__Hd__Group__08397);
            rule__Hd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Hd__Group__1_in_rule__Hd__Group__08400);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4175:1: rule__Hd__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__Hd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4179:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4180:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4180:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__Hd__Group__0__Impl8427); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4192:1: rule__Hd__Group__1 : rule__Hd__Group__1__Impl rule__Hd__Group__2 ;
    public final void rule__Hd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4196:1: ( rule__Hd__Group__1__Impl rule__Hd__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4197:2: rule__Hd__Group__1__Impl rule__Hd__Group__2
            {
            pushFollow(FOLLOW_rule__Hd__Group__1__Impl_in_rule__Hd__Group__18456);
            rule__Hd__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Hd__Group__2_in_rule__Hd__Group__18459);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4204:1: rule__Hd__Group__1__Impl : ( 'hd' ) ;
    public final void rule__Hd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4208:1: ( ( 'hd' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4209:1: ( 'hd' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4209:1: ( 'hd' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4210:1: 'hd'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getHdKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__Hd__Group__1__Impl8487); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4223:1: rule__Hd__Group__2 : rule__Hd__Group__2__Impl rule__Hd__Group__3 ;
    public final void rule__Hd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4227:1: ( rule__Hd__Group__2__Impl rule__Hd__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4228:2: rule__Hd__Group__2__Impl rule__Hd__Group__3
            {
            pushFollow(FOLLOW_rule__Hd__Group__2__Impl_in_rule__Hd__Group__28518);
            rule__Hd__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Hd__Group__3_in_rule__Hd__Group__28521);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4235:1: rule__Hd__Group__2__Impl : ( ruleLC ) ;
    public final void rule__Hd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4239:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4240:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4240:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4241:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getLCParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Hd__Group__2__Impl8548);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4252:1: rule__Hd__Group__3 : rule__Hd__Group__3__Impl rule__Hd__Group__4 ;
    public final void rule__Hd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: ( rule__Hd__Group__3__Impl rule__Hd__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4257:2: rule__Hd__Group__3__Impl rule__Hd__Group__4
            {
            pushFollow(FOLLOW_rule__Hd__Group__3__Impl_in_rule__Hd__Group__38577);
            rule__Hd__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Hd__Group__4_in_rule__Hd__Group__38580);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4264:1: rule__Hd__Group__3__Impl : ( ( rule__Hd__Le3Assignment_3 ) ) ;
    public final void rule__Hd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4268:1: ( ( ( rule__Hd__Le3Assignment_3 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4269:1: ( ( rule__Hd__Le3Assignment_3 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4269:1: ( ( rule__Hd__Le3Assignment_3 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4270:1: ( rule__Hd__Le3Assignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getLe3Assignment_3()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4271:1: ( rule__Hd__Le3Assignment_3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4271:2: rule__Hd__Le3Assignment_3
            {
            pushFollow(FOLLOW_rule__Hd__Le3Assignment_3_in_rule__Hd__Group__3__Impl8607);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:1: rule__Hd__Group__4 : rule__Hd__Group__4__Impl ;
    public final void rule__Hd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4285:1: ( rule__Hd__Group__4__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4286:2: rule__Hd__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Hd__Group__4__Impl_in_rule__Hd__Group__48637);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4292:1: rule__Hd__Group__4__Impl : ( RULE_PARAD ) ;
    public final void rule__Hd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4296:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4298:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getPARADTerminalRuleCall_4()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__Hd__Group__4__Impl8664); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4319:1: rule__Tl__Group__0 : rule__Tl__Group__0__Impl rule__Tl__Group__1 ;
    public final void rule__Tl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4323:1: ( rule__Tl__Group__0__Impl rule__Tl__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4324:2: rule__Tl__Group__0__Impl rule__Tl__Group__1
            {
            pushFollow(FOLLOW_rule__Tl__Group__0__Impl_in_rule__Tl__Group__08703);
            rule__Tl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tl__Group__1_in_rule__Tl__Group__08706);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4331:1: rule__Tl__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__Tl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4335:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4336:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4336:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4337:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__Tl__Group__0__Impl8733); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4348:1: rule__Tl__Group__1 : rule__Tl__Group__1__Impl rule__Tl__Group__2 ;
    public final void rule__Tl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4352:1: ( rule__Tl__Group__1__Impl rule__Tl__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4353:2: rule__Tl__Group__1__Impl rule__Tl__Group__2
            {
            pushFollow(FOLLOW_rule__Tl__Group__1__Impl_in_rule__Tl__Group__18762);
            rule__Tl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tl__Group__2_in_rule__Tl__Group__18765);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4360:1: rule__Tl__Group__1__Impl : ( 'tl' ) ;
    public final void rule__Tl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4364:1: ( ( 'tl' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4365:1: ( 'tl' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4365:1: ( 'tl' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4366:1: 'tl'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getTlKeyword_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__Tl__Group__1__Impl8793); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4379:1: rule__Tl__Group__2 : rule__Tl__Group__2__Impl rule__Tl__Group__3 ;
    public final void rule__Tl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4383:1: ( rule__Tl__Group__2__Impl rule__Tl__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4384:2: rule__Tl__Group__2__Impl rule__Tl__Group__3
            {
            pushFollow(FOLLOW_rule__Tl__Group__2__Impl_in_rule__Tl__Group__28824);
            rule__Tl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tl__Group__3_in_rule__Tl__Group__28827);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4391:1: rule__Tl__Group__2__Impl : ( ruleLC ) ;
    public final void rule__Tl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4395:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4396:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4396:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4397:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getLCParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__Tl__Group__2__Impl8854);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4408:1: rule__Tl__Group__3 : rule__Tl__Group__3__Impl rule__Tl__Group__4 ;
    public final void rule__Tl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4412:1: ( rule__Tl__Group__3__Impl rule__Tl__Group__4 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4413:2: rule__Tl__Group__3__Impl rule__Tl__Group__4
            {
            pushFollow(FOLLOW_rule__Tl__Group__3__Impl_in_rule__Tl__Group__38883);
            rule__Tl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tl__Group__4_in_rule__Tl__Group__38886);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4420:1: rule__Tl__Group__3__Impl : ( ( rule__Tl__Le4Assignment_3 ) ) ;
    public final void rule__Tl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4424:1: ( ( ( rule__Tl__Le4Assignment_3 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4425:1: ( ( rule__Tl__Le4Assignment_3 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4425:1: ( ( rule__Tl__Le4Assignment_3 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4426:1: ( rule__Tl__Le4Assignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getLe4Assignment_3()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4427:1: ( rule__Tl__Le4Assignment_3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4427:2: rule__Tl__Le4Assignment_3
            {
            pushFollow(FOLLOW_rule__Tl__Le4Assignment_3_in_rule__Tl__Group__3__Impl8913);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4437:1: rule__Tl__Group__4 : rule__Tl__Group__4__Impl ;
    public final void rule__Tl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4441:1: ( rule__Tl__Group__4__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4442:2: rule__Tl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Tl__Group__4__Impl_in_rule__Tl__Group__48943);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4448:1: rule__Tl__Group__4__Impl : ( RULE_PARAD ) ;
    public final void rule__Tl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4452:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4453:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4453:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getPARADTerminalRuleCall_4()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__Tl__Group__4__Impl8970); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4475:1: rule__SymboleEx__Group__0 : rule__SymboleEx__Group__0__Impl rule__SymboleEx__Group__1 ;
    public final void rule__SymboleEx__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4479:1: ( rule__SymboleEx__Group__0__Impl rule__SymboleEx__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4480:2: rule__SymboleEx__Group__0__Impl rule__SymboleEx__Group__1
            {
            pushFollow(FOLLOW_rule__SymboleEx__Group__0__Impl_in_rule__SymboleEx__Group__09009);
            rule__SymboleEx__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SymboleEx__Group__1_in_rule__SymboleEx__Group__09012);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4487:1: rule__SymboleEx__Group__0__Impl : ( RULE_PARAG ) ;
    public final void rule__SymboleEx__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4491:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4492:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4492:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4493:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getPARAGTerminalRuleCall_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__SymboleEx__Group__0__Impl9039); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4504:1: rule__SymboleEx__Group__1 : rule__SymboleEx__Group__1__Impl rule__SymboleEx__Group__2 ;
    public final void rule__SymboleEx__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4508:1: ( rule__SymboleEx__Group__1__Impl rule__SymboleEx__Group__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4509:2: rule__SymboleEx__Group__1__Impl rule__SymboleEx__Group__2
            {
            pushFollow(FOLLOW_rule__SymboleEx__Group__1__Impl_in_rule__SymboleEx__Group__19068);
            rule__SymboleEx__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SymboleEx__Group__2_in_rule__SymboleEx__Group__19071);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:1: rule__SymboleEx__Group__1__Impl : ( ( rule__SymboleEx__PAssignment_1 ) ) ;
    public final void rule__SymboleEx__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4520:1: ( ( ( rule__SymboleEx__PAssignment_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4521:1: ( ( rule__SymboleEx__PAssignment_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4521:1: ( ( rule__SymboleEx__PAssignment_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4522:1: ( rule__SymboleEx__PAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getPAssignment_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4523:1: ( rule__SymboleEx__PAssignment_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4523:2: rule__SymboleEx__PAssignment_1
            {
            pushFollow(FOLLOW_rule__SymboleEx__PAssignment_1_in_rule__SymboleEx__Group__1__Impl9098);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4533:1: rule__SymboleEx__Group__2 : rule__SymboleEx__Group__2__Impl rule__SymboleEx__Group__3 ;
    public final void rule__SymboleEx__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4537:1: ( rule__SymboleEx__Group__2__Impl rule__SymboleEx__Group__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4538:2: rule__SymboleEx__Group__2__Impl rule__SymboleEx__Group__3
            {
            pushFollow(FOLLOW_rule__SymboleEx__Group__2__Impl_in_rule__SymboleEx__Group__29128);
            rule__SymboleEx__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SymboleEx__Group__3_in_rule__SymboleEx__Group__29131);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4545:1: rule__SymboleEx__Group__2__Impl : ( ( rule__SymboleEx__Le5Assignment_2 ) ) ;
    public final void rule__SymboleEx__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:1: ( ( ( rule__SymboleEx__Le5Assignment_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4550:1: ( ( rule__SymboleEx__Le5Assignment_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4550:1: ( ( rule__SymboleEx__Le5Assignment_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:1: ( rule__SymboleEx__Le5Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getLe5Assignment_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4552:1: ( rule__SymboleEx__Le5Assignment_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4552:2: rule__SymboleEx__Le5Assignment_2
            {
            pushFollow(FOLLOW_rule__SymboleEx__Le5Assignment_2_in_rule__SymboleEx__Group__2__Impl9158);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4562:1: rule__SymboleEx__Group__3 : rule__SymboleEx__Group__3__Impl ;
    public final void rule__SymboleEx__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4566:1: ( rule__SymboleEx__Group__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:2: rule__SymboleEx__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SymboleEx__Group__3__Impl_in_rule__SymboleEx__Group__39188);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4573:1: rule__SymboleEx__Group__3__Impl : ( RULE_PARAD ) ;
    public final void rule__SymboleEx__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4577:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4578:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4578:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4579:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getPARADTerminalRuleCall_3()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__SymboleEx__Group__3__Impl9215); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4598:1: rule__LExpr__Group__0 : rule__LExpr__Group__0__Impl rule__LExpr__Group__1 ;
    public final void rule__LExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4602:1: ( rule__LExpr__Group__0__Impl rule__LExpr__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4603:2: rule__LExpr__Group__0__Impl rule__LExpr__Group__1
            {
            pushFollow(FOLLOW_rule__LExpr__Group__0__Impl_in_rule__LExpr__Group__09252);
            rule__LExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LExpr__Group__1_in_rule__LExpr__Group__09255);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4610:1: rule__LExpr__Group__0__Impl : ( ruleLC ) ;
    public final void rule__LExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4614:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4615:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4615:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4616:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getLCParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__LExpr__Group__0__Impl9282);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4627:1: rule__LExpr__Group__1 : rule__LExpr__Group__1__Impl ;
    public final void rule__LExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4631:1: ( rule__LExpr__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4632:2: rule__LExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LExpr__Group__1__Impl_in_rule__LExpr__Group__19311);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4638:1: rule__LExpr__Group__1__Impl : ( ( rule__LExpr__ExpLeAssignment_1 ) ) ;
    public final void rule__LExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4642:1: ( ( ( rule__LExpr__ExpLeAssignment_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4643:1: ( ( rule__LExpr__ExpLeAssignment_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4643:1: ( ( rule__LExpr__ExpLeAssignment_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4644:1: ( rule__LExpr__ExpLeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getExpLeAssignment_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4645:1: ( rule__LExpr__ExpLeAssignment_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4645:2: rule__LExpr__ExpLeAssignment_1
            {
            pushFollow(FOLLOW_rule__LExpr__ExpLeAssignment_1_in_rule__LExpr__Group__1__Impl9338);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4659:1: rule__ExprAnd__Group__0 : rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 ;
    public final void rule__ExprAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4663:1: ( rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4664:2: rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__09372);
            rule__ExprAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__09375);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4671:1: rule__ExprAnd__Group__0__Impl : ( ( rule__ExprAnd__ExpOAssignment_0 ) ) ;
    public final void rule__ExprAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4675:1: ( ( ( rule__ExprAnd__ExpOAssignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4676:1: ( ( rule__ExprAnd__ExpOAssignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4676:1: ( ( rule__ExprAnd__ExpOAssignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4677:1: ( rule__ExprAnd__ExpOAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExpOAssignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4678:1: ( rule__ExprAnd__ExpOAssignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4678:2: rule__ExprAnd__ExpOAssignment_0
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExpOAssignment_0_in_rule__ExprAnd__Group__0__Impl9402);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4688:1: rule__ExprAnd__Group__1 : rule__ExprAnd__Group__1__Impl ;
    public final void rule__ExprAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4692:1: ( rule__ExprAnd__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4693:2: rule__ExprAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__19432);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4699:1: rule__ExprAnd__Group__1__Impl : ( ( rule__ExprAnd__Group_1__0 )* ) ;
    public final void rule__ExprAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4703:1: ( ( ( rule__ExprAnd__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4704:1: ( ( rule__ExprAnd__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4704:1: ( ( rule__ExprAnd__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4705:1: ( rule__ExprAnd__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4706:1: ( rule__ExprAnd__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4706:2: rule__ExprAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl9459);
            	    rule__ExprAnd__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4720:1: rule__ExprAnd__Group_1__0 : rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 ;
    public final void rule__ExprAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4724:1: ( rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4725:2: rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__09494);
            rule__ExprAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__09497);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4732:1: rule__ExprAnd__Group_1__0__Impl : ( ruleLC ) ;
    public final void rule__ExprAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4736:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4737:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4737:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4738:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__0__Impl9524);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4749:1: rule__ExprAnd__Group_1__1 : rule__ExprAnd__Group_1__1__Impl rule__ExprAnd__Group_1__2 ;
    public final void rule__ExprAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4753:1: ( rule__ExprAnd__Group_1__1__Impl rule__ExprAnd__Group_1__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4754:2: rule__ExprAnd__Group_1__1__Impl rule__ExprAnd__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__19553);
            rule__ExprAnd__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__2_in_rule__ExprAnd__Group_1__19556);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4761:1: rule__ExprAnd__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__ExprAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4765:1: ( ( 'and' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4766:1: ( 'and' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4766:1: ( 'and' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4767:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getAndKeyword_1_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__ExprAnd__Group_1__1__Impl9584); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4780:1: rule__ExprAnd__Group_1__2 : rule__ExprAnd__Group_1__2__Impl rule__ExprAnd__Group_1__3 ;
    public final void rule__ExprAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4784:1: ( rule__ExprAnd__Group_1__2__Impl rule__ExprAnd__Group_1__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4785:2: rule__ExprAnd__Group_1__2__Impl rule__ExprAnd__Group_1__3
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__2__Impl_in_rule__ExprAnd__Group_1__29615);
            rule__ExprAnd__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__3_in_rule__ExprAnd__Group_1__29618);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4792:1: rule__ExprAnd__Group_1__2__Impl : ( ruleLC ) ;
    public final void rule__ExprAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4797:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4797:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__2__Impl9645);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4809:1: rule__ExprAnd__Group_1__3 : rule__ExprAnd__Group_1__3__Impl ;
    public final void rule__ExprAnd__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4813:1: ( rule__ExprAnd__Group_1__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4814:2: rule__ExprAnd__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__3__Impl_in_rule__ExprAnd__Group_1__39674);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4820:1: rule__ExprAnd__Group_1__3__Impl : ( ( rule__ExprAnd__ExpO2Assignment_1_3 ) ) ;
    public final void rule__ExprAnd__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4824:1: ( ( ( rule__ExprAnd__ExpO2Assignment_1_3 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4825:1: ( ( rule__ExprAnd__ExpO2Assignment_1_3 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4825:1: ( ( rule__ExprAnd__ExpO2Assignment_1_3 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4826:1: ( rule__ExprAnd__ExpO2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExpO2Assignment_1_3()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4827:1: ( rule__ExprAnd__ExpO2Assignment_1_3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4827:2: rule__ExprAnd__ExpO2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExpO2Assignment_1_3_in_rule__ExprAnd__Group_1__3__Impl9701);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4845:1: rule__ExprOr__Group__0 : rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 ;
    public final void rule__ExprOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4849:1: ( rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4850:2: rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__09739);
            rule__ExprOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__09742);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4857:1: rule__ExprOr__Group__0__Impl : ( ( rule__ExprOr__ExpNAssignment_0 ) ) ;
    public final void rule__ExprOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4861:1: ( ( ( rule__ExprOr__ExpNAssignment_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4862:1: ( ( rule__ExprOr__ExpNAssignment_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4862:1: ( ( rule__ExprOr__ExpNAssignment_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4863:1: ( rule__ExprOr__ExpNAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExpNAssignment_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4864:1: ( rule__ExprOr__ExpNAssignment_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4864:2: rule__ExprOr__ExpNAssignment_0
            {
            pushFollow(FOLLOW_rule__ExprOr__ExpNAssignment_0_in_rule__ExprOr__Group__0__Impl9769);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4874:1: rule__ExprOr__Group__1 : rule__ExprOr__Group__1__Impl ;
    public final void rule__ExprOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4878:1: ( rule__ExprOr__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4879:2: rule__ExprOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__19799);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4885:1: rule__ExprOr__Group__1__Impl : ( ( rule__ExprOr__Group_1__0 )* ) ;
    public final void rule__ExprOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4889:1: ( ( ( rule__ExprOr__Group_1__0 )* ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4890:1: ( ( rule__ExprOr__Group_1__0 )* )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4890:1: ( ( rule__ExprOr__Group_1__0 )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4891:1: ( rule__ExprOr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getGroup_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4892:1: ( rule__ExprOr__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4892:2: rule__ExprOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl9826);
            	    rule__ExprOr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4906:1: rule__ExprOr__Group_1__0 : rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 ;
    public final void rule__ExprOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4910:1: ( rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4911:2: rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__09861);
            rule__ExprOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__09864);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4918:1: rule__ExprOr__Group_1__0__Impl : ( ruleLC ) ;
    public final void rule__ExprOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4922:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4923:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4923:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4924:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprOr__Group_1__0__Impl9891);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4935:1: rule__ExprOr__Group_1__1 : rule__ExprOr__Group_1__1__Impl rule__ExprOr__Group_1__2 ;
    public final void rule__ExprOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4939:1: ( rule__ExprOr__Group_1__1__Impl rule__ExprOr__Group_1__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4940:2: rule__ExprOr__Group_1__1__Impl rule__ExprOr__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__19920);
            rule__ExprOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__2_in_rule__ExprOr__Group_1__19923);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4947:1: rule__ExprOr__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__ExprOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4951:1: ( ( 'or' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4952:1: ( 'or' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4952:1: ( 'or' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4953:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getOrKeyword_1_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__ExprOr__Group_1__1__Impl9951); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4966:1: rule__ExprOr__Group_1__2 : rule__ExprOr__Group_1__2__Impl rule__ExprOr__Group_1__3 ;
    public final void rule__ExprOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4970:1: ( rule__ExprOr__Group_1__2__Impl rule__ExprOr__Group_1__3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:2: rule__ExprOr__Group_1__2__Impl rule__ExprOr__Group_1__3
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__2__Impl_in_rule__ExprOr__Group_1__29982);
            rule__ExprOr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__3_in_rule__ExprOr__Group_1__29985);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4978:1: rule__ExprOr__Group_1__2__Impl : ( ruleLC ) ;
    public final void rule__ExprOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4982:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4983:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4983:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4984:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprOr__Group_1__2__Impl10012);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4995:1: rule__ExprOr__Group_1__3 : rule__ExprOr__Group_1__3__Impl ;
    public final void rule__ExprOr__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4999:1: ( rule__ExprOr__Group_1__3__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5000:2: rule__ExprOr__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__3__Impl_in_rule__ExprOr__Group_1__310041);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5006:1: rule__ExprOr__Group_1__3__Impl : ( ( rule__ExprOr__ExpN2Assignment_1_3 ) ) ;
    public final void rule__ExprOr__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5010:1: ( ( ( rule__ExprOr__ExpN2Assignment_1_3 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5011:1: ( ( rule__ExprOr__ExpN2Assignment_1_3 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5011:1: ( ( rule__ExprOr__ExpN2Assignment_1_3 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5012:1: ( rule__ExprOr__ExpN2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExpN2Assignment_1_3()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5013:1: ( rule__ExprOr__ExpN2Assignment_1_3 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5013:2: rule__ExprOr__ExpN2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__ExprOr__ExpN2Assignment_1_3_in_rule__ExprOr__Group_1__3__Impl10068);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5031:1: rule__ExprNotNot__Group__0 : rule__ExprNotNot__Group__0__Impl rule__ExprNotNot__Group__1 ;
    public final void rule__ExprNotNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5035:1: ( rule__ExprNotNot__Group__0__Impl rule__ExprNotNot__Group__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5036:2: rule__ExprNotNot__Group__0__Impl rule__ExprNotNot__Group__1
            {
            pushFollow(FOLLOW_rule__ExprNotNot__Group__0__Impl_in_rule__ExprNotNot__Group__010106);
            rule__ExprNotNot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprNotNot__Group__1_in_rule__ExprNotNot__Group__010109);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5043:1: rule__ExprNotNot__Group__0__Impl : ( ( rule__ExprNotNot__Group_0__0 ) ) ;
    public final void rule__ExprNotNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5047:1: ( ( ( rule__ExprNotNot__Group_0__0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: ( ( rule__ExprNotNot__Group_0__0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: ( ( rule__ExprNotNot__Group_0__0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5049:1: ( rule__ExprNotNot__Group_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotNotAccess().getGroup_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5050:1: ( rule__ExprNotNot__Group_0__0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5050:2: rule__ExprNotNot__Group_0__0
            {
            pushFollow(FOLLOW_rule__ExprNotNot__Group_0__0_in_rule__ExprNotNot__Group__0__Impl10136);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5060:1: rule__ExprNotNot__Group__1 : rule__ExprNotNot__Group__1__Impl ;
    public final void rule__ExprNotNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5064:1: ( rule__ExprNotNot__Group__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5065:2: rule__ExprNotNot__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprNotNot__Group__1__Impl_in_rule__ExprNotNot__Group__110166);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5071:1: rule__ExprNotNot__Group__1__Impl : ( ( rule__ExprNotNot__ExpEq1Assignment_1 ) ) ;
    public final void rule__ExprNotNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5075:1: ( ( ( rule__ExprNotNot__ExpEq1Assignment_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5076:1: ( ( rule__ExprNotNot__ExpEq1Assignment_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5076:1: ( ( rule__ExprNotNot__ExpEq1Assignment_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5077:1: ( rule__ExprNotNot__ExpEq1Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotNotAccess().getExpEq1Assignment_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5078:1: ( rule__ExprNotNot__ExpEq1Assignment_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5078:2: rule__ExprNotNot__ExpEq1Assignment_1
            {
            pushFollow(FOLLOW_rule__ExprNotNot__ExpEq1Assignment_1_in_rule__ExprNotNot__Group__1__Impl10193);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5092:1: rule__ExprNotNot__Group_0__0 : rule__ExprNotNot__Group_0__0__Impl rule__ExprNotNot__Group_0__1 ;
    public final void rule__ExprNotNot__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5096:1: ( rule__ExprNotNot__Group_0__0__Impl rule__ExprNotNot__Group_0__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5097:2: rule__ExprNotNot__Group_0__0__Impl rule__ExprNotNot__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprNotNot__Group_0__0__Impl_in_rule__ExprNotNot__Group_0__010227);
            rule__ExprNotNot__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprNotNot__Group_0__1_in_rule__ExprNotNot__Group_0__010230);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5104:1: rule__ExprNotNot__Group_0__0__Impl : ( 'not' ) ;
    public final void rule__ExprNotNot__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5108:1: ( ( 'not' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5109:1: ( 'not' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5109:1: ( 'not' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5110:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotNotAccess().getNotKeyword_0_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__ExprNotNot__Group_0__0__Impl10258); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5123:1: rule__ExprNotNot__Group_0__1 : rule__ExprNotNot__Group_0__1__Impl ;
    public final void rule__ExprNotNot__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5127:1: ( rule__ExprNotNot__Group_0__1__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5128:2: rule__ExprNotNot__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprNotNot__Group_0__1__Impl_in_rule__ExprNotNot__Group_0__110289);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5134:1: rule__ExprNotNot__Group_0__1__Impl : ( ruleLC ) ;
    public final void rule__ExprNotNot__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5138:1: ( ( ruleLC ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5139:1: ( ruleLC )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5139:1: ( ruleLC )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5140:1: ruleLC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotNotAccess().getLCParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleLC_in_rule__ExprNotNot__Group_0__1__Impl10316);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5155:1: rule__ExprEq__Group_0__0 : rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 ;
    public final void rule__ExprEq__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5159:1: ( rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5160:2: rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__010349);
            rule__ExprEq__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__010352);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5167:1: rule__ExprEq__Group_0__0__Impl : ( ( rule__ExprEq__ExpS1Assignment_0_0 ) ) ;
    public final void rule__ExprEq__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5171:1: ( ( ( rule__ExprEq__ExpS1Assignment_0_0 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5172:1: ( ( rule__ExprEq__ExpS1Assignment_0_0 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5172:1: ( ( rule__ExprEq__ExpS1Assignment_0_0 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5173:1: ( rule__ExprEq__ExpS1Assignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpS1Assignment_0_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5174:1: ( rule__ExprEq__ExpS1Assignment_0_0 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5174:2: rule__ExprEq__ExpS1Assignment_0_0
            {
            pushFollow(FOLLOW_rule__ExprEq__ExpS1Assignment_0_0_in_rule__ExprEq__Group_0__0__Impl10379);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5184:1: rule__ExprEq__Group_0__1 : rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 ;
    public final void rule__ExprEq__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5188:1: ( rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5189:2: rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__110409);
            rule__ExprEq__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__110412);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5196:1: rule__ExprEq__Group_0__1__Impl : ( '=?' ) ;
    public final void rule__ExprEq__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5200:1: ( ( '=?' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5201:1: ( '=?' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5201:1: ( '=?' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5202:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__ExprEq__Group_0__1__Impl10440); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5215:1: rule__ExprEq__Group_0__2 : rule__ExprEq__Group_0__2__Impl ;
    public final void rule__ExprEq__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:1: ( rule__ExprEq__Group_0__2__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5220:2: rule__ExprEq__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__210471);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5226:1: rule__ExprEq__Group_0__2__Impl : ( ( rule__ExprEq__ExpS2Assignment_0_2 ) ) ;
    public final void rule__ExprEq__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5230:1: ( ( ( rule__ExprEq__ExpS2Assignment_0_2 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5231:1: ( ( rule__ExprEq__ExpS2Assignment_0_2 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5231:1: ( ( rule__ExprEq__ExpS2Assignment_0_2 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5232:1: ( rule__ExprEq__ExpS2Assignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpS2Assignment_0_2()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5233:1: ( rule__ExprEq__ExpS2Assignment_0_2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5233:2: rule__ExprEq__ExpS2Assignment_0_2
            {
            pushFollow(FOLLOW_rule__ExprEq__ExpS2Assignment_0_2_in_rule__ExprEq__Group_0__2__Impl10498);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5249:1: rule__ExprEq__Group_1__0 : rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 ;
    public final void rule__ExprEq__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5253:1: ( rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5254:2: rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__010534);
            rule__ExprEq__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__010537);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5261:1: rule__ExprEq__Group_1__0__Impl : ( RULE_PARAG ) ;
    public final void rule__ExprEq__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5265:1: ( ( RULE_PARAG ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:1: ( RULE_PARAG )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:1: ( RULE_PARAG )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5267:1: RULE_PARAG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getPARAGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_rule__ExprEq__Group_1__0__Impl10564); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5278:1: rule__ExprEq__Group_1__1 : rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 ;
    public final void rule__ExprEq__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5282:1: ( rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5283:2: rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__110593);
            rule__ExprEq__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__110596);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5290:1: rule__ExprEq__Group_1__1__Impl : ( ( rule__ExprEq__ExpRAssignment_1_1 ) ) ;
    public final void rule__ExprEq__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5294:1: ( ( ( rule__ExprEq__ExpRAssignment_1_1 ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5295:1: ( ( rule__ExprEq__ExpRAssignment_1_1 ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5295:1: ( ( rule__ExprEq__ExpRAssignment_1_1 ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5296:1: ( rule__ExprEq__ExpRAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpRAssignment_1_1()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5297:1: ( rule__ExprEq__ExpRAssignment_1_1 )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5297:2: rule__ExprEq__ExpRAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprEq__ExpRAssignment_1_1_in_rule__ExprEq__Group_1__1__Impl10623);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5307:1: rule__ExprEq__Group_1__2 : rule__ExprEq__Group_1__2__Impl ;
    public final void rule__ExprEq__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5311:1: ( rule__ExprEq__Group_1__2__Impl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5312:2: rule__ExprEq__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__210653);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5318:1: rule__ExprEq__Group_1__2__Impl : ( RULE_PARAD ) ;
    public final void rule__ExprEq__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5322:1: ( ( RULE_PARAD ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5323:1: ( RULE_PARAD )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5323:1: ( RULE_PARAD )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5324:1: RULE_PARAD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getPARADTerminalRuleCall_1_2()); 
            }
            match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_rule__ExprEq__Group_1__2__Impl10680); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5342:1: rule__Model__ProgrammeAssignment : ( ruleProgramme ) ;
    public final void rule__Model__ProgrammeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5346:1: ( ( ruleProgramme ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5347:1: ( ruleProgramme )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5347:1: ( ruleProgramme )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5348:1: ruleProgramme
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getProgrammeProgrammeParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleProgramme_in_rule__Model__ProgrammeAssignment10720);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5357:1: rule__Programme__FonctAssignment_1_0 : ( ruleFonction ) ;
    public final void rule__Programme__FonctAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5361:1: ( ( ruleFonction ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5362:1: ( ruleFonction )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5362:1: ( ruleFonction )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5363:1: ruleFonction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgrammeAccess().getFonctFonctionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleFonction_in_rule__Programme__FonctAssignment_1_010751);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5372:1: rule__Fonction__SymboleAssignment_2 : ( RULE_SYM ) ;
    public final void rule__Fonction__SymboleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5376:1: ( ( RULE_SYM ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5377:1: ( RULE_SYM )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5377:1: ( RULE_SYM )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5378:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getSymboleSYMTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__Fonction__SymboleAssignment_210782); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5387:1: rule__Fonction__InAssignment_7 : ( ruleInput ) ;
    public final void rule__Fonction__InAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5391:1: ( ( ruleInput ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5392:1: ( ruleInput )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5392:1: ( ruleInput )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5393:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getInInputParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Fonction__InAssignment_710813);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5402:1: rule__Fonction__ComAssignment_9 : ( ruleCommandes ) ;
    public final void rule__Fonction__ComAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5406:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5407:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5407:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5408:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getComCommandesParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__Fonction__ComAssignment_910844);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5417:1: rule__Fonction__OutAssignment_13 : ( ruleOutput ) ;
    public final void rule__Fonction__OutAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5421:1: ( ( ruleOutput ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5422:1: ( ruleOutput )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5422:1: ( ruleOutput )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5423:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFonctionAccess().getOutOutputParserRuleCall_13_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Fonction__OutAssignment_1310875);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5432:1: rule__Input__Var1Assignment_0 : ( RULE_VAR ) ;
    public final void rule__Input__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5436:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5437:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5437:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5438:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVar1VARTerminalRuleCall_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Input__Var1Assignment_010906); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5447:1: rule__Input__Var2Assignment_1_1 : ( RULE_VAR ) ;
    public final void rule__Input__Var2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5451:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5452:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5452:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5453:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVar2VARTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Input__Var2Assignment_1_110937); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5462:1: rule__Output__Var1Assignment_0 : ( RULE_VAR ) ;
    public final void rule__Output__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5466:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5467:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5467:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5468:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVar1VARTerminalRuleCall_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Output__Var1Assignment_010968); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5477:1: rule__Output__Var2Assignment_1_1 : ( RULE_VAR ) ;
    public final void rule__Output__Var2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5481:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5482:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5482:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5483:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVar2VARTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Output__Var2Assignment_1_110999); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5492:1: rule__Commandes__Com1Assignment_0 : ( ruleCommande ) ;
    public final void rule__Commandes__Com1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5496:1: ( ( ruleCommande ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5497:1: ( ruleCommande )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5497:1: ( ruleCommande )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5498:1: ruleCommande
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getCom1CommandeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommande_in_rule__Commandes__Com1Assignment_011030);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5507:1: rule__Commandes__Com2Assignment_1_1 : ( ruleCommande ) ;
    public final void rule__Commandes__Com2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5511:1: ( ( ruleCommande ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5512:1: ( ruleCommande )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5512:1: ( ruleCommande )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5513:1: ruleCommande
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandesAccess().getCom2CommandeParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCommande_in_rule__Commandes__Com2Assignment_1_111061);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5522:1: rule__Commande__NopAssignment_0_1 : ( ( 'nop' ) ) ;
    public final void rule__Commande__NopAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5526:1: ( ( ( 'nop' ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5527:1: ( ( 'nop' ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5527:1: ( ( 'nop' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5528:1: ( 'nop' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getNopNopKeyword_0_1_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5529:1: ( 'nop' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5530:1: 'nop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getNopNopKeyword_0_1_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Commande__NopAssignment_0_111097); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5545:1: rule__Commande__AffectVarAssignment_1 : ( ruleAffectVar ) ;
    public final void rule__Commande__AffectVarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5549:1: ( ( ruleAffectVar ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5550:1: ( ruleAffectVar )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5550:1: ( ruleAffectVar )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5551:1: ruleAffectVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getAffectVarAffectVarParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAffectVar_in_rule__Commande__AffectVarAssignment_111136);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5560:1: rule__Commande__WhileCAssignment_2 : ( ruleWhile ) ;
    public final void rule__Commande__WhileCAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5564:1: ( ( ruleWhile ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5565:1: ( ruleWhile )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5565:1: ( ruleWhile )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5566:1: ruleWhile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getWhileCWhileParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_rule__Commande__WhileCAssignment_211167);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5575:1: rule__Commande__ForCAssignment_3 : ( ruleFor ) ;
    public final void rule__Commande__ForCAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5579:1: ( ( ruleFor ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5580:1: ( ruleFor )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5580:1: ( ruleFor )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5581:1: ruleFor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getForCForParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFor_in_rule__Commande__ForCAssignment_311198);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5590:1: rule__Commande__IfCAssignment_4 : ( ruleIf ) ;
    public final void rule__Commande__IfCAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5594:1: ( ( ruleIf ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5595:1: ( ruleIf )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5595:1: ( ruleIf )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5596:1: ruleIf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getIfCIfParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleIf_in_rule__Commande__IfCAssignment_411229);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5605:1: rule__Commande__ForeachCAssignment_5 : ( ruleForeach ) ;
    public final void rule__Commande__ForeachCAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5609:1: ( ( ruleForeach ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5610:1: ( ruleForeach )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5610:1: ( ruleForeach )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5611:1: ruleForeach
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandeAccess().getForeachCForeachParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleForeach_in_rule__Commande__ForeachCAssignment_511260);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5620:1: rule__AffectVar__Var1Assignment_0 : ( ruleVars ) ;
    public final void rule__AffectVar__Var1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5624:1: ( ( ruleVars ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5625:1: ( ruleVars )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5625:1: ( ruleVars )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5626:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getVar1VarsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__AffectVar__Var1Assignment_011291);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5635:1: rule__AffectVar__ExpAssignment_2 : ( ruleExprs ) ;
    public final void rule__AffectVar__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5639:1: ( ( ruleExprs ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5640:1: ( ruleExprs )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5640:1: ( ruleExprs )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5641:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAffectVarAccess().getExpExprsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__AffectVar__ExpAssignment_211322);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5650:1: rule__While__Exp2Assignment_2 : ( ruleExpr ) ;
    public final void rule__While__Exp2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5654:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5655:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5655:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5656:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExp2ExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__While__Exp2Assignment_211353);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5665:1: rule__While__Com3Assignment_6 : ( ruleCommandes ) ;
    public final void rule__While__Com3Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5669:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5670:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5670:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5671:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getCom3CommandesParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__While__Com3Assignment_611384);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5680:1: rule__For__Exp3Assignment_2 : ( ruleExpr ) ;
    public final void rule__For__Exp3Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5684:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5685:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5685:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5686:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getExp3ExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__For__Exp3Assignment_211415);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5695:1: rule__For__Com4Assignment_6 : ( ruleCommandes ) ;
    public final void rule__For__Com4Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5699:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5700:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5700:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5701:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCom4CommandesParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__For__Com4Assignment_611446);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5710:1: rule__If__Exp4Assignment_2 : ( ruleExpr ) ;
    public final void rule__If__Exp4Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5714:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5715:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5715:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5716:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExp4ExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__If__Exp4Assignment_211477);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5725:1: rule__If__Com5Assignment_6 : ( ruleCommandes ) ;
    public final void rule__If__Com5Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5729:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5730:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5730:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5731:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCom5CommandesParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__If__Com5Assignment_611508);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5740:1: rule__If__Com6Assignment_8_2 : ( ruleCommandes ) ;
    public final void rule__If__Com6Assignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5744:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5745:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5745:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5746:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getCom6CommandesParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__If__Com6Assignment_8_211539);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5755:1: rule__Foreach__Exp5Assignment_2 : ( ruleExpr ) ;
    public final void rule__Foreach__Exp5Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5759:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5760:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5760:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5761:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getExp5ExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Foreach__Exp5Assignment_211570);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5770:1: rule__Foreach__Exp6Assignment_6 : ( ruleExpr ) ;
    public final void rule__Foreach__Exp6Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5774:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5775:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5775:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5776:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getExp6ExprParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Foreach__Exp6Assignment_611601);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5785:1: rule__Foreach__Com7Assignment_10 : ( ruleCommandes ) ;
    public final void rule__Foreach__Com7Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5789:1: ( ( ruleCommandes ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5790:1: ( ruleCommandes )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5790:1: ( ruleCommandes )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5791:1: ruleCommandes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachAccess().getCom7CommandesParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_rule__Foreach__Com7Assignment_1011632);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5800:1: rule__Vars__Var2Assignment_0 : ( RULE_VAR ) ;
    public final void rule__Vars__Var2Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5804:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5805:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5805:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5806:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVar2VARTerminalRuleCall_0_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Vars__Var2Assignment_011663); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5815:1: rule__Vars__Var3Assignment_1_1 : ( RULE_VAR ) ;
    public final void rule__Vars__Var3Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5819:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5820:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5820:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5821:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVar3VARTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__Vars__Var3Assignment_1_111694); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5830:1: rule__Exprs__ExprSAssignment_0 : ( ruleExpr ) ;
    public final void rule__Exprs__ExprSAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5834:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5835:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5835:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5836:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprSExprParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExprSAssignment_011725);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5845:1: rule__Exprs__ExprS2Assignment_1_1 : ( ruleExpr ) ;
    public final void rule__Exprs__ExprS2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5849:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5850:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5850:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5851:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprS2ExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExprS2Assignment_1_111756);
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


    // $ANTLR start "rule__Expr__ExpSAssignment_0"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5860:1: rule__Expr__ExpSAssignment_0 : ( ruleExprSimple ) ;
    public final void rule__Expr__ExpSAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5864:1: ( ( ruleExprSimple ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5865:1: ( ruleExprSimple )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5865:1: ( ruleExprSimple )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5866:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExpSExprSimpleParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__Expr__ExpSAssignment_011787);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExpSExprSimpleParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExpSAssignment_0"


    // $ANTLR start "rule__Expr__ExpAAssignment_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5875:1: rule__Expr__ExpAAssignment_1 : ( ruleExprAnd ) ;
    public final void rule__Expr__ExpAAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5879:1: ( ( ruleExprAnd ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5880:1: ( ruleExprAnd )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5880:1: ( ruleExprAnd )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5881:1: ruleExprAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExpAExprAndParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_rule__Expr__ExpAAssignment_111818);
            ruleExprAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExpAExprAndParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExpAAssignment_1"


    // $ANTLR start "rule__ExprSimple__VideAssignment_0_1"
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5890:1: rule__ExprSimple__VideAssignment_0_1 : ( ( 'nil' ) ) ;
    public final void rule__ExprSimple__VideAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5894:1: ( ( ( 'nil' ) ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5895:1: ( ( 'nil' ) )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5895:1: ( ( 'nil' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5896:1: ( 'nil' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVideNilKeyword_0_1_0()); 
            }
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5897:1: ( 'nil' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5898:1: 'nil'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVideNilKeyword_0_1_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__ExprSimple__VideAssignment_0_111854); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5913:1: rule__ExprSimple__VariableAssignment_1 : ( RULE_VAR ) ;
    public final void rule__ExprSimple__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5917:1: ( ( RULE_VAR ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5918:1: ( RULE_VAR )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5918:1: ( RULE_VAR )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5919:1: RULE_VAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVariableVARTerminalRuleCall_1_0()); 
            }
            match(input,RULE_VAR,FOLLOW_RULE_VAR_in_rule__ExprSimple__VariableAssignment_111893); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5928:1: rule__ExprSimple__SymboleAssignment_2 : ( RULE_SYM ) ;
    public final void rule__ExprSimple__SymboleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5932:1: ( ( RULE_SYM ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5933:1: ( RULE_SYM )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5933:1: ( RULE_SYM )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5934:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymboleSYMTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__ExprSimple__SymboleAssignment_211924); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5943:1: rule__ExprSimple__ConsAssignment_3 : ( ruleCons ) ;
    public final void rule__ExprSimple__ConsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5947:1: ( ( ruleCons ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5948:1: ( ruleCons )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5948:1: ( ruleCons )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5949:1: ruleCons
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getConsConsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCons_in_rule__ExprSimple__ConsAssignment_311955);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5958:1: rule__ExprSimple__ListeAssignment_4 : ( ruleListe ) ;
    public final void rule__ExprSimple__ListeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5962:1: ( ( ruleListe ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5963:1: ( ruleListe )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5963:1: ( ruleListe )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5964:1: ruleListe
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getListeListeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleListe_in_rule__ExprSimple__ListeAssignment_411986);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5973:1: rule__ExprSimple__HdAssignment_5 : ( ruleHd ) ;
    public final void rule__ExprSimple__HdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5977:1: ( ( ruleHd ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5978:1: ( ruleHd )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5978:1: ( ruleHd )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5979:1: ruleHd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getHdHdParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleHd_in_rule__ExprSimple__HdAssignment_512017);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5988:1: rule__ExprSimple__TlAssignment_6 : ( ruleTl ) ;
    public final void rule__ExprSimple__TlAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5992:1: ( ( ruleTl ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5993:1: ( ruleTl )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5993:1: ( ruleTl )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5994:1: ruleTl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getTlTlParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleTl_in_rule__ExprSimple__TlAssignment_612048);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6003:1: rule__ExprSimple__SymbolExAssignment_7 : ( ruleSymboleEx ) ;
    public final void rule__ExprSimple__SymbolExAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6007:1: ( ( ruleSymboleEx ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6008:1: ( ruleSymboleEx )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6008:1: ( ruleSymboleEx )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6009:1: ruleSymboleEx
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymbolExSymboleExParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleSymboleEx_in_rule__ExprSimple__SymbolExAssignment_712079);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6018:1: rule__Cons__Le1Assignment_2 : ( ruleLExpr ) ;
    public final void rule__Cons__Le1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6022:1: ( ( ruleLExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6023:1: ( ruleLExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6023:1: ( ruleLExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6024:1: ruleLExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getLe1LExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_rule__Cons__Le1Assignment_212110);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6033:1: rule__Liste__Le2Assignment_2 : ( ruleLExpr ) ;
    public final void rule__Liste__Le2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6037:1: ( ( ruleLExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6038:1: ( ruleLExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6038:1: ( ruleLExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6039:1: ruleLExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListeAccess().getLe2LExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_rule__Liste__Le2Assignment_212141);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6048:1: rule__Hd__Le3Assignment_3 : ( ruleExpr ) ;
    public final void rule__Hd__Le3Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6052:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6053:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6053:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6054:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHdAccess().getLe3ExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Hd__Le3Assignment_312172);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6063:1: rule__Tl__Le4Assignment_3 : ( ruleExpr ) ;
    public final void rule__Tl__Le4Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6067:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6068:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6068:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6069:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTlAccess().getLe4ExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Tl__Le4Assignment_312203);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6078:1: rule__SymboleEx__PAssignment_1 : ( RULE_SYM ) ;
    public final void rule__SymboleEx__PAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6082:1: ( ( RULE_SYM ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6083:1: ( RULE_SYM )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6083:1: ( RULE_SYM )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6084:1: RULE_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getPSYMTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SYM,FOLLOW_RULE_SYM_in_rule__SymboleEx__PAssignment_112234); if (state.failed) return ;
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6093:1: rule__SymboleEx__Le5Assignment_2 : ( ruleLExpr ) ;
    public final void rule__SymboleEx__Le5Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6097:1: ( ( ruleLExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6098:1: ( ruleLExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6098:1: ( ruleLExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6099:1: ruleLExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymboleExAccess().getLe5LExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_rule__SymboleEx__Le5Assignment_212265);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6108:1: rule__LExpr__ExpLeAssignment_1 : ( ruleExpr ) ;
    public final void rule__LExpr__ExpLeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6112:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6113:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6113:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6114:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExprAccess().getExpLeExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__LExpr__ExpLeAssignment_112296);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6123:1: rule__ExprAnd__ExpOAssignment_0 : ( ruleExprOr ) ;
    public final void rule__ExprAnd__ExpOAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6127:1: ( ( ruleExprOr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6128:1: ( ruleExprOr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6128:1: ( ruleExprOr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6129:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExpOExprOrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprAnd__ExpOAssignment_012327);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6138:1: rule__ExprAnd__ExpO2Assignment_1_3 : ( ruleExprOr ) ;
    public final void rule__ExprAnd__ExpO2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6142:1: ( ( ruleExprOr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6143:1: ( ruleExprOr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6143:1: ( ruleExprOr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6144:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExpO2ExprOrParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprAnd__ExpO2Assignment_1_312358);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6153:1: rule__ExprOr__ExpNAssignment_0 : ( ruleExprNot ) ;
    public final void rule__ExprOr__ExpNAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6157:1: ( ( ruleExprNot ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6158:1: ( ruleExprNot )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6158:1: ( ruleExprNot )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6159:1: ruleExprNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExpNExprNotParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_rule__ExprOr__ExpNAssignment_012389);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6168:1: rule__ExprOr__ExpN2Assignment_1_3 : ( ruleExprNot ) ;
    public final void rule__ExprOr__ExpN2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6172:1: ( ( ruleExprNot ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6173:1: ( ruleExprNot )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6173:1: ( ruleExprNot )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6174:1: ruleExprNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExpN2ExprNotParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_rule__ExprOr__ExpN2Assignment_1_312420);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6183:1: rule__ExprNot__ExprNotNotAssignment_0 : ( ruleExprNotNot ) ;
    public final void rule__ExprNot__ExprNotNotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6187:1: ( ( ruleExprNotNot ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6188:1: ( ruleExprNotNot )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6188:1: ( ruleExprNotNot )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6189:1: ruleExprNotNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExprNotNotExprNotNotParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprNotNot_in_rule__ExprNot__ExprNotNotAssignment_012451);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6198:1: rule__ExprNot__ExprNotDoAssignment_1 : ( ruleExprNotDo ) ;
    public final void rule__ExprNot__ExprNotDoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6202:1: ( ( ruleExprNotDo ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6203:1: ( ruleExprNotDo )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6203:1: ( ruleExprNotDo )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6204:1: ruleExprNotDo
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExprNotDoExprNotDoParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprNotDo_in_rule__ExprNot__ExprNotDoAssignment_112482);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6213:1: rule__ExprNotNot__ExpEq1Assignment_1 : ( ruleExprEq ) ;
    public final void rule__ExprNotNot__ExpEq1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6217:1: ( ( ruleExprEq ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6218:1: ( ruleExprEq )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6218:1: ( ruleExprEq )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6219:1: ruleExprEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotNotAccess().getExpEq1ExprEqParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_rule__ExprNotNot__ExpEq1Assignment_112513);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6228:1: rule__ExprNotDo__ExpEq2Assignment : ( ruleExprEq ) ;
    public final void rule__ExprNotDo__ExpEq2Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6232:1: ( ( ruleExprEq ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6233:1: ( ruleExprEq )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6233:1: ( ruleExprEq )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6234:1: ruleExprEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotDoAccess().getExpEq2ExprEqParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_rule__ExprNotDo__ExpEq2Assignment12544);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6243:1: rule__ExprEq__ExpS1Assignment_0_0 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExpS1Assignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6247:1: ( ( ruleExprSimple ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6248:1: ( ruleExprSimple )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6248:1: ( ruleExprSimple )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6249:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpS1ExprSimpleParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExpS1Assignment_0_012575);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6258:1: rule__ExprEq__ExpS2Assignment_0_2 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExpS2Assignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6262:1: ( ( ruleExprSimple ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6263:1: ( ruleExprSimple )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6263:1: ( ruleExprSimple )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6264:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpS2ExprSimpleParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExpS2Assignment_0_212606);
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
    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6273:1: rule__ExprEq__ExpRAssignment_1_1 : ( ruleExpr ) ;
    public final void rule__ExprEq__ExpRAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6277:1: ( ( ruleExpr ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6278:1: ( ruleExpr )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6278:1: ( ruleExpr )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6279:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExpRExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprEq__ExpRAssignment_1_112637);
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
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: ( ( ( rule__Expr__ExpSAssignment_0 ) ) )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: ( ( rule__Expr__ExpSAssignment_0 ) )
        {
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: ( ( rule__Expr__ExpSAssignment_0 ) )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: ( rule__Expr__ExpSAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getExpSAssignment_0()); 
        }
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( rule__Expr__ExpSAssignment_0 )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:2: rule__Expr__ExpSAssignment_0
        {
        pushFollow(FOLLOW_rule__Expr__ExpSAssignment_0_in_synpred8_InternalMyDsl1957);
        rule__Expr__ExpSAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalMyDsl

    // $ANTLR start synpred17_InternalMyDsl
    public final void synpred17_InternalMyDsl_fragment() throws RecognitionException {   
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: ( ( ( rule__ExprEq__Group_0__0 ) ) )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: ( ( rule__ExprEq__Group_0__0 ) )
        {
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: ( ( rule__ExprEq__Group_0__0 ) )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:1: ( rule__ExprEq__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprEqAccess().getGroup_0()); 
        }
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:1: ( rule__ExprEq__Group_0__0 )
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:2: rule__ExprEq__Group_0__0
        {
        pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_synpred17_InternalMyDsl2218);
        rule__ExprEq__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17_InternalMyDsl

    // Delegated rules

    public final boolean synpred17_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalMyDsl_fragment(); // can never throw exception
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
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
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
            return "948:1: rule__ExprSimple__Alternatives : ( ( ( rule__ExprSimple__Group_0__0 ) ) | ( ( rule__ExprSimple__VariableAssignment_1 ) ) | ( ( rule__ExprSimple__SymboleAssignment_2 ) ) | ( ( rule__ExprSimple__ConsAssignment_3 ) ) | ( ( rule__ExprSimple__ListeAssignment_4 ) ) | ( ( rule__ExprSimple__HdAssignment_5 ) ) | ( ( rule__ExprSimple__TlAssignment_6 ) ) | ( ( rule__ExprSimple__SymbolExAssignment_7 ) ) );";
        }
    }
    static final String DFA17_eotS =
        "\7\uffff";
    static final String DFA17_eofS =
        "\1\1\1\uffff\4\1\1\uffff";
    static final String DFA17_minS =
        "\1\4\1\uffff\4\4\1\uffff";
    static final String DFA17_maxS =
        "\1\57\1\uffff\4\57\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\2\4\uffff\1\1";
    static final String DFA17_specialS =
        "\7\uffff}>";
    static final String[] DFA17_transitionS = {
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 4706:1: ( rule__ExprAnd__Group_1__0 )*";
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
            return "()* loopback of 4892:1: ( rule__ExprOr__Group_1__0 )*";
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
    public static final BitSet FOLLOW_rule__ExprNot__Alternatives_in_ruleExprNot1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNotNot_in_entryRuleExprNotNot1584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNotNot1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group__0_in_ruleExprNotNot1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNotDo_in_entryRuleExprNotDo1644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNotDo1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotDo__ExpEq2Assignment_in_ruleExprNotDo1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_entryRuleExprEq1704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEq1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Alternatives_in_ruleExprEq1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_entryRuleLC1764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLC1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LC__Alternatives_in_ruleLC1797 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__Commande__Group_0__0_in_rule__Commande__Alternatives1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__AffectVarAssignment_1_in_rule__Commande__Alternatives1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__WhileCAssignment_2_in_rule__Commande__Alternatives1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__ForCAssignment_3_in_rule__Commande__Alternatives1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__IfCAssignment_4_in_rule__Commande__Alternatives1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__ForeachCAssignment_5_in_rule__Commande__Alternatives1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpSAssignment_0_in_rule__Expr__Alternatives1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpAAssignment_1_in_rule__Expr__Alternatives1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_0__0_in_rule__ExprSimple__Alternatives2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__VariableAssignment_1_in_rule__ExprSimple__Alternatives2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymboleAssignment_2_in_rule__ExprSimple__Alternatives2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ConsAssignment_3_in_rule__ExprSimple__Alternatives2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ListeAssignment_4_in_rule__ExprSimple__Alternatives2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__HdAssignment_5_in_rule__ExprSimple__Alternatives2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__TlAssignment_6_in_rule__ExprSimple__Alternatives2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymbolExAssignment_7_in_rule__ExprSimple__Alternatives2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__ExprNotNotAssignment_0_in_rule__ExprNot__Alternatives2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__ExprNotDoAssignment_1_in_rule__ExprNot__Alternatives2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_rule__LC__Alternatives2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_rule__LC__Alternatives2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAB_in_rule__LC__Alternatives2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_rule__LC__Alternatives2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__Group__0__Impl_in_rule__Programme__Group__02350 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Programme__Group__1_in_rule__Programme__Group__02353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__Group__1__Impl_in_rule__Programme__Group__12411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__Group_1__0_in_rule__Programme__Group__1__Impl2438 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Programme__Group_1__0__Impl_in_rule__Programme__Group_1__02473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Programme__Group_1__1_in_rule__Programme__Group_1__02476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__FonctAssignment_1_0_in_rule__Programme__Group_1__0__Impl2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programme__Group_1__1__Impl_in_rule__Programme__Group_1__12533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_rule__Programme__Group_1__1__Impl2561 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Fonction__Group__0__Impl_in_rule__Fonction__Group__02596 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Fonction__Group__1_in_rule__Fonction__Group__02599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Fonction__Group__0__Impl2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__1__Impl_in_rule__Fonction__Group__12658 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Fonction__Group__2_in_rule__Fonction__Group__12661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Fonction__Group__1__Impl2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__2__Impl_in_rule__Fonction__Group__22717 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__3_in_rule__Fonction__Group__22720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__SymboleAssignment_2_in_rule__Fonction__Group__2__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__3__Impl_in_rule__Fonction__Group__32777 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Fonction__Group__4_in_rule__Fonction__Group__32780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Fonction__Group__3__Impl2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__4__Impl_in_rule__Fonction__Group__42839 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__5_in_rule__Fonction__Group__42842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Fonction__Group__4__Impl2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__5__Impl_in_rule__Fonction__Group__52898 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Fonction__Group__6_in_rule__Fonction__Group__52901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Fonction__Group__5__Impl2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__6__Impl_in_rule__Fonction__Group__62960 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Fonction__Group__7_in_rule__Fonction__Group__62963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Fonction__Group__6__Impl2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__7__Impl_in_rule__Fonction__Group__73019 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__8_in_rule__Fonction__Group__73022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__InAssignment_7_in_rule__Fonction__Group__7__Impl3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__8__Impl_in_rule__Fonction__Group__83079 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__Fonction__Group__9_in_rule__Fonction__Group__83082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Fonction__Group__8__Impl3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__9__Impl_in_rule__Fonction__Group__93141 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__10_in_rule__Fonction__Group__93144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__ComAssignment_9_in_rule__Fonction__Group__9__Impl3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__10__Impl_in_rule__Fonction__Group__103201 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Fonction__Group__11_in_rule__Fonction__Group__103204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Fonction__Group__10__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__11__Impl_in_rule__Fonction__Group__113263 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Fonction__Group__12_in_rule__Fonction__Group__113266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Fonction__Group__11__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__12__Impl_in_rule__Fonction__Group__123325 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Fonction__Group__13_in_rule__Fonction__Group__123328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Fonction__Group__12__Impl3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__Group__13__Impl_in_rule__Fonction__Group__133384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fonction__OutAssignment_13_in_rule__Fonction__Group__13__Impl3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__03469 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__03472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Var1Assignment_0_in_rule__Input__Group__0__Impl3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__13529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3556 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03591 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Input__Group_1__0__Impl3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Var2Assignment_1_1_in_rule__Input__Group_1__1__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03714 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Var1Assignment_0_in_rule__Output__Group__0__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3801 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03836 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Output__Group_1__0__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__13898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Var2Assignment_1_1_in_rule__Output__Group_1__1__Impl3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group__0__Impl_in_rule__Commandes__Group__03959 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Commandes__Group__1_in_rule__Commandes__Group__03962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Com1Assignment_0_in_rule__Commandes__Group__0__Impl3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group__1__Impl_in_rule__Commandes__Group__14019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group_1__0_in_rule__Commandes__Group__1__Impl4046 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group_1__0__Impl_in_rule__Commandes__Group_1__04081 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__Commandes__Group_1__1_in_rule__Commandes__Group_1__04084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Commandes__Group_1__0__Impl4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Group_1__1__Impl_in_rule__Commandes__Group_1__14143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commandes__Com2Assignment_1_1_in_rule__Commandes__Group_1__1__Impl4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__Group_0__0__Impl_in_rule__Commande__Group_0__04204 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Commande__Group_0__1_in_rule__Commande__Group_0__04207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__Group_0__1__Impl_in_rule__Commande__Group_0__14265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commande__NopAssignment_0_1_in_rule__Commande__Group_0__1__Impl4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__0__Impl_in_rule__AffectVar__Group__04326 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__1_in_rule__AffectVar__Group__04329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__Var1Assignment_0_in_rule__AffectVar__Group__0__Impl4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__1__Impl_in_rule__AffectVar__Group__14386 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__2_in_rule__AffectVar__Group__14389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AffectVar__Group__1__Impl4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__Group__2__Impl_in_rule__AffectVar__Group__24448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AffectVar__ExpAssignment_2_in_rule__AffectVar__Group__2__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__04511 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__04514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__While__Group__0__Impl4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__14573 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__14576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__1__Impl4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__24632 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__24635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Exp2Assignment_2_in_rule__While__Group__2__Impl4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__34692 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__34695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__3__Impl4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__44751 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__5_in_rule__While__Group__44754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__While__Group__4__Impl4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__5__Impl_in_rule__While__Group__54813 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__While__Group__6_in_rule__While__Group__54816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__5__Impl4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__6__Impl_in_rule__While__Group__64872 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__While__Group__7_in_rule__While__Group__64875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Com3Assignment_6_in_rule__While__Group__6__Impl4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__7__Impl_in_rule__While__Group__74932 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__While__Group__8_in_rule__While__Group__74935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__While__Group__7__Impl4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__8__Impl_in_rule__While__Group__84991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__While__Group__8__Impl5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__05068 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__1_in_rule__For__Group__05071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__For__Group__0__Impl5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__15130 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__For__Group__2_in_rule__For__Group__15133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__1__Impl5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__25189 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__3_in_rule__For__Group__25192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Exp3Assignment_2_in_rule__For__Group__2__Impl5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__35249 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__For__Group__4_in_rule__For__Group__35252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__3__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__45308 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__5_in_rule__For__Group__45311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__For__Group__4__Impl5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__55370 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__For__Group__6_in_rule__For__Group__55373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__5__Impl5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__65429 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__For__Group__7_in_rule__For__Group__65432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Com4Assignment_6_in_rule__For__Group__6__Impl5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__75489 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__For__Group__8_in_rule__For__Group__75492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__For__Group__7__Impl5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__85548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__For__Group__8__Impl5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__05625 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__05628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__If__Group__0__Impl5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__15687 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__15690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__1__Impl5717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__25746 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__25749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Exp4Assignment_2_in_rule__If__Group__2__Impl5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__35806 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__35809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__3__Impl5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__45865 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__5_in_rule__If__Group__45868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__If__Group__4__Impl5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__55927 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__If__Group__6_in_rule__If__Group__55930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__5__Impl5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__6__Impl_in_rule__If__Group__65986 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group__7_in_rule__If__Group__65989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Com5Assignment_6_in_rule__If__Group__6__Impl6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__7__Impl_in_rule__If__Group__76046 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__If__Group__8_in_rule__If__Group__76049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group__7__Impl6076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__8__Impl_in_rule__If__Group__86105 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__If__Group__9_in_rule__If__Group__86108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__0_in_rule__If__Group__8__Impl6135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__9__Impl_in_rule__If__Group__96166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__If__Group__9__Impl6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__0__Impl_in_rule__If__Group_8__06245 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group_8__1_in_rule__If__Group_8__06248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__If__Group_8__0__Impl6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__1__Impl_in_rule__If__Group_8__16307 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__If__Group_8__2_in_rule__If__Group_8__16310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group_8__1__Impl6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__2__Impl_in_rule__If__Group_8__26366 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__If__Group_8__3_in_rule__If__Group_8__26369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Com6Assignment_8_2_in_rule__If__Group_8__2__Impl6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group_8__3__Impl_in_rule__If__Group_8__36426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__If__Group_8__3__Impl6453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__0__Impl_in_rule__Foreach__Group__06490 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__1_in_rule__Foreach__Group__06493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Foreach__Group__0__Impl6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__1__Impl_in_rule__Foreach__Group__16552 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Foreach__Group__2_in_rule__Foreach__Group__16555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__1__Impl6582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__2__Impl_in_rule__Foreach__Group__26611 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__3_in_rule__Foreach__Group__26614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Exp5Assignment_2_in_rule__Foreach__Group__2__Impl6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__3__Impl_in_rule__Foreach__Group__36671 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__4_in_rule__Foreach__Group__36674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__3__Impl6701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__4__Impl_in_rule__Foreach__Group__46730 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__5_in_rule__Foreach__Group__46733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Foreach__Group__4__Impl6761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__5__Impl_in_rule__Foreach__Group__56792 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Foreach__Group__6_in_rule__Foreach__Group__56795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__5__Impl6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__6__Impl_in_rule__Foreach__Group__66851 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__7_in_rule__Foreach__Group__66854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Exp6Assignment_6_in_rule__Foreach__Group__6__Impl6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__7__Impl_in_rule__Foreach__Group__76911 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__8_in_rule__Foreach__Group__76914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__7__Impl6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__8__Impl_in_rule__Foreach__Group__86970 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__9_in_rule__Foreach__Group__86973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Foreach__Group__8__Impl7001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__9__Impl_in_rule__Foreach__Group__97032 = new BitSet(new long[]{0x0000401190000800L});
    public static final BitSet FOLLOW_rule__Foreach__Group__10_in_rule__Foreach__Group__97035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__9__Impl7062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__10__Impl_in_rule__Foreach__Group__107091 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Foreach__Group__11_in_rule__Foreach__Group__107094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Com7Assignment_10_in_rule__Foreach__Group__10__Impl7121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__11__Impl_in_rule__Foreach__Group__117151 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Foreach__Group__12_in_rule__Foreach__Group__117154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Foreach__Group__11__Impl7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foreach__Group__12__Impl_in_rule__Foreach__Group__127210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Foreach__Group__12__Impl7238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__07295 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__07298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Var2Assignment_0_in_rule__Vars__Group__0__Impl7325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__17355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl7382 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__07417 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__07420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Vars__Group_1__0__Impl7448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__17479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Var3Assignment_1_1_in_rule__Vars__Group_1__1__Impl7506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__07540 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__07543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExprSAssignment_0_in_rule__Exprs__Group__0__Impl7570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__17600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl7627 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__07662 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__07665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Exprs__Group_1__0__Impl7693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__17724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExprS2Assignment_1_1_in_rule__Exprs__Group_1__1__Impl7751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_0__0__Impl_in_rule__ExprSimple__Group_0__07785 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_0__1_in_rule__ExprSimple__Group_0__07788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_0__1__Impl_in_rule__ExprSimple__Group_0__17846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__VideAssignment_0_1_in_rule__ExprSimple__Group_0__1__Impl7873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__0__Impl_in_rule__Cons__Group__07907 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Cons__Group__1_in_rule__Cons__Group__07910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__Cons__Group__0__Impl7937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__1__Impl_in_rule__Cons__Group__17966 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Cons__Group__2_in_rule__Cons__Group__17969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Cons__Group__1__Impl7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__2__Impl_in_rule__Cons__Group__28028 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Cons__Group__3_in_rule__Cons__Group__28031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Le1Assignment_2_in_rule__Cons__Group__2__Impl8058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__3__Impl_in_rule__Cons__Group__38088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__Cons__Group__3__Impl8115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Group__0__Impl_in_rule__Liste__Group__08152 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Liste__Group__1_in_rule__Liste__Group__08155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__Liste__Group__0__Impl8182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Group__1__Impl_in_rule__Liste__Group__18211 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Liste__Group__2_in_rule__Liste__Group__18214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Liste__Group__1__Impl8242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Group__2__Impl_in_rule__Liste__Group__28273 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Liste__Group__3_in_rule__Liste__Group__28276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Le2Assignment_2_in_rule__Liste__Group__2__Impl8303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Liste__Group__3__Impl_in_rule__Liste__Group__38333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__Liste__Group__3__Impl8360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__0__Impl_in_rule__Hd__Group__08397 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Hd__Group__1_in_rule__Hd__Group__08400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__Hd__Group__0__Impl8427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__1__Impl_in_rule__Hd__Group__18456 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Hd__Group__2_in_rule__Hd__Group__18459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Hd__Group__1__Impl8487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__2__Impl_in_rule__Hd__Group__28518 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Hd__Group__3_in_rule__Hd__Group__28521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Hd__Group__2__Impl8548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__3__Impl_in_rule__Hd__Group__38577 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Hd__Group__4_in_rule__Hd__Group__38580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Le3Assignment_3_in_rule__Hd__Group__3__Impl8607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hd__Group__4__Impl_in_rule__Hd__Group__48637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__Hd__Group__4__Impl8664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__0__Impl_in_rule__Tl__Group__08703 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Tl__Group__1_in_rule__Tl__Group__08706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__Tl__Group__0__Impl8733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__1__Impl_in_rule__Tl__Group__18762 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Tl__Group__2_in_rule__Tl__Group__18765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Tl__Group__1__Impl8793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__2__Impl_in_rule__Tl__Group__28824 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__Tl__Group__3_in_rule__Tl__Group__28827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__Tl__Group__2__Impl8854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__3__Impl_in_rule__Tl__Group__38883 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Tl__Group__4_in_rule__Tl__Group__38886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Le4Assignment_3_in_rule__Tl__Group__3__Impl8913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tl__Group__4__Impl_in_rule__Tl__Group__48943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__Tl__Group__4__Impl8970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__0__Impl_in_rule__SymboleEx__Group__09009 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__1_in_rule__SymboleEx__Group__09012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__SymboleEx__Group__0__Impl9039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__1__Impl_in_rule__SymboleEx__Group__19068 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__2_in_rule__SymboleEx__Group__19071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__PAssignment_1_in_rule__SymboleEx__Group__1__Impl9098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__2__Impl_in_rule__SymboleEx__Group__29128 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__3_in_rule__SymboleEx__Group__29131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Le5Assignment_2_in_rule__SymboleEx__Group__2__Impl9158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymboleEx__Group__3__Impl_in_rule__SymboleEx__Group__39188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__SymboleEx__Group__3__Impl9215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr__Group__0__Impl_in_rule__LExpr__Group__09252 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__LExpr__Group__1_in_rule__LExpr__Group__09255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__LExpr__Group__0__Impl9282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr__Group__1__Impl_in_rule__LExpr__Group__19311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LExpr__ExpLeAssignment_1_in_rule__LExpr__Group__1__Impl9338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__09372 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__09375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExpOAssignment_0_in_rule__ExprAnd__Group__0__Impl9402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__19432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl9459 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__09494 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__09497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__0__Impl9524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__19553 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__2_in_rule__ExprAnd__Group_1__19556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ExprAnd__Group_1__1__Impl9584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__2__Impl_in_rule__ExprAnd__Group_1__29615 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__3_in_rule__ExprAnd__Group_1__29618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprAnd__Group_1__2__Impl9645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__3__Impl_in_rule__ExprAnd__Group_1__39674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExpO2Assignment_1_3_in_rule__ExprAnd__Group_1__3__Impl9701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__09739 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__09742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExpNAssignment_0_in_rule__ExprOr__Group__0__Impl9769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__19799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl9826 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__09861 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__09864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprOr__Group_1__0__Impl9891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__19920 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__2_in_rule__ExprOr__Group_1__19923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExprOr__Group_1__1__Impl9951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__2__Impl_in_rule__ExprOr__Group_1__29982 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__3_in_rule__ExprOr__Group_1__29985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprOr__Group_1__2__Impl10012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__3__Impl_in_rule__ExprOr__Group_1__310041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExpN2Assignment_1_3_in_rule__ExprOr__Group_1__3__Impl10068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group__0__Impl_in_rule__ExprNotNot__Group__010106 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group__1_in_rule__ExprNotNot__Group__010109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group_0__0_in_rule__ExprNotNot__Group__0__Impl10136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group__1__Impl_in_rule__ExprNotNot__Group__110166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotNot__ExpEq1Assignment_1_in_rule__ExprNotNot__Group__1__Impl10193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group_0__0__Impl_in_rule__ExprNotNot__Group_0__010227 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group_0__1_in_rule__ExprNotNot__Group_0__010230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ExprNotNot__Group_0__0__Impl10258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNotNot__Group_0__1__Impl_in_rule__ExprNotNot__Group_0__110289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_rule__ExprNotNot__Group_0__1__Impl10316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__010349 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__010352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExpS1Assignment_0_0_in_rule__ExprEq__Group_0__0__Impl10379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__110409 = new BitSet(new long[]{0x0000800000000D00L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__110412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ExprEq__Group_0__1__Impl10440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__210471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExpS2Assignment_0_2_in_rule__ExprEq__Group_0__2__Impl10498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__010534 = new BitSet(new long[]{0x0000900000000D00L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__010537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_rule__ExprEq__Group_1__0__Impl10564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__110593 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__110596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExpRAssignment_1_1_in_rule__ExprEq__Group_1__1__Impl10623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__210653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAD_in_rule__ExprEq__Group_1__2__Impl10680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgramme_in_rule__Model__ProgrammeAssignment10720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFonction_in_rule__Programme__FonctAssignment_1_010751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__Fonction__SymboleAssignment_210782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Fonction__InAssignment_710813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__Fonction__ComAssignment_910844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Fonction__OutAssignment_1310875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Input__Var1Assignment_010906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Input__Var2Assignment_1_110937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Output__Var1Assignment_010968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Output__Var2Assignment_1_110999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommande_in_rule__Commandes__Com1Assignment_011030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommande_in_rule__Commandes__Com2Assignment_1_111061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Commande__NopAssignment_0_111097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectVar_in_rule__Commande__AffectVarAssignment_111136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__Commande__WhileCAssignment_211167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_rule__Commande__ForCAssignment_311198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__Commande__IfCAssignment_411229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_rule__Commande__ForeachCAssignment_511260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__AffectVar__Var1Assignment_011291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__AffectVar__ExpAssignment_211322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__While__Exp2Assignment_211353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__While__Com3Assignment_611384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__For__Exp3Assignment_211415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__For__Com4Assignment_611446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__If__Exp4Assignment_211477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__If__Com5Assignment_611508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__If__Com6Assignment_8_211539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Foreach__Exp5Assignment_211570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Foreach__Exp6Assignment_611601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_rule__Foreach__Com7Assignment_1011632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Vars__Var2Assignment_011663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__Vars__Var3Assignment_1_111694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExprSAssignment_011725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExprS2Assignment_1_111756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Expr__ExpSAssignment_011787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_rule__Expr__ExpAAssignment_111818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ExprSimple__VideAssignment_0_111854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_rule__ExprSimple__VariableAssignment_111893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__ExprSimple__SymboleAssignment_211924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCons_in_rule__ExprSimple__ConsAssignment_311955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListe_in_rule__ExprSimple__ListeAssignment_411986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHd_in_rule__ExprSimple__HdAssignment_512017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTl_in_rule__ExprSimple__TlAssignment_612048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymboleEx_in_rule__ExprSimple__SymbolExAssignment_712079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_rule__Cons__Le1Assignment_212110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_rule__Liste__Le2Assignment_212141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Hd__Le3Assignment_312172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Tl__Le4Assignment_312203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_rule__SymboleEx__PAssignment_112234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_rule__SymboleEx__Le5Assignment_212265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__LExpr__ExpLeAssignment_112296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprAnd__ExpOAssignment_012327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprAnd__ExpO2Assignment_1_312358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_rule__ExprOr__ExpNAssignment_012389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_rule__ExprOr__ExpN2Assignment_1_312420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNotNot_in_rule__ExprNot__ExprNotNotAssignment_012451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNotDo_in_rule__ExprNot__ExprNotDoAssignment_112482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_rule__ExprNotNot__ExpEq1Assignment_112513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_rule__ExprNotDo__ExpEq2Assignment12544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExpS1Assignment_0_012575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExpS2Assignment_0_212606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprEq__ExpRAssignment_1_112637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpSAssignment_0_in_synpred8_InternalMyDsl1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_synpred17_InternalMyDsl2218 = new BitSet(new long[]{0x0000000000000002L});

}