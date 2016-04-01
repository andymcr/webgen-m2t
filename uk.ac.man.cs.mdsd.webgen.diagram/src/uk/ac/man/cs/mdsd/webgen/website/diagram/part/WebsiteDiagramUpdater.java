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

import uk.ac.man.cs.mdsd.webgen.website.AssociationWithContainment;
import uk.ac.man.cs.mdsd.webgen.website.AssociationWithoutContainment;
import uk.ac.man.cs.mdsd.webgen.website.Authentication;
import uk.ac.man.cs.mdsd.webgen.website.Classifier;
import uk.ac.man.cs.mdsd.webgen.website.ContentUnit;
import uk.ac.man.cs.mdsd.webgen.website.CreateUnit;
import uk.ac.man.cs.mdsd.webgen.website.CreateUpdateUnit;
import uk.ac.man.cs.mdsd.webgen.website.DetailsUnit;
import uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.EntityFeature;
import uk.ac.man.cs.mdsd.webgen.website.EnumerationLiteral;
import uk.ac.man.cs.mdsd.webgen.website.EnumerationType;
import uk.ac.man.cs.mdsd.webgen.website.IndexUnit;
import uk.ac.man.cs.mdsd.webgen.website.InlineAction;
import uk.ac.man.cs.mdsd.webgen.website.Menu;
import uk.ac.man.cs.mdsd.webgen.website.MenuEntry;
import uk.ac.man.cs.mdsd.webgen.website.ModelLabel;
import uk.ac.man.cs.mdsd.webgen.website.Page;
import uk.ac.man.cs.mdsd.webgen.website.PageLink;
import uk.ac.man.cs.mdsd.webgen.website.SearchUnit;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.StaticMenu;
import uk.ac.man.cs.mdsd.webgen.website.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.website.UnitElement;
import uk.ac.man.cs.mdsd.webgen.website.UnitField;
import uk.ac.man.cs.mdsd.webgen.website.UnitSupportAction;
import uk.ac.man.cs.mdsd.webgen.website.UpdateUnit;
import uk.ac.man.cs.mdsd.webgen.website.ViewAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ViewFeature;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
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
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.PageInterfaceUnitCompartmentEditPart;
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
			return getEnumerationTypeEnumerationsCompartment_7016SemanticChildren(view);
		case EntityAttributeCompartmentEditPart.VISUAL_ID:
			return getEntityAttributeCompartment_7001SemanticChildren(view);
		case EntityModelLabelsCompartmentEditPart.VISUAL_ID:
			return getEntityModelLabelsCompartment_7118SemanticChildren(view);
		case ViewAttributeCompartmentEditPart.VISUAL_ID:
			return getViewAttributeCompartment_7119SemanticChildren(view);
		case ViewModelLabelsCompartmentEditPart.VISUAL_ID:
			return getViewModelLabelsCompartment_7120SemanticChildren(view);
		case PageInterfaceUnitCompartmentEditPart.VISUAL_ID:
			return getPageInterfaceUnitsCompartment_7002SemanticChildren(view);
		case CreateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			return getCreateUnitUnitFieldCompartment_7042SemanticChildren(view);
		case CreateUpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			return getCreateUpdateUnitUnitFieldCompartment_7043SemanticChildren(view);
		case UnitAssociationInterfaceUnitsCompartment5EditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7129SemanticChildren(view);
		case CreateUpdateUnitUnitFieldCompartment2EditPart.VISUAL_ID:
			return getCreateUpdateUnitUnitFieldCompartment_7130SemanticChildren(view);
		case DetailsUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			return getDetailsUnitUnitFieldCompartment_7044SemanticChildren(view);
		case DetailsUnitActionCompartmentEditPart.VISUAL_ID:
			return getDetailsUnitActionCompartment_7087SemanticChildren(view);
		case UnitElementActionCompartmentEditPart.VISUAL_ID:
			return getUnitElementActionCompartment_7131SemanticChildren(view);
		case UnitAssociationInterfaceUnitsCompartmentEditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7122SemanticChildren(view);
		case UnitAssociationActionCompartmentEditPart.VISUAL_ID:
			return getUnitAssociationActionCompartment_7123SemanticChildren(view);
		case DetailsUnitUnitFieldCompartment2EditPart.VISUAL_ID:
			return getDetailsUnitUnitFieldCompartment_7051SemanticChildren(view);
		case UnitAssociationInterfaceUnitCompartmentEditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7096SemanticChildren(view);
		case DetailsUnitUnitFieldCompartment3EditPart.VISUAL_ID:
			return getDetailsUnitUnitFieldCompartment_7053SemanticChildren(view);
		case IndexUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7045SemanticChildren(view);
		case IndexUnitUnitFieldCompartment2EditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7054SemanticChildren(view);
		case IndexUnitActionCompartment3EditPart.VISUAL_ID:
			return getIndexUnitActionCompartment_7086SemanticChildren(view);
		case UnitAssociationInterfaceUnitCompartment2EditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7097SemanticChildren(view);
		case DetailsUnitUnitFieldCompartment4EditPart.VISUAL_ID:
			return getDetailsUnitUnitFieldCompartment_7056SemanticChildren(view);
		case UnitAssociationInterfaceUnitCompartment3EditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7098SemanticChildren(view);
		case DetailsUnitUnitFieldCompartment5EditPart.VISUAL_ID:
			return getDetailsUnitUnitFieldCompartment_7066SemanticChildren(view);
		case IndexUnitUnitFieldCompartment3EditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7057SemanticChildren(view);
		case IndexUnitUnitFieldCompartment4EditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7058SemanticChildren(view);
		case UnitAssociationInterfaceUnitsCompartment2EditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7124SemanticChildren(view);
		case DetailsUnitUnitFieldCompartment6EditPart.VISUAL_ID:
			return getDetailsUnitUnitFieldCompartment_7068SemanticChildren(view);
		case IndexUnitUnitFieldCompartment5EditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7069SemanticChildren(view);
		case IndexUnitUnitFieldCompartment6EditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7070SemanticChildren(view);
		case IndexUnitActionCompartmentEditPart.VISUAL_ID:
			return getIndexUnitActionCompartment_7071SemanticChildren(view);
		case UnitElementActionCompartment2EditPart.VISUAL_ID:
			return getUnitElementActionCompartment_7132SemanticChildren(view);
		case UnitAssociationInterfaceUnitsCompartment3EditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7126SemanticChildren(view);
		case UnitAssociationActionCompartment2EditPart.VISUAL_ID:
			return getUnitAssociationActionCompartment_7127SemanticChildren(view);
		case DetailsUnitUnitFieldCompartment7EditPart.VISUAL_ID:
			return getDetailsUnitUnitFieldCompartment_7113SemanticChildren(view);
		case IndexUnitUnitFieldCompartment7EditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7076SemanticChildren(view);
		case SearchUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			return getSearchUnitUnitFieldCompartment_7047SemanticChildren(view);
		case UpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID:
			return getUpdateUnitUnitFieldCompartment_7049SemanticChildren(view);
		case UnitAssociationInterfaceUnitsCompartment4EditPart.VISUAL_ID:
			return getUnitAssociationInterfaceUnitsCompartment_7128SemanticChildren(view);
		case IndexUnitUnitFieldCompartment8EditPart.VISUAL_ID:
			return getIndexUnitUnitFieldCompartment_7115SemanticChildren(view);
		case IndexUnitActionCompartment2EditPart.VISUAL_ID:
			return getIndexUnitActionCompartment_7116SemanticChildren(view);
		case StaticMenuIncludedFeaturesCompartmentEditPart.VISUAL_ID:
			return getStaticMenuMenuEntriesCompartment_7084SemanticChildren(view);
		case ServiceFeaturesCompartmentEditPart.VISUAL_ID:
			return getServiceSelectionsCompartment_7006SemanticChildren(view);
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
		for (Iterator<?> it = modelElement.getServices().iterator(); it.hasNext();) {
			Service childElement = (Service) it.next();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ServiceEditPart.VISUAL_ID) {
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
			Authentication childElement = modelElement.getAuthentication();
			int visualID = WebsiteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CasAuthenticationEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
			}
			if (visualID == LocalAuthenticationSystemEditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebsiteNodeDescriptor> getEnumerationTypeEnumerationsCompartment_7016SemanticChildren(
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
	public static List<WebsiteNodeDescriptor> getEntityAttributeCompartment_7001SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getEntityModelLabelsCompartment_7118SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getViewAttributeCompartment_7119SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		uk.ac.man.cs.mdsd.webgen.website.View modelElement = (uk.ac.man.cs.mdsd.webgen.website.View) containerView
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
	public static List<WebsiteNodeDescriptor> getViewModelLabelsCompartment_7120SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		uk.ac.man.cs.mdsd.webgen.website.View modelElement = (uk.ac.man.cs.mdsd.webgen.website.View) containerView
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
	public static List<WebsiteNodeDescriptor> getPageInterfaceUnitsCompartment_7002SemanticChildren(View view) {
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
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebsiteNodeDescriptor> getCreateUnitUnitFieldCompartment_7042SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getCreateUpdateUnitUnitFieldCompartment_7043SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7129SemanticChildren(
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
	public static List<WebsiteNodeDescriptor> getCreateUpdateUnitUnitFieldCompartment_7130SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getDetailsUnitUnitFieldCompartment_7044SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getDetailsUnitActionCompartment_7087SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getUnitElementActionCompartment_7131SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7122SemanticChildren(
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
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteNodeDescriptor> getUnitAssociationActionCompartment_7123SemanticChildren(View view) {
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
			if (visualID == SelectAction3EditPart.VISUAL_ID) {
				result.add(new WebsiteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7096SemanticChildren(
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
	public static List<WebsiteNodeDescriptor> getDetailsUnitUnitFieldCompartment_7051SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7097SemanticChildren(
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
	public static List<WebsiteNodeDescriptor> getDetailsUnitUnitFieldCompartment_7053SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7045SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7054SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getIndexUnitActionCompartment_7086SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7098SemanticChildren(
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
	public static List<WebsiteNodeDescriptor> getDetailsUnitUnitFieldCompartment_7056SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getDetailsUnitUnitFieldCompartment_7066SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7057SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7058SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7124SemanticChildren(
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
	public static List<WebsiteNodeDescriptor> getDetailsUnitUnitFieldCompartment_7068SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7069SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7070SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getIndexUnitActionCompartment_7071SemanticChildren(View view) {
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
			if (visualID == SelectAction6EditPart.VISUAL_ID) {
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
	public static List<WebsiteNodeDescriptor> getUnitElementActionCompartment_7132SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7126SemanticChildren(
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
	public static List<WebsiteNodeDescriptor> getUnitAssociationActionCompartment_7127SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getDetailsUnitUnitFieldCompartment_7113SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getSearchUnitUnitFieldCompartment_7047SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getUpdateUnitUnitFieldCompartment_7049SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getUnitAssociationInterfaceUnitsCompartment_7128SemanticChildren(
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
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7115SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getIndexUnitActionCompartment_7116SemanticChildren(View view) {
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
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebsiteNodeDescriptor> getIndexUnitUnitFieldCompartment_7076SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getStaticMenuMenuEntriesCompartment_7084SemanticChildren(View view) {
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
	public static List<WebsiteNodeDescriptor> getServiceSelectionsCompartment_7006SemanticChildren(View view) {
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
	public static List<WebsiteLinkDescriptor> getContainedLinks(View view) {
		switch (WebsiteVisualIDRegistry.getVisualID(view)) {
		case WebGenModelEditPart.VISUAL_ID:
			return getWebGenModel_1000ContainedLinks(view);
		case WebsitePropertiesEditPart.VISUAL_ID:
			return getWebsiteProperties_2001ContainedLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_2002ContainedLinks(view);
		case DynamicMenuEditPart.VISUAL_ID:
			return getDynamicMenu_2008ContainedLinks(view);
		case EnumerationTypeEditPart.VISUAL_ID:
			return getEnumerationType_2006ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2003ContainedLinks(view);
		case ViewEditPart.VISUAL_ID:
			return getView_2010ContainedLinks(view);
		case PageEditPart.VISUAL_ID:
			return getPage_2005ContainedLinks(view);
		case StaticMenuEditPart.VISUAL_ID:
			return getStaticMenu_2009ContainedLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2004ContainedLinks(view);
		case CasAuthenticationEditPart.VISUAL_ID:
			return getCasAuthentication_3055ContainedLinks(view);
		case LocalAuthenticationSystemEditPart.VISUAL_ID:
			return getLocalAuthenticationSystem_3029ContainedLinks(view);
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getEnumerationLiteral_3028ContainedLinks(view);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getDataTypeAttribute_3252ContainedLinks(view);
		case DateAttributeEditPart.VISUAL_ID:
			return getDateAttribute_3253ContainedLinks(view);
		case UrlAttributeEditPart.VISUAL_ID:
			return getUrlAttribute_3254ContainedLinks(view);
		case FileAttributeEditPart.VISUAL_ID:
			return getFileAttribute_3255ContainedLinks(view);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImageAttribute_3256ContainedLinks(view);
		case LocationAttributeEditPart.VISUAL_ID:
			return getLocationAttribute_3257ContainedLinks(view);
		case ModelLabelEditPart.VISUAL_ID:
			return getModelLabel_3247ContainedLinks(view);
		case ModelLabel2EditPart.VISUAL_ID:
			return getModelLabel_3248ContainedLinks(view);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getEncapsulatedAttribute_3258ContainedLinks(view);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getEncapsulatedAssociation_3259ContainedLinks(view);
		case CreateUnitEditPart.VISUAL_ID:
			return getCreateUnit_3103ContainedLinks(view);
		case UnitElementEditPart.VISUAL_ID:
			return getUnitElement_3169ContainedLinks(view);
		case UnitAssociationEditPart.VISUAL_ID:
			return getUnitAssociation_3170ContainedLinks(view);
		case DataTypeFieldEditPart.VISUAL_ID:
			return getDataTypeField_3201ContainedLinks(view);
		case DateFieldEditPart.VISUAL_ID:
			return getDateField_3207ContainedLinks(view);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3104ContainedLinks(view);
		case UnitElement2EditPart.VISUAL_ID:
			return getUnitElement_3171ContainedLinks(view);
		case UnitAssociation2EditPart.VISUAL_ID:
			return getUnitAssociation_3172ContainedLinks(view);
		case CreateUpdateUnit2EditPart.VISUAL_ID:
			return getCreateUpdateUnit_3249ContainedLinks(view);
		case UnitElement3EditPart.VISUAL_ID:
			return getUnitElement_3173ContainedLinks(view);
		case DataTypeField2EditPart.VISUAL_ID:
			return getDataTypeField_3202ContainedLinks(view);
		case DateField2EditPart.VISUAL_ID:
			return getDateField_3208ContainedLinks(view);
		case CreateSitemapUnitEditPart.VISUAL_ID:
			return getCreateSitemapUnit_3157ContainedLinks(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3105ContainedLinks(view);
		case UnitElement4EditPart.VISUAL_ID:
			return getUnitElement_3175ContainedLinks(view);
		case SelectActionEditPart.VISUAL_ID:
			return getSelectAction_3102ContainedLinks(view);
		case UnitAssociation3EditPart.VISUAL_ID:
			return getUnitAssociation_3174ContainedLinks(view);
		case DetailsUnit2EditPart.VISUAL_ID:
			return getDetailsUnit_3112ContainedLinks(view);
		case UnitElement5EditPart.VISUAL_ID:
			return getUnitElement_3177ContainedLinks(view);
		case UnitAssociation4EditPart.VISUAL_ID:
			return getUnitAssociation_3176ContainedLinks(view);
		case DetailsUnit3EditPart.VISUAL_ID:
			return getDetailsUnit_3113ContainedLinks(view);
		case UnitElement6EditPart.VISUAL_ID:
			return getUnitElement_3178ContainedLinks(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3106ContainedLinks(view);
		case UnitElement7EditPart.VISUAL_ID:
			return getUnitElement_3179ContainedLinks(view);
		case IndexUnit2EditPart.VISUAL_ID:
			return getIndexUnit_3114ContainedLinks(view);
		case UnitElement8EditPart.VISUAL_ID:
			return getUnitElement_3181ContainedLinks(view);
		case UnitAssociation5EditPart.VISUAL_ID:
			return getUnitAssociation_3180ContainedLinks(view);
		case DetailsUnit4EditPart.VISUAL_ID:
			return getDetailsUnit_3116ContainedLinks(view);
		case UnitElement9EditPart.VISUAL_ID:
			return getUnitElement_3183ContainedLinks(view);
		case UnitAssociation6EditPart.VISUAL_ID:
			return getUnitAssociation_3182ContainedLinks(view);
		case DetailsUnit5EditPart.VISUAL_ID:
			return getDetailsUnit_3129ContainedLinks(view);
		case UnitElement10EditPart.VISUAL_ID:
			return getUnitElement_3185ContainedLinks(view);
		case UnitAssociation7EditPart.VISUAL_ID:
			return getUnitAssociation_3184ContainedLinks(view);
		case IndexUnit3EditPart.VISUAL_ID:
			return getIndexUnit_3118ContainedLinks(view);
		case UnitElement11EditPart.VISUAL_ID:
			return getUnitElement_3187ContainedLinks(view);
		case UnitAssociation8EditPart.VISUAL_ID:
			return getUnitAssociation_3186ContainedLinks(view);
		case IndexUnit4EditPart.VISUAL_ID:
			return getIndexUnit_3120ContainedLinks(view);
		case UnitElement12EditPart.VISUAL_ID:
			return getUnitElement_3189ContainedLinks(view);
		case UnitAssociation9EditPart.VISUAL_ID:
			return getUnitAssociation_3188ContainedLinks(view);
		case DetailsUnit6EditPart.VISUAL_ID:
			return getDetailsUnit_3131ContainedLinks(view);
		case UnitElement13EditPart.VISUAL_ID:
			return getUnitElement_3191ContainedLinks(view);
		case UnitAssociation10EditPart.VISUAL_ID:
			return getUnitAssociation_3190ContainedLinks(view);
		case IndexUnit5EditPart.VISUAL_ID:
			return getIndexUnit_3133ContainedLinks(view);
		case UnitElement14EditPart.VISUAL_ID:
			return getUnitElement_3193ContainedLinks(view);
		case UnitAssociation11EditPart.VISUAL_ID:
			return getUnitAssociation_3192ContainedLinks(view);
		case SelectAction2EditPart.VISUAL_ID:
			return getSelectAction_3107ContainedLinks(view);
		case DeleteActionEditPart.VISUAL_ID:
			return getDeleteAction_3101ContainedLinks(view);
		case SelectAction3EditPart.VISUAL_ID:
			return getSelectAction_3126ContainedLinks(view);
		case DataTypeField3EditPart.VISUAL_ID:
			return getDataTypeField_3203ContainedLinks(view);
		case DateField3EditPart.VISUAL_ID:
			return getDateField_3209ContainedLinks(view);
		case UnitSupportActionEditPart.VISUAL_ID:
			return getUnitSupportAction_3232ContainedLinks(view);
		case IndexUnit6EditPart.VISUAL_ID:
			return getIndexUnit_3136ContainedLinks(view);
		case UnitElement15EditPart.VISUAL_ID:
			return getUnitElement_3195ContainedLinks(view);
		case SelectAction4EditPart.VISUAL_ID:
			return getSelectAction_3127ContainedLinks(view);
		case UnitAssociation12EditPart.VISUAL_ID:
			return getUnitAssociation_3194ContainedLinks(view);
		case DetailsUnit7EditPart.VISUAL_ID:
			return getDetailsUnit_3219ContainedLinks(view);
		case UnitElement16EditPart.VISUAL_ID:
			return getUnitElement_3197ContainedLinks(view);
		case UnitAssociation13EditPart.VISUAL_ID:
			return getUnitAssociation_3196ContainedLinks(view);
		case IndexUnit7EditPart.VISUAL_ID:
			return getIndexUnit_3143ContainedLinks(view);
		case UnitElement17EditPart.VISUAL_ID:
			return getUnitElement_3199ContainedLinks(view);
		case UnitAssociation14EditPart.VISUAL_ID:
			return getUnitAssociation_3198ContainedLinks(view);
		case SelectAction5EditPart.VISUAL_ID:
			return getSelectAction_3128ContainedLinks(view);
		case DataTypeField4EditPart.VISUAL_ID:
			return getDataTypeField_3204ContainedLinks(view);
		case DateField4EditPart.VISUAL_ID:
			return getDateField_3210ContainedLinks(view);
		case SelectAction6EditPart.VISUAL_ID:
			return getSelectAction_3146ContainedLinks(view);
		case DeleteAction2EditPart.VISUAL_ID:
			return getDeleteAction_3147ContainedLinks(view);
		case FeatureSupportActionEditPart.VISUAL_ID:
			return getFeatureSupportAction_3234ContainedLinks(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3228ContainedLinks(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3109ContainedLinks(view);
		case UnitElement18EditPart.VISUAL_ID:
			return getUnitElement_3215ContainedLinks(view);
		case UnitAssociation15EditPart.VISUAL_ID:
			return getUnitAssociation_3200ContainedLinks(view);
		case DataTypeField5EditPart.VISUAL_ID:
			return getDataTypeField_3205ContainedLinks(view);
		case DateField5EditPart.VISUAL_ID:
			return getDateField_3211ContainedLinks(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3110ContainedLinks(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3111ContainedLinks(view);
		case UnitElement19EditPart.VISUAL_ID:
			return getUnitElement_3220ContainedLinks(view);
		case UnitAssociation16EditPart.VISUAL_ID:
			return getUnitAssociation_3216ContainedLinks(view);
		case IndexUnit8EditPart.VISUAL_ID:
			return getIndexUnit_3222ContainedLinks(view);
		case UnitElement20EditPart.VISUAL_ID:
			return getUnitElement_3250ContainedLinks(view);
		case UnitAssociation17EditPart.VISUAL_ID:
			return getUnitAssociation_3221ContainedLinks(view);
		case SelectAction7EditPart.VISUAL_ID:
			return getSelectAction_3153ContainedLinks(view);
		case DeleteAction3EditPart.VISUAL_ID:
			return getDeleteAction_3154ContainedLinks(view);
		case DataTypeField6EditPart.VISUAL_ID:
			return getDataTypeField_3206ContainedLinks(view);
		case DateField6EditPart.VISUAL_ID:
			return getDateField_3212ContainedLinks(view);
		case ActionMenuEntryEditPart.VISUAL_ID:
			return getActionMenuEntry_3236ContainedLinks(view);
		case EditStaticTextMenuEntryEditPart.VISUAL_ID:
			return getEditStaticTextMenuEntry_3156ContainedLinks(view);
		case SelectionEditPart.VISUAL_ID:
			return getSelection_3150ContainedLinks(view);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getAssociationWithoutContainment_4001ContainedLinks(view);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getAssociationWithContainment_4002ContainedLinks(view);
		case ViewAssociationEditPart.VISUAL_ID:
			return getViewAssociation_4004ContainedLinks(view);
		case PageLinkEditPart.VISUAL_ID:
			return getPageLink_4003ContainedLinks(view);
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
			return getDataType_2002IncomingLinks(view);
		case DynamicMenuEditPart.VISUAL_ID:
			return getDynamicMenu_2008IncomingLinks(view);
		case EnumerationTypeEditPart.VISUAL_ID:
			return getEnumerationType_2006IncomingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2003IncomingLinks(view);
		case ViewEditPart.VISUAL_ID:
			return getView_2010IncomingLinks(view);
		case PageEditPart.VISUAL_ID:
			return getPage_2005IncomingLinks(view);
		case StaticMenuEditPart.VISUAL_ID:
			return getStaticMenu_2009IncomingLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2004IncomingLinks(view);
		case CasAuthenticationEditPart.VISUAL_ID:
			return getCasAuthentication_3055IncomingLinks(view);
		case LocalAuthenticationSystemEditPart.VISUAL_ID:
			return getLocalAuthenticationSystem_3029IncomingLinks(view);
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getEnumerationLiteral_3028IncomingLinks(view);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getDataTypeAttribute_3252IncomingLinks(view);
		case DateAttributeEditPart.VISUAL_ID:
			return getDateAttribute_3253IncomingLinks(view);
		case UrlAttributeEditPart.VISUAL_ID:
			return getUrlAttribute_3254IncomingLinks(view);
		case FileAttributeEditPart.VISUAL_ID:
			return getFileAttribute_3255IncomingLinks(view);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImageAttribute_3256IncomingLinks(view);
		case LocationAttributeEditPart.VISUAL_ID:
			return getLocationAttribute_3257IncomingLinks(view);
		case ModelLabelEditPart.VISUAL_ID:
			return getModelLabel_3247IncomingLinks(view);
		case ModelLabel2EditPart.VISUAL_ID:
			return getModelLabel_3248IncomingLinks(view);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getEncapsulatedAttribute_3258IncomingLinks(view);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getEncapsulatedAssociation_3259IncomingLinks(view);
		case CreateUnitEditPart.VISUAL_ID:
			return getCreateUnit_3103IncomingLinks(view);
		case UnitElementEditPart.VISUAL_ID:
			return getUnitElement_3169IncomingLinks(view);
		case UnitAssociationEditPart.VISUAL_ID:
			return getUnitAssociation_3170IncomingLinks(view);
		case DataTypeFieldEditPart.VISUAL_ID:
			return getDataTypeField_3201IncomingLinks(view);
		case DateFieldEditPart.VISUAL_ID:
			return getDateField_3207IncomingLinks(view);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3104IncomingLinks(view);
		case UnitElement2EditPart.VISUAL_ID:
			return getUnitElement_3171IncomingLinks(view);
		case UnitAssociation2EditPart.VISUAL_ID:
			return getUnitAssociation_3172IncomingLinks(view);
		case CreateUpdateUnit2EditPart.VISUAL_ID:
			return getCreateUpdateUnit_3249IncomingLinks(view);
		case UnitElement3EditPart.VISUAL_ID:
			return getUnitElement_3173IncomingLinks(view);
		case DataTypeField2EditPart.VISUAL_ID:
			return getDataTypeField_3202IncomingLinks(view);
		case DateField2EditPart.VISUAL_ID:
			return getDateField_3208IncomingLinks(view);
		case CreateSitemapUnitEditPart.VISUAL_ID:
			return getCreateSitemapUnit_3157IncomingLinks(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3105IncomingLinks(view);
		case UnitElement4EditPart.VISUAL_ID:
			return getUnitElement_3175IncomingLinks(view);
		case SelectActionEditPart.VISUAL_ID:
			return getSelectAction_3102IncomingLinks(view);
		case UnitAssociation3EditPart.VISUAL_ID:
			return getUnitAssociation_3174IncomingLinks(view);
		case DetailsUnit2EditPart.VISUAL_ID:
			return getDetailsUnit_3112IncomingLinks(view);
		case UnitElement5EditPart.VISUAL_ID:
			return getUnitElement_3177IncomingLinks(view);
		case UnitAssociation4EditPart.VISUAL_ID:
			return getUnitAssociation_3176IncomingLinks(view);
		case DetailsUnit3EditPart.VISUAL_ID:
			return getDetailsUnit_3113IncomingLinks(view);
		case UnitElement6EditPart.VISUAL_ID:
			return getUnitElement_3178IncomingLinks(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3106IncomingLinks(view);
		case UnitElement7EditPart.VISUAL_ID:
			return getUnitElement_3179IncomingLinks(view);
		case IndexUnit2EditPart.VISUAL_ID:
			return getIndexUnit_3114IncomingLinks(view);
		case UnitElement8EditPart.VISUAL_ID:
			return getUnitElement_3181IncomingLinks(view);
		case UnitAssociation5EditPart.VISUAL_ID:
			return getUnitAssociation_3180IncomingLinks(view);
		case DetailsUnit4EditPart.VISUAL_ID:
			return getDetailsUnit_3116IncomingLinks(view);
		case UnitElement9EditPart.VISUAL_ID:
			return getUnitElement_3183IncomingLinks(view);
		case UnitAssociation6EditPart.VISUAL_ID:
			return getUnitAssociation_3182IncomingLinks(view);
		case DetailsUnit5EditPart.VISUAL_ID:
			return getDetailsUnit_3129IncomingLinks(view);
		case UnitElement10EditPart.VISUAL_ID:
			return getUnitElement_3185IncomingLinks(view);
		case UnitAssociation7EditPart.VISUAL_ID:
			return getUnitAssociation_3184IncomingLinks(view);
		case IndexUnit3EditPart.VISUAL_ID:
			return getIndexUnit_3118IncomingLinks(view);
		case UnitElement11EditPart.VISUAL_ID:
			return getUnitElement_3187IncomingLinks(view);
		case UnitAssociation8EditPart.VISUAL_ID:
			return getUnitAssociation_3186IncomingLinks(view);
		case IndexUnit4EditPart.VISUAL_ID:
			return getIndexUnit_3120IncomingLinks(view);
		case UnitElement12EditPart.VISUAL_ID:
			return getUnitElement_3189IncomingLinks(view);
		case UnitAssociation9EditPart.VISUAL_ID:
			return getUnitAssociation_3188IncomingLinks(view);
		case DetailsUnit6EditPart.VISUAL_ID:
			return getDetailsUnit_3131IncomingLinks(view);
		case UnitElement13EditPart.VISUAL_ID:
			return getUnitElement_3191IncomingLinks(view);
		case UnitAssociation10EditPart.VISUAL_ID:
			return getUnitAssociation_3190IncomingLinks(view);
		case IndexUnit5EditPart.VISUAL_ID:
			return getIndexUnit_3133IncomingLinks(view);
		case UnitElement14EditPart.VISUAL_ID:
			return getUnitElement_3193IncomingLinks(view);
		case UnitAssociation11EditPart.VISUAL_ID:
			return getUnitAssociation_3192IncomingLinks(view);
		case SelectAction2EditPart.VISUAL_ID:
			return getSelectAction_3107IncomingLinks(view);
		case DeleteActionEditPart.VISUAL_ID:
			return getDeleteAction_3101IncomingLinks(view);
		case SelectAction3EditPart.VISUAL_ID:
			return getSelectAction_3126IncomingLinks(view);
		case DataTypeField3EditPart.VISUAL_ID:
			return getDataTypeField_3203IncomingLinks(view);
		case DateField3EditPart.VISUAL_ID:
			return getDateField_3209IncomingLinks(view);
		case UnitSupportActionEditPart.VISUAL_ID:
			return getUnitSupportAction_3232IncomingLinks(view);
		case IndexUnit6EditPart.VISUAL_ID:
			return getIndexUnit_3136IncomingLinks(view);
		case UnitElement15EditPart.VISUAL_ID:
			return getUnitElement_3195IncomingLinks(view);
		case SelectAction4EditPart.VISUAL_ID:
			return getSelectAction_3127IncomingLinks(view);
		case UnitAssociation12EditPart.VISUAL_ID:
			return getUnitAssociation_3194IncomingLinks(view);
		case DetailsUnit7EditPart.VISUAL_ID:
			return getDetailsUnit_3219IncomingLinks(view);
		case UnitElement16EditPart.VISUAL_ID:
			return getUnitElement_3197IncomingLinks(view);
		case UnitAssociation13EditPart.VISUAL_ID:
			return getUnitAssociation_3196IncomingLinks(view);
		case IndexUnit7EditPart.VISUAL_ID:
			return getIndexUnit_3143IncomingLinks(view);
		case UnitElement17EditPart.VISUAL_ID:
			return getUnitElement_3199IncomingLinks(view);
		case UnitAssociation14EditPart.VISUAL_ID:
			return getUnitAssociation_3198IncomingLinks(view);
		case SelectAction5EditPart.VISUAL_ID:
			return getSelectAction_3128IncomingLinks(view);
		case DataTypeField4EditPart.VISUAL_ID:
			return getDataTypeField_3204IncomingLinks(view);
		case DateField4EditPart.VISUAL_ID:
			return getDateField_3210IncomingLinks(view);
		case SelectAction6EditPart.VISUAL_ID:
			return getSelectAction_3146IncomingLinks(view);
		case DeleteAction2EditPart.VISUAL_ID:
			return getDeleteAction_3147IncomingLinks(view);
		case FeatureSupportActionEditPart.VISUAL_ID:
			return getFeatureSupportAction_3234IncomingLinks(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3228IncomingLinks(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3109IncomingLinks(view);
		case UnitElement18EditPart.VISUAL_ID:
			return getUnitElement_3215IncomingLinks(view);
		case UnitAssociation15EditPart.VISUAL_ID:
			return getUnitAssociation_3200IncomingLinks(view);
		case DataTypeField5EditPart.VISUAL_ID:
			return getDataTypeField_3205IncomingLinks(view);
		case DateField5EditPart.VISUAL_ID:
			return getDateField_3211IncomingLinks(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3110IncomingLinks(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3111IncomingLinks(view);
		case UnitElement19EditPart.VISUAL_ID:
			return getUnitElement_3220IncomingLinks(view);
		case UnitAssociation16EditPart.VISUAL_ID:
			return getUnitAssociation_3216IncomingLinks(view);
		case IndexUnit8EditPart.VISUAL_ID:
			return getIndexUnit_3222IncomingLinks(view);
		case UnitElement20EditPart.VISUAL_ID:
			return getUnitElement_3250IncomingLinks(view);
		case UnitAssociation17EditPart.VISUAL_ID:
			return getUnitAssociation_3221IncomingLinks(view);
		case SelectAction7EditPart.VISUAL_ID:
			return getSelectAction_3153IncomingLinks(view);
		case DeleteAction3EditPart.VISUAL_ID:
			return getDeleteAction_3154IncomingLinks(view);
		case DataTypeField6EditPart.VISUAL_ID:
			return getDataTypeField_3206IncomingLinks(view);
		case DateField6EditPart.VISUAL_ID:
			return getDateField_3212IncomingLinks(view);
		case ActionMenuEntryEditPart.VISUAL_ID:
			return getActionMenuEntry_3236IncomingLinks(view);
		case EditStaticTextMenuEntryEditPart.VISUAL_ID:
			return getEditStaticTextMenuEntry_3156IncomingLinks(view);
		case SelectionEditPart.VISUAL_ID:
			return getSelection_3150IncomingLinks(view);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getAssociationWithoutContainment_4001IncomingLinks(view);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getAssociationWithContainment_4002IncomingLinks(view);
		case ViewAssociationEditPart.VISUAL_ID:
			return getViewAssociation_4004IncomingLinks(view);
		case PageLinkEditPart.VISUAL_ID:
			return getPageLink_4003IncomingLinks(view);
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
			return getDataType_2002OutgoingLinks(view);
		case DynamicMenuEditPart.VISUAL_ID:
			return getDynamicMenu_2008OutgoingLinks(view);
		case EnumerationTypeEditPart.VISUAL_ID:
			return getEnumerationType_2006OutgoingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2003OutgoingLinks(view);
		case ViewEditPart.VISUAL_ID:
			return getView_2010OutgoingLinks(view);
		case PageEditPart.VISUAL_ID:
			return getPage_2005OutgoingLinks(view);
		case StaticMenuEditPart.VISUAL_ID:
			return getStaticMenu_2009OutgoingLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2004OutgoingLinks(view);
		case CasAuthenticationEditPart.VISUAL_ID:
			return getCasAuthentication_3055OutgoingLinks(view);
		case LocalAuthenticationSystemEditPart.VISUAL_ID:
			return getLocalAuthenticationSystem_3029OutgoingLinks(view);
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getEnumerationLiteral_3028OutgoingLinks(view);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getDataTypeAttribute_3252OutgoingLinks(view);
		case DateAttributeEditPart.VISUAL_ID:
			return getDateAttribute_3253OutgoingLinks(view);
		case UrlAttributeEditPart.VISUAL_ID:
			return getUrlAttribute_3254OutgoingLinks(view);
		case FileAttributeEditPart.VISUAL_ID:
			return getFileAttribute_3255OutgoingLinks(view);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImageAttribute_3256OutgoingLinks(view);
		case LocationAttributeEditPart.VISUAL_ID:
			return getLocationAttribute_3257OutgoingLinks(view);
		case ModelLabelEditPart.VISUAL_ID:
			return getModelLabel_3247OutgoingLinks(view);
		case ModelLabel2EditPart.VISUAL_ID:
			return getModelLabel_3248OutgoingLinks(view);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getEncapsulatedAttribute_3258OutgoingLinks(view);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getEncapsulatedAssociation_3259OutgoingLinks(view);
		case CreateUnitEditPart.VISUAL_ID:
			return getCreateUnit_3103OutgoingLinks(view);
		case UnitElementEditPart.VISUAL_ID:
			return getUnitElement_3169OutgoingLinks(view);
		case UnitAssociationEditPart.VISUAL_ID:
			return getUnitAssociation_3170OutgoingLinks(view);
		case DataTypeFieldEditPart.VISUAL_ID:
			return getDataTypeField_3201OutgoingLinks(view);
		case DateFieldEditPart.VISUAL_ID:
			return getDateField_3207OutgoingLinks(view);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3104OutgoingLinks(view);
		case UnitElement2EditPart.VISUAL_ID:
			return getUnitElement_3171OutgoingLinks(view);
		case UnitAssociation2EditPart.VISUAL_ID:
			return getUnitAssociation_3172OutgoingLinks(view);
		case CreateUpdateUnit2EditPart.VISUAL_ID:
			return getCreateUpdateUnit_3249OutgoingLinks(view);
		case UnitElement3EditPart.VISUAL_ID:
			return getUnitElement_3173OutgoingLinks(view);
		case DataTypeField2EditPart.VISUAL_ID:
			return getDataTypeField_3202OutgoingLinks(view);
		case DateField2EditPart.VISUAL_ID:
			return getDateField_3208OutgoingLinks(view);
		case CreateSitemapUnitEditPart.VISUAL_ID:
			return getCreateSitemapUnit_3157OutgoingLinks(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3105OutgoingLinks(view);
		case UnitElement4EditPart.VISUAL_ID:
			return getUnitElement_3175OutgoingLinks(view);
		case SelectActionEditPart.VISUAL_ID:
			return getSelectAction_3102OutgoingLinks(view);
		case UnitAssociation3EditPart.VISUAL_ID:
			return getUnitAssociation_3174OutgoingLinks(view);
		case DetailsUnit2EditPart.VISUAL_ID:
			return getDetailsUnit_3112OutgoingLinks(view);
		case UnitElement5EditPart.VISUAL_ID:
			return getUnitElement_3177OutgoingLinks(view);
		case UnitAssociation4EditPart.VISUAL_ID:
			return getUnitAssociation_3176OutgoingLinks(view);
		case DetailsUnit3EditPart.VISUAL_ID:
			return getDetailsUnit_3113OutgoingLinks(view);
		case UnitElement6EditPart.VISUAL_ID:
			return getUnitElement_3178OutgoingLinks(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3106OutgoingLinks(view);
		case UnitElement7EditPart.VISUAL_ID:
			return getUnitElement_3179OutgoingLinks(view);
		case IndexUnit2EditPart.VISUAL_ID:
			return getIndexUnit_3114OutgoingLinks(view);
		case UnitElement8EditPart.VISUAL_ID:
			return getUnitElement_3181OutgoingLinks(view);
		case UnitAssociation5EditPart.VISUAL_ID:
			return getUnitAssociation_3180OutgoingLinks(view);
		case DetailsUnit4EditPart.VISUAL_ID:
			return getDetailsUnit_3116OutgoingLinks(view);
		case UnitElement9EditPart.VISUAL_ID:
			return getUnitElement_3183OutgoingLinks(view);
		case UnitAssociation6EditPart.VISUAL_ID:
			return getUnitAssociation_3182OutgoingLinks(view);
		case DetailsUnit5EditPart.VISUAL_ID:
			return getDetailsUnit_3129OutgoingLinks(view);
		case UnitElement10EditPart.VISUAL_ID:
			return getUnitElement_3185OutgoingLinks(view);
		case UnitAssociation7EditPart.VISUAL_ID:
			return getUnitAssociation_3184OutgoingLinks(view);
		case IndexUnit3EditPart.VISUAL_ID:
			return getIndexUnit_3118OutgoingLinks(view);
		case UnitElement11EditPart.VISUAL_ID:
			return getUnitElement_3187OutgoingLinks(view);
		case UnitAssociation8EditPart.VISUAL_ID:
			return getUnitAssociation_3186OutgoingLinks(view);
		case IndexUnit4EditPart.VISUAL_ID:
			return getIndexUnit_3120OutgoingLinks(view);
		case UnitElement12EditPart.VISUAL_ID:
			return getUnitElement_3189OutgoingLinks(view);
		case UnitAssociation9EditPart.VISUAL_ID:
			return getUnitAssociation_3188OutgoingLinks(view);
		case DetailsUnit6EditPart.VISUAL_ID:
			return getDetailsUnit_3131OutgoingLinks(view);
		case UnitElement13EditPart.VISUAL_ID:
			return getUnitElement_3191OutgoingLinks(view);
		case UnitAssociation10EditPart.VISUAL_ID:
			return getUnitAssociation_3190OutgoingLinks(view);
		case IndexUnit5EditPart.VISUAL_ID:
			return getIndexUnit_3133OutgoingLinks(view);
		case UnitElement14EditPart.VISUAL_ID:
			return getUnitElement_3193OutgoingLinks(view);
		case UnitAssociation11EditPart.VISUAL_ID:
			return getUnitAssociation_3192OutgoingLinks(view);
		case SelectAction2EditPart.VISUAL_ID:
			return getSelectAction_3107OutgoingLinks(view);
		case DeleteActionEditPart.VISUAL_ID:
			return getDeleteAction_3101OutgoingLinks(view);
		case SelectAction3EditPart.VISUAL_ID:
			return getSelectAction_3126OutgoingLinks(view);
		case DataTypeField3EditPart.VISUAL_ID:
			return getDataTypeField_3203OutgoingLinks(view);
		case DateField3EditPart.VISUAL_ID:
			return getDateField_3209OutgoingLinks(view);
		case UnitSupportActionEditPart.VISUAL_ID:
			return getUnitSupportAction_3232OutgoingLinks(view);
		case IndexUnit6EditPart.VISUAL_ID:
			return getIndexUnit_3136OutgoingLinks(view);
		case UnitElement15EditPart.VISUAL_ID:
			return getUnitElement_3195OutgoingLinks(view);
		case SelectAction4EditPart.VISUAL_ID:
			return getSelectAction_3127OutgoingLinks(view);
		case UnitAssociation12EditPart.VISUAL_ID:
			return getUnitAssociation_3194OutgoingLinks(view);
		case DetailsUnit7EditPart.VISUAL_ID:
			return getDetailsUnit_3219OutgoingLinks(view);
		case UnitElement16EditPart.VISUAL_ID:
			return getUnitElement_3197OutgoingLinks(view);
		case UnitAssociation13EditPart.VISUAL_ID:
			return getUnitAssociation_3196OutgoingLinks(view);
		case IndexUnit7EditPart.VISUAL_ID:
			return getIndexUnit_3143OutgoingLinks(view);
		case UnitElement17EditPart.VISUAL_ID:
			return getUnitElement_3199OutgoingLinks(view);
		case UnitAssociation14EditPart.VISUAL_ID:
			return getUnitAssociation_3198OutgoingLinks(view);
		case SelectAction5EditPart.VISUAL_ID:
			return getSelectAction_3128OutgoingLinks(view);
		case DataTypeField4EditPart.VISUAL_ID:
			return getDataTypeField_3204OutgoingLinks(view);
		case DateField4EditPart.VISUAL_ID:
			return getDateField_3210OutgoingLinks(view);
		case SelectAction6EditPart.VISUAL_ID:
			return getSelectAction_3146OutgoingLinks(view);
		case DeleteAction2EditPart.VISUAL_ID:
			return getDeleteAction_3147OutgoingLinks(view);
		case FeatureSupportActionEditPart.VISUAL_ID:
			return getFeatureSupportAction_3234OutgoingLinks(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3228OutgoingLinks(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3109OutgoingLinks(view);
		case UnitElement18EditPart.VISUAL_ID:
			return getUnitElement_3215OutgoingLinks(view);
		case UnitAssociation15EditPart.VISUAL_ID:
			return getUnitAssociation_3200OutgoingLinks(view);
		case DataTypeField5EditPart.VISUAL_ID:
			return getDataTypeField_3205OutgoingLinks(view);
		case DateField5EditPart.VISUAL_ID:
			return getDateField_3211OutgoingLinks(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3110OutgoingLinks(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3111OutgoingLinks(view);
		case UnitElement19EditPart.VISUAL_ID:
			return getUnitElement_3220OutgoingLinks(view);
		case UnitAssociation16EditPart.VISUAL_ID:
			return getUnitAssociation_3216OutgoingLinks(view);
		case IndexUnit8EditPart.VISUAL_ID:
			return getIndexUnit_3222OutgoingLinks(view);
		case UnitElement20EditPart.VISUAL_ID:
			return getUnitElement_3250OutgoingLinks(view);
		case UnitAssociation17EditPart.VISUAL_ID:
			return getUnitAssociation_3221OutgoingLinks(view);
		case SelectAction7EditPart.VISUAL_ID:
			return getSelectAction_3153OutgoingLinks(view);
		case DeleteAction3EditPart.VISUAL_ID:
			return getDeleteAction_3154OutgoingLinks(view);
		case DataTypeField6EditPart.VISUAL_ID:
			return getDataTypeField_3206OutgoingLinks(view);
		case DateField6EditPart.VISUAL_ID:
			return getDateField_3212OutgoingLinks(view);
		case ActionMenuEntryEditPart.VISUAL_ID:
			return getActionMenuEntry_3236OutgoingLinks(view);
		case EditStaticTextMenuEntryEditPart.VISUAL_ID:
			return getEditStaticTextMenuEntry_3156OutgoingLinks(view);
		case SelectionEditPart.VISUAL_ID:
			return getSelection_3150OutgoingLinks(view);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getAssociationWithoutContainment_4001OutgoingLinks(view);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getAssociationWithContainment_4002OutgoingLinks(view);
		case ViewAssociationEditPart.VISUAL_ID:
			return getViewAssociation_4004OutgoingLinks(view);
		case PageLinkEditPart.VISUAL_ID:
			return getPageLink_4003OutgoingLinks(view);
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
	public static List<WebsiteLinkDescriptor> getDataType_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDynamicMenu_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getEnumerationType_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getEntity_2003ContainedLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssociationWithoutContainment_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AssociationWithContainment_4002(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getView_2010ContainedLinks(View view) {
		uk.ac.man.cs.mdsd.webgen.website.View modelElement = (uk.ac.man.cs.mdsd.webgen.website.View) view.getElement();
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ViewAssociation_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getService_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getPage_2005ContainedLinks(View view) {
		Page modelElement = (Page) view.getElement();
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PageLink_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getStaticMenu_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getCasAuthentication_3055ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getLocalAuthenticationSystem_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getEnumerationLiteral_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeAttribute_3252ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateAttribute_3253ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUrlAttribute_3254ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFileAttribute_3255ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getImageAttribute_3256ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getLocationAttribute_3257ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getModelLabel_3247ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getModelLabel_3248ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEncapsulatedAttribute_3258ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEncapsulatedAssociation_3259ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelection_3150ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getCreateUnit_3103ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3169ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3170ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3201ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3207ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitSupportAction_3232ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getCreateUpdateUnit_3104ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3171ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3172ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateUpdateUnit_3249ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3202ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3208ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getCreateSitemapUnit_3157ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3105ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3173ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3102ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3174ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3112ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3175ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3176ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3113ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3177ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3106ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3178ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3114ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3179ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3180ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3116ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3181ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3182ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3118ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3185ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3186ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3136ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3193ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3120ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3187ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3188ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3107ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3129ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3183ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3184ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3126ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3203ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3209ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3128ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3204ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3210ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3127ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3194ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDeleteAction_3101ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSearchUnit_3109ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3195ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3196ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3219ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3205ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3211ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3131ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3189ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3190ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getStaticUnit_3110ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUpdateUnit_3111ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3220ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3221ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3222ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3250ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3197ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3198ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3143ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3215ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3216ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3199ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3200ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3153ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDeleteAction_3154ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getActionMenuEntry_3236ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3206ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3212ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3146ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDeleteAction_3147ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getFeatureSupportAction_3234ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getMapUnit_3228ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3133ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3191ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3192ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getEditStaticTextMenuEntry_3156ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getAssociationWithoutContainment_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getAssociationWithContainment_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getViewAssociation_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getPageLink_4003ContainedLinks(View view) {
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
	public static List<WebsiteLinkDescriptor> getDataType_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDynamicMenu_2008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getEnumerationType_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getEntity_2003IncomingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssociationWithoutContainment_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssociationWithContainment_4002(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getView_2010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getService_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getPage_2005IncomingLinks(View view) {
		Page modelElement = (Page) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PageLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getStaticMenu_2009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getCasAuthentication_3055IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getLocalAuthenticationSystem_3029IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getEnumerationLiteral_3028IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeAttribute_3252IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateAttribute_3253IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUrlAttribute_3254IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFileAttribute_3255IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getImageAttribute_3256IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getLocationAttribute_3257IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getModelLabel_3247IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getModelLabel_3248IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEncapsulatedAttribute_3258IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEncapsulatedAssociation_3259IncomingLinks(View view) {
		EncapsulatedAssociation modelElement = (EncapsulatedAssociation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ViewAssociation_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelection_3150IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getCreateUnit_3103IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3169IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3170IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3201IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3207IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitSupportAction_3232IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getCreateUpdateUnit_3104IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3171IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3172IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateUpdateUnit_3249IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3202IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3208IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getCreateSitemapUnit_3157IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3105IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3173IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3102IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3174IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3112IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3175IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3176IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3113IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3177IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3106IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3178IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3114IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3179IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3180IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3116IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3181IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3182IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3118IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3185IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3186IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3136IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3193IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3120IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3187IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3188IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3107IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3129IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3183IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3184IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3126IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3203IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3209IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3128IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3204IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3210IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3127IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3194IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDeleteAction_3101IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSearchUnit_3109IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3195IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3196IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3219IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3205IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3211IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3131IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3189IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3190IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getStaticUnit_3110IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUpdateUnit_3111IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3220IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3221IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3222IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3250IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3197IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3198IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3143IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3215IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3216IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3199IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3200IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3153IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDeleteAction_3154IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getActionMenuEntry_3236IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3206IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3212IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3146IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDeleteAction_3147IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getFeatureSupportAction_3234IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getMapUnit_3228IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3133IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3191IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3192IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getEditStaticTextMenuEntry_3156IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getAssociationWithoutContainment_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getAssociationWithContainment_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getViewAssociation_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getPageLink_4003IncomingLinks(View view) {
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
	public static List<WebsiteLinkDescriptor> getDataType_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDynamicMenu_2008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getEnumerationType_2006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getEntity_2003OutgoingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssociationWithoutContainment_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AssociationWithContainment_4002(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getView_2010OutgoingLinks(View view) {
		uk.ac.man.cs.mdsd.webgen.website.View modelElement = (uk.ac.man.cs.mdsd.webgen.website.View) view.getElement();
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ViewAssociation_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getService_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getPage_2005OutgoingLinks(View view) {
		Page modelElement = (Page) view.getElement();
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PageLink_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getStaticMenu_2009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getCasAuthentication_3055OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getLocalAuthenticationSystem_3029OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getEnumerationLiteral_3028OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDataTypeAttribute_3252OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getDateAttribute_3253OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUrlAttribute_3254OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getFileAttribute_3255OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getImageAttribute_3256OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getLocationAttribute_3257OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getModelLabel_3247OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getModelLabel_3248OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEncapsulatedAttribute_3258OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getEncapsulatedAssociation_3259OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelection_3150OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getCreateUnit_3103OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3169OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3170OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3201OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3207OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitSupportAction_3232OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getCreateUpdateUnit_3104OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3171OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3172OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getCreateUpdateUnit_3249OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3202OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3208OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getCreateSitemapUnit_3157OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3105OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3173OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3102OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3174OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3112OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3175OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3176OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3113OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3177OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3106OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3178OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3114OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3179OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3180OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3116OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3181OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3182OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3118OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3185OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3186OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3136OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3193OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3120OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3187OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3188OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3107OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3129OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3183OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3184OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3126OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3203OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3209OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3128OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3204OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3210OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3127OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3194OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDeleteAction_3101OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSearchUnit_3109OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3195OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3196OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3219OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3205OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3211OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDetailsUnit_3131OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3189OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3190OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getStaticUnit_3110OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUpdateUnit_3111OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3220OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3221OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3222OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getUnitElement_3250OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3197OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3198OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3143OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3215OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3216OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3199OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3200OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3153OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDeleteAction_3154OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getActionMenuEntry_3236OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDataTypeField_3206OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDateField_3212OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getSelectAction_3146OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getDeleteAction_3147OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getFeatureSupportAction_3234OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getMapUnit_3228OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getIndexUnit_3133OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitElement_3191OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getUnitAssociation_3192OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getEditStaticTextMenuEntry_3156OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getAssociationWithoutContainment_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getAssociationWithContainment_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WebsiteLinkDescriptor> getViewAssociation_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebsiteLinkDescriptor> getPageLink_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<WebsiteLinkDescriptor> getContainedTypeModelFacetLinks_AssociationWithoutContainment_4001(
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
					WebsiteElementTypes.AssociationWithoutContainment_4001,
					AssociationWithoutContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebsiteLinkDescriptor> getContainedTypeModelFacetLinks_AssociationWithContainment_4002(
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
					WebsiteElementTypes.AssociationWithContainment_4002, AssociationWithContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WebsiteLinkDescriptor> getContainedTypeModelFacetLinks_ViewAssociation_4004(
			uk.ac.man.cs.mdsd.webgen.website.View container) {
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
			result.add(new WebsiteLinkDescriptor(container, dst, link, WebsiteElementTypes.ViewAssociation_4004,
					ViewAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebsiteLinkDescriptor> getContainedTypeModelFacetLinks_PageLink_4003(Page container) {
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		PageLink link = container.getParentPage();
		if (PageLinkEditPart.VISUAL_ID != WebsiteVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Page dst = link.getTargetPage();
		result.add(new WebsiteLinkDescriptor(container, dst, link, WebsiteElementTypes.PageLink_4003,
				PageLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebsiteLinkDescriptor> getIncomingTypeModelFacetLinks_AssociationWithoutContainment_4001(
			Entity target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WebsitePackage.eINSTANCE.getEntityAssociation_TargetEntity()
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
					WebsiteElementTypes.AssociationWithoutContainment_4001,
					AssociationWithoutContainmentEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebsiteLinkDescriptor> getIncomingTypeModelFacetLinks_AssociationWithContainment_4002(
			Entity target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WebsitePackage.eINSTANCE.getEntityAssociation_TargetEntity()
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
					WebsiteElementTypes.AssociationWithContainment_4002, AssociationWithContainmentEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WebsiteLinkDescriptor> getIncomingTypeModelFacetLinks_ViewAssociation_4004(
			EncapsulatedAssociation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WebsitePackage.eINSTANCE.getViewAssociation_Opposite()
					|| false == setting.getEObject() instanceof ViewAssociation) {
				continue;
			}
			ViewAssociation link = (ViewAssociation) setting.getEObject();
			if (ViewAssociationEditPart.VISUAL_ID != WebsiteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof uk.ac.man.cs.mdsd.webgen.website.View) {
				continue;
			}
			uk.ac.man.cs.mdsd.webgen.website.View container = (uk.ac.man.cs.mdsd.webgen.website.View) link.eContainer();
			result.add(new WebsiteLinkDescriptor(container, target, link, WebsiteElementTypes.ViewAssociation_4004,
					ViewAssociationEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebsiteLinkDescriptor> getIncomingTypeModelFacetLinks_PageLink_4003(Page target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebsiteLinkDescriptor> result = new LinkedList<WebsiteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WebsitePackage.eINSTANCE.getPageLink_TargetPage()
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
			result.add(new WebsiteLinkDescriptor(container, target, link, WebsiteElementTypes.PageLink_4003,
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
