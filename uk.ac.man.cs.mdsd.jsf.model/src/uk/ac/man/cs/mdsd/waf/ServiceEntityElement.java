/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.Attribute;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Entity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceEntityElement#getFeature <em>Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceEntityElement#isCaseInsensitive <em>Case Insensitive</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceEntityElement#isEncrypt <em>Encrypt</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceEntityElement#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceEntityElement#getValidationPattern <em>Validation Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceEntityElement()
 * @model
 * @generated
 */
public interface ServiceEntityElement extends ServiceEntityFeature, IncludedElement, UnitTitle {

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Attribute)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceEntityElement_Feature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceEntityElement#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Attribute value);

	/**
	 * Returns the value of the '<em><b>Case Insensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Insensitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Insensitive</em>' attribute.
	 * @see #setCaseInsensitive(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceEntityElement_CaseInsensitive()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCaseInsensitive();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceEntityElement#isCaseInsensitive <em>Case Insensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Insensitive</em>' attribute.
	 * @see #isCaseInsensitive()
	 * @generated
	 */
	void setCaseInsensitive(boolean value);

	/**
	 * Returns the value of the '<em><b>Encrypt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encrypt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypt</em>' attribute.
	 * @see #setEncrypt(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceEntityElement_Encrypt()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isEncrypt();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceEntityElement#isEncrypt <em>Encrypt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypt</em>' attribute.
	 * @see #isEncrypt()
	 * @generated
	 */
	void setEncrypt(boolean value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceEntityElement_Placeholder()
	 * @model ordered="false"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceEntityElement#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Pattern</em>' attribute.
	 * @see #setValidationPattern(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceEntityElement_ValidationPattern()
	 * @model ordered="false"
	 * @generated
	 */
	String getValidationPattern();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceEntityElement#getValidationPattern <em>Validation Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Pattern</em>' attribute.
	 * @see #getValidationPattern()
	 * @generated
	 */
	void setValidationPattern(String value);
} // ServiceEntityElement
