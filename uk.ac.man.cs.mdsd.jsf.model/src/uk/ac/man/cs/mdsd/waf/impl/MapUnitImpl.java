/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.waf.WafPackage;
import uk.ac.man.cs.mdsd.waf.MapUnit;
import uk.ac.man.cs.mdsd.waf.SelectAction;
import uk.ac.man.cs.mdsd.waf.SelectTarget;
import uk.ac.man.cs.mdsd.waf.ServiceEntityElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.MapUnitImpl#getTargettingActions <em>Targetting Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.MapUnitImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.MapUnitImpl#getDefaultZoomLevel <em>Default Zoom Level</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.MapUnitImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.MapUnitImpl#getPlaceName <em>Place Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapUnitImpl extends EditUnitImpl implements MapUnit {
	/**
	 * The cached value of the '{@link #getTargettingActions() <em>Targetting Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargettingActions()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectAction> targettingActions;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultZoomLevel() <em>Default Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultZoomLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_ZOOM_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultZoomLevel() <em>Default Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultZoomLevel()
	 * @generated
	 * @ordered
	 */
	protected int defaultZoomLevel = DEFAULT_ZOOM_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected ServiceEntityElement location;

	/**
	 * The cached value of the '{@link #getPlaceName() <em>Place Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceName()
	 * @generated
	 * @ordered
	 */
	protected ServiceEntityElement placeName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.MAP_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectAction> getTargettingActions() {
		if (targettingActions == null) {
			targettingActions = new EObjectWithInverseResolvingEList<SelectAction>(SelectAction.class, this, WafPackage.MAP_UNIT__TARGETTING_ACTIONS, WafPackage.SELECT_ACTION__TARGET);
		}
		return targettingActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.MAP_UNIT__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultZoomLevel() {
		return defaultZoomLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultZoomLevel(int newDefaultZoomLevel) {
		int oldDefaultZoomLevel = defaultZoomLevel;
		defaultZoomLevel = newDefaultZoomLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL, oldDefaultZoomLevel, defaultZoomLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (ServiceEntityElement)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.MAP_UNIT__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(ServiceEntityElement newLocation) {
		ServiceEntityElement oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.MAP_UNIT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement getPlaceName() {
		if (placeName != null && placeName.eIsProxy()) {
			InternalEObject oldPlaceName = (InternalEObject)placeName;
			placeName = (ServiceEntityElement)eResolveProxy(oldPlaceName);
			if (placeName != oldPlaceName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.MAP_UNIT__PLACE_NAME, oldPlaceName, placeName));
			}
		}
		return placeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement basicGetPlaceName() {
		return placeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceName(ServiceEntityElement newPlaceName) {
		ServiceEntityElement oldPlaceName = placeName;
		placeName = newPlaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.MAP_UNIT__PLACE_NAME, oldPlaceName, placeName));
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
			case WafPackage.MAP_UNIT__TARGETTING_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargettingActions()).basicAdd(otherEnd, msgs);
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
			case WafPackage.MAP_UNIT__TARGETTING_ACTIONS:
				return ((InternalEList<?>)getTargettingActions()).basicRemove(otherEnd, msgs);
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
			case WafPackage.MAP_UNIT__TARGETTING_ACTIONS:
				return getTargettingActions();
			case WafPackage.MAP_UNIT__READ_ONLY:
				return isReadOnly();
			case WafPackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				return getDefaultZoomLevel();
			case WafPackage.MAP_UNIT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case WafPackage.MAP_UNIT__PLACE_NAME:
				if (resolve) return getPlaceName();
				return basicGetPlaceName();
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
			case WafPackage.MAP_UNIT__TARGETTING_ACTIONS:
				getTargettingActions().clear();
				getTargettingActions().addAll((Collection<? extends SelectAction>)newValue);
				return;
			case WafPackage.MAP_UNIT__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case WafPackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				setDefaultZoomLevel((Integer)newValue);
				return;
			case WafPackage.MAP_UNIT__LOCATION:
				setLocation((ServiceEntityElement)newValue);
				return;
			case WafPackage.MAP_UNIT__PLACE_NAME:
				setPlaceName((ServiceEntityElement)newValue);
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
			case WafPackage.MAP_UNIT__TARGETTING_ACTIONS:
				getTargettingActions().clear();
				return;
			case WafPackage.MAP_UNIT__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case WafPackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				setDefaultZoomLevel(DEFAULT_ZOOM_LEVEL_EDEFAULT);
				return;
			case WafPackage.MAP_UNIT__LOCATION:
				setLocation((ServiceEntityElement)null);
				return;
			case WafPackage.MAP_UNIT__PLACE_NAME:
				setPlaceName((ServiceEntityElement)null);
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
			case WafPackage.MAP_UNIT__TARGETTING_ACTIONS:
				return targettingActions != null && !targettingActions.isEmpty();
			case WafPackage.MAP_UNIT__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case WafPackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				return defaultZoomLevel != DEFAULT_ZOOM_LEVEL_EDEFAULT;
			case WafPackage.MAP_UNIT__LOCATION:
				return location != null;
			case WafPackage.MAP_UNIT__PLACE_NAME:
				return placeName != null;
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
		if (baseClass == SelectTarget.class) {
			switch (derivedFeatureID) {
				case WafPackage.MAP_UNIT__TARGETTING_ACTIONS: return WafPackage.SELECT_TARGET__TARGETTING_ACTIONS;
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
		if (baseClass == SelectTarget.class) {
			switch (baseFeatureID) {
				case WafPackage.SELECT_TARGET__TARGETTING_ACTIONS: return WafPackage.MAP_UNIT__TARGETTING_ACTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (readOnly: ");
		result.append(readOnly);
		result.append(", defaultZoomLevel: ");
		result.append(defaultZoomLevel);
		result.append(')');
		return result.toString();
	}

} //MapUnitImpl
