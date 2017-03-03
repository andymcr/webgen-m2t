package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation6CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement9CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class DetailsUnitUnitFieldCompartment4ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DetailsUnitUnitFieldCompartment4ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.DetailsUnit_3313);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3314 == req.getElementType()) {
			return getGEFWrapper(new UnitElement9CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3315 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
