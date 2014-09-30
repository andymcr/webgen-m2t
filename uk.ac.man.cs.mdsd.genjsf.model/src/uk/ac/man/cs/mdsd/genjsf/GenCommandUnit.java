/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.jsf.CommandUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Command Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenCommandUnit#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenCommandUnit#getGenCommands <em>Gen Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenCommandUnit()
 * @model
 * @generated
 */
public interface GenCommandUnit extends GenContentUnit {
	/**
	 * Returns the value of the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Unit</em>' reference.
	 * @see #setJsfUnit(CommandUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenCommandUnit_JsfUnit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CommandUnit getJsfUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenCommandUnit#getJsfUnit <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Unit</em>' reference.
	 * @see #getJsfUnit()
	 * @generated
	 */
	void setJsfUnit(CommandUnit value);

	/**
	 * Returns the value of the '<em><b>Gen Commands</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenCommand}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenCommand#getGenPartOf <em>Gen Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Commands</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenCommandUnit_GenCommands()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCommand#getGenPartOf
	 * @model opposite="genPartOf" containment="true"
	 * @generated
	 */
	EList<GenCommand> getGenCommands();

} // GenCommandUnit
