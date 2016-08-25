package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation13CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement16CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class DetailsUnitUnitFieldCompartment7ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DetailsUnitUnitFieldCompartment7ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.DetailsUnit_3219);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3197 == req.getElementType()) {
			return getGEFWrapper(new UnitElement16CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3196 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation13CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
