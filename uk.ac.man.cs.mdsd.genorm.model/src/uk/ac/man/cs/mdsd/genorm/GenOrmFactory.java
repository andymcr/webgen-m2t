/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenOrmFactory.java,v 1.8 2014/06/27 07:52:21 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage
 * @generated
 */
public interface GenOrmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenOrmFactory eINSTANCE = uk.ac.man.cs.mdsd.genorm.impl.GenOrmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	GenOrmModel createGenOrmModel();

	/**
	 * Returns a new object of class '<em>Gen Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Collection Type</em>'.
	 * @generated
	 */
	GenCollectionType createGenCollectionType();

	/**
	 * Returns a new object of class '<em>Gen Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Data Type</em>'.
	 * @generated
	 */
	GenDataType createGenDataType();

	/**
	 * Returns a new object of class '<em>Gen Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Entity</em>'.
	 * @generated
	 */
	GenEntity createGenEntity();

	/**
	 * Returns a new object of class '<em>Gen Singleton Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Singleton Element</em>'.
	 * @generated
	 */
	GenSingletonElement createGenSingletonElement();

	/**
	 * Returns a new object of class '<em>Gen Collection Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Collection Element</em>'.
	 * @generated
	 */
	GenCollectionElement createGenCollectionElement();

	/**
	 * Returns a new object of class '<em>Gen Singleton Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Singleton Date</em>'.
	 * @generated
	 */
	GenSingletonDate createGenSingletonDate();

	/**
	 * Returns a new object of class '<em>Gen Collection Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Collection Date</em>'.
	 * @generated
	 */
	GenCollectionDate createGenCollectionDate();

	/**
	 * Returns a new object of class '<em>Gen Singleton File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Singleton File</em>'.
	 * @generated
	 */
	GenSingletonFile createGenSingletonFile();

	/**
	 * Returns a new object of class '<em>Gen Singleton Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Singleton Location</em>'.
	 * @generated
	 */
	GenSingletonLocation createGenSingletonLocation();

	/**
	 * Returns a new object of class '<em>Gen Singleton Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Singleton Association</em>'.
	 * @generated
	 */
	GenSingletonAssociation createGenSingletonAssociation();

	/**
	 * Returns a new object of class '<em>Gen Collection Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Collection Association</em>'.
	 * @generated
	 */
	GenCollectionAssociation createGenCollectionAssociation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenOrmPackage getGenOrmPackage();

} //GenOrmFactory
