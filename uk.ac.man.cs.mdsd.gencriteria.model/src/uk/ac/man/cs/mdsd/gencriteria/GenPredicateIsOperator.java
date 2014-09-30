/**
 */
package uk.ac.man.cs.mdsd.gencriteria;

import uk.ac.man.cs.mdsd.criteria.PredicateIsOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Predicate Is Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator#getCriteriaPredicate <em>Criteria Predicate</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator#getGenLeft <em>Gen Left</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator#getGenRight <em>Gen Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenPredicateIsOperator()
 * @model
 * @generated
 */
public interface GenPredicateIsOperator extends GenPredicate {
	/**
	 * Returns the value of the '<em><b>Criteria Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria Predicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Predicate</em>' reference.
	 * @see #setCriteriaPredicate(PredicateIsOperator)
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenPredicateIsOperator_CriteriaPredicate()
	 * @model required="true"
	 * @generated
	 */
	PredicateIsOperator getCriteriaPredicate();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator#getCriteriaPredicate <em>Criteria Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Predicate</em>' reference.
	 * @see #getCriteriaPredicate()
	 * @generated
	 */
	void setCriteriaPredicate(PredicateIsOperator value);

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
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenPredicateIsOperator_GenLeft()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GenExpression getGenLeft();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator#getGenLeft <em>Gen Left</em>}' containment reference.
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
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenPredicateIsOperator_GenRight()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GenExpression getGenRight();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator#getGenRight <em>Gen Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Right</em>' containment reference.
	 * @see #getGenRight()
	 * @generated
	 */
	void setGenRight(GenExpression value);

} // GenPredicateIsOperator
