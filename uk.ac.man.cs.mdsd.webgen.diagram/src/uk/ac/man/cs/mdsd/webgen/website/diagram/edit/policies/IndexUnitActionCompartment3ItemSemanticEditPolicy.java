package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DeleteActionCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.SelectAction2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class IndexUnitActionCompartment3ItemSemanticEditPolicy extends
		WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IndexUnitActionCompartment3ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.IndexUnit_3114);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.SelectAction_3107 == req.getElementType()) {
			return getGEFWrapper(new SelectAction2CreateCommand(req));
		}
		if (WebsiteElementTypes.DeleteAction_3101 == req.getElementType()) {
			return getGEFWrapper(new DeleteActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
