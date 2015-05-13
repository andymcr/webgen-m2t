/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.criteria.Order;
import uk.ac.man.cs.mdsd.criteria.Predicate;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Selection#getJoins <em>Joins</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Selection#getFilter <em>Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Selection#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Selection#getLimit <em>Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Joins</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.ServiceAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joins</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelection_Joins()
	 * @model
	 * @generated
	 */
	EList<ServiceAssociation> getJoins();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(Predicate)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelection_Filter()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Predicate getFilter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Selection#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Predicate value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.criteria.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelection_Ordering()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrdering();

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(int)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelection_Limit()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	int getLimit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Selection#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(int value);

} // Selection
