/**
 */
package uk.ac.man.cs.mdsd.waf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
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

import uk.ac.man.cs.mdsd.criteria.CriteriaFactory;
import uk.ac.man.cs.mdsd.waf.WafFactory;
import uk.ac.man.cs.mdsd.waf.WafPackage;
import uk.ac.man.cs.mdsd.waf.ServiceEntityElement;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.waf.ServiceEntityElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceEntityElementItemProvider
	extends ServiceEntityFeatureItemProvider
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
	public ServiceEntityElementItemProvider(AdapterFactory adapterFactory) {
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

			addObfuscateFormFieldsPropertyDescriptor(object);
			addFeaturePropertyDescriptor(object);
			addCaseInsensitivePropertyDescriptor(object);
			addEncryptPropertyDescriptor(object);
			addPlaceholderPropertyDescriptor(object);
			addValidationPatternPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Obfuscate Form Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObfuscateFormFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncludedElement_obfuscateFormFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedElement_obfuscateFormFields_feature", "_UI_IncludedElement_type"),
				 WafPackage.Literals.INCLUDED_ELEMENT__OBFUSCATE_FORM_FIELDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceEntityElement_feature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceEntityElement_feature_feature", "_UI_ServiceEntityElement_type"),
				 WafPackage.Literals.SERVICE_ENTITY_ELEMENT__FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Case Insensitive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaseInsensitivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceEntityElement_caseInsensitive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceEntityElement_caseInsensitive_feature", "_UI_ServiceEntityElement_type"),
				 WafPackage.Literals.SERVICE_ENTITY_ELEMENT__CASE_INSENSITIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encrypt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncryptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceEntityElement_encrypt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceEntityElement_encrypt_feature", "_UI_ServiceEntityElement_type"),
				 WafPackage.Literals.SERVICE_ENTITY_ELEMENT__ENCRYPT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Placeholder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlaceholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceEntityElement_placeholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceEntityElement_placeholder_feature", "_UI_ServiceEntityElement_type"),
				 WafPackage.Literals.SERVICE_ENTITY_ELEMENT__PLACEHOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validation Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceEntityElement_validationPattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceEntityElement_validationPattern_feature", "_UI_ServiceEntityElement_type"),
				 WafPackage.Literals.SERVICE_ENTITY_ELEMENT__VALIDATION_PATTERN,
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
			childrenFeatures.add(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ServiceEntityElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ServiceEntityElement_type") :
			getString("_UI_ServiceEntityElement_type") + " " + label;
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

		switch (notification.getFeatureID(ServiceEntityElement.class)) {
			case WafPackage.SERVICE_ENTITY_ELEMENT__OBFUSCATE_FORM_FIELDS:
			case WafPackage.SERVICE_ENTITY_ELEMENT__CASE_INSENSITIVE:
			case WafPackage.SERVICE_ENTITY_ELEMENT__ENCRYPT:
			case WafPackage.SERVICE_ENTITY_ELEMENT__PLACEHOLDER:
			case WafPackage.SERVICE_ENTITY_ELEMENT__VALIDATION_PATTERN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.SERVICE_ENTITY_ELEMENT__DEFAULT_VALUE:
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
				(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE,
				 WafFactory.eINSTANCE.createModelReference()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE,
				 WafFactory.eINSTANCE.createFeatureReference()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE,
				 WafFactory.eINSTANCE.createCurrentUserReference()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE,
				 CriteriaFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE,
				 CriteriaFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE,
				 CriteriaFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE,
				 CriteriaFactory.eINSTANCE.createCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE,
				 CriteriaFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateIsEmpty()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == WafPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE ||
			childFeature == WafPackage.Literals.INCLUDED_ELEMENT__DEFAULT_VALUE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
