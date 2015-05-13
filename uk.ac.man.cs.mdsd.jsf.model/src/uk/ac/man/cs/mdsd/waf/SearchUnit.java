/**
 * <copyright>
 * </copyright>
 *
 * $Id: SearchUnit.java,v 1.4 2013/04/15 08:35:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.SearchUnit#getResultsDestination <em>Results Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSearchUnit()
 * @model
 * @generated
 */
public interface SearchUnit extends ControlUnit {
	/**
	 * Returns the value of the '<em><b>Results Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getTargettingSearches <em>Targetting Searches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results Destination</em>' reference.
	 * @see #setResultsDestination(IndexUnit)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSearchUnit_ResultsDestination()
	 * @see uk.ac.man.cs.mdsd.waf.IndexUnit#getTargettingSearches
	 * @model opposite="targettingSearches" required="true" ordered="false"
	 * @generated
	 */
	IndexUnit getResultsDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.SearchUnit#getResultsDestination <em>Results Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results Destination</em>' reference.
	 * @see #getResultsDestination()
	 * @generated
	 */
	void setResultsDestination(IndexUnit value);

} // SearchUnit
