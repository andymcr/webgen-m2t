/**
 */
package uk.ac.man.cs.mdsd.jsf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Action Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.InlineActionContainer#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getInlineActionContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface InlineActionContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.jsf.InlineAction}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.jsf.InlineAction#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getInlineActionContainer_Actions()
	 * @see uk.ac.man.cs.mdsd.jsf.InlineAction#getUsedBy
	 * @model opposite="usedBy" containment="true"
	 * @generated
	 */
	EList<InlineAction> getActions();

} // InlineActionContainer
