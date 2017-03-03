package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DeleteAction2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.FeatureSupportActionCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.SelectAction3CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class ImageIndexUnitActionCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ImageIndexUnitActionCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.ImageIndexUnit_3333);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.SelectAction_3334 == req.getElementType()) {
			return getGEFWrapper(new SelectAction3CreateCommand(req));
		}
		if (WebsiteElementTypes.DeleteAction_3335 == req.getElementType()) {
			return getGEFWrapper(new DeleteAction2CreateCommand(req));
		}
		if (WebsiteElementTypes.FeatureSupportAction_3336 == req.getElementType()) {
			return getGEFWrapper(new FeatureSupportActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
