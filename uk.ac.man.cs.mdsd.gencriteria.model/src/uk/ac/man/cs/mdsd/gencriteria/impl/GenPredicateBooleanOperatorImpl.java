/**
 */
package uk.ac.man.cs.mdsd.gencriteria.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.criteria.PredicateBooleanOperator;

import uk.ac.man.cs.mdsd.gencriteria.GenPredicate;
import uk.ac.man.cs.mdsd.gencriteria.GenPredicateBooleanOperator;
import uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Predicate Boolean Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateBooleanOperatorImpl#getCriteriaPredicate <em>Criteria Predicate</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateBooleanOperatorImpl#getGenExpressions <em>Gen Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenPredicateBooleanOperatorImpl extends GenPredicateImpl implements GenPredicateBooleanOperator {
	/**
	 * The cached value of the '{@link #getCriteriaPredicate() <em>Criteria Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaPredicate()
	 * @generated
	 * @ordered
	 */
	protected PredicateBooleanOperator criteriaPredicate;

	/**
	 * The cached value of the '{@link #getGenExpressions() <em>Gen Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<GenPredicate> genExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenPredicateBooleanOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GencriteriaPackage.Literals.GEN_PREDICATE_BOOLEAN_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateBooleanOperator getCriteriaPredicate() {
		if (criteriaPredicate != null && criteriaPredicate.eIsProxy()) {
			InternalEObject oldCriteriaPredicate = (InternalEObject)criteriaPredicate;
			criteriaPredicate = (PredicateBooleanOperator)eResolveProxy(oldCriteriaPredicate);
			if (criteriaPredicate != oldCriteriaPredicate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GencriteriaPackage.GEN_PREDICATE_BOOLEAN_OPERATOR__CRITERIA_PREDICATE, oldCriteriaPredicate, criteriaPredicate));
			}
		}
		return criteriaPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateBooleanOperator basicGetCriteriaPredicate() {
		return criteriaPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaPredicate(PredicateBooleanOperator newCriteriaPredicate) {
		PredicateBooleanOperator oldCriteriaPredicate = criteriaPredicate;
		criteriaPredicate = newCriteriaPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_PREDICATE_BOOLEAN_OPERATOR__CRITERIA_PREDICATE, oldCriteriaPredicate, criteriaPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenPredicate> getGenExpressions() {
		if (genExpressions == null) {
			genExpressions = new EObjectContainmentEList<GenPredicate>(GenPredicate.class, this, GencriteriaPackage.GEN_PREDICATE_BOOLEAN_OPERATOR__GEN_EXPRESSIONS);
		}
		return genExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GencriteriaPackage.GEN_PREDICATE_BOOLEAN_OPERATOR__GEN_EXPRESSIONS:
				return ((InternalEList<?>)getGenExpressions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GencriteriaPackage.GEN_PREDICATE_BOOLEAN_OPERATOR__CRITERIA_PREDICATE:
				if (resolve) return getCriteriaPredicate();
				return basicGetCriteriaPredicate();
			case GencriteriaPackage.GEN_PREDICATE_BOOLEAN_OPERATOR__GEN_EXPRESSIONS:
				return getGenExpressions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GencriteriaPackage.GEN_PREDICATE_BOOLEAN_OPERATOR__CRITERIA_PREDICATE:
				setCriteriaPredicate((PredicateBooleanOperator)newValue);
				return;
			case GencriteriaPackage.GEN_PREDICATE_BOOLEAN_OPERATOR__GEN_EXPRESSIONS:
				getGenExpressions().clear();
				getGenExpressions().addAll((Collection<? extends GenPredicate>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GencriteriaPackage.GEN_PREDICATE_BOOLEAN_OPERATOR__CRITERIA_PREDICATE:
				setCriteriaPredicate((PredicateBooleanOperator)null);
				return;
			case GencriteriaPackage.GEN_PREDICATE_BOOLEAN_OPERATOR__GEN_EXPRESSIONS:
				getGenExpressions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GencriteriaPackage.GEN_PREDICATE_BOOLEAN_OPERATOR__CRITERIA_PREDICATE:
				return criteriaPredicate != null;
			case GencriteriaPackage.GEN_PREDICATE_BOOLEAN_OPERATOR__GEN_EXPRESSIONS:
				return genExpressions != null && !genExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenPredicateBooleanOperatorImpl
