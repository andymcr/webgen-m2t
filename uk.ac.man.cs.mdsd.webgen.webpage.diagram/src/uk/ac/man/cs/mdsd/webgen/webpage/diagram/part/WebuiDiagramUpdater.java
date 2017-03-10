package uk.ac.man.cs.mdsd.webgen.webpage.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUpdateUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.DetailsUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.DetailsUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.GalleryUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.GalleryUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.ImageIndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.ImageIndexUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.IndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.IndexUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.MapUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.MapUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageLinkEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageUnitCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SearchUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SearchUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SliderUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SliderUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.StaticUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation10EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation2EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation3EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation4EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation5EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation6EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation7EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation8EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation9EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociationEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement10EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement2EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement3EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement4EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement5EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement6EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement7EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement8EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement9EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElementEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UpdateUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.WebUIEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;
import uk.ac.man.cs.mdsd.webgen.webui.ContentUnit;
import uk.ac.man.cs.mdsd.webgen.webui.CreateUnit;
import uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit;
import uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit;
import uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit;
import uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit;
import uk.ac.man.cs.mdsd.webgen.webui.IndexUnit;
import uk.ac.man.cs.mdsd.webgen.webui.MapUnit;
import uk.ac.man.cs.mdsd.webgen.webui.Page;
import uk.ac.man.cs.mdsd.webgen.webui.PageLink;
import uk.ac.man.cs.mdsd.webgen.webui.SearchUnit;
import uk.ac.man.cs.mdsd.webgen.webui.SliderUnit;
import uk.ac.man.cs.mdsd.webgen.webui.UnitField;
import uk.ac.man.cs.mdsd.webgen.webui.UpdateUnit;
import uk.ac.man.cs.mdsd.webgen.webui.WebUI;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * @generated
 */
public class WebuiDiagramUpdater {

	/**
	* @generated
	*/
	public static List<WebuiNodeDescriptor> getSemanticChildren(View view) {
		switch (WebuiVisualIDRegistry.getVisualID(view)) {
		case WebUIEditPart.VISUAL_ID:
			return getWebUI_1000SemanticChildren(view);
		case PageUnitCompartmentEditPart.VISUAL_ID:
			return getPageUnitCompartment_7001SemanticChildren(view);
		case CreateUnitFieldCompartmentEditPart.VISUAL_ID:
			return getCreateUnitFieldCompartment_7002SemanticChildren(view);
		case CreateUpdateUnitFieldCompartmentEditPart.VISUAL_ID:
			return getCreateUpdateUnitFieldCompartment_7003SemanticChildren(view);
		case DetailsUnitFieldCompartmentEditPart.VISUAL_ID:
			return getDetailsUnitFieldCompartment_7004SemanticChildren(view);
		case GalleryUnitFieldCompartmentEditPart.VISUAL_ID:
			return getGalleryUnitFieldCompartment_7005SemanticChildren(view);
		case ImageIndexUnitFieldCompartmentEditPart.VISUAL_ID:
			return getImageIndexUnitFieldCompartment_7006SemanticChildren(view);
		case IndexUnitFieldCompartmentEditPart.VISUAL_ID:
			return getIndexUnitFieldCompartment_7007SemanticChildren(view);
		case MapUnitFieldCompartmentEditPart.VISUAL_ID:
			return getMapUnitFieldCompartment_7008SemanticChildren(view);
		case SearchUnitFieldCompartmentEditPart.VISUAL_ID:
			return getSearchUnitFieldCompartment_7009SemanticChildren(view);
		case SliderUnitFieldCompartmentEditPart.VISUAL_ID:
			return getSliderUnitFieldCompartment_7010SemanticChildren(view);
		case UpdateUnitFieldCompartmentEditPart.VISUAL_ID:
			return getUpdateUnitFieldCompartment_7012SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiNodeDescriptor> getWebUI_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WebUI modelElement = (WebUI) view.getElement();
		LinkedList<WebuiNodeDescriptor> result = new LinkedList<WebuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPages().iterator(); it.hasNext();) {
			Page childElement = (Page) it.next();
			int visualID = WebuiVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PageEditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebuiNodeDescriptor> getPageUnitCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Page modelElement = (Page) containerView.getElement();
		LinkedList<WebuiNodeDescriptor> result = new LinkedList<WebuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUnits().iterator(); it.hasNext();) {
			ContentUnit childElement = (ContentUnit) it.next();
			int visualID = WebuiVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CreateUnitEditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CreateUpdateUnitEditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DetailsUnitEditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GalleryUnitEditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImageIndexUnitEditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IndexUnitEditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MapUnitEditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SearchUnitEditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SliderUnitEditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StaticUnitEditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UpdateUnitEditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebuiNodeDescriptor> getCreateUnitFieldCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CreateUnit modelElement = (CreateUnit) containerView.getElement();
		LinkedList<WebuiNodeDescriptor> result = new LinkedList<WebuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebuiVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitAssociationEditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitElementEditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebuiNodeDescriptor> getCreateUpdateUnitFieldCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CreateUpdateUnit modelElement = (CreateUpdateUnit) containerView.getElement();
		LinkedList<WebuiNodeDescriptor> result = new LinkedList<WebuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebuiVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitAssociation2EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitElement2EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebuiNodeDescriptor> getDetailsUnitFieldCompartment_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DetailsUnit modelElement = (DetailsUnit) containerView.getElement();
		LinkedList<WebuiNodeDescriptor> result = new LinkedList<WebuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebuiVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitAssociation3EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitElement3EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebuiNodeDescriptor> getGalleryUnitFieldCompartment_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GalleryUnit modelElement = (GalleryUnit) containerView.getElement();
		LinkedList<WebuiNodeDescriptor> result = new LinkedList<WebuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebuiVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitAssociation4EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitElement4EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebuiNodeDescriptor> getImageIndexUnitFieldCompartment_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ImageIndexUnit modelElement = (ImageIndexUnit) containerView.getElement();
		LinkedList<WebuiNodeDescriptor> result = new LinkedList<WebuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebuiVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitAssociation5EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitElement5EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebuiNodeDescriptor> getIndexUnitFieldCompartment_7007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndexUnit modelElement = (IndexUnit) containerView.getElement();
		LinkedList<WebuiNodeDescriptor> result = new LinkedList<WebuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebuiVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitAssociation6EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitElement6EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebuiNodeDescriptor> getMapUnitFieldCompartment_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MapUnit modelElement = (MapUnit) containerView.getElement();
		LinkedList<WebuiNodeDescriptor> result = new LinkedList<WebuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebuiVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitAssociation7EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitElement7EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebuiNodeDescriptor> getSearchUnitFieldCompartment_7009SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SearchUnit modelElement = (SearchUnit) containerView.getElement();
		LinkedList<WebuiNodeDescriptor> result = new LinkedList<WebuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebuiVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitAssociation8EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitElement8EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebuiNodeDescriptor> getSliderUnitFieldCompartment_7010SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SliderUnit modelElement = (SliderUnit) containerView.getElement();
		LinkedList<WebuiNodeDescriptor> result = new LinkedList<WebuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebuiVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitAssociation9EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitElement9EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebuiNodeDescriptor> getUpdateUnitFieldCompartment_7012SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UpdateUnit modelElement = (UpdateUnit) containerView.getElement();
		LinkedList<WebuiNodeDescriptor> result = new LinkedList<WebuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebuiVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitAssociation10EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitElement10EditPart.VISUAL_ID) {
				result.add(new WebuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getContainedLinks(View view) {
		switch (WebuiVisualIDRegistry.getVisualID(view)) {
		case WebUIEditPart.VISUAL_ID:
			return getWebUI_1000ContainedLinks(view);
		case PageEditPart.VISUAL_ID:
			return getPage_2001ContainedLinks(view);
		case CreateUnitEditPart.VISUAL_ID:
			return getCreateUnit_3001ContainedLinks(view);
		case UnitAssociationEditPart.VISUAL_ID:
			return getUnitAssociation_3012ContainedLinks(view);
		case UnitElementEditPart.VISUAL_ID:
			return getUnitElement_3013ContainedLinks(view);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3002ContainedLinks(view);
		case UnitAssociation2EditPart.VISUAL_ID:
			return getUnitAssociation_3014ContainedLinks(view);
		case UnitElement2EditPart.VISUAL_ID:
			return getUnitElement_3015ContainedLinks(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3003ContainedLinks(view);
		case UnitAssociation3EditPart.VISUAL_ID:
			return getUnitAssociation_3016ContainedLinks(view);
		case UnitElement3EditPart.VISUAL_ID:
			return getUnitElement_3017ContainedLinks(view);
		case GalleryUnitEditPart.VISUAL_ID:
			return getGalleryUnit_3004ContainedLinks(view);
		case UnitAssociation4EditPart.VISUAL_ID:
			return getUnitAssociation_3018ContainedLinks(view);
		case UnitElement4EditPart.VISUAL_ID:
			return getUnitElement_3019ContainedLinks(view);
		case ImageIndexUnitEditPart.VISUAL_ID:
			return getImageIndexUnit_3005ContainedLinks(view);
		case UnitAssociation5EditPart.VISUAL_ID:
			return getUnitAssociation_3020ContainedLinks(view);
		case UnitElement5EditPart.VISUAL_ID:
			return getUnitElement_3021ContainedLinks(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3006ContainedLinks(view);
		case UnitAssociation6EditPart.VISUAL_ID:
			return getUnitAssociation_3022ContainedLinks(view);
		case UnitElement6EditPart.VISUAL_ID:
			return getUnitElement_3023ContainedLinks(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3007ContainedLinks(view);
		case UnitAssociation7EditPart.VISUAL_ID:
			return getUnitAssociation_3024ContainedLinks(view);
		case UnitElement7EditPart.VISUAL_ID:
			return getUnitElement_3025ContainedLinks(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3008ContainedLinks(view);
		case UnitAssociation8EditPart.VISUAL_ID:
			return getUnitAssociation_3026ContainedLinks(view);
		case UnitElement8EditPart.VISUAL_ID:
			return getUnitElement_3027ContainedLinks(view);
		case SliderUnitEditPart.VISUAL_ID:
			return getSliderUnit_3009ContainedLinks(view);
		case UnitAssociation9EditPart.VISUAL_ID:
			return getUnitAssociation_3028ContainedLinks(view);
		case UnitElement9EditPart.VISUAL_ID:
			return getUnitElement_3029ContainedLinks(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3010ContainedLinks(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3011ContainedLinks(view);
		case UnitAssociation10EditPart.VISUAL_ID:
			return getUnitAssociation_3030ContainedLinks(view);
		case UnitElement10EditPart.VISUAL_ID:
			return getUnitElement_3031ContainedLinks(view);
		case PageLinkEditPart.VISUAL_ID:
			return getPageLink_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getIncomingLinks(View view) {
		switch (WebuiVisualIDRegistry.getVisualID(view)) {
		case PageEditPart.VISUAL_ID:
			return getPage_2001IncomingLinks(view);
		case CreateUnitEditPart.VISUAL_ID:
			return getCreateUnit_3001IncomingLinks(view);
		case UnitAssociationEditPart.VISUAL_ID:
			return getUnitAssociation_3012IncomingLinks(view);
		case UnitElementEditPart.VISUAL_ID:
			return getUnitElement_3013IncomingLinks(view);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3002IncomingLinks(view);
		case UnitAssociation2EditPart.VISUAL_ID:
			return getUnitAssociation_3014IncomingLinks(view);
		case UnitElement2EditPart.VISUAL_ID:
			return getUnitElement_3015IncomingLinks(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3003IncomingLinks(view);
		case UnitAssociation3EditPart.VISUAL_ID:
			return getUnitAssociation_3016IncomingLinks(view);
		case UnitElement3EditPart.VISUAL_ID:
			return getUnitElement_3017IncomingLinks(view);
		case GalleryUnitEditPart.VISUAL_ID:
			return getGalleryUnit_3004IncomingLinks(view);
		case UnitAssociation4EditPart.VISUAL_ID:
			return getUnitAssociation_3018IncomingLinks(view);
		case UnitElement4EditPart.VISUAL_ID:
			return getUnitElement_3019IncomingLinks(view);
		case ImageIndexUnitEditPart.VISUAL_ID:
			return getImageIndexUnit_3005IncomingLinks(view);
		case UnitAssociation5EditPart.VISUAL_ID:
			return getUnitAssociation_3020IncomingLinks(view);
		case UnitElement5EditPart.VISUAL_ID:
			return getUnitElement_3021IncomingLinks(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3006IncomingLinks(view);
		case UnitAssociation6EditPart.VISUAL_ID:
			return getUnitAssociation_3022IncomingLinks(view);
		case UnitElement6EditPart.VISUAL_ID:
			return getUnitElement_3023IncomingLinks(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3007IncomingLinks(view);
		case UnitAssociation7EditPart.VISUAL_ID:
			return getUnitAssociation_3024IncomingLinks(view);
		case UnitElement7EditPart.VISUAL_ID:
			return getUnitElement_3025IncomingLinks(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3008IncomingLinks(view);
		case UnitAssociation8EditPart.VISUAL_ID:
			return getUnitAssociation_3026IncomingLinks(view);
		case UnitElement8EditPart.VISUAL_ID:
			return getUnitElement_3027IncomingLinks(view);
		case SliderUnitEditPart.VISUAL_ID:
			return getSliderUnit_3009IncomingLinks(view);
		case UnitAssociation9EditPart.VISUAL_ID:
			return getUnitAssociation_3028IncomingLinks(view);
		case UnitElement9EditPart.VISUAL_ID:
			return getUnitElement_3029IncomingLinks(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3010IncomingLinks(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3011IncomingLinks(view);
		case UnitAssociation10EditPart.VISUAL_ID:
			return getUnitAssociation_3030IncomingLinks(view);
		case UnitElement10EditPart.VISUAL_ID:
			return getUnitElement_3031IncomingLinks(view);
		case PageLinkEditPart.VISUAL_ID:
			return getPageLink_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getOutgoingLinks(View view) {
		switch (WebuiVisualIDRegistry.getVisualID(view)) {
		case PageEditPart.VISUAL_ID:
			return getPage_2001OutgoingLinks(view);
		case CreateUnitEditPart.VISUAL_ID:
			return getCreateUnit_3001OutgoingLinks(view);
		case UnitAssociationEditPart.VISUAL_ID:
			return getUnitAssociation_3012OutgoingLinks(view);
		case UnitElementEditPart.VISUAL_ID:
			return getUnitElement_3013OutgoingLinks(view);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3002OutgoingLinks(view);
		case UnitAssociation2EditPart.VISUAL_ID:
			return getUnitAssociation_3014OutgoingLinks(view);
		case UnitElement2EditPart.VISUAL_ID:
			return getUnitElement_3015OutgoingLinks(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3003OutgoingLinks(view);
		case UnitAssociation3EditPart.VISUAL_ID:
			return getUnitAssociation_3016OutgoingLinks(view);
		case UnitElement3EditPart.VISUAL_ID:
			return getUnitElement_3017OutgoingLinks(view);
		case GalleryUnitEditPart.VISUAL_ID:
			return getGalleryUnit_3004OutgoingLinks(view);
		case UnitAssociation4EditPart.VISUAL_ID:
			return getUnitAssociation_3018OutgoingLinks(view);
		case UnitElement4EditPart.VISUAL_ID:
			return getUnitElement_3019OutgoingLinks(view);
		case ImageIndexUnitEditPart.VISUAL_ID:
			return getImageIndexUnit_3005OutgoingLinks(view);
		case UnitAssociation5EditPart.VISUAL_ID:
			return getUnitAssociation_3020OutgoingLinks(view);
		case UnitElement5EditPart.VISUAL_ID:
			return getUnitElement_3021OutgoingLinks(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3006OutgoingLinks(view);
		case UnitAssociation6EditPart.VISUAL_ID:
			return getUnitAssociation_3022OutgoingLinks(view);
		case UnitElement6EditPart.VISUAL_ID:
			return getUnitElement_3023OutgoingLinks(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3007OutgoingLinks(view);
		case UnitAssociation7EditPart.VISUAL_ID:
			return getUnitAssociation_3024OutgoingLinks(view);
		case UnitElement7EditPart.VISUAL_ID:
			return getUnitElement_3025OutgoingLinks(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3008OutgoingLinks(view);
		case UnitAssociation8EditPart.VISUAL_ID:
			return getUnitAssociation_3026OutgoingLinks(view);
		case UnitElement8EditPart.VISUAL_ID:
			return getUnitElement_3027OutgoingLinks(view);
		case SliderUnitEditPart.VISUAL_ID:
			return getSliderUnit_3009OutgoingLinks(view);
		case UnitAssociation9EditPart.VISUAL_ID:
			return getUnitAssociation_3028OutgoingLinks(view);
		case UnitElement9EditPart.VISUAL_ID:
			return getUnitElement_3029OutgoingLinks(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3010OutgoingLinks(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3011OutgoingLinks(view);
		case UnitAssociation10EditPart.VISUAL_ID:
			return getUnitAssociation_3030OutgoingLinks(view);
		case UnitElement10EditPart.VISUAL_ID:
			return getUnitElement_3031OutgoingLinks(view);
		case PageLinkEditPart.VISUAL_ID:
			return getPageLink_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getWebUI_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getPage_2001ContainedLinks(View view) {
		Page modelElement = (Page) view.getElement();
		LinkedList<WebuiLinkDescriptor> result = new LinkedList<WebuiLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PageLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getCreateUnit_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getCreateUpdateUnit_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getDetailsUnit_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getGalleryUnit_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getImageIndexUnit_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getIndexUnit_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getMapUnit_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getSearchUnit_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getSliderUnit_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getStaticUnit_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getUpdateUnit_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getPageLink_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getPage_2001IncomingLinks(View view) {
		Page modelElement = (Page) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebuiLinkDescriptor> result = new LinkedList<WebuiLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PageLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getCreateUnit_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getCreateUpdateUnit_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getDetailsUnit_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getGalleryUnit_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getImageIndexUnit_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getIndexUnit_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3023IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getMapUnit_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getSearchUnit_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getSliderUnit_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3028IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3029IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getStaticUnit_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getUpdateUnit_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3030IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3031IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getPageLink_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getPage_2001OutgoingLinks(View view) {
		Page modelElement = (Page) view.getElement();
		LinkedList<WebuiLinkDescriptor> result = new LinkedList<WebuiLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PageLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getCreateUnit_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getCreateUpdateUnit_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getDetailsUnit_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getGalleryUnit_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getImageIndexUnit_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getIndexUnit_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getMapUnit_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getSearchUnit_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getSliderUnit_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3028OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3029OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getStaticUnit_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebuiLinkDescriptor> getUpdateUnit_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitAssociation_3030OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getUnitElement_3031OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebuiLinkDescriptor> getPageLink_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<WebuiLinkDescriptor> getContainedTypeModelFacetLinks_PageLink_4001(Page container) {
		LinkedList<WebuiLinkDescriptor> result = new LinkedList<WebuiLinkDescriptor>();
		PageLink link = container.getParentPage();
		if (PageLinkEditPart.VISUAL_ID != WebuiVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Page dst = link.getTargetPage();
		result.add(new WebuiLinkDescriptor(container, dst, link, WebuiElementTypes.PageLink_4001,
				PageLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WebuiLinkDescriptor> getIncomingTypeModelFacetLinks_PageLink_4001(Page target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebuiLinkDescriptor> result = new LinkedList<WebuiLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WebuiPackage.eINSTANCE.getPageLink_TargetPage()
					|| false == setting.getEObject() instanceof PageLink) {
				continue;
			}
			PageLink link = (PageLink) setting.getEObject();
			if (PageLinkEditPart.VISUAL_ID != WebuiVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Page) {
				continue;
			}
			Page container = (Page) link.eContainer();
			result.add(new WebuiLinkDescriptor(container, target, link, WebuiElementTypes.PageLink_4001,
					PageLinkEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<WebuiNodeDescriptor> getSemanticChildren(View view) {
			return WebuiDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WebuiLinkDescriptor> getContainedLinks(View view) {
			return WebuiDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WebuiLinkDescriptor> getIncomingLinks(View view) {
			return WebuiDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WebuiLinkDescriptor> getOutgoingLinks(View view) {
			return WebuiDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
