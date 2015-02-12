/**
 */
package uk.ac.man.cs.mdsd.gencriteria;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage
 * @generated
 */
public interface GencriteriaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GencriteriaFactory eINSTANCE = uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gen Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Null Literal</em>'.
	 * @generated
	 */
	GenNullLiteral createGenNullLiteral();

	/**
	 * Returns a new object of class '<em>Gen Predicate Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Predicate Boolean Operator</em>'.
	 * @generated
	 */
	GenPredicateBooleanOperator createGenPredicateBooleanOperator();

	/**
	 * Returns a new object of class '<em>Gen Predicate Equality Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Predicate Equality Operator</em>'.
	 * @generated
	 */
	GenPredicateEqualityOperator createGenPredicateEqualityOperator();

	/**
	 * Returns a new object of class '<em>Gen Predicate Comparison Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Predicate Comparison Operator</em>'.
	 * @generated
	 */
	GenPredicateComparisonOperator createGenPredicateComparisonOperator();

	/**
	 * Returns a new object of class '<em>Gen Predicate Is Empty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Predicate Is Empty</em>'.
	 * @generated
	 */
	GenPredicateIsEmpty createGenPredicateIsEmpty();

	/**
	 * Returns a new object of class '<em>Gen Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Order</em>'.
	 * @generated
	 */
	GenOrder createGenOrder();

	/**
	 * Returns a new object of class '<em>Gen Predicate Is Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Predicate Is Operator</em>'.
	 * @generated
	 */
	GenPredicateIsOperator createGenPredicateIsOperator();

	/**
	 * Returns a new object of class '<em>Gen Predicate Like Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Predicate Like Operator</em>'.
	 * @generated
	 */
	GenPredicateLikeOperator createGenPredicateLikeOperator();

	/**
	 * Returns a new object of class '<em>Gen Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Integer Literal</em>'.
	 * @generated
	 */
	GenIntegerLiteral createGenIntegerLiteral();

	/**
	 * Returns a new object of class '<em>Gen String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen String Literal</em>'.
	 * @generated
	 */
	GenStringLiteral createGenStringLiteral();

	/**
	 * Returns a new object of class '<em>Gen Current Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Current Time</em>'.
	 * @generated
	 */
	GenCurrentTime createGenCurrentTime();

	/**
	 * Returns a new object of class '<em>Gen Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Function</em>'.
	 * @generated
	 */
	GenFunction createGenFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GencriteriaPackage getGencriteriaPackage();

} //GencriteriaFactory
