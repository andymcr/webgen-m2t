/**
 */
package uk.ac.man.cs.mdsd.criteria.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import uk.ac.man.cs.mdsd.criteria.CriteriaFactory;
import uk.ac.man.cs.mdsd.criteria.CriteriaPackage;
import uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.criteria.PredicateComparisonOperator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PredicateComparisonOperatorItemProvider
	extends PredicateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateComparisonOperatorItemProvider(AdapterFactory adapterFactory) {
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

			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PredicateComparisonOperator_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PredicateComparisonOperator_operator_feature", "_UI_PredicateComparisonOperator_type"),
				 CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__OPERATOR,
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
			childrenFeatures.add(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT);
			childrenFeatures.add(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT);
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
	 * This returns PredicateComparisonOperator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PredicateComparisonOperator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PredicateComparisonOperator predicateComparisonOperator = (PredicateComparisonOperator)object;
		return getString("_UI_PredicateComparisonOperator_type") + " " + predicateComparisonOperator.isNegated();
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

		switch (notification.getFeatureID(PredicateComparisonOperator.class)) {
			case CriteriaPackage.PREDICATE_COMPARISON_OPERATOR__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CriteriaPackage.PREDICATE_COMPARISON_OPERATOR__LEFT:
			case CriteriaPackage.PREDICATE_COMPARISON_OPERATOR__RIGHT:
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
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
				 CriteriaFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
				 CriteriaFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
				 CriteriaFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
				 CriteriaFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
				 CriteriaFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
				 CriteriaFactory.eINSTANCE.createCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
				 CriteriaFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
				 CriteriaFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
				 CriteriaFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
				 CriteriaFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
				 CriteriaFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
				 CriteriaFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
				 CriteriaFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
				 CriteriaFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
				 CriteriaFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
				 CriteriaFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
				 CriteriaFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
				 CriteriaFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
				 CriteriaFactory.eINSTANCE.createCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
				 CriteriaFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
				 CriteriaFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
				 CriteriaFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
				 CriteriaFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
				 CriteriaFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
				 CriteriaFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
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
			childFeature == CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT ||
			childFeature == CriteriaPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
