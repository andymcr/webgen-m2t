/**
 */
package uk.ac.man.cs.mdsd.gencriteria.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.man.cs.mdsd.criteria.CriteriaPackage;

import uk.ac.man.cs.mdsd.gencriteria.GenCurrentTime;
import uk.ac.man.cs.mdsd.gencriteria.GenExpression;
import uk.ac.man.cs.mdsd.gencriteria.GenFunction;
import uk.ac.man.cs.mdsd.gencriteria.GenIntegerLiteral;
import uk.ac.man.cs.mdsd.gencriteria.GenLiteral;
import uk.ac.man.cs.mdsd.gencriteria.GenNullLiteral;
import uk.ac.man.cs.mdsd.gencriteria.GenOrder;
import uk.ac.man.cs.mdsd.gencriteria.GenPath;
import uk.ac.man.cs.mdsd.gencriteria.GenPredicate;
import uk.ac.man.cs.mdsd.gencriteria.GenPredicateBooleanOperator;
import uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator;
import uk.ac.man.cs.mdsd.gencriteria.GenPredicateEqualityOperator;
import uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsEmpty;
import uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator;
import uk.ac.man.cs.mdsd.gencriteria.GenPredicateLikeOperator;
import uk.ac.man.cs.mdsd.gencriteria.GenStringLiteral;
import uk.ac.man.cs.mdsd.gencriteria.GencriteriaFactory;
import uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GencriteriaPackageImpl extends EPackageImpl implements GencriteriaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPredicateBooleanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPredicateEqualityOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPredicateComparisonOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPredicateIsEmptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPredicateIsOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPredicateLikeOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genNullLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genIntegerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genStringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCurrentTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFunctionEClass = null;

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
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GencriteriaPackageImpl() {
		super(eNS_URI, GencriteriaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GencriteriaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GencriteriaPackage init() {
		if (isInited) return (GencriteriaPackage)EPackage.Registry.INSTANCE.getEPackage(GencriteriaPackage.eNS_URI);

		// Obtain or create and register package
		GencriteriaPackageImpl theGencriteriaPackage = (GencriteriaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GencriteriaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GencriteriaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CriteriaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGencriteriaPackage.createPackageContents();

		// Initialize created meta-data
		theGencriteriaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGencriteriaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GencriteriaPackage.eNS_URI, theGencriteriaPackage);
		return theGencriteriaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenExpression() {
		return genExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPredicate() {
		return genPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPredicateBooleanOperator() {
		return genPredicateBooleanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateBooleanOperator_CriteriaPredicate() {
		return (EReference)genPredicateBooleanOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateBooleanOperator_GenExpressions() {
		return (EReference)genPredicateBooleanOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPredicateEqualityOperator() {
		return genPredicateEqualityOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateEqualityOperator_CriteriaPredicate() {
		return (EReference)genPredicateEqualityOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateEqualityOperator_GenLeft() {
		return (EReference)genPredicateEqualityOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateEqualityOperator_GenRight() {
		return (EReference)genPredicateEqualityOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPredicateComparisonOperator() {
		return genPredicateComparisonOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateComparisonOperator_CriteriaPredicate() {
		return (EReference)genPredicateComparisonOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateComparisonOperator_GenLeft() {
		return (EReference)genPredicateComparisonOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateComparisonOperator_GenRight() {
		return (EReference)genPredicateComparisonOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPredicateIsEmpty() {
		return genPredicateIsEmptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateIsEmpty_CriteriaPredicate() {
		return (EReference)genPredicateIsEmptyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateIsEmpty_GenFeature() {
		return (EReference)genPredicateIsEmptyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenOrder() {
		return genOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenOrder_CriteriaOrder() {
		return (EReference)genOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenOrder_GenPath() {
		return (EReference)genOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPredicateIsOperator() {
		return genPredicateIsOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateIsOperator_CriteriaPredicate() {
		return (EReference)genPredicateIsOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateIsOperator_GenLeft() {
		return (EReference)genPredicateIsOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateIsOperator_GenRight() {
		return (EReference)genPredicateIsOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPredicateLikeOperator() {
		return genPredicateLikeOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateLikeOperator_CriteriaPredicate() {
		return (EReference)genPredicateLikeOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateLikeOperator_GenLeft() {
		return (EReference)genPredicateLikeOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPredicateLikeOperator_GenRight() {
		return (EReference)genPredicateLikeOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPath() {
		return genPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLiteral() {
		return genLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenNullLiteral() {
		return genNullLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNullLiteral_CriteriaLiteral() {
		return (EReference)genNullLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenIntegerLiteral() {
		return genIntegerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenIntegerLiteral_CriteriaLiteral() {
		return (EReference)genIntegerLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenStringLiteral() {
		return genStringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenStringLiteral_CriteriaLiteral() {
		return (EReference)genStringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCurrentTime() {
		return genCurrentTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCurrentTime_CriteriaLiteral() {
		return (EReference)genCurrentTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFunction() {
		return genFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFunction_CriteriaFunction() {
		return (EReference)genFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GencriteriaFactory getGencriteriaFactory() {
		return (GencriteriaFactory)getEFactoryInstance();
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
		genExpressionEClass = createEClass(GEN_EXPRESSION);

		genLiteralEClass = createEClass(GEN_LITERAL);

		genNullLiteralEClass = createEClass(GEN_NULL_LITERAL);
		createEReference(genNullLiteralEClass, GEN_NULL_LITERAL__CRITERIA_LITERAL);

		genIntegerLiteralEClass = createEClass(GEN_INTEGER_LITERAL);
		createEReference(genIntegerLiteralEClass, GEN_INTEGER_LITERAL__CRITERIA_LITERAL);

		genStringLiteralEClass = createEClass(GEN_STRING_LITERAL);
		createEReference(genStringLiteralEClass, GEN_STRING_LITERAL__CRITERIA_LITERAL);

		genCurrentTimeEClass = createEClass(GEN_CURRENT_TIME);
		createEReference(genCurrentTimeEClass, GEN_CURRENT_TIME__CRITERIA_LITERAL);

		genFunctionEClass = createEClass(GEN_FUNCTION);
		createEReference(genFunctionEClass, GEN_FUNCTION__CRITERIA_FUNCTION);

		genPathEClass = createEClass(GEN_PATH);

		genPredicateEClass = createEClass(GEN_PREDICATE);

		genPredicateBooleanOperatorEClass = createEClass(GEN_PREDICATE_BOOLEAN_OPERATOR);
		createEReference(genPredicateBooleanOperatorEClass, GEN_PREDICATE_BOOLEAN_OPERATOR__CRITERIA_PREDICATE);
		createEReference(genPredicateBooleanOperatorEClass, GEN_PREDICATE_BOOLEAN_OPERATOR__GEN_EXPRESSIONS);

		genPredicateEqualityOperatorEClass = createEClass(GEN_PREDICATE_EQUALITY_OPERATOR);
		createEReference(genPredicateEqualityOperatorEClass, GEN_PREDICATE_EQUALITY_OPERATOR__CRITERIA_PREDICATE);
		createEReference(genPredicateEqualityOperatorEClass, GEN_PREDICATE_EQUALITY_OPERATOR__GEN_LEFT);
		createEReference(genPredicateEqualityOperatorEClass, GEN_PREDICATE_EQUALITY_OPERATOR__GEN_RIGHT);

		genPredicateComparisonOperatorEClass = createEClass(GEN_PREDICATE_COMPARISON_OPERATOR);
		createEReference(genPredicateComparisonOperatorEClass, GEN_PREDICATE_COMPARISON_OPERATOR__CRITERIA_PREDICATE);
		createEReference(genPredicateComparisonOperatorEClass, GEN_PREDICATE_COMPARISON_OPERATOR__GEN_LEFT);
		createEReference(genPredicateComparisonOperatorEClass, GEN_PREDICATE_COMPARISON_OPERATOR__GEN_RIGHT);

		genPredicateIsEmptyEClass = createEClass(GEN_PREDICATE_IS_EMPTY);
		createEReference(genPredicateIsEmptyEClass, GEN_PREDICATE_IS_EMPTY__CRITERIA_PREDICATE);
		createEReference(genPredicateIsEmptyEClass, GEN_PREDICATE_IS_EMPTY__GEN_FEATURE);

		genOrderEClass = createEClass(GEN_ORDER);
		createEReference(genOrderEClass, GEN_ORDER__CRITERIA_ORDER);
		createEReference(genOrderEClass, GEN_ORDER__GEN_PATH);

		genPredicateIsOperatorEClass = createEClass(GEN_PREDICATE_IS_OPERATOR);
		createEReference(genPredicateIsOperatorEClass, GEN_PREDICATE_IS_OPERATOR__CRITERIA_PREDICATE);
		createEReference(genPredicateIsOperatorEClass, GEN_PREDICATE_IS_OPERATOR__GEN_LEFT);
		createEReference(genPredicateIsOperatorEClass, GEN_PREDICATE_IS_OPERATOR__GEN_RIGHT);

		genPredicateLikeOperatorEClass = createEClass(GEN_PREDICATE_LIKE_OPERATOR);
		createEReference(genPredicateLikeOperatorEClass, GEN_PREDICATE_LIKE_OPERATOR__CRITERIA_PREDICATE);
		createEReference(genPredicateLikeOperatorEClass, GEN_PREDICATE_LIKE_OPERATOR__GEN_LEFT);
		createEReference(genPredicateLikeOperatorEClass, GEN_PREDICATE_LIKE_OPERATOR__GEN_RIGHT);
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
		CriteriaPackage theCriteriaPackage = (CriteriaPackage)EPackage.Registry.INSTANCE.getEPackage(CriteriaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		genLiteralEClass.getESuperTypes().add(this.getGenExpression());
		genNullLiteralEClass.getESuperTypes().add(this.getGenLiteral());
		genIntegerLiteralEClass.getESuperTypes().add(this.getGenLiteral());
		genStringLiteralEClass.getESuperTypes().add(this.getGenLiteral());
		genCurrentTimeEClass.getESuperTypes().add(this.getGenLiteral());
		genFunctionEClass.getESuperTypes().add(this.getGenExpression());
		genPathEClass.getESuperTypes().add(this.getGenExpression());
		genPredicateEClass.getESuperTypes().add(this.getGenExpression());
		genPredicateBooleanOperatorEClass.getESuperTypes().add(this.getGenPredicate());
		genPredicateEqualityOperatorEClass.getESuperTypes().add(this.getGenPredicate());
		genPredicateComparisonOperatorEClass.getESuperTypes().add(this.getGenPredicate());
		genPredicateIsEmptyEClass.getESuperTypes().add(this.getGenPredicate());
		genPredicateIsOperatorEClass.getESuperTypes().add(this.getGenPredicate());
		genPredicateLikeOperatorEClass.getESuperTypes().add(this.getGenPredicate());

		// Initialize classes and features; add operations and parameters
		initEClass(genExpressionEClass, GenExpression.class, "GenExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genLiteralEClass, GenLiteral.class, "GenLiteral", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genNullLiteralEClass, GenNullLiteral.class, "GenNullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenNullLiteral_CriteriaLiteral(), theCriteriaPackage.getNullLiteral(), null, "criteriaLiteral", null, 1, 1, GenNullLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genIntegerLiteralEClass, GenIntegerLiteral.class, "GenIntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenIntegerLiteral_CriteriaLiteral(), theCriteriaPackage.getIntegerLiteral(), null, "criteriaLiteral", null, 1, 1, GenIntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genStringLiteralEClass, GenStringLiteral.class, "GenStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenStringLiteral_CriteriaLiteral(), theCriteriaPackage.getStringLiteral(), null, "criteriaLiteral", null, 1, 1, GenStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genCurrentTimeEClass, GenCurrentTime.class, "GenCurrentTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCurrentTime_CriteriaLiteral(), theCriteriaPackage.getCurrentTime(), null, "criteriaLiteral", null, 1, 1, GenCurrentTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genFunctionEClass, GenFunction.class, "GenFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenFunction_CriteriaFunction(), theCriteriaPackage.getFunction(), null, "criteriaFunction", null, 1, 1, GenFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genPathEClass, GenPath.class, "GenPath", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genPredicateEClass, GenPredicate.class, "GenPredicate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genPredicateBooleanOperatorEClass, GenPredicateBooleanOperator.class, "GenPredicateBooleanOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenPredicateBooleanOperator_CriteriaPredicate(), theCriteriaPackage.getPredicateBooleanOperator(), null, "criteriaPredicate", null, 1, 1, GenPredicateBooleanOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPredicateBooleanOperator_GenExpressions(), this.getGenPredicate(), null, "genExpressions", null, 1, -1, GenPredicateBooleanOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genPredicateEqualityOperatorEClass, GenPredicateEqualityOperator.class, "GenPredicateEqualityOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenPredicateEqualityOperator_CriteriaPredicate(), theCriteriaPackage.getPredicateEqualityOperator(), null, "criteriaPredicate", null, 1, 1, GenPredicateEqualityOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPredicateEqualityOperator_GenLeft(), this.getGenExpression(), null, "genLeft", null, 1, 1, GenPredicateEqualityOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenPredicateEqualityOperator_GenRight(), this.getGenExpression(), null, "genRight", null, 1, 1, GenPredicateEqualityOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genPredicateComparisonOperatorEClass, GenPredicateComparisonOperator.class, "GenPredicateComparisonOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenPredicateComparisonOperator_CriteriaPredicate(), theCriteriaPackage.getPredicateComparisonOperator(), null, "criteriaPredicate", null, 1, 1, GenPredicateComparisonOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPredicateComparisonOperator_GenLeft(), this.getGenExpression(), null, "genLeft", null, 1, 1, GenPredicateComparisonOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPredicateComparisonOperator_GenRight(), this.getGenExpression(), null, "genRight", null, 1, 1, GenPredicateComparisonOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genPredicateIsEmptyEClass, GenPredicateIsEmpty.class, "GenPredicateIsEmpty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenPredicateIsEmpty_CriteriaPredicate(), theCriteriaPackage.getPredicateIsEmpty(), null, "criteriaPredicate", null, 1, 1, GenPredicateIsEmpty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPredicateIsEmpty_GenFeature(), this.getGenPath(), null, "genFeature", null, 0, 1, GenPredicateIsEmpty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genOrderEClass, GenOrder.class, "GenOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenOrder_CriteriaOrder(), theCriteriaPackage.getOrder(), null, "criteriaOrder", null, 0, 1, GenOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenOrder_GenPath(), this.getGenPath(), null, "genPath", null, 0, 1, GenOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genPredicateIsOperatorEClass, GenPredicateIsOperator.class, "GenPredicateIsOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenPredicateIsOperator_CriteriaPredicate(), theCriteriaPackage.getPredicateIsOperator(), null, "criteriaPredicate", null, 1, 1, GenPredicateIsOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPredicateIsOperator_GenLeft(), this.getGenExpression(), null, "genLeft", null, 1, 1, GenPredicateIsOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPredicateIsOperator_GenRight(), this.getGenExpression(), null, "genRight", null, 1, 1, GenPredicateIsOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genPredicateLikeOperatorEClass, GenPredicateLikeOperator.class, "GenPredicateLikeOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenPredicateLikeOperator_CriteriaPredicate(), theCriteriaPackage.getPredicateLikeOperator(), null, "criteriaPredicate", null, 1, 1, GenPredicateLikeOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPredicateLikeOperator_GenLeft(), this.getGenExpression(), null, "genLeft", null, 1, 1, GenPredicateLikeOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPredicateLikeOperator_GenRight(), this.getGenExpression(), null, "genRight", null, 1, 1, GenPredicateLikeOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GencriteriaPackageImpl
