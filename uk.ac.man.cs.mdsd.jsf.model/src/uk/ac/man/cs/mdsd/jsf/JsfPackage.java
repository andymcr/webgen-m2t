/**
 * <copyright>
 * </copyright>
 *
 * $Id: JsfPackage.java,v 1.137 2014/08/22 14:32:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.jsf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import uk.ac.man.cs.mdsd.criteria.CriteriaPackage;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.jsf.JsfFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface JsfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jsf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cs.man.ac.uk/mdsd/2010/Jsf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jsf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JsfPackage eINSTANCE = uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getJsfModel()
	 * @generated
	 */
	int JSF_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Persistence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__PERSISTENCE = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__SERVICES = 1;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__PAGES = 2;

	/**
	 * The feature id for the '<em><b>Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__MENUS = 3;

	/**
	 * The feature id for the '<em><b>Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__SITE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Site Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__SITE_TITLE = 5;

	/**
	 * The feature id for the '<em><b>Development Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__DEVELOPMENT_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__BASE_URL = 7;

	/**
	 * The feature id for the '<em><b>Rewrite UR Ls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__REWRITE_UR_LS = 8;

	/**
	 * The feature id for the '<em><b>Webmaster Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__WEBMASTER_EMAIL = 9;

	/**
	 * The feature id for the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__COPYRIGHT_TEXT = 10;

	/**
	 * The feature id for the '<em><b>Meta Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__META_DESCRIPTION = 11;

	/**
	 * The feature id for the '<em><b>Framework Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__FRAMEWORK_TECHNOLOGY = 12;

	/**
	 * The feature id for the '<em><b>Ajax Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__AJAX_TECHNOLOGY = 13;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__AUTHENTICATION = 14;

	/**
	 * The feature id for the '<em><b>Captcha Site Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__CAPTCHA_SITE_KEY = 15;

	/**
	 * The feature id for the '<em><b>Captcha Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__CAPTCHA_SECRET_KEY = 16;

	/**
	 * The feature id for the '<em><b>Top Navigation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__TOP_NAVIGATION_ID = 17;

	/**
	 * The feature id for the '<em><b>Side Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__SIDE_MENU = 18;

	/**
	 * The feature id for the '<em><b>Static Units Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL__STATIC_UNITS_EDITABLE = 19;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSF_MODEL_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.ServiceImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 7;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.SelectTarget <em>Select Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.SelectTarget
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getSelectTarget()
	 * @generated
	 */
	int SELECT_TARGET = 27;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.PageImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 16;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ContentUnitImpl <em>Content Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.ContentUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getContentUnit()
	 * @generated
	 */
	int CONTENT_UNIT = 30;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.IncludedFeature <em>Included Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedFeature
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getIncludedFeature()
	 * @generated
	 */
	int INCLUDED_FEATURE = 4;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.EditUnitImpl <em>Edit Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.EditUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getEditUnit()
	 * @generated
	 */
	int EDIT_UNIT = 49;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CreateUnitImpl <em>Create Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.CreateUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCreateUnit()
	 * @generated
	 */
	int CREATE_UNIT = 50;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UpdateUnitImpl <em>Update Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.UpdateUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUpdateUnit()
	 * @generated
	 */
	int UPDATE_UNIT = 53;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.DataUnitImpl <em>Data Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.DataUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getDataUnit()
	 * @generated
	 */
	int DATA_UNIT = 54;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.DetailsUnitImpl <em>Details Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.DetailsUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getDetailsUnit()
	 * @generated
	 */
	int DETAILS_UNIT = 55;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.IndexUnitImpl <em>Index Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.IndexUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getIndexUnit()
	 * @generated
	 */
	int INDEX_UNIT = 56;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.InlineActionImpl <em>Inline Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.InlineActionImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getInlineAction()
	 * @generated
	 */
	int INLINE_ACTION = 68;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.SelectActionImpl <em>Select Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.SelectActionImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getSelectAction()
	 * @generated
	 */
	int SELECT_ACTION = 69;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.DeleteActionImpl <em>Delete Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.DeleteActionImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getDeleteAction()
	 * @generated
	 */
	int DELETE_ACTION = 70;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.AuthenticationImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 1;

	/**
	 * The feature id for the '<em><b>Login Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__LOGIN_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Logout Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__LOGOUT_LABEL = 1;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl <em>Local Authentication System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getLocalAuthenticationSystem()
	 * @generated
	 */
	int LOCAL_AUTHENTICATION_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Login Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGIN_LABEL = AUTHENTICATION__LOGIN_LABEL;

	/**
	 * The feature id for the '<em><b>Logout Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_LABEL = AUTHENTICATION__LOGOUT_LABEL;

	/**
	 * The feature id for the '<em><b>User Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USER_SERVICE = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Authentication Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USER_AUTHENTICATION_KEY = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Authentication Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_SERVICE = AUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Login Attempt Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_SERVICE = AUTHENTICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Auto Login Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN_SERVICE = AUTHENTICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Allow Self Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION = AUTHENTICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Use Email Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION = AUTHENTICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Send Welcome Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL = AUTHENTICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Registration Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT = AUTHENTICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Login Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT = AUTHENTICATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Forgotten Password Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT = AUTHENTICATION_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Local Authentication System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CasAuthenticationImpl <em>Cas Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.CasAuthenticationImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCasAuthentication()
	 * @generated
	 */
	int CAS_AUTHENTICATION = 3;

	/**
	 * The feature id for the '<em><b>Login Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__LOGIN_LABEL = AUTHENTICATION__LOGIN_LABEL;

	/**
	 * The feature id for the '<em><b>Logout Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__LOGOUT_LABEL = AUTHENTICATION__LOGOUT_LABEL;

	/**
	 * The number of structural features of the '<em>Cas Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FEATURE__DISPLAY_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FEATURE__FORCED_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FEATURE__FOOTER = 2;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FEATURE__HEADER_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FEATURE__INPUT_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FEATURE__DISPLAY_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FEATURE__FOOTER_CLASS = 6;

	/**
	 * The number of structural features of the '<em>Included Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FEATURE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.IncludedElement <em>Included Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedElement
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getIncludedElement()
	 * @generated
	 */
	int INCLUDED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ELEMENT__DISPLAY_LABEL = INCLUDED_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ELEMENT__FORCED_VALUE = INCLUDED_FEATURE__FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ELEMENT__FOOTER = INCLUDED_FEATURE__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ELEMENT__HEADER_CLASS = INCLUDED_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ELEMENT__INPUT_CLASS = INCLUDED_FEATURE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ELEMENT__DISPLAY_CLASS = INCLUDED_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ELEMENT__FOOTER_CLASS = INCLUDED_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ELEMENT__OBFUSCATE_FORM_FIELDS = INCLUDED_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ELEMENT__DEFAULT_VALUE = INCLUDED_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Included Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ELEMENT_FEATURE_COUNT = INCLUDED_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.IncludedAssociation <em>Included Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedAssociation
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getIncludedAssociation()
	 * @generated
	 */
	int INCLUDED_ASSOCIATION = 6;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ASSOCIATION__DISPLAY_LABEL = INCLUDED_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ASSOCIATION__FORCED_VALUE = INCLUDED_FEATURE__FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ASSOCIATION__FOOTER = INCLUDED_FEATURE__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ASSOCIATION__HEADER_CLASS = INCLUDED_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ASSOCIATION__INPUT_CLASS = INCLUDED_FEATURE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ASSOCIATION__DISPLAY_CLASS = INCLUDED_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ASSOCIATION__FOOTER_CLASS = INCLUDED_FEATURE__FOOTER_CLASS;

	/**
	 * The number of structural features of the '<em>Included Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_ASSOCIATION_FEATURE_COUNT = INCLUDED_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENTITIES = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Daos Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DAOS_USED = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MODEL_NAME = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VIEW = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VIEW_NAME = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Display Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DISPLAY_LABELS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SELECTIONS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__FEATURES = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Accessed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ACCESSED_BY = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ModelLabelImpl <em>Model Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.ModelLabelImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getModelLabel()
	 * @generated
	 */
	int MODEL_LABEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__LABEL_FOR = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__FORMAT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__FEATURES = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.ServiceFeature <em>Service Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceFeature
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getServiceFeature()
	 * @generated
	 */
	int SERVICE_FEATURE = 10;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.ServiceAssociation <em>Service Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceAssociation
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getServiceAssociation()
	 * @generated
	 */
	int SERVICE_ASSOCIATION = 13;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceViewAssociationImpl <em>Service View Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.ServiceViewAssociationImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getServiceViewAssociation()
	 * @generated
	 */
	int SERVICE_VIEW_ASSOCIATION = 15;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.SelectionImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Joins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__JOINS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__FILTER = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__ORDERING = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__LIMIT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Included By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__INCLUDED_BY = 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__CARDINALITY = 1;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__DATE_FORMAT = 2;

	/**
	 * The number of structural features of the '<em>Service Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl <em>Service Entity Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getServiceEntityFeature()
	 * @generated
	 */
	int SERVICE_ENTITY_FEATURE = 11;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_FEATURE__DISPLAY_LABEL = INCLUDED_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_FEATURE__FORCED_VALUE = INCLUDED_FEATURE__FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_FEATURE__FOOTER = INCLUDED_FEATURE__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_FEATURE__HEADER_CLASS = INCLUDED_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_FEATURE__INPUT_CLASS = INCLUDED_FEATURE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_FEATURE__DISPLAY_CLASS = INCLUDED_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_FEATURE__FOOTER_CLASS = INCLUDED_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Included By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_FEATURE__INCLUDED_BY = INCLUDED_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_FEATURE__CARDINALITY = INCLUDED_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_FEATURE__DATE_FORMAT = INCLUDED_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_FEATURE__NAME = INCLUDED_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>View Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_FEATURE__VIEW_COLUMN_NAME = INCLUDED_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Service Entity Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_FEATURE_FEATURE_COUNT = INCLUDED_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityElementImpl <em>Service Entity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityElementImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getServiceEntityElement()
	 * @generated
	 */
	int SERVICE_ENTITY_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__DISPLAY_LABEL = SERVICE_ENTITY_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__FORCED_VALUE = SERVICE_ENTITY_FEATURE__FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__FOOTER = SERVICE_ENTITY_FEATURE__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__HEADER_CLASS = SERVICE_ENTITY_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__INPUT_CLASS = SERVICE_ENTITY_FEATURE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__DISPLAY_CLASS = SERVICE_ENTITY_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__FOOTER_CLASS = SERVICE_ENTITY_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Included By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__INCLUDED_BY = SERVICE_ENTITY_FEATURE__INCLUDED_BY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__CARDINALITY = SERVICE_ENTITY_FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__DATE_FORMAT = SERVICE_ENTITY_FEATURE__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__NAME = SERVICE_ENTITY_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>View Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__VIEW_COLUMN_NAME = SERVICE_ENTITY_FEATURE__VIEW_COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__OBFUSCATE_FORM_FIELDS = SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__DEFAULT_VALUE = SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__FEATURE = SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Case Insensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__CASE_INSENSITIVE = SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Encrypt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__ENCRYPT = SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__PLACEHOLDER = SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT__VALIDATION_PATTERN = SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Service Entity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ELEMENT_FEATURE_COUNT = SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Included By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASSOCIATION__INCLUDED_BY = SERVICE_FEATURE__INCLUDED_BY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASSOCIATION__CARDINALITY = SERVICE_FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASSOCIATION__DATE_FORMAT = SERVICE_FEATURE__DATE_FORMAT;

	/**
	 * The number of structural features of the '<em>Service Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ASSOCIATION_FEATURE_COUNT = SERVICE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityAssociationImpl <em>Service Entity Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityAssociationImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getServiceEntityAssociation()
	 * @generated
	 */
	int SERVICE_ENTITY_ASSOCIATION = 14;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION__DISPLAY_LABEL = SERVICE_ENTITY_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION__FORCED_VALUE = SERVICE_ENTITY_FEATURE__FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION__FOOTER = SERVICE_ENTITY_FEATURE__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION__HEADER_CLASS = SERVICE_ENTITY_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION__INPUT_CLASS = SERVICE_ENTITY_FEATURE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION__DISPLAY_CLASS = SERVICE_ENTITY_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION__FOOTER_CLASS = SERVICE_ENTITY_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Included By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION__INCLUDED_BY = SERVICE_ENTITY_FEATURE__INCLUDED_BY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION__CARDINALITY = SERVICE_ENTITY_FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION__DATE_FORMAT = SERVICE_ENTITY_FEATURE__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION__NAME = SERVICE_ENTITY_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>View Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION__VIEW_COLUMN_NAME = SERVICE_ENTITY_FEATURE__VIEW_COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION__FEATURE = SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION__OPPOSITE = SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Entity Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_ASSOCIATION_FEATURE_COUNT = SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_VIEW_ASSOCIATION__NAME = OrmPackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_VIEW_ASSOCIATION__DISPLAY_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Included By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_VIEW_ASSOCIATION__INCLUDED_BY = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_VIEW_ASSOCIATION__CARDINALITY = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_VIEW_ASSOCIATION__DATE_FORMAT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_VIEW_ASSOCIATION__TARGET_FEATURE = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service View Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_VIEW_ASSOCIATION_FEATURE_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = OrmPackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DISPLAY_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__UNITS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PART_OF = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PARENT_PAGE = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CHILD_PAGES = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__AUTHENTICATED = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Top Menu Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOP_MENU_OPTION = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Top Menu Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOP_MENU_RANK = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Navigation Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAVIGATION_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Side Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SIDE_MENU = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__STYLE_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.MenuImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = OrmPackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__DISPLAY_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ENTRIES = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__OMIT_CAPTION = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__CAPTION_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__STYLE_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__LAYOUT_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.MenuEntryImpl <em>Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.MenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getMenuEntry()
	 * @generated
	 */
	int MENU_ENTRY = 18;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY__PART_OF = 0;

	/**
	 * The number of structural features of the '<em>Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.MenuIncludedFeatureImpl <em>Menu Included Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.MenuIncludedFeatureImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getMenuIncludedFeature()
	 * @generated
	 */
	int MENU_INCLUDED_FEATURE = 25;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.MenuIncludedElementImpl <em>Menu Included Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.MenuIncludedElementImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getMenuIncludedElement()
	 * @generated
	 */
	int MENU_INCLUDED_ELEMENT = 26;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.StaticMenuImpl <em>Static Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.StaticMenuImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getStaticMenu()
	 * @generated
	 */
	int STATIC_MENU = 19;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.DynamicMenuImpl <em>Dynamic Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.DynamicMenuImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getDynamicMenu()
	 * @generated
	 */
	int DYNAMIC_MENU = 24;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitContainerImpl <em>Unit Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitContainerImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitContainer()
	 * @generated
	 */
	int UNIT_CONTAINER = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU__NAME = MENU__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU__DISPLAY_LABEL = MENU__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU__ENTRIES = MENU__ENTRIES;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU__OMIT_CAPTION = MENU__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU__CAPTION_CLASS = MENU__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU__STYLE_CLASS = MENU__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU__LAYOUT_CLASS = MENU__LAYOUT_CLASS;

	/**
	 * The number of structural features of the '<em>Static Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_MENU_FEATURE_COUNT = MENU_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.FixedPageMenuEntryImpl <em>Fixed Page Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.FixedPageMenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getFixedPageMenuEntry()
	 * @generated
	 */
	int FIXED_PAGE_MENU_ENTRY = 20;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PAGE_MENU_ENTRY__PART_OF = MENU_ENTRY__PART_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PAGE_MENU_ENTRY__NAME = MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PAGE_MENU_ENTRY__DISPLAY_LABEL = MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PAGE_MENU_ENTRY__DESTINATION = MENU_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fixed Page Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PAGE_MENU_ENTRY_FEATURE_COUNT = MENU_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.FixedActionMenuEntryImpl <em>Fixed Action Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.FixedActionMenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getFixedActionMenuEntry()
	 * @generated
	 */
	int FIXED_ACTION_MENU_ENTRY = 21;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ACTION_MENU_ENTRY__PART_OF = MENU_ENTRY__PART_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ACTION_MENU_ENTRY__NAME = MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ACTION_MENU_ENTRY__DISPLAY_LABEL = MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ACTION_MENU_ENTRY__DESTINATION = MENU_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fixed Action Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ACTION_MENU_ENTRY_FEATURE_COUNT = MENU_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.FixedCommandMenuEntryImpl <em>Fixed Command Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.FixedCommandMenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getFixedCommandMenuEntry()
	 * @generated
	 */
	int FIXED_COMMAND_MENU_ENTRY = 22;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_COMMAND_MENU_ENTRY__PART_OF = MENU_ENTRY__PART_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_COMMAND_MENU_ENTRY__NAME = MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_COMMAND_MENU_ENTRY__DISPLAY_LABEL = MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_COMMAND_MENU_ENTRY__DESTINATION = MENU_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fixed Command Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_COMMAND_MENU_ENTRY_FEATURE_COUNT = MENU_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.EditStaticTextMenuEntryImpl <em>Edit Static Text Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.EditStaticTextMenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getEditStaticTextMenuEntry()
	 * @generated
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY = 23;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY__PART_OF = MENU_ENTRY__PART_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY__NAME = MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL = MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edit Static Text Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STATIC_TEXT_MENU_ENTRY_FEATURE_COUNT = MENU_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.UnitField <em>Unit Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.UnitField
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitField()
	 * @generated
	 */
	int UNIT_FIELD = 37;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.InterfaceFieldImpl <em>Interface Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.InterfaceFieldImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getInterfaceField()
	 * @generated
	 */
	int INTERFACE_FIELD = 44;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CreateUpdateUnitImpl <em>Create Update Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.CreateUpdateUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCreateUpdateUnit()
	 * @generated
	 */
	int CREATE_UPDATE_UNIT = 51;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.StaticUnitImpl <em>Static Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.StaticUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getStaticUnit()
	 * @generated
	 */
	int STATIC_UNIT = 31;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.DynamicUnitImpl <em>Dynamic Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.DynamicUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getDynamicUnit()
	 * @generated
	 */
	int DYNAMIC_UNIT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__NAME = MENU__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__DISPLAY_LABEL = MENU__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__ENTRIES = MENU__ENTRIES;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__OMIT_CAPTION = MENU__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__CAPTION_CLASS = MENU__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__STYLE_CLASS = MENU__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__LAYOUT_CLASS = MENU__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__SERVICE = MENU_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__SELECTION = MENU_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU__DYNAMIC_TITLE = MENU_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dynamic Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MENU_FEATURE_COUNT = MENU_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INCLUDED_FEATURE__PART_OF = MENU_ENTRY__PART_OF;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INCLUDED_FEATURE__DISPLAY_LABEL = MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Menu Included Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INCLUDED_FEATURE_FEATURE_COUNT = MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INCLUDED_ELEMENT__PART_OF = MENU_INCLUDED_FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INCLUDED_ELEMENT__DISPLAY_LABEL = MENU_INCLUDED_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INCLUDED_ELEMENT__NAME = MENU_INCLUDED_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INCLUDED_ELEMENT__FEATURE = MENU_INCLUDED_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Menu Included Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_INCLUDED_ELEMENT_FEATURE_COUNT = MENU_INCLUDED_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TARGET__TARGETTING_ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Select Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TARGET_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONTAINER__UNITS = 0;

	/**
	 * The number of structural features of the '<em>Unit Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.UnitTitle <em>Unit Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.UnitTitle
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitTitle()
	 * @generated
	 */
	int UNIT_TITLE = 29;

	/**
	 * The number of structural features of the '<em>Unit Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TITLE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__NAME = OrmPackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__DISPLAY_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__DISPLAYED_ON = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__PURPOSE_SUMMARY = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__OMIT_CAPTION = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__CAPTION_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__STYLE_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT__LAYOUT_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Content Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_UNIT_FEATURE_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__NAME = CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__DISPLAY_LABEL = CONTENT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__DISPLAYED_ON = CONTENT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__PURPOSE_SUMMARY = CONTENT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__OMIT_CAPTION = CONTENT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CAPTION_CLASS = CONTENT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__STYLE_CLASS = CONTENT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__LAYOUT_CLASS = CONTENT_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__SERVICE = CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT__CONTENT = CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Static Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_UNIT_FEATURE_COUNT = CONTENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CommandUnitImpl <em>Command Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.CommandUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCommandUnit()
	 * @generated
	 */
	int COMMAND_UNIT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_UNIT__NAME = CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_UNIT__DISPLAY_LABEL = CONTENT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_UNIT__DISPLAYED_ON = CONTENT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_UNIT__PURPOSE_SUMMARY = CONTENT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_UNIT__OMIT_CAPTION = CONTENT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_UNIT__CAPTION_CLASS = CONTENT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_UNIT__STYLE_CLASS = CONTENT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_UNIT__LAYOUT_CLASS = CONTENT_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_UNIT__COMMANDS = CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_UNIT_FEATURE_COUNT = CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.CommandImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PART_OF = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UserCommandImpl <em>User Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.UserCommandImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUserCommand()
	 * @generated
	 */
	int USER_COMMAND = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_COMMAND__NAME = COMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_COMMAND__PART_OF = COMMAND__PART_OF;

	/**
	 * The number of structural features of the '<em>User Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CreateSitemapUnitImpl <em>Create Sitemap Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.CreateSitemapUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCreateSitemapUnit()
	 * @generated
	 */
	int CREATE_SITEMAP_UNIT = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__NAME = CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__DISPLAY_LABEL = CONTENT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__DISPLAYED_ON = CONTENT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__PURPOSE_SUMMARY = CONTENT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__OMIT_CAPTION = CONTENT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__CAPTION_CLASS = CONTENT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__STYLE_CLASS = CONTENT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__LAYOUT_CLASS = CONTENT_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Deployed URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__DEPLOYED_URL = CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT__FILENAME = CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Sitemap Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SITEMAP_UNIT_FEATURE_COUNT = CONTENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__NAME = CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__DISPLAY_LABEL = CONTENT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__DISPLAYED_ON = CONTENT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__PURPOSE_SUMMARY = CONTENT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__OMIT_CAPTION = CONTENT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CAPTION_CLASS = CONTENT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__STYLE_CLASS = CONTENT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__LAYOUT_CLASS = CONTENT_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__SERVICE = CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__DISPLAY_FIELDS = CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__SUPPORT_ACTIONS = CONTENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__HEADER = CONTENT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__FOOTER = CONTENT_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__HEADER_CLASS = CONTENT_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__CONTROL_CLASS = CONTENT_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__FOOTER_CLASS = CONTENT_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT__ERROR_CLASS = CONTENT_UNIT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Dynamic Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_UNIT_FEATURE_COUNT = CONTENT_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__DISPLAYED_ON = 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__CARDINALITY = 1;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD__DATE_FORMAT = 2;

	/**
	 * The number of structural features of the '<em>Unit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FIELD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitFeatureImpl <em>Unit Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitFeatureImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitFeature()
	 * @generated
	 */
	int UNIT_FEATURE = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAY_LABEL = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FORCED_VALUE = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FOOTER = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__HEADER_CLASS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__INPUT_CLASS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAY_CLASS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__FOOTER_CLASS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAYED_ON = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__CARDINALITY = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DATE_FORMAT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__ACTIONS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__DISPLAY_OPTION = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Linked Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__LINKED_ACTION = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE__AUTOFOCUS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Unit Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitElementImpl <em>Unit Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitElementImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitElement()
	 * @generated
	 */
	int UNIT_ELEMENT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__NAME = UNIT_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DISPLAY_LABEL = UNIT_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__FORCED_VALUE = UNIT_FEATURE__FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__FOOTER = UNIT_FEATURE__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__HEADER_CLASS = UNIT_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__INPUT_CLASS = UNIT_FEATURE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DISPLAY_CLASS = UNIT_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__FOOTER_CLASS = UNIT_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DISPLAYED_ON = UNIT_FEATURE__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__CARDINALITY = UNIT_FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DATE_FORMAT = UNIT_FEATURE__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__ACTIONS = UNIT_FEATURE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__ONLY_DISPLAY_WHEN_NOT_EMPTY = UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DISPLAY_OPTION = UNIT_FEATURE__DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Linked Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__LINKED_ACTION = UNIT_FEATURE__LINKED_ACTION;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__MAXIMUM_DISPLAY_SIZE = UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE;

	/**
	 * The feature id for the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__AUTOFOCUS = UNIT_FEATURE__AUTOFOCUS;

	/**
	 * The feature id for the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS = UNIT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__DEFAULT_VALUE = UNIT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__SERVICE_FEATURE = UNIT_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__PLACEHOLDER = UNIT_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT__VALIDATION_PATTERN = UNIT_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Unit Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ELEMENT_FEATURE_COUNT = UNIT_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitAssociationImpl <em>Unit Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitAssociationImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitAssociation()
	 * @generated
	 */
	int UNIT_ASSOCIATION = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__NAME = UNIT_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISPLAY_LABEL = UNIT_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FORCED_VALUE = UNIT_FEATURE__FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FOOTER = UNIT_FEATURE__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__HEADER_CLASS = UNIT_FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__INPUT_CLASS = UNIT_FEATURE__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISPLAY_CLASS = UNIT_FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FOOTER_CLASS = UNIT_FEATURE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISPLAYED_ON = UNIT_FEATURE__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__CARDINALITY = UNIT_FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DATE_FORMAT = UNIT_FEATURE__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__ACTIONS = UNIT_FEATURE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__ONLY_DISPLAY_WHEN_NOT_EMPTY = UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DISPLAY_OPTION = UNIT_FEATURE__DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Linked Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__LINKED_ACTION = UNIT_FEATURE__LINKED_ACTION;

	/**
	 * The feature id for the '<em><b>Maximum Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__MAXIMUM_DISPLAY_SIZE = UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE;

	/**
	 * The feature id for the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__AUTOFOCUS = UNIT_FEATURE__AUTOFOCUS;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__UNITS = UNIT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__SERVICE_FEATURE = UNIT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__CHILD_FEATURE = UNIT_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__SELECTION = UNIT_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dynamic Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__DYNAMIC_LABEL = UNIT_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION__FILTERS = UNIT_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Unit Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_ASSOCIATION_FEATURE_COUNT = UNIT_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitChildFeatureImpl <em>Unit Child Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitChildFeatureImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitChildFeature()
	 * @generated
	 */
	int UNIT_CHILD_FEATURE = 41;

	/**
	 * The number of structural features of the '<em>Unit Child Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CHILD_FEATURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitChildElementImpl <em>Unit Child Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitChildElementImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitChildElement()
	 * @generated
	 */
	int UNIT_CHILD_ELEMENT = 42;

	/**
	 * The feature id for the '<em><b>Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CHILD_ELEMENT__SERVICE_FEATURE = UNIT_CHILD_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Child Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CHILD_ELEMENT_FEATURE_COUNT = UNIT_CHILD_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitChildAssociationImpl <em>Unit Child Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitChildAssociationImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitChildAssociation()
	 * @generated
	 */
	int UNIT_CHILD_ASSOCIATION = 43;

	/**
	 * The feature id for the '<em><b>Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CHILD_ASSOCIATION__SERVICE_FEATURE = UNIT_CHILD_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CHILD_ASSOCIATION__CHILD_FEATURE = UNIT_CHILD_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Child Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CHILD_ASSOCIATION_FEATURE_COUNT = UNIT_CHILD_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__NAME = OrmPackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DISPLAY_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DISPLAYED_ON = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__CARDINALITY = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DATE_FORMAT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__DEFAULT_VALUE = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__INPUT_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD__MUST_MATCH = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Interface Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FIELD_FEATURE_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.DataTypeFieldImpl <em>Data Type Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.DataTypeFieldImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getDataTypeField()
	 * @generated
	 */
	int DATA_TYPE_FIELD = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__NAME = INTERFACE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DISPLAY_LABEL = INTERFACE_FIELD__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DISPLAYED_ON = INTERFACE_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__CARDINALITY = INTERFACE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DATE_FORMAT = INTERFACE_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DEFAULT_VALUE = INTERFACE_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__INPUT_CLASS = INTERFACE_FIELD__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__MUST_MATCH = INTERFACE_FIELD__MUST_MATCH;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__DATA_TYPE = INTERFACE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case Insensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__CASE_INSENSITIVE = INTERFACE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS = INTERFACE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Encrypt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD__ENCRYPT = INTERFACE_FIELD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FIELD_FEATURE_COUNT = INTERFACE_FIELD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.DateFieldImpl <em>Date Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.DateFieldImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getDateField()
	 * @generated
	 */
	int DATE_FIELD = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__NAME = INTERFACE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DISPLAY_LABEL = INTERFACE_FIELD__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DISPLAYED_ON = INTERFACE_FIELD__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__CARDINALITY = INTERFACE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DATE_FORMAT = INTERFACE_FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DEFAULT_VALUE = INTERFACE_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__INPUT_CLASS = INTERFACE_FIELD__INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__MUST_MATCH = INTERFACE_FIELD__MUST_MATCH;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DETAILS = INTERFACE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__FORMAT = INTERFACE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD_FEATURE_COUNT = INTERFACE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CaptchaFieldImpl <em>Captcha Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.CaptchaFieldImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCaptchaField()
	 * @generated
	 */
	int CAPTCHA_FIELD = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__NAME = OrmPackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DISPLAY_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DISPLAYED_ON = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__CARDINALITY = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD__DATE_FORMAT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Captcha Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTCHA_FIELD_FEATURE_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitSupportActionImpl <em>Unit Support Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitSupportActionImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitSupportAction()
	 * @generated
	 */
	int UNIT_SUPPORT_ACTION = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__NAME = OrmPackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__DISPLAY_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SUPPORT_ACTION_FEATURE_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISPLAYED_ON = DYNAMIC_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CAPTION_CLASS = DYNAMIC_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__STYLE_CLASS = DYNAMIC_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__LAYOUT_CLASS = DYNAMIC_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__SERVICE = DYNAMIC_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__SUPPORT_ACTIONS = DYNAMIC_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__HEADER_CLASS = DYNAMIC_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONTROL_CLASS = DYNAMIC_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__FOOTER_CLASS = DYNAMIC_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__ERROR_CLASS = DYNAMIC_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONFIRM_DESTINATION = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CONFIRM_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CANCEL_DESTINATION = DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT__CANCEL_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Edit Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__STYLE_CLASS = EDIT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__LAYOUT_CLASS = EDIT_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__SERVICE = EDIT_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__ERROR_CLASS = EDIT_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The number of structural features of the '<em>Create Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__STYLE_CLASS = EDIT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__LAYOUT_CLASS = EDIT_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__SERVICE = EDIT_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__ERROR_CLASS = EDIT_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__TARGETTING_ACTIONS = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clear Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT__CLEAR_LABEL = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_UPDATE_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.MapUnitImpl <em>Map Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.MapUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getMapUnit()
	 * @generated
	 */
	int MAP_UNIT = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__STYLE_CLASS = EDIT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__LAYOUT_CLASS = EDIT_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__SERVICE = EDIT_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__ERROR_CLASS = EDIT_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__TARGETTING_ACTIONS = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__READ_ONLY = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Zoom Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__DEFAULT_ZOOM_LEVEL = EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__LOCATION = EDIT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Place Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT__PLACE_NAME = EDIT_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Map Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__STYLE_CLASS = EDIT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__LAYOUT_CLASS = EDIT_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__SERVICE = EDIT_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__ERROR_CLASS = EDIT_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT__TARGETTING_ACTIONS = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__DISPLAYED_ON = DYNAMIC_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__CAPTION_CLASS = DYNAMIC_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__STYLE_CLASS = DYNAMIC_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__LAYOUT_CLASS = DYNAMIC_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__SERVICE = DYNAMIC_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__SUPPORT_ACTIONS = DYNAMIC_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__HEADER_CLASS = DYNAMIC_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__CONTROL_CLASS = DYNAMIC_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__FOOTER_CLASS = DYNAMIC_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__ERROR_CLASS = DYNAMIC_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__SELECTION = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__DYNAMIC_TITLE = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__NAME = DATA_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DISPLAY_LABEL = DATA_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DISPLAYED_ON = DATA_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__PURPOSE_SUMMARY = DATA_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__OMIT_CAPTION = DATA_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CAPTION_CLASS = DATA_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__STYLE_CLASS = DATA_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__LAYOUT_CLASS = DATA_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__SERVICE = DATA_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DISPLAY_FIELDS = DATA_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__SUPPORT_ACTIONS = DATA_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__HEADER = DATA_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__FOOTER = DATA_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__HEADER_CLASS = DATA_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__CONTROL_CLASS = DATA_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__FOOTER_CLASS = DATA_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__ERROR_CLASS = DATA_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__SELECTION = DATA_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__DYNAMIC_TITLE = DATA_UNIT__DYNAMIC_TITLE;

	/**
	 * The feature id for the '<em><b>Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__TARGETTING_ACTIONS = DATA_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT__OMIT_FIELD_LABELS = DATA_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Details Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_UNIT_FEATURE_COUNT = DATA_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__NAME = DATA_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DISPLAY_LABEL = DATA_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DISPLAYED_ON = DATA_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PURPOSE_SUMMARY = DATA_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__OMIT_CAPTION = DATA_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CAPTION_CLASS = DATA_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__STYLE_CLASS = DATA_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__LAYOUT_CLASS = DATA_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SERVICE = DATA_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DISPLAY_FIELDS = DATA_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SUPPORT_ACTIONS = DATA_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__HEADER = DATA_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FOOTER = DATA_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__HEADER_CLASS = DATA_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__CONTROL_CLASS = DATA_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FOOTER_CLASS = DATA_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ERROR_CLASS = DATA_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__SELECTION = DATA_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DYNAMIC_TITLE = DATA_UNIT__DYNAMIC_TITLE;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ACTIONS = DATA_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__TARGETTING_ACTIONS = DATA_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Omit Column Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__OMIT_COLUMN_LABELS = DATA_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__DEFAULT_PAGINATION_SIZE = DATA_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__NEXT_PAGE_LABEL = DATA_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__PREVIOUS_PAGE_LABEL = DATA_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS = DATA_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__FIRST_PAGE_LABEL = DATA_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__LAST_PAGE_LABEL = DATA_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Targetting Searches</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__TARGETTING_SEARCHES = DATA_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Row Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT__ROW_CLASSES = DATA_UNIT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Index Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_UNIT_FEATURE_COUNT = DATA_UNIT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.IndexGridUnitImpl <em>Index Grid Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.IndexGridUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getIndexGridUnit()
	 * @generated
	 */
	int INDEX_GRID_UNIT = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__NAME = INDEX_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__DISPLAY_LABEL = INDEX_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__DISPLAYED_ON = INDEX_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__PURPOSE_SUMMARY = INDEX_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__OMIT_CAPTION = INDEX_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__CAPTION_CLASS = INDEX_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__STYLE_CLASS = INDEX_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__LAYOUT_CLASS = INDEX_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__SERVICE = INDEX_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__DISPLAY_FIELDS = INDEX_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__SUPPORT_ACTIONS = INDEX_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__HEADER = INDEX_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__FOOTER = INDEX_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__HEADER_CLASS = INDEX_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__CONTROL_CLASS = INDEX_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__FOOTER_CLASS = INDEX_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__ERROR_CLASS = INDEX_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__SELECTION = INDEX_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__DYNAMIC_TITLE = INDEX_UNIT__DYNAMIC_TITLE;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__ACTIONS = INDEX_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__TARGETTING_ACTIONS = INDEX_UNIT__TARGETTING_ACTIONS;

	/**
	 * The feature id for the '<em><b>Omit Column Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__OMIT_COLUMN_LABELS = INDEX_UNIT__OMIT_COLUMN_LABELS;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__DEFAULT_PAGINATION_SIZE = INDEX_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__NEXT_PAGE_LABEL = INDEX_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__PREVIOUS_PAGE_LABEL = INDEX_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__USE_FIRST_LAST_PAGE_LINKS = INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__FIRST_PAGE_LABEL = INDEX_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__LAST_PAGE_LABEL = INDEX_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Targetting Searches</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__TARGETTING_SEARCHES = INDEX_UNIT__TARGETTING_SEARCHES;

	/**
	 * The feature id for the '<em><b>Row Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT__ROW_CLASSES = INDEX_UNIT__ROW_CLASSES;

	/**
	 * The number of structural features of the '<em>Index Grid Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_GRID_UNIT_FEATURE_COUNT = INDEX_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.IndexPageDirectionUnitImpl <em>Index Page Direction Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.IndexPageDirectionUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getIndexPageDirectionUnit()
	 * @generated
	 */
	int INDEX_PAGE_DIRECTION_UNIT = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__NAME = INDEX_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__DISPLAY_LABEL = INDEX_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__DISPLAYED_ON = INDEX_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__PURPOSE_SUMMARY = INDEX_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__OMIT_CAPTION = INDEX_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__CAPTION_CLASS = INDEX_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__STYLE_CLASS = INDEX_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__LAYOUT_CLASS = INDEX_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__SERVICE = INDEX_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__DISPLAY_FIELDS = INDEX_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__SUPPORT_ACTIONS = INDEX_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__HEADER = INDEX_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__FOOTER = INDEX_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__HEADER_CLASS = INDEX_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__CONTROL_CLASS = INDEX_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__FOOTER_CLASS = INDEX_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__ERROR_CLASS = INDEX_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__SELECTION = INDEX_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__DYNAMIC_TITLE = INDEX_UNIT__DYNAMIC_TITLE;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__ACTIONS = INDEX_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__TARGETTING_ACTIONS = INDEX_UNIT__TARGETTING_ACTIONS;

	/**
	 * The feature id for the '<em><b>Omit Column Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__OMIT_COLUMN_LABELS = INDEX_UNIT__OMIT_COLUMN_LABELS;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__DEFAULT_PAGINATION_SIZE = INDEX_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__NEXT_PAGE_LABEL = INDEX_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__PREVIOUS_PAGE_LABEL = INDEX_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS = INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__FIRST_PAGE_LABEL = INDEX_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__LAST_PAGE_LABEL = INDEX_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Targetting Searches</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__TARGETTING_SEARCHES = INDEX_UNIT__TARGETTING_SEARCHES;

	/**
	 * The feature id for the '<em><b>Row Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT__ROW_CLASSES = INDEX_UNIT__ROW_CLASSES;

	/**
	 * The number of structural features of the '<em>Index Page Direction Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_DIRECTION_UNIT_FEATURE_COUNT = INDEX_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.IndexLineDirectionUnitImpl <em>Index Line Direction Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.IndexLineDirectionUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getIndexLineDirectionUnit()
	 * @generated
	 */
	int INDEX_LINE_DIRECTION_UNIT = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__NAME = INDEX_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__DISPLAY_LABEL = INDEX_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__DISPLAYED_ON = INDEX_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__PURPOSE_SUMMARY = INDEX_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__OMIT_CAPTION = INDEX_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__CAPTION_CLASS = INDEX_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__STYLE_CLASS = INDEX_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__LAYOUT_CLASS = INDEX_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__SERVICE = INDEX_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__DISPLAY_FIELDS = INDEX_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__SUPPORT_ACTIONS = INDEX_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__HEADER = INDEX_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__FOOTER = INDEX_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__HEADER_CLASS = INDEX_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__CONTROL_CLASS = INDEX_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__FOOTER_CLASS = INDEX_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__ERROR_CLASS = INDEX_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__SELECTION = INDEX_UNIT__SELECTION;

	/**
	 * The feature id for the '<em><b>Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__DYNAMIC_TITLE = INDEX_UNIT__DYNAMIC_TITLE;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__ACTIONS = INDEX_UNIT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__TARGETTING_ACTIONS = INDEX_UNIT__TARGETTING_ACTIONS;

	/**
	 * The feature id for the '<em><b>Omit Column Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__OMIT_COLUMN_LABELS = INDEX_UNIT__OMIT_COLUMN_LABELS;

	/**
	 * The feature id for the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__DEFAULT_PAGINATION_SIZE = INDEX_UNIT__DEFAULT_PAGINATION_SIZE;

	/**
	 * The feature id for the '<em><b>Next Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__NEXT_PAGE_LABEL = INDEX_UNIT__NEXT_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Previous Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__PREVIOUS_PAGE_LABEL = INDEX_UNIT__PREVIOUS_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS = INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS;

	/**
	 * The feature id for the '<em><b>First Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__FIRST_PAGE_LABEL = INDEX_UNIT__FIRST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Last Page Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__LAST_PAGE_LABEL = INDEX_UNIT__LAST_PAGE_LABEL;

	/**
	 * The feature id for the '<em><b>Targetting Searches</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__TARGETTING_SEARCHES = INDEX_UNIT__TARGETTING_SEARCHES;

	/**
	 * The feature id for the '<em><b>Row Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT__ROW_CLASSES = INDEX_UNIT__ROW_CLASSES;

	/**
	 * The number of structural features of the '<em>Index Line Direction Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_LINE_DIRECTION_UNIT_FEATURE_COUNT = INDEX_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ControlUnitImpl <em>Control Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.ControlUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getControlUnit()
	 * @generated
	 */
	int CONTROL_UNIT = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__NAME = DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DISPLAY_LABEL = DYNAMIC_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DISPLAYED_ON = DYNAMIC_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__PURPOSE_SUMMARY = DYNAMIC_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__OMIT_CAPTION = DYNAMIC_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CAPTION_CLASS = DYNAMIC_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__STYLE_CLASS = DYNAMIC_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__LAYOUT_CLASS = DYNAMIC_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__SERVICE = DYNAMIC_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DISPLAY_FIELDS = DYNAMIC_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__SUPPORT_ACTIONS = DYNAMIC_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__HEADER = DYNAMIC_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__FOOTER = DYNAMIC_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__HEADER_CLASS = DYNAMIC_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CONTROL_CLASS = DYNAMIC_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__FOOTER_CLASS = DYNAMIC_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__ERROR_CLASS = DYNAMIC_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__SUBMIT_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CANCEL_DESTINATION = DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__CANCEL_LABEL = DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT_FEATURE_COUNT = DYNAMIC_UNIT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.SearchUnitImpl <em>Search Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.SearchUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getSearchUnit()
	 * @generated
	 */
	int SEARCH_UNIT = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__NAME = CONTROL_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__DISPLAY_LABEL = CONTROL_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__DISPLAYED_ON = CONTROL_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__PURPOSE_SUMMARY = CONTROL_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__OMIT_CAPTION = CONTROL_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CAPTION_CLASS = CONTROL_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__STYLE_CLASS = CONTROL_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__LAYOUT_CLASS = CONTROL_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__SERVICE = CONTROL_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__DISPLAY_FIELDS = CONTROL_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__SUPPORT_ACTIONS = CONTROL_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__HEADER = CONTROL_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__FOOTER = CONTROL_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__HEADER_CLASS = CONTROL_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CONTROL_CLASS = CONTROL_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__FOOTER_CLASS = CONTROL_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__ERROR_CLASS = CONTROL_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__SUBMIT_LABEL = CONTROL_UNIT__SUBMIT_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CANCEL_DESTINATION = CONTROL_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__CANCEL_LABEL = CONTROL_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Results Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT__RESULTS_DESTINATION = CONTROL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Search Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_UNIT_FEATURE_COUNT = CONTROL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ActionUnitImpl <em>Action Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.ActionUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getActionUnit()
	 * @generated
	 */
	int ACTION_UNIT = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__NAME = CONTROL_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__DISPLAY_LABEL = CONTROL_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__DISPLAYED_ON = CONTROL_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__PURPOSE_SUMMARY = CONTROL_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__OMIT_CAPTION = CONTROL_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__CAPTION_CLASS = CONTROL_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__STYLE_CLASS = CONTROL_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__LAYOUT_CLASS = CONTROL_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__SERVICE = CONTROL_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__DISPLAY_FIELDS = CONTROL_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__SUPPORT_ACTIONS = CONTROL_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__HEADER = CONTROL_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__FOOTER = CONTROL_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__HEADER_CLASS = CONTROL_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__CONTROL_CLASS = CONTROL_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__FOOTER_CLASS = CONTROL_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__ERROR_CLASS = CONTROL_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__SUBMIT_LABEL = CONTROL_UNIT__SUBMIT_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__CANCEL_DESTINATION = CONTROL_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__CANCEL_LABEL = CONTROL_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT__OMIT_FIELD_LABELS = CONTROL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_UNIT_FEATURE_COUNT = CONTROL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.AuthenticationUnitImpl <em>Authentication Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.AuthenticationUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getAuthenticationUnit()
	 * @generated
	 */
	int AUTHENTICATION_UNIT = 63;

	/**
	 * The number of structural features of the '<em>Authentication Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_UNIT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.RegistrationUnitImpl <em>Registration Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.RegistrationUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getRegistrationUnit()
	 * @generated
	 */
	int REGISTRATION_UNIT = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__NAME = EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__DISPLAY_LABEL = EDIT_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__DISPLAYED_ON = EDIT_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__PURPOSE_SUMMARY = EDIT_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__OMIT_CAPTION = EDIT_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CAPTION_CLASS = EDIT_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__STYLE_CLASS = EDIT_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__LAYOUT_CLASS = EDIT_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__SERVICE = EDIT_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__DISPLAY_FIELDS = EDIT_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__SUPPORT_ACTIONS = EDIT_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__HEADER = EDIT_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__FOOTER = EDIT_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__HEADER_CLASS = EDIT_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONTROL_CLASS = EDIT_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__FOOTER_CLASS = EDIT_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__ERROR_CLASS = EDIT_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONFIRM_DESTINATION = EDIT_UNIT__CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CONFIRM_LABEL = EDIT_UNIT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CANCEL_DESTINATION = EDIT_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__CANCEL_LABEL = EDIT_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Authentication System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT__AUTHENTICATION_SYSTEM = EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Registration Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_UNIT_FEATURE_COUNT = EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.LoginUnitImpl <em>Login Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.LoginUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getLoginUnit()
	 * @generated
	 */
	int LOGIN_UNIT = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__NAME = CONTROL_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__DISPLAY_LABEL = CONTROL_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__DISPLAYED_ON = CONTROL_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__PURPOSE_SUMMARY = CONTROL_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__OMIT_CAPTION = CONTROL_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CAPTION_CLASS = CONTROL_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__STYLE_CLASS = CONTROL_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__LAYOUT_CLASS = CONTROL_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__SERVICE = CONTROL_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__DISPLAY_FIELDS = CONTROL_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__SUPPORT_ACTIONS = CONTROL_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__HEADER = CONTROL_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__FOOTER = CONTROL_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__HEADER_CLASS = CONTROL_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CONTROL_CLASS = CONTROL_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__FOOTER_CLASS = CONTROL_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__ERROR_CLASS = CONTROL_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__SUBMIT_LABEL = CONTROL_UNIT__SUBMIT_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CANCEL_DESTINATION = CONTROL_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__CANCEL_LABEL = CONTROL_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Authentication System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__AUTHENTICATION_SYSTEM = CONTROL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Login Id Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__LOGIN_ID_FIELD = CONTROL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__PASSWORD_FIELD = CONTROL_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remember Me Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT__REMEMBER_ME_FIELD = CONTROL_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Login Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_UNIT_FEATURE_COUNT = CONTROL_UNIT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ForgottenPasswordUnitImpl <em>Forgotten Password Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.ForgottenPasswordUnitImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getForgottenPasswordUnit()
	 * @generated
	 */
	int FORGOTTEN_PASSWORD_UNIT = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__NAME = CONTROL_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__DISPLAY_LABEL = CONTROL_UNIT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON = CONTROL_UNIT__DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__PURPOSE_SUMMARY = CONTROL_UNIT__PURPOSE_SUMMARY;

	/**
	 * The feature id for the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__OMIT_CAPTION = CONTROL_UNIT__OMIT_CAPTION;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CAPTION_CLASS = CONTROL_UNIT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__STYLE_CLASS = CONTROL_UNIT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__LAYOUT_CLASS = CONTROL_UNIT__LAYOUT_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__SERVICE = CONTROL_UNIT__SERVICE;

	/**
	 * The feature id for the '<em><b>Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__DISPLAY_FIELDS = CONTROL_UNIT__DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__SUPPORT_ACTIONS = CONTROL_UNIT__SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__HEADER = CONTROL_UNIT__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__FOOTER = CONTROL_UNIT__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__HEADER_CLASS = CONTROL_UNIT__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Control Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CONTROL_CLASS = CONTROL_UNIT__CONTROL_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__FOOTER_CLASS = CONTROL_UNIT__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Error Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__ERROR_CLASS = CONTROL_UNIT__ERROR_CLASS;

	/**
	 * The feature id for the '<em><b>Submit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__SUBMIT_LABEL = CONTROL_UNIT__SUBMIT_LABEL;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CANCEL_DESTINATION = CONTROL_UNIT__CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Cancel Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__CANCEL_LABEL = CONTROL_UNIT__CANCEL_LABEL;

	/**
	 * The feature id for the '<em><b>Authentication System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__AUTHENTICATION_SYSTEM = CONTROL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Login Id Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT__LOGIN_ID_FIELD = CONTROL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Forgotten Password Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_UNIT_FEATURE_COUNT = CONTROL_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.InlineActionContainer <em>Inline Action Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.InlineActionContainer
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getInlineActionContainer()
	 * @generated
	 */
	int INLINE_ACTION_CONTAINER = 67;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_CONTAINER__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Inline Action Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__NAME = OrmPackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__DISPLAY_LABEL = OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__USED_BY = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__HEADER = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__FOOTER = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__HEADER_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION__FOOTER_CLASS = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Inline Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_ACTION_FEATURE_COUNT = OrmPackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__NAME = INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__DISPLAY_LABEL = INLINE_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__USED_BY = INLINE_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__HEADER = INLINE_ACTION__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__FOOTER = INLINE_ACTION__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__HEADER_CLASS = INLINE_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__FOOTER_CLASS = INLINE_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION__TARGET = INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ACTION_FEATURE_COUNT = INLINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__NAME = INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DISPLAY_LABEL = INLINE_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__USED_BY = INLINE_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__HEADER = INLINE_ACTION__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__FOOTER = INLINE_ACTION__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__HEADER_CLASS = INLINE_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__FOOTER_CLASS = INLINE_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__DESTINATION = INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__CONFIRM_MESSAGE = INLINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION_FEATURE_COUNT = INLINE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.FeatureSupportActionImpl <em>Feature Support Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.FeatureSupportActionImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getFeatureSupportAction()
	 * @generated
	 */
	int FEATURE_SUPPORT_ACTION = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__NAME = INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__DISPLAY_LABEL = INLINE_ACTION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__USED_BY = INLINE_ACTION__USED_BY;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__HEADER = INLINE_ACTION__HEADER;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__FOOTER = INLINE_ACTION__FOOTER;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__HEADER_CLASS = INLINE_ACTION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__FOOTER_CLASS = INLINE_ACTION__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE = INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUPPORT_ACTION_FEATURE_COUNT = INLINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.ModelReferenceImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getModelReference()
	 * @generated
	 */
	int MODEL_REFERENCE = 72;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__UNIT = CriteriaPackage.PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_FEATURE_COUNT = CriteriaPackage.PATH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.FeatureReferenceImpl <em>Feature Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.FeatureReferenceImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getFeatureReference()
	 * @generated
	 */
	int FEATURE_REFERENCE = 73;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE__FIELD = CriteriaPackage.PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_FEATURE_COUNT = CriteriaPackage.PATH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CurrentUserReferenceImpl <em>Current User Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.impl.CurrentUserReferenceImpl
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCurrentUserReference()
	 * @generated
	 */
	int CURRENT_USER_REFERENCE = 74;

	/**
	 * The number of structural features of the '<em>Current User Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER_REFERENCE_FEATURE_COUNT = CriteriaPackage.PATH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.FrameworkTechnologies <em>Framework Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.FrameworkTechnologies
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getFrameworkTechnologies()
	 * @generated
	 */
	int FRAMEWORK_TECHNOLOGIES = 75;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.AjaxTechnologies <em>Ajax Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.AjaxTechnologies
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getAjaxTechnologies()
	 * @generated
	 */
	int AJAX_TECHNOLOGIES = 76;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.PageTopMenuOptions <em>Page Top Menu Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.PageTopMenuOptions
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getPageTopMenuOptions()
	 * @generated
	 */
	int PAGE_TOP_MENU_OPTIONS = 77;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.jsf.CollectionDisplayOptions <em>Collection Display Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.jsf.CollectionDisplayOptions
	 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCollectionDisplayOptions()
	 * @generated
	 */
	int COLLECTION_DISPLAY_OPTIONS = 78;

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.JsfModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel
	 * @generated
	 */
	EClass getJsfModel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getPersistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Persistence</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getPersistence()
	 * @see #getJsfModel()
	 * @generated
	 */
	EReference getJsfModel_Persistence();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getServices()
	 * @see #getJsfModel()
	 * @generated
	 */
	EReference getJsfModel_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getPages()
	 * @see #getJsfModel()
	 * @generated
	 */
	EReference getJsfModel_Pages();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getMenus <em>Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menus</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getMenus()
	 * @see #getJsfModel()
	 * @generated
	 */
	EReference getJsfModel_Menus();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getSiteName <em>Site Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Name</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getSiteName()
	 * @see #getJsfModel()
	 * @generated
	 */
	EAttribute getJsfModel_SiteName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getSiteTitle <em>Site Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Title</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getSiteTitle()
	 * @see #getJsfModel()
	 * @generated
	 */
	EAttribute getJsfModel_SiteTitle();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#isDevelopmentVersion <em>Development Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Development Version</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#isDevelopmentVersion()
	 * @see #getJsfModel()
	 * @generated
	 */
	EAttribute getJsfModel_DevelopmentVersion();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getBaseURL <em>Base URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base URL</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getBaseURL()
	 * @see #getJsfModel()
	 * @generated
	 */
	EAttribute getJsfModel_BaseURL();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#isRewriteURLs <em>Rewrite UR Ls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rewrite UR Ls</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#isRewriteURLs()
	 * @see #getJsfModel()
	 * @generated
	 */
	EAttribute getJsfModel_RewriteURLs();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getWebmasterEmail <em>Webmaster Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webmaster Email</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getWebmasterEmail()
	 * @see #getJsfModel()
	 * @generated
	 */
	EAttribute getJsfModel_WebmasterEmail();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getCopyrightText <em>Copyright Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright Text</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getCopyrightText()
	 * @see #getJsfModel()
	 * @generated
	 */
	EAttribute getJsfModel_CopyrightText();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getMetaDescription <em>Meta Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Description</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getMetaDescription()
	 * @see #getJsfModel()
	 * @generated
	 */
	EAttribute getJsfModel_MetaDescription();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getFrameworkTechnology <em>Framework Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework Technology</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getFrameworkTechnology()
	 * @see #getJsfModel()
	 * @generated
	 */
	EAttribute getJsfModel_FrameworkTechnology();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getAjaxTechnology <em>Ajax Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ajax Technology</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getAjaxTechnology()
	 * @see #getJsfModel()
	 * @generated
	 */
	EAttribute getJsfModel_AjaxTechnology();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authentication</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getAuthentication()
	 * @see #getJsfModel()
	 * @generated
	 */
	EReference getJsfModel_Authentication();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getCaptchaSiteKey <em>Captcha Site Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Captcha Site Key</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getCaptchaSiteKey()
	 * @see #getJsfModel()
	 * @generated
	 */
	EAttribute getJsfModel_CaptchaSiteKey();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getCaptchaSecretKey <em>Captcha Secret Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Captcha Secret Key</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getCaptchaSecretKey()
	 * @see #getJsfModel()
	 * @generated
	 */
	EAttribute getJsfModel_CaptchaSecretKey();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getTopNavigationId <em>Top Navigation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Navigation Id</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getTopNavigationId()
	 * @see #getJsfModel()
	 * @generated
	 */
	EAttribute getJsfModel_TopNavigationId();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getSideMenu <em>Side Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Side Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getSideMenu()
	 * @see #getJsfModel()
	 * @generated
	 */
	EReference getJsfModel_SideMenu();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#isStaticUnitsEditable <em>Static Units Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Units Editable</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#isStaticUnitsEditable()
	 * @see #getJsfModel()
	 * @generated
	 */
	EAttribute getJsfModel_StaticUnitsEditable();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.jsf.Service#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Service#getEntities()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.jsf.Service#getSelections <em>Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selections</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Service#getSelections()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Selections();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.jsf.Service#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Service#getFeatures()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Features();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.jsf.Service#getAccessedBy <em>Accessed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessed By</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Service#getAccessedBy()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_AccessedBy();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.ModelLabel <em>Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ModelLabel
	 * @generated
	 */
	EClass getModelLabel();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.jsf.ModelLabel#getLabelFor <em>Label For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Label For</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ModelLabel#getLabelFor()
	 * @see #getModelLabel()
	 * @generated
	 */
	EReference getModelLabel_LabelFor();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ModelLabel#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ModelLabel#getFormat()
	 * @see #getModelLabel()
	 * @generated
	 */
	EAttribute getModelLabel_Format();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.jsf.ModelLabel#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ModelLabel#getFeatures()
	 * @see #getModelLabel()
	 * @generated
	 */
	EReference getModelLabel_Features();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.ServiceFeature <em>Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceFeature
	 * @generated
	 */
	EClass getServiceFeature();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.jsf.ServiceFeature#getIncludedBy <em>Included By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Included By</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceFeature#getIncludedBy()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EReference getServiceFeature_IncludedBy();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ServiceFeature#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceFeature#getCardinality()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EAttribute getServiceFeature_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ServiceFeature#getDateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Format</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceFeature#getDateFormat()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EAttribute getServiceFeature_DateFormat();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.ServiceEntityFeature <em>Service Entity Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Entity Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceEntityFeature
	 * @generated
	 */
	EClass getServiceEntityFeature();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ServiceEntityFeature#getViewColumnName <em>View Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Column Name</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceEntityFeature#getViewColumnName()
	 * @see #getServiceEntityFeature()
	 * @generated
	 */
	EAttribute getServiceEntityFeature_ViewColumnName();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.ServiceEntityElement <em>Service Entity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Entity Element</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceEntityElement
	 * @generated
	 */
	EClass getServiceEntityElement();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.ServiceEntityElement#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceEntityElement#getFeature()
	 * @see #getServiceEntityElement()
	 * @generated
	 */
	EReference getServiceEntityElement_Feature();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ServiceEntityElement#isCaseInsensitive <em>Case Insensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Insensitive</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceEntityElement#isCaseInsensitive()
	 * @see #getServiceEntityElement()
	 * @generated
	 */
	EAttribute getServiceEntityElement_CaseInsensitive();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ServiceEntityElement#isEncrypt <em>Encrypt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypt</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceEntityElement#isEncrypt()
	 * @see #getServiceEntityElement()
	 * @generated
	 */
	EAttribute getServiceEntityElement_Encrypt();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ServiceEntityElement#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceEntityElement#getPlaceholder()
	 * @see #getServiceEntityElement()
	 * @generated
	 */
	EAttribute getServiceEntityElement_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ServiceEntityElement#getValidationPattern <em>Validation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Pattern</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceEntityElement#getValidationPattern()
	 * @see #getServiceEntityElement()
	 * @generated
	 */
	EAttribute getServiceEntityElement_ValidationPattern();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.ServiceAssociation <em>Service Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Association</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceAssociation
	 * @generated
	 */
	EClass getServiceAssociation();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.ServiceEntityAssociation <em>Service Entity Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Entity Association</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceEntityAssociation
	 * @generated
	 */
	EClass getServiceEntityAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.ServiceEntityAssociation#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceEntityAssociation#getFeature()
	 * @see #getServiceEntityAssociation()
	 * @generated
	 */
	EReference getServiceEntityAssociation_Feature();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.ServiceEntityAssociation#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceEntityAssociation#getOpposite()
	 * @see #getServiceEntityAssociation()
	 * @generated
	 */
	EReference getServiceEntityAssociation_Opposite();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.ServiceViewAssociation <em>Service View Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service View Association</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceViewAssociation
	 * @generated
	 */
	EClass getServiceViewAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.ServiceViewAssociation#getTargetFeature <em>Target Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceViewAssociation#getTargetFeature()
	 * @see #getServiceViewAssociation()
	 * @generated
	 */
	EReference getServiceViewAssociation_TargetFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.jsf.Selection#getJoins <em>Joins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Joins</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Selection#getJoins()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Joins();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.jsf.Selection#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Selection#getFilter()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.jsf.Selection#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ordering</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Selection#getOrdering()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Selection#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Selection#getLimit()
	 * @see #getSelection()
	 * @generated
	 */
	EAttribute getSelection_Limit();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.jsf.Service#getDaosUsed <em>Daos Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Daos Used</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Service#getDaosUsed()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_DaosUsed();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Service#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Service#getModelName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ModelName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Service#isView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Service#isView()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_View();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Service#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Name</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Service#getViewName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ViewName();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.jsf.Service#getDisplayLabels <em>Display Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Labels</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Service#getDisplayLabels()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_DisplayLabels();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.SelectTarget <em>Select Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Target</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.SelectTarget
	 * @generated
	 */
	EClass getSelectTarget();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.jsf.SelectTarget#getTargettingActions <em>Targetting Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targetting Actions</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.SelectTarget#getTargettingActions()
	 * @see #getSelectTarget()
	 * @generated
	 */
	EReference getSelectTarget_TargettingActions();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.UnitContainer <em>Unit Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Container</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitContainer
	 * @generated
	 */
	EClass getUnitContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.jsf.UnitContainer#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitContainer#getUnits()
	 * @see #getUnitContainer()
	 * @generated
	 */
	EReference getUnitContainer_Units();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.UnitTitle <em>Unit Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Title</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitTitle
	 * @generated
	 */
	EClass getUnitTitle();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.jsf.Page#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Page#getPartOf()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_PartOf();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.Page#getParentPage <em>Parent Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Page</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Page#getParentPage()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_ParentPage();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.jsf.Page#getChildPages <em>Child Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Pages</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Page#getChildPages()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_ChildPages();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Page#getNavigationLabel <em>Navigation Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Page#getNavigationLabel()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_NavigationLabel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.Page#getSideMenu <em>Side Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Side Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Page#getSideMenu()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_SideMenu();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Page#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Page#getStyleClass()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_StyleClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.jsf.Menu#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Menu#getEntries()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Entries();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Menu#isOmitCaption <em>Omit Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Caption</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Menu#isOmitCaption()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_OmitCaption();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Menu#getCaptionClass <em>Caption Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Menu#getCaptionClass()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_CaptionClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Menu#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Menu#getStyleClass()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Menu#getLayoutClass <em>Layout Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Menu#getLayoutClass()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_LayoutClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.MenuEntry <em>Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.MenuEntry
	 * @generated
	 */
	EClass getMenuEntry();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.jsf.MenuEntry#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.MenuEntry#getPartOf()
	 * @see #getMenuEntry()
	 * @generated
	 */
	EReference getMenuEntry_PartOf();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.MenuIncludedFeature <em>Menu Included Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Included Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.MenuIncludedFeature
	 * @generated
	 */
	EClass getMenuIncludedFeature();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.MenuIncludedFeature#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.MenuIncludedFeature#getDisplayLabel()
	 * @see #getMenuIncludedFeature()
	 * @generated
	 */
	EAttribute getMenuIncludedFeature_DisplayLabel();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.MenuIncludedElement <em>Menu Included Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Included Element</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.MenuIncludedElement
	 * @generated
	 */
	EClass getMenuIncludedElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.MenuIncludedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.MenuIncludedElement#getName()
	 * @see #getMenuIncludedElement()
	 * @generated
	 */
	EAttribute getMenuIncludedElement_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.MenuIncludedElement#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.MenuIncludedElement#getFeature()
	 * @see #getMenuIncludedElement()
	 * @generated
	 */
	EReference getMenuIncludedElement_Feature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.StaticMenu <em>Static Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.StaticMenu
	 * @generated
	 */
	EClass getStaticMenu();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.FixedPageMenuEntry <em>Fixed Page Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Page Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.FixedPageMenuEntry
	 * @generated
	 */
	EClass getFixedPageMenuEntry();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.FixedPageMenuEntry#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.FixedPageMenuEntry#getDestination()
	 * @see #getFixedPageMenuEntry()
	 * @generated
	 */
	EReference getFixedPageMenuEntry_Destination();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.FixedActionMenuEntry <em>Fixed Action Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Action Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.FixedActionMenuEntry
	 * @generated
	 */
	EClass getFixedActionMenuEntry();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.FixedActionMenuEntry#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.FixedActionMenuEntry#getDestination()
	 * @see #getFixedActionMenuEntry()
	 * @generated
	 */
	EReference getFixedActionMenuEntry_Destination();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.FixedCommandMenuEntry <em>Fixed Command Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Command Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.FixedCommandMenuEntry
	 * @generated
	 */
	EClass getFixedCommandMenuEntry();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.FixedCommandMenuEntry#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.FixedCommandMenuEntry#getDestination()
	 * @see #getFixedCommandMenuEntry()
	 * @generated
	 */
	EReference getFixedCommandMenuEntry_Destination();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.EditStaticTextMenuEntry <em>Edit Static Text Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Static Text Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.EditStaticTextMenuEntry
	 * @generated
	 */
	EClass getEditStaticTextMenuEntry();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.DynamicMenu <em>Dynamic Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicMenu
	 * @generated
	 */
	EClass getDynamicMenu();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.DynamicMenu#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicMenu#getService()
	 * @see #getDynamicMenu()
	 * @generated
	 */
	EReference getDynamicMenu_Service();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.DynamicMenu#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicMenu#getSelection()
	 * @see #getDynamicMenu()
	 * @generated
	 */
	EReference getDynamicMenu_Selection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.DynamicMenu#getDynamicTitle <em>Dynamic Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamic Title</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicMenu#getDynamicTitle()
	 * @see #getDynamicMenu()
	 * @generated
	 */
	EReference getDynamicMenu_DynamicTitle();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Page#getAuthenticated <em>Authenticated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authenticated</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Page#getAuthenticated()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Authenticated();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Page#getTopMenuOption <em>Top Menu Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Menu Option</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Page#getTopMenuOption()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_TopMenuOption();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Page#getTopMenuRank <em>Top Menu Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Menu Rank</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Page#getTopMenuRank()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_TopMenuRank();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.ContentUnit <em>Content Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ContentUnit
	 * @generated
	 */
	EClass getContentUnit();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.jsf.ContentUnit#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Displayed On</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ContentUnit#getDisplayedOn()
	 * @see #getContentUnit()
	 * @generated
	 */
	EReference getContentUnit_DisplayedOn();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose Summary</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ContentUnit#getPurposeSummary()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_PurposeSummary();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ContentUnit#isOmitCaption <em>Omit Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Caption</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ContentUnit#isOmitCaption()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_OmitCaption();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ContentUnit#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ContentUnit#getStyleClass()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ContentUnit#getLayoutClass <em>Layout Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ContentUnit#getLayoutClass()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_LayoutClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ContentUnit#getCaptionClass <em>Caption Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ContentUnit#getCaptionClass()
	 * @see #getContentUnit()
	 * @generated
	 */
	EAttribute getContentUnit_CaptionClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.UnitField <em>Unit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Field</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitField
	 * @generated
	 */
	EClass getUnitField();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.jsf.UnitField#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Displayed On</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitField#getDisplayedOn()
	 * @see #getUnitField()
	 * @generated
	 */
	EReference getUnitField_DisplayedOn();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.UnitField#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitField#getCardinality()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.UnitField#getDateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Format</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitField#getDateFormat()
	 * @see #getUnitField()
	 * @generated
	 */
	EAttribute getUnitField_DateFormat();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.UnitFeature <em>Unit Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitFeature
	 * @generated
	 */
	EClass getUnitFeature();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Display When Not Empty</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitFeature#isOnlyDisplayWhenNotEmpty()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_OnlyDisplayWhenNotEmpty();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#getDisplayOption <em>Display Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Option</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitFeature#getDisplayOption()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_DisplayOption();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#getLinkedAction <em>Linked Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Action</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitFeature#getLinkedAction()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EReference getUnitFeature_LinkedAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#getMaximumDisplaySize <em>Maximum Display Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Display Size</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitFeature#getMaximumDisplaySize()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_MaximumDisplaySize();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#isAutofocus <em>Autofocus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autofocus</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitFeature#isAutofocus()
	 * @see #getUnitFeature()
	 * @generated
	 */
	EAttribute getUnitFeature_Autofocus();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.UnitElement <em>Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Element</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitElement
	 * @generated
	 */
	EClass getUnitElement();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.UnitElement#getServiceFeature <em>Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitElement#getServiceFeature()
	 * @see #getUnitElement()
	 * @generated
	 */
	EReference getUnitElement_ServiceFeature();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.UnitElement#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitElement#getPlaceholder()
	 * @see #getUnitElement()
	 * @generated
	 */
	EAttribute getUnitElement_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.UnitElement#getValidationPattern <em>Validation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Pattern</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitElement#getValidationPattern()
	 * @see #getUnitElement()
	 * @generated
	 */
	EAttribute getUnitElement_ValidationPattern();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.UnitAssociation <em>Unit Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Association</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitAssociation
	 * @generated
	 */
	EClass getUnitAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.UnitAssociation#getServiceFeature <em>Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitAssociation#getServiceFeature()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_ServiceFeature();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.jsf.UnitAssociation#getChildFeature <em>Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitAssociation#getChildFeature()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_ChildFeature();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.UnitAssociation#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitAssociation#getSelection()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_Selection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.UnitAssociation#getDynamicLabel <em>Dynamic Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamic Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitAssociation#getDynamicLabel()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_DynamicLabel();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.jsf.UnitAssociation#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Filters</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitAssociation#getFilters()
	 * @see #getUnitAssociation()
	 * @generated
	 */
	EReference getUnitAssociation_Filters();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.UnitChildFeature <em>Unit Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Child Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitChildFeature
	 * @generated
	 */
	EClass getUnitChildFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.UnitChildElement <em>Unit Child Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Child Element</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitChildElement
	 * @generated
	 */
	EClass getUnitChildElement();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.UnitChildElement#getServiceFeature <em>Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitChildElement#getServiceFeature()
	 * @see #getUnitChildElement()
	 * @generated
	 */
	EReference getUnitChildElement_ServiceFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.UnitChildAssociation <em>Unit Child Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Child Association</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitChildAssociation
	 * @generated
	 */
	EClass getUnitChildAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.UnitChildAssociation#getServiceFeature <em>Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitChildAssociation#getServiceFeature()
	 * @see #getUnitChildAssociation()
	 * @generated
	 */
	EReference getUnitChildAssociation_ServiceFeature();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.jsf.UnitChildAssociation#getChildFeature <em>Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitChildAssociation#getChildFeature()
	 * @see #getUnitChildAssociation()
	 * @generated
	 */
	EReference getUnitChildAssociation_ChildFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.InterfaceField <em>Interface Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Field</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.InterfaceField
	 * @generated
	 */
	EClass getInterfaceField();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.jsf.InterfaceField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.InterfaceField#getDefaultValue()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EReference getInterfaceField_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.InterfaceField#getInputClass <em>Input Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.InterfaceField#getInputClass()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EAttribute getInterfaceField_InputClass();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.InterfaceField#getMustMatch <em>Must Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Must Match</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.InterfaceField#getMustMatch()
	 * @see #getInterfaceField()
	 * @generated
	 */
	EReference getInterfaceField_MustMatch();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.DataTypeField <em>Data Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Field</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DataTypeField
	 * @generated
	 */
	EClass getDataTypeField();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.DataTypeField#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DataTypeField#getDataType()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EReference getDataTypeField_DataType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.DataTypeField#isCaseInsensitive <em>Case Insensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Insensitive</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DataTypeField#isCaseInsensitive()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_CaseInsensitive();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.DataTypeField#isObfuscateFormFields <em>Obfuscate Form Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obfuscate Form Fields</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DataTypeField#isObfuscateFormFields()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_ObfuscateFormFields();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.DataTypeField#isEncrypt <em>Encrypt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypt</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DataTypeField#isEncrypt()
	 * @see #getDataTypeField()
	 * @generated
	 */
	EAttribute getDataTypeField_Encrypt();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.DateField <em>Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Field</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DateField
	 * @generated
	 */
	EClass getDateField();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.DateField#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DateField#getDetails()
	 * @see #getDateField()
	 * @generated
	 */
	EAttribute getDateField_Details();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.DateField#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DateField#getFormat()
	 * @see #getDateField()
	 * @generated
	 */
	EAttribute getDateField_Format();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.CaptchaField <em>Captcha Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Captcha Field</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.CaptchaField
	 * @generated
	 */
	EClass getCaptchaField();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.UnitSupportAction <em>Unit Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Support Action</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitSupportAction
	 * @generated
	 */
	EClass getUnitSupportAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.UnitSupportAction#getConfirmMessage <em>Confirm Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Message</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitSupportAction#getConfirmMessage()
	 * @see #getUnitSupportAction()
	 * @generated
	 */
	EAttribute getUnitSupportAction_ConfirmMessage();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.EditUnit <em>Edit Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.EditUnit
	 * @generated
	 */
	EClass getEditUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.EditUnit#getConfirmDestination <em>Confirm Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Confirm Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.EditUnit#getConfirmDestination()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_ConfirmDestination();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.EditUnit#getConfirmLabel <em>Confirm Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.EditUnit#getConfirmLabel()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_ConfirmLabel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.EditUnit#getCancelDestination <em>Cancel Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cancel Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.EditUnit#getCancelDestination()
	 * @see #getEditUnit()
	 * @generated
	 */
	EReference getEditUnit_CancelDestination();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.EditUnit#getCancelLabel <em>Cancel Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.EditUnit#getCancelLabel()
	 * @see #getEditUnit()
	 * @generated
	 */
	EAttribute getEditUnit_CancelLabel();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.IncludedFeature <em>Included Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Included Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedFeature
	 * @generated
	 */
	EClass getIncludedFeature();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IncludedFeature#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedFeature#getDisplayLabel()
	 * @see #getIncludedFeature()
	 * @generated
	 */
	EAttribute getIncludedFeature_DisplayLabel();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.jsf.IncludedFeature#getForcedValue <em>Forced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forced Value</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedFeature#getForcedValue()
	 * @see #getIncludedFeature()
	 * @generated
	 */
	EReference getIncludedFeature_ForcedValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IncludedFeature#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedFeature#getFooter()
	 * @see #getIncludedFeature()
	 * @generated
	 */
	EAttribute getIncludedFeature_Footer();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IncludedFeature#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedFeature#getHeaderClass()
	 * @see #getIncludedFeature()
	 * @generated
	 */
	EAttribute getIncludedFeature_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IncludedFeature#getInputClass <em>Input Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedFeature#getInputClass()
	 * @see #getIncludedFeature()
	 * @generated
	 */
	EAttribute getIncludedFeature_InputClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IncludedFeature#getDisplayClass <em>Display Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedFeature#getDisplayClass()
	 * @see #getIncludedFeature()
	 * @generated
	 */
	EAttribute getIncludedFeature_DisplayClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IncludedFeature#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedFeature#getFooterClass()
	 * @see #getIncludedFeature()
	 * @generated
	 */
	EAttribute getIncludedFeature_FooterClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.IncludedElement <em>Included Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Included Element</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedElement
	 * @generated
	 */
	EClass getIncludedElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IncludedElement#isObfuscateFormFields <em>Obfuscate Form Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obfuscate Form Fields</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedElement#isObfuscateFormFields()
	 * @see #getIncludedElement()
	 * @generated
	 */
	EAttribute getIncludedElement_ObfuscateFormFields();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.jsf.IncludedElement#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedElement#getDefaultValue()
	 * @see #getIncludedElement()
	 * @generated
	 */
	EReference getIncludedElement_DefaultValue();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.IncludedAssociation <em>Included Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Included Association</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedAssociation
	 * @generated
	 */
	EClass getIncludedAssociation();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.CreateUnit <em>Create Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.CreateUnit
	 * @generated
	 */
	EClass getCreateUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.CreateUpdateUnit <em>Create Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Update Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.CreateUpdateUnit
	 * @generated
	 */
	EClass getCreateUpdateUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.CreateUpdateUnit#getClearLabel <em>Clear Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clear Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.CreateUpdateUnit#getClearLabel()
	 * @see #getCreateUpdateUnit()
	 * @generated
	 */
	EAttribute getCreateUpdateUnit_ClearLabel();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.MapUnit <em>Map Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.MapUnit
	 * @generated
	 */
	EClass getMapUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.MapUnit#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.MapUnit#isReadOnly()
	 * @see #getMapUnit()
	 * @generated
	 */
	EAttribute getMapUnit_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.MapUnit#getDefaultZoomLevel <em>Default Zoom Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Zoom Level</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.MapUnit#getDefaultZoomLevel()
	 * @see #getMapUnit()
	 * @generated
	 */
	EAttribute getMapUnit_DefaultZoomLevel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.MapUnit#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.MapUnit#getLocation()
	 * @see #getMapUnit()
	 * @generated
	 */
	EReference getMapUnit_Location();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.MapUnit#getPlaceName <em>Place Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place Name</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.MapUnit#getPlaceName()
	 * @see #getMapUnit()
	 * @generated
	 */
	EReference getMapUnit_PlaceName();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.UpdateUnit <em>Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UpdateUnit
	 * @generated
	 */
	EClass getUpdateUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.DataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DataUnit
	 * @generated
	 */
	EClass getDataUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.DataUnit#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DataUnit#getSelection()
	 * @see #getDataUnit()
	 * @generated
	 */
	EReference getDataUnit_Selection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.DataUnit#getDynamicTitle <em>Dynamic Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamic Title</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DataUnit#getDynamicTitle()
	 * @see #getDataUnit()
	 * @generated
	 */
	EReference getDataUnit_DynamicTitle();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.StaticUnit <em>Static Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.StaticUnit
	 * @generated
	 */
	EClass getStaticUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.StaticUnit#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.StaticUnit#getService()
	 * @see #getStaticUnit()
	 * @generated
	 */
	EReference getStaticUnit_Service();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.StaticUnit#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.StaticUnit#getContent()
	 * @see #getStaticUnit()
	 * @generated
	 */
	EAttribute getStaticUnit_Content();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.CommandUnit <em>Command Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.CommandUnit
	 * @generated
	 */
	EClass getCommandUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.jsf.CommandUnit#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.CommandUnit#getCommands()
	 * @see #getCommandUnit()
	 * @generated
	 */
	EReference getCommandUnit_Commands();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.jsf.Command#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Command#getPartOf()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_PartOf();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.UserCommand <em>User Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Command</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.UserCommand
	 * @generated
	 */
	EClass getUserCommand();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.CreateSitemapUnit <em>Create Sitemap Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Sitemap Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.CreateSitemapUnit
	 * @generated
	 */
	EClass getCreateSitemapUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.CreateSitemapUnit#getDeployedURL <em>Deployed URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployed URL</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.CreateSitemapUnit#getDeployedURL()
	 * @see #getCreateSitemapUnit()
	 * @generated
	 */
	EAttribute getCreateSitemapUnit_DeployedURL();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.CreateSitemapUnit#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.CreateSitemapUnit#getFilename()
	 * @see #getCreateSitemapUnit()
	 * @generated
	 */
	EAttribute getCreateSitemapUnit_Filename();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit <em>Dynamic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicUnit
	 * @generated
	 */
	EClass getDynamicUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicUnit#getService()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getDisplayFields <em>Display Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Fields</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicUnit#getDisplayFields()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_DisplayFields();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getSupportActions <em>Support Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Support Actions</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicUnit#getSupportActions()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EReference getDynamicUnit_SupportActions();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicUnit#getHeader()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_Header();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicUnit#getFooter()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_Footer();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicUnit#getHeaderClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getControlClass <em>Control Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicUnit#getControlClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_ControlClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicUnit#getFooterClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_FooterClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit#getErrorClass <em>Error Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicUnit#getErrorClass()
	 * @see #getDynamicUnit()
	 * @generated
	 */
	EAttribute getDynamicUnit_ErrorClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.DetailsUnit <em>Details Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DetailsUnit
	 * @generated
	 */
	EClass getDetailsUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.DetailsUnit#isOmitFieldLabels <em>Omit Field Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Field Labels</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DetailsUnit#isOmitFieldLabels()
	 * @see #getDetailsUnit()
	 * @generated
	 */
	EAttribute getDetailsUnit_OmitFieldLabels();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.IndexUnit <em>Index Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexUnit
	 * @generated
	 */
	EClass getIndexUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IndexUnit#isOmitColumnLabels <em>Omit Column Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Column Labels</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexUnit#isOmitColumnLabels()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_OmitColumnLabels();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IndexUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Pagination Size</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexUnit#getDefaultPaginationSize()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_DefaultPaginationSize();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IndexUnit#getNextPageLabel <em>Next Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Page Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexUnit#getNextPageLabel()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_NextPageLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IndexUnit#getPreviousPageLabel <em>Previous Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Page Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexUnit#getPreviousPageLabel()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_PreviousPageLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IndexUnit#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use First Last Page Links</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexUnit#isUseFirstLastPageLinks()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_UseFirstLastPageLinks();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IndexUnit#getFirstPageLabel <em>First Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Page Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexUnit#getFirstPageLabel()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_FirstPageLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IndexUnit#getLastPageLabel <em>Last Page Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Page Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexUnit#getLastPageLabel()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_LastPageLabel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.IndexUnit#getTargettingSearches <em>Targetting Searches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Targetting Searches</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexUnit#getTargettingSearches()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EReference getIndexUnit_TargettingSearches();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.IndexUnit#getRowClasses <em>Row Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Classes</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexUnit#getRowClasses()
	 * @see #getIndexUnit()
	 * @generated
	 */
	EAttribute getIndexUnit_RowClasses();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.IndexGridUnit <em>Index Grid Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Grid Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexGridUnit
	 * @generated
	 */
	EClass getIndexGridUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.IndexPageDirectionUnit <em>Index Page Direction Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Page Direction Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexPageDirectionUnit
	 * @generated
	 */
	EClass getIndexPageDirectionUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.IndexLineDirectionUnit <em>Index Line Direction Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Line Direction Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexLineDirectionUnit
	 * @generated
	 */
	EClass getIndexLineDirectionUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.ControlUnit <em>Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ControlUnit
	 * @generated
	 */
	EClass getControlUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ControlUnit#getSubmitLabel <em>Submit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submit Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ControlUnit#getSubmitLabel()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_SubmitLabel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.ControlUnit#getCancelDestination <em>Cancel Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cancel Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ControlUnit#getCancelDestination()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_CancelDestination();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ControlUnit#getCancelLabel <em>Cancel Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ControlUnit#getCancelLabel()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_CancelLabel();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.SearchUnit <em>Search Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.SearchUnit
	 * @generated
	 */
	EClass getSearchUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.SearchUnit#getResultsDestination <em>Results Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Results Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.SearchUnit#getResultsDestination()
	 * @see #getSearchUnit()
	 * @generated
	 */
	EReference getSearchUnit_ResultsDestination();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.ActionUnit <em>Action Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ActionUnit
	 * @generated
	 */
	EClass getActionUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.ActionUnit#isOmitFieldLabels <em>Omit Field Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Field Labels</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ActionUnit#isOmitFieldLabels()
	 * @see #getActionUnit()
	 * @generated
	 */
	EAttribute getActionUnit_OmitFieldLabels();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.AuthenticationUnit <em>Authentication Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.AuthenticationUnit
	 * @generated
	 */
	EClass getAuthenticationUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.RegistrationUnit <em>Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.RegistrationUnit
	 * @generated
	 */
	EClass getRegistrationUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.RegistrationUnit#getAuthenticationSystem <em>Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication System</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.RegistrationUnit#getAuthenticationSystem()
	 * @see #getRegistrationUnit()
	 * @generated
	 */
	EReference getRegistrationUnit_AuthenticationSystem();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.LoginUnit <em>Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LoginUnit
	 * @generated
	 */
	EClass getLoginUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.LoginUnit#getAuthenticationSystem <em>Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication System</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LoginUnit#getAuthenticationSystem()
	 * @see #getLoginUnit()
	 * @generated
	 */
	EReference getLoginUnit_AuthenticationSystem();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.LoginUnit#getLoginIdField <em>Login Id Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login Id Field</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LoginUnit#getLoginIdField()
	 * @see #getLoginUnit()
	 * @generated
	 */
	EReference getLoginUnit_LoginIdField();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.LoginUnit#getPasswordField <em>Password Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Password Field</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LoginUnit#getPasswordField()
	 * @see #getLoginUnit()
	 * @generated
	 */
	EReference getLoginUnit_PasswordField();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.LoginUnit#getRememberMeField <em>Remember Me Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Remember Me Field</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LoginUnit#getRememberMeField()
	 * @see #getLoginUnit()
	 * @generated
	 */
	EReference getLoginUnit_RememberMeField();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.ForgottenPasswordUnit <em>Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forgotten Password Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ForgottenPasswordUnit
	 * @generated
	 */
	EClass getForgottenPasswordUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.ForgottenPasswordUnit#getAuthenticationSystem <em>Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication System</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ForgottenPasswordUnit#getAuthenticationSystem()
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	EReference getForgottenPasswordUnit_AuthenticationSystem();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.ForgottenPasswordUnit#getLoginIdField <em>Login Id Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login Id Field</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ForgottenPasswordUnit#getLoginIdField()
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	EReference getForgottenPasswordUnit_LoginIdField();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.InlineActionContainer <em>Inline Action Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Action Container</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.InlineActionContainer
	 * @generated
	 */
	EClass getInlineActionContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.jsf.InlineActionContainer#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.InlineActionContainer#getActions()
	 * @see #getInlineActionContainer()
	 * @generated
	 */
	EReference getInlineActionContainer_Actions();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.InlineAction <em>Inline Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Action</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.InlineAction
	 * @generated
	 */
	EClass getInlineAction();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.jsf.InlineAction#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Used By</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.InlineAction#getUsedBy()
	 * @see #getInlineAction()
	 * @generated
	 */
	EReference getInlineAction_UsedBy();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.InlineAction#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.InlineAction#getHeader()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_Header();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.InlineAction#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.InlineAction#getFooter()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_Footer();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.InlineAction#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.InlineAction#getHeaderClass()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.InlineAction#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.InlineAction#getFooterClass()
	 * @see #getInlineAction()
	 * @generated
	 */
	EAttribute getInlineAction_FooterClass();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.SelectAction <em>Select Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Action</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.SelectAction
	 * @generated
	 */
	EClass getSelectAction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.SelectAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.SelectAction#getTarget()
	 * @see #getSelectAction()
	 * @generated
	 */
	EReference getSelectAction_Target();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.DeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Action</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DeleteAction
	 * @generated
	 */
	EClass getDeleteAction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.DeleteAction#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DeleteAction#getDestination()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EReference getDeleteAction_Destination();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.DeleteAction#getConfirmMessage <em>Confirm Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Message</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.DeleteAction#getConfirmMessage()
	 * @see #getDeleteAction()
	 * @generated
	 */
	EAttribute getDeleteAction_ConfirmMessage();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.FeatureSupportAction <em>Feature Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Support Action</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.FeatureSupportAction
	 * @generated
	 */
	EClass getFeatureSupportAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.FeatureSupportAction#getConfirmMessage <em>Confirm Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Message</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.FeatureSupportAction#getConfirmMessage()
	 * @see #getFeatureSupportAction()
	 * @generated
	 */
	EAttribute getFeatureSupportAction_ConfirmMessage();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Reference</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ModelReference
	 * @generated
	 */
	EClass getModelReference();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.ModelReference#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.ModelReference#getUnit()
	 * @see #getModelReference()
	 * @generated
	 */
	EReference getModelReference_Unit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.FeatureReference <em>Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Reference</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.FeatureReference
	 * @generated
	 */
	EClass getFeatureReference();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.FeatureReference#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.FeatureReference#getField()
	 * @see #getFeatureReference()
	 * @generated
	 */
	EReference getFeatureReference_Field();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.CurrentUserReference <em>Current User Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current User Reference</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.CurrentUserReference
	 * @generated
	 */
	EClass getCurrentUserReference();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.jsf.FrameworkTechnologies <em>Framework Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Framework Technologies</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.FrameworkTechnologies
	 * @generated
	 */
	EEnum getFrameworkTechnologies();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.jsf.AjaxTechnologies <em>Ajax Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ajax Technologies</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.AjaxTechnologies
	 * @generated
	 */
	EEnum getAjaxTechnologies();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.jsf.PageTopMenuOptions <em>Page Top Menu Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Page Top Menu Options</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.PageTopMenuOptions
	 * @generated
	 */
	EEnum getPageTopMenuOptions();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.jsf.CollectionDisplayOptions <em>Collection Display Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collection Display Options</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.CollectionDisplayOptions
	 * @generated
	 */
	EEnum getCollectionDisplayOptions();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Authentication#getLoginLabel <em>Login Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Authentication#getLoginLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_LoginLabel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.Authentication#getLogoutLabel <em>Logout Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logout Label</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.Authentication#getLogoutLabel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_LogoutLabel();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem <em>Local Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Authentication System</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem
	 * @generated
	 */
	EClass getLocalAuthenticationSystem();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getUserService <em>User Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Service</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getUserService()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_UserService();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getUserAuthenticationKey <em>User Authentication Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Authentication Key</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getUserAuthenticationKey()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_UserAuthenticationKey();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getAuthenticationService <em>Authentication Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication Service</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getAuthenticationService()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_AuthenticationService();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getLoginAttemptService <em>Login Attempt Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login Attempt Service</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getLoginAttemptService()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_LoginAttemptService();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getAutoLoginService <em>Auto Login Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auto Login Service</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getAutoLoginService()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_AutoLoginService();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Self Registration</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#isAllowSelfRegistration()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_AllowSelfRegistration();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Email Activation</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#isUseEmailActivation()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_UseEmailActivation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Welcome Email</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#isSendWelcomeEmail()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_SendWelcomeEmail();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registration Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getRegistrationUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_RegistrationUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getLoginUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_LoginUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forgotten Password Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem#getForgottenPasswordUnit()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_ForgottenPasswordUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.jsf.CasAuthentication <em>Cas Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cas Authentication</em>'.
	 * @see uk.ac.man.cs.mdsd.jsf.CasAuthentication
	 * @generated
	 */
	EClass getCasAuthentication();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JsfFactory getJsfFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfModelImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getJsfModel()
		 * @generated
		 */
		EClass JSF_MODEL = eINSTANCE.getJsfModel();

		/**
		 * The meta object literal for the '<em><b>Persistence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSF_MODEL__PERSISTENCE = eINSTANCE.getJsfModel_Persistence();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSF_MODEL__SERVICES = eINSTANCE.getJsfModel_Services();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSF_MODEL__PAGES = eINSTANCE.getJsfModel_Pages();

		/**
		 * The meta object literal for the '<em><b>Menus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSF_MODEL__MENUS = eINSTANCE.getJsfModel_Menus();

		/**
		 * The meta object literal for the '<em><b>Site Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSF_MODEL__SITE_NAME = eINSTANCE.getJsfModel_SiteName();

		/**
		 * The meta object literal for the '<em><b>Site Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSF_MODEL__SITE_TITLE = eINSTANCE.getJsfModel_SiteTitle();

		/**
		 * The meta object literal for the '<em><b>Development Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSF_MODEL__DEVELOPMENT_VERSION = eINSTANCE.getJsfModel_DevelopmentVersion();

		/**
		 * The meta object literal for the '<em><b>Base URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSF_MODEL__BASE_URL = eINSTANCE.getJsfModel_BaseURL();

		/**
		 * The meta object literal for the '<em><b>Rewrite UR Ls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSF_MODEL__REWRITE_UR_LS = eINSTANCE.getJsfModel_RewriteURLs();

		/**
		 * The meta object literal for the '<em><b>Webmaster Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSF_MODEL__WEBMASTER_EMAIL = eINSTANCE.getJsfModel_WebmasterEmail();

		/**
		 * The meta object literal for the '<em><b>Copyright Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSF_MODEL__COPYRIGHT_TEXT = eINSTANCE.getJsfModel_CopyrightText();

		/**
		 * The meta object literal for the '<em><b>Meta Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSF_MODEL__META_DESCRIPTION = eINSTANCE.getJsfModel_MetaDescription();

		/**
		 * The meta object literal for the '<em><b>Framework Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSF_MODEL__FRAMEWORK_TECHNOLOGY = eINSTANCE.getJsfModel_FrameworkTechnology();

		/**
		 * The meta object literal for the '<em><b>Ajax Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSF_MODEL__AJAX_TECHNOLOGY = eINSTANCE.getJsfModel_AjaxTechnology();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSF_MODEL__AUTHENTICATION = eINSTANCE.getJsfModel_Authentication();

		/**
		 * The meta object literal for the '<em><b>Captcha Site Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSF_MODEL__CAPTCHA_SITE_KEY = eINSTANCE.getJsfModel_CaptchaSiteKey();

		/**
		 * The meta object literal for the '<em><b>Captcha Secret Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSF_MODEL__CAPTCHA_SECRET_KEY = eINSTANCE.getJsfModel_CaptchaSecretKey();

		/**
		 * The meta object literal for the '<em><b>Top Navigation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSF_MODEL__TOP_NAVIGATION_ID = eINSTANCE.getJsfModel_TopNavigationId();

		/**
		 * The meta object literal for the '<em><b>Side Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSF_MODEL__SIDE_MENU = eINSTANCE.getJsfModel_SideMenu();

		/**
		 * The meta object literal for the '<em><b>Static Units Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSF_MODEL__STATIC_UNITS_EDITABLE = eINSTANCE.getJsfModel_StaticUnitsEditable();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.ServiceImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ENTITIES = eINSTANCE.getService_Entities();

		/**
		 * The meta object literal for the '<em><b>Selections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SELECTIONS = eINSTANCE.getService_Selections();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__FEATURES = eINSTANCE.getService_Features();

		/**
		 * The meta object literal for the '<em><b>Accessed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ACCESSED_BY = eINSTANCE.getService_AccessedBy();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ModelLabelImpl <em>Model Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.ModelLabelImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getModelLabel()
		 * @generated
		 */
		EClass MODEL_LABEL = eINSTANCE.getModelLabel();

		/**
		 * The meta object literal for the '<em><b>Label For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL__LABEL_FOR = eINSTANCE.getModelLabel_LabelFor();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_LABEL__FORMAT = eINSTANCE.getModelLabel_Format();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL__FEATURES = eINSTANCE.getModelLabel_Features();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.ServiceFeature <em>Service Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.ServiceFeature
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getServiceFeature()
		 * @generated
		 */
		EClass SERVICE_FEATURE = eINSTANCE.getServiceFeature();

		/**
		 * The meta object literal for the '<em><b>Included By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FEATURE__INCLUDED_BY = eINSTANCE.getServiceFeature_IncludedBy();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FEATURE__CARDINALITY = eINSTANCE.getServiceFeature_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FEATURE__DATE_FORMAT = eINSTANCE.getServiceFeature_DateFormat();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl <em>Service Entity Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getServiceEntityFeature()
		 * @generated
		 */
		EClass SERVICE_ENTITY_FEATURE = eINSTANCE.getServiceEntityFeature();

		/**
		 * The meta object literal for the '<em><b>View Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ENTITY_FEATURE__VIEW_COLUMN_NAME = eINSTANCE.getServiceEntityFeature_ViewColumnName();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityElementImpl <em>Service Entity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityElementImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getServiceEntityElement()
		 * @generated
		 */
		EClass SERVICE_ENTITY_ELEMENT = eINSTANCE.getServiceEntityElement();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ENTITY_ELEMENT__FEATURE = eINSTANCE.getServiceEntityElement_Feature();

		/**
		 * The meta object literal for the '<em><b>Case Insensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ENTITY_ELEMENT__CASE_INSENSITIVE = eINSTANCE.getServiceEntityElement_CaseInsensitive();

		/**
		 * The meta object literal for the '<em><b>Encrypt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ENTITY_ELEMENT__ENCRYPT = eINSTANCE.getServiceEntityElement_Encrypt();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ENTITY_ELEMENT__PLACEHOLDER = eINSTANCE.getServiceEntityElement_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Validation Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ENTITY_ELEMENT__VALIDATION_PATTERN = eINSTANCE.getServiceEntityElement_ValidationPattern();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.ServiceAssociation <em>Service Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.ServiceAssociation
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getServiceAssociation()
		 * @generated
		 */
		EClass SERVICE_ASSOCIATION = eINSTANCE.getServiceAssociation();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityAssociationImpl <em>Service Entity Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityAssociationImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getServiceEntityAssociation()
		 * @generated
		 */
		EClass SERVICE_ENTITY_ASSOCIATION = eINSTANCE.getServiceEntityAssociation();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ENTITY_ASSOCIATION__FEATURE = eINSTANCE.getServiceEntityAssociation_Feature();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ENTITY_ASSOCIATION__OPPOSITE = eINSTANCE.getServiceEntityAssociation_Opposite();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceViewAssociationImpl <em>Service View Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.ServiceViewAssociationImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getServiceViewAssociation()
		 * @generated
		 */
		EClass SERVICE_VIEW_ASSOCIATION = eINSTANCE.getServiceViewAssociation();

		/**
		 * The meta object literal for the '<em><b>Target Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_VIEW_ASSOCIATION__TARGET_FEATURE = eINSTANCE.getServiceViewAssociation_TargetFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.SelectionImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '<em><b>Joins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__JOINS = eINSTANCE.getSelection_Joins();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__FILTER = eINSTANCE.getSelection_Filter();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__ORDERING = eINSTANCE.getSelection_Ordering();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION__LIMIT = eINSTANCE.getSelection_Limit();

		/**
		 * The meta object literal for the '<em><b>Daos Used</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DAOS_USED = eINSTANCE.getService_DaosUsed();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__MODEL_NAME = eINSTANCE.getService_ModelName();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__VIEW = eINSTANCE.getService_View();

		/**
		 * The meta object literal for the '<em><b>View Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__VIEW_NAME = eINSTANCE.getService_ViewName();

		/**
		 * The meta object literal for the '<em><b>Display Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DISPLAY_LABELS = eINSTANCE.getService_DisplayLabels();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.SelectTarget <em>Select Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.SelectTarget
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getSelectTarget()
		 * @generated
		 */
		EClass SELECT_TARGET = eINSTANCE.getSelectTarget();

		/**
		 * The meta object literal for the '<em><b>Targetting Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_TARGET__TARGETTING_ACTIONS = eINSTANCE.getSelectTarget_TargettingActions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitContainerImpl <em>Unit Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitContainerImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitContainer()
		 * @generated
		 */
		EClass UNIT_CONTAINER = eINSTANCE.getUnitContainer();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CONTAINER__UNITS = eINSTANCE.getUnitContainer_Units();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.UnitTitle <em>Unit Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.UnitTitle
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitTitle()
		 * @generated
		 */
		EClass UNIT_TITLE = eINSTANCE.getUnitTitle();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.PageImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PART_OF = eINSTANCE.getPage_PartOf();

		/**
		 * The meta object literal for the '<em><b>Parent Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PARENT_PAGE = eINSTANCE.getPage_ParentPage();

		/**
		 * The meta object literal for the '<em><b>Child Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CHILD_PAGES = eINSTANCE.getPage_ChildPages();

		/**
		 * The meta object literal for the '<em><b>Navigation Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAVIGATION_LABEL = eINSTANCE.getPage_NavigationLabel();

		/**
		 * The meta object literal for the '<em><b>Side Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__SIDE_MENU = eINSTANCE.getPage_SideMenu();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__STYLE_CLASS = eINSTANCE.getPage_StyleClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.MenuImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__ENTRIES = eINSTANCE.getMenu_Entries();

		/**
		 * The meta object literal for the '<em><b>Omit Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__OMIT_CAPTION = eINSTANCE.getMenu_OmitCaption();

		/**
		 * The meta object literal for the '<em><b>Caption Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__CAPTION_CLASS = eINSTANCE.getMenu_CaptionClass();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__STYLE_CLASS = eINSTANCE.getMenu_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Layout Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__LAYOUT_CLASS = eINSTANCE.getMenu_LayoutClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.MenuEntryImpl <em>Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.MenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getMenuEntry()
		 * @generated
		 */
		EClass MENU_ENTRY = eINSTANCE.getMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_ENTRY__PART_OF = eINSTANCE.getMenuEntry_PartOf();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.MenuIncludedFeatureImpl <em>Menu Included Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.MenuIncludedFeatureImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getMenuIncludedFeature()
		 * @generated
		 */
		EClass MENU_INCLUDED_FEATURE = eINSTANCE.getMenuIncludedFeature();

		/**
		 * The meta object literal for the '<em><b>Display Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_INCLUDED_FEATURE__DISPLAY_LABEL = eINSTANCE.getMenuIncludedFeature_DisplayLabel();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.MenuIncludedElementImpl <em>Menu Included Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.MenuIncludedElementImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getMenuIncludedElement()
		 * @generated
		 */
		EClass MENU_INCLUDED_ELEMENT = eINSTANCE.getMenuIncludedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_INCLUDED_ELEMENT__NAME = eINSTANCE.getMenuIncludedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_INCLUDED_ELEMENT__FEATURE = eINSTANCE.getMenuIncludedElement_Feature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.StaticMenuImpl <em>Static Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.StaticMenuImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getStaticMenu()
		 * @generated
		 */
		EClass STATIC_MENU = eINSTANCE.getStaticMenu();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.FixedPageMenuEntryImpl <em>Fixed Page Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.FixedPageMenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getFixedPageMenuEntry()
		 * @generated
		 */
		EClass FIXED_PAGE_MENU_ENTRY = eINSTANCE.getFixedPageMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_PAGE_MENU_ENTRY__DESTINATION = eINSTANCE.getFixedPageMenuEntry_Destination();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.FixedActionMenuEntryImpl <em>Fixed Action Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.FixedActionMenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getFixedActionMenuEntry()
		 * @generated
		 */
		EClass FIXED_ACTION_MENU_ENTRY = eINSTANCE.getFixedActionMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ACTION_MENU_ENTRY__DESTINATION = eINSTANCE.getFixedActionMenuEntry_Destination();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.FixedCommandMenuEntryImpl <em>Fixed Command Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.FixedCommandMenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getFixedCommandMenuEntry()
		 * @generated
		 */
		EClass FIXED_COMMAND_MENU_ENTRY = eINSTANCE.getFixedCommandMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_COMMAND_MENU_ENTRY__DESTINATION = eINSTANCE.getFixedCommandMenuEntry_Destination();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.EditStaticTextMenuEntryImpl <em>Edit Static Text Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.EditStaticTextMenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getEditStaticTextMenuEntry()
		 * @generated
		 */
		EClass EDIT_STATIC_TEXT_MENU_ENTRY = eINSTANCE.getEditStaticTextMenuEntry();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.DynamicMenuImpl <em>Dynamic Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.DynamicMenuImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getDynamicMenu()
		 * @generated
		 */
		EClass DYNAMIC_MENU = eINSTANCE.getDynamicMenu();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_MENU__SERVICE = eINSTANCE.getDynamicMenu_Service();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_MENU__SELECTION = eINSTANCE.getDynamicMenu_Selection();

		/**
		 * The meta object literal for the '<em><b>Dynamic Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_MENU__DYNAMIC_TITLE = eINSTANCE.getDynamicMenu_DynamicTitle();

		/**
		 * The meta object literal for the '<em><b>Authenticated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__AUTHENTICATED = eINSTANCE.getPage_Authenticated();

		/**
		 * The meta object literal for the '<em><b>Top Menu Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TOP_MENU_OPTION = eINSTANCE.getPage_TopMenuOption();

		/**
		 * The meta object literal for the '<em><b>Top Menu Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TOP_MENU_RANK = eINSTANCE.getPage_TopMenuRank();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ContentUnitImpl <em>Content Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.ContentUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getContentUnit()
		 * @generated
		 */
		EClass CONTENT_UNIT = eINSTANCE.getContentUnit();

		/**
		 * The meta object literal for the '<em><b>Displayed On</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_UNIT__DISPLAYED_ON = eINSTANCE.getContentUnit_DisplayedOn();

		/**
		 * The meta object literal for the '<em><b>Purpose Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__PURPOSE_SUMMARY = eINSTANCE.getContentUnit_PurposeSummary();

		/**
		 * The meta object literal for the '<em><b>Omit Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__OMIT_CAPTION = eINSTANCE.getContentUnit_OmitCaption();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__STYLE_CLASS = eINSTANCE.getContentUnit_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Layout Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__LAYOUT_CLASS = eINSTANCE.getContentUnit_LayoutClass();

		/**
		 * The meta object literal for the '<em><b>Caption Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_UNIT__CAPTION_CLASS = eINSTANCE.getContentUnit_CaptionClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.UnitField <em>Unit Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.UnitField
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitField()
		 * @generated
		 */
		EClass UNIT_FIELD = eINSTANCE.getUnitField();

		/**
		 * The meta object literal for the '<em><b>Displayed On</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_FIELD__DISPLAYED_ON = eINSTANCE.getUnitField_DisplayedOn();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__CARDINALITY = eINSTANCE.getUnitField_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FIELD__DATE_FORMAT = eINSTANCE.getUnitField_DateFormat();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitFeatureImpl <em>Unit Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitFeatureImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitFeature()
		 * @generated
		 */
		EClass UNIT_FEATURE = eINSTANCE.getUnitFeature();

		/**
		 * The meta object literal for the '<em><b>Only Display When Not Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY = eINSTANCE.getUnitFeature_OnlyDisplayWhenNotEmpty();

		/**
		 * The meta object literal for the '<em><b>Display Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__DISPLAY_OPTION = eINSTANCE.getUnitFeature_DisplayOption();

		/**
		 * The meta object literal for the '<em><b>Linked Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_FEATURE__LINKED_ACTION = eINSTANCE.getUnitFeature_LinkedAction();

		/**
		 * The meta object literal for the '<em><b>Maximum Display Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE = eINSTANCE.getUnitFeature_MaximumDisplaySize();

		/**
		 * The meta object literal for the '<em><b>Autofocus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FEATURE__AUTOFOCUS = eINSTANCE.getUnitFeature_Autofocus();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitElementImpl <em>Unit Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitElementImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitElement()
		 * @generated
		 */
		EClass UNIT_ELEMENT = eINSTANCE.getUnitElement();

		/**
		 * The meta object literal for the '<em><b>Service Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ELEMENT__SERVICE_FEATURE = eINSTANCE.getUnitElement_ServiceFeature();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ELEMENT__PLACEHOLDER = eINSTANCE.getUnitElement_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Validation Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_ELEMENT__VALIDATION_PATTERN = eINSTANCE.getUnitElement_ValidationPattern();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitAssociationImpl <em>Unit Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitAssociationImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitAssociation()
		 * @generated
		 */
		EClass UNIT_ASSOCIATION = eINSTANCE.getUnitAssociation();

		/**
		 * The meta object literal for the '<em><b>Service Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__SERVICE_FEATURE = eINSTANCE.getUnitAssociation_ServiceFeature();

		/**
		 * The meta object literal for the '<em><b>Child Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__CHILD_FEATURE = eINSTANCE.getUnitAssociation_ChildFeature();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__SELECTION = eINSTANCE.getUnitAssociation_Selection();

		/**
		 * The meta object literal for the '<em><b>Dynamic Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__DYNAMIC_LABEL = eINSTANCE.getUnitAssociation_DynamicLabel();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_ASSOCIATION__FILTERS = eINSTANCE.getUnitAssociation_Filters();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitChildFeatureImpl <em>Unit Child Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitChildFeatureImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitChildFeature()
		 * @generated
		 */
		EClass UNIT_CHILD_FEATURE = eINSTANCE.getUnitChildFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitChildElementImpl <em>Unit Child Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitChildElementImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitChildElement()
		 * @generated
		 */
		EClass UNIT_CHILD_ELEMENT = eINSTANCE.getUnitChildElement();

		/**
		 * The meta object literal for the '<em><b>Service Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CHILD_ELEMENT__SERVICE_FEATURE = eINSTANCE.getUnitChildElement_ServiceFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitChildAssociationImpl <em>Unit Child Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitChildAssociationImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitChildAssociation()
		 * @generated
		 */
		EClass UNIT_CHILD_ASSOCIATION = eINSTANCE.getUnitChildAssociation();

		/**
		 * The meta object literal for the '<em><b>Service Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CHILD_ASSOCIATION__SERVICE_FEATURE = eINSTANCE.getUnitChildAssociation_ServiceFeature();

		/**
		 * The meta object literal for the '<em><b>Child Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CHILD_ASSOCIATION__CHILD_FEATURE = eINSTANCE.getUnitChildAssociation_ChildFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.InterfaceFieldImpl <em>Interface Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.InterfaceFieldImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getInterfaceField()
		 * @generated
		 */
		EClass INTERFACE_FIELD = eINSTANCE.getInterfaceField();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_FIELD__DEFAULT_VALUE = eINSTANCE.getInterfaceField_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Input Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_FIELD__INPUT_CLASS = eINSTANCE.getInterfaceField_InputClass();

		/**
		 * The meta object literal for the '<em><b>Must Match</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_FIELD__MUST_MATCH = eINSTANCE.getInterfaceField_MustMatch();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.DataTypeFieldImpl <em>Data Type Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.DataTypeFieldImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getDataTypeField()
		 * @generated
		 */
		EClass DATA_TYPE_FIELD = eINSTANCE.getDataTypeField();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_FIELD__DATA_TYPE = eINSTANCE.getDataTypeField_DataType();

		/**
		 * The meta object literal for the '<em><b>Case Insensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__CASE_INSENSITIVE = eINSTANCE.getDataTypeField_CaseInsensitive();

		/**
		 * The meta object literal for the '<em><b>Obfuscate Form Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS = eINSTANCE.getDataTypeField_ObfuscateFormFields();

		/**
		 * The meta object literal for the '<em><b>Encrypt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_FIELD__ENCRYPT = eINSTANCE.getDataTypeField_Encrypt();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.DateFieldImpl <em>Date Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.DateFieldImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getDateField()
		 * @generated
		 */
		EClass DATE_FIELD = eINSTANCE.getDateField();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_FIELD__DETAILS = eINSTANCE.getDateField_Details();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_FIELD__FORMAT = eINSTANCE.getDateField_Format();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CaptchaFieldImpl <em>Captcha Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.CaptchaFieldImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCaptchaField()
		 * @generated
		 */
		EClass CAPTCHA_FIELD = eINSTANCE.getCaptchaField();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UnitSupportActionImpl <em>Unit Support Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.UnitSupportActionImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUnitSupportAction()
		 * @generated
		 */
		EClass UNIT_SUPPORT_ACTION = eINSTANCE.getUnitSupportAction();

		/**
		 * The meta object literal for the '<em><b>Confirm Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE = eINSTANCE.getUnitSupportAction_ConfirmMessage();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.EditUnitImpl <em>Edit Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.EditUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getEditUnit()
		 * @generated
		 */
		EClass EDIT_UNIT = eINSTANCE.getEditUnit();

		/**
		 * The meta object literal for the '<em><b>Confirm Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__CONFIRM_DESTINATION = eINSTANCE.getEditUnit_ConfirmDestination();

		/**
		 * The meta object literal for the '<em><b>Confirm Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__CONFIRM_LABEL = eINSTANCE.getEditUnit_ConfirmLabel();

		/**
		 * The meta object literal for the '<em><b>Cancel Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_UNIT__CANCEL_DESTINATION = eINSTANCE.getEditUnit_CancelDestination();

		/**
		 * The meta object literal for the '<em><b>Cancel Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_UNIT__CANCEL_LABEL = eINSTANCE.getEditUnit_CancelLabel();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.IncludedFeature <em>Included Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.IncludedFeature
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getIncludedFeature()
		 * @generated
		 */
		EClass INCLUDED_FEATURE = eINSTANCE.getIncludedFeature();

		/**
		 * The meta object literal for the '<em><b>Display Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FEATURE__DISPLAY_LABEL = eINSTANCE.getIncludedFeature_DisplayLabel();

		/**
		 * The meta object literal for the '<em><b>Forced Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDED_FEATURE__FORCED_VALUE = eINSTANCE.getIncludedFeature_ForcedValue();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FEATURE__FOOTER = eINSTANCE.getIncludedFeature_Footer();

		/**
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FEATURE__HEADER_CLASS = eINSTANCE.getIncludedFeature_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Input Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FEATURE__INPUT_CLASS = eINSTANCE.getIncludedFeature_InputClass();

		/**
		 * The meta object literal for the '<em><b>Display Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FEATURE__DISPLAY_CLASS = eINSTANCE.getIncludedFeature_DisplayClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FEATURE__FOOTER_CLASS = eINSTANCE.getIncludedFeature_FooterClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.IncludedElement <em>Included Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.IncludedElement
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getIncludedElement()
		 * @generated
		 */
		EClass INCLUDED_ELEMENT = eINSTANCE.getIncludedElement();

		/**
		 * The meta object literal for the '<em><b>Obfuscate Form Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_ELEMENT__OBFUSCATE_FORM_FIELDS = eINSTANCE.getIncludedElement_ObfuscateFormFields();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDED_ELEMENT__DEFAULT_VALUE = eINSTANCE.getIncludedElement_DefaultValue();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.IncludedAssociation <em>Included Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.IncludedAssociation
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getIncludedAssociation()
		 * @generated
		 */
		EClass INCLUDED_ASSOCIATION = eINSTANCE.getIncludedAssociation();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CreateUnitImpl <em>Create Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.CreateUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCreateUnit()
		 * @generated
		 */
		EClass CREATE_UNIT = eINSTANCE.getCreateUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CreateUpdateUnitImpl <em>Create Update Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.CreateUpdateUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCreateUpdateUnit()
		 * @generated
		 */
		EClass CREATE_UPDATE_UNIT = eINSTANCE.getCreateUpdateUnit();

		/**
		 * The meta object literal for the '<em><b>Clear Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_UPDATE_UNIT__CLEAR_LABEL = eINSTANCE.getCreateUpdateUnit_ClearLabel();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.MapUnitImpl <em>Map Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.MapUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getMapUnit()
		 * @generated
		 */
		EClass MAP_UNIT = eINSTANCE.getMapUnit();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_UNIT__READ_ONLY = eINSTANCE.getMapUnit_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Default Zoom Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_UNIT__DEFAULT_ZOOM_LEVEL = eINSTANCE.getMapUnit_DefaultZoomLevel();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_UNIT__LOCATION = eINSTANCE.getMapUnit_Location();

		/**
		 * The meta object literal for the '<em><b>Place Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_UNIT__PLACE_NAME = eINSTANCE.getMapUnit_PlaceName();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UpdateUnitImpl <em>Update Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.UpdateUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUpdateUnit()
		 * @generated
		 */
		EClass UPDATE_UNIT = eINSTANCE.getUpdateUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.DataUnitImpl <em>Data Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.DataUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getDataUnit()
		 * @generated
		 */
		EClass DATA_UNIT = eINSTANCE.getDataUnit();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_UNIT__SELECTION = eINSTANCE.getDataUnit_Selection();

		/**
		 * The meta object literal for the '<em><b>Dynamic Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_UNIT__DYNAMIC_TITLE = eINSTANCE.getDataUnit_DynamicTitle();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.StaticUnitImpl <em>Static Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.StaticUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getStaticUnit()
		 * @generated
		 */
		EClass STATIC_UNIT = eINSTANCE.getStaticUnit();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_UNIT__SERVICE = eINSTANCE.getStaticUnit_Service();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_UNIT__CONTENT = eINSTANCE.getStaticUnit_Content();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CommandUnitImpl <em>Command Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.CommandUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCommandUnit()
		 * @generated
		 */
		EClass COMMAND_UNIT = eINSTANCE.getCommandUnit();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_UNIT__COMMANDS = eINSTANCE.getCommandUnit_Commands();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.CommandImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__PART_OF = eINSTANCE.getCommand_PartOf();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.UserCommandImpl <em>User Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.UserCommandImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getUserCommand()
		 * @generated
		 */
		EClass USER_COMMAND = eINSTANCE.getUserCommand();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CreateSitemapUnitImpl <em>Create Sitemap Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.CreateSitemapUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCreateSitemapUnit()
		 * @generated
		 */
		EClass CREATE_SITEMAP_UNIT = eINSTANCE.getCreateSitemapUnit();

		/**
		 * The meta object literal for the '<em><b>Deployed URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SITEMAP_UNIT__DEPLOYED_URL = eINSTANCE.getCreateSitemapUnit_DeployedURL();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SITEMAP_UNIT__FILENAME = eINSTANCE.getCreateSitemapUnit_Filename();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.DynamicUnitImpl <em>Dynamic Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.DynamicUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getDynamicUnit()
		 * @generated
		 */
		EClass DYNAMIC_UNIT = eINSTANCE.getDynamicUnit();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__SERVICE = eINSTANCE.getDynamicUnit_Service();

		/**
		 * The meta object literal for the '<em><b>Display Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__DISPLAY_FIELDS = eINSTANCE.getDynamicUnit_DisplayFields();

		/**
		 * The meta object literal for the '<em><b>Support Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_UNIT__SUPPORT_ACTIONS = eINSTANCE.getDynamicUnit_SupportActions();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__HEADER = eINSTANCE.getDynamicUnit_Header();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__FOOTER = eINSTANCE.getDynamicUnit_Footer();

		/**
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__HEADER_CLASS = eINSTANCE.getDynamicUnit_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Control Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__CONTROL_CLASS = eINSTANCE.getDynamicUnit_ControlClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__FOOTER_CLASS = eINSTANCE.getDynamicUnit_FooterClass();

		/**
		 * The meta object literal for the '<em><b>Error Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_UNIT__ERROR_CLASS = eINSTANCE.getDynamicUnit_ErrorClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.DetailsUnitImpl <em>Details Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.DetailsUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getDetailsUnit()
		 * @generated
		 */
		EClass DETAILS_UNIT = eINSTANCE.getDetailsUnit();

		/**
		 * The meta object literal for the '<em><b>Omit Field Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILS_UNIT__OMIT_FIELD_LABELS = eINSTANCE.getDetailsUnit_OmitFieldLabels();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.IndexUnitImpl <em>Index Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.IndexUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getIndexUnit()
		 * @generated
		 */
		EClass INDEX_UNIT = eINSTANCE.getIndexUnit();

		/**
		 * The meta object literal for the '<em><b>Omit Column Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__OMIT_COLUMN_LABELS = eINSTANCE.getIndexUnit_OmitColumnLabels();

		/**
		 * The meta object literal for the '<em><b>Default Pagination Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__DEFAULT_PAGINATION_SIZE = eINSTANCE.getIndexUnit_DefaultPaginationSize();

		/**
		 * The meta object literal for the '<em><b>Next Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__NEXT_PAGE_LABEL = eINSTANCE.getIndexUnit_NextPageLabel();

		/**
		 * The meta object literal for the '<em><b>Previous Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__PREVIOUS_PAGE_LABEL = eINSTANCE.getIndexUnit_PreviousPageLabel();

		/**
		 * The meta object literal for the '<em><b>Use First Last Page Links</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS = eINSTANCE.getIndexUnit_UseFirstLastPageLinks();

		/**
		 * The meta object literal for the '<em><b>First Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__FIRST_PAGE_LABEL = eINSTANCE.getIndexUnit_FirstPageLabel();

		/**
		 * The meta object literal for the '<em><b>Last Page Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__LAST_PAGE_LABEL = eINSTANCE.getIndexUnit_LastPageLabel();

		/**
		 * The meta object literal for the '<em><b>Targetting Searches</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_UNIT__TARGETTING_SEARCHES = eINSTANCE.getIndexUnit_TargettingSearches();

		/**
		 * The meta object literal for the '<em><b>Row Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_UNIT__ROW_CLASSES = eINSTANCE.getIndexUnit_RowClasses();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.IndexGridUnitImpl <em>Index Grid Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.IndexGridUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getIndexGridUnit()
		 * @generated
		 */
		EClass INDEX_GRID_UNIT = eINSTANCE.getIndexGridUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.IndexPageDirectionUnitImpl <em>Index Page Direction Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.IndexPageDirectionUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getIndexPageDirectionUnit()
		 * @generated
		 */
		EClass INDEX_PAGE_DIRECTION_UNIT = eINSTANCE.getIndexPageDirectionUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.IndexLineDirectionUnitImpl <em>Index Line Direction Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.IndexLineDirectionUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getIndexLineDirectionUnit()
		 * @generated
		 */
		EClass INDEX_LINE_DIRECTION_UNIT = eINSTANCE.getIndexLineDirectionUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ControlUnitImpl <em>Control Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.ControlUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getControlUnit()
		 * @generated
		 */
		EClass CONTROL_UNIT = eINSTANCE.getControlUnit();

		/**
		 * The meta object literal for the '<em><b>Submit Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__SUBMIT_LABEL = eINSTANCE.getControlUnit_SubmitLabel();

		/**
		 * The meta object literal for the '<em><b>Cancel Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__CANCEL_DESTINATION = eINSTANCE.getControlUnit_CancelDestination();

		/**
		 * The meta object literal for the '<em><b>Cancel Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__CANCEL_LABEL = eINSTANCE.getControlUnit_CancelLabel();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.SearchUnitImpl <em>Search Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.SearchUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getSearchUnit()
		 * @generated
		 */
		EClass SEARCH_UNIT = eINSTANCE.getSearchUnit();

		/**
		 * The meta object literal for the '<em><b>Results Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_UNIT__RESULTS_DESTINATION = eINSTANCE.getSearchUnit_ResultsDestination();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ActionUnitImpl <em>Action Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.ActionUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getActionUnit()
		 * @generated
		 */
		EClass ACTION_UNIT = eINSTANCE.getActionUnit();

		/**
		 * The meta object literal for the '<em><b>Omit Field Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_UNIT__OMIT_FIELD_LABELS = eINSTANCE.getActionUnit_OmitFieldLabels();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.AuthenticationUnitImpl <em>Authentication Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.AuthenticationUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getAuthenticationUnit()
		 * @generated
		 */
		EClass AUTHENTICATION_UNIT = eINSTANCE.getAuthenticationUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.RegistrationUnitImpl <em>Registration Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.RegistrationUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getRegistrationUnit()
		 * @generated
		 */
		EClass REGISTRATION_UNIT = eINSTANCE.getRegistrationUnit();

		/**
		 * The meta object literal for the '<em><b>Authentication System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION_UNIT__AUTHENTICATION_SYSTEM = eINSTANCE.getRegistrationUnit_AuthenticationSystem();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.LoginUnitImpl <em>Login Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.LoginUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getLoginUnit()
		 * @generated
		 */
		EClass LOGIN_UNIT = eINSTANCE.getLoginUnit();

		/**
		 * The meta object literal for the '<em><b>Authentication System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_UNIT__AUTHENTICATION_SYSTEM = eINSTANCE.getLoginUnit_AuthenticationSystem();

		/**
		 * The meta object literal for the '<em><b>Login Id Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_UNIT__LOGIN_ID_FIELD = eINSTANCE.getLoginUnit_LoginIdField();

		/**
		 * The meta object literal for the '<em><b>Password Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_UNIT__PASSWORD_FIELD = eINSTANCE.getLoginUnit_PasswordField();

		/**
		 * The meta object literal for the '<em><b>Remember Me Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_UNIT__REMEMBER_ME_FIELD = eINSTANCE.getLoginUnit_RememberMeField();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ForgottenPasswordUnitImpl <em>Forgotten Password Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.ForgottenPasswordUnitImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getForgottenPasswordUnit()
		 * @generated
		 */
		EClass FORGOTTEN_PASSWORD_UNIT = eINSTANCE.getForgottenPasswordUnit();

		/**
		 * The meta object literal for the '<em><b>Authentication System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORGOTTEN_PASSWORD_UNIT__AUTHENTICATION_SYSTEM = eINSTANCE.getForgottenPasswordUnit_AuthenticationSystem();

		/**
		 * The meta object literal for the '<em><b>Login Id Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORGOTTEN_PASSWORD_UNIT__LOGIN_ID_FIELD = eINSTANCE.getForgottenPasswordUnit_LoginIdField();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.InlineActionContainer <em>Inline Action Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.InlineActionContainer
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getInlineActionContainer()
		 * @generated
		 */
		EClass INLINE_ACTION_CONTAINER = eINSTANCE.getInlineActionContainer();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ACTION_CONTAINER__ACTIONS = eINSTANCE.getInlineActionContainer_Actions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.InlineActionImpl <em>Inline Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.InlineActionImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getInlineAction()
		 * @generated
		 */
		EClass INLINE_ACTION = eINSTANCE.getInlineAction();

		/**
		 * The meta object literal for the '<em><b>Used By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_ACTION__USED_BY = eINSTANCE.getInlineAction_UsedBy();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__HEADER = eINSTANCE.getInlineAction_Header();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__FOOTER = eINSTANCE.getInlineAction_Footer();

		/**
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__HEADER_CLASS = eINSTANCE.getInlineAction_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_ACTION__FOOTER_CLASS = eINSTANCE.getInlineAction_FooterClass();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.SelectActionImpl <em>Select Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.SelectActionImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getSelectAction()
		 * @generated
		 */
		EClass SELECT_ACTION = eINSTANCE.getSelectAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_ACTION__TARGET = eINSTANCE.getSelectAction_Target();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.DeleteActionImpl <em>Delete Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.DeleteActionImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getDeleteAction()
		 * @generated
		 */
		EClass DELETE_ACTION = eINSTANCE.getDeleteAction();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_ACTION__DESTINATION = eINSTANCE.getDeleteAction_Destination();

		/**
		 * The meta object literal for the '<em><b>Confirm Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ACTION__CONFIRM_MESSAGE = eINSTANCE.getDeleteAction_ConfirmMessage();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.FeatureSupportActionImpl <em>Feature Support Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.FeatureSupportActionImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getFeatureSupportAction()
		 * @generated
		 */
		EClass FEATURE_SUPPORT_ACTION = eINSTANCE.getFeatureSupportAction();

		/**
		 * The meta object literal for the '<em><b>Confirm Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE = eINSTANCE.getFeatureSupportAction_ConfirmMessage();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.ModelReferenceImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getModelReference()
		 * @generated
		 */
		EClass MODEL_REFERENCE = eINSTANCE.getModelReference();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REFERENCE__UNIT = eINSTANCE.getModelReference_Unit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.FeatureReferenceImpl <em>Feature Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.FeatureReferenceImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getFeatureReference()
		 * @generated
		 */
		EClass FEATURE_REFERENCE = eINSTANCE.getFeatureReference();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_REFERENCE__FIELD = eINSTANCE.getFeatureReference_Field();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CurrentUserReferenceImpl <em>Current User Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.CurrentUserReferenceImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCurrentUserReference()
		 * @generated
		 */
		EClass CURRENT_USER_REFERENCE = eINSTANCE.getCurrentUserReference();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.FrameworkTechnologies <em>Framework Technologies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.FrameworkTechnologies
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getFrameworkTechnologies()
		 * @generated
		 */
		EEnum FRAMEWORK_TECHNOLOGIES = eINSTANCE.getFrameworkTechnologies();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.AjaxTechnologies <em>Ajax Technologies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.AjaxTechnologies
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getAjaxTechnologies()
		 * @generated
		 */
		EEnum AJAX_TECHNOLOGIES = eINSTANCE.getAjaxTechnologies();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.PageTopMenuOptions <em>Page Top Menu Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.PageTopMenuOptions
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getPageTopMenuOptions()
		 * @generated
		 */
		EEnum PAGE_TOP_MENU_OPTIONS = eINSTANCE.getPageTopMenuOptions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.CollectionDisplayOptions <em>Collection Display Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.CollectionDisplayOptions
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCollectionDisplayOptions()
		 * @generated
		 */
		EEnum COLLECTION_DISPLAY_OPTIONS = eINSTANCE.getCollectionDisplayOptions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.AuthenticationImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '<em><b>Login Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__LOGIN_LABEL = eINSTANCE.getAuthentication_LoginLabel();

		/**
		 * The meta object literal for the '<em><b>Logout Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__LOGOUT_LABEL = eINSTANCE.getAuthentication_LogoutLabel();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl <em>Local Authentication System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.LocalAuthenticationSystemImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getLocalAuthenticationSystem()
		 * @generated
		 */
		EClass LOCAL_AUTHENTICATION_SYSTEM = eINSTANCE.getLocalAuthenticationSystem();

		/**
		 * The meta object literal for the '<em><b>User Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__USER_SERVICE = eINSTANCE.getLocalAuthenticationSystem_UserService();

		/**
		 * The meta object literal for the '<em><b>User Authentication Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__USER_AUTHENTICATION_KEY = eINSTANCE.getLocalAuthenticationSystem_UserAuthenticationKey();

		/**
		 * The meta object literal for the '<em><b>Authentication Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_SERVICE = eINSTANCE.getLocalAuthenticationSystem_AuthenticationService();

		/**
		 * The meta object literal for the '<em><b>Login Attempt Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_SERVICE = eINSTANCE.getLocalAuthenticationSystem_LoginAttemptService();

		/**
		 * The meta object literal for the '<em><b>Auto Login Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN_SERVICE = eINSTANCE.getLocalAuthenticationSystem_AutoLoginService();

		/**
		 * The meta object literal for the '<em><b>Allow Self Registration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION = eINSTANCE.getLocalAuthenticationSystem_AllowSelfRegistration();

		/**
		 * The meta object literal for the '<em><b>Use Email Activation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION = eINSTANCE.getLocalAuthenticationSystem_UseEmailActivation();

		/**
		 * The meta object literal for the '<em><b>Send Welcome Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL = eINSTANCE.getLocalAuthenticationSystem_SendWelcomeEmail();

		/**
		 * The meta object literal for the '<em><b>Registration Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT = eINSTANCE.getLocalAuthenticationSystem_RegistrationUnit();

		/**
		 * The meta object literal for the '<em><b>Login Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT = eINSTANCE.getLocalAuthenticationSystem_LoginUnit();

		/**
		 * The meta object literal for the '<em><b>Forgotten Password Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT = eINSTANCE.getLocalAuthenticationSystem_ForgottenPasswordUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.jsf.impl.CasAuthenticationImpl <em>Cas Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.jsf.impl.CasAuthenticationImpl
		 * @see uk.ac.man.cs.mdsd.jsf.impl.JsfPackageImpl#getCasAuthentication()
		 * @generated
		 */
		EClass CAS_AUTHENTICATION = eINSTANCE.getCasAuthentication();

	}

} //JsfPackage
