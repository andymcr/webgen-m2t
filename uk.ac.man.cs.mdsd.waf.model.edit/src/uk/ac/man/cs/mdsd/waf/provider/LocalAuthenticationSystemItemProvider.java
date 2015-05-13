/**
 */
package uk.ac.man.cs.mdsd.waf.provider;


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

import uk.ac.man.cs.mdsd.waf.WafPackage;
import uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalAuthenticationSystemItemProvider
	extends AuthenticationItemProvider
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
	public LocalAuthenticationSystemItemProvider(AdapterFactory adapterFactory) {
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

			addUserServicePropertyDescriptor(object);
			addUserAuthenticationKeyPropertyDescriptor(object);
			addAuthenticationServicePropertyDescriptor(object);
			addLoginAttemptServicePropertyDescriptor(object);
			addAutoLoginServicePropertyDescriptor(object);
			addAllowSelfRegistrationPropertyDescriptor(object);
			addUseEmailActivationPropertyDescriptor(object);
			addSendWelcomeEmailPropertyDescriptor(object);
			addRegistrationUnitPropertyDescriptor(object);
			addLoginUnitPropertyDescriptor(object);
			addForgottenPasswordUnitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the User Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_userService_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_userService_feature", "_UI_LocalAuthenticationSystem_type"),
				 WafPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__USER_SERVICE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Authentication Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserAuthenticationKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_userAuthenticationKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_userAuthenticationKey_feature", "_UI_LocalAuthenticationSystem_type"),
				 WafPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__USER_AUTHENTICATION_KEY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Authentication Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthenticationServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_authenticationService_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_authenticationService_feature", "_UI_LocalAuthenticationSystem_type"),
				 WafPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_SERVICE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Login Attempt Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoginAttemptServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_loginAttemptService_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_loginAttemptService_feature", "_UI_LocalAuthenticationSystem_type"),
				 WafPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT_SERVICE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Login Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoLoginServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_autoLoginService_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_autoLoginService_feature", "_UI_LocalAuthenticationSystem_type"),
				 WafPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN_SERVICE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Self Registration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowSelfRegistrationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_allowSelfRegistration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_allowSelfRegistration_feature", "_UI_LocalAuthenticationSystem_type"),
				 WafPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Email Activation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseEmailActivationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_useEmailActivation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_useEmailActivation_feature", "_UI_LocalAuthenticationSystem_type"),
				 WafPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Send Welcome Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendWelcomeEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_sendWelcomeEmail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_sendWelcomeEmail_feature", "_UI_LocalAuthenticationSystem_type"),
				 WafPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Registration Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegistrationUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_registrationUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_registrationUnit_feature", "_UI_LocalAuthenticationSystem_type"),
				 WafPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Login Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoginUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_loginUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_loginUnit_feature", "_UI_LocalAuthenticationSystem_type"),
				 WafPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Forgotten Password Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForgottenPasswordUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_forgottenPasswordUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_forgottenPasswordUnit_feature", "_UI_LocalAuthenticationSystem_type"),
				 WafPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns LocalAuthenticationSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LocalAuthenticationSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LocalAuthenticationSystem)object).getLoginLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_LocalAuthenticationSystem_type") :
			getString("_UI_LocalAuthenticationSystem_type") + " " + label;
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

		switch (notification.getFeatureID(LocalAuthenticationSystem.class)) {
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
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
