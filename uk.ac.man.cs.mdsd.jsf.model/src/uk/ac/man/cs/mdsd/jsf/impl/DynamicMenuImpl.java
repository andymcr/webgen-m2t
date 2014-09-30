/**
 */
package uk.ac.man.cs.mdsd.jsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.jsf.DynamicMenu;
import uk.ac.man.cs.mdsd.jsf.JsfPackage;
import uk.ac.man.cs.mdsd.jsf.Selection;
import uk.ac.man.cs.mdsd.jsf.Service;
import uk.ac.man.cs.mdsd.jsf.ServiceEntityElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.DynamicMenuImpl#getService <em>Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.DynamicMenuImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.DynamicMenuImpl#getDynamicTitle <em>Dynamic Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicMenuImpl extends MenuImpl implements DynamicMenu {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection selection;

	/**
	 * The cached value of the '{@link #getDynamicTitle() <em>Dynamic Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicTitle()
	 * @generated
	 * @ordered
	 */
	protected ServiceEntityElement dynamicTitle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicMenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsfPackage.Literals.DYNAMIC_MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Service)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.DYNAMIC_MENU__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.DYNAMIC_MENU__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (Selection)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.DYNAMIC_MENU__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Selection newSelection) {
		Selection oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.DYNAMIC_MENU__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement getDynamicTitle() {
		if (dynamicTitle != null && dynamicTitle.eIsProxy()) {
			InternalEObject oldDynamicTitle = (InternalEObject)dynamicTitle;
			dynamicTitle = (ServiceEntityElement)eResolveProxy(oldDynamicTitle);
			if (dynamicTitle != oldDynamicTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.DYNAMIC_MENU__DYNAMIC_TITLE, oldDynamicTitle, dynamicTitle));
			}
		}
		return dynamicTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement basicGetDynamicTitle() {
		return dynamicTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicTitle(ServiceEntityElement newDynamicTitle) {
		ServiceEntityElement oldDynamicTitle = dynamicTitle;
		dynamicTitle = newDynamicTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.DYNAMIC_MENU__DYNAMIC_TITLE, oldDynamicTitle, dynamicTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JsfPackage.DYNAMIC_MENU__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case JsfPackage.DYNAMIC_MENU__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case JsfPackage.DYNAMIC_MENU__DYNAMIC_TITLE:
				if (resolve) return getDynamicTitle();
				return basicGetDynamicTitle();
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
			case JsfPackage.DYNAMIC_MENU__SERVICE:
				setService((Service)newValue);
				return;
			case JsfPackage.DYNAMIC_MENU__SELECTION:
				setSelection((Selection)newValue);
				return;
			case JsfPackage.DYNAMIC_MENU__DYNAMIC_TITLE:
				setDynamicTitle((ServiceEntityElement)newValue);
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
			case JsfPackage.DYNAMIC_MENU__SERVICE:
				setService((Service)null);
				return;
			case JsfPackage.DYNAMIC_MENU__SELECTION:
				setSelection((Selection)null);
				return;
			case JsfPackage.DYNAMIC_MENU__DYNAMIC_TITLE:
				setDynamicTitle((ServiceEntityElement)null);
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
			case JsfPackage.DYNAMIC_MENU__SERVICE:
				return service != null;
			case JsfPackage.DYNAMIC_MENU__SELECTION:
				return selection != null;
			case JsfPackage.DYNAMIC_MENU__DYNAMIC_TITLE:
				return dynamicTitle != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicMenuImpl
