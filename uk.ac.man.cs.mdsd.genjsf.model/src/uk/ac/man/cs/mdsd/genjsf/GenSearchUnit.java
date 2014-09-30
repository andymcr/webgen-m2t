/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenSearchUnit.java,v 1.6 2014/01/25 17:38:18 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.SearchUnit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Search Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenSearchUnit#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenSearchUnit#getGenResultDestination <em>Gen Result Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenSearchUnit()
 * @model
 * @generated
 */
public interface GenSearchUnit extends GenControlUnit {

	/**
	 * Returns the value of the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Unit</em>' reference.
	 * @see #setJsfUnit(SearchUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenSearchUnit_JsfUnit()
	 * @model required="true"
	 * @generated
	 */
	SearchUnit getJsfUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenSearchUnit#getJsfUnit <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Unit</em>' reference.
	 * @see #getJsfUnit()
	 * @generated
	 */
	void setJsfUnit(SearchUnit value);

	/**
	 * Returns the value of the '<em><b>Gen Result Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenIndexUnit#getGenTargettingSearches <em>Gen Targetting Searches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Result Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Result Destination</em>' reference.
	 * @see #setGenResultDestination(GenIndexUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenSearchUnit_GenResultDestination()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIndexUnit#getGenTargettingSearches
	 * @model opposite="genTargettingSearches" required="true" ordered="false"
	 * @generated
	 */
	GenIndexUnit getGenResultDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenSearchUnit#getGenResultDestination <em>Gen Result Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Result Destination</em>' reference.
	 * @see #getGenResultDestination()
	 * @generated
	 */
	void setGenResultDestination(GenIndexUnit value);
} // GenSearchUnit
