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
public class UnitAssociationInterfaceUnitsCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UnitAssociationInterfaceUnitsCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.UnitAssociation_3174);
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
		if (WebsiteElementTypes.ImageIndexUnit_3267 == req.getElementType()) {
			return getGEFWrapper(new ImageIndexUnitCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
