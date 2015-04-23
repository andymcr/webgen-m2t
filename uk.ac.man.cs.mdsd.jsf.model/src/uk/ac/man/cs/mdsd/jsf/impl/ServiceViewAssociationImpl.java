/**
 */
package uk.ac.man.cs.mdsd.jsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.jsf.JsfPackage;
import uk.ac.man.cs.mdsd.jsf.Service;
import uk.ac.man.cs.mdsd.jsf.ServiceAssociation;
import uk.ac.man.cs.mdsd.jsf.ServiceFeature;
import uk.ac.man.cs.mdsd.jsf.ServiceViewAssociation;

import uk.ac.man.cs.mdsd.orm.Cardinality;
import uk.ac.man.cs.mdsd.orm.impl.NamedDisplayElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service View Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceViewAssociationImpl#getIncludedBy <em>Included By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceViewAssociationImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceViewAssociationImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceViewAssociationImpl#getOppositeService <em>Opposite Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceViewAssociationImpl#getOppositeFeature <em>Opposite Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceViewAssociationImpl extends NamedDisplayElementImpl implements ServiceViewAssociation {
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality CARDINALITY_EDEFAULT = Cardinality.OPTIONAL;
	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality = CARDINALITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_FORMAT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected String dateFormat = DATE_FORMAT_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceViewAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsfPackage.Literals.SERVICE_VIEW_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getIncludedBy() {
		if (eContainerFeatureID() != JsfPackage.SERVICE_VIEW_ASSOCIATION__INCLUDED_BY) return null;
		return (Service)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludedBy(Service newIncludedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIncludedBy, JsfPackage.SERVICE_VIEW_ASSOCIATION__INCLUDED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludedBy(Service newIncludedBy) {
		if (newIncludedBy != eInternalContainer() || (eContainerFeatureID() != JsfPackage.SERVICE_VIEW_ASSOCIATION__INCLUDED_BY && newIncludedBy != null)) {
			if (EcoreUtil.isAncestor(this, newIncludedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIncludedBy != null)
				msgs = ((InternalEObject)newIncludedBy).eInverseAdd(this, JsfPackage.SERVICE__FEATURES, Service.class, msgs);
			msgs = basicSetIncludedBy(newIncludedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_VIEW_ASSOCIATION__INCLUDED_BY, newIncludedBy, newIncludedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_VIEW_ASSOCIATION__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateFormat() {
		return dateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFormat(String newDateFormat) {
		String oldDateFormat = dateFormat;
		dateFormat = newDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_VIEW_ASSOCIATION__DATE_FORMAT, oldDateFormat, dateFormat));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE, oldOppositeService, oppositeService));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE, oldOppositeService, oppositeService));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_FEATURE, oldOppositeFeature, oppositeFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_FEATURE, oldOppositeFeature, oppositeFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__INCLUDED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIncludedBy((Service)otherEnd, msgs);
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
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__INCLUDED_BY:
				return basicSetIncludedBy(null, msgs);
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
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__INCLUDED_BY:
				return eInternalContainer().eInverseRemove(this, JsfPackage.SERVICE__FEATURES, Service.class, msgs);
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
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__INCLUDED_BY:
				return getIncludedBy();
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__CARDINALITY:
				return getCardinality();
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__DATE_FORMAT:
				return getDateFormat();
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE:
				if (resolve) return getOppositeService();
				return basicGetOppositeService();
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_FEATURE:
				if (resolve) return getOppositeFeature();
				return basicGetOppositeFeature();
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
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__INCLUDED_BY:
				setIncludedBy((Service)newValue);
				return;
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__DATE_FORMAT:
				setDateFormat((String)newValue);
				return;
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE:
				setOppositeService((Service)newValue);
				return;
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_FEATURE:
				setOppositeFeature((ServiceAssociation)newValue);
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
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__INCLUDED_BY:
				setIncludedBy((Service)null);
				return;
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE:
				setOppositeService((Service)null);
				return;
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_FEATURE:
				setOppositeFeature((ServiceAssociation)null);
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
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__INCLUDED_BY:
				return getIncludedBy() != null;
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__DATE_FORMAT:
				return DATE_FORMAT_EDEFAULT == null ? dateFormat != null : !DATE_FORMAT_EDEFAULT.equals(dateFormat);
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE:
				return oppositeService != null;
			case JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_FEATURE:
				return oppositeFeature != null;
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
		if (baseClass == ServiceFeature.class) {
			switch (derivedFeatureID) {
				case JsfPackage.SERVICE_VIEW_ASSOCIATION__INCLUDED_BY: return JsfPackage.SERVICE_FEATURE__INCLUDED_BY;
				case JsfPackage.SERVICE_VIEW_ASSOCIATION__CARDINALITY: return JsfPackage.SERVICE_FEATURE__CARDINALITY;
				case JsfPackage.SERVICE_VIEW_ASSOCIATION__DATE_FORMAT: return JsfPackage.SERVICE_FEATURE__DATE_FORMAT;
				default: return -1;
			}
		}
		if (baseClass == ServiceAssociation.class) {
			switch (derivedFeatureID) {
				case JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE: return JsfPackage.SERVICE_ASSOCIATION__OPPOSITE_SERVICE;
				case JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_FEATURE: return JsfPackage.SERVICE_ASSOCIATION__OPPOSITE_FEATURE;
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
		if (baseClass == ServiceFeature.class) {
			switch (baseFeatureID) {
				case JsfPackage.SERVICE_FEATURE__INCLUDED_BY: return JsfPackage.SERVICE_VIEW_ASSOCIATION__INCLUDED_BY;
				case JsfPackage.SERVICE_FEATURE__CARDINALITY: return JsfPackage.SERVICE_VIEW_ASSOCIATION__CARDINALITY;
				case JsfPackage.SERVICE_FEATURE__DATE_FORMAT: return JsfPackage.SERVICE_VIEW_ASSOCIATION__DATE_FORMAT;
				default: return -1;
			}
		}
		if (baseClass == ServiceAssociation.class) {
			switch (baseFeatureID) {
				case JsfPackage.SERVICE_ASSOCIATION__OPPOSITE_SERVICE: return JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE;
				case JsfPackage.SERVICE_ASSOCIATION__OPPOSITE_FEATURE: return JsfPackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_FEATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(", dateFormat: ");
		result.append(dateFormat);
		result.append(')');
		return result.toString();
	}

} //ServiceViewAssociationImpl
