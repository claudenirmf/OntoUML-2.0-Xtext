package it.unibz.inf.ontouml.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import it.unibz.inf.ontouml.xtext.services.OntoUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntoUMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'}'", "'elements'", "','", "'ModelElement'", "'OntoUMLClass'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalOntoUMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOntoUMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOntoUMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOntoUML.g"; }


    	private OntoUMLGrammarAccess grammarAccess;

    	public void setGrammarAccess(OntoUMLGrammarAccess grammarAccess) {
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
    // InternalOntoUML.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalOntoUML.g:54:1: ( ruleModel EOF )
            // InternalOntoUML.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalOntoUML.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalOntoUML.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalOntoUML.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalOntoUML.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalOntoUML.g:69:3: ( rule__Model__Group__0 )
            // InternalOntoUML.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleModelElement"
    // InternalOntoUML.g:78:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // InternalOntoUML.g:79:1: ( ruleModelElement EOF )
            // InternalOntoUML.g:80:1: ruleModelElement EOF
            {
             before(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_1);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // InternalOntoUML.g:87:1: ruleModelElement : ( ( rule__ModelElement__Alternatives ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:91:2: ( ( ( rule__ModelElement__Alternatives ) ) )
            // InternalOntoUML.g:92:2: ( ( rule__ModelElement__Alternatives ) )
            {
            // InternalOntoUML.g:92:2: ( ( rule__ModelElement__Alternatives ) )
            // InternalOntoUML.g:93:3: ( rule__ModelElement__Alternatives )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives()); 
            // InternalOntoUML.g:94:3: ( rule__ModelElement__Alternatives )
            // InternalOntoUML.g:94:4: rule__ModelElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleModelElement_Impl"
    // InternalOntoUML.g:103:1: entryRuleModelElement_Impl : ruleModelElement_Impl EOF ;
    public final void entryRuleModelElement_Impl() throws RecognitionException {
        try {
            // InternalOntoUML.g:104:1: ( ruleModelElement_Impl EOF )
            // InternalOntoUML.g:105:1: ruleModelElement_Impl EOF
            {
             before(grammarAccess.getModelElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleModelElement_Impl();

            state._fsp--;

             after(grammarAccess.getModelElement_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModelElement_Impl"


    // $ANTLR start "ruleModelElement_Impl"
    // InternalOntoUML.g:112:1: ruleModelElement_Impl : ( ( rule__ModelElement_Impl__Group__0 ) ) ;
    public final void ruleModelElement_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:116:2: ( ( ( rule__ModelElement_Impl__Group__0 ) ) )
            // InternalOntoUML.g:117:2: ( ( rule__ModelElement_Impl__Group__0 ) )
            {
            // InternalOntoUML.g:117:2: ( ( rule__ModelElement_Impl__Group__0 ) )
            // InternalOntoUML.g:118:3: ( rule__ModelElement_Impl__Group__0 )
            {
             before(grammarAccess.getModelElement_ImplAccess().getGroup()); 
            // InternalOntoUML.g:119:3: ( rule__ModelElement_Impl__Group__0 )
            // InternalOntoUML.g:119:4: rule__ModelElement_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelElement_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelElement_Impl"


    // $ANTLR start "entryRuleOntoUMLClass"
    // InternalOntoUML.g:128:1: entryRuleOntoUMLClass : ruleOntoUMLClass EOF ;
    public final void entryRuleOntoUMLClass() throws RecognitionException {
        try {
            // InternalOntoUML.g:129:1: ( ruleOntoUMLClass EOF )
            // InternalOntoUML.g:130:1: ruleOntoUMLClass EOF
            {
             before(grammarAccess.getOntoUMLClassRule()); 
            pushFollow(FOLLOW_1);
            ruleOntoUMLClass();

            state._fsp--;

             after(grammarAccess.getOntoUMLClassRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOntoUMLClass"


    // $ANTLR start "ruleOntoUMLClass"
    // InternalOntoUML.g:137:1: ruleOntoUMLClass : ( ( rule__OntoUMLClass__Group__0 ) ) ;
    public final void ruleOntoUMLClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:141:2: ( ( ( rule__OntoUMLClass__Group__0 ) ) )
            // InternalOntoUML.g:142:2: ( ( rule__OntoUMLClass__Group__0 ) )
            {
            // InternalOntoUML.g:142:2: ( ( rule__OntoUMLClass__Group__0 ) )
            // InternalOntoUML.g:143:3: ( rule__OntoUMLClass__Group__0 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGroup()); 
            // InternalOntoUML.g:144:3: ( rule__OntoUMLClass__Group__0 )
            // InternalOntoUML.g:144:4: rule__OntoUMLClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntoUMLClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntoUMLClass"


    // $ANTLR start "entryRuleEString"
    // InternalOntoUML.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalOntoUML.g:154:1: ( ruleEString EOF )
            // InternalOntoUML.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalOntoUML.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalOntoUML.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalOntoUML.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalOntoUML.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalOntoUML.g:169:3: ( rule__EString__Alternatives )
            // InternalOntoUML.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__ModelElement__Alternatives"
    // InternalOntoUML.g:177:1: rule__ModelElement__Alternatives : ( ( ruleModelElement_Impl ) | ( ruleOntoUMLClass ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:181:1: ( ( ruleModelElement_Impl ) | ( ruleOntoUMLClass ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOntoUML.g:182:2: ( ruleModelElement_Impl )
                    {
                    // InternalOntoUML.g:182:2: ( ruleModelElement_Impl )
                    // InternalOntoUML.g:183:3: ruleModelElement_Impl
                    {
                     before(grammarAccess.getModelElementAccess().getModelElement_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleModelElement_Impl();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getModelElement_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:188:2: ( ruleOntoUMLClass )
                    {
                    // InternalOntoUML.g:188:2: ( ruleOntoUMLClass )
                    // InternalOntoUML.g:189:3: ruleOntoUMLClass
                    {
                     before(grammarAccess.getModelElementAccess().getOntoUMLClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOntoUMLClass();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getOntoUMLClassParserRuleCall_1()); 

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
    // $ANTLR end "rule__ModelElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalOntoUML.g:198:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:202:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalOntoUML.g:203:2: ( RULE_STRING )
                    {
                    // InternalOntoUML.g:203:2: ( RULE_STRING )
                    // InternalOntoUML.g:204:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:209:2: ( RULE_ID )
                    {
                    // InternalOntoUML.g:209:2: ( RULE_ID )
                    // InternalOntoUML.g:210:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalOntoUML.g:219:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:223:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOntoUML.g:224:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalOntoUML.g:231:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:235:1: ( ( () ) )
            // InternalOntoUML.g:236:1: ( () )
            {
            // InternalOntoUML.g:236:1: ( () )
            // InternalOntoUML.g:237:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalOntoUML.g:238:2: ()
            // InternalOntoUML.g:238:3: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalOntoUML.g:246:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:250:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOntoUML.g:251:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalOntoUML.g:258:1: rule__Model__Group__1__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:262:1: ( ( 'Model' ) )
            // InternalOntoUML.g:263:1: ( 'Model' )
            {
            // InternalOntoUML.g:263:1: ( 'Model' )
            // InternalOntoUML.g:264:2: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalOntoUML.g:273:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:277:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalOntoUML.g:278:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalOntoUML.g:285:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:289:1: ( ( '{' ) )
            // InternalOntoUML.g:290:1: ( '{' )
            {
            // InternalOntoUML.g:290:1: ( '{' )
            // InternalOntoUML.g:291:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalOntoUML.g:300:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:304:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalOntoUML.g:305:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalOntoUML.g:312:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:316:1: ( ( ( rule__Model__Group_3__0 )? ) )
            // InternalOntoUML.g:317:1: ( ( rule__Model__Group_3__0 )? )
            {
            // InternalOntoUML.g:317:1: ( ( rule__Model__Group_3__0 )? )
            // InternalOntoUML.g:318:2: ( rule__Model__Group_3__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // InternalOntoUML.g:319:2: ( rule__Model__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOntoUML.g:319:3: rule__Model__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalOntoUML.g:327:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:331:1: ( rule__Model__Group__4__Impl )
            // InternalOntoUML.g:332:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalOntoUML.g:338:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:342:1: ( ( '}' ) )
            // InternalOntoUML.g:343:1: ( '}' )
            {
            // InternalOntoUML.g:343:1: ( '}' )
            // InternalOntoUML.g:344:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group_3__0"
    // InternalOntoUML.g:354:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:358:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // InternalOntoUML.g:359:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__0"


    // $ANTLR start "rule__Model__Group_3__0__Impl"
    // InternalOntoUML.g:366:1: rule__Model__Group_3__0__Impl : ( 'elements' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:370:1: ( ( 'elements' ) )
            // InternalOntoUML.g:371:1: ( 'elements' )
            {
            // InternalOntoUML.g:371:1: ( 'elements' )
            // InternalOntoUML.g:372:2: 'elements'
            {
             before(grammarAccess.getModelAccess().getElementsKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getElementsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__0__Impl"


    // $ANTLR start "rule__Model__Group_3__1"
    // InternalOntoUML.g:381:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:385:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // InternalOntoUML.g:386:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__1"


    // $ANTLR start "rule__Model__Group_3__1__Impl"
    // InternalOntoUML.g:393:1: rule__Model__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:397:1: ( ( '{' ) )
            // InternalOntoUML.g:398:1: ( '{' )
            {
            // InternalOntoUML.g:398:1: ( '{' )
            // InternalOntoUML.g:399:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__1__Impl"


    // $ANTLR start "rule__Model__Group_3__2"
    // InternalOntoUML.g:408:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl rule__Model__Group_3__3 ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:412:1: ( rule__Model__Group_3__2__Impl rule__Model__Group_3__3 )
            // InternalOntoUML.g:413:2: rule__Model__Group_3__2__Impl rule__Model__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__2"


    // $ANTLR start "rule__Model__Group_3__2__Impl"
    // InternalOntoUML.g:420:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__ElementsAssignment_3_2 ) ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:424:1: ( ( ( rule__Model__ElementsAssignment_3_2 ) ) )
            // InternalOntoUML.g:425:1: ( ( rule__Model__ElementsAssignment_3_2 ) )
            {
            // InternalOntoUML.g:425:1: ( ( rule__Model__ElementsAssignment_3_2 ) )
            // InternalOntoUML.g:426:2: ( rule__Model__ElementsAssignment_3_2 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3_2()); 
            // InternalOntoUML.g:427:2: ( rule__Model__ElementsAssignment_3_2 )
            // InternalOntoUML.g:427:3: rule__Model__ElementsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__2__Impl"


    // $ANTLR start "rule__Model__Group_3__3"
    // InternalOntoUML.g:435:1: rule__Model__Group_3__3 : rule__Model__Group_3__3__Impl rule__Model__Group_3__4 ;
    public final void rule__Model__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:439:1: ( rule__Model__Group_3__3__Impl rule__Model__Group_3__4 )
            // InternalOntoUML.g:440:2: rule__Model__Group_3__3__Impl rule__Model__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__3"


    // $ANTLR start "rule__Model__Group_3__3__Impl"
    // InternalOntoUML.g:447:1: rule__Model__Group_3__3__Impl : ( ( rule__Model__Group_3_3__0 )* ) ;
    public final void rule__Model__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:451:1: ( ( ( rule__Model__Group_3_3__0 )* ) )
            // InternalOntoUML.g:452:1: ( ( rule__Model__Group_3_3__0 )* )
            {
            // InternalOntoUML.g:452:1: ( ( rule__Model__Group_3_3__0 )* )
            // InternalOntoUML.g:453:2: ( rule__Model__Group_3_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3_3()); 
            // InternalOntoUML.g:454:2: ( rule__Model__Group_3_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOntoUML.g:454:3: rule__Model__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__3__Impl"


    // $ANTLR start "rule__Model__Group_3__4"
    // InternalOntoUML.g:462:1: rule__Model__Group_3__4 : rule__Model__Group_3__4__Impl ;
    public final void rule__Model__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:466:1: ( rule__Model__Group_3__4__Impl )
            // InternalOntoUML.g:467:2: rule__Model__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__4"


    // $ANTLR start "rule__Model__Group_3__4__Impl"
    // InternalOntoUML.g:473:1: rule__Model__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Model__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:477:1: ( ( '}' ) )
            // InternalOntoUML.g:478:1: ( '}' )
            {
            // InternalOntoUML.g:478:1: ( '}' )
            // InternalOntoUML.g:479:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__4__Impl"


    // $ANTLR start "rule__Model__Group_3_3__0"
    // InternalOntoUML.g:489:1: rule__Model__Group_3_3__0 : rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1 ;
    public final void rule__Model__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:493:1: ( rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1 )
            // InternalOntoUML.g:494:2: rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_3__0"


    // $ANTLR start "rule__Model__Group_3_3__0__Impl"
    // InternalOntoUML.g:501:1: rule__Model__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:505:1: ( ( ',' ) )
            // InternalOntoUML.g:506:1: ( ',' )
            {
            // InternalOntoUML.g:506:1: ( ',' )
            // InternalOntoUML.g:507:2: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_3__0__Impl"


    // $ANTLR start "rule__Model__Group_3_3__1"
    // InternalOntoUML.g:516:1: rule__Model__Group_3_3__1 : rule__Model__Group_3_3__1__Impl ;
    public final void rule__Model__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:520:1: ( rule__Model__Group_3_3__1__Impl )
            // InternalOntoUML.g:521:2: rule__Model__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_3__1"


    // $ANTLR start "rule__Model__Group_3_3__1__Impl"
    // InternalOntoUML.g:527:1: rule__Model__Group_3_3__1__Impl : ( ( rule__Model__ElementsAssignment_3_3_1 ) ) ;
    public final void rule__Model__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:531:1: ( ( ( rule__Model__ElementsAssignment_3_3_1 ) ) )
            // InternalOntoUML.g:532:1: ( ( rule__Model__ElementsAssignment_3_3_1 ) )
            {
            // InternalOntoUML.g:532:1: ( ( rule__Model__ElementsAssignment_3_3_1 ) )
            // InternalOntoUML.g:533:2: ( rule__Model__ElementsAssignment_3_3_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3_3_1()); 
            // InternalOntoUML.g:534:2: ( rule__Model__ElementsAssignment_3_3_1 )
            // InternalOntoUML.g:534:3: rule__Model__ElementsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_3__1__Impl"


    // $ANTLR start "rule__ModelElement_Impl__Group__0"
    // InternalOntoUML.g:543:1: rule__ModelElement_Impl__Group__0 : rule__ModelElement_Impl__Group__0__Impl rule__ModelElement_Impl__Group__1 ;
    public final void rule__ModelElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:547:1: ( rule__ModelElement_Impl__Group__0__Impl rule__ModelElement_Impl__Group__1 )
            // InternalOntoUML.g:548:2: rule__ModelElement_Impl__Group__0__Impl rule__ModelElement_Impl__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ModelElement_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelElement_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement_Impl__Group__0"


    // $ANTLR start "rule__ModelElement_Impl__Group__0__Impl"
    // InternalOntoUML.g:555:1: rule__ModelElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ModelElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:559:1: ( ( () ) )
            // InternalOntoUML.g:560:1: ( () )
            {
            // InternalOntoUML.g:560:1: ( () )
            // InternalOntoUML.g:561:2: ()
            {
             before(grammarAccess.getModelElement_ImplAccess().getModelElementAction_0()); 
            // InternalOntoUML.g:562:2: ()
            // InternalOntoUML.g:562:3: 
            {
            }

             after(grammarAccess.getModelElement_ImplAccess().getModelElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement_Impl__Group__0__Impl"


    // $ANTLR start "rule__ModelElement_Impl__Group__1"
    // InternalOntoUML.g:570:1: rule__ModelElement_Impl__Group__1 : rule__ModelElement_Impl__Group__1__Impl ;
    public final void rule__ModelElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:574:1: ( rule__ModelElement_Impl__Group__1__Impl )
            // InternalOntoUML.g:575:2: rule__ModelElement_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement_Impl__Group__1"


    // $ANTLR start "rule__ModelElement_Impl__Group__1__Impl"
    // InternalOntoUML.g:581:1: rule__ModelElement_Impl__Group__1__Impl : ( 'ModelElement' ) ;
    public final void rule__ModelElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:585:1: ( ( 'ModelElement' ) )
            // InternalOntoUML.g:586:1: ( 'ModelElement' )
            {
            // InternalOntoUML.g:586:1: ( 'ModelElement' )
            // InternalOntoUML.g:587:2: 'ModelElement'
            {
             before(grammarAccess.getModelElement_ImplAccess().getModelElementKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelElement_ImplAccess().getModelElementKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement_Impl__Group__1__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group__0"
    // InternalOntoUML.g:597:1: rule__OntoUMLClass__Group__0 : rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1 ;
    public final void rule__OntoUMLClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:601:1: ( rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1 )
            // InternalOntoUML.g:602:2: rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__OntoUMLClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__Group__0"


    // $ANTLR start "rule__OntoUMLClass__Group__0__Impl"
    // InternalOntoUML.g:609:1: rule__OntoUMLClass__Group__0__Impl : ( () ) ;
    public final void rule__OntoUMLClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:613:1: ( ( () ) )
            // InternalOntoUML.g:614:1: ( () )
            {
            // InternalOntoUML.g:614:1: ( () )
            // InternalOntoUML.g:615:2: ()
            {
             before(grammarAccess.getOntoUMLClassAccess().getOntoUMLClassAction_0()); 
            // InternalOntoUML.g:616:2: ()
            // InternalOntoUML.g:616:3: 
            {
            }

             after(grammarAccess.getOntoUMLClassAccess().getOntoUMLClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__Group__0__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group__1"
    // InternalOntoUML.g:624:1: rule__OntoUMLClass__Group__1 : rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2 ;
    public final void rule__OntoUMLClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:628:1: ( rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2 )
            // InternalOntoUML.g:629:2: rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__OntoUMLClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__Group__1"


    // $ANTLR start "rule__OntoUMLClass__Group__1__Impl"
    // InternalOntoUML.g:636:1: rule__OntoUMLClass__Group__1__Impl : ( 'OntoUMLClass' ) ;
    public final void rule__OntoUMLClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:640:1: ( ( 'OntoUMLClass' ) )
            // InternalOntoUML.g:641:1: ( 'OntoUMLClass' )
            {
            // InternalOntoUML.g:641:1: ( 'OntoUMLClass' )
            // InternalOntoUML.g:642:2: 'OntoUMLClass'
            {
             before(grammarAccess.getOntoUMLClassAccess().getOntoUMLClassKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getOntoUMLClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__Group__1__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group__2"
    // InternalOntoUML.g:651:1: rule__OntoUMLClass__Group__2 : rule__OntoUMLClass__Group__2__Impl ;
    public final void rule__OntoUMLClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:655:1: ( rule__OntoUMLClass__Group__2__Impl )
            // InternalOntoUML.g:656:2: rule__OntoUMLClass__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__Group__2"


    // $ANTLR start "rule__OntoUMLClass__Group__2__Impl"
    // InternalOntoUML.g:662:1: rule__OntoUMLClass__Group__2__Impl : ( ( rule__OntoUMLClass__NameAssignment_2 ) ) ;
    public final void rule__OntoUMLClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:666:1: ( ( ( rule__OntoUMLClass__NameAssignment_2 ) ) )
            // InternalOntoUML.g:667:1: ( ( rule__OntoUMLClass__NameAssignment_2 ) )
            {
            // InternalOntoUML.g:667:1: ( ( rule__OntoUMLClass__NameAssignment_2 ) )
            // InternalOntoUML.g:668:2: ( rule__OntoUMLClass__NameAssignment_2 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getNameAssignment_2()); 
            // InternalOntoUML.g:669:2: ( rule__OntoUMLClass__NameAssignment_2 )
            // InternalOntoUML.g:669:3: rule__OntoUMLClass__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntoUMLClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__Group__2__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment_3_2"
    // InternalOntoUML.g:678:1: rule__Model__ElementsAssignment_3_2 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:682:1: ( ( ruleModelElement ) )
            // InternalOntoUML.g:683:2: ( ruleModelElement )
            {
            // InternalOntoUML.g:683:2: ( ruleModelElement )
            // InternalOntoUML.g:684:3: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_3_2"


    // $ANTLR start "rule__Model__ElementsAssignment_3_3_1"
    // InternalOntoUML.g:693:1: rule__Model__ElementsAssignment_3_3_1 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:697:1: ( ( ruleModelElement ) )
            // InternalOntoUML.g:698:2: ( ruleModelElement )
            {
            // InternalOntoUML.g:698:2: ( ruleModelElement )
            // InternalOntoUML.g:699:3: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_3_3_1"


    // $ANTLR start "rule__OntoUMLClass__NameAssignment_2"
    // InternalOntoUML.g:708:1: rule__OntoUMLClass__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__OntoUMLClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:712:1: ( ( ruleEString ) )
            // InternalOntoUML.g:713:2: ( ruleEString )
            {
            // InternalOntoUML.g:713:2: ( ruleEString )
            // InternalOntoUML.g:714:3: ruleEString
            {
             before(grammarAccess.getOntoUMLClassAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOntoUMLClassAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});

}