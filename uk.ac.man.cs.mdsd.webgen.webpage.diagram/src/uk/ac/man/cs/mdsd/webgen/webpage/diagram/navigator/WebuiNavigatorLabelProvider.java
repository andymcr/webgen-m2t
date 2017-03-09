package uk.ac.man.cs.mdsd.webgen.webpage.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUpdateUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.DetailsUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.DetailsUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.GalleryUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.GalleryUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.ImageIndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.ImageIndexUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.IndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.IndexUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.MapUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.MapUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SearchUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SearchUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SliderUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SliderUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.StaticUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.StaticUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UpdateUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.WebUIEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiDiagramEditorPlugin;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiParserProvider;
import uk.ac.man.cs.mdsd.webgen.webui.WebUI;

/**
 * @generated
 */
public class WebuiNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		WebuiDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		WebuiDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof WebuiNavigatorItem && !isOwnView(((WebuiNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof WebuiNavigatorGroup) {
			WebuiNavigatorGroup group = (WebuiNavigatorGroup) element;
			return WebuiDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof WebuiNavigatorItem) {
			WebuiNavigatorItem navigatorItem = (WebuiNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (WebuiVisualIDRegistry.getVisualID(view)) {
		case WebUIEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://cs.man.ac.uk/mdsd/webgen/webui?WebUI", //$NON-NLS-1$
					WebuiElementTypes.WebUI_1000);
		case PageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://cs.man.ac.uk/mdsd/webgen/webui?Page", //$NON-NLS-1$
					WebuiElementTypes.Page_2001);
		case CreateUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?CreateUnit", //$NON-NLS-1$
					WebuiElementTypes.CreateUnit_3001);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?CreateUpdateUnit", //$NON-NLS-1$
					WebuiElementTypes.CreateUpdateUnit_3002);
		case DetailsUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DetailsUnit", //$NON-NLS-1$
					WebuiElementTypes.DetailsUnit_3003);
		case GalleryUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?GalleryUnit", //$NON-NLS-1$
					WebuiElementTypes.GalleryUnit_3004);
		case ImageIndexUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?ImageIndexUnit", //$NON-NLS-1$
					WebuiElementTypes.ImageIndexUnit_3005);
		case IndexUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?IndexUnit", //$NON-NLS-1$
					WebuiElementTypes.IndexUnit_3006);
		case MapUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?MapUnit", //$NON-NLS-1$
					WebuiElementTypes.MapUnit_3007);
		case SearchUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?SearchUnit", //$NON-NLS-1$
					WebuiElementTypes.SearchUnit_3008);
		case SliderUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?SliderUnit", //$NON-NLS-1$
					WebuiElementTypes.SliderUnit_3009);
		case StaticUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?StaticUnit", //$NON-NLS-1$
					WebuiElementTypes.StaticUnit_3010);
		case UpdateUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UpdateUnit", //$NON-NLS-1$
					WebuiElementTypes.UpdateUnit_3011);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = WebuiDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && WebuiElementTypes.isKnownElementType(elementType)) {
			image = WebuiElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof WebuiNavigatorGroup) {
			WebuiNavigatorGroup group = (WebuiNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof WebuiNavigatorItem) {
			WebuiNavigatorItem navigatorItem = (WebuiNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (WebuiVisualIDRegistry.getVisualID(view)) {
		case WebUIEditPart.VISUAL_ID:
			return getWebUI_1000Text(view);
		case PageEditPart.VISUAL_ID:
			return getPage_2001Text(view);
		case CreateUnitEditPart.VISUAL_ID:
			return getCreateUnit_3001Text(view);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3002Text(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3003Text(view);
		case GalleryUnitEditPart.VISUAL_ID:
			return getGalleryUnit_3004Text(view);
		case ImageIndexUnitEditPart.VISUAL_ID:
			return getImageIndexUnit_3005Text(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3006Text(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3007Text(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3008Text(view);
		case SliderUnitEditPart.VISUAL_ID:
			return getSliderUnit_3009Text(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3010Text(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3011Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getWebUI_1000Text(View view) {
		WebUI domainModelElement = (WebUI) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDefaultDateFormat();
		} else {
			WebuiDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPage_2001Text(View view) {
		IParser parser = WebuiParserProvider.getParser(WebuiElementTypes.Page_2001,
				view.getElement() != null ? view.getElement() : view,
				WebuiVisualIDRegistry.getType(PageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebuiDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCreateUnit_3001Text(View view) {
		IParser parser = WebuiParserProvider.getParser(WebuiElementTypes.CreateUnit_3001,
				view.getElement() != null ? view.getElement() : view,
				WebuiVisualIDRegistry.getType(CreateUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebuiDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCreateUpdateUnit_3002Text(View view) {
		IParser parser = WebuiParserProvider.getParser(WebuiElementTypes.CreateUpdateUnit_3002,
				view.getElement() != null ? view.getElement() : view,
				WebuiVisualIDRegistry.getType(CreateUpdateUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebuiDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDetailsUnit_3003Text(View view) {
		IParser parser = WebuiParserProvider.getParser(WebuiElementTypes.DetailsUnit_3003,
				view.getElement() != null ? view.getElement() : view,
				WebuiVisualIDRegistry.getType(DetailsUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebuiDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGalleryUnit_3004Text(View view) {
		IParser parser = WebuiParserProvider.getParser(WebuiElementTypes.GalleryUnit_3004,
				view.getElement() != null ? view.getElement() : view,
				WebuiVisualIDRegistry.getType(GalleryUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebuiDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImageIndexUnit_3005Text(View view) {
		IParser parser = WebuiParserProvider.getParser(WebuiElementTypes.ImageIndexUnit_3005,
				view.getElement() != null ? view.getElement() : view,
				WebuiVisualIDRegistry.getType(ImageIndexUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebuiDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndexUnit_3006Text(View view) {
		IParser parser = WebuiParserProvider.getParser(WebuiElementTypes.IndexUnit_3006,
				view.getElement() != null ? view.getElement() : view,
				WebuiVisualIDRegistry.getType(IndexUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebuiDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMapUnit_3007Text(View view) {
		IParser parser = WebuiParserProvider.getParser(WebuiElementTypes.MapUnit_3007,
				view.getElement() != null ? view.getElement() : view,
				WebuiVisualIDRegistry.getType(MapUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebuiDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSearchUnit_3008Text(View view) {
		IParser parser = WebuiParserProvider.getParser(WebuiElementTypes.SearchUnit_3008,
				view.getElement() != null ? view.getElement() : view,
				WebuiVisualIDRegistry.getType(SearchUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebuiDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSliderUnit_3009Text(View view) {
		IParser parser = WebuiParserProvider.getParser(WebuiElementTypes.SliderUnit_3009,
				view.getElement() != null ? view.getElement() : view,
				WebuiVisualIDRegistry.getType(SliderUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebuiDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStaticUnit_3010Text(View view) {
		IParser parser = WebuiParserProvider.getParser(WebuiElementTypes.StaticUnit_3010,
				view.getElement() != null ? view.getElement() : view,
				WebuiVisualIDRegistry.getType(StaticUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebuiDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdateUnit_3011Text(View view) {
		IParser parser = WebuiParserProvider.getParser(WebuiElementTypes.UpdateUnit_3011,
				view.getElement() != null ? view.getElement() : view,
				WebuiVisualIDRegistry.getType(UpdateUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebuiDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return WebUIEditPart.MODEL_ID.equals(WebuiVisualIDRegistry.getModelID(view));
	}

}
