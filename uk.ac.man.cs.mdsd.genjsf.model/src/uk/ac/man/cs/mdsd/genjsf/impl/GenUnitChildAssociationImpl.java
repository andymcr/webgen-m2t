/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenServiceAssociation;
import uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation;
import uk.ac.man.cs.mdsd.genjsf.GenUnitChildFeature;

import uk.ac.man.cs.mdsd.jsf.UnitChildAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Unit Child Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildAssociationImpl#getJsfChildFeature <em>Jsf Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildAssociationImpl#getGenServiceFeature <em>Gen Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitChildAssociationImpl#getGenChildFeature <em>Gen Child Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenUnitChildAssociationImpl extends GenUnitChildFeatureImpl implements GenUnitChildAssociation {
	/**
	 * The cached value of the '{@link #getJsfChildFeature() <em>Jsf Child Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfChildFeature()
	 * @generated
	 * @ordered
	 */
	protected UnitChildAssociation jsfChildFeature;

	/**
	 * The cached value of the '{@link #getGenServiceFeature() <em>Gen Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenServiceFeature()
	 * @generated
	 * @ordered
	 */
	protected GenServiceAssociation genServiceFeature;

	/**
	 * The cached value of the '{@link #getGenChildFeature() <em>Gen Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenChildFeature()
	 * @generated
	 * @ordered
	 */
	protected GenUnitChildFeature genChildFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenUnitChildAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_UNIT_CHILD_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitChildAssociation getJsfChildFeature() {
		if (jsfChildFeature != null && jsfChildFeature.eIsProxy()) {
			InternalEObject oldJsfChildFeature = (InternalEObject)jsfChildFeature;
			jsfChildFeature = (UnitChildAssociation)eResolveProxy(oldJsfChildFeature);
			if (jsfChildFeature != oldJsfChildFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__JSF_CHILD_FEATURE, oldJsfChildFeature, jsfChildFeature));
			}
		}
		return jsfChildFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitChildAssociation basicGetJsfChildFeature() {
		return jsfChildFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfChildFeature(UnitChildAssociation newJsfChildFeature) {
		UnitChildAssociation oldJsfChildFeature = jsfChildFeature;
		jsfChildFeature = newJsfChildFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__JSF_CHILD_FEATURE, oldJsfChildFeature, jsfChildFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceAssociation getGenServiceFeature() {
		if (genServiceFeature != null && genServiceFeature.eIsProxy()) {
			InternalEObject oldGenServiceFeature = (InternalEObject)genServiceFeature;
			genServiceFeature = (GenServiceAssociation)eResolveProxy(oldGenServiceFeature);
			if (genServiceFeature != oldGenServiceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_SERVICE_FEATURE, oldGenServiceFeature, genServiceFeature));
			}
		}
		return genServiceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceAssociation basicGetGenServiceFeature() {
		return genServiceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenServiceFeature(GenServiceAssociation newGenServiceFeature) {
		GenServiceAssociation oldGenServiceFeature = genServiceFeature;
		genServiceFeature = newGenServiceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_SERVICE_FEATURE, oldGenServiceFeature, genServiceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitChildFeature getGenChildFeature() {
		return genChildFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenChildFeature(GenUnitChildFeature newGenChildFeature, NotificationChain msgs) {
		GenUnitChildFeature oldGenChildFeature = genChildFeature;
		genChildFeature = newGenChildFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_CHILD_FEATURE, oldGenChildFeature, newGenChildFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenChildFeature(GenUnitChildFeature newGenChildFeature) {
		if (newGenChildFeature != genChildFeature) {
			NotificationChain msgs = null;
			if (genChildFeature != null)
				msgs = ((InternalEObject)genChildFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_CHILD_FEATURE, null, msgs);
			if (newGenChildFeature != null)
				msgs = ((InternalEObject)newGenChildFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_CHILD_FEATURE, null, msgs);
			msgs = basicSetGenChildFeature(newGenChildFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_CHILD_FEATURE, newGenChildFeature, newGenChildFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_CHILD_FEATURE:
				return basicSetGenChildFeature(null, msgs);
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
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__JSF_CHILD_FEATURE:
				if (resolve) return getJsfChildFeature();
				return basicGetJsfChildFeature();
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_SERVICE_FEATURE:
				if (resolve) return getGenServiceFeature();
				return basicGetGenServiceFeature();
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_CHILD_FEATURE:
				return getGenChildFeature();
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
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__JSF_CHILD_FEATURE:
				setJsfChildFeature((UnitChildAssociation)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_SERVICE_FEATURE:
				setGenServiceFeature((GenServiceAssociation)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_CHILD_FEATURE:
				setGenChildFeature((GenUnitChildFeature)newValue);
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
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__JSF_CHILD_FEATURE:
				setJsfChildFeature((UnitChildAssociation)null);
				return;
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_SERVICE_FEATURE:
				setGenServiceFeature((GenServiceAssociation)null);
				return;
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_CHILD_FEATURE:
				setGenChildFeature((GenUnitChildFeature)null);
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
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__JSF_CHILD_FEATURE:
				return jsfChildFeature != null;
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_SERVICE_FEATURE:
				return genServiceFeature != null;
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION__GEN_CHILD_FEATURE:
				return genChildFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //GenUnitChildAssociationImpl
