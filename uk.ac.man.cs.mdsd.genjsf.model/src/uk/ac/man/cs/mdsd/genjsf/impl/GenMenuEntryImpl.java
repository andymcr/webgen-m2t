/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenMenu;
import uk.ac.man.cs.mdsd.genjsf.GenMenuEntry;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenMenuEntryImpl#getGenPartOf <em>Gen Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenMenuEntryImpl extends NamedElementImpl implements GenMenuEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenMenuEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_MENU_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenMenu getGenPartOf() {
		if (eContainerFeatureID() != GenJsfPackage.GEN_MENU_ENTRY__GEN_PART_OF) return null;
		return (GenMenu)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenPartOf(GenMenu newGenPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenPartOf, GenJsfPackage.GEN_MENU_ENTRY__GEN_PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenPartOf(GenMenu newGenPartOf) {
		if (newGenPartOf != eInternalContainer() || (eContainerFeatureID() != GenJsfPackage.GEN_MENU_ENTRY__GEN_PART_OF && newGenPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newGenPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenPartOf != null)
				msgs = ((InternalEObject)newGenPartOf).eInverseAdd(this, GenJsfPackage.GEN_MENU__GEN_ENTRIES, GenMenu.class, msgs);
			msgs = basicSetGenPartOf(newGenPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_MENU_ENTRY__GEN_PART_OF, newGenPartOf, newGenPartOf));
	}

	/**
	 * @generated NOT
	 */
	public void reconcile(final GenMenuEntry oldGenEntry) {
		reconcileSettings(oldGenEntry);
	}

	/**
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenMenuEntry oldGenEntry) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_MENU_ENTRY__GEN_PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenPartOf((GenMenu)otherEnd, msgs);
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
			case GenJsfPackage.GEN_MENU_ENTRY__GEN_PART_OF:
				return basicSetGenPartOf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GenJsfPackage.GEN_MENU_ENTRY__GEN_PART_OF:
				return eInternalContainer().eInverseRemove(this, GenJsfPackage.GEN_MENU__GEN_ENTRIES, GenMenu.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_MENU_ENTRY__GEN_PART_OF:
				return getGenPartOf();
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
			case GenJsfPackage.GEN_MENU_ENTRY__GEN_PART_OF:
				setGenPartOf((GenMenu)newValue);
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
			case GenJsfPackage.GEN_MENU_ENTRY__GEN_PART_OF:
				setGenPartOf((GenMenu)null);
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
			case GenJsfPackage.GEN_MENU_ENTRY__GEN_PART_OF:
				return getGenPartOf() != null;
		}
		return super.eIsSet(featureID);
	}

} //GenMenuEntryImpl
