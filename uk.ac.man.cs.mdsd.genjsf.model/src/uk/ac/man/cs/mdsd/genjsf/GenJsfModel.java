/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenJsfModel.java,v 1.24 2014/01/12 23:07:02 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.genorm.GenOrmModel;

import uk.ac.man.cs.mdsd.jsf.JsfModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getJsfModel <em>Jsf Model</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenAuthentication <em>Gen Authentication</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenServices <em>Gen Services</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenPages <em>Gen Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenMenus <em>Gen Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#isRewriteURLs <em>Rewrite UR Ls</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#isDevelopmentVersion <em>Development Version</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getTextEditorPath <em>Text Editor Path</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getBackingPackage <em>Backing Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getConverterPackage <em>Converter Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getValidatorPackage <em>Validator Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getServicePackage <em>Service Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getSecurityPackage <em>Security Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getUiPackage <em>Ui Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel()
 * @model
 * @generated
 */
public interface GenJsfModel extends GenOrmModel {
	/**
	 * Returns the value of the '<em><b>Jsf Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsf Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsf Model</em>' reference.
	 * @see #setJsfModel(JsfModel)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_JsfModel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	JsfModel getJsfModel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getJsfModel <em>Jsf Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsf Model</em>' reference.
	 * @see #getJsfModel()
	 * @generated
	 */
	void setJsfModel(JsfModel value);

	/**
	 * Returns the value of the '<em><b>Gen Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Authentication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Authentication</em>' containment reference.
	 * @see #setGenAuthentication(GenAuthentication)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_GenAuthentication()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	GenAuthentication getGenAuthentication();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getGenAuthentication <em>Gen Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Authentication</em>' containment reference.
	 * @see #getGenAuthentication()
	 * @generated
	 */
	void setGenAuthentication(GenAuthentication value);

	/**
	 * Returns the value of the '<em><b>Gen Services</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Services</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_GenServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenService> getGenServices();

	/**
	 * Returns the value of the '<em><b>Gen Pages</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenPage}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genjsf.GenPage#getGenPartOf <em>Gen Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Pages</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_GenPages()
	 * @see uk.ac.man.cs.mdsd.genjsf.GenPage#getGenPartOf
	 * @model opposite="genPartOf" containment="true"
	 * @generated
	 */
	EList<GenPage> getGenPages();

	/**
	 * Returns the value of the '<em><b>Gen Menus</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genjsf.GenMenu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Menus</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_GenMenus()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenMenu> getGenMenus();

	/**
	 * Returns the value of the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URL</em>' attribute.
	 * @see #setBaseURL(String)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_BaseURL()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getBaseURL();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getBaseURL <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URL</em>' attribute.
	 * @see #getBaseURL()
	 * @generated
	 */
	void setBaseURL(String value);

	/**
	 * Returns the value of the '<em><b>Rewrite UR Ls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewrite UR Ls</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewrite UR Ls</em>' attribute.
	 * @see #setRewriteURLs(boolean)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_RewriteURLs()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isRewriteURLs();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#isRewriteURLs <em>Rewrite UR Ls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rewrite UR Ls</em>' attribute.
	 * @see #isRewriteURLs()
	 * @generated
	 */
	void setRewriteURLs(boolean value);

	/**
	 * Returns the value of the '<em><b>Development Version</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Development Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Version</em>' attribute.
	 * @see #setDevelopmentVersion(boolean)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_DevelopmentVersion()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isDevelopmentVersion();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#isDevelopmentVersion <em>Development Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Version</em>' attribute.
	 * @see #isDevelopmentVersion()
	 * @generated
	 */
	void setDevelopmentVersion(boolean value);

	/**
	 * Returns the value of the '<em><b>Text Editor Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Editor Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Editor Path</em>' attribute.
	 * @see #setTextEditorPath(String)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_TextEditorPath()
	 * @model ordered="false"
	 * @generated
	 */
	String getTextEditorPath();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getTextEditorPath <em>Text Editor Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Editor Path</em>' attribute.
	 * @see #getTextEditorPath()
	 * @generated
	 */
	void setTextEditorPath(String value);

	/**
	 * Returns the value of the '<em><b>Backing Package</b></em>' attribute.
	 * The default value is <code>"backing"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backing Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backing Package</em>' attribute.
	 * @see #setBackingPackage(String)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_BackingPackage()
	 * @model default="backing" required="true" ordered="false"
	 * @generated
	 */
	String getBackingPackage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getBackingPackage <em>Backing Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backing Package</em>' attribute.
	 * @see #getBackingPackage()
	 * @generated
	 */
	void setBackingPackage(String value);

	/**
	 * Returns the value of the '<em><b>Converter Package</b></em>' attribute.
	 * The default value is <code>"converter"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Converter Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Converter Package</em>' attribute.
	 * @see #setConverterPackage(String)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_ConverterPackage()
	 * @model default="converter" required="true" ordered="false"
	 * @generated
	 */
	String getConverterPackage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getConverterPackage <em>Converter Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Converter Package</em>' attribute.
	 * @see #getConverterPackage()
	 * @generated
	 */
	void setConverterPackage(String value);

	/**
	 * Returns the value of the '<em><b>Validator Package</b></em>' attribute.
	 * The default value is <code>"validator"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator Package</em>' attribute.
	 * @see #setValidatorPackage(String)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_ValidatorPackage()
	 * @model default="validator" required="true" ordered="false"
	 * @generated
	 */
	String getValidatorPackage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getValidatorPackage <em>Validator Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator Package</em>' attribute.
	 * @see #getValidatorPackage()
	 * @generated
	 */
	void setValidatorPackage(String value);

	/**
	 * Returns the value of the '<em><b>Service Package</b></em>' attribute.
	 * The default value is <code>"service"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Package</em>' attribute.
	 * @see #setServicePackage(String)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_ServicePackage()
	 * @model default="service" required="true" ordered="false"
	 * @generated
	 */
	String getServicePackage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getServicePackage <em>Service Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Package</em>' attribute.
	 * @see #getServicePackage()
	 * @generated
	 */
	void setServicePackage(String value);

	/**
	 * Returns the value of the '<em><b>Security Package</b></em>' attribute.
	 * The default value is <code>"security"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Package</em>' attribute.
	 * @see #setSecurityPackage(String)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_SecurityPackage()
	 * @model default="security" required="true" ordered="false"
	 * @generated
	 */
	String getSecurityPackage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getSecurityPackage <em>Security Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Package</em>' attribute.
	 * @see #getSecurityPackage()
	 * @generated
	 */
	void setSecurityPackage(String value);

	/**
	 * Returns the value of the '<em><b>Ui Package</b></em>' attribute.
	 * The default value is <code>"ui"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Package</em>' attribute.
	 * @see #setUiPackage(String)
	 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getGenJsfModel_UiPackage()
	 * @model default="ui" required="true" ordered="false"
	 * @generated
	 */
	String getUiPackage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genjsf.GenJsfModel#getUiPackage <em>Ui Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Package</em>' attribute.
	 * @see #getUiPackage()
	 * @generated
	 */
	void setUiPackage(String value);
} // GenJsfModel
