/**
 */
package uk.ac.man.cs.mdsd.gencriteria;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.criteria.Order;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.GenOrder#getCriteriaOrder <em>Criteria Order</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.gencriteria.GenOrder#getGenPath <em>Gen Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenOrder()
 * @model
 * @generated
 */
public interface GenOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Criteria Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Order</em>' reference.
	 * @see #setCriteriaOrder(Order)
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenOrder_CriteriaOrder()
	 * @model ordered="false"
	 * @generated
	 */
	Order getCriteriaOrder();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.gencriteria.GenOrder#getCriteriaOrder <em>Criteria Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Order</em>' reference.
	 * @see #getCriteriaOrder()
	 * @generated
	 */
	void setCriteriaOrder(Order value);

	/**
	 * Returns the value of the '<em><b>Gen Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Path</em>' containment reference.
	 * @see #setGenPath(GenPath)
	 * @see uk.ac.man.cs.mdsd.gencriteria.GencriteriaPackage#getGenOrder_GenPath()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	GenPath getGenPath();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.gencriteria.GenOrder#getGenPath <em>Gen Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Path</em>' containment reference.
	 * @see #getGenPath()
	 * @generated
	 */
	void setGenPath(GenPath value);

} // GenOrder
