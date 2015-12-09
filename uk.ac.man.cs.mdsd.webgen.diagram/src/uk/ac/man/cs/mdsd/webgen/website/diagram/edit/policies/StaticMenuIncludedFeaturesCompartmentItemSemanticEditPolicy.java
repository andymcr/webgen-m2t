package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ActionMenuEntryCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.EditStaticTextMenuEntryCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class StaticMenuIncludedFeaturesCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public StaticMenuIncludedFeaturesCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.StaticMenu_2009);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.ActionMenuEntry_3236 == req.getElementType()) {
			return getGEFWrapper(new ActionMenuEntryCreateCommand(req));
		}
		if (WebsiteElementTypes.EditStaticTextMenuEntry_3156 == req.getElementType()) {
			return getGEFWrapper(new EditStaticTextMenuEntryCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
