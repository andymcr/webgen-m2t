/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenCreateUnitImpl.java,v 1.8 2014/01/25 17:38:18 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenCreateUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.jsf.CreateUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Create Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCreateUnitImpl#getJsfUnit <em>Jsf Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenCreateUnitImpl extends GenEditUnitImpl implements GenCreateUnit {
	/**
	 * The cached value of the '{@link #getJsfUnit() <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfUnit()
	 * @generated
	 * @ordered
	 */
	protected CreateUnit jsfUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCreateUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_CREATE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateUnit getJsfUnit() {
		if (jsfUnit != null && jsfUnit.eIsProxy()) {
			InternalEObject oldJsfUnit = (InternalEObject)jsfUnit;
			jsfUnit = (CreateUnit)eResolveProxy(oldJsfUnit);
			if (jsfUnit != oldJsfUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_CREATE_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
			}
		}
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateUnit basicGetJsfUnit() {
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfUnit(CreateUnit newJsfUnit) {
		CreateUnit oldJsfUnit = jsfUnit;
		jsfUnit = newJsfUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_CREATE_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void reconcile(final GenContentUnit oldGenUnit) {
		super.reconcile(oldGenUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenContentUnit oldGenUnit) {
		super.reconcileSettings(oldGenUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_CREATE_UNIT__JSF_UNIT:
				if (resolve) return getJsfUnit();
				return basicGetJsfUnit();
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
			case GenJsfPackage.GEN_CREATE_UNIT__JSF_UNIT:
				setJsfUnit((CreateUnit)newValue);
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
			case GenJsfPackage.GEN_CREATE_UNIT__JSF_UNIT:
				setJsfUnit((CreateUnit)null);
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
			case GenJsfPackage.GEN_CREATE_UNIT__JSF_UNIT:
				return jsfUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //GenCreateUnitImpl
