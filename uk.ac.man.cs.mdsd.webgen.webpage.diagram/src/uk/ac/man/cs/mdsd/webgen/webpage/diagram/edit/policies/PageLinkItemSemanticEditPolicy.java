package uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;

/**
 * @generated
 */
public class PageLinkItemSemanticEditPolicy extends WebuiBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PageLinkItemSemanticEditPolicy() {
		super(WebuiElementTypes.PageLink_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
