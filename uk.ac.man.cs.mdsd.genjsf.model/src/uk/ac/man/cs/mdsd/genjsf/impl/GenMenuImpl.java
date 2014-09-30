/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenMenu;
import uk.ac.man.cs.mdsd.genjsf.GenMenuEntry;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMenuImpl#getGenEntries <em>Gen Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenMenuImpl extends NamedElementImpl implements GenMenu {
	/**
	 * The cached value of the '{@link #getGenEntries() <em>Gen Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<GenMenuEntry> genEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenMenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenMenuEntry> getGenEntries() {
		if (genEntries == null) {
			genEntries = new EObjectContainmentWithInverseEList<GenMenuEntry>(GenMenuEntry.class, this, GenJsfPackage.GEN_MENU__GEN_ENTRIES, GenJsfPackage.GEN_MENU_ENTRY__GEN_PART_OF);
		}
		return genEntries;
	}

	/**
	 * @generated NOT
	 */
	public void reconcile(final GenMenu oldGenMenu) {
		final Map<String, GenMenuEntry> oldEntries
			= new HashMap<String, GenMenuEntry>();
		for (GenMenuEntry oldEntry : oldGenMenu.getGenEntries()) {
			oldEntries.put(oldEntry.getName(), oldEntry);
		}
		for (GenMenuEntry newEntry : getGenEntries()) {
			final String name = newEntry.getName();
			if (oldEntries.containsKey(name)) {
				newEntry.reconcile(oldEntries.get(name));
			}
		}

		reconcileSettings(oldGenMenu);
	}

	/**
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenMenu oldGenMenu) {
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
			case GenJsfPackage.GEN_MENU__GEN_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenEntries()).basicAdd(otherEnd, msgs);
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
			case GenJsfPackage.GEN_MENU__GEN_ENTRIES:
				return ((InternalEList<?>)getGenEntries()).basicRemove(otherEnd, msgs);
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
			case GenJsfPackage.GEN_MENU__GEN_ENTRIES:
				return getGenEntries();
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
			case GenJsfPackage.GEN_MENU__GEN_ENTRIES:
				getGenEntries().clear();
				getGenEntries().addAll((Collection<? extends GenMenuEntry>)newValue);
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
			case GenJsfPackage.GEN_MENU__GEN_ENTRIES:
				getGenEntries().clear();
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
			case GenJsfPackage.GEN_MENU__GEN_ENTRIES:
				return genEntries != null && !genEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenMenuImpl
