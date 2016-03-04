package uk.ac.man.cs.mdsd.webgen.website.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class WebsitePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createInterface1Group());
		paletteRoot.add(createMenu2Group());
		paletteRoot.add(createUnit3Group());
		paletteRoot.add(createAction4Group());
		paletteRoot.add(createBusinessLogic5Group());
		paletteRoot.add(createAuthentication6Group());
		paletteRoot.add(createPersistence7Group());
	}

	/**
	 * Creates "Interface" palette tool group
	 * @generated
	 */
	private PaletteContainer createInterface1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Interface1Group_title);
		paletteContainer.setId("createInterface1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Interface1Group_desc);
		paletteContainer.add(createPage1CreationTool());
		paletteContainer.add(createParentpage2CreationTool());
		paletteContainer.add(createElement3CreationTool());
		paletteContainer.add(createAssociation4CreationTool());
		paletteContainer.add(createDatatypefield5CreationTool());
		paletteContainer.add(createDatefield6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Menu" palette tool group
	 * @generated
	 */
	private PaletteContainer createMenu2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Menu2Group_title);
		paletteContainer.setId("createMenu2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Menu2Group_desc);
		paletteContainer.add(createStaticMenu1CreationTool());
		paletteContainer.add(createDynamicMenu2CreationTool());
		paletteContainer.add(createFixedPageEntry3CreationTool());
		paletteContainer.add(createFixedActionEntry4CreationTool());
		paletteContainer.add(createFixedCommandEntry5CreationTool());
		paletteContainer.add(createEditStaticText6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Unit" palette tool group
	 * @generated
	 */
	private PaletteContainer createUnit3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Unit3Group_title);
		paletteContainer.setId("createUnit3Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Unit3Group_desc);
		paletteContainer.add(createStaticUnit1CreationTool());
		paletteContainer.add(createIndexUnit2CreationTool());
		paletteContainer.add(createDetailsUnit3CreationTool());
		paletteContainer.add(createCreateUnit4CreationTool());
		paletteContainer.add(createCreateUpdateUnit5CreationTool());
		paletteContainer.add(createMapUnit6CreationTool());
		paletteContainer.add(createUpdateUnit7CreationTool());
		paletteContainer.add(createSearchUnit8CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Action" palette tool group
	 * @generated
	 */
	private PaletteContainer createAction4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Action4Group_title);
		paletteContainer.setId("createAction4Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Action4Group_desc);
		paletteContainer.add(createSelectAction1CreationTool());
		paletteContainer.add(createDeleteAction2CreationTool());
		paletteContainer.add(createSupportAction3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Business Logic" palette tool group
	 * @generated
	 */
	private PaletteContainer createBusinessLogic5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.BusinessLogic5Group_title);
		paletteContainer.setId("createBusinessLogic5Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.BusinessLogic5Group_desc);
		paletteContainer.add(createService1CreationTool());
		paletteContainer.add(createModelLabel2CreationTool());
		paletteContainer.add(createSelection3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Authentication" palette tool group
	 * @generated
	 */
	private PaletteContainer createAuthentication6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Authentication6Group_title);
		paletteContainer.setId("createAuthentication6Group"); //$NON-NLS-1$
		paletteContainer.add(createLocalTable1CreationTool());
		paletteContainer.add(createLocalSystem2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Persistence" palette tool group
	 * @generated
	 */
	private PaletteContainer createPersistence7Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Persistence7Group_title);
		paletteContainer.setId("createPersistence7Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Persistence7Group_desc);
		paletteContainer.add(createDatatype1CreationTool());
		paletteContainer.add(createEnumerationtype2CreationTool());
		paletteContainer.add(createEnumerationLiteral3CreationTool());
		paletteContainer.add(createEntity4CreationTool());
		paletteContainer.add(createView5CreationTool());
		paletteContainer.add(createDataTypeAttribute6CreationTool());
		paletteContainer.add(createDateAttribute7CreationTool());
		paletteContainer.add(createFileAttribute8CreationTool());
		paletteContainer.add(createImageAttribute9CreationTool());
		paletteContainer.add(createLocationAttribute10CreationTool());
		paletteContainer.add(createUncontainedAssociation11CreationTool());
		paletteContainer.add(createContainedAssociation12CreationTool());
		paletteContainer.add(createEncapsulatedAttribute13CreationTool());
		paletteContainer.add(createEncapsulatedAssociation14CreationTool());
		paletteContainer.add(createViewAssociation15CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLocalTable1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LocalTable1CreationTool_title,
				Messages.LocalTable1CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.CasAuthentication_3055));
		entry.setId("createLocalTable1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.CasAuthentication_3055));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLocalSystem2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LocalSystem2CreationTool_title,
				Messages.LocalSystem2CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.LocalAuthenticationSystem_3029));
		entry.setId("createLocalSystem2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.LocalAuthenticationSystem_3029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPage1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Page1CreationTool_title,
				Messages.Page1CreationTool_desc, Collections.singletonList(WebsiteElementTypes.Page_2005));
		entry.setId("createPage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.Page_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParentpage2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Parentpage2CreationTool_title,
				Messages.Parentpage2CreationTool_desc, Collections.singletonList(WebsiteElementTypes.PageLink_4003));
		entry.setId("createParentpage2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.PageLink_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElement3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(21);
		types.add(WebsiteElementTypes.UnitElement_3169);
		types.add(WebsiteElementTypes.UnitElement_3171);
		types.add(WebsiteElementTypes.UnitElement_3173);
		types.add(WebsiteElementTypes.UnitElement_3175);
		types.add(WebsiteElementTypes.UnitElement_3177);
		types.add(WebsiteElementTypes.UnitElement_3178);
		types.add(WebsiteElementTypes.UnitElement_3179);
		types.add(WebsiteElementTypes.UnitElement_3181);
		types.add(WebsiteElementTypes.UnitElement_3183);
		types.add(WebsiteElementTypes.UnitElement_3185);
		types.add(WebsiteElementTypes.UnitElement_3187);
		types.add(WebsiteElementTypes.UnitElement_3189);
		types.add(WebsiteElementTypes.UnitElement_3191);
		types.add(WebsiteElementTypes.UnitElement_3193);
		types.add(WebsiteElementTypes.UnitElement_3195);
		types.add(WebsiteElementTypes.UnitElement_3197);
		types.add(WebsiteElementTypes.UnitElement_3199);
		types.add(WebsiteElementTypes.UnitElement_3215);
		types.add(WebsiteElementTypes.UnitElement_3220);
		types.add(WebsiteElementTypes.UnitElement_3250);
		types.add(WebsiteElementTypes.ServiceAttribute_3241);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Element3CreationTool_title,
				Messages.Element3CreationTool_desc, types);
		entry.setId("createElement3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.UnitElement_3169));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociation4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(18);
		types.add(WebsiteElementTypes.UnitAssociation_3170);
		types.add(WebsiteElementTypes.UnitAssociation_3172);
		types.add(WebsiteElementTypes.UnitAssociation_3174);
		types.add(WebsiteElementTypes.UnitAssociation_3176);
		types.add(WebsiteElementTypes.UnitAssociation_3180);
		types.add(WebsiteElementTypes.UnitAssociation_3182);
		types.add(WebsiteElementTypes.UnitAssociation_3184);
		types.add(WebsiteElementTypes.UnitAssociation_3186);
		types.add(WebsiteElementTypes.UnitAssociation_3188);
		types.add(WebsiteElementTypes.UnitAssociation_3190);
		types.add(WebsiteElementTypes.UnitAssociation_3192);
		types.add(WebsiteElementTypes.UnitAssociation_3194);
		types.add(WebsiteElementTypes.UnitAssociation_3196);
		types.add(WebsiteElementTypes.UnitAssociation_3198);
		types.add(WebsiteElementTypes.UnitAssociation_3200);
		types.add(WebsiteElementTypes.UnitAssociation_3216);
		types.add(WebsiteElementTypes.UnitAssociation_3221);
		types.add(WebsiteElementTypes.ServiceAssociation_3242);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Association4CreationTool_title,
				Messages.Association4CreationTool_desc, types);
		entry.setId("createAssociation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.UnitAssociation_3170));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDatatypefield5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(WebsiteElementTypes.DataTypeField_3201);
		types.add(WebsiteElementTypes.DataTypeField_3202);
		types.add(WebsiteElementTypes.DataTypeField_3203);
		types.add(WebsiteElementTypes.DataTypeField_3204);
		types.add(WebsiteElementTypes.DataTypeField_3205);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Datatypefield5CreationTool_title,
				Messages.Datatypefield5CreationTool_desc, types);
		entry.setId("createDatatypefield5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DataTypeField_3201));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDatefield6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(WebsiteElementTypes.DateField_3207);
		types.add(WebsiteElementTypes.DateField_3208);
		types.add(WebsiteElementTypes.DateField_3209);
		types.add(WebsiteElementTypes.DateField_3210);
		types.add(WebsiteElementTypes.DateField_3211);
		types.add(WebsiteElementTypes.DateField_3212);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Datefield6CreationTool_title,
				Messages.Datefield6CreationTool_desc, types);
		entry.setId("createDatefield6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DateField_3207));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStaticMenu1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StaticMenu1CreationTool_title,
				Messages.StaticMenu1CreationTool_desc, Collections.singletonList(WebsiteElementTypes.StaticMenu_2009));
		entry.setId("createStaticMenu1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.StaticMenu_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDynamicMenu2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DynamicMenu2CreationTool_title,
				Messages.DynamicMenu2CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.DynamicMenu_2008));
		entry.setId("createDynamicMenu2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DynamicMenu_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFixedPageEntry3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FixedPageEntry3CreationTool_title,
				Messages.FixedPageEntry3CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.ActionMenuEntry_3236));
		entry.setId("createFixedPageEntry3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.ActionMenuEntry_3236));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFixedActionEntry4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.FixedActionEntry4CreationTool_title,
				Messages.FixedActionEntry4CreationTool_desc, null, null) {
		};
		entry.setId("createFixedActionEntry4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFixedCommandEntry5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.FixedCommandEntry5CreationTool_title,
				Messages.FixedCommandEntry5CreationTool_desc, null, null) {
		};
		entry.setId("createFixedCommandEntry5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEditStaticText6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EditStaticText6CreationTool_title,
				Messages.EditStaticText6CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.EditStaticTextMenuEntry_3156));
		entry.setId("createEditStaticText6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.EditStaticTextMenuEntry_3156));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStaticUnit1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StaticUnit1CreationTool_title,
				Messages.StaticUnit1CreationTool_desc, Collections.singletonList(WebsiteElementTypes.StaticUnit_3110));
		entry.setId("createStaticUnit1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.StaticUnit_3110));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIndexUnit2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(8);
		types.add(WebsiteElementTypes.IndexUnit_3106);
		types.add(WebsiteElementTypes.IndexUnit_3114);
		types.add(WebsiteElementTypes.IndexUnit_3118);
		types.add(WebsiteElementTypes.IndexUnit_3120);
		types.add(WebsiteElementTypes.IndexUnit_3133);
		types.add(WebsiteElementTypes.IndexUnit_3136);
		types.add(WebsiteElementTypes.IndexUnit_3143);
		types.add(WebsiteElementTypes.IndexUnit_3222);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IndexUnit2CreationTool_title,
				Messages.IndexUnit2CreationTool_desc, types);
		entry.setId("createIndexUnit2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.IndexUnit_3106));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDetailsUnit3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(WebsiteElementTypes.DetailsUnit_3105);
		types.add(WebsiteElementTypes.DetailsUnit_3112);
		types.add(WebsiteElementTypes.DetailsUnit_3113);
		types.add(WebsiteElementTypes.DetailsUnit_3116);
		types.add(WebsiteElementTypes.DetailsUnit_3129);
		types.add(WebsiteElementTypes.DetailsUnit_3131);
		types.add(WebsiteElementTypes.DetailsUnit_3219);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DetailsUnit3CreationTool_title,
				Messages.DetailsUnit3CreationTool_desc, types);
		entry.setId("createDetailsUnit3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DetailsUnit_3105));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateUnit4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CreateUnit4CreationTool_title,
				Messages.CreateUnit4CreationTool_desc, Collections.singletonList(WebsiteElementTypes.CreateUnit_3103));
		entry.setId("createCreateUnit4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.CreateUnit_3103));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateUpdateUnit5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebsiteElementTypes.CreateUpdateUnit_3104);
		types.add(WebsiteElementTypes.CreateUpdateUnit_3249);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CreateUpdateUnit5CreationTool_title,
				Messages.CreateUpdateUnit5CreationTool_desc, types);
		entry.setId("createCreateUpdateUnit5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.CreateUpdateUnit_3104));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMapUnit6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MapUnit6CreationTool_title,
				Messages.MapUnit6CreationTool_desc, Collections.singletonList(WebsiteElementTypes.MapUnit_3228));
		entry.setId("createMapUnit6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.MapUnit_3228));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpdateUnit7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UpdateUnit7CreationTool_title,
				Messages.UpdateUnit7CreationTool_desc, Collections.singletonList(WebsiteElementTypes.UpdateUnit_3111));
		entry.setId("createUpdateUnit7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.UpdateUnit_3111));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSearchUnit8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SearchUnit8CreationTool_title,
				Messages.SearchUnit8CreationTool_desc, Collections.singletonList(WebsiteElementTypes.SearchUnit_3109));
		entry.setId("createSearchUnit8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.SearchUnit_3109));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSelectAction1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(WebsiteElementTypes.SelectAction_3102);
		types.add(WebsiteElementTypes.SelectAction_3107);
		types.add(WebsiteElementTypes.SelectAction_3126);
		types.add(WebsiteElementTypes.SelectAction_3127);
		types.add(WebsiteElementTypes.SelectAction_3128);
		types.add(WebsiteElementTypes.SelectAction_3146);
		types.add(WebsiteElementTypes.SelectAction_3153);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SelectAction1CreationTool_title,
				Messages.SelectAction1CreationTool_desc, types);
		entry.setId("createSelectAction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.SelectAction_3102));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeleteAction2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(WebsiteElementTypes.DeleteAction_3101);
		types.add(WebsiteElementTypes.DeleteAction_3147);
		types.add(WebsiteElementTypes.DeleteAction_3154);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DeleteAction2CreationTool_title,
				Messages.DeleteAction2CreationTool_desc, types);
		entry.setId("createDeleteAction2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DeleteAction_3101));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSupportAction3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebsiteElementTypes.UnitSupportAction_3232);
		types.add(WebsiteElementTypes.FeatureSupportAction_3234);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SupportAction3CreationTool_title,
				Messages.SupportAction3CreationTool_desc, types);
		entry.setId("createSupportAction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.UnitSupportAction_3232));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createService1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Service1CreationTool_title,
				Messages.Service1CreationTool_desc, Collections.singletonList(WebsiteElementTypes.Service_2004));
		entry.setId("createService1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.Service_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModelLabel2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebsiteElementTypes.ModelLabel_3247);
		types.add(WebsiteElementTypes.ModelLabel_3248);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ModelLabel2CreationTool_title,
				Messages.ModelLabel2CreationTool_desc, types);
		entry.setId("createModelLabel2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.ModelLabel_3247));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSelection3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Selection3CreationTool_title,
				Messages.Selection3CreationTool_desc, Collections.singletonList(WebsiteElementTypes.Selection_3150));
		entry.setId("createSelection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.Selection_3150));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDatatype1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebsiteElementTypes.DataType_2002);
		types.add(WebsiteElementTypes.DataTypeField_3206);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Datatype1CreationTool_title,
				Messages.Datatype1CreationTool_desc, types);
		entry.setId("createDatatype1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DataType_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumerationtype2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Enumerationtype2CreationTool_title,
				Messages.Enumerationtype2CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.EnumerationType_2006));
		entry.setId("createEnumerationtype2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.EnumerationType_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumerationLiteral3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EnumerationLiteral3CreationTool_title,
				Messages.EnumerationLiteral3CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.EnumerationLiteral_3028));
		entry.setId("createEnumerationLiteral3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.EnumerationLiteral_3028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntity4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Entity4CreationTool_title,
				Messages.Entity4CreationTool_desc, Collections.singletonList(WebsiteElementTypes.Entity_2003));
		entry.setId("createEntity4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.Entity_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createView5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.View5CreationTool_title,
				Messages.View5CreationTool_desc, Collections.singletonList(WebsiteElementTypes.View_2010));
		entry.setId("createView5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.View_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataTypeAttribute6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataTypeAttribute6CreationTool_title,
				Messages.DataTypeAttribute6CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.DataTypeAttribute_3054));
		entry.setId("createDataTypeAttribute6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DataTypeAttribute_3054));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDateAttribute7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DateAttribute7CreationTool_title,
				Messages.DateAttribute7CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.DateAttribute_3014));
		entry.setId("createDateAttribute7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DateAttribute_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFileAttribute8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FileAttribute8CreationTool_title,
				Messages.FileAttribute8CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.FileAttribute_3152));
		entry.setId("createFileAttribute8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.FileAttribute_3152));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImageAttribute9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ImageAttribute9CreationTool_title, null,
				Collections.singletonList(WebsiteElementTypes.ImageAttribute_3235));
		entry.setId("createImageAttribute9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.ImageAttribute_3235));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLocationAttribute10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LocationAttribute10CreationTool_title,
				Messages.LocationAttribute10CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.LocationAttribute_3230));
		entry.setId("createLocationAttribute10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.LocationAttribute_3230));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUncontainedAssociation11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.UncontainedAssociation11CreationTool_title,
				Messages.UncontainedAssociation11CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.AssociationWithoutContainment_4001));
		entry.setId("createUncontainedAssociation11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.AssociationWithoutContainment_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContainedAssociation12CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ContainedAssociation12CreationTool_title,
				Messages.ContainedAssociation12CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.AssociationWithContainment_4002));
		entry.setId("createContainedAssociation12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.AssociationWithContainment_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEncapsulatedAttribute13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EncapsulatedAttribute13CreationTool_title,
				Messages.EncapsulatedAttribute13CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.EncapsulatedAttribute_3243));
		entry.setId("createEncapsulatedAttribute13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.EncapsulatedAttribute_3243));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEncapsulatedAssociation14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EncapsulatedAssociation14CreationTool_title,
				Messages.EncapsulatedAssociation14CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.EncapsulatedAssociation_3244));
		entry.setId("createEncapsulatedAssociation14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.EncapsulatedAssociation_3244));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createViewAssociation15CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ViewAssociation15CreationTool_title,
				Messages.ViewAssociation15CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.ViewAssociation_4004));
		entry.setId("createViewAssociation15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.ViewAssociation_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
