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

			case CreateUpdateUnitEditPart.VISUAL_ID:
				return new CreateUpdateUnitEditPart(view);

			case CreateUpdateUnitNameEditPart.VISUAL_ID:
				return new CreateUpdateUnitNameEditPart(view);

			case DetailsUnitEditPart.VISUAL_ID:
				return new DetailsUnitEditPart(view);

			case DetailsUnitNameEditPart.VISUAL_ID:
				return new DetailsUnitNameEditPart(view);

			case GalleryUnitEditPart.VISUAL_ID:
				return new GalleryUnitEditPart(view);

			case GalleryUnitNameEditPart.VISUAL_ID:
				return new GalleryUnitNameEditPart(view);

			case ImageIndexUnitEditPart.VISUAL_ID:
				return new ImageIndexUnitEditPart(view);

			case ImageIndexUnitNameEditPart.VISUAL_ID:
				return new ImageIndexUnitNameEditPart(view);

			case IndexUnitEditPart.VISUAL_ID:
				return new IndexUnitEditPart(view);

			case IndexUnitNameEditPart.VISUAL_ID:
				return new IndexUnitNameEditPart(view);

			case MapUnitEditPart.VISUAL_ID:
				return new MapUnitEditPart(view);

			case MapUnitNameEditPart.VISUAL_ID:
				return new MapUnitNameEditPart(view);

			case SearchUnitEditPart.VISUAL_ID:
				return new SearchUnitEditPart(view);

			case SearchUnitNameEditPart.VISUAL_ID:
				return new SearchUnitNameEditPart(view);

			case SliderUnitEditPart.VISUAL_ID:
				return new SliderUnitEditPart(view);

			case SliderUnitNameEditPart.VISUAL_ID:
				return new SliderUnitNameEditPart(view);

			case StaticUnitEditPart.VISUAL_ID:
				return new StaticUnitEditPart(view);

			case StaticUnitNameEditPart.VISUAL_ID:
				return new StaticUnitNameEditPart(view);

			case UpdateUnitEditPart.VISUAL_ID:
				return new UpdateUnitEditPart(view);

			case UpdateUnitNameEditPart.VISUAL_ID:
				return new UpdateUnitNameEditPart(view);

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
