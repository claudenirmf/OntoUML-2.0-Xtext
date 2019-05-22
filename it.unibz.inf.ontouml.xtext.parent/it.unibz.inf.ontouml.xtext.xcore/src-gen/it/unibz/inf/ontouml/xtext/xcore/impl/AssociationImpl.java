/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import it.unibz.inf.ontouml.xtext.xcore.Association;
import it.unibz.inf.ontouml.xtext.xcore.AssociationEnd;
import it.unibz.inf.ontouml.xtext.xcore.Classifier;
import it.unibz.inf.ontouml.xtext.xcore.Generalization;
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
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.AssociationImpl#getSourceEnd <em>Source End</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.AssociationImpl#getTargetEnd <em>Target End</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssociationImpl extends ClassifierImpl implements Association {
	/**
	 * The cached value of the '{@link #getSourceEnd() <em>Source End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEnd()
	 * @generated
	 * @ordered
	 */
	protected AssociationEnd sourceEnd;

	/**
	 * The cached value of the '{@link #getTargetEnd() <em>Target End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEnd()
	 * @generated
	 * @ordered
	 */
	protected AssociationEnd targetEnd;

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
	public AssociationEnd getSourceEnd() {
		return sourceEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceEnd(AssociationEnd newSourceEnd, NotificationChain msgs) {
		AssociationEnd oldSourceEnd = sourceEnd;
		sourceEnd = newSourceEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XcorePackage.ASSOCIATION__SOURCE_END, oldSourceEnd, newSourceEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceEnd(AssociationEnd newSourceEnd) {
		if (newSourceEnd != sourceEnd) {
			NotificationChain msgs = null;
			if (sourceEnd != null)
				msgs = ((InternalEObject)sourceEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XcorePackage.ASSOCIATION__SOURCE_END, null, msgs);
			if (newSourceEnd != null)
				msgs = ((InternalEObject)newSourceEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XcorePackage.ASSOCIATION__SOURCE_END, null, msgs);
			msgs = basicSetSourceEnd(newSourceEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ASSOCIATION__SOURCE_END, newSourceEnd, newSourceEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEnd getTargetEnd() {
		return targetEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetEnd(AssociationEnd newTargetEnd, NotificationChain msgs) {
		AssociationEnd oldTargetEnd = targetEnd;
		targetEnd = newTargetEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XcorePackage.ASSOCIATION__TARGET_END, oldTargetEnd, newTargetEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEnd(AssociationEnd newTargetEnd) {
		if (newTargetEnd != targetEnd) {
			NotificationChain msgs = null;
			if (targetEnd != null)
				msgs = ((InternalEObject)targetEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XcorePackage.ASSOCIATION__TARGET_END, null, msgs);
			if (newTargetEnd != null)
				msgs = ((InternalEObject)newTargetEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XcorePackage.ASSOCIATION__TARGET_END, null, msgs);
			msgs = basicSetTargetEnd(newTargetEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ASSOCIATION__TARGET_END, newTargetEnd, newTargetEnd));
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
			case XcorePackage.ASSOCIATION__SOURCE_END:
				return basicSetSourceEnd(null, msgs);
			case XcorePackage.ASSOCIATION__TARGET_END:
				return basicSetTargetEnd(null, msgs);
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
			case XcorePackage.ASSOCIATION__SOURCE_END:
				return getSourceEnd();
			case XcorePackage.ASSOCIATION__TARGET_END:
				return getTargetEnd();
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
			case XcorePackage.ASSOCIATION__SOURCE_END:
				setSourceEnd((AssociationEnd)newValue);
				return;
			case XcorePackage.ASSOCIATION__TARGET_END:
				setTargetEnd((AssociationEnd)newValue);
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
			case XcorePackage.ASSOCIATION__SOURCE_END:
				setSourceEnd((AssociationEnd)null);
				return;
			case XcorePackage.ASSOCIATION__TARGET_END:
				setTargetEnd((AssociationEnd)null);
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
			case XcorePackage.ASSOCIATION__SOURCE_END:
				return sourceEnd != null;
			case XcorePackage.ASSOCIATION__TARGET_END:
				return targetEnd != null;
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
