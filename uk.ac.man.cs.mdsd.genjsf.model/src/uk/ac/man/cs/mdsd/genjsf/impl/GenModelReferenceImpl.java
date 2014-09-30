/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenModelReference;

import uk.ac.man.cs.mdsd.jsf.ModelReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Model Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenModelReferenceImpl#getCriteriaPath <em>Criteria Path</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenModelReferenceImpl#getGenUnit <em>Gen Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenModelReferenceImpl extends EObjectImpl implements GenModelReference {
	/**
	 * The cached value of the '{@link #getCriteriaPath() <em>Criteria Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaPath()
	 * @generated
	 * @ordered
	 */
	protected ModelReference criteriaPath;

	/**
	 * The cached value of the '{@link #getGenUnit() <em>Gen Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenUnit()
	 * @generated
	 * @ordered
	 */
	protected GenDynamicUnit genUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenModelReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_MODEL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelReference getCriteriaPath() {
		if (criteriaPath != null && criteriaPath.eIsProxy()) {
			InternalEObject oldCriteriaPath = (InternalEObject)criteriaPath;
			criteriaPath = (ModelReference)eResolveProxy(oldCriteriaPath);
			if (criteriaPath != oldCriteriaPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_MODEL_REFERENCE__CRITERIA_PATH, oldCriteriaPath, criteriaPath));
			}
		}
		return criteriaPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelReference basicGetCriteriaPath() {
		return criteriaPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaPath(ModelReference newCriteriaPath) {
		ModelReference oldCriteriaPath = criteriaPath;
		criteriaPath = newCriteriaPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_MODEL_REFERENCE__CRITERIA_PATH, oldCriteriaPath, criteriaPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDynamicUnit getGenUnit() {
		if (genUnit != null && genUnit.eIsProxy()) {
			InternalEObject oldGenUnit = (InternalEObject)genUnit;
			genUnit = (GenDynamicUnit)eResolveProxy(oldGenUnit);
			if (genUnit != oldGenUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_MODEL_REFERENCE__GEN_UNIT, oldGenUnit, genUnit));
			}
		}
		return genUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDynamicUnit basicGetGenUnit() {
		return genUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenUnit(GenDynamicUnit newGenUnit) {
		GenDynamicUnit oldGenUnit = genUnit;
		genUnit = newGenUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_MODEL_REFERENCE__GEN_UNIT, oldGenUnit, genUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_MODEL_REFERENCE__CRITERIA_PATH:
				if (resolve) return getCriteriaPath();
				return basicGetCriteriaPath();
			case GenJsfPackage.GEN_MODEL_REFERENCE__GEN_UNIT:
				if (resolve) return getGenUnit();
				return basicGetGenUnit();
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
			case GenJsfPackage.GEN_MODEL_REFERENCE__CRITERIA_PATH:
				setCriteriaPath((ModelReference)newValue);
				return;
			case GenJsfPackage.GEN_MODEL_REFERENCE__GEN_UNIT:
				setGenUnit((GenDynamicUnit)newValue);
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
			case GenJsfPackage.GEN_MODEL_REFERENCE__CRITERIA_PATH:
				setCriteriaPath((ModelReference)null);
				return;
			case GenJsfPackage.GEN_MODEL_REFERENCE__GEN_UNIT:
				setGenUnit((GenDynamicUnit)null);
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
			case GenJsfPackage.GEN_MODEL_REFERENCE__CRITERIA_PATH:
				return criteriaPath != null;
			case GenJsfPackage.GEN_MODEL_REFERENCE__GEN_UNIT:
				return genUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //GenModelReferenceImpl
