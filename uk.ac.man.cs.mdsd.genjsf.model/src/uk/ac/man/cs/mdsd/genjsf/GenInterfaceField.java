/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.gencriteria.GenExpression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Interface Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenInterfaceField#getGenMustMatch <em>Gen Must Match</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenInterfaceField#getGenDefaultValue <em>Gen Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenInterfaceField()
 * @model abstract="true"
 * @generated
 */
public interface GenInterfaceField extends GenUnitField {

	/**
	 * Returns the value of the '<em><b>Gen Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Must Match</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Must Match</em>' reference.
	 * @see #setGenMustMatch(GenUnitField)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenInterfaceField_GenMustMatch()
	 * @model ordered="false"
	 * @generated
	 */
	GenUnitField getGenMustMatch();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenInterfaceField#getGenMustMatch <em>Gen Must Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Must Match</em>' reference.
	 * @see #getGenMustMatch()
	 * @generated
	 */
	void setGenMustMatch(GenUnitField value);

	/**
	 * Returns the value of the '<em><b>Gen Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Default Value</em>' containment reference.
	 * @see #setGenDefaultValue(GenExpression)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenInterfaceField_GenDefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	GenExpression getGenDefaultValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenInterfaceField#getGenDefaultValue <em>Gen Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Default Value</em>' containment reference.
	 * @see #getGenDefaultValue()
	 * @generated
	 */
	void setGenDefaultValue(GenExpression value);
} // GenInterfaceField
