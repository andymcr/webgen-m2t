package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation6CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement8CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class IndexUnitUnitFieldCompartment2ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IndexUnitUnitFieldCompartment2ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.IndexUnit_3114);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3181 == req.getElementType()) {
			return getGEFWrapper(new UnitElement8CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3182 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
