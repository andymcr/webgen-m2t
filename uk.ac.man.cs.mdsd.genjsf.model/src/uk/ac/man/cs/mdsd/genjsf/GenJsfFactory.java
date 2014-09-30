/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenJsfFactory.java,v 1.45 2014/08/22 14:32:38 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage
 * @generated
 */
public interface GenJsfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenJsfFactory eINSTANCE = uk.ac.man.cs.mdsd.genjsf.impl.GenJsfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	GenJsfModel createGenJsfModel();

	/**
	 * Returns a new object of class '<em>Gen Cas Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Cas Authentication</em>'.
	 * @generated
	 */
	GenCasAuthentication createGenCasAuthentication();

	/**
	 * Returns a new object of class '<em>Gen Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Local Authentication System</em>'.
	 * @generated
	 */
	GenLocalAuthenticationSystem createGenLocalAuthenticationSystem();

	/**
	 * Returns a new object of class '<em>Gen Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Service</em>'.
	 * @generated
	 */
	GenService createGenService();

	/**
	 * Returns a new object of class '<em>Gen Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Model Label</em>'.
	 * @generated
	 */
	GenModelLabel createGenModelLabel();

	/**
	 * Returns a new object of class '<em>Gen Service Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Service Entity Association</em>'.
	 * @generated
	 */
	GenServiceEntityAssociation createGenServiceEntityAssociation();

	/**
	 * Returns a new object of class '<em>Gen Service View Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Service View Association</em>'.
	 * @generated
	 */
	GenServiceViewAssociation createGenServiceViewAssociation();

	/**
	 * Returns a new object of class '<em>Gen Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Selection</em>'.
	 * @generated
	 */
	GenSelection createGenSelection();

	/**
	 * Returns a new object of class '<em>Gen Service Entity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Service Entity Element</em>'.
	 * @generated
	 */
	GenServiceEntityElement createGenServiceEntityElement();

	/**
	 * Returns a new object of class '<em>Gen Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Page</em>'.
	 * @generated
	 */
	GenPage createGenPage();

	/**
	 * Returns a new object of class '<em>Gen Static Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Static Menu</em>'.
	 * @generated
	 */
	GenStaticMenu createGenStaticMenu();

	/**
	 * Returns a new object of class '<em>Gen Fixed Page Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Fixed Page Menu Entry</em>'.
	 * @generated
	 */
	GenFixedPageMenuEntry createGenFixedPageMenuEntry();

	/**
	 * Returns a new object of class '<em>Gen Fixed Action Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Fixed Action Menu Entry</em>'.
	 * @generated
	 */
	GenFixedActionMenuEntry createGenFixedActionMenuEntry();

	/**
	 * Returns a new object of class '<em>Gen Fixed Command Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Fixed Command Menu Entry</em>'.
	 * @generated
	 */
	GenFixedCommandMenuEntry createGenFixedCommandMenuEntry();

	/**
	 * Returns a new object of class '<em>Gen Edit Static Text Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Edit Static Text Menu Entry</em>'.
	 * @generated
	 */
	GenEditStaticTextMenuEntry createGenEditStaticTextMenuEntry();

	/**
	 * Returns a new object of class '<em>Gen Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Dynamic Menu</em>'.
	 * @generated
	 */
	GenDynamicMenu createGenDynamicMenu();

	/**
	 * Returns a new object of class '<em>Gen Menu Included Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Menu Included Element</em>'.
	 * @generated
	 */
	GenMenuIncludedElement createGenMenuIncludedElement();

	/**
	 * Returns a new object of class '<em>Gen Create Sitemap Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Create Sitemap Unit</em>'.
	 * @generated
	 */
	GenCreateSitemapUnit createGenCreateSitemapUnit();

	/**
	 * Returns a new object of class '<em>Gen Captcha Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Captcha Field</em>'.
	 * @generated
	 */
	GenCaptchaField createGenCaptchaField();

	/**
	 * Returns a new object of class '<em>Gen Unit Support Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Unit Support Action</em>'.
	 * @generated
	 */
	GenUnitSupportAction createGenUnitSupportAction();

	/**
	 * Returns a new object of class '<em>Gen Static Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Static Unit</em>'.
	 * @generated
	 */
	GenStaticUnit createGenStaticUnit();

	/**
	 * Returns a new object of class '<em>Gen Command Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Command Unit</em>'.
	 * @generated
	 */
	GenCommandUnit createGenCommandUnit();

	/**
	 * Returns a new object of class '<em>Gen User Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen User Command</em>'.
	 * @generated
	 */
	GenUserCommand createGenUserCommand();

	/**
	 * Returns a new object of class '<em>Gen Unit Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Unit Element</em>'.
	 * @generated
	 */
	GenUnitElement createGenUnitElement();

	/**
	 * Returns a new object of class '<em>Gen Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Unit Association</em>'.
	 * @generated
	 */
	GenUnitAssociation createGenUnitAssociation();

	/**
	 * Returns a new object of class '<em>Gen Unit Child Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Unit Child Element</em>'.
	 * @generated
	 */
	GenUnitChildElement createGenUnitChildElement();

	/**
	 * Returns a new object of class '<em>Gen Unit Child Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Unit Child Association</em>'.
	 * @generated
	 */
	GenUnitChildAssociation createGenUnitChildAssociation();

	/**
	 * Returns a new object of class '<em>Gen Data Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Data Type Field</em>'.
	 * @generated
	 */
	GenDataTypeField createGenDataTypeField();

	/**
	 * Returns a new object of class '<em>Gen Date Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Date Field</em>'.
	 * @generated
	 */
	GenDateField createGenDateField();

	/**
	 * Returns a new object of class '<em>Gen Create Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Create Unit</em>'.
	 * @generated
	 */
	GenCreateUnit createGenCreateUnit();

	/**
	 * Returns a new object of class '<em>Gen Create Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Create Update Unit</em>'.
	 * @generated
	 */
	GenCreateUpdateUnit createGenCreateUpdateUnit();

	/**
	 * Returns a new object of class '<em>Gen Map Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Map Unit</em>'.
	 * @generated
	 */
	GenMapUnit createGenMapUnit();

	/**
	 * Returns a new object of class '<em>Gen Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Update Unit</em>'.
	 * @generated
	 */
	GenUpdateUnit createGenUpdateUnit();

	/**
	 * Returns a new object of class '<em>Gen Select Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Select Action</em>'.
	 * @generated
	 */
	GenSelectAction createGenSelectAction();

	/**
	 * Returns a new object of class '<em>Gen Details Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Details Unit</em>'.
	 * @generated
	 */
	GenDetailsUnit createGenDetailsUnit();

	/**
	 * Returns a new object of class '<em>Gen Index Grid Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Index Grid Unit</em>'.
	 * @generated
	 */
	GenIndexGridUnit createGenIndexGridUnit();

	/**
	 * Returns a new object of class '<em>Gen Index Page Direction Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Index Page Direction Unit</em>'.
	 * @generated
	 */
	GenIndexPageDirectionUnit createGenIndexPageDirectionUnit();

	/**
	 * Returns a new object of class '<em>Gen Index Line Direction Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Index Line Direction Unit</em>'.
	 * @generated
	 */
	GenIndexLineDirectionUnit createGenIndexLineDirectionUnit();

	/**
	 * Returns a new object of class '<em>Gen Search Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Search Unit</em>'.
	 * @generated
	 */
	GenSearchUnit createGenSearchUnit();

	/**
	 * Returns a new object of class '<em>Gen Action Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Action Unit</em>'.
	 * @generated
	 */
	GenActionUnit createGenActionUnit();

	/**
	 * Returns a new object of class '<em>Gen Registration Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Registration Unit</em>'.
	 * @generated
	 */
	GenRegistrationUnit createGenRegistrationUnit();

	/**
	 * Returns a new object of class '<em>Gen Login Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Login Unit</em>'.
	 * @generated
	 */
	GenLoginUnit createGenLoginUnit();

	/**
	 * Returns a new object of class '<em>Gen Forgotten Password Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Forgotten Password Unit</em>'.
	 * @generated
	 */
	GenForgottenPasswordUnit createGenForgottenPasswordUnit();

	/**
	 * Returns a new object of class '<em>Gen Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Delete Action</em>'.
	 * @generated
	 */
	GenDeleteAction createGenDeleteAction();

	/**
	 * Returns a new object of class '<em>Gen Feature Support Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Feature Support Action</em>'.
	 * @generated
	 */
	GenFeatureSupportAction createGenFeatureSupportAction();

	/**
	 * Returns a new object of class '<em>Gen Feature Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Feature Reference</em>'.
	 * @generated
	 */
	GenFeatureReference createGenFeatureReference();

	/**
	 * Returns a new object of class '<em>Gen Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Model Reference</em>'.
	 * @generated
	 */
	GenModelReference createGenModelReference();

	/**
	 * Returns a new object of class '<em>Gen Current User Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Current User Reference</em>'.
	 * @generated
	 */
	GenCurrentUserReference createGenCurrentUserReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenJsfPackage getGenJsfPackage();

} //GenJsfFactory
