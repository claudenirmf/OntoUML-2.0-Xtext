/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import it.unibz.inf.ontouml.xtext.xcore.Association;
import it.unibz.inf.ontouml.xtext.xcore.Classifier;
import it.unibz.inf.ontouml.xtext.xcore.Generalization;
import it.unibz.inf.ontouml.xtext.xcore.Multiplicity;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.AssociationImpl#getEndAMultiplicity <em>End AMultiplicity</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.AssociationImpl#getEndBMultiplicity <em>End BMultiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssociationImpl extends ClassifierImpl implements Association {
	/**
	 * The cached value of the '{@link #getEndAMultiplicity() <em>End AMultiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity endAMultiplicity;

	/**
	 * The cached value of the '{@link #getEndBMultiplicity() <em>End BMultiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndBMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity endBMultiplicity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity getEndAMultiplicity() {
		return endAMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndAMultiplicity(Multiplicity newEndAMultiplicity, NotificationChain msgs) {
		Multiplicity oldEndAMultiplicity = endAMultiplicity;
		endAMultiplicity = newEndAMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XcorePackage.ASSOCIATION__END_AMULTIPLICITY, oldEndAMultiplicity, newEndAMultiplicity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndAMultiplicity(Multiplicity newEndAMultiplicity) {
		if (newEndAMultiplicity != endAMultiplicity) {
			NotificationChain msgs = null;
			if (endAMultiplicity != null)
				msgs = ((InternalEObject)endAMultiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XcorePackage.ASSOCIATION__END_AMULTIPLICITY, null, msgs);
			if (newEndAMultiplicity != null)
				msgs = ((InternalEObject)newEndAMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XcorePackage.ASSOCIATION__END_AMULTIPLICITY, null, msgs);
			msgs = basicSetEndAMultiplicity(newEndAMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ASSOCIATION__END_AMULTIPLICITY, newEndAMultiplicity, newEndAMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity getEndBMultiplicity() {
		return endBMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndBMultiplicity(Multiplicity newEndBMultiplicity, NotificationChain msgs) {
		Multiplicity oldEndBMultiplicity = endBMultiplicity;
		endBMultiplicity = newEndBMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XcorePackage.ASSOCIATION__END_BMULTIPLICITY, oldEndBMultiplicity, newEndBMultiplicity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndBMultiplicity(Multiplicity newEndBMultiplicity) {
		if (newEndBMultiplicity != endBMultiplicity) {
			NotificationChain msgs = null;
			if (endBMultiplicity != null)
				msgs = ((InternalEObject)endBMultiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XcorePackage.ASSOCIATION__END_BMULTIPLICITY, null, msgs);
			if (newEndBMultiplicity != null)
				msgs = ((InternalEObject)newEndBMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XcorePackage.ASSOCIATION__END_BMULTIPLICITY, null, msgs);
			msgs = basicSetEndBMultiplicity(newEndBMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ASSOCIATION__END_BMULTIPLICITY, newEndBMultiplicity, newEndBMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getParents() {
		BasicEList<Association> _xblockexpression = null; {
			final BasicEList<Association> parents = new BasicEList<Association>();
			final Consumer<Generalization> _function = new Consumer<Generalization>() {
				public void accept(final Generalization it) {
					final Classifier g = it.getGeneric();
					if ((g instanceof Association)) {
						parents.add(((Association)g));
					}
				}
			};
			this.getGeneralizations().forEach(_function);
			_xblockexpression = parents;
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getChildren() {
		BasicEList<Association> _xblockexpression = null; {
			final BasicEList<Association> children = new BasicEList<Association>();
			final Consumer<Generalization> _function = new Consumer<Generalization>() {
				public void accept(final Generalization it) {
					final Classifier s = it.getSpecific();
					if ((s instanceof Association)) {
						children.add(((Association)s));
					}
				}
			};
			this.getSpecializations().forEach(_function);
			_xblockexpression = children;
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcorePackage.ASSOCIATION__END_AMULTIPLICITY:
				return basicSetEndAMultiplicity(null, msgs);
			case XcorePackage.ASSOCIATION__END_BMULTIPLICITY:
				return basicSetEndBMultiplicity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.ASSOCIATION__END_AMULTIPLICITY:
				return getEndAMultiplicity();
			case XcorePackage.ASSOCIATION__END_BMULTIPLICITY:
				return getEndBMultiplicity();
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
			case XcorePackage.ASSOCIATION__END_AMULTIPLICITY:
				setEndAMultiplicity((Multiplicity)newValue);
				return;
			case XcorePackage.ASSOCIATION__END_BMULTIPLICITY:
				setEndBMultiplicity((Multiplicity)newValue);
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
			case XcorePackage.ASSOCIATION__END_AMULTIPLICITY:
				setEndAMultiplicity((Multiplicity)null);
				return;
			case XcorePackage.ASSOCIATION__END_BMULTIPLICITY:
				setEndBMultiplicity((Multiplicity)null);
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
			case XcorePackage.ASSOCIATION__END_AMULTIPLICITY:
				return endAMultiplicity != null;
			case XcorePackage.ASSOCIATION__END_BMULTIPLICITY:
				return endBMultiplicity != null;
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
			case XcorePackage.ASSOCIATION___GET_PARENTS:
				return getParents();
			case XcorePackage.ASSOCIATION___GET_CHILDREN:
				return getChildren();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssociationImpl
