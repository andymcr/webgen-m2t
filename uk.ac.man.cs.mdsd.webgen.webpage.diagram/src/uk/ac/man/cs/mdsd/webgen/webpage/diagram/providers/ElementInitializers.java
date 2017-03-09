package uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = WebuiDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			WebuiDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
