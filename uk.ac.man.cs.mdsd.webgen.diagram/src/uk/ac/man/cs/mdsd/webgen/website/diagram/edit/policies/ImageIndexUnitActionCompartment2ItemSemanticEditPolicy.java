package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DeleteAction5CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.FeatureSupportAction3CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.SelectAction9CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class ImageIndexUnitActionCompartment2ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ImageIndexUnitActionCompartment2ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.ImageIndexUnit_3268);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.SelectAction_3269 == req.getElementType()) {
			return getGEFWrapper(new SelectAction9CreateCommand(req));
		}
		if (WebsiteElementTypes.DeleteAction_3270 == req.getElementType()) {
			return getGEFWrapper(new DeleteAction5CreateCommand(req));
		}
		if (WebsiteElementTypes.FeatureSupportAction_3271 == req.getElementType()) {
			return getGEFWrapper(new FeatureSupportAction3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
