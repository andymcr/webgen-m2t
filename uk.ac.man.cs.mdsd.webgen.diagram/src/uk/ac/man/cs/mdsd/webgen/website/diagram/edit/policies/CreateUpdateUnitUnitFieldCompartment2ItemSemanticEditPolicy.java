package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement3CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class CreateUpdateUnitUnitFieldCompartment2ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CreateUpdateUnitUnitFieldCompartment2ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.CreateUpdateUnit_3249);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3173 == req.getElementType()) {
			return getGEFWrapper(new UnitElement3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
