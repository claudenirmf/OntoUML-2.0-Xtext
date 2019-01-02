/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import it.unibz.inf.ontouml.xtext.xcore.Association;
import it.unibz.inf.ontouml.xtext.xcore.Classifier;
import it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation;
import it.unibz.inf.ontouml.xtext.xcore.EndurantType;
import it.unibz.inf.ontouml.xtext.xcore.Generalization;
import it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet;
import it.unibz.inf.ontouml.xtext.xcore.Model;
import it.unibz.inf.ontouml.xtext.xcore.ModelElement;
import it.unibz.inf.ontouml.xtext.xcore.Multiplicity;
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import it.unibz.inf.ontouml.xtext.xcore.RegularAssociation;
import it.unibz.inf.ontouml.xtext.xcore.RelationType;
import it.unibz.inf.ontouml.xtext.xcore.XcoreFactory;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XcorePackageImpl extends EPackageImpl implements XcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontoUMLClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivationAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endurantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XcorePackageImpl() {
		super(eNS_URI, XcoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XcorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XcorePackage init() {
		if (isInited) return (XcorePackage)EPackage.Registry.INSTANCE.getEPackage(XcorePackage.eNS_URI);

		// Obtain or create and register package
		XcorePackageImpl theXcorePackage = (XcorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XcorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XcorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXcorePackage.createPackageContents();

		// Initialize created meta-data
		theXcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXcorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XcorePackage.eNS_URI, theXcorePackage);
		return theXcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Elements() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__GetElementByName__String() {
		return modelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Name() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Alias() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelElement__GetContainerModel() {
		return modelElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelElement__GetReacheableElements() {
		return modelElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__GetGeneralizations() {
		return classifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__GetSpecializations() {
		return classifierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntoUMLClass() {
		return ontoUMLClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntoUMLClass__type() {
		return (EAttribute)ontoUMLClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__GetParents() {
		return ontoUMLClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__GetChildren() {
		return ontoUMLClassEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsUltimateSortal() {
		return ontoUMLClassEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsSortal() {
		return ontoUMLClassEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsNonSortal() {
		return ontoUMLClassEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsRigid() {
		return ontoUMLClassEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsSemiRigid() {
		return ontoUMLClassEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsAntiRigid() {
		return ontoUMLClassEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsPhase() {
		return ontoUMLClassEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsRole() {
		return ontoUMLClassEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsSubstantialKind() {
		return ontoUMLClassEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntoUMLClass__IsMomentKind() {
		return ontoUMLClassEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_EndAMultiplicity() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_EndBMultiplicity() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssociation__GetParents() {
		return associationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssociation__GetChildren() {
		return associationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicity() {
		return multiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicity_LowerBound() {
		return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicity_UpperBound() {
		return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicity__SetMultiplicity__String_String() {
		return multiplicityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicity__SetZeroToOne() {
		return multiplicityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicity__SetZeroToMany() {
		return multiplicityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicity__SetOneToOne() {
		return multiplicityEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicity__SetOneToMany() {
		return multiplicityEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularAssociation() {
		return regularAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularAssociation__type() {
		return (EAttribute)regularAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularAssociation_EndA() {
		return (EReference)regularAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularAssociation_EndB() {
		return (EReference)regularAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivationAssociation() {
		return derivationAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationAssociation_DerivingAssociation() {
		return (EReference)derivationAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationAssociation_DerivedClass() {
		return (EReference)derivationAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Generic() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Specific() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneralization__GetGeneralizationSets() {
		return generalizationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationSet() {
		return generalizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsDisjoint() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsComplete() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Generalizations() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneralizationSet__GetGeneric() {
		return generalizationSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneralizationSet__GetSpecifics() {
		return generalizationSetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEndurantType() {
		return endurantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationType() {
		return relationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcoreFactory getXcoreFactory() {
		return (XcoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__ELEMENTS);
		createEOperation(modelEClass, MODEL___GET_ELEMENT_BY_NAME__STRING);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__ALIAS);
		createEOperation(modelElementEClass, MODEL_ELEMENT___GET_CONTAINER_MODEL);
		createEOperation(modelElementEClass, MODEL_ELEMENT___GET_REACHEABLE_ELEMENTS);

		classifierEClass = createEClass(CLASSIFIER);
		createEOperation(classifierEClass, CLASSIFIER___GET_GENERALIZATIONS);
		createEOperation(classifierEClass, CLASSIFIER___GET_SPECIALIZATIONS);

		ontoUMLClassEClass = createEClass(ONTO_UML_CLASS);
		createEAttribute(ontoUMLClassEClass, ONTO_UML_CLASS__TYPE);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___GET_PARENTS);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___GET_CHILDREN);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_ULTIMATE_SORTAL);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_SORTAL);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_NON_SORTAL);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_RIGID);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_SEMI_RIGID);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_ANTI_RIGID);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_PHASE);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_ROLE);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_SUBSTANTIAL_KIND);
		createEOperation(ontoUMLClassEClass, ONTO_UML_CLASS___IS_MOMENT_KIND);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__END_AMULTIPLICITY);
		createEReference(associationEClass, ASSOCIATION__END_BMULTIPLICITY);
		createEOperation(associationEClass, ASSOCIATION___GET_PARENTS);
		createEOperation(associationEClass, ASSOCIATION___GET_CHILDREN);

		multiplicityEClass = createEClass(MULTIPLICITY);
		createEAttribute(multiplicityEClass, MULTIPLICITY__LOWER_BOUND);
		createEAttribute(multiplicityEClass, MULTIPLICITY__UPPER_BOUND);
		createEOperation(multiplicityEClass, MULTIPLICITY___SET_MULTIPLICITY__STRING_STRING);
		createEOperation(multiplicityEClass, MULTIPLICITY___SET_ZERO_TO_ONE);
		createEOperation(multiplicityEClass, MULTIPLICITY___SET_ZERO_TO_MANY);
		createEOperation(multiplicityEClass, MULTIPLICITY___SET_ONE_TO_ONE);
		createEOperation(multiplicityEClass, MULTIPLICITY___SET_ONE_TO_MANY);

		regularAssociationEClass = createEClass(REGULAR_ASSOCIATION);
		createEAttribute(regularAssociationEClass, REGULAR_ASSOCIATION__TYPE);
		createEReference(regularAssociationEClass, REGULAR_ASSOCIATION__END_A);
		createEReference(regularAssociationEClass, REGULAR_ASSOCIATION__END_B);

		derivationAssociationEClass = createEClass(DERIVATION_ASSOCIATION);
		createEReference(derivationAssociationEClass, DERIVATION_ASSOCIATION__DERIVING_ASSOCIATION);
		createEReference(derivationAssociationEClass, DERIVATION_ASSOCIATION__DERIVED_CLASS);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__GENERIC);
		createEReference(generalizationEClass, GENERALIZATION__SPECIFIC);
		createEOperation(generalizationEClass, GENERALIZATION___GET_GENERALIZATION_SETS);

		generalizationSetEClass = createEClass(GENERALIZATION_SET);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_DISJOINT);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_COMPLETE);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__GENERALIZATIONS);
		createEOperation(generalizationSetEClass, GENERALIZATION_SET___GET_GENERIC);
		createEOperation(generalizationSetEClass, GENERALIZATION_SET___GET_SPECIFICS);

		// Create enums
		endurantTypeEEnum = createEEnum(ENDURANT_TYPE);
		relationTypeEEnum = createEEnum(RELATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classifierEClass.getESuperTypes().add(this.getModelElement());
		ontoUMLClassEClass.getESuperTypes().add(this.getClassifier());
		associationEClass.getESuperTypes().add(this.getClassifier());
		regularAssociationEClass.getESuperTypes().add(this.getAssociation());
		derivationAssociationEClass.getESuperTypes().add(this.getAssociation());
		generalizationEClass.getESuperTypes().add(this.getModelElement());
		generalizationSetEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Elements(), this.getModelElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getModel__GetElementByName__String(), this.getModelElement(), "getElementByName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Alias(), theEcorePackage.getEString(), "alias", "unnamed", 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getModelElement__GetContainerModel(), this.getModel(), "getContainerModel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModelElement__GetReacheableElements(), this.getModelElement(), "getReacheableElements", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getClassifier__GetGeneralizations(), this.getGeneralization(), "getGeneralizations", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassifier__GetSpecializations(), this.getGeneralization(), "getSpecializations", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(ontoUMLClassEClass, OntoUMLClass.class, "OntoUMLClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntoUMLClass__type(), this.getEndurantType(), "_type", "none", 0, 1, OntoUMLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOntoUMLClass__GetParents(), this.getOntoUMLClass(), "getParents", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__GetChildren(), this.getOntoUMLClass(), "getChildren", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsUltimateSortal(), theEcorePackage.getEBoolean(), "isUltimateSortal", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsSortal(), theEcorePackage.getEBoolean(), "isSortal", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsNonSortal(), theEcorePackage.getEBoolean(), "isNonSortal", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsRigid(), theEcorePackage.getEBoolean(), "isRigid", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsSemiRigid(), theEcorePackage.getEBoolean(), "isSemiRigid", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsAntiRigid(), theEcorePackage.getEBoolean(), "isAntiRigid", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsPhase(), theEcorePackage.getEBoolean(), "isPhase", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsRole(), theEcorePackage.getEBoolean(), "isRole", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsSubstantialKind(), theEcorePackage.getEBoolean(), "isSubstantialKind", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOntoUMLClass__IsMomentKind(), theEcorePackage.getEBoolean(), "isMomentKind", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_EndAMultiplicity(), this.getMultiplicity(), null, "endAMultiplicity", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_EndBMultiplicity(), this.getMultiplicity(), null, "endBMultiplicity", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAssociation__GetParents(), this.getAssociation(), "getParents", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssociation__GetChildren(), this.getAssociation(), "getChildren", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(multiplicityEClass, Multiplicity.class, "Multiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicity_LowerBound(), theEcorePackage.getEString(), "lowerBound", "0", 0, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicity_UpperBound(), theEcorePackage.getEString(), "upperBound", "*", 0, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMultiplicity__SetMultiplicity__String_String(), null, "setMultiplicity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "lowerBound", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "upperBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getMultiplicity__SetZeroToOne(), null, "setZeroToOne", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getMultiplicity__SetZeroToMany(), null, "setZeroToMany", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getMultiplicity__SetOneToOne(), null, "setOneToOne", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getMultiplicity__SetOneToMany(), null, "setOneToMany", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(regularAssociationEClass, RegularAssociation.class, "RegularAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegularAssociation__type(), this.getRelationType(), "_type", "none", 0, 1, RegularAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularAssociation_EndA(), this.getOntoUMLClass(), null, "endA", null, 0, 1, RegularAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegularAssociation_EndB(), this.getOntoUMLClass(), null, "endB", null, 0, 1, RegularAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivationAssociationEClass, DerivationAssociation.class, "DerivationAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivationAssociation_DerivingAssociation(), this.getRegularAssociation(), null, "derivingAssociation", null, 0, 1, DerivationAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivationAssociation_DerivedClass(), this.getOntoUMLClass(), null, "derivedClass", null, 0, 1, DerivationAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralization_Generic(), this.getClassifier(), null, "generic", null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_Specific(), this.getClassifier(), null, "specific", null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGeneralization__GetGeneralizationSets(), this.getGeneralizationSet(), "getGeneralizationSets", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(generalizationSetEClass, GeneralizationSet.class, "GeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralizationSet_IsDisjoint(), theEcorePackage.getEBoolean(), "isDisjoint", "false", 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationSet_IsComplete(), theEcorePackage.getEBoolean(), "isComplete", "false", 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizationSet_Generalizations(), this.getGeneralization(), null, "generalizations", null, 0, -1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGeneralizationSet__GetGeneric(), this.getClassifier(), "getGeneric", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getGeneralizationSet__GetSpecifics(), this.getClassifier(), "getSpecifics", 0, -1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(endurantTypeEEnum, EndurantType.class, "EndurantType");
		addEEnumLiteral(endurantTypeEEnum, EndurantType.NONE);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.KIND);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.RELATOR_KIND);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.MODE_KIND);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.QUALITY_KIND);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.SUBKIND);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.ROLE);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.PHASE);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.CATEGORY);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.MIXIN);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.ROLE_MIXIN);
		addEEnumLiteral(endurantTypeEEnum, EndurantType.PHASE_MIXIN);

		initEEnum(relationTypeEEnum, RelationType.class, "RelationType");
		addEEnumLiteral(relationTypeEEnum, RelationType.NONE);
		addEEnumLiteral(relationTypeEEnum, RelationType.DESCRIPTIVE);
		addEEnumLiteral(relationTypeEEnum, RelationType.NON_DESCRIPTIVE);
		addEEnumLiteral(relationTypeEEnum, RelationType.INHERENCE);
		addEEnumLiteral(relationTypeEEnum, RelationType.INVOLVEMENT);
		addEEnumLiteral(relationTypeEEnum, RelationType.DEPENDENCE);

		// Create resource
		createResource(eNS_URI);
	}

} //XcorePackageImpl
