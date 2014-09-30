/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenOrmPackage.java,v 1.26 2014/06/27 07:52:20 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface GenOrmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genorm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cs.man.ac.uk/mdsd/2010/GenOrm";

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
	GenOrmPackage eINSTANCE = uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenOrmModel()
	 * @generated
	 */
	int GEN_ORM_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Orm Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__ORM_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Gen Collection Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__GEN_COLLECTION_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Gen Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__GEN_DATA_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Gen Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__GEN_ENTITIES = 3;

	/**
	 * The feature id for the '<em><b>Orm Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__ORM_TECHNOLOGY = 4;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__BASE_PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Domain Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__DOMAIN_PACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Include Xml Binding Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__INCLUDE_XML_BINDING_ANNOTATIONS = 7;

	/**
	 * The feature id for the '<em><b>Dao Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__DAO_PACKAGE = 8;

	/**
	 * The feature id for the '<em><b>Dao Impl Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__DAO_IMPL_PACKAGE = 9;

	/**
	 * The feature id for the '<em><b>Database Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__DATABASE_HOST = 10;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__DATABASE_NAME = 11;

	/**
	 * The feature id for the '<em><b>Database Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__DATABASE_USERNAME = 12;

	/**
	 * The feature id for the '<em><b>Database Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__DATABASE_PASSWORD = 13;

	/**
	 * The feature id for the '<em><b>Database Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL__DATABASE_PREFIX = 14;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ORM_MODEL_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionTypeImpl <em>Gen Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenCollectionTypeImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenCollectionType()
	 * @generated
	 */
	int GEN_COLLECTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_TYPE__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Orm Collection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_TYPE__ORM_COLLECTION_TYPE = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_TYPE_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenClassifierImpl <em>Gen Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenClassifierImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenClassifier()
	 * @generated
	 */
	int GEN_CLASSIFIER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASSIFIER__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Gen Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CLASSIFIER_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenDataTypeImpl <em>Gen Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenDataTypeImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenDataType()
	 * @generated
	 */
	int GEN_DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE__NAME = GEN_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Orm Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE__ORM_DATA_TYPE = GEN_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Java Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE__JAVA_TYPE = GEN_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Java Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE__JAVA_DEFAULT_VALUE = GEN_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE__PERSISTENCE_TYPE = GEN_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gen Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_DATA_TYPE_FEATURE_COUNT = GEN_CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenEntityImpl <em>Gen Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenEntityImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenEntity()
	 * @generated
	 */
	int GEN_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENTITY__NAME = GEN_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Orm Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENTITY__ORM_ENTITY = GEN_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENTITY__GEN_PART_OF = GEN_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENTITY__DEFAULT_TABLE_NAME = GEN_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENTITY__TABLE_NAME = GEN_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENTITY__KEY_NAME = GEN_CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gen Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENTITY__GEN_FEATURES = GEN_CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENTITY__XML_TRANSIENT = GEN_CLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Xml Root Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENTITY__XML_ROOT_ELEMENT = GEN_CLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Xml Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENTITY__XML_NAMESPACE = GEN_CLASSIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Xml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENTITY__XML_NAME = GEN_CLASSIFIER_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Gen Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ENTITY_FEATURE_COUNT = GEN_CLASSIFIER_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenFeatureImpl <em>Gen Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenFeatureImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenFeature()
	 * @generated
	 */
	int GEN_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__NAME = OrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Parent Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__GEN_PARENT_ENTITY = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE__XML_TRANSIENT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_FEATURE_FEATURE_COUNT = OrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenAttributeImpl <em>Gen Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenAttributeImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenAttribute()
	 * @generated
	 */
	int GEN_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE__NAME = GEN_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Parent Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE__GEN_PARENT_ENTITY = GEN_FEATURE__GEN_PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE__XML_TRANSIENT = GEN_FEATURE__XML_TRANSIENT;

	/**
	 * The number of structural features of the '<em>Gen Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ATTRIBUTE_FEATURE_COUNT = GEN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonAttributeImpl <em>Gen Singleton Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenSingletonAttributeImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenSingletonAttribute()
	 * @generated
	 */
	int GEN_SINGLETON_ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ATTRIBUTE__NAME = GEN_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Parent Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ATTRIBUTE__GEN_PARENT_ENTITY = GEN_ATTRIBUTE__GEN_PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ATTRIBUTE__XML_TRANSIENT = GEN_ATTRIBUTE__XML_TRANSIENT;

	/**
	 * The feature id for the '<em><b>Gen Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE = GEN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ATTRIBUTE__COLUMN_NAME = GEN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Singleton Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ATTRIBUTE_FEATURE_COUNT = GEN_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionAttributeImpl <em>Gen Collection Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenCollectionAttributeImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenCollectionAttribute()
	 * @generated
	 */
	int GEN_COLLECTION_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ATTRIBUTE__NAME = GEN_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Parent Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ATTRIBUTE__GEN_PARENT_ENTITY = GEN_ATTRIBUTE__GEN_PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ATTRIBUTE__XML_TRANSIENT = GEN_ATTRIBUTE__XML_TRANSIENT;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ATTRIBUTE__TABLE_NAME = GEN_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ATTRIBUTE__COLUMN_NAME = GEN_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Collection Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ATTRIBUTE_FEATURE_COUNT = GEN_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonElementImpl <em>Gen Singleton Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenSingletonElementImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenSingletonElement()
	 * @generated
	 */
	int GEN_SINGLETON_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ELEMENT__NAME = GEN_SINGLETON_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Parent Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ELEMENT__GEN_PARENT_ENTITY = GEN_SINGLETON_ATTRIBUTE__GEN_PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ELEMENT__XML_TRANSIENT = GEN_SINGLETON_ATTRIBUTE__XML_TRANSIENT;

	/**
	 * The feature id for the '<em><b>Gen Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ELEMENT__GEN_DEFAULT_VALUE = GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ELEMENT__COLUMN_NAME = GEN_SINGLETON_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ELEMENT__ORM_FEATURE = GEN_SINGLETON_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gen Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ELEMENT__GEN_DATA_TYPE = GEN_SINGLETON_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Singleton Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ELEMENT_FEATURE_COUNT = GEN_SINGLETON_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionElementImpl <em>Gen Collection Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenCollectionElementImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenCollectionElement()
	 * @generated
	 */
	int GEN_COLLECTION_ELEMENT = 10;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonDateImpl <em>Gen Singleton Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenSingletonDateImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenSingletonDate()
	 * @generated
	 */
	int GEN_SINGLETON_DATE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ELEMENT__NAME = GEN_COLLECTION_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Parent Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ELEMENT__GEN_PARENT_ENTITY = GEN_COLLECTION_ATTRIBUTE__GEN_PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ELEMENT__XML_TRANSIENT = GEN_COLLECTION_ATTRIBUTE__XML_TRANSIENT;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ELEMENT__TABLE_NAME = GEN_COLLECTION_ATTRIBUTE__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ELEMENT__COLUMN_NAME = GEN_COLLECTION_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ELEMENT__ORM_FEATURE = GEN_COLLECTION_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Collection Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ELEMENT_FEATURE_COUNT = GEN_COLLECTION_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_DATE__NAME = GEN_SINGLETON_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Parent Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_DATE__GEN_PARENT_ENTITY = GEN_SINGLETON_ATTRIBUTE__GEN_PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_DATE__XML_TRANSIENT = GEN_SINGLETON_ATTRIBUTE__XML_TRANSIENT;

	/**
	 * The feature id for the '<em><b>Gen Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_DATE__GEN_DEFAULT_VALUE = GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_DATE__COLUMN_NAME = GEN_SINGLETON_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_DATE__ORM_FEATURE = GEN_SINGLETON_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Singleton Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_DATE_FEATURE_COUNT = GEN_SINGLETON_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionDateImpl <em>Gen Collection Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenCollectionDateImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenCollectionDate()
	 * @generated
	 */
	int GEN_COLLECTION_DATE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_DATE__NAME = GEN_COLLECTION_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Parent Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_DATE__GEN_PARENT_ENTITY = GEN_COLLECTION_ATTRIBUTE__GEN_PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_DATE__XML_TRANSIENT = GEN_COLLECTION_ATTRIBUTE__XML_TRANSIENT;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_DATE__TABLE_NAME = GEN_COLLECTION_ATTRIBUTE__TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_DATE__COLUMN_NAME = GEN_COLLECTION_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_DATE__ORM_FEATURE = GEN_COLLECTION_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Collection Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_DATE_FEATURE_COUNT = GEN_COLLECTION_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonFileImpl <em>Gen Singleton File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenSingletonFileImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenSingletonFile()
	 * @generated
	 */
	int GEN_SINGLETON_FILE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_FILE__NAME = GEN_SINGLETON_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Parent Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_FILE__GEN_PARENT_ENTITY = GEN_SINGLETON_ATTRIBUTE__GEN_PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_FILE__XML_TRANSIENT = GEN_SINGLETON_ATTRIBUTE__XML_TRANSIENT;

	/**
	 * The feature id for the '<em><b>Gen Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_FILE__GEN_DEFAULT_VALUE = GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_FILE__COLUMN_NAME = GEN_SINGLETON_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_FILE__ORM_FEATURE = GEN_SINGLETON_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Singleton File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_FILE_FEATURE_COUNT = GEN_SINGLETON_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonLocationImpl <em>Gen Singleton Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenSingletonLocationImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenSingletonLocation()
	 * @generated
	 */
	int GEN_SINGLETON_LOCATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_LOCATION__NAME = GEN_SINGLETON_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Parent Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_LOCATION__GEN_PARENT_ENTITY = GEN_SINGLETON_ATTRIBUTE__GEN_PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_LOCATION__XML_TRANSIENT = GEN_SINGLETON_ATTRIBUTE__XML_TRANSIENT;

	/**
	 * The feature id for the '<em><b>Gen Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_LOCATION__GEN_DEFAULT_VALUE = GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_LOCATION__COLUMN_NAME = GEN_SINGLETON_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_LOCATION__ORM_FEATURE = GEN_SINGLETON_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Singleton Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_LOCATION_FEATURE_COUNT = GEN_SINGLETON_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenAssociationImpl <em>Gen Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenAssociationImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenAssociation()
	 * @generated
	 */
	int GEN_ASSOCIATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ASSOCIATION__NAME = GEN_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Gen Parent Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ASSOCIATION__GEN_PARENT_ENTITY = GEN_FEATURE__GEN_PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ASSOCIATION__XML_TRANSIENT = GEN_FEATURE__XML_TRANSIENT;

	/**
	 * The feature id for the '<em><b>Gen Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ASSOCIATION__GEN_OPPOSITE = GEN_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ASSOCIATION__FEATURE_NAME = GEN_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ASSOCIATION_FEATURE_COUNT = GEN_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonAssociationImpl <em>Gen Singleton Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenSingletonAssociationImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenSingletonAssociation()
	 * @generated
	 */
	int GEN_SINGLETON_ASSOCIATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ASSOCIATION__NAME = GEN_ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Gen Parent Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ASSOCIATION__GEN_PARENT_ENTITY = GEN_ASSOCIATION__GEN_PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ASSOCIATION__XML_TRANSIENT = GEN_ASSOCIATION__XML_TRANSIENT;

	/**
	 * The feature id for the '<em><b>Gen Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ASSOCIATION__GEN_OPPOSITE = GEN_ASSOCIATION__GEN_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ASSOCIATION__FEATURE_NAME = GEN_ASSOCIATION__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ASSOCIATION__ORM_FEATURE = GEN_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ASSOCIATION__COLUMN_NAME = GEN_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Singleton Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_SINGLETON_ASSOCIATION_FEATURE_COUNT = GEN_ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionAssociationImpl <em>Gen Collection Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenCollectionAssociationImpl
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenCollectionAssociation()
	 * @generated
	 */
	int GEN_COLLECTION_ASSOCIATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ASSOCIATION__NAME = GEN_ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Gen Parent Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ASSOCIATION__GEN_PARENT_ENTITY = GEN_ASSOCIATION__GEN_PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ASSOCIATION__XML_TRANSIENT = GEN_ASSOCIATION__XML_TRANSIENT;

	/**
	 * The feature id for the '<em><b>Gen Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ASSOCIATION__GEN_OPPOSITE = GEN_ASSOCIATION__GEN_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ASSOCIATION__FEATURE_NAME = GEN_ASSOCIATION__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ASSOCIATION__ORM_FEATURE = GEN_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pivot Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ASSOCIATION__PIVOT_TABLE_NAME = GEN_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pivot Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ASSOCIATION__PIVOT_COLUMN_NAME = GEN_ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Collection Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLLECTION_ASSOCIATION_FEATURE_COUNT = GEN_ASSOCIATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.genorm.OrmTechnologies <em>Orm Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.genorm.OrmTechnologies
	 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getOrmTechnologies()
	 * @generated
	 */
	int ORM_TECHNOLOGIES = 18;

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel
	 * @generated
	 */
	EClass getGenOrmModel();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getOrmModel <em>Orm Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orm Model</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getOrmModel()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EReference getGenOrmModel_OrmModel();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getGenCollectionTypes <em>Gen Collection Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Collection Types</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getGenCollectionTypes()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EReference getGenOrmModel_GenCollectionTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getGenDataTypes <em>Gen Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Data Types</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getGenDataTypes()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EReference getGenOrmModel_GenDataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getGenEntities <em>Gen Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Entities</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getGenEntities()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EReference getGenOrmModel_GenEntities();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getOrmTechnology <em>Orm Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orm Technology</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getOrmTechnology()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EAttribute getGenOrmModel_OrmTechnology();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getBasePackage()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EAttribute getGenOrmModel_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDomainPackage <em>Domain Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Package</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDomainPackage()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EAttribute getGenOrmModel_DomainPackage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getIncludeXmlBindingAnnotations <em>Include Xml Binding Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Xml Binding Annotations</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getIncludeXmlBindingAnnotations()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EAttribute getGenOrmModel_IncludeXmlBindingAnnotations();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDaoPackage <em>Dao Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dao Package</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDaoPackage()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EAttribute getGenOrmModel_DaoPackage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDaoImplPackage <em>Dao Impl Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dao Impl Package</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDaoImplPackage()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EAttribute getGenOrmModel_DaoImplPackage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabaseHost <em>Database Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Host</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabaseHost()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EAttribute getGenOrmModel_DatabaseHost();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabaseName()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EAttribute getGenOrmModel_DatabaseName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabaseUsername <em>Database Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Username</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabaseUsername()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EAttribute getGenOrmModel_DatabaseUsername();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabasePassword <em>Database Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Password</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabasePassword()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EAttribute getGenOrmModel_DatabasePassword();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabasePrefix <em>Database Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Prefix</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabasePrefix()
	 * @see #getGenOrmModel()
	 * @generated
	 */
	EAttribute getGenOrmModel_DatabasePrefix();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionType <em>Gen Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Collection Type</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionType
	 * @generated
	 */
	EClass getGenCollectionType();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionType#getOrmCollectionType <em>Orm Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orm Collection Type</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionType#getOrmCollectionType()
	 * @see #getGenCollectionType()
	 * @generated
	 */
	EReference getGenCollectionType_OrmCollectionType();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenClassifier <em>Gen Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Classifier</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenClassifier
	 * @generated
	 */
	EClass getGenClassifier();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenDataType <em>Gen Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Data Type</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenDataType
	 * @generated
	 */
	EClass getGenDataType();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genorm.GenDataType#getOrmDataType <em>Orm Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orm Data Type</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenDataType#getOrmDataType()
	 * @see #getGenDataType()
	 * @generated
	 */
	EReference getGenDataType_OrmDataType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenDataType#getJavaType <em>Java Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Type</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenDataType#getJavaType()
	 * @see #getGenDataType()
	 * @generated
	 */
	EAttribute getGenDataType_JavaType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenDataType#getJavaDefaultValue <em>Java Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Default Value</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenDataType#getJavaDefaultValue()
	 * @see #getGenDataType()
	 * @generated
	 */
	EAttribute getGenDataType_JavaDefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenDataType#getPersistenceType <em>Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Type</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenDataType#getPersistenceType()
	 * @see #getGenDataType()
	 * @generated
	 */
	EAttribute getGenDataType_PersistenceType();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenEntity <em>Gen Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Entity</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenEntity
	 * @generated
	 */
	EClass getGenEntity();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getOrmEntity <em>Orm Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orm Entity</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenEntity#getOrmEntity()
	 * @see #getGenEntity()
	 * @generated
	 */
	EReference getGenEntity_OrmEntity();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getGenPartOf <em>Gen Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Part Of</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenEntity#getGenPartOf()
	 * @see #getGenEntity()
	 * @generated
	 */
	EReference getGenEntity_GenPartOf();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getDefaultTableName <em>Default Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Table Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenEntity#getDefaultTableName()
	 * @see #getGenEntity()
	 * @generated
	 */
	EAttribute getGenEntity_DefaultTableName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenEntity#getTableName()
	 * @see #getGenEntity()
	 * @generated
	 */
	EAttribute getGenEntity_TableName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getKeyName <em>Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenEntity#getKeyName()
	 * @see #getGenEntity()
	 * @generated
	 */
	EAttribute getGenEntity_KeyName();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getGenFeatures <em>Gen Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Features</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenEntity#getGenFeatures()
	 * @see #getGenEntity()
	 * @generated
	 */
	EReference getGenEntity_GenFeatures();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getXmlTransient <em>Xml Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Transient</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenEntity#getXmlTransient()
	 * @see #getGenEntity()
	 * @generated
	 */
	EAttribute getGenEntity_XmlTransient();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getXmlRootElement <em>Xml Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Root Element</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenEntity#getXmlRootElement()
	 * @see #getGenEntity()
	 * @generated
	 */
	EAttribute getGenEntity_XmlRootElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getXmlNamespace <em>Xml Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Namespace</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenEntity#getXmlNamespace()
	 * @see #getGenEntity()
	 * @generated
	 */
	EAttribute getGenEntity_XmlNamespace();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getXmlName <em>Xml Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenEntity#getXmlName()
	 * @see #getGenEntity()
	 * @generated
	 */
	EAttribute getGenEntity_XmlName();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenFeature <em>Gen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenFeature
	 * @generated
	 */
	EClass getGenFeature();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.genorm.GenFeature#getGenParentEntity <em>Gen Parent Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Parent Entity</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenFeature#getGenParentEntity()
	 * @see #getGenFeature()
	 * @generated
	 */
	EReference getGenFeature_GenParentEntity();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenFeature#getXmlTransient <em>Xml Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Transient</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenFeature#getXmlTransient()
	 * @see #getGenFeature()
	 * @generated
	 */
	EAttribute getGenFeature_XmlTransient();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenAttribute <em>Gen Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenAttribute
	 * @generated
	 */
	EClass getGenAttribute();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAttribute <em>Gen Singleton Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Singleton Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonAttribute
	 * @generated
	 */
	EClass getGenSingletonAttribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAttribute#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonAttribute#getColumnName()
	 * @see #getGenSingletonAttribute()
	 * @generated
	 */
	EAttribute getGenSingletonAttribute_ColumnName();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAttribute#getGenDefaultValue <em>Gen Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Default Value</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonAttribute#getGenDefaultValue()
	 * @see #getGenSingletonAttribute()
	 * @generated
	 */
	EReference getGenSingletonAttribute_GenDefaultValue();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAttribute <em>Gen Collection Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Collection Attribute</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionAttribute
	 * @generated
	 */
	EClass getGenCollectionAttribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAttribute#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionAttribute#getTableName()
	 * @see #getGenCollectionAttribute()
	 * @generated
	 */
	EAttribute getGenCollectionAttribute_TableName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAttribute#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionAttribute#getColumnName()
	 * @see #getGenCollectionAttribute()
	 * @generated
	 */
	EAttribute getGenCollectionAttribute_ColumnName();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonElement <em>Gen Singleton Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Singleton Element</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonElement
	 * @generated
	 */
	EClass getGenSingletonElement();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonElement#getOrmFeature <em>Orm Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orm Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonElement#getOrmFeature()
	 * @see #getGenSingletonElement()
	 * @generated
	 */
	EReference getGenSingletonElement_OrmFeature();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonElement#getGenDataType <em>Gen Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Data Type</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonElement#getGenDataType()
	 * @see #getGenSingletonElement()
	 * @generated
	 */
	EReference getGenSingletonElement_GenDataType();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionElement <em>Gen Collection Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Collection Element</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionElement
	 * @generated
	 */
	EClass getGenCollectionElement();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionElement#getOrmFeature <em>Orm Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orm Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionElement#getOrmFeature()
	 * @see #getGenCollectionElement()
	 * @generated
	 */
	EReference getGenCollectionElement_OrmFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonDate <em>Gen Singleton Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Singleton Date</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonDate
	 * @generated
	 */
	EClass getGenSingletonDate();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonDate#getOrmFeature <em>Orm Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orm Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonDate#getOrmFeature()
	 * @see #getGenSingletonDate()
	 * @generated
	 */
	EReference getGenSingletonDate_OrmFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionDate <em>Gen Collection Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Collection Date</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionDate
	 * @generated
	 */
	EClass getGenCollectionDate();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionDate#getOrmFeature <em>Orm Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orm Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionDate#getOrmFeature()
	 * @see #getGenCollectionDate()
	 * @generated
	 */
	EReference getGenCollectionDate_OrmFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonFile <em>Gen Singleton File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Singleton File</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonFile
	 * @generated
	 */
	EClass getGenSingletonFile();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonFile#getOrmFeature <em>Orm Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orm Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonFile#getOrmFeature()
	 * @see #getGenSingletonFile()
	 * @generated
	 */
	EReference getGenSingletonFile_OrmFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonLocation <em>Gen Singleton Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Singleton Location</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonLocation
	 * @generated
	 */
	EClass getGenSingletonLocation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonLocation#getOrmFeature <em>Orm Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orm Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonLocation#getOrmFeature()
	 * @see #getGenSingletonLocation()
	 * @generated
	 */
	EReference getGenSingletonLocation_OrmFeature();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenAssociation <em>Gen Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Association</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenAssociation
	 * @generated
	 */
	EClass getGenAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genorm.GenAssociation#getGenOpposite <em>Gen Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Opposite</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenAssociation#getGenOpposite()
	 * @see #getGenAssociation()
	 * @generated
	 */
	EReference getGenAssociation_GenOpposite();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenAssociation#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenAssociation#getFeatureName()
	 * @see #getGenAssociation()
	 * @generated
	 */
	EAttribute getGenAssociation_FeatureName();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation <em>Gen Singleton Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Singleton Association</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation
	 * @generated
	 */
	EClass getGenSingletonAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation#getOrmFeature <em>Orm Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orm Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation#getOrmFeature()
	 * @see #getGenSingletonAssociation()
	 * @generated
	 */
	EReference getGenSingletonAssociation_OrmFeature();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation#getColumnName()
	 * @see #getGenSingletonAssociation()
	 * @generated
	 */
	EAttribute getGenSingletonAssociation_ColumnName();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation <em>Gen Collection Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Collection Association</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation
	 * @generated
	 */
	EClass getGenCollectionAssociation();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation#getOrmFeature <em>Orm Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orm Feature</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation#getOrmFeature()
	 * @see #getGenCollectionAssociation()
	 * @generated
	 */
	EReference getGenCollectionAssociation_OrmFeature();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation#getPivotTableName <em>Pivot Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pivot Table Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation#getPivotTableName()
	 * @see #getGenCollectionAssociation()
	 * @generated
	 */
	EAttribute getGenCollectionAssociation_PivotTableName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation#getPivotColumnName <em>Pivot Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pivot Column Name</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation#getPivotColumnName()
	 * @see #getGenCollectionAssociation()
	 * @generated
	 */
	EAttribute getGenCollectionAssociation_PivotColumnName();

	/**
	 * Returns the meta object for enum '{@link uk.ac.man.cs.mdsd.genorm.OrmTechnologies <em>Orm Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orm Technologies</em>'.
	 * @see uk.ac.man.cs.mdsd.genorm.OrmTechnologies
	 * @generated
	 */
	EEnum getOrmTechnologies();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenOrmFactory getGenOrmFactory();

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
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenOrmModel()
		 * @generated
		 */
		EClass GEN_ORM_MODEL = eINSTANCE.getGenOrmModel();

		/**
		 * The meta object literal for the '<em><b>Orm Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ORM_MODEL__ORM_MODEL = eINSTANCE.getGenOrmModel_OrmModel();

		/**
		 * The meta object literal for the '<em><b>Gen Collection Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ORM_MODEL__GEN_COLLECTION_TYPES = eINSTANCE.getGenOrmModel_GenCollectionTypes();

		/**
		 * The meta object literal for the '<em><b>Gen Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ORM_MODEL__GEN_DATA_TYPES = eINSTANCE.getGenOrmModel_GenDataTypes();

		/**
		 * The meta object literal for the '<em><b>Gen Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ORM_MODEL__GEN_ENTITIES = eINSTANCE.getGenOrmModel_GenEntities();

		/**
		 * The meta object literal for the '<em><b>Orm Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ORM_MODEL__ORM_TECHNOLOGY = eINSTANCE.getGenOrmModel_OrmTechnology();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ORM_MODEL__BASE_PACKAGE = eINSTANCE.getGenOrmModel_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Domain Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ORM_MODEL__DOMAIN_PACKAGE = eINSTANCE.getGenOrmModel_DomainPackage();

		/**
		 * The meta object literal for the '<em><b>Include Xml Binding Annotations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ORM_MODEL__INCLUDE_XML_BINDING_ANNOTATIONS = eINSTANCE.getGenOrmModel_IncludeXmlBindingAnnotations();

		/**
		 * The meta object literal for the '<em><b>Dao Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ORM_MODEL__DAO_PACKAGE = eINSTANCE.getGenOrmModel_DaoPackage();

		/**
		 * The meta object literal for the '<em><b>Dao Impl Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ORM_MODEL__DAO_IMPL_PACKAGE = eINSTANCE.getGenOrmModel_DaoImplPackage();

		/**
		 * The meta object literal for the '<em><b>Database Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ORM_MODEL__DATABASE_HOST = eINSTANCE.getGenOrmModel_DatabaseHost();

		/**
		 * The meta object literal for the '<em><b>Database Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ORM_MODEL__DATABASE_NAME = eINSTANCE.getGenOrmModel_DatabaseName();

		/**
		 * The meta object literal for the '<em><b>Database Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ORM_MODEL__DATABASE_USERNAME = eINSTANCE.getGenOrmModel_DatabaseUsername();

		/**
		 * The meta object literal for the '<em><b>Database Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ORM_MODEL__DATABASE_PASSWORD = eINSTANCE.getGenOrmModel_DatabasePassword();

		/**
		 * The meta object literal for the '<em><b>Database Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ORM_MODEL__DATABASE_PREFIX = eINSTANCE.getGenOrmModel_DatabasePrefix();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionTypeImpl <em>Gen Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenCollectionTypeImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenCollectionType()
		 * @generated
		 */
		EClass GEN_COLLECTION_TYPE = eINSTANCE.getGenCollectionType();

		/**
		 * The meta object literal for the '<em><b>Orm Collection Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_COLLECTION_TYPE__ORM_COLLECTION_TYPE = eINSTANCE.getGenCollectionType_OrmCollectionType();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenClassifierImpl <em>Gen Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenClassifierImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenClassifier()
		 * @generated
		 */
		EClass GEN_CLASSIFIER = eINSTANCE.getGenClassifier();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenDataTypeImpl <em>Gen Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenDataTypeImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenDataType()
		 * @generated
		 */
		EClass GEN_DATA_TYPE = eINSTANCE.getGenDataType();

		/**
		 * The meta object literal for the '<em><b>Orm Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_DATA_TYPE__ORM_DATA_TYPE = eINSTANCE.getGenDataType_OrmDataType();

		/**
		 * The meta object literal for the '<em><b>Java Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_DATA_TYPE__JAVA_TYPE = eINSTANCE.getGenDataType_JavaType();

		/**
		 * The meta object literal for the '<em><b>Java Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_DATA_TYPE__JAVA_DEFAULT_VALUE = eINSTANCE.getGenDataType_JavaDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Persistence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_DATA_TYPE__PERSISTENCE_TYPE = eINSTANCE.getGenDataType_PersistenceType();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenEntityImpl <em>Gen Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenEntityImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenEntity()
		 * @generated
		 */
		EClass GEN_ENTITY = eINSTANCE.getGenEntity();

		/**
		 * The meta object literal for the '<em><b>Orm Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ENTITY__ORM_ENTITY = eINSTANCE.getGenEntity_OrmEntity();

		/**
		 * The meta object literal for the '<em><b>Gen Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ENTITY__GEN_PART_OF = eINSTANCE.getGenEntity_GenPartOf();

		/**
		 * The meta object literal for the '<em><b>Default Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ENTITY__DEFAULT_TABLE_NAME = eINSTANCE.getGenEntity_DefaultTableName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ENTITY__TABLE_NAME = eINSTANCE.getGenEntity_TableName();

		/**
		 * The meta object literal for the '<em><b>Key Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ENTITY__KEY_NAME = eINSTANCE.getGenEntity_KeyName();

		/**
		 * The meta object literal for the '<em><b>Gen Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ENTITY__GEN_FEATURES = eINSTANCE.getGenEntity_GenFeatures();

		/**
		 * The meta object literal for the '<em><b>Xml Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ENTITY__XML_TRANSIENT = eINSTANCE.getGenEntity_XmlTransient();

		/**
		 * The meta object literal for the '<em><b>Xml Root Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ENTITY__XML_ROOT_ELEMENT = eINSTANCE.getGenEntity_XmlRootElement();

		/**
		 * The meta object literal for the '<em><b>Xml Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ENTITY__XML_NAMESPACE = eINSTANCE.getGenEntity_XmlNamespace();

		/**
		 * The meta object literal for the '<em><b>Xml Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ENTITY__XML_NAME = eINSTANCE.getGenEntity_XmlName();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenFeatureImpl <em>Gen Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenFeatureImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenFeature()
		 * @generated
		 */
		EClass GEN_FEATURE = eINSTANCE.getGenFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Parent Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_FEATURE__GEN_PARENT_ENTITY = eINSTANCE.getGenFeature_GenParentEntity();

		/**
		 * The meta object literal for the '<em><b>Xml Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_FEATURE__XML_TRANSIENT = eINSTANCE.getGenFeature_XmlTransient();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenAttributeImpl <em>Gen Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenAttributeImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenAttribute()
		 * @generated
		 */
		EClass GEN_ATTRIBUTE = eINSTANCE.getGenAttribute();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonAttributeImpl <em>Gen Singleton Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenSingletonAttributeImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenSingletonAttribute()
		 * @generated
		 */
		EClass GEN_SINGLETON_ATTRIBUTE = eINSTANCE.getGenSingletonAttribute();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_SINGLETON_ATTRIBUTE__COLUMN_NAME = eINSTANCE.getGenSingletonAttribute_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Gen Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE = eINSTANCE.getGenSingletonAttribute_GenDefaultValue();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionAttributeImpl <em>Gen Collection Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenCollectionAttributeImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenCollectionAttribute()
		 * @generated
		 */
		EClass GEN_COLLECTION_ATTRIBUTE = eINSTANCE.getGenCollectionAttribute();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_COLLECTION_ATTRIBUTE__TABLE_NAME = eINSTANCE.getGenCollectionAttribute_TableName();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_COLLECTION_ATTRIBUTE__COLUMN_NAME = eINSTANCE.getGenCollectionAttribute_ColumnName();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonElementImpl <em>Gen Singleton Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenSingletonElementImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenSingletonElement()
		 * @generated
		 */
		EClass GEN_SINGLETON_ELEMENT = eINSTANCE.getGenSingletonElement();

		/**
		 * The meta object literal for the '<em><b>Orm Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SINGLETON_ELEMENT__ORM_FEATURE = eINSTANCE.getGenSingletonElement_OrmFeature();

		/**
		 * The meta object literal for the '<em><b>Gen Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SINGLETON_ELEMENT__GEN_DATA_TYPE = eINSTANCE.getGenSingletonElement_GenDataType();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionElementImpl <em>Gen Collection Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenCollectionElementImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenCollectionElement()
		 * @generated
		 */
		EClass GEN_COLLECTION_ELEMENT = eINSTANCE.getGenCollectionElement();

		/**
		 * The meta object literal for the '<em><b>Orm Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_COLLECTION_ELEMENT__ORM_FEATURE = eINSTANCE.getGenCollectionElement_OrmFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonDateImpl <em>Gen Singleton Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenSingletonDateImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenSingletonDate()
		 * @generated
		 */
		EClass GEN_SINGLETON_DATE = eINSTANCE.getGenSingletonDate();

		/**
		 * The meta object literal for the '<em><b>Orm Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SINGLETON_DATE__ORM_FEATURE = eINSTANCE.getGenSingletonDate_OrmFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionDateImpl <em>Gen Collection Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenCollectionDateImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenCollectionDate()
		 * @generated
		 */
		EClass GEN_COLLECTION_DATE = eINSTANCE.getGenCollectionDate();

		/**
		 * The meta object literal for the '<em><b>Orm Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_COLLECTION_DATE__ORM_FEATURE = eINSTANCE.getGenCollectionDate_OrmFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonFileImpl <em>Gen Singleton File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenSingletonFileImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenSingletonFile()
		 * @generated
		 */
		EClass GEN_SINGLETON_FILE = eINSTANCE.getGenSingletonFile();

		/**
		 * The meta object literal for the '<em><b>Orm Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SINGLETON_FILE__ORM_FEATURE = eINSTANCE.getGenSingletonFile_OrmFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonLocationImpl <em>Gen Singleton Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenSingletonLocationImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenSingletonLocation()
		 * @generated
		 */
		EClass GEN_SINGLETON_LOCATION = eINSTANCE.getGenSingletonLocation();

		/**
		 * The meta object literal for the '<em><b>Orm Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SINGLETON_LOCATION__ORM_FEATURE = eINSTANCE.getGenSingletonLocation_OrmFeature();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenAssociationImpl <em>Gen Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenAssociationImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenAssociation()
		 * @generated
		 */
		EClass GEN_ASSOCIATION = eINSTANCE.getGenAssociation();

		/**
		 * The meta object literal for the '<em><b>Gen Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ASSOCIATION__GEN_OPPOSITE = eINSTANCE.getGenAssociation_GenOpposite();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_ASSOCIATION__FEATURE_NAME = eINSTANCE.getGenAssociation_FeatureName();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonAssociationImpl <em>Gen Singleton Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenSingletonAssociationImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenSingletonAssociation()
		 * @generated
		 */
		EClass GEN_SINGLETON_ASSOCIATION = eINSTANCE.getGenSingletonAssociation();

		/**
		 * The meta object literal for the '<em><b>Orm Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_SINGLETON_ASSOCIATION__ORM_FEATURE = eINSTANCE.getGenSingletonAssociation_OrmFeature();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_SINGLETON_ASSOCIATION__COLUMN_NAME = eINSTANCE.getGenSingletonAssociation_ColumnName();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionAssociationImpl <em>Gen Collection Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenCollectionAssociationImpl
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getGenCollectionAssociation()
		 * @generated
		 */
		EClass GEN_COLLECTION_ASSOCIATION = eINSTANCE.getGenCollectionAssociation();

		/**
		 * The meta object literal for the '<em><b>Orm Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_COLLECTION_ASSOCIATION__ORM_FEATURE = eINSTANCE.getGenCollectionAssociation_OrmFeature();

		/**
		 * The meta object literal for the '<em><b>Pivot Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_COLLECTION_ASSOCIATION__PIVOT_TABLE_NAME = eINSTANCE.getGenCollectionAssociation_PivotTableName();

		/**
		 * The meta object literal for the '<em><b>Pivot Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_COLLECTION_ASSOCIATION__PIVOT_COLUMN_NAME = eINSTANCE.getGenCollectionAssociation_PivotColumnName();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.genorm.OrmTechnologies <em>Orm Technologies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.genorm.OrmTechnologies
		 * @see uk.ac.man.cs.mdsd.genorm.impl.GenOrmPackageImpl#getOrmTechnologies()
		 * @generated
		 */
		EEnum ORM_TECHNOLOGIES = eINSTANCE.getOrmTechnologies();

	}

} //GenOrmPackage
