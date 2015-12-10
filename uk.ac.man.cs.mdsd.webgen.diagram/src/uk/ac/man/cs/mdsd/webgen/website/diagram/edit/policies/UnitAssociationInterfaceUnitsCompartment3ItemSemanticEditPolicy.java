package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DetailsUnit7CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.IndexUnit7CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class UnitAssociationInterfaceUnitsCompartment3ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UnitAssociationInterfaceUnitsCompartment3ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.UnitAssociation_3194);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.DetailsUnit_3219 == req.getElementType()) {
			return getGEFWrapper(new DetailsUnit7CreateCommand(req));
		}
		if (WebsiteElementTypes.IndexUnit_3143 == req.getElementType()) {
			return getGEFWrapper(new IndexUnit7CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
