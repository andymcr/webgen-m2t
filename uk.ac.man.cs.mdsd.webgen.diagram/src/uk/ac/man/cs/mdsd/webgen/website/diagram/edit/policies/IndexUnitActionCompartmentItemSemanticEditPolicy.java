package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DeleteActionCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.SelectAction2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class IndexUnitActionCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IndexUnitActionCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.IndexUnit_3310);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.SelectAction_3331 == req.getElementType()) {
			return getGEFWrapper(new SelectAction2CreateCommand(req));
		}
		if (WebsiteElementTypes.DeleteAction_3332 == req.getElementType()) {
			return getGEFWrapper(new DeleteActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
