/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.genjsf.GenCommand;
import uk.ac.man.cs.mdsd.genjsf.GenFixedCommandMenuEntry;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;

import uk.ac.man.cs.mdsd.jsf.FixedCommandMenuEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Fixed Command Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFixedCommandMenuEntryImpl#getJsfMenuEntry <em>Jsf Menu Entry</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFixedCommandMenuEntryImpl#getGenDestination <em>Gen Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenFixedCommandMenuEntryImpl extends GenMenuEntryImpl implements GenFixedCommandMenuEntry {
	/**
	 * The cached value of the '{@link #getJsfMenuEntry() <em>Jsf Menu Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfMenuEntry()
	 * @generated
	 * @ordered
	 */
	protected FixedCommandMenuEntry jsfMenuEntry;

	/**
	 * The cached value of the '{@link #getGenDestination() <em>Gen Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDestination()
	 * @generated
	 * @ordered
	 */
	protected GenCommand genDestination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenFixedCommandMenuEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_FIXED_COMMAND_MENU_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedCommandMenuEntry getJsfMenuEntry() {
		if (jsfMenuEntry != null && jsfMenuEntry.eIsProxy()) {
			InternalEObject oldJsfMenuEntry = (InternalEObject)jsfMenuEntry;
			jsfMenuEntry = (FixedCommandMenuEntry)eResolveProxy(oldJsfMenuEntry);
			if (jsfMenuEntry != oldJsfMenuEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_FIXED_COMMAND_MENU_ENTRY__JSF_MENU_ENTRY, oldJsfMenuEntry, jsfMenuEntry));
			}
		}
		return jsfMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedCommandMenuEntry basicGetJsfMenuEntry() {
		return jsfMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfMenuEntry(FixedCommandMenuEntry newJsfMenuEntry) {
		FixedCommandMenuEntry oldJsfMenuEntry = jsfMenuEntry;
		jsfMenuEntry = newJsfMenuEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_FIXED_COMMAND_MENU_ENTRY__JSF_MENU_ENTRY, oldJsfMenuEntry, jsfMenuEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCommand getGenDestination() {
		if (genDestination != null && genDestination.eIsProxy()) {
			InternalEObject oldGenDestination = (InternalEObject)genDestination;
			genDestination = (GenCommand)eResolveProxy(oldGenDestination);
			if (genDestination != oldGenDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_FIXED_COMMAND_MENU_ENTRY__GEN_DESTINATION, oldGenDestination, genDestination));
			}
		}
		return genDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCommand basicGetGenDestination() {
		return genDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenDestination(GenCommand newGenDestination) {
		GenCommand oldGenDestination = genDestination;
		genDestination = newGenDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_FIXED_COMMAND_MENU_ENTRY__GEN_DESTINATION, oldGenDestination, genDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_FIXED_COMMAND_MENU_ENTRY__JSF_MENU_ENTRY:
				if (resolve) return getJsfMenuEntry();
				return basicGetJsfMenuEntry();
			case GenJsfPackage.GEN_FIXED_COMMAND_MENU_ENTRY__GEN_DESTINATION:
				if (resolve) return getGenDestination();
				return basicGetGenDestination();
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
			case GenJsfPackage.GEN_FIXED_COMMAND_MENU_ENTRY__JSF_MENU_ENTRY:
				setJsfMenuEntry((FixedCommandMenuEntry)newValue);
				return;
			case GenJsfPackage.GEN_FIXED_COMMAND_MENU_ENTRY__GEN_DESTINATION:
				setGenDestination((GenCommand)newValue);
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
			case GenJsfPackage.GEN_FIXED_COMMAND_MENU_ENTRY__JSF_MENU_ENTRY:
				setJsfMenuEntry((FixedCommandMenuEntry)null);
				return;
			case GenJsfPackage.GEN_FIXED_COMMAND_MENU_ENTRY__GEN_DESTINATION:
				setGenDestination((GenCommand)null);
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
			case GenJsfPackage.GEN_FIXED_COMMAND_MENU_ENTRY__JSF_MENU_ENTRY:
				return jsfMenuEntry != null;
			case GenJsfPackage.GEN_FIXED_COMMAND_MENU_ENTRY__GEN_DESTINATION:
				return genDestination != null;
		}
		return super.eIsSet(featureID);
	}

} //GenFixedCommandMenuEntryImpl
