package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.CreateUpdateUnit2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class UnitAssociationInterfaceUnitsCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UnitAssociationInterfaceUnitsCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.UnitAssociation_3293);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.CreateUpdateUnit_3294 == req.getElementType()) {
			return getGEFWrapper(new CreateUpdateUnit2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
