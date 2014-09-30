/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenCollectionDate.java,v 1.7 2014/01/25 17:38:12 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm;

import uk.ac.man.cs.mdsd.orm.CollectionDate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Collection Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenCollectionDate#getOrmFeature <em>Orm Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenCollectionDate()
 * @model
 * @generated
 */
public interface GenCollectionDate extends GenCollectionAttribute {
	/**
	 * Returns the value of the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Feature</em>' reference.
	 * @see #setOrmFeature(CollectionDate)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenCollectionDate_OrmFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CollectionDate getOrmFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionDate#getOrmFeature <em>Orm Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Feature</em>' reference.
	 * @see #getOrmFeature()
	 * @generated
	 */
	void setOrmFeature(CollectionDate value);
} // GenCollectionDate
