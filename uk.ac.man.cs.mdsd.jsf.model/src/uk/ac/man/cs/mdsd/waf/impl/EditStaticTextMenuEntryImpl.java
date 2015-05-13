/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;
import uk.ac.man.cs.mdsd.orm.NamedElement;
import uk.ac.man.cs.mdsd.orm.OrmPackage;
import uk.ac.man.cs.mdsd.waf.EditStaticTextMenuEntry;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edit Static Text Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.EditStaticTextMenuEntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.EditStaticTextMenuEntryImpl#getDisplayLabel <em>Display Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EditStaticTextMenuEntryImpl extends MenuEntryImpl implements EditStaticTextMenuEntry {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditStaticTextMenuEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.EDIT_STATIC_TEXT_MENU_ENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL, oldDisplayLabel, displayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__NAME:
				return getName();
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL:
				return getDisplayLabel();
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
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__NAME:
				setName((String)newValue);
				return;
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL:
				setDisplayLabel((String)newValue);
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
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL:
				setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
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
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL:
				return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
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
				case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__NAME: return OrmPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedDisplayElement.class) {
			switch (derivedFeatureID) {
				case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL: return OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;
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
				case OrmPackage.NAMED_ELEMENT__NAME: return WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedDisplayElement.class) {
			switch (baseFeatureID) {
				case OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL: return WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", displayLabel: ");
		result.append(displayLabel);
		result.append(')');
		return result.toString();
	}

} //EditStaticTextMenuEntryImpl
