/**
 * <copyright>
 * </copyright>
 *
 * $Id: DataUnitImpl.java,v 1.11 2014/07/10 08:11:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.jsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.jsf.DataUnit;
import uk.ac.man.cs.mdsd.jsf.JsfPackage;
import uk.ac.man.cs.mdsd.jsf.Selection;
import uk.ac.man.cs.mdsd.jsf.UnitTitle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.DataUnitImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.DataUnitImpl#getDynamicTitle <em>Dynamic Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataUnitImpl extends DynamicUnitImpl implements DataUnit {
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
	 * The cached value of the '{@link #getDynamicTitle() <em>Dynamic Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicTitle()
	 * @generated
	 * @ordered
	 */
	protected UnitTitle dynamicTitle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsfPackage.Literals.DATA_UNIT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.DATA_UNIT__SELECTION, oldSelection, selection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.DATA_UNIT__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTitle getDynamicTitle() {
		if (dynamicTitle != null && dynamicTitle.eIsProxy()) {
			InternalEObject oldDynamicTitle = (InternalEObject)dynamicTitle;
			dynamicTitle = (UnitTitle)eResolveProxy(oldDynamicTitle);
			if (dynamicTitle != oldDynamicTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JsfPackage.DATA_UNIT__DYNAMIC_TITLE, oldDynamicTitle, dynamicTitle));
			}
		}
		return dynamicTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTitle basicGetDynamicTitle() {
		return dynamicTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicTitle(UnitTitle newDynamicTitle) {
		UnitTitle oldDynamicTitle = dynamicTitle;
		dynamicTitle = newDynamicTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.DATA_UNIT__DYNAMIC_TITLE, oldDynamicTitle, dynamicTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JsfPackage.DATA_UNIT__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case JsfPackage.DATA_UNIT__DYNAMIC_TITLE:
				if (resolve) return getDynamicTitle();
				return basicGetDynamicTitle();
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
			case JsfPackage.DATA_UNIT__SELECTION:
				setSelection((Selection)newValue);
				return;
			case JsfPackage.DATA_UNIT__DYNAMIC_TITLE:
				setDynamicTitle((UnitTitle)newValue);
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
			case JsfPackage.DATA_UNIT__SELECTION:
				setSelection((Selection)null);
				return;
			case JsfPackage.DATA_UNIT__DYNAMIC_TITLE:
				setDynamicTitle((UnitTitle)null);
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
			case JsfPackage.DATA_UNIT__SELECTION:
				return selection != null;
			case JsfPackage.DATA_UNIT__DYNAMIC_TITLE:
				return dynamicTitle != null;
		}
		return super.eIsSet(featureID);
	}

} //DataUnitImpl
