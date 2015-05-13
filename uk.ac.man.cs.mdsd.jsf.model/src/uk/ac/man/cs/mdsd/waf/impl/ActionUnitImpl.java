/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.waf.ActionUnit;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ActionUnitImpl#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionUnitImpl extends ControlUnitImpl implements ActionUnit {
	/**
	 * The default value of the '{@link #isOmitFieldLabels() <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitFieldLabels()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMIT_FIELD_LABELS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOmitFieldLabels() <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitFieldLabels()
	 * @generated
	 * @ordered
	 */
	protected boolean omitFieldLabels = OMIT_FIELD_LABELS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.ACTION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOmitFieldLabels() {
		return omitFieldLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmitFieldLabels(boolean newOmitFieldLabels) {
		boolean oldOmitFieldLabels = omitFieldLabels;
		omitFieldLabels = newOmitFieldLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.ACTION_UNIT__OMIT_FIELD_LABELS, oldOmitFieldLabels, omitFieldLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WafPackage.ACTION_UNIT__OMIT_FIELD_LABELS:
				return isOmitFieldLabels();
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
			case WafPackage.ACTION_UNIT__OMIT_FIELD_LABELS:
				setOmitFieldLabels((Boolean)newValue);
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
			case WafPackage.ACTION_UNIT__OMIT_FIELD_LABELS:
				setOmitFieldLabels(OMIT_FIELD_LABELS_EDEFAULT);
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
			case WafPackage.ACTION_UNIT__OMIT_FIELD_LABELS:
				return omitFieldLabels != OMIT_FIELD_LABELS_EDEFAULT;
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
		result.append(" (omitFieldLabels: ");
		result.append(omitFieldLabels);
		result.append(')');
		return result.toString();
	}

} //ActionUnitImpl
