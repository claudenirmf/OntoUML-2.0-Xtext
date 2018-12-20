/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.Generalization#getGeneric <em>Generic</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.Generalization#getSpecific <em>Specific</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Generic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic</em>' reference.
	 * @see #setGeneric(Classifier)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getGeneralization_Generic()
	 * @model
	 * @generated
	 */
	Classifier getGeneric();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.Generalization#getGeneric <em>Generic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic</em>' reference.
	 * @see #getGeneric()
	 * @generated
	 */
	void setGeneric(Classifier value);

	/**
	 * Returns the value of the '<em><b>Specific</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific</em>' reference.
	 * @see #setSpecific(Classifier)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getGeneralization_Specific()
	 * @model
	 * @generated
	 */
	Classifier getSpecific();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.Generalization#getSpecific <em>Specific</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific</em>' reference.
	 * @see #getSpecific()
	 * @generated
	 */
	void setSpecific(Classifier value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet%&gt;&gt; genSets = new &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet%&gt;&gt;();\n&lt;%org.eclipse.emf.ecore.EObject%&gt; _eContainer = this.eContainer();\nfinal &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt;&gt; _function = new &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt;&gt;()\n{\n\tpublic void accept(final &lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt; it)\n\t{\n\t\tif ((it instanceof &lt;%it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet%&gt;))\n\t\t{\n\t\t\tboolean _contains = ((&lt;%it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet%&gt;)it).getGeneralizations().contains(&lt;%this%&gt;);\n\t\t\tif (_contains)\n\t\t\t{\n\t\t\t\tgenSets.add(((&lt;%it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet%&gt;)it));\n\t\t\t}\n\t\t}\n\t}\n};\n((&lt;%it.unibz.inf.ontouml.xtext.xcore.Model%&gt;) _eContainer).getElements().forEach(_function);\nreturn genSets;'"
	 * @generated
	 */
	EList<GeneralizationSet> getGeneralizationSets();

} // Generalization
