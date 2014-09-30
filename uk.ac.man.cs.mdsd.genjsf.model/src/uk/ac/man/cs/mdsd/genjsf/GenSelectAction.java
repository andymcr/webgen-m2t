/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenSelectAction.java,v 1.7 2013/07/12 07:52:02 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Select Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenSelectAction#getGenTarget <em>Gen Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenSelectAction()
 * @model
 * @generated
 */
public interface GenSelectAction extends GenInlineAction {

	/**
	 * Returns the value of the '<em><b>Gen Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenSelectTarget#getGenTargettingActions <em>Gen Targetting Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Target</em>' reference.
	 * @see #setGenTarget(GenSelectTarget)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenSelectAction_GenTarget()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSelectTarget#getGenTargettingActions
	 * @model opposite="genTargettingActions" required="true" ordered="false"
	 * @generated
	 */
	GenSelectTarget getGenTarget();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenSelectAction#getGenTarget <em>Gen Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Target</em>' reference.
	 * @see #getGenTarget()
	 * @generated
	 */
	void setGenTarget(GenSelectTarget value);
} // GenSelectAction
