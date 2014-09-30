/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenDataType.java,v 1.9 2014/01/25 17:38:12 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm;

import uk.ac.man.cs.mdsd.orm.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenDataType#getOrmDataType <em>Orm Data Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenDataType#getJavaType <em>Java Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenDataType#getJavaDefaultValue <em>Java Default Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenDataType#getPersistenceType <em>Persistence Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenDataType()
 * @model
 * @generated
 */
public interface GenDataType extends GenClassifier {
	/**
	 * Returns the value of the '<em><b>Orm Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Data Type</em>' reference.
	 * @see #setOrmDataType(DataType)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenDataType_OrmDataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getOrmDataType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenDataType#getOrmDataType <em>Orm Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Data Type</em>' reference.
	 * @see #getOrmDataType()
	 * @generated
	 */
	void setOrmDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Java Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Type</em>' attribute.
	 * @see #setJavaType(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenDataType_JavaType()
	 * @model required="true"
	 * @generated
	 */
	String getJavaType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenDataType#getJavaType <em>Java Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Type</em>' attribute.
	 * @see #getJavaType()
	 * @generated
	 */
	void setJavaType(String value);

	/**
	 * Returns the value of the '<em><b>Java Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Default Value</em>' attribute.
	 * @see #setJavaDefaultValue(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenDataType_JavaDefaultValue()
	 * @model required="true"
	 * @generated
	 */
	String getJavaDefaultValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenDataType#getJavaDefaultValue <em>Java Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Default Value</em>' attribute.
	 * @see #getJavaDefaultValue()
	 * @generated
	 */
	void setJavaDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Type</em>' attribute.
	 * @see #setPersistenceType(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenDataType_PersistenceType()
	 * @model required="true"
	 * @generated
	 */
	String getPersistenceType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenDataType#getPersistenceType <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Type</em>' attribute.
	 * @see #getPersistenceType()
	 * @generated
	 */
	void setPersistenceType(String value);

	void reconcile(final GenDataType oldGenDataType);
} // GenDataType
