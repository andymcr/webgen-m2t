/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenInlineActionImpl.java,v 1.7 2014/01/25 17:38:18 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import uk.ac.man.cs.mdsd.genjsf.GenInlineAction;
import uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;

import uk.ac.man.cs.mdsd.jsf.InlineAction;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Inline Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenInlineActionImpl#getJsfAction <em>Jsf Action</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenInlineActionImpl#getGenUsedBy <em>Gen Used By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenInlineActionImpl extends NamedElementImpl implements GenInlineAction {
	/**
	 * The cached value of the '{@link #getJsfAction() <em>Jsf Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfAction()
	 * @generated
	 * @ordered
	 */
	protected InlineAction jsfAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenInlineActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_INLINE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineAction getJsfAction() {
		if (jsfAction != null && jsfAction.eIsProxy()) {
			InternalEObject oldJsfAction = (InternalEObject)jsfAction;
			jsfAction = (InlineAction)eResolveProxy(oldJsfAction);
			if (jsfAction != oldJsfAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_INLINE_ACTION__JSF_ACTION, oldJsfAction, jsfAction));
			}
		}
		return jsfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineAction basicGetJsfAction() {
		return jsfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfAction(InlineAction newJsfAction) {
		InlineAction oldJsfAction = jsfAction;
		jsfAction = newJsfAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_INLINE_ACTION__JSF_ACTION, oldJsfAction, jsfAction));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenInlineActionContainer getGenUsedBy() {
		if (eContainerFeatureID() != GenJsfPackage.GEN_INLINE_ACTION__GEN_USED_BY) return null;
		return (GenInlineActionContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenUsedBy(GenInlineActionContainer newGenUsedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenUsedBy, GenJsfPackage.GEN_INLINE_ACTION__GEN_USED_BY, msgs);
		return msgs;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenUsedBy(GenInlineActionContainer newGenUsedBy) {
		if (newGenUsedBy != eInternalContainer() || (eContainerFeatureID() != GenJsfPackage.GEN_INLINE_ACTION__GEN_USED_BY && newGenUsedBy != null)) {
			if (EcoreUtil.isAncestor(this, newGenUsedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenUsedBy != null)
				msgs = ((InternalEObject)newGenUsedBy).eInverseAdd(this, GenJsfPackage.GEN_INLINE_ACTION_CONTAINER__GEN_ACTIONS, GenInlineActionContainer.class, msgs);
			msgs = basicSetGenUsedBy(newGenUsedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_INLINE_ACTION__GEN_USED_BY, newGenUsedBy, newGenUsedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_INLINE_ACTION__GEN_USED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenUsedBy((GenInlineActionContainer)otherEnd, msgs);
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
			case GenJsfPackage.GEN_INLINE_ACTION__GEN_USED_BY:
				return basicSetGenUsedBy(null, msgs);
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
			case GenJsfPackage.GEN_INLINE_ACTION__GEN_USED_BY:
				return eInternalContainer().eInverseRemove(this, GenJsfPackage.GEN_INLINE_ACTION_CONTAINER__GEN_ACTIONS, GenInlineActionContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

				public void reconcile(final GenInlineAction oldGenInlineAction) {
        reconcileSettings(oldGenInlineAction);
    }

    protected void reconcileSettings(final GenInlineAction oldGenInlineAction) {
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_INLINE_ACTION__JSF_ACTION:
				if (resolve) return getJsfAction();
				return basicGetJsfAction();
			case GenJsfPackage.GEN_INLINE_ACTION__GEN_USED_BY:
				return getGenUsedBy();
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
			case GenJsfPackage.GEN_INLINE_ACTION__JSF_ACTION:
				setJsfAction((InlineAction)newValue);
				return;
			case GenJsfPackage.GEN_INLINE_ACTION__GEN_USED_BY:
				setGenUsedBy((GenInlineActionContainer)newValue);
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
			case GenJsfPackage.GEN_INLINE_ACTION__JSF_ACTION:
				setJsfAction((InlineAction)null);
				return;
			case GenJsfPackage.GEN_INLINE_ACTION__GEN_USED_BY:
				setGenUsedBy((GenInlineActionContainer)null);
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
			case GenJsfPackage.GEN_INLINE_ACTION__JSF_ACTION:
				return jsfAction != null;
			case GenJsfPackage.GEN_INLINE_ACTION__GEN_USED_BY:
				return getGenUsedBy() != null;
		}
		return super.eIsSet(featureID);
	}

} //GenInlineActionImpl
