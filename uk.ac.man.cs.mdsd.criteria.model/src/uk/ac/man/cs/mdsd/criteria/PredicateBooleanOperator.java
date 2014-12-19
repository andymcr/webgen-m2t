/**
 */
package uk.ac.man.cs.mdsd.criteria;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Boolean Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.criteria.PredicateBooleanOperator#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.criteria.PredicateBooleanOperator#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getPredicateBooleanOperator()
 * @model
 * @generated
 */
public interface PredicateBooleanOperator extends Predicate {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.criteria.Predicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getPredicateBooleanOperator_Expressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Predicate> getExpressions();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"And"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.criteria.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.criteria.BooleanOperator
	 * @see #setOperator(BooleanOperator)
	 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getPredicateBooleanOperator_Operator()
	 * @model default="And" required="true" ordered="false"
	 * @generated
	 */
	BooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.criteria.PredicateBooleanOperator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.criteria.BooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOperator value);

} // PredicateBooleanOperator
