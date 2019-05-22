package it.unibz.inf.ontouml.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntoUMLLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_CARDINALITY=6;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
            // InternalOntoUML.g:12:7: ( 'association' )
            // InternalOntoUML.g:12:9: 'association'
            {
            match("association"); 


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
            // InternalOntoUML.g:13:7: ( 'kind' )
            // InternalOntoUML.g:13:9: 'kind'
            {
            match("kind"); 


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
            // InternalOntoUML.g:14:7: ( 'relatorKind' )
            // InternalOntoUML.g:14:9: 'relatorKind'
            {
            match("relatorKind"); 


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
            // InternalOntoUML.g:15:7: ( 'modeKind' )
            // InternalOntoUML.g:15:9: 'modeKind'
            {
            match("modeKind"); 


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
            // InternalOntoUML.g:16:7: ( 'qualityKind' )
            // InternalOntoUML.g:16:9: 'qualityKind'
            {
            match("qualityKind"); 


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
            // InternalOntoUML.g:17:7: ( 'subkind' )
            // InternalOntoUML.g:17:9: 'subkind'
            {
            match("subkind"); 


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
            // InternalOntoUML.g:18:7: ( 'role' )
            // InternalOntoUML.g:18:9: 'role'
            {
            match("role"); 


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
            // InternalOntoUML.g:19:7: ( 'phase' )
            // InternalOntoUML.g:19:9: 'phase'
            {
            match("phase"); 


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
            // InternalOntoUML.g:20:7: ( 'category' )
            // InternalOntoUML.g:20:9: 'category'
            {
            match("category"); 


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
            // InternalOntoUML.g:21:7: ( 'mixin' )
            // InternalOntoUML.g:21:9: 'mixin'
            {
            match("mixin"); 


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
            // InternalOntoUML.g:22:7: ( 'roleMixin' )
            // InternalOntoUML.g:22:9: 'roleMixin'
            {
            match("roleMixin"); 


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
            // InternalOntoUML.g:23:7: ( 'phaseMixin' )
            // InternalOntoUML.g:23:9: 'phaseMixin'
            {
            match("phaseMixin"); 


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
            // InternalOntoUML.g:24:7: ( 'comparative' )
            // InternalOntoUML.g:24:9: 'comparative'
            {
            match("comparative"); 


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
            // InternalOntoUML.g:25:7: ( 'material' )
            // InternalOntoUML.g:25:9: 'material'
            {
            match("material"); 


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
            // InternalOntoUML.g:26:7: ( 'historical' )
            // InternalOntoUML.g:26:9: 'historical'
            {
            match("historical"); 


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
            // InternalOntoUML.g:27:7: ( 'characterization' )
            // InternalOntoUML.g:27:9: 'characterization'
            {
            match("characterization"); 


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
            // InternalOntoUML.g:28:7: ( 'mediation' )
            // InternalOntoUML.g:28:9: 'mediation'
            {
            match("mediation"); 


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
            // InternalOntoUML.g:29:7: ( 'external dependence' )
            // InternalOntoUML.g:29:9: 'external dependence'
            {
            match("external dependence"); 


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
            // InternalOntoUML.g:30:7: ( 'none' )
            // InternalOntoUML.g:30:9: 'none'
            {
            match("none"); 


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
            // InternalOntoUML.g:31:7: ( 'Aggregation' )
            // InternalOntoUML.g:31:9: 'Aggregation'
            {
            match("Aggregation"); 


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
            // InternalOntoUML.g:32:7: ( 'composition' )
            // InternalOntoUML.g:32:9: 'composition'
            {
            match("composition"); 


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
            // InternalOntoUML.g:33:7: ( 'aka' )
            // InternalOntoUML.g:33:9: 'aka'
            {
            match("aka"); 


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
            // InternalOntoUML.g:34:7: ( 'derivation' )
            // InternalOntoUML.g:34:9: 'derivation'
            {
            match("derivation"); 


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
            // InternalOntoUML.g:35:7: ( '[' )
            // InternalOntoUML.g:35:9: '['
            {
            match('['); 

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
            // InternalOntoUML.g:36:7: ( '..' )
            // InternalOntoUML.g:36:9: '..'
            {
            match(".."); 


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
            // InternalOntoUML.g:37:7: ( ']' )
            // InternalOntoUML.g:37:9: ']'
            {
            match(']'); 

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
            // InternalOntoUML.g:38:7: ( 'generalization' )
            // InternalOntoUML.g:38:9: 'generalization'
            {
            match("generalization"); 


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
            // InternalOntoUML.g:39:7: ( 'generalizationset' )
            // InternalOntoUML.g:39:9: 'generalizationset'
            {
            match("generalizationset"); 


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
            // InternalOntoUML.g:40:7: ( '{' )
            // InternalOntoUML.g:40:9: '{'
            {
            match('{'); 

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
            // InternalOntoUML.g:41:7: ( '}' )
            // InternalOntoUML.g:41:9: '}'
            {
            match('}'); 

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
            // InternalOntoUML.g:42:7: ( 'disjoint' )
            // InternalOntoUML.g:42:9: 'disjoint'
            {
            match("disjoint"); 


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
            // InternalOntoUML.g:43:7: ( 'complete' )
            // InternalOntoUML.g:43:9: 'complete'
            {
            match("complete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_CARDINALITY"
    public final void mRULE_CARDINALITY() throws RecognitionException {
        try {
            int _type = RULE_CARDINALITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOntoUML.g:2657:18: ( ( RULE_INT | '*' ) )
            // InternalOntoUML.g:2657:20: ( RULE_INT | '*' )
            {
            // InternalOntoUML.g:2657:20: ( RULE_INT | '*' )
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
                    // InternalOntoUML.g:2657:21: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:2657:30: '*'
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
            // InternalOntoUML.g:2659:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOntoUML.g:2659:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalOntoUML.g:2659:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOntoUML.g:2659:11: '^'
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

            // InternalOntoUML.g:2659:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalOntoUML.g:2661:19: ( ( '0' .. '9' )+ )
            // InternalOntoUML.g:2661:21: ( '0' .. '9' )+
            {
            // InternalOntoUML.g:2661:21: ( '0' .. '9' )+
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
            	    // InternalOntoUML.g:2661:22: '0' .. '9'
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
            // InternalOntoUML.g:2663:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalOntoUML.g:2663:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalOntoUML.g:2663:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalOntoUML.g:2663:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalOntoUML.g:2663:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalOntoUML.g:2663:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOntoUML.g:2663:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalOntoUML.g:2663:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalOntoUML.g:2663:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalOntoUML.g:2663:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOntoUML.g:2663:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalOntoUML.g:2665:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOntoUML.g:2665:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOntoUML.g:2665:24: ( options {greedy=false; } : . )*
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
            	    // InternalOntoUML.g:2665:52: .
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
            // InternalOntoUML.g:2667:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOntoUML.g:2667:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOntoUML.g:2667:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOntoUML.g:2667:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalOntoUML.g:2667:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntoUML.g:2667:41: ( '\\r' )? '\\n'
                    {
                    // InternalOntoUML.g:2667:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalOntoUML.g:2667:41: '\\r'
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
            // InternalOntoUML.g:2669:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOntoUML.g:2669:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOntoUML.g:2669:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalOntoUML.g:2671:16: ( . )
            // InternalOntoUML.g:2671:18: .
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
        // InternalOntoUML.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_CARDINALITY | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=40;
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
                // InternalOntoUML.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalOntoUML.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalOntoUML.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalOntoUML.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalOntoUML.g:1:208: RULE_CARDINALITY
                {
                mRULE_CARDINALITY(); 

                }
                break;
            case 35 :
                // InternalOntoUML.g:1:225: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // InternalOntoUML.g:1:233: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalOntoUML.g:1:245: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalOntoUML.g:1:261: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalOntoUML.g:1:277: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalOntoUML.g:1:285: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\15\41\1\uffff\1\34\1\uffff\1\41\4\uffff\1\34\1\uffff\3\34\2\uffff\4\41\1\uffff\22\41\3\uffff\1\41\7\uffff\5\41\1\133\26\41\1\uffff\1\164\1\41\1\167\11\41\1\u0081\4\41\1\u0086\6\41\1\uffff\2\41\1\uffff\1\41\1\u0090\4\41\1\u0096\2\41\1\uffff\4\41\1\uffff\11\41\1\uffff\5\41\1\uffff\22\41\1\u00bd\7\41\1\u00c5\2\41\1\u00c8\4\41\1\u00cd\1\u00ce\2\41\1\uffff\5\41\1\u00d6\1\41\1\uffff\2\41\1\uffff\3\41\1\u00dd\2\uffff\1\u00de\3\41\1\uffff\2\41\1\uffff\6\41\2\uffff\1\41\1\u00eb\1\u00ec\1\41\1\u00ee\1\41\1\u00f0\1\u00f1\1\41\1\u00f3\1\u00f4\1\u00f5\2\uffff\1\u00f6\1\uffff\1\41\2\uffff\1\41\4\uffff\4\41\1\u00fe\2\41\1\uffff\1\u0101\1\41\1\uffff\1\u0103\1\uffff";
    static final String DFA13_eofS =
        "\u0104\uffff";
    static final String DFA13_minS =
        "\1\0\1\141\1\153\1\151\1\145\1\141\2\165\1\150\1\151\1\170\1\157\1\147\1\145\1\uffff\1\56\1\uffff\1\145\4\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\141\1\164\1\155\1\141\1\uffff\1\163\1\141\1\156\2\154\1\144\1\170\1\164\1\144\1\141\1\142\1\141\1\163\1\164\1\156\1\147\1\162\1\163\3\uffff\1\156\7\uffff\1\163\1\145\1\160\1\162\1\157\1\60\1\144\1\141\2\145\1\151\1\145\1\151\1\154\1\153\1\163\1\164\2\145\1\162\1\151\1\152\1\145\1\163\1\147\2\141\1\143\1\uffff\1\60\1\164\1\60\1\113\1\156\1\162\1\141\2\151\1\145\1\157\1\162\1\60\1\145\1\166\1\157\1\162\1\60\1\157\1\162\1\163\1\145\1\143\1\151\1\uffff\1\157\1\151\1\uffff\1\151\1\60\1\151\2\164\1\156\1\60\1\162\1\156\1\uffff\1\147\1\141\1\151\1\141\1\uffff\1\162\1\141\1\151\2\164\1\141\1\162\1\170\1\156\1\uffff\1\141\1\151\1\171\1\144\1\151\1\uffff\1\151\2\141\1\164\1\156\1\154\1\171\2\164\2\145\1\164\1\113\1\151\1\144\1\154\1\157\1\113\1\60\1\170\1\143\1\154\1\164\1\151\1\164\1\151\1\60\2\151\1\60\1\162\2\151\1\156\2\60\1\156\1\151\1\uffff\1\151\1\141\1\40\1\151\1\157\1\60\1\172\1\uffff\1\166\1\157\1\uffff\1\151\1\157\1\156\1\60\2\uffff\1\60\2\156\1\154\1\uffff\1\157\1\156\1\uffff\1\141\1\145\1\156\1\172\1\156\1\144\2\uffff\1\144\2\60\1\156\1\60\1\164\2\60\1\141\3\60\2\uffff\1\60\1\uffff\1\151\2\uffff\1\164\4\uffff\1\157\1\151\1\156\1\157\1\60\1\156\1\145\1\uffff\1\60\1\164\1\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\157\1\163\1\151\2\157\2\165\1\150\1\151\1\170\1\157\1\147\1\151\1\uffff\1\56\1\uffff\1\145\4\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\141\1\164\1\155\1\141\1\uffff\1\163\1\141\1\156\2\154\1\144\1\170\1\164\1\144\1\141\1\142\1\141\1\163\1\164\1\156\1\147\1\162\1\163\3\uffff\1\156\7\uffff\1\163\1\145\1\160\1\162\1\157\1\172\1\144\1\141\2\145\1\151\1\145\1\151\1\154\1\153\1\163\1\164\2\145\1\162\1\151\1\152\1\145\1\163\1\147\1\157\1\141\1\143\1\uffff\1\172\1\164\1\172\1\113\1\156\1\162\1\141\2\151\1\145\1\157\1\162\1\172\1\145\1\166\1\157\1\162\1\172\1\157\1\162\1\163\1\145\1\143\1\151\1\uffff\1\157\1\151\1\uffff\1\151\1\172\1\151\2\164\1\156\1\172\1\162\1\156\1\uffff\1\147\1\141\1\151\1\141\1\uffff\1\162\1\141\1\151\2\164\1\141\1\162\1\170\1\156\1\uffff\1\141\1\151\1\171\1\144\1\151\1\uffff\1\151\2\141\1\164\1\156\1\154\1\171\2\164\2\145\1\164\1\113\1\151\1\144\1\154\1\157\1\113\1\172\1\170\1\143\1\154\1\164\1\151\1\164\1\151\1\172\2\151\1\172\1\162\2\151\1\156\2\172\1\156\1\151\1\uffff\1\151\1\141\1\40\1\151\1\157\2\172\1\uffff\1\166\1\157\1\uffff\1\151\1\157\1\156\1\172\2\uffff\1\172\2\156\1\154\1\uffff\1\157\1\156\1\uffff\1\141\1\145\1\156\1\172\1\156\1\144\2\uffff\1\144\2\172\1\156\1\172\1\164\2\172\1\141\3\172\2\uffff\1\172\1\uffff\1\151\2\uffff\1\164\4\uffff\1\157\1\151\1\156\1\157\1\172\1\156\1\145\1\uffff\1\172\1\164\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\16\uffff\1\31\1\uffff\1\33\1\uffff\1\36\1\37\2\42\1\uffff\1\43\3\uffff\1\47\1\50\4\uffff\1\43\22\uffff\1\31\1\32\1\33\1\uffff\1\36\1\37\1\42\1\44\1\45\1\46\1\47\34\uffff\1\27\30\uffff\1\3\2\uffff\1\10\11\uffff\1\24\4\uffff\1\1\11\uffff\1\13\5\uffff\1\11\46\uffff\1\7\7\uffff\1\12\2\uffff\1\41\4\uffff\1\5\1\17\4\uffff\1\23\2\uffff\1\40\6\uffff\1\14\1\22\14\uffff\1\15\1\20\1\uffff\1\30\1\uffff\1\16\1\26\1\uffff\1\2\1\4\1\6\1\25\7\uffff\1\34\2\uffff\1\21\1\uffff\1\35";
    static final String DFA13_specialS =
        "\1\2\27\uffff\1\1\1\0\u00ea\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\30\4\34\1\31\2\34\1\25\3\34\1\17\1\32\12\24\7\34\1\14\31\27\1\16\1\34\1\20\1\26\1\27\1\34\1\2\1\27\1\1\1\15\1\12\1\27\1\21\1\11\2\27\1\3\1\27\1\5\1\13\1\27\1\10\1\6\1\4\1\7\7\27\1\22\1\34\1\23\uff82\34",
            "\1\36\6\uffff\1\40\3\uffff\1\35\2\uffff\1\37",
            "\1\43\7\uffff\1\42",
            "\1\44",
            "\1\45\11\uffff\1\46",
            "\1\51\3\uffff\1\52\3\uffff\1\50\5\uffff\1\47",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62\3\uffff\1\63",
            "",
            "\1\65",
            "",
            "\1\67",
            "",
            "",
            "",
            "",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\0\73",
            "\0\73",
            "\1\74\4\uffff\1\75",
            "",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "",
            "",
            "\1\125",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157\12\uffff\1\161\2\uffff\1\160",
            "\1\162",
            "\1\163",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\165",
            "\12\41\7\uffff\14\41\1\166\15\41\4\uffff\1\41\1\uffff\32\41",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "",
            "\1\u008f",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\41\7\uffff\14\41\1\u0095\15\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00c6",
            "\1\u00c7",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d7",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "",
            "\1\u00ea",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00ed",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00ef",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00f2",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00f7",
            "",
            "",
            "\1\u00f8",
            "",
            "",
            "",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\22\41\1\u00fd\7\41",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0102",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_CARDINALITY | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_25 = input.LA(1);

                        s = -1;
                        if ( ((LA13_25>='\u0000' && LA13_25<='\uFFFF')) ) {s = 59;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_24 = input.LA(1);

                        s = -1;
                        if ( ((LA13_24>='\u0000' && LA13_24<='\uFFFF')) ) {s = 59;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='c') ) {s = 1;}

                        else if ( (LA13_0=='a') ) {s = 2;}

                        else if ( (LA13_0=='k') ) {s = 3;}

                        else if ( (LA13_0=='r') ) {s = 4;}

                        else if ( (LA13_0=='m') ) {s = 5;}

                        else if ( (LA13_0=='q') ) {s = 6;}

                        else if ( (LA13_0=='s') ) {s = 7;}

                        else if ( (LA13_0=='p') ) {s = 8;}

                        else if ( (LA13_0=='h') ) {s = 9;}

                        else if ( (LA13_0=='e') ) {s = 10;}

                        else if ( (LA13_0=='n') ) {s = 11;}

                        else if ( (LA13_0=='A') ) {s = 12;}

                        else if ( (LA13_0=='d') ) {s = 13;}

                        else if ( (LA13_0=='[') ) {s = 14;}

                        else if ( (LA13_0=='.') ) {s = 15;}

                        else if ( (LA13_0==']') ) {s = 16;}

                        else if ( (LA13_0=='g') ) {s = 17;}

                        else if ( (LA13_0=='{') ) {s = 18;}

                        else if ( (LA13_0=='}') ) {s = 19;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 20;}

                        else if ( (LA13_0=='*') ) {s = 21;}

                        else if ( (LA13_0=='^') ) {s = 22;}

                        else if ( ((LA13_0>='B' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||LA13_0=='f'||(LA13_0>='i' && LA13_0<='j')||LA13_0=='l'||LA13_0=='o'||(LA13_0>='t' && LA13_0<='z')) ) {s = 23;}

                        else if ( (LA13_0=='\"') ) {s = 24;}

                        else if ( (LA13_0=='\'') ) {s = 25;}

                        else if ( (LA13_0=='/') ) {s = 26;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 27;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='-')||(LA13_0>=':' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 28;}

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