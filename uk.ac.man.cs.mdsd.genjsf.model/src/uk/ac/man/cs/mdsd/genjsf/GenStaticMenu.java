/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.StaticMenu;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Static Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenStaticMenu#getJsfMenu <em>Jsf Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenStaticMenu()
 * @model
 * @generated
 */
public interface GenStaticMenu extends GenMenu {

	/**
	 * Returns the value of the '<em><b>Jsf Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Menu</em>' reference.
	 * @see #setJsfMenu(StaticMenu)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenStaticMenu_JsfMenu()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StaticMenu getJsfMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenStaticMenu#getJsfMenu <em>Jsf Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Menu</em>' reference.
	 * @see #getJsfMenu()
	 * @generated
	 */
	void setJsfMenu(StaticMenu value);
} // GenStaticMenu
