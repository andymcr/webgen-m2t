/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenIncludedFeature.java,v 1.14 2014/08/21 14:33:35 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.ecore.EObject;
import uk.ac.man.cs.mdsd.gencriteria.GenExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Included Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature#getGenForcedValue <em>Gen Forced Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature#getMessageDisplayOption <em>Message Display Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenIncludedFeature()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GenIncludedFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Forced Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Forced Value</em>' containment reference.
	 * @see #setGenForcedValue(GenExpression)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenIncludedFeature_GenForcedValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	GenExpression getGenForcedValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature#getGenForcedValue <em>Gen Forced Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Forced Value</em>' containment reference.
	 * @see #getGenForcedValue()
	 * @generated
	 */
	void setGenForcedValue(GenExpression value);

	/**
	 * Returns the value of the '<em><b>Message Display Option</b></em>' attribute.
	 * The default value is <code>"Description"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Display Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions
	 * @see #setMessageDisplayOption(InputMessageDisplayOptions)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenIncludedFeature_MessageDisplayOption()
	 * @model default="Description"
	 * @generated
	 */
	InputMessageDisplayOptions getMessageDisplayOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenIncludedFeature#getMessageDisplayOption <em>Message Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.genjsf.InputMessageDisplayOptions
	 * @see #getMessageDisplayOption()
	 * @generated
	 */
	void setMessageDisplayOption(InputMessageDisplayOptions value);

	/**
	 * @generated NOT
	 */
	String getName();
} // GenIncludedFeature
