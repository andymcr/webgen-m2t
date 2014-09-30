/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenUpdateUnit.java,v 1.7 2014/01/25 17:38:19 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.UpdateUnit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Update Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUpdateUnit#getJsfUnit <em>Jsf Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUpdateUnit()
 * @model
 * @generated
 */
public interface GenUpdateUnit extends GenEditUnit, GenSelectTarget {

	/**
	 * Returns the value of the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Unit</em>' reference.
	 * @see #setJsfUnit(UpdateUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUpdateUnit_JsfUnit()
	 * @model required="true"
	 * @generated
	 */
	UpdateUnit getJsfUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUpdateUnit#getJsfUnit <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Unit</em>' reference.
	 * @see #getJsfUnit()
	 * @generated
	 */
	void setJsfUnit(UpdateUnit value);
} // GenUpdateUnit
