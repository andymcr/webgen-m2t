/**
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenUnitContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Unit Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.impl.GenUnitContainerImpl#getGenUnits <em>Gen Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenUnitContainerImpl extends EObjectImpl implements GenUnitContainer {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenUnitContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenJsfPackage.Literals.GEN_UNIT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenContentUnit> getGenUnits() {
		if (genUnits == null) {
			genUnits = new EObjectContainmentWithInverseEList<GenContentUnit>(GenContentUnit.class, this, GenJsfPackage.GEN_UNIT_CONTAINER__GEN_UNITS, GenJsfPackage.GEN_CONTENT_UNIT__GEN_DISPLAYED_ON);
		}
		return genUnits;
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
			case GenJsfPackage.GEN_UNIT_CONTAINER__GEN_UNITS:
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
			case GenJsfPackage.GEN_UNIT_CONTAINER__GEN_UNITS:
				return ((InternalEList<?>)getGenUnits()).basicRemove(otherEnd, msgs);
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
			case GenJsfPackage.GEN_UNIT_CONTAINER__GEN_UNITS:
				return getGenUnits();
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
			case GenJsfPackage.GEN_UNIT_CONTAINER__GEN_UNITS:
				getGenUnits().clear();
				getGenUnits().addAll((Collection<? extends GenContentUnit>)newValue);
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
			case GenJsfPackage.GEN_UNIT_CONTAINER__GEN_UNITS:
				getGenUnits().clear();
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
			case GenJsfPackage.GEN_UNIT_CONTAINER__GEN_UNITS:
				return genUnits != null && !genUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenUnitContainerImpl
