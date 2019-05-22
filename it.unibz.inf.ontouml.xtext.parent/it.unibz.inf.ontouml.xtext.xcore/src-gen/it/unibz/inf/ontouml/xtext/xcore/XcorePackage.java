/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.unibz.inf.ontouml.xtext.xcore.XcoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='it.unibz.inf.ontouml.xtext.xcore/src-gen' basePackage='it.unibz.inf.ontouml.xtext'"
 * @generated
 */
public interface XcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.unibz.it/ontouml/xtext/xcore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XcorePackage eINSTANCE = it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.ModelImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Element By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___GET_ELEMENT_BY_NAME__STRING = 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.ModelElementImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ALIAS = 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Container Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___GET_CONTAINER_MODEL = 0;

	/**
	 * The operation id for the '<em>Get Reacheable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___GET_REACHEABLE_ELEMENTS = 1;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.ClassifierImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ALIAS = MODEL_ELEMENT__ALIAS;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Container Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___GET_CONTAINER_MODEL = MODEL_ELEMENT___GET_CONTAINER_MODEL;

	/**
	 * The operation id for the '<em>Get Reacheable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___GET_REACHEABLE_ELEMENTS = MODEL_ELEMENT___GET_REACHEABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Generalizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___GET_GENERALIZATIONS = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Specializations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___GET_SPECIALIZATIONS = MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.OntoUMLClassImpl <em>Onto UML Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.OntoUMLClassImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getOntoUMLClass()
	 * @generated
	 */
	int ONTO_UML_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS__ALIAS = CLASSIFIER__ALIAS;

	/**
	 * The feature id for the '<em><b>type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS__TYPE = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Onto UML Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Container Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___GET_CONTAINER_MODEL = CLASSIFIER___GET_CONTAINER_MODEL;

	/**
	 * The operation id for the '<em>Get Reacheable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___GET_REACHEABLE_ELEMENTS = CLASSIFIER___GET_REACHEABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Generalizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___GET_GENERALIZATIONS = CLASSIFIER___GET_GENERALIZATIONS;

	/**
	 * The operation id for the '<em>Get Specializations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___GET_SPECIALIZATIONS = CLASSIFIER___GET_SPECIALIZATIONS;

	/**
	 * The operation id for the '<em>Get Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___GET_PARENTS = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___GET_CHILDREN = CLASSIFIER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Ultimate Sortal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_ULTIMATE_SORTAL = CLASSIFIER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Sortal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_SORTAL = CLASSIFIER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Non Sortal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_NON_SORTAL = CLASSIFIER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Rigid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_RIGID = CLASSIFIER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Semi Rigid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_SEMI_RIGID = CLASSIFIER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Anti Rigid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_ANTI_RIGID = CLASSIFIER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Phase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_PHASE = CLASSIFIER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_ROLE = CLASSIFIER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Substantial Kind</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_SUBSTANTIAL_KIND = CLASSIFIER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Moment Kind</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS___IS_MOMENT_KIND = CLASSIFIER_OPERATION_COUNT + 11;

	/**
	 * The number of operations of the '<em>Onto UML Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTO_UML_CLASS_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 12;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.AssociationImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ALIAS = CLASSIFIER__ALIAS;

	/**
	 * The feature id for the '<em><b>Source End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_END = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_END = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Container Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___GET_CONTAINER_MODEL = CLASSIFIER___GET_CONTAINER_MODEL;

	/**
	 * The operation id for the '<em>Get Reacheable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___GET_REACHEABLE_ELEMENTS = CLASSIFIER___GET_REACHEABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Generalizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___GET_GENERALIZATIONS = CLASSIFIER___GET_GENERALIZATIONS;

	/**
	 * The operation id for the '<em>Get Specializations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___GET_SPECIALIZATIONS = CLASSIFIER___GET_SPECIALIZATIONS;

	/**
	 * The operation id for the '<em>Get Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___GET_PARENTS = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___GET_CHILDREN = CLASSIFIER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.AssociationEndImpl <em>Association End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.AssociationEndImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getAssociationEnd()
	 * @generated
	 */
	int ASSOCIATION_END = 5;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__UPPER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__AGGREGATION_KIND = 2;

	/**
	 * The number of structural features of the '<em>Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is Representing Whole</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END___IS_REPRESENTING_WHOLE = 0;

	/**
	 * The operation id for the '<em>Set Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END___SET_MULTIPLICITY__STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Set Zero To One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END___SET_ZERO_TO_ONE = 2;

	/**
	 * The operation id for the '<em>Set Zero To Many</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END___SET_ZERO_TO_MANY = 3;

	/**
	 * The operation id for the '<em>Set One To One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END___SET_ONE_TO_ONE = 4;

	/**
	 * The operation id for the '<em>Set One To Many</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END___SET_ONE_TO_MANY = 5;

	/**
	 * The number of operations of the '<em>Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.RegularAssociationImpl <em>Regular Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.RegularAssociationImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getRegularAssociation()
	 * @generated
	 */
	int REGULAR_ASSOCIATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION__ALIAS = ASSOCIATION__ALIAS;

	/**
	 * The feature id for the '<em><b>Source End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION__SOURCE_END = ASSOCIATION__SOURCE_END;

	/**
	 * The feature id for the '<em><b>Target End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION__TARGET_END = ASSOCIATION__TARGET_END;

	/**
	 * The feature id for the '<em><b>type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION__TYPE = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION__SOURCE = ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION__TARGET = ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Regular Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Container Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___GET_CONTAINER_MODEL = ASSOCIATION___GET_CONTAINER_MODEL;

	/**
	 * The operation id for the '<em>Get Reacheable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___GET_REACHEABLE_ELEMENTS = ASSOCIATION___GET_REACHEABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Generalizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___GET_GENERALIZATIONS = ASSOCIATION___GET_GENERALIZATIONS;

	/**
	 * The operation id for the '<em>Get Specializations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___GET_SPECIALIZATIONS = ASSOCIATION___GET_SPECIALIZATIONS;

	/**
	 * The operation id for the '<em>Get Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___GET_PARENTS = ASSOCIATION___GET_PARENTS;

	/**
	 * The operation id for the '<em>Get Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___GET_CHILDREN = ASSOCIATION___GET_CHILDREN;

	/**
	 * The operation id for the '<em>Is Descriptive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___IS_DESCRIPTIVE = ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Non Descriptive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___IS_NON_DESCRIPTIVE = ASSOCIATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Internal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___IS_INTERNAL = ASSOCIATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is External</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___IS_EXTERNAL = ASSOCIATION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Parthood</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___IS_PARTHOOD = ASSOCIATION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Source AWhole</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___IS_SOURCE_AWHOLE = ASSOCIATION_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Target AWhole</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___IS_TARGET_AWHOLE = ASSOCIATION_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Source APart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___IS_SOURCE_APART = ASSOCIATION_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Target APart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION___IS_TARGET_APART = ASSOCIATION_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Regular Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_ASSOCIATION_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.DerivationAssociationImpl <em>Derivation Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.DerivationAssociationImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getDerivationAssociation()
	 * @generated
	 */
	int DERIVATION_ASSOCIATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION__ALIAS = ASSOCIATION__ALIAS;

	/**
	 * The feature id for the '<em><b>Source End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION__SOURCE_END = ASSOCIATION__SOURCE_END;

	/**
	 * The feature id for the '<em><b>Target End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION__TARGET_END = ASSOCIATION__TARGET_END;

	/**
	 * The feature id for the '<em><b>Deriving Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION__DERIVING_ASSOCIATION = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION__DERIVED_CLASS = ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Derivation Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Container Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION___GET_CONTAINER_MODEL = ASSOCIATION___GET_CONTAINER_MODEL;

	/**
	 * The operation id for the '<em>Get Reacheable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION___GET_REACHEABLE_ELEMENTS = ASSOCIATION___GET_REACHEABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Generalizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION___GET_GENERALIZATIONS = ASSOCIATION___GET_GENERALIZATIONS;

	/**
	 * The operation id for the '<em>Get Specializations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION___GET_SPECIALIZATIONS = ASSOCIATION___GET_SPECIALIZATIONS;

	/**
	 * The operation id for the '<em>Get Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION___GET_PARENTS = ASSOCIATION___GET_PARENTS;

	/**
	 * The operation id for the '<em>Get Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION___GET_CHILDREN = ASSOCIATION___GET_CHILDREN;

	/**
	 * The operation id for the '<em>Get Deriving End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION___GET_DERIVING_END = ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Derived End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION___GET_DERIVED_END = ASSOCIATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION___GET_SOURCE = ASSOCIATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION___GET_TARGET = ASSOCIATION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Derivation Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_ASSOCIATION_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__ALIAS = MODEL_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Generic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERIC = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SPECIFIC = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Container Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION___GET_CONTAINER_MODEL = MODEL_ELEMENT___GET_CONTAINER_MODEL;

	/**
	 * The operation id for the '<em>Get Reacheable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION___GET_REACHEABLE_ELEMENTS = MODEL_ELEMENT___GET_REACHEABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Generalization Sets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION___GET_GENERALIZATION_SETS = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationSetImpl
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getGeneralizationSet()
	 * @generated
	 */
	int GENERALIZATION_SET = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__ALIAS = MODEL_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Is Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__IS_DISJOINT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__IS_COMPLETE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generalizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__GENERALIZATIONS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Container Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___GET_CONTAINER_MODEL = MODEL_ELEMENT___GET_CONTAINER_MODEL;

	/**
	 * The operation id for the '<em>Get Reacheable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___GET_REACHEABLE_ELEMENTS = MODEL_ELEMENT___GET_REACHEABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Generic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___GET_GENERIC = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Specifics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___GET_SPECIFICS = MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.EndurantType <em>Endurant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.EndurantType
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getEndurantType()
	 * @generated
	 */
	int ENDURANT_TYPE = 10;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.AggregationKind <em>Aggregation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.AggregationKind
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getAggregationKind()
	 * @generated
	 */
	int AGGREGATION_KIND = 11;

	/**
	 * The meta object id for the '{@link it.unibz.inf.ontouml.xtext.xcore.RelationType <em>Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unibz.inf.ontouml.xtext.xcore.RelationType
	 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unibz.inf.ontouml.xtext.xcore.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.Model#getElementByName(java.lang.String) <em>Get Element By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Element By Name</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Model#getElementByName(java.lang.String)
	 * @generated
	 */
	EOperation getModel__GetElementByName__String();

	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.inf.ontouml.xtext.xcore.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.inf.ontouml.xtext.xcore.ModelElement#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.ModelElement#getAlias()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Alias();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.ModelElement#getContainerModel() <em>Get Container Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container Model</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.ModelElement#getContainerModel()
	 * @generated
	 */
	EOperation getModelElement__GetContainerModel();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.ModelElement#getReacheableElements() <em>Get Reacheable Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reacheable Elements</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.ModelElement#getReacheableElements()
	 * @generated
	 */
	EOperation getModelElement__GetReacheableElements();

	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.Classifier#getGeneralizations() <em>Get Generalizations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Generalizations</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Classifier#getGeneralizations()
	 * @generated
	 */
	EOperation getClassifier__GetGeneralizations();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.Classifier#getSpecializations() <em>Get Specializations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Specializations</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Classifier#getSpecializations()
	 * @generated
	 */
	EOperation getClassifier__GetSpecializations();

	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass <em>Onto UML Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Onto UML Class</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass
	 * @generated
	 */
	EClass getOntoUMLClass();

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#get_type <em>type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>type</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#get_type()
	 * @see #getOntoUMLClass()
	 * @generated
	 */
	EAttribute getOntoUMLClass__type();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#getParents() <em>Get Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parents</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#getParents()
	 * @generated
	 */
	EOperation getOntoUMLClass__GetParents();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#getChildren() <em>Get Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Children</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#getChildren()
	 * @generated
	 */
	EOperation getOntoUMLClass__GetChildren();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isUltimateSortal() <em>Is Ultimate Sortal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Ultimate Sortal</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isUltimateSortal()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsUltimateSortal();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isSortal() <em>Is Sortal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sortal</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isSortal()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsSortal();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isNonSortal() <em>Is Non Sortal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Non Sortal</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isNonSortal()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsNonSortal();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isRigid() <em>Is Rigid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Rigid</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isRigid()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsRigid();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isSemiRigid() <em>Is Semi Rigid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Semi Rigid</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isSemiRigid()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsSemiRigid();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isAntiRigid() <em>Is Anti Rigid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Anti Rigid</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isAntiRigid()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsAntiRigid();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isPhase() <em>Is Phase</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Phase</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isPhase()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsPhase();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isRole() <em>Is Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Role</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isRole()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsRole();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isSubstantialKind() <em>Is Substantial Kind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Substantial Kind</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isSubstantialKind()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsSubstantialKind();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isMomentKind() <em>Is Moment Kind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Moment Kind</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#isMomentKind()
	 * @generated
	 */
	EOperation getOntoUMLClass__IsMomentKind();

	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link it.unibz.inf.ontouml.xtext.xcore.Association#getSourceEnd <em>Source End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source End</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Association#getSourceEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_SourceEnd();

	/**
	 * Returns the meta object for the containment reference '{@link it.unibz.inf.ontouml.xtext.xcore.Association#getTargetEnd <em>Target End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target End</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Association#getTargetEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_TargetEnd();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.Association#getParents() <em>Get Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parents</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Association#getParents()
	 * @generated
	 */
	EOperation getAssociation__GetParents();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.Association#getChildren() <em>Get Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Children</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Association#getChildren()
	 * @generated
	 */
	EOperation getAssociation__GetChildren();

	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association End</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.AssociationEnd
	 * @generated
	 */
	EClass getAssociationEnd();

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#getLowerBound()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#getUpperBound()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#getAggregationKind <em>Aggregation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation Kind</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#getAggregationKind()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_AggregationKind();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#isRepresentingWhole() <em>Is Representing Whole</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Representing Whole</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#isRepresentingWhole()
	 * @generated
	 */
	EOperation getAssociationEnd__IsRepresentingWhole();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#setMultiplicity(java.lang.String, java.lang.String) <em>Set Multiplicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Multiplicity</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#setMultiplicity(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAssociationEnd__SetMultiplicity__String_String();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#setZeroToOne() <em>Set Zero To One</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Zero To One</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#setZeroToOne()
	 * @generated
	 */
	EOperation getAssociationEnd__SetZeroToOne();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#setZeroToMany() <em>Set Zero To Many</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Zero To Many</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#setZeroToMany()
	 * @generated
	 */
	EOperation getAssociationEnd__SetZeroToMany();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#setOneToOne() <em>Set One To One</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set One To One</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#setOneToOne()
	 * @generated
	 */
	EOperation getAssociationEnd__SetOneToOne();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#setOneToMany() <em>Set One To Many</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set One To Many</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#setOneToMany()
	 * @generated
	 */
	EOperation getAssociationEnd__SetOneToMany();

	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation <em>Regular Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Association</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RegularAssociation
	 * @generated
	 */
	EClass getRegularAssociation();

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#get_type <em>type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>type</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#get_type()
	 * @see #getRegularAssociation()
	 * @generated
	 */
	EAttribute getRegularAssociation__type();

	/**
	 * Returns the meta object for the reference '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#getSource()
	 * @see #getRegularAssociation()
	 * @generated
	 */
	EReference getRegularAssociation_Source();

	/**
	 * Returns the meta object for the reference '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#getTarget()
	 * @see #getRegularAssociation()
	 * @generated
	 */
	EReference getRegularAssociation_Target();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isDescriptive() <em>Is Descriptive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Descriptive</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isDescriptive()
	 * @generated
	 */
	EOperation getRegularAssociation__IsDescriptive();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isNonDescriptive() <em>Is Non Descriptive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Non Descriptive</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isNonDescriptive()
	 * @generated
	 */
	EOperation getRegularAssociation__IsNonDescriptive();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isInternal() <em>Is Internal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Internal</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isInternal()
	 * @generated
	 */
	EOperation getRegularAssociation__IsInternal();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isExternal() <em>Is External</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is External</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isExternal()
	 * @generated
	 */
	EOperation getRegularAssociation__IsExternal();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isParthood() <em>Is Parthood</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Parthood</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isParthood()
	 * @generated
	 */
	EOperation getRegularAssociation__IsParthood();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isSourceAWhole() <em>Is Source AWhole</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Source AWhole</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isSourceAWhole()
	 * @generated
	 */
	EOperation getRegularAssociation__IsSourceAWhole();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isTargetAWhole() <em>Is Target AWhole</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Target AWhole</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isTargetAWhole()
	 * @generated
	 */
	EOperation getRegularAssociation__IsTargetAWhole();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isSourceAPart() <em>Is Source APart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Source APart</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isSourceAPart()
	 * @generated
	 */
	EOperation getRegularAssociation__IsSourceAPart();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isTargetAPart() <em>Is Target APart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Target APart</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#isTargetAPart()
	 * @generated
	 */
	EOperation getRegularAssociation__IsTargetAPart();

	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation <em>Derivation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derivation Association</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation
	 * @generated
	 */
	EClass getDerivationAssociation();

	/**
	 * Returns the meta object for the reference '{@link it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getDerivingAssociation <em>Deriving Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deriving Association</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getDerivingAssociation()
	 * @see #getDerivationAssociation()
	 * @generated
	 */
	EReference getDerivationAssociation_DerivingAssociation();

	/**
	 * Returns the meta object for the reference '{@link it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getDerivedClass <em>Derived Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Derived Class</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getDerivedClass()
	 * @see #getDerivationAssociation()
	 * @generated
	 */
	EReference getDerivationAssociation_DerivedClass();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getDerivingEnd() <em>Get Deriving End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Deriving End</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getDerivingEnd()
	 * @generated
	 */
	EOperation getDerivationAssociation__GetDerivingEnd();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getDerivedEnd() <em>Get Derived End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Derived End</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getDerivedEnd()
	 * @generated
	 */
	EOperation getDerivationAssociation__GetDerivedEnd();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getSource() <em>Get Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getSource()
	 * @generated
	 */
	EOperation getDerivationAssociation__GetSource();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getTarget() <em>Get Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getTarget()
	 * @generated
	 */
	EOperation getDerivationAssociation__GetTarget();

	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the reference '{@link it.unibz.inf.ontouml.xtext.xcore.Generalization#getGeneric <em>Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generic</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Generalization#getGeneric()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Generic();

	/**
	 * Returns the meta object for the reference '{@link it.unibz.inf.ontouml.xtext.xcore.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specific</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Generalization#getSpecific()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Specific();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.Generalization#getGeneralizationSets() <em>Get Generalization Sets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Generalization Sets</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.Generalization#getGeneralizationSets()
	 * @generated
	 */
	EOperation getGeneralization__GetGeneralizationSets();

	/**
	 * Returns the meta object for class '{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Set</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet
	 * @generated
	 */
	EClass getGeneralizationSet();

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disjoint</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#isIsDisjoint()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsDisjoint();

	/**
	 * Returns the meta object for the attribute '{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#isIsComplete <em>Is Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Complete</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#isIsComplete()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsComplete();

	/**
	 * Returns the meta object for the reference list '{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#getGeneralizations <em>Generalizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generalizations</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#getGeneralizations()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_Generalizations();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#getGeneric() <em>Get Generic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Generic</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#getGeneric()
	 * @generated
	 */
	EOperation getGeneralizationSet__GetGeneric();

	/**
	 * Returns the meta object for the '{@link it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#getSpecifics() <em>Get Specifics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Specifics</em>' operation.
	 * @see it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet#getSpecifics()
	 * @generated
	 */
	EOperation getGeneralizationSet__GetSpecifics();

	/**
	 * Returns the meta object for enum '{@link it.unibz.inf.ontouml.xtext.xcore.EndurantType <em>Endurant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endurant Type</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.EndurantType
	 * @generated
	 */
	EEnum getEndurantType();

	/**
	 * Returns the meta object for enum '{@link it.unibz.inf.ontouml.xtext.xcore.AggregationKind <em>Aggregation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Kind</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.AggregationKind
	 * @generated
	 */
	EEnum getAggregationKind();

	/**
	 * Returns the meta object for enum '{@link it.unibz.inf.ontouml.xtext.xcore.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Type</em>'.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RelationType
	 * @generated
	 */
	EEnum getRelationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XcoreFactory getXcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.ModelImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Get Element By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___GET_ELEMENT_BY_NAME__STRING = eINSTANCE.getModel__GetElementByName__String();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.ModelElementImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__ALIAS = eINSTANCE.getModelElement_Alias();

		/**
		 * The meta object literal for the '<em><b>Get Container Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT___GET_CONTAINER_MODEL = eINSTANCE.getModelElement__GetContainerModel();

		/**
		 * The meta object literal for the '<em><b>Get Reacheable Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT___GET_REACHEABLE_ELEMENTS = eINSTANCE.getModelElement__GetReacheableElements();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.ClassifierImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Get Generalizations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___GET_GENERALIZATIONS = eINSTANCE.getClassifier__GetGeneralizations();

		/**
		 * The meta object literal for the '<em><b>Get Specializations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___GET_SPECIALIZATIONS = eINSTANCE.getClassifier__GetSpecializations();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.OntoUMLClassImpl <em>Onto UML Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.OntoUMLClassImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getOntoUMLClass()
		 * @generated
		 */
		EClass ONTO_UML_CLASS = eINSTANCE.getOntoUMLClass();

		/**
		 * The meta object literal for the '<em><b>type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTO_UML_CLASS__TYPE = eINSTANCE.getOntoUMLClass__type();

		/**
		 * The meta object literal for the '<em><b>Get Parents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___GET_PARENTS = eINSTANCE.getOntoUMLClass__GetParents();

		/**
		 * The meta object literal for the '<em><b>Get Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___GET_CHILDREN = eINSTANCE.getOntoUMLClass__GetChildren();

		/**
		 * The meta object literal for the '<em><b>Is Ultimate Sortal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_ULTIMATE_SORTAL = eINSTANCE.getOntoUMLClass__IsUltimateSortal();

		/**
		 * The meta object literal for the '<em><b>Is Sortal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_SORTAL = eINSTANCE.getOntoUMLClass__IsSortal();

		/**
		 * The meta object literal for the '<em><b>Is Non Sortal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_NON_SORTAL = eINSTANCE.getOntoUMLClass__IsNonSortal();

		/**
		 * The meta object literal for the '<em><b>Is Rigid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_RIGID = eINSTANCE.getOntoUMLClass__IsRigid();

		/**
		 * The meta object literal for the '<em><b>Is Semi Rigid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_SEMI_RIGID = eINSTANCE.getOntoUMLClass__IsSemiRigid();

		/**
		 * The meta object literal for the '<em><b>Is Anti Rigid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_ANTI_RIGID = eINSTANCE.getOntoUMLClass__IsAntiRigid();

		/**
		 * The meta object literal for the '<em><b>Is Phase</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_PHASE = eINSTANCE.getOntoUMLClass__IsPhase();

		/**
		 * The meta object literal for the '<em><b>Is Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_ROLE = eINSTANCE.getOntoUMLClass__IsRole();

		/**
		 * The meta object literal for the '<em><b>Is Substantial Kind</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_SUBSTANTIAL_KIND = eINSTANCE.getOntoUMLClass__IsSubstantialKind();

		/**
		 * The meta object literal for the '<em><b>Is Moment Kind</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTO_UML_CLASS___IS_MOMENT_KIND = eINSTANCE.getOntoUMLClass__IsMomentKind();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.AssociationImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Source End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE_END = eINSTANCE.getAssociation_SourceEnd();

		/**
		 * The meta object literal for the '<em><b>Target End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET_END = eINSTANCE.getAssociation_TargetEnd();

		/**
		 * The meta object literal for the '<em><b>Get Parents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSOCIATION___GET_PARENTS = eINSTANCE.getAssociation__GetParents();

		/**
		 * The meta object literal for the '<em><b>Get Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSOCIATION___GET_CHILDREN = eINSTANCE.getAssociation__GetChildren();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.AssociationEndImpl <em>Association End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.AssociationEndImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getAssociationEnd()
		 * @generated
		 */
		EClass ASSOCIATION_END = eINSTANCE.getAssociationEnd();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__LOWER_BOUND = eINSTANCE.getAssociationEnd_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__UPPER_BOUND = eINSTANCE.getAssociationEnd_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Aggregation Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__AGGREGATION_KIND = eINSTANCE.getAssociationEnd_AggregationKind();

		/**
		 * The meta object literal for the '<em><b>Is Representing Whole</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSOCIATION_END___IS_REPRESENTING_WHOLE = eINSTANCE.getAssociationEnd__IsRepresentingWhole();

		/**
		 * The meta object literal for the '<em><b>Set Multiplicity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSOCIATION_END___SET_MULTIPLICITY__STRING_STRING = eINSTANCE.getAssociationEnd__SetMultiplicity__String_String();

		/**
		 * The meta object literal for the '<em><b>Set Zero To One</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSOCIATION_END___SET_ZERO_TO_ONE = eINSTANCE.getAssociationEnd__SetZeroToOne();

		/**
		 * The meta object literal for the '<em><b>Set Zero To Many</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSOCIATION_END___SET_ZERO_TO_MANY = eINSTANCE.getAssociationEnd__SetZeroToMany();

		/**
		 * The meta object literal for the '<em><b>Set One To One</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSOCIATION_END___SET_ONE_TO_ONE = eINSTANCE.getAssociationEnd__SetOneToOne();

		/**
		 * The meta object literal for the '<em><b>Set One To Many</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSOCIATION_END___SET_ONE_TO_MANY = eINSTANCE.getAssociationEnd__SetOneToMany();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.RegularAssociationImpl <em>Regular Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.RegularAssociationImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getRegularAssociation()
		 * @generated
		 */
		EClass REGULAR_ASSOCIATION = eINSTANCE.getRegularAssociation();

		/**
		 * The meta object literal for the '<em><b>type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_ASSOCIATION__TYPE = eINSTANCE.getRegularAssociation__type();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_ASSOCIATION__SOURCE = eINSTANCE.getRegularAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGULAR_ASSOCIATION__TARGET = eINSTANCE.getRegularAssociation_Target();

		/**
		 * The meta object literal for the '<em><b>Is Descriptive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGULAR_ASSOCIATION___IS_DESCRIPTIVE = eINSTANCE.getRegularAssociation__IsDescriptive();

		/**
		 * The meta object literal for the '<em><b>Is Non Descriptive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGULAR_ASSOCIATION___IS_NON_DESCRIPTIVE = eINSTANCE.getRegularAssociation__IsNonDescriptive();

		/**
		 * The meta object literal for the '<em><b>Is Internal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGULAR_ASSOCIATION___IS_INTERNAL = eINSTANCE.getRegularAssociation__IsInternal();

		/**
		 * The meta object literal for the '<em><b>Is External</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGULAR_ASSOCIATION___IS_EXTERNAL = eINSTANCE.getRegularAssociation__IsExternal();

		/**
		 * The meta object literal for the '<em><b>Is Parthood</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGULAR_ASSOCIATION___IS_PARTHOOD = eINSTANCE.getRegularAssociation__IsParthood();

		/**
		 * The meta object literal for the '<em><b>Is Source AWhole</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGULAR_ASSOCIATION___IS_SOURCE_AWHOLE = eINSTANCE.getRegularAssociation__IsSourceAWhole();

		/**
		 * The meta object literal for the '<em><b>Is Target AWhole</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGULAR_ASSOCIATION___IS_TARGET_AWHOLE = eINSTANCE.getRegularAssociation__IsTargetAWhole();

		/**
		 * The meta object literal for the '<em><b>Is Source APart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGULAR_ASSOCIATION___IS_SOURCE_APART = eINSTANCE.getRegularAssociation__IsSourceAPart();

		/**
		 * The meta object literal for the '<em><b>Is Target APart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGULAR_ASSOCIATION___IS_TARGET_APART = eINSTANCE.getRegularAssociation__IsTargetAPart();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.DerivationAssociationImpl <em>Derivation Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.DerivationAssociationImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getDerivationAssociation()
		 * @generated
		 */
		EClass DERIVATION_ASSOCIATION = eINSTANCE.getDerivationAssociation();

		/**
		 * The meta object literal for the '<em><b>Deriving Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION_ASSOCIATION__DERIVING_ASSOCIATION = eINSTANCE.getDerivationAssociation_DerivingAssociation();

		/**
		 * The meta object literal for the '<em><b>Derived Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION_ASSOCIATION__DERIVED_CLASS = eINSTANCE.getDerivationAssociation_DerivedClass();

		/**
		 * The meta object literal for the '<em><b>Get Deriving End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DERIVATION_ASSOCIATION___GET_DERIVING_END = eINSTANCE.getDerivationAssociation__GetDerivingEnd();

		/**
		 * The meta object literal for the '<em><b>Get Derived End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DERIVATION_ASSOCIATION___GET_DERIVED_END = eINSTANCE.getDerivationAssociation__GetDerivedEnd();

		/**
		 * The meta object literal for the '<em><b>Get Source</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DERIVATION_ASSOCIATION___GET_SOURCE = eINSTANCE.getDerivationAssociation__GetSource();

		/**
		 * The meta object literal for the '<em><b>Get Target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DERIVATION_ASSOCIATION___GET_TARGET = eINSTANCE.getDerivationAssociation__GetTarget();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>Generic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERIC = eINSTANCE.getGeneralization_Generic();

		/**
		 * The meta object literal for the '<em><b>Specific</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SPECIFIC = eINSTANCE.getGeneralization_Specific();

		/**
		 * The meta object literal for the '<em><b>Get Generalization Sets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERALIZATION___GET_GENERALIZATION_SETS = eINSTANCE.getGeneralization__GetGeneralizationSets();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationSetImpl
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getGeneralizationSet()
		 * @generated
		 */
		EClass GENERALIZATION_SET = eINSTANCE.getGeneralizationSet();

		/**
		 * The meta object literal for the '<em><b>Is Disjoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__IS_DISJOINT = eINSTANCE.getGeneralizationSet_IsDisjoint();

		/**
		 * The meta object literal for the '<em><b>Is Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__IS_COMPLETE = eINSTANCE.getGeneralizationSet_IsComplete();

		/**
		 * The meta object literal for the '<em><b>Generalizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_SET__GENERALIZATIONS = eINSTANCE.getGeneralizationSet_Generalizations();

		/**
		 * The meta object literal for the '<em><b>Get Generic</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERALIZATION_SET___GET_GENERIC = eINSTANCE.getGeneralizationSet__GetGeneric();

		/**
		 * The meta object literal for the '<em><b>Get Specifics</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERALIZATION_SET___GET_SPECIFICS = eINSTANCE.getGeneralizationSet__GetSpecifics();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.EndurantType <em>Endurant Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.EndurantType
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getEndurantType()
		 * @generated
		 */
		EEnum ENDURANT_TYPE = eINSTANCE.getEndurantType();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.AggregationKind <em>Aggregation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.AggregationKind
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getAggregationKind()
		 * @generated
		 */
		EEnum AGGREGATION_KIND = eINSTANCE.getAggregationKind();

		/**
		 * The meta object literal for the '{@link it.unibz.inf.ontouml.xtext.xcore.RelationType <em>Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unibz.inf.ontouml.xtext.xcore.RelationType
		 * @see it.unibz.inf.ontouml.xtext.xcore.impl.XcorePackageImpl#getRelationType()
		 * @generated
		 */
		EEnum RELATION_TYPE = eINSTANCE.getRelationType();

	}

} //XcorePackage
