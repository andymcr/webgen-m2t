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

import uk.ac.man.cs.mdsd.gencriteria.GencriteriaFactory;
import uk.ac.man.cs.mdsd.genjsf.GenJsfFactory;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;
import uk.ac.man.cs.mdsd.genjsf.GenUnitFeature;

import uk.ac.man.cs.mdsd.orm.provider.NamedElementItemProvider;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.genjsf.GenUnitFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenUnitFeatureItemProvider
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
	public GenUnitFeatureItemProvider(AdapterFactory adapterFactory) {
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

			addMessageDisplayOptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Message Display Option feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageDisplayOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenIncludedFeature_messageDisplayOption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenIncludedFeature_messageDisplayOption_feature", "_UI_GenIncludedFeature_type"),
				 GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__MESSAGE_DISPLAY_OPTION,
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
			childrenFeatures.add(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE);
			childrenFeatures.add(GenJsfPackage.Literals.GEN_INLINE_ACTION_CONTAINER__GEN_ACTIONS);
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
		String label = ((GenUnitFeature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GenUnitFeature_type") :
			getString("_UI_GenUnitFeature_type") + " " + label;
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

		switch (notification.getFeatureID(GenUnitFeature.class)) {
			case GenJsfPackage.GEN_UNIT_FEATURE__MESSAGE_DISPLAY_OPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_FORCED_VALUE:
			case GenJsfPackage.GEN_UNIT_FEATURE__GEN_ACTIONS:
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
				(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE,
				 GenJsfFactory.eINSTANCE.createGenFeatureReference()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE,
				 GenJsfFactory.eINSTANCE.createGenModelReference()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE,
				 GenJsfFactory.eINSTANCE.createGenCurrentUserReference()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE,
				 GencriteriaFactory.eINSTANCE.createGenNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE,
				 GencriteriaFactory.eINSTANCE.createGenIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE,
				 GencriteriaFactory.eINSTANCE.createGenStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE,
				 GencriteriaFactory.eINSTANCE.createGenCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE,
				 GencriteriaFactory.eINSTANCE.createGenFunction()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE,
				 GencriteriaFactory.eINSTANCE.createGenPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE,
				 GencriteriaFactory.eINSTANCE.createGenPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE,
				 GencriteriaFactory.eINSTANCE.createGenPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE,
				 GencriteriaFactory.eINSTANCE.createGenPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE,
				 GencriteriaFactory.eINSTANCE.createGenPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INCLUDED_FEATURE__GEN_FORCED_VALUE,
				 GencriteriaFactory.eINSTANCE.createGenPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INLINE_ACTION_CONTAINER__GEN_ACTIONS,
				 GenJsfFactory.eINSTANCE.createGenSelectAction()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INLINE_ACTION_CONTAINER__GEN_ACTIONS,
				 GenJsfFactory.eINSTANCE.createGenDeleteAction()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_INLINE_ACTION_CONTAINER__GEN_ACTIONS,
				 GenJsfFactory.eINSTANCE.createGenFeatureSupportAction()));
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
