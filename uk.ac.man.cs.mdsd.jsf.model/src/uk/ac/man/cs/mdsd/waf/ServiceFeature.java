/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.ecore.EObject;
import uk.ac.man.cs.mdsd.orm.Cardinality;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getIncludedBy <em>Included By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getDateFormat <em>Date Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ServiceFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Included By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.Service#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included By</em>' container reference.
	 * @see #setIncludedBy(Service)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature_IncludedBy()
	 * @see uk.ac.man.cs.mdsd.waf.Service#getFeatures
	 * @model opposite="features" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Service getIncludedBy();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getIncludedBy <em>Included By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Included By</em>' container reference.
	 * @see #getIncludedBy()
	 * @generated
	 */
	void setIncludedBy(Service value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.orm.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.orm.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature_Cardinality()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.orm.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format</em>' attribute.
	 * @see #setDateFormat(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature_DateFormat()
	 * @model ordered="false"
	 * @generated
	 */
	String getDateFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getDateFormat <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format</em>' attribute.
	 * @see #getDateFormat()
	 * @generated
	 */
	void setDateFormat(String value);

} // ServiceFeature
