/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.gencriteria.GenExpression;
import uk.ac.man.cs.mdsd.genjsf.GenIncludedElement;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement;
import uk.ac.man.cs.mdsd.genjsf.GenUnitElement;
import uk.ac.man.cs.mdsd.genjsf.GenUnitField;
import uk.ac.man.cs.mdsd.jsf.UnitElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Unit Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitElementImpl#getGenDefaultValue <em>Gen Default Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitElementImpl#getJsfFeature <em>Jsf Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitElementImpl#getGenServiceFeature <em>Gen Service Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenUnitElementImpl extends GenUnitFeatureImpl implements GenUnitElement {
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
	 * The cached value of the '{@link #getJsfFeature() <em>Jsf Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfFeature()
	 * @generated
	 * @ordered
	 */
	protected UnitElement jsfFeature;
	/**
	 * The cached value of the '{@link #getGenServiceFeature() <em>Gen Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenServiceFeature()
	 * @generated
	 * @ordered
	 */
	protected GenServiceEntityElement genServiceFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenUnitElementImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	public void reconcile(final GenUnitField oldGenField) {
		super.reconcile(oldGenField);
	}

	/**
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenUnitField oldGenField) {
		super.reconcileSettings(oldGenField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_UNIT_ELEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_ELEMENT__GEN_DEFAULT_VALUE, oldGenDefaultValue, newGenDefaultValue);
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
				msgs = ((InternalEObject)genDefaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_UNIT_ELEMENT__GEN_DEFAULT_VALUE, null, msgs);
			if (newGenDefaultValue != null)
				msgs = ((InternalEObject)newGenDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_UNIT_ELEMENT__GEN_DEFAULT_VALUE, null, msgs);
			msgs = basicSetGenDefaultValue(newGenDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_ELEMENT__GEN_DEFAULT_VALUE, newGenDefaultValue, newGenDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitElement getJsfFeature() {
		if (jsfFeature != null && jsfFeature.eIsProxy()) {
			InternalEObject oldJsfFeature = (InternalEObject)jsfFeature;
			jsfFeature = (UnitElement)eResolveProxy(oldJsfFeature);
			if (jsfFeature != oldJsfFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_UNIT_ELEMENT__JSF_FEATURE, oldJsfFeature, jsfFeature));
			}
		}
		return jsfFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitElement basicGetJsfFeature() {
		return jsfFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfFeature(UnitElement newJsfFeature) {
		UnitElement oldJsfFeature = jsfFeature;
		jsfFeature = newJsfFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_ELEMENT__JSF_FEATURE, oldJsfFeature, jsfFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityElement getGenServiceFeature() {
		if (genServiceFeature != null && genServiceFeature.eIsProxy()) {
			InternalEObject oldGenServiceFeature = (InternalEObject)genServiceFeature;
			genServiceFeature = (GenServiceEntityElement)eResolveProxy(oldGenServiceFeature);
			if (genServiceFeature != oldGenServiceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_UNIT_ELEMENT__GEN_SERVICE_FEATURE, oldGenServiceFeature, genServiceFeature));
			}
		}
		return genServiceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityElement basicGetGenServiceFeature() {
		return genServiceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenServiceFeature(GenServiceEntityElement newGenServiceFeature) {
		GenServiceEntityElement oldGenServiceFeature = genServiceFeature;
		genServiceFeature = newGenServiceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_ELEMENT__GEN_SERVICE_FEATURE, oldGenServiceFeature, genServiceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_UNIT_ELEMENT__GEN_DEFAULT_VALUE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenJsfPackage.GEN_UNIT_ELEMENT__GEN_DEFAULT_VALUE:
				return getGenDefaultValue();
			case GenJsfPackage.GEN_UNIT_ELEMENT__JSF_FEATURE:
				if (resolve) return getJsfFeature();
				return basicGetJsfFeature();
			case GenJsfPackage.GEN_UNIT_ELEMENT__GEN_SERVICE_FEATURE:
				if (resolve) return getGenServiceFeature();
				return basicGetGenServiceFeature();
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
			case GenJsfPackage.GEN_UNIT_ELEMENT__GEN_DEFAULT_VALUE:
				setGenDefaultValue((GenExpression)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_ELEMENT__JSF_FEATURE:
				setJsfFeature((UnitElement)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_ELEMENT__GEN_SERVICE_FEATURE:
				setGenServiceFeature((GenServiceEntityElement)newValue);
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
			case GenJsfPackage.GEN_UNIT_ELEMENT__GEN_DEFAULT_VALUE:
				setGenDefaultValue((GenExpression)null);
				return;
			case GenJsfPackage.GEN_UNIT_ELEMENT__JSF_FEATURE:
				setJsfFeature((UnitElement)null);
				return;
			case GenJsfPackage.GEN_UNIT_ELEMENT__GEN_SERVICE_FEATURE:
				setGenServiceFeature((GenServiceEntityElement)null);
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
			case GenJsfPackage.GEN_UNIT_ELEMENT__GEN_DEFAULT_VALUE:
				return genDefaultValue != null;
			case GenJsfPackage.GEN_UNIT_ELEMENT__JSF_FEATURE:
				return jsfFeature != null;
			case GenJsfPackage.GEN_UNIT_ELEMENT__GEN_SERVICE_FEATURE:
				return genServiceFeature != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GenIncludedElement.class) {
			switch (derivedFeatureID) {
				case GenJsfPackage.GEN_UNIT_ELEMENT__GEN_DEFAULT_VALUE: return GenJsfPackage.GEN_INCLUDED_ELEMENT__GEN_DEFAULT_VALUE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GenIncludedElement.class) {
			switch (baseFeatureID) {
				case GenJsfPackage.GEN_INCLUDED_ELEMENT__GEN_DEFAULT_VALUE: return GenJsfPackage.GEN_UNIT_ELEMENT__GEN_DEFAULT_VALUE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GenUnitElementImpl
