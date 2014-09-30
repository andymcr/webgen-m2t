/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit;
import uk.ac.man.cs.mdsd.genjsf.GenFixedActionMenuEntry;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;

import uk.ac.man.cs.mdsd.jsf.FixedActionMenuEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Fixed Action Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFixedActionMenuEntryImpl#getJsfMenuEntry <em>Jsf Menu Entry</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenFixedActionMenuEntryImpl#getGenDestination <em>Gen Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenFixedActionMenuEntryImpl extends GenMenuEntryImpl implements GenFixedActionMenuEntry {
	/**
	 * The cached value of the '{@link #getJsfMenuEntry() <em>Jsf Menu Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfMenuEntry()
	 * @generated
	 * @ordered
	 */
	protected FixedActionMenuEntry jsfMenuEntry;

	/**
	 * The cached value of the '{@link #getGenDestination() <em>Gen Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDestination()
	 * @generated
	 * @ordered
	 */
	protected GenDynamicUnit genDestination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenFixedActionMenuEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_FIXED_ACTION_MENU_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedActionMenuEntry getJsfMenuEntry() {
		if (jsfMenuEntry != null && jsfMenuEntry.eIsProxy()) {
			InternalEObject oldJsfMenuEntry = (InternalEObject)jsfMenuEntry;
			jsfMenuEntry = (FixedActionMenuEntry)eResolveProxy(oldJsfMenuEntry);
			if (jsfMenuEntry != oldJsfMenuEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_FIXED_ACTION_MENU_ENTRY__JSF_MENU_ENTRY, oldJsfMenuEntry, jsfMenuEntry));
			}
		}
		return jsfMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedActionMenuEntry basicGetJsfMenuEntry() {
		return jsfMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfMenuEntry(FixedActionMenuEntry newJsfMenuEntry) {
		FixedActionMenuEntry oldJsfMenuEntry = jsfMenuEntry;
		jsfMenuEntry = newJsfMenuEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_FIXED_ACTION_MENU_ENTRY__JSF_MENU_ENTRY, oldJsfMenuEntry, jsfMenuEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDynamicUnit getGenDestination() {
		if (genDestination != null && genDestination.eIsProxy()) {
			InternalEObject oldGenDestination = (InternalEObject)genDestination;
			genDestination = (GenDynamicUnit)eResolveProxy(oldGenDestination);
			if (genDestination != oldGenDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_FIXED_ACTION_MENU_ENTRY__GEN_DESTINATION, oldGenDestination, genDestination));
			}
		}
		return genDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDynamicUnit basicGetGenDestination() {
		return genDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenDestination(GenDynamicUnit newGenDestination) {
		GenDynamicUnit oldGenDestination = genDestination;
		genDestination = newGenDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_FIXED_ACTION_MENU_ENTRY__GEN_DESTINATION, oldGenDestination, genDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_FIXED_ACTION_MENU_ENTRY__JSF_MENU_ENTRY:
				if (resolve) return getJsfMenuEntry();
				return basicGetJsfMenuEntry();
			case GenJsfPackage.GEN_FIXED_ACTION_MENU_ENTRY__GEN_DESTINATION:
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
			case GenJsfPackage.GEN_FIXED_ACTION_MENU_ENTRY__JSF_MENU_ENTRY:
				setJsfMenuEntry((FixedActionMenuEntry)newValue);
				return;
			case GenJsfPackage.GEN_FIXED_ACTION_MENU_ENTRY__GEN_DESTINATION:
				setGenDestination((GenDynamicUnit)newValue);
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
			case GenJsfPackage.GEN_FIXED_ACTION_MENU_ENTRY__JSF_MENU_ENTRY:
				setJsfMenuEntry((FixedActionMenuEntry)null);
				return;
			case GenJsfPackage.GEN_FIXED_ACTION_MENU_ENTRY__GEN_DESTINATION:
				setGenDestination((GenDynamicUnit)null);
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
			case GenJsfPackage.GEN_FIXED_ACTION_MENU_ENTRY__JSF_MENU_ENTRY:
				return jsfMenuEntry != null;
			case GenJsfPackage.GEN_FIXED_ACTION_MENU_ENTRY__GEN_DESTINATION:
				return genDestination != null;
		}
		return super.eIsSet(featureID);
	}

} //GenFixedActionMenuEntryImpl
