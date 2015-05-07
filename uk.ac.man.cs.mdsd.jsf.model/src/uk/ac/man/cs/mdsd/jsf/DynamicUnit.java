/**
 */
package uk.ac.man.cs.mdsd.jsf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getService <em>Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getDisplayFields <em>Display Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getSupportActions <em>Support Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getHeader <em>Header</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getControlClass <em>Control Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getErrorClass <em>Error Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getDynamicUnit()
 * @model abstract="true"
 * @generated
 */
public interface DynamicUnit extends ContentUnit {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.jsf.Service#getAccessedBy <em>Accessed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getDynamicUnit_Service()
	 * @see uk.ac.man.cs.mdsd.jsf.Service#getAccessedBy
	 * @model opposite="accessedBy" required="true" ordered="false"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>Display Fields</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.jsf.UnitField}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.jsf.UnitField#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Fields</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getDynamicUnit_DisplayFields()
	 * @see uk.ac.man.cs.mdsd.jsf.UnitField#getDisplayedOn
	 * @model opposite="displayedOn" containment="true"
	 * @generated
	 */
	EList<UnitField> getDisplayFields();

	/**
	 * Returns the value of the '<em><b>Support Actions</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.jsf.UnitSupportAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Actions</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getDynamicUnit_SupportActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnitSupportAction> getSupportActions();

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getDynamicUnit_Header()
	 * @model ordered="false"
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' attribute.
	 * @see #setFooter(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getDynamicUnit_Footer()
	 * @model ordered="false"
	 * @generated
	 */
	String getFooter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getFooter <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' attribute.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(String value);

	/**
	 * Returns the value of the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Class</em>' attribute.
	 * @see #setHeaderClass(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getDynamicUnit_HeaderClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getHeaderClass <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class</em>' attribute.
	 * @see #getHeaderClass()
	 * @generated
	 */
	void setHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Class</em>' attribute.
	 * @see #setControlClass(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getDynamicUnit_ControlClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getControlClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getControlClass <em>Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Class</em>' attribute.
	 * @see #getControlClass()
	 * @generated
	 */
	void setControlClass(String value);

	/**
	 * Returns the value of the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Class</em>' attribute.
	 * @see #setFooterClass(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getDynamicUnit_FooterClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

	/**
	 * Returns the value of the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Class</em>' attribute.
	 * @see #setErrorClass(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getDynamicUnit_ErrorClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getErrorClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getErrorClass <em>Error Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Class</em>' attribute.
	 * @see #getErrorClass()
	 * @generated
	 */
	void setErrorClass(String value);

} // DynamicUnit
