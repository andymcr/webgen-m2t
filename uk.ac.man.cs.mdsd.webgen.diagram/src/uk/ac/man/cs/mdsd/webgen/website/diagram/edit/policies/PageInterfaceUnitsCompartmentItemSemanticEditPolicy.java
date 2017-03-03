package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.CreateSitemapUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.CreateUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.CreateUpdateUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DetailsUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.GalleryUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ImageIndexUnit2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.IndexUnit6CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.MapUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.SearchUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.SliderUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.StaticUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UpdateUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class PageInterfaceUnitsCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PageInterfaceUnitsCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.Page_2019);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.CreateUnit_3286 == req.getElementType()) {
			return getGEFWrapper(new CreateUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.CreateUpdateUnit_3291 == req.getElementType()) {
			return getGEFWrapper(new CreateUpdateUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.CreateSitemapUnit_3298 == req.getElementType()) {
			return getGEFWrapper(new CreateSitemapUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.DetailsUnit_3299 == req.getElementType()) {
			return getGEFWrapper(new DetailsUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.IndexUnit_3341 == req.getElementType()) {
			return getGEFWrapper(new IndexUnit6CreateCommand(req));
		}
		if (WebsiteElementTypes.MapUnit_3357 == req.getElementType()) {
			return getGEFWrapper(new MapUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.SearchUnit_3358 == req.getElementType()) {
			return getGEFWrapper(new SearchUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.StaticUnit_3363 == req.getElementType()) {
			return getGEFWrapper(new StaticUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.UpdateUnit_3364 == req.getElementType()) {
			return getGEFWrapper(new UpdateUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.ImageIndexUnit_3374 == req.getElementType()) {
			return getGEFWrapper(new ImageIndexUnit2CreateCommand(req));
		}
		if (WebsiteElementTypes.SliderUnit_3378 == req.getElementType()) {
			return getGEFWrapper(new SliderUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.GalleryUnit_3379 == req.getElementType()) {
			return getGEFWrapper(new GalleryUnitCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
