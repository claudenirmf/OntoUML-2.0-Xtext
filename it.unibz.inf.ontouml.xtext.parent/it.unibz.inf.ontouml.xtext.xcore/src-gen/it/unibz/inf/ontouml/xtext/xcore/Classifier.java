/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends ModelElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns generalizations of the Classifier, i.e. inheritance links towards
	 * its parents (or immediate ancestors).
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt; _xblockexpression = null;\n{\n\tfinal &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt; generalizations = new &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt;();\n\t&lt;%org.eclipse.emf.ecore.EObject%&gt; _eContainer = this.eContainer();\n\tfinal &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt;&gt; _function = new &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt;&gt;()\n\t{\n\t\tpublic void accept(final &lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt; e)\n\t\t{\n\t\t\tif ((e instanceof &lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;))\n\t\t\t{\n\t\t\t\t&lt;%it.unibz.inf.ontouml.xtext.xcore.Classifier%&gt; _specific = ((&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;)e).getSpecific();\n\t\t\t\tboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(_specific, &lt;%this%&gt;);\n\t\t\t\tif (_equals)\n\t\t\t\t{\n\t\t\t\t\tgeneralizations.add(((&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;)e));\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t};\n\t((&lt;%it.unibz.inf.ontouml.xtext.xcore.Model%&gt;) _eContainer).getElements().forEach(_function);\n\t_xblockexpression = generalizations;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	EList<Generalization> getGeneralizations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns specializations of the Classifier, i.e. inheritance links towards
	 * its children (or immediate descendants).
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt; _xblockexpression = null;\n{\n\tfinal &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt; specializations = new &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt;();\n\t&lt;%org.eclipse.emf.ecore.EObject%&gt; _eContainer = this.eContainer();\n\tfinal &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt;&gt; _function = new &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt;&gt;()\n\t{\n\t\tpublic void accept(final &lt;%it.unibz.inf.ontouml.xtext.xcore.ModelElement%&gt; e)\n\t\t{\n\t\t\tif ((e instanceof &lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;))\n\t\t\t{\n\t\t\t\t&lt;%it.unibz.inf.ontouml.xtext.xcore.Classifier%&gt; _generic = ((&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;)e).getGeneric();\n\t\t\t\tboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(_generic, &lt;%this%&gt;);\n\t\t\t\tif (_equals)\n\t\t\t\t{\n\t\t\t\t\tspecializations.add(((&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;)e));\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t};\n\t((&lt;%it.unibz.inf.ontouml.xtext.xcore.Model%&gt;) _eContainer).getElements().forEach(_function);\n\t_xblockexpression = specializations;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	EList<Generalization> getSpecializations();

} // Classifier
