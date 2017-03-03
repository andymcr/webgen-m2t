package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DetailsUnit5CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.IndexUnit3CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class UnitAssociationInterfaceUnitsCompartment5ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UnitAssociationInterfaceUnitsCompartment5ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.UnitAssociation_3315);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.DetailsUnit_3316 == req.getElementType()) {
			return getGEFWrapper(new DetailsUnit5CreateCommand(req));
		}
		if (WebsiteElementTypes.IndexUnit_3319 == req.getElementType()) {
			return getGEFWrapper(new IndexUnit3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
