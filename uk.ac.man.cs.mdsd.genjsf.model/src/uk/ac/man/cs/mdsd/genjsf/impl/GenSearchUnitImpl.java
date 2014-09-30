/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenSearchUnitImpl.java,v 1.7 2014/01/25 17:38:18 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.genjsf.GenIndexUnit;
import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenSearchUnit;
import uk.ac.man.cs.mdsd.jsf.SearchUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Search Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenSearchUnitImpl#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenSearchUnitImpl#getGenResultDestination <em>Gen Result Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenSearchUnitImpl extends GenControlUnitImpl implements GenSearchUnit {
	/**
	 * The cached value of the '{@link #getJsfUnit() <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfUnit()
	 * @generated
	 * @ordered
	 */
	protected SearchUnit jsfUnit;
	/**
	 * The cached value of the '{@link #getGenResultDestination() <em>Gen Result Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenResultDestination()
	 * @generated
	 * @ordered
	 */
	protected GenIndexUnit genResultDestination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenSearchUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_SEARCH_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchUnit getJsfUnit() {
		if (jsfUnit != null && jsfUnit.eIsProxy()) {
			InternalEObject oldJsfUnit = (InternalEObject)jsfUnit;
			jsfUnit = (SearchUnit)eResolveProxy(oldJsfUnit);
			if (jsfUnit != oldJsfUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_SEARCH_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
			}
		}
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchUnit basicGetJsfUnit() {
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfUnit(SearchUnit newJsfUnit) {
		SearchUnit oldJsfUnit = jsfUnit;
		jsfUnit = newJsfUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SEARCH_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenIndexUnit getGenResultDestination() {
		if (genResultDestination != null && genResultDestination.eIsProxy()) {
			InternalEObject oldGenResultDestination = (InternalEObject)genResultDestination;
			genResultDestination = (GenIndexUnit)eResolveProxy(oldGenResultDestination);
			if (genResultDestination != oldGenResultDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_SEARCH_UNIT__GEN_RESULT_DESTINATION, oldGenResultDestination, genResultDestination));
			}
		}
		return genResultDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenIndexUnit basicGetGenResultDestination() {
		return genResultDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenResultDestination(GenIndexUnit newGenResultDestination, NotificationChain msgs) {
		GenIndexUnit oldGenResultDestination = genResultDestination;
		genResultDestination = newGenResultDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SEARCH_UNIT__GEN_RESULT_DESTINATION, oldGenResultDestination, newGenResultDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenResultDestination(GenIndexUnit newGenResultDestination) {
		if (newGenResultDestination != genResultDestination) {
			NotificationChain msgs = null;
			if (genResultDestination != null)
				msgs = ((InternalEObject)genResultDestination).eInverseRemove(this, GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES, GenIndexUnit.class, msgs);
			if (newGenResultDestination != null)
				msgs = ((InternalEObject)newGenResultDestination).eInverseAdd(this, GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES, GenIndexUnit.class, msgs);
			msgs = basicSetGenResultDestination(newGenResultDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SEARCH_UNIT__GEN_RESULT_DESTINATION, newGenResultDestination, newGenResultDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_SEARCH_UNIT__GEN_RESULT_DESTINATION:
				if (genResultDestination != null)
					msgs = ((InternalEObject)genResultDestination).eInverseRemove(this, GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES, GenIndexUnit.class, msgs);
				return basicSetGenResultDestination((GenIndexUnit)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_SEARCH_UNIT__GEN_RESULT_DESTINATION:
				return basicSetGenResultDestination(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void reconcile(final GenContentUnit oldGenUnit) {
		super.reconcile(oldGenUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenContentUnit oldGenUnit) {
		super.reconcileSettings(oldGenUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_SEARCH_UNIT__JSF_UNIT:
				if (resolve) return getJsfUnit();
				return basicGetJsfUnit();
			case GenJsfPackage.GEN_SEARCH_UNIT__GEN_RESULT_DESTINATION:
				if (resolve) return getGenResultDestination();
				return basicGetGenResultDestination();
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
			case GenJsfPackage.GEN_SEARCH_UNIT__JSF_UNIT:
				setJsfUnit((SearchUnit)newValue);
				return;
			case GenJsfPackage.GEN_SEARCH_UNIT__GEN_RESULT_DESTINATION:
				setGenResultDestination((GenIndexUnit)newValue);
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
			case GenJsfPackage.GEN_SEARCH_UNIT__JSF_UNIT:
				setJsfUnit((SearchUnit)null);
				return;
			case GenJsfPackage.GEN_SEARCH_UNIT__GEN_RESULT_DESTINATION:
				setGenResultDestination((GenIndexUnit)null);
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
			case GenJsfPackage.GEN_SEARCH_UNIT__JSF_UNIT:
				return jsfUnit != null;
			case GenJsfPackage.GEN_SEARCH_UNIT__GEN_RESULT_DESTINATION:
				return genResultDestination != null;
		}
		return super.eIsSet(featureID);
	}

} //GenSearchUnitImpl
