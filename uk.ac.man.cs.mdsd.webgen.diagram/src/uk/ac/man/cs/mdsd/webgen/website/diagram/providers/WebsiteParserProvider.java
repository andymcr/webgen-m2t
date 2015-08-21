package uk.ac.man.cs.mdsd.webgen.website.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.*;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.AssociationWithContainmentCardinalityEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.AssociationWithContainmentNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.AssociationWithoutContainmentCardinalityTargetCardinEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.AssociationWithoutContainmentNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.CreateUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.CreateUpdateUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DataTypeAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DataTypeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DateAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DeleteActionName2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DeleteActionName3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DeleteActionNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnitName2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnitName3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnitName4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnitName5EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnitName6EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DynamicMenuNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EditStaticTextMenuEntryNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EntityNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EnumerationLiteralNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EnumerationTypeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.FileAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitName2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitName3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitName4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitName5EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitName6EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitName7EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.ModelLabelNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.PageNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SearchUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectActionName2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectActionName3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectActionName4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectActionName5EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectActionName6EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectActionName7EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectActionNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectionNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.ServiceEntityAssociationNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.ServiceEntityElementNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.ServiceNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.ServiceViewAssociationNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.StaticMenuNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.StaticUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UpdateUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.WebsitePropertiesSiteTitleEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.parsers.MessageFormatParser;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry;

/**
 * @generated
 */
public class WebsiteParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser websitePropertiesSiteTitle_5054Parser;

	/**
	 * @generated
	 */
	private IParser getWebsitePropertiesSiteTitle_5054Parser() {
		if (websitePropertiesSiteTitle_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getWebsiteProperties_SiteTitle() };
			MessageFormatParser parser = new MessageFormatParser(features);
			websitePropertiesSiteTitle_5054Parser = parser;
		}
		return websitePropertiesSiteTitle_5054Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeName_5002Parser() {
		if (dataTypeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeName_5002Parser = parser;
		}
		return dataTypeName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser dynamicMenuName_5155Parser;

	/**
	 * @generated
	 */
	private IParser getDynamicMenuName_5155Parser() {
		if (dynamicMenuName_5155Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dynamicMenuName_5155Parser = parser;
		}
		return dynamicMenuName_5155Parser;
	}

	/**
	 * @generated
	 */
	private IParser enumerationTypeName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getEnumerationTypeName_5032Parser() {
		if (enumerationTypeName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumerationTypeName_5032Parser = parser;
		}
		return enumerationTypeName_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser entityName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getEntityName_5004Parser() {
		if (entityName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityName_5004Parser = parser;
		}
		return entityName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser serviceName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getServiceName_5005Parser() {
		if (serviceName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serviceName_5005Parser = parser;
		}
		return serviceName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser pageName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getPageName_5014Parser() {
		if (pageName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pageName_5014Parser = parser;
		}
		return pageName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser staticMenuName_5157Parser;

	/**
	 * @generated
	 */
	private IParser getStaticMenuName_5157Parser() {
		if (staticMenuName_5157Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			staticMenuName_5157Parser = parser;
		}
		return staticMenuName_5157Parser;
	}

	/**
	 * @generated
	 */
	private IParser enumerationLiteralName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getEnumerationLiteralName_5033Parser() {
		if (enumerationLiteralName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumerationLiteralName_5033Parser = parser;
		}
		return enumerationLiteralName_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeAttributeName_5059Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeAttributeName_5059Parser() {
		if (dataTypeAttributeName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeAttributeName_5059Parser = parser;
		}
		return dataTypeAttributeName_5059Parser;
	}

	/**
	 * @generated
	 */
	private IParser dateAttributeName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getDateAttributeName_5018Parser() {
		if (dateAttributeName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateAttributeName_5018Parser = parser;
		}
		return dateAttributeName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser fileAttributeName_5160Parser;

	/**
	 * @generated
	 */
	private IParser getFileAttributeName_5160Parser() {
		if (fileAttributeName_5160Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fileAttributeName_5160Parser = parser;
		}
		return fileAttributeName_5160Parser;
	}

	/**
	 * @generated
	 */
	private IParser imageAttributeName_5242Parser;

	/**
	 * @generated
	 */
	private IParser getImageAttributeName_5242Parser() {
		if (imageAttributeName_5242Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imageAttributeName_5242Parser = parser;
		}
		return imageAttributeName_5242Parser;
	}

	/**
	 * @generated
	 */
	private IParser locationAttributeName_5237Parser;

	/**
	 * @generated
	 */
	private IParser getLocationAttributeName_5237Parser() {
		if (locationAttributeName_5237Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationAttributeName_5237Parser = parser;
		}
		return locationAttributeName_5237Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionUnitName_5221Parser;

	/**
	 * @generated
	 */
	private IParser getActionUnitName_5221Parser() {
		if (actionUnitName_5221Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actionUnitName_5221Parser = parser;
		}
		return actionUnitName_5221Parser;
	}

	/**
	 * @generated
	 */
	private IParser serviceEntityAssociationName_5175Parser;

	/**
	 * @generated
	 */
	private IParser getServiceEntityAssociationName_5175Parser() {
		if (serviceEntityAssociationName_5175Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getServiceEntityAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serviceEntityAssociationName_5175Parser = parser;
		}
		return serviceEntityAssociationName_5175Parser;
	}

	/**
	 * @generated
	 */
	private IParser serviceViewAssociationName_5173Parser;

	/**
	 * @generated
	 */
	private IParser getServiceViewAssociationName_5173Parser() {
		if (serviceViewAssociationName_5173Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serviceViewAssociationName_5173Parser = parser;
		}
		return serviceViewAssociationName_5173Parser;
	}

	/**
	 * @generated
	 */
	private IParser modelLabelName_5170Parser;

	/**
	 * @generated
	 */
	private IParser getModelLabelName_5170Parser() {
		if (modelLabelName_5170Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			modelLabelName_5170Parser = parser;
		}
		return modelLabelName_5170Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectionName_5158Parser;

	/**
	 * @generated
	 */
	private IParser getSelectionName_5158Parser() {
		if (selectionName_5158Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectionName_5158Parser = parser;
		}
		return selectionName_5158Parser;
	}

	/**
	 * @generated
	 */
	private IParser createUnitName_5107Parser;

	/**
	 * @generated
	 */
	private IParser getCreateUnitName_5107Parser() {
		if (createUnitName_5107Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createUnitName_5107Parser = parser;
		}
		return createUnitName_5107Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5176Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5176Parser() {
		if (unitElementName_5176Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5176Parser = parser;
		}
		return unitElementName_5176Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5177Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5177Parser() {
		if (unitAssociationName_5177Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5177Parser = parser;
		}
		return unitAssociationName_5177Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeFieldName_5208Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeFieldName_5208Parser() {
		if (dataTypeFieldName_5208Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeFieldName_5208Parser = parser;
		}
		return dataTypeFieldName_5208Parser;
	}

	/**
	 * @generated
	 */
	private IParser dateFieldName_5214Parser;

	/**
	 * @generated
	 */
	private IParser getDateFieldName_5214Parser() {
		if (dateFieldName_5214Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateFieldName_5214Parser = parser;
		}
		return dateFieldName_5214Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitSupportActionName_5239Parser;

	/**
	 * @generated
	 */
	private IParser getUnitSupportActionName_5239Parser() {
		if (unitSupportActionName_5239Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitSupportActionName_5239Parser = parser;
		}
		return unitSupportActionName_5239Parser;
	}

	/**
	 * @generated
	 */
	private IParser commandUnitName_5233Parser;

	/**
	 * @generated
	 */
	private IParser getCommandUnitName_5233Parser() {
		if (commandUnitName_5233Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commandUnitName_5233Parser = parser;
		}
		return commandUnitName_5233Parser;
	}

	/**
	 * @generated
	 */
	private IParser userCommandName_5232Parser;

	/**
	 * @generated
	 */
	private IParser getUserCommandName_5232Parser() {
		if (userCommandName_5232Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userCommandName_5232Parser = parser;
		}
		return userCommandName_5232Parser;
	}

	/**
	 * @generated
	 */
	private IParser createUpdateUnitName_5108Parser;

	/**
	 * @generated
	 */
	private IParser getCreateUpdateUnitName_5108Parser() {
		if (createUpdateUnitName_5108Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createUpdateUnitName_5108Parser = parser;
		}
		return createUpdateUnitName_5108Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5178Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5178Parser() {
		if (unitElementName_5178Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5178Parser = parser;
		}
		return unitElementName_5178Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5179Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5179Parser() {
		if (unitAssociationName_5179Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5179Parser = parser;
		}
		return unitAssociationName_5179Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeFieldName_5209Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeFieldName_5209Parser() {
		if (dataTypeFieldName_5209Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeFieldName_5209Parser = parser;
		}
		return dataTypeFieldName_5209Parser;
	}

	/**
	 * @generated
	 */
	private IParser dateFieldName_5215Parser;

	/**
	 * @generated
	 */
	private IParser getDateFieldName_5215Parser() {
		if (dateFieldName_5215Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateFieldName_5215Parser = parser;
		}
		return dateFieldName_5215Parser;
	}

	/**
	 * @generated
	 */
	private IParser detailsUnitName_5109Parser;

	/**
	 * @generated
	 */
	private IParser getDetailsUnitName_5109Parser() {
		if (detailsUnitName_5109Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5109Parser = parser;
		}
		return detailsUnitName_5109Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5180Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5180Parser() {
		if (unitElementName_5180Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5180Parser = parser;
		}
		return unitElementName_5180Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectActionName_5106Parser;

	/**
	 * @generated
	 */
	private IParser getSelectActionName_5106Parser() {
		if (selectActionName_5106Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5106Parser = parser;
		}
		return selectActionName_5106Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5199Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5199Parser() {
		if (unitAssociationName_5199Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5199Parser = parser;
		}
		return unitAssociationName_5199Parser;
	}

	/**
	 * @generated
	 */
	private IParser detailsUnitName_5116Parser;

	/**
	 * @generated
	 */
	private IParser getDetailsUnitName_5116Parser() {
		if (detailsUnitName_5116Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5116Parser = parser;
		}
		return detailsUnitName_5116Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5181Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5181Parser() {
		if (unitElementName_5181Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5181Parser = parser;
		}
		return unitElementName_5181Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5184Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5184Parser() {
		if (unitAssociationName_5184Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5184Parser = parser;
		}
		return unitAssociationName_5184Parser;
	}

	/**
	 * @generated
	 */
	private IParser detailsUnitName_5117Parser;

	/**
	 * @generated
	 */
	private IParser getDetailsUnitName_5117Parser() {
		if (detailsUnitName_5117Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5117Parser = parser;
		}
		return detailsUnitName_5117Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5182Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5182Parser() {
		if (unitElementName_5182Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5182Parser = parser;
		}
		return unitElementName_5182Parser;
	}

	/**
	 * @generated
	 */
	private IParser indexUnitName_5112Parser;

	/**
	 * @generated
	 */
	private IParser getIndexUnitName_5112Parser() {
		if (indexUnitName_5112Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5112Parser = parser;
		}
		return indexUnitName_5112Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5183Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5183Parser() {
		if (unitElementName_5183Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5183Parser = parser;
		}
		return unitElementName_5183Parser;
	}

	/**
	 * @generated
	 */
	private IParser indexUnitName_5123Parser;

	/**
	 * @generated
	 */
	private IParser getIndexUnitName_5123Parser() {
		if (indexUnitName_5123Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5123Parser = parser;
		}
		return indexUnitName_5123Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5185Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5185Parser() {
		if (unitElementName_5185Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5185Parser = parser;
		}
		return unitElementName_5185Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5198Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5198Parser() {
		if (unitAssociationName_5198Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5198Parser = parser;
		}
		return unitAssociationName_5198Parser;
	}

	/**
	 * @generated
	 */
	private IParser detailsUnitName_5120Parser;

	/**
	 * @generated
	 */
	private IParser getDetailsUnitName_5120Parser() {
		if (detailsUnitName_5120Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5120Parser = parser;
		}
		return detailsUnitName_5120Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5186Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5186Parser() {
		if (unitElementName_5186Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5186Parser = parser;
		}
		return unitElementName_5186Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5191Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5191Parser() {
		if (unitAssociationName_5191Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5191Parser = parser;
		}
		return unitAssociationName_5191Parser;
	}

	/**
	 * @generated
	 */
	private IParser indexUnitName_5122Parser;

	/**
	 * @generated
	 */
	private IParser getIndexUnitName_5122Parser() {
		if (indexUnitName_5122Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5122Parser = parser;
		}
		return indexUnitName_5122Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5189Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5189Parser() {
		if (unitElementName_5189Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5189Parser = parser;
		}
		return unitElementName_5189Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5190Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5190Parser() {
		if (unitAssociationName_5190Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5190Parser = parser;
		}
		return unitAssociationName_5190Parser;
	}

	/**
	 * @generated
	 */
	private IParser indexUnitName_5142Parser;

	/**
	 * @generated
	 */
	private IParser getIndexUnitName_5142Parser() {
		if (indexUnitName_5142Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5142Parser = parser;
		}
		return indexUnitName_5142Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5200Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5200Parser() {
		if (unitElementName_5200Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5200Parser = parser;
		}
		return unitElementName_5200Parser;
	}

	/**
	 * @generated
	 */
	private IParser indexUnitName_5125Parser;

	/**
	 * @generated
	 */
	private IParser getIndexUnitName_5125Parser() {
		if (indexUnitName_5125Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5125Parser = parser;
		}
		return indexUnitName_5125Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5192Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5192Parser() {
		if (unitElementName_5192Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5192Parser = parser;
		}
		return unitElementName_5192Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5197Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5197Parser() {
		if (unitAssociationName_5197Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5197Parser = parser;
		}
		return unitAssociationName_5197Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectActionName_5110Parser;

	/**
	 * @generated
	 */
	private IParser getSelectActionName_5110Parser() {
		if (selectActionName_5110Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5110Parser = parser;
		}
		return selectActionName_5110Parser;
	}

	/**
	 * @generated
	 */
	private IParser detailsUnitName_5133Parser;

	/**
	 * @generated
	 */
	private IParser getDetailsUnitName_5133Parser() {
		if (detailsUnitName_5133Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5133Parser = parser;
		}
		return detailsUnitName_5133Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5187Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5187Parser() {
		if (unitElementName_5187Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5187Parser = parser;
		}
		return unitElementName_5187Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5188Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5188Parser() {
		if (unitAssociationName_5188Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5188Parser = parser;
		}
		return unitAssociationName_5188Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectActionName_5130Parser;

	/**
	 * @generated
	 */
	private IParser getSelectActionName_5130Parser() {
		if (selectActionName_5130Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5130Parser = parser;
		}
		return selectActionName_5130Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeFieldName_5210Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeFieldName_5210Parser() {
		if (dataTypeFieldName_5210Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeFieldName_5210Parser = parser;
		}
		return dataTypeFieldName_5210Parser;
	}

	/**
	 * @generated
	 */
	private IParser dateFieldName_5216Parser;

	/**
	 * @generated
	 */
	private IParser getDateFieldName_5216Parser() {
		if (dateFieldName_5216Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateFieldName_5216Parser = parser;
		}
		return dateFieldName_5216Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectActionName_5132Parser;

	/**
	 * @generated
	 */
	private IParser getSelectActionName_5132Parser() {
		if (selectActionName_5132Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5132Parser = parser;
		}
		return selectActionName_5132Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeFieldName_5211Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeFieldName_5211Parser() {
		if (dataTypeFieldName_5211Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeFieldName_5211Parser = parser;
		}
		return dataTypeFieldName_5211Parser;
	}

	/**
	 * @generated
	 */
	private IParser dateFieldName_5217Parser;

	/**
	 * @generated
	 */
	private IParser getDateFieldName_5217Parser() {
		if (dateFieldName_5217Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateFieldName_5217Parser = parser;
		}
		return dateFieldName_5217Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitSupportActionName_5240Parser;

	/**
	 * @generated
	 */
	private IParser getUnitSupportActionName_5240Parser() {
		if (unitSupportActionName_5240Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitSupportActionName_5240Parser = parser;
		}
		return unitSupportActionName_5240Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectActionName_5131Parser;

	/**
	 * @generated
	 */
	private IParser getSelectActionName_5131Parser() {
		if (selectActionName_5131Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5131Parser = parser;
		}
		return selectActionName_5131Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5201Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5201Parser() {
		if (unitAssociationName_5201Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5201Parser = parser;
		}
		return unitAssociationName_5201Parser;
	}

	/**
	 * @generated
	 */
	private IParser deleteActionName_5105Parser;

	/**
	 * @generated
	 */
	private IParser getDeleteActionName_5105Parser() {
		if (deleteActionName_5105Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteActionName_5105Parser = parser;
		}
		return deleteActionName_5105Parser;
	}

	/**
	 * @generated
	 */
	private IParser searchUnitName_5113Parser;

	/**
	 * @generated
	 */
	private IParser getSearchUnitName_5113Parser() {
		if (searchUnitName_5113Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			searchUnitName_5113Parser = parser;
		}
		return searchUnitName_5113Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5202Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5202Parser() {
		if (unitElementName_5202Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5202Parser = parser;
		}
		return unitElementName_5202Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5203Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5203Parser() {
		if (unitAssociationName_5203Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5203Parser = parser;
		}
		return unitAssociationName_5203Parser;
	}

	/**
	 * @generated
	 */
	private IParser detailsUnitName_5226Parser;

	/**
	 * @generated
	 */
	private IParser getDetailsUnitName_5226Parser() {
		if (detailsUnitName_5226Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5226Parser = parser;
		}
		return detailsUnitName_5226Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeFieldName_5212Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeFieldName_5212Parser() {
		if (dataTypeFieldName_5212Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeFieldName_5212Parser = parser;
		}
		return dataTypeFieldName_5212Parser;
	}

	/**
	 * @generated
	 */
	private IParser dateFieldName_5218Parser;

	/**
	 * @generated
	 */
	private IParser getDateFieldName_5218Parser() {
		if (dateFieldName_5218Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateFieldName_5218Parser = parser;
		}
		return dateFieldName_5218Parser;
	}

	/**
	 * @generated
	 */
	private IParser detailsUnitName_5135Parser;

	/**
	 * @generated
	 */
	private IParser getDetailsUnitName_5135Parser() {
		if (detailsUnitName_5135Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5135Parser = parser;
		}
		return detailsUnitName_5135Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5193Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5193Parser() {
		if (unitElementName_5193Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5193Parser = parser;
		}
		return unitElementName_5193Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5194Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5194Parser() {
		if (unitAssociationName_5194Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5194Parser = parser;
		}
		return unitAssociationName_5194Parser;
	}

	/**
	 * @generated
	 */
	private IParser staticUnitName_5114Parser;

	/**
	 * @generated
	 */
	private IParser getStaticUnitName_5114Parser() {
		if (staticUnitName_5114Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			staticUnitName_5114Parser = parser;
		}
		return staticUnitName_5114Parser;
	}

	/**
	 * @generated
	 */
	private IParser updateUnitName_5115Parser;

	/**
	 * @generated
	 */
	private IParser getUpdateUnitName_5115Parser() {
		if (updateUnitName_5115Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateUnitName_5115Parser = parser;
		}
		return updateUnitName_5115Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5227Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5227Parser() {
		if (unitElementName_5227Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5227Parser = parser;
		}
		return unitElementName_5227Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5231Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5231Parser() {
		if (unitAssociationName_5231Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5231Parser = parser;
		}
		return unitAssociationName_5231Parser;
	}

	/**
	 * @generated
	 */
	private IParser indexUnitName_5230Parser;

	/**
	 * @generated
	 */
	private IParser getIndexUnitName_5230Parser() {
		if (indexUnitName_5230Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5230Parser = parser;
		}
		return indexUnitName_5230Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5228Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5228Parser() {
		if (unitElementName_5228Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5228Parser = parser;
		}
		return unitElementName_5228Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5229Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5229Parser() {
		if (unitAssociationName_5229Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5229Parser = parser;
		}
		return unitAssociationName_5229Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5204Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5204Parser() {
		if (unitElementName_5204Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5204Parser = parser;
		}
		return unitElementName_5204Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5207Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5207Parser() {
		if (unitAssociationName_5207Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5207Parser = parser;
		}
		return unitAssociationName_5207Parser;
	}

	/**
	 * @generated
	 */
	private IParser indexUnitName_5149Parser;

	/**
	 * @generated
	 */
	private IParser getIndexUnitName_5149Parser() {
		if (indexUnitName_5149Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5149Parser = parser;
		}
		return indexUnitName_5149Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5222Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5222Parser() {
		if (unitElementName_5222Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5222Parser = parser;
		}
		return unitElementName_5222Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5223Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5223Parser() {
		if (unitAssociationName_5223Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5223Parser = parser;
		}
		return unitAssociationName_5223Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5205Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5205Parser() {
		if (unitElementName_5205Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5205Parser = parser;
		}
		return unitElementName_5205Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5206Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5206Parser() {
		if (unitAssociationName_5206Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5206Parser = parser;
		}
		return unitAssociationName_5206Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectActionName_5161Parser;

	/**
	 * @generated
	 */
	private IParser getSelectActionName_5161Parser() {
		if (selectActionName_5161Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5161Parser = parser;
		}
		return selectActionName_5161Parser;
	}

	/**
	 * @generated
	 */
	private IParser deleteActionName_5162Parser;

	/**
	 * @generated
	 */
	private IParser getDeleteActionName_5162Parser() {
		if (deleteActionName_5162Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteActionName_5162Parser = parser;
		}
		return deleteActionName_5162Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeFieldName_5224Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeFieldName_5224Parser() {
		if (dataTypeFieldName_5224Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeFieldName_5224Parser = parser;
		}
		return dataTypeFieldName_5224Parser;
	}

	/**
	 * @generated
	 */
	private IParser dateFieldName_5225Parser;

	/**
	 * @generated
	 */
	private IParser getDateFieldName_5225Parser() {
		if (dateFieldName_5225Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateFieldName_5225Parser = parser;
		}
		return dateFieldName_5225Parser;
	}

	/**
	* @generated
	*/
	private IParser actionMenuEntryName_5243Parser;

	/**
	* @generated
	*/
	private IParser getActionMenuEntryName_5243Parser() {
		if (actionMenuEntryName_5243Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actionMenuEntryName_5243Parser = parser;
		}
		return actionMenuEntryName_5243Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeFieldName_5213Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeFieldName_5213Parser() {
		if (dataTypeFieldName_5213Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeFieldName_5213Parser = parser;
		}
		return dataTypeFieldName_5213Parser;
	}

	/**
	 * @generated
	 */
	private IParser dateFieldName_5219Parser;

	/**
	 * @generated
	 */
	private IParser getDateFieldName_5219Parser() {
		if (dateFieldName_5219Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateFieldName_5219Parser = parser;
		}
		return dateFieldName_5219Parser;
	}

	/**
	 * @generated
	 */
	private IParser selectActionName_5150Parser;

	/**
	 * @generated
	 */
	private IParser getSelectActionName_5150Parser() {
		if (selectActionName_5150Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5150Parser = parser;
		}
		return selectActionName_5150Parser;
	}

	/**
	 * @generated
	 */
	private IParser deleteActionName_5151Parser;

	/**
	 * @generated
	 */
	private IParser getDeleteActionName_5151Parser() {
		if (deleteActionName_5151Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteActionName_5151Parser = parser;
		}
		return deleteActionName_5151Parser;
	}

	/**
	 * @generated
	 */
	private IParser featureSupportActionName_5241Parser;

	/**
	 * @generated
	 */
	private IParser getFeatureSupportActionName_5241Parser() {
		if (featureSupportActionName_5241Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			featureSupportActionName_5241Parser = parser;
		}
		return featureSupportActionName_5241Parser;
	}

	/**
	 * @generated
	 */
	private IParser mapUnitName_5235Parser;

	/**
	 * @generated
	 */
	private IParser getMapUnitName_5235Parser() {
		if (mapUnitName_5235Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mapUnitName_5235Parser = parser;
		}
		return mapUnitName_5235Parser;
	}

	/**
	 * @generated
	 */
	private IParser indexUnitName_5138Parser;

	/**
	 * @generated
	 */
	private IParser getIndexUnitName_5138Parser() {
		if (indexUnitName_5138Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5138Parser = parser;
		}
		return indexUnitName_5138Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitElementName_5195Parser;

	/**
	 * @generated
	 */
	private IParser getUnitElementName_5195Parser() {
		if (unitElementName_5195Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5195Parser = parser;
		}
		return unitElementName_5195Parser;
	}

	/**
	 * @generated
	 */
	private IParser unitAssociationName_5196Parser;

	/**
	 * @generated
	 */
	private IParser getUnitAssociationName_5196Parser() {
		if (unitAssociationName_5196Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getUnitAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5196Parser = parser;
		}
		return unitAssociationName_5196Parser;
	}

	/**
	 * @generated
	 */
	private IParser fixedCommandMenuEntryName_5238Parser;

	/**
	 * @generated
	 */
	private IParser getFixedCommandMenuEntryName_5238Parser() {
		if (fixedCommandMenuEntryName_5238Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fixedCommandMenuEntryName_5238Parser = parser;
		}
		return fixedCommandMenuEntryName_5238Parser;
	}

	/**
	 * @generated
	 */
	private IParser editStaticTextMenuEntryName_5164Parser;

	/**
	 * @generated
	 */
	private IParser getEditStaticTextMenuEntryName_5164Parser() {
		if (editStaticTextMenuEntryName_5164Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			editStaticTextMenuEntryName_5164Parser = parser;
		}
		return editStaticTextMenuEntryName_5164Parser;
	}

	/**
	 * @generated
	 */
	private IParser serviceEntityElementName_5174Parser;

	/**
	 * @generated
	 */
	private IParser getServiceEntityElementName_5174Parser() {
		if (serviceEntityElementName_5174Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getServiceEntityElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serviceEntityElementName_5174Parser = parser;
		}
		return serviceEntityElementName_5174Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationWithoutContainmentName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationWithoutContainmentName_6001Parser() {
		if (associationWithoutContainmentName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationWithoutContainmentName_6001Parser = parser;
		}
		return associationWithoutContainmentName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationWithoutContainmentCardinalityTargetCardinality_6002Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationWithoutContainmentCardinalityTargetCardinality_6002Parser() {
		if (associationWithoutContainmentCardinalityTargetCardinality_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getFeature_Cardinality(),
					WebsitePackage.eINSTANCE.getAssociationWithoutContainment_TargetCardinality() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}..{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}..{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}..{1}"); //$NON-NLS-1$
			associationWithoutContainmentCardinalityTargetCardinality_6002Parser = parser;
		}
		return associationWithoutContainmentCardinalityTargetCardinality_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationWithContainmentName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationWithContainmentName_6003Parser() {
		if (associationWithContainmentName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { WebsitePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationWithContainmentName_6003Parser = parser;
		}
		return associationWithContainmentName_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationWithContainmentCardinality_6004Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationWithContainmentCardinality_6004Parser() {
		if (associationWithContainmentCardinality_6004Parser == null) {
			EAttribute editableFeature = WebsitePackage.eINSTANCE.getFeature_Cardinality();
			EnumParser parser = new EnumParser(editableFeature);
			associationWithContainmentCardinality_6004Parser = parser;
		}
		return associationWithContainmentCardinality_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WebsitePropertiesSiteTitleEditPart.VISUAL_ID:
			return getWebsitePropertiesSiteTitle_5054Parser();
		case DataTypeNameEditPart.VISUAL_ID:
			return getDataTypeName_5002Parser();
		case DynamicMenuNameEditPart.VISUAL_ID:
			return getDynamicMenuName_5155Parser();
		case EnumerationTypeNameEditPart.VISUAL_ID:
			return getEnumerationTypeName_5032Parser();
		case EntityNameEditPart.VISUAL_ID:
			return getEntityName_5004Parser();
		case PageNameEditPart.VISUAL_ID:
			return getPageName_5014Parser();
		case StaticMenuNameEditPart.VISUAL_ID:
			return getStaticMenuName_5157Parser();
		case ServiceNameEditPart.VISUAL_ID:
			return getServiceName_5005Parser();
		case EnumerationLiteralNameEditPart.VISUAL_ID:
			return getEnumerationLiteralName_5033Parser();
		case DataTypeAttributeNameEditPart.VISUAL_ID:
			return getDataTypeAttributeName_5059Parser();
		case DateAttributeNameEditPart.VISUAL_ID:
			return getDateAttributeName_5018Parser();
		case FileAttributeNameEditPart.VISUAL_ID:
			return getFileAttributeName_5160Parser();
		case ImageAttributeNameEditPart.VISUAL_ID:
			return getImageAttributeName_5242Parser();
		case LocationAttributeNameEditPart.VISUAL_ID:
			return getLocationAttributeName_5237Parser();
		case ActionUnitNameEditPart.VISUAL_ID:
			return getActionUnitName_5221Parser();
		case UnitElementNameEditPart.VISUAL_ID:
			return getUnitElementName_5176Parser();
		case UnitAssociationNameEditPart.VISUAL_ID:
			return getUnitAssociationName_5177Parser();
		case DataTypeFieldNameEditPart.VISUAL_ID:
			return getDataTypeFieldName_5208Parser();
		case DateFieldNameEditPart.VISUAL_ID:
			return getDateFieldName_5214Parser();
		case UnitSupportActionNameEditPart.VISUAL_ID:
			return getUnitSupportActionName_5239Parser();
		case CommandUnitNameEditPart.VISUAL_ID:
			return getCommandUnitName_5233Parser();
		case UserCommandNameEditPart.VISUAL_ID:
			return getUserCommandName_5232Parser();
		case CreateUnitNameEditPart.VISUAL_ID:
			return getCreateUnitName_5107Parser();
		case UnitElementName2EditPart.VISUAL_ID:
			return getUnitElementName_5178Parser();
		case UnitAssociationName2EditPart.VISUAL_ID:
			return getUnitAssociationName_5179Parser();
		case DataTypeFieldName2EditPart.VISUAL_ID:
			return getDataTypeFieldName_5209Parser();
		case DateFieldName2EditPart.VISUAL_ID:
			return getDateFieldName_5215Parser();
		case CreateUpdateUnitNameEditPart.VISUAL_ID:
			return getCreateUpdateUnitName_5108Parser();
		case UnitElementName3EditPart.VISUAL_ID:
			return getUnitElementName_5180Parser();
		case UnitAssociationName3EditPart.VISUAL_ID:
			return getUnitAssociationName_5199Parser();
		case DataTypeFieldName3EditPart.VISUAL_ID:
			return getDataTypeFieldName_5210Parser();
		case DateFieldName3EditPart.VISUAL_ID:
			return getDateFieldName_5216Parser();
		case DetailsUnitNameEditPart.VISUAL_ID:
			return getDetailsUnitName_5109Parser();
		case UnitElementName4EditPart.VISUAL_ID:
			return getUnitElementName_5181Parser();
		case SelectActionNameEditPart.VISUAL_ID:
			return getSelectActionName_5106Parser();
		case UnitAssociationName4EditPart.VISUAL_ID:
			return getUnitAssociationName_5184Parser();
		case DetailsUnitName2EditPart.VISUAL_ID:
			return getDetailsUnitName_5116Parser();
		case UnitElementName5EditPart.VISUAL_ID:
			return getUnitElementName_5182Parser();
		case UnitAssociationName5EditPart.VISUAL_ID:
			return getUnitAssociationName_5198Parser();
		case DetailsUnitName3EditPart.VISUAL_ID:
			return getDetailsUnitName_5117Parser();
		case UnitElementName6EditPart.VISUAL_ID:
			return getUnitElementName_5183Parser();
		case IndexUnitNameEditPart.VISUAL_ID:
			return getIndexUnitName_5112Parser();
		case UnitElementName7EditPart.VISUAL_ID:
			return getUnitElementName_5185Parser();
		case IndexUnitName2EditPart.VISUAL_ID:
			return getIndexUnitName_5123Parser();
		case UnitElementName8EditPart.VISUAL_ID:
			return getUnitElementName_5186Parser();
		case UnitAssociationName6EditPart.VISUAL_ID:
			return getUnitAssociationName_5191Parser();
		case DetailsUnitName4EditPart.VISUAL_ID:
			return getDetailsUnitName_5120Parser();
		case UnitElementName9EditPart.VISUAL_ID:
			return getUnitElementName_5187Parser();
		case UnitAssociationName7EditPart.VISUAL_ID:
			return getUnitAssociationName_5188Parser();
		case DetailsUnitName5EditPart.VISUAL_ID:
			return getDetailsUnitName_5133Parser();
		case UnitElementName10EditPart.VISUAL_ID:
			return getUnitElementName_5189Parser();
		case UnitAssociationName8EditPart.VISUAL_ID:
			return getUnitAssociationName_5190Parser();
		case IndexUnitName3EditPart.VISUAL_ID:
			return getIndexUnitName_5122Parser();
		case UnitElementName11EditPart.VISUAL_ID:
			return getUnitElementName_5192Parser();
		case UnitAssociationName9EditPart.VISUAL_ID:
			return getUnitAssociationName_5197Parser();
		case IndexUnitName4EditPart.VISUAL_ID:
			return getIndexUnitName_5125Parser();
		case UnitElementName12EditPart.VISUAL_ID:
			return getUnitElementName_5193Parser();
		case UnitAssociationName10EditPart.VISUAL_ID:
			return getUnitAssociationName_5194Parser();
		case DetailsUnitName6EditPart.VISUAL_ID:
			return getDetailsUnitName_5135Parser();
		case UnitElementName13EditPart.VISUAL_ID:
			return getUnitElementName_5195Parser();
		case UnitAssociationName11EditPart.VISUAL_ID:
			return getUnitAssociationName_5196Parser();
		case IndexUnitName5EditPart.VISUAL_ID:
			return getIndexUnitName_5138Parser();
		case UnitElementName14EditPart.VISUAL_ID:
			return getUnitElementName_5200Parser();
		case UnitAssociationName12EditPart.VISUAL_ID:
			return getUnitAssociationName_5201Parser();
		case SelectActionName2EditPart.VISUAL_ID:
			return getSelectActionName_5110Parser();
		case DeleteActionNameEditPart.VISUAL_ID:
			return getDeleteActionName_5105Parser();
		case SelectActionName3EditPart.VISUAL_ID:
			return getSelectActionName_5130Parser();
		case DataTypeFieldName4EditPart.VISUAL_ID:
			return getDataTypeFieldName_5211Parser();
		case DateFieldName4EditPart.VISUAL_ID:
			return getDateFieldName_5217Parser();
		case UnitSupportActionName2EditPart.VISUAL_ID:
			return getUnitSupportActionName_5240Parser();
		case IndexUnitName6EditPart.VISUAL_ID:
			return getIndexUnitName_5142Parser();
		case UnitElementName15EditPart.VISUAL_ID:
			return getUnitElementName_5202Parser();
		case SelectActionName4EditPart.VISUAL_ID:
			return getSelectActionName_5131Parser();
		case UnitAssociationName13EditPart.VISUAL_ID:
			return getUnitAssociationName_5203Parser();
		case DetailsUnitName7EditPart.VISUAL_ID:
			return getDetailsUnitName_5226Parser();
		case UnitElementName16EditPart.VISUAL_ID:
			return getUnitElementName_5204Parser();
		case UnitAssociationName14EditPart.VISUAL_ID:
			return getUnitAssociationName_5207Parser();
		case IndexUnitName7EditPart.VISUAL_ID:
			return getIndexUnitName_5149Parser();
		case UnitElementName17EditPart.VISUAL_ID:
			return getUnitElementName_5205Parser();
		case UnitAssociationName15EditPart.VISUAL_ID:
			return getUnitAssociationName_5206Parser();
		case SelectActionName5EditPart.VISUAL_ID:
			return getSelectActionName_5132Parser();
		case DataTypeFieldName5EditPart.VISUAL_ID:
			return getDataTypeFieldName_5212Parser();
		case DateFieldName5EditPart.VISUAL_ID:
			return getDateFieldName_5218Parser();
		case SelectActionName6EditPart.VISUAL_ID:
			return getSelectActionName_5150Parser();
		case DeleteActionName2EditPart.VISUAL_ID:
			return getDeleteActionName_5151Parser();
		case FeatureSupportActionNameEditPart.VISUAL_ID:
			return getFeatureSupportActionName_5241Parser();
		case MapUnitNameEditPart.VISUAL_ID:
			return getMapUnitName_5235Parser();
		case SearchUnitNameEditPart.VISUAL_ID:
			return getSearchUnitName_5113Parser();
		case UnitElementName18EditPart.VISUAL_ID:
			return getUnitElementName_5222Parser();
		case UnitAssociationName16EditPart.VISUAL_ID:
			return getUnitAssociationName_5223Parser();
		case DataTypeFieldName6EditPart.VISUAL_ID:
			return getDataTypeFieldName_5213Parser();
		case DateFieldName6EditPart.VISUAL_ID:
			return getDateFieldName_5219Parser();
		case StaticUnitNameEditPart.VISUAL_ID:
			return getStaticUnitName_5114Parser();
		case UpdateUnitNameEditPart.VISUAL_ID:
			return getUpdateUnitName_5115Parser();
		case UnitElementName19EditPart.VISUAL_ID:
			return getUnitElementName_5227Parser();
		case UnitAssociationName17EditPart.VISUAL_ID:
			return getUnitAssociationName_5231Parser();
		case IndexUnitName8EditPart.VISUAL_ID:
			return getIndexUnitName_5230Parser();
		case UnitElementName20EditPart.VISUAL_ID:
			return getUnitElementName_5228Parser();
		case UnitAssociationName18EditPart.VISUAL_ID:
			return getUnitAssociationName_5229Parser();
		case SelectActionName7EditPart.VISUAL_ID:
			return getSelectActionName_5161Parser();
		case DeleteActionName3EditPart.VISUAL_ID:
			return getDeleteActionName_5162Parser();
		case DataTypeFieldName7EditPart.VISUAL_ID:
			return getDataTypeFieldName_5224Parser();
		case DateFieldName7EditPart.VISUAL_ID:
			return getDateFieldName_5225Parser();
		case ActionMenuEntryNameEditPart.VISUAL_ID:
			return getActionMenuEntryName_5243Parser();
		case FixedCommandMenuEntryNameEditPart.VISUAL_ID:
			return getFixedCommandMenuEntryName_5238Parser();
		case EditStaticTextMenuEntryNameEditPart.VISUAL_ID:
			return getEditStaticTextMenuEntryName_5164Parser();
		case ServiceEntityElementNameEditPart.VISUAL_ID:
			return getServiceEntityElementName_5174Parser();
		case ServiceEntityAssociationNameEditPart.VISUAL_ID:
			return getServiceEntityAssociationName_5175Parser();
		case ServiceViewAssociationNameEditPart.VISUAL_ID:
			return getServiceViewAssociationName_5173Parser();
		case ModelLabelNameEditPart.VISUAL_ID:
			return getModelLabelName_5170Parser();
		case SelectionNameEditPart.VISUAL_ID:
			return getSelectionName_5158Parser();
		case AssociationWithoutContainmentNameEditPart.VISUAL_ID:
			return getAssociationWithoutContainmentName_6001Parser();
		case AssociationWithoutContainmentCardinalityTargetCardinEditPart.VISUAL_ID:
			return getAssociationWithoutContainmentCardinalityTargetCardinality_6002Parser();
		case AssociationWithContainmentNameEditPart.VISUAL_ID:
			return getAssociationWithContainmentName_6003Parser();

		case AssociationWithContainmentCardinalityEditPart.VISUAL_ID:
			return getAssociationWithContainmentCardinality_6004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(WebsiteVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(WebsiteVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (WebsiteElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
