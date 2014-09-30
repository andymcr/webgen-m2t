/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.man.cs.mdsd.genjsf.GenFeatureReference;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenServiceEntityFeature;

import uk.ac.man.cs.mdsd.jsf.FeatureReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Feature Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFeatureReferenceImpl#getCriteriaPath <em>Criteria Path</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFeatureReferenceImpl#getGenField <em>Gen Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenFeatureReferenceImpl extends EObjectImpl implements GenFeatureReference {
	/**
	 * The cached value of the '{@link #getCriteriaPath() <em>Criteria Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaPath()
	 * @generated
	 * @ordered
	 */
	protected FeatureReference criteriaPath;

	/**
	 * The cached value of the '{@link #getGenField() <em>Gen Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenField()
	 * @generated
	 * @ordered
	 */
	protected GenServiceEntityFeature genField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenFeatureReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_FEATURE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureReference getCriteriaPath() {
		if (criteriaPath != null && criteriaPath.eIsProxy()) {
			InternalEObject oldCriteriaPath = (InternalEObject)criteriaPath;
			criteriaPath = (FeatureReference)eResolveProxy(oldCriteriaPath);
			if (criteriaPath != oldCriteriaPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_FEATURE_REFERENCE__CRITERIA_PATH, oldCriteriaPath, criteriaPath));
			}
		}
		return criteriaPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureReference basicGetCriteriaPath() {
		return criteriaPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaPath(FeatureReference newCriteriaPath) {
		FeatureReference oldCriteriaPath = criteriaPath;
		criteriaPath = newCriteriaPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_FEATURE_REFERENCE__CRITERIA_PATH, oldCriteriaPath, criteriaPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityFeature getGenField() {
		if (genField != null && genField.eIsProxy()) {
			InternalEObject oldGenField = (InternalEObject)genField;
			genField = (GenServiceEntityFeature)eResolveProxy(oldGenField);
			if (genField != oldGenField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_FEATURE_REFERENCE__GEN_FIELD, oldGenField, genField));
			}
		}
		return genField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityFeature basicGetGenField() {
		return genField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenField(GenServiceEntityFeature newGenField) {
		GenServiceEntityFeature oldGenField = genField;
		genField = newGenField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_FEATURE_REFERENCE__GEN_FIELD, oldGenField, genField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_FEATURE_REFERENCE__CRITERIA_PATH:
				if (resolve) return getCriteriaPath();
				return basicGetCriteriaPath();
			case GenJsfPackage.GEN_FEATURE_REFERENCE__GEN_FIELD:
				if (resolve) return getGenField();
				return basicGetGenField();
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
			case GenJsfPackage.GEN_FEATURE_REFERENCE__CRITERIA_PATH:
				setCriteriaPath((FeatureReference)newValue);
				return;
			case GenJsfPackage.GEN_FEATURE_REFERENCE__GEN_FIELD:
				setGenField((GenServiceEntityFeature)newValue);
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
			case GenJsfPackage.GEN_FEATURE_REFERENCE__CRITERIA_PATH:
				setCriteriaPath((FeatureReference)null);
				return;
			case GenJsfPackage.GEN_FEATURE_REFERENCE__GEN_FIELD:
				setGenField((GenServiceEntityFeature)null);
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
			case GenJsfPackage.GEN_FEATURE_REFERENCE__CRITERIA_PATH:
				return criteriaPath != null;
			case GenJsfPackage.GEN_FEATURE_REFERENCE__GEN_FIELD:
				return genField != null;
		}
		return super.eIsSet(featureID);
	}

} //GenFeatureReferenceImpl
