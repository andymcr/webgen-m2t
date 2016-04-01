package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DataTypeAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DateAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.FileAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ImageAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.LocationAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UrlAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class EntityAttributeCompartmentItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntityAttributeCompartmentItemSemanticEditPolicy() {
		super(WebsiteElementTypes.Entity_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.DataTypeAttribute_3252 == req.getElementType()) {
			return getGEFWrapper(new DataTypeAttributeCreateCommand(req));
		}
		if (WebsiteElementTypes.DateAttribute_3253 == req.getElementType()) {
			return getGEFWrapper(new DateAttributeCreateCommand(req));
		}
		if (WebsiteElementTypes.UrlAttribute_3254 == req.getElementType()) {
			return getGEFWrapper(new UrlAttributeCreateCommand(req));
		}
		if (WebsiteElementTypes.FileAttribute_3255 == req.getElementType()) {
			return getGEFWrapper(new FileAttributeCreateCommand(req));
		}
		if (WebsiteElementTypes.ImageAttribute_3256 == req.getElementType()) {
			return getGEFWrapper(new ImageAttributeCreateCommand(req));
		}
		if (WebsiteElementTypes.LocationAttribute_3257 == req.getElementType()) {
			return getGEFWrapper(new LocationAttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
