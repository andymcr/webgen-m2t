/**
 */
package uk.ac.man.cs.mdsd.gencriteria;

import uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Predicate Comparison Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator#getCriteriaPredicate <em>Criteria Predicate</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator#getGenLeft <em>Gen Left</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator#getGenRight <em>Gen Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenPredicateComparisonOperator()
 * @model
 * @generated
 */
public interface GenPredicateComparisonOperator extends GenPredicate {
	/**
	 * Returns the value of the '<em><b>Criteria Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria Predicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Predicate</em>' reference.
	 * @see #setCriteriaPredicate(PredicateComparisonOperator)
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenPredicateComparisonOperator_CriteriaPredicate()
	 * @model required="true"
	 * @generated
	 */
	PredicateComparisonOperator getCriteriaPredicate();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator#getCriteriaPredicate <em>Criteria Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Predicate</em>' reference.
	 * @see #getCriteriaPredicate()
	 * @generated
	 */
	void setCriteriaPredicate(PredicateComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Gen Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Left</em>' containment reference.
	 * @see #setGenLeft(GenExpression)
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenPredicateComparisonOperator_GenLeft()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GenExpression getGenLeft();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator#getGenLeft <em>Gen Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Left</em>' containment reference.
	 * @see #getGenLeft()
	 * @generated
	 */
	void setGenLeft(GenExpression value);

	/**
	 * Returns the value of the '<em><b>Gen Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Right</em>' containment reference.
	 * @see #setGenRight(GenExpression)
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenPredicateComparisonOperator_GenRight()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GenExpression getGenRight();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator#getGenRight <em>Gen Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Right</em>' containment reference.
	 * @see #getGenRight()
	 * @generated
	 */
	void setGenRight(GenExpression value);

} // GenPredicateComparisonOperator
