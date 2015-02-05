/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenJsfPackageImpl.java,v 1.114 2014/08/22 14:32:38 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage;
import uk.ac.man.cs.mdsd.genjsf.GenActionUnit;
import uk.ac.man.cs.mdsd.genjsf.GenAuthentication;
import uk.ac.man.cs.mdsd.genjsf.GenAuthenticationUnit;
import uk.ac.man.cs.mdsd.genjsf.GenCaptchaField;
import uk.ac.man.cs.mdsd.genjsf.GenCasAuthentication;
import uk.ac.man.cs.mdsd.genjsf.GenCommand;
import uk.ac.man.cs.mdsd.genjsf.GenCommandUnit;
import uk.ac.man.cs.mdsd.genjsf.GenContentUnit;
import uk.ac.man.cs.mdsd.genjsf.GenControlUnit;
import uk.ac.man.cs.mdsd.genjsf.GenCreateSitemapUnit;
import uk.ac.man.cs.mdsd.genjsf.GenCreateUnit;
import uk.ac.man.cs.mdsd.genjsf.GenCreateUpdateUnit;
import uk.ac.man.cs.mdsd.genjsf.GenCurrentUserReference;
import uk.ac.man.cs.mdsd.genjsf.GenDataTypeField;
import uk.ac.man.cs.mdsd.genjsf.GenDataUnit;
import uk.ac.man.cs.mdsd.genjsf.GenDateField;
import uk.ac.man.cs.mdsd.genjsf.GenDeleteAction;
import uk.ac.man.cs.mdsd.genjsf.GenDetailsUnit;
import uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu;
import uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit;
import uk.ac.man.cs.mdsd.genjsf.GenEditStaticTextMenuEntry;
import uk.ac.man.cs.mdsd.genjsf.GenEditUnit;
import uk.ac.man.cs.mdsd.genjsf.GenFeatureReference;
import uk.ac.man.cs.mdsd.genjsf.GenFeatureSupportAction;
import uk.ac.man.cs.mdsd.genjsf.GenFixedActionMenuEntry;
import uk.ac.man.cs.mdsd.genjsf.GenFixedCommandMenuEntry;
import uk.ac.man.cs.mdsd.genjsf.GenFixedPageMenuEntry;
import uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit;
import uk.ac.man.cs.mdsd.genjsf.GenIncludedAssociation;
import uk.ac.man.cs.mdsd.genjsf.GenIncludedElement;
import uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature;
import uk.ac.man.cs.mdsd.genjsf.GenIndexGridUnit;
import uk.ac.man.cs.mdsd.genjsf.GenIndexLineDirectionUnit;
import uk.ac.man.cs.mdsd.genjsf.GenIndexPageDirectionUnit;
import uk.ac.man.cs.mdsd.genjsf.GenIndexUnit;
import uk.ac.man.cs.mdsd.genjsf.GenInlineAction;
import uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer;
import uk.ac.man.cs.mdsd.genjsf.GenInterfaceField;
import uk.ac.man.cs.mdsd.genjsf.GenJsfFactory;
import uk.ac.man.cs.mdsd.genjsf.GenJsfModel;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.genjsf.GenLoginUnit;
import uk.ac.man.cs.mdsd.genjsf.GenMapUnit;
import uk.ac.man.cs.mdsd.genjsf.GenMenu;
import uk.ac.man.cs.mdsd.genjsf.GenMenuEntry;
import uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedElement;
import uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedFeature;
import uk.ac.man.cs.mdsd.genjsf.GenModelLabel;
import uk.ac.man.cs.mdsd.genjsf.GenModelReference;
import uk.ac.man.cs.mdsd.genjsf.GenPage;
import uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit;
import uk.ac.man.cs.mdsd.genjsf.GenSearchUnit;
import uk.ac.man.cs.mdsd.genjsf.GenSelectAction;
import uk.ac.man.cs.mdsd.genjsf.GenSelectTarget;
import uk.ac.man.cs.mdsd.genjsf.GenSelection;
import uk.ac.man.cs.mdsd.genjsf.GenService;
import uk.ac.man.cs.mdsd.genjsf.GenServiceAssociation;
import uk.ac.man.cs.mdsd.genjsf.GenServiceEntityAssociation;
import uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement;
import uk.ac.man.cs.mdsd.genjsf.GenServiceEntityFeature;
import uk.ac.man.cs.mdsd.genjsf.GenServiceFeature;
import uk.ac.man.cs.mdsd.genjsf.GenServiceViewAssociation;
import uk.ac.man.cs.mdsd.genjsf.GenStaticMenu;
import uk.ac.man.cs.mdsd.genjsf.GenStaticUnit;
import uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation;
import uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation;
import uk.ac.man.cs.mdsd.genjsf.GenUnitChildElement;
import uk.ac.man.cs.mdsd.genjsf.GenUnitChildFeature;
import uk.ac.man.cs.mdsd.genjsf.GenUnitContainer;
import uk.ac.man.cs.mdsd.genjsf.GenUnitElement;
import uk.ac.man.cs.mdsd.genjsf.GenUnitFeature;
import uk.ac.man.cs.mdsd.genjsf.GenUnitField;
import uk.ac.man.cs.mdsd.genjsf.GenUnitSupportAction;
import uk.ac.man.cs.mdsd.genjsf.GenUnitTitle;
import uk.ac.man.cs.mdsd.genjsf.GenUpdateUnit;
import uk.ac.man.cs.mdsd.genjsf.GenUserCommand;
import uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions;
import uk.ac.man.cs.mdsd.genjsf.InputMessagePlacementOptions;
import uk.ac.man.cs.mdsd.genjsf.SelectManyOptions;
import uk.ac.man.cs.mdsd.genjsf.SelectOneofOptions;

import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;

import uk.ac.man.cs.mdsd.jsf.JsfPackage;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenJsfPackageImpl extends EPackageImpl implements GenJsfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genJsfModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAuthenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCasAuthenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLocalAuthenticationSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genModelLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genServiceFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genServiceEntityFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genServiceEntityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genServiceAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genServiceEntityAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genServiceViewAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genIncludedFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genIncludedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genIncludedAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genSelectTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genMenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genStaticMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFixedPageMenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFixedActionMenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFixedCommandMenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genEditStaticTextMenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genMenuIncludedFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genMenuIncludedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDynamicMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genUnitContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genUnitTitleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genContentUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCreateSitemapUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genUnitFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genUnitFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genUnitElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genUnitAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genUnitChildFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genUnitChildElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genUnitChildAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genInterfaceFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDataTypeFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDateFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCaptchaFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genUnitSupportActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genStaticUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCommandUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genUserCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDynamicUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genEditUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCreateUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCreateUpdateUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genMapUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genUpdateUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDataUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDetailsUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genIndexUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genIndexGridUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genIndexPageDirectionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genIndexLineDirectionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genControlUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genSearchUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genActionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAuthenticationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genRegistrationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLoginUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genForgottenPasswordUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genInlineActionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genInlineActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genSelectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDeleteActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFeatureSupportActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFeatureReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genModelReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCurrentUserReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum selectOneofOptionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum selectManyOptionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inputMessagePlacementOptionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inputMessageDisplayOptionsEEnum = null;

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
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenJsfPackageImpl() {
		super(eNS_URI, GenJsfFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GenJsfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenJsfPackage init() {
		if (isInited) return (GenJsfPackage)EPackage.Registry.INSTANCE.getEPackage(GenJsfPackage.eNS_URI);

		// Obtain or create and register package
		GenJsfPackageImpl theGenJsfPackage = (GenJsfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GenJsfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GenJsfPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GenOrmPackage.eINSTANCE.eClass();
		JsfPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGenJsfPackage.createPackageContents();

		// Initialize created meta-data
		theGenJsfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenJsfPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenJsfPackage.eNS_URI, theGenJsfPackage);
		return theGenJsfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenJsfModel() {
		return genJsfModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenJsfModel_JsfModel() {
		return (EReference)genJsfModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenJsfModel_GenAuthentication() {
		return (EReference)genJsfModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenJsfModel_GenServices() {
		return (EReference)genJsfModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenJsfModel_GenPages() {
		return (EReference)genJsfModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenJsfModel_GenMenus() {
		return (EReference)genJsfModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenJsfModel_BaseURL() {
		return (EAttribute)genJsfModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenJsfModel_RewriteURLs() {
		return (EAttribute)genJsfModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenJsfModel_DevelopmentVersion() {
		return (EAttribute)genJsfModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenJsfModel_TextEditorPath() {
		return (EAttribute)genJsfModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenJsfModel_BackingPackage() {
		return (EAttribute)genJsfModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenJsfModel_ConverterPackage() {
		return (EAttribute)genJsfModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenJsfModel_ValidatorPackage() {
		return (EAttribute)genJsfModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenJsfModel_ServicePackage() {
		return (EAttribute)genJsfModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenJsfModel_SecurityPackage() {
		return (EAttribute)genJsfModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenJsfModel_UiPackage() {
		return (EAttribute)genJsfModelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAuthentication() {
		return genAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCasAuthentication() {
		return genCasAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCasAuthentication_JsfAuthentication() {
		return (EReference)genCasAuthenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLocalAuthenticationSystem() {
		return genLocalAuthenticationSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLocalAuthenticationSystem_JsfAuthentication() {
		return (EReference)genLocalAuthenticationSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLocalAuthenticationSystem_GenUserService() {
		return (EReference)genLocalAuthenticationSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLocalAuthenticationSystem_GenUserAuthenticationKey() {
		return (EReference)genLocalAuthenticationSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLocalAuthenticationSystem_GenAuthenticationService() {
		return (EReference)genLocalAuthenticationSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLocalAuthenticationSystem_GenLoginAttemptService() {
		return (EReference)genLocalAuthenticationSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLocalAuthenticationSystem_GenAutoLoginService() {
		return (EReference)genLocalAuthenticationSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLocalAuthenticationSystem_GenRegistrationUnit() {
		return (EReference)genLocalAuthenticationSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLocalAuthenticationSystem_GenLoginUnit() {
		return (EReference)genLocalAuthenticationSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLocalAuthenticationSystem_GenForgottenPasswordUnit() {
		return (EReference)genLocalAuthenticationSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLocalAuthenticationSystem_LoginMaximumAttempts() {
		return (EAttribute)genLocalAuthenticationSystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLocalAuthenticationSystem_LoginAttemptExpiryPeriod() {
		return (EAttribute)genLocalAuthenticationSystemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLocalAuthenticationSystem_AutologinCookieLifetime() {
		return (EAttribute)genLocalAuthenticationSystemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenService() {
		return genServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenService_JsfService() {
		return (EReference)genServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenService_GenEntities() {
		return (EReference)genServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenService_GenDisplayLabels() {
		return (EReference)genServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenService_GenSelections() {
		return (EReference)genServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenService_GenFeatures() {
		return (EReference)genServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenService_GenAccessedBy() {
		return (EReference)genServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenService_DefaultViewName() {
		return (EAttribute)genServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenService_ViewName() {
		return (EAttribute)genServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenModelLabel() {
		return genModelLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenModelLabel_GenLabelFor() {
		return (EReference)genModelLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenModelLabel_JsfLabel() {
		return (EReference)genModelLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenModelLabel_GenFeatures() {
		return (EReference)genModelLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenServiceFeature() {
		return genServiceFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenServiceFeature_GenIncludedBy() {
		return (EReference)genServiceFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenServiceEntityFeature() {
		return genServiceEntityFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenServiceEntityFeature_ColumnName() {
		return (EAttribute)genServiceEntityFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenServiceEntityElement() {
		return genServiceEntityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenServiceEntityElement_JsfFeature() {
		return (EReference)genServiceEntityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenServiceEntityElement_GenFeature() {
		return (EReference)genServiceEntityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenServiceAssociation() {
		return genServiceAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenServiceEntityAssociation() {
		return genServiceEntityAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenServiceEntityAssociation_JsfFeature() {
		return (EReference)genServiceEntityAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenServiceEntityAssociation_GenFeature() {
		return (EReference)genServiceEntityAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenServiceViewAssociation() {
		return genServiceViewAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenServiceViewAssociation_JsfFeature() {
		return (EReference)genServiceViewAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenServiceViewAssociation_GenTargetFeature() {
		return (EReference)genServiceViewAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenSelection() {
		return genSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSelection_JsfSelection() {
		return (EReference)genSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSelection_GenFilter() {
		return (EReference)genSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSelection_GenOrdering() {
		return (EReference)genSelectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenIncludedFeature() {
		return genIncludedFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenIncludedFeature_GenForcedValue() {
		return (EReference)genIncludedFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenIncludedFeature_MessageDisplayOption() {
		return (EAttribute)genIncludedFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenIncludedElement() {
		return genIncludedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenIncludedElement_GenDefaultValue() {
		return (EReference)genIncludedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenIncludedAssociation() {
		return genIncludedAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPage() {
		return genPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPage_JsfPage() {
		return (EReference)genPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPage_GenPartOf() {
		return (EReference)genPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPage_GenParentPage() {
		return (EReference)genPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPage_GenChildPages() {
		return (EReference)genPageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPage_GenSideMenu() {
		return (EReference)genPageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenSelectTarget() {
		return genSelectTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSelectTarget_GenTargettingActions() {
		return (EReference)genSelectTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenMenu() {
		return genMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMenu_GenEntries() {
		return (EReference)genMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenMenuEntry() {
		return genMenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMenuEntry_GenPartOf() {
		return (EReference)genMenuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenStaticMenu() {
		return genStaticMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenStaticMenu_JsfMenu() {
		return (EReference)genStaticMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFixedPageMenuEntry() {
		return genFixedPageMenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFixedPageMenuEntry_JsfMenuEntry() {
		return (EReference)genFixedPageMenuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFixedPageMenuEntry_GenDestination() {
		return (EReference)genFixedPageMenuEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFixedActionMenuEntry() {
		return genFixedActionMenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFixedActionMenuEntry_JsfMenuEntry() {
		return (EReference)genFixedActionMenuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFixedActionMenuEntry_GenDestination() {
		return (EReference)genFixedActionMenuEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFixedCommandMenuEntry() {
		return genFixedCommandMenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFixedCommandMenuEntry_JsfMenuEntry() {
		return (EReference)genFixedCommandMenuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFixedCommandMenuEntry_GenDestination() {
		return (EReference)genFixedCommandMenuEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenEditStaticTextMenuEntry() {
		return genEditStaticTextMenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditStaticTextMenuEntry_JsfMenuEntry() {
		return (EReference)genEditStaticTextMenuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenMenuIncludedFeature() {
		return genMenuIncludedFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenMenuIncludedElement() {
		return genMenuIncludedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMenuIncludedElement_JsfMenuEntry() {
		return (EReference)genMenuIncludedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDynamicMenu() {
		return genDynamicMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDynamicMenu_JsfMenu() {
		return (EReference)genDynamicMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDynamicMenu_GenService() {
		return (EReference)genDynamicMenuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDynamicMenu_GenSelection() {
		return (EReference)genDynamicMenuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDynamicMenu_GenDynamicTitle() {
		return (EReference)genDynamicMenuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenUnitContainer() {
		return genUnitContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitContainer_GenUnits() {
		return (EReference)genUnitContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenUnitTitle() {
		return genUnitTitleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenContentUnit() {
		return genContentUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenContentUnit_GenDisplayedOn() {
		return (EReference)genContentUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCreateSitemapUnit() {
		return genCreateSitemapUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCreateSitemapUnit_JsfUnit() {
		return (EReference)genCreateSitemapUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenUnitField() {
		return genUnitFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitField_GenDisplayedOn() {
		return (EReference)genUnitFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenUnitFeature() {
		return genUnitFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenUnitElement() {
		return genUnitElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitElement_JsfFeature() {
		return (EReference)genUnitElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitElement_GenServiceFeature() {
		return (EReference)genUnitElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenUnitAssociation() {
		return genUnitAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitAssociation_JsfFeature() {
		return (EReference)genUnitAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitAssociation_GenServiceFeature() {
		return (EReference)genUnitAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitAssociation_GenChildFeature() {
		return (EReference)genUnitAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitAssociation_GenSelection() {
		return (EReference)genUnitAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitAssociation_GenDynamicLabel() {
		return (EReference)genUnitAssociationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitAssociation_GenFilters() {
		return (EReference)genUnitAssociationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenUnitAssociation_SelectOneOfOption() {
		return (EAttribute)genUnitAssociationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenUnitAssociation_SelectManyOption() {
		return (EAttribute)genUnitAssociationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenUnitChildFeature() {
		return genUnitChildFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenUnitChildElement() {
		return genUnitChildElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitChildElement_JsfChildFeature() {
		return (EReference)genUnitChildElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitChildElement_GenServiceFeature() {
		return (EReference)genUnitChildElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenUnitChildAssociation() {
		return genUnitChildAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitChildAssociation_JsfChildFeature() {
		return (EReference)genUnitChildAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitChildAssociation_GenServiceFeature() {
		return (EReference)genUnitChildAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitChildAssociation_GenChildFeature() {
		return (EReference)genUnitChildAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenInterfaceField() {
		return genInterfaceFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenInterfaceField_GenMustMatch() {
		return (EReference)genInterfaceFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenInterfaceField_GenDefaultValue() {
		return (EReference)genInterfaceFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDataTypeField() {
		return genDataTypeFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDataTypeField_GenDataType() {
		return (EReference)genDataTypeFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDataTypeField_JsfField() {
		return (EReference)genDataTypeFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDateField() {
		return genDateFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDateField_JsfField() {
		return (EReference)genDateFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCaptchaField() {
		return genCaptchaFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCaptchaField_JsfField() {
		return (EReference)genCaptchaFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenUnitSupportAction() {
		return genUnitSupportActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUnitSupportAction_JsfAction() {
		return (EReference)genUnitSupportActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenStaticUnit() {
		return genStaticUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenStaticUnit_JsfUnit() {
		return (EReference)genStaticUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenStaticUnit_GenService() {
		return (EReference)genStaticUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCommandUnit() {
		return genCommandUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCommandUnit_JsfUnit() {
		return (EReference)genCommandUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCommandUnit_GenCommands() {
		return (EReference)genCommandUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCommand() {
		return genCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCommand_GenPartOf() {
		return (EReference)genCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenUserCommand() {
		return genUserCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUserCommand_JsfCommand() {
		return (EReference)genUserCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDynamicUnit() {
		return genDynamicUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDynamicUnit_GenService() {
		return (EReference)genDynamicUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDynamicUnit_GenDisplayFields() {
		return (EReference)genDynamicUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDynamicUnit_GenSupportActions() {
		return (EReference)genDynamicUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenEditUnit() {
		return genEditUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditUnit_MessagePlacementOption() {
		return (EAttribute)genEditUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditUnit_FormMessageDisplayOption() {
		return (EAttribute)genEditUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditUnit_GenConfirmDestination() {
		return (EReference)genEditUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditUnit_GenCancelDestination() {
		return (EReference)genEditUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCreateUnit() {
		return genCreateUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCreateUnit_JsfUnit() {
		return (EReference)genCreateUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCreateUpdateUnit() {
		return genCreateUpdateUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCreateUpdateUnit_JsfUnit() {
		return (EReference)genCreateUpdateUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenMapUnit() {
		return genMapUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMapUnit_JsfUnit() {
		return (EReference)genMapUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMapUnit_GenLocation() {
		return (EReference)genMapUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMapUnit_GenPlaceName() {
		return (EReference)genMapUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenUpdateUnit() {
		return genUpdateUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenUpdateUnit_JsfUnit() {
		return (EReference)genUpdateUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDataUnit() {
		return genDataUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDataUnit_GenSelection() {
		return (EReference)genDataUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDataUnit_GenDynamicTitle() {
		return (EReference)genDataUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDetailsUnit() {
		return genDetailsUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDetailsUnit_JsfUnit() {
		return (EReference)genDetailsUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenIndexUnit() {
		return genIndexUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenIndexUnit_JsfUnit() {
		return (EReference)genIndexUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenIndexUnit_GenTargettingSearches() {
		return (EReference)genIndexUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenIndexGridUnit() {
		return genIndexGridUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenIndexPageDirectionUnit() {
		return genIndexPageDirectionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenIndexLineDirectionUnit() {
		return genIndexLineDirectionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenControlUnit() {
		return genControlUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenControlUnit_MessagePlacementOption() {
		return (EAttribute)genControlUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenControlUnit_GenCancelDestination() {
		return (EReference)genControlUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenSearchUnit() {
		return genSearchUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSearchUnit_JsfUnit() {
		return (EReference)genSearchUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSearchUnit_GenResultDestination() {
		return (EReference)genSearchUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenActionUnit() {
		return genActionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenActionUnit_JsfUnit() {
		return (EReference)genActionUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAuthenticationUnit() {
		return genAuthenticationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenRegistrationUnit() {
		return genRegistrationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenRegistrationUnit_JsfUnit() {
		return (EReference)genRegistrationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenRegistrationUnit_GenAuthenticationSystem() {
		return (EReference)genRegistrationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLoginUnit() {
		return genLoginUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLoginUnit_JsfUnit() {
		return (EReference)genLoginUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLoginUnit_GenAuthenticationSystem() {
		return (EReference)genLoginUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLoginUnit_GenLoginIdField() {
		return (EReference)genLoginUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLoginUnit_GenPasswordField() {
		return (EReference)genLoginUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLoginUnit_GenRememberMeField() {
		return (EReference)genLoginUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenForgottenPasswordUnit() {
		return genForgottenPasswordUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenForgottenPasswordUnit_JsfUnit() {
		return (EReference)genForgottenPasswordUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenForgottenPasswordUnit_GenAuthenticationSystem() {
		return (EReference)genForgottenPasswordUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenForgottenPasswordUnit_GenLoginIdField() {
		return (EReference)genForgottenPasswordUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenInlineActionContainer() {
		return genInlineActionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenInlineActionContainer_GenActions() {
		return (EReference)genInlineActionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenInlineAction() {
		return genInlineActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenInlineAction_JsfAction() {
		return (EReference)genInlineActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenInlineAction_GenUsedBy() {
		return (EReference)genInlineActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenSelectAction() {
		return genSelectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSelectAction_GenTarget() {
		return (EReference)genSelectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDeleteAction() {
		return genDeleteActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDeleteAction_GenDestination() {
		return (EReference)genDeleteActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFeatureSupportAction() {
		return genFeatureSupportActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFeatureReference() {
		return genFeatureReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFeatureReference_CriteriaPath() {
		return (EReference)genFeatureReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFeatureReference_GenField() {
		return (EReference)genFeatureReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenModelReference() {
		return genModelReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenModelReference_CriteriaPath() {
		return (EReference)genModelReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenModelReference_GenUnit() {
		return (EReference)genModelReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCurrentUserReference() {
		return genCurrentUserReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCurrentUserReference_CriteriaPath() {
		return (EReference)genCurrentUserReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSelectOneofOptions() {
		return selectOneofOptionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSelectManyOptions() {
		return selectManyOptionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInputMessagePlacementOptions() {
		return inputMessagePlacementOptionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInputMessageDisplayOptions() {
		return inputMessageDisplayOptionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenJsfFactory getGenJsfFactory() {
		return (GenJsfFactory)getEFactoryInstance();
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
		genJsfModelEClass = createEClass(GEN_JSF_MODEL);
		createEReference(genJsfModelEClass, GEN_JSF_MODEL__JSF_MODEL);
		createEReference(genJsfModelEClass, GEN_JSF_MODEL__GEN_AUTHENTICATION);
		createEReference(genJsfModelEClass, GEN_JSF_MODEL__GEN_SERVICES);
		createEReference(genJsfModelEClass, GEN_JSF_MODEL__GEN_PAGES);
		createEReference(genJsfModelEClass, GEN_JSF_MODEL__GEN_MENUS);
		createEAttribute(genJsfModelEClass, GEN_JSF_MODEL__BASE_URL);
		createEAttribute(genJsfModelEClass, GEN_JSF_MODEL__REWRITE_UR_LS);
		createEAttribute(genJsfModelEClass, GEN_JSF_MODEL__DEVELOPMENT_VERSION);
		createEAttribute(genJsfModelEClass, GEN_JSF_MODEL__TEXT_EDITOR_PATH);
		createEAttribute(genJsfModelEClass, GEN_JSF_MODEL__BACKING_PACKAGE);
		createEAttribute(genJsfModelEClass, GEN_JSF_MODEL__CONVERTER_PACKAGE);
		createEAttribute(genJsfModelEClass, GEN_JSF_MODEL__VALIDATOR_PACKAGE);
		createEAttribute(genJsfModelEClass, GEN_JSF_MODEL__SERVICE_PACKAGE);
		createEAttribute(genJsfModelEClass, GEN_JSF_MODEL__SECURITY_PACKAGE);
		createEAttribute(genJsfModelEClass, GEN_JSF_MODEL__UI_PACKAGE);

		genAuthenticationEClass = createEClass(GEN_AUTHENTICATION);

		genCasAuthenticationEClass = createEClass(GEN_CAS_AUTHENTICATION);
		createEReference(genCasAuthenticationEClass, GEN_CAS_AUTHENTICATION__JSF_AUTHENTICATION);

		genLocalAuthenticationSystemEClass = createEClass(GEN_LOCAL_AUTHENTICATION_SYSTEM);
		createEReference(genLocalAuthenticationSystemEClass, GEN_LOCAL_AUTHENTICATION_SYSTEM__JSF_AUTHENTICATION);
		createEReference(genLocalAuthenticationSystemEClass, GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_SERVICE);
		createEReference(genLocalAuthenticationSystemEClass, GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_USER_AUTHENTICATION_KEY);
		createEReference(genLocalAuthenticationSystemEClass, GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTHENTICATION_SERVICE);
		createEReference(genLocalAuthenticationSystemEClass, GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_ATTEMPT_SERVICE);
		createEReference(genLocalAuthenticationSystemEClass, GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_AUTO_LOGIN_SERVICE);
		createEReference(genLocalAuthenticationSystemEClass, GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_REGISTRATION_UNIT);
		createEReference(genLocalAuthenticationSystemEClass, GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_LOGIN_UNIT);
		createEReference(genLocalAuthenticationSystemEClass, GEN_LOCAL_AUTHENTICATION_SYSTEM__GEN_FORGOTTEN_PASSWORD_UNIT);
		createEAttribute(genLocalAuthenticationSystemEClass, GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_MAXIMUM_ATTEMPTS);
		createEAttribute(genLocalAuthenticationSystemEClass, GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_EXPIRY_PERIOD);
		createEAttribute(genLocalAuthenticationSystemEClass, GEN_LOCAL_AUTHENTICATION_SYSTEM__AUTOLOGIN_COOKIE_LIFETIME);

		genIncludedFeatureEClass = createEClass(GEN_INCLUDED_FEATURE);
		createEReference(genIncludedFeatureEClass, GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE);
		createEAttribute(genIncludedFeatureEClass, GEN_INCLUDED_FEATURE__MESSAGE_DISPLAY_OPTION);

		genIncludedElementEClass = createEClass(GEN_INCLUDED_ELEMENT);
		createEReference(genIncludedElementEClass, GEN_INCLUDED_ELEMENT__GEN_DEFAULT_VALUE);

		genIncludedAssociationEClass = createEClass(GEN_INCLUDED_ASSOCIATION);

		genServiceEClass = createEClass(GEN_SERVICE);
		createEReference(genServiceEClass, GEN_SERVICE__JSF_SERVICE);
		createEReference(genServiceEClass, GEN_SERVICE__GEN_ENTITIES);
		createEReference(genServiceEClass, GEN_SERVICE__GEN_DISPLAY_LABELS);
		createEReference(genServiceEClass, GEN_SERVICE__GEN_SELECTIONS);
		createEReference(genServiceEClass, GEN_SERVICE__GEN_FEATURES);
		createEReference(genServiceEClass, GEN_SERVICE__GEN_ACCESSED_BY);
		createEAttribute(genServiceEClass, GEN_SERVICE__DEFAULT_VIEW_NAME);
		createEAttribute(genServiceEClass, GEN_SERVICE__VIEW_NAME);

		genModelLabelEClass = createEClass(GEN_MODEL_LABEL);
		createEReference(genModelLabelEClass, GEN_MODEL_LABEL__GEN_LABEL_FOR);
		createEReference(genModelLabelEClass, GEN_MODEL_LABEL__JSF_LABEL);
		createEReference(genModelLabelEClass, GEN_MODEL_LABEL__GEN_FEATURES);

		genSelectionEClass = createEClass(GEN_SELECTION);
		createEReference(genSelectionEClass, GEN_SELECTION__JSF_SELECTION);
		createEReference(genSelectionEClass, GEN_SELECTION__GEN_FILTER);
		createEReference(genSelectionEClass, GEN_SELECTION__GEN_ORDERING);

		genServiceFeatureEClass = createEClass(GEN_SERVICE_FEATURE);
		createEReference(genServiceFeatureEClass, GEN_SERVICE_FEATURE__GEN_INCLUDED_BY);

		genServiceEntityFeatureEClass = createEClass(GEN_SERVICE_ENTITY_FEATURE);
		createEAttribute(genServiceEntityFeatureEClass, GEN_SERVICE_ENTITY_FEATURE__COLUMN_NAME);

		genServiceEntityElementEClass = createEClass(GEN_SERVICE_ENTITY_ELEMENT);
		createEReference(genServiceEntityElementEClass, GEN_SERVICE_ENTITY_ELEMENT__JSF_FEATURE);
		createEReference(genServiceEntityElementEClass, GEN_SERVICE_ENTITY_ELEMENT__GEN_FEATURE);

		genServiceAssociationEClass = createEClass(GEN_SERVICE_ASSOCIATION);

		genServiceEntityAssociationEClass = createEClass(GEN_SERVICE_ENTITY_ASSOCIATION);
		createEReference(genServiceEntityAssociationEClass, GEN_SERVICE_ENTITY_ASSOCIATION__JSF_FEATURE);
		createEReference(genServiceEntityAssociationEClass, GEN_SERVICE_ENTITY_ASSOCIATION__GEN_FEATURE);

		genServiceViewAssociationEClass = createEClass(GEN_SERVICE_VIEW_ASSOCIATION);
		createEReference(genServiceViewAssociationEClass, GEN_SERVICE_VIEW_ASSOCIATION__JSF_FEATURE);
		createEReference(genServiceViewAssociationEClass, GEN_SERVICE_VIEW_ASSOCIATION__GEN_TARGET_FEATURE);

		genPageEClass = createEClass(GEN_PAGE);
		createEReference(genPageEClass, GEN_PAGE__GEN_PART_OF);
		createEReference(genPageEClass, GEN_PAGE__JSF_PAGE);
		createEReference(genPageEClass, GEN_PAGE__GEN_PARENT_PAGE);
		createEReference(genPageEClass, GEN_PAGE__GEN_CHILD_PAGES);
		createEReference(genPageEClass, GEN_PAGE__GEN_SIDE_MENU);

		genSelectTargetEClass = createEClass(GEN_SELECT_TARGET);
		createEReference(genSelectTargetEClass, GEN_SELECT_TARGET__GEN_TARGETTING_ACTIONS);

		genMenuEClass = createEClass(GEN_MENU);
		createEReference(genMenuEClass, GEN_MENU__GEN_ENTRIES);

		genMenuEntryEClass = createEClass(GEN_MENU_ENTRY);
		createEReference(genMenuEntryEClass, GEN_MENU_ENTRY__GEN_PART_OF);

		genStaticMenuEClass = createEClass(GEN_STATIC_MENU);
		createEReference(genStaticMenuEClass, GEN_STATIC_MENU__JSF_MENU);

		genFixedPageMenuEntryEClass = createEClass(GEN_FIXED_PAGE_MENU_ENTRY);
		createEReference(genFixedPageMenuEntryEClass, GEN_FIXED_PAGE_MENU_ENTRY__JSF_MENU_ENTRY);
		createEReference(genFixedPageMenuEntryEClass, GEN_FIXED_PAGE_MENU_ENTRY__GEN_DESTINATION);

		genFixedActionMenuEntryEClass = createEClass(GEN_FIXED_ACTION_MENU_ENTRY);
		createEReference(genFixedActionMenuEntryEClass, GEN_FIXED_ACTION_MENU_ENTRY__JSF_MENU_ENTRY);
		createEReference(genFixedActionMenuEntryEClass, GEN_FIXED_ACTION_MENU_ENTRY__GEN_DESTINATION);

		genFixedCommandMenuEntryEClass = createEClass(GEN_FIXED_COMMAND_MENU_ENTRY);
		createEReference(genFixedCommandMenuEntryEClass, GEN_FIXED_COMMAND_MENU_ENTRY__JSF_MENU_ENTRY);
		createEReference(genFixedCommandMenuEntryEClass, GEN_FIXED_COMMAND_MENU_ENTRY__GEN_DESTINATION);

		genEditStaticTextMenuEntryEClass = createEClass(GEN_EDIT_STATIC_TEXT_MENU_ENTRY);
		createEReference(genEditStaticTextMenuEntryEClass, GEN_EDIT_STATIC_TEXT_MENU_ENTRY__JSF_MENU_ENTRY);

		genDynamicMenuEClass = createEClass(GEN_DYNAMIC_MENU);
		createEReference(genDynamicMenuEClass, GEN_DYNAMIC_MENU__JSF_MENU);
		createEReference(genDynamicMenuEClass, GEN_DYNAMIC_MENU__GEN_SERVICE);
		createEReference(genDynamicMenuEClass, GEN_DYNAMIC_MENU__GEN_SELECTION);
		createEReference(genDynamicMenuEClass, GEN_DYNAMIC_MENU__GEN_DYNAMIC_TITLE);

		genMenuIncludedFeatureEClass = createEClass(GEN_MENU_INCLUDED_FEATURE);

		genMenuIncludedElementEClass = createEClass(GEN_MENU_INCLUDED_ELEMENT);
		createEReference(genMenuIncludedElementEClass, GEN_MENU_INCLUDED_ELEMENT__JSF_MENU_ENTRY);

		genUnitContainerEClass = createEClass(GEN_UNIT_CONTAINER);
		createEReference(genUnitContainerEClass, GEN_UNIT_CONTAINER__GEN_UNITS);

		genUnitTitleEClass = createEClass(GEN_UNIT_TITLE);

		genContentUnitEClass = createEClass(GEN_CONTENT_UNIT);
		createEReference(genContentUnitEClass, GEN_CONTENT_UNIT__GEN_DISPLAYED_ON);

		genCreateSitemapUnitEClass = createEClass(GEN_CREATE_SITEMAP_UNIT);
		createEReference(genCreateSitemapUnitEClass, GEN_CREATE_SITEMAP_UNIT__JSF_UNIT);

		genStaticUnitEClass = createEClass(GEN_STATIC_UNIT);
		createEReference(genStaticUnitEClass, GEN_STATIC_UNIT__JSF_UNIT);
		createEReference(genStaticUnitEClass, GEN_STATIC_UNIT__GEN_SERVICE);

		genCommandUnitEClass = createEClass(GEN_COMMAND_UNIT);
		createEReference(genCommandUnitEClass, GEN_COMMAND_UNIT__JSF_UNIT);
		createEReference(genCommandUnitEClass, GEN_COMMAND_UNIT__GEN_COMMANDS);

		genCommandEClass = createEClass(GEN_COMMAND);
		createEReference(genCommandEClass, GEN_COMMAND__GEN_PART_OF);

		genUserCommandEClass = createEClass(GEN_USER_COMMAND);
		createEReference(genUserCommandEClass, GEN_USER_COMMAND__JSF_COMMAND);

		genDynamicUnitEClass = createEClass(GEN_DYNAMIC_UNIT);
		createEReference(genDynamicUnitEClass, GEN_DYNAMIC_UNIT__GEN_SERVICE);
		createEReference(genDynamicUnitEClass, GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS);
		createEReference(genDynamicUnitEClass, GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS);

		genUnitFieldEClass = createEClass(GEN_UNIT_FIELD);
		createEReference(genUnitFieldEClass, GEN_UNIT_FIELD__GEN_DISPLAYED_ON);

		genUnitFeatureEClass = createEClass(GEN_UNIT_FEATURE);

		genUnitElementEClass = createEClass(GEN_UNIT_ELEMENT);
		createEReference(genUnitElementEClass, GEN_UNIT_ELEMENT__JSF_FEATURE);
		createEReference(genUnitElementEClass, GEN_UNIT_ELEMENT__GEN_SERVICE_FEATURE);

		genUnitAssociationEClass = createEClass(GEN_UNIT_ASSOCIATION);
		createEReference(genUnitAssociationEClass, GEN_UNIT_ASSOCIATION__JSF_FEATURE);
		createEReference(genUnitAssociationEClass, GEN_UNIT_ASSOCIATION__GEN_SERVICE_FEATURE);
		createEReference(genUnitAssociationEClass, GEN_UNIT_ASSOCIATION__GEN_CHILD_FEATURE);
		createEReference(genUnitAssociationEClass, GEN_UNIT_ASSOCIATION__GEN_SELECTION);
		createEReference(genUnitAssociationEClass, GEN_UNIT_ASSOCIATION__GEN_DYNAMIC_LABEL);
		createEReference(genUnitAssociationEClass, GEN_UNIT_ASSOCIATION__GEN_FILTERS);
		createEAttribute(genUnitAssociationEClass, GEN_UNIT_ASSOCIATION__SELECT_ONE_OF_OPTION);
		createEAttribute(genUnitAssociationEClass, GEN_UNIT_ASSOCIATION__SELECT_MANY_OPTION);

		genUnitChildFeatureEClass = createEClass(GEN_UNIT_CHILD_FEATURE);

		genUnitChildElementEClass = createEClass(GEN_UNIT_CHILD_ELEMENT);
		createEReference(genUnitChildElementEClass, GEN_UNIT_CHILD_ELEMENT__JSF_CHILD_FEATURE);
		createEReference(genUnitChildElementEClass, GEN_UNIT_CHILD_ELEMENT__GEN_SERVICE_FEATURE);

		genUnitChildAssociationEClass = createEClass(GEN_UNIT_CHILD_ASSOCIATION);
		createEReference(genUnitChildAssociationEClass, GEN_UNIT_CHILD_ASSOCIATION__JSF_CHILD_FEATURE);
		createEReference(genUnitChildAssociationEClass, GEN_UNIT_CHILD_ASSOCIATION__GEN_SERVICE_FEATURE);
		createEReference(genUnitChildAssociationEClass, GEN_UNIT_CHILD_ASSOCIATION__GEN_CHILD_FEATURE);

		genInterfaceFieldEClass = createEClass(GEN_INTERFACE_FIELD);
		createEReference(genInterfaceFieldEClass, GEN_INTERFACE_FIELD__GEN_MUST_MATCH);
		createEReference(genInterfaceFieldEClass, GEN_INTERFACE_FIELD__GEN_DEFAULT_VALUE);

		genDataTypeFieldEClass = createEClass(GEN_DATA_TYPE_FIELD);
		createEReference(genDataTypeFieldEClass, GEN_DATA_TYPE_FIELD__GEN_DATA_TYPE);
		createEReference(genDataTypeFieldEClass, GEN_DATA_TYPE_FIELD__JSF_FIELD);

		genDateFieldEClass = createEClass(GEN_DATE_FIELD);
		createEReference(genDateFieldEClass, GEN_DATE_FIELD__JSF_FIELD);

		genCaptchaFieldEClass = createEClass(GEN_CAPTCHA_FIELD);
		createEReference(genCaptchaFieldEClass, GEN_CAPTCHA_FIELD__JSF_FIELD);

		genUnitSupportActionEClass = createEClass(GEN_UNIT_SUPPORT_ACTION);
		createEReference(genUnitSupportActionEClass, GEN_UNIT_SUPPORT_ACTION__JSF_ACTION);

		genEditUnitEClass = createEClass(GEN_EDIT_UNIT);
		createEAttribute(genEditUnitEClass, GEN_EDIT_UNIT__MESSAGE_PLACEMENT_OPTION);
		createEAttribute(genEditUnitEClass, GEN_EDIT_UNIT__FORM_MESSAGE_DISPLAY_OPTION);
		createEReference(genEditUnitEClass, GEN_EDIT_UNIT__GEN_CONFIRM_DESTINATION);
		createEReference(genEditUnitEClass, GEN_EDIT_UNIT__GEN_CANCEL_DESTINATION);

		genCreateUnitEClass = createEClass(GEN_CREATE_UNIT);
		createEReference(genCreateUnitEClass, GEN_CREATE_UNIT__JSF_UNIT);

		genCreateUpdateUnitEClass = createEClass(GEN_CREATE_UPDATE_UNIT);
		createEReference(genCreateUpdateUnitEClass, GEN_CREATE_UPDATE_UNIT__JSF_UNIT);

		genMapUnitEClass = createEClass(GEN_MAP_UNIT);
		createEReference(genMapUnitEClass, GEN_MAP_UNIT__JSF_UNIT);
		createEReference(genMapUnitEClass, GEN_MAP_UNIT__GEN_LOCATION);
		createEReference(genMapUnitEClass, GEN_MAP_UNIT__GEN_PLACE_NAME);

		genUpdateUnitEClass = createEClass(GEN_UPDATE_UNIT);
		createEReference(genUpdateUnitEClass, GEN_UPDATE_UNIT__JSF_UNIT);

		genDataUnitEClass = createEClass(GEN_DATA_UNIT);
		createEReference(genDataUnitEClass, GEN_DATA_UNIT__GEN_SELECTION);
		createEReference(genDataUnitEClass, GEN_DATA_UNIT__GEN_DYNAMIC_TITLE);

		genDetailsUnitEClass = createEClass(GEN_DETAILS_UNIT);
		createEReference(genDetailsUnitEClass, GEN_DETAILS_UNIT__JSF_UNIT);

		genIndexUnitEClass = createEClass(GEN_INDEX_UNIT);
		createEReference(genIndexUnitEClass, GEN_INDEX_UNIT__JSF_UNIT);
		createEReference(genIndexUnitEClass, GEN_INDEX_UNIT__GEN_TARGETTING_SEARCHES);

		genIndexGridUnitEClass = createEClass(GEN_INDEX_GRID_UNIT);

		genIndexPageDirectionUnitEClass = createEClass(GEN_INDEX_PAGE_DIRECTION_UNIT);

		genIndexLineDirectionUnitEClass = createEClass(GEN_INDEX_LINE_DIRECTION_UNIT);

		genControlUnitEClass = createEClass(GEN_CONTROL_UNIT);
		createEAttribute(genControlUnitEClass, GEN_CONTROL_UNIT__MESSAGE_PLACEMENT_OPTION);
		createEReference(genControlUnitEClass, GEN_CONTROL_UNIT__GEN_CANCEL_DESTINATION);

		genSearchUnitEClass = createEClass(GEN_SEARCH_UNIT);
		createEReference(genSearchUnitEClass, GEN_SEARCH_UNIT__JSF_UNIT);
		createEReference(genSearchUnitEClass, GEN_SEARCH_UNIT__GEN_RESULT_DESTINATION);

		genActionUnitEClass = createEClass(GEN_ACTION_UNIT);
		createEReference(genActionUnitEClass, GEN_ACTION_UNIT__JSF_UNIT);

		genAuthenticationUnitEClass = createEClass(GEN_AUTHENTICATION_UNIT);

		genRegistrationUnitEClass = createEClass(GEN_REGISTRATION_UNIT);
		createEReference(genRegistrationUnitEClass, GEN_REGISTRATION_UNIT__JSF_UNIT);
		createEReference(genRegistrationUnitEClass, GEN_REGISTRATION_UNIT__GEN_AUTHENTICATION_SYSTEM);

		genLoginUnitEClass = createEClass(GEN_LOGIN_UNIT);
		createEReference(genLoginUnitEClass, GEN_LOGIN_UNIT__JSF_UNIT);
		createEReference(genLoginUnitEClass, GEN_LOGIN_UNIT__GEN_AUTHENTICATION_SYSTEM);
		createEReference(genLoginUnitEClass, GEN_LOGIN_UNIT__GEN_LOGIN_ID_FIELD);
		createEReference(genLoginUnitEClass, GEN_LOGIN_UNIT__GEN_PASSWORD_FIELD);
		createEReference(genLoginUnitEClass, GEN_LOGIN_UNIT__GEN_REMEMBER_ME_FIELD);

		genForgottenPasswordUnitEClass = createEClass(GEN_FORGOTTEN_PASSWORD_UNIT);
		createEReference(genForgottenPasswordUnitEClass, GEN_FORGOTTEN_PASSWORD_UNIT__JSF_UNIT);
		createEReference(genForgottenPasswordUnitEClass, GEN_FORGOTTEN_PASSWORD_UNIT__GEN_AUTHENTICATION_SYSTEM);
		createEReference(genForgottenPasswordUnitEClass, GEN_FORGOTTEN_PASSWORD_UNIT__GEN_LOGIN_ID_FIELD);

		genInlineActionContainerEClass = createEClass(GEN_INLINE_ACTION_CONTAINER);
		createEReference(genInlineActionContainerEClass, GEN_INLINE_ACTION_CONTAINER__GEN_ACTIONS);

		genInlineActionEClass = createEClass(GEN_INLINE_ACTION);
		createEReference(genInlineActionEClass, GEN_INLINE_ACTION__JSF_ACTION);
		createEReference(genInlineActionEClass, GEN_INLINE_ACTION__GEN_USED_BY);

		genSelectActionEClass = createEClass(GEN_SELECT_ACTION);
		createEReference(genSelectActionEClass, GEN_SELECT_ACTION__GEN_TARGET);

		genDeleteActionEClass = createEClass(GEN_DELETE_ACTION);
		createEReference(genDeleteActionEClass, GEN_DELETE_ACTION__GEN_DESTINATION);

		genFeatureSupportActionEClass = createEClass(GEN_FEATURE_SUPPORT_ACTION);

		genFeatureReferenceEClass = createEClass(GEN_FEATURE_REFERENCE);
		createEReference(genFeatureReferenceEClass, GEN_FEATURE_REFERENCE__CRITERIA_PATH);
		createEReference(genFeatureReferenceEClass, GEN_FEATURE_REFERENCE__GEN_FIELD);

		genModelReferenceEClass = createEClass(GEN_MODEL_REFERENCE);
		createEReference(genModelReferenceEClass, GEN_MODEL_REFERENCE__CRITERIA_PATH);
		createEReference(genModelReferenceEClass, GEN_MODEL_REFERENCE__GEN_UNIT);

		genCurrentUserReferenceEClass = createEClass(GEN_CURRENT_USER_REFERENCE);
		createEReference(genCurrentUserReferenceEClass, GEN_CURRENT_USER_REFERENCE__CRITERIA_PATH);

		// Create enums
		selectOneofOptionsEEnum = createEEnum(SELECT_ONEOF_OPTIONS);
		selectManyOptionsEEnum = createEEnum(SELECT_MANY_OPTIONS);
		inputMessagePlacementOptionsEEnum = createEEnum(INPUT_MESSAGE_PLACEMENT_OPTIONS);
		inputMessageDisplayOptionsEEnum = createEEnum(INPUT_MESSAGE_DISPLAY_OPTIONS);
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
		GenOrmPackage theGenOrmPackage = (GenOrmPackage)EPackage.Registry.INSTANCE.getEPackage(GenOrmPackage.eNS_URI);
		JsfPackage theJsfPackage = (JsfPackage)EPackage.Registry.INSTANCE.getEPackage(JsfPackage.eNS_URI);
		GencriteriaPackage theGencriteriaPackage = (GencriteriaPackage)EPackage.Registry.INSTANCE.getEPackage(GencriteriaPackage.eNS_URI);
		OrmPackage theOrmPackage = (OrmPackage)EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		genJsfModelEClass.getESuperTypes().add(theGenOrmPackage.getGenOrmModel());
		genCasAuthenticationEClass.getESuperTypes().add(this.getGenAuthentication());
		genLocalAuthenticationSystemEClass.getESuperTypes().add(this.getGenAuthentication());
		genIncludedElementEClass.getESuperTypes().add(this.getGenIncludedFeature());
		genIncludedAssociationEClass.getESuperTypes().add(this.getGenIncludedFeature());
		genServiceEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genModelLabelEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genModelLabelEClass.getESuperTypes().add(this.getGenUnitTitle());
		genSelectionEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genServiceFeatureEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genServiceEntityFeatureEClass.getESuperTypes().add(this.getGenIncludedFeature());
		genServiceEntityFeatureEClass.getESuperTypes().add(this.getGenServiceFeature());
		genServiceEntityElementEClass.getESuperTypes().add(this.getGenServiceEntityFeature());
		genServiceEntityElementEClass.getESuperTypes().add(this.getGenIncludedElement());
		genServiceEntityElementEClass.getESuperTypes().add(this.getGenUnitTitle());
		genServiceAssociationEClass.getESuperTypes().add(this.getGenServiceFeature());
		genServiceEntityAssociationEClass.getESuperTypes().add(this.getGenServiceEntityFeature());
		genServiceEntityAssociationEClass.getESuperTypes().add(this.getGenServiceAssociation());
		genServiceEntityAssociationEClass.getESuperTypes().add(this.getGenIncludedAssociation());
		genServiceViewAssociationEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genServiceViewAssociationEClass.getESuperTypes().add(this.getGenServiceAssociation());
		genPageEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genPageEClass.getESuperTypes().add(this.getGenUnitContainer());
		genMenuEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genMenuEntryEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genStaticMenuEClass.getESuperTypes().add(this.getGenMenu());
		genFixedPageMenuEntryEClass.getESuperTypes().add(this.getGenMenuEntry());
		genFixedActionMenuEntryEClass.getESuperTypes().add(this.getGenMenuEntry());
		genFixedCommandMenuEntryEClass.getESuperTypes().add(this.getGenMenuEntry());
		genEditStaticTextMenuEntryEClass.getESuperTypes().add(this.getGenMenuEntry());
		genDynamicMenuEClass.getESuperTypes().add(this.getGenMenu());
		genMenuIncludedFeatureEClass.getESuperTypes().add(this.getGenMenuEntry());
		genMenuIncludedElementEClass.getESuperTypes().add(this.getGenMenuIncludedFeature());
		genContentUnitEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genCreateSitemapUnitEClass.getESuperTypes().add(this.getGenContentUnit());
		genStaticUnitEClass.getESuperTypes().add(this.getGenContentUnit());
		genCommandUnitEClass.getESuperTypes().add(this.getGenContentUnit());
		genCommandEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genUserCommandEClass.getESuperTypes().add(this.getGenCommand());
		genDynamicUnitEClass.getESuperTypes().add(this.getGenContentUnit());
		genUnitFieldEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genUnitFeatureEClass.getESuperTypes().add(this.getGenUnitField());
		genUnitFeatureEClass.getESuperTypes().add(this.getGenIncludedFeature());
		genUnitFeatureEClass.getESuperTypes().add(this.getGenInlineActionContainer());
		genUnitElementEClass.getESuperTypes().add(this.getGenUnitFeature());
		genUnitElementEClass.getESuperTypes().add(this.getGenIncludedElement());
		genUnitAssociationEClass.getESuperTypes().add(this.getGenUnitFeature());
		genUnitAssociationEClass.getESuperTypes().add(this.getGenIncludedAssociation());
		genUnitAssociationEClass.getESuperTypes().add(this.getGenUnitContainer());
		genUnitChildElementEClass.getESuperTypes().add(this.getGenUnitChildFeature());
		genUnitChildAssociationEClass.getESuperTypes().add(this.getGenUnitChildFeature());
		genInterfaceFieldEClass.getESuperTypes().add(this.getGenUnitField());
		genDataTypeFieldEClass.getESuperTypes().add(this.getGenInterfaceField());
		genDateFieldEClass.getESuperTypes().add(this.getGenInterfaceField());
		genCaptchaFieldEClass.getESuperTypes().add(this.getGenUnitField());
		genUnitSupportActionEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genEditUnitEClass.getESuperTypes().add(this.getGenDynamicUnit());
		genCreateUnitEClass.getESuperTypes().add(this.getGenEditUnit());
		genCreateUpdateUnitEClass.getESuperTypes().add(this.getGenEditUnit());
		genCreateUpdateUnitEClass.getESuperTypes().add(this.getGenSelectTarget());
		genMapUnitEClass.getESuperTypes().add(this.getGenEditUnit());
		genMapUnitEClass.getESuperTypes().add(this.getGenSelectTarget());
		genUpdateUnitEClass.getESuperTypes().add(this.getGenEditUnit());
		genUpdateUnitEClass.getESuperTypes().add(this.getGenSelectTarget());
		genDataUnitEClass.getESuperTypes().add(this.getGenDynamicUnit());
		genDetailsUnitEClass.getESuperTypes().add(this.getGenDataUnit());
		genDetailsUnitEClass.getESuperTypes().add(this.getGenSelectTarget());
		genIndexUnitEClass.getESuperTypes().add(this.getGenDataUnit());
		genIndexUnitEClass.getESuperTypes().add(this.getGenInlineActionContainer());
		genIndexUnitEClass.getESuperTypes().add(this.getGenSelectTarget());
		genIndexGridUnitEClass.getESuperTypes().add(this.getGenIndexUnit());
		genIndexPageDirectionUnitEClass.getESuperTypes().add(this.getGenIndexUnit());
		genIndexLineDirectionUnitEClass.getESuperTypes().add(this.getGenIndexUnit());
		genControlUnitEClass.getESuperTypes().add(this.getGenDynamicUnit());
		genSearchUnitEClass.getESuperTypes().add(this.getGenControlUnit());
		genActionUnitEClass.getESuperTypes().add(this.getGenControlUnit());
		genRegistrationUnitEClass.getESuperTypes().add(this.getGenEditUnit());
		genRegistrationUnitEClass.getESuperTypes().add(this.getGenAuthenticationUnit());
		genLoginUnitEClass.getESuperTypes().add(this.getGenControlUnit());
		genLoginUnitEClass.getESuperTypes().add(this.getGenAuthenticationUnit());
		genForgottenPasswordUnitEClass.getESuperTypes().add(this.getGenControlUnit());
		genForgottenPasswordUnitEClass.getESuperTypes().add(this.getGenAuthenticationUnit());
		genInlineActionEClass.getESuperTypes().add(theOrmPackage.getNamedElement());
		genSelectActionEClass.getESuperTypes().add(this.getGenInlineAction());
		genDeleteActionEClass.getESuperTypes().add(this.getGenInlineAction());
		genFeatureSupportActionEClass.getESuperTypes().add(this.getGenInlineAction());
		genFeatureReferenceEClass.getESuperTypes().add(theGencriteriaPackage.getGenPath());
		genModelReferenceEClass.getESuperTypes().add(theGencriteriaPackage.getGenPath());
		genCurrentUserReferenceEClass.getESuperTypes().add(theGencriteriaPackage.getGenPath());

		// Initialize classes and features; add operations and parameters
		initEClass(genJsfModelEClass, GenJsfModel.class, "GenJsfModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenJsfModel_JsfModel(), theJsfPackage.getJsfModel(), null, "jsfModel", null, 1, 1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenJsfModel_GenAuthentication(), this.getGenAuthentication(), null, "genAuthentication", null, 0, 1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenJsfModel_GenServices(), this.getGenService(), null, "genServices", null, 0, -1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenJsfModel_GenPages(), this.getGenPage(), this.getGenPage_GenPartOf(), "genPages", null, 0, -1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenJsfModel_GenMenus(), this.getGenMenu(), null, "genMenus", null, 0, -1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenJsfModel_BaseURL(), ecorePackage.getEString(), "baseURL", null, 1, 1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenJsfModel_RewriteURLs(), ecorePackage.getEBoolean(), "rewriteURLs", null, 1, 1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenJsfModel_DevelopmentVersion(), ecorePackage.getEBoolean(), "developmentVersion", "true", 1, 1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenJsfModel_TextEditorPath(), ecorePackage.getEString(), "textEditorPath", null, 0, 1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenJsfModel_BackingPackage(), ecorePackage.getEString(), "backingPackage", "backing", 1, 1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenJsfModel_ConverterPackage(), ecorePackage.getEString(), "converterPackage", "converter", 1, 1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenJsfModel_ValidatorPackage(), ecorePackage.getEString(), "validatorPackage", "validator", 1, 1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenJsfModel_ServicePackage(), ecorePackage.getEString(), "servicePackage", "service", 1, 1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenJsfModel_SecurityPackage(), ecorePackage.getEString(), "securityPackage", "security", 1, 1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenJsfModel_UiPackage(), ecorePackage.getEString(), "uiPackage", "ui", 1, 1, GenJsfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genAuthenticationEClass, GenAuthentication.class, "GenAuthentication", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genCasAuthenticationEClass, GenCasAuthentication.class, "GenCasAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCasAuthentication_JsfAuthentication(), theJsfPackage.getCasAuthentication(), null, "jsfAuthentication", null, 1, 1, GenCasAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genLocalAuthenticationSystemEClass, GenLocalAuthenticationSystem.class, "GenLocalAuthenticationSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenLocalAuthenticationSystem_JsfAuthentication(), theJsfPackage.getLocalAuthenticationSystem(), null, "jsfAuthentication", null, 1, 1, GenLocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenLocalAuthenticationSystem_GenUserService(), this.getGenService(), null, "genUserService", null, 1, 1, GenLocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenLocalAuthenticationSystem_GenUserAuthenticationKey(), this.getGenServiceEntityElement(), null, "genUserAuthenticationKey", null, 1, 1, GenLocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenLocalAuthenticationSystem_GenAuthenticationService(), this.getGenService(), null, "genAuthenticationService", null, 1, 1, GenLocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenLocalAuthenticationSystem_GenLoginAttemptService(), this.getGenService(), null, "genLoginAttemptService", null, 1, 1, GenLocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenLocalAuthenticationSystem_GenAutoLoginService(), this.getGenService(), null, "genAutoLoginService", null, 1, 1, GenLocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenLocalAuthenticationSystem_GenRegistrationUnit(), this.getGenRegistrationUnit(), this.getGenRegistrationUnit_GenAuthenticationSystem(), "genRegistrationUnit", null, 0, 1, GenLocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenLocalAuthenticationSystem_GenLoginUnit(), this.getGenLoginUnit(), this.getGenLoginUnit_GenAuthenticationSystem(), "genLoginUnit", null, 1, 1, GenLocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenLocalAuthenticationSystem_GenForgottenPasswordUnit(), this.getGenForgottenPasswordUnit(), this.getGenForgottenPasswordUnit_GenAuthenticationSystem(), "genForgottenPasswordUnit", null, 0, 1, GenLocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenLocalAuthenticationSystem_LoginMaximumAttempts(), ecorePackage.getEInt(), "loginMaximumAttempts", "5", 1, 1, GenLocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenLocalAuthenticationSystem_LoginAttemptExpiryPeriod(), ecorePackage.getEInt(), "loginAttemptExpiryPeriod", "3600", 1, 1, GenLocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenLocalAuthenticationSystem_AutologinCookieLifetime(), ecorePackage.getEInt(), "autologinCookieLifetime", "2678400", 1, 1, GenLocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genIncludedFeatureEClass, GenIncludedFeature.class, "GenIncludedFeature", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenIncludedFeature_GenForcedValue(), theGencriteriaPackage.getGenExpression(), null, "genForcedValue", null, 0, 1, GenIncludedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenIncludedFeature_MessageDisplayOption(), this.getInputMessageDisplayOptions(), "messageDisplayOption", "Description", 0, 1, GenIncludedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genIncludedElementEClass, GenIncludedElement.class, "GenIncludedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenIncludedElement_GenDefaultValue(), theGencriteriaPackage.getGenExpression(), null, "genDefaultValue", null, 0, 1, GenIncludedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genIncludedAssociationEClass, GenIncludedAssociation.class, "GenIncludedAssociation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genServiceEClass, GenService.class, "GenService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenService_JsfService(), theJsfPackage.getService(), null, "jsfService", null, 1, 1, GenService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenService_GenEntities(), theGenOrmPackage.getGenEntity(), null, "genEntities", null, 1, -1, GenService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenService_GenDisplayLabels(), this.getGenModelLabel(), null, "genDisplayLabels", null, 0, -1, GenService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenService_GenSelections(), this.getGenSelection(), null, "genSelections", null, 0, -1, GenService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenService_GenFeatures(), this.getGenServiceFeature(), this.getGenServiceFeature_GenIncludedBy(), "genFeatures", null, 0, -1, GenService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenService_GenAccessedBy(), this.getGenDynamicUnit(), this.getGenDynamicUnit_GenService(), "genAccessedBy", null, 0, -1, GenService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenService_DefaultViewName(), ecorePackage.getEString(), "defaultViewName", null, 0, 1, GenService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenService_ViewName(), ecorePackage.getEString(), "viewName", null, 0, 1, GenService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genModelLabelEClass, GenModelLabel.class, "GenModelLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenModelLabel_GenLabelFor(), this.getGenService(), null, "genLabelFor", null, 1, 1, GenModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenModelLabel_JsfLabel(), theJsfPackage.getModelLabel(), null, "jsfLabel", null, 1, 1, GenModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenModelLabel_GenFeatures(), this.getGenServiceFeature(), null, "genFeatures", null, 1, -1, GenModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genSelectionEClass, GenSelection.class, "GenSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenSelection_JsfSelection(), theJsfPackage.getSelection(), null, "jsfSelection", null, 1, 1, GenSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenSelection_GenFilter(), theGencriteriaPackage.getGenPredicate(), null, "genFilter", null, 0, 1, GenSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenSelection_GenOrdering(), theGencriteriaPackage.getGenOrder(), null, "genOrdering", null, 0, -1, GenSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genServiceFeatureEClass, GenServiceFeature.class, "GenServiceFeature", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenServiceFeature_GenIncludedBy(), this.getGenService(), this.getGenService_GenFeatures(), "genIncludedBy", null, 1, 1, GenServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genServiceEntityFeatureEClass, GenServiceEntityFeature.class, "GenServiceEntityFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenServiceEntityFeature_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, GenServiceEntityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genServiceEntityElementEClass, GenServiceEntityElement.class, "GenServiceEntityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenServiceEntityElement_JsfFeature(), theJsfPackage.getServiceEntityElement(), null, "jsfFeature", null, 1, 1, GenServiceEntityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenServiceEntityElement_GenFeature(), theGenOrmPackage.getGenAttribute(), null, "genFeature", null, 1, 1, GenServiceEntityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genServiceAssociationEClass, GenServiceAssociation.class, "GenServiceAssociation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genServiceEntityAssociationEClass, GenServiceEntityAssociation.class, "GenServiceEntityAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenServiceEntityAssociation_JsfFeature(), theJsfPackage.getServiceEntityAssociation(), null, "jsfFeature", null, 1, 1, GenServiceEntityAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenServiceEntityAssociation_GenFeature(), theGenOrmPackage.getGenAssociation(), null, "genFeature", null, 1, 1, GenServiceEntityAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genServiceViewAssociationEClass, GenServiceViewAssociation.class, "GenServiceViewAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenServiceViewAssociation_JsfFeature(), theJsfPackage.getServiceViewAssociation(), null, "jsfFeature", null, 1, 1, GenServiceViewAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenServiceViewAssociation_GenTargetFeature(), this.getGenServiceAssociation(), null, "genTargetFeature", null, 1, 1, GenServiceViewAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genPageEClass, GenPage.class, "GenPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenPage_GenPartOf(), this.getGenJsfModel(), this.getGenJsfModel_GenPages(), "genPartOf", null, 0, 1, GenPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPage_JsfPage(), theJsfPackage.getPage(), null, "jsfPage", null, 1, 1, GenPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPage_GenParentPage(), this.getGenPage(), this.getGenPage_GenChildPages(), "genParentPage", null, 0, 1, GenPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPage_GenChildPages(), this.getGenPage(), this.getGenPage_GenParentPage(), "genChildPages", null, 0, -1, GenPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenPage_GenSideMenu(), this.getGenMenu(), null, "genSideMenu", null, 0, 1, GenPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genSelectTargetEClass, GenSelectTarget.class, "GenSelectTarget", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenSelectTarget_GenTargettingActions(), this.getGenSelectAction(), this.getGenSelectAction_GenTarget(), "genTargettingActions", null, 0, -1, GenSelectTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genMenuEClass, GenMenu.class, "GenMenu", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenMenu_GenEntries(), this.getGenMenuEntry(), this.getGenMenuEntry_GenPartOf(), "genEntries", null, 0, -1, GenMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genMenuEntryEClass, GenMenuEntry.class, "GenMenuEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenMenuEntry_GenPartOf(), this.getGenMenu(), this.getGenMenu_GenEntries(), "genPartOf", null, 1, 1, GenMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genStaticMenuEClass, GenStaticMenu.class, "GenStaticMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenStaticMenu_JsfMenu(), theJsfPackage.getStaticMenu(), null, "jsfMenu", null, 1, 1, GenStaticMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genFixedPageMenuEntryEClass, GenFixedPageMenuEntry.class, "GenFixedPageMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenFixedPageMenuEntry_JsfMenuEntry(), theJsfPackage.getFixedPageMenuEntry(), null, "jsfMenuEntry", null, 1, 1, GenFixedPageMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenFixedPageMenuEntry_GenDestination(), this.getGenPage(), null, "genDestination", null, 1, 1, GenFixedPageMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genFixedActionMenuEntryEClass, GenFixedActionMenuEntry.class, "GenFixedActionMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenFixedActionMenuEntry_JsfMenuEntry(), theJsfPackage.getFixedActionMenuEntry(), null, "jsfMenuEntry", null, 1, 1, GenFixedActionMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenFixedActionMenuEntry_GenDestination(), this.getGenDynamicUnit(), null, "genDestination", null, 1, 1, GenFixedActionMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genFixedCommandMenuEntryEClass, GenFixedCommandMenuEntry.class, "GenFixedCommandMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenFixedCommandMenuEntry_JsfMenuEntry(), theJsfPackage.getFixedCommandMenuEntry(), null, "jsfMenuEntry", null, 1, 1, GenFixedCommandMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenFixedCommandMenuEntry_GenDestination(), this.getGenCommand(), null, "genDestination", null, 1, 1, GenFixedCommandMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genEditStaticTextMenuEntryEClass, GenEditStaticTextMenuEntry.class, "GenEditStaticTextMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenEditStaticTextMenuEntry_JsfMenuEntry(), theJsfPackage.getEditStaticTextMenuEntry(), null, "jsfMenuEntry", null, 1, 1, GenEditStaticTextMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genDynamicMenuEClass, GenDynamicMenu.class, "GenDynamicMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDynamicMenu_JsfMenu(), theJsfPackage.getDynamicMenu(), null, "jsfMenu", null, 1, 1, GenDynamicMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenDynamicMenu_GenService(), this.getGenService(), null, "genService", null, 1, 1, GenDynamicMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenDynamicMenu_GenSelection(), this.getGenSelection(), null, "genSelection", null, 1, 1, GenDynamicMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenDynamicMenu_GenDynamicTitle(), this.getGenServiceEntityElement(), null, "genDynamicTitle", null, 0, 1, GenDynamicMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genMenuIncludedFeatureEClass, GenMenuIncludedFeature.class, "GenMenuIncludedFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genMenuIncludedElementEClass, GenMenuIncludedElement.class, "GenMenuIncludedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenMenuIncludedElement_JsfMenuEntry(), theJsfPackage.getMenuIncludedElement(), null, "jsfMenuEntry", null, 1, 1, GenMenuIncludedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genUnitContainerEClass, GenUnitContainer.class, "GenUnitContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenUnitContainer_GenUnits(), this.getGenContentUnit(), this.getGenContentUnit_GenDisplayedOn(), "genUnits", null, 0, -1, GenUnitContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genUnitTitleEClass, GenUnitTitle.class, "GenUnitTitle", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genContentUnitEClass, GenContentUnit.class, "GenContentUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenContentUnit_GenDisplayedOn(), this.getGenUnitContainer(), this.getGenUnitContainer_GenUnits(), "genDisplayedOn", null, 0, 1, GenContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genCreateSitemapUnitEClass, GenCreateSitemapUnit.class, "GenCreateSitemapUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCreateSitemapUnit_JsfUnit(), theJsfPackage.getCreateSitemapUnit(), null, "jsfUnit", null, 1, 1, GenCreateSitemapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genStaticUnitEClass, GenStaticUnit.class, "GenStaticUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenStaticUnit_JsfUnit(), theJsfPackage.getStaticUnit(), null, "jsfUnit", null, 1, 1, GenStaticUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenStaticUnit_GenService(), this.getGenService(), null, "genService", null, 0, 1, GenStaticUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genCommandUnitEClass, GenCommandUnit.class, "GenCommandUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCommandUnit_JsfUnit(), theJsfPackage.getCommandUnit(), null, "jsfUnit", null, 1, 1, GenCommandUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenCommandUnit_GenCommands(), this.getGenCommand(), this.getGenCommand_GenPartOf(), "genCommands", null, 0, -1, GenCommandUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genCommandEClass, GenCommand.class, "GenCommand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCommand_GenPartOf(), this.getGenCommandUnit(), this.getGenCommandUnit_GenCommands(), "genPartOf", null, 1, 1, GenCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genUserCommandEClass, GenUserCommand.class, "GenUserCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenUserCommand_JsfCommand(), theJsfPackage.getCommand(), null, "jsfCommand", null, 1, 1, GenUserCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genDynamicUnitEClass, GenDynamicUnit.class, "GenDynamicUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDynamicUnit_GenService(), this.getGenService(), this.getGenService_GenAccessedBy(), "genService", null, 1, 1, GenDynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDynamicUnit_GenDisplayFields(), this.getGenUnitField(), this.getGenUnitField_GenDisplayedOn(), "genDisplayFields", null, 0, -1, GenDynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenDynamicUnit_GenSupportActions(), this.getGenUnitSupportAction(), null, "genSupportActions", null, 0, -1, GenDynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genUnitFieldEClass, GenUnitField.class, "GenUnitField", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenUnitField_GenDisplayedOn(), this.getGenDynamicUnit(), this.getGenDynamicUnit_GenDisplayFields(), "genDisplayedOn", null, 1, 1, GenUnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genUnitFeatureEClass, GenUnitFeature.class, "GenUnitFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genUnitElementEClass, GenUnitElement.class, "GenUnitElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenUnitElement_JsfFeature(), theJsfPackage.getUnitElement(), null, "jsfFeature", null, 1, 1, GenUnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenUnitElement_GenServiceFeature(), this.getGenServiceEntityElement(), null, "genServiceFeature", null, 1, 1, GenUnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genUnitAssociationEClass, GenUnitAssociation.class, "GenUnitAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenUnitAssociation_JsfFeature(), theJsfPackage.getUnitAssociation(), null, "jsfFeature", null, 1, 1, GenUnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenUnitAssociation_GenServiceFeature(), this.getGenServiceAssociation(), null, "genServiceFeature", null, 1, 1, GenUnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenUnitAssociation_GenChildFeature(), this.getGenUnitChildFeature(), null, "genChildFeature", null, 0, 1, GenUnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenUnitAssociation_GenSelection(), this.getGenSelection(), null, "genSelection", null, 0, 1, GenUnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenUnitAssociation_GenDynamicLabel(), this.getGenModelLabel(), null, "genDynamicLabel", null, 0, 1, GenUnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenUnitAssociation_GenFilters(), this.getGenUnitTitle(), null, "genFilters", null, 0, -1, GenUnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenUnitAssociation_SelectOneOfOption(), this.getSelectOneofOptions(), "selectOneOfOption", "Menu", 1, 1, GenUnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenUnitAssociation_SelectManyOption(), this.getSelectManyOptions(), "selectManyOption", "List", 1, 1, GenUnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genUnitChildFeatureEClass, GenUnitChildFeature.class, "GenUnitChildFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genUnitChildElementEClass, GenUnitChildElement.class, "GenUnitChildElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenUnitChildElement_JsfChildFeature(), theJsfPackage.getUnitChildElement(), null, "jsfChildFeature", null, 1, 1, GenUnitChildElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenUnitChildElement_GenServiceFeature(), this.getGenServiceEntityElement(), null, "genServiceFeature", null, 1, 1, GenUnitChildElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genUnitChildAssociationEClass, GenUnitChildAssociation.class, "GenUnitChildAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenUnitChildAssociation_JsfChildFeature(), theJsfPackage.getUnitChildAssociation(), null, "jsfChildFeature", null, 1, 1, GenUnitChildAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenUnitChildAssociation_GenServiceFeature(), this.getGenServiceAssociation(), null, "genServiceFeature", null, 1, 1, GenUnitChildAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenUnitChildAssociation_GenChildFeature(), this.getGenUnitChildFeature(), null, "genChildFeature", null, 0, 1, GenUnitChildAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genInterfaceFieldEClass, GenInterfaceField.class, "GenInterfaceField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenInterfaceField_GenMustMatch(), this.getGenUnitField(), null, "genMustMatch", null, 0, 1, GenInterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenInterfaceField_GenDefaultValue(), theGencriteriaPackage.getGenExpression(), null, "genDefaultValue", null, 0, 1, GenInterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genDataTypeFieldEClass, GenDataTypeField.class, "GenDataTypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDataTypeField_GenDataType(), theGenOrmPackage.getGenDataType(), null, "genDataType", null, 1, 1, GenDataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenDataTypeField_JsfField(), theJsfPackage.getDataTypeField(), null, "jsfField", null, 1, 1, GenDataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genDateFieldEClass, GenDateField.class, "GenDateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDateField_JsfField(), theJsfPackage.getDateField(), null, "jsfField", null, 1, 1, GenDateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genCaptchaFieldEClass, GenCaptchaField.class, "GenCaptchaField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCaptchaField_JsfField(), theJsfPackage.getCaptchaField(), null, "jsfField", null, 1, 1, GenCaptchaField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genUnitSupportActionEClass, GenUnitSupportAction.class, "GenUnitSupportAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenUnitSupportAction_JsfAction(), theJsfPackage.getUnitSupportAction(), null, "jsfAction", null, 1, 1, GenUnitSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genEditUnitEClass, GenEditUnit.class, "GenEditUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenEditUnit_MessagePlacementOption(), this.getInputMessagePlacementOptions(), "messagePlacementOption", "OnFeature", 1, 1, GenEditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenEditUnit_FormMessageDisplayOption(), this.getInputMessageDisplayOptions(), "formMessageDisplayOption", "Description", 1, 1, GenEditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenEditUnit_GenConfirmDestination(), this.getGenPage(), null, "genConfirmDestination", null, 0, 1, GenEditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenEditUnit_GenCancelDestination(), this.getGenPage(), null, "genCancelDestination", null, 0, 1, GenEditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genCreateUnitEClass, GenCreateUnit.class, "GenCreateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCreateUnit_JsfUnit(), theJsfPackage.getCreateUnit(), null, "jsfUnit", null, 1, 1, GenCreateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genCreateUpdateUnitEClass, GenCreateUpdateUnit.class, "GenCreateUpdateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCreateUpdateUnit_JsfUnit(), theJsfPackage.getCreateUpdateUnit(), null, "jsfUnit", null, 1, 1, GenCreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genMapUnitEClass, GenMapUnit.class, "GenMapUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenMapUnit_JsfUnit(), theJsfPackage.getMapUnit(), null, "jsfUnit", null, 1, 1, GenMapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenMapUnit_GenLocation(), this.getGenServiceEntityElement(), null, "genLocation", null, 0, 1, GenMapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenMapUnit_GenPlaceName(), this.getGenServiceEntityElement(), null, "genPlaceName", null, 0, 1, GenMapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genUpdateUnitEClass, GenUpdateUnit.class, "GenUpdateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenUpdateUnit_JsfUnit(), theJsfPackage.getUpdateUnit(), null, "jsfUnit", null, 1, 1, GenUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genDataUnitEClass, GenDataUnit.class, "GenDataUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDataUnit_GenSelection(), this.getGenSelection(), null, "genSelection", null, 0, 1, GenDataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenDataUnit_GenDynamicTitle(), this.getGenUnitTitle(), null, "genDynamicTitle", null, 0, 1, GenDataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genDetailsUnitEClass, GenDetailsUnit.class, "GenDetailsUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDetailsUnit_JsfUnit(), theJsfPackage.getDetailsUnit(), null, "jsfUnit", null, 1, 1, GenDetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genIndexUnitEClass, GenIndexUnit.class, "GenIndexUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenIndexUnit_JsfUnit(), theJsfPackage.getIndexUnit(), null, "jsfUnit", null, 1, 1, GenIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenIndexUnit_GenTargettingSearches(), this.getGenSearchUnit(), this.getGenSearchUnit_GenResultDestination(), "genTargettingSearches", null, 0, -1, GenIndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genIndexGridUnitEClass, GenIndexGridUnit.class, "GenIndexGridUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genIndexPageDirectionUnitEClass, GenIndexPageDirectionUnit.class, "GenIndexPageDirectionUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genIndexLineDirectionUnitEClass, GenIndexLineDirectionUnit.class, "GenIndexLineDirectionUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genControlUnitEClass, GenControlUnit.class, "GenControlUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenControlUnit_MessagePlacementOption(), this.getInputMessagePlacementOptions(), "messagePlacementOption", "OnFeature", 1, 1, GenControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenControlUnit_GenCancelDestination(), this.getGenPage(), null, "genCancelDestination", null, 0, 1, GenControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genSearchUnitEClass, GenSearchUnit.class, "GenSearchUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenSearchUnit_JsfUnit(), theJsfPackage.getSearchUnit(), null, "jsfUnit", null, 1, 1, GenSearchUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenSearchUnit_GenResultDestination(), this.getGenIndexUnit(), this.getGenIndexUnit_GenTargettingSearches(), "genResultDestination", null, 1, 1, GenSearchUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genActionUnitEClass, GenActionUnit.class, "GenActionUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenActionUnit_JsfUnit(), theJsfPackage.getActionUnit(), null, "jsfUnit", null, 1, 1, GenActionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genAuthenticationUnitEClass, GenAuthenticationUnit.class, "GenAuthenticationUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genRegistrationUnitEClass, GenRegistrationUnit.class, "GenRegistrationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenRegistrationUnit_JsfUnit(), theJsfPackage.getRegistrationUnit(), null, "jsfUnit", null, 1, 1, GenRegistrationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenRegistrationUnit_GenAuthenticationSystem(), this.getGenLocalAuthenticationSystem(), this.getGenLocalAuthenticationSystem_GenRegistrationUnit(), "genAuthenticationSystem", null, 0, 1, GenRegistrationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genLoginUnitEClass, GenLoginUnit.class, "GenLoginUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenLoginUnit_JsfUnit(), theJsfPackage.getLoginUnit(), null, "jsfUnit", null, 1, 1, GenLoginUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenLoginUnit_GenAuthenticationSystem(), this.getGenLocalAuthenticationSystem(), this.getGenLocalAuthenticationSystem_GenLoginUnit(), "genAuthenticationSystem", null, 0, 1, GenLoginUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenLoginUnit_GenLoginIdField(), this.getGenUnitField(), null, "genLoginIdField", null, 1, 1, GenLoginUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenLoginUnit_GenPasswordField(), this.getGenUnitField(), null, "genPasswordField", null, 1, 1, GenLoginUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenLoginUnit_GenRememberMeField(), this.getGenUnitField(), null, "genRememberMeField", null, 0, 1, GenLoginUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genForgottenPasswordUnitEClass, GenForgottenPasswordUnit.class, "GenForgottenPasswordUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenForgottenPasswordUnit_JsfUnit(), theJsfPackage.getForgottenPasswordUnit(), null, "jsfUnit", null, 1, 1, GenForgottenPasswordUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenForgottenPasswordUnit_GenAuthenticationSystem(), this.getGenLocalAuthenticationSystem(), this.getGenLocalAuthenticationSystem_GenForgottenPasswordUnit(), "genAuthenticationSystem", null, 0, 1, GenForgottenPasswordUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenForgottenPasswordUnit_GenLoginIdField(), this.getGenUnitField(), null, "genLoginIdField", null, 1, 1, GenForgottenPasswordUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genInlineActionContainerEClass, GenInlineActionContainer.class, "GenInlineActionContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenInlineActionContainer_GenActions(), this.getGenInlineAction(), this.getGenInlineAction_GenUsedBy(), "genActions", null, 0, -1, GenInlineActionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genInlineActionEClass, GenInlineAction.class, "GenInlineAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenInlineAction_JsfAction(), theJsfPackage.getInlineAction(), null, "jsfAction", null, 1, 1, GenInlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenInlineAction_GenUsedBy(), this.getGenInlineActionContainer(), this.getGenInlineActionContainer_GenActions(), "genUsedBy", null, 1, 1, GenInlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genSelectActionEClass, GenSelectAction.class, "GenSelectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenSelectAction_GenTarget(), this.getGenSelectTarget(), this.getGenSelectTarget_GenTargettingActions(), "genTarget", null, 1, 1, GenSelectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genDeleteActionEClass, GenDeleteAction.class, "GenDeleteAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenDeleteAction_GenDestination(), this.getGenPage(), null, "genDestination", null, 0, 1, GenDeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genFeatureSupportActionEClass, GenFeatureSupportAction.class, "GenFeatureSupportAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genFeatureReferenceEClass, GenFeatureReference.class, "GenFeatureReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenFeatureReference_CriteriaPath(), theJsfPackage.getFeatureReference(), null, "criteriaPath", null, 1, 1, GenFeatureReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenFeatureReference_GenField(), this.getGenServiceEntityFeature(), null, "genField", null, 1, 1, GenFeatureReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genModelReferenceEClass, GenModelReference.class, "GenModelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenModelReference_CriteriaPath(), theJsfPackage.getModelReference(), null, "criteriaPath", null, 1, 1, GenModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenModelReference_GenUnit(), this.getGenDynamicUnit(), null, "genUnit", null, 1, 1, GenModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genCurrentUserReferenceEClass, GenCurrentUserReference.class, "GenCurrentUserReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenCurrentUserReference_CriteriaPath(), theJsfPackage.getCurrentUserReference(), null, "criteriaPath", null, 1, 1, GenCurrentUserReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(selectOneofOptionsEEnum, SelectOneofOptions.class, "SelectOneofOptions");
		addEEnumLiteral(selectOneofOptionsEEnum, SelectOneofOptions.MENU);
		addEEnumLiteral(selectOneofOptionsEEnum, SelectOneofOptions.RADIO_HORIZONTAL);
		addEEnumLiteral(selectOneofOptionsEEnum, SelectOneofOptions.RADIO_VERTICAL);

		initEEnum(selectManyOptionsEEnum, SelectManyOptions.class, "SelectManyOptions");
		addEEnumLiteral(selectManyOptionsEEnum, SelectManyOptions.LIST);
		addEEnumLiteral(selectManyOptionsEEnum, SelectManyOptions.CHECKBOX_HORIZONTAL);
		addEEnumLiteral(selectManyOptionsEEnum, SelectManyOptions.CHECKBOX_VERTICAL);

		initEEnum(inputMessagePlacementOptionsEEnum, InputMessagePlacementOptions.class, "InputMessagePlacementOptions");
		addEEnumLiteral(inputMessagePlacementOptionsEEnum, InputMessagePlacementOptions.FORM_HEAD);
		addEEnumLiteral(inputMessagePlacementOptionsEEnum, InputMessagePlacementOptions.FORM_FOOT);
		addEEnumLiteral(inputMessagePlacementOptionsEEnum, InputMessagePlacementOptions.ON_FEATURE);
		addEEnumLiteral(inputMessagePlacementOptionsEEnum, InputMessagePlacementOptions.FORM_HEAD_AND_FOOT);
		addEEnumLiteral(inputMessagePlacementOptionsEEnum, InputMessagePlacementOptions.FORM_AND_ON_FEATURE);

		initEEnum(inputMessageDisplayOptionsEEnum, InputMessageDisplayOptions.class, "InputMessageDisplayOptions");
		addEEnumLiteral(inputMessageDisplayOptionsEEnum, InputMessageDisplayOptions.SHORT);
		addEEnumLiteral(inputMessageDisplayOptionsEEnum, InputMessageDisplayOptions.DESCRIPTION);
		addEEnumLiteral(inputMessageDisplayOptionsEEnum, InputMessageDisplayOptions.TOOL_TIP);

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
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

} //GenJsfPackageImpl
