package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DetailsUnit2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.IndexUnit2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class UnitAssociationInterfaceUnitCompartmentItemSemanticEditPolicy
		extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UnitAssociationInterfaceUnitCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.UnitAssociation_3176);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.DetailsUnit_3112 == req.getElementType()) {
			return getGEFWrapper(new DetailsUnit2CreateCommand(req));
		}
		if (WebsiteElementTypes.IndexUnit_3114 == req.getElementType()) {
			return getGEFWrapper(new IndexUnit2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
