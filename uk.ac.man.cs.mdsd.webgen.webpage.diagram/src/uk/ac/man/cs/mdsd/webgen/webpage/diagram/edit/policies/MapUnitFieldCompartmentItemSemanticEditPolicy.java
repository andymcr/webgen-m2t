package uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitAssociation7CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitElement7CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;

/**
 * @generated
 */
public class MapUnitFieldCompartmentItemSemanticEditPolicy extends WebuiBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MapUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebuiElementTypes.MapUnit_3007);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebuiElementTypes.UnitAssociation_3024 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation7CreateCommand(req));
		}
		if (WebuiElementTypes.UnitElement_3025 == req.getElementType()) {
			return getGEFWrapper(new UnitElement7CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
