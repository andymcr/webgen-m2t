/**
 */
package uk.ac.man.cs.mdsd.jsf;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#getDisplayOption <em>Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#getLinkedAction <em>Linked Action</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#getMaximumDisplaySize <em>Maximum Display Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#isAutofocus <em>Autofocus</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getUnitFeature()
 * @model abstract="true"
 * @generated
 */
public interface UnitFeature extends NamedElement, IncludedFeature, UnitField, InlineActionContainer {
	/**
	 * Returns the value of the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Only Display When Not Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Display When Not Empty</em>' attribute.
	 * @see #setOnlyDisplayWhenNotEmpty(boolean)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getUnitFeature_OnlyDisplayWhenNotEmpty()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isOnlyDisplayWhenNotEmpty();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Display When Not Empty</em>' attribute.
	 * @see #isOnlyDisplayWhenNotEmpty()
	 * @generated
	 */
	void setOnlyDisplayWhenNotEmpty(boolean value);

	/**
	 * Returns the value of the '<em><b>Display Option</b></em>' attribute.
	 * The default value is <code>"LineDirection"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.jsf.CollectionDisplayOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.jsf.CollectionDisplayOptions
	 * @see #setDisplayOption(CollectionDisplayOptions)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getUnitFeature_DisplayOption()
	 * @model default="LineDirection" ordered="false"
	 * @generated
	 */
	CollectionDisplayOptions getDisplayOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#getDisplayOption <em>Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.jsf.CollectionDisplayOptions
	 * @see #getDisplayOption()
	 * @generated
	 */
	void setDisplayOption(CollectionDisplayOptions value);

	/**
	 * Returns the value of the '<em><b>Linked Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Action</em>' reference.
	 * @see #setLinkedAction(SelectAction)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getUnitFeature_LinkedAction()
	 * @model ordered="false"
	 * @generated
	 */
	SelectAction getLinkedAction();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#getLinkedAction <em>Linked Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Action</em>' reference.
	 * @see #getLinkedAction()
	 * @generated
	 */
	void setLinkedAction(SelectAction value);

	/**
	 * Returns the value of the '<em><b>Maximum Display Size</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Display Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Display Size</em>' attribute.
	 * @see #setMaximumDisplaySize(int)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getUnitFeature_MaximumDisplaySize()
	 * @model default="-1" ordered="false"
	 * @generated
	 */
	int getMaximumDisplaySize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#getMaximumDisplaySize <em>Maximum Display Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Display Size</em>' attribute.
	 * @see #getMaximumDisplaySize()
	 * @generated
	 */
	void setMaximumDisplaySize(int value);

	/**
	 * Returns the value of the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autofocus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autofocus</em>' attribute.
	 * @see #setAutofocus(boolean)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getUnitFeature_Autofocus()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isAutofocus();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.UnitFeature#isAutofocus <em>Autofocus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autofocus</em>' attribute.
	 * @see #isAutofocus()
	 * @generated
	 */
	void setAutofocus(boolean value);

} // UnitFeature
