package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DeleteAction2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.FeatureSupportActionCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.SelectAction6CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class IndexUnitActionCompartmentItemSemanticEditPolicy extends
		WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IndexUnitActionCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.IndexUnit_3136);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.SelectAction_3146 == req.getElementType()) {
			return getGEFWrapper(new SelectAction6CreateCommand(req));
		}
		if (WebsiteElementTypes.DeleteAction_3147 == req.getElementType()) {
			return getGEFWrapper(new DeleteAction2CreateCommand(req));
		}
		if (WebsiteElementTypes.FeatureSupportAction_3234 == req
				.getElementType()) {
			return getGEFWrapper(new FeatureSupportActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
