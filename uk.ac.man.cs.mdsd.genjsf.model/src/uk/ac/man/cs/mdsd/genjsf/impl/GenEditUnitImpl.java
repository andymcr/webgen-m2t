/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenEditUnitImpl.java,v 1.5 2013/06/06 09:51:00 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenEditUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenPage;
import uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions;
import uk.ac.man.cs.mdsd.genjsf.InputMessagePlacementOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Edit Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenEditUnitImpl#getMessagePlacementOption <em>Message Placement Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenEditUnitImpl#getFormMessageDisplayOption <em>Form Message Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenEditUnitImpl#getGenConfirmDestination <em>Gen Confirm Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenEditUnitImpl#getGenCancelDestination <em>Gen Cancel Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenEditUnitImpl extends GenDynamicUnitImpl implements GenEditUnit {
	/**
	 * The default value of the '{@link #getMessagePlacementOption() <em>Message Placement Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagePlacementOption()
	 * @generated
	 * @ordered
	 */
	protected static final InputMessagePlacementOptions MESSAGE_PLACEMENT_OPTION_EDEFAULT = InputMessagePlacementOptions.ON_FEATURE;

	/**
	 * The cached value of the '{@link #getMessagePlacementOption() <em>Message Placement Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagePlacementOption()
	 * @generated
	 * @ordered
	 */
	protected InputMessagePlacementOptions messagePlacementOption = MESSAGE_PLACEMENT_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormMessageDisplayOption() <em>Form Message Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormMessageDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected static final InputMessageDisplayOptions FORM_MESSAGE_DISPLAY_OPTION_EDEFAULT = InputMessageDisplayOptions.DESCRIPTION;

	/**
	 * The cached value of the '{@link #getFormMessageDisplayOption() <em>Form Message Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormMessageDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected InputMessageDisplayOptions formMessageDisplayOption = FORM_MESSAGE_DISPLAY_OPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenConfirmDestination() <em>Gen Confirm Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenConfirmDestination()
	 * @generated
	 * @ordered
	 */
	protected GenPage genConfirmDestination;

	/**
	 * The cached value of the '{@link #getGenCancelDestination() <em>Gen Cancel Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenCancelDestination()
	 * @generated
	 * @ordered
	 */
	protected GenPage genCancelDestination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenEditUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_EDIT_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMessagePlacementOptions getMessagePlacementOption() {
		return messagePlacementOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagePlacementOption(InputMessagePlacementOptions newMessagePlacementOption) {
		InputMessagePlacementOptions oldMessagePlacementOption = messagePlacementOption;
		messagePlacementOption = newMessagePlacementOption == null ? MESSAGE_PLACEMENT_OPTION_EDEFAULT : newMessagePlacementOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_EDIT_UNIT__MESSAGE_PLACEMENT_OPTION, oldMessagePlacementOption, messagePlacementOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMessageDisplayOptions getFormMessageDisplayOption() {
		return formMessageDisplayOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormMessageDisplayOption(InputMessageDisplayOptions newFormMessageDisplayOption) {
		InputMessageDisplayOptions oldFormMessageDisplayOption = formMessageDisplayOption;
		formMessageDisplayOption = newFormMessageDisplayOption == null ? FORM_MESSAGE_DISPLAY_OPTION_EDEFAULT : newFormMessageDisplayOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_EDIT_UNIT__FORM_MESSAGE_DISPLAY_OPTION, oldFormMessageDisplayOption, formMessageDisplayOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPage getGenConfirmDestination() {
		if (genConfirmDestination != null && genConfirmDestination.eIsProxy()) {
			InternalEObject oldGenConfirmDestination = (InternalEObject)genConfirmDestination;
			genConfirmDestination = (GenPage)eResolveProxy(oldGenConfirmDestination);
			if (genConfirmDestination != oldGenConfirmDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_EDIT_UNIT__GEN_CONFIRM_DESTINATION, oldGenConfirmDestination, genConfirmDestination));
			}
		}
		return genConfirmDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPage basicGetGenConfirmDestination() {
		return genConfirmDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenConfirmDestination(GenPage newGenConfirmDestination) {
		GenPage oldGenConfirmDestination = genConfirmDestination;
		genConfirmDestination = newGenConfirmDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_EDIT_UNIT__GEN_CONFIRM_DESTINATION, oldGenConfirmDestination, genConfirmDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPage getGenCancelDestination() {
		if (genCancelDestination != null && genCancelDestination.eIsProxy()) {
			InternalEObject oldGenCancelDestination = (InternalEObject)genCancelDestination;
			genCancelDestination = (GenPage)eResolveProxy(oldGenCancelDestination);
			if (genCancelDestination != oldGenCancelDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_EDIT_UNIT__GEN_CANCEL_DESTINATION, oldGenCancelDestination, genCancelDestination));
			}
		}
		return genCancelDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPage basicGetGenCancelDestination() {
		return genCancelDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenCancelDestination(GenPage newGenCancelDestination) {
		GenPage oldGenCancelDestination = genCancelDestination;
		genCancelDestination = newGenCancelDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_EDIT_UNIT__GEN_CANCEL_DESTINATION, oldGenCancelDestination, genCancelDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void reconcile(final GenContentUnit oldGenUnit) {
		super.reconcile(oldGenUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenContentUnit oldGenUnit) {
		super.reconcileSettings(oldGenUnit);

		if (oldGenUnit instanceof GenEditUnit) {
			final GenEditUnit oldGenEditUnit = (GenEditUnit) oldGenUnit;
			setFormMessageDisplayOption(oldGenEditUnit.getFormMessageDisplayOption());
			setMessagePlacementOption(oldGenEditUnit.getMessagePlacementOption());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_EDIT_UNIT__MESSAGE_PLACEMENT_OPTION:
				return getMessagePlacementOption();
			case GenJsfPackage.GEN_EDIT_UNIT__FORM_MESSAGE_DISPLAY_OPTION:
				return getFormMessageDisplayOption();
			case GenJsfPackage.GEN_EDIT_UNIT__GEN_CONFIRM_DESTINATION:
				if (resolve) return getGenConfirmDestination();
				return basicGetGenConfirmDestination();
			case GenJsfPackage.GEN_EDIT_UNIT__GEN_CANCEL_DESTINATION:
				if (resolve) return getGenCancelDestination();
				return basicGetGenCancelDestination();
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
			case GenJsfPackage.GEN_EDIT_UNIT__MESSAGE_PLACEMENT_OPTION:
				setMessagePlacementOption((InputMessagePlacementOptions)newValue);
				return;
			case GenJsfPackage.GEN_EDIT_UNIT__FORM_MESSAGE_DISPLAY_OPTION:
				setFormMessageDisplayOption((InputMessageDisplayOptions)newValue);
				return;
			case GenJsfPackage.GEN_EDIT_UNIT__GEN_CONFIRM_DESTINATION:
				setGenConfirmDestination((GenPage)newValue);
				return;
			case GenJsfPackage.GEN_EDIT_UNIT__GEN_CANCEL_DESTINATION:
				setGenCancelDestination((GenPage)newValue);
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
			case GenJsfPackage.GEN_EDIT_UNIT__MESSAGE_PLACEMENT_OPTION:
				setMessagePlacementOption(MESSAGE_PLACEMENT_OPTION_EDEFAULT);
				return;
			case GenJsfPackage.GEN_EDIT_UNIT__FORM_MESSAGE_DISPLAY_OPTION:
				setFormMessageDisplayOption(FORM_MESSAGE_DISPLAY_OPTION_EDEFAULT);
				return;
			case GenJsfPackage.GEN_EDIT_UNIT__GEN_CONFIRM_DESTINATION:
				setGenConfirmDestination((GenPage)null);
				return;
			case GenJsfPackage.GEN_EDIT_UNIT__GEN_CANCEL_DESTINATION:
				setGenCancelDestination((GenPage)null);
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
			case GenJsfPackage.GEN_EDIT_UNIT__MESSAGE_PLACEMENT_OPTION:
				return messagePlacementOption != MESSAGE_PLACEMENT_OPTION_EDEFAULT;
			case GenJsfPackage.GEN_EDIT_UNIT__FORM_MESSAGE_DISPLAY_OPTION:
				return formMessageDisplayOption != FORM_MESSAGE_DISPLAY_OPTION_EDEFAULT;
			case GenJsfPackage.GEN_EDIT_UNIT__GEN_CONFIRM_DESTINATION:
				return genConfirmDestination != null;
			case GenJsfPackage.GEN_EDIT_UNIT__GEN_CANCEL_DESTINATION:
				return genCancelDestination != null;
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
		result.append(" (messagePlacementOption: ");
		result.append(messagePlacementOption);
		result.append(", formMessageDisplayOption: ");
		result.append(formMessageDisplayOption);
		result.append(')');
		return result.toString();
	}

} //GenEditUnitImpl
