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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CR", "RULE_SYM", "RULE_VAR", "RULE_PARAG", "RULE_PARAD", "RULE_SP", "RULE_TAB", "RULE_LF", "RULE_CONF", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fonction'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'while'", "'do'", "'od'", "'for'", "'if'", "'then'", "'else'", "'fi'", "'foreach'", "'in'", "'nil'", "'cons'", "'list'", "'hd'", "'tl'", "'and'", "'or'", "'not'", "'=?'"
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:517:1: ruleCommande returns [EObject current=null] : ( ( () ( (lv_nop_1_0= 'nop' ) ) ) | ( (lv_affectVar_2_0= ruleAffectVar ) ) | ( (lv_whileC_3_0= ruleWhile ) ) | ( (lv_forC_4_0= ruleFor ) ) | ( (lv_ifC_5_0= ruleIf ) ) | ( (lv_foreachC_6_0= ruleForeach ) ) ) ;
    public final EObject ruleCommande() throws RecognitionException {
        EObject current = null;

        Token lv_nop_1_0=null;
        EObject lv_affectVar_2_0 = null;

        EObject lv_whileC_3_0 = null;

        EObject lv_forC_4_0 = null;

        EObject lv_ifC_5_0 = null;

        EObject lv_foreachC_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:520:28: ( ( ( () ( (lv_nop_1_0= 'nop' ) ) ) | ( (lv_affectVar_2_0= ruleAffectVar ) ) | ( (lv_whileC_3_0= ruleWhile ) ) | ( (lv_forC_4_0= ruleFor ) ) | ( (lv_ifC_5_0= ruleIf ) ) | ( (lv_foreachC_6_0= ruleForeach ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:1: ( ( () ( (lv_nop_1_0= 'nop' ) ) ) | ( (lv_affectVar_2_0= ruleAffectVar ) ) | ( (lv_whileC_3_0= ruleWhile ) ) | ( (lv_forC_4_0= ruleFor ) ) | ( (lv_ifC_5_0= ruleIf ) ) | ( (lv_foreachC_6_0= ruleForeach ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:1: ( ( () ( (lv_nop_1_0= 'nop' ) ) ) | ( (lv_affectVar_2_0= ruleAffectVar ) ) | ( (lv_whileC_3_0= ruleWhile ) ) | ( (lv_forC_4_0= ruleFor ) ) | ( (lv_ifC_5_0= ruleIf ) ) | ( (lv_foreachC_6_0= ruleForeach ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case RULE_VAR:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 32:
                {
                alt6=4;
                }
                break;
            case 33:
                {
                alt6=5;
                }
                break;
            case 37:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:2: ( () ( (lv_nop_1_0= 'nop' ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:2: ( () ( (lv_nop_1_0= 'nop' ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:3: () ( (lv_nop_1_0= 'nop' ) )
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

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:530:2: ( (lv_nop_1_0= 'nop' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:531:1: (lv_nop_1_0= 'nop' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:531:1: (lv_nop_1_0= 'nop' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:532:3: lv_nop_1_0= 'nop'
                    {
                    lv_nop_1_0=(Token)match(input,27,FOLLOW_27_in_ruleCommande1045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nop_1_0, grammarAccess.getCommandeAccess().getNopNopKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCommandeRule());
                      	        }
                             		setWithLastConsumed(current, "nop", lv_nop_1_0, "nop");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:546:6: ( (lv_affectVar_2_0= ruleAffectVar ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:546:6: ( (lv_affectVar_2_0= ruleAffectVar ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:547:1: (lv_affectVar_2_0= ruleAffectVar )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:547:1: (lv_affectVar_2_0= ruleAffectVar )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:548:3: lv_affectVar_2_0= ruleAffectVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandeAccess().getAffectVarAffectVarParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAffectVar_in_ruleCommande1086);
                    lv_affectVar_2_0=ruleAffectVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                      	        }
                             		set(
                             			current, 
                             			"affectVar",
                              		lv_affectVar_2_0, 
                              		"AffectVar");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:565:6: ( (lv_whileC_3_0= ruleWhile ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:565:6: ( (lv_whileC_3_0= ruleWhile ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:1: (lv_whileC_3_0= ruleWhile )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:1: (lv_whileC_3_0= ruleWhile )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:567:3: lv_whileC_3_0= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandeAccess().getWhileCWhileParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhile_in_ruleCommande1113);
                    lv_whileC_3_0=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                      	        }
                             		set(
                             			current, 
                             			"whileC",
                              		lv_whileC_3_0, 
                              		"While");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:584:6: ( (lv_forC_4_0= ruleFor ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:584:6: ( (lv_forC_4_0= ruleFor ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:585:1: (lv_forC_4_0= ruleFor )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:585:1: (lv_forC_4_0= ruleFor )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:586:3: lv_forC_4_0= ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandeAccess().getForCForParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFor_in_ruleCommande1140);
                    lv_forC_4_0=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                      	        }
                             		set(
                             			current, 
                             			"forC",
                              		lv_forC_4_0, 
                              		"For");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:6: ( (lv_ifC_5_0= ruleIf ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:6: ( (lv_ifC_5_0= ruleIf ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:604:1: (lv_ifC_5_0= ruleIf )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:604:1: (lv_ifC_5_0= ruleIf )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:3: lv_ifC_5_0= ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandeAccess().getIfCIfParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIf_in_ruleCommande1167);
                    lv_ifC_5_0=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                      	        }
                             		set(
                             			current, 
                             			"ifC",
                              		lv_ifC_5_0, 
                              		"If");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:622:6: ( (lv_foreachC_6_0= ruleForeach ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:622:6: ( (lv_foreachC_6_0= ruleForeach ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:623:1: (lv_foreachC_6_0= ruleForeach )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:623:1: (lv_foreachC_6_0= ruleForeach )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:624:3: lv_foreachC_6_0= ruleForeach
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandeAccess().getForeachCForeachParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForeach_in_ruleCommande1194);
                    lv_foreachC_6_0=ruleForeach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandeRule());
                      	        }
                             		set(
                             			current, 
                             			"foreachC",
                              		lv_foreachC_6_0, 
                              		"Foreach");
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
    // $ANTLR end "ruleCommande"


    // $ANTLR start "entryRuleAffectVar"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:1: entryRuleAffectVar returns [EObject current=null] : iv_ruleAffectVar= ruleAffectVar EOF ;
    public final EObject entryRuleAffectVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectVar = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:649:2: (iv_ruleAffectVar= ruleAffectVar EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:650:2: iv_ruleAffectVar= ruleAffectVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectVarRule()); 
            }
            pushFollow(FOLLOW_ruleAffectVar_in_entryRuleAffectVar1230);
            iv_ruleAffectVar=ruleAffectVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectVar1240); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAffectVar"


    // $ANTLR start "ruleAffectVar"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:657:1: ruleAffectVar returns [EObject current=null] : ( ( (lv_var1_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) ) ;
    public final EObject ruleAffectVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var1_0_0 = null;

        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:28: ( ( ( (lv_var1_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:1: ( ( (lv_var1_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:1: ( ( (lv_var1_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:2: ( (lv_var1_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:2: ( (lv_var1_0_0= ruleVars ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:662:1: (lv_var1_0_0= ruleVars )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:662:1: (lv_var1_0_0= ruleVars )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:663:3: lv_var1_0_0= ruleVars
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectVarAccess().getVar1VarsParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVars_in_ruleAffectVar1286);
            lv_var1_0_0=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectVarRule());
              	        }
                     		set(
                     			current, 
                     			"var1",
                      		lv_var1_0_0, 
                      		"Vars");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleAffectVar1298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAffectVarAccess().getColonEqualsSignKeyword_1());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:1: ( (lv_exp_2_0= ruleExprs ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:684:1: (lv_exp_2_0= ruleExprs )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:684:1: (lv_exp_2_0= ruleExprs )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:685:3: lv_exp_2_0= ruleExprs
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectVarAccess().getExpExprsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprs_in_ruleAffectVar1319);
            lv_exp_2_0=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectVarRule());
              	        }
                     		set(
                     			current, 
                     			"exp",
                      		lv_exp_2_0, 
                      		"Exprs");
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
    // $ANTLR end "ruleAffectVar"


    // $ANTLR start "entryRuleWhile"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:709:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:710:2: (iv_ruleWhile= ruleWhile EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:711:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile1355);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile1365); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:718:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ruleLC ( (lv_exp2_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_com3_6_0= ruleCommandes ) ) ruleLC otherlv_8= 'od' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_exp2_2_0 = null;

        EObject lv_com3_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:721:28: ( (otherlv_0= 'while' ruleLC ( (lv_exp2_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_com3_6_0= ruleCommandes ) ) ruleLC otherlv_8= 'od' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:722:1: (otherlv_0= 'while' ruleLC ( (lv_exp2_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_com3_6_0= ruleCommandes ) ) ruleLC otherlv_8= 'od' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:722:1: (otherlv_0= 'while' ruleLC ( (lv_exp2_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_com3_6_0= ruleCommandes ) ) ruleLC otherlv_8= 'od' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:722:3: otherlv_0= 'while' ruleLC ( (lv_exp2_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_com3_6_0= ruleCommandes ) ) ruleLC otherlv_8= 'od'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleWhile1402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getWhileAccess().getLCParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleWhile1421);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:1: ( (lv_exp2_2_0= ruleExpr ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:738:1: (lv_exp2_2_0= ruleExpr )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:738:1: (lv_exp2_2_0= ruleExpr )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:739:3: lv_exp2_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getExp2ExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleWhile1441);
            lv_exp2_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"exp2",
                      		lv_exp2_2_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getWhileAccess().getLCParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleWhile1460);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleWhile1471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getDoKeyword_4());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getWhileAccess().getLCParserRuleCall_5()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleWhile1490);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:781:1: ( (lv_com3_6_0= ruleCommandes ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:782:1: (lv_com3_6_0= ruleCommandes )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:782:1: (lv_com3_6_0= ruleCommandes )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:783:3: lv_com3_6_0= ruleCommandes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getCom3CommandesParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommandes_in_ruleWhile1510);
            lv_com3_6_0=ruleCommandes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"com3",
                      		lv_com3_6_0, 
                      		"Commandes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getWhileAccess().getLCParserRuleCall_7()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleWhile1529);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleWhile1540); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getWhileAccess().getOdKeyword_8());
                  
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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleFor"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:822:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:823:2: (iv_ruleFor= ruleFor EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:824:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor1576);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor1586); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:831:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' ruleLC ( (lv_exp3_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_com4_6_0= ruleCommandes ) ) ruleLC otherlv_8= 'od' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_exp3_2_0 = null;

        EObject lv_com4_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:28: ( (otherlv_0= 'for' ruleLC ( (lv_exp3_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_com4_6_0= ruleCommandes ) ) ruleLC otherlv_8= 'od' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:1: (otherlv_0= 'for' ruleLC ( (lv_exp3_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_com4_6_0= ruleCommandes ) ) ruleLC otherlv_8= 'od' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:1: (otherlv_0= 'for' ruleLC ( (lv_exp3_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_com4_6_0= ruleCommandes ) ) ruleLC otherlv_8= 'od' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:3: otherlv_0= 'for' ruleLC ( (lv_exp3_2_0= ruleExpr ) ) ruleLC otherlv_4= 'do' ruleLC ( (lv_com4_6_0= ruleCommandes ) ) ruleLC otherlv_8= 'od'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleFor1623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForAccess().getLCParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFor1642);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:850:1: ( (lv_exp3_2_0= ruleExpr ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:1: (lv_exp3_2_0= ruleExpr )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:1: (lv_exp3_2_0= ruleExpr )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:3: lv_exp3_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getExp3ExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleFor1662);
            lv_exp3_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"exp3",
                      		lv_exp3_2_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForAccess().getLCParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFor1681);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleFor1692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getForAccess().getDoKeyword_4());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForAccess().getLCParserRuleCall_5()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFor1711);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:894:1: ( (lv_com4_6_0= ruleCommandes ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:895:1: (lv_com4_6_0= ruleCommandes )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:895:1: (lv_com4_6_0= ruleCommandes )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:896:3: lv_com4_6_0= ruleCommandes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getCom4CommandesParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommandes_in_ruleFor1731);
            lv_com4_6_0=ruleCommandes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"com4",
                      		lv_com4_6_0, 
                      		"Commandes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForAccess().getLCParserRuleCall_7()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleFor1750);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleFor1761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getForAccess().getOdKeyword_8());
                  
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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleIf"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:935:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:936:2: (iv_ruleIf= ruleIf EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:937:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf1797);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf1807); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:944:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ruleLC ( (lv_exp4_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_com5_6_0= ruleCommandes ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_com6_10_0= ruleCommandes ) ) ruleLC )? otherlv_12= 'fi' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        EObject lv_exp4_2_0 = null;

        EObject lv_com5_6_0 = null;

        EObject lv_com6_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:947:28: ( (otherlv_0= 'if' ruleLC ( (lv_exp4_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_com5_6_0= ruleCommandes ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_com6_10_0= ruleCommandes ) ) ruleLC )? otherlv_12= 'fi' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:948:1: (otherlv_0= 'if' ruleLC ( (lv_exp4_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_com5_6_0= ruleCommandes ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_com6_10_0= ruleCommandes ) ) ruleLC )? otherlv_12= 'fi' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:948:1: (otherlv_0= 'if' ruleLC ( (lv_exp4_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_com5_6_0= ruleCommandes ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_com6_10_0= ruleCommandes ) ) ruleLC )? otherlv_12= 'fi' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:948:3: otherlv_0= 'if' ruleLC ( (lv_exp4_2_0= ruleExpr ) ) ruleLC otherlv_4= 'then' ruleLC ( (lv_com5_6_0= ruleCommandes ) ) ruleLC (otherlv_8= 'else' ruleLC ( (lv_com6_10_0= ruleCommandes ) ) ruleLC )? otherlv_12= 'fi'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleIf1844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfAccess().getLCParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleIf1863);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:1: ( (lv_exp4_2_0= ruleExpr ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:1: (lv_exp4_2_0= ruleExpr )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:1: (lv_exp4_2_0= ruleExpr )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:965:3: lv_exp4_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getExp4ExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleIf1883);
            lv_exp4_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfRule());
              	        }
                     		set(
                     			current, 
                     			"exp4",
                      		lv_exp4_2_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfAccess().getLCParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleIf1902);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleIf1913); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIfAccess().getThenKeyword_4());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfAccess().getLCParserRuleCall_5()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleIf1932);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1007:1: ( (lv_com5_6_0= ruleCommandes ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1008:1: (lv_com5_6_0= ruleCommandes )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1008:1: (lv_com5_6_0= ruleCommandes )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1009:3: lv_com5_6_0= ruleCommandes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getCom5CommandesParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommandes_in_ruleIf1952);
            lv_com5_6_0=ruleCommandes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfRule());
              	        }
                     		set(
                     			current, 
                     			"com5",
                      		lv_com5_6_0, 
                      		"Commandes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIfAccess().getLCParserRuleCall_7()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleIf1971);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1036:1: (otherlv_8= 'else' ruleLC ( (lv_com6_10_0= ruleCommandes ) ) ruleLC )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1036:3: otherlv_8= 'else' ruleLC ( (lv_com6_10_0= ruleCommandes ) ) ruleLC
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_35_in_ruleIf1983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getIfAccess().getElseKeyword_8_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIfAccess().getLCParserRuleCall_8_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleIf2002);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1051:1: ( (lv_com6_10_0= ruleCommandes ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1052:1: (lv_com6_10_0= ruleCommandes )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1052:1: (lv_com6_10_0= ruleCommandes )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1053:3: lv_com6_10_0= ruleCommandes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfAccess().getCom6CommandesParserRuleCall_8_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommandes_in_ruleIf2022);
                    lv_com6_10_0=ruleCommandes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfRule());
                      	        }
                             		set(
                             			current, 
                             			"com6",
                              		lv_com6_10_0, 
                              		"Commandes");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIfAccess().getLCParserRuleCall_8_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleIf2041);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleIf2054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getIfAccess().getFiKeyword_9());
                  
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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleForeach"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:1: entryRuleForeach returns [EObject current=null] : iv_ruleForeach= ruleForeach EOF ;
    public final EObject entryRuleForeach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeach = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:2: (iv_ruleForeach= ruleForeach EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:2: iv_ruleForeach= ruleForeach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachRule()); 
            }
            pushFollow(FOLLOW_ruleForeach_in_entryRuleForeach2090);
            iv_ruleForeach=ruleForeach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeach; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeach2100); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForeach"


    // $ANTLR start "ruleForeach"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1101:1: ruleForeach returns [EObject current=null] : (otherlv_0= 'foreach' ruleLC ( (lv_exp5_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_exp6_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_com7_10_0= ruleCommandes ) ) ruleLC otherlv_12= 'od' ) ;
    public final EObject ruleForeach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        EObject lv_exp5_2_0 = null;

        EObject lv_exp6_6_0 = null;

        EObject lv_com7_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1104:28: ( (otherlv_0= 'foreach' ruleLC ( (lv_exp5_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_exp6_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_com7_10_0= ruleCommandes ) ) ruleLC otherlv_12= 'od' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1105:1: (otherlv_0= 'foreach' ruleLC ( (lv_exp5_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_exp6_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_com7_10_0= ruleCommandes ) ) ruleLC otherlv_12= 'od' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1105:1: (otherlv_0= 'foreach' ruleLC ( (lv_exp5_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_exp6_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_com7_10_0= ruleCommandes ) ) ruleLC otherlv_12= 'od' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1105:3: otherlv_0= 'foreach' ruleLC ( (lv_exp5_2_0= ruleExpr ) ) ruleLC otherlv_4= 'in' ruleLC ( (lv_exp6_6_0= ruleExpr ) ) ruleLC otherlv_8= 'do' ruleLC ( (lv_com7_10_0= ruleCommandes ) ) ruleLC otherlv_12= 'od'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleForeach2137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForeachAccess().getForeachKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForeachAccess().getLCParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleForeach2156);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:1: ( (lv_exp5_2_0= ruleExpr ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:1: (lv_exp5_2_0= ruleExpr )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:1: (lv_exp5_2_0= ruleExpr )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1122:3: lv_exp5_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForeachAccess().getExp5ExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleForeach2176);
            lv_exp5_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForeachRule());
              	        }
                     		set(
                     			current, 
                     			"exp5",
                      		lv_exp5_2_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForeachAccess().getLCParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleForeach2195);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleForeach2206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getForeachAccess().getInKeyword_4());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForeachAccess().getLCParserRuleCall_5()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleForeach2225);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1164:1: ( (lv_exp6_6_0= ruleExpr ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1165:1: (lv_exp6_6_0= ruleExpr )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1165:1: (lv_exp6_6_0= ruleExpr )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1166:3: lv_exp6_6_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForeachAccess().getExp6ExprParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleForeach2245);
            lv_exp6_6_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForeachRule());
              	        }
                     		set(
                     			current, 
                     			"exp6",
                      		lv_exp6_6_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForeachAccess().getLCParserRuleCall_7()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleForeach2264);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleForeach2275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getForeachAccess().getDoKeyword_8());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForeachAccess().getLCParserRuleCall_9()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleForeach2294);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1208:1: ( (lv_com7_10_0= ruleCommandes ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1209:1: (lv_com7_10_0= ruleCommandes )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1209:1: (lv_com7_10_0= ruleCommandes )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1210:3: lv_com7_10_0= ruleCommandes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForeachAccess().getCom7CommandesParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommandes_in_ruleForeach2314);
            lv_com7_10_0=ruleCommandes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForeachRule());
              	        }
                     		set(
                     			current, 
                     			"com7",
                      		lv_com7_10_0, 
                      		"Commandes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForeachAccess().getLCParserRuleCall_11()); 
                  
            }
            pushFollow(FOLLOW_ruleLC_in_ruleForeach2333);
            ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_12=(Token)match(input,31,FOLLOW_31_in_ruleForeach2344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getForeachAccess().getOdKeyword_12());
                  
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
    // $ANTLR end "ruleForeach"


    // $ANTLR start "entryRuleVars"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1249:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1250:2: (iv_ruleVars= ruleVars EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1251:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars2380);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars2390); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1258:1: ruleVars returns [EObject current=null] : ( ( (lv_var2_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var3_2_0= RULE_VAR ) ) )* ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_var2_0_0=null;
        Token otherlv_1=null;
        Token lv_var3_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1261:28: ( ( ( (lv_var2_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var3_2_0= RULE_VAR ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1262:1: ( ( (lv_var2_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var3_2_0= RULE_VAR ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1262:1: ( ( (lv_var2_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var3_2_0= RULE_VAR ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1262:2: ( (lv_var2_0_0= RULE_VAR ) ) (otherlv_1= ',' ( (lv_var3_2_0= RULE_VAR ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1262:2: ( (lv_var2_0_0= RULE_VAR ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1263:1: (lv_var2_0_0= RULE_VAR )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1263:1: (lv_var2_0_0= RULE_VAR )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:3: lv_var2_0_0= RULE_VAR
            {
            lv_var2_0_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleVars2432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_var2_0_0, grammarAccess.getVarsAccess().getVar2VARTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVarsRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"var2",
                      		lv_var2_0_0, 
                      		"VAR");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1280:2: (otherlv_1= ',' ( (lv_var3_2_0= RULE_VAR ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1280:4: otherlv_1= ',' ( (lv_var3_2_0= RULE_VAR ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleVars2450); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1284:1: ( (lv_var3_2_0= RULE_VAR ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1285:1: (lv_var3_2_0= RULE_VAR )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1285:1: (lv_var3_2_0= RULE_VAR )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1286:3: lv_var3_2_0= RULE_VAR
            	    {
            	    lv_var3_2_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleVars2467); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_var3_2_0, grammarAccess.getVarsAccess().getVar3VARTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVarsRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"var3",
            	              		lv_var3_2_0, 
            	              		"VAR");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1310:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1311:2: (iv_ruleExprs= ruleExprs EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1312:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs2510);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs2520); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1319:1: ruleExprs returns [EObject current=null] : ( ( (lv_exprS_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprS2_2_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprS_0_0 = null;

        EObject lv_exprS2_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1322:28: ( ( ( (lv_exprS_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprS2_2_0= ruleExpr ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1323:1: ( ( (lv_exprS_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprS2_2_0= ruleExpr ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1323:1: ( ( (lv_exprS_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprS2_2_0= ruleExpr ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1323:2: ( (lv_exprS_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprS2_2_0= ruleExpr ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1323:2: ( (lv_exprS_0_0= ruleExpr ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1324:1: (lv_exprS_0_0= ruleExpr )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1324:1: (lv_exprS_0_0= ruleExpr )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1325:3: lv_exprS_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprsAccess().getExprSExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleExprs2566);
            lv_exprS_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExprsRule());
              	        }
                     		set(
                     			current, 
                     			"exprS",
                      		lv_exprS_0_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1341:2: (otherlv_1= ',' ( (lv_exprS2_2_0= ruleExpr ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1341:4: otherlv_1= ',' ( (lv_exprS2_2_0= ruleExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleExprs2579); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1345:1: ( (lv_exprS2_2_0= ruleExpr ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1346:1: (lv_exprS2_2_0= ruleExpr )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1346:1: (lv_exprS2_2_0= ruleExpr )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1347:3: lv_exprS2_2_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprsAccess().getExprS2ExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprs2600);
            	    lv_exprS2_2_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"exprS2",
            	              		lv_exprS2_2_0, 
            	              		"Expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpr"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1371:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:2: (iv_ruleExpr= ruleExpr EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2638);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2648); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1380:1: ruleExpr returns [EObject current=null] : ( ( (lv_expA_0_0= ruleExprAnd ) ) | ( (lv_expS_1_0= ruleExprSimple ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expA_0_0 = null;

        EObject lv_expS_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1383:28: ( ( ( (lv_expA_0_0= ruleExprAnd ) ) | ( (lv_expS_1_0= ruleExprSimple ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1384:1: ( ( (lv_expA_0_0= ruleExprAnd ) ) | ( (lv_expS_1_0= ruleExprSimple ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1384:1: ( ( (lv_expA_0_0= ruleExprAnd ) ) | ( (lv_expS_1_0= ruleExprSimple ) ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt10=1;
                }
                break;
            case 39:
                {
                int LA10_2 = input.LA(2);

                if ( (synpred14_InternalMyDsl()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VAR:
                {
                int LA10_3 = input.LA(2);

                if ( (synpred14_InternalMyDsl()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYM:
                {
                int LA10_4 = input.LA(2);

                if ( (synpred14_InternalMyDsl()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_PARAG:
                {
                int LA10_5 = input.LA(2);

                if ( (synpred14_InternalMyDsl()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1384:2: ( (lv_expA_0_0= ruleExprAnd ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1384:2: ( (lv_expA_0_0= ruleExprAnd ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:1: (lv_expA_0_0= ruleExprAnd )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:1: (lv_expA_0_0= ruleExprAnd )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1386:3: lv_expA_0_0= ruleExprAnd
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAccess().getExpAExprAndParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprAnd_in_ruleExpr2694);
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1403:6: ( (lv_expS_1_0= ruleExprSimple ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1403:6: ( (lv_expS_1_0= ruleExprSimple ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1404:1: (lv_expS_1_0= ruleExprSimple )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1404:1: (lv_expS_1_0= ruleExprSimple )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1405:3: lv_expS_1_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAccess().getExpSExprSimpleParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExpr2721);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1429:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1430:2: (iv_ruleExprSimple= ruleExprSimple EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1431:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple2757);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple2767); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1438:1: ruleExprSimple returns [EObject current=null] : ( ( () otherlv_1= 'nil' ) | ( (lv_var_2_0= RULE_VAR ) ) | ( (lv_symbole_3_0= RULE_SYM ) ) | (this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD ) | (this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD ) | (this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD ) | (this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD ) | (this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD ) ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1441:28: ( ( ( () otherlv_1= 'nil' ) | ( (lv_var_2_0= RULE_VAR ) ) | ( (lv_symbole_3_0= RULE_SYM ) ) | (this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD ) | (this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD ) | (this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD ) | (this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD ) | (this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:1: ( ( () otherlv_1= 'nil' ) | ( (lv_var_2_0= RULE_VAR ) ) | ( (lv_symbole_3_0= RULE_SYM ) ) | (this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD ) | (this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD ) | (this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD ) | (this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD ) | (this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:1: ( ( () otherlv_1= 'nil' ) | ( (lv_var_2_0= RULE_VAR ) ) | ( (lv_symbole_3_0= RULE_SYM ) ) | (this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD ) | (this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD ) | (this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD ) | (this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD ) | (this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD ) )
            int alt11=8;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:2: ( () otherlv_1= 'nil' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:2: ( () otherlv_1= 'nil' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:3: () otherlv_1= 'nil'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:3: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1443:2: 
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

                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleExprSimple2817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExprSimpleAccess().getNilKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1456:6: ( (lv_var_2_0= RULE_VAR ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1456:6: ( (lv_var_2_0= RULE_VAR ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1457:1: (lv_var_2_0= RULE_VAR )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1457:1: (lv_var_2_0= RULE_VAR )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1458:3: lv_var_2_0= RULE_VAR
                    {
                    lv_var_2_0=(Token)match(input,RULE_VAR,FOLLOW_RULE_VAR_in_ruleExprSimple2841); if (state.failed) return current;
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1475:6: ( (lv_symbole_3_0= RULE_SYM ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1475:6: ( (lv_symbole_3_0= RULE_SYM ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1476:1: (lv_symbole_3_0= RULE_SYM )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1476:1: (lv_symbole_3_0= RULE_SYM )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1477:3: lv_symbole_3_0= RULE_SYM
                    {
                    lv_symbole_3_0=(Token)match(input,RULE_SYM,FOLLOW_RULE_SYM_in_ruleExprSimple2869); if (state.failed) return current;
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1494:6: (this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1494:6: (this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1494:7: this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD
                    {
                    this_PARAG_4=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple2892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_4, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_3_0()); 
                          
                    }
                    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleExprSimple2903); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getExprSimpleAccess().getConsKeyword_3_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1502:1: ( (lv_le_6_0= ruleLExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1503:1: (lv_le_6_0= ruleLExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1503:1: (lv_le_6_0= ruleLExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1504:3: lv_le_6_0= ruleLExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getLeLExprParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLExpr_in_ruleExprSimple2924);
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

                    this_PARAD_7=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple2935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_7, grammarAccess.getExprSimpleAccess().getPARADTerminalRuleCall_3_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1525:6: (this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1525:6: (this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1525:7: this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD
                    {
                    this_PARAG_8=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple2953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_8, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_4_0()); 
                          
                    }
                    otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleExprSimple2964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getExprSimpleAccess().getListKeyword_4_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1533:1: ( (lv_le2_10_0= ruleLExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:1: (lv_le2_10_0= ruleLExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:1: (lv_le2_10_0= ruleLExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1535:3: lv_le2_10_0= ruleLExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getLe2LExprParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLExpr_in_ruleExprSimple2985);
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

                    this_PARAD_11=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple2996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_11, grammarAccess.getExprSimpleAccess().getPARADTerminalRuleCall_4_3()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1556:6: (this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1556:6: (this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1556:7: this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD
                    {
                    this_PARAG_12=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple3014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_12, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_5_0()); 
                          
                    }
                    otherlv_13=(Token)match(input,42,FOLLOW_42_in_ruleExprSimple3025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getExprSimpleAccess().getHdKeyword_5_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprSimpleAccess().getLCParserRuleCall_5_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleExprSimple3044);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1575:1: ( (lv_le3_15_0= ruleExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1576:1: (lv_le3_15_0= ruleExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1576:1: (lv_le3_15_0= ruleExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1577:3: lv_le3_15_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getLe3ExprParserRuleCall_5_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple3064);
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

                    this_PARAD_16=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple3075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_16, grammarAccess.getExprSimpleAccess().getPARADTerminalRuleCall_5_4()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1598:6: (this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1598:6: (this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1598:7: this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD
                    {
                    this_PARAG_17=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple3093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_17, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_6_0()); 
                          
                    }
                    otherlv_18=(Token)match(input,43,FOLLOW_43_in_ruleExprSimple3104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getExprSimpleAccess().getTlKeyword_6_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprSimpleAccess().getLCParserRuleCall_6_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleExprSimple3123);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1617:1: ( (lv_le4_20_0= ruleExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1618:1: (lv_le4_20_0= ruleExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1618:1: (lv_le4_20_0= ruleExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1619:3: lv_le4_20_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getLe4ExprParserRuleCall_6_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple3143);
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

                    this_PARAD_21=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple3154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAD_21, grammarAccess.getExprSimpleAccess().getPARADTerminalRuleCall_6_4()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1640:6: (this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1640:6: (this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1640:7: this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD
                    {
                    this_PARAG_22=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprSimple3172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_22, grammarAccess.getExprSimpleAccess().getPARAGTerminalRuleCall_7_0()); 
                          
                    }
                    this_SYM_23=(Token)match(input,RULE_SYM,FOLLOW_RULE_SYM_in_ruleExprSimple3182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SYM_23, grammarAccess.getExprSimpleAccess().getSYMTerminalRuleCall_7_1()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1648:1: ( (lv_le5_24_0= ruleLExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1649:1: (lv_le5_24_0= ruleLExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1649:1: (lv_le5_24_0= ruleLExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1650:3: lv_le5_24_0= ruleLExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getLe5LExprParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLExpr_in_ruleExprSimple3202);
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

                    this_PARAD_25=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprSimple3213); if (state.failed) return current;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1678:1: entryRuleLExpr returns [EObject current=null] : iv_ruleLExpr= ruleLExpr EOF ;
    public final EObject entryRuleLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExpr = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1679:2: (iv_ruleLExpr= ruleLExpr EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1680:2: iv_ruleLExpr= ruleLExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLExprRule()); 
            }
            pushFollow(FOLLOW_ruleLExpr_in_entryRuleLExpr3249);
            iv_ruleLExpr=ruleLExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLExpr3259); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1687:1: ruleLExpr returns [EObject current=null] : ( ruleLC ( (lv_exp_1_0= ruleExpr ) ) )+ ;
    public final EObject ruleLExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1690:28: ( ( ruleLC ( (lv_exp_1_0= ruleExpr ) ) )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1691:1: ( ruleLC ( (lv_exp_1_0= ruleExpr ) ) )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1691:1: ( ruleLC ( (lv_exp_1_0= ruleExpr ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_CR && LA12_0<=RULE_PARAG)||(LA12_0>=RULE_SP && LA12_0<=RULE_LF)||LA12_0==39||LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1692:2: ruleLC ( (lv_exp_1_0= ruleExpr ) )
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getLExprAccess().getLCParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleLExpr3303);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1702:1: ( (lv_exp_1_0= ruleExpr ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1703:1: (lv_exp_1_0= ruleExpr )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1703:1: (lv_exp_1_0= ruleExpr )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1704:3: lv_exp_1_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLExprAccess().getExpExprParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleLExpr3323);
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
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1728:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1729:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1730:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd3360);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd3370); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1737:1: ruleExprAnd returns [EObject current=null] : ( ( (lv_expO_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expO2_4_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expO_0_0 = null;

        EObject lv_expO2_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1740:28: ( ( ( (lv_expO_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expO2_4_0= ruleExprOr ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1741:1: ( ( (lv_expO_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expO2_4_0= ruleExprOr ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1741:1: ( ( (lv_expO_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expO2_4_0= ruleExprOr ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1741:2: ( (lv_expO_0_0= ruleExprOr ) ) ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expO2_4_0= ruleExprOr ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1741:2: ( (lv_expO_0_0= ruleExprOr ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1742:1: (lv_expO_0_0= ruleExprOr )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1742:1: (lv_expO_0_0= ruleExprOr )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1743:3: lv_expO_0_0= ruleExprOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprAndAccess().getExpOExprOrParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3416);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1759:2: ( ruleLC otherlv_2= 'and' ruleLC ( (lv_expO2_4_0= ruleExprOr ) ) )*
            loop13:
            do {
                int alt13=2;
                switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==44) ) {
                        alt13=1;
                    }


                    }
                    break;
                case RULE_CR:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==44) ) {
                        alt13=1;
                    }


                    }
                    break;
                case RULE_TAB:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (LA13_3==44) ) {
                        alt13=1;
                    }


                    }
                    break;
                case RULE_LF:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (LA13_4==44) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 44:
                    {
                    alt13=1;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1760:2: ruleLC otherlv_2= 'and' ruleLC ( (lv_expO2_4_0= ruleExprOr ) )
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprAnd3436);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleExprAnd3447); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getExprAndAccess().getAndKeyword_1_1());
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprAndAccess().getLCParserRuleCall_1_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprAnd3466);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1785:1: ( (lv_expO2_4_0= ruleExprOr ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1786:1: (lv_expO2_4_0= ruleExprOr )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1786:1: (lv_expO2_4_0= ruleExprOr )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1787:3: lv_expO2_4_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAndAccess().getExpO2ExprOrParserRuleCall_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3486);
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
            	    break loop13;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1811:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1812:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1813:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr3524);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr3534); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1820:1: ruleExprOr returns [EObject current=null] : ( ( (lv_expN_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expN2_4_0= ruleExprNot ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expN_0_0 = null;

        EObject lv_expN2_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1823:28: ( ( ( (lv_expN_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expN2_4_0= ruleExprNot ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1824:1: ( ( (lv_expN_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expN2_4_0= ruleExprNot ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1824:1: ( ( (lv_expN_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expN2_4_0= ruleExprNot ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1824:2: ( (lv_expN_0_0= ruleExprNot ) ) ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expN2_4_0= ruleExprNot ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1824:2: ( (lv_expN_0_0= ruleExprNot ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1825:1: (lv_expN_0_0= ruleExprNot )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1825:1: (lv_expN_0_0= ruleExprNot )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1826:3: lv_expN_0_0= ruleExprNot
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprOrAccess().getExpNExprNotParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprNot_in_ruleExprOr3580);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1842:2: ( ruleLC otherlv_2= 'or' ruleLC ( (lv_expN2_4_0= ruleExprNot ) ) )*
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==45) ) {
                        alt14=1;
                    }


                    }
                    break;
                case RULE_CR:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==45) ) {
                        alt14=1;
                    }


                    }
                    break;
                case RULE_TAB:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (LA14_3==45) ) {
                        alt14=1;
                    }


                    }
                    break;
                case RULE_LF:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (LA14_4==45) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 45:
                    {
                    alt14=1;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1843:2: ruleLC otherlv_2= 'or' ruleLC ( (lv_expN2_4_0= ruleExprNot ) )
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprOr3600);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleExprOr3611); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getExprOrAccess().getOrKeyword_1_1());
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExprOrAccess().getLCParserRuleCall_1_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleLC_in_ruleExprOr3630);
            	    ruleLC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1868:1: ( (lv_expN2_4_0= ruleExprNot ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1869:1: (lv_expN2_4_0= ruleExprNot )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1869:1: (lv_expN2_4_0= ruleExprNot )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1870:3: lv_expN2_4_0= ruleExprNot
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprOrAccess().getExpN2ExprNotParserRuleCall_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprNot_in_ruleExprOr3650);
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
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleExprNot"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1894:1: entryRuleExprNot returns [EObject current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final EObject entryRuleExprNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprNot = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1895:2: (iv_ruleExprNot= ruleExprNot EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1896:2: iv_ruleExprNot= ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_entryRuleExprNot3688);
            iv_ruleExprNot=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprNot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNot3698); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1903:1: ruleExprNot returns [EObject current=null] : ( (otherlv_0= 'not' ruleLC )? ( (lv_expEq_2_0= ruleExprEq ) ) ) ;
    public final EObject ruleExprNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expEq_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1906:28: ( ( (otherlv_0= 'not' ruleLC )? ( (lv_expEq_2_0= ruleExprEq ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1907:1: ( (otherlv_0= 'not' ruleLC )? ( (lv_expEq_2_0= ruleExprEq ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1907:1: ( (otherlv_0= 'not' ruleLC )? ( (lv_expEq_2_0= ruleExprEq ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1907:2: (otherlv_0= 'not' ruleLC )? ( (lv_expEq_2_0= ruleExprEq ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1907:2: (otherlv_0= 'not' ruleLC )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==46) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1907:4: otherlv_0= 'not' ruleLC
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleExprNot3736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getExprNotAccess().getNotKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprNotAccess().getLCParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLC_in_ruleExprNot3755);
                    ruleLC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1922:3: ( (lv_expEq_2_0= ruleExprEq ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1923:1: (lv_expEq_2_0= ruleExprEq )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1923:1: (lv_expEq_2_0= ruleExprEq )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1924:3: lv_expEq_2_0= ruleExprEq
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprNotAccess().getExpEqExprEqParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprEq_in_ruleExprNot3777);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1948:1: entryRuleExprEq returns [EObject current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final EObject entryRuleExprEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEq = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1949:2: (iv_ruleExprEq= ruleExprEq EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1950:2: iv_ruleExprEq= ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_entryRuleExprEq3813);
            iv_ruleExprEq=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEq; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEq3823); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1957:1: ruleExprEq returns [EObject current=null] : ( ( ( (lv_ExpSi_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_ExpS2_2_0= ruleExprSimple ) ) ) | (this_PARAG_3= RULE_PARAG ( (lv_exp_4_0= ruleExpr ) ) this_PARAD_5= RULE_PARAD ) ) ;
    public final EObject ruleExprEq() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_PARAG_3=null;
        Token this_PARAD_5=null;
        EObject lv_ExpSi_0_0 = null;

        EObject lv_ExpS2_2_0 = null;

        EObject lv_exp_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1960:28: ( ( ( ( (lv_ExpSi_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_ExpS2_2_0= ruleExprSimple ) ) ) | (this_PARAG_3= RULE_PARAG ( (lv_exp_4_0= ruleExpr ) ) this_PARAD_5= RULE_PARAD ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1961:1: ( ( ( (lv_ExpSi_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_ExpS2_2_0= ruleExprSimple ) ) ) | (this_PARAG_3= RULE_PARAG ( (lv_exp_4_0= ruleExpr ) ) this_PARAD_5= RULE_PARAD ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1961:1: ( ( ( (lv_ExpSi_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_ExpS2_2_0= ruleExprSimple ) ) ) | (this_PARAG_3= RULE_PARAG ( (lv_exp_4_0= ruleExpr ) ) this_PARAD_5= RULE_PARAD ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_SYM && LA16_0<=RULE_VAR)||LA16_0==39) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_PARAG) ) {
                switch ( input.LA(2) ) {
                case 40:
                case 41:
                case 42:
                case 43:
                    {
                    alt16=1;
                    }
                    break;
                case RULE_SYM:
                    {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3==RULE_PARAD||LA16_3==47) ) {
                        alt16=2;
                    }
                    else if ( ((LA16_3>=RULE_CR && LA16_3<=RULE_PARAG)||(LA16_3>=RULE_SP && LA16_3<=RULE_LF)||LA16_3==39||LA16_3==46) ) {
                        alt16=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_VAR:
                case RULE_PARAG:
                case 39:
                case 46:
                    {
                    alt16=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1961:2: ( ( (lv_ExpSi_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_ExpS2_2_0= ruleExprSimple ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1961:2: ( ( (lv_ExpSi_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_ExpS2_2_0= ruleExprSimple ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1961:3: ( (lv_ExpSi_0_0= ruleExprSimple ) ) otherlv_1= '=?' ( (lv_ExpS2_2_0= ruleExprSimple ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1961:3: ( (lv_ExpSi_0_0= ruleExprSimple ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1962:1: (lv_ExpSi_0_0= ruleExprSimple )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1962:1: (lv_ExpSi_0_0= ruleExprSimple )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1963:3: lv_ExpSi_0_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExpSiExprSimpleParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExprEq3870);
                    lv_ExpSi_0_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprEqRule());
                      	        }
                             		set(
                             			current, 
                             			"ExpSi",
                              		lv_ExpSi_0_0, 
                              		"ExprSimple");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleExprEq3882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1983:1: ( (lv_ExpS2_2_0= ruleExprSimple ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1984:1: (lv_ExpS2_2_0= ruleExprSimple )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1984:1: (lv_ExpS2_2_0= ruleExprSimple )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1985:3: lv_ExpS2_2_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExpS2ExprSimpleParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExprEq3903);
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2002:6: (this_PARAG_3= RULE_PARAG ( (lv_exp_4_0= ruleExpr ) ) this_PARAD_5= RULE_PARAD )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2002:6: (this_PARAG_3= RULE_PARAG ( (lv_exp_4_0= ruleExpr ) ) this_PARAD_5= RULE_PARAD )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2002:7: this_PARAG_3= RULE_PARAG ( (lv_exp_4_0= ruleExpr ) ) this_PARAD_5= RULE_PARAD
                    {
                    this_PARAG_3=(Token)match(input,RULE_PARAG,FOLLOW_RULE_PARAG_in_ruleExprEq3922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAG_3, grammarAccess.getExprEqAccess().getPARAGTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2006:1: ( (lv_exp_4_0= ruleExpr ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2007:1: (lv_exp_4_0= ruleExpr )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2007:1: (lv_exp_4_0= ruleExpr )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2008:3: lv_exp_4_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExpExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprEq3942);
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

                    this_PARAD_5=(Token)match(input,RULE_PARAD,FOLLOW_RULE_PARAD_in_ruleExprEq3953); if (state.failed) return current;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2036:1: entryRuleLC returns [String current=null] : iv_ruleLC= ruleLC EOF ;
    public final String entryRuleLC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLC = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2037:2: (iv_ruleLC= ruleLC EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2038:2: iv_ruleLC= ruleLC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLCRule()); 
            }
            pushFollow(FOLLOW_ruleLC_in_entryRuleLC3990);
            iv_ruleLC=ruleLC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLC.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLC4001); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2045:1: ruleLC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )? ;
    public final AntlrDatatypeRuleToken ruleLC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SP_0=null;
        Token this_CR_1=null;
        Token this_TAB_2=null;
        Token this_LF_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2048:28: ( (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2049:1: (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2049:1: (this_SP_0= RULE_SP | this_CR_1= RULE_CR | this_TAB_2= RULE_TAB | this_LF_3= RULE_LF )?
            int alt17=5;
            switch ( input.LA(1) ) {
                case RULE_SP:
                    {
                    alt17=1;
                    }
                    break;
                case RULE_CR:
                    {
                    alt17=2;
                    }
                    break;
                case RULE_TAB:
                    {
                    alt17=3;
                    }
                    break;
                case RULE_LF:
                    {
                    alt17=4;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2049:6: this_SP_0= RULE_SP
                    {
                    this_SP_0=(Token)match(input,RULE_SP,FOLLOW_RULE_SP_in_ruleLC4041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SP_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SP_0, grammarAccess.getLCAccess().getSPTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2057:10: this_CR_1= RULE_CR
                    {
                    this_CR_1=(Token)match(input,RULE_CR,FOLLOW_RULE_CR_in_ruleLC4067); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CR_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CR_1, grammarAccess.getLCAccess().getCRTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2065:10: this_TAB_2= RULE_TAB
                    {
                    this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_RULE_TAB_in_ruleLC4093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TAB_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TAB_2, grammarAccess.getLCAccess().getTABTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2073:10: this_LF_3= RULE_LF
                    {
                    this_LF_3=(Token)match(input,RULE_LF,FOLLOW_RULE_LF_in_ruleLC4119); if (state.failed) return current;
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


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1384:2: ( ( (lv_expA_0_0= ruleExprAnd ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1384:2: ( (lv_expA_0_0= ruleExprAnd ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1384:2: ( (lv_expA_0_0= ruleExprAnd ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:1: (lv_expA_0_0= ruleExprAnd )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:1: (lv_expA_0_0= ruleExprAnd )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1386:3: lv_expA_0_0= ruleExprAnd
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExprAccess().getExpAExprAndParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExprAnd_in_synpred14_InternalMyDsl2694);
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


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\5\3\uffff\1\5\5\uffff";
    static final String DFA11_maxS =
        "\1\47\3\uffff\1\53\5\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\6\1\7\1\10\1\5";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
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

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1442:1: ( ( () otherlv_1= 'nil' ) | ( (lv_var_2_0= RULE_VAR ) ) | ( (lv_symbole_3_0= RULE_SYM ) ) | (this_PARAG_4= RULE_PARAG otherlv_5= 'cons' ( (lv_le_6_0= ruleLExpr ) ) this_PARAD_7= RULE_PARAD ) | (this_PARAG_8= RULE_PARAG otherlv_9= 'list' ( (lv_le2_10_0= ruleLExpr ) ) this_PARAD_11= RULE_PARAD ) | (this_PARAG_12= RULE_PARAG otherlv_13= 'hd' ruleLC ( (lv_le3_15_0= ruleExpr ) ) this_PARAD_16= RULE_PARAD ) | (this_PARAG_17= RULE_PARAG otherlv_18= 'tl' ruleLC ( (lv_le4_20_0= ruleExpr ) ) this_PARAD_21= RULE_PARAD ) | (this_PARAG_22= RULE_PARAG this_SYM_23= RULE_SYM ( (lv_le5_24_0= ruleLExpr ) ) this_PARAD_25= RULE_PARAD ) )";
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
    public static final BitSet FOLLOW_23_in_ruleFonction471 = new BitSet(new long[]{0x0000002328000040L});
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
    public static final BitSet FOLLOW_26_in_ruleCommandes920 = new BitSet(new long[]{0x0000002328000040L});
    public static final BitSet FOLLOW_ruleCommande_in_ruleCommandes941 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleCommande_in_entryRuleCommande979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommande989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCommande1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectVar_in_ruleCommande1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleCommande1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_ruleCommande1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_ruleCommande1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_ruleCommande1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectVar_in_entryRuleAffectVar1230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectVar1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_ruleAffectVar1286 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAffectVar1298 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExprs_in_ruleAffectVar1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile1355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleWhile1402 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleWhile1421 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleWhile1441 = new BitSet(new long[]{0x0000000040000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleWhile1460 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleWhile1471 = new BitSet(new long[]{0x0000002328000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleWhile1490 = new BitSet(new long[]{0x0000002328000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleWhile1510 = new BitSet(new long[]{0x0000000080000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleWhile1529 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleWhile1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor1576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFor1623 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFor1642 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFor1662 = new BitSet(new long[]{0x0000000040000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFor1681 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleFor1692 = new BitSet(new long[]{0x0000002328000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFor1711 = new BitSet(new long[]{0x0000002328000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleFor1731 = new BitSet(new long[]{0x0000000080000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleFor1750 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFor1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf1797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleIf1844 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIf1863 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleIf1883 = new BitSet(new long[]{0x0000000400000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIf1902 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleIf1913 = new BitSet(new long[]{0x0000002328000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIf1932 = new BitSet(new long[]{0x0000002328000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleIf1952 = new BitSet(new long[]{0x0000001800000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIf1971 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleIf1983 = new BitSet(new long[]{0x0000002328000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIf2002 = new BitSet(new long[]{0x0000002328000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleIf2022 = new BitSet(new long[]{0x0000001000000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleIf2041 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleIf2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeach_in_entryRuleForeach2090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeach2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleForeach2137 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleForeach2156 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleForeach2176 = new BitSet(new long[]{0x0000004000000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleForeach2195 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleForeach2206 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleForeach2225 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleForeach2245 = new BitSet(new long[]{0x0000000040000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleForeach2264 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleForeach2275 = new BitSet(new long[]{0x0000002328000E50L});
    public static final BitSet FOLLOW_ruleLC_in_ruleForeach2294 = new BitSet(new long[]{0x0000002328000040L});
    public static final BitSet FOLLOW_ruleCommandes_in_ruleForeach2314 = new BitSet(new long[]{0x0000000080000E10L});
    public static final BitSet FOLLOW_ruleLC_in_ruleForeach2333 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleForeach2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars2380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleVars2432 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleVars2450 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleVars2467 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs2510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs2566 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleExprs2579 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs2600 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExpr2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExpr2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple2757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExprSimple2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_in_ruleExprSimple2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYM_in_ruleExprSimple2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple2892 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleExprSimple2903 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLExpr_in_ruleExprSimple2924 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple2953 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleExprSimple2964 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLExpr_in_ruleExprSimple2985 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple3014 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleExprSimple3025 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprSimple3044 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple3064 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple3093 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleExprSimple3104 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprSimple3123 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple3143 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprSimple3172 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SYM_in_ruleExprSimple3182 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLExpr_in_ruleExprSimple3202 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprSimple3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpr_in_entryRuleLExpr3249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLExpr3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_ruleLExpr3303 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleLExpr3323 = new BitSet(new long[]{0x0000408000000EF2L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd3360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3416 = new BitSet(new long[]{0x0000100000000E12L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprAnd3436 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleExprAnd3447 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprAnd3466 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3486 = new BitSet(new long[]{0x0000100000000E12L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr3524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_ruleExprOr3580 = new BitSet(new long[]{0x0000200000000E12L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprOr3600 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleExprOr3611 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprOr3630 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExprNot_in_ruleExprOr3650 = new BitSet(new long[]{0x0000200000000E12L});
    public static final BitSet FOLLOW_ruleExprNot_in_entryRuleExprNot3688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNot3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleExprNot3736 = new BitSet(new long[]{0x0000408000000EF0L});
    public static final BitSet FOLLOW_ruleLC_in_ruleExprNot3755 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExprEq_in_ruleExprNot3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_entryRuleExprEq3813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEq3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExprEq3870 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleExprEq3882 = new BitSet(new long[]{0x00000080000000E0L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExprEq3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAG_in_ruleExprEq3922 = new BitSet(new long[]{0x00004080000000E0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprEq3942 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAD_in_ruleExprEq3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLC_in_entryRuleLC3990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLC4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_ruleLC4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CR_in_ruleLC4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAB_in_ruleLC4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LF_in_ruleLC4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_synpred14_InternalMyDsl2694 = new BitSet(new long[]{0x0000000000000002L});

}