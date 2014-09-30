/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenCollectionElement.java,v 1.5 2014/01/25 17:38:12 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm;

import uk.ac.man.cs.mdsd.orm.CollectionElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Collection Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenCollectionElement#getOrmFeature <em>Orm Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenCollectionElement()
 * @model
 * @generated
 */
public interface GenCollectionElement extends GenCollectionAttribute {
	/**
	 * Returns the value of the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Feature</em>' reference.
	 * @see #setOrmFeature(CollectionElement)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenCollectionElement_OrmFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CollectionElement getOrmFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionElement#getOrmFeature <em>Orm Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Feature</em>' reference.
	 * @see #getOrmFeature()
	 * @generated
	 */
	void setOrmFeature(CollectionElement value);

} // GenCollectionElement
