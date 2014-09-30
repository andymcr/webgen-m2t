/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenOrmModelItemProvider.java,v 1.7 2013/08/14 14:18:42 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.genorm.GenOrmFactory;
import uk.ac.man.cs.mdsd.genorm.GenOrmModel;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.genorm.GenOrmModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenOrmModelItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenOrmModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOrmTechnologyPropertyDescriptor(object);
			addBasePackagePropertyDescriptor(object);
			addDomainPackagePropertyDescriptor(object);
			addIncludeXmlBindingAnnotationsPropertyDescriptor(object);
			addDaoPackagePropertyDescriptor(object);
			addDaoImplPackagePropertyDescriptor(object);
			addDatabaseHostPropertyDescriptor(object);
			addDatabaseNamePropertyDescriptor(object);
			addDatabaseUsernamePropertyDescriptor(object);
			addDatabasePasswordPropertyDescriptor(object);
			addDatabasePrefixPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Orm Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrmTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenOrmModel_ormTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenOrmModel_ormTechnology_feature", "_UI_GenOrmModel_type"),
				 GenOrmPackage.Literals.GEN_ORM_MODEL__ORM_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_RelationalPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenOrmModel_basePackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenOrmModel_basePackage_feature", "_UI_GenOrmModel_type"),
				 GenOrmPackage.Literals.GEN_ORM_MODEL__BASE_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_JavaPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenOrmModel_domainPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenOrmModel_domainPackage_feature", "_UI_GenOrmModel_type"),
				 GenOrmPackage.Literals.GEN_ORM_MODEL__DOMAIN_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_JavaPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Include Xml Binding Annotations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludeXmlBindingAnnotationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenOrmModel_includeXmlBindingAnnotations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenOrmModel_includeXmlBindingAnnotations_feature", "_UI_GenOrmModel_type"),
				 GenOrmPackage.Literals.GEN_ORM_MODEL__INCLUDE_XML_BINDING_ANNOTATIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_XMLBindingPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Dao Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDaoPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenOrmModel_daoPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenOrmModel_daoPackage_feature", "_UI_GenOrmModel_type"),
				 GenOrmPackage.Literals.GEN_ORM_MODEL__DAO_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_JavaPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Dao Impl Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDaoImplPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenOrmModel_daoImplPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenOrmModel_daoImplPackage_feature", "_UI_GenOrmModel_type"),
				 GenOrmPackage.Literals.GEN_ORM_MODEL__DAO_IMPL_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_JavaPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenOrmModel_databaseHost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenOrmModel_databaseHost_feature", "_UI_GenOrmModel_type"),
				 GenOrmPackage.Literals.GEN_ORM_MODEL__DATABASE_HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DatabasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenOrmModel_databaseName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenOrmModel_databaseName_feature", "_UI_GenOrmModel_type"),
				 GenOrmPackage.Literals.GEN_ORM_MODEL__DATABASE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DatabasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Username feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseUsernamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenOrmModel_databaseUsername_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenOrmModel_databaseUsername_feature", "_UI_GenOrmModel_type"),
				 GenOrmPackage.Literals.GEN_ORM_MODEL__DATABASE_USERNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DatabasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabasePasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenOrmModel_databasePassword_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenOrmModel_databasePassword_feature", "_UI_GenOrmModel_type"),
				 GenOrmPackage.Literals.GEN_ORM_MODEL__DATABASE_PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DatabasePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabasePrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenOrmModel_databasePrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenOrmModel_databasePrefix_feature", "_UI_GenOrmModel_type"),
				 GenOrmPackage.Literals.GEN_ORM_MODEL__DATABASE_PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DatabasePropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GenOrmPackage.Literals.GEN_ORM_MODEL__GEN_COLLECTION_TYPES);
			childrenFeatures.add(GenOrmPackage.Literals.GEN_ORM_MODEL__GEN_DATA_TYPES);
			childrenFeatures.add(GenOrmPackage.Literals.GEN_ORM_MODEL__GEN_ENTITIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns GenOrmModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GenOrmModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GenOrmModel)object).getDatabaseName();
		return label == null || label.length() == 0 ?
			getString("_UI_GenOrmModel_type") :
			getString("_UI_GenOrmModel_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GenOrmModel.class)) {
			case GenOrmPackage.GEN_ORM_MODEL__ORM_TECHNOLOGY:
			case GenOrmPackage.GEN_ORM_MODEL__BASE_PACKAGE:
			case GenOrmPackage.GEN_ORM_MODEL__DOMAIN_PACKAGE:
			case GenOrmPackage.GEN_ORM_MODEL__INCLUDE_XML_BINDING_ANNOTATIONS:
			case GenOrmPackage.GEN_ORM_MODEL__DAO_PACKAGE:
			case GenOrmPackage.GEN_ORM_MODEL__DAO_IMPL_PACKAGE:
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_HOST:
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_NAME:
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_USERNAME:
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_PASSWORD:
			case GenOrmPackage.GEN_ORM_MODEL__DATABASE_PREFIX:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GenOrmPackage.GEN_ORM_MODEL__GEN_COLLECTION_TYPES:
			case GenOrmPackage.GEN_ORM_MODEL__GEN_DATA_TYPES:
			case GenOrmPackage.GEN_ORM_MODEL__GEN_ENTITIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GenOrmPackage.Literals.GEN_ORM_MODEL__GEN_COLLECTION_TYPES,
				 GenOrmFactory.eINSTANCE.createGenCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(GenOrmPackage.Literals.GEN_ORM_MODEL__GEN_DATA_TYPES,
				 GenOrmFactory.eINSTANCE.createGenDataType()));

		newChildDescriptors.add
			(createChildParameter
				(GenOrmPackage.Literals.GEN_ORM_MODEL__GEN_ENTITIES,
				 GenOrmFactory.eINSTANCE.createGenEntity()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GenOrmEditPlugin.INSTANCE;
	}

}
