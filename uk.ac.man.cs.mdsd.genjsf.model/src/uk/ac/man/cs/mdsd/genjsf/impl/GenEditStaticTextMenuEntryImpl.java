/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genjsf.GenEditStaticTextMenuEntry;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;

import uk.ac.man.cs.mdsd.jsf.EditStaticTextMenuEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Edit Static Text Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenEditStaticTextMenuEntryImpl#getJsfMenuEntry <em>Jsf Menu Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenEditStaticTextMenuEntryImpl extends GenMenuEntryImpl implements GenEditStaticTextMenuEntry {
	/**
	 * The cached value of the '{@link #getJsfMenuEntry() <em>Jsf Menu Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfMenuEntry()
	 * @generated
	 * @ordered
	 */
	protected EditStaticTextMenuEntry jsfMenuEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenEditStaticTextMenuEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_EDIT_STATIC_TEXT_MENU_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditStaticTextMenuEntry getJsfMenuEntry() {
		if (jsfMenuEntry != null && jsfMenuEntry.eIsProxy()) {
			InternalEObject oldJsfMenuEntry = (InternalEObject)jsfMenuEntry;
			jsfMenuEntry = (EditStaticTextMenuEntry)eResolveProxy(oldJsfMenuEntry);
			if (jsfMenuEntry != oldJsfMenuEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_EDIT_STATIC_TEXT_MENU_ENTRY__JSF_MENU_ENTRY, oldJsfMenuEntry, jsfMenuEntry));
			}
		}
		return jsfMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditStaticTextMenuEntry basicGetJsfMenuEntry() {
		return jsfMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfMenuEntry(EditStaticTextMenuEntry newJsfMenuEntry) {
		EditStaticTextMenuEntry oldJsfMenuEntry = jsfMenuEntry;
		jsfMenuEntry = newJsfMenuEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_EDIT_STATIC_TEXT_MENU_ENTRY__JSF_MENU_ENTRY, oldJsfMenuEntry, jsfMenuEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_EDIT_STATIC_TEXT_MENU_ENTRY__JSF_MENU_ENTRY:
				if (resolve) return getJsfMenuEntry();
				return basicGetJsfMenuEntry();
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
			case GenJsfPackage.GEN_EDIT_STATIC_TEXT_MENU_ENTRY__JSF_MENU_ENTRY:
				setJsfMenuEntry((EditStaticTextMenuEntry)newValue);
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
			case GenJsfPackage.GEN_EDIT_STATIC_TEXT_MENU_ENTRY__JSF_MENU_ENTRY:
				setJsfMenuEntry((EditStaticTextMenuEntry)null);
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
			case GenJsfPackage.GEN_EDIT_STATIC_TEXT_MENU_ENTRY__JSF_MENU_ENTRY:
				return jsfMenuEntry != null;
		}
		return super.eIsSet(featureID);
	}

} //GenEditStaticTextMenuEntryImpl
