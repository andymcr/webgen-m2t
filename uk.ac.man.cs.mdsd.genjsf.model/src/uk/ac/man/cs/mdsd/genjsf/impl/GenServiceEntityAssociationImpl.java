/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenServiceEntityAssociation;
import uk.ac.man.cs.mdsd.genjsf.GenServiceFeature;
import uk.ac.man.cs.mdsd.genorm.GenAssociation;
import uk.ac.man.cs.mdsd.jsf.ServiceEntityAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Service Entity Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityAssociationImpl#getJsfFeature <em>Jsf Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityAssociationImpl#getGenFeature <em>Gen Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenServiceEntityAssociationImpl extends GenServiceEntityFeatureImpl implements GenServiceEntityAssociation {
	/**
	 * The cached value of the '{@link #getJsfFeature() <em>Jsf Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfFeature()
	 * @generated
	 * @ordered
	 */
	protected ServiceEntityAssociation jsfFeature;
	/**
	 * The cached value of the '{@link #getGenFeature() <em>Gen Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenFeature()
	 * @generated
	 * @ordered
	 */
	protected GenAssociation genFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenServiceEntityAssociationImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	public void reconcile(final GenServiceFeature oldGenFeature) {
		super.reconcile(oldGenFeature);
	}

	/**
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenServiceFeature oldGenFeature) {
		super.reconcileSettings(oldGenFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_SERVICE_ENTITY_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityAssociation getJsfFeature() {
		if (jsfFeature != null && jsfFeature.eIsProxy()) {
			InternalEObject oldJsfFeature = (InternalEObject)jsfFeature;
			jsfFeature = (ServiceEntityAssociation)eResolveProxy(oldJsfFeature);
			if (jsfFeature != oldJsfFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_SERVICE_ENTITY_ASSOCIATION__JSF_FEATURE, oldJsfFeature, jsfFeature));
			}
		}
		return jsfFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityAssociation basicGetJsfFeature() {
		return jsfFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfFeature(ServiceEntityAssociation newJsfFeature) {
		ServiceEntityAssociation oldJsfFeature = jsfFeature;
		jsfFeature = newJsfFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_ENTITY_ASSOCIATION__JSF_FEATURE, oldJsfFeature, jsfFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAssociation getGenFeature() {
		if (genFeature != null && genFeature.eIsProxy()) {
			InternalEObject oldGenFeature = (InternalEObject)genFeature;
			genFeature = (GenAssociation)eResolveProxy(oldGenFeature);
			if (genFeature != oldGenFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_SERVICE_ENTITY_ASSOCIATION__GEN_FEATURE, oldGenFeature, genFeature));
			}
		}
		return genFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAssociation basicGetGenFeature() {
		return genFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenFeature(GenAssociation newGenFeature) {
		GenAssociation oldGenFeature = genFeature;
		genFeature = newGenFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_ENTITY_ASSOCIATION__GEN_FEATURE, oldGenFeature, genFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_SERVICE_ENTITY_ASSOCIATION__JSF_FEATURE:
				if (resolve) return getJsfFeature();
				return basicGetJsfFeature();
			case GenJsfPackage.GEN_SERVICE_ENTITY_ASSOCIATION__GEN_FEATURE:
				if (resolve) return getGenFeature();
				return basicGetGenFeature();
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
			case GenJsfPackage.GEN_SERVICE_ENTITY_ASSOCIATION__JSF_FEATURE:
				setJsfFeature((ServiceEntityAssociation)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE_ENTITY_ASSOCIATION__GEN_FEATURE:
				setGenFeature((GenAssociation)newValue);
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
			case GenJsfPackage.GEN_SERVICE_ENTITY_ASSOCIATION__JSF_FEATURE:
				setJsfFeature((ServiceEntityAssociation)null);
				return;
			case GenJsfPackage.GEN_SERVICE_ENTITY_ASSOCIATION__GEN_FEATURE:
				setGenFeature((GenAssociation)null);
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
			case GenJsfPackage.GEN_SERVICE_ENTITY_ASSOCIATION__JSF_FEATURE:
				return jsfFeature != null;
			case GenJsfPackage.GEN_SERVICE_ENTITY_ASSOCIATION__GEN_FEATURE:
				return genFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //GenServiceEntityAssociationImpl
