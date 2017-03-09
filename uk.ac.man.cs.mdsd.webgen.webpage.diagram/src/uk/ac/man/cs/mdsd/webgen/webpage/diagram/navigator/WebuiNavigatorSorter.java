package uk.ac.man.cs.mdsd.webgen.webpage.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry;

/**
 * @generated
 */
public class WebuiNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7014;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof WebuiNavigatorItem) {
			WebuiNavigatorItem item = (WebuiNavigatorItem) element;
			return WebuiVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
