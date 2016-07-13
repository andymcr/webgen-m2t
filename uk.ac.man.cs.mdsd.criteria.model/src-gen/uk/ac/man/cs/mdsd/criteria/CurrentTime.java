/**
 */
package uk.ac.man.cs.mdsd.criteria;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.criteria.CurrentTime#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getCurrentTime()
 * @model
 * @generated
 */
public interface CurrentTime extends Literal {
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
	 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getCurrentTime_Format()
	 * @model unique="false"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.criteria.CurrentTime#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

} // CurrentTime
