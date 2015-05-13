/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ControlUnit#getSubmitLabel <em>Submit Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ControlUnit#getCancelDestination <em>Cancel Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ControlUnit#getCancelLabel <em>Cancel Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getControlUnit()
 * @model abstract="true"
 * @generated
 */
public interface ControlUnit extends DynamicUnit {
	/**
	 * Returns the value of the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submit Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submit Label</em>' attribute.
	 * @see #setSubmitLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getControlUnit_SubmitLabel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSubmitLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ControlUnit#getSubmitLabel <em>Submit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submit Label</em>' attribute.
	 * @see #getSubmitLabel()
	 * @generated
	 */
	void setSubmitLabel(String value);

	/**
	 * Returns the value of the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Destination</em>' reference.
	 * @see #setCancelDestination(Page)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getControlUnit_CancelDestination()
	 * @model ordered="false"
	 * @generated
	 */
	Page getCancelDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ControlUnit#getCancelDestination <em>Cancel Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Destination</em>' reference.
	 * @see #getCancelDestination()
	 * @generated
	 */
	void setCancelDestination(Page value);

	/**
	 * Returns the value of the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Label</em>' attribute.
	 * @see #setCancelLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getControlUnit_CancelLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getCancelLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ControlUnit#getCancelLabel <em>Cancel Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Label</em>' attribute.
	 * @see #getCancelLabel()
	 * @generated
	 */
	void setCancelLabel(String value);

} // ControlUnit
