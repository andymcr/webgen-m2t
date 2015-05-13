/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.Association;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Entity Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceEntityAssociation#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceEntityAssociation()
 * @model
 * @generated
 */
public interface ServiceEntityAssociation extends ServiceEntityFeature, ServiceAssociation, IncludedAssociation {

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Association)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceEntityAssociation_Feature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Association getFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceEntityAssociation#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Association value);
} // ServiceEntityAssociation
