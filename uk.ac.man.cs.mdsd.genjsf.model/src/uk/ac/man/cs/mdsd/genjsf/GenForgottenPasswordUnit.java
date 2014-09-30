/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.ForgottenPasswordUnit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Forgotten Password Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit#getGenAuthenticationSystem <em>Gen Authentication System</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit#getGenLoginIdField <em>Gen Login Id Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenForgottenPasswordUnit()
 * @model
 * @generated
 */
public interface GenForgottenPasswordUnit extends GenControlUnit, GenAuthenticationUnit {

	/**
	 * Returns the value of the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Unit</em>' reference.
	 * @see #setJsfUnit(ForgottenPasswordUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenForgottenPasswordUnit_JsfUnit()
	 * @model required="true"
	 * @generated
	 */
	ForgottenPasswordUnit getJsfUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit#getJsfUnit <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Unit</em>' reference.
	 * @see #getJsfUnit()
	 * @generated
	 */
	void setJsfUnit(ForgottenPasswordUnit value);

	/**
	 * Returns the value of the '<em><b>Gen Authentication System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenForgottenPasswordUnit <em>Gen Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Authentication System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Authentication System</em>' reference.
	 * @see #setGenAuthenticationSystem(GenLocalAuthenticationSystem)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenForgottenPasswordUnit_GenAuthenticationSystem()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenForgottenPasswordUnit
	 * @model opposite="genForgottenPasswordUnit" ordered="false"
	 * @generated
	 */
	GenLocalAuthenticationSystem getGenAuthenticationSystem();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit#getGenAuthenticationSystem <em>Gen Authentication System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Authentication System</em>' reference.
	 * @see #getGenAuthenticationSystem()
	 * @generated
	 */
	void setGenAuthenticationSystem(GenLocalAuthenticationSystem value);

	/**
	 * Returns the value of the '<em><b>Gen Login Id Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Login Id Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Login Id Field</em>' reference.
	 * @see #setGenLoginIdField(GenUnitField)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenForgottenPasswordUnit_GenLoginIdField()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenUnitField getGenLoginIdField();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit#getGenLoginIdField <em>Gen Login Id Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Login Id Field</em>' reference.
	 * @see #getGenLoginIdField()
	 * @generated
	 */
	void setGenLoginIdField(GenUnitField value);
} // GenForgottenPasswordUnit
