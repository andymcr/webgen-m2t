/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.UnitAssociation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Unit Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getJsfFeature <em>Jsf Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenServiceFeature <em>Gen Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenChildFeature <em>Gen Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenSelection <em>Gen Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenDynamicLabel <em>Gen Dynamic Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getSelectOneOfOption <em>Select One Of Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getSelectManyOption <em>Select Many Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitAssociation()
 * @model
 * @generated
 */
public interface GenUnitAssociation extends GenUnitFeature, GenIncludedAssociation, GenUnitContainer {
	/**
	 * Returns the value of the '<em><b>Jsf Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Feature</em>' reference.
	 * @see #setJsfFeature(UnitAssociation)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitAssociation_JsfFeature()
	 * @model required="true"
	 * @generated
	 */
	UnitAssociation getJsfFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getJsfFeature <em>Jsf Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Feature</em>' reference.
	 * @see #getJsfFeature()
	 * @generated
	 */
	void setJsfFeature(UnitAssociation value);

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
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitAssociation_GenServiceFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenServiceAssociation getGenServiceFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenServiceFeature <em>Gen Service Feature</em>}' reference.
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
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitAssociation_GenChildFeature()
	 * @model containment="true"
	 * @generated
	 */
	GenUnitChildFeature getGenChildFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenChildFeature <em>Gen Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Child Feature</em>' containment reference.
	 * @see #getGenChildFeature()
	 * @generated
	 */
	void setGenChildFeature(GenUnitChildFeature value);

	/**
	 * Returns the value of the '<em><b>Gen Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Selection</em>' reference.
	 * @see #setGenSelection(GenSelection)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitAssociation_GenSelection()
	 * @model ordered="false"
	 * @generated
	 */
	GenSelection getGenSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenSelection <em>Gen Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Selection</em>' reference.
	 * @see #getGenSelection()
	 * @generated
	 */
	void setGenSelection(GenSelection value);

	/**
	 * Returns the value of the '<em><b>Gen Dynamic Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Dynamic Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Dynamic Label</em>' reference.
	 * @see #setGenDynamicLabel(GenModelLabel)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitAssociation_GenDynamicLabel()
	 * @model ordered="false"
	 * @generated
	 */
	GenModelLabel getGenDynamicLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getGenDynamicLabel <em>Gen Dynamic Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Dynamic Label</em>' reference.
	 * @see #getGenDynamicLabel()
	 * @generated
	 */
	void setGenDynamicLabel(GenModelLabel value);

	/**
	 * Returns the value of the '<em><b>Select One Of Option</b></em>' attribute.
	 * The default value is <code>"Menu"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.genjsf.SelectOneofOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select One Of Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select One Of Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.genjsf.SelectOneofOptions
	 * @see #setSelectOneOfOption(SelectOneofOptions)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitAssociation_SelectOneOfOption()
	 * @model default="Menu" required="true"
	 * @generated
	 */
	SelectOneofOptions getSelectOneOfOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getSelectOneOfOption <em>Select One Of Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select One Of Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.genjsf.SelectOneofOptions
	 * @see #getSelectOneOfOption()
	 * @generated
	 */
	void setSelectOneOfOption(SelectOneofOptions value);

	/**
	 * Returns the value of the '<em><b>Select Many Option</b></em>' attribute.
	 * The default value is <code>"List"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.genjsf.SelectManyOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Many Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Many Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.genjsf.SelectManyOptions
	 * @see #setSelectManyOption(SelectManyOptions)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitAssociation_SelectManyOption()
	 * @model default="List" required="true"
	 * @generated
	 */
	SelectManyOptions getSelectManyOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation#getSelectManyOption <em>Select Many Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Many Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.genjsf.SelectManyOptions
	 * @see #getSelectManyOption()
	 * @generated
	 */
	void setSelectManyOption(SelectManyOptions value);

} // GenUnitAssociation
