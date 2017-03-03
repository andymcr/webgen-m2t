package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DetailsUnit2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ImageIndexUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.IndexUnit2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class UnitAssociationInterfaceUnitsCompartment2ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UnitAssociationInterfaceUnitsCompartment2ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.UnitAssociation_3302);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.DetailsUnit_3303 == req.getElementType()) {
			return getGEFWrapper(new DetailsUnit2CreateCommand(req));
		}
		if (WebsiteElementTypes.IndexUnit_3310 == req.getElementType()) {
			return getGEFWrapper(new IndexUnit2CreateCommand(req));
		}
		if (WebsiteElementTypes.ImageIndexUnit_3333 == req.getElementType()) {
			return getGEFWrapper(new ImageIndexUnitCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
