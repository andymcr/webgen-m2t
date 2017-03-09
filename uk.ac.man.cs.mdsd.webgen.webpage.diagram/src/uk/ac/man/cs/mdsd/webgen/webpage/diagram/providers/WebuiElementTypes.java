package uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.DetailsUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.GalleryUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.ImageIndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.IndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.MapUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SearchUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SliderUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.StaticUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.WebUIEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiDiagramEditorPlugin;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * @generated
 */
public class WebuiElementTypes {

	/**
	* @generated
	*/
	private WebuiElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			WebuiDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType WebUI_1000 = getElementType("uk.ac.man.cs.mdsd.webgen.webui.diagram.WebUI_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Page_2001 = getElementType("uk.ac.man.cs.mdsd.webgen.webui.diagram.Page_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CreateUnit_3001 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.webui.diagram.CreateUnit_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CreateUpdateUnit_3002 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.webui.diagram.CreateUpdateUnit_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DetailsUnit_3003 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.webui.diagram.DetailsUnit_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GalleryUnit_3004 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.webui.diagram.GalleryUnit_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ImageIndexUnit_3005 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.webui.diagram.ImageIndexUnit_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndexUnit_3006 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.webui.diagram.IndexUnit_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MapUnit_3007 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.webui.diagram.MapUnit_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SearchUnit_3008 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.webui.diagram.SearchUnit_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SliderUnit_3009 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.webui.diagram.SliderUnit_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StaticUnit_3010 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.webui.diagram.StaticUnit_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UpdateUnit_3011 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.webui.diagram.UpdateUnit_3011"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(WebUI_1000, WebuiPackage.eINSTANCE.getWebUI());

			elements.put(Page_2001, WebuiPackage.eINSTANCE.getPage());

			elements.put(CreateUnit_3001, WebuiPackage.eINSTANCE.getCreateUnit());

			elements.put(CreateUpdateUnit_3002, WebuiPackage.eINSTANCE.getCreateUpdateUnit());

			elements.put(DetailsUnit_3003, WebuiPackage.eINSTANCE.getDetailsUnit());

			elements.put(GalleryUnit_3004, WebuiPackage.eINSTANCE.getGalleryUnit());

			elements.put(ImageIndexUnit_3005, WebuiPackage.eINSTANCE.getImageIndexUnit());

			elements.put(IndexUnit_3006, WebuiPackage.eINSTANCE.getIndexUnit());

			elements.put(MapUnit_3007, WebuiPackage.eINSTANCE.getMapUnit());

			elements.put(SearchUnit_3008, WebuiPackage.eINSTANCE.getSearchUnit());

			elements.put(SliderUnit_3009, WebuiPackage.eINSTANCE.getSliderUnit());

			elements.put(StaticUnit_3010, WebuiPackage.eINSTANCE.getStaticUnit());

			elements.put(UpdateUnit_3011, WebuiPackage.eINSTANCE.getUpdateUnit());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(WebUI_1000);
			KNOWN_ELEMENT_TYPES.add(Page_2001);
			KNOWN_ELEMENT_TYPES.add(CreateUnit_3001);
			KNOWN_ELEMENT_TYPES.add(CreateUpdateUnit_3002);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3003);
			KNOWN_ELEMENT_TYPES.add(GalleryUnit_3004);
			KNOWN_ELEMENT_TYPES.add(ImageIndexUnit_3005);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3006);
			KNOWN_ELEMENT_TYPES.add(MapUnit_3007);
			KNOWN_ELEMENT_TYPES.add(SearchUnit_3008);
			KNOWN_ELEMENT_TYPES.add(SliderUnit_3009);
			KNOWN_ELEMENT_TYPES.add(StaticUnit_3010);
			KNOWN_ELEMENT_TYPES.add(UpdateUnit_3011);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WebUIEditPart.VISUAL_ID:
			return WebUI_1000;
		case PageEditPart.VISUAL_ID:
			return Page_2001;
		case CreateUnitEditPart.VISUAL_ID:
			return CreateUnit_3001;
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return CreateUpdateUnit_3002;
		case DetailsUnitEditPart.VISUAL_ID:
			return DetailsUnit_3003;
		case GalleryUnitEditPart.VISUAL_ID:
			return GalleryUnit_3004;
		case ImageIndexUnitEditPart.VISUAL_ID:
			return ImageIndexUnit_3005;
		case IndexUnitEditPart.VISUAL_ID:
			return IndexUnit_3006;
		case MapUnitEditPart.VISUAL_ID:
			return MapUnit_3007;
		case SearchUnitEditPart.VISUAL_ID:
			return SearchUnit_3008;
		case SliderUnitEditPart.VISUAL_ID:
			return SliderUnit_3009;
		case StaticUnitEditPart.VISUAL_ID:
			return StaticUnit_3010;
		case UpdateUnitEditPart.VISUAL_ID:
			return UpdateUnit_3011;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes.getElement(elementTypeAdapter);
		}
	};

}
