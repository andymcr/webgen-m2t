package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.CasAuthenticationCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.LocalAuthenticationSystemCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class WebsitePropertiesAuthenticationCompartmentItemSemanticEditPolicy
		extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WebsitePropertiesAuthenticationCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.WebsiteProperties_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.CasAuthentication_3055 == req.getElementType()) {
			return getGEFWrapper(new CasAuthenticationCreateCommand(req));
		}
		if (WebsiteElementTypes.LocalAuthenticationSystem_3029 == req
				.getElementType()) {
			return getGEFWrapper(new LocalAuthenticationSystemCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
