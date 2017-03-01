package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry;

/**
 * @generated
 */
public class WebsiteEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (WebsiteVisualIDRegistry.getVisualID(view)) {

			case WebGenModelEditPart.VISUAL_ID:
				return new WebGenModelEditPart(view);

			case WebsitePropertiesEditPart.VISUAL_ID:
				return new WebsitePropertiesEditPart(view);

			case WebsitePropertiesSiteTitleEditPart.VISUAL_ID:
				return new WebsitePropertiesSiteTitleEditPart(view);

			case DataTypeEditPart.VISUAL_ID:
				return new DataTypeEditPart(view);

			case DataTypeNameEditPart.VISUAL_ID:
				return new DataTypeNameEditPart(view);

			case DynamicMenuEditPart.VISUAL_ID:
				return new DynamicMenuEditPart(view);

			case DynamicMenuNameEditPart.VISUAL_ID:
				return new DynamicMenuNameEditPart(view);

			case EnumerationTypeEditPart.VISUAL_ID:
				return new EnumerationTypeEditPart(view);

			case EnumerationTypeNameEditPart.VISUAL_ID:
				return new EnumerationTypeNameEditPart(view);

			case EntityEditPart.VISUAL_ID:
				return new EntityEditPart(view);

			case EntityNameEditPart.VISUAL_ID:
				return new EntityNameEditPart(view);

			case ViewEditPart.VISUAL_ID:
				return new ViewEditPart(view);

			case ViewNameEditPart.VISUAL_ID:
				return new ViewNameEditPart(view);

			case PageEditPart.VISUAL_ID:
				return new PageEditPart(view);

			case PageNameEditPart.VISUAL_ID:
				return new PageNameEditPart(view);

			case StaticMenuEditPart.VISUAL_ID:
				return new StaticMenuEditPart(view);

			case StaticMenuNameEditPart.VISUAL_ID:
				return new StaticMenuNameEditPart(view);

			case ServiceEditPart.VISUAL_ID:
				return new ServiceEditPart(view);

			case ServiceNameEditPart.VISUAL_ID:
				return new ServiceNameEditPart(view);

			case CasAuthenticationEditPart.VISUAL_ID:
				return new CasAuthenticationEditPart(view);

			case LocalAuthenticationSystemEditPart.VISUAL_ID:
				return new LocalAuthenticationSystemEditPart(view);

			case EnumerationLiteralEditPart.VISUAL_ID:
				return new EnumerationLiteralEditPart(view);

			case EnumerationLiteralNameEditPart.VISUAL_ID:
				return new EnumerationLiteralNameEditPart(view);

			case DataTypeAttributeEditPart.VISUAL_ID:
				return new DataTypeAttributeEditPart(view);

			case DataTypeAttributeNameEditPart.VISUAL_ID:
				return new DataTypeAttributeNameEditPart(view);

			case DateAttributeEditPart.VISUAL_ID:
				return new DateAttributeEditPart(view);

			case DateAttributeNameEditPart.VISUAL_ID:
				return new DateAttributeNameEditPart(view);

			case UrlAttributeEditPart.VISUAL_ID:
				return new UrlAttributeEditPart(view);

			case UrlAttributeNameEditPart.VISUAL_ID:
				return new UrlAttributeNameEditPart(view);

			case FileAttributeEditPart.VISUAL_ID:
				return new FileAttributeEditPart(view);

			case FileAttributeNameEditPart.VISUAL_ID:
				return new FileAttributeNameEditPart(view);

			case ImageAttributeEditPart.VISUAL_ID:
				return new ImageAttributeEditPart(view);

			case ImageAttributeNameEditPart.VISUAL_ID:
				return new ImageAttributeNameEditPart(view);

			case LocationAttributeEditPart.VISUAL_ID:
				return new LocationAttributeEditPart(view);

			case LocationAttributeNameEditPart.VISUAL_ID:
				return new LocationAttributeNameEditPart(view);

			case ModelLabelEditPart.VISUAL_ID:
				return new ModelLabelEditPart(view);

			case ModelLabelNameEditPart.VISUAL_ID:
				return new ModelLabelNameEditPart(view);

			case ModelLabel2EditPart.VISUAL_ID:
				return new ModelLabel2EditPart(view);

			case ModelLabelName2EditPart.VISUAL_ID:
				return new ModelLabelName2EditPart(view);

			case EncapsulatedAttributeEditPart.VISUAL_ID:
				return new EncapsulatedAttributeEditPart(view);

			case EncapsulatedAttributeNameEditPart.VISUAL_ID:
				return new EncapsulatedAttributeNameEditPart(view);

			case EncapsulatedAssociationEditPart.VISUAL_ID:
				return new EncapsulatedAssociationEditPart(view);

			case EncapsulatedAssociationNameEditPart.VISUAL_ID:
				return new EncapsulatedAssociationNameEditPart(view);

			case CreateUnitEditPart.VISUAL_ID:
				return new CreateUnitEditPart(view);

			case CreateUnitNameEditPart.VISUAL_ID:
				return new CreateUnitNameEditPart(view);

			case UnitElementEditPart.VISUAL_ID:
				return new UnitElementEditPart(view);

			case UnitElementNameEditPart.VISUAL_ID:
				return new UnitElementNameEditPart(view);

			case UnitAssociationEditPart.VISUAL_ID:
				return new UnitAssociationEditPart(view);

			case UnitAssociationNameEditPart.VISUAL_ID:
				return new UnitAssociationNameEditPart(view);

			case DataTypeFieldEditPart.VISUAL_ID:
				return new DataTypeFieldEditPart(view);

			case DataTypeFieldNameEditPart.VISUAL_ID:
				return new DataTypeFieldNameEditPart(view);

			case DateFieldEditPart.VISUAL_ID:
				return new DateFieldEditPart(view);

			case DateFieldNameEditPart.VISUAL_ID:
				return new DateFieldNameEditPart(view);

			case CreateUpdateUnitEditPart.VISUAL_ID:
				return new CreateUpdateUnitEditPart(view);

			case CreateUpdateUnitNameEditPart.VISUAL_ID:
				return new CreateUpdateUnitNameEditPart(view);

			case UnitElement2EditPart.VISUAL_ID:
				return new UnitElement2EditPart(view);

			case UnitElementName2EditPart.VISUAL_ID:
				return new UnitElementName2EditPart(view);

			case UnitAssociation2EditPart.VISUAL_ID:
				return new UnitAssociation2EditPart(view);

			case UnitAssociationName2EditPart.VISUAL_ID:
				return new UnitAssociationName2EditPart(view);

			case CreateUpdateUnit2EditPart.VISUAL_ID:
				return new CreateUpdateUnit2EditPart(view);

			case CreateUpdateUnitName2EditPart.VISUAL_ID:
				return new CreateUpdateUnitName2EditPart(view);

			case UnitElement3EditPart.VISUAL_ID:
				return new UnitElement3EditPart(view);

			case UnitElementName3EditPart.VISUAL_ID:
				return new UnitElementName3EditPart(view);

			case DataTypeField2EditPart.VISUAL_ID:
				return new DataTypeField2EditPart(view);

			case DataTypeFieldName2EditPart.VISUAL_ID:
				return new DataTypeFieldName2EditPart(view);

			case DateField2EditPart.VISUAL_ID:
				return new DateField2EditPart(view);

			case DateFieldName2EditPart.VISUAL_ID:
				return new DateFieldName2EditPart(view);

			case CreateSitemapUnitEditPart.VISUAL_ID:
				return new CreateSitemapUnitEditPart(view);

			case DetailsUnitEditPart.VISUAL_ID:
				return new DetailsUnitEditPart(view);

			case DetailsUnitNameEditPart.VISUAL_ID:
				return new DetailsUnitNameEditPart(view);

			case UnitElement4EditPart.VISUAL_ID:
				return new UnitElement4EditPart(view);

			case UnitElementName4EditPart.VISUAL_ID:
				return new UnitElementName4EditPart(view);

			case SelectActionEditPart.VISUAL_ID:
				return new SelectActionEditPart(view);

			case SelectActionNameEditPart.VISUAL_ID:
				return new SelectActionNameEditPart(view);

			case UnitAssociation3EditPart.VISUAL_ID:
				return new UnitAssociation3EditPart(view);

			case UnitAssociationName3EditPart.VISUAL_ID:
				return new UnitAssociationName3EditPart(view);

			case DetailsUnit2EditPart.VISUAL_ID:
				return new DetailsUnit2EditPart(view);

			case DetailsUnitName2EditPart.VISUAL_ID:
				return new DetailsUnitName2EditPart(view);

			case UnitElement5EditPart.VISUAL_ID:
				return new UnitElement5EditPart(view);

			case UnitElementName5EditPart.VISUAL_ID:
				return new UnitElementName5EditPart(view);

			case UnitAssociation4EditPart.VISUAL_ID:
				return new UnitAssociation4EditPart(view);

			case UnitAssociationName4EditPart.VISUAL_ID:
				return new UnitAssociationName4EditPart(view);

			case DetailsUnit3EditPart.VISUAL_ID:
				return new DetailsUnit3EditPart(view);

			case DetailsUnitName3EditPart.VISUAL_ID:
				return new DetailsUnitName3EditPart(view);

			case UnitElement6EditPart.VISUAL_ID:
				return new UnitElement6EditPart(view);

			case UnitElementName6EditPart.VISUAL_ID:
				return new UnitElementName6EditPart(view);

			case IndexUnitEditPart.VISUAL_ID:
				return new IndexUnitEditPart(view);

			case IndexUnitNameEditPart.VISUAL_ID:
				return new IndexUnitNameEditPart(view);

			case UnitElement7EditPart.VISUAL_ID:
				return new UnitElement7EditPart(view);

			case UnitElementName7EditPart.VISUAL_ID:
				return new UnitElementName7EditPart(view);

			case IndexUnit2EditPart.VISUAL_ID:
				return new IndexUnit2EditPart(view);

			case IndexUnitName2EditPart.VISUAL_ID:
				return new IndexUnitName2EditPart(view);

			case UnitElement8EditPart.VISUAL_ID:
				return new UnitElement8EditPart(view);

			case UnitElementName8EditPart.VISUAL_ID:
				return new UnitElementName8EditPart(view);

			case UnitAssociation5EditPart.VISUAL_ID:
				return new UnitAssociation5EditPart(view);

			case UnitAssociationName5EditPart.VISUAL_ID:
				return new UnitAssociationName5EditPart(view);

			case DetailsUnit4EditPart.VISUAL_ID:
				return new DetailsUnit4EditPart(view);

			case DetailsUnitName4EditPart.VISUAL_ID:
				return new DetailsUnitName4EditPart(view);

			case UnitElement9EditPart.VISUAL_ID:
				return new UnitElement9EditPart(view);

			case UnitElementName9EditPart.VISUAL_ID:
				return new UnitElementName9EditPart(view);

			case UnitAssociation6EditPart.VISUAL_ID:
				return new UnitAssociation6EditPart(view);

			case UnitAssociationName6EditPart.VISUAL_ID:
				return new UnitAssociationName6EditPart(view);

			case DetailsUnit5EditPart.VISUAL_ID:
				return new DetailsUnit5EditPart(view);

			case DetailsUnitName5EditPart.VISUAL_ID:
				return new DetailsUnitName5EditPart(view);

			case UnitElement10EditPart.VISUAL_ID:
				return new UnitElement10EditPart(view);

			case UnitElementName10EditPart.VISUAL_ID:
				return new UnitElementName10EditPart(view);

			case UnitAssociation7EditPart.VISUAL_ID:
				return new UnitAssociation7EditPart(view);

			case UnitAssociationName7EditPart.VISUAL_ID:
				return new UnitAssociationName7EditPart(view);

			case IndexUnit3EditPart.VISUAL_ID:
				return new IndexUnit3EditPart(view);

			case IndexUnitName3EditPart.VISUAL_ID:
				return new IndexUnitName3EditPart(view);

			case UnitElement11EditPart.VISUAL_ID:
				return new UnitElement11EditPart(view);

			case UnitElementName11EditPart.VISUAL_ID:
				return new UnitElementName11EditPart(view);

			case UnitAssociation8EditPart.VISUAL_ID:
				return new UnitAssociation8EditPart(view);

			case UnitAssociationName8EditPart.VISUAL_ID:
				return new UnitAssociationName8EditPart(view);

			case IndexUnit4EditPart.VISUAL_ID:
				return new IndexUnit4EditPart(view);

			case IndexUnitName4EditPart.VISUAL_ID:
				return new IndexUnitName4EditPart(view);

			case UnitElement12EditPart.VISUAL_ID:
				return new UnitElement12EditPart(view);

			case UnitElementName12EditPart.VISUAL_ID:
				return new UnitElementName12EditPart(view);

			case UnitAssociation9EditPart.VISUAL_ID:
				return new UnitAssociation9EditPart(view);

			case UnitAssociationName9EditPart.VISUAL_ID:
				return new UnitAssociationName9EditPart(view);

			case DetailsUnit6EditPart.VISUAL_ID:
				return new DetailsUnit6EditPart(view);

			case DetailsUnitName6EditPart.VISUAL_ID:
				return new DetailsUnitName6EditPart(view);

			case UnitElement13EditPart.VISUAL_ID:
				return new UnitElement13EditPart(view);

			case UnitElementName13EditPart.VISUAL_ID:
				return new UnitElementName13EditPart(view);

			case UnitAssociation10EditPart.VISUAL_ID:
				return new UnitAssociation10EditPart(view);

			case UnitAssociationName10EditPart.VISUAL_ID:
				return new UnitAssociationName10EditPart(view);

			case IndexUnit5EditPart.VISUAL_ID:
				return new IndexUnit5EditPart(view);

			case IndexUnitName5EditPart.VISUAL_ID:
				return new IndexUnitName5EditPart(view);

			case UnitElement14EditPart.VISUAL_ID:
				return new UnitElement14EditPart(view);

			case UnitElementName14EditPart.VISUAL_ID:
				return new UnitElementName14EditPart(view);

			case UnitAssociation11EditPart.VISUAL_ID:
				return new UnitAssociation11EditPart(view);

			case UnitAssociationName11EditPart.VISUAL_ID:
				return new UnitAssociationName11EditPart(view);

			case SelectAction2EditPart.VISUAL_ID:
				return new SelectAction2EditPart(view);

			case SelectActionName2EditPart.VISUAL_ID:
				return new SelectActionName2EditPart(view);

			case DeleteActionEditPart.VISUAL_ID:
				return new DeleteActionEditPart(view);

			case DeleteActionNameEditPart.VISUAL_ID:
				return new DeleteActionNameEditPart(view);

			case ImageIndexUnitEditPart.VISUAL_ID:
				return new ImageIndexUnitEditPart(view);

			case ImageIndexUnitNameEditPart.VISUAL_ID:
				return new ImageIndexUnitNameEditPart(view);

			case SelectAction3EditPart.VISUAL_ID:
				return new SelectAction3EditPart(view);

			case SelectActionName3EditPart.VISUAL_ID:
				return new SelectActionName3EditPart(view);

			case DeleteAction2EditPart.VISUAL_ID:
				return new DeleteAction2EditPart(view);

			case DeleteActionName2EditPart.VISUAL_ID:
				return new DeleteActionName2EditPart(view);

			case FeatureSupportActionEditPart.VISUAL_ID:
				return new FeatureSupportActionEditPart(view);

			case SelectAction4EditPart.VISUAL_ID:
				return new SelectAction4EditPart(view);

			case SelectActionName4EditPart.VISUAL_ID:
				return new SelectActionName4EditPart(view);

			case DataTypeField3EditPart.VISUAL_ID:
				return new DataTypeField3EditPart(view);

			case DataTypeFieldName3EditPart.VISUAL_ID:
				return new DataTypeFieldName3EditPart(view);

			case DateField3EditPart.VISUAL_ID:
				return new DateField3EditPart(view);

			case DateFieldName3EditPart.VISUAL_ID:
				return new DateFieldName3EditPart(view);

			case UnitSupportActionEditPart.VISUAL_ID:
				return new UnitSupportActionEditPart(view);

			case UnitSupportActionNameEditPart.VISUAL_ID:
				return new UnitSupportActionNameEditPart(view);

			case IndexUnit6EditPart.VISUAL_ID:
				return new IndexUnit6EditPart(view);

			case IndexUnitName6EditPart.VISUAL_ID:
				return new IndexUnitName6EditPart(view);

			case UnitElement15EditPart.VISUAL_ID:
				return new UnitElement15EditPart(view);

			case UnitElementName15EditPart.VISUAL_ID:
				return new UnitElementName15EditPart(view);

			case SelectAction5EditPart.VISUAL_ID:
				return new SelectAction5EditPart(view);

			case SelectActionName5EditPart.VISUAL_ID:
				return new SelectActionName5EditPart(view);

			case UnitAssociation12EditPart.VISUAL_ID:
				return new UnitAssociation12EditPart(view);

			case UnitAssociationName12EditPart.VISUAL_ID:
				return new UnitAssociationName12EditPart(view);

			case DetailsUnit7EditPart.VISUAL_ID:
				return new DetailsUnit7EditPart(view);

			case DetailsUnitName7EditPart.VISUAL_ID:
				return new DetailsUnitName7EditPart(view);

			case UnitElement16EditPart.VISUAL_ID:
				return new UnitElement16EditPart(view);

			case UnitElementName16EditPart.VISUAL_ID:
				return new UnitElementName16EditPart(view);

			case UnitAssociation13EditPart.VISUAL_ID:
				return new UnitAssociation13EditPart(view);

			case UnitAssociationName13EditPart.VISUAL_ID:
				return new UnitAssociationName13EditPart(view);

			case IndexUnit7EditPart.VISUAL_ID:
				return new IndexUnit7EditPart(view);

			case IndexUnitName7EditPart.VISUAL_ID:
				return new IndexUnitName7EditPart(view);

			case UnitElement17EditPart.VISUAL_ID:
				return new UnitElement17EditPart(view);

			case UnitElementName17EditPart.VISUAL_ID:
				return new UnitElementName17EditPart(view);

			case UnitAssociation14EditPart.VISUAL_ID:
				return new UnitAssociation14EditPart(view);

			case UnitAssociationName14EditPart.VISUAL_ID:
				return new UnitAssociationName14EditPart(view);

			case SelectAction6EditPart.VISUAL_ID:
				return new SelectAction6EditPart(view);

			case SelectActionName6EditPart.VISUAL_ID:
				return new SelectActionName6EditPart(view);

			case DataTypeField4EditPart.VISUAL_ID:
				return new DataTypeField4EditPart(view);

			case DataTypeFieldName4EditPart.VISUAL_ID:
				return new DataTypeFieldName4EditPart(view);

			case DateField4EditPart.VISUAL_ID:
				return new DateField4EditPart(view);

			case DateFieldName4EditPart.VISUAL_ID:
				return new DateFieldName4EditPart(view);

			case SelectAction7EditPart.VISUAL_ID:
				return new SelectAction7EditPart(view);

			case SelectActionName7EditPart.VISUAL_ID:
				return new SelectActionName7EditPart(view);

			case DeleteAction3EditPart.VISUAL_ID:
				return new DeleteAction3EditPart(view);

			case DeleteActionName3EditPart.VISUAL_ID:
				return new DeleteActionName3EditPart(view);

			case FeatureSupportAction2EditPart.VISUAL_ID:
				return new FeatureSupportAction2EditPart(view);

			case FeatureSupportActionName2EditPart.VISUAL_ID:
				return new FeatureSupportActionName2EditPart(view);

			case MapUnitEditPart.VISUAL_ID:
				return new MapUnitEditPart(view);

			case MapUnitNameEditPart.VISUAL_ID:
				return new MapUnitNameEditPart(view);

			case SearchUnitEditPart.VISUAL_ID:
				return new SearchUnitEditPart(view);

			case SearchUnitNameEditPart.VISUAL_ID:
				return new SearchUnitNameEditPart(view);

			case UnitElement18EditPart.VISUAL_ID:
				return new UnitElement18EditPart(view);

			case UnitElementName18EditPart.VISUAL_ID:
				return new UnitElementName18EditPart(view);

			case UnitAssociation15EditPart.VISUAL_ID:
				return new UnitAssociation15EditPart(view);

			case UnitAssociationName15EditPart.VISUAL_ID:
				return new UnitAssociationName15EditPart(view);

			case DataTypeField5EditPart.VISUAL_ID:
				return new DataTypeField5EditPart(view);

			case DataTypeFieldName5EditPart.VISUAL_ID:
				return new DataTypeFieldName5EditPart(view);

			case DateField5EditPart.VISUAL_ID:
				return new DateField5EditPart(view);

			case DateFieldName5EditPart.VISUAL_ID:
				return new DateFieldName5EditPart(view);

			case StaticUnitEditPart.VISUAL_ID:
				return new StaticUnitEditPart(view);

			case StaticUnitNameEditPart.VISUAL_ID:
				return new StaticUnitNameEditPart(view);

			case UpdateUnitEditPart.VISUAL_ID:
				return new UpdateUnitEditPart(view);

			case UpdateUnitNameEditPart.VISUAL_ID:
				return new UpdateUnitNameEditPart(view);

			case UnitElement19EditPart.VISUAL_ID:
				return new UnitElement19EditPart(view);

			case UnitElementName19EditPart.VISUAL_ID:
				return new UnitElementName19EditPart(view);

			case UnitAssociation16EditPart.VISUAL_ID:
				return new UnitAssociation16EditPart(view);

			case UnitAssociationName16EditPart.VISUAL_ID:
				return new UnitAssociationName16EditPart(view);

			case IndexUnit8EditPart.VISUAL_ID:
				return new IndexUnit8EditPart(view);

			case IndexUnitName8EditPart.VISUAL_ID:
				return new IndexUnitName8EditPart(view);

			case UnitElement20EditPart.VISUAL_ID:
				return new UnitElement20EditPart(view);

			case UnitElementName20EditPart.VISUAL_ID:
				return new UnitElementName20EditPart(view);

			case UnitAssociation17EditPart.VISUAL_ID:
				return new UnitAssociation17EditPart(view);

			case UnitAssociationName17EditPart.VISUAL_ID:
				return new UnitAssociationName17EditPart(view);

			case SelectAction8EditPart.VISUAL_ID:
				return new SelectAction8EditPart(view);

			case SelectActionName8EditPart.VISUAL_ID:
				return new SelectActionName8EditPart(view);

			case DeleteAction4EditPart.VISUAL_ID:
				return new DeleteAction4EditPart(view);

			case DeleteActionName4EditPart.VISUAL_ID:
				return new DeleteActionName4EditPart(view);

			case DataTypeField6EditPart.VISUAL_ID:
				return new DataTypeField6EditPart(view);

			case DataTypeFieldName6EditPart.VISUAL_ID:
				return new DataTypeFieldName6EditPart(view);

			case DateField6EditPart.VISUAL_ID:
				return new DateField6EditPart(view);

			case DateFieldName6EditPart.VISUAL_ID:
				return new DateFieldName6EditPart(view);

			case ImageIndexUnit2EditPart.VISUAL_ID:
				return new ImageIndexUnit2EditPart(view);

			case ImageIndexUnitName2EditPart.VISUAL_ID:
				return new ImageIndexUnitName2EditPart(view);

			case SelectAction9EditPart.VISUAL_ID:
				return new SelectAction9EditPart(view);

			case SelectActionName9EditPart.VISUAL_ID:
				return new SelectActionName9EditPart(view);

			case DeleteAction5EditPart.VISUAL_ID:
				return new DeleteAction5EditPart(view);

			case DeleteActionName5EditPart.VISUAL_ID:
				return new DeleteActionName5EditPart(view);

			case FeatureSupportAction3EditPart.VISUAL_ID:
				return new FeatureSupportAction3EditPart(view);

			case SliderUnitEditPart.VISUAL_ID:
				return new SliderUnitEditPart(view);

			case SliderUnitNameEditPart.VISUAL_ID:
				return new SliderUnitNameEditPart(view);

			case GalleryUnitEditPart.VISUAL_ID:
				return new GalleryUnitEditPart(view);

			case GalleryUnitNameEditPart.VISUAL_ID:
				return new GalleryUnitNameEditPart(view);

			case ActionMenuEntryEditPart.VISUAL_ID:
				return new ActionMenuEntryEditPart(view);

			case ActionMenuEntryNameEditPart.VISUAL_ID:
				return new ActionMenuEntryNameEditPart(view);

			case EditStaticTextMenuEntryEditPart.VISUAL_ID:
				return new EditStaticTextMenuEntryEditPart(view);

			case EditStaticTextMenuEntryNameEditPart.VISUAL_ID:
				return new EditStaticTextMenuEntryNameEditPart(view);

			case SelectionEditPart.VISUAL_ID:
				return new SelectionEditPart(view);

			case SelectionNameEditPart.VISUAL_ID:
				return new SelectionNameEditPart(view);

			case BusinessOperationEditPart.VISUAL_ID:
				return new BusinessOperationEditPart(view);

			case BusinessOperationNameEditPart.VISUAL_ID:
				return new BusinessOperationNameEditPart(view);

			case WebsitePropertiesAuthenticationCompartmentEditPart.VISUAL_ID:
				return new WebsitePropertiesAuthenticationCompartmentEditPart(view);

			case DynamicMenuUnitFieldCompartmentEditPart.VISUAL_ID:
				return new DynamicMenuUnitFieldCompartmentEditPart(view);

			case EnumerationTypeEnumerationsCompartmentEditPart.VISUAL_ID:
				return new EnumerationTypeEnumerationsCompartmentEditPart(view);

			case EntityAttributeCompartmentEditPart.VISUAL_ID:
				return new EntityAttributeCompartmentEditPart(view);

			case EntityModelLabelsCompartmentEditPart.VISUAL_ID:
				return new EntityModelLabelsCompartmentEditPart(view);

			case ViewAttributeCompartmentEditPart.VISUAL_ID:
				return new ViewAttributeCompartmentEditPart(view);

			case ViewModelLabelsCompartmentEditPart.VISUAL_ID:
				return new ViewModelLabelsCompartmentEditPart(view);

			case PageInterfaceUnitCompartmentEditPart.VISUAL_ID:
				return new PageInterfaceUnitCompartmentEditPart(view);

			case CreateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
				return new CreateUnitUnitFieldCompartmentEditPart(view);

			case CreateUpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
				return new CreateUpdateUnitUnitFieldCompartmentEditPart(view);

			case UnitAssociationInterfaceUnitsCompartment5EditPart.VISUAL_ID:
				return new UnitAssociationInterfaceUnitsCompartment5EditPart(view);

			case CreateUpdateUnitUnitFieldCompartment2EditPart.VISUAL_ID:
				return new CreateUpdateUnitUnitFieldCompartment2EditPart(view);

			case DetailsUnitUnitFieldCompartmentEditPart.VISUAL_ID:
				return new DetailsUnitUnitFieldCompartmentEditPart(view);

			case DetailsUnitActionCompartmentEditPart.VISUAL_ID:
				return new DetailsUnitActionCompartmentEditPart(view);

			case UnitElementActionCompartmentEditPart.VISUAL_ID:
				return new UnitElementActionCompartmentEditPart(view);

			case UnitAssociationInterfaceUnitsCompartmentEditPart.VISUAL_ID:
				return new UnitAssociationInterfaceUnitsCompartmentEditPart(view);

			case UnitAssociationActionCompartmentEditPart.VISUAL_ID:
				return new UnitAssociationActionCompartmentEditPart(view);

			case DetailsUnitUnitFieldCompartment2EditPart.VISUAL_ID:
				return new DetailsUnitUnitFieldCompartment2EditPart(view);

			case UnitAssociationInterfaceUnitCompartmentEditPart.VISUAL_ID:
				return new UnitAssociationInterfaceUnitCompartmentEditPart(view);

			case DetailsUnitUnitFieldCompartment3EditPart.VISUAL_ID:
				return new DetailsUnitUnitFieldCompartment3EditPart(view);

			case IndexUnitUnitFieldCompartmentEditPart.VISUAL_ID:
				return new IndexUnitUnitFieldCompartmentEditPart(view);

			case IndexUnitUnitFieldCompartment2EditPart.VISUAL_ID:
				return new IndexUnitUnitFieldCompartment2EditPart(view);

			case IndexUnitActionCompartment3EditPart.VISUAL_ID:
				return new IndexUnitActionCompartment3EditPart(view);

			case UnitAssociationInterfaceUnitCompartment2EditPart.VISUAL_ID:
				return new UnitAssociationInterfaceUnitCompartment2EditPart(view);

			case DetailsUnitUnitFieldCompartment4EditPart.VISUAL_ID:
				return new DetailsUnitUnitFieldCompartment4EditPart(view);

			case UnitAssociationInterfaceUnitCompartment3EditPart.VISUAL_ID:
				return new UnitAssociationInterfaceUnitCompartment3EditPart(view);

			case DetailsUnitUnitFieldCompartment5EditPart.VISUAL_ID:
				return new DetailsUnitUnitFieldCompartment5EditPart(view);

			case IndexUnitUnitFieldCompartment3EditPart.VISUAL_ID:
				return new IndexUnitUnitFieldCompartment3EditPart(view);

			case IndexUnitUnitFieldCompartment4EditPart.VISUAL_ID:
				return new IndexUnitUnitFieldCompartment4EditPart(view);

			case UnitAssociationInterfaceUnitsCompartment2EditPart.VISUAL_ID:
				return new UnitAssociationInterfaceUnitsCompartment2EditPart(view);

			case DetailsUnitUnitFieldCompartment6EditPart.VISUAL_ID:
				return new DetailsUnitUnitFieldCompartment6EditPart(view);

			case IndexUnitUnitFieldCompartment5EditPart.VISUAL_ID:
				return new IndexUnitUnitFieldCompartment5EditPart(view);

			case ImageIndexUnitActionCompartmentEditPart.VISUAL_ID:
				return new ImageIndexUnitActionCompartmentEditPart(view);

			case IndexUnitUnitFieldCompartment6EditPart.VISUAL_ID:
				return new IndexUnitUnitFieldCompartment6EditPart(view);

			case IndexUnitActionCompartmentEditPart.VISUAL_ID:
				return new IndexUnitActionCompartmentEditPart(view);

			case UnitElementActionCompartment2EditPart.VISUAL_ID:
				return new UnitElementActionCompartment2EditPart(view);

			case UnitAssociationInterfaceUnitsCompartment3EditPart.VISUAL_ID:
				return new UnitAssociationInterfaceUnitsCompartment3EditPart(view);

			case UnitAssociationActionCompartment2EditPart.VISUAL_ID:
				return new UnitAssociationActionCompartment2EditPart(view);

			case DetailsUnitUnitFieldCompartment7EditPart.VISUAL_ID:
				return new DetailsUnitUnitFieldCompartment7EditPart(view);

			case IndexUnitUnitFieldCompartment7EditPart.VISUAL_ID:
				return new IndexUnitUnitFieldCompartment7EditPart(view);

			case SearchUnitUnitFieldCompartmentEditPart.VISUAL_ID:
				return new SearchUnitUnitFieldCompartmentEditPart(view);

			case UpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
				return new UpdateUnitUnitFieldCompartmentEditPart(view);

			case UnitAssociationInterfaceUnitsCompartment4EditPart.VISUAL_ID:
				return new UnitAssociationInterfaceUnitsCompartment4EditPart(view);

			case IndexUnitUnitFieldCompartment8EditPart.VISUAL_ID:
				return new IndexUnitUnitFieldCompartment8EditPart(view);

			case IndexUnitActionCompartment2EditPart.VISUAL_ID:
				return new IndexUnitActionCompartment2EditPart(view);

			case ImageIndexUnitActionCompartment2EditPart.VISUAL_ID:
				return new ImageIndexUnitActionCompartment2EditPart(view);

			case StaticMenuIncludedFeaturesCompartmentEditPart.VISUAL_ID:
				return new StaticMenuIncludedFeaturesCompartmentEditPart(view);

			case ServiceSelectionsCompartmentEditPart.VISUAL_ID:
				return new ServiceSelectionsCompartmentEditPart(view);

			case ServiceOperationsCompartmentEditPart.VISUAL_ID:
				return new ServiceOperationsCompartmentEditPart(view);

			case AssociationWithoutContainmentEditPart.VISUAL_ID:
				return new AssociationWithoutContainmentEditPart(view);

			case AssociationWithoutContainmentNameEditPart.VISUAL_ID:
				return new AssociationWithoutContainmentNameEditPart(view);

			case AssociationWithoutContainmentCardinalityTargetCardinEditPart.VISUAL_ID:
				return new AssociationWithoutContainmentCardinalityTargetCardinEditPart(view);

			case AssociationWithContainmentEditPart.VISUAL_ID:
				return new AssociationWithContainmentEditPart(view);

			case AssociationWithContainmentNameEditPart.VISUAL_ID:
				return new AssociationWithContainmentNameEditPart(view);

			case AssociationWithContainmentCardinalityEditPart.VISUAL_ID:
				return new AssociationWithContainmentCardinalityEditPart(view);

			case ViewAssociationEditPart.VISUAL_ID:
				return new ViewAssociationEditPart(view);

			case PageLinkEditPart.VISUAL_ID:
				return new PageLinkEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
