/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenDataUnit.java,v 1.11 2014/07/10 08:10:30 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Data Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenDataUnit#getGenSelection <em>Gen Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenDataUnit#getGenDynamicTitle <em>Gen Dynamic Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDataUnit()
 * @model abstract="true"
 * @generated
 */
public interface GenDataUnit extends GenDynamicUnit {

	/**
	 * Returns the value of the '<em><b>Gen Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Selection</em>' reference.
	 * @see #setGenSelection(GenSelection)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDataUnit_GenSelection()
	 * @model ordered="false"
	 * @generated
	 */
	GenSelection getGenSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenDataUnit#getGenSelection <em>Gen Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Selection</em>' reference.
	 * @see #getGenSelection()
	 * @generated
	 */
	void setGenSelection(GenSelection value);

	/**
	 * Returns the value of the '<em><b>Gen Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Dynamic Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Dynamic Title</em>' reference.
	 * @see #setGenDynamicTitle(GenUnitTitle)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDataUnit_GenDynamicTitle()
	 * @model ordered="false"
	 * @generated
	 */
	GenUnitTitle getGenDynamicTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenDataUnit#getGenDynamicTitle <em>Gen Dynamic Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Dynamic Title</em>' reference.
	 * @see #getGenDynamicTitle()
	 * @generated
	 */
	void setGenDynamicTitle(GenUnitTitle value);
} // GenDataUnit
