/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenMenuEntry;
import uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedElement;
import uk.ac.man.cs.mdsd.jsf.MenuIncludedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Menu Included Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMenuIncludedElementImpl#getJsfMenuEntry <em>Jsf Menu Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenMenuIncludedElementImpl extends GenMenuIncludedFeatureImpl implements GenMenuIncludedElement {
	/**
	 * The cached value of the '{@link #getJsfMenuEntry() <em>Jsf Menu Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfMenuEntry()
	 * @generated
	 * @ordered
	 */
	protected MenuIncludedElement jsfMenuEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenMenuIncludedElementImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	public void reconcile(final GenMenuEntry oldGenEntry) {
		super.reconcile(oldGenEntry);
	}

	/**
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenMenuEntry oldGenEntry) {
		super.reconcileSettings(oldGenEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_MENU_INCLUDED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuIncludedElement getJsfMenuEntry() {
		if (jsfMenuEntry != null && jsfMenuEntry.eIsProxy()) {
			InternalEObject oldJsfMenuEntry = (InternalEObject)jsfMenuEntry;
			jsfMenuEntry = (MenuIncludedElement)eResolveProxy(oldJsfMenuEntry);
			if (jsfMenuEntry != oldJsfMenuEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_MENU_INCLUDED_ELEMENT__JSF_MENU_ENTRY, oldJsfMenuEntry, jsfMenuEntry));
			}
		}
		return jsfMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuIncludedElement basicGetJsfMenuEntry() {
		return jsfMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfMenuEntry(MenuIncludedElement newJsfMenuEntry) {
		MenuIncludedElement oldJsfMenuEntry = jsfMenuEntry;
		jsfMenuEntry = newJsfMenuEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_MENU_INCLUDED_ELEMENT__JSF_MENU_ENTRY, oldJsfMenuEntry, jsfMenuEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_MENU_INCLUDED_ELEMENT__JSF_MENU_ENTRY:
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
			case GenJsfPackage.GEN_MENU_INCLUDED_ELEMENT__JSF_MENU_ENTRY:
				setJsfMenuEntry((MenuIncludedElement)newValue);
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
			case GenJsfPackage.GEN_MENU_INCLUDED_ELEMENT__JSF_MENU_ENTRY:
				setJsfMenuEntry((MenuIncludedElement)null);
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
			case GenJsfPackage.GEN_MENU_INCLUDED_ELEMENT__JSF_MENU_ENTRY:
				return jsfMenuEntry != null;
		}
		return super.eIsSet(featureID);
	}

} //GenMenuIncludedElementImpl
