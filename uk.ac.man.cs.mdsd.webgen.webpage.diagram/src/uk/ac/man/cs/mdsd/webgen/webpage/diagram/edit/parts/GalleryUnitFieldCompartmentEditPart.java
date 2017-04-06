package uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies.CompartmentRepositionLayoutEditPolicy;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies.GalleryUnitFieldCompartmentCanonicalEditPolicy;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.policies.GalleryUnitFieldCompartmentItemSemanticEditPolicy;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.Messages;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * @generated
 */
public class GalleryUnitFieldCompartmentEditPart extends ListCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7005;

	/**
	* @generated
	*/
	public GalleryUnitFieldCompartmentEditPart(View view) {
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
		return Messages.GalleryUnitFieldCompartmentEditPart_title;
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
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new GalleryUnitFieldCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(WebuiVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new GalleryUnitFieldCompartmentCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new CompartmentRepositionLayoutEditPolicy(WebuiPackage.Literals.DYNAMIC_UNIT__DISPLAY_FIELDS));
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
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == WebuiElementTypes.UnitAssociation_3018) {
				return this;
			}
			if (type == WebuiElementTypes.UnitElement_3019) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
