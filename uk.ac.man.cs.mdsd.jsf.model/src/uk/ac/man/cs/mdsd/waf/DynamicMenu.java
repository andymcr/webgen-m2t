/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DynamicMenu#getService <em>Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DynamicMenu#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DynamicMenu#getDynamicTitle <em>Dynamic Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicMenu()
 * @model
 * @generated
 */
public interface DynamicMenu extends Menu {

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicMenu_Service()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DynamicMenu#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicMenu_Selection()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DynamicMenu#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Title</em>' reference.
	 * @see #setDynamicTitle(ServiceEntityElement)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDynamicMenu_DynamicTitle()
	 * @model ordered="false"
	 * @generated
	 */
	ServiceEntityElement getDynamicTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DynamicMenu#getDynamicTitle <em>Dynamic Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Title</em>' reference.
	 * @see #getDynamicTitle()
	 * @generated
	 */
	void setDynamicTitle(ServiceEntityElement value);
} // DynamicMenu
