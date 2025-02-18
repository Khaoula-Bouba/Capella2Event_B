package org.xtext.example.eventBDSL.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventBDSLLexer extends Lexer {
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_EVENTB_TYPE_KEYWORD=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalEventBDSLLexer() {;} 
    public InternalEventBDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEventBDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEventBDSL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEventBDSL.g:11:7: ( 'SYSTEM' )
            // InternalEventBDSL.g:11:9: 'SYSTEM'
            {
            match("SYSTEM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEventBDSL.g:12:7: ( 'SETS' )
            // InternalEventBDSL.g:12:9: 'SETS'
            {
            match("SETS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEventBDSL.g:13:7: ( ';' )
            // InternalEventBDSL.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEventBDSL.g:14:7: ( 'VARIABLES' )
            // InternalEventBDSL.g:14:9: 'VARIABLES'
            {
            match("VARIABLES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEventBDSL.g:15:7: ( ',' )
            // InternalEventBDSL.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEventBDSL.g:16:7: ( 'INVARIANT' )
            // InternalEventBDSL.g:16:9: 'INVARIANT'
            {
            match("INVARIANT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEventBDSL.g:17:7: ( '&' )
            // InternalEventBDSL.g:17:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEventBDSL.g:18:7: ( 'INITIALISATION' )
            // InternalEventBDSL.g:18:9: 'INITIALISATION'
            {
            match("INITIALISATION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEventBDSL.g:19:7: ( '||' )
            // InternalEventBDSL.g:19:9: '||'
            {
            match("||"); 


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
            // InternalEventBDSL.g:20:7: ( 'EVENTS' )
            // InternalEventBDSL.g:20:9: 'EVENTS'
            {
            match("EVENTS"); 


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
            // InternalEventBDSL.g:21:7: ( 'END' )
            // InternalEventBDSL.g:21:9: 'END'
            {
            match("END"); 


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
            // InternalEventBDSL.g:22:7: ( '//' )
            // InternalEventBDSL.g:22:9: '//'
            {
            match("//"); 


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
            // InternalEventBDSL.g:23:7: ( '=' )
            // InternalEventBDSL.g:23:9: '='
            {
            match('='); 

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
            // InternalEventBDSL.g:24:7: ( '{' )
            // InternalEventBDSL.g:24:9: '{'
            {
            match('{'); 

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
            // InternalEventBDSL.g:25:7: ( '}' )
            // InternalEventBDSL.g:25:9: '}'
            {
            match('}'); 

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
            // InternalEventBDSL.g:26:7: ( ':' )
            // InternalEventBDSL.g:26:9: ':'
            {
            match(':'); 

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
            // InternalEventBDSL.g:27:7: ( '(' )
            // InternalEventBDSL.g:27:9: '('
            {
            match('('); 

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
            // InternalEventBDSL.g:28:7: ( '=>' )
            // InternalEventBDSL.g:28:9: '=>'
            {
            match("=>"); 


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
            // InternalEventBDSL.g:29:7: ( ')' )
            // InternalEventBDSL.g:29:9: ')'
            {
            match(')'); 

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
            // InternalEventBDSL.g:30:7: ( 'or' )
            // InternalEventBDSL.g:30:9: 'or'
            {
            match("or"); 


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
            // InternalEventBDSL.g:31:7: ( '/=' )
            // InternalEventBDSL.g:31:9: '/='
            {
            match("/="); 


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
            // InternalEventBDSL.g:32:7: ( ':=' )
            // InternalEventBDSL.g:32:9: ':='
            {
            match(":="); 


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
            // InternalEventBDSL.g:33:7: ( '\\n' )
            // InternalEventBDSL.g:33:9: '\\n'
            {
            match('\n'); 

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
            // InternalEventBDSL.g:34:7: ( 'ANY' )
            // InternalEventBDSL.g:34:9: 'ANY'
            {
            match("ANY"); 


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
            // InternalEventBDSL.g:35:7: ( 'WHERE' )
            // InternalEventBDSL.g:35:9: 'WHERE'
            {
            match("WHERE"); 


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
            // InternalEventBDSL.g:36:7: ( 'THEN' )
            // InternalEventBDSL.g:36:9: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_EVENTB_TYPE_KEYWORD"
    public final void mRULE_EVENTB_TYPE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_EVENTB_TYPE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEventBDSL.g:1579:26: ( ( 'BOOL' | 'FALSE' | 'TRUE' | 'NATURAL' | 'NATURAL1' | 'FLOAT' | 'INTEGER' ) )
            // InternalEventBDSL.g:1579:28: ( 'BOOL' | 'FALSE' | 'TRUE' | 'NATURAL' | 'NATURAL1' | 'FLOAT' | 'INTEGER' )
            {
            // InternalEventBDSL.g:1579:28: ( 'BOOL' | 'FALSE' | 'TRUE' | 'NATURAL' | 'NATURAL1' | 'FLOAT' | 'INTEGER' )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalEventBDSL.g:1579:29: 'BOOL'
                    {
                    match("BOOL"); 


                    }
                    break;
                case 2 :
                    // InternalEventBDSL.g:1579:36: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;
                case 3 :
                    // InternalEventBDSL.g:1579:44: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 4 :
                    // InternalEventBDSL.g:1579:51: 'NATURAL'
                    {
                    match("NATURAL"); 


                    }
                    break;
                case 5 :
                    // InternalEventBDSL.g:1579:61: 'NATURAL1'
                    {
                    match("NATURAL1"); 


                    }
                    break;
                case 6 :
                    // InternalEventBDSL.g:1579:72: 'FLOAT'
                    {
                    match("FLOAT"); 


                    }
                    break;
                case 7 :
                    // InternalEventBDSL.g:1579:80: 'INTEGER'
                    {
                    match("INTEGER"); 


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
    // $ANTLR end "RULE_EVENTB_TYPE_KEYWORD"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEventBDSL.g:1581:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalEventBDSL.g:1581:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalEventBDSL.g:1581:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEventBDSL.g:1581:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalEventBDSL.g:1581:27: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEventBDSL.g:1583:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalEventBDSL.g:1583:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalEventBDSL.g:1583:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEventBDSL.g:1583:11: '^'
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

            // InternalEventBDSL.g:1583:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEventBDSL.g:
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
            	    break loop4;
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
            // InternalEventBDSL.g:1585:10: ( ( '0' .. '9' )+ )
            // InternalEventBDSL.g:1585:12: ( '0' .. '9' )+
            {
            // InternalEventBDSL.g:1585:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEventBDSL.g:1585:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEventBDSL.g:1587:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEventBDSL.g:1587:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEventBDSL.g:1587:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEventBDSL.g:1587:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // InternalEventBDSL.g:1589:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEventBDSL.g:1589:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEventBDSL.g:1589:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEventBDSL.g:1589:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);

            // InternalEventBDSL.g:1589:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEventBDSL.g:1589:41: ( '\\r' )? '\\n'
                    {
                    // InternalEventBDSL.g:1589:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalEventBDSL.g:1589:41: '\\r'
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
            // InternalEventBDSL.g:1591:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEventBDSL.g:1591:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEventBDSL.g:1591:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEventBDSL.g:
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // InternalEventBDSL.g:1593:16: ( . )
            // InternalEventBDSL.g:1593:18: .
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
        // InternalEventBDSL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_EVENTB_TYPE_KEYWORD | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=34;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalEventBDSL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalEventBDSL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalEventBDSL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalEventBDSL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalEventBDSL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalEventBDSL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalEventBDSL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalEventBDSL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalEventBDSL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalEventBDSL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalEventBDSL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalEventBDSL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalEventBDSL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalEventBDSL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalEventBDSL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalEventBDSL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalEventBDSL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalEventBDSL.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalEventBDSL.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalEventBDSL.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalEventBDSL.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalEventBDSL.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalEventBDSL.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalEventBDSL.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalEventBDSL.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalEventBDSL.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalEventBDSL.g:1:166: RULE_EVENTB_TYPE_KEYWORD
                {
                mRULE_EVENTB_TYPE_KEYWORD(); 

                }
                break;
            case 28 :
                // InternalEventBDSL.g:1:191: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // InternalEventBDSL.g:1:203: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // InternalEventBDSL.g:1:211: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // InternalEventBDSL.g:1:220: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // InternalEventBDSL.g:1:236: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // InternalEventBDSL.g:1:252: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // InternalEventBDSL.g:1:260: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA1_eotS =
        "\15\uffff\1\17\2\uffff";
    static final String DFA1_eofS =
        "\20\uffff";
    static final String DFA1_minS =
        "\1\102\1\uffff\1\101\1\uffff\1\101\3\uffff\1\124\1\125\1\122\1\101\1\114\1\61\2\uffff";
    static final String DFA1_maxS =
        "\1\124\1\uffff\1\114\1\uffff\1\101\3\uffff\1\124\1\125\1\122\1\101\1\114\1\61\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\7\1\2\1\6\6\uffff\1\5\1\4";
    static final String DFA1_specialS =
        "\20\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\3\uffff\1\2\2\uffff\1\5\4\uffff\1\4\5\uffff\1\3",
            "",
            "\1\6\12\uffff\1\7",
            "",
            "\1\10",
            "",
            "",
            "",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "1579:28: ( 'BOOL' | 'FALSE' | 'TRUE' | 'NATURAL' | 'NATURAL1' | 'FLOAT' | 'INTEGER' )";
        }
    }
    static final String DFA11_eotS =
        "\1\uffff\1\40\1\uffff\1\40\1\uffff\1\40\1\uffff\1\35\1\40\1\35\1\55\2\uffff\1\61\2\uffff\1\40\1\65\6\40\2\35\4\uffff\2\40\2\uffff\1\40\1\uffff\1\40\2\uffff\2\40\1\111\12\uffff\1\113\2\uffff\10\40\2\uffff\7\40\1\133\3\uffff\1\134\10\40\1\145\5\40\2\uffff\1\40\1\154\2\155\4\40\1\uffff\5\40\1\167\2\uffff\2\155\1\40\1\171\4\40\1\176\1\uffff\1\40\1\uffff\3\40\1\155\1\uffff\1\155\3\40\1\155\1\u0087\1\u0088\1\40\2\uffff\4\40\1\u008e\1\uffff";
    static final String DFA11_eofS =
        "\u008f\uffff";
    static final String DFA11_minS =
        "\1\0\1\105\1\uffff\1\101\1\uffff\1\116\1\uffff\1\174\1\116\1\52\1\76\2\uffff\1\75\2\uffff\1\162\1\11\1\116\2\110\1\117\2\101\1\0\1\101\4\uffff\1\123\1\124\2\uffff\1\122\1\uffff\1\111\2\uffff\1\105\1\104\1\0\12\uffff\1\60\2\uffff\1\131\2\105\1\125\1\117\1\114\1\117\1\124\2\uffff\1\124\1\123\1\111\1\101\1\124\1\105\1\116\1\60\3\uffff\1\60\1\122\1\116\1\105\1\114\1\123\1\101\1\125\1\105\1\60\1\101\1\122\1\111\1\107\1\124\2\uffff\1\105\3\60\1\105\1\124\1\122\1\115\1\uffff\1\102\1\111\1\101\1\105\1\123\1\60\2\uffff\2\60\1\101\1\60\1\114\1\101\1\114\1\122\1\60\1\uffff\1\114\1\uffff\1\105\1\116\1\111\1\60\1\uffff\1\60\1\123\1\124\1\123\3\60\1\101\2\uffff\1\124\1\111\1\117\1\116\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\131\1\uffff\1\101\1\uffff\1\116\1\uffff\1\174\1\126\1\75\1\76\2\uffff\1\75\2\uffff\1\162\1\40\1\116\1\110\1\122\1\117\1\114\1\101\1\uffff\1\172\4\uffff\1\123\1\124\2\uffff\1\122\1\uffff\1\126\2\uffff\1\105\1\104\1\uffff\12\uffff\1\172\2\uffff\1\131\2\105\1\125\1\117\1\114\1\117\1\124\2\uffff\1\124\1\123\1\111\1\101\1\124\1\105\1\116\1\172\3\uffff\1\172\1\122\1\116\1\105\1\114\1\123\1\101\1\125\1\105\1\172\1\101\1\122\1\111\1\107\1\124\2\uffff\1\105\3\172\1\105\1\124\1\122\1\115\1\uffff\1\102\1\111\1\101\1\105\1\123\1\172\2\uffff\2\172\1\101\1\172\1\114\1\101\1\114\1\122\1\172\1\uffff\1\114\1\uffff\1\105\1\116\1\111\1\172\1\uffff\1\172\1\123\1\124\1\123\3\172\1\101\2\uffff\1\124\1\111\1\117\1\116\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\3\1\uffff\1\5\1\uffff\1\7\4\uffff\1\16\1\17\1\uffff\1\21\1\23\12\uffff\1\35\1\36\1\41\1\42\2\uffff\1\35\1\3\1\uffff\1\5\1\uffff\1\7\1\11\3\uffff\1\25\1\37\1\22\1\15\1\16\1\17\1\26\1\20\1\21\1\23\1\uffff\1\27\1\41\10\uffff\1\34\1\36\10\uffff\1\14\1\40\1\24\17\uffff\1\13\1\30\10\uffff\1\2\6\uffff\1\32\1\33\11\uffff\1\31\1\uffff\1\1\4\uffff\1\12\10\uffff\1\4\1\6\5\uffff\1\10";
    static final String DFA11_specialS =
        "\1\0\27\uffff\1\1\20\uffff\1\2\145\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\35\1\34\1\21\2\35\1\34\22\35\1\34\1\35\1\30\3\35\1\6\1\35\1\16\1\17\2\35\1\4\2\35\1\11\12\33\1\15\1\2\1\35\1\12\3\35\1\22\1\25\2\32\1\10\1\26\2\32\1\5\4\32\1\27\4\32\1\1\1\24\1\32\1\3\1\23\3\32\3\35\1\31\1\32\1\35\16\32\1\20\13\32\1\13\1\7\1\14\uff82\35",
            "\1\37\23\uffff\1\36",
            "",
            "\1\42",
            "",
            "\1\44",
            "",
            "\1\46",
            "\1\50\7\uffff\1\47",
            "\1\53\4\uffff\1\51\15\uffff\1\52",
            "\1\54",
            "",
            "",
            "\1\60",
            "",
            "",
            "\1\64",
            "\2\66\2\uffff\1\66\22\uffff\1\66",
            "\1\67",
            "\1\70",
            "\1\71\11\uffff\1\72",
            "\1\73",
            "\1\74\12\uffff\1\75",
            "\1\76",
            "\0\77",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "",
            "",
            "\1\103",
            "",
            "\1\105\12\uffff\1\106\1\uffff\1\104",
            "",
            "",
            "\1\107",
            "\1\110",
            "\0\112",
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
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "",
            "\1\153",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\170",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\177",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\40\1\u0083\10\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0089",
            "",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_EVENTB_TYPE_KEYWORD | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='S') ) {s = 1;}

                        else if ( (LA11_0==';') ) {s = 2;}

                        else if ( (LA11_0=='V') ) {s = 3;}

                        else if ( (LA11_0==',') ) {s = 4;}

                        else if ( (LA11_0=='I') ) {s = 5;}

                        else if ( (LA11_0=='&') ) {s = 6;}

                        else if ( (LA11_0=='|') ) {s = 7;}

                        else if ( (LA11_0=='E') ) {s = 8;}

                        else if ( (LA11_0=='/') ) {s = 9;}

                        else if ( (LA11_0=='=') ) {s = 10;}

                        else if ( (LA11_0=='{') ) {s = 11;}

                        else if ( (LA11_0=='}') ) {s = 12;}

                        else if ( (LA11_0==':') ) {s = 13;}

                        else if ( (LA11_0=='(') ) {s = 14;}

                        else if ( (LA11_0==')') ) {s = 15;}

                        else if ( (LA11_0=='o') ) {s = 16;}

                        else if ( (LA11_0=='\n') ) {s = 17;}

                        else if ( (LA11_0=='A') ) {s = 18;}

                        else if ( (LA11_0=='W') ) {s = 19;}

                        else if ( (LA11_0=='T') ) {s = 20;}

                        else if ( (LA11_0=='B') ) {s = 21;}

                        else if ( (LA11_0=='F') ) {s = 22;}

                        else if ( (LA11_0=='N') ) {s = 23;}

                        else if ( (LA11_0=='\"') ) {s = 24;}

                        else if ( (LA11_0=='^') ) {s = 25;}

                        else if ( ((LA11_0>='C' && LA11_0<='D')||(LA11_0>='G' && LA11_0<='H')||(LA11_0>='J' && LA11_0<='M')||(LA11_0>='O' && LA11_0<='R')||LA11_0=='U'||(LA11_0>='X' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='n')||(LA11_0>='p' && LA11_0<='z')) ) {s = 26;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 27;}

                        else if ( (LA11_0=='\t'||LA11_0=='\r'||LA11_0==' ') ) {s = 28;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='%')||LA11_0=='\''||(LA11_0>='*' && LA11_0<='+')||(LA11_0>='-' && LA11_0<='.')||LA11_0=='<'||(LA11_0>='>' && LA11_0<='@')||(LA11_0>='[' && LA11_0<=']')||LA11_0=='`'||(LA11_0>='~' && LA11_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_24 = input.LA(1);

                        s = -1;
                        if ( ((LA11_24>='\u0000' && LA11_24<='\uFFFF')) ) {s = 63;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_41 = input.LA(1);

                        s = -1;
                        if ( ((LA11_41>='\u0000' && LA11_41<='\uFFFF')) ) {s = 74;}

                        else s = 73;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}