package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ServiceEntityAssociationCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ServiceEntityElementCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ServiceViewAssociationCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class ServiceFeaturesCompartmentItemSemanticEditPolicy extends
		WebsiteBaseItemSemanticEditPolicy {

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
		if (WebsiteElementTypes.ServiceEntityElement_3167 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceEntityElementCreateCommand(req));
		}
		if (WebsiteElementTypes.ServiceEntityAssociation_3168 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceEntityAssociationCreateCommand(req));
		}
		if (WebsiteElementTypes.ServiceViewAssociation_3166 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceViewAssociationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
