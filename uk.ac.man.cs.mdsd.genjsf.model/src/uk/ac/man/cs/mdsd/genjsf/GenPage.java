/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenPage.java,v 1.13 2014/01/25 17:38:19 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.jsf.Page;
import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getGenPartOf <em>Gen Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getJsfPage <em>Jsf Page</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getGenParentPage <em>Gen Parent Page</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getGenChildPages <em>Gen Child Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getGenSideMenu <em>Gen Side Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenPage()
 * @model
 * @generated
 */
public interface GenPage extends NamedElement, GenUnitContainer {
	/**
	 * Returns the value of the '<em><b>Jsf Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Page</em>' reference.
	 * @see #setJsfPage(Page)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenPage_JsfPage()
	 * @model required="true"
	 * @generated
	 */
	Page getJsfPage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getJsfPage <em>Jsf Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Page</em>' reference.
	 * @see #getJsfPage()
	 * @generated
	 */
	void setJsfPage(Page value);

	/**
	 * Returns the value of the '<em><b>Gen Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenPages <em>Gen Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Part Of</em>' container reference.
	 * @see #setGenPartOf(GenJsfModel)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenPage_GenPartOf()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenPages
	 * @model opposite="genPages" transient="false"
	 * @generated
	 */
	GenJsfModel getGenPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getGenPartOf <em>Gen Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Part Of</em>' container reference.
	 * @see #getGenPartOf()
	 * @generated
	 */
	void setGenPartOf(GenJsfModel value);

	/**
	 * Returns the value of the '<em><b>Gen Parent Page</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getGenChildPages <em>Gen Child Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Parent Page</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Parent Page</em>' reference.
	 * @see #setGenParentPage(GenPage)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenPage_GenParentPage()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenPage#getGenChildPages
	 * @model opposite="genChildPages"
	 * @generated
	 */
	GenPage getGenParentPage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getGenParentPage <em>Gen Parent Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Parent Page</em>' reference.
	 * @see #getGenParentPage()
	 * @generated
	 */
	void setGenParentPage(GenPage value);

	/**
	 * Returns the value of the '<em><b>Gen Child Pages</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenPage}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getGenParentPage <em>Gen Parent Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Child Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Child Pages</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenPage_GenChildPages()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenPage#getGenParentPage
	 * @model opposite="genParentPage"
	 * @generated
	 */
	EList<GenPage> getGenChildPages();

	/**
	 * Returns the value of the '<em><b>Gen Side Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Side Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Side Menu</em>' reference.
	 * @see #setGenSideMenu(GenMenu)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenPage_GenSideMenu()
	 * @model ordered="false"
	 * @generated
	 */
	GenMenu getGenSideMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getGenSideMenu <em>Gen Side Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Side Menu</em>' reference.
	 * @see #getGenSideMenu()
	 * @generated
	 */
	void setGenSideMenu(GenMenu value);

	void reconcile(final GenPage oldGenPage);
} // GenPage
