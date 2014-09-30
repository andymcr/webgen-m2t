/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenSingletonAssociation.java,v 1.8 2014/01/25 17:38:12 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm;

import uk.ac.man.cs.mdsd.orm.SingletonAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Singleton Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation#getOrmFeature <em>Orm Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation#getColumnName <em>Column Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenSingletonAssociation()
 * @model
 * @generated
 */
public interface GenSingletonAssociation extends GenAssociation {
	/**
	 * Returns the value of the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Feature</em>' reference.
	 * @see #setOrmFeature(SingletonAssociation)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenSingletonAssociation_OrmFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SingletonAssociation getOrmFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation#getOrmFeature <em>Orm Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Feature</em>' reference.
	 * @see #getOrmFeature()
	 * @generated
	 */
	void setOrmFeature(SingletonAssociation value);

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
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenSingletonAssociation_ColumnName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);
} // GenSingletonAssociation
