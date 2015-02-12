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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.gencriteria.GenOrder;
import uk.ac.man.cs.mdsd.gencriteria.GenPredicate;

import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenSelection;

import uk.ac.man.cs.mdsd.genjsf.GenServiceAssociation;
import uk.ac.man.cs.mdsd.jsf.Selection;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenSelectionImpl#getJsfSelection <em>Jsf Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenSelectionImpl#getGenJoins <em>Gen Joins</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenSelectionImpl#getGenFilter <em>Gen Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenSelectionImpl#getGenOrdering <em>Gen Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenSelectionImpl extends NamedElementImpl implements GenSelection {
	/**
	 * The cached value of the '{@link #getJsfSelection() <em>Jsf Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsfSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection jsfSelection;

	/**
	 * The cached value of the '{@link #getGenJoins() <em>Gen Joins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenJoins()
	 * @generated
	 * @ordered
	 */
	protected EList<GenServiceAssociation> genJoins;

	/**
	 * The cached value of the '{@link #getGenFilter() <em>Gen Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenFilter()
	 * @generated
	 * @ordered
	 */
	protected GenPredicate genFilter;

	/**
	 * The cached value of the '{@link #getGenOrdering() <em>Gen Ordering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenOrdering()
	 * @generated
	 * @ordered
	 */
	protected EList<GenOrder> genOrdering;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getJsfSelection() {
		if (jsfSelection != null && jsfSelection.eIsProxy()) {
			InternalEObject oldJsfSelection = (InternalEObject)jsfSelection;
			jsfSelection = (Selection)eResolveProxy(oldJsfSelection);
			if (jsfSelection != oldJsfSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenJsfPackage.GEN_SELECTION__JSF_SELECTION, oldJsfSelection, jsfSelection));
			}
		}
		return jsfSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetJsfSelection() {
		return jsfSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsfSelection(Selection newJsfSelection) {
		Selection oldJsfSelection = jsfSelection;
		jsfSelection = newJsfSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SELECTION__JSF_SELECTION, oldJsfSelection, jsfSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenServiceAssociation> getGenJoins() {
		if (genJoins == null) {
			genJoins = new EObjectResolvingEList<GenServiceAssociation>(GenServiceAssociation.class, this, GenJsfPackage.GEN_SELECTION__GEN_JOINS);
		}
		return genJoins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPredicate getGenFilter() {
		return genFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenFilter(GenPredicate newGenFilter, NotificationChain msgs) {
		GenPredicate oldGenFilter = genFilter;
		genFilter = newGenFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SELECTION__GEN_FILTER, oldGenFilter, newGenFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenFilter(GenPredicate newGenFilter) {
		if (newGenFilter != genFilter) {
			NotificationChain msgs = null;
			if (genFilter != null)
				msgs = ((InternalEObject)genFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_SELECTION__GEN_FILTER, null, msgs);
			if (newGenFilter != null)
				msgs = ((InternalEObject)newGenFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenJsfPackage.GEN_SELECTION__GEN_FILTER, null, msgs);
			msgs = basicSetGenFilter(newGenFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenJsfPackage.GEN_SELECTION__GEN_FILTER, newGenFilter, newGenFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenOrder> getGenOrdering() {
		if (genOrdering == null) {
			genOrdering = new EObjectContainmentEList<GenOrder>(GenOrder.class, this, GenJsfPackage.GEN_SELECTION__GEN_ORDERING);
		}
		return genOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenJsfPackage.GEN_SELECTION__GEN_FILTER:
				return basicSetGenFilter(null, msgs);
			case GenJsfPackage.GEN_SELECTION__GEN_ORDERING:
				return ((InternalEList<?>)getGenOrdering()).basicRemove(otherEnd, msgs);
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
			case GenJsfPackage.GEN_SELECTION__JSF_SELECTION:
				if (resolve) return getJsfSelection();
				return basicGetJsfSelection();
			case GenJsfPackage.GEN_SELECTION__GEN_JOINS:
				return getGenJoins();
			case GenJsfPackage.GEN_SELECTION__GEN_FILTER:
				return getGenFilter();
			case GenJsfPackage.GEN_SELECTION__GEN_ORDERING:
				return getGenOrdering();
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
			case GenJsfPackage.GEN_SELECTION__JSF_SELECTION:
				setJsfSelection((Selection)newValue);
				return;
			case GenJsfPackage.GEN_SELECTION__GEN_JOINS:
				getGenJoins().clear();
				getGenJoins().addAll((Collection<? extends GenServiceAssociation>)newValue);
				return;
			case GenJsfPackage.GEN_SELECTION__GEN_FILTER:
				setGenFilter((GenPredicate)newValue);
				return;
			case GenJsfPackage.GEN_SELECTION__GEN_ORDERING:
				getGenOrdering().clear();
				getGenOrdering().addAll((Collection<? extends GenOrder>)newValue);
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
			case GenJsfPackage.GEN_SELECTION__JSF_SELECTION:
				setJsfSelection((Selection)null);
				return;
			case GenJsfPackage.GEN_SELECTION__GEN_JOINS:
				getGenJoins().clear();
				return;
			case GenJsfPackage.GEN_SELECTION__GEN_FILTER:
				setGenFilter((GenPredicate)null);
				return;
			case GenJsfPackage.GEN_SELECTION__GEN_ORDERING:
				getGenOrdering().clear();
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
			case GenJsfPackage.GEN_SELECTION__JSF_SELECTION:
				return jsfSelection != null;
			case GenJsfPackage.GEN_SELECTION__GEN_JOINS:
				return genJoins != null && !genJoins.isEmpty();
			case GenJsfPackage.GEN_SELECTION__GEN_FILTER:
				return genFilter != null;
			case GenJsfPackage.GEN_SELECTION__GEN_ORDERING:
				return genOrdering != null && !genOrdering.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenSelectionImpl
