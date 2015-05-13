/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registration Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.RegistrationUnit#getAuthenticationSystem <em>Authentication System</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getRegistrationUnit()
 * @model
 * @generated
 */
public interface RegistrationUnit extends EditUnit, AuthenticationUnit {

	/**
	 * Returns the value of the '<em><b>Authentication System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication System</em>' reference.
	 * @see #setAuthenticationSystem(LocalAuthenticationSystem)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getRegistrationUnit_AuthenticationSystem()
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getRegistrationUnit
	 * @model opposite="registrationUnit" ordered="false"
	 * @generated
	 */
	LocalAuthenticationSystem getAuthenticationSystem();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.RegistrationUnit#getAuthenticationSystem <em>Authentication System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication System</em>' reference.
	 * @see #getAuthenticationSystem()
	 * @generated
	 */
	void setAuthenticationSystem(LocalAuthenticationSystem value);
} // RegistrationUnit
