/**
 * <copyright>
 * </copyright>
 *
 * $Id: ServiceImpl.java,v 1.14 2014/03/04 19:42:05 andy Exp $
 */
package uk.ac.man.cs.mdsd.jsf.impl;

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

import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.jsf.ContentUnit;
import uk.ac.man.cs.mdsd.jsf.JsfPackage;
import uk.ac.man.cs.mdsd.jsf.ModelLabel;
import uk.ac.man.cs.mdsd.jsf.Selection;
import uk.ac.man.cs.mdsd.jsf.Service;

import uk.ac.man.cs.mdsd.jsf.ServiceFeature;
import uk.ac.man.cs.mdsd.orm.Entity;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceImpl#getDaosUsed <em>Daos Used</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceImpl#isView <em>View</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceImpl#getDisplayLabels <em>Display Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceImpl#getSelections <em>Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceImpl#getAccessedBy <em>Accessed By</em>}</li>
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
	protected EList<ContentUnit> accessedBy;

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
		return JsfPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectResolvingEList<Entity>(Entity.class, this, JsfPackage.SERVICE__ENTITIES);
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
			selections = new EObjectContainmentEList<Selection>(Selection.class, this, JsfPackage.SERVICE__SELECTIONS);
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
			features = new EObjectContainmentWithInverseEList<ServiceFeature>(ServiceFeature.class, this, JsfPackage.SERVICE__FEATURES, JsfPackage.SERVICE_FEATURE__INCLUDED_BY);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentUnit> getAccessedBy() {
		if (accessedBy == null) {
			accessedBy = new EObjectResolvingEList<ContentUnit>(ContentUnit.class, this, JsfPackage.SERVICE__ACCESSED_BY);
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
			case JsfPackage.SERVICE__DISPLAY_LABELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDisplayLabels()).basicAdd(otherEnd, msgs);
			case JsfPackage.SERVICE__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
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
			daosUsed = new EObjectResolvingEList<Entity>(Entity.class, this, JsfPackage.SERVICE__DAOS_USED);
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
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE__MODEL_NAME, oldModelName, modelName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelLabel> getDisplayLabels() {
		if (displayLabels == null) {
			displayLabels = new EObjectContainmentWithInverseEList<ModelLabel>(ModelLabel.class, this, JsfPackage.SERVICE__DISPLAY_LABELS, JsfPackage.MODEL_LABEL__LABEL_FOR);
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
			case JsfPackage.SERVICE__DISPLAY_LABELS:
				return ((InternalEList<?>)getDisplayLabels()).basicRemove(otherEnd, msgs);
			case JsfPackage.SERVICE__SELECTIONS:
				return ((InternalEList<?>)getSelections()).basicRemove(otherEnd, msgs);
			case JsfPackage.SERVICE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case JsfPackage.SERVICE__ENTITIES:
				return getEntities();
			case JsfPackage.SERVICE__DAOS_USED:
				return getDaosUsed();
			case JsfPackage.SERVICE__MODEL_NAME:
				return getModelName();
			case JsfPackage.SERVICE__VIEW:
				return isView();
			case JsfPackage.SERVICE__DISPLAY_LABELS:
				return getDisplayLabels();
			case JsfPackage.SERVICE__SELECTIONS:
				return getSelections();
			case JsfPackage.SERVICE__FEATURES:
				return getFeatures();
			case JsfPackage.SERVICE__ACCESSED_BY:
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
			case JsfPackage.SERVICE__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case JsfPackage.SERVICE__DAOS_USED:
				getDaosUsed().clear();
				getDaosUsed().addAll((Collection<? extends Entity>)newValue);
				return;
			case JsfPackage.SERVICE__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case JsfPackage.SERVICE__VIEW:
				setView((Boolean)newValue);
				return;
			case JsfPackage.SERVICE__DISPLAY_LABELS:
				getDisplayLabels().clear();
				getDisplayLabels().addAll((Collection<? extends ModelLabel>)newValue);
				return;
			case JsfPackage.SERVICE__SELECTIONS:
				getSelections().clear();
				getSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case JsfPackage.SERVICE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends ServiceFeature>)newValue);
				return;
			case JsfPackage.SERVICE__ACCESSED_BY:
				getAccessedBy().clear();
				getAccessedBy().addAll((Collection<? extends ContentUnit>)newValue);
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
			case JsfPackage.SERVICE__ENTITIES:
				getEntities().clear();
				return;
			case JsfPackage.SERVICE__DAOS_USED:
				getDaosUsed().clear();
				return;
			case JsfPackage.SERVICE__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case JsfPackage.SERVICE__VIEW:
				setView(VIEW_EDEFAULT);
				return;
			case JsfPackage.SERVICE__DISPLAY_LABELS:
				getDisplayLabels().clear();
				return;
			case JsfPackage.SERVICE__SELECTIONS:
				getSelections().clear();
				return;
			case JsfPackage.SERVICE__FEATURES:
				getFeatures().clear();
				return;
			case JsfPackage.SERVICE__ACCESSED_BY:
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
			case JsfPackage.SERVICE__ENTITIES:
				return entities != null && !entities.isEmpty();
			case JsfPackage.SERVICE__DAOS_USED:
				return daosUsed != null && !daosUsed.isEmpty();
			case JsfPackage.SERVICE__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case JsfPackage.SERVICE__VIEW:
				return view != VIEW_EDEFAULT;
			case JsfPackage.SERVICE__DISPLAY_LABELS:
				return displayLabels != null && !displayLabels.isEmpty();
			case JsfPackage.SERVICE__SELECTIONS:
				return selections != null && !selections.isEmpty();
			case JsfPackage.SERVICE__FEATURES:
				return features != null && !features.isEmpty();
			case JsfPackage.SERVICE__ACCESSED_BY:
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
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
