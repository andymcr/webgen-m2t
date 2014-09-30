/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenAssociation.java,v 1.9 2013/12/10 11:05:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenAssociation#getGenOpposite <em>Gen Opposite</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenAssociation#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenAssociation()
 * @model abstract="true"
 * @generated
 */
public interface GenAssociation extends GenFeature {
	/**
	 * Returns the value of the '<em><b>Gen Opposite</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genorm.GenAssociation#getGenOpposite <em>Gen Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Opposite</em>' reference.
	 * @see #setGenOpposite(GenAssociation)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenAssociation_GenOpposite()
	 * @see uk.ac.man.cs.mdsd.genorm.GenAssociation#getGenOpposite
	 * @model opposite="genOpposite" required="true" ordered="false"
	 * @generated
	 */
	GenAssociation getGenOpposite();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenAssociation#getGenOpposite <em>Gen Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Opposite</em>' reference.
	 * @see #getGenOpposite()
	 * @generated
	 */
	void setGenOpposite(GenAssociation value);

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenAssociation_FeatureName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenAssociation#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);
} // GenAssociation
