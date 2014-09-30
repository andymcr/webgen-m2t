/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenModelLabel;
import uk.ac.man.cs.mdsd.genjsf.GenService;
import uk.ac.man.cs.mdsd.genjsf.GenServiceFeature;

import uk.ac.man.cs.mdsd.jsf.ModelLabel;

import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Model Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenModelLabelImpl#getGenLabelFor <em>Gen Label For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenModelLabelImpl#getJsfLabel <em>Jsf Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenModelLabelImpl#getGenFeatures <em>Gen Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenModelLabelImpl extends NamedElementImpl implements GenModelLabel {
	/**
	 * The cached value of the '{@link #getGenLabelFor() <em>Gen Label For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenLabelFor()
	 * @generated
	 * @ordered
	 */
	protected GenService genLabelFor;

	/**
	 * The cached value of the '{@link #getJsfLabel() <em>Jsf Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfLabel()
	 * @generated
	 * @ordered
	 */
	protected ModelLabel jsfLabel;

	/**
	 * The cached value of the '{@link #getGenFeatures() <em>Gen Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<GenServiceFeature> genFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenModelLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_MODEL_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService getGenLabelFor() {
		if (genLabelFor != null && genLabelFor.eIsProxy()) {
			InternalEObject oldGenLabelFor = (InternalEObject)genLabelFor;
			genLabelFor = (GenService)eResolveProxy(oldGenLabelFor);
			if (genLabelFor != oldGenLabelFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_MODEL_LABEL__GEN_LABEL_FOR, oldGenLabelFor, genLabelFor));
			}
		}
		return genLabelFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService basicGetGenLabelFor() {
		return genLabelFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenLabelFor(GenService newGenLabelFor) {
		GenService oldGenLabelFor = genLabelFor;
		genLabelFor = newGenLabelFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_MODEL_LABEL__GEN_LABEL_FOR, oldGenLabelFor, genLabelFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabel getJsfLabel() {
		if (jsfLabel != null && jsfLabel.eIsProxy()) {
			InternalEObject oldJsfLabel = (InternalEObject)jsfLabel;
			jsfLabel = (ModelLabel)eResolveProxy(oldJsfLabel);
			if (jsfLabel != oldJsfLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_MODEL_LABEL__JSF_LABEL, oldJsfLabel, jsfLabel));
			}
		}
		return jsfLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabel basicGetJsfLabel() {
		return jsfLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfLabel(ModelLabel newJsfLabel) {
		ModelLabel oldJsfLabel = jsfLabel;
		jsfLabel = newJsfLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_MODEL_LABEL__JSF_LABEL, oldJsfLabel, jsfLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenServiceFeature> getGenFeatures() {
		if (genFeatures == null) {
			genFeatures = new EObjectResolvingEList<GenServiceFeature>(GenServiceFeature.class, this, GenJsfPackage.GEN_MODEL_LABEL__GEN_FEATURES);
		}
		return genFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_MODEL_LABEL__GEN_LABEL_FOR:
				if (resolve) return getGenLabelFor();
				return basicGetGenLabelFor();
			case GenJsfPackage.GEN_MODEL_LABEL__JSF_LABEL:
				if (resolve) return getJsfLabel();
				return basicGetJsfLabel();
			case GenJsfPackage.GEN_MODEL_LABEL__GEN_FEATURES:
				return getGenFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenJsfPackage.GEN_MODEL_LABEL__GEN_LABEL_FOR:
				setGenLabelFor((GenService)newValue);
				return;
			case GenJsfPackage.GEN_MODEL_LABEL__JSF_LABEL:
				setJsfLabel((ModelLabel)newValue);
				return;
			case GenJsfPackage.GEN_MODEL_LABEL__GEN_FEATURES:
				getGenFeatures().clear();
				getGenFeatures().addAll((Collection<? extends GenServiceFeature>)newValue);
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
			case GenJsfPackage.GEN_MODEL_LABEL__GEN_LABEL_FOR:
				setGenLabelFor((GenService)null);
				return;
			case GenJsfPackage.GEN_MODEL_LABEL__JSF_LABEL:
				setJsfLabel((ModelLabel)null);
				return;
			case GenJsfPackage.GEN_MODEL_LABEL__GEN_FEATURES:
				getGenFeatures().clear();
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
			case GenJsfPackage.GEN_MODEL_LABEL__GEN_LABEL_FOR:
				return genLabelFor != null;
			case GenJsfPackage.GEN_MODEL_LABEL__JSF_LABEL:
				return jsfLabel != null;
			case GenJsfPackage.GEN_MODEL_LABEL__GEN_FEATURES:
				return genFeatures != null && !genFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenModelLabelImpl
