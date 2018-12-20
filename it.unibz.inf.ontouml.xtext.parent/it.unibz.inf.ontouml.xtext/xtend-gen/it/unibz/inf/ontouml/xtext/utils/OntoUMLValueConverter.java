package it.unibz.inf.ontouml.xtext.utils;

import com.google.common.base.Objects;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

@SuppressWarnings("all")
public class OntoUMLValueConverter extends DefaultTerminalConverters {
  @ValueConverter(rule = "StringOrID")
  public IValueConverter<String> StringOrID() {
    return new IValueConverter<String>() {
      @Override
      public String toString(final String value) throws ValueConverterException {
        if (((value == null) || (value.length() < 1))) {
          return value;
        }
        final char first = value.charAt(0);
        int _length = value.length();
        int _minus = (_length - 1);
        final char last = value.charAt(_minus);
        final char c = "\"".charAt(0);
        boolean _contains = value.contains(" ");
        boolean _not = (!_contains);
        if (_not) {
          if (((((first >= 'a') && (first <= 'z')) || ((first >= 'A') && (first <= 'Z'))) || Objects.equal(Character.valueOf(first), "^"))) {
            return value;
          }
        } else {
          if (((first != c) && (last != c))) {
            String _plus = (Character.valueOf(c) + value);
            return (_plus + Character.valueOf(c));
          }
        }
        return null;
      }
      
      @Override
      public String toValue(final String string, final INode node) throws ValueConverterException {
        if (((string == null) || (string.length() < 1))) {
          return string;
        }
        final char first = string.charAt(0);
        int _length = string.length();
        int _minus = (_length - 1);
        final char last = string.charAt(_minus);
        final char c = "\"".charAt(0);
        if ((((first == c) && (last == c)) && (string.length() > 2))) {
          int _length_1 = string.length();
          int _minus_1 = (_length_1 - 1);
          return string.substring(1, _minus_1);
        }
        return string;
      }
    };
  }
}
