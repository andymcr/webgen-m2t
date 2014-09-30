/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.gencriteria.GenPath;
import uk.ac.man.cs.mdsd.jsf.CurrentUserReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Current User Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenCurrentUserReference#getCriteriaPath <em>Criteria Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenCurrentUserReference()
 * @model
 * @generated
 */
public interface GenCurrentUserReference extends GenPath {
	/**
	 * Returns the value of the '<em><b>Criteria Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Path</em>' reference.
	 * @see #setCriteriaPath(CurrentUserReference)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenCurrentUserReference_CriteriaPath()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CurrentUserReference getCriteriaPath();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenCurrentUserReference#getCriteriaPath <em>Criteria Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Path</em>' reference.
	 * @see #getCriteriaPath()
	 * @generated
	 */
	void setCriteriaPath(CurrentUserReference value);

} // GenCurrentUserReference
