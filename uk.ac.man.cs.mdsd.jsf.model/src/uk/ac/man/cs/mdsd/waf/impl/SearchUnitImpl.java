/**
 * <copyright>
 * </copyright>
 *
 * $Id: SearchUnitImpl.java,v 1.3 2013/04/15 08:35:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.waf.IndexUnit;
import uk.ac.man.cs.mdsd.waf.WafPackage;
import uk.ac.man.cs.mdsd.waf.SearchUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.SearchUnitImpl#getResultsDestination <em>Results Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SearchUnitImpl extends ControlUnitImpl implements SearchUnit {
	/**
	 * The cached value of the '{@link #getResultsDestination() <em>Results Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsDestination()
	 * @generated
	 * @ordered
	 */
	protected IndexUnit resultsDestination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.SEARCH_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexUnit getResultsDestination() {
		if (resultsDestination != null && resultsDestination.eIsProxy()) {
			InternalEObject oldResultsDestination = (InternalEObject)resultsDestination;
			resultsDestination = (IndexUnit)eResolveProxy(oldResultsDestination);
			if (resultsDestination != oldResultsDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.SEARCH_UNIT__RESULTS_DESTINATION, oldResultsDestination, resultsDestination));
			}
		}
		return resultsDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexUnit basicGetResultsDestination() {
		return resultsDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultsDestination(IndexUnit newResultsDestination, NotificationChain msgs) {
		IndexUnit oldResultsDestination = resultsDestination;
		resultsDestination = newResultsDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.SEARCH_UNIT__RESULTS_DESTINATION, oldResultsDestination, newResultsDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultsDestination(IndexUnit newResultsDestination) {
		if (newResultsDestination != resultsDestination) {
			NotificationChain msgs = null;
			if (resultsDestination != null)
				msgs = ((InternalEObject)resultsDestination).eInverseRemove(this, WafPackage.INDEX_UNIT__TARGETTING_SEARCHES, IndexUnit.class, msgs);
			if (newResultsDestination != null)
				msgs = ((InternalEObject)newResultsDestination).eInverseAdd(this, WafPackage.INDEX_UNIT__TARGETTING_SEARCHES, IndexUnit.class, msgs);
			msgs = basicSetResultsDestination(newResultsDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.SEARCH_UNIT__RESULTS_DESTINATION, newResultsDestination, newResultsDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.SEARCH_UNIT__RESULTS_DESTINATION:
				if (resultsDestination != null)
					msgs = ((InternalEObject)resultsDestination).eInverseRemove(this, WafPackage.INDEX_UNIT__TARGETTING_SEARCHES, IndexUnit.class, msgs);
				return basicSetResultsDestination((IndexUnit)otherEnd, msgs);
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
			case WafPackage.SEARCH_UNIT__RESULTS_DESTINATION:
				return basicSetResultsDestination(null, msgs);
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
			case WafPackage.SEARCH_UNIT__RESULTS_DESTINATION:
				if (resolve) return getResultsDestination();
				return basicGetResultsDestination();
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
			case WafPackage.SEARCH_UNIT__RESULTS_DESTINATION:
				setResultsDestination((IndexUnit)newValue);
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
			case WafPackage.SEARCH_UNIT__RESULTS_DESTINATION:
				setResultsDestination((IndexUnit)null);
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
			case WafPackage.SEARCH_UNIT__RESULTS_DESTINATION:
				return resultsDestination != null;
		}
		return super.eIsSet(featureID);
	}

} //SearchUnitImpl
