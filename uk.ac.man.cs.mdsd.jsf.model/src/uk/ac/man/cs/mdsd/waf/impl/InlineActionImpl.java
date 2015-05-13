/**
 * <copyright>
 * </copyright>
 *
 * $Id: InlineActionImpl.java,v 1.5 2013/07/02 22:59:35 andy Exp $
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.orm.impl.NamedDisplayElementImpl;
import uk.ac.man.cs.mdsd.waf.InlineAction;
import uk.ac.man.cs.mdsd.waf.InlineActionContainer;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.InlineActionImpl#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.InlineActionImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.InlineActionImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.InlineActionImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.InlineActionImpl#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InlineActionImpl extends NamedDisplayElementImpl implements InlineAction {
	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected String header = HEADER_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InlineActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.INLINE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineActionContainer getUsedBy() {
		if (eContainerFeatureID() != WafPackage.INLINE_ACTION__USED_BY) return null;
		return (InlineActionContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedBy(InlineActionContainer newUsedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUsedBy, WafPackage.INLINE_ACTION__USED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedBy(InlineActionContainer newUsedBy) {
		if (newUsedBy != eInternalContainer() || (eContainerFeatureID() != WafPackage.INLINE_ACTION__USED_BY && newUsedBy != null)) {
			if (EcoreUtil.isAncestor(this, newUsedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUsedBy != null)
				msgs = ((InternalEObject)newUsedBy).eInverseAdd(this, WafPackage.INLINE_ACTION_CONTAINER__ACTIONS, InlineActionContainer.class, msgs);
			msgs = basicSetUsedBy(newUsedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.INLINE_ACTION__USED_BY, newUsedBy, newUsedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(String newHeader) {
		String oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.INLINE_ACTION__HEADER, oldHeader, header));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.INLINE_ACTION__FOOTER, oldFooter, footer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.INLINE_ACTION__HEADER_CLASS, oldHeaderClass, headerClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.INLINE_ACTION__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.INLINE_ACTION__USED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUsedBy((InlineActionContainer)otherEnd, msgs);
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
			case WafPackage.INLINE_ACTION__USED_BY:
				return basicSetUsedBy(null, msgs);
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
			case WafPackage.INLINE_ACTION__USED_BY:
				return eInternalContainer().eInverseRemove(this, WafPackage.INLINE_ACTION_CONTAINER__ACTIONS, InlineActionContainer.class, msgs);
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
			case WafPackage.INLINE_ACTION__USED_BY:
				return getUsedBy();
			case WafPackage.INLINE_ACTION__HEADER:
				return getHeader();
			case WafPackage.INLINE_ACTION__FOOTER:
				return getFooter();
			case WafPackage.INLINE_ACTION__HEADER_CLASS:
				return getHeaderClass();
			case WafPackage.INLINE_ACTION__FOOTER_CLASS:
				return getFooterClass();
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
			case WafPackage.INLINE_ACTION__USED_BY:
				setUsedBy((InlineActionContainer)newValue);
				return;
			case WafPackage.INLINE_ACTION__HEADER:
				setHeader((String)newValue);
				return;
			case WafPackage.INLINE_ACTION__FOOTER:
				setFooter((String)newValue);
				return;
			case WafPackage.INLINE_ACTION__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WafPackage.INLINE_ACTION__FOOTER_CLASS:
				setFooterClass((String)newValue);
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
			case WafPackage.INLINE_ACTION__USED_BY:
				setUsedBy((InlineActionContainer)null);
				return;
			case WafPackage.INLINE_ACTION__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case WafPackage.INLINE_ACTION__FOOTER:
				setFooter(FOOTER_EDEFAULT);
				return;
			case WafPackage.INLINE_ACTION__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WafPackage.INLINE_ACTION__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
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
			case WafPackage.INLINE_ACTION__USED_BY:
				return getUsedBy() != null;
			case WafPackage.INLINE_ACTION__HEADER:
				return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
			case WafPackage.INLINE_ACTION__FOOTER:
				return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
			case WafPackage.INLINE_ACTION__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WafPackage.INLINE_ACTION__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
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
		result.append(" (header: ");
		result.append(header);
		result.append(", footer: ");
		result.append(footer);
		result.append(", headerClass: ");
		result.append(headerClass);
		result.append(", footerClass: ");
		result.append(footerClass);
		result.append(')');
		return result.toString();
	}

} //InlineActionImpl
