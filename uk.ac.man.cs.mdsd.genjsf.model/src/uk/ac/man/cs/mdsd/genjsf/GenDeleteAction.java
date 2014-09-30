/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenDeleteAction.java,v 1.5 2013/04/10 16:29:55 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Delete Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenDeleteAction#getGenDestination <em>Gen Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDeleteAction()
 * @model
 * @generated
 */
public interface GenDeleteAction extends GenInlineAction {

	/**
	 * Returns the value of the '<em><b>Gen Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Destination</em>' reference.
	 * @see #setGenDestination(GenPage)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenDeleteAction_GenDestination()
	 * @model ordered="false"
	 * @generated
	 */
	GenPage getGenDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenDeleteAction#getGenDestination <em>Gen Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Destination</em>' reference.
	 * @see #getGenDestination()
	 * @generated
	 */
	void setGenDestination(GenPage value);
} // GenDeleteAction
