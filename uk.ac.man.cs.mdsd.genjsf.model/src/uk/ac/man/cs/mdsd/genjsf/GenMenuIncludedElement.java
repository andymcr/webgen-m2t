/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.MenuIncludedElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Menu Included Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedElement#getJsfMenuEntry <em>Jsf Menu Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenMenuIncludedElement()
 * @model
 * @generated
 */
public interface GenMenuIncludedElement extends GenMenuIncludedFeature {

	/**
	 * Returns the value of the '<em><b>Jsf Menu Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Menu Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Menu Entry</em>' reference.
	 * @see #setJsfMenuEntry(MenuIncludedElement)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenMenuIncludedElement_JsfMenuEntry()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MenuIncludedElement getJsfMenuEntry();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedElement#getJsfMenuEntry <em>Jsf Menu Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Menu Entry</em>' reference.
	 * @see #getJsfMenuEntry()
	 * @generated
	 */
	void setJsfMenuEntry(MenuIncludedElement value);
} // GenMenuIncludedElement
