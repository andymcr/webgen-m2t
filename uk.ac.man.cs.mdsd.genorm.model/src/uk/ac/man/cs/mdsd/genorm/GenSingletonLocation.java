/**
 */
package uk.ac.man.cs.mdsd.genorm;

import uk.ac.man.cs.mdsd.orm.SingletonLocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Singleton Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenSingletonLocation#getOrmFeature <em>Orm Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenSingletonLocation()
 * @model
 * @generated
 */
public interface GenSingletonLocation extends GenSingletonAttribute {
	/**
	 * Returns the value of the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Feature</em>' reference.
	 * @see #setOrmFeature(SingletonLocation)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenSingletonLocation_OrmFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SingletonLocation getOrmFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonLocation#getOrmFeature <em>Orm Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Feature</em>' reference.
	 * @see #getOrmFeature()
	 * @generated
	 */
	void setOrmFeature(SingletonLocation value);

} // GenSingletonLocation
