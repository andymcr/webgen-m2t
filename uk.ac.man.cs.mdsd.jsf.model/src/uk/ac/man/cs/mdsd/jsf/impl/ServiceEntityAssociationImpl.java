/**
 */
package uk.ac.man.cs.mdsd.jsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.jsf.IncludedAssociation;
import uk.ac.man.cs.mdsd.jsf.JsfPackage;
import uk.ac.man.cs.mdsd.jsf.Service;
import uk.ac.man.cs.mdsd.jsf.ServiceAssociation;
import uk.ac.man.cs.mdsd.jsf.ServiceEntityAssociation;
import uk.ac.man.cs.mdsd.orm.Association;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Entity Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityAssociationImpl#getOppositeService <em>Opposite Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityAssociationImpl#getOppositeFeature <em>Opposite Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityAssociationImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceEntityAssociationImpl extends ServiceEntityFeatureImpl implements ServiceEntityAssociation {
	/**
	 * The cached value of the '{@link #getOppositeService() <em>Opposite Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositeService()
	 * @generated
	 * @ordered
	 */
	protected Service oppositeService;
	/**
	 * The cached value of the '{@link #getOppositeFeature() <em>Opposite Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositeFeature()
	 * @generated
	 * @ordered
	 */
	protected ServiceAssociation oppositeFeature;
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Association feature;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceEntityAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsfPackage.Literals.SERVICE_ENTITY_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getOppositeService() {
		if (oppositeService != null && oppositeService.eIsProxy()) {
			InternalEObject oldOppositeService = (InternalEObject)oppositeService;
			oppositeService = (Service)eResolveProxy(oldOppositeService);
			if (oppositeService != oldOppositeService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE, oldOppositeService, oppositeService));
			}
		}
		return oppositeService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetOppositeService() {
		return oppositeService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppositeService(Service newOppositeService) {
		Service oldOppositeService = oppositeService;
		oppositeService = newOppositeService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE, oldOppositeService, oppositeService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAssociation getOppositeFeature() {
		if (oppositeFeature != null && oppositeFeature.eIsProxy()) {
			InternalEObject oldOppositeFeature = (InternalEObject)oppositeFeature;
			oppositeFeature = (ServiceAssociation)eResolveProxy(oldOppositeFeature);
			if (oppositeFeature != oldOppositeFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE, oldOppositeFeature, oppositeFeature));
			}
		}
		return oppositeFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAssociation basicGetOppositeFeature() {
		return oppositeFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppositeFeature(ServiceAssociation newOppositeFeature) {
		ServiceAssociation oldOppositeFeature = oppositeFeature;
		oppositeFeature = newOppositeFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE, oldOppositeFeature, oppositeFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (Association)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.SERVICE_ENTITY_ASSOCIATION__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Association newFeature) {
		Association oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_ASSOCIATION__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE:
				if (resolve) return getOppositeService();
				return basicGetOppositeService();
			case JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE:
				if (resolve) return getOppositeFeature();
				return basicGetOppositeFeature();
			case JsfPackage.SERVICE_ENTITY_ASSOCIATION__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
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
			case JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE:
				setOppositeService((Service)newValue);
				return;
			case JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE:
				setOppositeFeature((ServiceAssociation)newValue);
				return;
			case JsfPackage.SERVICE_ENTITY_ASSOCIATION__FEATURE:
				setFeature((Association)newValue);
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
			case JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE:
				setOppositeService((Service)null);
				return;
			case JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE:
				setOppositeFeature((ServiceAssociation)null);
				return;
			case JsfPackage.SERVICE_ENTITY_ASSOCIATION__FEATURE:
				setFeature((Association)null);
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
			case JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE:
				return oppositeService != null;
			case JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE:
				return oppositeFeature != null;
			case JsfPackage.SERVICE_ENTITY_ASSOCIATION__FEATURE:
				return feature != null;
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
		if (baseClass == ServiceAssociation.class) {
			switch (derivedFeatureID) {
				case JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE: return JsfPackage.SERVICE_ASSOCIATION__OPPOSITE_SERVICE;
				case JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE: return JsfPackage.SERVICE_ASSOCIATION__OPPOSITE_FEATURE;
				default: return -1;
			}
		}
		if (baseClass == IncludedAssociation.class) {
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
		if (baseClass == ServiceAssociation.class) {
			switch (baseFeatureID) {
				case JsfPackage.SERVICE_ASSOCIATION__OPPOSITE_SERVICE: return JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE;
				case JsfPackage.SERVICE_ASSOCIATION__OPPOSITE_FEATURE: return JsfPackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE;
				default: return -1;
			}
		}
		if (baseClass == IncludedAssociation.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ServiceEntityAssociationImpl
