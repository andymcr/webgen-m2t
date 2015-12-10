package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DataTypeFieldCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DateFieldCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociationCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElementCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class CreateUnitUnitFieldCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

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
		if (WebsiteElementTypes.UnitElement_3169 == req.getElementType()) {
			return getGEFWrapper(new UnitElementCreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3170 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociationCreateCommand(req));
		}
		if (WebsiteElementTypes.DataTypeField_3201 == req.getElementType()) {
			return getGEFWrapper(new DataTypeFieldCreateCommand(req));
		}
		if (WebsiteElementTypes.DateField_3207 == req.getElementType()) {
			return getGEFWrapper(new DateFieldCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
