package uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitAssociation4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.commands.UnitElement4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;

/**
 * @generated
 */
public class GalleryUnitFieldCompartmentItemSemanticEditPolicy extends WebuiBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GalleryUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebuiElementTypes.GalleryUnit_3004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebuiElementTypes.UnitAssociation_3018 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation4CreateCommand(req));
		}
		if (WebuiElementTypes.UnitElement_3019 == req.getElementType()) {
			return getGEFWrapper(new UnitElement4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
