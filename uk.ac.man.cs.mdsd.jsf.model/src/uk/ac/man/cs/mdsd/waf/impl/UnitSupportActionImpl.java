/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.orm.impl.NamedDisplayElementImpl;
import uk.ac.man.cs.mdsd.waf.WafPackage;
import uk.ac.man.cs.mdsd.waf.UnitSupportAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Support Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitSupportActionImpl#getConfirmMessage <em>Confirm Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitSupportActionImpl extends NamedDisplayElementImpl implements UnitSupportAction {
	/**
	 * The default value of the '{@link #getConfirmMessage() <em>Confirm Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRM_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfirmMessage() <em>Confirm Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmMessage()
	 * @generated
	 * @ordered
	 */
	protected String confirmMessage = CONFIRM_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitSupportActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.UNIT_SUPPORT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfirmMessage() {
		return confirmMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmMessage(String newConfirmMessage) {
		String oldConfirmMessage = confirmMessage;
		confirmMessage = newConfirmMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE, oldConfirmMessage, confirmMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WafPackage.UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE:
				return getConfirmMessage();
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
			case WafPackage.UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE:
				setConfirmMessage((String)newValue);
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
			case WafPackage.UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE:
				setConfirmMessage(CONFIRM_MESSAGE_EDEFAULT);
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
			case WafPackage.UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE:
				return CONFIRM_MESSAGE_EDEFAULT == null ? confirmMessage != null : !CONFIRM_MESSAGE_EDEFAULT.equals(confirmMessage);
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
		result.append(" (confirmMessage: ");
		result.append(confirmMessage);
		result.append(')');
		return result.toString();
	}

} //UnitSupportActionImpl
