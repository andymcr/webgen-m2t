/**
 */
package uk.ac.man.cs.mdsd.gencriteria;

import uk.ac.man.cs.mdsd.criteria.IntegerLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.GenIntegerLiteral#getCriteriaLiteral <em>Criteria Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenIntegerLiteral()
 * @model
 * @generated
 */
public interface GenIntegerLiteral extends GenLiteral {
	/**
	 * Returns the value of the '<em><b>Criteria Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria Literal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Literal</em>' reference.
	 * @see #setCriteriaLiteral(IntegerLiteral)
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenIntegerLiteral_CriteriaLiteral()
	 * @model required="true"
	 * @generated
	 */
	IntegerLiteral getCriteriaLiteral();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.gencriteria.GenIntegerLiteral#getCriteriaLiteral <em>Criteria Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Literal</em>' reference.
	 * @see #getCriteriaLiteral()
	 * @generated
	 */
	void setCriteriaLiteral(IntegerLiteral value);

} // GenIntegerLiteral
