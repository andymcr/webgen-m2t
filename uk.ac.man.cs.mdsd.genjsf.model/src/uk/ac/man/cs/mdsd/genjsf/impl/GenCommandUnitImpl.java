/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.genjsf.GenCommand;
import uk.ac.man.cs.mdsd.genjsf.GenCommandUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;

import uk.ac.man.cs.mdsd.jsf.CommandUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Command Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCommandUnitImpl#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCommandUnitImpl#getGenCommands <em>Gen Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenCommandUnitImpl extends GenContentUnitImpl implements GenCommandUnit {
	/**
	 * The cached value of the '{@link #getJsfUnit() <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfUnit()
	 * @generated
	 * @ordered
	 */
	protected CommandUnit jsfUnit;

	/**
	 * The cached value of the '{@link #getGenCommands() <em>Gen Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<GenCommand> genCommands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCommandUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_COMMAND_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandUnit getJsfUnit() {
		if (jsfUnit != null && jsfUnit.eIsProxy()) {
			InternalEObject oldJsfUnit = (InternalEObject)jsfUnit;
			jsfUnit = (CommandUnit)eResolveProxy(oldJsfUnit);
			if (jsfUnit != oldJsfUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_COMMAND_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
			}
		}
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandUnit basicGetJsfUnit() {
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfUnit(CommandUnit newJsfUnit) {
		CommandUnit oldJsfUnit = jsfUnit;
		jsfUnit = newJsfUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_COMMAND_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenCommand> getGenCommands() {
		if (genCommands == null) {
			genCommands = new EObjectContainmentWithInverseEList<GenCommand>(GenCommand.class, this, GenJsfPackage.GEN_COMMAND_UNIT__GEN_COMMANDS, GenJsfPackage.GEN_COMMAND__GEN_PART_OF);
		}
		return genCommands;
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
			case GenJsfPackage.GEN_COMMAND_UNIT__GEN_COMMANDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenCommands()).basicAdd(otherEnd, msgs);
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
			case GenJsfPackage.GEN_COMMAND_UNIT__GEN_COMMANDS:
				return ((InternalEList<?>)getGenCommands()).basicRemove(otherEnd, msgs);
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
			case GenJsfPackage.GEN_COMMAND_UNIT__JSF_UNIT:
				if (resolve) return getJsfUnit();
				return basicGetJsfUnit();
			case GenJsfPackage.GEN_COMMAND_UNIT__GEN_COMMANDS:
				return getGenCommands();
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
			case GenJsfPackage.GEN_COMMAND_UNIT__JSF_UNIT:
				setJsfUnit((CommandUnit)newValue);
				return;
			case GenJsfPackage.GEN_COMMAND_UNIT__GEN_COMMANDS:
				getGenCommands().clear();
				getGenCommands().addAll((Collection<? extends GenCommand>)newValue);
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
			case GenJsfPackage.GEN_COMMAND_UNIT__JSF_UNIT:
				setJsfUnit((CommandUnit)null);
				return;
			case GenJsfPackage.GEN_COMMAND_UNIT__GEN_COMMANDS:
				getGenCommands().clear();
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
			case GenJsfPackage.GEN_COMMAND_UNIT__JSF_UNIT:
				return jsfUnit != null;
			case GenJsfPackage.GEN_COMMAND_UNIT__GEN_COMMANDS:
				return genCommands != null && !genCommands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenCommandUnitImpl
