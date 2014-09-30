/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenMenu;
import uk.ac.man.cs.mdsd.genjsf.GenSelection;
import uk.ac.man.cs.mdsd.genjsf.GenService;
import uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement;
import uk.ac.man.cs.mdsd.jsf.DynamicMenu;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Dynamic Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicMenuImpl#getJsfMenu <em>Jsf Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicMenuImpl#getGenService <em>Gen Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicMenuImpl#getGenSelection <em>Gen Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicMenuImpl#getGenDynamicTitle <em>Gen Dynamic Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenDynamicMenuImpl extends GenMenuImpl implements GenDynamicMenu {
	/**
	 * The cached value of the '{@link #getJsfMenu() <em>Jsf Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfMenu()
	 * @generated
	 * @ordered
	 */
	protected DynamicMenu jsfMenu;

	/**
	 * The cached value of the '{@link #getGenService() <em>Gen Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenService()
	 * @generated
	 * @ordered
	 */
	protected GenService genService;
	/**
	 * The cached value of the '{@link #getGenSelection() <em>Gen Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenSelection()
	 * @generated
	 * @ordered
	 */
	protected GenSelection genSelection;

	/**
	 * The cached value of the '{@link #getGenDynamicTitle() <em>Gen Dynamic Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDynamicTitle()
	 * @generated
	 * @ordered
	 */
	protected GenServiceEntityElement genDynamicTitle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDynamicMenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_DYNAMIC_MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicMenu getJsfMenu() {
		if (jsfMenu != null && jsfMenu.eIsProxy()) {
			InternalEObject oldJsfMenu = (InternalEObject)jsfMenu;
			jsfMenu = (DynamicMenu)eResolveProxy(oldJsfMenu);
			if (jsfMenu != oldJsfMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_DYNAMIC_MENU__JSF_MENU, oldJsfMenu, jsfMenu));
			}
		}
		return jsfMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicMenu basicGetJsfMenu() {
		return jsfMenu;
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
	public void setJsfMenu(DynamicMenu newJsfMenu) {
		DynamicMenu oldJsfMenu = jsfMenu;
		jsfMenu = newJsfMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_DYNAMIC_MENU__JSF_MENU, oldJsfMenu, jsfMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService getGenService() {
		if (genService != null && genService.eIsProxy()) {
			InternalEObject oldGenService = (InternalEObject)genService;
			genService = (GenService)eResolveProxy(oldGenService);
			if (genService != oldGenService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_DYNAMIC_MENU__GEN_SERVICE, oldGenService, genService));
			}
		}
		return genService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService basicGetGenService() {
		return genService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenService(GenService newGenService) {
		GenService oldGenService = genService;
		genService = newGenService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_DYNAMIC_MENU__GEN_SERVICE, oldGenService, genService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSelection getGenSelection() {
		if (genSelection != null && genSelection.eIsProxy()) {
			InternalEObject oldGenSelection = (InternalEObject)genSelection;
			genSelection = (GenSelection)eResolveProxy(oldGenSelection);
			if (genSelection != oldGenSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_DYNAMIC_MENU__GEN_SELECTION, oldGenSelection, genSelection));
			}
		}
		return genSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSelection basicGetGenSelection() {
		return genSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenSelection(GenSelection newGenSelection) {
		GenSelection oldGenSelection = genSelection;
		genSelection = newGenSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_DYNAMIC_MENU__GEN_SELECTION, oldGenSelection, genSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityElement getGenDynamicTitle() {
		if (genDynamicTitle != null && genDynamicTitle.eIsProxy()) {
			InternalEObject oldGenDynamicTitle = (InternalEObject)genDynamicTitle;
			genDynamicTitle = (GenServiceEntityElement)eResolveProxy(oldGenDynamicTitle);
			if (genDynamicTitle != oldGenDynamicTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_DYNAMIC_MENU__GEN_DYNAMIC_TITLE, oldGenDynamicTitle, genDynamicTitle));
			}
		}
		return genDynamicTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityElement basicGetGenDynamicTitle() {
		return genDynamicTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenDynamicTitle(GenServiceEntityElement newGenDynamicTitle) {
		GenServiceEntityElement oldGenDynamicTitle = genDynamicTitle;
		genDynamicTitle = newGenDynamicTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_DYNAMIC_MENU__GEN_DYNAMIC_TITLE, oldGenDynamicTitle, genDynamicTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_DYNAMIC_MENU__JSF_MENU:
				if (resolve) return getJsfMenu();
				return basicGetJsfMenu();
			case GenJsfPackage.GEN_DYNAMIC_MENU__GEN_SERVICE:
				if (resolve) return getGenService();
				return basicGetGenService();
			case GenJsfPackage.GEN_DYNAMIC_MENU__GEN_SELECTION:
				if (resolve) return getGenSelection();
				return basicGetGenSelection();
			case GenJsfPackage.GEN_DYNAMIC_MENU__GEN_DYNAMIC_TITLE:
				if (resolve) return getGenDynamicTitle();
				return basicGetGenDynamicTitle();
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
			case GenJsfPackage.GEN_DYNAMIC_MENU__JSF_MENU:
				setJsfMenu((DynamicMenu)newValue);
				return;
			case GenJsfPackage.GEN_DYNAMIC_MENU__GEN_SERVICE:
				setGenService((GenService)newValue);
				return;
			case GenJsfPackage.GEN_DYNAMIC_MENU__GEN_SELECTION:
				setGenSelection((GenSelection)newValue);
				return;
			case GenJsfPackage.GEN_DYNAMIC_MENU__GEN_DYNAMIC_TITLE:
				setGenDynamicTitle((GenServiceEntityElement)newValue);
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
			case GenJsfPackage.GEN_DYNAMIC_MENU__JSF_MENU:
				setJsfMenu((DynamicMenu)null);
				return;
			case GenJsfPackage.GEN_DYNAMIC_MENU__GEN_SERVICE:
				setGenService((GenService)null);
				return;
			case GenJsfPackage.GEN_DYNAMIC_MENU__GEN_SELECTION:
				setGenSelection((GenSelection)null);
				return;
			case GenJsfPackage.GEN_DYNAMIC_MENU__GEN_DYNAMIC_TITLE:
				setGenDynamicTitle((GenServiceEntityElement)null);
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
			case GenJsfPackage.GEN_DYNAMIC_MENU__JSF_MENU:
				return jsfMenu != null;
			case GenJsfPackage.GEN_DYNAMIC_MENU__GEN_SERVICE:
				return genService != null;
			case GenJsfPackage.GEN_DYNAMIC_MENU__GEN_SELECTION:
				return genSelection != null;
			case GenJsfPackage.GEN_DYNAMIC_MENU__GEN_DYNAMIC_TITLE:
				return genDynamicTitle != null;
		}
		return super.eIsSet(featureID);
	}

} //GenDynamicMenuImpl
