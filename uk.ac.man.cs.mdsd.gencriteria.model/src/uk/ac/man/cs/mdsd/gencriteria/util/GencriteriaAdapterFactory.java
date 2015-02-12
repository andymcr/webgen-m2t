/**
 */
package uk.ac.man.cs.mdsd.gencriteria.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.gencriteria.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage
 * @generated
 */
public class GencriteriaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GencriteriaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GencriteriaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GencriteriaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GencriteriaSwitch<Adapter> modelSwitch =
		new GencriteriaSwitch<Adapter>() {
			@Override
			public Adapter caseGenExpression(GenExpression object) {
				return createGenExpressionAdapter();
			}
			@Override
			public Adapter caseGenLiteral(GenLiteral object) {
				return createGenLiteralAdapter();
			}
			@Override
			public Adapter caseGenNullLiteral(GenNullLiteral object) {
				return createGenNullLiteralAdapter();
			}
			@Override
			public Adapter caseGenIntegerLiteral(GenIntegerLiteral object) {
				return createGenIntegerLiteralAdapter();
			}
			@Override
			public Adapter caseGenStringLiteral(GenStringLiteral object) {
				return createGenStringLiteralAdapter();
			}
			@Override
			public Adapter caseGenCurrentTime(GenCurrentTime object) {
				return createGenCurrentTimeAdapter();
			}
			@Override
			public Adapter caseGenFunction(GenFunction object) {
				return createGenFunctionAdapter();
			}
			@Override
			public Adapter caseGenPath(GenPath object) {
				return createGenPathAdapter();
			}
			@Override
			public Adapter caseGenPredicate(GenPredicate object) {
				return createGenPredicateAdapter();
			}
			@Override
			public Adapter caseGenPredicateBooleanOperator(GenPredicateBooleanOperator object) {
				return createGenPredicateBooleanOperatorAdapter();
			}
			@Override
			public Adapter caseGenPredicateEqualityOperator(GenPredicateEqualityOperator object) {
				return createGenPredicateEqualityOperatorAdapter();
			}
			@Override
			public Adapter caseGenPredicateComparisonOperator(GenPredicateComparisonOperator object) {
				return createGenPredicateComparisonOperatorAdapter();
			}
			@Override
			public Adapter caseGenPredicateIsEmpty(GenPredicateIsEmpty object) {
				return createGenPredicateIsEmptyAdapter();
			}
			@Override
			public Adapter caseGenOrder(GenOrder object) {
				return createGenOrderAdapter();
			}
			@Override
			public Adapter caseGenPredicateIsOperator(GenPredicateIsOperator object) {
				return createGenPredicateIsOperatorAdapter();
			}
			@Override
			public Adapter caseGenPredicateLikeOperator(GenPredicateLikeOperator object) {
				return createGenPredicateLikeOperatorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenExpression <em>Gen Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenExpression
	 * @generated
	 */
	public Adapter createGenExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicate <em>Gen Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicate
	 * @generated
	 */
	public Adapter createGenPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateBooleanOperator <em>Gen Predicate Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateBooleanOperator
	 * @generated
	 */
	public Adapter createGenPredicateBooleanOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateEqualityOperator <em>Gen Predicate Equality Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateEqualityOperator
	 * @generated
	 */
	public Adapter createGenPredicateEqualityOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator <em>Gen Predicate Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateComparisonOperator
	 * @generated
	 */
	public Adapter createGenPredicateComparisonOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsEmpty <em>Gen Predicate Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsEmpty
	 * @generated
	 */
	public Adapter createGenPredicateIsEmptyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenOrder <em>Gen Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenOrder
	 * @generated
	 */
	public Adapter createGenOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator <em>Gen Predicate Is Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator
	 * @generated
	 */
	public Adapter createGenPredicateIsOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPredicateLikeOperator <em>Gen Predicate Like Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPredicateLikeOperator
	 * @generated
	 */
	public Adapter createGenPredicateLikeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPath <em>Gen Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPath
	 * @generated
	 */
	public Adapter createGenPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenLiteral <em>Gen Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenLiteral
	 * @generated
	 */
	public Adapter createGenLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenNullLiteral <em>Gen Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenNullLiteral
	 * @generated
	 */
	public Adapter createGenNullLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenIntegerLiteral <em>Gen Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenIntegerLiteral
	 * @generated
	 */
	public Adapter createGenIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenStringLiteral <em>Gen String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenStringLiteral
	 * @generated
	 */
	public Adapter createGenStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenCurrentTime <em>Gen Current Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenCurrentTime
	 * @generated
	 */
	public Adapter createGenCurrentTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenFunction <em>Gen Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenFunction
	 * @generated
	 */
	public Adapter createGenFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GencriteriaAdapterFactory
