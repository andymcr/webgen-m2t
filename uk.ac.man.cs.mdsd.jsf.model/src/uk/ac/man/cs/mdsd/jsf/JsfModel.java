/**
 * <copyright>
 * </copyright>
 *
 * $Id: JsfModel.java,v 1.11 2013/12/12 23:05:17 andy Exp $
 */
package uk.ac.man.cs.mdsd.jsf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.orm.OrmModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getServices <em>Services</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getPages <em>Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getMenus <em>Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getSiteName <em>Site Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getSiteTitle <em>Site Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#isDevelopmentVersion <em>Development Version</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#isRewriteURLs <em>Rewrite UR Ls</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getWebmasterEmail <em>Webmaster Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getMetaDescription <em>Meta Description</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getFrameworkTechnology <em>Framework Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getAjaxTechnology <em>Ajax Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getCaptchaSiteKey <em>Captcha Site Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getCaptchaSecretKey <em>Captcha Secret Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getTextEditorURL <em>Text Editor URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getTopNavigationId <em>Top Navigation Id</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#isStaticUnitsEditable <em>Static Units Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel()
 * @model
 * @generated
 */
public interface JsfModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Persistence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence</em>' reference.
	 * @see #setPersistence(OrmModel)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_Persistence()
	 * @model required="true"
	 * @generated
	 */
	OrmModel getPersistence();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getPersistence <em>Persistence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence</em>' reference.
	 * @see #getPersistence()
	 * @generated
	 */
	void setPersistence(OrmModel value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.jsf.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.jsf.Page}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.jsf.Page#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_Pages()
	 * @see uk.ac.man.cs.mdsd.jsf.Page#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.jsf.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_Menus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenus();

	/**
	 * Returns the value of the '<em><b>Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Name</em>' attribute.
	 * @see #setSiteName(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_SiteName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSiteName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getSiteName <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Name</em>' attribute.
	 * @see #getSiteName()
	 * @generated
	 */
	void setSiteName(String value);

	/**
	 * Returns the value of the '<em><b>Site Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Title</em>' attribute.
	 * @see #setSiteTitle(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_SiteTitle()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSiteTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getSiteTitle <em>Site Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Title</em>' attribute.
	 * @see #getSiteTitle()
	 * @generated
	 */
	void setSiteTitle(String value);

	/**
	 * Returns the value of the '<em><b>Development Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Development Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Version</em>' attribute.
	 * @see #setDevelopmentVersion(boolean)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_DevelopmentVersion()
	 * @model
	 * @generated
	 */
	boolean isDevelopmentVersion();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#isDevelopmentVersion <em>Development Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Version</em>' attribute.
	 * @see #isDevelopmentVersion()
	 * @generated
	 */
	void setDevelopmentVersion(boolean value);

	/**
	 * Returns the value of the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URL</em>' attribute.
	 * @see #setBaseURL(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_BaseURL()
	 * @model
	 * @generated
	 */
	String getBaseURL();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getBaseURL <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URL</em>' attribute.
	 * @see #getBaseURL()
	 * @generated
	 */
	void setBaseURL(String value);

	/**
	 * Returns the value of the '<em><b>Rewrite UR Ls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewrite UR Ls</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewrite UR Ls</em>' attribute.
	 * @see #setRewriteURLs(boolean)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_RewriteURLs()
	 * @model
	 * @generated
	 */
	boolean isRewriteURLs();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#isRewriteURLs <em>Rewrite UR Ls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rewrite UR Ls</em>' attribute.
	 * @see #isRewriteURLs()
	 * @generated
	 */
	void setRewriteURLs(boolean value);

	/**
	 * Returns the value of the '<em><b>Webmaster Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webmaster Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webmaster Email</em>' attribute.
	 * @see #setWebmasterEmail(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_WebmasterEmail()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getWebmasterEmail();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getWebmasterEmail <em>Webmaster Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webmaster Email</em>' attribute.
	 * @see #getWebmasterEmail()
	 * @generated
	 */
	void setWebmasterEmail(String value);

	/**
	 * Returns the value of the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright Text</em>' attribute.
	 * @see #setCopyrightText(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_CopyrightText()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCopyrightText();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getCopyrightText <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Text</em>' attribute.
	 * @see #getCopyrightText()
	 * @generated
	 */
	void setCopyrightText(String value);

	/**
	 * Returns the value of the '<em><b>Meta Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Description</em>' attribute.
	 * @see #setMetaDescription(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_MetaDescription()
	 * @model ordered="false"
	 * @generated
	 */
	String getMetaDescription();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getMetaDescription <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Description</em>' attribute.
	 * @see #getMetaDescription()
	 * @generated
	 */
	void setMetaDescription(String value);

	/**
	 * Returns the value of the '<em><b>Framework Technology</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.jsf.FrameworkTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.jsf.FrameworkTechnologies
	 * @see #setFrameworkTechnology(FrameworkTechnologies)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_FrameworkTechnology()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FrameworkTechnologies getFrameworkTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getFrameworkTechnology <em>Framework Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.jsf.FrameworkTechnologies
	 * @see #getFrameworkTechnology()
	 * @generated
	 */
	void setFrameworkTechnology(FrameworkTechnologies value);

	/**
	 * Returns the value of the '<em><b>Ajax Technology</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.jsf.AjaxTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ajax Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ajax Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.jsf.AjaxTechnologies
	 * @see #setAjaxTechnology(AjaxTechnologies)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_AjaxTechnology()
	 * @model
	 * @generated
	 */
	AjaxTechnologies getAjaxTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getAjaxTechnology <em>Ajax Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ajax Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.jsf.AjaxTechnologies
	 * @see #getAjaxTechnology()
	 * @generated
	 */
	void setAjaxTechnology(AjaxTechnologies value);

	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #setAuthentication(Authentication)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_Authentication()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Authentication getAuthentication();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(Authentication value);

	/**
	 * Returns the value of the '<em><b>Captcha Site Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Captcha Site Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captcha Site Key</em>' attribute.
	 * @see #setCaptchaSiteKey(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_CaptchaSiteKey()
	 * @model
	 * @generated
	 */
	String getCaptchaSiteKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getCaptchaSiteKey <em>Captcha Site Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captcha Site Key</em>' attribute.
	 * @see #getCaptchaSiteKey()
	 * @generated
	 */
	void setCaptchaSiteKey(String value);

	/**
	 * Returns the value of the '<em><b>Captcha Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Captcha Secret Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captcha Secret Key</em>' attribute.
	 * @see #setCaptchaSecretKey(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_CaptchaSecretKey()
	 * @model
	 * @generated
	 */
	String getCaptchaSecretKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getCaptchaSecretKey <em>Captcha Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captcha Secret Key</em>' attribute.
	 * @see #getCaptchaSecretKey()
	 * @generated
	 */
	void setCaptchaSecretKey(String value);

	/**
	 * Returns the value of the '<em><b>Text Editor URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Editor URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Editor URL</em>' attribute.
	 * @see #setTextEditorURL(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_TextEditorURL()
	 * @model
	 * @generated
	 */
	String getTextEditorURL();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getTextEditorURL <em>Text Editor URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Editor URL</em>' attribute.
	 * @see #getTextEditorURL()
	 * @generated
	 */
	void setTextEditorURL(String value);

	/**
	 * Returns the value of the '<em><b>Top Navigation Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Navigation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Navigation Id</em>' attribute.
	 * @see #setTopNavigationId(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_TopNavigationId()
	 * @model default="" required="true" ordered="false"
	 * @generated
	 */
	String getTopNavigationId();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getTopNavigationId <em>Top Navigation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Navigation Id</em>' attribute.
	 * @see #getTopNavigationId()
	 * @generated
	 */
	void setTopNavigationId(String value);

	/**
	 * Returns the value of the '<em><b>Side Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Menu</em>' reference.
	 * @see #setSideMenu(Menu)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_SideMenu()
	 * @model ordered="false"
	 * @generated
	 */
	Menu getSideMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getSideMenu <em>Side Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Menu</em>' reference.
	 * @see #getSideMenu()
	 * @generated
	 */
	void setSideMenu(Menu value);

	/**
	 * Returns the value of the '<em><b>Static Units Editable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Units Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Units Editable</em>' attribute.
	 * @see #setStaticUnitsEditable(boolean)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_StaticUnitsEditable()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isStaticUnitsEditable();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#isStaticUnitsEditable <em>Static Units Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Units Editable</em>' attribute.
	 * @see #isStaticUnitsEditable()
	 * @generated
	 */
	void setStaticUnitsEditable(boolean value);

} // JsfModel
