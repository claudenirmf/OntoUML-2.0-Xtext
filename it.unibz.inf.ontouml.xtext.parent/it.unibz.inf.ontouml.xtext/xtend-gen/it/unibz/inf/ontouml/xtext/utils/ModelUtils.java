package it.unibz.inf.ontouml.xtext.utils;

import com.google.common.base.Objects;
import it.unibz.inf.ontouml.xtext.xcore.Association;
import it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation;
import it.unibz.inf.ontouml.xtext.xcore.Model;
import it.unibz.inf.ontouml.xtext.xcore.ModelElement;
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import it.unibz.inf.ontouml.xtext.xcore.RegularAssociation;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ModelUtils {
  public Set<OntoUMLClass> getAncestors(final OntoUMLClass c) {
    Set<OntoUMLClass> _xblockexpression = null;
    {
      final HashSet<OntoUMLClass> ch = new HashSet<OntoUMLClass>();
      _xblockexpression = this.getAncestors(c, ch);
    }
    return _xblockexpression;
  }
  
  public Set<Association> getAncestors(final Association a) {
    Set<Association> _xblockexpression = null;
    {
      final HashSet<Association> ch = new HashSet<Association>();
      _xblockexpression = this.getAncestors(a, ch);
    }
    return _xblockexpression;
  }
  
  private Set<OntoUMLClass> getAncestors(final OntoUMLClass c, final Set<OntoUMLClass> ch) {
    Set<OntoUMLClass> _xblockexpression = null;
    {
      EList<OntoUMLClass> _parents = c.getParents();
      for (final OntoUMLClass current : _parents) {
        boolean _contains = ch.contains(current);
        boolean _not = (!_contains);
        if (_not) {
          ch.add(current);
          ch.addAll(this.getAncestors(current, ch));
        }
      }
      _xblockexpression = ch;
    }
    return _xblockexpression;
  }
  
  private Set<Association> getAncestors(final Association a, final Set<Association> ch) {
    Set<Association> _xblockexpression = null;
    {
      EList<Association> _parents = a.getParents();
      for (final Association current : _parents) {
        boolean _contains = ch.contains(current);
        boolean _not = (!_contains);
        if (_not) {
          ch.add(current);
          ch.addAll(this.getAncestors(current, ch));
        }
      }
      _xblockexpression = ch;
    }
    return _xblockexpression;
  }
  
  public String nameOrAlias(final ModelElement e) {
    final ModelElement it = e;
    if ((StringExtensions.isNullOrEmpty(it.getAlias()) || Objects.equal(it.getAlias(), "unnamed"))) {
      return it.getName();
    } else {
      return it.getAlias();
    }
  }
  
  public DerivationAssociation getDerivation(final RegularAssociation a) {
    DerivationAssociation _xblockexpression = null;
    {
      EObject _eContainer = a.eContainer();
      final Model m = ((Model) _eContainer);
      final Function1<ModelElement, Boolean> _function = (ModelElement it) -> {
        return Boolean.valueOf(((it instanceof DerivationAssociation) && Objects.equal(((DerivationAssociation) it).getDerivingAssociation(), a)));
      };
      final ModelElement d = IterableExtensions.<ModelElement>findFirst(m.getElements(), _function);
      _xblockexpression = ((DerivationAssociation) d);
    }
    return _xblockexpression;
  }
  
  public Model getContainerModel(final ModelElement me) {
    final EObject m = me.eContainer();
    if ((m instanceof Model)) {
      return ((Model)m);
    } else {
      return null;
    }
  }
  
  public boolean isSubstantialType(final OntoUMLClass c) {
    return (c.isSubstantialKind() || IterableExtensions.<OntoUMLClass>exists(this.getAncestors(c), ((Function1<OntoUMLClass, Boolean>) (OntoUMLClass it) -> {
      return Boolean.valueOf(it.isSubstantialKind());
    })));
  }
  
  public boolean isMomentType(final OntoUMLClass c) {
    return (c.isMomentKind() || IterableExtensions.<OntoUMLClass>exists(this.getAncestors(c), ((Function1<OntoUMLClass, Boolean>) (OntoUMLClass it) -> {
      return Boolean.valueOf(it.isMomentKind());
    })));
  }
}
