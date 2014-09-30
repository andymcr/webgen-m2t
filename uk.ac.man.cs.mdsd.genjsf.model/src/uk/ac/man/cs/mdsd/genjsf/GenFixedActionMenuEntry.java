/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.FixedActionMenuEntry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Fixed Action Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenFixedActionMenuEntry#getJsfMenuEntry <em>Jsf Menu Entry</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenFixedActionMenuEntry#getGenDestination <em>Gen Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenFixedActionMenuEntry()
 * @model
 * @generated
 */
public interface GenFixedActionMenuEntry extends GenMenuEntry {
	/**
	 * Returns the value of the '<em><b>Jsf Menu Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Menu Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Menu Entry</em>' reference.
	 * @see #setJsfMenuEntry(FixedActionMenuEntry)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenFixedActionMenuEntry_JsfMenuEntry()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FixedActionMenuEntry getJsfMenuEntry();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedActionMenuEntry#getJsfMenuEntry <em>Jsf Menu Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Menu Entry</em>' reference.
	 * @see #getJsfMenuEntry()
	 * @generated
	 */
	void setJsfMenuEntry(FixedActionMenuEntry value);

	/**
	 * Returns the value of the '<em><b>Gen Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Destination</em>' reference.
	 * @see #setGenDestination(GenDynamicUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenFixedActionMenuEntry_GenDestination()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenDynamicUnit getGenDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedActionMenuEntry#getGenDestination <em>Gen Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Destination</em>' reference.
	 * @see #getGenDestination()
	 * @generated
	 */
	void setGenDestination(GenDynamicUnit value);

} // GenFixedActionMenuEntry
