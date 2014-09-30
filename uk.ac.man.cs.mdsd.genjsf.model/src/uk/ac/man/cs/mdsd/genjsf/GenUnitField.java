/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Unit Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitField#getGenDisplayedOn <em>Gen Displayed On</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitField()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GenUnitField extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Gen Displayed On</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit#getGenDisplayFields <em>Gen Display Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Displayed On</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Displayed On</em>' container reference.
	 * @see #setGenDisplayedOn(GenDynamicUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitField_GenDisplayedOn()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit#getGenDisplayFields
	 * @model opposite="genDisplayFields" required="true" transient="false" ordered="false"
	 * @generated
	 */
	GenDynamicUnit getGenDisplayedOn();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitField#getGenDisplayedOn <em>Gen Displayed On</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Displayed On</em>' container reference.
	 * @see #getGenDisplayedOn()
	 * @generated
	 */
	void setGenDisplayedOn(GenDynamicUnit value);

	/**
	 * @generated NOT
	 */
	String getName();

	/**
	 * @generated NOT
	 */
	void reconcile(final GenUnitField oldGenField);
} // GenUnitField
