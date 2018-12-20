/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage
 * @generated
 */
public interface XcoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XcoreFactory eINSTANCE = it.unibz.inf.ontouml.xtext.xcore.impl.XcoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Onto UML Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Onto UML Class</em>'.
	 * @generated
	 */
	OntoUMLClass createOntoUMLClass();

	/**
	 * Returns a new object of class '<em>Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity</em>'.
	 * @generated
	 */
	Multiplicity createMultiplicity();

	/**
	 * Returns a new object of class '<em>Regular Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular Association</em>'.
	 * @generated
	 */
	RegularAssociation createRegularAssociation();

	/**
	 * Returns a new object of class '<em>Derivation Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derivation Association</em>'.
	 * @generated
	 */
	DerivationAssociation createDerivationAssociation();

	/**
	 * Returns a new object of class '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization</em>'.
	 * @generated
	 */
	Generalization createGeneralization();

	/**
	 * Returns a new object of class '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization Set</em>'.
	 * @generated
	 */
	GeneralizationSet createGeneralizationSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XcorePackage getXcorePackage();

} //XcoreFactory
