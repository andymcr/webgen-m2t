/**
 * <copyright>
 * </copyright>
 *
 * $Id: JsfModelItemProvider.java,v 1.12 2013/12/12 14:19:30 andy Exp $
 */
package uk.ac.man.cs.mdsd.jsf.provider;


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

import uk.ac.man.cs.mdsd.jsf.JsfFactory;
import uk.ac.man.cs.mdsd.jsf.JsfModel;
import uk.ac.man.cs.mdsd.jsf.JsfPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.jsf.JsfModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JsfModelItemProvider
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
	public JsfModelItemProvider(AdapterFactory adapterFactory) {
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

			addPersistencePropertyDescriptor(object);
			addSiteNamePropertyDescriptor(object);
			addSiteTitlePropertyDescriptor(object);
			addDevelopmentVersionPropertyDescriptor(object);
			addBaseURLPropertyDescriptor(object);
			addRewriteURLsPropertyDescriptor(object);
			addWebmasterEmailPropertyDescriptor(object);
			addCopyrightTextPropertyDescriptor(object);
			addMetaDescriptionPropertyDescriptor(object);
			addFrameworkTechnologyPropertyDescriptor(object);
			addAjaxTechnologyPropertyDescriptor(object);
			addCaptchaSiteKeyPropertyDescriptor(object);
			addCaptchaSecretKeyPropertyDescriptor(object);
			addTopNavigationIdPropertyDescriptor(object);
			addSideMenuPropertyDescriptor(object);
			addStaticUnitsEditablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Persistence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersistencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JsfModel_persistence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_persistence_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__PERSISTENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Site Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSiteNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JsfModel_siteName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_siteName_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__SITE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Site Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSiteTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JsfModel_siteTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_siteTitle_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__SITE_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_JsfModel_developmentVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_developmentVersion_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__DEVELOPMENT_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_JsfModel_baseURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_baseURL_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__BASE_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_JsfModel_rewriteURLs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_rewriteURLs_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__REWRITE_UR_LS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Webmaster Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebmasterEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JsfModel_webmasterEmail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_webmasterEmail_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__WEBMASTER_EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Copyright Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyrightTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JsfModel_copyrightText_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_copyrightText_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__COPYRIGHT_TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meta Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetaDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JsfModel_metaDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_metaDescription_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__META_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Framework Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrameworkTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JsfModel_frameworkTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_frameworkTechnology_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__FRAMEWORK_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_JsfModel_ajaxTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_ajaxTechnology_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__AJAX_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Captcha Site Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaptchaSiteKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JsfModel_captchaSiteKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_captchaSiteKey_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__CAPTCHA_SITE_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Captcha Secret Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaptchaSecretKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JsfModel_captchaSecretKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_captchaSecretKey_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__CAPTCHA_SECRET_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top Navigation Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopNavigationIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JsfModel_topNavigationId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_topNavigationId_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__TOP_NAVIGATION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Side Menu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSideMenuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JsfModel_sideMenu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_sideMenu_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__SIDE_MENU,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Static Units Editable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticUnitsEditablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JsfModel_staticUnitsEditable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JsfModel_staticUnitsEditable_feature", "_UI_JsfModel_type"),
				 JsfPackage.Literals.JSF_MODEL__STATIC_UNITS_EDITABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(JsfPackage.Literals.JSF_MODEL__SERVICES);
			childrenFeatures.add(JsfPackage.Literals.JSF_MODEL__PAGES);
			childrenFeatures.add(JsfPackage.Literals.JSF_MODEL__MENUS);
			childrenFeatures.add(JsfPackage.Literals.JSF_MODEL__AUTHENTICATION);
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
	 * This returns JsfModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JsfModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JsfModel)object).getSiteName();
		return label == null || label.length() == 0 ?
			getString("_UI_JsfModel_type") :
			getString("_UI_JsfModel_type") + " " + label;
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

		switch (notification.getFeatureID(JsfModel.class)) {
			case JsfPackage.JSF_MODEL__SITE_NAME:
			case JsfPackage.JSF_MODEL__SITE_TITLE:
			case JsfPackage.JSF_MODEL__DEVELOPMENT_VERSION:
			case JsfPackage.JSF_MODEL__BASE_URL:
			case JsfPackage.JSF_MODEL__REWRITE_UR_LS:
			case JsfPackage.JSF_MODEL__WEBMASTER_EMAIL:
			case JsfPackage.JSF_MODEL__COPYRIGHT_TEXT:
			case JsfPackage.JSF_MODEL__META_DESCRIPTION:
			case JsfPackage.JSF_MODEL__FRAMEWORK_TECHNOLOGY:
			case JsfPackage.JSF_MODEL__AJAX_TECHNOLOGY:
			case JsfPackage.JSF_MODEL__CAPTCHA_SITE_KEY:
			case JsfPackage.JSF_MODEL__CAPTCHA_SECRET_KEY:
			case JsfPackage.JSF_MODEL__TOP_NAVIGATION_ID:
			case JsfPackage.JSF_MODEL__STATIC_UNITS_EDITABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JsfPackage.JSF_MODEL__SERVICES:
			case JsfPackage.JSF_MODEL__PAGES:
			case JsfPackage.JSF_MODEL__MENUS:
			case JsfPackage.JSF_MODEL__AUTHENTICATION:
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
				(JsfPackage.Literals.JSF_MODEL__SERVICES,
				 JsfFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.JSF_MODEL__PAGES,
				 JsfFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.JSF_MODEL__MENUS,
				 JsfFactory.eINSTANCE.createStaticMenu()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.JSF_MODEL__MENUS,
				 JsfFactory.eINSTANCE.createDynamicMenu()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.JSF_MODEL__AUTHENTICATION,
				 JsfFactory.eINSTANCE.createLocalAuthenticationSystem()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.JSF_MODEL__AUTHENTICATION,
				 JsfFactory.eINSTANCE.createCasAuthentication()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return JsfEditPlugin.INSTANCE;
	}

}
