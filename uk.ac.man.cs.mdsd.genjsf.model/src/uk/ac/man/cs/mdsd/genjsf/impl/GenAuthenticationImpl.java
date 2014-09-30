/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.man.cs.mdsd.genjsf.GenAuthentication;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class GenAuthenticationImpl extends EObjectImpl implements GenAuthentication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenAuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_AUTHENTICATION;
	}

	public void reconcile(final GenAuthentication oldGenAuthentication) {
		reconcileSettings(oldGenAuthentication);
	}

	protected void reconcileSettings(final GenAuthentication oldGenAuthentication) {
	}

} //GenAuthenticationImpl
