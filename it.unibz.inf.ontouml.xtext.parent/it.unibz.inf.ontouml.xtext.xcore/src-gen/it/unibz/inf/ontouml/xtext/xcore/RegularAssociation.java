/**
 */
package it.unibz.inf.ontouml.xtext.xcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#get_type <em>type</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#getEndA <em>End A</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#getEndB <em>End B</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getRegularAssociation()
 * @model
 * @generated
 */
public interface RegularAssociation extends Association {
	/**
	 * Returns the value of the '<em><b>type</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link it.unibz.inf.ontouml.xtext.xcore.RelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>type</em>' attribute.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RelationType
	 * @see #set_type(RelationType)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getRegularAssociation__type()
	 * @model default="none" unique="false"
	 * @generated
	 */
	RelationType get_type();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#get_type <em>type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>type</em>' attribute.
	 * @see it.unibz.inf.ontouml.xtext.xcore.RelationType
	 * @see #get_type()
	 * @generated
	 */
	void set_type(RelationType value);

	/**
	 * Returns the value of the '<em><b>End A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End A</em>' reference.
	 * @see #setEndA(OntoUMLClass)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getRegularAssociation_EndA()
	 * @model
	 * @generated
	 */
	OntoUMLClass getEndA();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#getEndA <em>End A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End A</em>' reference.
	 * @see #getEndA()
	 * @generated
	 */
	void setEndA(OntoUMLClass value);

	/**
	 * Returns the value of the '<em><b>End B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End B</em>' reference.
	 * @see #setEndB(OntoUMLClass)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getRegularAssociation_EndB()
	 * @model
	 * @generated
	 */
	OntoUMLClass getEndB();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#getEndB <em>End B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End B</em>' reference.
	 * @see #getEndB()
	 * @generated
	 */
	void setEndB(OntoUMLClass value);

} // RegularAssociation
