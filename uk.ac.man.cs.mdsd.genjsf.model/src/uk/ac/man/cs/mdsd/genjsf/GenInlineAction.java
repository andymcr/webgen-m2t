/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenInlineAction.java,v 1.9 2014/01/25 17:38:19 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.InlineAction;
import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Inline Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenInlineAction#getJsfAction <em>Jsf Action</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenInlineAction#getGenUsedBy <em>Gen Used By</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenInlineAction()
 * @model abstract="true"
 * @generated
 */
public interface GenInlineAction extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Jsf Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Action</em>' reference.
	 * @see #setJsfAction(InlineAction)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenInlineAction_JsfAction()
	 * @model required="true"
	 * @generated
	 */
	InlineAction getJsfAction();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenInlineAction#getJsfAction <em>Jsf Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Action</em>' reference.
	 * @see #getJsfAction()
	 * @generated
	 */
	void setJsfAction(InlineAction value);


	/**
	 * Returns the value of the '<em><b>Gen Used By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer#getGenActions <em>Gen Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Used By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Used By</em>' container reference.
	 * @see #setGenUsedBy(GenInlineActionContainer)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenInlineAction_GenUsedBy()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer#getGenActions
	 * @model opposite="genActions" required="true" transient="false"
	 * @generated
	 */
	GenInlineActionContainer getGenUsedBy();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenInlineAction#getGenUsedBy <em>Gen Used By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Used By</em>' container reference.
	 * @see #getGenUsedBy()
	 * @generated
	 */
	void setGenUsedBy(GenInlineActionContainer value);

	void reconcile(final GenInlineAction oldGenInlineAction);
} // GenInlineAction
