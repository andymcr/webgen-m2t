package uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitAssociation6CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitElement6CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;

/**
 * @generated
 */
public class IndexUnitFieldCompartmentItemSemanticEditPolicy extends WebuiBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IndexUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebuiElementTypes.IndexUnit_3006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebuiElementTypes.UnitAssociation_3022 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation6CreateCommand(req));
		}
		if (WebuiElementTypes.UnitElement_3023 == req.getElementType()) {
			return getGEFWrapper(new UnitElement6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
