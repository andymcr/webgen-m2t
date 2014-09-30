/**
 */
package uk.ac.man.cs.mdsd.genjsf.provider;


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

import uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit;
import uk.ac.man.cs.mdsd.genjsf.GenJsfFactory;
import uk.ac.man.cs.mdsd.genjsf.GenJsfPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenDynamicUnitItemProvider
	extends GenContentUnitItemProvider
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
	public GenDynamicUnitItemProvider(AdapterFactory adapterFactory) {
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

			addGenServicePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Gen Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenDynamicUnit_genService_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenDynamicUnit_genService_feature", "_UI_GenDynamicUnit_type"),
				 GenJsfPackage.Literals.GEN_DYNAMIC_UNIT__GEN_SERVICE,
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
			childrenFeatures.add(GenJsfPackage.Literals.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS);
			childrenFeatures.add(GenJsfPackage.Literals.GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS);
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
	 * This returns GenDynamicUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GenDynamicUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GenDynamicUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GenDynamicUnit_type") :
			getString("_UI_GenDynamicUnit_type") + " " + label;
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

		switch (notification.getFeatureID(GenDynamicUnit.class)) {
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS:
			case GenJsfPackage.GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS:
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
				(GenJsfPackage.Literals.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS,
				 GenJsfFactory.eINSTANCE.createGenUnitElement()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS,
				 GenJsfFactory.eINSTANCE.createGenUnitAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS,
				 GenJsfFactory.eINSTANCE.createGenDataTypeField()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS,
				 GenJsfFactory.eINSTANCE.createGenDateField()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_DYNAMIC_UNIT__GEN_DISPLAY_FIELDS,
				 GenJsfFactory.eINSTANCE.createGenCaptchaField()));

		newChildDescriptors.add
			(createChildParameter
				(GenJsfPackage.Literals.GEN_DYNAMIC_UNIT__GEN_SUPPORT_ACTIONS,
				 GenJsfFactory.eINSTANCE.createGenUnitSupportAction()));
	}

}
