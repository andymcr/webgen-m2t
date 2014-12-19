/**
 */
package uk.ac.man.cs.mdsd.genjsf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Service Entity Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityFeature#getColumnName <em>Column Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenServiceEntityFeature()
 * @model abstract="true"
 * @generated
 */
public interface GenServiceEntityFeature extends GenIncludedFeature, GenServiceFeature {

	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenServiceEntityFeature_ColumnName()
	 * @model
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityFeature#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);
} // GenServiceEntityFeature
