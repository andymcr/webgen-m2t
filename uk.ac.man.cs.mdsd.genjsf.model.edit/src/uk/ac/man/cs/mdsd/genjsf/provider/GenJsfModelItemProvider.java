/**
 */
package uk.ac.man.cs.mdsd.genjsf.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.genjsf.GenJsfFactory;
import uk.ac.man.cs.mdsd.genjsf.GenJsfModel;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;

import uk.ac.man.cs.mdsd.genorm.provider.GenOrmModelItemProvider;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenJsfModelItemProvider
	extends GenOrmModelItemProvider
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
	public GenJsfModelItemProvider(AdapterFactory adapterFactory) {
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

			addBaseURLPropertyDescriptor(object);
			addRewriteURLsPropertyDescriptor(object);
			addDevelopmentVersionPropertyDescriptor(object);
			addAjaxTechnologyPropertyDescriptor(object);
			addTextEditorPathPropertyDescriptor(object);
			addBackingPackagePropertyDescriptor(object);
			addConverterPackagePropertyDescriptor(object);
			addValidatorPackagePropertyDescriptor(object);
			addServicePackagePropertyDescriptor(object);
			addSecurityPackagePropertyDescriptor(object);
			addUiPackagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenJsfModel_baseURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenJsfModel_baseURL_feature", "_UI_GenJsfModel_type"),
				 GenJsfPackage.Literals.GEN_JSF_MODEL__BASE_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Rewrite UR Ls feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRewriteURLsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenJsfModel_rewriteURLs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenJsfModel_rewriteURLs_feature", "_UI_GenJsfModel_type"),
				 GenJsfPackage.Literals.GEN_JSF_MODEL__REWRITE_UR_LS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Development Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDevelopmentVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenJsfModel_developmentVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenJsfModel_developmentVersion_feature", "_UI_GenJsfModel_type"),
				 GenJsfPackage.Literals.GEN_JSF_MODEL__DEVELOPMENT_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Ajax Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAjaxTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenJsfModel_ajaxTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenJsfModel_ajaxTechnology_feature", "_UI_GenJsfModel_type"),
				 GenJsfPackage.Literals.GEN_JSF_MODEL__AJAX_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Editor Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextEditorPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenJsfModel_textEditorPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenJsfModel_textEditorPath_feature", "_UI_GenJsfModel_type"),
				 GenJsfPackage.Literals.GEN_JSF_MODEL__TEXT_EDITOR_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SitePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Backing Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackingPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenJsfModel_backingPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenJsfModel_backingPackage_feature", "_UI_GenJsfModel_type"),
				 GenJsfPackage.Literals.GEN_JSF_MODEL__BACKING_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Converter Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConverterPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenJsfModel_converterPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenJsfModel_converterPackage_feature", "_UI_GenJsfModel_type"),
				 GenJsfPackage.Literals.GEN_JSF_MODEL__CONVERTER_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validator Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidatorPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenJsfModel_validatorPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenJsfModel_validatorPackage_feature", "_UI_GenJsfModel_type"),
				 GenJsfPackage.Literals.GEN_JSF_MODEL__VALIDATOR_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicePackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenJsfModel_servicePackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenJsfModel_servicePackage_feature", "_UI_GenJsfModel_type"),
				 GenJsfPackage.Literals.GEN_JSF_MODEL__SERVICE_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenJsfModel_securityPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenJsfModel_securityPackage_feature", "_UI_GenJsfModel_type"),
				 GenJsfPackage.Literals.GEN_JSF_MODEL__SECURITY_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ui Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUiPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenJsfModel_uiPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenJsfModel_uiPackage_feature", "_UI_GenJsfModel_type"),
				 GenJsfPackage.Literals.GEN_JSF_MODEL__UI_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
			childrenFeatures.add(GenJsfPackage.Literals.GEN_JSF_MODEL__GEN_SERVICES);
			childrenFeatures.add(GenJsfPackage.Literals.GEN_JSF_MODEL__GEN_PAGES);
			childrenFeatures.add(GenJsfPackage.Literals.GEN_JSF_MODEL__GEN_MENUS);
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
	 * This returns GenJsfModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GenJsfModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GenJsfModel)object).getDatabaseName();
		return label == null || label.length() == 0 ?
			getString("_UI_GenJsfModel_type") :
			getString("_UI_GenJsfModel_type") + " " + label;
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

		switch (notification.getFeatureID(GenJsfModel.class)) {
			case GenJsfPackage.GEN_JSF_MODEL__BASE_URL:
			case GenJsfPackage.GEN_JSF_MODEL__REWRITE_UR_LS:
			case GenJsfPackage.GEN_JSF_MODEL__DEVELOPMENT_VERSION:
			case GenJsfPackage.GEN_JSF_MODEL__AJAX_TECHNOLOGY:
			case GenJsfPackage.GEN_JSF_MODEL__TEXT_EDITOR_PATH:
			case GenJsfPackage.GEN_JSF_MODEL__BACKING_PACKAGE:
			case GenJsfPackage.GEN_JSF_MODEL__CONVERTER_PACKAGE:
			case GenJsfPackage.GEN_JSF_MODEL__VALIDATOR_PACKAGE:
			case GenJsfPackage.GEN_JSF_MODEL__SERVICE_PACKAGE:
			case GenJsfPackage.GEN_JSF_MODEL__SECURITY_PACKAGE:
			case GenJsfPackage.GEN_JSF_MODEL__UI_PACKAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GenJsfPackage.GEN_JSF_MODEL__GEN_SERVICES:
			case GenJsfPackage.GEN_JSF_MODEL__GEN_PAGES:
			case GenJsfPackage.GEN_JSF_MODEL__GEN_MENUS:
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
				(GenJsfPackage.Literals.GEN_JSF_MODEL__GEN_SERVICES,
				 GenJsfFactory.eINSTANCE.createGenService()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_JSF_MODEL__GEN_PAGES,
				 GenJsfFactory.eINSTANCE.createGenPage()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_JSF_MODEL__GEN_MENUS,
				 GenJsfFactory.eINSTANCE.createGenStaticMenu()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_JSF_MODEL__GEN_MENUS,
				 GenJsfFactory.eINSTANCE.createGenDynamicMenu()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GenJsfEditPlugin.INSTANCE;
	}

}
