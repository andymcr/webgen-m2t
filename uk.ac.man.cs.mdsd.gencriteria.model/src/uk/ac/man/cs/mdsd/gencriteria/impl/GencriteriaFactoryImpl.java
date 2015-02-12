/**
 */
package uk.ac.man.cs.mdsd.gencriteria.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.man.cs.mdsd.gencriteria.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GencriteriaFactoryImpl extends EFactoryImpl implements GencriteriaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GencriteriaFactory init() {
		try {
			GencriteriaFactory theGencriteriaFactory = (GencriteriaFactory)EPackage.Registry.INSTANCE.getEFactory(GencriteriaPackage.eNS_URI);
			if (theGencriteriaFactory != null) {
				return theGencriteriaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GencriteriaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GencriteriaFactoryImpl() {
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
			case GencriteriaPackage.GEN_NULL_LITERAL: return createGenNullLiteral();
			case GencriteriaPackage.GEN_INTEGER_LITERAL: return createGenIntegerLiteral();
			case GencriteriaPackage.GEN_STRING_LITERAL: return createGenStringLiteral();
			case GencriteriaPackage.GEN_CURRENT_TIME: return createGenCurrentTime();
			case GencriteriaPackage.GEN_FUNCTION: return createGenFunction();
			case GencriteriaPackage.GEN_PREDICATE_BOOLEAN_OPERATOR: return createGenPredicateBooleanOperator();
			case GencriteriaPackage.GEN_PREDICATE_EQUALITY_OPERATOR: return createGenPredicateEqualityOperator();
			case GencriteriaPackage.GEN_PREDICATE_COMPARISON_OPERATOR: return createGenPredicateComparisonOperator();
			case GencriteriaPackage.GEN_PREDICATE_IS_EMPTY: return createGenPredicateIsEmpty();
			case GencriteriaPackage.GEN_ORDER: return createGenOrder();
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR: return createGenPredicateIsOperator();
			case GencriteriaPackage.GEN_PREDICATE_LIKE_OPERATOR: return createGenPredicateLikeOperator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenNullLiteral createGenNullLiteral() {
		GenNullLiteralImpl genNullLiteral = new GenNullLiteralImpl();
		return genNullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPredicateBooleanOperator createGenPredicateBooleanOperator() {
		GenPredicateBooleanOperatorImpl genPredicateBooleanOperator = new GenPredicateBooleanOperatorImpl();
		return genPredicateBooleanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPredicateEqualityOperator createGenPredicateEqualityOperator() {
		GenPredicateEqualityOperatorImpl genPredicateEqualityOperator = new GenPredicateEqualityOperatorImpl();
		return genPredicateEqualityOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPredicateComparisonOperator createGenPredicateComparisonOperator() {
		GenPredicateComparisonOperatorImpl genPredicateComparisonOperator = new GenPredicateComparisonOperatorImpl();
		return genPredicateComparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPredicateIsEmpty createGenPredicateIsEmpty() {
		GenPredicateIsEmptyImpl genPredicateIsEmpty = new GenPredicateIsEmptyImpl();
		return genPredicateIsEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenOrder createGenOrder() {
		GenOrderImpl genOrder = new GenOrderImpl();
		return genOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPredicateIsOperator createGenPredicateIsOperator() {
		GenPredicateIsOperatorImpl genPredicateIsOperator = new GenPredicateIsOperatorImpl();
		return genPredicateIsOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPredicateLikeOperator createGenPredicateLikeOperator() {
		GenPredicateLikeOperatorImpl genPredicateLikeOperator = new GenPredicateLikeOperatorImpl();
		return genPredicateLikeOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenIntegerLiteral createGenIntegerLiteral() {
		GenIntegerLiteralImpl genIntegerLiteral = new GenIntegerLiteralImpl();
		return genIntegerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenStringLiteral createGenStringLiteral() {
		GenStringLiteralImpl genStringLiteral = new GenStringLiteralImpl();
		return genStringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCurrentTime createGenCurrentTime() {
		GenCurrentTimeImpl genCurrentTime = new GenCurrentTimeImpl();
		return genCurrentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFunction createGenFunction() {
		GenFunctionImpl genFunction = new GenFunctionImpl();
		return genFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GencriteriaPackage getGencriteriaPackage() {
		return (GencriteriaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GencriteriaPackage getPackage() {
		return GencriteriaPackage.eINSTANCE;
	}

} //GencriteriaFactoryImpl
