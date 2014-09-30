/**
 */
package uk.ac.man.cs.mdsd.gencriteria;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.criteria.PredicateBooleanOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Predicate Boolean Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateBooleanOperator#getCriteriaPredicate <em>Criteria Predicate</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateBooleanOperator#getGenExpressions <em>Gen Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenPredicateBooleanOperator()
 * @model
 * @generated
 */
public interface GenPredicateBooleanOperator extends GenPredicate {
	/**
	 * Returns the value of the '<em><b>Criteria Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria Predicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Predicate</em>' reference.
	 * @see #setCriteriaPredicate(PredicateBooleanOperator)
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenPredicateBooleanOperator_CriteriaPredicate()
	 * @model required="true"
	 * @generated
	 */
	PredicateBooleanOperator getCriteriaPredicate();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateBooleanOperator#getCriteriaPredicate <em>Criteria Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Predicate</em>' reference.
	 * @see #getCriteriaPredicate()
	 * @generated
	 */
	void setCriteriaPredicate(PredicateBooleanOperator value);

	/**
	 * Returns the value of the '<em><b>Gen Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.gencriteria.GenPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Expressions</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenPredicateBooleanOperator_GenExpressions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<GenPredicate> getGenExpressions();

} // GenPredicateBooleanOperator
