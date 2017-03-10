package uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry;

/**
 * @generated
 */
public class WebuiEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (WebuiVisualIDRegistry.getVisualID(view)) {

			case WebUIEditPart.VISUAL_ID:
				return new WebUIEditPart(view);

			case PageEditPart.VISUAL_ID:
				return new PageEditPart(view);

			case PageNameEditPart.VISUAL_ID:
				return new PageNameEditPart(view);

			case CreateUnitEditPart.VISUAL_ID:
				return new CreateUnitEditPart(view);

			case CreateUnitNameEditPart.VISUAL_ID:
				return new CreateUnitNameEditPart(view);

			case UnitAssociationEditPart.VISUAL_ID:
				return new UnitAssociationEditPart(view);

			case UnitAssociationNameEditPart.VISUAL_ID:
				return new UnitAssociationNameEditPart(view);

			case UnitElementEditPart.VISUAL_ID:
				return new UnitElementEditPart(view);

			case UnitElementNameEditPart.VISUAL_ID:
				return new UnitElementNameEditPart(view);

			case CreateUpdateUnitEditPart.VISUAL_ID:
				return new CreateUpdateUnitEditPart(view);

			case CreateUpdateUnitNameEditPart.VISUAL_ID:
				return new CreateUpdateUnitNameEditPart(view);

			case UnitAssociation2EditPart.VISUAL_ID:
				return new UnitAssociation2EditPart(view);

			case UnitAssociationName2EditPart.VISUAL_ID:
				return new UnitAssociationName2EditPart(view);

			case UnitElement2EditPart.VISUAL_ID:
				return new UnitElement2EditPart(view);

			case UnitElementName2EditPart.VISUAL_ID:
				return new UnitElementName2EditPart(view);

			case DetailsUnitEditPart.VISUAL_ID:
				return new DetailsUnitEditPart(view);

			case DetailsUnitNameEditPart.VISUAL_ID:
				return new DetailsUnitNameEditPart(view);

			case UnitAssociation3EditPart.VISUAL_ID:
				return new UnitAssociation3EditPart(view);

			case UnitAssociationName3EditPart.VISUAL_ID:
				return new UnitAssociationName3EditPart(view);

			case UnitElement3EditPart.VISUAL_ID:
				return new UnitElement3EditPart(view);

			case UnitElementName3EditPart.VISUAL_ID:
				return new UnitElementName3EditPart(view);

			case GalleryUnitEditPart.VISUAL_ID:
				return new GalleryUnitEditPart(view);

			case GalleryUnitNameEditPart.VISUAL_ID:
				return new GalleryUnitNameEditPart(view);

			case UnitAssociation4EditPart.VISUAL_ID:
				return new UnitAssociation4EditPart(view);

			case UnitAssociationName4EditPart.VISUAL_ID:
				return new UnitAssociationName4EditPart(view);

			case UnitElement4EditPart.VISUAL_ID:
				return new UnitElement4EditPart(view);

			case UnitElementName4EditPart.VISUAL_ID:
				return new UnitElementName4EditPart(view);

			case ImageIndexUnitEditPart.VISUAL_ID:
				return new ImageIndexUnitEditPart(view);

			case ImageIndexUnitNameEditPart.VISUAL_ID:
				return new ImageIndexUnitNameEditPart(view);

			case UnitAssociation5EditPart.VISUAL_ID:
				return new UnitAssociation5EditPart(view);

			case UnitAssociationName5EditPart.VISUAL_ID:
				return new UnitAssociationName5EditPart(view);

			case UnitElement5EditPart.VISUAL_ID:
				return new UnitElement5EditPart(view);

			case UnitElementName5EditPart.VISUAL_ID:
				return new UnitElementName5EditPart(view);

			case IndexUnitEditPart.VISUAL_ID:
				return new IndexUnitEditPart(view);

			case IndexUnitNameEditPart.VISUAL_ID:
				return new IndexUnitNameEditPart(view);

			case UnitAssociation6EditPart.VISUAL_ID:
				return new UnitAssociation6EditPart(view);

			case UnitAssociationName6EditPart.VISUAL_ID:
				return new UnitAssociationName6EditPart(view);

			case UnitElement6EditPart.VISUAL_ID:
				return new UnitElement6EditPart(view);

			case UnitElementName6EditPart.VISUAL_ID:
				return new UnitElementName6EditPart(view);

			case MapUnitEditPart.VISUAL_ID:
				return new MapUnitEditPart(view);

			case MapUnitNameEditPart.VISUAL_ID:
				return new MapUnitNameEditPart(view);

			case UnitAssociation7EditPart.VISUAL_ID:
				return new UnitAssociation7EditPart(view);

			case UnitAssociationName7EditPart.VISUAL_ID:
				return new UnitAssociationName7EditPart(view);

			case UnitElement7EditPart.VISUAL_ID:
				return new UnitElement7EditPart(view);

			case UnitElementName7EditPart.VISUAL_ID:
				return new UnitElementName7EditPart(view);

			case SearchUnitEditPart.VISUAL_ID:
				return new SearchUnitEditPart(view);

			case SearchUnitNameEditPart.VISUAL_ID:
				return new SearchUnitNameEditPart(view);

			case UnitAssociation8EditPart.VISUAL_ID:
				return new UnitAssociation8EditPart(view);

			case UnitAssociationName8EditPart.VISUAL_ID:
				return new UnitAssociationName8EditPart(view);

			case UnitElement8EditPart.VISUAL_ID:
				return new UnitElement8EditPart(view);

			case UnitElementName8EditPart.VISUAL_ID:
				return new UnitElementName8EditPart(view);

			case SliderUnitEditPart.VISUAL_ID:
				return new SliderUnitEditPart(view);

			case SliderUnitNameEditPart.VISUAL_ID:
				return new SliderUnitNameEditPart(view);

			case UnitAssociation9EditPart.VISUAL_ID:
				return new UnitAssociation9EditPart(view);

			case UnitAssociationName9EditPart.VISUAL_ID:
				return new UnitAssociationName9EditPart(view);

			case UnitElement9EditPart.VISUAL_ID:
				return new UnitElement9EditPart(view);

			case UnitElementName9EditPart.VISUAL_ID:
				return new UnitElementName9EditPart(view);

			case StaticUnitEditPart.VISUAL_ID:
				return new StaticUnitEditPart(view);

			case StaticUnitNameEditPart.VISUAL_ID:
				return new StaticUnitNameEditPart(view);

			case UpdateUnitEditPart.VISUAL_ID:
				return new UpdateUnitEditPart(view);

			case UpdateUnitNameEditPart.VISUAL_ID:
				return new UpdateUnitNameEditPart(view);

			case UnitAssociation10EditPart.VISUAL_ID:
				return new UnitAssociation10EditPart(view);

			case UnitAssociationName10EditPart.VISUAL_ID:
				return new UnitAssociationName10EditPart(view);

			case UnitElement10EditPart.VISUAL_ID:
				return new UnitElement10EditPart(view);

			case UnitElementName10EditPart.VISUAL_ID:
				return new UnitElementName10EditPart(view);

			case PageUnitCompartmentEditPart.VISUAL_ID:
				return new PageUnitCompartmentEditPart(view);

			case CreateUnitFieldCompartmentEditPart.VISUAL_ID:
				return new CreateUnitFieldCompartmentEditPart(view);

			case CreateUpdateUnitFieldCompartmentEditPart.VISUAL_ID:
				return new CreateUpdateUnitFieldCompartmentEditPart(view);

			case DetailsUnitFieldCompartmentEditPart.VISUAL_ID:
				return new DetailsUnitFieldCompartmentEditPart(view);

			case GalleryUnitFieldCompartmentEditPart.VISUAL_ID:
				return new GalleryUnitFieldCompartmentEditPart(view);

			case ImageIndexUnitFieldCompartmentEditPart.VISUAL_ID:
				return new ImageIndexUnitFieldCompartmentEditPart(view);

			case IndexUnitFieldCompartmentEditPart.VISUAL_ID:
				return new IndexUnitFieldCompartmentEditPart(view);

			case MapUnitFieldCompartmentEditPart.VISUAL_ID:
				return new MapUnitFieldCompartmentEditPart(view);

			case SearchUnitFieldCompartmentEditPart.VISUAL_ID:
				return new SearchUnitFieldCompartmentEditPart(view);

			case SliderUnitFieldCompartmentEditPart.VISUAL_ID:
				return new SliderUnitFieldCompartmentEditPart(view);

			case StaticUnitFieldCompartmentEditPart.VISUAL_ID:
				return new StaticUnitFieldCompartmentEditPart(view);

			case UpdateUnitFieldCompartmentEditPart.VISUAL_ID:
				return new UpdateUnitFieldCompartmentEditPart(view);

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
