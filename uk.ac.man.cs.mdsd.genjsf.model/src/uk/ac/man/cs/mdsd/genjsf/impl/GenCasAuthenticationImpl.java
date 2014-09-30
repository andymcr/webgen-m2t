/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.genjsf.GenCasAuthentication;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;

import uk.ac.man.cs.mdsd.jsf.CasAuthentication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Cas Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenCasAuthenticationImpl#getJsfAuthentication <em>Jsf Authentication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenCasAuthenticationImpl extends GenAuthenticationImpl implements GenCasAuthentication {
	/**
	 * The cached value of the '{@link #getJsfAuthentication() <em>Jsf Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfAuthentication()
	 * @generated
	 * @ordered
	 */
	protected CasAuthentication jsfAuthentication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCasAuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_CAS_AUTHENTICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasAuthentication getJsfAuthentication() {
		if (jsfAuthentication != null && jsfAuthentication.eIsProxy()) {
			InternalEObject oldJsfAuthentication = (InternalEObject)jsfAuthentication;
			jsfAuthentication = (CasAuthentication)eResolveProxy(oldJsfAuthentication);
			if (jsfAuthentication != oldJsfAuthentication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_CAS_AUTHENTICATION__JSF_AUTHENTICATION, oldJsfAuthentication, jsfAuthentication));
			}
		}
		return jsfAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasAuthentication basicGetJsfAuthentication() {
		return jsfAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfAuthentication(CasAuthentication newJsfAuthentication) {
		CasAuthentication oldJsfAuthentication = jsfAuthentication;
		jsfAuthentication = newJsfAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_CAS_AUTHENTICATION__JSF_AUTHENTICATION, oldJsfAuthentication, jsfAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_CAS_AUTHENTICATION__JSF_AUTHENTICATION:
				if (resolve) return getJsfAuthentication();
				return basicGetJsfAuthentication();
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
			case GenJsfPackage.GEN_CAS_AUTHENTICATION__JSF_AUTHENTICATION:
				setJsfAuthentication((CasAuthentication)newValue);
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
			case GenJsfPackage.GEN_CAS_AUTHENTICATION__JSF_AUTHENTICATION:
				setJsfAuthentication((CasAuthentication)null);
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
			case GenJsfPackage.GEN_CAS_AUTHENTICATION__JSF_AUTHENTICATION:
				return jsfAuthentication != null;
		}
		return super.eIsSet(featureID);
	}

} //GenCasAuthenticationImpl
