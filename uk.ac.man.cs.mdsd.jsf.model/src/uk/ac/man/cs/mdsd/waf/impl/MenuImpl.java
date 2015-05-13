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
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.orm.impl.NamedDisplayElementImpl;
import uk.ac.man.cs.mdsd.waf.WafPackage;
import uk.ac.man.cs.mdsd.waf.Menu;
import uk.ac.man.cs.mdsd.waf.MenuEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.MenuImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.MenuImpl#isOmitCaption <em>Omit Caption</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.MenuImpl#getCaptionClass <em>Caption Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.MenuImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.MenuImpl#getLayoutClass <em>Layout Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MenuImpl extends NamedDisplayElementImpl implements Menu {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<MenuEntry> entries;

	/**
	 * The default value of the '{@link #isOmitCaption() <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitCaption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMIT_CAPTION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isOmitCaption() <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitCaption()
	 * @generated
	 * @ordered
	 */
	protected boolean omitCaption = OMIT_CAPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getCaptionClass() <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCaptionClass() <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionClass()
	 * @generated
	 * @ordered
	 */
	protected String captionClass = CAPTION_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected String styleClass = STYLE_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getLayoutClass() <em>Layout Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLayoutClass() <em>Layout Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutClass()
	 * @generated
	 * @ordered
	 */
	protected String layoutClass = LAYOUT_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MenuEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentWithInverseEList<MenuEntry>(MenuEntry.class, this, WafPackage.MENU__ENTRIES, WafPackage.MENU_ENTRY__PART_OF);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOmitCaption() {
		return omitCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmitCaption(boolean newOmitCaption) {
		boolean oldOmitCaption = omitCaption;
		omitCaption = newOmitCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.MENU__OMIT_CAPTION, oldOmitCaption, omitCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptionClass() {
		return captionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionClass(String newCaptionClass) {
		String oldCaptionClass = captionClass;
		captionClass = newCaptionClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.MENU__CAPTION_CLASS, oldCaptionClass, captionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleClass() {
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleClass(String newStyleClass) {
		String oldStyleClass = styleClass;
		styleClass = newStyleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.MENU__STYLE_CLASS, oldStyleClass, styleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayoutClass() {
		return layoutClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutClass(String newLayoutClass) {
		String oldLayoutClass = layoutClass;
		layoutClass = newLayoutClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.MENU__LAYOUT_CLASS, oldLayoutClass, layoutClass));
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
			case WafPackage.MENU__ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntries()).basicAdd(otherEnd, msgs);
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
			case WafPackage.MENU__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case WafPackage.MENU__ENTRIES:
				return getEntries();
			case WafPackage.MENU__OMIT_CAPTION:
				return isOmitCaption();
			case WafPackage.MENU__CAPTION_CLASS:
				return getCaptionClass();
			case WafPackage.MENU__STYLE_CLASS:
				return getStyleClass();
			case WafPackage.MENU__LAYOUT_CLASS:
				return getLayoutClass();
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
			case WafPackage.MENU__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends MenuEntry>)newValue);
				return;
			case WafPackage.MENU__OMIT_CAPTION:
				setOmitCaption((Boolean)newValue);
				return;
			case WafPackage.MENU__CAPTION_CLASS:
				setCaptionClass((String)newValue);
				return;
			case WafPackage.MENU__STYLE_CLASS:
				setStyleClass((String)newValue);
				return;
			case WafPackage.MENU__LAYOUT_CLASS:
				setLayoutClass((String)newValue);
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
			case WafPackage.MENU__ENTRIES:
				getEntries().clear();
				return;
			case WafPackage.MENU__OMIT_CAPTION:
				setOmitCaption(OMIT_CAPTION_EDEFAULT);
				return;
			case WafPackage.MENU__CAPTION_CLASS:
				setCaptionClass(CAPTION_CLASS_EDEFAULT);
				return;
			case WafPackage.MENU__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
				return;
			case WafPackage.MENU__LAYOUT_CLASS:
				setLayoutClass(LAYOUT_CLASS_EDEFAULT);
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
			case WafPackage.MENU__ENTRIES:
				return entries != null && !entries.isEmpty();
			case WafPackage.MENU__OMIT_CAPTION:
				return omitCaption != OMIT_CAPTION_EDEFAULT;
			case WafPackage.MENU__CAPTION_CLASS:
				return CAPTION_CLASS_EDEFAULT == null ? captionClass != null : !CAPTION_CLASS_EDEFAULT.equals(captionClass);
			case WafPackage.MENU__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
			case WafPackage.MENU__LAYOUT_CLASS:
				return LAYOUT_CLASS_EDEFAULT == null ? layoutClass != null : !LAYOUT_CLASS_EDEFAULT.equals(layoutClass);
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
		result.append(" (omitCaption: ");
		result.append(omitCaption);
		result.append(", captionClass: ");
		result.append(captionClass);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(", layoutClass: ");
		result.append(layoutClass);
		result.append(')');
		return result.toString();
	}

} //MenuImpl
