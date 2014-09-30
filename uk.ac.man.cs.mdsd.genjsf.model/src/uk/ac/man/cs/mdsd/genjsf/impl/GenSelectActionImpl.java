/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenSelectActionImpl.java,v 1.7 2013/07/12 07:52:02 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.genjsf.GenInlineAction;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenSelectAction;
import uk.ac.man.cs.mdsd.genjsf.GenSelectTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Select Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenSelectActionImpl#getGenTarget <em>Gen Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenSelectActionImpl extends GenInlineActionImpl implements GenSelectAction {
	/**
	 * The cached value of the '{@link #getGenTarget() <em>Gen Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenTarget()
	 * @generated
	 * @ordered
	 */
	protected GenSelectTarget genTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenSelectActionImpl() {
		super();
	}

	public void reconcile(final GenInlineAction oldGenAction) {
		super.reconcile(oldGenAction);
	}

	protected void reconcileSettings(final GenInlineAction oldGenAction) {
		super.reconcileSettings(oldGenAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_SELECT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSelectTarget getGenTarget() {
		if (genTarget != null && genTarget.eIsProxy()) {
			InternalEObject oldGenTarget = (InternalEObject)genTarget;
			genTarget = (GenSelectTarget)eResolveProxy(oldGenTarget);
			if (genTarget != oldGenTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_SELECT_ACTION__GEN_TARGET, oldGenTarget, genTarget));
			}
		}
		return genTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSelectTarget basicGetGenTarget() {
		return genTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenTarget(GenSelectTarget newGenTarget, NotificationChain msgs) {
		GenSelectTarget oldGenTarget = genTarget;
		genTarget = newGenTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SELECT_ACTION__GEN_TARGET, oldGenTarget, newGenTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenTarget(GenSelectTarget newGenTarget) {
		if (newGenTarget != genTarget) {
			NotificationChain msgs = null;
			if (genTarget != null)
				msgs = ((InternalEObject)genTarget).eInverseRemove(this, GenJsfPackage.GEN_SELECT_TARGET__GEN_TARGETTING_ACTIONS, GenSelectTarget.class, msgs);
			if (newGenTarget != null)
				msgs = ((InternalEObject)newGenTarget).eInverseAdd(this, GenJsfPackage.GEN_SELECT_TARGET__GEN_TARGETTING_ACTIONS, GenSelectTarget.class, msgs);
			msgs = basicSetGenTarget(newGenTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SELECT_ACTION__GEN_TARGET, newGenTarget, newGenTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_SELECT_ACTION__GEN_TARGET:
				if (genTarget != null)
					msgs = ((InternalEObject)genTarget).eInverseRemove(this, GenJsfPackage.GEN_SELECT_TARGET__GEN_TARGETTING_ACTIONS, GenSelectTarget.class, msgs);
				return basicSetGenTarget((GenSelectTarget)otherEnd, msgs);
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
			case GenJsfPackage.GEN_SELECT_ACTION__GEN_TARGET:
				return basicSetGenTarget(null, msgs);
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
			case GenJsfPackage.GEN_SELECT_ACTION__GEN_TARGET:
				if (resolve) return getGenTarget();
				return basicGetGenTarget();
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
			case GenJsfPackage.GEN_SELECT_ACTION__GEN_TARGET:
				setGenTarget((GenSelectTarget)newValue);
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
			case GenJsfPackage.GEN_SELECT_ACTION__GEN_TARGET:
				setGenTarget((GenSelectTarget)null);
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
			case GenJsfPackage.GEN_SELECT_ACTION__GEN_TARGET:
				return genTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //GenSelectActionImpl
