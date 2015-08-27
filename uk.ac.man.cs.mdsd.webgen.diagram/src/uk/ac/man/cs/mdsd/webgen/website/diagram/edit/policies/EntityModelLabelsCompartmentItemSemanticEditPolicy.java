package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ModelLabelYCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class EntityModelLabelsCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EntityModelLabelsCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.Entity_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.ModelLabelY_3237 == req.getElementType()) {
			return getGEFWrapper(new ModelLabelYCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
