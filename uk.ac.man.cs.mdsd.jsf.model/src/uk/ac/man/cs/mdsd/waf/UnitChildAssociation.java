/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Child Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitChildAssociation#getServiceFeature <em>Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitChildAssociation#getChildFeature <em>Child Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitChildAssociation()
 * @model
 * @generated
 */
public interface UnitChildAssociation extends UnitChildFeature {
	/**
	 * Returns the value of the '<em><b>Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Feature</em>' reference.
	 * @see #setServiceFeature(ServiceAssociation)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitChildAssociation_ServiceFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ServiceAssociation getServiceFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitChildAssociation#getServiceFeature <em>Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Feature</em>' reference.
	 * @see #getServiceFeature()
	 * @generated
	 */
	void setServiceFeature(ServiceAssociation value);

	/**
	 * Returns the value of the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Feature</em>' containment reference.
	 * @see #setChildFeature(UnitChildFeature)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitChildAssociation_ChildFeature()
	 * @model containment="true"
	 * @generated
	 */
	UnitChildFeature getChildFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitChildAssociation#getChildFeature <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Feature</em>' containment reference.
	 * @see #getChildFeature()
	 * @generated
	 */
	void setChildFeature(UnitChildFeature value);

} // UnitChildAssociation
