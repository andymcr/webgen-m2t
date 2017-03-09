
package uk.ac.man.cs.mdsd.webgen.webpage.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;

/**
 * @generated
 */
public class WebuiPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
		paletteRoot.add(createUnits2Group());
		paletteRoot.add(createProperties3Group());
	}

	/**
	* Creates "Default" palette tool group
	* @generated
	*/
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Default1Group_title);
		paletteContainer.setId("createDefault1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Default1Group_desc);
		paletteContainer.add(createPage1CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Units" palette tool group
	* @generated
	*/
	private PaletteContainer createUnits2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Units2Group_title);
		paletteContainer.setId("createUnits2Group"); //$NON-NLS-1$
		paletteContainer.add(createCreateUnit1CreationTool());
		paletteContainer.add(createCreateUpdateUnit2CreationTool());
		paletteContainer.add(createDetailsUnit3CreationTool());
		paletteContainer.add(createGalleryUnit4CreationTool());
		paletteContainer.add(createImageIndexUnit5CreationTool());
		paletteContainer.add(createIndexUnit6CreationTool());
		paletteContainer.add(createMapUnit7CreationTool());
		paletteContainer.add(createSearchUnit8CreationTool());
		paletteContainer.add(createSliderUnit9CreationTool());
		paletteContainer.add(createStaticUnit10CreationTool());
		paletteContainer.add(createUpdateUnit11CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Properties" palette tool group
	* @generated
	*/
	private PaletteContainer createProperties3Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Properties3Group_title);
		paletteContainer.setId("createProperties3Group"); //$NON-NLS-1$
		paletteContainer.add(createUnitAssociation1CreationTool());
		paletteContainer.add(createUnitAttribute2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createPage1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Page1CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.Page_2001));
		entry.setId("createPage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.Page_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCreateUnit1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CreateUnit1CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.CreateUnit_3001));
		entry.setId("createCreateUnit1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.CreateUnit_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCreateUpdateUnit2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CreateUpdateUnit2CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.CreateUpdateUnit_3002));
		entry.setId("createCreateUpdateUnit2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.CreateUpdateUnit_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDetailsUnit3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DetailsUnit3CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.DetailsUnit_3003));
		entry.setId("createDetailsUnit3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.DetailsUnit_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGalleryUnit4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GalleryUnit4CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.GalleryUnit_3004));
		entry.setId("createGalleryUnit4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.GalleryUnit_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImageIndexUnit5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ImageIndexUnit5CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.ImageIndexUnit_3005));
		entry.setId("createImageIndexUnit5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.ImageIndexUnit_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndexUnit6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IndexUnit6CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.IndexUnit_3006));
		entry.setId("createIndexUnit6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.IndexUnit_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMapUnit7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MapUnit7CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.MapUnit_3007));
		entry.setId("createMapUnit7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.MapUnit_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSearchUnit8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SearchUnit8CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.SearchUnit_3008));
		entry.setId("createSearchUnit8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.SearchUnit_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSliderUnit9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SliderUnit9CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.SliderUnit_3009));
		entry.setId("createSliderUnit9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.SliderUnit_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStaticUnit10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StaticUnit10CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.StaticUnit_3010));
		entry.setId("createStaticUnit10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.StaticUnit_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUpdateUnit11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UpdateUnit11CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.UpdateUnit_3011));
		entry.setId("createUpdateUnit11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.UpdateUnit_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUnitAssociation1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(WebuiElementTypes.UnitAssociation_3012);
		types.add(WebuiElementTypes.UnitAssociation_3014);
		types.add(WebuiElementTypes.UnitAssociation_3016);
		types.add(WebuiElementTypes.UnitAssociation_3018);
		types.add(WebuiElementTypes.UnitAssociation_3020);
		types.add(WebuiElementTypes.UnitAssociation_3022);
		types.add(WebuiElementTypes.UnitAssociation_3024);
		types.add(WebuiElementTypes.UnitAssociation_3026);
		types.add(WebuiElementTypes.UnitAssociation_3028);
		types.add(WebuiElementTypes.UnitAssociation_3030);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UnitAssociation1CreationTool_title, null, types);
		entry.setId("createUnitAssociation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.UnitAssociation_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUnitAttribute2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(WebuiElementTypes.UnitElement_3013);
		types.add(WebuiElementTypes.UnitElement_3015);
		types.add(WebuiElementTypes.UnitElement_3017);
		types.add(WebuiElementTypes.UnitElement_3019);
		types.add(WebuiElementTypes.UnitElement_3021);
		types.add(WebuiElementTypes.UnitElement_3023);
		types.add(WebuiElementTypes.UnitElement_3025);
		types.add(WebuiElementTypes.UnitElement_3027);
		types.add(WebuiElementTypes.UnitElement_3029);
		types.add(WebuiElementTypes.UnitElement_3031);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UnitAttribute2CreationTool_title, null, types);
		entry.setId("createUnitAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.UnitElement_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
