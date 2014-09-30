/**
 */
package uk.ac.man.cs.mdsd.gencriteria.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.man.cs.mdsd.criteria.CurrentTime;

import uk.ac.man.cs.mdsd.gencriteria.GenCurrentTime;
import uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Current Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenCurrentTimeImpl#getCriteriaLiteral <em>Criteria Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenCurrentTimeImpl extends EObjectImpl implements GenCurrentTime {
	/**
	 * The cached value of the '{@link #getCriteriaLiteral() <em>Criteria Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaLiteral()
	 * @generated
	 * @ordered
	 */
	protected CurrentTime criteriaLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCurrentTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GencriteriaPackage.Literals.GEN_CURRENT_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentTime getCriteriaLiteral() {
		if (criteriaLiteral != null && criteriaLiteral.eIsProxy()) {
			InternalEObject oldCriteriaLiteral = (InternalEObject)criteriaLiteral;
			criteriaLiteral = (CurrentTime)eResolveProxy(oldCriteriaLiteral);
			if (criteriaLiteral != oldCriteriaLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GencriteriaPackage.GEN_CURRENT_TIME__CRITERIA_LITERAL, oldCriteriaLiteral, criteriaLiteral));
			}
		}
		return criteriaLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentTime basicGetCriteriaLiteral() {
		return criteriaLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaLiteral(CurrentTime newCriteriaLiteral) {
		CurrentTime oldCriteriaLiteral = criteriaLiteral;
		criteriaLiteral = newCriteriaLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_CURRENT_TIME__CRITERIA_LITERAL, oldCriteriaLiteral, criteriaLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GencriteriaPackage.GEN_CURRENT_TIME__CRITERIA_LITERAL:
				if (resolve) return getCriteriaLiteral();
				return basicGetCriteriaLiteral();
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
			case GencriteriaPackage.GEN_CURRENT_TIME__CRITERIA_LITERAL:
				setCriteriaLiteral((CurrentTime)newValue);
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
			case GencriteriaPackage.GEN_CURRENT_TIME__CRITERIA_LITERAL:
				setCriteriaLiteral((CurrentTime)null);
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
			case GencriteriaPackage.GEN_CURRENT_TIME__CRITERIA_LITERAL:
				return criteriaLiteral != null;
		}
		return super.eIsSet(featureID);
	}

} //GenCurrentTimeImpl
