/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.genjsf.GenLoginUnit;
import uk.ac.man.cs.mdsd.genjsf.GenUnitField;
import uk.ac.man.cs.mdsd.jsf.LoginUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Login Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLoginUnitImpl#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLoginUnitImpl#getGenAuthenticationSystem <em>Gen Authentication System</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLoginUnitImpl#getGenLoginIdField <em>Gen Login Id Field</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLoginUnitImpl#getGenPasswordField <em>Gen Password Field</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenLoginUnitImpl#getGenRememberMeField <em>Gen Remember Me Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenLoginUnitImpl extends GenControlUnitImpl implements GenLoginUnit {
	/**
	 * The cached value of the '{@link #getJsfUnit() <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfUnit()
	 * @generated
	 * @ordered
	 */
	protected LoginUnit jsfUnit;
	/**
	 * The cached value of the '{@link #getGenAuthenticationSystem() <em>Gen Authentication System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenAuthenticationSystem()
	 * @generated
	 * @ordered
	 */
	protected GenLocalAuthenticationSystem genAuthenticationSystem;
	/**
	 * The cached value of the '{@link #getGenLoginIdField() <em>Gen Login Id Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenLoginIdField()
	 * @generated
	 * @ordered
	 */
	protected GenUnitField genLoginIdField;
	/**
	 * The cached value of the '{@link #getGenPasswordField() <em>Gen Password Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenPasswordField()
	 * @generated
	 * @ordered
	 */
	protected GenUnitField genPasswordField;
	/**
	 * The cached value of the '{@link #getGenRememberMeField() <em>Gen Remember Me Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenRememberMeField()
	 * @generated
	 * @ordered
	 */
	protected GenUnitField genRememberMeField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenLoginUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_LOGIN_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginUnit getJsfUnit() {
		if (jsfUnit != null && jsfUnit.eIsProxy()) {
			InternalEObject oldJsfUnit = (InternalEObject)jsfUnit;
			jsfUnit = (LoginUnit)eResolveProxy(oldJsfUnit);
			if (jsfUnit != oldJsfUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_LOGIN_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
			}
		}
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginUnit basicGetJsfUnit() {
		return jsfUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfUnit(LoginUnit newJsfUnit) {
		LoginUnit oldJsfUnit = jsfUnit;
		jsfUnit = newJsfUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOGIN_UNIT__JSF_UNIT, oldJsfUnit, jsfUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLocalAuthenticationSystem getGenAuthenticationSystem() {
		if (genAuthenticationSystem != null && genAuthenticationSystem.eIsProxy()) {
			InternalEObject oldGenAuthenticationSystem = (InternalEObject)genAuthenticationSystem;
			genAuthenticationSystem = (GenLocalAuthenticationSystem)eResolveProxy(oldGenAuthenticationSystem);
			if (genAuthenticationSystem != oldGenAuthenticationSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM, oldGenAuthenticationSystem, genAuthenticationSystem));
			}
		}
		return genAuthenticationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLocalAuthenticationSystem basicGetGenAuthenticationSystem() {
		return genAuthenticationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenAuthenticationSystem(GenLocalAuthenticationSystem newGenAuthenticationSystem, NotificationChain msgs) {
		GenLocalAuthenticationSystem oldGenAuthenticationSystem = genAuthenticationSystem;
		genAuthenticationSystem = newGenAuthenticationSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM, oldGenAuthenticationSystem, newGenAuthenticationSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenAuthenticationSystem(GenLocalAuthenticationSystem newGenAuthenticationSystem) {
		if (newGenAuthenticationSystem != genAuthenticationSystem) {
			NotificationChain msgs = null;
			if (genAuthenticationSystem != null)
				msgs = ((InternalEObject)genAuthenticationSystem).eInverseRemove(this, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT, GenLocalAuthenticationSystem.class, msgs);
			if (newGenAuthenticationSystem != null)
				msgs = ((InternalEObject)newGenAuthenticationSystem).eInverseAdd(this, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT, GenLocalAuthenticationSystem.class, msgs);
			msgs = basicSetGenAuthenticationSystem(newGenAuthenticationSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM, newGenAuthenticationSystem, newGenAuthenticationSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitField getGenLoginIdField() {
		if (genLoginIdField != null && genLoginIdField.eIsProxy()) {
			InternalEObject oldGenLoginIdField = (InternalEObject)genLoginIdField;
			genLoginIdField = (GenUnitField)eResolveProxy(oldGenLoginIdField);
			if (genLoginIdField != oldGenLoginIdField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_LOGIN_UNIT__GEN_LOGIN_ID_FIELD, oldGenLoginIdField, genLoginIdField));
			}
		}
		return genLoginIdField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitField basicGetGenLoginIdField() {
		return genLoginIdField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenLoginIdField(GenUnitField newGenLoginIdField) {
		GenUnitField oldGenLoginIdField = genLoginIdField;
		genLoginIdField = newGenLoginIdField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOGIN_UNIT__GEN_LOGIN_ID_FIELD, oldGenLoginIdField, genLoginIdField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitField getGenPasswordField() {
		if (genPasswordField != null && genPasswordField.eIsProxy()) {
			InternalEObject oldGenPasswordField = (InternalEObject)genPasswordField;
			genPasswordField = (GenUnitField)eResolveProxy(oldGenPasswordField);
			if (genPasswordField != oldGenPasswordField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_LOGIN_UNIT__GEN_PASSWORD_FIELD, oldGenPasswordField, genPasswordField));
			}
		}
		return genPasswordField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitField basicGetGenPasswordField() {
		return genPasswordField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenPasswordField(GenUnitField newGenPasswordField) {
		GenUnitField oldGenPasswordField = genPasswordField;
		genPasswordField = newGenPasswordField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOGIN_UNIT__GEN_PASSWORD_FIELD, oldGenPasswordField, genPasswordField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitField getGenRememberMeField() {
		if (genRememberMeField != null && genRememberMeField.eIsProxy()) {
			InternalEObject oldGenRememberMeField = (InternalEObject)genRememberMeField;
			genRememberMeField = (GenUnitField)eResolveProxy(oldGenRememberMeField);
			if (genRememberMeField != oldGenRememberMeField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_LOGIN_UNIT__GEN_REMEMBER_ME_FIELD, oldGenRememberMeField, genRememberMeField));
			}
		}
		return genRememberMeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitField basicGetGenRememberMeField() {
		return genRememberMeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenRememberMeField(GenUnitField newGenRememberMeField) {
		GenUnitField oldGenRememberMeField = genRememberMeField;
		genRememberMeField = newGenRememberMeField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_LOGIN_UNIT__GEN_REMEMBER_ME_FIELD, oldGenRememberMeField, genRememberMeField));
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM:
				if (genAuthenticationSystem != null)
					msgs = ((InternalEObject)genAuthenticationSystem).eInverseRemove(this, GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT, GenLocalAuthenticationSystem.class, msgs);
				return basicSetGenAuthenticationSystem((GenLocalAuthenticationSystem)otherEnd, msgs);
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
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM:
				return basicSetGenAuthenticationSystem(null, msgs);
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
			case GenJsfPackage.GEN_LOGIN_UNIT__JSF_UNIT:
				if (resolve) return getJsfUnit();
				return basicGetJsfUnit();
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM:
				if (resolve) return getGenAuthenticationSystem();
				return basicGetGenAuthenticationSystem();
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_LOGIN_ID_FIELD:
				if (resolve) return getGenLoginIdField();
				return basicGetGenLoginIdField();
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_PASSWORD_FIELD:
				if (resolve) return getGenPasswordField();
				return basicGetGenPasswordField();
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_REMEMBER_ME_FIELD:
				if (resolve) return getGenRememberMeField();
				return basicGetGenRememberMeField();
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
			case GenJsfPackage.GEN_LOGIN_UNIT__JSF_UNIT:
				setJsfUnit((LoginUnit)newValue);
				return;
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM:
				setGenAuthenticationSystem((GenLocalAuthenticationSystem)newValue);
				return;
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_LOGIN_ID_FIELD:
				setGenLoginIdField((GenUnitField)newValue);
				return;
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_PASSWORD_FIELD:
				setGenPasswordField((GenUnitField)newValue);
				return;
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_REMEMBER_ME_FIELD:
				setGenRememberMeField((GenUnitField)newValue);
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
			case GenJsfPackage.GEN_LOGIN_UNIT__JSF_UNIT:
				setJsfUnit((LoginUnit)null);
				return;
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM:
				setGenAuthenticationSystem((GenLocalAuthenticationSystem)null);
				return;
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_LOGIN_ID_FIELD:
				setGenLoginIdField((GenUnitField)null);
				return;
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_PASSWORD_FIELD:
				setGenPasswordField((GenUnitField)null);
				return;
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_REMEMBER_ME_FIELD:
				setGenRememberMeField((GenUnitField)null);
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
			case GenJsfPackage.GEN_LOGIN_UNIT__JSF_UNIT:
				return jsfUnit != null;
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM:
				return genAuthenticationSystem != null;
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_LOGIN_ID_FIELD:
				return genLoginIdField != null;
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_PASSWORD_FIELD:
				return genPasswordField != null;
			case GenJsfPackage.GEN_LOGIN_UNIT__GEN_REMEMBER_ME_FIELD:
				return genRememberMeField != null;
		}
		return super.eIsSet(featureID);
	}

} //GenLoginUnitImpl
