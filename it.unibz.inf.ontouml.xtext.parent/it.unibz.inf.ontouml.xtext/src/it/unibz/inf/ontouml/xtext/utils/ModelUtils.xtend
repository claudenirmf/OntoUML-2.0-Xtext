package it.unibz.inf.ontouml.xtext.utils

import java.util.Set
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass
import java.util.HashSet
import it.unibz.inf.ontouml.xtext.xcore.ModelElement
import it.unibz.inf.ontouml.xtext.xcore.Association
import it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation
import it.unibz.inf.ontouml.xtext.xcore.RegularAssociation
import it.unibz.inf.ontouml.xtext.xcore.Model
import it.unibz.inf.ontouml.xtext.xcore.RelationType
import it.unibz.inf.ontouml.xtext.xcore.EndurantType

class ModelUtils {
	
	
	def Set<OntoUMLClass> getAncestors(OntoUMLClass c)
	{
		val ch = new HashSet<OntoUMLClass>()
		c.getAncestors(ch)
	}
	
	def Set<Association> getAncestors(Association a)
	{
		val ch = new HashSet<Association>()
		a.getAncestors(ch)
	}
	
	def private Set<OntoUMLClass> getAncestors(OntoUMLClass c, Set<OntoUMLClass> ch) {
		for (current : c.parents) {
			if (!ch.contains(current)) {
				ch.add(current)
				ch.addAll(current.getAncestors(ch))
			}
		}
		ch
	}
	
	def private Set<Association> getAncestors(Association a, Set<Association> ch) {
		for (current : a.parents) {
			if (!ch.contains(current)) {
				ch.add(current)
				ch.addAll(current.getAncestors(ch))
			}
		}
		ch
	}
	
	def String nameOrAlias(ModelElement e) {
		val it = e
		if(alias.nullOrEmpty || alias=="unnamed")		return name
		else											return alias
	}
	
	def DerivationAssociation getDerivation(RegularAssociation a) {
		val m = a.eContainer as Model
		val d = m.elements.findFirst[ 
			it instanceof DerivationAssociation 
			&& (it as DerivationAssociation).derivingAssociation == a
		]
		d as DerivationAssociation
	}
	
//	def Model getContainerModel(ModelElement me) {
//		val m = me.eContainer
//		if(m instanceof Model) return m
//		else return null
//	}
	
	def boolean isSubstantialType(OntoUMLClass c) {
		return c.isSubstantialKind || c.ancestors.exists[ isSubstantialKind ]
	}
	
	def boolean isMomentType(OntoUMLClass c) {
		return c.isMomentKind || c.ancestors.exists[ isMomentKind ]
	}
	
	def boolean isRelatorType(OntoUMLClass c) {
		return c._type==EndurantType.RELATOR_KIND || c.ancestors.exists[ _type==EndurantType.RELATOR_KIND ]
	}
	
	def boolean isModeType(OntoUMLClass c) {
		return c._type==EndurantType.MODE_KIND || c.ancestors.exists[ _type==EndurantType.MODE_KIND ]
	}
	
	def boolean isQualityType(OntoUMLClass c) {
		return c._type==EndurantType.QUALITY_KIND || c.ancestors.exists[ _type==EndurantType.QUALITY_KIND ]
	}
	
	def EndurantType getKindType(OntoUMLClass c) {
		if(c.isUltimateSortal) return c._type
		else {
			val kind = c.ancestors.findFirst[ isUltimateSortal ]
			if(kind===null) return EndurantType.NONE
			else return kind._type
		}
	}
	
	/** @return Regular association that binds the given class (as first argument) and represent inherence. Null if there are none. */
	def RegularAssociation getInherence(OntoUMLClass c) {
		c.reacheableElements.findFirst[ 
			it instanceof RegularAssociation
			&& (it as RegularAssociation)._type == RelationType.INHERENCE
			&& (it as RegularAssociation).endA == c
		] as RegularAssociation
	}
	
	/** @return Set of regular associations that bind the given class and represent existential dependences. Never null. */
	def Set<RegularAssociation> getDependences(OntoUMLClass c) {
		val dependences = new HashSet<RegularAssociation>
		c.reacheableElements.forEach[
			if(it instanceof RegularAssociation)
				if(_type == RelationType.DEPENDENCE && (endA == c || endB == c))
					dependences.add(it)
		]
		return dependences
	}
	
	/** @return Set of regular associations that bind the given class and represent involvements. Never null. */
	def Set<RegularAssociation> getInvolvements(OntoUMLClass c) {
		val involvements = new HashSet<RegularAssociation>
		c.reacheableElements.forEach[
			if(it instanceof RegularAssociation)
				if(_type == RelationType.INVOLVEMENT && (endA == c || endB == c))
					involvements.add(it)
		]
		return involvements
	}
	
}