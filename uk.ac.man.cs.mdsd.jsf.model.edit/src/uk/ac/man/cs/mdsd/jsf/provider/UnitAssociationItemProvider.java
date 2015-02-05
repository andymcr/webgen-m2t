/**
 */
package uk.ac.man.cs.mdsd.jsf.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.jsf.JsfFactory;
import uk.ac.man.cs.mdsd.jsf.JsfPackage;
import uk.ac.man.cs.mdsd.jsf.UnitAssociation;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.jsf.UnitAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitAssociationItemProvider
	extends UnitFeatureItemProvider
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
	public UnitAssociationItemProvider(AdapterFactory adapterFactory) {
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

			addServiceFeaturePropertyDescriptor(object);
			addSelectionPropertyDescriptor(object);
			addDynamicLabelPropertyDescriptor(object);
			addFiltersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Service Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAssociation_serviceFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_serviceFeature_feature", "_UI_UnitAssociation_type"),
				 JsfPackage.Literals.UNIT_ASSOCIATION__SERVICE_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAssociation_selection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_selection_feature", "_UI_UnitAssociation_type"),
				 JsfPackage.Literals.UNIT_ASSOCIATION__SELECTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dynamic Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAssociation_dynamicLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_dynamicLabel_feature", "_UI_UnitAssociation_type"),
				 JsfPackage.Literals.UNIT_ASSOCIATION__DYNAMIC_LABEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFiltersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAssociation_filters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_filters_feature", "_UI_UnitAssociation_type"),
				 JsfPackage.Literals.UNIT_ASSOCIATION__FILTERS,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(JsfPackage.Literals.UNIT_CONTAINER__UNITS);
			childrenFeatures.add(JsfPackage.Literals.UNIT_ASSOCIATION__CHILD_FEATURE);
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
		String label = ((UnitAssociation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UnitAssociation_type") :
			getString("_UI_UnitAssociation_type") + " " + label;
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

		switch (notification.getFeatureID(UnitAssociation.class)) {
			case JsfPackage.UNIT_ASSOCIATION__UNITS:
			case JsfPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
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
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createStaticUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createCommandUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createCreateSitemapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createCreateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createCreateUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createMapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createDetailsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createIndexGridUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createIndexPageDirectionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createIndexLineDirectionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createSearchUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createActionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createRegistrationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createLoginUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_CONTAINER__UNITS,
				 JsfFactory.eINSTANCE.createForgottenPasswordUnit()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_ASSOCIATION__CHILD_FEATURE,
				 JsfFactory.eINSTANCE.createUnitChildElement()));

		newChildDescriptors.add
			(createChildParameter
				(JsfPackage.Literals.UNIT_ASSOCIATION__CHILD_FEATURE,
				 JsfFactory.eINSTANCE.createUnitChildAssociation()));
	}

}
