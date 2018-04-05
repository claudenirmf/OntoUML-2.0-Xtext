package it.unibz.inf.ontouml.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.unibz.inf.ontouml.xtext.services.OntoUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntoUMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'elements'", "','", "'}'", "'ModelElement'", "'OntoUMLClass'"
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

        public InternalOntoUMLParser(TokenStream input, OntoUMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected OntoUMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalOntoUML.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOntoUML.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalOntoUML.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalOntoUML.g:71:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleModelElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleModelElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_elements_5_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:77:2: ( ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleModelElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleModelElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalOntoUML.g:78:2: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleModelElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleModelElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalOntoUML.g:78:2: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleModelElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleModelElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalOntoUML.g:79:3: () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleModelElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleModelElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalOntoUML.g:79:3: ()
            // InternalOntoUML.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOntoUML.g:94:3: (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleModelElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleModelElement ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOntoUML.g:95:4: otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleModelElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleModelElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getElementsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalOntoUML.g:103:4: ( (lv_elements_5_0= ruleModelElement ) )
                    // InternalOntoUML.g:104:5: (lv_elements_5_0= ruleModelElement )
                    {
                    // InternalOntoUML.g:104:5: (lv_elements_5_0= ruleModelElement )
                    // InternalOntoUML.g:105:6: lv_elements_5_0= ruleModelElement
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_elements_5_0=ruleModelElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_5_0,
                    							"it.unibz.inf.ontouml.xtext.OntoUML.ModelElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOntoUML.g:122:4: (otherlv_6= ',' ( (lv_elements_7_0= ruleModelElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalOntoUML.g:123:5: otherlv_6= ',' ( (lv_elements_7_0= ruleModelElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getModelAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalOntoUML.g:127:5: ( (lv_elements_7_0= ruleModelElement ) )
                    	    // InternalOntoUML.g:128:6: (lv_elements_7_0= ruleModelElement )
                    	    {
                    	    // InternalOntoUML.g:128:6: (lv_elements_7_0= ruleModelElement )
                    	    // InternalOntoUML.g:129:7: lv_elements_7_0= ruleModelElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_7_0=ruleModelElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_7_0,
                    	    								"it.unibz.inf.ontouml.xtext.OntoUML.ModelElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleModelElement"
    // InternalOntoUML.g:160:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // InternalOntoUML.g:160:53: (iv_ruleModelElement= ruleModelElement EOF )
            // InternalOntoUML.g:161:2: iv_ruleModelElement= ruleModelElement EOF
            {
             newCompositeNode(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelElement=ruleModelElement();

            state._fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // InternalOntoUML.g:167:1: ruleModelElement returns [EObject current=null] : (this_ModelElement_Impl_0= ruleModelElement_Impl | this_OntoUMLClass_1= ruleOntoUMLClass ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_ModelElement_Impl_0 = null;

        EObject this_OntoUMLClass_1 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:173:2: ( (this_ModelElement_Impl_0= ruleModelElement_Impl | this_OntoUMLClass_1= ruleOntoUMLClass ) )
            // InternalOntoUML.g:174:2: (this_ModelElement_Impl_0= ruleModelElement_Impl | this_OntoUMLClass_1= ruleOntoUMLClass )
            {
            // InternalOntoUML.g:174:2: (this_ModelElement_Impl_0= ruleModelElement_Impl | this_OntoUMLClass_1= ruleOntoUMLClass )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalOntoUML.g:175:3: this_ModelElement_Impl_0= ruleModelElement_Impl
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getModelElement_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelElement_Impl_0=ruleModelElement_Impl();

                    state._fsp--;


                    			current = this_ModelElement_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:184:3: this_OntoUMLClass_1= ruleOntoUMLClass
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getOntoUMLClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntoUMLClass_1=ruleOntoUMLClass();

                    state._fsp--;


                    			current = this_OntoUMLClass_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleModelElement_Impl"
    // InternalOntoUML.g:196:1: entryRuleModelElement_Impl returns [EObject current=null] : iv_ruleModelElement_Impl= ruleModelElement_Impl EOF ;
    public final EObject entryRuleModelElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement_Impl = null;


        try {
            // InternalOntoUML.g:196:58: (iv_ruleModelElement_Impl= ruleModelElement_Impl EOF )
            // InternalOntoUML.g:197:2: iv_ruleModelElement_Impl= ruleModelElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getModelElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelElement_Impl=ruleModelElement_Impl();

            state._fsp--;

             current =iv_ruleModelElement_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModelElement_Impl"


    // $ANTLR start "ruleModelElement_Impl"
    // InternalOntoUML.g:203:1: ruleModelElement_Impl returns [EObject current=null] : ( () otherlv_1= 'ModelElement' ) ;
    public final EObject ruleModelElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOntoUML.g:209:2: ( ( () otherlv_1= 'ModelElement' ) )
            // InternalOntoUML.g:210:2: ( () otherlv_1= 'ModelElement' )
            {
            // InternalOntoUML.g:210:2: ( () otherlv_1= 'ModelElement' )
            // InternalOntoUML.g:211:3: () otherlv_1= 'ModelElement'
            {
            // InternalOntoUML.g:211:3: ()
            // InternalOntoUML.g:212:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelElement_ImplAccess().getModelElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getModelElement_ImplAccess().getModelElementKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelElement_Impl"


    // $ANTLR start "entryRuleOntoUMLClass"
    // InternalOntoUML.g:226:1: entryRuleOntoUMLClass returns [EObject current=null] : iv_ruleOntoUMLClass= ruleOntoUMLClass EOF ;
    public final EObject entryRuleOntoUMLClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntoUMLClass = null;


        try {
            // InternalOntoUML.g:226:53: (iv_ruleOntoUMLClass= ruleOntoUMLClass EOF )
            // InternalOntoUML.g:227:2: iv_ruleOntoUMLClass= ruleOntoUMLClass EOF
            {
             newCompositeNode(grammarAccess.getOntoUMLClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntoUMLClass=ruleOntoUMLClass();

            state._fsp--;

             current =iv_ruleOntoUMLClass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOntoUMLClass"


    // $ANTLR start "ruleOntoUMLClass"
    // InternalOntoUML.g:233:1: ruleOntoUMLClass returns [EObject current=null] : ( () otherlv_1= 'OntoUMLClass' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleOntoUMLClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:239:2: ( ( () otherlv_1= 'OntoUMLClass' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalOntoUML.g:240:2: ( () otherlv_1= 'OntoUMLClass' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalOntoUML.g:240:2: ( () otherlv_1= 'OntoUMLClass' ( (lv_name_2_0= ruleEString ) ) )
            // InternalOntoUML.g:241:3: () otherlv_1= 'OntoUMLClass' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalOntoUML.g:241:3: ()
            // InternalOntoUML.g:242:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntoUMLClassAccess().getOntoUMLClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOntoUMLClassAccess().getOntoUMLClassKeyword_1());
            		
            // InternalOntoUML.g:252:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOntoUML.g:253:4: (lv_name_2_0= ruleEString )
            {
            // InternalOntoUML.g:253:4: (lv_name_2_0= ruleEString )
            // InternalOntoUML.g:254:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOntoUMLClassAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntoUMLClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.unibz.inf.ontouml.xtext.OntoUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOntoUMLClass"


    // $ANTLR start "entryRuleEString"
    // InternalOntoUML.g:275:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalOntoUML.g:275:47: (iv_ruleEString= ruleEString EOF )
            // InternalOntoUML.g:276:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalOntoUML.g:282:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalOntoUML.g:288:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalOntoUML.g:289:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalOntoUML.g:289:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntoUML.g:290:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:298:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});

}