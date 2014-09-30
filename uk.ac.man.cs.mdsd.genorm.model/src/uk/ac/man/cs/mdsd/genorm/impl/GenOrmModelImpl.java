/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenOrmModelImpl.java,v 1.13 2014/02/17 07:41:11 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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

import uk.ac.man.cs.mdsd.genorm.GenCollectionType;
import uk.ac.man.cs.mdsd.genorm.GenDataType;
import uk.ac.man.cs.mdsd.genorm.GenEntity;
import uk.ac.man.cs.mdsd.genorm.GenOrmModel;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;

import uk.ac.man.cs.mdsd.genorm.OrmTechnologies;
import uk.ac.man.cs.mdsd.orm.OrmModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getOrmModel <em>Orm Model</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getGenCollectionTypes <em>Gen Collection Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getGenDataTypes <em>Gen Data Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getGenEntities <em>Gen Entities</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getOrmTechnology <em>Orm Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getDomainPackage <em>Domain Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getIncludeXmlBindingAnnotations <em>Include Xml Binding Annotations</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getDaoPackage <em>Dao Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getDaoImplPackage <em>Dao Impl Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getDatabaseHost <em>Database Host</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getDatabaseUsername <em>Database Username</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getDatabasePassword <em>Database Password</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenOrmModelImpl#getDatabasePrefix <em>Database Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenOrmModelImpl extends EObjectImpl implements GenOrmModel {
	/**
	 * The cached value of the '{@link #getOrmModel() <em>Orm Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmModel()
	 * @generated
	 * @ordered
	 */
	protected OrmModel ormModel;

	/**
	 * The cached value of the '{@link #getGenCollectionTypes() <em>Gen Collection Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenCollectionTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<GenCollectionType> genCollectionTypes;

	/**
	 * The cached value of the '{@link #getGenDataTypes() <em>Gen Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<GenDataType> genDataTypes;

	/**
	 * The cached value of the '{@link #getGenEntities() <em>Gen Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<GenEntity> genEntities;

	/**
	 * The default value of the '{@link #getOrmTechnology() <em>Orm Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final OrmTechnologies ORM_TECHNOLOGY_EDEFAULT = OrmTechnologies.JPA2;

	/**
	 * The cached value of the '{@link #getOrmTechnology() <em>Orm Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmTechnology()
	 * @generated
	 * @ordered
	 */
	protected OrmTechnologies ormTechnology = ORM_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainPackage() <em>Domain Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_PACKAGE_EDEFAULT = "domain";

	/**
	 * The cached value of the '{@link #getDomainPackage() <em>Domain Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainPackage()
	 * @generated
	 * @ordered
	 */
	protected String domainPackage = DOMAIN_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeXmlBindingAnnotations() <em>Include Xml Binding Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeXmlBindingAnnotations()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_XML_BINDING_ANNOTATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeXmlBindingAnnotations() <em>Include Xml Binding Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeXmlBindingAnnotations()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeXmlBindingAnnotations = INCLUDE_XML_BINDING_ANNOTATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaoPackage() <em>Dao Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaoPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String DAO_PACKAGE_EDEFAULT = "dao";

	/**
	 * The cached value of the '{@link #getDaoPackage() <em>Dao Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaoPackage()
	 * @generated
	 * @ordered
	 */
	protected String daoPackage = DAO_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaoImplPackage() <em>Dao Impl Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaoImplPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String DAO_IMPL_PACKAGE_EDEFAULT = "dao.hibernate";

	/**
	 * The cached value of the '{@link #getDaoImplPackage() <em>Dao Impl Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaoImplPackage()
	 * @generated
	 * @ordered
	 */
	protected String daoImplPackage = DAO_IMPL_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseHost() <em>Database Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseHost()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_HOST_EDEFAULT = "localhost";

	/**
	 * The cached value of the '{@link #getDatabaseHost() <em>Database Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseHost()
	 * @generated
	 * @ordered
	 */
	protected String databaseHost = DATABASE_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected String databaseName = DATABASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseUsername() <em>Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseUsername() <em>Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseUsername()
	 * @generated
	 * @ordered
	 */
	protected String databaseUsername = DATABASE_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabasePassword() <em>Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePassword()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabasePassword() <em>Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePassword()
	 * @generated
	 * @ordered
	 */
	protected String databasePassword = DATABASE_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabasePrefix() <em>Database Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_PREFIX_EDEFAULT = "localhost";

	/**
	 * The cached value of the '{@link #getDatabasePrefix() <em>Database Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePrefix()
	 * @generated
	 * @ordered
	 */
	protected String databasePrefix = DATABASE_PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenOrmModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenOrmPackage.Literals.GEN_ORM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmModel getOrmModel() {
		if (ormModel != null && ormModel.eIsProxy()) {
			InternalEObject oldOrmModel = (InternalEObject)ormModel;
			ormModel = (OrmModel)eResolveProxy(oldOrmModel);
			if (ormModel != oldOrmModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenOrmPackage.GEN_ORM_MODEL__ORM_MODEL, oldOrmModel, ormModel));
			}
		}
		return ormModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmModel basicGetOrmModel() {
		return ormModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrmModel(OrmModel newOrmModel) {
		OrmModel oldOrmModel = ormModel;
		ormModel = newOrmModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ORM_MODEL__ORM_MODEL, oldOrmModel, ormModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenCollectionType> getGenCollectionTypes() {
		if (genCollectionTypes == null) {
			genCollectionTypes = new EObjectContainmentEList<GenCollectionType>(GenCollectionType.class, this, GenOrmPackage.GEN_ORM_MODEL__GEN_COLLECTION_TYPES);
		}
		return genCollectionTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenDataType> getGenDataTypes() {
		if (genDataTypes == null) {
			genDataTypes = new EObjectContainmentEList<GenDataType>(GenDataType.class, this, GenOrmPackage.GEN_ORM_MODEL__GEN_DATA_TYPES);
		}
		return genDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenEntity> getGenEntities() {
		if (genEntities == null) {
			genEntities = new EObjectContainmentWithInverseEList<GenEntity>(GenEntity.class, this, GenOrmPackage.GEN_ORM_MODEL__GEN_ENTITIES, GenOrmPackage.GEN_ENTITY__GEN_PART_OF);
		}
		return genEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmTechnologies getOrmTechnology() {
		return ormTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrmTechnology(OrmTechnologies newOrmTechnology) {
		OrmTechnologies oldOrmTechnology = ormTechnology;
		ormTechnology = newOrmTechnology == null ? ORM_TECHNOLOGY_EDEFAULT : newOrmTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ORM_MODEL__ORM_TECHNOLOGY, oldOrmTechnology, ormTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ORM_MODEL__BASE_PACKAGE, oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainPackage() {
		return domainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainPackage(String newDomainPackage) {
		String oldDomainPackage = domainPackage;
		domainPackage = newDomainPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ORM_MODEL__DOMAIN_PACKAGE, oldDomainPackage, domainPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIncludeXmlBindingAnnotations() {
		return includeXmlBindingAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeXmlBindingAnnotations(Boolean newIncludeXmlBindingAnnotations) {
		Boolean oldIncludeXmlBindingAnnotations = includeXmlBindingAnnotations;
		includeXmlBindingAnnotations = newIncludeXmlBindingAnnotations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ORM_MODEL__INCLUDE_XML_BINDING_ANNOTATIONS, oldIncludeXmlBindingAnnotations, includeXmlBindingAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDaoPackage() {
		return daoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaoPackage(String newDaoPackage) {
		String oldDaoPackage = daoPackage;
		daoPackage = newDaoPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ORM_MODEL__DAO_PACKAGE, oldDaoPackage, daoPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDaoImplPackage() {
		return daoImplPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaoImplPackage(String newDaoImplPackage) {
		String oldDaoImplPackage = daoImplPackage;
		daoImplPackage = newDaoImplPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ORM_MODEL__DAO_IMPL_PACKAGE, oldDaoImplPackage, daoImplPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseHost() {
		return databaseHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseHost(String newDatabaseHost) {
		String oldDatabaseHost = databaseHost;
		databaseHost = newDatabaseHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ORM_MODEL__DATABASE_HOST, oldDatabaseHost, databaseHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(String newDatabaseName) {
		String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ORM_MODEL__DATABASE_NAME, oldDatabaseName, databaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseUsername() {
		return databaseUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseUsername(String newDatabaseUsername) {
		String oldDatabaseUsername = databaseUsername;
		databaseUsername = newDatabaseUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ORM_MODEL__DATABASE_USERNAME, oldDatabaseUsername, databaseUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabasePassword() {
		return databasePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasePassword(String newDatabasePassword) {
		String oldDatabasePassword = databasePassword;
		databasePassword = newDatabasePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ORM_MODEL__DATABASE_PASSWORD, oldDatabasePassword, databasePassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabasePrefix() {
		return databasePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasePrefix(String newDatabasePrefix) {
		String oldDatabasePrefix = databasePrefix;
		databasePrefix = newDatabasePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ORM_MODEL__DATABASE_PREFIX, oldDatabasePrefix, databasePrefix));
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
			case GenOrmPackage.GEN_ORM_MODEL__GEN_ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenEntities()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	public void reconcile(final GenOrmModel oldGenOrmModel) {
		final Map<String, GenCollectionType> oldCollectionTypes = new HashMap<String, GenCollectionType>();
		for (GenCollectionType oldCollectionType : oldGenOrmModel.getGenCollectionTypes()) {
			oldCollectionTypes.put(oldCollectionType.getName(), oldCollectionType);
		}
		for (GenCollectionType newCollectionType : getGenCollectionTypes()) {
			final String name = newCollectionType.getName();
			if (oldCollectionTypes.containsKey(name)) {
				newCollectionType.reconcile(oldCollectionTypes.get(name));
			}
		}

		final Map<String, GenDataType> oldDataTypes = new HashMap<String, GenDataType>();
		for (GenDataType oldDataType : oldGenOrmModel.getGenDataTypes()) {
			oldDataTypes.put(oldDataType.getName(), oldDataType);
		}
		for (GenDataType newDataType : getGenDataTypes()) {
			final String name = newDataType.getName();
			if (oldDataTypes.containsKey(name)) {
				newDataType.reconcile(oldDataTypes.get(name));
			}
		}

		final Map<String, GenEntity> oldEntities = new HashMap<String, GenEntity>();
		for (GenEntity oldEntity : oldGenOrmModel.getGenEntities()) {
			oldEntities.put(oldEntity.getName(), oldEntity);
		}
		for (GenEntity newEntity : getGenEntities()) {
			final String name = newEntity.getName();
			if (oldEntities.containsKey(name)) {
				newEntity.reconcile(oldEntities.get(name));
			}
		}

		reconcileSettings(oldGenOrmModel);
	}

	protected void reconcileSettings(final GenOrmModel oldGenOrmModel) {
		setOrmTechnology(oldGenOrmModel.getOrmTechnology());
		setBasePackage(oldGenOrmModel.getBasePackage());
		setDomainPackage(oldGenOrmModel.getDomainPackage());
		setDaoPackage(oldGenOrmModel.getDaoPackage());
		setDaoImplPackage(oldGenOrmModel.getDaoImplPackage());
		setIncludeXmlBindingAnnotations(
			oldGenOrmModel.getIncludeXmlBindingAnnotations());
		setDatabaseHost(oldGenOrmModel.getDatabaseHost());
		setDatabaseName(oldGenOrmModel.getDatabaseName());
		setDatabaseUsername(oldGenOrmModel.getDatabaseUsername());
		setDatabasePassword(oldGenOrmModel.getDatabasePassword());
		setDatabasePrefix(oldGenOrmModel.getDatabasePrefix());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenOrmPackage.GEN_ORM_MODEL__GEN_COLLECTION_TYPES:
				return ((InternalEList<?>)getGenCollectionTypes()).basicRemove(otherEnd, msgs);
			case GenOrmPackage.GEN_ORM_MODEL__GEN_DATA_TYPES:
				return ((InternalEList<?>)getGenDataTypes()).basicRemove(otherEnd, msgs);
			case GenOrmPackage.GEN_ORM_MODEL__GEN_ENTITIES:
				return ((InternalEList<?>)getGenEntities()).basicRemove(otherEnd, msgs);
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
			case GenOrmPackage.GEN_ORM_MODEL__ORM_MODEL:
				if (resolve) return getOrmModel();
				return basicGetOrmModel();
			case GenOrmPackage.GEN_ORM_MODEL__GEN_COLLECTION_TYPES:
				return getGenCollectionTypes();
			case GenOrmPackage.GEN_ORM_MODEL__GEN_DATA_TYPES:
				return getGenDataTypes();
			case GenOrmPackage.GEN_ORM_MODEL__GEN_ENTITIES:
				return getGenEntities();
			case GenOrmPackage.GEN_ORM_MODEL__ORM_TECHNOLOGY:
				return getOrmTechnology();
			case GenOrmPackage.GEN_ORM_MODEL__BASE_PACKAGE:
				return getBasePackage();
			case GenOrmPackage.GEN_ORM_MODEL__DOMAIN_PACKAGE:
				return getDomainPackage();
			case GenOrmPackage.GEN_ORM_MODEL__INCLUDE_XML_BINDING_ANNOTATIONS:
				return getIncludeXmlBindingAnnotations();
			case GenOrmPackage.GEN_ORM_MODEL__DAO_PACKAGE:
				return getDaoPackage();
			case GenOrmPackage.GEN_ORM_MODEL__DAO_IMPL_PACKAGE:
				return getDaoImplPackage();
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_HOST:
				return getDatabaseHost();
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_NAME:
				return getDatabaseName();
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_USERNAME:
				return getDatabaseUsername();
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_PASSWORD:
				return getDatabasePassword();
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_PREFIX:
				return getDatabasePrefix();
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
			case GenOrmPackage.GEN_ORM_MODEL__ORM_MODEL:
				setOrmModel((OrmModel)newValue);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__GEN_COLLECTION_TYPES:
				getGenCollectionTypes().clear();
				getGenCollectionTypes().addAll((Collection<? extends GenCollectionType>)newValue);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__GEN_DATA_TYPES:
				getGenDataTypes().clear();
				getGenDataTypes().addAll((Collection<? extends GenDataType>)newValue);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__GEN_ENTITIES:
				getGenEntities().clear();
				getGenEntities().addAll((Collection<? extends GenEntity>)newValue);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__ORM_TECHNOLOGY:
				setOrmTechnology((OrmTechnologies)newValue);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DOMAIN_PACKAGE:
				setDomainPackage((String)newValue);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__INCLUDE_XML_BINDING_ANNOTATIONS:
				setIncludeXmlBindingAnnotations((Boolean)newValue);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DAO_PACKAGE:
				setDaoPackage((String)newValue);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DAO_IMPL_PACKAGE:
				setDaoImplPackage((String)newValue);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_HOST:
				setDatabaseHost((String)newValue);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_USERNAME:
				setDatabaseUsername((String)newValue);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_PASSWORD:
				setDatabasePassword((String)newValue);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_PREFIX:
				setDatabasePrefix((String)newValue);
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
			case GenOrmPackage.GEN_ORM_MODEL__ORM_MODEL:
				setOrmModel((OrmModel)null);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__GEN_COLLECTION_TYPES:
				getGenCollectionTypes().clear();
				return;
			case GenOrmPackage.GEN_ORM_MODEL__GEN_DATA_TYPES:
				getGenDataTypes().clear();
				return;
			case GenOrmPackage.GEN_ORM_MODEL__GEN_ENTITIES:
				getGenEntities().clear();
				return;
			case GenOrmPackage.GEN_ORM_MODEL__ORM_TECHNOLOGY:
				setOrmTechnology(ORM_TECHNOLOGY_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DOMAIN_PACKAGE:
				setDomainPackage(DOMAIN_PACKAGE_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__INCLUDE_XML_BINDING_ANNOTATIONS:
				setIncludeXmlBindingAnnotations(INCLUDE_XML_BINDING_ANNOTATIONS_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DAO_PACKAGE:
				setDaoPackage(DAO_PACKAGE_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DAO_IMPL_PACKAGE:
				setDaoImplPackage(DAO_IMPL_PACKAGE_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_HOST:
				setDatabaseHost(DATABASE_HOST_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_USERNAME:
				setDatabaseUsername(DATABASE_USERNAME_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_PASSWORD:
				setDatabasePassword(DATABASE_PASSWORD_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_PREFIX:
				setDatabasePrefix(DATABASE_PREFIX_EDEFAULT);
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
			case GenOrmPackage.GEN_ORM_MODEL__ORM_MODEL:
				return ormModel != null;
			case GenOrmPackage.GEN_ORM_MODEL__GEN_COLLECTION_TYPES:
				return genCollectionTypes != null && !genCollectionTypes.isEmpty();
			case GenOrmPackage.GEN_ORM_MODEL__GEN_DATA_TYPES:
				return genDataTypes != null && !genDataTypes.isEmpty();
			case GenOrmPackage.GEN_ORM_MODEL__GEN_ENTITIES:
				return genEntities != null && !genEntities.isEmpty();
			case GenOrmPackage.GEN_ORM_MODEL__ORM_TECHNOLOGY:
				return ormTechnology != ORM_TECHNOLOGY_EDEFAULT;
			case GenOrmPackage.GEN_ORM_MODEL__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case GenOrmPackage.GEN_ORM_MODEL__DOMAIN_PACKAGE:
				return DOMAIN_PACKAGE_EDEFAULT == null ? domainPackage != null : !DOMAIN_PACKAGE_EDEFAULT.equals(domainPackage);
			case GenOrmPackage.GEN_ORM_MODEL__INCLUDE_XML_BINDING_ANNOTATIONS:
				return INCLUDE_XML_BINDING_ANNOTATIONS_EDEFAULT == null ? includeXmlBindingAnnotations != null : !INCLUDE_XML_BINDING_ANNOTATIONS_EDEFAULT.equals(includeXmlBindingAnnotations);
			case GenOrmPackage.GEN_ORM_MODEL__DAO_PACKAGE:
				return DAO_PACKAGE_EDEFAULT == null ? daoPackage != null : !DAO_PACKAGE_EDEFAULT.equals(daoPackage);
			case GenOrmPackage.GEN_ORM_MODEL__DAO_IMPL_PACKAGE:
				return DAO_IMPL_PACKAGE_EDEFAULT == null ? daoImplPackage != null : !DAO_IMPL_PACKAGE_EDEFAULT.equals(daoImplPackage);
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_HOST:
				return DATABASE_HOST_EDEFAULT == null ? databaseHost != null : !DATABASE_HOST_EDEFAULT.equals(databaseHost);
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_USERNAME:
				return DATABASE_USERNAME_EDEFAULT == null ? databaseUsername != null : !DATABASE_USERNAME_EDEFAULT.equals(databaseUsername);
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_PASSWORD:
				return DATABASE_PASSWORD_EDEFAULT == null ? databasePassword != null : !DATABASE_PASSWORD_EDEFAULT.equals(databasePassword);
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_PREFIX:
				return DATABASE_PREFIX_EDEFAULT == null ? databasePrefix != null : !DATABASE_PREFIX_EDEFAULT.equals(databasePrefix);
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
		result.append(" (ormTechnology: ");
		result.append(ormTechnology);
		result.append(", basePackage: ");
		result.append(basePackage);
		result.append(", domainPackage: ");
		result.append(domainPackage);
		result.append(", includeXmlBindingAnnotations: ");
		result.append(includeXmlBindingAnnotations);
		result.append(", daoPackage: ");
		result.append(daoPackage);
		result.append(", daoImplPackage: ");
		result.append(daoImplPackage);
		result.append(", databaseHost: ");
		result.append(databaseHost);
		result.append(", databaseName: ");
		result.append(databaseName);
		result.append(", databaseUsername: ");
		result.append(databaseUsername);
		result.append(", databasePassword: ");
		result.append(databasePassword);
		result.append(", databasePrefix: ");
		result.append(databasePrefix);
		result.append(')');
		return result.toString();
	}

} //GenOrmModelImpl
