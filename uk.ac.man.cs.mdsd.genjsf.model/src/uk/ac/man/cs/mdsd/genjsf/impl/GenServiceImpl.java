/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenServiceImpl.java,v 1.17 2014/07/04 07:53:22 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenModelLabel;
import uk.ac.man.cs.mdsd.genjsf.GenSelection;
import uk.ac.man.cs.mdsd.genjsf.GenService;
import uk.ac.man.cs.mdsd.genjsf.GenServiceFeature;
import uk.ac.man.cs.mdsd.genorm.GenEntity;
import uk.ac.man.cs.mdsd.jsf.Service;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceImpl#getJsfService <em>Jsf Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceImpl#getGenEntities <em>Gen Entities</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceImpl#getGenDisplayLabels <em>Gen Display Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceImpl#getGenSelections <em>Gen Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceImpl#getGenFeatures <em>Gen Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceImpl#getGenAccessedBy <em>Gen Accessed By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceImpl#getDefaultViewName <em>Default View Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceImpl#getViewName <em>View Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenServiceImpl extends NamedElementImpl implements GenService {
	/**
	 * The cached value of the '{@link #getJsfService() <em>Jsf Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfService()
	 * @generated
	 * @ordered
	 */
	protected Service jsfService;

	/**
	 * The cached value of the '{@link #getGenEntities() <em>Gen Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<GenEntity> genEntities;

	/**
	 * The cached value of the '{@link #getGenDisplayLabels() <em>Gen Display Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDisplayLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<GenModelLabel> genDisplayLabels;

	/**
	 * The cached value of the '{@link #getGenSelections() <em>Gen Selections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenSelections()
	 * @generated
	 * @ordered
	 */
	protected EList<GenSelection> genSelections;

	/**
	 * The cached value of the '{@link #getGenFeatures() <em>Gen Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<GenServiceFeature> genFeatures;

	/**
	 * The cached value of the '{@link #getGenAccessedBy() <em>Gen Accessed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenAccessedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<GenDynamicUnit> genAccessedBy;

	/**
	 * The default value of the '{@link #getDefaultViewName() <em>Default View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultViewName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VIEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultViewName() <em>Default View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultViewName()
	 * @generated
	 * @ordered
	 */
	protected String defaultViewName = DEFAULT_VIEW_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewName() <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewName()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewName() <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewName()
	 * @generated
	 * @ordered
	 */
	protected String viewName = VIEW_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getJsfService() {
		if (jsfService != null && jsfService.eIsProxy()) {
			InternalEObject oldJsfService = (InternalEObject)jsfService;
			jsfService = (Service)eResolveProxy(oldJsfService);
			if (jsfService != oldJsfService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_SERVICE__JSF_SERVICE, oldJsfService, jsfService));
			}
		}
		return jsfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetJsfService() {
		return jsfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfService(Service newJsfService) {
		Service oldJsfService = jsfService;
		jsfService = newJsfService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE__JSF_SERVICE, oldJsfService, jsfService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenEntity> getGenEntities() {
		if (genEntities == null) {
			genEntities = new EObjectResolvingEList<GenEntity>(GenEntity.class, this, GenJsfPackage.GEN_SERVICE__GEN_ENTITIES);
		}
		return genEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenModelLabel> getGenDisplayLabels() {
		if (genDisplayLabels == null) {
			genDisplayLabels = new EObjectContainmentEList<GenModelLabel>(GenModelLabel.class, this, GenJsfPackage.GEN_SERVICE__GEN_DISPLAY_LABELS);
		}
		return genDisplayLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenSelection> getGenSelections() {
		if (genSelections == null) {
			genSelections = new EObjectContainmentEList<GenSelection>(GenSelection.class, this, GenJsfPackage.GEN_SERVICE__GEN_SELECTIONS);
		}
		return genSelections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenServiceFeature> getGenFeatures() {
		if (genFeatures == null) {
			genFeatures = new EObjectContainmentWithInverseEList<GenServiceFeature>(GenServiceFeature.class, this, GenJsfPackage.GEN_SERVICE__GEN_FEATURES, GenJsfPackage.GEN_SERVICE_FEATURE__GEN_INCLUDED_BY);
		}
		return genFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenDynamicUnit> getGenAccessedBy() {
		if (genAccessedBy == null) {
			genAccessedBy = new EObjectWithInverseResolvingEList<GenDynamicUnit>(GenDynamicUnit.class, this, GenJsfPackage.GEN_SERVICE__GEN_ACCESSED_BY, GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SERVICE);
		}
		return genAccessedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultViewName() {
		return defaultViewName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultViewName(String newDefaultViewName) {
		String oldDefaultViewName = defaultViewName;
		defaultViewName = newDefaultViewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE__DEFAULT_VIEW_NAME, oldDefaultViewName, defaultViewName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewName() {
		return viewName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewName(String newViewName) {
		String oldViewName = viewName;
		viewName = newViewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE__VIEW_NAME, oldViewName, viewName));
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
			case GenJsfPackage.GEN_SERVICE__GEN_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenFeatures()).basicAdd(otherEnd, msgs);
			case GenJsfPackage.GEN_SERVICE__GEN_ACCESSED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenAccessedBy()).basicAdd(otherEnd, msgs);
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
			case GenJsfPackage.GEN_SERVICE__GEN_DISPLAY_LABELS:
				return ((InternalEList<?>)getGenDisplayLabels()).basicRemove(otherEnd, msgs);
			case GenJsfPackage.GEN_SERVICE__GEN_SELECTIONS:
				return ((InternalEList<?>)getGenSelections()).basicRemove(otherEnd, msgs);
			case GenJsfPackage.GEN_SERVICE__GEN_FEATURES:
				return ((InternalEList<?>)getGenFeatures()).basicRemove(otherEnd, msgs);
			case GenJsfPackage.GEN_SERVICE__GEN_ACCESSED_BY:
				return ((InternalEList<?>)getGenAccessedBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated NOT
	 */
	public void reconcile(final GenService oldGenService) {
		final Map<String, GenServiceFeature> oldFeatures
			= new HashMap<String, GenServiceFeature>();
		for (GenServiceFeature oldFeature : oldGenService.getGenFeatures()) {
			oldFeatures.put(oldFeature.getName(), oldFeature);
		}
		for (GenServiceFeature newFeature : getGenFeatures()) {
			final String name = newFeature.getName();
			if (oldFeatures.containsKey(name)) {
				newFeature.reconcile(oldFeatures.get(name));
			}
		}

		reconcileSettings(oldGenService);
	}

	/**
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenService oldGenService) {
		setViewName(oldGenService.getViewName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_SERVICE__JSF_SERVICE:
				if (resolve) return getJsfService();
				return basicGetJsfService();
			case GenJsfPackage.GEN_SERVICE__GEN_ENTITIES:
				return getGenEntities();
			case GenJsfPackage.GEN_SERVICE__GEN_DISPLAY_LABELS:
				return getGenDisplayLabels();
			case GenJsfPackage.GEN_SERVICE__GEN_SELECTIONS:
				return getGenSelections();
			case GenJsfPackage.GEN_SERVICE__GEN_FEATURES:
				return getGenFeatures();
			case GenJsfPackage.GEN_SERVICE__GEN_ACCESSED_BY:
				return getGenAccessedBy();
			case GenJsfPackage.GEN_SERVICE__DEFAULT_VIEW_NAME:
				return getDefaultViewName();
			case GenJsfPackage.GEN_SERVICE__VIEW_NAME:
				return getViewName();
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
			case GenJsfPackage.GEN_SERVICE__JSF_SERVICE:
				setJsfService((Service)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE__GEN_ENTITIES:
				getGenEntities().clear();
				getGenEntities().addAll((Collection<? extends GenEntity>)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE__GEN_DISPLAY_LABELS:
				getGenDisplayLabels().clear();
				getGenDisplayLabels().addAll((Collection<? extends GenModelLabel>)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE__GEN_SELECTIONS:
				getGenSelections().clear();
				getGenSelections().addAll((Collection<? extends GenSelection>)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE__GEN_FEATURES:
				getGenFeatures().clear();
				getGenFeatures().addAll((Collection<? extends GenServiceFeature>)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE__GEN_ACCESSED_BY:
				getGenAccessedBy().clear();
				getGenAccessedBy().addAll((Collection<? extends GenDynamicUnit>)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE__DEFAULT_VIEW_NAME:
				setDefaultViewName((String)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE__VIEW_NAME:
				setViewName((String)newValue);
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
			case GenJsfPackage.GEN_SERVICE__JSF_SERVICE:
				setJsfService((Service)null);
				return;
			case GenJsfPackage.GEN_SERVICE__GEN_ENTITIES:
				getGenEntities().clear();
				return;
			case GenJsfPackage.GEN_SERVICE__GEN_DISPLAY_LABELS:
				getGenDisplayLabels().clear();
				return;
			case GenJsfPackage.GEN_SERVICE__GEN_SELECTIONS:
				getGenSelections().clear();
				return;
			case GenJsfPackage.GEN_SERVICE__GEN_FEATURES:
				getGenFeatures().clear();
				return;
			case GenJsfPackage.GEN_SERVICE__GEN_ACCESSED_BY:
				getGenAccessedBy().clear();
				return;
			case GenJsfPackage.GEN_SERVICE__DEFAULT_VIEW_NAME:
				setDefaultViewName(DEFAULT_VIEW_NAME_EDEFAULT);
				return;
			case GenJsfPackage.GEN_SERVICE__VIEW_NAME:
				setViewName(VIEW_NAME_EDEFAULT);
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
			case GenJsfPackage.GEN_SERVICE__JSF_SERVICE:
				return jsfService != null;
			case GenJsfPackage.GEN_SERVICE__GEN_ENTITIES:
				return genEntities != null && !genEntities.isEmpty();
			case GenJsfPackage.GEN_SERVICE__GEN_DISPLAY_LABELS:
				return genDisplayLabels != null && !genDisplayLabels.isEmpty();
			case GenJsfPackage.GEN_SERVICE__GEN_SELECTIONS:
				return genSelections != null && !genSelections.isEmpty();
			case GenJsfPackage.GEN_SERVICE__GEN_FEATURES:
				return genFeatures != null && !genFeatures.isEmpty();
			case GenJsfPackage.GEN_SERVICE__GEN_ACCESSED_BY:
				return genAccessedBy != null && !genAccessedBy.isEmpty();
			case GenJsfPackage.GEN_SERVICE__DEFAULT_VIEW_NAME:
				return DEFAULT_VIEW_NAME_EDEFAULT == null ? defaultViewName != null : !DEFAULT_VIEW_NAME_EDEFAULT.equals(defaultViewName);
			case GenJsfPackage.GEN_SERVICE__VIEW_NAME:
				return VIEW_NAME_EDEFAULT == null ? viewName != null : !VIEW_NAME_EDEFAULT.equals(viewName);
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
		result.append(" (defaultViewName: ");
		result.append(defaultViewName);
		result.append(", viewName: ");
		result.append(viewName);
		result.append(')');
		return result.toString();
	}

} //GenServiceImpl
