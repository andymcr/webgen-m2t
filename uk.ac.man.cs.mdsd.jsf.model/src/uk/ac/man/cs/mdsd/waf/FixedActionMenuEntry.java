/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Action Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.FixedActionMenuEntry#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFixedActionMenuEntry()
 * @model
 * @generated
 */
public interface FixedActionMenuEntry extends MenuEntry, NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(DynamicUnit)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFixedActionMenuEntry_Destination()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DynamicUnit getDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.FixedActionMenuEntry#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(DynamicUnit value);

} // FixedActionMenuEntry
