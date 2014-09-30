/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Dynamic Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit#getGenService <em>Gen Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit#getGenDisplayFields <em>Gen Display Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit#getGenSupportActions <em>Gen Support Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDynamicUnit()
 * @model abstract="true"
 * @generated
 */
public interface GenDynamicUnit extends GenContentUnit {
	/**
	 * Returns the value of the '<em><b>Gen Service</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenService#getGenAccessedBy <em>Gen Accessed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Service</em>' reference.
	 * @see #setGenService(GenService)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDynamicUnit_GenService()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenService#getGenAccessedBy
	 * @model opposite="genAccessedBy" required="true"
	 * @generated
	 */
	GenService getGenService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit#getGenService <em>Gen Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Service</em>' reference.
	 * @see #getGenService()
	 * @generated
	 */
	void setGenService(GenService value);

	/**
	 * Returns the value of the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenUnitField}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitField#getGenDisplayedOn <em>Gen Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Display Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Display Fields</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDynamicUnit_GenDisplayFields()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitField#getGenDisplayedOn
	 * @model opposite="genDisplayedOn" containment="true"
	 * @generated
	 */
	EList<GenUnitField> getGenDisplayFields();

	/**
	 * Returns the value of the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenUnitSupportAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Support Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Support Actions</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDynamicUnit_GenSupportActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenUnitSupportAction> getGenSupportActions();

} // GenDynamicUnit
