/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenCollectionDateImpl.java,v 1.7 2014/02/17 07:41:11 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genorm.GenCollectionDate;
import uk.ac.man.cs.mdsd.genorm.GenFeature;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;

import uk.ac.man.cs.mdsd.orm.CollectionDate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Collection Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionDateImpl#getOrmFeature <em>Orm Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenCollectionDateImpl extends GenCollectionAttributeImpl implements GenCollectionDate {
	/**
	 * The cached value of the '{@link #getOrmFeature() <em>Orm Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmFeature()
	 * @generated
	 * @ordered
	 */
	protected CollectionDate ormFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCollectionDateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenOrmPackage.Literals.GEN_COLLECTION_DATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionDate getOrmFeature() {
		if (ormFeature != null && ormFeature.eIsProxy()) {
			InternalEObject oldOrmFeature = (InternalEObject)ormFeature;
			ormFeature = (CollectionDate)eResolveProxy(oldOrmFeature);
			if (ormFeature != oldOrmFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenOrmPackage.GEN_COLLECTION_DATE__ORM_FEATURE, oldOrmFeature, ormFeature));
			}
		}
		return ormFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionDate basicGetOrmFeature() {
		return ormFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrmFeature(CollectionDate newOrmFeature) {
		CollectionDate oldOrmFeature = ormFeature;
		ormFeature = newOrmFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_COLLECTION_DATE__ORM_FEATURE, oldOrmFeature, ormFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void reconcile(final GenFeature oldGenFeature) {
		super.reconcile(oldGenFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenFeature oldGenFeature) {
		super.reconcileSettings(oldGenFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenOrmPackage.GEN_COLLECTION_DATE__ORM_FEATURE:
				if (resolve) return getOrmFeature();
				return basicGetOrmFeature();
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
			case GenOrmPackage.GEN_COLLECTION_DATE__ORM_FEATURE:
				setOrmFeature((CollectionDate)newValue);
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
			case GenOrmPackage.GEN_COLLECTION_DATE__ORM_FEATURE:
				setOrmFeature((CollectionDate)null);
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
			case GenOrmPackage.GEN_COLLECTION_DATE__ORM_FEATURE:
				return ormFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //GenCollectionDateImpl
