/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Update Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CreateUpdateUnit#getClearLabel <em>Clear Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCreateUpdateUnit()
 * @model
 * @generated
 */
public interface CreateUpdateUnit extends EditUnit, SelectTarget {

	/**
	 * Returns the value of the '<em><b>Clear Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clear Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Label</em>' attribute.
	 * @see #setClearLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCreateUpdateUnit_ClearLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getClearLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CreateUpdateUnit#getClearLabel <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Label</em>' attribute.
	 * @see #getClearLabel()
	 * @generated
	 */
	void setClearLabel(String value);
} // CreateUpdateUnit
