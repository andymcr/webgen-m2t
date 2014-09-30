/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.genorm.GenAssociation;
import uk.ac.man.cs.mdsd.jsf.ServiceEntityAssociation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Service Entity Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityAssociation#getJsfFeature <em>Jsf Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityAssociation#getGenFeature <em>Gen Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenServiceEntityAssociation()
 * @model
 * @generated
 */
public interface GenServiceEntityAssociation extends GenServiceEntityFeature, GenServiceAssociation, GenIncludedAssociation {

	/**
	 * Returns the value of the '<em><b>Jsf Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Feature</em>' reference.
	 * @see #setJsfFeature(ServiceEntityAssociation)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenServiceEntityAssociation_JsfFeature()
	 * @model required="true"
	 * @generated
	 */
	ServiceEntityAssociation getJsfFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityAssociation#getJsfFeature <em>Jsf Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Feature</em>' reference.
	 * @see #getJsfFeature()
	 * @generated
	 */
	void setJsfFeature(ServiceEntityAssociation value);

	/**
	 * Returns the value of the '<em><b>Gen Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Feature</em>' reference.
	 * @see #setGenFeature(GenAssociation)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenServiceEntityAssociation_GenFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenAssociation getGenFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityAssociation#getGenFeature <em>Gen Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Feature</em>' reference.
	 * @see #getGenFeature()
	 * @generated
	 */
	void setGenFeature(GenAssociation value);
} // GenServiceEntityAssociation
