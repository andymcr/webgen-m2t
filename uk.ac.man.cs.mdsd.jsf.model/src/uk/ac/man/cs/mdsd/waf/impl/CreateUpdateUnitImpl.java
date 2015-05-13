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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.waf.CreateUpdateUnit;
import uk.ac.man.cs.mdsd.waf.WafPackage;
import uk.ac.man.cs.mdsd.waf.SelectAction;
import uk.ac.man.cs.mdsd.waf.SelectTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Update Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.CreateUpdateUnitImpl#getTargettingActions <em>Targetting Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.CreateUpdateUnitImpl#getClearLabel <em>Clear Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateUpdateUnitImpl extends EditUnitImpl implements CreateUpdateUnit {
	/**
	 * The cached value of the '{@link #getTargettingActions() <em>Targetting Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargettingActions()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectAction> targettingActions;

	/**
	 * The default value of the '{@link #getClearLabel() <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String CLEAR_LABEL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getClearLabel() <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearLabel()
	 * @generated
	 * @ordered
	 */
	protected String clearLabel = CLEAR_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateUpdateUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.CREATE_UPDATE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectAction> getTargettingActions() {
		if (targettingActions == null) {
			targettingActions = new EObjectWithInverseResolvingEList<SelectAction>(SelectAction.class, this, WafPackage.CREATE_UPDATE_UNIT__TARGETTING_ACTIONS, WafPackage.SELECT_ACTION__TARGET);
		}
		return targettingActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClearLabel() {
		return clearLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearLabel(String newClearLabel) {
		String oldClearLabel = clearLabel;
		clearLabel = newClearLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL, oldClearLabel, clearLabel));
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
			case WafPackage.CREATE_UPDATE_UNIT__TARGETTING_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargettingActions()).basicAdd(otherEnd, msgs);
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
			case WafPackage.CREATE_UPDATE_UNIT__TARGETTING_ACTIONS:
				return ((InternalEList<?>)getTargettingActions()).basicRemove(otherEnd, msgs);
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
			case WafPackage.CREATE_UPDATE_UNIT__TARGETTING_ACTIONS:
				return getTargettingActions();
			case WafPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				return getClearLabel();
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
			case WafPackage.CREATE_UPDATE_UNIT__TARGETTING_ACTIONS:
				getTargettingActions().clear();
				getTargettingActions().addAll((Collection<? extends SelectAction>)newValue);
				return;
			case WafPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				setClearLabel((String)newValue);
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
			case WafPackage.CREATE_UPDATE_UNIT__TARGETTING_ACTIONS:
				getTargettingActions().clear();
				return;
			case WafPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				setClearLabel(CLEAR_LABEL_EDEFAULT);
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
			case WafPackage.CREATE_UPDATE_UNIT__TARGETTING_ACTIONS:
				return targettingActions != null && !targettingActions.isEmpty();
			case WafPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				return CLEAR_LABEL_EDEFAULT == null ? clearLabel != null : !CLEAR_LABEL_EDEFAULT.equals(clearLabel);
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
		if (baseClass == SelectTarget.class) {
			switch (derivedFeatureID) {
				case WafPackage.CREATE_UPDATE_UNIT__TARGETTING_ACTIONS: return WafPackage.SELECT_TARGET__TARGETTING_ACTIONS;
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
		if (baseClass == SelectTarget.class) {
			switch (baseFeatureID) {
				case WafPackage.SELECT_TARGET__TARGETTING_ACTIONS: return WafPackage.CREATE_UPDATE_UNIT__TARGETTING_ACTIONS;
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
		result.append(" (clearLabel: ");
		result.append(clearLabel);
		result.append(')');
		return result.toString();
	}

} //CreateUpdateUnitImpl
