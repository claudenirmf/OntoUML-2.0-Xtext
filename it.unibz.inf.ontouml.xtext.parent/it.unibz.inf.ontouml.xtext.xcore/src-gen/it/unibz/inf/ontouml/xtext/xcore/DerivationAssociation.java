/**
 */
package it.unibz.inf.ontouml.xtext.xcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derivation Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getDerivingAssociation <em>Deriving Association</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getDerivedClass <em>Derived Class</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getDerivationAssociation()
 * @model
 * @generated
 */
public interface DerivationAssociation extends Association {
	/**
	 * Returns the value of the '<em><b>Deriving Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deriving Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deriving Association</em>' reference.
	 * @see #setDerivingAssociation(RegularAssociation)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getDerivationAssociation_DerivingAssociation()
	 * @model
	 * @generated
	 */
	RegularAssociation getDerivingAssociation();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getDerivingAssociation <em>Deriving Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deriving Association</em>' reference.
	 * @see #getDerivingAssociation()
	 * @generated
	 */
	void setDerivingAssociation(RegularAssociation value);

	/**
	 * Returns the value of the '<em><b>Derived Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Class</em>' reference.
	 * @see #setDerivedClass(OntoUMLClass)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getDerivationAssociation_DerivedClass()
	 * @model
	 * @generated
	 */
	OntoUMLClass getDerivedClass();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation#getDerivedClass <em>Derived Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Class</em>' reference.
	 * @see #getDerivedClass()
	 * @generated
	 */
	void setDerivedClass(OntoUMLClass value);

} // DerivationAssociation
