/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenDataTypeImpl.java,v 1.11 2014/02/17 07:41:11 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.genorm.GenDataType;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;

import uk.ac.man.cs.mdsd.orm.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenDataTypeImpl#getOrmDataType <em>Orm Data Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenDataTypeImpl#getJavaType <em>Java Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenDataTypeImpl#getJavaDefaultValue <em>Java Default Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenDataTypeImpl#getPersistenceType <em>Persistence Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenDataTypeImpl extends GenClassifierImpl implements GenDataType {
	/**
	 * The cached value of the '{@link #getOrmDataType() <em>Orm Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType ormDataType;

	/**
	 * The default value of the '{@link #getJavaType() <em>Java Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaType()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaType() <em>Java Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaType()
	 * @generated
	 * @ordered
	 */
	protected String javaType = JAVA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaDefaultValue() <em>Java Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaDefaultValue() <em>Java Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String javaDefaultValue = JAVA_DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTENCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected String persistenceType = PERSISTENCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenOrmPackage.Literals.GEN_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOrmDataType() {
		if (ormDataType != null && ormDataType.eIsProxy()) {
			InternalEObject oldOrmDataType = (InternalEObject)ormDataType;
			ormDataType = (DataType)eResolveProxy(oldOrmDataType);
			if (ormDataType != oldOrmDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenOrmPackage.GEN_DATA_TYPE__ORM_DATA_TYPE, oldOrmDataType, ormDataType));
			}
		}
		return ormDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetOrmDataType() {
		return ormDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrmDataType(DataType newOrmDataType) {
		DataType oldOrmDataType = ormDataType;
		ormDataType = newOrmDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_DATA_TYPE__ORM_DATA_TYPE, oldOrmDataType, ormDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaType() {
		return javaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaType(String newJavaType) {
		String oldJavaType = javaType;
		javaType = newJavaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_DATA_TYPE__JAVA_TYPE, oldJavaType, javaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaDefaultValue() {
		return javaDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaDefaultValue(String newJavaDefaultValue) {
		String oldJavaDefaultValue = javaDefaultValue;
		javaDefaultValue = newJavaDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_DATA_TYPE__JAVA_DEFAULT_VALUE, oldJavaDefaultValue, javaDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersistenceType() {
		return persistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceType(String newPersistenceType) {
		String oldPersistenceType = persistenceType;
		persistenceType = newPersistenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_DATA_TYPE__PERSISTENCE_TYPE, oldPersistenceType, persistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void reconcile(final GenDataType oldGenDataType) {
		reconcileSettings(oldGenDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenDataType oldGenDataType) {
		setJavaType(oldGenDataType.getJavaType());
		setJavaDefaultValue(oldGenDataType.getJavaDefaultValue());
		setPersistenceType(oldGenDataType.getPersistenceType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenOrmPackage.GEN_DATA_TYPE__ORM_DATA_TYPE:
				if (resolve) return getOrmDataType();
				return basicGetOrmDataType();
			case GenOrmPackage.GEN_DATA_TYPE__JAVA_TYPE:
				return getJavaType();
			case GenOrmPackage.GEN_DATA_TYPE__JAVA_DEFAULT_VALUE:
				return getJavaDefaultValue();
			case GenOrmPackage.GEN_DATA_TYPE__PERSISTENCE_TYPE:
				return getPersistenceType();
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
			case GenOrmPackage.GEN_DATA_TYPE__ORM_DATA_TYPE:
				setOrmDataType((DataType)newValue);
				return;
			case GenOrmPackage.GEN_DATA_TYPE__JAVA_TYPE:
				setJavaType((String)newValue);
				return;
			case GenOrmPackage.GEN_DATA_TYPE__JAVA_DEFAULT_VALUE:
				setJavaDefaultValue((String)newValue);
				return;
			case GenOrmPackage.GEN_DATA_TYPE__PERSISTENCE_TYPE:
				setPersistenceType((String)newValue);
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
			case GenOrmPackage.GEN_DATA_TYPE__ORM_DATA_TYPE:
				setOrmDataType((DataType)null);
				return;
			case GenOrmPackage.GEN_DATA_TYPE__JAVA_TYPE:
				setJavaType(JAVA_TYPE_EDEFAULT);
				return;
			case GenOrmPackage.GEN_DATA_TYPE__JAVA_DEFAULT_VALUE:
				setJavaDefaultValue(JAVA_DEFAULT_VALUE_EDEFAULT);
				return;
			case GenOrmPackage.GEN_DATA_TYPE__PERSISTENCE_TYPE:
				setPersistenceType(PERSISTENCE_TYPE_EDEFAULT);
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
			case GenOrmPackage.GEN_DATA_TYPE__ORM_DATA_TYPE:
				return ormDataType != null;
			case GenOrmPackage.GEN_DATA_TYPE__JAVA_TYPE:
				return JAVA_TYPE_EDEFAULT == null ? javaType != null : !JAVA_TYPE_EDEFAULT.equals(javaType);
			case GenOrmPackage.GEN_DATA_TYPE__JAVA_DEFAULT_VALUE:
				return JAVA_DEFAULT_VALUE_EDEFAULT == null ? javaDefaultValue != null : !JAVA_DEFAULT_VALUE_EDEFAULT.equals(javaDefaultValue);
			case GenOrmPackage.GEN_DATA_TYPE__PERSISTENCE_TYPE:
				return PERSISTENCE_TYPE_EDEFAULT == null ? persistenceType != null : !PERSISTENCE_TYPE_EDEFAULT.equals(persistenceType);
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
		result.append(" (javaType: ");
		result.append(javaType);
		result.append(", javaDefaultValue: ");
		result.append(javaDefaultValue);
		result.append(", persistenceType: ");
		result.append(persistenceType);
		result.append(')');
		return result.toString();
	}

} //GenDataTypeImpl
