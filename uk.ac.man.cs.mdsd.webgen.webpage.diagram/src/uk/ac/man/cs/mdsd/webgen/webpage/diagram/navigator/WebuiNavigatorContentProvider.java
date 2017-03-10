package uk.ac.man.cs.mdsd.webgen.webpage.diagram.navigator;

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

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.CreateUpdateUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.DetailsUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.DetailsUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.GalleryUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.GalleryUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.ImageIndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.ImageIndexUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.IndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.IndexUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.MapUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.MapUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageLinkEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.PageUnitCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SearchUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SearchUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SliderUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.SliderUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.StaticUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation10EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation2EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation3EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation4EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation5EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation6EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation7EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation8EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociation9EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitAssociationEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement10EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement2EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement3EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement4EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement5EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement6EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement7EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement8EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElement9EditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UnitElementEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.UpdateUnitFieldCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.edit.parts.WebUIEditPart;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.Messages;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.part.WebuiVisualIDRegistry;

/**
 * @generated
 */
public class WebuiNavigatorContentProvider implements ICommonContentProvider {

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
	public WebuiNavigatorContentProvider() {
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
			ArrayList<WebuiNavigatorItem> result = new ArrayList<WebuiNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, WebUIEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof WebuiNavigatorGroup) {
			WebuiNavigatorGroup group = (WebuiNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof WebuiNavigatorItem) {
			WebuiNavigatorItem navigatorItem = (WebuiNavigatorItem) parentElement;
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
		switch (WebuiVisualIDRegistry.getVisualID(view)) {

		case WebUIEditPart.VISUAL_ID: {
			LinkedList<WebuiAbstractNavigatorItem> result = new LinkedList<WebuiAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			WebuiNavigatorGroup links = new WebuiNavigatorGroup(Messages.NavigatorGroupName_WebUI_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case PageEditPart.VISUAL_ID: {
			LinkedList<WebuiAbstractNavigatorItem> result = new LinkedList<WebuiAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebuiNavigatorGroup incominglinks = new WebuiNavigatorGroup(
					Messages.NavigatorGroupName_Page_2001_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			WebuiNavigatorGroup outgoinglinks = new WebuiNavigatorGroup(
					Messages.NavigatorGroupName_Page_2001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(CreateUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(CreateUpdateUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(DetailsUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(GalleryUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(ImageIndexUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(IndexUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(MapUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(SearchUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(SliderUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(StaticUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UpdateUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CreateUnitEditPart.VISUAL_ID: {
			LinkedList<WebuiAbstractNavigatorItem> result = new LinkedList<WebuiAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(CreateUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitAssociationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(CreateUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitElementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case CreateUpdateUnitEditPart.VISUAL_ID: {
			LinkedList<WebuiAbstractNavigatorItem> result = new LinkedList<WebuiAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(CreateUpdateUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitAssociation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(CreateUpdateUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitElement2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case DetailsUnitEditPart.VISUAL_ID: {
			LinkedList<WebuiAbstractNavigatorItem> result = new LinkedList<WebuiAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(DetailsUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitAssociation3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(DetailsUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitElement3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GalleryUnitEditPart.VISUAL_ID: {
			LinkedList<WebuiAbstractNavigatorItem> result = new LinkedList<WebuiAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(GalleryUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitAssociation4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(GalleryUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitElement4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ImageIndexUnitEditPart.VISUAL_ID: {
			LinkedList<WebuiAbstractNavigatorItem> result = new LinkedList<WebuiAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(ImageIndexUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitAssociation5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(ImageIndexUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitElement5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case IndexUnitEditPart.VISUAL_ID: {
			LinkedList<WebuiAbstractNavigatorItem> result = new LinkedList<WebuiAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(IndexUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitAssociation6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(IndexUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitElement6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case MapUnitEditPart.VISUAL_ID: {
			LinkedList<WebuiAbstractNavigatorItem> result = new LinkedList<WebuiAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(MapUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitAssociation7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(MapUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitElement7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case SearchUnitEditPart.VISUAL_ID: {
			LinkedList<WebuiAbstractNavigatorItem> result = new LinkedList<WebuiAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(SearchUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitAssociation8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(SearchUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitElement8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case SliderUnitEditPart.VISUAL_ID: {
			LinkedList<WebuiAbstractNavigatorItem> result = new LinkedList<WebuiAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(SliderUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitAssociation9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(SliderUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitElement9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UpdateUnitEditPart.VISUAL_ID: {
			LinkedList<WebuiAbstractNavigatorItem> result = new LinkedList<WebuiAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(UpdateUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitAssociation10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(UpdateUnitFieldCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebuiVisualIDRegistry.getType(UnitElement10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case PageLinkEditPart.VISUAL_ID: {
			LinkedList<WebuiAbstractNavigatorItem> result = new LinkedList<WebuiAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WebuiNavigatorGroup target = new WebuiNavigatorGroup(Messages.NavigatorGroupName_PageLink_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebuiNavigatorGroup source = new WebuiNavigatorGroup(Messages.NavigatorGroupName_PageLink_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WebuiVisualIDRegistry.getType(PageEditPart.VISUAL_ID));
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
		return WebUIEditPart.MODEL_ID.equals(WebuiVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<WebuiNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<WebuiNavigatorItem> result = new ArrayList<WebuiNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new WebuiNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof WebuiAbstractNavigatorItem) {
			WebuiAbstractNavigatorItem abstractNavigatorItem = (WebuiAbstractNavigatorItem) element;
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
