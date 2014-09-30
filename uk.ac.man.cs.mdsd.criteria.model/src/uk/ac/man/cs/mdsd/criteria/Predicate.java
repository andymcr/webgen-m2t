/**
 */
package uk.ac.man.cs.mdsd.criteria;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.criteria.Predicate#isNegated <em>Negated</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getPredicate()
 * @model abstract="true"
 * @generated
 */
public interface Predicate extends Expression {
	/**
	 * Returns the value of the '<em><b>Negated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated</em>' attribute.
	 * @see #setNegated(boolean)
	 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getPredicate_Negated()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isNegated();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.criteria.Predicate#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' attribute.
	 * @see #isNegated()
	 * @generated
	 */
	void setNegated(boolean value);

} // Predicate
