package it.unibz.inf.ontouml.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntoUMLLexer extends Lexer {
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int RULE_CARDINALITY=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalOntoUMLLexer() {;} 
    public InternalOntoUMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOntoUMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalOntoUML.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntoUML.g:11:7: ( 'class' )
            // InternalOntoUML.g:11:9: 'class'
            {
            match("class"); 


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
            // InternalOntoUML.g:12:7: ( 'aka' )
            // InternalOntoUML.g:12:9: 'aka'
            {
            match("aka"); 


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
            // InternalOntoUML.g:13:7: ( 'association' )
            // InternalOntoUML.g:13:9: 'association'
            {
            match("association"); 


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
            // InternalOntoUML.g:14:7: ( 'derivation' )
            // InternalOntoUML.g:14:9: 'derivation'
            {
            match("derivation"); 


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
            // InternalOntoUML.g:15:7: ( '[' )
            // InternalOntoUML.g:15:9: '['
            {
            match('['); 

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
            // InternalOntoUML.g:16:7: ( '..' )
            // InternalOntoUML.g:16:9: '..'
            {
            match(".."); 


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
            // InternalOntoUML.g:17:7: ( ']' )
            // InternalOntoUML.g:17:9: ']'
            {
            match(']'); 

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
            // InternalOntoUML.g:18:7: ( 'generalization' )
            // InternalOntoUML.g:18:9: 'generalization'
            {
            match("generalization"); 


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
            // InternalOntoUML.g:19:7: ( 'disjoint' )
            // InternalOntoUML.g:19:9: 'disjoint'
            {
            match("disjoint"); 


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
            // InternalOntoUML.g:20:7: ( 'complete' )
            // InternalOntoUML.g:20:9: 'complete'
            {
            match("complete"); 


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
            // InternalOntoUML.g:21:7: ( 'generalizationset' )
            // InternalOntoUML.g:21:9: 'generalizationset'
            {
            match("generalizationset"); 


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
            // InternalOntoUML.g:22:7: ( '{' )
            // InternalOntoUML.g:22:9: '{'
            {
            match('{'); 

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
            // InternalOntoUML.g:23:7: ( '}' )
            // InternalOntoUML.g:23:9: '}'
            {
            match('}'); 

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
            // InternalOntoUML.g:24:7: ( 'kind' )
            // InternalOntoUML.g:24:9: 'kind'
            {
            match("kind"); 


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
            // InternalOntoUML.g:25:7: ( 'relatorKind' )
            // InternalOntoUML.g:25:9: 'relatorKind'
            {
            match("relatorKind"); 


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
            // InternalOntoUML.g:26:7: ( 'modeKind' )
            // InternalOntoUML.g:26:9: 'modeKind'
            {
            match("modeKind"); 


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
            // InternalOntoUML.g:27:7: ( 'qualityKind' )
            // InternalOntoUML.g:27:9: 'qualityKind'
            {
            match("qualityKind"); 


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
            // InternalOntoUML.g:28:7: ( 'subkind' )
            // InternalOntoUML.g:28:9: 'subkind'
            {
            match("subkind"); 


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
            // InternalOntoUML.g:29:7: ( 'role' )
            // InternalOntoUML.g:29:9: 'role'
            {
            match("role"); 


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
            // InternalOntoUML.g:30:7: ( 'phase' )
            // InternalOntoUML.g:30:9: 'phase'
            {
            match("phase"); 


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
            // InternalOntoUML.g:31:7: ( 'category' )
            // InternalOntoUML.g:31:9: 'category'
            {
            match("category"); 


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
            // InternalOntoUML.g:32:7: ( 'mixin' )
            // InternalOntoUML.g:32:9: 'mixin'
            {
            match("mixin"); 


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
            // InternalOntoUML.g:33:7: ( 'roleMixin' )
            // InternalOntoUML.g:33:9: 'roleMixin'
            {
            match("roleMixin"); 


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
            // InternalOntoUML.g:34:7: ( 'phaseMixin' )
            // InternalOntoUML.g:34:9: 'phaseMixin'
            {
            match("phaseMixin"); 


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
            // InternalOntoUML.g:35:7: ( 'descriptive' )
            // InternalOntoUML.g:35:9: 'descriptive'
            {
            match("descriptive"); 


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
            // InternalOntoUML.g:36:7: ( 'non-descriptive' )
            // InternalOntoUML.g:36:9: 'non-descriptive'
            {
            match("non-descriptive"); 


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
            // InternalOntoUML.g:37:7: ( 'inherence' )
            // InternalOntoUML.g:37:9: 'inherence'
            {
            match("inherence"); 


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
            // InternalOntoUML.g:38:7: ( 'involvement' )
            // InternalOntoUML.g:38:9: 'involvement'
            {
            match("involvement"); 


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
            // InternalOntoUML.g:39:7: ( 'dependence' )
            // InternalOntoUML.g:39:9: 'dependence'
            {
            match("dependence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_CARDINALITY"
    public final void mRULE_CARDINALITY() throws RecognitionException {
        try {
            int _type = RULE_CARDINALITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntoUML.g:1138:18: ( ( RULE_INT | '*' ) )
            // InternalOntoUML.g:1138:20: ( RULE_INT | '*' )
            {
            // InternalOntoUML.g:1138:20: ( RULE_INT | '*' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                alt1=1;
            }
            else if ( (LA1_0=='*') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOntoUML.g:1138:21: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:1138:30: '*'
                    {
                    match('*'); 

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
    // $ANTLR end "RULE_CARDINALITY"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntoUML.g:1140:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOntoUML.g:1140:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalOntoUML.g:1140:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOntoUML.g:1140:11: '^'
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

            // InternalOntoUML.g:1140:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOntoUML.g:
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
            	    break loop3;
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
            // InternalOntoUML.g:1142:19: ( ( '0' .. '9' )+ )
            // InternalOntoUML.g:1142:21: ( '0' .. '9' )+
            {
            // InternalOntoUML.g:1142:21: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOntoUML.g:1142:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalOntoUML.g:1144:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalOntoUML.g:1144:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalOntoUML.g:1144:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoUML.g:1144:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalOntoUML.g:1144:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalOntoUML.g:1144:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOntoUML.g:1144:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:1144:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalOntoUML.g:1144:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalOntoUML.g:1144:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOntoUML.g:1144:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalOntoUML.g:1146:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOntoUML.g:1146:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOntoUML.g:1146:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOntoUML.g:1146:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalOntoUML.g:1148:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOntoUML.g:1148:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOntoUML.g:1148:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOntoUML.g:1148:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalOntoUML.g:1148:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntoUML.g:1148:41: ( '\\r' )? '\\n'
                    {
                    // InternalOntoUML.g:1148:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalOntoUML.g:1148:41: '\\r'
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
            // InternalOntoUML.g:1150:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOntoUML.g:1150:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOntoUML.g:1150:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOntoUML.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalOntoUML.g:1152:16: ( . )
            // InternalOntoUML.g:1152:18: .
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
        // InternalOntoUML.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_CARDINALITY | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=36;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalOntoUML.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalOntoUML.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalOntoUML.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalOntoUML.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalOntoUML.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalOntoUML.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalOntoUML.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalOntoUML.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalOntoUML.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalOntoUML.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalOntoUML.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalOntoUML.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalOntoUML.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalOntoUML.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalOntoUML.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalOntoUML.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalOntoUML.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalOntoUML.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalOntoUML.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalOntoUML.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalOntoUML.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalOntoUML.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalOntoUML.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalOntoUML.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalOntoUML.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalOntoUML.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalOntoUML.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalOntoUML.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalOntoUML.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalOntoUML.g:1:184: RULE_CARDINALITY
                {
                mRULE_CARDINALITY(); 

                }
                break;
            case 31 :
                // InternalOntoUML.g:1:201: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // InternalOntoUML.g:1:209: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalOntoUML.g:1:221: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalOntoUML.g:1:237: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // InternalOntoUML.g:1:253: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalOntoUML.g:1:261: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\3\36\1\uffff\1\32\1\uffff\1\36\2\uffff\10\36\2\uffff\1\32\1\uffff\3\32\2\uffff\3\36\1\uffff\4\36\3\uffff\1\36\2\uffff\12\36\5\uffff\3\36\1\120\24\36\1\uffff\6\36\1\153\1\36\1\156\5\36\1\uffff\2\36\1\166\10\36\1\uffff\2\36\1\uffff\1\36\1\u0082\2\36\1\u0086\2\36\1\uffff\13\36\1\uffff\3\36\1\uffff\16\36\1\u00a5\3\36\1\u00a9\1\u00aa\4\36\1\u00af\3\36\1\u00b3\1\36\1\uffff\3\36\2\uffff\4\36\1\uffff\2\36\1\u00be\1\uffff\2\36\1\u00c1\2\36\1\u00c4\1\36\1\u00c6\2\36\1\uffff\1\36\1\u00ca\1\uffff\1\36\1\u00cc\1\uffff\1\u00cd\1\uffff\1\36\1\u00cf\1\u00d0\1\uffff\1\u00d1\2\uffff\1\36\3\uffff\1\36\1\u00d5\1\36\1\uffff\1\36\1\u00d8\1\uffff";
    static final String DFA13_eofS =
        "\u00d9\uffff";
    static final String DFA13_minS =
        "\1\0\1\141\1\153\1\145\1\uffff\1\56\1\uffff\1\145\2\uffff\1\151\1\145\1\151\2\165\1\150\1\157\1\156\2\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\141\1\155\1\164\1\uffff\1\141\1\163\1\160\1\163\3\uffff\1\156\2\uffff\1\156\2\154\1\144\1\170\1\141\1\142\1\141\1\156\1\150\5\uffff\1\163\1\160\1\145\1\60\1\157\1\151\1\143\1\145\1\152\1\145\1\144\1\141\2\145\1\151\1\154\1\153\1\163\1\55\1\145\1\157\1\163\1\154\1\147\1\uffff\1\143\1\166\1\162\1\156\1\157\1\162\1\60\1\164\1\60\1\113\1\156\2\151\1\145\1\uffff\1\162\1\154\1\60\1\145\1\157\1\151\1\141\1\151\1\144\1\151\1\141\1\uffff\1\157\1\151\1\uffff\1\151\1\60\1\164\1\156\1\60\1\145\1\166\1\uffff\1\164\1\162\1\141\1\164\1\160\1\145\1\156\1\154\1\162\1\170\1\156\1\uffff\1\171\1\144\1\151\1\uffff\1\156\2\145\1\171\1\164\1\151\1\164\1\156\1\164\1\151\1\113\1\151\1\144\1\113\1\60\1\170\1\143\1\155\2\60\1\151\1\157\1\151\1\143\1\60\1\172\1\151\1\156\1\60\1\151\1\uffff\1\151\2\145\2\uffff\1\157\1\156\1\166\1\145\1\uffff\1\141\1\156\1\60\1\uffff\2\156\1\60\2\156\1\60\1\145\1\60\1\164\1\144\1\uffff\1\144\1\60\1\uffff\1\164\1\60\1\uffff\1\60\1\uffff\1\151\2\60\1\uffff\1\60\2\uffff\1\157\3\uffff\1\156\1\60\1\145\1\uffff\1\164\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\157\1\163\1\151\1\uffff\1\56\1\uffff\1\145\2\uffff\1\151\2\157\2\165\1\150\1\157\1\156\2\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\141\1\155\1\164\1\uffff\1\141\3\163\3\uffff\1\156\2\uffff\1\156\2\154\1\144\1\170\1\141\1\142\1\141\1\156\1\166\5\uffff\1\163\1\160\1\145\1\172\1\157\1\151\1\143\1\145\1\152\1\145\1\144\1\141\2\145\1\151\1\154\1\153\1\163\1\55\1\145\1\157\1\163\1\154\1\147\1\uffff\1\143\1\166\1\162\1\156\1\157\1\162\1\172\1\164\1\172\1\113\1\156\2\151\1\145\1\uffff\1\162\1\154\1\172\1\145\1\157\1\151\1\141\1\151\1\144\1\151\1\141\1\uffff\1\157\1\151\1\uffff\1\151\1\172\1\164\1\156\1\172\1\145\1\166\1\uffff\1\164\1\162\1\141\1\164\1\160\1\145\1\156\1\154\1\162\1\170\1\156\1\uffff\1\171\1\144\1\151\1\uffff\1\156\2\145\1\171\1\164\1\151\1\164\1\156\1\164\1\151\1\113\1\151\1\144\1\113\1\172\1\170\1\143\1\155\2\172\1\151\1\157\1\151\1\143\2\172\1\151\1\156\1\172\1\151\1\uffff\1\151\2\145\2\uffff\1\157\1\156\1\166\1\145\1\uffff\1\141\1\156\1\172\1\uffff\2\156\1\172\2\156\1\172\1\145\1\172\1\164\1\144\1\uffff\1\144\1\172\1\uffff\1\164\1\172\1\uffff\1\172\1\uffff\1\151\2\172\1\uffff\1\172\2\uffff\1\157\3\uffff\1\156\1\172\1\145\1\uffff\1\164\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\5\1\uffff\1\7\1\uffff\1\14\1\15\10\uffff\2\36\1\uffff\1\37\3\uffff\1\43\1\44\3\uffff\1\37\4\uffff\1\5\1\6\1\7\1\uffff\1\14\1\15\12\uffff\1\36\1\40\1\41\1\42\1\43\30\uffff\1\2\16\uffff\1\32\13\uffff\1\16\2\uffff\1\23\7\uffff\1\1\13\uffff\1\26\3\uffff\1\24\36\uffff\1\22\3\uffff\1\12\1\25\4\uffff\1\11\3\uffff\1\20\12\uffff\1\27\2\uffff\1\33\2\uffff\1\4\1\uffff\1\35\3\uffff\1\30\1\uffff\1\3\1\31\1\uffff\1\17\1\21\1\34\3\uffff\1\10\2\uffff\1\13";
    static final String DFA13_specialS =
        "\1\0\25\uffff\1\1\1\2\u00c1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\26\4\32\1\27\2\32\1\23\3\32\1\5\1\30\12\22\7\32\32\25\1\4\1\32\1\6\1\24\1\25\1\32\1\2\1\25\1\1\1\3\2\25\1\7\1\25\1\21\1\25\1\12\1\25\1\14\1\20\1\25\1\17\1\15\1\13\1\16\7\25\1\10\1\32\1\11\uff82\32",
            "\1\35\12\uffff\1\33\2\uffff\1\34",
            "\1\37\7\uffff\1\40",
            "\1\41\3\uffff\1\42",
            "",
            "\1\44",
            "",
            "\1\46",
            "",
            "",
            "\1\51",
            "\1\52\11\uffff\1\53",
            "\1\55\5\uffff\1\54",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\0\64",
            "\0\64",
            "\1\65\4\uffff\1\66",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "\1\73",
            "\1\74",
            "\1\77\1\uffff\1\75\1\76",
            "\1\100",
            "",
            "",
            "",
            "\1\101",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113\15\uffff\1\114",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\154",
            "\12\36\7\uffff\14\36\1\155\15\36\4\uffff\1\36\1\uffff\32\36",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0083",
            "\1\u0084",
            "\12\36\7\uffff\14\36\1\u0085\15\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00b4",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00c2",
            "\1\u00c3",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00c5",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u00cb",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u00ce",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\u00d2",
            "",
            "",
            "",
            "\1\u00d3",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\u00d4\7\36",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_CARDINALITY | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='c') ) {s = 1;}

                        else if ( (LA13_0=='a') ) {s = 2;}

                        else if ( (LA13_0=='d') ) {s = 3;}

                        else if ( (LA13_0=='[') ) {s = 4;}

                        else if ( (LA13_0=='.') ) {s = 5;}

                        else if ( (LA13_0==']') ) {s = 6;}

                        else if ( (LA13_0=='g') ) {s = 7;}

                        else if ( (LA13_0=='{') ) {s = 8;}

                        else if ( (LA13_0=='}') ) {s = 9;}

                        else if ( (LA13_0=='k') ) {s = 10;}

                        else if ( (LA13_0=='r') ) {s = 11;}

                        else if ( (LA13_0=='m') ) {s = 12;}

                        else if ( (LA13_0=='q') ) {s = 13;}

                        else if ( (LA13_0=='s') ) {s = 14;}

                        else if ( (LA13_0=='p') ) {s = 15;}

                        else if ( (LA13_0=='n') ) {s = 16;}

                        else if ( (LA13_0=='i') ) {s = 17;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 18;}

                        else if ( (LA13_0=='*') ) {s = 19;}

                        else if ( (LA13_0=='^') ) {s = 20;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||(LA13_0>='e' && LA13_0<='f')||LA13_0=='h'||LA13_0=='j'||LA13_0=='l'||LA13_0=='o'||(LA13_0>='t' && LA13_0<='z')) ) {s = 21;}

                        else if ( (LA13_0=='\"') ) {s = 22;}

                        else if ( (LA13_0=='\'') ) {s = 23;}

                        else if ( (LA13_0=='/') ) {s = 24;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 25;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='-')||(LA13_0>=':' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_22 = input.LA(1);

                        s = -1;
                        if ( ((LA13_22>='\u0000' && LA13_22<='\uFFFF')) ) {s = 52;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_23 = input.LA(1);

                        s = -1;
                        if ( ((LA13_23>='\u0000' && LA13_23<='\uFFFF')) ) {s = 52;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}