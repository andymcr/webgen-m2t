/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.FixedCommandMenuEntry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Fixed Command Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenFixedCommandMenuEntry#getJsfMenuEntry <em>Jsf Menu Entry</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenFixedCommandMenuEntry#getGenDestination <em>Gen Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenFixedCommandMenuEntry()
 * @model
 * @generated
 */
public interface GenFixedCommandMenuEntry extends GenMenuEntry {
	/**
	 * Returns the value of the '<em><b>Jsf Menu Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Menu Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Menu Entry</em>' reference.
	 * @see #setJsfMenuEntry(FixedCommandMenuEntry)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenFixedCommandMenuEntry_JsfMenuEntry()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FixedCommandMenuEntry getJsfMenuEntry();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedCommandMenuEntry#getJsfMenuEntry <em>Jsf Menu Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Menu Entry</em>' reference.
	 * @see #getJsfMenuEntry()
	 * @generated
	 */
	void setJsfMenuEntry(FixedCommandMenuEntry value);

	/**
	 * Returns the value of the '<em><b>Gen Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Destination</em>' reference.
	 * @see #setGenDestination(GenCommand)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenFixedCommandMenuEntry_GenDestination()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenCommand getGenDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedCommandMenuEntry#getGenDestination <em>Gen Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Destination</em>' reference.
	 * @see #getGenDestination()
	 * @generated
	 */
	void setGenDestination(GenCommand value);

} // GenFixedCommandMenuEntry
