/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenDetailsUnit.java,v 1.14 2014/08/05 15:59:18 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.DetailsUnit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Details Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenDetailsUnit#getJsfUnit <em>Jsf Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDetailsUnit()
 * @model
 * @generated
 */
public interface GenDetailsUnit extends GenDataUnit, GenSelectTarget {

	/**
	 * Returns the value of the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Unit</em>' reference.
	 * @see #setJsfUnit(DetailsUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDetailsUnit_JsfUnit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DetailsUnit getJsfUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenDetailsUnit#getJsfUnit <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Unit</em>' reference.
	 * @see #getJsfUnit()
	 * @generated
	 */
	void setJsfUnit(DetailsUnit value);
} // GenDetailsUnit
