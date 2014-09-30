/**
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

import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenMapUnit;
import uk.ac.man.cs.mdsd.genjsf.GenSelectAction;
import uk.ac.man.cs.mdsd.genjsf.GenSelectTarget;

import uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement;
import uk.ac.man.cs.mdsd.jsf.MapUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Map Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMapUnitImpl#getGenTargettingActions <em>Gen Targetting Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMapUnitImpl#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMapUnitImpl#getGenLocation <em>Gen Location</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMapUnitImpl#getGenPlaceName <em>Gen Place Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenMapUnitImpl extends GenEditUnitImpl implements GenMapUnit {
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
	protected MapUnit jsfUnit;

	/**
	 * The cached value of the '{@link #getGenLocation() <em>Gen Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenLocation()
	 * @generated
	 * @ordered
	 */
	protected GenServiceEntityElement genLocation;

	/**
	 * The cached value of the '{@link #getGenPlaceName() <em>Gen Place Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenPlaceName()
	 * @generated
	 * @ordered
	 */
	protected GenServiceEntityElement genPlaceName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenMapUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_MAP_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenSelectAction> getGenTargettingActions() {
		if (genTargettingActions == null) {
			genTargettingActions = new EObjectWithInverseResolvingEList<GenSelectAction>(GenSelectAction.class, this, GenJsfPackage.GEN_MAP_UNIT__GEN_TARGETTING_ACTIONS, GenJsfPackage.GEN_SELECT_ACTION__GEN_TARGET);
		}
		return genTargettingActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapUnit getJsfUnit() {
		if (jsfUnit != null && jsfUnit.eIsProxy()) {
			InternalEObject oldJsfUnit = (InternalEObject)jsfUnit;
			jsfUnit = (MapUnit)eResolveProxy(oldJsfUnit);
			if (jsfUnit != oldJsfUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_MAP_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
			}
		}
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapUnit basicGetJsfUnit() {
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfUnit(MapUnit newJsfUnit) {
		MapUnit oldJsfUnit = jsfUnit;
		jsfUnit = newJsfUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_MAP_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityElement getGenLocation() {
		if (genLocation != null && genLocation.eIsProxy()) {
			InternalEObject oldGenLocation = (InternalEObject)genLocation;
			genLocation = (GenServiceEntityElement)eResolveProxy(oldGenLocation);
			if (genLocation != oldGenLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_MAP_UNIT__GEN_LOCATION, oldGenLocation, genLocation));
			}
		}
		return genLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityElement basicGetGenLocation() {
		return genLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenLocation(GenServiceEntityElement newGenLocation) {
		GenServiceEntityElement oldGenLocation = genLocation;
		genLocation = newGenLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_MAP_UNIT__GEN_LOCATION, oldGenLocation, genLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityElement getGenPlaceName() {
		if (genPlaceName != null && genPlaceName.eIsProxy()) {
			InternalEObject oldGenPlaceName = (InternalEObject)genPlaceName;
			genPlaceName = (GenServiceEntityElement)eResolveProxy(oldGenPlaceName);
			if (genPlaceName != oldGenPlaceName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_MAP_UNIT__GEN_PLACE_NAME, oldGenPlaceName, genPlaceName));
			}
		}
		return genPlaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityElement basicGetGenPlaceName() {
		return genPlaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenPlaceName(GenServiceEntityElement newGenPlaceName) {
		GenServiceEntityElement oldGenPlaceName = genPlaceName;
		genPlaceName = newGenPlaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_MAP_UNIT__GEN_PLACE_NAME, oldGenPlaceName, genPlaceName));
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
			case GenJsfPackage.GEN_MAP_UNIT__GEN_TARGETTING_ACTIONS:
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
			case GenJsfPackage.GEN_MAP_UNIT__GEN_TARGETTING_ACTIONS:
				return ((InternalEList<?>)getGenTargettingActions()).basicRemove(otherEnd, msgs);
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
			case GenJsfPackage.GEN_MAP_UNIT__GEN_TARGETTING_ACTIONS:
				return getGenTargettingActions();
			case GenJsfPackage.GEN_MAP_UNIT__JSF_UNIT:
				if (resolve) return getJsfUnit();
				return basicGetJsfUnit();
			case GenJsfPackage.GEN_MAP_UNIT__GEN_LOCATION:
				if (resolve) return getGenLocation();
				return basicGetGenLocation();
			case GenJsfPackage.GEN_MAP_UNIT__GEN_PLACE_NAME:
				if (resolve) return getGenPlaceName();
				return basicGetGenPlaceName();
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
			case GenJsfPackage.GEN_MAP_UNIT__GEN_TARGETTING_ACTIONS:
				getGenTargettingActions().clear();
				getGenTargettingActions().addAll((Collection<? extends GenSelectAction>)newValue);
				return;
			case GenJsfPackage.GEN_MAP_UNIT__JSF_UNIT:
				setJsfUnit((MapUnit)newValue);
				return;
			case GenJsfPackage.GEN_MAP_UNIT__GEN_LOCATION:
				setGenLocation((GenServiceEntityElement)newValue);
				return;
			case GenJsfPackage.GEN_MAP_UNIT__GEN_PLACE_NAME:
				setGenPlaceName((GenServiceEntityElement)newValue);
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
			case GenJsfPackage.GEN_MAP_UNIT__GEN_TARGETTING_ACTIONS:
				getGenTargettingActions().clear();
				return;
			case GenJsfPackage.GEN_MAP_UNIT__JSF_UNIT:
				setJsfUnit((MapUnit)null);
				return;
			case GenJsfPackage.GEN_MAP_UNIT__GEN_LOCATION:
				setGenLocation((GenServiceEntityElement)null);
				return;
			case GenJsfPackage.GEN_MAP_UNIT__GEN_PLACE_NAME:
				setGenPlaceName((GenServiceEntityElement)null);
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
			case GenJsfPackage.GEN_MAP_UNIT__GEN_TARGETTING_ACTIONS:
				return genTargettingActions != null && !genTargettingActions.isEmpty();
			case GenJsfPackage.GEN_MAP_UNIT__JSF_UNIT:
				return jsfUnit != null;
			case GenJsfPackage.GEN_MAP_UNIT__GEN_LOCATION:
				return genLocation != null;
			case GenJsfPackage.GEN_MAP_UNIT__GEN_PLACE_NAME:
				return genPlaceName != null;
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
				case GenJsfPackage.GEN_MAP_UNIT__GEN_TARGETTING_ACTIONS: return GenJsfPackage.GEN_SELECT_TARGET__GEN_TARGETTING_ACTIONS;
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
				case GenJsfPackage.GEN_SELECT_TARGET__GEN_TARGETTING_ACTIONS: return GenJsfPackage.GEN_MAP_UNIT__GEN_TARGETTING_ACTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GenMapUnitImpl
