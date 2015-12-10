package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DetailsUnit3CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.IndexUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class UnitAssociationInterfaceUnitCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

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
		if (WebsiteElementTypes.DetailsUnit_3113 == req.getElementType()) {
			return getGEFWrapper(new DetailsUnit3CreateCommand(req));
		}
		if (WebsiteElementTypes.IndexUnit_3106 == req.getElementType()) {
			return getGEFWrapper(new IndexUnitCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
