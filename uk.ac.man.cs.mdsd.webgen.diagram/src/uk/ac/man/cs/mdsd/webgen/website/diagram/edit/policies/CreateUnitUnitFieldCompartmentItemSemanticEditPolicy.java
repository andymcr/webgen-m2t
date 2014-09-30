package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DataTypeField2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DateField2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class CreateUnitUnitFieldCompartmentItemSemanticEditPolicy extends
		WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CreateUnitUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.CreateUnit_3103);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3171 == req.getElementType()) {
			return getGEFWrapper(new UnitElement2CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3172 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation2CreateCommand(req));
		}
		if (WebsiteElementTypes.DataTypeField_3202 == req.getElementType()) {
			return getGEFWrapper(new DataTypeField2CreateCommand(req));
		}
		if (WebsiteElementTypes.DateField_3208 == req.getElementType()) {
			return getGEFWrapper(new DateField2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
