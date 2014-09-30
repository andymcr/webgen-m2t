package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.EnumerationLiteralCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class EnumerationTypeEnumerationsCompartmentItemSemanticEditPolicy
		extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EnumerationTypeEnumerationsCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.EnumerationType_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.EnumerationLiteral_3028 == req.getElementType()) {
			return getGEFWrapper(new EnumerationLiteralCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
