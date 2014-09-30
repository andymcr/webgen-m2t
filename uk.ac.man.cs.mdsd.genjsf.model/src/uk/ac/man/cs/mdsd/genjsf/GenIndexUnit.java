/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenIndexUnit.java,v 1.18 2014/01/25 17:38:18 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.common.util.EList;
import uk.ac.man.cs.mdsd.jsf.IndexUnit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Index Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenIndexUnit#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenIndexUnit#getGenTargettingSearches <em>Gen Targetting Searches</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenIndexUnit()
 * @model abstract="true"
 * @generated
 */
public interface GenIndexUnit extends GenDataUnit, GenInlineActionContainer, GenSelectTarget {

	/**
	 * Returns the value of the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Unit</em>' reference.
	 * @see #setJsfUnit(IndexUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenIndexUnit_JsfUnit()
	 * @model required="true"
	 * @generated
	 */
	IndexUnit getJsfUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenIndexUnit#getJsfUnit <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Unit</em>' reference.
	 * @see #getJsfUnit()
	 * @generated
	 */
	void setJsfUnit(IndexUnit value);

	/**
	 * Returns the value of the '<em><b>Gen Targetting Searches</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenSearchUnit}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenSearchUnit#getGenResultDestination <em>Gen Result Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Targetting Searches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Targetting Searches</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenIndexUnit_GenTargettingSearches()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSearchUnit#getGenResultDestination
	 * @model opposite="genResultDestination" ordered="false"
	 * @generated
	 */
	EList<GenSearchUnit> getGenTargettingSearches();
} // GenIndexUnit
