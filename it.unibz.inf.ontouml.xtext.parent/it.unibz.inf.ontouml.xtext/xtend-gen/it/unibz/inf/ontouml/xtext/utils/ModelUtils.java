package it.unibz.inf.ontouml.xtext.utils;

import com.google.common.base.Objects;
import it.unibz.inf.ontouml.xtext.xcore.Association;
import it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation;
import it.unibz.inf.ontouml.xtext.xcore.EndurantType;
import it.unibz.inf.ontouml.xtext.xcore.Model;
import it.unibz.inf.ontouml.xtext.xcore.ModelElement;
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import it.unibz.inf.ontouml.xtext.xcore.RegularAssociation;
import it.unibz.inf.ontouml.xtext.xcore.RelationType;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
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
  
  public boolean isRelatorType(final OntoUMLClass c) {
    return (Objects.equal(c.get_type(), EndurantType.RELATOR_KIND) || IterableExtensions.<OntoUMLClass>exists(this.getAncestors(c), ((Function1<OntoUMLClass, Boolean>) (OntoUMLClass it) -> {
      EndurantType __type = it.get_type();
      return Boolean.valueOf(Objects.equal(__type, EndurantType.RELATOR_KIND));
    })));
  }
  
  public boolean isModeType(final OntoUMLClass c) {
    return (Objects.equal(c.get_type(), EndurantType.MODE_KIND) || IterableExtensions.<OntoUMLClass>exists(this.getAncestors(c), ((Function1<OntoUMLClass, Boolean>) (OntoUMLClass it) -> {
      EndurantType __type = it.get_type();
      return Boolean.valueOf(Objects.equal(__type, EndurantType.MODE_KIND));
    })));
  }
  
  public boolean isQualityType(final OntoUMLClass c) {
    return (Objects.equal(c.get_type(), EndurantType.QUALITY_KIND) || IterableExtensions.<OntoUMLClass>exists(this.getAncestors(c), ((Function1<OntoUMLClass, Boolean>) (OntoUMLClass it) -> {
      EndurantType __type = it.get_type();
      return Boolean.valueOf(Objects.equal(__type, EndurantType.QUALITY_KIND));
    })));
  }
  
  /**
   * Returns the ultimate sortal specialized by the given class.
   */
  public EndurantType getKindType(final OntoUMLClass c) {
    boolean _isUltimateSortal = c.isUltimateSortal();
    if (_isUltimateSortal) {
      return c.get_type();
    } else {
      final Function1<OntoUMLClass, Boolean> _function = (OntoUMLClass it) -> {
        return Boolean.valueOf(it.isUltimateSortal());
      };
      final OntoUMLClass kind = IterableExtensions.<OntoUMLClass>findFirst(this.getAncestors(c), _function);
      if ((kind == null)) {
        return EndurantType.NONE;
      } else {
        return kind.get_type();
      }
    }
  }
  
  /**
   * @return Regular association that binds the given class (as first argument) and represent inherence. Null if there are none.
   */
  public RegularAssociation getInherence(final OntoUMLClass c) {
    final Function1<ModelElement, Boolean> _function = (ModelElement it) -> {
      return Boolean.valueOf((((it instanceof RegularAssociation) && Objects.equal(((RegularAssociation) it).get_type(), RelationType.INHERENCE)) && Objects.equal(((RegularAssociation) it).getEndA(), c)));
    };
    ModelElement _findFirst = IterableExtensions.<ModelElement>findFirst(c.getReacheableElements(), _function);
    return ((RegularAssociation) _findFirst);
  }
  
  /**
   * @return Set of regular associations that bind the given class and represent existential dependences. Never null.
   */
  public Set<RegularAssociation> getDependences(final OntoUMLClass c) {
    final HashSet<RegularAssociation> dependences = new HashSet<RegularAssociation>();
    final Consumer<ModelElement> _function = (ModelElement it) -> {
      if ((it instanceof RegularAssociation)) {
        if ((Objects.equal(((RegularAssociation)it).get_type(), RelationType.DEPENDENCE) && (Objects.equal(((RegularAssociation)it).getEndA(), c) || Objects.equal(((RegularAssociation)it).getEndB(), c)))) {
          dependences.add(((RegularAssociation)it));
        }
      }
    };
    c.getReacheableElements().forEach(_function);
    return dependences;
  }
  
  /**
   * @return Set of regular associations that bind the given class and represent involvements. Never null.
   */
  public Set<RegularAssociation> getInvolvements(final OntoUMLClass c) {
    final HashSet<RegularAssociation> involvements = new HashSet<RegularAssociation>();
    final Consumer<ModelElement> _function = (ModelElement it) -> {
      if ((it instanceof RegularAssociation)) {
        if ((Objects.equal(((RegularAssociation)it).get_type(), RelationType.INVOLVEMENT) && (Objects.equal(((RegularAssociation)it).getEndA(), c) || Objects.equal(((RegularAssociation)it).getEndB(), c)))) {
          involvements.add(((RegularAssociation)it));
        }
      }
    };
    c.getReacheableElements().forEach(_function);
    return involvements;
  }
}
