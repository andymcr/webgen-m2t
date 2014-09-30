/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.gencriteria.GenPath;

import uk.ac.man.cs.mdsd.jsf.FeatureReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Feature Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenFeatureReference#getCriteriaPath <em>Criteria Path</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenFeatureReference#getGenField <em>Gen Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenFeatureReference()
 * @model
 * @generated
 */
public interface GenFeatureReference extends GenPath {
	/**
	 * Returns the value of the '<em><b>Criteria Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Path</em>' reference.
	 * @see #setCriteriaPath(FeatureReference)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenFeatureReference_CriteriaPath()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FeatureReference getCriteriaPath();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenFeatureReference#getCriteriaPath <em>Criteria Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Path</em>' reference.
	 * @see #getCriteriaPath()
	 * @generated
	 */
	void setCriteriaPath(FeatureReference value);

	/**
	 * Returns the value of the '<em><b>Gen Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Field</em>' reference.
	 * @see #setGenField(GenServiceEntityFeature)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenFeatureReference_GenField()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenServiceEntityFeature getGenField();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenFeatureReference#getGenField <em>Gen Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Field</em>' reference.
	 * @see #getGenField()
	 * @generated
	 */
	void setGenField(GenServiceEntityFeature value);

} // GenFeatureReference
