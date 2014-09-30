/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.CreateUpdateUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Create Update Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenCreateUpdateUnit#getJsfUnit <em>Jsf Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenCreateUpdateUnit()
 * @model
 * @generated
 */
public interface GenCreateUpdateUnit extends GenEditUnit, GenSelectTarget {
	/**
	 * Returns the value of the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Unit</em>' reference.
	 * @see #setJsfUnit(CreateUpdateUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenCreateUpdateUnit_JsfUnit()
	 * @model required="true"
	 * @generated
	 */
	CreateUpdateUnit getJsfUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenCreateUpdateUnit#getJsfUnit <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Unit</em>' reference.
	 * @see #getJsfUnit()
	 * @generated
	 */
	void setJsfUnit(CreateUpdateUnit value);

} // GenCreateUpdateUnit
