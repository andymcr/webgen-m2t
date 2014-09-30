/**
 */
package uk.ac.man.cs.mdsd.genorm;

import uk.ac.man.cs.mdsd.gencriteria.GenExpression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Singleton Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAttribute#getGenDefaultValue <em>Gen Default Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAttribute#getColumnName <em>Column Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenSingletonAttribute()
 * @model abstract="true"
 * @generated
 */
public interface GenSingletonAttribute extends GenAttribute {
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
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenSingletonAttribute_ColumnName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAttribute#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Gen Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Default Value</em>' containment reference.
	 * @see #setGenDefaultValue(GenExpression)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenSingletonAttribute_GenDefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	GenExpression getGenDefaultValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAttribute#getGenDefaultValue <em>Gen Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Default Value</em>' containment reference.
	 * @see #getGenDefaultValue()
	 * @generated
	 */
	void setGenDefaultValue(GenExpression value);

} // GenSingletonAttribute
