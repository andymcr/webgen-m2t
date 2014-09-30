/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.ServiceAssociation;
import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Service View Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenServiceViewAssociation#getJsfTargetFeature <em>Jsf Target Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenServiceViewAssociation#getGenTargetFeature <em>Gen Target Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenServiceViewAssociation()
 * @model
 * @generated
 */
public interface GenServiceViewAssociation extends NamedElement, GenServiceAssociation {
	/**
	 * Returns the value of the '<em><b>Jsf Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Target Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Target Feature</em>' reference.
	 * @see #setJsfTargetFeature(ServiceAssociation)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenServiceViewAssociation_JsfTargetFeature()
	 * @model required="true"
	 * @generated
	 */
	ServiceAssociation getJsfTargetFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceViewAssociation#getJsfTargetFeature <em>Jsf Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Target Feature</em>' reference.
	 * @see #getJsfTargetFeature()
	 * @generated
	 */
	void setJsfTargetFeature(ServiceAssociation value);

	/**
	 * Returns the value of the '<em><b>Gen Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Target Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Target Feature</em>' reference.
	 * @see #setGenTargetFeature(GenServiceAssociation)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenServiceViewAssociation_GenTargetFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenServiceAssociation getGenTargetFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceViewAssociation#getGenTargetFeature <em>Gen Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Target Feature</em>' reference.
	 * @see #getGenTargetFeature()
	 * @generated
	 */
	void setGenTargetFeature(GenServiceAssociation value);

} // GenServiceViewAssociation
