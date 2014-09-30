/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenCollectionTypeImpl.java,v 1.6 2014/02/17 07:41:11 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.genorm.GenCollectionType;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;

import uk.ac.man.cs.mdsd.orm.CollectionType;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionTypeImpl#getOrmCollectionType <em>Orm Collection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenCollectionTypeImpl extends NamedElementImpl implements GenCollectionType {
	/**
	 * The cached value of the '{@link #getOrmCollectionType() <em>Orm Collection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmCollectionType()
	 * @generated
	 * @ordered
	 */
	protected CollectionType ormCollectionType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenOrmPackage.Literals.GEN_COLLECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType getOrmCollectionType() {
		if (ormCollectionType != null && ormCollectionType.eIsProxy()) {
			InternalEObject oldOrmCollectionType = (InternalEObject)ormCollectionType;
			ormCollectionType = (CollectionType)eResolveProxy(oldOrmCollectionType);
			if (ormCollectionType != oldOrmCollectionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenOrmPackage.GEN_COLLECTION_TYPE__ORM_COLLECTION_TYPE, oldOrmCollectionType, ormCollectionType));
			}
		}
		return ormCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType basicGetOrmCollectionType() {
		return ormCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrmCollectionType(CollectionType newOrmCollectionType) {
		CollectionType oldOrmCollectionType = ormCollectionType;
		ormCollectionType = newOrmCollectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_COLLECTION_TYPE__ORM_COLLECTION_TYPE, oldOrmCollectionType, ormCollectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void reconcile(final GenCollectionType oldGenCollectionType) {
		reconcileSettings(oldGenCollectionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenCollectionType oldGenCollectionType) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenOrmPackage.GEN_COLLECTION_TYPE__ORM_COLLECTION_TYPE:
				if (resolve) return getOrmCollectionType();
				return basicGetOrmCollectionType();
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
			case GenOrmPackage.GEN_COLLECTION_TYPE__ORM_COLLECTION_TYPE:
				setOrmCollectionType((CollectionType)newValue);
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
			case GenOrmPackage.GEN_COLLECTION_TYPE__ORM_COLLECTION_TYPE:
				setOrmCollectionType((CollectionType)null);
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
			case GenOrmPackage.GEN_COLLECTION_TYPE__ORM_COLLECTION_TYPE:
				return ormCollectionType != null;
		}
		return super.eIsSet(featureID);
	}

} //GenCollectionTypeImpl
