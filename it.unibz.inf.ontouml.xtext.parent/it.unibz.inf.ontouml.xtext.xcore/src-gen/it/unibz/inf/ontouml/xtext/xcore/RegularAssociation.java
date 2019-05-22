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
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#getSource <em>Source</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#getTarget <em>Target</em>}</li>
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
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OntoUMLClass)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getRegularAssociation_Source()
	 * @model
	 * @generated
	 */
	OntoUMLClass getSource();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OntoUMLClass value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(OntoUMLClass)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getRegularAssociation_Target()
	 * @model
	 * @generated
	 */
	OntoUMLClass getTarget();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.RegularAssociation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(OntoUMLClass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (&lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.RelationType%&gt;.MATERIAL) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.RelationType%&gt;.COMPARATIVE));'"
	 * @generated
	 */
	boolean isDescriptive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (((&lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.RelationType%&gt;.HISTORICAL) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.RelationType%&gt;.CHARACTERIZATION)) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.RelationType%&gt;.MEDIATION)) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.RelationType%&gt;.EXTERNAL_DEPEDENCE));'"
	 * @generated
	 */
	boolean isNonDescriptive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (((&lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.RelationType%&gt;.COMPARATIVE) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.RelationType%&gt;.CHARACTERIZATION)) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.RelationType%&gt;.MEDIATION)) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.RelationType%&gt;.EXTERNAL_DEPEDENCE));'"
	 * @generated
	 */
	boolean isInternal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (&lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.RelationType%&gt;.MATERIAL) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.RelationType%&gt;.HISTORICAL));'"
	 * @generated
	 */
	boolean isExternal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (this.getSourceEnd().isRepresentingWhole() || this.getTargetEnd().isRepresentingWhole());'"
	 * @generated
	 */
	boolean isParthood();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSourceEnd().isRepresentingWhole();'"
	 * @generated
	 */
	boolean isSourceAWhole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getTargetEnd().isRepresentingWhole();'"
	 * @generated
	 */
	boolean isTargetAWhole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.isTargetAWhole();'"
	 * @generated
	 */
	boolean isSourceAPart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.isSourceAWhole();'"
	 * @generated
	 */
	boolean isTargetAPart();

} // RegularAssociation
