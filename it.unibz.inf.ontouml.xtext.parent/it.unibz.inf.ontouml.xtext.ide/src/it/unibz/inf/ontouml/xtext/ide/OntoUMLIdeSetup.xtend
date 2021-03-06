/*
 * generated by Xtext 2.13.0
 */
package it.unibz.inf.ontouml.xtext.ide

import com.google.inject.Guice
import it.unibz.inf.ontouml.xtext.OntoUMLRuntimeModule
import it.unibz.inf.ontouml.xtext.OntoUMLStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class OntoUMLIdeSetup extends OntoUMLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new OntoUMLRuntimeModule, new OntoUMLIdeModule))
	}
	
}
