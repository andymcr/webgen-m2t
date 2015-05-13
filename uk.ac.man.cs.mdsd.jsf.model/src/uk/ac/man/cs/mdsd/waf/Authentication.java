/**
 * <copyright>
 * </copyright>
 *
 * $Id: Authentication.java,v 1.3 2013/04/12 11:53:04 andy Exp $
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Authentication#getLoginLabel <em>Login Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Authentication#getLogoutLabel <em>Logout Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getAuthentication()
 * @model abstract="true"
 * @generated
 */
public interface Authentication extends EObject {

	/**
	 * Returns the value of the '<em><b>Login Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Label</em>' attribute.
	 * @see #setLoginLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getAuthentication_LoginLabel()
	 * @model default="" required="true" ordered="false"
	 * @generated
	 */
	String getLoginLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Authentication#getLoginLabel <em>Login Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Label</em>' attribute.
	 * @see #getLoginLabel()
	 * @generated
	 */
	void setLoginLabel(String value);

	/**
	 * Returns the value of the '<em><b>Logout Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logout Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logout Label</em>' attribute.
	 * @see #setLogoutLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getAuthentication_LogoutLabel()
	 * @model default="" required="true" ordered="false"
	 * @generated
	 */
	String getLogoutLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Authentication#getLogoutLabel <em>Logout Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logout Label</em>' attribute.
	 * @see #getLogoutLabel()
	 * @generated
	 */
	void setLogoutLabel(String value);
} // Authentication
