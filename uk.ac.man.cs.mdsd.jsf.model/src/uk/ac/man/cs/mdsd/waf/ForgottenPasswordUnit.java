/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forgotten Password Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit#getAuthenticationSystem <em>Authentication System</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit#getLoginIdField <em>Login Id Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getForgottenPasswordUnit()
 * @model
 * @generated
 */
public interface ForgottenPasswordUnit extends ControlUnit, AuthenticationUnit {

	/**
	 * Returns the value of the '<em><b>Authentication System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication System</em>' reference.
	 * @see #setAuthenticationSystem(LocalAuthenticationSystem)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getForgottenPasswordUnit_AuthenticationSystem()
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getForgottenPasswordUnit
	 * @model opposite="forgottenPasswordUnit" ordered="false"
	 * @generated
	 */
	LocalAuthenticationSystem getAuthenticationSystem();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit#getAuthenticationSystem <em>Authentication System</em>}' reference.
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getForgottenPasswordUnit_LoginIdField()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UnitField getLoginIdField();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit#getLoginIdField <em>Login Id Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Id Field</em>' reference.
	 * @see #getLoginIdField()
	 * @generated
	 */
	void setLoginIdField(UnitField value);
} // ForgottenPasswordUnit
