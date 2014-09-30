package uk.ac.man.cs.mdsd.webgen.website.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.WebGenModelEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.WebsiteEditPartFactory;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry;

/**
 * @generated
 */
public class WebsiteEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public WebsiteEditPartProvider() {
		super(new WebsiteEditPartFactory(),
				WebsiteVisualIDRegistry.TYPED_INSTANCE,
				WebGenModelEditPart.MODEL_ID);
	}

}
