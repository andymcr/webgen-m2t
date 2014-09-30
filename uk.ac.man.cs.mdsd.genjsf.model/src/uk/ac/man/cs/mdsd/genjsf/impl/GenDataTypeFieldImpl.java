/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genjsf.GenDataTypeField;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;

import uk.ac.man.cs.mdsd.genorm.GenDataType;

import uk.ac.man.cs.mdsd.jsf.DataTypeField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Data Type Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDataTypeFieldImpl#getGenDataType <em>Gen Data Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDataTypeFieldImpl#getJsfField <em>Jsf Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenDataTypeFieldImpl extends GenInterfaceFieldImpl implements GenDataTypeField {
	/**
	 * The cached value of the '{@link #getGenDataType() <em>Gen Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDataType()
	 * @generated
	 * @ordered
	 */
	protected GenDataType genDataType;

	/**
	 * The cached value of the '{@link #getJsfField() <em>Jsf Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfField()
	 * @generated
	 * @ordered
	 */
	protected DataTypeField jsfField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDataTypeFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_DATA_TYPE_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDataType getGenDataType() {
		if (genDataType != null && genDataType.eIsProxy()) {
			InternalEObject oldGenDataType = (InternalEObject)genDataType;
			genDataType = (GenDataType)eResolveProxy(oldGenDataType);
			if (genDataType != oldGenDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_DATA_TYPE_FIELD__GEN_DATA_TYPE, oldGenDataType, genDataType));
			}
		}
		return genDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDataType basicGetGenDataType() {
		return genDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenDataType(GenDataType newGenDataType) {
		GenDataType oldGenDataType = genDataType;
		genDataType = newGenDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_DATA_TYPE_FIELD__GEN_DATA_TYPE, oldGenDataType, genDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeField getJsfField() {
		if (jsfField != null && jsfField.eIsProxy()) {
			InternalEObject oldJsfField = (InternalEObject)jsfField;
			jsfField = (DataTypeField)eResolveProxy(oldJsfField);
			if (jsfField != oldJsfField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_DATA_TYPE_FIELD__JSF_FIELD, oldJsfField, jsfField));
			}
		}
		return jsfField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeField basicGetJsfField() {
		return jsfField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfField(DataTypeField newJsfField) {
		DataTypeField oldJsfField = jsfField;
		jsfField = newJsfField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_DATA_TYPE_FIELD__JSF_FIELD, oldJsfField, jsfField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_DATA_TYPE_FIELD__GEN_DATA_TYPE:
				if (resolve) return getGenDataType();
				return basicGetGenDataType();
			case GenJsfPackage.GEN_DATA_TYPE_FIELD__JSF_FIELD:
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
			case GenJsfPackage.GEN_DATA_TYPE_FIELD__GEN_DATA_TYPE:
				setGenDataType((GenDataType)newValue);
				return;
			case GenJsfPackage.GEN_DATA_TYPE_FIELD__JSF_FIELD:
				setJsfField((DataTypeField)newValue);
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
			case GenJsfPackage.GEN_DATA_TYPE_FIELD__GEN_DATA_TYPE:
				setGenDataType((GenDataType)null);
				return;
			case GenJsfPackage.GEN_DATA_TYPE_FIELD__JSF_FIELD:
				setJsfField((DataTypeField)null);
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
			case GenJsfPackage.GEN_DATA_TYPE_FIELD__GEN_DATA_TYPE:
				return genDataType != null;
			case GenJsfPackage.GEN_DATA_TYPE_FIELD__JSF_FIELD:
				return jsfField != null;
		}
		return super.eIsSet(featureID);
	}

} //GenDataTypeFieldImpl
