/**
 */
package uk.ac.man.cs.mdsd.gencriteria.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.man.cs.mdsd.criteria.NullLiteral;

import uk.ac.man.cs.mdsd.gencriteria.GenNullLiteral;
import uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Null Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenNullLiteralImpl#getCriteriaLiteral <em>Criteria Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenNullLiteralImpl extends EObjectImpl implements GenNullLiteral {
	/**
	 * The cached value of the '{@link #getCriteriaLiteral() <em>Criteria Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaLiteral()
	 * @generated
	 * @ordered
	 */
	protected NullLiteral criteriaLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenNullLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GencriteriaPackage.Literals.GEN_NULL_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteral getCriteriaLiteral() {
		if (criteriaLiteral != null && criteriaLiteral.eIsProxy()) {
			InternalEObject oldCriteriaLiteral = (InternalEObject)criteriaLiteral;
			criteriaLiteral = (NullLiteral)eResolveProxy(oldCriteriaLiteral);
			if (criteriaLiteral != oldCriteriaLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GencriteriaPackage.GEN_NULL_LITERAL__CRITERIA_LITERAL, oldCriteriaLiteral, criteriaLiteral));
			}
		}
		return criteriaLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteral basicGetCriteriaLiteral() {
		return criteriaLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaLiteral(NullLiteral newCriteriaLiteral) {
		NullLiteral oldCriteriaLiteral = criteriaLiteral;
		criteriaLiteral = newCriteriaLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_NULL_LITERAL__CRITERIA_LITERAL, oldCriteriaLiteral, criteriaLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GencriteriaPackage.GEN_NULL_LITERAL__CRITERIA_LITERAL:
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
			case GencriteriaPackage.GEN_NULL_LITERAL__CRITERIA_LITERAL:
				setCriteriaLiteral((NullLiteral)newValue);
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
			case GencriteriaPackage.GEN_NULL_LITERAL__CRITERIA_LITERAL:
				setCriteriaLiteral((NullLiteral)null);
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
			case GencriteriaPackage.GEN_NULL_LITERAL__CRITERIA_LITERAL:
				return criteriaLiteral != null;
		}
		return super.eIsSet(featureID);
	}

} //GenNullLiteralImpl
