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
import uk.ac.man.cs.mdsd.genjsf.GenServiceFeature;
import uk.ac.man.cs.mdsd.genjsf.GenUnitTitle;
import uk.ac.man.cs.mdsd.genorm.GenAttribute;
import uk.ac.man.cs.mdsd.jsf.ServiceEntityElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Service Entity Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityElementImpl#getGenDefaultValue <em>Gen Default Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityElementImpl#getJsfFeature <em>Jsf Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityElementImpl#getGenFeature <em>Gen Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenServiceEntityElementImpl extends GenServiceEntityFeatureImpl implements GenServiceEntityElement {
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
	protected ServiceEntityElement jsfFeature;
	/**
	 * The cached value of the '{@link #getGenFeature() <em>Gen Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenFeature()
	 * @generated
	 * @ordered
	 */
	protected GenAttribute genFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenServiceEntityElementImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	public void reconcile(final GenServiceFeature oldGenFeature) {
		super.reconcile(oldGenFeature);
	}

	/**
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenServiceFeature oldGenFeature) {
		super.reconcileSettings(oldGenFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_SERVICE_ENTITY_ELEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_DEFAULT_VALUE, oldGenDefaultValue, newGenDefaultValue);
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
				msgs = ((InternalEObject)genDefaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_DEFAULT_VALUE, null, msgs);
			if (newGenDefaultValue != null)
				msgs = ((InternalEObject)newGenDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_DEFAULT_VALUE, null, msgs);
			msgs = basicSetGenDefaultValue(newGenDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_DEFAULT_VALUE, newGenDefaultValue, newGenDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement getJsfFeature() {
		if (jsfFeature != null && jsfFeature.eIsProxy()) {
			InternalEObject oldJsfFeature = (InternalEObject)jsfFeature;
			jsfFeature = (ServiceEntityElement)eResolveProxy(oldJsfFeature);
			if (jsfFeature != oldJsfFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__JSF_FEATURE, oldJsfFeature, jsfFeature));
			}
		}
		return jsfFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement basicGetJsfFeature() {
		return jsfFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfFeature(ServiceEntityElement newJsfFeature) {
		ServiceEntityElement oldJsfFeature = jsfFeature;
		jsfFeature = newJsfFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__JSF_FEATURE, oldJsfFeature, jsfFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAttribute getGenFeature() {
		if (genFeature != null && genFeature.eIsProxy()) {
			InternalEObject oldGenFeature = (InternalEObject)genFeature;
			genFeature = (GenAttribute)eResolveProxy(oldGenFeature);
			if (genFeature != oldGenFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_FEATURE, oldGenFeature, genFeature));
			}
		}
		return genFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenAttribute basicGetGenFeature() {
		return genFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenFeature(GenAttribute newGenFeature) {
		GenAttribute oldGenFeature = genFeature;
		genFeature = newGenFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_FEATURE, oldGenFeature, genFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_DEFAULT_VALUE:
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
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_DEFAULT_VALUE:
				return getGenDefaultValue();
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__JSF_FEATURE:
				if (resolve) return getJsfFeature();
				return basicGetJsfFeature();
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_FEATURE:
				if (resolve) return getGenFeature();
				return basicGetGenFeature();
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
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_DEFAULT_VALUE:
				setGenDefaultValue((GenExpression)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__JSF_FEATURE:
				setJsfFeature((ServiceEntityElement)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_FEATURE:
				setGenFeature((GenAttribute)newValue);
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
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_DEFAULT_VALUE:
				setGenDefaultValue((GenExpression)null);
				return;
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__JSF_FEATURE:
				setJsfFeature((ServiceEntityElement)null);
				return;
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_FEATURE:
				setGenFeature((GenAttribute)null);
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
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_DEFAULT_VALUE:
				return genDefaultValue != null;
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__JSF_FEATURE:
				return jsfFeature != null;
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_FEATURE:
				return genFeature != null;
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
				case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_DEFAULT_VALUE: return GenJsfPackage.GEN_INCLUDED_ELEMENT__GEN_DEFAULT_VALUE;
				default: return -1;
			}
		}
		if (baseClass == GenUnitTitle.class) {
			switch (derivedFeatureID) {
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
				case GenJsfPackage.GEN_INCLUDED_ELEMENT__GEN_DEFAULT_VALUE: return GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT__GEN_DEFAULT_VALUE;
				default: return -1;
			}
		}
		if (baseClass == GenUnitTitle.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GenServiceEntityElementImpl
