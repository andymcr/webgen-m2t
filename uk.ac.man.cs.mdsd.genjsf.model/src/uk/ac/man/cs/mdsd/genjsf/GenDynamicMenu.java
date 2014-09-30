/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.DynamicMenu;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Dynamic Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getJsfMenu <em>Jsf Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getGenService <em>Gen Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getGenSelection <em>Gen Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getGenDynamicTitle <em>Gen Dynamic Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDynamicMenu()
 * @model
 * @generated
 */
public interface GenDynamicMenu extends GenMenu {

	/**
	 * Returns the value of the '<em><b>Jsf Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Menu</em>' reference.
	 * @see #setJsfMenu(DynamicMenu)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDynamicMenu_JsfMenu()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DynamicMenu getJsfMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getJsfMenu <em>Jsf Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Menu</em>' reference.
	 * @see #getJsfMenu()
	 * @generated
	 */
	void setJsfMenu(DynamicMenu value);

	/**
	 * Returns the value of the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Service</em>' reference.
	 * @see #setGenService(GenService)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDynamicMenu_GenService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenService getGenService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getGenService <em>Gen Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Service</em>' reference.
	 * @see #getGenService()
	 * @generated
	 */
	void setGenService(GenService value);

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
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDynamicMenu_GenSelection()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenSelection getGenSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getGenSelection <em>Gen Selection</em>}' reference.
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
	 * @see #setGenDynamicTitle(GenServiceEntityElement)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDynamicMenu_GenDynamicTitle()
	 * @model ordered="false"
	 * @generated
	 */
	GenServiceEntityElement getGenDynamicTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getGenDynamicTitle <em>Gen Dynamic Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Dynamic Title</em>' reference.
	 * @see #getGenDynamicTitle()
	 * @generated
	 */
	void setGenDynamicTitle(GenServiceEntityElement value);
} // GenDynamicMenu
