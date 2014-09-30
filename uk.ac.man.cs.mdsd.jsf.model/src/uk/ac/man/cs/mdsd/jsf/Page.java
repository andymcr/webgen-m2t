/**
 * <copyright>
 * </copyright>
 *
 * $Id: Page.java,v 1.22 2013/12/12 23:05:17 andy Exp $
 */
package uk.ac.man.cs.mdsd.jsf;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.Page#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.Page#getParentPage <em>Parent Page</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.Page#getChildPages <em>Child Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.Page#getAuthenticated <em>Authenticated</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.Page#getTopMenuOption <em>Top Menu Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.Page#getTopMenuRank <em>Top Menu Rank</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.Page#getNavigationLabel <em>Navigation Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.Page#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.Page#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends NamedDisplayElement, UnitContainer {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.jsf.JsfModel#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(JsfModel)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getPage_PartOf()
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel#getPages
	 * @model opposite="pages" transient="false"
	 * @generated
	 */
	JsfModel getPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.Page#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(JsfModel value);

	/**
	 * Returns the value of the '<em><b>Parent Page</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.jsf.Page#getChildPages <em>Child Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Page</em>' reference.
	 * @see #setParentPage(Page)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getPage_ParentPage()
	 * @see uk.ac.man.cs.mdsd.jsf.Page#getChildPages
	 * @model opposite="childPages"
	 * @generated
	 */
	Page getParentPage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.Page#getParentPage <em>Parent Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Page</em>' reference.
	 * @see #getParentPage()
	 * @generated
	 */
	void setParentPage(Page value);

	/**
	 * Returns the value of the '<em><b>Child Pages</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.jsf.Page}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.jsf.Page#getParentPage <em>Parent Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Pages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Pages</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getPage_ChildPages()
	 * @see uk.ac.man.cs.mdsd.jsf.Page#getParentPage
	 * @model opposite="parentPage"
	 * @generated
	 */
	EList<Page> getChildPages();

	/**
	 * Returns the value of the '<em><b>Navigation Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Label</em>' attribute.
	 * @see #setNavigationLabel(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getPage_NavigationLabel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNavigationLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.Page#getNavigationLabel <em>Navigation Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Label</em>' attribute.
	 * @see #getNavigationLabel()
	 * @generated
	 */
	void setNavigationLabel(String value);

	/**
	 * Returns the value of the '<em><b>Side Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Menu</em>' reference.
	 * @see #setSideMenu(Menu)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getPage_SideMenu()
	 * @model ordered="false"
	 * @generated
	 */
	Menu getSideMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.Page#getSideMenu <em>Side Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Menu</em>' reference.
	 * @see #getSideMenu()
	 * @generated
	 */
	void setSideMenu(Menu value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getPage_StyleClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.Page#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authenticated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authenticated</em>' attribute.
	 * @see #setAuthenticated(Boolean)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getPage_Authenticated()
	 * @model ordered="false"
	 * @generated
	 */
	Boolean getAuthenticated();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.Page#getAuthenticated <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticated</em>' attribute.
	 * @see #getAuthenticated()
	 * @generated
	 */
	void setAuthenticated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Top Menu Option</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.jsf.PageTopMenuOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Menu Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Menu Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.jsf.PageTopMenuOptions
	 * @see #setTopMenuOption(PageTopMenuOptions)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getPage_TopMenuOption()
	 * @model required="true"
	 * @generated
	 */
	PageTopMenuOptions getTopMenuOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.Page#getTopMenuOption <em>Top Menu Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Menu Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.jsf.PageTopMenuOptions
	 * @see #getTopMenuOption()
	 * @generated
	 */
	void setTopMenuOption(PageTopMenuOptions value);

	/**
	 * Returns the value of the '<em><b>Top Menu Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Menu Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Menu Rank</em>' attribute.
	 * @see #setTopMenuRank(int)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getPage_TopMenuRank()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getTopMenuRank();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.Page#getTopMenuRank <em>Top Menu Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Menu Rank</em>' attribute.
	 * @see #getTopMenuRank()
	 * @generated
	 */
	void setTopMenuRank(int value);

} // Page
