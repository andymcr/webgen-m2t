/**
 */
package uk.ac.man.cs.mdsd.gencriteria;

import uk.ac.man.cs.mdsd.criteria.Function;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.GenFunction#getCriteriaFunction <em>Criteria Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenFunction()
 * @model
 * @generated
 */
public interface GenFunction extends GenExpression {
	/**
	 * Returns the value of the '<em><b>Criteria Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Function</em>' reference.
	 * @see #setCriteriaFunction(Function)
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenFunction_CriteriaFunction()
	 * @model required="true"
	 * @generated
	 */
	Function getCriteriaFunction();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.gencriteria.GenFunction#getCriteriaFunction <em>Criteria Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Function</em>' reference.
	 * @see #getCriteriaFunction()
	 * @generated
	 */
	void setCriteriaFunction(Function value);

} // GenFunction
