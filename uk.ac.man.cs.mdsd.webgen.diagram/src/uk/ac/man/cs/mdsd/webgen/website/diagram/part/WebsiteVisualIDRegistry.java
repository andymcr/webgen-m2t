package uk.ac.man.cs.mdsd.webgen.website.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import uk.ac.man.cs.mdsd.webgen.base.BasePackage;
import uk.ac.man.cs.mdsd.webgen.base.DataType;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.*;
import uk.ac.man.cs.mdsd.webgen.website.diagram.expressions.WebsiteOCLFactory;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class WebsiteVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "uk.ac.man.cs.mdsd.webgen.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WebGenModelEditPart.MODEL_ID.equals(view.getType())) {
				return WebGenModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry.getVisualID(view.getType());
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
				WebsiteDiagramEditorPlugin.getInstance()
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
		if (WebsitePackage.eINSTANCE.getWebGenModel().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((WebGenModel) domainElement)) {
			return WebGenModelEditPart.VISUAL_ID;
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
		String containerModelID = uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry
				.getModelID(containerView);
		if (!WebGenModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (WebGenModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebGenModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WebGenModelEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getWebsiteProperties().isSuperTypeOf(domainElement.eClass())) {
				return WebsitePropertiesEditPart.VISUAL_ID;
			}
			if (BasePackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())
					&& isDataType_2013((DataType) domainElement)) {
				return DataTypeEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDynamicMenu().isSuperTypeOf(domainElement.eClass())) {
				return DynamicMenuEditPart.VISUAL_ID;
			}
			if (BasePackage.eINSTANCE.getEnumerationType().isSuperTypeOf(domainElement.eClass())) {
				return EnumerationTypeEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return EntityEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getView().isSuperTypeOf(domainElement.eClass())) {
				return ViewEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getPage().isSuperTypeOf(domainElement.eClass())) {
				return PageEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getStaticMenu().isSuperTypeOf(domainElement.eClass())) {
				return StaticMenuEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getService().isSuperTypeOf(domainElement.eClass())) {
				return ServiceEditPart.VISUAL_ID;
			}
			break;
		case WebsitePropertiesAuthenticationCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getCasAuthentication().isSuperTypeOf(domainElement.eClass())) {
				return CasAuthenticationEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getLocalAuthenticationSystem().isSuperTypeOf(domainElement.eClass())) {
				return LocalAuthenticationSystemEditPart.VISUAL_ID;
			}
			break;
		case EnumerationTypeEnumerationsCompartmentEditPart.VISUAL_ID:
			if (BasePackage.eINSTANCE.getEnumerationLiteral().isSuperTypeOf(domainElement.eClass())) {
				return EnumerationLiteralEditPart.VISUAL_ID;
			}
			break;
		case EntityAttributeCompartmentEditPart.VISUAL_ID:
			if (PersistencePackage.eINSTANCE.getDataTypeAttribute().isSuperTypeOf(domainElement.eClass())) {
				return DataTypeAttributeEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getDateAttribute().isSuperTypeOf(domainElement.eClass())) {
				return DateAttributeEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getUrlAttribute().isSuperTypeOf(domainElement.eClass())) {
				return UrlAttributeEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getFileAttribute().isSuperTypeOf(domainElement.eClass())) {
				return FileAttributeEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getImageAttribute().isSuperTypeOf(domainElement.eClass())) {
				return ImageAttributeEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getLocationAttribute().isSuperTypeOf(domainElement.eClass())) {
				return LocationAttributeEditPart.VISUAL_ID;
			}
			break;
		case EntityModelLabelsCompartmentEditPart.VISUAL_ID:
			if (PersistencePackage.eINSTANCE.getModelLabel().isSuperTypeOf(domainElement.eClass())) {
				return ModelLabelEditPart.VISUAL_ID;
			}
			break;
		case ViewAttributeCompartmentEditPart.VISUAL_ID:
			if (PersistencePackage.eINSTANCE.getEncapsulatedAttribute().isSuperTypeOf(domainElement.eClass())) {
				return EncapsulatedAttributeEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getEncapsulatedAssociation().isSuperTypeOf(domainElement.eClass())) {
				return EncapsulatedAssociationEditPart.VISUAL_ID;
			}
			break;
		case ViewModelLabelsCompartmentEditPart.VISUAL_ID:
			if (PersistencePackage.eINSTANCE.getModelLabel().isSuperTypeOf(domainElement.eClass())) {
				return ModelLabel2EditPart.VISUAL_ID;
			}
			break;
		case PageInterfaceUnitCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getCreateUnit().isSuperTypeOf(domainElement.eClass())) {
				return CreateUnitEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getCreateUpdateUnit().isSuperTypeOf(domainElement.eClass())) {
				return CreateUpdateUnitEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getCreateSitemapUnit().isSuperTypeOf(domainElement.eClass())) {
				return CreateSitemapUnitEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDetailsUnit().isSuperTypeOf(domainElement.eClass())) {
				return DetailsUnitEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getIndexUnit().isSuperTypeOf(domainElement.eClass())) {
				return IndexUnit6EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getMapUnit().isSuperTypeOf(domainElement.eClass())) {
				return MapUnitEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getSearchUnit().isSuperTypeOf(domainElement.eClass())) {
				return SearchUnitEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getStaticUnit().isSuperTypeOf(domainElement.eClass())) {
				return StaticUnitEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUpdateUnit().isSuperTypeOf(domainElement.eClass())) {
				return UpdateUnitEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getImageIndexUnit().isSuperTypeOf(domainElement.eClass())) {
				return ImageIndexUnit2EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getSliderUnit().isSuperTypeOf(domainElement.eClass())) {
				return SliderUnitEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getGalleryUnit().isSuperTypeOf(domainElement.eClass())) {
				return GalleryUnitEditPart.VISUAL_ID;
			}
			break;
		case CreateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElementEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociationEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDataTypeField().isSuperTypeOf(domainElement.eClass())) {
				return DataTypeFieldEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDateField().isSuperTypeOf(domainElement.eClass())) {
				return DateFieldEditPart.VISUAL_ID;
			}
			break;
		case CreateUpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement2EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation2EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDataTypeField().isSuperTypeOf(domainElement.eClass())) {
				return DataTypeField2EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDateField().isSuperTypeOf(domainElement.eClass())) {
				return DateField2EditPart.VISUAL_ID;
			}
			break;
		case UnitAssociationInterfaceUnitsCompartment5EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getCreateUpdateUnit().isSuperTypeOf(domainElement.eClass())) {
				return CreateUpdateUnit2EditPart.VISUAL_ID;
			}
			break;
		case CreateUpdateUnitUnitFieldCompartment2EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement3EditPart.VISUAL_ID;
			}
			break;
		case DetailsUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement4EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation3EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDataTypeField().isSuperTypeOf(domainElement.eClass())) {
				return DataTypeField3EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDateField().isSuperTypeOf(domainElement.eClass())) {
				return DateField3EditPart.VISUAL_ID;
			}
			break;
		case DetailsUnitActionCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitSupportAction().isSuperTypeOf(domainElement.eClass())) {
				return UnitSupportActionEditPart.VISUAL_ID;
			}
			break;
		case UnitElementActionCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getSelectAction().isSuperTypeOf(domainElement.eClass())) {
				return SelectActionEditPart.VISUAL_ID;
			}
			break;
		case UnitAssociationInterfaceUnitsCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getDetailsUnit().isSuperTypeOf(domainElement.eClass())) {
				return DetailsUnit2EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getIndexUnit().isSuperTypeOf(domainElement.eClass())) {
				return IndexUnit2EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getImageIndexUnit().isSuperTypeOf(domainElement.eClass())) {
				return ImageIndexUnitEditPart.VISUAL_ID;
			}
			break;
		case UnitAssociationActionCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getSelectAction().isSuperTypeOf(domainElement.eClass())) {
				return SelectAction4EditPart.VISUAL_ID;
			}
			break;
		case DetailsUnitUnitFieldCompartment2EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement5EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation4EditPart.VISUAL_ID;
			}
			break;
		case UnitAssociationInterfaceUnitCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getDetailsUnit().isSuperTypeOf(domainElement.eClass())) {
				return DetailsUnit3EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getIndexUnit().isSuperTypeOf(domainElement.eClass())) {
				return IndexUnitEditPart.VISUAL_ID;
			}
			break;
		case DetailsUnitUnitFieldCompartment3EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement6EditPart.VISUAL_ID;
			}
			break;
		case IndexUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement7EditPart.VISUAL_ID;
			}
			break;
		case IndexUnitUnitFieldCompartment2EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement8EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation5EditPart.VISUAL_ID;
			}
			break;
		case IndexUnitActionCompartment3EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getSelectAction().isSuperTypeOf(domainElement.eClass())) {
				return SelectAction2EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDeleteAction().isSuperTypeOf(domainElement.eClass())) {
				return DeleteActionEditPart.VISUAL_ID;
			}
			break;
		case UnitAssociationInterfaceUnitCompartment2EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getDetailsUnit().isSuperTypeOf(domainElement.eClass())) {
				return DetailsUnit4EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getIndexUnit().isSuperTypeOf(domainElement.eClass())) {
				return IndexUnit4EditPart.VISUAL_ID;
			}
			break;
		case DetailsUnitUnitFieldCompartment4EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement9EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation6EditPart.VISUAL_ID;
			}
			break;
		case UnitAssociationInterfaceUnitCompartment3EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getDetailsUnit().isSuperTypeOf(domainElement.eClass())) {
				return DetailsUnit5EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getIndexUnit().isSuperTypeOf(domainElement.eClass())) {
				return IndexUnit3EditPart.VISUAL_ID;
			}
			break;
		case DetailsUnitUnitFieldCompartment5EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement10EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation7EditPart.VISUAL_ID;
			}
			break;
		case IndexUnitUnitFieldCompartment3EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement11EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation8EditPart.VISUAL_ID;
			}
			break;
		case IndexUnitUnitFieldCompartment4EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement12EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation9EditPart.VISUAL_ID;
			}
			break;
		case UnitAssociationInterfaceUnitsCompartment2EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getDetailsUnit().isSuperTypeOf(domainElement.eClass())) {
				return DetailsUnit6EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getIndexUnit().isSuperTypeOf(domainElement.eClass())) {
				return IndexUnit5EditPart.VISUAL_ID;
			}
			break;
		case DetailsUnitUnitFieldCompartment6EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement13EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation10EditPart.VISUAL_ID;
			}
			break;
		case IndexUnitUnitFieldCompartment5EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement14EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation11EditPart.VISUAL_ID;
			}
			break;
		case ImageIndexUnitActionCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getSelectAction().isSuperTypeOf(domainElement.eClass())) {
				return SelectAction3EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDeleteAction().isSuperTypeOf(domainElement.eClass())) {
				return DeleteAction2EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getFeatureSupportAction().isSuperTypeOf(domainElement.eClass())) {
				return FeatureSupportActionEditPart.VISUAL_ID;
			}
			break;
		case IndexUnitUnitFieldCompartment6EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement15EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation12EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDataTypeField().isSuperTypeOf(domainElement.eClass())) {
				return DataTypeField4EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDateField().isSuperTypeOf(domainElement.eClass())) {
				return DateField4EditPart.VISUAL_ID;
			}
			break;
		case IndexUnitActionCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getSelectAction().isSuperTypeOf(domainElement.eClass())) {
				return SelectAction7EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDeleteAction().isSuperTypeOf(domainElement.eClass())) {
				return DeleteAction3EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getFeatureSupportAction().isSuperTypeOf(domainElement.eClass())) {
				return FeatureSupportAction2EditPart.VISUAL_ID;
			}
			break;
		case UnitElementActionCompartment2EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getSelectAction().isSuperTypeOf(domainElement.eClass())) {
				return SelectAction5EditPart.VISUAL_ID;
			}
			break;
		case UnitAssociationInterfaceUnitsCompartment3EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getDetailsUnit().isSuperTypeOf(domainElement.eClass())) {
				return DetailsUnit7EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getIndexUnit().isSuperTypeOf(domainElement.eClass())) {
				return IndexUnit7EditPart.VISUAL_ID;
			}
			break;
		case UnitAssociationActionCompartment2EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getSelectAction().isSuperTypeOf(domainElement.eClass())) {
				return SelectAction6EditPart.VISUAL_ID;
			}
			break;
		case DetailsUnitUnitFieldCompartment7EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement16EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation13EditPart.VISUAL_ID;
			}
			break;
		case IndexUnitUnitFieldCompartment7EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement17EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation14EditPart.VISUAL_ID;
			}
			break;
		case SearchUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement18EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation15EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDataTypeField().isSuperTypeOf(domainElement.eClass())) {
				return DataTypeField5EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDateField().isSuperTypeOf(domainElement.eClass())) {
				return DateField5EditPart.VISUAL_ID;
			}
			break;
		case UpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement19EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation16EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDataTypeField().isSuperTypeOf(domainElement.eClass())) {
				return DataTypeField6EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDateField().isSuperTypeOf(domainElement.eClass())) {
				return DateField6EditPart.VISUAL_ID;
			}
			break;
		case UnitAssociationInterfaceUnitsCompartment4EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getIndexUnit().isSuperTypeOf(domainElement.eClass())) {
				return IndexUnit8EditPart.VISUAL_ID;
			}
			break;
		case IndexUnitUnitFieldCompartment8EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getUnitElement().isSuperTypeOf(domainElement.eClass())) {
				return UnitElement20EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getUnitAssociation().isSuperTypeOf(domainElement.eClass())) {
				return UnitAssociation17EditPart.VISUAL_ID;
			}
			break;
		case IndexUnitActionCompartment2EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getSelectAction().isSuperTypeOf(domainElement.eClass())) {
				return SelectAction8EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDeleteAction().isSuperTypeOf(domainElement.eClass())) {
				return DeleteAction4EditPart.VISUAL_ID;
			}
			break;
		case ImageIndexUnitActionCompartment2EditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getSelectAction().isSuperTypeOf(domainElement.eClass())) {
				return SelectAction9EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getDeleteAction().isSuperTypeOf(domainElement.eClass())) {
				return DeleteAction5EditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getFeatureSupportAction().isSuperTypeOf(domainElement.eClass())) {
				return FeatureSupportAction3EditPart.VISUAL_ID;
			}
			break;
		case StaticMenuIncludedFeaturesCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getActionMenuEntry().isSuperTypeOf(domainElement.eClass())) {
				return ActionMenuEntryEditPart.VISUAL_ID;
			}
			if (WebsitePackage.eINSTANCE.getEditStaticTextMenuEntry().isSuperTypeOf(domainElement.eClass())) {
				return EditStaticTextMenuEntryEditPart.VISUAL_ID;
			}
			break;
		case ServiceFeaturesCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getSelection().isSuperTypeOf(domainElement.eClass())) {
				return SelectionEditPart.VISUAL_ID;
			}
			break;
		case ServiceOperationsCompartmentEditPart.VISUAL_ID:
			if (WebsitePackage.eINSTANCE.getBusinessOperation().isSuperTypeOf(domainElement.eClass())) {
				return BusinessOperationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry
				.getModelID(containerView);
		if (!WebGenModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (WebGenModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WebGenModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WebGenModelEditPart.VISUAL_ID:
			if (WebsitePropertiesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DynamicMenuEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StaticMenuEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebsitePropertiesEditPart.VISUAL_ID:
			if (WebsitePropertiesSiteTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebsitePropertiesAuthenticationCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataTypeEditPart.VISUAL_ID:
			if (DataTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DynamicMenuEditPart.VISUAL_ID:
			if (DynamicMenuNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DynamicMenuUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationTypeEditPart.VISUAL_ID:
			if (EnumerationTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationTypeEnumerationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEditPart.VISUAL_ID:
			if (EntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityModelLabelsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewEditPart.VISUAL_ID:
			if (ViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewModelLabelsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PageEditPart.VISUAL_ID:
			if (PageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PageInterfaceUnitCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StaticMenuEditPart.VISUAL_ID:
			if (StaticMenuNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StaticMenuIncludedFeaturesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceEditPart.VISUAL_ID:
			if (ServiceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServiceFeaturesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServiceOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationLiteralEditPart.VISUAL_ID:
			if (EnumerationLiteralNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataTypeAttributeEditPart.VISUAL_ID:
			if (DataTypeAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DateAttributeEditPart.VISUAL_ID:
			if (DateAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UrlAttributeEditPart.VISUAL_ID:
			if (UrlAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FileAttributeEditPart.VISUAL_ID:
			if (FileAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImageAttributeEditPart.VISUAL_ID:
			if (ImageAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LocationAttributeEditPart.VISUAL_ID:
			if (LocationAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelLabelEditPart.VISUAL_ID:
			if (ModelLabelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelLabel2EditPart.VISUAL_ID:
			if (ModelLabelName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			if (EncapsulatedAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			if (EncapsulatedAssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateUnitEditPart.VISUAL_ID:
			if (CreateUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateUnitUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElementEditPart.VISUAL_ID:
			if (UnitElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociationEditPart.VISUAL_ID:
			if (UnitAssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataTypeFieldEditPart.VISUAL_ID:
			if (DataTypeFieldNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DateFieldEditPart.VISUAL_ID:
			if (DateFieldNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateUpdateUnitEditPart.VISUAL_ID:
			if (CreateUpdateUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateUpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement2EditPart.VISUAL_ID:
			if (UnitElementName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation2EditPart.VISUAL_ID:
			if (UnitAssociationName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociationInterfaceUnitsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateUpdateUnit2EditPart.VISUAL_ID:
			if (CreateUpdateUnitName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateUpdateUnitUnitFieldCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement3EditPart.VISUAL_ID:
			if (UnitElementName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataTypeField2EditPart.VISUAL_ID:
			if (DataTypeFieldName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DateField2EditPart.VISUAL_ID:
			if (DateFieldName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnitEditPart.VISUAL_ID:
			if (DetailsUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailsUnitUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailsUnitActionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement4EditPart.VISUAL_ID:
			if (UnitElementName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitElementActionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectActionEditPart.VISUAL_ID:
			if (SelectActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation3EditPart.VISUAL_ID:
			if (UnitAssociationName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociationInterfaceUnitsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociationActionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnit2EditPart.VISUAL_ID:
			if (DetailsUnitName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailsUnitUnitFieldCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement5EditPart.VISUAL_ID:
			if (UnitElementName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation4EditPart.VISUAL_ID:
			if (UnitAssociationName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociationInterfaceUnitCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnit3EditPart.VISUAL_ID:
			if (DetailsUnitName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailsUnitUnitFieldCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement6EditPart.VISUAL_ID:
			if (UnitElementName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnitEditPart.VISUAL_ID:
			if (IndexUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnitUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement7EditPart.VISUAL_ID:
			if (UnitElementName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnit2EditPart.VISUAL_ID:
			if (IndexUnitName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnitUnitFieldCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnitActionCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement8EditPart.VISUAL_ID:
			if (UnitElementName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation5EditPart.VISUAL_ID:
			if (UnitAssociationName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociationInterfaceUnitCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnit4EditPart.VISUAL_ID:
			if (DetailsUnitName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailsUnitUnitFieldCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement9EditPart.VISUAL_ID:
			if (UnitElementName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation6EditPart.VISUAL_ID:
			if (UnitAssociationName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociationInterfaceUnitCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnit5EditPart.VISUAL_ID:
			if (DetailsUnitName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailsUnitUnitFieldCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement10EditPart.VISUAL_ID:
			if (UnitElementName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation7EditPart.VISUAL_ID:
			if (UnitAssociationName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnit3EditPart.VISUAL_ID:
			if (IndexUnitName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnitUnitFieldCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement11EditPart.VISUAL_ID:
			if (UnitElementName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation8EditPart.VISUAL_ID:
			if (UnitAssociationName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnit4EditPart.VISUAL_ID:
			if (IndexUnitName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnitUnitFieldCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement12EditPart.VISUAL_ID:
			if (UnitElementName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation9EditPart.VISUAL_ID:
			if (UnitAssociationName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociationInterfaceUnitsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnit6EditPart.VISUAL_ID:
			if (DetailsUnitName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailsUnitUnitFieldCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement13EditPart.VISUAL_ID:
			if (UnitElementName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation10EditPart.VISUAL_ID:
			if (UnitAssociationName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnit5EditPart.VISUAL_ID:
			if (IndexUnitName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnitUnitFieldCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement14EditPart.VISUAL_ID:
			if (UnitElementName14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation11EditPart.VISUAL_ID:
			if (UnitAssociationName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectAction2EditPart.VISUAL_ID:
			if (SelectActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeleteActionEditPart.VISUAL_ID:
			if (DeleteActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImageIndexUnitEditPart.VISUAL_ID:
			if (ImageIndexUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageIndexUnitActionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectAction3EditPart.VISUAL_ID:
			if (SelectActionName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeleteAction2EditPart.VISUAL_ID:
			if (DeleteActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectAction4EditPart.VISUAL_ID:
			if (SelectActionName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataTypeField3EditPart.VISUAL_ID:
			if (DataTypeFieldName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DateField3EditPart.VISUAL_ID:
			if (DateFieldName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitSupportActionEditPart.VISUAL_ID:
			if (UnitSupportActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnit6EditPart.VISUAL_ID:
			if (IndexUnitName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnitUnitFieldCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnitActionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement15EditPart.VISUAL_ID:
			if (UnitElementName15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitElementActionCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectAction5EditPart.VISUAL_ID:
			if (SelectActionName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation12EditPart.VISUAL_ID:
			if (UnitAssociationName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociationInterfaceUnitsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociationActionCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnit7EditPart.VISUAL_ID:
			if (DetailsUnitName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailsUnitUnitFieldCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement16EditPart.VISUAL_ID:
			if (UnitElementName16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation13EditPart.VISUAL_ID:
			if (UnitAssociationName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnit7EditPart.VISUAL_ID:
			if (IndexUnitName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnitUnitFieldCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement17EditPart.VISUAL_ID:
			if (UnitElementName17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation14EditPart.VISUAL_ID:
			if (UnitAssociationName14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectAction6EditPart.VISUAL_ID:
			if (SelectActionName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataTypeField4EditPart.VISUAL_ID:
			if (DataTypeFieldName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DateField4EditPart.VISUAL_ID:
			if (DateFieldName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectAction7EditPart.VISUAL_ID:
			if (SelectActionName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeleteAction3EditPart.VISUAL_ID:
			if (DeleteActionName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FeatureSupportAction2EditPart.VISUAL_ID:
			if (FeatureSupportActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MapUnitEditPart.VISUAL_ID:
			if (MapUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SearchUnitEditPart.VISUAL_ID:
			if (SearchUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SearchUnitUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement18EditPart.VISUAL_ID:
			if (UnitElementName18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation15EditPart.VISUAL_ID:
			if (UnitAssociationName15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataTypeField5EditPart.VISUAL_ID:
			if (DataTypeFieldName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DateField5EditPart.VISUAL_ID:
			if (DateFieldName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StaticUnitEditPart.VISUAL_ID:
			if (StaticUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UpdateUnitEditPart.VISUAL_ID:
			if (UpdateUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement19EditPart.VISUAL_ID:
			if (UnitElementName19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation16EditPart.VISUAL_ID:
			if (UnitAssociationName16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociationInterfaceUnitsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnit8EditPart.VISUAL_ID:
			if (IndexUnitName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnitUnitFieldCompartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnitActionCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElement20EditPart.VISUAL_ID:
			if (UnitElementName20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociation17EditPart.VISUAL_ID:
			if (UnitAssociationName17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectAction8EditPart.VISUAL_ID:
			if (SelectActionName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeleteAction4EditPart.VISUAL_ID:
			if (DeleteActionName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataTypeField6EditPart.VISUAL_ID:
			if (DataTypeFieldName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DateField6EditPart.VISUAL_ID:
			if (DateFieldName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImageIndexUnit2EditPart.VISUAL_ID:
			if (ImageIndexUnitName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageIndexUnitActionCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectAction9EditPart.VISUAL_ID:
			if (SelectActionName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeleteAction5EditPart.VISUAL_ID:
			if (DeleteActionName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SliderUnitEditPart.VISUAL_ID:
			if (SliderUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GalleryUnitEditPart.VISUAL_ID:
			if (GalleryUnitNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionMenuEntryEditPart.VISUAL_ID:
			if (ActionMenuEntryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EditStaticTextMenuEntryEditPart.VISUAL_ID:
			if (EditStaticTextMenuEntryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SelectionEditPart.VISUAL_ID:
			if (SelectionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusinessOperationEditPart.VISUAL_ID:
			if (BusinessOperationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebsitePropertiesAuthenticationCompartmentEditPart.VISUAL_ID:
			if (CasAuthenticationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocalAuthenticationSystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationTypeEnumerationsCompartmentEditPart.VISUAL_ID:
			if (EnumerationLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityAttributeCompartmentEditPart.VISUAL_ID:
			if (DataTypeAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UrlAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FileAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocationAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityModelLabelsCompartmentEditPart.VISUAL_ID:
			if (ModelLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewAttributeCompartmentEditPart.VISUAL_ID:
			if (EncapsulatedAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EncapsulatedAssociationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewModelLabelsCompartmentEditPart.VISUAL_ID:
			if (ModelLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PageInterfaceUnitCompartmentEditPart.VISUAL_ID:
			if (CreateUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateUpdateUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateSitemapUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DetailsUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MapUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SearchUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StaticUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UpdateUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageIndexUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SliderUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GalleryUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataTypeFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateUpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitElement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataTypeField2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateField2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociationInterfaceUnitsCompartment5EditPart.VISUAL_ID:
			if (CreateUpdateUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateUpdateUnitUnitFieldCompartment2EditPart.VISUAL_ID:
			if (UnitElement3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitElement4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataTypeField3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateField3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnitActionCompartmentEditPart.VISUAL_ID:
			if (UnitSupportActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElementActionCompartmentEditPart.VISUAL_ID:
			if (SelectActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociationInterfaceUnitsCompartmentEditPart.VISUAL_ID:
			if (DetailsUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageIndexUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociationActionCompartmentEditPart.VISUAL_ID:
			if (SelectAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnitUnitFieldCompartment2EditPart.VISUAL_ID:
			if (UnitElement5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociationInterfaceUnitCompartmentEditPart.VISUAL_ID:
			if (DetailsUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnitUnitFieldCompartment3EditPart.VISUAL_ID:
			if (UnitElement6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitElement7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnitUnitFieldCompartment2EditPart.VISUAL_ID:
			if (UnitElement8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnitActionCompartment3EditPart.VISUAL_ID:
			if (SelectAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeleteActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociationInterfaceUnitCompartment2EditPart.VISUAL_ID:
			if (DetailsUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnitUnitFieldCompartment4EditPart.VISUAL_ID:
			if (UnitElement9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociationInterfaceUnitCompartment3EditPart.VISUAL_ID:
			if (DetailsUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnitUnitFieldCompartment5EditPart.VISUAL_ID:
			if (UnitElement10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnitUnitFieldCompartment3EditPart.VISUAL_ID:
			if (UnitElement11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnitUnitFieldCompartment4EditPart.VISUAL_ID:
			if (UnitElement12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociationInterfaceUnitsCompartment2EditPart.VISUAL_ID:
			if (DetailsUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnitUnitFieldCompartment6EditPart.VISUAL_ID:
			if (UnitElement13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnitUnitFieldCompartment5EditPart.VISUAL_ID:
			if (UnitElement14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImageIndexUnitActionCompartmentEditPart.VISUAL_ID:
			if (SelectAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeleteAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FeatureSupportActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnitUnitFieldCompartment6EditPart.VISUAL_ID:
			if (UnitElement15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataTypeField4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateField4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnitActionCompartmentEditPart.VISUAL_ID:
			if (SelectAction7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeleteAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FeatureSupportAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitElementActionCompartment2EditPart.VISUAL_ID:
			if (SelectAction5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociationInterfaceUnitsCompartment3EditPart.VISUAL_ID:
			if (DetailsUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndexUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociationActionCompartment2EditPart.VISUAL_ID:
			if (SelectAction6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DetailsUnitUnitFieldCompartment7EditPart.VISUAL_ID:
			if (UnitElement16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnitUnitFieldCompartment7EditPart.VISUAL_ID:
			if (UnitElement17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SearchUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitElement18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataTypeField5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateField5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			if (UnitElement19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataTypeField6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateField6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnitAssociationInterfaceUnitsCompartment4EditPart.VISUAL_ID:
			if (IndexUnit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnitUnitFieldCompartment8EditPart.VISUAL_ID:
			if (UnitElement20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnitAssociation17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndexUnitActionCompartment2EditPart.VISUAL_ID:
			if (SelectAction8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeleteAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImageIndexUnitActionCompartment2EditPart.VISUAL_ID:
			if (SelectAction9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeleteAction5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FeatureSupportAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StaticMenuIncludedFeaturesCompartmentEditPart.VISUAL_ID:
			if (ActionMenuEntryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EditStaticTextMenuEntryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceFeaturesCompartmentEditPart.VISUAL_ID:
			if (SelectionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceOperationsCompartmentEditPart.VISUAL_ID:
			if (BusinessOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			if (AssociationWithoutContainmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationWithoutContainmentCardinalityTargetCardinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationWithContainmentEditPart.VISUAL_ID:
			if (AssociationWithContainmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationWithContainmentCardinalityEditPart.VISUAL_ID == nodeVisualID) {
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
		if (PersistencePackage.eINSTANCE.getAssociationWithoutContainment().isSuperTypeOf(domainElement.eClass())) {
			return AssociationWithoutContainmentEditPart.VISUAL_ID;
		}
		if (PersistencePackage.eINSTANCE.getAssociationWithContainment().isSuperTypeOf(domainElement.eClass())) {
			return AssociationWithContainmentEditPart.VISUAL_ID;
		}
		if (PersistencePackage.eINSTANCE.getViewAssociation().isSuperTypeOf(domainElement.eClass())) {
			return ViewAssociationEditPart.VISUAL_ID;
		}
		if (WebsitePackage.eINSTANCE.getPageLink().isSuperTypeOf(domainElement.eClass())) {
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
	private static boolean isDiagram(WebGenModel element) {
		return true;
	}

	/**
	* @generated
	*/
	private static boolean isDataType_2013(DataType domainElement) {
		Object result = WebsiteOCLFactory.getExpression(0, BasePackage.eINSTANCE.getDataType(), null)
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
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
		case WebsitePropertiesAuthenticationCompartmentEditPart.VISUAL_ID:
		case DynamicMenuUnitFieldCompartmentEditPart.VISUAL_ID:
		case EnumerationTypeEnumerationsCompartmentEditPart.VISUAL_ID:
		case EntityAttributeCompartmentEditPart.VISUAL_ID:
		case EntityModelLabelsCompartmentEditPart.VISUAL_ID:
		case ViewAttributeCompartmentEditPart.VISUAL_ID:
		case ViewModelLabelsCompartmentEditPart.VISUAL_ID:
		case PageInterfaceUnitCompartmentEditPart.VISUAL_ID:
		case CreateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
		case CreateUpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
		case UnitAssociationInterfaceUnitsCompartment5EditPart.VISUAL_ID:
		case CreateUpdateUnitUnitFieldCompartment2EditPart.VISUAL_ID:
		case DetailsUnitUnitFieldCompartmentEditPart.VISUAL_ID:
		case DetailsUnitActionCompartmentEditPart.VISUAL_ID:
		case UnitElementActionCompartmentEditPart.VISUAL_ID:
		case UnitAssociationInterfaceUnitsCompartmentEditPart.VISUAL_ID:
		case UnitAssociationActionCompartmentEditPart.VISUAL_ID:
		case DetailsUnitUnitFieldCompartment2EditPart.VISUAL_ID:
		case UnitAssociationInterfaceUnitCompartmentEditPart.VISUAL_ID:
		case DetailsUnitUnitFieldCompartment3EditPart.VISUAL_ID:
		case IndexUnitUnitFieldCompartmentEditPart.VISUAL_ID:
		case IndexUnitUnitFieldCompartment2EditPart.VISUAL_ID:
		case IndexUnitActionCompartment3EditPart.VISUAL_ID:
		case UnitAssociationInterfaceUnitCompartment2EditPart.VISUAL_ID:
		case DetailsUnitUnitFieldCompartment4EditPart.VISUAL_ID:
		case UnitAssociationInterfaceUnitCompartment3EditPart.VISUAL_ID:
		case DetailsUnitUnitFieldCompartment5EditPart.VISUAL_ID:
		case IndexUnitUnitFieldCompartment3EditPart.VISUAL_ID:
		case IndexUnitUnitFieldCompartment4EditPart.VISUAL_ID:
		case UnitAssociationInterfaceUnitsCompartment2EditPart.VISUAL_ID:
		case DetailsUnitUnitFieldCompartment6EditPart.VISUAL_ID:
		case IndexUnitUnitFieldCompartment5EditPart.VISUAL_ID:
		case ImageIndexUnitActionCompartmentEditPart.VISUAL_ID:
		case IndexUnitUnitFieldCompartment6EditPart.VISUAL_ID:
		case IndexUnitActionCompartmentEditPart.VISUAL_ID:
		case UnitElementActionCompartment2EditPart.VISUAL_ID:
		case UnitAssociationInterfaceUnitsCompartment3EditPart.VISUAL_ID:
		case UnitAssociationActionCompartment2EditPart.VISUAL_ID:
		case DetailsUnitUnitFieldCompartment7EditPart.VISUAL_ID:
		case IndexUnitUnitFieldCompartment7EditPart.VISUAL_ID:
		case SearchUnitUnitFieldCompartmentEditPart.VISUAL_ID:
		case UpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
		case UnitAssociationInterfaceUnitsCompartment4EditPart.VISUAL_ID:
		case IndexUnitUnitFieldCompartment8EditPart.VISUAL_ID:
		case IndexUnitActionCompartment2EditPart.VISUAL_ID:
		case ImageIndexUnitActionCompartment2EditPart.VISUAL_ID:
		case StaticMenuIncludedFeaturesCompartmentEditPart.VISUAL_ID:
		case ServiceFeaturesCompartmentEditPart.VISUAL_ID:
		case ServiceOperationsCompartmentEditPart.VISUAL_ID:
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
		case WebGenModelEditPart.VISUAL_ID:
			return false;
		case DynamicMenuEditPart.VISUAL_ID:
		case DataTypeEditPart.VISUAL_ID:
		case LocalAuthenticationSystemEditPart.VISUAL_ID:
		case CasAuthenticationEditPart.VISUAL_ID:
		case DeleteActionEditPart.VISUAL_ID:
		case SelectActionEditPart.VISUAL_ID:
		case SelectAction2EditPart.VISUAL_ID:
		case StaticUnitEditPart.VISUAL_ID:
		case SelectAction3EditPart.VISUAL_ID:
		case SelectAction4EditPart.VISUAL_ID:
		case SelectAction5EditPart.VISUAL_ID:
		case SelectAction6EditPart.VISUAL_ID:
		case DeleteAction2EditPart.VISUAL_ID:
		case SelectionEditPart.VISUAL_ID:
		case SelectAction7EditPart.VISUAL_ID:
		case DeleteAction3EditPart.VISUAL_ID:
		case EditStaticTextMenuEntryEditPart.VISUAL_ID:
		case CreateSitemapUnitEditPart.VISUAL_ID:
		case UnitElementEditPart.VISUAL_ID:
		case UnitAssociationEditPart.VISUAL_ID:
		case UnitElement2EditPart.VISUAL_ID:
		case UnitElement3EditPart.VISUAL_ID:
		case UnitElement5EditPart.VISUAL_ID:
		case UnitElement6EditPart.VISUAL_ID:
		case UnitElement7EditPart.VISUAL_ID:
		case UnitElement8EditPart.VISUAL_ID:
		case UnitElement9EditPart.VISUAL_ID:
		case UnitAssociation7EditPart.VISUAL_ID:
		case UnitElement10EditPart.VISUAL_ID:
		case UnitAssociation8EditPart.VISUAL_ID:
		case UnitElement11EditPart.VISUAL_ID:
		case UnitElement12EditPart.VISUAL_ID:
		case UnitAssociation10EditPart.VISUAL_ID:
		case UnitElement13EditPart.VISUAL_ID:
		case UnitAssociation11EditPart.VISUAL_ID:
		case UnitElement14EditPart.VISUAL_ID:
		case UnitAssociation13EditPart.VISUAL_ID:
		case UnitElement16EditPart.VISUAL_ID:
		case UnitAssociation14EditPart.VISUAL_ID:
		case UnitElement17EditPart.VISUAL_ID:
		case UnitAssociation15EditPart.VISUAL_ID:
		case DataTypeFieldEditPart.VISUAL_ID:
		case DataTypeField2EditPart.VISUAL_ID:
		case DataTypeField3EditPart.VISUAL_ID:
		case DataTypeField4EditPart.VISUAL_ID:
		case DataTypeField5EditPart.VISUAL_ID:
		case DataTypeField6EditPart.VISUAL_ID:
		case DateFieldEditPart.VISUAL_ID:
		case DateField2EditPart.VISUAL_ID:
		case DateField3EditPart.VISUAL_ID:
		case DateField4EditPart.VISUAL_ID:
		case DateField5EditPart.VISUAL_ID:
		case DateField6EditPart.VISUAL_ID:
		case UnitElement18EditPart.VISUAL_ID:
		case UnitElement19EditPart.VISUAL_ID:
		case UnitAssociation17EditPart.VISUAL_ID:
		case MapUnitEditPart.VISUAL_ID:
		case UnitSupportActionEditPart.VISUAL_ID:
		case FeatureSupportActionEditPart.VISUAL_ID:
		case ActionMenuEntryEditPart.VISUAL_ID:
		case UnitElement20EditPart.VISUAL_ID:
		case BusinessOperationEditPart.VISUAL_ID:
		case SliderUnitEditPart.VISUAL_ID:
		case GalleryUnitEditPart.VISUAL_ID:
		case SelectAction8EditPart.VISUAL_ID:
		case DeleteAction4EditPart.VISUAL_ID:
		case FeatureSupportAction2EditPart.VISUAL_ID:
		case SelectAction9EditPart.VISUAL_ID:
		case DeleteAction5EditPart.VISUAL_ID:
		case FeatureSupportAction3EditPart.VISUAL_ID:
		case EnumerationLiteralEditPart.VISUAL_ID:
		case DataTypeAttributeEditPart.VISUAL_ID:
		case DateAttributeEditPart.VISUAL_ID:
		case UrlAttributeEditPart.VISUAL_ID:
		case FileAttributeEditPart.VISUAL_ID:
		case ImageAttributeEditPart.VISUAL_ID:
		case LocationAttributeEditPart.VISUAL_ID:
		case ModelLabelEditPart.VISUAL_ID:
		case ModelLabel2EditPart.VISUAL_ID:
		case EncapsulatedAttributeEditPart.VISUAL_ID:
		case EncapsulatedAssociationEditPart.VISUAL_ID:
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
			return uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
