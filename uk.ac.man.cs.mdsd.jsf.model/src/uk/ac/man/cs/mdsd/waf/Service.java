/**
 * <copyright>
 * </copyright>
 *
 * $Id: Service.java,v 1.12 2014/03/04 19:42:05 andy Exp $
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.orm.Entity;
import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getEntities <em>Entities</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getDaosUsed <em>Daos Used</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getModelName <em>Model Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#isView <em>View</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getViewName <em>View Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getDisplayLabels <em>Display Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getSelections <em>Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getAccessedBy <em>Accessed By</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.orm.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_Entities()
	 * @model required="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Selections</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.Selection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selections</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_Selections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Selection> getSelections();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.ServiceFeature}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getIncludedBy <em>Included By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_Features()
	 * @see uk.ac.man.cs.mdsd.waf.ServiceFeature#getIncludedBy
	 * @model opposite="includedBy" containment="true"
	 * @generated
	 */
	EList<ServiceFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Accessed By</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.DynamicUnit}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessed By</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_AccessedBy()
	 * @see uk.ac.man.cs.mdsd.waf.DynamicUnit#getService
	 * @model opposite="service"
	 * @generated
	 */
	EList<DynamicUnit> getAccessedBy();

	/**
	 * Returns the value of the '<em><b>Daos Used</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.orm.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daos Used</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daos Used</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_DaosUsed()
	 * @model required="true"
	 * @generated
	 */
	EList<Entity> getDaosUsed();

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_ModelName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Service#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' attribute.
	 * @see #setView(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_View()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isView();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Service#isView <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' attribute.
	 * @see #isView()
	 * @generated
	 */
	void setView(boolean value);

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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_ViewName()
	 * @model ordered="false"
	 * @generated
	 */
	String getViewName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Service#getViewName <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Name</em>' attribute.
	 * @see #getViewName()
	 * @generated
	 */
	void setViewName(String value);

	/**
	 * Returns the value of the '<em><b>Display Labels</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.ModelLabel}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.ModelLabel#getLabelFor <em>Label For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Labels</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_DisplayLabels()
	 * @see uk.ac.man.cs.mdsd.waf.ModelLabel#getLabelFor
	 * @model opposite="labelFor" containment="true"
	 * @generated
	 */
	EList<ModelLabel> getDisplayLabels();

} // Service
