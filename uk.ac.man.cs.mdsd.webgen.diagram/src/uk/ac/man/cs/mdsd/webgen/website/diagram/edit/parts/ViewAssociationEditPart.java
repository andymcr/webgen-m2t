package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies.ViewAssociationItemSemanticEditPolicy;

/**
 * @generated
 */
public class ViewAssociationEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4004;

	/**
	* @generated
	*/
	public ViewAssociationEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ViewAssociationItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new AssociationWithoutContainmentFigure();
	}

	/**
	* @generated
	*/
	public AssociationWithoutContainmentFigure getPrimaryShape() {
		return (AssociationWithoutContainmentFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class AssociationWithoutContainmentFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssociationWithoutContainmentNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssociationWithoutContainmentMultiplicityFigure;

		/**
		 * @generated
		 */
		public AssociationWithoutContainmentFigure() {

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAssociationWithoutContainmentNameFigure = new WrappingLabel();

			fFigureAssociationWithoutContainmentNameFigure.setText("");

			this.add(fFigureAssociationWithoutContainmentNameFigure);

			fFigureAssociationWithoutContainmentMultiplicityFigure = new WrappingLabel();

			fFigureAssociationWithoutContainmentMultiplicityFigure.setText("");

			this.add(fFigureAssociationWithoutContainmentMultiplicityFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(1));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(-1));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssociationWithoutContainmentNameFigure() {
			return fFigureAssociationWithoutContainmentNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssociationWithoutContainmentMultiplicityFigure() {
			return fFigureAssociationWithoutContainmentMultiplicityFigure;
		}

	}

}
