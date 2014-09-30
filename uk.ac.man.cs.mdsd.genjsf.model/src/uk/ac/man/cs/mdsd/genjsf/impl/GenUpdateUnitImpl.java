/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenUpdateUnitImpl.java,v 1.7 2014/01/25 17:38:18 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenSelectAction;
import uk.ac.man.cs.mdsd.genjsf.GenSelectTarget;
import uk.ac.man.cs.mdsd.genjsf.GenUpdateUnit;
import uk.ac.man.cs.mdsd.jsf.UpdateUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Update Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUpdateUnitImpl#getGenTargettingActions <em>Gen Targetting Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUpdateUnitImpl#getJsfUnit <em>Jsf Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenUpdateUnitImpl extends GenEditUnitImpl implements GenUpdateUnit {
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
	protected UpdateUnit jsfUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenUpdateUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_UPDATE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenSelectAction> getGenTargettingActions() {
		if (genTargettingActions == null) {
			genTargettingActions = new EObjectWithInverseResolvingEList<GenSelectAction>(GenSelectAction.class, this, GenJsfPackage.GEN_UPDATE_UNIT__GEN_TARGETTING_ACTIONS, GenJsfPackage.GEN_SELECT_ACTION__GEN_TARGET);
		}
		return genTargettingActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateUnit getJsfUnit() {
		if (jsfUnit != null && jsfUnit.eIsProxy()) {
			InternalEObject oldJsfUnit = (InternalEObject)jsfUnit;
			jsfUnit = (UpdateUnit)eResolveProxy(oldJsfUnit);
			if (jsfUnit != oldJsfUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_UPDATE_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
			}
		}
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateUnit basicGetJsfUnit() {
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfUnit(UpdateUnit newJsfUnit) {
		UpdateUnit oldJsfUnit = jsfUnit;
		jsfUnit = newJsfUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UPDATE_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
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
			case GenJsfPackage.GEN_UPDATE_UNIT__GEN_TARGETTING_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenTargettingActions()).basicAdd(otherEnd, msgs);
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
			case GenJsfPackage.GEN_UPDATE_UNIT__GEN_TARGETTING_ACTIONS:
				return ((InternalEList<?>)getGenTargettingActions()).basicRemove(otherEnd, msgs);
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
			case GenJsfPackage.GEN_UPDATE_UNIT__GEN_TARGETTING_ACTIONS:
				return getGenTargettingActions();
			case GenJsfPackage.GEN_UPDATE_UNIT__JSF_UNIT:
				if (resolve) return getJsfUnit();
				return basicGetJsfUnit();
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
			case GenJsfPackage.GEN_UPDATE_UNIT__GEN_TARGETTING_ACTIONS:
				getGenTargettingActions().clear();
				getGenTargettingActions().addAll((Collection<? extends GenSelectAction>)newValue);
				return;
			case GenJsfPackage.GEN_UPDATE_UNIT__JSF_UNIT:
				setJsfUnit((UpdateUnit)newValue);
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
			case GenJsfPackage.GEN_UPDATE_UNIT__GEN_TARGETTING_ACTIONS:
				getGenTargettingActions().clear();
				return;
			case GenJsfPackage.GEN_UPDATE_UNIT__JSF_UNIT:
				setJsfUnit((UpdateUnit)null);
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
			case GenJsfPackage.GEN_UPDATE_UNIT__GEN_TARGETTING_ACTIONS:
				return genTargettingActions != null && !genTargettingActions.isEmpty();
			case GenJsfPackage.GEN_UPDATE_UNIT__JSF_UNIT:
				return jsfUnit != null;
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
		if (baseClass == GenSelectTarget.class) {
			switch (derivedFeatureID) {
				case GenJsfPackage.GEN_UPDATE_UNIT__GEN_TARGETTING_ACTIONS: return GenJsfPackage.GEN_SELECT_TARGET__GEN_TARGETTING_ACTIONS;
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
		if (baseClass == GenSelectTarget.class) {
			switch (baseFeatureID) {
				case GenJsfPackage.GEN_SELECT_TARGET__GEN_TARGETTING_ACTIONS: return GenJsfPackage.GEN_UPDATE_UNIT__GEN_TARGETTING_ACTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GenUpdateUnitImpl
