
package uk.ac.man.cs.mdsd.webgen.webpage.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteContainer.add(createCreateUnit2CreationTool());
		paletteContainer.add(createCreateUpdateUnit3CreationTool());
		paletteContainer.add(createDetailsUnit4CreationTool());
		paletteContainer.add(createGalleryUnit5CreationTool());
		paletteContainer.add(createImageIndexUnit6CreationTool());
		paletteContainer.add(createIndexUnit7CreationTool());
		paletteContainer.add(createMapUnit8CreationTool());
		paletteContainer.add(createSearchUnit9CreationTool());
		paletteContainer.add(createSliderUnit10CreationTool());
		paletteContainer.add(createStaticUnit11CreationTool());
		paletteContainer.add(createUpdateUnit12CreationTool());
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
	private ToolEntry createCreateUnit2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CreateUnit2CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.CreateUnit_3001));
		entry.setId("createCreateUnit2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.CreateUnit_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCreateUpdateUnit3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CreateUpdateUnit3CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.CreateUpdateUnit_3002));
		entry.setId("createCreateUpdateUnit3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.CreateUpdateUnit_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDetailsUnit4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DetailsUnit4CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.DetailsUnit_3003));
		entry.setId("createDetailsUnit4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.DetailsUnit_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGalleryUnit5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GalleryUnit5CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.GalleryUnit_3004));
		entry.setId("createGalleryUnit5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.GalleryUnit_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImageIndexUnit6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ImageIndexUnit6CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.ImageIndexUnit_3005));
		entry.setId("createImageIndexUnit6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.ImageIndexUnit_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndexUnit7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IndexUnit7CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.IndexUnit_3006));
		entry.setId("createIndexUnit7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.IndexUnit_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMapUnit8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MapUnit8CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.MapUnit_3007));
		entry.setId("createMapUnit8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.MapUnit_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSearchUnit9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SearchUnit9CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.SearchUnit_3008));
		entry.setId("createSearchUnit9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.SearchUnit_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSliderUnit10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SliderUnit10CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.SliderUnit_3009));
		entry.setId("createSliderUnit10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.SliderUnit_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStaticUnit11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StaticUnit11CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.StaticUnit_3010));
		entry.setId("createStaticUnit11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.StaticUnit_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUpdateUnit12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UpdateUnit12CreationTool_title, null,
				Collections.singletonList(WebuiElementTypes.UpdateUnit_3011));
		entry.setId("createUpdateUnit12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebuiElementTypes.getImageDescriptor(WebuiElementTypes.UpdateUnit_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
