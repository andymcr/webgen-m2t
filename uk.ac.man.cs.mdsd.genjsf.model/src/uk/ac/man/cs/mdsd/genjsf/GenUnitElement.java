/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.UnitElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Unit Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitElement#getJsfFeature <em>Jsf Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitElement#getGenServiceFeature <em>Gen Service Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitElement()
 * @model
 * @generated
 */
public interface GenUnitElement extends GenUnitFeature, GenIncludedElement {

	/**
	 * Returns the value of the '<em><b>Jsf Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Feature</em>' reference.
	 * @see #setJsfFeature(UnitElement)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitElement_JsfFeature()
	 * @model required="true"
	 * @generated
	 */
	UnitElement getJsfFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitElement#getJsfFeature <em>Jsf Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Feature</em>' reference.
	 * @see #getJsfFeature()
	 * @generated
	 */
	void setJsfFeature(UnitElement value);

	/**
	 * Returns the value of the '<em><b>Gen Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Service Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Service Feature</em>' reference.
	 * @see #setGenServiceFeature(GenServiceEntityElement)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitElement_GenServiceFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenServiceEntityElement getGenServiceFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitElement#getGenServiceFeature <em>Gen Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Service Feature</em>' reference.
	 * @see #getGenServiceFeature()
	 * @generated
	 */
	void setGenServiceFeature(GenServiceEntityElement value);
} // GenUnitElement
