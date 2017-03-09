package uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.CreateUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.CreateUpdateUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.DetailsUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.GalleryUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.ImageIndexUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.IndexUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.MapUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.SearchUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.SliderUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.StaticUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UpdateUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;

/**
 * @generated
 */
public class PageUnitCompartmentItemSemanticEditPolicy extends WebuiBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PageUnitCompartmentItemSemanticEditPolicy() {
		super(WebuiElementTypes.Page_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebuiElementTypes.CreateUnit_3001 == req.getElementType()) {
			return getGEFWrapper(new CreateUnitCreateCommand(req));
		}
		if (WebuiElementTypes.CreateUpdateUnit_3002 == req.getElementType()) {
			return getGEFWrapper(new CreateUpdateUnitCreateCommand(req));
		}
		if (WebuiElementTypes.DetailsUnit_3003 == req.getElementType()) {
			return getGEFWrapper(new DetailsUnitCreateCommand(req));
		}
		if (WebuiElementTypes.GalleryUnit_3004 == req.getElementType()) {
			return getGEFWrapper(new GalleryUnitCreateCommand(req));
		}
		if (WebuiElementTypes.ImageIndexUnit_3005 == req.getElementType()) {
			return getGEFWrapper(new ImageIndexUnitCreateCommand(req));
		}
		if (WebuiElementTypes.IndexUnit_3006 == req.getElementType()) {
			return getGEFWrapper(new IndexUnitCreateCommand(req));
		}
		if (WebuiElementTypes.MapUnit_3007 == req.getElementType()) {
			return getGEFWrapper(new MapUnitCreateCommand(req));
		}
		if (WebuiElementTypes.SearchUnit_3008 == req.getElementType()) {
			return getGEFWrapper(new SearchUnitCreateCommand(req));
		}
		if (WebuiElementTypes.SliderUnit_3009 == req.getElementType()) {
			return getGEFWrapper(new SliderUnitCreateCommand(req));
		}
		if (WebuiElementTypes.StaticUnit_3010 == req.getElementType()) {
			return getGEFWrapper(new StaticUnitCreateCommand(req));
		}
		if (WebuiElementTypes.UpdateUnit_3011 == req.getElementType()) {
			return getGEFWrapper(new UpdateUnitCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
