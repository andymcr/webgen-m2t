package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.View;
import uk.ac.man.cs.mdsd.webgen.persistence.ViewAssociation;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies.WebsiteBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ViewAssociationReorientCommand extends EditElementCommand {

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
	public ViewAssociationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ViewAssociation) {
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
		if (!(oldEnd instanceof View && newEnd instanceof View)) {
			return false;
		}
		EncapsulatedAssociation target = getLink().getOpposite();
		return WebsiteBaseItemSemanticEditPolicy.getLinkConstraints().canExistViewAssociation_4007(getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof EncapsulatedAssociation && newEnd instanceof EncapsulatedAssociation)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof View)) {
			return false;
		}
		View source = (View) getLink().eContainer();
		return WebsiteBaseItemSemanticEditPolicy.getLinkConstraints().canExistViewAssociation_4007(getLink(), source,
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
		getOldSource().getViewFeatures().remove(getLink());
		getNewSource().getViewFeatures().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setOpposite(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected ViewAssociation getLink() {
		return (ViewAssociation) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected View getOldSource() {
		return (View) oldEnd;
	}

	/**
	* @generated
	*/
	protected View getNewSource() {
		return (View) newEnd;
	}

	/**
	* @generated
	*/
	protected EncapsulatedAssociation getOldTarget() {
		return (EncapsulatedAssociation) oldEnd;
	}

	/**
	* @generated
	*/
	protected EncapsulatedAssociation getNewTarget() {
		return (EncapsulatedAssociation) newEnd;
	}
}
