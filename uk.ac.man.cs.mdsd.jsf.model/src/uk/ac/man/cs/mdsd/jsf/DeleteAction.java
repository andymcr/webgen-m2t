/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeleteAction.java,v 1.4 2012/02/16 07:31:10 andy Exp $
 */
package uk.ac.man.cs.mdsd.jsf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.DeleteAction#getDestination <em>Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.DeleteAction#getConfirmMessage <em>Confirm Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getDeleteAction()
 * @model
 * @generated
 */
public interface DeleteAction extends InlineAction {

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Page)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getDeleteAction_Destination()
	 * @model
	 * @generated
	 */
	Page getDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.DeleteAction#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Page value);

	/**
	 * Returns the value of the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Message</em>' attribute.
	 * @see #setConfirmMessage(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getDeleteAction_ConfirmMessage()
	 * @model required="true"
	 * @generated
	 */
	String getConfirmMessage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.DeleteAction#getConfirmMessage <em>Confirm Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Message</em>' attribute.
	 * @see #getConfirmMessage()
	 * @generated
	 */
	void setConfirmMessage(String value);

} // DeleteAction
