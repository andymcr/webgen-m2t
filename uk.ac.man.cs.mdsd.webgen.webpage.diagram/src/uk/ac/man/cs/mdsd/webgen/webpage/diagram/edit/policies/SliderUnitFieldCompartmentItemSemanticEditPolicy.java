package uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitAssociation9CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitElement9CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;

/**
 * @generated
 */
public class SliderUnitFieldCompartmentItemSemanticEditPolicy extends WebuiBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SliderUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebuiElementTypes.SliderUnit_3009);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebuiElementTypes.UnitAssociation_3028 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation9CreateCommand(req));
		}
		if (WebuiElementTypes.UnitElement_3029 == req.getElementType()) {
			return getGEFWrapper(new UnitElement9CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
