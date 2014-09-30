/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit;

import uk.ac.man.cs.mdsd.jsf.RegistrationUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Registration Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenRegistrationUnitImpl#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenRegistrationUnitImpl#getGenAuthenticationSystem <em>Gen Authentication System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenRegistrationUnitImpl extends GenEditUnitImpl implements GenRegistrationUnit {
	/**
	 * The cached value of the '{@link #getJsfUnit() <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfUnit()
	 * @generated
	 * @ordered
	 */
	protected RegistrationUnit jsfUnit;

	/**
	 * The cached value of the '{@link #getGenAuthenticationSystem() <em>Gen Authentication System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenAuthenticationSystem()
	 * @generated
	 * @ordered
	 */
	protected GenLocalAuthenticationSystem genAuthenticationSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenRegistrationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_REGISTRATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationUnit getJsfUnit() {
		if (jsfUnit != null && jsfUnit.eIsProxy()) {
			InternalEObject oldJsfUnit = (InternalEObject)jsfUnit;
			jsfUnit = (RegistrationUnit)eResolveProxy(oldJsfUnit);
			if (jsfUnit != oldJsfUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_REGISTRATION_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
			}
		}
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationUnit basicGetJsfUnit() {
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfUnit(RegistrationUnit newJsfUnit) {
		RegistrationUnit oldJsfUnit = jsfUnit;
		jsfUnit = newJsfUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_REGISTRATION_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLocalAuthenticationSystem getGenAuthenticationSystem() {
		if (genAuthenticationSystem != null && genAuthenticationSystem.eIsProxy()) {
			InternalEObject oldGenAuthenticationSystem = (InternalEObject)genAuthenticationSystem;
			genAuthenticationSystem = (GenLocalAuthenticationSystem)eResolveProxy(oldGenAuthenticationSystem);
			if (genAuthenticationSystem != oldGenAuthenticationSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM, oldGenAuthenticationSystem, genAuthenticationSystem));
			}
		}
		return genAuthenticationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLocalAuthenticationSystem basicGetGenAuthenticationSystem() {
		return genAuthenticationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenAuthenticationSystem(GenLocalAuthenticationSystem newGenAuthenticationSystem, NotificationChain msgs) {
		GenLocalAuthenticationSystem oldGenAuthenticationSystem = genAuthenticationSystem;
		genAuthenticationSystem = newGenAuthenticationSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM, oldGenAuthenticationSystem, newGenAuthenticationSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenAuthenticationSystem(GenLocalAuthenticationSystem newGenAuthenticationSystem) {
		if (newGenAuthenticationSystem != genAuthenticationSystem) {
			NotificationChain msgs = null;
			if (genAuthenticationSystem != null)
				msgs = ((InternalEObject)genAuthenticationSystem).eInverseRemove(this, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT, GenLocalAuthenticationSystem.class, msgs);
			if (newGenAuthenticationSystem != null)
				msgs = ((InternalEObject)newGenAuthenticationSystem).eInverseAdd(this, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT, GenLocalAuthenticationSystem.class, msgs);
			msgs = basicSetGenAuthenticationSystem(newGenAuthenticationSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM, newGenAuthenticationSystem, newGenAuthenticationSystem));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM:
				if (genAuthenticationSystem != null)
					msgs = ((InternalEObject)genAuthenticationSystem).eInverseRemove(this, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT, GenLocalAuthenticationSystem.class, msgs);
				return basicSetGenAuthenticationSystem((GenLocalAuthenticationSystem)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM:
				return basicSetGenAuthenticationSystem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_REGISTRATION_UNIT__JSF_UNIT:
				if (resolve) return getJsfUnit();
				return basicGetJsfUnit();
			case GenJsfPackage.GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM:
				if (resolve) return getGenAuthenticationSystem();
				return basicGetGenAuthenticationSystem();
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
			case GenJsfPackage.GEN_REGISTRATION_UNIT__JSF_UNIT:
				setJsfUnit((RegistrationUnit)newValue);
				return;
			case GenJsfPackage.GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM:
				setGenAuthenticationSystem((GenLocalAuthenticationSystem)newValue);
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
			case GenJsfPackage.GEN_REGISTRATION_UNIT__JSF_UNIT:
				setJsfUnit((RegistrationUnit)null);
				return;
			case GenJsfPackage.GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM:
				setGenAuthenticationSystem((GenLocalAuthenticationSystem)null);
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
			case GenJsfPackage.GEN_REGISTRATION_UNIT__JSF_UNIT:
				return jsfUnit != null;
			case GenJsfPackage.GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM:
				return genAuthenticationSystem != null;
		}
		return super.eIsSet(featureID);
	}

} //GenRegistrationUnitImpl
