/**
 * <copyright>
 * </copyright>
 *
 * $Id: JsfFactoryImpl.java,v 1.54 2014/08/22 14:32:56 andy Exp $
 */
package uk.ac.man.cs.mdsd.jsf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.man.cs.mdsd.jsf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsfFactoryImpl extends EFactoryImpl implements JsfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JsfFactory init() {
		try {
			JsfFactory theJsfFactory = (JsfFactory)EPackage.Registry.INSTANCE.getEFactory(JsfPackage.eNS_URI);
			if (theJsfFactory != null) {
				return theJsfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JsfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsfFactoryImpl() {
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
			case JsfPackage.JSF_MODEL: return createJsfModel();
			case JsfPackage.LOCAL_AUTHENTICATION_SYSTEM: return createLocalAuthenticationSystem();
			case JsfPackage.CAS_AUTHENTICATION: return createCasAuthentication();
			case JsfPackage.SERVICE: return createService();
			case JsfPackage.MODEL_LABEL: return createModelLabel();
			case JsfPackage.SELECTION: return createSelection();
			case JsfPackage.SERVICE_ENTITY_ELEMENT: return createServiceEntityElement();
			case JsfPackage.SERVICE_ENTITY_ASSOCIATION: return createServiceEntityAssociation();
			case JsfPackage.SERVICE_VIEW_ASSOCIATION: return createServiceViewAssociation();
			case JsfPackage.PAGE: return createPage();
			case JsfPackage.STATIC_MENU: return createStaticMenu();
			case JsfPackage.FIXED_PAGE_MENU_ENTRY: return createFixedPageMenuEntry();
			case JsfPackage.FIXED_ACTION_MENU_ENTRY: return createFixedActionMenuEntry();
			case JsfPackage.FIXED_COMMAND_MENU_ENTRY: return createFixedCommandMenuEntry();
			case JsfPackage.EDIT_STATIC_TEXT_MENU_ENTRY: return createEditStaticTextMenuEntry();
			case JsfPackage.DYNAMIC_MENU: return createDynamicMenu();
			case JsfPackage.MENU_INCLUDED_ELEMENT: return createMenuIncludedElement();
			case JsfPackage.STATIC_UNIT: return createStaticUnit();
			case JsfPackage.COMMAND_UNIT: return createCommandUnit();
			case JsfPackage.USER_COMMAND: return createUserCommand();
			case JsfPackage.CREATE_SITEMAP_UNIT: return createCreateSitemapUnit();
			case JsfPackage.UNIT_ELEMENT: return createUnitElement();
			case JsfPackage.UNIT_ASSOCIATION: return createUnitAssociation();
			case JsfPackage.UNIT_CHILD_ELEMENT: return createUnitChildElement();
			case JsfPackage.UNIT_CHILD_ASSOCIATION: return createUnitChildAssociation();
			case JsfPackage.DATA_TYPE_FIELD: return createDataTypeField();
			case JsfPackage.DATE_FIELD: return createDateField();
			case JsfPackage.CAPTCHA_FIELD: return createCaptchaField();
			case JsfPackage.UNIT_SUPPORT_ACTION: return createUnitSupportAction();
			case JsfPackage.CREATE_UNIT: return createCreateUnit();
			case JsfPackage.CREATE_UPDATE_UNIT: return createCreateUpdateUnit();
			case JsfPackage.MAP_UNIT: return createMapUnit();
			case JsfPackage.UPDATE_UNIT: return createUpdateUnit();
			case JsfPackage.DETAILS_UNIT: return createDetailsUnit();
			case JsfPackage.INDEX_GRID_UNIT: return createIndexGridUnit();
			case JsfPackage.INDEX_PAGE_DIRECTION_UNIT: return createIndexPageDirectionUnit();
			case JsfPackage.INDEX_LINE_DIRECTION_UNIT: return createIndexLineDirectionUnit();
			case JsfPackage.SEARCH_UNIT: return createSearchUnit();
			case JsfPackage.ACTION_UNIT: return createActionUnit();
			case JsfPackage.REGISTRATION_UNIT: return createRegistrationUnit();
			case JsfPackage.LOGIN_UNIT: return createLoginUnit();
			case JsfPackage.FORGOTTEN_PASSWORD_UNIT: return createForgottenPasswordUnit();
			case JsfPackage.SELECT_ACTION: return createSelectAction();
			case JsfPackage.DELETE_ACTION: return createDeleteAction();
			case JsfPackage.FEATURE_SUPPORT_ACTION: return createFeatureSupportAction();
			case JsfPackage.MODEL_REFERENCE: return createModelReference();
			case JsfPackage.FEATURE_REFERENCE: return createFeatureReference();
			case JsfPackage.CURRENT_USER_REFERENCE: return createCurrentUserReference();
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
			case JsfPackage.FRAMEWORK_TECHNOLOGIES:
				return createFrameworkTechnologiesFromString(eDataType, initialValue);
			case JsfPackage.AJAX_TECHNOLOGIES:
				return createAjaxTechnologiesFromString(eDataType, initialValue);
			case JsfPackage.PAGE_TOP_MENU_OPTIONS:
				return createPageTopMenuOptionsFromString(eDataType, initialValue);
			case JsfPackage.COLLECTION_DISPLAY_OPTIONS:
				return createCollectionDisplayOptionsFromString(eDataType, initialValue);
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
			case JsfPackage.FRAMEWORK_TECHNOLOGIES:
				return convertFrameworkTechnologiesToString(eDataType, instanceValue);
			case JsfPackage.AJAX_TECHNOLOGIES:
				return convertAjaxTechnologiesToString(eDataType, instanceValue);
			case JsfPackage.PAGE_TOP_MENU_OPTIONS:
				return convertPageTopMenuOptionsToString(eDataType, instanceValue);
			case JsfPackage.COLLECTION_DISPLAY_OPTIONS:
				return convertCollectionDisplayOptionsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsfModel createJsfModel() {
		JsfModelImpl jsfModel = new JsfModelImpl();
		return jsfModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystem createLocalAuthenticationSystem() {
		LocalAuthenticationSystemImpl localAuthenticationSystem = new LocalAuthenticationSystemImpl();
		return localAuthenticationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasAuthentication createCasAuthentication() {
		CasAuthenticationImpl casAuthentication = new CasAuthenticationImpl();
		return casAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabel createModelLabel() {
		ModelLabelImpl modelLabel = new ModelLabelImpl();
		return modelLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection createSelection() {
		SelectionImpl selection = new SelectionImpl();
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement createServiceEntityElement() {
		ServiceEntityElementImpl serviceEntityElement = new ServiceEntityElementImpl();
		return serviceEntityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityAssociation createServiceEntityAssociation() {
		ServiceEntityAssociationImpl serviceEntityAssociation = new ServiceEntityAssociationImpl();
		return serviceEntityAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceViewAssociation createServiceViewAssociation() {
		ServiceViewAssociationImpl serviceViewAssociation = new ServiceViewAssociationImpl();
		return serviceViewAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticMenu createStaticMenu() {
		StaticMenuImpl staticMenu = new StaticMenuImpl();
		return staticMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedPageMenuEntry createFixedPageMenuEntry() {
		FixedPageMenuEntryImpl fixedPageMenuEntry = new FixedPageMenuEntryImpl();
		return fixedPageMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedActionMenuEntry createFixedActionMenuEntry() {
		FixedActionMenuEntryImpl fixedActionMenuEntry = new FixedActionMenuEntryImpl();
		return fixedActionMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedCommandMenuEntry createFixedCommandMenuEntry() {
		FixedCommandMenuEntryImpl fixedCommandMenuEntry = new FixedCommandMenuEntryImpl();
		return fixedCommandMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditStaticTextMenuEntry createEditStaticTextMenuEntry() {
		EditStaticTextMenuEntryImpl editStaticTextMenuEntry = new EditStaticTextMenuEntryImpl();
		return editStaticTextMenuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicMenu createDynamicMenu() {
		DynamicMenuImpl dynamicMenu = new DynamicMenuImpl();
		return dynamicMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuIncludedElement createMenuIncludedElement() {
		MenuIncludedElementImpl menuIncludedElement = new MenuIncludedElementImpl();
		return menuIncludedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptchaField createCaptchaField() {
		CaptchaFieldImpl captchaField = new CaptchaFieldImpl();
		return captchaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSupportAction createUnitSupportAction() {
		UnitSupportActionImpl unitSupportAction = new UnitSupportActionImpl();
		return unitSupportAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateUnit createCreateUnit() {
		CreateUnitImpl createUnit = new CreateUnitImpl();
		return createUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateUpdateUnit createCreateUpdateUnit() {
		CreateUpdateUnitImpl createUpdateUnit = new CreateUpdateUnitImpl();
		return createUpdateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapUnit createMapUnit() {
		MapUnitImpl mapUnit = new MapUnitImpl();
		return mapUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateUnit createUpdateUnit() {
		UpdateUnitImpl updateUnit = new UpdateUnitImpl();
		return updateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticUnit createStaticUnit() {
		StaticUnitImpl staticUnit = new StaticUnitImpl();
		return staticUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandUnit createCommandUnit() {
		CommandUnitImpl commandUnit = new CommandUnitImpl();
		return commandUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserCommand createUserCommand() {
		UserCommandImpl userCommand = new UserCommandImpl();
		return userCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateSitemapUnit createCreateSitemapUnit() {
		CreateSitemapUnitImpl createSitemapUnit = new CreateSitemapUnitImpl();
		return createSitemapUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitElement createUnitElement() {
		UnitElementImpl unitElement = new UnitElementImpl();
		return unitElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAssociation createUnitAssociation() {
		UnitAssociationImpl unitAssociation = new UnitAssociationImpl();
		return unitAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitChildElement createUnitChildElement() {
		UnitChildElementImpl unitChildElement = new UnitChildElementImpl();
		return unitChildElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitChildAssociation createUnitChildAssociation() {
		UnitChildAssociationImpl unitChildAssociation = new UnitChildAssociationImpl();
		return unitChildAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeField createDataTypeField() {
		DataTypeFieldImpl dataTypeField = new DataTypeFieldImpl();
		return dataTypeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateField createDateField() {
		DateFieldImpl dateField = new DateFieldImpl();
		return dateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailsUnit createDetailsUnit() {
		DetailsUnitImpl detailsUnit = new DetailsUnitImpl();
		return detailsUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexGridUnit createIndexGridUnit() {
		IndexGridUnitImpl indexGridUnit = new IndexGridUnitImpl();
		return indexGridUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexPageDirectionUnit createIndexPageDirectionUnit() {
		IndexPageDirectionUnitImpl indexPageDirectionUnit = new IndexPageDirectionUnitImpl();
		return indexPageDirectionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexLineDirectionUnit createIndexLineDirectionUnit() {
		IndexLineDirectionUnitImpl indexLineDirectionUnit = new IndexLineDirectionUnitImpl();
		return indexLineDirectionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchUnit createSearchUnit() {
		SearchUnitImpl searchUnit = new SearchUnitImpl();
		return searchUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionUnit createActionUnit() {
		ActionUnitImpl actionUnit = new ActionUnitImpl();
		return actionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationUnit createRegistrationUnit() {
		RegistrationUnitImpl registrationUnit = new RegistrationUnitImpl();
		return registrationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginUnit createLoginUnit() {
		LoginUnitImpl loginUnit = new LoginUnitImpl();
		return loginUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForgottenPasswordUnit createForgottenPasswordUnit() {
		ForgottenPasswordUnitImpl forgottenPasswordUnit = new ForgottenPasswordUnitImpl();
		return forgottenPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectAction createSelectAction() {
		SelectActionImpl selectAction = new SelectActionImpl();
		return selectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteAction createDeleteAction() {
		DeleteActionImpl deleteAction = new DeleteActionImpl();
		return deleteAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSupportAction createFeatureSupportAction() {
		FeatureSupportActionImpl featureSupportAction = new FeatureSupportActionImpl();
		return featureSupportAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelReference createModelReference() {
		ModelReferenceImpl modelReference = new ModelReferenceImpl();
		return modelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureReference createFeatureReference() {
		FeatureReferenceImpl featureReference = new FeatureReferenceImpl();
		return featureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentUserReference createCurrentUserReference() {
		CurrentUserReferenceImpl currentUserReference = new CurrentUserReferenceImpl();
		return currentUserReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkTechnologies createFrameworkTechnologiesFromString(EDataType eDataType, String initialValue) {
		FrameworkTechnologies result = FrameworkTechnologies.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameworkTechnologiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AjaxTechnologies createAjaxTechnologiesFromString(EDataType eDataType, String initialValue) {
		AjaxTechnologies result = AjaxTechnologies.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAjaxTechnologiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageTopMenuOptions createPageTopMenuOptionsFromString(EDataType eDataType, String initialValue) {
		PageTopMenuOptions result = PageTopMenuOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPageTopMenuOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionDisplayOptions createCollectionDisplayOptionsFromString(EDataType eDataType, String initialValue) {
		CollectionDisplayOptions result = CollectionDisplayOptions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionDisplayOptionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsfPackage getJsfPackage() {
		return (JsfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JsfPackage getPackage() {
		return JsfPackage.eINSTANCE;
	}

} //JsfFactoryImpl
