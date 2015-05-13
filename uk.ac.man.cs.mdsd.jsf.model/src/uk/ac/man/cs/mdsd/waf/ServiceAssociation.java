/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceAssociation#getOppositeService <em>Opposite Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceAssociation#getOppositeFeature <em>Opposite Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAssociation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ServiceAssociation extends ServiceFeature {

	/**
	 * Returns the value of the '<em><b>Opposite Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite Service</em>' reference.
	 * @see #setOppositeService(Service)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAssociation_OppositeService()
	 * @model required="true"
	 * @generated
	 */
	Service getOppositeService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceAssociation#getOppositeService <em>Opposite Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite Service</em>' reference.
	 * @see #getOppositeService()
	 * @generated
	 */
	void setOppositeService(Service value);

	/**
	 * Returns the value of the '<em><b>Opposite Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite Feature</em>' reference.
	 * @see #setOppositeFeature(ServiceAssociation)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAssociation_OppositeFeature()
	 * @model ordered="false"
	 * @generated
	 */
	ServiceAssociation getOppositeFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceAssociation#getOppositeFeature <em>Opposite Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite Feature</em>' reference.
	 * @see #getOppositeFeature()
	 * @generated
	 */
	void setOppositeFeature(ServiceAssociation value);
} // ServiceAssociation
