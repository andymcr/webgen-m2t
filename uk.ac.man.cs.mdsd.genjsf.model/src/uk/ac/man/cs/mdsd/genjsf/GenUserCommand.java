/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.Command;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen User Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUserCommand#getJsfCommand <em>Jsf Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUserCommand()
 * @model
 * @generated
 */
public interface GenUserCommand extends GenCommand {
	/**
	 * Returns the value of the '<em><b>Jsf Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Command</em>' reference.
	 * @see #setJsfCommand(Command)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUserCommand_JsfCommand()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Command getJsfCommand();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUserCommand#getJsfCommand <em>Jsf Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Command</em>' reference.
	 * @see #getJsfCommand()
	 * @generated
	 */
	void setJsfCommand(Command value);

} // GenUserCommand
