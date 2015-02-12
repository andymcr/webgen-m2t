/**
 */
package uk.ac.man.cs.mdsd.criteria;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Is Empty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.criteria.PredicateIsEmpty#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getPredicateIsEmpty()
 * @model
 * @generated
 */
public interface PredicateIsEmpty extends Predicate {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(Path)
	 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getPredicateIsEmpty_Feature()
	 * @model containment="true"
	 * @generated
	 */
	Path getFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.criteria.PredicateIsEmpty#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Path value);

} // PredicateIsEmpty
