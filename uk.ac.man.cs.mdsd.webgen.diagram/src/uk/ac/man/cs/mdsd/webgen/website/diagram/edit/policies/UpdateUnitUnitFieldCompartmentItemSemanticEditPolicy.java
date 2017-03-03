package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DataTypeField6CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DateField6CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation16CreateCommand;
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
		super(WebsiteElementTypes.UpdateUnit_3364);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3365 == req.getElementType()) {
			return getGEFWrapper(new UnitElement19CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3366 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation16CreateCommand(req));
		}
		if (WebsiteElementTypes.DataTypeField_3372 == req.getElementType()) {
			return getGEFWrapper(new DataTypeField6CreateCommand(req));
		}
		if (WebsiteElementTypes.DateField_3373 == req.getElementType()) {
			return getGEFWrapper(new DateField6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
