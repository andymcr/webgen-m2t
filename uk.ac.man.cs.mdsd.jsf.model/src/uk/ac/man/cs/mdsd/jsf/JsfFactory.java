/**
 * <copyright>
 * </copyright>
 *
 * $Id: JsfFactory.java,v 1.50 2014/08/22 14:32:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.jsf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage
 * @generated
 */
public interface JsfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JsfFactory eINSTANCE = uk.ac.man.cs.mdsd.jsf.impl.JsfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	JsfModel createJsfModel();

	/**
	 * Returns a new object of class '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Authentication System</em>'.
	 * @generated
	 */
	LocalAuthenticationSystem createLocalAuthenticationSystem();

	/**
	 * Returns a new object of class '<em>Cas Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cas Authentication</em>'.
	 * @generated
	 */
	CasAuthentication createCasAuthentication();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Label</em>'.
	 * @generated
	 */
	ModelLabel createModelLabel();

	/**
	 * Returns a new object of class '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection</em>'.
	 * @generated
	 */
	Selection createSelection();

	/**
	 * Returns a new object of class '<em>Service Entity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Entity Element</em>'.
	 * @generated
	 */
	ServiceEntityElement createServiceEntityElement();

	/**
	 * Returns a new object of class '<em>Service Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Entity Association</em>'.
	 * @generated
	 */
	ServiceEntityAssociation createServiceEntityAssociation();

	/**
	 * Returns a new object of class '<em>Service View Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service View Association</em>'.
	 * @generated
	 */
	ServiceViewAssociation createServiceViewAssociation();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Static Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Menu</em>'.
	 * @generated
	 */
	StaticMenu createStaticMenu();

	/**
	 * Returns a new object of class '<em>Fixed Page Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Page Menu Entry</em>'.
	 * @generated
	 */
	FixedPageMenuEntry createFixedPageMenuEntry();

	/**
	 * Returns a new object of class '<em>Fixed Action Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Action Menu Entry</em>'.
	 * @generated
	 */
	FixedActionMenuEntry createFixedActionMenuEntry();

	/**
	 * Returns a new object of class '<em>Fixed Command Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Command Menu Entry</em>'.
	 * @generated
	 */
	FixedCommandMenuEntry createFixedCommandMenuEntry();

	/**
	 * Returns a new object of class '<em>Edit Static Text Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edit Static Text Menu Entry</em>'.
	 * @generated
	 */
	EditStaticTextMenuEntry createEditStaticTextMenuEntry();

	/**
	 * Returns a new object of class '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Menu</em>'.
	 * @generated
	 */
	DynamicMenu createDynamicMenu();

	/**
	 * Returns a new object of class '<em>Menu Included Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Included Element</em>'.
	 * @generated
	 */
	MenuIncludedElement createMenuIncludedElement();

	/**
	 * Returns a new object of class '<em>Captcha Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Captcha Field</em>'.
	 * @generated
	 */
	CaptchaField createCaptchaField();

	/**
	 * Returns a new object of class '<em>Unit Support Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Support Action</em>'.
	 * @generated
	 */
	UnitSupportAction createUnitSupportAction();

	/**
	 * Returns a new object of class '<em>Create Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Unit</em>'.
	 * @generated
	 */
	CreateUnit createCreateUnit();

	/**
	 * Returns a new object of class '<em>Create Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Update Unit</em>'.
	 * @generated
	 */
	CreateUpdateUnit createCreateUpdateUnit();

	/**
	 * Returns a new object of class '<em>Map Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Unit</em>'.
	 * @generated
	 */
	MapUnit createMapUnit();

	/**
	 * Returns a new object of class '<em>Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Unit</em>'.
	 * @generated
	 */
	UpdateUnit createUpdateUnit();

	/**
	 * Returns a new object of class '<em>Static Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Unit</em>'.
	 * @generated
	 */
	StaticUnit createStaticUnit();

	/**
	 * Returns a new object of class '<em>Command Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Unit</em>'.
	 * @generated
	 */
	CommandUnit createCommandUnit();

	/**
	 * Returns a new object of class '<em>User Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Command</em>'.
	 * @generated
	 */
	UserCommand createUserCommand();

	/**
	 * Returns a new object of class '<em>Create Sitemap Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Sitemap Unit</em>'.
	 * @generated
	 */
	CreateSitemapUnit createCreateSitemapUnit();

	/**
	 * Returns a new object of class '<em>Unit Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Element</em>'.
	 * @generated
	 */
	UnitElement createUnitElement();

	/**
	 * Returns a new object of class '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Association</em>'.
	 * @generated
	 */
	UnitAssociation createUnitAssociation();

	/**
	 * Returns a new object of class '<em>Unit Child Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Child Element</em>'.
	 * @generated
	 */
	UnitChildElement createUnitChildElement();

	/**
	 * Returns a new object of class '<em>Unit Child Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Child Association</em>'.
	 * @generated
	 */
	UnitChildAssociation createUnitChildAssociation();

	/**
	 * Returns a new object of class '<em>Data Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Field</em>'.
	 * @generated
	 */
	DataTypeField createDataTypeField();

	/**
	 * Returns a new object of class '<em>Date Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Field</em>'.
	 * @generated
	 */
	DateField createDateField();

	/**
	 * Returns a new object of class '<em>Details Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Details Unit</em>'.
	 * @generated
	 */
	DetailsUnit createDetailsUnit();

	/**
	 * Returns a new object of class '<em>Index Grid Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Grid Unit</em>'.
	 * @generated
	 */
	IndexGridUnit createIndexGridUnit();

	/**
	 * Returns a new object of class '<em>Index Page Direction Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Page Direction Unit</em>'.
	 * @generated
	 */
	IndexPageDirectionUnit createIndexPageDirectionUnit();

	/**
	 * Returns a new object of class '<em>Index Line Direction Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Line Direction Unit</em>'.
	 * @generated
	 */
	IndexLineDirectionUnit createIndexLineDirectionUnit();

	/**
	 * Returns a new object of class '<em>Search Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Unit</em>'.
	 * @generated
	 */
	SearchUnit createSearchUnit();

	/**
	 * Returns a new object of class '<em>Action Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Unit</em>'.
	 * @generated
	 */
	ActionUnit createActionUnit();

	/**
	 * Returns a new object of class '<em>Registration Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registration Unit</em>'.
	 * @generated
	 */
	RegistrationUnit createRegistrationUnit();

	/**
	 * Returns a new object of class '<em>Login Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Login Unit</em>'.
	 * @generated
	 */
	LoginUnit createLoginUnit();

	/**
	 * Returns a new object of class '<em>Forgotten Password Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forgotten Password Unit</em>'.
	 * @generated
	 */
	ForgottenPasswordUnit createForgottenPasswordUnit();

	/**
	 * Returns a new object of class '<em>Select Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Action</em>'.
	 * @generated
	 */
	SelectAction createSelectAction();

	/**
	 * Returns a new object of class '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Action</em>'.
	 * @generated
	 */
	DeleteAction createDeleteAction();

	/**
	 * Returns a new object of class '<em>Feature Support Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Support Action</em>'.
	 * @generated
	 */
	FeatureSupportAction createFeatureSupportAction();

	/**
	 * Returns a new object of class '<em>Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Reference</em>'.
	 * @generated
	 */
	ModelReference createModelReference();

	/**
	 * Returns a new object of class '<em>Feature Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Reference</em>'.
	 * @generated
	 */
	FeatureReference createFeatureReference();

	/**
	 * Returns a new object of class '<em>Current User Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current User Reference</em>'.
	 * @generated
	 */
	CurrentUserReference createCurrentUserReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JsfPackage getJsfPackage();

} //JsfFactory
