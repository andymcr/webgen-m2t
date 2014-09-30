package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.MenuIncludedElementCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class DynamicMenuUnitFieldCompartmentItemSemanticEditPolicy extends
		WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DynamicMenuUnitFieldCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.DynamicMenu_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.MenuIncludedElement_3149 == req
				.getElementType()) {
			return getGEFWrapper(new MenuIncludedElementCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
