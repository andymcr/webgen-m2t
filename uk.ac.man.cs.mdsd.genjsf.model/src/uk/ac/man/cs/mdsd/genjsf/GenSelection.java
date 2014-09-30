/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.gencriteria.GenOrder;
import uk.ac.man.cs.mdsd.gencriteria.GenPredicate;

import uk.ac.man.cs.mdsd.jsf.Selection;
import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenSelection#getJsfSelection <em>Jsf Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenSelection#getGenFilter <em>Gen Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenSelection#getGenOrdering <em>Gen Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenSelection()
 * @model
 * @generated
 */
public interface GenSelection extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Jsf Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Selection</em>' reference.
	 * @see #setJsfSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenSelection_JsfSelection()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Selection getJsfSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenSelection#getJsfSelection <em>Jsf Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Selection</em>' reference.
	 * @see #getJsfSelection()
	 * @generated
	 */
	void setJsfSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Gen Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Filter</em>' containment reference.
	 * @see #setGenFilter(GenPredicate)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenSelection_GenFilter()
	 * @model containment="true"
	 * @generated
	 */
	GenPredicate getGenFilter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenSelection#getGenFilter <em>Gen Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Filter</em>' containment reference.
	 * @see #getGenFilter()
	 * @generated
	 */
	void setGenFilter(GenPredicate value);

	/**
	 * Returns the value of the '<em><b>Gen Ordering</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.gencriteria.GenOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Ordering</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Ordering</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenSelection_GenOrdering()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenOrder> getGenOrdering();

} // GenSelection
