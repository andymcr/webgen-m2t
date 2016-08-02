package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies.PageItemSemanticEditPolicy;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class PageEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public PageEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(WebsiteVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PageItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new PageFigure();
	}

	/**
	 * @generated
	 */
	public PageFigure getPrimaryShape() {
		return (PageFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PageNameEditPart) {
			((PageNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigurePageNameLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PageNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(80, 100);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(WebsiteVisualIDRegistry.getType(PageNameEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == WebsiteElementTypes.CreateUnit_3103) {
				return getChildBySemanticHint(
						WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebsiteElementTypes.CreateUpdateUnit_3104) {
				return getChildBySemanticHint(
						WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebsiteElementTypes.CreateSitemapUnit_3157) {
				return getChildBySemanticHint(
						WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebsiteElementTypes.DetailsUnit_3105) {
				return getChildBySemanticHint(
						WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebsiteElementTypes.IndexUnit_3136) {
				return getChildBySemanticHint(
						WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebsiteElementTypes.MapUnit_3228) {
				return getChildBySemanticHint(
						WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebsiteElementTypes.SearchUnit_3109) {
				return getChildBySemanticHint(
						WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebsiteElementTypes.StaticUnit_3110) {
				return getChildBySemanticHint(
						WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebsiteElementTypes.UpdateUnit_3111) {
				return getChildBySemanticHint(
						WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			}
			if (type == WebsiteElementTypes.SliderUnit_3261) {
				return getChildBySemanticHint(
						WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class PageFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePageNameLabelFigure;

		/**
		 * @generated
		 */
		public PageFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_CENTER);
			layoutThis.setMajorSpacing(2);
			layoutThis.setMinorSpacing(2);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10)));
			this.setLineWidth(2);
			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePageNameLabelFigure = new WrappingLabel();

			fFigurePageNameLabelFigure.setText("");

			this.add(fFigurePageNameLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePageNameLabelFigure() {
			return fFigurePageNameLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 128, 0, 128);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 221, 160, 221);

}
