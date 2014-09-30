/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.common.util.EList;
import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenMenu#getGenEntries <em>Gen Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenMenu()
 * @model abstract="true"
 * @generated
 */
public interface GenMenu extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Gen Entries</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenMenuEntry}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenMenuEntry#getGenPartOf <em>Gen Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Entries</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenMenu_GenEntries()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMenuEntry#getGenPartOf
	 * @model opposite="genPartOf" containment="true"
	 * @generated
	 */
	EList<GenMenuEntry> getGenEntries();

	/**
	 * @generated NOT
	 */
	void reconcile(final GenMenu oldGenMenu);

} // GenMenu
