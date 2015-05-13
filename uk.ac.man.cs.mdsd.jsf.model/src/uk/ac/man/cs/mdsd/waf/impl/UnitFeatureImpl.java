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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.criteria.Expression;
import uk.ac.man.cs.mdsd.orm.Cardinality;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;
import uk.ac.man.cs.mdsd.waf.CollectionDisplayOptions;
import uk.ac.man.cs.mdsd.waf.DynamicUnit;
import uk.ac.man.cs.mdsd.waf.IncludedFeature;
import uk.ac.man.cs.mdsd.waf.InlineAction;
import uk.ac.man.cs.mdsd.waf.InlineActionContainer;
import uk.ac.man.cs.mdsd.waf.WafPackage;
import uk.ac.man.cs.mdsd.waf.SelectAction;
import uk.ac.man.cs.mdsd.waf.UnitFeature;
import uk.ac.man.cs.mdsd.waf.UnitField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#getForcedValue <em>Forced Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#getDisplayOption <em>Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#getLinkedAction <em>Linked Action</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#getMaximumDisplaySize <em>Maximum Display Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UnitFeatureImpl#isAutofocus <em>Autofocus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UnitFeatureImpl extends NamedElementImpl implements UnitFeature {
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
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<InlineAction> actions;

	/**
	 * The default value of the '{@link #isOnlyDisplayWhenNotEmpty() <em>Only Display When Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyDisplayWhenNotEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnlyDisplayWhenNotEmpty() <em>Only Display When Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyDisplayWhenNotEmpty()
	 * @generated
	 * @ordered
	 */
	protected boolean onlyDisplayWhenNotEmpty = ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayOption() <em>Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionDisplayOptions DISPLAY_OPTION_EDEFAULT = CollectionDisplayOptions.LINE_DIRECTION;

	/**
	 * The cached value of the '{@link #getDisplayOption() <em>Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected CollectionDisplayOptions displayOption = DISPLAY_OPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkedAction() <em>Linked Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedAction()
	 * @generated
	 * @ordered
	 */
	protected SelectAction linkedAction;

	/**
	 * The default value of the '{@link #getMaximumDisplaySize() <em>Maximum Display Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDisplaySize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_DISPLAY_SIZE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMaximumDisplaySize() <em>Maximum Display Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDisplaySize()
	 * @generated
	 * @ordered
	 */
	protected int maximumDisplaySize = MAXIMUM_DISPLAY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutofocus() <em>Autofocus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutofocus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOFOCUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutofocus() <em>Autofocus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutofocus()
	 * @generated
	 * @ordered
	 */
	protected boolean autofocus = AUTOFOCUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.UNIT_FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__DISPLAY_LABEL, oldDisplayLabel, displayLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__FORCED_VALUE, oldForcedValue, newForcedValue);
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
				msgs = ((InternalEObject)forcedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WafPackage.UNIT_FEATURE__FORCED_VALUE, null, msgs);
			if (newForcedValue != null)
				msgs = ((InternalEObject)newForcedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WafPackage.UNIT_FEATURE__FORCED_VALUE, null, msgs);
			msgs = basicSetForcedValue(newForcedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__FORCED_VALUE, newForcedValue, newForcedValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__FOOTER, oldFooter, footer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__DATE_FORMAT, oldDateFormat, dateFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__HEADER_CLASS, oldHeaderClass, headerClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__INPUT_CLASS, oldInputClass, inputClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__DISPLAY_CLASS, oldDisplayClass, displayClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicUnit getDisplayedOn() {
		if (eContainerFeatureID() != WafPackage.UNIT_FEATURE__DISPLAYED_ON) return null;
		return (DynamicUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayedOn(DynamicUnit newDisplayedOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDisplayedOn, WafPackage.UNIT_FEATURE__DISPLAYED_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayedOn(DynamicUnit newDisplayedOn) {
		if (newDisplayedOn != eInternalContainer() || (eContainerFeatureID() != WafPackage.UNIT_FEATURE__DISPLAYED_ON && newDisplayedOn != null)) {
			if (EcoreUtil.isAncestor(this, newDisplayedOn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDisplayedOn != null)
				msgs = ((InternalEObject)newDisplayedOn).eInverseAdd(this, WafPackage.DYNAMIC_UNIT__DISPLAY_FIELDS, DynamicUnit.class, msgs);
			msgs = basicSetDisplayedOn(newDisplayedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__DISPLAYED_ON, newDisplayedOn, newDisplayedOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InlineAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<InlineAction>(InlineAction.class, this, WafPackage.UNIT_FEATURE__ACTIONS, WafPackage.INLINE_ACTION__USED_BY);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnlyDisplayWhenNotEmpty() {
		return onlyDisplayWhenNotEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlyDisplayWhenNotEmpty(boolean newOnlyDisplayWhenNotEmpty) {
		boolean oldOnlyDisplayWhenNotEmpty = onlyDisplayWhenNotEmpty;
		onlyDisplayWhenNotEmpty = newOnlyDisplayWhenNotEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY, oldOnlyDisplayWhenNotEmpty, onlyDisplayWhenNotEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionDisplayOptions getDisplayOption() {
		return displayOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayOption(CollectionDisplayOptions newDisplayOption) {
		CollectionDisplayOptions oldDisplayOption = displayOption;
		displayOption = newDisplayOption == null ? DISPLAY_OPTION_EDEFAULT : newDisplayOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__DISPLAY_OPTION, oldDisplayOption, displayOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectAction getLinkedAction() {
		if (linkedAction != null && linkedAction.eIsProxy()) {
			InternalEObject oldLinkedAction = (InternalEObject)linkedAction;
			linkedAction = (SelectAction)eResolveProxy(oldLinkedAction);
			if (linkedAction != oldLinkedAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.UNIT_FEATURE__LINKED_ACTION, oldLinkedAction, linkedAction));
			}
		}
		return linkedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectAction basicGetLinkedAction() {
		return linkedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedAction(SelectAction newLinkedAction) {
		SelectAction oldLinkedAction = linkedAction;
		linkedAction = newLinkedAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__LINKED_ACTION, oldLinkedAction, linkedAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximumDisplaySize() {
		return maximumDisplaySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumDisplaySize(int newMaximumDisplaySize) {
		int oldMaximumDisplaySize = maximumDisplaySize;
		maximumDisplaySize = newMaximumDisplaySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE, oldMaximumDisplaySize, maximumDisplaySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutofocus() {
		return autofocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutofocus(boolean newAutofocus) {
		boolean oldAutofocus = autofocus;
		autofocus = newAutofocus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UNIT_FEATURE__AUTOFOCUS, oldAutofocus, autofocus));
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
			case WafPackage.UNIT_FEATURE__DISPLAYED_ON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDisplayedOn((DynamicUnit)otherEnd, msgs);
			case WafPackage.UNIT_FEATURE__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
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
			case WafPackage.UNIT_FEATURE__FORCED_VALUE:
				return basicSetForcedValue(null, msgs);
			case WafPackage.UNIT_FEATURE__DISPLAYED_ON:
				return basicSetDisplayedOn(null, msgs);
			case WafPackage.UNIT_FEATURE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case WafPackage.UNIT_FEATURE__DISPLAYED_ON:
				return eInternalContainer().eInverseRemove(this, WafPackage.DYNAMIC_UNIT__DISPLAY_FIELDS, DynamicUnit.class, msgs);
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
			case WafPackage.UNIT_FEATURE__DISPLAY_LABEL:
				return getDisplayLabel();
			case WafPackage.UNIT_FEATURE__FORCED_VALUE:
				return getForcedValue();
			case WafPackage.UNIT_FEATURE__FOOTER:
				return getFooter();
			case WafPackage.UNIT_FEATURE__HEADER_CLASS:
				return getHeaderClass();
			case WafPackage.UNIT_FEATURE__INPUT_CLASS:
				return getInputClass();
			case WafPackage.UNIT_FEATURE__DISPLAY_CLASS:
				return getDisplayClass();
			case WafPackage.UNIT_FEATURE__FOOTER_CLASS:
				return getFooterClass();
			case WafPackage.UNIT_FEATURE__DISPLAYED_ON:
				return getDisplayedOn();
			case WafPackage.UNIT_FEATURE__CARDINALITY:
				return getCardinality();
			case WafPackage.UNIT_FEATURE__DATE_FORMAT:
				return getDateFormat();
			case WafPackage.UNIT_FEATURE__ACTIONS:
				return getActions();
			case WafPackage.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				return isOnlyDisplayWhenNotEmpty();
			case WafPackage.UNIT_FEATURE__DISPLAY_OPTION:
				return getDisplayOption();
			case WafPackage.UNIT_FEATURE__LINKED_ACTION:
				if (resolve) return getLinkedAction();
				return basicGetLinkedAction();
			case WafPackage.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE:
				return getMaximumDisplaySize();
			case WafPackage.UNIT_FEATURE__AUTOFOCUS:
				return isAutofocus();
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
			case WafPackage.UNIT_FEATURE__DISPLAY_LABEL:
				setDisplayLabel((String)newValue);
				return;
			case WafPackage.UNIT_FEATURE__FORCED_VALUE:
				setForcedValue((Expression)newValue);
				return;
			case WafPackage.UNIT_FEATURE__FOOTER:
				setFooter((String)newValue);
				return;
			case WafPackage.UNIT_FEATURE__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WafPackage.UNIT_FEATURE__INPUT_CLASS:
				setInputClass((String)newValue);
				return;
			case WafPackage.UNIT_FEATURE__DISPLAY_CLASS:
				setDisplayClass((String)newValue);
				return;
			case WafPackage.UNIT_FEATURE__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case WafPackage.UNIT_FEATURE__DISPLAYED_ON:
				setDisplayedOn((DynamicUnit)newValue);
				return;
			case WafPackage.UNIT_FEATURE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case WafPackage.UNIT_FEATURE__DATE_FORMAT:
				setDateFormat((String)newValue);
				return;
			case WafPackage.UNIT_FEATURE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends InlineAction>)newValue);
				return;
			case WafPackage.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				setOnlyDisplayWhenNotEmpty((Boolean)newValue);
				return;
			case WafPackage.UNIT_FEATURE__DISPLAY_OPTION:
				setDisplayOption((CollectionDisplayOptions)newValue);
				return;
			case WafPackage.UNIT_FEATURE__LINKED_ACTION:
				setLinkedAction((SelectAction)newValue);
				return;
			case WafPackage.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE:
				setMaximumDisplaySize((Integer)newValue);
				return;
			case WafPackage.UNIT_FEATURE__AUTOFOCUS:
				setAutofocus((Boolean)newValue);
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
			case WafPackage.UNIT_FEATURE__DISPLAY_LABEL:
				setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
				return;
			case WafPackage.UNIT_FEATURE__FORCED_VALUE:
				setForcedValue((Expression)null);
				return;
			case WafPackage.UNIT_FEATURE__FOOTER:
				setFooter(FOOTER_EDEFAULT);
				return;
			case WafPackage.UNIT_FEATURE__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WafPackage.UNIT_FEATURE__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
				return;
			case WafPackage.UNIT_FEATURE__DISPLAY_CLASS:
				setDisplayClass(DISPLAY_CLASS_EDEFAULT);
				return;
			case WafPackage.UNIT_FEATURE__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case WafPackage.UNIT_FEATURE__DISPLAYED_ON:
				setDisplayedOn((DynamicUnit)null);
				return;
			case WafPackage.UNIT_FEATURE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case WafPackage.UNIT_FEATURE__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case WafPackage.UNIT_FEATURE__ACTIONS:
				getActions().clear();
				return;
			case WafPackage.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				setOnlyDisplayWhenNotEmpty(ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT);
				return;
			case WafPackage.UNIT_FEATURE__DISPLAY_OPTION:
				setDisplayOption(DISPLAY_OPTION_EDEFAULT);
				return;
			case WafPackage.UNIT_FEATURE__LINKED_ACTION:
				setLinkedAction((SelectAction)null);
				return;
			case WafPackage.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE:
				setMaximumDisplaySize(MAXIMUM_DISPLAY_SIZE_EDEFAULT);
				return;
			case WafPackage.UNIT_FEATURE__AUTOFOCUS:
				setAutofocus(AUTOFOCUS_EDEFAULT);
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
			case WafPackage.UNIT_FEATURE__DISPLAY_LABEL:
				return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
			case WafPackage.UNIT_FEATURE__FORCED_VALUE:
				return forcedValue != null;
			case WafPackage.UNIT_FEATURE__FOOTER:
				return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
			case WafPackage.UNIT_FEATURE__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WafPackage.UNIT_FEATURE__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
			case WafPackage.UNIT_FEATURE__DISPLAY_CLASS:
				return DISPLAY_CLASS_EDEFAULT == null ? displayClass != null : !DISPLAY_CLASS_EDEFAULT.equals(displayClass);
			case WafPackage.UNIT_FEATURE__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case WafPackage.UNIT_FEATURE__DISPLAYED_ON:
				return getDisplayedOn() != null;
			case WafPackage.UNIT_FEATURE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case WafPackage.UNIT_FEATURE__DATE_FORMAT:
				return DATE_FORMAT_EDEFAULT == null ? dateFormat != null : !DATE_FORMAT_EDEFAULT.equals(dateFormat);
			case WafPackage.UNIT_FEATURE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case WafPackage.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				return onlyDisplayWhenNotEmpty != ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT;
			case WafPackage.UNIT_FEATURE__DISPLAY_OPTION:
				return displayOption != DISPLAY_OPTION_EDEFAULT;
			case WafPackage.UNIT_FEATURE__LINKED_ACTION:
				return linkedAction != null;
			case WafPackage.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE:
				return maximumDisplaySize != MAXIMUM_DISPLAY_SIZE_EDEFAULT;
			case WafPackage.UNIT_FEATURE__AUTOFOCUS:
				return autofocus != AUTOFOCUS_EDEFAULT;
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
		if (baseClass == IncludedFeature.class) {
			switch (derivedFeatureID) {
				case WafPackage.UNIT_FEATURE__DISPLAY_LABEL: return WafPackage.INCLUDED_FEATURE__DISPLAY_LABEL;
				case WafPackage.UNIT_FEATURE__FORCED_VALUE: return WafPackage.INCLUDED_FEATURE__FORCED_VALUE;
				case WafPackage.UNIT_FEATURE__FOOTER: return WafPackage.INCLUDED_FEATURE__FOOTER;
				case WafPackage.UNIT_FEATURE__HEADER_CLASS: return WafPackage.INCLUDED_FEATURE__HEADER_CLASS;
				case WafPackage.UNIT_FEATURE__INPUT_CLASS: return WafPackage.INCLUDED_FEATURE__INPUT_CLASS;
				case WafPackage.UNIT_FEATURE__DISPLAY_CLASS: return WafPackage.INCLUDED_FEATURE__DISPLAY_CLASS;
				case WafPackage.UNIT_FEATURE__FOOTER_CLASS: return WafPackage.INCLUDED_FEATURE__FOOTER_CLASS;
				default: return -1;
			}
		}
		if (baseClass == UnitField.class) {
			switch (derivedFeatureID) {
				case WafPackage.UNIT_FEATURE__DISPLAYED_ON: return WafPackage.UNIT_FIELD__DISPLAYED_ON;
				case WafPackage.UNIT_FEATURE__CARDINALITY: return WafPackage.UNIT_FIELD__CARDINALITY;
				case WafPackage.UNIT_FEATURE__DATE_FORMAT: return WafPackage.UNIT_FIELD__DATE_FORMAT;
				default: return -1;
			}
		}
		if (baseClass == InlineActionContainer.class) {
			switch (derivedFeatureID) {
				case WafPackage.UNIT_FEATURE__ACTIONS: return WafPackage.INLINE_ACTION_CONTAINER__ACTIONS;
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
		if (baseClass == IncludedFeature.class) {
			switch (baseFeatureID) {
				case WafPackage.INCLUDED_FEATURE__DISPLAY_LABEL: return WafPackage.UNIT_FEATURE__DISPLAY_LABEL;
				case WafPackage.INCLUDED_FEATURE__FORCED_VALUE: return WafPackage.UNIT_FEATURE__FORCED_VALUE;
				case WafPackage.INCLUDED_FEATURE__FOOTER: return WafPackage.UNIT_FEATURE__FOOTER;
				case WafPackage.INCLUDED_FEATURE__HEADER_CLASS: return WafPackage.UNIT_FEATURE__HEADER_CLASS;
				case WafPackage.INCLUDED_FEATURE__INPUT_CLASS: return WafPackage.UNIT_FEATURE__INPUT_CLASS;
				case WafPackage.INCLUDED_FEATURE__DISPLAY_CLASS: return WafPackage.UNIT_FEATURE__DISPLAY_CLASS;
				case WafPackage.INCLUDED_FEATURE__FOOTER_CLASS: return WafPackage.UNIT_FEATURE__FOOTER_CLASS;
				default: return -1;
			}
		}
		if (baseClass == UnitField.class) {
			switch (baseFeatureID) {
				case WafPackage.UNIT_FIELD__DISPLAYED_ON: return WafPackage.UNIT_FEATURE__DISPLAYED_ON;
				case WafPackage.UNIT_FIELD__CARDINALITY: return WafPackage.UNIT_FEATURE__CARDINALITY;
				case WafPackage.UNIT_FIELD__DATE_FORMAT: return WafPackage.UNIT_FEATURE__DATE_FORMAT;
				default: return -1;
			}
		}
		if (baseClass == InlineActionContainer.class) {
			switch (baseFeatureID) {
				case WafPackage.INLINE_ACTION_CONTAINER__ACTIONS: return WafPackage.UNIT_FEATURE__ACTIONS;
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
		result.append(", onlyDisplayWhenNotEmpty: ");
		result.append(onlyDisplayWhenNotEmpty);
		result.append(", displayOption: ");
		result.append(displayOption);
		result.append(", maximumDisplaySize: ");
		result.append(maximumDisplaySize);
		result.append(", autofocus: ");
		result.append(autofocus);
		result.append(')');
		return result.toString();
	}

} //UnitFeatureImpl
