/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import it.unibz.inf.ontouml.xtext.xcore.RegularAssociation;
import it.unibz.inf.ontouml.xtext.xcore.RelationType;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.RegularAssociationImpl#get_type <em>type</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.RegularAssociationImpl#getEndA <em>End A</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.RegularAssociationImpl#getEndB <em>End B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegularAssociationImpl extends AssociationImpl implements RegularAssociation {
	/**
	 * The default value of the '{@link #get_type() <em>type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_type()
	 * @generated
	 * @ordered
	 */
	protected static final RelationType _TYPE_EDEFAULT = RelationType.NONE;

	/**
	 * The cached value of the '{@link #get_type() <em>type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_type()
	 * @generated
	 * @ordered
	 */
	protected RelationType _type = _TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndA() <em>End A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndA()
	 * @generated
	 * @ordered
	 */
	protected OntoUMLClass endA;

	/**
	 * The cached value of the '{@link #getEndB() <em>End B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndB()
	 * @generated
	 * @ordered
	 */
	protected OntoUMLClass endB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.REGULAR_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType get_type() {
		return _type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_type(RelationType new_type) {
		RelationType old_type = _type;
		_type = new_type == null ? _TYPE_EDEFAULT : new_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REGULAR_ASSOCIATION__TYPE, old_type, _type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass getEndA() {
		if (endA != null && endA.eIsProxy()) {
			InternalEObject oldEndA = (InternalEObject)endA;
			endA = (OntoUMLClass)eResolveProxy(oldEndA);
			if (endA != oldEndA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.REGULAR_ASSOCIATION__END_A, oldEndA, endA));
			}
		}
		return endA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass basicGetEndA() {
		return endA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndA(OntoUMLClass newEndA) {
		OntoUMLClass oldEndA = endA;
		endA = newEndA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REGULAR_ASSOCIATION__END_A, oldEndA, endA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass getEndB() {
		if (endB != null && endB.eIsProxy()) {
			InternalEObject oldEndB = (InternalEObject)endB;
			endB = (OntoUMLClass)eResolveProxy(oldEndB);
			if (endB != oldEndB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.REGULAR_ASSOCIATION__END_B, oldEndB, endB));
			}
		}
		return endB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass basicGetEndB() {
		return endB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndB(OntoUMLClass newEndB) {
		OntoUMLClass oldEndB = endB;
		endB = newEndB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REGULAR_ASSOCIATION__END_B, oldEndB, endB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.REGULAR_ASSOCIATION__TYPE:
				return get_type();
			case XcorePackage.REGULAR_ASSOCIATION__END_A:
				if (resolve) return getEndA();
				return basicGetEndA();
			case XcorePackage.REGULAR_ASSOCIATION__END_B:
				if (resolve) return getEndB();
				return basicGetEndB();
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
			case XcorePackage.REGULAR_ASSOCIATION__TYPE:
				set_type((RelationType)newValue);
				return;
			case XcorePackage.REGULAR_ASSOCIATION__END_A:
				setEndA((OntoUMLClass)newValue);
				return;
			case XcorePackage.REGULAR_ASSOCIATION__END_B:
				setEndB((OntoUMLClass)newValue);
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
			case XcorePackage.REGULAR_ASSOCIATION__TYPE:
				set_type(_TYPE_EDEFAULT);
				return;
			case XcorePackage.REGULAR_ASSOCIATION__END_A:
				setEndA((OntoUMLClass)null);
				return;
			case XcorePackage.REGULAR_ASSOCIATION__END_B:
				setEndB((OntoUMLClass)null);
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
			case XcorePackage.REGULAR_ASSOCIATION__TYPE:
				return _type != _TYPE_EDEFAULT;
			case XcorePackage.REGULAR_ASSOCIATION__END_A:
				return endA != null;
			case XcorePackage.REGULAR_ASSOCIATION__END_B:
				return endB != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (_type: ");
		result.append(_type);
		result.append(')');
		return result.toString();
	}

} //RegularAssociationImpl
