package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ActionUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.CreateSitemapUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.CreateUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.CreateUpdateUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DetailsUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.IndexUnit6CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.MapUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.SearchUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.StaticUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UpdateUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class PageInterfaceUnitCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PageInterfaceUnitCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.Page_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.ActionUnit_3213 == req.getElementType()) {
			return getGEFWrapper(new ActionUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.CreateUnit_3103 == req.getElementType()) {
			return getGEFWrapper(new CreateUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.CreateUpdateUnit_3104 == req.getElementType()) {
			return getGEFWrapper(new CreateUpdateUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.CreateSitemapUnit_3157 == req.getElementType()) {
			return getGEFWrapper(new CreateSitemapUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.DetailsUnit_3105 == req.getElementType()) {
			return getGEFWrapper(new DetailsUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.IndexUnit_3136 == req.getElementType()) {
			return getGEFWrapper(new IndexUnit6CreateCommand(req));
		}
		if (WebsiteElementTypes.MapUnit_3228 == req.getElementType()) {
			return getGEFWrapper(new MapUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.SearchUnit_3109 == req.getElementType()) {
			return getGEFWrapper(new SearchUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.StaticUnit_3110 == req.getElementType()) {
			return getGEFWrapper(new StaticUnitCreateCommand(req));
		}
		if (WebsiteElementTypes.UpdateUnit_3111 == req.getElementType()) {
			return getGEFWrapper(new UpdateUnitCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
