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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_CARDINALITY", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'association'", "'kind'", "'relatorKind'", "'modeKind'", "'qualityKind'", "'subkind'", "'role'", "'phase'", "'category'", "'mixin'", "'roleMixin'", "'phaseMixin'", "'descriptive'", "'non-descriptive'", "'inherence'", "'involvement'", "'dependence'", "'aka'", "'derivation'", "'['", "'..'", "']'", "'generalization'", "'generalizationset'", "'{'", "'}'", "'disjoint'", "'complete'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int RULE_CARDINALITY=6;
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
    // InternalOntoUML.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalOntoUML.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalOntoUML.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalOntoUML.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalOntoUML.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=29)||LA1_0==31||(LA1_0>=35 && LA1_0<=36)||(LA1_0>=39 && LA1_0<=40)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOntoUML.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

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


    // $ANTLR start "entryRuleOntoUMLClass"
    // InternalOntoUML.g:103:1: entryRuleOntoUMLClass : ruleOntoUMLClass EOF ;
    public final void entryRuleOntoUMLClass() throws RecognitionException {
        try {
            // InternalOntoUML.g:104:1: ( ruleOntoUMLClass EOF )
            // InternalOntoUML.g:105:1: ruleOntoUMLClass EOF
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
    // InternalOntoUML.g:112:1: ruleOntoUMLClass : ( ( rule__OntoUMLClass__Group__0 ) ) ;
    public final void ruleOntoUMLClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:116:2: ( ( ( rule__OntoUMLClass__Group__0 ) ) )
            // InternalOntoUML.g:117:2: ( ( rule__OntoUMLClass__Group__0 ) )
            {
            // InternalOntoUML.g:117:2: ( ( rule__OntoUMLClass__Group__0 ) )
            // InternalOntoUML.g:118:3: ( rule__OntoUMLClass__Group__0 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGroup()); 
            // InternalOntoUML.g:119:3: ( rule__OntoUMLClass__Group__0 )
            // InternalOntoUML.g:119:4: rule__OntoUMLClass__Group__0
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


    // $ANTLR start "entryRuleRegularAssociation"
    // InternalOntoUML.g:128:1: entryRuleRegularAssociation : ruleRegularAssociation EOF ;
    public final void entryRuleRegularAssociation() throws RecognitionException {
        try {
            // InternalOntoUML.g:129:1: ( ruleRegularAssociation EOF )
            // InternalOntoUML.g:130:1: ruleRegularAssociation EOF
            {
             before(grammarAccess.getRegularAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleRegularAssociation();

            state._fsp--;

             after(grammarAccess.getRegularAssociationRule()); 
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
    // $ANTLR end "entryRuleRegularAssociation"


    // $ANTLR start "ruleRegularAssociation"
    // InternalOntoUML.g:137:1: ruleRegularAssociation : ( ( rule__RegularAssociation__Group__0 ) ) ;
    public final void ruleRegularAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:141:2: ( ( ( rule__RegularAssociation__Group__0 ) ) )
            // InternalOntoUML.g:142:2: ( ( rule__RegularAssociation__Group__0 ) )
            {
            // InternalOntoUML.g:142:2: ( ( rule__RegularAssociation__Group__0 ) )
            // InternalOntoUML.g:143:3: ( rule__RegularAssociation__Group__0 )
            {
             before(grammarAccess.getRegularAssociationAccess().getGroup()); 
            // InternalOntoUML.g:144:3: ( rule__RegularAssociation__Group__0 )
            // InternalOntoUML.g:144:4: rule__RegularAssociation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularAssociationAccess().getGroup()); 

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
    // $ANTLR end "ruleRegularAssociation"


    // $ANTLR start "entryRuleDerivationAssociation"
    // InternalOntoUML.g:153:1: entryRuleDerivationAssociation : ruleDerivationAssociation EOF ;
    public final void entryRuleDerivationAssociation() throws RecognitionException {
        try {
            // InternalOntoUML.g:154:1: ( ruleDerivationAssociation EOF )
            // InternalOntoUML.g:155:1: ruleDerivationAssociation EOF
            {
             before(grammarAccess.getDerivationAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleDerivationAssociation();

            state._fsp--;

             after(grammarAccess.getDerivationAssociationRule()); 
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
    // $ANTLR end "entryRuleDerivationAssociation"


    // $ANTLR start "ruleDerivationAssociation"
    // InternalOntoUML.g:162:1: ruleDerivationAssociation : ( ( rule__DerivationAssociation__Group__0 ) ) ;
    public final void ruleDerivationAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:166:2: ( ( ( rule__DerivationAssociation__Group__0 ) ) )
            // InternalOntoUML.g:167:2: ( ( rule__DerivationAssociation__Group__0 ) )
            {
            // InternalOntoUML.g:167:2: ( ( rule__DerivationAssociation__Group__0 ) )
            // InternalOntoUML.g:168:3: ( rule__DerivationAssociation__Group__0 )
            {
             before(grammarAccess.getDerivationAssociationAccess().getGroup()); 
            // InternalOntoUML.g:169:3: ( rule__DerivationAssociation__Group__0 )
            // InternalOntoUML.g:169:4: rule__DerivationAssociation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDerivationAssociationAccess().getGroup()); 

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
    // $ANTLR end "ruleDerivationAssociation"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalOntoUML.g:178:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // InternalOntoUML.g:179:1: ( ruleMultiplicity EOF )
            // InternalOntoUML.g:180:1: ruleMultiplicity EOF
            {
             before(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getMultiplicityRule()); 
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
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalOntoUML.g:187:1: ruleMultiplicity : ( ( rule__Multiplicity__Group__0 ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:191:2: ( ( ( rule__Multiplicity__Group__0 ) ) )
            // InternalOntoUML.g:192:2: ( ( rule__Multiplicity__Group__0 ) )
            {
            // InternalOntoUML.g:192:2: ( ( rule__Multiplicity__Group__0 ) )
            // InternalOntoUML.g:193:3: ( rule__Multiplicity__Group__0 )
            {
             before(grammarAccess.getMultiplicityAccess().getGroup()); 
            // InternalOntoUML.g:194:3: ( rule__Multiplicity__Group__0 )
            // InternalOntoUML.g:194:4: rule__Multiplicity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleGeneralization"
    // InternalOntoUML.g:203:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalOntoUML.g:204:1: ( ruleGeneralization EOF )
            // InternalOntoUML.g:205:1: ruleGeneralization EOF
            {
             before(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getGeneralizationRule()); 
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
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalOntoUML.g:212:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:216:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // InternalOntoUML.g:217:2: ( ( rule__Generalization__Group__0 ) )
            {
            // InternalOntoUML.g:217:2: ( ( rule__Generalization__Group__0 ) )
            // InternalOntoUML.g:218:3: ( rule__Generalization__Group__0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGroup()); 
            // InternalOntoUML.g:219:3: ( rule__Generalization__Group__0 )
            // InternalOntoUML.g:219:4: rule__Generalization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getGroup()); 

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
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalOntoUML.g:228:1: entryRuleGeneralizationSet : ruleGeneralizationSet EOF ;
    public final void entryRuleGeneralizationSet() throws RecognitionException {
        try {
            // InternalOntoUML.g:229:1: ( ruleGeneralizationSet EOF )
            // InternalOntoUML.g:230:1: ruleGeneralizationSet EOF
            {
             before(grammarAccess.getGeneralizationSetRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralizationSet();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetRule()); 
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
    // $ANTLR end "entryRuleGeneralizationSet"


    // $ANTLR start "ruleGeneralizationSet"
    // InternalOntoUML.g:237:1: ruleGeneralizationSet : ( ( rule__GeneralizationSet__Group__0 ) ) ;
    public final void ruleGeneralizationSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:241:2: ( ( ( rule__GeneralizationSet__Group__0 ) ) )
            // InternalOntoUML.g:242:2: ( ( rule__GeneralizationSet__Group__0 ) )
            {
            // InternalOntoUML.g:242:2: ( ( rule__GeneralizationSet__Group__0 ) )
            // InternalOntoUML.g:243:3: ( rule__GeneralizationSet__Group__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup()); 
            // InternalOntoUML.g:244:3: ( rule__GeneralizationSet__Group__0 )
            // InternalOntoUML.g:244:4: rule__GeneralizationSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGroup()); 

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
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "entryRuleStringOrID"
    // InternalOntoUML.g:253:1: entryRuleStringOrID : ruleStringOrID EOF ;
    public final void entryRuleStringOrID() throws RecognitionException {
        try {
            // InternalOntoUML.g:254:1: ( ruleStringOrID EOF )
            // InternalOntoUML.g:255:1: ruleStringOrID EOF
            {
             before(grammarAccess.getStringOrIDRule()); 
            pushFollow(FOLLOW_1);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getStringOrIDRule()); 
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
    // $ANTLR end "entryRuleStringOrID"


    // $ANTLR start "ruleStringOrID"
    // InternalOntoUML.g:262:1: ruleStringOrID : ( ( rule__StringOrID__Alternatives ) ) ;
    public final void ruleStringOrID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:266:2: ( ( ( rule__StringOrID__Alternatives ) ) )
            // InternalOntoUML.g:267:2: ( ( rule__StringOrID__Alternatives ) )
            {
            // InternalOntoUML.g:267:2: ( ( rule__StringOrID__Alternatives ) )
            // InternalOntoUML.g:268:3: ( rule__StringOrID__Alternatives )
            {
             before(grammarAccess.getStringOrIDAccess().getAlternatives()); 
            // InternalOntoUML.g:269:3: ( rule__StringOrID__Alternatives )
            // InternalOntoUML.g:269:4: rule__StringOrID__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringOrID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringOrIDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStringOrID"


    // $ANTLR start "ruleEndurantType"
    // InternalOntoUML.g:278:1: ruleEndurantType : ( ( rule__EndurantType__Alternatives ) ) ;
    public final void ruleEndurantType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:282:1: ( ( ( rule__EndurantType__Alternatives ) ) )
            // InternalOntoUML.g:283:2: ( ( rule__EndurantType__Alternatives ) )
            {
            // InternalOntoUML.g:283:2: ( ( rule__EndurantType__Alternatives ) )
            // InternalOntoUML.g:284:3: ( rule__EndurantType__Alternatives )
            {
             before(grammarAccess.getEndurantTypeAccess().getAlternatives()); 
            // InternalOntoUML.g:285:3: ( rule__EndurantType__Alternatives )
            // InternalOntoUML.g:285:4: rule__EndurantType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EndurantType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEndurantTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEndurantType"


    // $ANTLR start "ruleRelationType"
    // InternalOntoUML.g:294:1: ruleRelationType : ( ( rule__RelationType__Alternatives ) ) ;
    public final void ruleRelationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:298:1: ( ( ( rule__RelationType__Alternatives ) ) )
            // InternalOntoUML.g:299:2: ( ( rule__RelationType__Alternatives ) )
            {
            // InternalOntoUML.g:299:2: ( ( rule__RelationType__Alternatives ) )
            // InternalOntoUML.g:300:3: ( rule__RelationType__Alternatives )
            {
             before(grammarAccess.getRelationTypeAccess().getAlternatives()); 
            // InternalOntoUML.g:301:3: ( rule__RelationType__Alternatives )
            // InternalOntoUML.g:301:4: rule__RelationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRelationType"


    // $ANTLR start "rule__ModelElement__Alternatives"
    // InternalOntoUML.g:309:1: rule__ModelElement__Alternatives : ( ( ruleOntoUMLClass ) | ( ruleRegularAssociation ) | ( ruleDerivationAssociation ) | ( ruleGeneralization ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:313:1: ( ( ruleOntoUMLClass ) | ( ruleRegularAssociation ) | ( ruleDerivationAssociation ) | ( ruleGeneralization ) | ( ruleGeneralizationSet ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                {
                alt2=1;
                }
                break;
            case 13:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                alt2=4;
                }
                break;
            case 36:
            case 39:
            case 40:
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
                    // InternalOntoUML.g:314:2: ( ruleOntoUMLClass )
                    {
                    // InternalOntoUML.g:314:2: ( ruleOntoUMLClass )
                    // InternalOntoUML.g:315:3: ruleOntoUMLClass
                    {
                     before(grammarAccess.getModelElementAccess().getOntoUMLClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOntoUMLClass();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getOntoUMLClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:320:2: ( ruleRegularAssociation )
                    {
                    // InternalOntoUML.g:320:2: ( ruleRegularAssociation )
                    // InternalOntoUML.g:321:3: ruleRegularAssociation
                    {
                     before(grammarAccess.getModelElementAccess().getRegularAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRegularAssociation();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getRegularAssociationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:326:2: ( ruleDerivationAssociation )
                    {
                    // InternalOntoUML.g:326:2: ( ruleDerivationAssociation )
                    // InternalOntoUML.g:327:3: ruleDerivationAssociation
                    {
                     before(grammarAccess.getModelElementAccess().getDerivationAssociationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDerivationAssociation();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getDerivationAssociationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoUML.g:332:2: ( ruleGeneralization )
                    {
                    // InternalOntoUML.g:332:2: ( ruleGeneralization )
                    // InternalOntoUML.g:333:3: ruleGeneralization
                    {
                     before(grammarAccess.getModelElementAccess().getGeneralizationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralization();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getGeneralizationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoUML.g:338:2: ( ruleGeneralizationSet )
                    {
                    // InternalOntoUML.g:338:2: ( ruleGeneralizationSet )
                    // InternalOntoUML.g:339:3: ruleGeneralizationSet
                    {
                     before(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralizationSet();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_4()); 

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


    // $ANTLR start "rule__OntoUMLClass__Alternatives_0"
    // InternalOntoUML.g:348:1: rule__OntoUMLClass__Alternatives_0 : ( ( 'class' ) | ( ( rule__OntoUMLClass__Group_0_1__0 ) ) | ( ( rule__OntoUMLClass___typeAssignment_0_2 ) ) );
    public final void rule__OntoUMLClass__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:352:1: ( ( 'class' ) | ( ( rule__OntoUMLClass__Group_0_1__0 ) ) | ( ( rule__OntoUMLClass___typeAssignment_0_2 ) ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalOntoUML.g:353:2: ( 'class' )
                    {
                    // InternalOntoUML.g:353:2: ( 'class' )
                    // InternalOntoUML.g:354:3: 'class'
                    {
                     before(grammarAccess.getOntoUMLClassAccess().getClassKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOntoUMLClassAccess().getClassKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:359:2: ( ( rule__OntoUMLClass__Group_0_1__0 ) )
                    {
                    // InternalOntoUML.g:359:2: ( ( rule__OntoUMLClass__Group_0_1__0 ) )
                    // InternalOntoUML.g:360:3: ( rule__OntoUMLClass__Group_0_1__0 )
                    {
                     before(grammarAccess.getOntoUMLClassAccess().getGroup_0_1()); 
                    // InternalOntoUML.g:361:3: ( rule__OntoUMLClass__Group_0_1__0 )
                    // InternalOntoUML.g:361:4: rule__OntoUMLClass__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoUMLClass__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOntoUMLClassAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:365:2: ( ( rule__OntoUMLClass___typeAssignment_0_2 ) )
                    {
                    // InternalOntoUML.g:365:2: ( ( rule__OntoUMLClass___typeAssignment_0_2 ) )
                    // InternalOntoUML.g:366:3: ( rule__OntoUMLClass___typeAssignment_0_2 )
                    {
                     before(grammarAccess.getOntoUMLClassAccess().get_typeAssignment_0_2()); 
                    // InternalOntoUML.g:367:3: ( rule__OntoUMLClass___typeAssignment_0_2 )
                    // InternalOntoUML.g:367:4: rule__OntoUMLClass___typeAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoUMLClass___typeAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getOntoUMLClassAccess().get_typeAssignment_0_2()); 

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
    // $ANTLR end "rule__OntoUMLClass__Alternatives_0"


    // $ANTLR start "rule__RegularAssociation__Alternatives_0"
    // InternalOntoUML.g:375:1: rule__RegularAssociation__Alternatives_0 : ( ( 'association' ) | ( ( rule__RegularAssociation__Group_0_1__0 ) ) | ( ( rule__RegularAssociation___typeAssignment_0_2 ) ) );
    public final void rule__RegularAssociation__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:379:1: ( ( 'association' ) | ( ( rule__RegularAssociation__Group_0_1__0 ) ) | ( ( rule__RegularAssociation___typeAssignment_0_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==13) ) {
                    alt4=2;
                }
                else if ( ((LA4_2>=RULE_STRING && LA4_2<=RULE_ID)) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                int LA4_3 = input.LA(2);

                if ( ((LA4_3>=RULE_STRING && LA4_3<=RULE_ID)) ) {
                    alt4=3;
                }
                else if ( (LA4_3==13) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==13) ) {
                    alt4=2;
                }
                else if ( ((LA4_4>=RULE_STRING && LA4_4<=RULE_ID)) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                int LA4_5 = input.LA(2);

                if ( ((LA4_5>=RULE_STRING && LA4_5<=RULE_ID)) ) {
                    alt4=3;
                }
                else if ( (LA4_5==13) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                int LA4_6 = input.LA(2);

                if ( (LA4_6==13) ) {
                    alt4=2;
                }
                else if ( ((LA4_6>=RULE_STRING && LA4_6<=RULE_ID)) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalOntoUML.g:380:2: ( 'association' )
                    {
                    // InternalOntoUML.g:380:2: ( 'association' )
                    // InternalOntoUML.g:381:3: 'association'
                    {
                     before(grammarAccess.getRegularAssociationAccess().getAssociationKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRegularAssociationAccess().getAssociationKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:386:2: ( ( rule__RegularAssociation__Group_0_1__0 ) )
                    {
                    // InternalOntoUML.g:386:2: ( ( rule__RegularAssociation__Group_0_1__0 ) )
                    // InternalOntoUML.g:387:3: ( rule__RegularAssociation__Group_0_1__0 )
                    {
                     before(grammarAccess.getRegularAssociationAccess().getGroup_0_1()); 
                    // InternalOntoUML.g:388:3: ( rule__RegularAssociation__Group_0_1__0 )
                    // InternalOntoUML.g:388:4: rule__RegularAssociation__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularAssociation__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularAssociationAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:392:2: ( ( rule__RegularAssociation___typeAssignment_0_2 ) )
                    {
                    // InternalOntoUML.g:392:2: ( ( rule__RegularAssociation___typeAssignment_0_2 ) )
                    // InternalOntoUML.g:393:3: ( rule__RegularAssociation___typeAssignment_0_2 )
                    {
                     before(grammarAccess.getRegularAssociationAccess().get_typeAssignment_0_2()); 
                    // InternalOntoUML.g:394:3: ( rule__RegularAssociation___typeAssignment_0_2 )
                    // InternalOntoUML.g:394:4: rule__RegularAssociation___typeAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularAssociation___typeAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRegularAssociationAccess().get_typeAssignment_0_2()); 

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
    // $ANTLR end "rule__RegularAssociation__Alternatives_0"


    // $ANTLR start "rule__StringOrID__Alternatives"
    // InternalOntoUML.g:402:1: rule__StringOrID__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__StringOrID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:406:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntoUML.g:407:2: ( RULE_STRING )
                    {
                    // InternalOntoUML.g:407:2: ( RULE_STRING )
                    // InternalOntoUML.g:408:3: RULE_STRING
                    {
                     before(grammarAccess.getStringOrIDAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getStringOrIDAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:413:2: ( RULE_ID )
                    {
                    // InternalOntoUML.g:413:2: ( RULE_ID )
                    // InternalOntoUML.g:414:3: RULE_ID
                    {
                     before(grammarAccess.getStringOrIDAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getStringOrIDAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__StringOrID__Alternatives"


    // $ANTLR start "rule__EndurantType__Alternatives"
    // InternalOntoUML.g:423:1: rule__EndurantType__Alternatives : ( ( ( 'kind' ) ) | ( ( 'relatorKind' ) ) | ( ( 'modeKind' ) ) | ( ( 'qualityKind' ) ) | ( ( 'subkind' ) ) | ( ( 'role' ) ) | ( ( 'phase' ) ) | ( ( 'category' ) ) | ( ( 'mixin' ) ) | ( ( 'roleMixin' ) ) | ( ( 'phaseMixin' ) ) );
    public final void rule__EndurantType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:427:1: ( ( ( 'kind' ) ) | ( ( 'relatorKind' ) ) | ( ( 'modeKind' ) ) | ( ( 'qualityKind' ) ) | ( ( 'subkind' ) ) | ( ( 'role' ) ) | ( ( 'phase' ) ) | ( ( 'category' ) ) | ( ( 'mixin' ) ) | ( ( 'roleMixin' ) ) | ( ( 'phaseMixin' ) ) )
            int alt6=11;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            case 18:
                {
                alt6=5;
                }
                break;
            case 19:
                {
                alt6=6;
                }
                break;
            case 20:
                {
                alt6=7;
                }
                break;
            case 21:
                {
                alt6=8;
                }
                break;
            case 22:
                {
                alt6=9;
                }
                break;
            case 23:
                {
                alt6=10;
                }
                break;
            case 24:
                {
                alt6=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalOntoUML.g:428:2: ( ( 'kind' ) )
                    {
                    // InternalOntoUML.g:428:2: ( ( 'kind' ) )
                    // InternalOntoUML.g:429:3: ( 'kind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getKindEnumLiteralDeclaration_0()); 
                    // InternalOntoUML.g:430:3: ( 'kind' )
                    // InternalOntoUML.g:430:4: 'kind'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getKindEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:434:2: ( ( 'relatorKind' ) )
                    {
                    // InternalOntoUML.g:434:2: ( ( 'relatorKind' ) )
                    // InternalOntoUML.g:435:3: ( 'relatorKind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getRelatorKindEnumLiteralDeclaration_1()); 
                    // InternalOntoUML.g:436:3: ( 'relatorKind' )
                    // InternalOntoUML.g:436:4: 'relatorKind'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getRelatorKindEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:440:2: ( ( 'modeKind' ) )
                    {
                    // InternalOntoUML.g:440:2: ( ( 'modeKind' ) )
                    // InternalOntoUML.g:441:3: ( 'modeKind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getModeKindEnumLiteralDeclaration_2()); 
                    // InternalOntoUML.g:442:3: ( 'modeKind' )
                    // InternalOntoUML.g:442:4: 'modeKind'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getModeKindEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoUML.g:446:2: ( ( 'qualityKind' ) )
                    {
                    // InternalOntoUML.g:446:2: ( ( 'qualityKind' ) )
                    // InternalOntoUML.g:447:3: ( 'qualityKind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getQualityKindEnumLiteralDeclaration_3()); 
                    // InternalOntoUML.g:448:3: ( 'qualityKind' )
                    // InternalOntoUML.g:448:4: 'qualityKind'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getQualityKindEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoUML.g:452:2: ( ( 'subkind' ) )
                    {
                    // InternalOntoUML.g:452:2: ( ( 'subkind' ) )
                    // InternalOntoUML.g:453:3: ( 'subkind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getSubkindEnumLiteralDeclaration_4()); 
                    // InternalOntoUML.g:454:3: ( 'subkind' )
                    // InternalOntoUML.g:454:4: 'subkind'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getSubkindEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOntoUML.g:458:2: ( ( 'role' ) )
                    {
                    // InternalOntoUML.g:458:2: ( ( 'role' ) )
                    // InternalOntoUML.g:459:3: ( 'role' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getRoleEnumLiteralDeclaration_5()); 
                    // InternalOntoUML.g:460:3: ( 'role' )
                    // InternalOntoUML.g:460:4: 'role'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getRoleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOntoUML.g:464:2: ( ( 'phase' ) )
                    {
                    // InternalOntoUML.g:464:2: ( ( 'phase' ) )
                    // InternalOntoUML.g:465:3: ( 'phase' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getPhaseEnumLiteralDeclaration_6()); 
                    // InternalOntoUML.g:466:3: ( 'phase' )
                    // InternalOntoUML.g:466:4: 'phase'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getPhaseEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalOntoUML.g:470:2: ( ( 'category' ) )
                    {
                    // InternalOntoUML.g:470:2: ( ( 'category' ) )
                    // InternalOntoUML.g:471:3: ( 'category' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getCategoryEnumLiteralDeclaration_7()); 
                    // InternalOntoUML.g:472:3: ( 'category' )
                    // InternalOntoUML.g:472:4: 'category'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getCategoryEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalOntoUML.g:476:2: ( ( 'mixin' ) )
                    {
                    // InternalOntoUML.g:476:2: ( ( 'mixin' ) )
                    // InternalOntoUML.g:477:3: ( 'mixin' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getMixinEnumLiteralDeclaration_8()); 
                    // InternalOntoUML.g:478:3: ( 'mixin' )
                    // InternalOntoUML.g:478:4: 'mixin'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getMixinEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalOntoUML.g:482:2: ( ( 'roleMixin' ) )
                    {
                    // InternalOntoUML.g:482:2: ( ( 'roleMixin' ) )
                    // InternalOntoUML.g:483:3: ( 'roleMixin' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getRoleMixinEnumLiteralDeclaration_9()); 
                    // InternalOntoUML.g:484:3: ( 'roleMixin' )
                    // InternalOntoUML.g:484:4: 'roleMixin'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getRoleMixinEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalOntoUML.g:488:2: ( ( 'phaseMixin' ) )
                    {
                    // InternalOntoUML.g:488:2: ( ( 'phaseMixin' ) )
                    // InternalOntoUML.g:489:3: ( 'phaseMixin' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getPhaseMixinEnumLiteralDeclaration_10()); 
                    // InternalOntoUML.g:490:3: ( 'phaseMixin' )
                    // InternalOntoUML.g:490:4: 'phaseMixin'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getPhaseMixinEnumLiteralDeclaration_10()); 

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
    // $ANTLR end "rule__EndurantType__Alternatives"


    // $ANTLR start "rule__RelationType__Alternatives"
    // InternalOntoUML.g:498:1: rule__RelationType__Alternatives : ( ( ( 'descriptive' ) ) | ( ( 'non-descriptive' ) ) | ( ( 'inherence' ) ) | ( ( 'involvement' ) ) | ( ( 'dependence' ) ) );
    public final void rule__RelationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:502:1: ( ( ( 'descriptive' ) ) | ( ( 'non-descriptive' ) ) | ( ( 'inherence' ) ) | ( ( 'involvement' ) ) | ( ( 'dependence' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            case 28:
                {
                alt7=4;
                }
                break;
            case 29:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalOntoUML.g:503:2: ( ( 'descriptive' ) )
                    {
                    // InternalOntoUML.g:503:2: ( ( 'descriptive' ) )
                    // InternalOntoUML.g:504:3: ( 'descriptive' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getDescriptiveEnumLiteralDeclaration_0()); 
                    // InternalOntoUML.g:505:3: ( 'descriptive' )
                    // InternalOntoUML.g:505:4: 'descriptive'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getDescriptiveEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:509:2: ( ( 'non-descriptive' ) )
                    {
                    // InternalOntoUML.g:509:2: ( ( 'non-descriptive' ) )
                    // InternalOntoUML.g:510:3: ( 'non-descriptive' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getNonDescriptiveEnumLiteralDeclaration_1()); 
                    // InternalOntoUML.g:511:3: ( 'non-descriptive' )
                    // InternalOntoUML.g:511:4: 'non-descriptive'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getNonDescriptiveEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:515:2: ( ( 'inherence' ) )
                    {
                    // InternalOntoUML.g:515:2: ( ( 'inherence' ) )
                    // InternalOntoUML.g:516:3: ( 'inherence' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getInherenceEnumLiteralDeclaration_2()); 
                    // InternalOntoUML.g:517:3: ( 'inherence' )
                    // InternalOntoUML.g:517:4: 'inherence'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getInherenceEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoUML.g:521:2: ( ( 'involvement' ) )
                    {
                    // InternalOntoUML.g:521:2: ( ( 'involvement' ) )
                    // InternalOntoUML.g:522:3: ( 'involvement' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getInvolvementEnumLiteralDeclaration_3()); 
                    // InternalOntoUML.g:523:3: ( 'involvement' )
                    // InternalOntoUML.g:523:4: 'involvement'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getInvolvementEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoUML.g:527:2: ( ( 'dependence' ) )
                    {
                    // InternalOntoUML.g:527:2: ( ( 'dependence' ) )
                    // InternalOntoUML.g:528:3: ( 'dependence' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getDependenceEnumLiteralDeclaration_4()); 
                    // InternalOntoUML.g:529:3: ( 'dependence' )
                    // InternalOntoUML.g:529:4: 'dependence'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getDependenceEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__RelationType__Alternatives"


    // $ANTLR start "rule__OntoUMLClass__Group__0"
    // InternalOntoUML.g:537:1: rule__OntoUMLClass__Group__0 : rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1 ;
    public final void rule__OntoUMLClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:541:1: ( rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1 )
            // InternalOntoUML.g:542:2: rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalOntoUML.g:549:1: rule__OntoUMLClass__Group__0__Impl : ( ( rule__OntoUMLClass__Alternatives_0 ) ) ;
    public final void rule__OntoUMLClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:553:1: ( ( ( rule__OntoUMLClass__Alternatives_0 ) ) )
            // InternalOntoUML.g:554:1: ( ( rule__OntoUMLClass__Alternatives_0 ) )
            {
            // InternalOntoUML.g:554:1: ( ( rule__OntoUMLClass__Alternatives_0 ) )
            // InternalOntoUML.g:555:2: ( rule__OntoUMLClass__Alternatives_0 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getAlternatives_0()); 
            // InternalOntoUML.g:556:2: ( rule__OntoUMLClass__Alternatives_0 )
            // InternalOntoUML.g:556:3: rule__OntoUMLClass__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOntoUMLClassAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group__0__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group__1"
    // InternalOntoUML.g:564:1: rule__OntoUMLClass__Group__1 : rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2 ;
    public final void rule__OntoUMLClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:568:1: ( rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2 )
            // InternalOntoUML.g:569:2: rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalOntoUML.g:576:1: rule__OntoUMLClass__Group__1__Impl : ( ( rule__OntoUMLClass__NameAssignment_1 ) ) ;
    public final void rule__OntoUMLClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:580:1: ( ( ( rule__OntoUMLClass__NameAssignment_1 ) ) )
            // InternalOntoUML.g:581:1: ( ( rule__OntoUMLClass__NameAssignment_1 ) )
            {
            // InternalOntoUML.g:581:1: ( ( rule__OntoUMLClass__NameAssignment_1 ) )
            // InternalOntoUML.g:582:2: ( rule__OntoUMLClass__NameAssignment_1 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getNameAssignment_1()); 
            // InternalOntoUML.g:583:2: ( rule__OntoUMLClass__NameAssignment_1 )
            // InternalOntoUML.g:583:3: rule__OntoUMLClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOntoUMLClassAccess().getNameAssignment_1()); 

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
    // InternalOntoUML.g:591:1: rule__OntoUMLClass__Group__2 : rule__OntoUMLClass__Group__2__Impl ;
    public final void rule__OntoUMLClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:595:1: ( rule__OntoUMLClass__Group__2__Impl )
            // InternalOntoUML.g:596:2: rule__OntoUMLClass__Group__2__Impl
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
    // InternalOntoUML.g:602:1: rule__OntoUMLClass__Group__2__Impl : ( ( rule__OntoUMLClass__Group_2__0 )? ) ;
    public final void rule__OntoUMLClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:606:1: ( ( ( rule__OntoUMLClass__Group_2__0 )? ) )
            // InternalOntoUML.g:607:1: ( ( rule__OntoUMLClass__Group_2__0 )? )
            {
            // InternalOntoUML.g:607:1: ( ( rule__OntoUMLClass__Group_2__0 )? )
            // InternalOntoUML.g:608:2: ( rule__OntoUMLClass__Group_2__0 )?
            {
             before(grammarAccess.getOntoUMLClassAccess().getGroup_2()); 
            // InternalOntoUML.g:609:2: ( rule__OntoUMLClass__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOntoUML.g:609:3: rule__OntoUMLClass__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoUMLClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOntoUMLClassAccess().getGroup_2()); 

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


    // $ANTLR start "rule__OntoUMLClass__Group_0_1__0"
    // InternalOntoUML.g:618:1: rule__OntoUMLClass__Group_0_1__0 : rule__OntoUMLClass__Group_0_1__0__Impl rule__OntoUMLClass__Group_0_1__1 ;
    public final void rule__OntoUMLClass__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:622:1: ( rule__OntoUMLClass__Group_0_1__0__Impl rule__OntoUMLClass__Group_0_1__1 )
            // InternalOntoUML.g:623:2: rule__OntoUMLClass__Group_0_1__0__Impl rule__OntoUMLClass__Group_0_1__1
            {
            pushFollow(FOLLOW_6);
            rule__OntoUMLClass__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_0_1__1();

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
    // $ANTLR end "rule__OntoUMLClass__Group_0_1__0"


    // $ANTLR start "rule__OntoUMLClass__Group_0_1__0__Impl"
    // InternalOntoUML.g:630:1: rule__OntoUMLClass__Group_0_1__0__Impl : ( ( rule__OntoUMLClass___typeAssignment_0_1_0 ) ) ;
    public final void rule__OntoUMLClass__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:634:1: ( ( ( rule__OntoUMLClass___typeAssignment_0_1_0 ) ) )
            // InternalOntoUML.g:635:1: ( ( rule__OntoUMLClass___typeAssignment_0_1_0 ) )
            {
            // InternalOntoUML.g:635:1: ( ( rule__OntoUMLClass___typeAssignment_0_1_0 ) )
            // InternalOntoUML.g:636:2: ( rule__OntoUMLClass___typeAssignment_0_1_0 )
            {
             before(grammarAccess.getOntoUMLClassAccess().get_typeAssignment_0_1_0()); 
            // InternalOntoUML.g:637:2: ( rule__OntoUMLClass___typeAssignment_0_1_0 )
            // InternalOntoUML.g:637:3: rule__OntoUMLClass___typeAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass___typeAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOntoUMLClassAccess().get_typeAssignment_0_1_0()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_0_1__0__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_0_1__1"
    // InternalOntoUML.g:645:1: rule__OntoUMLClass__Group_0_1__1 : rule__OntoUMLClass__Group_0_1__1__Impl ;
    public final void rule__OntoUMLClass__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:649:1: ( rule__OntoUMLClass__Group_0_1__1__Impl )
            // InternalOntoUML.g:650:2: rule__OntoUMLClass__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__OntoUMLClass__Group_0_1__1"


    // $ANTLR start "rule__OntoUMLClass__Group_0_1__1__Impl"
    // InternalOntoUML.g:656:1: rule__OntoUMLClass__Group_0_1__1__Impl : ( 'class' ) ;
    public final void rule__OntoUMLClass__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:660:1: ( ( 'class' ) )
            // InternalOntoUML.g:661:1: ( 'class' )
            {
            // InternalOntoUML.g:661:1: ( 'class' )
            // InternalOntoUML.g:662:2: 'class'
            {
             before(grammarAccess.getOntoUMLClassAccess().getClassKeyword_0_1_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getClassKeyword_0_1_1()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_0_1__1__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_2__0"
    // InternalOntoUML.g:672:1: rule__OntoUMLClass__Group_2__0 : rule__OntoUMLClass__Group_2__0__Impl rule__OntoUMLClass__Group_2__1 ;
    public final void rule__OntoUMLClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:676:1: ( rule__OntoUMLClass__Group_2__0__Impl rule__OntoUMLClass__Group_2__1 )
            // InternalOntoUML.g:677:2: rule__OntoUMLClass__Group_2__0__Impl rule__OntoUMLClass__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__OntoUMLClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_2__1();

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
    // $ANTLR end "rule__OntoUMLClass__Group_2__0"


    // $ANTLR start "rule__OntoUMLClass__Group_2__0__Impl"
    // InternalOntoUML.g:684:1: rule__OntoUMLClass__Group_2__0__Impl : ( 'aka' ) ;
    public final void rule__OntoUMLClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:688:1: ( ( 'aka' ) )
            // InternalOntoUML.g:689:1: ( 'aka' )
            {
            // InternalOntoUML.g:689:1: ( 'aka' )
            // InternalOntoUML.g:690:2: 'aka'
            {
             before(grammarAccess.getOntoUMLClassAccess().getAkaKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getAkaKeyword_2_0()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_2__0__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_2__1"
    // InternalOntoUML.g:699:1: rule__OntoUMLClass__Group_2__1 : rule__OntoUMLClass__Group_2__1__Impl ;
    public final void rule__OntoUMLClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:703:1: ( rule__OntoUMLClass__Group_2__1__Impl )
            // InternalOntoUML.g:704:2: rule__OntoUMLClass__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_2__1__Impl();

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
    // $ANTLR end "rule__OntoUMLClass__Group_2__1"


    // $ANTLR start "rule__OntoUMLClass__Group_2__1__Impl"
    // InternalOntoUML.g:710:1: rule__OntoUMLClass__Group_2__1__Impl : ( ( rule__OntoUMLClass__AliasAssignment_2_1 ) ) ;
    public final void rule__OntoUMLClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:714:1: ( ( ( rule__OntoUMLClass__AliasAssignment_2_1 ) ) )
            // InternalOntoUML.g:715:1: ( ( rule__OntoUMLClass__AliasAssignment_2_1 ) )
            {
            // InternalOntoUML.g:715:1: ( ( rule__OntoUMLClass__AliasAssignment_2_1 ) )
            // InternalOntoUML.g:716:2: ( rule__OntoUMLClass__AliasAssignment_2_1 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getAliasAssignment_2_1()); 
            // InternalOntoUML.g:717:2: ( rule__OntoUMLClass__AliasAssignment_2_1 )
            // InternalOntoUML.g:717:3: rule__OntoUMLClass__AliasAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__AliasAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOntoUMLClassAccess().getAliasAssignment_2_1()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_2__1__Impl"


    // $ANTLR start "rule__RegularAssociation__Group__0"
    // InternalOntoUML.g:726:1: rule__RegularAssociation__Group__0 : rule__RegularAssociation__Group__0__Impl rule__RegularAssociation__Group__1 ;
    public final void rule__RegularAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:730:1: ( rule__RegularAssociation__Group__0__Impl rule__RegularAssociation__Group__1 )
            // InternalOntoUML.g:731:2: rule__RegularAssociation__Group__0__Impl rule__RegularAssociation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RegularAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__1();

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
    // $ANTLR end "rule__RegularAssociation__Group__0"


    // $ANTLR start "rule__RegularAssociation__Group__0__Impl"
    // InternalOntoUML.g:738:1: rule__RegularAssociation__Group__0__Impl : ( ( rule__RegularAssociation__Alternatives_0 ) ) ;
    public final void rule__RegularAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:742:1: ( ( ( rule__RegularAssociation__Alternatives_0 ) ) )
            // InternalOntoUML.g:743:1: ( ( rule__RegularAssociation__Alternatives_0 ) )
            {
            // InternalOntoUML.g:743:1: ( ( rule__RegularAssociation__Alternatives_0 ) )
            // InternalOntoUML.g:744:2: ( rule__RegularAssociation__Alternatives_0 )
            {
             before(grammarAccess.getRegularAssociationAccess().getAlternatives_0()); 
            // InternalOntoUML.g:745:2: ( rule__RegularAssociation__Alternatives_0 )
            // InternalOntoUML.g:745:3: rule__RegularAssociation__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRegularAssociationAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__RegularAssociation__Group__0__Impl"


    // $ANTLR start "rule__RegularAssociation__Group__1"
    // InternalOntoUML.g:753:1: rule__RegularAssociation__Group__1 : rule__RegularAssociation__Group__1__Impl rule__RegularAssociation__Group__2 ;
    public final void rule__RegularAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:757:1: ( rule__RegularAssociation__Group__1__Impl rule__RegularAssociation__Group__2 )
            // InternalOntoUML.g:758:2: rule__RegularAssociation__Group__1__Impl rule__RegularAssociation__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RegularAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__2();

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
    // $ANTLR end "rule__RegularAssociation__Group__1"


    // $ANTLR start "rule__RegularAssociation__Group__1__Impl"
    // InternalOntoUML.g:765:1: rule__RegularAssociation__Group__1__Impl : ( ( rule__RegularAssociation__NameAssignment_1 ) ) ;
    public final void rule__RegularAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:769:1: ( ( ( rule__RegularAssociation__NameAssignment_1 ) ) )
            // InternalOntoUML.g:770:1: ( ( rule__RegularAssociation__NameAssignment_1 ) )
            {
            // InternalOntoUML.g:770:1: ( ( rule__RegularAssociation__NameAssignment_1 ) )
            // InternalOntoUML.g:771:2: ( rule__RegularAssociation__NameAssignment_1 )
            {
             before(grammarAccess.getRegularAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUML.g:772:2: ( rule__RegularAssociation__NameAssignment_1 )
            // InternalOntoUML.g:772:3: rule__RegularAssociation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularAssociationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RegularAssociation__Group__1__Impl"


    // $ANTLR start "rule__RegularAssociation__Group__2"
    // InternalOntoUML.g:780:1: rule__RegularAssociation__Group__2 : rule__RegularAssociation__Group__2__Impl rule__RegularAssociation__Group__3 ;
    public final void rule__RegularAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:784:1: ( rule__RegularAssociation__Group__2__Impl rule__RegularAssociation__Group__3 )
            // InternalOntoUML.g:785:2: rule__RegularAssociation__Group__2__Impl rule__RegularAssociation__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__RegularAssociation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__3();

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
    // $ANTLR end "rule__RegularAssociation__Group__2"


    // $ANTLR start "rule__RegularAssociation__Group__2__Impl"
    // InternalOntoUML.g:792:1: rule__RegularAssociation__Group__2__Impl : ( ( rule__RegularAssociation__Group_2__0 )? ) ;
    public final void rule__RegularAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:796:1: ( ( ( rule__RegularAssociation__Group_2__0 )? ) )
            // InternalOntoUML.g:797:1: ( ( rule__RegularAssociation__Group_2__0 )? )
            {
            // InternalOntoUML.g:797:1: ( ( rule__RegularAssociation__Group_2__0 )? )
            // InternalOntoUML.g:798:2: ( rule__RegularAssociation__Group_2__0 )?
            {
             before(grammarAccess.getRegularAssociationAccess().getGroup_2()); 
            // InternalOntoUML.g:799:2: ( rule__RegularAssociation__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoUML.g:799:3: rule__RegularAssociation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularAssociation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularAssociationAccess().getGroup_2()); 

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
    // $ANTLR end "rule__RegularAssociation__Group__2__Impl"


    // $ANTLR start "rule__RegularAssociation__Group__3"
    // InternalOntoUML.g:807:1: rule__RegularAssociation__Group__3 : rule__RegularAssociation__Group__3__Impl rule__RegularAssociation__Group__4 ;
    public final void rule__RegularAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:811:1: ( rule__RegularAssociation__Group__3__Impl rule__RegularAssociation__Group__4 )
            // InternalOntoUML.g:812:2: rule__RegularAssociation__Group__3__Impl rule__RegularAssociation__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__RegularAssociation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__4();

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
    // $ANTLR end "rule__RegularAssociation__Group__3"


    // $ANTLR start "rule__RegularAssociation__Group__3__Impl"
    // InternalOntoUML.g:819:1: rule__RegularAssociation__Group__3__Impl : ( ( rule__RegularAssociation__EndAMultiplicityAssignment_3 )? ) ;
    public final void rule__RegularAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:823:1: ( ( ( rule__RegularAssociation__EndAMultiplicityAssignment_3 )? ) )
            // InternalOntoUML.g:824:1: ( ( rule__RegularAssociation__EndAMultiplicityAssignment_3 )? )
            {
            // InternalOntoUML.g:824:1: ( ( rule__RegularAssociation__EndAMultiplicityAssignment_3 )? )
            // InternalOntoUML.g:825:2: ( rule__RegularAssociation__EndAMultiplicityAssignment_3 )?
            {
             before(grammarAccess.getRegularAssociationAccess().getEndAMultiplicityAssignment_3()); 
            // InternalOntoUML.g:826:2: ( rule__RegularAssociation__EndAMultiplicityAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoUML.g:826:3: rule__RegularAssociation__EndAMultiplicityAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularAssociation__EndAMultiplicityAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularAssociationAccess().getEndAMultiplicityAssignment_3()); 

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
    // $ANTLR end "rule__RegularAssociation__Group__3__Impl"


    // $ANTLR start "rule__RegularAssociation__Group__4"
    // InternalOntoUML.g:834:1: rule__RegularAssociation__Group__4 : rule__RegularAssociation__Group__4__Impl rule__RegularAssociation__Group__5 ;
    public final void rule__RegularAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:838:1: ( rule__RegularAssociation__Group__4__Impl rule__RegularAssociation__Group__5 )
            // InternalOntoUML.g:839:2: rule__RegularAssociation__Group__4__Impl rule__RegularAssociation__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__RegularAssociation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__5();

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
    // $ANTLR end "rule__RegularAssociation__Group__4"


    // $ANTLR start "rule__RegularAssociation__Group__4__Impl"
    // InternalOntoUML.g:846:1: rule__RegularAssociation__Group__4__Impl : ( ( rule__RegularAssociation__EndAAssignment_4 ) ) ;
    public final void rule__RegularAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:850:1: ( ( ( rule__RegularAssociation__EndAAssignment_4 ) ) )
            // InternalOntoUML.g:851:1: ( ( rule__RegularAssociation__EndAAssignment_4 ) )
            {
            // InternalOntoUML.g:851:1: ( ( rule__RegularAssociation__EndAAssignment_4 ) )
            // InternalOntoUML.g:852:2: ( rule__RegularAssociation__EndAAssignment_4 )
            {
             before(grammarAccess.getRegularAssociationAccess().getEndAAssignment_4()); 
            // InternalOntoUML.g:853:2: ( rule__RegularAssociation__EndAAssignment_4 )
            // InternalOntoUML.g:853:3: rule__RegularAssociation__EndAAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__EndAAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRegularAssociationAccess().getEndAAssignment_4()); 

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
    // $ANTLR end "rule__RegularAssociation__Group__4__Impl"


    // $ANTLR start "rule__RegularAssociation__Group__5"
    // InternalOntoUML.g:861:1: rule__RegularAssociation__Group__5 : rule__RegularAssociation__Group__5__Impl rule__RegularAssociation__Group__6 ;
    public final void rule__RegularAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:865:1: ( rule__RegularAssociation__Group__5__Impl rule__RegularAssociation__Group__6 )
            // InternalOntoUML.g:866:2: rule__RegularAssociation__Group__5__Impl rule__RegularAssociation__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__RegularAssociation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__6();

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
    // $ANTLR end "rule__RegularAssociation__Group__5"


    // $ANTLR start "rule__RegularAssociation__Group__5__Impl"
    // InternalOntoUML.g:873:1: rule__RegularAssociation__Group__5__Impl : ( ( rule__RegularAssociation__EndBMultiplicityAssignment_5 )? ) ;
    public final void rule__RegularAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:877:1: ( ( ( rule__RegularAssociation__EndBMultiplicityAssignment_5 )? ) )
            // InternalOntoUML.g:878:1: ( ( rule__RegularAssociation__EndBMultiplicityAssignment_5 )? )
            {
            // InternalOntoUML.g:878:1: ( ( rule__RegularAssociation__EndBMultiplicityAssignment_5 )? )
            // InternalOntoUML.g:879:2: ( rule__RegularAssociation__EndBMultiplicityAssignment_5 )?
            {
             before(grammarAccess.getRegularAssociationAccess().getEndBMultiplicityAssignment_5()); 
            // InternalOntoUML.g:880:2: ( rule__RegularAssociation__EndBMultiplicityAssignment_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntoUML.g:880:3: rule__RegularAssociation__EndBMultiplicityAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularAssociation__EndBMultiplicityAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularAssociationAccess().getEndBMultiplicityAssignment_5()); 

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
    // $ANTLR end "rule__RegularAssociation__Group__5__Impl"


    // $ANTLR start "rule__RegularAssociation__Group__6"
    // InternalOntoUML.g:888:1: rule__RegularAssociation__Group__6 : rule__RegularAssociation__Group__6__Impl ;
    public final void rule__RegularAssociation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:892:1: ( rule__RegularAssociation__Group__6__Impl )
            // InternalOntoUML.g:893:2: rule__RegularAssociation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__6__Impl();

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
    // $ANTLR end "rule__RegularAssociation__Group__6"


    // $ANTLR start "rule__RegularAssociation__Group__6__Impl"
    // InternalOntoUML.g:899:1: rule__RegularAssociation__Group__6__Impl : ( ( rule__RegularAssociation__EndBAssignment_6 ) ) ;
    public final void rule__RegularAssociation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:903:1: ( ( ( rule__RegularAssociation__EndBAssignment_6 ) ) )
            // InternalOntoUML.g:904:1: ( ( rule__RegularAssociation__EndBAssignment_6 ) )
            {
            // InternalOntoUML.g:904:1: ( ( rule__RegularAssociation__EndBAssignment_6 ) )
            // InternalOntoUML.g:905:2: ( rule__RegularAssociation__EndBAssignment_6 )
            {
             before(grammarAccess.getRegularAssociationAccess().getEndBAssignment_6()); 
            // InternalOntoUML.g:906:2: ( rule__RegularAssociation__EndBAssignment_6 )
            // InternalOntoUML.g:906:3: rule__RegularAssociation__EndBAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__EndBAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRegularAssociationAccess().getEndBAssignment_6()); 

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
    // $ANTLR end "rule__RegularAssociation__Group__6__Impl"


    // $ANTLR start "rule__RegularAssociation__Group_0_1__0"
    // InternalOntoUML.g:915:1: rule__RegularAssociation__Group_0_1__0 : rule__RegularAssociation__Group_0_1__0__Impl rule__RegularAssociation__Group_0_1__1 ;
    public final void rule__RegularAssociation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:919:1: ( rule__RegularAssociation__Group_0_1__0__Impl rule__RegularAssociation__Group_0_1__1 )
            // InternalOntoUML.g:920:2: rule__RegularAssociation__Group_0_1__0__Impl rule__RegularAssociation__Group_0_1__1
            {
            pushFollow(FOLLOW_9);
            rule__RegularAssociation__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group_0_1__1();

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
    // $ANTLR end "rule__RegularAssociation__Group_0_1__0"


    // $ANTLR start "rule__RegularAssociation__Group_0_1__0__Impl"
    // InternalOntoUML.g:927:1: rule__RegularAssociation__Group_0_1__0__Impl : ( ( rule__RegularAssociation___typeAssignment_0_1_0 ) ) ;
    public final void rule__RegularAssociation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:931:1: ( ( ( rule__RegularAssociation___typeAssignment_0_1_0 ) ) )
            // InternalOntoUML.g:932:1: ( ( rule__RegularAssociation___typeAssignment_0_1_0 ) )
            {
            // InternalOntoUML.g:932:1: ( ( rule__RegularAssociation___typeAssignment_0_1_0 ) )
            // InternalOntoUML.g:933:2: ( rule__RegularAssociation___typeAssignment_0_1_0 )
            {
             before(grammarAccess.getRegularAssociationAccess().get_typeAssignment_0_1_0()); 
            // InternalOntoUML.g:934:2: ( rule__RegularAssociation___typeAssignment_0_1_0 )
            // InternalOntoUML.g:934:3: rule__RegularAssociation___typeAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation___typeAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRegularAssociationAccess().get_typeAssignment_0_1_0()); 

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
    // $ANTLR end "rule__RegularAssociation__Group_0_1__0__Impl"


    // $ANTLR start "rule__RegularAssociation__Group_0_1__1"
    // InternalOntoUML.g:942:1: rule__RegularAssociation__Group_0_1__1 : rule__RegularAssociation__Group_0_1__1__Impl ;
    public final void rule__RegularAssociation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:946:1: ( rule__RegularAssociation__Group_0_1__1__Impl )
            // InternalOntoUML.g:947:2: rule__RegularAssociation__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__RegularAssociation__Group_0_1__1"


    // $ANTLR start "rule__RegularAssociation__Group_0_1__1__Impl"
    // InternalOntoUML.g:953:1: rule__RegularAssociation__Group_0_1__1__Impl : ( 'association' ) ;
    public final void rule__RegularAssociation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:957:1: ( ( 'association' ) )
            // InternalOntoUML.g:958:1: ( 'association' )
            {
            // InternalOntoUML.g:958:1: ( 'association' )
            // InternalOntoUML.g:959:2: 'association'
            {
             before(grammarAccess.getRegularAssociationAccess().getAssociationKeyword_0_1_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRegularAssociationAccess().getAssociationKeyword_0_1_1()); 

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
    // $ANTLR end "rule__RegularAssociation__Group_0_1__1__Impl"


    // $ANTLR start "rule__RegularAssociation__Group_2__0"
    // InternalOntoUML.g:969:1: rule__RegularAssociation__Group_2__0 : rule__RegularAssociation__Group_2__0__Impl rule__RegularAssociation__Group_2__1 ;
    public final void rule__RegularAssociation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:973:1: ( rule__RegularAssociation__Group_2__0__Impl rule__RegularAssociation__Group_2__1 )
            // InternalOntoUML.g:974:2: rule__RegularAssociation__Group_2__0__Impl rule__RegularAssociation__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__RegularAssociation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group_2__1();

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
    // $ANTLR end "rule__RegularAssociation__Group_2__0"


    // $ANTLR start "rule__RegularAssociation__Group_2__0__Impl"
    // InternalOntoUML.g:981:1: rule__RegularAssociation__Group_2__0__Impl : ( 'aka' ) ;
    public final void rule__RegularAssociation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:985:1: ( ( 'aka' ) )
            // InternalOntoUML.g:986:1: ( 'aka' )
            {
            // InternalOntoUML.g:986:1: ( 'aka' )
            // InternalOntoUML.g:987:2: 'aka'
            {
             before(grammarAccess.getRegularAssociationAccess().getAkaKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRegularAssociationAccess().getAkaKeyword_2_0()); 

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
    // $ANTLR end "rule__RegularAssociation__Group_2__0__Impl"


    // $ANTLR start "rule__RegularAssociation__Group_2__1"
    // InternalOntoUML.g:996:1: rule__RegularAssociation__Group_2__1 : rule__RegularAssociation__Group_2__1__Impl ;
    public final void rule__RegularAssociation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1000:1: ( rule__RegularAssociation__Group_2__1__Impl )
            // InternalOntoUML.g:1001:2: rule__RegularAssociation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group_2__1__Impl();

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
    // $ANTLR end "rule__RegularAssociation__Group_2__1"


    // $ANTLR start "rule__RegularAssociation__Group_2__1__Impl"
    // InternalOntoUML.g:1007:1: rule__RegularAssociation__Group_2__1__Impl : ( ( rule__RegularAssociation__AliasAssignment_2_1 ) ) ;
    public final void rule__RegularAssociation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1011:1: ( ( ( rule__RegularAssociation__AliasAssignment_2_1 ) ) )
            // InternalOntoUML.g:1012:1: ( ( rule__RegularAssociation__AliasAssignment_2_1 ) )
            {
            // InternalOntoUML.g:1012:1: ( ( rule__RegularAssociation__AliasAssignment_2_1 ) )
            // InternalOntoUML.g:1013:2: ( rule__RegularAssociation__AliasAssignment_2_1 )
            {
             before(grammarAccess.getRegularAssociationAccess().getAliasAssignment_2_1()); 
            // InternalOntoUML.g:1014:2: ( rule__RegularAssociation__AliasAssignment_2_1 )
            // InternalOntoUML.g:1014:3: rule__RegularAssociation__AliasAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__AliasAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularAssociationAccess().getAliasAssignment_2_1()); 

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
    // $ANTLR end "rule__RegularAssociation__Group_2__1__Impl"


    // $ANTLR start "rule__DerivationAssociation__Group__0"
    // InternalOntoUML.g:1023:1: rule__DerivationAssociation__Group__0 : rule__DerivationAssociation__Group__0__Impl rule__DerivationAssociation__Group__1 ;
    public final void rule__DerivationAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1027:1: ( rule__DerivationAssociation__Group__0__Impl rule__DerivationAssociation__Group__1 )
            // InternalOntoUML.g:1028:2: rule__DerivationAssociation__Group__0__Impl rule__DerivationAssociation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DerivationAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__Group__1();

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
    // $ANTLR end "rule__DerivationAssociation__Group__0"


    // $ANTLR start "rule__DerivationAssociation__Group__0__Impl"
    // InternalOntoUML.g:1035:1: rule__DerivationAssociation__Group__0__Impl : ( 'derivation' ) ;
    public final void rule__DerivationAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1039:1: ( ( 'derivation' ) )
            // InternalOntoUML.g:1040:1: ( 'derivation' )
            {
            // InternalOntoUML.g:1040:1: ( 'derivation' )
            // InternalOntoUML.g:1041:2: 'derivation'
            {
             before(grammarAccess.getDerivationAssociationAccess().getDerivationKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDerivationAssociationAccess().getDerivationKeyword_0()); 

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
    // $ANTLR end "rule__DerivationAssociation__Group__0__Impl"


    // $ANTLR start "rule__DerivationAssociation__Group__1"
    // InternalOntoUML.g:1050:1: rule__DerivationAssociation__Group__1 : rule__DerivationAssociation__Group__1__Impl rule__DerivationAssociation__Group__2 ;
    public final void rule__DerivationAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1054:1: ( rule__DerivationAssociation__Group__1__Impl rule__DerivationAssociation__Group__2 )
            // InternalOntoUML.g:1055:2: rule__DerivationAssociation__Group__1__Impl rule__DerivationAssociation__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__DerivationAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__Group__2();

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
    // $ANTLR end "rule__DerivationAssociation__Group__1"


    // $ANTLR start "rule__DerivationAssociation__Group__1__Impl"
    // InternalOntoUML.g:1062:1: rule__DerivationAssociation__Group__1__Impl : ( ( rule__DerivationAssociation__NameAssignment_1 ) ) ;
    public final void rule__DerivationAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1066:1: ( ( ( rule__DerivationAssociation__NameAssignment_1 ) ) )
            // InternalOntoUML.g:1067:1: ( ( rule__DerivationAssociation__NameAssignment_1 ) )
            {
            // InternalOntoUML.g:1067:1: ( ( rule__DerivationAssociation__NameAssignment_1 ) )
            // InternalOntoUML.g:1068:2: ( rule__DerivationAssociation__NameAssignment_1 )
            {
             before(grammarAccess.getDerivationAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUML.g:1069:2: ( rule__DerivationAssociation__NameAssignment_1 )
            // InternalOntoUML.g:1069:3: rule__DerivationAssociation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDerivationAssociationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DerivationAssociation__Group__1__Impl"


    // $ANTLR start "rule__DerivationAssociation__Group__2"
    // InternalOntoUML.g:1077:1: rule__DerivationAssociation__Group__2 : rule__DerivationAssociation__Group__2__Impl rule__DerivationAssociation__Group__3 ;
    public final void rule__DerivationAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1081:1: ( rule__DerivationAssociation__Group__2__Impl rule__DerivationAssociation__Group__3 )
            // InternalOntoUML.g:1082:2: rule__DerivationAssociation__Group__2__Impl rule__DerivationAssociation__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__DerivationAssociation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__Group__3();

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
    // $ANTLR end "rule__DerivationAssociation__Group__2"


    // $ANTLR start "rule__DerivationAssociation__Group__2__Impl"
    // InternalOntoUML.g:1089:1: rule__DerivationAssociation__Group__2__Impl : ( ( rule__DerivationAssociation__Group_2__0 )? ) ;
    public final void rule__DerivationAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1093:1: ( ( ( rule__DerivationAssociation__Group_2__0 )? ) )
            // InternalOntoUML.g:1094:1: ( ( rule__DerivationAssociation__Group_2__0 )? )
            {
            // InternalOntoUML.g:1094:1: ( ( rule__DerivationAssociation__Group_2__0 )? )
            // InternalOntoUML.g:1095:2: ( rule__DerivationAssociation__Group_2__0 )?
            {
             before(grammarAccess.getDerivationAssociationAccess().getGroup_2()); 
            // InternalOntoUML.g:1096:2: ( rule__DerivationAssociation__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntoUML.g:1096:3: rule__DerivationAssociation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DerivationAssociation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDerivationAssociationAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DerivationAssociation__Group__2__Impl"


    // $ANTLR start "rule__DerivationAssociation__Group__3"
    // InternalOntoUML.g:1104:1: rule__DerivationAssociation__Group__3 : rule__DerivationAssociation__Group__3__Impl ;
    public final void rule__DerivationAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1108:1: ( rule__DerivationAssociation__Group__3__Impl )
            // InternalOntoUML.g:1109:2: rule__DerivationAssociation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__Group__3__Impl();

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
    // $ANTLR end "rule__DerivationAssociation__Group__3"


    // $ANTLR start "rule__DerivationAssociation__Group__3__Impl"
    // InternalOntoUML.g:1115:1: rule__DerivationAssociation__Group__3__Impl : ( ( rule__DerivationAssociation__UnorderedGroup_3 ) ) ;
    public final void rule__DerivationAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1119:1: ( ( ( rule__DerivationAssociation__UnorderedGroup_3 ) ) )
            // InternalOntoUML.g:1120:1: ( ( rule__DerivationAssociation__UnorderedGroup_3 ) )
            {
            // InternalOntoUML.g:1120:1: ( ( rule__DerivationAssociation__UnorderedGroup_3 ) )
            // InternalOntoUML.g:1121:2: ( rule__DerivationAssociation__UnorderedGroup_3 )
            {
             before(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3()); 
            // InternalOntoUML.g:1122:2: ( rule__DerivationAssociation__UnorderedGroup_3 )
            // InternalOntoUML.g:1122:3: rule__DerivationAssociation__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3()); 

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
    // $ANTLR end "rule__DerivationAssociation__Group__3__Impl"


    // $ANTLR start "rule__DerivationAssociation__Group_2__0"
    // InternalOntoUML.g:1131:1: rule__DerivationAssociation__Group_2__0 : rule__DerivationAssociation__Group_2__0__Impl rule__DerivationAssociation__Group_2__1 ;
    public final void rule__DerivationAssociation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1135:1: ( rule__DerivationAssociation__Group_2__0__Impl rule__DerivationAssociation__Group_2__1 )
            // InternalOntoUML.g:1136:2: rule__DerivationAssociation__Group_2__0__Impl rule__DerivationAssociation__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__DerivationAssociation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__Group_2__1();

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
    // $ANTLR end "rule__DerivationAssociation__Group_2__0"


    // $ANTLR start "rule__DerivationAssociation__Group_2__0__Impl"
    // InternalOntoUML.g:1143:1: rule__DerivationAssociation__Group_2__0__Impl : ( 'aka' ) ;
    public final void rule__DerivationAssociation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1147:1: ( ( 'aka' ) )
            // InternalOntoUML.g:1148:1: ( 'aka' )
            {
            // InternalOntoUML.g:1148:1: ( 'aka' )
            // InternalOntoUML.g:1149:2: 'aka'
            {
             before(grammarAccess.getDerivationAssociationAccess().getAkaKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDerivationAssociationAccess().getAkaKeyword_2_0()); 

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
    // $ANTLR end "rule__DerivationAssociation__Group_2__0__Impl"


    // $ANTLR start "rule__DerivationAssociation__Group_2__1"
    // InternalOntoUML.g:1158:1: rule__DerivationAssociation__Group_2__1 : rule__DerivationAssociation__Group_2__1__Impl ;
    public final void rule__DerivationAssociation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1162:1: ( rule__DerivationAssociation__Group_2__1__Impl )
            // InternalOntoUML.g:1163:2: rule__DerivationAssociation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__Group_2__1__Impl();

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
    // $ANTLR end "rule__DerivationAssociation__Group_2__1"


    // $ANTLR start "rule__DerivationAssociation__Group_2__1__Impl"
    // InternalOntoUML.g:1169:1: rule__DerivationAssociation__Group_2__1__Impl : ( ( rule__DerivationAssociation__AliasAssignment_2_1 ) ) ;
    public final void rule__DerivationAssociation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1173:1: ( ( ( rule__DerivationAssociation__AliasAssignment_2_1 ) ) )
            // InternalOntoUML.g:1174:1: ( ( rule__DerivationAssociation__AliasAssignment_2_1 ) )
            {
            // InternalOntoUML.g:1174:1: ( ( rule__DerivationAssociation__AliasAssignment_2_1 ) )
            // InternalOntoUML.g:1175:2: ( rule__DerivationAssociation__AliasAssignment_2_1 )
            {
             before(grammarAccess.getDerivationAssociationAccess().getAliasAssignment_2_1()); 
            // InternalOntoUML.g:1176:2: ( rule__DerivationAssociation__AliasAssignment_2_1 )
            // InternalOntoUML.g:1176:3: rule__DerivationAssociation__AliasAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__AliasAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDerivationAssociationAccess().getAliasAssignment_2_1()); 

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
    // $ANTLR end "rule__DerivationAssociation__Group_2__1__Impl"


    // $ANTLR start "rule__DerivationAssociation__Group_3_0__0"
    // InternalOntoUML.g:1185:1: rule__DerivationAssociation__Group_3_0__0 : rule__DerivationAssociation__Group_3_0__0__Impl rule__DerivationAssociation__Group_3_0__1 ;
    public final void rule__DerivationAssociation__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1189:1: ( rule__DerivationAssociation__Group_3_0__0__Impl rule__DerivationAssociation__Group_3_0__1 )
            // InternalOntoUML.g:1190:2: rule__DerivationAssociation__Group_3_0__0__Impl rule__DerivationAssociation__Group_3_0__1
            {
            pushFollow(FOLLOW_8);
            rule__DerivationAssociation__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__Group_3_0__1();

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
    // $ANTLR end "rule__DerivationAssociation__Group_3_0__0"


    // $ANTLR start "rule__DerivationAssociation__Group_3_0__0__Impl"
    // InternalOntoUML.g:1197:1: rule__DerivationAssociation__Group_3_0__0__Impl : ( ( rule__DerivationAssociation__EndAMultiplicityAssignment_3_0_0 )? ) ;
    public final void rule__DerivationAssociation__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1201:1: ( ( ( rule__DerivationAssociation__EndAMultiplicityAssignment_3_0_0 )? ) )
            // InternalOntoUML.g:1202:1: ( ( rule__DerivationAssociation__EndAMultiplicityAssignment_3_0_0 )? )
            {
            // InternalOntoUML.g:1202:1: ( ( rule__DerivationAssociation__EndAMultiplicityAssignment_3_0_0 )? )
            // InternalOntoUML.g:1203:2: ( rule__DerivationAssociation__EndAMultiplicityAssignment_3_0_0 )?
            {
             before(grammarAccess.getDerivationAssociationAccess().getEndAMultiplicityAssignment_3_0_0()); 
            // InternalOntoUML.g:1204:2: ( rule__DerivationAssociation__EndAMultiplicityAssignment_3_0_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOntoUML.g:1204:3: rule__DerivationAssociation__EndAMultiplicityAssignment_3_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DerivationAssociation__EndAMultiplicityAssignment_3_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDerivationAssociationAccess().getEndAMultiplicityAssignment_3_0_0()); 

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
    // $ANTLR end "rule__DerivationAssociation__Group_3_0__0__Impl"


    // $ANTLR start "rule__DerivationAssociation__Group_3_0__1"
    // InternalOntoUML.g:1212:1: rule__DerivationAssociation__Group_3_0__1 : rule__DerivationAssociation__Group_3_0__1__Impl ;
    public final void rule__DerivationAssociation__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1216:1: ( rule__DerivationAssociation__Group_3_0__1__Impl )
            // InternalOntoUML.g:1217:2: rule__DerivationAssociation__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__DerivationAssociation__Group_3_0__1"


    // $ANTLR start "rule__DerivationAssociation__Group_3_0__1__Impl"
    // InternalOntoUML.g:1223:1: rule__DerivationAssociation__Group_3_0__1__Impl : ( ( rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1 ) ) ;
    public final void rule__DerivationAssociation__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1227:1: ( ( ( rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1 ) ) )
            // InternalOntoUML.g:1228:1: ( ( rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1 ) )
            {
            // InternalOntoUML.g:1228:1: ( ( rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1 ) )
            // InternalOntoUML.g:1229:2: ( rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1 )
            {
             before(grammarAccess.getDerivationAssociationAccess().getDerivingAssociationAssignment_3_0_1()); 
            // InternalOntoUML.g:1230:2: ( rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1 )
            // InternalOntoUML.g:1230:3: rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDerivationAssociationAccess().getDerivingAssociationAssignment_3_0_1()); 

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
    // $ANTLR end "rule__DerivationAssociation__Group_3_0__1__Impl"


    // $ANTLR start "rule__DerivationAssociation__Group_3_1__0"
    // InternalOntoUML.g:1239:1: rule__DerivationAssociation__Group_3_1__0 : rule__DerivationAssociation__Group_3_1__0__Impl rule__DerivationAssociation__Group_3_1__1 ;
    public final void rule__DerivationAssociation__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1243:1: ( rule__DerivationAssociation__Group_3_1__0__Impl rule__DerivationAssociation__Group_3_1__1 )
            // InternalOntoUML.g:1244:2: rule__DerivationAssociation__Group_3_1__0__Impl rule__DerivationAssociation__Group_3_1__1
            {
            pushFollow(FOLLOW_7);
            rule__DerivationAssociation__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__Group_3_1__1();

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
    // $ANTLR end "rule__DerivationAssociation__Group_3_1__0"


    // $ANTLR start "rule__DerivationAssociation__Group_3_1__0__Impl"
    // InternalOntoUML.g:1251:1: rule__DerivationAssociation__Group_3_1__0__Impl : ( ( rule__DerivationAssociation__EndBMultiplicityAssignment_3_1_0 )? ) ;
    public final void rule__DerivationAssociation__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1255:1: ( ( ( rule__DerivationAssociation__EndBMultiplicityAssignment_3_1_0 )? ) )
            // InternalOntoUML.g:1256:1: ( ( rule__DerivationAssociation__EndBMultiplicityAssignment_3_1_0 )? )
            {
            // InternalOntoUML.g:1256:1: ( ( rule__DerivationAssociation__EndBMultiplicityAssignment_3_1_0 )? )
            // InternalOntoUML.g:1257:2: ( rule__DerivationAssociation__EndBMultiplicityAssignment_3_1_0 )?
            {
             before(grammarAccess.getDerivationAssociationAccess().getEndBMultiplicityAssignment_3_1_0()); 
            // InternalOntoUML.g:1258:2: ( rule__DerivationAssociation__EndBMultiplicityAssignment_3_1_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOntoUML.g:1258:3: rule__DerivationAssociation__EndBMultiplicityAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DerivationAssociation__EndBMultiplicityAssignment_3_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDerivationAssociationAccess().getEndBMultiplicityAssignment_3_1_0()); 

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
    // $ANTLR end "rule__DerivationAssociation__Group_3_1__0__Impl"


    // $ANTLR start "rule__DerivationAssociation__Group_3_1__1"
    // InternalOntoUML.g:1266:1: rule__DerivationAssociation__Group_3_1__1 : rule__DerivationAssociation__Group_3_1__1__Impl ;
    public final void rule__DerivationAssociation__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1270:1: ( rule__DerivationAssociation__Group_3_1__1__Impl )
            // InternalOntoUML.g:1271:2: rule__DerivationAssociation__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__DerivationAssociation__Group_3_1__1"


    // $ANTLR start "rule__DerivationAssociation__Group_3_1__1__Impl"
    // InternalOntoUML.g:1277:1: rule__DerivationAssociation__Group_3_1__1__Impl : ( ( rule__DerivationAssociation__DerivedClassAssignment_3_1_1 ) ) ;
    public final void rule__DerivationAssociation__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1281:1: ( ( ( rule__DerivationAssociation__DerivedClassAssignment_3_1_1 ) ) )
            // InternalOntoUML.g:1282:1: ( ( rule__DerivationAssociation__DerivedClassAssignment_3_1_1 ) )
            {
            // InternalOntoUML.g:1282:1: ( ( rule__DerivationAssociation__DerivedClassAssignment_3_1_1 ) )
            // InternalOntoUML.g:1283:2: ( rule__DerivationAssociation__DerivedClassAssignment_3_1_1 )
            {
             before(grammarAccess.getDerivationAssociationAccess().getDerivedClassAssignment_3_1_1()); 
            // InternalOntoUML.g:1284:2: ( rule__DerivationAssociation__DerivedClassAssignment_3_1_1 )
            // InternalOntoUML.g:1284:3: rule__DerivationAssociation__DerivedClassAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__DerivedClassAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDerivationAssociationAccess().getDerivedClassAssignment_3_1_1()); 

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
    // $ANTLR end "rule__DerivationAssociation__Group_3_1__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group__0"
    // InternalOntoUML.g:1293:1: rule__Multiplicity__Group__0 : rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 ;
    public final void rule__Multiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1297:1: ( rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 )
            // InternalOntoUML.g:1298:2: rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Multiplicity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__1();

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
    // $ANTLR end "rule__Multiplicity__Group__0"


    // $ANTLR start "rule__Multiplicity__Group__0__Impl"
    // InternalOntoUML.g:1305:1: rule__Multiplicity__Group__0__Impl : ( '[' ) ;
    public final void rule__Multiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1309:1: ( ( '[' ) )
            // InternalOntoUML.g:1310:1: ( '[' )
            {
            // InternalOntoUML.g:1310:1: ( '[' )
            // InternalOntoUML.g:1311:2: '['
            {
             before(grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Multiplicity__Group__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group__1"
    // InternalOntoUML.g:1320:1: rule__Multiplicity__Group__1 : rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 ;
    public final void rule__Multiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1324:1: ( rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 )
            // InternalOntoUML.g:1325:2: rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Multiplicity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__2();

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
    // $ANTLR end "rule__Multiplicity__Group__1"


    // $ANTLR start "rule__Multiplicity__Group__1__Impl"
    // InternalOntoUML.g:1332:1: rule__Multiplicity__Group__1__Impl : ( ( rule__Multiplicity__LowerBoundAssignment_1 ) ) ;
    public final void rule__Multiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1336:1: ( ( ( rule__Multiplicity__LowerBoundAssignment_1 ) ) )
            // InternalOntoUML.g:1337:1: ( ( rule__Multiplicity__LowerBoundAssignment_1 ) )
            {
            // InternalOntoUML.g:1337:1: ( ( rule__Multiplicity__LowerBoundAssignment_1 ) )
            // InternalOntoUML.g:1338:2: ( rule__Multiplicity__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getLowerBoundAssignment_1()); 
            // InternalOntoUML.g:1339:2: ( rule__Multiplicity__LowerBoundAssignment_1 )
            // InternalOntoUML.g:1339:3: rule__Multiplicity__LowerBoundAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__LowerBoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getLowerBoundAssignment_1()); 

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
    // $ANTLR end "rule__Multiplicity__Group__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group__2"
    // InternalOntoUML.g:1347:1: rule__Multiplicity__Group__2 : rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 ;
    public final void rule__Multiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1351:1: ( rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 )
            // InternalOntoUML.g:1352:2: rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Multiplicity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__3();

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
    // $ANTLR end "rule__Multiplicity__Group__2"


    // $ANTLR start "rule__Multiplicity__Group__2__Impl"
    // InternalOntoUML.g:1359:1: rule__Multiplicity__Group__2__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1363:1: ( ( '..' ) )
            // InternalOntoUML.g:1364:1: ( '..' )
            {
            // InternalOntoUML.g:1364:1: ( '..' )
            // InternalOntoUML.g:1365:2: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2()); 

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
    // $ANTLR end "rule__Multiplicity__Group__2__Impl"


    // $ANTLR start "rule__Multiplicity__Group__3"
    // InternalOntoUML.g:1374:1: rule__Multiplicity__Group__3 : rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 ;
    public final void rule__Multiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1378:1: ( rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 )
            // InternalOntoUML.g:1379:2: rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Multiplicity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__4();

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
    // $ANTLR end "rule__Multiplicity__Group__3"


    // $ANTLR start "rule__Multiplicity__Group__3__Impl"
    // InternalOntoUML.g:1386:1: rule__Multiplicity__Group__3__Impl : ( ( rule__Multiplicity__UpperBoundAssignment_3 ) ) ;
    public final void rule__Multiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1390:1: ( ( ( rule__Multiplicity__UpperBoundAssignment_3 ) ) )
            // InternalOntoUML.g:1391:1: ( ( rule__Multiplicity__UpperBoundAssignment_3 ) )
            {
            // InternalOntoUML.g:1391:1: ( ( rule__Multiplicity__UpperBoundAssignment_3 ) )
            // InternalOntoUML.g:1392:2: ( rule__Multiplicity__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getMultiplicityAccess().getUpperBoundAssignment_3()); 
            // InternalOntoUML.g:1393:2: ( rule__Multiplicity__UpperBoundAssignment_3 )
            // InternalOntoUML.g:1393:3: rule__Multiplicity__UpperBoundAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__UpperBoundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getUpperBoundAssignment_3()); 

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
    // $ANTLR end "rule__Multiplicity__Group__3__Impl"


    // $ANTLR start "rule__Multiplicity__Group__4"
    // InternalOntoUML.g:1401:1: rule__Multiplicity__Group__4 : rule__Multiplicity__Group__4__Impl ;
    public final void rule__Multiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1405:1: ( rule__Multiplicity__Group__4__Impl )
            // InternalOntoUML.g:1406:2: rule__Multiplicity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__4__Impl();

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
    // $ANTLR end "rule__Multiplicity__Group__4"


    // $ANTLR start "rule__Multiplicity__Group__4__Impl"
    // InternalOntoUML.g:1412:1: rule__Multiplicity__Group__4__Impl : ( ']' ) ;
    public final void rule__Multiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1416:1: ( ( ']' ) )
            // InternalOntoUML.g:1417:1: ( ']' )
            {
            // InternalOntoUML.g:1417:1: ( ']' )
            // InternalOntoUML.g:1418:2: ']'
            {
             before(grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Multiplicity__Group__4__Impl"


    // $ANTLR start "rule__Generalization__Group__0"
    // InternalOntoUML.g:1428:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1432:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalOntoUML.g:1433:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Generalization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__1();

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
    // $ANTLR end "rule__Generalization__Group__0"


    // $ANTLR start "rule__Generalization__Group__0__Impl"
    // InternalOntoUML.g:1440:1: rule__Generalization__Group__0__Impl : ( 'generalization' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1444:1: ( ( 'generalization' ) )
            // InternalOntoUML.g:1445:1: ( 'generalization' )
            {
            // InternalOntoUML.g:1445:1: ( 'generalization' )
            // InternalOntoUML.g:1446:2: 'generalization'
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralizationKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getGeneralizationKeyword_0()); 

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
    // $ANTLR end "rule__Generalization__Group__0__Impl"


    // $ANTLR start "rule__Generalization__Group__1"
    // InternalOntoUML.g:1455:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1459:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalOntoUML.g:1460:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Generalization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__2();

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
    // $ANTLR end "rule__Generalization__Group__1"


    // $ANTLR start "rule__Generalization__Group__1__Impl"
    // InternalOntoUML.g:1467:1: rule__Generalization__Group__1__Impl : ( ( rule__Generalization__NameAssignment_1 ) ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1471:1: ( ( ( rule__Generalization__NameAssignment_1 ) ) )
            // InternalOntoUML.g:1472:1: ( ( rule__Generalization__NameAssignment_1 ) )
            {
            // InternalOntoUML.g:1472:1: ( ( rule__Generalization__NameAssignment_1 ) )
            // InternalOntoUML.g:1473:2: ( rule__Generalization__NameAssignment_1 )
            {
             before(grammarAccess.getGeneralizationAccess().getNameAssignment_1()); 
            // InternalOntoUML.g:1474:2: ( rule__Generalization__NameAssignment_1 )
            // InternalOntoUML.g:1474:3: rule__Generalization__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Generalization__Group__1__Impl"


    // $ANTLR start "rule__Generalization__Group__2"
    // InternalOntoUML.g:1482:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl rule__Generalization__Group__3 ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1486:1: ( rule__Generalization__Group__2__Impl rule__Generalization__Group__3 )
            // InternalOntoUML.g:1487:2: rule__Generalization__Group__2__Impl rule__Generalization__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Generalization__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__3();

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
    // $ANTLR end "rule__Generalization__Group__2"


    // $ANTLR start "rule__Generalization__Group__2__Impl"
    // InternalOntoUML.g:1494:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__Group_2__0 )? ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1498:1: ( ( ( rule__Generalization__Group_2__0 )? ) )
            // InternalOntoUML.g:1499:1: ( ( rule__Generalization__Group_2__0 )? )
            {
            // InternalOntoUML.g:1499:1: ( ( rule__Generalization__Group_2__0 )? )
            // InternalOntoUML.g:1500:2: ( rule__Generalization__Group_2__0 )?
            {
             before(grammarAccess.getGeneralizationAccess().getGroup_2()); 
            // InternalOntoUML.g:1501:2: ( rule__Generalization__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntoUML.g:1501:3: rule__Generalization__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Generalization__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneralizationAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Generalization__Group__2__Impl"


    // $ANTLR start "rule__Generalization__Group__3"
    // InternalOntoUML.g:1509:1: rule__Generalization__Group__3 : rule__Generalization__Group__3__Impl rule__Generalization__Group__4 ;
    public final void rule__Generalization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1513:1: ( rule__Generalization__Group__3__Impl rule__Generalization__Group__4 )
            // InternalOntoUML.g:1514:2: rule__Generalization__Group__3__Impl rule__Generalization__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Generalization__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__4();

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
    // $ANTLR end "rule__Generalization__Group__3"


    // $ANTLR start "rule__Generalization__Group__3__Impl"
    // InternalOntoUML.g:1521:1: rule__Generalization__Group__3__Impl : ( ( rule__Generalization__GenericAssignment_3 ) ) ;
    public final void rule__Generalization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1525:1: ( ( ( rule__Generalization__GenericAssignment_3 ) ) )
            // InternalOntoUML.g:1526:1: ( ( rule__Generalization__GenericAssignment_3 ) )
            {
            // InternalOntoUML.g:1526:1: ( ( rule__Generalization__GenericAssignment_3 ) )
            // InternalOntoUML.g:1527:2: ( rule__Generalization__GenericAssignment_3 )
            {
             before(grammarAccess.getGeneralizationAccess().getGenericAssignment_3()); 
            // InternalOntoUML.g:1528:2: ( rule__Generalization__GenericAssignment_3 )
            // InternalOntoUML.g:1528:3: rule__Generalization__GenericAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__GenericAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getGenericAssignment_3()); 

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
    // $ANTLR end "rule__Generalization__Group__3__Impl"


    // $ANTLR start "rule__Generalization__Group__4"
    // InternalOntoUML.g:1536:1: rule__Generalization__Group__4 : rule__Generalization__Group__4__Impl ;
    public final void rule__Generalization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1540:1: ( rule__Generalization__Group__4__Impl )
            // InternalOntoUML.g:1541:2: rule__Generalization__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__Group__4__Impl();

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
    // $ANTLR end "rule__Generalization__Group__4"


    // $ANTLR start "rule__Generalization__Group__4__Impl"
    // InternalOntoUML.g:1547:1: rule__Generalization__Group__4__Impl : ( ( rule__Generalization__SpecificAssignment_4 ) ) ;
    public final void rule__Generalization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1551:1: ( ( ( rule__Generalization__SpecificAssignment_4 ) ) )
            // InternalOntoUML.g:1552:1: ( ( rule__Generalization__SpecificAssignment_4 ) )
            {
            // InternalOntoUML.g:1552:1: ( ( rule__Generalization__SpecificAssignment_4 ) )
            // InternalOntoUML.g:1553:2: ( rule__Generalization__SpecificAssignment_4 )
            {
             before(grammarAccess.getGeneralizationAccess().getSpecificAssignment_4()); 
            // InternalOntoUML.g:1554:2: ( rule__Generalization__SpecificAssignment_4 )
            // InternalOntoUML.g:1554:3: rule__Generalization__SpecificAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__SpecificAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getSpecificAssignment_4()); 

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
    // $ANTLR end "rule__Generalization__Group__4__Impl"


    // $ANTLR start "rule__Generalization__Group_2__0"
    // InternalOntoUML.g:1563:1: rule__Generalization__Group_2__0 : rule__Generalization__Group_2__0__Impl rule__Generalization__Group_2__1 ;
    public final void rule__Generalization__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1567:1: ( rule__Generalization__Group_2__0__Impl rule__Generalization__Group_2__1 )
            // InternalOntoUML.g:1568:2: rule__Generalization__Group_2__0__Impl rule__Generalization__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Generalization__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group_2__1();

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
    // $ANTLR end "rule__Generalization__Group_2__0"


    // $ANTLR start "rule__Generalization__Group_2__0__Impl"
    // InternalOntoUML.g:1575:1: rule__Generalization__Group_2__0__Impl : ( 'aka' ) ;
    public final void rule__Generalization__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1579:1: ( ( 'aka' ) )
            // InternalOntoUML.g:1580:1: ( 'aka' )
            {
            // InternalOntoUML.g:1580:1: ( 'aka' )
            // InternalOntoUML.g:1581:2: 'aka'
            {
             before(grammarAccess.getGeneralizationAccess().getAkaKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getAkaKeyword_2_0()); 

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
    // $ANTLR end "rule__Generalization__Group_2__0__Impl"


    // $ANTLR start "rule__Generalization__Group_2__1"
    // InternalOntoUML.g:1590:1: rule__Generalization__Group_2__1 : rule__Generalization__Group_2__1__Impl ;
    public final void rule__Generalization__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1594:1: ( rule__Generalization__Group_2__1__Impl )
            // InternalOntoUML.g:1595:2: rule__Generalization__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__Group_2__1__Impl();

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
    // $ANTLR end "rule__Generalization__Group_2__1"


    // $ANTLR start "rule__Generalization__Group_2__1__Impl"
    // InternalOntoUML.g:1601:1: rule__Generalization__Group_2__1__Impl : ( ( rule__Generalization__AliasAssignment_2_1 ) ) ;
    public final void rule__Generalization__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1605:1: ( ( ( rule__Generalization__AliasAssignment_2_1 ) ) )
            // InternalOntoUML.g:1606:1: ( ( rule__Generalization__AliasAssignment_2_1 ) )
            {
            // InternalOntoUML.g:1606:1: ( ( rule__Generalization__AliasAssignment_2_1 ) )
            // InternalOntoUML.g:1607:2: ( rule__Generalization__AliasAssignment_2_1 )
            {
             before(grammarAccess.getGeneralizationAccess().getAliasAssignment_2_1()); 
            // InternalOntoUML.g:1608:2: ( rule__Generalization__AliasAssignment_2_1 )
            // InternalOntoUML.g:1608:3: rule__Generalization__AliasAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__AliasAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getAliasAssignment_2_1()); 

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
    // $ANTLR end "rule__Generalization__Group_2__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__0"
    // InternalOntoUML.g:1617:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1621:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoUML.g:1622:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__GeneralizationSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__1();

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
    // $ANTLR end "rule__GeneralizationSet__Group__0"


    // $ANTLR start "rule__GeneralizationSet__Group__0__Impl"
    // InternalOntoUML.g:1629:1: rule__GeneralizationSet__Group__0__Impl : ( ( rule__GeneralizationSet__UnorderedGroup_0 ) ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1633:1: ( ( ( rule__GeneralizationSet__UnorderedGroup_0 ) ) )
            // InternalOntoUML.g:1634:1: ( ( rule__GeneralizationSet__UnorderedGroup_0 ) )
            {
            // InternalOntoUML.g:1634:1: ( ( rule__GeneralizationSet__UnorderedGroup_0 ) )
            // InternalOntoUML.g:1635:2: ( rule__GeneralizationSet__UnorderedGroup_0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0()); 
            // InternalOntoUML.g:1636:2: ( rule__GeneralizationSet__UnorderedGroup_0 )
            // InternalOntoUML.g:1636:3: rule__GeneralizationSet__UnorderedGroup_0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__UnorderedGroup_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0()); 

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
    // $ANTLR end "rule__GeneralizationSet__Group__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__1"
    // InternalOntoUML.g:1644:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1648:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoUML.g:1649:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GeneralizationSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__2();

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
    // $ANTLR end "rule__GeneralizationSet__Group__1"


    // $ANTLR start "rule__GeneralizationSet__Group__1__Impl"
    // InternalOntoUML.g:1656:1: rule__GeneralizationSet__Group__1__Impl : ( 'generalizationset' ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1660:1: ( ( 'generalizationset' ) )
            // InternalOntoUML.g:1661:1: ( 'generalizationset' )
            {
            // InternalOntoUML.g:1661:1: ( 'generalizationset' )
            // InternalOntoUML.g:1662:2: 'generalizationset'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsetKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsetKeyword_1()); 

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
    // $ANTLR end "rule__GeneralizationSet__Group__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__2"
    // InternalOntoUML.g:1671:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1675:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoUML.g:1676:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__GeneralizationSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__3();

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
    // $ANTLR end "rule__GeneralizationSet__Group__2"


    // $ANTLR start "rule__GeneralizationSet__Group__2__Impl"
    // InternalOntoUML.g:1683:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 ) ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1687:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 ) ) )
            // InternalOntoUML.g:1688:1: ( ( rule__GeneralizationSet__NameAssignment_2 ) )
            {
            // InternalOntoUML.g:1688:1: ( ( rule__GeneralizationSet__NameAssignment_2 ) )
            // InternalOntoUML.g:1689:2: ( rule__GeneralizationSet__NameAssignment_2 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalOntoUML.g:1690:2: ( rule__GeneralizationSet__NameAssignment_2 )
            // InternalOntoUML.g:1690:3: rule__GeneralizationSet__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__GeneralizationSet__Group__2__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__3"
    // InternalOntoUML.g:1698:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1702:1: ( rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 )
            // InternalOntoUML.g:1703:2: rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__GeneralizationSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__4();

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
    // $ANTLR end "rule__GeneralizationSet__Group__3"


    // $ANTLR start "rule__GeneralizationSet__Group__3__Impl"
    // InternalOntoUML.g:1710:1: rule__GeneralizationSet__Group__3__Impl : ( ( rule__GeneralizationSet__Group_3__0 )? ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1714:1: ( ( ( rule__GeneralizationSet__Group_3__0 )? ) )
            // InternalOntoUML.g:1715:1: ( ( rule__GeneralizationSet__Group_3__0 )? )
            {
            // InternalOntoUML.g:1715:1: ( ( rule__GeneralizationSet__Group_3__0 )? )
            // InternalOntoUML.g:1716:2: ( rule__GeneralizationSet__Group_3__0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_3()); 
            // InternalOntoUML.g:1717:2: ( rule__GeneralizationSet__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntoUML.g:1717:3: rule__GeneralizationSet__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneralizationSetAccess().getGroup_3()); 

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
    // $ANTLR end "rule__GeneralizationSet__Group__3__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__4"
    // InternalOntoUML.g:1725:1: rule__GeneralizationSet__Group__4 : rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 ;
    public final void rule__GeneralizationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1729:1: ( rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 )
            // InternalOntoUML.g:1730:2: rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__GeneralizationSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__5();

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
    // $ANTLR end "rule__GeneralizationSet__Group__4"


    // $ANTLR start "rule__GeneralizationSet__Group__4__Impl"
    // InternalOntoUML.g:1737:1: rule__GeneralizationSet__Group__4__Impl : ( '{' ) ;
    public final void rule__GeneralizationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1741:1: ( ( '{' ) )
            // InternalOntoUML.g:1742:1: ( '{' )
            {
            // InternalOntoUML.g:1742:1: ( '{' )
            // InternalOntoUML.g:1743:2: '{'
            {
             before(grammarAccess.getGeneralizationSetAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__GeneralizationSet__Group__4__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__5"
    // InternalOntoUML.g:1752:1: rule__GeneralizationSet__Group__5 : rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 ;
    public final void rule__GeneralizationSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1756:1: ( rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 )
            // InternalOntoUML.g:1757:2: rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__GeneralizationSet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__6();

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
    // $ANTLR end "rule__GeneralizationSet__Group__5"


    // $ANTLR start "rule__GeneralizationSet__Group__5__Impl"
    // InternalOntoUML.g:1764:1: rule__GeneralizationSet__Group__5__Impl : ( ( rule__GeneralizationSet__GeneralizationsAssignment_5 )* ) ;
    public final void rule__GeneralizationSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1768:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_5 )* ) )
            // InternalOntoUML.g:1769:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_5 )* )
            {
            // InternalOntoUML.g:1769:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_5 )* )
            // InternalOntoUML.g:1770:2: ( rule__GeneralizationSet__GeneralizationsAssignment_5 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_5()); 
            // InternalOntoUML.g:1771:2: ( rule__GeneralizationSet__GeneralizationsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOntoUML.g:1771:3: rule__GeneralizationSet__GeneralizationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__GeneralizationSet__GeneralizationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_5()); 

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
    // $ANTLR end "rule__GeneralizationSet__Group__5__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__6"
    // InternalOntoUML.g:1779:1: rule__GeneralizationSet__Group__6 : rule__GeneralizationSet__Group__6__Impl ;
    public final void rule__GeneralizationSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1783:1: ( rule__GeneralizationSet__Group__6__Impl )
            // InternalOntoUML.g:1784:2: rule__GeneralizationSet__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__6__Impl();

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
    // $ANTLR end "rule__GeneralizationSet__Group__6"


    // $ANTLR start "rule__GeneralizationSet__Group__6__Impl"
    // InternalOntoUML.g:1790:1: rule__GeneralizationSet__Group__6__Impl : ( '}' ) ;
    public final void rule__GeneralizationSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1794:1: ( ( '}' ) )
            // InternalOntoUML.g:1795:1: ( '}' )
            {
            // InternalOntoUML.g:1795:1: ( '}' )
            // InternalOntoUML.g:1796:2: '}'
            {
             before(grammarAccess.getGeneralizationSetAccess().getRightCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__GeneralizationSet__Group__6__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_3__0"
    // InternalOntoUML.g:1806:1: rule__GeneralizationSet__Group_3__0 : rule__GeneralizationSet__Group_3__0__Impl rule__GeneralizationSet__Group_3__1 ;
    public final void rule__GeneralizationSet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1810:1: ( rule__GeneralizationSet__Group_3__0__Impl rule__GeneralizationSet__Group_3__1 )
            // InternalOntoUML.g:1811:2: rule__GeneralizationSet__Group_3__0__Impl rule__GeneralizationSet__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__GeneralizationSet__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_3__1();

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
    // $ANTLR end "rule__GeneralizationSet__Group_3__0"


    // $ANTLR start "rule__GeneralizationSet__Group_3__0__Impl"
    // InternalOntoUML.g:1818:1: rule__GeneralizationSet__Group_3__0__Impl : ( 'aka' ) ;
    public final void rule__GeneralizationSet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1822:1: ( ( 'aka' ) )
            // InternalOntoUML.g:1823:1: ( 'aka' )
            {
            // InternalOntoUML.g:1823:1: ( 'aka' )
            // InternalOntoUML.g:1824:2: 'aka'
            {
             before(grammarAccess.getGeneralizationSetAccess().getAkaKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getAkaKeyword_3_0()); 

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
    // $ANTLR end "rule__GeneralizationSet__Group_3__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_3__1"
    // InternalOntoUML.g:1833:1: rule__GeneralizationSet__Group_3__1 : rule__GeneralizationSet__Group_3__1__Impl ;
    public final void rule__GeneralizationSet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1837:1: ( rule__GeneralizationSet__Group_3__1__Impl )
            // InternalOntoUML.g:1838:2: rule__GeneralizationSet__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_3__1__Impl();

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
    // $ANTLR end "rule__GeneralizationSet__Group_3__1"


    // $ANTLR start "rule__GeneralizationSet__Group_3__1__Impl"
    // InternalOntoUML.g:1844:1: rule__GeneralizationSet__Group_3__1__Impl : ( ( rule__GeneralizationSet__AliasAssignment_3_1 ) ) ;
    public final void rule__GeneralizationSet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1848:1: ( ( ( rule__GeneralizationSet__AliasAssignment_3_1 ) ) )
            // InternalOntoUML.g:1849:1: ( ( rule__GeneralizationSet__AliasAssignment_3_1 ) )
            {
            // InternalOntoUML.g:1849:1: ( ( rule__GeneralizationSet__AliasAssignment_3_1 ) )
            // InternalOntoUML.g:1850:2: ( rule__GeneralizationSet__AliasAssignment_3_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getAliasAssignment_3_1()); 
            // InternalOntoUML.g:1851:2: ( rule__GeneralizationSet__AliasAssignment_3_1 )
            // InternalOntoUML.g:1851:3: rule__GeneralizationSet__AliasAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__AliasAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getAliasAssignment_3_1()); 

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
    // $ANTLR end "rule__GeneralizationSet__Group_3__1__Impl"


    // $ANTLR start "rule__DerivationAssociation__UnorderedGroup_3"
    // InternalOntoUML.g:1860:1: rule__DerivationAssociation__UnorderedGroup_3 : rule__DerivationAssociation__UnorderedGroup_3__0 {...}?;
    public final void rule__DerivationAssociation__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3());
        	
        try {
            // InternalOntoUML.g:1865:1: ( rule__DerivationAssociation__UnorderedGroup_3__0 {...}?)
            // InternalOntoUML.g:1866:2: rule__DerivationAssociation__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__DerivationAssociation__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivationAssociation__UnorderedGroup_3"


    // $ANTLR start "rule__DerivationAssociation__UnorderedGroup_3__Impl"
    // InternalOntoUML.g:1874:1: rule__DerivationAssociation__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__DerivationAssociation__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalOntoUML.g:1879:1: ( ( ({...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) ) ) ) )
            // InternalOntoUML.g:1880:3: ( ({...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) ) ) )
            {
            // InternalOntoUML.g:1880:3: ( ({...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) ) ) )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalOntoUML.g:1881:3: ({...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) ) )
                    {
                    // InternalOntoUML.g:1881:3: ({...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) ) )
                    // InternalOntoUML.g:1882:4: {...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__DerivationAssociation__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalOntoUML.g:1882:117: ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) )
                    // InternalOntoUML.g:1883:5: ( ( rule__DerivationAssociation__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalOntoUML.g:1889:5: ( ( rule__DerivationAssociation__Group_3_0__0 ) )
                    // InternalOntoUML.g:1890:6: ( rule__DerivationAssociation__Group_3_0__0 )
                    {
                     before(grammarAccess.getDerivationAssociationAccess().getGroup_3_0()); 
                    // InternalOntoUML.g:1891:6: ( rule__DerivationAssociation__Group_3_0__0 )
                    // InternalOntoUML.g:1891:7: rule__DerivationAssociation__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DerivationAssociation__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDerivationAssociationAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:1896:3: ({...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) ) )
                    {
                    // InternalOntoUML.g:1896:3: ({...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) ) )
                    // InternalOntoUML.g:1897:4: {...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__DerivationAssociation__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalOntoUML.g:1897:117: ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) )
                    // InternalOntoUML.g:1898:5: ( ( rule__DerivationAssociation__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalOntoUML.g:1904:5: ( ( rule__DerivationAssociation__Group_3_1__0 ) )
                    // InternalOntoUML.g:1905:6: ( rule__DerivationAssociation__Group_3_1__0 )
                    {
                     before(grammarAccess.getDerivationAssociationAccess().getGroup_3_1()); 
                    // InternalOntoUML.g:1906:6: ( rule__DerivationAssociation__Group_3_1__0 )
                    // InternalOntoUML.g:1906:7: rule__DerivationAssociation__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DerivationAssociation__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDerivationAssociationAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DerivationAssociation__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__DerivationAssociation__UnorderedGroup_3__0"
    // InternalOntoUML.g:1919:1: rule__DerivationAssociation__UnorderedGroup_3__0 : rule__DerivationAssociation__UnorderedGroup_3__Impl ( rule__DerivationAssociation__UnorderedGroup_3__1 )? ;
    public final void rule__DerivationAssociation__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1923:1: ( rule__DerivationAssociation__UnorderedGroup_3__Impl ( rule__DerivationAssociation__UnorderedGroup_3__1 )? )
            // InternalOntoUML.g:1924:2: rule__DerivationAssociation__UnorderedGroup_3__Impl ( rule__DerivationAssociation__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_18);
            rule__DerivationAssociation__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalOntoUML.g:1925:2: ( rule__DerivationAssociation__UnorderedGroup_3__1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 32 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {
                alt19=1;
            }
            else if ( LA19_0 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {
                alt19=1;
            }
            else if ( LA19_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOntoUML.g:1925:2: rule__DerivationAssociation__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DerivationAssociation__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__DerivationAssociation__UnorderedGroup_3__0"


    // $ANTLR start "rule__DerivationAssociation__UnorderedGroup_3__1"
    // InternalOntoUML.g:1931:1: rule__DerivationAssociation__UnorderedGroup_3__1 : rule__DerivationAssociation__UnorderedGroup_3__Impl ;
    public final void rule__DerivationAssociation__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1935:1: ( rule__DerivationAssociation__UnorderedGroup_3__Impl )
            // InternalOntoUML.g:1936:2: rule__DerivationAssociation__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__DerivationAssociation__UnorderedGroup_3__1"


    // $ANTLR start "rule__GeneralizationSet__UnorderedGroup_0"
    // InternalOntoUML.g:1943:1: rule__GeneralizationSet__UnorderedGroup_0 : ( rule__GeneralizationSet__UnorderedGroup_0__0 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
        	
        try {
            // InternalOntoUML.g:1948:1: ( ( rule__GeneralizationSet__UnorderedGroup_0__0 )? )
            // InternalOntoUML.g:1949:2: ( rule__GeneralizationSet__UnorderedGroup_0__0 )?
            {
            // InternalOntoUML.g:1949:2: ( rule__GeneralizationSet__UnorderedGroup_0__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntoUML.g:1949:2: rule__GeneralizationSet__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__UnorderedGroup_0__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__UnorderedGroup_0"


    // $ANTLR start "rule__GeneralizationSet__UnorderedGroup_0__Impl"
    // InternalOntoUML.g:1957:1: rule__GeneralizationSet__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) ) ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalOntoUML.g:1962:1: ( ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) ) )
            // InternalOntoUML.g:1963:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) )
            {
            // InternalOntoUML.g:1963:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalOntoUML.g:1964:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) )
                    {
                    // InternalOntoUML.g:1964:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) )
                    // InternalOntoUML.g:1965:4: {...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0)");
                    }
                    // InternalOntoUML.g:1965:113: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) )
                    // InternalOntoUML.g:1966:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0);
                    				

                    					selected = true;
                    				
                    // InternalOntoUML.g:1972:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    // InternalOntoUML.g:1973:6: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_0()); 
                    // InternalOntoUML.g:1974:6: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    // InternalOntoUML.g:1974:7: rule__GeneralizationSet__IsDisjointAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__IsDisjointAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:1979:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) )
                    {
                    // InternalOntoUML.g:1979:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) )
                    // InternalOntoUML.g:1980:4: {...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1)");
                    }
                    // InternalOntoUML.g:1980:113: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) )
                    // InternalOntoUML.g:1981:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1);
                    				

                    					selected = true;
                    				
                    // InternalOntoUML.g:1987:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    // InternalOntoUML.g:1988:6: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_1()); 
                    // InternalOntoUML.g:1989:6: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    // InternalOntoUML.g:1989:7: rule__GeneralizationSet__IsCompleteAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__IsCompleteAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__UnorderedGroup_0__Impl"


    // $ANTLR start "rule__GeneralizationSet__UnorderedGroup_0__0"
    // InternalOntoUML.g:2002:1: rule__GeneralizationSet__UnorderedGroup_0__0 : rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2006:1: ( rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )? )
            // InternalOntoUML.g:2007:2: rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_19);
            rule__GeneralizationSet__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalOntoUML.g:2008:2: ( rule__GeneralizationSet__UnorderedGroup_0__1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOntoUML.g:2008:2: rule__GeneralizationSet__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__UnorderedGroup_0__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__GeneralizationSet__UnorderedGroup_0__0"


    // $ANTLR start "rule__GeneralizationSet__UnorderedGroup_0__1"
    // InternalOntoUML.g:2014:1: rule__GeneralizationSet__UnorderedGroup_0__1 : rule__GeneralizationSet__UnorderedGroup_0__Impl ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2018:1: ( rule__GeneralizationSet__UnorderedGroup_0__Impl )
            // InternalOntoUML.g:2019:2: rule__GeneralizationSet__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__UnorderedGroup_0__Impl();

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
    // $ANTLR end "rule__GeneralizationSet__UnorderedGroup_0__1"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalOntoUML.g:2026:1: rule__Model__ElementsAssignment : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2030:1: ( ( ruleModelElement ) )
            // InternalOntoUML.g:2031:2: ( ruleModelElement )
            {
            // InternalOntoUML.g:2031:2: ( ruleModelElement )
            // InternalOntoUML.g:2032:3: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__OntoUMLClass___typeAssignment_0_1_0"
    // InternalOntoUML.g:2041:1: rule__OntoUMLClass___typeAssignment_0_1_0 : ( ruleEndurantType ) ;
    public final void rule__OntoUMLClass___typeAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2045:1: ( ( ruleEndurantType ) )
            // InternalOntoUML.g:2046:2: ( ruleEndurantType )
            {
            // InternalOntoUML.g:2046:2: ( ruleEndurantType )
            // InternalOntoUML.g:2047:3: ruleEndurantType
            {
             before(grammarAccess.getOntoUMLClassAccess().get_typeEndurantTypeEnumRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEndurantType();

            state._fsp--;

             after(grammarAccess.getOntoUMLClassAccess().get_typeEndurantTypeEnumRuleCall_0_1_0_0()); 

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
    // $ANTLR end "rule__OntoUMLClass___typeAssignment_0_1_0"


    // $ANTLR start "rule__OntoUMLClass___typeAssignment_0_2"
    // InternalOntoUML.g:2056:1: rule__OntoUMLClass___typeAssignment_0_2 : ( ruleEndurantType ) ;
    public final void rule__OntoUMLClass___typeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2060:1: ( ( ruleEndurantType ) )
            // InternalOntoUML.g:2061:2: ( ruleEndurantType )
            {
            // InternalOntoUML.g:2061:2: ( ruleEndurantType )
            // InternalOntoUML.g:2062:3: ruleEndurantType
            {
             before(grammarAccess.getOntoUMLClassAccess().get_typeEndurantTypeEnumRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEndurantType();

            state._fsp--;

             after(grammarAccess.getOntoUMLClassAccess().get_typeEndurantTypeEnumRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__OntoUMLClass___typeAssignment_0_2"


    // $ANTLR start "rule__OntoUMLClass__NameAssignment_1"
    // InternalOntoUML.g:2071:1: rule__OntoUMLClass__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__OntoUMLClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2075:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2076:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2076:2: ( ruleStringOrID )
            // InternalOntoUML.g:2077:3: ruleStringOrID
            {
             before(grammarAccess.getOntoUMLClassAccess().getNameStringOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getOntoUMLClassAccess().getNameStringOrIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__OntoUMLClass__NameAssignment_1"


    // $ANTLR start "rule__OntoUMLClass__AliasAssignment_2_1"
    // InternalOntoUML.g:2086:1: rule__OntoUMLClass__AliasAssignment_2_1 : ( ruleStringOrID ) ;
    public final void rule__OntoUMLClass__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2090:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2091:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2091:2: ( ruleStringOrID )
            // InternalOntoUML.g:2092:3: ruleStringOrID
            {
             before(grammarAccess.getOntoUMLClassAccess().getAliasStringOrIDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getOntoUMLClassAccess().getAliasStringOrIDParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__OntoUMLClass__AliasAssignment_2_1"


    // $ANTLR start "rule__RegularAssociation___typeAssignment_0_1_0"
    // InternalOntoUML.g:2101:1: rule__RegularAssociation___typeAssignment_0_1_0 : ( ruleRelationType ) ;
    public final void rule__RegularAssociation___typeAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2105:1: ( ( ruleRelationType ) )
            // InternalOntoUML.g:2106:2: ( ruleRelationType )
            {
            // InternalOntoUML.g:2106:2: ( ruleRelationType )
            // InternalOntoUML.g:2107:3: ruleRelationType
            {
             before(grammarAccess.getRegularAssociationAccess().get_typeRelationTypeEnumRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationType();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().get_typeRelationTypeEnumRuleCall_0_1_0_0()); 

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
    // $ANTLR end "rule__RegularAssociation___typeAssignment_0_1_0"


    // $ANTLR start "rule__RegularAssociation___typeAssignment_0_2"
    // InternalOntoUML.g:2116:1: rule__RegularAssociation___typeAssignment_0_2 : ( ruleRelationType ) ;
    public final void rule__RegularAssociation___typeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2120:1: ( ( ruleRelationType ) )
            // InternalOntoUML.g:2121:2: ( ruleRelationType )
            {
            // InternalOntoUML.g:2121:2: ( ruleRelationType )
            // InternalOntoUML.g:2122:3: ruleRelationType
            {
             before(grammarAccess.getRegularAssociationAccess().get_typeRelationTypeEnumRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationType();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().get_typeRelationTypeEnumRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__RegularAssociation___typeAssignment_0_2"


    // $ANTLR start "rule__RegularAssociation__NameAssignment_1"
    // InternalOntoUML.g:2131:1: rule__RegularAssociation__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__RegularAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2135:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2136:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2136:2: ( ruleStringOrID )
            // InternalOntoUML.g:2137:3: ruleStringOrID
            {
             before(grammarAccess.getRegularAssociationAccess().getNameStringOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().getNameStringOrIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RegularAssociation__NameAssignment_1"


    // $ANTLR start "rule__RegularAssociation__AliasAssignment_2_1"
    // InternalOntoUML.g:2146:1: rule__RegularAssociation__AliasAssignment_2_1 : ( ruleStringOrID ) ;
    public final void rule__RegularAssociation__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2150:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2151:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2151:2: ( ruleStringOrID )
            // InternalOntoUML.g:2152:3: ruleStringOrID
            {
             before(grammarAccess.getRegularAssociationAccess().getAliasStringOrIDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().getAliasStringOrIDParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__RegularAssociation__AliasAssignment_2_1"


    // $ANTLR start "rule__RegularAssociation__EndAMultiplicityAssignment_3"
    // InternalOntoUML.g:2161:1: rule__RegularAssociation__EndAMultiplicityAssignment_3 : ( ruleMultiplicity ) ;
    public final void rule__RegularAssociation__EndAMultiplicityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2165:1: ( ( ruleMultiplicity ) )
            // InternalOntoUML.g:2166:2: ( ruleMultiplicity )
            {
            // InternalOntoUML.g:2166:2: ( ruleMultiplicity )
            // InternalOntoUML.g:2167:3: ruleMultiplicity
            {
             before(grammarAccess.getRegularAssociationAccess().getEndAMultiplicityMultiplicityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().getEndAMultiplicityMultiplicityParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RegularAssociation__EndAMultiplicityAssignment_3"


    // $ANTLR start "rule__RegularAssociation__EndAAssignment_4"
    // InternalOntoUML.g:2176:1: rule__RegularAssociation__EndAAssignment_4 : ( ( ruleStringOrID ) ) ;
    public final void rule__RegularAssociation__EndAAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2180:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:2181:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:2181:2: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2182:3: ( ruleStringOrID )
            {
             before(grammarAccess.getRegularAssociationAccess().getEndAOntoUMLClassCrossReference_4_0()); 
            // InternalOntoUML.g:2183:3: ( ruleStringOrID )
            // InternalOntoUML.g:2184:4: ruleStringOrID
            {
             before(grammarAccess.getRegularAssociationAccess().getEndAOntoUMLClassStringOrIDParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().getEndAOntoUMLClassStringOrIDParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRegularAssociationAccess().getEndAOntoUMLClassCrossReference_4_0()); 

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
    // $ANTLR end "rule__RegularAssociation__EndAAssignment_4"


    // $ANTLR start "rule__RegularAssociation__EndBMultiplicityAssignment_5"
    // InternalOntoUML.g:2195:1: rule__RegularAssociation__EndBMultiplicityAssignment_5 : ( ruleMultiplicity ) ;
    public final void rule__RegularAssociation__EndBMultiplicityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2199:1: ( ( ruleMultiplicity ) )
            // InternalOntoUML.g:2200:2: ( ruleMultiplicity )
            {
            // InternalOntoUML.g:2200:2: ( ruleMultiplicity )
            // InternalOntoUML.g:2201:3: ruleMultiplicity
            {
             before(grammarAccess.getRegularAssociationAccess().getEndBMultiplicityMultiplicityParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().getEndBMultiplicityMultiplicityParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__RegularAssociation__EndBMultiplicityAssignment_5"


    // $ANTLR start "rule__RegularAssociation__EndBAssignment_6"
    // InternalOntoUML.g:2210:1: rule__RegularAssociation__EndBAssignment_6 : ( ( ruleStringOrID ) ) ;
    public final void rule__RegularAssociation__EndBAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2214:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:2215:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:2215:2: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2216:3: ( ruleStringOrID )
            {
             before(grammarAccess.getRegularAssociationAccess().getEndBOntoUMLClassCrossReference_6_0()); 
            // InternalOntoUML.g:2217:3: ( ruleStringOrID )
            // InternalOntoUML.g:2218:4: ruleStringOrID
            {
             before(grammarAccess.getRegularAssociationAccess().getEndBOntoUMLClassStringOrIDParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().getEndBOntoUMLClassStringOrIDParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRegularAssociationAccess().getEndBOntoUMLClassCrossReference_6_0()); 

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
    // $ANTLR end "rule__RegularAssociation__EndBAssignment_6"


    // $ANTLR start "rule__DerivationAssociation__NameAssignment_1"
    // InternalOntoUML.g:2229:1: rule__DerivationAssociation__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__DerivationAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2233:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2234:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2234:2: ( ruleStringOrID )
            // InternalOntoUML.g:2235:3: ruleStringOrID
            {
             before(grammarAccess.getDerivationAssociationAccess().getNameStringOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getDerivationAssociationAccess().getNameStringOrIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DerivationAssociation__NameAssignment_1"


    // $ANTLR start "rule__DerivationAssociation__AliasAssignment_2_1"
    // InternalOntoUML.g:2244:1: rule__DerivationAssociation__AliasAssignment_2_1 : ( ruleStringOrID ) ;
    public final void rule__DerivationAssociation__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2248:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2249:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2249:2: ( ruleStringOrID )
            // InternalOntoUML.g:2250:3: ruleStringOrID
            {
             before(grammarAccess.getDerivationAssociationAccess().getAliasStringOrIDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getDerivationAssociationAccess().getAliasStringOrIDParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__DerivationAssociation__AliasAssignment_2_1"


    // $ANTLR start "rule__DerivationAssociation__EndAMultiplicityAssignment_3_0_0"
    // InternalOntoUML.g:2259:1: rule__DerivationAssociation__EndAMultiplicityAssignment_3_0_0 : ( ruleMultiplicity ) ;
    public final void rule__DerivationAssociation__EndAMultiplicityAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2263:1: ( ( ruleMultiplicity ) )
            // InternalOntoUML.g:2264:2: ( ruleMultiplicity )
            {
            // InternalOntoUML.g:2264:2: ( ruleMultiplicity )
            // InternalOntoUML.g:2265:3: ruleMultiplicity
            {
             before(grammarAccess.getDerivationAssociationAccess().getEndAMultiplicityMultiplicityParserRuleCall_3_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getDerivationAssociationAccess().getEndAMultiplicityMultiplicityParserRuleCall_3_0_0_0()); 

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
    // $ANTLR end "rule__DerivationAssociation__EndAMultiplicityAssignment_3_0_0"


    // $ANTLR start "rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1"
    // InternalOntoUML.g:2274:1: rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1 : ( ( ruleStringOrID ) ) ;
    public final void rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2278:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:2279:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:2279:2: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2280:3: ( ruleStringOrID )
            {
             before(grammarAccess.getDerivationAssociationAccess().getDerivingAssociationRegularAssociationCrossReference_3_0_1_0()); 
            // InternalOntoUML.g:2281:3: ( ruleStringOrID )
            // InternalOntoUML.g:2282:4: ruleStringOrID
            {
             before(grammarAccess.getDerivationAssociationAccess().getDerivingAssociationRegularAssociationStringOrIDParserRuleCall_3_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getDerivationAssociationAccess().getDerivingAssociationRegularAssociationStringOrIDParserRuleCall_3_0_1_0_1()); 

            }

             after(grammarAccess.getDerivationAssociationAccess().getDerivingAssociationRegularAssociationCrossReference_3_0_1_0()); 

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
    // $ANTLR end "rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1"


    // $ANTLR start "rule__DerivationAssociation__EndBMultiplicityAssignment_3_1_0"
    // InternalOntoUML.g:2293:1: rule__DerivationAssociation__EndBMultiplicityAssignment_3_1_0 : ( ruleMultiplicity ) ;
    public final void rule__DerivationAssociation__EndBMultiplicityAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2297:1: ( ( ruleMultiplicity ) )
            // InternalOntoUML.g:2298:2: ( ruleMultiplicity )
            {
            // InternalOntoUML.g:2298:2: ( ruleMultiplicity )
            // InternalOntoUML.g:2299:3: ruleMultiplicity
            {
             before(grammarAccess.getDerivationAssociationAccess().getEndBMultiplicityMultiplicityParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getDerivationAssociationAccess().getEndBMultiplicityMultiplicityParserRuleCall_3_1_0_0()); 

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
    // $ANTLR end "rule__DerivationAssociation__EndBMultiplicityAssignment_3_1_0"


    // $ANTLR start "rule__DerivationAssociation__DerivedClassAssignment_3_1_1"
    // InternalOntoUML.g:2308:1: rule__DerivationAssociation__DerivedClassAssignment_3_1_1 : ( ( ruleStringOrID ) ) ;
    public final void rule__DerivationAssociation__DerivedClassAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2312:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:2313:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:2313:2: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2314:3: ( ruleStringOrID )
            {
             before(grammarAccess.getDerivationAssociationAccess().getDerivedClassOntoUMLClassCrossReference_3_1_1_0()); 
            // InternalOntoUML.g:2315:3: ( ruleStringOrID )
            // InternalOntoUML.g:2316:4: ruleStringOrID
            {
             before(grammarAccess.getDerivationAssociationAccess().getDerivedClassOntoUMLClassStringOrIDParserRuleCall_3_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getDerivationAssociationAccess().getDerivedClassOntoUMLClassStringOrIDParserRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getDerivationAssociationAccess().getDerivedClassOntoUMLClassCrossReference_3_1_1_0()); 

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
    // $ANTLR end "rule__DerivationAssociation__DerivedClassAssignment_3_1_1"


    // $ANTLR start "rule__Multiplicity__LowerBoundAssignment_1"
    // InternalOntoUML.g:2327:1: rule__Multiplicity__LowerBoundAssignment_1 : ( RULE_CARDINALITY ) ;
    public final void rule__Multiplicity__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2331:1: ( ( RULE_CARDINALITY ) )
            // InternalOntoUML.g:2332:2: ( RULE_CARDINALITY )
            {
            // InternalOntoUML.g:2332:2: ( RULE_CARDINALITY )
            // InternalOntoUML.g:2333:3: RULE_CARDINALITY
            {
             before(grammarAccess.getMultiplicityAccess().getLowerBoundCARDINALITYTerminalRuleCall_1_0()); 
            match(input,RULE_CARDINALITY,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getLowerBoundCARDINALITYTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Multiplicity__LowerBoundAssignment_1"


    // $ANTLR start "rule__Multiplicity__UpperBoundAssignment_3"
    // InternalOntoUML.g:2342:1: rule__Multiplicity__UpperBoundAssignment_3 : ( RULE_CARDINALITY ) ;
    public final void rule__Multiplicity__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2346:1: ( ( RULE_CARDINALITY ) )
            // InternalOntoUML.g:2347:2: ( RULE_CARDINALITY )
            {
            // InternalOntoUML.g:2347:2: ( RULE_CARDINALITY )
            // InternalOntoUML.g:2348:3: RULE_CARDINALITY
            {
             before(grammarAccess.getMultiplicityAccess().getUpperBoundCARDINALITYTerminalRuleCall_3_0()); 
            match(input,RULE_CARDINALITY,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getUpperBoundCARDINALITYTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Multiplicity__UpperBoundAssignment_3"


    // $ANTLR start "rule__Generalization__NameAssignment_1"
    // InternalOntoUML.g:2357:1: rule__Generalization__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__Generalization__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2361:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2362:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2362:2: ( ruleStringOrID )
            // InternalOntoUML.g:2363:3: ruleStringOrID
            {
             before(grammarAccess.getGeneralizationAccess().getNameStringOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getNameStringOrIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Generalization__NameAssignment_1"


    // $ANTLR start "rule__Generalization__AliasAssignment_2_1"
    // InternalOntoUML.g:2372:1: rule__Generalization__AliasAssignment_2_1 : ( ruleStringOrID ) ;
    public final void rule__Generalization__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2376:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2377:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2377:2: ( ruleStringOrID )
            // InternalOntoUML.g:2378:3: ruleStringOrID
            {
             before(grammarAccess.getGeneralizationAccess().getAliasStringOrIDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getAliasStringOrIDParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Generalization__AliasAssignment_2_1"


    // $ANTLR start "rule__Generalization__GenericAssignment_3"
    // InternalOntoUML.g:2387:1: rule__Generalization__GenericAssignment_3 : ( ( ruleStringOrID ) ) ;
    public final void rule__Generalization__GenericAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2391:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:2392:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:2392:2: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2393:3: ( ruleStringOrID )
            {
             before(grammarAccess.getGeneralizationAccess().getGenericOntoUMLClassCrossReference_3_0()); 
            // InternalOntoUML.g:2394:3: ( ruleStringOrID )
            // InternalOntoUML.g:2395:4: ruleStringOrID
            {
             before(grammarAccess.getGeneralizationAccess().getGenericOntoUMLClassStringOrIDParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getGenericOntoUMLClassStringOrIDParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGeneralizationAccess().getGenericOntoUMLClassCrossReference_3_0()); 

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
    // $ANTLR end "rule__Generalization__GenericAssignment_3"


    // $ANTLR start "rule__Generalization__SpecificAssignment_4"
    // InternalOntoUML.g:2406:1: rule__Generalization__SpecificAssignment_4 : ( ( ruleStringOrID ) ) ;
    public final void rule__Generalization__SpecificAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2410:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:2411:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:2411:2: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2412:3: ( ruleStringOrID )
            {
             before(grammarAccess.getGeneralizationAccess().getSpecificOntoUMLClassCrossReference_4_0()); 
            // InternalOntoUML.g:2413:3: ( ruleStringOrID )
            // InternalOntoUML.g:2414:4: ruleStringOrID
            {
             before(grammarAccess.getGeneralizationAccess().getSpecificOntoUMLClassStringOrIDParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getSpecificOntoUMLClassStringOrIDParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getGeneralizationAccess().getSpecificOntoUMLClassCrossReference_4_0()); 

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
    // $ANTLR end "rule__Generalization__SpecificAssignment_4"


    // $ANTLR start "rule__GeneralizationSet__IsDisjointAssignment_0_0"
    // InternalOntoUML.g:2425:1: rule__GeneralizationSet__IsDisjointAssignment_0_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2429:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoUML.g:2430:2: ( ( 'disjoint' ) )
            {
            // InternalOntoUML.g:2430:2: ( ( 'disjoint' ) )
            // InternalOntoUML.g:2431:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            // InternalOntoUML.g:2432:3: ( 'disjoint' )
            // InternalOntoUML.g:2433:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 

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
    // $ANTLR end "rule__GeneralizationSet__IsDisjointAssignment_0_0"


    // $ANTLR start "rule__GeneralizationSet__IsCompleteAssignment_0_1"
    // InternalOntoUML.g:2444:1: rule__GeneralizationSet__IsCompleteAssignment_0_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2448:1: ( ( ( 'complete' ) ) )
            // InternalOntoUML.g:2449:2: ( ( 'complete' ) )
            {
            // InternalOntoUML.g:2449:2: ( ( 'complete' ) )
            // InternalOntoUML.g:2450:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            // InternalOntoUML.g:2451:3: ( 'complete' )
            // InternalOntoUML.g:2452:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 

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
    // $ANTLR end "rule__GeneralizationSet__IsCompleteAssignment_0_1"


    // $ANTLR start "rule__GeneralizationSet__NameAssignment_2"
    // InternalOntoUML.g:2463:1: rule__GeneralizationSet__NameAssignment_2 : ( ruleStringOrID ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2467:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2468:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2468:2: ( ruleStringOrID )
            // InternalOntoUML.g:2469:3: ruleStringOrID
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameStringOrIDParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getNameStringOrIDParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__GeneralizationSet__NameAssignment_2"


    // $ANTLR start "rule__GeneralizationSet__AliasAssignment_3_1"
    // InternalOntoUML.g:2478:1: rule__GeneralizationSet__AliasAssignment_3_1 : ( ruleStringOrID ) ;
    public final void rule__GeneralizationSet__AliasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2482:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2483:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2483:2: ( ruleStringOrID )
            // InternalOntoUML.g:2484:3: ruleStringOrID
            {
             before(grammarAccess.getGeneralizationSetAccess().getAliasStringOrIDParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getAliasStringOrIDParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__GeneralizationSet__AliasAssignment_3_1"


    // $ANTLR start "rule__GeneralizationSet__GeneralizationsAssignment_5"
    // InternalOntoUML.g:2493:1: rule__GeneralizationSet__GeneralizationsAssignment_5 : ( ( ruleStringOrID ) ) ;
    public final void rule__GeneralizationSet__GeneralizationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2497:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:2498:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:2498:2: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2499:3: ( ruleStringOrID )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_5_0()); 
            // InternalOntoUML.g:2500:3: ( ruleStringOrID )
            // InternalOntoUML.g:2501:4: ruleStringOrID
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationStringOrIDParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationStringOrIDParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_5_0()); 

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
    // $ANTLR end "rule__GeneralizationSet__GeneralizationsAssignment_5"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\14\1\uffff\13\4\2\uffff";
    static final String dfa_3s = "\1\30\1\uffff\13\14\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\13\uffff\1\2\1\3";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "",
            "\2\16\6\uffff\1\15",
            "\2\16\6\uffff\1\15",
            "\2\16\6\uffff\1\15",
            "\2\16\6\uffff\1\15",
            "\2\16\6\uffff\1\15",
            "\2\16\6\uffff\1\15",
            "\2\16\6\uffff\1\15",
            "\2\16\6\uffff\1\15",
            "\2\16\6\uffff\1\15",
            "\2\16\6\uffff\1\15",
            "\2\16\6\uffff\1\15",
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
            return "348:1: rule__OntoUMLClass__Alternatives_0 : ( ( 'class' ) | ( ( rule__OntoUMLClass__Group_0_1__0 ) ) | ( ( rule__OntoUMLClass___typeAssignment_0_2 ) ) );";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\4\1\6\2\0\1\41\2\uffff\1\6\1\42\1\4";
    static final String dfa_9s = "\1\40\1\6\2\0\1\41\2\uffff\1\6\1\42\1\5";
    static final String dfa_10s = "\5\uffff\1\1\1\2\3\uffff";
    static final String dfa_11s = "\1\5\1\2\1\0\1\6\1\3\2\uffff\1\4\1\7\1\1}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\32\uffff\1\1",
            "\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\2\1\3"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1880:3: ( ({...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) {s = 6;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA18_9 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 2;}

                        else if ( LA18_9 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 3;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA18_1 == RULE_CARDINALITY && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 4;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA18_4 == 33 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 7;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA18_7 == RULE_CARDINALITY && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 8;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA18_0 == 32 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 1;}

                        else if ( LA18_0 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 2;}

                        else if ( LA18_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 3;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) {s = 6;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA18_8 == 34 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 9;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000188BFFFF002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000140000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000140000032L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000018000000002L});

}
