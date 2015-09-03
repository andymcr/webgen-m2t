package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ServiceAssociationCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ServiceAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class ServiceFeaturesCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceFeaturesCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.Service_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.ServiceAttribute_3241 == req.getElementType()) {
			return getGEFWrapper(new ServiceAttributeCreateCommand(req));
		}
		if (WebsiteElementTypes.ServiceAssociation_3242 == req.getElementType()) {
			return getGEFWrapper(new ServiceAssociationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
