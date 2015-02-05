/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenJsfPackage.java,v 1.111 2014/08/22 14:32:38 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;
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
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface GenJsfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genjsf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cs.man.ac.uk/mdsd/2010/GenJsf";

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
	GenJsfPackage eINSTANCE = uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenJsfModel()
	 * @generated
	 */
	int GEN_JSF_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Orm Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__ORM_MODEL = GenOrmPackage.GEN_ORM_MODEL__ORM_MODEL;

	/**
	 * The feature id for the '<em><b>Gen Collection Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__GEN_COLLECTION_TYPES = GenOrmPackage.GEN_ORM_MODEL__GEN_COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Gen Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__GEN_DATA_TYPES = GenOrmPackage.GEN_ORM_MODEL__GEN_DATA_TYPES;

	/**
	 * The feature id for the '<em><b>Gen Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__GEN_ENTITIES = GenOrmPackage.GEN_ORM_MODEL__GEN_ENTITIES;

	/**
	 * The feature id for the '<em><b>Orm Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__ORM_TECHNOLOGY = GenOrmPackage.GEN_ORM_MODEL__ORM_TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__BASE_PACKAGE = GenOrmPackage.GEN_ORM_MODEL__BASE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Domain Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__DOMAIN_PACKAGE = GenOrmPackage.GEN_ORM_MODEL__DOMAIN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Include Xml Binding Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__INCLUDE_XML_BINDING_ANNOTATIONS = GenOrmPackage.GEN_ORM_MODEL__INCLUDE_XML_BINDING_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Dao Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__DAO_PACKAGE = GenOrmPackage.GEN_ORM_MODEL__DAO_PACKAGE;

	/**
	 * The feature id for the '<em><b>Dao Impl Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__DAO_IMPL_PACKAGE = GenOrmPackage.GEN_ORM_MODEL__DAO_IMPL_PACKAGE;

	/**
	 * The feature id for the '<em><b>Database Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__DATABASE_HOST = GenOrmPackage.GEN_ORM_MODEL__DATABASE_HOST;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__DATABASE_NAME = GenOrmPackage.GEN_ORM_MODEL__DATABASE_NAME;

	/**
	 * The feature id for the '<em><b>Database Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__DATABASE_USERNAME = GenOrmPackage.GEN_ORM_MODEL__DATABASE_USERNAME;

	/**
	 * The feature id for the '<em><b>Database Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__DATABASE_PASSWORD = GenOrmPackage.GEN_ORM_MODEL__DATABASE_PASSWORD;

	/**
	 * The feature id for the '<em><b>Database Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__DATABASE_PREFIX = GenOrmPackage.GEN_ORM_MODEL__DATABASE_PREFIX;

	/**
	 * The feature id for the '<em><b>Jsf Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__JSF_MODEL = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__GEN_AUTHENTICATION = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__GEN_SERVICES = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gen Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__GEN_PAGES = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gen Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__GEN_MENUS = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__BASE_URL = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rewrite UR Ls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__REWRITE_UR_LS = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Development Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__DEVELOPMENT_VERSION = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Text Editor Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__TEXT_EDITOR_PATH = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Backing Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__BACKING_PACKAGE = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Converter Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__CONVERTER_PACKAGE = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Validator Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__VALIDATOR_PACKAGE = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Service Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__SERVICE_PACKAGE = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Security Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__SECURITY_PACKAGE = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Ui Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL__UI_PACKAGE = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_JSF_MODEL_FEATURE_COUNT = GenOrmPackage.GEN_ORM_MODEL_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenAuthenticationImpl <em>Gen Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenAuthenticationImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenAuthentication()
	 * @generated
	 */
	int GEN_AUTHENTICATION = 1;

	/**
	 * The number of structural features of the '<em>Gen Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUTHENTICATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCasAuthenticationImpl <em>Gen Cas Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCasAuthenticationImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCasAuthentication()
	 * @generated
	 */
	int GEN_CAS_AUTHENTICATION = 2;

	/**
	 * The feature id for the '<em><b>Jsf Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CAS_AUTHENTICATION__JSF_AUTHENTICATION = GEN_AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Cas Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CAS_AUTHENTICATION_FEATURE_COUNT = GEN_AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl <em>Gen Local Authentication System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenLocalAuthenticationSystem()
	 * @generated
	 */
	int GEN_LOCAL_AUTHENTICATION_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Jsf Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOCAL_AUTHENTICATION_SYSTEM__JSF_AUTHENTICATION = GEN_AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen User Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_SERVICE = GEN_AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen User Authentication Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_AUTHENTICATION_KEY = GEN_AUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gen Authentication Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTHENTICATION_SERVICE = GEN_AUTHENTICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gen Login Attempt Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_ATTEMPT_SERVICE = GEN_AUTHENTICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gen Auto Login Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTO_LOGIN_SERVICE = GEN_AUTHENTICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gen Registration Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT = GEN_AUTHENTICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gen Login Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT = GEN_AUTHENTICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gen Forgotten Password Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT = GEN_AUTHENTICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Login Maximum Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_MAXIMUM_ATTEMPTS = GEN_AUTHENTICATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Login Attempt Expiry Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_EXPIRY_PERIOD = GEN_AUTHENTICATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Autologin Cookie Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOCAL_AUTHENTICATION_SYSTEM__AUTOLOGIN_COOKIE_LIFETIME = GEN_AUTHENTICATION_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Gen Local Authentication System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOCAL_AUTHENTICATION_SYSTEM_FEATURE_COUNT = GEN_AUTHENTICATION_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceImpl <em>Gen Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenServiceImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenService()
	 * @generated
	 */
	int GEN_SERVICE = 7;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature <em>Gen Included Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenIncludedFeature()
	 * @generated
	 */
	int GEN_INCLUDED_FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Gen Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenPageImpl <em>Gen Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenPageImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenPage()
	 * @generated
	 */
	int GEN_PAGE = 16;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenContentUnitImpl <em>Gen Content Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenContentUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenContentUnit()
	 * @generated
	 */
	int GEN_CONTENT_UNIT = 30;

	/**
	 * The feature id for the '<em><b>Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INCLUDED_FEATURE__MESSAGE_DISPLAY_OPTION = 1;

	/**
	 * The number of structural features of the '<em>Gen Included Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INCLUDED_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedElement <em>Gen Included Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedElement
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenIncludedElement()
	 * @generated
	 */
	int GEN_INCLUDED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Gen Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INCLUDED_ELEMENT__GEN_FORCED_VALUE = GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INCLUDED_ELEMENT__MESSAGE_DISPLAY_OPTION = GEN_INCLUDED_FEATURE__MESSAGE_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Gen Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INCLUDED_ELEMENT__GEN_DEFAULT_VALUE = GEN_INCLUDED_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Included Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INCLUDED_ELEMENT_FEATURE_COUNT = GEN_INCLUDED_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedAssociation <em>Gen Included Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedAssociation
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenIncludedAssociation()
	 * @generated
	 */
	int GEN_INCLUDED_ASSOCIATION = 6;

	/**
	 * The feature id for the '<em><b>Gen Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INCLUDED_ASSOCIATION__GEN_FORCED_VALUE = GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INCLUDED_ASSOCIATION__MESSAGE_DISPLAY_OPTION = GEN_INCLUDED_FEATURE__MESSAGE_DISPLAY_OPTION;

	/**
	 * The number of structural features of the '<em>Gen Included Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INCLUDED_ASSOCIATION_FEATURE_COUNT = GEN_INCLUDED_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Jsf Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE__JSF_SERVICE = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE__GEN_ENTITIES = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Display Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE__GEN_DISPLAY_LABELS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gen Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE__GEN_SELECTIONS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gen Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE__GEN_FEATURES = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gen Accessed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE__GEN_ACCESSED_BY = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Default View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE__DEFAULT_VIEW_NAME = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE__VIEW_NAME = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Gen Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenModelLabelImpl <em>Gen Model Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenModelLabelImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenModelLabel()
	 * @generated
	 */
	int GEN_MODEL_LABEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_LABEL__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Label For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_LABEL__GEN_LABEL_FOR = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jsf Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_LABEL__JSF_LABEL = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_LABEL__GEN_FEATURES = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Model Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_LABEL_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceFeature <em>Gen Service Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceFeature
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenServiceFeature()
	 * @generated
	 */
	int GEN_SERVICE_FEATURE = 10;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityFeatureImpl <em>Gen Service Entity Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityFeatureImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenServiceEntityFeature()
	 * @generated
	 */
	int GEN_SERVICE_ENTITY_FEATURE = 11;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityElementImpl <em>Gen Service Entity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityElementImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenServiceEntityElement()
	 * @generated
	 */
	int GEN_SERVICE_ENTITY_ELEMENT = 12;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceAssociation <em>Gen Service Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceAssociation
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenServiceAssociation()
	 * @generated
	 */
	int GEN_SERVICE_ASSOCIATION = 13;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityAssociationImpl <em>Gen Service Entity Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityAssociationImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenServiceEntityAssociation()
	 * @generated
	 */
	int GEN_SERVICE_ENTITY_ASSOCIATION = 14;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceViewAssociationImpl <em>Gen Service View Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenServiceViewAssociationImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenServiceViewAssociation()
	 * @generated
	 */
	int GEN_SERVICE_VIEW_ASSOCIATION = 15;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenSelectionImpl <em>Gen Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenSelectionImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenSelection()
	 * @generated
	 */
	int GEN_SELECTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SELECTION__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Jsf Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SELECTION__JSF_SELECTION = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SELECTION__GEN_FILTER = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SELECTION__GEN_ORDERING = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SELECTION_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_FEATURE__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Included By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_FEATURE__GEN_INCLUDED_BY = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Service Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_FEATURE_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_FEATURE__GEN_FORCED_VALUE = GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_FEATURE__MESSAGE_DISPLAY_OPTION = GEN_INCLUDED_FEATURE__MESSAGE_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_FEATURE__NAME = GEN_INCLUDED_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Included By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY = GEN_INCLUDED_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_FEATURE__COLUMN_NAME = GEN_INCLUDED_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Service Entity Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_FEATURE_FEATURE_COUNT = GEN_INCLUDED_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gen Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ELEMENT__GEN_FORCED_VALUE = GEN_SERVICE_ENTITY_FEATURE__GEN_FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ELEMENT__MESSAGE_DISPLAY_OPTION = GEN_SERVICE_ENTITY_FEATURE__MESSAGE_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ELEMENT__NAME = GEN_SERVICE_ENTITY_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Included By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ELEMENT__GEN_INCLUDED_BY = GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ELEMENT__COLUMN_NAME = GEN_SERVICE_ENTITY_FEATURE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Gen Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ELEMENT__GEN_DEFAULT_VALUE = GEN_SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jsf Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ELEMENT__JSF_FEATURE = GEN_SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ELEMENT__GEN_FEATURE = GEN_SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Service Entity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ELEMENT_FEATURE_COUNT = GEN_SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ASSOCIATION__NAME = GEN_SERVICE_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Included By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ASSOCIATION__GEN_INCLUDED_BY = GEN_SERVICE_FEATURE__GEN_INCLUDED_BY;

	/**
	 * The number of structural features of the '<em>Gen Service Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ASSOCIATION_FEATURE_COUNT = GEN_SERVICE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ASSOCIATION__GEN_FORCED_VALUE = GEN_SERVICE_ENTITY_FEATURE__GEN_FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ASSOCIATION__MESSAGE_DISPLAY_OPTION = GEN_SERVICE_ENTITY_FEATURE__MESSAGE_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ASSOCIATION__NAME = GEN_SERVICE_ENTITY_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Included By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ASSOCIATION__GEN_INCLUDED_BY = GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ASSOCIATION__COLUMN_NAME = GEN_SERVICE_ENTITY_FEATURE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Jsf Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ASSOCIATION__JSF_FEATURE = GEN_SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ASSOCIATION__GEN_FEATURE = GEN_SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Service Entity Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_ENTITY_ASSOCIATION_FEATURE_COUNT = GEN_SERVICE_ENTITY_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_VIEW_ASSOCIATION__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Included By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_VIEW_ASSOCIATION__GEN_INCLUDED_BY = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jsf Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_VIEW_ASSOCIATION__JSF_FEATURE = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_VIEW_ASSOCIATION__GEN_TARGET_FEATURE = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Service View Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SERVICE_VIEW_ASSOCIATION_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitContainerImpl <em>Gen Unit Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitContainerImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitContainer()
	 * @generated
	 */
	int GEN_UNIT_CONTAINER = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PAGE__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PAGE__GEN_UNITS = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PAGE__GEN_PART_OF = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jsf Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PAGE__JSF_PAGE = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gen Parent Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PAGE__GEN_PARENT_PAGE = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gen Child Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PAGE__GEN_CHILD_PAGES = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gen Side Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PAGE__GEN_SIDE_MENU = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gen Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_PAGE_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.GenSelectTarget <em>Gen Select Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSelectTarget
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenSelectTarget()
	 * @generated
	 */
	int GEN_SELECT_TARGET = 17;

	/**
	 * The feature id for the '<em><b>Gen Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SELECT_TARGET__GEN_TARGETTING_ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Gen Select Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SELECT_TARGET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMenuImpl <em>Gen Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenMenuImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenMenu()
	 * @generated
	 */
	int GEN_MENU = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MENU__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MENU__GEN_ENTRIES = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MENU_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMenuEntryImpl <em>Gen Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenMenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenMenuEntry()
	 * @generated
	 */
	int GEN_MENU_ENTRY = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MENU_ENTRY__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MENU_ENTRY__GEN_PART_OF = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MENU_ENTRY_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenStaticMenuImpl <em>Gen Static Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenStaticMenuImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenStaticMenu()
	 * @generated
	 */
	int GEN_STATIC_MENU = 20;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicMenuImpl <em>Gen Dynamic Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicMenuImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenDynamicMenu()
	 * @generated
	 */
	int GEN_DYNAMIC_MENU = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STATIC_MENU__NAME = GEN_MENU__NAME;

	/**
	 * The feature id for the '<em><b>Gen Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STATIC_MENU__GEN_ENTRIES = GEN_MENU__GEN_ENTRIES;

	/**
	 * The feature id for the '<em><b>Jsf Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STATIC_MENU__JSF_MENU = GEN_MENU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Static Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STATIC_MENU_FEATURE_COUNT = GEN_MENU_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFixedPageMenuEntryImpl <em>Gen Fixed Page Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenFixedPageMenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenFixedPageMenuEntry()
	 * @generated
	 */
	int GEN_FIXED_PAGE_MENU_ENTRY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_PAGE_MENU_ENTRY__NAME = GEN_MENU_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Gen Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_PAGE_MENU_ENTRY__GEN_PART_OF = GEN_MENU_ENTRY__GEN_PART_OF;

	/**
	 * The feature id for the '<em><b>Jsf Menu Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_PAGE_MENU_ENTRY__JSF_MENU_ENTRY = GEN_MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_PAGE_MENU_ENTRY__GEN_DESTINATION = GEN_MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Fixed Page Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_PAGE_MENU_ENTRY_FEATURE_COUNT = GEN_MENU_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFixedActionMenuEntryImpl <em>Gen Fixed Action Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenFixedActionMenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenFixedActionMenuEntry()
	 * @generated
	 */
	int GEN_FIXED_ACTION_MENU_ENTRY = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_ACTION_MENU_ENTRY__NAME = GEN_MENU_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Gen Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_ACTION_MENU_ENTRY__GEN_PART_OF = GEN_MENU_ENTRY__GEN_PART_OF;

	/**
	 * The feature id for the '<em><b>Jsf Menu Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_ACTION_MENU_ENTRY__JSF_MENU_ENTRY = GEN_MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_ACTION_MENU_ENTRY__GEN_DESTINATION = GEN_MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Fixed Action Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_ACTION_MENU_ENTRY_FEATURE_COUNT = GEN_MENU_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFixedCommandMenuEntryImpl <em>Gen Fixed Command Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenFixedCommandMenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenFixedCommandMenuEntry()
	 * @generated
	 */
	int GEN_FIXED_COMMAND_MENU_ENTRY = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_COMMAND_MENU_ENTRY__NAME = GEN_MENU_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Gen Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_COMMAND_MENU_ENTRY__GEN_PART_OF = GEN_MENU_ENTRY__GEN_PART_OF;

	/**
	 * The feature id for the '<em><b>Jsf Menu Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_COMMAND_MENU_ENTRY__JSF_MENU_ENTRY = GEN_MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_COMMAND_MENU_ENTRY__GEN_DESTINATION = GEN_MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Fixed Command Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FIXED_COMMAND_MENU_ENTRY_FEATURE_COUNT = GEN_MENU_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenEditStaticTextMenuEntryImpl <em>Gen Edit Static Text Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenEditStaticTextMenuEntryImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenEditStaticTextMenuEntry()
	 * @generated
	 */
	int GEN_EDIT_STATIC_TEXT_MENU_ENTRY = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDIT_STATIC_TEXT_MENU_ENTRY__NAME = GEN_MENU_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Gen Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDIT_STATIC_TEXT_MENU_ENTRY__GEN_PART_OF = GEN_MENU_ENTRY__GEN_PART_OF;

	/**
	 * The feature id for the '<em><b>Jsf Menu Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDIT_STATIC_TEXT_MENU_ENTRY__JSF_MENU_ENTRY = GEN_MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Edit Static Text Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDIT_STATIC_TEXT_MENU_ENTRY_FEATURE_COUNT = GEN_MENU_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMenuIncludedFeatureImpl <em>Gen Menu Included Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenMenuIncludedFeatureImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenMenuIncludedFeature()
	 * @generated
	 */
	int GEN_MENU_INCLUDED_FEATURE = 26;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMenuIncludedElementImpl <em>Gen Menu Included Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenMenuIncludedElementImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenMenuIncludedElement()
	 * @generated
	 */
	int GEN_MENU_INCLUDED_ELEMENT = 27;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitField <em>Gen Unit Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitField
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitField()
	 * @generated
	 */
	int GEN_UNIT_FIELD = 37;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenInterfaceFieldImpl <em>Gen Interface Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenInterfaceFieldImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenInterfaceField()
	 * @generated
	 */
	int GEN_INTERFACE_FIELD = 44;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenStaticUnitImpl <em>Gen Static Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenStaticUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenStaticUnit()
	 * @generated
	 */
	int GEN_STATIC_UNIT = 32;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicUnitImpl <em>Gen Dynamic Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenDynamicUnit()
	 * @generated
	 */
	int GEN_DYNAMIC_UNIT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DYNAMIC_MENU__NAME = GEN_MENU__NAME;

	/**
	 * The feature id for the '<em><b>Gen Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DYNAMIC_MENU__GEN_ENTRIES = GEN_MENU__GEN_ENTRIES;

	/**
	 * The feature id for the '<em><b>Jsf Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DYNAMIC_MENU__JSF_MENU = GEN_MENU_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DYNAMIC_MENU__GEN_SERVICE = GEN_MENU_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DYNAMIC_MENU__GEN_SELECTION = GEN_MENU_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gen Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DYNAMIC_MENU__GEN_DYNAMIC_TITLE = GEN_MENU_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gen Dynamic Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DYNAMIC_MENU_FEATURE_COUNT = GEN_MENU_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MENU_INCLUDED_FEATURE__NAME = GEN_MENU_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Gen Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MENU_INCLUDED_FEATURE__GEN_PART_OF = GEN_MENU_ENTRY__GEN_PART_OF;

	/**
	 * The number of structural features of the '<em>Gen Menu Included Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MENU_INCLUDED_FEATURE_FEATURE_COUNT = GEN_MENU_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MENU_INCLUDED_ELEMENT__NAME = GEN_MENU_INCLUDED_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MENU_INCLUDED_ELEMENT__GEN_PART_OF = GEN_MENU_INCLUDED_FEATURE__GEN_PART_OF;

	/**
	 * The feature id for the '<em><b>Jsf Menu Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MENU_INCLUDED_ELEMENT__JSF_MENU_ENTRY = GEN_MENU_INCLUDED_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Menu Included Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MENU_INCLUDED_ELEMENT_FEATURE_COUNT = GEN_MENU_INCLUDED_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_CONTAINER__GEN_UNITS = 0;

	/**
	 * The number of structural features of the '<em>Gen Unit Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitTitle <em>Gen Unit Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitTitle
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitTitle()
	 * @generated
	 */
	int GEN_UNIT_TITLE = 29;

	/**
	 * The number of structural features of the '<em>Gen Unit Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_TITLE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTENT_UNIT__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTENT_UNIT__GEN_DISPLAYED_ON = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Content Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTENT_UNIT_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCreateSitemapUnitImpl <em>Gen Create Sitemap Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCreateSitemapUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCreateSitemapUnit()
	 * @generated
	 */
	int GEN_CREATE_SITEMAP_UNIT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_SITEMAP_UNIT__NAME = GEN_CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_SITEMAP_UNIT__GEN_DISPLAYED_ON = GEN_CONTENT_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_SITEMAP_UNIT__JSF_UNIT = GEN_CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Create Sitemap Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_SITEMAP_UNIT_FEATURE_COUNT = GEN_CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STATIC_UNIT__NAME = GEN_CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STATIC_UNIT__GEN_DISPLAYED_ON = GEN_CONTENT_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STATIC_UNIT__JSF_UNIT = GEN_CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STATIC_UNIT__GEN_SERVICE = GEN_CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Static Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_STATIC_UNIT_FEATURE_COUNT = GEN_CONTENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCommandUnitImpl <em>Gen Command Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCommandUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCommandUnit()
	 * @generated
	 */
	int GEN_COMMAND_UNIT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMAND_UNIT__NAME = GEN_CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMAND_UNIT__GEN_DISPLAYED_ON = GEN_CONTENT_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMAND_UNIT__JSF_UNIT = GEN_CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMAND_UNIT__GEN_COMMANDS = GEN_CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Command Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMAND_UNIT_FEATURE_COUNT = GEN_CONTENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCommandImpl <em>Gen Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCommandImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCommand()
	 * @generated
	 */
	int GEN_COMMAND = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMAND__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMAND__GEN_PART_OF = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COMMAND_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUserCommandImpl <em>Gen User Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUserCommandImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUserCommand()
	 * @generated
	 */
	int GEN_USER_COMMAND = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_USER_COMMAND__NAME = GEN_COMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Gen Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_USER_COMMAND__GEN_PART_OF = GEN_COMMAND__GEN_PART_OF;

	/**
	 * The feature id for the '<em><b>Jsf Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_USER_COMMAND__JSF_COMMAND = GEN_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen User Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_USER_COMMAND_FEATURE_COUNT = GEN_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DYNAMIC_UNIT__NAME = GEN_CONTENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DYNAMIC_UNIT__GEN_DISPLAYED_ON = GEN_CONTENT_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DYNAMIC_UNIT__GEN_SERVICE = GEN_CONTENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS = GEN_CONTENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS = GEN_CONTENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Dynamic Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DYNAMIC_UNIT_FEATURE_COUNT = GEN_CONTENT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_FIELD__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_FIELD__GEN_DISPLAYED_ON = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Unit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_FIELD_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitFeatureImpl <em>Gen Unit Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitFeatureImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitFeature()
	 * @generated
	 */
	int GEN_UNIT_FEATURE = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_FEATURE__NAME = GEN_UNIT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_FEATURE__GEN_DISPLAYED_ON = GEN_UNIT_FIELD__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_FEATURE__GEN_FORCED_VALUE = GEN_UNIT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_FEATURE__MESSAGE_DISPLAY_OPTION = GEN_UNIT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_FEATURE__GEN_ACTIONS = GEN_UNIT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Unit Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_FEATURE_FEATURE_COUNT = GEN_UNIT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitElementImpl <em>Gen Unit Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitElementImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitElement()
	 * @generated
	 */
	int GEN_UNIT_ELEMENT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ELEMENT__NAME = GEN_UNIT_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ELEMENT__GEN_DISPLAYED_ON = GEN_UNIT_FEATURE__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ELEMENT__GEN_FORCED_VALUE = GEN_UNIT_FEATURE__GEN_FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ELEMENT__MESSAGE_DISPLAY_OPTION = GEN_UNIT_FEATURE__MESSAGE_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Gen Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ELEMENT__GEN_ACTIONS = GEN_UNIT_FEATURE__GEN_ACTIONS;

	/**
	 * The feature id for the '<em><b>Gen Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ELEMENT__GEN_DEFAULT_VALUE = GEN_UNIT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jsf Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ELEMENT__JSF_FEATURE = GEN_UNIT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ELEMENT__GEN_SERVICE_FEATURE = GEN_UNIT_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Unit Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ELEMENT_FEATURE_COUNT = GEN_UNIT_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitAssociationImpl <em>Gen Unit Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitAssociationImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitAssociation()
	 * @generated
	 */
	int GEN_UNIT_ASSOCIATION = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION__NAME = GEN_UNIT_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION__GEN_DISPLAYED_ON = GEN_UNIT_FEATURE__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION__GEN_FORCED_VALUE = GEN_UNIT_FEATURE__GEN_FORCED_VALUE;

	/**
	 * The feature id for the '<em><b>Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION__MESSAGE_DISPLAY_OPTION = GEN_UNIT_FEATURE__MESSAGE_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Gen Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION__GEN_ACTIONS = GEN_UNIT_FEATURE__GEN_ACTIONS;

	/**
	 * The feature id for the '<em><b>Gen Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION__GEN_UNITS = GEN_UNIT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jsf Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION__JSF_FEATURE = GEN_UNIT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION__GEN_SERVICE_FEATURE = GEN_UNIT_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gen Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE = GEN_UNIT_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gen Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION__GEN_SELECTION = GEN_UNIT_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gen Dynamic Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION__GEN_DYNAMIC_LABEL = GEN_UNIT_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gen Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION__GEN_FILTERS = GEN_UNIT_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Select One Of Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION__SELECT_ONE_OF_OPTION = GEN_UNIT_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Select Many Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION__SELECT_MANY_OPTION = GEN_UNIT_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Gen Unit Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_ASSOCIATION_FEATURE_COUNT = GEN_UNIT_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildFeatureImpl <em>Gen Unit Child Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildFeatureImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitChildFeature()
	 * @generated
	 */
	int GEN_UNIT_CHILD_FEATURE = 41;

	/**
	 * The number of structural features of the '<em>Gen Unit Child Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_CHILD_FEATURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildElementImpl <em>Gen Unit Child Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildElementImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitChildElement()
	 * @generated
	 */
	int GEN_UNIT_CHILD_ELEMENT = 42;

	/**
	 * The feature id for the '<em><b>Jsf Child Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_CHILD_ELEMENT__JSF_CHILD_FEATURE = GEN_UNIT_CHILD_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_CHILD_ELEMENT__GEN_SERVICE_FEATURE = GEN_UNIT_CHILD_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Unit Child Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_CHILD_ELEMENT_FEATURE_COUNT = GEN_UNIT_CHILD_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildAssociationImpl <em>Gen Unit Child Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildAssociationImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitChildAssociation()
	 * @generated
	 */
	int GEN_UNIT_CHILD_ASSOCIATION = 43;

	/**
	 * The feature id for the '<em><b>Jsf Child Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_CHILD_ASSOCIATION__JSF_CHILD_FEATURE = GEN_UNIT_CHILD_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_CHILD_ASSOCIATION__GEN_SERVICE_FEATURE = GEN_UNIT_CHILD_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_CHILD_ASSOCIATION__GEN_CHILD_FEATURE = GEN_UNIT_CHILD_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Unit Child Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_CHILD_ASSOCIATION_FEATURE_COUNT = GEN_UNIT_CHILD_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INTERFACE_FIELD__NAME = GEN_UNIT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INTERFACE_FIELD__GEN_DISPLAYED_ON = GEN_UNIT_FIELD__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INTERFACE_FIELD__GEN_MUST_MATCH = GEN_UNIT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INTERFACE_FIELD__GEN_DEFAULT_VALUE = GEN_UNIT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Interface Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INTERFACE_FIELD_FEATURE_COUNT = GEN_UNIT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDataTypeFieldImpl <em>Gen Data Type Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenDataTypeFieldImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenDataTypeField()
	 * @generated
	 */
	int GEN_DATA_TYPE_FIELD = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE_FIELD__NAME = GEN_INTERFACE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE_FIELD__GEN_DISPLAYED_ON = GEN_INTERFACE_FIELD__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE_FIELD__GEN_MUST_MATCH = GEN_INTERFACE_FIELD__GEN_MUST_MATCH;

	/**
	 * The feature id for the '<em><b>Gen Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE_FIELD__GEN_DEFAULT_VALUE = GEN_INTERFACE_FIELD__GEN_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Gen Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE_FIELD__GEN_DATA_TYPE = GEN_INTERFACE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jsf Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE_FIELD__JSF_FIELD = GEN_INTERFACE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Data Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE_FIELD_FEATURE_COUNT = GEN_INTERFACE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDateFieldImpl <em>Gen Date Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenDateFieldImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenDateField()
	 * @generated
	 */
	int GEN_DATE_FIELD = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATE_FIELD__NAME = GEN_INTERFACE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATE_FIELD__GEN_DISPLAYED_ON = GEN_INTERFACE_FIELD__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATE_FIELD__GEN_MUST_MATCH = GEN_INTERFACE_FIELD__GEN_MUST_MATCH;

	/**
	 * The feature id for the '<em><b>Gen Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATE_FIELD__GEN_DEFAULT_VALUE = GEN_INTERFACE_FIELD__GEN_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Jsf Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATE_FIELD__JSF_FIELD = GEN_INTERFACE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Date Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATE_FIELD_FEATURE_COUNT = GEN_INTERFACE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCaptchaFieldImpl <em>Gen Captcha Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCaptchaFieldImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCaptchaField()
	 * @generated
	 */
	int GEN_CAPTCHA_FIELD = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CAPTCHA_FIELD__NAME = GEN_UNIT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CAPTCHA_FIELD__GEN_DISPLAYED_ON = GEN_UNIT_FIELD__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Jsf Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CAPTCHA_FIELD__JSF_FIELD = GEN_UNIT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Captcha Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CAPTCHA_FIELD_FEATURE_COUNT = GEN_UNIT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitSupportActionImpl <em>Gen Unit Support Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitSupportActionImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitSupportAction()
	 * @generated
	 */
	int GEN_UNIT_SUPPORT_ACTION = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_SUPPORT_ACTION__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Jsf Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_SUPPORT_ACTION__JSF_ACTION = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Unit Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UNIT_SUPPORT_ACTION_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenEditUnitImpl <em>Gen Edit Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenEditUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenEditUnit()
	 * @generated
	 */
	int GEN_EDIT_UNIT = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDIT_UNIT__NAME = GEN_DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDIT_UNIT__GEN_DISPLAYED_ON = GEN_DYNAMIC_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDIT_UNIT__GEN_SERVICE = GEN_DYNAMIC_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDIT_UNIT__GEN_DISPLAY_FIELDS = GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDIT_UNIT__GEN_SUPPORT_ACTIONS = GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Message Placement Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDIT_UNIT__MESSAGE_PLACEMENT_OPTION = GEN_DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Form Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDIT_UNIT__FORM_MESSAGE_DISPLAY_OPTION = GEN_DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDIT_UNIT__GEN_CONFIRM_DESTINATION = GEN_DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gen Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDIT_UNIT__GEN_CANCEL_DESTINATION = GEN_DYNAMIC_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gen Edit Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_EDIT_UNIT_FEATURE_COUNT = GEN_DYNAMIC_UNIT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCreateUnitImpl <em>Gen Create Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCreateUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCreateUnit()
	 * @generated
	 */
	int GEN_CREATE_UNIT = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UNIT__NAME = GEN_EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UNIT__GEN_DISPLAYED_ON = GEN_EDIT_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UNIT__GEN_SERVICE = GEN_EDIT_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UNIT__GEN_DISPLAY_FIELDS = GEN_EDIT_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UNIT__GEN_SUPPORT_ACTIONS = GEN_EDIT_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Message Placement Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UNIT__MESSAGE_PLACEMENT_OPTION = GEN_EDIT_UNIT__MESSAGE_PLACEMENT_OPTION;

	/**
	 * The feature id for the '<em><b>Form Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UNIT__FORM_MESSAGE_DISPLAY_OPTION = GEN_EDIT_UNIT__FORM_MESSAGE_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Gen Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UNIT__GEN_CONFIRM_DESTINATION = GEN_EDIT_UNIT__GEN_CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Gen Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UNIT__GEN_CANCEL_DESTINATION = GEN_EDIT_UNIT__GEN_CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UNIT__JSF_UNIT = GEN_EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Create Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UNIT_FEATURE_COUNT = GEN_EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCreateUpdateUnitImpl <em>Gen Create Update Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCreateUpdateUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCreateUpdateUnit()
	 * @generated
	 */
	int GEN_CREATE_UPDATE_UNIT = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UPDATE_UNIT__NAME = GEN_EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UPDATE_UNIT__GEN_DISPLAYED_ON = GEN_EDIT_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UPDATE_UNIT__GEN_SERVICE = GEN_EDIT_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UPDATE_UNIT__GEN_DISPLAY_FIELDS = GEN_EDIT_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UPDATE_UNIT__GEN_SUPPORT_ACTIONS = GEN_EDIT_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Message Placement Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UPDATE_UNIT__MESSAGE_PLACEMENT_OPTION = GEN_EDIT_UNIT__MESSAGE_PLACEMENT_OPTION;

	/**
	 * The feature id for the '<em><b>Form Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UPDATE_UNIT__FORM_MESSAGE_DISPLAY_OPTION = GEN_EDIT_UNIT__FORM_MESSAGE_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Gen Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UPDATE_UNIT__GEN_CONFIRM_DESTINATION = GEN_EDIT_UNIT__GEN_CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Gen Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UPDATE_UNIT__GEN_CANCEL_DESTINATION = GEN_EDIT_UNIT__GEN_CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Gen Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UPDATE_UNIT__GEN_TARGETTING_ACTIONS = GEN_EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UPDATE_UNIT__JSF_UNIT = GEN_EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Create Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CREATE_UPDATE_UNIT_FEATURE_COUNT = GEN_EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMapUnitImpl <em>Gen Map Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenMapUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenMapUnit()
	 * @generated
	 */
	int GEN_MAP_UNIT = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MAP_UNIT__NAME = GEN_EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MAP_UNIT__GEN_DISPLAYED_ON = GEN_EDIT_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MAP_UNIT__GEN_SERVICE = GEN_EDIT_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MAP_UNIT__GEN_DISPLAY_FIELDS = GEN_EDIT_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MAP_UNIT__GEN_SUPPORT_ACTIONS = GEN_EDIT_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Message Placement Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MAP_UNIT__MESSAGE_PLACEMENT_OPTION = GEN_EDIT_UNIT__MESSAGE_PLACEMENT_OPTION;

	/**
	 * The feature id for the '<em><b>Form Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MAP_UNIT__FORM_MESSAGE_DISPLAY_OPTION = GEN_EDIT_UNIT__FORM_MESSAGE_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Gen Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MAP_UNIT__GEN_CONFIRM_DESTINATION = GEN_EDIT_UNIT__GEN_CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Gen Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MAP_UNIT__GEN_CANCEL_DESTINATION = GEN_EDIT_UNIT__GEN_CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Gen Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MAP_UNIT__GEN_TARGETTING_ACTIONS = GEN_EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MAP_UNIT__JSF_UNIT = GEN_EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MAP_UNIT__GEN_LOCATION = GEN_EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gen Place Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MAP_UNIT__GEN_PLACE_NAME = GEN_EDIT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gen Map Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MAP_UNIT_FEATURE_COUNT = GEN_EDIT_UNIT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUpdateUnitImpl <em>Gen Update Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUpdateUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUpdateUnit()
	 * @generated
	 */
	int GEN_UPDATE_UNIT = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UPDATE_UNIT__NAME = GEN_EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UPDATE_UNIT__GEN_DISPLAYED_ON = GEN_EDIT_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UPDATE_UNIT__GEN_SERVICE = GEN_EDIT_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UPDATE_UNIT__GEN_DISPLAY_FIELDS = GEN_EDIT_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UPDATE_UNIT__GEN_SUPPORT_ACTIONS = GEN_EDIT_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Message Placement Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UPDATE_UNIT__MESSAGE_PLACEMENT_OPTION = GEN_EDIT_UNIT__MESSAGE_PLACEMENT_OPTION;

	/**
	 * The feature id for the '<em><b>Form Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UPDATE_UNIT__FORM_MESSAGE_DISPLAY_OPTION = GEN_EDIT_UNIT__FORM_MESSAGE_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Gen Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UPDATE_UNIT__GEN_CONFIRM_DESTINATION = GEN_EDIT_UNIT__GEN_CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Gen Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UPDATE_UNIT__GEN_CANCEL_DESTINATION = GEN_EDIT_UNIT__GEN_CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Gen Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UPDATE_UNIT__GEN_TARGETTING_ACTIONS = GEN_EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UPDATE_UNIT__JSF_UNIT = GEN_EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Update Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_UPDATE_UNIT_FEATURE_COUNT = GEN_EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDataUnitImpl <em>Gen Data Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenDataUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenDataUnit()
	 * @generated
	 */
	int GEN_DATA_UNIT = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_UNIT__NAME = GEN_DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_UNIT__GEN_DISPLAYED_ON = GEN_DYNAMIC_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_UNIT__GEN_SERVICE = GEN_DYNAMIC_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_UNIT__GEN_DISPLAY_FIELDS = GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_UNIT__GEN_SUPPORT_ACTIONS = GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Gen Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_UNIT__GEN_SELECTION = GEN_DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_UNIT__GEN_DYNAMIC_TITLE = GEN_DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Data Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_UNIT_FEATURE_COUNT = GEN_DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDetailsUnitImpl <em>Gen Details Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenDetailsUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenDetailsUnit()
	 * @generated
	 */
	int GEN_DETAILS_UNIT = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DETAILS_UNIT__NAME = GEN_DATA_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DETAILS_UNIT__GEN_DISPLAYED_ON = GEN_DATA_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DETAILS_UNIT__GEN_SERVICE = GEN_DATA_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DETAILS_UNIT__GEN_DISPLAY_FIELDS = GEN_DATA_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DETAILS_UNIT__GEN_SUPPORT_ACTIONS = GEN_DATA_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Gen Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DETAILS_UNIT__GEN_SELECTION = GEN_DATA_UNIT__GEN_SELECTION;

	/**
	 * The feature id for the '<em><b>Gen Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DETAILS_UNIT__GEN_DYNAMIC_TITLE = GEN_DATA_UNIT__GEN_DYNAMIC_TITLE;

	/**
	 * The feature id for the '<em><b>Gen Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DETAILS_UNIT__GEN_TARGETTING_ACTIONS = GEN_DATA_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DETAILS_UNIT__JSF_UNIT = GEN_DATA_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Details Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DETAILS_UNIT_FEATURE_COUNT = GEN_DATA_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenIndexUnitImpl <em>Gen Index Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenIndexUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenIndexUnit()
	 * @generated
	 */
	int GEN_INDEX_UNIT = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_UNIT__NAME = GEN_DATA_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_UNIT__GEN_DISPLAYED_ON = GEN_DATA_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_UNIT__GEN_SERVICE = GEN_DATA_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_UNIT__GEN_DISPLAY_FIELDS = GEN_DATA_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_UNIT__GEN_SUPPORT_ACTIONS = GEN_DATA_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Gen Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_UNIT__GEN_SELECTION = GEN_DATA_UNIT__GEN_SELECTION;

	/**
	 * The feature id for the '<em><b>Gen Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_UNIT__GEN_DYNAMIC_TITLE = GEN_DATA_UNIT__GEN_DYNAMIC_TITLE;

	/**
	 * The feature id for the '<em><b>Gen Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_UNIT__GEN_ACTIONS = GEN_DATA_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_UNIT__GEN_TARGETTING_ACTIONS = GEN_DATA_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_UNIT__JSF_UNIT = GEN_DATA_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gen Targetting Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES = GEN_DATA_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gen Index Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_UNIT_FEATURE_COUNT = GEN_DATA_UNIT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenIndexGridUnitImpl <em>Gen Index Grid Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenIndexGridUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenIndexGridUnit()
	 * @generated
	 */
	int GEN_INDEX_GRID_UNIT = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_GRID_UNIT__NAME = GEN_INDEX_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_GRID_UNIT__GEN_DISPLAYED_ON = GEN_INDEX_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_GRID_UNIT__GEN_SERVICE = GEN_INDEX_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_GRID_UNIT__GEN_DISPLAY_FIELDS = GEN_INDEX_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_GRID_UNIT__GEN_SUPPORT_ACTIONS = GEN_INDEX_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Gen Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_GRID_UNIT__GEN_SELECTION = GEN_INDEX_UNIT__GEN_SELECTION;

	/**
	 * The feature id for the '<em><b>Gen Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_GRID_UNIT__GEN_DYNAMIC_TITLE = GEN_INDEX_UNIT__GEN_DYNAMIC_TITLE;

	/**
	 * The feature id for the '<em><b>Gen Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_GRID_UNIT__GEN_ACTIONS = GEN_INDEX_UNIT__GEN_ACTIONS;

	/**
	 * The feature id for the '<em><b>Gen Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_GRID_UNIT__GEN_TARGETTING_ACTIONS = GEN_INDEX_UNIT__GEN_TARGETTING_ACTIONS;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_GRID_UNIT__JSF_UNIT = GEN_INDEX_UNIT__JSF_UNIT;

	/**
	 * The feature id for the '<em><b>Gen Targetting Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_GRID_UNIT__GEN_TARGETTING_SEARCHES = GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES;

	/**
	 * The number of structural features of the '<em>Gen Index Grid Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_GRID_UNIT_FEATURE_COUNT = GEN_INDEX_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenIndexPageDirectionUnitImpl <em>Gen Index Page Direction Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenIndexPageDirectionUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenIndexPageDirectionUnit()
	 * @generated
	 */
	int GEN_INDEX_PAGE_DIRECTION_UNIT = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_PAGE_DIRECTION_UNIT__NAME = GEN_INDEX_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_PAGE_DIRECTION_UNIT__GEN_DISPLAYED_ON = GEN_INDEX_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_PAGE_DIRECTION_UNIT__GEN_SERVICE = GEN_INDEX_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_PAGE_DIRECTION_UNIT__GEN_DISPLAY_FIELDS = GEN_INDEX_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_PAGE_DIRECTION_UNIT__GEN_SUPPORT_ACTIONS = GEN_INDEX_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Gen Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_PAGE_DIRECTION_UNIT__GEN_SELECTION = GEN_INDEX_UNIT__GEN_SELECTION;

	/**
	 * The feature id for the '<em><b>Gen Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_PAGE_DIRECTION_UNIT__GEN_DYNAMIC_TITLE = GEN_INDEX_UNIT__GEN_DYNAMIC_TITLE;

	/**
	 * The feature id for the '<em><b>Gen Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_PAGE_DIRECTION_UNIT__GEN_ACTIONS = GEN_INDEX_UNIT__GEN_ACTIONS;

	/**
	 * The feature id for the '<em><b>Gen Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_PAGE_DIRECTION_UNIT__GEN_TARGETTING_ACTIONS = GEN_INDEX_UNIT__GEN_TARGETTING_ACTIONS;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_PAGE_DIRECTION_UNIT__JSF_UNIT = GEN_INDEX_UNIT__JSF_UNIT;

	/**
	 * The feature id for the '<em><b>Gen Targetting Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_PAGE_DIRECTION_UNIT__GEN_TARGETTING_SEARCHES = GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES;

	/**
	 * The number of structural features of the '<em>Gen Index Page Direction Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_PAGE_DIRECTION_UNIT_FEATURE_COUNT = GEN_INDEX_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenIndexLineDirectionUnitImpl <em>Gen Index Line Direction Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenIndexLineDirectionUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenIndexLineDirectionUnit()
	 * @generated
	 */
	int GEN_INDEX_LINE_DIRECTION_UNIT = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_LINE_DIRECTION_UNIT__NAME = GEN_INDEX_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_LINE_DIRECTION_UNIT__GEN_DISPLAYED_ON = GEN_INDEX_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_LINE_DIRECTION_UNIT__GEN_SERVICE = GEN_INDEX_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_LINE_DIRECTION_UNIT__GEN_DISPLAY_FIELDS = GEN_INDEX_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_LINE_DIRECTION_UNIT__GEN_SUPPORT_ACTIONS = GEN_INDEX_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Gen Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_LINE_DIRECTION_UNIT__GEN_SELECTION = GEN_INDEX_UNIT__GEN_SELECTION;

	/**
	 * The feature id for the '<em><b>Gen Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_LINE_DIRECTION_UNIT__GEN_DYNAMIC_TITLE = GEN_INDEX_UNIT__GEN_DYNAMIC_TITLE;

	/**
	 * The feature id for the '<em><b>Gen Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_LINE_DIRECTION_UNIT__GEN_ACTIONS = GEN_INDEX_UNIT__GEN_ACTIONS;

	/**
	 * The feature id for the '<em><b>Gen Targetting Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_LINE_DIRECTION_UNIT__GEN_TARGETTING_ACTIONS = GEN_INDEX_UNIT__GEN_TARGETTING_ACTIONS;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_LINE_DIRECTION_UNIT__JSF_UNIT = GEN_INDEX_UNIT__JSF_UNIT;

	/**
	 * The feature id for the '<em><b>Gen Targetting Searches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_LINE_DIRECTION_UNIT__GEN_TARGETTING_SEARCHES = GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES;

	/**
	 * The number of structural features of the '<em>Gen Index Line Direction Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INDEX_LINE_DIRECTION_UNIT_FEATURE_COUNT = GEN_INDEX_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenControlUnitImpl <em>Gen Control Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenControlUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenControlUnit()
	 * @generated
	 */
	int GEN_CONTROL_UNIT = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTROL_UNIT__NAME = GEN_DYNAMIC_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTROL_UNIT__GEN_DISPLAYED_ON = GEN_DYNAMIC_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTROL_UNIT__GEN_SERVICE = GEN_DYNAMIC_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTROL_UNIT__GEN_DISPLAY_FIELDS = GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTROL_UNIT__GEN_SUPPORT_ACTIONS = GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Message Placement Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTROL_UNIT__MESSAGE_PLACEMENT_OPTION = GEN_DYNAMIC_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTROL_UNIT__GEN_CANCEL_DESTINATION = GEN_DYNAMIC_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTROL_UNIT_FEATURE_COUNT = GEN_DYNAMIC_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenSearchUnitImpl <em>Gen Search Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenSearchUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenSearchUnit()
	 * @generated
	 */
	int GEN_SEARCH_UNIT = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SEARCH_UNIT__NAME = GEN_CONTROL_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SEARCH_UNIT__GEN_DISPLAYED_ON = GEN_CONTROL_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SEARCH_UNIT__GEN_SERVICE = GEN_CONTROL_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SEARCH_UNIT__GEN_DISPLAY_FIELDS = GEN_CONTROL_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SEARCH_UNIT__GEN_SUPPORT_ACTIONS = GEN_CONTROL_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Message Placement Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SEARCH_UNIT__MESSAGE_PLACEMENT_OPTION = GEN_CONTROL_UNIT__MESSAGE_PLACEMENT_OPTION;

	/**
	 * The feature id for the '<em><b>Gen Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SEARCH_UNIT__GEN_CANCEL_DESTINATION = GEN_CONTROL_UNIT__GEN_CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SEARCH_UNIT__JSF_UNIT = GEN_CONTROL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Result Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SEARCH_UNIT__GEN_RESULT_DESTINATION = GEN_CONTROL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Search Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SEARCH_UNIT_FEATURE_COUNT = GEN_CONTROL_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenActionUnitImpl <em>Gen Action Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenActionUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenActionUnit()
	 * @generated
	 */
	int GEN_ACTION_UNIT = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ACTION_UNIT__NAME = GEN_CONTROL_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ACTION_UNIT__GEN_DISPLAYED_ON = GEN_CONTROL_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ACTION_UNIT__GEN_SERVICE = GEN_CONTROL_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ACTION_UNIT__GEN_DISPLAY_FIELDS = GEN_CONTROL_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ACTION_UNIT__GEN_SUPPORT_ACTIONS = GEN_CONTROL_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Message Placement Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ACTION_UNIT__MESSAGE_PLACEMENT_OPTION = GEN_CONTROL_UNIT__MESSAGE_PLACEMENT_OPTION;

	/**
	 * The feature id for the '<em><b>Gen Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ACTION_UNIT__GEN_CANCEL_DESTINATION = GEN_CONTROL_UNIT__GEN_CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ACTION_UNIT__JSF_UNIT = GEN_CONTROL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Action Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ACTION_UNIT_FEATURE_COUNT = GEN_CONTROL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.GenAuthenticationUnit <em>Gen Authentication Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.GenAuthenticationUnit
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenAuthenticationUnit()
	 * @generated
	 */
	int GEN_AUTHENTICATION_UNIT = 63;

	/**
	 * The number of structural features of the '<em>Gen Authentication Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_AUTHENTICATION_UNIT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenRegistrationUnitImpl <em>Gen Registration Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenRegistrationUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenRegistrationUnit()
	 * @generated
	 */
	int GEN_REGISTRATION_UNIT = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REGISTRATION_UNIT__NAME = GEN_EDIT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REGISTRATION_UNIT__GEN_DISPLAYED_ON = GEN_EDIT_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REGISTRATION_UNIT__GEN_SERVICE = GEN_EDIT_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REGISTRATION_UNIT__GEN_DISPLAY_FIELDS = GEN_EDIT_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REGISTRATION_UNIT__GEN_SUPPORT_ACTIONS = GEN_EDIT_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Message Placement Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REGISTRATION_UNIT__MESSAGE_PLACEMENT_OPTION = GEN_EDIT_UNIT__MESSAGE_PLACEMENT_OPTION;

	/**
	 * The feature id for the '<em><b>Form Message Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REGISTRATION_UNIT__FORM_MESSAGE_DISPLAY_OPTION = GEN_EDIT_UNIT__FORM_MESSAGE_DISPLAY_OPTION;

	/**
	 * The feature id for the '<em><b>Gen Confirm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REGISTRATION_UNIT__GEN_CONFIRM_DESTINATION = GEN_EDIT_UNIT__GEN_CONFIRM_DESTINATION;

	/**
	 * The feature id for the '<em><b>Gen Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REGISTRATION_UNIT__GEN_CANCEL_DESTINATION = GEN_EDIT_UNIT__GEN_CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REGISTRATION_UNIT__JSF_UNIT = GEN_EDIT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Authentication System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM = GEN_EDIT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Registration Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_REGISTRATION_UNIT_FEATURE_COUNT = GEN_EDIT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLoginUnitImpl <em>Gen Login Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenLoginUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenLoginUnit()
	 * @generated
	 */
	int GEN_LOGIN_UNIT = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOGIN_UNIT__NAME = GEN_CONTROL_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOGIN_UNIT__GEN_DISPLAYED_ON = GEN_CONTROL_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOGIN_UNIT__GEN_SERVICE = GEN_CONTROL_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOGIN_UNIT__GEN_DISPLAY_FIELDS = GEN_CONTROL_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOGIN_UNIT__GEN_SUPPORT_ACTIONS = GEN_CONTROL_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Message Placement Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOGIN_UNIT__MESSAGE_PLACEMENT_OPTION = GEN_CONTROL_UNIT__MESSAGE_PLACEMENT_OPTION;

	/**
	 * The feature id for the '<em><b>Gen Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOGIN_UNIT__GEN_CANCEL_DESTINATION = GEN_CONTROL_UNIT__GEN_CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOGIN_UNIT__JSF_UNIT = GEN_CONTROL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Authentication System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM = GEN_CONTROL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Login Id Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOGIN_UNIT__GEN_LOGIN_ID_FIELD = GEN_CONTROL_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gen Password Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOGIN_UNIT__GEN_PASSWORD_FIELD = GEN_CONTROL_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gen Remember Me Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOGIN_UNIT__GEN_REMEMBER_ME_FIELD = GEN_CONTROL_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gen Login Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LOGIN_UNIT_FEATURE_COUNT = GEN_CONTROL_UNIT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenForgottenPasswordUnitImpl <em>Gen Forgotten Password Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenForgottenPasswordUnitImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenForgottenPasswordUnit()
	 * @generated
	 */
	int GEN_FORGOTTEN_PASSWORD_UNIT = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FORGOTTEN_PASSWORD_UNIT__NAME = GEN_CONTROL_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Displayed On</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FORGOTTEN_PASSWORD_UNIT__GEN_DISPLAYED_ON = GEN_CONTROL_UNIT__GEN_DISPLAYED_ON;

	/**
	 * The feature id for the '<em><b>Gen Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FORGOTTEN_PASSWORD_UNIT__GEN_SERVICE = GEN_CONTROL_UNIT__GEN_SERVICE;

	/**
	 * The feature id for the '<em><b>Gen Display Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FORGOTTEN_PASSWORD_UNIT__GEN_DISPLAY_FIELDS = GEN_CONTROL_UNIT__GEN_DISPLAY_FIELDS;

	/**
	 * The feature id for the '<em><b>Gen Support Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FORGOTTEN_PASSWORD_UNIT__GEN_SUPPORT_ACTIONS = GEN_CONTROL_UNIT__GEN_SUPPORT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Message Placement Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FORGOTTEN_PASSWORD_UNIT__MESSAGE_PLACEMENT_OPTION = GEN_CONTROL_UNIT__MESSAGE_PLACEMENT_OPTION;

	/**
	 * The feature id for the '<em><b>Gen Cancel Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FORGOTTEN_PASSWORD_UNIT__GEN_CANCEL_DESTINATION = GEN_CONTROL_UNIT__GEN_CANCEL_DESTINATION;

	/**
	 * The feature id for the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FORGOTTEN_PASSWORD_UNIT__JSF_UNIT = GEN_CONTROL_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Authentication System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM = GEN_CONTROL_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gen Login Id Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FORGOTTEN_PASSWORD_UNIT__GEN_LOGIN_ID_FIELD = GEN_CONTROL_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Forgotten Password Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FORGOTTEN_PASSWORD_UNIT_FEATURE_COUNT = GEN_CONTROL_UNIT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer <em>Gen Inline Action Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenInlineActionContainer()
	 * @generated
	 */
	int GEN_INLINE_ACTION_CONTAINER = 67;

	/**
	 * The feature id for the '<em><b>Gen Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INLINE_ACTION_CONTAINER__GEN_ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Gen Inline Action Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INLINE_ACTION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenInlineActionImpl <em>Gen Inline Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenInlineActionImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenInlineAction()
	 * @generated
	 */
	int GEN_INLINE_ACTION = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INLINE_ACTION__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Jsf Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INLINE_ACTION__JSF_ACTION = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INLINE_ACTION__GEN_USED_BY = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Inline Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_INLINE_ACTION_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenSelectActionImpl <em>Gen Select Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenSelectActionImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenSelectAction()
	 * @generated
	 */
	int GEN_SELECT_ACTION = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SELECT_ACTION__NAME = GEN_INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Jsf Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SELECT_ACTION__JSF_ACTION = GEN_INLINE_ACTION__JSF_ACTION;

	/**
	 * The feature id for the '<em><b>Gen Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SELECT_ACTION__GEN_USED_BY = GEN_INLINE_ACTION__GEN_USED_BY;

	/**
	 * The feature id for the '<em><b>Gen Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SELECT_ACTION__GEN_TARGET = GEN_INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Select Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SELECT_ACTION_FEATURE_COUNT = GEN_INLINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDeleteActionImpl <em>Gen Delete Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenDeleteActionImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenDeleteAction()
	 * @generated
	 */
	int GEN_DELETE_ACTION = 70;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DELETE_ACTION__NAME = GEN_INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Jsf Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DELETE_ACTION__JSF_ACTION = GEN_INLINE_ACTION__JSF_ACTION;

	/**
	 * The feature id for the '<em><b>Gen Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DELETE_ACTION__GEN_USED_BY = GEN_INLINE_ACTION__GEN_USED_BY;

	/**
	 * The feature id for the '<em><b>Gen Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DELETE_ACTION__GEN_DESTINATION = GEN_INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DELETE_ACTION_FEATURE_COUNT = GEN_INLINE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFeatureSupportActionImpl <em>Gen Feature Support Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenFeatureSupportActionImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenFeatureSupportAction()
	 * @generated
	 */
	int GEN_FEATURE_SUPPORT_ACTION = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_SUPPORT_ACTION__NAME = GEN_INLINE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Jsf Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_SUPPORT_ACTION__JSF_ACTION = GEN_INLINE_ACTION__JSF_ACTION;

	/**
	 * The feature id for the '<em><b>Gen Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_SUPPORT_ACTION__GEN_USED_BY = GEN_INLINE_ACTION__GEN_USED_BY;

	/**
	 * The number of structural features of the '<em>Gen Feature Support Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_SUPPORT_ACTION_FEATURE_COUNT = GEN_INLINE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFeatureReferenceImpl <em>Gen Feature Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenFeatureReferenceImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenFeatureReference()
	 * @generated
	 */
	int GEN_FEATURE_REFERENCE = 72;

	/**
	 * The feature id for the '<em><b>Criteria Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_REFERENCE__CRITERIA_PATH = GencriteriaPackage.GEN_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_REFERENCE__GEN_FIELD = GencriteriaPackage.GEN_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Feature Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_REFERENCE_FEATURE_COUNT = GencriteriaPackage.GEN_PATH_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenModelReferenceImpl <em>Gen Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenModelReferenceImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenModelReference()
	 * @generated
	 */
	int GEN_MODEL_REFERENCE = 73;

	/**
	 * The feature id for the '<em><b>Criteria Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_REFERENCE__CRITERIA_PATH = GencriteriaPackage.GEN_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_REFERENCE__GEN_UNIT = GencriteriaPackage.GEN_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_REFERENCE_FEATURE_COUNT = GencriteriaPackage.GEN_PATH_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCurrentUserReferenceImpl <em>Gen Current User Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCurrentUserReferenceImpl
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCurrentUserReference()
	 * @generated
	 */
	int GEN_CURRENT_USER_REFERENCE = 74;

	/**
	 * The feature id for the '<em><b>Criteria Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CURRENT_USER_REFERENCE__CRITERIA_PATH = GencriteriaPackage.GEN_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Current User Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CURRENT_USER_REFERENCE_FEATURE_COUNT = GencriteriaPackage.GEN_PATH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.SelectOneofOptions <em>Select Oneof Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.SelectOneofOptions
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getSelectOneofOptions()
	 * @generated
	 */
	int SELECT_ONEOF_OPTIONS = 75;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.SelectManyOptions <em>Select Many Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.SelectManyOptions
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getSelectManyOptions()
	 * @generated
	 */
	int SELECT_MANY_OPTIONS = 76;


	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.InputMessagePlacementOptions <em>Input Message Placement Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.InputMessagePlacementOptions
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getInputMessagePlacementOptions()
	 * @generated
	 */
	int INPUT_MESSAGE_PLACEMENT_OPTIONS = 77;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions <em>Input Message Display Options</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions
	 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getInputMessageDisplayOptions()
	 * @generated
	 */
	int INPUT_MESSAGE_DISPLAY_OPTIONS = 78;


	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel
	 * @generated
	 */
	EClass getGenJsfModel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getJsfModel <em>Jsf Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Model</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getJsfModel()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EReference getGenJsfModel_JsfModel();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenAuthentication <em>Gen Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Authentication</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenAuthentication()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EReference getGenJsfModel_GenAuthentication();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenServices <em>Gen Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Services</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenServices()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EReference getGenJsfModel_GenServices();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenPages <em>Gen Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Pages</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenPages()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EReference getGenJsfModel_GenPages();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenMenus <em>Gen Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Menus</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenMenus()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EReference getGenJsfModel_GenMenus();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getBaseURL <em>Base URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base URL</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getBaseURL()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EAttribute getGenJsfModel_BaseURL();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#isRewriteURLs <em>Rewrite UR Ls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rewrite UR Ls</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#isRewriteURLs()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EAttribute getGenJsfModel_RewriteURLs();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#isDevelopmentVersion <em>Development Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Development Version</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#isDevelopmentVersion()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EAttribute getGenJsfModel_DevelopmentVersion();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getTextEditorPath <em>Text Editor Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Editor Path</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getTextEditorPath()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EAttribute getGenJsfModel_TextEditorPath();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getBackingPackage <em>Backing Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backing Package</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getBackingPackage()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EAttribute getGenJsfModel_BackingPackage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getConverterPackage <em>Converter Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converter Package</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getConverterPackage()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EAttribute getGenJsfModel_ConverterPackage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getValidatorPackage <em>Validator Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validator Package</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getValidatorPackage()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EAttribute getGenJsfModel_ValidatorPackage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getServicePackage <em>Service Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Package</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getServicePackage()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EAttribute getGenJsfModel_ServicePackage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getSecurityPackage <em>Security Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Package</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getSecurityPackage()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EAttribute getGenJsfModel_SecurityPackage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getUiPackage <em>Ui Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Package</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getUiPackage()
	 * @see #getGenJsfModel()
	 * @generated
	 */
	EAttribute getGenJsfModel_UiPackage();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenAuthentication <em>Gen Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Authentication</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenAuthentication
	 * @generated
	 */
	EClass getGenAuthentication();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenCasAuthentication <em>Gen Cas Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Cas Authentication</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCasAuthentication
	 * @generated
	 */
	EClass getGenCasAuthentication();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenCasAuthentication#getJsfAuthentication <em>Jsf Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Authentication</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCasAuthentication#getJsfAuthentication()
	 * @see #getGenCasAuthentication()
	 * @generated
	 */
	EReference getGenCasAuthentication_JsfAuthentication();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem <em>Gen Local Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Local Authentication System</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem
	 * @generated
	 */
	EClass getGenLocalAuthenticationSystem();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getJsfAuthentication <em>Jsf Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Authentication</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getJsfAuthentication()
	 * @see #getGenLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getGenLocalAuthenticationSystem_JsfAuthentication();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenUserService <em>Gen User Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen User Service</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenUserService()
	 * @see #getGenLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getGenLocalAuthenticationSystem_GenUserService();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenUserAuthenticationKey <em>Gen User Authentication Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen User Authentication Key</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenUserAuthenticationKey()
	 * @see #getGenLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getGenLocalAuthenticationSystem_GenUserAuthenticationKey();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenAuthenticationService <em>Gen Authentication Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Authentication Service</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenAuthenticationService()
	 * @see #getGenLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getGenLocalAuthenticationSystem_GenAuthenticationService();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenLoginAttemptService <em>Gen Login Attempt Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Login Attempt Service</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenLoginAttemptService()
	 * @see #getGenLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getGenLocalAuthenticationSystem_GenLoginAttemptService();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenAutoLoginService <em>Gen Auto Login Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Auto Login Service</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenAutoLoginService()
	 * @see #getGenLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getGenLocalAuthenticationSystem_GenAutoLoginService();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenRegistrationUnit <em>Gen Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Registration Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenRegistrationUnit()
	 * @see #getGenLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getGenLocalAuthenticationSystem_GenRegistrationUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenLoginUnit <em>Gen Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Login Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenLoginUnit()
	 * @see #getGenLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getGenLocalAuthenticationSystem_GenLoginUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenForgottenPasswordUnit <em>Gen Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Forgotten Password Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getGenForgottenPasswordUnit()
	 * @see #getGenLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getGenLocalAuthenticationSystem_GenForgottenPasswordUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getLoginMaximumAttempts <em>Login Maximum Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login Maximum Attempts</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getLoginMaximumAttempts()
	 * @see #getGenLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getGenLocalAuthenticationSystem_LoginMaximumAttempts();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getLoginAttemptExpiryPeriod <em>Login Attempt Expiry Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login Attempt Expiry Period</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getLoginAttemptExpiryPeriod()
	 * @see #getGenLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getGenLocalAuthenticationSystem_LoginAttemptExpiryPeriod();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getAutologinCookieLifetime <em>Autologin Cookie Lifetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autologin Cookie Lifetime</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem#getAutologinCookieLifetime()
	 * @see #getGenLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getGenLocalAuthenticationSystem_AutologinCookieLifetime();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenService <em>Gen Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Service</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenService
	 * @generated
	 */
	EClass getGenService();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenService#getJsfService <em>Jsf Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Service</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenService#getJsfService()
	 * @see #getGenService()
	 * @generated
	 */
	EReference getGenService_JsfService();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenService#getGenEntities <em>Gen Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Entities</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenService#getGenEntities()
	 * @see #getGenService()
	 * @generated
	 */
	EReference getGenService_GenEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenService#getGenDisplayLabels <em>Gen Display Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Display Labels</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenService#getGenDisplayLabels()
	 * @see #getGenService()
	 * @generated
	 */
	EReference getGenService_GenDisplayLabels();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenService#getGenSelections <em>Gen Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Selections</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenService#getGenSelections()
	 * @see #getGenService()
	 * @generated
	 */
	EReference getGenService_GenSelections();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenService#getGenFeatures <em>Gen Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Features</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenService#getGenFeatures()
	 * @see #getGenService()
	 * @generated
	 */
	EReference getGenService_GenFeatures();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenService#getGenAccessedBy <em>Gen Accessed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Accessed By</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenService#getGenAccessedBy()
	 * @see #getGenService()
	 * @generated
	 */
	EReference getGenService_GenAccessedBy();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenService#getDefaultViewName <em>Default View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default View Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenService#getDefaultViewName()
	 * @see #getGenService()
	 * @generated
	 */
	EAttribute getGenService_DefaultViewName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenService#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenService#getViewName()
	 * @see #getGenService()
	 * @generated
	 */
	EAttribute getGenService_ViewName();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenModelLabel <em>Gen Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Model Label</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenModelLabel
	 * @generated
	 */
	EClass getGenModelLabel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenModelLabel#getGenLabelFor <em>Gen Label For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Label For</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenModelLabel#getGenLabelFor()
	 * @see #getGenModelLabel()
	 * @generated
	 */
	EReference getGenModelLabel_GenLabelFor();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenModelLabel#getJsfLabel <em>Jsf Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Label</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenModelLabel#getJsfLabel()
	 * @see #getGenModelLabel()
	 * @generated
	 */
	EReference getGenModelLabel_JsfLabel();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenModelLabel#getGenFeatures <em>Gen Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Features</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenModelLabel#getGenFeatures()
	 * @see #getGenModelLabel()
	 * @generated
	 */
	EReference getGenModelLabel_GenFeatures();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceFeature <em>Gen Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Service Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceFeature
	 * @generated
	 */
	EClass getGenServiceFeature();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceFeature#getGenIncludedBy <em>Gen Included By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Included By</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceFeature#getGenIncludedBy()
	 * @see #getGenServiceFeature()
	 * @generated
	 */
	EReference getGenServiceFeature_GenIncludedBy();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityFeature <em>Gen Service Entity Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Service Entity Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceEntityFeature
	 * @generated
	 */
	EClass getGenServiceEntityFeature();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityFeature#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceEntityFeature#getColumnName()
	 * @see #getGenServiceEntityFeature()
	 * @generated
	 */
	EAttribute getGenServiceEntityFeature_ColumnName();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement <em>Gen Service Entity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Service Entity Element</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement
	 * @generated
	 */
	EClass getGenServiceEntityElement();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement#getJsfFeature <em>Jsf Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement#getJsfFeature()
	 * @see #getGenServiceEntityElement()
	 * @generated
	 */
	EReference getGenServiceEntityElement_JsfFeature();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement#getGenFeature <em>Gen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement#getGenFeature()
	 * @see #getGenServiceEntityElement()
	 * @generated
	 */
	EReference getGenServiceEntityElement_GenFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceAssociation <em>Gen Service Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Service Association</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceAssociation
	 * @generated
	 */
	EClass getGenServiceAssociation();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityAssociation <em>Gen Service Entity Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Service Entity Association</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceEntityAssociation
	 * @generated
	 */
	EClass getGenServiceEntityAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityAssociation#getJsfFeature <em>Jsf Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceEntityAssociation#getJsfFeature()
	 * @see #getGenServiceEntityAssociation()
	 * @generated
	 */
	EReference getGenServiceEntityAssociation_JsfFeature();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityAssociation#getGenFeature <em>Gen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceEntityAssociation#getGenFeature()
	 * @see #getGenServiceEntityAssociation()
	 * @generated
	 */
	EReference getGenServiceEntityAssociation_GenFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceViewAssociation <em>Gen Service View Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Service View Association</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceViewAssociation
	 * @generated
	 */
	EClass getGenServiceViewAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceViewAssociation#getJsfFeature <em>Jsf Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceViewAssociation#getJsfFeature()
	 * @see #getGenServiceViewAssociation()
	 * @generated
	 */
	EReference getGenServiceViewAssociation_JsfFeature();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceViewAssociation#getGenTargetFeature <em>Gen Target Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Target Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceViewAssociation#getGenTargetFeature()
	 * @see #getGenServiceViewAssociation()
	 * @generated
	 */
	EReference getGenServiceViewAssociation_GenTargetFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenSelection <em>Gen Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSelection
	 * @generated
	 */
	EClass getGenSelection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenSelection#getJsfSelection <em>Jsf Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSelection#getJsfSelection()
	 * @see #getGenSelection()
	 * @generated
	 */
	EReference getGenSelection_JsfSelection();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.genjsf.GenSelection#getGenFilter <em>Gen Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Filter</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSelection#getGenFilter()
	 * @see #getGenSelection()
	 * @generated
	 */
	EReference getGenSelection_GenFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenSelection#getGenOrdering <em>Gen Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Ordering</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSelection#getGenOrdering()
	 * @see #getGenSelection()
	 * @generated
	 */
	EReference getGenSelection_GenOrdering();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature <em>Gen Included Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Included Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature
	 * @generated
	 */
	EClass getGenIncludedFeature();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature#getGenForcedValue <em>Gen Forced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Forced Value</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature#getGenForcedValue()
	 * @see #getGenIncludedFeature()
	 * @generated
	 */
	EReference getGenIncludedFeature_GenForcedValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature#getMessageDisplayOption <em>Message Display Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Display Option</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature#getMessageDisplayOption()
	 * @see #getGenIncludedFeature()
	 * @generated
	 */
	EAttribute getGenIncludedFeature_MessageDisplayOption();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedElement <em>Gen Included Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Included Element</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedElement
	 * @generated
	 */
	EClass getGenIncludedElement();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedElement#getGenDefaultValue <em>Gen Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Default Value</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedElement#getGenDefaultValue()
	 * @see #getGenIncludedElement()
	 * @generated
	 */
	EReference getGenIncludedElement_GenDefaultValue();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedAssociation <em>Gen Included Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Included Association</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedAssociation
	 * @generated
	 */
	EClass getGenIncludedAssociation();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenPage <em>Gen Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Page</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenPage
	 * @generated
	 */
	EClass getGenPage();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getJsfPage <em>Jsf Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Page</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenPage#getJsfPage()
	 * @see #getGenPage()
	 * @generated
	 */
	EReference getGenPage_JsfPage();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getGenPartOf <em>Gen Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenPage#getGenPartOf()
	 * @see #getGenPage()
	 * @generated
	 */
	EReference getGenPage_GenPartOf();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getGenParentPage <em>Gen Parent Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Parent Page</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenPage#getGenParentPage()
	 * @see #getGenPage()
	 * @generated
	 */
	EReference getGenPage_GenParentPage();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getGenChildPages <em>Gen Child Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Child Pages</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenPage#getGenChildPages()
	 * @see #getGenPage()
	 * @generated
	 */
	EReference getGenPage_GenChildPages();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getGenSideMenu <em>Gen Side Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Side Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenPage#getGenSideMenu()
	 * @see #getGenPage()
	 * @generated
	 */
	EReference getGenPage_GenSideMenu();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenSelectTarget <em>Gen Select Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Select Target</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSelectTarget
	 * @generated
	 */
	EClass getGenSelectTarget();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenSelectTarget#getGenTargettingActions <em>Gen Targetting Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Targetting Actions</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSelectTarget#getGenTargettingActions()
	 * @see #getGenSelectTarget()
	 * @generated
	 */
	EReference getGenSelectTarget_GenTargettingActions();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenMenu <em>Gen Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMenu
	 * @generated
	 */
	EClass getGenMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenMenu#getGenEntries <em>Gen Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Entries</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMenu#getGenEntries()
	 * @see #getGenMenu()
	 * @generated
	 */
	EReference getGenMenu_GenEntries();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenMenuEntry <em>Gen Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMenuEntry
	 * @generated
	 */
	EClass getGenMenuEntry();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.genjsf.GenMenuEntry#getGenPartOf <em>Gen Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMenuEntry#getGenPartOf()
	 * @see #getGenMenuEntry()
	 * @generated
	 */
	EReference getGenMenuEntry_GenPartOf();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenStaticMenu <em>Gen Static Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Static Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenStaticMenu
	 * @generated
	 */
	EClass getGenStaticMenu();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenStaticMenu#getJsfMenu <em>Jsf Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenStaticMenu#getJsfMenu()
	 * @see #getGenStaticMenu()
	 * @generated
	 */
	EReference getGenStaticMenu_JsfMenu();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedPageMenuEntry <em>Gen Fixed Page Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Fixed Page Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFixedPageMenuEntry
	 * @generated
	 */
	EClass getGenFixedPageMenuEntry();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedPageMenuEntry#getJsfMenuEntry <em>Jsf Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFixedPageMenuEntry#getJsfMenuEntry()
	 * @see #getGenFixedPageMenuEntry()
	 * @generated
	 */
	EReference getGenFixedPageMenuEntry_JsfMenuEntry();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedPageMenuEntry#getGenDestination <em>Gen Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFixedPageMenuEntry#getGenDestination()
	 * @see #getGenFixedPageMenuEntry()
	 * @generated
	 */
	EReference getGenFixedPageMenuEntry_GenDestination();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedActionMenuEntry <em>Gen Fixed Action Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Fixed Action Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFixedActionMenuEntry
	 * @generated
	 */
	EClass getGenFixedActionMenuEntry();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedActionMenuEntry#getJsfMenuEntry <em>Jsf Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFixedActionMenuEntry#getJsfMenuEntry()
	 * @see #getGenFixedActionMenuEntry()
	 * @generated
	 */
	EReference getGenFixedActionMenuEntry_JsfMenuEntry();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedActionMenuEntry#getGenDestination <em>Gen Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFixedActionMenuEntry#getGenDestination()
	 * @see #getGenFixedActionMenuEntry()
	 * @generated
	 */
	EReference getGenFixedActionMenuEntry_GenDestination();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedCommandMenuEntry <em>Gen Fixed Command Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Fixed Command Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFixedCommandMenuEntry
	 * @generated
	 */
	EClass getGenFixedCommandMenuEntry();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedCommandMenuEntry#getJsfMenuEntry <em>Jsf Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFixedCommandMenuEntry#getJsfMenuEntry()
	 * @see #getGenFixedCommandMenuEntry()
	 * @generated
	 */
	EReference getGenFixedCommandMenuEntry_JsfMenuEntry();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedCommandMenuEntry#getGenDestination <em>Gen Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFixedCommandMenuEntry#getGenDestination()
	 * @see #getGenFixedCommandMenuEntry()
	 * @generated
	 */
	EReference getGenFixedCommandMenuEntry_GenDestination();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenEditStaticTextMenuEntry <em>Gen Edit Static Text Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Edit Static Text Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenEditStaticTextMenuEntry
	 * @generated
	 */
	EClass getGenEditStaticTextMenuEntry();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenEditStaticTextMenuEntry#getJsfMenuEntry <em>Jsf Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenEditStaticTextMenuEntry#getJsfMenuEntry()
	 * @see #getGenEditStaticTextMenuEntry()
	 * @generated
	 */
	EReference getGenEditStaticTextMenuEntry_JsfMenuEntry();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedFeature <em>Gen Menu Included Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Menu Included Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedFeature
	 * @generated
	 */
	EClass getGenMenuIncludedFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedElement <em>Gen Menu Included Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Menu Included Element</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedElement
	 * @generated
	 */
	EClass getGenMenuIncludedElement();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedElement#getJsfMenuEntry <em>Jsf Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Menu Entry</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedElement#getJsfMenuEntry()
	 * @see #getGenMenuIncludedElement()
	 * @generated
	 */
	EReference getGenMenuIncludedElement_JsfMenuEntry();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu <em>Gen Dynamic Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Dynamic Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu
	 * @generated
	 */
	EClass getGenDynamicMenu();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getJsfMenu <em>Jsf Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Menu</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getJsfMenu()
	 * @see #getGenDynamicMenu()
	 * @generated
	 */
	EReference getGenDynamicMenu_JsfMenu();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getGenService <em>Gen Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Service</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getGenService()
	 * @see #getGenDynamicMenu()
	 * @generated
	 */
	EReference getGenDynamicMenu_GenService();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getGenSelection <em>Gen Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getGenSelection()
	 * @see #getGenDynamicMenu()
	 * @generated
	 */
	EReference getGenDynamicMenu_GenSelection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getGenDynamicTitle <em>Gen Dynamic Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Dynamic Title</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu#getGenDynamicTitle()
	 * @see #getGenDynamicMenu()
	 * @generated
	 */
	EReference getGenDynamicMenu_GenDynamicTitle();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitContainer <em>Gen Unit Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Unit Container</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitContainer
	 * @generated
	 */
	EClass getGenUnitContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitContainer#getGenUnits <em>Gen Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Units</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitContainer#getGenUnits()
	 * @see #getGenUnitContainer()
	 * @generated
	 */
	EReference getGenUnitContainer_GenUnits();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitTitle <em>Gen Unit Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Unit Title</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitTitle
	 * @generated
	 */
	EClass getGenUnitTitle();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenContentUnit <em>Gen Content Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Content Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenContentUnit
	 * @generated
	 */
	EClass getGenContentUnit();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.genjsf.GenContentUnit#getGenDisplayedOn <em>Gen Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Displayed On</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenContentUnit#getGenDisplayedOn()
	 * @see #getGenContentUnit()
	 * @generated
	 */
	EReference getGenContentUnit_GenDisplayedOn();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenCreateSitemapUnit <em>Gen Create Sitemap Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Create Sitemap Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCreateSitemapUnit
	 * @generated
	 */
	EClass getGenCreateSitemapUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenCreateSitemapUnit#getJsfUnit <em>Jsf Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCreateSitemapUnit#getJsfUnit()
	 * @see #getGenCreateSitemapUnit()
	 * @generated
	 */
	EReference getGenCreateSitemapUnit_JsfUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitField <em>Gen Unit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Unit Field</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitField
	 * @generated
	 */
	EClass getGenUnitField();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitField#getGenDisplayedOn <em>Gen Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Displayed On</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitField#getGenDisplayedOn()
	 * @see #getGenUnitField()
	 * @generated
	 */
	EReference getGenUnitField_GenDisplayedOn();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitFeature <em>Gen Unit Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Unit Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitFeature
	 * @generated
	 */
	EClass getGenUnitFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitElement <em>Gen Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Unit Element</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitElement
	 * @generated
	 */
	EClass getGenUnitElement();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitElement#getJsfFeature <em>Jsf Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitElement#getJsfFeature()
	 * @see #getGenUnitElement()
	 * @generated
	 */
	EReference getGenUnitElement_JsfFeature();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitElement#getGenServiceFeature <em>Gen Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Service Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitElement#getGenServiceFeature()
	 * @see #getGenUnitElement()
	 * @generated
	 */
	EReference getGenUnitElement_GenServiceFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation <em>Gen Unit Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Unit Association</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation
	 * @generated
	 */
	EClass getGenUnitAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getJsfFeature <em>Jsf Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getJsfFeature()
	 * @see #getGenUnitAssociation()
	 * @generated
	 */
	EReference getGenUnitAssociation_JsfFeature();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenServiceFeature <em>Gen Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Service Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenServiceFeature()
	 * @see #getGenUnitAssociation()
	 * @generated
	 */
	EReference getGenUnitAssociation_GenServiceFeature();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenChildFeature <em>Gen Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Child Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenChildFeature()
	 * @see #getGenUnitAssociation()
	 * @generated
	 */
	EReference getGenUnitAssociation_GenChildFeature();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenSelection <em>Gen Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenSelection()
	 * @see #getGenUnitAssociation()
	 * @generated
	 */
	EReference getGenUnitAssociation_GenSelection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenDynamicLabel <em>Gen Dynamic Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Dynamic Label</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenDynamicLabel()
	 * @see #getGenUnitAssociation()
	 * @generated
	 */
	EReference getGenUnitAssociation_GenDynamicLabel();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenFilters <em>Gen Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Filters</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenFilters()
	 * @see #getGenUnitAssociation()
	 * @generated
	 */
	EReference getGenUnitAssociation_GenFilters();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getSelectOneOfOption <em>Select One Of Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select One Of Option</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getSelectOneOfOption()
	 * @see #getGenUnitAssociation()
	 * @generated
	 */
	EAttribute getGenUnitAssociation_SelectOneOfOption();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getSelectManyOption <em>Select Many Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Many Option</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getSelectManyOption()
	 * @see #getGenUnitAssociation()
	 * @generated
	 */
	EAttribute getGenUnitAssociation_SelectManyOption();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildFeature <em>Gen Unit Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Unit Child Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitChildFeature
	 * @generated
	 */
	EClass getGenUnitChildFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildElement <em>Gen Unit Child Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Unit Child Element</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitChildElement
	 * @generated
	 */
	EClass getGenUnitChildElement();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildElement#getJsfChildFeature <em>Jsf Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Child Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitChildElement#getJsfChildFeature()
	 * @see #getGenUnitChildElement()
	 * @generated
	 */
	EReference getGenUnitChildElement_JsfChildFeature();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildElement#getGenServiceFeature <em>Gen Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Service Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitChildElement#getGenServiceFeature()
	 * @see #getGenUnitChildElement()
	 * @generated
	 */
	EReference getGenUnitChildElement_GenServiceFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation <em>Gen Unit Child Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Unit Child Association</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation
	 * @generated
	 */
	EClass getGenUnitChildAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation#getJsfChildFeature <em>Jsf Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Child Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation#getJsfChildFeature()
	 * @see #getGenUnitChildAssociation()
	 * @generated
	 */
	EReference getGenUnitChildAssociation_JsfChildFeature();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation#getGenServiceFeature <em>Gen Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Service Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation#getGenServiceFeature()
	 * @see #getGenUnitChildAssociation()
	 * @generated
	 */
	EReference getGenUnitChildAssociation_GenServiceFeature();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation#getGenChildFeature <em>Gen Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Child Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation#getGenChildFeature()
	 * @see #getGenUnitChildAssociation()
	 * @generated
	 */
	EReference getGenUnitChildAssociation_GenChildFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenInterfaceField <em>Gen Interface Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Interface Field</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenInterfaceField
	 * @generated
	 */
	EClass getGenInterfaceField();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenInterfaceField#getGenMustMatch <em>Gen Must Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Must Match</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenInterfaceField#getGenMustMatch()
	 * @see #getGenInterfaceField()
	 * @generated
	 */
	EReference getGenInterfaceField_GenMustMatch();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.genjsf.GenInterfaceField#getGenDefaultValue <em>Gen Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Default Value</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenInterfaceField#getGenDefaultValue()
	 * @see #getGenInterfaceField()
	 * @generated
	 */
	EReference getGenInterfaceField_GenDefaultValue();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenDataTypeField <em>Gen Data Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Data Type Field</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDataTypeField
	 * @generated
	 */
	EClass getGenDataTypeField();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenDataTypeField#getGenDataType <em>Gen Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Data Type</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDataTypeField#getGenDataType()
	 * @see #getGenDataTypeField()
	 * @generated
	 */
	EReference getGenDataTypeField_GenDataType();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenDataTypeField#getJsfField <em>Jsf Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Field</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDataTypeField#getJsfField()
	 * @see #getGenDataTypeField()
	 * @generated
	 */
	EReference getGenDataTypeField_JsfField();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenDateField <em>Gen Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Date Field</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDateField
	 * @generated
	 */
	EClass getGenDateField();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenDateField#getJsfField <em>Jsf Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Field</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDateField#getJsfField()
	 * @see #getGenDateField()
	 * @generated
	 */
	EReference getGenDateField_JsfField();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenCaptchaField <em>Gen Captcha Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Captcha Field</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCaptchaField
	 * @generated
	 */
	EClass getGenCaptchaField();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenCaptchaField#getJsfField <em>Jsf Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Field</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCaptchaField#getJsfField()
	 * @see #getGenCaptchaField()
	 * @generated
	 */
	EReference getGenCaptchaField_JsfField();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitSupportAction <em>Gen Unit Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Unit Support Action</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitSupportAction
	 * @generated
	 */
	EClass getGenUnitSupportAction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitSupportAction#getJsfAction <em>Jsf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Action</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitSupportAction#getJsfAction()
	 * @see #getGenUnitSupportAction()
	 * @generated
	 */
	EReference getGenUnitSupportAction_JsfAction();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenStaticUnit <em>Gen Static Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Static Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenStaticUnit
	 * @generated
	 */
	EClass getGenStaticUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenStaticUnit#getJsfUnit <em>Jsf Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenStaticUnit#getJsfUnit()
	 * @see #getGenStaticUnit()
	 * @generated
	 */
	EReference getGenStaticUnit_JsfUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenStaticUnit#getGenService <em>Gen Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Service</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenStaticUnit#getGenService()
	 * @see #getGenStaticUnit()
	 * @generated
	 */
	EReference getGenStaticUnit_GenService();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenCommandUnit <em>Gen Command Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Command Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCommandUnit
	 * @generated
	 */
	EClass getGenCommandUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenCommandUnit#getJsfUnit <em>Jsf Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCommandUnit#getJsfUnit()
	 * @see #getGenCommandUnit()
	 * @generated
	 */
	EReference getGenCommandUnit_JsfUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenCommandUnit#getGenCommands <em>Gen Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Commands</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCommandUnit#getGenCommands()
	 * @see #getGenCommandUnit()
	 * @generated
	 */
	EReference getGenCommandUnit_GenCommands();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenCommand <em>Gen Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Command</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCommand
	 * @generated
	 */
	EClass getGenCommand();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.genjsf.GenCommand#getGenPartOf <em>Gen Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCommand#getGenPartOf()
	 * @see #getGenCommand()
	 * @generated
	 */
	EReference getGenCommand_GenPartOf();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenUserCommand <em>Gen User Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen User Command</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUserCommand
	 * @generated
	 */
	EClass getGenUserCommand();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUserCommand#getJsfCommand <em>Jsf Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Command</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUserCommand#getJsfCommand()
	 * @see #getGenUserCommand()
	 * @generated
	 */
	EReference getGenUserCommand_JsfCommand();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit <em>Gen Dynamic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Dynamic Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit
	 * @generated
	 */
	EClass getGenDynamicUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit#getGenService <em>Gen Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Service</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit#getGenService()
	 * @see #getGenDynamicUnit()
	 * @generated
	 */
	EReference getGenDynamicUnit_GenService();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit#getGenDisplayFields <em>Gen Display Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Display Fields</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit#getGenDisplayFields()
	 * @see #getGenDynamicUnit()
	 * @generated
	 */
	EReference getGenDynamicUnit_GenDisplayFields();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit#getGenSupportActions <em>Gen Support Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Support Actions</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit#getGenSupportActions()
	 * @see #getGenDynamicUnit()
	 * @generated
	 */
	EReference getGenDynamicUnit_GenSupportActions();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenEditUnit <em>Gen Edit Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Edit Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenEditUnit
	 * @generated
	 */
	EClass getGenEditUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getMessagePlacementOption <em>Message Placement Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Placement Option</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getMessagePlacementOption()
	 * @see #getGenEditUnit()
	 * @generated
	 */
	EAttribute getGenEditUnit_MessagePlacementOption();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getFormMessageDisplayOption <em>Form Message Display Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form Message Display Option</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getFormMessageDisplayOption()
	 * @see #getGenEditUnit()
	 * @generated
	 */
	EAttribute getGenEditUnit_FormMessageDisplayOption();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getGenConfirmDestination <em>Gen Confirm Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Confirm Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getGenConfirmDestination()
	 * @see #getGenEditUnit()
	 * @generated
	 */
	EReference getGenEditUnit_GenConfirmDestination();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getGenCancelDestination <em>Gen Cancel Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Cancel Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenEditUnit#getGenCancelDestination()
	 * @see #getGenEditUnit()
	 * @generated
	 */
	EReference getGenEditUnit_GenCancelDestination();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenCreateUnit <em>Gen Create Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Create Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCreateUnit
	 * @generated
	 */
	EClass getGenCreateUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenCreateUnit#getJsfUnit <em>Jsf Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCreateUnit#getJsfUnit()
	 * @see #getGenCreateUnit()
	 * @generated
	 */
	EReference getGenCreateUnit_JsfUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenCreateUpdateUnit <em>Gen Create Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Create Update Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCreateUpdateUnit
	 * @generated
	 */
	EClass getGenCreateUpdateUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenCreateUpdateUnit#getJsfUnit <em>Jsf Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCreateUpdateUnit#getJsfUnit()
	 * @see #getGenCreateUpdateUnit()
	 * @generated
	 */
	EReference getGenCreateUpdateUnit_JsfUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenMapUnit <em>Gen Map Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Map Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMapUnit
	 * @generated
	 */
	EClass getGenMapUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenMapUnit#getJsfUnit <em>Jsf Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMapUnit#getJsfUnit()
	 * @see #getGenMapUnit()
	 * @generated
	 */
	EReference getGenMapUnit_JsfUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenMapUnit#getGenLocation <em>Gen Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Location</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMapUnit#getGenLocation()
	 * @see #getGenMapUnit()
	 * @generated
	 */
	EReference getGenMapUnit_GenLocation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenMapUnit#getGenPlaceName <em>Gen Place Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Place Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMapUnit#getGenPlaceName()
	 * @see #getGenMapUnit()
	 * @generated
	 */
	EReference getGenMapUnit_GenPlaceName();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenUpdateUnit <em>Gen Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Update Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUpdateUnit
	 * @generated
	 */
	EClass getGenUpdateUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenUpdateUnit#getJsfUnit <em>Jsf Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUpdateUnit#getJsfUnit()
	 * @see #getGenUpdateUnit()
	 * @generated
	 */
	EReference getGenUpdateUnit_JsfUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenDataUnit <em>Gen Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Data Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDataUnit
	 * @generated
	 */
	EClass getGenDataUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenDataUnit#getGenSelection <em>Gen Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDataUnit#getGenSelection()
	 * @see #getGenDataUnit()
	 * @generated
	 */
	EReference getGenDataUnit_GenSelection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenDataUnit#getGenDynamicTitle <em>Gen Dynamic Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Dynamic Title</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDataUnit#getGenDynamicTitle()
	 * @see #getGenDataUnit()
	 * @generated
	 */
	EReference getGenDataUnit_GenDynamicTitle();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenDetailsUnit <em>Gen Details Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Details Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDetailsUnit
	 * @generated
	 */
	EClass getGenDetailsUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenDetailsUnit#getJsfUnit <em>Jsf Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDetailsUnit#getJsfUnit()
	 * @see #getGenDetailsUnit()
	 * @generated
	 */
	EReference getGenDetailsUnit_JsfUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenIndexUnit <em>Gen Index Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Index Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIndexUnit
	 * @generated
	 */
	EClass getGenIndexUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenIndexUnit#getJsfUnit <em>Jsf Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIndexUnit#getJsfUnit()
	 * @see #getGenIndexUnit()
	 * @generated
	 */
	EReference getGenIndexUnit_JsfUnit();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenIndexUnit#getGenTargettingSearches <em>Gen Targetting Searches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Targetting Searches</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIndexUnit#getGenTargettingSearches()
	 * @see #getGenIndexUnit()
	 * @generated
	 */
	EReference getGenIndexUnit_GenTargettingSearches();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenIndexGridUnit <em>Gen Index Grid Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Index Grid Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIndexGridUnit
	 * @generated
	 */
	EClass getGenIndexGridUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenIndexPageDirectionUnit <em>Gen Index Page Direction Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Index Page Direction Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIndexPageDirectionUnit
	 * @generated
	 */
	EClass getGenIndexPageDirectionUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenIndexLineDirectionUnit <em>Gen Index Line Direction Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Index Line Direction Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIndexLineDirectionUnit
	 * @generated
	 */
	EClass getGenIndexLineDirectionUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenControlUnit <em>Gen Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Control Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenControlUnit
	 * @generated
	 */
	EClass getGenControlUnit();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genjsf.GenControlUnit#getMessagePlacementOption <em>Message Placement Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Placement Option</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenControlUnit#getMessagePlacementOption()
	 * @see #getGenControlUnit()
	 * @generated
	 */
	EAttribute getGenControlUnit_MessagePlacementOption();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenControlUnit#getGenCancelDestination <em>Gen Cancel Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Cancel Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenControlUnit#getGenCancelDestination()
	 * @see #getGenControlUnit()
	 * @generated
	 */
	EReference getGenControlUnit_GenCancelDestination();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenSearchUnit <em>Gen Search Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Search Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSearchUnit
	 * @generated
	 */
	EClass getGenSearchUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenSearchUnit#getJsfUnit <em>Jsf Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSearchUnit#getJsfUnit()
	 * @see #getGenSearchUnit()
	 * @generated
	 */
	EReference getGenSearchUnit_JsfUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenSearchUnit#getGenResultDestination <em>Gen Result Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Result Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSearchUnit#getGenResultDestination()
	 * @see #getGenSearchUnit()
	 * @generated
	 */
	EReference getGenSearchUnit_GenResultDestination();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenActionUnit <em>Gen Action Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Action Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenActionUnit
	 * @generated
	 */
	EClass getGenActionUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenActionUnit#getJsfUnit <em>Jsf Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenActionUnit#getJsfUnit()
	 * @see #getGenActionUnit()
	 * @generated
	 */
	EReference getGenActionUnit_JsfUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenAuthenticationUnit <em>Gen Authentication Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Authentication Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenAuthenticationUnit
	 * @generated
	 */
	EClass getGenAuthenticationUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit <em>Gen Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Registration Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit
	 * @generated
	 */
	EClass getGenRegistrationUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit#getJsfUnit <em>Jsf Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit#getJsfUnit()
	 * @see #getGenRegistrationUnit()
	 * @generated
	 */
	EReference getGenRegistrationUnit_JsfUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit#getGenAuthenticationSystem <em>Gen Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Authentication System</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit#getGenAuthenticationSystem()
	 * @see #getGenRegistrationUnit()
	 * @generated
	 */
	EReference getGenRegistrationUnit_GenAuthenticationSystem();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit <em>Gen Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Login Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLoginUnit
	 * @generated
	 */
	EClass getGenLoginUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getJsfUnit <em>Jsf Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getJsfUnit()
	 * @see #getGenLoginUnit()
	 * @generated
	 */
	EReference getGenLoginUnit_JsfUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenAuthenticationSystem <em>Gen Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Authentication System</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenAuthenticationSystem()
	 * @see #getGenLoginUnit()
	 * @generated
	 */
	EReference getGenLoginUnit_GenAuthenticationSystem();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenLoginIdField <em>Gen Login Id Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Login Id Field</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenLoginIdField()
	 * @see #getGenLoginUnit()
	 * @generated
	 */
	EReference getGenLoginUnit_GenLoginIdField();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenPasswordField <em>Gen Password Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Password Field</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenPasswordField()
	 * @see #getGenLoginUnit()
	 * @generated
	 */
	EReference getGenLoginUnit_GenPasswordField();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenRememberMeField <em>Gen Remember Me Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Remember Me Field</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLoginUnit#getGenRememberMeField()
	 * @see #getGenLoginUnit()
	 * @generated
	 */
	EReference getGenLoginUnit_GenRememberMeField();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit <em>Gen Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Forgotten Password Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit
	 * @generated
	 */
	EClass getGenForgottenPasswordUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit#getJsfUnit <em>Jsf Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit#getJsfUnit()
	 * @see #getGenForgottenPasswordUnit()
	 * @generated
	 */
	EReference getGenForgottenPasswordUnit_JsfUnit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit#getGenAuthenticationSystem <em>Gen Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Authentication System</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit#getGenAuthenticationSystem()
	 * @see #getGenForgottenPasswordUnit()
	 * @generated
	 */
	EReference getGenForgottenPasswordUnit_GenAuthenticationSystem();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit#getGenLoginIdField <em>Gen Login Id Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Login Id Field</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit#getGenLoginIdField()
	 * @see #getGenForgottenPasswordUnit()
	 * @generated
	 */
	EReference getGenForgottenPasswordUnit_GenLoginIdField();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer <em>Gen Inline Action Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Inline Action Container</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer
	 * @generated
	 */
	EClass getGenInlineActionContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer#getGenActions <em>Gen Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Actions</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer#getGenActions()
	 * @see #getGenInlineActionContainer()
	 * @generated
	 */
	EReference getGenInlineActionContainer_GenActions();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenInlineAction <em>Gen Inline Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Inline Action</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenInlineAction
	 * @generated
	 */
	EClass getGenInlineAction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenInlineAction#getJsfAction <em>Jsf Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsf Action</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenInlineAction#getJsfAction()
	 * @see #getGenInlineAction()
	 * @generated
	 */
	EReference getGenInlineAction_JsfAction();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.genjsf.GenInlineAction#getGenUsedBy <em>Gen Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Used By</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenInlineAction#getGenUsedBy()
	 * @see #getGenInlineAction()
	 * @generated
	 */
	EReference getGenInlineAction_GenUsedBy();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenSelectAction <em>Gen Select Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Select Action</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSelectAction
	 * @generated
	 */
	EClass getGenSelectAction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenSelectAction#getGenTarget <em>Gen Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Target</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSelectAction#getGenTarget()
	 * @see #getGenSelectAction()
	 * @generated
	 */
	EReference getGenSelectAction_GenTarget();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenDeleteAction <em>Gen Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Delete Action</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDeleteAction
	 * @generated
	 */
	EClass getGenDeleteAction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenDeleteAction#getGenDestination <em>Gen Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Destination</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDeleteAction#getGenDestination()
	 * @see #getGenDeleteAction()
	 * @generated
	 */
	EReference getGenDeleteAction_GenDestination();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenFeatureSupportAction <em>Gen Feature Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Feature Support Action</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFeatureSupportAction
	 * @generated
	 */
	EClass getGenFeatureSupportAction();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenFeatureReference <em>Gen Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Feature Reference</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFeatureReference
	 * @generated
	 */
	EClass getGenFeatureReference();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenFeatureReference#getCriteriaPath <em>Criteria Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Path</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFeatureReference#getCriteriaPath()
	 * @see #getGenFeatureReference()
	 * @generated
	 */
	EReference getGenFeatureReference_CriteriaPath();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenFeatureReference#getGenField <em>Gen Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Field</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFeatureReference#getGenField()
	 * @see #getGenFeatureReference()
	 * @generated
	 */
	EReference getGenFeatureReference_GenField();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenModelReference <em>Gen Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Model Reference</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenModelReference
	 * @generated
	 */
	EClass getGenModelReference();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenModelReference#getCriteriaPath <em>Criteria Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Path</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenModelReference#getCriteriaPath()
	 * @see #getGenModelReference()
	 * @generated
	 */
	EReference getGenModelReference_CriteriaPath();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenModelReference#getGenUnit <em>Gen Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Unit</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenModelReference#getGenUnit()
	 * @see #getGenModelReference()
	 * @generated
	 */
	EReference getGenModelReference_GenUnit();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genjsf.GenCurrentUserReference <em>Gen Current User Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Current User Reference</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCurrentUserReference
	 * @generated
	 */
	EClass getGenCurrentUserReference();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genjsf.GenCurrentUserReference#getCriteriaPath <em>Criteria Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria Path</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCurrentUserReference#getCriteriaPath()
	 * @see #getGenCurrentUserReference()
	 * @generated
	 */
	EReference getGenCurrentUserReference_CriteriaPath();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.genjsf.SelectOneofOptions <em>Select Oneof Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Select Oneof Options</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.SelectOneofOptions
	 * @generated
	 */
	EEnum getSelectOneofOptions();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.genjsf.SelectManyOptions <em>Select Many Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Select Many Options</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.SelectManyOptions
	 * @generated
	 */
	EEnum getSelectManyOptions();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.genjsf.InputMessagePlacementOptions <em>Input Message Placement Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input Message Placement Options</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.InputMessagePlacementOptions
	 * @generated
	 */
	EEnum getInputMessagePlacementOptions();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions <em>Input Message Display Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input Message Display Options</em>'.
	 * @see uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions
	 * @generated
	 */
	EEnum getInputMessageDisplayOptions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenJsfFactory getGenJsfFactory();

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
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfModelImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenJsfModel()
		 * @generated
		 */
		EClass GEN_JSF_MODEL = eINSTANCE.getGenJsfModel();

		/**
		 * The meta object literal for the '<em><b>Jsf Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_JSF_MODEL__JSF_MODEL = eINSTANCE.getGenJsfModel_JsfModel();

		/**
		 * The meta object literal for the '<em><b>Gen Authentication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_JSF_MODEL__GEN_AUTHENTICATION = eINSTANCE.getGenJsfModel_GenAuthentication();

		/**
		 * The meta object literal for the '<em><b>Gen Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_JSF_MODEL__GEN_SERVICES = eINSTANCE.getGenJsfModel_GenServices();

		/**
		 * The meta object literal for the '<em><b>Gen Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_JSF_MODEL__GEN_PAGES = eINSTANCE.getGenJsfModel_GenPages();

		/**
		 * The meta object literal for the '<em><b>Gen Menus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_JSF_MODEL__GEN_MENUS = eINSTANCE.getGenJsfModel_GenMenus();

		/**
		 * The meta object literal for the '<em><b>Base URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_JSF_MODEL__BASE_URL = eINSTANCE.getGenJsfModel_BaseURL();

		/**
		 * The meta object literal for the '<em><b>Rewrite UR Ls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_JSF_MODEL__REWRITE_UR_LS = eINSTANCE.getGenJsfModel_RewriteURLs();

		/**
		 * The meta object literal for the '<em><b>Development Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_JSF_MODEL__DEVELOPMENT_VERSION = eINSTANCE.getGenJsfModel_DevelopmentVersion();

		/**
		 * The meta object literal for the '<em><b>Text Editor Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_JSF_MODEL__TEXT_EDITOR_PATH = eINSTANCE.getGenJsfModel_TextEditorPath();

		/**
		 * The meta object literal for the '<em><b>Backing Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_JSF_MODEL__BACKING_PACKAGE = eINSTANCE.getGenJsfModel_BackingPackage();

		/**
		 * The meta object literal for the '<em><b>Converter Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_JSF_MODEL__CONVERTER_PACKAGE = eINSTANCE.getGenJsfModel_ConverterPackage();

		/**
		 * The meta object literal for the '<em><b>Validator Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_JSF_MODEL__VALIDATOR_PACKAGE = eINSTANCE.getGenJsfModel_ValidatorPackage();

		/**
		 * The meta object literal for the '<em><b>Service Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_JSF_MODEL__SERVICE_PACKAGE = eINSTANCE.getGenJsfModel_ServicePackage();

		/**
		 * The meta object literal for the '<em><b>Security Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_JSF_MODEL__SECURITY_PACKAGE = eINSTANCE.getGenJsfModel_SecurityPackage();

		/**
		 * The meta object literal for the '<em><b>Ui Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_JSF_MODEL__UI_PACKAGE = eINSTANCE.getGenJsfModel_UiPackage();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenAuthenticationImpl <em>Gen Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenAuthenticationImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenAuthentication()
		 * @generated
		 */
		EClass GEN_AUTHENTICATION = eINSTANCE.getGenAuthentication();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCasAuthenticationImpl <em>Gen Cas Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCasAuthenticationImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCasAuthentication()
		 * @generated
		 */
		EClass GEN_CAS_AUTHENTICATION = eINSTANCE.getGenCasAuthentication();

		/**
		 * The meta object literal for the '<em><b>Jsf Authentication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CAS_AUTHENTICATION__JSF_AUTHENTICATION = eINSTANCE.getGenCasAuthentication_JsfAuthentication();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl <em>Gen Local Authentication System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenLocalAuthenticationSystemImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenLocalAuthenticationSystem()
		 * @generated
		 */
		EClass GEN_LOCAL_AUTHENTICATION_SYSTEM = eINSTANCE.getGenLocalAuthenticationSystem();

		/**
		 * The meta object literal for the '<em><b>Jsf Authentication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LOCAL_AUTHENTICATION_SYSTEM__JSF_AUTHENTICATION = eINSTANCE.getGenLocalAuthenticationSystem_JsfAuthentication();

		/**
		 * The meta object literal for the '<em><b>Gen User Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_SERVICE = eINSTANCE.getGenLocalAuthenticationSystem_GenUserService();

		/**
		 * The meta object literal for the '<em><b>Gen User Authentication Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_AUTHENTICATION_KEY = eINSTANCE.getGenLocalAuthenticationSystem_GenUserAuthenticationKey();

		/**
		 * The meta object literal for the '<em><b>Gen Authentication Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTHENTICATION_SERVICE = eINSTANCE.getGenLocalAuthenticationSystem_GenAuthenticationService();

		/**
		 * The meta object literal for the '<em><b>Gen Login Attempt Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_ATTEMPT_SERVICE = eINSTANCE.getGenLocalAuthenticationSystem_GenLoginAttemptService();

		/**
		 * The meta object literal for the '<em><b>Gen Auto Login Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTO_LOGIN_SERVICE = eINSTANCE.getGenLocalAuthenticationSystem_GenAutoLoginService();

		/**
		 * The meta object literal for the '<em><b>Gen Registration Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT = eINSTANCE.getGenLocalAuthenticationSystem_GenRegistrationUnit();

		/**
		 * The meta object literal for the '<em><b>Gen Login Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT = eINSTANCE.getGenLocalAuthenticationSystem_GenLoginUnit();

		/**
		 * The meta object literal for the '<em><b>Gen Forgotten Password Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT = eINSTANCE.getGenLocalAuthenticationSystem_GenForgottenPasswordUnit();

		/**
		 * The meta object literal for the '<em><b>Login Maximum Attempts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_MAXIMUM_ATTEMPTS = eINSTANCE.getGenLocalAuthenticationSystem_LoginMaximumAttempts();

		/**
		 * The meta object literal for the '<em><b>Login Attempt Expiry Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_EXPIRY_PERIOD = eINSTANCE.getGenLocalAuthenticationSystem_LoginAttemptExpiryPeriod();

		/**
		 * The meta object literal for the '<em><b>Autologin Cookie Lifetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_LOCAL_AUTHENTICATION_SYSTEM__AUTOLOGIN_COOKIE_LIFETIME = eINSTANCE.getGenLocalAuthenticationSystem_AutologinCookieLifetime();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceImpl <em>Gen Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenServiceImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenService()
		 * @generated
		 */
		EClass GEN_SERVICE = eINSTANCE.getGenService();

		/**
		 * The meta object literal for the '<em><b>Jsf Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SERVICE__JSF_SERVICE = eINSTANCE.getGenService_JsfService();

		/**
		 * The meta object literal for the '<em><b>Gen Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SERVICE__GEN_ENTITIES = eINSTANCE.getGenService_GenEntities();

		/**
		 * The meta object literal for the '<em><b>Gen Display Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SERVICE__GEN_DISPLAY_LABELS = eINSTANCE.getGenService_GenDisplayLabels();

		/**
		 * The meta object literal for the '<em><b>Gen Selections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SERVICE__GEN_SELECTIONS = eINSTANCE.getGenService_GenSelections();

		/**
		 * The meta object literal for the '<em><b>Gen Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SERVICE__GEN_FEATURES = eINSTANCE.getGenService_GenFeatures();

		/**
		 * The meta object literal for the '<em><b>Gen Accessed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SERVICE__GEN_ACCESSED_BY = eINSTANCE.getGenService_GenAccessedBy();

		/**
		 * The meta object literal for the '<em><b>Default View Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_SERVICE__DEFAULT_VIEW_NAME = eINSTANCE.getGenService_DefaultViewName();

		/**
		 * The meta object literal for the '<em><b>View Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_SERVICE__VIEW_NAME = eINSTANCE.getGenService_ViewName();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenModelLabelImpl <em>Gen Model Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenModelLabelImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenModelLabel()
		 * @generated
		 */
		EClass GEN_MODEL_LABEL = eINSTANCE.getGenModelLabel();

		/**
		 * The meta object literal for the '<em><b>Gen Label For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_MODEL_LABEL__GEN_LABEL_FOR = eINSTANCE.getGenModelLabel_GenLabelFor();

		/**
		 * The meta object literal for the '<em><b>Jsf Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_MODEL_LABEL__JSF_LABEL = eINSTANCE.getGenModelLabel_JsfLabel();

		/**
		 * The meta object literal for the '<em><b>Gen Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_MODEL_LABEL__GEN_FEATURES = eINSTANCE.getGenModelLabel_GenFeatures();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceFeature <em>Gen Service Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceFeature
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenServiceFeature()
		 * @generated
		 */
		EClass GEN_SERVICE_FEATURE = eINSTANCE.getGenServiceFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Included By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SERVICE_FEATURE__GEN_INCLUDED_BY = eINSTANCE.getGenServiceFeature_GenIncludedBy();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityFeatureImpl <em>Gen Service Entity Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityFeatureImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenServiceEntityFeature()
		 * @generated
		 */
		EClass GEN_SERVICE_ENTITY_FEATURE = eINSTANCE.getGenServiceEntityFeature();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_SERVICE_ENTITY_FEATURE__COLUMN_NAME = eINSTANCE.getGenServiceEntityFeature_ColumnName();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityElementImpl <em>Gen Service Entity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityElementImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenServiceEntityElement()
		 * @generated
		 */
		EClass GEN_SERVICE_ENTITY_ELEMENT = eINSTANCE.getGenServiceEntityElement();

		/**
		 * The meta object literal for the '<em><b>Jsf Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SERVICE_ENTITY_ELEMENT__JSF_FEATURE = eINSTANCE.getGenServiceEntityElement_JsfFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SERVICE_ENTITY_ELEMENT__GEN_FEATURE = eINSTANCE.getGenServiceEntityElement_GenFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceAssociation <em>Gen Service Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceAssociation
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenServiceAssociation()
		 * @generated
		 */
		EClass GEN_SERVICE_ASSOCIATION = eINSTANCE.getGenServiceAssociation();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityAssociationImpl <em>Gen Service Entity Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityAssociationImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenServiceEntityAssociation()
		 * @generated
		 */
		EClass GEN_SERVICE_ENTITY_ASSOCIATION = eINSTANCE.getGenServiceEntityAssociation();

		/**
		 * The meta object literal for the '<em><b>Jsf Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SERVICE_ENTITY_ASSOCIATION__JSF_FEATURE = eINSTANCE.getGenServiceEntityAssociation_JsfFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SERVICE_ENTITY_ASSOCIATION__GEN_FEATURE = eINSTANCE.getGenServiceEntityAssociation_GenFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceViewAssociationImpl <em>Gen Service View Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenServiceViewAssociationImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenServiceViewAssociation()
		 * @generated
		 */
		EClass GEN_SERVICE_VIEW_ASSOCIATION = eINSTANCE.getGenServiceViewAssociation();

		/**
		 * The meta object literal for the '<em><b>Jsf Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SERVICE_VIEW_ASSOCIATION__JSF_FEATURE = eINSTANCE.getGenServiceViewAssociation_JsfFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Target Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SERVICE_VIEW_ASSOCIATION__GEN_TARGET_FEATURE = eINSTANCE.getGenServiceViewAssociation_GenTargetFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenSelectionImpl <em>Gen Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenSelectionImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenSelection()
		 * @generated
		 */
		EClass GEN_SELECTION = eINSTANCE.getGenSelection();

		/**
		 * The meta object literal for the '<em><b>Jsf Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SELECTION__JSF_SELECTION = eINSTANCE.getGenSelection_JsfSelection();

		/**
		 * The meta object literal for the '<em><b>Gen Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SELECTION__GEN_FILTER = eINSTANCE.getGenSelection_GenFilter();

		/**
		 * The meta object literal for the '<em><b>Gen Ordering</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SELECTION__GEN_ORDERING = eINSTANCE.getGenSelection_GenOrdering();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature <em>Gen Included Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenIncludedFeature()
		 * @generated
		 */
		EClass GEN_INCLUDED_FEATURE = eINSTANCE.getGenIncludedFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Forced Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE = eINSTANCE.getGenIncludedFeature_GenForcedValue();

		/**
		 * The meta object literal for the '<em><b>Message Display Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_INCLUDED_FEATURE__MESSAGE_DISPLAY_OPTION = eINSTANCE.getGenIncludedFeature_MessageDisplayOption();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedElement <em>Gen Included Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedElement
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenIncludedElement()
		 * @generated
		 */
		EClass GEN_INCLUDED_ELEMENT = eINSTANCE.getGenIncludedElement();

		/**
		 * The meta object literal for the '<em><b>Gen Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_INCLUDED_ELEMENT__GEN_DEFAULT_VALUE = eINSTANCE.getGenIncludedElement_GenDefaultValue();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedAssociation <em>Gen Included Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedAssociation
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenIncludedAssociation()
		 * @generated
		 */
		EClass GEN_INCLUDED_ASSOCIATION = eINSTANCE.getGenIncludedAssociation();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenPageImpl <em>Gen Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenPageImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenPage()
		 * @generated
		 */
		EClass GEN_PAGE = eINSTANCE.getGenPage();

		/**
		 * The meta object literal for the '<em><b>Jsf Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PAGE__JSF_PAGE = eINSTANCE.getGenPage_JsfPage();

		/**
		 * The meta object literal for the '<em><b>Gen Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PAGE__GEN_PART_OF = eINSTANCE.getGenPage_GenPartOf();

		/**
		 * The meta object literal for the '<em><b>Gen Parent Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PAGE__GEN_PARENT_PAGE = eINSTANCE.getGenPage_GenParentPage();

		/**
		 * The meta object literal for the '<em><b>Gen Child Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PAGE__GEN_CHILD_PAGES = eINSTANCE.getGenPage_GenChildPages();

		/**
		 * The meta object literal for the '<em><b>Gen Side Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_PAGE__GEN_SIDE_MENU = eINSTANCE.getGenPage_GenSideMenu();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.GenSelectTarget <em>Gen Select Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.GenSelectTarget
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenSelectTarget()
		 * @generated
		 */
		EClass GEN_SELECT_TARGET = eINSTANCE.getGenSelectTarget();

		/**
		 * The meta object literal for the '<em><b>Gen Targetting Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SELECT_TARGET__GEN_TARGETTING_ACTIONS = eINSTANCE.getGenSelectTarget_GenTargettingActions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMenuImpl <em>Gen Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenMenuImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenMenu()
		 * @generated
		 */
		EClass GEN_MENU = eINSTANCE.getGenMenu();

		/**
		 * The meta object literal for the '<em><b>Gen Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_MENU__GEN_ENTRIES = eINSTANCE.getGenMenu_GenEntries();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMenuEntryImpl <em>Gen Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenMenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenMenuEntry()
		 * @generated
		 */
		EClass GEN_MENU_ENTRY = eINSTANCE.getGenMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Gen Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_MENU_ENTRY__GEN_PART_OF = eINSTANCE.getGenMenuEntry_GenPartOf();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenStaticMenuImpl <em>Gen Static Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenStaticMenuImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenStaticMenu()
		 * @generated
		 */
		EClass GEN_STATIC_MENU = eINSTANCE.getGenStaticMenu();

		/**
		 * The meta object literal for the '<em><b>Jsf Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_STATIC_MENU__JSF_MENU = eINSTANCE.getGenStaticMenu_JsfMenu();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFixedPageMenuEntryImpl <em>Gen Fixed Page Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenFixedPageMenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenFixedPageMenuEntry()
		 * @generated
		 */
		EClass GEN_FIXED_PAGE_MENU_ENTRY = eINSTANCE.getGenFixedPageMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Jsf Menu Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_FIXED_PAGE_MENU_ENTRY__JSF_MENU_ENTRY = eINSTANCE.getGenFixedPageMenuEntry_JsfMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Gen Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_FIXED_PAGE_MENU_ENTRY__GEN_DESTINATION = eINSTANCE.getGenFixedPageMenuEntry_GenDestination();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFixedActionMenuEntryImpl <em>Gen Fixed Action Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenFixedActionMenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenFixedActionMenuEntry()
		 * @generated
		 */
		EClass GEN_FIXED_ACTION_MENU_ENTRY = eINSTANCE.getGenFixedActionMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Jsf Menu Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_FIXED_ACTION_MENU_ENTRY__JSF_MENU_ENTRY = eINSTANCE.getGenFixedActionMenuEntry_JsfMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Gen Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_FIXED_ACTION_MENU_ENTRY__GEN_DESTINATION = eINSTANCE.getGenFixedActionMenuEntry_GenDestination();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFixedCommandMenuEntryImpl <em>Gen Fixed Command Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenFixedCommandMenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenFixedCommandMenuEntry()
		 * @generated
		 */
		EClass GEN_FIXED_COMMAND_MENU_ENTRY = eINSTANCE.getGenFixedCommandMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Jsf Menu Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_FIXED_COMMAND_MENU_ENTRY__JSF_MENU_ENTRY = eINSTANCE.getGenFixedCommandMenuEntry_JsfMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Gen Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_FIXED_COMMAND_MENU_ENTRY__GEN_DESTINATION = eINSTANCE.getGenFixedCommandMenuEntry_GenDestination();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenEditStaticTextMenuEntryImpl <em>Gen Edit Static Text Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenEditStaticTextMenuEntryImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenEditStaticTextMenuEntry()
		 * @generated
		 */
		EClass GEN_EDIT_STATIC_TEXT_MENU_ENTRY = eINSTANCE.getGenEditStaticTextMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Jsf Menu Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_EDIT_STATIC_TEXT_MENU_ENTRY__JSF_MENU_ENTRY = eINSTANCE.getGenEditStaticTextMenuEntry_JsfMenuEntry();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMenuIncludedFeatureImpl <em>Gen Menu Included Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenMenuIncludedFeatureImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenMenuIncludedFeature()
		 * @generated
		 */
		EClass GEN_MENU_INCLUDED_FEATURE = eINSTANCE.getGenMenuIncludedFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMenuIncludedElementImpl <em>Gen Menu Included Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenMenuIncludedElementImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenMenuIncludedElement()
		 * @generated
		 */
		EClass GEN_MENU_INCLUDED_ELEMENT = eINSTANCE.getGenMenuIncludedElement();

		/**
		 * The meta object literal for the '<em><b>Jsf Menu Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_MENU_INCLUDED_ELEMENT__JSF_MENU_ENTRY = eINSTANCE.getGenMenuIncludedElement_JsfMenuEntry();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicMenuImpl <em>Gen Dynamic Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicMenuImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenDynamicMenu()
		 * @generated
		 */
		EClass GEN_DYNAMIC_MENU = eINSTANCE.getGenDynamicMenu();

		/**
		 * The meta object literal for the '<em><b>Jsf Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DYNAMIC_MENU__JSF_MENU = eINSTANCE.getGenDynamicMenu_JsfMenu();

		/**
		 * The meta object literal for the '<em><b>Gen Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DYNAMIC_MENU__GEN_SERVICE = eINSTANCE.getGenDynamicMenu_GenService();

		/**
		 * The meta object literal for the '<em><b>Gen Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DYNAMIC_MENU__GEN_SELECTION = eINSTANCE.getGenDynamicMenu_GenSelection();

		/**
		 * The meta object literal for the '<em><b>Gen Dynamic Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DYNAMIC_MENU__GEN_DYNAMIC_TITLE = eINSTANCE.getGenDynamicMenu_GenDynamicTitle();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitContainerImpl <em>Gen Unit Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitContainerImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitContainer()
		 * @generated
		 */
		EClass GEN_UNIT_CONTAINER = eINSTANCE.getGenUnitContainer();

		/**
		 * The meta object literal for the '<em><b>Gen Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_CONTAINER__GEN_UNITS = eINSTANCE.getGenUnitContainer_GenUnits();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitTitle <em>Gen Unit Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitTitle
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitTitle()
		 * @generated
		 */
		EClass GEN_UNIT_TITLE = eINSTANCE.getGenUnitTitle();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenContentUnitImpl <em>Gen Content Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenContentUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenContentUnit()
		 * @generated
		 */
		EClass GEN_CONTENT_UNIT = eINSTANCE.getGenContentUnit();

		/**
		 * The meta object literal for the '<em><b>Gen Displayed On</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CONTENT_UNIT__GEN_DISPLAYED_ON = eINSTANCE.getGenContentUnit_GenDisplayedOn();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCreateSitemapUnitImpl <em>Gen Create Sitemap Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCreateSitemapUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCreateSitemapUnit()
		 * @generated
		 */
		EClass GEN_CREATE_SITEMAP_UNIT = eINSTANCE.getGenCreateSitemapUnit();

		/**
		 * The meta object literal for the '<em><b>Jsf Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CREATE_SITEMAP_UNIT__JSF_UNIT = eINSTANCE.getGenCreateSitemapUnit_JsfUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitField <em>Gen Unit Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitField
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitField()
		 * @generated
		 */
		EClass GEN_UNIT_FIELD = eINSTANCE.getGenUnitField();

		/**
		 * The meta object literal for the '<em><b>Gen Displayed On</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_FIELD__GEN_DISPLAYED_ON = eINSTANCE.getGenUnitField_GenDisplayedOn();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitFeatureImpl <em>Gen Unit Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitFeatureImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitFeature()
		 * @generated
		 */
		EClass GEN_UNIT_FEATURE = eINSTANCE.getGenUnitFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitElementImpl <em>Gen Unit Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitElementImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitElement()
		 * @generated
		 */
		EClass GEN_UNIT_ELEMENT = eINSTANCE.getGenUnitElement();

		/**
		 * The meta object literal for the '<em><b>Jsf Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_ELEMENT__JSF_FEATURE = eINSTANCE.getGenUnitElement_JsfFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Service Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_ELEMENT__GEN_SERVICE_FEATURE = eINSTANCE.getGenUnitElement_GenServiceFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitAssociationImpl <em>Gen Unit Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitAssociationImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitAssociation()
		 * @generated
		 */
		EClass GEN_UNIT_ASSOCIATION = eINSTANCE.getGenUnitAssociation();

		/**
		 * The meta object literal for the '<em><b>Jsf Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_ASSOCIATION__JSF_FEATURE = eINSTANCE.getGenUnitAssociation_JsfFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Service Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_ASSOCIATION__GEN_SERVICE_FEATURE = eINSTANCE.getGenUnitAssociation_GenServiceFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Child Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE = eINSTANCE.getGenUnitAssociation_GenChildFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_ASSOCIATION__GEN_SELECTION = eINSTANCE.getGenUnitAssociation_GenSelection();

		/**
		 * The meta object literal for the '<em><b>Gen Dynamic Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_ASSOCIATION__GEN_DYNAMIC_LABEL = eINSTANCE.getGenUnitAssociation_GenDynamicLabel();

		/**
		 * The meta object literal for the '<em><b>Gen Filters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_ASSOCIATION__GEN_FILTERS = eINSTANCE.getGenUnitAssociation_GenFilters();

		/**
		 * The meta object literal for the '<em><b>Select One Of Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_UNIT_ASSOCIATION__SELECT_ONE_OF_OPTION = eINSTANCE.getGenUnitAssociation_SelectOneOfOption();

		/**
		 * The meta object literal for the '<em><b>Select Many Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_UNIT_ASSOCIATION__SELECT_MANY_OPTION = eINSTANCE.getGenUnitAssociation_SelectManyOption();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildFeatureImpl <em>Gen Unit Child Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildFeatureImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitChildFeature()
		 * @generated
		 */
		EClass GEN_UNIT_CHILD_FEATURE = eINSTANCE.getGenUnitChildFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildElementImpl <em>Gen Unit Child Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildElementImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitChildElement()
		 * @generated
		 */
		EClass GEN_UNIT_CHILD_ELEMENT = eINSTANCE.getGenUnitChildElement();

		/**
		 * The meta object literal for the '<em><b>Jsf Child Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_CHILD_ELEMENT__JSF_CHILD_FEATURE = eINSTANCE.getGenUnitChildElement_JsfChildFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Service Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_CHILD_ELEMENT__GEN_SERVICE_FEATURE = eINSTANCE.getGenUnitChildElement_GenServiceFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildAssociationImpl <em>Gen Unit Child Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildAssociationImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitChildAssociation()
		 * @generated
		 */
		EClass GEN_UNIT_CHILD_ASSOCIATION = eINSTANCE.getGenUnitChildAssociation();

		/**
		 * The meta object literal for the '<em><b>Jsf Child Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_CHILD_ASSOCIATION__JSF_CHILD_FEATURE = eINSTANCE.getGenUnitChildAssociation_JsfChildFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Service Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_CHILD_ASSOCIATION__GEN_SERVICE_FEATURE = eINSTANCE.getGenUnitChildAssociation_GenServiceFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Child Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_CHILD_ASSOCIATION__GEN_CHILD_FEATURE = eINSTANCE.getGenUnitChildAssociation_GenChildFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenInterfaceFieldImpl <em>Gen Interface Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenInterfaceFieldImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenInterfaceField()
		 * @generated
		 */
		EClass GEN_INTERFACE_FIELD = eINSTANCE.getGenInterfaceField();

		/**
		 * The meta object literal for the '<em><b>Gen Must Match</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_INTERFACE_FIELD__GEN_MUST_MATCH = eINSTANCE.getGenInterfaceField_GenMustMatch();

		/**
		 * The meta object literal for the '<em><b>Gen Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_INTERFACE_FIELD__GEN_DEFAULT_VALUE = eINSTANCE.getGenInterfaceField_GenDefaultValue();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDataTypeFieldImpl <em>Gen Data Type Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenDataTypeFieldImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenDataTypeField()
		 * @generated
		 */
		EClass GEN_DATA_TYPE_FIELD = eINSTANCE.getGenDataTypeField();

		/**
		 * The meta object literal for the '<em><b>Gen Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DATA_TYPE_FIELD__GEN_DATA_TYPE = eINSTANCE.getGenDataTypeField_GenDataType();

		/**
		 * The meta object literal for the '<em><b>Jsf Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DATA_TYPE_FIELD__JSF_FIELD = eINSTANCE.getGenDataTypeField_JsfField();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDateFieldImpl <em>Gen Date Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenDateFieldImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenDateField()
		 * @generated
		 */
		EClass GEN_DATE_FIELD = eINSTANCE.getGenDateField();

		/**
		 * The meta object literal for the '<em><b>Jsf Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DATE_FIELD__JSF_FIELD = eINSTANCE.getGenDateField_JsfField();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCaptchaFieldImpl <em>Gen Captcha Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCaptchaFieldImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCaptchaField()
		 * @generated
		 */
		EClass GEN_CAPTCHA_FIELD = eINSTANCE.getGenCaptchaField();

		/**
		 * The meta object literal for the '<em><b>Jsf Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CAPTCHA_FIELD__JSF_FIELD = eINSTANCE.getGenCaptchaField_JsfField();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitSupportActionImpl <em>Gen Unit Support Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUnitSupportActionImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUnitSupportAction()
		 * @generated
		 */
		EClass GEN_UNIT_SUPPORT_ACTION = eINSTANCE.getGenUnitSupportAction();

		/**
		 * The meta object literal for the '<em><b>Jsf Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UNIT_SUPPORT_ACTION__JSF_ACTION = eINSTANCE.getGenUnitSupportAction_JsfAction();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenStaticUnitImpl <em>Gen Static Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenStaticUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenStaticUnit()
		 * @generated
		 */
		EClass GEN_STATIC_UNIT = eINSTANCE.getGenStaticUnit();

		/**
		 * The meta object literal for the '<em><b>Jsf Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_STATIC_UNIT__JSF_UNIT = eINSTANCE.getGenStaticUnit_JsfUnit();

		/**
		 * The meta object literal for the '<em><b>Gen Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_STATIC_UNIT__GEN_SERVICE = eINSTANCE.getGenStaticUnit_GenService();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCommandUnitImpl <em>Gen Command Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCommandUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCommandUnit()
		 * @generated
		 */
		EClass GEN_COMMAND_UNIT = eINSTANCE.getGenCommandUnit();

		/**
		 * The meta object literal for the '<em><b>Jsf Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_COMMAND_UNIT__JSF_UNIT = eINSTANCE.getGenCommandUnit_JsfUnit();

		/**
		 * The meta object literal for the '<em><b>Gen Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_COMMAND_UNIT__GEN_COMMANDS = eINSTANCE.getGenCommandUnit_GenCommands();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCommandImpl <em>Gen Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCommandImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCommand()
		 * @generated
		 */
		EClass GEN_COMMAND = eINSTANCE.getGenCommand();

		/**
		 * The meta object literal for the '<em><b>Gen Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_COMMAND__GEN_PART_OF = eINSTANCE.getGenCommand_GenPartOf();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUserCommandImpl <em>Gen User Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUserCommandImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUserCommand()
		 * @generated
		 */
		EClass GEN_USER_COMMAND = eINSTANCE.getGenUserCommand();

		/**
		 * The meta object literal for the '<em><b>Jsf Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_USER_COMMAND__JSF_COMMAND = eINSTANCE.getGenUserCommand_JsfCommand();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicUnitImpl <em>Gen Dynamic Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenDynamicUnit()
		 * @generated
		 */
		EClass GEN_DYNAMIC_UNIT = eINSTANCE.getGenDynamicUnit();

		/**
		 * The meta object literal for the '<em><b>Gen Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DYNAMIC_UNIT__GEN_SERVICE = eINSTANCE.getGenDynamicUnit_GenService();

		/**
		 * The meta object literal for the '<em><b>Gen Display Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS = eINSTANCE.getGenDynamicUnit_GenDisplayFields();

		/**
		 * The meta object literal for the '<em><b>Gen Support Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS = eINSTANCE.getGenDynamicUnit_GenSupportActions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenEditUnitImpl <em>Gen Edit Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenEditUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenEditUnit()
		 * @generated
		 */
		EClass GEN_EDIT_UNIT = eINSTANCE.getGenEditUnit();

		/**
		 * The meta object literal for the '<em><b>Message Placement Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_EDIT_UNIT__MESSAGE_PLACEMENT_OPTION = eINSTANCE.getGenEditUnit_MessagePlacementOption();

		/**
		 * The meta object literal for the '<em><b>Form Message Display Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_EDIT_UNIT__FORM_MESSAGE_DISPLAY_OPTION = eINSTANCE.getGenEditUnit_FormMessageDisplayOption();

		/**
		 * The meta object literal for the '<em><b>Gen Confirm Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_EDIT_UNIT__GEN_CONFIRM_DESTINATION = eINSTANCE.getGenEditUnit_GenConfirmDestination();

		/**
		 * The meta object literal for the '<em><b>Gen Cancel Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_EDIT_UNIT__GEN_CANCEL_DESTINATION = eINSTANCE.getGenEditUnit_GenCancelDestination();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCreateUnitImpl <em>Gen Create Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCreateUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCreateUnit()
		 * @generated
		 */
		EClass GEN_CREATE_UNIT = eINSTANCE.getGenCreateUnit();

		/**
		 * The meta object literal for the '<em><b>Jsf Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CREATE_UNIT__JSF_UNIT = eINSTANCE.getGenCreateUnit_JsfUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCreateUpdateUnitImpl <em>Gen Create Update Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCreateUpdateUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCreateUpdateUnit()
		 * @generated
		 */
		EClass GEN_CREATE_UPDATE_UNIT = eINSTANCE.getGenCreateUpdateUnit();

		/**
		 * The meta object literal for the '<em><b>Jsf Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CREATE_UPDATE_UNIT__JSF_UNIT = eINSTANCE.getGenCreateUpdateUnit_JsfUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMapUnitImpl <em>Gen Map Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenMapUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenMapUnit()
		 * @generated
		 */
		EClass GEN_MAP_UNIT = eINSTANCE.getGenMapUnit();

		/**
		 * The meta object literal for the '<em><b>Jsf Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_MAP_UNIT__JSF_UNIT = eINSTANCE.getGenMapUnit_JsfUnit();

		/**
		 * The meta object literal for the '<em><b>Gen Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_MAP_UNIT__GEN_LOCATION = eINSTANCE.getGenMapUnit_GenLocation();

		/**
		 * The meta object literal for the '<em><b>Gen Place Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_MAP_UNIT__GEN_PLACE_NAME = eINSTANCE.getGenMapUnit_GenPlaceName();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUpdateUnitImpl <em>Gen Update Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenUpdateUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenUpdateUnit()
		 * @generated
		 */
		EClass GEN_UPDATE_UNIT = eINSTANCE.getGenUpdateUnit();

		/**
		 * The meta object literal for the '<em><b>Jsf Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_UPDATE_UNIT__JSF_UNIT = eINSTANCE.getGenUpdateUnit_JsfUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDataUnitImpl <em>Gen Data Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenDataUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenDataUnit()
		 * @generated
		 */
		EClass GEN_DATA_UNIT = eINSTANCE.getGenDataUnit();

		/**
		 * The meta object literal for the '<em><b>Gen Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DATA_UNIT__GEN_SELECTION = eINSTANCE.getGenDataUnit_GenSelection();

		/**
		 * The meta object literal for the '<em><b>Gen Dynamic Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DATA_UNIT__GEN_DYNAMIC_TITLE = eINSTANCE.getGenDataUnit_GenDynamicTitle();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDetailsUnitImpl <em>Gen Details Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenDetailsUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenDetailsUnit()
		 * @generated
		 */
		EClass GEN_DETAILS_UNIT = eINSTANCE.getGenDetailsUnit();

		/**
		 * The meta object literal for the '<em><b>Jsf Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DETAILS_UNIT__JSF_UNIT = eINSTANCE.getGenDetailsUnit_JsfUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenIndexUnitImpl <em>Gen Index Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenIndexUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenIndexUnit()
		 * @generated
		 */
		EClass GEN_INDEX_UNIT = eINSTANCE.getGenIndexUnit();

		/**
		 * The meta object literal for the '<em><b>Jsf Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_INDEX_UNIT__JSF_UNIT = eINSTANCE.getGenIndexUnit_JsfUnit();

		/**
		 * The meta object literal for the '<em><b>Gen Targetting Searches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES = eINSTANCE.getGenIndexUnit_GenTargettingSearches();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenIndexGridUnitImpl <em>Gen Index Grid Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenIndexGridUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenIndexGridUnit()
		 * @generated
		 */
		EClass GEN_INDEX_GRID_UNIT = eINSTANCE.getGenIndexGridUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenIndexPageDirectionUnitImpl <em>Gen Index Page Direction Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenIndexPageDirectionUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenIndexPageDirectionUnit()
		 * @generated
		 */
		EClass GEN_INDEX_PAGE_DIRECTION_UNIT = eINSTANCE.getGenIndexPageDirectionUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenIndexLineDirectionUnitImpl <em>Gen Index Line Direction Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenIndexLineDirectionUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenIndexLineDirectionUnit()
		 * @generated
		 */
		EClass GEN_INDEX_LINE_DIRECTION_UNIT = eINSTANCE.getGenIndexLineDirectionUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenControlUnitImpl <em>Gen Control Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenControlUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenControlUnit()
		 * @generated
		 */
		EClass GEN_CONTROL_UNIT = eINSTANCE.getGenControlUnit();

		/**
		 * The meta object literal for the '<em><b>Message Placement Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_CONTROL_UNIT__MESSAGE_PLACEMENT_OPTION = eINSTANCE.getGenControlUnit_MessagePlacementOption();

		/**
		 * The meta object literal for the '<em><b>Gen Cancel Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CONTROL_UNIT__GEN_CANCEL_DESTINATION = eINSTANCE.getGenControlUnit_GenCancelDestination();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenSearchUnitImpl <em>Gen Search Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenSearchUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenSearchUnit()
		 * @generated
		 */
		EClass GEN_SEARCH_UNIT = eINSTANCE.getGenSearchUnit();

		/**
		 * The meta object literal for the '<em><b>Jsf Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SEARCH_UNIT__JSF_UNIT = eINSTANCE.getGenSearchUnit_JsfUnit();

		/**
		 * The meta object literal for the '<em><b>Gen Result Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SEARCH_UNIT__GEN_RESULT_DESTINATION = eINSTANCE.getGenSearchUnit_GenResultDestination();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenActionUnitImpl <em>Gen Action Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenActionUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenActionUnit()
		 * @generated
		 */
		EClass GEN_ACTION_UNIT = eINSTANCE.getGenActionUnit();

		/**
		 * The meta object literal for the '<em><b>Jsf Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ACTION_UNIT__JSF_UNIT = eINSTANCE.getGenActionUnit_JsfUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.GenAuthenticationUnit <em>Gen Authentication Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.GenAuthenticationUnit
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenAuthenticationUnit()
		 * @generated
		 */
		EClass GEN_AUTHENTICATION_UNIT = eINSTANCE.getGenAuthenticationUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenRegistrationUnitImpl <em>Gen Registration Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenRegistrationUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenRegistrationUnit()
		 * @generated
		 */
		EClass GEN_REGISTRATION_UNIT = eINSTANCE.getGenRegistrationUnit();

		/**
		 * The meta object literal for the '<em><b>Jsf Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_REGISTRATION_UNIT__JSF_UNIT = eINSTANCE.getGenRegistrationUnit_JsfUnit();

		/**
		 * The meta object literal for the '<em><b>Gen Authentication System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM = eINSTANCE.getGenRegistrationUnit_GenAuthenticationSystem();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLoginUnitImpl <em>Gen Login Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenLoginUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenLoginUnit()
		 * @generated
		 */
		EClass GEN_LOGIN_UNIT = eINSTANCE.getGenLoginUnit();

		/**
		 * The meta object literal for the '<em><b>Jsf Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LOGIN_UNIT__JSF_UNIT = eINSTANCE.getGenLoginUnit_JsfUnit();

		/**
		 * The meta object literal for the '<em><b>Gen Authentication System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM = eINSTANCE.getGenLoginUnit_GenAuthenticationSystem();

		/**
		 * The meta object literal for the '<em><b>Gen Login Id Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LOGIN_UNIT__GEN_LOGIN_ID_FIELD = eINSTANCE.getGenLoginUnit_GenLoginIdField();

		/**
		 * The meta object literal for the '<em><b>Gen Password Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LOGIN_UNIT__GEN_PASSWORD_FIELD = eINSTANCE.getGenLoginUnit_GenPasswordField();

		/**
		 * The meta object literal for the '<em><b>Gen Remember Me Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LOGIN_UNIT__GEN_REMEMBER_ME_FIELD = eINSTANCE.getGenLoginUnit_GenRememberMeField();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenForgottenPasswordUnitImpl <em>Gen Forgotten Password Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenForgottenPasswordUnitImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenForgottenPasswordUnit()
		 * @generated
		 */
		EClass GEN_FORGOTTEN_PASSWORD_UNIT = eINSTANCE.getGenForgottenPasswordUnit();

		/**
		 * The meta object literal for the '<em><b>Jsf Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_FORGOTTEN_PASSWORD_UNIT__JSF_UNIT = eINSTANCE.getGenForgottenPasswordUnit_JsfUnit();

		/**
		 * The meta object literal for the '<em><b>Gen Authentication System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM = eINSTANCE.getGenForgottenPasswordUnit_GenAuthenticationSystem();

		/**
		 * The meta object literal for the '<em><b>Gen Login Id Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_FORGOTTEN_PASSWORD_UNIT__GEN_LOGIN_ID_FIELD = eINSTANCE.getGenForgottenPasswordUnit_GenLoginIdField();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer <em>Gen Inline Action Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenInlineActionContainer()
		 * @generated
		 */
		EClass GEN_INLINE_ACTION_CONTAINER = eINSTANCE.getGenInlineActionContainer();

		/**
		 * The meta object literal for the '<em><b>Gen Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_INLINE_ACTION_CONTAINER__GEN_ACTIONS = eINSTANCE.getGenInlineActionContainer_GenActions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenInlineActionImpl <em>Gen Inline Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenInlineActionImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenInlineAction()
		 * @generated
		 */
		EClass GEN_INLINE_ACTION = eINSTANCE.getGenInlineAction();

		/**
		 * The meta object literal for the '<em><b>Jsf Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_INLINE_ACTION__JSF_ACTION = eINSTANCE.getGenInlineAction_JsfAction();

		/**
		 * The meta object literal for the '<em><b>Gen Used By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_INLINE_ACTION__GEN_USED_BY = eINSTANCE.getGenInlineAction_GenUsedBy();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenSelectActionImpl <em>Gen Select Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenSelectActionImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenSelectAction()
		 * @generated
		 */
		EClass GEN_SELECT_ACTION = eINSTANCE.getGenSelectAction();

		/**
		 * The meta object literal for the '<em><b>Gen Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SELECT_ACTION__GEN_TARGET = eINSTANCE.getGenSelectAction_GenTarget();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDeleteActionImpl <em>Gen Delete Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenDeleteActionImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenDeleteAction()
		 * @generated
		 */
		EClass GEN_DELETE_ACTION = eINSTANCE.getGenDeleteAction();

		/**
		 * The meta object literal for the '<em><b>Gen Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DELETE_ACTION__GEN_DESTINATION = eINSTANCE.getGenDeleteAction_GenDestination();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFeatureSupportActionImpl <em>Gen Feature Support Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenFeatureSupportActionImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenFeatureSupportAction()
		 * @generated
		 */
		EClass GEN_FEATURE_SUPPORT_ACTION = eINSTANCE.getGenFeatureSupportAction();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFeatureReferenceImpl <em>Gen Feature Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenFeatureReferenceImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenFeatureReference()
		 * @generated
		 */
		EClass GEN_FEATURE_REFERENCE = eINSTANCE.getGenFeatureReference();

		/**
		 * The meta object literal for the '<em><b>Criteria Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_FEATURE_REFERENCE__CRITERIA_PATH = eINSTANCE.getGenFeatureReference_CriteriaPath();

		/**
		 * The meta object literal for the '<em><b>Gen Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_FEATURE_REFERENCE__GEN_FIELD = eINSTANCE.getGenFeatureReference_GenField();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenModelReferenceImpl <em>Gen Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenModelReferenceImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenModelReference()
		 * @generated
		 */
		EClass GEN_MODEL_REFERENCE = eINSTANCE.getGenModelReference();

		/**
		 * The meta object literal for the '<em><b>Criteria Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_MODEL_REFERENCE__CRITERIA_PATH = eINSTANCE.getGenModelReference_CriteriaPath();

		/**
		 * The meta object literal for the '<em><b>Gen Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_MODEL_REFERENCE__GEN_UNIT = eINSTANCE.getGenModelReference_GenUnit();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCurrentUserReferenceImpl <em>Gen Current User Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenCurrentUserReferenceImpl
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getGenCurrentUserReference()
		 * @generated
		 */
		EClass GEN_CURRENT_USER_REFERENCE = eINSTANCE.getGenCurrentUserReference();

		/**
		 * The meta object literal for the '<em><b>Criteria Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CURRENT_USER_REFERENCE__CRITERIA_PATH = eINSTANCE.getGenCurrentUserReference_CriteriaPath();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.SelectOneofOptions <em>Select Oneof Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.SelectOneofOptions
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getSelectOneofOptions()
		 * @generated
		 */
		EEnum SELECT_ONEOF_OPTIONS = eINSTANCE.getSelectOneofOptions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.SelectManyOptions <em>Select Many Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.SelectManyOptions
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getSelectManyOptions()
		 * @generated
		 */
		EEnum SELECT_MANY_OPTIONS = eINSTANCE.getSelectManyOptions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.InputMessagePlacementOptions <em>Input Message Placement Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.InputMessagePlacementOptions
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getInputMessagePlacementOptions()
		 * @generated
		 */
		EEnum INPUT_MESSAGE_PLACEMENT_OPTIONS = eINSTANCE.getInputMessagePlacementOptions();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions <em>Input Message Display Options</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions
		 * @see uk.ac.man.cs.mdsd.genjsf.impl.GenJsfPackageImpl#getInputMessageDisplayOptions()
		 * @generated
		 */
		EEnum INPUT_MESSAGE_DISPLAY_OPTIONS = eINSTANCE.getInputMessageDisplayOptions();

	}

} //GenJsfPackage
