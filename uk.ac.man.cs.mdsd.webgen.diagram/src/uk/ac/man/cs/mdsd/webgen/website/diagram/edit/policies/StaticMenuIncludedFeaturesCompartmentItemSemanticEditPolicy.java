package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.EditStaticTextMenuEntryCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.FixedActionMenuEntryCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.FixedCommandMenuEntryCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.FixedPageMenuEntryCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class StaticMenuIncludedFeaturesCompartmentItemSemanticEditPolicy extends
		WebsiteBaseItemSemanticEditPolicy {

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
		if (WebsiteElementTypes.FixedPageMenuEntry_3158 == req.getElementType()) {
			return getGEFWrapper(new FixedPageMenuEntryCreateCommand(req));
		}
		if (WebsiteElementTypes.FixedActionMenuEntry_3159 == req
				.getElementType()) {
			return getGEFWrapper(new FixedActionMenuEntryCreateCommand(req));
		}
		if (WebsiteElementTypes.FixedCommandMenuEntry_3231 == req
				.getElementType()) {
			return getGEFWrapper(new FixedCommandMenuEntryCreateCommand(req));
		}
		if (WebsiteElementTypes.EditStaticTextMenuEntry_3156 == req
				.getElementType()) {
			return getGEFWrapper(new EditStaticTextMenuEntryCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
