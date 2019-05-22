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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_CARDINALITY", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'association'", "'kind'", "'relatorKind'", "'modeKind'", "'qualityKind'", "'subkind'", "'role'", "'phase'", "'category'", "'mixin'", "'roleMixin'", "'phaseMixin'", "'comparative'", "'material'", "'historical'", "'characterization'", "'mediation'", "'external dependence'", "'none'", "'Aggregation'", "'composition'", "'aka'", "'derivation'", "'['", "'..'", "']'", "'generalization'", "'generalizationset'", "'{'", "'}'", "'disjoint'", "'complete'"
    };
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

                if ( ((LA1_0>=12 && LA1_0<=30)||LA1_0==35||(LA1_0>=39 && LA1_0<=40)||(LA1_0>=43 && LA1_0<=44)) ) {
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


    // $ANTLR start "entryRuleAssociationEnd"
    // InternalOntoUML.g:178:1: entryRuleAssociationEnd : ruleAssociationEnd EOF ;
    public final void entryRuleAssociationEnd() throws RecognitionException {
        try {
            // InternalOntoUML.g:179:1: ( ruleAssociationEnd EOF )
            // InternalOntoUML.g:180:1: ruleAssociationEnd EOF
            {
             before(grammarAccess.getAssociationEndRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationEndRule()); 
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
    // $ANTLR end "entryRuleAssociationEnd"


    // $ANTLR start "ruleAssociationEnd"
    // InternalOntoUML.g:187:1: ruleAssociationEnd : ( ( rule__AssociationEnd__Group__0 ) ) ;
    public final void ruleAssociationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:191:2: ( ( ( rule__AssociationEnd__Group__0 ) ) )
            // InternalOntoUML.g:192:2: ( ( rule__AssociationEnd__Group__0 ) )
            {
            // InternalOntoUML.g:192:2: ( ( rule__AssociationEnd__Group__0 ) )
            // InternalOntoUML.g:193:3: ( rule__AssociationEnd__Group__0 )
            {
             before(grammarAccess.getAssociationEndAccess().getGroup()); 
            // InternalOntoUML.g:194:3: ( rule__AssociationEnd__Group__0 )
            // InternalOntoUML.g:194:4: rule__AssociationEnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getGroup()); 

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
    // $ANTLR end "ruleAssociationEnd"


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


    // $ANTLR start "ruleAggregationKind"
    // InternalOntoUML.g:310:1: ruleAggregationKind : ( ( rule__AggregationKind__Alternatives ) ) ;
    public final void ruleAggregationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:314:1: ( ( ( rule__AggregationKind__Alternatives ) ) )
            // InternalOntoUML.g:315:2: ( ( rule__AggregationKind__Alternatives ) )
            {
            // InternalOntoUML.g:315:2: ( ( rule__AggregationKind__Alternatives ) )
            // InternalOntoUML.g:316:3: ( rule__AggregationKind__Alternatives )
            {
             before(grammarAccess.getAggregationKindAccess().getAlternatives()); 
            // InternalOntoUML.g:317:3: ( rule__AggregationKind__Alternatives )
            // InternalOntoUML.g:317:4: rule__AggregationKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AggregationKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAggregationKindAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAggregationKind"


    // $ANTLR start "rule__ModelElement__Alternatives"
    // InternalOntoUML.g:325:1: rule__ModelElement__Alternatives : ( ( ruleOntoUMLClass ) | ( ruleRegularAssociation ) | ( ruleDerivationAssociation ) | ( ruleGeneralization ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:329:1: ( ( ruleOntoUMLClass ) | ( ruleRegularAssociation ) | ( ruleDerivationAssociation ) | ( ruleGeneralization ) | ( ruleGeneralizationSet ) )
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
            case 30:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            case 39:
                {
                alt2=4;
                }
                break;
            case 40:
            case 43:
            case 44:
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
                    // InternalOntoUML.g:330:2: ( ruleOntoUMLClass )
                    {
                    // InternalOntoUML.g:330:2: ( ruleOntoUMLClass )
                    // InternalOntoUML.g:331:3: ruleOntoUMLClass
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
                    // InternalOntoUML.g:336:2: ( ruleRegularAssociation )
                    {
                    // InternalOntoUML.g:336:2: ( ruleRegularAssociation )
                    // InternalOntoUML.g:337:3: ruleRegularAssociation
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
                    // InternalOntoUML.g:342:2: ( ruleDerivationAssociation )
                    {
                    // InternalOntoUML.g:342:2: ( ruleDerivationAssociation )
                    // InternalOntoUML.g:343:3: ruleDerivationAssociation
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
                    // InternalOntoUML.g:348:2: ( ruleGeneralization )
                    {
                    // InternalOntoUML.g:348:2: ( ruleGeneralization )
                    // InternalOntoUML.g:349:3: ruleGeneralization
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
                    // InternalOntoUML.g:354:2: ( ruleGeneralizationSet )
                    {
                    // InternalOntoUML.g:354:2: ( ruleGeneralizationSet )
                    // InternalOntoUML.g:355:3: ruleGeneralizationSet
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
    // InternalOntoUML.g:364:1: rule__OntoUMLClass__Alternatives_0 : ( ( 'class' ) | ( ( rule__OntoUMLClass__Group_0_1__0 ) ) | ( ( rule__OntoUMLClass___typeAssignment_0_2 ) ) );
    public final void rule__OntoUMLClass__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:368:1: ( ( 'class' ) | ( ( rule__OntoUMLClass__Group_0_1__0 ) ) | ( ( rule__OntoUMLClass___typeAssignment_0_2 ) ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalOntoUML.g:369:2: ( 'class' )
                    {
                    // InternalOntoUML.g:369:2: ( 'class' )
                    // InternalOntoUML.g:370:3: 'class'
                    {
                     before(grammarAccess.getOntoUMLClassAccess().getClassKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOntoUMLClassAccess().getClassKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:375:2: ( ( rule__OntoUMLClass__Group_0_1__0 ) )
                    {
                    // InternalOntoUML.g:375:2: ( ( rule__OntoUMLClass__Group_0_1__0 ) )
                    // InternalOntoUML.g:376:3: ( rule__OntoUMLClass__Group_0_1__0 )
                    {
                     before(grammarAccess.getOntoUMLClassAccess().getGroup_0_1()); 
                    // InternalOntoUML.g:377:3: ( rule__OntoUMLClass__Group_0_1__0 )
                    // InternalOntoUML.g:377:4: rule__OntoUMLClass__Group_0_1__0
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
                    // InternalOntoUML.g:381:2: ( ( rule__OntoUMLClass___typeAssignment_0_2 ) )
                    {
                    // InternalOntoUML.g:381:2: ( ( rule__OntoUMLClass___typeAssignment_0_2 ) )
                    // InternalOntoUML.g:382:3: ( rule__OntoUMLClass___typeAssignment_0_2 )
                    {
                     before(grammarAccess.getOntoUMLClassAccess().get_typeAssignment_0_2()); 
                    // InternalOntoUML.g:383:3: ( rule__OntoUMLClass___typeAssignment_0_2 )
                    // InternalOntoUML.g:383:4: rule__OntoUMLClass___typeAssignment_0_2
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
    // InternalOntoUML.g:391:1: rule__RegularAssociation__Alternatives_0 : ( ( 'association' ) | ( ( rule__RegularAssociation__Group_0_1__0 ) ) | ( ( rule__RegularAssociation___typeAssignment_0_2 ) ) );
    public final void rule__RegularAssociation__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:395:1: ( ( 'association' ) | ( ( rule__RegularAssociation__Group_0_1__0 ) ) | ( ( rule__RegularAssociation___typeAssignment_0_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalOntoUML.g:396:2: ( 'association' )
                    {
                    // InternalOntoUML.g:396:2: ( 'association' )
                    // InternalOntoUML.g:397:3: 'association'
                    {
                     before(grammarAccess.getRegularAssociationAccess().getAssociationKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRegularAssociationAccess().getAssociationKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:402:2: ( ( rule__RegularAssociation__Group_0_1__0 ) )
                    {
                    // InternalOntoUML.g:402:2: ( ( rule__RegularAssociation__Group_0_1__0 ) )
                    // InternalOntoUML.g:403:3: ( rule__RegularAssociation__Group_0_1__0 )
                    {
                     before(grammarAccess.getRegularAssociationAccess().getGroup_0_1()); 
                    // InternalOntoUML.g:404:3: ( rule__RegularAssociation__Group_0_1__0 )
                    // InternalOntoUML.g:404:4: rule__RegularAssociation__Group_0_1__0
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
                    // InternalOntoUML.g:408:2: ( ( rule__RegularAssociation___typeAssignment_0_2 ) )
                    {
                    // InternalOntoUML.g:408:2: ( ( rule__RegularAssociation___typeAssignment_0_2 ) )
                    // InternalOntoUML.g:409:3: ( rule__RegularAssociation___typeAssignment_0_2 )
                    {
                     before(grammarAccess.getRegularAssociationAccess().get_typeAssignment_0_2()); 
                    // InternalOntoUML.g:410:3: ( rule__RegularAssociation___typeAssignment_0_2 )
                    // InternalOntoUML.g:410:4: rule__RegularAssociation___typeAssignment_0_2
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
    // InternalOntoUML.g:418:1: rule__StringOrID__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__StringOrID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:422:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalOntoUML.g:423:2: ( RULE_STRING )
                    {
                    // InternalOntoUML.g:423:2: ( RULE_STRING )
                    // InternalOntoUML.g:424:3: RULE_STRING
                    {
                     before(grammarAccess.getStringOrIDAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getStringOrIDAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:429:2: ( RULE_ID )
                    {
                    // InternalOntoUML.g:429:2: ( RULE_ID )
                    // InternalOntoUML.g:430:3: RULE_ID
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
    // InternalOntoUML.g:439:1: rule__EndurantType__Alternatives : ( ( ( 'kind' ) ) | ( ( 'relatorKind' ) ) | ( ( 'modeKind' ) ) | ( ( 'qualityKind' ) ) | ( ( 'subkind' ) ) | ( ( 'role' ) ) | ( ( 'phase' ) ) | ( ( 'category' ) ) | ( ( 'mixin' ) ) | ( ( 'roleMixin' ) ) | ( ( 'phaseMixin' ) ) );
    public final void rule__EndurantType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:443:1: ( ( ( 'kind' ) ) | ( ( 'relatorKind' ) ) | ( ( 'modeKind' ) ) | ( ( 'qualityKind' ) ) | ( ( 'subkind' ) ) | ( ( 'role' ) ) | ( ( 'phase' ) ) | ( ( 'category' ) ) | ( ( 'mixin' ) ) | ( ( 'roleMixin' ) ) | ( ( 'phaseMixin' ) ) )
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
                    // InternalOntoUML.g:444:2: ( ( 'kind' ) )
                    {
                    // InternalOntoUML.g:444:2: ( ( 'kind' ) )
                    // InternalOntoUML.g:445:3: ( 'kind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getKindEnumLiteralDeclaration_0()); 
                    // InternalOntoUML.g:446:3: ( 'kind' )
                    // InternalOntoUML.g:446:4: 'kind'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getKindEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:450:2: ( ( 'relatorKind' ) )
                    {
                    // InternalOntoUML.g:450:2: ( ( 'relatorKind' ) )
                    // InternalOntoUML.g:451:3: ( 'relatorKind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getRelatorKindEnumLiteralDeclaration_1()); 
                    // InternalOntoUML.g:452:3: ( 'relatorKind' )
                    // InternalOntoUML.g:452:4: 'relatorKind'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getRelatorKindEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:456:2: ( ( 'modeKind' ) )
                    {
                    // InternalOntoUML.g:456:2: ( ( 'modeKind' ) )
                    // InternalOntoUML.g:457:3: ( 'modeKind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getModeKindEnumLiteralDeclaration_2()); 
                    // InternalOntoUML.g:458:3: ( 'modeKind' )
                    // InternalOntoUML.g:458:4: 'modeKind'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getModeKindEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoUML.g:462:2: ( ( 'qualityKind' ) )
                    {
                    // InternalOntoUML.g:462:2: ( ( 'qualityKind' ) )
                    // InternalOntoUML.g:463:3: ( 'qualityKind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getQualityKindEnumLiteralDeclaration_3()); 
                    // InternalOntoUML.g:464:3: ( 'qualityKind' )
                    // InternalOntoUML.g:464:4: 'qualityKind'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getQualityKindEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoUML.g:468:2: ( ( 'subkind' ) )
                    {
                    // InternalOntoUML.g:468:2: ( ( 'subkind' ) )
                    // InternalOntoUML.g:469:3: ( 'subkind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getSubkindEnumLiteralDeclaration_4()); 
                    // InternalOntoUML.g:470:3: ( 'subkind' )
                    // InternalOntoUML.g:470:4: 'subkind'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getSubkindEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOntoUML.g:474:2: ( ( 'role' ) )
                    {
                    // InternalOntoUML.g:474:2: ( ( 'role' ) )
                    // InternalOntoUML.g:475:3: ( 'role' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getRoleEnumLiteralDeclaration_5()); 
                    // InternalOntoUML.g:476:3: ( 'role' )
                    // InternalOntoUML.g:476:4: 'role'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getRoleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOntoUML.g:480:2: ( ( 'phase' ) )
                    {
                    // InternalOntoUML.g:480:2: ( ( 'phase' ) )
                    // InternalOntoUML.g:481:3: ( 'phase' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getPhaseEnumLiteralDeclaration_6()); 
                    // InternalOntoUML.g:482:3: ( 'phase' )
                    // InternalOntoUML.g:482:4: 'phase'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getPhaseEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalOntoUML.g:486:2: ( ( 'category' ) )
                    {
                    // InternalOntoUML.g:486:2: ( ( 'category' ) )
                    // InternalOntoUML.g:487:3: ( 'category' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getCategoryEnumLiteralDeclaration_7()); 
                    // InternalOntoUML.g:488:3: ( 'category' )
                    // InternalOntoUML.g:488:4: 'category'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getCategoryEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalOntoUML.g:492:2: ( ( 'mixin' ) )
                    {
                    // InternalOntoUML.g:492:2: ( ( 'mixin' ) )
                    // InternalOntoUML.g:493:3: ( 'mixin' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getMixinEnumLiteralDeclaration_8()); 
                    // InternalOntoUML.g:494:3: ( 'mixin' )
                    // InternalOntoUML.g:494:4: 'mixin'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getMixinEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalOntoUML.g:498:2: ( ( 'roleMixin' ) )
                    {
                    // InternalOntoUML.g:498:2: ( ( 'roleMixin' ) )
                    // InternalOntoUML.g:499:3: ( 'roleMixin' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getRoleMixinEnumLiteralDeclaration_9()); 
                    // InternalOntoUML.g:500:3: ( 'roleMixin' )
                    // InternalOntoUML.g:500:4: 'roleMixin'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getRoleMixinEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalOntoUML.g:504:2: ( ( 'phaseMixin' ) )
                    {
                    // InternalOntoUML.g:504:2: ( ( 'phaseMixin' ) )
                    // InternalOntoUML.g:505:3: ( 'phaseMixin' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getPhaseMixinEnumLiteralDeclaration_10()); 
                    // InternalOntoUML.g:506:3: ( 'phaseMixin' )
                    // InternalOntoUML.g:506:4: 'phaseMixin'
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
    // InternalOntoUML.g:514:1: rule__RelationType__Alternatives : ( ( ( 'comparative' ) ) | ( ( 'material' ) ) | ( ( 'historical' ) ) | ( ( 'characterization' ) ) | ( ( 'mediation' ) ) | ( ( 'external dependence' ) ) );
    public final void rule__RelationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:518:1: ( ( ( 'comparative' ) ) | ( ( 'material' ) ) | ( ( 'historical' ) ) | ( ( 'characterization' ) ) | ( ( 'mediation' ) ) | ( ( 'external dependence' ) ) )
            int alt7=6;
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
            case 30:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalOntoUML.g:519:2: ( ( 'comparative' ) )
                    {
                    // InternalOntoUML.g:519:2: ( ( 'comparative' ) )
                    // InternalOntoUML.g:520:3: ( 'comparative' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getComparativeEnumLiteralDeclaration_0()); 
                    // InternalOntoUML.g:521:3: ( 'comparative' )
                    // InternalOntoUML.g:521:4: 'comparative'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getComparativeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:525:2: ( ( 'material' ) )
                    {
                    // InternalOntoUML.g:525:2: ( ( 'material' ) )
                    // InternalOntoUML.g:526:3: ( 'material' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getMaterialEnumLiteralDeclaration_1()); 
                    // InternalOntoUML.g:527:3: ( 'material' )
                    // InternalOntoUML.g:527:4: 'material'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getMaterialEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:531:2: ( ( 'historical' ) )
                    {
                    // InternalOntoUML.g:531:2: ( ( 'historical' ) )
                    // InternalOntoUML.g:532:3: ( 'historical' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getHistoricalEnumLiteralDeclaration_2()); 
                    // InternalOntoUML.g:533:3: ( 'historical' )
                    // InternalOntoUML.g:533:4: 'historical'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getHistoricalEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoUML.g:537:2: ( ( 'characterization' ) )
                    {
                    // InternalOntoUML.g:537:2: ( ( 'characterization' ) )
                    // InternalOntoUML.g:538:3: ( 'characterization' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getCharacterizationEnumLiteralDeclaration_3()); 
                    // InternalOntoUML.g:539:3: ( 'characterization' )
                    // InternalOntoUML.g:539:4: 'characterization'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getCharacterizationEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoUML.g:543:2: ( ( 'mediation' ) )
                    {
                    // InternalOntoUML.g:543:2: ( ( 'mediation' ) )
                    // InternalOntoUML.g:544:3: ( 'mediation' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getMediationEnumLiteralDeclaration_4()); 
                    // InternalOntoUML.g:545:3: ( 'mediation' )
                    // InternalOntoUML.g:545:4: 'mediation'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getMediationEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOntoUML.g:549:2: ( ( 'external dependence' ) )
                    {
                    // InternalOntoUML.g:549:2: ( ( 'external dependence' ) )
                    // InternalOntoUML.g:550:3: ( 'external dependence' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getExternalDepedenceEnumLiteralDeclaration_5()); 
                    // InternalOntoUML.g:551:3: ( 'external dependence' )
                    // InternalOntoUML.g:551:4: 'external dependence'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getExternalDepedenceEnumLiteralDeclaration_5()); 

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


    // $ANTLR start "rule__AggregationKind__Alternatives"
    // InternalOntoUML.g:559:1: rule__AggregationKind__Alternatives : ( ( ( 'none' ) ) | ( ( 'Aggregation' ) ) | ( ( 'composition' ) ) );
    public final void rule__AggregationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:563:1: ( ( ( 'none' ) ) | ( ( 'Aggregation' ) ) | ( ( 'composition' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt8=1;
                }
                break;
            case 32:
                {
                alt8=2;
                }
                break;
            case 33:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalOntoUML.g:564:2: ( ( 'none' ) )
                    {
                    // InternalOntoUML.g:564:2: ( ( 'none' ) )
                    // InternalOntoUML.g:565:3: ( 'none' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getNoneEnumLiteralDeclaration_0()); 
                    // InternalOntoUML.g:566:3: ( 'none' )
                    // InternalOntoUML.g:566:4: 'none'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getNoneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:570:2: ( ( 'Aggregation' ) )
                    {
                    // InternalOntoUML.g:570:2: ( ( 'Aggregation' ) )
                    // InternalOntoUML.g:571:3: ( 'Aggregation' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getAggregationEnumLiteralDeclaration_1()); 
                    // InternalOntoUML.g:572:3: ( 'Aggregation' )
                    // InternalOntoUML.g:572:4: 'Aggregation'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getAggregationEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:576:2: ( ( 'composition' ) )
                    {
                    // InternalOntoUML.g:576:2: ( ( 'composition' ) )
                    // InternalOntoUML.g:577:3: ( 'composition' )
                    {
                     before(grammarAccess.getAggregationKindAccess().getCompositionEnumLiteralDeclaration_2()); 
                    // InternalOntoUML.g:578:3: ( 'composition' )
                    // InternalOntoUML.g:578:4: 'composition'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindAccess().getCompositionEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__AggregationKind__Alternatives"


    // $ANTLR start "rule__OntoUMLClass__Group__0"
    // InternalOntoUML.g:586:1: rule__OntoUMLClass__Group__0 : rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1 ;
    public final void rule__OntoUMLClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:590:1: ( rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1 )
            // InternalOntoUML.g:591:2: rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1
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
    // InternalOntoUML.g:598:1: rule__OntoUMLClass__Group__0__Impl : ( ( rule__OntoUMLClass__Alternatives_0 ) ) ;
    public final void rule__OntoUMLClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:602:1: ( ( ( rule__OntoUMLClass__Alternatives_0 ) ) )
            // InternalOntoUML.g:603:1: ( ( rule__OntoUMLClass__Alternatives_0 ) )
            {
            // InternalOntoUML.g:603:1: ( ( rule__OntoUMLClass__Alternatives_0 ) )
            // InternalOntoUML.g:604:2: ( rule__OntoUMLClass__Alternatives_0 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getAlternatives_0()); 
            // InternalOntoUML.g:605:2: ( rule__OntoUMLClass__Alternatives_0 )
            // InternalOntoUML.g:605:3: rule__OntoUMLClass__Alternatives_0
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
    // InternalOntoUML.g:613:1: rule__OntoUMLClass__Group__1 : rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2 ;
    public final void rule__OntoUMLClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:617:1: ( rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2 )
            // InternalOntoUML.g:618:2: rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2
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
    // InternalOntoUML.g:625:1: rule__OntoUMLClass__Group__1__Impl : ( ( rule__OntoUMLClass__NameAssignment_1 ) ) ;
    public final void rule__OntoUMLClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:629:1: ( ( ( rule__OntoUMLClass__NameAssignment_1 ) ) )
            // InternalOntoUML.g:630:1: ( ( rule__OntoUMLClass__NameAssignment_1 ) )
            {
            // InternalOntoUML.g:630:1: ( ( rule__OntoUMLClass__NameAssignment_1 ) )
            // InternalOntoUML.g:631:2: ( rule__OntoUMLClass__NameAssignment_1 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getNameAssignment_1()); 
            // InternalOntoUML.g:632:2: ( rule__OntoUMLClass__NameAssignment_1 )
            // InternalOntoUML.g:632:3: rule__OntoUMLClass__NameAssignment_1
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
    // InternalOntoUML.g:640:1: rule__OntoUMLClass__Group__2 : rule__OntoUMLClass__Group__2__Impl ;
    public final void rule__OntoUMLClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:644:1: ( rule__OntoUMLClass__Group__2__Impl )
            // InternalOntoUML.g:645:2: rule__OntoUMLClass__Group__2__Impl
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
    // InternalOntoUML.g:651:1: rule__OntoUMLClass__Group__2__Impl : ( ( rule__OntoUMLClass__Group_2__0 )? ) ;
    public final void rule__OntoUMLClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:655:1: ( ( ( rule__OntoUMLClass__Group_2__0 )? ) )
            // InternalOntoUML.g:656:1: ( ( rule__OntoUMLClass__Group_2__0 )? )
            {
            // InternalOntoUML.g:656:1: ( ( rule__OntoUMLClass__Group_2__0 )? )
            // InternalOntoUML.g:657:2: ( rule__OntoUMLClass__Group_2__0 )?
            {
             before(grammarAccess.getOntoUMLClassAccess().getGroup_2()); 
            // InternalOntoUML.g:658:2: ( rule__OntoUMLClass__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoUML.g:658:3: rule__OntoUMLClass__Group_2__0
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
    // InternalOntoUML.g:667:1: rule__OntoUMLClass__Group_0_1__0 : rule__OntoUMLClass__Group_0_1__0__Impl rule__OntoUMLClass__Group_0_1__1 ;
    public final void rule__OntoUMLClass__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:671:1: ( rule__OntoUMLClass__Group_0_1__0__Impl rule__OntoUMLClass__Group_0_1__1 )
            // InternalOntoUML.g:672:2: rule__OntoUMLClass__Group_0_1__0__Impl rule__OntoUMLClass__Group_0_1__1
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
    // InternalOntoUML.g:679:1: rule__OntoUMLClass__Group_0_1__0__Impl : ( ( rule__OntoUMLClass___typeAssignment_0_1_0 ) ) ;
    public final void rule__OntoUMLClass__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:683:1: ( ( ( rule__OntoUMLClass___typeAssignment_0_1_0 ) ) )
            // InternalOntoUML.g:684:1: ( ( rule__OntoUMLClass___typeAssignment_0_1_0 ) )
            {
            // InternalOntoUML.g:684:1: ( ( rule__OntoUMLClass___typeAssignment_0_1_0 ) )
            // InternalOntoUML.g:685:2: ( rule__OntoUMLClass___typeAssignment_0_1_0 )
            {
             before(grammarAccess.getOntoUMLClassAccess().get_typeAssignment_0_1_0()); 
            // InternalOntoUML.g:686:2: ( rule__OntoUMLClass___typeAssignment_0_1_0 )
            // InternalOntoUML.g:686:3: rule__OntoUMLClass___typeAssignment_0_1_0
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
    // InternalOntoUML.g:694:1: rule__OntoUMLClass__Group_0_1__1 : rule__OntoUMLClass__Group_0_1__1__Impl ;
    public final void rule__OntoUMLClass__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:698:1: ( rule__OntoUMLClass__Group_0_1__1__Impl )
            // InternalOntoUML.g:699:2: rule__OntoUMLClass__Group_0_1__1__Impl
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
    // InternalOntoUML.g:705:1: rule__OntoUMLClass__Group_0_1__1__Impl : ( 'class' ) ;
    public final void rule__OntoUMLClass__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:709:1: ( ( 'class' ) )
            // InternalOntoUML.g:710:1: ( 'class' )
            {
            // InternalOntoUML.g:710:1: ( 'class' )
            // InternalOntoUML.g:711:2: 'class'
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
    // InternalOntoUML.g:721:1: rule__OntoUMLClass__Group_2__0 : rule__OntoUMLClass__Group_2__0__Impl rule__OntoUMLClass__Group_2__1 ;
    public final void rule__OntoUMLClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:725:1: ( rule__OntoUMLClass__Group_2__0__Impl rule__OntoUMLClass__Group_2__1 )
            // InternalOntoUML.g:726:2: rule__OntoUMLClass__Group_2__0__Impl rule__OntoUMLClass__Group_2__1
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
    // InternalOntoUML.g:733:1: rule__OntoUMLClass__Group_2__0__Impl : ( 'aka' ) ;
    public final void rule__OntoUMLClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:737:1: ( ( 'aka' ) )
            // InternalOntoUML.g:738:1: ( 'aka' )
            {
            // InternalOntoUML.g:738:1: ( 'aka' )
            // InternalOntoUML.g:739:2: 'aka'
            {
             before(grammarAccess.getOntoUMLClassAccess().getAkaKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalOntoUML.g:748:1: rule__OntoUMLClass__Group_2__1 : rule__OntoUMLClass__Group_2__1__Impl ;
    public final void rule__OntoUMLClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:752:1: ( rule__OntoUMLClass__Group_2__1__Impl )
            // InternalOntoUML.g:753:2: rule__OntoUMLClass__Group_2__1__Impl
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
    // InternalOntoUML.g:759:1: rule__OntoUMLClass__Group_2__1__Impl : ( ( rule__OntoUMLClass__AliasAssignment_2_1 ) ) ;
    public final void rule__OntoUMLClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:763:1: ( ( ( rule__OntoUMLClass__AliasAssignment_2_1 ) ) )
            // InternalOntoUML.g:764:1: ( ( rule__OntoUMLClass__AliasAssignment_2_1 ) )
            {
            // InternalOntoUML.g:764:1: ( ( rule__OntoUMLClass__AliasAssignment_2_1 ) )
            // InternalOntoUML.g:765:2: ( rule__OntoUMLClass__AliasAssignment_2_1 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getAliasAssignment_2_1()); 
            // InternalOntoUML.g:766:2: ( rule__OntoUMLClass__AliasAssignment_2_1 )
            // InternalOntoUML.g:766:3: rule__OntoUMLClass__AliasAssignment_2_1
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
    // InternalOntoUML.g:775:1: rule__RegularAssociation__Group__0 : rule__RegularAssociation__Group__0__Impl rule__RegularAssociation__Group__1 ;
    public final void rule__RegularAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:779:1: ( rule__RegularAssociation__Group__0__Impl rule__RegularAssociation__Group__1 )
            // InternalOntoUML.g:780:2: rule__RegularAssociation__Group__0__Impl rule__RegularAssociation__Group__1
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
    // InternalOntoUML.g:787:1: rule__RegularAssociation__Group__0__Impl : ( ( rule__RegularAssociation__Alternatives_0 ) ) ;
    public final void rule__RegularAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:791:1: ( ( ( rule__RegularAssociation__Alternatives_0 ) ) )
            // InternalOntoUML.g:792:1: ( ( rule__RegularAssociation__Alternatives_0 ) )
            {
            // InternalOntoUML.g:792:1: ( ( rule__RegularAssociation__Alternatives_0 ) )
            // InternalOntoUML.g:793:2: ( rule__RegularAssociation__Alternatives_0 )
            {
             before(grammarAccess.getRegularAssociationAccess().getAlternatives_0()); 
            // InternalOntoUML.g:794:2: ( rule__RegularAssociation__Alternatives_0 )
            // InternalOntoUML.g:794:3: rule__RegularAssociation__Alternatives_0
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
    // InternalOntoUML.g:802:1: rule__RegularAssociation__Group__1 : rule__RegularAssociation__Group__1__Impl rule__RegularAssociation__Group__2 ;
    public final void rule__RegularAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:806:1: ( rule__RegularAssociation__Group__1__Impl rule__RegularAssociation__Group__2 )
            // InternalOntoUML.g:807:2: rule__RegularAssociation__Group__1__Impl rule__RegularAssociation__Group__2
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
    // InternalOntoUML.g:814:1: rule__RegularAssociation__Group__1__Impl : ( ( rule__RegularAssociation__NameAssignment_1 ) ) ;
    public final void rule__RegularAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:818:1: ( ( ( rule__RegularAssociation__NameAssignment_1 ) ) )
            // InternalOntoUML.g:819:1: ( ( rule__RegularAssociation__NameAssignment_1 ) )
            {
            // InternalOntoUML.g:819:1: ( ( rule__RegularAssociation__NameAssignment_1 ) )
            // InternalOntoUML.g:820:2: ( rule__RegularAssociation__NameAssignment_1 )
            {
             before(grammarAccess.getRegularAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUML.g:821:2: ( rule__RegularAssociation__NameAssignment_1 )
            // InternalOntoUML.g:821:3: rule__RegularAssociation__NameAssignment_1
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
    // InternalOntoUML.g:829:1: rule__RegularAssociation__Group__2 : rule__RegularAssociation__Group__2__Impl rule__RegularAssociation__Group__3 ;
    public final void rule__RegularAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:833:1: ( rule__RegularAssociation__Group__2__Impl rule__RegularAssociation__Group__3 )
            // InternalOntoUML.g:834:2: rule__RegularAssociation__Group__2__Impl rule__RegularAssociation__Group__3
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
    // InternalOntoUML.g:841:1: rule__RegularAssociation__Group__2__Impl : ( ( rule__RegularAssociation__Group_2__0 )? ) ;
    public final void rule__RegularAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:845:1: ( ( ( rule__RegularAssociation__Group_2__0 )? ) )
            // InternalOntoUML.g:846:1: ( ( rule__RegularAssociation__Group_2__0 )? )
            {
            // InternalOntoUML.g:846:1: ( ( rule__RegularAssociation__Group_2__0 )? )
            // InternalOntoUML.g:847:2: ( rule__RegularAssociation__Group_2__0 )?
            {
             before(grammarAccess.getRegularAssociationAccess().getGroup_2()); 
            // InternalOntoUML.g:848:2: ( rule__RegularAssociation__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoUML.g:848:3: rule__RegularAssociation__Group_2__0
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
    // InternalOntoUML.g:856:1: rule__RegularAssociation__Group__3 : rule__RegularAssociation__Group__3__Impl rule__RegularAssociation__Group__4 ;
    public final void rule__RegularAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:860:1: ( rule__RegularAssociation__Group__3__Impl rule__RegularAssociation__Group__4 )
            // InternalOntoUML.g:861:2: rule__RegularAssociation__Group__3__Impl rule__RegularAssociation__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalOntoUML.g:868:1: rule__RegularAssociation__Group__3__Impl : ( ( rule__RegularAssociation__SourceEndAssignment_3 ) ) ;
    public final void rule__RegularAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:872:1: ( ( ( rule__RegularAssociation__SourceEndAssignment_3 ) ) )
            // InternalOntoUML.g:873:1: ( ( rule__RegularAssociation__SourceEndAssignment_3 ) )
            {
            // InternalOntoUML.g:873:1: ( ( rule__RegularAssociation__SourceEndAssignment_3 ) )
            // InternalOntoUML.g:874:2: ( rule__RegularAssociation__SourceEndAssignment_3 )
            {
             before(grammarAccess.getRegularAssociationAccess().getSourceEndAssignment_3()); 
            // InternalOntoUML.g:875:2: ( rule__RegularAssociation__SourceEndAssignment_3 )
            // InternalOntoUML.g:875:3: rule__RegularAssociation__SourceEndAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__SourceEndAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRegularAssociationAccess().getSourceEndAssignment_3()); 

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
    // InternalOntoUML.g:883:1: rule__RegularAssociation__Group__4 : rule__RegularAssociation__Group__4__Impl rule__RegularAssociation__Group__5 ;
    public final void rule__RegularAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:887:1: ( rule__RegularAssociation__Group__4__Impl rule__RegularAssociation__Group__5 )
            // InternalOntoUML.g:888:2: rule__RegularAssociation__Group__4__Impl rule__RegularAssociation__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalOntoUML.g:895:1: rule__RegularAssociation__Group__4__Impl : ( ( rule__RegularAssociation__SourceAssignment_4 ) ) ;
    public final void rule__RegularAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:899:1: ( ( ( rule__RegularAssociation__SourceAssignment_4 ) ) )
            // InternalOntoUML.g:900:1: ( ( rule__RegularAssociation__SourceAssignment_4 ) )
            {
            // InternalOntoUML.g:900:1: ( ( rule__RegularAssociation__SourceAssignment_4 ) )
            // InternalOntoUML.g:901:2: ( rule__RegularAssociation__SourceAssignment_4 )
            {
             before(grammarAccess.getRegularAssociationAccess().getSourceAssignment_4()); 
            // InternalOntoUML.g:902:2: ( rule__RegularAssociation__SourceAssignment_4 )
            // InternalOntoUML.g:902:3: rule__RegularAssociation__SourceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__SourceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRegularAssociationAccess().getSourceAssignment_4()); 

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
    // InternalOntoUML.g:910:1: rule__RegularAssociation__Group__5 : rule__RegularAssociation__Group__5__Impl rule__RegularAssociation__Group__6 ;
    public final void rule__RegularAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:914:1: ( rule__RegularAssociation__Group__5__Impl rule__RegularAssociation__Group__6 )
            // InternalOntoUML.g:915:2: rule__RegularAssociation__Group__5__Impl rule__RegularAssociation__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalOntoUML.g:922:1: rule__RegularAssociation__Group__5__Impl : ( ( rule__RegularAssociation__TargetEndAssignment_5 ) ) ;
    public final void rule__RegularAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:926:1: ( ( ( rule__RegularAssociation__TargetEndAssignment_5 ) ) )
            // InternalOntoUML.g:927:1: ( ( rule__RegularAssociation__TargetEndAssignment_5 ) )
            {
            // InternalOntoUML.g:927:1: ( ( rule__RegularAssociation__TargetEndAssignment_5 ) )
            // InternalOntoUML.g:928:2: ( rule__RegularAssociation__TargetEndAssignment_5 )
            {
             before(grammarAccess.getRegularAssociationAccess().getTargetEndAssignment_5()); 
            // InternalOntoUML.g:929:2: ( rule__RegularAssociation__TargetEndAssignment_5 )
            // InternalOntoUML.g:929:3: rule__RegularAssociation__TargetEndAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__TargetEndAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRegularAssociationAccess().getTargetEndAssignment_5()); 

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
    // InternalOntoUML.g:937:1: rule__RegularAssociation__Group__6 : rule__RegularAssociation__Group__6__Impl ;
    public final void rule__RegularAssociation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:941:1: ( rule__RegularAssociation__Group__6__Impl )
            // InternalOntoUML.g:942:2: rule__RegularAssociation__Group__6__Impl
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
    // InternalOntoUML.g:948:1: rule__RegularAssociation__Group__6__Impl : ( ( rule__RegularAssociation__TargetAssignment_6 ) ) ;
    public final void rule__RegularAssociation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:952:1: ( ( ( rule__RegularAssociation__TargetAssignment_6 ) ) )
            // InternalOntoUML.g:953:1: ( ( rule__RegularAssociation__TargetAssignment_6 ) )
            {
            // InternalOntoUML.g:953:1: ( ( rule__RegularAssociation__TargetAssignment_6 ) )
            // InternalOntoUML.g:954:2: ( rule__RegularAssociation__TargetAssignment_6 )
            {
             before(grammarAccess.getRegularAssociationAccess().getTargetAssignment_6()); 
            // InternalOntoUML.g:955:2: ( rule__RegularAssociation__TargetAssignment_6 )
            // InternalOntoUML.g:955:3: rule__RegularAssociation__TargetAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__TargetAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRegularAssociationAccess().getTargetAssignment_6()); 

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
    // InternalOntoUML.g:964:1: rule__RegularAssociation__Group_0_1__0 : rule__RegularAssociation__Group_0_1__0__Impl rule__RegularAssociation__Group_0_1__1 ;
    public final void rule__RegularAssociation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:968:1: ( rule__RegularAssociation__Group_0_1__0__Impl rule__RegularAssociation__Group_0_1__1 )
            // InternalOntoUML.g:969:2: rule__RegularAssociation__Group_0_1__0__Impl rule__RegularAssociation__Group_0_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUML.g:976:1: rule__RegularAssociation__Group_0_1__0__Impl : ( ( rule__RegularAssociation___typeAssignment_0_1_0 ) ) ;
    public final void rule__RegularAssociation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:980:1: ( ( ( rule__RegularAssociation___typeAssignment_0_1_0 ) ) )
            // InternalOntoUML.g:981:1: ( ( rule__RegularAssociation___typeAssignment_0_1_0 ) )
            {
            // InternalOntoUML.g:981:1: ( ( rule__RegularAssociation___typeAssignment_0_1_0 ) )
            // InternalOntoUML.g:982:2: ( rule__RegularAssociation___typeAssignment_0_1_0 )
            {
             before(grammarAccess.getRegularAssociationAccess().get_typeAssignment_0_1_0()); 
            // InternalOntoUML.g:983:2: ( rule__RegularAssociation___typeAssignment_0_1_0 )
            // InternalOntoUML.g:983:3: rule__RegularAssociation___typeAssignment_0_1_0
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
    // InternalOntoUML.g:991:1: rule__RegularAssociation__Group_0_1__1 : rule__RegularAssociation__Group_0_1__1__Impl ;
    public final void rule__RegularAssociation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:995:1: ( rule__RegularAssociation__Group_0_1__1__Impl )
            // InternalOntoUML.g:996:2: rule__RegularAssociation__Group_0_1__1__Impl
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
    // InternalOntoUML.g:1002:1: rule__RegularAssociation__Group_0_1__1__Impl : ( 'association' ) ;
    public final void rule__RegularAssociation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1006:1: ( ( 'association' ) )
            // InternalOntoUML.g:1007:1: ( 'association' )
            {
            // InternalOntoUML.g:1007:1: ( 'association' )
            // InternalOntoUML.g:1008:2: 'association'
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
    // InternalOntoUML.g:1018:1: rule__RegularAssociation__Group_2__0 : rule__RegularAssociation__Group_2__0__Impl rule__RegularAssociation__Group_2__1 ;
    public final void rule__RegularAssociation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1022:1: ( rule__RegularAssociation__Group_2__0__Impl rule__RegularAssociation__Group_2__1 )
            // InternalOntoUML.g:1023:2: rule__RegularAssociation__Group_2__0__Impl rule__RegularAssociation__Group_2__1
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
    // InternalOntoUML.g:1030:1: rule__RegularAssociation__Group_2__0__Impl : ( 'aka' ) ;
    public final void rule__RegularAssociation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1034:1: ( ( 'aka' ) )
            // InternalOntoUML.g:1035:1: ( 'aka' )
            {
            // InternalOntoUML.g:1035:1: ( 'aka' )
            // InternalOntoUML.g:1036:2: 'aka'
            {
             before(grammarAccess.getRegularAssociationAccess().getAkaKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalOntoUML.g:1045:1: rule__RegularAssociation__Group_2__1 : rule__RegularAssociation__Group_2__1__Impl ;
    public final void rule__RegularAssociation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1049:1: ( rule__RegularAssociation__Group_2__1__Impl )
            // InternalOntoUML.g:1050:2: rule__RegularAssociation__Group_2__1__Impl
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
    // InternalOntoUML.g:1056:1: rule__RegularAssociation__Group_2__1__Impl : ( ( rule__RegularAssociation__AliasAssignment_2_1 ) ) ;
    public final void rule__RegularAssociation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1060:1: ( ( ( rule__RegularAssociation__AliasAssignment_2_1 ) ) )
            // InternalOntoUML.g:1061:1: ( ( rule__RegularAssociation__AliasAssignment_2_1 ) )
            {
            // InternalOntoUML.g:1061:1: ( ( rule__RegularAssociation__AliasAssignment_2_1 ) )
            // InternalOntoUML.g:1062:2: ( rule__RegularAssociation__AliasAssignment_2_1 )
            {
             before(grammarAccess.getRegularAssociationAccess().getAliasAssignment_2_1()); 
            // InternalOntoUML.g:1063:2: ( rule__RegularAssociation__AliasAssignment_2_1 )
            // InternalOntoUML.g:1063:3: rule__RegularAssociation__AliasAssignment_2_1
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
    // InternalOntoUML.g:1072:1: rule__DerivationAssociation__Group__0 : rule__DerivationAssociation__Group__0__Impl rule__DerivationAssociation__Group__1 ;
    public final void rule__DerivationAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1076:1: ( rule__DerivationAssociation__Group__0__Impl rule__DerivationAssociation__Group__1 )
            // InternalOntoUML.g:1077:2: rule__DerivationAssociation__Group__0__Impl rule__DerivationAssociation__Group__1
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
    // InternalOntoUML.g:1084:1: rule__DerivationAssociation__Group__0__Impl : ( 'derivation' ) ;
    public final void rule__DerivationAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1088:1: ( ( 'derivation' ) )
            // InternalOntoUML.g:1089:1: ( 'derivation' )
            {
            // InternalOntoUML.g:1089:1: ( 'derivation' )
            // InternalOntoUML.g:1090:2: 'derivation'
            {
             before(grammarAccess.getDerivationAssociationAccess().getDerivationKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalOntoUML.g:1099:1: rule__DerivationAssociation__Group__1 : rule__DerivationAssociation__Group__1__Impl rule__DerivationAssociation__Group__2 ;
    public final void rule__DerivationAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1103:1: ( rule__DerivationAssociation__Group__1__Impl rule__DerivationAssociation__Group__2 )
            // InternalOntoUML.g:1104:2: rule__DerivationAssociation__Group__1__Impl rule__DerivationAssociation__Group__2
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
    // InternalOntoUML.g:1111:1: rule__DerivationAssociation__Group__1__Impl : ( ( rule__DerivationAssociation__NameAssignment_1 ) ) ;
    public final void rule__DerivationAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1115:1: ( ( ( rule__DerivationAssociation__NameAssignment_1 ) ) )
            // InternalOntoUML.g:1116:1: ( ( rule__DerivationAssociation__NameAssignment_1 ) )
            {
            // InternalOntoUML.g:1116:1: ( ( rule__DerivationAssociation__NameAssignment_1 ) )
            // InternalOntoUML.g:1117:2: ( rule__DerivationAssociation__NameAssignment_1 )
            {
             before(grammarAccess.getDerivationAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUML.g:1118:2: ( rule__DerivationAssociation__NameAssignment_1 )
            // InternalOntoUML.g:1118:3: rule__DerivationAssociation__NameAssignment_1
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
    // InternalOntoUML.g:1126:1: rule__DerivationAssociation__Group__2 : rule__DerivationAssociation__Group__2__Impl rule__DerivationAssociation__Group__3 ;
    public final void rule__DerivationAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1130:1: ( rule__DerivationAssociation__Group__2__Impl rule__DerivationAssociation__Group__3 )
            // InternalOntoUML.g:1131:2: rule__DerivationAssociation__Group__2__Impl rule__DerivationAssociation__Group__3
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
    // InternalOntoUML.g:1138:1: rule__DerivationAssociation__Group__2__Impl : ( ( rule__DerivationAssociation__Group_2__0 )? ) ;
    public final void rule__DerivationAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1142:1: ( ( ( rule__DerivationAssociation__Group_2__0 )? ) )
            // InternalOntoUML.g:1143:1: ( ( rule__DerivationAssociation__Group_2__0 )? )
            {
            // InternalOntoUML.g:1143:1: ( ( rule__DerivationAssociation__Group_2__0 )? )
            // InternalOntoUML.g:1144:2: ( rule__DerivationAssociation__Group_2__0 )?
            {
             before(grammarAccess.getDerivationAssociationAccess().getGroup_2()); 
            // InternalOntoUML.g:1145:2: ( rule__DerivationAssociation__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntoUML.g:1145:3: rule__DerivationAssociation__Group_2__0
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
    // InternalOntoUML.g:1153:1: rule__DerivationAssociation__Group__3 : rule__DerivationAssociation__Group__3__Impl ;
    public final void rule__DerivationAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1157:1: ( rule__DerivationAssociation__Group__3__Impl )
            // InternalOntoUML.g:1158:2: rule__DerivationAssociation__Group__3__Impl
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
    // InternalOntoUML.g:1164:1: rule__DerivationAssociation__Group__3__Impl : ( ( rule__DerivationAssociation__UnorderedGroup_3 ) ) ;
    public final void rule__DerivationAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1168:1: ( ( ( rule__DerivationAssociation__UnorderedGroup_3 ) ) )
            // InternalOntoUML.g:1169:1: ( ( rule__DerivationAssociation__UnorderedGroup_3 ) )
            {
            // InternalOntoUML.g:1169:1: ( ( rule__DerivationAssociation__UnorderedGroup_3 ) )
            // InternalOntoUML.g:1170:2: ( rule__DerivationAssociation__UnorderedGroup_3 )
            {
             before(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3()); 
            // InternalOntoUML.g:1171:2: ( rule__DerivationAssociation__UnorderedGroup_3 )
            // InternalOntoUML.g:1171:3: rule__DerivationAssociation__UnorderedGroup_3
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
    // InternalOntoUML.g:1180:1: rule__DerivationAssociation__Group_2__0 : rule__DerivationAssociation__Group_2__0__Impl rule__DerivationAssociation__Group_2__1 ;
    public final void rule__DerivationAssociation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1184:1: ( rule__DerivationAssociation__Group_2__0__Impl rule__DerivationAssociation__Group_2__1 )
            // InternalOntoUML.g:1185:2: rule__DerivationAssociation__Group_2__0__Impl rule__DerivationAssociation__Group_2__1
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
    // InternalOntoUML.g:1192:1: rule__DerivationAssociation__Group_2__0__Impl : ( 'aka' ) ;
    public final void rule__DerivationAssociation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1196:1: ( ( 'aka' ) )
            // InternalOntoUML.g:1197:1: ( 'aka' )
            {
            // InternalOntoUML.g:1197:1: ( 'aka' )
            // InternalOntoUML.g:1198:2: 'aka'
            {
             before(grammarAccess.getDerivationAssociationAccess().getAkaKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalOntoUML.g:1207:1: rule__DerivationAssociation__Group_2__1 : rule__DerivationAssociation__Group_2__1__Impl ;
    public final void rule__DerivationAssociation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1211:1: ( rule__DerivationAssociation__Group_2__1__Impl )
            // InternalOntoUML.g:1212:2: rule__DerivationAssociation__Group_2__1__Impl
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
    // InternalOntoUML.g:1218:1: rule__DerivationAssociation__Group_2__1__Impl : ( ( rule__DerivationAssociation__AliasAssignment_2_1 ) ) ;
    public final void rule__DerivationAssociation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1222:1: ( ( ( rule__DerivationAssociation__AliasAssignment_2_1 ) ) )
            // InternalOntoUML.g:1223:1: ( ( rule__DerivationAssociation__AliasAssignment_2_1 ) )
            {
            // InternalOntoUML.g:1223:1: ( ( rule__DerivationAssociation__AliasAssignment_2_1 ) )
            // InternalOntoUML.g:1224:2: ( rule__DerivationAssociation__AliasAssignment_2_1 )
            {
             before(grammarAccess.getDerivationAssociationAccess().getAliasAssignment_2_1()); 
            // InternalOntoUML.g:1225:2: ( rule__DerivationAssociation__AliasAssignment_2_1 )
            // InternalOntoUML.g:1225:3: rule__DerivationAssociation__AliasAssignment_2_1
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
    // InternalOntoUML.g:1234:1: rule__DerivationAssociation__Group_3_0__0 : rule__DerivationAssociation__Group_3_0__0__Impl rule__DerivationAssociation__Group_3_0__1 ;
    public final void rule__DerivationAssociation__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1238:1: ( rule__DerivationAssociation__Group_3_0__0__Impl rule__DerivationAssociation__Group_3_0__1 )
            // InternalOntoUML.g:1239:2: rule__DerivationAssociation__Group_3_0__0__Impl rule__DerivationAssociation__Group_3_0__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalOntoUML.g:1246:1: rule__DerivationAssociation__Group_3_0__0__Impl : ( ( rule__DerivationAssociation__SourceEndAssignment_3_0_0 ) ) ;
    public final void rule__DerivationAssociation__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1250:1: ( ( ( rule__DerivationAssociation__SourceEndAssignment_3_0_0 ) ) )
            // InternalOntoUML.g:1251:1: ( ( rule__DerivationAssociation__SourceEndAssignment_3_0_0 ) )
            {
            // InternalOntoUML.g:1251:1: ( ( rule__DerivationAssociation__SourceEndAssignment_3_0_0 ) )
            // InternalOntoUML.g:1252:2: ( rule__DerivationAssociation__SourceEndAssignment_3_0_0 )
            {
             before(grammarAccess.getDerivationAssociationAccess().getSourceEndAssignment_3_0_0()); 
            // InternalOntoUML.g:1253:2: ( rule__DerivationAssociation__SourceEndAssignment_3_0_0 )
            // InternalOntoUML.g:1253:3: rule__DerivationAssociation__SourceEndAssignment_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__SourceEndAssignment_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDerivationAssociationAccess().getSourceEndAssignment_3_0_0()); 

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
    // InternalOntoUML.g:1261:1: rule__DerivationAssociation__Group_3_0__1 : rule__DerivationAssociation__Group_3_0__1__Impl ;
    public final void rule__DerivationAssociation__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1265:1: ( rule__DerivationAssociation__Group_3_0__1__Impl )
            // InternalOntoUML.g:1266:2: rule__DerivationAssociation__Group_3_0__1__Impl
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
    // InternalOntoUML.g:1272:1: rule__DerivationAssociation__Group_3_0__1__Impl : ( ( rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1 ) ) ;
    public final void rule__DerivationAssociation__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1276:1: ( ( ( rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1 ) ) )
            // InternalOntoUML.g:1277:1: ( ( rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1 ) )
            {
            // InternalOntoUML.g:1277:1: ( ( rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1 ) )
            // InternalOntoUML.g:1278:2: ( rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1 )
            {
             before(grammarAccess.getDerivationAssociationAccess().getDerivingAssociationAssignment_3_0_1()); 
            // InternalOntoUML.g:1279:2: ( rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1 )
            // InternalOntoUML.g:1279:3: rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1
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
    // InternalOntoUML.g:1288:1: rule__DerivationAssociation__Group_3_1__0 : rule__DerivationAssociation__Group_3_1__0__Impl rule__DerivationAssociation__Group_3_1__1 ;
    public final void rule__DerivationAssociation__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1292:1: ( rule__DerivationAssociation__Group_3_1__0__Impl rule__DerivationAssociation__Group_3_1__1 )
            // InternalOntoUML.g:1293:2: rule__DerivationAssociation__Group_3_1__0__Impl rule__DerivationAssociation__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalOntoUML.g:1300:1: rule__DerivationAssociation__Group_3_1__0__Impl : ( ( rule__DerivationAssociation__TargetEndAssignment_3_1_0 ) ) ;
    public final void rule__DerivationAssociation__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1304:1: ( ( ( rule__DerivationAssociation__TargetEndAssignment_3_1_0 ) ) )
            // InternalOntoUML.g:1305:1: ( ( rule__DerivationAssociation__TargetEndAssignment_3_1_0 ) )
            {
            // InternalOntoUML.g:1305:1: ( ( rule__DerivationAssociation__TargetEndAssignment_3_1_0 ) )
            // InternalOntoUML.g:1306:2: ( rule__DerivationAssociation__TargetEndAssignment_3_1_0 )
            {
             before(grammarAccess.getDerivationAssociationAccess().getTargetEndAssignment_3_1_0()); 
            // InternalOntoUML.g:1307:2: ( rule__DerivationAssociation__TargetEndAssignment_3_1_0 )
            // InternalOntoUML.g:1307:3: rule__DerivationAssociation__TargetEndAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DerivationAssociation__TargetEndAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDerivationAssociationAccess().getTargetEndAssignment_3_1_0()); 

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
    // InternalOntoUML.g:1315:1: rule__DerivationAssociation__Group_3_1__1 : rule__DerivationAssociation__Group_3_1__1__Impl ;
    public final void rule__DerivationAssociation__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1319:1: ( rule__DerivationAssociation__Group_3_1__1__Impl )
            // InternalOntoUML.g:1320:2: rule__DerivationAssociation__Group_3_1__1__Impl
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
    // InternalOntoUML.g:1326:1: rule__DerivationAssociation__Group_3_1__1__Impl : ( ( rule__DerivationAssociation__DerivedClassAssignment_3_1_1 ) ) ;
    public final void rule__DerivationAssociation__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1330:1: ( ( ( rule__DerivationAssociation__DerivedClassAssignment_3_1_1 ) ) )
            // InternalOntoUML.g:1331:1: ( ( rule__DerivationAssociation__DerivedClassAssignment_3_1_1 ) )
            {
            // InternalOntoUML.g:1331:1: ( ( rule__DerivationAssociation__DerivedClassAssignment_3_1_1 ) )
            // InternalOntoUML.g:1332:2: ( rule__DerivationAssociation__DerivedClassAssignment_3_1_1 )
            {
             before(grammarAccess.getDerivationAssociationAccess().getDerivedClassAssignment_3_1_1()); 
            // InternalOntoUML.g:1333:2: ( rule__DerivationAssociation__DerivedClassAssignment_3_1_1 )
            // InternalOntoUML.g:1333:3: rule__DerivationAssociation__DerivedClassAssignment_3_1_1
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


    // $ANTLR start "rule__AssociationEnd__Group__0"
    // InternalOntoUML.g:1342:1: rule__AssociationEnd__Group__0 : rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 ;
    public final void rule__AssociationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1346:1: ( rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 )
            // InternalOntoUML.g:1347:2: rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__AssociationEnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__1();

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
    // $ANTLR end "rule__AssociationEnd__Group__0"


    // $ANTLR start "rule__AssociationEnd__Group__0__Impl"
    // InternalOntoUML.g:1354:1: rule__AssociationEnd__Group__0__Impl : ( () ) ;
    public final void rule__AssociationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1358:1: ( ( () ) )
            // InternalOntoUML.g:1359:1: ( () )
            {
            // InternalOntoUML.g:1359:1: ( () )
            // InternalOntoUML.g:1360:2: ()
            {
             before(grammarAccess.getAssociationEndAccess().getAssociationEndAction_0()); 
            // InternalOntoUML.g:1361:2: ()
            // InternalOntoUML.g:1361:3: 
            {
            }

             after(grammarAccess.getAssociationEndAccess().getAssociationEndAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__0__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__1"
    // InternalOntoUML.g:1369:1: rule__AssociationEnd__Group__1 : rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 ;
    public final void rule__AssociationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1373:1: ( rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 )
            // InternalOntoUML.g:1374:2: rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__AssociationEnd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__2();

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
    // $ANTLR end "rule__AssociationEnd__Group__1"


    // $ANTLR start "rule__AssociationEnd__Group__1__Impl"
    // InternalOntoUML.g:1381:1: rule__AssociationEnd__Group__1__Impl : ( ( rule__AssociationEnd__AggregationKindAssignment_1 )? ) ;
    public final void rule__AssociationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1385:1: ( ( ( rule__AssociationEnd__AggregationKindAssignment_1 )? ) )
            // InternalOntoUML.g:1386:1: ( ( rule__AssociationEnd__AggregationKindAssignment_1 )? )
            {
            // InternalOntoUML.g:1386:1: ( ( rule__AssociationEnd__AggregationKindAssignment_1 )? )
            // InternalOntoUML.g:1387:2: ( rule__AssociationEnd__AggregationKindAssignment_1 )?
            {
             before(grammarAccess.getAssociationEndAccess().getAggregationKindAssignment_1()); 
            // InternalOntoUML.g:1388:2: ( rule__AssociationEnd__AggregationKindAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=31 && LA12_0<=33)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntoUML.g:1388:3: rule__AssociationEnd__AggregationKindAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationEnd__AggregationKindAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationEndAccess().getAggregationKindAssignment_1()); 

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
    // $ANTLR end "rule__AssociationEnd__Group__1__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__2"
    // InternalOntoUML.g:1396:1: rule__AssociationEnd__Group__2 : rule__AssociationEnd__Group__2__Impl ;
    public final void rule__AssociationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1400:1: ( rule__AssociationEnd__Group__2__Impl )
            // InternalOntoUML.g:1401:2: rule__AssociationEnd__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__2__Impl();

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
    // $ANTLR end "rule__AssociationEnd__Group__2"


    // $ANTLR start "rule__AssociationEnd__Group__2__Impl"
    // InternalOntoUML.g:1407:1: rule__AssociationEnd__Group__2__Impl : ( ( rule__AssociationEnd__Group_2__0 )? ) ;
    public final void rule__AssociationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1411:1: ( ( ( rule__AssociationEnd__Group_2__0 )? ) )
            // InternalOntoUML.g:1412:1: ( ( rule__AssociationEnd__Group_2__0 )? )
            {
            // InternalOntoUML.g:1412:1: ( ( rule__AssociationEnd__Group_2__0 )? )
            // InternalOntoUML.g:1413:2: ( rule__AssociationEnd__Group_2__0 )?
            {
             before(grammarAccess.getAssociationEndAccess().getGroup_2()); 
            // InternalOntoUML.g:1414:2: ( rule__AssociationEnd__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOntoUML.g:1414:3: rule__AssociationEnd__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationEnd__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationEndAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AssociationEnd__Group__2__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_2__0"
    // InternalOntoUML.g:1423:1: rule__AssociationEnd__Group_2__0 : rule__AssociationEnd__Group_2__0__Impl rule__AssociationEnd__Group_2__1 ;
    public final void rule__AssociationEnd__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1427:1: ( rule__AssociationEnd__Group_2__0__Impl rule__AssociationEnd__Group_2__1 )
            // InternalOntoUML.g:1428:2: rule__AssociationEnd__Group_2__0__Impl rule__AssociationEnd__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__AssociationEnd__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_2__1();

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
    // $ANTLR end "rule__AssociationEnd__Group_2__0"


    // $ANTLR start "rule__AssociationEnd__Group_2__0__Impl"
    // InternalOntoUML.g:1435:1: rule__AssociationEnd__Group_2__0__Impl : ( '[' ) ;
    public final void rule__AssociationEnd__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1439:1: ( ( '[' ) )
            // InternalOntoUML.g:1440:1: ( '[' )
            {
            // InternalOntoUML.g:1440:1: ( '[' )
            // InternalOntoUML.g:1441:2: '['
            {
             before(grammarAccess.getAssociationEndAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getLeftSquareBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_2__0__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_2__1"
    // InternalOntoUML.g:1450:1: rule__AssociationEnd__Group_2__1 : rule__AssociationEnd__Group_2__1__Impl rule__AssociationEnd__Group_2__2 ;
    public final void rule__AssociationEnd__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1454:1: ( rule__AssociationEnd__Group_2__1__Impl rule__AssociationEnd__Group_2__2 )
            // InternalOntoUML.g:1455:2: rule__AssociationEnd__Group_2__1__Impl rule__AssociationEnd__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__AssociationEnd__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_2__2();

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
    // $ANTLR end "rule__AssociationEnd__Group_2__1"


    // $ANTLR start "rule__AssociationEnd__Group_2__1__Impl"
    // InternalOntoUML.g:1462:1: rule__AssociationEnd__Group_2__1__Impl : ( ( rule__AssociationEnd__LowerBoundAssignment_2_1 ) ) ;
    public final void rule__AssociationEnd__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1466:1: ( ( ( rule__AssociationEnd__LowerBoundAssignment_2_1 ) ) )
            // InternalOntoUML.g:1467:1: ( ( rule__AssociationEnd__LowerBoundAssignment_2_1 ) )
            {
            // InternalOntoUML.g:1467:1: ( ( rule__AssociationEnd__LowerBoundAssignment_2_1 ) )
            // InternalOntoUML.g:1468:2: ( rule__AssociationEnd__LowerBoundAssignment_2_1 )
            {
             before(grammarAccess.getAssociationEndAccess().getLowerBoundAssignment_2_1()); 
            // InternalOntoUML.g:1469:2: ( rule__AssociationEnd__LowerBoundAssignment_2_1 )
            // InternalOntoUML.g:1469:3: rule__AssociationEnd__LowerBoundAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__LowerBoundAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getLowerBoundAssignment_2_1()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_2__1__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_2__2"
    // InternalOntoUML.g:1477:1: rule__AssociationEnd__Group_2__2 : rule__AssociationEnd__Group_2__2__Impl rule__AssociationEnd__Group_2__3 ;
    public final void rule__AssociationEnd__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1481:1: ( rule__AssociationEnd__Group_2__2__Impl rule__AssociationEnd__Group_2__3 )
            // InternalOntoUML.g:1482:2: rule__AssociationEnd__Group_2__2__Impl rule__AssociationEnd__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__AssociationEnd__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_2__3();

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
    // $ANTLR end "rule__AssociationEnd__Group_2__2"


    // $ANTLR start "rule__AssociationEnd__Group_2__2__Impl"
    // InternalOntoUML.g:1489:1: rule__AssociationEnd__Group_2__2__Impl : ( '..' ) ;
    public final void rule__AssociationEnd__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1493:1: ( ( '..' ) )
            // InternalOntoUML.g:1494:1: ( '..' )
            {
            // InternalOntoUML.g:1494:1: ( '..' )
            // InternalOntoUML.g:1495:2: '..'
            {
             before(grammarAccess.getAssociationEndAccess().getFullStopFullStopKeyword_2_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getFullStopFullStopKeyword_2_2()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_2__2__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_2__3"
    // InternalOntoUML.g:1504:1: rule__AssociationEnd__Group_2__3 : rule__AssociationEnd__Group_2__3__Impl rule__AssociationEnd__Group_2__4 ;
    public final void rule__AssociationEnd__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1508:1: ( rule__AssociationEnd__Group_2__3__Impl rule__AssociationEnd__Group_2__4 )
            // InternalOntoUML.g:1509:2: rule__AssociationEnd__Group_2__3__Impl rule__AssociationEnd__Group_2__4
            {
            pushFollow(FOLLOW_11);
            rule__AssociationEnd__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_2__4();

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
    // $ANTLR end "rule__AssociationEnd__Group_2__3"


    // $ANTLR start "rule__AssociationEnd__Group_2__3__Impl"
    // InternalOntoUML.g:1516:1: rule__AssociationEnd__Group_2__3__Impl : ( ( rule__AssociationEnd__UpperBoundAssignment_2_3 ) ) ;
    public final void rule__AssociationEnd__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1520:1: ( ( ( rule__AssociationEnd__UpperBoundAssignment_2_3 ) ) )
            // InternalOntoUML.g:1521:1: ( ( rule__AssociationEnd__UpperBoundAssignment_2_3 ) )
            {
            // InternalOntoUML.g:1521:1: ( ( rule__AssociationEnd__UpperBoundAssignment_2_3 ) )
            // InternalOntoUML.g:1522:2: ( rule__AssociationEnd__UpperBoundAssignment_2_3 )
            {
             before(grammarAccess.getAssociationEndAccess().getUpperBoundAssignment_2_3()); 
            // InternalOntoUML.g:1523:2: ( rule__AssociationEnd__UpperBoundAssignment_2_3 )
            // InternalOntoUML.g:1523:3: rule__AssociationEnd__UpperBoundAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__UpperBoundAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getUpperBoundAssignment_2_3()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_2__3__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_2__4"
    // InternalOntoUML.g:1531:1: rule__AssociationEnd__Group_2__4 : rule__AssociationEnd__Group_2__4__Impl ;
    public final void rule__AssociationEnd__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1535:1: ( rule__AssociationEnd__Group_2__4__Impl )
            // InternalOntoUML.g:1536:2: rule__AssociationEnd__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_2__4__Impl();

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
    // $ANTLR end "rule__AssociationEnd__Group_2__4"


    // $ANTLR start "rule__AssociationEnd__Group_2__4__Impl"
    // InternalOntoUML.g:1542:1: rule__AssociationEnd__Group_2__4__Impl : ( ']' ) ;
    public final void rule__AssociationEnd__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1546:1: ( ( ']' ) )
            // InternalOntoUML.g:1547:1: ( ']' )
            {
            // InternalOntoUML.g:1547:1: ( ']' )
            // InternalOntoUML.g:1548:2: ']'
            {
             before(grammarAccess.getAssociationEndAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getRightSquareBracketKeyword_2_4()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_2__4__Impl"


    // $ANTLR start "rule__Generalization__Group__0"
    // InternalOntoUML.g:1558:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1562:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalOntoUML.g:1563:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
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
    // InternalOntoUML.g:1570:1: rule__Generalization__Group__0__Impl : ( 'generalization' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1574:1: ( ( 'generalization' ) )
            // InternalOntoUML.g:1575:1: ( 'generalization' )
            {
            // InternalOntoUML.g:1575:1: ( 'generalization' )
            // InternalOntoUML.g:1576:2: 'generalization'
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralizationKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalOntoUML.g:1585:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1589:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalOntoUML.g:1590:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalOntoUML.g:1597:1: rule__Generalization__Group__1__Impl : ( ( rule__Generalization__NameAssignment_1 ) ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1601:1: ( ( ( rule__Generalization__NameAssignment_1 ) ) )
            // InternalOntoUML.g:1602:1: ( ( rule__Generalization__NameAssignment_1 ) )
            {
            // InternalOntoUML.g:1602:1: ( ( rule__Generalization__NameAssignment_1 ) )
            // InternalOntoUML.g:1603:2: ( rule__Generalization__NameAssignment_1 )
            {
             before(grammarAccess.getGeneralizationAccess().getNameAssignment_1()); 
            // InternalOntoUML.g:1604:2: ( rule__Generalization__NameAssignment_1 )
            // InternalOntoUML.g:1604:3: rule__Generalization__NameAssignment_1
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
    // InternalOntoUML.g:1612:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl rule__Generalization__Group__3 ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1616:1: ( rule__Generalization__Group__2__Impl rule__Generalization__Group__3 )
            // InternalOntoUML.g:1617:2: rule__Generalization__Group__2__Impl rule__Generalization__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalOntoUML.g:1624:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__Group_2__0 )? ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1628:1: ( ( ( rule__Generalization__Group_2__0 )? ) )
            // InternalOntoUML.g:1629:1: ( ( rule__Generalization__Group_2__0 )? )
            {
            // InternalOntoUML.g:1629:1: ( ( rule__Generalization__Group_2__0 )? )
            // InternalOntoUML.g:1630:2: ( rule__Generalization__Group_2__0 )?
            {
             before(grammarAccess.getGeneralizationAccess().getGroup_2()); 
            // InternalOntoUML.g:1631:2: ( rule__Generalization__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOntoUML.g:1631:3: rule__Generalization__Group_2__0
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
    // InternalOntoUML.g:1639:1: rule__Generalization__Group__3 : rule__Generalization__Group__3__Impl rule__Generalization__Group__4 ;
    public final void rule__Generalization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1643:1: ( rule__Generalization__Group__3__Impl rule__Generalization__Group__4 )
            // InternalOntoUML.g:1644:2: rule__Generalization__Group__3__Impl rule__Generalization__Group__4
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
    // InternalOntoUML.g:1651:1: rule__Generalization__Group__3__Impl : ( ( rule__Generalization__GenericAssignment_3 ) ) ;
    public final void rule__Generalization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1655:1: ( ( ( rule__Generalization__GenericAssignment_3 ) ) )
            // InternalOntoUML.g:1656:1: ( ( rule__Generalization__GenericAssignment_3 ) )
            {
            // InternalOntoUML.g:1656:1: ( ( rule__Generalization__GenericAssignment_3 ) )
            // InternalOntoUML.g:1657:2: ( rule__Generalization__GenericAssignment_3 )
            {
             before(grammarAccess.getGeneralizationAccess().getGenericAssignment_3()); 
            // InternalOntoUML.g:1658:2: ( rule__Generalization__GenericAssignment_3 )
            // InternalOntoUML.g:1658:3: rule__Generalization__GenericAssignment_3
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
    // InternalOntoUML.g:1666:1: rule__Generalization__Group__4 : rule__Generalization__Group__4__Impl ;
    public final void rule__Generalization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1670:1: ( rule__Generalization__Group__4__Impl )
            // InternalOntoUML.g:1671:2: rule__Generalization__Group__4__Impl
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
    // InternalOntoUML.g:1677:1: rule__Generalization__Group__4__Impl : ( ( rule__Generalization__SpecificAssignment_4 ) ) ;
    public final void rule__Generalization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1681:1: ( ( ( rule__Generalization__SpecificAssignment_4 ) ) )
            // InternalOntoUML.g:1682:1: ( ( rule__Generalization__SpecificAssignment_4 ) )
            {
            // InternalOntoUML.g:1682:1: ( ( rule__Generalization__SpecificAssignment_4 ) )
            // InternalOntoUML.g:1683:2: ( rule__Generalization__SpecificAssignment_4 )
            {
             before(grammarAccess.getGeneralizationAccess().getSpecificAssignment_4()); 
            // InternalOntoUML.g:1684:2: ( rule__Generalization__SpecificAssignment_4 )
            // InternalOntoUML.g:1684:3: rule__Generalization__SpecificAssignment_4
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
    // InternalOntoUML.g:1693:1: rule__Generalization__Group_2__0 : rule__Generalization__Group_2__0__Impl rule__Generalization__Group_2__1 ;
    public final void rule__Generalization__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1697:1: ( rule__Generalization__Group_2__0__Impl rule__Generalization__Group_2__1 )
            // InternalOntoUML.g:1698:2: rule__Generalization__Group_2__0__Impl rule__Generalization__Group_2__1
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
    // InternalOntoUML.g:1705:1: rule__Generalization__Group_2__0__Impl : ( 'aka' ) ;
    public final void rule__Generalization__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1709:1: ( ( 'aka' ) )
            // InternalOntoUML.g:1710:1: ( 'aka' )
            {
            // InternalOntoUML.g:1710:1: ( 'aka' )
            // InternalOntoUML.g:1711:2: 'aka'
            {
             before(grammarAccess.getGeneralizationAccess().getAkaKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalOntoUML.g:1720:1: rule__Generalization__Group_2__1 : rule__Generalization__Group_2__1__Impl ;
    public final void rule__Generalization__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1724:1: ( rule__Generalization__Group_2__1__Impl )
            // InternalOntoUML.g:1725:2: rule__Generalization__Group_2__1__Impl
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
    // InternalOntoUML.g:1731:1: rule__Generalization__Group_2__1__Impl : ( ( rule__Generalization__AliasAssignment_2_1 ) ) ;
    public final void rule__Generalization__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1735:1: ( ( ( rule__Generalization__AliasAssignment_2_1 ) ) )
            // InternalOntoUML.g:1736:1: ( ( rule__Generalization__AliasAssignment_2_1 ) )
            {
            // InternalOntoUML.g:1736:1: ( ( rule__Generalization__AliasAssignment_2_1 ) )
            // InternalOntoUML.g:1737:2: ( rule__Generalization__AliasAssignment_2_1 )
            {
             before(grammarAccess.getGeneralizationAccess().getAliasAssignment_2_1()); 
            // InternalOntoUML.g:1738:2: ( rule__Generalization__AliasAssignment_2_1 )
            // InternalOntoUML.g:1738:3: rule__Generalization__AliasAssignment_2_1
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
    // InternalOntoUML.g:1747:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1751:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoUML.g:1752:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalOntoUML.g:1759:1: rule__GeneralizationSet__Group__0__Impl : ( ( rule__GeneralizationSet__UnorderedGroup_0 ) ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1763:1: ( ( ( rule__GeneralizationSet__UnorderedGroup_0 ) ) )
            // InternalOntoUML.g:1764:1: ( ( rule__GeneralizationSet__UnorderedGroup_0 ) )
            {
            // InternalOntoUML.g:1764:1: ( ( rule__GeneralizationSet__UnorderedGroup_0 ) )
            // InternalOntoUML.g:1765:2: ( rule__GeneralizationSet__UnorderedGroup_0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0()); 
            // InternalOntoUML.g:1766:2: ( rule__GeneralizationSet__UnorderedGroup_0 )
            // InternalOntoUML.g:1766:3: rule__GeneralizationSet__UnorderedGroup_0
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
    // InternalOntoUML.g:1774:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1778:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoUML.g:1779:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
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
    // InternalOntoUML.g:1786:1: rule__GeneralizationSet__Group__1__Impl : ( 'generalizationset' ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1790:1: ( ( 'generalizationset' ) )
            // InternalOntoUML.g:1791:1: ( 'generalizationset' )
            {
            // InternalOntoUML.g:1791:1: ( 'generalizationset' )
            // InternalOntoUML.g:1792:2: 'generalizationset'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsetKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalOntoUML.g:1801:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1805:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoUML.g:1806:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoUML.g:1813:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 ) ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1817:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 ) ) )
            // InternalOntoUML.g:1818:1: ( ( rule__GeneralizationSet__NameAssignment_2 ) )
            {
            // InternalOntoUML.g:1818:1: ( ( rule__GeneralizationSet__NameAssignment_2 ) )
            // InternalOntoUML.g:1819:2: ( rule__GeneralizationSet__NameAssignment_2 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalOntoUML.g:1820:2: ( rule__GeneralizationSet__NameAssignment_2 )
            // InternalOntoUML.g:1820:3: rule__GeneralizationSet__NameAssignment_2
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
    // InternalOntoUML.g:1828:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1832:1: ( rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 )
            // InternalOntoUML.g:1833:2: rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoUML.g:1840:1: rule__GeneralizationSet__Group__3__Impl : ( ( rule__GeneralizationSet__Group_3__0 )? ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1844:1: ( ( ( rule__GeneralizationSet__Group_3__0 )? ) )
            // InternalOntoUML.g:1845:1: ( ( rule__GeneralizationSet__Group_3__0 )? )
            {
            // InternalOntoUML.g:1845:1: ( ( rule__GeneralizationSet__Group_3__0 )? )
            // InternalOntoUML.g:1846:2: ( rule__GeneralizationSet__Group_3__0 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_3()); 
            // InternalOntoUML.g:1847:2: ( rule__GeneralizationSet__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntoUML.g:1847:3: rule__GeneralizationSet__Group_3__0
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
    // InternalOntoUML.g:1855:1: rule__GeneralizationSet__Group__4 : rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 ;
    public final void rule__GeneralizationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1859:1: ( rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 )
            // InternalOntoUML.g:1860:2: rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalOntoUML.g:1867:1: rule__GeneralizationSet__Group__4__Impl : ( '{' ) ;
    public final void rule__GeneralizationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1871:1: ( ( '{' ) )
            // InternalOntoUML.g:1872:1: ( '{' )
            {
            // InternalOntoUML.g:1872:1: ( '{' )
            // InternalOntoUML.g:1873:2: '{'
            {
             before(grammarAccess.getGeneralizationSetAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalOntoUML.g:1882:1: rule__GeneralizationSet__Group__5 : rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 ;
    public final void rule__GeneralizationSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1886:1: ( rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 )
            // InternalOntoUML.g:1887:2: rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalOntoUML.g:1894:1: rule__GeneralizationSet__Group__5__Impl : ( ( rule__GeneralizationSet__GeneralizationsAssignment_5 )* ) ;
    public final void rule__GeneralizationSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1898:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_5 )* ) )
            // InternalOntoUML.g:1899:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_5 )* )
            {
            // InternalOntoUML.g:1899:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_5 )* )
            // InternalOntoUML.g:1900:2: ( rule__GeneralizationSet__GeneralizationsAssignment_5 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_5()); 
            // InternalOntoUML.g:1901:2: ( rule__GeneralizationSet__GeneralizationsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOntoUML.g:1901:3: rule__GeneralizationSet__GeneralizationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__GeneralizationSet__GeneralizationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalOntoUML.g:1909:1: rule__GeneralizationSet__Group__6 : rule__GeneralizationSet__Group__6__Impl ;
    public final void rule__GeneralizationSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1913:1: ( rule__GeneralizationSet__Group__6__Impl )
            // InternalOntoUML.g:1914:2: rule__GeneralizationSet__Group__6__Impl
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
    // InternalOntoUML.g:1920:1: rule__GeneralizationSet__Group__6__Impl : ( '}' ) ;
    public final void rule__GeneralizationSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1924:1: ( ( '}' ) )
            // InternalOntoUML.g:1925:1: ( '}' )
            {
            // InternalOntoUML.g:1925:1: ( '}' )
            // InternalOntoUML.g:1926:2: '}'
            {
             before(grammarAccess.getGeneralizationSetAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_2); 
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
    // InternalOntoUML.g:1936:1: rule__GeneralizationSet__Group_3__0 : rule__GeneralizationSet__Group_3__0__Impl rule__GeneralizationSet__Group_3__1 ;
    public final void rule__GeneralizationSet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1940:1: ( rule__GeneralizationSet__Group_3__0__Impl rule__GeneralizationSet__Group_3__1 )
            // InternalOntoUML.g:1941:2: rule__GeneralizationSet__Group_3__0__Impl rule__GeneralizationSet__Group_3__1
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
    // InternalOntoUML.g:1948:1: rule__GeneralizationSet__Group_3__0__Impl : ( 'aka' ) ;
    public final void rule__GeneralizationSet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1952:1: ( ( 'aka' ) )
            // InternalOntoUML.g:1953:1: ( 'aka' )
            {
            // InternalOntoUML.g:1953:1: ( 'aka' )
            // InternalOntoUML.g:1954:2: 'aka'
            {
             before(grammarAccess.getGeneralizationSetAccess().getAkaKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalOntoUML.g:1963:1: rule__GeneralizationSet__Group_3__1 : rule__GeneralizationSet__Group_3__1__Impl ;
    public final void rule__GeneralizationSet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1967:1: ( rule__GeneralizationSet__Group_3__1__Impl )
            // InternalOntoUML.g:1968:2: rule__GeneralizationSet__Group_3__1__Impl
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
    // InternalOntoUML.g:1974:1: rule__GeneralizationSet__Group_3__1__Impl : ( ( rule__GeneralizationSet__AliasAssignment_3_1 ) ) ;
    public final void rule__GeneralizationSet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1978:1: ( ( ( rule__GeneralizationSet__AliasAssignment_3_1 ) ) )
            // InternalOntoUML.g:1979:1: ( ( rule__GeneralizationSet__AliasAssignment_3_1 ) )
            {
            // InternalOntoUML.g:1979:1: ( ( rule__GeneralizationSet__AliasAssignment_3_1 ) )
            // InternalOntoUML.g:1980:2: ( rule__GeneralizationSet__AliasAssignment_3_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getAliasAssignment_3_1()); 
            // InternalOntoUML.g:1981:2: ( rule__GeneralizationSet__AliasAssignment_3_1 )
            // InternalOntoUML.g:1981:3: rule__GeneralizationSet__AliasAssignment_3_1
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
    // InternalOntoUML.g:1990:1: rule__DerivationAssociation__UnorderedGroup_3 : rule__DerivationAssociation__UnorderedGroup_3__0 {...}?;
    public final void rule__DerivationAssociation__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3());
        	
        try {
            // InternalOntoUML.g:1995:1: ( rule__DerivationAssociation__UnorderedGroup_3__0 {...}?)
            // InternalOntoUML.g:1996:2: rule__DerivationAssociation__UnorderedGroup_3__0 {...}?
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
    // InternalOntoUML.g:2004:1: rule__DerivationAssociation__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__DerivationAssociation__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalOntoUML.g:2009:1: ( ( ({...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) ) ) ) )
            // InternalOntoUML.g:2010:3: ( ({...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) ) ) )
            {
            // InternalOntoUML.g:2010:3: ( ({...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) ) ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalOntoUML.g:2011:3: ({...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) ) )
                    {
                    // InternalOntoUML.g:2011:3: ({...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) ) )
                    // InternalOntoUML.g:2012:4: {...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__DerivationAssociation__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalOntoUML.g:2012:117: ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) )
                    // InternalOntoUML.g:2013:5: ( ( rule__DerivationAssociation__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalOntoUML.g:2019:5: ( ( rule__DerivationAssociation__Group_3_0__0 ) )
                    // InternalOntoUML.g:2020:6: ( rule__DerivationAssociation__Group_3_0__0 )
                    {
                     before(grammarAccess.getDerivationAssociationAccess().getGroup_3_0()); 
                    // InternalOntoUML.g:2021:6: ( rule__DerivationAssociation__Group_3_0__0 )
                    // InternalOntoUML.g:2021:7: rule__DerivationAssociation__Group_3_0__0
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
                    // InternalOntoUML.g:2026:3: ({...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) ) )
                    {
                    // InternalOntoUML.g:2026:3: ({...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) ) )
                    // InternalOntoUML.g:2027:4: {...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__DerivationAssociation__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalOntoUML.g:2027:117: ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) )
                    // InternalOntoUML.g:2028:5: ( ( rule__DerivationAssociation__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalOntoUML.g:2034:5: ( ( rule__DerivationAssociation__Group_3_1__0 ) )
                    // InternalOntoUML.g:2035:6: ( rule__DerivationAssociation__Group_3_1__0 )
                    {
                     before(grammarAccess.getDerivationAssociationAccess().getGroup_3_1()); 
                    // InternalOntoUML.g:2036:6: ( rule__DerivationAssociation__Group_3_1__0 )
                    // InternalOntoUML.g:2036:7: rule__DerivationAssociation__Group_3_1__0
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
    // InternalOntoUML.g:2049:1: rule__DerivationAssociation__UnorderedGroup_3__0 : rule__DerivationAssociation__UnorderedGroup_3__Impl ( rule__DerivationAssociation__UnorderedGroup_3__1 )? ;
    public final void rule__DerivationAssociation__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2053:1: ( rule__DerivationAssociation__UnorderedGroup_3__Impl ( rule__DerivationAssociation__UnorderedGroup_3__1 )? )
            // InternalOntoUML.g:2054:2: rule__DerivationAssociation__UnorderedGroup_3__Impl ( rule__DerivationAssociation__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_17);
            rule__DerivationAssociation__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalOntoUML.g:2055:2: ( rule__DerivationAssociation__UnorderedGroup_3__1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 31 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {
                alt18=1;
            }
            else if ( LA18_0 == 32 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {
                alt18=1;
            }
            else if ( LA18_0 == 33 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {
                alt18=1;
            }
            else if ( LA18_0 == 36 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {
                alt18=1;
            }
            else if ( LA18_0 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {
                alt18=1;
            }
            else if ( LA18_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOntoUML.g:2055:2: rule__DerivationAssociation__UnorderedGroup_3__1
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
    // InternalOntoUML.g:2061:1: rule__DerivationAssociation__UnorderedGroup_3__1 : rule__DerivationAssociation__UnorderedGroup_3__Impl ;
    public final void rule__DerivationAssociation__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2065:1: ( rule__DerivationAssociation__UnorderedGroup_3__Impl )
            // InternalOntoUML.g:2066:2: rule__DerivationAssociation__UnorderedGroup_3__Impl
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
    // InternalOntoUML.g:2073:1: rule__GeneralizationSet__UnorderedGroup_0 : ( rule__GeneralizationSet__UnorderedGroup_0__0 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0());
        	
        try {
            // InternalOntoUML.g:2078:1: ( ( rule__GeneralizationSet__UnorderedGroup_0__0 )? )
            // InternalOntoUML.g:2079:2: ( rule__GeneralizationSet__UnorderedGroup_0__0 )?
            {
            // InternalOntoUML.g:2079:2: ( rule__GeneralizationSet__UnorderedGroup_0__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOntoUML.g:2079:2: rule__GeneralizationSet__UnorderedGroup_0__0
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
    // InternalOntoUML.g:2087:1: rule__GeneralizationSet__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) ) ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalOntoUML.g:2092:1: ( ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) ) )
            // InternalOntoUML.g:2093:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) )
            {
            // InternalOntoUML.g:2093:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntoUML.g:2094:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) )
                    {
                    // InternalOntoUML.g:2094:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) ) )
                    // InternalOntoUML.g:2095:4: {...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0)");
                    }
                    // InternalOntoUML.g:2095:113: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) ) )
                    // InternalOntoUML.g:2096:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0);
                    				

                    					selected = true;
                    				
                    // InternalOntoUML.g:2102:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_0_0 ) )
                    // InternalOntoUML.g:2103:6: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0_0()); 
                    // InternalOntoUML.g:2104:6: ( rule__GeneralizationSet__IsDisjointAssignment_0_0 )
                    // InternalOntoUML.g:2104:7: rule__GeneralizationSet__IsDisjointAssignment_0_0
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
                    // InternalOntoUML.g:2109:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) )
                    {
                    // InternalOntoUML.g:2109:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) ) )
                    // InternalOntoUML.g:2110:4: {...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1)");
                    }
                    // InternalOntoUML.g:2110:113: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) ) )
                    // InternalOntoUML.g:2111:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1);
                    				

                    					selected = true;
                    				
                    // InternalOntoUML.g:2117:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_0_1 ) )
                    // InternalOntoUML.g:2118:6: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_0_1()); 
                    // InternalOntoUML.g:2119:6: ( rule__GeneralizationSet__IsCompleteAssignment_0_1 )
                    // InternalOntoUML.g:2119:7: rule__GeneralizationSet__IsCompleteAssignment_0_1
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
    // InternalOntoUML.g:2132:1: rule__GeneralizationSet__UnorderedGroup_0__0 : rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2136:1: ( rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )? )
            // InternalOntoUML.g:2137:2: rule__GeneralizationSet__UnorderedGroup_0__Impl ( rule__GeneralizationSet__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_18);
            rule__GeneralizationSet__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalOntoUML.g:2138:2: ( rule__GeneralizationSet__UnorderedGroup_0__1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_0(), 1) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOntoUML.g:2138:2: rule__GeneralizationSet__UnorderedGroup_0__1
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
    // InternalOntoUML.g:2144:1: rule__GeneralizationSet__UnorderedGroup_0__1 : rule__GeneralizationSet__UnorderedGroup_0__Impl ;
    public final void rule__GeneralizationSet__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2148:1: ( rule__GeneralizationSet__UnorderedGroup_0__Impl )
            // InternalOntoUML.g:2149:2: rule__GeneralizationSet__UnorderedGroup_0__Impl
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
    // InternalOntoUML.g:2156:1: rule__Model__ElementsAssignment : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2160:1: ( ( ruleModelElement ) )
            // InternalOntoUML.g:2161:2: ( ruleModelElement )
            {
            // InternalOntoUML.g:2161:2: ( ruleModelElement )
            // InternalOntoUML.g:2162:3: ruleModelElement
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
    // InternalOntoUML.g:2171:1: rule__OntoUMLClass___typeAssignment_0_1_0 : ( ruleEndurantType ) ;
    public final void rule__OntoUMLClass___typeAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2175:1: ( ( ruleEndurantType ) )
            // InternalOntoUML.g:2176:2: ( ruleEndurantType )
            {
            // InternalOntoUML.g:2176:2: ( ruleEndurantType )
            // InternalOntoUML.g:2177:3: ruleEndurantType
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
    // InternalOntoUML.g:2186:1: rule__OntoUMLClass___typeAssignment_0_2 : ( ruleEndurantType ) ;
    public final void rule__OntoUMLClass___typeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2190:1: ( ( ruleEndurantType ) )
            // InternalOntoUML.g:2191:2: ( ruleEndurantType )
            {
            // InternalOntoUML.g:2191:2: ( ruleEndurantType )
            // InternalOntoUML.g:2192:3: ruleEndurantType
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
    // InternalOntoUML.g:2201:1: rule__OntoUMLClass__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__OntoUMLClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2205:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2206:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2206:2: ( ruleStringOrID )
            // InternalOntoUML.g:2207:3: ruleStringOrID
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
    // InternalOntoUML.g:2216:1: rule__OntoUMLClass__AliasAssignment_2_1 : ( ruleStringOrID ) ;
    public final void rule__OntoUMLClass__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2220:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2221:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2221:2: ( ruleStringOrID )
            // InternalOntoUML.g:2222:3: ruleStringOrID
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
    // InternalOntoUML.g:2231:1: rule__RegularAssociation___typeAssignment_0_1_0 : ( ruleRelationType ) ;
    public final void rule__RegularAssociation___typeAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2235:1: ( ( ruleRelationType ) )
            // InternalOntoUML.g:2236:2: ( ruleRelationType )
            {
            // InternalOntoUML.g:2236:2: ( ruleRelationType )
            // InternalOntoUML.g:2237:3: ruleRelationType
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
    // InternalOntoUML.g:2246:1: rule__RegularAssociation___typeAssignment_0_2 : ( ruleRelationType ) ;
    public final void rule__RegularAssociation___typeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2250:1: ( ( ruleRelationType ) )
            // InternalOntoUML.g:2251:2: ( ruleRelationType )
            {
            // InternalOntoUML.g:2251:2: ( ruleRelationType )
            // InternalOntoUML.g:2252:3: ruleRelationType
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
    // InternalOntoUML.g:2261:1: rule__RegularAssociation__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__RegularAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2265:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2266:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2266:2: ( ruleStringOrID )
            // InternalOntoUML.g:2267:3: ruleStringOrID
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
    // InternalOntoUML.g:2276:1: rule__RegularAssociation__AliasAssignment_2_1 : ( ruleStringOrID ) ;
    public final void rule__RegularAssociation__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2280:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2281:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2281:2: ( ruleStringOrID )
            // InternalOntoUML.g:2282:3: ruleStringOrID
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


    // $ANTLR start "rule__RegularAssociation__SourceEndAssignment_3"
    // InternalOntoUML.g:2291:1: rule__RegularAssociation__SourceEndAssignment_3 : ( ruleAssociationEnd ) ;
    public final void rule__RegularAssociation__SourceEndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2295:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUML.g:2296:2: ( ruleAssociationEnd )
            {
            // InternalOntoUML.g:2296:2: ( ruleAssociationEnd )
            // InternalOntoUML.g:2297:3: ruleAssociationEnd
            {
             before(grammarAccess.getRegularAssociationAccess().getSourceEndAssociationEndParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().getSourceEndAssociationEndParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RegularAssociation__SourceEndAssignment_3"


    // $ANTLR start "rule__RegularAssociation__SourceAssignment_4"
    // InternalOntoUML.g:2306:1: rule__RegularAssociation__SourceAssignment_4 : ( ( ruleStringOrID ) ) ;
    public final void rule__RegularAssociation__SourceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2310:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:2311:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:2311:2: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2312:3: ( ruleStringOrID )
            {
             before(grammarAccess.getRegularAssociationAccess().getSourceOntoUMLClassCrossReference_4_0()); 
            // InternalOntoUML.g:2313:3: ( ruleStringOrID )
            // InternalOntoUML.g:2314:4: ruleStringOrID
            {
             before(grammarAccess.getRegularAssociationAccess().getSourceOntoUMLClassStringOrIDParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().getSourceOntoUMLClassStringOrIDParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRegularAssociationAccess().getSourceOntoUMLClassCrossReference_4_0()); 

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
    // $ANTLR end "rule__RegularAssociation__SourceAssignment_4"


    // $ANTLR start "rule__RegularAssociation__TargetEndAssignment_5"
    // InternalOntoUML.g:2325:1: rule__RegularAssociation__TargetEndAssignment_5 : ( ruleAssociationEnd ) ;
    public final void rule__RegularAssociation__TargetEndAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2329:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUML.g:2330:2: ( ruleAssociationEnd )
            {
            // InternalOntoUML.g:2330:2: ( ruleAssociationEnd )
            // InternalOntoUML.g:2331:3: ruleAssociationEnd
            {
             before(grammarAccess.getRegularAssociationAccess().getTargetEndAssociationEndParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().getTargetEndAssociationEndParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__RegularAssociation__TargetEndAssignment_5"


    // $ANTLR start "rule__RegularAssociation__TargetAssignment_6"
    // InternalOntoUML.g:2340:1: rule__RegularAssociation__TargetAssignment_6 : ( ( ruleStringOrID ) ) ;
    public final void rule__RegularAssociation__TargetAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2344:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:2345:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:2345:2: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2346:3: ( ruleStringOrID )
            {
             before(grammarAccess.getRegularAssociationAccess().getTargetOntoUMLClassCrossReference_6_0()); 
            // InternalOntoUML.g:2347:3: ( ruleStringOrID )
            // InternalOntoUML.g:2348:4: ruleStringOrID
            {
             before(grammarAccess.getRegularAssociationAccess().getTargetOntoUMLClassStringOrIDParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().getTargetOntoUMLClassStringOrIDParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRegularAssociationAccess().getTargetOntoUMLClassCrossReference_6_0()); 

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
    // $ANTLR end "rule__RegularAssociation__TargetAssignment_6"


    // $ANTLR start "rule__DerivationAssociation__NameAssignment_1"
    // InternalOntoUML.g:2359:1: rule__DerivationAssociation__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__DerivationAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2363:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2364:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2364:2: ( ruleStringOrID )
            // InternalOntoUML.g:2365:3: ruleStringOrID
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
    // InternalOntoUML.g:2374:1: rule__DerivationAssociation__AliasAssignment_2_1 : ( ruleStringOrID ) ;
    public final void rule__DerivationAssociation__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2378:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2379:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2379:2: ( ruleStringOrID )
            // InternalOntoUML.g:2380:3: ruleStringOrID
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


    // $ANTLR start "rule__DerivationAssociation__SourceEndAssignment_3_0_0"
    // InternalOntoUML.g:2389:1: rule__DerivationAssociation__SourceEndAssignment_3_0_0 : ( ruleAssociationEnd ) ;
    public final void rule__DerivationAssociation__SourceEndAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2393:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUML.g:2394:2: ( ruleAssociationEnd )
            {
            // InternalOntoUML.g:2394:2: ( ruleAssociationEnd )
            // InternalOntoUML.g:2395:3: ruleAssociationEnd
            {
             before(grammarAccess.getDerivationAssociationAccess().getSourceEndAssociationEndParserRuleCall_3_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getDerivationAssociationAccess().getSourceEndAssociationEndParserRuleCall_3_0_0_0()); 

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
    // $ANTLR end "rule__DerivationAssociation__SourceEndAssignment_3_0_0"


    // $ANTLR start "rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1"
    // InternalOntoUML.g:2404:1: rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1 : ( ( ruleStringOrID ) ) ;
    public final void rule__DerivationAssociation__DerivingAssociationAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2408:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:2409:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:2409:2: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2410:3: ( ruleStringOrID )
            {
             before(grammarAccess.getDerivationAssociationAccess().getDerivingAssociationRegularAssociationCrossReference_3_0_1_0()); 
            // InternalOntoUML.g:2411:3: ( ruleStringOrID )
            // InternalOntoUML.g:2412:4: ruleStringOrID
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


    // $ANTLR start "rule__DerivationAssociation__TargetEndAssignment_3_1_0"
    // InternalOntoUML.g:2423:1: rule__DerivationAssociation__TargetEndAssignment_3_1_0 : ( ruleAssociationEnd ) ;
    public final void rule__DerivationAssociation__TargetEndAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2427:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUML.g:2428:2: ( ruleAssociationEnd )
            {
            // InternalOntoUML.g:2428:2: ( ruleAssociationEnd )
            // InternalOntoUML.g:2429:3: ruleAssociationEnd
            {
             before(grammarAccess.getDerivationAssociationAccess().getTargetEndAssociationEndParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getDerivationAssociationAccess().getTargetEndAssociationEndParserRuleCall_3_1_0_0()); 

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
    // $ANTLR end "rule__DerivationAssociation__TargetEndAssignment_3_1_0"


    // $ANTLR start "rule__DerivationAssociation__DerivedClassAssignment_3_1_1"
    // InternalOntoUML.g:2438:1: rule__DerivationAssociation__DerivedClassAssignment_3_1_1 : ( ( ruleStringOrID ) ) ;
    public final void rule__DerivationAssociation__DerivedClassAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2442:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:2443:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:2443:2: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2444:3: ( ruleStringOrID )
            {
             before(grammarAccess.getDerivationAssociationAccess().getDerivedClassOntoUMLClassCrossReference_3_1_1_0()); 
            // InternalOntoUML.g:2445:3: ( ruleStringOrID )
            // InternalOntoUML.g:2446:4: ruleStringOrID
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


    // $ANTLR start "rule__AssociationEnd__AggregationKindAssignment_1"
    // InternalOntoUML.g:2457:1: rule__AssociationEnd__AggregationKindAssignment_1 : ( ruleAggregationKind ) ;
    public final void rule__AssociationEnd__AggregationKindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2461:1: ( ( ruleAggregationKind ) )
            // InternalOntoUML.g:2462:2: ( ruleAggregationKind )
            {
            // InternalOntoUML.g:2462:2: ( ruleAggregationKind )
            // InternalOntoUML.g:2463:3: ruleAggregationKind
            {
             before(grammarAccess.getAssociationEndAccess().getAggregationKindAggregationKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAggregationKind();

            state._fsp--;

             after(grammarAccess.getAssociationEndAccess().getAggregationKindAggregationKindEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__AssociationEnd__AggregationKindAssignment_1"


    // $ANTLR start "rule__AssociationEnd__LowerBoundAssignment_2_1"
    // InternalOntoUML.g:2472:1: rule__AssociationEnd__LowerBoundAssignment_2_1 : ( RULE_CARDINALITY ) ;
    public final void rule__AssociationEnd__LowerBoundAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2476:1: ( ( RULE_CARDINALITY ) )
            // InternalOntoUML.g:2477:2: ( RULE_CARDINALITY )
            {
            // InternalOntoUML.g:2477:2: ( RULE_CARDINALITY )
            // InternalOntoUML.g:2478:3: RULE_CARDINALITY
            {
             before(grammarAccess.getAssociationEndAccess().getLowerBoundCARDINALITYTerminalRuleCall_2_1_0()); 
            match(input,RULE_CARDINALITY,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getLowerBoundCARDINALITYTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__AssociationEnd__LowerBoundAssignment_2_1"


    // $ANTLR start "rule__AssociationEnd__UpperBoundAssignment_2_3"
    // InternalOntoUML.g:2487:1: rule__AssociationEnd__UpperBoundAssignment_2_3 : ( RULE_CARDINALITY ) ;
    public final void rule__AssociationEnd__UpperBoundAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2491:1: ( ( RULE_CARDINALITY ) )
            // InternalOntoUML.g:2492:2: ( RULE_CARDINALITY )
            {
            // InternalOntoUML.g:2492:2: ( RULE_CARDINALITY )
            // InternalOntoUML.g:2493:3: RULE_CARDINALITY
            {
             before(grammarAccess.getAssociationEndAccess().getUpperBoundCARDINALITYTerminalRuleCall_2_3_0()); 
            match(input,RULE_CARDINALITY,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getUpperBoundCARDINALITYTerminalRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__AssociationEnd__UpperBoundAssignment_2_3"


    // $ANTLR start "rule__Generalization__NameAssignment_1"
    // InternalOntoUML.g:2502:1: rule__Generalization__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__Generalization__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2506:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2507:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2507:2: ( ruleStringOrID )
            // InternalOntoUML.g:2508:3: ruleStringOrID
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
    // InternalOntoUML.g:2517:1: rule__Generalization__AliasAssignment_2_1 : ( ruleStringOrID ) ;
    public final void rule__Generalization__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2521:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2522:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2522:2: ( ruleStringOrID )
            // InternalOntoUML.g:2523:3: ruleStringOrID
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
    // InternalOntoUML.g:2532:1: rule__Generalization__GenericAssignment_3 : ( ( ruleStringOrID ) ) ;
    public final void rule__Generalization__GenericAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2536:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:2537:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:2537:2: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2538:3: ( ruleStringOrID )
            {
             before(grammarAccess.getGeneralizationAccess().getGenericOntoUMLClassCrossReference_3_0()); 
            // InternalOntoUML.g:2539:3: ( ruleStringOrID )
            // InternalOntoUML.g:2540:4: ruleStringOrID
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
    // InternalOntoUML.g:2551:1: rule__Generalization__SpecificAssignment_4 : ( ( ruleStringOrID ) ) ;
    public final void rule__Generalization__SpecificAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2555:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:2556:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:2556:2: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2557:3: ( ruleStringOrID )
            {
             before(grammarAccess.getGeneralizationAccess().getSpecificOntoUMLClassCrossReference_4_0()); 
            // InternalOntoUML.g:2558:3: ( ruleStringOrID )
            // InternalOntoUML.g:2559:4: ruleStringOrID
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
    // InternalOntoUML.g:2570:1: rule__GeneralizationSet__IsDisjointAssignment_0_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2574:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoUML.g:2575:2: ( ( 'disjoint' ) )
            {
            // InternalOntoUML.g:2575:2: ( ( 'disjoint' ) )
            // InternalOntoUML.g:2576:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            // InternalOntoUML.g:2577:3: ( 'disjoint' )
            // InternalOntoUML.g:2578:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalOntoUML.g:2589:1: rule__GeneralizationSet__IsCompleteAssignment_0_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2593:1: ( ( ( 'complete' ) ) )
            // InternalOntoUML.g:2594:2: ( ( 'complete' ) )
            {
            // InternalOntoUML.g:2594:2: ( ( 'complete' ) )
            // InternalOntoUML.g:2595:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            // InternalOntoUML.g:2596:3: ( 'complete' )
            // InternalOntoUML.g:2597:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_0_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalOntoUML.g:2608:1: rule__GeneralizationSet__NameAssignment_2 : ( ruleStringOrID ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2612:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2613:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2613:2: ( ruleStringOrID )
            // InternalOntoUML.g:2614:3: ruleStringOrID
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
    // InternalOntoUML.g:2623:1: rule__GeneralizationSet__AliasAssignment_3_1 : ( ruleStringOrID ) ;
    public final void rule__GeneralizationSet__AliasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2627:1: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2628:2: ( ruleStringOrID )
            {
            // InternalOntoUML.g:2628:2: ( ruleStringOrID )
            // InternalOntoUML.g:2629:3: ruleStringOrID
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
    // InternalOntoUML.g:2638:1: rule__GeneralizationSet__GeneralizationsAssignment_5 : ( ( ruleStringOrID ) ) ;
    public final void rule__GeneralizationSet__GeneralizationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:2642:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUML.g:2643:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUML.g:2643:2: ( ( ruleStringOrID ) )
            // InternalOntoUML.g:2644:3: ( ruleStringOrID )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_5_0()); 
            // InternalOntoUML.g:2645:3: ( ruleStringOrID )
            // InternalOntoUML.g:2646:4: ruleStringOrID
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
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA17 dfa17 = new DFA17(this);
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
            return "364:1: rule__OntoUMLClass__Alternatives_0 : ( ( 'class' ) | ( ( rule__OntoUMLClass__Group_0_1__0 ) ) | ( ( rule__OntoUMLClass___typeAssignment_0_2 ) ) );";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\15\1\uffff\6\4\2\uffff";
    static final String dfa_9s = "\1\36\1\uffff\6\15\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\6\uffff\1\3\1\2";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\13\uffff\1\2\1\3\1\4\1\5\1\6\1\7",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "391:1: rule__RegularAssociation__Alternatives_0 : ( ( 'association' ) | ( ( rule__RegularAssociation__Group_0_1__0 ) ) | ( ( rule__RegularAssociation___typeAssignment_0_2 ) ) );";
        }
    }
    static final String dfa_13s = "\15\uffff";
    static final String dfa_14s = "\4\4\1\6\2\0\1\45\2\uffff\1\6\1\46\1\4";
    static final String dfa_15s = "\4\44\1\6\2\0\1\45\2\uffff\1\6\1\46\1\5";
    static final String dfa_16s = "\10\uffff\1\1\1\2\3\uffff";
    static final String dfa_17s = "\1\11\1\1\1\2\1\3\1\10\1\5\1\4\1\12\2\uffff\1\0\1\7\1\6}>";
    static final String[] dfa_18s = {
            "\1\5\1\6\31\uffff\1\1\1\2\1\3\2\uffff\1\4",
            "\1\5\1\6\36\uffff\1\4",
            "\1\5\1\6\36\uffff\1\4",
            "\1\5\1\6\36\uffff\1\4",
            "\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\12",
            "",
            "",
            "\1\13",
            "\1\14",
            "\1\5\1\6"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "2010:3: ( ({...}? => ( ( ( rule__DerivationAssociation__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DerivationAssociation__Group_3_1__0 ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_10 = input.LA(1);

                         
                        int index17_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA17_10 == RULE_CARDINALITY && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 11;}

                         
                        input.seek(index17_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA17_1 == 36 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 4;}

                        else if ( LA17_1 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 5;}

                        else if ( LA17_1 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 6;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA17_2 == 36 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 4;}

                        else if ( LA17_2 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 5;}

                        else if ( LA17_2 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 6;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA17_3 == 36 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 4;}

                        else if ( LA17_3 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 5;}

                        else if ( LA17_3 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 6;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) {s = 9;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) {s = 9;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_12 = input.LA(1);

                         
                        int index17_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA17_12 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 5;}

                        else if ( LA17_12 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 6;}

                         
                        input.seek(index17_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_11 = input.LA(1);

                         
                        int index17_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA17_11 == 38 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 12;}

                         
                        input.seek(index17_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA17_4 == RULE_CARDINALITY && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 7;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_0 = input.LA(1);

                         
                        int index17_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA17_0 == 31 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 1;}

                        else if ( LA17_0 == 32 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 2;}

                        else if ( LA17_0 == 33 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 3;}

                        else if ( LA17_0 == 36 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 4;}

                        else if ( LA17_0 == RULE_STRING && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 5;}

                        else if ( LA17_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 6;}

                         
                        input.seek(index17_0);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA17_7 == 37 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getDerivationAssociationAccess().getUnorderedGroup_3(), 1) ) ) {s = 10;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000018887FFFF002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001780000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001780000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000180000000002L});

}
