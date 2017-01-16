package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DeleteAction4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.SelectAction8CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class IndexUnitActionCompartment2ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IndexUnitActionCompartment2ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.IndexUnit_3222);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.SelectAction_3264 == req.getElementType()) {
			return getGEFWrapper(new SelectAction8CreateCommand(req));
		}
		if (WebsiteElementTypes.DeleteAction_3265 == req.getElementType()) {
			return getGEFWrapper(new DeleteAction4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
