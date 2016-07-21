/**
 */
package uk.ac.man.cs.mdsd.criteria;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage
 * @generated
 */
public interface CriteriaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CriteriaFactory eINSTANCE = uk.ac.man.cs.mdsd.criteria.impl.CriteriaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Literal</em>'.
	 * @generated
	 */
	NullLiteral createNullLiteral();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Literal</em>'.
	 * @generated
	 */
	IntegerLiteral createIntegerLiteral();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Time Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Literal</em>'.
	 * @generated
	 */
	TimeLiteral createTimeLiteral();

	/**
	 * Returns a new object of class '<em>Current Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Time</em>'.
	 * @generated
	 */
	CurrentTime createCurrentTime();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Predicate Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Boolean Operator</em>'.
	 * @generated
	 */
	PredicateBooleanOperator createPredicateBooleanOperator();

	/**
	 * Returns a new object of class '<em>Predicate Equality Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Equality Operator</em>'.
	 * @generated
	 */
	PredicateEqualityOperator createPredicateEqualityOperator();

	/**
	 * Returns a new object of class '<em>Predicate Comparison Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Comparison Operator</em>'.
	 * @generated
	 */
	PredicateComparisonOperator createPredicateComparisonOperator();

	/**
	 * Returns a new object of class '<em>Predicate Is Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Is Operator</em>'.
	 * @generated
	 */
	PredicateIsOperator createPredicateIsOperator();

	/**
	 * Returns a new object of class '<em>Predicate Like Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Like Operator</em>'.
	 * @generated
	 */
	PredicateLikeOperator createPredicateLikeOperator();

	/**
	 * Returns a new object of class '<em>Predicate Is Empty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Is Empty</em>'.
	 * @generated
	 */
	PredicateIsEmpty createPredicateIsEmpty();

	/**
	 * Returns a new object of class '<em>Predicate Is Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Is Null</em>'.
	 * @generated
	 */
	PredicateIsNull createPredicateIsNull();

	/**
	 * Returns a new object of class '<em>Asc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asc</em>'.
	 * @generated
	 */
	Asc createAsc();

	/**
	 * Returns a new object of class '<em>Desc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desc</em>'.
	 * @generated
	 */
	Desc createDesc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CriteriaPackage getCriteriaPackage();

} //CriteriaFactory
