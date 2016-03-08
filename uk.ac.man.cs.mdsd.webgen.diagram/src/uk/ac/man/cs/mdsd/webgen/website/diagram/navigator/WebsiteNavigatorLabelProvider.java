package uk.ac.man.cs.mdsd.webgen.website.diagram.navigator;

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

import uk.ac.man.cs.mdsd.webgen.website.CasAuthentication;
import uk.ac.man.cs.mdsd.webgen.website.CreateSitemapUnit;
import uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.webgen.website.ViewAssociation;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.*;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteDiagramEditorPlugin;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteParserProvider;

/**
 * @generated
 */
public class WebsiteNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		WebsiteDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		WebsiteDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof WebsiteNavigatorItem && !isOwnView(((WebsiteNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof WebsiteNavigatorGroup) {
			WebsiteNavigatorGroup group = (WebsiteNavigatorGroup) element;
			return WebsiteDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof WebsiteNavigatorItem) {
			WebsiteNavigatorItem navigatorItem = (WebsiteNavigatorItem) element;
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
		switch (WebsiteVisualIDRegistry.getVisualID(view)) {
		case WebGenModelEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.cs.man.ac.uk/mdsd/2010/Website?WebGenModel", //$NON-NLS-1$
					WebsiteElementTypes.WebGenModel_1000);
		case WebsitePropertiesEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.cs.man.ac.uk/mdsd/2010/Website?WebsiteProperties", //$NON-NLS-1$
					WebsiteElementTypes.WebsiteProperties_2001);
		case DataTypeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.cs.man.ac.uk/mdsd/2010/Website?DataType", //$NON-NLS-1$
					WebsiteElementTypes.DataType_2002);
		case EntityEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.cs.man.ac.uk/mdsd/2010/Website?Entity", //$NON-NLS-1$
					WebsiteElementTypes.Entity_2003);
		case ServiceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.cs.man.ac.uk/mdsd/2010/Website?Service", //$NON-NLS-1$
					WebsiteElementTypes.Service_2004);
		case PageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.cs.man.ac.uk/mdsd/2010/Website?Page", //$NON-NLS-1$
					WebsiteElementTypes.Page_2005);
		case EnumerationTypeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.cs.man.ac.uk/mdsd/2010/Website?EnumerationType", //$NON-NLS-1$
					WebsiteElementTypes.EnumerationType_2006);
		case DynamicMenuEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.cs.man.ac.uk/mdsd/2010/Website?DynamicMenu", //$NON-NLS-1$
					WebsiteElementTypes.DynamicMenu_2008);
		case StaticMenuEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.cs.man.ac.uk/mdsd/2010/Website?StaticMenu", //$NON-NLS-1$
					WebsiteElementTypes.StaticMenu_2009);
		case ViewEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.cs.man.ac.uk/mdsd/2010/Website?View", //$NON-NLS-1$
					WebsiteElementTypes.View_2010);
		case DateAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DateAttribute", //$NON-NLS-1$
					WebsiteElementTypes.DateAttribute_3014);
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?EnumerationLiteral", //$NON-NLS-1$
					WebsiteElementTypes.EnumerationLiteral_3028);
		case LocalAuthenticationSystemEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?LocalAuthenticationSystem", //$NON-NLS-1$
					WebsiteElementTypes.LocalAuthenticationSystem_3029);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DataTypeAttribute", //$NON-NLS-1$
					WebsiteElementTypes.DataTypeAttribute_3054);
		case CasAuthenticationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?CasAuthentication", //$NON-NLS-1$
					WebsiteElementTypes.CasAuthentication_3055);
		case DeleteActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DeleteAction", //$NON-NLS-1$
					WebsiteElementTypes.DeleteAction_3101);
		case SelectActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3102);
		case CreateUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?CreateUnit", //$NON-NLS-1$
					WebsiteElementTypes.CreateUnit_3103);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?CreateUpdateUnit", //$NON-NLS-1$
					WebsiteElementTypes.CreateUpdateUnit_3104);
		case DetailsUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DetailsUnit", //$NON-NLS-1$
					WebsiteElementTypes.DetailsUnit_3105);
		case IndexUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3106);
		case SelectAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3107);
		case SearchUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?SearchUnit", //$NON-NLS-1$
					WebsiteElementTypes.SearchUnit_3109);
		case StaticUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?StaticUnit", //$NON-NLS-1$
					WebsiteElementTypes.StaticUnit_3110);
		case UpdateUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UpdateUnit", //$NON-NLS-1$
					WebsiteElementTypes.UpdateUnit_3111);
		case DetailsUnit2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DetailsUnit", //$NON-NLS-1$
					WebsiteElementTypes.DetailsUnit_3112);
		case DetailsUnit3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DetailsUnit", //$NON-NLS-1$
					WebsiteElementTypes.DetailsUnit_3113);
		case IndexUnit2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3114);
		case DetailsUnit4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DetailsUnit", //$NON-NLS-1$
					WebsiteElementTypes.DetailsUnit_3116);
		case IndexUnit3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3118);
		case IndexUnit4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3120);
		case SelectAction3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3126);
		case SelectAction4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3127);
		case SelectAction5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3128);
		case DetailsUnit5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DetailsUnit", //$NON-NLS-1$
					WebsiteElementTypes.DetailsUnit_3129);
		case DetailsUnit6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DetailsUnit", //$NON-NLS-1$
					WebsiteElementTypes.DetailsUnit_3131);
		case IndexUnit5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3133);
		case IndexUnit6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3136);
		case IndexUnit7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3143);
		case SelectAction6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3146);
		case DeleteAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DeleteAction", //$NON-NLS-1$
					WebsiteElementTypes.DeleteAction_3147);
		case SelectionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?Selection", //$NON-NLS-1$
					WebsiteElementTypes.Selection_3150);
		case FileAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?FileAttribute", //$NON-NLS-1$
					WebsiteElementTypes.FileAttribute_3152);
		case SelectAction7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3153);
		case DeleteAction3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DeleteAction", //$NON-NLS-1$
					WebsiteElementTypes.DeleteAction_3154);
		case EditStaticTextMenuEntryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?EditStaticTextMenuEntry", //$NON-NLS-1$
					WebsiteElementTypes.EditStaticTextMenuEntry_3156);
		case CreateSitemapUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?CreateSitemapUnit", //$NON-NLS-1$
					WebsiteElementTypes.CreateSitemapUnit_3157);
		case UnitElementEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3169);
		case UnitAssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3170);
		case UnitElement2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3171);
		case UnitAssociation2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3172);
		case UnitElement3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3173);
		case UnitAssociation3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3174);
		case UnitElement4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3175);
		case UnitAssociation4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3176);
		case UnitElement5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3177);
		case UnitElement6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3178);
		case UnitElement7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3179);
		case UnitAssociation5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3180);
		case UnitElement8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3181);
		case UnitAssociation6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3182);
		case UnitElement9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3183);
		case UnitAssociation7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3184);
		case UnitElement10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3185);
		case UnitAssociation8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3186);
		case UnitElement11EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3187);
		case UnitAssociation9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3188);
		case UnitElement12EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3189);
		case UnitAssociation10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3190);
		case UnitElement13EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3191);
		case UnitAssociation11EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3192);
		case UnitElement14EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3193);
		case UnitAssociation12EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3194);
		case UnitElement15EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3195);
		case UnitAssociation13EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3196);
		case UnitElement16EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3197);
		case UnitAssociation14EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3198);
		case UnitElement17EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3199);
		case UnitAssociation15EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3200);
		case DataTypeFieldEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DataTypeField", //$NON-NLS-1$
					WebsiteElementTypes.DataTypeField_3201);
		case DataTypeField2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DataTypeField", //$NON-NLS-1$
					WebsiteElementTypes.DataTypeField_3202);
		case DataTypeField3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DataTypeField", //$NON-NLS-1$
					WebsiteElementTypes.DataTypeField_3203);
		case DataTypeField4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DataTypeField", //$NON-NLS-1$
					WebsiteElementTypes.DataTypeField_3204);
		case DataTypeField5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DataTypeField", //$NON-NLS-1$
					WebsiteElementTypes.DataTypeField_3205);
		case DataTypeField6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DataTypeField", //$NON-NLS-1$
					WebsiteElementTypes.DataTypeField_3206);
		case DateFieldEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DateField", //$NON-NLS-1$
					WebsiteElementTypes.DateField_3207);
		case DateField2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DateField", //$NON-NLS-1$
					WebsiteElementTypes.DateField_3208);
		case DateField3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DateField", //$NON-NLS-1$
					WebsiteElementTypes.DateField_3209);
		case DateField4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DateField", //$NON-NLS-1$
					WebsiteElementTypes.DateField_3210);
		case DateField5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DateField", //$NON-NLS-1$
					WebsiteElementTypes.DateField_3211);
		case DateField6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DateField", //$NON-NLS-1$
					WebsiteElementTypes.DateField_3212);
		case UnitElement18EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3215);
		case UnitAssociation16EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3216);
		case DetailsUnit7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?DetailsUnit", //$NON-NLS-1$
					WebsiteElementTypes.DetailsUnit_3219);
		case UnitElement19EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3220);
		case UnitAssociation17EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3221);
		case IndexUnit8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3222);
		case MapUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?MapUnit", //$NON-NLS-1$
					WebsiteElementTypes.MapUnit_3228);
		case LocationAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?LocationAttribute", //$NON-NLS-1$
					WebsiteElementTypes.LocationAttribute_3230);
		case UnitSupportActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitSupportAction", //$NON-NLS-1$
					WebsiteElementTypes.UnitSupportAction_3232);
		case FeatureSupportActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?FeatureSupportAction", //$NON-NLS-1$
					WebsiteElementTypes.FeatureSupportAction_3234);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?ImageAttribute", //$NON-NLS-1$
					WebsiteElementTypes.ImageAttribute_3235);
		case ActionMenuEntryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?ActionMenuEntry", //$NON-NLS-1$
					WebsiteElementTypes.ActionMenuEntry_3236);
		case ServiceAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?ServiceAttribute", //$NON-NLS-1$
					WebsiteElementTypes.ServiceAttribute_3241);
		case ServiceAssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?ServiceAssociation", //$NON-NLS-1$
					WebsiteElementTypes.ServiceAssociation_3242);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?EncapsulatedAttribute", //$NON-NLS-1$
					WebsiteElementTypes.EncapsulatedAttribute_3243);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?EncapsulatedAssociation", //$NON-NLS-1$
					WebsiteElementTypes.EncapsulatedAssociation_3244);
		case ModelLabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?ModelLabel", //$NON-NLS-1$
					WebsiteElementTypes.ModelLabel_3247);
		case ModelLabel2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?ModelLabel", //$NON-NLS-1$
					WebsiteElementTypes.ModelLabel_3248);
		case CreateUpdateUnit2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?CreateUpdateUnit", //$NON-NLS-1$
					WebsiteElementTypes.CreateUpdateUnit_3249);
		case UnitElement20EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3250);
		case UrlAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.cs.man.ac.uk/mdsd/2010/Website?UrlAttribute", //$NON-NLS-1$
					WebsiteElementTypes.UrlAttribute_3251);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.cs.man.ac.uk/mdsd/2010/Website?AssociationWithoutContainment", //$NON-NLS-1$
					WebsiteElementTypes.AssociationWithoutContainment_4001);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.cs.man.ac.uk/mdsd/2010/Website?AssociationWithContainment", //$NON-NLS-1$
					WebsiteElementTypes.AssociationWithContainment_4002);
		case PageLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.cs.man.ac.uk/mdsd/2010/Website?PageLink", //$NON-NLS-1$
					WebsiteElementTypes.PageLink_4003);
		case ViewAssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.cs.man.ac.uk/mdsd/2010/Website?ViewAssociation", //$NON-NLS-1$
					WebsiteElementTypes.ViewAssociation_4004);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = WebsiteDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && WebsiteElementTypes.isKnownElementType(elementType)) {
			image = WebsiteElementTypes.getImage(elementType);
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
		if (element instanceof WebsiteNavigatorGroup) {
			WebsiteNavigatorGroup group = (WebsiteNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof WebsiteNavigatorItem) {
			WebsiteNavigatorItem navigatorItem = (WebsiteNavigatorItem) element;
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
		switch (WebsiteVisualIDRegistry.getVisualID(view)) {
		case WebGenModelEditPart.VISUAL_ID:
			return getWebGenModel_1000Text(view);
		case WebsitePropertiesEditPart.VISUAL_ID:
			return getWebsiteProperties_2001Text(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_2002Text(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2003Text(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2004Text(view);
		case PageEditPart.VISUAL_ID:
			return getPage_2005Text(view);
		case EnumerationTypeEditPart.VISUAL_ID:
			return getEnumerationType_2006Text(view);
		case DynamicMenuEditPart.VISUAL_ID:
			return getDynamicMenu_2008Text(view);
		case StaticMenuEditPart.VISUAL_ID:
			return getStaticMenu_2009Text(view);
		case ViewEditPart.VISUAL_ID:
			return getView_2010Text(view);
		case DateAttributeEditPart.VISUAL_ID:
			return getDateAttribute_3014Text(view);
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getEnumerationLiteral_3028Text(view);
		case LocalAuthenticationSystemEditPart.VISUAL_ID:
			return getLocalAuthenticationSystem_3029Text(view);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getDataTypeAttribute_3054Text(view);
		case CasAuthenticationEditPart.VISUAL_ID:
			return getCasAuthentication_3055Text(view);
		case DeleteActionEditPart.VISUAL_ID:
			return getDeleteAction_3101Text(view);
		case SelectActionEditPart.VISUAL_ID:
			return getSelectAction_3102Text(view);
		case CreateUnitEditPart.VISUAL_ID:
			return getCreateUnit_3103Text(view);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3104Text(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3105Text(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3106Text(view);
		case SelectAction2EditPart.VISUAL_ID:
			return getSelectAction_3107Text(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3109Text(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3110Text(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3111Text(view);
		case DetailsUnit2EditPart.VISUAL_ID:
			return getDetailsUnit_3112Text(view);
		case DetailsUnit3EditPart.VISUAL_ID:
			return getDetailsUnit_3113Text(view);
		case IndexUnit2EditPart.VISUAL_ID:
			return getIndexUnit_3114Text(view);
		case DetailsUnit4EditPart.VISUAL_ID:
			return getDetailsUnit_3116Text(view);
		case IndexUnit3EditPart.VISUAL_ID:
			return getIndexUnit_3118Text(view);
		case IndexUnit4EditPart.VISUAL_ID:
			return getIndexUnit_3120Text(view);
		case SelectAction3EditPart.VISUAL_ID:
			return getSelectAction_3126Text(view);
		case SelectAction4EditPart.VISUAL_ID:
			return getSelectAction_3127Text(view);
		case SelectAction5EditPart.VISUAL_ID:
			return getSelectAction_3128Text(view);
		case DetailsUnit5EditPart.VISUAL_ID:
			return getDetailsUnit_3129Text(view);
		case DetailsUnit6EditPart.VISUAL_ID:
			return getDetailsUnit_3131Text(view);
		case IndexUnit5EditPart.VISUAL_ID:
			return getIndexUnit_3133Text(view);
		case IndexUnit6EditPart.VISUAL_ID:
			return getIndexUnit_3136Text(view);
		case IndexUnit7EditPart.VISUAL_ID:
			return getIndexUnit_3143Text(view);
		case SelectAction6EditPart.VISUAL_ID:
			return getSelectAction_3146Text(view);
		case DeleteAction2EditPart.VISUAL_ID:
			return getDeleteAction_3147Text(view);
		case SelectionEditPart.VISUAL_ID:
			return getSelection_3150Text(view);
		case FileAttributeEditPart.VISUAL_ID:
			return getFileAttribute_3152Text(view);
		case SelectAction7EditPart.VISUAL_ID:
			return getSelectAction_3153Text(view);
		case DeleteAction3EditPart.VISUAL_ID:
			return getDeleteAction_3154Text(view);
		case EditStaticTextMenuEntryEditPart.VISUAL_ID:
			return getEditStaticTextMenuEntry_3156Text(view);
		case CreateSitemapUnitEditPart.VISUAL_ID:
			return getCreateSitemapUnit_3157Text(view);
		case UnitElementEditPart.VISUAL_ID:
			return getUnitElement_3169Text(view);
		case UnitAssociationEditPart.VISUAL_ID:
			return getUnitAssociation_3170Text(view);
		case UnitElement2EditPart.VISUAL_ID:
			return getUnitElement_3171Text(view);
		case UnitAssociation2EditPart.VISUAL_ID:
			return getUnitAssociation_3172Text(view);
		case UnitElement3EditPart.VISUAL_ID:
			return getUnitElement_3173Text(view);
		case UnitAssociation3EditPart.VISUAL_ID:
			return getUnitAssociation_3174Text(view);
		case UnitElement4EditPart.VISUAL_ID:
			return getUnitElement_3175Text(view);
		case UnitAssociation4EditPart.VISUAL_ID:
			return getUnitAssociation_3176Text(view);
		case UnitElement5EditPart.VISUAL_ID:
			return getUnitElement_3177Text(view);
		case UnitElement6EditPart.VISUAL_ID:
			return getUnitElement_3178Text(view);
		case UnitElement7EditPart.VISUAL_ID:
			return getUnitElement_3179Text(view);
		case UnitAssociation5EditPart.VISUAL_ID:
			return getUnitAssociation_3180Text(view);
		case UnitElement8EditPart.VISUAL_ID:
			return getUnitElement_3181Text(view);
		case UnitAssociation6EditPart.VISUAL_ID:
			return getUnitAssociation_3182Text(view);
		case UnitElement9EditPart.VISUAL_ID:
			return getUnitElement_3183Text(view);
		case UnitAssociation7EditPart.VISUAL_ID:
			return getUnitAssociation_3184Text(view);
		case UnitElement10EditPart.VISUAL_ID:
			return getUnitElement_3185Text(view);
		case UnitAssociation8EditPart.VISUAL_ID:
			return getUnitAssociation_3186Text(view);
		case UnitElement11EditPart.VISUAL_ID:
			return getUnitElement_3187Text(view);
		case UnitAssociation9EditPart.VISUAL_ID:
			return getUnitAssociation_3188Text(view);
		case UnitElement12EditPart.VISUAL_ID:
			return getUnitElement_3189Text(view);
		case UnitAssociation10EditPart.VISUAL_ID:
			return getUnitAssociation_3190Text(view);
		case UnitElement13EditPart.VISUAL_ID:
			return getUnitElement_3191Text(view);
		case UnitAssociation11EditPart.VISUAL_ID:
			return getUnitAssociation_3192Text(view);
		case UnitElement14EditPart.VISUAL_ID:
			return getUnitElement_3193Text(view);
		case UnitAssociation12EditPart.VISUAL_ID:
			return getUnitAssociation_3194Text(view);
		case UnitElement15EditPart.VISUAL_ID:
			return getUnitElement_3195Text(view);
		case UnitAssociation13EditPart.VISUAL_ID:
			return getUnitAssociation_3196Text(view);
		case UnitElement16EditPart.VISUAL_ID:
			return getUnitElement_3197Text(view);
		case UnitAssociation14EditPart.VISUAL_ID:
			return getUnitAssociation_3198Text(view);
		case UnitElement17EditPart.VISUAL_ID:
			return getUnitElement_3199Text(view);
		case UnitAssociation15EditPart.VISUAL_ID:
			return getUnitAssociation_3200Text(view);
		case DataTypeFieldEditPart.VISUAL_ID:
			return getDataTypeField_3201Text(view);
		case DataTypeField2EditPart.VISUAL_ID:
			return getDataTypeField_3202Text(view);
		case DataTypeField3EditPart.VISUAL_ID:
			return getDataTypeField_3203Text(view);
		case DataTypeField4EditPart.VISUAL_ID:
			return getDataTypeField_3204Text(view);
		case DataTypeField5EditPart.VISUAL_ID:
			return getDataTypeField_3205Text(view);
		case DataTypeField6EditPart.VISUAL_ID:
			return getDataTypeField_3206Text(view);
		case DateFieldEditPart.VISUAL_ID:
			return getDateField_3207Text(view);
		case DateField2EditPart.VISUAL_ID:
			return getDateField_3208Text(view);
		case DateField3EditPart.VISUAL_ID:
			return getDateField_3209Text(view);
		case DateField4EditPart.VISUAL_ID:
			return getDateField_3210Text(view);
		case DateField5EditPart.VISUAL_ID:
			return getDateField_3211Text(view);
		case DateField6EditPart.VISUAL_ID:
			return getDateField_3212Text(view);
		case UnitElement18EditPart.VISUAL_ID:
			return getUnitElement_3215Text(view);
		case UnitAssociation16EditPart.VISUAL_ID:
			return getUnitAssociation_3216Text(view);
		case DetailsUnit7EditPart.VISUAL_ID:
			return getDetailsUnit_3219Text(view);
		case UnitElement19EditPart.VISUAL_ID:
			return getUnitElement_3220Text(view);
		case UnitAssociation17EditPart.VISUAL_ID:
			return getUnitAssociation_3221Text(view);
		case IndexUnit8EditPart.VISUAL_ID:
			return getIndexUnit_3222Text(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3228Text(view);
		case LocationAttributeEditPart.VISUAL_ID:
			return getLocationAttribute_3230Text(view);
		case UnitSupportActionEditPart.VISUAL_ID:
			return getUnitSupportAction_3232Text(view);
		case FeatureSupportActionEditPart.VISUAL_ID:
			return getFeatureSupportAction_3234Text(view);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImageAttribute_3235Text(view);
		case ActionMenuEntryEditPart.VISUAL_ID:
			return getActionMenuEntry_3236Text(view);
		case ServiceAttributeEditPart.VISUAL_ID:
			return getServiceAttribute_3241Text(view);
		case ServiceAssociationEditPart.VISUAL_ID:
			return getServiceAssociation_3242Text(view);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getEncapsulatedAttribute_3243Text(view);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getEncapsulatedAssociation_3244Text(view);
		case ModelLabelEditPart.VISUAL_ID:
			return getModelLabel_3247Text(view);
		case ModelLabel2EditPart.VISUAL_ID:
			return getModelLabel_3248Text(view);
		case CreateUpdateUnit2EditPart.VISUAL_ID:
			return getCreateUpdateUnit_3249Text(view);
		case UnitElement20EditPart.VISUAL_ID:
			return getUnitElement_3250Text(view);
		case UrlAttributeEditPart.VISUAL_ID:
			return getUrlAttribute_3251Text(view);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getAssociationWithoutContainment_4001Text(view);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getAssociationWithContainment_4002Text(view);
		case PageLinkEditPart.VISUAL_ID:
			return getPageLink_4003Text(view);
		case ViewAssociationEditPart.VISUAL_ID:
			return getViewAssociation_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getWebGenModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWebsiteProperties_2001Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.WebsiteProperties_2001,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(WebsitePropertiesSiteTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataType_2002Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataType_2002,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntity_2003Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.Entity_2003,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(EntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getService_2004Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.Service_2004,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ServiceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPage_2005Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.Page_2005,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(PageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnumerationType_2006Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.EnumerationType_2006,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(EnumerationTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDynamicMenu_2008Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DynamicMenu_2008,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DynamicMenuNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5155); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStaticMenu_2009Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.StaticMenu_2009,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(StaticMenuNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5157); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getView_2010Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.View_2010,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ViewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5246); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDateAttribute_3014Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DateAttribute_3014,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DateAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnumerationLiteral_3028Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.EnumerationLiteral_3028,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(EnumerationLiteralNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLocalAuthenticationSystem_3029Text(View view) {
		LocalAuthenticationSystem domainModelElement = (LocalAuthenticationSystem) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLoginLabel();
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataTypeAttribute_3054Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataTypeAttribute_3054,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCasAuthentication_3055Text(View view) {
		CasAuthentication domainModelElement = (CasAuthentication) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLoginLabel();
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeleteAction_3101Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DeleteAction_3101,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DeleteActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5105); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelectAction_3102Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3102,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5106); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCreateUnit_3103Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.CreateUnit_3103,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(CreateUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5107); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCreateUpdateUnit_3104Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.CreateUpdateUnit_3104,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(CreateUpdateUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5108); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDetailsUnit_3105Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DetailsUnit_3105,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DetailsUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5109); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndexUnit_3106Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3106,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5112); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelectAction_3107Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3107,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5110); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSearchUnit_3109Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SearchUnit_3109,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SearchUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5113); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStaticUnit_3110Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.StaticUnit_3110,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(StaticUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5114); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUpdateUnit_3111Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UpdateUnit_3111,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UpdateUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5115); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDetailsUnit_3112Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DetailsUnit_3112,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DetailsUnitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5116); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDetailsUnit_3113Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DetailsUnit_3113,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DetailsUnitName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5117); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndexUnit_3114Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3114,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5123); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDetailsUnit_3116Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DetailsUnit_3116,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DetailsUnitName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5120); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndexUnit_3118Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3118,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5122); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndexUnit_3120Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3120,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5125); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelectAction_3126Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3126,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5130); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelectAction_3127Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3127,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5131); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelectAction_3128Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3128,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5132); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDetailsUnit_3129Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DetailsUnit_3129,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DetailsUnitName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5133); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDetailsUnit_3131Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DetailsUnit_3131,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DetailsUnitName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5135); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndexUnit_3133Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3133,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5138); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndexUnit_3136Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3136,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5142); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndexUnit_3143Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3143,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5149); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelectAction_3146Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3146,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5150); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeleteAction_3147Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DeleteAction_3147,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DeleteActionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5151); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelection_3150Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.Selection_3150,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5158); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFileAttribute_3152Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.FileAttribute_3152,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(FileAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5160); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelectAction_3153Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3153,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5161); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeleteAction_3154Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DeleteAction_3154,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DeleteActionName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5162); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEditStaticTextMenuEntry_3156Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.EditStaticTextMenuEntry_3156,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(EditStaticTextMenuEntryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5164); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCreateSitemapUnit_3157Text(View view) {
		CreateSitemapUnit domainModelElement = (CreateSitemapUnit) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3157); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3169Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3169,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5176); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3170Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3170,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5177); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3171Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3171,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5178); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3172Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3172,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5179); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3173Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3173,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5180); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3174Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3174,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5199); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3175Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3175,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5181); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3176Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3176,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5184); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3177Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3177,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5182); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3178Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3178,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5183); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3179Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3179,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5185); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3180Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3180,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5198); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3181Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3181,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5186); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3182Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3182,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5191); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3183Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3183,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5187); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3184Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3184,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5188); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3185Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3185,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5189); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3186Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3186,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5190); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3187Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3187,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5192); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3188Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3188,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5197); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3189Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3189,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5193); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3190Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3190,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5194); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3191Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3191,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5195); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3192Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3192,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5196); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3193Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3193,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5200); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3194Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3194,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5201); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3195Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3195,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName15EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5202); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3196Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3196,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5203); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3197Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3197,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName16EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5204); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3198Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3198,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5207); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3199Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3199,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName17EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5205); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3200Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3200,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName15EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5206); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataTypeField_3201Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataTypeField_3201,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeFieldNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5208); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataTypeField_3202Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataTypeField_3202,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeFieldName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5209); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataTypeField_3203Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataTypeField_3203,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeFieldName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5210); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataTypeField_3204Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataTypeField_3204,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeFieldName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5211); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataTypeField_3205Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataTypeField_3205,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeFieldName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5212); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataTypeField_3206Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataTypeField_3206,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeFieldName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5213); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDateField_3207Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DateField_3207,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DateFieldNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5214); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDateField_3208Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DateField_3208,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DateFieldName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5215); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDateField_3209Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DateField_3209,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DateFieldName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5216); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDateField_3210Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DateField_3210,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DateFieldName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5217); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDateField_3211Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DateField_3211,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DateFieldName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5218); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDateField_3212Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DateField_3212,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DateFieldName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5219); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3215Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3215,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName18EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5222); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3216Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3216,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName16EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5223); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDetailsUnit_3219Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DetailsUnit_3219,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DetailsUnitName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5226); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitElement_3220Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3220,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName19EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5227); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitAssociation_3221Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3221,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName17EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5231); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIndexUnit_3222Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3222,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5230); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMapUnit_3228Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.MapUnit_3228,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(MapUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5235); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLocationAttribute_3230Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.LocationAttribute_3230,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(LocationAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5237); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnitSupportAction_3232Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitSupportAction_3232,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitSupportActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5239); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFeatureSupportAction_3234Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.FeatureSupportAction_3234,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(FeatureSupportActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5241); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getImageAttribute_3235Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.ImageAttribute_3235,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ImageAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5242); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActionMenuEntry_3236Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.ActionMenuEntry_3236,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ActionMenuEntryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5243); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getServiceAttribute_3241Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.ServiceAttribute_3241,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ServiceAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5249); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getServiceAssociation_3242Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.ServiceAssociation_3242,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ServiceAssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5250); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEncapsulatedAttribute_3243Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.EncapsulatedAttribute_3243,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(EncapsulatedAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5251); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEncapsulatedAssociation_3244Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.EncapsulatedAssociation_3244,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(EncapsulatedAssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5252); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModelLabel_3247Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.ModelLabel_3247,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ModelLabelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5255); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModelLabel_3248Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.ModelLabel_3248,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ModelLabelName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5256); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCreateUpdateUnit_3249Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.CreateUpdateUnit_3249,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(CreateUpdateUnitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5257); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3250Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3250,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName20EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5258); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUrlAttribute_3251Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UrlAttribute_3251,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UrlAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5259); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociationWithoutContainment_4001Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.AssociationWithoutContainment_4001,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(AssociationWithoutContainmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociationWithContainment_4002Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.AssociationWithContainment_4002,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(AssociationWithContainmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPageLink_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getViewAssociation_4004Text(View view) {
		ViewAssociation domainModelElement = (ViewAssociation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4004); //$NON-NLS-1$
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
		return WebGenModelEditPart.MODEL_ID.equals(WebsiteVisualIDRegistry.getModelID(view));
	}

}
