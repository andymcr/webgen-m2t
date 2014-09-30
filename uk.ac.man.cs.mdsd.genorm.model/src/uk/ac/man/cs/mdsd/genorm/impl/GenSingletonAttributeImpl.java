/**
 */
package uk.ac.man.cs.mdsd.genorm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.gencriteria.GenExpression;
import uk.ac.man.cs.mdsd.genorm.GenFeature;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;
import uk.ac.man.cs.mdsd.genorm.GenSingletonAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Singleton Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonAttributeImpl#getGenDefaultValue <em>Gen Default Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenSingletonAttributeImpl#getColumnName <em>Column Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenSingletonAttributeImpl extends GenAttributeImpl implements GenSingletonAttribute {
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
	protected GenSingletonAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenOrmPackage.Literals.GEN_SINGLETON_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_SINGLETON_ATTRIBUTE__COLUMN_NAME, oldColumnName, columnName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE, oldGenDefaultValue, newGenDefaultValue);
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
				msgs = ((InternalEObject)genDefaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenOrmPackage.GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE, null, msgs);
			if (newGenDefaultValue != null)
				msgs = ((InternalEObject)newGenDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenOrmPackage.GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE, null, msgs);
			msgs = basicSetGenDefaultValue(newGenDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE, newGenDefaultValue, newGenDefaultValue));
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

		if (oldGenFeature instanceof GenSingletonAttribute) {
			final GenSingletonAttribute oldGenAttribute = (GenSingletonAttribute) oldGenFeature;
			if ((oldGenAttribute.getColumnName() != null) && !oldGenAttribute.getColumnName().equals("")) {
				setColumnName(oldGenAttribute.getColumnName());
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenOrmPackage.GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE:
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
			case GenOrmPackage.GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE:
				return getGenDefaultValue();
			case GenOrmPackage.GEN_SINGLETON_ATTRIBUTE__COLUMN_NAME:
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
			case GenOrmPackage.GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE:
				setGenDefaultValue((GenExpression)newValue);
				return;
			case GenOrmPackage.GEN_SINGLETON_ATTRIBUTE__COLUMN_NAME:
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
			case GenOrmPackage.GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE:
				setGenDefaultValue((GenExpression)null);
				return;
			case GenOrmPackage.GEN_SINGLETON_ATTRIBUTE__COLUMN_NAME:
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
			case GenOrmPackage.GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE:
				return genDefaultValue != null;
			case GenOrmPackage.GEN_SINGLETON_ATTRIBUTE__COLUMN_NAME:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (columnName: ");
		result.append(columnName);
		result.append(')');
		return result.toString();
	}

} //GenSingletonAttributeImpl
