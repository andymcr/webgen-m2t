/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenJsfSwitch.java,v 1.58 2014/08/22 14:32:38 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import uk.ac.man.cs.mdsd.gencriteria.GenExpression;
import uk.ac.man.cs.mdsd.gencriteria.GenPath;
import uk.ac.man.cs.mdsd.genjsf.*;

import uk.ac.man.cs.mdsd.genorm.GenOrmModel;
import uk.ac.man.cs.mdsd.orm.NamedElement;

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
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage
 * @generated
 */
public class GenJsfSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenJsfPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenJsfSwitch() {
		if (modelPackage == null) {
			modelPackage = GenJsfPackage.eINSTANCE;
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
			case GenJsfPackage.GEN_JSF_MODEL: {
				GenJsfModel genJsfModel = (GenJsfModel)theEObject;
				T result = caseGenJsfModel(genJsfModel);
				if (result == null) result = caseGenOrmModel(genJsfModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_AUTHENTICATION: {
				GenAuthentication genAuthentication = (GenAuthentication)theEObject;
				T result = caseGenAuthentication(genAuthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_CAS_AUTHENTICATION: {
				GenCasAuthentication genCasAuthentication = (GenCasAuthentication)theEObject;
				T result = caseGenCasAuthentication(genCasAuthentication);
				if (result == null) result = caseGenAuthentication(genCasAuthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM: {
				GenLocalAuthenticationSystem genLocalAuthenticationSystem = (GenLocalAuthenticationSystem)theEObject;
				T result = caseGenLocalAuthenticationSystem(genLocalAuthenticationSystem);
				if (result == null) result = caseGenAuthentication(genLocalAuthenticationSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_INCLUDED_FEATURE: {
				GenIncludedFeature genIncludedFeature = (GenIncludedFeature)theEObject;
				T result = caseGenIncludedFeature(genIncludedFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_INCLUDED_ELEMENT: {
				GenIncludedElement genIncludedElement = (GenIncludedElement)theEObject;
				T result = caseGenIncludedElement(genIncludedElement);
				if (result == null) result = caseGenIncludedFeature(genIncludedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_INCLUDED_ASSOCIATION: {
				GenIncludedAssociation genIncludedAssociation = (GenIncludedAssociation)theEObject;
				T result = caseGenIncludedAssociation(genIncludedAssociation);
				if (result == null) result = caseGenIncludedFeature(genIncludedAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_SERVICE: {
				GenService genService = (GenService)theEObject;
				T result = caseGenService(genService);
				if (result == null) result = caseNamedElement(genService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_MODEL_LABEL: {
				GenModelLabel genModelLabel = (GenModelLabel)theEObject;
				T result = caseGenModelLabel(genModelLabel);
				if (result == null) result = caseNamedElement(genModelLabel);
				if (result == null) result = caseGenUnitTitle(genModelLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_SELECTION: {
				GenSelection genSelection = (GenSelection)theEObject;
				T result = caseGenSelection(genSelection);
				if (result == null) result = caseNamedElement(genSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_SERVICE_FEATURE: {
				GenServiceFeature genServiceFeature = (GenServiceFeature)theEObject;
				T result = caseGenServiceFeature(genServiceFeature);
				if (result == null) result = caseNamedElement(genServiceFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_SERVICE_ENTITY_FEATURE: {
				GenServiceEntityFeature genServiceEntityFeature = (GenServiceEntityFeature)theEObject;
				T result = caseGenServiceEntityFeature(genServiceEntityFeature);
				if (result == null) result = caseGenIncludedFeature(genServiceEntityFeature);
				if (result == null) result = caseGenServiceFeature(genServiceEntityFeature);
				if (result == null) result = caseNamedElement(genServiceEntityFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_SERVICE_ENTITY_ELEMENT: {
				GenServiceEntityElement genServiceEntityElement = (GenServiceEntityElement)theEObject;
				T result = caseGenServiceEntityElement(genServiceEntityElement);
				if (result == null) result = caseGenServiceEntityFeature(genServiceEntityElement);
				if (result == null) result = caseGenIncludedElement(genServiceEntityElement);
				if (result == null) result = caseGenUnitTitle(genServiceEntityElement);
				if (result == null) result = caseGenIncludedFeature(genServiceEntityElement);
				if (result == null) result = caseGenServiceFeature(genServiceEntityElement);
				if (result == null) result = caseNamedElement(genServiceEntityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_SERVICE_ASSOCIATION: {
				GenServiceAssociation genServiceAssociation = (GenServiceAssociation)theEObject;
				T result = caseGenServiceAssociation(genServiceAssociation);
				if (result == null) result = caseGenServiceFeature(genServiceAssociation);
				if (result == null) result = caseNamedElement(genServiceAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_SERVICE_ENTITY_ASSOCIATION: {
				GenServiceEntityAssociation genServiceEntityAssociation = (GenServiceEntityAssociation)theEObject;
				T result = caseGenServiceEntityAssociation(genServiceEntityAssociation);
				if (result == null) result = caseGenServiceEntityFeature(genServiceEntityAssociation);
				if (result == null) result = caseGenServiceAssociation(genServiceEntityAssociation);
				if (result == null) result = caseGenIncludedAssociation(genServiceEntityAssociation);
				if (result == null) result = caseGenIncludedFeature(genServiceEntityAssociation);
				if (result == null) result = caseGenServiceFeature(genServiceEntityAssociation);
				if (result == null) result = caseNamedElement(genServiceEntityAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_SERVICE_VIEW_ASSOCIATION: {
				GenServiceViewAssociation genServiceViewAssociation = (GenServiceViewAssociation)theEObject;
				T result = caseGenServiceViewAssociation(genServiceViewAssociation);
				if (result == null) result = caseGenServiceAssociation(genServiceViewAssociation);
				if (result == null) result = caseGenServiceFeature(genServiceViewAssociation);
				if (result == null) result = caseNamedElement(genServiceViewAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_PAGE: {
				GenPage genPage = (GenPage)theEObject;
				T result = caseGenPage(genPage);
				if (result == null) result = caseNamedElement(genPage);
				if (result == null) result = caseGenUnitContainer(genPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_SELECT_TARGET: {
				GenSelectTarget genSelectTarget = (GenSelectTarget)theEObject;
				T result = caseGenSelectTarget(genSelectTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_MENU: {
				GenMenu genMenu = (GenMenu)theEObject;
				T result = caseGenMenu(genMenu);
				if (result == null) result = caseNamedElement(genMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_MENU_ENTRY: {
				GenMenuEntry genMenuEntry = (GenMenuEntry)theEObject;
				T result = caseGenMenuEntry(genMenuEntry);
				if (result == null) result = caseNamedElement(genMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_STATIC_MENU: {
				GenStaticMenu genStaticMenu = (GenStaticMenu)theEObject;
				T result = caseGenStaticMenu(genStaticMenu);
				if (result == null) result = caseGenMenu(genStaticMenu);
				if (result == null) result = caseNamedElement(genStaticMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_FIXED_PAGE_MENU_ENTRY: {
				GenFixedPageMenuEntry genFixedPageMenuEntry = (GenFixedPageMenuEntry)theEObject;
				T result = caseGenFixedPageMenuEntry(genFixedPageMenuEntry);
				if (result == null) result = caseGenMenuEntry(genFixedPageMenuEntry);
				if (result == null) result = caseNamedElement(genFixedPageMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_FIXED_ACTION_MENU_ENTRY: {
				GenFixedActionMenuEntry genFixedActionMenuEntry = (GenFixedActionMenuEntry)theEObject;
				T result = caseGenFixedActionMenuEntry(genFixedActionMenuEntry);
				if (result == null) result = caseGenMenuEntry(genFixedActionMenuEntry);
				if (result == null) result = caseNamedElement(genFixedActionMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_FIXED_COMMAND_MENU_ENTRY: {
				GenFixedCommandMenuEntry genFixedCommandMenuEntry = (GenFixedCommandMenuEntry)theEObject;
				T result = caseGenFixedCommandMenuEntry(genFixedCommandMenuEntry);
				if (result == null) result = caseGenMenuEntry(genFixedCommandMenuEntry);
				if (result == null) result = caseNamedElement(genFixedCommandMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_EDIT_STATIC_TEXT_MENU_ENTRY: {
				GenEditStaticTextMenuEntry genEditStaticTextMenuEntry = (GenEditStaticTextMenuEntry)theEObject;
				T result = caseGenEditStaticTextMenuEntry(genEditStaticTextMenuEntry);
				if (result == null) result = caseGenMenuEntry(genEditStaticTextMenuEntry);
				if (result == null) result = caseNamedElement(genEditStaticTextMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_DYNAMIC_MENU: {
				GenDynamicMenu genDynamicMenu = (GenDynamicMenu)theEObject;
				T result = caseGenDynamicMenu(genDynamicMenu);
				if (result == null) result = caseGenMenu(genDynamicMenu);
				if (result == null) result = caseNamedElement(genDynamicMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_MENU_INCLUDED_FEATURE: {
				GenMenuIncludedFeature genMenuIncludedFeature = (GenMenuIncludedFeature)theEObject;
				T result = caseGenMenuIncludedFeature(genMenuIncludedFeature);
				if (result == null) result = caseGenMenuEntry(genMenuIncludedFeature);
				if (result == null) result = caseNamedElement(genMenuIncludedFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_MENU_INCLUDED_ELEMENT: {
				GenMenuIncludedElement genMenuIncludedElement = (GenMenuIncludedElement)theEObject;
				T result = caseGenMenuIncludedElement(genMenuIncludedElement);
				if (result == null) result = caseGenMenuIncludedFeature(genMenuIncludedElement);
				if (result == null) result = caseGenMenuEntry(genMenuIncludedElement);
				if (result == null) result = caseNamedElement(genMenuIncludedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_UNIT_CONTAINER: {
				GenUnitContainer genUnitContainer = (GenUnitContainer)theEObject;
				T result = caseGenUnitContainer(genUnitContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_UNIT_TITLE: {
				GenUnitTitle genUnitTitle = (GenUnitTitle)theEObject;
				T result = caseGenUnitTitle(genUnitTitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_CONTENT_UNIT: {
				GenContentUnit genContentUnit = (GenContentUnit)theEObject;
				T result = caseGenContentUnit(genContentUnit);
				if (result == null) result = caseNamedElement(genContentUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_CREATE_SITEMAP_UNIT: {
				GenCreateSitemapUnit genCreateSitemapUnit = (GenCreateSitemapUnit)theEObject;
				T result = caseGenCreateSitemapUnit(genCreateSitemapUnit);
				if (result == null) result = caseGenContentUnit(genCreateSitemapUnit);
				if (result == null) result = caseNamedElement(genCreateSitemapUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_STATIC_UNIT: {
				GenStaticUnit genStaticUnit = (GenStaticUnit)theEObject;
				T result = caseGenStaticUnit(genStaticUnit);
				if (result == null) result = caseGenContentUnit(genStaticUnit);
				if (result == null) result = caseNamedElement(genStaticUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_COMMAND_UNIT: {
				GenCommandUnit genCommandUnit = (GenCommandUnit)theEObject;
				T result = caseGenCommandUnit(genCommandUnit);
				if (result == null) result = caseGenContentUnit(genCommandUnit);
				if (result == null) result = caseNamedElement(genCommandUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_COMMAND: {
				GenCommand genCommand = (GenCommand)theEObject;
				T result = caseGenCommand(genCommand);
				if (result == null) result = caseNamedElement(genCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_USER_COMMAND: {
				GenUserCommand genUserCommand = (GenUserCommand)theEObject;
				T result = caseGenUserCommand(genUserCommand);
				if (result == null) result = caseGenCommand(genUserCommand);
				if (result == null) result = caseNamedElement(genUserCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_DYNAMIC_UNIT: {
				GenDynamicUnit genDynamicUnit = (GenDynamicUnit)theEObject;
				T result = caseGenDynamicUnit(genDynamicUnit);
				if (result == null) result = caseGenContentUnit(genDynamicUnit);
				if (result == null) result = caseNamedElement(genDynamicUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_UNIT_FIELD: {
				GenUnitField genUnitField = (GenUnitField)theEObject;
				T result = caseGenUnitField(genUnitField);
				if (result == null) result = caseNamedElement(genUnitField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_UNIT_FEATURE: {
				GenUnitFeature genUnitFeature = (GenUnitFeature)theEObject;
				T result = caseGenUnitFeature(genUnitFeature);
				if (result == null) result = caseGenUnitField(genUnitFeature);
				if (result == null) result = caseGenIncludedFeature(genUnitFeature);
				if (result == null) result = caseGenInlineActionContainer(genUnitFeature);
				if (result == null) result = caseNamedElement(genUnitFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_UNIT_ELEMENT: {
				GenUnitElement genUnitElement = (GenUnitElement)theEObject;
				T result = caseGenUnitElement(genUnitElement);
				if (result == null) result = caseGenUnitFeature(genUnitElement);
				if (result == null) result = caseGenIncludedElement(genUnitElement);
				if (result == null) result = caseGenUnitField(genUnitElement);
				if (result == null) result = caseGenIncludedFeature(genUnitElement);
				if (result == null) result = caseGenInlineActionContainer(genUnitElement);
				if (result == null) result = caseNamedElement(genUnitElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_UNIT_ASSOCIATION: {
				GenUnitAssociation genUnitAssociation = (GenUnitAssociation)theEObject;
				T result = caseGenUnitAssociation(genUnitAssociation);
				if (result == null) result = caseGenUnitFeature(genUnitAssociation);
				if (result == null) result = caseGenIncludedAssociation(genUnitAssociation);
				if (result == null) result = caseGenUnitContainer(genUnitAssociation);
				if (result == null) result = caseGenUnitField(genUnitAssociation);
				if (result == null) result = caseGenIncludedFeature(genUnitAssociation);
				if (result == null) result = caseGenInlineActionContainer(genUnitAssociation);
				if (result == null) result = caseNamedElement(genUnitAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_UNIT_CHILD_FEATURE: {
				GenUnitChildFeature genUnitChildFeature = (GenUnitChildFeature)theEObject;
				T result = caseGenUnitChildFeature(genUnitChildFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_UNIT_CHILD_ELEMENT: {
				GenUnitChildElement genUnitChildElement = (GenUnitChildElement)theEObject;
				T result = caseGenUnitChildElement(genUnitChildElement);
				if (result == null) result = caseGenUnitChildFeature(genUnitChildElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_UNIT_CHILD_ASSOCIATION: {
				GenUnitChildAssociation genUnitChildAssociation = (GenUnitChildAssociation)theEObject;
				T result = caseGenUnitChildAssociation(genUnitChildAssociation);
				if (result == null) result = caseGenUnitChildFeature(genUnitChildAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_INTERFACE_FIELD: {
				GenInterfaceField genInterfaceField = (GenInterfaceField)theEObject;
				T result = caseGenInterfaceField(genInterfaceField);
				if (result == null) result = caseGenUnitField(genInterfaceField);
				if (result == null) result = caseNamedElement(genInterfaceField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_DATA_TYPE_FIELD: {
				GenDataTypeField genDataTypeField = (GenDataTypeField)theEObject;
				T result = caseGenDataTypeField(genDataTypeField);
				if (result == null) result = caseGenInterfaceField(genDataTypeField);
				if (result == null) result = caseGenUnitField(genDataTypeField);
				if (result == null) result = caseNamedElement(genDataTypeField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_DATE_FIELD: {
				GenDateField genDateField = (GenDateField)theEObject;
				T result = caseGenDateField(genDateField);
				if (result == null) result = caseGenInterfaceField(genDateField);
				if (result == null) result = caseGenUnitField(genDateField);
				if (result == null) result = caseNamedElement(genDateField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_CAPTCHA_FIELD: {
				GenCaptchaField genCaptchaField = (GenCaptchaField)theEObject;
				T result = caseGenCaptchaField(genCaptchaField);
				if (result == null) result = caseGenUnitField(genCaptchaField);
				if (result == null) result = caseNamedElement(genCaptchaField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_UNIT_SUPPORT_ACTION: {
				GenUnitSupportAction genUnitSupportAction = (GenUnitSupportAction)theEObject;
				T result = caseGenUnitSupportAction(genUnitSupportAction);
				if (result == null) result = caseNamedElement(genUnitSupportAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_EDIT_UNIT: {
				GenEditUnit genEditUnit = (GenEditUnit)theEObject;
				T result = caseGenEditUnit(genEditUnit);
				if (result == null) result = caseGenDynamicUnit(genEditUnit);
				if (result == null) result = caseGenContentUnit(genEditUnit);
				if (result == null) result = caseNamedElement(genEditUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_CREATE_UNIT: {
				GenCreateUnit genCreateUnit = (GenCreateUnit)theEObject;
				T result = caseGenCreateUnit(genCreateUnit);
				if (result == null) result = caseGenEditUnit(genCreateUnit);
				if (result == null) result = caseGenDynamicUnit(genCreateUnit);
				if (result == null) result = caseGenContentUnit(genCreateUnit);
				if (result == null) result = caseNamedElement(genCreateUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_CREATE_UPDATE_UNIT: {
				GenCreateUpdateUnit genCreateUpdateUnit = (GenCreateUpdateUnit)theEObject;
				T result = caseGenCreateUpdateUnit(genCreateUpdateUnit);
				if (result == null) result = caseGenEditUnit(genCreateUpdateUnit);
				if (result == null) result = caseGenSelectTarget(genCreateUpdateUnit);
				if (result == null) result = caseGenDynamicUnit(genCreateUpdateUnit);
				if (result == null) result = caseGenContentUnit(genCreateUpdateUnit);
				if (result == null) result = caseNamedElement(genCreateUpdateUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_MAP_UNIT: {
				GenMapUnit genMapUnit = (GenMapUnit)theEObject;
				T result = caseGenMapUnit(genMapUnit);
				if (result == null) result = caseGenEditUnit(genMapUnit);
				if (result == null) result = caseGenSelectTarget(genMapUnit);
				if (result == null) result = caseGenDynamicUnit(genMapUnit);
				if (result == null) result = caseGenContentUnit(genMapUnit);
				if (result == null) result = caseNamedElement(genMapUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_UPDATE_UNIT: {
				GenUpdateUnit genUpdateUnit = (GenUpdateUnit)theEObject;
				T result = caseGenUpdateUnit(genUpdateUnit);
				if (result == null) result = caseGenEditUnit(genUpdateUnit);
				if (result == null) result = caseGenSelectTarget(genUpdateUnit);
				if (result == null) result = caseGenDynamicUnit(genUpdateUnit);
				if (result == null) result = caseGenContentUnit(genUpdateUnit);
				if (result == null) result = caseNamedElement(genUpdateUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_DATA_UNIT: {
				GenDataUnit genDataUnit = (GenDataUnit)theEObject;
				T result = caseGenDataUnit(genDataUnit);
				if (result == null) result = caseGenDynamicUnit(genDataUnit);
				if (result == null) result = caseGenContentUnit(genDataUnit);
				if (result == null) result = caseNamedElement(genDataUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_DETAILS_UNIT: {
				GenDetailsUnit genDetailsUnit = (GenDetailsUnit)theEObject;
				T result = caseGenDetailsUnit(genDetailsUnit);
				if (result == null) result = caseGenDataUnit(genDetailsUnit);
				if (result == null) result = caseGenSelectTarget(genDetailsUnit);
				if (result == null) result = caseGenDynamicUnit(genDetailsUnit);
				if (result == null) result = caseGenContentUnit(genDetailsUnit);
				if (result == null) result = caseNamedElement(genDetailsUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_INDEX_UNIT: {
				GenIndexUnit genIndexUnit = (GenIndexUnit)theEObject;
				T result = caseGenIndexUnit(genIndexUnit);
				if (result == null) result = caseGenDataUnit(genIndexUnit);
				if (result == null) result = caseGenInlineActionContainer(genIndexUnit);
				if (result == null) result = caseGenSelectTarget(genIndexUnit);
				if (result == null) result = caseGenDynamicUnit(genIndexUnit);
				if (result == null) result = caseGenContentUnit(genIndexUnit);
				if (result == null) result = caseNamedElement(genIndexUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_INDEX_GRID_UNIT: {
				GenIndexGridUnit genIndexGridUnit = (GenIndexGridUnit)theEObject;
				T result = caseGenIndexGridUnit(genIndexGridUnit);
				if (result == null) result = caseGenIndexUnit(genIndexGridUnit);
				if (result == null) result = caseGenDataUnit(genIndexGridUnit);
				if (result == null) result = caseGenInlineActionContainer(genIndexGridUnit);
				if (result == null) result = caseGenSelectTarget(genIndexGridUnit);
				if (result == null) result = caseGenDynamicUnit(genIndexGridUnit);
				if (result == null) result = caseGenContentUnit(genIndexGridUnit);
				if (result == null) result = caseNamedElement(genIndexGridUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_INDEX_PAGE_DIRECTION_UNIT: {
				GenIndexPageDirectionUnit genIndexPageDirectionUnit = (GenIndexPageDirectionUnit)theEObject;
				T result = caseGenIndexPageDirectionUnit(genIndexPageDirectionUnit);
				if (result == null) result = caseGenIndexUnit(genIndexPageDirectionUnit);
				if (result == null) result = caseGenDataUnit(genIndexPageDirectionUnit);
				if (result == null) result = caseGenInlineActionContainer(genIndexPageDirectionUnit);
				if (result == null) result = caseGenSelectTarget(genIndexPageDirectionUnit);
				if (result == null) result = caseGenDynamicUnit(genIndexPageDirectionUnit);
				if (result == null) result = caseGenContentUnit(genIndexPageDirectionUnit);
				if (result == null) result = caseNamedElement(genIndexPageDirectionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_INDEX_LINE_DIRECTION_UNIT: {
				GenIndexLineDirectionUnit genIndexLineDirectionUnit = (GenIndexLineDirectionUnit)theEObject;
				T result = caseGenIndexLineDirectionUnit(genIndexLineDirectionUnit);
				if (result == null) result = caseGenIndexUnit(genIndexLineDirectionUnit);
				if (result == null) result = caseGenDataUnit(genIndexLineDirectionUnit);
				if (result == null) result = caseGenInlineActionContainer(genIndexLineDirectionUnit);
				if (result == null) result = caseGenSelectTarget(genIndexLineDirectionUnit);
				if (result == null) result = caseGenDynamicUnit(genIndexLineDirectionUnit);
				if (result == null) result = caseGenContentUnit(genIndexLineDirectionUnit);
				if (result == null) result = caseNamedElement(genIndexLineDirectionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_CONTROL_UNIT: {
				GenControlUnit genControlUnit = (GenControlUnit)theEObject;
				T result = caseGenControlUnit(genControlUnit);
				if (result == null) result = caseGenDynamicUnit(genControlUnit);
				if (result == null) result = caseGenContentUnit(genControlUnit);
				if (result == null) result = caseNamedElement(genControlUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_SEARCH_UNIT: {
				GenSearchUnit genSearchUnit = (GenSearchUnit)theEObject;
				T result = caseGenSearchUnit(genSearchUnit);
				if (result == null) result = caseGenControlUnit(genSearchUnit);
				if (result == null) result = caseGenDynamicUnit(genSearchUnit);
				if (result == null) result = caseGenContentUnit(genSearchUnit);
				if (result == null) result = caseNamedElement(genSearchUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_ACTION_UNIT: {
				GenActionUnit genActionUnit = (GenActionUnit)theEObject;
				T result = caseGenActionUnit(genActionUnit);
				if (result == null) result = caseGenControlUnit(genActionUnit);
				if (result == null) result = caseGenDynamicUnit(genActionUnit);
				if (result == null) result = caseGenContentUnit(genActionUnit);
				if (result == null) result = caseNamedElement(genActionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_AUTHENTICATION_UNIT: {
				GenAuthenticationUnit genAuthenticationUnit = (GenAuthenticationUnit)theEObject;
				T result = caseGenAuthenticationUnit(genAuthenticationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_REGISTRATION_UNIT: {
				GenRegistrationUnit genRegistrationUnit = (GenRegistrationUnit)theEObject;
				T result = caseGenRegistrationUnit(genRegistrationUnit);
				if (result == null) result = caseGenEditUnit(genRegistrationUnit);
				if (result == null) result = caseGenAuthenticationUnit(genRegistrationUnit);
				if (result == null) result = caseGenDynamicUnit(genRegistrationUnit);
				if (result == null) result = caseGenContentUnit(genRegistrationUnit);
				if (result == null) result = caseNamedElement(genRegistrationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_LOGIN_UNIT: {
				GenLoginUnit genLoginUnit = (GenLoginUnit)theEObject;
				T result = caseGenLoginUnit(genLoginUnit);
				if (result == null) result = caseGenControlUnit(genLoginUnit);
				if (result == null) result = caseGenAuthenticationUnit(genLoginUnit);
				if (result == null) result = caseGenDynamicUnit(genLoginUnit);
				if (result == null) result = caseGenContentUnit(genLoginUnit);
				if (result == null) result = caseNamedElement(genLoginUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_FORGOTTEN_PASSWORD_UNIT: {
				GenForgottenPasswordUnit genForgottenPasswordUnit = (GenForgottenPasswordUnit)theEObject;
				T result = caseGenForgottenPasswordUnit(genForgottenPasswordUnit);
				if (result == null) result = caseGenControlUnit(genForgottenPasswordUnit);
				if (result == null) result = caseGenAuthenticationUnit(genForgottenPasswordUnit);
				if (result == null) result = caseGenDynamicUnit(genForgottenPasswordUnit);
				if (result == null) result = caseGenContentUnit(genForgottenPasswordUnit);
				if (result == null) result = caseNamedElement(genForgottenPasswordUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_INLINE_ACTION_CONTAINER: {
				GenInlineActionContainer genInlineActionContainer = (GenInlineActionContainer)theEObject;
				T result = caseGenInlineActionContainer(genInlineActionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_INLINE_ACTION: {
				GenInlineAction genInlineAction = (GenInlineAction)theEObject;
				T result = caseGenInlineAction(genInlineAction);
				if (result == null) result = caseNamedElement(genInlineAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_SELECT_ACTION: {
				GenSelectAction genSelectAction = (GenSelectAction)theEObject;
				T result = caseGenSelectAction(genSelectAction);
				if (result == null) result = caseGenInlineAction(genSelectAction);
				if (result == null) result = caseNamedElement(genSelectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_DELETE_ACTION: {
				GenDeleteAction genDeleteAction = (GenDeleteAction)theEObject;
				T result = caseGenDeleteAction(genDeleteAction);
				if (result == null) result = caseGenInlineAction(genDeleteAction);
				if (result == null) result = caseNamedElement(genDeleteAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_FEATURE_SUPPORT_ACTION: {
				GenFeatureSupportAction genFeatureSupportAction = (GenFeatureSupportAction)theEObject;
				T result = caseGenFeatureSupportAction(genFeatureSupportAction);
				if (result == null) result = caseGenInlineAction(genFeatureSupportAction);
				if (result == null) result = caseNamedElement(genFeatureSupportAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_FEATURE_REFERENCE: {
				GenFeatureReference genFeatureReference = (GenFeatureReference)theEObject;
				T result = caseGenFeatureReference(genFeatureReference);
				if (result == null) result = caseGenPath(genFeatureReference);
				if (result == null) result = caseGenExpression(genFeatureReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_MODEL_REFERENCE: {
				GenModelReference genModelReference = (GenModelReference)theEObject;
				T result = caseGenModelReference(genModelReference);
				if (result == null) result = caseGenPath(genModelReference);
				if (result == null) result = caseGenExpression(genModelReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenJsfPackage.GEN_CURRENT_USER_REFERENCE: {
				GenCurrentUserReference genCurrentUserReference = (GenCurrentUserReference)theEObject;
				T result = caseGenCurrentUserReference(genCurrentUserReference);
				if (result == null) result = caseGenPath(genCurrentUserReference);
				if (result == null) result = caseGenExpression(genCurrentUserReference);
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
	public T caseGenJsfModel(GenJsfModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenAuthentication(GenAuthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Cas Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Cas Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCasAuthentication(GenCasAuthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Local Authentication System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenLocalAuthenticationSystem(GenLocalAuthenticationSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenService(GenService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Model Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModelLabel(GenModelLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Service Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Service Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenServiceFeature(GenServiceFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Service Entity Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Service Entity Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenServiceEntityFeature(GenServiceEntityFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Service Entity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Service Entity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenServiceEntityElement(GenServiceEntityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Service Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Service Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenServiceAssociation(GenServiceAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Service Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Service Entity Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenServiceEntityAssociation(GenServiceEntityAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Service View Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Service View Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenServiceViewAssociation(GenServiceViewAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenSelection(GenSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Included Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Included Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenIncludedFeature(GenIncludedFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Included Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Included Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenIncludedElement(GenIncludedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Included Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Included Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenIncludedAssociation(GenIncludedAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPage(GenPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Select Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Select Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenSelectTarget(GenSelectTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenMenu(GenMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenMenuEntry(GenMenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Static Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Static Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenStaticMenu(GenStaticMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Fixed Page Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Fixed Page Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenFixedPageMenuEntry(GenFixedPageMenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Fixed Action Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Fixed Action Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenFixedActionMenuEntry(GenFixedActionMenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Fixed Command Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Fixed Command Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenFixedCommandMenuEntry(GenFixedCommandMenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Edit Static Text Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Edit Static Text Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenEditStaticTextMenuEntry(GenEditStaticTextMenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Menu Included Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Menu Included Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenMenuIncludedFeature(GenMenuIncludedFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Menu Included Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Menu Included Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenMenuIncludedElement(GenMenuIncludedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Dynamic Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDynamicMenu(GenDynamicMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Unit Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Unit Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenUnitContainer(GenUnitContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Unit Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Unit Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenUnitTitle(GenUnitTitle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Content Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Content Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenContentUnit(GenContentUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Create Sitemap Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Create Sitemap Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCreateSitemapUnit(GenCreateSitemapUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Unit Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Unit Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenUnitField(GenUnitField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Unit Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Unit Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenUnitFeature(GenUnitFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Unit Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Unit Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenUnitElement(GenUnitElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Unit Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenUnitAssociation(GenUnitAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Unit Child Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Unit Child Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenUnitChildFeature(GenUnitChildFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Unit Child Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Unit Child Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenUnitChildElement(GenUnitChildElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Unit Child Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Unit Child Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenUnitChildAssociation(GenUnitChildAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Interface Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Interface Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenInterfaceField(GenInterfaceField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Data Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Data Type Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDataTypeField(GenDataTypeField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Date Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Date Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDateField(GenDateField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Captcha Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Captcha Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCaptchaField(GenCaptchaField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Unit Support Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Unit Support Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenUnitSupportAction(GenUnitSupportAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Static Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Static Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenStaticUnit(GenStaticUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Command Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Command Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCommandUnit(GenCommandUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCommand(GenCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen User Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen User Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenUserCommand(GenUserCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Dynamic Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDynamicUnit(GenDynamicUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Edit Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Edit Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenEditUnit(GenEditUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Create Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Create Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCreateUnit(GenCreateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Create Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Create Update Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCreateUpdateUnit(GenCreateUpdateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Map Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Map Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenMapUnit(GenMapUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Update Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenUpdateUnit(GenUpdateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Data Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Data Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDataUnit(GenDataUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Details Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Details Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDetailsUnit(GenDetailsUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Index Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Index Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenIndexUnit(GenIndexUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Index Grid Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Index Grid Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenIndexGridUnit(GenIndexGridUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Index Page Direction Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Index Page Direction Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenIndexPageDirectionUnit(GenIndexPageDirectionUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Index Line Direction Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Index Line Direction Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenIndexLineDirectionUnit(GenIndexLineDirectionUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Control Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Control Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenControlUnit(GenControlUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Search Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Search Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenSearchUnit(GenSearchUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Action Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Action Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenActionUnit(GenActionUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Authentication Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Authentication Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenAuthenticationUnit(GenAuthenticationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Registration Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Registration Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenRegistrationUnit(GenRegistrationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Login Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Login Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenLoginUnit(GenLoginUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Forgotten Password Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Forgotten Password Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenForgottenPasswordUnit(GenForgottenPasswordUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Inline Action Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Inline Action Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenInlineActionContainer(GenInlineActionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Inline Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Inline Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenInlineAction(GenInlineAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Select Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Select Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenSelectAction(GenSelectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Delete Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDeleteAction(GenDeleteAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Feature Support Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Feature Support Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenFeatureSupportAction(GenFeatureSupportAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Feature Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Feature Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenFeatureReference(GenFeatureReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Model Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModelReference(GenModelReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Current User Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Current User Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCurrentUserReference(GenCurrentUserReference object) {
		return null;
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
	public T caseGenOrmModel(GenOrmModel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Gen Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenExpression(GenExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPath(GenPath object) {
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

} //GenJsfSwitch
