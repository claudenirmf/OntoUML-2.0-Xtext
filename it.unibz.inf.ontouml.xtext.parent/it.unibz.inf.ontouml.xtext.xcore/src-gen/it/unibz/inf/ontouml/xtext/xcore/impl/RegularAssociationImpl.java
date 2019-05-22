/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import com.google.common.base.Objects;
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import it.unibz.inf.ontouml.xtext.xcore.RegularAssociation;
import it.unibz.inf.ontouml.xtext.xcore.RelationType;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.RegularAssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.RegularAssociationImpl#getTarget <em>Target</em>}</li>
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OntoUMLClass source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected OntoUMLClass target;

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
	public OntoUMLClass getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (OntoUMLClass)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.REGULAR_ASSOCIATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OntoUMLClass newSource) {
		OntoUMLClass oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REGULAR_ASSOCIATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (OntoUMLClass)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XcorePackage.REGULAR_ASSOCIATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntoUMLClass basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(OntoUMLClass newTarget) {
		OntoUMLClass oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.REGULAR_ASSOCIATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDescriptive() {
		return (Objects.equal(this.get_type(), RelationType.MATERIAL) || Objects.equal(this.get_type(), RelationType.COMPARATIVE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNonDescriptive() {
		return (((Objects.equal(this.get_type(), RelationType.HISTORICAL) || Objects.equal(this.get_type(), RelationType.CHARACTERIZATION)) || Objects.equal(this.get_type(), RelationType.MEDIATION)) || Objects.equal(this.get_type(), RelationType.EXTERNAL_DEPEDENCE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInternal() {
		return (((Objects.equal(this.get_type(), RelationType.COMPARATIVE) || Objects.equal(this.get_type(), RelationType.CHARACTERIZATION)) || Objects.equal(this.get_type(), RelationType.MEDIATION)) || Objects.equal(this.get_type(), RelationType.EXTERNAL_DEPEDENCE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternal() {
		return (Objects.equal(this.get_type(), RelationType.MATERIAL) || Objects.equal(this.get_type(), RelationType.HISTORICAL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParthood() {
		return (this.getSourceEnd().isRepresentingWhole() || this.getTargetEnd().isRepresentingWhole());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceAWhole() {
		return this.getSourceEnd().isRepresentingWhole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTargetAWhole() {
		return this.getTargetEnd().isRepresentingWhole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceAPart() {
		return this.isTargetAWhole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTargetAPart() {
		return this.isSourceAWhole();
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
			case XcorePackage.REGULAR_ASSOCIATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case XcorePackage.REGULAR_ASSOCIATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case XcorePackage.REGULAR_ASSOCIATION__SOURCE:
				setSource((OntoUMLClass)newValue);
				return;
			case XcorePackage.REGULAR_ASSOCIATION__TARGET:
				setTarget((OntoUMLClass)newValue);
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
			case XcorePackage.REGULAR_ASSOCIATION__SOURCE:
				setSource((OntoUMLClass)null);
				return;
			case XcorePackage.REGULAR_ASSOCIATION__TARGET:
				setTarget((OntoUMLClass)null);
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
			case XcorePackage.REGULAR_ASSOCIATION__SOURCE:
				return source != null;
			case XcorePackage.REGULAR_ASSOCIATION__TARGET:
				return target != null;
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
			case XcorePackage.REGULAR_ASSOCIATION___IS_DESCRIPTIVE:
				return isDescriptive();
			case XcorePackage.REGULAR_ASSOCIATION___IS_NON_DESCRIPTIVE:
				return isNonDescriptive();
			case XcorePackage.REGULAR_ASSOCIATION___IS_INTERNAL:
				return isInternal();
			case XcorePackage.REGULAR_ASSOCIATION___IS_EXTERNAL:
				return isExternal();
			case XcorePackage.REGULAR_ASSOCIATION___IS_PARTHOOD:
				return isParthood();
			case XcorePackage.REGULAR_ASSOCIATION___IS_SOURCE_AWHOLE:
				return isSourceAWhole();
			case XcorePackage.REGULAR_ASSOCIATION___IS_TARGET_AWHOLE:
				return isTargetAWhole();
			case XcorePackage.REGULAR_ASSOCIATION___IS_SOURCE_APART:
				return isSourceAPart();
			case XcorePackage.REGULAR_ASSOCIATION___IS_TARGET_APART:
				return isTargetAPart();
		}
		return super.eInvoke(operationID, arguments);
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
