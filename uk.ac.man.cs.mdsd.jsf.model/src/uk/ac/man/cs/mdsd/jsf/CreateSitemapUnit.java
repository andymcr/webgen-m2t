/**
 */
package uk.ac.man.cs.mdsd.jsf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Sitemap Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.CreateSitemapUnit#getDeployedURL <em>Deployed URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.jsf.CreateSitemapUnit#getFilename <em>Filename</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getCreateSitemapUnit()
 * @model
 * @generated
 */
public interface CreateSitemapUnit extends ContentUnit {
	/**
	 * Returns the value of the '<em><b>Deployed URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed URL</em>' attribute.
	 * @see #setDeployedURL(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getCreateSitemapUnit_DeployedURL()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDeployedURL();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.CreateSitemapUnit#getDeployedURL <em>Deployed URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployed URL</em>' attribute.
	 * @see #getDeployedURL()
	 * @generated
	 */
	void setDeployedURL(String value);

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getCreateSitemapUnit_Filename()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.jsf.CreateSitemapUnit#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

} // CreateSitemapUnit
