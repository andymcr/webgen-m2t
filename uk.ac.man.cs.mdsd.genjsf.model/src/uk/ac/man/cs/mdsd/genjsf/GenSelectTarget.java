/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Select Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenSelectTarget#getGenTargettingActions <em>Gen Targetting Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenSelectTarget()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GenSelectTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen Targetting Actions</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenSelectAction}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenSelectAction#getGenTarget <em>Gen Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Targetting Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Targetting Actions</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenSelectTarget_GenTargettingActions()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSelectAction#getGenTarget
	 * @model opposite="genTarget"
	 * @generated
	 */
	EList<GenSelectAction> getGenTargettingActions();

} // GenSelectTarget
