package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies.CompartmentRepositionLayoutEditPolicy;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies.PageInterfaceUnitsCompartmentCanonicalEditPolicy;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies.PageInterfaceUnitsCompartmentItemSemanticEditPolicy;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.Messages;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * @generated
 */
public class PageInterfaceUnitsCompartmentEditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7146;

	/**
	* @generated
	*/
	public PageInterfaceUnitsCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.PageInterfaceUnitsCompartmentEditPart_title;
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
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PageInterfaceUnitsCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(WebsiteVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new PageInterfaceUnitsCompartmentCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new CompartmentRepositionLayoutEditPolicy(WebuiPackage.Literals.UNIT_CONTAINER__UNITS));
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
			if (type == WebsiteElementTypes.CreateUnit_3286) {
				return this;
			}
			if (type == WebsiteElementTypes.CreateUpdateUnit_3291) {
				return this;
			}
			if (type == WebsiteElementTypes.CreateSitemapUnit_3298) {
				return this;
			}
			if (type == WebsiteElementTypes.DetailsUnit_3299) {
				return this;
			}
			if (type == WebsiteElementTypes.IndexUnit_3341) {
				return this;
			}
			if (type == WebsiteElementTypes.MapUnit_3357) {
				return this;
			}
			if (type == WebsiteElementTypes.SearchUnit_3358) {
				return this;
			}
			if (type == WebsiteElementTypes.StaticUnit_3363) {
				return this;
			}
			if (type == WebsiteElementTypes.UpdateUnit_3364) {
				return this;
			}
			if (type == WebsiteElementTypes.ImageIndexUnit_3374) {
				return this;
			}
			if (type == WebsiteElementTypes.SliderUnit_3378) {
				return this;
			}
			if (type == WebsiteElementTypes.GalleryUnit_3379) {
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
