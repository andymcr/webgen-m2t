package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UserCommandCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class CommandUnitCommandsCompartmentItemSemanticEditPolicy extends
		WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CommandUnitCommandsCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.CommandUnit_3225);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UserCommand_3226 == req.getElementType()) {
			return getGEFWrapper(new UserCommandCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
