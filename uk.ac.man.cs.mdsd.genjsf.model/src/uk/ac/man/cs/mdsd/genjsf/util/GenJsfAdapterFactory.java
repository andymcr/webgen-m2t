/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenJsfAdapterFactory.java,v 1.55 2014/08/22 14:32:38 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.gencriteria.GenExpression;
import uk.ac.man.cs.mdsd.gencriteria.GenPath;
import uk.ac.man.cs.mdsd.genjsf.*;

import uk.ac.man.cs.mdsd.genorm.GenOrmModel;
import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage
 * @generated
 */
public class GenJsfAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenJsfPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenJsfAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GenJsfPackage.eINSTANCE;
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
	protected GenJsfSwitch<Adapter> modelSwitch =
		new GenJsfSwitch<Adapter>() {
			@Override
			public Adapter caseGenJsfModel(GenJsfModel object) {
				return createGenJsfModelAdapter();
			}
			@Override
			public Adapter caseGenAuthentication(GenAuthentication object) {
				return createGenAuthenticationAdapter();
			}
			@Override
			public Adapter caseGenCasAuthentication(GenCasAuthentication object) {
				return createGenCasAuthenticationAdapter();
			}
			@Override
			public Adapter caseGenLocalAuthenticationSystem(GenLocalAuthenticationSystem object) {
				return createGenLocalAuthenticationSystemAdapter();
			}
			@Override
			public Adapter caseGenIncludedFeature(GenIncludedFeature object) {
				return createGenIncludedFeatureAdapter();
			}
			@Override
			public Adapter caseGenIncludedElement(GenIncludedElement object) {
				return createGenIncludedElementAdapter();
			}
			@Override
			public Adapter caseGenIncludedAssociation(GenIncludedAssociation object) {
				return createGenIncludedAssociationAdapter();
			}
			@Override
			public Adapter caseGenService(GenService object) {
				return createGenServiceAdapter();
			}
			@Override
			public Adapter caseGenModelLabel(GenModelLabel object) {
				return createGenModelLabelAdapter();
			}
			@Override
			public Adapter caseGenSelection(GenSelection object) {
				return createGenSelectionAdapter();
			}
			@Override
			public Adapter caseGenServiceFeature(GenServiceFeature object) {
				return createGenServiceFeatureAdapter();
			}
			@Override
			public Adapter caseGenServiceEntityFeature(GenServiceEntityFeature object) {
				return createGenServiceEntityFeatureAdapter();
			}
			@Override
			public Adapter caseGenServiceEntityElement(GenServiceEntityElement object) {
				return createGenServiceEntityElementAdapter();
			}
			@Override
			public Adapter caseGenServiceAssociation(GenServiceAssociation object) {
				return createGenServiceAssociationAdapter();
			}
			@Override
			public Adapter caseGenServiceEntityAssociation(GenServiceEntityAssociation object) {
				return createGenServiceEntityAssociationAdapter();
			}
			@Override
			public Adapter caseGenServiceViewAssociation(GenServiceViewAssociation object) {
				return createGenServiceViewAssociationAdapter();
			}
			@Override
			public Adapter caseGenPage(GenPage object) {
				return createGenPageAdapter();
			}
			@Override
			public Adapter caseGenSelectTarget(GenSelectTarget object) {
				return createGenSelectTargetAdapter();
			}
			@Override
			public Adapter caseGenMenu(GenMenu object) {
				return createGenMenuAdapter();
			}
			@Override
			public Adapter caseGenMenuEntry(GenMenuEntry object) {
				return createGenMenuEntryAdapter();
			}
			@Override
			public Adapter caseGenStaticMenu(GenStaticMenu object) {
				return createGenStaticMenuAdapter();
			}
			@Override
			public Adapter caseGenFixedPageMenuEntry(GenFixedPageMenuEntry object) {
				return createGenFixedPageMenuEntryAdapter();
			}
			@Override
			public Adapter caseGenFixedActionMenuEntry(GenFixedActionMenuEntry object) {
				return createGenFixedActionMenuEntryAdapter();
			}
			@Override
			public Adapter caseGenFixedCommandMenuEntry(GenFixedCommandMenuEntry object) {
				return createGenFixedCommandMenuEntryAdapter();
			}
			@Override
			public Adapter caseGenEditStaticTextMenuEntry(GenEditStaticTextMenuEntry object) {
				return createGenEditStaticTextMenuEntryAdapter();
			}
			@Override
			public Adapter caseGenDynamicMenu(GenDynamicMenu object) {
				return createGenDynamicMenuAdapter();
			}
			@Override
			public Adapter caseGenMenuIncludedFeature(GenMenuIncludedFeature object) {
				return createGenMenuIncludedFeatureAdapter();
			}
			@Override
			public Adapter caseGenMenuIncludedElement(GenMenuIncludedElement object) {
				return createGenMenuIncludedElementAdapter();
			}
			@Override
			public Adapter caseGenUnitContainer(GenUnitContainer object) {
				return createGenUnitContainerAdapter();
			}
			@Override
			public Adapter caseGenUnitTitle(GenUnitTitle object) {
				return createGenUnitTitleAdapter();
			}
			@Override
			public Adapter caseGenContentUnit(GenContentUnit object) {
				return createGenContentUnitAdapter();
			}
			@Override
			public Adapter caseGenCreateSitemapUnit(GenCreateSitemapUnit object) {
				return createGenCreateSitemapUnitAdapter();
			}
			@Override
			public Adapter caseGenStaticUnit(GenStaticUnit object) {
				return createGenStaticUnitAdapter();
			}
			@Override
			public Adapter caseGenCommandUnit(GenCommandUnit object) {
				return createGenCommandUnitAdapter();
			}
			@Override
			public Adapter caseGenCommand(GenCommand object) {
				return createGenCommandAdapter();
			}
			@Override
			public Adapter caseGenUserCommand(GenUserCommand object) {
				return createGenUserCommandAdapter();
			}
			@Override
			public Adapter caseGenDynamicUnit(GenDynamicUnit object) {
				return createGenDynamicUnitAdapter();
			}
			@Override
			public Adapter caseGenUnitField(GenUnitField object) {
				return createGenUnitFieldAdapter();
			}
			@Override
			public Adapter caseGenUnitFeature(GenUnitFeature object) {
				return createGenUnitFeatureAdapter();
			}
			@Override
			public Adapter caseGenUnitElement(GenUnitElement object) {
				return createGenUnitElementAdapter();
			}
			@Override
			public Adapter caseGenUnitAssociation(GenUnitAssociation object) {
				return createGenUnitAssociationAdapter();
			}
			@Override
			public Adapter caseGenUnitChildFeature(GenUnitChildFeature object) {
				return createGenUnitChildFeatureAdapter();
			}
			@Override
			public Adapter caseGenUnitChildElement(GenUnitChildElement object) {
				return createGenUnitChildElementAdapter();
			}
			@Override
			public Adapter caseGenUnitChildAssociation(GenUnitChildAssociation object) {
				return createGenUnitChildAssociationAdapter();
			}
			@Override
			public Adapter caseGenInterfaceField(GenInterfaceField object) {
				return createGenInterfaceFieldAdapter();
			}
			@Override
			public Adapter caseGenDataTypeField(GenDataTypeField object) {
				return createGenDataTypeFieldAdapter();
			}
			@Override
			public Adapter caseGenDateField(GenDateField object) {
				return createGenDateFieldAdapter();
			}
			@Override
			public Adapter caseGenCaptchaField(GenCaptchaField object) {
				return createGenCaptchaFieldAdapter();
			}
			@Override
			public Adapter caseGenUnitSupportAction(GenUnitSupportAction object) {
				return createGenUnitSupportActionAdapter();
			}
			@Override
			public Adapter caseGenEditUnit(GenEditUnit object) {
				return createGenEditUnitAdapter();
			}
			@Override
			public Adapter caseGenCreateUnit(GenCreateUnit object) {
				return createGenCreateUnitAdapter();
			}
			@Override
			public Adapter caseGenCreateUpdateUnit(GenCreateUpdateUnit object) {
				return createGenCreateUpdateUnitAdapter();
			}
			@Override
			public Adapter caseGenMapUnit(GenMapUnit object) {
				return createGenMapUnitAdapter();
			}
			@Override
			public Adapter caseGenUpdateUnit(GenUpdateUnit object) {
				return createGenUpdateUnitAdapter();
			}
			@Override
			public Adapter caseGenDataUnit(GenDataUnit object) {
				return createGenDataUnitAdapter();
			}
			@Override
			public Adapter caseGenDetailsUnit(GenDetailsUnit object) {
				return createGenDetailsUnitAdapter();
			}
			@Override
			public Adapter caseGenIndexUnit(GenIndexUnit object) {
				return createGenIndexUnitAdapter();
			}
			@Override
			public Adapter caseGenIndexGridUnit(GenIndexGridUnit object) {
				return createGenIndexGridUnitAdapter();
			}
			@Override
			public Adapter caseGenIndexPageDirectionUnit(GenIndexPageDirectionUnit object) {
				return createGenIndexPageDirectionUnitAdapter();
			}
			@Override
			public Adapter caseGenIndexLineDirectionUnit(GenIndexLineDirectionUnit object) {
				return createGenIndexLineDirectionUnitAdapter();
			}
			@Override
			public Adapter caseGenControlUnit(GenControlUnit object) {
				return createGenControlUnitAdapter();
			}
			@Override
			public Adapter caseGenSearchUnit(GenSearchUnit object) {
				return createGenSearchUnitAdapter();
			}
			@Override
			public Adapter caseGenActionUnit(GenActionUnit object) {
				return createGenActionUnitAdapter();
			}
			@Override
			public Adapter caseGenAuthenticationUnit(GenAuthenticationUnit object) {
				return createGenAuthenticationUnitAdapter();
			}
			@Override
			public Adapter caseGenRegistrationUnit(GenRegistrationUnit object) {
				return createGenRegistrationUnitAdapter();
			}
			@Override
			public Adapter caseGenLoginUnit(GenLoginUnit object) {
				return createGenLoginUnitAdapter();
			}
			@Override
			public Adapter caseGenForgottenPasswordUnit(GenForgottenPasswordUnit object) {
				return createGenForgottenPasswordUnitAdapter();
			}
			@Override
			public Adapter caseGenInlineActionContainer(GenInlineActionContainer object) {
				return createGenInlineActionContainerAdapter();
			}
			@Override
			public Adapter caseGenInlineAction(GenInlineAction object) {
				return createGenInlineActionAdapter();
			}
			@Override
			public Adapter caseGenSelectAction(GenSelectAction object) {
				return createGenSelectActionAdapter();
			}
			@Override
			public Adapter caseGenDeleteAction(GenDeleteAction object) {
				return createGenDeleteActionAdapter();
			}
			@Override
			public Adapter caseGenFeatureSupportAction(GenFeatureSupportAction object) {
				return createGenFeatureSupportActionAdapter();
			}
			@Override
			public Adapter caseGenFeatureReference(GenFeatureReference object) {
				return createGenFeatureReferenceAdapter();
			}
			@Override
			public Adapter caseGenModelReference(GenModelReference object) {
				return createGenModelReferenceAdapter();
			}
			@Override
			public Adapter caseGenCurrentUserReference(GenCurrentUserReference object) {
				return createGenCurrentUserReferenceAdapter();
			}
			@Override
			public Adapter caseGenOrmModel(GenOrmModel object) {
				return createGenOrmModelAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseGenExpression(GenExpression object) {
				return createGenExpressionAdapter();
			}
			@Override
			public Adapter caseGenPath(GenPath object) {
				return createGenPathAdapter();
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
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel
	 * @generated
	 */
	public Adapter createGenJsfModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenAuthentication <em>Gen Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenAuthentication
	 * @generated
	 */
	public Adapter createGenAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenCasAuthentication <em>Gen Cas Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCasAuthentication
	 * @generated
	 */
	public Adapter createGenCasAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem <em>Gen Local Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLocalAuthenticationSystem
	 * @generated
	 */
	public Adapter createGenLocalAuthenticationSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenService <em>Gen Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenService
	 * @generated
	 */
	public Adapter createGenServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenModelLabel <em>Gen Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenModelLabel
	 * @generated
	 */
	public Adapter createGenModelLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceFeature <em>Gen Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceFeature
	 * @generated
	 */
	public Adapter createGenServiceFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityFeature <em>Gen Service Entity Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceEntityFeature
	 * @generated
	 */
	public Adapter createGenServiceEntityFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement <em>Gen Service Entity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceEntityElement
	 * @generated
	 */
	public Adapter createGenServiceEntityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceAssociation <em>Gen Service Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceAssociation
	 * @generated
	 */
	public Adapter createGenServiceAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceEntityAssociation <em>Gen Service Entity Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceEntityAssociation
	 * @generated
	 */
	public Adapter createGenServiceEntityAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceViewAssociation <em>Gen Service View Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceViewAssociation
	 * @generated
	 */
	public Adapter createGenServiceViewAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenSelection <em>Gen Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSelection
	 * @generated
	 */
	public Adapter createGenSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature <em>Gen Included Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature
	 * @generated
	 */
	public Adapter createGenIncludedFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedElement <em>Gen Included Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedElement
	 * @generated
	 */
	public Adapter createGenIncludedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedAssociation <em>Gen Included Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIncludedAssociation
	 * @generated
	 */
	public Adapter createGenIncludedAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenPage <em>Gen Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenPage
	 * @generated
	 */
	public Adapter createGenPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenSelectTarget <em>Gen Select Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSelectTarget
	 * @generated
	 */
	public Adapter createGenSelectTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenMenu <em>Gen Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMenu
	 * @generated
	 */
	public Adapter createGenMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenMenuEntry <em>Gen Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMenuEntry
	 * @generated
	 */
	public Adapter createGenMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenStaticMenu <em>Gen Static Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenStaticMenu
	 * @generated
	 */
	public Adapter createGenStaticMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedPageMenuEntry <em>Gen Fixed Page Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFixedPageMenuEntry
	 * @generated
	 */
	public Adapter createGenFixedPageMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedActionMenuEntry <em>Gen Fixed Action Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFixedActionMenuEntry
	 * @generated
	 */
	public Adapter createGenFixedActionMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenFixedCommandMenuEntry <em>Gen Fixed Command Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFixedCommandMenuEntry
	 * @generated
	 */
	public Adapter createGenFixedCommandMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenEditStaticTextMenuEntry <em>Gen Edit Static Text Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenEditStaticTextMenuEntry
	 * @generated
	 */
	public Adapter createGenEditStaticTextMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedFeature <em>Gen Menu Included Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedFeature
	 * @generated
	 */
	public Adapter createGenMenuIncludedFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedElement <em>Gen Menu Included Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMenuIncludedElement
	 * @generated
	 */
	public Adapter createGenMenuIncludedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu <em>Gen Dynamic Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDynamicMenu
	 * @generated
	 */
	public Adapter createGenDynamicMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitContainer <em>Gen Unit Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitContainer
	 * @generated
	 */
	public Adapter createGenUnitContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitTitle <em>Gen Unit Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitTitle
	 * @generated
	 */
	public Adapter createGenUnitTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenContentUnit <em>Gen Content Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenContentUnit
	 * @generated
	 */
	public Adapter createGenContentUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenCreateSitemapUnit <em>Gen Create Sitemap Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCreateSitemapUnit
	 * @generated
	 */
	public Adapter createGenCreateSitemapUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitField <em>Gen Unit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitField
	 * @generated
	 */
	public Adapter createGenUnitFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitFeature <em>Gen Unit Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitFeature
	 * @generated
	 */
	public Adapter createGenUnitFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitElement <em>Gen Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitElement
	 * @generated
	 */
	public Adapter createGenUnitElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation <em>Gen Unit Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitAssociation
	 * @generated
	 */
	public Adapter createGenUnitAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildFeature <em>Gen Unit Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitChildFeature
	 * @generated
	 */
	public Adapter createGenUnitChildFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildElement <em>Gen Unit Child Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitChildElement
	 * @generated
	 */
	public Adapter createGenUnitChildElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation <em>Gen Unit Child Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitChildAssociation
	 * @generated
	 */
	public Adapter createGenUnitChildAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenInterfaceField <em>Gen Interface Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenInterfaceField
	 * @generated
	 */
	public Adapter createGenInterfaceFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenDataTypeField <em>Gen Data Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDataTypeField
	 * @generated
	 */
	public Adapter createGenDataTypeFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenDateField <em>Gen Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDateField
	 * @generated
	 */
	public Adapter createGenDateFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenCaptchaField <em>Gen Captcha Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCaptchaField
	 * @generated
	 */
	public Adapter createGenCaptchaFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenUnitSupportAction <em>Gen Unit Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUnitSupportAction
	 * @generated
	 */
	public Adapter createGenUnitSupportActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenStaticUnit <em>Gen Static Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenStaticUnit
	 * @generated
	 */
	public Adapter createGenStaticUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenCommandUnit <em>Gen Command Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCommandUnit
	 * @generated
	 */
	public Adapter createGenCommandUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenCommand <em>Gen Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCommand
	 * @generated
	 */
	public Adapter createGenCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenUserCommand <em>Gen User Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUserCommand
	 * @generated
	 */
	public Adapter createGenUserCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit <em>Gen Dynamic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit
	 * @generated
	 */
	public Adapter createGenDynamicUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenEditUnit <em>Gen Edit Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenEditUnit
	 * @generated
	 */
	public Adapter createGenEditUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenCreateUnit <em>Gen Create Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCreateUnit
	 * @generated
	 */
	public Adapter createGenCreateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenCreateUpdateUnit <em>Gen Create Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCreateUpdateUnit
	 * @generated
	 */
	public Adapter createGenCreateUpdateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenMapUnit <em>Gen Map Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenMapUnit
	 * @generated
	 */
	public Adapter createGenMapUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenUpdateUnit <em>Gen Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenUpdateUnit
	 * @generated
	 */
	public Adapter createGenUpdateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenDataUnit <em>Gen Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDataUnit
	 * @generated
	 */
	public Adapter createGenDataUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenDetailsUnit <em>Gen Details Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDetailsUnit
	 * @generated
	 */
	public Adapter createGenDetailsUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenIndexUnit <em>Gen Index Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIndexUnit
	 * @generated
	 */
	public Adapter createGenIndexUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenIndexGridUnit <em>Gen Index Grid Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIndexGridUnit
	 * @generated
	 */
	public Adapter createGenIndexGridUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenIndexPageDirectionUnit <em>Gen Index Page Direction Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIndexPageDirectionUnit
	 * @generated
	 */
	public Adapter createGenIndexPageDirectionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenIndexLineDirectionUnit <em>Gen Index Line Direction Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenIndexLineDirectionUnit
	 * @generated
	 */
	public Adapter createGenIndexLineDirectionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenControlUnit <em>Gen Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenControlUnit
	 * @generated
	 */
	public Adapter createGenControlUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenSearchUnit <em>Gen Search Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSearchUnit
	 * @generated
	 */
	public Adapter createGenSearchUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenActionUnit <em>Gen Action Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenActionUnit
	 * @generated
	 */
	public Adapter createGenActionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenAuthenticationUnit <em>Gen Authentication Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenAuthenticationUnit
	 * @generated
	 */
	public Adapter createGenAuthenticationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit <em>Gen Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenRegistrationUnit
	 * @generated
	 */
	public Adapter createGenRegistrationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenLoginUnit <em>Gen Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenLoginUnit
	 * @generated
	 */
	public Adapter createGenLoginUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit <em>Gen Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenForgottenPasswordUnit
	 * @generated
	 */
	public Adapter createGenForgottenPasswordUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer <em>Gen Inline Action Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenInlineActionContainer
	 * @generated
	 */
	public Adapter createGenInlineActionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenInlineAction <em>Gen Inline Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenInlineAction
	 * @generated
	 */
	public Adapter createGenInlineActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenSelectAction <em>Gen Select Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenSelectAction
	 * @generated
	 */
	public Adapter createGenSelectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenDeleteAction <em>Gen Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDeleteAction
	 * @generated
	 */
	public Adapter createGenDeleteActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenFeatureSupportAction <em>Gen Feature Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFeatureSupportAction
	 * @generated
	 */
	public Adapter createGenFeatureSupportActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenFeatureReference <em>Gen Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenFeatureReference
	 * @generated
	 */
	public Adapter createGenFeatureReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenModelReference <em>Gen Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenModelReference
	 * @generated
	 */
	public Adapter createGenModelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genjsf.GenCurrentUserReference <em>Gen Current User Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenCurrentUserReference
	 * @generated
	 */
	public Adapter createGenCurrentUserReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmModel
	 * @generated
	 */
	public Adapter createGenOrmModelAdapter() {
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
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenExpression <em>Gen Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenExpression
	 * @generated
	 */
	public Adapter createGenExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.gencriteria.GenPath <em>Gen Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.gencriteria.GenPath
	 * @generated
	 */
	public Adapter createGenPathAdapter() {
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

} //GenJsfAdapterFactory
