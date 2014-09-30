/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenCollectionAssociationImpl.java,v 1.10 2014/02/17 07:41:11 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation;
import uk.ac.man.cs.mdsd.genorm.GenFeature;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;

import uk.ac.man.cs.mdsd.orm.CollectionAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Collection Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionAssociationImpl#getOrmFeature <em>Orm Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionAssociationImpl#getPivotTableName <em>Pivot Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenCollectionAssociationImpl#getPivotColumnName <em>Pivot Column Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenCollectionAssociationImpl extends GenAssociationImpl implements GenCollectionAssociation {
	/**
	 * The cached value of the '{@link #getOrmFeature() <em>Orm Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmFeature()
	 * @generated
	 * @ordered
	 */
	protected CollectionAssociation ormFeature;

	/**
	 * The default value of the '{@link #getPivotTableName() <em>Pivot Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPivotTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String PIVOT_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPivotTableName() <em>Pivot Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPivotTableName()
	 * @generated
	 * @ordered
	 */
	protected String pivotTableName = PIVOT_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPivotColumnName() <em>Pivot Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPivotColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String PIVOT_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPivotColumnName() <em>Pivot Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPivotColumnName()
	 * @generated
	 * @ordered
	 */
	protected String pivotColumnName = PIVOT_COLUMN_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCollectionAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenOrmPackage.Literals.GEN_COLLECTION_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionAssociation getOrmFeature() {
		if (ormFeature != null && ormFeature.eIsProxy()) {
			InternalEObject oldOrmFeature = (InternalEObject)ormFeature;
			ormFeature = (CollectionAssociation)eResolveProxy(oldOrmFeature);
			if (ormFeature != oldOrmFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenOrmPackage.GEN_COLLECTION_ASSOCIATION__ORM_FEATURE, oldOrmFeature, ormFeature));
			}
		}
		return ormFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionAssociation basicGetOrmFeature() {
		return ormFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrmFeature(CollectionAssociation newOrmFeature) {
		CollectionAssociation oldOrmFeature = ormFeature;
		ormFeature = newOrmFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_COLLECTION_ASSOCIATION__ORM_FEATURE, oldOrmFeature, ormFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPivotTableName() {
		return pivotTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPivotTableName(String newPivotTableName) {
		String oldPivotTableName = pivotTableName;
		pivotTableName = newPivotTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_COLLECTION_ASSOCIATION__PIVOT_TABLE_NAME, oldPivotTableName, pivotTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPivotColumnName() {
		return pivotColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPivotColumnName(String newPivotColumnName) {
		String oldPivotColumnName = pivotColumnName;
		pivotColumnName = newPivotColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_COLLECTION_ASSOCIATION__PIVOT_COLUMN_NAME, oldPivotColumnName, pivotColumnName));
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

		if (oldGenFeature instanceof GenCollectionAssociation) {
			final GenCollectionAssociation oldGenAssociation = (GenCollectionAssociation) oldGenFeature;
			if ((oldGenAssociation.getPivotTableName() != null) && !oldGenAssociation.getPivotTableName().equals("")) {
				setPivotTableName(oldGenAssociation.getPivotTableName());
			}
			if ((oldGenAssociation.getPivotColumnName() != null) && !oldGenAssociation.getPivotColumnName().equals("")) {
				setPivotColumnName(oldGenAssociation.getPivotColumnName());
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenOrmPackage.GEN_COLLECTION_ASSOCIATION__ORM_FEATURE:
				if (resolve) return getOrmFeature();
				return basicGetOrmFeature();
			case GenOrmPackage.GEN_COLLECTION_ASSOCIATION__PIVOT_TABLE_NAME:
				return getPivotTableName();
			case GenOrmPackage.GEN_COLLECTION_ASSOCIATION__PIVOT_COLUMN_NAME:
				return getPivotColumnName();
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
			case GenOrmPackage.GEN_COLLECTION_ASSOCIATION__ORM_FEATURE:
				setOrmFeature((CollectionAssociation)newValue);
				return;
			case GenOrmPackage.GEN_COLLECTION_ASSOCIATION__PIVOT_TABLE_NAME:
				setPivotTableName((String)newValue);
				return;
			case GenOrmPackage.GEN_COLLECTION_ASSOCIATION__PIVOT_COLUMN_NAME:
				setPivotColumnName((String)newValue);
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
			case GenOrmPackage.GEN_COLLECTION_ASSOCIATION__ORM_FEATURE:
				setOrmFeature((CollectionAssociation)null);
				return;
			case GenOrmPackage.GEN_COLLECTION_ASSOCIATION__PIVOT_TABLE_NAME:
				setPivotTableName(PIVOT_TABLE_NAME_EDEFAULT);
				return;
			case GenOrmPackage.GEN_COLLECTION_ASSOCIATION__PIVOT_COLUMN_NAME:
				setPivotColumnName(PIVOT_COLUMN_NAME_EDEFAULT);
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
			case GenOrmPackage.GEN_COLLECTION_ASSOCIATION__ORM_FEATURE:
				return ormFeature != null;
			case GenOrmPackage.GEN_COLLECTION_ASSOCIATION__PIVOT_TABLE_NAME:
				return PIVOT_TABLE_NAME_EDEFAULT == null ? pivotTableName != null : !PIVOT_TABLE_NAME_EDEFAULT.equals(pivotTableName);
			case GenOrmPackage.GEN_COLLECTION_ASSOCIATION__PIVOT_COLUMN_NAME:
				return PIVOT_COLUMN_NAME_EDEFAULT == null ? pivotColumnName != null : !PIVOT_COLUMN_NAME_EDEFAULT.equals(pivotColumnName);
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
		result.append(" (pivotTableName: ");
		result.append(pivotTableName);
		result.append(", pivotColumnName: ");
		result.append(pivotColumnName);
		result.append(')');
		return result.toString();
	}

} //GenCollectionAssociationImpl
