/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import uk.ac.man.cs.mdsd.gencriteria.GenExpression;
import uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit;
import uk.ac.man.cs.mdsd.genjsf.GenInterfaceField;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenUnitField;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Interface Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenInterfaceFieldImpl#getGenDisplayedOn <em>Gen Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenInterfaceFieldImpl#getGenMustMatch <em>Gen Must Match</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenInterfaceFieldImpl#getGenDefaultValue <em>Gen Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenInterfaceFieldImpl extends NamedElementImpl implements GenInterfaceField {
	/**
	 * The cached value of the '{@link #getGenMustMatch() <em>Gen Must Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenMustMatch()
	 * @generated
	 * @ordered
	 */
	protected GenUnitField genMustMatch;

	/**
	 * The cached value of the '{@link #getGenDefaultValue() <em>Gen Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected GenExpression genDefaultValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenInterfaceFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_INTERFACE_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDynamicUnit getGenDisplayedOn() {
		if (eContainerFeatureID() != GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DISPLAYED_ON) return null;
		return (GenDynamicUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenDisplayedOn(GenDynamicUnit newGenDisplayedOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenDisplayedOn, GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DISPLAYED_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenDisplayedOn(GenDynamicUnit newGenDisplayedOn) {
		if (newGenDisplayedOn != eInternalContainer() || (eContainerFeatureID() != GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DISPLAYED_ON && newGenDisplayedOn != null)) {
			if (EcoreUtil.isAncestor(this, newGenDisplayedOn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenDisplayedOn != null)
				msgs = ((InternalEObject)newGenDisplayedOn).eInverseAdd(this, GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS, GenDynamicUnit.class, msgs);
			msgs = basicSetGenDisplayedOn(newGenDisplayedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DISPLAYED_ON, newGenDisplayedOn, newGenDisplayedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitField getGenMustMatch() {
		if (genMustMatch != null && genMustMatch.eIsProxy()) {
			InternalEObject oldGenMustMatch = (InternalEObject)genMustMatch;
			genMustMatch = (GenUnitField)eResolveProxy(oldGenMustMatch);
			if (genMustMatch != oldGenMustMatch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_INTERFACE_FIELD__GEN_MUST_MATCH, oldGenMustMatch, genMustMatch));
			}
		}
		return genMustMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitField basicGetGenMustMatch() {
		return genMustMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenMustMatch(GenUnitField newGenMustMatch) {
		GenUnitField oldGenMustMatch = genMustMatch;
		genMustMatch = newGenMustMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_INTERFACE_FIELD__GEN_MUST_MATCH, oldGenMustMatch, genMustMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenExpression getGenDefaultValue() {
		return genDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenDefaultValue(GenExpression newGenDefaultValue, NotificationChain msgs) {
		GenExpression oldGenDefaultValue = genDefaultValue;
		genDefaultValue = newGenDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DEFAULT_VALUE, oldGenDefaultValue, newGenDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenDefaultValue(GenExpression newGenDefaultValue) {
		if (newGenDefaultValue != genDefaultValue) {
			NotificationChain msgs = null;
			if (genDefaultValue != null)
				msgs = ((InternalEObject)genDefaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DEFAULT_VALUE, null, msgs);
			if (newGenDefaultValue != null)
				msgs = ((InternalEObject)newGenDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DEFAULT_VALUE, null, msgs);
			msgs = basicSetGenDefaultValue(newGenDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DEFAULT_VALUE, newGenDefaultValue, newGenDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DISPLAYED_ON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenDisplayedOn((GenDynamicUnit)otherEnd, msgs);
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
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DISPLAYED_ON:
				return basicSetGenDisplayedOn(null, msgs);
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DEFAULT_VALUE:
				return basicSetGenDefaultValue(null, msgs);
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
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DISPLAYED_ON:
				return eInternalContainer().eInverseRemove(this, GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS, GenDynamicUnit.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * @generated NOT
	 */
	public void reconcile(final GenUnitField oldGenField) {
		reconcileSettings(oldGenField);
	}

	/**
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenUnitField oldGenField) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DISPLAYED_ON:
				return getGenDisplayedOn();
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_MUST_MATCH:
				if (resolve) return getGenMustMatch();
				return basicGetGenMustMatch();
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DEFAULT_VALUE:
				return getGenDefaultValue();
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
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DISPLAYED_ON:
				setGenDisplayedOn((GenDynamicUnit)newValue);
				return;
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_MUST_MATCH:
				setGenMustMatch((GenUnitField)newValue);
				return;
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DEFAULT_VALUE:
				setGenDefaultValue((GenExpression)newValue);
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
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DISPLAYED_ON:
				setGenDisplayedOn((GenDynamicUnit)null);
				return;
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_MUST_MATCH:
				setGenMustMatch((GenUnitField)null);
				return;
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DEFAULT_VALUE:
				setGenDefaultValue((GenExpression)null);
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
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DISPLAYED_ON:
				return getGenDisplayedOn() != null;
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_MUST_MATCH:
				return genMustMatch != null;
			case GenJsfPackage.GEN_INTERFACE_FIELD__GEN_DEFAULT_VALUE:
				return genDefaultValue != null;
		}
		return super.eIsSet(featureID);
	}

} //GenInterfaceFieldImpl
