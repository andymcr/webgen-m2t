package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitSupportActionCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class DetailsUnitActionCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DetailsUnitActionCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.DetailsUnit_3299);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitSupportAction_3340 == req.getElementType()) {
			return getGEFWrapper(new UnitSupportActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
