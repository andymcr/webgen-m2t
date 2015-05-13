/**
 * <copyright>
 * </copyright>
 *
 * $Id: DataUnit.java,v 1.9 2014/07/10 08:11:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DataUnit#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DataUnit#getDynamicTitle <em>Dynamic Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDataUnit()
 * @model abstract="true"
 * @generated
 */
public interface DataUnit extends DynamicUnit {

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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDataUnit_Selection()
	 * @model ordered="false"
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DataUnit#getSelection <em>Selection</em>}' reference.
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
	 * @see #setDynamicTitle(UnitTitle)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDataUnit_DynamicTitle()
	 * @model ordered="false"
	 * @generated
	 */
	UnitTitle getDynamicTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DataUnit#getDynamicTitle <em>Dynamic Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Title</em>' reference.
	 * @see #getDynamicTitle()
	 * @generated
	 */
	void setDynamicTitle(UnitTitle value);

} // DataUnit
