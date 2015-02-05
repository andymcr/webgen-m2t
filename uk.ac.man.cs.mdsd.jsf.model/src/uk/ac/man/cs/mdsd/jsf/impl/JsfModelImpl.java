/**
 * <copyright>
 * </copyright>
 *
 * $Id: JsfModelImpl.java,v 1.11 2013/12/12 23:05:17 andy Exp $
 */
package uk.ac.man.cs.mdsd.jsf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.jsf.AjaxTechnologies;
import uk.ac.man.cs.mdsd.jsf.Authentication;
import uk.ac.man.cs.mdsd.jsf.FrameworkTechnologies;
import uk.ac.man.cs.mdsd.jsf.JsfModel;
import uk.ac.man.cs.mdsd.jsf.JsfPackage;
import uk.ac.man.cs.mdsd.jsf.Menu;
import uk.ac.man.cs.mdsd.jsf.Page;

import uk.ac.man.cs.mdsd.jsf.Service;
import uk.ac.man.cs.mdsd.orm.OrmModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getServices <em>Services</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getMenus <em>Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getSiteName <em>Site Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getSiteTitle <em>Site Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getWebmasterEmail <em>Webmaster Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getMetaDescription <em>Meta Description</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getFrameworkTechnology <em>Framework Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getAjaxTechnology <em>Ajax Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getCaptchaSiteKey <em>Captcha Site Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getCaptchaSecretKey <em>Captcha Secret Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getTopNavigationId <em>Top Navigation Id</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl#isStaticUnitsEditable <em>Static Units Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsfModelImpl extends EObjectImpl implements JsfModel {
	/**
	 * The cached value of the '{@link #getPersistence() <em>Persistence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected OrmModel persistence;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> menus;

	/**
	 * The default value of the '{@link #getSiteName() <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteName()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteName() <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteName()
	 * @generated
	 * @ordered
	 */
	protected String siteName = SITE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSiteTitle() <em>Site Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteTitle() <em>Site Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteTitle()
	 * @generated
	 * @ordered
	 */
	protected String siteTitle = SITE_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebmasterEmail() <em>Webmaster Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebmasterEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBMASTER_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebmasterEmail() <em>Webmaster Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebmasterEmail()
	 * @generated
	 * @ordered
	 */
	protected String webmasterEmail = WEBMASTER_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyrightText() <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightText()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyrightText() <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightText()
	 * @generated
	 * @ordered
	 */
	protected String copyrightText = COPYRIGHT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaDescription() <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String META_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaDescription() <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDescription()
	 * @generated
	 * @ordered
	 */
	protected String metaDescription = META_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameworkTechnology() <em>Framework Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final FrameworkTechnologies FRAMEWORK_TECHNOLOGY_EDEFAULT = FrameworkTechnologies.JSF;

	/**
	 * The cached value of the '{@link #getFrameworkTechnology() <em>Framework Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkTechnology()
	 * @generated
	 * @ordered
	 */
	protected FrameworkTechnologies frameworkTechnology = FRAMEWORK_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAjaxTechnology() <em>Ajax Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAjaxTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final AjaxTechnologies AJAX_TECHNOLOGY_EDEFAULT = AjaxTechnologies.NONE;

	/**
	 * The cached value of the '{@link #getAjaxTechnology() <em>Ajax Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAjaxTechnology()
	 * @generated
	 * @ordered
	 */
	protected AjaxTechnologies ajaxTechnology = AJAX_TECHNOLOGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected Authentication authentication;

	/**
	 * The default value of the '{@link #getCaptchaSiteKey() <em>Captcha Site Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptchaSiteKey()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTCHA_SITE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptchaSiteKey() <em>Captcha Site Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptchaSiteKey()
	 * @generated
	 * @ordered
	 */
	protected String captchaSiteKey = CAPTCHA_SITE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptchaSecretKey() <em>Captcha Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptchaSecretKey()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTCHA_SECRET_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptchaSecretKey() <em>Captcha Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptchaSecretKey()
	 * @generated
	 * @ordered
	 */
	protected String captchaSecretKey = CAPTCHA_SECRET_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopNavigationId() <em>Top Navigation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopNavigationId()
	 * @generated
	 * @ordered
	 */
	protected static final String TOP_NAVIGATION_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTopNavigationId() <em>Top Navigation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopNavigationId()
	 * @generated
	 * @ordered
	 */
	protected String topNavigationId = TOP_NAVIGATION_ID_EDEFAULT;

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
	 * The default value of the '{@link #isStaticUnitsEditable() <em>Static Units Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStaticUnitsEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_UNITS_EDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStaticUnitsEditable() <em>Static Units Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStaticUnitsEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean staticUnitsEditable = STATIC_UNITS_EDITABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsfModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsfPackage.Literals.JSF_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmModel getPersistence() {
		if (persistence != null && persistence.eIsProxy()) {
			InternalEObject oldPersistence = (InternalEObject)persistence;
			persistence = (OrmModel)eResolveProxy(oldPersistence);
			if (persistence != oldPersistence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.JSF_MODEL__PERSISTENCE, oldPersistence, persistence));
			}
		}
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmModel basicGetPersistence() {
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistence(OrmModel newPersistence) {
		OrmModel oldPersistence = persistence;
		persistence = newPersistence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__PERSISTENCE, oldPersistence, persistence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, JsfPackage.JSF_MODEL__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentWithInverseEList<Page>(Page.class, this, JsfPackage.JSF_MODEL__PAGES, JsfPackage.PAGE__PART_OF);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menu> getMenus() {
		if (menus == null) {
			menus = new EObjectContainmentEList<Menu>(Menu.class, this, JsfPackage.JSF_MODEL__MENUS);
		}
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSiteName() {
		return siteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteName(String newSiteName) {
		String oldSiteName = siteName;
		siteName = newSiteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__SITE_NAME, oldSiteName, siteName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSiteTitle() {
		return siteTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteTitle(String newSiteTitle) {
		String oldSiteTitle = siteTitle;
		siteTitle = newSiteTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__SITE_TITLE, oldSiteTitle, siteTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebmasterEmail() {
		return webmasterEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebmasterEmail(String newWebmasterEmail) {
		String oldWebmasterEmail = webmasterEmail;
		webmasterEmail = newWebmasterEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__WEBMASTER_EMAIL, oldWebmasterEmail, webmasterEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyrightText() {
		return copyrightText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyrightText(String newCopyrightText) {
		String oldCopyrightText = copyrightText;
		copyrightText = newCopyrightText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__COPYRIGHT_TEXT, oldCopyrightText, copyrightText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaDescription() {
		return metaDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaDescription(String newMetaDescription) {
		String oldMetaDescription = metaDescription;
		metaDescription = newMetaDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__META_DESCRIPTION, oldMetaDescription, metaDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkTechnologies getFrameworkTechnology() {
		return frameworkTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameworkTechnology(FrameworkTechnologies newFrameworkTechnology) {
		FrameworkTechnologies oldFrameworkTechnology = frameworkTechnology;
		frameworkTechnology = newFrameworkTechnology == null ? FRAMEWORK_TECHNOLOGY_EDEFAULT : newFrameworkTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__FRAMEWORK_TECHNOLOGY, oldFrameworkTechnology, frameworkTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AjaxTechnologies getAjaxTechnology() {
		return ajaxTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAjaxTechnology(AjaxTechnologies newAjaxTechnology) {
		AjaxTechnologies oldAjaxTechnology = ajaxTechnology;
		ajaxTechnology = newAjaxTechnology == null ? AJAX_TECHNOLOGY_EDEFAULT : newAjaxTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__AJAX_TECHNOLOGY, oldAjaxTechnology, ajaxTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authentication getAuthentication() {
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthentication(Authentication newAuthentication, NotificationChain msgs) {
		Authentication oldAuthentication = authentication;
		authentication = newAuthentication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__AUTHENTICATION, oldAuthentication, newAuthentication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthentication(Authentication newAuthentication) {
		if (newAuthentication != authentication) {
			NotificationChain msgs = null;
			if (authentication != null)
				msgs = ((InternalEObject)authentication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsfPackage.JSF_MODEL__AUTHENTICATION, null, msgs);
			if (newAuthentication != null)
				msgs = ((InternalEObject)newAuthentication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsfPackage.JSF_MODEL__AUTHENTICATION, null, msgs);
			msgs = basicSetAuthentication(newAuthentication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__AUTHENTICATION, newAuthentication, newAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptchaSiteKey() {
		return captchaSiteKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptchaSiteKey(String newCaptchaSiteKey) {
		String oldCaptchaSiteKey = captchaSiteKey;
		captchaSiteKey = newCaptchaSiteKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__CAPTCHA_SITE_KEY, oldCaptchaSiteKey, captchaSiteKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptchaSecretKey() {
		return captchaSecretKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptchaSecretKey(String newCaptchaSecretKey) {
		String oldCaptchaSecretKey = captchaSecretKey;
		captchaSecretKey = newCaptchaSecretKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__CAPTCHA_SECRET_KEY, oldCaptchaSecretKey, captchaSecretKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopNavigationId() {
		return topNavigationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopNavigationId(String newTopNavigationId) {
		String oldTopNavigationId = topNavigationId;
		topNavigationId = newTopNavigationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__TOP_NAVIGATION_ID, oldTopNavigationId, topNavigationId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.JSF_MODEL__SIDE_MENU, oldSideMenu, sideMenu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__SIDE_MENU, oldSideMenu, sideMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStaticUnitsEditable() {
		return staticUnitsEditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticUnitsEditable(boolean newStaticUnitsEditable) {
		boolean oldStaticUnitsEditable = staticUnitsEditable;
		staticUnitsEditable = newStaticUnitsEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.JSF_MODEL__STATIC_UNITS_EDITABLE, oldStaticUnitsEditable, staticUnitsEditable));
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
			case JsfPackage.JSF_MODEL__PAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPages()).basicAdd(otherEnd, msgs);
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
			case JsfPackage.JSF_MODEL__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case JsfPackage.JSF_MODEL__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case JsfPackage.JSF_MODEL__MENUS:
				return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
			case JsfPackage.JSF_MODEL__AUTHENTICATION:
				return basicSetAuthentication(null, msgs);
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
			case JsfPackage.JSF_MODEL__PERSISTENCE:
				if (resolve) return getPersistence();
				return basicGetPersistence();
			case JsfPackage.JSF_MODEL__SERVICES:
				return getServices();
			case JsfPackage.JSF_MODEL__PAGES:
				return getPages();
			case JsfPackage.JSF_MODEL__MENUS:
				return getMenus();
			case JsfPackage.JSF_MODEL__SITE_NAME:
				return getSiteName();
			case JsfPackage.JSF_MODEL__SITE_TITLE:
				return getSiteTitle();
			case JsfPackage.JSF_MODEL__WEBMASTER_EMAIL:
				return getWebmasterEmail();
			case JsfPackage.JSF_MODEL__COPYRIGHT_TEXT:
				return getCopyrightText();
			case JsfPackage.JSF_MODEL__META_DESCRIPTION:
				return getMetaDescription();
			case JsfPackage.JSF_MODEL__FRAMEWORK_TECHNOLOGY:
				return getFrameworkTechnology();
			case JsfPackage.JSF_MODEL__AJAX_TECHNOLOGY:
				return getAjaxTechnology();
			case JsfPackage.JSF_MODEL__AUTHENTICATION:
				return getAuthentication();
			case JsfPackage.JSF_MODEL__CAPTCHA_SITE_KEY:
				return getCaptchaSiteKey();
			case JsfPackage.JSF_MODEL__CAPTCHA_SECRET_KEY:
				return getCaptchaSecretKey();
			case JsfPackage.JSF_MODEL__TOP_NAVIGATION_ID:
				return getTopNavigationId();
			case JsfPackage.JSF_MODEL__SIDE_MENU:
				if (resolve) return getSideMenu();
				return basicGetSideMenu();
			case JsfPackage.JSF_MODEL__STATIC_UNITS_EDITABLE:
				return isStaticUnitsEditable();
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
			case JsfPackage.JSF_MODEL__PERSISTENCE:
				setPersistence((OrmModel)newValue);
				return;
			case JsfPackage.JSF_MODEL__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case JsfPackage.JSF_MODEL__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case JsfPackage.JSF_MODEL__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends Menu>)newValue);
				return;
			case JsfPackage.JSF_MODEL__SITE_NAME:
				setSiteName((String)newValue);
				return;
			case JsfPackage.JSF_MODEL__SITE_TITLE:
				setSiteTitle((String)newValue);
				return;
			case JsfPackage.JSF_MODEL__WEBMASTER_EMAIL:
				setWebmasterEmail((String)newValue);
				return;
			case JsfPackage.JSF_MODEL__COPYRIGHT_TEXT:
				setCopyrightText((String)newValue);
				return;
			case JsfPackage.JSF_MODEL__META_DESCRIPTION:
				setMetaDescription((String)newValue);
				return;
			case JsfPackage.JSF_MODEL__FRAMEWORK_TECHNOLOGY:
				setFrameworkTechnology((FrameworkTechnologies)newValue);
				return;
			case JsfPackage.JSF_MODEL__AJAX_TECHNOLOGY:
				setAjaxTechnology((AjaxTechnologies)newValue);
				return;
			case JsfPackage.JSF_MODEL__AUTHENTICATION:
				setAuthentication((Authentication)newValue);
				return;
			case JsfPackage.JSF_MODEL__CAPTCHA_SITE_KEY:
				setCaptchaSiteKey((String)newValue);
				return;
			case JsfPackage.JSF_MODEL__CAPTCHA_SECRET_KEY:
				setCaptchaSecretKey((String)newValue);
				return;
			case JsfPackage.JSF_MODEL__TOP_NAVIGATION_ID:
				setTopNavigationId((String)newValue);
				return;
			case JsfPackage.JSF_MODEL__SIDE_MENU:
				setSideMenu((Menu)newValue);
				return;
			case JsfPackage.JSF_MODEL__STATIC_UNITS_EDITABLE:
				setStaticUnitsEditable((Boolean)newValue);
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
			case JsfPackage.JSF_MODEL__PERSISTENCE:
				setPersistence((OrmModel)null);
				return;
			case JsfPackage.JSF_MODEL__SERVICES:
				getServices().clear();
				return;
			case JsfPackage.JSF_MODEL__PAGES:
				getPages().clear();
				return;
			case JsfPackage.JSF_MODEL__MENUS:
				getMenus().clear();
				return;
			case JsfPackage.JSF_MODEL__SITE_NAME:
				setSiteName(SITE_NAME_EDEFAULT);
				return;
			case JsfPackage.JSF_MODEL__SITE_TITLE:
				setSiteTitle(SITE_TITLE_EDEFAULT);
				return;
			case JsfPackage.JSF_MODEL__WEBMASTER_EMAIL:
				setWebmasterEmail(WEBMASTER_EMAIL_EDEFAULT);
				return;
			case JsfPackage.JSF_MODEL__COPYRIGHT_TEXT:
				setCopyrightText(COPYRIGHT_TEXT_EDEFAULT);
				return;
			case JsfPackage.JSF_MODEL__META_DESCRIPTION:
				setMetaDescription(META_DESCRIPTION_EDEFAULT);
				return;
			case JsfPackage.JSF_MODEL__FRAMEWORK_TECHNOLOGY:
				setFrameworkTechnology(FRAMEWORK_TECHNOLOGY_EDEFAULT);
				return;
			case JsfPackage.JSF_MODEL__AJAX_TECHNOLOGY:
				setAjaxTechnology(AJAX_TECHNOLOGY_EDEFAULT);
				return;
			case JsfPackage.JSF_MODEL__AUTHENTICATION:
				setAuthentication((Authentication)null);
				return;
			case JsfPackage.JSF_MODEL__CAPTCHA_SITE_KEY:
				setCaptchaSiteKey(CAPTCHA_SITE_KEY_EDEFAULT);
				return;
			case JsfPackage.JSF_MODEL__CAPTCHA_SECRET_KEY:
				setCaptchaSecretKey(CAPTCHA_SECRET_KEY_EDEFAULT);
				return;
			case JsfPackage.JSF_MODEL__TOP_NAVIGATION_ID:
				setTopNavigationId(TOP_NAVIGATION_ID_EDEFAULT);
				return;
			case JsfPackage.JSF_MODEL__SIDE_MENU:
				setSideMenu((Menu)null);
				return;
			case JsfPackage.JSF_MODEL__STATIC_UNITS_EDITABLE:
				setStaticUnitsEditable(STATIC_UNITS_EDITABLE_EDEFAULT);
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
			case JsfPackage.JSF_MODEL__PERSISTENCE:
				return persistence != null;
			case JsfPackage.JSF_MODEL__SERVICES:
				return services != null && !services.isEmpty();
			case JsfPackage.JSF_MODEL__PAGES:
				return pages != null && !pages.isEmpty();
			case JsfPackage.JSF_MODEL__MENUS:
				return menus != null && !menus.isEmpty();
			case JsfPackage.JSF_MODEL__SITE_NAME:
				return SITE_NAME_EDEFAULT == null ? siteName != null : !SITE_NAME_EDEFAULT.equals(siteName);
			case JsfPackage.JSF_MODEL__SITE_TITLE:
				return SITE_TITLE_EDEFAULT == null ? siteTitle != null : !SITE_TITLE_EDEFAULT.equals(siteTitle);
			case JsfPackage.JSF_MODEL__WEBMASTER_EMAIL:
				return WEBMASTER_EMAIL_EDEFAULT == null ? webmasterEmail != null : !WEBMASTER_EMAIL_EDEFAULT.equals(webmasterEmail);
			case JsfPackage.JSF_MODEL__COPYRIGHT_TEXT:
				return COPYRIGHT_TEXT_EDEFAULT == null ? copyrightText != null : !COPYRIGHT_TEXT_EDEFAULT.equals(copyrightText);
			case JsfPackage.JSF_MODEL__META_DESCRIPTION:
				return META_DESCRIPTION_EDEFAULT == null ? metaDescription != null : !META_DESCRIPTION_EDEFAULT.equals(metaDescription);
			case JsfPackage.JSF_MODEL__FRAMEWORK_TECHNOLOGY:
				return frameworkTechnology != FRAMEWORK_TECHNOLOGY_EDEFAULT;
			case JsfPackage.JSF_MODEL__AJAX_TECHNOLOGY:
				return ajaxTechnology != AJAX_TECHNOLOGY_EDEFAULT;
			case JsfPackage.JSF_MODEL__AUTHENTICATION:
				return authentication != null;
			case JsfPackage.JSF_MODEL__CAPTCHA_SITE_KEY:
				return CAPTCHA_SITE_KEY_EDEFAULT == null ? captchaSiteKey != null : !CAPTCHA_SITE_KEY_EDEFAULT.equals(captchaSiteKey);
			case JsfPackage.JSF_MODEL__CAPTCHA_SECRET_KEY:
				return CAPTCHA_SECRET_KEY_EDEFAULT == null ? captchaSecretKey != null : !CAPTCHA_SECRET_KEY_EDEFAULT.equals(captchaSecretKey);
			case JsfPackage.JSF_MODEL__TOP_NAVIGATION_ID:
				return TOP_NAVIGATION_ID_EDEFAULT == null ? topNavigationId != null : !TOP_NAVIGATION_ID_EDEFAULT.equals(topNavigationId);
			case JsfPackage.JSF_MODEL__SIDE_MENU:
				return sideMenu != null;
			case JsfPackage.JSF_MODEL__STATIC_UNITS_EDITABLE:
				return staticUnitsEditable != STATIC_UNITS_EDITABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (siteName: ");
		result.append(siteName);
		result.append(", siteTitle: ");
		result.append(siteTitle);
		result.append(", webmasterEmail: ");
		result.append(webmasterEmail);
		result.append(", copyrightText: ");
		result.append(copyrightText);
		result.append(", metaDescription: ");
		result.append(metaDescription);
		result.append(", frameworkTechnology: ");
		result.append(frameworkTechnology);
		result.append(", ajaxTechnology: ");
		result.append(ajaxTechnology);
		result.append(", captchaSiteKey: ");
		result.append(captchaSiteKey);
		result.append(", captchaSecretKey: ");
		result.append(captchaSecretKey);
		result.append(", topNavigationId: ");
		result.append(topNavigationId);
		result.append(", staticUnitsEditable: ");
		result.append(staticUnitsEditable);
		result.append(')');
		return result.toString();
	}

} //JsfModelImpl
