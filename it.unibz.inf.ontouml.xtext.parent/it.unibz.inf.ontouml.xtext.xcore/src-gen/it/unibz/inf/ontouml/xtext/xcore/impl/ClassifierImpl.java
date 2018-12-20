/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import com.google.common.base.Objects;

import it.unibz.inf.ontouml.xtext.xcore.Classifier;
import it.unibz.inf.ontouml.xtext.xcore.Generalization;
import it.unibz.inf.ontouml.xtext.xcore.Model;
import it.unibz.inf.ontouml.xtext.xcore.ModelElement;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.function.Consumer;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ClassifierImpl extends ModelElementImpl implements Classifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralizations() {
		BasicEList<Generalization> _xblockexpression = null; {
			final BasicEList<Generalization> generalizations = new BasicEList<Generalization>();
			EObject _eContainer = this.eContainer();
			final Consumer<ModelElement> _function = new Consumer<ModelElement>() {
				public void accept(final ModelElement e) {
					if ((e instanceof Generalization)) {
						Classifier _specific = ((Generalization)e).getSpecific();
						boolean _equals = Objects.equal(_specific, ClassifierImpl.this);
						if (_equals) {
							generalizations.add(((Generalization)e));
						}
					}
				}
			};
			((Model) _eContainer).getElements().forEach(_function);
			_xblockexpression = generalizations;
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getSpecializations() {
		BasicEList<Generalization> _xblockexpression = null; {
			final BasicEList<Generalization> specializations = new BasicEList<Generalization>();
			EObject _eContainer = this.eContainer();
			final Consumer<ModelElement> _function = new Consumer<ModelElement>() {
				public void accept(final ModelElement e) {
					if ((e instanceof Generalization)) {
						Classifier _generic = ((Generalization)e).getGeneric();
						boolean _equals = Objects.equal(_generic, ClassifierImpl.this);
						if (_equals) {
							specializations.add(((Generalization)e));
						}
					}
				}
			};
			((Model) _eContainer).getElements().forEach(_function);
			_xblockexpression = specializations;
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case XcorePackage.CLASSIFIER___GET_GENERALIZATIONS:
				return getGeneralizations();
			case XcorePackage.CLASSIFIER___GET_SPECIALIZATIONS:
				return getSpecializations();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ClassifierImpl
