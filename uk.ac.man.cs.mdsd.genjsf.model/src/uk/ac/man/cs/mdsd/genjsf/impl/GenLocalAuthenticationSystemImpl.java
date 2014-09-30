/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit;
import uk.ac.man.cs.mdsd.genjsf.GenAuthentication;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.genjsf.GenLoginUnit;
import uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit;

import uk.ac.man.cs.mdsd.genjsf.GenService;
import uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement;
import uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl#getJsfAuthentication <em>Jsf Authentication</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl#getGenUserService <em>Gen User Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl#getGenUserAuthenticationKey <em>Gen User Authentication Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl#getGenAuthenticationService <em>Gen Authentication Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl#getGenLoginAttemptService <em>Gen Login Attempt Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl#getGenAutoLoginService <em>Gen Auto Login Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl#getGenRegistrationUnit <em>Gen Registration Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl#getGenLoginUnit <em>Gen Login Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl#getGenForgottenPasswordUnit <em>Gen Forgotten Password Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl#getLoginMaximumAttempts <em>Login Maximum Attempts</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl#getLoginAttemptExpiryPeriod <em>Login Attempt Expiry Period</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl#getAutologinCookieLifetime <em>Autologin Cookie Lifetime</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenLocalAuthenticationSystemImpl extends GenAuthenticationImpl implements GenLocalAuthenticationSystem {
	/**
	 * The cached value of the '{@link #getJsfAuthentication() <em>Jsf Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfAuthentication()
	 * @generated
	 * @ordered
	 */
	protected LocalAuthenticationSystem jsfAuthentication;

	/**
	 * The cached value of the '{@link #getGenUserService() <em>Gen User Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenUserService()
	 * @generated
	 * @ordered
	 */
	protected GenService genUserService;

	/**
	 * The cached value of the '{@link #getGenUserAuthenticationKey() <em>Gen User Authentication Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenUserAuthenticationKey()
	 * @generated
	 * @ordered
	 */
	protected GenServiceEntityElement genUserAuthenticationKey;

	/**
	 * The cached value of the '{@link #getGenAuthenticationService() <em>Gen Authentication Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenAuthenticationService()
	 * @generated
	 * @ordered
	 */
	protected GenService genAuthenticationService;

	/**
	 * The cached value of the '{@link #getGenLoginAttemptService() <em>Gen Login Attempt Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenLoginAttemptService()
	 * @generated
	 * @ordered
	 */
	protected GenService genLoginAttemptService;

	/**
	 * The cached value of the '{@link #getGenAutoLoginService() <em>Gen Auto Login Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenAutoLoginService()
	 * @generated
	 * @ordered
	 */
	protected GenService genAutoLoginService;

	/**
	 * The cached value of the '{@link #getGenRegistrationUnit() <em>Gen Registration Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenRegistrationUnit()
	 * @generated
	 * @ordered
	 */
	protected GenRegistrationUnit genRegistrationUnit;

	/**
	 * The cached value of the '{@link #getGenLoginUnit() <em>Gen Login Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenLoginUnit()
	 * @generated
	 * @ordered
	 */
	protected GenLoginUnit genLoginUnit;

	/**
	 * The cached value of the '{@link #getGenForgottenPasswordUnit() <em>Gen Forgotten Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenForgottenPasswordUnit()
	 * @generated
	 * @ordered
	 */
	protected GenForgottenPasswordUnit genForgottenPasswordUnit;

	/**
	 * The default value of the '{@link #getLoginMaximumAttempts() <em>Login Maximum Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginMaximumAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final int LOGIN_MAXIMUM_ATTEMPTS_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getLoginMaximumAttempts() <em>Login Maximum Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginMaximumAttempts()
	 * @generated
	 * @ordered
	 */
	protected int loginMaximumAttempts = LOGIN_MAXIMUM_ATTEMPTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoginAttemptExpiryPeriod() <em>Login Attempt Expiry Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginAttemptExpiryPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int LOGIN_ATTEMPT_EXPIRY_PERIOD_EDEFAULT = 3600;

	/**
	 * The cached value of the '{@link #getLoginAttemptExpiryPeriod() <em>Login Attempt Expiry Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginAttemptExpiryPeriod()
	 * @generated
	 * @ordered
	 */
	protected int loginAttemptExpiryPeriod = LOGIN_ATTEMPT_EXPIRY_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutologinCookieLifetime() <em>Autologin Cookie Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutologinCookieLifetime()
	 * @generated
	 * @ordered
	 */
	protected static final int AUTOLOGIN_COOKIE_LIFETIME_EDEFAULT = 2678400;

	/**
	 * The cached value of the '{@link #getAutologinCookieLifetime() <em>Autologin Cookie Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutologinCookieLifetime()
	 * @generated
	 * @ordered
	 */
	protected int autologinCookieLifetime = AUTOLOGIN_COOKIE_LIFETIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenLocalAuthenticationSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_LOCAL_AUTHENTICATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystem getJsfAuthentication() {
		if (jsfAuthentication != null && jsfAuthentication.eIsProxy()) {
			InternalEObject oldJsfAuthentication = (InternalEObject)jsfAuthentication;
			jsfAuthentication = (LocalAuthenticationSystem)eResolveProxy(oldJsfAuthentication);
			if (jsfAuthentication != oldJsfAuthentication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__JSF_AUTHENTICATION, oldJsfAuthentication, jsfAuthentication));
			}
		}
		return jsfAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystem basicGetJsfAuthentication() {
		return jsfAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfAuthentication(LocalAuthenticationSystem newJsfAuthentication) {
		LocalAuthenticationSystem oldJsfAuthentication = jsfAuthentication;
		jsfAuthentication = newJsfAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__JSF_AUTHENTICATION, oldJsfAuthentication, jsfAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService getGenUserService() {
		if (genUserService != null && genUserService.eIsProxy()) {
			InternalEObject oldGenUserService = (InternalEObject)genUserService;
			genUserService = (GenService)eResolveProxy(oldGenUserService);
			if (genUserService != oldGenUserService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_SERVICE, oldGenUserService, genUserService));
			}
		}
		return genUserService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService basicGetGenUserService() {
		return genUserService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenUserService(GenService newGenUserService) {
		GenService oldGenUserService = genUserService;
		genUserService = newGenUserService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_SERVICE, oldGenUserService, genUserService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityElement getGenUserAuthenticationKey() {
		if (genUserAuthenticationKey != null && genUserAuthenticationKey.eIsProxy()) {
			InternalEObject oldGenUserAuthenticationKey = (InternalEObject)genUserAuthenticationKey;
			genUserAuthenticationKey = (GenServiceEntityElement)eResolveProxy(oldGenUserAuthenticationKey);
			if (genUserAuthenticationKey != oldGenUserAuthenticationKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_AUTHENTICATION_KEY, oldGenUserAuthenticationKey, genUserAuthenticationKey));
			}
		}
		return genUserAuthenticationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityElement basicGetGenUserAuthenticationKey() {
		return genUserAuthenticationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenUserAuthenticationKey(GenServiceEntityElement newGenUserAuthenticationKey) {
		GenServiceEntityElement oldGenUserAuthenticationKey = genUserAuthenticationKey;
		genUserAuthenticationKey = newGenUserAuthenticationKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_AUTHENTICATION_KEY, oldGenUserAuthenticationKey, genUserAuthenticationKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService getGenAuthenticationService() {
		if (genAuthenticationService != null && genAuthenticationService.eIsProxy()) {
			InternalEObject oldGenAuthenticationService = (InternalEObject)genAuthenticationService;
			genAuthenticationService = (GenService)eResolveProxy(oldGenAuthenticationService);
			if (genAuthenticationService != oldGenAuthenticationService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTHENTICATION_SERVICE, oldGenAuthenticationService, genAuthenticationService));
			}
		}
		return genAuthenticationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService basicGetGenAuthenticationService() {
		return genAuthenticationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenAuthenticationService(GenService newGenAuthenticationService) {
		GenService oldGenAuthenticationService = genAuthenticationService;
		genAuthenticationService = newGenAuthenticationService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTHENTICATION_SERVICE, oldGenAuthenticationService, genAuthenticationService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService getGenLoginAttemptService() {
		if (genLoginAttemptService != null && genLoginAttemptService.eIsProxy()) {
			InternalEObject oldGenLoginAttemptService = (InternalEObject)genLoginAttemptService;
			genLoginAttemptService = (GenService)eResolveProxy(oldGenLoginAttemptService);
			if (genLoginAttemptService != oldGenLoginAttemptService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_ATTEMPT_SERVICE, oldGenLoginAttemptService, genLoginAttemptService));
			}
		}
		return genLoginAttemptService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService basicGetGenLoginAttemptService() {
		return genLoginAttemptService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenLoginAttemptService(GenService newGenLoginAttemptService) {
		GenService oldGenLoginAttemptService = genLoginAttemptService;
		genLoginAttemptService = newGenLoginAttemptService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_ATTEMPT_SERVICE, oldGenLoginAttemptService, genLoginAttemptService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService getGenAutoLoginService() {
		if (genAutoLoginService != null && genAutoLoginService.eIsProxy()) {
			InternalEObject oldGenAutoLoginService = (InternalEObject)genAutoLoginService;
			genAutoLoginService = (GenService)eResolveProxy(oldGenAutoLoginService);
			if (genAutoLoginService != oldGenAutoLoginService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTO_LOGIN_SERVICE, oldGenAutoLoginService, genAutoLoginService));
			}
		}
		return genAutoLoginService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService basicGetGenAutoLoginService() {
		return genAutoLoginService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenAutoLoginService(GenService newGenAutoLoginService) {
		GenService oldGenAutoLoginService = genAutoLoginService;
		genAutoLoginService = newGenAutoLoginService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTO_LOGIN_SERVICE, oldGenAutoLoginService, genAutoLoginService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenRegistrationUnit getGenRegistrationUnit() {
		if (genRegistrationUnit != null && genRegistrationUnit.eIsProxy()) {
			InternalEObject oldGenRegistrationUnit = (InternalEObject)genRegistrationUnit;
			genRegistrationUnit = (GenRegistrationUnit)eResolveProxy(oldGenRegistrationUnit);
			if (genRegistrationUnit != oldGenRegistrationUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT, oldGenRegistrationUnit, genRegistrationUnit));
			}
		}
		return genRegistrationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenRegistrationUnit basicGetGenRegistrationUnit() {
		return genRegistrationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenRegistrationUnit(GenRegistrationUnit newGenRegistrationUnit, NotificationChain msgs) {
		GenRegistrationUnit oldGenRegistrationUnit = genRegistrationUnit;
		genRegistrationUnit = newGenRegistrationUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT, oldGenRegistrationUnit, newGenRegistrationUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenRegistrationUnit(GenRegistrationUnit newGenRegistrationUnit) {
		if (newGenRegistrationUnit != genRegistrationUnit) {
			NotificationChain msgs = null;
			if (genRegistrationUnit != null)
				msgs = ((InternalEObject)genRegistrationUnit).eInverseRemove(this, GenJsfPackage.GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM, GenRegistrationUnit.class, msgs);
			if (newGenRegistrationUnit != null)
				msgs = ((InternalEObject)newGenRegistrationUnit).eInverseAdd(this, GenJsfPackage.GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM, GenRegistrationUnit.class, msgs);
			msgs = basicSetGenRegistrationUnit(newGenRegistrationUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT, newGenRegistrationUnit, newGenRegistrationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLoginUnit getGenLoginUnit() {
		if (genLoginUnit != null && genLoginUnit.eIsProxy()) {
			InternalEObject oldGenLoginUnit = (InternalEObject)genLoginUnit;
			genLoginUnit = (GenLoginUnit)eResolveProxy(oldGenLoginUnit);
			if (genLoginUnit != oldGenLoginUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT, oldGenLoginUnit, genLoginUnit));
			}
		}
		return genLoginUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLoginUnit basicGetGenLoginUnit() {
		return genLoginUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenLoginUnit(GenLoginUnit newGenLoginUnit, NotificationChain msgs) {
		GenLoginUnit oldGenLoginUnit = genLoginUnit;
		genLoginUnit = newGenLoginUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT, oldGenLoginUnit, newGenLoginUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenLoginUnit(GenLoginUnit newGenLoginUnit) {
		if (newGenLoginUnit != genLoginUnit) {
			NotificationChain msgs = null;
			if (genLoginUnit != null)
				msgs = ((InternalEObject)genLoginUnit).eInverseRemove(this, GenJsfPackage.GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM, GenLoginUnit.class, msgs);
			if (newGenLoginUnit != null)
				msgs = ((InternalEObject)newGenLoginUnit).eInverseAdd(this, GenJsfPackage.GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM, GenLoginUnit.class, msgs);
			msgs = basicSetGenLoginUnit(newGenLoginUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT, newGenLoginUnit, newGenLoginUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenForgottenPasswordUnit getGenForgottenPasswordUnit() {
		if (genForgottenPasswordUnit != null && genForgottenPasswordUnit.eIsProxy()) {
			InternalEObject oldGenForgottenPasswordUnit = (InternalEObject)genForgottenPasswordUnit;
			genForgottenPasswordUnit = (GenForgottenPasswordUnit)eResolveProxy(oldGenForgottenPasswordUnit);
			if (genForgottenPasswordUnit != oldGenForgottenPasswordUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT, oldGenForgottenPasswordUnit, genForgottenPasswordUnit));
			}
		}
		return genForgottenPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenForgottenPasswordUnit basicGetGenForgottenPasswordUnit() {
		return genForgottenPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenForgottenPasswordUnit(GenForgottenPasswordUnit newGenForgottenPasswordUnit, NotificationChain msgs) {
		GenForgottenPasswordUnit oldGenForgottenPasswordUnit = genForgottenPasswordUnit;
		genForgottenPasswordUnit = newGenForgottenPasswordUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT, oldGenForgottenPasswordUnit, newGenForgottenPasswordUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenForgottenPasswordUnit(GenForgottenPasswordUnit newGenForgottenPasswordUnit) {
		if (newGenForgottenPasswordUnit != genForgottenPasswordUnit) {
			NotificationChain msgs = null;
			if (genForgottenPasswordUnit != null)
				msgs = ((InternalEObject)genForgottenPasswordUnit).eInverseRemove(this, GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM, GenForgottenPasswordUnit.class, msgs);
			if (newGenForgottenPasswordUnit != null)
				msgs = ((InternalEObject)newGenForgottenPasswordUnit).eInverseAdd(this, GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM, GenForgottenPasswordUnit.class, msgs);
			msgs = basicSetGenForgottenPasswordUnit(newGenForgottenPasswordUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT, newGenForgottenPasswordUnit, newGenForgottenPasswordUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLoginMaximumAttempts() {
		return loginMaximumAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginMaximumAttempts(int newLoginMaximumAttempts) {
		int oldLoginMaximumAttempts = loginMaximumAttempts;
		loginMaximumAttempts = newLoginMaximumAttempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_MAXIMUM_ATTEMPTS, oldLoginMaximumAttempts, loginMaximumAttempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLoginAttemptExpiryPeriod() {
		return loginAttemptExpiryPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginAttemptExpiryPeriod(int newLoginAttemptExpiryPeriod) {
		int oldLoginAttemptExpiryPeriod = loginAttemptExpiryPeriod;
		loginAttemptExpiryPeriod = newLoginAttemptExpiryPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_EXPIRY_PERIOD, oldLoginAttemptExpiryPeriod, loginAttemptExpiryPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAutologinCookieLifetime() {
		return autologinCookieLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutologinCookieLifetime(int newAutologinCookieLifetime) {
		int oldAutologinCookieLifetime = autologinCookieLifetime;
		autologinCookieLifetime = newAutologinCookieLifetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__AUTOLOGIN_COOKIE_LIFETIME, oldAutologinCookieLifetime, autologinCookieLifetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT:
				if (genRegistrationUnit != null)
					msgs = ((InternalEObject)genRegistrationUnit).eInverseRemove(this, GenJsfPackage.GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM, GenRegistrationUnit.class, msgs);
				return basicSetGenRegistrationUnit((GenRegistrationUnit)otherEnd, msgs);
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT:
				if (genLoginUnit != null)
					msgs = ((InternalEObject)genLoginUnit).eInverseRemove(this, GenJsfPackage.GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM, GenLoginUnit.class, msgs);
				return basicSetGenLoginUnit((GenLoginUnit)otherEnd, msgs);
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT:
				if (genForgottenPasswordUnit != null)
					msgs = ((InternalEObject)genForgottenPasswordUnit).eInverseRemove(this, GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM, GenForgottenPasswordUnit.class, msgs);
				return basicSetGenForgottenPasswordUnit((GenForgottenPasswordUnit)otherEnd, msgs);
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
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT:
				return basicSetGenRegistrationUnit(null, msgs);
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT:
				return basicSetGenLoginUnit(null, msgs);
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT:
				return basicSetGenForgottenPasswordUnit(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	public void reconcile(GenAuthentication oldGenAuthentication) {
		super.reconcile(oldGenAuthentication);
	}

	protected void reconcileSettings(GenAuthentication oldGenAuthentication) {
		super.reconcileSettings(oldGenAuthentication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__JSF_AUTHENTICATION:
				if (resolve) return getJsfAuthentication();
				return basicGetJsfAuthentication();
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_SERVICE:
				if (resolve) return getGenUserService();
				return basicGetGenUserService();
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_AUTHENTICATION_KEY:
				if (resolve) return getGenUserAuthenticationKey();
				return basicGetGenUserAuthenticationKey();
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTHENTICATION_SERVICE:
				if (resolve) return getGenAuthenticationService();
				return basicGetGenAuthenticationService();
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_ATTEMPT_SERVICE:
				if (resolve) return getGenLoginAttemptService();
				return basicGetGenLoginAttemptService();
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTO_LOGIN_SERVICE:
				if (resolve) return getGenAutoLoginService();
				return basicGetGenAutoLoginService();
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT:
				if (resolve) return getGenRegistrationUnit();
				return basicGetGenRegistrationUnit();
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT:
				if (resolve) return getGenLoginUnit();
				return basicGetGenLoginUnit();
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT:
				if (resolve) return getGenForgottenPasswordUnit();
				return basicGetGenForgottenPasswordUnit();
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_MAXIMUM_ATTEMPTS:
				return getLoginMaximumAttempts();
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_EXPIRY_PERIOD:
				return getLoginAttemptExpiryPeriod();
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__AUTOLOGIN_COOKIE_LIFETIME:
				return getAutologinCookieLifetime();
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
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__JSF_AUTHENTICATION:
				setJsfAuthentication((LocalAuthenticationSystem)newValue);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_SERVICE:
				setGenUserService((GenService)newValue);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_AUTHENTICATION_KEY:
				setGenUserAuthenticationKey((GenServiceEntityElement)newValue);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTHENTICATION_SERVICE:
				setGenAuthenticationService((GenService)newValue);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_ATTEMPT_SERVICE:
				setGenLoginAttemptService((GenService)newValue);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTO_LOGIN_SERVICE:
				setGenAutoLoginService((GenService)newValue);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT:
				setGenRegistrationUnit((GenRegistrationUnit)newValue);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT:
				setGenLoginUnit((GenLoginUnit)newValue);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT:
				setGenForgottenPasswordUnit((GenForgottenPasswordUnit)newValue);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_MAXIMUM_ATTEMPTS:
				setLoginMaximumAttempts((Integer)newValue);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_EXPIRY_PERIOD:
				setLoginAttemptExpiryPeriod((Integer)newValue);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__AUTOLOGIN_COOKIE_LIFETIME:
				setAutologinCookieLifetime((Integer)newValue);
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
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__JSF_AUTHENTICATION:
				setJsfAuthentication((LocalAuthenticationSystem)null);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_SERVICE:
				setGenUserService((GenService)null);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_AUTHENTICATION_KEY:
				setGenUserAuthenticationKey((GenServiceEntityElement)null);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTHENTICATION_SERVICE:
				setGenAuthenticationService((GenService)null);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_ATTEMPT_SERVICE:
				setGenLoginAttemptService((GenService)null);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTO_LOGIN_SERVICE:
				setGenAutoLoginService((GenService)null);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT:
				setGenRegistrationUnit((GenRegistrationUnit)null);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT:
				setGenLoginUnit((GenLoginUnit)null);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT:
				setGenForgottenPasswordUnit((GenForgottenPasswordUnit)null);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_MAXIMUM_ATTEMPTS:
				setLoginMaximumAttempts(LOGIN_MAXIMUM_ATTEMPTS_EDEFAULT);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_EXPIRY_PERIOD:
				setLoginAttemptExpiryPeriod(LOGIN_ATTEMPT_EXPIRY_PERIOD_EDEFAULT);
				return;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__AUTOLOGIN_COOKIE_LIFETIME:
				setAutologinCookieLifetime(AUTOLOGIN_COOKIE_LIFETIME_EDEFAULT);
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
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__JSF_AUTHENTICATION:
				return jsfAuthentication != null;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_SERVICE:
				return genUserService != null;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_AUTHENTICATION_KEY:
				return genUserAuthenticationKey != null;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTHENTICATION_SERVICE:
				return genAuthenticationService != null;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_ATTEMPT_SERVICE:
				return genLoginAttemptService != null;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTO_LOGIN_SERVICE:
				return genAutoLoginService != null;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT:
				return genRegistrationUnit != null;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT:
				return genLoginUnit != null;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT:
				return genForgottenPasswordUnit != null;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_MAXIMUM_ATTEMPTS:
				return loginMaximumAttempts != LOGIN_MAXIMUM_ATTEMPTS_EDEFAULT;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_EXPIRY_PERIOD:
				return loginAttemptExpiryPeriod != LOGIN_ATTEMPT_EXPIRY_PERIOD_EDEFAULT;
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__AUTOLOGIN_COOKIE_LIFETIME:
				return autologinCookieLifetime != AUTOLOGIN_COOKIE_LIFETIME_EDEFAULT;
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
		result.append(" (loginMaximumAttempts: ");
		result.append(loginMaximumAttempts);
		result.append(", loginAttemptExpiryPeriod: ");
		result.append(loginAttemptExpiryPeriod);
		result.append(", autologinCookieLifetime: ");
		result.append(autologinCookieLifetime);
		result.append(')');
		return result.toString();
	}

} //GenLocalAuthenticationSystemImpl
