/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelectAction.java,v 1.5 2013/07/12 07:52:09 andy Exp $
 */
package uk.ac.man.cs.mdsd.jsf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.SelectAction#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getSelectAction()
 * @model
 * @generated
 */
public interface SelectAction extends InlineAction {

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.jsf.SelectTarget#getTargettingActions <em>Targetting Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SelectTarget)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getSelectAction_Target()
	 * @see uk.ac.man.cs.mdsd.jsf.SelectTarget#getTargettingActions
	 * @model opposite="targettingActions" required="true" ordered="false"
	 * @generated
	 */
	SelectTarget getTarget();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.SelectAction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SelectTarget value);
} // SelectAction
