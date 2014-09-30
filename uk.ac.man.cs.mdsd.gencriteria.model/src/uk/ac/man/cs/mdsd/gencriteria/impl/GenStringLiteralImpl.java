/**
 */
package uk.ac.man.cs.mdsd.gencriteria.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.man.cs.mdsd.criteria.StringLiteral;

import uk.ac.man.cs.mdsd.gencriteria.GenStringLiteral;
import uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen String Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenStringLiteralImpl#getCriteriaLiteral <em>Criteria Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenStringLiteralImpl extends EObjectImpl implements GenStringLiteral {
	/**
	 * The cached value of the '{@link #getCriteriaLiteral() <em>Criteria Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaLiteral()
	 * @generated
	 * @ordered
	 */
	protected StringLiteral criteriaLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenStringLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GencriteriaPackage.Literals.GEN_STRING_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral getCriteriaLiteral() {
		if (criteriaLiteral != null && criteriaLiteral.eIsProxy()) {
			InternalEObject oldCriteriaLiteral = (InternalEObject)criteriaLiteral;
			criteriaLiteral = (StringLiteral)eResolveProxy(oldCriteriaLiteral);
			if (criteriaLiteral != oldCriteriaLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GencriteriaPackage.GEN_STRING_LITERAL__CRITERIA_LITERAL, oldCriteriaLiteral, criteriaLiteral));
			}
		}
		return criteriaLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral basicGetCriteriaLiteral() {
		return criteriaLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaLiteral(StringLiteral newCriteriaLiteral) {
		StringLiteral oldCriteriaLiteral = criteriaLiteral;
		criteriaLiteral = newCriteriaLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_STRING_LITERAL__CRITERIA_LITERAL, oldCriteriaLiteral, criteriaLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GencriteriaPackage.GEN_STRING_LITERAL__CRITERIA_LITERAL:
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
			case GencriteriaPackage.GEN_STRING_LITERAL__CRITERIA_LITERAL:
				setCriteriaLiteral((StringLiteral)newValue);
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
			case GencriteriaPackage.GEN_STRING_LITERAL__CRITERIA_LITERAL:
				setCriteriaLiteral((StringLiteral)null);
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
			case GencriteriaPackage.GEN_STRING_LITERAL__CRITERIA_LITERAL:
				return criteriaLiteral != null;
		}
		return super.eIsSet(featureID);
	}

} //GenStringLiteralImpl
