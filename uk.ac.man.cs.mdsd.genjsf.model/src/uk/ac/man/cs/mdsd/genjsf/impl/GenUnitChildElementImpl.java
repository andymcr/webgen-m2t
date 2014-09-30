/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement;
import uk.ac.man.cs.mdsd.genjsf.GenUnitChildElement;

import uk.ac.man.cs.mdsd.jsf.UnitChildElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Unit Child Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildElementImpl#getJsfChildFeature <em>Jsf Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildElementImpl#getGenServiceFeature <em>Gen Service Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenUnitChildElementImpl extends GenUnitChildFeatureImpl implements GenUnitChildElement {
	/**
	 * The cached value of the '{@link #getJsfChildFeature() <em>Jsf Child Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfChildFeature()
	 * @generated
	 * @ordered
	 */
	protected UnitChildElement jsfChildFeature;

	/**
	 * The cached value of the '{@link #getGenServiceFeature() <em>Gen Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenServiceFeature()
	 * @generated
	 * @ordered
	 */
	protected GenServiceEntityElement genServiceFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenUnitChildElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_UNIT_CHILD_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitChildElement getJsfChildFeature() {
		if (jsfChildFeature != null && jsfChildFeature.eIsProxy()) {
			InternalEObject oldJsfChildFeature = (InternalEObject)jsfChildFeature;
			jsfChildFeature = (UnitChildElement)eResolveProxy(oldJsfChildFeature);
			if (jsfChildFeature != oldJsfChildFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_UNIT_CHILD_ELEMENT__JSF_CHILD_FEATURE, oldJsfChildFeature, jsfChildFeature));
			}
		}
		return jsfChildFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitChildElement basicGetJsfChildFeature() {
		return jsfChildFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfChildFeature(UnitChildElement newJsfChildFeature) {
		UnitChildElement oldJsfChildFeature = jsfChildFeature;
		jsfChildFeature = newJsfChildFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_CHILD_ELEMENT__JSF_CHILD_FEATURE, oldJsfChildFeature, jsfChildFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityElement getGenServiceFeature() {
		if (genServiceFeature != null && genServiceFeature.eIsProxy()) {
			InternalEObject oldGenServiceFeature = (InternalEObject)genServiceFeature;
			genServiceFeature = (GenServiceEntityElement)eResolveProxy(oldGenServiceFeature);
			if (genServiceFeature != oldGenServiceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_UNIT_CHILD_ELEMENT__GEN_SERVICE_FEATURE, oldGenServiceFeature, genServiceFeature));
			}
		}
		return genServiceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityElement basicGetGenServiceFeature() {
		return genServiceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenServiceFeature(GenServiceEntityElement newGenServiceFeature) {
		GenServiceEntityElement oldGenServiceFeature = genServiceFeature;
		genServiceFeature = newGenServiceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_CHILD_ELEMENT__GEN_SERVICE_FEATURE, oldGenServiceFeature, genServiceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_UNIT_CHILD_ELEMENT__JSF_CHILD_FEATURE:
				if (resolve) return getJsfChildFeature();
				return basicGetJsfChildFeature();
			case GenJsfPackage.GEN_UNIT_CHILD_ELEMENT__GEN_SERVICE_FEATURE:
				if (resolve) return getGenServiceFeature();
				return basicGetGenServiceFeature();
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
			case GenJsfPackage.GEN_UNIT_CHILD_ELEMENT__JSF_CHILD_FEATURE:
				setJsfChildFeature((UnitChildElement)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_CHILD_ELEMENT__GEN_SERVICE_FEATURE:
				setGenServiceFeature((GenServiceEntityElement)newValue);
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
			case GenJsfPackage.GEN_UNIT_CHILD_ELEMENT__JSF_CHILD_FEATURE:
				setJsfChildFeature((UnitChildElement)null);
				return;
			case GenJsfPackage.GEN_UNIT_CHILD_ELEMENT__GEN_SERVICE_FEATURE:
				setGenServiceFeature((GenServiceEntityElement)null);
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
			case GenJsfPackage.GEN_UNIT_CHILD_ELEMENT__JSF_CHILD_FEATURE:
				return jsfChildFeature != null;
			case GenJsfPackage.GEN_UNIT_CHILD_ELEMENT__GEN_SERVICE_FEATURE:
				return genServiceFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //GenUnitChildElementImpl
