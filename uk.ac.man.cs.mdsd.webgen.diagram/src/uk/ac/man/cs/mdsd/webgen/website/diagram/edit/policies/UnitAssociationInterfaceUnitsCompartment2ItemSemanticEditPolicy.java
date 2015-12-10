package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DetailsUnit6CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.IndexUnit5CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class UnitAssociationInterfaceUnitsCompartment2ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UnitAssociationInterfaceUnitsCompartment2ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.UnitAssociation_3188);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.DetailsUnit_3131 == req.getElementType()) {
			return getGEFWrapper(new DetailsUnit6CreateCommand(req));
		}
		if (WebsiteElementTypes.IndexUnit_3133 == req.getElementType()) {
			return getGEFWrapper(new IndexUnit5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
