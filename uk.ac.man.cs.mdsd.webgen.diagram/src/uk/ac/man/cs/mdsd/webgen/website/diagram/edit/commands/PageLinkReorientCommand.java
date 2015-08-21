package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import uk.ac.man.cs.mdsd.webgen.website.Page;
import uk.ac.man.cs.mdsd.webgen.website.PageLink;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies.WebsiteBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class PageLinkReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public PageLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof PageLink) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Page && newEnd instanceof Page)) {
			return false;
		}
		Page target = getLink().getTargetPage();
		return WebsiteBaseItemSemanticEditPolicy.getLinkConstraints().canExistPageLink_4003(getLink(), getNewSource(),
				target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Page && newEnd instanceof Page)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Page)) {
			return false;
		}
		Page source = (Page) getLink().eContainer();
		return WebsiteBaseItemSemanticEditPolicy.getLinkConstraints().canExistPageLink_4003(getLink(), source,
				getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setParentPage(null);
		getNewSource().setParentPage(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTargetPage(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected PageLink getLink() {
		return (PageLink) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Page getOldSource() {
		return (Page) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Page getNewSource() {
		return (Page) newEnd;
	}

	/**
	 * @generated
	 */
	protected Page getOldTarget() {
		return (Page) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Page getNewTarget() {
		return (Page) newEnd;
	}
}
