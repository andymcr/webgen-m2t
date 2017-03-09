package uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.WebUIEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.WebuiEditPartFactory;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry;

/**
 * @generated
 */
public class WebuiEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public WebuiEditPartProvider() {
		super(new WebuiEditPartFactory(), WebuiVisualIDRegistry.TYPED_INSTANCE, WebUIEditPart.MODEL_ID);
	}

}
