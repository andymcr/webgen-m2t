/**
 * <copyright>
 * </copyright>
 *
 * $Id: IncludedFeature.java,v 1.15 2014/08/21 14:33:48 andy Exp $
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.ecore.EObject;
import uk.ac.man.cs.mdsd.criteria.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Included Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IncludedFeature#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IncludedFeature#getForcedValue <em>Forced Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IncludedFeature#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IncludedFeature#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IncludedFeature#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IncludedFeature#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IncludedFeature#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIncludedFeature()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IncludedFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Label</em>' attribute.
	 * @see #setDisplayLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIncludedFeature_DisplayLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getDisplayLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IncludedFeature#getDisplayLabel <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Label</em>' attribute.
	 * @see #getDisplayLabel()
	 * @generated
	 */
	void setDisplayLabel(String value);

	/**
	 * Returns the value of the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forced Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forced Value</em>' containment reference.
	 * @see #setForcedValue(Expression)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIncludedFeature_ForcedValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getForcedValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IncludedFeature#getForcedValue <em>Forced Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forced Value</em>' containment reference.
	 * @see #getForcedValue()
	 * @generated
	 */
	void setForcedValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' attribute.
	 * @see #setFooter(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIncludedFeature_Footer()
	 * @model ordered="false"
	 * @generated
	 */
	String getFooter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IncludedFeature#getFooter <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' attribute.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(String value);

	/**
	 * Returns the value of the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Class</em>' attribute.
	 * @see #setHeaderClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIncludedFeature_HeaderClass()
	 * @model ordered="false"
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IncludedFeature#getHeaderClass <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class</em>' attribute.
	 * @see #getHeaderClass()
	 * @generated
	 */
	void setHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Class</em>' attribute.
	 * @see #setInputClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIncludedFeature_InputClass()
	 * @model ordered="false"
	 * @generated
	 */
	String getInputClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IncludedFeature#getInputClass <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Class</em>' attribute.
	 * @see #getInputClass()
	 * @generated
	 */
	void setInputClass(String value);

	/**
	 * Returns the value of the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Class</em>' attribute.
	 * @see #setDisplayClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIncludedFeature_DisplayClass()
	 * @model ordered="false"
	 * @generated
	 */
	String getDisplayClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IncludedFeature#getDisplayClass <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Class</em>' attribute.
	 * @see #getDisplayClass()
	 * @generated
	 */
	void setDisplayClass(String value);

	/**
	 * Returns the value of the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Class</em>' attribute.
	 * @see #setFooterClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIncludedFeature_FooterClass()
	 * @model ordered="false"
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IncludedFeature#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

} // IncludedFeature
