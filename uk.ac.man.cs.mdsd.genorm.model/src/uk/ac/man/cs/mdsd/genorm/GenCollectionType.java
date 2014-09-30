/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenCollectionType.java,v 1.5 2014/01/25 17:38:12 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm;

import uk.ac.man.cs.mdsd.orm.CollectionType;
import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenCollectionType#getOrmCollectionType <em>Orm Collection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenCollectionType()
 * @model
 * @generated
 */
public interface GenCollectionType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Orm Collection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Collection Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Collection Type</em>' reference.
	 * @see #setOrmCollectionType(CollectionType)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenCollectionType_OrmCollectionType()
	 * @model required="true"
	 * @generated
	 */
	CollectionType getOrmCollectionType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionType#getOrmCollectionType <em>Orm Collection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Collection Type</em>' reference.
	 * @see #getOrmCollectionType()
	 * @generated
	 */
	void setOrmCollectionType(CollectionType value);

	void reconcile(final GenCollectionType oldGenCollectionType);
} // GenCollectionType
