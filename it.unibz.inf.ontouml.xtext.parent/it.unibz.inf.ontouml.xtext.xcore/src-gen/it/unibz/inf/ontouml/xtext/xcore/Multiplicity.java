/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.Multiplicity#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.Multiplicity#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(String)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getMultiplicity_LowerBound()
	 * @model default="0" unique="false"
	 * @generated
	 */
	String getLowerBound();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.Multiplicity#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(String value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"*"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(String)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getMultiplicity_UpperBound()
	 * @model default="*" unique="false"
	 * @generated
	 */
	String getUpperBound();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.Multiplicity#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model lowerBoundUnique="false" upperBoundUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.setLowerBound(lowerBound);\nthis.setUpperBound(upperBound);'"
	 * @generated
	 */
	void setMultiplicity(String lowerBound, String upperBound);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.setMultiplicity(\"0\", \"1\");'"
	 * @generated
	 */
	void setZeroToOne();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.setMultiplicity(\"0\", \"*\");'"
	 * @generated
	 */
	void setZeroToMany();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.setMultiplicity(\"1\", \"1\");'"
	 * @generated
	 */
	void setOneToOne();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.setMultiplicity(\"*\", \"*\");'"
	 * @generated
	 */
	void setOneToMany();

} // Multiplicity
