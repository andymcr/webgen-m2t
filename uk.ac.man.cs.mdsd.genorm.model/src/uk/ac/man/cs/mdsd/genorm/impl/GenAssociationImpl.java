/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenAssociationImpl.java,v 1.9 2014/02/17 07:41:11 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genorm.GenAssociation;
import uk.ac.man.cs.mdsd.genorm.GenFeature;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenAssociationImpl#getGenOpposite <em>Gen Opposite</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenAssociationImpl#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenAssociationImpl extends GenFeatureImpl implements GenAssociation {
	/**
	 * The cached value of the '{@link #getGenOpposite() <em>Gen Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenOpposite()
	 * @generated
	 * @ordered
	 */
	protected GenAssociation genOpposite;

	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenOrmPackage.Literals.GEN_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAssociation getGenOpposite() {
		if (genOpposite != null && genOpposite.eIsProxy()) {
			InternalEObject oldGenOpposite = (InternalEObject)genOpposite;
			genOpposite = (GenAssociation)eResolveProxy(oldGenOpposite);
			if (genOpposite != oldGenOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenOrmPackage.GEN_ASSOCIATION__GEN_OPPOSITE, oldGenOpposite, genOpposite));
			}
		}
		return genOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAssociation basicGetGenOpposite() {
		return genOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenOpposite(GenAssociation newGenOpposite, NotificationChain msgs) {
		GenAssociation oldGenOpposite = genOpposite;
		genOpposite = newGenOpposite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ASSOCIATION__GEN_OPPOSITE, oldGenOpposite, newGenOpposite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenOpposite(GenAssociation newGenOpposite) {
		if (newGenOpposite != genOpposite) {
			NotificationChain msgs = null;
			if (genOpposite != null)
				msgs = ((InternalEObject)genOpposite).eInverseRemove(this, GenOrmPackage.GEN_ASSOCIATION__GEN_OPPOSITE, GenAssociation.class, msgs);
			if (newGenOpposite != null)
				msgs = ((InternalEObject)newGenOpposite).eInverseAdd(this, GenOrmPackage.GEN_ASSOCIATION__GEN_OPPOSITE, GenAssociation.class, msgs);
			msgs = basicSetGenOpposite(newGenOpposite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ASSOCIATION__GEN_OPPOSITE, newGenOpposite, newGenOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_ASSOCIATION__FEATURE_NAME, oldFeatureName, featureName));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenOrmPackage.GEN_ASSOCIATION__GEN_OPPOSITE:
				if (genOpposite != null)
					msgs = ((InternalEObject)genOpposite).eInverseRemove(this, GenOrmPackage.GEN_ASSOCIATION__GEN_OPPOSITE, GenAssociation.class, msgs);
				return basicSetGenOpposite((GenAssociation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenOrmPackage.GEN_ASSOCIATION__GEN_OPPOSITE:
				return basicSetGenOpposite(null, msgs);
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
			case GenOrmPackage.GEN_ASSOCIATION__GEN_OPPOSITE:
				if (resolve) return getGenOpposite();
				return basicGetGenOpposite();
			case GenOrmPackage.GEN_ASSOCIATION__FEATURE_NAME:
				return getFeatureName();
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
			case GenOrmPackage.GEN_ASSOCIATION__GEN_OPPOSITE:
				setGenOpposite((GenAssociation)newValue);
				return;
			case GenOrmPackage.GEN_ASSOCIATION__FEATURE_NAME:
				setFeatureName((String)newValue);
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
			case GenOrmPackage.GEN_ASSOCIATION__GEN_OPPOSITE:
				setGenOpposite((GenAssociation)null);
				return;
			case GenOrmPackage.GEN_ASSOCIATION__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
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
			case GenOrmPackage.GEN_ASSOCIATION__GEN_OPPOSITE:
				return genOpposite != null;
			case GenOrmPackage.GEN_ASSOCIATION__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
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
		result.append(" (featureName: ");
		result.append(featureName);
		result.append(')');
		return result.toString();
	}

} //GenAssociationImpl
