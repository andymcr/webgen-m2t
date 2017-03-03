package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DataTypeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DynamicMenuCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.EntityCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.EnumerationTypeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.PageCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ServiceCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.StaticMenuCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.ViewCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.WebsitePropertiesCreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class WebGenModelItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WebGenModelItemSemanticEditPolicy() {
		super(WebsiteElementTypes.WebGenModel_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.WebsiteProperties_2001 == req.getElementType()) {
			return getGEFWrapper(new WebsitePropertiesCreateCommand(req));
		}
		if (WebsiteElementTypes.DataType_2013 == req.getElementType()) {
			return getGEFWrapper(new DataTypeCreateCommand(req));
		}
		if (WebsiteElementTypes.EnumerationType_2014 == req.getElementType()) {
			return getGEFWrapper(new EnumerationTypeCreateCommand(req));
		}
		if (WebsiteElementTypes.Entity_2015 == req.getElementType()) {
			return getGEFWrapper(new EntityCreateCommand(req));
		}
		if (WebsiteElementTypes.View_2016 == req.getElementType()) {
			return getGEFWrapper(new ViewCreateCommand(req));
		}
		if (WebsiteElementTypes.Service_2017 == req.getElementType()) {
			return getGEFWrapper(new ServiceCreateCommand(req));
		}
		if (WebsiteElementTypes.DynamicMenu_2018 == req.getElementType()) {
			return getGEFWrapper(new DynamicMenuCreateCommand(req));
		}
		if (WebsiteElementTypes.StaticMenu_2020 == req.getElementType()) {
			return getGEFWrapper(new StaticMenuCreateCommand(req));
		}
		if (WebsiteElementTypes.Page_2019 == req.getElementType()) {
			return getGEFWrapper(new PageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
