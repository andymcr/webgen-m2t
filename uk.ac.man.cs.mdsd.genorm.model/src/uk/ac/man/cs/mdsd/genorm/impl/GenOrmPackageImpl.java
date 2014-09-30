/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenOrmPackageImpl.java,v 1.27 2014/06/27 07:52:21 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage;
import uk.ac.man.cs.mdsd.genorm.GenAssociation;
import uk.ac.man.cs.mdsd.genorm.GenAttribute;
import uk.ac.man.cs.mdsd.genorm.GenClassifier;
import uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation;
import uk.ac.man.cs.mdsd.genorm.GenCollectionAttribute;
import uk.ac.man.cs.mdsd.genorm.GenCollectionDate;
import uk.ac.man.cs.mdsd.genorm.GenCollectionElement;
import uk.ac.man.cs.mdsd.genorm.GenCollectionType;
import uk.ac.man.cs.mdsd.genorm.GenDataType;
import uk.ac.man.cs.mdsd.genorm.GenEntity;
import uk.ac.man.cs.mdsd.genorm.GenFeature;
import uk.ac.man.cs.mdsd.genorm.GenOrmFactory;
import uk.ac.man.cs.mdsd.genorm.GenOrmModel;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;

import uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation;
import uk.ac.man.cs.mdsd.genorm.GenSingletonAttribute;
import uk.ac.man.cs.mdsd.genorm.GenSingletonDate;
import uk.ac.man.cs.mdsd.genorm.GenSingletonElement;
import uk.ac.man.cs.mdsd.genorm.GenSingletonFile;
import uk.ac.man.cs.mdsd.genorm.GenSingletonLocation;
import uk.ac.man.cs.mdsd.genorm.OrmTechnologies;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenOrmPackageImpl extends EPackageImpl implements GenOrmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genOrmModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genSingletonAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCollectionAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genSingletonElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCollectionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genSingletonDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCollectionDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genSingletonFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genSingletonLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genSingletonAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCollectionAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ormTechnologiesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenOrmPackageImpl() {
		super(eNS_URI, GenOrmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GenOrmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenOrmPackage init() {
		if (isInited) return (GenOrmPackage)EPackage.Registry.INSTANCE.getEPackage(GenOrmPackage.eNS_URI);

		// Obtain or create and register package
		GenOrmPackageImpl theGenOrmPackage = (GenOrmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GenOrmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GenOrmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GencriteriaPackage.eINSTANCE.eClass();
		OrmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGenOrmPackage.createPackageContents();

		// Initialize created meta-data
		theGenOrmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenOrmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenOrmPackage.eNS_URI, theGenOrmPackage);
		return theGenOrmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenOrmModel() {
		return genOrmModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenOrmModel_OrmModel() {
		return (EReference)genOrmModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenOrmModel_GenCollectionTypes() {
		return (EReference)genOrmModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenOrmModel_GenDataTypes() {
		return (EReference)genOrmModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenOrmModel_GenEntities() {
		return (EReference)genOrmModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenOrmModel_OrmTechnology() {
		return (EAttribute)genOrmModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenOrmModel_BasePackage() {
		return (EAttribute)genOrmModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenOrmModel_DomainPackage() {
		return (EAttribute)genOrmModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenOrmModel_IncludeXmlBindingAnnotations() {
		return (EAttribute)genOrmModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenOrmModel_DaoPackage() {
		return (EAttribute)genOrmModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenOrmModel_DaoImplPackage() {
		return (EAttribute)genOrmModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenOrmModel_DatabaseHost() {
		return (EAttribute)genOrmModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenOrmModel_DatabaseName() {
		return (EAttribute)genOrmModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenOrmModel_DatabaseUsername() {
		return (EAttribute)genOrmModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenOrmModel_DatabasePassword() {
		return (EAttribute)genOrmModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenOrmModel_DatabasePrefix() {
		return (EAttribute)genOrmModelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCollectionType() {
		return genCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCollectionType_OrmCollectionType() {
		return (EReference)genCollectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenClassifier() {
		return genClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDataType() {
		return genDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDataType_OrmDataType() {
		return (EReference)genDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDataType_JavaType() {
		return (EAttribute)genDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDataType_JavaDefaultValue() {
		return (EAttribute)genDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDataType_PersistenceType() {
		return (EAttribute)genDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenEntity() {
		return genEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEntity_OrmEntity() {
		return (EReference)genEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEntity_GenPartOf() {
		return (EReference)genEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEntity_DefaultTableName() {
		return (EAttribute)genEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEntity_TableName() {
		return (EAttribute)genEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEntity_KeyName() {
		return (EAttribute)genEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEntity_GenFeatures() {
		return (EReference)genEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEntity_XmlTransient() {
		return (EAttribute)genEntityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEntity_XmlRootElement() {
		return (EAttribute)genEntityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEntity_XmlNamespace() {
		return (EAttribute)genEntityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEntity_XmlName() {
		return (EAttribute)genEntityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFeature() {
		return genFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFeature_GenParentEntity() {
		return (EReference)genFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenFeature_XmlTransient() {
		return (EAttribute)genFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAttribute() {
		return genAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenSingletonAttribute() {
		return genSingletonAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenSingletonAttribute_ColumnName() {
		return (EAttribute)genSingletonAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSingletonAttribute_GenDefaultValue() {
		return (EReference)genSingletonAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCollectionAttribute() {
		return genCollectionAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCollectionAttribute_TableName() {
		return (EAttribute)genCollectionAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCollectionAttribute_ColumnName() {
		return (EAttribute)genCollectionAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenSingletonElement() {
		return genSingletonElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSingletonElement_OrmFeature() {
		return (EReference)genSingletonElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSingletonElement_GenDataType() {
		return (EReference)genSingletonElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCollectionElement() {
		return genCollectionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCollectionElement_OrmFeature() {
		return (EReference)genCollectionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenSingletonDate() {
		return genSingletonDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSingletonDate_OrmFeature() {
		return (EReference)genSingletonDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCollectionDate() {
		return genCollectionDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCollectionDate_OrmFeature() {
		return (EReference)genCollectionDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenSingletonFile() {
		return genSingletonFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSingletonFile_OrmFeature() {
		return (EReference)genSingletonFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenSingletonLocation() {
		return genSingletonLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSingletonLocation_OrmFeature() {
		return (EReference)genSingletonLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAssociation() {
		return genAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAssociation_GenOpposite() {
		return (EReference)genAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAssociation_FeatureName() {
		return (EAttribute)genAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenSingletonAssociation() {
		return genSingletonAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSingletonAssociation_OrmFeature() {
		return (EReference)genSingletonAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenSingletonAssociation_ColumnName() {
		return (EAttribute)genSingletonAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCollectionAssociation() {
		return genCollectionAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCollectionAssociation_OrmFeature() {
		return (EReference)genCollectionAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCollectionAssociation_PivotTableName() {
		return (EAttribute)genCollectionAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCollectionAssociation_PivotColumnName() {
		return (EAttribute)genCollectionAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrmTechnologies() {
		return ormTechnologiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenOrmFactory getGenOrmFactory() {
		return (GenOrmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		genOrmModelEClass = createEClass(GEN_ORM_MODEL);
		createEReference(genOrmModelEClass, GEN_ORM_MODEL__ORM_MODEL);
		createEReference(genOrmModelEClass, GEN_ORM_MODEL__GEN_COLLECTION_TYPES);
		createEReference(genOrmModelEClass, GEN_ORM_MODEL__GEN_DATA_TYPES);
		createEReference(genOrmModelEClass, GEN_ORM_MODEL__GEN_ENTITIES);
		createEAttribute(genOrmModelEClass, GEN_ORM_MODEL__ORM_TECHNOLOGY);
		createEAttribute(genOrmModelEClass, GEN_ORM_MODEL__BASE_PACKAGE);
		createEAttribute(genOrmModelEClass, GEN_ORM_MODEL__DOMAIN_PACKAGE);
		createEAttribute(genOrmModelEClass, GEN_ORM_MODEL__INCLUDE_XML_BINDING_ANNOTATIONS);
		createEAttribute(genOrmModelEClass, GEN_ORM_MODEL__DAO_PACKAGE);
		createEAttribute(genOrmModelEClass, GEN_ORM_MODEL__DAO_IMPL_PACKAGE);
		createEAttribute(genOrmModelEClass, GEN_ORM_MODEL__DATABASE_HOST);
		createEAttribute(genOrmModelEClass, GEN_ORM_MODEL__DATABASE_NAME);
		createEAttribute(genOrmModelEClass, GEN_ORM_MODEL__DATABASE_USERNAME);
		createEAttribute(genOrmModelEClass, GEN_ORM_MODEL__DATABASE_PASSWORD);
		createEAttribute(genOrmModelEClass, GEN_ORM_MODEL__DATABASE_PREFIX);

		genCollectionTypeEClass = createEClass(GEN_COLLECTION_TYPE);
		createEReference(genCollectionTypeEClass, GEN_COLLECTION_TYPE__ORM_COLLECTION_TYPE);

		genClassifierEClass = createEClass(GEN_CLASSIFIER);

		genDataTypeEClass = createEClass(GEN_DATA_TYPE);
		createEReference(genDataTypeEClass, GEN_DATA_TYPE__ORM_DATA_TYPE);
		createEAttribute(genDataTypeEClass, GEN_DATA_TYPE__JAVA_TYPE);
		createEAttribute(genDataTypeEClass, GEN_DATA_TYPE__JAVA_DEFAULT_VALUE);
		createEAttribute(genDataTypeEClass, GEN_DATA_TYPE__PERSISTENCE_TYPE);

		genEntityEClass = createEClass(GEN_ENTITY);
		createEReference(genEntityEClass, GEN_ENTITY__ORM_ENTITY);
		createEReference(genEntityEClass, GEN_ENTITY__GEN_PART_OF);
		createEAttribute(genEntityEClass, GEN_ENTITY__DEFAULT_TABLE_NAME);
		createEAttribute(genEntityEClass, GEN_ENTITY__TABLE_NAME);
		createEAttribute(genEntityEClass, GEN_ENTITY__KEY_NAME);
		createEReference(genEntityEClass, GEN_ENTITY__GEN_FEATURES);
		createEAttribute(genEntityEClass, GEN_ENTITY__XML_TRANSIENT);
		createEAttribute(genEntityEClass, GEN_ENTITY__XML_ROOT_ELEMENT);
		createEAttribute(genEntityEClass, GEN_ENTITY__XML_NAMESPACE);
		createEAttribute(genEntityEClass, GEN_ENTITY__XML_NAME);

		genFeatureEClass = createEClass(GEN_FEATURE);
		createEReference(genFeatureEClass, GEN_FEATURE__GEN_PARENT_ENTITY);
		createEAttribute(genFeatureEClass, GEN_FEATURE__XML_TRANSIENT);

		genAttributeEClass = createEClass(GEN_ATTRIBUTE);

		genSingletonAttributeEClass = createEClass(GEN_SINGLETON_ATTRIBUTE);
		createEReference(genSingletonAttributeEClass, GEN_SINGLETON_ATTRIBUTE__GEN_DEFAULT_VALUE);
		createEAttribute(genSingletonAttributeEClass, GEN_SINGLETON_ATTRIBUTE__COLUMN_NAME);

		genCollectionAttributeEClass = createEClass(GEN_COLLECTION_ATTRIBUTE);
		createEAttribute(genCollectionAttributeEClass, GEN_COLLECTION_ATTRIBUTE__TABLE_NAME);
		createEAttribute(genCollectionAttributeEClass, GEN_COLLECTION_ATTRIBUTE__COLUMN_NAME);

		genSingletonElementEClass = createEClass(GEN_SINGLETON_ELEMENT);
		createEReference(genSingletonElementEClass, GEN_SINGLETON_ELEMENT__ORM_FEATURE);
		createEReference(genSingletonElementEClass, GEN_SINGLETON_ELEMENT__GEN_DATA_TYPE);

		genCollectionElementEClass = createEClass(GEN_COLLECTION_ELEMENT);
		createEReference(genCollectionElementEClass, GEN_COLLECTION_ELEMENT__ORM_FEATURE);

		genSingletonDateEClass = createEClass(GEN_SINGLETON_DATE);
		createEReference(genSingletonDateEClass, GEN_SINGLETON_DATE__ORM_FEATURE);

		genCollectionDateEClass = createEClass(GEN_COLLECTION_DATE);
		createEReference(genCollectionDateEClass, GEN_COLLECTION_DATE__ORM_FEATURE);

		genSingletonFileEClass = createEClass(GEN_SINGLETON_FILE);
		createEReference(genSingletonFileEClass, GEN_SINGLETON_FILE__ORM_FEATURE);

		genSingletonLocationEClass = createEClass(GEN_SINGLETON_LOCATION);
		createEReference(genSingletonLocationEClass, GEN_SINGLETON_LOCATION__ORM_FEATURE);

		genAssociationEClass = createEClass(GEN_ASSOCIATION);
		createEReference(genAssociationEClass, GEN_ASSOCIATION__GEN_OPPOSITE);
		createEAttribute(genAssociationEClass, GEN_ASSOCIATION__FEATURE_NAME);

		genSingletonAssociationEClass = createEClass(GEN_SINGLETON_ASSOCIATION);
		createEReference(genSingletonAssociationEClass, GEN_SINGLETON_ASSOCIATION__ORM_FEATURE);
		createEAttribute(genSingletonAssociationEClass, GEN_SINGLETON_ASSOCIATION__COLUMN_NAME);

		genCollectionAssociationEClass = createEClass(GEN_COLLECTION_ASSOCIATION);
		createEReference(genCollectionAssociationEClass, GEN_COLLECTION_ASSOCIATION__ORM_FEATURE);
		createEAttribute(genCollectionAssociationEClass, GEN_COLLECTION_ASSOCIATION__PIVOT_TABLE_NAME);
		createEAttribute(genCollectionAssociationEClass, GEN_COLLECTION_ASSOCIATION__PIVOT_COLUMN_NAME);

		// Create enums
		ormTechnologiesEEnum = createEEnum(ORM_TECHNOLOGIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OrmPackage theOrmPackage = (OrmPackage)EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI);
		GencriteriaPackage theGencriteriaPackage = (GencriteriaPackage)EPackage.Registry.INSTANCE.getEPackage(GencriteriaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		genCollectionTypeEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genClassifierEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genDataTypeEClass.getESuperTypes().add(this.getGenClassifier());
		genEntityEClass.getESuperTypes().add(this.getGenClassifier());
		genFeatureEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genAttributeEClass.getESuperTypes().add(this.getGenFeature());
		genSingletonAttributeEClass.getESuperTypes().add(this.getGenAttribute());
		genCollectionAttributeEClass.getESuperTypes().add(this.getGenAttribute());
		genSingletonElementEClass.getESuperTypes().add(this.getGenSingletonAttribute());
		genCollectionElementEClass.getESuperTypes().add(this.getGenCollectionAttribute());
		genSingletonDateEClass.getESuperTypes().add(this.getGenSingletonAttribute());
		genCollectionDateEClass.getESuperTypes().add(this.getGenCollectionAttribute());
		genSingletonFileEClass.getESuperTypes().add(this.getGenSingletonAttribute());
		genSingletonLocationEClass.getESuperTypes().add(this.getGenSingletonAttribute());
		genAssociationEClass.getESuperTypes().add(this.getGenFeature());
		genSingletonAssociationEClass.getESuperTypes().add(this.getGenAssociation());
		genCollectionAssociationEClass.getESuperTypes().add(this.getGenAssociation());

		// Initialize classes and features; add operations and parameters
		initEClass(genOrmModelEClass, GenOrmModel.class, "GenOrmModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenOrmModel_OrmModel(), theOrmPackage.getOrmModel(), null, "ormModel", null, 1, 1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenOrmModel_GenCollectionTypes(), this.getGenCollectionType(), null, "genCollectionTypes", null, 0, -1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenOrmModel_GenDataTypes(), this.getGenDataType(), null, "genDataTypes", null, 0, -1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenOrmModel_GenEntities(), this.getGenEntity(), this.getGenEntity_GenPartOf(), "genEntities", null, 0, -1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenOrmModel_OrmTechnology(), this.getOrmTechnologies(), "ormTechnology", "JPA2", 1, 1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenOrmModel_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenOrmModel_DomainPackage(), ecorePackage.getEString(), "domainPackage", "domain", 1, 1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenOrmModel_IncludeXmlBindingAnnotations(), ecorePackage.getEBooleanObject(), "includeXmlBindingAnnotations", null, 0, 1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenOrmModel_DaoPackage(), ecorePackage.getEString(), "daoPackage", "dao", 1, 1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenOrmModel_DaoImplPackage(), ecorePackage.getEString(), "daoImplPackage", "dao.hibernate", 1, 1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenOrmModel_DatabaseHost(), ecorePackage.getEString(), "databaseHost", "localhost", 1, 1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenOrmModel_DatabaseName(), ecorePackage.getEString(), "databaseName", null, 1, 1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenOrmModel_DatabaseUsername(), ecorePackage.getEString(), "databaseUsername", null, 1, 1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenOrmModel_DatabasePassword(), ecorePackage.getEString(), "databasePassword", null, 1, 1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenOrmModel_DatabasePrefix(), ecorePackage.getEString(), "databasePrefix", "localhost", 1, 1, GenOrmModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genCollectionTypeEClass, GenCollectionType.class, "GenCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCollectionType_OrmCollectionType(), theOrmPackage.getCollectionType(), null, "ormCollectionType", null, 1, 1, GenCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genClassifierEClass, GenClassifier.class, "GenClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genDataTypeEClass, GenDataType.class, "GenDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDataType_OrmDataType(), theOrmPackage.getDataType(), null, "ormDataType", null, 1, 1, GenDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDataType_JavaType(), ecorePackage.getEString(), "javaType", null, 1, 1, GenDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDataType_JavaDefaultValue(), ecorePackage.getEString(), "javaDefaultValue", null, 1, 1, GenDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenDataType_PersistenceType(), ecorePackage.getEString(), "persistenceType", null, 1, 1, GenDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genEntityEClass, GenEntity.class, "GenEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenEntity_OrmEntity(), theOrmPackage.getEntity(), null, "ormEntity", null, 1, 1, GenEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenEntity_GenPartOf(), this.getGenOrmModel(), this.getGenOrmModel_GenEntities(), "genPartOf", null, 1, 1, GenEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenEntity_DefaultTableName(), ecorePackage.getEString(), "defaultTableName", null, 1, 1, GenEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEntity_TableName(), ecorePackage.getEString(), "tableName", null, 1, 1, GenEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEntity_KeyName(), ecorePackage.getEString(), "keyName", null, 1, 1, GenEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenEntity_GenFeatures(), this.getGenFeature(), this.getGenFeature_GenParentEntity(), "genFeatures", null, 0, -1, GenEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEntity_XmlTransient(), ecorePackage.getEBooleanObject(), "xmlTransient", null, 1, 1, GenEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEntity_XmlRootElement(), ecorePackage.getEBooleanObject(), "xmlRootElement", null, 1, 1, GenEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEntity_XmlNamespace(), ecorePackage.getEString(), "xmlNamespace", null, 1, 1, GenEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenEntity_XmlName(), ecorePackage.getEString(), "xmlName", null, 1, 1, GenEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genFeatureEClass, GenFeature.class, "GenFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenFeature_GenParentEntity(), this.getGenEntity(), this.getGenEntity_GenFeatures(), "genParentEntity", null, 1, 1, GenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenFeature_XmlTransient(), ecorePackage.getEBooleanObject(), "xmlTransient", null, 1, 1, GenFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genAttributeEClass, GenAttribute.class, "GenAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genSingletonAttributeEClass, GenSingletonAttribute.class, "GenSingletonAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenSingletonAttribute_GenDefaultValue(), theGencriteriaPackage.getGenExpression(), null, "genDefaultValue", null, 0, 1, GenSingletonAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenSingletonAttribute_ColumnName(), ecorePackage.getEString(), "columnName", null, 1, 1, GenSingletonAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genCollectionAttributeEClass, GenCollectionAttribute.class, "GenCollectionAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenCollectionAttribute_TableName(), ecorePackage.getEString(), "tableName", null, 1, 1, GenCollectionAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenCollectionAttribute_ColumnName(), ecorePackage.getEString(), "columnName", null, 1, 1, GenCollectionAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genSingletonElementEClass, GenSingletonElement.class, "GenSingletonElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenSingletonElement_OrmFeature(), theOrmPackage.getSingletonElement(), null, "ormFeature", null, 1, 1, GenSingletonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenSingletonElement_GenDataType(), this.getGenDataType(), null, "genDataType", null, 1, 1, GenSingletonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genCollectionElementEClass, GenCollectionElement.class, "GenCollectionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCollectionElement_OrmFeature(), theOrmPackage.getCollectionElement(), null, "ormFeature", null, 1, 1, GenCollectionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genSingletonDateEClass, GenSingletonDate.class, "GenSingletonDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenSingletonDate_OrmFeature(), theOrmPackage.getSingletonDate(), null, "ormFeature", null, 1, 1, GenSingletonDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genCollectionDateEClass, GenCollectionDate.class, "GenCollectionDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCollectionDate_OrmFeature(), theOrmPackage.getCollectionDate(), null, "ormFeature", null, 1, 1, GenCollectionDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genSingletonFileEClass, GenSingletonFile.class, "GenSingletonFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenSingletonFile_OrmFeature(), theOrmPackage.getSingletonFile(), null, "ormFeature", null, 1, 1, GenSingletonFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genSingletonLocationEClass, GenSingletonLocation.class, "GenSingletonLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenSingletonLocation_OrmFeature(), theOrmPackage.getSingletonLocation(), null, "ormFeature", null, 1, 1, GenSingletonLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genAssociationEClass, GenAssociation.class, "GenAssociation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenAssociation_GenOpposite(), this.getGenAssociation(), this.getGenAssociation_GenOpposite(), "genOpposite", null, 1, 1, GenAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenAssociation_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, GenAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genSingletonAssociationEClass, GenSingletonAssociation.class, "GenSingletonAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenSingletonAssociation_OrmFeature(), theOrmPackage.getSingletonAssociation(), null, "ormFeature", null, 1, 1, GenSingletonAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenSingletonAssociation_ColumnName(), ecorePackage.getEString(), "columnName", null, 1, 1, GenSingletonAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genCollectionAssociationEClass, GenCollectionAssociation.class, "GenCollectionAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCollectionAssociation_OrmFeature(), theOrmPackage.getCollectionAssociation(), null, "ormFeature", null, 1, 1, GenCollectionAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenCollectionAssociation_PivotTableName(), ecorePackage.getEString(), "pivotTableName", null, 1, 1, GenCollectionAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenCollectionAssociation_PivotColumnName(), ecorePackage.getEString(), "pivotColumnName", null, 1, 1, GenCollectionAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ormTechnologiesEEnum, OrmTechnologies.class, "OrmTechnologies");
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.JPA2);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.HBM);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.DATAMAPPER_ORM);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.GAS_ORM);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

} //GenOrmPackageImpl
