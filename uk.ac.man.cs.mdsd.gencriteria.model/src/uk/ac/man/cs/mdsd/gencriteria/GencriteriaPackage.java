/**
 */
package uk.ac.man.cs.mdsd.gencriteria;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaFactory
 * @model kind="package"
 * @generated
 */
public interface GencriteriaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gencriteria";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cs.man.ac.uk/mdsd/2013/GenCriteria";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gencriteria";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GencriteriaPackage eINSTANCE = uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.GenExpression <em>Gen Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenExpression
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenExpression()
	 * @generated
	 */
	int GEN_EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Gen Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateImpl <em>Gen Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateImpl
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPredicate()
	 * @generated
	 */
	int GEN_PREDICATE = 8;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateBooleanOperatorImpl <em>Gen Predicate Boolean Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateBooleanOperatorImpl
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPredicateBooleanOperator()
	 * @generated
	 */
	int GEN_PREDICATE_BOOLEAN_OPERATOR = 9;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateEqualityOperatorImpl <em>Gen Predicate Equality Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateEqualityOperatorImpl
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPredicateEqualityOperator()
	 * @generated
	 */
	int GEN_PREDICATE_EQUALITY_OPERATOR = 10;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateComparisonOperatorImpl <em>Gen Predicate Comparison Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateComparisonOperatorImpl
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPredicateComparisonOperator()
	 * @generated
	 */
	int GEN_PREDICATE_COMPARISON_OPERATOR = 11;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.GenPath <em>Gen Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPath
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPath()
	 * @generated
	 */
	int GEN_PATH = 7;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.GenLiteral <em>Gen Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenLiteral
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenLiteral()
	 * @generated
	 */
	int GEN_LITERAL = 1;

	/**
	 * The number of structural features of the '<em>Gen Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LITERAL_FEATURE_COUNT = GEN_EXPRESSION_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenNullLiteralImpl <em>Gen Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenNullLiteralImpl
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenNullLiteral()
	 * @generated
	 */
	int GEN_NULL_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Criteria Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NULL_LITERAL__CRITERIA_LITERAL = GEN_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_NULL_LITERAL_FEATURE_COUNT = GEN_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenIntegerLiteralImpl <em>Gen Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenIntegerLiteralImpl
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenIntegerLiteral()
	 * @generated
	 */
	int GEN_INTEGER_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Criteria Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INTEGER_LITERAL__CRITERIA_LITERAL = GEN_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INTEGER_LITERAL_FEATURE_COUNT = GEN_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenStringLiteralImpl <em>Gen String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenStringLiteralImpl
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenStringLiteral()
	 * @generated
	 */
	int GEN_STRING_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Criteria Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STRING_LITERAL__CRITERIA_LITERAL = GEN_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STRING_LITERAL_FEATURE_COUNT = GEN_LITERAL_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenCurrentTimeImpl <em>Gen Current Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenCurrentTimeImpl
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenCurrentTime()
	 * @generated
	 */
	int GEN_CURRENT_TIME = 5;

	/**
	 * The feature id for the '<em><b>Criteria Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CURRENT_TIME__CRITERIA_LITERAL = GEN_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Current Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CURRENT_TIME_FEATURE_COUNT = GEN_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenFunctionImpl <em>Gen Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenFunctionImpl
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenFunction()
	 * @generated
	 */
	int GEN_FUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Criteria Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FUNCTION__CRITERIA_FUNCTION = GEN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FUNCTION_FEATURE_COUNT = GEN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PATH_FEATURE_COUNT = GEN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_FEATURE_COUNT = GEN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Criteria Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_BOOLEAN_OPERATOR__CRITERIA_PREDICATE = GEN_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_BOOLEAN_OPERATOR__GEN_EXPRESSIONS = GEN_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Predicate Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_BOOLEAN_OPERATOR_FEATURE_COUNT = GEN_PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Criteria Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_EQUALITY_OPERATOR__CRITERIA_PREDICATE = GEN_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_EQUALITY_OPERATOR__GEN_LEFT = GEN_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_EQUALITY_OPERATOR__GEN_RIGHT = GEN_PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Predicate Equality Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_EQUALITY_OPERATOR_FEATURE_COUNT = GEN_PREDICATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Criteria Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_COMPARISON_OPERATOR__CRITERIA_PREDICATE = GEN_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_COMPARISON_OPERATOR__GEN_LEFT = GEN_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_COMPARISON_OPERATOR__GEN_RIGHT = GEN_PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Predicate Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_COMPARISON_OPERATOR_FEATURE_COUNT = GEN_PREDICATE_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateIsEmptyImpl <em>Gen Predicate Is Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateIsEmptyImpl
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPredicateIsEmpty()
	 * @generated
	 */
	int GEN_PREDICATE_IS_EMPTY = 12;

	/**
	 * The feature id for the '<em><b>Criteria Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_IS_EMPTY__CRITERIA_PREDICATE = GEN_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_IS_EMPTY__GEN_FEATURE = GEN_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Predicate Is Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_IS_EMPTY_FEATURE_COUNT = GEN_PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenOrderImpl <em>Gen Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenOrderImpl
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenOrder()
	 * @generated
	 */
	int GEN_ORDER = 13;

	/**
	 * The feature id for the '<em><b>Criteria Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORDER__CRITERIA_ORDER = 0;

	/**
	 * The feature id for the '<em><b>Gen Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORDER__GEN_PATH = 1;

	/**
	 * The number of structural features of the '<em>Gen Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORDER_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateIsOperatorImpl <em>Gen Predicate Is Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateIsOperatorImpl
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPredicateIsOperator()
	 * @generated
	 */
	int GEN_PREDICATE_IS_OPERATOR = 14;

	/**
	 * The feature id for the '<em><b>Criteria Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_IS_OPERATOR__CRITERIA_PREDICATE = GEN_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_IS_OPERATOR__GEN_LEFT = GEN_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_IS_OPERATOR__GEN_RIGHT = GEN_PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Predicate Is Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_IS_OPERATOR_FEATURE_COUNT = GEN_PREDICATE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateLikeOperatorImpl <em>Gen Predicate Like Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateLikeOperatorImpl
	 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPredicateLikeOperator()
	 * @generated
	 */
	int GEN_PREDICATE_LIKE_OPERATOR = 15;

	/**
	 * The feature id for the '<em><b>Criteria Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_LIKE_OPERATOR__CRITERIA_PREDICATE = GEN_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_LIKE_OPERATOR__GEN_LEFT = GEN_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_LIKE_OPERATOR__GEN_RIGHT = GEN_PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Predicate Like Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PREDICATE_LIKE_OPERATOR_FEATURE_COUNT = GEN_PREDICATE_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenExpression <em>Gen Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Expression</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenExpression
	 * @generated
	 */
	EClass getGenExpression();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicate <em>Gen Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Predicate</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicate
	 * @generated
	 */
	EClass getGenPredicate();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateBooleanOperator <em>Gen Predicate Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Predicate Boolean Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateBooleanOperator
	 * @generated
	 */
	EClass getGenPredicateBooleanOperator();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateBooleanOperator#getCriteriaPredicate <em>Criteria Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Predicate</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateBooleanOperator#getCriteriaPredicate()
	 * @see #getGenPredicateBooleanOperator()
	 * @generated
	 */
	EReference getGenPredicateBooleanOperator_CriteriaPredicate();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateBooleanOperator#getGenExpressions <em>Gen Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Expressions</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateBooleanOperator#getGenExpressions()
	 * @see #getGenPredicateBooleanOperator()
	 * @generated
	 */
	EReference getGenPredicateBooleanOperator_GenExpressions();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateEqualityOperator <em>Gen Predicate Equality Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Predicate Equality Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateEqualityOperator
	 * @generated
	 */
	EClass getGenPredicateEqualityOperator();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateEqualityOperator#getCriteriaPredicate <em>Criteria Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Predicate</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateEqualityOperator#getCriteriaPredicate()
	 * @see #getGenPredicateEqualityOperator()
	 * @generated
	 */
	EReference getGenPredicateEqualityOperator_CriteriaPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateEqualityOperator#getGenLeft <em>Gen Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Left</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateEqualityOperator#getGenLeft()
	 * @see #getGenPredicateEqualityOperator()
	 * @generated
	 */
	EReference getGenPredicateEqualityOperator_GenLeft();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateEqualityOperator#getGenRight <em>Gen Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Right</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateEqualityOperator#getGenRight()
	 * @see #getGenPredicateEqualityOperator()
	 * @generated
	 */
	EReference getGenPredicateEqualityOperator_GenRight();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator <em>Gen Predicate Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Predicate Comparison Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator
	 * @generated
	 */
	EClass getGenPredicateComparisonOperator();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator#getCriteriaPredicate <em>Criteria Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Predicate</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator#getCriteriaPredicate()
	 * @see #getGenPredicateComparisonOperator()
	 * @generated
	 */
	EReference getGenPredicateComparisonOperator_CriteriaPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator#getGenLeft <em>Gen Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Left</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator#getGenLeft()
	 * @see #getGenPredicateComparisonOperator()
	 * @generated
	 */
	EReference getGenPredicateComparisonOperator_GenLeft();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator#getGenRight <em>Gen Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Right</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator#getGenRight()
	 * @see #getGenPredicateComparisonOperator()
	 * @generated
	 */
	EReference getGenPredicateComparisonOperator_GenRight();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsEmpty <em>Gen Predicate Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Predicate Is Empty</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsEmpty
	 * @generated
	 */
	EClass getGenPredicateIsEmpty();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsEmpty#getCriteriaPredicate <em>Criteria Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Predicate</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsEmpty#getCriteriaPredicate()
	 * @see #getGenPredicateIsEmpty()
	 * @generated
	 */
	EReference getGenPredicateIsEmpty_CriteriaPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsEmpty#getGenFeature <em>Gen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsEmpty#getGenFeature()
	 * @see #getGenPredicateIsEmpty()
	 * @generated
	 */
	EReference getGenPredicateIsEmpty_GenFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenOrder <em>Gen Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Order</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenOrder
	 * @generated
	 */
	EClass getGenOrder();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenOrder#getCriteriaOrder <em>Criteria Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Order</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenOrder#getCriteriaOrder()
	 * @see #getGenOrder()
	 * @generated
	 */
	EReference getGenOrder_CriteriaOrder();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenOrder#getGenPath <em>Gen Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Path</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenOrder#getGenPath()
	 * @see #getGenOrder()
	 * @generated
	 */
	EReference getGenOrder_GenPath();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator <em>Gen Predicate Is Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Predicate Is Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator
	 * @generated
	 */
	EClass getGenPredicateIsOperator();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator#getCriteriaPredicate <em>Criteria Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Predicate</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator#getCriteriaPredicate()
	 * @see #getGenPredicateIsOperator()
	 * @generated
	 */
	EReference getGenPredicateIsOperator_CriteriaPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator#getGenLeft <em>Gen Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Left</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator#getGenLeft()
	 * @see #getGenPredicateIsOperator()
	 * @generated
	 */
	EReference getGenPredicateIsOperator_GenLeft();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator#getGenRight <em>Gen Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Right</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator#getGenRight()
	 * @see #getGenPredicateIsOperator()
	 * @generated
	 */
	EReference getGenPredicateIsOperator_GenRight();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateLikeOperator <em>Gen Predicate Like Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Predicate Like Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateLikeOperator
	 * @generated
	 */
	EClass getGenPredicateLikeOperator();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateLikeOperator#getCriteriaPredicate <em>Criteria Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Predicate</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateLikeOperator#getCriteriaPredicate()
	 * @see #getGenPredicateLikeOperator()
	 * @generated
	 */
	EReference getGenPredicateLikeOperator_CriteriaPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateLikeOperator#getGenLeft <em>Gen Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Left</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateLikeOperator#getGenLeft()
	 * @see #getGenPredicateLikeOperator()
	 * @generated
	 */
	EReference getGenPredicateLikeOperator_GenLeft();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateLikeOperator#getGenRight <em>Gen Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Right</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateLikeOperator#getGenRight()
	 * @see #getGenPredicateLikeOperator()
	 * @generated
	 */
	EReference getGenPredicateLikeOperator_GenRight();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPath <em>Gen Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Path</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPath
	 * @generated
	 */
	EClass getGenPath();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenLiteral <em>Gen Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenLiteral
	 * @generated
	 */
	EClass getGenLiteral();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenNullLiteral <em>Gen Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Null Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenNullLiteral
	 * @generated
	 */
	EClass getGenNullLiteral();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenNullLiteral#getCriteriaLiteral <em>Criteria Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenNullLiteral#getCriteriaLiteral()
	 * @see #getGenNullLiteral()
	 * @generated
	 */
	EReference getGenNullLiteral_CriteriaLiteral();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenIntegerLiteral <em>Gen Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Integer Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenIntegerLiteral
	 * @generated
	 */
	EClass getGenIntegerLiteral();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenIntegerLiteral#getCriteriaLiteral <em>Criteria Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenIntegerLiteral#getCriteriaLiteral()
	 * @see #getGenIntegerLiteral()
	 * @generated
	 */
	EReference getGenIntegerLiteral_CriteriaLiteral();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenStringLiteral <em>Gen String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen String Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenStringLiteral
	 * @generated
	 */
	EClass getGenStringLiteral();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenStringLiteral#getCriteriaLiteral <em>Criteria Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenStringLiteral#getCriteriaLiteral()
	 * @see #getGenStringLiteral()
	 * @generated
	 */
	EReference getGenStringLiteral_CriteriaLiteral();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenCurrentTime <em>Gen Current Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Current Time</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenCurrentTime
	 * @generated
	 */
	EClass getGenCurrentTime();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenCurrentTime#getCriteriaLiteral <em>Criteria Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenCurrentTime#getCriteriaLiteral()
	 * @see #getGenCurrentTime()
	 * @generated
	 */
	EReference getGenCurrentTime_CriteriaLiteral();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.gencriteria.GenFunction <em>Gen Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Function</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenFunction
	 * @generated
	 */
	EClass getGenFunction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.gencriteria.GenFunction#getCriteriaFunction <em>Criteria Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Function</em>'.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenFunction#getCriteriaFunction()
	 * @see #getGenFunction()
	 * @generated
	 */
	EReference getGenFunction_CriteriaFunction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GencriteriaFactory getGencriteriaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.GenExpression <em>Gen Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.GenExpression
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenExpression()
		 * @generated
		 */
		EClass GEN_EXPRESSION = eINSTANCE.getGenExpression();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateImpl <em>Gen Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateImpl
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPredicate()
		 * @generated
		 */
		EClass GEN_PREDICATE = eINSTANCE.getGenPredicate();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateBooleanOperatorImpl <em>Gen Predicate Boolean Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateBooleanOperatorImpl
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPredicateBooleanOperator()
		 * @generated
		 */
		EClass GEN_PREDICATE_BOOLEAN_OPERATOR = eINSTANCE.getGenPredicateBooleanOperator();

		/**
		 * The meta object literal for the '<em><b>Criteria Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_BOOLEAN_OPERATOR__CRITERIA_PREDICATE = eINSTANCE.getGenPredicateBooleanOperator_CriteriaPredicate();

		/**
		 * The meta object literal for the '<em><b>Gen Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_BOOLEAN_OPERATOR__GEN_EXPRESSIONS = eINSTANCE.getGenPredicateBooleanOperator_GenExpressions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateEqualityOperatorImpl <em>Gen Predicate Equality Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateEqualityOperatorImpl
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPredicateEqualityOperator()
		 * @generated
		 */
		EClass GEN_PREDICATE_EQUALITY_OPERATOR = eINSTANCE.getGenPredicateEqualityOperator();

		/**
		 * The meta object literal for the '<em><b>Criteria Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_EQUALITY_OPERATOR__CRITERIA_PREDICATE = eINSTANCE.getGenPredicateEqualityOperator_CriteriaPredicate();

		/**
		 * The meta object literal for the '<em><b>Gen Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_EQUALITY_OPERATOR__GEN_LEFT = eINSTANCE.getGenPredicateEqualityOperator_GenLeft();

		/**
		 * The meta object literal for the '<em><b>Gen Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_EQUALITY_OPERATOR__GEN_RIGHT = eINSTANCE.getGenPredicateEqualityOperator_GenRight();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateComparisonOperatorImpl <em>Gen Predicate Comparison Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateComparisonOperatorImpl
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPredicateComparisonOperator()
		 * @generated
		 */
		EClass GEN_PREDICATE_COMPARISON_OPERATOR = eINSTANCE.getGenPredicateComparisonOperator();

		/**
		 * The meta object literal for the '<em><b>Criteria Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_COMPARISON_OPERATOR__CRITERIA_PREDICATE = eINSTANCE.getGenPredicateComparisonOperator_CriteriaPredicate();

		/**
		 * The meta object literal for the '<em><b>Gen Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_COMPARISON_OPERATOR__GEN_LEFT = eINSTANCE.getGenPredicateComparisonOperator_GenLeft();

		/**
		 * The meta object literal for the '<em><b>Gen Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_COMPARISON_OPERATOR__GEN_RIGHT = eINSTANCE.getGenPredicateComparisonOperator_GenRight();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateIsEmptyImpl <em>Gen Predicate Is Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateIsEmptyImpl
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPredicateIsEmpty()
		 * @generated
		 */
		EClass GEN_PREDICATE_IS_EMPTY = eINSTANCE.getGenPredicateIsEmpty();

		/**
		 * The meta object literal for the '<em><b>Criteria Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_IS_EMPTY__CRITERIA_PREDICATE = eINSTANCE.getGenPredicateIsEmpty_CriteriaPredicate();

		/**
		 * The meta object literal for the '<em><b>Gen Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_IS_EMPTY__GEN_FEATURE = eINSTANCE.getGenPredicateIsEmpty_GenFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenOrderImpl <em>Gen Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenOrderImpl
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenOrder()
		 * @generated
		 */
		EClass GEN_ORDER = eINSTANCE.getGenOrder();

		/**
		 * The meta object literal for the '<em><b>Criteria Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ORDER__CRITERIA_ORDER = eINSTANCE.getGenOrder_CriteriaOrder();

		/**
		 * The meta object literal for the '<em><b>Gen Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ORDER__GEN_PATH = eINSTANCE.getGenOrder_GenPath();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateIsOperatorImpl <em>Gen Predicate Is Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateIsOperatorImpl
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPredicateIsOperator()
		 * @generated
		 */
		EClass GEN_PREDICATE_IS_OPERATOR = eINSTANCE.getGenPredicateIsOperator();

		/**
		 * The meta object literal for the '<em><b>Criteria Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_IS_OPERATOR__CRITERIA_PREDICATE = eINSTANCE.getGenPredicateIsOperator_CriteriaPredicate();

		/**
		 * The meta object literal for the '<em><b>Gen Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_IS_OPERATOR__GEN_LEFT = eINSTANCE.getGenPredicateIsOperator_GenLeft();

		/**
		 * The meta object literal for the '<em><b>Gen Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_IS_OPERATOR__GEN_RIGHT = eINSTANCE.getGenPredicateIsOperator_GenRight();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateLikeOperatorImpl <em>Gen Predicate Like Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateLikeOperatorImpl
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPredicateLikeOperator()
		 * @generated
		 */
		EClass GEN_PREDICATE_LIKE_OPERATOR = eINSTANCE.getGenPredicateLikeOperator();

		/**
		 * The meta object literal for the '<em><b>Criteria Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_LIKE_OPERATOR__CRITERIA_PREDICATE = eINSTANCE.getGenPredicateLikeOperator_CriteriaPredicate();

		/**
		 * The meta object literal for the '<em><b>Gen Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_LIKE_OPERATOR__GEN_LEFT = eINSTANCE.getGenPredicateLikeOperator_GenLeft();

		/**
		 * The meta object literal for the '<em><b>Gen Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PREDICATE_LIKE_OPERATOR__GEN_RIGHT = eINSTANCE.getGenPredicateLikeOperator_GenRight();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.GenPath <em>Gen Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.GenPath
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenPath()
		 * @generated
		 */
		EClass GEN_PATH = eINSTANCE.getGenPath();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.GenLiteral <em>Gen Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.GenLiteral
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenLiteral()
		 * @generated
		 */
		EClass GEN_LITERAL = eINSTANCE.getGenLiteral();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenNullLiteralImpl <em>Gen Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenNullLiteralImpl
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenNullLiteral()
		 * @generated
		 */
		EClass GEN_NULL_LITERAL = eINSTANCE.getGenNullLiteral();

		/**
		 * The meta object literal for the '<em><b>Criteria Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_NULL_LITERAL__CRITERIA_LITERAL = eINSTANCE.getGenNullLiteral_CriteriaLiteral();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenIntegerLiteralImpl <em>Gen Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenIntegerLiteralImpl
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenIntegerLiteral()
		 * @generated
		 */
		EClass GEN_INTEGER_LITERAL = eINSTANCE.getGenIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Criteria Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_INTEGER_LITERAL__CRITERIA_LITERAL = eINSTANCE.getGenIntegerLiteral_CriteriaLiteral();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenStringLiteralImpl <em>Gen String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenStringLiteralImpl
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenStringLiteral()
		 * @generated
		 */
		EClass GEN_STRING_LITERAL = eINSTANCE.getGenStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Criteria Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_STRING_LITERAL__CRITERIA_LITERAL = eINSTANCE.getGenStringLiteral_CriteriaLiteral();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenCurrentTimeImpl <em>Gen Current Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenCurrentTimeImpl
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenCurrentTime()
		 * @generated
		 */
		EClass GEN_CURRENT_TIME = eINSTANCE.getGenCurrentTime();

		/**
		 * The meta object literal for the '<em><b>Criteria Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CURRENT_TIME__CRITERIA_LITERAL = eINSTANCE.getGenCurrentTime_CriteriaLiteral();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenFunctionImpl <em>Gen Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GenFunctionImpl
		 * @see uk.ac.man.cs.mdsd.gencriteria.impl.GencriteriaPackageImpl#getGenFunction()
		 * @generated
		 */
		EClass GEN_FUNCTION = eINSTANCE.getGenFunction();

		/**
		 * The meta object literal for the '<em><b>Criteria Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_FUNCTION__CRITERIA_FUNCTION = eINSTANCE.getGenFunction_CriteriaFunction();

	}

} //GencriteriaPackage
