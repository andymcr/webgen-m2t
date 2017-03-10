package uk.ac.man.cs.mdsd.webgen.webpage.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUpdateUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUpdateUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.DetailsUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.DetailsUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.DetailsUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.GalleryUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.GalleryUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.GalleryUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.ImageIndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.ImageIndexUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.ImageIndexUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.IndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.IndexUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.IndexUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.MapUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.MapUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.MapUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageLinkEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageUnitCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SearchUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SearchUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SearchUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SliderUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SliderUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SliderUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.StaticUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.StaticUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.StaticUnitNameEditPart;
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
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociationName10EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociationName2EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociationName3EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociationName4EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociationName5EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociationName6EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociationName7EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociationName8EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociationName9EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociationNameEditPart;
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
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElementName10EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElementName2EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElementName3EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElementName4EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElementName5EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElementName6EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElementName7EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElementName8EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElementName9EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElementNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UpdateUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UpdateUnitNameEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.WebUIEditPart;
import uk.ac.man.cs.mdsd.webgen.webui.WebUI;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class WebuiVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "uk.ac.man.cs.mdsd.webgen.webui.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WebUIEditPart.MODEL_ID.equals(view.getType())) {
				return WebUIEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				WebuiDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WebuiPackage.eINSTANCE.getWebUI().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((WebUI) domainElement)) {
			return WebUIEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry
				.getModelID(containerView);
		if (!WebUIEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (WebUIEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebUIEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WebUIEditPart.VISUAL_ID:
			if (WebuiPackage.eINSTANCE.getPage().isSuperTypeOf(domainElement.eClass())) {
				return PageEditPart.VISUAL_ID;
			}
			break;
		case PageUnitCompartmentEditPart.VISUAL_ID:
			if (WebuiPackage.eINSTANCE.getCreateUnit().isSuperTypeOf(domainElement.eClass())) {
				return CreateUnitEditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getCreateUpdateUnit().isSuperTypeOf(domainElement.eClass())) {
				return CreateUpdateUnitEditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getDetailsUnit().isSuperTypeOf(domainElement.eClass())) {
				return DetailsUnitEditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getGalleryUnit().isSuperTypeOf(domainElement.eClass())) {
				return GalleryUnitEditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getImageIndexUnit().isSuperTypeOf(domainElement.eClass())) {
				return ImageIndexUnitEditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getIndexUnit().isSuperTypeOf(domainElement.eClass())) {
				return IndexUnitEditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getMapUnit().isSuperTypeOf(domainElement.eClass())) {
				return MapUnitEditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getSearchUnit().isSuperTypeOf(domainElement.eClass())) {
				return SearchUnitEditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getSliderUnit().isSuperTypeOf(domainElement.eClass())) {
				return SliderUnitEditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getStaticUnit().isSuperTypeOf(domainElement.eClass())) {
				return StaticUnitEditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getUpdateUnit().isSuperTypeOf(domainElement.eClass())) {
				return UpdateUnitEditPart.VISUAL_ID;
			}
			break;
		case CreateUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebuiPackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociationEditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElementEditPart.VISUAL_ID;
			}
			break;
		case CreateUpdateUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebuiPackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation2EditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement2EditPart.VISUAL_ID;
			}
			break;
		case DetailsUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebuiPackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation3EditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement3EditPart.VISUAL_ID;
			}
			break;
		case GalleryUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebuiPackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation4EditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement4EditPart.VISUAL_ID;
			}
			break;
		case ImageIndexUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebuiPackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation5EditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement5EditPart.VISUAL_ID;
			}
			break;
		case IndexUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebuiPackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation6EditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement6EditPart.VISUAL_ID;
			}
			break;
		case MapUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebuiPackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation7EditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement7EditPart.VISUAL_ID;
			}
			break;
		case SearchUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebuiPackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation8EditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement8EditPart.VISUAL_ID;
			}
			break;
		case SliderUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebuiPackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation9EditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement9EditPart.VISUAL_ID;
			}
			break;
		case UpdateUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebuiPackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation10EditPart.VISUAL_ID;
			}
			if (WebuiPackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement10EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry
				.getModelID(containerView);
		if (!WebUIEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (WebUIEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebUIEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WebUIEditPart.VISUAL_ID:
			if (PageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PageEditPart.VISUAL_ID:
			if (PageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PageUnitCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateUnitEditPart.VISUAL_ID:
			if (CreateUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociationEditPart.VISUAL_ID:
			if (UnitAssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElementEditPart.VISUAL_ID:
			if (UnitElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateUpdateUnitEditPart.VISUAL_ID:
			if (CreateUpdateUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateUpdateUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation2EditPart.VISUAL_ID:
			if (UnitAssociationName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement2EditPart.VISUAL_ID:
			if (UnitElementName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnitEditPart.VISUAL_ID:
			if (DetailsUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailsUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation3EditPart.VISUAL_ID:
			if (UnitAssociationName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement3EditPart.VISUAL_ID:
			if (UnitElementName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GalleryUnitEditPart.VISUAL_ID:
			if (GalleryUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GalleryUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation4EditPart.VISUAL_ID:
			if (UnitAssociationName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement4EditPart.VISUAL_ID:
			if (UnitElementName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImageIndexUnitEditPart.VISUAL_ID:
			if (ImageIndexUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageIndexUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation5EditPart.VISUAL_ID:
			if (UnitAssociationName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement5EditPart.VISUAL_ID:
			if (UnitElementName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnitEditPart.VISUAL_ID:
			if (IndexUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation6EditPart.VISUAL_ID:
			if (UnitAssociationName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement6EditPart.VISUAL_ID:
			if (UnitElementName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MapUnitEditPart.VISUAL_ID:
			if (MapUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MapUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation7EditPart.VISUAL_ID:
			if (UnitAssociationName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement7EditPart.VISUAL_ID:
			if (UnitElementName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SearchUnitEditPart.VISUAL_ID:
			if (SearchUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SearchUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation8EditPart.VISUAL_ID:
			if (UnitAssociationName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement8EditPart.VISUAL_ID:
			if (UnitElementName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SliderUnitEditPart.VISUAL_ID:
			if (SliderUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SliderUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation9EditPart.VISUAL_ID:
			if (UnitAssociationName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement9EditPart.VISUAL_ID:
			if (UnitElementName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StaticUnitEditPart.VISUAL_ID:
			if (StaticUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StaticUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UpdateUnitEditPart.VISUAL_ID:
			if (UpdateUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UpdateUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation10EditPart.VISUAL_ID:
			if (UnitAssociationName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement10EditPart.VISUAL_ID:
			if (UnitElementName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PageUnitCompartmentEditPart.VISUAL_ID:
			if (CreateUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateUpdateUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailsUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GalleryUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageIndexUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MapUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SearchUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SliderUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StaticUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UpdateUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitAssociationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateUpdateUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitAssociation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitElement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitAssociation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitElement3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GalleryUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitAssociation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitElement4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImageIndexUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitAssociation5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitElement5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitAssociation6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitElement6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MapUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitAssociation7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitElement7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SearchUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitAssociation8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitElement8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SliderUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitAssociation9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitElement9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UpdateUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitAssociation10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitElement10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WebuiPackage.eINSTANCE.getPageLink().isSuperTypeOf(domainElement.eClass())) {
			return PageLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(WebUI element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case PageUnitCompartmentEditPart.VISUAL_ID:
		case CreateUnitFieldCompartmentEditPart.VISUAL_ID:
		case CreateUpdateUnitFieldCompartmentEditPart.VISUAL_ID:
		case DetailsUnitFieldCompartmentEditPart.VISUAL_ID:
		case GalleryUnitFieldCompartmentEditPart.VISUAL_ID:
		case ImageIndexUnitFieldCompartmentEditPart.VISUAL_ID:
		case IndexUnitFieldCompartmentEditPart.VISUAL_ID:
		case MapUnitFieldCompartmentEditPart.VISUAL_ID:
		case SearchUnitFieldCompartmentEditPart.VISUAL_ID:
		case SliderUnitFieldCompartmentEditPart.VISUAL_ID:
		case StaticUnitFieldCompartmentEditPart.VISUAL_ID:
		case UpdateUnitFieldCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case WebUIEditPart.VISUAL_ID:
			return false;
		case StaticUnitEditPart.VISUAL_ID:
		case UnitAssociationEditPart.VISUAL_ID:
		case UnitElementEditPart.VISUAL_ID:
		case UnitAssociation2EditPart.VISUAL_ID:
		case UnitElement2EditPart.VISUAL_ID:
		case UnitAssociation3EditPart.VISUAL_ID:
		case UnitElement3EditPart.VISUAL_ID:
		case UnitAssociation4EditPart.VISUAL_ID:
		case UnitElement4EditPart.VISUAL_ID:
		case UnitAssociation5EditPart.VISUAL_ID:
		case UnitElement5EditPart.VISUAL_ID:
		case UnitAssociation6EditPart.VISUAL_ID:
		case UnitElement6EditPart.VISUAL_ID:
		case UnitAssociation7EditPart.VISUAL_ID:
		case UnitElement7EditPart.VISUAL_ID:
		case UnitAssociation8EditPart.VISUAL_ID:
		case UnitElement8EditPart.VISUAL_ID:
		case UnitAssociation9EditPart.VISUAL_ID:
		case UnitElement9EditPart.VISUAL_ID:
		case UnitAssociation10EditPart.VISUAL_ID:
		case UnitElement10EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
