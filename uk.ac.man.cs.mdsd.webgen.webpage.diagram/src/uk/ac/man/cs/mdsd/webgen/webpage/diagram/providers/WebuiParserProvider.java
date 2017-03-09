package uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.man.cs.mdsd.webgen.base.BasePackage;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUpdateUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.DetailsUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.GalleryUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.ImageIndexUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.IndexUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.MapUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SearchUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SliderUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.StaticUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UpdateUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.parsers.MessageFormatParser;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry;

/**
 * @generated
 */
public class WebuiParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser pageName_5012Parser;

	/**
	* @generated
	*/
	private IParser getPageName_5012Parser() {
		if (pageName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pageName_5012Parser = parser;
		}
		return pageName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser createUnitName_5001Parser;

	/**
	* @generated
	*/
	private IParser getCreateUnitName_5001Parser() {
		if (createUnitName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createUnitName_5001Parser = parser;
		}
		return createUnitName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser createUpdateUnitName_5002Parser;

	/**
	* @generated
	*/
	private IParser getCreateUpdateUnitName_5002Parser() {
		if (createUpdateUnitName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createUpdateUnitName_5002Parser = parser;
		}
		return createUpdateUnitName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser detailsUnitName_5003Parser;

	/**
	* @generated
	*/
	private IParser getDetailsUnitName_5003Parser() {
		if (detailsUnitName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			detailsUnitName_5003Parser = parser;
		}
		return detailsUnitName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser galleryUnitName_5004Parser;

	/**
	* @generated
	*/
	private IParser getGalleryUnitName_5004Parser() {
		if (galleryUnitName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			galleryUnitName_5004Parser = parser;
		}
		return galleryUnitName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser imageIndexUnitName_5005Parser;

	/**
	* @generated
	*/
	private IParser getImageIndexUnitName_5005Parser() {
		if (imageIndexUnitName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imageIndexUnitName_5005Parser = parser;
		}
		return imageIndexUnitName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser indexUnitName_5006Parser;

	/**
	* @generated
	*/
	private IParser getIndexUnitName_5006Parser() {
		if (indexUnitName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			indexUnitName_5006Parser = parser;
		}
		return indexUnitName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser mapUnitName_5007Parser;

	/**
	* @generated
	*/
	private IParser getMapUnitName_5007Parser() {
		if (mapUnitName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mapUnitName_5007Parser = parser;
		}
		return mapUnitName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser searchUnitName_5008Parser;

	/**
	* @generated
	*/
	private IParser getSearchUnitName_5008Parser() {
		if (searchUnitName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			searchUnitName_5008Parser = parser;
		}
		return searchUnitName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser sliderUnitName_5009Parser;

	/**
	* @generated
	*/
	private IParser getSliderUnitName_5009Parser() {
		if (sliderUnitName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sliderUnitName_5009Parser = parser;
		}
		return sliderUnitName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser staticUnitName_5010Parser;

	/**
	* @generated
	*/
	private IParser getStaticUnitName_5010Parser() {
		if (staticUnitName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			staticUnitName_5010Parser = parser;
		}
		return staticUnitName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser updateUnitName_5011Parser;

	/**
	* @generated
	*/
	private IParser getUpdateUnitName_5011Parser() {
		if (updateUnitName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateUnitName_5011Parser = parser;
		}
		return updateUnitName_5011Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PageNameEditPart.VISUAL_ID:
			return getPageName_5012Parser();
		case CreateUnitNameEditPart.VISUAL_ID:
			return getCreateUnitName_5001Parser();
		case CreateUpdateUnitNameEditPart.VISUAL_ID:
			return getCreateUpdateUnitName_5002Parser();
		case DetailsUnitNameEditPart.VISUAL_ID:
			return getDetailsUnitName_5003Parser();
		case GalleryUnitNameEditPart.VISUAL_ID:
			return getGalleryUnitName_5004Parser();
		case ImageIndexUnitNameEditPart.VISUAL_ID:
			return getImageIndexUnitName_5005Parser();
		case IndexUnitNameEditPart.VISUAL_ID:
			return getIndexUnitName_5006Parser();
		case MapUnitNameEditPart.VISUAL_ID:
			return getMapUnitName_5007Parser();
		case SearchUnitNameEditPart.VISUAL_ID:
			return getSearchUnitName_5008Parser();
		case SliderUnitNameEditPart.VISUAL_ID:
			return getSliderUnitName_5009Parser();
		case StaticUnitNameEditPart.VISUAL_ID:
			return getStaticUnitName_5010Parser();
		case UpdateUnitNameEditPart.VISUAL_ID:
			return getUpdateUnitName_5011Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(WebuiVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(WebuiVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (WebuiElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
