package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation14CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement17CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class IndexUnitUnitFieldCompartment7ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IndexUnitUnitFieldCompartment7ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.IndexUnit_3143);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3199 == req.getElementType()) {
			return getGEFWrapper(new UnitElement17CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3198 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation14CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
