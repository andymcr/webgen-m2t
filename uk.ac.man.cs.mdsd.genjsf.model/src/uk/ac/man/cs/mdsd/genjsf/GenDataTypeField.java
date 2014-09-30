/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.genorm.GenDataType;

import uk.ac.man.cs.mdsd.jsf.DataTypeField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Data Type Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenDataTypeField#getGenDataType <em>Gen Data Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenDataTypeField#getJsfField <em>Jsf Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDataTypeField()
 * @model
 * @generated
 */
public interface GenDataTypeField extends GenInterfaceField {
	/**
	 * Returns the value of the '<em><b>Gen Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Data Type</em>' reference.
	 * @see #setGenDataType(GenDataType)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDataTypeField_GenDataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenDataType getGenDataType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenDataTypeField#getGenDataType <em>Gen Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Data Type</em>' reference.
	 * @see #getGenDataType()
	 * @generated
	 */
	void setGenDataType(GenDataType value);

	/**
	 * Returns the value of the '<em><b>Jsf Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Field</em>' reference.
	 * @see #setJsfField(DataTypeField)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDataTypeField_JsfField()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataTypeField getJsfField();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenDataTypeField#getJsfField <em>Jsf Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Field</em>' reference.
	 * @see #getJsfField()
	 * @generated
	 */
	void setJsfField(DataTypeField value);

} // GenDataTypeField
