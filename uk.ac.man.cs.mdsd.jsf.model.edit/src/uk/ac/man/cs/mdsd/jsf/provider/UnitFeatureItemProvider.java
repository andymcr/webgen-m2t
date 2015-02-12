/**
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
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.criteria.CriteriaFactory;
import uk.ac.man.cs.mdsd.jsf.JsfFactory;
import uk.ac.man.cs.mdsd.jsf.JsfPackage;
import uk.ac.man.cs.mdsd.jsf.UnitFeature;

import uk.ac.man.cs.mdsd.orm.provider.NamedElementItemProvider;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.jsf.UnitFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitFeatureItemProvider
	extends NamedElementItemProvider
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
	public UnitFeatureItemProvider(AdapterFactory adapterFactory) {
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

			addDisplayLabelPropertyDescriptor(object);
			addFooterPropertyDescriptor(object);
			addHeaderClassPropertyDescriptor(object);
			addInputClassPropertyDescriptor(object);
			addDisplayClassPropertyDescriptor(object);
			addFooterClassPropertyDescriptor(object);
			addCardinalityPropertyDescriptor(object);
			addDateFormatPropertyDescriptor(object);
			addOnlyDisplayWhenNotEmptyPropertyDescriptor(object);
			addDisplayOptionPropertyDescriptor(object);
			addLinkedActionPropertyDescriptor(object);
			addMaximumDisplaySizePropertyDescriptor(object);
			addAutofocusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Display Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncludedFeature_displayLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedFeature_displayLabel_feature", "_UI_IncludedFeature_type"),
				 JsfPackage.Literals.INCLUDED_FEATURE__DISPLAY_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Footer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFooterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncludedFeature_footer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedFeature_footer_feature", "_UI_IncludedFeature_type"),
				 JsfPackage.Literals.INCLUDED_FEATURE__FOOTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_dateFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_dateFormat_feature", "_UI_UnitField_type"),
				 JsfPackage.Literals.UNIT_FIELD__DATE_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Header Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeaderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncludedFeature_headerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedFeature_headerClass_feature", "_UI_IncludedFeature_type"),
				 JsfPackage.Literals.INCLUDED_FEATURE__HEADER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncludedFeature_inputClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedFeature_inputClass_feature", "_UI_IncludedFeature_type"),
				 JsfPackage.Literals.INCLUDED_FEATURE__INPUT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Display Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncludedFeature_displayClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedFeature_displayClass_feature", "_UI_IncludedFeature_type"),
				 JsfPackage.Literals.INCLUDED_FEATURE__DISPLAY_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Footer Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFooterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncludedFeature_footerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedFeature_footerClass_feature", "_UI_IncludedFeature_type"),
				 JsfPackage.Literals.INCLUDED_FEATURE__FOOTER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_cardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_cardinality_feature", "_UI_UnitField_type"),
				 JsfPackage.Literals.UNIT_FIELD__CARDINALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Only Display When Not Empty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnlyDisplayWhenNotEmptyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_onlyDisplayWhenNotEmpty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_onlyDisplayWhenNotEmpty_feature", "_UI_UnitFeature_type"),
				 JsfPackage.Literals.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Display Option feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_displayOption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_displayOption_feature", "_UI_UnitFeature_type"),
				 JsfPackage.Literals.UNIT_FEATURE__DISPLAY_OPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linked Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkedActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_linkedAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_linkedAction_feature", "_UI_UnitFeature_type"),
				 JsfPackage.Literals.UNIT_FEATURE__LINKED_ACTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Display Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumDisplaySizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_maximumDisplaySize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_maximumDisplaySize_feature", "_UI_UnitFeature_type"),
				 JsfPackage.Literals.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Autofocus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutofocusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_autofocus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_autofocus_feature", "_UI_UnitFeature_type"),
				 JsfPackage.Literals.UNIT_FEATURE__AUTOFOCUS,
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
			childrenFeatures.add(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE);
			childrenFeatures.add(JsfPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS);
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
		String label = ((UnitFeature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UnitFeature_type") :
			getString("_UI_UnitFeature_type") + " " + label;
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

		switch (notification.getFeatureID(UnitFeature.class)) {
			case JsfPackage.UNIT_FEATURE__DISPLAY_LABEL:
			case JsfPackage.UNIT_FEATURE__FOOTER:
			case JsfPackage.UNIT_FEATURE__HEADER_CLASS:
			case JsfPackage.UNIT_FEATURE__INPUT_CLASS:
			case JsfPackage.UNIT_FEATURE__DISPLAY_CLASS:
			case JsfPackage.UNIT_FEATURE__FOOTER_CLASS:
			case JsfPackage.UNIT_FEATURE__CARDINALITY:
			case JsfPackage.UNIT_FEATURE__DATE_FORMAT:
			case JsfPackage.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY:
			case JsfPackage.UNIT_FEATURE__DISPLAY_OPTION:
			case JsfPackage.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE:
			case JsfPackage.UNIT_FEATURE__AUTOFOCUS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JsfPackage.UNIT_FEATURE__FORCED_VALUE:
			case JsfPackage.UNIT_FEATURE__ACTIONS:
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
				(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 JsfFactory.eINSTANCE.createModelReference()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 JsfFactory.eINSTANCE.createFeatureReference()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 JsfFactory.eINSTANCE.createCurrentUserReference()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INCLUDED_FEATURE__FORCED_VALUE,
				 CriteriaFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 JsfFactory.eINSTANCE.createSelectAction()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 JsfFactory.eINSTANCE.createDeleteAction()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 JsfFactory.eINSTANCE.createFeatureSupportAction()));
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
