/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenOrmItemProviderAdapterFactory.java,v 1.10 2014/06/27 07:51:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import uk.ac.man.cs.mdsd.genorm.util.GenOrmAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenOrmItemProviderAdapterFactory extends GenOrmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenOrmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.genorm.GenOrmModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenOrmModelItemProvider genOrmModelItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenOrmModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenOrmModelAdapter() {
		if (genOrmModelItemProvider == null) {
			genOrmModelItemProvider = new GenOrmModelItemProvider(this);
		}

		return genOrmModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.genorm.GenCollectionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCollectionTypeItemProvider genCollectionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenCollectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenCollectionTypeAdapter() {
		if (genCollectionTypeItemProvider == null) {
			genCollectionTypeItemProvider = new GenCollectionTypeItemProvider(this);
		}

		return genCollectionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.genorm.GenDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDataTypeItemProvider genDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenDataTypeAdapter() {
		if (genDataTypeItemProvider == null) {
			genDataTypeItemProvider = new GenDataTypeItemProvider(this);
		}

		return genDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.genorm.GenEntity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenEntityItemProvider genEntityItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenEntityAdapter() {
		if (genEntityItemProvider == null) {
			genEntityItemProvider = new GenEntityItemProvider(this);
		}

		return genEntityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.genorm.GenSingletonElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenSingletonElementItemProvider genSingletonElementItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenSingletonElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenSingletonElementAdapter() {
		if (genSingletonElementItemProvider == null) {
			genSingletonElementItemProvider = new GenSingletonElementItemProvider(this);
		}

		return genSingletonElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.genorm.GenCollectionElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCollectionElementItemProvider genCollectionElementItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenCollectionElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenCollectionElementAdapter() {
		if (genCollectionElementItemProvider == null) {
			genCollectionElementItemProvider = new GenCollectionElementItemProvider(this);
		}

		return genCollectionElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.genorm.GenSingletonDate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenSingletonDateItemProvider genSingletonDateItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenSingletonDate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenSingletonDateAdapter() {
		if (genSingletonDateItemProvider == null) {
			genSingletonDateItemProvider = new GenSingletonDateItemProvider(this);
		}

		return genSingletonDateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.genorm.GenCollectionDate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCollectionDateItemProvider genCollectionDateItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenCollectionDate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenCollectionDateAdapter() {
		if (genCollectionDateItemProvider == null) {
			genCollectionDateItemProvider = new GenCollectionDateItemProvider(this);
		}

		return genCollectionDateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.genorm.GenSingletonFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenSingletonFileItemProvider genSingletonFileItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenSingletonFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenSingletonFileAdapter() {
		if (genSingletonFileItemProvider == null) {
			genSingletonFileItemProvider = new GenSingletonFileItemProvider(this);
		}

		return genSingletonFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.genorm.GenSingletonImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenSingletonImageItemProvider genSingletonImageItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenSingletonImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenSingletonImageAdapter() {
		if (genSingletonImageItemProvider == null) {
			genSingletonImageItemProvider = new GenSingletonImageItemProvider(this);
		}

		return genSingletonImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.genorm.GenSingletonLocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenSingletonLocationItemProvider genSingletonLocationItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenSingletonLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenSingletonLocationAdapter() {
		if (genSingletonLocationItemProvider == null) {
			genSingletonLocationItemProvider = new GenSingletonLocationItemProvider(this);
		}

		return genSingletonLocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenSingletonAssociationItemProvider genSingletonAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenSingletonAssociationAdapter() {
		if (genSingletonAssociationItemProvider == null) {
			genSingletonAssociationItemProvider = new GenSingletonAssociationItemProvider(this);
		}

		return genSingletonAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCollectionAssociationItemProvider genCollectionAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenCollectionAssociationAdapter() {
		if (genCollectionAssociationItemProvider == null) {
			genCollectionAssociationItemProvider = new GenCollectionAssociationItemProvider(this);
		}

		return genCollectionAssociationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (genOrmModelItemProvider != null) genOrmModelItemProvider.dispose();
		if (genCollectionTypeItemProvider != null) genCollectionTypeItemProvider.dispose();
		if (genDataTypeItemProvider != null) genDataTypeItemProvider.dispose();
		if (genEntityItemProvider != null) genEntityItemProvider.dispose();
		if (genSingletonElementItemProvider != null) genSingletonElementItemProvider.dispose();
		if (genCollectionElementItemProvider != null) genCollectionElementItemProvider.dispose();
		if (genSingletonDateItemProvider != null) genSingletonDateItemProvider.dispose();
		if (genCollectionDateItemProvider != null) genCollectionDateItemProvider.dispose();
		if (genSingletonFileItemProvider != null) genSingletonFileItemProvider.dispose();
		if (genSingletonImageItemProvider != null) genSingletonImageItemProvider.dispose();
		if (genSingletonLocationItemProvider != null) genSingletonLocationItemProvider.dispose();
		if (genSingletonAssociationItemProvider != null) genSingletonAssociationItemProvider.dispose();
		if (genCollectionAssociationItemProvider != null) genCollectionAssociationItemProvider.dispose();
	}

}
