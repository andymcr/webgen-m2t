/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenDataUnitImpl.java,v 1.11 2014/07/10 08:10:30 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenDataUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenSelection;
import uk.ac.man.cs.mdsd.genjsf.GenUnitTitle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Data Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDataUnitImpl#getGenSelection <em>Gen Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDataUnitImpl#getGenDynamicTitle <em>Gen Dynamic Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenDataUnitImpl extends GenDynamicUnitImpl implements GenDataUnit {
	/**
	 * The cached value of the '{@link #getGenSelection() <em>Gen Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenSelection()
	 * @generated
	 * @ordered
	 */
	protected GenSelection genSelection;
	/**
	 * The cached value of the '{@link #getGenDynamicTitle() <em>Gen Dynamic Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDynamicTitle()
	 * @generated
	 * @ordered
	 */
	protected GenUnitTitle genDynamicTitle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDataUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_DATA_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSelection getGenSelection() {
		if (genSelection != null && genSelection.eIsProxy()) {
			InternalEObject oldGenSelection = (InternalEObject)genSelection;
			genSelection = (GenSelection)eResolveProxy(oldGenSelection);
			if (genSelection != oldGenSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_DATA_UNIT__GEN_SELECTION, oldGenSelection, genSelection));
			}
		}
		return genSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSelection basicGetGenSelection() {
		return genSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenSelection(GenSelection newGenSelection) {
		GenSelection oldGenSelection = genSelection;
		genSelection = newGenSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_DATA_UNIT__GEN_SELECTION, oldGenSelection, genSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitTitle getGenDynamicTitle() {
		if (genDynamicTitle != null && genDynamicTitle.eIsProxy()) {
			InternalEObject oldGenDynamicTitle = (InternalEObject)genDynamicTitle;
			genDynamicTitle = (GenUnitTitle)eResolveProxy(oldGenDynamicTitle);
			if (genDynamicTitle != oldGenDynamicTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_DATA_UNIT__GEN_DYNAMIC_TITLE, oldGenDynamicTitle, genDynamicTitle));
			}
		}
		return genDynamicTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitTitle basicGetGenDynamicTitle() {
		return genDynamicTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenDynamicTitle(GenUnitTitle newGenDynamicTitle) {
		GenUnitTitle oldGenDynamicTitle = genDynamicTitle;
		genDynamicTitle = newGenDynamicTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_DATA_UNIT__GEN_DYNAMIC_TITLE, oldGenDynamicTitle, genDynamicTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_DATA_UNIT__GEN_SELECTION:
				if (resolve) return getGenSelection();
				return basicGetGenSelection();
			case GenJsfPackage.GEN_DATA_UNIT__GEN_DYNAMIC_TITLE:
				if (resolve) return getGenDynamicTitle();
				return basicGetGenDynamicTitle();
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
			case GenJsfPackage.GEN_DATA_UNIT__GEN_SELECTION:
				setGenSelection((GenSelection)newValue);
				return;
			case GenJsfPackage.GEN_DATA_UNIT__GEN_DYNAMIC_TITLE:
				setGenDynamicTitle((GenUnitTitle)newValue);
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
			case GenJsfPackage.GEN_DATA_UNIT__GEN_SELECTION:
				setGenSelection((GenSelection)null);
				return;
			case GenJsfPackage.GEN_DATA_UNIT__GEN_DYNAMIC_TITLE:
				setGenDynamicTitle((GenUnitTitle)null);
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
			case GenJsfPackage.GEN_DATA_UNIT__GEN_SELECTION:
				return genSelection != null;
			case GenJsfPackage.GEN_DATA_UNIT__GEN_DYNAMIC_TITLE:
				return genDynamicTitle != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void reconcile(final GenContentUnit oldGenUnit) {
		super.reconcile(oldGenUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenContentUnit oldGenUnit) {
		super.reconcileSettings(oldGenUnit);
	}

} //GenDataUnitImpl
