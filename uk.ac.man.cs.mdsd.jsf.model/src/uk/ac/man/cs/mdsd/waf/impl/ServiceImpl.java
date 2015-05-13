/**
 * <copyright>
 * </copyright>
 *
 * $Id: ServiceImpl.java,v 1.14 2014/03/04 19:42:05 andy Exp $
 */
package uk.ac.man.cs.mdsd.waf.impl;

import java.util.Collection;

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

import uk.ac.man.cs.mdsd.orm.Entity;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;
import uk.ac.man.cs.mdsd.waf.ContentUnit;
import uk.ac.man.cs.mdsd.waf.DynamicUnit;
import uk.ac.man.cs.mdsd.waf.WafPackage;
import uk.ac.man.cs.mdsd.waf.ModelLabel;
import uk.ac.man.cs.mdsd.waf.Selection;
import uk.ac.man.cs.mdsd.waf.Service;
import uk.ac.man.cs.mdsd.waf.ServiceFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceImpl#getDaosUsed <em>Daos Used</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceImpl#isView <em>View</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceImpl#getViewName <em>View Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceImpl#getDisplayLabels <em>Display Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceImpl#getSelections <em>Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceImpl#getAccessedBy <em>Accessed By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends NamedElementImpl implements Service {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getDaosUsed() <em>Daos Used</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaosUsed()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> daosUsed;

	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VIEW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isView()
	 * @generated
	 * @ordered
	 */
	protected boolean view = VIEW_EDEFAULT;

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
	 * The cached value of the '{@link #getDisplayLabels() <em>Display Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelLabel> displayLabels;

	/**
	 * The cached value of the '{@link #getSelections() <em>Selections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelections()
	 * @generated
	 * @ordered
	 */
	protected EList<Selection> selections;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceFeature> features;

	/**
	 * The cached value of the '{@link #getAccessedBy() <em>Accessed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicUnit> accessedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectResolvingEList<Entity>(Entity.class, this, WafPackage.SERVICE__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selection> getSelections() {
		if (selections == null) {
			selections = new EObjectContainmentEList<Selection>(Selection.class, this, WafPackage.SERVICE__SELECTIONS);
		}
		return selections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<ServiceFeature>(ServiceFeature.class, this, WafPackage.SERVICE__FEATURES, WafPackage.SERVICE_FEATURE__INCLUDED_BY);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicUnit> getAccessedBy() {
		if (accessedBy == null) {
			accessedBy = new EObjectWithInverseResolvingEList<DynamicUnit>(DynamicUnit.class, this, WafPackage.SERVICE__ACCESSED_BY, WafPackage.DYNAMIC_UNIT__SERVICE);
		}
		return accessedBy;
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
			case WafPackage.SERVICE__DISPLAY_LABELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDisplayLabels()).basicAdd(otherEnd, msgs);
			case WafPackage.SERVICE__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
			case WafPackage.SERVICE__ACCESSED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccessedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getDaosUsed() {
		if (daosUsed == null) {
			daosUsed = new EObjectResolvingEList<Entity>(Entity.class, this, WafPackage.SERVICE__DAOS_USED);
		}
		return daosUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.SERVICE__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(boolean newView) {
		boolean oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.SERVICE__VIEW, oldView, view));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.SERVICE__VIEW_NAME, oldViewName, viewName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelLabel> getDisplayLabels() {
		if (displayLabels == null) {
			displayLabels = new EObjectContainmentWithInverseEList<ModelLabel>(ModelLabel.class, this, WafPackage.SERVICE__DISPLAY_LABELS, WafPackage.MODEL_LABEL__LABEL_FOR);
		}
		return displayLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.SERVICE__DISPLAY_LABELS:
				return ((InternalEList<?>)getDisplayLabels()).basicRemove(otherEnd, msgs);
			case WafPackage.SERVICE__SELECTIONS:
				return ((InternalEList<?>)getSelections()).basicRemove(otherEnd, msgs);
			case WafPackage.SERVICE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case WafPackage.SERVICE__ACCESSED_BY:
				return ((InternalEList<?>)getAccessedBy()).basicRemove(otherEnd, msgs);
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
			case WafPackage.SERVICE__ENTITIES:
				return getEntities();
			case WafPackage.SERVICE__DAOS_USED:
				return getDaosUsed();
			case WafPackage.SERVICE__MODEL_NAME:
				return getModelName();
			case WafPackage.SERVICE__VIEW:
				return isView();
			case WafPackage.SERVICE__VIEW_NAME:
				return getViewName();
			case WafPackage.SERVICE__DISPLAY_LABELS:
				return getDisplayLabels();
			case WafPackage.SERVICE__SELECTIONS:
				return getSelections();
			case WafPackage.SERVICE__FEATURES:
				return getFeatures();
			case WafPackage.SERVICE__ACCESSED_BY:
				return getAccessedBy();
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
			case WafPackage.SERVICE__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case WafPackage.SERVICE__DAOS_USED:
				getDaosUsed().clear();
				getDaosUsed().addAll((Collection<? extends Entity>)newValue);
				return;
			case WafPackage.SERVICE__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case WafPackage.SERVICE__VIEW:
				setView((Boolean)newValue);
				return;
			case WafPackage.SERVICE__VIEW_NAME:
				setViewName((String)newValue);
				return;
			case WafPackage.SERVICE__DISPLAY_LABELS:
				getDisplayLabels().clear();
				getDisplayLabels().addAll((Collection<? extends ModelLabel>)newValue);
				return;
			case WafPackage.SERVICE__SELECTIONS:
				getSelections().clear();
				getSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case WafPackage.SERVICE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends ServiceFeature>)newValue);
				return;
			case WafPackage.SERVICE__ACCESSED_BY:
				getAccessedBy().clear();
				getAccessedBy().addAll((Collection<? extends DynamicUnit>)newValue);
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
			case WafPackage.SERVICE__ENTITIES:
				getEntities().clear();
				return;
			case WafPackage.SERVICE__DAOS_USED:
				getDaosUsed().clear();
				return;
			case WafPackage.SERVICE__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case WafPackage.SERVICE__VIEW:
				setView(VIEW_EDEFAULT);
				return;
			case WafPackage.SERVICE__VIEW_NAME:
				setViewName(VIEW_NAME_EDEFAULT);
				return;
			case WafPackage.SERVICE__DISPLAY_LABELS:
				getDisplayLabels().clear();
				return;
			case WafPackage.SERVICE__SELECTIONS:
				getSelections().clear();
				return;
			case WafPackage.SERVICE__FEATURES:
				getFeatures().clear();
				return;
			case WafPackage.SERVICE__ACCESSED_BY:
				getAccessedBy().clear();
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
			case WafPackage.SERVICE__ENTITIES:
				return entities != null && !entities.isEmpty();
			case WafPackage.SERVICE__DAOS_USED:
				return daosUsed != null && !daosUsed.isEmpty();
			case WafPackage.SERVICE__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case WafPackage.SERVICE__VIEW:
				return view != VIEW_EDEFAULT;
			case WafPackage.SERVICE__VIEW_NAME:
				return VIEW_NAME_EDEFAULT == null ? viewName != null : !VIEW_NAME_EDEFAULT.equals(viewName);
			case WafPackage.SERVICE__DISPLAY_LABELS:
				return displayLabels != null && !displayLabels.isEmpty();
			case WafPackage.SERVICE__SELECTIONS:
				return selections != null && !selections.isEmpty();
			case WafPackage.SERVICE__FEATURES:
				return features != null && !features.isEmpty();
			case WafPackage.SERVICE__ACCESSED_BY:
				return accessedBy != null && !accessedBy.isEmpty();
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
		result.append(" (modelName: ");
		result.append(modelName);
		result.append(", view: ");
		result.append(view);
		result.append(", viewName: ");
		result.append(viewName);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
