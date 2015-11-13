package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CR", "RULE_SYM", "RULE_VAR", "RULE_PARAG", "RULE_PARAD", "RULE_SP", "RULE_TAB", "RULE_LF", "RULE_CONF", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fonction'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'while'", "'for'", "'do'", "'od'", "'if'", "'then'", "'else'", "'fi'", "'foreach'", "'in'", "'nil'", "'cons'", "'list'", "'hd'", "'tl'", "'and'", "'or'", "'not'", "'=?'"
    };
    public static final int RULE_LF=11;
    public static final int RULE_CR=4;
    public static final int RULE_TAB=10;
    public static final int RULE_SP=9;
    public static final int RULE_ID=13;
    public static final int RULE_CONF=12;
    public static final int RULE_PARAD=8;
    public static final int RULE_PARAG=7;
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
    public static final int RULE_SYM=5;
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
    public static final int RULE_VAR=6;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:74:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:75:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:1: ruleModel returns [EObject current=null] : ( (lv_programme_0_0= ruleProgramme ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_programme_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:28: ( ( (lv_programme_0_0= ruleProgramme ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:1: ( (lv_programme_0_0= ruleProgramme ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:1: ( (lv_programme_0_0= ruleProgramme ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:1: (lv_programme_0_0= ruleProgramme )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:1: (lv_programme_0_0= ruleProgramme )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:88:3: lv_programme_0_0= ruleProgramme
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getProgrammeProgrammeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleProgramme_in_ruleModel136);
            lv_programme_0_0=ruleProgramme();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"programme",
                      		lv_programme_0_0, 
                      		"Programme");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProgramme"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:112:1: entryRuleProgramme returns [String current=null] : iv_ruleProgramme= ruleProgramme EOF ;
    public final String entryRuleProgramme() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProgramme = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:113:2: (iv_ruleProgramme= ruleProgramme EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:114:2: iv_ruleProgramme= ruleProgramme EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgrammeRule()); 
            }
            pushFollow(FOLLOW_ruleProgramme_in_entryRuleProgramme172);
            iv_ruleProgramme=ruleProgramme();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgramme.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgramme183); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgramme"


    // $ANTLR start "ruleProgramme"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:1: ruleProgramme returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Fonction_0= ruleFonction (this_CR_1= RULE_CR )* )* ;
    public final AntlrDatatypeRuleToken ruleProgramme() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CR_1=null;
        AntlrDatatypeRuleToken this_Fonction_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:28: ( (this_Fonction_0= ruleFonction (this_CR_1= RULE_CR )* )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: (this_Fonction_0= ruleFonction (this_CR_1= RULE_CR )* )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: (this_Fonction_0= ruleFonction (this_CR_1= RULE_CR )* )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:5: this_Fonction_0= ruleFonction (this_CR_1= RULE_CR )*
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getProgrammeAccess().getFonctionParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleFonction_in_ruleProgramme230);
            	    this_Fonction_0=ruleFonction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Fonction_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:1: (this_CR_1= RULE_CR )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==RULE_CR) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:6: this_CR_1= RULE_CR
            	    	    {
            	    	    this_CR_1=(Token)match(input,RULE_CR,FOLLOW_RULE_CR_in_ruleProgramme251); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		current.merge(this_CR_1);
            	    	          
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_CR_1, grammarAccess.getProgrammeAccess().getCRTerminalRuleCall_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgramme"


    // $ANTLR start "entryRuleFonction"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:151:1: entryRuleFonction returns [String current=null] : iv_ruleFonction= ruleFonction EOF ;
    public final String entryRuleFonction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFonction = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:152:2: (iv_ruleFonction= ruleFonction EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:153:2: iv_ruleFonction= ruleFonction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFonctionRule()); 
            }
            pushFollow(FOLLOW_ruleFonction_in_entryRuleFonction300);
            iv_ruleFonction=ruleFonction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFonction.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFonction311); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFonction"


    // $ANTLR start "ruleFonction"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:1: ruleFonction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'fonction' this_LC_1= ruleLC this_SYM_2= RULE_SYM kw= ':' this_LC_4= ruleLC kw= 'read' this_LC_6= ruleLC this_Input_7= ruleInput kw= '%' this_Commandes_9= ruleCommandes kw= '%' kw= 'write' this_LC_12= ruleLC this_Output_13= ruleOutput ) ;
    public final AntlrDatatypeRuleToken ruleFonction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SYM_2=null;
        AntlrDatatypeRuleToken this_LC_1 = null;

        AntlrDatatypeRuleToken this_LC_4 = null;

        AntlrDatatypeRuleToken this_LC_6 = null;

        AntlrDatatypeRuleToken this_Input_7 = null;

        AntlrDatatypeRuleToken this_Commandes_9 = null;

        AntlrDatatypeRuleToken this_LC_12 = null;

        AntlrDatatypeRuleToken this_Output_13 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:163:28: ( (kw= 'fonction' this_LC_1= ruleLC this_SYM_2= RULE_SYM kw= ':' this_LC_4= ruleLC kw= 'read' this_LC_6= ruleLC this_Input_7= ruleInput kw= '%' this_Commandes_9= ruleCommandes kw= '%' kw= 'write' this_LC_12= ruleLC this_Output_13= ruleOutput ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:164:1: (kw= 'fonction' this_LC_1= ruleLC this_SYM_2= RULE_SYM kw= ':' this_LC_4= ruleLC kw= 'read' this_LC_6= ruleLC this_Input_7= ruleInput kw= '%' this_Commandes_9= ruleCommandes kw= '%' kw= 'write' this_LC_12= ruleLC this_Output_13= ruleOutput )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:164:1: (kw= 'fonction' this_LC_1= ruleLC this_SYM_2= RULE_SYM kw= ':' this_LC_4= ruleLC kw= 'read' this_LC_6= ruleLC this_Input_7= ruleInput kw= '%' this_Commandes_9= ruleCommandes kw= '%' kw= 'write' this_LC_12= ruleLC this_Output_13= ruleOutput )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:165:2: kw= 'fonction' this_LC_1= ruleLC this_SYM_2= RULE_SYM kw= ':' this_LC_4= ruleLC kw= 'read' this_LC_6= ruleLC this_Input_7= ruleInput kw= '%' this_Commandes_9= ruleCommandes kw= '%' kw= 'write' this_LC_12= ruleLC this_Output_13= ruleOutput
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleFonction349); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFonctionAccess().getFonctionKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFonctionAccess().getLCParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFonction371);
            this_LC_1=ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LC_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            this_SYM_2=(Token)match(input,RULE_SYM,FOLLOW_RULE_SYM_in_ruleFonction391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SYM_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SYM_2, grammarAccess.getFonctionAccess().getSYMTerminalRuleCall_2()); 
                  
            }
            kw=(Token)match(input,21,FOLLOW_21_in_ruleFonction409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFonctionAccess().getColonKeyword_3()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFonctionAccess().getLCParserRuleCall_4()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFonction431);
            this_LC_4=ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LC_4);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,22,FOLLOW_22_in_ruleFonction449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFonctionAccess().getReadKeyword_5()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFonctionAccess().getLCParserRuleCall_6()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFonction471);
            this_LC_6=ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LC_6);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFonctionAccess().getInputParserRuleCall_7()); 
                  
            }
            pushFollow(FOLLOW_ruleInput_in_ruleFonction498);
            this_Input_7=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Input_7);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,23,FOLLOW_23_in_ruleFonction516); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFonctionAccess().getPercentSignKeyword_8()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFonctionAccess().getCommandesParserRuleCall_9()); 
                  
            }
            pushFollow(FOLLOW_ruleCommandes_in_ruleFonction538);
            this_Commandes_9=ruleCommandes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Commandes_9);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,23,FOLLOW_23_in_ruleFonction556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFonctionAccess().getPercentSignKeyword_10()); 
                  
            }
            kw=(Token)match(input,24,FOLLOW_24_in_ruleFonction569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFonctionAccess().getWriteKeyword_11()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFonctionAccess().getLCParserRuleCall_12()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFonction591);
            this_LC_12=ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LC_12);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFonctionAccess().getOutputParserRuleCall_13()); 
                  
            }
            pushFollow(FOLLOW_ruleOutput_in_ruleFonction618);
            this_Output_13=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Output_13);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFonction"


    // $ANTLR start "entryRuleInput"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:292:1: entryRuleInput returns [String current=null] : iv_ruleInput= ruleInput EOF ;
    public final String entryRuleInput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInput = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:293:2: (iv_ruleInput= ruleInput EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:294:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput664);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput675); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:301:1: ruleInput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )* ) ;
    public final AntlrDatatypeRuleToken ruleInput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_0=null;
        Token kw=null;
        Token this_VAR_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:304:28: ( (this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:305:1: (this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:305:1: (this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:305:6: this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )*
            {
            this_VAR_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleInput715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_VAR_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_VAR_0, grammarAccess.getInputAccess().getVARTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:312:1: (kw= ',' this_VAR_2= RULE_VAR )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:313:2: kw= ',' this_VAR_2= RULE_VAR
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleInput734); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    this_VAR_2=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleInput749); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_VAR_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_VAR_2, grammarAccess.getInputAccess().getVARTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:333:1: entryRuleOutput returns [String current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final String entryRuleOutput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOutput = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:2: (iv_ruleOutput= ruleOutput EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:335:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput797);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput808); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:342:1: ruleOutput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )* ) ;
    public final AntlrDatatypeRuleToken ruleOutput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_0=null;
        Token kw=null;
        Token this_VAR_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:345:28: ( (this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:346:1: (this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:346:1: (this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:346:6: this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )*
            {
            this_VAR_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleOutput848); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_VAR_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_VAR_0, grammarAccess.getOutputAccess().getVARTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:353:1: (kw= ',' this_VAR_2= RULE_VAR )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:354:2: kw= ',' this_VAR_2= RULE_VAR
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleOutput867); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    this_VAR_2=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleOutput882); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_VAR_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_VAR_2, grammarAccess.getOutputAccess().getVARTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommandes"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:374:1: entryRuleCommandes returns [String current=null] : iv_ruleCommandes= ruleCommandes EOF ;
    public final String entryRuleCommandes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommandes = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:375:2: (iv_ruleCommandes= ruleCommandes EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:376:2: iv_ruleCommandes= ruleCommandes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandesRule()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_entryRuleCommandes930);
            iv_ruleCommandes=ruleCommandes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommandes.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandes941); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandes"


    // $ANTLR start "ruleCommandes"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:383:1: ruleCommandes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Commande_0= ruleCommande (kw= ';' this_Commande_2= ruleCommande )* ) ;
    public final AntlrDatatypeRuleToken ruleCommandes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Commande_0 = null;

        AntlrDatatypeRuleToken this_Commande_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:386:28: ( (this_Commande_0= ruleCommande (kw= ';' this_Commande_2= ruleCommande )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:387:1: (this_Commande_0= ruleCommande (kw= ';' this_Commande_2= ruleCommande )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:387:1: (this_Commande_0= ruleCommande (kw= ';' this_Commande_2= ruleCommande )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:388:5: this_Commande_0= ruleCommande (kw= ';' this_Commande_2= ruleCommande )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCommandesAccess().getCommandeParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCommande_in_ruleCommandes988);
            this_Commande_0=ruleCommande();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Commande_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:1: (kw= ';' this_Commande_2= ruleCommande )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:399:2: kw= ';' this_Commande_2= ruleCommande
            	    {
            	    kw=(Token)match(input,26,FOLLOW_26_in_ruleCommandes1007); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getCommandesAccess().getSemicolonKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getCommandesAccess().getCommandeParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleCommande_in_ruleCommandes1029);
            	    this_Commande_2=ruleCommande();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Commande_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandes"


    // $ANTLR start "entryRuleCommande"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:423:1: entryRuleCommande returns [String current=null] : iv_ruleCommande= ruleCommande EOF ;
    public final String entryRuleCommande() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommande = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:2: (iv_ruleCommande= ruleCommande EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:425:2: iv_ruleCommande= ruleCommande EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandeRule()); 
            }
            pushFollow(FOLLOW_ruleCommande_in_entryRuleCommande1077);
            iv_ruleCommande=ruleCommande();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommande.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommande1088); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommande"


    // $ANTLR start "ruleCommande"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:432:1: ruleCommande returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'nop' | (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs ) | ( (kw= 'while' | kw= 'for' ) this_LC_6= ruleLC this_Expr_7= ruleExpr this_LC_8= ruleLC kw= 'do' this_LC_10= ruleLC this_Commandes_11= ruleCommandes this_LC_12= ruleLC kw= 'od' ) | (kw= 'if' this_LC_15= ruleLC this_Expr_16= ruleExpr this_LC_17= ruleLC kw= 'then' this_LC_19= ruleLC this_Commandes_20= ruleCommandes this_LC_21= ruleLC (kw= 'else' this_LC_23= ruleLC this_Commandes_24= ruleCommandes this_LC_25= ruleLC )? kw= 'fi' ) | (kw= 'foreach' this_LC_28= ruleLC this_Expr_29= ruleExpr this_LC_30= ruleLC kw= 'in' this_LC_32= ruleLC this_Expr_33= ruleExpr this_LC_34= ruleLC kw= 'do' this_LC_36= ruleLC this_Commandes_37= ruleCommandes this_LC_38= ruleLC kw= 'od' ) ) ;
    public final AntlrDatatypeRuleToken ruleCommande() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Vars_1 = null;

        AntlrDatatypeRuleToken this_Exprs_3 = null;

        AntlrDatatypeRuleToken this_LC_6 = null;

        AntlrDatatypeRuleToken this_Expr_7 = null;

        AntlrDatatypeRuleToken this_LC_8 = null;

        AntlrDatatypeRuleToken this_LC_10 = null;

        AntlrDatatypeRuleToken this_Commandes_11 = null;

        AntlrDatatypeRuleToken this_LC_12 = null;

        AntlrDatatypeRuleToken this_LC_15 = null;

        AntlrDatatypeRuleToken this_Expr_16 = null;

        AntlrDatatypeRuleToken this_LC_17 = null;

        AntlrDatatypeRuleToken this_LC_19 = null;

        AntlrDatatypeRuleToken this_Commandes_20 = null;

        AntlrDatatypeRuleToken this_LC_21 = null;

        AntlrDatatypeRuleToken this_LC_23 = null;

        AntlrDatatypeRuleToken this_Commandes_24 = null;

        AntlrDatatypeRuleToken this_LC_25 = null;

        AntlrDatatypeRuleToken this_LC_28 = null;

        AntlrDatatypeRuleToken this_Expr_29 = null;

        AntlrDatatypeRuleToken this_LC_30 = null;

        AntlrDatatypeRuleToken this_LC_32 = null;

        AntlrDatatypeRuleToken this_Expr_33 = null;

        AntlrDatatypeRuleToken this_LC_34 = null;

        AntlrDatatypeRuleToken this_LC_36 = null;

        AntlrDatatypeRuleToken this_Commandes_37 = null;

        AntlrDatatypeRuleToken this_LC_38 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:435:28: ( (kw= 'nop' | (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs ) | ( (kw= 'while' | kw= 'for' ) this_LC_6= ruleLC this_Expr_7= ruleExpr this_LC_8= ruleLC kw= 'do' this_LC_10= ruleLC this_Commandes_11= ruleCommandes this_LC_12= ruleLC kw= 'od' ) | (kw= 'if' this_LC_15= ruleLC this_Expr_16= ruleExpr this_LC_17= ruleLC kw= 'then' this_LC_19= ruleLC this_Commandes_20= ruleCommandes this_LC_21= ruleLC (kw= 'else' this_LC_23= ruleLC this_Commandes_24= ruleCommandes this_LC_25= ruleLC )? kw= 'fi' ) | (kw= 'foreach' this_LC_28= ruleLC this_Expr_29= ruleExpr this_LC_30= ruleLC kw= 'in' this_LC_32= ruleLC this_Expr_33= ruleExpr this_LC_34= ruleLC kw= 'do' this_LC_36= ruleLC this_Commandes_37= ruleCommandes this_LC_38= ruleLC kw= 'od' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:436:1: (kw= 'nop' | (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs ) | ( (kw= 'while' | kw= 'for' ) this_LC_6= ruleLC this_Expr_7= ruleExpr this_LC_8= ruleLC kw= 'do' this_LC_10= ruleLC this_Commandes_11= ruleCommandes this_LC_12= ruleLC kw= 'od' ) | (kw= 'if' this_LC_15= ruleLC this_Expr_16= ruleExpr this_LC_17= ruleLC kw= 'then' this_LC_19= ruleLC this_Commandes_20= ruleCommandes this_LC_21= ruleLC (kw= 'else' this_LC_23= ruleLC this_Commandes_24= ruleCommandes this_LC_25= ruleLC )? kw= 'fi' ) | (kw= 'foreach' this_LC_28= ruleLC this_Expr_29= ruleExpr this_LC_30= ruleLC kw= 'in' this_LC_32= ruleLC this_Expr_33= ruleExpr this_LC_34= ruleLC kw= 'do' this_LC_36= ruleLC this_Commandes_37= ruleCommandes this_LC_38= ruleLC kw= 'od' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:436:1: (kw= 'nop' | (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs ) | ( (kw= 'while' | kw= 'for' ) this_LC_6= ruleLC this_Expr_7= ruleExpr this_LC_8= ruleLC kw= 'do' this_LC_10= ruleLC this_Commandes_11= ruleCommandes this_LC_12= ruleLC kw= 'od' ) | (kw= 'if' this_LC_15= ruleLC this_Expr_16= ruleExpr this_LC_17= ruleLC kw= 'then' this_LC_19= ruleLC this_Commandes_20= ruleCommandes this_LC_21= ruleLC (kw= 'else' this_LC_23= ruleLC this_Commandes_24= ruleCommandes this_LC_25= ruleLC )? kw= 'fi' ) | (kw= 'foreach' this_LC_28= ruleLC this_Expr_29= ruleExpr this_LC_30= ruleLC kw= 'in' this_LC_32= ruleLC this_Expr_33= ruleExpr this_LC_34= ruleLC kw= 'do' this_LC_36= ruleLC this_Commandes_37= ruleCommandes this_LC_38= ruleLC kw= 'od' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case RULE_VAR:
                {
                alt8=2;
                }
                break;
            case 29:
            case 30:
                {
                alt8=3;
                }
                break;
            case 33:
                {
                alt8=4;
                }
                break;
            case 37:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:437:2: kw= 'nop'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleCommande1126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandeAccess().getNopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:443:6: (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:443:6: (this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:444:5: this_Vars_1= ruleVars kw= ':=' this_Exprs_3= ruleExprs
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getVarsParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVars_in_ruleCommande1155);
                    this_Vars_1=ruleVars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Vars_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleCommande1173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandeAccess().getColonEqualsSignKeyword_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getExprsParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExprs_in_ruleCommande1195);
                    this_Exprs_3=ruleExprs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Exprs_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:6: ( (kw= 'while' | kw= 'for' ) this_LC_6= ruleLC this_Expr_7= ruleExpr this_LC_8= ruleLC kw= 'do' this_LC_10= ruleLC this_Commandes_11= ruleCommandes this_LC_12= ruleLC kw= 'od' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:6: ( (kw= 'while' | kw= 'for' ) this_LC_6= ruleLC this_Expr_7= ruleExpr this_LC_8= ruleLC kw= 'do' this_LC_10= ruleLC this_Commandes_11= ruleCommandes this_LC_12= ruleLC kw= 'od' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:7: (kw= 'while' | kw= 'for' ) this_LC_6= ruleLC this_Expr_7= ruleExpr this_LC_8= ruleLC kw= 'do' this_LC_10= ruleLC this_Commandes_11= ruleCommandes this_LC_12= ruleLC kw= 'od'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:7: (kw= 'while' | kw= 'for' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==29) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==30) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:473:2: kw= 'while'
                            {
                            kw=(Token)match(input,29,FOLLOW_29_in_ruleCommande1222); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getCommandeAccess().getWhileKeyword_2_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:2: kw= 'for'
                            {
                            kw=(Token)match(input,30,FOLLOW_30_in_ruleCommande1241); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getCommandeAccess().getForKeyword_2_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1264);
                    this_LC_6=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getExprParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommande1291);
                    this_Expr_7=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Expr_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_2_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1318);
                    this_LC_8=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleCommande1336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandeAccess().getDoKeyword_2_4()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_2_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1358);
                    this_LC_10=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getCommandesParserRuleCall_2_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommandes_in_ruleCommande1385);
                    this_Commandes_11=ruleCommandes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Commandes_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_2_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1412);
                    this_LC_12=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleCommande1430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandeAccess().getOdKeyword_2_8()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:564:6: (kw= 'if' this_LC_15= ruleLC this_Expr_16= ruleExpr this_LC_17= ruleLC kw= 'then' this_LC_19= ruleLC this_Commandes_20= ruleCommandes this_LC_21= ruleLC (kw= 'else' this_LC_23= ruleLC this_Commandes_24= ruleCommandes this_LC_25= ruleLC )? kw= 'fi' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:564:6: (kw= 'if' this_LC_15= ruleLC this_Expr_16= ruleExpr this_LC_17= ruleLC kw= 'then' this_LC_19= ruleLC this_Commandes_20= ruleCommandes this_LC_21= ruleLC (kw= 'else' this_LC_23= ruleLC this_Commandes_24= ruleCommandes this_LC_25= ruleLC )? kw= 'fi' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:565:2: kw= 'if' this_LC_15= ruleLC this_Expr_16= ruleExpr this_LC_17= ruleLC kw= 'then' this_LC_19= ruleLC this_Commandes_20= ruleCommandes this_LC_21= ruleLC (kw= 'else' this_LC_23= ruleLC this_Commandes_24= ruleCommandes this_LC_25= ruleLC )? kw= 'fi'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleCommande1451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandeAccess().getIfKeyword_3_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1473);
                    this_LC_15=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getExprParserRuleCall_3_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommande1500);
                    this_Expr_16=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Expr_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_3_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1527);
                    this_LC_17=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleCommande1545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandeAccess().getThenKeyword_3_4()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_3_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1567);
                    this_LC_19=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getCommandesParserRuleCall_3_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommandes_in_ruleCommande1594);
                    this_Commandes_20=ruleCommandes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Commandes_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_3_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1621);
                    this_LC_21=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:1: (kw= 'else' this_LC_23= ruleLC this_Commandes_24= ruleCommandes this_LC_25= ruleLC )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==35) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:643:2: kw= 'else' this_LC_23= ruleLC this_Commandes_24= ruleCommandes this_LC_25= ruleLC
                            {
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleCommande1640); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getCommandeAccess().getElseKeyword_3_8_0()); 
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_3_8_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleLC_in_ruleCommande1662);
                            this_LC_23=ruleLC();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_LC_23);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getCommandeAccess().getCommandesParserRuleCall_3_8_2()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleCommandes_in_ruleCommande1689);
                            this_Commandes_24=ruleCommandes();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Commandes_24);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_3_8_3()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleLC_in_ruleCommande1716);
                            this_LC_25=ruleLC();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_LC_25);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,36,FOLLOW_36_in_ruleCommande1736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandeAccess().getFiKeyword_3_9()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:688:6: (kw= 'foreach' this_LC_28= ruleLC this_Expr_29= ruleExpr this_LC_30= ruleLC kw= 'in' this_LC_32= ruleLC this_Expr_33= ruleExpr this_LC_34= ruleLC kw= 'do' this_LC_36= ruleLC this_Commandes_37= ruleCommandes this_LC_38= ruleLC kw= 'od' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:688:6: (kw= 'foreach' this_LC_28= ruleLC this_Expr_29= ruleExpr this_LC_30= ruleLC kw= 'in' this_LC_32= ruleLC this_Expr_33= ruleExpr this_LC_34= ruleLC kw= 'do' this_LC_36= ruleLC this_Commandes_37= ruleCommandes this_LC_38= ruleLC kw= 'od' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:2: kw= 'foreach' this_LC_28= ruleLC this_Expr_29= ruleExpr this_LC_30= ruleLC kw= 'in' this_LC_32= ruleLC this_Expr_33= ruleExpr this_LC_34= ruleLC kw= 'do' this_LC_36= ruleLC this_Commandes_37= ruleCommandes this_LC_38= ruleLC kw= 'od'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleCommande1757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandeAccess().getForeachKeyword_4_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1779);
                    this_LC_28=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_28);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getExprParserRuleCall_4_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommande1806);
                    this_Expr_29=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Expr_29);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_4_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1833);
                    this_LC_30=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_30);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleCommande1851); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandeAccess().getInKeyword_4_4()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_4_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1873);
                    this_LC_32=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_32);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getExprParserRuleCall_4_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommande1900);
                    this_Expr_33=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Expr_33);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_4_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1927);
                    this_LC_34=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_34);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleCommande1945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandeAccess().getDoKeyword_4_8()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_4_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1967);
                    this_LC_36=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_36);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getCommandesParserRuleCall_4_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommandes_in_ruleCommande1994);
                    this_Commandes_37=ruleCommandes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Commandes_37);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_4_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande2021);
                    this_LC_38=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_38);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleCommande2039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCommandeAccess().getOdKeyword_4_12()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommande"


    // $ANTLR start "entryRuleVars"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:819:1: entryRuleVars returns [String current=null] : iv_ruleVars= ruleVars EOF ;
    public final String entryRuleVars() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVars = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:820:2: (iv_ruleVars= ruleVars EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:821:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars2081);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars2092); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:828:1: ruleVars returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )* ) ;
    public final AntlrDatatypeRuleToken ruleVars() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_0=null;
        Token kw=null;
        Token this_VAR_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:831:28: ( (this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:832:1: (this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:832:1: (this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:832:6: this_VAR_0= RULE_VAR (kw= ',' this_VAR_2= RULE_VAR )*
            {
            this_VAR_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleVars2132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_VAR_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_VAR_0, grammarAccess.getVarsAccess().getVARTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:839:1: (kw= ',' this_VAR_2= RULE_VAR )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:840:2: kw= ',' this_VAR_2= RULE_VAR
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleVars2151); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    this_VAR_2=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleVars2166); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_VAR_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_VAR_2, grammarAccess.getVarsAccess().getVARTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExprs"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:860:1: entryRuleExprs returns [String current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final String entryRuleExprs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprs = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:861:2: (iv_ruleExprs= ruleExprs EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:862:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs2214);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs2225); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:869:1: ruleExprs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expr_0= ruleExpr (kw= ',' this_Expr_2= ruleExpr )* ) ;
    public final AntlrDatatypeRuleToken ruleExprs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expr_0 = null;

        AntlrDatatypeRuleToken this_Expr_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:28: ( (this_Expr_0= ruleExpr (kw= ',' this_Expr_2= ruleExpr )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:1: (this_Expr_0= ruleExpr (kw= ',' this_Expr_2= ruleExpr )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:1: (this_Expr_0= ruleExpr (kw= ',' this_Expr_2= ruleExpr )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:874:5: this_Expr_0= ruleExpr (kw= ',' this_Expr_2= ruleExpr )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprsAccess().getExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleExprs2272);
            this_Expr_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Expr_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:884:1: (kw= ',' this_Expr_2= ruleExpr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:885:2: kw= ',' this_Expr_2= ruleExpr
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleExprs2291); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprsAccess().getExprParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprs2313);
            	    this_Expr_2=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Expr_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpr"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:909:1: entryRuleExpr returns [String current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final String entryRuleExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpr = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:910:2: (iv_ruleExpr= ruleExpr EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2361);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2372); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:918:1: ruleExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExprAnd_0= ruleExprAnd | this_ExprSimple_1= ruleExprSimple ) ;
    public final AntlrDatatypeRuleToken ruleExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ExprAnd_0 = null;

        AntlrDatatypeRuleToken this_ExprSimple_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:921:28: ( (this_ExprAnd_0= ruleExprAnd | this_ExprSimple_1= ruleExprSimple ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:922:1: (this_ExprAnd_0= ruleExprAnd | this_ExprSimple_1= ruleExprSimple )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:922:1: (this_ExprAnd_0= ruleExprAnd | this_ExprSimple_1= ruleExprSimple )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt11=1;
                }
                break;
            case 39:
                {
                int LA11_2 = input.LA(2);

                if ( (synpred14_InternalMyDsl()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VAR:
                {
                int LA11_3 = input.LA(2);

                if ( (synpred14_InternalMyDsl()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYM:
                {
                int LA11_4 = input.LA(2);

                if ( (synpred14_InternalMyDsl()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_PARAG:
                {
                int LA11_5 = input.LA(2);

                if ( (synpred14_InternalMyDsl()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:923:5: this_ExprAnd_0= ruleExprAnd
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprAccess().getExprAndParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExprAnd_in_ruleExpr2419);
                    this_ExprAnd_0=ruleExprAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExprAnd_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:935:5: this_ExprSimple_1= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprAccess().getExprSimpleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExpr2452);
                    this_ExprSimple_1=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExprSimple_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSimple"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:953:1: entryRuleExprSimple returns [String current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final String entryRuleExprSimple() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprSimple = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:954:2: (iv_ruleExprSimple= ruleExprSimple EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:955:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple2498);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple2509); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:962:1: ruleExprSimple returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'nil' | this_VAR_1= RULE_VAR | this_SYM_2= RULE_SYM | (this_PARAG_3= RULE_PARAG kw= 'cons' this_LExpr_5= ruleLExpr this_PARAD_6= RULE_PARAD ) | (this_PARAG_7= RULE_PARAG kw= 'list' this_LExpr_9= ruleLExpr this_PARAD_10= RULE_PARAD ) | (this_PARAG_11= RULE_PARAG kw= 'hd' this_LC_13= ruleLC this_Expr_14= ruleExpr this_PARAD_15= RULE_PARAD ) | (this_PARAG_16= RULE_PARAG kw= 'tl' this_LC_18= ruleLC this_Expr_19= ruleExpr this_PARAD_20= RULE_PARAD ) | (this_PARAG_21= RULE_PARAG this_SYM_22= RULE_SYM this_LExpr_23= ruleLExpr this_PARAD_24= RULE_PARAD ) ) ;
    public final AntlrDatatypeRuleToken ruleExprSimple() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_VAR_1=null;
        Token this_SYM_2=null;
        Token this_PARAG_3=null;
        Token this_PARAD_6=null;
        Token this_PARAG_7=null;
        Token this_PARAD_10=null;
        Token this_PARAG_11=null;
        Token this_PARAD_15=null;
        Token this_PARAG_16=null;
        Token this_PARAD_20=null;
        Token this_PARAG_21=null;
        Token this_SYM_22=null;
        Token this_PARAD_24=null;
        AntlrDatatypeRuleToken this_LExpr_5 = null;

        AntlrDatatypeRuleToken this_LExpr_9 = null;

        AntlrDatatypeRuleToken this_LC_13 = null;

        AntlrDatatypeRuleToken this_Expr_14 = null;

        AntlrDatatypeRuleToken this_LC_18 = null;

        AntlrDatatypeRuleToken this_Expr_19 = null;

        AntlrDatatypeRuleToken this_LExpr_23 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:965:28: ( (kw= 'nil' | this_VAR_1= RULE_VAR | this_SYM_2= RULE_SYM | (this_PARAG_3= RULE_PARAG kw= 'cons' this_LExpr_5= ruleLExpr this_PARAD_6= RULE_PARAD ) | (this_PARAG_7= RULE_PARAG kw= 'list' this_LExpr_9= ruleLExpr this_PARAD_10= RULE_PARAD ) | (this_PARAG_11= RULE_PARAG kw= 'hd' this_LC_13= ruleLC this_Expr_14= ruleExpr this_PARAD_15= RULE_PARAD ) | (this_PARAG_16= RULE_PARAG kw= 'tl' this_LC_18= ruleLC this_Expr_19= ruleExpr this_PARAD_20= RULE_PARAD ) | (this_PARAG_21= RULE_PARAG this_SYM_22= RULE_SYM this_LExpr_23= ruleLExpr this_PARAD_24= RULE_PARAD ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:1: (kw= 'nil' | this_VAR_1= RULE_VAR | this_SYM_2= RULE_SYM | (this_PARAG_3= RULE_PARAG kw= 'cons' this_LExpr_5= ruleLExpr this_PARAD_6= RULE_PARAD ) | (this_PARAG_7= RULE_PARAG kw= 'list' this_LExpr_9= ruleLExpr this_PARAD_10= RULE_PARAD ) | (this_PARAG_11= RULE_PARAG kw= 'hd' this_LC_13= ruleLC this_Expr_14= ruleExpr this_PARAD_15= RULE_PARAD ) | (this_PARAG_16= RULE_PARAG kw= 'tl' this_LC_18= ruleLC this_Expr_19= ruleExpr this_PARAD_20= RULE_PARAD ) | (this_PARAG_21= RULE_PARAG this_SYM_22= RULE_SYM this_LExpr_23= ruleLExpr this_PARAD_24= RULE_PARAD ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:1: (kw= 'nil' | this_VAR_1= RULE_VAR | this_SYM_2= RULE_SYM | (this_PARAG_3= RULE_PARAG kw= 'cons' this_LExpr_5= ruleLExpr this_PARAD_6= RULE_PARAD ) | (this_PARAG_7= RULE_PARAG kw= 'list' this_LExpr_9= ruleLExpr this_PARAD_10= RULE_PARAD ) | (this_PARAG_11= RULE_PARAG kw= 'hd' this_LC_13= ruleLC this_Expr_14= ruleExpr this_PARAD_15= RULE_PARAD ) | (this_PARAG_16= RULE_PARAG kw= 'tl' this_LC_18= ruleLC this_Expr_19= ruleExpr this_PARAD_20= RULE_PARAD ) | (this_PARAG_21= RULE_PARAG this_SYM_22= RULE_SYM this_LExpr_23= ruleLExpr this_PARAD_24= RULE_PARAD ) )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:967:2: kw= 'nil'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleExprSimple2547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExprSimpleAccess().getNilKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:973:10: this_VAR_1= RULE_VAR
                    {
                    this_VAR_1=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleExprSimple2568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VAR_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_VAR_1, grammarAccess.getExprSimpleAccess().getVARTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:981:10: this_SYM_2= RULE_SYM
                    {
                    this_SYM_2=(Token)match(input,RULE_SYM,FOLLOW_RULE_SYM_in_ruleExprSimple2594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SYM_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SYM_2, grammarAccess.getExprSimpleAccess().getSYMTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:989:6: (this_PARAG_3= RULE_PARAG kw= 'cons' this_LExpr_5= ruleLExpr this_PARAD_6= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:989:6: (this_PARAG_3= RULE_PARAG kw= 'cons' this_LExpr_5= ruleLExpr this_PARAD_6= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:989:11: this_PARAG_3= RULE_PARAG kw= 'cons' this_LExpr_5= ruleLExpr this_PARAD_6= RULE_PARAD
                    {
                    this_PARAG_3=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple2621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARAG_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_3, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_3_0()); 
                          
                    }
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleExprSimple2639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExprSimpleAccess().getConsKeyword_3_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprSimpleAccess().getLExprParserRuleCall_3_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLExpr_in_ruleExprSimple2661);
                    this_LExpr_5=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LExpr_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_PARAD_6=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple2681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARAD_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_6, grammarAccess.getExprSimpleAccess().getPARADTerminalRuleCall_3_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1021:6: (this_PARAG_7= RULE_PARAG kw= 'list' this_LExpr_9= ruleLExpr this_PARAD_10= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1021:6: (this_PARAG_7= RULE_PARAG kw= 'list' this_LExpr_9= ruleLExpr this_PARAD_10= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1021:11: this_PARAG_7= RULE_PARAG kw= 'list' this_LExpr_9= ruleLExpr this_PARAD_10= RULE_PARAD
                    {
                    this_PARAG_7=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple2709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARAG_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_7, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_4_0()); 
                          
                    }
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleExprSimple2727); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExprSimpleAccess().getListKeyword_4_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprSimpleAccess().getLExprParserRuleCall_4_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLExpr_in_ruleExprSimple2749);
                    this_LExpr_9=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LExpr_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_PARAD_10=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple2769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARAD_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_10, grammarAccess.getExprSimpleAccess().getPARADTerminalRuleCall_4_3()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:6: (this_PARAG_11= RULE_PARAG kw= 'hd' this_LC_13= ruleLC this_Expr_14= ruleExpr this_PARAD_15= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:6: (this_PARAG_11= RULE_PARAG kw= 'hd' this_LC_13= ruleLC this_Expr_14= ruleExpr this_PARAD_15= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:11: this_PARAG_11= RULE_PARAG kw= 'hd' this_LC_13= ruleLC this_Expr_14= ruleExpr this_PARAD_15= RULE_PARAD
                    {
                    this_PARAG_11=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple2797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARAG_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_11, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_5_0()); 
                          
                    }
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleExprSimple2815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExprSimpleAccess().getHdKeyword_5_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprSimpleAccess().getLCParserRuleCall_5_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleExprSimple2837);
                    this_LC_13=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprSimpleAccess().getExprParserRuleCall_5_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple2864);
                    this_Expr_14=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Expr_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_PARAD_15=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple2884); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARAD_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_15, grammarAccess.getExprSimpleAccess().getPARADTerminalRuleCall_5_4()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1096:6: (this_PARAG_16= RULE_PARAG kw= 'tl' this_LC_18= ruleLC this_Expr_19= ruleExpr this_PARAD_20= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1096:6: (this_PARAG_16= RULE_PARAG kw= 'tl' this_LC_18= ruleLC this_Expr_19= ruleExpr this_PARAD_20= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1096:11: this_PARAG_16= RULE_PARAG kw= 'tl' this_LC_18= ruleLC this_Expr_19= ruleExpr this_PARAD_20= RULE_PARAD
                    {
                    this_PARAG_16=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple2912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARAG_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_16, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_6_0()); 
                          
                    }
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleExprSimple2930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExprSimpleAccess().getTlKeyword_6_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprSimpleAccess().getLCParserRuleCall_6_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleExprSimple2952);
                    this_LC_18=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprSimpleAccess().getExprParserRuleCall_6_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple2979);
                    this_Expr_19=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Expr_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_PARAD_20=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple2999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARAD_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_20, grammarAccess.getExprSimpleAccess().getPARADTerminalRuleCall_6_4()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1139:6: (this_PARAG_21= RULE_PARAG this_SYM_22= RULE_SYM this_LExpr_23= ruleLExpr this_PARAD_24= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1139:6: (this_PARAG_21= RULE_PARAG this_SYM_22= RULE_SYM this_LExpr_23= ruleLExpr this_PARAD_24= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1139:11: this_PARAG_21= RULE_PARAG this_SYM_22= RULE_SYM this_LExpr_23= ruleLExpr this_PARAD_24= RULE_PARAD
                    {
                    this_PARAG_21=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple3027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARAG_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_21, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_7_0()); 
                          
                    }
                    this_SYM_22=(Token)match(input,RULE_SYM,FOLLOW_RULE_SYM_in_ruleExprSimple3047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SYM_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SYM_22, grammarAccess.getExprSimpleAccess().getSYMTerminalRuleCall_7_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprSimpleAccess().getLExprParserRuleCall_7_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLExpr_in_ruleExprSimple3074);
                    this_LExpr_23=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LExpr_23);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_PARAD_24=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple3094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARAD_24);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_24, grammarAccess.getExprSimpleAccess().getPARADTerminalRuleCall_7_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleLExpr"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1179:1: entryRuleLExpr returns [String current=null] : iv_ruleLExpr= ruleLExpr EOF ;
    public final String entryRuleLExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLExpr = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1180:2: (iv_ruleLExpr= ruleLExpr EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1181:2: iv_ruleLExpr= ruleLExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLExprRule()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_entryRuleLExpr3141);
            iv_ruleLExpr=ruleLExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLExpr3152); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLExpr"


    // $ANTLR start "ruleLExpr"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:1: ruleLExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LC_0= ruleLC this_Expr_1= ruleExpr )+ ;
    public final AntlrDatatypeRuleToken ruleLExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LC_0 = null;

        AntlrDatatypeRuleToken this_Expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:28: ( (this_LC_0= ruleLC this_Expr_1= ruleExpr )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:1: (this_LC_0= ruleLC this_Expr_1= ruleExpr )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:1: (this_LC_0= ruleLC this_Expr_1= ruleExpr )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_CR && LA13_0<=RULE_PARAG)||(LA13_0>=RULE_SP && LA13_0<=RULE_LF)||LA13_0==39||LA13_0==46) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1193:5: this_LC_0= ruleLC this_Expr_1= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getLExprAccess().getLCParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleLExpr3199);
            	    this_LC_0=ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LC_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getLExprAccess().getExprParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleLExpr3226);
            	    this_Expr_1=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Expr_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLExpr"


    // $ANTLR start "entryRuleExprAnd"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1222:1: entryRuleExprAnd returns [String current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final String entryRuleExprAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprAnd = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1223:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1224:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd3273);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd3284); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprAnd"


    // $ANTLR start "ruleExprAnd"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1231:1: ruleExprAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExprOr_0= ruleExprOr (this_LC_1= ruleLC kw= 'and' this_LC_3= ruleLC this_ExprOr_4= ruleExprOr )* ) ;
    public final AntlrDatatypeRuleToken ruleExprAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExprOr_0 = null;

        AntlrDatatypeRuleToken this_LC_1 = null;

        AntlrDatatypeRuleToken this_LC_3 = null;

        AntlrDatatypeRuleToken this_ExprOr_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:28: ( (this_ExprOr_0= ruleExprOr (this_LC_1= ruleLC kw= 'and' this_LC_3= ruleLC this_ExprOr_4= ruleExprOr )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1235:1: (this_ExprOr_0= ruleExprOr (this_LC_1= ruleLC kw= 'and' this_LC_3= ruleLC this_ExprOr_4= ruleExprOr )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1235:1: (this_ExprOr_0= ruleExprOr (this_LC_1= ruleLC kw= 'and' this_LC_3= ruleLC this_ExprOr_4= ruleExprOr )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1236:5: this_ExprOr_0= ruleExprOr (this_LC_1= ruleLC kw= 'and' this_LC_3= ruleLC this_ExprOr_4= ruleExprOr )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3331);
            this_ExprOr_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ExprOr_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1246:1: (this_LC_1= ruleLC kw= 'and' this_LC_3= ruleLC this_ExprOr_4= ruleExprOr )*
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==44) ) {
                        alt14=1;
                    }


                    }
                    break;
                case RULE_CR:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==44) ) {
                        alt14=1;
                    }


                    }
                    break;
                case RULE_TAB:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (LA14_3==44) ) {
                        alt14=1;
                    }


                    }
                    break;
                case RULE_LF:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (LA14_4==44) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 44:
                    {
                    alt14=1;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1247:5: this_LC_1= ruleLC kw= 'and' this_LC_3= ruleLC this_ExprOr_4= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprAnd3359);
            	    this_LC_1=ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LC_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,44,FOLLOW_44_in_ruleExprAnd3377); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExprAndAccess().getAndKeyword_1_1()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprAnd3399);
            	    this_LC_3=ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LC_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_1_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3426);
            	    this_ExprOr_4=ruleExprOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ExprOr_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1293:1: entryRuleExprOr returns [String current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final String entryRuleExprOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprOr = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1294:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1295:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr3474);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr3485); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprOr"


    // $ANTLR start "ruleExprOr"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1302:1: ruleExprOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExprNot_0= ruleExprNot (this_LC_1= ruleLC kw= 'or' this_LC_3= ruleLC this_ExprNot_4= ruleExprNot )* ) ;
    public final AntlrDatatypeRuleToken ruleExprOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExprNot_0 = null;

        AntlrDatatypeRuleToken this_LC_1 = null;

        AntlrDatatypeRuleToken this_LC_3 = null;

        AntlrDatatypeRuleToken this_ExprNot_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1305:28: ( (this_ExprNot_0= ruleExprNot (this_LC_1= ruleLC kw= 'or' this_LC_3= ruleLC this_ExprNot_4= ruleExprNot )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1306:1: (this_ExprNot_0= ruleExprNot (this_LC_1= ruleLC kw= 'or' this_LC_3= ruleLC this_ExprNot_4= ruleExprNot )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1306:1: (this_ExprNot_0= ruleExprNot (this_LC_1= ruleLC kw= 'or' this_LC_3= ruleLC this_ExprNot_4= ruleExprNot )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:5: this_ExprNot_0= ruleExprNot (this_LC_1= ruleLC kw= 'or' this_LC_3= ruleLC this_ExprNot_4= ruleExprNot )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprOrAccess().getExprNotParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprNot_in_ruleExprOr3532);
            this_ExprNot_0=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ExprNot_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1317:1: (this_LC_1= ruleLC kw= 'or' this_LC_3= ruleLC this_ExprNot_4= ruleExprNot )*
            loop15:
            do {
                int alt15=2;
                switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==45) ) {
                        alt15=1;
                    }


                    }
                    break;
                case RULE_CR:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==45) ) {
                        alt15=1;
                    }


                    }
                    break;
                case RULE_TAB:
                    {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3==45) ) {
                        alt15=1;
                    }


                    }
                    break;
                case RULE_LF:
                    {
                    int LA15_4 = input.LA(2);

                    if ( (LA15_4==45) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 45:
                    {
                    alt15=1;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1318:5: this_LC_1= ruleLC kw= 'or' this_LC_3= ruleLC this_ExprNot_4= ruleExprNot
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprOr3560);
            	    this_LC_1=ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LC_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleExprOr3578); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExprOrAccess().getOrKeyword_1_1()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprOr3600);
            	    this_LC_3=ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LC_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprOrAccess().getExprNotParserRuleCall_1_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleExprNot_in_ruleExprOr3627);
            	    this_ExprNot_4=ruleExprNot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ExprNot_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleExprNot"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:1: entryRuleExprNot returns [String current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final String entryRuleExprNot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprNot = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:2: (iv_ruleExprNot= ruleExprNot EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1366:2: iv_ruleExprNot= ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_entryRuleExprNot3675);
            iv_ruleExprNot=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprNot.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNot3686); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprNot"


    // $ANTLR start "ruleExprNot"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:1: ruleExprNot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'not' this_LC_1= ruleLC )? this_ExprEq_2= ruleExprEq ) ;
    public final AntlrDatatypeRuleToken ruleExprNot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_LC_1 = null;

        AntlrDatatypeRuleToken this_ExprEq_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1376:28: ( ( (kw= 'not' this_LC_1= ruleLC )? this_ExprEq_2= ruleExprEq ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:1: ( (kw= 'not' this_LC_1= ruleLC )? this_ExprEq_2= ruleExprEq )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:1: ( (kw= 'not' this_LC_1= ruleLC )? this_ExprEq_2= ruleExprEq )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:2: (kw= 'not' this_LC_1= ruleLC )? this_ExprEq_2= ruleExprEq
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:2: (kw= 'not' this_LC_1= ruleLC )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1378:2: kw= 'not' this_LC_1= ruleLC
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleExprNot3725); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExprNotAccess().getNotKeyword_0_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprNotAccess().getLCParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleExprNot3747);
                    this_LC_1=ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprNotAccess().getExprEqParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExprEq_in_ruleExprNot3776);
            this_ExprEq_2=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ExprEq_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprNot"


    // $ANTLR start "entryRuleExprEq"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1413:1: entryRuleExprEq returns [String current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final String entryRuleExprEq() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprEq = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1414:2: (iv_ruleExprEq= ruleExprEq EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1415:2: iv_ruleExprEq= ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_entryRuleExprEq3822);
            iv_ruleExprEq=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEq.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEq3833); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprEq"


    // $ANTLR start "ruleExprEq"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1422:1: ruleExprEq returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ExprSimple_0= ruleExprSimple kw= '=?' this_ExprSimple_2= ruleExprSimple ) | (this_PARAG_3= RULE_PARAG this_Expr_4= ruleExpr this_PARAD_5= RULE_PARAD ) ) ;
    public final AntlrDatatypeRuleToken ruleExprEq() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_PARAG_3=null;
        Token this_PARAD_5=null;
        AntlrDatatypeRuleToken this_ExprSimple_0 = null;

        AntlrDatatypeRuleToken this_ExprSimple_2 = null;

        AntlrDatatypeRuleToken this_Expr_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1425:28: ( ( (this_ExprSimple_0= ruleExprSimple kw= '=?' this_ExprSimple_2= ruleExprSimple ) | (this_PARAG_3= RULE_PARAG this_Expr_4= ruleExpr this_PARAD_5= RULE_PARAD ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1426:1: ( (this_ExprSimple_0= ruleExprSimple kw= '=?' this_ExprSimple_2= ruleExprSimple ) | (this_PARAG_3= RULE_PARAG this_Expr_4= ruleExpr this_PARAD_5= RULE_PARAD ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1426:1: ( (this_ExprSimple_0= ruleExprSimple kw= '=?' this_ExprSimple_2= ruleExprSimple ) | (this_PARAG_3= RULE_PARAG this_Expr_4= ruleExpr this_PARAD_5= RULE_PARAD ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_SYM && LA17_0<=RULE_VAR)||LA17_0==39) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_PARAG) ) {
                switch ( input.LA(2) ) {
                case RULE_SYM:
                    {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==RULE_PARAD||LA17_3==47) ) {
                        alt17=2;
                    }
                    else if ( ((LA17_3>=RULE_CR && LA17_3<=RULE_PARAG)||(LA17_3>=RULE_SP && LA17_3<=RULE_LF)||LA17_3==39||LA17_3==46) ) {
                        alt17=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 40:
                case 41:
                case 42:
                case 43:
                    {
                    alt17=1;
                    }
                    break;
                case RULE_VAR:
                case RULE_PARAG:
                case 39:
                case 46:
                    {
                    alt17=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1426:2: (this_ExprSimple_0= ruleExprSimple kw= '=?' this_ExprSimple_2= ruleExprSimple )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1426:2: (this_ExprSimple_0= ruleExprSimple kw= '=?' this_ExprSimple_2= ruleExprSimple )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1427:5: this_ExprSimple_0= ruleExprSimple kw= '=?' this_ExprSimple_2= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprEqAccess().getExprSimpleParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExprEq3881);
                    this_ExprSimple_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExprSimple_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleExprEq3899); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprEqAccess().getExprSimpleParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExprEq3921);
                    this_ExprSimple_2=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExprSimple_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1455:6: (this_PARAG_3= RULE_PARAG this_Expr_4= ruleExpr this_PARAD_5= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1455:6: (this_PARAG_3= RULE_PARAG this_Expr_4= ruleExpr this_PARAD_5= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1455:11: this_PARAG_3= RULE_PARAG this_Expr_4= ruleExpr this_PARAD_5= RULE_PARAD
                    {
                    this_PARAG_3=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprEq3949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARAG_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_3, grammarAccess.getExprEqAccess().getPARAGTerminalRuleCall_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprEqAccess().getExprParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprEq3976);
                    this_Expr_4=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Expr_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_PARAD_5=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprEq3996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARAD_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_5, grammarAccess.getExprEqAccess().getPARADTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprEq"


    // $ANTLR start "entryRuleLC"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1488:1: entryRuleLC returns [String current=null] : iv_ruleLC= ruleLC EOF ;
    public final String entryRuleLC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLC = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1489:2: (iv_ruleLC= ruleLC EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1490:2: iv_ruleLC= ruleLC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLCRule()); 
            }
            pushFollow(FOLLOW_ruleLC_in_entryRuleLC4043);
            iv_ruleLC=ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLC.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLC4054); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLC"


    // $ANTLR start "ruleLC"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1497:1: ruleLC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )? ;
    public final AntlrDatatypeRuleToken ruleLC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SP_0=null;
        Token this_CR_1=null;
        Token this_TAB_2=null;
        Token this_LF_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1500:28: ( (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1501:1: (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1501:1: (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )?
            int alt18=5;
            switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    alt18=1;
                    }
                    break;
                case RULE_CR:
                    {
                    alt18=2;
                    }
                    break;
                case RULE_TAB:
                    {
                    alt18=3;
                    }
                    break;
                case RULE_LF:
                    {
                    alt18=4;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1501:6: this_SP_0= RULE_SP
                    {
                    this_SP_0=(Token)match(input,RULE_SP,FOLLOW_RULE_SP_in_ruleLC4094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SP_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SP_0, grammarAccess.getLCAccess().getSPTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1509:10: this_CR_1= RULE_CR
                    {
                    this_CR_1=(Token)match(input,RULE_CR,FOLLOW_RULE_CR_in_ruleLC4120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CR_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CR_1, grammarAccess.getLCAccess().getCRTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1517:10: this_TAB_2= RULE_TAB
                    {
                    this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleLC4146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TAB_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TAB_2, grammarAccess.getLCAccess().getTABTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1525:10: this_LF_3= RULE_LF
                    {
                    this_LF_3=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleLC4172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LF_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LF_3, grammarAccess.getLCAccess().getLFTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLC"

    // $ANTLR start synpred14_InternalMyDsl
    public final void synpred14_InternalMyDsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExprAnd_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:923:5: (this_ExprAnd_0= ruleExprAnd )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:923:5: this_ExprAnd_0= ruleExprAnd
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getExprAccess().getExprAndParserRuleCall_0()); 
              
        }
        pushFollow(FOLLOW_ruleExprAnd_in_synpred14_InternalMyDsl2419);
        this_ExprAnd_0=ruleExprAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalMyDsl

    // Delegated rules

    public final boolean synpred14_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\12\uffff";
    static final String DFA12_minS =
        "\1\5\3\uffff\1\5\5\uffff";
    static final String DFA12_maxS =
        "\1\47\3\uffff\1\53\5\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\10\1\6\1\5\1\7\1\4";
    static final String DFA12_specialS =
        "\12\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\3\1\2\1\4\37\uffff\1\1",
            "",
            "",
            "",
            "\1\5\42\uffff\1\11\1\7\1\6\1\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "966:1: (kw= 'nil' | this_VAR_1= RULE_VAR | this_SYM_2= RULE_SYM | (this_PARAG_3= RULE_PARAG kw= 'cons' this_LExpr_5= ruleLExpr this_PARAD_6= RULE_PARAD ) | (this_PARAG_7= RULE_PARAG kw= 'list' this_LExpr_9= ruleLExpr this_PARAD_10= RULE_PARAD ) | (this_PARAG_11= RULE_PARAG kw= 'hd' this_LC_13= ruleLC this_Expr_14= ruleExpr this_PARAD_15= RULE_PARAD ) | (this_PARAG_16= RULE_PARAG kw= 'tl' this_LC_18= ruleLC this_Expr_19= ruleExpr this_PARAD_20= RULE_PARAD ) | (this_PARAG_21= RULE_PARAG this_SYM_22= RULE_SYM this_LExpr_23= ruleLExpr this_PARAD_24= RULE_PARAD ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgramme_in_ruleModel136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgramme_in_entryRuleProgramme172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgramme183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFonction_in_ruleProgramme230 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_RULE_CR_in_ruleProgramme251 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_ruleFonction_in_entryRuleFonction300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFonction311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFonction349 = new BitSet(new long[]{0x0000000000000E30L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFonction371 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SYM_in_ruleFonction391 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFonction409 = new BitSet(new long[]{0x0000000000400E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFonction431 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFonction449 = new BitSet(new long[]{0x0000000000000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFonction471 = new BitSet(new long[]{0x0000000000000E50L});
    public static final BitSet FOLLOW_ruleInput_in_ruleFonction498 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFonction516 = new BitSet(new long[]{0x0000002268000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleFonction538 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFonction556 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFonction569 = new BitSet(new long[]{0x0000000000000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFonction591 = new BitSet(new long[]{0x0000000000000E50L});
    public static final BitSet FOLLOW_ruleOutput_in_ruleFonction618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleInput715 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleInput734 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleInput749 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleOutput848 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleOutput867 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleOutput882 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_entryRuleCommandes930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandes941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommande_in_ruleCommandes988 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleCommandes1007 = new BitSet(new long[]{0x0000002268000040L});
    public static final BitSet FOLLOW_ruleCommande_in_ruleCommandes1029 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleCommande_in_entryRuleCommande1077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommande1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCommande1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_ruleCommande1155 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCommande1173 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExprs_in_ruleCommande1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCommande1222 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_30_in_ruleCommande1241 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1264 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommande1291 = new BitSet(new long[]{0x0000000080000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1318 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCommande1336 = new BitSet(new long[]{0x0000002268000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1358 = new BitSet(new long[]{0x0000002268000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleCommande1385 = new BitSet(new long[]{0x0000000100000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1412 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCommande1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCommande1451 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1473 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommande1500 = new BitSet(new long[]{0x0000000400000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1527 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCommande1545 = new BitSet(new long[]{0x0000002268000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1567 = new BitSet(new long[]{0x0000002268000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleCommande1594 = new BitSet(new long[]{0x0000001800000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1621 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleCommande1640 = new BitSet(new long[]{0x0000002268000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1662 = new BitSet(new long[]{0x0000002268000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleCommande1689 = new BitSet(new long[]{0x0000001000000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1716 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleCommande1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCommande1757 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1779 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommande1806 = new BitSet(new long[]{0x0000004000000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1833 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCommande1851 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1873 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommande1900 = new BitSet(new long[]{0x0000000080000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1927 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCommande1945 = new BitSet(new long[]{0x0000002268000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1967 = new BitSet(new long[]{0x0000002268000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleCommande1994 = new BitSet(new long[]{0x0000000100000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande2021 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCommande2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars2081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleVars2132 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleVars2151 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleVars2166 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs2214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs2272 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleExprs2291 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs2313 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExpr2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExpr2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple2498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExprSimple2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleExprSimple2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_ruleExprSimple2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple2621 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleExprSimple2639 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLExpr_in_ruleExprSimple2661 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple2709 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleExprSimple2727 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLExpr_in_ruleExprSimple2749 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple2797 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleExprSimple2815 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprSimple2837 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple2864 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple2912 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleExprSimple2930 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprSimple2952 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple2979 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple3027 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SYM_in_ruleExprSimple3047 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLExpr_in_ruleExprSimple3074 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_entryRuleLExpr3141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLExpr3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_ruleLExpr3199 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleLExpr3226 = new BitSet(new long[]{0x0000408000000EF2L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd3273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3331 = new BitSet(new long[]{0x0000100000000E12L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprAnd3359 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleExprAnd3377 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprAnd3399 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3426 = new BitSet(new long[]{0x0000100000000E12L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr3474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_ruleExprOr3532 = new BitSet(new long[]{0x0000200000000E12L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprOr3560 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleExprOr3578 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprOr3600 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExprNot_in_ruleExprOr3627 = new BitSet(new long[]{0x0000200000000E12L});
    public static final BitSet FOLLOW_ruleExprNot_in_entryRuleExprNot3675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNot3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleExprNot3725 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprNot3747 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExprEq_in_ruleExprNot3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_entryRuleExprEq3822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEq3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExprEq3881 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleExprEq3899 = new BitSet(new long[]{0x00000080000000E0L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExprEq3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprEq3949 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprEq3976 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprEq3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_entryRuleLC4043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLC4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_ruleLC4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_ruleLC4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleLC4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleLC4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_synpred14_InternalMyDsl2419 = new BitSet(new long[]{0x0000000000000002L});

}