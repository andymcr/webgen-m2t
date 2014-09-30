/**
 */
package uk.ac.man.cs.mdsd.genjsf;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Service Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenServiceFeature#getGenIncludedBy <em>Gen Included By</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenServiceFeature()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GenServiceFeature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Gen Included By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenService#getGenFeatures <em>Gen Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Included By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Included By</em>' container reference.
	 * @see #setGenIncludedBy(GenService)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenServiceFeature_GenIncludedBy()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenService#getGenFeatures
	 * @model opposite="genFeatures" required="true" transient="false" ordered="false"
	 * @generated
	 */
	GenService getGenIncludedBy();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenServiceFeature#getGenIncludedBy <em>Gen Included By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Included By</em>' container reference.
	 * @see #getGenIncludedBy()
	 * @generated
	 */
	void setGenIncludedBy(GenService value);

	/**
	 * @generated NOT
	 */
	String getName();

	/**
	 * @generated NOT
	 */
	void reconcile(final GenServiceFeature oldGenFeature);
} // GenServiceFeature
