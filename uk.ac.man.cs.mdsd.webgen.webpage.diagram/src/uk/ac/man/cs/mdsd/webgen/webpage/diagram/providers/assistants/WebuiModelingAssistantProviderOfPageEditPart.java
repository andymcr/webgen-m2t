package uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiModelingAssistantProvider;

/**
 * @generated
 */
public class WebuiModelingAssistantProviderOfPageEditPart extends WebuiModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(11);
		types.add(WebuiElementTypes.CreateUnit_3001);
		types.add(WebuiElementTypes.CreateUpdateUnit_3002);
		types.add(WebuiElementTypes.DetailsUnit_3003);
		types.add(WebuiElementTypes.GalleryUnit_3004);
		types.add(WebuiElementTypes.ImageIndexUnit_3005);
		types.add(WebuiElementTypes.IndexUnit_3006);
		types.add(WebuiElementTypes.MapUnit_3007);
		types.add(WebuiElementTypes.SearchUnit_3008);
		types.add(WebuiElementTypes.SliderUnit_3009);
		types.add(WebuiElementTypes.StaticUnit_3010);
		types.add(WebuiElementTypes.UpdateUnit_3011);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((PageEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(PageEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WebuiElementTypes.PageLink_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((PageEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(PageEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PageEditPart) {
			types.add(WebuiElementTypes.PageLink_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((PageEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(PageEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WebuiElementTypes.PageLink_4001) {
			types.add(WebuiElementTypes.Page_2001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((PageEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(PageEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WebuiElementTypes.PageLink_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((PageEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(PageEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WebuiElementTypes.PageLink_4001) {
			types.add(WebuiElementTypes.Page_2001);
		}
		return types;
	}

}
