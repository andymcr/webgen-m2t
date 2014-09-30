/**
 */
package uk.ac.man.cs.mdsd.gencriteria.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.man.cs.mdsd.criteria.Function;

import uk.ac.man.cs.mdsd.gencriteria.GenFunction;
import uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenFunctionImpl#getCriteriaFunction <em>Criteria Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenFunctionImpl extends EObjectImpl implements GenFunction {
	/**
	 * The cached value of the '{@link #getCriteriaFunction() <em>Criteria Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaFunction()
	 * @generated
	 * @ordered
	 */
	protected Function criteriaFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GencriteriaPackage.Literals.GEN_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getCriteriaFunction() {
		if (criteriaFunction != null && criteriaFunction.eIsProxy()) {
			InternalEObject oldCriteriaFunction = (InternalEObject)criteriaFunction;
			criteriaFunction = (Function)eResolveProxy(oldCriteriaFunction);
			if (criteriaFunction != oldCriteriaFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GencriteriaPackage.GEN_FUNCTION__CRITERIA_FUNCTION, oldCriteriaFunction, criteriaFunction));
			}
		}
		return criteriaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetCriteriaFunction() {
		return criteriaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaFunction(Function newCriteriaFunction) {
		Function oldCriteriaFunction = criteriaFunction;
		criteriaFunction = newCriteriaFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_FUNCTION__CRITERIA_FUNCTION, oldCriteriaFunction, criteriaFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GencriteriaPackage.GEN_FUNCTION__CRITERIA_FUNCTION:
				if (resolve) return getCriteriaFunction();
				return basicGetCriteriaFunction();
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
			case GencriteriaPackage.GEN_FUNCTION__CRITERIA_FUNCTION:
				setCriteriaFunction((Function)newValue);
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
			case GencriteriaPackage.GEN_FUNCTION__CRITERIA_FUNCTION:
				setCriteriaFunction((Function)null);
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
			case GencriteriaPackage.GEN_FUNCTION__CRITERIA_FUNCTION:
				return criteriaFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //GenFunctionImpl
