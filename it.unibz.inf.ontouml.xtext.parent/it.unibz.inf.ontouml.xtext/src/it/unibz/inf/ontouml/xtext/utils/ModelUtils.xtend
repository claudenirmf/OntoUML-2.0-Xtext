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
	
	def Model getContainerModel(ModelElement me) {
		val m = me.eContainer
		if(m instanceof Model) return m
		else return null
	}
	
	def boolean isSubstantialType(OntoUMLClass c) {
		return c.isSubstantialKind || c.ancestors.exists[ isSubstantialKind ]
	}
	
	def boolean isMomentType(OntoUMLClass c) {
		return c.isMomentKind || c.ancestors.exists[ isMomentKind ]
	}
	
}