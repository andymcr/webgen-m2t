package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ModelLabelY2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class ViewModelLabelsCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ViewModelLabelsCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.View_2010);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.ModelLabelY_3238 == req.getElementType()) {
			return getGEFWrapper(new ModelLabelY2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
