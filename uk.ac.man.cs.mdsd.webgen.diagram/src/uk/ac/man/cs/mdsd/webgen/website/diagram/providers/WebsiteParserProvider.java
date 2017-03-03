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

import uk.ac.man.cs.mdsd.webgen.base.BasePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
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
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.ServiceNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.StaticMenuNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.StaticUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UpdateUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.WebsitePropertiesSiteTitleEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.parsers.MessageFormatParser;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

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
	private IParser dataTypeName_5282Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeName_5282Parser() {
		if (dataTypeName_5282Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeName_5282Parser = parser;
		}
		return dataTypeName_5282Parser;
	}

	/**
	* @generated
	*/
	private IParser dynamicMenuName_5300Parser;

	/**
	* @generated
	*/
	private IParser getDynamicMenuName_5300Parser() {
		if (dynamicMenuName_5300Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dynamicMenuName_5300Parser = parser;
		}
		return dynamicMenuName_5300Parser;
	}

	/**
	* @generated
	*/
	private IParser enumerationTypeName_5284Parser;

	/**
	* @generated
	*/
	private IParser getEnumerationTypeName_5284Parser() {
		if (enumerationTypeName_5284Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumerationTypeName_5284Parser = parser;
		}
		return enumerationTypeName_5284Parser;
	}

	/**
	* @generated
	*/
	private IParser entityName_5292Parser;

	/**
	* @generated
	*/
	private IParser getEntityName_5292Parser() {
		if (entityName_5292Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityName_5292Parser = parser;
		}
		return entityName_5292Parser;
	}

	/**
	* @generated
	*/
	private IParser viewName_5296Parser;

	/**
	* @generated
	*/
	private IParser getViewName_5296Parser() {
		if (viewName_5296Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			viewName_5296Parser = parser;
		}
		return viewName_5296Parser;
	}

	/**
	* @generated
	*/
	private IParser pageName_5392Parser;

	/**
	* @generated
	*/
	private IParser getPageName_5392Parser() {
		if (pageName_5392Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pageName_5392Parser = parser;
		}
		return pageName_5392Parser;
	}

	/**
	* @generated
	*/
	private IParser staticMenuName_5395Parser;

	/**
	* @generated
	*/
	private IParser getStaticMenuName_5395Parser() {
		if (staticMenuName_5395Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			staticMenuName_5395Parser = parser;
		}
		return staticMenuName_5395Parser;
	}

	/**
	* @generated
	*/
	private IParser enumerationLiteralName_5283Parser;

	/**
	* @generated
	*/
	private IParser getEnumerationLiteralName_5283Parser() {
		if (enumerationLiteralName_5283Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumerationLiteralName_5283Parser = parser;
		}
		return enumerationLiteralName_5283Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeAttributeName_5285Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeAttributeName_5285Parser() {
		if (dataTypeAttributeName_5285Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeAttributeName_5285Parser = parser;
		}
		return dataTypeAttributeName_5285Parser;
	}

	/**
	* @generated
	*/
	private IParser dateAttributeName_5286Parser;

	/**
	* @generated
	*/
	private IParser getDateAttributeName_5286Parser() {
		if (dateAttributeName_5286Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateAttributeName_5286Parser = parser;
		}
		return dateAttributeName_5286Parser;
	}

	/**
	* @generated
	*/
	private IParser urlAttributeName_5287Parser;

	/**
	* @generated
	*/
	private IParser getUrlAttributeName_5287Parser() {
		if (urlAttributeName_5287Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			urlAttributeName_5287Parser = parser;
		}
		return urlAttributeName_5287Parser;
	}

	/**
	* @generated
	*/
	private IParser fileAttributeName_5288Parser;

	/**
	* @generated
	*/
	private IParser getFileAttributeName_5288Parser() {
		if (fileAttributeName_5288Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fileAttributeName_5288Parser = parser;
		}
		return fileAttributeName_5288Parser;
	}

	/**
	* @generated
	*/
	private IParser imageAttributeName_5289Parser;

	/**
	* @generated
	*/
	private IParser getImageAttributeName_5289Parser() {
		if (imageAttributeName_5289Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imageAttributeName_5289Parser = parser;
		}
		return imageAttributeName_5289Parser;
	}

	/**
	* @generated
	*/
	private IParser locationAttributeName_5290Parser;

	/**
	* @generated
	*/
	private IParser getLocationAttributeName_5290Parser() {
		if (locationAttributeName_5290Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationAttributeName_5290Parser = parser;
		}
		return locationAttributeName_5290Parser;
	}

	/**
	* @generated
	*/
	private IParser modelLabelName_5291Parser;

	/**
	* @generated
	*/
	private IParser getModelLabelName_5291Parser() {
		if (modelLabelName_5291Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			modelLabelName_5291Parser = parser;
		}
		return modelLabelName_5291Parser;
	}

	/**
	* @generated
	*/
	private IParser modelLabelName_5293Parser;

	/**
	* @generated
	*/
	private IParser getModelLabelName_5293Parser() {
		if (modelLabelName_5293Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			modelLabelName_5293Parser = parser;
		}
		return modelLabelName_5293Parser;
	}

	/**
	* @generated
	*/
	private IParser encapsulatedAttributeName_5294Parser;

	/**
	* @generated
	*/
	private IParser getEncapsulatedAttributeName_5294Parser() {
		if (encapsulatedAttributeName_5294Parser == null) {
			EAttribute[] features = new EAttribute[] { PersistencePackage.eINSTANCE.getEncapsulatedAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			encapsulatedAttributeName_5294Parser = parser;
		}
		return encapsulatedAttributeName_5294Parser;
	}

	/**
	* @generated
	*/
	private IParser encapsulatedAssociationName_5295Parser;

	/**
	* @generated
	*/
	private IParser getEncapsulatedAssociationName_5295Parser() {
		if (encapsulatedAssociationName_5295Parser == null) {
			EAttribute[] features = new EAttribute[] { PersistencePackage.eINSTANCE.getEncapsulatedAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			encapsulatedAssociationName_5295Parser = parser;
		}
		return encapsulatedAssociationName_5295Parser;
	}

	/**
	* @generated
	*/
	private IParser createUnitName_5305Parser;

	/**
	* @generated
	*/
	private IParser getCreateUnitName_5305Parser() {
		if (createUnitName_5305Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createUnitName_5305Parser = parser;
		}
		return createUnitName_5305Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5301Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5301Parser() {
		if (unitElementName_5301Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5301Parser = parser;
		}
		return unitElementName_5301Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5302Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5302Parser() {
		if (unitAssociationName_5302Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5302Parser = parser;
		}
		return unitAssociationName_5302Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeFieldName_5303Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeFieldName_5303Parser() {
		if (dataTypeFieldName_5303Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeFieldName_5303Parser = parser;
		}
		return dataTypeFieldName_5303Parser;
	}

	/**
	* @generated
	*/
	private IParser dateFieldName_5304Parser;

	/**
	* @generated
	*/
	private IParser getDateFieldName_5304Parser() {
		if (dateFieldName_5304Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateFieldName_5304Parser = parser;
		}
		return dateFieldName_5304Parser;
	}

	/**
	* @generated
	*/
	private IParser createUpdateUnitName_5312Parser;

	/**
	* @generated
	*/
	private IParser getCreateUpdateUnitName_5312Parser() {
		if (createUpdateUnitName_5312Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createUpdateUnitName_5312Parser = parser;
		}
		return createUpdateUnitName_5312Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5306Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5306Parser() {
		if (unitElementName_5306Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5306Parser = parser;
		}
		return unitElementName_5306Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5309Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5309Parser() {
		if (unitAssociationName_5309Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5309Parser = parser;
		}
		return unitAssociationName_5309Parser;
	}

	/**
	* @generated
	*/
	private IParser createUpdateUnitName_5308Parser;

	/**
	* @generated
	*/
	private IParser getCreateUpdateUnitName_5308Parser() {
		if (createUpdateUnitName_5308Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createUpdateUnitName_5308Parser = parser;
		}
		return createUpdateUnitName_5308Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5307Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5307Parser() {
		if (unitElementName_5307Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5307Parser = parser;
		}
		return unitElementName_5307Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeFieldName_5310Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeFieldName_5310Parser() {
		if (dataTypeFieldName_5310Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeFieldName_5310Parser = parser;
		}
		return dataTypeFieldName_5310Parser;
	}

	/**
	* @generated
	*/
	private IParser dateFieldName_5311Parser;

	/**
	* @generated
	*/
	private IParser getDateFieldName_5311Parser() {
		if (dateFieldName_5311Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateFieldName_5311Parser = parser;
		}
		return dateFieldName_5311Parser;
	}

	/**
	* @generated
	*/
	private IParser detailsUnitName_5353Parser;

	/**
	* @generated
	*/
	private IParser getDetailsUnitName_5353Parser() {
		if (detailsUnitName_5353Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5353Parser = parser;
		}
		return detailsUnitName_5353Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5314Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5314Parser() {
		if (unitElementName_5314Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5314Parser = parser;
		}
		return unitElementName_5314Parser;
	}

	/**
	* @generated
	*/
	private IParser selectActionName_5313Parser;

	/**
	* @generated
	*/
	private IParser getSelectActionName_5313Parser() {
		if (selectActionName_5313Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5313Parser = parser;
		}
		return selectActionName_5313Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5349Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5349Parser() {
		if (unitAssociationName_5349Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5349Parser = parser;
		}
		return unitAssociationName_5349Parser;
	}

	/**
	* @generated
	*/
	private IParser detailsUnitName_5321Parser;

	/**
	* @generated
	*/
	private IParser getDetailsUnitName_5321Parser() {
		if (detailsUnitName_5321Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5321Parser = parser;
		}
		return detailsUnitName_5321Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5315Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5315Parser() {
		if (unitElementName_5315Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5315Parser = parser;
		}
		return unitElementName_5315Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5320Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5320Parser() {
		if (unitAssociationName_5320Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5320Parser = parser;
		}
		return unitAssociationName_5320Parser;
	}

	/**
	* @generated
	*/
	private IParser detailsUnitName_5317Parser;

	/**
	* @generated
	*/
	private IParser getDetailsUnitName_5317Parser() {
		if (detailsUnitName_5317Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5317Parser = parser;
		}
		return detailsUnitName_5317Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5316Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5316Parser() {
		if (unitElementName_5316Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5316Parser = parser;
		}
		return unitElementName_5316Parser;
	}

	/**
	* @generated
	*/
	private IParser indexUnitName_5319Parser;

	/**
	* @generated
	*/
	private IParser getIndexUnitName_5319Parser() {
		if (indexUnitName_5319Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5319Parser = parser;
		}
		return indexUnitName_5319Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5318Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5318Parser() {
		if (unitElementName_5318Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5318Parser = parser;
		}
		return unitElementName_5318Parser;
	}

	/**
	* @generated
	*/
	private IParser indexUnitName_5344Parser;

	/**
	* @generated
	*/
	private IParser getIndexUnitName_5344Parser() {
		if (indexUnitName_5344Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5344Parser = parser;
		}
		return indexUnitName_5344Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5322Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5322Parser() {
		if (unitElementName_5322Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5322Parser = parser;
		}
		return unitElementName_5322Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5341Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5341Parser() {
		if (unitAssociationName_5341Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5341Parser = parser;
		}
		return unitAssociationName_5341Parser;
	}

	/**
	* @generated
	*/
	private IParser detailsUnitName_5331Parser;

	/**
	* @generated
	*/
	private IParser getDetailsUnitName_5331Parser() {
		if (detailsUnitName_5331Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5331Parser = parser;
		}
		return detailsUnitName_5331Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5323Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5323Parser() {
		if (unitElementName_5323Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5323Parser = parser;
		}
		return unitElementName_5323Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5330Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5330Parser() {
		if (unitAssociationName_5330Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5330Parser = parser;
		}
		return unitAssociationName_5330Parser;
	}

	/**
	* @generated
	*/
	private IParser detailsUnitName_5326Parser;

	/**
	* @generated
	*/
	private IParser getDetailsUnitName_5326Parser() {
		if (detailsUnitName_5326Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5326Parser = parser;
		}
		return detailsUnitName_5326Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5324Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5324Parser() {
		if (unitElementName_5324Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5324Parser = parser;
		}
		return unitElementName_5324Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5325Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5325Parser() {
		if (unitAssociationName_5325Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5325Parser = parser;
		}
		return unitAssociationName_5325Parser;
	}

	/**
	* @generated
	*/
	private IParser indexUnitName_5329Parser;

	/**
	* @generated
	*/
	private IParser getIndexUnitName_5329Parser() {
		if (indexUnitName_5329Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5329Parser = parser;
		}
		return indexUnitName_5329Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5327Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5327Parser() {
		if (unitElementName_5327Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5327Parser = parser;
		}
		return unitElementName_5327Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5328Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5328Parser() {
		if (unitAssociationName_5328Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5328Parser = parser;
		}
		return unitAssociationName_5328Parser;
	}

	/**
	* @generated
	*/
	private IParser indexUnitName_5340Parser;

	/**
	* @generated
	*/
	private IParser getIndexUnitName_5340Parser() {
		if (indexUnitName_5340Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5340Parser = parser;
		}
		return indexUnitName_5340Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5332Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5332Parser() {
		if (unitElementName_5332Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5332Parser = parser;
		}
		return unitElementName_5332Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5339Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5339Parser() {
		if (unitAssociationName_5339Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5339Parser = parser;
		}
		return unitAssociationName_5339Parser;
	}

	/**
	* @generated
	*/
	private IParser detailsUnitName_5335Parser;

	/**
	* @generated
	*/
	private IParser getDetailsUnitName_5335Parser() {
		if (detailsUnitName_5335Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5335Parser = parser;
		}
		return detailsUnitName_5335Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5333Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5333Parser() {
		if (unitElementName_5333Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5333Parser = parser;
		}
		return unitElementName_5333Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5334Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5334Parser() {
		if (unitAssociationName_5334Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5334Parser = parser;
		}
		return unitAssociationName_5334Parser;
	}

	/**
	* @generated
	*/
	private IParser indexUnitName_5338Parser;

	/**
	* @generated
	*/
	private IParser getIndexUnitName_5338Parser() {
		if (indexUnitName_5338Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5338Parser = parser;
		}
		return indexUnitName_5338Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5336Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5336Parser() {
		if (unitElementName_5336Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5336Parser = parser;
		}
		return unitElementName_5336Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5337Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5337Parser() {
		if (unitAssociationName_5337Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5337Parser = parser;
		}
		return unitAssociationName_5337Parser;
	}

	/**
	* @generated
	*/
	private IParser selectActionName_5342Parser;

	/**
	* @generated
	*/
	private IParser getSelectActionName_5342Parser() {
		if (selectActionName_5342Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5342Parser = parser;
		}
		return selectActionName_5342Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteActionName_5343Parser;

	/**
	* @generated
	*/
	private IParser getDeleteActionName_5343Parser() {
		if (deleteActionName_5343Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteActionName_5343Parser = parser;
		}
		return deleteActionName_5343Parser;
	}

	/**
	* @generated
	*/
	private IParser imageIndexUnitName_5347Parser;

	/**
	* @generated
	*/
	private IParser getImageIndexUnitName_5347Parser() {
		if (imageIndexUnitName_5347Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imageIndexUnitName_5347Parser = parser;
		}
		return imageIndexUnitName_5347Parser;
	}

	/**
	* @generated
	*/
	private IParser selectActionName_5345Parser;

	/**
	* @generated
	*/
	private IParser getSelectActionName_5345Parser() {
		if (selectActionName_5345Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5345Parser = parser;
		}
		return selectActionName_5345Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteActionName_5346Parser;

	/**
	* @generated
	*/
	private IParser getDeleteActionName_5346Parser() {
		if (deleteActionName_5346Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteActionName_5346Parser = parser;
		}
		return deleteActionName_5346Parser;
	}

	/**
	* @generated
	*/
	private IParser featureSupportAction_3336Parser;

	/**
	* @generated
	*/
	private IParser getFeatureSupportAction_3336Parser() {
		if (featureSupportAction_3336Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			featureSupportAction_3336Parser = parser;
		}
		return featureSupportAction_3336Parser;
	}

	/**
	* @generated
	*/
	private IParser selectActionName_5348Parser;

	/**
	* @generated
	*/
	private IParser getSelectActionName_5348Parser() {
		if (selectActionName_5348Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5348Parser = parser;
		}
		return selectActionName_5348Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeFieldName_5350Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeFieldName_5350Parser() {
		if (dataTypeFieldName_5350Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeFieldName_5350Parser = parser;
		}
		return dataTypeFieldName_5350Parser;
	}

	/**
	* @generated
	*/
	private IParser dateFieldName_5351Parser;

	/**
	* @generated
	*/
	private IParser getDateFieldName_5351Parser() {
		if (dateFieldName_5351Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateFieldName_5351Parser = parser;
		}
		return dateFieldName_5351Parser;
	}

	/**
	* @generated
	*/
	private IParser unitSupportActionName_5352Parser;

	/**
	* @generated
	*/
	private IParser getUnitSupportActionName_5352Parser() {
		if (unitSupportActionName_5352Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitSupportActionName_5352Parser = parser;
		}
		return unitSupportActionName_5352Parser;
	}

	/**
	* @generated
	*/
	private IParser indexUnitName_5369Parser;

	/**
	* @generated
	*/
	private IParser getIndexUnitName_5369Parser() {
		if (indexUnitName_5369Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5369Parser = parser;
		}
		return indexUnitName_5369Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5355Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5355Parser() {
		if (unitElementName_5355Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5355Parser = parser;
		}
		return unitElementName_5355Parser;
	}

	/**
	* @generated
	*/
	private IParser selectActionName_5354Parser;

	/**
	* @generated
	*/
	private IParser getSelectActionName_5354Parser() {
		if (selectActionName_5354Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5354Parser = parser;
		}
		return selectActionName_5354Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5363Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5363Parser() {
		if (unitAssociationName_5363Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5363Parser = parser;
		}
		return unitAssociationName_5363Parser;
	}

	/**
	* @generated
	*/
	private IParser detailsUnitName_5358Parser;

	/**
	* @generated
	*/
	private IParser getDetailsUnitName_5358Parser() {
		if (detailsUnitName_5358Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5358Parser = parser;
		}
		return detailsUnitName_5358Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5356Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5356Parser() {
		if (unitElementName_5356Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5356Parser = parser;
		}
		return unitElementName_5356Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5357Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5357Parser() {
		if (unitAssociationName_5357Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5357Parser = parser;
		}
		return unitAssociationName_5357Parser;
	}

	/**
	* @generated
	*/
	private IParser indexUnitName_5361Parser;

	/**
	* @generated
	*/
	private IParser getIndexUnitName_5361Parser() {
		if (indexUnitName_5361Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5361Parser = parser;
		}
		return indexUnitName_5361Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5359Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5359Parser() {
		if (unitElementName_5359Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5359Parser = parser;
		}
		return unitElementName_5359Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5360Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5360Parser() {
		if (unitAssociationName_5360Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5360Parser = parser;
		}
		return unitAssociationName_5360Parser;
	}

	/**
	* @generated
	*/
	private IParser selectActionName_5362Parser;

	/**
	* @generated
	*/
	private IParser getSelectActionName_5362Parser() {
		if (selectActionName_5362Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5362Parser = parser;
		}
		return selectActionName_5362Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeFieldName_5364Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeFieldName_5364Parser() {
		if (dataTypeFieldName_5364Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeFieldName_5364Parser = parser;
		}
		return dataTypeFieldName_5364Parser;
	}

	/**
	* @generated
	*/
	private IParser dateFieldName_5365Parser;

	/**
	* @generated
	*/
	private IParser getDateFieldName_5365Parser() {
		if (dateFieldName_5365Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateFieldName_5365Parser = parser;
		}
		return dateFieldName_5365Parser;
	}

	/**
	* @generated
	*/
	private IParser selectActionName_5366Parser;

	/**
	* @generated
	*/
	private IParser getSelectActionName_5366Parser() {
		if (selectActionName_5366Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5366Parser = parser;
		}
		return selectActionName_5366Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteActionName_5367Parser;

	/**
	* @generated
	*/
	private IParser getDeleteActionName_5367Parser() {
		if (deleteActionName_5367Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteActionName_5367Parser = parser;
		}
		return deleteActionName_5367Parser;
	}

	/**
	* @generated
	*/
	private IParser featureSupportActionName_5368Parser;

	/**
	* @generated
	*/
	private IParser getFeatureSupportActionName_5368Parser() {
		if (featureSupportActionName_5368Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			featureSupportActionName_5368Parser = parser;
		}
		return featureSupportActionName_5368Parser;
	}

	/**
	* @generated
	*/
	private IParser mapUnitName_5370Parser;

	/**
	* @generated
	*/
	private IParser getMapUnitName_5370Parser() {
		if (mapUnitName_5370Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mapUnitName_5370Parser = parser;
		}
		return mapUnitName_5370Parser;
	}

	/**
	* @generated
	*/
	private IParser searchUnitName_5375Parser;

	/**
	* @generated
	*/
	private IParser getSearchUnitName_5375Parser() {
		if (searchUnitName_5375Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			searchUnitName_5375Parser = parser;
		}
		return searchUnitName_5375Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5371Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5371Parser() {
		if (unitElementName_5371Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5371Parser = parser;
		}
		return unitElementName_5371Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5372Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5372Parser() {
		if (unitAssociationName_5372Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5372Parser = parser;
		}
		return unitAssociationName_5372Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeFieldName_5373Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeFieldName_5373Parser() {
		if (dataTypeFieldName_5373Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeFieldName_5373Parser = parser;
		}
		return dataTypeFieldName_5373Parser;
	}

	/**
	* @generated
	*/
	private IParser dateFieldName_5374Parser;

	/**
	* @generated
	*/
	private IParser getDateFieldName_5374Parser() {
		if (dateFieldName_5374Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateFieldName_5374Parser = parser;
		}
		return dateFieldName_5374Parser;
	}

	/**
	* @generated
	*/
	private IParser staticUnitName_5376Parser;

	/**
	* @generated
	*/
	private IParser getStaticUnitName_5376Parser() {
		if (staticUnitName_5376Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			staticUnitName_5376Parser = parser;
		}
		return staticUnitName_5376Parser;
	}

	/**
	* @generated
	*/
	private IParser updateUnitName_5386Parser;

	/**
	* @generated
	*/
	private IParser getUpdateUnitName_5386Parser() {
		if (updateUnitName_5386Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateUnitName_5386Parser = parser;
		}
		return updateUnitName_5386Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5377Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5377Parser() {
		if (unitElementName_5377Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5377Parser = parser;
		}
		return unitElementName_5377Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5383Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5383Parser() {
		if (unitAssociationName_5383Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5383Parser = parser;
		}
		return unitAssociationName_5383Parser;
	}

	/**
	* @generated
	*/
	private IParser indexUnitName_5382Parser;

	/**
	* @generated
	*/
	private IParser getIndexUnitName_5382Parser() {
		if (indexUnitName_5382Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5382Parser = parser;
		}
		return indexUnitName_5382Parser;
	}

	/**
	* @generated
	*/
	private IParser unitElementName_5378Parser;

	/**
	* @generated
	*/
	private IParser getUnitElementName_5378Parser() {
		if (unitElementName_5378Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getUnitElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitElementName_5378Parser = parser;
		}
		return unitElementName_5378Parser;
	}

	/**
	* @generated
	*/
	private IParser unitAssociationName_5379Parser;

	/**
	* @generated
	*/
	private IParser getUnitAssociationName_5379Parser() {
		if (unitAssociationName_5379Parser == null) {
			EAttribute[] features = new EAttribute[] { WebuiPackage.eINSTANCE.getAssociationReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unitAssociationName_5379Parser = parser;
		}
		return unitAssociationName_5379Parser;
	}

	/**
	* @generated
	*/
	private IParser selectActionName_5380Parser;

	/**
	* @generated
	*/
	private IParser getSelectActionName_5380Parser() {
		if (selectActionName_5380Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5380Parser = parser;
		}
		return selectActionName_5380Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteActionName_5381Parser;

	/**
	* @generated
	*/
	private IParser getDeleteActionName_5381Parser() {
		if (deleteActionName_5381Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteActionName_5381Parser = parser;
		}
		return deleteActionName_5381Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeFieldName_5384Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeFieldName_5384Parser() {
		if (dataTypeFieldName_5384Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeFieldName_5384Parser = parser;
		}
		return dataTypeFieldName_5384Parser;
	}

	/**
	* @generated
	*/
	private IParser dateFieldName_5385Parser;

	/**
	* @generated
	*/
	private IParser getDateFieldName_5385Parser() {
		if (dateFieldName_5385Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateFieldName_5385Parser = parser;
		}
		return dateFieldName_5385Parser;
	}

	/**
	* @generated
	*/
	private IParser imageIndexUnitName_5389Parser;

	/**
	* @generated
	*/
	private IParser getImageIndexUnitName_5389Parser() {
		if (imageIndexUnitName_5389Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imageIndexUnitName_5389Parser = parser;
		}
		return imageIndexUnitName_5389Parser;
	}

	/**
	* @generated
	*/
	private IParser selectActionName_5387Parser;

	/**
	* @generated
	*/
	private IParser getSelectActionName_5387Parser() {
		if (selectActionName_5387Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectActionName_5387Parser = parser;
		}
		return selectActionName_5387Parser;
	}

	/**
	* @generated
	*/
	private IParser deleteActionName_5388Parser;

	/**
	* @generated
	*/
	private IParser getDeleteActionName_5388Parser() {
		if (deleteActionName_5388Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deleteActionName_5388Parser = parser;
		}
		return deleteActionName_5388Parser;
	}

	/**
	* @generated
	*/
	private IParser featureSupportAction_3377Parser;

	/**
	* @generated
	*/
	private IParser getFeatureSupportAction_3377Parser() {
		if (featureSupportAction_3377Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			featureSupportAction_3377Parser = parser;
		}
		return featureSupportAction_3377Parser;
	}

	/**
	* @generated
	*/
	private IParser sliderUnitName_5390Parser;

	/**
	* @generated
	*/
	private IParser getSliderUnitName_5390Parser() {
		if (sliderUnitName_5390Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sliderUnitName_5390Parser = parser;
		}
		return sliderUnitName_5390Parser;
	}

	/**
	* @generated
	*/
	private IParser galleryUnitName_5391Parser;

	/**
	* @generated
	*/
	private IParser getGalleryUnitName_5391Parser() {
		if (galleryUnitName_5391Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			galleryUnitName_5391Parser = parser;
		}
		return galleryUnitName_5391Parser;
	}

	/**
	* @generated
	*/
	private IParser actionMenuEntryName_5393Parser;

	/**
	* @generated
	*/
	private IParser getActionMenuEntryName_5393Parser() {
		if (actionMenuEntryName_5393Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actionMenuEntryName_5393Parser = parser;
		}
		return actionMenuEntryName_5393Parser;
	}

	/**
	* @generated
	*/
	private IParser editStaticTextMenuEntryName_5394Parser;

	/**
	* @generated
	*/
	private IParser getEditStaticTextMenuEntryName_5394Parser() {
		if (editStaticTextMenuEntryName_5394Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			editStaticTextMenuEntryName_5394Parser = parser;
		}
		return editStaticTextMenuEntryName_5394Parser;
	}

	/**
	* @generated
	*/
	private IParser serviceName_5299Parser;

	/**
	* @generated
	*/
	private IParser getServiceName_5299Parser() {
		if (serviceName_5299Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serviceName_5299Parser = parser;
		}
		return serviceName_5299Parser;
	}

	/**
	* @generated
	*/
	private IParser associationWithoutContainmentName_6005Parser;

	/**
	* @generated
	*/
	private IParser getAssociationWithoutContainmentName_6005Parser() {
		if (associationWithoutContainmentName_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationWithoutContainmentName_6005Parser = parser;
		}
		return associationWithoutContainmentName_6005Parser;
	}

	/**
	* @generated
	*/
	private IParser associationWithoutContainmentCardinalityTargetCardinality_6006Parser;

	/**
	* @generated
	*/
	private IParser getAssociationWithoutContainmentCardinalityTargetCardinality_6006Parser() {
		if (associationWithoutContainmentCardinalityTargetCardinality_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { PersistencePackage.eINSTANCE.getEntityFeature_Cardinality(),
					PersistencePackage.eINSTANCE.getAssociationWithoutContainment_TargetCardinality() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}..{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}..{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}..{1}"); //$NON-NLS-1$
			associationWithoutContainmentCardinalityTargetCardinality_6006Parser = parser;
		}
		return associationWithoutContainmentCardinalityTargetCardinality_6006Parser;
	}

	/**
	* @generated
	*/
	private IParser associationWithContainmentName_6007Parser;

	/**
	* @generated
	*/
	private IParser getAssociationWithContainmentName_6007Parser() {
		if (associationWithContainmentName_6007Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationWithContainmentName_6007Parser = parser;
		}
		return associationWithContainmentName_6007Parser;
	}

	/**
	* @generated
	*/
	private IParser associationWithContainmentCardinality_6008Parser;

	/**
	* @generated
	*/
	private IParser getAssociationWithContainmentCardinality_6008Parser() {
		if (associationWithContainmentCardinality_6008Parser == null) {
			EAttribute editableFeature = PersistencePackage.eINSTANCE.getEntityFeature_Cardinality();
			EnumParser parser = new EnumParser(editableFeature);
			associationWithContainmentCardinality_6008Parser = parser;
		}
		return associationWithContainmentCardinality_6008Parser;
	}

	/**
	* @generated
	*/
	private IParser selectionName_5297Parser;

	/**
	* @generated
	*/
	private IParser getSelectionName_5297Parser() {
		if (selectionName_5297Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectionName_5297Parser = parser;
		}
		return selectionName_5297Parser;
	}

	/**
	* @generated
	*/
	private IParser businessOperationName_5298Parser;

	/**
	* @generated
	*/
	private IParser getBusinessOperationName_5298Parser() {
		if (businessOperationName_5298Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			businessOperationName_5298Parser = parser;
		}
		return businessOperationName_5298Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WebsitePropertiesSiteTitleEditPart.VISUAL_ID:
			return getWebsitePropertiesSiteTitle_5054Parser();
		case DataTypeNameEditPart.VISUAL_ID:
			return getDataTypeName_5282Parser();
		case EnumerationTypeNameEditPart.VISUAL_ID:
			return getEnumerationTypeName_5284Parser();
		case EntityNameEditPart.VISUAL_ID:
			return getEntityName_5292Parser();
		case ViewNameEditPart.VISUAL_ID:
			return getViewName_5296Parser();
		case ServiceNameEditPart.VISUAL_ID:
			return getServiceName_5299Parser();
		case DynamicMenuNameEditPart.VISUAL_ID:
			return getDynamicMenuName_5300Parser();
		case StaticMenuNameEditPart.VISUAL_ID:
			return getStaticMenuName_5395Parser();
		case PageNameEditPart.VISUAL_ID:
			return getPageName_5392Parser();
		case EnumerationLiteralNameEditPart.VISUAL_ID:
			return getEnumerationLiteralName_5283Parser();
		case DataTypeAttributeNameEditPart.VISUAL_ID:
			return getDataTypeAttributeName_5285Parser();
		case DateAttributeNameEditPart.VISUAL_ID:
			return getDateAttributeName_5286Parser();
		case UrlAttributeNameEditPart.VISUAL_ID:
			return getUrlAttributeName_5287Parser();
		case FileAttributeNameEditPart.VISUAL_ID:
			return getFileAttributeName_5288Parser();
		case ImageAttributeNameEditPart.VISUAL_ID:
			return getImageAttributeName_5289Parser();
		case LocationAttributeNameEditPart.VISUAL_ID:
			return getLocationAttributeName_5290Parser();
		case ModelLabelNameEditPart.VISUAL_ID:
			return getModelLabelName_5291Parser();
		case ModelLabelName2EditPart.VISUAL_ID:
			return getModelLabelName_5293Parser();
		case EncapsulatedAttributeNameEditPart.VISUAL_ID:
			return getEncapsulatedAttributeName_5294Parser();
		case EncapsulatedAssociationNameEditPart.VISUAL_ID:
			return getEncapsulatedAssociationName_5295Parser();
		case SelectionNameEditPart.VISUAL_ID:
			return getSelectionName_5297Parser();
		case BusinessOperationNameEditPart.VISUAL_ID:
			return getBusinessOperationName_5298Parser();
		case ActionMenuEntryNameEditPart.VISUAL_ID:
			return getActionMenuEntryName_5393Parser();
		case EditStaticTextMenuEntryNameEditPart.VISUAL_ID:
			return getEditStaticTextMenuEntryName_5394Parser();
		case CreateUnitNameEditPart.VISUAL_ID:
			return getCreateUnitName_5305Parser();
		case UnitElementNameEditPart.VISUAL_ID:
			return getUnitElementName_5301Parser();
		case UnitAssociationNameEditPart.VISUAL_ID:
			return getUnitAssociationName_5302Parser();
		case DataTypeFieldNameEditPart.VISUAL_ID:
			return getDataTypeFieldName_5303Parser();
		case DateFieldNameEditPart.VISUAL_ID:
			return getDateFieldName_5304Parser();
		case CreateUpdateUnitNameEditPart.VISUAL_ID:
			return getCreateUpdateUnitName_5312Parser();
		case UnitElementName2EditPart.VISUAL_ID:
			return getUnitElementName_5306Parser();
		case UnitAssociationName2EditPart.VISUAL_ID:
			return getUnitAssociationName_5309Parser();
		case CreateUpdateUnitName2EditPart.VISUAL_ID:
			return getCreateUpdateUnitName_5308Parser();
		case UnitElementName3EditPart.VISUAL_ID:
			return getUnitElementName_5307Parser();
		case DataTypeFieldName2EditPart.VISUAL_ID:
			return getDataTypeFieldName_5310Parser();
		case DateFieldName2EditPart.VISUAL_ID:
			return getDateFieldName_5311Parser();
		case DetailsUnitNameEditPart.VISUAL_ID:
			return getDetailsUnitName_5353Parser();
		case UnitElementName4EditPart.VISUAL_ID:
			return getUnitElementName_5314Parser();
		case SelectActionNameEditPart.VISUAL_ID:
			return getSelectActionName_5313Parser();
		case UnitAssociationName3EditPart.VISUAL_ID:
			return getUnitAssociationName_5349Parser();
		case DetailsUnitName2EditPart.VISUAL_ID:
			return getDetailsUnitName_5321Parser();
		case UnitElementName5EditPart.VISUAL_ID:
			return getUnitElementName_5315Parser();
		case UnitAssociationName4EditPart.VISUAL_ID:
			return getUnitAssociationName_5320Parser();
		case DetailsUnitName3EditPart.VISUAL_ID:
			return getDetailsUnitName_5317Parser();
		case UnitElementName6EditPart.VISUAL_ID:
			return getUnitElementName_5316Parser();
		case IndexUnitNameEditPart.VISUAL_ID:
			return getIndexUnitName_5319Parser();
		case UnitElementName7EditPart.VISUAL_ID:
			return getUnitElementName_5318Parser();
		case IndexUnitName2EditPart.VISUAL_ID:
			return getIndexUnitName_5344Parser();
		case UnitElementName8EditPart.VISUAL_ID:
			return getUnitElementName_5322Parser();
		case UnitAssociationName5EditPart.VISUAL_ID:
			return getUnitAssociationName_5341Parser();
		case DetailsUnitName4EditPart.VISUAL_ID:
			return getDetailsUnitName_5331Parser();
		case UnitElementName9EditPart.VISUAL_ID:
			return getUnitElementName_5323Parser();
		case UnitAssociationName6EditPart.VISUAL_ID:
			return getUnitAssociationName_5330Parser();
		case DetailsUnitName5EditPart.VISUAL_ID:
			return getDetailsUnitName_5326Parser();
		case UnitElementName10EditPart.VISUAL_ID:
			return getUnitElementName_5324Parser();
		case UnitAssociationName7EditPart.VISUAL_ID:
			return getUnitAssociationName_5325Parser();
		case IndexUnitName3EditPart.VISUAL_ID:
			return getIndexUnitName_5329Parser();
		case UnitElementName11EditPart.VISUAL_ID:
			return getUnitElementName_5327Parser();
		case UnitAssociationName8EditPart.VISUAL_ID:
			return getUnitAssociationName_5328Parser();
		case IndexUnitName4EditPart.VISUAL_ID:
			return getIndexUnitName_5340Parser();
		case UnitElementName12EditPart.VISUAL_ID:
			return getUnitElementName_5332Parser();
		case UnitAssociationName9EditPart.VISUAL_ID:
			return getUnitAssociationName_5339Parser();
		case DetailsUnitName6EditPart.VISUAL_ID:
			return getDetailsUnitName_5335Parser();
		case UnitElementName13EditPart.VISUAL_ID:
			return getUnitElementName_5333Parser();
		case UnitAssociationName10EditPart.VISUAL_ID:
			return getUnitAssociationName_5334Parser();
		case IndexUnitName5EditPart.VISUAL_ID:
			return getIndexUnitName_5338Parser();
		case UnitElementName14EditPart.VISUAL_ID:
			return getUnitElementName_5336Parser();
		case UnitAssociationName11EditPart.VISUAL_ID:
			return getUnitAssociationName_5337Parser();
		case SelectActionName2EditPart.VISUAL_ID:
			return getSelectActionName_5342Parser();
		case DeleteActionNameEditPart.VISUAL_ID:
			return getDeleteActionName_5343Parser();
		case ImageIndexUnitNameEditPart.VISUAL_ID:
			return getImageIndexUnitName_5347Parser();
		case SelectActionName3EditPart.VISUAL_ID:
			return getSelectActionName_5345Parser();
		case DeleteActionName2EditPart.VISUAL_ID:
			return getDeleteActionName_5346Parser();
		case FeatureSupportActionEditPart.VISUAL_ID:
			return getFeatureSupportAction_3336Parser();
		case SelectActionName4EditPart.VISUAL_ID:
			return getSelectActionName_5348Parser();
		case DataTypeFieldName3EditPart.VISUAL_ID:
			return getDataTypeFieldName_5350Parser();
		case DateFieldName3EditPart.VISUAL_ID:
			return getDateFieldName_5351Parser();
		case UnitSupportActionNameEditPart.VISUAL_ID:
			return getUnitSupportActionName_5352Parser();
		case IndexUnitName6EditPart.VISUAL_ID:
			return getIndexUnitName_5369Parser();
		case UnitElementName15EditPart.VISUAL_ID:
			return getUnitElementName_5355Parser();
		case SelectActionName5EditPart.VISUAL_ID:
			return getSelectActionName_5354Parser();
		case UnitAssociationName12EditPart.VISUAL_ID:
			return getUnitAssociationName_5363Parser();
		case DetailsUnitName7EditPart.VISUAL_ID:
			return getDetailsUnitName_5358Parser();
		case UnitElementName16EditPart.VISUAL_ID:
			return getUnitElementName_5356Parser();
		case UnitAssociationName13EditPart.VISUAL_ID:
			return getUnitAssociationName_5357Parser();
		case IndexUnitName7EditPart.VISUAL_ID:
			return getIndexUnitName_5361Parser();
		case UnitElementName17EditPart.VISUAL_ID:
			return getUnitElementName_5359Parser();
		case UnitAssociationName14EditPart.VISUAL_ID:
			return getUnitAssociationName_5360Parser();
		case SelectActionName6EditPart.VISUAL_ID:
			return getSelectActionName_5362Parser();
		case DataTypeFieldName4EditPart.VISUAL_ID:
			return getDataTypeFieldName_5364Parser();
		case DateFieldName4EditPart.VISUAL_ID:
			return getDateFieldName_5365Parser();
		case SelectActionName7EditPart.VISUAL_ID:
			return getSelectActionName_5366Parser();
		case DeleteActionName3EditPart.VISUAL_ID:
			return getDeleteActionName_5367Parser();
		case FeatureSupportActionNameEditPart.VISUAL_ID:
			return getFeatureSupportActionName_5368Parser();
		case MapUnitNameEditPart.VISUAL_ID:
			return getMapUnitName_5370Parser();
		case SearchUnitNameEditPart.VISUAL_ID:
			return getSearchUnitName_5375Parser();
		case UnitElementName18EditPart.VISUAL_ID:
			return getUnitElementName_5371Parser();
		case UnitAssociationName15EditPart.VISUAL_ID:
			return getUnitAssociationName_5372Parser();
		case DataTypeFieldName5EditPart.VISUAL_ID:
			return getDataTypeFieldName_5373Parser();
		case DateFieldName5EditPart.VISUAL_ID:
			return getDateFieldName_5374Parser();
		case StaticUnitNameEditPart.VISUAL_ID:
			return getStaticUnitName_5376Parser();
		case UpdateUnitNameEditPart.VISUAL_ID:
			return getUpdateUnitName_5386Parser();
		case UnitElementName19EditPart.VISUAL_ID:
			return getUnitElementName_5377Parser();
		case UnitAssociationName16EditPart.VISUAL_ID:
			return getUnitAssociationName_5383Parser();
		case IndexUnitName8EditPart.VISUAL_ID:
			return getIndexUnitName_5382Parser();
		case UnitElementName20EditPart.VISUAL_ID:
			return getUnitElementName_5378Parser();
		case UnitAssociationName17EditPart.VISUAL_ID:
			return getUnitAssociationName_5379Parser();
		case SelectActionName8EditPart.VISUAL_ID:
			return getSelectActionName_5380Parser();
		case DeleteActionName4EditPart.VISUAL_ID:
			return getDeleteActionName_5381Parser();
		case DataTypeFieldName6EditPart.VISUAL_ID:
			return getDataTypeFieldName_5384Parser();
		case DateFieldName6EditPart.VISUAL_ID:
			return getDateFieldName_5385Parser();
		case ImageIndexUnitName2EditPart.VISUAL_ID:
			return getImageIndexUnitName_5389Parser();
		case SelectActionName9EditPart.VISUAL_ID:
			return getSelectActionName_5387Parser();
		case DeleteActionName5EditPart.VISUAL_ID:
			return getDeleteActionName_5388Parser();
		case FeatureSupportAction3EditPart.VISUAL_ID:
			return getFeatureSupportAction_3377Parser();
		case SliderUnitNameEditPart.VISUAL_ID:
			return getSliderUnitName_5390Parser();
		case GalleryUnitNameEditPart.VISUAL_ID:
			return getGalleryUnitName_5391Parser();
		case AssociationWithoutContainmentNameEditPart.VISUAL_ID:
			return getAssociationWithoutContainmentName_6005Parser();
		case AssociationWithoutContainmentCardinalityTargetCardinEditPart.VISUAL_ID:
			return getAssociationWithoutContainmentCardinalityTargetCardinality_6006Parser();
		case AssociationWithContainmentNameEditPart.VISUAL_ID:
			return getAssociationWithContainmentName_6007Parser();

		case AssociationWithContainmentCardinalityEditPart.VISUAL_ID:
			return getAssociationWithContainmentCardinality_6008Parser();
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
