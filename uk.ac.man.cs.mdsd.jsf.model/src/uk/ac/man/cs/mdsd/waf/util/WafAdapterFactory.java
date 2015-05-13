/**
 * <copyright>
 * </copyright>
 *
 * $Id: WafAdapterFactory.java,v 1.55 2014/08/22 14:32:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.waf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.criteria.Expression;
import uk.ac.man.cs.mdsd.criteria.Path;
import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;
import uk.ac.man.cs.mdsd.orm.NamedElement;
import uk.ac.man.cs.mdsd.waf.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.waf.WafPackage
 * @generated
 */
public class WafAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WafPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WafAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WafPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WafSwitch<Adapter> modelSwitch =
		new WafSwitch<Adapter>() {
			@Override
			public Adapter caseWafModel(WafModel object) {
				return createWafModelAdapter();
			}
			@Override
			public Adapter caseAuthentication(Authentication object) {
				return createAuthenticationAdapter();
			}
			@Override
			public Adapter caseLocalAuthenticationSystem(LocalAuthenticationSystem object) {
				return createLocalAuthenticationSystemAdapter();
			}
			@Override
			public Adapter caseCasAuthentication(CasAuthentication object) {
				return createCasAuthenticationAdapter();
			}
			@Override
			public Adapter caseIncludedFeature(IncludedFeature object) {
				return createIncludedFeatureAdapter();
			}
			@Override
			public Adapter caseIncludedElement(IncludedElement object) {
				return createIncludedElementAdapter();
			}
			@Override
			public Adapter caseIncludedAssociation(IncludedAssociation object) {
				return createIncludedAssociationAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseModelLabel(ModelLabel object) {
				return createModelLabelAdapter();
			}
			@Override
			public Adapter caseSelection(Selection object) {
				return createSelectionAdapter();
			}
			@Override
			public Adapter caseServiceFeature(ServiceFeature object) {
				return createServiceFeatureAdapter();
			}
			@Override
			public Adapter caseServiceEntityFeature(ServiceEntityFeature object) {
				return createServiceEntityFeatureAdapter();
			}
			@Override
			public Adapter caseServiceEntityElement(ServiceEntityElement object) {
				return createServiceEntityElementAdapter();
			}
			@Override
			public Adapter caseServiceAssociation(ServiceAssociation object) {
				return createServiceAssociationAdapter();
			}
			@Override
			public Adapter caseServiceEntityAssociation(ServiceEntityAssociation object) {
				return createServiceEntityAssociationAdapter();
			}
			@Override
			public Adapter caseServiceViewAssociation(ServiceViewAssociation object) {
				return createServiceViewAssociationAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseMenu(Menu object) {
				return createMenuAdapter();
			}
			@Override
			public Adapter caseMenuEntry(MenuEntry object) {
				return createMenuEntryAdapter();
			}
			@Override
			public Adapter caseStaticMenu(StaticMenu object) {
				return createStaticMenuAdapter();
			}
			@Override
			public Adapter caseFixedPageMenuEntry(FixedPageMenuEntry object) {
				return createFixedPageMenuEntryAdapter();
			}
			@Override
			public Adapter caseFixedActionMenuEntry(FixedActionMenuEntry object) {
				return createFixedActionMenuEntryAdapter();
			}
			@Override
			public Adapter caseFixedCommandMenuEntry(FixedCommandMenuEntry object) {
				return createFixedCommandMenuEntryAdapter();
			}
			@Override
			public Adapter caseEditStaticTextMenuEntry(EditStaticTextMenuEntry object) {
				return createEditStaticTextMenuEntryAdapter();
			}
			@Override
			public Adapter caseDynamicMenu(DynamicMenu object) {
				return createDynamicMenuAdapter();
			}
			@Override
			public Adapter caseMenuIncludedFeature(MenuIncludedFeature object) {
				return createMenuIncludedFeatureAdapter();
			}
			@Override
			public Adapter caseMenuIncludedElement(MenuIncludedElement object) {
				return createMenuIncludedElementAdapter();
			}
			@Override
			public Adapter caseSelectTarget(SelectTarget object) {
				return createSelectTargetAdapter();
			}
			@Override
			public Adapter caseUnitContainer(UnitContainer object) {
				return createUnitContainerAdapter();
			}
			@Override
			public Adapter caseUnitTitle(UnitTitle object) {
				return createUnitTitleAdapter();
			}
			@Override
			public Adapter caseContentUnit(ContentUnit object) {
				return createContentUnitAdapter();
			}
			@Override
			public Adapter caseStaticUnit(StaticUnit object) {
				return createStaticUnitAdapter();
			}
			@Override
			public Adapter caseCommandUnit(CommandUnit object) {
				return createCommandUnitAdapter();
			}
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter caseUserCommand(UserCommand object) {
				return createUserCommandAdapter();
			}
			@Override
			public Adapter caseCreateSitemapUnit(CreateSitemapUnit object) {
				return createCreateSitemapUnitAdapter();
			}
			@Override
			public Adapter caseDynamicUnit(DynamicUnit object) {
				return createDynamicUnitAdapter();
			}
			@Override
			public Adapter caseUnitField(UnitField object) {
				return createUnitFieldAdapter();
			}
			@Override
			public Adapter caseUnitFeature(UnitFeature object) {
				return createUnitFeatureAdapter();
			}
			@Override
			public Adapter caseUnitElement(UnitElement object) {
				return createUnitElementAdapter();
			}
			@Override
			public Adapter caseUnitAssociation(UnitAssociation object) {
				return createUnitAssociationAdapter();
			}
			@Override
			public Adapter caseUnitChildFeature(UnitChildFeature object) {
				return createUnitChildFeatureAdapter();
			}
			@Override
			public Adapter caseUnitChildElement(UnitChildElement object) {
				return createUnitChildElementAdapter();
			}
			@Override
			public Adapter caseUnitChildAssociation(UnitChildAssociation object) {
				return createUnitChildAssociationAdapter();
			}
			@Override
			public Adapter caseInterfaceField(InterfaceField object) {
				return createInterfaceFieldAdapter();
			}
			@Override
			public Adapter caseDataTypeField(DataTypeField object) {
				return createDataTypeFieldAdapter();
			}
			@Override
			public Adapter caseDateField(DateField object) {
				return createDateFieldAdapter();
			}
			@Override
			public Adapter caseCaptchaField(CaptchaField object) {
				return createCaptchaFieldAdapter();
			}
			@Override
			public Adapter caseUnitSupportAction(UnitSupportAction object) {
				return createUnitSupportActionAdapter();
			}
			@Override
			public Adapter caseEditUnit(EditUnit object) {
				return createEditUnitAdapter();
			}
			@Override
			public Adapter caseCreateUnit(CreateUnit object) {
				return createCreateUnitAdapter();
			}
			@Override
			public Adapter caseCreateUpdateUnit(CreateUpdateUnit object) {
				return createCreateUpdateUnitAdapter();
			}
			@Override
			public Adapter caseMapUnit(MapUnit object) {
				return createMapUnitAdapter();
			}
			@Override
			public Adapter caseUpdateUnit(UpdateUnit object) {
				return createUpdateUnitAdapter();
			}
			@Override
			public Adapter caseDataUnit(DataUnit object) {
				return createDataUnitAdapter();
			}
			@Override
			public Adapter caseDetailsUnit(DetailsUnit object) {
				return createDetailsUnitAdapter();
			}
			@Override
			public Adapter caseIndexUnit(IndexUnit object) {
				return createIndexUnitAdapter();
			}
			@Override
			public Adapter caseIndexGridUnit(IndexGridUnit object) {
				return createIndexGridUnitAdapter();
			}
			@Override
			public Adapter caseIndexPageDirectionUnit(IndexPageDirectionUnit object) {
				return createIndexPageDirectionUnitAdapter();
			}
			@Override
			public Adapter caseIndexLineDirectionUnit(IndexLineDirectionUnit object) {
				return createIndexLineDirectionUnitAdapter();
			}
			@Override
			public Adapter caseControlUnit(ControlUnit object) {
				return createControlUnitAdapter();
			}
			@Override
			public Adapter caseSearchUnit(SearchUnit object) {
				return createSearchUnitAdapter();
			}
			@Override
			public Adapter caseActionUnit(ActionUnit object) {
				return createActionUnitAdapter();
			}
			@Override
			public Adapter caseAuthenticationUnit(AuthenticationUnit object) {
				return createAuthenticationUnitAdapter();
			}
			@Override
			public Adapter caseRegistrationUnit(RegistrationUnit object) {
				return createRegistrationUnitAdapter();
			}
			@Override
			public Adapter caseLoginUnit(LoginUnit object) {
				return createLoginUnitAdapter();
			}
			@Override
			public Adapter caseForgottenPasswordUnit(ForgottenPasswordUnit object) {
				return createForgottenPasswordUnitAdapter();
			}
			@Override
			public Adapter caseInlineActionContainer(InlineActionContainer object) {
				return createInlineActionContainerAdapter();
			}
			@Override
			public Adapter caseInlineAction(InlineAction object) {
				return createInlineActionAdapter();
			}
			@Override
			public Adapter caseSelectAction(SelectAction object) {
				return createSelectActionAdapter();
			}
			@Override
			public Adapter caseDeleteAction(DeleteAction object) {
				return createDeleteActionAdapter();
			}
			@Override
			public Adapter caseFeatureSupportAction(FeatureSupportAction object) {
				return createFeatureSupportActionAdapter();
			}
			@Override
			public Adapter caseModelReference(ModelReference object) {
				return createModelReferenceAdapter();
			}
			@Override
			public Adapter caseFeatureReference(FeatureReference object) {
				return createFeatureReferenceAdapter();
			}
			@Override
			public Adapter caseCurrentUserReference(CurrentUserReference object) {
				return createCurrentUserReferenceAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseNamedDisplayElement(NamedDisplayElement object) {
				return createNamedDisplayElementAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter casePath(Path object) {
				return createPathAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.WafModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.WafModel
	 * @generated
	 */
	public Adapter createWafModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.Authentication
	 * @generated
	 */
	public Adapter createAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem <em>Local Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem
	 * @generated
	 */
	public Adapter createLocalAuthenticationSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.CasAuthentication <em>Cas Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.CasAuthentication
	 * @generated
	 */
	public Adapter createCasAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.ModelLabel <em>Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.ModelLabel
	 * @generated
	 */
	public Adapter createModelLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature <em>Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.ServiceFeature
	 * @generated
	 */
	public Adapter createServiceFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.ServiceEntityFeature <em>Service Entity Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.ServiceEntityFeature
	 * @generated
	 */
	public Adapter createServiceEntityFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.ServiceEntityElement <em>Service Entity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.ServiceEntityElement
	 * @generated
	 */
	public Adapter createServiceEntityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.ServiceAssociation <em>Service Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.ServiceAssociation
	 * @generated
	 */
	public Adapter createServiceAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.ServiceEntityAssociation <em>Service Entity Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.ServiceEntityAssociation
	 * @generated
	 */
	public Adapter createServiceEntityAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.ServiceViewAssociation <em>Service View Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.ServiceViewAssociation
	 * @generated
	 */
	public Adapter createServiceViewAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.Selection
	 * @generated
	 */
	public Adapter createSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.SelectTarget <em>Select Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.SelectTarget
	 * @generated
	 */
	public Adapter createSelectTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.UnitContainer <em>Unit Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.UnitContainer
	 * @generated
	 */
	public Adapter createUnitContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.UnitTitle <em>Unit Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.UnitTitle
	 * @generated
	 */
	public Adapter createUnitTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.MenuEntry <em>Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.MenuEntry
	 * @generated
	 */
	public Adapter createMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.MenuIncludedFeature <em>Menu Included Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.MenuIncludedFeature
	 * @generated
	 */
	public Adapter createMenuIncludedFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.MenuIncludedElement <em>Menu Included Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.MenuIncludedElement
	 * @generated
	 */
	public Adapter createMenuIncludedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.StaticMenu <em>Static Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.StaticMenu
	 * @generated
	 */
	public Adapter createStaticMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.FixedPageMenuEntry <em>Fixed Page Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.FixedPageMenuEntry
	 * @generated
	 */
	public Adapter createFixedPageMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.FixedActionMenuEntry <em>Fixed Action Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.FixedActionMenuEntry
	 * @generated
	 */
	public Adapter createFixedActionMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.FixedCommandMenuEntry <em>Fixed Command Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.FixedCommandMenuEntry
	 * @generated
	 */
	public Adapter createFixedCommandMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.EditStaticTextMenuEntry <em>Edit Static Text Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.EditStaticTextMenuEntry
	 * @generated
	 */
	public Adapter createEditStaticTextMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.DynamicMenu <em>Dynamic Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicMenu
	 * @generated
	 */
	public Adapter createDynamicMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.ContentUnit <em>Content Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.ContentUnit
	 * @generated
	 */
	public Adapter createContentUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.UnitField <em>Unit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.UnitField
	 * @generated
	 */
	public Adapter createUnitFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.UnitFeature <em>Unit Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.UnitFeature
	 * @generated
	 */
	public Adapter createUnitFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.UnitElement <em>Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.UnitElement
	 * @generated
	 */
	public Adapter createUnitElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.UnitAssociation <em>Unit Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.UnitAssociation
	 * @generated
	 */
	public Adapter createUnitAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.UnitChildFeature <em>Unit Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.UnitChildFeature
	 * @generated
	 */
	public Adapter createUnitChildFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.UnitChildElement <em>Unit Child Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.UnitChildElement
	 * @generated
	 */
	public Adapter createUnitChildElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.UnitChildAssociation <em>Unit Child Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.UnitChildAssociation
	 * @generated
	 */
	public Adapter createUnitChildAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.InterfaceField <em>Interface Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.InterfaceField
	 * @generated
	 */
	public Adapter createInterfaceFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.DataTypeField <em>Data Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.DataTypeField
	 * @generated
	 */
	public Adapter createDataTypeFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.DateField <em>Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.DateField
	 * @generated
	 */
	public Adapter createDateFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.CaptchaField <em>Captcha Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.CaptchaField
	 * @generated
	 */
	public Adapter createCaptchaFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.UnitSupportAction <em>Unit Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.UnitSupportAction
	 * @generated
	 */
	public Adapter createUnitSupportActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.EditUnit <em>Edit Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.EditUnit
	 * @generated
	 */
	public Adapter createEditUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.IncludedFeature <em>Included Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.IncludedFeature
	 * @generated
	 */
	public Adapter createIncludedFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.IncludedElement <em>Included Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.IncludedElement
	 * @generated
	 */
	public Adapter createIncludedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.IncludedAssociation <em>Included Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.IncludedAssociation
	 * @generated
	 */
	public Adapter createIncludedAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.CreateUnit <em>Create Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.CreateUnit
	 * @generated
	 */
	public Adapter createCreateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.CreateUpdateUnit <em>Create Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.CreateUpdateUnit
	 * @generated
	 */
	public Adapter createCreateUpdateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.MapUnit <em>Map Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.MapUnit
	 * @generated
	 */
	public Adapter createMapUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.UpdateUnit <em>Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.UpdateUnit
	 * @generated
	 */
	public Adapter createUpdateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.DataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.DataUnit
	 * @generated
	 */
	public Adapter createDataUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.StaticUnit <em>Static Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.StaticUnit
	 * @generated
	 */
	public Adapter createStaticUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.CommandUnit <em>Command Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.CommandUnit
	 * @generated
	 */
	public Adapter createCommandUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.UserCommand <em>User Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.UserCommand
	 * @generated
	 */
	public Adapter createUserCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.CreateSitemapUnit <em>Create Sitemap Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.CreateSitemapUnit
	 * @generated
	 */
	public Adapter createCreateSitemapUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit <em>Dynamic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.DynamicUnit
	 * @generated
	 */
	public Adapter createDynamicUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.DetailsUnit <em>Details Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.DetailsUnit
	 * @generated
	 */
	public Adapter createDetailsUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.IndexUnit <em>Index Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.IndexUnit
	 * @generated
	 */
	public Adapter createIndexUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.IndexGridUnit <em>Index Grid Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.IndexGridUnit
	 * @generated
	 */
	public Adapter createIndexGridUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.IndexPageDirectionUnit <em>Index Page Direction Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.IndexPageDirectionUnit
	 * @generated
	 */
	public Adapter createIndexPageDirectionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.IndexLineDirectionUnit <em>Index Line Direction Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.IndexLineDirectionUnit
	 * @generated
	 */
	public Adapter createIndexLineDirectionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.ControlUnit <em>Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.ControlUnit
	 * @generated
	 */
	public Adapter createControlUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.SearchUnit <em>Search Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.SearchUnit
	 * @generated
	 */
	public Adapter createSearchUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.ActionUnit <em>Action Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.ActionUnit
	 * @generated
	 */
	public Adapter createActionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.AuthenticationUnit <em>Authentication Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.AuthenticationUnit
	 * @generated
	 */
	public Adapter createAuthenticationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.RegistrationUnit <em>Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.RegistrationUnit
	 * @generated
	 */
	public Adapter createRegistrationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.LoginUnit <em>Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.LoginUnit
	 * @generated
	 */
	public Adapter createLoginUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit <em>Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit
	 * @generated
	 */
	public Adapter createForgottenPasswordUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.InlineActionContainer <em>Inline Action Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.InlineActionContainer
	 * @generated
	 */
	public Adapter createInlineActionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.InlineAction <em>Inline Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.InlineAction
	 * @generated
	 */
	public Adapter createInlineActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.SelectAction <em>Select Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.SelectAction
	 * @generated
	 */
	public Adapter createSelectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.DeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.DeleteAction
	 * @generated
	 */
	public Adapter createDeleteActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.FeatureSupportAction <em>Feature Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.FeatureSupportAction
	 * @generated
	 */
	public Adapter createFeatureSupportActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.ModelReference
	 * @generated
	 */
	public Adapter createModelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.FeatureReference <em>Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.FeatureReference
	 * @generated
	 */
	public Adapter createFeatureReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.waf.CurrentUserReference <em>Current User Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.waf.CurrentUserReference
	 * @generated
	 */
	public Adapter createCurrentUserReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.orm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.orm.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.orm.NamedDisplayElement <em>Named Display Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.orm.NamedDisplayElement
	 * @generated
	 */
	public Adapter createNamedDisplayElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.criteria.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.criteria.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.criteria.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.criteria.Path
	 * @generated
	 */
	public Adapter createPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WafAdapterFactory
