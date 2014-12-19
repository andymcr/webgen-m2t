/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.genorm.GenAttribute;
import uk.ac.man.cs.mdsd.jsf.ServiceEntityElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Service Entity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement#getJsfFeature <em>Jsf Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement#getGenFeature <em>Gen Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenServiceEntityElement()
 * @model
 * @generated
 */
public interface GenServiceEntityElement extends GenServiceEntityFeature, GenIncludedElement, GenUnitTitle {

	/**
	 * Returns the value of the '<em><b>Jsf Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Feature</em>' reference.
	 * @see #setJsfFeature(ServiceEntityElement)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenServiceEntityElement_JsfFeature()
	 * @model required="true"
	 * @generated
	 */
	ServiceEntityElement getJsfFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement#getJsfFeature <em>Jsf Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Feature</em>' reference.
	 * @see #getJsfFeature()
	 * @generated
	 */
	void setJsfFeature(ServiceEntityElement value);

	/**
	 * Returns the value of the '<em><b>Gen Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Feature</em>' reference.
	 * @see #setGenFeature(GenAttribute)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenServiceEntityElement_GenFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenAttribute getGenFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement#getGenFeature <em>Gen Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Feature</em>' reference.
	 * @see #getGenFeature()
	 * @generated
	 */
	void setGenFeature(GenAttribute value);
} // GenServiceEntityElement
