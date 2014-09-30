/**
 */
package uk.ac.man.cs.mdsd.jsf;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Captcha Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.CaptchaField#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.CaptchaField#getPrivateKey <em>Private Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getCaptchaField()
 * @model
 * @generated
 */
public interface CaptchaField extends NamedDisplayElement, UnitField {
	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Key</em>' attribute.
	 * @see #setPublicKey(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getCaptchaField_PublicKey()
	 * @model ordered="false"
	 * @generated
	 */
	String getPublicKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.CaptchaField#getPublicKey <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Key</em>' attribute.
	 * @see #getPublicKey()
	 * @generated
	 */
	void setPublicKey(String value);

	/**
	 * Returns the value of the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Key</em>' attribute.
	 * @see #setPrivateKey(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getCaptchaField_PrivateKey()
	 * @model ordered="false"
	 * @generated
	 */
	String getPrivateKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.CaptchaField#getPrivateKey <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Key</em>' attribute.
	 * @see #getPrivateKey()
	 * @generated
	 */
	void setPrivateKey(String value);

} // CaptchaField
