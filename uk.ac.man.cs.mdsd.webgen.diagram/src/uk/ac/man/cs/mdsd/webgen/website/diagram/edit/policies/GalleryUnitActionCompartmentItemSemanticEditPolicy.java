package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DeleteAction4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DeleteAction6CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.FeatureSupportAction2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.FeatureSupportAction4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.SelectAction10CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.SelectAction8CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class GalleryUnitActionCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GalleryUnitActionCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.GalleryUnit_3263);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.SelectAction_3272 == req.getElementType()) {
			return getGEFWrapper(new SelectAction10CreateCommand(req));
		}
		if (WebsiteElementTypes.DeleteAction_3273 == req.getElementType()) {
			return getGEFWrapper(new DeleteAction6CreateCommand(req));
		}
		if (WebsiteElementTypes.FeatureSupportAction_3274 == req.getElementType()) {
			return getGEFWrapper(new FeatureSupportAction4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
