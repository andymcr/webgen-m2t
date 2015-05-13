/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Support Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.FeatureSupportAction#getConfirmMessage <em>Confirm Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFeatureSupportAction()
 * @model
 * @generated
 */
public interface FeatureSupportAction extends InlineAction {
	/**
	 * Returns the value of the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Message</em>' attribute.
	 * @see #setConfirmMessage(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFeatureSupportAction_ConfirmMessage()
	 * @model required="true"
	 * @generated
	 */
	String getConfirmMessage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.FeatureSupportAction#getConfirmMessage <em>Confirm Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Message</em>' attribute.
	 * @see #getConfirmMessage()
	 * @generated
	 */
	void setConfirmMessage(String value);

} // FeatureSupportAction
