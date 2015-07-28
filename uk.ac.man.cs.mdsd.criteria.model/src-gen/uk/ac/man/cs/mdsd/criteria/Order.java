/**
 */
package uk.ac.man.cs.mdsd.criteria;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.criteria.Order#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getOrder()
 * @model abstract="true"
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(Path)
	 * @see uk.ac.man.cs.mdsd.criteria.CriteriaPackage#getOrder_Path()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory=''"
	 * @generated
	 */
	Path getPath();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.criteria.Order#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Path value);

} // Order
