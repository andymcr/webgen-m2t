package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation5CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement5CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class DetailsUnitUnitFieldCompartment2ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DetailsUnitUnitFieldCompartment2ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.DetailsUnit_3112);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3177 == req.getElementType()) {
			return getGEFWrapper(new UnitElement5CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3180 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
