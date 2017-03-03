package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DetailsUnit4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.IndexUnit4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class UnitAssociationInterfaceUnitsCompartment4ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UnitAssociationInterfaceUnitsCompartment4ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.UnitAssociation_3312);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.DetailsUnit_3313 == req.getElementType()) {
			return getGEFWrapper(new DetailsUnit4CreateCommand(req));
		}
		if (WebsiteElementTypes.IndexUnit_3322 == req.getElementType()) {
			return getGEFWrapper(new IndexUnit4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
