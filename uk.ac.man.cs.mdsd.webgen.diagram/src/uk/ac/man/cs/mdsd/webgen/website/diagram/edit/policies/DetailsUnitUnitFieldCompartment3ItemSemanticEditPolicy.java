package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement6CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class DetailsUnitUnitFieldCompartment3ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DetailsUnitUnitFieldCompartment3ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.DetailsUnit_3306);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3307 == req.getElementType()) {
			return getGEFWrapper(new UnitElement6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
