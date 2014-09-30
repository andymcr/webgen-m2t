/**
 */
package uk.ac.man.cs.mdsd.jsf;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.ModelLabel#getLabelFor <em>Label For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.ModelLabel#getFormat <em>Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.ModelLabel#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getModelLabel()
 * @model
 * @generated
 */
public interface ModelLabel extends NamedElement, UnitTitle {
	/**
	 * Returns the value of the '<em><b>Label For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.jsf.Service#getDisplayLabels <em>Display Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label For</em>' container reference.
	 * @see #setLabelFor(Service)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getModelLabel_LabelFor()
	 * @see uk.ac.man.cs.mdsd.jsf.Service#getDisplayLabels
	 * @model opposite="displayLabels" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Service getLabelFor();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.ModelLabel#getLabelFor <em>Label For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label For</em>' container reference.
	 * @see #getLabelFor()
	 * @generated
	 */
	void setLabelFor(Service value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getModelLabel_Format()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.ModelLabel#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.jsf.ServiceFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getModelLabel_Features()
	 * @model required="true"
	 * @generated
	 */
	EList<ServiceFeature> getFeatures();

} // ModelLabel
