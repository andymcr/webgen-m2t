/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenCollectionElementImpl.java,v 1.7 2014/02/17 07:41:11 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genorm.GenCollectionElement;
import uk.ac.man.cs.mdsd.genorm.GenFeature;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;

import uk.ac.man.cs.mdsd.orm.CollectionElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Collection Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionElementImpl#getOrmFeature <em>Orm Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenCollectionElementImpl extends GenCollectionAttributeImpl implements GenCollectionElement {
	/**
	 * The cached value of the '{@link #getOrmFeature() <em>Orm Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmFeature()
	 * @generated
	 * @ordered
	 */
	protected CollectionElement ormFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCollectionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenOrmPackage.Literals.GEN_COLLECTION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionElement getOrmFeature() {
		if (ormFeature != null && ormFeature.eIsProxy()) {
			InternalEObject oldOrmFeature = (InternalEObject)ormFeature;
			ormFeature = (CollectionElement)eResolveProxy(oldOrmFeature);
			if (ormFeature != oldOrmFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenOrmPackage.GEN_COLLECTION_ELEMENT__ORM_FEATURE, oldOrmFeature, ormFeature));
			}
		}
		return ormFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionElement basicGetOrmFeature() {
		return ormFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrmFeature(CollectionElement newOrmFeature) {
		CollectionElement oldOrmFeature = ormFeature;
		ormFeature = newOrmFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_COLLECTION_ELEMENT__ORM_FEATURE, oldOrmFeature, ormFeature));
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
			case GenOrmPackage.GEN_COLLECTION_ELEMENT__ORM_FEATURE:
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
			case GenOrmPackage.GEN_COLLECTION_ELEMENT__ORM_FEATURE:
				setOrmFeature((CollectionElement)newValue);
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
			case GenOrmPackage.GEN_COLLECTION_ELEMENT__ORM_FEATURE:
				setOrmFeature((CollectionElement)null);
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
			case GenOrmPackage.GEN_COLLECTION_ELEMENT__ORM_FEATURE:
				return ormFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //GenCollectionElementImpl
