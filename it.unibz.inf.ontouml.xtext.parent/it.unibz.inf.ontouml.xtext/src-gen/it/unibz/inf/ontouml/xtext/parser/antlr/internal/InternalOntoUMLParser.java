package it.unibz.inf.ontouml.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CARDINALITY", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'aka'", "'association'", "'derivation'", "'['", "'..'", "']'", "'generalization'", "'disjoint'", "'complete'", "'generalizationset'", "'{'", "'}'", "'kind'", "'relatorKind'", "'modeKind'", "'qualityKind'", "'subkind'", "'role'", "'phase'", "'category'", "'mixin'", "'roleMixin'", "'phaseMixin'", "'comparative'", "'material'", "'historical'", "'characterization'", "'mediation'", "'external dependence'", "'none'", "'Aggregation'", "'composition'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=5;
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
    public static final int RULE_CARDINALITY=4;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalOntoUML.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOntoUML.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalOntoUML.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalOntoUML.g:72:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleModelElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:78:2: ( ( (lv_elements_0_0= ruleModelElement ) )* )
            // InternalOntoUML.g:79:2: ( (lv_elements_0_0= ruleModelElement ) )*
            {
            // InternalOntoUML.g:79:2: ( (lv_elements_0_0= ruleModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=14 && LA1_0<=15)||(LA1_0>=19 && LA1_0<=22)||(LA1_0>=25 && LA1_0<=41)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOntoUML.g:80:3: (lv_elements_0_0= ruleModelElement )
            	    {
            	    // InternalOntoUML.g:80:3: (lv_elements_0_0= ruleModelElement )
            	    // InternalOntoUML.g:81:4: lv_elements_0_0= ruleModelElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleModelElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"it.unibz.inf.ontouml.xtext.OntoUML.ModelElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // InternalOntoUML.g:101:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // InternalOntoUML.g:101:53: (iv_ruleModelElement= ruleModelElement EOF )
            // InternalOntoUML.g:102:2: iv_ruleModelElement= ruleModelElement EOF
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
    // InternalOntoUML.g:108:1: ruleModelElement returns [EObject current=null] : (this_OntoUMLClass_0= ruleOntoUMLClass | this_RegularAssociation_1= ruleRegularAssociation | this_DerivationAssociation_2= ruleDerivationAssociation | this_Generalization_3= ruleGeneralization | this_GeneralizationSet_4= ruleGeneralizationSet ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_OntoUMLClass_0 = null;

        EObject this_RegularAssociation_1 = null;

        EObject this_DerivationAssociation_2 = null;

        EObject this_Generalization_3 = null;

        EObject this_GeneralizationSet_4 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:114:2: ( (this_OntoUMLClass_0= ruleOntoUMLClass | this_RegularAssociation_1= ruleRegularAssociation | this_DerivationAssociation_2= ruleDerivationAssociation | this_Generalization_3= ruleGeneralization | this_GeneralizationSet_4= ruleGeneralizationSet ) )
            // InternalOntoUML.g:115:2: (this_OntoUMLClass_0= ruleOntoUMLClass | this_RegularAssociation_1= ruleRegularAssociation | this_DerivationAssociation_2= ruleDerivationAssociation | this_Generalization_3= ruleGeneralization | this_GeneralizationSet_4= ruleGeneralizationSet )
            {
            // InternalOntoUML.g:115:2: (this_OntoUMLClass_0= ruleOntoUMLClass | this_RegularAssociation_1= ruleRegularAssociation | this_DerivationAssociation_2= ruleDerivationAssociation | this_Generalization_3= ruleGeneralization | this_GeneralizationSet_4= ruleGeneralizationSet )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt2=1;
                }
                break;
            case 14:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 20:
            case 21:
            case 22:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOntoUML.g:116:3: this_OntoUMLClass_0= ruleOntoUMLClass
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getOntoUMLClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntoUMLClass_0=ruleOntoUMLClass();

                    state._fsp--;


                    			current = this_OntoUMLClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:125:3: this_RegularAssociation_1= ruleRegularAssociation
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getRegularAssociationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegularAssociation_1=ruleRegularAssociation();

                    state._fsp--;


                    			current = this_RegularAssociation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:134:3: this_DerivationAssociation_2= ruleDerivationAssociation
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getDerivationAssociationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DerivationAssociation_2=ruleDerivationAssociation();

                    state._fsp--;


                    			current = this_DerivationAssociation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOntoUML.g:143:3: this_Generalization_3= ruleGeneralization
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getGeneralizationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Generalization_3=ruleGeneralization();

                    state._fsp--;


                    			current = this_Generalization_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOntoUML.g:152:3: this_GeneralizationSet_4= ruleGeneralizationSet
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneralizationSet_4=ruleGeneralizationSet();

                    state._fsp--;


                    			current = this_GeneralizationSet_4;
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


    // $ANTLR start "entryRuleOntoUMLClass"
    // InternalOntoUML.g:164:1: entryRuleOntoUMLClass returns [EObject current=null] : iv_ruleOntoUMLClass= ruleOntoUMLClass EOF ;
    public final EObject entryRuleOntoUMLClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntoUMLClass = null;


        try {
            // InternalOntoUML.g:164:53: (iv_ruleOntoUMLClass= ruleOntoUMLClass EOF )
            // InternalOntoUML.g:165:2: iv_ruleOntoUMLClass= ruleOntoUMLClass EOF
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
    // InternalOntoUML.g:171:1: ruleOntoUMLClass returns [EObject current=null] : ( (otherlv_0= 'class' | ( ( (lv__type_1_0= ruleEndurantType ) ) otherlv_2= 'class' ) | ( (lv__type_3_0= ruleEndurantType ) ) ) ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )? ) ;
    public final EObject ruleOntoUMLClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Enumerator lv__type_1_0 = null;

        Enumerator lv__type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_alias_6_0 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:177:2: ( ( (otherlv_0= 'class' | ( ( (lv__type_1_0= ruleEndurantType ) ) otherlv_2= 'class' ) | ( (lv__type_3_0= ruleEndurantType ) ) ) ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )? ) )
            // InternalOntoUML.g:178:2: ( (otherlv_0= 'class' | ( ( (lv__type_1_0= ruleEndurantType ) ) otherlv_2= 'class' ) | ( (lv__type_3_0= ruleEndurantType ) ) ) ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )? )
            {
            // InternalOntoUML.g:178:2: ( (otherlv_0= 'class' | ( ( (lv__type_1_0= ruleEndurantType ) ) otherlv_2= 'class' ) | ( (lv__type_3_0= ruleEndurantType ) ) ) ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )? )
            // InternalOntoUML.g:179:3: (otherlv_0= 'class' | ( ( (lv__type_1_0= ruleEndurantType ) ) otherlv_2= 'class' ) | ( (lv__type_3_0= ruleEndurantType ) ) ) ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )?
            {
            // InternalOntoUML.g:179:3: (otherlv_0= 'class' | ( ( (lv__type_1_0= ruleEndurantType ) ) otherlv_2= 'class' ) | ( (lv__type_3_0= ruleEndurantType ) ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalOntoUML.g:180:4: otherlv_0= 'class'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getOntoUMLClassAccess().getClassKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:185:4: ( ( (lv__type_1_0= ruleEndurantType ) ) otherlv_2= 'class' )
                    {
                    // InternalOntoUML.g:185:4: ( ( (lv__type_1_0= ruleEndurantType ) ) otherlv_2= 'class' )
                    // InternalOntoUML.g:186:5: ( (lv__type_1_0= ruleEndurantType ) ) otherlv_2= 'class'
                    {
                    // InternalOntoUML.g:186:5: ( (lv__type_1_0= ruleEndurantType ) )
                    // InternalOntoUML.g:187:6: (lv__type_1_0= ruleEndurantType )
                    {
                    // InternalOntoUML.g:187:6: (lv__type_1_0= ruleEndurantType )
                    // InternalOntoUML.g:188:7: lv__type_1_0= ruleEndurantType
                    {

                    							newCompositeNode(grammarAccess.getOntoUMLClassAccess().get_typeEndurantTypeEnumRuleCall_0_1_0_0());
                    						
                    pushFollow(FOLLOW_5);
                    lv__type_1_0=ruleEndurantType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getOntoUMLClassRule());
                    							}
                    							set(
                    								current,
                    								"_type",
                    								lv__type_1_0,
                    								"it.unibz.inf.ontouml.xtext.OntoUML.EndurantType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    					newLeafNode(otherlv_2, grammarAccess.getOntoUMLClassAccess().getClassKeyword_0_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:211:4: ( (lv__type_3_0= ruleEndurantType ) )
                    {
                    // InternalOntoUML.g:211:4: ( (lv__type_3_0= ruleEndurantType ) )
                    // InternalOntoUML.g:212:5: (lv__type_3_0= ruleEndurantType )
                    {
                    // InternalOntoUML.g:212:5: (lv__type_3_0= ruleEndurantType )
                    // InternalOntoUML.g:213:6: lv__type_3_0= ruleEndurantType
                    {

                    						newCompositeNode(grammarAccess.getOntoUMLClassAccess().get_typeEndurantTypeEnumRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv__type_3_0=ruleEndurantType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOntoUMLClassRule());
                    						}
                    						set(
                    							current,
                    							"_type",
                    							lv__type_3_0,
                    							"it.unibz.inf.ontouml.xtext.OntoUML.EndurantType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntoUML.g:231:3: ( (lv_name_4_0= ruleStringOrID ) )
            // InternalOntoUML.g:232:4: (lv_name_4_0= ruleStringOrID )
            {
            // InternalOntoUML.g:232:4: (lv_name_4_0= ruleStringOrID )
            // InternalOntoUML.g:233:5: lv_name_4_0= ruleStringOrID
            {

            					newCompositeNode(grammarAccess.getOntoUMLClassAccess().getNameStringOrIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleStringOrID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntoUMLClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.unibz.inf.ontouml.xtext.OntoUML.StringOrID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUML.g:250:3: (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntoUML.g:251:4: otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getOntoUMLClassAccess().getAkaKeyword_2_0());
                    			
                    // InternalOntoUML.g:255:4: ( (lv_alias_6_0= ruleStringOrID ) )
                    // InternalOntoUML.g:256:5: (lv_alias_6_0= ruleStringOrID )
                    {
                    // InternalOntoUML.g:256:5: (lv_alias_6_0= ruleStringOrID )
                    // InternalOntoUML.g:257:6: lv_alias_6_0= ruleStringOrID
                    {

                    						newCompositeNode(grammarAccess.getOntoUMLClassAccess().getAliasStringOrIDParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_alias_6_0=ruleStringOrID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOntoUMLClassRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_6_0,
                    							"it.unibz.inf.ontouml.xtext.OntoUML.StringOrID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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


    // $ANTLR start "entryRuleRegularAssociation"
    // InternalOntoUML.g:279:1: entryRuleRegularAssociation returns [EObject current=null] : iv_ruleRegularAssociation= ruleRegularAssociation EOF ;
    public final EObject entryRuleRegularAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularAssociation = null;


        try {
            // InternalOntoUML.g:279:59: (iv_ruleRegularAssociation= ruleRegularAssociation EOF )
            // InternalOntoUML.g:280:2: iv_ruleRegularAssociation= ruleRegularAssociation EOF
            {
             newCompositeNode(grammarAccess.getRegularAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegularAssociation=ruleRegularAssociation();

            state._fsp--;

             current =iv_ruleRegularAssociation; 
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
    // $ANTLR end "entryRuleRegularAssociation"


    // $ANTLR start "ruleRegularAssociation"
    // InternalOntoUML.g:286:1: ruleRegularAssociation returns [EObject current=null] : ( (otherlv_0= 'association' | ( ( (lv__type_1_0= ruleRelationType ) ) otherlv_2= 'association' ) | ( (lv__type_3_0= ruleRelationType ) ) ) ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )? ( (lv_sourceEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ( (lv_targetEnd_9_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ;
    public final EObject ruleRegularAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Enumerator lv__type_1_0 = null;

        Enumerator lv__type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_alias_6_0 = null;

        EObject lv_sourceEnd_7_0 = null;

        EObject lv_targetEnd_9_0 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:292:2: ( ( (otherlv_0= 'association' | ( ( (lv__type_1_0= ruleRelationType ) ) otherlv_2= 'association' ) | ( (lv__type_3_0= ruleRelationType ) ) ) ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )? ( (lv_sourceEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ( (lv_targetEnd_9_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) )
            // InternalOntoUML.g:293:2: ( (otherlv_0= 'association' | ( ( (lv__type_1_0= ruleRelationType ) ) otherlv_2= 'association' ) | ( (lv__type_3_0= ruleRelationType ) ) ) ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )? ( (lv_sourceEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ( (lv_targetEnd_9_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) )
            {
            // InternalOntoUML.g:293:2: ( (otherlv_0= 'association' | ( ( (lv__type_1_0= ruleRelationType ) ) otherlv_2= 'association' ) | ( (lv__type_3_0= ruleRelationType ) ) ) ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )? ( (lv_sourceEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ( (lv_targetEnd_9_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:294:3: (otherlv_0= 'association' | ( ( (lv__type_1_0= ruleRelationType ) ) otherlv_2= 'association' ) | ( (lv__type_3_0= ruleRelationType ) ) ) ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )? ( (lv_sourceEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ( (lv_targetEnd_9_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:294:3: (otherlv_0= 'association' | ( ( (lv__type_1_0= ruleRelationType ) ) otherlv_2= 'association' ) | ( (lv__type_3_0= ruleRelationType ) ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalOntoUML.g:295:4: otherlv_0= 'association'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getRegularAssociationAccess().getAssociationKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:300:4: ( ( (lv__type_1_0= ruleRelationType ) ) otherlv_2= 'association' )
                    {
                    // InternalOntoUML.g:300:4: ( ( (lv__type_1_0= ruleRelationType ) ) otherlv_2= 'association' )
                    // InternalOntoUML.g:301:5: ( (lv__type_1_0= ruleRelationType ) ) otherlv_2= 'association'
                    {
                    // InternalOntoUML.g:301:5: ( (lv__type_1_0= ruleRelationType ) )
                    // InternalOntoUML.g:302:6: (lv__type_1_0= ruleRelationType )
                    {
                    // InternalOntoUML.g:302:6: (lv__type_1_0= ruleRelationType )
                    // InternalOntoUML.g:303:7: lv__type_1_0= ruleRelationType
                    {

                    							newCompositeNode(grammarAccess.getRegularAssociationAccess().get_typeRelationTypeEnumRuleCall_0_1_0_0());
                    						
                    pushFollow(FOLLOW_7);
                    lv__type_1_0=ruleRelationType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRegularAssociationRule());
                    							}
                    							set(
                    								current,
                    								"_type",
                    								lv__type_1_0,
                    								"it.unibz.inf.ontouml.xtext.OntoUML.RelationType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,14,FOLLOW_4); 

                    					newLeafNode(otherlv_2, grammarAccess.getRegularAssociationAccess().getAssociationKeyword_0_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:326:4: ( (lv__type_3_0= ruleRelationType ) )
                    {
                    // InternalOntoUML.g:326:4: ( (lv__type_3_0= ruleRelationType ) )
                    // InternalOntoUML.g:327:5: (lv__type_3_0= ruleRelationType )
                    {
                    // InternalOntoUML.g:327:5: (lv__type_3_0= ruleRelationType )
                    // InternalOntoUML.g:328:6: lv__type_3_0= ruleRelationType
                    {

                    						newCompositeNode(grammarAccess.getRegularAssociationAccess().get_typeRelationTypeEnumRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv__type_3_0=ruleRelationType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularAssociationRule());
                    						}
                    						set(
                    							current,
                    							"_type",
                    							lv__type_3_0,
                    							"it.unibz.inf.ontouml.xtext.OntoUML.RelationType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntoUML.g:346:3: ( (lv_name_4_0= ruleStringOrID ) )
            // InternalOntoUML.g:347:4: (lv_name_4_0= ruleStringOrID )
            {
            // InternalOntoUML.g:347:4: (lv_name_4_0= ruleStringOrID )
            // InternalOntoUML.g:348:5: lv_name_4_0= ruleStringOrID
            {

            					newCompositeNode(grammarAccess.getRegularAssociationAccess().getNameStringOrIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_4_0=ruleStringOrID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularAssociationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.unibz.inf.ontouml.xtext.OntoUML.StringOrID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUML.g:365:3: (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoUML.g:366:4: otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getRegularAssociationAccess().getAkaKeyword_2_0());
                    			
                    // InternalOntoUML.g:370:4: ( (lv_alias_6_0= ruleStringOrID ) )
                    // InternalOntoUML.g:371:5: (lv_alias_6_0= ruleStringOrID )
                    {
                    // InternalOntoUML.g:371:5: (lv_alias_6_0= ruleStringOrID )
                    // InternalOntoUML.g:372:6: lv_alias_6_0= ruleStringOrID
                    {

                    						newCompositeNode(grammarAccess.getRegularAssociationAccess().getAliasStringOrIDParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_alias_6_0=ruleStringOrID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularAssociationRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_6_0,
                    							"it.unibz.inf.ontouml.xtext.OntoUML.StringOrID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntoUML.g:390:3: ( (lv_sourceEnd_7_0= ruleAssociationEnd ) )
            // InternalOntoUML.g:391:4: (lv_sourceEnd_7_0= ruleAssociationEnd )
            {
            // InternalOntoUML.g:391:4: (lv_sourceEnd_7_0= ruleAssociationEnd )
            // InternalOntoUML.g:392:5: lv_sourceEnd_7_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getRegularAssociationAccess().getSourceEndAssociationEndParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_sourceEnd_7_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularAssociationRule());
            					}
            					set(
            						current,
            						"sourceEnd",
            						lv_sourceEnd_7_0,
            						"it.unibz.inf.ontouml.xtext.OntoUML.AssociationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUML.g:409:3: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:410:4: ( ruleStringOrID )
            {
            // InternalOntoUML.g:410:4: ( ruleStringOrID )
            // InternalOntoUML.g:411:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRegularAssociationAccess().getSourceOntoUMLClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleStringOrID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUML.g:425:3: ( (lv_targetEnd_9_0= ruleAssociationEnd ) )
            // InternalOntoUML.g:426:4: (lv_targetEnd_9_0= ruleAssociationEnd )
            {
            // InternalOntoUML.g:426:4: (lv_targetEnd_9_0= ruleAssociationEnd )
            // InternalOntoUML.g:427:5: lv_targetEnd_9_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getRegularAssociationAccess().getTargetEndAssociationEndParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_4);
            lv_targetEnd_9_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularAssociationRule());
            					}
            					set(
            						current,
            						"targetEnd",
            						lv_targetEnd_9_0,
            						"it.unibz.inf.ontouml.xtext.OntoUML.AssociationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUML.g:444:3: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:445:4: ( ruleStringOrID )
            {
            // InternalOntoUML.g:445:4: ( ruleStringOrID )
            // InternalOntoUML.g:446:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRegularAssociationAccess().getTargetOntoUMLClassCrossReference_6_0());
            				
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;


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
    // $ANTLR end "ruleRegularAssociation"


    // $ANTLR start "entryRuleDerivationAssociation"
    // InternalOntoUML.g:464:1: entryRuleDerivationAssociation returns [EObject current=null] : iv_ruleDerivationAssociation= ruleDerivationAssociation EOF ;
    public final EObject entryRuleDerivationAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivationAssociation = null;


        try {
            // InternalOntoUML.g:464:62: (iv_ruleDerivationAssociation= ruleDerivationAssociation EOF )
            // InternalOntoUML.g:465:2: iv_ruleDerivationAssociation= ruleDerivationAssociation EOF
            {
             newCompositeNode(grammarAccess.getDerivationAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDerivationAssociation=ruleDerivationAssociation();

            state._fsp--;

             current =iv_ruleDerivationAssociation; 
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
    // $ANTLR end "entryRuleDerivationAssociation"


    // $ANTLR start "ruleDerivationAssociation"
    // InternalOntoUML.g:471:1: ruleDerivationAssociation returns [EObject current=null] : (otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) ) (otherlv_2= 'aka' ( (lv_alias_3_0= ruleStringOrID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleDerivationAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_alias_3_0 = null;

        EObject lv_sourceEnd_5_0 = null;

        EObject lv_targetEnd_7_0 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:477:2: ( (otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) ) (otherlv_2= 'aka' ( (lv_alias_3_0= ruleStringOrID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalOntoUML.g:478:2: (otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) ) (otherlv_2= 'aka' ( (lv_alias_3_0= ruleStringOrID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalOntoUML.g:478:2: (otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) ) (otherlv_2= 'aka' ( (lv_alias_3_0= ruleStringOrID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOntoUML.g:479:3: otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) ) (otherlv_2= 'aka' ( (lv_alias_3_0= ruleStringOrID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivationAssociationAccess().getDerivationKeyword_0());
            		
            // InternalOntoUML.g:483:3: ( (lv_name_1_0= ruleStringOrID ) )
            // InternalOntoUML.g:484:4: (lv_name_1_0= ruleStringOrID )
            {
            // InternalOntoUML.g:484:4: (lv_name_1_0= ruleStringOrID )
            // InternalOntoUML.g:485:5: lv_name_1_0= ruleStringOrID
            {

            					newCompositeNode(grammarAccess.getDerivationAssociationAccess().getNameStringOrIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleStringOrID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDerivationAssociationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.unibz.inf.ontouml.xtext.OntoUML.StringOrID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUML.g:502:3: (otherlv_2= 'aka' ( (lv_alias_3_0= ruleStringOrID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoUML.g:503:4: otherlv_2= 'aka' ( (lv_alias_3_0= ruleStringOrID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getDerivationAssociationAccess().getAkaKeyword_2_0());
                    			
                    // InternalOntoUML.g:507:4: ( (lv_alias_3_0= ruleStringOrID ) )
                    // InternalOntoUML.g:508:5: (lv_alias_3_0= ruleStringOrID )
                    {
                    // InternalOntoUML.g:508:5: (lv_alias_3_0= ruleStringOrID )
                    // InternalOntoUML.g:509:6: lv_alias_3_0= ruleStringOrID
                    {

                    						newCompositeNode(grammarAccess.getDerivationAssociationAccess().getAliasStringOrIDParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_alias_3_0=ruleStringOrID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivationAssociationRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_3_0,
                    							"it.unibz.inf.ontouml.xtext.OntoUML.StringOrID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntoUML.g:527:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOntoUML.g:528:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOntoUML.g:528:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) )+ {...}?) )
            // InternalOntoUML.g:529:5: ( ( ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3());
            				
            // InternalOntoUML.g:532:5: ( ( ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) )+ {...}?)
            // InternalOntoUML.g:533:6: ( ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) )+ {...}?
            {
            // InternalOntoUML.g:533:6: ( ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalOntoUML.g:534:4: ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) )
            	    {
            	    // InternalOntoUML.g:534:4: ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) )
            	    // InternalOntoUML.g:535:5: {...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDerivationAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalOntoUML.g:535:118: ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) )
            	    // InternalOntoUML.g:536:6: ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalOntoUML.g:539:9: ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) )
            	    // InternalOntoUML.g:539:10: {...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivationAssociation", "true");
            	    }
            	    // InternalOntoUML.g:539:19: ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) )
            	    // InternalOntoUML.g:539:20: ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) )
            	    {
            	    // InternalOntoUML.g:539:20: ( (lv_sourceEnd_5_0= ruleAssociationEnd ) )
            	    // InternalOntoUML.g:540:10: (lv_sourceEnd_5_0= ruleAssociationEnd )
            	    {
            	    // InternalOntoUML.g:540:10: (lv_sourceEnd_5_0= ruleAssociationEnd )
            	    // InternalOntoUML.g:541:11: lv_sourceEnd_5_0= ruleAssociationEnd
            	    {

            	    											newCompositeNode(grammarAccess.getDerivationAssociationAccess().getSourceEndAssociationEndParserRuleCall_3_0_0_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_sourceEnd_5_0=ruleAssociationEnd();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getDerivationAssociationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"sourceEnd",
            	    												lv_sourceEnd_5_0,
            	    												"it.unibz.inf.ontouml.xtext.OntoUML.AssociationEnd");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalOntoUML.g:558:9: ( ( ruleStringOrID ) )
            	    // InternalOntoUML.g:559:10: ( ruleStringOrID )
            	    {
            	    // InternalOntoUML.g:559:10: ( ruleStringOrID )
            	    // InternalOntoUML.g:560:11: ruleStringOrID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDerivationAssociationRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getDerivationAssociationAccess().getDerivingAssociationRegularAssociationCrossReference_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    ruleStringOrID();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOntoUML.g:580:4: ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) )
            	    {
            	    // InternalOntoUML.g:580:4: ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) )
            	    // InternalOntoUML.g:581:5: {...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDerivationAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalOntoUML.g:581:118: ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) )
            	    // InternalOntoUML.g:582:6: ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalOntoUML.g:585:9: ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) )
            	    // InternalOntoUML.g:585:10: {...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivationAssociation", "true");
            	    }
            	    // InternalOntoUML.g:585:19: ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) )
            	    // InternalOntoUML.g:585:20: ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) )
            	    {
            	    // InternalOntoUML.g:585:20: ( (lv_targetEnd_7_0= ruleAssociationEnd ) )
            	    // InternalOntoUML.g:586:10: (lv_targetEnd_7_0= ruleAssociationEnd )
            	    {
            	    // InternalOntoUML.g:586:10: (lv_targetEnd_7_0= ruleAssociationEnd )
            	    // InternalOntoUML.g:587:11: lv_targetEnd_7_0= ruleAssociationEnd
            	    {

            	    											newCompositeNode(grammarAccess.getDerivationAssociationAccess().getTargetEndAssociationEndParserRuleCall_3_1_0_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_targetEnd_7_0=ruleAssociationEnd();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getDerivationAssociationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"targetEnd",
            	    												lv_targetEnd_7_0,
            	    												"it.unibz.inf.ontouml.xtext.OntoUML.AssociationEnd");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalOntoUML.g:604:9: ( ( ruleStringOrID ) )
            	    // InternalOntoUML.g:605:10: ( ruleStringOrID )
            	    {
            	    // InternalOntoUML.g:605:10: ( ruleStringOrID )
            	    // InternalOntoUML.g:606:11: ruleStringOrID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDerivationAssociationRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getDerivationAssociationAccess().getDerivedClassOntoUMLClassCrossReference_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    ruleStringOrID();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleDerivationAssociation", "getUnorderedGroupHelper().canLeave(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3());
            				

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
    // $ANTLR end "ruleDerivationAssociation"


    // $ANTLR start "entryRuleAssociationEnd"
    // InternalOntoUML.g:638:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // InternalOntoUML.g:638:55: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // InternalOntoUML.g:639:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
            {
             newCompositeNode(grammarAccess.getAssociationEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationEnd=ruleAssociationEnd();

            state._fsp--;

             current =iv_ruleAssociationEnd; 
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
    // $ANTLR end "entryRuleAssociationEnd"


    // $ANTLR start "ruleAssociationEnd"
    // InternalOntoUML.g:645:1: ruleAssociationEnd returns [EObject current=null] : ( () ( (lv_aggregationKind_1_0= ruleAggregationKind ) )? (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_CARDINALITY ) ) otherlv_4= '..' ( (lv_upperBound_5_0= RULE_CARDINALITY ) ) otherlv_6= ']' )? ) ;
    public final EObject ruleAssociationEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_aggregationKind_1_0 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:651:2: ( ( () ( (lv_aggregationKind_1_0= ruleAggregationKind ) )? (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_CARDINALITY ) ) otherlv_4= '..' ( (lv_upperBound_5_0= RULE_CARDINALITY ) ) otherlv_6= ']' )? ) )
            // InternalOntoUML.g:652:2: ( () ( (lv_aggregationKind_1_0= ruleAggregationKind ) )? (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_CARDINALITY ) ) otherlv_4= '..' ( (lv_upperBound_5_0= RULE_CARDINALITY ) ) otherlv_6= ']' )? )
            {
            // InternalOntoUML.g:652:2: ( () ( (lv_aggregationKind_1_0= ruleAggregationKind ) )? (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_CARDINALITY ) ) otherlv_4= '..' ( (lv_upperBound_5_0= RULE_CARDINALITY ) ) otherlv_6= ']' )? )
            // InternalOntoUML.g:653:3: () ( (lv_aggregationKind_1_0= ruleAggregationKind ) )? (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_CARDINALITY ) ) otherlv_4= '..' ( (lv_upperBound_5_0= RULE_CARDINALITY ) ) otherlv_6= ']' )?
            {
            // InternalOntoUML.g:653:3: ()
            // InternalOntoUML.g:654:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssociationEndAccess().getAssociationEndAction_0(),
            					current);
            			

            }

            // InternalOntoUML.g:660:3: ( (lv_aggregationKind_1_0= ruleAggregationKind ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=42 && LA9_0<=44)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoUML.g:661:4: (lv_aggregationKind_1_0= ruleAggregationKind )
                    {
                    // InternalOntoUML.g:661:4: (lv_aggregationKind_1_0= ruleAggregationKind )
                    // InternalOntoUML.g:662:5: lv_aggregationKind_1_0= ruleAggregationKind
                    {

                    					newCompositeNode(grammarAccess.getAssociationEndAccess().getAggregationKindAggregationKindEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_aggregationKind_1_0=ruleAggregationKind();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationEndRule());
                    					}
                    					set(
                    						current,
                    						"aggregationKind",
                    						lv_aggregationKind_1_0,
                    						"it.unibz.inf.ontouml.xtext.OntoUML.AggregationKind");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUML.g:679:3: (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_CARDINALITY ) ) otherlv_4= '..' ( (lv_upperBound_5_0= RULE_CARDINALITY ) ) otherlv_6= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoUML.g:680:4: otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_CARDINALITY ) ) otherlv_4= '..' ( (lv_upperBound_5_0= RULE_CARDINALITY ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getAssociationEndAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalOntoUML.g:684:4: ( (lv_lowerBound_3_0= RULE_CARDINALITY ) )
                    // InternalOntoUML.g:685:5: (lv_lowerBound_3_0= RULE_CARDINALITY )
                    {
                    // InternalOntoUML.g:685:5: (lv_lowerBound_3_0= RULE_CARDINALITY )
                    // InternalOntoUML.g:686:6: lv_lowerBound_3_0= RULE_CARDINALITY
                    {
                    lv_lowerBound_3_0=(Token)match(input,RULE_CARDINALITY,FOLLOW_13); 

                    						newLeafNode(lv_lowerBound_3_0, grammarAccess.getAssociationEndAccess().getLowerBoundCARDINALITYTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationEndRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_3_0,
                    							"it.unibz.inf.ontouml.xtext.OntoUML.CARDINALITY");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssociationEndAccess().getFullStopFullStopKeyword_2_2());
                    			
                    // InternalOntoUML.g:706:4: ( (lv_upperBound_5_0= RULE_CARDINALITY ) )
                    // InternalOntoUML.g:707:5: (lv_upperBound_5_0= RULE_CARDINALITY )
                    {
                    // InternalOntoUML.g:707:5: (lv_upperBound_5_0= RULE_CARDINALITY )
                    // InternalOntoUML.g:708:6: lv_upperBound_5_0= RULE_CARDINALITY
                    {
                    lv_upperBound_5_0=(Token)match(input,RULE_CARDINALITY,FOLLOW_14); 

                    						newLeafNode(lv_upperBound_5_0, grammarAccess.getAssociationEndAccess().getUpperBoundCARDINALITYTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationEndRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"upperBound",
                    							lv_upperBound_5_0,
                    							"it.unibz.inf.ontouml.xtext.OntoUML.CARDINALITY");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getAssociationEndAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleAssociationEnd"


    // $ANTLR start "entryRuleGeneralization"
    // InternalOntoUML.g:733:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalOntoUML.g:733:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalOntoUML.g:734:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;

             current =iv_ruleGeneralization; 
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
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalOntoUML.g:740:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'generalization' ( (lv_name_1_0= ruleStringOrID ) ) (otherlv_2= 'aka' ( (lv_alias_3_0= ruleStringOrID ) ) )? ( ( ruleStringOrID ) ) ( ( ruleStringOrID ) ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_alias_3_0 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:746:2: ( (otherlv_0= 'generalization' ( (lv_name_1_0= ruleStringOrID ) ) (otherlv_2= 'aka' ( (lv_alias_3_0= ruleStringOrID ) ) )? ( ( ruleStringOrID ) ) ( ( ruleStringOrID ) ) ) )
            // InternalOntoUML.g:747:2: (otherlv_0= 'generalization' ( (lv_name_1_0= ruleStringOrID ) ) (otherlv_2= 'aka' ( (lv_alias_3_0= ruleStringOrID ) ) )? ( ( ruleStringOrID ) ) ( ( ruleStringOrID ) ) )
            {
            // InternalOntoUML.g:747:2: (otherlv_0= 'generalization' ( (lv_name_1_0= ruleStringOrID ) ) (otherlv_2= 'aka' ( (lv_alias_3_0= ruleStringOrID ) ) )? ( ( ruleStringOrID ) ) ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:748:3: otherlv_0= 'generalization' ( (lv_name_1_0= ruleStringOrID ) ) (otherlv_2= 'aka' ( (lv_alias_3_0= ruleStringOrID ) ) )? ( ( ruleStringOrID ) ) ( ( ruleStringOrID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getGeneralizationKeyword_0());
            		
            // InternalOntoUML.g:752:3: ( (lv_name_1_0= ruleStringOrID ) )
            // InternalOntoUML.g:753:4: (lv_name_1_0= ruleStringOrID )
            {
            // InternalOntoUML.g:753:4: (lv_name_1_0= ruleStringOrID )
            // InternalOntoUML.g:754:5: lv_name_1_0= ruleStringOrID
            {

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getNameStringOrIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleStringOrID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneralizationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.unibz.inf.ontouml.xtext.OntoUML.StringOrID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUML.g:771:3: (otherlv_2= 'aka' ( (lv_alias_3_0= ruleStringOrID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntoUML.g:772:4: otherlv_2= 'aka' ( (lv_alias_3_0= ruleStringOrID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getGeneralizationAccess().getAkaKeyword_2_0());
                    			
                    // InternalOntoUML.g:776:4: ( (lv_alias_3_0= ruleStringOrID ) )
                    // InternalOntoUML.g:777:5: (lv_alias_3_0= ruleStringOrID )
                    {
                    // InternalOntoUML.g:777:5: (lv_alias_3_0= ruleStringOrID )
                    // InternalOntoUML.g:778:6: lv_alias_3_0= ruleStringOrID
                    {

                    						newCompositeNode(grammarAccess.getGeneralizationAccess().getAliasStringOrIDParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_alias_3_0=ruleStringOrID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeneralizationRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_3_0,
                    							"it.unibz.inf.ontouml.xtext.OntoUML.StringOrID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntoUML.g:796:3: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:797:4: ( ruleStringOrID )
            {
            // InternalOntoUML.g:797:4: ( ruleStringOrID )
            // InternalOntoUML.g:798:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getGenericOntoUMLClassCrossReference_3_0());
            				
            pushFollow(FOLLOW_4);
            ruleStringOrID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUML.g:812:3: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:813:4: ( ruleStringOrID )
            {
            // InternalOntoUML.g:813:4: ( ruleStringOrID )
            // InternalOntoUML.g:814:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getSpecificOntoUMLClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;


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
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalOntoUML.g:832:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalOntoUML.g:832:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalOntoUML.g:833:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralizationSet=ruleGeneralizationSet();

            state._fsp--;

             current =iv_ruleGeneralizationSet; 
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
    // $ANTLR end "entryRuleGeneralizationSet"


    // $ANTLR start "ruleGeneralizationSet"
    // InternalOntoUML.g:839:1: ruleGeneralizationSet returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'generalizationset' ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )? otherlv_7= '{' ( ( ruleStringOrID ) )* otherlv_9= '}' ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token lv_isDisjoint_1_0=null;
        Token lv_isComplete_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_alias_6_0 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:845:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'generalizationset' ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )? otherlv_7= '{' ( ( ruleStringOrID ) )* otherlv_9= '}' ) )
            // InternalOntoUML.g:846:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'generalizationset' ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )? otherlv_7= '{' ( ( ruleStringOrID ) )* otherlv_9= '}' )
            {
            // InternalOntoUML.g:846:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'generalizationset' ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )? otherlv_7= '{' ( ( ruleStringOrID ) )* otherlv_9= '}' )
            // InternalOntoUML.g:847:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) ) otherlv_3= 'generalizationset' ( (lv_name_4_0= ruleStringOrID ) ) (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )? otherlv_7= '{' ( ( ruleStringOrID ) )* otherlv_9= '}'
            {
            // InternalOntoUML.g:847:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) ) )
            // InternalOntoUML.g:848:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) )
            {
            // InternalOntoUML.g:848:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* ) )
            // InternalOntoUML.g:849:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            				
            // InternalOntoUML.g:852:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )* )
            // InternalOntoUML.g:853:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )*
            {
            // InternalOntoUML.g:853:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOntoUML.g:854:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) )
            	    {
            	    // InternalOntoUML.g:854:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) ) )
            	    // InternalOntoUML.g:855:5: {...}? => ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalOntoUML.g:855:114: ( ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) ) )
            	    // InternalOntoUML.g:856:6: ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalOntoUML.g:859:9: ({...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) ) )
            	    // InternalOntoUML.g:859:10: {...}? => ( (lv_isDisjoint_1_0= 'disjoint' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalOntoUML.g:859:19: ( (lv_isDisjoint_1_0= 'disjoint' ) )
            	    // InternalOntoUML.g:859:20: (lv_isDisjoint_1_0= 'disjoint' )
            	    {
            	    // InternalOntoUML.g:859:20: (lv_isDisjoint_1_0= 'disjoint' )
            	    // InternalOntoUML.g:860:10: lv_isDisjoint_1_0= 'disjoint'
            	    {
            	    lv_isDisjoint_1_0=(Token)match(input,20,FOLLOW_16); 

            	    										newLeafNode(lv_isDisjoint_1_0, grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	    										}
            	    										setWithLastConsumed(current, "isDisjoint", true, "disjoint");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOntoUML.g:877:4: ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) )
            	    {
            	    // InternalOntoUML.g:877:4: ({...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) ) )
            	    // InternalOntoUML.g:878:5: {...}? => ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalOntoUML.g:878:114: ( ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) ) )
            	    // InternalOntoUML.g:879:6: ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalOntoUML.g:882:9: ({...}? => ( (lv_isComplete_2_0= 'complete' ) ) )
            	    // InternalOntoUML.g:882:10: {...}? => ( (lv_isComplete_2_0= 'complete' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalOntoUML.g:882:19: ( (lv_isComplete_2_0= 'complete' ) )
            	    // InternalOntoUML.g:882:20: (lv_isComplete_2_0= 'complete' )
            	    {
            	    // InternalOntoUML.g:882:20: (lv_isComplete_2_0= 'complete' )
            	    // InternalOntoUML.g:883:10: lv_isComplete_2_0= 'complete'
            	    {
            	    lv_isComplete_2_0=(Token)match(input,21,FOLLOW_16); 

            	    										newLeafNode(lv_isComplete_2_0, grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	    										}
            	    										setWithLastConsumed(current, "isComplete", true, "complete");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            				

            }

            otherlv_3=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneralizationSetAccess().getGeneralizationsetKeyword_1());
            		
            // InternalOntoUML.g:911:3: ( (lv_name_4_0= ruleStringOrID ) )
            // InternalOntoUML.g:912:4: (lv_name_4_0= ruleStringOrID )
            {
            // InternalOntoUML.g:912:4: (lv_name_4_0= ruleStringOrID )
            // InternalOntoUML.g:913:5: lv_name_4_0= ruleStringOrID
            {

            					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getNameStringOrIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_4_0=ruleStringOrID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneralizationSetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.unibz.inf.ontouml.xtext.OntoUML.StringOrID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUML.g:930:3: (otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOntoUML.g:931:4: otherlv_5= 'aka' ( (lv_alias_6_0= ruleStringOrID ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getGeneralizationSetAccess().getAkaKeyword_3_0());
                    			
                    // InternalOntoUML.g:935:4: ( (lv_alias_6_0= ruleStringOrID ) )
                    // InternalOntoUML.g:936:5: (lv_alias_6_0= ruleStringOrID )
                    {
                    // InternalOntoUML.g:936:5: (lv_alias_6_0= ruleStringOrID )
                    // InternalOntoUML.g:937:6: lv_alias_6_0= ruleStringOrID
                    {

                    						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getAliasStringOrIDParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_alias_6_0=ruleStringOrID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeneralizationSetRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_6_0,
                    							"it.unibz.inf.ontouml.xtext.OntoUML.StringOrID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getGeneralizationSetAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalOntoUML.g:959:3: ( ( ruleStringOrID ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOntoUML.g:960:4: ( ruleStringOrID )
            	    {
            	    // InternalOntoUML.g:960:4: ( ruleStringOrID )
            	    // InternalOntoUML.g:961:5: ruleStringOrID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    ruleStringOrID();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_9=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGeneralizationSetAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "entryRuleStringOrID"
    // InternalOntoUML.g:983:1: entryRuleStringOrID returns [String current=null] : iv_ruleStringOrID= ruleStringOrID EOF ;
    public final String entryRuleStringOrID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringOrID = null;


        try {
            // InternalOntoUML.g:983:50: (iv_ruleStringOrID= ruleStringOrID EOF )
            // InternalOntoUML.g:984:2: iv_ruleStringOrID= ruleStringOrID EOF
            {
             newCompositeNode(grammarAccess.getStringOrIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringOrID=ruleStringOrID();

            state._fsp--;

             current =iv_ruleStringOrID.getText(); 
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
    // $ANTLR end "entryRuleStringOrID"


    // $ANTLR start "ruleStringOrID"
    // InternalOntoUML.g:990:1: ruleStringOrID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleStringOrID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalOntoUML.g:996:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalOntoUML.g:997:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalOntoUML.g:997:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntoUML.g:998:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getStringOrIDAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:1006:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getStringOrIDAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleStringOrID"


    // $ANTLR start "ruleEndurantType"
    // InternalOntoUML.g:1017:1: ruleEndurantType returns [Enumerator current=null] : ( (enumLiteral_0= 'kind' ) | (enumLiteral_1= 'relatorKind' ) | (enumLiteral_2= 'modeKind' ) | (enumLiteral_3= 'qualityKind' ) | (enumLiteral_4= 'subkind' ) | (enumLiteral_5= 'role' ) | (enumLiteral_6= 'phase' ) | (enumLiteral_7= 'category' ) | (enumLiteral_8= 'mixin' ) | (enumLiteral_9= 'roleMixin' ) | (enumLiteral_10= 'phaseMixin' ) ) ;
    public final Enumerator ruleEndurantType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;


        	enterRule();

        try {
            // InternalOntoUML.g:1023:2: ( ( (enumLiteral_0= 'kind' ) | (enumLiteral_1= 'relatorKind' ) | (enumLiteral_2= 'modeKind' ) | (enumLiteral_3= 'qualityKind' ) | (enumLiteral_4= 'subkind' ) | (enumLiteral_5= 'role' ) | (enumLiteral_6= 'phase' ) | (enumLiteral_7= 'category' ) | (enumLiteral_8= 'mixin' ) | (enumLiteral_9= 'roleMixin' ) | (enumLiteral_10= 'phaseMixin' ) ) )
            // InternalOntoUML.g:1024:2: ( (enumLiteral_0= 'kind' ) | (enumLiteral_1= 'relatorKind' ) | (enumLiteral_2= 'modeKind' ) | (enumLiteral_3= 'qualityKind' ) | (enumLiteral_4= 'subkind' ) | (enumLiteral_5= 'role' ) | (enumLiteral_6= 'phase' ) | (enumLiteral_7= 'category' ) | (enumLiteral_8= 'mixin' ) | (enumLiteral_9= 'roleMixin' ) | (enumLiteral_10= 'phaseMixin' ) )
            {
            // InternalOntoUML.g:1024:2: ( (enumLiteral_0= 'kind' ) | (enumLiteral_1= 'relatorKind' ) | (enumLiteral_2= 'modeKind' ) | (enumLiteral_3= 'qualityKind' ) | (enumLiteral_4= 'subkind' ) | (enumLiteral_5= 'role' ) | (enumLiteral_6= 'phase' ) | (enumLiteral_7= 'category' ) | (enumLiteral_8= 'mixin' ) | (enumLiteral_9= 'roleMixin' ) | (enumLiteral_10= 'phaseMixin' ) )
            int alt16=11;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt16=1;
                }
                break;
            case 26:
                {
                alt16=2;
                }
                break;
            case 27:
                {
                alt16=3;
                }
                break;
            case 28:
                {
                alt16=4;
                }
                break;
            case 29:
                {
                alt16=5;
                }
                break;
            case 30:
                {
                alt16=6;
                }
                break;
            case 31:
                {
                alt16=7;
                }
                break;
            case 32:
                {
                alt16=8;
                }
                break;
            case 33:
                {
                alt16=9;
                }
                break;
            case 34:
                {
                alt16=10;
                }
                break;
            case 35:
                {
                alt16=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalOntoUML.g:1025:3: (enumLiteral_0= 'kind' )
                    {
                    // InternalOntoUML.g:1025:3: (enumLiteral_0= 'kind' )
                    // InternalOntoUML.g:1026:4: enumLiteral_0= 'kind'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getKindEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEndurantTypeAccess().getKindEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:1033:3: (enumLiteral_1= 'relatorKind' )
                    {
                    // InternalOntoUML.g:1033:3: (enumLiteral_1= 'relatorKind' )
                    // InternalOntoUML.g:1034:4: enumLiteral_1= 'relatorKind'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getRelatorKindEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEndurantTypeAccess().getRelatorKindEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:1041:3: (enumLiteral_2= 'modeKind' )
                    {
                    // InternalOntoUML.g:1041:3: (enumLiteral_2= 'modeKind' )
                    // InternalOntoUML.g:1042:4: enumLiteral_2= 'modeKind'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getModeKindEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEndurantTypeAccess().getModeKindEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoUML.g:1049:3: (enumLiteral_3= 'qualityKind' )
                    {
                    // InternalOntoUML.g:1049:3: (enumLiteral_3= 'qualityKind' )
                    // InternalOntoUML.g:1050:4: enumLiteral_3= 'qualityKind'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getQualityKindEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEndurantTypeAccess().getQualityKindEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoUML.g:1057:3: (enumLiteral_4= 'subkind' )
                    {
                    // InternalOntoUML.g:1057:3: (enumLiteral_4= 'subkind' )
                    // InternalOntoUML.g:1058:4: enumLiteral_4= 'subkind'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getSubkindEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEndurantTypeAccess().getSubkindEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOntoUML.g:1065:3: (enumLiteral_5= 'role' )
                    {
                    // InternalOntoUML.g:1065:3: (enumLiteral_5= 'role' )
                    // InternalOntoUML.g:1066:4: enumLiteral_5= 'role'
                    {
                    enumLiteral_5=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getRoleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEndurantTypeAccess().getRoleEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOntoUML.g:1073:3: (enumLiteral_6= 'phase' )
                    {
                    // InternalOntoUML.g:1073:3: (enumLiteral_6= 'phase' )
                    // InternalOntoUML.g:1074:4: enumLiteral_6= 'phase'
                    {
                    enumLiteral_6=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getPhaseEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getEndurantTypeAccess().getPhaseEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOntoUML.g:1081:3: (enumLiteral_7= 'category' )
                    {
                    // InternalOntoUML.g:1081:3: (enumLiteral_7= 'category' )
                    // InternalOntoUML.g:1082:4: enumLiteral_7= 'category'
                    {
                    enumLiteral_7=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getCategoryEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getEndurantTypeAccess().getCategoryEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalOntoUML.g:1089:3: (enumLiteral_8= 'mixin' )
                    {
                    // InternalOntoUML.g:1089:3: (enumLiteral_8= 'mixin' )
                    // InternalOntoUML.g:1090:4: enumLiteral_8= 'mixin'
                    {
                    enumLiteral_8=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getMixinEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getEndurantTypeAccess().getMixinEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalOntoUML.g:1097:3: (enumLiteral_9= 'roleMixin' )
                    {
                    // InternalOntoUML.g:1097:3: (enumLiteral_9= 'roleMixin' )
                    // InternalOntoUML.g:1098:4: enumLiteral_9= 'roleMixin'
                    {
                    enumLiteral_9=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getRoleMixinEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getEndurantTypeAccess().getRoleMixinEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalOntoUML.g:1105:3: (enumLiteral_10= 'phaseMixin' )
                    {
                    // InternalOntoUML.g:1105:3: (enumLiteral_10= 'phaseMixin' )
                    // InternalOntoUML.g:1106:4: enumLiteral_10= 'phaseMixin'
                    {
                    enumLiteral_10=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getPhaseMixinEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getEndurantTypeAccess().getPhaseMixinEnumLiteralDeclaration_10());
                    			

                    }


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
    // $ANTLR end "ruleEndurantType"


    // $ANTLR start "ruleRelationType"
    // InternalOntoUML.g:1116:1: ruleRelationType returns [Enumerator current=null] : ( (enumLiteral_0= 'comparative' ) | (enumLiteral_1= 'material' ) | (enumLiteral_2= 'historical' ) | (enumLiteral_3= 'characterization' ) | (enumLiteral_4= 'mediation' ) | (enumLiteral_5= 'external dependence' ) ) ;
    public final Enumerator ruleRelationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalOntoUML.g:1122:2: ( ( (enumLiteral_0= 'comparative' ) | (enumLiteral_1= 'material' ) | (enumLiteral_2= 'historical' ) | (enumLiteral_3= 'characterization' ) | (enumLiteral_4= 'mediation' ) | (enumLiteral_5= 'external dependence' ) ) )
            // InternalOntoUML.g:1123:2: ( (enumLiteral_0= 'comparative' ) | (enumLiteral_1= 'material' ) | (enumLiteral_2= 'historical' ) | (enumLiteral_3= 'characterization' ) | (enumLiteral_4= 'mediation' ) | (enumLiteral_5= 'external dependence' ) )
            {
            // InternalOntoUML.g:1123:2: ( (enumLiteral_0= 'comparative' ) | (enumLiteral_1= 'material' ) | (enumLiteral_2= 'historical' ) | (enumLiteral_3= 'characterization' ) | (enumLiteral_4= 'mediation' ) | (enumLiteral_5= 'external dependence' ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt17=1;
                }
                break;
            case 37:
                {
                alt17=2;
                }
                break;
            case 38:
                {
                alt17=3;
                }
                break;
            case 39:
                {
                alt17=4;
                }
                break;
            case 40:
                {
                alt17=5;
                }
                break;
            case 41:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalOntoUML.g:1124:3: (enumLiteral_0= 'comparative' )
                    {
                    // InternalOntoUML.g:1124:3: (enumLiteral_0= 'comparative' )
                    // InternalOntoUML.g:1125:4: enumLiteral_0= 'comparative'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getRelationTypeAccess().getComparativeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRelationTypeAccess().getComparativeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:1132:3: (enumLiteral_1= 'material' )
                    {
                    // InternalOntoUML.g:1132:3: (enumLiteral_1= 'material' )
                    // InternalOntoUML.g:1133:4: enumLiteral_1= 'material'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getRelationTypeAccess().getMaterialEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRelationTypeAccess().getMaterialEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:1140:3: (enumLiteral_2= 'historical' )
                    {
                    // InternalOntoUML.g:1140:3: (enumLiteral_2= 'historical' )
                    // InternalOntoUML.g:1141:4: enumLiteral_2= 'historical'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getRelationTypeAccess().getHistoricalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRelationTypeAccess().getHistoricalEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoUML.g:1148:3: (enumLiteral_3= 'characterization' )
                    {
                    // InternalOntoUML.g:1148:3: (enumLiteral_3= 'characterization' )
                    // InternalOntoUML.g:1149:4: enumLiteral_3= 'characterization'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getRelationTypeAccess().getCharacterizationEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRelationTypeAccess().getCharacterizationEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoUML.g:1156:3: (enumLiteral_4= 'mediation' )
                    {
                    // InternalOntoUML.g:1156:3: (enumLiteral_4= 'mediation' )
                    // InternalOntoUML.g:1157:4: enumLiteral_4= 'mediation'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getRelationTypeAccess().getMediationEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRelationTypeAccess().getMediationEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOntoUML.g:1164:3: (enumLiteral_5= 'external dependence' )
                    {
                    // InternalOntoUML.g:1164:3: (enumLiteral_5= 'external dependence' )
                    // InternalOntoUML.g:1165:4: enumLiteral_5= 'external dependence'
                    {
                    enumLiteral_5=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getRelationTypeAccess().getExternalDepedenceEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRelationTypeAccess().getExternalDepedenceEnumLiteralDeclaration_5());
                    			

                    }


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
    // $ANTLR end "ruleRelationType"


    // $ANTLR start "ruleAggregationKind"
    // InternalOntoUML.g:1175:1: ruleAggregationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'Aggregation' ) | (enumLiteral_2= 'composition' ) ) ;
    public final Enumerator ruleAggregationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOntoUML.g:1181:2: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'Aggregation' ) | (enumLiteral_2= 'composition' ) ) )
            // InternalOntoUML.g:1182:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'Aggregation' ) | (enumLiteral_2= 'composition' ) )
            {
            // InternalOntoUML.g:1182:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'Aggregation' ) | (enumLiteral_2= 'composition' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt18=1;
                }
                break;
            case 43:
                {
                alt18=2;
                }
                break;
            case 44:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalOntoUML.g:1183:3: (enumLiteral_0= 'none' )
                    {
                    // InternalOntoUML.g:1183:3: (enumLiteral_0= 'none' )
                    // InternalOntoUML.g:1184:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAggregationKindAccess().getNoneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:1191:3: (enumLiteral_1= 'Aggregation' )
                    {
                    // InternalOntoUML.g:1191:3: (enumLiteral_1= 'Aggregation' )
                    // InternalOntoUML.g:1192:4: enumLiteral_1= 'Aggregation'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindAccess().getAggregationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAggregationKindAccess().getAggregationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:1199:3: (enumLiteral_2= 'composition' )
                    {
                    // InternalOntoUML.g:1199:3: (enumLiteral_2= 'composition' )
                    // InternalOntoUML.g:1200:4: enumLiteral_2= 'composition'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindAccess().getCompositionEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAggregationKindAccess().getCompositionEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleAggregationKind"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\14\1\uffff\13\5\2\uffff";
    static final String dfa_3s = "\1\43\1\uffff\13\14\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\13\uffff\1\3\1\2";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\14\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "",
            "\2\15\5\uffff\1\16",
            "\2\15\5\uffff\1\16",
            "\2\15\5\uffff\1\16",
            "\2\15\5\uffff\1\16",
            "\2\15\5\uffff\1\16",
            "\2\15\5\uffff\1\16",
            "\2\15\5\uffff\1\16",
            "\2\15\5\uffff\1\16",
            "\2\15\5\uffff\1\16",
            "\2\15\5\uffff\1\16",
            "\2\15\5\uffff\1\16",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "179:3: (otherlv_0= 'class' | ( ( (lv__type_1_0= ruleEndurantType ) ) otherlv_2= 'class' ) | ( (lv__type_3_0= ruleEndurantType ) ) )";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\16\1\uffff\6\5\2\uffff";
    static final String dfa_9s = "\1\51\1\uffff\6\16\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\6\uffff\1\3\1\2";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\25\uffff\1\2\1\3\1\4\1\5\1\6\1\7",
            "",
            "\2\10\7\uffff\1\11",
            "\2\10\7\uffff\1\11",
            "\2\10\7\uffff\1\11",
            "\2\10\7\uffff\1\11",
            "\2\10\7\uffff\1\11",
            "\2\10\7\uffff\1\11",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "294:3: (otherlv_0= 'association' | ( ( (lv__type_1_0= ruleRelationType ) ) otherlv_2= 'association' ) | ( (lv__type_3_0= ruleRelationType ) ) )";
        }
    }
    static final String dfa_13s = "\16\uffff";
    static final String dfa_14s = "\1\1\15\uffff";
    static final String dfa_15s = "\1\5\1\uffff\3\5\1\4\2\0\1\21\2\uffff\1\4\1\22\1\5";
    static final String dfa_16s = "\1\54\1\uffff\3\20\1\4\2\0\1\21\2\uffff\1\4\1\22\1\6";
    static final String dfa_17s = "\1\uffff\1\3\7\uffff\1\1\1\2\3\uffff";
    static final String dfa_18s = "\1\5\1\uffff\1\6\1\2\1\10\1\7\1\1\1\3\1\0\2\uffff\1\11\1\4\1\12}>";
    static final String[] dfa_19s = {
            "\1\6\1\7\5\uffff\1\1\1\uffff\2\1\1\5\2\uffff\4\1\2\uffff\21\1\1\2\1\3\1\4",
            "",
            "\1\6\1\7\11\uffff\1\5",
            "\1\6\1\7\11\uffff\1\5",
            "\1\6\1\7\11\uffff\1\5",
            "\1\10",
            "\1\uffff",
            "\1\uffff",
            "\1\13",
            "",
            "",
            "\1\14",
            "\1\15",
            "\1\6\1\7"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()+ loopback of 533:6: ( ({...}? => ( ({...}? => ( ( (lv_sourceEnd_5_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_targetEnd_7_0= ruleAssociationEnd ) ) ( ( ruleStringOrID ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_8 = input.LA(1);

                         
                        int index8_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA8_8 == 17 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 11;}

                         
                        input.seek(index8_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) {s = 10;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA8_3 == 16 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 5;}

                        else if ( LA8_3 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 6;}

                        else if ( LA8_3 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 7;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) {s = 10;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_12 = input.LA(1);

                         
                        int index8_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA8_12 == 18 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 13;}

                         
                        input.seek(index8_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_0 = input.LA(1);

                         
                        int index8_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_0==EOF||LA8_0==12||(LA8_0>=14 && LA8_0<=15)||(LA8_0>=19 && LA8_0<=22)||(LA8_0>=25 && LA8_0<=41)) ) {s = 1;}

                        else if ( LA8_0 == 42 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 2;}

                        else if ( LA8_0 == 43 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 3;}

                        else if ( LA8_0 == 44 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 4;}

                        else if ( LA8_0 == 16 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 5;}

                        else if ( LA8_0 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 6;}

                        else if ( LA8_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 7;}

                         
                        input.seek(index8_0);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA8_2 == 16 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 5;}

                        else if ( LA8_2 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 6;}

                        else if ( LA8_2 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 7;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA8_5 == RULE_CARDINALITY && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 8;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA8_4 == 16 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 5;}

                        else if ( LA8_4 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 6;}

                        else if ( LA8_4 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 7;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA8_11 = input.LA(1);

                         
                        int index8_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA8_11 == RULE_CARDINALITY && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 12;}

                         
                        input.seek(index8_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA8_13 = input.LA(1);

                         
                        int index8_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA8_13 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 6;}

                        else if ( LA8_13 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 7;}

                         
                        input.seek(index8_13);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000003FFFE78D002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00001C0000012060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00001C0000010060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00001C0000010062L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000060L});

}
