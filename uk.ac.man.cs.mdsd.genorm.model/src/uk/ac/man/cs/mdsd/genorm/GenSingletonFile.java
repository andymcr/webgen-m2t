/**
 */
package uk.ac.man.cs.mdsd.genorm;

import uk.ac.man.cs.mdsd.orm.SingletonFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Singleton File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenSingletonFile#getOrmFeature <em>Orm Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenSingletonFile()
 * @model
 * @generated
 */
public interface GenSingletonFile extends GenSingletonResource {
	/**
	 * Returns the value of the '<em><b>Orm Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Feature</em>' reference.
	 * @see #setOrmFeature(SingletonFile)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenSingletonFile_OrmFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SingletonFile getOrmFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonFile#getOrmFeature <em>Orm Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Feature</em>' reference.
	 * @see #getOrmFeature()
	 * @generated
	 */
	void setOrmFeature(SingletonFile value);

} // GenSingletonFile
