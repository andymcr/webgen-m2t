/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.UnitChildAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Unit Child Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation#getJsfChildFeature <em>Jsf Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation#getGenServiceFeature <em>Gen Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation#getGenChildFeature <em>Gen Child Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitChildAssociation()
 * @model
 * @generated
 */
public interface GenUnitChildAssociation extends GenUnitChildFeature {
	/**
	 * Returns the value of the '<em><b>Jsf Child Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Child Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Child Feature</em>' reference.
	 * @see #setJsfChildFeature(UnitChildAssociation)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitChildAssociation_JsfChildFeature()
	 * @model required="true"
	 * @generated
	 */
	UnitChildAssociation getJsfChildFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation#getJsfChildFeature <em>Jsf Child Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Child Feature</em>' reference.
	 * @see #getJsfChildFeature()
	 * @generated
	 */
	void setJsfChildFeature(UnitChildAssociation value);

	/**
	 * Returns the value of the '<em><b>Gen Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Service Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Service Feature</em>' reference.
	 * @see #setGenServiceFeature(GenServiceAssociation)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitChildAssociation_GenServiceFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenServiceAssociation getGenServiceFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation#getGenServiceFeature <em>Gen Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Service Feature</em>' reference.
	 * @see #getGenServiceFeature()
	 * @generated
	 */
	void setGenServiceFeature(GenServiceAssociation value);

	/**
	 * Returns the value of the '<em><b>Gen Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Child Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Child Feature</em>' containment reference.
	 * @see #setGenChildFeature(GenUnitChildFeature)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitChildAssociation_GenChildFeature()
	 * @model containment="true"
	 * @generated
	 */
	GenUnitChildFeature getGenChildFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation#getGenChildFeature <em>Gen Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Child Feature</em>' containment reference.
	 * @see #getGenChildFeature()
	 * @generated
	 */
	void setGenChildFeature(GenUnitChildFeature value);

} // GenUnitChildAssociation
