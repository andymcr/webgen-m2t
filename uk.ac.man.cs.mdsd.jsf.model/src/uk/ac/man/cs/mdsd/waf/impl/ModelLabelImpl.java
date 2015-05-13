/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;
import uk.ac.man.cs.mdsd.waf.WafPackage;
import uk.ac.man.cs.mdsd.waf.ModelLabel;
import uk.ac.man.cs.mdsd.waf.Service;
import uk.ac.man.cs.mdsd.waf.ServiceFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ModelLabelImpl#getLabelFor <em>Label For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ModelLabelImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ModelLabelImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelLabelImpl extends NamedElementImpl implements ModelLabel {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceFeature> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.MODEL_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getLabelFor() {
		if (eContainerFeatureID() != WafPackage.MODEL_LABEL__LABEL_FOR) return null;
		return (Service)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelFor(Service newLabelFor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLabelFor, WafPackage.MODEL_LABEL__LABEL_FOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelFor(Service newLabelFor) {
		if (newLabelFor != eInternalContainer() || (eContainerFeatureID() != WafPackage.MODEL_LABEL__LABEL_FOR && newLabelFor != null)) {
			if (EcoreUtil.isAncestor(this, newLabelFor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLabelFor != null)
				msgs = ((InternalEObject)newLabelFor).eInverseAdd(this, WafPackage.SERVICE__DISPLAY_LABELS, Service.class, msgs);
			msgs = basicSetLabelFor(newLabelFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.MODEL_LABEL__LABEL_FOR, newLabelFor, newLabelFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.MODEL_LABEL__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceFeature> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<ServiceFeature>(ServiceFeature.class, this, WafPackage.MODEL_LABEL__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.MODEL_LABEL__LABEL_FOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLabelFor((Service)otherEnd, msgs);
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
			case WafPackage.MODEL_LABEL__LABEL_FOR:
				return basicSetLabelFor(null, msgs);
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
			case WafPackage.MODEL_LABEL__LABEL_FOR:
				return eInternalContainer().eInverseRemove(this, WafPackage.SERVICE__DISPLAY_LABELS, Service.class, msgs);
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
			case WafPackage.MODEL_LABEL__LABEL_FOR:
				return getLabelFor();
			case WafPackage.MODEL_LABEL__FORMAT:
				return getFormat();
			case WafPackage.MODEL_LABEL__FEATURES:
				return getFeatures();
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
			case WafPackage.MODEL_LABEL__LABEL_FOR:
				setLabelFor((Service)newValue);
				return;
			case WafPackage.MODEL_LABEL__FORMAT:
				setFormat((String)newValue);
				return;
			case WafPackage.MODEL_LABEL__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends ServiceFeature>)newValue);
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
			case WafPackage.MODEL_LABEL__LABEL_FOR:
				setLabelFor((Service)null);
				return;
			case WafPackage.MODEL_LABEL__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case WafPackage.MODEL_LABEL__FEATURES:
				getFeatures().clear();
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
			case WafPackage.MODEL_LABEL__LABEL_FOR:
				return getLabelFor() != null;
			case WafPackage.MODEL_LABEL__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case WafPackage.MODEL_LABEL__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (format: ");
		result.append(format);
		result.append(')');
		return result.toString();
	}

} //ModelLabelImpl
