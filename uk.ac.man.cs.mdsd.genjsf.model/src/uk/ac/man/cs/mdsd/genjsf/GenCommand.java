/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenCommand#getGenPartOf <em>Gen Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenCommand()
 * @model abstract="true"
 * @generated
 */
public interface GenCommand extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Gen Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenCommandUnit#getGenCommands <em>Gen Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Part Of</em>' container reference.
	 * @see #setGenPartOf(GenCommandUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenCommand_GenPartOf()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCommandUnit#getGenCommands
	 * @model opposite="genCommands" required="true" transient="false"
	 * @generated
	 */
	GenCommandUnit getGenPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenCommand#getGenPartOf <em>Gen Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Part Of</em>' container reference.
	 * @see #getGenPartOf()
	 * @generated
	 */
	void setGenPartOf(GenCommandUnit value);
} // GenCommand
