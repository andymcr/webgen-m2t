/**
 */
package uk.ac.man.cs.mdsd.criteria;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Comparison Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator#getLeft <em>Left</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator#getOperator <em>Operator</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getPredicateComparisonOperator()
 * @model
 * @generated
 */
public interface PredicateComparisonOperator extends Predicate {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getPredicateComparisonOperator_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.criteria.ComparisionOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.criteria.ComparisionOperator
	 * @see #setOperator(ComparisionOperator)
	 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getPredicateComparisonOperator_Operator()
	 * @model required="true"
	 * @generated
	 */
	ComparisionOperator getOperator();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.criteria.ComparisionOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparisionOperator value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getPredicateComparisonOperator_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // PredicateComparisonOperator
