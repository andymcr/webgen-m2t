/**
 * <copyright>
 * </copyright>
 *
 * $Id: ContentUnit.java,v 1.16 2013/12/10 17:18:16 andy Exp $
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#isOmitCaption <em>Omit Caption</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getCaptionClass <em>Caption Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getLayoutClass <em>Layout Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit()
 * @model abstract="true"
 * @generated
 */
public interface ContentUnit extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Displayed On</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.UnitContainer#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displayed On</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displayed On</em>' container reference.
	 * @see #setDisplayedOn(UnitContainer)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_DisplayedOn()
	 * @see uk.ac.man.cs.mdsd.waf.UnitContainer#getUnits
	 * @model opposite="units" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UnitContainer getDisplayedOn();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getDisplayedOn <em>Displayed On</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displayed On</em>' container reference.
	 * @see #getDisplayedOn()
	 * @generated
	 */
	void setDisplayedOn(UnitContainer value);

	/**
	 * Returns the value of the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose Summary</em>' attribute.
	 * @see #setPurposeSummary(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_PurposeSummary()
	 * @model ordered="false"
	 * @generated
	 */
	String getPurposeSummary();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose Summary</em>' attribute.
	 * @see #getPurposeSummary()
	 * @generated
	 */
	void setPurposeSummary(String value);

	/**
	 * Returns the value of the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Caption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Caption</em>' attribute.
	 * @see #setOmitCaption(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_OmitCaption()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isOmitCaption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#isOmitCaption <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Caption</em>' attribute.
	 * @see #isOmitCaption()
	 * @generated
	 */
	void setOmitCaption(boolean value);

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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_StyleClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Layout Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Class</em>' attribute.
	 * @see #setLayoutClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_LayoutClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLayoutClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getLayoutClass <em>Layout Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Class</em>' attribute.
	 * @see #getLayoutClass()
	 * @generated
	 */
	void setLayoutClass(String value);

	/**
	 * Returns the value of the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Class</em>' attribute.
	 * @see #setCaptionClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getContentUnit_CaptionClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCaptionClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getCaptionClass <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Class</em>' attribute.
	 * @see #getCaptionClass()
	 * @generated
	 */
	void setCaptionClass(String value);

} // ContentUnit
