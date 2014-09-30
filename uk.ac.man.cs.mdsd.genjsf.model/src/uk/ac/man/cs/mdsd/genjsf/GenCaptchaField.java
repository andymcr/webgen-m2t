/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.CaptchaField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Captcha Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenCaptchaField#getJsfField <em>Jsf Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenCaptchaField()
 * @model
 * @generated
 */
public interface GenCaptchaField extends GenUnitField {
	/**
	 * Returns the value of the '<em><b>Jsf Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Field</em>' reference.
	 * @see #setJsfField(CaptchaField)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenCaptchaField_JsfField()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CaptchaField getJsfField();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenCaptchaField#getJsfField <em>Jsf Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Field</em>' reference.
	 * @see #getJsfField()
	 * @generated
	 */
	void setJsfField(CaptchaField value);

} // GenCaptchaField
