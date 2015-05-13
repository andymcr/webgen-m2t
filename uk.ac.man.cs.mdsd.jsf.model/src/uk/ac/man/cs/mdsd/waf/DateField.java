/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.DateDetails;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DateField#getDetails <em>Details</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DateField#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDateField()
 * @model
 * @generated
 */
public interface DateField extends InterfaceField {

	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.orm.DateDetails}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.orm.DateDetails
	 * @see #setDetails(DateDetails)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDateField_Details()
	 * @model required="true"
	 * @generated
	 */
	DateDetails getDetails();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DateField#getDetails <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.orm.DateDetails
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(DateDetails value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDateField_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DateField#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);
} // DateField
