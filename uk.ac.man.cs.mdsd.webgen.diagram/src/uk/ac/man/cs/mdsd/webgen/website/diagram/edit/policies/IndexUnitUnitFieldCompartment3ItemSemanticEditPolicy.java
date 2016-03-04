package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation8CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement10CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement11CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class IndexUnitUnitFieldCompartment3ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IndexUnitUnitFieldCompartment3ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.IndexUnit_3118);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3187 == req.getElementType()) {
			return getGEFWrapper(new UnitElement11CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3186 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation8CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
