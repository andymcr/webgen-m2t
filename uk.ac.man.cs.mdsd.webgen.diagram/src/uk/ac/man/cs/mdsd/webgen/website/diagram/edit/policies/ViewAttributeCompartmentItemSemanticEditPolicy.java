package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ViewAssociationCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ViewAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class ViewAttributeCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ViewAttributeCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.View_2010);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.ViewAttribute_3239 == req.getElementType()) {
			return getGEFWrapper(new ViewAttributeCreateCommand(req));
		}
		if (WebsiteElementTypes.ViewAssociation_3240 == req.getElementType()) {
			return getGEFWrapper(new ViewAssociationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
