package it.unibz.inf.ontouml.xtext.utils

import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.common.services.DefaultTerminalConverters

class OntoUMLValueConverter extends DefaultTerminalConverters {
	
	@ValueConverter(rule="StringOrID")
	def IValueConverter<String> StringOrID() {
		return new IValueConverter<String> {
			
			override toString(String value) throws ValueConverterException {
				if(value === null || value.length < 1)	return value
				
				val first = value.charAt(0)
				val last = value.charAt(value.length-1)
				val c = '"'.charAt(0)
				
				if(!value.contains(' ')) {
					if((first >= 'a' && first <= 'z') || (first >= 'A' && first <= 'Z') || (first == '^')) { return value }
				}
				else if(first != c && last != c) { return c + value + c}
//				throw new ValueConverterException("Bad formatted string", null, null);
			}
			
			override toValue(String string, INode node) throws ValueConverterException {
				if(string === null || string.length < 1)	return string
				
				val first = string.charAt(0)
				val last = string.charAt(string.length-1)
				val c = '"'.charAt(0)
				
				// This warning message is potentially a this bug: https://groups.google.com/forum/#!topic/xtend-lang/aU5PJ3ZlDVE
				if(first == c && last == c && string.length > 2)
					return string.substring(1,string.length-1)
				
				return string
			}
			
			}
	}
	
}