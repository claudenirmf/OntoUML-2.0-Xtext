/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import it.unibz.inf.ontouml.xtext.xcore.Classifier;
import it.unibz.inf.ontouml.xtext.xcore.Generalization;
import it.unibz.inf.ontouml.xtext.xcore.GeneralizationSet;
import it.unibz.inf.ontouml.xtext.xcore.Model;
import it.unibz.inf.ontouml.xtext.xcore.ModelElement;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationImpl#getGeneric <em>Generic</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends ModelElementImpl implements Generalization {
	/**
	 * The cached value of the '{@link #getGeneric() <em>Generic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneric()
	 * @generated
	 * @ordered
	 */
	protected Classifier generic;

	/**
	 * The cached value of the '{@link #getSpecific() <em>Specific</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecific()
	 * @generated
	 * @ordered
	 */
	protected Classifier specific;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getGeneric() {
		if (generic != null && generic.eIsProxy()) {
			InternalEObject oldGeneric = (InternalEObject)generic;
			generic = (Classifier)eResolveProxy(oldGeneric);
			if (generic != oldGeneric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.GENERALIZATION__GENERIC, oldGeneric, generic));
			}
		}
		return generic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetGeneric() {
		return generic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneric(Classifier newGeneric) {
		Classifier oldGeneric = generic;
		generic = newGeneric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.GENERALIZATION__GENERIC, oldGeneric, generic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSpecific() {
		if (specific != null && specific.eIsProxy()) {
			InternalEObject oldSpecific = (InternalEObject)specific;
			specific = (Classifier)eResolveProxy(oldSpecific);
			if (specific != oldSpecific) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.GENERALIZATION__SPECIFIC, oldSpecific, specific));
			}
		}
		return specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetSpecific() {
		return specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Classifier newSpecific) {
		Classifier oldSpecific = specific;
		specific = newSpecific;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.GENERALIZATION__SPECIFIC, oldSpecific, specific));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationSet> getGeneralizationSets() {
		final BasicEList<GeneralizationSet> genSets = new BasicEList<GeneralizationSet>();
		EObject _eContainer = this.eContainer();
		final Consumer<ModelElement> _function = new Consumer<ModelElement>() {
			public void accept(final ModelElement it) {
				if ((it instanceof GeneralizationSet)) {
					boolean _contains = ((GeneralizationSet)it).getGeneralizations().contains(GeneralizationImpl.this);
					if (_contains) {
						genSets.add(((GeneralizationSet)it));
					}
				}
			}
		};
		((Model) _eContainer).getElements().forEach(_function);
		return genSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.GENERALIZATION__GENERIC:
				if (resolve) return getGeneric();
				return basicGetGeneric();
			case XcorePackage.GENERALIZATION__SPECIFIC:
				if (resolve) return getSpecific();
				return basicGetSpecific();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XcorePackage.GENERALIZATION__GENERIC:
				setGeneric((Classifier)newValue);
				return;
			case XcorePackage.GENERALIZATION__SPECIFIC:
				setSpecific((Classifier)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XcorePackage.GENERALIZATION__GENERIC:
				setGeneric((Classifier)null);
				return;
			case XcorePackage.GENERALIZATION__SPECIFIC:
				setSpecific((Classifier)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XcorePackage.GENERALIZATION__GENERIC:
				return generic != null;
			case XcorePackage.GENERALIZATION__SPECIFIC:
				return specific != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case XcorePackage.GENERALIZATION___GET_GENERALIZATION_SETS:
				return getGeneralizationSets();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GeneralizationImpl
