package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DetailsUnit3CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.IndexUnitCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class UnitAssociationInterfaceUnitsCompartment3ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UnitAssociationInterfaceUnitsCompartment3ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.UnitAssociation_3305);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.DetailsUnit_3306 == req.getElementType()) {
			return getGEFWrapper(new DetailsUnit3CreateCommand(req));
		}
		if (WebsiteElementTypes.IndexUnit_3308 == req.getElementType()) {
			return getGEFWrapper(new IndexUnitCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
