/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getServiceFeature <em>Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getDynamicLabel <em>Dynamic Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getFilters <em>Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitAssociation()
 * @model
 * @generated
 */
public interface UnitAssociation extends UnitFeature, IncludedAssociation, UnitContainer {
	/**
	 * Returns the value of the '<em><b>Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Feature</em>' reference.
	 * @see #setServiceFeature(ServiceAssociation)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitAssociation_ServiceFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ServiceAssociation getServiceFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getServiceFeature <em>Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Feature</em>' reference.
	 * @see #getServiceFeature()
	 * @generated
	 */
	void setServiceFeature(ServiceAssociation value);

	/**
	 * Returns the value of the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Feature</em>' containment reference.
	 * @see #setChildFeature(UnitChildFeature)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitAssociation_ChildFeature()
	 * @model containment="true"
	 * @generated
	 */
	UnitChildFeature getChildFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getChildFeature <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Feature</em>' containment reference.
	 * @see #getChildFeature()
	 * @generated
	 */
	void setChildFeature(UnitChildFeature value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitAssociation_Selection()
	 * @model ordered="false"
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Dynamic Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Label</em>' reference.
	 * @see #setDynamicLabel(ModelLabel)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitAssociation_DynamicLabel()
	 * @model ordered="false"
	 * @generated
	 */
	ModelLabel getDynamicLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getDynamicLabel <em>Dynamic Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Label</em>' reference.
	 * @see #getDynamicLabel()
	 * @generated
	 */
	void setDynamicLabel(ModelLabel value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.UnitTitle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitAssociation_Filters()
	 * @model
	 * @generated
	 */
	EList<UnitTitle> getFilters();

} // UnitAssociation
