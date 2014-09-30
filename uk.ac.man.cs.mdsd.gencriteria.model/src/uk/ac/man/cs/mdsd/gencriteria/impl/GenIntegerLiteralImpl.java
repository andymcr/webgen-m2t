/**
 */
package uk.ac.man.cs.mdsd.gencriteria.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.man.cs.mdsd.criteria.IntegerLiteral;

import uk.ac.man.cs.mdsd.gencriteria.GenIntegerLiteral;
import uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenIntegerLiteralImpl#getCriteriaLiteral <em>Criteria Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenIntegerLiteralImpl extends EObjectImpl implements GenIntegerLiteral {
	/**
	 * The cached value of the '{@link #getCriteriaLiteral() <em>Criteria Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaLiteral()
	 * @generated
	 * @ordered
	 */
	protected IntegerLiteral criteriaLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenIntegerLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GencriteriaPackage.Literals.GEN_INTEGER_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral getCriteriaLiteral() {
		if (criteriaLiteral != null && criteriaLiteral.eIsProxy()) {
			InternalEObject oldCriteriaLiteral = (InternalEObject)criteriaLiteral;
			criteriaLiteral = (IntegerLiteral)eResolveProxy(oldCriteriaLiteral);
			if (criteriaLiteral != oldCriteriaLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GencriteriaPackage.GEN_INTEGER_LITERAL__CRITERIA_LITERAL, oldCriteriaLiteral, criteriaLiteral));
			}
		}
		return criteriaLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral basicGetCriteriaLiteral() {
		return criteriaLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaLiteral(IntegerLiteral newCriteriaLiteral) {
		IntegerLiteral oldCriteriaLiteral = criteriaLiteral;
		criteriaLiteral = newCriteriaLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_INTEGER_LITERAL__CRITERIA_LITERAL, oldCriteriaLiteral, criteriaLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GencriteriaPackage.GEN_INTEGER_LITERAL__CRITERIA_LITERAL:
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
			case GencriteriaPackage.GEN_INTEGER_LITERAL__CRITERIA_LITERAL:
				setCriteriaLiteral((IntegerLiteral)newValue);
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
			case GencriteriaPackage.GEN_INTEGER_LITERAL__CRITERIA_LITERAL:
				setCriteriaLiteral((IntegerLiteral)null);
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
			case GencriteriaPackage.GEN_INTEGER_LITERAL__CRITERIA_LITERAL:
				return criteriaLiteral != null;
		}
		return super.eIsSet(featureID);
	}

} //GenIntegerLiteralImpl
