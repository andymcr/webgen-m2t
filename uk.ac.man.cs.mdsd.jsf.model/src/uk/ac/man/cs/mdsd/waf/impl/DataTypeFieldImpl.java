/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.orm.DataType;
import uk.ac.man.cs.mdsd.waf.DataTypeField;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.DataTypeFieldImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.DataTypeFieldImpl#isCaseInsensitive <em>Case Insensitive</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.DataTypeFieldImpl#isObfuscateFormFields <em>Obfuscate Form Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.DataTypeFieldImpl#isEncrypt <em>Encrypt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeFieldImpl extends InterfaceFieldImpl implements DataTypeField {
	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

	/**
	 * The default value of the '{@link #isCaseInsensitive() <em>Case Insensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCaseInsensitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CASE_INSENSITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCaseInsensitive() <em>Case Insensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCaseInsensitive()
	 * @generated
	 * @ordered
	 */
	protected boolean caseInsensitive = CASE_INSENSITIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isObfuscateFormFields() <em>Obfuscate Form Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObfuscateFormFields()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBFUSCATE_FORM_FIELDS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObfuscateFormFields() <em>Obfuscate Form Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObfuscateFormFields()
	 * @generated
	 * @ordered
	 */
	protected boolean obfuscateFormFields = OBFUSCATE_FORM_FIELDS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEncrypt() <em>Encrypt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncrypt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENCRYPT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEncrypt() <em>Encrypt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncrypt()
	 * @generated
	 * @ordered
	 */
	protected boolean encrypt = ENCRYPT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.DATA_TYPE_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DataType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.DATA_TYPE_FIELD__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.DATA_TYPE_FIELD__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCaseInsensitive() {
		return caseInsensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseInsensitive(boolean newCaseInsensitive) {
		boolean oldCaseInsensitive = caseInsensitive;
		caseInsensitive = newCaseInsensitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.DATA_TYPE_FIELD__CASE_INSENSITIVE, oldCaseInsensitive, caseInsensitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObfuscateFormFields() {
		return obfuscateFormFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObfuscateFormFields(boolean newObfuscateFormFields) {
		boolean oldObfuscateFormFields = obfuscateFormFields;
		obfuscateFormFields = newObfuscateFormFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS, oldObfuscateFormFields, obfuscateFormFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEncrypt() {
		return encrypt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncrypt(boolean newEncrypt) {
		boolean oldEncrypt = encrypt;
		encrypt = newEncrypt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.DATA_TYPE_FIELD__ENCRYPT, oldEncrypt, encrypt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WafPackage.DATA_TYPE_FIELD__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case WafPackage.DATA_TYPE_FIELD__CASE_INSENSITIVE:
				return isCaseInsensitive();
			case WafPackage.DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS:
				return isObfuscateFormFields();
			case WafPackage.DATA_TYPE_FIELD__ENCRYPT:
				return isEncrypt();
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
			case WafPackage.DATA_TYPE_FIELD__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case WafPackage.DATA_TYPE_FIELD__CASE_INSENSITIVE:
				setCaseInsensitive((Boolean)newValue);
				return;
			case WafPackage.DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS:
				setObfuscateFormFields((Boolean)newValue);
				return;
			case WafPackage.DATA_TYPE_FIELD__ENCRYPT:
				setEncrypt((Boolean)newValue);
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
			case WafPackage.DATA_TYPE_FIELD__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case WafPackage.DATA_TYPE_FIELD__CASE_INSENSITIVE:
				setCaseInsensitive(CASE_INSENSITIVE_EDEFAULT);
				return;
			case WafPackage.DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS:
				setObfuscateFormFields(OBFUSCATE_FORM_FIELDS_EDEFAULT);
				return;
			case WafPackage.DATA_TYPE_FIELD__ENCRYPT:
				setEncrypt(ENCRYPT_EDEFAULT);
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
			case WafPackage.DATA_TYPE_FIELD__DATA_TYPE:
				return dataType != null;
			case WafPackage.DATA_TYPE_FIELD__CASE_INSENSITIVE:
				return caseInsensitive != CASE_INSENSITIVE_EDEFAULT;
			case WafPackage.DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS:
				return obfuscateFormFields != OBFUSCATE_FORM_FIELDS_EDEFAULT;
			case WafPackage.DATA_TYPE_FIELD__ENCRYPT:
				return encrypt != ENCRYPT_EDEFAULT;
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
		result.append(" (caseInsensitive: ");
		result.append(caseInsensitive);
		result.append(", obfuscateFormFields: ");
		result.append(obfuscateFormFields);
		result.append(", encrypt: ");
		result.append(encrypt);
		result.append(')');
		return result.toString();
	}

} //DataTypeFieldImpl
