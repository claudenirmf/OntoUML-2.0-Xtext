/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import it.unibz.inf.ontouml.xtext.xcore.DerivationAssociation;
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import it.unibz.inf.ontouml.xtext.xcore.RegularAssociation;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derivation Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.DerivationAssociationImpl#getDerivingAssociation <em>Deriving Association</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.DerivationAssociationImpl#getDerivedClass <em>Derived Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivationAssociationImpl extends AssociationImpl implements DerivationAssociation {
	/**
	 * The cached value of the '{@link #getDerivingAssociation() <em>Deriving Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivingAssociation()
	 * @generated
	 * @ordered
	 */
	protected RegularAssociation derivingAssociation;

	/**
	 * The cached value of the '{@link #getDerivedClass() <em>Derived Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedClass()
	 * @generated
	 * @ordered
	 */
	protected OntoUMLClass derivedClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivationAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.DERIVATION_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularAssociation getDerivingAssociation() {
		if (derivingAssociation != null && derivingAssociation.eIsProxy()) {
			InternalEObject oldDerivingAssociation = (InternalEObject)derivingAssociation;
			derivingAssociation = (RegularAssociation)eResolveProxy(oldDerivingAssociation);
			if (derivingAssociation != oldDerivingAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.DERIVATION_ASSOCIATION__DERIVING_ASSOCIATION, oldDerivingAssociation, derivingAssociation));
			}
		}
		return derivingAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularAssociation basicGetDerivingAssociation() {
		return derivingAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivingAssociation(RegularAssociation newDerivingAssociation) {
		RegularAssociation oldDerivingAssociation = derivingAssociation;
		derivingAssociation = newDerivingAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DERIVATION_ASSOCIATION__DERIVING_ASSOCIATION, oldDerivingAssociation, derivingAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass getDerivedClass() {
		if (derivedClass != null && derivedClass.eIsProxy()) {
			InternalEObject oldDerivedClass = (InternalEObject)derivedClass;
			derivedClass = (OntoUMLClass)eResolveProxy(oldDerivedClass);
			if (derivedClass != oldDerivedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.DERIVATION_ASSOCIATION__DERIVED_CLASS, oldDerivedClass, derivedClass));
			}
		}
		return derivedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass basicGetDerivedClass() {
		return derivedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedClass(OntoUMLClass newDerivedClass) {
		OntoUMLClass oldDerivedClass = derivedClass;
		derivedClass = newDerivedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.DERIVATION_ASSOCIATION__DERIVED_CLASS, oldDerivedClass, derivedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.DERIVATION_ASSOCIATION__DERIVING_ASSOCIATION:
				if (resolve) return getDerivingAssociation();
				return basicGetDerivingAssociation();
			case XcorePackage.DERIVATION_ASSOCIATION__DERIVED_CLASS:
				if (resolve) return getDerivedClass();
				return basicGetDerivedClass();
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
			case XcorePackage.DERIVATION_ASSOCIATION__DERIVING_ASSOCIATION:
				setDerivingAssociation((RegularAssociation)newValue);
				return;
			case XcorePackage.DERIVATION_ASSOCIATION__DERIVED_CLASS:
				setDerivedClass((OntoUMLClass)newValue);
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
			case XcorePackage.DERIVATION_ASSOCIATION__DERIVING_ASSOCIATION:
				setDerivingAssociation((RegularAssociation)null);
				return;
			case XcorePackage.DERIVATION_ASSOCIATION__DERIVED_CLASS:
				setDerivedClass((OntoUMLClass)null);
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
			case XcorePackage.DERIVATION_ASSOCIATION__DERIVING_ASSOCIATION:
				return derivingAssociation != null;
			case XcorePackage.DERIVATION_ASSOCIATION__DERIVED_CLASS:
				return derivedClass != null;
		}
		return super.eIsSet(featureID);
	}

} //DerivationAssociationImpl
