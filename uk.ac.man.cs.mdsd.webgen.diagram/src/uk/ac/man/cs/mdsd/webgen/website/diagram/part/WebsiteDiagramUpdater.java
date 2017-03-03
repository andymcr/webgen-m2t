package uk.ac.man.cs.mdsd.webgen.website.diagram.part;

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

import uk.ac.man.cs.mdsd.webgen.base.Classifier;
import uk.ac.man.cs.mdsd.webgen.base.EnumerationLiteral;
import uk.ac.man.cs.mdsd.webgen.base.EnumerationType;
import uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithContainment;
import uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithoutContainment;
import uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.Entity;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature;
import uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.ViewAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.ViewFeature;
import uk.ac.man.cs.mdsd.webgen.service.BusinessOperation;
import uk.ac.man.cs.mdsd.webgen.service.Selection;
import uk.ac.man.cs.mdsd.webgen.service.Service;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.*;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.AssociationWithContainmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.AssociationWithoutContainmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.CasAuthenticationEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.CreateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.CreateUnitUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.CreateUpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.CreateUpdateUnitUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DataTypeAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DataTypeEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DateAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DeleteActionEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnit2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnit3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnit4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnitUnitFieldCompartment2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnitUnitFieldCompartment3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnitUnitFieldCompartment4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnitUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EntityAttributeCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EntityEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EnumerationLiteralEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EnumerationTypeEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EnumerationTypeEnumerationsCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitActionCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitUnitFieldCompartment2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitUnitFieldCompartment3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitUnitFieldCompartment4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.LocalAuthenticationSystemEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.PageEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.PageLinkEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SearchUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SearchUnitUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectAction2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectAction3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectAction4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectAction5EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectActionEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.ServiceEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.StaticUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UpdateUnitUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.WebGenModelEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.WebsitePropertiesAuthenticationCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.WebsitePropertiesEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;
import uk.ac.man.cs.mdsd.webgen.webui.ContentUnit;
import uk.ac.man.cs.mdsd.webgen.webui.CreateUnit;
import uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit;
import uk.ac.man.cs.mdsd.webgen.webui.DetailsUnit;
import uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit;
import uk.ac.man.cs.mdsd.webgen.webui.IndexUnit;
import uk.ac.man.cs.mdsd.webgen.webui.InlineAction;
import uk.ac.man.cs.mdsd.webgen.webui.Menu;
import uk.ac.man.cs.mdsd.webgen.webui.MenuEntry;
import uk.ac.man.cs.mdsd.webgen.webui.Page;
import uk.ac.man.cs.mdsd.webgen.webui.PageLink;
import uk.ac.man.cs.mdsd.webgen.webui.SearchUnit;
import uk.ac.man.cs.mdsd.webgen.webui.StaticMenu;
import uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.webui.UnitElement;
import uk.ac.man.cs.mdsd.webgen.webui.UnitField;
import uk.ac.man.cs.mdsd.webgen.webui.UnitSupportAction;
import uk.ac.man.cs.mdsd.webgen.webui.UpdateUnit;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * @generated
 */
public class WebsiteDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<WebsiteNodeDescriptor> getSemanticChildren(View view) {
		switch (WebsiteVisualIDRegistry.getVisualID(view)) {
		case WebGenModelEditPart.VISUAL_ID:
			return getWebGenModel_1000SemanticChildren(view);
		case WebsitePropertiesAuthenticationCompartmentEditPart.VISUAL_ID:
			return getWebsitePropertiesAuthenticationCompartment_7007SemanticChildren(view);
		case EnumerationTypeEnumerationsCompartmentEditPart.VISUAL_ID:
			return getEnumerationTypeEnumerationsCompartment_7138SemanticChildren(view);
		case EntityAttributeCompartmentEditPart.VISUAL_ID:
			return getEntityAttributeCompartment_7139SemanticChildren(view);
		case EntityModelLabelsCompartmentEditPart.VISUAL_ID:
			return getEntityModelLabelsCompartment_7140SemanticChildren(view);
		case ViewAttributeCompartmentEditPart.VISUAL_ID:
			return getViewAttributeCompartment_7141SemanticChildren(view);
		case ViewModelLabelsCompartmentEditPart.VISUAL_ID:
			return getViewModelLabelsCompartment_7142SemanticChildren(view);
		case ServiceSelectionsCompartmentEditPart.VISUAL_ID:
			return getServiceSelectionsCompartment_7143SemanticChildren(view);
		case ServiceOperationsCompartmentEditPart.VISUAL_ID:
			return getServiceOperationsCompartment_7144SemanticChildren(view);
		case StaticMenuMenuEntriesCompartmentEditPart.VISUAL_ID:
			return getStaticMenuMenuEntriesCompartment_7185SemanticChildren(view);
		case PageInterfaceUnitsCompartmentEditPart.VISUAL_ID:
			return getPageInterfaceUnitsCompartment_7146SemanticChildren(view);
		case CreateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			return getCreateUnitUnitFieldCompartment_7147SemanticChildren(view);
		case CreateUpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			return getCreateUpdateUnitUnitFieldCompartment_7148SemanticChildren(view);
		case UnitAssociationInterfaceUnitsCompartmentEditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7149SemanticChildren(view);
		case CreateUpdateUnitUnitFieldCompartment2EditPart.VISUAL_ID:
			return getCreateUpdateUnitUnitFieldCompartment_7150SemanticChildren(view);
		case DetailsUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			return getDetailsUnitUnitFieldCompartment_7151SemanticChildren(view);
		case DetailsUnitActionCompartmentEditPart.VISUAL_ID:
			return getDetailsUnitActionCompartment_7152SemanticChildren(view);
		case UnitElementActionCompartmentEditPart.VISUAL_ID:
			return getUnitElementActionCompartment_7153SemanticChildren(view);
		case UnitAssociationInterfaceUnitsCompartment2EditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7154SemanticChildren(view);
		case UnitAssociationActionCompartmentEditPart.VISUAL_ID:
			return getUnitAssociationActionCompartment_7155SemanticChildren(view);
		case DetailsUnitUnitFieldCompartment2EditPart.VISUAL_ID:
			return getDetailsUnitUnitFieldCompartment_7156SemanticChildren(view);
		case UnitAssociationInterfaceUnitsCompartment3EditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7157SemanticChildren(view);
		case DetailsUnitUnitFieldCompartment3EditPart.VISUAL_ID:
			return getDetailsUnitUnitFieldCompartment_7158SemanticChildren(view);
		case IndexUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7159SemanticChildren(view);
		case IndexUnitUnitFieldCompartment2EditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7160SemanticChildren(view);
		case IndexUnitActionCompartmentEditPart.VISUAL_ID:
			return getIndexUnitActionCompartment_7161SemanticChildren(view);
		case UnitAssociationInterfaceUnitsCompartment4EditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7162SemanticChildren(view);
		case DetailsUnitUnitFieldCompartment4EditPart.VISUAL_ID:
			return getDetailsUnitUnitFieldCompartment_7163SemanticChildren(view);
		case UnitAssociationInterfaceUnitsCompartment5EditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7164SemanticChildren(view);
		case DetailsUnitUnitFieldCompartment5EditPart.VISUAL_ID:
			return getDetailsUnitUnitFieldCompartment_7165SemanticChildren(view);
		case IndexUnitUnitFieldCompartment3EditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7166SemanticChildren(view);
		case IndexUnitUnitFieldCompartment4EditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7167SemanticChildren(view);
		case UnitAssociationInterfaceUnitsCompartment6EditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7168SemanticChildren(view);
		case DetailsUnitUnitFieldCompartment6EditPart.VISUAL_ID:
			return getDetailsUnitUnitFieldCompartment_7169SemanticChildren(view);
		case IndexUnitUnitFieldCompartment5EditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7170SemanticChildren(view);
		case ImageIndexUnitActionCompartmentEditPart.VISUAL_ID:
			return getImageIndexUnitActionCompartment_7171SemanticChildren(view);
		case IndexUnitUnitFieldCompartment6EditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7172SemanticChildren(view);
		case IndexUnitActionCompartment2EditPart.VISUAL_ID:
			return getIndexUnitActionCompartment_7173SemanticChildren(view);
		case UnitElementActionCompartment2EditPart.VISUAL_ID:
			return getUnitElementActionCompartment_7174SemanticChildren(view);
		case UnitAssociationInterfaceUnitsCompartment7EditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7175SemanticChildren(view);
		case UnitAssociationActionCompartment2EditPart.VISUAL_ID:
			return getUnitAssociationActionCompartment_7176SemanticChildren(view);
		case DetailsUnitUnitFieldCompartment7EditPart.VISUAL_ID:
			return getDetailsUnitUnitFieldCompartment_7177SemanticChildren(view);
		case IndexUnitUnitFieldCompartment7EditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7178SemanticChildren(view);
		case SearchUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			return getSearchUnitUnitFieldCompartment_7179SemanticChildren(view);
		case UpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			return getUpdateUnitUnitFieldCompartment_7180SemanticChildren(view);
		case UnitAssociationInterfaceUnitsCompartment8EditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7181SemanticChildren(view);
		case IndexUnitUnitFieldCompartment8EditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7182SemanticChildren(view);
		case IndexUnitActionCompartment3EditPart.VISUAL_ID:
			return getIndexUnitActionCompartment_7183SemanticChildren(view);
		case ImageIndexUnitActionCompartment2EditPart.VISUAL_ID:
			return getImageIndexUnitActionCompartment_7184SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteNodeDescriptor> getWebGenModel_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WebGenModel modelElement = (WebGenModel) view.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		{
			WebsiteProperties childElement = modelElement.getWebsiteProperties();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == WebsitePropertiesEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getClassifiers().iterator(); it.hasNext();) {
			Classifier childElement = (Classifier) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataTypeEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnumerationTypeEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntityEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ViewEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getServices().iterator(); it.hasNext();) {
			Service childElement = (Service) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ServiceEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMenus().iterator(); it.hasNext();) {
			Menu childElement = (Menu) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DynamicMenuEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StaticMenuEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPages().iterator(); it.hasNext();) {
			Page childElement = (Page) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PageEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebsiteNodeDescriptor> getWebsitePropertiesAuthenticationCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WebsiteProperties modelElement = (WebsiteProperties) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		{
			security.Authentication childElement = modelElement.getAuthentication();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LocalAuthenticationSystemEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
			}
			if (visualID == CasAuthenticationEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getEnumerationTypeEnumerationsCompartment_7138SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EnumerationType modelElement = (EnumerationType) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEnumerations().iterator(); it.hasNext();) {
			EnumerationLiteral childElement = (EnumerationLiteral) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EnumerationLiteralEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getEntityAttributeCompartment_7139SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Entity modelElement = (Entity) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEntityFeatures().iterator(); it.hasNext();) {
			EntityFeature childElement = (EntityFeature) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataTypeAttributeEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateAttributeEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UrlAttributeEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FileAttributeEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImageAttributeEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LocationAttributeEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getEntityModelLabelsCompartment_7140SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Entity modelElement = (Entity) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLabels().iterator(); it.hasNext();) {
			ModelLabel childElement = (ModelLabel) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ModelLabelEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getViewAttributeCompartment_7141SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		uk.ac.man.cs.mdsd.webgen.persistence.View modelElement = (uk.ac.man.cs.mdsd.webgen.persistence.View) containerView
				.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getViewFeatures().iterator(); it.hasNext();) {
			ViewFeature childElement = (ViewFeature) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EncapsulatedAttributeEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EncapsulatedAssociationEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getViewModelLabelsCompartment_7142SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		uk.ac.man.cs.mdsd.webgen.persistence.View modelElement = (uk.ac.man.cs.mdsd.webgen.persistence.View) containerView
				.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLabels().iterator(); it.hasNext();) {
			ModelLabel childElement = (ModelLabel) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ModelLabel2EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getPageInterfaceUnitsCompartment_7146SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Page modelElement = (Page) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUnits().iterator(); it.hasNext();) {
			ContentUnit childElement = (ContentUnit) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CreateUnitEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CreateUpdateUnitEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CreateSitemapUnitEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DetailsUnitEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IndexUnit6EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MapUnitEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SearchUnitEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StaticUnitEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UpdateUnitEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImageIndexUnit2EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SliderUnitEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GalleryUnitEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getCreateUnitUnitFieldCompartment_7147SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CreateUnit modelElement = (CreateUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElementEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociationEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataTypeFieldEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateFieldEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getCreateUpdateUnitUnitFieldCompartment_7148SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CreateUpdateUnit modelElement = (CreateUpdateUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement2EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation2EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataTypeField2EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateField2EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7149SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UnitAssociation modelElement = (UnitAssociation) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUnits().iterator(); it.hasNext();) {
			ContentUnit childElement = (ContentUnit) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CreateUpdateUnit2EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getCreateUpdateUnitUnitFieldCompartment_7150SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CreateUpdateUnit modelElement = (CreateUpdateUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement3EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getDetailsUnitUnitFieldCompartment_7151SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DetailsUnit modelElement = (DetailsUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement4EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation3EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataTypeField3EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateField3EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getDetailsUnitActionCompartment_7152SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DetailsUnit modelElement = (DetailsUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSupportActions().iterator(); it.hasNext();) {
			UnitSupportAction childElement = (UnitSupportAction) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitSupportActionEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getUnitElementActionCompartment_7153SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UnitElement modelElement = (UnitElement) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it.hasNext();) {
			InlineAction childElement = (InlineAction) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectActionEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7154SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UnitAssociation modelElement = (UnitAssociation) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUnits().iterator(); it.hasNext();) {
			ContentUnit childElement = (ContentUnit) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DetailsUnit2EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IndexUnit2EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImageIndexUnitEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getUnitAssociationActionCompartment_7155SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UnitAssociation modelElement = (UnitAssociation) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it.hasNext();) {
			InlineAction childElement = (InlineAction) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectAction4EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getDetailsUnitUnitFieldCompartment_7156SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DetailsUnit modelElement = (DetailsUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement5EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation4EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7157SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UnitAssociation modelElement = (UnitAssociation) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUnits().iterator(); it.hasNext();) {
			ContentUnit childElement = (ContentUnit) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DetailsUnit3EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IndexUnitEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getDetailsUnitUnitFieldCompartment_7158SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DetailsUnit modelElement = (DetailsUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement6EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7159SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndexUnit modelElement = (IndexUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement7EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7160SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndexUnit modelElement = (IndexUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement8EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation5EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getIndexUnitActionCompartment_7161SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndexUnit modelElement = (IndexUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it.hasNext();) {
			InlineAction childElement = (InlineAction) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectAction2EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeleteActionEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7162SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UnitAssociation modelElement = (UnitAssociation) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUnits().iterator(); it.hasNext();) {
			ContentUnit childElement = (ContentUnit) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DetailsUnit4EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IndexUnit4EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getDetailsUnitUnitFieldCompartment_7163SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DetailsUnit modelElement = (DetailsUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement9EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation6EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7164SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UnitAssociation modelElement = (UnitAssociation) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUnits().iterator(); it.hasNext();) {
			ContentUnit childElement = (ContentUnit) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DetailsUnit5EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IndexUnit3EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getDetailsUnitUnitFieldCompartment_7165SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DetailsUnit modelElement = (DetailsUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement10EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation7EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7166SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndexUnit modelElement = (IndexUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement11EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation8EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7167SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndexUnit modelElement = (IndexUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement12EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation9EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7168SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UnitAssociation modelElement = (UnitAssociation) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUnits().iterator(); it.hasNext();) {
			ContentUnit childElement = (ContentUnit) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DetailsUnit6EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IndexUnit5EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getDetailsUnitUnitFieldCompartment_7169SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DetailsUnit modelElement = (DetailsUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement13EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation10EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7170SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndexUnit modelElement = (IndexUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement14EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation11EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getImageIndexUnitActionCompartment_7171SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ImageIndexUnit modelElement = (ImageIndexUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it.hasNext();) {
			InlineAction childElement = (InlineAction) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectAction3EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeleteAction2EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FeatureSupportActionEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7172SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndexUnit modelElement = (IndexUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement15EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation12EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataTypeField4EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateField4EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getIndexUnitActionCompartment_7173SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndexUnit modelElement = (IndexUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it.hasNext();) {
			InlineAction childElement = (InlineAction) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectAction7EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeleteAction3EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FeatureSupportAction2EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getUnitElementActionCompartment_7174SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UnitElement modelElement = (UnitElement) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it.hasNext();) {
			InlineAction childElement = (InlineAction) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectAction5EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7175SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UnitAssociation modelElement = (UnitAssociation) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUnits().iterator(); it.hasNext();) {
			ContentUnit childElement = (ContentUnit) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DetailsUnit7EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IndexUnit7EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getUnitAssociationActionCompartment_7176SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UnitAssociation modelElement = (UnitAssociation) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it.hasNext();) {
			InlineAction childElement = (InlineAction) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectAction6EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getDetailsUnitUnitFieldCompartment_7177SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DetailsUnit modelElement = (DetailsUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement16EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation13EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7178SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndexUnit modelElement = (IndexUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement17EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation14EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getSearchUnitUnitFieldCompartment_7179SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SearchUnit modelElement = (SearchUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement18EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation15EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataTypeField5EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateField5EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getUpdateUnitUnitFieldCompartment_7180SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UpdateUnit modelElement = (UpdateUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement19EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation16EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataTypeField6EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateField6EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7181SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UnitAssociation modelElement = (UnitAssociation) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUnits().iterator(); it.hasNext();) {
			ContentUnit childElement = (ContentUnit) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IndexUnit8EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7182SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndexUnit modelElement = (IndexUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDisplayFields().iterator(); it.hasNext();) {
			UnitField childElement = (UnitField) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UnitElement20EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnitAssociation17EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getIndexUnitActionCompartment_7183SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IndexUnit modelElement = (IndexUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it.hasNext();) {
			InlineAction childElement = (InlineAction) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectAction8EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeleteAction4EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getImageIndexUnitActionCompartment_7184SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ImageIndexUnit modelElement = (ImageIndexUnit) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it.hasNext();) {
			InlineAction childElement = (InlineAction) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectAction9EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeleteAction5EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FeatureSupportAction3EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getStaticMenuMenuEntriesCompartment_7185SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		StaticMenu modelElement = (StaticMenu) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEntries().iterator(); it.hasNext();) {
			MenuEntry childElement = (MenuEntry) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActionMenuEntryEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EditStaticTextMenuEntryEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getServiceSelectionsCompartment_7143SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Service modelElement = (Service) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSelections().iterator(); it.hasNext();) {
			Selection childElement = (Selection) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectionEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getServiceOperationsCompartment_7144SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Service modelElement = (Service) containerView.getElement();
		LinkedList<WebsiteNodeDescriptor> result = new LinkedList<WebsiteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			BusinessOperation childElement = (BusinessOperation) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == BusinessOperationEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getContainedLinks(View view) {
		switch (WebsiteVisualIDRegistry.getVisualID(view)) {
		case WebGenModelEditPart.VISUAL_ID:
			return getWebGenModel_1000ContainedLinks(view);
		case WebsitePropertiesEditPart.VISUAL_ID:
			return getWebsiteProperties_2001ContainedLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_2013ContainedLinks(view);
		case EnumerationTypeEditPart.VISUAL_ID:
			return getEnumerationType_2014ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2015ContainedLinks(view);
		case ViewEditPart.VISUAL_ID:
			return getView_2016ContainedLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2017ContainedLinks(view);
		case DynamicMenuEditPart.VISUAL_ID:
			return getDynamicMenu_2018ContainedLinks(view);
		case StaticMenuEditPart.VISUAL_ID:
			return getStaticMenu_2020ContainedLinks(view);
		case PageEditPart.VISUAL_ID:
			return getPage_2019ContainedLinks(view);
		case LocalAuthenticationSystemEditPart.VISUAL_ID:
			return getLocalAuthenticationSystem_3382ContainedLinks(view);
		case CasAuthenticationEditPart.VISUAL_ID:
			return getCasAuthentication_3383ContainedLinks(view);
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getEnumerationLiteral_3273ContainedLinks(view);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getDataTypeAttribute_3274ContainedLinks(view);
		case DateAttributeEditPart.VISUAL_ID:
			return getDateAttribute_3275ContainedLinks(view);
		case UrlAttributeEditPart.VISUAL_ID:
			return getUrlAttribute_3276ContainedLinks(view);
		case FileAttributeEditPart.VISUAL_ID:
			return getFileAttribute_3277ContainedLinks(view);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImageAttribute_3278ContainedLinks(view);
		case LocationAttributeEditPart.VISUAL_ID:
			return getLocationAttribute_3279ContainedLinks(view);
		case ModelLabelEditPart.VISUAL_ID:
			return getModelLabel_3280ContainedLinks(view);
		case ModelLabel2EditPart.VISUAL_ID:
			return getModelLabel_3281ContainedLinks(view);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getEncapsulatedAttribute_3282ContainedLinks(view);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getEncapsulatedAssociation_3283ContainedLinks(view);
		case SelectionEditPart.VISUAL_ID:
			return getSelection_3284ContainedLinks(view);
		case BusinessOperationEditPart.VISUAL_ID:
			return getBusinessOperation_3285ContainedLinks(view);
		case ActionMenuEntryEditPart.VISUAL_ID:
			return getActionMenuEntry_3380ContainedLinks(view);
		case EditStaticTextMenuEntryEditPart.VISUAL_ID:
			return getEditStaticTextMenuEntry_3381ContainedLinks(view);
		case CreateUnitEditPart.VISUAL_ID:
			return getCreateUnit_3286ContainedLinks(view);
		case UnitElementEditPart.VISUAL_ID:
			return getUnitElement_3287ContainedLinks(view);
		case UnitAssociationEditPart.VISUAL_ID:
			return getUnitAssociation_3288ContainedLinks(view);
		case DataTypeFieldEditPart.VISUAL_ID:
			return getDataTypeField_3289ContainedLinks(view);
		case DateFieldEditPart.VISUAL_ID:
			return getDateField_3290ContainedLinks(view);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3291ContainedLinks(view);
		case UnitElement2EditPart.VISUAL_ID:
			return getUnitElement_3292ContainedLinks(view);
		case UnitAssociation2EditPart.VISUAL_ID:
			return getUnitAssociation_3293ContainedLinks(view);
		case CreateUpdateUnit2EditPart.VISUAL_ID:
			return getCreateUpdateUnit_3294ContainedLinks(view);
		case UnitElement3EditPart.VISUAL_ID:
			return getUnitElement_3295ContainedLinks(view);
		case DataTypeField2EditPart.VISUAL_ID:
			return getDataTypeField_3296ContainedLinks(view);
		case DateField2EditPart.VISUAL_ID:
			return getDateField_3297ContainedLinks(view);
		case CreateSitemapUnitEditPart.VISUAL_ID:
			return getCreateSitemapUnit_3298ContainedLinks(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3299ContainedLinks(view);
		case UnitElement4EditPart.VISUAL_ID:
			return getUnitElement_3300ContainedLinks(view);
		case SelectActionEditPart.VISUAL_ID:
			return getSelectAction_3301ContainedLinks(view);
		case UnitAssociation3EditPart.VISUAL_ID:
			return getUnitAssociation_3302ContainedLinks(view);
		case DetailsUnit2EditPart.VISUAL_ID:
			return getDetailsUnit_3303ContainedLinks(view);
		case UnitElement5EditPart.VISUAL_ID:
			return getUnitElement_3304ContainedLinks(view);
		case UnitAssociation4EditPart.VISUAL_ID:
			return getUnitAssociation_3305ContainedLinks(view);
		case DetailsUnit3EditPart.VISUAL_ID:
			return getDetailsUnit_3306ContainedLinks(view);
		case UnitElement6EditPart.VISUAL_ID:
			return getUnitElement_3307ContainedLinks(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3308ContainedLinks(view);
		case UnitElement7EditPart.VISUAL_ID:
			return getUnitElement_3309ContainedLinks(view);
		case IndexUnit2EditPart.VISUAL_ID:
			return getIndexUnit_3310ContainedLinks(view);
		case UnitElement8EditPart.VISUAL_ID:
			return getUnitElement_3311ContainedLinks(view);
		case UnitAssociation5EditPart.VISUAL_ID:
			return getUnitAssociation_3312ContainedLinks(view);
		case DetailsUnit4EditPart.VISUAL_ID:
			return getDetailsUnit_3313ContainedLinks(view);
		case UnitElement9EditPart.VISUAL_ID:
			return getUnitElement_3314ContainedLinks(view);
		case UnitAssociation6EditPart.VISUAL_ID:
			return getUnitAssociation_3315ContainedLinks(view);
		case DetailsUnit5EditPart.VISUAL_ID:
			return getDetailsUnit_3316ContainedLinks(view);
		case UnitElement10EditPart.VISUAL_ID:
			return getUnitElement_3317ContainedLinks(view);
		case UnitAssociation7EditPart.VISUAL_ID:
			return getUnitAssociation_3318ContainedLinks(view);
		case IndexUnit3EditPart.VISUAL_ID:
			return getIndexUnit_3319ContainedLinks(view);
		case UnitElement11EditPart.VISUAL_ID:
			return getUnitElement_3320ContainedLinks(view);
		case UnitAssociation8EditPart.VISUAL_ID:
			return getUnitAssociation_3321ContainedLinks(view);
		case IndexUnit4EditPart.VISUAL_ID:
			return getIndexUnit_3322ContainedLinks(view);
		case UnitElement12EditPart.VISUAL_ID:
			return getUnitElement_3323ContainedLinks(view);
		case UnitAssociation9EditPart.VISUAL_ID:
			return getUnitAssociation_3324ContainedLinks(view);
		case DetailsUnit6EditPart.VISUAL_ID:
			return getDetailsUnit_3325ContainedLinks(view);
		case UnitElement13EditPart.VISUAL_ID:
			return getUnitElement_3326ContainedLinks(view);
		case UnitAssociation10EditPart.VISUAL_ID:
			return getUnitAssociation_3327ContainedLinks(view);
		case IndexUnit5EditPart.VISUAL_ID:
			return getIndexUnit_3328ContainedLinks(view);
		case UnitElement14EditPart.VISUAL_ID:
			return getUnitElement_3329ContainedLinks(view);
		case UnitAssociation11EditPart.VISUAL_ID:
			return getUnitAssociation_3330ContainedLinks(view);
		case SelectAction2EditPart.VISUAL_ID:
			return getSelectAction_3331ContainedLinks(view);
		case DeleteActionEditPart.VISUAL_ID:
			return getDeleteAction_3332ContainedLinks(view);
		case ImageIndexUnitEditPart.VISUAL_ID:
			return getImageIndexUnit_3333ContainedLinks(view);
		case SelectAction3EditPart.VISUAL_ID:
			return getSelectAction_3334ContainedLinks(view);
		case DeleteAction2EditPart.VISUAL_ID:
			return getDeleteAction_3335ContainedLinks(view);
		case FeatureSupportActionEditPart.VISUAL_ID:
			return getFeatureSupportAction_3336ContainedLinks(view);
		case SelectAction4EditPart.VISUAL_ID:
			return getSelectAction_3337ContainedLinks(view);
		case DataTypeField3EditPart.VISUAL_ID:
			return getDataTypeField_3338ContainedLinks(view);
		case DateField3EditPart.VISUAL_ID:
			return getDateField_3339ContainedLinks(view);
		case UnitSupportActionEditPart.VISUAL_ID:
			return getUnitSupportAction_3340ContainedLinks(view);
		case IndexUnit6EditPart.VISUAL_ID:
			return getIndexUnit_3341ContainedLinks(view);
		case UnitElement15EditPart.VISUAL_ID:
			return getUnitElement_3342ContainedLinks(view);
		case SelectAction5EditPart.VISUAL_ID:
			return getSelectAction_3343ContainedLinks(view);
		case UnitAssociation12EditPart.VISUAL_ID:
			return getUnitAssociation_3344ContainedLinks(view);
		case DetailsUnit7EditPart.VISUAL_ID:
			return getDetailsUnit_3345ContainedLinks(view);
		case UnitElement16EditPart.VISUAL_ID:
			return getUnitElement_3346ContainedLinks(view);
		case UnitAssociation13EditPart.VISUAL_ID:
			return getUnitAssociation_3347ContainedLinks(view);
		case IndexUnit7EditPart.VISUAL_ID:
			return getIndexUnit_3348ContainedLinks(view);
		case UnitElement17EditPart.VISUAL_ID:
			return getUnitElement_3349ContainedLinks(view);
		case UnitAssociation14EditPart.VISUAL_ID:
			return getUnitAssociation_3350ContainedLinks(view);
		case SelectAction6EditPart.VISUAL_ID:
			return getSelectAction_3351ContainedLinks(view);
		case DataTypeField4EditPart.VISUAL_ID:
			return getDataTypeField_3352ContainedLinks(view);
		case DateField4EditPart.VISUAL_ID:
			return getDateField_3353ContainedLinks(view);
		case SelectAction7EditPart.VISUAL_ID:
			return getSelectAction_3354ContainedLinks(view);
		case DeleteAction3EditPart.VISUAL_ID:
			return getDeleteAction_3355ContainedLinks(view);
		case FeatureSupportAction2EditPart.VISUAL_ID:
			return getFeatureSupportAction_3356ContainedLinks(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3357ContainedLinks(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3358ContainedLinks(view);
		case UnitElement18EditPart.VISUAL_ID:
			return getUnitElement_3359ContainedLinks(view);
		case UnitAssociation15EditPart.VISUAL_ID:
			return getUnitAssociation_3360ContainedLinks(view);
		case DataTypeField5EditPart.VISUAL_ID:
			return getDataTypeField_3361ContainedLinks(view);
		case DateField5EditPart.VISUAL_ID:
			return getDateField_3362ContainedLinks(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3363ContainedLinks(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3364ContainedLinks(view);
		case UnitElement19EditPart.VISUAL_ID:
			return getUnitElement_3365ContainedLinks(view);
		case UnitAssociation16EditPart.VISUAL_ID:
			return getUnitAssociation_3366ContainedLinks(view);
		case IndexUnit8EditPart.VISUAL_ID:
			return getIndexUnit_3367ContainedLinks(view);
		case UnitElement20EditPart.VISUAL_ID:
			return getUnitElement_3368ContainedLinks(view);
		case UnitAssociation17EditPart.VISUAL_ID:
			return getUnitAssociation_3369ContainedLinks(view);
		case SelectAction8EditPart.VISUAL_ID:
			return getSelectAction_3370ContainedLinks(view);
		case DeleteAction4EditPart.VISUAL_ID:
			return getDeleteAction_3371ContainedLinks(view);
		case DataTypeField6EditPart.VISUAL_ID:
			return getDataTypeField_3372ContainedLinks(view);
		case DateField6EditPart.VISUAL_ID:
			return getDateField_3373ContainedLinks(view);
		case ImageIndexUnit2EditPart.VISUAL_ID:
			return getImageIndexUnit_3374ContainedLinks(view);
		case SelectAction9EditPart.VISUAL_ID:
			return getSelectAction_3375ContainedLinks(view);
		case DeleteAction5EditPart.VISUAL_ID:
			return getDeleteAction_3376ContainedLinks(view);
		case FeatureSupportAction3EditPart.VISUAL_ID:
			return getFeatureSupportAction_3377ContainedLinks(view);
		case SliderUnitEditPart.VISUAL_ID:
			return getSliderUnit_3378ContainedLinks(view);
		case GalleryUnitEditPart.VISUAL_ID:
			return getGalleryUnit_3379ContainedLinks(view);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getAssociationWithoutContainment_4005ContainedLinks(view);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getAssociationWithContainment_4006ContainedLinks(view);
		case ViewAssociationEditPart.VISUAL_ID:
			return getViewAssociation_4007ContainedLinks(view);
		case PageLinkEditPart.VISUAL_ID:
			return getPageLink_4008ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIncomingLinks(View view) {
		switch (WebsiteVisualIDRegistry.getVisualID(view)) {
		case WebsitePropertiesEditPart.VISUAL_ID:
			return getWebsiteProperties_2001IncomingLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_2013IncomingLinks(view);
		case EnumerationTypeEditPart.VISUAL_ID:
			return getEnumerationType_2014IncomingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2015IncomingLinks(view);
		case ViewEditPart.VISUAL_ID:
			return getView_2016IncomingLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2017IncomingLinks(view);
		case DynamicMenuEditPart.VISUAL_ID:
			return getDynamicMenu_2018IncomingLinks(view);
		case StaticMenuEditPart.VISUAL_ID:
			return getStaticMenu_2020IncomingLinks(view);
		case PageEditPart.VISUAL_ID:
			return getPage_2019IncomingLinks(view);
		case LocalAuthenticationSystemEditPart.VISUAL_ID:
			return getLocalAuthenticationSystem_3382IncomingLinks(view);
		case CasAuthenticationEditPart.VISUAL_ID:
			return getCasAuthentication_3383IncomingLinks(view);
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getEnumerationLiteral_3273IncomingLinks(view);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getDataTypeAttribute_3274IncomingLinks(view);
		case DateAttributeEditPart.VISUAL_ID:
			return getDateAttribute_3275IncomingLinks(view);
		case UrlAttributeEditPart.VISUAL_ID:
			return getUrlAttribute_3276IncomingLinks(view);
		case FileAttributeEditPart.VISUAL_ID:
			return getFileAttribute_3277IncomingLinks(view);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImageAttribute_3278IncomingLinks(view);
		case LocationAttributeEditPart.VISUAL_ID:
			return getLocationAttribute_3279IncomingLinks(view);
		case ModelLabelEditPart.VISUAL_ID:
			return getModelLabel_3280IncomingLinks(view);
		case ModelLabel2EditPart.VISUAL_ID:
			return getModelLabel_3281IncomingLinks(view);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getEncapsulatedAttribute_3282IncomingLinks(view);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getEncapsulatedAssociation_3283IncomingLinks(view);
		case SelectionEditPart.VISUAL_ID:
			return getSelection_3284IncomingLinks(view);
		case BusinessOperationEditPart.VISUAL_ID:
			return getBusinessOperation_3285IncomingLinks(view);
		case ActionMenuEntryEditPart.VISUAL_ID:
			return getActionMenuEntry_3380IncomingLinks(view);
		case EditStaticTextMenuEntryEditPart.VISUAL_ID:
			return getEditStaticTextMenuEntry_3381IncomingLinks(view);
		case CreateUnitEditPart.VISUAL_ID:
			return getCreateUnit_3286IncomingLinks(view);
		case UnitElementEditPart.VISUAL_ID:
			return getUnitElement_3287IncomingLinks(view);
		case UnitAssociationEditPart.VISUAL_ID:
			return getUnitAssociation_3288IncomingLinks(view);
		case DataTypeFieldEditPart.VISUAL_ID:
			return getDataTypeField_3289IncomingLinks(view);
		case DateFieldEditPart.VISUAL_ID:
			return getDateField_3290IncomingLinks(view);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3291IncomingLinks(view);
		case UnitElement2EditPart.VISUAL_ID:
			return getUnitElement_3292IncomingLinks(view);
		case UnitAssociation2EditPart.VISUAL_ID:
			return getUnitAssociation_3293IncomingLinks(view);
		case CreateUpdateUnit2EditPart.VISUAL_ID:
			return getCreateUpdateUnit_3294IncomingLinks(view);
		case UnitElement3EditPart.VISUAL_ID:
			return getUnitElement_3295IncomingLinks(view);
		case DataTypeField2EditPart.VISUAL_ID:
			return getDataTypeField_3296IncomingLinks(view);
		case DateField2EditPart.VISUAL_ID:
			return getDateField_3297IncomingLinks(view);
		case CreateSitemapUnitEditPart.VISUAL_ID:
			return getCreateSitemapUnit_3298IncomingLinks(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3299IncomingLinks(view);
		case UnitElement4EditPart.VISUAL_ID:
			return getUnitElement_3300IncomingLinks(view);
		case SelectActionEditPart.VISUAL_ID:
			return getSelectAction_3301IncomingLinks(view);
		case UnitAssociation3EditPart.VISUAL_ID:
			return getUnitAssociation_3302IncomingLinks(view);
		case DetailsUnit2EditPart.VISUAL_ID:
			return getDetailsUnit_3303IncomingLinks(view);
		case UnitElement5EditPart.VISUAL_ID:
			return getUnitElement_3304IncomingLinks(view);
		case UnitAssociation4EditPart.VISUAL_ID:
			return getUnitAssociation_3305IncomingLinks(view);
		case DetailsUnit3EditPart.VISUAL_ID:
			return getDetailsUnit_3306IncomingLinks(view);
		case UnitElement6EditPart.VISUAL_ID:
			return getUnitElement_3307IncomingLinks(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3308IncomingLinks(view);
		case UnitElement7EditPart.VISUAL_ID:
			return getUnitElement_3309IncomingLinks(view);
		case IndexUnit2EditPart.VISUAL_ID:
			return getIndexUnit_3310IncomingLinks(view);
		case UnitElement8EditPart.VISUAL_ID:
			return getUnitElement_3311IncomingLinks(view);
		case UnitAssociation5EditPart.VISUAL_ID:
			return getUnitAssociation_3312IncomingLinks(view);
		case DetailsUnit4EditPart.VISUAL_ID:
			return getDetailsUnit_3313IncomingLinks(view);
		case UnitElement9EditPart.VISUAL_ID:
			return getUnitElement_3314IncomingLinks(view);
		case UnitAssociation6EditPart.VISUAL_ID:
			return getUnitAssociation_3315IncomingLinks(view);
		case DetailsUnit5EditPart.VISUAL_ID:
			return getDetailsUnit_3316IncomingLinks(view);
		case UnitElement10EditPart.VISUAL_ID:
			return getUnitElement_3317IncomingLinks(view);
		case UnitAssociation7EditPart.VISUAL_ID:
			return getUnitAssociation_3318IncomingLinks(view);
		case IndexUnit3EditPart.VISUAL_ID:
			return getIndexUnit_3319IncomingLinks(view);
		case UnitElement11EditPart.VISUAL_ID:
			return getUnitElement_3320IncomingLinks(view);
		case UnitAssociation8EditPart.VISUAL_ID:
			return getUnitAssociation_3321IncomingLinks(view);
		case IndexUnit4EditPart.VISUAL_ID:
			return getIndexUnit_3322IncomingLinks(view);
		case UnitElement12EditPart.VISUAL_ID:
			return getUnitElement_3323IncomingLinks(view);
		case UnitAssociation9EditPart.VISUAL_ID:
			return getUnitAssociation_3324IncomingLinks(view);
		case DetailsUnit6EditPart.VISUAL_ID:
			return getDetailsUnit_3325IncomingLinks(view);
		case UnitElement13EditPart.VISUAL_ID:
			return getUnitElement_3326IncomingLinks(view);
		case UnitAssociation10EditPart.VISUAL_ID:
			return getUnitAssociation_3327IncomingLinks(view);
		case IndexUnit5EditPart.VISUAL_ID:
			return getIndexUnit_3328IncomingLinks(view);
		case UnitElement14EditPart.VISUAL_ID:
			return getUnitElement_3329IncomingLinks(view);
		case UnitAssociation11EditPart.VISUAL_ID:
			return getUnitAssociation_3330IncomingLinks(view);
		case SelectAction2EditPart.VISUAL_ID:
			return getSelectAction_3331IncomingLinks(view);
		case DeleteActionEditPart.VISUAL_ID:
			return getDeleteAction_3332IncomingLinks(view);
		case ImageIndexUnitEditPart.VISUAL_ID:
			return getImageIndexUnit_3333IncomingLinks(view);
		case SelectAction3EditPart.VISUAL_ID:
			return getSelectAction_3334IncomingLinks(view);
		case DeleteAction2EditPart.VISUAL_ID:
			return getDeleteAction_3335IncomingLinks(view);
		case FeatureSupportActionEditPart.VISUAL_ID:
			return getFeatureSupportAction_3336IncomingLinks(view);
		case SelectAction4EditPart.VISUAL_ID:
			return getSelectAction_3337IncomingLinks(view);
		case DataTypeField3EditPart.VISUAL_ID:
			return getDataTypeField_3338IncomingLinks(view);
		case DateField3EditPart.VISUAL_ID:
			return getDateField_3339IncomingLinks(view);
		case UnitSupportActionEditPart.VISUAL_ID:
			return getUnitSupportAction_3340IncomingLinks(view);
		case IndexUnit6EditPart.VISUAL_ID:
			return getIndexUnit_3341IncomingLinks(view);
		case UnitElement15EditPart.VISUAL_ID:
			return getUnitElement_3342IncomingLinks(view);
		case SelectAction5EditPart.VISUAL_ID:
			return getSelectAction_3343IncomingLinks(view);
		case UnitAssociation12EditPart.VISUAL_ID:
			return getUnitAssociation_3344IncomingLinks(view);
		case DetailsUnit7EditPart.VISUAL_ID:
			return getDetailsUnit_3345IncomingLinks(view);
		case UnitElement16EditPart.VISUAL_ID:
			return getUnitElement_3346IncomingLinks(view);
		case UnitAssociation13EditPart.VISUAL_ID:
			return getUnitAssociation_3347IncomingLinks(view);
		case IndexUnit7EditPart.VISUAL_ID:
			return getIndexUnit_3348IncomingLinks(view);
		case UnitElement17EditPart.VISUAL_ID:
			return getUnitElement_3349IncomingLinks(view);
		case UnitAssociation14EditPart.VISUAL_ID:
			return getUnitAssociation_3350IncomingLinks(view);
		case SelectAction6EditPart.VISUAL_ID:
			return getSelectAction_3351IncomingLinks(view);
		case DataTypeField4EditPart.VISUAL_ID:
			return getDataTypeField_3352IncomingLinks(view);
		case DateField4EditPart.VISUAL_ID:
			return getDateField_3353IncomingLinks(view);
		case SelectAction7EditPart.VISUAL_ID:
			return getSelectAction_3354IncomingLinks(view);
		case DeleteAction3EditPart.VISUAL_ID:
			return getDeleteAction_3355IncomingLinks(view);
		case FeatureSupportAction2EditPart.VISUAL_ID:
			return getFeatureSupportAction_3356IncomingLinks(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3357IncomingLinks(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3358IncomingLinks(view);
		case UnitElement18EditPart.VISUAL_ID:
			return getUnitElement_3359IncomingLinks(view);
		case UnitAssociation15EditPart.VISUAL_ID:
			return getUnitAssociation_3360IncomingLinks(view);
		case DataTypeField5EditPart.VISUAL_ID:
			return getDataTypeField_3361IncomingLinks(view);
		case DateField5EditPart.VISUAL_ID:
			return getDateField_3362IncomingLinks(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3363IncomingLinks(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3364IncomingLinks(view);
		case UnitElement19EditPart.VISUAL_ID:
			return getUnitElement_3365IncomingLinks(view);
		case UnitAssociation16EditPart.VISUAL_ID:
			return getUnitAssociation_3366IncomingLinks(view);
		case IndexUnit8EditPart.VISUAL_ID:
			return getIndexUnit_3367IncomingLinks(view);
		case UnitElement20EditPart.VISUAL_ID:
			return getUnitElement_3368IncomingLinks(view);
		case UnitAssociation17EditPart.VISUAL_ID:
			return getUnitAssociation_3369IncomingLinks(view);
		case SelectAction8EditPart.VISUAL_ID:
			return getSelectAction_3370IncomingLinks(view);
		case DeleteAction4EditPart.VISUAL_ID:
			return getDeleteAction_3371IncomingLinks(view);
		case DataTypeField6EditPart.VISUAL_ID:
			return getDataTypeField_3372IncomingLinks(view);
		case DateField6EditPart.VISUAL_ID:
			return getDateField_3373IncomingLinks(view);
		case ImageIndexUnit2EditPart.VISUAL_ID:
			return getImageIndexUnit_3374IncomingLinks(view);
		case SelectAction9EditPart.VISUAL_ID:
			return getSelectAction_3375IncomingLinks(view);
		case DeleteAction5EditPart.VISUAL_ID:
			return getDeleteAction_3376IncomingLinks(view);
		case FeatureSupportAction3EditPart.VISUAL_ID:
			return getFeatureSupportAction_3377IncomingLinks(view);
		case SliderUnitEditPart.VISUAL_ID:
			return getSliderUnit_3378IncomingLinks(view);
		case GalleryUnitEditPart.VISUAL_ID:
			return getGalleryUnit_3379IncomingLinks(view);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getAssociationWithoutContainment_4005IncomingLinks(view);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getAssociationWithContainment_4006IncomingLinks(view);
		case ViewAssociationEditPart.VISUAL_ID:
			return getViewAssociation_4007IncomingLinks(view);
		case PageLinkEditPart.VISUAL_ID:
			return getPageLink_4008IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getOutgoingLinks(View view) {
		switch (WebsiteVisualIDRegistry.getVisualID(view)) {
		case WebsitePropertiesEditPart.VISUAL_ID:
			return getWebsiteProperties_2001OutgoingLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_2013OutgoingLinks(view);
		case EnumerationTypeEditPart.VISUAL_ID:
			return getEnumerationType_2014OutgoingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2015OutgoingLinks(view);
		case ViewEditPart.VISUAL_ID:
			return getView_2016OutgoingLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2017OutgoingLinks(view);
		case DynamicMenuEditPart.VISUAL_ID:
			return getDynamicMenu_2018OutgoingLinks(view);
		case StaticMenuEditPart.VISUAL_ID:
			return getStaticMenu_2020OutgoingLinks(view);
		case PageEditPart.VISUAL_ID:
			return getPage_2019OutgoingLinks(view);
		case LocalAuthenticationSystemEditPart.VISUAL_ID:
			return getLocalAuthenticationSystem_3382OutgoingLinks(view);
		case CasAuthenticationEditPart.VISUAL_ID:
			return getCasAuthentication_3383OutgoingLinks(view);
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getEnumerationLiteral_3273OutgoingLinks(view);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getDataTypeAttribute_3274OutgoingLinks(view);
		case DateAttributeEditPart.VISUAL_ID:
			return getDateAttribute_3275OutgoingLinks(view);
		case UrlAttributeEditPart.VISUAL_ID:
			return getUrlAttribute_3276OutgoingLinks(view);
		case FileAttributeEditPart.VISUAL_ID:
			return getFileAttribute_3277OutgoingLinks(view);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImageAttribute_3278OutgoingLinks(view);
		case LocationAttributeEditPart.VISUAL_ID:
			return getLocationAttribute_3279OutgoingLinks(view);
		case ModelLabelEditPart.VISUAL_ID:
			return getModelLabel_3280OutgoingLinks(view);
		case ModelLabel2EditPart.VISUAL_ID:
			return getModelLabel_3281OutgoingLinks(view);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getEncapsulatedAttribute_3282OutgoingLinks(view);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getEncapsulatedAssociation_3283OutgoingLinks(view);
		case SelectionEditPart.VISUAL_ID:
			return getSelection_3284OutgoingLinks(view);
		case BusinessOperationEditPart.VISUAL_ID:
			return getBusinessOperation_3285OutgoingLinks(view);
		case ActionMenuEntryEditPart.VISUAL_ID:
			return getActionMenuEntry_3380OutgoingLinks(view);
		case EditStaticTextMenuEntryEditPart.VISUAL_ID:
			return getEditStaticTextMenuEntry_3381OutgoingLinks(view);
		case CreateUnitEditPart.VISUAL_ID:
			return getCreateUnit_3286OutgoingLinks(view);
		case UnitElementEditPart.VISUAL_ID:
			return getUnitElement_3287OutgoingLinks(view);
		case UnitAssociationEditPart.VISUAL_ID:
			return getUnitAssociation_3288OutgoingLinks(view);
		case DataTypeFieldEditPart.VISUAL_ID:
			return getDataTypeField_3289OutgoingLinks(view);
		case DateFieldEditPart.VISUAL_ID:
			return getDateField_3290OutgoingLinks(view);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3291OutgoingLinks(view);
		case UnitElement2EditPart.VISUAL_ID:
			return getUnitElement_3292OutgoingLinks(view);
		case UnitAssociation2EditPart.VISUAL_ID:
			return getUnitAssociation_3293OutgoingLinks(view);
		case CreateUpdateUnit2EditPart.VISUAL_ID:
			return getCreateUpdateUnit_3294OutgoingLinks(view);
		case UnitElement3EditPart.VISUAL_ID:
			return getUnitElement_3295OutgoingLinks(view);
		case DataTypeField2EditPart.VISUAL_ID:
			return getDataTypeField_3296OutgoingLinks(view);
		case DateField2EditPart.VISUAL_ID:
			return getDateField_3297OutgoingLinks(view);
		case CreateSitemapUnitEditPart.VISUAL_ID:
			return getCreateSitemapUnit_3298OutgoingLinks(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3299OutgoingLinks(view);
		case UnitElement4EditPart.VISUAL_ID:
			return getUnitElement_3300OutgoingLinks(view);
		case SelectActionEditPart.VISUAL_ID:
			return getSelectAction_3301OutgoingLinks(view);
		case UnitAssociation3EditPart.VISUAL_ID:
			return getUnitAssociation_3302OutgoingLinks(view);
		case DetailsUnit2EditPart.VISUAL_ID:
			return getDetailsUnit_3303OutgoingLinks(view);
		case UnitElement5EditPart.VISUAL_ID:
			return getUnitElement_3304OutgoingLinks(view);
		case UnitAssociation4EditPart.VISUAL_ID:
			return getUnitAssociation_3305OutgoingLinks(view);
		case DetailsUnit3EditPart.VISUAL_ID:
			return getDetailsUnit_3306OutgoingLinks(view);
		case UnitElement6EditPart.VISUAL_ID:
			return getUnitElement_3307OutgoingLinks(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3308OutgoingLinks(view);
		case UnitElement7EditPart.VISUAL_ID:
			return getUnitElement_3309OutgoingLinks(view);
		case IndexUnit2EditPart.VISUAL_ID:
			return getIndexUnit_3310OutgoingLinks(view);
		case UnitElement8EditPart.VISUAL_ID:
			return getUnitElement_3311OutgoingLinks(view);
		case UnitAssociation5EditPart.VISUAL_ID:
			return getUnitAssociation_3312OutgoingLinks(view);
		case DetailsUnit4EditPart.VISUAL_ID:
			return getDetailsUnit_3313OutgoingLinks(view);
		case UnitElement9EditPart.VISUAL_ID:
			return getUnitElement_3314OutgoingLinks(view);
		case UnitAssociation6EditPart.VISUAL_ID:
			return getUnitAssociation_3315OutgoingLinks(view);
		case DetailsUnit5EditPart.VISUAL_ID:
			return getDetailsUnit_3316OutgoingLinks(view);
		case UnitElement10EditPart.VISUAL_ID:
			return getUnitElement_3317OutgoingLinks(view);
		case UnitAssociation7EditPart.VISUAL_ID:
			return getUnitAssociation_3318OutgoingLinks(view);
		case IndexUnit3EditPart.VISUAL_ID:
			return getIndexUnit_3319OutgoingLinks(view);
		case UnitElement11EditPart.VISUAL_ID:
			return getUnitElement_3320OutgoingLinks(view);
		case UnitAssociation8EditPart.VISUAL_ID:
			return getUnitAssociation_3321OutgoingLinks(view);
		case IndexUnit4EditPart.VISUAL_ID:
			return getIndexUnit_3322OutgoingLinks(view);
		case UnitElement12EditPart.VISUAL_ID:
			return getUnitElement_3323OutgoingLinks(view);
		case UnitAssociation9EditPart.VISUAL_ID:
			return getUnitAssociation_3324OutgoingLinks(view);
		case DetailsUnit6EditPart.VISUAL_ID:
			return getDetailsUnit_3325OutgoingLinks(view);
		case UnitElement13EditPart.VISUAL_ID:
			return getUnitElement_3326OutgoingLinks(view);
		case UnitAssociation10EditPart.VISUAL_ID:
			return getUnitAssociation_3327OutgoingLinks(view);
		case IndexUnit5EditPart.VISUAL_ID:
			return getIndexUnit_3328OutgoingLinks(view);
		case UnitElement14EditPart.VISUAL_ID:
			return getUnitElement_3329OutgoingLinks(view);
		case UnitAssociation11EditPart.VISUAL_ID:
			return getUnitAssociation_3330OutgoingLinks(view);
		case SelectAction2EditPart.VISUAL_ID:
			return getSelectAction_3331OutgoingLinks(view);
		case DeleteActionEditPart.VISUAL_ID:
			return getDeleteAction_3332OutgoingLinks(view);
		case ImageIndexUnitEditPart.VISUAL_ID:
			return getImageIndexUnit_3333OutgoingLinks(view);
		case SelectAction3EditPart.VISUAL_ID:
			return getSelectAction_3334OutgoingLinks(view);
		case DeleteAction2EditPart.VISUAL_ID:
			return getDeleteAction_3335OutgoingLinks(view);
		case FeatureSupportActionEditPart.VISUAL_ID:
			return getFeatureSupportAction_3336OutgoingLinks(view);
		case SelectAction4EditPart.VISUAL_ID:
			return getSelectAction_3337OutgoingLinks(view);
		case DataTypeField3EditPart.VISUAL_ID:
			return getDataTypeField_3338OutgoingLinks(view);
		case DateField3EditPart.VISUAL_ID:
			return getDateField_3339OutgoingLinks(view);
		case UnitSupportActionEditPart.VISUAL_ID:
			return getUnitSupportAction_3340OutgoingLinks(view);
		case IndexUnit6EditPart.VISUAL_ID:
			return getIndexUnit_3341OutgoingLinks(view);
		case UnitElement15EditPart.VISUAL_ID:
			return getUnitElement_3342OutgoingLinks(view);
		case SelectAction5EditPart.VISUAL_ID:
			return getSelectAction_3343OutgoingLinks(view);
		case UnitAssociation12EditPart.VISUAL_ID:
			return getUnitAssociation_3344OutgoingLinks(view);
		case DetailsUnit7EditPart.VISUAL_ID:
			return getDetailsUnit_3345OutgoingLinks(view);
		case UnitElement16EditPart.VISUAL_ID:
			return getUnitElement_3346OutgoingLinks(view);
		case UnitAssociation13EditPart.VISUAL_ID:
			return getUnitAssociation_3347OutgoingLinks(view);
		case IndexUnit7EditPart.VISUAL_ID:
			return getIndexUnit_3348OutgoingLinks(view);
		case UnitElement17EditPart.VISUAL_ID:
			return getUnitElement_3349OutgoingLinks(view);
		case UnitAssociation14EditPart.VISUAL_ID:
			return getUnitAssociation_3350OutgoingLinks(view);
		case SelectAction6EditPart.VISUAL_ID:
			return getSelectAction_3351OutgoingLinks(view);
		case DataTypeField4EditPart.VISUAL_ID:
			return getDataTypeField_3352OutgoingLinks(view);
		case DateField4EditPart.VISUAL_ID:
			return getDateField_3353OutgoingLinks(view);
		case SelectAction7EditPart.VISUAL_ID:
			return getSelectAction_3354OutgoingLinks(view);
		case DeleteAction3EditPart.VISUAL_ID:
			return getDeleteAction_3355OutgoingLinks(view);
		case FeatureSupportAction2EditPart.VISUAL_ID:
			return getFeatureSupportAction_3356OutgoingLinks(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3357OutgoingLinks(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3358OutgoingLinks(view);
		case UnitElement18EditPart.VISUAL_ID:
			return getUnitElement_3359OutgoingLinks(view);
		case UnitAssociation15EditPart.VISUAL_ID:
			return getUnitAssociation_3360OutgoingLinks(view);
		case DataTypeField5EditPart.VISUAL_ID:
			return getDataTypeField_3361OutgoingLinks(view);
		case DateField5EditPart.VISUAL_ID:
			return getDateField_3362OutgoingLinks(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3363OutgoingLinks(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3364OutgoingLinks(view);
		case UnitElement19EditPart.VISUAL_ID:
			return getUnitElement_3365OutgoingLinks(view);
		case UnitAssociation16EditPart.VISUAL_ID:
			return getUnitAssociation_3366OutgoingLinks(view);
		case IndexUnit8EditPart.VISUAL_ID:
			return getIndexUnit_3367OutgoingLinks(view);
		case UnitElement20EditPart.VISUAL_ID:
			return getUnitElement_3368OutgoingLinks(view);
		case UnitAssociation17EditPart.VISUAL_ID:
			return getUnitAssociation_3369OutgoingLinks(view);
		case SelectAction8EditPart.VISUAL_ID:
			return getSelectAction_3370OutgoingLinks(view);
		case DeleteAction4EditPart.VISUAL_ID:
			return getDeleteAction_3371OutgoingLinks(view);
		case DataTypeField6EditPart.VISUAL_ID:
			return getDataTypeField_3372OutgoingLinks(view);
		case DateField6EditPart.VISUAL_ID:
			return getDateField_3373OutgoingLinks(view);
		case ImageIndexUnit2EditPart.VISUAL_ID:
			return getImageIndexUnit_3374OutgoingLinks(view);
		case SelectAction9EditPart.VISUAL_ID:
			return getSelectAction_3375OutgoingLinks(view);
		case DeleteAction5EditPart.VISUAL_ID:
			return getDeleteAction_3376OutgoingLinks(view);
		case FeatureSupportAction3EditPart.VISUAL_ID:
			return getFeatureSupportAction_3377OutgoingLinks(view);
		case SliderUnitEditPart.VISUAL_ID:
			return getSliderUnit_3378OutgoingLinks(view);
		case GalleryUnitEditPart.VISUAL_ID:
			return getGalleryUnit_3379OutgoingLinks(view);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getAssociationWithoutContainment_4005OutgoingLinks(view);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getAssociationWithContainment_4006OutgoingLinks(view);
		case ViewAssociationEditPart.VISUAL_ID:
			return getViewAssociation_4007OutgoingLinks(view);
		case PageLinkEditPart.VISUAL_ID:
			return getPageLink_4008OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getWebGenModel_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getWebsiteProperties_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataType_2013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDynamicMenu_2018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEnumerationType_2014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEntity_2015ContainedLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssociationWithoutContainment_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AssociationWithContainment_4006(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getView_2016ContainedLinks(View view) {
		uk.ac.man.cs.mdsd.webgen.persistence.View modelElement = (uk.ac.man.cs.mdsd.webgen.persistence.View) view
				.getElement();
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ViewAssociation_4007(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getPage_2019ContainedLinks(View view) {
		Page modelElement = (Page) view.getElement();
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PageLink_4008(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getLocalAuthenticationSystem_3382ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCasAuthentication_3383ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getStaticMenu_2020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getService_2017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEnumerationLiteral_3273ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeAttribute_3274ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateAttribute_3275ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUrlAttribute_3276ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFileAttribute_3277ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getImageAttribute_3278ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getLocationAttribute_3279ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getModelLabel_3280ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getModelLabel_3281ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEncapsulatedAttribute_3282ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEncapsulatedAssociation_3283ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateUnit_3286ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3287ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3288ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3289ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3290ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateUpdateUnit_3291ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3292ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3293ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateUpdateUnit_3294ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3295ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3296ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3297ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateSitemapUnit_3298ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3299ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3300ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3301ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3302ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3303ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3304ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3305ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3306ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3307ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3308ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3309ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3310ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3311ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3312ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3313ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3314ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3315ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3316ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3317ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3318ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3319ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3320ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3321ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3322ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3323ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3324ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3325ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3326ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3327ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3328ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3329ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3330ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3331ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3332ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getImageIndexUnit_3333ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3334ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3335ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFeatureSupportAction_3336ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3337ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3338ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3339ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitSupportAction_3340ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3341ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3342ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3343ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3344ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3345ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3346ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3347ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3348ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3349ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3350ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3351ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3352ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3353ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3354ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3355ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFeatureSupportAction_3356ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getMapUnit_3357ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSearchUnit_3358ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3359ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3360ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3361ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3362ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getStaticUnit_3363ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUpdateUnit_3364ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3365ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3366ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3367ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3368ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3369ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3370ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3371ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3372ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3373ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getImageIndexUnit_3374ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3375ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3376ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFeatureSupportAction_3377ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSliderUnit_3378ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getGalleryUnit_3379ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getActionMenuEntry_3380ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEditStaticTextMenuEntry_3381ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getAssociationWithoutContainment_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getAssociationWithContainment_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getViewAssociation_4007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getPageLink_4008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelection_3284ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getBusinessOperation_3285ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getWebsiteProperties_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataType_2013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDynamicMenu_2018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEnumerationType_2014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEntity_2015IncomingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssociationWithoutContainment_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssociationWithContainment_4006(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getView_2016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getPage_2019IncomingLinks(View view) {
		Page modelElement = (Page) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PageLink_4008(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getLocalAuthenticationSystem_3382IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCasAuthentication_3383IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getStaticMenu_2020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getService_2017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEnumerationLiteral_3273IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeAttribute_3274IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateAttribute_3275IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUrlAttribute_3276IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFileAttribute_3277IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getImageAttribute_3278IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getLocationAttribute_3279IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getModelLabel_3280IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getModelLabel_3281IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEncapsulatedAttribute_3282IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEncapsulatedAssociation_3283IncomingLinks(View view) {
		EncapsulatedAssociation modelElement = (EncapsulatedAssociation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ViewAssociation_4007(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateUnit_3286IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3287IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3288IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3289IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3290IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateUpdateUnit_3291IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3292IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3293IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateUpdateUnit_3294IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3295IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3296IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3297IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateSitemapUnit_3298IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3299IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3300IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3301IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3302IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3303IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3304IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3305IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3306IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3307IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3308IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3309IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3310IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3311IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3312IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3313IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3314IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3315IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3316IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3317IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3318IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3319IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3320IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3321IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3322IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3323IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3324IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3325IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3326IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3327IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3328IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3329IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3330IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3331IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3332IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getImageIndexUnit_3333IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3334IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3335IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFeatureSupportAction_3336IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3337IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3338IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3339IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitSupportAction_3340IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3341IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3342IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3343IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3344IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3345IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3346IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3347IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3348IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3349IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3350IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3351IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3352IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3353IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3354IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3355IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFeatureSupportAction_3356IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getMapUnit_3357IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSearchUnit_3358IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3359IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3360IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3361IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3362IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getStaticUnit_3363IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUpdateUnit_3364IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3365IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3366IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3367IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3368IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3369IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3370IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3371IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3372IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3373IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getImageIndexUnit_3374IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3375IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3376IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFeatureSupportAction_3377IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSliderUnit_3378IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getGalleryUnit_3379IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getActionMenuEntry_3380IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEditStaticTextMenuEntry_3381IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getAssociationWithoutContainment_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getAssociationWithContainment_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getViewAssociation_4007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getPageLink_4008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelection_3284IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getBusinessOperation_3285IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getWebsiteProperties_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataType_2013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDynamicMenu_2018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEnumerationType_2014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEntity_2015OutgoingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssociationWithoutContainment_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AssociationWithContainment_4006(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getView_2016OutgoingLinks(View view) {
		uk.ac.man.cs.mdsd.webgen.persistence.View modelElement = (uk.ac.man.cs.mdsd.webgen.persistence.View) view
				.getElement();
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ViewAssociation_4007(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getPage_2019OutgoingLinks(View view) {
		Page modelElement = (Page) view.getElement();
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PageLink_4008(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getLocalAuthenticationSystem_3382OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCasAuthentication_3383OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getStaticMenu_2020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getService_2017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEnumerationLiteral_3273OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeAttribute_3274OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateAttribute_3275OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUrlAttribute_3276OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFileAttribute_3277OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getImageAttribute_3278OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getLocationAttribute_3279OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getModelLabel_3280OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getModelLabel_3281OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEncapsulatedAttribute_3282OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEncapsulatedAssociation_3283OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateUnit_3286OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3287OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3288OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3289OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3290OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateUpdateUnit_3291OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3292OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3293OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateUpdateUnit_3294OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3295OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3296OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3297OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateSitemapUnit_3298OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3299OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3300OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3301OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3302OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3303OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3304OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3305OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3306OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3307OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3308OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3309OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3310OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3311OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3312OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3313OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3314OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3315OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3316OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3317OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3318OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3319OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3320OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3321OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3322OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3323OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3324OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3325OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3326OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3327OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3328OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3329OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3330OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3331OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3332OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getImageIndexUnit_3333OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3334OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3335OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFeatureSupportAction_3336OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3337OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3338OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3339OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitSupportAction_3340OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3341OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3342OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3343OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3344OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3345OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3346OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3347OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3348OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3349OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3350OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3351OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3352OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3353OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3354OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3355OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFeatureSupportAction_3356OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getMapUnit_3357OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSearchUnit_3358OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3359OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3360OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3361OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3362OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getStaticUnit_3363OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUpdateUnit_3364OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3365OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3366OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getIndexUnit_3367OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3368OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3369OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3370OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3371OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeField_3372OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateField_3373OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getImageIndexUnit_3374OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelectAction_3375OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDeleteAction_3376OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFeatureSupportAction_3377OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSliderUnit_3378OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getGalleryUnit_3379OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getActionMenuEntry_3380OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEditStaticTextMenuEntry_3381OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getAssociationWithoutContainment_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getAssociationWithContainment_4006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getViewAssociation_4007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getPageLink_4008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getSelection_3284OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getBusinessOperation_3285OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<WebsiteLinkDescriptor> getContainedTypeModelFacetLinks_AssociationWithoutContainment_4005(
			Entity container) {
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		for (Iterator<?> links = container.getEntityFeatures().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssociationWithoutContainment) {
				continue;
			}
			AssociationWithoutContainment link = (AssociationWithoutContainment) linkObject;
			if (AssociationWithoutContainmentEditPart.VISUAL_ID != WebsiteVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getTargetEntity();
			result.add(new WebsiteLinkDescriptor(container, dst, link,
					WebsiteElementTypes.AssociationWithoutContainment_4005,
					AssociationWithoutContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WebsiteLinkDescriptor> getContainedTypeModelFacetLinks_AssociationWithContainment_4006(
			Entity container) {
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		for (Iterator<?> links = container.getEntityFeatures().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssociationWithContainment) {
				continue;
			}
			AssociationWithContainment link = (AssociationWithContainment) linkObject;
			if (AssociationWithContainmentEditPart.VISUAL_ID != WebsiteVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getTargetEntity();
			result.add(new WebsiteLinkDescriptor(container, dst, link,
					WebsiteElementTypes.AssociationWithContainment_4006, AssociationWithContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WebsiteLinkDescriptor> getContainedTypeModelFacetLinks_ViewAssociation_4007(
			uk.ac.man.cs.mdsd.webgen.persistence.View container) {
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		for (Iterator<?> links = container.getViewFeatures().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ViewAssociation) {
				continue;
			}
			ViewAssociation link = (ViewAssociation) linkObject;
			if (ViewAssociationEditPart.VISUAL_ID != WebsiteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			EncapsulatedAssociation dst = link.getOpposite();
			result.add(new WebsiteLinkDescriptor(container, dst, link, WebsiteElementTypes.ViewAssociation_4007,
					ViewAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WebsiteLinkDescriptor> getContainedTypeModelFacetLinks_PageLink_4008(Page container) {
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		PageLink link = container.getParentPage();
		if (PageLinkEditPart.VISUAL_ID != WebsiteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Page dst = link.getTargetPage();
		result.add(new WebsiteLinkDescriptor(container, dst, link, WebsiteElementTypes.PageLink_4008,
				PageLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WebsiteLinkDescriptor> getIncomingTypeModelFacetLinks_AssociationWithoutContainment_4005(
			Entity target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PersistencePackage.eINSTANCE.getEntityAssociation_TargetEntity()
					|| false == setting.getEObject() instanceof AssociationWithoutContainment) {
				continue;
			}
			AssociationWithoutContainment link = (AssociationWithoutContainment) setting.getEObject();
			if (AssociationWithoutContainmentEditPart.VISUAL_ID != WebsiteVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Entity) {
				continue;
			}
			Entity container = (Entity) link.eContainer();
			result.add(new WebsiteLinkDescriptor(container, target, link,
					WebsiteElementTypes.AssociationWithoutContainment_4005,
					AssociationWithoutContainmentEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WebsiteLinkDescriptor> getIncomingTypeModelFacetLinks_AssociationWithContainment_4006(
			Entity target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PersistencePackage.eINSTANCE.getEntityAssociation_TargetEntity()
					|| false == setting.getEObject() instanceof AssociationWithContainment) {
				continue;
			}
			AssociationWithContainment link = (AssociationWithContainment) setting.getEObject();
			if (AssociationWithContainmentEditPart.VISUAL_ID != WebsiteVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Entity) {
				continue;
			}
			Entity container = (Entity) link.eContainer();
			result.add(new WebsiteLinkDescriptor(container, target, link,
					WebsiteElementTypes.AssociationWithContainment_4006, AssociationWithContainmentEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WebsiteLinkDescriptor> getIncomingTypeModelFacetLinks_ViewAssociation_4007(
			EncapsulatedAssociation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PersistencePackage.eINSTANCE.getViewAssociation_Opposite()
					|| false == setting.getEObject() instanceof ViewAssociation) {
				continue;
			}
			ViewAssociation link = (ViewAssociation) setting.getEObject();
			if (ViewAssociationEditPart.VISUAL_ID != WebsiteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof uk.ac.man.cs.mdsd.webgen.persistence.View) {
				continue;
			}
			uk.ac.man.cs.mdsd.webgen.persistence.View container = (uk.ac.man.cs.mdsd.webgen.persistence.View) link
					.eContainer();
			result.add(new WebsiteLinkDescriptor(container, target, link, WebsiteElementTypes.ViewAssociation_4007,
					ViewAssociationEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WebsiteLinkDescriptor> getIncomingTypeModelFacetLinks_PageLink_4008(Page target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WebuiPackage.eINSTANCE.getPageLink_TargetPage()
					|| false == setting.getEObject() instanceof PageLink) {
				continue;
			}
			PageLink link = (PageLink) setting.getEObject();
			if (PageLinkEditPart.VISUAL_ID != WebsiteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Page) {
				continue;
			}
			Page container = (Page) link.eContainer();
			result.add(new WebsiteLinkDescriptor(container, target, link, WebsiteElementTypes.PageLink_4008,
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

		public List<WebsiteNodeDescriptor> getSemanticChildren(View view) {
			return WebsiteDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WebsiteLinkDescriptor> getContainedLinks(View view) {
			return WebsiteDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WebsiteLinkDescriptor> getIncomingLinks(View view) {
			return WebsiteDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WebsiteLinkDescriptor> getOutgoingLinks(View view) {
			return WebsiteDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
