/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenSingletonElementImpl.java,v 1.8 2014/02/17 07:41:11 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genorm.GenDataType;
import uk.ac.man.cs.mdsd.genorm.GenFeature;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;
import uk.ac.man.cs.mdsd.genorm.GenSingletonElement;

import uk.ac.man.cs.mdsd.orm.SingletonElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Singleton Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonElementImpl#getOrmFeature <em>Orm Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonElementImpl#getGenDataType <em>Gen Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenSingletonElementImpl extends GenSingletonAttributeImpl implements GenSingletonElement {
	/**
	 * The cached value of the '{@link #getOrmFeature() <em>Orm Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmFeature()
	 * @generated
	 * @ordered
	 */
	protected SingletonElement ormFeature;

	/**
	 * The cached value of the '{@link #getGenDataType() <em>Gen Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDataType()
	 * @generated
	 * @ordered
	 */
	protected GenDataType genDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenSingletonElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenOrmPackage.Literals.GEN_SINGLETON_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonElement getOrmFeature() {
		if (ormFeature != null && ormFeature.eIsProxy()) {
			InternalEObject oldOrmFeature = (InternalEObject)ormFeature;
			ormFeature = (SingletonElement)eResolveProxy(oldOrmFeature);
			if (ormFeature != oldOrmFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenOrmPackage.GEN_SINGLETON_ELEMENT__ORM_FEATURE, oldOrmFeature, ormFeature));
			}
		}
		return ormFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonElement basicGetOrmFeature() {
		return ormFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrmFeature(SingletonElement newOrmFeature) {
		SingletonElement oldOrmFeature = ormFeature;
		ormFeature = newOrmFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_SINGLETON_ELEMENT__ORM_FEATURE, oldOrmFeature, ormFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDataType getGenDataType() {
		if (genDataType != null && genDataType.eIsProxy()) {
			InternalEObject oldGenDataType = (InternalEObject)genDataType;
			genDataType = (GenDataType)eResolveProxy(oldGenDataType);
			if (genDataType != oldGenDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenOrmPackage.GEN_SINGLETON_ELEMENT__GEN_DATA_TYPE, oldGenDataType, genDataType));
			}
		}
		return genDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDataType basicGetGenDataType() {
		return genDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenDataType(GenDataType newGenDataType) {
		GenDataType oldGenDataType = genDataType;
		genDataType = newGenDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_SINGLETON_ELEMENT__GEN_DATA_TYPE, oldGenDataType, genDataType));
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
			case GenOrmPackage.GEN_SINGLETON_ELEMENT__ORM_FEATURE:
				if (resolve) return getOrmFeature();
				return basicGetOrmFeature();
			case GenOrmPackage.GEN_SINGLETON_ELEMENT__GEN_DATA_TYPE:
				if (resolve) return getGenDataType();
				return basicGetGenDataType();
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
			case GenOrmPackage.GEN_SINGLETON_ELEMENT__ORM_FEATURE:
				setOrmFeature((SingletonElement)newValue);
				return;
			case GenOrmPackage.GEN_SINGLETON_ELEMENT__GEN_DATA_TYPE:
				setGenDataType((GenDataType)newValue);
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
			case GenOrmPackage.GEN_SINGLETON_ELEMENT__ORM_FEATURE:
				setOrmFeature((SingletonElement)null);
				return;
			case GenOrmPackage.GEN_SINGLETON_ELEMENT__GEN_DATA_TYPE:
				setGenDataType((GenDataType)null);
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
			case GenOrmPackage.GEN_SINGLETON_ELEMENT__ORM_FEATURE:
				return ormFeature != null;
			case GenOrmPackage.GEN_SINGLETON_ELEMENT__GEN_DATA_TYPE:
				return genDataType != null;
		}
		return super.eIsSet(featureID);
	}

} //GenSingletonElementImpl
