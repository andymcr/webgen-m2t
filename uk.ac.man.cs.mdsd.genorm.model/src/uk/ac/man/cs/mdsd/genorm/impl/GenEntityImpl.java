/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenEntityImpl.java,v 1.16 2014/02/17 07:41:11 andy Exp $
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation;
import uk.ac.man.cs.mdsd.genorm.GenCollectionDate;
import uk.ac.man.cs.mdsd.genorm.GenCollectionElement;
import uk.ac.man.cs.mdsd.genorm.GenEntity;
import uk.ac.man.cs.mdsd.genorm.GenFeature;
import uk.ac.man.cs.mdsd.genorm.GenOrmModel;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;
import uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation;
import uk.ac.man.cs.mdsd.genorm.GenSingletonDate;
import uk.ac.man.cs.mdsd.genorm.GenSingletonElement;

import uk.ac.man.cs.mdsd.orm.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenEntityImpl#getOrmEntity <em>Orm Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenEntityImpl#getGenPartOf <em>Gen Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenEntityImpl#getDefaultTableName <em>Default Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenEntityImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenEntityImpl#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenEntityImpl#getGenFeatures <em>Gen Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenEntityImpl#getXmlTransient <em>Xml Transient</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenEntityImpl#getXmlRootElement <em>Xml Root Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenEntityImpl#getXmlNamespace <em>Xml Namespace</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenEntityImpl#getXmlName <em>Xml Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenEntityImpl extends GenClassifierImpl implements GenEntity {
	/**
	 * The cached value of the '{@link #getOrmEntity() <em>Orm Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity ormEntity;

	/**
	 * The default value of the '{@link #getDefaultTableName() <em>Default Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultTableName() <em>Default Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTableName()
	 * @generated
	 * @ordered
	 */
	protected String defaultTableName = DEFAULT_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyName() <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyName() <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected String keyName = KEY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenFeatures() <em>Gen Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<GenFeature> genFeatures;

	/**
	 * The default value of the '{@link #getXmlTransient() <em>Xml Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlTransient()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean XML_TRANSIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlTransient() <em>Xml Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlTransient()
	 * @generated
	 * @ordered
	 */
	protected Boolean xmlTransient = XML_TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmlRootElement() <em>Xml Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlRootElement()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean XML_ROOT_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlRootElement() <em>Xml Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlRootElement()
	 * @generated
	 * @ordered
	 */
	protected Boolean xmlRootElement = XML_ROOT_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmlNamespace() <em>Xml Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlNamespace() <em>Xml Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlNamespace()
	 * @generated
	 * @ordered
	 */
	protected String xmlNamespace = XML_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmlName() <em>Xml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlName()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlName() <em>Xml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlName()
	 * @generated
	 * @ordered
	 */
	protected String xmlName = XML_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenOrmPackage.Literals.GEN_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getOrmEntity() {
		if (ormEntity != null && ormEntity.eIsProxy()) {
			InternalEObject oldOrmEntity = (InternalEObject)ormEntity;
			ormEntity = (Entity)eResolveProxy(oldOrmEntity);
			if (ormEntity != oldOrmEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenOrmPackage.GEN_ENTITY__ORM_ENTITY, oldOrmEntity, ormEntity));
			}
		}
		return ormEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetOrmEntity() {
		return ormEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrmEntity(Entity newOrmEntity) {
		Entity oldOrmEntity = ormEntity;
		ormEntity = newOrmEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ENTITY__ORM_ENTITY, oldOrmEntity, ormEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenOrmModel getGenPartOf() {
		if (eContainerFeatureID() != GenOrmPackage.GEN_ENTITY__GEN_PART_OF) return null;
		return (GenOrmModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenPartOf(GenOrmModel newGenPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenPartOf, GenOrmPackage.GEN_ENTITY__GEN_PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenPartOf(GenOrmModel newGenPartOf) {
		if (newGenPartOf != eInternalContainer() || (eContainerFeatureID() != GenOrmPackage.GEN_ENTITY__GEN_PART_OF && newGenPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newGenPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenPartOf != null)
				msgs = ((InternalEObject)newGenPartOf).eInverseAdd(this, GenOrmPackage.GEN_ORM_MODEL__GEN_ENTITIES, GenOrmModel.class, msgs);
			msgs = basicSetGenPartOf(newGenPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ENTITY__GEN_PART_OF, newGenPartOf, newGenPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultTableName() {
		return defaultTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultTableName(String newDefaultTableName) {
		String oldDefaultTableName = defaultTableName;
		defaultTableName = newDefaultTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ENTITY__DEFAULT_TABLE_NAME, oldDefaultTableName, defaultTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ENTITY__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyName() {
		return keyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyName(String newKeyName) {
		String oldKeyName = keyName;
		keyName = newKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ENTITY__KEY_NAME, oldKeyName, keyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenFeature> getGenFeatures() {
		if (genFeatures == null) {
			genFeatures = new EObjectContainmentWithInverseEList<GenFeature>(GenFeature.class, this, GenOrmPackage.GEN_ENTITY__GEN_FEATURES, GenOrmPackage.GEN_FEATURE__GEN_PARENT_ENTITY);
		}
		return genFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getXmlTransient() {
		return xmlTransient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlTransient(Boolean newXmlTransient) {
		Boolean oldXmlTransient = xmlTransient;
		xmlTransient = newXmlTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ENTITY__XML_TRANSIENT, oldXmlTransient, xmlTransient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getXmlRootElement() {
		return xmlRootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlRootElement(Boolean newXmlRootElement) {
		Boolean oldXmlRootElement = xmlRootElement;
		xmlRootElement = newXmlRootElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ENTITY__XML_ROOT_ELEMENT, oldXmlRootElement, xmlRootElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlNamespace() {
		return xmlNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlNamespace(String newXmlNamespace) {
		String oldXmlNamespace = xmlNamespace;
		xmlNamespace = newXmlNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ENTITY__XML_NAMESPACE, oldXmlNamespace, xmlNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlName() {
		return xmlName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlName(String newXmlName) {
		String oldXmlName = xmlName;
		xmlName = newXmlName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ENTITY__XML_NAME, oldXmlName, xmlName));
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
			case GenOrmPackage.GEN_ENTITY__GEN_PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenPartOf((GenOrmModel)otherEnd, msgs);
			case GenOrmPackage.GEN_ENTITY__GEN_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenFeatures()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	public void reconcile(final GenEntity oldGenEntity) {
		final Map<String, GenFeature> oldFeatures = new HashMap<String, GenFeature>();
		for (GenFeature oldFeature : oldGenEntity.getGenFeatures()) {
			try {
				oldFeatures.put(oldFeature.getName(), oldFeature);
			} catch (ClassCastException cce) { // feature type altered
			}
		}
		for (GenFeature newFeature : getGenFeatures()) {
			final String name = newFeature.getName();
			if (oldFeatures.containsKey(name)) {
				final GenFeature oldFeature = oldFeatures.get(name);
				if (newFeature instanceof GenSingletonElement) {
					if (oldFeature instanceof GenSingletonElement) {
						((GenSingletonElement) newFeature).reconcile((GenSingletonElement) oldFeature);
					}
				} else if (newFeature instanceof GenCollectionElement) {
					if (oldFeature instanceof GenCollectionElement) {
						((GenCollectionElement) newFeature).reconcile((GenCollectionElement) oldFeature);
					}
				} else if (newFeature instanceof GenSingletonDate) {
					if (oldFeature instanceof GenSingletonDate) {
						((GenSingletonDate) newFeature).reconcile((GenSingletonDate) oldFeature);
					}
				} else if (newFeature instanceof GenCollectionDate) {
					if (oldFeature instanceof GenCollectionDate) {
						((GenCollectionDate) newFeature).reconcile((GenCollectionDate) oldFeature);
					}
				} else if (newFeature instanceof GenSingletonAssociation) {
					if (oldFeature instanceof GenSingletonAssociation) {
						((GenSingletonAssociation) newFeature).reconcile((GenSingletonAssociation) oldFeature);
					}
				} else if (newFeature instanceof GenCollectionAssociation) {
					if (oldFeature instanceof GenCollectionAssociation) {
						((GenCollectionAssociation) newFeature).reconcile((GenCollectionAssociation) oldFeature);
					}
				} 
			}
		}

		reconcileSettings(oldGenEntity);
	}

	protected void reconcileSettings(final GenEntity oldGenEntity) {
		setTableName(oldGenEntity.getTableName());
		setKeyName(oldGenEntity.getKeyName());
		setXmlTransient(oldGenEntity.getXmlTransient());
		setXmlRootElement(oldGenEntity.getXmlRootElement());
		setXmlNamespace(oldGenEntity.getXmlNamespace());
		setXmlName(oldGenEntity.getXmlName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenOrmPackage.GEN_ENTITY__GEN_PART_OF:
				return basicSetGenPartOf(null, msgs);
			case GenOrmPackage.GEN_ENTITY__GEN_FEATURES:
				return ((InternalEList<?>)getGenFeatures()).basicRemove(otherEnd, msgs);
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
			case GenOrmPackage.GEN_ENTITY__GEN_PART_OF:
				return eInternalContainer().eInverseRemove(this, GenOrmPackage.GEN_ORM_MODEL__GEN_ENTITIES, GenOrmModel.class, msgs);
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
			case GenOrmPackage.GEN_ENTITY__ORM_ENTITY:
				if (resolve) return getOrmEntity();
				return basicGetOrmEntity();
			case GenOrmPackage.GEN_ENTITY__GEN_PART_OF:
				return getGenPartOf();
			case GenOrmPackage.GEN_ENTITY__DEFAULT_TABLE_NAME:
				return getDefaultTableName();
			case GenOrmPackage.GEN_ENTITY__TABLE_NAME:
				return getTableName();
			case GenOrmPackage.GEN_ENTITY__KEY_NAME:
				return getKeyName();
			case GenOrmPackage.GEN_ENTITY__GEN_FEATURES:
				return getGenFeatures();
			case GenOrmPackage.GEN_ENTITY__XML_TRANSIENT:
				return getXmlTransient();
			case GenOrmPackage.GEN_ENTITY__XML_ROOT_ELEMENT:
				return getXmlRootElement();
			case GenOrmPackage.GEN_ENTITY__XML_NAMESPACE:
				return getXmlNamespace();
			case GenOrmPackage.GEN_ENTITY__XML_NAME:
				return getXmlName();
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
			case GenOrmPackage.GEN_ENTITY__ORM_ENTITY:
				setOrmEntity((Entity)newValue);
				return;
			case GenOrmPackage.GEN_ENTITY__GEN_PART_OF:
				setGenPartOf((GenOrmModel)newValue);
				return;
			case GenOrmPackage.GEN_ENTITY__DEFAULT_TABLE_NAME:
				setDefaultTableName((String)newValue);
				return;
			case GenOrmPackage.GEN_ENTITY__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case GenOrmPackage.GEN_ENTITY__KEY_NAME:
				setKeyName((String)newValue);
				return;
			case GenOrmPackage.GEN_ENTITY__GEN_FEATURES:
				getGenFeatures().clear();
				getGenFeatures().addAll((Collection<? extends GenFeature>)newValue);
				return;
			case GenOrmPackage.GEN_ENTITY__XML_TRANSIENT:
				setXmlTransient((Boolean)newValue);
				return;
			case GenOrmPackage.GEN_ENTITY__XML_ROOT_ELEMENT:
				setXmlRootElement((Boolean)newValue);
				return;
			case GenOrmPackage.GEN_ENTITY__XML_NAMESPACE:
				setXmlNamespace((String)newValue);
				return;
			case GenOrmPackage.GEN_ENTITY__XML_NAME:
				setXmlName((String)newValue);
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
			case GenOrmPackage.GEN_ENTITY__ORM_ENTITY:
				setOrmEntity((Entity)null);
				return;
			case GenOrmPackage.GEN_ENTITY__GEN_PART_OF:
				setGenPartOf((GenOrmModel)null);
				return;
			case GenOrmPackage.GEN_ENTITY__DEFAULT_TABLE_NAME:
				setDefaultTableName(DEFAULT_TABLE_NAME_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ENTITY__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ENTITY__KEY_NAME:
				setKeyName(KEY_NAME_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ENTITY__GEN_FEATURES:
				getGenFeatures().clear();
				return;
			case GenOrmPackage.GEN_ENTITY__XML_TRANSIENT:
				setXmlTransient(XML_TRANSIENT_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ENTITY__XML_ROOT_ELEMENT:
				setXmlRootElement(XML_ROOT_ELEMENT_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ENTITY__XML_NAMESPACE:
				setXmlNamespace(XML_NAMESPACE_EDEFAULT);
				return;
			case GenOrmPackage.GEN_ENTITY__XML_NAME:
				setXmlName(XML_NAME_EDEFAULT);
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
			case GenOrmPackage.GEN_ENTITY__ORM_ENTITY:
				return ormEntity != null;
			case GenOrmPackage.GEN_ENTITY__GEN_PART_OF:
				return getGenPartOf() != null;
			case GenOrmPackage.GEN_ENTITY__DEFAULT_TABLE_NAME:
				return DEFAULT_TABLE_NAME_EDEFAULT == null ? defaultTableName != null : !DEFAULT_TABLE_NAME_EDEFAULT.equals(defaultTableName);
			case GenOrmPackage.GEN_ENTITY__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case GenOrmPackage.GEN_ENTITY__KEY_NAME:
				return KEY_NAME_EDEFAULT == null ? keyName != null : !KEY_NAME_EDEFAULT.equals(keyName);
			case GenOrmPackage.GEN_ENTITY__GEN_FEATURES:
				return genFeatures != null && !genFeatures.isEmpty();
			case GenOrmPackage.GEN_ENTITY__XML_TRANSIENT:
				return XML_TRANSIENT_EDEFAULT == null ? xmlTransient != null : !XML_TRANSIENT_EDEFAULT.equals(xmlTransient);
			case GenOrmPackage.GEN_ENTITY__XML_ROOT_ELEMENT:
				return XML_ROOT_ELEMENT_EDEFAULT == null ? xmlRootElement != null : !XML_ROOT_ELEMENT_EDEFAULT.equals(xmlRootElement);
			case GenOrmPackage.GEN_ENTITY__XML_NAMESPACE:
				return XML_NAMESPACE_EDEFAULT == null ? xmlNamespace != null : !XML_NAMESPACE_EDEFAULT.equals(xmlNamespace);
			case GenOrmPackage.GEN_ENTITY__XML_NAME:
				return XML_NAME_EDEFAULT == null ? xmlName != null : !XML_NAME_EDEFAULT.equals(xmlName);
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
		result.append(" (defaultTableName: ");
		result.append(defaultTableName);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", keyName: ");
		result.append(keyName);
		result.append(", xmlTransient: ");
		result.append(xmlTransient);
		result.append(", xmlRootElement: ");
		result.append(xmlRootElement);
		result.append(", xmlNamespace: ");
		result.append(xmlNamespace);
		result.append(", xmlName: ");
		result.append(xmlName);
		result.append(')');
		return result.toString();
	}

} //GenEntityImpl
