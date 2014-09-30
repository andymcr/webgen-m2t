/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenContentUnit.java,v 1.15 2014/01/25 17:38:19 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.orm.NamedElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Content Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenContentUnit#getGenDisplayedOn <em>Gen Displayed On</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenContentUnit()
 * @model abstract="true"
 * @generated
 */
public interface GenContentUnit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Gen Displayed On</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitContainer#getGenUnits <em>Gen Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Displayed On</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Displayed On</em>' container reference.
	 * @see #setGenDisplayedOn(GenUnitContainer)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenContentUnit_GenDisplayedOn()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitContainer#getGenUnits
	 * @model opposite="genUnits" transient="false"
	 * @generated
	 */
	GenUnitContainer getGenDisplayedOn();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenContentUnit#getGenDisplayedOn <em>Gen Displayed On</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Displayed On</em>' container reference.
	 * @see #getGenDisplayedOn()
	 * @generated
	 */
	void setGenDisplayedOn(GenUnitContainer value);

	/**
	 * @generated NOT
	 */
	String getName();

	/**
	 * @generated NOT
	 */
	public void reconcile(final GenContentUnit oldGenContentUnit);
} // GenContentUnit
