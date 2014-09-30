/**
 * <copyright>
 * </copyright>
 *
 * $Id: PageImpl.java,v 1.20 2013/12/12 23:05:17 andy Exp $
 */
package uk.ac.man.cs.mdsd.jsf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.jsf.ContentUnit;
import uk.ac.man.cs.mdsd.jsf.JsfModel;
import uk.ac.man.cs.mdsd.jsf.JsfPackage;
import uk.ac.man.cs.mdsd.jsf.Menu;
import uk.ac.man.cs.mdsd.jsf.Page;

import uk.ac.man.cs.mdsd.jsf.PageTopMenuOptions;
import uk.ac.man.cs.mdsd.jsf.UnitContainer;
import uk.ac.man.cs.mdsd.orm.impl.NamedDisplayElementImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.PageImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.PageImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.PageImpl#getParentPage <em>Parent Page</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.PageImpl#getChildPages <em>Child Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.PageImpl#getAuthenticated <em>Authenticated</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.PageImpl#getTopMenuOption <em>Top Menu Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.PageImpl#getTopMenuRank <em>Top Menu Rank</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.PageImpl#getNavigationLabel <em>Navigation Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.PageImpl#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.PageImpl#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends NamedDisplayElementImpl implements Page {
	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentUnit> units;

	/**
	 * The cached value of the '{@link #getParentPage() <em>Parent Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentPage()
	 * @generated
	 * @ordered
	 */
	protected Page parentPage;

	/**
	 * The cached value of the '{@link #getChildPages() <em>Child Pages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> childPages;

	/**
	 * The default value of the '{@link #getAuthenticated() <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTHENTICATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthenticated() <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected Boolean authenticated = AUTHENTICATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopMenuOption() <em>Top Menu Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopMenuOption()
	 * @generated
	 * @ordered
	 */
	protected static final PageTopMenuOptions TOP_MENU_OPTION_EDEFAULT = PageTopMenuOptions.NEVER_INCLUDE;

	/**
	 * The cached value of the '{@link #getTopMenuOption() <em>Top Menu Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopMenuOption()
	 * @generated
	 * @ordered
	 */
	protected PageTopMenuOptions topMenuOption = TOP_MENU_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopMenuRank() <em>Top Menu Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopMenuRank()
	 * @generated
	 * @ordered
	 */
	protected static final int TOP_MENU_RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTopMenuRank() <em>Top Menu Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopMenuRank()
	 * @generated
	 * @ordered
	 */
	protected int topMenuRank = TOP_MENU_RANK_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavigationLabel() <em>Navigation Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVIGATION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavigationLabel() <em>Navigation Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationLabel()
	 * @generated
	 * @ordered
	 */
	protected String navigationLabel = NAVIGATION_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSideMenu() <em>Side Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideMenu()
	 * @generated
	 * @ordered
	 */
	protected Menu sideMenu;

	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected String styleClass = STYLE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsfPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getParentPage() {
		if (parentPage != null && parentPage.eIsProxy()) {
			InternalEObject oldParentPage = (InternalEObject)parentPage;
			parentPage = (Page)eResolveProxy(oldParentPage);
			if (parentPage != oldParentPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.PAGE__PARENT_PAGE, oldParentPage, parentPage));
			}
		}
		return parentPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetParentPage() {
		return parentPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentPage(Page newParentPage, NotificationChain msgs) {
		Page oldParentPage = parentPage;
		parentPage = newParentPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsfPackage.PAGE__PARENT_PAGE, oldParentPage, newParentPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentPage(Page newParentPage) {
		if (newParentPage != parentPage) {
			NotificationChain msgs = null;
			if (parentPage != null)
				msgs = ((InternalEObject)parentPage).eInverseRemove(this, JsfPackage.PAGE__CHILD_PAGES, Page.class, msgs);
			if (newParentPage != null)
				msgs = ((InternalEObject)newParentPage).eInverseAdd(this, JsfPackage.PAGE__CHILD_PAGES, Page.class, msgs);
			msgs = basicSetParentPage(newParentPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.PAGE__PARENT_PAGE, newParentPage, newParentPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getChildPages() {
		if (childPages == null) {
			childPages = new EObjectWithInverseResolvingEList<Page>(Page.class, this, JsfPackage.PAGE__CHILD_PAGES, JsfPackage.PAGE__PARENT_PAGE);
		}
		return childPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavigationLabel() {
		return navigationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationLabel(String newNavigationLabel) {
		String oldNavigationLabel = navigationLabel;
		navigationLabel = newNavigationLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.PAGE__NAVIGATION_LABEL, oldNavigationLabel, navigationLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu getSideMenu() {
		if (sideMenu != null && sideMenu.eIsProxy()) {
			InternalEObject oldSideMenu = (InternalEObject)sideMenu;
			sideMenu = (Menu)eResolveProxy(oldSideMenu);
			if (sideMenu != oldSideMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.PAGE__SIDE_MENU, oldSideMenu, sideMenu));
			}
		}
		return sideMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu basicGetSideMenu() {
		return sideMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideMenu(Menu newSideMenu) {
		Menu oldSideMenu = sideMenu;
		sideMenu = newSideMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.PAGE__SIDE_MENU, oldSideMenu, sideMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleClass() {
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleClass(String newStyleClass) {
		String oldStyleClass = styleClass;
		styleClass = newStyleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.PAGE__STYLE_CLASS, oldStyleClass, styleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAuthenticated() {
		return authenticated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticated(Boolean newAuthenticated) {
		Boolean oldAuthenticated = authenticated;
		authenticated = newAuthenticated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.PAGE__AUTHENTICATED, oldAuthenticated, authenticated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageTopMenuOptions getTopMenuOption() {
		return topMenuOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopMenuOption(PageTopMenuOptions newTopMenuOption) {
		PageTopMenuOptions oldTopMenuOption = topMenuOption;
		topMenuOption = newTopMenuOption == null ? TOP_MENU_OPTION_EDEFAULT : newTopMenuOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.PAGE__TOP_MENU_OPTION, oldTopMenuOption, topMenuOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTopMenuRank() {
		return topMenuRank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopMenuRank(int newTopMenuRank) {
		int oldTopMenuRank = topMenuRank;
		topMenuRank = newTopMenuRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.PAGE__TOP_MENU_RANK, oldTopMenuRank, topMenuRank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentUnit> getUnits() {
		if (units == null) {
			units = new EObjectContainmentWithInverseEList<ContentUnit>(ContentUnit.class, this, JsfPackage.PAGE__UNITS, JsfPackage.CONTENT_UNIT__DISPLAYED_ON);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsfModel getPartOf() {
		if (eContainerFeatureID() != JsfPackage.PAGE__PART_OF) return null;
		return (JsfModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(JsfModel newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, JsfPackage.PAGE__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(JsfModel newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != JsfPackage.PAGE__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, JsfPackage.JSF_MODEL__PAGES, JsfModel.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.PAGE__PART_OF, newPartOf, newPartOf));
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
			case JsfPackage.PAGE__UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnits()).basicAdd(otherEnd, msgs);
			case JsfPackage.PAGE__PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOf((JsfModel)otherEnd, msgs);
			case JsfPackage.PAGE__PARENT_PAGE:
				if (parentPage != null)
					msgs = ((InternalEObject)parentPage).eInverseRemove(this, JsfPackage.PAGE__CHILD_PAGES, Page.class, msgs);
				return basicSetParentPage((Page)otherEnd, msgs);
			case JsfPackage.PAGE__CHILD_PAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildPages()).basicAdd(otherEnd, msgs);
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
			case JsfPackage.PAGE__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
			case JsfPackage.PAGE__PART_OF:
				return basicSetPartOf(null, msgs);
			case JsfPackage.PAGE__PARENT_PAGE:
				return basicSetParentPage(null, msgs);
			case JsfPackage.PAGE__CHILD_PAGES:
				return ((InternalEList<?>)getChildPages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JsfPackage.PAGE__PART_OF:
				return eInternalContainer().eInverseRemove(this, JsfPackage.JSF_MODEL__PAGES, JsfModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JsfPackage.PAGE__UNITS:
				return getUnits();
			case JsfPackage.PAGE__PART_OF:
				return getPartOf();
			case JsfPackage.PAGE__PARENT_PAGE:
				if (resolve) return getParentPage();
				return basicGetParentPage();
			case JsfPackage.PAGE__CHILD_PAGES:
				return getChildPages();
			case JsfPackage.PAGE__AUTHENTICATED:
				return getAuthenticated();
			case JsfPackage.PAGE__TOP_MENU_OPTION:
				return getTopMenuOption();
			case JsfPackage.PAGE__TOP_MENU_RANK:
				return getTopMenuRank();
			case JsfPackage.PAGE__NAVIGATION_LABEL:
				return getNavigationLabel();
			case JsfPackage.PAGE__SIDE_MENU:
				if (resolve) return getSideMenu();
				return basicGetSideMenu();
			case JsfPackage.PAGE__STYLE_CLASS:
				return getStyleClass();
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
			case JsfPackage.PAGE__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends ContentUnit>)newValue);
				return;
			case JsfPackage.PAGE__PART_OF:
				setPartOf((JsfModel)newValue);
				return;
			case JsfPackage.PAGE__PARENT_PAGE:
				setParentPage((Page)newValue);
				return;
			case JsfPackage.PAGE__CHILD_PAGES:
				getChildPages().clear();
				getChildPages().addAll((Collection<? extends Page>)newValue);
				return;
			case JsfPackage.PAGE__AUTHENTICATED:
				setAuthenticated((Boolean)newValue);
				return;
			case JsfPackage.PAGE__TOP_MENU_OPTION:
				setTopMenuOption((PageTopMenuOptions)newValue);
				return;
			case JsfPackage.PAGE__TOP_MENU_RANK:
				setTopMenuRank((Integer)newValue);
				return;
			case JsfPackage.PAGE__NAVIGATION_LABEL:
				setNavigationLabel((String)newValue);
				return;
			case JsfPackage.PAGE__SIDE_MENU:
				setSideMenu((Menu)newValue);
				return;
			case JsfPackage.PAGE__STYLE_CLASS:
				setStyleClass((String)newValue);
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
			case JsfPackage.PAGE__UNITS:
				getUnits().clear();
				return;
			case JsfPackage.PAGE__PART_OF:
				setPartOf((JsfModel)null);
				return;
			case JsfPackage.PAGE__PARENT_PAGE:
				setParentPage((Page)null);
				return;
			case JsfPackage.PAGE__CHILD_PAGES:
				getChildPages().clear();
				return;
			case JsfPackage.PAGE__AUTHENTICATED:
				setAuthenticated(AUTHENTICATED_EDEFAULT);
				return;
			case JsfPackage.PAGE__TOP_MENU_OPTION:
				setTopMenuOption(TOP_MENU_OPTION_EDEFAULT);
				return;
			case JsfPackage.PAGE__TOP_MENU_RANK:
				setTopMenuRank(TOP_MENU_RANK_EDEFAULT);
				return;
			case JsfPackage.PAGE__NAVIGATION_LABEL:
				setNavigationLabel(NAVIGATION_LABEL_EDEFAULT);
				return;
			case JsfPackage.PAGE__SIDE_MENU:
				setSideMenu((Menu)null);
				return;
			case JsfPackage.PAGE__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
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
			case JsfPackage.PAGE__UNITS:
				return units != null && !units.isEmpty();
			case JsfPackage.PAGE__PART_OF:
				return getPartOf() != null;
			case JsfPackage.PAGE__PARENT_PAGE:
				return parentPage != null;
			case JsfPackage.PAGE__CHILD_PAGES:
				return childPages != null && !childPages.isEmpty();
			case JsfPackage.PAGE__AUTHENTICATED:
				return AUTHENTICATED_EDEFAULT == null ? authenticated != null : !AUTHENTICATED_EDEFAULT.equals(authenticated);
			case JsfPackage.PAGE__TOP_MENU_OPTION:
				return topMenuOption != TOP_MENU_OPTION_EDEFAULT;
			case JsfPackage.PAGE__TOP_MENU_RANK:
				return topMenuRank != TOP_MENU_RANK_EDEFAULT;
			case JsfPackage.PAGE__NAVIGATION_LABEL:
				return NAVIGATION_LABEL_EDEFAULT == null ? navigationLabel != null : !NAVIGATION_LABEL_EDEFAULT.equals(navigationLabel);
			case JsfPackage.PAGE__SIDE_MENU:
				return sideMenu != null;
			case JsfPackage.PAGE__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
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
		if (baseClass == UnitContainer.class) {
			switch (derivedFeatureID) {
				case JsfPackage.PAGE__UNITS: return JsfPackage.UNIT_CONTAINER__UNITS;
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
		if (baseClass == UnitContainer.class) {
			switch (baseFeatureID) {
				case JsfPackage.UNIT_CONTAINER__UNITS: return JsfPackage.PAGE__UNITS;
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
		result.append(" (authenticated: ");
		result.append(authenticated);
		result.append(", topMenuOption: ");
		result.append(topMenuOption);
		result.append(", topMenuRank: ");
		result.append(topMenuRank);
		result.append(", navigationLabel: ");
		result.append(navigationLabel);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(')');
		return result.toString();
	}

} //PageImpl
