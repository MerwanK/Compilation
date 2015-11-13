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
    public static final int RULE_LF=9;
    public static final int RULE_CR=7;
    public static final int RULE_TAB=8;
    public static final int RULE_SP=6;
    public static final int RULE_ID=13;
    public static final int RULE_CONF=12;
    public static final int RULE_PARAD=11;
    public static final int RULE_PARAG=10;
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
    public static final int RULE_VAR=4;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:11:7: ( 'nop' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:11:9: 'nop'
            {
            match("nop"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:12:7: ( 'while' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:12:9: 'while'
            {
            match("while"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:13:7: ( 'for' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:13:9: 'for'
            {
            match("for"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:14:7: ( 'nil' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:14:9: 'nil'
            {
            match("nil"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:15:7: ( 'fonction' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:15:9: 'fonction'
            {
            match("fonction"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:16:7: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:16:9: ':'
            {
            match(':'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:17:7: ( 'read' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:17:9: 'read'
            {
            match("read"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:18:7: ( '%' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:18:9: '%'
            {
            match('%'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19:7: ( 'write' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19:9: 'write'
            {
            match("write"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:20:7: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:20:9: ','
            {
            match(','); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:21:7: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:21:9: ';'
            {
            match(';'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:22:7: ( ':=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:22:9: ':='
            {
            match(":="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:23:7: ( 'do' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:23:9: 'do'
            {
            match("do"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:24:7: ( 'od' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:24:9: 'od'
            {
            match("od"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:25:7: ( 'if' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:25:9: 'if'
            {
            match("if"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:26:7: ( 'then' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:26:9: 'then'
            {
            match("then"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:27:7: ( 'fi' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:27:9: 'fi'
            {
            match("fi"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:28:7: ( 'else' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:28:9: 'else'
            {
            match("else"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:29:7: ( 'foreach' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:29:9: 'foreach'
            {
            match("foreach"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:30:7: ( 'in' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:30:9: 'in'
            {
            match("in"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:31:7: ( 'cons' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:31:9: 'cons'
            {
            match("cons"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:32:7: ( 'list' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:32:9: 'list'
            {
            match("list"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:33:7: ( 'hd' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:33:9: 'hd'
            {
            match("hd"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:34:7: ( 'tl' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:34:9: 'tl'
            {
            match("tl"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:35:7: ( 'and' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:35:9: 'and'
            {
            match("and"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:36:7: ( 'or' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:36:9: 'or'
            {
            match("or"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:37:7: ( 'not' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:37:9: 'not'
            {
            match("not"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:38:7: ( '=?' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:38:9: '=?'
            {
            match("=?"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:10: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* RULE_CONF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:12: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* RULE_CONF
            {
            matchRange('A','Z'); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:10: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* RULE_CONF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:12: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* RULE_CONF
            {
            matchRange('a','z'); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:11: ( ( ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )* ( '?' | '!' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:13: ( ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )* ( '?' | '!' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:13: ( ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='&'||LA5_0=='+'||(LA5_0>='-' && LA5_0<='/')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:14: ( '-' | '+' | '.' | '/' | '_' | '&' | '->' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            	    {
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:14: ( '-' | '+' | '.' | '/' | '_' | '&' | '->' )
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
            	            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:15: '-'
            	            {
            	            match('-'); 

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:19: '+'
            	            {
            	            match('+'); 

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:23: '.'
            	            {
            	            match('.'); 

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:27: '/'
            	            {
            	            match('/'); 

            	            }
            	            break;
            	        case 5 :
            	            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:31: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;
            	        case 6 :
            	            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:35: '&'
            	            {
            	            match('&'); 

            	            }
            	            break;
            	        case 7 :
            	            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:39: '->'
            	            {
            	            match("->"); 


            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:45: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
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
            	    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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

            if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4555:12: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4555:14: '('
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4557:12: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4557:14: ')'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4559:9: ( ' ' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4559:11: ' '
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4561:9: ( '\\n' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4561:11: '\\n'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4563:10: ( '\\t' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4563:12: '\\t'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4565:9: ( '\\r' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4565:11: '\\r'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:11: '^'
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

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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
            	    break loop7;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4569:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4569:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4569:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4569:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop10;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4573:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4573:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4573:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4573:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:41: '\\r'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4577:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4577:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4577:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4579:16: ( . )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4579:18: .
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
        // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_VAR | RULE_SYM | RULE_CONF | RULE_PARAG | RULE_PARAD | RULE_SP | RULE_CR | RULE_TAB | RULE_LF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=44;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:142: T__42
                {
                mT__42(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:148: T__43
                {
                mT__43(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:154: T__44
                {
                mT__44(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:160: T__45
                {
                mT__45(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:166: T__46
                {
                mT__46(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:172: T__47
                {
                mT__47(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:178: RULE_VAR
                {
                mRULE_VAR(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:187: RULE_SYM
                {
                mRULE_SYM(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:196: RULE_CONF
                {
                mRULE_CONF(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:206: RULE_PARAG
                {
                mRULE_PARAG(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:217: RULE_PARAD
                {
                mRULE_PARAD(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:228: RULE_SP
                {
                mRULE_SP(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:236: RULE_CR
                {
                mRULE_CR(); 

                }
                break;
            case 36 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:244: RULE_TAB
                {
                mRULE_TAB(); 

                }
                break;
            case 37 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:253: RULE_LF
                {
                mRULE_LF(); 

                }
                break;
            case 38 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:261: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:269: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:278: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:290: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:306: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:322: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:330: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\3\51\1\62\1\51\3\uffff\11\51\1\46\2\51\4\46\1\51\1\46"+
        "\3\uffff\1\115\1\117\1\120\1\121\1\46\1\uffff\2\46\1\uffff\2\51"+
        "\1\uffff\2\51\1\uffff\3\51\1\134\2\uffff\1\51\3\uffff\1\136\1\137"+
        "\1\140\1\141\1\142\1\51\1\144\3\51\1\150\1\51\1\uffff\2\51\4\uffff"+
        "\1\51\11\uffff\1\154\1\155\1\156\3\51\1\162\1\51\1\uffff\1\51\5"+
        "\uffff\1\51\1\uffff\3\51\1\uffff\1\171\2\51\3\uffff\3\51\1\uffff"+
        "\1\51\1\176\1\177\1\u0080\1\u0081\1\u0082\1\uffff\1\u0083\1\u0084"+
        "\2\51\7\uffff\2\51\1\u0089\1\51\1\uffff\1\u008b\1\uffff";
    static final String DFA17_eofS =
        "\u008c\uffff";
    static final String DFA17_minS =
        "\1\0\3\41\1\75\1\41\3\uffff\11\41\1\77\2\41\3\60\1\52\2\60\3\uffff"+
        "\4\11\1\101\1\uffff\2\0\1\uffff\2\41\1\uffff\1\41\1\60\1\uffff\4"+
        "\41\2\uffff\1\41\3\uffff\14\41\1\uffff\1\41\1\60\4\uffff\1\41\11"+
        "\uffff\10\41\1\uffff\1\41\5\uffff\1\41\1\uffff\3\41\1\uffff\2\41"+
        "\1\60\3\uffff\3\41\1\uffff\6\41\1\uffff\4\41\7\uffff\4\41\1\uffff"+
        "\1\41\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\3\172\1\75\1\172\3\uffff\11\172\1\77\10\172\3\uffff\4"+
        "\40\1\172\1\uffff\2\uffff\1\uffff\2\172\1\uffff\2\172\1\uffff\4"+
        "\172\2\uffff\1\172\3\uffff\14\172\1\uffff\2\172\4\uffff\1\172\11"+
        "\uffff\10\172\1\uffff\1\172\5\uffff\1\172\1\uffff\3\172\1\uffff"+
        "\3\172\3\uffff\3\172\1\uffff\6\172\1\uffff\4\172\7\uffff\4\172\1"+
        "\uffff\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\6\uffff\1\10\1\12\1\13\22\uffff\1\37\1\40\1\41\5\uffff\1\47\2"+
        "\uffff\1\54\2\uffff\1\46\2\uffff\1\36\4\uffff\1\14\1\6\1\uffff\1"+
        "\10\1\12\1\13\14\uffff\1\34\2\uffff\1\35\1\37\1\51\1\52\1\uffff"+
        "\1\40\1\41\1\42\1\53\1\43\1\44\1\45\1\47\1\50\10\uffff\1\21\1\uffff"+
        "\1\15\1\16\1\32\1\17\1\24\1\uffff\1\30\3\uffff\1\27\3\uffff\1\1"+
        "\1\33\1\4\3\uffff\1\3\6\uffff\1\31\4\uffff\1\7\1\20\1\22\1\25\1"+
        "\26\1\2\1\11\4\uffff\1\23\1\uffff\1\5";
    static final String DFA17_specialS =
        "\1\0\43\uffff\1\2\1\1\146\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\46\1\40\1\37\2\46\1\41\22\46\1\36\1\33\1\44\2\46\1\6\1"+
            "\32\1\45\1\34\1\35\1\46\1\26\1\7\1\25\1\27\1\30\12\43\1\4\1"+
            "\10\1\46\1\22\1\46\1\33\1\46\32\23\3\46\1\42\1\31\1\46\1\21"+
            "\1\24\1\16\1\11\1\15\1\3\1\24\1\20\1\13\2\24\1\17\1\24\1\1\1"+
            "\12\2\24\1\5\1\24\1\14\2\24\1\2\3\24\uff85\46",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\50\5\52\1\47"+
            "\13\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\7\52\1\55\11\52\1\56"+
            "\10\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\60\5\52\1\57"+
            "\13\52",
            "\1\61",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\63\25\52",
            "",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\16\52\1\67\13\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\3\52\1\70\15\52\1\71"+
            "\10\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\5\52\1\72\7\52\1\73"+
            "\14\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\7\52\1\74\3\52\1\75"+
            "\16\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\76\16\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\16\52\1\77\13\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\100\21\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\3\52\1\101\26\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\102\14\52",
            "\1\103",
            "\1\106\4\uffff\1\106\4\uffff\1\106\1\uffff\3\106\12\104\5"+
            "\uffff\1\106\1\uffff\32\104\4\uffff\1\105\1\uffff\32\104",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\107\4\uffff\1\107\2\uffff\32\107\6\uffff\32\107",
            "\12\107\7\uffff\32\107\6\uffff\32\107",
            "\12\107\7\uffff\32\107\6\uffff\32\107",
            "\1\110\4\uffff\1\111\12\107\7\uffff\32\107\6\uffff\32\107",
            "\12\112\7\uffff\32\112\6\uffff\32\112",
            "\12\107\7\uffff\32\107\6\uffff\32\107",
            "",
            "",
            "",
            "\2\116\2\uffff\1\116\22\uffff\1\116",
            "\2\116\2\uffff\1\116\22\uffff\1\116",
            "\2\116\2\uffff\1\116\22\uffff\1\116",
            "\2\116\2\uffff\1\116\22\uffff\1\116",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\0\123",
            "\0\123",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\17\52\1\124\3\52\1"+
            "\125\6\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\126\16\52",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\12\127\7\uffff\32\127\6\uffff\32\127",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\130\21\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\131\21\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\133\3\52\1"+
            "\132\10\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\1\135\31\52",
            "",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\143\25\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\22\52\1\145\7\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\146\14\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\22\52\1\147\7\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\3\52\1\151\26\52",
            "",
            "\1\106\4\uffff\1\106\4\uffff\1\106\1\uffff\3\106\12\104\5"+
            "\uffff\1\106\1\uffff\32\104\4\uffff\1\105\1\uffff\32\104",
            "\12\152\7\uffff\32\152\6\uffff\32\152",
            "",
            "",
            "",
            "",
            "\1\107\4\uffff\1\107\4\uffff\1\107\1\uffff\3\107\12\112\5"+
            "\uffff\1\107\1\uffff\32\112\4\uffff\1\153\1\uffff\32\112",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\127\5\uffff"+
            "\1\54\1\uffff\32\127\4\uffff\1\53\1\uffff\32\127",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\13\52\1\157\16\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\23\52\1\160\6\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\161\25\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\2\52\1\163\27\52",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\3\52\1\164\26\52",
            "",
            "",
            "",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\165\14\52",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\166\25\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\22\52\1\167\7\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\23\52\1\170\6\52",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\106\4\uffff\1\106\4\uffff\1\106\1\uffff\3\106\12\152\5"+
            "\uffff\1\106\1\uffff\32\152\4\uffff\1\105\1\uffff\32\152",
            "\12\112\7\uffff\32\112\6\uffff\32\112",
            "",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\172\25\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\4\52\1\173\25\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\1\174\31\52",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\23\52\1\175\6\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\2\52\1\u0085\27\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\10\52\1\u0086\21\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\7\52\1\u0087\22\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\16\52\1\u0088\13\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\15\52\1\u008a\14\52",
            "",
            "\1\54\4\uffff\1\54\4\uffff\1\54\1\uffff\3\54\12\52\5\uffff"+
            "\1\54\1\uffff\32\52\4\uffff\1\53\1\uffff\32\52",
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
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_VAR | RULE_SYM | RULE_CONF | RULE_PARAG | RULE_PARAD | RULE_SP | RULE_CR | RULE_TAB | RULE_LF | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='n') ) {s = 1;}

                        else if ( (LA17_0=='w') ) {s = 2;}

                        else if ( (LA17_0=='f') ) {s = 3;}

                        else if ( (LA17_0==':') ) {s = 4;}

                        else if ( (LA17_0=='r') ) {s = 5;}

                        else if ( (LA17_0=='%') ) {s = 6;}

                        else if ( (LA17_0==',') ) {s = 7;}

                        else if ( (LA17_0==';') ) {s = 8;}

                        else if ( (LA17_0=='d') ) {s = 9;}

                        else if ( (LA17_0=='o') ) {s = 10;}

                        else if ( (LA17_0=='i') ) {s = 11;}

                        else if ( (LA17_0=='t') ) {s = 12;}

                        else if ( (LA17_0=='e') ) {s = 13;}

                        else if ( (LA17_0=='c') ) {s = 14;}

                        else if ( (LA17_0=='l') ) {s = 15;}

                        else if ( (LA17_0=='h') ) {s = 16;}

                        else if ( (LA17_0=='a') ) {s = 17;}

                        else if ( (LA17_0=='=') ) {s = 18;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')) ) {s = 19;}

                        else if ( (LA17_0=='b'||LA17_0=='g'||(LA17_0>='j' && LA17_0<='k')||LA17_0=='m'||(LA17_0>='p' && LA17_0<='q')||LA17_0=='s'||(LA17_0>='u' && LA17_0<='v')||(LA17_0>='x' && LA17_0<='z')) ) {s = 20;}

                        else if ( (LA17_0=='-') ) {s = 21;}

                        else if ( (LA17_0=='+') ) {s = 22;}

                        else if ( (LA17_0=='.') ) {s = 23;}

                        else if ( (LA17_0=='/') ) {s = 24;}

                        else if ( (LA17_0=='_') ) {s = 25;}

                        else if ( (LA17_0=='&') ) {s = 26;}

                        else if ( (LA17_0=='!'||LA17_0=='?') ) {s = 27;}

                        else if ( (LA17_0=='(') ) {s = 28;}

                        else if ( (LA17_0==')') ) {s = 29;}

                        else if ( (LA17_0==' ') ) {s = 30;}

                        else if ( (LA17_0=='\n') ) {s = 31;}

                        else if ( (LA17_0=='\t') ) {s = 32;}

                        else if ( (LA17_0=='\r') ) {s = 33;}

                        else if ( (LA17_0=='^') ) {s = 34;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 35;}

                        else if ( (LA17_0=='\"') ) {s = 36;}

                        else if ( (LA17_0=='\'') ) {s = 37;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||(LA17_0>='#' && LA17_0<='$')||LA17_0=='*'||LA17_0=='<'||LA17_0=='>'||LA17_0=='@'||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_37 = input.LA(1);

                        s = -1;
                        if ( ((LA17_37>='\u0000' && LA17_37<='\uFFFF')) ) {s = 83;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_36 = input.LA(1);

                        s = -1;
                        if ( ((LA17_36>='\u0000' && LA17_36<='\uFFFF')) ) {s = 83;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}