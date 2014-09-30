/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenDeleteActionImpl.java,v 1.6 2013/04/10 16:29:54 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.genjsf.GenDeleteAction;
import uk.ac.man.cs.mdsd.genjsf.GenInlineAction;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenPage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Delete Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenDeleteActionImpl#getGenDestination <em>Gen Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenDeleteActionImpl extends GenInlineActionImpl implements GenDeleteAction {
	/**
	 * The cached value of the '{@link #getGenDestination() <em>Gen Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDestination()
	 * @generated
	 * @ordered
	 */
	protected GenPage genDestination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDeleteActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_DELETE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPage getGenDestination() {
		if (genDestination != null && genDestination.eIsProxy()) {
			InternalEObject oldGenDestination = (InternalEObject)genDestination;
			genDestination = (GenPage)eResolveProxy(oldGenDestination);
			if (genDestination != oldGenDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_DELETE_ACTION__GEN_DESTINATION, oldGenDestination, genDestination));
			}
		}
		return genDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPage basicGetGenDestination() {
		return genDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenDestination(GenPage newGenDestination) {
		GenPage oldGenDestination = genDestination;
		genDestination = newGenDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_DELETE_ACTION__GEN_DESTINATION, oldGenDestination, genDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_DELETE_ACTION__GEN_DESTINATION:
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
			case GenJsfPackage.GEN_DELETE_ACTION__GEN_DESTINATION:
				setGenDestination((GenPage)newValue);
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
			case GenJsfPackage.GEN_DELETE_ACTION__GEN_DESTINATION:
				setGenDestination((GenPage)null);
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
			case GenJsfPackage.GEN_DELETE_ACTION__GEN_DESTINATION:
				return genDestination != null;
		}
		return super.eIsSet(featureID);
	}

	public void reconcile(final GenInlineAction oldGenAction) {
		super.reconcile(oldGenAction);
	}

	protected void reconcileSettings(final GenInlineAction oldGenAction) {
		super.reconcileSettings(oldGenAction);
	}

} //GenDeleteActionImpl
