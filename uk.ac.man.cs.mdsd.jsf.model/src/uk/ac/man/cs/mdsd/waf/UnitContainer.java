/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitContainer#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitContainer()
 * @model abstract="true"
 * @generated
 */
public interface UnitContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.ContentUnit}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.ContentUnit#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitContainer_Units()
	 * @see uk.ac.man.cs.mdsd.waf.ContentUnit#getDisplayedOn
	 * @model opposite="displayedOn" containment="true"
	 * @generated
	 */
	EList<ContentUnit> getUnits();

} // UnitContainer
