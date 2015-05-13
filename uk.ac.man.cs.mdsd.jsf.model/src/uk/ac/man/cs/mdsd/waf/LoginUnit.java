/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Login Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getAuthenticationSystem <em>Authentication System</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getLoginIdField <em>Login Id Field</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getPasswordField <em>Password Field</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getRememberMeField <em>Remember Me Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLoginUnit()
 * @model
 * @generated
 */
public interface LoginUnit extends ControlUnit, AuthenticationUnit {

	/**
	 * Returns the value of the '<em><b>Authentication System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication System</em>' reference.
	 * @see #setAuthenticationSystem(LocalAuthenticationSystem)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLoginUnit_AuthenticationSystem()
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getLoginUnit
	 * @model opposite="loginUnit" ordered="false"
	 * @generated
	 */
	LocalAuthenticationSystem getAuthenticationSystem();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getAuthenticationSystem <em>Authentication System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication System</em>' reference.
	 * @see #getAuthenticationSystem()
	 * @generated
	 */
	void setAuthenticationSystem(LocalAuthenticationSystem value);

	/**
	 * Returns the value of the '<em><b>Login Id Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Id Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Id Field</em>' reference.
	 * @see #setLoginIdField(UnitField)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLoginUnit_LoginIdField()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UnitField getLoginIdField();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getLoginIdField <em>Login Id Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Id Field</em>' reference.
	 * @see #getLoginIdField()
	 * @generated
	 */
	void setLoginIdField(UnitField value);

	/**
	 * Returns the value of the '<em><b>Password Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Field</em>' reference.
	 * @see #setPasswordField(UnitField)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLoginUnit_PasswordField()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UnitField getPasswordField();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getPasswordField <em>Password Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Field</em>' reference.
	 * @see #getPasswordField()
	 * @generated
	 */
	void setPasswordField(UnitField value);

	/**
	 * Returns the value of the '<em><b>Remember Me Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remember Me Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remember Me Field</em>' reference.
	 * @see #setRememberMeField(UnitField)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLoginUnit_RememberMeField()
	 * @model ordered="false"
	 * @generated
	 */
	UnitField getRememberMeField();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getRememberMeField <em>Remember Me Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remember Me Field</em>' reference.
	 * @see #getRememberMeField()
	 * @generated
	 */
	void setRememberMeField(UnitField value);
} // LoginUnit
