/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenFeature.java,v 1.8 2014/01/25 17:38:12 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm;

import uk.ac.man.cs.mdsd.orm.Feature;
import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenFeature#getGenParentEntity <em>Gen Parent Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenFeature#getXmlTransient <em>Xml Transient</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenFeature()
 * @model abstract="true"
 * @generated
 */
public interface GenFeature extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Gen Parent Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getGenFeatures <em>Gen Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Parent Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Parent Entity</em>' container reference.
	 * @see #setGenParentEntity(GenEntity)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenFeature_GenParentEntity()
	 * @see uk.ac.man.cs.mdsd.genorm.GenEntity#getGenFeatures
	 * @model opposite="genFeatures" required="true" transient="false" ordered="false"
	 * @generated
	 */
	GenEntity getGenParentEntity();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenFeature#getGenParentEntity <em>Gen Parent Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Parent Entity</em>' container reference.
	 * @see #getGenParentEntity()
	 * @generated
	 */
	void setGenParentEntity(GenEntity value);

	/**
	 * Returns the value of the '<em><b>Xml Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Transient</em>' attribute.
	 * @see #setXmlTransient(Boolean)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenFeature_XmlTransient()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Boolean getXmlTransient();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenFeature#getXmlTransient <em>Xml Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Transient</em>' attribute.
	 * @see #getXmlTransient()
	 * @generated
	 */
	void setXmlTransient(Boolean value);

	Feature getOrmFeature();

	void reconcile(final GenFeature oldGenFeature);
} // GenFeature
