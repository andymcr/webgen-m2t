/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.CasAuthentication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Cas Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenCasAuthentication#getJsfAuthentication <em>Jsf Authentication</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenCasAuthentication()
 * @model
 * @generated
 */
public interface GenCasAuthentication extends GenAuthentication {
	/**
	 * Returns the value of the '<em><b>Jsf Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Authentication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Authentication</em>' reference.
	 * @see #setJsfAuthentication(CasAuthentication)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenCasAuthentication_JsfAuthentication()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CasAuthentication getJsfAuthentication();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenCasAuthentication#getJsfAuthentication <em>Jsf Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Authentication</em>' reference.
	 * @see #getJsfAuthentication()
	 * @generated
	 */
	void setJsfAuthentication(CasAuthentication value);

} // GenCasAuthentication
