/**
 */
package uk.ac.man.cs.mdsd.genjsf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenLocalAuthenticationSystemItemProvider
	extends GenAuthenticationItemProvider
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
	public GenLocalAuthenticationSystemItemProvider(AdapterFactory adapterFactory) {
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

			addLoginMaximumAttemptsPropertyDescriptor(object);
			addLoginAttemptExpiryPeriodPropertyDescriptor(object);
			addAutologinCookieLifetimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Login Maximum Attempts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoginMaximumAttemptsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenLocalAuthenticationSystem_loginMaximumAttempts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenLocalAuthenticationSystem_loginMaximumAttempts_feature", "_UI_GenLocalAuthenticationSystem_type"),
				 GenJsfPackage.Literals.GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_MAXIMUM_ATTEMPTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Login Attempt Expiry Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoginAttemptExpiryPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenLocalAuthenticationSystem_loginAttemptExpiryPeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenLocalAuthenticationSystem_loginAttemptExpiryPeriod_feature", "_UI_GenLocalAuthenticationSystem_type"),
				 GenJsfPackage.Literals.GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_EXPIRY_PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Autologin Cookie Lifetime feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutologinCookieLifetimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenLocalAuthenticationSystem_autologinCookieLifetime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenLocalAuthenticationSystem_autologinCookieLifetime_feature", "_UI_GenLocalAuthenticationSystem_type"),
				 GenJsfPackage.Literals.GEN_LOCAL_AUTHENTICATION_SYSTEM__AUTOLOGIN_COOKIE_LIFETIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GenLocalAuthenticationSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GenLocalAuthenticationSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		GenLocalAuthenticationSystem genLocalAuthenticationSystem = (GenLocalAuthenticationSystem)object;
		return getString("_UI_GenLocalAuthenticationSystem_type") + " " + genLocalAuthenticationSystem.getLoginMaximumAttempts();
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

		switch (notification.getFeatureID(GenLocalAuthenticationSystem.class)) {
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_MAXIMUM_ATTEMPTS:
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_EXPIRY_PERIOD:
			case GenJsfPackage.GEN_LOCAL_AUTHENTICATION_SYSTEM__AUTOLOGIN_COOKIE_LIFETIME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
