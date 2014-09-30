/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Unit Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenUnitContainer#getGenUnits <em>Gen Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitContainer()
 * @model abstract="true"
 * @generated
 */
public interface GenUnitContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen Units</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenContentUnit}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenContentUnit#getGenDisplayedOn <em>Gen Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Units</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenUnitContainer_GenUnits()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenContentUnit#getGenDisplayedOn
	 * @model opposite="genDisplayedOn" containment="true"
	 * @generated
	 */
	EList<GenContentUnit> getGenUnits();

} // GenUnitContainer
