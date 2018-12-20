/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.Association#getEndAMultiplicity <em>End AMultiplicity</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.Association#getEndBMultiplicity <em>End BMultiplicity</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getAssociation()
 * @model abstract="true"
 * @generated
 */
public interface Association extends Classifier {
	/**
	 * Returns the value of the '<em><b>End AMultiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End AMultiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End AMultiplicity</em>' containment reference.
	 * @see #setEndAMultiplicity(Multiplicity)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getAssociation_EndAMultiplicity()
	 * @model containment="true"
	 * @generated
	 */
	Multiplicity getEndAMultiplicity();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.Association#getEndAMultiplicity <em>End AMultiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End AMultiplicity</em>' containment reference.
	 * @see #getEndAMultiplicity()
	 * @generated
	 */
	void setEndAMultiplicity(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>End BMultiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End BMultiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End BMultiplicity</em>' containment reference.
	 * @see #setEndBMultiplicity(Multiplicity)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getAssociation_EndBMultiplicity()
	 * @model containment="true"
	 * @generated
	 */
	Multiplicity getEndBMultiplicity();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.Association#getEndBMultiplicity <em>End BMultiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End BMultiplicity</em>' containment reference.
	 * @see #getEndBMultiplicity()
	 * @generated
	 */
	void setEndBMultiplicity(Multiplicity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the immediate ancestors (or parents) of the OntoUMLClass.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Association%&gt;&gt; _xblockexpression = null;\n{\n\tfinal &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Association%&gt;&gt; parents = new &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Association%&gt;&gt;();\n\tfinal &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt; _function = new &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt;()\n\t{\n\t\tpublic void accept(final &lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt; it)\n\t\t{\n\t\t\tfinal &lt;%it.unibz.inf.ontouml.xtext.xcore.Classifier%&gt; g = it.getGeneric();\n\t\t\tif ((g instanceof &lt;%it.unibz.inf.ontouml.xtext.xcore.Association%&gt;))\n\t\t\t{\n\t\t\t\tparents.add(((&lt;%it.unibz.inf.ontouml.xtext.xcore.Association%&gt;)g));\n\t\t\t}\n\t\t}\n\t};\n\tthis.getGeneralizations().forEach(_function);\n\t_xblockexpression = parents;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	EList<Association> getParents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the immediate descendents (or children) of the OntoUMLClass.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Association%&gt;&gt; _xblockexpression = null;\n{\n\tfinal &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Association%&gt;&gt; children = new &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Association%&gt;&gt;();\n\tfinal &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt; _function = new &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt;()\n\t{\n\t\tpublic void accept(final &lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt; it)\n\t\t{\n\t\t\tfinal &lt;%it.unibz.inf.ontouml.xtext.xcore.Classifier%&gt; s = it.getSpecific();\n\t\t\tif ((s instanceof &lt;%it.unibz.inf.ontouml.xtext.xcore.Association%&gt;))\n\t\t\t{\n\t\t\t\tchildren.add(((&lt;%it.unibz.inf.ontouml.xtext.xcore.Association%&gt;)s));\n\t\t\t}\n\t\t}\n\t};\n\tthis.getSpecializations().forEach(_function);\n\t_xblockexpression = children;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	EList<Association> getChildren();

} // Association
