/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.waf.WafPackage;
import uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.waf.LoginUnit;
import uk.ac.man.cs.mdsd.waf.UnitField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Login Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LoginUnitImpl#getAuthenticationSystem <em>Authentication System</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LoginUnitImpl#getLoginIdField <em>Login Id Field</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LoginUnitImpl#getPasswordField <em>Password Field</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LoginUnitImpl#getRememberMeField <em>Remember Me Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoginUnitImpl extends ControlUnitImpl implements LoginUnit {
	/**
	 * The cached value of the '{@link #getAuthenticationSystem() <em>Authentication System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationSystem()
	 * @generated
	 * @ordered
	 */
	protected LocalAuthenticationSystem authenticationSystem;
	/**
	 * The cached value of the '{@link #getLoginIdField() <em>Login Id Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginIdField()
	 * @generated
	 * @ordered
	 */
	protected UnitField loginIdField;
	/**
	 * The cached value of the '{@link #getPasswordField() <em>Password Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordField()
	 * @generated
	 * @ordered
	 */
	protected UnitField passwordField;
	/**
	 * The cached value of the '{@link #getRememberMeField() <em>Remember Me Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRememberMeField()
	 * @generated
	 * @ordered
	 */
	protected UnitField rememberMeField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoginUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.LOGIN_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystem getAuthenticationSystem() {
		if (authenticationSystem != null && authenticationSystem.eIsProxy()) {
			InternalEObject oldAuthenticationSystem = (InternalEObject)authenticationSystem;
			authenticationSystem = (LocalAuthenticationSystem)eResolveProxy(oldAuthenticationSystem);
			if (authenticationSystem != oldAuthenticationSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM, oldAuthenticationSystem, authenticationSystem));
			}
		}
		return authenticationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystem basicGetAuthenticationSystem() {
		return authenticationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthenticationSystem(LocalAuthenticationSystem newAuthenticationSystem, NotificationChain msgs) {
		LocalAuthenticationSystem oldAuthenticationSystem = authenticationSystem;
		authenticationSystem = newAuthenticationSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM, oldAuthenticationSystem, newAuthenticationSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticationSystem(LocalAuthenticationSystem newAuthenticationSystem) {
		if (newAuthenticationSystem != authenticationSystem) {
			NotificationChain msgs = null;
			if (authenticationSystem != null)
				msgs = ((InternalEObject)authenticationSystem).eInverseRemove(this, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT, LocalAuthenticationSystem.class, msgs);
			if (newAuthenticationSystem != null)
				msgs = ((InternalEObject)newAuthenticationSystem).eInverseAdd(this, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT, LocalAuthenticationSystem.class, msgs);
			msgs = basicSetAuthenticationSystem(newAuthenticationSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM, newAuthenticationSystem, newAuthenticationSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitField getLoginIdField() {
		if (loginIdField != null && loginIdField.eIsProxy()) {
			InternalEObject oldLoginIdField = (InternalEObject)loginIdField;
			loginIdField = (UnitField)eResolveProxy(oldLoginIdField);
			if (loginIdField != oldLoginIdField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.LOGIN_UNIT__LOGIN_ID_FIELD, oldLoginIdField, loginIdField));
			}
		}
		return loginIdField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitField basicGetLoginIdField() {
		return loginIdField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginIdField(UnitField newLoginIdField) {
		UnitField oldLoginIdField = loginIdField;
		loginIdField = newLoginIdField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOGIN_UNIT__LOGIN_ID_FIELD, oldLoginIdField, loginIdField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitField getPasswordField() {
		if (passwordField != null && passwordField.eIsProxy()) {
			InternalEObject oldPasswordField = (InternalEObject)passwordField;
			passwordField = (UnitField)eResolveProxy(oldPasswordField);
			if (passwordField != oldPasswordField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.LOGIN_UNIT__PASSWORD_FIELD, oldPasswordField, passwordField));
			}
		}
		return passwordField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitField basicGetPasswordField() {
		return passwordField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordField(UnitField newPasswordField) {
		UnitField oldPasswordField = passwordField;
		passwordField = newPasswordField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOGIN_UNIT__PASSWORD_FIELD, oldPasswordField, passwordField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitField getRememberMeField() {
		if (rememberMeField != null && rememberMeField.eIsProxy()) {
			InternalEObject oldRememberMeField = (InternalEObject)rememberMeField;
			rememberMeField = (UnitField)eResolveProxy(oldRememberMeField);
			if (rememberMeField != oldRememberMeField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.LOGIN_UNIT__REMEMBER_ME_FIELD, oldRememberMeField, rememberMeField));
			}
		}
		return rememberMeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitField basicGetRememberMeField() {
		return rememberMeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRememberMeField(UnitField newRememberMeField) {
		UnitField oldRememberMeField = rememberMeField;
		rememberMeField = newRememberMeField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOGIN_UNIT__REMEMBER_ME_FIELD, oldRememberMeField, rememberMeField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM:
				if (authenticationSystem != null)
					msgs = ((InternalEObject)authenticationSystem).eInverseRemove(this, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT, LocalAuthenticationSystem.class, msgs);
				return basicSetAuthenticationSystem((LocalAuthenticationSystem)otherEnd, msgs);
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
			case WafPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM:
				return basicSetAuthenticationSystem(null, msgs);
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
			case WafPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM:
				if (resolve) return getAuthenticationSystem();
				return basicGetAuthenticationSystem();
			case WafPackage.LOGIN_UNIT__LOGIN_ID_FIELD:
				if (resolve) return getLoginIdField();
				return basicGetLoginIdField();
			case WafPackage.LOGIN_UNIT__PASSWORD_FIELD:
				if (resolve) return getPasswordField();
				return basicGetPasswordField();
			case WafPackage.LOGIN_UNIT__REMEMBER_ME_FIELD:
				if (resolve) return getRememberMeField();
				return basicGetRememberMeField();
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
			case WafPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM:
				setAuthenticationSystem((LocalAuthenticationSystem)newValue);
				return;
			case WafPackage.LOGIN_UNIT__LOGIN_ID_FIELD:
				setLoginIdField((UnitField)newValue);
				return;
			case WafPackage.LOGIN_UNIT__PASSWORD_FIELD:
				setPasswordField((UnitField)newValue);
				return;
			case WafPackage.LOGIN_UNIT__REMEMBER_ME_FIELD:
				setRememberMeField((UnitField)newValue);
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
			case WafPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM:
				setAuthenticationSystem((LocalAuthenticationSystem)null);
				return;
			case WafPackage.LOGIN_UNIT__LOGIN_ID_FIELD:
				setLoginIdField((UnitField)null);
				return;
			case WafPackage.LOGIN_UNIT__PASSWORD_FIELD:
				setPasswordField((UnitField)null);
				return;
			case WafPackage.LOGIN_UNIT__REMEMBER_ME_FIELD:
				setRememberMeField((UnitField)null);
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
			case WafPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM:
				return authenticationSystem != null;
			case WafPackage.LOGIN_UNIT__LOGIN_ID_FIELD:
				return loginIdField != null;
			case WafPackage.LOGIN_UNIT__PASSWORD_FIELD:
				return passwordField != null;
			case WafPackage.LOGIN_UNIT__REMEMBER_ME_FIELD:
				return rememberMeField != null;
		}
		return super.eIsSet(featureID);
	}

} //LoginUnitImpl
