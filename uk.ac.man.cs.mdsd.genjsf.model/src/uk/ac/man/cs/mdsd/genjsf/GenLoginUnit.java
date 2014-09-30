/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.LoginUnit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Login Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenAuthenticationSystem <em>Gen Authentication System</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenLoginIdField <em>Gen Login Id Field</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenPasswordField <em>Gen Password Field</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenRememberMeField <em>Gen Remember Me Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLoginUnit()
 * @model
 * @generated
 */
public interface GenLoginUnit extends GenControlUnit, GenAuthenticationUnit {

	/**
	 * Returns the value of the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Unit</em>' reference.
	 * @see #setJsfUnit(LoginUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLoginUnit_JsfUnit()
	 * @model required="true"
	 * @generated
	 */
	LoginUnit getJsfUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getJsfUnit <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Unit</em>' reference.
	 * @see #getJsfUnit()
	 * @generated
	 */
	void setJsfUnit(LoginUnit value);

	/**
	 * Returns the value of the '<em><b>Gen Authentication System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenLoginUnit <em>Gen Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Authentication System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Authentication System</em>' reference.
	 * @see #setGenAuthenticationSystem(GenLocalAuthenticationSystem)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLoginUnit_GenAuthenticationSystem()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenLoginUnit
	 * @model opposite="genLoginUnit" ordered="false"
	 * @generated
	 */
	GenLocalAuthenticationSystem getGenAuthenticationSystem();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenAuthenticationSystem <em>Gen Authentication System</em>}' reference.
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
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLoginUnit_GenLoginIdField()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenUnitField getGenLoginIdField();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenLoginIdField <em>Gen Login Id Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Login Id Field</em>' reference.
	 * @see #getGenLoginIdField()
	 * @generated
	 */
	void setGenLoginIdField(GenUnitField value);

	/**
	 * Returns the value of the '<em><b>Gen Password Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Password Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Password Field</em>' reference.
	 * @see #setGenPasswordField(GenUnitField)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLoginUnit_GenPasswordField()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenUnitField getGenPasswordField();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenPasswordField <em>Gen Password Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Password Field</em>' reference.
	 * @see #getGenPasswordField()
	 * @generated
	 */
	void setGenPasswordField(GenUnitField value);

	/**
	 * Returns the value of the '<em><b>Gen Remember Me Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Remember Me Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Remember Me Field</em>' reference.
	 * @see #setGenRememberMeField(GenUnitField)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenLoginUnit_GenRememberMeField()
	 * @model ordered="false"
	 * @generated
	 */
	GenUnitField getGenRememberMeField();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenRememberMeField <em>Gen Remember Me Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Remember Me Field</em>' reference.
	 * @see #getGenRememberMeField()
	 * @generated
	 */
	void setGenRememberMeField(GenUnitField value);
} // GenLoginUnit
