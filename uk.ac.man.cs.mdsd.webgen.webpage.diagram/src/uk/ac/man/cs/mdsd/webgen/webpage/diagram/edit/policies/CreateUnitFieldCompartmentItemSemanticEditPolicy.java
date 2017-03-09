package uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitAssociationCreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitElementCreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;

/**
 * @generated
 */
public class CreateUnitFieldCompartmentItemSemanticEditPolicy extends WebuiBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CreateUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebuiElementTypes.CreateUnit_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebuiElementTypes.UnitAssociation_3012 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociationCreateCommand(req));
		}
		if (WebuiElementTypes.UnitElement_3013 == req.getElementType()) {
			return getGEFWrapper(new UnitElementCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
