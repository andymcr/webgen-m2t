package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DetailsUnit4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.IndexUnit4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class UnitAssociationInterfaceUnitCompartment3ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UnitAssociationInterfaceUnitCompartment3ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.UnitAssociation_3182);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.DetailsUnit_3116 == req.getElementType()) {
			return getGEFWrapper(new DetailsUnit4CreateCommand(req));
		}
		if (WebsiteElementTypes.IndexUnit_3120 == req.getElementType()) {
			return getGEFWrapper(new IndexUnit4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
