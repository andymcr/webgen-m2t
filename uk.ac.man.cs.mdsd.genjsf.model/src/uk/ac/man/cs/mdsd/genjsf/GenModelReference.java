/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.gencriteria.GenPath;
import uk.ac.man.cs.mdsd.jsf.ModelReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Model Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenModelReference#getCriteriaPath <em>Criteria Path</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenModelReference#getGenUnit <em>Gen Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenModelReference()
 * @model
 * @generated
 */
public interface GenModelReference extends GenPath {
	/**
	 * Returns the value of the '<em><b>Criteria Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Path</em>' reference.
	 * @see #setCriteriaPath(ModelReference)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenModelReference_CriteriaPath()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ModelReference getCriteriaPath();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenModelReference#getCriteriaPath <em>Criteria Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Path</em>' reference.
	 * @see #getCriteriaPath()
	 * @generated
	 */
	void setCriteriaPath(ModelReference value);

	/**
	 * Returns the value of the '<em><b>Gen Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Unit</em>' reference.
	 * @see #setGenUnit(GenDynamicUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenModelReference_GenUnit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenDynamicUnit getGenUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenModelReference#getGenUnit <em>Gen Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Unit</em>' reference.
	 * @see #getGenUnit()
	 * @generated
	 */
	void setGenUnit(GenDynamicUnit value);

} // GenModelReference
