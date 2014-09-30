/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenPageImpl.java,v 1.15 2014/01/25 17:38:18 andy Exp $
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfModel;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenMenu;
import uk.ac.man.cs.mdsd.genjsf.GenPage;
import uk.ac.man.cs.mdsd.genjsf.GenUnitContainer;
import uk.ac.man.cs.mdsd.jsf.Page;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenPageImpl#getGenUnits <em>Gen Units</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenPageImpl#getGenPartOf <em>Gen Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenPageImpl#getJsfPage <em>Jsf Page</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenPageImpl#getGenParentPage <em>Gen Parent Page</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenPageImpl#getGenChildPages <em>Gen Child Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenPageImpl#getGenSideMenu <em>Gen Side Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenPageImpl extends NamedElementImpl implements GenPage {
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
	 * The cached value of the '{@link #getJsfPage() <em>Jsf Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfPage()
	 * @generated
	 * @ordered
	 */
	protected Page jsfPage;

	/**
	 * The cached value of the '{@link #getGenParentPage() <em>Gen Parent Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenParentPage()
	 * @generated
	 * @ordered
	 */
	protected GenPage genParentPage;

	/**
	 * The cached value of the '{@link #getGenChildPages() <em>Gen Child Pages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenChildPages()
	 * @generated
	 * @ordered
	 */
	protected EList<GenPage> genChildPages;

	/**
	 * The cached value of the '{@link #getGenSideMenu() <em>Gen Side Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenSideMenu()
	 * @generated
	 * @ordered
	 */
	protected GenMenu genSideMenu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenContentUnit> getGenUnits() {
		if (genUnits == null) {
			genUnits = new EObjectContainmentWithInverseEList<GenContentUnit>(GenContentUnit.class, this, GenJsfPackage.GEN_PAGE__GEN_UNITS, GenJsfPackage.GEN_CONTENT_UNIT__GEN_DISPLAYED_ON);
		}
		return genUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getJsfPage() {
		if (jsfPage != null && jsfPage.eIsProxy()) {
			InternalEObject oldJsfPage = (InternalEObject)jsfPage;
			jsfPage = (Page)eResolveProxy(oldJsfPage);
			if (jsfPage != oldJsfPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_PAGE__JSF_PAGE, oldJsfPage, jsfPage));
			}
		}
		return jsfPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetJsfPage() {
		return jsfPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfPage(Page newJsfPage) {
		Page oldJsfPage = jsfPage;
		jsfPage = newJsfPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_PAGE__JSF_PAGE, oldJsfPage, jsfPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenJsfModel getGenPartOf() {
		if (eContainerFeatureID() != GenJsfPackage.GEN_PAGE__GEN_PART_OF) return null;
		return (GenJsfModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenPartOf(GenJsfModel newGenPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenPartOf, GenJsfPackage.GEN_PAGE__GEN_PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenPartOf(GenJsfModel newGenPartOf) {
		if (newGenPartOf != eInternalContainer() || (eContainerFeatureID() != GenJsfPackage.GEN_PAGE__GEN_PART_OF && newGenPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newGenPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenPartOf != null)
				msgs = ((InternalEObject)newGenPartOf).eInverseAdd(this, GenJsfPackage.GEN_JSF_MODEL__GEN_PAGES, GenJsfModel.class, msgs);
			msgs = basicSetGenPartOf(newGenPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_PAGE__GEN_PART_OF, newGenPartOf, newGenPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPage getGenParentPage() {
		if (genParentPage != null && genParentPage.eIsProxy()) {
			InternalEObject oldGenParentPage = (InternalEObject)genParentPage;
			genParentPage = (GenPage)eResolveProxy(oldGenParentPage);
			if (genParentPage != oldGenParentPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_PAGE__GEN_PARENT_PAGE, oldGenParentPage, genParentPage));
			}
		}
		return genParentPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPage basicGetGenParentPage() {
		return genParentPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenParentPage(GenPage newGenParentPage, NotificationChain msgs) {
		GenPage oldGenParentPage = genParentPage;
		genParentPage = newGenParentPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_PAGE__GEN_PARENT_PAGE, oldGenParentPage, newGenParentPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenParentPage(GenPage newGenParentPage) {
		if (newGenParentPage != genParentPage) {
			NotificationChain msgs = null;
			if (genParentPage != null)
				msgs = ((InternalEObject)genParentPage).eInverseRemove(this, GenJsfPackage.GEN_PAGE__GEN_CHILD_PAGES, GenPage.class, msgs);
			if (newGenParentPage != null)
				msgs = ((InternalEObject)newGenParentPage).eInverseAdd(this, GenJsfPackage.GEN_PAGE__GEN_CHILD_PAGES, GenPage.class, msgs);
			msgs = basicSetGenParentPage(newGenParentPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_PAGE__GEN_PARENT_PAGE, newGenParentPage, newGenParentPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenPage> getGenChildPages() {
		if (genChildPages == null) {
			genChildPages = new EObjectWithInverseResolvingEList<GenPage>(GenPage.class, this, GenJsfPackage.GEN_PAGE__GEN_CHILD_PAGES, GenJsfPackage.GEN_PAGE__GEN_PARENT_PAGE);
		}
		return genChildPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenMenu getGenSideMenu() {
		if (genSideMenu != null && genSideMenu.eIsProxy()) {
			InternalEObject oldGenSideMenu = (InternalEObject)genSideMenu;
			genSideMenu = (GenMenu)eResolveProxy(oldGenSideMenu);
			if (genSideMenu != oldGenSideMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_PAGE__GEN_SIDE_MENU, oldGenSideMenu, genSideMenu));
			}
		}
		return genSideMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenMenu basicGetGenSideMenu() {
		return genSideMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenSideMenu(GenMenu newGenSideMenu) {
		GenMenu oldGenSideMenu = genSideMenu;
		genSideMenu = newGenSideMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_PAGE__GEN_SIDE_MENU, oldGenSideMenu, genSideMenu));
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
			case GenJsfPackage.GEN_PAGE__GEN_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenUnits()).basicAdd(otherEnd, msgs);
			case GenJsfPackage.GEN_PAGE__GEN_PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenPartOf((GenJsfModel)otherEnd, msgs);
			case GenJsfPackage.GEN_PAGE__GEN_PARENT_PAGE:
				if (genParentPage != null)
					msgs = ((InternalEObject)genParentPage).eInverseRemove(this, GenJsfPackage.GEN_PAGE__GEN_CHILD_PAGES, GenPage.class, msgs);
				return basicSetGenParentPage((GenPage)otherEnd, msgs);
			case GenJsfPackage.GEN_PAGE__GEN_CHILD_PAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenChildPages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	public void reconcile(final GenPage oldGenPage) {
		final Map<String, GenContentUnit> oldUnits = new HashMap<String, GenContentUnit>();
		for (GenContentUnit oldUnit : oldGenPage.getGenUnits()) {
			oldUnits.put(oldUnit.getName(), oldUnit);
		}
		for (GenContentUnit newUnit : getGenUnits()) {
			final String name = newUnit.getName();
			if (oldUnits.containsKey(name)) {
				newUnit.reconcile(oldUnits.get(name));
			}
		}

		reconcileSettings(oldGenPage);
	}

	protected void reconcileSettings(final GenPage oldGenPage) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_PAGE__GEN_UNITS:
				return ((InternalEList<?>)getGenUnits()).basicRemove(otherEnd, msgs);
			case GenJsfPackage.GEN_PAGE__GEN_PART_OF:
				return basicSetGenPartOf(null, msgs);
			case GenJsfPackage.GEN_PAGE__GEN_PARENT_PAGE:
				return basicSetGenParentPage(null, msgs);
			case GenJsfPackage.GEN_PAGE__GEN_CHILD_PAGES:
				return ((InternalEList<?>)getGenChildPages()).basicRemove(otherEnd, msgs);
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
			case GenJsfPackage.GEN_PAGE__GEN_PART_OF:
				return eInternalContainer().eInverseRemove(this, GenJsfPackage.GEN_JSF_MODEL__GEN_PAGES, GenJsfModel.class, msgs);
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
			case GenJsfPackage.GEN_PAGE__GEN_UNITS:
				return getGenUnits();
			case GenJsfPackage.GEN_PAGE__GEN_PART_OF:
				return getGenPartOf();
			case GenJsfPackage.GEN_PAGE__JSF_PAGE:
				if (resolve) return getJsfPage();
				return basicGetJsfPage();
			case GenJsfPackage.GEN_PAGE__GEN_PARENT_PAGE:
				if (resolve) return getGenParentPage();
				return basicGetGenParentPage();
			case GenJsfPackage.GEN_PAGE__GEN_CHILD_PAGES:
				return getGenChildPages();
			case GenJsfPackage.GEN_PAGE__GEN_SIDE_MENU:
				if (resolve) return getGenSideMenu();
				return basicGetGenSideMenu();
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
			case GenJsfPackage.GEN_PAGE__GEN_UNITS:
				getGenUnits().clear();
				getGenUnits().addAll((Collection<? extends GenContentUnit>)newValue);
				return;
			case GenJsfPackage.GEN_PAGE__GEN_PART_OF:
				setGenPartOf((GenJsfModel)newValue);
				return;
			case GenJsfPackage.GEN_PAGE__JSF_PAGE:
				setJsfPage((Page)newValue);
				return;
			case GenJsfPackage.GEN_PAGE__GEN_PARENT_PAGE:
				setGenParentPage((GenPage)newValue);
				return;
			case GenJsfPackage.GEN_PAGE__GEN_CHILD_PAGES:
				getGenChildPages().clear();
				getGenChildPages().addAll((Collection<? extends GenPage>)newValue);
				return;
			case GenJsfPackage.GEN_PAGE__GEN_SIDE_MENU:
				setGenSideMenu((GenMenu)newValue);
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
			case GenJsfPackage.GEN_PAGE__GEN_UNITS:
				getGenUnits().clear();
				return;
			case GenJsfPackage.GEN_PAGE__GEN_PART_OF:
				setGenPartOf((GenJsfModel)null);
				return;
			case GenJsfPackage.GEN_PAGE__JSF_PAGE:
				setJsfPage((Page)null);
				return;
			case GenJsfPackage.GEN_PAGE__GEN_PARENT_PAGE:
				setGenParentPage((GenPage)null);
				return;
			case GenJsfPackage.GEN_PAGE__GEN_CHILD_PAGES:
				getGenChildPages().clear();
				return;
			case GenJsfPackage.GEN_PAGE__GEN_SIDE_MENU:
				setGenSideMenu((GenMenu)null);
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
			case GenJsfPackage.GEN_PAGE__GEN_UNITS:
				return genUnits != null && !genUnits.isEmpty();
			case GenJsfPackage.GEN_PAGE__GEN_PART_OF:
				return getGenPartOf() != null;
			case GenJsfPackage.GEN_PAGE__JSF_PAGE:
				return jsfPage != null;
			case GenJsfPackage.GEN_PAGE__GEN_PARENT_PAGE:
				return genParentPage != null;
			case GenJsfPackage.GEN_PAGE__GEN_CHILD_PAGES:
				return genChildPages != null && !genChildPages.isEmpty();
			case GenJsfPackage.GEN_PAGE__GEN_SIDE_MENU:
				return genSideMenu != null;
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
		if (baseClass == GenUnitContainer.class) {
			switch (derivedFeatureID) {
				case GenJsfPackage.GEN_PAGE__GEN_UNITS: return GenJsfPackage.GEN_UNIT_CONTAINER__GEN_UNITS;
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
		if (baseClass == GenUnitContainer.class) {
			switch (baseFeatureID) {
				case GenJsfPackage.GEN_UNIT_CONTAINER__GEN_UNITS: return GenJsfPackage.GEN_PAGE__GEN_UNITS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GenPageImpl
