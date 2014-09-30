/**
 */
package uk.ac.man.cs.mdsd.gencriteria.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.man.cs.mdsd.criteria.Order;

import uk.ac.man.cs.mdsd.gencriteria.GenOrder;
import uk.ac.man.cs.mdsd.gencriteria.GenPath;
import uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenOrderImpl#getCriteriaOrder <em>Criteria Order</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.impl.GenOrderImpl#getGenPath <em>Gen Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenOrderImpl extends EObjectImpl implements GenOrder {
	/**
	 * The cached value of the '{@link #getCriteriaOrder() <em>Criteria Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaOrder()
	 * @generated
	 * @ordered
	 */
	protected Order criteriaOrder;

	/**
	 * The cached value of the '{@link #getGenPath() <em>Gen Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenPath()
	 * @generated
	 * @ordered
	 */
	protected GenPath genPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GencriteriaPackage.Literals.GEN_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order getCriteriaOrder() {
		if (criteriaOrder != null && criteriaOrder.eIsProxy()) {
			InternalEObject oldCriteriaOrder = (InternalEObject)criteriaOrder;
			criteriaOrder = (Order)eResolveProxy(oldCriteriaOrder);
			if (criteriaOrder != oldCriteriaOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GencriteriaPackage.GEN_ORDER__CRITERIA_ORDER, oldCriteriaOrder, criteriaOrder));
			}
		}
		return criteriaOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order basicGetCriteriaOrder() {
		return criteriaOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaOrder(Order newCriteriaOrder) {
		Order oldCriteriaOrder = criteriaOrder;
		criteriaOrder = newCriteriaOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_ORDER__CRITERIA_ORDER, oldCriteriaOrder, criteriaOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPath getGenPath() {
		return genPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenPath(GenPath newGenPath, NotificationChain msgs) {
		GenPath oldGenPath = genPath;
		genPath = newGenPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_ORDER__GEN_PATH, oldGenPath, newGenPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenPath(GenPath newGenPath) {
		if (newGenPath != genPath) {
			NotificationChain msgs = null;
			if (genPath != null)
				msgs = ((InternalEObject)genPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GencriteriaPackage.GEN_ORDER__GEN_PATH, null, msgs);
			if (newGenPath != null)
				msgs = ((InternalEObject)newGenPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GencriteriaPackage.GEN_ORDER__GEN_PATH, null, msgs);
			msgs = basicSetGenPath(newGenPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencriteriaPackage.GEN_ORDER__GEN_PATH, newGenPath, newGenPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GencriteriaPackage.GEN_ORDER__GEN_PATH:
				return basicSetGenPath(null, msgs);
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
			case GencriteriaPackage.GEN_ORDER__CRITERIA_ORDER:
				if (resolve) return getCriteriaOrder();
				return basicGetCriteriaOrder();
			case GencriteriaPackage.GEN_ORDER__GEN_PATH:
				return getGenPath();
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
			case GencriteriaPackage.GEN_ORDER__CRITERIA_ORDER:
				setCriteriaOrder((Order)newValue);
				return;
			case GencriteriaPackage.GEN_ORDER__GEN_PATH:
				setGenPath((GenPath)newValue);
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
			case GencriteriaPackage.GEN_ORDER__CRITERIA_ORDER:
				setCriteriaOrder((Order)null);
				return;
			case GencriteriaPackage.GEN_ORDER__GEN_PATH:
				setGenPath((GenPath)null);
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
			case GencriteriaPackage.GEN_ORDER__CRITERIA_ORDER:
				return criteriaOrder != null;
			case GencriteriaPackage.GEN_ORDER__GEN_PATH:
				return genPath != null;
		}
		return super.eIsSet(featureID);
	}

} //GenOrderImpl
