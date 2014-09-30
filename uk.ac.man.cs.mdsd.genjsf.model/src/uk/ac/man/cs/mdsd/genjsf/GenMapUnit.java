/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.jsf.MapUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Map Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenMapUnit#getJsfUnit <em>Jsf Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenMapUnit#getGenLocation <em>Gen Location</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenMapUnit#getGenPlaceName <em>Gen Place Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenMapUnit()
 * @model
 * @generated
 */
public interface GenMapUnit extends GenEditUnit, GenSelectTarget {
	/**
	 * Returns the value of the '<em><b>Jsf Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Unit</em>' reference.
	 * @see #setJsfUnit(MapUnit)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenMapUnit_JsfUnit()
	 * @model required="true"
	 * @generated
	 */
	MapUnit getJsfUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenMapUnit#getJsfUnit <em>Jsf Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Unit</em>' reference.
	 * @see #getJsfUnit()
	 * @generated
	 */
	void setJsfUnit(MapUnit value);

	/**
	 * Returns the value of the '<em><b>Gen Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Location</em>' reference.
	 * @see #setGenLocation(GenServiceEntityElement)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenMapUnit_GenLocation()
	 * @model
	 * @generated
	 */
	GenServiceEntityElement getGenLocation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenMapUnit#getGenLocation <em>Gen Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Location</em>' reference.
	 * @see #getGenLocation()
	 * @generated
	 */
	void setGenLocation(GenServiceEntityElement value);

	/**
	 * Returns the value of the '<em><b>Gen Place Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Place Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Place Name</em>' reference.
	 * @see #setGenPlaceName(GenServiceEntityElement)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenMapUnit_GenPlaceName()
	 * @model
	 * @generated
	 */
	GenServiceEntityElement getGenPlaceName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenMapUnit#getGenPlaceName <em>Gen Place Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Place Name</em>' reference.
	 * @see #getGenPlaceName()
	 * @generated
	 */
	void setGenPlaceName(GenServiceEntityElement value);

} // GenMapUnit
