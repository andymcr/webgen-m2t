/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenMenuEntry#getGenPartOf <em>Gen Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenMenuEntry()
 * @model abstract="true"
 * @generated
 */
public interface GenMenuEntry extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Gen Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenMenu#getGenEntries <em>Gen Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Part Of</em>' container reference.
	 * @see #setGenPartOf(GenMenu)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenMenuEntry_GenPartOf()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMenu#getGenEntries
	 * @model opposite="genEntries" required="true" transient="false" ordered="false"
	 * @generated
	 */
	GenMenu getGenPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenMenuEntry#getGenPartOf <em>Gen Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Part Of</em>' container reference.
	 * @see #getGenPartOf()
	 * @generated
	 */
	void setGenPartOf(GenMenu value);

	/**
	 * @generated NOT
	 */
	String getName();

	/**
	 * @generated NOT
	 */
	void reconcile(final GenMenuEntry oldGenEntry);

} // GenMenuEntry
