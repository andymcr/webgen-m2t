/**
 */
package uk.ac.man.cs.mdsd.gencriteria;

import uk.ac.man.cs.mdsd.criteria.PredicateIsEmpty;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Predicate Is Empty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsEmpty#getCriteriaPredicate <em>Criteria Predicate</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsEmpty#getGenFeature <em>Gen Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenPredicateIsEmpty()
 * @model
 * @generated
 */
public interface GenPredicateIsEmpty extends GenPredicate {
	/**
	 * Returns the value of the '<em><b>Criteria Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria Predicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Predicate</em>' reference.
	 * @see #setCriteriaPredicate(PredicateIsEmpty)
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenPredicateIsEmpty_CriteriaPredicate()
	 * @model required="true"
	 * @generated
	 */
	PredicateIsEmpty getCriteriaPredicate();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsEmpty#getCriteriaPredicate <em>Criteria Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Predicate</em>' reference.
	 * @see #getCriteriaPredicate()
	 * @generated
	 */
	void setCriteriaPredicate(PredicateIsEmpty value);

	/**
	 * Returns the value of the '<em><b>Gen Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Feature</em>' containment reference.
	 * @see #setGenFeature(GenPath)
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenPredicateIsEmpty_GenFeature()
	 * @model containment="true"
	 * @generated
	 */
	GenPath getGenFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsEmpty#getGenFeature <em>Gen Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Feature</em>' containment reference.
	 * @see #getGenFeature()
	 * @generated
	 */
	void setGenFeature(GenPath value);

} // GenPredicateIsEmpty
