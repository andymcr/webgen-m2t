/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Inline Action Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer#getGenActions <em>Gen Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenInlineActionContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GenInlineActionContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen Actions</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenInlineAction}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenInlineAction#getGenUsedBy <em>Gen Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Actions</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenInlineActionContainer_GenActions()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenInlineAction#getGenUsedBy
	 * @model opposite="genUsedBy" containment="true"
	 * @generated
	 */
	EList<GenInlineAction> getGenActions();

} // GenInlineActionContainer
