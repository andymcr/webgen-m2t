/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.common.util.EList;
import uk.ac.man.cs.mdsd.jsf.ModelLabel;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Model Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenModelLabel#getGenLabelFor <em>Gen Label For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenModelLabel#getJsfLabel <em>Jsf Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenModelLabel#getGenFeatures <em>Gen Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenModelLabel()
 * @model
 * @generated
 */
public interface GenModelLabel extends NamedElement, GenUnitTitle {
	/**
	 * Returns the value of the '<em><b>Gen Label For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Label For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Label For</em>' reference.
	 * @see #setGenLabelFor(GenService)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenModelLabel_GenLabelFor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenService getGenLabelFor();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenModelLabel#getGenLabelFor <em>Gen Label For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Label For</em>' reference.
	 * @see #getGenLabelFor()
	 * @generated
	 */
	void setGenLabelFor(GenService value);

	/**
	 * Returns the value of the '<em><b>Jsf Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Label</em>' reference.
	 * @see #setJsfLabel(ModelLabel)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenModelLabel_JsfLabel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ModelLabel getJsfLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenModelLabel#getJsfLabel <em>Jsf Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Label</em>' reference.
	 * @see #getJsfLabel()
	 * @generated
	 */
	void setJsfLabel(ModelLabel value);

	/**
	 * Returns the value of the '<em><b>Gen Features</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenServiceFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Features</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Features</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenModelLabel_GenFeatures()
	 * @model required="true"
	 * @generated
	 */
	EList<GenServiceFeature> getGenFeatures();

} // GenModelLabel
