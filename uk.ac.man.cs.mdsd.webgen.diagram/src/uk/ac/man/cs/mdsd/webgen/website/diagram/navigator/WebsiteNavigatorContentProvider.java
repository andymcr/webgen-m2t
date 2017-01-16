package uk.ac.man.cs.mdsd.webgen.website.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.*;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.Messages;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry;

/**
 * @generated
 */
public class WebsiteNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public WebsiteNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<WebsiteNavigatorItem> result = new ArrayList<WebsiteNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, WebGenModelEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof WebsiteNavigatorGroup) {
			WebsiteNavigatorGroup group = (WebsiteNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof WebsiteNavigatorItem) {
			WebsiteNavigatorItem navigatorItem = (WebsiteNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (WebsiteVisualIDRegistry.getVisualID(view)) {

		case WebGenModelEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			WebsiteNavigatorGroup links = new WebsiteNavigatorGroup(Messages.NavigatorGroupName_WebGenModel_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(WebsitePropertiesEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DynamicMenuEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EnumerationTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(StaticMenuEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ServiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(AssociationWithoutContainmentEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(AssociationWithContainmentEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ViewAssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case WebsitePropertiesEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(WebsitePropertiesAuthenticationCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(CasAuthenticationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(WebsitePropertiesAuthenticationCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(LocalAuthenticationSystemEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case EntityEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebsiteNavigatorGroup incominglinks = new WebsiteNavigatorGroup(
					Messages.NavigatorGroupName_Entity_2003_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WebsiteNavigatorGroup outgoinglinks = new WebsiteNavigatorGroup(
					Messages.NavigatorGroupName_Entity_2003_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EntityAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DataTypeAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EntityAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DateAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EntityAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UrlAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EntityAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(FileAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EntityAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(ImageAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EntityAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(LocationAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EntityModelLabelsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(ModelLabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(AssociationWithoutContainmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(AssociationWithoutContainmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(AssociationWithContainmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(AssociationWithContainmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ServiceEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ServiceFeaturesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(SelectionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ServiceOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(BusinessOperationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case PageEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebsiteNavigatorGroup incominglinks = new WebsiteNavigatorGroup(
					Messages.NavigatorGroupName_Page_2005_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WebsiteNavigatorGroup outgoinglinks = new WebsiteNavigatorGroup(
					Messages.NavigatorGroupName_Page_2005_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(CreateUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(CreateUpdateUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(CreateSitemapUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DetailsUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(IndexUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(MapUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(SearchUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(StaticUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UpdateUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(ImageIndexUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(SliderUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageInterfaceUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(GalleryUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EnumerationTypeEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EnumerationTypeEnumerationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case StaticMenuEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(StaticMenuIncludedFeaturesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(ActionMenuEntryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(StaticMenuIncludedFeaturesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(EditStaticTextMenuEntryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ViewEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebsiteNavigatorGroup outgoinglinks = new WebsiteNavigatorGroup(
					Messages.NavigatorGroupName_View_2010_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ViewModelLabelsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(ModelLabel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ViewAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(EncapsulatedAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ViewAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(EncapsulatedAssociationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ViewAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CreateUnitEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(CreateUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(CreateUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(CreateUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DataTypeFieldEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(CreateUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DateFieldEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case CreateUpdateUnitEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(CreateUpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(CreateUpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(CreateUpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DataTypeField2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(CreateUpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DateField2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case DetailsUnitEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DataTypeField3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DateField3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitSupportActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case IndexUnitEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case SearchUnitEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(SearchUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement18EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(SearchUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation15EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(SearchUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DataTypeField5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(SearchUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DateField5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UpdateUnitEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement19EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation16EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DataTypeField6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UpdateUnitUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DateField6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case DetailsUnit2EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case DetailsUnit3EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case IndexUnit2EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitActionCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(SelectAction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitActionCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DeleteActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case DetailsUnit4EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case IndexUnit3EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case IndexUnit4EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case DetailsUnit5EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case DetailsUnit6EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case IndexUnit5EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case IndexUnit6EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement15EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DataTypeField4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DateField4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(SelectAction7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DeleteAction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(FeatureSupportAction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case IndexUnit7EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement17EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UnitAssociation2EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(CreateUpdateUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UnitAssociation3EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DetailsUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(IndexUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(ImageIndexUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(SelectAction4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UnitElement4EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitElementActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(SelectActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UnitAssociation4EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DetailsUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(IndexUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UnitAssociation5EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DetailsUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(IndexUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UnitAssociation6EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DetailsUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(IndexUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UnitAssociation9EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DetailsUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(IndexUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UnitAssociation12EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DetailsUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(IndexUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationActionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(SelectAction6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UnitElement15EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitElementActionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(SelectAction5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UnitAssociation16EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(UnitAssociationInterfaceUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(IndexUnit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case DetailsUnit7EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement16EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(DetailsUnitUnitFieldCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case IndexUnit8EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement20EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitUnitFieldCompartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitAssociation17EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitActionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(SelectAction8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(IndexUnitActionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DeleteAction4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case CreateUpdateUnit2EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(CreateUpdateUnitUnitFieldCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(UnitElement3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case EncapsulatedAssociationEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebsiteNavigatorGroup incominglinks = new WebsiteNavigatorGroup(
					Messages.NavigatorGroupName_EncapsulatedAssociation_3259_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ViewAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ImageIndexUnitEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ImageIndexUnitActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(SelectAction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ImageIndexUnitActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DeleteAction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ImageIndexUnitActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(FeatureSupportActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ImageIndexUnit2EditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ImageIndexUnitActionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(SelectAction9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ImageIndexUnitActionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(DeleteAction5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ImageIndexUnitActionCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebsiteVisualIDRegistry.getType(FeatureSupportAction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AssociationWithoutContainmentEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WebsiteNavigatorGroup target = new WebsiteNavigatorGroup(
					Messages.NavigatorGroupName_AssociationWithoutContainment_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebsiteNavigatorGroup source = new WebsiteNavigatorGroup(
					Messages.NavigatorGroupName_AssociationWithoutContainment_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AssociationWithContainmentEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WebsiteNavigatorGroup target = new WebsiteNavigatorGroup(
					Messages.NavigatorGroupName_AssociationWithContainment_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebsiteNavigatorGroup source = new WebsiteNavigatorGroup(
					Messages.NavigatorGroupName_AssociationWithContainment_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PageLinkEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WebsiteNavigatorGroup target = new WebsiteNavigatorGroup(Messages.NavigatorGroupName_PageLink_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebsiteNavigatorGroup source = new WebsiteNavigatorGroup(Messages.NavigatorGroupName_PageLink_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(PageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ViewAssociationEditPart.VISUAL_ID: {
			LinkedList<WebsiteAbstractNavigatorItem> result = new LinkedList<WebsiteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WebsiteNavigatorGroup target = new WebsiteNavigatorGroup(
					Messages.NavigatorGroupName_ViewAssociation_4004_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WebsiteNavigatorGroup source = new WebsiteNavigatorGroup(
					Messages.NavigatorGroupName_ViewAssociation_4004_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(EncapsulatedAssociationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WebsiteVisualIDRegistry.getType(ViewEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WebGenModelEditPart.MODEL_ID.equals(WebsiteVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<WebsiteNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<WebsiteNavigatorItem> result = new ArrayList<WebsiteNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new WebsiteNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof WebsiteAbstractNavigatorItem) {
			WebsiteAbstractNavigatorItem abstractNavigatorItem = (WebsiteAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
