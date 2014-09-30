/**
 */
package uk.ac.man.cs.mdsd.gencriteria.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.criteria.PredicateIsOperator;

import uk.ac.man.cs.mdsd.gencriteria.GenExpression;
import uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsOperator;
import uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Predicate Is Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateIsOperatorImpl#getCriteriaPredicate <em>Criteria Predicate</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateIsOperatorImpl#getGenLeft <em>Gen Left</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateIsOperatorImpl#getGenRight <em>Gen Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenPredicateIsOperatorImpl extends GenPredicateImpl implements GenPredicateIsOperator {
	/**
	 * The cached value of the '{@link #getCriteriaPredicate() <em>Criteria Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaPredicate()
	 * @generated
	 * @ordered
	 */
	protected PredicateIsOperator criteriaPredicate;

	/**
	 * The cached value of the '{@link #getGenLeft() <em>Gen Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenLeft()
	 * @generated
	 * @ordered
	 */
	protected GenExpression genLeft;

	/**
	 * The cached value of the '{@link #getGenRight() <em>Gen Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenRight()
	 * @generated
	 * @ordered
	 */
	protected GenExpression genRight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenPredicateIsOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GencriteriaPackage.Literals.GEN_PREDICATE_IS_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateIsOperator getCriteriaPredicate() {
		if (criteriaPredicate != null && criteriaPredicate.eIsProxy()) {
			InternalEObject oldCriteriaPredicate = (InternalEObject)criteriaPredicate;
			criteriaPredicate = (PredicateIsOperator)eResolveProxy(oldCriteriaPredicate);
			if (criteriaPredicate != oldCriteriaPredicate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__CRITERIA_PREDICATE, oldCriteriaPredicate, criteriaPredicate));
			}
		}
		return criteriaPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateIsOperator basicGetCriteriaPredicate() {
		return criteriaPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaPredicate(PredicateIsOperator newCriteriaPredicate) {
		PredicateIsOperator oldCriteriaPredicate = criteriaPredicate;
		criteriaPredicate = newCriteriaPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__CRITERIA_PREDICATE, oldCriteriaPredicate, criteriaPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenExpression getGenLeft() {
		return genLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenLeft(GenExpression newGenLeft, NotificationChain msgs) {
		GenExpression oldGenLeft = genLeft;
		genLeft = newGenLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_LEFT, oldGenLeft, newGenLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenLeft(GenExpression newGenLeft) {
		if (newGenLeft != genLeft) {
			NotificationChain msgs = null;
			if (genLeft != null)
				msgs = ((InternalEObject)genLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_LEFT, null, msgs);
			if (newGenLeft != null)
				msgs = ((InternalEObject)newGenLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_LEFT, null, msgs);
			msgs = basicSetGenLeft(newGenLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_LEFT, newGenLeft, newGenLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenExpression getGenRight() {
		return genRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenRight(GenExpression newGenRight, NotificationChain msgs) {
		GenExpression oldGenRight = genRight;
		genRight = newGenRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_RIGHT, oldGenRight, newGenRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenRight(GenExpression newGenRight) {
		if (newGenRight != genRight) {
			NotificationChain msgs = null;
			if (genRight != null)
				msgs = ((InternalEObject)genRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_RIGHT, null, msgs);
			if (newGenRight != null)
				msgs = ((InternalEObject)newGenRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_RIGHT, null, msgs);
			msgs = basicSetGenRight(newGenRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_RIGHT, newGenRight, newGenRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_LEFT:
				return basicSetGenLeft(null, msgs);
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_RIGHT:
				return basicSetGenRight(null, msgs);
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
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__CRITERIA_PREDICATE:
				if (resolve) return getCriteriaPredicate();
				return basicGetCriteriaPredicate();
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_LEFT:
				return getGenLeft();
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_RIGHT:
				return getGenRight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__CRITERIA_PREDICATE:
				setCriteriaPredicate((PredicateIsOperator)newValue);
				return;
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_LEFT:
				setGenLeft((GenExpression)newValue);
				return;
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_RIGHT:
				setGenRight((GenExpression)newValue);
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
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__CRITERIA_PREDICATE:
				setCriteriaPredicate((PredicateIsOperator)null);
				return;
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_LEFT:
				setGenLeft((GenExpression)null);
				return;
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_RIGHT:
				setGenRight((GenExpression)null);
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
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__CRITERIA_PREDICATE:
				return criteriaPredicate != null;
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_LEFT:
				return genLeft != null;
			case GencriteriaPackage.GEN_PREDICATE_IS_OPERATOR__GEN_RIGHT:
				return genRight != null;
		}
		return super.eIsSet(featureID);
	}

} //GenPredicateIsOperatorImpl
