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

import security.CasAuthentication;
import security.LocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.webgen.persistence.ViewAssociation;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.*;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteDiagramEditorPlugin;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteParserProvider;
import uk.ac.man.cs.mdsd.webgen.webui.CreateSitemapUnit;

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
			return getImage("Navigator?TopLevelNode?http://cs.man.ac.uk/mdsd/webgen/base?DataType", //$NON-NLS-1$
					WebsiteElementTypes.DataType_2013);
		case EnumerationTypeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://cs.man.ac.uk/mdsd/webgen/base?EnumerationType", //$NON-NLS-1$
					WebsiteElementTypes.EnumerationType_2014);
		case EntityEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://cs.man.ac.uk/mdsd/webgen/persistence?Entity", //$NON-NLS-1$
					WebsiteElementTypes.Entity_2015);
		case ViewEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://cs.man.ac.uk/mdsd/webgen/persistence?View", //$NON-NLS-1$
					WebsiteElementTypes.View_2016);
		case ServiceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://cs.man.ac.uk/mdsd/webgen/service?Service", //$NON-NLS-1$
					WebsiteElementTypes.Service_2017);
		case DynamicMenuEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://cs.man.ac.uk/mdsd/webgen/webui?DynamicMenu", //$NON-NLS-1$
					WebsiteElementTypes.DynamicMenu_2018);
		case PageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://cs.man.ac.uk/mdsd/webgen/webui?Page", //$NON-NLS-1$
					WebsiteElementTypes.Page_2019);
		case StaticMenuEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://cs.man.ac.uk/mdsd/webgen/webui?StaticMenu", //$NON-NLS-1$
					WebsiteElementTypes.StaticMenu_2020);
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/base?EnumerationLiteral", //$NON-NLS-1$
					WebsiteElementTypes.EnumerationLiteral_3273);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?DataTypeAttribute", //$NON-NLS-1$
					WebsiteElementTypes.DataTypeAttribute_3274);
		case DateAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?DateAttribute", //$NON-NLS-1$
					WebsiteElementTypes.DateAttribute_3275);
		case UrlAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?UrlAttribute", //$NON-NLS-1$
					WebsiteElementTypes.UrlAttribute_3276);
		case FileAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?FileAttribute", //$NON-NLS-1$
					WebsiteElementTypes.FileAttribute_3277);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?ImageAttribute", //$NON-NLS-1$
					WebsiteElementTypes.ImageAttribute_3278);
		case LocationAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?LocationAttribute", //$NON-NLS-1$
					WebsiteElementTypes.LocationAttribute_3279);
		case ModelLabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?ModelLabel", //$NON-NLS-1$
					WebsiteElementTypes.ModelLabel_3280);
		case ModelLabel2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?ModelLabel", //$NON-NLS-1$
					WebsiteElementTypes.ModelLabel_3281);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?EncapsulatedAttribute", //$NON-NLS-1$
					WebsiteElementTypes.EncapsulatedAttribute_3282);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?EncapsulatedAssociation", //$NON-NLS-1$
					WebsiteElementTypes.EncapsulatedAssociation_3283);
		case SelectionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/service?Selection", //$NON-NLS-1$
					WebsiteElementTypes.Selection_3284);
		case BusinessOperationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/service?BusinessOperation", //$NON-NLS-1$
					WebsiteElementTypes.BusinessOperation_3285);
		case CreateUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?CreateUnit", //$NON-NLS-1$
					WebsiteElementTypes.CreateUnit_3286);
		case UnitElementEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3287);
		case UnitAssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3288);
		case DataTypeFieldEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DataTypeField", //$NON-NLS-1$
					WebsiteElementTypes.DataTypeField_3289);
		case DateFieldEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DateField", //$NON-NLS-1$
					WebsiteElementTypes.DateField_3290);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?CreateUpdateUnit", //$NON-NLS-1$
					WebsiteElementTypes.CreateUpdateUnit_3291);
		case UnitElement2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3292);
		case UnitAssociation2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3293);
		case CreateUpdateUnit2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?CreateUpdateUnit", //$NON-NLS-1$
					WebsiteElementTypes.CreateUpdateUnit_3294);
		case UnitElement3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3295);
		case DataTypeField2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DataTypeField", //$NON-NLS-1$
					WebsiteElementTypes.DataTypeField_3296);
		case DateField2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DateField", //$NON-NLS-1$
					WebsiteElementTypes.DateField_3297);
		case CreateSitemapUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?CreateSitemapUnit", //$NON-NLS-1$
					WebsiteElementTypes.CreateSitemapUnit_3298);
		case DetailsUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DetailsUnit", //$NON-NLS-1$
					WebsiteElementTypes.DetailsUnit_3299);
		case UnitElement4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3300);
		case SelectActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3301);
		case UnitAssociation3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3302);
		case DetailsUnit2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DetailsUnit", //$NON-NLS-1$
					WebsiteElementTypes.DetailsUnit_3303);
		case UnitElement5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3304);
		case UnitAssociation4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3305);
		case DetailsUnit3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DetailsUnit", //$NON-NLS-1$
					WebsiteElementTypes.DetailsUnit_3306);
		case UnitElement6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3307);
		case IndexUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3308);
		case UnitElement7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3309);
		case IndexUnit2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3310);
		case UnitElement8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3311);
		case UnitAssociation5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3312);
		case DetailsUnit4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DetailsUnit", //$NON-NLS-1$
					WebsiteElementTypes.DetailsUnit_3313);
		case UnitElement9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3314);
		case UnitAssociation6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3315);
		case DetailsUnit5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DetailsUnit", //$NON-NLS-1$
					WebsiteElementTypes.DetailsUnit_3316);
		case UnitElement10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3317);
		case UnitAssociation7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3318);
		case IndexUnit3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3319);
		case UnitElement11EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3320);
		case UnitAssociation8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3321);
		case IndexUnit4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3322);
		case UnitElement12EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3323);
		case UnitAssociation9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3324);
		case DetailsUnit6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DetailsUnit", //$NON-NLS-1$
					WebsiteElementTypes.DetailsUnit_3325);
		case UnitElement13EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3326);
		case UnitAssociation10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3327);
		case IndexUnit5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3328);
		case UnitElement14EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3329);
		case UnitAssociation11EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3330);
		case SelectAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3331);
		case DeleteActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DeleteAction", //$NON-NLS-1$
					WebsiteElementTypes.DeleteAction_3332);
		case ImageIndexUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?ImageIndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.ImageIndexUnit_3333);
		case SelectAction3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3334);
		case DeleteAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DeleteAction", //$NON-NLS-1$
					WebsiteElementTypes.DeleteAction_3335);
		case FeatureSupportActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?FeatureSupportAction", //$NON-NLS-1$
					WebsiteElementTypes.FeatureSupportAction_3336);
		case SelectAction4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3337);
		case DataTypeField3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DataTypeField", //$NON-NLS-1$
					WebsiteElementTypes.DataTypeField_3338);
		case DateField3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DateField", //$NON-NLS-1$
					WebsiteElementTypes.DateField_3339);
		case UnitSupportActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitSupportAction", //$NON-NLS-1$
					WebsiteElementTypes.UnitSupportAction_3340);
		case IndexUnit6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3341);
		case UnitElement15EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3342);
		case SelectAction5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3343);
		case UnitAssociation12EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3344);
		case DetailsUnit7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DetailsUnit", //$NON-NLS-1$
					WebsiteElementTypes.DetailsUnit_3345);
		case UnitElement16EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3346);
		case UnitAssociation13EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3347);
		case IndexUnit7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3348);
		case UnitElement17EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3349);
		case UnitAssociation14EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3350);
		case SelectAction6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3351);
		case DataTypeField4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DataTypeField", //$NON-NLS-1$
					WebsiteElementTypes.DataTypeField_3352);
		case DateField4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DateField", //$NON-NLS-1$
					WebsiteElementTypes.DateField_3353);
		case SelectAction7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3354);
		case DeleteAction3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DeleteAction", //$NON-NLS-1$
					WebsiteElementTypes.DeleteAction_3355);
		case FeatureSupportAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?FeatureSupportAction", //$NON-NLS-1$
					WebsiteElementTypes.FeatureSupportAction_3356);
		case MapUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?MapUnit", //$NON-NLS-1$
					WebsiteElementTypes.MapUnit_3357);
		case SearchUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?SearchUnit", //$NON-NLS-1$
					WebsiteElementTypes.SearchUnit_3358);
		case UnitElement18EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3359);
		case UnitAssociation15EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3360);
		case DataTypeField5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DataTypeField", //$NON-NLS-1$
					WebsiteElementTypes.DataTypeField_3361);
		case DateField5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DateField", //$NON-NLS-1$
					WebsiteElementTypes.DateField_3362);
		case StaticUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?StaticUnit", //$NON-NLS-1$
					WebsiteElementTypes.StaticUnit_3363);
		case UpdateUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UpdateUnit", //$NON-NLS-1$
					WebsiteElementTypes.UpdateUnit_3364);
		case UnitElement19EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3365);
		case UnitAssociation16EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3366);
		case IndexUnit8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?IndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.IndexUnit_3367);
		case UnitElement20EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitElement", //$NON-NLS-1$
					WebsiteElementTypes.UnitElement_3368);
		case UnitAssociation17EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?UnitAssociation", //$NON-NLS-1$
					WebsiteElementTypes.UnitAssociation_3369);
		case SelectAction8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3370);
		case DeleteAction4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DeleteAction", //$NON-NLS-1$
					WebsiteElementTypes.DeleteAction_3371);
		case DataTypeField6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DataTypeField", //$NON-NLS-1$
					WebsiteElementTypes.DataTypeField_3372);
		case DateField6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DateField", //$NON-NLS-1$
					WebsiteElementTypes.DateField_3373);
		case ImageIndexUnit2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?ImageIndexUnit", //$NON-NLS-1$
					WebsiteElementTypes.ImageIndexUnit_3374);
		case SelectAction9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?SelectAction", //$NON-NLS-1$
					WebsiteElementTypes.SelectAction_3375);
		case DeleteAction5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?DeleteAction", //$NON-NLS-1$
					WebsiteElementTypes.DeleteAction_3376);
		case FeatureSupportAction3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?FeatureSupportAction", //$NON-NLS-1$
					WebsiteElementTypes.FeatureSupportAction_3377);
		case SliderUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?SliderUnit", //$NON-NLS-1$
					WebsiteElementTypes.SliderUnit_3378);
		case GalleryUnitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?GalleryUnit", //$NON-NLS-1$
					WebsiteElementTypes.GalleryUnit_3379);
		case ActionMenuEntryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?ActionMenuEntry", //$NON-NLS-1$
					WebsiteElementTypes.ActionMenuEntry_3380);
		case EditStaticTextMenuEntryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/webui?EditStaticTextMenuEntry", //$NON-NLS-1$
					WebsiteElementTypes.EditStaticTextMenuEntry_3381);
		case LocalAuthenticationSystemEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/security?LocalAuthenticationSystem", //$NON-NLS-1$
					WebsiteElementTypes.LocalAuthenticationSystem_3382);
		case CasAuthenticationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/security?CasAuthentication", //$NON-NLS-1$
					WebsiteElementTypes.CasAuthentication_3383);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://cs.man.ac.uk/mdsd/webgen/persistence?AssociationWithoutContainment", //$NON-NLS-1$
					WebsiteElementTypes.AssociationWithoutContainment_4005);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://cs.man.ac.uk/mdsd/webgen/persistence?AssociationWithContainment", //$NON-NLS-1$
					WebsiteElementTypes.AssociationWithContainment_4006);
		case ViewAssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://cs.man.ac.uk/mdsd/webgen/persistence?ViewAssociation", //$NON-NLS-1$
					WebsiteElementTypes.ViewAssociation_4007);
		case PageLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://cs.man.ac.uk/mdsd/webgen/webui?PageLink", //$NON-NLS-1$
					WebsiteElementTypes.PageLink_4008);
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
			return getDataType_2013Text(view);
		case EnumerationTypeEditPart.VISUAL_ID:
			return getEnumerationType_2014Text(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2015Text(view);
		case ViewEditPart.VISUAL_ID:
			return getView_2016Text(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2017Text(view);
		case DynamicMenuEditPart.VISUAL_ID:
			return getDynamicMenu_2018Text(view);
		case PageEditPart.VISUAL_ID:
			return getPage_2019Text(view);
		case StaticMenuEditPart.VISUAL_ID:
			return getStaticMenu_2020Text(view);
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getEnumerationLiteral_3273Text(view);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getDataTypeAttribute_3274Text(view);
		case DateAttributeEditPart.VISUAL_ID:
			return getDateAttribute_3275Text(view);
		case UrlAttributeEditPart.VISUAL_ID:
			return getUrlAttribute_3276Text(view);
		case FileAttributeEditPart.VISUAL_ID:
			return getFileAttribute_3277Text(view);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImageAttribute_3278Text(view);
		case LocationAttributeEditPart.VISUAL_ID:
			return getLocationAttribute_3279Text(view);
		case ModelLabelEditPart.VISUAL_ID:
			return getModelLabel_3280Text(view);
		case ModelLabel2EditPart.VISUAL_ID:
			return getModelLabel_3281Text(view);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getEncapsulatedAttribute_3282Text(view);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getEncapsulatedAssociation_3283Text(view);
		case SelectionEditPart.VISUAL_ID:
			return getSelection_3284Text(view);
		case BusinessOperationEditPart.VISUAL_ID:
			return getBusinessOperation_3285Text(view);
		case CreateUnitEditPart.VISUAL_ID:
			return getCreateUnit_3286Text(view);
		case UnitElementEditPart.VISUAL_ID:
			return getUnitElement_3287Text(view);
		case UnitAssociationEditPart.VISUAL_ID:
			return getUnitAssociation_3288Text(view);
		case DataTypeFieldEditPart.VISUAL_ID:
			return getDataTypeField_3289Text(view);
		case DateFieldEditPart.VISUAL_ID:
			return getDateField_3290Text(view);
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return getCreateUpdateUnit_3291Text(view);
		case UnitElement2EditPart.VISUAL_ID:
			return getUnitElement_3292Text(view);
		case UnitAssociation2EditPart.VISUAL_ID:
			return getUnitAssociation_3293Text(view);
		case CreateUpdateUnit2EditPart.VISUAL_ID:
			return getCreateUpdateUnit_3294Text(view);
		case UnitElement3EditPart.VISUAL_ID:
			return getUnitElement_3295Text(view);
		case DataTypeField2EditPart.VISUAL_ID:
			return getDataTypeField_3296Text(view);
		case DateField2EditPart.VISUAL_ID:
			return getDateField_3297Text(view);
		case CreateSitemapUnitEditPart.VISUAL_ID:
			return getCreateSitemapUnit_3298Text(view);
		case DetailsUnitEditPart.VISUAL_ID:
			return getDetailsUnit_3299Text(view);
		case UnitElement4EditPart.VISUAL_ID:
			return getUnitElement_3300Text(view);
		case SelectActionEditPart.VISUAL_ID:
			return getSelectAction_3301Text(view);
		case UnitAssociation3EditPart.VISUAL_ID:
			return getUnitAssociation_3302Text(view);
		case DetailsUnit2EditPart.VISUAL_ID:
			return getDetailsUnit_3303Text(view);
		case UnitElement5EditPart.VISUAL_ID:
			return getUnitElement_3304Text(view);
		case UnitAssociation4EditPart.VISUAL_ID:
			return getUnitAssociation_3305Text(view);
		case DetailsUnit3EditPart.VISUAL_ID:
			return getDetailsUnit_3306Text(view);
		case UnitElement6EditPart.VISUAL_ID:
			return getUnitElement_3307Text(view);
		case IndexUnitEditPart.VISUAL_ID:
			return getIndexUnit_3308Text(view);
		case UnitElement7EditPart.VISUAL_ID:
			return getUnitElement_3309Text(view);
		case IndexUnit2EditPart.VISUAL_ID:
			return getIndexUnit_3310Text(view);
		case UnitElement8EditPart.VISUAL_ID:
			return getUnitElement_3311Text(view);
		case UnitAssociation5EditPart.VISUAL_ID:
			return getUnitAssociation_3312Text(view);
		case DetailsUnit4EditPart.VISUAL_ID:
			return getDetailsUnit_3313Text(view);
		case UnitElement9EditPart.VISUAL_ID:
			return getUnitElement_3314Text(view);
		case UnitAssociation6EditPart.VISUAL_ID:
			return getUnitAssociation_3315Text(view);
		case DetailsUnit5EditPart.VISUAL_ID:
			return getDetailsUnit_3316Text(view);
		case UnitElement10EditPart.VISUAL_ID:
			return getUnitElement_3317Text(view);
		case UnitAssociation7EditPart.VISUAL_ID:
			return getUnitAssociation_3318Text(view);
		case IndexUnit3EditPart.VISUAL_ID:
			return getIndexUnit_3319Text(view);
		case UnitElement11EditPart.VISUAL_ID:
			return getUnitElement_3320Text(view);
		case UnitAssociation8EditPart.VISUAL_ID:
			return getUnitAssociation_3321Text(view);
		case IndexUnit4EditPart.VISUAL_ID:
			return getIndexUnit_3322Text(view);
		case UnitElement12EditPart.VISUAL_ID:
			return getUnitElement_3323Text(view);
		case UnitAssociation9EditPart.VISUAL_ID:
			return getUnitAssociation_3324Text(view);
		case DetailsUnit6EditPart.VISUAL_ID:
			return getDetailsUnit_3325Text(view);
		case UnitElement13EditPart.VISUAL_ID:
			return getUnitElement_3326Text(view);
		case UnitAssociation10EditPart.VISUAL_ID:
			return getUnitAssociation_3327Text(view);
		case IndexUnit5EditPart.VISUAL_ID:
			return getIndexUnit_3328Text(view);
		case UnitElement14EditPart.VISUAL_ID:
			return getUnitElement_3329Text(view);
		case UnitAssociation11EditPart.VISUAL_ID:
			return getUnitAssociation_3330Text(view);
		case SelectAction2EditPart.VISUAL_ID:
			return getSelectAction_3331Text(view);
		case DeleteActionEditPart.VISUAL_ID:
			return getDeleteAction_3332Text(view);
		case ImageIndexUnitEditPart.VISUAL_ID:
			return getImageIndexUnit_3333Text(view);
		case SelectAction3EditPart.VISUAL_ID:
			return getSelectAction_3334Text(view);
		case DeleteAction2EditPart.VISUAL_ID:
			return getDeleteAction_3335Text(view);
		case FeatureSupportActionEditPart.VISUAL_ID:
			return getFeatureSupportAction_3336Text(view);
		case SelectAction4EditPart.VISUAL_ID:
			return getSelectAction_3337Text(view);
		case DataTypeField3EditPart.VISUAL_ID:
			return getDataTypeField_3338Text(view);
		case DateField3EditPart.VISUAL_ID:
			return getDateField_3339Text(view);
		case UnitSupportActionEditPart.VISUAL_ID:
			return getUnitSupportAction_3340Text(view);
		case IndexUnit6EditPart.VISUAL_ID:
			return getIndexUnit_3341Text(view);
		case UnitElement15EditPart.VISUAL_ID:
			return getUnitElement_3342Text(view);
		case SelectAction5EditPart.VISUAL_ID:
			return getSelectAction_3343Text(view);
		case UnitAssociation12EditPart.VISUAL_ID:
			return getUnitAssociation_3344Text(view);
		case DetailsUnit7EditPart.VISUAL_ID:
			return getDetailsUnit_3345Text(view);
		case UnitElement16EditPart.VISUAL_ID:
			return getUnitElement_3346Text(view);
		case UnitAssociation13EditPart.VISUAL_ID:
			return getUnitAssociation_3347Text(view);
		case IndexUnit7EditPart.VISUAL_ID:
			return getIndexUnit_3348Text(view);
		case UnitElement17EditPart.VISUAL_ID:
			return getUnitElement_3349Text(view);
		case UnitAssociation14EditPart.VISUAL_ID:
			return getUnitAssociation_3350Text(view);
		case SelectAction6EditPart.VISUAL_ID:
			return getSelectAction_3351Text(view);
		case DataTypeField4EditPart.VISUAL_ID:
			return getDataTypeField_3352Text(view);
		case DateField4EditPart.VISUAL_ID:
			return getDateField_3353Text(view);
		case SelectAction7EditPart.VISUAL_ID:
			return getSelectAction_3354Text(view);
		case DeleteAction3EditPart.VISUAL_ID:
			return getDeleteAction_3355Text(view);
		case FeatureSupportAction2EditPart.VISUAL_ID:
			return getFeatureSupportAction_3356Text(view);
		case MapUnitEditPart.VISUAL_ID:
			return getMapUnit_3357Text(view);
		case SearchUnitEditPart.VISUAL_ID:
			return getSearchUnit_3358Text(view);
		case UnitElement18EditPart.VISUAL_ID:
			return getUnitElement_3359Text(view);
		case UnitAssociation15EditPart.VISUAL_ID:
			return getUnitAssociation_3360Text(view);
		case DataTypeField5EditPart.VISUAL_ID:
			return getDataTypeField_3361Text(view);
		case DateField5EditPart.VISUAL_ID:
			return getDateField_3362Text(view);
		case StaticUnitEditPart.VISUAL_ID:
			return getStaticUnit_3363Text(view);
		case UpdateUnitEditPart.VISUAL_ID:
			return getUpdateUnit_3364Text(view);
		case UnitElement19EditPart.VISUAL_ID:
			return getUnitElement_3365Text(view);
		case UnitAssociation16EditPart.VISUAL_ID:
			return getUnitAssociation_3366Text(view);
		case IndexUnit8EditPart.VISUAL_ID:
			return getIndexUnit_3367Text(view);
		case UnitElement20EditPart.VISUAL_ID:
			return getUnitElement_3368Text(view);
		case UnitAssociation17EditPart.VISUAL_ID:
			return getUnitAssociation_3369Text(view);
		case SelectAction8EditPart.VISUAL_ID:
			return getSelectAction_3370Text(view);
		case DeleteAction4EditPart.VISUAL_ID:
			return getDeleteAction_3371Text(view);
		case DataTypeField6EditPart.VISUAL_ID:
			return getDataTypeField_3372Text(view);
		case DateField6EditPart.VISUAL_ID:
			return getDateField_3373Text(view);
		case ImageIndexUnit2EditPart.VISUAL_ID:
			return getImageIndexUnit_3374Text(view);
		case SelectAction9EditPart.VISUAL_ID:
			return getSelectAction_3375Text(view);
		case DeleteAction5EditPart.VISUAL_ID:
			return getDeleteAction_3376Text(view);
		case FeatureSupportAction3EditPart.VISUAL_ID:
			return getFeatureSupportAction_3377Text(view);
		case SliderUnitEditPart.VISUAL_ID:
			return getSliderUnit_3378Text(view);
		case GalleryUnitEditPart.VISUAL_ID:
			return getGalleryUnit_3379Text(view);
		case ActionMenuEntryEditPart.VISUAL_ID:
			return getActionMenuEntry_3380Text(view);
		case EditStaticTextMenuEntryEditPart.VISUAL_ID:
			return getEditStaticTextMenuEntry_3381Text(view);
		case LocalAuthenticationSystemEditPart.VISUAL_ID:
			return getLocalAuthenticationSystem_3382Text(view);
		case CasAuthenticationEditPart.VISUAL_ID:
			return getCasAuthentication_3383Text(view);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getAssociationWithoutContainment_4005Text(view);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getAssociationWithContainment_4006Text(view);
		case ViewAssociationEditPart.VISUAL_ID:
			return getViewAssociation_4007Text(view);
		case PageLinkEditPart.VISUAL_ID:
			return getPageLink_4008Text(view);
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
	private String getDataType_2013Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataType_2013,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5282); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnumerationType_2014Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.EnumerationType_2014,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(EnumerationTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5284); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntity_2015Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.Entity_2015,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(EntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5292); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getView_2016Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.View_2016,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ViewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5296); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getService_2017Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.Service_2017,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ServiceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5299); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDynamicMenu_2018Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DynamicMenu_2018,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DynamicMenuNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5300); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPage_2019Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.Page_2019,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(PageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5392); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStaticMenu_2020Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.StaticMenu_2020,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(StaticMenuNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5395); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnumerationLiteral_3273Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.EnumerationLiteral_3273,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(EnumerationLiteralNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5283); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataTypeAttribute_3274Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataTypeAttribute_3274,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5285); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDateAttribute_3275Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DateAttribute_3275,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DateAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5286); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUrlAttribute_3276Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UrlAttribute_3276,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UrlAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5287); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFileAttribute_3277Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.FileAttribute_3277,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(FileAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5288); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImageAttribute_3278Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.ImageAttribute_3278,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ImageAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5289); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLocationAttribute_3279Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.LocationAttribute_3279,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(LocationAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5290); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModelLabel_3280Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.ModelLabel_3280,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ModelLabelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5291); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModelLabel_3281Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.ModelLabel_3281,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ModelLabelName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5293); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEncapsulatedAttribute_3282Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.EncapsulatedAttribute_3282,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(EncapsulatedAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5294); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEncapsulatedAssociation_3283Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.EncapsulatedAssociation_3283,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(EncapsulatedAssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5295); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelection_3284Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.Selection_3284,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5297); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBusinessOperation_3285Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.BusinessOperation_3285,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(BusinessOperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5298); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCreateUnit_3286Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.CreateUnit_3286,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(CreateUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5305); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3287Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3287,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5301); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3288Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3288,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5302); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataTypeField_3289Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataTypeField_3289,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeFieldNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5303); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDateField_3290Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DateField_3290,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DateFieldNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5304); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCreateUpdateUnit_3291Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.CreateUpdateUnit_3291,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(CreateUpdateUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5312); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3292Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3292,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5306); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3293Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3293,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5309); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCreateUpdateUnit_3294Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.CreateUpdateUnit_3294,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(CreateUpdateUnitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5308); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3295Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3295,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5307); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataTypeField_3296Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataTypeField_3296,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeFieldName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5310); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDateField_3297Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DateField_3297,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DateFieldName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5311); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCreateSitemapUnit_3298Text(View view) {
		CreateSitemapUnit domainModelElement = (CreateSitemapUnit) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3298); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDetailsUnit_3299Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DetailsUnit_3299,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DetailsUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5353); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3300Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3300,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5314); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelectAction_3301Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3301,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5313); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3302Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3302,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5349); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDetailsUnit_3303Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DetailsUnit_3303,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DetailsUnitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5321); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3304Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3304,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5315); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3305Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3305,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5320); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDetailsUnit_3306Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DetailsUnit_3306,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DetailsUnitName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5317); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3307Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3307,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5316); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndexUnit_3308Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3308,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5319); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3309Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3309,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5318); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndexUnit_3310Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3310,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5344); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3311Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3311,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5322); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3312Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3312,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5341); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDetailsUnit_3313Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DetailsUnit_3313,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DetailsUnitName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5331); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3314Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3314,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5323); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3315Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3315,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5330); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDetailsUnit_3316Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DetailsUnit_3316,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DetailsUnitName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5326); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3317Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3317,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5324); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3318Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3318,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5325); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndexUnit_3319Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3319,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5329); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3320Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3320,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5327); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3321Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3321,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5328); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndexUnit_3322Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3322,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5340); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3323Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3323,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5332); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3324Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3324,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5339); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDetailsUnit_3325Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DetailsUnit_3325,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DetailsUnitName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5335); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3326Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3326,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5333); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3327Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3327,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5334); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndexUnit_3328Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3328,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5338); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3329Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3329,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5336); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3330Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3330,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5337); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelectAction_3331Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3331,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5342); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDeleteAction_3332Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DeleteAction_3332,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DeleteActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5343); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImageIndexUnit_3333Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.ImageIndexUnit_3333,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ImageIndexUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5347); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelectAction_3334Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3334,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5345); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDeleteAction_3335Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DeleteAction_3335,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DeleteActionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5346); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFeatureSupportAction_3336Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.FeatureSupportAction_3336,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(FeatureSupportActionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3336); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelectAction_3337Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3337,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5348); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataTypeField_3338Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataTypeField_3338,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeFieldName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5350); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDateField_3339Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DateField_3339,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DateFieldName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5351); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitSupportAction_3340Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitSupportAction_3340,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitSupportActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5352); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndexUnit_3341Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3341,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5369); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3342Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3342,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName15EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5355); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelectAction_3343Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3343,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5354); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3344Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3344,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5363); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDetailsUnit_3345Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DetailsUnit_3345,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DetailsUnitName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5358); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3346Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3346,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName16EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5356); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3347Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3347,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5357); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndexUnit_3348Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3348,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5361); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3349Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3349,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName17EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5359); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3350Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3350,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5360); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelectAction_3351Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3351,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5362); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataTypeField_3352Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataTypeField_3352,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeFieldName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5364); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDateField_3353Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DateField_3353,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DateFieldName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5365); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelectAction_3354Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3354,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5366); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDeleteAction_3355Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DeleteAction_3355,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DeleteActionName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5367); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFeatureSupportAction_3356Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.FeatureSupportAction_3356,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(FeatureSupportActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5368); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMapUnit_3357Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.MapUnit_3357,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(MapUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5370); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSearchUnit_3358Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SearchUnit_3358,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SearchUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5375); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3359Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3359,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName18EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5371); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3360Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3360,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName15EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5372); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataTypeField_3361Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataTypeField_3361,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeFieldName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5373); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDateField_3362Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DateField_3362,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DateFieldName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5374); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStaticUnit_3363Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.StaticUnit_3363,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(StaticUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5376); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUpdateUnit_3364Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UpdateUnit_3364,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UpdateUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5386); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3365Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3365,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName19EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5377); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3366Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3366,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName16EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5383); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndexUnit_3367Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.IndexUnit_3367,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(IndexUnitName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5382); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitElement_3368Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitElement_3368,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitElementName20EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5378); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnitAssociation_3369Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.UnitAssociation_3369,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(UnitAssociationName17EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5379); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelectAction_3370Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3370,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5380); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDeleteAction_3371Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DeleteAction_3371,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DeleteActionName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5381); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataTypeField_3372Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DataTypeField_3372,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DataTypeFieldName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5384); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDateField_3373Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DateField_3373,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DateFieldName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5385); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImageIndexUnit_3374Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.ImageIndexUnit_3374,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ImageIndexUnitName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5389); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelectAction_3375Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SelectAction_3375,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SelectActionName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5387); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDeleteAction_3376Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.DeleteAction_3376,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(DeleteActionName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5388); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFeatureSupportAction_3377Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.FeatureSupportAction_3377,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(FeatureSupportAction3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3377); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSliderUnit_3378Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.SliderUnit_3378,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(SliderUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5390); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGalleryUnit_3379Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.GalleryUnit_3379,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(GalleryUnitNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5391); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActionMenuEntry_3380Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.ActionMenuEntry_3380,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(ActionMenuEntryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5393); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEditStaticTextMenuEntry_3381Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.EditStaticTextMenuEntry_3381,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(EditStaticTextMenuEntryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5394); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLocalAuthenticationSystem_3382Text(View view) {
		LocalAuthenticationSystem domainModelElement = (LocalAuthenticationSystem) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLoginLabel();
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3382); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCasAuthentication_3383Text(View view) {
		CasAuthentication domainModelElement = (CasAuthentication) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLoginLabel();
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3383); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssociationWithoutContainment_4005Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.AssociationWithoutContainment_4005,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(AssociationWithoutContainmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssociationWithContainment_4006Text(View view) {
		IParser parser = WebsiteParserProvider.getParser(WebsiteElementTypes.AssociationWithContainment_4006,
				view.getElement() != null ? view.getElement() : view,
				WebsiteVisualIDRegistry.getType(AssociationWithContainmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getViewAssociation_4007Text(View view) {
		ViewAssociation domainModelElement = (ViewAssociation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WebsiteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPageLink_4008Text(View view) {
		return ""; //$NON-NLS-1$
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
