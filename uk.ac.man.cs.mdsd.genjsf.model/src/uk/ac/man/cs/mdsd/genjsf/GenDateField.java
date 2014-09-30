/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.DateField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Date Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenDateField#getJsfField <em>Jsf Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDateField()
 * @model
 * @generated
 */
public interface GenDateField extends GenInterfaceField {
	/**
	 * Returns the value of the '<em><b>Jsf Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Field</em>' reference.
	 * @see #setJsfField(DateField)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDateField_JsfField()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DateField getJsfField();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenDateField#getJsfField <em>Jsf Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Field</em>' reference.
	 * @see #getJsfField()
	 * @generated
	 */
	void setJsfField(DateField value);

} // GenDateField
