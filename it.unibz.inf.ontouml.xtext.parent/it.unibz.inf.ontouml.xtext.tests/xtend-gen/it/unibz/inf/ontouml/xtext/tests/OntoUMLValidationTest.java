package it.unibz.inf.ontouml.xtext.tests;

import com.google.inject.Inject;
import it.unibz.inf.ontouml.xtext.tests.OntoUMLInjectorProvider;
import it.unibz.inf.ontouml.xtext.validation.OntoUMLValidator;
import it.unibz.inf.ontouml.xtext.xcore.Model;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(OntoUMLInjectorProvider.class)
@SuppressWarnings("all")
public class OntoUMLValidationTest {
  @Inject
  @Extension
  private ParseHelper<Model> parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void checkDuplicatedNameTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class a");
      _builder.newLine();
      _builder.append("class b");
      _builder.newLine();
      _builder.append("generalization a a b");
      _builder.newLine();
      _builder.append("generalization b b a");
      _builder.newLine();
      _builder.append("association a");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("[1..1] a");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("[1..*] a");
      _builder.newLine();
      _builder.append("association b");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("[1..1] b");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("[1..*] b");
      _builder.newLine();
      final Model m = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertNoError(m, OntoUMLValidator.DUPLICATED_NAME);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void checkValidGeneralizationSetTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("kind \"Harbor\"");
      _builder.newLine();
      _builder.newLine();
      _builder.append("phase \"Active Harbor\"");
      _builder.newLine();
      _builder.append("phase \"Under Maintenance Harbor\"");
      _builder.newLine();
      _builder.append("phase \"Extinct Harbor\"");
      _builder.newLine();
      _builder.newLine();
      _builder.append("generalization \"gen1\" \"Harbor\" \"Active Harbor\"");
      _builder.newLine();
      _builder.append("generalization \"gen2\" \"Harbor\" \"Under Maintenance Harbor\"");
      _builder.newLine();
      _builder.append("generalization \"gen3\" \"Harbor\" \"Extinct Harbor\"");
      _builder.newLine();
      _builder.append("disjoint complete generalizationset \"gs1\" { \"gen1\" \"gen2\" \"gen3\" }");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class a class b gen g a b");
      _builder.newLine();
      final Model m1 = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertNoError(m1, OntoUMLValidator.INVALID_GENERALIZATION_SET);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("class a");
      _builder_1.newLine();
      _builder_1.append("class b");
      _builder_1.newLine();
      _builder_1.append("class c");
      _builder_1.newLine();
      _builder_1.append("generalization a a c");
      _builder_1.newLine();
      _builder_1.append("generalization b b c");
      _builder_1.newLine();
      _builder_1.append("generalizationset { a b }");
      _builder_1.newLine();
      final Model m2 = this.parseHelper.parse(_builder_1);
      this._validationTestHelper.assertError(m2, XcorePackage.eINSTANCE.getGeneralizationSet(), OntoUMLValidator.INVALID_GENERALIZATION_SET);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("complete generalizationset \"SRsDvUaD.AAAAQkd\" aka \"Set\" { \"MRnqDUaD.AAAAQXL\" \"964DvUaD.AAAAQjI\" }");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("generalization \"MRnqDUaD.AAAAQXL\" aka \"gen\" \"fY7qDUaD.AAAAQWy\" \".u7qDUaD.AAAAQW7\"");
      _builder_2.newLine();
      _builder_2.append("generalization \"964DvUaD.AAAAQjI\" aka \"gen2\" \"fY7qDUaD.AAAAQWy\" \"M64DvUaD.AAAAQi8\"");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("class \"fY7qDUaD.AAAAQWy\" aka \"Class\"");
      _builder_2.newLine();
      _builder_2.append("subkind \".u7qDUaD.AAAAQW7\" aka \"Class2\"");
      _builder_2.newLine();
      _builder_2.append("class \"M64DvUaD.AAAAQi8\" aka \"Class4\"");
      _builder_2.newLine();
      final Model m3 = this.parseHelper.parse(_builder_2);
      this._validationTestHelper.assertNoError(m3, OntoUMLValidator.INVALID_GENERALIZATION_SET);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void checkUnkownOntologicalPropertiesTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("kind a");
      _builder.newLine();
      _builder.append("association \"a_a\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("[0..*] a");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("[0..*] a");
      _builder.newLine();
      final Model m1 = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertWarning(m1, XcorePackage.eINSTANCE.getRegularAssociation(), OntoUMLValidator.UNKOWN_NATURE);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("class a");
      _builder_1.newLine();
      _builder_1.append("dependence \"a_a\"");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("[0..*] a");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("[0..*] a");
      _builder_1.newLine();
      final Model m2 = this.parseHelper.parse(_builder_1);
      this._validationTestHelper.assertWarning(m2, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.UNKOWN_NATURE);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void checkUltimateSortalSpecializationTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("kind k1");
      _builder.newLine();
      _builder.append("subkind sk1");
      _builder.newLine();
      _builder.append("generalization g1 k1 sk1");
      _builder.newLine();
      _builder.newLine();
      _builder.append("modeKind m1");
      _builder.newLine();
      _builder.append("phase pm1\tphase pm2");
      _builder.newLine();
      _builder.append("generalization g2 m1 pm1");
      _builder.newLine();
      _builder.append("generalization g3 m1 pm2");
      _builder.newLine();
      _builder.newLine();
      _builder.append("relatorKind r1");
      _builder.newLine();
      _builder.append("role rr1");
      _builder.newLine();
      _builder.append("generalization g4 r1 rr1");
      _builder.newLine();
      _builder.newLine();
      _builder.append("qualityKind q1");
      _builder.newLine();
      _builder.append("subkind sq1");
      _builder.newLine();
      _builder.append("generalization g5 q1 sq1");
      _builder.newLine();
      final Model m1 = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertNoError(m1, OntoUMLValidator.MISSING_IDENTITY_SUPPLIER);
      this._validationTestHelper.assertNoError(m1, OntoUMLValidator.ULTIMATE_SORTAL_SPECIALIZATION);
      this._validationTestHelper.assertNoError(m1, OntoUMLValidator.MULTIPLE_IDENTITY_SUPPLIERS);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("subkind sk1");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("relatorKind r1");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("modeKind m1");
      _builder_1.newLine();
      _builder_1.append("generalization g1 r1 m1");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("phase pm1\tphase pm2");
      _builder_1.newLine();
      _builder_1.append("generalization g2 m1 pm1");
      _builder_1.newLine();
      _builder_1.append("generalization g3 m1 pm2");
      _builder_1.newLine();
      final Model m2 = this.parseHelper.parse(_builder_1);
      this._validationTestHelper.assertError(m2, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.MISSING_IDENTITY_SUPPLIER);
      this._validationTestHelper.assertError(m2, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.ULTIMATE_SORTAL_SPECIALIZATION);
      this._validationTestHelper.assertError(m2, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.MULTIPLE_IDENTITY_SUPPLIERS);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void checkNonSortalSpecializationToSortalTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("kind k");
      _builder.newLine();
      _builder.append("category c");
      _builder.newLine();
      _builder.append("generalization gen k c");
      _builder.newLine();
      final Model m1 = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertError(m1, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.NONSORTAL_SPECIALIZATION_TO_SORTAL);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("relatorKind r");
      _builder_1.newLine();
      _builder_1.append("mixin mx");
      _builder_1.newLine();
      _builder_1.append("generalization gen r mx");
      _builder_1.newLine();
      final Model m2 = this.parseHelper.parse(_builder_1);
      this._validationTestHelper.assertError(m2, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.NONSORTAL_SPECIALIZATION_TO_SORTAL);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("phase p");
      _builder_2.newLine();
      _builder_2.append("roleMixin rm");
      _builder_2.newLine();
      _builder_2.append("generalization gen p rm");
      _builder_2.newLine();
      final Model m3 = this.parseHelper.parse(_builder_2);
      this._validationTestHelper.assertError(m3, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.NONSORTAL_SPECIALIZATION_TO_SORTAL);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("role r");
      _builder_3.newLine();
      _builder_3.append("phaseMixin pm");
      _builder_3.newLine();
      _builder_3.append("generalization gen r pm");
      _builder_3.newLine();
      final Model m4 = this.parseHelper.parse(_builder_3);
      this._validationTestHelper.assertError(m4, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.NONSORTAL_SPECIALIZATION_TO_SORTAL);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("kind k");
      _builder_4.newLine();
      _builder_4.append("modeKind m");
      _builder_4.newLine();
      _builder_4.append("qualityKind q");
      _builder_4.newLine();
      _builder_4.append("relatorKind r");
      _builder_4.newLine();
      _builder_4.append("subkind sk");
      _builder_4.newLine();
      _builder_4.append("phase p");
      _builder_4.newLine();
      _builder_4.append("role r");
      _builder_4.newLine();
      _builder_4.newLine();
      _builder_4.append("category c");
      _builder_4.newLine();
      _builder_4.append("mixin mx");
      _builder_4.newLine();
      _builder_4.append("roleMixin rm");
      _builder_4.newLine();
      _builder_4.append("phaseMixin pm");
      _builder_4.newLine();
      _builder_4.newLine();
      _builder_4.append("generalization gen1 c k");
      _builder_4.newLine();
      _builder_4.append("generalization gen2 c m");
      _builder_4.newLine();
      _builder_4.append("generalization gen3 c q");
      _builder_4.newLine();
      _builder_4.append("generalization gen4 c r");
      _builder_4.newLine();
      _builder_4.append("generalization gen5 mx sk");
      _builder_4.newLine();
      _builder_4.append("generalization gen6 rm r");
      _builder_4.newLine();
      _builder_4.append("generalization gen7 pm p");
      _builder_4.newLine();
      final Model m5 = this.parseHelper.parse(_builder_4);
      this._validationTestHelper.assertNoError(m5, OntoUMLValidator.NONSORTAL_SPECIALIZATION_TO_SORTAL);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void checkNonAntiRigidSpecializationToAntiRigidTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("kind k");
      _builder.newLine();
      _builder.append("phase p");
      _builder.newLine();
      _builder.append("generalization gen1 k p");
      _builder.newLine();
      _builder.newLine();
      _builder.append("mixin mx");
      _builder.newLine();
      _builder.append("roleMixin rm");
      _builder.newLine();
      _builder.append("generalization gen2 mx rm");
      _builder.newLine();
      final Model m1 = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertNoError(m1, OntoUMLValidator.RIGID_SPECIALIZATION_TO_ANTI_RIGID);
      this._validationTestHelper.assertNoError(m1, OntoUMLValidator.SEMI_RIGID_SPECIALIZATION_TO_ANTI_RIGID);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("kind k");
      _builder_1.newLine();
      _builder_1.append("phase p");
      _builder_1.newLine();
      _builder_1.append("generalization gen1 p k");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("mixin mx");
      _builder_1.newLine();
      _builder_1.append("roleMixin rm");
      _builder_1.newLine();
      _builder_1.append("generalization gen2 rm mx");
      _builder_1.newLine();
      final Model m2 = this.parseHelper.parse(_builder_1);
      this._validationTestHelper.assertError(m2, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.RIGID_SPECIALIZATION_TO_ANTI_RIGID);
      this._validationTestHelper.assertError(m2, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.SEMI_RIGID_SPECIALIZATION_TO_ANTI_RIGID);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void checkPhaseInPartitionTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("kind k");
      _builder.newLine();
      _builder.append("phase p1");
      _builder.newLine();
      _builder.append("phase p2");
      _builder.newLine();
      _builder.append("generalization gen1 k p1");
      _builder.newLine();
      _builder.append("generalization gen2 k p2");
      _builder.newLine();
      _builder.append("disjoint complete generalizationset gs1 { gen1 gen2 }");
      _builder.newLine();
      _builder.newLine();
      _builder.append("category c");
      _builder.newLine();
      _builder.append("phaseMixin pm1");
      _builder.newLine();
      _builder.append("phaseMixin pm2");
      _builder.newLine();
      _builder.append("generalization gen3 c pm1");
      _builder.newLine();
      _builder.append("generalization gen4 c pm2");
      _builder.newLine();
      _builder.append("disjoint complete generalizationset gs2 { gen3 gen4 }");
      _builder.newLine();
      final Model m1 = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertNoError(m1, OntoUMLValidator.PHASE_MISSING_PARTITION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("kind k");
      _builder_1.newLine();
      _builder_1.append("phase p1");
      _builder_1.newLine();
      _builder_1.append("generalization gen1 k p1");
      _builder_1.newLine();
      final Model m2 = this.parseHelper.parse(_builder_1);
      this._validationTestHelper.assertError(m2, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.PHASE_MISSING_PARTITION);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("category c");
      _builder_2.newLine();
      _builder_2.append("phaseMixin pm1");
      _builder_2.newLine();
      _builder_2.append("generalization gen3 c pm1");
      _builder_2.newLine();
      final Model m3 = this.parseHelper.parse(_builder_2);
      this._validationTestHelper.assertError(m3, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.PHASE_MISSING_PARTITION);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("kind k");
      _builder_3.newLine();
      _builder_3.append("phase p1");
      _builder_3.newLine();
      _builder_3.append("phase p2");
      _builder_3.newLine();
      _builder_3.append("generalization gen1 k p1");
      _builder_3.newLine();
      _builder_3.append("generalization gen2 k p2");
      _builder_3.newLine();
      _builder_3.newLine();
      _builder_3.append("phaseMixin pm1");
      _builder_3.newLine();
      _builder_3.append("generalization gen3 c pm1");
      _builder_3.newLine();
      _builder_3.newLine();
      _builder_3.append("disjoint complete generalizationset gs1 { gen1 gen2 gen3 }");
      _builder_3.newLine();
      final Model m4 = this.parseHelper.parse(_builder_3);
      this._validationTestHelper.assertError(m4, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.PHASE_MISSING_PARTITION);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("kind k");
      _builder_4.newLine();
      _builder_4.append("phase p1");
      _builder_4.newLine();
      _builder_4.append("phase p2");
      _builder_4.newLine();
      _builder_4.append("generalization gen1 k p1");
      _builder_4.newLine();
      _builder_4.append("generalization gen2 k p2");
      _builder_4.newLine();
      _builder_4.append("disjoint generalizationset gs1 { gen1 gen2 }");
      _builder_4.newLine();
      final Model m5 = this.parseHelper.parse(_builder_4);
      this._validationTestHelper.assertError(m5, XcorePackage.eINSTANCE.getOntoUMLClass(), OntoUMLValidator.PHASE_MISSING_PARTITION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void checkMultipleDerivationOfSingleAssociationTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class a class d_a");
      _builder.newLine();
      _builder.append("association a_a a a");
      _builder.newLine();
      _builder.append("derivation d_a_a a_a d_a");
      _builder.newLine();
      _builder.append("association a_a2 a a");
      _builder.newLine();
      final Model m1 = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertNoError(m1, OntoUMLValidator.MULTIPLE_DERIVATIONS);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("class a class d_a");
      _builder_1.newLine();
      _builder_1.append("association a_a a a");
      _builder_1.newLine();
      _builder_1.append("derivation d_a_a a_a d_a");
      _builder_1.newLine();
      _builder_1.append("derivation d_a_a2 a_a d_a");
      _builder_1.newLine();
      final Model m2 = this.parseHelper.parse(_builder_1);
      this._validationTestHelper.assertError(m2, XcorePackage.eINSTANCE.getDerivationAssociation(), OntoUMLValidator.MULTIPLE_DERIVATIONS);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void checkDescriptiveRelationDerivationTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("relatorKind enrollment");
      _builder.newLine();
      _builder.append("kind person kind school");
      _builder.newLine();
      _builder.append("descriptive studies_at person school");
      _builder.newLine();
      _builder.append("derivation d_studies_at studies_at enrollment");
      _builder.newLine();
      final Model m1 = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertNoWarnings(m1, XcorePackage.eINSTANCE.getRegularAssociation(), OntoUMLValidator.MISSING_DERIVATION);
      this._validationTestHelper.assertNoWarnings(m1, XcorePackage.eINSTANCE.getRegularAssociation(), OntoUMLValidator.MISSING_DERIVATION);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("relatorKind enrollment");
      _builder_1.newLine();
      _builder_1.append("kind person kind school");
      _builder_1.newLine();
      _builder_1.append("descriptive studies_at person school");
      _builder_1.newLine();
      final Model m2 = this.parseHelper.parse(_builder_1);
      this._validationTestHelper.assertWarning(m2, XcorePackage.eINSTANCE.getRegularAssociation(), OntoUMLValidator.MISSING_DERIVATION);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("category substance");
      _builder_2.newLine();
      _builder_2.append("kind person kind school");
      _builder_2.newLine();
      _builder_2.append("descriptive studies_at person school");
      _builder_2.newLine();
      _builder_2.append("derivation d_studies_at studies_at substance");
      _builder_2.newLine();
      final Model m3 = this.parseHelper.parse(_builder_2);
      this._validationTestHelper.assertWarning(m3, XcorePackage.eINSTANCE.getRegularAssociation(), OntoUMLValidator.PROHIBITED_DERIVATION);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void checkDerivedMomentDependencesTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("roleMixin Lover");
      _builder.newLine();
      _builder.append("roleMixin LovedOne");
      _builder.newLine();
      _builder.append("modeKind Love");
      _builder.newLine();
      _builder.append("descriptive loves Lover LovedOne");
      _builder.newLine();
      _builder.append("derivation d_loves loves Love");
      _builder.newLine();
      _builder.append("inherence inh Love Lover");
      _builder.newLine();
      _builder.append("dependence dep Love LovedOne");
      _builder.newLine();
      _builder.newLine();
      _builder.append("roleMixin Customer");
      _builder.newLine();
      _builder.append("roleMixin Provider");
      _builder.newLine();
      _builder.append("relatorKind ServiceAgreement");
      _builder.newLine();
      _builder.append("descriptive subscribes_to Customer Provider");
      _builder.newLine();
      _builder.append("derivation d_subscribes_to subscribes_to ServiceAgreement");
      _builder.newLine();
      _builder.append("involvement inv1 ServiceAgreement Customer");
      _builder.newLine();
      _builder.append("involvement inv2 ServiceAgreement Provider");
      _builder.newLine();
      final Model m1 = this.parseHelper.parse(_builder);
      this._validationTestHelper.assertNoIssue(m1, XcorePackage.eINSTANCE.getDerivationAssociation(), OntoUMLValidator.MISSING_INHERENCE);
      this._validationTestHelper.assertNoIssue(m1, XcorePackage.eINSTANCE.getDerivationAssociation(), OntoUMLValidator.INVALID_INHERENCE);
      this._validationTestHelper.assertNoIssue(m1, XcorePackage.eINSTANCE.getDerivationAssociation(), OntoUMLValidator.MISSING_DEPENDENCE);
      this._validationTestHelper.assertNoIssue(m1, XcorePackage.eINSTANCE.getDerivationAssociation(), OntoUMLValidator.MISSING_INVOLVEMENT);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("roleMixin Lover");
      _builder_1.newLine();
      _builder_1.append("roleMixin LovedOne");
      _builder_1.newLine();
      _builder_1.append("modeKind Love");
      _builder_1.newLine();
      _builder_1.append("descriptive loves Lover LovedOne");
      _builder_1.newLine();
      _builder_1.append("derivation d_loves loves Love");
      _builder_1.newLine();
      final Model m2 = this.parseHelper.parse(_builder_1);
      this._validationTestHelper.assertError(m2, XcorePackage.eINSTANCE.getDerivationAssociation(), OntoUMLValidator.MISSING_INHERENCE);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("roleMixin Lover");
      _builder_2.newLine();
      _builder_2.append("roleMixin LovedOne");
      _builder_2.newLine();
      _builder_2.append("modeKind Love");
      _builder_2.newLine();
      _builder_2.append("descriptive loves Lover LovedOne");
      _builder_2.newLine();
      _builder_2.append("derivation d_loves loves Love");
      _builder_2.newLine();
      _builder_2.append("inherence inh Love Lover");
      _builder_2.newLine();
      final Model m3 = this.parseHelper.parse(_builder_2);
      this._validationTestHelper.assertError(m3, XcorePackage.eINSTANCE.getDerivationAssociation(), OntoUMLValidator.MISSING_DEPENDENCE);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("class Other");
      _builder_3.newLine();
      _builder_3.append("roleMixin Lover");
      _builder_3.newLine();
      _builder_3.append("roleMixin LovedOne");
      _builder_3.newLine();
      _builder_3.append("modeKind Love");
      _builder_3.newLine();
      _builder_3.append("descriptive loves Lover LovedOne");
      _builder_3.newLine();
      _builder_3.append("derivation d_loves loves Love");
      _builder_3.newLine();
      _builder_3.append("inherence inh Love Other");
      _builder_3.newLine();
      final Model m4 = this.parseHelper.parse(_builder_3);
      this._validationTestHelper.assertError(m4, XcorePackage.eINSTANCE.getDerivationAssociation(), OntoUMLValidator.INVALID_INHERENCE);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("class Other");
      _builder_4.newLine();
      _builder_4.append("roleMixin Lover");
      _builder_4.newLine();
      _builder_4.append("roleMixin LovedOne");
      _builder_4.newLine();
      _builder_4.append("modeKind Love");
      _builder_4.newLine();
      _builder_4.append("descriptive loves Lover LovedOne");
      _builder_4.newLine();
      _builder_4.append("derivation d_loves loves Love");
      _builder_4.newLine();
      _builder_4.append("inherence inh Love Lover");
      _builder_4.newLine();
      _builder_4.append("dependence dep Love Other");
      _builder_4.newLine();
      final Model m5 = this.parseHelper.parse(_builder_4);
      this._validationTestHelper.assertError(m5, XcorePackage.eINSTANCE.getDerivationAssociation(), OntoUMLValidator.MISSING_DEPENDENCE);
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("roleMixin Customer");
      _builder_5.newLine();
      _builder_5.append("roleMixin Provider");
      _builder_5.newLine();
      _builder_5.append("relatorKind ServiceAgreement");
      _builder_5.newLine();
      _builder_5.append("descriptive subscribes_to Customer Provider");
      _builder_5.newLine();
      _builder_5.append("derivation d_subscribes_to subscribes_to ServiceAgreement");
      _builder_5.newLine();
      _builder_5.append("involvement inv2 ServiceAgreement Provider");
      _builder_5.newLine();
      final Model m6 = this.parseHelper.parse(_builder_5);
      this._validationTestHelper.assertError(m6, XcorePackage.eINSTANCE.getDerivationAssociation(), OntoUMLValidator.MISSING_INVOLVEMENT);
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("roleMixin Customer");
      _builder_6.newLine();
      _builder_6.append("roleMixin Provider");
      _builder_6.newLine();
      _builder_6.append("relatorKind ServiceAgreement");
      _builder_6.newLine();
      _builder_6.append("descriptive subscribes_to Customer Provider");
      _builder_6.newLine();
      _builder_6.append("derivation d_subscribes_to subscribes_to ServiceAgreement");
      _builder_6.newLine();
      final Model m7 = this.parseHelper.parse(_builder_6);
      this._validationTestHelper.assertError(m7, XcorePackage.eINSTANCE.getDerivationAssociation(), OntoUMLValidator.MISSING_INVOLVEMENT);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
