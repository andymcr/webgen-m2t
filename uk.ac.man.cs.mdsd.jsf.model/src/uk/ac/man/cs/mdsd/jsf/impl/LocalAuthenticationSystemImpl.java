/**
 */
package uk.ac.man.cs.mdsd.jsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.jsf.ForgottenPasswordUnit;
import uk.ac.man.cs.mdsd.jsf.JsfPackage;
import uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.jsf.LoginUnit;
import uk.ac.man.cs.mdsd.jsf.RegistrationUnit;
import uk.ac.man.cs.mdsd.jsf.Service;
import uk.ac.man.cs.mdsd.jsf.ServiceEntityElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl#getUserService <em>User Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl#getUserAuthenticationKey <em>User Authentication Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl#getAuthenticationService <em>Authentication Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl#getLoginAttemptService <em>Login Attempt Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl#getAutoLoginService <em>Auto Login Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl#isAllowSelfRegistration <em>Allow Self Registration</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl#isUseEmailActivation <em>Use Email Activation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl#isSendWelcomeEmail <em>Send Welcome Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl#getRegistrationUnit <em>Registration Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl#getLoginUnit <em>Login Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalAuthenticationSystemImpl extends AuthenticationImpl implements LocalAuthenticationSystem {
	/**
	 * The cached value of the '{@link #getUserService() <em>User Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserService()
	 * @generated
	 * @ordered
	 */
	protected Service userService;

	/**
	 * The cached value of the '{@link #getUserAuthenticationKey() <em>User Authentication Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAuthenticationKey()
	 * @generated
	 * @ordered
	 */
	protected ServiceEntityElement userAuthenticationKey;

	/**
	 * The cached value of the '{@link #getAuthenticationService() <em>Authentication Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationService()
	 * @generated
	 * @ordered
	 */
	protected Service authenticationService;

	/**
	 * The cached value of the '{@link #getLoginAttemptService() <em>Login Attempt Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginAttemptService()
	 * @generated
	 * @ordered
	 */
	protected Service loginAttemptService;

	/**
	 * The cached value of the '{@link #getAutoLoginService() <em>Auto Login Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoLoginService()
	 * @generated
	 * @ordered
	 */
	protected Service autoLoginService;

	/**
	 * The default value of the '{@link #isAllowSelfRegistration() <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSelfRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_SELF_REGISTRATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowSelfRegistration() <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSelfRegistration()
	 * @generated
	 * @ordered
	 */
	protected boolean allowSelfRegistration = ALLOW_SELF_REGISTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseEmailActivation() <em>Use Email Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseEmailActivation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_EMAIL_ACTIVATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseEmailActivation() <em>Use Email Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseEmailActivation()
	 * @generated
	 * @ordered
	 */
	protected boolean useEmailActivation = USE_EMAIL_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSendWelcomeEmail() <em>Send Welcome Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendWelcomeEmail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEND_WELCOME_EMAIL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSendWelcomeEmail() <em>Send Welcome Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendWelcomeEmail()
	 * @generated
	 * @ordered
	 */
	protected boolean sendWelcomeEmail = SEND_WELCOME_EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegistrationUnit() <em>Registration Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationUnit()
	 * @generated
	 * @ordered
	 */
	protected RegistrationUnit registrationUnit;

	/**
	 * The cached value of the '{@link #getLoginUnit() <em>Login Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginUnit()
	 * @generated
	 * @ordered
	 */
	protected LoginUnit loginUnit;

	/**
	 * The cached value of the '{@link #getForgottenPasswordUnit() <em>Forgotten Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 * @ordered
	 */
	protected ForgottenPasswordUnit forgottenPasswordUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalAuthenticationSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsfPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getUserService() {
		if (userService != null && userService.eIsProxy()) {
			InternalEObject oldUserService = (InternalEObject)userService;
			userService = (Service)eResolveProxy(oldUserService);
			if (userService != oldUserService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_SERVICE, oldUserService, userService));
			}
		}
		return userService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetUserService() {
		return userService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserService(Service newUserService) {
		Service oldUserService = userService;
		userService = newUserService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_SERVICE, oldUserService, userService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement getUserAuthenticationKey() {
		if (userAuthenticationKey != null && userAuthenticationKey.eIsProxy()) {
			InternalEObject oldUserAuthenticationKey = (InternalEObject)userAuthenticationKey;
			userAuthenticationKey = (ServiceEntityElement)eResolveProxy(oldUserAuthenticationKey);
			if (userAuthenticationKey != oldUserAuthenticationKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_AUTHENTICATION_KEY, oldUserAuthenticationKey, userAuthenticationKey));
			}
		}
		return userAuthenticationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement basicGetUserAuthenticationKey() {
		return userAuthenticationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserAuthenticationKey(ServiceEntityElement newUserAuthenticationKey) {
		ServiceEntityElement oldUserAuthenticationKey = userAuthenticationKey;
		userAuthenticationKey = newUserAuthenticationKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_AUTHENTICATION_KEY, oldUserAuthenticationKey, userAuthenticationKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getAuthenticationService() {
		if (authenticationService != null && authenticationService.eIsProxy()) {
			InternalEObject oldAuthenticationService = (InternalEObject)authenticationService;
			authenticationService = (Service)eResolveProxy(oldAuthenticationService);
			if (authenticationService != oldAuthenticationService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_SERVICE, oldAuthenticationService, authenticationService));
			}
		}
		return authenticationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetAuthenticationService() {
		return authenticationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticationService(Service newAuthenticationService) {
		Service oldAuthenticationService = authenticationService;
		authenticationService = newAuthenticationService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_SERVICE, oldAuthenticationService, authenticationService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getLoginAttemptService() {
		if (loginAttemptService != null && loginAttemptService.eIsProxy()) {
			InternalEObject oldLoginAttemptService = (InternalEObject)loginAttemptService;
			loginAttemptService = (Service)eResolveProxy(oldLoginAttemptService);
			if (loginAttemptService != oldLoginAttemptService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_SERVICE, oldLoginAttemptService, loginAttemptService));
			}
		}
		return loginAttemptService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetLoginAttemptService() {
		return loginAttemptService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginAttemptService(Service newLoginAttemptService) {
		Service oldLoginAttemptService = loginAttemptService;
		loginAttemptService = newLoginAttemptService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_SERVICE, oldLoginAttemptService, loginAttemptService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getAutoLoginService() {
		if (autoLoginService != null && autoLoginService.eIsProxy()) {
			InternalEObject oldAutoLoginService = (InternalEObject)autoLoginService;
			autoLoginService = (Service)eResolveProxy(oldAutoLoginService);
			if (autoLoginService != oldAutoLoginService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN_SERVICE, oldAutoLoginService, autoLoginService));
			}
		}
		return autoLoginService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetAutoLoginService() {
		return autoLoginService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoLoginService(Service newAutoLoginService) {
		Service oldAutoLoginService = autoLoginService;
		autoLoginService = newAutoLoginService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN_SERVICE, oldAutoLoginService, autoLoginService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowSelfRegistration() {
		return allowSelfRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowSelfRegistration(boolean newAllowSelfRegistration) {
		boolean oldAllowSelfRegistration = allowSelfRegistration;
		allowSelfRegistration = newAllowSelfRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION, oldAllowSelfRegistration, allowSelfRegistration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseEmailActivation() {
		return useEmailActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseEmailActivation(boolean newUseEmailActivation) {
		boolean oldUseEmailActivation = useEmailActivation;
		useEmailActivation = newUseEmailActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION, oldUseEmailActivation, useEmailActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSendWelcomeEmail() {
		return sendWelcomeEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendWelcomeEmail(boolean newSendWelcomeEmail) {
		boolean oldSendWelcomeEmail = sendWelcomeEmail;
		sendWelcomeEmail = newSendWelcomeEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL, oldSendWelcomeEmail, sendWelcomeEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationUnit getRegistrationUnit() {
		if (registrationUnit != null && registrationUnit.eIsProxy()) {
			InternalEObject oldRegistrationUnit = (InternalEObject)registrationUnit;
			registrationUnit = (RegistrationUnit)eResolveProxy(oldRegistrationUnit);
			if (registrationUnit != oldRegistrationUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT, oldRegistrationUnit, registrationUnit));
			}
		}
		return registrationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationUnit basicGetRegistrationUnit() {
		return registrationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistrationUnit(RegistrationUnit newRegistrationUnit, NotificationChain msgs) {
		RegistrationUnit oldRegistrationUnit = registrationUnit;
		registrationUnit = newRegistrationUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT, oldRegistrationUnit, newRegistrationUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrationUnit(RegistrationUnit newRegistrationUnit) {
		if (newRegistrationUnit != registrationUnit) {
			NotificationChain msgs = null;
			if (registrationUnit != null)
				msgs = ((InternalEObject)registrationUnit).eInverseRemove(this, JsfPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM, RegistrationUnit.class, msgs);
			if (newRegistrationUnit != null)
				msgs = ((InternalEObject)newRegistrationUnit).eInverseAdd(this, JsfPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM, RegistrationUnit.class, msgs);
			msgs = basicSetRegistrationUnit(newRegistrationUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT, newRegistrationUnit, newRegistrationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginUnit getLoginUnit() {
		if (loginUnit != null && loginUnit.eIsProxy()) {
			InternalEObject oldLoginUnit = (InternalEObject)loginUnit;
			loginUnit = (LoginUnit)eResolveProxy(oldLoginUnit);
			if (loginUnit != oldLoginUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT, oldLoginUnit, loginUnit));
			}
		}
		return loginUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginUnit basicGetLoginUnit() {
		return loginUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoginUnit(LoginUnit newLoginUnit, NotificationChain msgs) {
		LoginUnit oldLoginUnit = loginUnit;
		loginUnit = newLoginUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT, oldLoginUnit, newLoginUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginUnit(LoginUnit newLoginUnit) {
		if (newLoginUnit != loginUnit) {
			NotificationChain msgs = null;
			if (loginUnit != null)
				msgs = ((InternalEObject)loginUnit).eInverseRemove(this, JsfPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM, LoginUnit.class, msgs);
			if (newLoginUnit != null)
				msgs = ((InternalEObject)newLoginUnit).eInverseAdd(this, JsfPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM, LoginUnit.class, msgs);
			msgs = basicSetLoginUnit(newLoginUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT, newLoginUnit, newLoginUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForgottenPasswordUnit getForgottenPasswordUnit() {
		if (forgottenPasswordUnit != null && forgottenPasswordUnit.eIsProxy()) {
			InternalEObject oldForgottenPasswordUnit = (InternalEObject)forgottenPasswordUnit;
			forgottenPasswordUnit = (ForgottenPasswordUnit)eResolveProxy(oldForgottenPasswordUnit);
			if (forgottenPasswordUnit != oldForgottenPasswordUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT, oldForgottenPasswordUnit, forgottenPasswordUnit));
			}
		}
		return forgottenPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForgottenPasswordUnit basicGetForgottenPasswordUnit() {
		return forgottenPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForgottenPasswordUnit(ForgottenPasswordUnit newForgottenPasswordUnit, NotificationChain msgs) {
		ForgottenPasswordUnit oldForgottenPasswordUnit = forgottenPasswordUnit;
		forgottenPasswordUnit = newForgottenPasswordUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT, oldForgottenPasswordUnit, newForgottenPasswordUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForgottenPasswordUnit(ForgottenPasswordUnit newForgottenPasswordUnit) {
		if (newForgottenPasswordUnit != forgottenPasswordUnit) {
			NotificationChain msgs = null;
			if (forgottenPasswordUnit != null)
				msgs = ((InternalEObject)forgottenPasswordUnit).eInverseRemove(this, JsfPackage.FORGOTTEN_PASSWORD_UNIT__AUTHENTICATION_SYSTEM, ForgottenPasswordUnit.class, msgs);
			if (newForgottenPasswordUnit != null)
				msgs = ((InternalEObject)newForgottenPasswordUnit).eInverseAdd(this, JsfPackage.FORGOTTEN_PASSWORD_UNIT__AUTHENTICATION_SYSTEM, ForgottenPasswordUnit.class, msgs);
			msgs = basicSetForgottenPasswordUnit(newForgottenPasswordUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT, newForgottenPasswordUnit, newForgottenPasswordUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				if (registrationUnit != null)
					msgs = ((InternalEObject)registrationUnit).eInverseRemove(this, JsfPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM, RegistrationUnit.class, msgs);
				return basicSetRegistrationUnit((RegistrationUnit)otherEnd, msgs);
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				if (loginUnit != null)
					msgs = ((InternalEObject)loginUnit).eInverseRemove(this, JsfPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM, LoginUnit.class, msgs);
				return basicSetLoginUnit((LoginUnit)otherEnd, msgs);
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				if (forgottenPasswordUnit != null)
					msgs = ((InternalEObject)forgottenPasswordUnit).eInverseRemove(this, JsfPackage.FORGOTTEN_PASSWORD_UNIT__AUTHENTICATION_SYSTEM, ForgottenPasswordUnit.class, msgs);
				return basicSetForgottenPasswordUnit((ForgottenPasswordUnit)otherEnd, msgs);
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
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				return basicSetRegistrationUnit(null, msgs);
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				return basicSetLoginUnit(null, msgs);
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				return basicSetForgottenPasswordUnit(null, msgs);
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
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_SERVICE:
				if (resolve) return getUserService();
				return basicGetUserService();
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_AUTHENTICATION_KEY:
				if (resolve) return getUserAuthenticationKey();
				return basicGetUserAuthenticationKey();
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_SERVICE:
				if (resolve) return getAuthenticationService();
				return basicGetAuthenticationService();
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_SERVICE:
				if (resolve) return getLoginAttemptService();
				return basicGetLoginAttemptService();
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN_SERVICE:
				if (resolve) return getAutoLoginService();
				return basicGetAutoLoginService();
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				return isAllowSelfRegistration();
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				return isUseEmailActivation();
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				return isSendWelcomeEmail();
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				if (resolve) return getRegistrationUnit();
				return basicGetRegistrationUnit();
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				if (resolve) return getLoginUnit();
				return basicGetLoginUnit();
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				if (resolve) return getForgottenPasswordUnit();
				return basicGetForgottenPasswordUnit();
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
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_SERVICE:
				setUserService((Service)newValue);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_AUTHENTICATION_KEY:
				setUserAuthenticationKey((ServiceEntityElement)newValue);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_SERVICE:
				setAuthenticationService((Service)newValue);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_SERVICE:
				setLoginAttemptService((Service)newValue);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN_SERVICE:
				setAutoLoginService((Service)newValue);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				setAllowSelfRegistration((Boolean)newValue);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				setUseEmailActivation((Boolean)newValue);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				setSendWelcomeEmail((Boolean)newValue);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				setRegistrationUnit((RegistrationUnit)newValue);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				setLoginUnit((LoginUnit)newValue);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				setForgottenPasswordUnit((ForgottenPasswordUnit)newValue);
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
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_SERVICE:
				setUserService((Service)null);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_AUTHENTICATION_KEY:
				setUserAuthenticationKey((ServiceEntityElement)null);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_SERVICE:
				setAuthenticationService((Service)null);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_SERVICE:
				setLoginAttemptService((Service)null);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN_SERVICE:
				setAutoLoginService((Service)null);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				setAllowSelfRegistration(ALLOW_SELF_REGISTRATION_EDEFAULT);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				setUseEmailActivation(USE_EMAIL_ACTIVATION_EDEFAULT);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				setSendWelcomeEmail(SEND_WELCOME_EMAIL_EDEFAULT);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				setRegistrationUnit((RegistrationUnit)null);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				setLoginUnit((LoginUnit)null);
				return;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				setForgottenPasswordUnit((ForgottenPasswordUnit)null);
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
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_SERVICE:
				return userService != null;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_AUTHENTICATION_KEY:
				return userAuthenticationKey != null;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_SERVICE:
				return authenticationService != null;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_SERVICE:
				return loginAttemptService != null;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN_SERVICE:
				return autoLoginService != null;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				return allowSelfRegistration != ALLOW_SELF_REGISTRATION_EDEFAULT;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				return useEmailActivation != USE_EMAIL_ACTIVATION_EDEFAULT;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				return sendWelcomeEmail != SEND_WELCOME_EMAIL_EDEFAULT;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				return registrationUnit != null;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				return loginUnit != null;
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				return forgottenPasswordUnit != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (allowSelfRegistration: ");
		result.append(allowSelfRegistration);
		result.append(", useEmailActivation: ");
		result.append(useEmailActivation);
		result.append(", sendWelcomeEmail: ");
		result.append(sendWelcomeEmail);
		result.append(')');
		return result.toString();
	}

} //LocalAuthenticationSystemImpl
