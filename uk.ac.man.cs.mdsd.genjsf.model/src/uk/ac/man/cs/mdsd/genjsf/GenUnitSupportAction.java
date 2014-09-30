/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.UnitSupportAction;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Unit Support Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitSupportAction#getJsfAction <em>Jsf Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitSupportAction()
 * @model
 * @generated
 */
public interface GenUnitSupportAction extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Jsf Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Action</em>' reference.
	 * @see #setJsfAction(UnitSupportAction)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitSupportAction_JsfAction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UnitSupportAction getJsfAction();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitSupportAction#getJsfAction <em>Jsf Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Action</em>' reference.
	 * @see #getJsfAction()
	 * @generated
	 */
	void setJsfAction(UnitSupportAction value);

} // GenUnitSupportAction
