/**
 * <copyright>
 * </copyright>
 *
 * $Id: WafSwitch.java,v 1.63 2014/08/22 14:32:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.waf.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import uk.ac.man.cs.mdsd.criteria.Expression;
import uk.ac.man.cs.mdsd.criteria.Path;
import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;
import uk.ac.man.cs.mdsd.orm.NamedElement;
import uk.ac.man.cs.mdsd.waf.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.waf.WafPackage
 * @generated
 */
public class WafSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WafPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WafSwitch() {
		if (modelPackage == null) {
			modelPackage = WafPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WafPackage.WAF_MODEL: {
				WafModel wafModel = (WafModel)theEObject;
				T result = caseWafModel(wafModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.AUTHENTICATION: {
				Authentication authentication = (Authentication)theEObject;
				T result = caseAuthentication(authentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM: {
				LocalAuthenticationSystem localAuthenticationSystem = (LocalAuthenticationSystem)theEObject;
				T result = caseLocalAuthenticationSystem(localAuthenticationSystem);
				if (result == null) result = caseAuthentication(localAuthenticationSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.CAS_AUTHENTICATION: {
				CasAuthentication casAuthentication = (CasAuthentication)theEObject;
				T result = caseCasAuthentication(casAuthentication);
				if (result == null) result = caseAuthentication(casAuthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.INCLUDED_FEATURE: {
				IncludedFeature includedFeature = (IncludedFeature)theEObject;
				T result = caseIncludedFeature(includedFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.INCLUDED_ELEMENT: {
				IncludedElement includedElement = (IncludedElement)theEObject;
				T result = caseIncludedElement(includedElement);
				if (result == null) result = caseIncludedFeature(includedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.INCLUDED_ASSOCIATION: {
				IncludedAssociation includedAssociation = (IncludedAssociation)theEObject;
				T result = caseIncludedAssociation(includedAssociation);
				if (result == null) result = caseIncludedFeature(includedAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.MODEL_LABEL: {
				ModelLabel modelLabel = (ModelLabel)theEObject;
				T result = caseModelLabel(modelLabel);
				if (result == null) result = caseNamedElement(modelLabel);
				if (result == null) result = caseUnitTitle(modelLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.SELECTION: {
				Selection selection = (Selection)theEObject;
				T result = caseSelection(selection);
				if (result == null) result = caseNamedElement(selection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.SERVICE_FEATURE: {
				ServiceFeature serviceFeature = (ServiceFeature)theEObject;
				T result = caseServiceFeature(serviceFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.SERVICE_ENTITY_FEATURE: {
				ServiceEntityFeature serviceEntityFeature = (ServiceEntityFeature)theEObject;
				T result = caseServiceEntityFeature(serviceEntityFeature);
				if (result == null) result = caseIncludedFeature(serviceEntityFeature);
				if (result == null) result = caseServiceFeature(serviceEntityFeature);
				if (result == null) result = caseNamedElement(serviceEntityFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.SERVICE_ENTITY_ELEMENT: {
				ServiceEntityElement serviceEntityElement = (ServiceEntityElement)theEObject;
				T result = caseServiceEntityElement(serviceEntityElement);
				if (result == null) result = caseServiceEntityFeature(serviceEntityElement);
				if (result == null) result = caseIncludedElement(serviceEntityElement);
				if (result == null) result = caseUnitTitle(serviceEntityElement);
				if (result == null) result = caseIncludedFeature(serviceEntityElement);
				if (result == null) result = caseServiceFeature(serviceEntityElement);
				if (result == null) result = caseNamedElement(serviceEntityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.SERVICE_ASSOCIATION: {
				ServiceAssociation serviceAssociation = (ServiceAssociation)theEObject;
				T result = caseServiceAssociation(serviceAssociation);
				if (result == null) result = caseServiceFeature(serviceAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.SERVICE_ENTITY_ASSOCIATION: {
				ServiceEntityAssociation serviceEntityAssociation = (ServiceEntityAssociation)theEObject;
				T result = caseServiceEntityAssociation(serviceEntityAssociation);
				if (result == null) result = caseServiceEntityFeature(serviceEntityAssociation);
				if (result == null) result = caseServiceAssociation(serviceEntityAssociation);
				if (result == null) result = caseIncludedAssociation(serviceEntityAssociation);
				if (result == null) result = caseIncludedFeature(serviceEntityAssociation);
				if (result == null) result = caseServiceFeature(serviceEntityAssociation);
				if (result == null) result = caseNamedElement(serviceEntityAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.SERVICE_VIEW_ASSOCIATION: {
				ServiceViewAssociation serviceViewAssociation = (ServiceViewAssociation)theEObject;
				T result = caseServiceViewAssociation(serviceViewAssociation);
				if (result == null) result = caseNamedDisplayElement(serviceViewAssociation);
				if (result == null) result = caseServiceAssociation(serviceViewAssociation);
				if (result == null) result = caseNamedElement(serviceViewAssociation);
				if (result == null) result = caseServiceFeature(serviceViewAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = caseNamedDisplayElement(page);
				if (result == null) result = caseUnitContainer(page);
				if (result == null) result = caseNamedElement(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.MENU: {
				Menu menu = (Menu)theEObject;
				T result = caseMenu(menu);
				if (result == null) result = caseNamedDisplayElement(menu);
				if (result == null) result = caseNamedElement(menu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.MENU_ENTRY: {
				MenuEntry menuEntry = (MenuEntry)theEObject;
				T result = caseMenuEntry(menuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.STATIC_MENU: {
				StaticMenu staticMenu = (StaticMenu)theEObject;
				T result = caseStaticMenu(staticMenu);
				if (result == null) result = caseMenu(staticMenu);
				if (result == null) result = caseNamedDisplayElement(staticMenu);
				if (result == null) result = caseNamedElement(staticMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.FIXED_PAGE_MENU_ENTRY: {
				FixedPageMenuEntry fixedPageMenuEntry = (FixedPageMenuEntry)theEObject;
				T result = caseFixedPageMenuEntry(fixedPageMenuEntry);
				if (result == null) result = caseMenuEntry(fixedPageMenuEntry);
				if (result == null) result = caseNamedDisplayElement(fixedPageMenuEntry);
				if (result == null) result = caseNamedElement(fixedPageMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.FIXED_ACTION_MENU_ENTRY: {
				FixedActionMenuEntry fixedActionMenuEntry = (FixedActionMenuEntry)theEObject;
				T result = caseFixedActionMenuEntry(fixedActionMenuEntry);
				if (result == null) result = caseMenuEntry(fixedActionMenuEntry);
				if (result == null) result = caseNamedDisplayElement(fixedActionMenuEntry);
				if (result == null) result = caseNamedElement(fixedActionMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.FIXED_COMMAND_MENU_ENTRY: {
				FixedCommandMenuEntry fixedCommandMenuEntry = (FixedCommandMenuEntry)theEObject;
				T result = caseFixedCommandMenuEntry(fixedCommandMenuEntry);
				if (result == null) result = caseMenuEntry(fixedCommandMenuEntry);
				if (result == null) result = caseNamedDisplayElement(fixedCommandMenuEntry);
				if (result == null) result = caseNamedElement(fixedCommandMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY: {
				EditStaticTextMenuEntry editStaticTextMenuEntry = (EditStaticTextMenuEntry)theEObject;
				T result = caseEditStaticTextMenuEntry(editStaticTextMenuEntry);
				if (result == null) result = caseMenuEntry(editStaticTextMenuEntry);
				if (result == null) result = caseNamedDisplayElement(editStaticTextMenuEntry);
				if (result == null) result = caseNamedElement(editStaticTextMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.DYNAMIC_MENU: {
				DynamicMenu dynamicMenu = (DynamicMenu)theEObject;
				T result = caseDynamicMenu(dynamicMenu);
				if (result == null) result = caseMenu(dynamicMenu);
				if (result == null) result = caseNamedDisplayElement(dynamicMenu);
				if (result == null) result = caseNamedElement(dynamicMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.MENU_INCLUDED_FEATURE: {
				MenuIncludedFeature menuIncludedFeature = (MenuIncludedFeature)theEObject;
				T result = caseMenuIncludedFeature(menuIncludedFeature);
				if (result == null) result = caseMenuEntry(menuIncludedFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.MENU_INCLUDED_ELEMENT: {
				MenuIncludedElement menuIncludedElement = (MenuIncludedElement)theEObject;
				T result = caseMenuIncludedElement(menuIncludedElement);
				if (result == null) result = caseMenuIncludedFeature(menuIncludedElement);
				if (result == null) result = caseMenuEntry(menuIncludedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.SELECT_TARGET: {
				SelectTarget selectTarget = (SelectTarget)theEObject;
				T result = caseSelectTarget(selectTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.UNIT_CONTAINER: {
				UnitContainer unitContainer = (UnitContainer)theEObject;
				T result = caseUnitContainer(unitContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.UNIT_TITLE: {
				UnitTitle unitTitle = (UnitTitle)theEObject;
				T result = caseUnitTitle(unitTitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.CONTENT_UNIT: {
				ContentUnit contentUnit = (ContentUnit)theEObject;
				T result = caseContentUnit(contentUnit);
				if (result == null) result = caseNamedDisplayElement(contentUnit);
				if (result == null) result = caseNamedElement(contentUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.STATIC_UNIT: {
				StaticUnit staticUnit = (StaticUnit)theEObject;
				T result = caseStaticUnit(staticUnit);
				if (result == null) result = caseContentUnit(staticUnit);
				if (result == null) result = caseNamedDisplayElement(staticUnit);
				if (result == null) result = caseNamedElement(staticUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.COMMAND_UNIT: {
				CommandUnit commandUnit = (CommandUnit)theEObject;
				T result = caseCommandUnit(commandUnit);
				if (result == null) result = caseContentUnit(commandUnit);
				if (result == null) result = caseNamedDisplayElement(commandUnit);
				if (result == null) result = caseNamedElement(commandUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.COMMAND: {
				Command command = (Command)theEObject;
				T result = caseCommand(command);
				if (result == null) result = caseNamedElement(command);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.USER_COMMAND: {
				UserCommand userCommand = (UserCommand)theEObject;
				T result = caseUserCommand(userCommand);
				if (result == null) result = caseCommand(userCommand);
				if (result == null) result = caseNamedElement(userCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.CREATE_SITEMAP_UNIT: {
				CreateSitemapUnit createSitemapUnit = (CreateSitemapUnit)theEObject;
				T result = caseCreateSitemapUnit(createSitemapUnit);
				if (result == null) result = caseContentUnit(createSitemapUnit);
				if (result == null) result = caseNamedDisplayElement(createSitemapUnit);
				if (result == null) result = caseNamedElement(createSitemapUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.DYNAMIC_UNIT: {
				DynamicUnit dynamicUnit = (DynamicUnit)theEObject;
				T result = caseDynamicUnit(dynamicUnit);
				if (result == null) result = caseContentUnit(dynamicUnit);
				if (result == null) result = caseNamedDisplayElement(dynamicUnit);
				if (result == null) result = caseNamedElement(dynamicUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.UNIT_FIELD: {
				UnitField unitField = (UnitField)theEObject;
				T result = caseUnitField(unitField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.UNIT_FEATURE: {
				UnitFeature unitFeature = (UnitFeature)theEObject;
				T result = caseUnitFeature(unitFeature);
				if (result == null) result = caseNamedElement(unitFeature);
				if (result == null) result = caseIncludedFeature(unitFeature);
				if (result == null) result = caseUnitField(unitFeature);
				if (result == null) result = caseInlineActionContainer(unitFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.UNIT_ELEMENT: {
				UnitElement unitElement = (UnitElement)theEObject;
				T result = caseUnitElement(unitElement);
				if (result == null) result = caseUnitFeature(unitElement);
				if (result == null) result = caseIncludedElement(unitElement);
				if (result == null) result = caseNamedElement(unitElement);
				if (result == null) result = caseIncludedFeature(unitElement);
				if (result == null) result = caseUnitField(unitElement);
				if (result == null) result = caseInlineActionContainer(unitElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.UNIT_ASSOCIATION: {
				UnitAssociation unitAssociation = (UnitAssociation)theEObject;
				T result = caseUnitAssociation(unitAssociation);
				if (result == null) result = caseUnitFeature(unitAssociation);
				if (result == null) result = caseIncludedAssociation(unitAssociation);
				if (result == null) result = caseUnitContainer(unitAssociation);
				if (result == null) result = caseNamedElement(unitAssociation);
				if (result == null) result = caseIncludedFeature(unitAssociation);
				if (result == null) result = caseUnitField(unitAssociation);
				if (result == null) result = caseInlineActionContainer(unitAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.UNIT_CHILD_FEATURE: {
				UnitChildFeature unitChildFeature = (UnitChildFeature)theEObject;
				T result = caseUnitChildFeature(unitChildFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.UNIT_CHILD_ELEMENT: {
				UnitChildElement unitChildElement = (UnitChildElement)theEObject;
				T result = caseUnitChildElement(unitChildElement);
				if (result == null) result = caseUnitChildFeature(unitChildElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.UNIT_CHILD_ASSOCIATION: {
				UnitChildAssociation unitChildAssociation = (UnitChildAssociation)theEObject;
				T result = caseUnitChildAssociation(unitChildAssociation);
				if (result == null) result = caseUnitChildFeature(unitChildAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.INTERFACE_FIELD: {
				InterfaceField interfaceField = (InterfaceField)theEObject;
				T result = caseInterfaceField(interfaceField);
				if (result == null) result = caseNamedDisplayElement(interfaceField);
				if (result == null) result = caseUnitField(interfaceField);
				if (result == null) result = caseNamedElement(interfaceField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.DATA_TYPE_FIELD: {
				DataTypeField dataTypeField = (DataTypeField)theEObject;
				T result = caseDataTypeField(dataTypeField);
				if (result == null) result = caseInterfaceField(dataTypeField);
				if (result == null) result = caseNamedDisplayElement(dataTypeField);
				if (result == null) result = caseUnitField(dataTypeField);
				if (result == null) result = caseNamedElement(dataTypeField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.DATE_FIELD: {
				DateField dateField = (DateField)theEObject;
				T result = caseDateField(dateField);
				if (result == null) result = caseInterfaceField(dateField);
				if (result == null) result = caseNamedDisplayElement(dateField);
				if (result == null) result = caseUnitField(dateField);
				if (result == null) result = caseNamedElement(dateField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.CAPTCHA_FIELD: {
				CaptchaField captchaField = (CaptchaField)theEObject;
				T result = caseCaptchaField(captchaField);
				if (result == null) result = caseNamedDisplayElement(captchaField);
				if (result == null) result = caseUnitField(captchaField);
				if (result == null) result = caseNamedElement(captchaField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.UNIT_SUPPORT_ACTION: {
				UnitSupportAction unitSupportAction = (UnitSupportAction)theEObject;
				T result = caseUnitSupportAction(unitSupportAction);
				if (result == null) result = caseNamedDisplayElement(unitSupportAction);
				if (result == null) result = caseNamedElement(unitSupportAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.EDIT_UNIT: {
				EditUnit editUnit = (EditUnit)theEObject;
				T result = caseEditUnit(editUnit);
				if (result == null) result = caseDynamicUnit(editUnit);
				if (result == null) result = caseContentUnit(editUnit);
				if (result == null) result = caseNamedDisplayElement(editUnit);
				if (result == null) result = caseNamedElement(editUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.CREATE_UNIT: {
				CreateUnit createUnit = (CreateUnit)theEObject;
				T result = caseCreateUnit(createUnit);
				if (result == null) result = caseEditUnit(createUnit);
				if (result == null) result = caseDynamicUnit(createUnit);
				if (result == null) result = caseContentUnit(createUnit);
				if (result == null) result = caseNamedDisplayElement(createUnit);
				if (result == null) result = caseNamedElement(createUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.CREATE_UPDATE_UNIT: {
				CreateUpdateUnit createUpdateUnit = (CreateUpdateUnit)theEObject;
				T result = caseCreateUpdateUnit(createUpdateUnit);
				if (result == null) result = caseEditUnit(createUpdateUnit);
				if (result == null) result = caseSelectTarget(createUpdateUnit);
				if (result == null) result = caseDynamicUnit(createUpdateUnit);
				if (result == null) result = caseContentUnit(createUpdateUnit);
				if (result == null) result = caseNamedDisplayElement(createUpdateUnit);
				if (result == null) result = caseNamedElement(createUpdateUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.MAP_UNIT: {
				MapUnit mapUnit = (MapUnit)theEObject;
				T result = caseMapUnit(mapUnit);
				if (result == null) result = caseEditUnit(mapUnit);
				if (result == null) result = caseSelectTarget(mapUnit);
				if (result == null) result = caseDynamicUnit(mapUnit);
				if (result == null) result = caseContentUnit(mapUnit);
				if (result == null) result = caseNamedDisplayElement(mapUnit);
				if (result == null) result = caseNamedElement(mapUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.UPDATE_UNIT: {
				UpdateUnit updateUnit = (UpdateUnit)theEObject;
				T result = caseUpdateUnit(updateUnit);
				if (result == null) result = caseEditUnit(updateUnit);
				if (result == null) result = caseSelectTarget(updateUnit);
				if (result == null) result = caseDynamicUnit(updateUnit);
				if (result == null) result = caseContentUnit(updateUnit);
				if (result == null) result = caseNamedDisplayElement(updateUnit);
				if (result == null) result = caseNamedElement(updateUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.DATA_UNIT: {
				DataUnit dataUnit = (DataUnit)theEObject;
				T result = caseDataUnit(dataUnit);
				if (result == null) result = caseDynamicUnit(dataUnit);
				if (result == null) result = caseContentUnit(dataUnit);
				if (result == null) result = caseNamedDisplayElement(dataUnit);
				if (result == null) result = caseNamedElement(dataUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.DETAILS_UNIT: {
				DetailsUnit detailsUnit = (DetailsUnit)theEObject;
				T result = caseDetailsUnit(detailsUnit);
				if (result == null) result = caseDataUnit(detailsUnit);
				if (result == null) result = caseSelectTarget(detailsUnit);
				if (result == null) result = caseDynamicUnit(detailsUnit);
				if (result == null) result = caseContentUnit(detailsUnit);
				if (result == null) result = caseNamedDisplayElement(detailsUnit);
				if (result == null) result = caseNamedElement(detailsUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.INDEX_UNIT: {
				IndexUnit indexUnit = (IndexUnit)theEObject;
				T result = caseIndexUnit(indexUnit);
				if (result == null) result = caseDataUnit(indexUnit);
				if (result == null) result = caseInlineActionContainer(indexUnit);
				if (result == null) result = caseSelectTarget(indexUnit);
				if (result == null) result = caseDynamicUnit(indexUnit);
				if (result == null) result = caseContentUnit(indexUnit);
				if (result == null) result = caseNamedDisplayElement(indexUnit);
				if (result == null) result = caseNamedElement(indexUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.INDEX_GRID_UNIT: {
				IndexGridUnit indexGridUnit = (IndexGridUnit)theEObject;
				T result = caseIndexGridUnit(indexGridUnit);
				if (result == null) result = caseIndexUnit(indexGridUnit);
				if (result == null) result = caseDataUnit(indexGridUnit);
				if (result == null) result = caseInlineActionContainer(indexGridUnit);
				if (result == null) result = caseSelectTarget(indexGridUnit);
				if (result == null) result = caseDynamicUnit(indexGridUnit);
				if (result == null) result = caseContentUnit(indexGridUnit);
				if (result == null) result = caseNamedDisplayElement(indexGridUnit);
				if (result == null) result = caseNamedElement(indexGridUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.INDEX_PAGE_DIRECTION_UNIT: {
				IndexPageDirectionUnit indexPageDirectionUnit = (IndexPageDirectionUnit)theEObject;
				T result = caseIndexPageDirectionUnit(indexPageDirectionUnit);
				if (result == null) result = caseIndexUnit(indexPageDirectionUnit);
				if (result == null) result = caseDataUnit(indexPageDirectionUnit);
				if (result == null) result = caseInlineActionContainer(indexPageDirectionUnit);
				if (result == null) result = caseSelectTarget(indexPageDirectionUnit);
				if (result == null) result = caseDynamicUnit(indexPageDirectionUnit);
				if (result == null) result = caseContentUnit(indexPageDirectionUnit);
				if (result == null) result = caseNamedDisplayElement(indexPageDirectionUnit);
				if (result == null) result = caseNamedElement(indexPageDirectionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.INDEX_LINE_DIRECTION_UNIT: {
				IndexLineDirectionUnit indexLineDirectionUnit = (IndexLineDirectionUnit)theEObject;
				T result = caseIndexLineDirectionUnit(indexLineDirectionUnit);
				if (result == null) result = caseIndexUnit(indexLineDirectionUnit);
				if (result == null) result = caseDataUnit(indexLineDirectionUnit);
				if (result == null) result = caseInlineActionContainer(indexLineDirectionUnit);
				if (result == null) result = caseSelectTarget(indexLineDirectionUnit);
				if (result == null) result = caseDynamicUnit(indexLineDirectionUnit);
				if (result == null) result = caseContentUnit(indexLineDirectionUnit);
				if (result == null) result = caseNamedDisplayElement(indexLineDirectionUnit);
				if (result == null) result = caseNamedElement(indexLineDirectionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.CONTROL_UNIT: {
				ControlUnit controlUnit = (ControlUnit)theEObject;
				T result = caseControlUnit(controlUnit);
				if (result == null) result = caseDynamicUnit(controlUnit);
				if (result == null) result = caseContentUnit(controlUnit);
				if (result == null) result = caseNamedDisplayElement(controlUnit);
				if (result == null) result = caseNamedElement(controlUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.SEARCH_UNIT: {
				SearchUnit searchUnit = (SearchUnit)theEObject;
				T result = caseSearchUnit(searchUnit);
				if (result == null) result = caseControlUnit(searchUnit);
				if (result == null) result = caseDynamicUnit(searchUnit);
				if (result == null) result = caseContentUnit(searchUnit);
				if (result == null) result = caseNamedDisplayElement(searchUnit);
				if (result == null) result = caseNamedElement(searchUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.ACTION_UNIT: {
				ActionUnit actionUnit = (ActionUnit)theEObject;
				T result = caseActionUnit(actionUnit);
				if (result == null) result = caseControlUnit(actionUnit);
				if (result == null) result = caseDynamicUnit(actionUnit);
				if (result == null) result = caseContentUnit(actionUnit);
				if (result == null) result = caseNamedDisplayElement(actionUnit);
				if (result == null) result = caseNamedElement(actionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.AUTHENTICATION_UNIT: {
				AuthenticationUnit authenticationUnit = (AuthenticationUnit)theEObject;
				T result = caseAuthenticationUnit(authenticationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.REGISTRATION_UNIT: {
				RegistrationUnit registrationUnit = (RegistrationUnit)theEObject;
				T result = caseRegistrationUnit(registrationUnit);
				if (result == null) result = caseEditUnit(registrationUnit);
				if (result == null) result = caseAuthenticationUnit(registrationUnit);
				if (result == null) result = caseDynamicUnit(registrationUnit);
				if (result == null) result = caseContentUnit(registrationUnit);
				if (result == null) result = caseNamedDisplayElement(registrationUnit);
				if (result == null) result = caseNamedElement(registrationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.LOGIN_UNIT: {
				LoginUnit loginUnit = (LoginUnit)theEObject;
				T result = caseLoginUnit(loginUnit);
				if (result == null) result = caseControlUnit(loginUnit);
				if (result == null) result = caseAuthenticationUnit(loginUnit);
				if (result == null) result = caseDynamicUnit(loginUnit);
				if (result == null) result = caseContentUnit(loginUnit);
				if (result == null) result = caseNamedDisplayElement(loginUnit);
				if (result == null) result = caseNamedElement(loginUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.FORGOTTEN_PASSWORD_UNIT: {
				ForgottenPasswordUnit forgottenPasswordUnit = (ForgottenPasswordUnit)theEObject;
				T result = caseForgottenPasswordUnit(forgottenPasswordUnit);
				if (result == null) result = caseControlUnit(forgottenPasswordUnit);
				if (result == null) result = caseAuthenticationUnit(forgottenPasswordUnit);
				if (result == null) result = caseDynamicUnit(forgottenPasswordUnit);
				if (result == null) result = caseContentUnit(forgottenPasswordUnit);
				if (result == null) result = caseNamedDisplayElement(forgottenPasswordUnit);
				if (result == null) result = caseNamedElement(forgottenPasswordUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.INLINE_ACTION_CONTAINER: {
				InlineActionContainer inlineActionContainer = (InlineActionContainer)theEObject;
				T result = caseInlineActionContainer(inlineActionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.INLINE_ACTION: {
				InlineAction inlineAction = (InlineAction)theEObject;
				T result = caseInlineAction(inlineAction);
				if (result == null) result = caseNamedDisplayElement(inlineAction);
				if (result == null) result = caseNamedElement(inlineAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.SELECT_ACTION: {
				SelectAction selectAction = (SelectAction)theEObject;
				T result = caseSelectAction(selectAction);
				if (result == null) result = caseInlineAction(selectAction);
				if (result == null) result = caseNamedDisplayElement(selectAction);
				if (result == null) result = caseNamedElement(selectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.DELETE_ACTION: {
				DeleteAction deleteAction = (DeleteAction)theEObject;
				T result = caseDeleteAction(deleteAction);
				if (result == null) result = caseInlineAction(deleteAction);
				if (result == null) result = caseNamedDisplayElement(deleteAction);
				if (result == null) result = caseNamedElement(deleteAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.FEATURE_SUPPORT_ACTION: {
				FeatureSupportAction featureSupportAction = (FeatureSupportAction)theEObject;
				T result = caseFeatureSupportAction(featureSupportAction);
				if (result == null) result = caseInlineAction(featureSupportAction);
				if (result == null) result = caseNamedDisplayElement(featureSupportAction);
				if (result == null) result = caseNamedElement(featureSupportAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.MODEL_REFERENCE: {
				ModelReference modelReference = (ModelReference)theEObject;
				T result = caseModelReference(modelReference);
				if (result == null) result = casePath(modelReference);
				if (result == null) result = caseExpression(modelReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.FEATURE_REFERENCE: {
				FeatureReference featureReference = (FeatureReference)theEObject;
				T result = caseFeatureReference(featureReference);
				if (result == null) result = casePath(featureReference);
				if (result == null) result = caseExpression(featureReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WafPackage.CURRENT_USER_REFERENCE: {
				CurrentUserReference currentUserReference = (CurrentUserReference)theEObject;
				T result = caseCurrentUserReference(currentUserReference);
				if (result == null) result = casePath(currentUserReference);
				if (result == null) result = caseExpression(currentUserReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWafModel(WafModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthentication(Authentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Authentication System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalAuthenticationSystem(LocalAuthenticationSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cas Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cas Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasAuthentication(CasAuthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelLabel(ModelLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceFeature(ServiceFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Entity Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Entity Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEntityFeature(ServiceEntityFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Entity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Entity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEntityElement(ServiceEntityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceAssociation(ServiceAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Entity Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEntityAssociation(ServiceEntityAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service View Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service View Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceViewAssociation(ServiceViewAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelection(Selection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectTarget(SelectTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitContainer(UnitContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitTitle(UnitTitle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenu(Menu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuEntry(MenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Included Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Included Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuIncludedFeature(MenuIncludedFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Included Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Included Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuIncludedElement(MenuIncludedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticMenu(StaticMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Page Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Page Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedPageMenuEntry(FixedPageMenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Action Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Action Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedActionMenuEntry(FixedActionMenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Command Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Command Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedCommandMenuEntry(FixedCommandMenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edit Static Text Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edit Static Text Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditStaticTextMenuEntry(EditStaticTextMenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicMenu(DynamicMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentUnit(ContentUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitField(UnitField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitFeature(UnitFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitElement(UnitElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitAssociation(UnitAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Child Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Child Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitChildFeature(UnitChildFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Child Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Child Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitChildElement(UnitChildElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Child Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Child Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitChildAssociation(UnitChildAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceField(InterfaceField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeField(DataTypeField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateField(DateField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Captcha Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Captcha Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaptchaField(CaptchaField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Support Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Support Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitSupportAction(UnitSupportAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edit Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edit Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditUnit(EditUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Included Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Included Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludedFeature(IncludedFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Included Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Included Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludedElement(IncludedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Included Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Included Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludedAssociation(IncludedAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateUnit(CreateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Update Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateUpdateUnit(CreateUpdateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapUnit(MapUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateUnit(UpdateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataUnit(DataUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticUnit(StaticUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandUnit(CommandUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserCommand(UserCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Sitemap Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Sitemap Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateSitemapUnit(CreateSitemapUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicUnit(DynamicUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Details Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Details Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailsUnit(DetailsUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexUnit(IndexUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Grid Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Grid Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexGridUnit(IndexGridUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Page Direction Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Page Direction Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexPageDirectionUnit(IndexPageDirectionUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Line Direction Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Line Direction Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexLineDirectionUnit(IndexLineDirectionUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlUnit(ControlUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchUnit(SearchUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionUnit(ActionUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationUnit(AuthenticationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registration Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registration Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistrationUnit(RegistrationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginUnit(LoginUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forgotten Password Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forgotten Password Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForgottenPasswordUnit(ForgottenPasswordUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Action Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Action Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineActionContainer(InlineActionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineAction(InlineAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectAction(SelectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteAction(DeleteAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Support Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Support Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureSupportAction(FeatureSupportAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelReference(ModelReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureReference(FeatureReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current User Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current User Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentUserReference(CurrentUserReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Display Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Display Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedDisplayElement(NamedDisplayElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePath(Path object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WafSwitch
