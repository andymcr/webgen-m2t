/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenCollectionAssociation.java,v 1.8 2014/01/25 17:38:12 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm;

import uk.ac.man.cs.mdsd.orm.CollectionAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Collection Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation#getOrmFeature <em>Orm Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation#getPivotTableName <em>Pivot Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation#getPivotColumnName <em>Pivot Column Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenCollectionAssociation()
 * @model
 * @generated
 */
public interface GenCollectionAssociation extends GenAssociation {
	/**
	 * Returns the value of the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Feature</em>' reference.
	 * @see #setOrmFeature(CollectionAssociation)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenCollectionAssociation_OrmFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CollectionAssociation getOrmFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation#getOrmFeature <em>Orm Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Feature</em>' reference.
	 * @see #getOrmFeature()
	 * @generated
	 */
	void setOrmFeature(CollectionAssociation value);

	/**
	 * Returns the value of the '<em><b>Pivot Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pivot Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pivot Table Name</em>' attribute.
	 * @see #setPivotTableName(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenCollectionAssociation_PivotTableName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPivotTableName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation#getPivotTableName <em>Pivot Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pivot Table Name</em>' attribute.
	 * @see #getPivotTableName()
	 * @generated
	 */
	void setPivotTableName(String value);

	/**
	 * Returns the value of the '<em><b>Pivot Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pivot Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pivot Column Name</em>' attribute.
	 * @see #setPivotColumnName(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenCollectionAssociation_PivotColumnName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPivotColumnName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation#getPivotColumnName <em>Pivot Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pivot Column Name</em>' attribute.
	 * @see #getPivotColumnName()
	 * @generated
	 */
	void setPivotColumnName(String value);
} // GenCollectionAssociation
