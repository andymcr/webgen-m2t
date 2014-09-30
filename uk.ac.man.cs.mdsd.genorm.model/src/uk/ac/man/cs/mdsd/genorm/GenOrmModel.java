/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenOrmModel.java,v 1.11 2013/08/14 14:18:40 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.orm.OrmModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getOrmModel <em>Orm Model</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getGenCollectionTypes <em>Gen Collection Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getGenDataTypes <em>Gen Data Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getGenEntities <em>Gen Entities</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getOrmTechnology <em>Orm Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDomainPackage <em>Domain Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getIncludeXmlBindingAnnotations <em>Include Xml Binding Annotations</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDaoPackage <em>Dao Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDaoImplPackage <em>Dao Impl Package</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabaseHost <em>Database Host</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabaseUsername <em>Database Username</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabasePassword <em>Database Password</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabasePrefix <em>Database Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel()
 * @model
 * @generated
 */
public interface GenOrmModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Orm Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Model</em>' reference.
	 * @see #setOrmModel(OrmModel)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_OrmModel()
	 * @model required="true"
	 * @generated
	 */
	OrmModel getOrmModel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getOrmModel <em>Orm Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Model</em>' reference.
	 * @see #getOrmModel()
	 * @generated
	 */
	void setOrmModel(OrmModel value);

	/**
	 * Returns the value of the '<em><b>Gen Collection Types</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genorm.GenCollectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Collection Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Collection Types</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_GenCollectionTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenCollectionType> getGenCollectionTypes();

	/**
	 * Returns the value of the '<em><b>Gen Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genorm.GenDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Data Types</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_GenDataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenDataType> getGenDataTypes();

	/**
	 * Returns the value of the '<em><b>Gen Entities</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.genorm.GenEntity}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.genorm.GenEntity#getGenPartOf <em>Gen Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Entities</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_GenEntities()
	 * @see uk.ac.man.cs.mdsd.genorm.GenEntity#getGenPartOf
	 * @model opposite="genPartOf" containment="true"
	 * @generated
	 */
	EList<GenEntity> getGenEntities();

	/**
	 * Returns the value of the '<em><b>Orm Technology</b></em>' attribute.
	 * The default value is <code>"JPA2"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.genorm.OrmTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orm Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orm Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.genorm.OrmTechnologies
	 * @see #setOrmTechnology(OrmTechnologies)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_OrmTechnology()
	 * @model default="JPA2" required="true" ordered="false"
	 * @generated
	 */
	OrmTechnologies getOrmTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getOrmTechnology <em>Orm Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orm Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.genorm.OrmTechnologies
	 * @see #getOrmTechnology()
	 * @generated
	 */
	void setOrmTechnology(OrmTechnologies value);

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_BasePackage()
	 * @model ordered="false"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Domain Package</b></em>' attribute.
	 * The default value is <code>"domain"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Package</em>' attribute.
	 * @see #setDomainPackage(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_DomainPackage()
	 * @model default="domain" required="true"
	 * @generated
	 */
	String getDomainPackage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDomainPackage <em>Domain Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Package</em>' attribute.
	 * @see #getDomainPackage()
	 * @generated
	 */
	void setDomainPackage(String value);

	/**
	 * Returns the value of the '<em><b>Include Xml Binding Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Xml Binding Annotations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Xml Binding Annotations</em>' attribute.
	 * @see #setIncludeXmlBindingAnnotations(Boolean)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_IncludeXmlBindingAnnotations()
	 * @model
	 * @generated
	 */
	Boolean getIncludeXmlBindingAnnotations();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getIncludeXmlBindingAnnotations <em>Include Xml Binding Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Xml Binding Annotations</em>' attribute.
	 * @see #getIncludeXmlBindingAnnotations()
	 * @generated
	 */
	void setIncludeXmlBindingAnnotations(Boolean value);

	/**
	 * Returns the value of the '<em><b>Dao Package</b></em>' attribute.
	 * The default value is <code>"dao"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dao Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dao Package</em>' attribute.
	 * @see #setDaoPackage(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_DaoPackage()
	 * @model default="dao" required="true" ordered="false"
	 * @generated
	 */
	String getDaoPackage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDaoPackage <em>Dao Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dao Package</em>' attribute.
	 * @see #getDaoPackage()
	 * @generated
	 */
	void setDaoPackage(String value);

	/**
	 * Returns the value of the '<em><b>Dao Impl Package</b></em>' attribute.
	 * The default value is <code>"dao.hibernate"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dao Impl Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dao Impl Package</em>' attribute.
	 * @see #setDaoImplPackage(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_DaoImplPackage()
	 * @model default="dao.hibernate" required="true" ordered="false"
	 * @generated
	 */
	String getDaoImplPackage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDaoImplPackage <em>Dao Impl Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dao Impl Package</em>' attribute.
	 * @see #getDaoImplPackage()
	 * @generated
	 */
	void setDaoImplPackage(String value);

	/**
	 * Returns the value of the '<em><b>Database Host</b></em>' attribute.
	 * The default value is <code>"localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Host</em>' attribute.
	 * @see #setDatabaseHost(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_DatabaseHost()
	 * @model default="localhost" required="true" ordered="false"
	 * @generated
	 */
	String getDatabaseHost();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabaseHost <em>Database Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Host</em>' attribute.
	 * @see #getDatabaseHost()
	 * @generated
	 */
	void setDatabaseHost(String value);

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_DatabaseName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Database Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Username</em>' attribute.
	 * @see #setDatabaseUsername(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_DatabaseUsername()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDatabaseUsername();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabaseUsername <em>Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Username</em>' attribute.
	 * @see #getDatabaseUsername()
	 * @generated
	 */
	void setDatabaseUsername(String value);

	/**
	 * Returns the value of the '<em><b>Database Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Password</em>' attribute.
	 * @see #setDatabasePassword(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_DatabasePassword()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDatabasePassword();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabasePassword <em>Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Password</em>' attribute.
	 * @see #getDatabasePassword()
	 * @generated
	 */
	void setDatabasePassword(String value);

	/**
	 * Returns the value of the '<em><b>Database Prefix</b></em>' attribute.
	 * The default value is <code>"localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Prefix</em>' attribute.
	 * @see #setDatabasePrefix(String)
	 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getGenOrmModel_DatabasePrefix()
	 * @model default="localhost" required="true" ordered="false"
	 * @generated
	 */
	String getDatabasePrefix();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.genorm.GenOrmModel#getDatabasePrefix <em>Database Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Prefix</em>' attribute.
	 * @see #getDatabasePrefix()
	 * @generated
	 */
	void setDatabasePrefix(String value);

	void reconcile(final GenOrmModel oldGenOrmModel);

} // GenOrmModel
