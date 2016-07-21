/**
 */
package uk.ac.man.cs.mdsd.criteria.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.man.cs.mdsd.criteria.Asc;
import uk.ac.man.cs.mdsd.criteria.BooleanLiteral;
import uk.ac.man.cs.mdsd.criteria.BooleanOperator;
import uk.ac.man.cs.mdsd.criteria.ComparisionOperator;
import uk.ac.man.cs.mdsd.criteria.CriteriaFactory;
import uk.ac.man.cs.mdsd.criteria.CriteriaPackage;
import uk.ac.man.cs.mdsd.criteria.CurrentTime;
import uk.ac.man.cs.mdsd.criteria.Desc;
import uk.ac.man.cs.mdsd.criteria.Expression;
import uk.ac.man.cs.mdsd.criteria.Function;
import uk.ac.man.cs.mdsd.criteria.IntegerLiteral;
import uk.ac.man.cs.mdsd.criteria.Literal;
import uk.ac.man.cs.mdsd.criteria.NullLiteral;
import uk.ac.man.cs.mdsd.criteria.Order;
import uk.ac.man.cs.mdsd.criteria.Path;
import uk.ac.man.cs.mdsd.criteria.Predicate;
import uk.ac.man.cs.mdsd.criteria.PredicateBooleanOperator;
import uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator;
import uk.ac.man.cs.mdsd.criteria.PredicateEqualityOperator;
import uk.ac.man.cs.mdsd.criteria.PredicateIsEmpty;
import uk.ac.man.cs.mdsd.criteria.PredicateIsNull;
import uk.ac.man.cs.mdsd.criteria.PredicateIsOperator;
import uk.ac.man.cs.mdsd.criteria.PredicateLikeOperator;
import uk.ac.man.cs.mdsd.criteria.StringLiteral;
import uk.ac.man.cs.mdsd.criteria.TimeLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CriteriaPackageImpl extends EPackageImpl implements CriteriaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateBooleanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEqualityOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateComparisonOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateIsOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateLikeOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateIsEmptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateIsNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ascEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisionOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CriteriaPackageImpl() {
		super(eNS_URI, CriteriaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CriteriaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CriteriaPackage init() {
		if (isInited) return (CriteriaPackage)EPackage.Registry.INSTANCE.getEPackage(CriteriaPackage.eNS_URI);

		// Obtain or create and register package
		CriteriaPackageImpl theCriteriaPackage = (CriteriaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CriteriaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CriteriaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCriteriaPackage.createPackageContents();

		// Initialize created meta-data
		theCriteriaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCriteriaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CriteriaPackage.eNS_URI, theCriteriaPackage);
		return theCriteriaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullLiteral() {
		return nullLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteral() {
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanLiteral_Value() {
		return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerLiteral() {
		return integerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerLiteral_Value() {
		return (EAttribute)integerLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLiteral() {
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLiteral_Value() {
		return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeLiteral() {
		return timeLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeLiteral_Value() {
		return (EAttribute)timeLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentTime() {
		return currentTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrentTime_Format() {
		return (EAttribute)currentTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Name() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredicate_Negated() {
		return (EAttribute)predicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateBooleanOperator() {
		return predicateBooleanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateBooleanOperator_Expressions() {
		return (EReference)predicateBooleanOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredicateBooleanOperator_Operator() {
		return (EAttribute)predicateBooleanOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateEqualityOperator() {
		return predicateEqualityOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateEqualityOperator_Left() {
		return (EReference)predicateEqualityOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateEqualityOperator_Right() {
		return (EReference)predicateEqualityOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateComparisonOperator() {
		return predicateComparisonOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateComparisonOperator_Left() {
		return (EReference)predicateComparisonOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredicateComparisonOperator_Operator() {
		return (EAttribute)predicateComparisonOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateComparisonOperator_Right() {
		return (EReference)predicateComparisonOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateIsOperator() {
		return predicateIsOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateIsOperator_Left() {
		return (EReference)predicateIsOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateIsOperator_Right() {
		return (EReference)predicateIsOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateLikeOperator() {
		return predicateLikeOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateLikeOperator_Left() {
		return (EReference)predicateLikeOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateLikeOperator_Right() {
		return (EReference)predicateLikeOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateIsEmpty() {
		return predicateIsEmptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateIsEmpty_Feature() {
		return (EReference)predicateIsEmptyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateIsNull() {
		return predicateIsNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateIsNull_Feature() {
		return (EReference)predicateIsNullEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Path() {
		return (EReference)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsc() {
		return ascEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesc() {
		return descEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanOperator() {
		return booleanOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisionOperator() {
		return comparisionOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriaFactory getCriteriaFactory() {
		return (CriteriaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		expressionEClass = createEClass(EXPRESSION);

		literalEClass = createEClass(LITERAL);

		nullLiteralEClass = createEClass(NULL_LITERAL);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
		createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

		integerLiteralEClass = createEClass(INTEGER_LITERAL);
		createEAttribute(integerLiteralEClass, INTEGER_LITERAL__VALUE);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

		timeLiteralEClass = createEClass(TIME_LITERAL);
		createEAttribute(timeLiteralEClass, TIME_LITERAL__VALUE);

		currentTimeEClass = createEClass(CURRENT_TIME);
		createEAttribute(currentTimeEClass, CURRENT_TIME__FORMAT);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__NAME);

		pathEClass = createEClass(PATH);

		predicateEClass = createEClass(PREDICATE);
		createEAttribute(predicateEClass, PREDICATE__NEGATED);

		predicateBooleanOperatorEClass = createEClass(PREDICATE_BOOLEAN_OPERATOR);
		createEReference(predicateBooleanOperatorEClass, PREDICATE_BOOLEAN_OPERATOR__EXPRESSIONS);
		createEAttribute(predicateBooleanOperatorEClass, PREDICATE_BOOLEAN_OPERATOR__OPERATOR);

		predicateEqualityOperatorEClass = createEClass(PREDICATE_EQUALITY_OPERATOR);
		createEReference(predicateEqualityOperatorEClass, PREDICATE_EQUALITY_OPERATOR__LEFT);
		createEReference(predicateEqualityOperatorEClass, PREDICATE_EQUALITY_OPERATOR__RIGHT);

		predicateComparisonOperatorEClass = createEClass(PREDICATE_COMPARISON_OPERATOR);
		createEReference(predicateComparisonOperatorEClass, PREDICATE_COMPARISON_OPERATOR__LEFT);
		createEAttribute(predicateComparisonOperatorEClass, PREDICATE_COMPARISON_OPERATOR__OPERATOR);
		createEReference(predicateComparisonOperatorEClass, PREDICATE_COMPARISON_OPERATOR__RIGHT);

		predicateIsOperatorEClass = createEClass(PREDICATE_IS_OPERATOR);
		createEReference(predicateIsOperatorEClass, PREDICATE_IS_OPERATOR__LEFT);
		createEReference(predicateIsOperatorEClass, PREDICATE_IS_OPERATOR__RIGHT);

		predicateLikeOperatorEClass = createEClass(PREDICATE_LIKE_OPERATOR);
		createEReference(predicateLikeOperatorEClass, PREDICATE_LIKE_OPERATOR__LEFT);
		createEReference(predicateLikeOperatorEClass, PREDICATE_LIKE_OPERATOR__RIGHT);

		predicateIsEmptyEClass = createEClass(PREDICATE_IS_EMPTY);
		createEReference(predicateIsEmptyEClass, PREDICATE_IS_EMPTY__FEATURE);

		predicateIsNullEClass = createEClass(PREDICATE_IS_NULL);
		createEReference(predicateIsNullEClass, PREDICATE_IS_NULL__FEATURE);

		orderEClass = createEClass(ORDER);
		createEReference(orderEClass, ORDER__PATH);

		ascEClass = createEClass(ASC);

		descEClass = createEClass(DESC);

		// Create enums
		booleanOperatorEEnum = createEEnum(BOOLEAN_OPERATOR);
		comparisionOperatorEEnum = createEEnum(COMPARISION_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		literalEClass.getESuperTypes().add(this.getExpression());
		nullLiteralEClass.getESuperTypes().add(this.getLiteral());
		booleanLiteralEClass.getESuperTypes().add(this.getLiteral());
		integerLiteralEClass.getESuperTypes().add(this.getLiteral());
		stringLiteralEClass.getESuperTypes().add(this.getLiteral());
		timeLiteralEClass.getESuperTypes().add(this.getLiteral());
		currentTimeEClass.getESuperTypes().add(this.getLiteral());
		functionEClass.getESuperTypes().add(this.getExpression());
		pathEClass.getESuperTypes().add(this.getExpression());
		predicateEClass.getESuperTypes().add(this.getExpression());
		predicateBooleanOperatorEClass.getESuperTypes().add(this.getPredicate());
		predicateEqualityOperatorEClass.getESuperTypes().add(this.getPredicate());
		predicateComparisonOperatorEClass.getESuperTypes().add(this.getPredicate());
		predicateIsOperatorEClass.getESuperTypes().add(this.getPredicate());
		predicateLikeOperatorEClass.getESuperTypes().add(this.getPredicate());
		predicateIsEmptyEClass.getESuperTypes().add(this.getPredicate());
		predicateIsNullEClass.getESuperTypes().add(this.getPredicate());
		ascEClass.getESuperTypes().add(this.getOrder());
		descEClass.getESuperTypes().add(this.getOrder());

		// Initialize classes, features, and operations; add parameters
		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nullLiteralEClass, NullLiteral.class, "NullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_Value(), theEcorePackage.getEBooleanObject(), "value", null, 1, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerLiteralEClass, IntegerLiteral.class, "IntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerLiteral_Value(), theEcorePackage.getEInt(), "value", null, 1, 1, IntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_Value(), theEcorePackage.getEString(), "value", null, 1, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeLiteralEClass, TimeLiteral.class, "TimeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeLiteral_Value(), theEcorePackage.getEString(), "value", null, 1, 1, TimeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentTimeEClass, CurrentTime.class, "CurrentTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrentTime_Format(), theEcorePackage.getEString(), "format", null, 0, 1, CurrentTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Name(), theEcorePackage.getEString(), "name", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathEClass, Path.class, "Path", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predicateEClass, Predicate.class, "Predicate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredicate_Negated(), theEcorePackage.getEBoolean(), "negated", "false", 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateBooleanOperatorEClass, PredicateBooleanOperator.class, "PredicateBooleanOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateBooleanOperator_Expressions(), this.getPredicate(), null, "expressions", null, 1, -1, PredicateBooleanOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPredicateBooleanOperator_Operator(), this.getBooleanOperator(), "operator", "And", 1, 1, PredicateBooleanOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateEqualityOperatorEClass, PredicateEqualityOperator.class, "PredicateEqualityOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateEqualityOperator_Left(), this.getExpression(), null, "left", null, 1, 1, PredicateEqualityOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateEqualityOperator_Right(), this.getExpression(), null, "right", null, 1, 1, PredicateEqualityOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateComparisonOperatorEClass, PredicateComparisonOperator.class, "PredicateComparisonOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateComparisonOperator_Left(), this.getExpression(), null, "left", null, 1, 1, PredicateComparisonOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPredicateComparisonOperator_Operator(), this.getComparisionOperator(), "operator", null, 1, 1, PredicateComparisonOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateComparisonOperator_Right(), this.getExpression(), null, "right", null, 1, 1, PredicateComparisonOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateIsOperatorEClass, PredicateIsOperator.class, "PredicateIsOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateIsOperator_Left(), this.getExpression(), null, "left", null, 1, 1, PredicateIsOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateIsOperator_Right(), this.getExpression(), null, "right", null, 1, 1, PredicateIsOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateLikeOperatorEClass, PredicateLikeOperator.class, "PredicateLikeOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateLikeOperator_Left(), this.getExpression(), null, "left", null, 1, 1, PredicateLikeOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateLikeOperator_Right(), this.getExpression(), null, "right", null, 1, 1, PredicateLikeOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateIsEmptyEClass, PredicateIsEmpty.class, "PredicateIsEmpty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateIsEmpty_Feature(), this.getPath(), null, "feature", null, 0, 1, PredicateIsEmpty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateIsNullEClass, PredicateIsNull.class, "PredicateIsNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateIsNull_Feature(), this.getPath(), null, "feature", null, 0, 1, PredicateIsNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrder_Path(), this.getPath(), null, "path", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ascEClass, Asc.class, "Asc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descEClass, Desc.class, "Desc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(booleanOperatorEEnum, BooleanOperator.class, "BooleanOperator");
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.AND);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.OR);

		initEEnum(comparisionOperatorEEnum, ComparisionOperator.class, "ComparisionOperator");
		addEEnumLiteral(comparisionOperatorEEnum, ComparisionOperator.GREATER_THAN);
		addEEnumLiteral(comparisionOperatorEEnum, ComparisionOperator.LESS_THAN);

		// Create resource
		createResource(eNS_URI);
	}

} //CriteriaPackageImpl
