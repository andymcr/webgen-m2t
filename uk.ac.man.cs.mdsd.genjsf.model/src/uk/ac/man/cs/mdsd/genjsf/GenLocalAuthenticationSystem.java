/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getJsfAuthentication <em>Jsf Authentication</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenUserService <em>Gen User Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenUserAuthenticationKey <em>Gen User Authentication Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenAuthenticationService <em>Gen Authentication Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenLoginAttemptService <em>Gen Login Attempt Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenAutoLoginService <em>Gen Auto Login Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenRegistrationUnit <em>Gen Registration Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenLoginUnit <em>Gen Login Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenForgottenPasswordUnit <em>Gen Forgotten Password Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getLoginMaximumAttempts <em>Login Maximum Attempts</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getLoginAttemptExpiryPeriod <em>Login Attempt Expiry Period</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getAutologinCookieLifetime <em>Autologin Cookie Lifetime</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLocalAuthenticationSystem()
 * @model
 * @generated
 */
public interface GenLocalAuthenticationSystem extends GenAuthentication {
	/**
	 * Returns the value of the '<em><b>Jsf Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Authentication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Authentication</em>' reference.
	 * @see #setJsfAuthentication(LocalAuthenticationSystem)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLocalAuthenticationSystem_JsfAuthentication()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LocalAuthenticationSystem getJsfAuthentication();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getJsfAuthentication <em>Jsf Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Authentication</em>' reference.
	 * @see #getJsfAuthentication()
	 * @generated
	 */
	void setJsfAuthentication(LocalAuthenticationSystem value);

	/**
	 * Returns the value of the '<em><b>Gen User Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen User Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen User Service</em>' reference.
	 * @see #setGenUserService(GenService)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLocalAuthenticationSystem_GenUserService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenService getGenUserService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenUserService <em>Gen User Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen User Service</em>' reference.
	 * @see #getGenUserService()
	 * @generated
	 */
	void setGenUserService(GenService value);

	/**
	 * Returns the value of the '<em><b>Gen User Authentication Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen User Authentication Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen User Authentication Key</em>' reference.
	 * @see #setGenUserAuthenticationKey(GenServiceEntityElement)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLocalAuthenticationSystem_GenUserAuthenticationKey()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenServiceEntityElement getGenUserAuthenticationKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenUserAuthenticationKey <em>Gen User Authentication Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen User Authentication Key</em>' reference.
	 * @see #getGenUserAuthenticationKey()
	 * @generated
	 */
	void setGenUserAuthenticationKey(GenServiceEntityElement value);

	/**
	 * Returns the value of the '<em><b>Gen Authentication Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Authentication Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Authentication Service</em>' reference.
	 * @see #setGenAuthenticationService(GenService)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLocalAuthenticationSystem_GenAuthenticationService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenService getGenAuthenticationService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenAuthenticationService <em>Gen Authentication Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Authentication Service</em>' reference.
	 * @see #getGenAuthenticationService()
	 * @generated
	 */
	void setGenAuthenticationService(GenService value);

	/**
	 * Returns the value of the '<em><b>Gen Login Attempt Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Login Attempt Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Login Attempt Service</em>' reference.
	 * @see #setGenLoginAttemptService(GenService)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLocalAuthenticationSystem_GenLoginAttemptService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenService getGenLoginAttemptService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenLoginAttemptService <em>Gen Login Attempt Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Login Attempt Service</em>' reference.
	 * @see #getGenLoginAttemptService()
	 * @generated
	 */
	void setGenLoginAttemptService(GenService value);

	/**
	 * Returns the value of the '<em><b>Gen Auto Login Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Auto Login Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Auto Login Service</em>' reference.
	 * @see #setGenAutoLoginService(GenService)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLocalAuthenticationSystem_GenAutoLoginService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenService getGenAutoLoginService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenAutoLoginService <em>Gen Auto Login Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Auto Login Service</em>' reference.
	 * @see #getGenAutoLoginService()
	 * @generated
	 */
	void setGenAutoLoginService(GenService value);

	/**
	 * Returns the value of the '<em><b>Gen Registration Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit#getGenAuthenticationSystem <em>Gen Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Registration Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Registration Unit</em>' reference.
	 * @see #setGenRegistrationUnit(GenRegistrationUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLocalAuthenticationSystem_GenRegistrationUnit()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit#getGenAuthenticationSystem
	 * @model opposite="genAuthenticationSystem" ordered="false"
	 * @generated
	 */
	GenRegistrationUnit getGenRegistrationUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenRegistrationUnit <em>Gen Registration Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Registration Unit</em>' reference.
	 * @see #getGenRegistrationUnit()
	 * @generated
	 */
	void setGenRegistrationUnit(GenRegistrationUnit value);

	/**
	 * Returns the value of the '<em><b>Gen Login Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenAuthenticationSystem <em>Gen Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Login Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Login Unit</em>' reference.
	 * @see #setGenLoginUnit(GenLoginUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLocalAuthenticationSystem_GenLoginUnit()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenAuthenticationSystem
	 * @model opposite="genAuthenticationSystem" required="true" ordered="false"
	 * @generated
	 */
	GenLoginUnit getGenLoginUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenLoginUnit <em>Gen Login Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Login Unit</em>' reference.
	 * @see #getGenLoginUnit()
	 * @generated
	 */
	void setGenLoginUnit(GenLoginUnit value);

	/**
	 * Returns the value of the '<em><b>Gen Forgotten Password Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit#getGenAuthenticationSystem <em>Gen Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Forgotten Password Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Forgotten Password Unit</em>' reference.
	 * @see #setGenForgottenPasswordUnit(GenForgottenPasswordUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLocalAuthenticationSystem_GenForgottenPasswordUnit()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit#getGenAuthenticationSystem
	 * @model opposite="genAuthenticationSystem" ordered="false"
	 * @generated
	 */
	GenForgottenPasswordUnit getGenForgottenPasswordUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenForgottenPasswordUnit <em>Gen Forgotten Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Forgotten Password Unit</em>' reference.
	 * @see #getGenForgottenPasswordUnit()
	 * @generated
	 */
	void setGenForgottenPasswordUnit(GenForgottenPasswordUnit value);

	/**
	 * Returns the value of the '<em><b>Login Maximum Attempts</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Maximum Attempts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Maximum Attempts</em>' attribute.
	 * @see #setLoginMaximumAttempts(int)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLocalAuthenticationSystem_LoginMaximumAttempts()
	 * @model default="5" required="true" ordered="false"
	 * @generated
	 */
	int getLoginMaximumAttempts();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getLoginMaximumAttempts <em>Login Maximum Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Maximum Attempts</em>' attribute.
	 * @see #getLoginMaximumAttempts()
	 * @generated
	 */
	void setLoginMaximumAttempts(int value);

	/**
	 * Returns the value of the '<em><b>Login Attempt Expiry Period</b></em>' attribute.
	 * The default value is <code>"3600"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Attempt Expiry Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Attempt Expiry Period</em>' attribute.
	 * @see #setLoginAttemptExpiryPeriod(int)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLocalAuthenticationSystem_LoginAttemptExpiryPeriod()
	 * @model default="3600" required="true" ordered="false"
	 * @generated
	 */
	int getLoginAttemptExpiryPeriod();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getLoginAttemptExpiryPeriod <em>Login Attempt Expiry Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Attempt Expiry Period</em>' attribute.
	 * @see #getLoginAttemptExpiryPeriod()
	 * @generated
	 */
	void setLoginAttemptExpiryPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Autologin Cookie Lifetime</b></em>' attribute.
	 * The default value is <code>"2678400"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autologin Cookie Lifetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autologin Cookie Lifetime</em>' attribute.
	 * @see #setAutologinCookieLifetime(int)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLocalAuthenticationSystem_AutologinCookieLifetime()
	 * @model default="2678400" required="true" ordered="false"
	 * @generated
	 */
	int getAutologinCookieLifetime();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getAutologinCookieLifetime <em>Autologin Cookie Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autologin Cookie Lifetime</em>' attribute.
	 * @see #getAutologinCookieLifetime()
	 * @generated
	 */
	void setAutologinCookieLifetime(int value);

} // GenLocalAuthenticationSystem
