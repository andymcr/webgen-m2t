package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation18CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement20CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class IndexUnitUnitFieldCompartment8ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IndexUnitUnitFieldCompartment8ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.IndexUnit_3222);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3223 == req.getElementType()) {
			return getGEFWrapper(new UnitElement20CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3224 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation18CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
