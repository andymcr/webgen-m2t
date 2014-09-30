/**
 */
package uk.ac.man.cs.mdsd.jsf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.MapUnit#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.MapUnit#getDefaultZoomLevel <em>Default Zoom Level</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.MapUnit#getLocation <em>Location</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.MapUnit#getPlaceName <em>Place Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getMapUnit()
 * @model
 * @generated
 */
public interface MapUnit extends EditUnit, SelectTarget {
	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getMapUnit_ReadOnly()
	 * @model
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.MapUnit#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Zoom Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Zoom Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Zoom Level</em>' attribute.
	 * @see #setDefaultZoomLevel(int)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getMapUnit_DefaultZoomLevel()
	 * @model
	 * @generated
	 */
	int getDefaultZoomLevel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.MapUnit#getDefaultZoomLevel <em>Default Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Zoom Level</em>' attribute.
	 * @see #getDefaultZoomLevel()
	 * @generated
	 */
	void setDefaultZoomLevel(int value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(ServiceEntityElement)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getMapUnit_Location()
	 * @model
	 * @generated
	 */
	ServiceEntityElement getLocation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.MapUnit#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(ServiceEntityElement value);

	/**
	 * Returns the value of the '<em><b>Place Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Name</em>' reference.
	 * @see #setPlaceName(ServiceEntityElement)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getMapUnit_PlaceName()
	 * @model
	 * @generated
	 */
	ServiceEntityElement getPlaceName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.MapUnit#getPlaceName <em>Place Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place Name</em>' reference.
	 * @see #getPlaceName()
	 * @generated
	 */
	void setPlaceName(ServiceEntityElement value);

} // MapUnit
