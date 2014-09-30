/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.man.cs.mdsd.genjsf.GenIncludedElement;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Included Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenIncludedElementImpl#getMessageDisplayOption <em>Message Display Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenIncludedElementImpl extends EObjectImpl implements GenIncludedElement {
	/**
	 * The default value of the '{@link #getMessageDisplayOption() <em>Message Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected static final InputMessageDisplayOptions MESSAGE_DISPLAY_OPTION_EDEFAULT = InputMessageDisplayOptions.DESCRIPTION;

	/**
	 * The cached value of the '{@link #getMessageDisplayOption() <em>Message Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected InputMessageDisplayOptions messageDisplayOption = MESSAGE_DISPLAY_OPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenIncludedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_INCLUDED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMessageDisplayOptions getMessageDisplayOption() {
		return messageDisplayOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDisplayOption(InputMessageDisplayOptions newMessageDisplayOption) {
		InputMessageDisplayOptions oldMessageDisplayOption = messageDisplayOption;
		messageDisplayOption = newMessageDisplayOption == null ? MESSAGE_DISPLAY_OPTION_EDEFAULT : newMessageDisplayOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_INCLUDED_ELEMENT__MESSAGE_DISPLAY_OPTION, oldMessageDisplayOption, messageDisplayOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_INCLUDED_ELEMENT__MESSAGE_DISPLAY_OPTION:
				return getMessageDisplayOption();
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
			case GenJsfPackage.GEN_INCLUDED_ELEMENT__MESSAGE_DISPLAY_OPTION:
				setMessageDisplayOption((InputMessageDisplayOptions)newValue);
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
			case GenJsfPackage.GEN_INCLUDED_ELEMENT__MESSAGE_DISPLAY_OPTION:
				setMessageDisplayOption(MESSAGE_DISPLAY_OPTION_EDEFAULT);
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
			case GenJsfPackage.GEN_INCLUDED_ELEMENT__MESSAGE_DISPLAY_OPTION:
				return messageDisplayOption != MESSAGE_DISPLAY_OPTION_EDEFAULT;
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
		result.append(" (messageDisplayOption: ");
		result.append(messageDisplayOption);
		result.append(')');
		return result.toString();
	}

} //GenIncludedElementImpl
