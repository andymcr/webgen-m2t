/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenUnitSupportAction;

import uk.ac.man.cs.mdsd.jsf.UnitSupportAction;

import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Unit Support Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitSupportActionImpl#getJsfAction <em>Jsf Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenUnitSupportActionImpl extends NamedElementImpl implements GenUnitSupportAction {
	/**
	 * The cached value of the '{@link #getJsfAction() <em>Jsf Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfAction()
	 * @generated
	 * @ordered
	 */
	protected UnitSupportAction jsfAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenUnitSupportActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_UNIT_SUPPORT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSupportAction getJsfAction() {
		if (jsfAction != null && jsfAction.eIsProxy()) {
			InternalEObject oldJsfAction = (InternalEObject)jsfAction;
			jsfAction = (UnitSupportAction)eResolveProxy(oldJsfAction);
			if (jsfAction != oldJsfAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_UNIT_SUPPORT_ACTION__JSF_ACTION, oldJsfAction, jsfAction));
			}
		}
		return jsfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSupportAction basicGetJsfAction() {
		return jsfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfAction(UnitSupportAction newJsfAction) {
		UnitSupportAction oldJsfAction = jsfAction;
		jsfAction = newJsfAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_SUPPORT_ACTION__JSF_ACTION, oldJsfAction, jsfAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_UNIT_SUPPORT_ACTION__JSF_ACTION:
				if (resolve) return getJsfAction();
				return basicGetJsfAction();
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
			case GenJsfPackage.GEN_UNIT_SUPPORT_ACTION__JSF_ACTION:
				setJsfAction((UnitSupportAction)newValue);
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
			case GenJsfPackage.GEN_UNIT_SUPPORT_ACTION__JSF_ACTION:
				setJsfAction((UnitSupportAction)null);
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
			case GenJsfPackage.GEN_UNIT_SUPPORT_ACTION__JSF_ACTION:
				return jsfAction != null;
		}
		return super.eIsSet(featureID);
	}

} //GenUnitSupportActionImpl
