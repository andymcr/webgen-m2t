/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenIndexUnitImpl.java,v 1.18 2014/01/25 17:38:18 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenIndexUnit;
import uk.ac.man.cs.mdsd.genjsf.GenInlineAction;
import uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenSearchUnit;
import uk.ac.man.cs.mdsd.genjsf.GenSelectAction;
import uk.ac.man.cs.mdsd.genjsf.GenSelectTarget;
import uk.ac.man.cs.mdsd.jsf.IndexUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Index Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenIndexUnitImpl#getGenActions <em>Gen Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenIndexUnitImpl#getGenTargettingActions <em>Gen Targetting Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenIndexUnitImpl#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenIndexUnitImpl#getGenTargettingSearches <em>Gen Targetting Searches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenIndexUnitImpl extends GenDataUnitImpl implements GenIndexUnit {
	/**
	 * The cached value of the '{@link #getGenActions() <em>Gen Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenActions()
	 * @generated
	 * @ordered
	 */
	protected EList<GenInlineAction> genActions;
	/**
	 * The cached value of the '{@link #getGenTargettingActions() <em>Gen Targetting Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenTargettingActions()
	 * @generated
	 * @ordered
	 */
	protected EList<GenSelectAction> genTargettingActions;
	/**
	 * The cached value of the '{@link #getJsfUnit() <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfUnit()
	 * @generated
	 * @ordered
	 */
	protected IndexUnit jsfUnit;

	/**
	 * The cached value of the '{@link #getGenTargettingSearches() <em>Gen Targetting Searches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenTargettingSearches()
	 * @generated
	 * @ordered
	 */
	protected EList<GenSearchUnit> genTargettingSearches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenIndexUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_INDEX_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenSelectAction> getGenTargettingActions() {
		if (genTargettingActions == null) {
			genTargettingActions = new EObjectWithInverseResolvingEList<GenSelectAction>(GenSelectAction.class, this, GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_ACTIONS, GenJsfPackage.GEN_SELECT_ACTION__GEN_TARGET);
		}
		return genTargettingActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexUnit getJsfUnit() {
		if (jsfUnit != null && jsfUnit.eIsProxy()) {
			InternalEObject oldJsfUnit = (InternalEObject)jsfUnit;
			jsfUnit = (IndexUnit)eResolveProxy(oldJsfUnit);
			if (jsfUnit != oldJsfUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_INDEX_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
			}
		}
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexUnit basicGetJsfUnit() {
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfUnit(IndexUnit newJsfUnit) {
		IndexUnit oldJsfUnit = jsfUnit;
		jsfUnit = newJsfUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_INDEX_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenSearchUnit> getGenTargettingSearches() {
		if (genTargettingSearches == null) {
			genTargettingSearches = new EObjectWithInverseResolvingEList<GenSearchUnit>(GenSearchUnit.class, this, GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES, GenJsfPackage.GEN_SEARCH_UNIT__GEN_RESULT_DESTINATION);
		}
		return genTargettingSearches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenInlineAction> getGenActions() {
		if (genActions == null) {
			genActions = new EObjectContainmentWithInverseEList<GenInlineAction>(GenInlineAction.class, this, GenJsfPackage.GEN_INDEX_UNIT__GEN_ACTIONS, GenJsfPackage.GEN_INLINE_ACTION__GEN_USED_BY);
		}
		return genActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenActions()).basicAdd(otherEnd, msgs);
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenTargettingActions()).basicAdd(otherEnd, msgs);
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenTargettingSearches()).basicAdd(otherEnd, msgs);
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
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_ACTIONS:
				return ((InternalEList<?>)getGenActions()).basicRemove(otherEnd, msgs);
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_ACTIONS:
				return ((InternalEList<?>)getGenTargettingActions()).basicRemove(otherEnd, msgs);
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES:
				return ((InternalEList<?>)getGenTargettingSearches()).basicRemove(otherEnd, msgs);
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

		if (oldGenUnit instanceof GenIndexUnit) {
			final GenIndexUnit oldGenIndexUnit = (GenIndexUnit) oldGenUnit;
			final Map<String, GenInlineAction> oldActions = new HashMap<String, GenInlineAction>();
			for (GenInlineAction oldAction : oldGenIndexUnit.getGenActions()) {
				oldActions.put(oldAction.getJsfAction().getName(), oldAction);
			}
			for (GenInlineAction newAction : getGenActions()) {
				final String name = newAction.getJsfAction().getName();
				if (oldActions.containsKey(name)) {
					newAction.reconcile(oldActions.get(name));
				}
			}
		}
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
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_ACTIONS:
				return getGenActions();
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_ACTIONS:
				return getGenTargettingActions();
			case GenJsfPackage.GEN_INDEX_UNIT__JSF_UNIT:
				if (resolve) return getJsfUnit();
				return basicGetJsfUnit();
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES:
				return getGenTargettingSearches();
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
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_ACTIONS:
				getGenActions().clear();
				getGenActions().addAll((Collection<? extends GenInlineAction>)newValue);
				return;
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_ACTIONS:
				getGenTargettingActions().clear();
				getGenTargettingActions().addAll((Collection<? extends GenSelectAction>)newValue);
				return;
			case GenJsfPackage.GEN_INDEX_UNIT__JSF_UNIT:
				setJsfUnit((IndexUnit)newValue);
				return;
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES:
				getGenTargettingSearches().clear();
				getGenTargettingSearches().addAll((Collection<? extends GenSearchUnit>)newValue);
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
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_ACTIONS:
				getGenActions().clear();
				return;
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_ACTIONS:
				getGenTargettingActions().clear();
				return;
			case GenJsfPackage.GEN_INDEX_UNIT__JSF_UNIT:
				setJsfUnit((IndexUnit)null);
				return;
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES:
				getGenTargettingSearches().clear();
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
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_ACTIONS:
				return genActions != null && !genActions.isEmpty();
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_ACTIONS:
				return genTargettingActions != null && !genTargettingActions.isEmpty();
			case GenJsfPackage.GEN_INDEX_UNIT__JSF_UNIT:
				return jsfUnit != null;
			case GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES:
				return genTargettingSearches != null && !genTargettingSearches.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GenInlineActionContainer.class) {
			switch (derivedFeatureID) {
				case GenJsfPackage.GEN_INDEX_UNIT__GEN_ACTIONS: return GenJsfPackage.GEN_INLINE_ACTION_CONTAINER__GEN_ACTIONS;
				default: return -1;
			}
		}
		if (baseClass == GenSelectTarget.class) {
			switch (derivedFeatureID) {
				case GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_ACTIONS: return GenJsfPackage.GEN_SELECT_TARGET__GEN_TARGETTING_ACTIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GenInlineActionContainer.class) {
			switch (baseFeatureID) {
				case GenJsfPackage.GEN_INLINE_ACTION_CONTAINER__GEN_ACTIONS: return GenJsfPackage.GEN_INDEX_UNIT__GEN_ACTIONS;
				default: return -1;
			}
		}
		if (baseClass == GenSelectTarget.class) {
			switch (baseFeatureID) {
				case GenJsfPackage.GEN_SELECT_TARGET__GEN_TARGETTING_ACTIONS: return GenJsfPackage.GEN_INDEX_UNIT__GEN_TARGETTING_ACTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GenIndexUnitImpl
