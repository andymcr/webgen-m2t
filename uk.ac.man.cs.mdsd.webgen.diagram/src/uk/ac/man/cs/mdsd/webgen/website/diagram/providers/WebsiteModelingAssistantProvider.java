package uk.ac.man.cs.mdsd.webgen.website.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.ActionUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.CommandUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.CreateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.CreateUpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnit2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnit3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnit4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnit5EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnit6EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnit7EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DynamicMenuEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EntityEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EnumerationTypeEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit5EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit6EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit7EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit8EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.PageEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SearchUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.ServiceEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.StaticMenuEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UnitAssociation10EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UnitAssociation13EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UnitAssociation4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UnitAssociation5EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UnitAssociation6EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UnitAssociation7EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UnitAssociationInterfaceUnitsCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UnitElement15EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UnitElement4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.WebGenModelEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.WebsitePropertiesEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.Messages;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteDiagramEditorPlugin;

/**
 * @generated
 */
public class WebsiteModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof WebGenModelEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(8);
			types.add(WebsiteElementTypes.WebsiteProperties_2001);
			types.add(WebsiteElementTypes.DataType_2002);
			types.add(WebsiteElementTypes.DynamicMenu_2008);
			types.add(WebsiteElementTypes.EnumerationType_2006);
			types.add(WebsiteElementTypes.Entity_2003);
			types.add(WebsiteElementTypes.Page_2005);
			types.add(WebsiteElementTypes.StaticMenu_2009);
			types.add(WebsiteElementTypes.Service_2004);
			return types;
		}
		if (editPart instanceof WebsitePropertiesEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebsiteElementTypes.CasAuthentication_3055);
			types.add(WebsiteElementTypes.LocalAuthenticationSystem_3029);
			return types;
		}
		if (editPart instanceof DynamicMenuEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebsiteElementTypes.MenuIncludedElement_3149);
			return types;
		}
		if (editPart instanceof EnumerationTypeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebsiteElementTypes.EnumerationLiteral_3028);
			return types;
		}
		if (editPart instanceof EntityEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(WebsiteElementTypes.DataTypeAttribute_3054);
			types.add(WebsiteElementTypes.DateAttribute_3014);
			types.add(WebsiteElementTypes.FileAttribute_3152);
			types.add(WebsiteElementTypes.LocationAttribute_3230);
			return types;
		}
		if (editPart instanceof PageEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(11);
			types.add(WebsiteElementTypes.ActionUnit_3213);
			types.add(WebsiteElementTypes.CommandUnit_3225);
			types.add(WebsiteElementTypes.CreateUnit_3103);
			types.add(WebsiteElementTypes.CreateUpdateUnit_3104);
			types.add(WebsiteElementTypes.CreateSitemapUnit_3157);
			types.add(WebsiteElementTypes.DetailsUnit_3105);
			types.add(WebsiteElementTypes.IndexUnit_3136);
			types.add(WebsiteElementTypes.MapUnit_3228);
			types.add(WebsiteElementTypes.SearchUnit_3109);
			types.add(WebsiteElementTypes.StaticUnit_3110);
			types.add(WebsiteElementTypes.UpdateUnit_3111);
			return types;
		}
		if (editPart instanceof StaticMenuEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(WebsiteElementTypes.FixedPageMenuEntry_3158);
			types.add(WebsiteElementTypes.FixedActionMenuEntry_3159);
			types.add(WebsiteElementTypes.FixedCommandMenuEntry_3231);
			types.add(WebsiteElementTypes.EditStaticTextMenuEntry_3156);
			return types;
		}
		if (editPart instanceof ServiceEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(WebsiteElementTypes.ServiceEntityElement_3167);
			types.add(WebsiteElementTypes.ServiceEntityAssociation_3168);
			types.add(WebsiteElementTypes.ServiceViewAssociation_3166);
			types.add(WebsiteElementTypes.ModelLabel_3163);
			types.add(WebsiteElementTypes.Selection_3150);
			return types;
		}
		if (editPart instanceof ActionUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(WebsiteElementTypes.UnitElement_3169);
			types.add(WebsiteElementTypes.UnitAssociation_3170);
			types.add(WebsiteElementTypes.DataTypeField_3201);
			types.add(WebsiteElementTypes.DateField_3207);
			types.add(WebsiteElementTypes.UnitSupportAction_3232);
			return types;
		}
		if (editPart instanceof CommandUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebsiteElementTypes.UserCommand_3226);
			return types;
		}
		if (editPart instanceof CreateUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(WebsiteElementTypes.UnitElement_3171);
			types.add(WebsiteElementTypes.UnitAssociation_3172);
			types.add(WebsiteElementTypes.DataTypeField_3202);
			types.add(WebsiteElementTypes.DateField_3208);
			return types;
		}
		if (editPart instanceof CreateUpdateUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(WebsiteElementTypes.UnitElement_3173);
			types.add(WebsiteElementTypes.UnitAssociation_3174);
			types.add(WebsiteElementTypes.DataTypeField_3203);
			types.add(WebsiteElementTypes.DateField_3209);
			return types;
		}
		if (editPart instanceof DetailsUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(WebsiteElementTypes.UnitElement_3175);
			types.add(WebsiteElementTypes.UnitAssociation_3176);
			types.add(WebsiteElementTypes.DataTypeField_3204);
			types.add(WebsiteElementTypes.DateField_3210);
			types.add(WebsiteElementTypes.UnitSupportAction_3233);
			return types;
		}
		if (editPart instanceof UnitElement4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebsiteElementTypes.SelectAction_3102);
			return types;
		}
		if (editPart instanceof UnitAssociation4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(WebsiteElementTypes.DetailsUnit_3112);
			types.add(WebsiteElementTypes.IndexUnit_3114);
			types.add(WebsiteElementTypes.SelectAction_3126);
			return types;
		}
		if (editPart instanceof DetailsUnit2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebsiteElementTypes.UnitElement_3177);
			types.add(WebsiteElementTypes.UnitAssociation_3180);
			return types;
		}
		if (editPart instanceof UnitAssociation5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebsiteElementTypes.DetailsUnit_3113);
			types.add(WebsiteElementTypes.IndexUnit_3106);
			return types;
		}
		if (editPart instanceof DetailsUnit3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebsiteElementTypes.UnitElement_3178);
			return types;
		}
		if (editPart instanceof IndexUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebsiteElementTypes.UnitElement_3179);
			return types;
		}
		if (editPart instanceof IndexUnit2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(WebsiteElementTypes.UnitElement_3181);
			types.add(WebsiteElementTypes.UnitAssociation_3182);
			types.add(WebsiteElementTypes.SelectAction_3107);
			types.add(WebsiteElementTypes.DeleteAction_3101);
			return types;
		}
		if (editPart instanceof UnitAssociation6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebsiteElementTypes.DetailsUnit_3116);
			types.add(WebsiteElementTypes.IndexUnit_3120);
			return types;
		}
		if (editPart instanceof DetailsUnit4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebsiteElementTypes.UnitElement_3183);
			types.add(WebsiteElementTypes.UnitAssociation_3184);
			return types;
		}
		if (editPart instanceof UnitAssociation7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebsiteElementTypes.DetailsUnit_3129);
			types.add(WebsiteElementTypes.IndexUnit_3118);
			return types;
		}
		if (editPart instanceof DetailsUnit5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebsiteElementTypes.UnitElement_3185);
			types.add(WebsiteElementTypes.UnitAssociation_3186);
			return types;
		}
		if (editPart instanceof IndexUnit3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebsiteElementTypes.UnitElement_3187);
			types.add(WebsiteElementTypes.UnitAssociation_3188);
			return types;
		}
		if (editPart instanceof IndexUnit4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebsiteElementTypes.UnitElement_3189);
			types.add(WebsiteElementTypes.UnitAssociation_3190);
			return types;
		}
		if (editPart instanceof UnitAssociation10EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebsiteElementTypes.DetailsUnit_3131);
			types.add(WebsiteElementTypes.IndexUnit_3133);
			return types;
		}
		if (editPart instanceof DetailsUnit6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebsiteElementTypes.UnitElement_3191);
			types.add(WebsiteElementTypes.UnitAssociation_3192);
			return types;
		}
		if (editPart instanceof IndexUnit5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebsiteElementTypes.UnitElement_3193);
			types.add(WebsiteElementTypes.UnitAssociation_3194);
			return types;
		}
		if (editPart instanceof IndexUnit6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(7);
			types.add(WebsiteElementTypes.UnitElement_3195);
			types.add(WebsiteElementTypes.UnitAssociation_3196);
			types.add(WebsiteElementTypes.DataTypeField_3205);
			types.add(WebsiteElementTypes.DateField_3211);
			types.add(WebsiteElementTypes.SelectAction_3146);
			types.add(WebsiteElementTypes.DeleteAction_3147);
			types.add(WebsiteElementTypes.FeatureSupportAction_3234);
			return types;
		}
		if (editPart instanceof UnitElement15EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebsiteElementTypes.SelectAction_3127);
			return types;
		}
		if (editPart instanceof UnitAssociation13EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(WebsiteElementTypes.DetailsUnit_3219);
			types.add(WebsiteElementTypes.IndexUnit_3143);
			types.add(WebsiteElementTypes.SelectAction_3128);
			return types;
		}
		if (editPart instanceof DetailsUnit7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebsiteElementTypes.UnitElement_3197);
			types.add(WebsiteElementTypes.UnitAssociation_3198);
			return types;
		}
		if (editPart instanceof IndexUnit7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebsiteElementTypes.UnitElement_3199);
			types.add(WebsiteElementTypes.UnitAssociation_3200);
			return types;
		}
		if (editPart instanceof SearchUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(WebsiteElementTypes.UnitElement_3215);
			types.add(WebsiteElementTypes.UnitAssociation_3216);
			types.add(WebsiteElementTypes.DataTypeField_3206);
			types.add(WebsiteElementTypes.DateField_3212);
			return types;
		}
		if (editPart instanceof UpdateUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(WebsiteElementTypes.UnitElement_3220);
			types.add(WebsiteElementTypes.UnitAssociation_3221);
			types.add(WebsiteElementTypes.DataTypeField_3217);
			types.add(WebsiteElementTypes.DateField_3218);
			return types;
		}
		if (editPart instanceof IndexUnit8EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(WebsiteElementTypes.UnitElement_3223);
			types.add(WebsiteElementTypes.UnitAssociation_3224);
			types.add(WebsiteElementTypes.SelectAction_3153);
			types.add(WebsiteElementTypes.DeleteAction_3154);
			return types;
		}
		if (editPart instanceof UnitAssociationInterfaceUnitsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebsiteElementTypes.IndexUnit_3222);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PageEditPart) {
			return ((PageEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PageEditPart) {
			return ((PageEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PageEditPart) {
			return ((PageEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PageEditPart) {
			return ((PageEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PageEditPart) {
			return ((PageEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				WebsiteDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.WebsiteModelingAssistantProviderMessage);
		dialog.setTitle(Messages.WebsiteModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
