/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenOrmSwitch.java,v 1.12 2014/06/27 07:52:20 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import uk.ac.man.cs.mdsd.genorm.*;
import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage
 * @generated
 */
public class GenOrmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenOrmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenOrmSwitch() {
		if (modelPackage == null) {
			modelPackage = GenOrmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GenOrmPackage.GEN_ORM_MODEL: {
				GenOrmModel genOrmModel = (GenOrmModel)theEObject;
				T result = caseGenOrmModel(genOrmModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_COLLECTION_TYPE: {
				GenCollectionType genCollectionType = (GenCollectionType)theEObject;
				T result = caseGenCollectionType(genCollectionType);
				if (result == null) result = caseNamedElement(genCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_CLASSIFIER: {
				GenClassifier genClassifier = (GenClassifier)theEObject;
				T result = caseGenClassifier(genClassifier);
				if (result == null) result = caseNamedElement(genClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_DATA_TYPE: {
				GenDataType genDataType = (GenDataType)theEObject;
				T result = caseGenDataType(genDataType);
				if (result == null) result = caseGenClassifier(genDataType);
				if (result == null) result = caseNamedElement(genDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_ENTITY: {
				GenEntity genEntity = (GenEntity)theEObject;
				T result = caseGenEntity(genEntity);
				if (result == null) result = caseGenClassifier(genEntity);
				if (result == null) result = caseNamedElement(genEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_FEATURE: {
				GenFeature genFeature = (GenFeature)theEObject;
				T result = caseGenFeature(genFeature);
				if (result == null) result = caseNamedElement(genFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_ATTRIBUTE: {
				GenAttribute genAttribute = (GenAttribute)theEObject;
				T result = caseGenAttribute(genAttribute);
				if (result == null) result = caseGenFeature(genAttribute);
				if (result == null) result = caseNamedElement(genAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_SINGLETON_ATTRIBUTE: {
				GenSingletonAttribute genSingletonAttribute = (GenSingletonAttribute)theEObject;
				T result = caseGenSingletonAttribute(genSingletonAttribute);
				if (result == null) result = caseGenAttribute(genSingletonAttribute);
				if (result == null) result = caseGenFeature(genSingletonAttribute);
				if (result == null) result = caseNamedElement(genSingletonAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_COLLECTION_ATTRIBUTE: {
				GenCollectionAttribute genCollectionAttribute = (GenCollectionAttribute)theEObject;
				T result = caseGenCollectionAttribute(genCollectionAttribute);
				if (result == null) result = caseGenAttribute(genCollectionAttribute);
				if (result == null) result = caseGenFeature(genCollectionAttribute);
				if (result == null) result = caseNamedElement(genCollectionAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_SINGLETON_ELEMENT: {
				GenSingletonElement genSingletonElement = (GenSingletonElement)theEObject;
				T result = caseGenSingletonElement(genSingletonElement);
				if (result == null) result = caseGenSingletonAttribute(genSingletonElement);
				if (result == null) result = caseGenAttribute(genSingletonElement);
				if (result == null) result = caseGenFeature(genSingletonElement);
				if (result == null) result = caseNamedElement(genSingletonElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_COLLECTION_ELEMENT: {
				GenCollectionElement genCollectionElement = (GenCollectionElement)theEObject;
				T result = caseGenCollectionElement(genCollectionElement);
				if (result == null) result = caseGenCollectionAttribute(genCollectionElement);
				if (result == null) result = caseGenAttribute(genCollectionElement);
				if (result == null) result = caseGenFeature(genCollectionElement);
				if (result == null) result = caseNamedElement(genCollectionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_SINGLETON_DATE: {
				GenSingletonDate genSingletonDate = (GenSingletonDate)theEObject;
				T result = caseGenSingletonDate(genSingletonDate);
				if (result == null) result = caseGenSingletonAttribute(genSingletonDate);
				if (result == null) result = caseGenAttribute(genSingletonDate);
				if (result == null) result = caseGenFeature(genSingletonDate);
				if (result == null) result = caseNamedElement(genSingletonDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_COLLECTION_DATE: {
				GenCollectionDate genCollectionDate = (GenCollectionDate)theEObject;
				T result = caseGenCollectionDate(genCollectionDate);
				if (result == null) result = caseGenCollectionAttribute(genCollectionDate);
				if (result == null) result = caseGenAttribute(genCollectionDate);
				if (result == null) result = caseGenFeature(genCollectionDate);
				if (result == null) result = caseNamedElement(genCollectionDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_SINGLETON_RESOURCE: {
				GenSingletonResource genSingletonResource = (GenSingletonResource)theEObject;
				T result = caseGenSingletonResource(genSingletonResource);
				if (result == null) result = caseGenSingletonAttribute(genSingletonResource);
				if (result == null) result = caseGenAttribute(genSingletonResource);
				if (result == null) result = caseGenFeature(genSingletonResource);
				if (result == null) result = caseNamedElement(genSingletonResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_SINGLETON_FILE: {
				GenSingletonFile genSingletonFile = (GenSingletonFile)theEObject;
				T result = caseGenSingletonFile(genSingletonFile);
				if (result == null) result = caseGenSingletonResource(genSingletonFile);
				if (result == null) result = caseGenSingletonAttribute(genSingletonFile);
				if (result == null) result = caseGenAttribute(genSingletonFile);
				if (result == null) result = caseGenFeature(genSingletonFile);
				if (result == null) result = caseNamedElement(genSingletonFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_SINGLETON_IMAGE: {
				GenSingletonImage genSingletonImage = (GenSingletonImage)theEObject;
				T result = caseGenSingletonImage(genSingletonImage);
				if (result == null) result = caseGenSingletonResource(genSingletonImage);
				if (result == null) result = caseGenSingletonAttribute(genSingletonImage);
				if (result == null) result = caseGenAttribute(genSingletonImage);
				if (result == null) result = caseGenFeature(genSingletonImage);
				if (result == null) result = caseNamedElement(genSingletonImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_SINGLETON_LOCATION: {
				GenSingletonLocation genSingletonLocation = (GenSingletonLocation)theEObject;
				T result = caseGenSingletonLocation(genSingletonLocation);
				if (result == null) result = caseGenSingletonAttribute(genSingletonLocation);
				if (result == null) result = caseGenAttribute(genSingletonLocation);
				if (result == null) result = caseGenFeature(genSingletonLocation);
				if (result == null) result = caseNamedElement(genSingletonLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_ASSOCIATION: {
				GenAssociation genAssociation = (GenAssociation)theEObject;
				T result = caseGenAssociation(genAssociation);
				if (result == null) result = caseGenFeature(genAssociation);
				if (result == null) result = caseNamedElement(genAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_SINGLETON_ASSOCIATION: {
				GenSingletonAssociation genSingletonAssociation = (GenSingletonAssociation)theEObject;
				T result = caseGenSingletonAssociation(genSingletonAssociation);
				if (result == null) result = caseGenAssociation(genSingletonAssociation);
				if (result == null) result = caseGenFeature(genSingletonAssociation);
				if (result == null) result = caseNamedElement(genSingletonAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenOrmPackage.GEN_COLLECTION_ASSOCIATION: {
				GenCollectionAssociation genCollectionAssociation = (GenCollectionAssociation)theEObject;
				T result = caseGenCollectionAssociation(genCollectionAssociation);
				if (result == null) result = caseGenAssociation(genCollectionAssociation);
				if (result == null) result = caseGenFeature(genCollectionAssociation);
				if (result == null) result = caseNamedElement(genCollectionAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenOrmModel(GenOrmModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCollectionType(GenCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenClassifier(GenClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDataType(GenDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenEntity(GenEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenFeature(GenFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenAttribute(GenAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Singleton Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Singleton Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenSingletonAttribute(GenSingletonAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Collection Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Collection Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCollectionAttribute(GenCollectionAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Singleton Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Singleton Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenSingletonElement(GenSingletonElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Collection Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Collection Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCollectionElement(GenCollectionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Singleton Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Singleton Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenSingletonDate(GenSingletonDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Collection Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Collection Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCollectionDate(GenCollectionDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Singleton Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Singleton Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenSingletonResource(GenSingletonResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Singleton File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Singleton File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenSingletonFile(GenSingletonFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Singleton Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Singleton Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenSingletonImage(GenSingletonImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Singleton Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Singleton Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenSingletonLocation(GenSingletonLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenAssociation(GenAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Singleton Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Singleton Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenSingletonAssociation(GenSingletonAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Collection Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Collection Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenCollectionAssociation(GenCollectionAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GenOrmSwitch
