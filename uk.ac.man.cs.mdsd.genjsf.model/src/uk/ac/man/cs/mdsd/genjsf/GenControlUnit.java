/**
 */
package uk.ac.man.cs.mdsd.genjsf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Control Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenControlUnit#getMessagePlacementOption <em>Message Placement Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenControlUnit#getGenCancelDestination <em>Gen Cancel Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenControlUnit()
 * @model abstract="true"
 * @generated
 */
public interface GenControlUnit extends GenDynamicUnit {

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
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenControlUnit_MessagePlacementOption()
	 * @model default="OnFeature" required="true" ordered="false"
	 * @generated
	 */
	InputMessagePlacementOptions getMessagePlacementOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenControlUnit#getMessagePlacementOption <em>Message Placement Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Placement Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.genjsf.InputMessagePlacementOptions
	 * @see #getMessagePlacementOption()
	 * @generated
	 */
	void setMessagePlacementOption(InputMessagePlacementOptions value);

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
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenControlUnit_GenCancelDestination()
	 * @model ordered="false"
	 * @generated
	 */
	GenPage getGenCancelDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenControlUnit#getGenCancelDestination <em>Gen Cancel Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Cancel Destination</em>' reference.
	 * @see #getGenCancelDestination()
	 * @generated
	 */
	void setGenCancelDestination(GenPage value);
} // GenControlUnit
