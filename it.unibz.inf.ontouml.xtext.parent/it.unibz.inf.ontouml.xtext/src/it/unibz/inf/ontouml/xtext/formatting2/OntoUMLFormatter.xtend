/*
 * generated by Xtext 2.13.0
 */
package it.unibz.inf.ontouml.xtext.formatting2

import com.google.inject.Inject
import it.unibz.inf.ontouml.xtext.services.OntoUMLGrammarAccess
import it.unibz.inf.ontouml.xtext.xcore.Model
import it.unibz.inf.ontouml.xtext.xcore.ModelElement
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class OntoUMLFormatter extends AbstractFormatter2 {
	
	@Inject extension OntoUMLGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (ModelElement modelElement : model.getElements()) {
			modelElement.format;
		}
	}
	
	// TODO: implement for 
}
