package it.unibz.inf.ontouml.xtext.tests

import com.google.inject.Inject
import it.unibz.inf.ontouml.xtext.validation.OntoUMLValidator
import it.unibz.inf.ontouml.xtext.xcore.Model
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert

@RunWith(XtextRunner)
@InjectWith(OntoUMLInjectorProvider)
class OntoUMLValidationTest {
	
	@Inject extension ParseHelper<Model> parseHelper
	@Inject extension ValidationTestHelper
	
	@Test
	def void checkDuplicatedNameTest() {
		val m = '''
		class a
		class b
		generalization a a b
		generalization b b a
		association a
			[1..1] a
			[1..*] a
		association b
			[1..1] b
			[1..*] b
		'''.parse
		
		m.assertNoError(OntoUMLValidator.DUPLICATED_NAME)
	}
	
	@Test
	def void checkValidGeneralizationSetTest() {
		val m1 = '''
		kind "Harbor"
		
		phase "Active Harbor"
		phase "Under Maintenance Harbor"
		phase "Extinct Harbor"
		
		generalization "gen1" "Harbor" "Active Harbor"
		generalization "gen2" "Harbor" "Under Maintenance Harbor"
		generalization "gen3" "Harbor" "Extinct Harbor"
		disjoint complete generalizationset "gs1" { "gen1" "gen2" "gen3" }
		
		class a class b gen g a b
		'''.parse
		m1.assertNoError(OntoUMLValidator.INVALID_GENERALIZATION_SET)
		
		val m2 = '''
		class a
		class b
		class c
		generalization a a c
		generalization b b c
		generalizationset { a b }
		'''.parse
		
		m2.assertError(XcorePackage.eINSTANCE.generalizationSet,OntoUMLValidator.INVALID_GENERALIZATION_SET)
		
		val m3 = '''
		complete generalizationset "SRsDvUaD.AAAAQkd" aka "Set" { "MRnqDUaD.AAAAQXL" "964DvUaD.AAAAQjI" }
		
		generalization "MRnqDUaD.AAAAQXL" aka "gen" "fY7qDUaD.AAAAQWy" ".u7qDUaD.AAAAQW7"
		generalization "964DvUaD.AAAAQjI" aka "gen2" "fY7qDUaD.AAAAQWy" "M64DvUaD.AAAAQi8"
		
		class "fY7qDUaD.AAAAQWy" aka "Class"
		subkind ".u7qDUaD.AAAAQW7" aka "Class2"
		class "M64DvUaD.AAAAQi8" aka "Class4"
		'''.parse
		m3.assertNoError(OntoUMLValidator.INVALID_GENERALIZATION_SET)
	}
	
	@Test
	def void checkUnkownOntologicalPropertiesTest() {
		val m1 = '''
			kind a
			association "a_a"
				[0..*] a
				[0..*] a
			'''.parse
		m1.assertWarning(XcorePackage.eINSTANCE.regularAssociation,OntoUMLValidator.UNKOWN_NATURE)
		
		val m2 = '''
			class a
			dependence "a_a"
				[0..*] a
				[0..*] a
			'''.parse
		m2.assertWarning(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.UNKOWN_NATURE)
	}
	
	@Test
	def void checkUltimateSortalSpecializationTest() {
		val m1 = '''
		kind k1
		subkind sk1
		generalization g1 k1 sk1
		
		modeKind m1
		phase pm1	phase pm2
		generalization g2 m1 pm1
		generalization g3 m1 pm2
		
		relatorKind r1
		role rr1
		generalization g4 r1 rr1
		
		qualityKind q1
		subkind sq1
		generalization g5 q1 sq1
		'''.parse
		m1.assertNoError(OntoUMLValidator.MISSING_IDENTITY_SUPPLIER)
		m1.assertNoError(OntoUMLValidator.ULTIMATE_SORTAL_SPECIALIZATION)
		m1.assertNoError(OntoUMLValidator.MULTIPLE_IDENTITY_SUPPLIERS)
		
		val m2 = '''
		subkind sk1
		
		relatorKind r1
		
		modeKind m1
		generalization g1 r1 m1

		phase pm1	phase pm2
		generalization g2 m1 pm1
		generalization g3 m1 pm2
		'''.parse
		
		m2.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.MISSING_IDENTITY_SUPPLIER)
		m2.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.ULTIMATE_SORTAL_SPECIALIZATION)
		m2.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.MULTIPLE_IDENTITY_SUPPLIERS)
	}
	
	@Test
	def void checkNonSortalSpecializationToSortalTest() {
		val m1 = '''
		kind k
		category c
		generalization gen k c
		'''.parse
		m1.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.NONSORTAL_SPECIALIZATION_TO_SORTAL)
		
		val m2 = '''
		relatorKind r
		mixin mx
		generalization gen r mx
		'''.parse
		m2.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.NONSORTAL_SPECIALIZATION_TO_SORTAL)
		
		val m3 = '''
		phase p
		roleMixin rm
		generalization gen p rm
		'''.parse
		m3.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.NONSORTAL_SPECIALIZATION_TO_SORTAL)
		
		val m4 = '''
		role r
		phaseMixin pm
		generalization gen r pm
		'''.parse
		m4.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.NONSORTAL_SPECIALIZATION_TO_SORTAL)
		
		val m5 = '''
		kind k
		modeKind m
		qualityKind q
		relatorKind r
		subkind sk
		phase p
		role r
		
		category c
		mixin mx
		roleMixin rm
		phaseMixin pm
		
		generalization gen1 c k
		generalization gen2 c m
		generalization gen3 c q
		generalization gen4 c r
		generalization gen5 mx sk
		generalization gen6 rm r
		generalization gen7 pm p
		'''.parse
		m5.assertNoError(OntoUMLValidator.NONSORTAL_SPECIALIZATION_TO_SORTAL)
	}
	
	@Test
	def void checkNonAntiRigidSpecializationToAntiRigidTest() {
		val m1 = '''
		kind k
		phase p
		generalization gen1 k p
		
		mixin mx
		roleMixin rm
		generalization gen2 mx rm
		'''.parse
		m1.assertNoError(OntoUMLValidator.RIGID_SPECIALIZATION_TO_ANTI_RIGID)
		m1.assertNoError(OntoUMLValidator.SEMI_RIGID_SPECIALIZATION_TO_ANTI_RIGID)
		
		val m2 = '''
		kind k
		phase p
		generalization gen1 p k
		
		mixin mx
		roleMixin rm
		generalization gen2 rm mx
		'''.parse
		m2.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.RIGID_SPECIALIZATION_TO_ANTI_RIGID)
		m2.assertError(XcorePackage.eINSTANCE.ontoUMLClass,OntoUMLValidator.SEMI_RIGID_SPECIALIZATION_TO_ANTI_RIGID)
	}
	
	@Test
	def void checkPhaseInPartitionTest() {
		val m1 = '''
		kind k
		phase p1
		phase p2
		generalization gen1 k p1
		generalization gen2 k p2
		disjoint complete generalizationset gs1 { gen1 gen2 }
		
		category c
		phaseMixin pm1
		phaseMixin pm2
		generalization gen3 c pm1
		generalization gen4 c pm2
		disjoint complete generalizationset gs2 { gen3 gen4 }
		'''.parse
		m1.assertNoIssue(XcorePackage.eINSTANCE.ontoUMLClass, OntoUMLValidator.PHASE_MISSING_PARTITION)
		
		val m2 = '''
		kind k
		phase p1
		generalization gen1 k p1
		'''.parse
		m2.assertWarning(XcorePackage.eINSTANCE.modelElement,OntoUMLValidator.PHASE_MISSING_PARTITION)
		
		val m3 = '''
		category c
		phaseMixin pm1
		generalization gen3 c pm1
		'''.parse
		m3.assertWarning(XcorePackage.eINSTANCE.modelElement,OntoUMLValidator.PHASE_MISSING_PARTITION)
		
		val m4 = '''
		kind k
		phase p1
		phase p2
		generalization gen1 k p1
		generalization gen2 k p2
		
		phaseMixin pm1
		generalization gen3 c pm1
		
		disjoint complete generalizationset gs1 { gen1 gen2 gen3 }
		'''.parse
		m4.assertWarning(XcorePackage.eINSTANCE.modelElement,OntoUMLValidator.PHASE_MISSING_PARTITION)
		
		val m5 = '''
		kind k
		phase p1
		phase p2
		generalization gen1 k p1
		generalization gen2 k p2
		disjoint generalizationset gs1 { gen1 gen2 }
		'''.parse
		m5.assertWarning(XcorePackage.eINSTANCE.modelElement,OntoUMLValidator.PHASE_MISSING_PARTITION)
	}
	
	@Test
	def void checkMultipleDerivationOfSingleAssociationTest() {
		val m1 = '''
		class a class d_a
		association a_a a a
		derivation d_a_a a_a d_a
		association a_a2 a a
		'''.parse
		m1.assertNoError(OntoUMLValidator.MULTIPLE_DERIVATIONS)
		
		val m2 = '''
		class a class d_a
		association a_a a a
		derivation d_a_a a_a d_a
		derivation d_a_a2 a_a d_a
		'''.parse
		m2.assertError(XcorePackage.eINSTANCE.derivationAssociation, OntoUMLValidator.MULTIPLE_DERIVATIONS)
	}

	@Test
	def void checkDescriptiveRelationDerivationTest() {
		val m1 = '''
		relatorKind enrollment
		kind person kind school
		descriptive studies_at person school
		derivation d_studies_at studies_at enrollment
		'''.parse
		m1.assertNoWarnings(XcorePackage.eINSTANCE.regularAssociation,OntoUMLValidator.MISSING_DERIVATION)
		m1.assertNoWarnings(XcorePackage.eINSTANCE.regularAssociation,OntoUMLValidator.MISSING_DERIVATION)
		
		val m2 = '''
		relatorKind enrollment
		kind person kind school
		descriptive studies_at person school
		'''.parse
		m2.assertWarning(XcorePackage.eINSTANCE.regularAssociation,OntoUMLValidator.MISSING_DERIVATION)
		
		val m3 = '''
		category substance
		kind person kind school
		descriptive studies_at person school
		derivation d_studies_at studies_at substance
		'''.parse
		m3.assertWarning(XcorePackage.eINSTANCE.regularAssociation,OntoUMLValidator.PROHIBITED_DERIVATION)
	}	

	@Test
	def void checkDerivedMomentDependencesTest() {
		val m1 = '''
		roleMixin Lover
		roleMixin LovedOne
		modeKind Love
		descriptive loves Lover LovedOne
		derivation d_loves loves Love
		inherence inh Love Lover
		dependence dep Love LovedOne
		
		roleMixin Customer
		roleMixin Provider
		relatorKind ServiceAgreement
		descriptive subscribes_to Customer Provider
		derivation d_subscribes_to subscribes_to ServiceAgreement
		involvement inv1 ServiceAgreement Customer
		involvement inv2 ServiceAgreement Provider
		'''.parse
		m1.assertNoIssue(XcorePackage.eINSTANCE.derivationAssociation,OntoUMLValidator.MISSING_INHERENCE)
		m1.assertNoIssue(XcorePackage.eINSTANCE.derivationAssociation,OntoUMLValidator.INVALID_INHERENCE)
		m1.assertNoIssue(XcorePackage.eINSTANCE.derivationAssociation,OntoUMLValidator.MISSING_DEPENDENCE)
		m1.assertNoIssue(XcorePackage.eINSTANCE.derivationAssociation,OntoUMLValidator.MISSING_INVOLVEMENT)
		
		val m2 = '''
		roleMixin Lover
		roleMixin LovedOne
		modeKind Love
		descriptive loves Lover LovedOne
		derivation d_loves loves Love
		'''.parse
		m2.assertError(XcorePackage.eINSTANCE.derivationAssociation,OntoUMLValidator.MISSING_INHERENCE)
		
		val m3 = '''
		roleMixin Lover
		roleMixin LovedOne
		modeKind Love
		descriptive loves Lover LovedOne
		derivation d_loves loves Love
		inherence inh Love Lover
		'''.parse
		m3.assertError(XcorePackage.eINSTANCE.derivationAssociation,OntoUMLValidator.MISSING_DEPENDENCE)
		
		val m4 = '''
		class Other
		roleMixin Lover
		roleMixin LovedOne
		modeKind Love
		descriptive loves Lover LovedOne
		derivation d_loves loves Love
		inherence inh Love Other
		'''.parse
		m4.assertError(XcorePackage.eINSTANCE.derivationAssociation,OntoUMLValidator.INVALID_INHERENCE)
		
		val m5 = '''
		class Other
		roleMixin Lover
		roleMixin LovedOne
		modeKind Love
		descriptive loves Lover LovedOne
		derivation d_loves loves Love
		inherence inh Love Lover
		dependence dep Love Other
		'''.parse
		m5.assertError(XcorePackage.eINSTANCE.derivationAssociation,OntoUMLValidator.MISSING_DEPENDENCE)
		
		val m6 = '''
		roleMixin Customer
		roleMixin Provider
		relatorKind ServiceAgreement
		descriptive subscribes_to Customer Provider
		derivation d_subscribes_to subscribes_to ServiceAgreement
		involvement inv2 ServiceAgreement Provider
		'''.parse
		m6.assertError(XcorePackage.eINSTANCE.derivationAssociation,OntoUMLValidator.MISSING_INVOLVEMENT)
		
		val m7 = '''
		roleMixin Customer
		roleMixin Provider
		relatorKind ServiceAgreement
		descriptive subscribes_to Customer Provider
		derivation d_subscribes_to subscribes_to ServiceAgreement
		'''.parse
		m7.assertError(XcorePackage.eINSTANCE.derivationAssociation,OntoUMLValidator.MISSING_INVOLVEMENT)
	}

	
		
}

