/**
 */
package uk.ac.man.cs.mdsd.jsf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.criteria.Expression;
import uk.ac.man.cs.mdsd.jsf.JsfPackage;
import uk.ac.man.cs.mdsd.jsf.Service;
import uk.ac.man.cs.mdsd.jsf.ServiceEntityFeature;
import uk.ac.man.cs.mdsd.jsf.ServiceFeature;
import uk.ac.man.cs.mdsd.orm.Cardinality;
import uk.ac.man.cs.mdsd.orm.NamedElement;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Entity Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl#getForcedValue <em>Forced Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl#getIncludedBy <em>Included By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.impl.ServiceEntityFeatureImpl#getViewColumnName <em>View Column Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ServiceEntityFeatureImpl extends EObjectImpl implements ServiceEntityFeature {
	/**
	 * The default value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected String displayLabel = DISPLAY_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForcedValue() <em>Forced Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForcedValue()
	 * @generated
	 * @ordered
	 */
	protected Expression forcedValue;

	/**
	 * The default value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected String footer = FOOTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String headerClass = HEADER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClass()
	 * @generated
	 * @ordered
	 */
	protected String inputClass = INPUT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayClass() <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayClass() <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected String displayClass = DISPLAY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String footerClass = FOOTER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality CARDINALITY_EDEFAULT = Cardinality.OPTIONAL;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected String dateFormat = DATE_FORMAT_EDEFAULT;

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
	 * The default value of the '{@link #getViewColumnName() <em>View Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewColumnName() <em>View Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewColumnName()
	 * @generated
	 * @ordered
	 */
	protected String viewColumnName = VIEW_COLUMN_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceEntityFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsfPackage.Literals.SERVICE_ENTITY_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayLabel() {
		return displayLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayLabel(String newDisplayLabel) {
		String oldDisplayLabel = displayLabel;
		displayLabel = newDisplayLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_FEATURE__DISPLAY_LABEL, oldDisplayLabel, displayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getForcedValue() {
		return forcedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForcedValue(Expression newForcedValue, NotificationChain msgs) {
		Expression oldForcedValue = forcedValue;
		forcedValue = newForcedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_FEATURE__FORCED_VALUE, oldForcedValue, newForcedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForcedValue(Expression newForcedValue) {
		if (newForcedValue != forcedValue) {
			NotificationChain msgs = null;
			if (forcedValue != null)
				msgs = ((InternalEObject)forcedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsfPackage.SERVICE_ENTITY_FEATURE__FORCED_VALUE, null, msgs);
			if (newForcedValue != null)
				msgs = ((InternalEObject)newForcedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsfPackage.SERVICE_ENTITY_FEATURE__FORCED_VALUE, null, msgs);
			msgs = basicSetForcedValue(newForcedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_FEATURE__FORCED_VALUE, newForcedValue, newForcedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFooter() {
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(String newFooter) {
		String oldFooter = footer;
		footer = newFooter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_FEATURE__FOOTER, oldFooter, footer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateFormat() {
		return dateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFormat(String newDateFormat) {
		String oldDateFormat = dateFormat;
		dateFormat = newDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_FEATURE__DATE_FORMAT, oldDateFormat, dateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeaderClass() {
		return headerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderClass(String newHeaderClass) {
		String oldHeaderClass = headerClass;
		headerClass = newHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_FEATURE__HEADER_CLASS, oldHeaderClass, headerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputClass() {
		return inputClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputClass(String newInputClass) {
		String oldInputClass = inputClass;
		inputClass = newInputClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_FEATURE__INPUT_CLASS, oldInputClass, inputClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayClass() {
		return displayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayClass(String newDisplayClass) {
		String oldDisplayClass = displayClass;
		displayClass = newDisplayClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_FEATURE__DISPLAY_CLASS, oldDisplayClass, displayClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFooterClass() {
		return footerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooterClass(String newFooterClass) {
		String oldFooterClass = footerClass;
		footerClass = newFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_FEATURE__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getIncludedBy() {
		if (eContainerFeatureID() != JsfPackage.SERVICE_ENTITY_FEATURE__INCLUDED_BY) return null;
		return (Service)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludedBy(Service newIncludedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIncludedBy, JsfPackage.SERVICE_ENTITY_FEATURE__INCLUDED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludedBy(Service newIncludedBy) {
		if (newIncludedBy != eInternalContainer() || (eContainerFeatureID() != JsfPackage.SERVICE_ENTITY_FEATURE__INCLUDED_BY && newIncludedBy != null)) {
			if (EcoreUtil.isAncestor(this, newIncludedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIncludedBy != null)
				msgs = ((InternalEObject)newIncludedBy).eInverseAdd(this, JsfPackage.SERVICE__FEATURES, Service.class, msgs);
			msgs = basicSetIncludedBy(newIncludedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_FEATURE__INCLUDED_BY, newIncludedBy, newIncludedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_FEATURE__CARDINALITY, oldCardinality, cardinality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewColumnName() {
		return viewColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewColumnName(String newViewColumnName) {
		String oldViewColumnName = viewColumnName;
		viewColumnName = newViewColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsfPackage.SERVICE_ENTITY_FEATURE__VIEW_COLUMN_NAME, oldViewColumnName, viewColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsfPackage.SERVICE_ENTITY_FEATURE__INCLUDED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIncludedBy((Service)otherEnd, msgs);
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
			case JsfPackage.SERVICE_ENTITY_FEATURE__FORCED_VALUE:
				return basicSetForcedValue(null, msgs);
			case JsfPackage.SERVICE_ENTITY_FEATURE__INCLUDED_BY:
				return basicSetIncludedBy(null, msgs);
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
			case JsfPackage.SERVICE_ENTITY_FEATURE__INCLUDED_BY:
				return eInternalContainer().eInverseRemove(this, JsfPackage.SERVICE__FEATURES, Service.class, msgs);
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
			case JsfPackage.SERVICE_ENTITY_FEATURE__DISPLAY_LABEL:
				return getDisplayLabel();
			case JsfPackage.SERVICE_ENTITY_FEATURE__FORCED_VALUE:
				return getForcedValue();
			case JsfPackage.SERVICE_ENTITY_FEATURE__FOOTER:
				return getFooter();
			case JsfPackage.SERVICE_ENTITY_FEATURE__HEADER_CLASS:
				return getHeaderClass();
			case JsfPackage.SERVICE_ENTITY_FEATURE__INPUT_CLASS:
				return getInputClass();
			case JsfPackage.SERVICE_ENTITY_FEATURE__DISPLAY_CLASS:
				return getDisplayClass();
			case JsfPackage.SERVICE_ENTITY_FEATURE__FOOTER_CLASS:
				return getFooterClass();
			case JsfPackage.SERVICE_ENTITY_FEATURE__INCLUDED_BY:
				return getIncludedBy();
			case JsfPackage.SERVICE_ENTITY_FEATURE__CARDINALITY:
				return getCardinality();
			case JsfPackage.SERVICE_ENTITY_FEATURE__DATE_FORMAT:
				return getDateFormat();
			case JsfPackage.SERVICE_ENTITY_FEATURE__NAME:
				return getName();
			case JsfPackage.SERVICE_ENTITY_FEATURE__VIEW_COLUMN_NAME:
				return getViewColumnName();
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
			case JsfPackage.SERVICE_ENTITY_FEATURE__DISPLAY_LABEL:
				setDisplayLabel((String)newValue);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__FORCED_VALUE:
				setForcedValue((Expression)newValue);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__FOOTER:
				setFooter((String)newValue);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__INPUT_CLASS:
				setInputClass((String)newValue);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__DISPLAY_CLASS:
				setDisplayClass((String)newValue);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__INCLUDED_BY:
				setIncludedBy((Service)newValue);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__DATE_FORMAT:
				setDateFormat((String)newValue);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__NAME:
				setName((String)newValue);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__VIEW_COLUMN_NAME:
				setViewColumnName((String)newValue);
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
			case JsfPackage.SERVICE_ENTITY_FEATURE__DISPLAY_LABEL:
				setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__FORCED_VALUE:
				setForcedValue((Expression)null);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__FOOTER:
				setFooter(FOOTER_EDEFAULT);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__DISPLAY_CLASS:
				setDisplayClass(DISPLAY_CLASS_EDEFAULT);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__INCLUDED_BY:
				setIncludedBy((Service)null);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JsfPackage.SERVICE_ENTITY_FEATURE__VIEW_COLUMN_NAME:
				setViewColumnName(VIEW_COLUMN_NAME_EDEFAULT);
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
			case JsfPackage.SERVICE_ENTITY_FEATURE__DISPLAY_LABEL:
				return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
			case JsfPackage.SERVICE_ENTITY_FEATURE__FORCED_VALUE:
				return forcedValue != null;
			case JsfPackage.SERVICE_ENTITY_FEATURE__FOOTER:
				return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
			case JsfPackage.SERVICE_ENTITY_FEATURE__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case JsfPackage.SERVICE_ENTITY_FEATURE__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
			case JsfPackage.SERVICE_ENTITY_FEATURE__DISPLAY_CLASS:
				return DISPLAY_CLASS_EDEFAULT == null ? displayClass != null : !DISPLAY_CLASS_EDEFAULT.equals(displayClass);
			case JsfPackage.SERVICE_ENTITY_FEATURE__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case JsfPackage.SERVICE_ENTITY_FEATURE__INCLUDED_BY:
				return getIncludedBy() != null;
			case JsfPackage.SERVICE_ENTITY_FEATURE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case JsfPackage.SERVICE_ENTITY_FEATURE__DATE_FORMAT:
				return DATE_FORMAT_EDEFAULT == null ? dateFormat != null : !DATE_FORMAT_EDEFAULT.equals(dateFormat);
			case JsfPackage.SERVICE_ENTITY_FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JsfPackage.SERVICE_ENTITY_FEATURE__VIEW_COLUMN_NAME:
				return VIEW_COLUMN_NAME_EDEFAULT == null ? viewColumnName != null : !VIEW_COLUMN_NAME_EDEFAULT.equals(viewColumnName);
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
		if (baseClass == ServiceFeature.class) {
			switch (derivedFeatureID) {
				case JsfPackage.SERVICE_ENTITY_FEATURE__INCLUDED_BY: return JsfPackage.SERVICE_FEATURE__INCLUDED_BY;
				case JsfPackage.SERVICE_ENTITY_FEATURE__CARDINALITY: return JsfPackage.SERVICE_FEATURE__CARDINALITY;
				case JsfPackage.SERVICE_ENTITY_FEATURE__DATE_FORMAT: return JsfPackage.SERVICE_FEATURE__DATE_FORMAT;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case JsfPackage.SERVICE_ENTITY_FEATURE__NAME: return OrmPackage.NAMED_ELEMENT__NAME;
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
		if (baseClass == ServiceFeature.class) {
			switch (baseFeatureID) {
				case JsfPackage.SERVICE_FEATURE__INCLUDED_BY: return JsfPackage.SERVICE_ENTITY_FEATURE__INCLUDED_BY;
				case JsfPackage.SERVICE_FEATURE__CARDINALITY: return JsfPackage.SERVICE_ENTITY_FEATURE__CARDINALITY;
				case JsfPackage.SERVICE_FEATURE__DATE_FORMAT: return JsfPackage.SERVICE_ENTITY_FEATURE__DATE_FORMAT;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case OrmPackage.NAMED_ELEMENT__NAME: return JsfPackage.SERVICE_ENTITY_FEATURE__NAME;
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
		result.append(" (displayLabel: ");
		result.append(displayLabel);
		result.append(", footer: ");
		result.append(footer);
		result.append(", headerClass: ");
		result.append(headerClass);
		result.append(", inputClass: ");
		result.append(inputClass);
		result.append(", displayClass: ");
		result.append(displayClass);
		result.append(", footerClass: ");
		result.append(footerClass);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(", dateFormat: ");
		result.append(dateFormat);
		result.append(", name: ");
		result.append(name);
		result.append(", viewColumnName: ");
		result.append(viewColumnName);
		result.append(')');
		return result.toString();
	}

} //ServiceEntityFeatureImpl
