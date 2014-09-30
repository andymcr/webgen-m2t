/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.genjsf.GenCaptchaField;
import uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenUnitField;
import uk.ac.man.cs.mdsd.jsf.CaptchaField;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Captcha Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCaptchaFieldImpl#getGenDisplayedOn <em>Gen Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCaptchaFieldImpl#getJsfField <em>Jsf Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenCaptchaFieldImpl extends NamedElementImpl implements GenCaptchaField {
	/**
	 * The cached value of the '{@link #getJsfField() <em>Jsf Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfField()
	 * @generated
	 * @ordered
	 */
	protected CaptchaField jsfField;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCaptchaFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_CAPTCHA_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDynamicUnit getGenDisplayedOn() {
		if (eContainerFeatureID() != GenJsfPackage.GEN_CAPTCHA_FIELD__GEN_DISPLAYED_ON) return null;
		return (GenDynamicUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenDisplayedOn(GenDynamicUnit newGenDisplayedOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenDisplayedOn, GenJsfPackage.GEN_CAPTCHA_FIELD__GEN_DISPLAYED_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenDisplayedOn(GenDynamicUnit newGenDisplayedOn) {
		if (newGenDisplayedOn != eInternalContainer() || (eContainerFeatureID() != GenJsfPackage.GEN_CAPTCHA_FIELD__GEN_DISPLAYED_ON && newGenDisplayedOn != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_CAPTCHA_FIELD__GEN_DISPLAYED_ON, newGenDisplayedOn, newGenDisplayedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptchaField getJsfField() {
		if (jsfField != null && jsfField.eIsProxy()) {
			InternalEObject oldJsfField = (InternalEObject)jsfField;
			jsfField = (CaptchaField)eResolveProxy(oldJsfField);
			if (jsfField != oldJsfField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_CAPTCHA_FIELD__JSF_FIELD, oldJsfField, jsfField));
			}
		}
		return jsfField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptchaField basicGetJsfField() {
		return jsfField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfField(CaptchaField newJsfField) {
		CaptchaField oldJsfField = jsfField;
		jsfField = newJsfField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_CAPTCHA_FIELD__JSF_FIELD, oldJsfField, jsfField));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_CAPTCHA_FIELD__GEN_DISPLAYED_ON:
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
			case GenJsfPackage.GEN_CAPTCHA_FIELD__GEN_DISPLAYED_ON:
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
			case GenJsfPackage.GEN_CAPTCHA_FIELD__GEN_DISPLAYED_ON:
				return eInternalContainer().eInverseRemove(this, GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS, GenDynamicUnit.class, msgs);
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
			case GenJsfPackage.GEN_CAPTCHA_FIELD__GEN_DISPLAYED_ON:
				return getGenDisplayedOn();
			case GenJsfPackage.GEN_CAPTCHA_FIELD__JSF_FIELD:
				if (resolve) return getJsfField();
				return basicGetJsfField();
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
			case GenJsfPackage.GEN_CAPTCHA_FIELD__GEN_DISPLAYED_ON:
				setGenDisplayedOn((GenDynamicUnit)newValue);
				return;
			case GenJsfPackage.GEN_CAPTCHA_FIELD__JSF_FIELD:
				setJsfField((CaptchaField)newValue);
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
			case GenJsfPackage.GEN_CAPTCHA_FIELD__GEN_DISPLAYED_ON:
				setGenDisplayedOn((GenDynamicUnit)null);
				return;
			case GenJsfPackage.GEN_CAPTCHA_FIELD__JSF_FIELD:
				setJsfField((CaptchaField)null);
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
			case GenJsfPackage.GEN_CAPTCHA_FIELD__GEN_DISPLAYED_ON:
				return getGenDisplayedOn() != null;
			case GenJsfPackage.GEN_CAPTCHA_FIELD__JSF_FIELD:
				return jsfField != null;
		}
		return super.eIsSet(featureID);
	}

} //GenCaptchaFieldImpl
