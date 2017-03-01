package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ModelLabelCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class EntityModelLabelsCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EntityModelLabelsCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.Entity_2015);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.ModelLabel_3280 == req.getElementType()) {
			return getGEFWrapper(new ModelLabelCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
