/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenOrmAdapterFactory.java,v 1.11 2014/06/27 07:52:20 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.genorm.*;
import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage
 * @generated
 */
public class GenOrmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenOrmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenOrmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GenOrmPackage.eINSTANCE;
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
	protected GenOrmSwitch<Adapter> modelSwitch =
		new GenOrmSwitch<Adapter>() {
			@Override
			public Adapter caseGenOrmModel(GenOrmModel object) {
				return createGenOrmModelAdapter();
			}
			@Override
			public Adapter caseGenCollectionType(GenCollectionType object) {
				return createGenCollectionTypeAdapter();
			}
			@Override
			public Adapter caseGenClassifier(GenClassifier object) {
				return createGenClassifierAdapter();
			}
			@Override
			public Adapter caseGenDataType(GenDataType object) {
				return createGenDataTypeAdapter();
			}
			@Override
			public Adapter caseGenEntity(GenEntity object) {
				return createGenEntityAdapter();
			}
			@Override
			public Adapter caseGenFeature(GenFeature object) {
				return createGenFeatureAdapter();
			}
			@Override
			public Adapter caseGenAttribute(GenAttribute object) {
				return createGenAttributeAdapter();
			}
			@Override
			public Adapter caseGenSingletonAttribute(GenSingletonAttribute object) {
				return createGenSingletonAttributeAdapter();
			}
			@Override
			public Adapter caseGenCollectionAttribute(GenCollectionAttribute object) {
				return createGenCollectionAttributeAdapter();
			}
			@Override
			public Adapter caseGenSingletonElement(GenSingletonElement object) {
				return createGenSingletonElementAdapter();
			}
			@Override
			public Adapter caseGenCollectionElement(GenCollectionElement object) {
				return createGenCollectionElementAdapter();
			}
			@Override
			public Adapter caseGenSingletonDate(GenSingletonDate object) {
				return createGenSingletonDateAdapter();
			}
			@Override
			public Adapter caseGenCollectionDate(GenCollectionDate object) {
				return createGenCollectionDateAdapter();
			}
			@Override
			public Adapter caseGenSingletonFile(GenSingletonFile object) {
				return createGenSingletonFileAdapter();
			}
			@Override
			public Adapter caseGenSingletonLocation(GenSingletonLocation object) {
				return createGenSingletonLocationAdapter();
			}
			@Override
			public Adapter caseGenAssociation(GenAssociation object) {
				return createGenAssociationAdapter();
			}
			@Override
			public Adapter caseGenSingletonAssociation(GenSingletonAssociation object) {
				return createGenSingletonAssociationAdapter();
			}
			@Override
			public Adapter caseGenCollectionAssociation(GenCollectionAssociation object) {
				return createGenCollectionAssociationAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionType <em>Gen Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionType
	 * @generated
	 */
	public Adapter createGenCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenClassifier <em>Gen Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenClassifier
	 * @generated
	 */
	public Adapter createGenClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenDataType <em>Gen Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenDataType
	 * @generated
	 */
	public Adapter createGenDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenEntity <em>Gen Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenEntity
	 * @generated
	 */
	public Adapter createGenEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenFeature <em>Gen Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenFeature
	 * @generated
	 */
	public Adapter createGenFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenAttribute <em>Gen Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenAttribute
	 * @generated
	 */
	public Adapter createGenAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAttribute <em>Gen Singleton Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonAttribute
	 * @generated
	 */
	public Adapter createGenSingletonAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAttribute <em>Gen Collection Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionAttribute
	 * @generated
	 */
	public Adapter createGenCollectionAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonElement <em>Gen Singleton Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonElement
	 * @generated
	 */
	public Adapter createGenSingletonElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionElement <em>Gen Collection Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionElement
	 * @generated
	 */
	public Adapter createGenCollectionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonDate <em>Gen Singleton Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonDate
	 * @generated
	 */
	public Adapter createGenSingletonDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionDate <em>Gen Collection Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionDate
	 * @generated
	 */
	public Adapter createGenCollectionDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonFile <em>Gen Singleton File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonFile
	 * @generated
	 */
	public Adapter createGenSingletonFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonLocation <em>Gen Singleton Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonLocation
	 * @generated
	 */
	public Adapter createGenSingletonLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenAssociation <em>Gen Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenAssociation
	 * @generated
	 */
	public Adapter createGenAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation <em>Gen Singleton Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenSingletonAssociation
	 * @generated
	 */
	public Adapter createGenSingletonAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation <em>Gen Collection Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.genorm.GenCollectionAssociation
	 * @generated
	 */
	public Adapter createGenCollectionAssociationAdapter() {
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

} //GenOrmAdapterFactory
