/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenUserCommand;

import uk.ac.man.cs.mdsd.jsf.Command;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen User Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUserCommandImpl#getJsfCommand <em>Jsf Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenUserCommandImpl extends GenCommandImpl implements GenUserCommand {
	/**
	 * The cached value of the '{@link #getJsfCommand() <em>Jsf Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfCommand()
	 * @generated
	 * @ordered
	 */
	protected Command jsfCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenUserCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_USER_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getJsfCommand() {
		if (jsfCommand != null && jsfCommand.eIsProxy()) {
			InternalEObject oldJsfCommand = (InternalEObject)jsfCommand;
			jsfCommand = (Command)eResolveProxy(oldJsfCommand);
			if (jsfCommand != oldJsfCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_USER_COMMAND__JSF_COMMAND, oldJsfCommand, jsfCommand));
			}
		}
		return jsfCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetJsfCommand() {
		return jsfCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfCommand(Command newJsfCommand) {
		Command oldJsfCommand = jsfCommand;
		jsfCommand = newJsfCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_USER_COMMAND__JSF_COMMAND, oldJsfCommand, jsfCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_USER_COMMAND__JSF_COMMAND:
				if (resolve) return getJsfCommand();
				return basicGetJsfCommand();
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
			case GenJsfPackage.GEN_USER_COMMAND__JSF_COMMAND:
				setJsfCommand((Command)newValue);
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
			case GenJsfPackage.GEN_USER_COMMAND__JSF_COMMAND:
				setJsfCommand((Command)null);
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
			case GenJsfPackage.GEN_USER_COMMAND__JSF_COMMAND:
				return jsfCommand != null;
		}
		return super.eIsSet(featureID);
	}

} //GenUserCommandImpl
