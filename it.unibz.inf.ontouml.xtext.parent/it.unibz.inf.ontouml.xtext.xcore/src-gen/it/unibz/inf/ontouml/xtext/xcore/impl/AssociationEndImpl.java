/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import com.google.common.base.Objects;
import it.unibz.inf.ontouml.xtext.xcore.AggregationKind;
import it.unibz.inf.ontouml.xtext.xcore.AssociationEnd;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.AssociationEndImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.AssociationEndImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.AssociationEndImpl#getAggregationKind <em>Aggregation Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationEndImpl extends MinimalEObjectImpl.Container implements AssociationEnd {
	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_BOUND_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected String lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_BOUND_EDEFAULT = "*";

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected String upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationKind() <em>Aggregation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationKind()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationKind AGGREGATION_KIND_EDEFAULT = AggregationKind.NONE;

	/**
	 * The cached value of the '{@link #getAggregationKind() <em>Aggregation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationKind()
	 * @generated
	 * @ordered
	 */
	protected AggregationKind aggregationKind = AGGREGATION_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.ASSOCIATION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(String newLowerBound) {
		String oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ASSOCIATION_END__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(String newUpperBound) {
		String oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ASSOCIATION_END__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind getAggregationKind() {
		return aggregationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationKind(AggregationKind newAggregationKind) {
		AggregationKind oldAggregationKind = aggregationKind;
		aggregationKind = newAggregationKind == null ? AGGREGATION_KIND_EDEFAULT : newAggregationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ASSOCIATION_END__AGGREGATION_KIND, oldAggregationKind, aggregationKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepresentingWhole() {
		return (Objects.equal(this.getAggregationKind(), AggregationKind.AGGREGATION) || Objects.equal(this.getAggregationKind(), AggregationKind.COMPOSITION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(final String lowerBound, final String upperBound) {
		this.setLowerBound(lowerBound);
		this.setUpperBound(upperBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZeroToOne() {
		this.setMultiplicity("0", "1");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZeroToMany() {
		this.setMultiplicity("0", "*");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneToOne() {
		this.setMultiplicity("1", "1");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneToMany() {
		this.setMultiplicity("*", "*");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.ASSOCIATION_END__LOWER_BOUND:
				return getLowerBound();
			case XcorePackage.ASSOCIATION_END__UPPER_BOUND:
				return getUpperBound();
			case XcorePackage.ASSOCIATION_END__AGGREGATION_KIND:
				return getAggregationKind();
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
			case XcorePackage.ASSOCIATION_END__LOWER_BOUND:
				setLowerBound((String)newValue);
				return;
			case XcorePackage.ASSOCIATION_END__UPPER_BOUND:
				setUpperBound((String)newValue);
				return;
			case XcorePackage.ASSOCIATION_END__AGGREGATION_KIND:
				setAggregationKind((AggregationKind)newValue);
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
			case XcorePackage.ASSOCIATION_END__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case XcorePackage.ASSOCIATION_END__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case XcorePackage.ASSOCIATION_END__AGGREGATION_KIND:
				setAggregationKind(AGGREGATION_KIND_EDEFAULT);
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
			case XcorePackage.ASSOCIATION_END__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case XcorePackage.ASSOCIATION_END__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
			case XcorePackage.ASSOCIATION_END__AGGREGATION_KIND:
				return aggregationKind != AGGREGATION_KIND_EDEFAULT;
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
			case XcorePackage.ASSOCIATION_END___IS_REPRESENTING_WHOLE:
				return isRepresentingWhole();
			case XcorePackage.ASSOCIATION_END___SET_MULTIPLICITY__STRING_STRING:
				setMultiplicity((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case XcorePackage.ASSOCIATION_END___SET_ZERO_TO_ONE:
				setZeroToOne();
				return null;
			case XcorePackage.ASSOCIATION_END___SET_ZERO_TO_MANY:
				setZeroToMany();
				return null;
			case XcorePackage.ASSOCIATION_END___SET_ONE_TO_ONE:
				setOneToOne();
				return null;
			case XcorePackage.ASSOCIATION_END___SET_ONE_TO_MANY:
				setOneToMany();
				return null;
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
		result.append(" (lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", aggregationKind: ");
		result.append(aggregationKind);
		result.append(')');
		return result.toString();
	}

} //AssociationEndImpl
