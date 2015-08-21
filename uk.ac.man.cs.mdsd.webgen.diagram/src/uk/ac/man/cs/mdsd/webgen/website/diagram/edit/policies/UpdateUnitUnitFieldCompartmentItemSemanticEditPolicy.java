package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DataTypeField7CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DateField7CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation17CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement19CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class UpdateUnitUnitFieldCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UpdateUnitUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.UpdateUnit_3111);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3220 == req.getElementType()) {
			return getGEFWrapper(new UnitElement19CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3221 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation17CreateCommand(req));
		}
		if (WebsiteElementTypes.DataTypeField_3217 == req.getElementType()) {
			return getGEFWrapper(new DataTypeField7CreateCommand(req));
		}
		if (WebsiteElementTypes.DateField_3218 == req.getElementType()) {
			return getGEFWrapper(new DateField7CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
