/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenMenu;
import uk.ac.man.cs.mdsd.genjsf.GenStaticMenu;
import uk.ac.man.cs.mdsd.jsf.StaticMenu;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Static Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenStaticMenuImpl#getJsfMenu <em>Jsf Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenStaticMenuImpl extends GenMenuImpl implements GenStaticMenu {
	/**
	 * The cached value of the '{@link #getJsfMenu() <em>Jsf Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfMenu()
	 * @generated
	 * @ordered
	 */
	protected StaticMenu jsfMenu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenStaticMenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_STATIC_MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticMenu getJsfMenu() {
		if (jsfMenu != null && jsfMenu.eIsProxy()) {
			InternalEObject oldJsfMenu = (InternalEObject)jsfMenu;
			jsfMenu = (StaticMenu)eResolveProxy(oldJsfMenu);
			if (jsfMenu != oldJsfMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_STATIC_MENU__JSF_MENU, oldJsfMenu, jsfMenu));
			}
		}
		return jsfMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticMenu basicGetJsfMenu() {
		return jsfMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfMenu(StaticMenu newJsfMenu) {
		StaticMenu oldJsfMenu = jsfMenu;
		jsfMenu = newJsfMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_STATIC_MENU__JSF_MENU, oldJsfMenu, jsfMenu));
	}

	/**
	 * @generated NOT
	 */
	public void reconcile(final GenMenu oldGenMenu) {
		super.reconcile(oldGenMenu);
	}

	/**
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenMenu oldGenMenu) {
		super.reconcileSettings(oldGenMenu);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_STATIC_MENU__JSF_MENU:
				if (resolve) return getJsfMenu();
				return basicGetJsfMenu();
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
			case GenJsfPackage.GEN_STATIC_MENU__JSF_MENU:
				setJsfMenu((StaticMenu)newValue);
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
			case GenJsfPackage.GEN_STATIC_MENU__JSF_MENU:
				setJsfMenu((StaticMenu)null);
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
			case GenJsfPackage.GEN_STATIC_MENU__JSF_MENU:
				return jsfMenu != null;
		}
		return super.eIsSet(featureID);
	}

} //GenStaticMenuImpl
