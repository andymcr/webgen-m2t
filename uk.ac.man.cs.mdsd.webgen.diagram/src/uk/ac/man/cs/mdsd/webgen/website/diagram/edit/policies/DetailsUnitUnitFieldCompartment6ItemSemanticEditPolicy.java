package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation11CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement13CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class DetailsUnitUnitFieldCompartment6ItemSemanticEditPolicy extends
		WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DetailsUnitUnitFieldCompartment6ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.DetailsUnit_3131);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3191 == req.getElementType()) {
			return getGEFWrapper(new UnitElement13CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3192 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation11CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
