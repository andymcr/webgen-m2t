/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenEntity.java,v 1.11 2014/01/25 17:38:12 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.orm.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getOrmEntity <em>Orm Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getGenPartOf <em>Gen Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getDefaultTableName <em>Default Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getTableName <em>Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getGenFeatures <em>Gen Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenEntity()
 * @model
 * @generated
 */
public interface GenEntity extends GenClassifier {
	/**
	 * Returns the value of the '<em><b>Orm Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Entity</em>' reference.
	 * @see #setOrmEntity(Entity)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenEntity_OrmEntity()
	 * @model required="true"
	 * @generated
	 */
	Entity getOrmEntity();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getOrmEntity <em>Orm Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Entity</em>' reference.
	 * @see #getOrmEntity()
	 * @generated
	 */
	void setOrmEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Gen Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getGenEntities <em>Gen Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Part Of</em>' container reference.
	 * @see #setGenPartOf(GenOrmModel)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenEntity_GenPartOf()
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel#getGenEntities
	 * @model opposite="genEntities" required="true" transient="false" ordered="false"
	 * @generated
	 */
	GenOrmModel getGenPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getGenPartOf <em>Gen Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Part Of</em>' container reference.
	 * @see #getGenPartOf()
	 * @generated
	 */
	void setGenPartOf(GenOrmModel value);

	/**
	 * Returns the value of the '<em><b>Default Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Table Name</em>' attribute.
	 * @see #setDefaultTableName(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenEntity_DefaultTableName()
	 * @model required="true"
	 * @generated
	 */
	String getDefaultTableName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getDefaultTableName <em>Default Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Table Name</em>' attribute.
	 * @see #getDefaultTableName()
	 * @generated
	 */
	void setDefaultTableName(String value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenEntity_TableName()
	 * @model required="true"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Name</em>' attribute.
	 * @see #setKeyName(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenEntity_KeyName()
	 * @model required="true"
	 * @generated
	 */
	String getKeyName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getKeyName <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Name</em>' attribute.
	 * @see #getKeyName()
	 * @generated
	 */
	void setKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Gen Features</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genorm.GenFeature}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genorm.GenFeature#getGenParentEntity <em>Gen Parent Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Features</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenEntity_GenFeatures()
	 * @see uk.ac.man.cs.mdsd.genorm.GenFeature#getGenParentEntity
	 * @model opposite="genParentEntity" containment="true"
	 * @generated
	 */
	EList<GenFeature> getGenFeatures();

	void reconcile(final GenEntity oldGenEntity);
} // GenEntity
