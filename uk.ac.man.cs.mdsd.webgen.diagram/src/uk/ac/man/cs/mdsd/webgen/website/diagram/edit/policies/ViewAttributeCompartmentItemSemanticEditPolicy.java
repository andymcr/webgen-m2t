package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.EncapsulatedAssociationCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.EncapsulatedAttributeCreateCommand;
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
		if (WebsiteElementTypes.EncapsulatedAttribute_3243 == req.getElementType()) {
			return getGEFWrapper(new EncapsulatedAttributeCreateCommand(req));
		}
		if (WebsiteElementTypes.EncapsulatedAssociation_3244 == req.getElementType()) {
			return getGEFWrapper(new EncapsulatedAssociationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
