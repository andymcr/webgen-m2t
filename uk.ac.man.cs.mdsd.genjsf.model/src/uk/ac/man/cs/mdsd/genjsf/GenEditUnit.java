/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenEditUnit.java,v 1.6 2013/06/06 09:51:01 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Edit Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getMessagePlacementOption <em>Message Placement Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getFormMessageDisplayOption <em>Form Message Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getGenConfirmDestination <em>Gen Confirm Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getGenCancelDestination <em>Gen Cancel Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenEditUnit()
 * @model abstract="true"
 * @generated
 */
public interface GenEditUnit extends GenDynamicUnit {
	/**
	 * Returns the value of the '<em><b>Message Placement Option</b></em>' attribute.
	 * The default value is <code>"OnFeature"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.genjsf.InputMessagePlacementOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Placement Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Placement Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.genjsf.InputMessagePlacementOptions
	 * @see #setMessagePlacementOption(InputMessagePlacementOptions)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenEditUnit_MessagePlacementOption()
	 * @model default="OnFeature" required="true" ordered="false"
	 * @generated
	 */
	InputMessagePlacementOptions getMessagePlacementOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getMessagePlacementOption <em>Message Placement Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Placement Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.genjsf.InputMessagePlacementOptions
	 * @see #getMessagePlacementOption()
	 * @generated
	 */
	void setMessagePlacementOption(InputMessagePlacementOptions value);

	/**
	 * Returns the value of the '<em><b>Form Message Display Option</b></em>' attribute.
	 * The default value is <code>"Description"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Message Display Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Message Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions
	 * @see #setFormMessageDisplayOption(InputMessageDisplayOptions)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenEditUnit_FormMessageDisplayOption()
	 * @model default="Description" required="true" ordered="false"
	 * @generated
	 */
	InputMessageDisplayOptions getFormMessageDisplayOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getFormMessageDisplayOption <em>Form Message Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Message Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions
	 * @see #getFormMessageDisplayOption()
	 * @generated
	 */
	void setFormMessageDisplayOption(InputMessageDisplayOptions value);

	/**
	 * Returns the value of the '<em><b>Gen Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Confirm Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Confirm Destination</em>' reference.
	 * @see #setGenConfirmDestination(GenPage)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenEditUnit_GenConfirmDestination()
	 * @model ordered="false"
	 * @generated
	 */
	GenPage getGenConfirmDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getGenConfirmDestination <em>Gen Confirm Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Confirm Destination</em>' reference.
	 * @see #getGenConfirmDestination()
	 * @generated
	 */
	void setGenConfirmDestination(GenPage value);

	/**
	 * Returns the value of the '<em><b>Gen Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Cancel Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Cancel Destination</em>' reference.
	 * @see #setGenCancelDestination(GenPage)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenEditUnit_GenCancelDestination()
	 * @model ordered="false"
	 * @generated
	 */
	GenPage getGenCancelDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getGenCancelDestination <em>Gen Cancel Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Cancel Destination</em>' reference.
	 * @see #getGenCancelDestination()
	 * @generated
	 */
	void setGenCancelDestination(GenPage value);
} // GenEditUnit
