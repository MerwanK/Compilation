package org.xtext.example.mydsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:11:7: ( 'fonction' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:11:9: 'fonction'
            {
            match("fonction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:12:7: ( ':' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:13:7: ( 'read' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:13:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:14:7: ( '%' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:14:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:15:7: ( 'write' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:15:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:16:7: ( ',' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:17:7: ( ';' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:18:7: ( ':=' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:18:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19:7: ( 'while' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:20:7: ( 'do' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:20:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:21:7: ( 'od' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:21:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:22:7: ( 'for' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:22:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:23:7: ( 'if' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:23:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:24:7: ( 'then' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:24:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:25:7: ( 'fi' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:25:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:26:7: ( 'else' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:26:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:27:7: ( 'foreach' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:27:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:28:7: ( 'in' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:28:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:29:7: ( 'cons' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:29:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:30:7: ( 'list' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:30:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:31:7: ( 'hd' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:31:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:32:7: ( 'tl' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:32:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:33:7: ( 'and' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:33:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:34:7: ( 'or' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:34:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:35:7: ( 'not' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:35:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:36:7: ( '=?' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:36:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:37:7: ( 'nop' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:37:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:38:7: ( 'nil' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:38:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "RULE_VAR"
    public final void mRULE_VAR() throws RecognitionException {
        try {
            int _type = RULE_VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6400:10: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* RULE_CONF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6400:12: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* RULE_CONF
            {
            matchRange('A','Z'); 
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6400:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            mRULE_CONF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VAR"

    // $ANTLR start "RULE_SYM"
    public final void mRULE_SYM() throws RecognitionException {
        try {
            int _type = RULE_SYM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6402:10: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* RULE_CONF )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6402:12: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* RULE_CONF
            {
            matchRange('a','z'); 
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6402:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            mRULE_CONF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYM"

    // $ANTLR start "RULE_CONF"
    public final void mRULE_CONF() throws RecognitionException {
        try {
            int _type = RULE_CONF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:11: ( ( ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )* ( '?' | '!' )? )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:13: ( ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )* ( '?' | '!' )?
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:13: ( ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='&'||LA5_0=='+'||(LA5_0>='-' && LA5_0<='/')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:14: ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            	    {
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:14: ( '-' | '+' | '.' | '/' | '_' | '&' | '->' )
            	    int alt3=7;
            	    switch ( input.LA(1) ) {
            	    case '-':
            	        {
            	        int LA3_1 = input.LA(2);

            	        if ( (LA3_1=='>') ) {
            	            alt3=7;
            	        }
            	        else if ( ((LA3_1>='0' && LA3_1<='9')||(LA3_1>='A' && LA3_1<='Z')||(LA3_1>='a' && LA3_1<='z')) ) {
            	            alt3=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 3, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case '+':
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case '.':
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case '/':
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    case '_':
            	        {
            	        alt3=5;
            	        }
            	        break;
            	    case '&':
            	        {
            	        alt3=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:15: '-'
            	            {
            	            match('-'); 

            	            }
            	            break;
            	        case 2 :
            	            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:19: '+'
            	            {
            	            match('+'); 

            	            }
            	            break;
            	        case 3 :
            	            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:23: '.'
            	            {
            	            match('.'); 

            	            }
            	            break;
            	        case 4 :
            	            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:27: '/'
            	            {
            	            match('/'); 

            	            }
            	            break;
            	        case 5 :
            	            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:31: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;
            	        case 6 :
            	            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:35: '&'
            	            {
            	            match('&'); 

            	            }
            	            break;
            	        case 7 :
            	            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:39: '->'
            	            {
            	            match("->"); 


            	            }
            	            break;

            	    }

            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:45: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6404:77: ( '?' | '!' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='!'||LA6_0=='?') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONF"

    // $ANTLR start "RULE_PARAG"
    public final void mRULE_PARAG() throws RecognitionException {
        try {
            int _type = RULE_PARAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6406:12: ( '(' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6406:14: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARAG"

    // $ANTLR start "RULE_PARAD"
    public final void mRULE_PARAD() throws RecognitionException {
        try {
            int _type = RULE_PARAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6408:12: ( ')' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6408:14: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARAD"

    // $ANTLR start "RULE_SP"
    public final void mRULE_SP() throws RecognitionException {
        try {
            int _type = RULE_SP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6410:9: ( ' ' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6410:11: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SP"

    // $ANTLR start "RULE_CR"
    public final void mRULE_CR() throws RecognitionException {
        try {
            int _type = RULE_CR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6412:9: ( '\\n' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6412:11: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CR"

    // $ANTLR start "RULE_TAB"
    public final void mRULE_TAB() throws RecognitionException {
        try {
            int _type = RULE_TAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6414:10: ( '\\t' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6414:12: '\\t'
            {
            match('\t'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAB"

    // $ANTLR start "RULE_LF"
    public final void mRULE_LF() throws RecognitionException {
        try {
            int _type = RULE_LF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6416:9: ( '\\r' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6416:11: '\\r'
            {
            match('\r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LF"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6418:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6418:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6418:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6418:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6418:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6420:10: ( ( '0' .. '9' )+ )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6420:12: ( '0' .. '9' )+
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6420:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6420:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6422:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6422:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6422:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6422:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6422:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6422:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6422:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6422:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6422:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6422:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6422:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6424:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6424:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6424:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6424:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6426:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6426:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6426:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6426:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6426:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6426:41: ( '\\r' )? '\\n'
                    {
                    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6426:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6426:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6428:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6428:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6428:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6430:16: ( . )
            // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6430:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_VAR | RULE_SYM | RULE_CONF | RULE_PARAG | RULE_PARAD | RULE_SP | RULE_CR | RULE_TAB | RULE_LF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=44;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:142: T__42
                {
                mT__42(); 

                }
                break;
            case 24 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:148: T__43
                {
                mT__43(); 

                }
                break;
            case 25 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:154: T__44
                {
                mT__44(); 

                }
                break;
            case 26 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:160: T__45
                {
                mT__45(); 

                }
                break;
            case 27 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:166: T__46
                {
                mT__46(); 

                }
                break;
            case 28 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:172: T__47
                {
                mT__47(); 

                }
                break;
            case 29 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:178: RULE_VAR
                {
                mRULE_VAR(); 

                }
                break;
            case 30 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:187: RULE_SYM
                {
                mRULE_SYM(); 

                }
                break;
            case 31 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:196: RULE_CONF
                {
                mRULE_CONF(); 

                }
                break;
            case 32 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:206: RULE_PARAG
                {
                mRULE_PARAG(); 

                }
                break;
            case 33 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:217: RULE_PARAD
                {
                mRULE_PARAD(); 

                }
                break;
            case 34 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:228: RULE_SP
                {
                mRULE_SP(); 

                }
                break;
            case 35 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:236: RULE_CR
                {
                mRULE_CR(); 

                }
                break;
            case 36 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:244: RULE_TAB
                {
                mRULE_TAB(); 

                }
                break;
            case 37 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:253: RULE_LF
                {
                mRULE_LF(); 

                }
                break;
            case 38 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:261: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:269: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:278: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:290: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:306: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:322: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // ../language_while.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:330: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\34\1\52\1\56\1\52\1\uffff\1\52\2\uffff\12\52\1\47\1\104\1\52"+
        "\4\47\1\112\1\47\4\uffff\1\115\1\117\1\120\1\121\1\47\1\uffff\2"+
        "\47\1\uffff\1\52\1\126\1\uffff\1\52\1\112\2\uffff\1\52\1\uffff\2"+
        "\52\2\uffff\1\133\1\134\1\135\1\136\1\137\1\52\1\141\3\52\1\145"+
        "\3\52\2\uffff\1\104\1\112\2\uffff\1\34\12\uffff\1\52\1\156\1\uffff"+
        "\4\52\5\uffff\1\52\1\uffff\3\52\1\uffff\1\166\1\167\1\170\1\171"+
        "\1\104\1\112\2\52\1\uffff\1\174\2\52\1\177\1\u0080\1\u0081\1\u0082"+
        "\4\uffff\2\52\1\uffff\1\u0085\1\u0086\4\uffff\2\52\2\uffff\1\52"+
        "\1\u008a\1\u008b\2\uffff";
    static final String DFA18_eofS =
        "\u008c\uffff";
    static final String DFA18_minS =
        "\1\0\1\60\1\75\1\60\1\uffff\1\60\2\uffff\12\60\1\77\5\60\1\52\2"+
        "\60\4\uffff\4\11\1\101\1\uffff\2\0\1\uffff\1\60\1\41\1\uffff\2\60"+
        "\2\uffff\1\60\1\uffff\2\60\2\uffff\5\41\1\60\1\41\3\60\1\41\3\60"+
        "\2\uffff\2\60\2\uffff\1\60\12\uffff\1\60\1\41\1\uffff\4\60\5\uffff"+
        "\1\60\1\uffff\3\60\1\uffff\4\41\4\60\1\uffff\1\41\2\60\4\41\4\uffff"+
        "\2\60\1\uffff\2\41\4\uffff\2\60\2\uffff\1\60\2\41\2\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\172\1\75\1\172\1\uffff\1\172\2\uffff\12\172\1\77\10"+
        "\172\4\uffff\4\40\1\172\1\uffff\2\uffff\1\uffff\2\172\1\uffff\2"+
        "\172\2\uffff\1\172\1\uffff\2\172\2\uffff\16\172\2\uffff\2\172\2"+
        "\uffff\1\172\12\uffff\2\172\1\uffff\4\172\5\uffff\1\172\1\uffff"+
        "\3\172\1\uffff\10\172\1\uffff\7\172\4\uffff\2\172\1\uffff\2\172"+
        "\4\uffff\2\172\2\uffff\3\172\2\uffff";
    static final String DFA18_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\23\uffff\2\37\1\40\1\41\5\uffff\1"+
        "\47\2\uffff\1\54\2\uffff\1\36\2\uffff\1\10\1\2\1\uffff\1\4\2\uffff"+
        "\1\6\1\7\16\uffff\1\32\1\35\2\uffff\1\51\1\52\1\uffff\1\46\1\40"+
        "\1\41\1\42\1\53\1\43\1\44\1\45\1\47\1\50\2\uffff\1\17\4\uffff\1"+
        "\12\1\13\1\30\1\15\1\22\1\uffff\1\26\3\uffff\1\25\10\uffff\1\14"+
        "\7\uffff\1\27\1\31\1\33\1\34\2\uffff\1\3\2\uffff\1\16\1\20\1\23"+
        "\1\24\2\uffff\1\5\1\11\3\uffff\1\21\1\1";
    static final String DFA18_specialS =
        "\1\2\44\uffff\1\0\1\1\145\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\47\1\41\1\40\2\47\1\42\22\47\1\37\1\33\1\45\2\47\1\4\1"+
            "\32\1\46\1\35\1\36\1\47\1\26\1\6\1\25\1\27\1\30\12\44\1\2\1"+
            "\7\1\47\1\22\1\47\1\33\1\47\32\23\3\47\1\43\1\31\1\47\1\20\1"+
            "\24\1\15\1\10\1\14\1\1\1\24\1\17\1\12\2\24\1\16\1\24\1\21\1"+
            "\11\2\24\1\3\1\24\1\13\2\24\1\5\3\24\uff85\47",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\10\53\1\51\5\53"+
            "\1\50\13\53",
            "\1\55",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\4\53\1\57\25\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\7\53\1\62\11\53"+
            "\1\61\10\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\16\53\1\65\13\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\3\53\1\66\15\53"+
            "\1\67\10\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\5\53\1\70\7\53\1"+
            "\71\14\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\7\53\1\72\3\53\1"+
            "\73\16\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\13\53\1\74\16\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\16\53\1\75\13\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\10\53\1\76\21\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\3\53\1\77\26\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\15\53\1\100\14\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\10\53\1\102\5\53"+
            "\1\101\13\53",
            "\1\103",
            "\12\105\7\uffff\32\105\4\uffff\1\106\1\uffff\32\105",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\12\34\4\uffff\1\34\2\uffff\32\34\6\uffff\32\34",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\107\4\uffff\1\110\12\34\7\uffff\32\34\6\uffff\32\34",
            "\12\111\7\uffff\32\111\6\uffff\32\111",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "",
            "",
            "",
            "",
            "\2\116\2\uffff\1\116\22\uffff\1\116",
            "\2\116\2\uffff\1\116\22\uffff\1\116",
            "\2\116\2\uffff\1\116\22\uffff\1\116",
            "\2\116\2\uffff\1\116\22\uffff\1\116",
            "\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\0\123",
            "\0\123",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\15\53\1\124\3\53"+
            "\1\125\10\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\12\127\7\uffff\32\127\6\uffff\32\127",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\1\130\31\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\10\53\1\131\21\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\10\53\1\132\21\53",
            "",
            "",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\4\53\1\140\25\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\22\53\1\142\7\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\15\53\1\143\14\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\22\53\1\144\7\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\3\53\1\146\26\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\17\53\1\150\3\53"+
            "\1\147\6\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\13\53\1\151\16\53",
            "",
            "",
            "\12\105\7\uffff\32\105\4\uffff\1\106\1\uffff\32\105",
            "\12\152\7\uffff\32\152\6\uffff\32\152",
            "",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\153\1\uffff\32\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\2\53\1\154\27\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\4\53\1\155\25\53",
            "",
            "\12\127\7\uffff\32\127\4\uffff\1\54\1\uffff\32\127",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\3\53\1\157\26\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\23\53\1\160\6\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\13\53\1\161\16\53",
            "",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\15\53\1\162\14\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\4\53\1\163\25\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\22\53\1\164\7\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\23\53\1\165\6\53",
            "",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\12\152\7\uffff\32\152\4\uffff\1\106\1\uffff\32\152",
            "\12\111\7\uffff\32\111\6\uffff\32\111",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\23\53\1\172\6\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\1\173\31\53",
            "",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\4\53\1\175\25\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\4\53\1\176\25\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\10\53\1\u0083\21"+
            "\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\2\53\1\u0084\27"+
            "\53",
            "",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\16\53\1\u0087\13"+
            "\53",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\7\53\1\u0088\22"+
            "\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\54\1\uffff\15\53\1\u0089\14"+
            "\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "\1\52\4\uffff\1\52\4\uffff\1\52\1\uffff\3\52\12\53\5\uffff"+
            "\1\52\1\uffff\32\53\4\uffff\1\54\1\uffff\32\53",
            "",
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
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_VAR | RULE_SYM | RULE_CONF | RULE_PARAG | RULE_PARAD | RULE_SP | RULE_CR | RULE_TAB | RULE_LF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_37 = input.LA(1);

                        s = -1;
                        if ( ((LA18_37>='\u0000' && LA18_37<='\uFFFF')) ) {s = 83;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_38 = input.LA(1);

                        s = -1;
                        if ( ((LA18_38>='\u0000' && LA18_38<='\uFFFF')) ) {s = 83;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='f') ) {s = 1;}

                        else if ( (LA18_0==':') ) {s = 2;}

                        else if ( (LA18_0=='r') ) {s = 3;}

                        else if ( (LA18_0=='%') ) {s = 4;}

                        else if ( (LA18_0=='w') ) {s = 5;}

                        else if ( (LA18_0==',') ) {s = 6;}

                        else if ( (LA18_0==';') ) {s = 7;}

                        else if ( (LA18_0=='d') ) {s = 8;}

                        else if ( (LA18_0=='o') ) {s = 9;}

                        else if ( (LA18_0=='i') ) {s = 10;}

                        else if ( (LA18_0=='t') ) {s = 11;}

                        else if ( (LA18_0=='e') ) {s = 12;}

                        else if ( (LA18_0=='c') ) {s = 13;}

                        else if ( (LA18_0=='l') ) {s = 14;}

                        else if ( (LA18_0=='h') ) {s = 15;}

                        else if ( (LA18_0=='a') ) {s = 16;}

                        else if ( (LA18_0=='n') ) {s = 17;}

                        else if ( (LA18_0=='=') ) {s = 18;}

                        else if ( ((LA18_0>='A' && LA18_0<='Z')) ) {s = 19;}

                        else if ( (LA18_0=='b'||LA18_0=='g'||(LA18_0>='j' && LA18_0<='k')||LA18_0=='m'||(LA18_0>='p' && LA18_0<='q')||LA18_0=='s'||(LA18_0>='u' && LA18_0<='v')||(LA18_0>='x' && LA18_0<='z')) ) {s = 20;}

                        else if ( (LA18_0=='-') ) {s = 21;}

                        else if ( (LA18_0=='+') ) {s = 22;}

                        else if ( (LA18_0=='.') ) {s = 23;}

                        else if ( (LA18_0=='/') ) {s = 24;}

                        else if ( (LA18_0=='_') ) {s = 25;}

                        else if ( (LA18_0=='&') ) {s = 26;}

                        else if ( (LA18_0=='!'||LA18_0=='?') ) {s = 27;}

                        else if ( (LA18_0=='(') ) {s = 29;}

                        else if ( (LA18_0==')') ) {s = 30;}

                        else if ( (LA18_0==' ') ) {s = 31;}

                        else if ( (LA18_0=='\n') ) {s = 32;}

                        else if ( (LA18_0=='\t') ) {s = 33;}

                        else if ( (LA18_0=='\r') ) {s = 34;}

                        else if ( (LA18_0=='^') ) {s = 35;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 36;}

                        else if ( (LA18_0=='\"') ) {s = 37;}

                        else if ( (LA18_0=='\'') ) {s = 38;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||(LA18_0>='#' && LA18_0<='$')||LA18_0=='*'||LA18_0=='<'||LA18_0=='>'||LA18_0=='@'||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 39;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}