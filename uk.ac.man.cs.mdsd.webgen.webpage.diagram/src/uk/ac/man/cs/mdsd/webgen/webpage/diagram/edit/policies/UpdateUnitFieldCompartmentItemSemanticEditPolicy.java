package uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitAssociation10CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitElement10CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;

/**
 * @generated
 */
public class UpdateUnitFieldCompartmentItemSemanticEditPolicy extends WebuiBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UpdateUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebuiElementTypes.UpdateUnit_3011);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebuiElementTypes.UnitAssociation_3030 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation10CreateCommand(req));
		}
		if (WebuiElementTypes.UnitElement_3031 == req.getElementType()) {
			return getGEFWrapper(new UnitElement10CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
