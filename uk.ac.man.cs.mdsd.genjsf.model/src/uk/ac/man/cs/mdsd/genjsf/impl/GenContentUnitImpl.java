/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenContentUnitImpl.java,v 1.16 2014/01/25 17:38:18 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenUnitContainer;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Content Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenContentUnitImpl#getGenDisplayedOn <em>Gen Displayed On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenContentUnitImpl extends NamedElementImpl implements GenContentUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenContentUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_CONTENT_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitContainer getGenDisplayedOn() {
		if (eContainerFeatureID() != GenJsfPackage.GEN_CONTENT_UNIT__GEN_DISPLAYED_ON) return null;
		return (GenUnitContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenDisplayedOn(GenUnitContainer newGenDisplayedOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenDisplayedOn, GenJsfPackage.GEN_CONTENT_UNIT__GEN_DISPLAYED_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenDisplayedOn(GenUnitContainer newGenDisplayedOn) {
		if (newGenDisplayedOn != eInternalContainer() || (eContainerFeatureID() != GenJsfPackage.GEN_CONTENT_UNIT__GEN_DISPLAYED_ON && newGenDisplayedOn != null)) {
			if (EcoreUtil.isAncestor(this, newGenDisplayedOn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenDisplayedOn != null)
				msgs = ((InternalEObject)newGenDisplayedOn).eInverseAdd(this, GenJsfPackage.GEN_UNIT_CONTAINER__GEN_UNITS, GenUnitContainer.class, msgs);
			msgs = basicSetGenDisplayedOn(newGenDisplayedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_CONTENT_UNIT__GEN_DISPLAYED_ON, newGenDisplayedOn, newGenDisplayedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_CONTENT_UNIT__GEN_DISPLAYED_ON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenDisplayedOn((GenUnitContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void reconcile(final GenContentUnit oldGenUnit) {
		reconcileSettings(oldGenUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenContentUnit oldGenUnit) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_CONTENT_UNIT__GEN_DISPLAYED_ON:
				return basicSetGenDisplayedOn(null, msgs);
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
			case GenJsfPackage.GEN_CONTENT_UNIT__GEN_DISPLAYED_ON:
				return eInternalContainer().eInverseRemove(this, GenJsfPackage.GEN_UNIT_CONTAINER__GEN_UNITS, GenUnitContainer.class, msgs);
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
			case GenJsfPackage.GEN_CONTENT_UNIT__GEN_DISPLAYED_ON:
				return getGenDisplayedOn();
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
			case GenJsfPackage.GEN_CONTENT_UNIT__GEN_DISPLAYED_ON:
				setGenDisplayedOn((GenUnitContainer)newValue);
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
			case GenJsfPackage.GEN_CONTENT_UNIT__GEN_DISPLAYED_ON:
				setGenDisplayedOn((GenUnitContainer)null);
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
			case GenJsfPackage.GEN_CONTENT_UNIT__GEN_DISPLAYED_ON:
				return getGenDisplayedOn() != null;
		}
		return super.eIsSet(featureID);
	}

} //GenContentUnitImpl
