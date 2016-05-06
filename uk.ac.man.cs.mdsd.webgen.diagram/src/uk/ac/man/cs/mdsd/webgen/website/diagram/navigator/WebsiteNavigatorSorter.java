package uk.ac.man.cs.mdsd.webgen.website.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry;

/**
 * @generated
 */
public class WebsiteNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7135;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof WebsiteNavigatorItem) {
			WebsiteNavigatorItem item = (WebsiteNavigatorItem) element;
			return WebsiteVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
