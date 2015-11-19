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

        EObject lv_programme_0_0 = null;


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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:112:1: entryRuleProgramme returns [EObject current=null] : iv_ruleProgramme= ruleProgramme EOF ;
    public final EObject entryRuleProgramme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramme = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:113:2: (iv_ruleProgramme= ruleProgramme EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:114:2: iv_ruleProgramme= ruleProgramme EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgrammeRule()); 
            }
            pushFollow(FOLLOW_ruleProgramme_in_entryRuleProgramme171);
            iv_ruleProgramme=ruleProgramme();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgramme; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgramme181); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:1: ruleProgramme returns [EObject current=null] : ( () ( ( (lv_fonct_1_0= ruleFonction ) ) (this_CR_2= RULE_CR )* )* ) ;
    public final EObject ruleProgramme() throws RecognitionException {
        EObject current = null;

        Token this_CR_2=null;
        EObject lv_fonct_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:28: ( ( () ( ( (lv_fonct_1_0= ruleFonction ) ) (this_CR_2= RULE_CR )* )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: ( () ( ( (lv_fonct_1_0= ruleFonction ) ) (this_CR_2= RULE_CR )* )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: ( () ( ( (lv_fonct_1_0= ruleFonction ) ) (this_CR_2= RULE_CR )* )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:2: () ( ( (lv_fonct_1_0= ruleFonction ) ) (this_CR_2= RULE_CR )* )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getProgrammeAccess().getProgrammeAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:134:2: ( ( (lv_fonct_1_0= ruleFonction ) ) (this_CR_2= RULE_CR )* )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:134:3: ( (lv_fonct_1_0= ruleFonction ) ) (this_CR_2= RULE_CR )*
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:134:3: ( (lv_fonct_1_0= ruleFonction ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:135:1: (lv_fonct_1_0= ruleFonction )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:135:1: (lv_fonct_1_0= ruleFonction )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:3: lv_fonct_1_0= ruleFonction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgrammeAccess().getFonctFonctionParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFonction_in_ruleProgramme240);
            	    lv_fonct_1_0=ruleFonction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgrammeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fonct",
            	              		lv_fonct_1_0, 
            	              		"Fonction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:152:2: (this_CR_2= RULE_CR )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==RULE_CR) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:152:3: this_CR_2= RULE_CR
            	    	    {
            	    	    this_CR_2=(Token)match(input,RULE_CR,FOLLOW_RULE_CR_in_ruleProgramme252); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_CR_2, grammarAccess.getProgrammeAccess().getCRTerminalRuleCall_1_1()); 
            	    	          
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:164:1: entryRuleFonction returns [EObject current=null] : iv_ruleFonction= ruleFonction EOF ;
    public final EObject entryRuleFonction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonction = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:165:2: (iv_ruleFonction= ruleFonction EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:166:2: iv_ruleFonction= ruleFonction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFonctionRule()); 
            }
            pushFollow(FOLLOW_ruleFonction_in_entryRuleFonction291);
            iv_ruleFonction=ruleFonction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFonction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFonction301); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:173:1: ruleFonction returns [EObject current=null] : (otherlv_0= 'fonction' ruleLC ( (lv_symbole_2_0= RULE_SYM ) ) otherlv_3= ':' ruleLC otherlv_5= 'read' ruleLC ( (lv_in_7_0= ruleInput ) ) otherlv_8= '%' ( (lv_com_9_0= ruleCommandes ) ) otherlv_10= '%' otherlv_11= 'write' ruleLC ( (lv_out_13_0= ruleOutput ) ) ) ;
    public final EObject ruleFonction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_symbole_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_in_7_0 = null;

        EObject lv_com_9_0 = null;

        EObject lv_out_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:176:28: ( (otherlv_0= 'fonction' ruleLC ( (lv_symbole_2_0= RULE_SYM ) ) otherlv_3= ':' ruleLC otherlv_5= 'read' ruleLC ( (lv_in_7_0= ruleInput ) ) otherlv_8= '%' ( (lv_com_9_0= ruleCommandes ) ) otherlv_10= '%' otherlv_11= 'write' ruleLC ( (lv_out_13_0= ruleOutput ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:177:1: (otherlv_0= 'fonction' ruleLC ( (lv_symbole_2_0= RULE_SYM ) ) otherlv_3= ':' ruleLC otherlv_5= 'read' ruleLC ( (lv_in_7_0= ruleInput ) ) otherlv_8= '%' ( (lv_com_9_0= ruleCommandes ) ) otherlv_10= '%' otherlv_11= 'write' ruleLC ( (lv_out_13_0= ruleOutput ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:177:1: (otherlv_0= 'fonction' ruleLC ( (lv_symbole_2_0= RULE_SYM ) ) otherlv_3= ':' ruleLC otherlv_5= 'read' ruleLC ( (lv_in_7_0= ruleInput ) ) otherlv_8= '%' ( (lv_com_9_0= ruleCommandes ) ) otherlv_10= '%' otherlv_11= 'write' ruleLC ( (lv_out_13_0= ruleOutput ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:177:3: otherlv_0= 'fonction' ruleLC ( (lv_symbole_2_0= RULE_SYM ) ) otherlv_3= ':' ruleLC otherlv_5= 'read' ruleLC ( (lv_in_7_0= ruleInput ) ) otherlv_8= '%' ( (lv_com_9_0= ruleCommandes ) ) otherlv_10= '%' otherlv_11= 'write' ruleLC ( (lv_out_13_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleFonction338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFonctionAccess().getFonctionKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFonctionAccess().getLCParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFonction357);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:192:1: ( (lv_symbole_2_0= RULE_SYM ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:193:1: (lv_symbole_2_0= RULE_SYM )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:193:1: (lv_symbole_2_0= RULE_SYM )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:194:3: lv_symbole_2_0= RULE_SYM
            {
            lv_symbole_2_0=(Token)match(input,RULE_SYM,FOLLOW_RULE_SYM_in_ruleFonction373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_symbole_2_0, grammarAccess.getFonctionAccess().getSymboleSYMTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFonctionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"symbole",
                      		lv_symbole_2_0, 
                      		"SYM");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleFonction390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFonctionAccess().getColonKeyword_3());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFonctionAccess().getLCParserRuleCall_4()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFonction409);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleFonction420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFonctionAccess().getReadKeyword_5());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFonctionAccess().getLCParserRuleCall_6()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFonction439);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:240:1: ( (lv_in_7_0= ruleInput ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:241:1: (lv_in_7_0= ruleInput )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:241:1: (lv_in_7_0= ruleInput )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:242:3: lv_in_7_0= ruleInput
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFonctionAccess().getInInputParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInput_in_ruleFonction459);
            lv_in_7_0=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFonctionRule());
              	        }
                     		set(
                     			current, 
                     			"in",
                      		lv_in_7_0, 
                      		"Input");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleFonction471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getFonctionAccess().getPercentSignKeyword_8());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:1: ( (lv_com_9_0= ruleCommandes ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:263:1: (lv_com_9_0= ruleCommandes )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:263:1: (lv_com_9_0= ruleCommandes )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:264:3: lv_com_9_0= ruleCommandes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFonctionAccess().getComCommandesParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommandes_in_ruleFonction492);
            lv_com_9_0=ruleCommandes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFonctionRule());
              	        }
                     		set(
                     			current, 
                     			"com",
                      		lv_com_9_0, 
                      		"Commandes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleFonction504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getFonctionAccess().getPercentSignKeyword_10());
                  
            }
            otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleFonction516); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getFonctionAccess().getWriteKeyword_11());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFonctionAccess().getLCParserRuleCall_12()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFonction535);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:299:1: ( (lv_out_13_0= ruleOutput ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:300:1: (lv_out_13_0= ruleOutput )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:300:1: (lv_out_13_0= ruleOutput )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:301:3: lv_out_13_0= ruleOutput
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFonctionAccess().getOutOutputParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOutput_in_ruleFonction555);
            lv_out_13_0=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFonctionRule());
              	        }
                     		set(
                     			current, 
                     			"out",
                      		lv_out_13_0, 
                      		"Output");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
    // $ANTLR end "ruleFonction"


    // $ANTLR start "entryRuleInput"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:325:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:326:2: (iv_ruleInput= ruleInput EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:327:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput591);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput601); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:1: ruleInput returns [EObject current=null] : ( ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_var1_0_0=null;
        Token otherlv_1=null;
        Token lv_var2_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:337:28: ( ( ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:338:1: ( ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:338:1: ( ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:338:2: ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:338:2: ( (lv_var1_0_0= RULE_VAR ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:339:1: (lv_var1_0_0= RULE_VAR )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:339:1: (lv_var1_0_0= RULE_VAR )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:340:3: lv_var1_0_0= RULE_VAR
            {
            lv_var1_0_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleInput643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_var1_0_0, grammarAccess.getInputAccess().getVar1VARTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInputRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"var1",
                      		lv_var1_0_0, 
                      		"VAR");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:356:2: (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:356:4: otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleInput661); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:360:1: ( (lv_var2_2_0= RULE_VAR ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:361:1: (lv_var2_2_0= RULE_VAR )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:361:1: (lv_var2_2_0= RULE_VAR )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:362:3: lv_var2_2_0= RULE_VAR
            	    {
            	    lv_var2_2_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleInput678); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_var2_2_0, grammarAccess.getInputAccess().getVar2VARTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getInputRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"var2",
            	              		lv_var2_2_0, 
            	              		"VAR");
            	      	    
            	    }

            	    }


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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:386:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:387:2: (iv_ruleOutput= ruleOutput EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:388:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput721);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput731); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:1: ruleOutput returns [EObject current=null] : ( ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_var1_0_0=null;
        Token otherlv_1=null;
        Token lv_var2_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:28: ( ( ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:399:1: ( ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:399:1: ( ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:399:2: ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:399:2: ( (lv_var1_0_0= RULE_VAR ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:400:1: (lv_var1_0_0= RULE_VAR )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:400:1: (lv_var1_0_0= RULE_VAR )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:401:3: lv_var1_0_0= RULE_VAR
            {
            lv_var1_0_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleOutput773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_var1_0_0, grammarAccess.getOutputAccess().getVar1VARTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOutputRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"var1",
                      		lv_var1_0_0, 
                      		"VAR");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:417:2: (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:417:4: otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleOutput791); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:421:1: ( (lv_var2_2_0= RULE_VAR ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:422:1: (lv_var2_2_0= RULE_VAR )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:422:1: (lv_var2_2_0= RULE_VAR )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:423:3: lv_var2_2_0= RULE_VAR
            	    {
            	    lv_var2_2_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleOutput808); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_var2_2_0, grammarAccess.getOutputAccess().getVar2VARTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getOutputRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"var2",
            	              		lv_var2_2_0, 
            	              		"VAR");
            	      	    
            	    }

            	    }


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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:447:1: entryRuleCommandes returns [EObject current=null] : iv_ruleCommandes= ruleCommandes EOF ;
    public final EObject entryRuleCommandes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandes = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:448:2: (iv_ruleCommandes= ruleCommandes EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:449:2: iv_ruleCommandes= ruleCommandes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandesRule()); 
            }
            pushFollow(FOLLOW_ruleCommandes_in_entryRuleCommandes851);
            iv_ruleCommandes=ruleCommandes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommandes; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandes861); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:456:1: ruleCommandes returns [EObject current=null] : ( ( (lv_com1_0_0= ruleCommande ) ) (otherlv_1= ';' ( (lv_com2_2_0= ruleCommande ) ) )* ) ;
    public final EObject ruleCommandes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_com1_0_0 = null;

        EObject lv_com2_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:28: ( ( ( (lv_com1_0_0= ruleCommande ) ) (otherlv_1= ';' ( (lv_com2_2_0= ruleCommande ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:1: ( ( (lv_com1_0_0= ruleCommande ) ) (otherlv_1= ';' ( (lv_com2_2_0= ruleCommande ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:1: ( ( (lv_com1_0_0= ruleCommande ) ) (otherlv_1= ';' ( (lv_com2_2_0= ruleCommande ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:2: ( (lv_com1_0_0= ruleCommande ) ) (otherlv_1= ';' ( (lv_com2_2_0= ruleCommande ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:2: ( (lv_com1_0_0= ruleCommande ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:461:1: (lv_com1_0_0= ruleCommande )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:461:1: (lv_com1_0_0= ruleCommande )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:462:3: lv_com1_0_0= ruleCommande
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandesAccess().getCom1CommandeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommande_in_ruleCommandes907);
            lv_com1_0_0=ruleCommande();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandesRule());
              	        }
                     		set(
                     			current, 
                     			"com1",
                      		lv_com1_0_0, 
                      		"Commande");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:478:2: (otherlv_1= ';' ( (lv_com2_2_0= ruleCommande ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:478:4: otherlv_1= ';' ( (lv_com2_2_0= ruleCommande ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleCommandes920); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCommandesAccess().getSemicolonKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:482:1: ( (lv_com2_2_0= ruleCommande ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:483:1: (lv_com2_2_0= ruleCommande )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:483:1: (lv_com2_2_0= ruleCommande )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:484:3: lv_com2_2_0= ruleCommande
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCommandesAccess().getCom2CommandeParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCommande_in_ruleCommandes941);
            	    lv_com2_2_0=ruleCommande();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCommandesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"com2",
            	              		lv_com2_2_0, 
            	              		"Commande");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:508:1: entryRuleCommande returns [EObject current=null] : iv_ruleCommande= ruleCommande EOF ;
    public final EObject entryRuleCommande() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommande = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:2: (iv_ruleCommande= ruleCommande EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:510:2: iv_ruleCommande= ruleCommande EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandeRule()); 
            }
            pushFollow(FOLLOW_ruleCommande_in_entryRuleCommande979);
            iv_ruleCommande=ruleCommande();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommande; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommande989); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:517:1: ruleCommande returns [EObject current=null] : ( ( () otherlv_1= 'nop' ) | ( ( (lv_var_2_0= ruleVars ) ) otherlv_3= ':=' ( (lv_exp_4_0= ruleExprs ) ) ) | ( (otherlv_5= 'while' | otherlv_6= 'for' ) ruleLC ( (lv_exp2_8_0= ruleExpr ) ) ruleLC otherlv_10= 'do' ruleLC ( (lv_com_12_0= ruleCommandes ) ) ruleLC otherlv_14= 'od' ) | (otherlv_15= 'if' ruleLC ( (lv_exp3_17_0= ruleExpr ) ) ruleLC otherlv_19= 'then' ruleLC ( (lv_com2_21_0= ruleCommandes ) ) ruleLC (otherlv_23= 'else' ruleLC ( (lv_com3_25_0= ruleCommandes ) ) ruleLC )? otherlv_27= 'fi' ) | (otherlv_28= 'foreach' ruleLC ( (lv_exp4_30_0= ruleExpr ) ) ruleLC otherlv_32= 'in' ruleLC ( (lv_exp5_34_0= ruleExpr ) ) ruleLC otherlv_36= 'do' ruleLC ( (lv_com4_38_0= ruleCommandes ) ) ruleLC otherlv_40= 'od' ) ) ;
    public final EObject ruleCommande() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        Token otherlv_23=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_32=null;
        Token otherlv_36=null;
        Token otherlv_40=null;
        EObject lv_var_2_0 = null;

        EObject lv_exp_4_0 = null;

        EObject lv_exp2_8_0 = null;

        EObject lv_com_12_0 = null;

        EObject lv_exp3_17_0 = null;

        EObject lv_com2_21_0 = null;

        EObject lv_com3_25_0 = null;

        EObject lv_exp4_30_0 = null;

        EObject lv_exp5_34_0 = null;

        EObject lv_com4_38_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:520:28: ( ( ( () otherlv_1= 'nop' ) | ( ( (lv_var_2_0= ruleVars ) ) otherlv_3= ':=' ( (lv_exp_4_0= ruleExprs ) ) ) | ( (otherlv_5= 'while' | otherlv_6= 'for' ) ruleLC ( (lv_exp2_8_0= ruleExpr ) ) ruleLC otherlv_10= 'do' ruleLC ( (lv_com_12_0= ruleCommandes ) ) ruleLC otherlv_14= 'od' ) | (otherlv_15= 'if' ruleLC ( (lv_exp3_17_0= ruleExpr ) ) ruleLC otherlv_19= 'then' ruleLC ( (lv_com2_21_0= ruleCommandes ) ) ruleLC (otherlv_23= 'else' ruleLC ( (lv_com3_25_0= ruleCommandes ) ) ruleLC )? otherlv_27= 'fi' ) | (otherlv_28= 'foreach' ruleLC ( (lv_exp4_30_0= ruleExpr ) ) ruleLC otherlv_32= 'in' ruleLC ( (lv_exp5_34_0= ruleExpr ) ) ruleLC otherlv_36= 'do' ruleLC ( (lv_com4_38_0= ruleCommandes ) ) ruleLC otherlv_40= 'od' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:1: ( ( () otherlv_1= 'nop' ) | ( ( (lv_var_2_0= ruleVars ) ) otherlv_3= ':=' ( (lv_exp_4_0= ruleExprs ) ) ) | ( (otherlv_5= 'while' | otherlv_6= 'for' ) ruleLC ( (lv_exp2_8_0= ruleExpr ) ) ruleLC otherlv_10= 'do' ruleLC ( (lv_com_12_0= ruleCommandes ) ) ruleLC otherlv_14= 'od' ) | (otherlv_15= 'if' ruleLC ( (lv_exp3_17_0= ruleExpr ) ) ruleLC otherlv_19= 'then' ruleLC ( (lv_com2_21_0= ruleCommandes ) ) ruleLC (otherlv_23= 'else' ruleLC ( (lv_com3_25_0= ruleCommandes ) ) ruleLC )? otherlv_27= 'fi' ) | (otherlv_28= 'foreach' ruleLC ( (lv_exp4_30_0= ruleExpr ) ) ruleLC otherlv_32= 'in' ruleLC ( (lv_exp5_34_0= ruleExpr ) ) ruleLC otherlv_36= 'do' ruleLC ( (lv_com4_38_0= ruleCommandes ) ) ruleLC otherlv_40= 'od' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:1: ( ( () otherlv_1= 'nop' ) | ( ( (lv_var_2_0= ruleVars ) ) otherlv_3= ':=' ( (lv_exp_4_0= ruleExprs ) ) ) | ( (otherlv_5= 'while' | otherlv_6= 'for' ) ruleLC ( (lv_exp2_8_0= ruleExpr ) ) ruleLC otherlv_10= 'do' ruleLC ( (lv_com_12_0= ruleCommandes ) ) ruleLC otherlv_14= 'od' ) | (otherlv_15= 'if' ruleLC ( (lv_exp3_17_0= ruleExpr ) ) ruleLC otherlv_19= 'then' ruleLC ( (lv_com2_21_0= ruleCommandes ) ) ruleLC (otherlv_23= 'else' ruleLC ( (lv_com3_25_0= ruleCommandes ) ) ruleLC )? otherlv_27= 'fi' ) | (otherlv_28= 'foreach' ruleLC ( (lv_exp4_30_0= ruleExpr ) ) ruleLC otherlv_32= 'in' ruleLC ( (lv_exp5_34_0= ruleExpr ) ) ruleLC otherlv_36= 'do' ruleLC ( (lv_com4_38_0= ruleCommandes ) ) ruleLC otherlv_40= 'od' ) )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:2: ( () otherlv_1= 'nop' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:2: ( () otherlv_1= 'nop' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:3: () otherlv_1= 'nop'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:3: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:522:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCommandeAccess().getCommandeAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleCommande1039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCommandeAccess().getNopKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:535:6: ( ( (lv_var_2_0= ruleVars ) ) otherlv_3= ':=' ( (lv_exp_4_0= ruleExprs ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:535:6: ( ( (lv_var_2_0= ruleVars ) ) otherlv_3= ':=' ( (lv_exp_4_0= ruleExprs ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:535:7: ( (lv_var_2_0= ruleVars ) ) otherlv_3= ':=' ( (lv_exp_4_0= ruleExprs ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:535:7: ( (lv_var_2_0= ruleVars ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:536:1: (lv_var_2_0= ruleVars )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:536:1: (lv_var_2_0= ruleVars )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:537:3: lv_var_2_0= ruleVars
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandeAccess().getVarVarsParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVars_in_ruleCommande1068);
                    lv_var_2_0=ruleVars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                      	        }
                             		set(
                             			current, 
                             			"var",
                              		lv_var_2_0, 
                              		"Vars");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleCommande1080); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCommandeAccess().getColonEqualsSignKeyword_1_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:1: ( (lv_exp_4_0= ruleExprs ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:1: (lv_exp_4_0= ruleExprs )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:1: (lv_exp_4_0= ruleExprs )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:559:3: lv_exp_4_0= ruleExprs
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandeAccess().getExpExprsParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprs_in_ruleCommande1101);
                    lv_exp_4_0=ruleExprs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_4_0, 
                              		"Exprs");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:576:6: ( (otherlv_5= 'while' | otherlv_6= 'for' ) ruleLC ( (lv_exp2_8_0= ruleExpr ) ) ruleLC otherlv_10= 'do' ruleLC ( (lv_com_12_0= ruleCommandes ) ) ruleLC otherlv_14= 'od' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:576:6: ( (otherlv_5= 'while' | otherlv_6= 'for' ) ruleLC ( (lv_exp2_8_0= ruleExpr ) ) ruleLC otherlv_10= 'do' ruleLC ( (lv_com_12_0= ruleCommandes ) ) ruleLC otherlv_14= 'od' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:576:7: (otherlv_5= 'while' | otherlv_6= 'for' ) ruleLC ( (lv_exp2_8_0= ruleExpr ) ) ruleLC otherlv_10= 'do' ruleLC ( (lv_com_12_0= ruleCommandes ) ) ruleLC otherlv_14= 'od'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:576:7: (otherlv_5= 'while' | otherlv_6= 'for' )
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
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:576:9: otherlv_5= 'while'
                            {
                            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleCommande1122); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getCommandeAccess().getWhileKeyword_2_0_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:581:7: otherlv_6= 'for'
                            {
                            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleCommande1140); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getCommandeAccess().getForKeyword_2_0_1());
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1160);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:596:1: ( (lv_exp2_8_0= ruleExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:597:1: (lv_exp2_8_0= ruleExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:597:1: (lv_exp2_8_0= ruleExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:598:3: lv_exp2_8_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandeAccess().getExp2ExprParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommande1180);
                    lv_exp2_8_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                      	        }
                             		set(
                             			current, 
                             			"exp2",
                              		lv_exp2_8_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_2_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1199);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleCommande1210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCommandeAccess().getDoKeyword_2_4());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_2_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1229);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:640:1: ( (lv_com_12_0= ruleCommandes ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:641:1: (lv_com_12_0= ruleCommandes )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:641:1: (lv_com_12_0= ruleCommandes )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:3: lv_com_12_0= ruleCommandes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandeAccess().getComCommandesParserRuleCall_2_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommandes_in_ruleCommande1249);
                    lv_com_12_0=ruleCommandes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                      	        }
                             		set(
                             			current, 
                             			"com",
                              		lv_com_12_0, 
                              		"Commandes");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_2_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1268);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_14=(Token)match(input,32,FOLLOW_32_in_ruleCommande1279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCommandeAccess().getOdKeyword_2_8());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:674:6: (otherlv_15= 'if' ruleLC ( (lv_exp3_17_0= ruleExpr ) ) ruleLC otherlv_19= 'then' ruleLC ( (lv_com2_21_0= ruleCommandes ) ) ruleLC (otherlv_23= 'else' ruleLC ( (lv_com3_25_0= ruleCommandes ) ) ruleLC )? otherlv_27= 'fi' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:674:6: (otherlv_15= 'if' ruleLC ( (lv_exp3_17_0= ruleExpr ) ) ruleLC otherlv_19= 'then' ruleLC ( (lv_com2_21_0= ruleCommandes ) ) ruleLC (otherlv_23= 'else' ruleLC ( (lv_com3_25_0= ruleCommandes ) ) ruleLC )? otherlv_27= 'fi' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:674:8: otherlv_15= 'if' ruleLC ( (lv_exp3_17_0= ruleExpr ) ) ruleLC otherlv_19= 'then' ruleLC ( (lv_com2_21_0= ruleCommandes ) ) ruleLC (otherlv_23= 'else' ruleLC ( (lv_com3_25_0= ruleCommandes ) ) ruleLC )? otherlv_27= 'fi'
                    {
                    otherlv_15=(Token)match(input,33,FOLLOW_33_in_ruleCommande1299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getCommandeAccess().getIfKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1318);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:1: ( (lv_exp3_17_0= ruleExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:1: (lv_exp3_17_0= ruleExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:1: (lv_exp3_17_0= ruleExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:691:3: lv_exp3_17_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandeAccess().getExp3ExprParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommande1338);
                    lv_exp3_17_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                      	        }
                             		set(
                             			current, 
                             			"exp3",
                              		lv_exp3_17_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_3_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1357);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_19=(Token)match(input,34,FOLLOW_34_in_ruleCommande1368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getCommandeAccess().getThenKeyword_3_4());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_3_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1387);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:1: ( (lv_com2_21_0= ruleCommandes ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:1: (lv_com2_21_0= ruleCommandes )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:1: (lv_com2_21_0= ruleCommandes )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:3: lv_com2_21_0= ruleCommandes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandeAccess().getCom2CommandesParserRuleCall_3_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommandes_in_ruleCommande1407);
                    lv_com2_21_0=ruleCommandes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                      	        }
                             		set(
                             			current, 
                             			"com2",
                              		lv_com2_21_0, 
                              		"Commandes");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_3_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1426);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:762:1: (otherlv_23= 'else' ruleLC ( (lv_com3_25_0= ruleCommandes ) ) ruleLC )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==35) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:762:3: otherlv_23= 'else' ruleLC ( (lv_com3_25_0= ruleCommandes ) ) ruleLC
                            {
                            otherlv_23=(Token)match(input,35,FOLLOW_35_in_ruleCommande1438); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_23, grammarAccess.getCommandeAccess().getElseKeyword_3_8_0());
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_3_8_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleLC_in_ruleCommande1457);
                            ruleLC();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:777:1: ( (lv_com3_25_0= ruleCommandes ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:778:1: (lv_com3_25_0= ruleCommandes )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:778:1: (lv_com3_25_0= ruleCommandes )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:779:3: lv_com3_25_0= ruleCommandes
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCommandeAccess().getCom3CommandesParserRuleCall_3_8_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCommandes_in_ruleCommande1477);
                            lv_com3_25_0=ruleCommandes();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"com3",
                                      		lv_com3_25_0, 
                                      		"Commandes");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_3_8_3()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleLC_in_ruleCommande1496);
                            ruleLC();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    otherlv_27=(Token)match(input,36,FOLLOW_36_in_ruleCommande1509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getCommandeAccess().getFiKeyword_3_9());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:811:6: (otherlv_28= 'foreach' ruleLC ( (lv_exp4_30_0= ruleExpr ) ) ruleLC otherlv_32= 'in' ruleLC ( (lv_exp5_34_0= ruleExpr ) ) ruleLC otherlv_36= 'do' ruleLC ( (lv_com4_38_0= ruleCommandes ) ) ruleLC otherlv_40= 'od' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:811:6: (otherlv_28= 'foreach' ruleLC ( (lv_exp4_30_0= ruleExpr ) ) ruleLC otherlv_32= 'in' ruleLC ( (lv_exp5_34_0= ruleExpr ) ) ruleLC otherlv_36= 'do' ruleLC ( (lv_com4_38_0= ruleCommandes ) ) ruleLC otherlv_40= 'od' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:811:8: otherlv_28= 'foreach' ruleLC ( (lv_exp4_30_0= ruleExpr ) ) ruleLC otherlv_32= 'in' ruleLC ( (lv_exp5_34_0= ruleExpr ) ) ruleLC otherlv_36= 'do' ruleLC ( (lv_com4_38_0= ruleCommandes ) ) ruleLC otherlv_40= 'od'
                    {
                    otherlv_28=(Token)match(input,37,FOLLOW_37_in_ruleCommande1529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getCommandeAccess().getForeachKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1548);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:826:1: ( (lv_exp4_30_0= ruleExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:827:1: (lv_exp4_30_0= ruleExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:827:1: (lv_exp4_30_0= ruleExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:828:3: lv_exp4_30_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandeAccess().getExp4ExprParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommande1568);
                    lv_exp4_30_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                      	        }
                             		set(
                             			current, 
                             			"exp4",
                              		lv_exp4_30_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_4_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1587);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_32=(Token)match(input,38,FOLLOW_38_in_ruleCommande1598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getCommandeAccess().getInKeyword_4_4());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_4_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1617);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:870:1: ( (lv_exp5_34_0= ruleExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:1: (lv_exp5_34_0= ruleExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:1: (lv_exp5_34_0= ruleExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:3: lv_exp5_34_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandeAccess().getExp5ExprParserRuleCall_4_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommande1637);
                    lv_exp5_34_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                      	        }
                             		set(
                             			current, 
                             			"exp5",
                              		lv_exp5_34_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_4_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1656);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_36=(Token)match(input,31,FOLLOW_31_in_ruleCommande1667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getCommandeAccess().getDoKeyword_4_8());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_4_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1686);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:914:1: ( (lv_com4_38_0= ruleCommandes ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:915:1: (lv_com4_38_0= ruleCommandes )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:915:1: (lv_com4_38_0= ruleCommandes )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:3: lv_com4_38_0= ruleCommandes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandeAccess().getCom4CommandesParserRuleCall_4_10_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommandes_in_ruleCommande1706);
                    lv_com4_38_0=ruleCommandes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                      	        }
                             		set(
                             			current, 
                             			"com4",
                              		lv_com4_38_0, 
                              		"Commandes");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandeAccess().getLCParserRuleCall_4_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleCommande1725);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_40=(Token)match(input,32,FOLLOW_32_in_ruleCommande1736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getCommandeAccess().getOdKeyword_4_12());
                          
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:955:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:956:2: (iv_ruleVars= ruleVars EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:957:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars1773);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars1783); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:1: ruleVars returns [EObject current=null] : ( ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )* ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_var1_0_0=null;
        Token otherlv_1=null;
        Token lv_var2_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:967:28: ( ( ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:1: ( ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:1: ( ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:2: ( (lv_var1_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:2: ( (lv_var1_0_0= RULE_VAR ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:969:1: (lv_var1_0_0= RULE_VAR )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:969:1: (lv_var1_0_0= RULE_VAR )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:970:3: lv_var1_0_0= RULE_VAR
            {
            lv_var1_0_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleVars1825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_var1_0_0, grammarAccess.getVarsAccess().getVar1VARTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVarsRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"var1",
                      		lv_var1_0_0, 
                      		"VAR");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:986:2: (otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:986:4: otherlv_1= ',' ( (lv_var2_2_0= RULE_VAR ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleVars1843); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:990:1: ( (lv_var2_2_0= RULE_VAR ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:991:1: (lv_var2_2_0= RULE_VAR )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:991:1: (lv_var2_2_0= RULE_VAR )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:3: lv_var2_2_0= RULE_VAR
            	    {
            	    lv_var2_2_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleVars1860); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_var2_2_0, grammarAccess.getVarsAccess().getVar2VARTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVarsRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"var2",
            	              		lv_var2_2_0, 
            	              		"VAR");
            	      	    
            	    }

            	    }


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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1016:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1017:2: (iv_ruleExprs= ruleExprs EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1018:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs1903);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs1913); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1025:1: ruleExprs returns [EObject current=null] : ( ( (lv_exp1_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exp2_2_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp1_0_0 = null;

        EObject lv_exp2_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1028:28: ( ( ( (lv_exp1_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exp2_2_0= ruleExpr ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1029:1: ( ( (lv_exp1_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exp2_2_0= ruleExpr ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1029:1: ( ( (lv_exp1_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exp2_2_0= ruleExpr ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1029:2: ( (lv_exp1_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exp2_2_0= ruleExpr ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1029:2: ( (lv_exp1_0_0= ruleExpr ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:1: (lv_exp1_0_0= ruleExpr )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:1: (lv_exp1_0_0= ruleExpr )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1031:3: lv_exp1_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprsAccess().getExp1ExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleExprs1959);
            lv_exp1_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExprsRule());
              	        }
                     		set(
                     			current, 
                     			"exp1",
                      		lv_exp1_0_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1047:2: (otherlv_1= ',' ( (lv_exp2_2_0= ruleExpr ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1047:4: otherlv_1= ',' ( (lv_exp2_2_0= ruleExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleExprs1972); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1051:1: ( (lv_exp2_2_0= ruleExpr ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1052:1: (lv_exp2_2_0= ruleExpr )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1052:1: (lv_exp2_2_0= ruleExpr )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:3: lv_exp2_2_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprsAccess().getExp2ExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprs1993);
            	    lv_exp2_2_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"exp2",
            	              		lv_exp2_2_0, 
            	              		"Expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1078:2: (iv_ruleExpr= ruleExpr EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2031);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2041); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1086:1: ruleExpr returns [EObject current=null] : ( ( (lv_expA_0_0= ruleExprAnd ) ) | ( (lv_expS_1_0= ruleExprSimple ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expA_0_0 = null;

        EObject lv_expS_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1089:28: ( ( ( (lv_expA_0_0= ruleExprAnd ) ) | ( (lv_expS_1_0= ruleExprSimple ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1090:1: ( ( (lv_expA_0_0= ruleExprAnd ) ) | ( (lv_expS_1_0= ruleExprSimple ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1090:1: ( ( (lv_expA_0_0= ruleExprAnd ) ) | ( (lv_expS_1_0= ruleExprSimple ) ) )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1090:2: ( (lv_expA_0_0= ruleExprAnd ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1090:2: ( (lv_expA_0_0= ruleExprAnd ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:1: (lv_expA_0_0= ruleExprAnd )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:1: (lv_expA_0_0= ruleExprAnd )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:3: lv_expA_0_0= ruleExprAnd
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAccess().getExpAExprAndParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprAnd_in_ruleExpr2087);
                    lv_expA_0_0=ruleExprAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprRule());
                      	        }
                             		set(
                             			current, 
                             			"expA",
                              		lv_expA_0_0, 
                              		"ExprAnd");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:6: ( (lv_expS_1_0= ruleExprSimple ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:6: ( (lv_expS_1_0= ruleExprSimple ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1110:1: (lv_expS_1_0= ruleExprSimple )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1110:1: (lv_expS_1_0= ruleExprSimple )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1111:3: lv_expS_1_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAccess().getExpSExprSimpleParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExpr2114);
                    lv_expS_1_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprRule());
                      	        }
                             		set(
                             			current, 
                             			"expS",
                              		lv_expS_1_0, 
                              		"ExprSimple");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSimple"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1135:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1136:2: (iv_ruleExprSimple= ruleExprSimple EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1137:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple2150);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple2160); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1144:1: ruleExprSimple returns [EObject current=null] : ( ( () otherlv_1= 'nil' ) | ( (lv_var_2_0= RULE_VAR ) ) | ( (lv_symbole_3_0= RULE_SYM ) ) | (this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD ) | (this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD ) | (this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD ) | (this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD ) | (this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD ) ) ;
    public final EObject ruleExprSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_var_2_0=null;
        Token lv_symbole_3_0=null;
        Token this_PARAG_4=null;
        Token otherlv_5=null;
        Token this_PARAD_7=null;
        Token this_PARAG_8=null;
        Token otherlv_9=null;
        Token this_PARAD_11=null;
        Token this_PARAG_12=null;
        Token otherlv_13=null;
        Token this_PARAD_16=null;
        Token this_PARAG_17=null;
        Token otherlv_18=null;
        Token this_PARAD_21=null;
        Token this_PARAG_22=null;
        Token this_SYM_23=null;
        Token this_PARAD_25=null;
        EObject lv_le_6_0 = null;

        EObject lv_le2_10_0 = null;

        EObject lv_le3_15_0 = null;

        EObject lv_le4_20_0 = null;

        EObject lv_le5_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1147:28: ( ( ( () otherlv_1= 'nil' ) | ( (lv_var_2_0= RULE_VAR ) ) | ( (lv_symbole_3_0= RULE_SYM ) ) | (this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD ) | (this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD ) | (this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD ) | (this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD ) | (this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:1: ( ( () otherlv_1= 'nil' ) | ( (lv_var_2_0= RULE_VAR ) ) | ( (lv_symbole_3_0= RULE_SYM ) ) | (this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD ) | (this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD ) | (this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD ) | (this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD ) | (this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:1: ( ( () otherlv_1= 'nil' ) | ( (lv_var_2_0= RULE_VAR ) ) | ( (lv_symbole_3_0= RULE_SYM ) ) | (this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD ) | (this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD ) | (this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD ) | (this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD ) | (this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD ) )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:2: ( () otherlv_1= 'nil' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:2: ( () otherlv_1= 'nil' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:3: () otherlv_1= 'nil'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:3: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExprSimpleAccess().getExprSimpleAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleExprSimple2210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExprSimpleAccess().getNilKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1162:6: ( (lv_var_2_0= RULE_VAR ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1162:6: ( (lv_var_2_0= RULE_VAR ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1163:1: (lv_var_2_0= RULE_VAR )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1163:1: (lv_var_2_0= RULE_VAR )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1164:3: lv_var_2_0= RULE_VAR
                    {
                    lv_var_2_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleExprSimple2234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_var_2_0, grammarAccess.getExprSimpleAccess().getVarVARTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExprSimpleRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"var",
                              		lv_var_2_0, 
                              		"VAR");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1181:6: ( (lv_symbole_3_0= RULE_SYM ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1181:6: ( (lv_symbole_3_0= RULE_SYM ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1182:1: (lv_symbole_3_0= RULE_SYM )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1182:1: (lv_symbole_3_0= RULE_SYM )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1183:3: lv_symbole_3_0= RULE_SYM
                    {
                    lv_symbole_3_0=(Token)match(input,RULE_SYM,FOLLOW_RULE_SYM_in_ruleExprSimple2262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_symbole_3_0, grammarAccess.getExprSimpleAccess().getSymboleSYMTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExprSimpleRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"symbole",
                              		lv_symbole_3_0, 
                              		"SYM");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1200:6: (this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1200:6: (this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1200:7: this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD
                    {
                    this_PARAG_4=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple2285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_4, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_3_0()); 
                          
                    }
                    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleExprSimple2296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getExprSimpleAccess().getConsKeyword_3_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1208:1: ( (lv_le_6_0= ruleLExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1209:1: (lv_le_6_0= ruleLExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1209:1: (lv_le_6_0= ruleLExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1210:3: lv_le_6_0= ruleLExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getLeLExprParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLExpr_in_ruleExprSimple2317);
                    lv_le_6_0=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"le",
                              		lv_le_6_0, 
                              		"LExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_PARAD_7=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple2328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_7, grammarAccess.getExprSimpleAccess().getPARADTerminalRuleCall_3_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1231:6: (this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1231:6: (this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1231:7: this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD
                    {
                    this_PARAG_8=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple2346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_8, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_4_0()); 
                          
                    }
                    otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleExprSimple2357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getExprSimpleAccess().getListKeyword_4_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1239:1: ( (lv_le2_10_0= ruleLExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1240:1: (lv_le2_10_0= ruleLExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1240:1: (lv_le2_10_0= ruleLExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1241:3: lv_le2_10_0= ruleLExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getLe2LExprParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLExpr_in_ruleExprSimple2378);
                    lv_le2_10_0=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"le2",
                              		lv_le2_10_0, 
                              		"LExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_PARAD_11=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple2389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_11, grammarAccess.getExprSimpleAccess().getPARADTerminalRuleCall_4_3()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1262:6: (this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1262:6: (this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1262:7: this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD
                    {
                    this_PARAG_12=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple2407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_12, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_5_0()); 
                          
                    }
                    otherlv_13=(Token)match(input,42,FOLLOW_42_in_ruleExprSimple2418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getExprSimpleAccess().getHdKeyword_5_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprSimpleAccess().getLCParserRuleCall_5_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleExprSimple2437);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1281:1: ( (lv_le3_15_0= ruleExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1282:1: (lv_le3_15_0= ruleExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1282:1: (lv_le3_15_0= ruleExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1283:3: lv_le3_15_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getLe3ExprParserRuleCall_5_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple2457);
                    lv_le3_15_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"le3",
                              		lv_le3_15_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_PARAD_16=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple2468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_16, grammarAccess.getExprSimpleAccess().getPARADTerminalRuleCall_5_4()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1304:6: (this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1304:6: (this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1304:7: this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD
                    {
                    this_PARAG_17=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple2486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_17, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_6_0()); 
                          
                    }
                    otherlv_18=(Token)match(input,43,FOLLOW_43_in_ruleExprSimple2497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getExprSimpleAccess().getTlKeyword_6_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprSimpleAccess().getLCParserRuleCall_6_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleExprSimple2516);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1323:1: ( (lv_le4_20_0= ruleExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1324:1: (lv_le4_20_0= ruleExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1324:1: (lv_le4_20_0= ruleExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1325:3: lv_le4_20_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getLe4ExprParserRuleCall_6_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple2536);
                    lv_le4_20_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"le4",
                              		lv_le4_20_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_PARAD_21=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple2547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_21, grammarAccess.getExprSimpleAccess().getPARADTerminalRuleCall_6_4()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1346:6: (this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1346:6: (this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1346:7: this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD
                    {
                    this_PARAG_22=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple2565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_22, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_7_0()); 
                          
                    }
                    this_SYM_23=(Token)match(input,RULE_SYM,FOLLOW_RULE_SYM_in_ruleExprSimple2575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SYM_23, grammarAccess.getExprSimpleAccess().getSYMTerminalRuleCall_7_1()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1354:1: ( (lv_le5_24_0= ruleLExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1355:1: (lv_le5_24_0= ruleLExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1355:1: (lv_le5_24_0= ruleLExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1356:3: lv_le5_24_0= ruleLExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getLe5LExprParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLExpr_in_ruleExprSimple2595);
                    lv_le5_24_0=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"le5",
                              		lv_le5_24_0, 
                              		"LExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_PARAD_25=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple2606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_25, grammarAccess.getExprSimpleAccess().getPARADTerminalRuleCall_7_3()); 
                          
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1384:1: entryRuleLExpr returns [EObject current=null] : iv_ruleLExpr= ruleLExpr EOF ;
    public final EObject entryRuleLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExpr = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:2: (iv_ruleLExpr= ruleLExpr EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1386:2: iv_ruleLExpr= ruleLExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLExprRule()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_entryRuleLExpr2642);
            iv_ruleLExpr=ruleLExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLExpr2652); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1393:1: ruleLExpr returns [EObject current=null] : ( ruleLC ( (lv_exp_1_0= ruleExpr ) ) )+ ;
    public final EObject ruleLExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1396:28: ( ( ruleLC ( (lv_exp_1_0= ruleExpr ) ) )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1397:1: ( ruleLC ( (lv_exp_1_0= ruleExpr ) ) )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1397:1: ( ruleLC ( (lv_exp_1_0= ruleExpr ) ) )+
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
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1398:2: ruleLC ( (lv_exp_1_0= ruleExpr ) )
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getLExprAccess().getLCParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleLExpr2696);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1408:1: ( (lv_exp_1_0= ruleExpr ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1409:1: (lv_exp_1_0= ruleExpr )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1409:1: (lv_exp_1_0= ruleExpr )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1410:3: lv_exp_1_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLExprAccess().getExpExprParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleLExpr2716);
            	    lv_exp_1_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLExprRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"exp",
            	              		lv_exp_1_0, 
            	              		"Expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1434:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1435:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1436:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd2753);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd2763); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1443:1: ruleExprAnd returns [EObject current=null] : ( ( (lv_expO_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expO2_4_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expO_0_0 = null;

        EObject lv_expO2_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1446:28: ( ( ( (lv_expO_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expO2_4_0= ruleExprOr ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1447:1: ( ( (lv_expO_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expO2_4_0= ruleExprOr ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1447:1: ( ( (lv_expO_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expO2_4_0= ruleExprOr ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1447:2: ( (lv_expO_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expO2_4_0= ruleExprOr ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1447:2: ( (lv_expO_0_0= ruleExprOr ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1448:1: (lv_expO_0_0= ruleExprOr )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1448:1: (lv_expO_0_0= ruleExprOr )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1449:3: lv_expO_0_0= ruleExprOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprAndAccess().getExpOExprOrParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd2809);
            lv_expO_0_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExprAndRule());
              	        }
                     		set(
                     			current, 
                     			"expO",
                      		lv_expO_0_0, 
                      		"ExprOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1465:2: ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expO2_4_0= ruleExprOr ) ) )*
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
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1466:2: ruleLC otherlv_2= 'and' ruleLC ( (lv_expO2_4_0= ruleExprOr ) )
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprAnd2829);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleExprAnd2840); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getExprAndAccess().getAndKeyword_1_1());
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprAnd2859);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1491:1: ( (lv_expO2_4_0= ruleExprOr ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1492:1: (lv_expO2_4_0= ruleExprOr )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1492:1: (lv_expO2_4_0= ruleExprOr )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1493:3: lv_expO2_4_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAndAccess().getExpO2ExprOrParserRuleCall_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd2879);
            	    lv_expO2_4_0=ruleExprOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprAndRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expO2",
            	              		lv_expO2_4_0, 
            	              		"ExprOr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1517:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1519:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr2917);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr2927); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1526:1: ruleExprOr returns [EObject current=null] : ( ( (lv_expN_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expN2_4_0= ruleExprNot ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expN_0_0 = null;

        EObject lv_expN2_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1529:28: ( ( ( (lv_expN_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expN2_4_0= ruleExprNot ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:1: ( ( (lv_expN_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expN2_4_0= ruleExprNot ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:1: ( ( (lv_expN_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expN2_4_0= ruleExprNot ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:2: ( (lv_expN_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expN2_4_0= ruleExprNot ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:2: ( (lv_expN_0_0= ruleExprNot ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1531:1: (lv_expN_0_0= ruleExprNot )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1531:1: (lv_expN_0_0= ruleExprNot )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1532:3: lv_expN_0_0= ruleExprNot
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprOrAccess().getExpNExprNotParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprNot_in_ruleExprOr2973);
            lv_expN_0_0=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExprOrRule());
              	        }
                     		set(
                     			current, 
                     			"expN",
                      		lv_expN_0_0, 
                      		"ExprNot");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1548:2: ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expN2_4_0= ruleExprNot ) ) )*
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
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1549:2: ruleLC otherlv_2= 'or' ruleLC ( (lv_expN2_4_0= ruleExprNot ) )
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprOr2993);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleExprOr3004); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getExprOrAccess().getOrKeyword_1_1());
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprOr3023);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1574:1: ( (lv_expN2_4_0= ruleExprNot ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1575:1: (lv_expN2_4_0= ruleExprNot )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1575:1: (lv_expN2_4_0= ruleExprNot )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1576:3: lv_expN2_4_0= ruleExprNot
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprOrAccess().getExpN2ExprNotParserRuleCall_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprNot_in_ruleExprOr3043);
            	    lv_expN2_4_0=ruleExprNot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprOrRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expN2",
            	              		lv_expN2_4_0, 
            	              		"ExprNot");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1600:1: entryRuleExprNot returns [EObject current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final EObject entryRuleExprNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprNot = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1601:2: (iv_ruleExprNot= ruleExprNot EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1602:2: iv_ruleExprNot= ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_entryRuleExprNot3081);
            iv_ruleExprNot=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprNot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNot3091); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1609:1: ruleExprNot returns [EObject current=null] : ( (otherlv_0= 'not' ruleLC )? ( (lv_expEq_2_0= ruleExprEq ) ) ) ;
    public final EObject ruleExprNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expEq_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1612:28: ( ( (otherlv_0= 'not' ruleLC )? ( (lv_expEq_2_0= ruleExprEq ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:1: ( (otherlv_0= 'not' ruleLC )? ( (lv_expEq_2_0= ruleExprEq ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:1: ( (otherlv_0= 'not' ruleLC )? ( (lv_expEq_2_0= ruleExprEq ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:2: (otherlv_0= 'not' ruleLC )? ( (lv_expEq_2_0= ruleExprEq ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:2: (otherlv_0= 'not' ruleLC )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:4: otherlv_0= 'not' ruleLC
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleExprNot3129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getExprNotAccess().getNotKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprNotAccess().getLCParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleExprNot3148);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1628:3: ( (lv_expEq_2_0= ruleExprEq ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1629:1: (lv_expEq_2_0= ruleExprEq )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1629:1: (lv_expEq_2_0= ruleExprEq )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1630:3: lv_expEq_2_0= ruleExprEq
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprNotAccess().getExpEqExprEqParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprEq_in_ruleExprNot3170);
            lv_expEq_2_0=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExprNotRule());
              	        }
                     		set(
                     			current, 
                     			"expEq",
                      		lv_expEq_2_0, 
                      		"ExprEq");
              	        afterParserOrEnumRuleCall();
              	    
            }

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
    // $ANTLR end "ruleExprNot"


    // $ANTLR start "entryRuleExprEq"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1654:1: entryRuleExprEq returns [EObject current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final EObject entryRuleExprEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEq = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1655:2: (iv_ruleExprEq= ruleExprEq EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1656:2: iv_ruleExprEq= ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_entryRuleExprEq3206);
            iv_ruleExprEq=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEq; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEq3216); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1663:1: ruleExprEq returns [EObject current=null] : ( ( ( (lv_ExpS_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_ExpS2_2_0= ruleExprSimple ) ) ) | (this_PARAG_3= RULE_PARAG ( (lv_exp_4_0= ruleExpr ) ) this_PARAD_5= RULE_PARAD ) ) ;
    public final EObject ruleExprEq() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_PARAG_3=null;
        Token this_PARAD_5=null;
        EObject lv_ExpS_0_0 = null;

        EObject lv_ExpS2_2_0 = null;

        EObject lv_exp_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1666:28: ( ( ( ( (lv_ExpS_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_ExpS2_2_0= ruleExprSimple ) ) ) | (this_PARAG_3= RULE_PARAG ( (lv_exp_4_0= ruleExpr ) ) this_PARAD_5= RULE_PARAD ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1667:1: ( ( ( (lv_ExpS_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_ExpS2_2_0= ruleExprSimple ) ) ) | (this_PARAG_3= RULE_PARAG ( (lv_exp_4_0= ruleExpr ) ) this_PARAD_5= RULE_PARAD ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1667:1: ( ( ( (lv_ExpS_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_ExpS2_2_0= ruleExprSimple ) ) ) | (this_PARAG_3= RULE_PARAG ( (lv_exp_4_0= ruleExpr ) ) this_PARAD_5= RULE_PARAD ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_SYM && LA17_0<=RULE_VAR)||LA17_0==39) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_PARAG) ) {
                switch ( input.LA(2) ) {
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
                case RULE_SYM:
                    {
                    int LA17_4 = input.LA(3);

                    if ( ((LA17_4>=RULE_CR && LA17_4<=RULE_PARAG)||(LA17_4>=RULE_SP && LA17_4<=RULE_LF)||LA17_4==39||LA17_4==46) ) {
                        alt17=1;
                    }
                    else if ( (LA17_4==RULE_PARAD||LA17_4==47) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 4, input);

                        throw nvae;
                    }
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1667:2: ( ( (lv_ExpS_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_ExpS2_2_0= ruleExprSimple ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1667:2: ( ( (lv_ExpS_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_ExpS2_2_0= ruleExprSimple ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1667:3: ( (lv_ExpS_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_ExpS2_2_0= ruleExprSimple ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1667:3: ( (lv_ExpS_0_0= ruleExprSimple ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1668:1: (lv_ExpS_0_0= ruleExprSimple )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1668:1: (lv_ExpS_0_0= ruleExprSimple )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1669:3: lv_ExpS_0_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExpSExprSimpleParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExprEq3263);
                    lv_ExpS_0_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprEqRule());
                      	        }
                             		set(
                             			current, 
                             			"ExpS",
                              		lv_ExpS_0_0, 
                              		"ExprSimple");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleExprEq3275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1689:1: ( (lv_ExpS2_2_0= ruleExprSimple ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1690:1: (lv_ExpS2_2_0= ruleExprSimple )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1690:1: (lv_ExpS2_2_0= ruleExprSimple )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1691:3: lv_ExpS2_2_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExpS2ExprSimpleParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExprEq3296);
                    lv_ExpS2_2_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprEqRule());
                      	        }
                             		set(
                             			current, 
                             			"ExpS2",
                              		lv_ExpS2_2_0, 
                              		"ExprSimple");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:6: (this_PARAG_3= RULE_PARAG ( (lv_exp_4_0= ruleExpr ) ) this_PARAD_5= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:6: (this_PARAG_3= RULE_PARAG ( (lv_exp_4_0= ruleExpr ) ) this_PARAD_5= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:7: this_PARAG_3= RULE_PARAG ( (lv_exp_4_0= ruleExpr ) ) this_PARAD_5= RULE_PARAD
                    {
                    this_PARAG_3=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprEq3315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_3, grammarAccess.getExprEqAccess().getPARAGTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1712:1: ( (lv_exp_4_0= ruleExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1713:1: (lv_exp_4_0= ruleExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1713:1: (lv_exp_4_0= ruleExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1714:3: lv_exp_4_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExpExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprEq3335);
                    lv_exp_4_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprEqRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_4_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_PARAD_5=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprEq3346); if (state.failed) return current;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1742:1: entryRuleLC returns [String current=null] : iv_ruleLC= ruleLC EOF ;
    public final String entryRuleLC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLC = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1743:2: (iv_ruleLC= ruleLC EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1744:2: iv_ruleLC= ruleLC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLCRule()); 
            }
            pushFollow(FOLLOW_ruleLC_in_entryRuleLC3383);
            iv_ruleLC=ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLC.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLC3394); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1751:1: ruleLC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )? ;
    public final AntlrDatatypeRuleToken ruleLC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SP_0=null;
        Token this_CR_1=null;
        Token this_TAB_2=null;
        Token this_LF_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1754:28: ( (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1755:1: (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1755:1: (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )?
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1755:6: this_SP_0= RULE_SP
                    {
                    this_SP_0=(Token)match(input,RULE_SP,FOLLOW_RULE_SP_in_ruleLC3434); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SP_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SP_0, grammarAccess.getLCAccess().getSPTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1763:10: this_CR_1= RULE_CR
                    {
                    this_CR_1=(Token)match(input,RULE_CR,FOLLOW_RULE_CR_in_ruleLC3460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CR_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CR_1, grammarAccess.getLCAccess().getCRTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1771:10: this_TAB_2= RULE_TAB
                    {
                    this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleLC3486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TAB_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TAB_2, grammarAccess.getLCAccess().getTABTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1779:10: this_LF_3= RULE_LF
                    {
                    this_LF_3=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleLC3512); if (state.failed) return current;
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
        EObject lv_expA_0_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1090:2: ( ( (lv_expA_0_0= ruleExprAnd ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1090:2: ( (lv_expA_0_0= ruleExprAnd ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1090:2: ( (lv_expA_0_0= ruleExprAnd ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:1: (lv_expA_0_0= ruleExprAnd )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:1: (lv_expA_0_0= ruleExprAnd )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:3: lv_expA_0_0= ruleExprAnd
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExprAccess().getExpAExprAndParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExprAnd_in_synpred14_InternalMyDsl2087);
        lv_expA_0_0=ruleExprAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


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
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\6\1\7\1\10\1\5";
    static final String DFA12_specialS =
        "\12\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\3\1\2\1\4\37\uffff\1\1",
            "",
            "",
            "",
            "\1\10\42\uffff\1\5\1\11\1\6\1\7",
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
            return "1148:1: ( ( () otherlv_1= 'nil' ) | ( (lv_var_2_0= RULE_VAR ) ) | ( (lv_symbole_3_0= RULE_SYM ) ) | (this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD ) | (this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD ) | (this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD ) | (this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD ) | (this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgramme_in_ruleModel136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgramme_in_entryRuleProgramme171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgramme181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFonction_in_ruleProgramme240 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_RULE_CR_in_ruleProgramme252 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_ruleFonction_in_entryRuleFonction291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFonction301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFonction338 = new BitSet(new long[]{0x0000000000000E30L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFonction357 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SYM_in_ruleFonction373 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFonction390 = new BitSet(new long[]{0x0000000000400E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFonction409 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFonction420 = new BitSet(new long[]{0x0000000000000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFonction439 = new BitSet(new long[]{0x0000000000000E50L});
    public static final BitSet FOLLOW_ruleInput_in_ruleFonction459 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFonction471 = new BitSet(new long[]{0x0000002268000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleFonction492 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFonction504 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFonction516 = new BitSet(new long[]{0x0000000000000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFonction535 = new BitSet(new long[]{0x0000000000000E50L});
    public static final BitSet FOLLOW_ruleOutput_in_ruleFonction555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleInput643 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleInput661 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleInput678 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleOutput773 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleOutput791 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleOutput808 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleCommandes_in_entryRuleCommandes851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandes861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommande_in_ruleCommandes907 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleCommandes920 = new BitSet(new long[]{0x0000002268000040L});
    public static final BitSet FOLLOW_ruleCommande_in_ruleCommandes941 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleCommande_in_entryRuleCommande979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommande989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCommande1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_ruleCommande1068 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCommande1080 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExprs_in_ruleCommande1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCommande1122 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_30_in_ruleCommande1140 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1160 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommande1180 = new BitSet(new long[]{0x0000000080000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1199 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCommande1210 = new BitSet(new long[]{0x0000002268000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1229 = new BitSet(new long[]{0x0000002268000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleCommande1249 = new BitSet(new long[]{0x0000000100000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1268 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCommande1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCommande1299 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1318 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommande1338 = new BitSet(new long[]{0x0000000400000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1357 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCommande1368 = new BitSet(new long[]{0x0000002268000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1387 = new BitSet(new long[]{0x0000002268000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleCommande1407 = new BitSet(new long[]{0x0000001800000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1426 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleCommande1438 = new BitSet(new long[]{0x0000002268000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1457 = new BitSet(new long[]{0x0000002268000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleCommande1477 = new BitSet(new long[]{0x0000001000000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1496 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleCommande1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCommande1529 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1548 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommande1568 = new BitSet(new long[]{0x0000004000000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1587 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCommande1598 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1617 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommande1637 = new BitSet(new long[]{0x0000000080000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1656 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCommande1667 = new BitSet(new long[]{0x0000002268000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1686 = new BitSet(new long[]{0x0000002268000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleCommande1706 = new BitSet(new long[]{0x0000000100000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleCommande1725 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCommande1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars1773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleVars1825 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleVars1843 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleVars1860 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs1903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs1959 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleExprs1972 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs1993 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExpr2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExpr2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple2150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExprSimple2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleExprSimple2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_ruleExprSimple2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple2285 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleExprSimple2296 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLExpr_in_ruleExprSimple2317 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple2346 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleExprSimple2357 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLExpr_in_ruleExprSimple2378 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple2407 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleExprSimple2418 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprSimple2437 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple2457 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple2486 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleExprSimple2497 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprSimple2516 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple2536 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple2565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SYM_in_ruleExprSimple2575 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLExpr_in_ruleExprSimple2595 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_entryRuleLExpr2642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLExpr2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_ruleLExpr2696 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleLExpr2716 = new BitSet(new long[]{0x0000408000000EF2L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd2753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2809 = new BitSet(new long[]{0x0000100000000E12L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprAnd2829 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleExprAnd2840 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprAnd2859 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2879 = new BitSet(new long[]{0x0000100000000E12L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr2917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_ruleExprOr2973 = new BitSet(new long[]{0x0000200000000E12L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprOr2993 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleExprOr3004 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprOr3023 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExprNot_in_ruleExprOr3043 = new BitSet(new long[]{0x0000200000000E12L});
    public static final BitSet FOLLOW_ruleExprNot_in_entryRuleExprNot3081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNot3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleExprNot3129 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprNot3148 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExprEq_in_ruleExprNot3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_entryRuleExprEq3206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEq3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExprEq3263 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleExprEq3275 = new BitSet(new long[]{0x00000080000000E0L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExprEq3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprEq3315 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprEq3335 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprEq3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_entryRuleLC3383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLC3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_ruleLC3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_ruleLC3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleLC3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleLC3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_synpred14_InternalMyDsl2087 = new BitSet(new long[]{0x0000000000000002L});

}