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
	 * The '<em><b>Descriptive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	DESCRIPTIVE(1, "Descriptive", "descriptive"),

	/**
	 * The '<em><b>Non Descriptive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_DESCRIPTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NON_DESCRIPTIVE(2, "NonDescriptive", "non-descriptive"),

	/**
	 * The '<em><b>Inherence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	INHERENCE(3, "Inherence", "inherence"),

	/**
	 * The '<em><b>Involvement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVOLVEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	INVOLVEMENT(4, "Involvement", "involvement"),

	/**
	 * The '<em><b>Dependence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENCE(5, "Dependence", "dependence");

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
	 * The '<em><b>Descriptive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Descriptive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTIVE
	 * @model name="Descriptive" literal="descriptive"
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTIVE_VALUE = 1;

	/**
	 * The '<em><b>Non Descriptive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non Descriptive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_DESCRIPTIVE
	 * @model name="NonDescriptive" literal="non-descriptive"
	 * @generated
	 * @ordered
	 */
	public static final int NON_DESCRIPTIVE_VALUE = 2;

	/**
	 * The '<em><b>Inherence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inherence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INHERENCE
	 * @model name="Inherence" literal="inherence"
	 * @generated
	 * @ordered
	 */
	public static final int INHERENCE_VALUE = 3;

	/**
	 * The '<em><b>Involvement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Involvement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVOLVEMENT
	 * @model name="Involvement" literal="involvement"
	 * @generated
	 * @ordered
	 */
	public static final int INVOLVEMENT_VALUE = 4;

	/**
	 * The '<em><b>Dependence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dependence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCE
	 * @model name="Dependence" literal="dependence"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationType[] VALUES_ARRAY =
		new RelationType[] {
			NONE,
			DESCRIPTIVE,
			NON_DESCRIPTIVE,
			INHERENCE,
			INVOLVEMENT,
			DEPENDENCE,
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
			case DESCRIPTIVE_VALUE: return DESCRIPTIVE;
			case NON_DESCRIPTIVE_VALUE: return NON_DESCRIPTIVE;
			case INHERENCE_VALUE: return INHERENCE;
			case INVOLVEMENT_VALUE: return INVOLVEMENT;
			case DEPENDENCE_VALUE: return DEPENDENCE;
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
