/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.waf.Command;
import uk.ac.man.cs.mdsd.waf.CommandUnit;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.CommandUnitImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandUnitImpl extends ContentUnitImpl implements CommandUnit {
	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.COMMAND_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentWithInverseEList<Command>(Command.class, this, WafPackage.COMMAND_UNIT__COMMANDS, WafPackage.COMMAND__PART_OF);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.COMMAND_UNIT__COMMANDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommands()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.COMMAND_UNIT__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WafPackage.COMMAND_UNIT__COMMANDS:
				return getCommands();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WafPackage.COMMAND_UNIT__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>)newValue);
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
			case WafPackage.COMMAND_UNIT__COMMANDS:
				getCommands().clear();
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
			case WafPackage.COMMAND_UNIT__COMMANDS:
				return commands != null && !commands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommandUnitImpl
