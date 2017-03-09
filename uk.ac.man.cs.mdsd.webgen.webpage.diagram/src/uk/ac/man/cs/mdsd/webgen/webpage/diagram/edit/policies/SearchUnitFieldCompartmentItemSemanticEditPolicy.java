package uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitAssociation8CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitElement8CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;

/**
 * @generated
 */
public class SearchUnitFieldCompartmentItemSemanticEditPolicy extends WebuiBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SearchUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebuiElementTypes.SearchUnit_3008);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebuiElementTypes.UnitAssociation_3026 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation8CreateCommand(req));
		}
		if (WebuiElementTypes.UnitElement_3027 == req.getElementType()) {
			return getGEFWrapper(new UnitElement8CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
