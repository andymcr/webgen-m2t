/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.gencriteria.GenExpression;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenService;
import uk.ac.man.cs.mdsd.genjsf.GenServiceEntityFeature;
import uk.ac.man.cs.mdsd.genjsf.GenServiceFeature;
import uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions;
import uk.ac.man.cs.mdsd.orm.NamedElement;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Service Entity Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityFeatureImpl#getGenForcedValue <em>Gen Forced Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityFeatureImpl#getMessageDisplayOption <em>Message Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityFeatureImpl#getGenIncludedBy <em>Gen Included By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenServiceEntityFeatureImpl#getColumnName <em>Column Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenServiceEntityFeatureImpl extends EObjectImpl implements GenServiceEntityFeature {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenServiceEntityFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_SERVICE_ENTITY_FEATURE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_FORCED_VALUE, oldGenForcedValue, newGenForcedValue);
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
				msgs = ((InternalEObject)genForcedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_FORCED_VALUE, null, msgs);
			if (newGenForcedValue != null)
				msgs = ((InternalEObject)newGenForcedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_FORCED_VALUE, null, msgs);
			msgs = basicSetGenForcedValue(newGenForcedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_FORCED_VALUE, newGenForcedValue, newGenForcedValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__MESSAGE_DISPLAY_OPTION, oldMessageDisplayOption, messageDisplayOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService getGenIncludedBy() {
		if (eContainerFeatureID() != GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY) return null;
		return (GenService)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenIncludedBy(GenService newGenIncludedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenIncludedBy, GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenIncludedBy(GenService newGenIncludedBy) {
		if (newGenIncludedBy != eInternalContainer() || (eContainerFeatureID() != GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY && newGenIncludedBy != null)) {
			if (EcoreUtil.isAncestor(this, newGenIncludedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenIncludedBy != null)
				msgs = ((InternalEObject)newGenIncludedBy).eInverseAdd(this, GenJsfPackage.GEN_SERVICE__GEN_FEATURES, GenService.class, msgs);
			msgs = basicSetGenIncludedBy(newGenIncludedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY, newGenIncludedBy, newGenIncludedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * @generated NOT
	 */
	public void reconcile(final GenServiceFeature oldGenFeature) {
		reconcileSettings(oldGenFeature);
	}

	/**
	 * @generated NOT
	 */
	protected void reconcileSettings(final GenServiceFeature oldGenFeature) {
		if (oldGenFeature instanceof GenServiceEntityFeature) {
			final GenServiceEntityFeature oldGenElement = (GenServiceEntityFeature) oldGenFeature;
			if ((oldGenElement.getColumnName() != null) && !oldGenElement.getColumnName().equals("")) {
				setColumnName(oldGenElement.getColumnName());
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenIncludedBy((GenService)otherEnd, msgs);
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
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_FORCED_VALUE:
				return basicSetGenForcedValue(null, msgs);
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY:
				return basicSetGenIncludedBy(null, msgs);
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
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY:
				return eInternalContainer().eInverseRemove(this, GenJsfPackage.GEN_SERVICE__GEN_FEATURES, GenService.class, msgs);
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
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_FORCED_VALUE:
				return getGenForcedValue();
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__MESSAGE_DISPLAY_OPTION:
				return getMessageDisplayOption();
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__NAME:
				return getName();
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY:
				return getGenIncludedBy();
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__COLUMN_NAME:
				return getColumnName();
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
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_FORCED_VALUE:
				setGenForcedValue((GenExpression)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__MESSAGE_DISPLAY_OPTION:
				setMessageDisplayOption((InputMessageDisplayOptions)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__NAME:
				setName((String)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY:
				setGenIncludedBy((GenService)newValue);
				return;
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__COLUMN_NAME:
				setColumnName((String)newValue);
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
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_FORCED_VALUE:
				setGenForcedValue((GenExpression)null);
				return;
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__MESSAGE_DISPLAY_OPTION:
				setMessageDisplayOption(MESSAGE_DISPLAY_OPTION_EDEFAULT);
				return;
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY:
				setGenIncludedBy((GenService)null);
				return;
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
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
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_FORCED_VALUE:
				return genForcedValue != null;
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__MESSAGE_DISPLAY_OPTION:
				return messageDisplayOption != MESSAGE_DISPLAY_OPTION_EDEFAULT;
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY:
				return getGenIncludedBy() != null;
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__NAME: return OrmPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == GenServiceFeature.class) {
			switch (derivedFeatureID) {
				case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY: return GenJsfPackage.GEN_SERVICE_FEATURE__GEN_INCLUDED_BY;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case OrmPackage.NAMED_ELEMENT__NAME: return GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__NAME;
				default: return -1;
			}
		}
		if (baseClass == GenServiceFeature.class) {
			switch (baseFeatureID) {
				case GenJsfPackage.GEN_SERVICE_FEATURE__GEN_INCLUDED_BY: return GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE__GEN_INCLUDED_BY;
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
		result.append(", name: ");
		result.append(name);
		result.append(", columnName: ");
		result.append(columnName);
		result.append(')');
		return result.toString();
	}

} //GenServiceEntityFeatureImpl
