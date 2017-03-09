package uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitAssociation2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitElement2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;

/**
 * @generated
 */
public class CreateUpdateUnitFieldCompartmentItemSemanticEditPolicy extends WebuiBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CreateUpdateUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebuiElementTypes.CreateUpdateUnit_3002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebuiElementTypes.UnitAssociation_3014 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation2CreateCommand(req));
		}
		if (WebuiElementTypes.UnitElement_3015 == req.getElementType()) {
			return getGEFWrapper(new UnitElement2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
