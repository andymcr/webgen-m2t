package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DeleteAction3CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.FeatureSupportAction2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.SelectAction7CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class IndexUnitActionCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

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
		if (WebsiteElementTypes.SelectAction_3153 == req.getElementType()) {
			return getGEFWrapper(new SelectAction7CreateCommand(req));
		}
		if (WebsiteElementTypes.DeleteAction_3154 == req.getElementType()) {
			return getGEFWrapper(new DeleteAction3CreateCommand(req));
		}
		if (WebsiteElementTypes.FeatureSupportAction_3266 == req.getElementType()) {
			return getGEFWrapper(new FeatureSupportAction2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
