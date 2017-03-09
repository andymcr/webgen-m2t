package uk.ac.man.cs.mdsd.webgen.webpage.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.DetailsUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.GalleryUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.ImageIndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.IndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.MapUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageUnitCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SearchUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SliderUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.StaticUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.WebUIEditPart;
import uk.ac.man.cs.mdsd.webgen.webui.ContentUnit;
import uk.ac.man.cs.mdsd.webgen.webui.Page;
import uk.ac.man.cs.mdsd.webgen.webui.WebUI;

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
	public static List<WebuiLinkDescriptor> getContainedLinks(View view) {
		switch (WebuiVisualIDRegistry.getVisualID(view)) {
		case WebUIEditPart.VISUAL_ID:
			return getWebUI_1000ContainedLinks(view);
		case PageEditPart.VISUAL_ID:
			return getPage_2001ContainedLinks(view);
		case CreateUnitEditPart.VISUAL_ID:
			return getCreateUnit_3001ContainedLinks(view);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3002ContainedLinks(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3003ContainedLinks(view);
		case GalleryUnitEditPart.VISUAL_ID:
			return getGalleryUnit_3004ContainedLinks(view);
		case ImageIndexUnitEditPart.VISUAL_ID:
			return getImageIndexUnit_3005ContainedLinks(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3006ContainedLinks(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3007ContainedLinks(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3008ContainedLinks(view);
		case SliderUnitEditPart.VISUAL_ID:
			return getSliderUnit_3009ContainedLinks(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3010ContainedLinks(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3011ContainedLinks(view);
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
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3002IncomingLinks(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3003IncomingLinks(view);
		case GalleryUnitEditPart.VISUAL_ID:
			return getGalleryUnit_3004IncomingLinks(view);
		case ImageIndexUnitEditPart.VISUAL_ID:
			return getImageIndexUnit_3005IncomingLinks(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3006IncomingLinks(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3007IncomingLinks(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3008IncomingLinks(view);
		case SliderUnitEditPart.VISUAL_ID:
			return getSliderUnit_3009IncomingLinks(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3010IncomingLinks(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3011IncomingLinks(view);
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
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3002OutgoingLinks(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3003OutgoingLinks(view);
		case GalleryUnitEditPart.VISUAL_ID:
			return getGalleryUnit_3004OutgoingLinks(view);
		case ImageIndexUnitEditPart.VISUAL_ID:
			return getImageIndexUnit_3005OutgoingLinks(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3006OutgoingLinks(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3007OutgoingLinks(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3008OutgoingLinks(view);
		case SliderUnitEditPart.VISUAL_ID:
			return getSliderUnit_3009OutgoingLinks(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3010OutgoingLinks(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3011OutgoingLinks(view);
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
		return Collections.emptyList();
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
	public static List<WebuiLinkDescriptor> getCreateUpdateUnit_3002ContainedLinks(View view) {
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
	public static List<WebuiLinkDescriptor> getGalleryUnit_3004ContainedLinks(View view) {
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
	public static List<WebuiLinkDescriptor> getIndexUnit_3006ContainedLinks(View view) {
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
	public static List<WebuiLinkDescriptor> getSearchUnit_3008ContainedLinks(View view) {
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
	public static List<WebuiLinkDescriptor> getPage_2001IncomingLinks(View view) {
		return Collections.emptyList();
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
	public static List<WebuiLinkDescriptor> getCreateUpdateUnit_3002IncomingLinks(View view) {
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
	public static List<WebuiLinkDescriptor> getGalleryUnit_3004IncomingLinks(View view) {
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
	public static List<WebuiLinkDescriptor> getIndexUnit_3006IncomingLinks(View view) {
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
	public static List<WebuiLinkDescriptor> getSearchUnit_3008IncomingLinks(View view) {
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
	public static List<WebuiLinkDescriptor> getPage_2001OutgoingLinks(View view) {
		return Collections.emptyList();
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
	public static List<WebuiLinkDescriptor> getCreateUpdateUnit_3002OutgoingLinks(View view) {
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
	public static List<WebuiLinkDescriptor> getGalleryUnit_3004OutgoingLinks(View view) {
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
	public static List<WebuiLinkDescriptor> getIndexUnit_3006OutgoingLinks(View view) {
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
	public static List<WebuiLinkDescriptor> getSearchUnit_3008OutgoingLinks(View view) {
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
