/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenJsfModelImpl.java,v 1.26 2014/01/12 23:07:02 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.genjsf.AjaxTechnologies;
import uk.ac.man.cs.mdsd.genjsf.GenAuthentication;
import uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu;
import uk.ac.man.cs.mdsd.genjsf.GenJsfModel;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenMenu;
import uk.ac.man.cs.mdsd.genjsf.GenPage;
import uk.ac.man.cs.mdsd.genjsf.GenService;
import uk.ac.man.cs.mdsd.genjsf.GenStaticMenu;
import uk.ac.man.cs.mdsd.genorm.GenOrmModel;
import uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl;
import uk.ac.man.cs.mdsd.jsf.JsfModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#getJsfModel <em>Jsf Model</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#getGenAuthentication <em>Gen Authentication</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#getGenServices <em>Gen Services</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#getGenPages <em>Gen Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#getGenMenus <em>Gen Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#isRewriteURLs <em>Rewrite UR Ls</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#isDevelopmentVersion <em>Development Version</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#getAjaxTechnology <em>Ajax Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#getTextEditorPath <em>Text Editor Path</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#getBackingPackage <em>Backing Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#getConverterPackage <em>Converter Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#getValidatorPackage <em>Validator Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#getServicePackage <em>Service Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#getSecurityPackage <em>Security Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl#getUiPackage <em>Ui Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenJsfModelImpl extends GenOrmModelImpl implements GenJsfModel {
	/**
	 * The cached value of the '{@link #getJsfModel() <em>Jsf Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfModel()
	 * @generated
	 * @ordered
	 */
	protected JsfModel jsfModel;

	/**
	 * The cached value of the '{@link #getGenAuthentication() <em>Gen Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenAuthentication()
	 * @generated
	 * @ordered
	 */
	protected GenAuthentication genAuthentication;

	/**
	 * The cached value of the '{@link #getGenServices() <em>Gen Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenServices()
	 * @generated
	 * @ordered
	 */
	protected EList<GenService> genServices;

	/**
	 * The cached value of the '{@link #getGenPages() <em>Gen Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenPages()
	 * @generated
	 * @ordered
	 */
	protected EList<GenPage> genPages;

	/**
	 * The cached value of the '{@link #getGenMenus() <em>Gen Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<GenMenu> genMenus;

	/**
	 * The default value of the '{@link #getBaseURL() <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseURL() <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURL()
	 * @generated
	 * @ordered
	 */
	protected String baseURL = BASE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #isRewriteURLs() <em>Rewrite UR Ls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRewriteURLs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REWRITE_UR_LS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRewriteURLs() <em>Rewrite UR Ls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRewriteURLs()
	 * @generated
	 * @ordered
	 */
	protected boolean rewriteURLs = REWRITE_UR_LS_EDEFAULT;

	/**
	 * The default value of the '{@link #isDevelopmentVersion() <em>Development Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDevelopmentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEVELOPMENT_VERSION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDevelopmentVersion() <em>Development Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDevelopmentVersion()
	 * @generated
	 * @ordered
	 */
	protected boolean developmentVersion = DEVELOPMENT_VERSION_EDEFAULT;

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
	 * The default value of the '{@link #getTextEditorPath() <em>Text Editor Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEditorPath()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDITOR_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextEditorPath() <em>Text Editor Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEditorPath()
	 * @generated
	 * @ordered
	 */
	protected String textEditorPath = TEXT_EDITOR_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackingPackage() <em>Backing Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackingPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKING_PACKAGE_EDEFAULT = "backing";

	/**
	 * The cached value of the '{@link #getBackingPackage() <em>Backing Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackingPackage()
	 * @generated
	 * @ordered
	 */
	protected String backingPackage = BACKING_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConverterPackage() <em>Converter Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConverterPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERTER_PACKAGE_EDEFAULT = "converter";

	/**
	 * The cached value of the '{@link #getConverterPackage() <em>Converter Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConverterPackage()
	 * @generated
	 * @ordered
	 */
	protected String converterPackage = CONVERTER_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidatorPackage() <em>Validator Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATOR_PACKAGE_EDEFAULT = "validator";

	/**
	 * The cached value of the '{@link #getValidatorPackage() <em>Validator Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorPackage()
	 * @generated
	 * @ordered
	 */
	protected String validatorPackage = VALIDATOR_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServicePackage() <em>Service Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_PACKAGE_EDEFAULT = "service";

	/**
	 * The cached value of the '{@link #getServicePackage() <em>Service Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePackage()
	 * @generated
	 * @ordered
	 */
	protected String servicePackage = SERVICE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityPackage() <em>Security Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_PACKAGE_EDEFAULT = "security";

	/**
	 * The cached value of the '{@link #getSecurityPackage() <em>Security Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityPackage()
	 * @generated
	 * @ordered
	 */
	protected String securityPackage = SECURITY_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUiPackage() <em>Ui Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String UI_PACKAGE_EDEFAULT = "ui";

	/**
	 * The cached value of the '{@link #getUiPackage() <em>Ui Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiPackage()
	 * @generated
	 * @ordered
	 */
	protected String uiPackage = UI_PACKAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenJsfModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_JSF_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsfModel getJsfModel() {
		if (jsfModel != null && jsfModel.eIsProxy()) {
			InternalEObject oldJsfModel = (InternalEObject)jsfModel;
			jsfModel = (JsfModel)eResolveProxy(oldJsfModel);
			if (jsfModel != oldJsfModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_JSF_MODEL__JSF_MODEL, oldJsfModel, jsfModel));
			}
		}
		return jsfModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsfModel basicGetJsfModel() {
		return jsfModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfModel(JsfModel newJsfModel) {
		JsfModel oldJsfModel = jsfModel;
		jsfModel = newJsfModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_JSF_MODEL__JSF_MODEL, oldJsfModel, jsfModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAuthentication getGenAuthentication() {
		return genAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenAuthentication(GenAuthentication newGenAuthentication, NotificationChain msgs) {
		GenAuthentication oldGenAuthentication = genAuthentication;
		genAuthentication = newGenAuthentication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_JSF_MODEL__GEN_AUTHENTICATION, oldGenAuthentication, newGenAuthentication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenAuthentication(GenAuthentication newGenAuthentication) {
		if (newGenAuthentication != genAuthentication) {
			NotificationChain msgs = null;
			if (genAuthentication != null)
				msgs = ((InternalEObject)genAuthentication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_JSF_MODEL__GEN_AUTHENTICATION, null, msgs);
			if (newGenAuthentication != null)
				msgs = ((InternalEObject)newGenAuthentication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_JSF_MODEL__GEN_AUTHENTICATION, null, msgs);
			msgs = basicSetGenAuthentication(newGenAuthentication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_JSF_MODEL__GEN_AUTHENTICATION, newGenAuthentication, newGenAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenService> getGenServices() {
		if (genServices == null) {
			genServices = new EObjectContainmentEList<GenService>(GenService.class, this, GenJsfPackage.GEN_JSF_MODEL__GEN_SERVICES);
		}
		return genServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenPage> getGenPages() {
		if (genPages == null) {
			genPages = new EObjectContainmentWithInverseEList<GenPage>(GenPage.class, this, GenJsfPackage.GEN_JSF_MODEL__GEN_PAGES, GenJsfPackage.GEN_PAGE__GEN_PART_OF);
		}
		return genPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenMenu> getGenMenus() {
		if (genMenus == null) {
			genMenus = new EObjectContainmentEList<GenMenu>(GenMenu.class, this, GenJsfPackage.GEN_JSF_MODEL__GEN_MENUS);
		}
		return genMenus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseURL() {
		return baseURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseURL(String newBaseURL) {
		String oldBaseURL = baseURL;
		baseURL = newBaseURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_JSF_MODEL__BASE_URL, oldBaseURL, baseURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRewriteURLs() {
		return rewriteURLs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRewriteURLs(boolean newRewriteURLs) {
		boolean oldRewriteURLs = rewriteURLs;
		rewriteURLs = newRewriteURLs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_JSF_MODEL__REWRITE_UR_LS, oldRewriteURLs, rewriteURLs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDevelopmentVersion() {
		return developmentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevelopmentVersion(boolean newDevelopmentVersion) {
		boolean oldDevelopmentVersion = developmentVersion;
		developmentVersion = newDevelopmentVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_JSF_MODEL__DEVELOPMENT_VERSION, oldDevelopmentVersion, developmentVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_JSF_MODEL__AJAX_TECHNOLOGY, oldAjaxTechnology, ajaxTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextEditorPath() {
		return textEditorPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextEditorPath(String newTextEditorPath) {
		String oldTextEditorPath = textEditorPath;
		textEditorPath = newTextEditorPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_JSF_MODEL__TEXT_EDITOR_PATH, oldTextEditorPath, textEditorPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackingPackage() {
		return backingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackingPackage(String newBackingPackage) {
		String oldBackingPackage = backingPackage;
		backingPackage = newBackingPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_JSF_MODEL__BACKING_PACKAGE, oldBackingPackage, backingPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConverterPackage() {
		return converterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConverterPackage(String newConverterPackage) {
		String oldConverterPackage = converterPackage;
		converterPackage = newConverterPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_JSF_MODEL__CONVERTER_PACKAGE, oldConverterPackage, converterPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidatorPackage() {
		return validatorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidatorPackage(String newValidatorPackage) {
		String oldValidatorPackage = validatorPackage;
		validatorPackage = newValidatorPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_JSF_MODEL__VALIDATOR_PACKAGE, oldValidatorPackage, validatorPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServicePackage() {
		return servicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicePackage(String newServicePackage) {
		String oldServicePackage = servicePackage;
		servicePackage = newServicePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_JSF_MODEL__SERVICE_PACKAGE, oldServicePackage, servicePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityPackage() {
		return securityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityPackage(String newSecurityPackage) {
		String oldSecurityPackage = securityPackage;
		securityPackage = newSecurityPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_JSF_MODEL__SECURITY_PACKAGE, oldSecurityPackage, securityPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUiPackage() {
		return uiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUiPackage(String newUiPackage) {
		String oldUiPackage = uiPackage;
		uiPackage = newUiPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_JSF_MODEL__UI_PACKAGE, oldUiPackage, uiPackage));
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
			case GenJsfPackage.GEN_JSF_MODEL__GEN_PAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenPages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	public void reconcile(final GenOrmModel oldGenModel) {
		super.reconcile(oldGenModel);

		if (!(oldGenModel instanceof GenJsfModel)) {
			return;
		}

		final GenJsfModel oldGenJsfModel = (GenJsfModel) oldGenModel;
		final Map<String, GenService> oldServices = new HashMap<String, GenService>();
		for (GenService oldService : oldGenJsfModel.getGenServices()) {
			oldServices.put(oldService.getName(), oldService);
		}
		for (GenService newService : getGenServices()) {
			final String name = newService.getName();
			if (oldServices.containsKey(name)) {
				newService.reconcile(oldServices.get(name));
			}
		}

		final Map<String, GenPage> oldPages = new HashMap<String, GenPage>();
		for (GenPage oldPage : oldGenJsfModel.getGenPages()) {
			oldPages.put(oldPage.getName(), oldPage);
		}
		for (GenPage newPage : getGenPages()) {
			final String name = newPage.getName();
			if (oldPages.containsKey(name)) {
				newPage.reconcile(oldPages.get(name));
			}
		}

		final Map<String, GenMenu> oldMenus = new HashMap<String, GenMenu>();
		for (GenMenu oldMenu : oldGenJsfModel.getGenMenus()) {
			String name;
			if (oldMenu instanceof GenStaticMenu) {
				name = ((GenStaticMenu) oldMenu).getName();
			} else {
				name = ((GenDynamicMenu) oldMenu).getName();
			}
			oldMenus.put(name, oldMenu);
		}
		for (GenMenu newMenu : getGenMenus()) {
			final String name;
			if (newMenu instanceof GenStaticMenu) {
				name = ((GenStaticMenu) newMenu).getName();
			} else {
				name = ((GenDynamicMenu) newMenu).getName();
			}
			if (oldMenus.containsKey(name)) {
				newMenu.reconcile(oldMenus.get(name));
			}
		}
	}

	protected void reconcileSettings(final GenOrmModel oldGenModel) {
		super.reconcileSettings(oldGenModel);

		if (oldGenModel instanceof GenJsfModel) {
			final GenJsfModel oldGenJsfModel = (GenJsfModel) oldGenModel;
			if ((oldGenJsfModel.getBaseURL() != null ) && oldGenJsfModel.getBaseURL().equals("")) {
				setBaseURL(oldGenJsfModel.getBaseURL());
			}
			setDevelopmentVersion(oldGenJsfModel.isDevelopmentVersion());
			setRewriteURLs(oldGenJsfModel.isRewriteURLs());
			setAjaxTechnology(oldGenJsfModel.getAjaxTechnology());
			setTextEditorPath(oldGenJsfModel.getTextEditorPath());
			setBackingPackage(oldGenJsfModel.getBackingPackage());
			setConverterPackage(oldGenJsfModel.getConverterPackage());
			setValidatorPackage(oldGenJsfModel.getValidatorPackage());
			setServicePackage(oldGenJsfModel.getServicePackage());
			setSecurityPackage(oldGenJsfModel.getSecurityPackage());
			setUiPackage(oldGenJsfModel.getUiPackage());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_JSF_MODEL__GEN_AUTHENTICATION:
				return basicSetGenAuthentication(null, msgs);
			case GenJsfPackage.GEN_JSF_MODEL__GEN_SERVICES:
				return ((InternalEList<?>)getGenServices()).basicRemove(otherEnd, msgs);
			case GenJsfPackage.GEN_JSF_MODEL__GEN_PAGES:
				return ((InternalEList<?>)getGenPages()).basicRemove(otherEnd, msgs);
			case GenJsfPackage.GEN_JSF_MODEL__GEN_MENUS:
				return ((InternalEList<?>)getGenMenus()).basicRemove(otherEnd, msgs);
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
			case GenJsfPackage.GEN_JSF_MODEL__JSF_MODEL:
				if (resolve) return getJsfModel();
				return basicGetJsfModel();
			case GenJsfPackage.GEN_JSF_MODEL__GEN_AUTHENTICATION:
				return getGenAuthentication();
			case GenJsfPackage.GEN_JSF_MODEL__GEN_SERVICES:
				return getGenServices();
			case GenJsfPackage.GEN_JSF_MODEL__GEN_PAGES:
				return getGenPages();
			case GenJsfPackage.GEN_JSF_MODEL__GEN_MENUS:
				return getGenMenus();
			case GenJsfPackage.GEN_JSF_MODEL__BASE_URL:
				return getBaseURL();
			case GenJsfPackage.GEN_JSF_MODEL__REWRITE_UR_LS:
				return isRewriteURLs();
			case GenJsfPackage.GEN_JSF_MODEL__DEVELOPMENT_VERSION:
				return isDevelopmentVersion();
			case GenJsfPackage.GEN_JSF_MODEL__AJAX_TECHNOLOGY:
				return getAjaxTechnology();
			case GenJsfPackage.GEN_JSF_MODEL__TEXT_EDITOR_PATH:
				return getTextEditorPath();
			case GenJsfPackage.GEN_JSF_MODEL__BACKING_PACKAGE:
				return getBackingPackage();
			case GenJsfPackage.GEN_JSF_MODEL__CONVERTER_PACKAGE:
				return getConverterPackage();
			case GenJsfPackage.GEN_JSF_MODEL__VALIDATOR_PACKAGE:
				return getValidatorPackage();
			case GenJsfPackage.GEN_JSF_MODEL__SERVICE_PACKAGE:
				return getServicePackage();
			case GenJsfPackage.GEN_JSF_MODEL__SECURITY_PACKAGE:
				return getSecurityPackage();
			case GenJsfPackage.GEN_JSF_MODEL__UI_PACKAGE:
				return getUiPackage();
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
			case GenJsfPackage.GEN_JSF_MODEL__JSF_MODEL:
				setJsfModel((JsfModel)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__GEN_AUTHENTICATION:
				setGenAuthentication((GenAuthentication)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__GEN_SERVICES:
				getGenServices().clear();
				getGenServices().addAll((Collection<? extends GenService>)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__GEN_PAGES:
				getGenPages().clear();
				getGenPages().addAll((Collection<? extends GenPage>)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__GEN_MENUS:
				getGenMenus().clear();
				getGenMenus().addAll((Collection<? extends GenMenu>)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__BASE_URL:
				setBaseURL((String)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__REWRITE_UR_LS:
				setRewriteURLs((Boolean)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__DEVELOPMENT_VERSION:
				setDevelopmentVersion((Boolean)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__AJAX_TECHNOLOGY:
				setAjaxTechnology((AjaxTechnologies)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__TEXT_EDITOR_PATH:
				setTextEditorPath((String)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__BACKING_PACKAGE:
				setBackingPackage((String)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__CONVERTER_PACKAGE:
				setConverterPackage((String)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__VALIDATOR_PACKAGE:
				setValidatorPackage((String)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__SERVICE_PACKAGE:
				setServicePackage((String)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__SECURITY_PACKAGE:
				setSecurityPackage((String)newValue);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__UI_PACKAGE:
				setUiPackage((String)newValue);
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
			case GenJsfPackage.GEN_JSF_MODEL__JSF_MODEL:
				setJsfModel((JsfModel)null);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__GEN_AUTHENTICATION:
				setGenAuthentication((GenAuthentication)null);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__GEN_SERVICES:
				getGenServices().clear();
				return;
			case GenJsfPackage.GEN_JSF_MODEL__GEN_PAGES:
				getGenPages().clear();
				return;
			case GenJsfPackage.GEN_JSF_MODEL__GEN_MENUS:
				getGenMenus().clear();
				return;
			case GenJsfPackage.GEN_JSF_MODEL__BASE_URL:
				setBaseURL(BASE_URL_EDEFAULT);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__REWRITE_UR_LS:
				setRewriteURLs(REWRITE_UR_LS_EDEFAULT);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__DEVELOPMENT_VERSION:
				setDevelopmentVersion(DEVELOPMENT_VERSION_EDEFAULT);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__AJAX_TECHNOLOGY:
				setAjaxTechnology(AJAX_TECHNOLOGY_EDEFAULT);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__TEXT_EDITOR_PATH:
				setTextEditorPath(TEXT_EDITOR_PATH_EDEFAULT);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__BACKING_PACKAGE:
				setBackingPackage(BACKING_PACKAGE_EDEFAULT);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__CONVERTER_PACKAGE:
				setConverterPackage(CONVERTER_PACKAGE_EDEFAULT);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__VALIDATOR_PACKAGE:
				setValidatorPackage(VALIDATOR_PACKAGE_EDEFAULT);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__SERVICE_PACKAGE:
				setServicePackage(SERVICE_PACKAGE_EDEFAULT);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__SECURITY_PACKAGE:
				setSecurityPackage(SECURITY_PACKAGE_EDEFAULT);
				return;
			case GenJsfPackage.GEN_JSF_MODEL__UI_PACKAGE:
				setUiPackage(UI_PACKAGE_EDEFAULT);
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
			case GenJsfPackage.GEN_JSF_MODEL__JSF_MODEL:
				return jsfModel != null;
			case GenJsfPackage.GEN_JSF_MODEL__GEN_AUTHENTICATION:
				return genAuthentication != null;
			case GenJsfPackage.GEN_JSF_MODEL__GEN_SERVICES:
				return genServices != null && !genServices.isEmpty();
			case GenJsfPackage.GEN_JSF_MODEL__GEN_PAGES:
				return genPages != null && !genPages.isEmpty();
			case GenJsfPackage.GEN_JSF_MODEL__GEN_MENUS:
				return genMenus != null && !genMenus.isEmpty();
			case GenJsfPackage.GEN_JSF_MODEL__BASE_URL:
				return BASE_URL_EDEFAULT == null ? baseURL != null : !BASE_URL_EDEFAULT.equals(baseURL);
			case GenJsfPackage.GEN_JSF_MODEL__REWRITE_UR_LS:
				return rewriteURLs != REWRITE_UR_LS_EDEFAULT;
			case GenJsfPackage.GEN_JSF_MODEL__DEVELOPMENT_VERSION:
				return developmentVersion != DEVELOPMENT_VERSION_EDEFAULT;
			case GenJsfPackage.GEN_JSF_MODEL__AJAX_TECHNOLOGY:
				return ajaxTechnology != AJAX_TECHNOLOGY_EDEFAULT;
			case GenJsfPackage.GEN_JSF_MODEL__TEXT_EDITOR_PATH:
				return TEXT_EDITOR_PATH_EDEFAULT == null ? textEditorPath != null : !TEXT_EDITOR_PATH_EDEFAULT.equals(textEditorPath);
			case GenJsfPackage.GEN_JSF_MODEL__BACKING_PACKAGE:
				return BACKING_PACKAGE_EDEFAULT == null ? backingPackage != null : !BACKING_PACKAGE_EDEFAULT.equals(backingPackage);
			case GenJsfPackage.GEN_JSF_MODEL__CONVERTER_PACKAGE:
				return CONVERTER_PACKAGE_EDEFAULT == null ? converterPackage != null : !CONVERTER_PACKAGE_EDEFAULT.equals(converterPackage);
			case GenJsfPackage.GEN_JSF_MODEL__VALIDATOR_PACKAGE:
				return VALIDATOR_PACKAGE_EDEFAULT == null ? validatorPackage != null : !VALIDATOR_PACKAGE_EDEFAULT.equals(validatorPackage);
			case GenJsfPackage.GEN_JSF_MODEL__SERVICE_PACKAGE:
				return SERVICE_PACKAGE_EDEFAULT == null ? servicePackage != null : !SERVICE_PACKAGE_EDEFAULT.equals(servicePackage);
			case GenJsfPackage.GEN_JSF_MODEL__SECURITY_PACKAGE:
				return SECURITY_PACKAGE_EDEFAULT == null ? securityPackage != null : !SECURITY_PACKAGE_EDEFAULT.equals(securityPackage);
			case GenJsfPackage.GEN_JSF_MODEL__UI_PACKAGE:
				return UI_PACKAGE_EDEFAULT == null ? uiPackage != null : !UI_PACKAGE_EDEFAULT.equals(uiPackage);
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
		result.append(" (baseURL: ");
		result.append(baseURL);
		result.append(", rewriteURLs: ");
		result.append(rewriteURLs);
		result.append(", developmentVersion: ");
		result.append(developmentVersion);
		result.append(", ajaxTechnology: ");
		result.append(ajaxTechnology);
		result.append(", textEditorPath: ");
		result.append(textEditorPath);
		result.append(", backingPackage: ");
		result.append(backingPackage);
		result.append(", converterPackage: ");
		result.append(converterPackage);
		result.append(", validatorPackage: ");
		result.append(validatorPackage);
		result.append(", servicePackage: ");
		result.append(servicePackage);
		result.append(", securityPackage: ");
		result.append(securityPackage);
		result.append(", uiPackage: ");
		result.append(uiPackage);
		result.append(')');
		return result.toString();
	}

} //GenJsfModelImpl
