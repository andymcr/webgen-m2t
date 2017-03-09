package uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitAssociation3CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitElement3CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;

/**
 * @generated
 */
public class DetailsUnitFieldCompartmentItemSemanticEditPolicy extends WebuiBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DetailsUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebuiElementTypes.DetailsUnit_3003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebuiElementTypes.UnitAssociation_3016 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation3CreateCommand(req));
		}
		if (WebuiElementTypes.UnitElement_3017 == req.getElementType()) {
			return getGEFWrapper(new UnitElement3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
