/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenOrmFactoryImpl.java,v 1.10 2014/06/27 07:52:21 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.man.cs.mdsd.genorm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenOrmFactoryImpl extends EFactoryImpl implements GenOrmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenOrmFactory init() {
		try {
			GenOrmFactory theGenOrmFactory = (GenOrmFactory)EPackage.Registry.INSTANCE.getEFactory(GenOrmPackage.eNS_URI);
			if (theGenOrmFactory != null) {
				return theGenOrmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenOrmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenOrmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GenOrmPackage.GEN_ORM_MODEL: return createGenOrmModel();
			case GenOrmPackage.GEN_COLLECTION_TYPE: return createGenCollectionType();
			case GenOrmPackage.GEN_DATA_TYPE: return createGenDataType();
			case GenOrmPackage.GEN_ENTITY: return createGenEntity();
			case GenOrmPackage.GEN_SINGLETON_ELEMENT: return createGenSingletonElement();
			case GenOrmPackage.GEN_COLLECTION_ELEMENT: return createGenCollectionElement();
			case GenOrmPackage.GEN_SINGLETON_DATE: return createGenSingletonDate();
			case GenOrmPackage.GEN_COLLECTION_DATE: return createGenCollectionDate();
			case GenOrmPackage.GEN_SINGLETON_FILE: return createGenSingletonFile();
			case GenOrmPackage.GEN_SINGLETON_LOCATION: return createGenSingletonLocation();
			case GenOrmPackage.GEN_SINGLETON_ASSOCIATION: return createGenSingletonAssociation();
			case GenOrmPackage.GEN_COLLECTION_ASSOCIATION: return createGenCollectionAssociation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GenOrmPackage.ORM_TECHNOLOGIES:
				return createOrmTechnologiesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GenOrmPackage.ORM_TECHNOLOGIES:
				return convertOrmTechnologiesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenOrmModel createGenOrmModel() {
		GenOrmModelImpl genOrmModel = new GenOrmModelImpl();
		return genOrmModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCollectionType createGenCollectionType() {
		GenCollectionTypeImpl genCollectionType = new GenCollectionTypeImpl();
		return genCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDataType createGenDataType() {
		GenDataTypeImpl genDataType = new GenDataTypeImpl();
		return genDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEntity createGenEntity() {
		GenEntityImpl genEntity = new GenEntityImpl();
		return genEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSingletonElement createGenSingletonElement() {
		GenSingletonElementImpl genSingletonElement = new GenSingletonElementImpl();
		return genSingletonElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCollectionElement createGenCollectionElement() {
		GenCollectionElementImpl genCollectionElement = new GenCollectionElementImpl();
		return genCollectionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSingletonDate createGenSingletonDate() {
		GenSingletonDateImpl genSingletonDate = new GenSingletonDateImpl();
		return genSingletonDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCollectionDate createGenCollectionDate() {
		GenCollectionDateImpl genCollectionDate = new GenCollectionDateImpl();
		return genCollectionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSingletonFile createGenSingletonFile() {
		GenSingletonFileImpl genSingletonFile = new GenSingletonFileImpl();
		return genSingletonFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSingletonLocation createGenSingletonLocation() {
		GenSingletonLocationImpl genSingletonLocation = new GenSingletonLocationImpl();
		return genSingletonLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSingletonAssociation createGenSingletonAssociation() {
		GenSingletonAssociationImpl genSingletonAssociation = new GenSingletonAssociationImpl();
		return genSingletonAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCollectionAssociation createGenCollectionAssociation() {
		GenCollectionAssociationImpl genCollectionAssociation = new GenCollectionAssociationImpl();
		return genCollectionAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmTechnologies createOrmTechnologiesFromString(EDataType eDataType, String initialValue) {
		OrmTechnologies result = OrmTechnologies.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrmTechnologiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenOrmPackage getGenOrmPackage() {
		return (GenOrmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenOrmPackage getPackage() {
		return GenOrmPackage.eINSTANCE;
	}

} //GenOrmFactoryImpl
