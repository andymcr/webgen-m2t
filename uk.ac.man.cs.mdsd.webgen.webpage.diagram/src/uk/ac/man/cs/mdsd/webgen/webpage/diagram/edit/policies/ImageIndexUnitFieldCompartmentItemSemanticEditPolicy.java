package uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitAssociation5CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitElement5CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;

/**
 * @generated
 */
public class ImageIndexUnitFieldCompartmentItemSemanticEditPolicy extends WebuiBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ImageIndexUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebuiElementTypes.ImageIndexUnit_3005);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebuiElementTypes.UnitAssociation_3020 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation5CreateCommand(req));
		}
		if (WebuiElementTypes.UnitElement_3021 == req.getElementType()) {
			return getGEFWrapper(new UnitElement5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
