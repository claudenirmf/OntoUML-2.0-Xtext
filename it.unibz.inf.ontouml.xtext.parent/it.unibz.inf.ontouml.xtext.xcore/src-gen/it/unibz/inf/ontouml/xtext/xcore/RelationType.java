/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getRelationType()
 * @model
 * @generated
 */
public enum RelationType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "none"),

	/**
	 * The '<em><b>Material</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	MATERIAL(1, "Material", "material"),

	/**
	 * The '<em><b>Comparative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPARATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPARATIVE(2, "Comparative", "comparative"),

	/**
	 * The '<em><b>Characterization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTERIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	CHARACTERIZATION(3, "Characterization", "characterization"),

	/**
	 * The '<em><b>Mediation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIATION(4, "Mediation", "mediation"),

	/**
	 * The '<em><b>External Depedence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_DEPEDENCE_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL_DEPEDENCE(5, "ExternalDepedence", "external dependence"),

	/**
	 * The '<em><b>Historical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORICAL_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORICAL(6, "Historical", "historical");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None" literal="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Material</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Material</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MATERIAL
	 * @model name="Material" literal="material"
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_VALUE = 1;

	/**
	 * The '<em><b>Comparative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comparative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPARATIVE
	 * @model name="Comparative" literal="comparative"
	 * @generated
	 * @ordered
	 */
	public static final int COMPARATIVE_VALUE = 2;

	/**
	 * The '<em><b>Characterization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Characterization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTERIZATION
	 * @model name="Characterization" literal="characterization"
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTERIZATION_VALUE = 3;

	/**
	 * The '<em><b>Mediation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mediation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIATION
	 * @model name="Mediation" literal="mediation"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIATION_VALUE = 4;

	/**
	 * The '<em><b>External Depedence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>External Depedence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_DEPEDENCE
	 * @model name="ExternalDepedence" literal="external dependence"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_DEPEDENCE_VALUE = 5;

	/**
	 * The '<em><b>Historical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Historical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HISTORICAL
	 * @model name="Historical" literal="historical"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORICAL_VALUE = 6;

	/**
	 * An array of all the '<em><b>Relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationType[] VALUES_ARRAY =
		new RelationType[] {
			NONE,
			MATERIAL,
			COMPARATIVE,
			CHARACTERIZATION,
			MEDIATION,
			EXTERNAL_DEPEDENCE,
			HISTORICAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case MATERIAL_VALUE: return MATERIAL;
			case COMPARATIVE_VALUE: return COMPARATIVE;
			case CHARACTERIZATION_VALUE: return CHARACTERIZATION;
			case MEDIATION_VALUE: return MEDIATION;
			case EXTERNAL_DEPEDENCE_VALUE: return EXTERNAL_DEPEDENCE;
			case HISTORICAL_VALUE: return HISTORICAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RelationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RelationType
