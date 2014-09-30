/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import uk.ac.man.cs.mdsd.genjsf.GenCurrentUserReference;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;

import uk.ac.man.cs.mdsd.jsf.CurrentUserReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Current User Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCurrentUserReferenceImpl#getCriteriaPath <em>Criteria Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenCurrentUserReferenceImpl extends EObjectImpl implements GenCurrentUserReference {
	/**
	 * The cached value of the '{@link #getCriteriaPath() <em>Criteria Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaPath()
	 * @generated
	 * @ordered
	 */
	protected CurrentUserReference criteriaPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCurrentUserReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_CURRENT_USER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentUserReference getCriteriaPath() {
		if (criteriaPath != null && criteriaPath.eIsProxy()) {
			InternalEObject oldCriteriaPath = (InternalEObject)criteriaPath;
			criteriaPath = (CurrentUserReference)eResolveProxy(oldCriteriaPath);
			if (criteriaPath != oldCriteriaPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_CURRENT_USER_REFERENCE__CRITERIA_PATH, oldCriteriaPath, criteriaPath));
			}
		}
		return criteriaPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentUserReference basicGetCriteriaPath() {
		return criteriaPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaPath(CurrentUserReference newCriteriaPath) {
		CurrentUserReference oldCriteriaPath = criteriaPath;
		criteriaPath = newCriteriaPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_CURRENT_USER_REFERENCE__CRITERIA_PATH, oldCriteriaPath, criteriaPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_CURRENT_USER_REFERENCE__CRITERIA_PATH:
				if (resolve) return getCriteriaPath();
				return basicGetCriteriaPath();
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
			case GenJsfPackage.GEN_CURRENT_USER_REFERENCE__CRITERIA_PATH:
				setCriteriaPath((CurrentUserReference)newValue);
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
			case GenJsfPackage.GEN_CURRENT_USER_REFERENCE__CRITERIA_PATH:
				setCriteriaPath((CurrentUserReference)null);
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
			case GenJsfPackage.GEN_CURRENT_USER_REFERENCE__CRITERIA_PATH:
				return criteriaPath != null;
		}
		return super.eIsSet(featureID);
	}

} //GenCurrentUserReferenceImpl
