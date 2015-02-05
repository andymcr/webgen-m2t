/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenJsfFactoryImpl.java,v 1.51 2014/08/22 14:32:38 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.man.cs.mdsd.genjsf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenJsfFactoryImpl extends EFactoryImpl implements GenJsfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenJsfFactory init() {
		try {
			GenJsfFactory theGenJsfFactory = (GenJsfFactory)EPackage.Registry.INSTANCE.getEFactory(GenJsfPackage.eNS_URI);
			if (theGenJsfFactory != null) {
				return theGenJsfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenJsfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenJsfFactoryImpl() {
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
			case GenJsfPackage.GEN_JSF_MODEL: return createGenJsfModel();
			case GenJsfPackage.GEN_CAS_AUTHENTICATION: return createGenCasAuthentication();
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM: return createGenLocalAuthenticationSystem();
			case GenJsfPackage.GEN_SERVICE: return createGenService();
			case GenJsfPackage.GEN_MODEL_LABEL: return createGenModelLabel();
			case GenJsfPackage.GEN_SELECTION: return createGenSelection();
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT: return createGenServiceEntityElement();
			case GenJsfPackage.GEN_SERVICE_ENTITY_ASSOCIATION: return createGenServiceEntityAssociation();
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION: return createGenServiceViewAssociation();
			case GenJsfPackage.GEN_PAGE: return createGenPage();
			case GenJsfPackage.GEN_STATIC_MENU: return createGenStaticMenu();
			case GenJsfPackage.GEN_FIXED_PAGE_MENU_ENTRY: return createGenFixedPageMenuEntry();
			case GenJsfPackage.GEN_FIXED_ACTION_MENU_ENTRY: return createGenFixedActionMenuEntry();
			case GenJsfPackage.GEN_FIXED_COMMAND_MENU_ENTRY: return createGenFixedCommandMenuEntry();
			case GenJsfPackage.GEN_EDIT_STATIC_TEXT_MENU_ENTRY: return createGenEditStaticTextMenuEntry();
			case GenJsfPackage.GEN_DYNAMIC_MENU: return createGenDynamicMenu();
			case GenJsfPackage.GEN_MENU_INCLUDED_ELEMENT: return createGenMenuIncludedElement();
			case GenJsfPackage.GEN_CREATE_SITEMAP_UNIT: return createGenCreateSitemapUnit();
			case GenJsfPackage.GEN_STATIC_UNIT: return createGenStaticUnit();
			case GenJsfPackage.GEN_COMMAND_UNIT: return createGenCommandUnit();
			case GenJsfPackage.GEN_USER_COMMAND: return createGenUserCommand();
			case GenJsfPackage.GEN_UNIT_ELEMENT: return createGenUnitElement();
			case GenJsfPackage.GEN_UNIT_ASSOCIATION: return createGenUnitAssociation();
			case GenJsfPackage.GEN_UNIT_CHILD_ELEMENT: return createGenUnitChildElement();
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION: return createGenUnitChildAssociation();
			case GenJsfPackage.GEN_DATA_TYPE_FIELD: return createGenDataTypeField();
			case GenJsfPackage.GEN_DATE_FIELD: return createGenDateField();
			case GenJsfPackage.GEN_CAPTCHA_FIELD: return createGenCaptchaField();
			case GenJsfPackage.GEN_UNIT_SUPPORT_ACTION: return createGenUnitSupportAction();
			case GenJsfPackage.GEN_CREATE_UNIT: return createGenCreateUnit();
			case GenJsfPackage.GEN_CREATE_UPDATE_UNIT: return createGenCreateUpdateUnit();
			case GenJsfPackage.GEN_MAP_UNIT: return createGenMapUnit();
			case GenJsfPackage.GEN_UPDATE_UNIT: return createGenUpdateUnit();
			case GenJsfPackage.GEN_DETAILS_UNIT: return createGenDetailsUnit();
			case GenJsfPackage.GEN_INDEX_GRID_UNIT: return createGenIndexGridUnit();
			case GenJsfPackage.GEN_INDEX_PAGE_DIRECTION_UNIT: return createGenIndexPageDirectionUnit();
			case GenJsfPackage.GEN_INDEX_LINE_DIRECTION_UNIT: return createGenIndexLineDirectionUnit();
			case GenJsfPackage.GEN_SEARCH_UNIT: return createGenSearchUnit();
			case GenJsfPackage.GEN_ACTION_UNIT: return createGenActionUnit();
			case GenJsfPackage.GEN_REGISTRATION_UNIT: return createGenRegistrationUnit();
			case GenJsfPackage.GEN_LOGIN_UNIT: return createGenLoginUnit();
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT: return createGenForgottenPasswordUnit();
			case GenJsfPackage.GEN_SELECT_ACTION: return createGenSelectAction();
			case GenJsfPackage.GEN_DELETE_ACTION: return createGenDeleteAction();
			case GenJsfPackage.GEN_FEATURE_SUPPORT_ACTION: return createGenFeatureSupportAction();
			case GenJsfPackage.GEN_FEATURE_REFERENCE: return createGenFeatureReference();
			case GenJsfPackage.GEN_MODEL_REFERENCE: return createGenModelReference();
			case GenJsfPackage.GEN_CURRENT_USER_REFERENCE: return createGenCurrentUserReference();
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
			case GenJsfPackage.SELECT_ONEOF_OPTIONS:
				return createSelectOneofOptionsFromString(eDataType, initialValue);
			case GenJsfPackage.SELECT_MANY_OPTIONS:
				return createSelectManyOptionsFromString(eDataType, initialValue);
			case GenJsfPackage.INPUT_MESSAGE_PLACEMENT_OPTIONS:
				return createInputMessagePlacementOptionsFromString(eDataType, initialValue);
			case GenJsfPackage.INPUT_MESSAGE_DISPLAY_OPTIONS:
				return createInputMessageDisplayOptionsFromString(eDataType, initialValue);
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
			case GenJsfPackage.SELECT_ONEOF_OPTIONS:
				return convertSelectOneofOptionsToString(eDataType, instanceValue);
			case GenJsfPackage.SELECT_MANY_OPTIONS:
				return convertSelectManyOptionsToString(eDataType, instanceValue);
			case GenJsfPackage.INPUT_MESSAGE_PLACEMENT_OPTIONS:
				return convertInputMessagePlacementOptionsToString(eDataType, instanceValue);
			case GenJsfPackage.INPUT_MESSAGE_DISPLAY_OPTIONS:
				return convertInputMessageDisplayOptionsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenJsfModel createGenJsfModel() {
		GenJsfModelImpl genJsfModel = new GenJsfModelImpl();
		return genJsfModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCasAuthentication createGenCasAuthentication() {
		GenCasAuthenticationImpl genCasAuthentication = new GenCasAuthenticationImpl();
		return genCasAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLocalAuthenticationSystem createGenLocalAuthenticationSystem() {
		GenLocalAuthenticationSystemImpl genLocalAuthenticationSystem = new GenLocalAuthenticationSystemImpl();
		return genLocalAuthenticationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenService createGenService() {
		GenServiceImpl genService = new GenServiceImpl();
		return genService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModelLabel createGenModelLabel() {
		GenModelLabelImpl genModelLabel = new GenModelLabelImpl();
		return genModelLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityAssociation createGenServiceEntityAssociation() {
		GenServiceEntityAssociationImpl genServiceEntityAssociation = new GenServiceEntityAssociationImpl();
		return genServiceEntityAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceViewAssociation createGenServiceViewAssociation() {
		GenServiceViewAssociationImpl genServiceViewAssociation = new GenServiceViewAssociationImpl();
		return genServiceViewAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSelection createGenSelection() {
		GenSelectionImpl genSelection = new GenSelectionImpl();
		return genSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenServiceEntityElement createGenServiceEntityElement() {
		GenServiceEntityElementImpl genServiceEntityElement = new GenServiceEntityElementImpl();
		return genServiceEntityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPage createGenPage() {
		GenPageImpl genPage = new GenPageImpl();
		return genPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenStaticMenu createGenStaticMenu() {
		GenStaticMenuImpl genStaticMenu = new GenStaticMenuImpl();
		return genStaticMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFixedPageMenuEntry createGenFixedPageMenuEntry() {
		GenFixedPageMenuEntryImpl genFixedPageMenuEntry = new GenFixedPageMenuEntryImpl();
		return genFixedPageMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFixedActionMenuEntry createGenFixedActionMenuEntry() {
		GenFixedActionMenuEntryImpl genFixedActionMenuEntry = new GenFixedActionMenuEntryImpl();
		return genFixedActionMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFixedCommandMenuEntry createGenFixedCommandMenuEntry() {
		GenFixedCommandMenuEntryImpl genFixedCommandMenuEntry = new GenFixedCommandMenuEntryImpl();
		return genFixedCommandMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEditStaticTextMenuEntry createGenEditStaticTextMenuEntry() {
		GenEditStaticTextMenuEntryImpl genEditStaticTextMenuEntry = new GenEditStaticTextMenuEntryImpl();
		return genEditStaticTextMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDynamicMenu createGenDynamicMenu() {
		GenDynamicMenuImpl genDynamicMenu = new GenDynamicMenuImpl();
		return genDynamicMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenMenuIncludedElement createGenMenuIncludedElement() {
		GenMenuIncludedElementImpl genMenuIncludedElement = new GenMenuIncludedElementImpl();
		return genMenuIncludedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCreateSitemapUnit createGenCreateSitemapUnit() {
		GenCreateSitemapUnitImpl genCreateSitemapUnit = new GenCreateSitemapUnitImpl();
		return genCreateSitemapUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCaptchaField createGenCaptchaField() {
		GenCaptchaFieldImpl genCaptchaField = new GenCaptchaFieldImpl();
		return genCaptchaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitSupportAction createGenUnitSupportAction() {
		GenUnitSupportActionImpl genUnitSupportAction = new GenUnitSupportActionImpl();
		return genUnitSupportAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenStaticUnit createGenStaticUnit() {
		GenStaticUnitImpl genStaticUnit = new GenStaticUnitImpl();
		return genStaticUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCommandUnit createGenCommandUnit() {
		GenCommandUnitImpl genCommandUnit = new GenCommandUnitImpl();
		return genCommandUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUserCommand createGenUserCommand() {
		GenUserCommandImpl genUserCommand = new GenUserCommandImpl();
		return genUserCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitElement createGenUnitElement() {
		GenUnitElementImpl genUnitElement = new GenUnitElementImpl();
		return genUnitElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitAssociation createGenUnitAssociation() {
		GenUnitAssociationImpl genUnitAssociation = new GenUnitAssociationImpl();
		return genUnitAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitChildElement createGenUnitChildElement() {
		GenUnitChildElementImpl genUnitChildElement = new GenUnitChildElementImpl();
		return genUnitChildElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitChildAssociation createGenUnitChildAssociation() {
		GenUnitChildAssociationImpl genUnitChildAssociation = new GenUnitChildAssociationImpl();
		return genUnitChildAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDataTypeField createGenDataTypeField() {
		GenDataTypeFieldImpl genDataTypeField = new GenDataTypeFieldImpl();
		return genDataTypeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDateField createGenDateField() {
		GenDateFieldImpl genDateField = new GenDateFieldImpl();
		return genDateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCreateUnit createGenCreateUnit() {
		GenCreateUnitImpl genCreateUnit = new GenCreateUnitImpl();
		return genCreateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCreateUpdateUnit createGenCreateUpdateUnit() {
		GenCreateUpdateUnitImpl genCreateUpdateUnit = new GenCreateUpdateUnitImpl();
		return genCreateUpdateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenMapUnit createGenMapUnit() {
		GenMapUnitImpl genMapUnit = new GenMapUnitImpl();
		return genMapUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUpdateUnit createGenUpdateUnit() {
		GenUpdateUnitImpl genUpdateUnit = new GenUpdateUnitImpl();
		return genUpdateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSelectAction createGenSelectAction() {
		GenSelectActionImpl genSelectAction = new GenSelectActionImpl();
		return genSelectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDetailsUnit createGenDetailsUnit() {
		GenDetailsUnitImpl genDetailsUnit = new GenDetailsUnitImpl();
		return genDetailsUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenIndexGridUnit createGenIndexGridUnit() {
		GenIndexGridUnitImpl genIndexGridUnit = new GenIndexGridUnitImpl();
		return genIndexGridUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenIndexPageDirectionUnit createGenIndexPageDirectionUnit() {
		GenIndexPageDirectionUnitImpl genIndexPageDirectionUnit = new GenIndexPageDirectionUnitImpl();
		return genIndexPageDirectionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenIndexLineDirectionUnit createGenIndexLineDirectionUnit() {
		GenIndexLineDirectionUnitImpl genIndexLineDirectionUnit = new GenIndexLineDirectionUnitImpl();
		return genIndexLineDirectionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSearchUnit createGenSearchUnit() {
		GenSearchUnitImpl genSearchUnit = new GenSearchUnitImpl();
		return genSearchUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenActionUnit createGenActionUnit() {
		GenActionUnitImpl genActionUnit = new GenActionUnitImpl();
		return genActionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenRegistrationUnit createGenRegistrationUnit() {
		GenRegistrationUnitImpl genRegistrationUnit = new GenRegistrationUnitImpl();
		return genRegistrationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLoginUnit createGenLoginUnit() {
		GenLoginUnitImpl genLoginUnit = new GenLoginUnitImpl();
		return genLoginUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenForgottenPasswordUnit createGenForgottenPasswordUnit() {
		GenForgottenPasswordUnitImpl genForgottenPasswordUnit = new GenForgottenPasswordUnitImpl();
		return genForgottenPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDeleteAction createGenDeleteAction() {
		GenDeleteActionImpl genDeleteAction = new GenDeleteActionImpl();
		return genDeleteAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeatureSupportAction createGenFeatureSupportAction() {
		GenFeatureSupportActionImpl genFeatureSupportAction = new GenFeatureSupportActionImpl();
		return genFeatureSupportAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeatureReference createGenFeatureReference() {
		GenFeatureReferenceImpl genFeatureReference = new GenFeatureReferenceImpl();
		return genFeatureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModelReference createGenModelReference() {
		GenModelReferenceImpl genModelReference = new GenModelReferenceImpl();
		return genModelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenCurrentUserReference createGenCurrentUserReference() {
		GenCurrentUserReferenceImpl genCurrentUserReference = new GenCurrentUserReferenceImpl();
		return genCurrentUserReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectOneofOptions createSelectOneofOptionsFromString(EDataType eDataType, String initialValue) {
		SelectOneofOptions result = SelectOneofOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelectOneofOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectManyOptions createSelectManyOptionsFromString(EDataType eDataType, String initialValue) {
		SelectManyOptions result = SelectManyOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelectManyOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMessagePlacementOptions createInputMessagePlacementOptionsFromString(EDataType eDataType, String initialValue) {
		InputMessagePlacementOptions result = InputMessagePlacementOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputMessagePlacementOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMessageDisplayOptions createInputMessageDisplayOptionsFromString(EDataType eDataType, String initialValue) {
		InputMessageDisplayOptions result = InputMessageDisplayOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputMessageDisplayOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenJsfPackage getGenJsfPackage() {
		return (GenJsfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenJsfPackage getPackage() {
		return GenJsfPackage.eINSTANCE;
	}

} //GenJsfFactoryImpl
