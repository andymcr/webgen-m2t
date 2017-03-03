package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies.CompartmentRepositionLayoutEditPolicy;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies.DynamicMenuMenuEntriesCompartmentItemSemanticEditPolicy;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.Messages;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * @generated
 */
public class DynamicMenuMenuEntriesCompartmentEditPart extends ListCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7145;

	/**
	* @generated
	*/
	public DynamicMenuMenuEntriesCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.DynamicMenuMenuEntriesCompartmentEditPart_title;
	}

	/**
	* @generated
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	* @generated NOT
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DynamicMenuMenuEntriesCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new CompartmentRepositionLayoutEditPolicy(WebuiPackage.Literals.MENU__ENTRIES));
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		return super.getTargetEditPart(request);
	}

}
