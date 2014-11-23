/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenService;
import uk.ac.man.cs.mdsd.genjsf.GenServiceAssociation;
import uk.ac.man.cs.mdsd.genjsf.GenServiceFeature;
import uk.ac.man.cs.mdsd.genjsf.GenServiceViewAssociation;

import uk.ac.man.cs.mdsd.jsf.ServiceAssociation;
import uk.ac.man.cs.mdsd.jsf.ServiceViewAssociation;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Service View Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceViewAssociationImpl#getGenIncludedBy <em>Gen Included By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceViewAssociationImpl#getJsfFeature <em>Jsf Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceViewAssociationImpl#getGenTargetFeature <em>Gen Target Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenServiceViewAssociationImpl extends NamedElementImpl implements GenServiceViewAssociation {
	/**
	 * The cached value of the '{@link #getJsfFeature() <em>Jsf Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfFeature()
	 * @generated
	 * @ordered
	 */
	protected ServiceViewAssociation jsfFeature;
	/**
	 * The cached value of the '{@link #getGenTargetFeature() <em>Gen Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenTargetFeature()
	 * @generated
	 * @ordered
	 */
	protected GenServiceAssociation genTargetFeature;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenServiceViewAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_SERVICE_VIEW_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService getGenIncludedBy() {
		if (eContainerFeatureID() != GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_INCLUDED_BY) return null;
		return (GenService)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenIncludedBy(GenService newGenIncludedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenIncludedBy, GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_INCLUDED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenIncludedBy(GenService newGenIncludedBy) {
		if (newGenIncludedBy != eInternalContainer() || (eContainerFeatureID() != GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_INCLUDED_BY && newGenIncludedBy != null)) {
			if (EcoreUtil.isAncestor(this, newGenIncludedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenIncludedBy != null)
				msgs = ((InternalEObject)newGenIncludedBy).eInverseAdd(this, GenJsfPackage.GEN_SERVICE__GEN_FEATURES, GenService.class, msgs);
			msgs = basicSetGenIncludedBy(newGenIncludedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_INCLUDED_BY, newGenIncludedBy, newGenIncludedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceViewAssociation getJsfFeature() {
		if (jsfFeature != null && jsfFeature.eIsProxy()) {
			InternalEObject oldJsfFeature = (InternalEObject)jsfFeature;
			jsfFeature = (ServiceViewAssociation)eResolveProxy(oldJsfFeature);
			if (jsfFeature != oldJsfFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__JSF_FEATURE, oldJsfFeature, jsfFeature));
			}
		}
		return jsfFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceViewAssociation basicGetJsfFeature() {
		return jsfFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfFeature(ServiceViewAssociation newJsfFeature) {
		ServiceViewAssociation oldJsfFeature = jsfFeature;
		jsfFeature = newJsfFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__JSF_FEATURE, oldJsfFeature, jsfFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceAssociation getGenTargetFeature() {
		if (genTargetFeature != null && genTargetFeature.eIsProxy()) {
			InternalEObject oldGenTargetFeature = (InternalEObject)genTargetFeature;
			genTargetFeature = (GenServiceAssociation)eResolveProxy(oldGenTargetFeature);
			if (genTargetFeature != oldGenTargetFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_TARGET_FEATURE, oldGenTargetFeature, genTargetFeature));
			}
		}
		return genTargetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceAssociation basicGetGenTargetFeature() {
		return genTargetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenTargetFeature(GenServiceAssociation newGenTargetFeature) {
		GenServiceAssociation oldGenTargetFeature = genTargetFeature;
		genTargetFeature = newGenTargetFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_TARGET_FEATURE, oldGenTargetFeature, genTargetFeature));
	}

	/**
	 * @generated NOT
	 */
	public void reconcile(final GenServiceFeature oldGenFeature) {
		reconcileSettings(oldGenFeature);
	}

	/**
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenServiceFeature oldGenFeature) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_INCLUDED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenIncludedBy((GenService)otherEnd, msgs);
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
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_INCLUDED_BY:
				return basicSetGenIncludedBy(null, msgs);
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
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_INCLUDED_BY:
				return eInternalContainer().eInverseRemove(this, GenJsfPackage.GEN_SERVICE__GEN_FEATURES, GenService.class, msgs);
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
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_INCLUDED_BY:
				return getGenIncludedBy();
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__JSF_FEATURE:
				if (resolve) return getJsfFeature();
				return basicGetJsfFeature();
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_TARGET_FEATURE:
				if (resolve) return getGenTargetFeature();
				return basicGetGenTargetFeature();
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
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_INCLUDED_BY:
				setGenIncludedBy((GenService)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__JSF_FEATURE:
				setJsfFeature((ServiceViewAssociation)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_TARGET_FEATURE:
				setGenTargetFeature((GenServiceAssociation)newValue);
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
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_INCLUDED_BY:
				setGenIncludedBy((GenService)null);
				return;
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__JSF_FEATURE:
				setJsfFeature((ServiceViewAssociation)null);
				return;
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_TARGET_FEATURE:
				setGenTargetFeature((GenServiceAssociation)null);
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
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_INCLUDED_BY:
				return getGenIncludedBy() != null;
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__JSF_FEATURE:
				return jsfFeature != null;
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_TARGET_FEATURE:
				return genTargetFeature != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GenServiceFeature.class) {
			switch (derivedFeatureID) {
				case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_INCLUDED_BY: return GenJsfPackage.GEN_SERVICE_FEATURE__GEN_INCLUDED_BY;
				default: return -1;
			}
		}
		if (baseClass == GenServiceAssociation.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GenServiceFeature.class) {
			switch (baseFeatureID) {
				case GenJsfPackage.GEN_SERVICE_FEATURE__GEN_INCLUDED_BY: return GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION__GEN_INCLUDED_BY;
				default: return -1;
			}
		}
		if (baseClass == GenServiceAssociation.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GenServiceViewAssociationImpl
