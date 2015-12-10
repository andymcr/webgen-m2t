package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DataTypeField5CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DateField5CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation15CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement17CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class SearchUnitUnitFieldCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SearchUnitUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.SearchUnit_3109);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3199 == req.getElementType()) {
			return getGEFWrapper(new UnitElement17CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3200 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation15CreateCommand(req));
		}
		if (WebsiteElementTypes.DataTypeField_3205 == req.getElementType()) {
			return getGEFWrapper(new DataTypeField5CreateCommand(req));
		}
		if (WebsiteElementTypes.DateField_3211 == req.getElementType()) {
			return getGEFWrapper(new DateField5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
