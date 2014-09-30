/**
 */
package uk.ac.man.cs.mdsd.jsf;

import uk.ac.man.cs.mdsd.orm.SingletonAttribute;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Included Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.MenuIncludedElement#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.MenuIncludedElement#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getMenuIncludedElement()
 * @model
 * @generated
 */
public interface MenuIncludedElement extends MenuIncludedFeature {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getMenuIncludedElement_Name()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if feature.oclIsUndefined() then \'\' else feature.name endif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(SingletonAttribute)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getMenuIncludedElement_Feature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SingletonAttribute getFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.MenuIncludedElement#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(SingletonAttribute value);
} // MenuIncludedElement
