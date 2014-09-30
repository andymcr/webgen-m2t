/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenIncludedAssociation;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenModelLabel;
import uk.ac.man.cs.mdsd.genjsf.GenSelection;
import uk.ac.man.cs.mdsd.genjsf.GenServiceAssociation;
import uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation;
import uk.ac.man.cs.mdsd.genjsf.GenUnitChildFeature;
import uk.ac.man.cs.mdsd.genjsf.GenUnitContainer;
import uk.ac.man.cs.mdsd.genjsf.GenUnitField;
import uk.ac.man.cs.mdsd.genjsf.SelectManyOptions;
import uk.ac.man.cs.mdsd.genjsf.SelectOneofOptions;
import uk.ac.man.cs.mdsd.jsf.UnitAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Unit Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitAssociationImpl#getGenUnits <em>Gen Units</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitAssociationImpl#getJsfFeature <em>Jsf Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitAssociationImpl#getGenServiceFeature <em>Gen Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitAssociationImpl#getGenChildFeature <em>Gen Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitAssociationImpl#getGenSelection <em>Gen Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitAssociationImpl#getGenDynamicLabel <em>Gen Dynamic Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitAssociationImpl#getSelectOneOfOption <em>Select One Of Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitAssociationImpl#getSelectManyOption <em>Select Many Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenUnitAssociationImpl extends GenUnitFeatureImpl implements GenUnitAssociation {
	/**
	 * The cached value of the '{@link #getGenUnits() <em>Gen Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<GenContentUnit> genUnits;

	/**
	 * The cached value of the '{@link #getJsfFeature() <em>Jsf Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfFeature()
	 * @generated
	 * @ordered
	 */
	protected UnitAssociation jsfFeature;

	/**
	 * The cached value of the '{@link #getGenServiceFeature() <em>Gen Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenServiceFeature()
	 * @generated
	 * @ordered
	 */
	protected GenServiceAssociation genServiceFeature;

	/**
	 * The cached value of the '{@link #getGenChildFeature() <em>Gen Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenChildFeature()
	 * @generated
	 * @ordered
	 */
	protected GenUnitChildFeature genChildFeature;

	/**
	 * The cached value of the '{@link #getGenSelection() <em>Gen Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenSelection()
	 * @generated
	 * @ordered
	 */
	protected GenSelection genSelection;

	/**
	 * The cached value of the '{@link #getGenDynamicLabel() <em>Gen Dynamic Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenDynamicLabel()
	 * @generated
	 * @ordered
	 */
	protected GenModelLabel genDynamicLabel;

	/**
	 * The default value of the '{@link #getSelectOneOfOption() <em>Select One Of Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectOneOfOption()
	 * @generated
	 * @ordered
	 */
	protected static final SelectOneofOptions SELECT_ONE_OF_OPTION_EDEFAULT = SelectOneofOptions.MENU;

	/**
	 * The cached value of the '{@link #getSelectOneOfOption() <em>Select One Of Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectOneOfOption()
	 * @generated
	 * @ordered
	 */
	protected SelectOneofOptions selectOneOfOption = SELECT_ONE_OF_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectManyOption() <em>Select Many Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectManyOption()
	 * @generated
	 * @ordered
	 */
	protected static final SelectManyOptions SELECT_MANY_OPTION_EDEFAULT = SelectManyOptions.LIST;

	/**
	 * The cached value of the '{@link #getSelectManyOption() <em>Select Many Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectManyOption()
	 * @generated
	 * @ordered
	 */
	protected SelectManyOptions selectManyOption = SELECT_MANY_OPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenUnitAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_UNIT_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenContentUnit> getGenUnits() {
		if (genUnits == null) {
			genUnits = new EObjectContainmentWithInverseEList<GenContentUnit>(GenContentUnit.class, this, GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_UNITS, GenJsfPackage.GEN_CONTENT_UNIT__GEN_DISPLAYED_ON);
		}
		return genUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAssociation getJsfFeature() {
		if (jsfFeature != null && jsfFeature.eIsProxy()) {
			InternalEObject oldJsfFeature = (InternalEObject)jsfFeature;
			jsfFeature = (UnitAssociation)eResolveProxy(oldJsfFeature);
			if (jsfFeature != oldJsfFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_UNIT_ASSOCIATION__JSF_FEATURE, oldJsfFeature, jsfFeature));
			}
		}
		return jsfFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAssociation basicGetJsfFeature() {
		return jsfFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfFeature(UnitAssociation newJsfFeature) {
		UnitAssociation oldJsfFeature = jsfFeature;
		jsfFeature = newJsfFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_ASSOCIATION__JSF_FEATURE, oldJsfFeature, jsfFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceAssociation getGenServiceFeature() {
		if (genServiceFeature != null && genServiceFeature.eIsProxy()) {
			InternalEObject oldGenServiceFeature = (InternalEObject)genServiceFeature;
			genServiceFeature = (GenServiceAssociation)eResolveProxy(oldGenServiceFeature);
			if (genServiceFeature != oldGenServiceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_SERVICE_FEATURE, oldGenServiceFeature, genServiceFeature));
			}
		}
		return genServiceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceAssociation basicGetGenServiceFeature() {
		return genServiceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenServiceFeature(GenServiceAssociation newGenServiceFeature) {
		GenServiceAssociation oldGenServiceFeature = genServiceFeature;
		genServiceFeature = newGenServiceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_SERVICE_FEATURE, oldGenServiceFeature, genServiceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitChildFeature getGenChildFeature() {
		return genChildFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenChildFeature(GenUnitChildFeature newGenChildFeature, NotificationChain msgs) {
		GenUnitChildFeature oldGenChildFeature = genChildFeature;
		genChildFeature = newGenChildFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE, oldGenChildFeature, newGenChildFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenChildFeature(GenUnitChildFeature newGenChildFeature) {
		if (newGenChildFeature != genChildFeature) {
			NotificationChain msgs = null;
			if (genChildFeature != null)
				msgs = ((InternalEObject)genChildFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE, null, msgs);
			if (newGenChildFeature != null)
				msgs = ((InternalEObject)newGenChildFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE, null, msgs);
			msgs = basicSetGenChildFeature(newGenChildFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE, newGenChildFeature, newGenChildFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSelection getGenSelection() {
		if (genSelection != null && genSelection.eIsProxy()) {
			InternalEObject oldGenSelection = (InternalEObject)genSelection;
			genSelection = (GenSelection)eResolveProxy(oldGenSelection);
			if (genSelection != oldGenSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_SELECTION, oldGenSelection, genSelection));
			}
		}
		return genSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSelection basicGetGenSelection() {
		return genSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenSelection(GenSelection newGenSelection) {
		GenSelection oldGenSelection = genSelection;
		genSelection = newGenSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_SELECTION, oldGenSelection, genSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModelLabel getGenDynamicLabel() {
		if (genDynamicLabel != null && genDynamicLabel.eIsProxy()) {
			InternalEObject oldGenDynamicLabel = (InternalEObject)genDynamicLabel;
			genDynamicLabel = (GenModelLabel)eResolveProxy(oldGenDynamicLabel);
			if (genDynamicLabel != oldGenDynamicLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_DYNAMIC_LABEL, oldGenDynamicLabel, genDynamicLabel));
			}
		}
		return genDynamicLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModelLabel basicGetGenDynamicLabel() {
		return genDynamicLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenDynamicLabel(GenModelLabel newGenDynamicLabel) {
		GenModelLabel oldGenDynamicLabel = genDynamicLabel;
		genDynamicLabel = newGenDynamicLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_DYNAMIC_LABEL, oldGenDynamicLabel, genDynamicLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectOneofOptions getSelectOneOfOption() {
		return selectOneOfOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectOneOfOption(SelectOneofOptions newSelectOneOfOption) {
		SelectOneofOptions oldSelectOneOfOption = selectOneOfOption;
		selectOneOfOption = newSelectOneOfOption == null ? SELECT_ONE_OF_OPTION_EDEFAULT : newSelectOneOfOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_ASSOCIATION__SELECT_ONE_OF_OPTION, oldSelectOneOfOption, selectOneOfOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectManyOptions getSelectManyOption() {
		return selectManyOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectManyOption(SelectManyOptions newSelectManyOption) {
		SelectManyOptions oldSelectManyOption = selectManyOption;
		selectManyOption = newSelectManyOption == null ? SELECT_MANY_OPTION_EDEFAULT : newSelectManyOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_UNIT_ASSOCIATION__SELECT_MANY_OPTION, oldSelectManyOption, selectManyOption));
	}

	/**
	 * @generated NOT
	 */
	public void reconcile(final GenUnitField oldGenField) {
		super.reconcile(oldGenField);

		if (oldGenField instanceof GenUnitAssociation) {
			final GenUnitAssociation oldGenAssociation = (GenUnitAssociation) oldGenField;
			final Map<String, GenContentUnit> oldUnits = new HashMap<String, GenContentUnit>();
			for (GenContentUnit oldUnit : oldGenAssociation.getGenUnits()) {
				oldUnits.put(oldUnit.getName(), oldUnit);
			}
			for (GenContentUnit newUnit : getGenUnits()) {
				final String name = newUnit.getName();
				if (oldUnits.containsKey(name)) {
					newUnit.reconcile(oldUnits.get(name));
				}
			}
		}
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenUnits()).basicAdd(otherEnd, msgs);
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
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_UNITS:
				return ((InternalEList<?>)getGenUnits()).basicRemove(otherEnd, msgs);
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE:
				return basicSetGenChildFeature(null, msgs);
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
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_UNITS:
				return getGenUnits();
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__JSF_FEATURE:
				if (resolve) return getJsfFeature();
				return basicGetJsfFeature();
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_SERVICE_FEATURE:
				if (resolve) return getGenServiceFeature();
				return basicGetGenServiceFeature();
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE:
				return getGenChildFeature();
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_SELECTION:
				if (resolve) return getGenSelection();
				return basicGetGenSelection();
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_DYNAMIC_LABEL:
				if (resolve) return getGenDynamicLabel();
				return basicGetGenDynamicLabel();
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__SELECT_ONE_OF_OPTION:
				return getSelectOneOfOption();
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__SELECT_MANY_OPTION:
				return getSelectManyOption();
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
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_UNITS:
				getGenUnits().clear();
				getGenUnits().addAll((Collection<? extends GenContentUnit>)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__JSF_FEATURE:
				setJsfFeature((UnitAssociation)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_SERVICE_FEATURE:
				setGenServiceFeature((GenServiceAssociation)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE:
				setGenChildFeature((GenUnitChildFeature)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_SELECTION:
				setGenSelection((GenSelection)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_DYNAMIC_LABEL:
				setGenDynamicLabel((GenModelLabel)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__SELECT_ONE_OF_OPTION:
				setSelectOneOfOption((SelectOneofOptions)newValue);
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__SELECT_MANY_OPTION:
				setSelectManyOption((SelectManyOptions)newValue);
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
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_UNITS:
				getGenUnits().clear();
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__JSF_FEATURE:
				setJsfFeature((UnitAssociation)null);
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_SERVICE_FEATURE:
				setGenServiceFeature((GenServiceAssociation)null);
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE:
				setGenChildFeature((GenUnitChildFeature)null);
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_SELECTION:
				setGenSelection((GenSelection)null);
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_DYNAMIC_LABEL:
				setGenDynamicLabel((GenModelLabel)null);
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__SELECT_ONE_OF_OPTION:
				setSelectOneOfOption(SELECT_ONE_OF_OPTION_EDEFAULT);
				return;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__SELECT_MANY_OPTION:
				setSelectManyOption(SELECT_MANY_OPTION_EDEFAULT);
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
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_UNITS:
				return genUnits != null && !genUnits.isEmpty();
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__JSF_FEATURE:
				return jsfFeature != null;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_SERVICE_FEATURE:
				return genServiceFeature != null;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE:
				return genChildFeature != null;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_SELECTION:
				return genSelection != null;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_DYNAMIC_LABEL:
				return genDynamicLabel != null;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__SELECT_ONE_OF_OPTION:
				return selectOneOfOption != SELECT_ONE_OF_OPTION_EDEFAULT;
			case GenJsfPackage.GEN_UNIT_ASSOCIATION__SELECT_MANY_OPTION:
				return selectManyOption != SELECT_MANY_OPTION_EDEFAULT;
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
		if (baseClass == GenIncludedAssociation.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GenUnitContainer.class) {
			switch (derivedFeatureID) {
				case GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_UNITS: return GenJsfPackage.GEN_UNIT_CONTAINER__GEN_UNITS;
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
		if (baseClass == GenIncludedAssociation.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GenUnitContainer.class) {
			switch (baseFeatureID) {
				case GenJsfPackage.GEN_UNIT_CONTAINER__GEN_UNITS: return GenJsfPackage.GEN_UNIT_ASSOCIATION__GEN_UNITS;
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
		result.append(" (selectOneOfOption: ");
		result.append(selectOneOfOption);
		result.append(", selectManyOption: ");
		result.append(selectManyOption);
		result.append(')');
		return result.toString();
	}

} //GenUnitAssociationImpl
