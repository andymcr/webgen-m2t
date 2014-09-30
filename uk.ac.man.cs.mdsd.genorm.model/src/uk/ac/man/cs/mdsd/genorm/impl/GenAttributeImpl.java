/**
 */
package uk.ac.man.cs.mdsd.genorm.impl;

import org.eclipse.emf.ecore.EClass;

import uk.ac.man.cs.mdsd.genorm.GenAttribute;
import uk.ac.man.cs.mdsd.genorm.GenFeature;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class GenAttributeImpl extends GenFeatureImpl implements GenAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void reconcile(final GenFeature oldGenFeature) {
		super.reconcile(oldGenFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenFeature oldGenFeature) {
		super.reconcileSettings(oldGenFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenOrmPackage.Literals.GEN_ATTRIBUTE;
	}

} //GenAttributeImpl
