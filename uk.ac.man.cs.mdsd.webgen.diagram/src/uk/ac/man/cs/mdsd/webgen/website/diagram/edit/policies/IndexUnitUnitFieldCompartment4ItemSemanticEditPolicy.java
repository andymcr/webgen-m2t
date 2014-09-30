package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation10CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement12CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class IndexUnitUnitFieldCompartment4ItemSemanticEditPolicy extends
		WebsiteBaseItemSemanticEditPolicy {

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
		if (WebsiteElementTypes.UnitElement_3189 == req.getElementType()) {
			return getGEFWrapper(new UnitElement12CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3190 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation10CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
