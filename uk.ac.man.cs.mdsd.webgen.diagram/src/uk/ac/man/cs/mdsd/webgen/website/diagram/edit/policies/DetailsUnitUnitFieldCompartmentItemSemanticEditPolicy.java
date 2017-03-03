package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DataTypeField3CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DateField3CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation3CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class DetailsUnitUnitFieldCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DetailsUnitUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.DetailsUnit_3299);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3300 == req.getElementType()) {
			return getGEFWrapper(new UnitElement4CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3302 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation3CreateCommand(req));
		}
		if (WebsiteElementTypes.DataTypeField_3338 == req.getElementType()) {
			return getGEFWrapper(new DataTypeField3CreateCommand(req));
		}
		if (WebsiteElementTypes.DateField_3339 == req.getElementType()) {
			return getGEFWrapper(new DateField3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
