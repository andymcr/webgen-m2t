/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.genjsf.GenUnitField;
import uk.ac.man.cs.mdsd.jsf.ForgottenPasswordUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Forgotten Password Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenForgottenPasswordUnitImpl#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenForgottenPasswordUnitImpl#getGenAuthenticationSystem <em>Gen Authentication System</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenForgottenPasswordUnitImpl#getGenLoginIdField <em>Gen Login Id Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenForgottenPasswordUnitImpl extends GenControlUnitImpl implements GenForgottenPasswordUnit {
	/**
	 * The cached value of the '{@link #getJsfUnit() <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfUnit()
	 * @generated
	 * @ordered
	 */
	protected ForgottenPasswordUnit jsfUnit;

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
	 * The cached value of the '{@link #getGenLoginIdField() <em>Gen Login Id Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenLoginIdField()
	 * @generated
	 * @ordered
	 */
	protected GenUnitField genLoginIdField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenForgottenPasswordUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_FORGOTTEN_PASSWORD_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForgottenPasswordUnit getJsfUnit() {
		if (jsfUnit != null && jsfUnit.eIsProxy()) {
			InternalEObject oldJsfUnit = (InternalEObject)jsfUnit;
			jsfUnit = (ForgottenPasswordUnit)eResolveProxy(oldJsfUnit);
			if (jsfUnit != oldJsfUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
			}
		}
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForgottenPasswordUnit basicGetJsfUnit() {
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfUnit(ForgottenPasswordUnit newJsfUnit) {
		ForgottenPasswordUnit oldJsfUnit = jsfUnit;
		jsfUnit = newJsfUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM, oldGenAuthenticationSystem, genAuthenticationSystem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM, oldGenAuthenticationSystem, newGenAuthenticationSystem);
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
				msgs = ((InternalEObject)genAuthenticationSystem).eInverseRemove(this, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT, GenLocalAuthenticationSystem.class, msgs);
			if (newGenAuthenticationSystem != null)
				msgs = ((InternalEObject)newGenAuthenticationSystem).eInverseAdd(this, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT, GenLocalAuthenticationSystem.class, msgs);
			msgs = basicSetGenAuthenticationSystem(newGenAuthenticationSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM, newGenAuthenticationSystem, newGenAuthenticationSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitField getGenLoginIdField() {
		if (genLoginIdField != null && genLoginIdField.eIsProxy()) {
			InternalEObject oldGenLoginIdField = (InternalEObject)genLoginIdField;
			genLoginIdField = (GenUnitField)eResolveProxy(oldGenLoginIdField);
			if (genLoginIdField != oldGenLoginIdField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_LOGIN_ID_FIELD, oldGenLoginIdField, genLoginIdField));
			}
		}
		return genLoginIdField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitField basicGetGenLoginIdField() {
		return genLoginIdField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenLoginIdField(GenUnitField newGenLoginIdField) {
		GenUnitField oldGenLoginIdField = genLoginIdField;
		genLoginIdField = newGenLoginIdField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_LOGIN_ID_FIELD, oldGenLoginIdField, genLoginIdField));
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
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM:
				if (genAuthenticationSystem != null)
					msgs = ((InternalEObject)genAuthenticationSystem).eInverseRemove(this, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT, GenLocalAuthenticationSystem.class, msgs);
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
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM:
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
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__JSF_UNIT:
				if (resolve) return getJsfUnit();
				return basicGetJsfUnit();
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM:
				if (resolve) return getGenAuthenticationSystem();
				return basicGetGenAuthenticationSystem();
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_LOGIN_ID_FIELD:
				if (resolve) return getGenLoginIdField();
				return basicGetGenLoginIdField();
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
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__JSF_UNIT:
				setJsfUnit((ForgottenPasswordUnit)newValue);
				return;
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM:
				setGenAuthenticationSystem((GenLocalAuthenticationSystem)newValue);
				return;
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_LOGIN_ID_FIELD:
				setGenLoginIdField((GenUnitField)newValue);
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
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__JSF_UNIT:
				setJsfUnit((ForgottenPasswordUnit)null);
				return;
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM:
				setGenAuthenticationSystem((GenLocalAuthenticationSystem)null);
				return;
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_LOGIN_ID_FIELD:
				setGenLoginIdField((GenUnitField)null);
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
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__JSF_UNIT:
				return jsfUnit != null;
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM:
				return genAuthenticationSystem != null;
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_LOGIN_ID_FIELD:
				return genLoginIdField != null;
		}
		return super.eIsSet(featureID);
	}

} //GenForgottenPasswordUnitImpl
