/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CommandUnit#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCommandUnit()
 * @model
 * @generated
 */
public interface CommandUnit extends ContentUnit {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.Command}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.Command#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCommandUnit_Commands()
	 * @see uk.ac.man.cs.mdsd.waf.Command#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

} // CommandUnit
