/**
 */
package it.unibz.inf.ontouml.xtext.xcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Onto UML Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#get_type <em>type</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getOntoUMLClass()
 * @model
 * @generated
 */
public interface OntoUMLClass extends Classifier {
	/**
	 * Returns the value of the '<em><b>type</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link it.unibz.inf.ontouml.xtext.xcore.EndurantType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>type</em>' attribute.
	 * @see it.unibz.inf.ontouml.xtext.xcore.EndurantType
	 * @see #set_type(EndurantType)
	 * @see it.unibz.inf.ontouml.xtext.xcore.XcorePackage#getOntoUMLClass__type()
	 * @model default="none" unique="false"
	 * @generated
	 */
	EndurantType get_type();

	/**
	 * Sets the value of the '{@link it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass#get_type <em>type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>type</em>' attribute.
	 * @see it.unibz.inf.ontouml.xtext.xcore.EndurantType
	 * @see #get_type()
	 * @generated
	 */
	void set_type(EndurantType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the immediate ancestors (or parents) of the OntoUMLClass.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%&gt;&gt; _xblockexpression = null;\n{\n\tfinal &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%&gt;&gt; parents = new &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%&gt;&gt;();\n\tfinal &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt; _function = new &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt;()\n\t{\n\t\tpublic void accept(final &lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt; it)\n\t\t{\n\t\t\tfinal &lt;%it.unibz.inf.ontouml.xtext.xcore.Classifier%&gt; g = it.getGeneric();\n\t\t\tif ((g instanceof &lt;%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%&gt;))\n\t\t\t{\n\t\t\t\tparents.add(((&lt;%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%&gt;)g));\n\t\t\t}\n\t\t}\n\t};\n\tthis.getGeneralizations().forEach(_function);\n\t_xblockexpression = parents;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	EList<OntoUMLClass> getParents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the immediate descendents (or children) of the OntoUMLClass.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%&gt;&gt; _xblockexpression = null;\n{\n\tfinal &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%&gt;&gt; children = new &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%&gt;&gt;();\n\tfinal &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt; _function = new &lt;%java.util.function.Consumer%&gt;&lt;&lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt;&gt;()\n\t{\n\t\tpublic void accept(final &lt;%it.unibz.inf.ontouml.xtext.xcore.Generalization%&gt; it)\n\t\t{\n\t\t\tfinal &lt;%it.unibz.inf.ontouml.xtext.xcore.Classifier%&gt; s = it.getSpecific();\n\t\t\tif ((s instanceof &lt;%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%&gt;))\n\t\t\t{\n\t\t\t\tchildren.add(((&lt;%it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass%&gt;)s));\n\t\t\t}\n\t\t}\n\t};\n\tthis.getSpecializations().forEach(_function);\n\t_xblockexpression = children;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	EList<OntoUMLClass> getChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns true in case the object represents an ultimate sortal class,
	 * regardless the ontological nature (i.e., substantial, relator, mode or quality.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (((&lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.KIND) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.RELATOR_KIND)) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.MODE_KIND)) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.QUALITY_KIND));'"
	 * @generated
	 */
	boolean isUltimateSortal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns true in case the object represents a sortal class.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (((this.isUltimateSortal() || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.SUBKIND)) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.ROLE)) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.PHASE));'"
	 * @generated
	 */
	boolean isSortal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns true in case the object represents a non-sortal class.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((!this.isSortal()) &amp;&amp; (!&lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.NONE)));'"
	 * @generated
	 */
	boolean isNonSortal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns true in case the object represents a rigid class.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (((!this.isSemiRigid()) &amp;&amp; (!this.isAntiRigid())) &amp;&amp; (!&lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.NONE)));'"
	 * @generated
	 */
	boolean isRigid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns true in case the object represents a semi-rigid class.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt; __type = this.get_type();\nreturn &lt;%com.google.common.base.Objects%&gt;.equal(__type, &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.MIXIN);'"
	 * @generated
	 */
	boolean isSemiRigid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns true in case the object represents a anti-rigid class.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (((&lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.ROLE) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.PHASE)) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.ROLE_MIXIN)) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.PHASE_MIXIN));'"
	 * @generated
	 */
	boolean isAntiRigid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns true in case the object represents a phased class (i.e.,
	 * a phase or a phase mixin).
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (&lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.PHASE) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.PHASE_MIXIN));'"
	 * @generated
	 */
	boolean isPhase();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns true in case the object represents a relational dependent
	 * class (i.e., a role or a role mixin).
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (&lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.ROLE) || &lt;%com.google.common.base.Objects%&gt;.equal(this.get_type(), &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.ROLE_MIXIN));'"
	 * @generated
	 */
	boolean isRole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt; __type = this.get_type();\nreturn &lt;%com.google.common.base.Objects%&gt;.equal(__type, &lt;%it.unibz.inf.ontouml.xtext.xcore.EndurantType%&gt;.KIND);'"
	 * @generated
	 */
	boolean isSubstantialKind();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (this.isUltimateSortal() &amp;&amp; (!this.isSubstantialKind()));'"
	 * @generated
	 */
	boolean isMomentKind();

} // OntoUMLClass
