/**
 */
package uk.ac.man.cs.mdsd.criteria;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.criteria.CriteriaFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel editDirectory='/uk.ac.man.cs.mdsd.criteria.edit/src' editPluginID='uk.ac.man.cs.mdsd.criteria.edit' extensibleProviderFactory='true' basePackage='uk.ac.man.cs.mdsd'"
 * @generated
 */
public interface CriteriaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "criteria";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cs.man.ac.uk/mdsd/2013/Criteria";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "criteria";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CriteriaPackage eINSTANCE = uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.Expression
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.Literal <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.Literal
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.NullLiteralImpl <em>Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.NullLiteralImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getNullLiteral()
	 * @generated
	 */
	int NULL_LITERAL = 2;

	/**
	 * The number of structural features of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.BooleanLiteralImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.IntegerLiteralImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.StringLiteralImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.TimeLiteralImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getTimeLiteral()
	 * @generated
	 */
	int TIME_LITERAL = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.CurrentTimeImpl <em>Current Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CurrentTimeImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getCurrentTime()
	 * @generated
	 */
	int CURRENT_TIME = 7;

	/**
	 * The number of structural features of the '<em>Current Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Current Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.FunctionImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.Path <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.Path
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 9;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.PredicateImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 10;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__NEGATED = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.PredicateBooleanOperatorImpl <em>Predicate Boolean Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.PredicateBooleanOperatorImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPredicateBooleanOperator()
	 * @generated
	 */
	int PREDICATE_BOOLEAN_OPERATOR = 11;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR__EXPRESSIONS = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR__OPERATOR = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.PredicateEqualityOperatorImpl <em>Predicate Equality Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.PredicateEqualityOperatorImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPredicateEqualityOperator()
	 * @generated
	 */
	int PREDICATE_EQUALITY_OPERATOR = 12;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR__LEFT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR__RIGHT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Equality Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate Equality Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.PredicateComparisonOperatorImpl <em>Predicate Comparison Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.PredicateComparisonOperatorImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPredicateComparisonOperator()
	 * @generated
	 */
	int PREDICATE_COMPARISON_OPERATOR = 13;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR__LEFT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR__OPERATOR = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR__RIGHT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Predicate Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Predicate Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.PredicateIsOperatorImpl <em>Predicate Is Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.PredicateIsOperatorImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPredicateIsOperator()
	 * @generated
	 */
	int PREDICATE_IS_OPERATOR = 14;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR__LEFT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR__RIGHT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Is Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate Is Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.PredicateLikeOperatorImpl <em>Predicate Like Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.PredicateLikeOperatorImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPredicateLikeOperator()
	 * @generated
	 */
	int PREDICATE_LIKE_OPERATOR = 15;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR__LEFT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR__RIGHT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Like Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate Like Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.PredicateIsEmptyImpl <em>Predicate Is Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.PredicateIsEmptyImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPredicateIsEmpty()
	 * @generated
	 */
	int PREDICATE_IS_EMPTY = 16;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_EMPTY__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_EMPTY__FEATURE = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicate Is Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_EMPTY_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predicate Is Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_EMPTY_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.OrderImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 17;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PATH = 0;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.AscImpl <em>Asc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.AscImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getAsc()
	 * @generated
	 */
	int ASC = 18;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC__PATH = ORDER__PATH;

	/**
	 * The number of structural features of the '<em>Asc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC_FEATURE_COUNT = ORDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC_OPERATION_COUNT = ORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.impl.DescImpl <em>Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.impl.DescImpl
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getDesc()
	 * @generated
	 */
	int DESC = 19;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC__PATH = ORDER__PATH;

	/**
	 * The number of structural features of the '<em>Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC_FEATURE_COUNT = ORDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC_OPERATION_COUNT = ORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.BooleanOperator
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 20;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.criteria.ComparisionOperator <em>Comparision Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.criteria.ComparisionOperator
	 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getComparisionOperator()
	 * @generated
	 */
	int COMPARISION_OPERATOR = 21;


	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.NullLiteral
	 * @generated
	 */
	EClass getNullLiteral();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.criteria.BooleanLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.BooleanLiteral#getValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.criteria.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.criteria.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.TimeLiteral <em>Time Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Literal</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.TimeLiteral
	 * @generated
	 */
	EClass getTimeLiteral();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.criteria.TimeLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.TimeLiteral#getValue()
	 * @see #getTimeLiteral()
	 * @generated
	 */
	EAttribute getTimeLiteral_Value();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.CurrentTime <em>Current Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Time</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.CurrentTime
	 * @generated
	 */
	EClass getCurrentTime();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.criteria.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.criteria.Predicate#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.Predicate#isNegated()
	 * @see #getPredicate()
	 * @generated
	 */
	EAttribute getPredicate_Negated();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.PredicateBooleanOperator <em>Predicate Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Boolean Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateBooleanOperator
	 * @generated
	 */
	EClass getPredicateBooleanOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.criteria.PredicateBooleanOperator#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateBooleanOperator#getExpressions()
	 * @see #getPredicateBooleanOperator()
	 * @generated
	 */
	EReference getPredicateBooleanOperator_Expressions();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.criteria.PredicateBooleanOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateBooleanOperator#getOperator()
	 * @see #getPredicateBooleanOperator()
	 * @generated
	 */
	EAttribute getPredicateBooleanOperator_Operator();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.PredicateEqualityOperator <em>Predicate Equality Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Equality Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateEqualityOperator
	 * @generated
	 */
	EClass getPredicateEqualityOperator();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.criteria.PredicateEqualityOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateEqualityOperator#getLeft()
	 * @see #getPredicateEqualityOperator()
	 * @generated
	 */
	EReference getPredicateEqualityOperator_Left();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.criteria.PredicateEqualityOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateEqualityOperator#getRight()
	 * @see #getPredicateEqualityOperator()
	 * @generated
	 */
	EReference getPredicateEqualityOperator_Right();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator <em>Predicate Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Comparison Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator
	 * @generated
	 */
	EClass getPredicateComparisonOperator();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator#getLeft()
	 * @see #getPredicateComparisonOperator()
	 * @generated
	 */
	EReference getPredicateComparisonOperator_Left();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator#getOperator()
	 * @see #getPredicateComparisonOperator()
	 * @generated
	 */
	EAttribute getPredicateComparisonOperator_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator#getRight()
	 * @see #getPredicateComparisonOperator()
	 * @generated
	 */
	EReference getPredicateComparisonOperator_Right();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.PredicateIsOperator <em>Predicate Is Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Is Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateIsOperator
	 * @generated
	 */
	EClass getPredicateIsOperator();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.criteria.PredicateIsOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateIsOperator#getLeft()
	 * @see #getPredicateIsOperator()
	 * @generated
	 */
	EReference getPredicateIsOperator_Left();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.criteria.PredicateIsOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateIsOperator#getRight()
	 * @see #getPredicateIsOperator()
	 * @generated
	 */
	EReference getPredicateIsOperator_Right();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.PredicateLikeOperator <em>Predicate Like Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Like Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateLikeOperator
	 * @generated
	 */
	EClass getPredicateLikeOperator();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.criteria.PredicateLikeOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateLikeOperator#getLeft()
	 * @see #getPredicateLikeOperator()
	 * @generated
	 */
	EReference getPredicateLikeOperator_Left();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.criteria.PredicateLikeOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateLikeOperator#getRight()
	 * @see #getPredicateLikeOperator()
	 * @generated
	 */
	EReference getPredicateLikeOperator_Right();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.PredicateIsEmpty <em>Predicate Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Is Empty</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateIsEmpty
	 * @generated
	 */
	EClass getPredicateIsEmpty();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.criteria.PredicateIsEmpty#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.PredicateIsEmpty#getFeature()
	 * @see #getPredicateIsEmpty()
	 * @generated
	 */
	EReference getPredicateIsEmpty_Feature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.criteria.Order#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.Order#getPath()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Path();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.Asc <em>Asc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asc</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.Asc
	 * @generated
	 */
	EClass getAsc();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.criteria.Desc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desc</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.Desc
	 * @generated
	 */
	EClass getDesc();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.criteria.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.criteria.ComparisionOperator <em>Comparision Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparision Operator</em>'.
	 * @see uk.ac.man.cs.mdsd.criteria.ComparisionOperator
	 * @generated
	 */
	EEnum getComparisionOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CriteriaFactory getCriteriaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.Expression <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.Expression
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.Literal <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.Literal
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.NullLiteralImpl <em>Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.NullLiteralImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getNullLiteral()
		 * @generated
		 */
		EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.BooleanLiteralImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.IntegerLiteralImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.StringLiteralImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.TimeLiteralImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getTimeLiteral()
		 * @generated
		 */
		EClass TIME_LITERAL = eINSTANCE.getTimeLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LITERAL__VALUE = eINSTANCE.getTimeLiteral_Value();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.CurrentTimeImpl <em>Current Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CurrentTimeImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getCurrentTime()
		 * @generated
		 */
		EClass CURRENT_TIME = eINSTANCE.getCurrentTime();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.FunctionImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.Path <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.Path
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.PredicateImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE__NEGATED = eINSTANCE.getPredicate_Negated();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.PredicateBooleanOperatorImpl <em>Predicate Boolean Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.PredicateBooleanOperatorImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPredicateBooleanOperator()
		 * @generated
		 */
		EClass PREDICATE_BOOLEAN_OPERATOR = eINSTANCE.getPredicateBooleanOperator();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_BOOLEAN_OPERATOR__EXPRESSIONS = eINSTANCE.getPredicateBooleanOperator_Expressions();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE_BOOLEAN_OPERATOR__OPERATOR = eINSTANCE.getPredicateBooleanOperator_Operator();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.PredicateEqualityOperatorImpl <em>Predicate Equality Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.PredicateEqualityOperatorImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPredicateEqualityOperator()
		 * @generated
		 */
		EClass PREDICATE_EQUALITY_OPERATOR = eINSTANCE.getPredicateEqualityOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_EQUALITY_OPERATOR__LEFT = eINSTANCE.getPredicateEqualityOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_EQUALITY_OPERATOR__RIGHT = eINSTANCE.getPredicateEqualityOperator_Right();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.PredicateComparisonOperatorImpl <em>Predicate Comparison Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.PredicateComparisonOperatorImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPredicateComparisonOperator()
		 * @generated
		 */
		EClass PREDICATE_COMPARISON_OPERATOR = eINSTANCE.getPredicateComparisonOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_COMPARISON_OPERATOR__LEFT = eINSTANCE.getPredicateComparisonOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE_COMPARISON_OPERATOR__OPERATOR = eINSTANCE.getPredicateComparisonOperator_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_COMPARISON_OPERATOR__RIGHT = eINSTANCE.getPredicateComparisonOperator_Right();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.PredicateIsOperatorImpl <em>Predicate Is Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.PredicateIsOperatorImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPredicateIsOperator()
		 * @generated
		 */
		EClass PREDICATE_IS_OPERATOR = eINSTANCE.getPredicateIsOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IS_OPERATOR__LEFT = eINSTANCE.getPredicateIsOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IS_OPERATOR__RIGHT = eINSTANCE.getPredicateIsOperator_Right();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.PredicateLikeOperatorImpl <em>Predicate Like Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.PredicateLikeOperatorImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPredicateLikeOperator()
		 * @generated
		 */
		EClass PREDICATE_LIKE_OPERATOR = eINSTANCE.getPredicateLikeOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_LIKE_OPERATOR__LEFT = eINSTANCE.getPredicateLikeOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_LIKE_OPERATOR__RIGHT = eINSTANCE.getPredicateLikeOperator_Right();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.PredicateIsEmptyImpl <em>Predicate Is Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.PredicateIsEmptyImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getPredicateIsEmpty()
		 * @generated
		 */
		EClass PREDICATE_IS_EMPTY = eINSTANCE.getPredicateIsEmpty();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IS_EMPTY__FEATURE = eINSTANCE.getPredicateIsEmpty_Feature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.OrderImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__PATH = eINSTANCE.getOrder_Path();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.AscImpl <em>Asc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.AscImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getAsc()
		 * @generated
		 */
		EClass ASC = eINSTANCE.getAsc();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.impl.DescImpl <em>Desc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.impl.DescImpl
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getDesc()
		 * @generated
		 */
		EClass DESC = eINSTANCE.getDesc();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.BooleanOperator
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.criteria.ComparisionOperator <em>Comparision Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.criteria.ComparisionOperator
		 * @see uk.ac.man.cs.mdsd.criteria.impl.CriteriaPackageImpl#getComparisionOperator()
		 * @generated
		 */
		EEnum COMPARISION_OPERATOR = eINSTANCE.getComparisionOperator();

	}

} //CriteriaPackage
