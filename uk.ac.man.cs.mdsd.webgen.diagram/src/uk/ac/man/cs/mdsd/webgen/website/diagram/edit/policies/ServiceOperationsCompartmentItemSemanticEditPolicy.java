package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.BusinessOperationCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class ServiceOperationsCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ServiceOperationsCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.Service_2017);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.BusinessOperation_3285 == req.getElementType()) {
			return getGEFWrapper(new BusinessOperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
