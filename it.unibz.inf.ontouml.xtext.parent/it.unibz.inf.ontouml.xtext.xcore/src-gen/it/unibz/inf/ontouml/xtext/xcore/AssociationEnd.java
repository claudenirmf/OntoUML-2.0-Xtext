/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#getAggregationKind <em>Aggregation Kind</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getAssociationEnd()
 * @model
 * @generated
 */
public interface AssociationEnd extends EObject {
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
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getAssociationEnd_LowerBound()
	 * @model default="0" unique="false"
	 * @generated
	 */
	String getLowerBound();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#getLowerBound <em>Lower Bound</em>}' attribute.
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
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getAssociationEnd_UpperBound()
	 * @model default="*" unique="false"
	 * @generated
	 */
	String getUpperBound();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Kind</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link it.unibz.inf.ontouml.xtext.xcore.AggregationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Kind</em>' attribute.
	 * @see it.unibz.inf.ontouml.xtext.xcore.AggregationKind
	 * @see #setAggregationKind(AggregationKind)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getAssociationEnd_AggregationKind()
	 * @model default="none" unique="false"
	 * @generated
	 */
	AggregationKind getAggregationKind();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.AssociationEnd#getAggregationKind <em>Aggregation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Kind</em>' attribute.
	 * @see it.unibz.inf.ontouml.xtext.xcore.AggregationKind
	 * @see #getAggregationKind()
	 * @generated
	 */
	void setAggregationKind(AggregationKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (&lt;%com.google.common.base.Objects%&gt;.equal(this.getAggregationKind(), &lt;%it.unibz.inf.ontouml.xtext.xcore.AggregationKind%&gt;.AGGREGATION) || &lt;%com.google.common.base.Objects%&gt;.equal(this.getAggregationKind(), &lt;%it.unibz.inf.ontouml.xtext.xcore.AggregationKind%&gt;.COMPOSITION));'"
	 * @generated
	 */
	boolean isRepresentingWhole();

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

} // AssociationEnd
