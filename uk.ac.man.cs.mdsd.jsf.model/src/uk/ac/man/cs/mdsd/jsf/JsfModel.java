/**
 * <copyright>
 * </copyright>
 *
 * $Id: JsfModel.java,v 1.11 2013/12/12 23:05:17 andy Exp $
 */
package uk.ac.man.cs.mdsd.jsf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.orm.OrmModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getProperties <em>Properties</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getServices <em>Services</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getPages <em>Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getMenus <em>Menus</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel()
 * @model
 * @generated
 */
public interface JsfModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(JsfProperties)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_Properties()
	 * @model containment="true"
	 * @generated
	 */
	JsfProperties getProperties();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(JsfProperties value);

	/**
	 * Returns the value of the '<em><b>Persistence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence</em>' reference.
	 * @see #setPersistence(OrmModel)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_Persistence()
	 * @model required="true"
	 * @generated
	 */
	OrmModel getPersistence();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getPersistence <em>Persistence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence</em>' reference.
	 * @see #getPersistence()
	 * @generated
	 */
	void setPersistence(OrmModel value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.jsf.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.jsf.Page}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.jsf.Page#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_Pages()
	 * @see uk.ac.man.cs.mdsd.jsf.Page#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.jsf.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getJsfModel_Menus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenus();

} // JsfModel
