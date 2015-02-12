/**
 */
package uk.ac.man.cs.mdsd.gencriteria.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.man.cs.mdsd.gencriteria.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage
 * @generated
 */
public class GencriteriaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GencriteriaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GencriteriaSwitch() {
		if (modelPackage == null) {
			modelPackage = GencriteriaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GencriteriaPackage.GEN_EXPRESSION: {
				GenExpression genExpression = (GenExpression)theEObject;
				T result = caseGenExpression(genExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_LITERAL: {
				GenLiteral genLiteral = (GenLiteral)theEObject;
				T result = caseGenLiteral(genLiteral);
				if (result == null) result = caseGenExpression(genLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_NULL_LITERAL: {
				GenNullLiteral genNullLiteral = (GenNullLiteral)theEObject;
				T result = caseGenNullLiteral(genNullLiteral);
				if (result == null) result = caseGenLiteral(genNullLiteral);
				if (result == null) result = caseGenExpression(genNullLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_INTEGER_LITERAL: {
				GenIntegerLiteral genIntegerLiteral = (GenIntegerLiteral)theEObject;
				T result = caseGenIntegerLiteral(genIntegerLiteral);
				if (result == null) result = caseGenLiteral(genIntegerLiteral);
				if (result == null) result = caseGenExpression(genIntegerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_STRING_LITERAL: {
				GenStringLiteral genStringLiteral = (GenStringLiteral)theEObject;
				T result = caseGenStringLiteral(genStringLiteral);
				if (result == null) result = caseGenLiteral(genStringLiteral);
				if (result == null) result = caseGenExpression(genStringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_CURRENT_TIME: {
				GenCurrentTime genCurrentTime = (GenCurrentTime)theEObject;
				T result = caseGenCurrentTime(genCurrentTime);
				if (result == null) result = caseGenLiteral(genCurrentTime);
				if (result == null) result = caseGenExpression(genCurrentTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_FUNCTION: {
				GenFunction genFunction = (GenFunction)theEObject;
				T result = caseGenFunction(genFunction);
				if (result == null) result = caseGenExpression(genFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_PATH: {
				GenPath genPath = (GenPath)theEObject;
				T result = caseGenPath(genPath);
				if (result == null) result = caseGenExpression(genPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_PREDICATE: {
				GenPredicate genPredicate = (GenPredicate)theEObject;
				T result = caseGenPredicate(genPredicate);
				if (result == null) result = caseGenExpression(genPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_PREDICATE_BOOLEAN_OPERATOR: {
				GenPredicateBooleanOperator genPredicateBooleanOperator = (GenPredicateBooleanOperator)theEObject;
				T result = caseGenPredicateBooleanOperator(genPredicateBooleanOperator);
				if (result == null) result = caseGenPredicate(genPredicateBooleanOperator);
				if (result == null) result = caseGenExpression(genPredicateBooleanOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_PREDICATE_EQUALITY_OPERATOR: {
				GenPredicateEqualityOperator genPredicateEqualityOperator = (GenPredicateEqualityOperator)theEObject;
				T result = caseGenPredicateEqualityOperator(genPredicateEqualityOperator);
				if (result == null) result = caseGenPredicate(genPredicateEqualityOperator);
				if (result == null) result = caseGenExpression(genPredicateEqualityOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_PREDICATE_COMPARISON_OPERATOR: {
				GenPredicateComparisonOperator genPredicateComparisonOperator = (GenPredicateComparisonOperator)theEObject;
				T result = caseGenPredicateComparisonOperator(genPredicateComparisonOperator);
				if (result == null) result = caseGenPredicate(genPredicateComparisonOperator);
				if (result == null) result = caseGenExpression(genPredicateComparisonOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_PREDICATE_IS_EMPTY: {
				GenPredicateIsEmpty genPredicateIsEmpty = (GenPredicateIsEmpty)theEObject;
				T result = caseGenPredicateIsEmpty(genPredicateIsEmpty);
				if (result == null) result = caseGenPredicate(genPredicateIsEmpty);
				if (result == null) result = caseGenExpression(genPredicateIsEmpty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_ORDER: {
				GenOrder genOrder = (GenOrder)theEObject;
				T result = caseGenOrder(genOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR: {
				GenPredicateIsOperator genPredicateIsOperator = (GenPredicateIsOperator)theEObject;
				T result = caseGenPredicateIsOperator(genPredicateIsOperator);
				if (result == null) result = caseGenPredicate(genPredicateIsOperator);
				if (result == null) result = caseGenExpression(genPredicateIsOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GencriteriaPackage.GEN_PREDICATE_LIKE_OPERATOR: {
				GenPredicateLikeOperator genPredicateLikeOperator = (GenPredicateLikeOperator)theEObject;
				T result = caseGenPredicateLikeOperator(genPredicateLikeOperator);
				if (result == null) result = caseGenPredicate(genPredicateLikeOperator);
				if (result == null) result = caseGenExpression(genPredicateLikeOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenExpression(GenExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPredicate(GenPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Predicate Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Predicate Boolean Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPredicateBooleanOperator(GenPredicateBooleanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Predicate Equality Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Predicate Equality Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPredicateEqualityOperator(GenPredicateEqualityOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Predicate Comparison Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Predicate Comparison Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPredicateComparisonOperator(GenPredicateComparisonOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Predicate Is Empty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Predicate Is Empty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPredicateIsEmpty(GenPredicateIsEmpty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenOrder(GenOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Predicate Is Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Predicate Is Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPredicateIsOperator(GenPredicateIsOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Predicate Like Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Predicate Like Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPredicateLikeOperator(GenPredicateLikeOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPath(GenPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenLiteral(GenLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Null Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenNullLiteral(GenNullLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenIntegerLiteral(GenIntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenStringLiteral(GenStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Current Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Current Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCurrentTime(GenCurrentTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenFunction(GenFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GencriteriaSwitch
