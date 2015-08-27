package uk.ac.man.cs.mdsd.webgen.website.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EntityEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteModelingAssistantProvider;

/**
 * @generated
 */
public class WebsiteModelingAssistantProviderOfEntityEditPart extends WebsiteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(WebsiteElementTypes.DataTypeAttribute_3054);
		types.add(WebsiteElementTypes.DateAttribute_3014);
		types.add(WebsiteElementTypes.FileAttribute_3152);
		types.add(WebsiteElementTypes.ImageAttribute_3235);
		types.add(WebsiteElementTypes.LocationAttribute_3230);
		types.add(WebsiteElementTypes.ModelLabelY_3237);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((EntityEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(EntityEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebsiteElementTypes.AssociationWithoutContainment_4001);
		types.add(WebsiteElementTypes.AssociationWithContainment_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((EntityEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(EntityEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EntityEditPart) {
			types.add(WebsiteElementTypes.AssociationWithoutContainment_4001);
		}
		if (targetEditPart instanceof EntityEditPart) {
			types.add(WebsiteElementTypes.AssociationWithContainment_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((EntityEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(EntityEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WebsiteElementTypes.AssociationWithoutContainment_4001) {
			types.add(WebsiteElementTypes.Entity_2003);
		} else if (relationshipType == WebsiteElementTypes.AssociationWithContainment_4002) {
			types.add(WebsiteElementTypes.Entity_2003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((EntityEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(EntityEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebsiteElementTypes.AssociationWithoutContainment_4001);
		types.add(WebsiteElementTypes.AssociationWithContainment_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((EntityEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(EntityEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WebsiteElementTypes.AssociationWithoutContainment_4001) {
			types.add(WebsiteElementTypes.Entity_2003);
		} else if (relationshipType == WebsiteElementTypes.AssociationWithContainment_4002) {
			types.add(WebsiteElementTypes.Entity_2003);
		}
		return types;
	}

}
