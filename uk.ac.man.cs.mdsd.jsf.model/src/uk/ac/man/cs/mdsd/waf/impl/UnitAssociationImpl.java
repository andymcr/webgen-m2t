/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.waf.ContentUnit;
import uk.ac.man.cs.mdsd.waf.IncludedAssociation;
import uk.ac.man.cs.mdsd.waf.WafPackage;
import uk.ac.man.cs.mdsd.waf.ModelLabel;
import uk.ac.man.cs.mdsd.waf.Selection;
import uk.ac.man.cs.mdsd.waf.ServiceAssociation;
import uk.ac.man.cs.mdsd.waf.UnitAssociation;
import uk.ac.man.cs.mdsd.waf.UnitChildFeature;
import uk.ac.man.cs.mdsd.waf.UnitContainer;
import uk.ac.man.cs.mdsd.waf.UnitTitle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitAssociationImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitAssociationImpl#getServiceFeature <em>Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitAssociationImpl#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitAssociationImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitAssociationImpl#getDynamicLabel <em>Dynamic Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitAssociationImpl#getFilters <em>Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitAssociationImpl extends UnitFeatureImpl implements UnitAssociation {
	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentUnit> units;

	/**
	 * The cached value of the '{@link #getServiceFeature() <em>Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFeature()
	 * @generated
	 * @ordered
	 */
	protected ServiceAssociation serviceFeature;

	/**
	 * The cached value of the '{@link #getChildFeature() <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildFeature()
	 * @generated
	 * @ordered
	 */
	protected UnitChildFeature childFeature;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection selection;

	/**
	 * The cached value of the '{@link #getDynamicLabel() <em>Dynamic Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicLabel()
	 * @generated
	 * @ordered
	 */
	protected ModelLabel dynamicLabel;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitTitle> filters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.UNIT_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentUnit> getUnits() {
		if (units == null) {
			units = new EObjectContainmentWithInverseEList<ContentUnit>(ContentUnit.class, this, WafPackage.UNIT_ASSOCIATION__UNITS, WafPackage.CONTENT_UNIT__DISPLAYED_ON);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAssociation getServiceFeature() {
		if (serviceFeature != null && serviceFeature.eIsProxy()) {
			InternalEObject oldServiceFeature = (InternalEObject)serviceFeature;
			serviceFeature = (ServiceAssociation)eResolveProxy(oldServiceFeature);
			if (serviceFeature != oldServiceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.UNIT_ASSOCIATION__SERVICE_FEATURE, oldServiceFeature, serviceFeature));
			}
		}
		return serviceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAssociation basicGetServiceFeature() {
		return serviceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceFeature(ServiceAssociation newServiceFeature) {
		ServiceAssociation oldServiceFeature = serviceFeature;
		serviceFeature = newServiceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_ASSOCIATION__SERVICE_FEATURE, oldServiceFeature, serviceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitChildFeature getChildFeature() {
		return childFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildFeature(UnitChildFeature newChildFeature, NotificationChain msgs) {
		UnitChildFeature oldChildFeature = childFeature;
		childFeature = newChildFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_ASSOCIATION__CHILD_FEATURE, oldChildFeature, newChildFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildFeature(UnitChildFeature newChildFeature) {
		if (newChildFeature != childFeature) {
			NotificationChain msgs = null;
			if (childFeature != null)
				msgs = ((InternalEObject)childFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WafPackage.UNIT_ASSOCIATION__CHILD_FEATURE, null, msgs);
			if (newChildFeature != null)
				msgs = ((InternalEObject)newChildFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WafPackage.UNIT_ASSOCIATION__CHILD_FEATURE, null, msgs);
			msgs = basicSetChildFeature(newChildFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_ASSOCIATION__CHILD_FEATURE, newChildFeature, newChildFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (Selection)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.UNIT_ASSOCIATION__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Selection newSelection) {
		Selection oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_ASSOCIATION__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabel getDynamicLabel() {
		if (dynamicLabel != null && dynamicLabel.eIsProxy()) {
			InternalEObject oldDynamicLabel = (InternalEObject)dynamicLabel;
			dynamicLabel = (ModelLabel)eResolveProxy(oldDynamicLabel);
			if (dynamicLabel != oldDynamicLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.UNIT_ASSOCIATION__DYNAMIC_LABEL, oldDynamicLabel, dynamicLabel));
			}
		}
		return dynamicLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabel basicGetDynamicLabel() {
		return dynamicLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicLabel(ModelLabel newDynamicLabel) {
		ModelLabel oldDynamicLabel = dynamicLabel;
		dynamicLabel = newDynamicLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_ASSOCIATION__DYNAMIC_LABEL, oldDynamicLabel, dynamicLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitTitle> getFilters() {
		if (filters == null) {
			filters = new EObjectResolvingEList<UnitTitle>(UnitTitle.class, this, WafPackage.UNIT_ASSOCIATION__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.UNIT_ASSOCIATION__UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnits()).basicAdd(otherEnd, msgs);
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
			case WafPackage.UNIT_ASSOCIATION__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
			case WafPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				return basicSetChildFeature(null, msgs);
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
			case WafPackage.UNIT_ASSOCIATION__UNITS:
				return getUnits();
			case WafPackage.UNIT_ASSOCIATION__SERVICE_FEATURE:
				if (resolve) return getServiceFeature();
				return basicGetServiceFeature();
			case WafPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				return getChildFeature();
			case WafPackage.UNIT_ASSOCIATION__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case WafPackage.UNIT_ASSOCIATION__DYNAMIC_LABEL:
				if (resolve) return getDynamicLabel();
				return basicGetDynamicLabel();
			case WafPackage.UNIT_ASSOCIATION__FILTERS:
				return getFilters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WafPackage.UNIT_ASSOCIATION__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends ContentUnit>)newValue);
				return;
			case WafPackage.UNIT_ASSOCIATION__SERVICE_FEATURE:
				setServiceFeature((ServiceAssociation)newValue);
				return;
			case WafPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((UnitChildFeature)newValue);
				return;
			case WafPackage.UNIT_ASSOCIATION__SELECTION:
				setSelection((Selection)newValue);
				return;
			case WafPackage.UNIT_ASSOCIATION__DYNAMIC_LABEL:
				setDynamicLabel((ModelLabel)newValue);
				return;
			case WafPackage.UNIT_ASSOCIATION__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends UnitTitle>)newValue);
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
			case WafPackage.UNIT_ASSOCIATION__UNITS:
				getUnits().clear();
				return;
			case WafPackage.UNIT_ASSOCIATION__SERVICE_FEATURE:
				setServiceFeature((ServiceAssociation)null);
				return;
			case WafPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((UnitChildFeature)null);
				return;
			case WafPackage.UNIT_ASSOCIATION__SELECTION:
				setSelection((Selection)null);
				return;
			case WafPackage.UNIT_ASSOCIATION__DYNAMIC_LABEL:
				setDynamicLabel((ModelLabel)null);
				return;
			case WafPackage.UNIT_ASSOCIATION__FILTERS:
				getFilters().clear();
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
			case WafPackage.UNIT_ASSOCIATION__UNITS:
				return units != null && !units.isEmpty();
			case WafPackage.UNIT_ASSOCIATION__SERVICE_FEATURE:
				return serviceFeature != null;
			case WafPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				return childFeature != null;
			case WafPackage.UNIT_ASSOCIATION__SELECTION:
				return selection != null;
			case WafPackage.UNIT_ASSOCIATION__DYNAMIC_LABEL:
				return dynamicLabel != null;
			case WafPackage.UNIT_ASSOCIATION__FILTERS:
				return filters != null && !filters.isEmpty();
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
		if (baseClass == IncludedAssociation.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UnitContainer.class) {
			switch (derivedFeatureID) {
				case WafPackage.UNIT_ASSOCIATION__UNITS: return WafPackage.UNIT_CONTAINER__UNITS;
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
		if (baseClass == IncludedAssociation.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UnitContainer.class) {
			switch (baseFeatureID) {
				case WafPackage.UNIT_CONTAINER__UNITS: return WafPackage.UNIT_ASSOCIATION__UNITS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //UnitAssociationImpl
