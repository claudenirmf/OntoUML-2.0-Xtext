/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import it.unibz.inf.ontouml.xtext.xcore.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XcoreFactoryImpl extends EFactoryImpl implements XcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XcoreFactory init() {
		try {
			XcoreFactory theXcoreFactory = (XcoreFactory)EPackage.Registry.INSTANCE.getEFactory(XcorePackage.eNS_URI);
			if (theXcoreFactory != null) {
				return theXcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XcorePackage.MODEL: return createModel();
			case XcorePackage.ONTO_UML_CLASS: return createOntoUMLClass();
			case XcorePackage.MULTIPLICITY: return createMultiplicity();
			case XcorePackage.REGULAR_ASSOCIATION: return createRegularAssociation();
			case XcorePackage.DERIVATION_ASSOCIATION: return createDerivationAssociation();
			case XcorePackage.GENERALIZATION: return createGeneralization();
			case XcorePackage.GENERALIZATION_SET: return createGeneralizationSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XcorePackage.ENDURANT_TYPE:
				return createEndurantTypeFromString(eDataType, initialValue);
			case XcorePackage.RELATION_TYPE:
				return createRelationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XcorePackage.ENDURANT_TYPE:
				return convertEndurantTypeToString(eDataType, instanceValue);
			case XcorePackage.RELATION_TYPE:
				return convertRelationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass createOntoUMLClass() {
		OntoUMLClassImpl ontoUMLClass = new OntoUMLClassImpl();
		return ontoUMLClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity createMultiplicity() {
		MultiplicityImpl multiplicity = new MultiplicityImpl();
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularAssociation createRegularAssociation() {
		RegularAssociationImpl regularAssociation = new RegularAssociationImpl();
		return regularAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationAssociation createDerivationAssociation() {
		DerivationAssociationImpl derivationAssociation = new DerivationAssociationImpl();
		return derivationAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet createGeneralizationSet() {
		GeneralizationSetImpl generalizationSet = new GeneralizationSetImpl();
		return generalizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndurantType createEndurantTypeFromString(EDataType eDataType, String initialValue) {
		EndurantType result = EndurantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndurantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType createRelationTypeFromString(EDataType eDataType, String initialValue) {
		RelationType result = RelationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcorePackage getXcorePackage() {
		return (XcorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XcorePackage getPackage() {
		return XcorePackage.eINSTANCE;
	}

} //XcoreFactoryImpl
