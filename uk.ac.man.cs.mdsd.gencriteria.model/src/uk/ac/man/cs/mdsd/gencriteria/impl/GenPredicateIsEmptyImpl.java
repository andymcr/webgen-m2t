/**
 */
package uk.ac.man.cs.mdsd.gencriteria.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.criteria.PredicateIsEmpty;
import uk.ac.man.cs.mdsd.gencriteria.GenPath;
import uk.ac.man.cs.mdsd.gencriteria.GenPredicateIsEmpty;
import uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Predicate Is Empty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateIsEmptyImpl#getCriteriaPredicate <em>Criteria Predicate</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenPredicateIsEmptyImpl#getGenFeature <em>Gen Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenPredicateIsEmptyImpl extends GenPredicateImpl implements GenPredicateIsEmpty {
	/**
	 * The cached value of the '{@link #getCriteriaPredicate() <em>Criteria Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaPredicate()
	 * @generated
	 * @ordered
	 */
	protected PredicateIsEmpty criteriaPredicate;
	/**
	 * The cached value of the '{@link #getGenFeature() <em>Gen Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenFeature()
	 * @generated
	 * @ordered
	 */
	protected GenPath genFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenPredicateIsEmptyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GencriteriaPackage.Literals.GEN_PREDICATE_IS_EMPTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateIsEmpty getCriteriaPredicate() {
		if (criteriaPredicate != null && criteriaPredicate.eIsProxy()) {
			InternalEObject oldCriteriaPredicate = (InternalEObject)criteriaPredicate;
			criteriaPredicate = (PredicateIsEmpty)eResolveProxy(oldCriteriaPredicate);
			if (criteriaPredicate != oldCriteriaPredicate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__CRITERIA_PREDICATE, oldCriteriaPredicate, criteriaPredicate));
			}
		}
		return criteriaPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateIsEmpty basicGetCriteriaPredicate() {
		return criteriaPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaPredicate(PredicateIsEmpty newCriteriaPredicate) {
		PredicateIsEmpty oldCriteriaPredicate = criteriaPredicate;
		criteriaPredicate = newCriteriaPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__CRITERIA_PREDICATE, oldCriteriaPredicate, criteriaPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPath getGenFeature() {
		return genFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenFeature(GenPath newGenFeature, NotificationChain msgs) {
		GenPath oldGenFeature = genFeature;
		genFeature = newGenFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__GEN_FEATURE, oldGenFeature, newGenFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenFeature(GenPath newGenFeature) {
		if (newGenFeature != genFeature) {
			NotificationChain msgs = null;
			if (genFeature != null)
				msgs = ((InternalEObject)genFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__GEN_FEATURE, null, msgs);
			if (newGenFeature != null)
				msgs = ((InternalEObject)newGenFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__GEN_FEATURE, null, msgs);
			msgs = basicSetGenFeature(newGenFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__GEN_FEATURE, newGenFeature, newGenFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__GEN_FEATURE:
				return basicSetGenFeature(null, msgs);
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
			case GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__CRITERIA_PREDICATE:
				if (resolve) return getCriteriaPredicate();
				return basicGetCriteriaPredicate();
			case GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__GEN_FEATURE:
				return getGenFeature();
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
			case GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__CRITERIA_PREDICATE:
				setCriteriaPredicate((PredicateIsEmpty)newValue);
				return;
			case GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__GEN_FEATURE:
				setGenFeature((GenPath)newValue);
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
			case GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__CRITERIA_PREDICATE:
				setCriteriaPredicate((PredicateIsEmpty)null);
				return;
			case GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__GEN_FEATURE:
				setGenFeature((GenPath)null);
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
			case GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__CRITERIA_PREDICATE:
				return criteriaPredicate != null;
			case GencriteriaPackage.GEN_PREDICATE_IS_EMPTY__GEN_FEATURE:
				return genFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //GenPredicateIsEmptyImpl
