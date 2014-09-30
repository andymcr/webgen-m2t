/**
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
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenService;
import uk.ac.man.cs.mdsd.genjsf.GenUnitField;
import uk.ac.man.cs.mdsd.genjsf.GenUnitSupportAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Dynamic Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicUnitImpl#getGenService <em>Gen Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicUnitImpl#getGenDisplayFields <em>Gen Display Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDynamicUnitImpl#getGenSupportActions <em>Gen Support Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenDynamicUnitImpl extends GenContentUnitImpl implements GenDynamicUnit {
	/**
	 * The cached value of the '{@link #getGenService() <em>Gen Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenService()
	 * @generated
	 * @ordered
	 */
	protected GenService genService;

	/**
	 * The cached value of the '{@link #getGenDisplayFields() <em>Gen Display Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDisplayFields()
	 * @generated
	 * @ordered
	 */
	protected EList<GenUnitField> genDisplayFields;

	/**
	 * The cached value of the '{@link #getGenSupportActions() <em>Gen Support Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenSupportActions()
	 * @generated
	 * @ordered
	 */
	protected EList<GenUnitSupportAction> genSupportActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDynamicUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_DYNAMIC_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService getGenService() {
		if (genService != null && genService.eIsProxy()) {
			InternalEObject oldGenService = (InternalEObject)genService;
			genService = (GenService)eResolveProxy(oldGenService);
			if (genService != oldGenService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SERVICE, oldGenService, genService));
			}
		}
		return genService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService basicGetGenService() {
		return genService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenService(GenService newGenService, NotificationChain msgs) {
		GenService oldGenService = genService;
		genService = newGenService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SERVICE, oldGenService, newGenService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenService(GenService newGenService) {
		if (newGenService != genService) {
			NotificationChain msgs = null;
			if (genService != null)
				msgs = ((InternalEObject)genService).eInverseRemove(this, GenJsfPackage.GEN_SERVICE__GEN_ACCESSED_BY, GenService.class, msgs);
			if (newGenService != null)
				msgs = ((InternalEObject)newGenService).eInverseAdd(this, GenJsfPackage.GEN_SERVICE__GEN_ACCESSED_BY, GenService.class, msgs);
			msgs = basicSetGenService(newGenService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SERVICE, newGenService, newGenService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenUnitField> getGenDisplayFields() {
		if (genDisplayFields == null) {
			genDisplayFields = new EObjectContainmentWithInverseEList<GenUnitField>(GenUnitField.class, this, GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS, GenJsfPackage.GEN_UNIT_FIELD__GEN_DISPLAYED_ON);
		}
		return genDisplayFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenUnitSupportAction> getGenSupportActions() {
		if (genSupportActions == null) {
			genSupportActions = new EObjectContainmentEList<GenUnitSupportAction>(GenUnitSupportAction.class, this, GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS);
		}
		return genSupportActions;
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
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SERVICE:
				if (genService != null)
					msgs = ((InternalEObject)genService).eInverseRemove(this, GenJsfPackage.GEN_SERVICE__GEN_ACCESSED_BY, GenService.class, msgs);
				return basicSetGenService((GenService)otherEnd, msgs);
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenDisplayFields()).basicAdd(otherEnd, msgs);
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
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SERVICE:
				return basicSetGenService(null, msgs);
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS:
				return ((InternalEList<?>)getGenDisplayFields()).basicRemove(otherEnd, msgs);
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS:
				return ((InternalEList<?>)getGenSupportActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void reconcile(final GenContentUnit oldGenUnit) {
		super.reconcile(oldGenUnit);

		if (oldGenUnit instanceof GenDynamicUnit) {
			final GenDynamicUnit oldGenDynamicUnit = (GenDynamicUnit) oldGenUnit;
			final Map<String, GenUnitField> oldFields = new HashMap<String, GenUnitField>();
			for (GenUnitField oldField : oldGenDynamicUnit.getGenDisplayFields()) {
				oldFields.put(oldField.getName(), oldField);
			}
			for (GenUnitField newField : getGenDisplayFields()) {
				final String name = newField.getName();
				if (oldFields.containsKey(name)) {
					newField.reconcile(oldFields.get(name));
				}
			}
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenContentUnit oldGenUnit) {
		super.reconcileSettings(oldGenUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SERVICE:
				if (resolve) return getGenService();
				return basicGetGenService();
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS:
				return getGenDisplayFields();
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS:
				return getGenSupportActions();
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
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SERVICE:
				setGenService((GenService)newValue);
				return;
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS:
				getGenDisplayFields().clear();
				getGenDisplayFields().addAll((Collection<? extends GenUnitField>)newValue);
				return;
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS:
				getGenSupportActions().clear();
				getGenSupportActions().addAll((Collection<? extends GenUnitSupportAction>)newValue);
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
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SERVICE:
				setGenService((GenService)null);
				return;
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS:
				getGenDisplayFields().clear();
				return;
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS:
				getGenSupportActions().clear();
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
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SERVICE:
				return genService != null;
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS:
				return genDisplayFields != null && !genDisplayFields.isEmpty();
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS:
				return genSupportActions != null && !genSupportActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenDynamicUnitImpl
