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
		paletteContainer.add(createSliderUnit9CreationTool());
		paletteContainer.add(createGridUnit10CreationTool());
		paletteContainer.add(createImageGridUnit11CreationTool());
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
		paletteContainer.add(createOperation4CreationTool());
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
		paletteContainer.add(createURLAttribute8CreationTool());
		paletteContainer.add(createFileAttribute9CreationTool());
		paletteContainer.add(createImageAttribute10CreationTool());
		paletteContainer.add(createLocationAttribute11CreationTool());
		paletteContainer.add(createUncontainedAssociation12CreationTool());
		paletteContainer.add(createContainedAssociation13CreationTool());
		paletteContainer.add(createEncapsulatedAttribute14CreationTool());
		paletteContainer.add(createEncapsulatedAssociation15CreationTool());
		paletteContainer.add(createViewAssociation16CreationTool());
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
				Messages.Page1CreationTool_desc, Collections.singletonList(WebsiteElementTypes.Page_2019));
		entry.setId("createPage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.Page_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParentpage2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Parentpage2CreationTool_title,
				Messages.Parentpage2CreationTool_desc, Collections.singletonList(WebsiteElementTypes.PageLink_4008));
		entry.setId("createParentpage2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.PageLink_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElement3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(20);
		types.add(WebsiteElementTypes.UnitElement_3287);
		types.add(WebsiteElementTypes.UnitElement_3292);
		types.add(WebsiteElementTypes.UnitElement_3295);
		types.add(WebsiteElementTypes.UnitElement_3300);
		types.add(WebsiteElementTypes.UnitElement_3304);
		types.add(WebsiteElementTypes.UnitElement_3307);
		types.add(WebsiteElementTypes.UnitElement_3309);
		types.add(WebsiteElementTypes.UnitElement_3311);
		types.add(WebsiteElementTypes.UnitElement_3314);
		types.add(WebsiteElementTypes.UnitElement_3317);
		types.add(WebsiteElementTypes.UnitElement_3320);
		types.add(WebsiteElementTypes.UnitElement_3323);
		types.add(WebsiteElementTypes.UnitElement_3326);
		types.add(WebsiteElementTypes.UnitElement_3329);
		types.add(WebsiteElementTypes.UnitElement_3342);
		types.add(WebsiteElementTypes.UnitElement_3346);
		types.add(WebsiteElementTypes.UnitElement_3349);
		types.add(WebsiteElementTypes.UnitElement_3359);
		types.add(WebsiteElementTypes.UnitElement_3365);
		types.add(WebsiteElementTypes.UnitElement_3368);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Element3CreationTool_title,
				Messages.Element3CreationTool_desc, types);
		entry.setId("createElement3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.UnitElement_3287));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociation4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(17);
		types.add(WebsiteElementTypes.UnitAssociation_3288);
		types.add(WebsiteElementTypes.UnitAssociation_3293);
		types.add(WebsiteElementTypes.UnitAssociation_3302);
		types.add(WebsiteElementTypes.UnitAssociation_3305);
		types.add(WebsiteElementTypes.UnitAssociation_3312);
		types.add(WebsiteElementTypes.UnitAssociation_3315);
		types.add(WebsiteElementTypes.UnitAssociation_3318);
		types.add(WebsiteElementTypes.UnitAssociation_3321);
		types.add(WebsiteElementTypes.UnitAssociation_3324);
		types.add(WebsiteElementTypes.UnitAssociation_3327);
		types.add(WebsiteElementTypes.UnitAssociation_3330);
		types.add(WebsiteElementTypes.UnitAssociation_3344);
		types.add(WebsiteElementTypes.UnitAssociation_3347);
		types.add(WebsiteElementTypes.UnitAssociation_3350);
		types.add(WebsiteElementTypes.UnitAssociation_3360);
		types.add(WebsiteElementTypes.UnitAssociation_3366);
		types.add(WebsiteElementTypes.UnitAssociation_3369);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Association4CreationTool_title,
				Messages.Association4CreationTool_desc, types);
		entry.setId("createAssociation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.UnitAssociation_3288));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDatatypefield5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(WebsiteElementTypes.DataTypeField_3289);
		types.add(WebsiteElementTypes.DataTypeField_3296);
		types.add(WebsiteElementTypes.DataTypeField_3338);
		types.add(WebsiteElementTypes.DataTypeField_3352);
		types.add(WebsiteElementTypes.DataTypeField_3361);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Datatypefield5CreationTool_title,
				Messages.Datatypefield5CreationTool_desc, types);
		entry.setId("createDatatypefield5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DataTypeField_3289));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDatefield6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(WebsiteElementTypes.DateField_3290);
		types.add(WebsiteElementTypes.DateField_3297);
		types.add(WebsiteElementTypes.DateField_3339);
		types.add(WebsiteElementTypes.DateField_3353);
		types.add(WebsiteElementTypes.DateField_3362);
		types.add(WebsiteElementTypes.DateField_3373);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Datefield6CreationTool_title,
				Messages.Datefield6CreationTool_desc, types);
		entry.setId("createDatefield6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DateField_3290));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStaticMenu1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StaticMenu1CreationTool_title,
				Messages.StaticMenu1CreationTool_desc, Collections.singletonList(WebsiteElementTypes.StaticMenu_2020));
		entry.setId("createStaticMenu1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.StaticMenu_2020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDynamicMenu2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DynamicMenu2CreationTool_title,
				Messages.DynamicMenu2CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.DynamicMenu_2018));
		entry.setId("createDynamicMenu2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DynamicMenu_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFixedPageEntry3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FixedPageEntry3CreationTool_title,
				Messages.FixedPageEntry3CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.ActionMenuEntry_3380));
		entry.setId("createFixedPageEntry3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.ActionMenuEntry_3380));
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
				Collections.singletonList(WebsiteElementTypes.EditStaticTextMenuEntry_3381));
		entry.setId("createEditStaticText6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.EditStaticTextMenuEntry_3381));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStaticUnit1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StaticUnit1CreationTool_title,
				Messages.StaticUnit1CreationTool_desc, Collections.singletonList(WebsiteElementTypes.StaticUnit_3363));
		entry.setId("createStaticUnit1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.StaticUnit_3363));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIndexUnit2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(8);
		types.add(WebsiteElementTypes.IndexUnit_3308);
		types.add(WebsiteElementTypes.IndexUnit_3310);
		types.add(WebsiteElementTypes.IndexUnit_3319);
		types.add(WebsiteElementTypes.IndexUnit_3322);
		types.add(WebsiteElementTypes.IndexUnit_3328);
		types.add(WebsiteElementTypes.IndexUnit_3341);
		types.add(WebsiteElementTypes.IndexUnit_3348);
		types.add(WebsiteElementTypes.IndexUnit_3367);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IndexUnit2CreationTool_title,
				Messages.IndexUnit2CreationTool_desc, types);
		entry.setId("createIndexUnit2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.IndexUnit_3308));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDetailsUnit3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(WebsiteElementTypes.DetailsUnit_3299);
		types.add(WebsiteElementTypes.DetailsUnit_3303);
		types.add(WebsiteElementTypes.DetailsUnit_3306);
		types.add(WebsiteElementTypes.DetailsUnit_3313);
		types.add(WebsiteElementTypes.DetailsUnit_3316);
		types.add(WebsiteElementTypes.DetailsUnit_3325);
		types.add(WebsiteElementTypes.DetailsUnit_3345);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DetailsUnit3CreationTool_title,
				Messages.DetailsUnit3CreationTool_desc, types);
		entry.setId("createDetailsUnit3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DetailsUnit_3299));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateUnit4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CreateUnit4CreationTool_title,
				Messages.CreateUnit4CreationTool_desc, Collections.singletonList(WebsiteElementTypes.CreateUnit_3286));
		entry.setId("createCreateUnit4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.CreateUnit_3286));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateUpdateUnit5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebsiteElementTypes.CreateUpdateUnit_3291);
		types.add(WebsiteElementTypes.CreateUpdateUnit_3294);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CreateUpdateUnit5CreationTool_title,
				Messages.CreateUpdateUnit5CreationTool_desc, types);
		entry.setId("createCreateUpdateUnit5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.CreateUpdateUnit_3291));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMapUnit6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MapUnit6CreationTool_title,
				Messages.MapUnit6CreationTool_desc, Collections.singletonList(WebsiteElementTypes.MapUnit_3357));
		entry.setId("createMapUnit6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.MapUnit_3357));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpdateUnit7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UpdateUnit7CreationTool_title,
				Messages.UpdateUnit7CreationTool_desc, Collections.singletonList(WebsiteElementTypes.UpdateUnit_3364));
		entry.setId("createUpdateUnit7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.UpdateUnit_3364));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSearchUnit8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SearchUnit8CreationTool_title,
				Messages.SearchUnit8CreationTool_desc, Collections.singletonList(WebsiteElementTypes.SearchUnit_3358));
		entry.setId("createSearchUnit8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.SearchUnit_3358));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSliderUnit9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SliderUnit9CreationTool_title,
				Messages.SliderUnit9CreationTool_desc, Collections.singletonList(WebsiteElementTypes.SliderUnit_3378));
		entry.setId("createSliderUnit9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.SliderUnit_3378));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGridUnit10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GridUnit10CreationTool_title,
				Messages.GridUnit10CreationTool_desc, Collections.singletonList(WebsiteElementTypes.GalleryUnit_3379));
		entry.setId("createGridUnit10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.GalleryUnit_3379));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImageGridUnit11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebsiteElementTypes.ImageIndexUnit_3333);
		types.add(WebsiteElementTypes.ImageIndexUnit_3374);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ImageGridUnit11CreationTool_title,
				Messages.ImageGridUnit11CreationTool_desc, types);
		entry.setId("createImageGridUnit11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.ImageIndexUnit_3333));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSelectAction1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(9);
		types.add(WebsiteElementTypes.SelectAction_3301);
		types.add(WebsiteElementTypes.SelectAction_3331);
		types.add(WebsiteElementTypes.SelectAction_3334);
		types.add(WebsiteElementTypes.SelectAction_3337);
		types.add(WebsiteElementTypes.SelectAction_3343);
		types.add(WebsiteElementTypes.SelectAction_3351);
		types.add(WebsiteElementTypes.SelectAction_3354);
		types.add(WebsiteElementTypes.SelectAction_3370);
		types.add(WebsiteElementTypes.SelectAction_3375);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SelectAction1CreationTool_title,
				Messages.SelectAction1CreationTool_desc, types);
		entry.setId("createSelectAction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.SelectAction_3301));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeleteAction2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(WebsiteElementTypes.DeleteAction_3332);
		types.add(WebsiteElementTypes.DeleteAction_3335);
		types.add(WebsiteElementTypes.DeleteAction_3355);
		types.add(WebsiteElementTypes.DeleteAction_3371);
		types.add(WebsiteElementTypes.DeleteAction_3376);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DeleteAction2CreationTool_title,
				Messages.DeleteAction2CreationTool_desc, types);
		entry.setId("createDeleteAction2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DeleteAction_3332));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSupportAction3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(WebsiteElementTypes.FeatureSupportAction_3336);
		types.add(WebsiteElementTypes.UnitSupportAction_3340);
		types.add(WebsiteElementTypes.FeatureSupportAction_3356);
		types.add(WebsiteElementTypes.FeatureSupportAction_3377);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SupportAction3CreationTool_title,
				Messages.SupportAction3CreationTool_desc, types);
		entry.setId("createSupportAction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.FeatureSupportAction_3336));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createService1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Service1CreationTool_title,
				Messages.Service1CreationTool_desc, Collections.singletonList(WebsiteElementTypes.Service_2017));
		entry.setId("createService1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.Service_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModelLabel2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebsiteElementTypes.ModelLabel_3280);
		types.add(WebsiteElementTypes.ModelLabel_3281);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ModelLabel2CreationTool_title,
				Messages.ModelLabel2CreationTool_desc, types);
		entry.setId("createModelLabel2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.ModelLabel_3280));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSelection3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Selection3CreationTool_title,
				Messages.Selection3CreationTool_desc, Collections.singletonList(WebsiteElementTypes.Selection_3284));
		entry.setId("createSelection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.Selection_3284));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOperation4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Operation4CreationTool_title,
				Messages.Operation4CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.BusinessOperation_3285));
		entry.setId("createOperation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.BusinessOperation_3285));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDatatype1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebsiteElementTypes.DataType_2013);
		types.add(WebsiteElementTypes.DataTypeField_3372);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Datatype1CreationTool_title,
				Messages.Datatype1CreationTool_desc, types);
		entry.setId("createDatatype1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DataType_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumerationtype2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Enumerationtype2CreationTool_title,
				Messages.Enumerationtype2CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.EnumerationType_2014));
		entry.setId("createEnumerationtype2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.EnumerationType_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumerationLiteral3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EnumerationLiteral3CreationTool_title,
				Messages.EnumerationLiteral3CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.EnumerationLiteral_3273));
		entry.setId("createEnumerationLiteral3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.EnumerationLiteral_3273));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntity4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Entity4CreationTool_title,
				Messages.Entity4CreationTool_desc, Collections.singletonList(WebsiteElementTypes.Entity_2015));
		entry.setId("createEntity4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.Entity_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createView5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.View5CreationTool_title,
				Messages.View5CreationTool_desc, Collections.singletonList(WebsiteElementTypes.View_2016));
		entry.setId("createView5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.View_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataTypeAttribute6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataTypeAttribute6CreationTool_title,
				Messages.DataTypeAttribute6CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.DataTypeAttribute_3274));
		entry.setId("createDataTypeAttribute6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DataTypeAttribute_3274));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDateAttribute7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DateAttribute7CreationTool_title,
				Messages.DateAttribute7CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.DateAttribute_3275));
		entry.setId("createDateAttribute7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.DateAttribute_3275));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createURLAttribute8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.URLAttribute8CreationTool_title,
				Messages.URLAttribute8CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.UrlAttribute_3276));
		entry.setId("createURLAttribute8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.UrlAttribute_3276));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFileAttribute9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FileAttribute9CreationTool_title,
				Messages.FileAttribute9CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.FileAttribute_3277));
		entry.setId("createFileAttribute9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.FileAttribute_3277));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImageAttribute10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ImageAttribute10CreationTool_title, null,
				Collections.singletonList(WebsiteElementTypes.ImageAttribute_3278));
		entry.setId("createImageAttribute10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.ImageAttribute_3278));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLocationAttribute11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LocationAttribute11CreationTool_title,
				Messages.LocationAttribute11CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.LocationAttribute_3279));
		entry.setId("createLocationAttribute11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.LocationAttribute_3279));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUncontainedAssociation12CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.UncontainedAssociation12CreationTool_title,
				Messages.UncontainedAssociation12CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.AssociationWithoutContainment_4005));
		entry.setId("createUncontainedAssociation12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.AssociationWithoutContainment_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContainedAssociation13CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ContainedAssociation13CreationTool_title,
				Messages.ContainedAssociation13CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.AssociationWithContainment_4006));
		entry.setId("createContainedAssociation13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.AssociationWithContainment_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEncapsulatedAttribute14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EncapsulatedAttribute14CreationTool_title,
				Messages.EncapsulatedAttribute14CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.EncapsulatedAttribute_3282));
		entry.setId("createEncapsulatedAttribute14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.EncapsulatedAttribute_3282));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEncapsulatedAssociation15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EncapsulatedAssociation15CreationTool_title,
				Messages.EncapsulatedAssociation15CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.EncapsulatedAssociation_3283));
		entry.setId("createEncapsulatedAssociation15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.EncapsulatedAssociation_3283));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createViewAssociation16CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ViewAssociation16CreationTool_title,
				Messages.ViewAssociation16CreationTool_desc,
				Collections.singletonList(WebsiteElementTypes.ViewAssociation_4007));
		entry.setId("createViewAssociation16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebsiteElementTypes.getImageDescriptor(WebsiteElementTypes.ViewAssociation_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
