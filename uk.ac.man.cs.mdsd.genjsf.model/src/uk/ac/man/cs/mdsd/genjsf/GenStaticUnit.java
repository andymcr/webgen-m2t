/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.StaticUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Static Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenStaticUnit#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenStaticUnit#getGenService <em>Gen Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenStaticUnit()
 * @model
 * @generated
 */
public interface GenStaticUnit extends GenContentUnit {
	/**
	 * Returns the value of the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Unit</em>' reference.
	 * @see #setJsfUnit(StaticUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenStaticUnit_JsfUnit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StaticUnit getJsfUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenStaticUnit#getJsfUnit <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Unit</em>' reference.
	 * @see #getJsfUnit()
	 * @generated
	 */
	void setJsfUnit(StaticUnit value);

	/**
	 * Returns the value of the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Service</em>' reference.
	 * @see #setGenService(GenService)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenStaticUnit_GenService()
	 * @model
	 * @generated
	 */
	GenService getGenService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenStaticUnit#getGenService <em>Gen Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Service</em>' reference.
	 * @see #getGenService()
	 * @generated
	 */
	void setGenService(GenService value);

} // GenStaticUnit
