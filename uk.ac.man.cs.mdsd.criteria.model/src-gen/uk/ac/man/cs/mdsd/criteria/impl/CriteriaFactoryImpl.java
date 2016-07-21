/**
 */
package uk.ac.man.cs.mdsd.criteria.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.man.cs.mdsd.criteria.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CriteriaFactoryImpl extends EFactoryImpl implements CriteriaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CriteriaFactory init() {
		try {
			CriteriaFactory theCriteriaFactory = (CriteriaFactory)EPackage.Registry.INSTANCE.getEFactory(CriteriaPackage.eNS_URI);
			if (theCriteriaFactory != null) {
				return theCriteriaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CriteriaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CriteriaPackage.NULL_LITERAL: return createNullLiteral();
			case CriteriaPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case CriteriaPackage.INTEGER_LITERAL: return createIntegerLiteral();
			case CriteriaPackage.STRING_LITERAL: return createStringLiteral();
			case CriteriaPackage.TIME_LITERAL: return createTimeLiteral();
			case CriteriaPackage.CURRENT_TIME: return createCurrentTime();
			case CriteriaPackage.FUNCTION: return createFunction();
			case CriteriaPackage.PREDICATE_BOOLEAN_OPERATOR: return createPredicateBooleanOperator();
			case CriteriaPackage.PREDICATE_EQUALITY_OPERATOR: return createPredicateEqualityOperator();
			case CriteriaPackage.PREDICATE_COMPARISON_OPERATOR: return createPredicateComparisonOperator();
			case CriteriaPackage.PREDICATE_IS_OPERATOR: return createPredicateIsOperator();
			case CriteriaPackage.PREDICATE_LIKE_OPERATOR: return createPredicateLikeOperator();
			case CriteriaPackage.PREDICATE_IS_EMPTY: return createPredicateIsEmpty();
			case CriteriaPackage.PREDICATE_IS_NULL: return createPredicateIsNull();
			case CriteriaPackage.ASC: return createAsc();
			case CriteriaPackage.DESC: return createDesc();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CriteriaPackage.BOOLEAN_OPERATOR:
				return createBooleanOperatorFromString(eDataType, initialValue);
			case CriteriaPackage.COMPARISION_OPERATOR:
				return createComparisionOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CriteriaPackage.BOOLEAN_OPERATOR:
				return convertBooleanOperatorToString(eDataType, instanceValue);
			case CriteriaPackage.COMPARISION_OPERATOR:
				return convertComparisionOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteral createNullLiteral() {
		NullLiteralImpl nullLiteral = new NullLiteralImpl();
		return nullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLiteral createTimeLiteral() {
		TimeLiteralImpl timeLiteral = new TimeLiteralImpl();
		return timeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentTime createCurrentTime() {
		CurrentTimeImpl currentTime = new CurrentTimeImpl();
		return currentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateBooleanOperator createPredicateBooleanOperator() {
		PredicateBooleanOperatorImpl predicateBooleanOperator = new PredicateBooleanOperatorImpl();
		return predicateBooleanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateEqualityOperator createPredicateEqualityOperator() {
		PredicateEqualityOperatorImpl predicateEqualityOperator = new PredicateEqualityOperatorImpl();
		return predicateEqualityOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateComparisonOperator createPredicateComparisonOperator() {
		PredicateComparisonOperatorImpl predicateComparisonOperator = new PredicateComparisonOperatorImpl();
		return predicateComparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateIsOperator createPredicateIsOperator() {
		PredicateIsOperatorImpl predicateIsOperator = new PredicateIsOperatorImpl();
		return predicateIsOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateLikeOperator createPredicateLikeOperator() {
		PredicateLikeOperatorImpl predicateLikeOperator = new PredicateLikeOperatorImpl();
		return predicateLikeOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateIsEmpty createPredicateIsEmpty() {
		PredicateIsEmptyImpl predicateIsEmpty = new PredicateIsEmptyImpl();
		return predicateIsEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateIsNull createPredicateIsNull() {
		PredicateIsNullImpl predicateIsNull = new PredicateIsNullImpl();
		return predicateIsNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asc createAsc() {
		AscImpl asc = new AscImpl();
		return asc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Desc createDesc() {
		DescImpl desc = new DescImpl();
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator createBooleanOperatorFromString(EDataType eDataType, String initialValue) {
		BooleanOperator result = BooleanOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisionOperator createComparisionOperatorFromString(EDataType eDataType, String initialValue) {
		ComparisionOperator result = ComparisionOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisionOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriaPackage getCriteriaPackage() {
		return (CriteriaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CriteriaPackage getPackage() {
		return CriteriaPackage.eINSTANCE;
	}

} //CriteriaFactoryImpl
