/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.gencriteria.GenExpression;
import uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit;
import uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature;
import uk.ac.man.cs.mdsd.genjsf.GenInlineAction;
import uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenUnitFeature;
import uk.ac.man.cs.mdsd.genjsf.GenUnitField;
import uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Unit Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitFeatureImpl#getGenDisplayedOn <em>Gen Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitFeatureImpl#getGenForcedValue <em>Gen Forced Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitFeatureImpl#getMessageDisplayOption <em>Message Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitFeatureImpl#getGenActions <em>Gen Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenUnitFeatureImpl extends NamedElementImpl implements GenUnitFeature {
	/**
	 * The cached value of the '{@link #getGenForcedValue() <em>Gen Forced Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenForcedValue()
	 * @generated
	 * @ordered
	 */
	protected GenExpression genForcedValue;

	/**
	 * The default value of the '{@link #getMessageDisplayOption() <em>Message Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected static final InputMessageDisplayOptions MESSAGE_DISPLAY_OPTION_EDEFAULT = InputMessageDisplayOptions.DESCRIPTION;

	/**
	 * The cached value of the '{@link #getMessageDisplayOption() <em>Message Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected InputMessageDisplayOptions messageDisplayOption = MESSAGE_DISPLAY_OPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenActions() <em>Gen Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenActions()
	 * @generated
	 * @ordered
	 */
	protected EList<GenInlineAction> genActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenUnitFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_UNIT_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDynamicUnit getGenDisplayedOn() {
		if (eContainerFeatureID() != GenJsfPackage.GEN_UNIT_FEATURE__GEN_DISPLAYED_ON) return null;
		return (GenDynamicUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenDisplayedOn(GenDynamicUnit newGenDisplayedOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenDisplayedOn, GenJsfPackage.GEN_UNIT_FEATURE__GEN_DISPLAYED_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenDisplayedOn(GenDynamicUnit newGenDisplayedOn) {
		if (newGenDisplayedOn != eInternalContainer() || (eContainerFeatureID() != GenJsfPackage.GEN_UNIT_FEATURE__GEN_DISPLAYED_ON && newGenDisplayedOn != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_FEATURE__GEN_DISPLAYED_ON, newGenDisplayedOn, newGenDisplayedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenExpression getGenForcedValue() {
		return genForcedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenForcedValue(GenExpression newGenForcedValue, NotificationChain msgs) {
		GenExpression oldGenForcedValue = genForcedValue;
		genForcedValue = newGenForcedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_FEATURE__GEN_FORCED_VALUE, oldGenForcedValue, newGenForcedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenForcedValue(GenExpression newGenForcedValue) {
		if (newGenForcedValue != genForcedValue) {
			NotificationChain msgs = null;
			if (genForcedValue != null)
				msgs = ((InternalEObject)genForcedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_UNIT_FEATURE__GEN_FORCED_VALUE, null, msgs);
			if (newGenForcedValue != null)
				msgs = ((InternalEObject)newGenForcedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_UNIT_FEATURE__GEN_FORCED_VALUE, null, msgs);
			msgs = basicSetGenForcedValue(newGenForcedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_FEATURE__GEN_FORCED_VALUE, newGenForcedValue, newGenForcedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMessageDisplayOptions getMessageDisplayOption() {
		return messageDisplayOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDisplayOption(InputMessageDisplayOptions newMessageDisplayOption) {
		InputMessageDisplayOptions oldMessageDisplayOption = messageDisplayOption;
		messageDisplayOption = newMessageDisplayOption == null ? MESSAGE_DISPLAY_OPTION_EDEFAULT : newMessageDisplayOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_FEATURE__MESSAGE_DISPLAY_OPTION, oldMessageDisplayOption, messageDisplayOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenInlineAction> getGenActions() {
		if (genActions == null) {
			genActions = new EObjectContainmentWithInverseEList<GenInlineAction>(GenInlineAction.class, this, GenJsfPackage.GEN_UNIT_FEATURE__GEN_ACTIONS, GenJsfPackage.GEN_INLINE_ACTION__GEN_USED_BY);
		}
		return genActions;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_DISPLAYED_ON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenDisplayedOn((GenDynamicUnit)otherEnd, msgs);
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenActions()).basicAdd(otherEnd, msgs);
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
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_DISPLAYED_ON:
				return basicSetGenDisplayedOn(null, msgs);
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_FORCED_VALUE:
				return basicSetGenForcedValue(null, msgs);
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_ACTIONS:
				return ((InternalEList<?>)getGenActions()).basicRemove(otherEnd, msgs);
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
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_DISPLAYED_ON:
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
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_DISPLAYED_ON:
				return getGenDisplayedOn();
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_FORCED_VALUE:
				return getGenForcedValue();
			case GenJsfPackage.GEN_UNIT_FEATURE__MESSAGE_DISPLAY_OPTION:
				return getMessageDisplayOption();
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_ACTIONS:
				return getGenActions();
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
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_DISPLAYED_ON:
				setGenDisplayedOn((GenDynamicUnit)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_FORCED_VALUE:
				setGenForcedValue((GenExpression)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_FEATURE__MESSAGE_DISPLAY_OPTION:
				setMessageDisplayOption((InputMessageDisplayOptions)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_ACTIONS:
				getGenActions().clear();
				getGenActions().addAll((Collection<? extends GenInlineAction>)newValue);
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
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_DISPLAYED_ON:
				setGenDisplayedOn((GenDynamicUnit)null);
				return;
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_FORCED_VALUE:
				setGenForcedValue((GenExpression)null);
				return;
			case GenJsfPackage.GEN_UNIT_FEATURE__MESSAGE_DISPLAY_OPTION:
				setMessageDisplayOption(MESSAGE_DISPLAY_OPTION_EDEFAULT);
				return;
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_ACTIONS:
				getGenActions().clear();
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
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_DISPLAYED_ON:
				return getGenDisplayedOn() != null;
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_FORCED_VALUE:
				return genForcedValue != null;
			case GenJsfPackage.GEN_UNIT_FEATURE__MESSAGE_DISPLAY_OPTION:
				return messageDisplayOption != MESSAGE_DISPLAY_OPTION_EDEFAULT;
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_ACTIONS:
				return genActions != null && !genActions.isEmpty();
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
		if (baseClass == GenIncludedFeature.class) {
			switch (derivedFeatureID) {
				case GenJsfPackage.GEN_UNIT_FEATURE__GEN_FORCED_VALUE: return GenJsfPackage.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE;
				case GenJsfPackage.GEN_UNIT_FEATURE__MESSAGE_DISPLAY_OPTION: return GenJsfPackage.GEN_INCLUDED_FEATURE__MESSAGE_DISPLAY_OPTION;
				default: return -1;
			}
		}
		if (baseClass == GenInlineActionContainer.class) {
			switch (derivedFeatureID) {
				case GenJsfPackage.GEN_UNIT_FEATURE__GEN_ACTIONS: return GenJsfPackage.GEN_INLINE_ACTION_CONTAINER__GEN_ACTIONS;
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
		if (baseClass == GenIncludedFeature.class) {
			switch (baseFeatureID) {
				case GenJsfPackage.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE: return GenJsfPackage.GEN_UNIT_FEATURE__GEN_FORCED_VALUE;
				case GenJsfPackage.GEN_INCLUDED_FEATURE__MESSAGE_DISPLAY_OPTION: return GenJsfPackage.GEN_UNIT_FEATURE__MESSAGE_DISPLAY_OPTION;
				default: return -1;
			}
		}
		if (baseClass == GenInlineActionContainer.class) {
			switch (baseFeatureID) {
				case GenJsfPackage.GEN_INLINE_ACTION_CONTAINER__GEN_ACTIONS: return GenJsfPackage.GEN_UNIT_FEATURE__GEN_ACTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (messageDisplayOption: ");
		result.append(messageDisplayOption);
		result.append(')');
		return result.toString();
	}

} //GenUnitFeatureImpl
