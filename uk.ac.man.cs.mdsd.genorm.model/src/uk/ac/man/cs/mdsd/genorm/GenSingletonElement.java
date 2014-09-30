/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenSingletonElement.java,v 1.7 2014/01/25 17:38:12 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm;

import uk.ac.man.cs.mdsd.orm.SingletonElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Singleton Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenSingletonElement#getOrmFeature <em>Orm Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenSingletonElement#getGenDataType <em>Gen Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenSingletonElement()
 * @model
 * @generated
 */
public interface GenSingletonElement extends GenSingletonAttribute {
	/**
	 * Returns the value of the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Feature</em>' reference.
	 * @see #setOrmFeature(SingletonElement)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenSingletonElement_OrmFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SingletonElement getOrmFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonElement#getOrmFeature <em>Orm Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Feature</em>' reference.
	 * @see #getOrmFeature()
	 * @generated
	 */
	void setOrmFeature(SingletonElement value);

	/**
	 * Returns the value of the '<em><b>Gen Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Data Type</em>' reference.
	 * @see #setGenDataType(GenDataType)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenSingletonElement_GenDataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GenDataType getGenDataType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonElement#getGenDataType <em>Gen Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Data Type</em>' reference.
	 * @see #getGenDataType()
	 * @generated
	 */
	void setGenDataType(GenDataType value);

} // GenSingletonElement
