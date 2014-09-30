package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DataTypeField4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DateField4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class DetailsUnitUnitFieldCompartmentItemSemanticEditPolicy extends
		WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DetailsUnitUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.DetailsUnit_3105);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3175 == req.getElementType()) {
			return getGEFWrapper(new UnitElement4CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3176 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation4CreateCommand(req));
		}
		if (WebsiteElementTypes.DataTypeField_3204 == req.getElementType()) {
			return getGEFWrapper(new DataTypeField4CreateCommand(req));
		}
		if (WebsiteElementTypes.DateField_3210 == req.getElementType()) {
			return getGEFWrapper(new DateField4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
