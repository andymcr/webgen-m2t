/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenService.java,v 1.18 2014/06/27 07:51:41 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.common.util.EList;
import uk.ac.man.cs.mdsd.genorm.GenEntity;
import uk.ac.man.cs.mdsd.jsf.Service;
import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenService#getJsfService <em>Jsf Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenService#getGenEntities <em>Gen Entities</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenService#getGenDisplayLabels <em>Gen Display Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenService#getGenSelections <em>Gen Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenService#getGenFeatures <em>Gen Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenService#getGenAccessedBy <em>Gen Accessed By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenService#getDefaultViewName <em>Default View Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenService#getViewName <em>View Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenService()
 * @model
 * @generated
 */
public interface GenService extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Jsf Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Service</em>' reference.
	 * @see #setJsfService(Service)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenService_JsfService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Service getJsfService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenService#getJsfService <em>Jsf Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Service</em>' reference.
	 * @see #getJsfService()
	 * @generated
	 */
	void setJsfService(Service value);


	/**
	 * Returns the value of the '<em><b>Gen Entities</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genorm.GenEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Entities</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenService_GenEntities()
	 * @model required="true"
	 * @generated
	 */
	EList<GenEntity> getGenEntities();

	/**
	 * Returns the value of the '<em><b>Gen Display Labels</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenModelLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Display Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Display Labels</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenService_GenDisplayLabels()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenModelLabel> getGenDisplayLabels();

	/**
	 * Returns the value of the '<em><b>Gen Selections</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenSelection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Selections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Selections</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenService_GenSelections()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenSelection> getGenSelections();

	/**
	 * Returns the value of the '<em><b>Gen Features</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenServiceFeature}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceFeature#getGenIncludedBy <em>Gen Included By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Features</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenService_GenFeatures()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenServiceFeature#getGenIncludedBy
	 * @model opposite="genIncludedBy" containment="true"
	 * @generated
	 */
	EList<GenServiceFeature> getGenFeatures();

	/**
	 * Returns the value of the '<em><b>Gen Accessed By</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit#getGenService <em>Gen Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Accessed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Accessed By</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenService_GenAccessedBy()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenDynamicUnit#getGenService
	 * @model opposite="genService"
	 * @generated
	 */
	EList<GenDynamicUnit> getGenAccessedBy();

	/**
	 * Returns the value of the '<em><b>Default View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default View Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default View Name</em>' attribute.
	 * @see #setDefaultViewName(String)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenService_DefaultViewName()
	 * @model
	 * @generated
	 */
	String getDefaultViewName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenService#getDefaultViewName <em>Default View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default View Name</em>' attribute.
	 * @see #getDefaultViewName()
	 * @generated
	 */
	void setDefaultViewName(String value);

	/**
	 * Returns the value of the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Name</em>' attribute.
	 * @see #setViewName(String)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenService_ViewName()
	 * @model
	 * @generated
	 */
	String getViewName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenService#getViewName <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Name</em>' attribute.
	 * @see #getViewName()
	 * @generated
	 */
	void setViewName(String value);

	/**
	 * @generated NOT
	 */
	void reconcile(final GenService oldGenService);
} // GenService
