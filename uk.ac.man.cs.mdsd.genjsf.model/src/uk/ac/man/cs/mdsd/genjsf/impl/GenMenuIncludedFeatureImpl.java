/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.ecore.EClass;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenMenuEntry;
import uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Menu Included Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class GenMenuIncludedFeatureImpl extends GenMenuEntryImpl implements GenMenuIncludedFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenMenuIncludedFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_MENU_INCLUDED_FEATURE;
	}

	/**
	 * @generated NOT
	 */
	public void reconcile(final GenMenuEntry oldGenEntry) {
		super.reconcile(oldGenEntry);
	}

	/**
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenMenuEntry oldGenEntry) {
		super.reconcileSettings(oldGenEntry);
	}

} //GenMenuIncludedFeatureImpl
