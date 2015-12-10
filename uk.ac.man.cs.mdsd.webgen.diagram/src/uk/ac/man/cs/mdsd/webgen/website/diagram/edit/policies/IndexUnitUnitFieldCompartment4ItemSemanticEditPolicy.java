package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation9CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement11CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class IndexUnitUnitFieldCompartment4ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IndexUnitUnitFieldCompartment4ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.IndexUnit_3120);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3187 == req.getElementType()) {
			return getGEFWrapper(new UnitElement11CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3188 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation9CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
