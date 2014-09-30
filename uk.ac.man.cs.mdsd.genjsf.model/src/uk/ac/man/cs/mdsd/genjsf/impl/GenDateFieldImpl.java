/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genjsf.GenDateField;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;

import uk.ac.man.cs.mdsd.jsf.DateField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Date Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDateFieldImpl#getJsfField <em>Jsf Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenDateFieldImpl extends GenInterfaceFieldImpl implements GenDateField {
	/**
	 * The cached value of the '{@link #getJsfField() <em>Jsf Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfField()
	 * @generated
	 * @ordered
	 */
	protected DateField jsfField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDateFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_DATE_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateField getJsfField() {
		if (jsfField != null && jsfField.eIsProxy()) {
			InternalEObject oldJsfField = (InternalEObject)jsfField;
			jsfField = (DateField)eResolveProxy(oldJsfField);
			if (jsfField != oldJsfField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_DATE_FIELD__JSF_FIELD, oldJsfField, jsfField));
			}
		}
		return jsfField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateField basicGetJsfField() {
		return jsfField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfField(DateField newJsfField) {
		DateField oldJsfField = jsfField;
		jsfField = newJsfField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_DATE_FIELD__JSF_FIELD, oldJsfField, jsfField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_DATE_FIELD__JSF_FIELD:
				if (resolve) return getJsfField();
				return basicGetJsfField();
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
			case GenJsfPackage.GEN_DATE_FIELD__JSF_FIELD:
				setJsfField((DateField)newValue);
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
			case GenJsfPackage.GEN_DATE_FIELD__JSF_FIELD:
				setJsfField((DateField)null);
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
			case GenJsfPackage.GEN_DATE_FIELD__JSF_FIELD:
				return jsfField != null;
		}
		return super.eIsSet(featureID);
	}

} //GenDateFieldImpl
