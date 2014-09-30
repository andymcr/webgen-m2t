/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.UnitChildElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Unit Child Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildElement#getJsfChildFeature <em>Jsf Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildElement#getGenServiceFeature <em>Gen Service Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitChildElement()
 * @model
 * @generated
 */
public interface GenUnitChildElement extends GenUnitChildFeature {
	/**
	 * Returns the value of the '<em><b>Jsf Child Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Child Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Child Feature</em>' reference.
	 * @see #setJsfChildFeature(UnitChildElement)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitChildElement_JsfChildFeature()
	 * @model required="true"
	 * @generated
	 */
	UnitChildElement getJsfChildFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildElement#getJsfChildFeature <em>Jsf Child Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Child Feature</em>' reference.
	 * @see #getJsfChildFeature()
	 * @generated
	 */
	void setJsfChildFeature(UnitChildElement value);

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
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitChildElement_GenServiceFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenServiceEntityElement getGenServiceFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildElement#getGenServiceFeature <em>Gen Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Service Feature</em>' reference.
	 * @see #getGenServiceFeature()
	 * @generated
	 */
	void setGenServiceFeature(GenServiceEntityElement value);

} // GenUnitChildElement
