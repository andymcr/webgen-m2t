/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.RegistrationUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Registration Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit#getGenAuthenticationSystem <em>Gen Authentication System</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenRegistrationUnit()
 * @model
 * @generated
 */
public interface GenRegistrationUnit extends GenEditUnit, GenAuthenticationUnit {
	/**
	 * Returns the value of the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Unit</em>' reference.
	 * @see #setJsfUnit(RegistrationUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenRegistrationUnit_JsfUnit()
	 * @model required="true"
	 * @generated
	 */
	RegistrationUnit getJsfUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit#getJsfUnit <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Unit</em>' reference.
	 * @see #getJsfUnit()
	 * @generated
	 */
	void setJsfUnit(RegistrationUnit value);

	/**
	 * Returns the value of the '<em><b>Gen Authentication System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenRegistrationUnit <em>Gen Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Authentication System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Authentication System</em>' reference.
	 * @see #setGenAuthenticationSystem(GenLocalAuthenticationSystem)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenRegistrationUnit_GenAuthenticationSystem()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenRegistrationUnit
	 * @model opposite="genRegistrationUnit" ordered="false"
	 * @generated
	 */
	GenLocalAuthenticationSystem getGenAuthenticationSystem();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit#getGenAuthenticationSystem <em>Gen Authentication System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Authentication System</em>' reference.
	 * @see #getGenAuthenticationSystem()
	 * @generated
	 */
	void setGenAuthenticationSystem(GenLocalAuthenticationSystem value);

} // GenRegistrationUnit
