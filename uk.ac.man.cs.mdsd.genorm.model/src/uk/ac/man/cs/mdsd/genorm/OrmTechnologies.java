/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmTechnologies.java,v 1.2 2013/10/23 16:21:23 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Orm Technologies</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.genorm.GenOrmPackage#getOrmTechnologies()
 * @model
 * @generated
 */
public enum OrmTechnologies implements Enumerator {
	/**
	 * The '<em><b>JPA2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JPA2_VALUE
	 * @generated
	 * @ordered
	 */
	JPA2(0, "JPA2", "JPA2"),

	/**
	 * The '<em><b>HBM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HBM_VALUE
	 * @generated
	 * @ordered
	 */
	HBM(0, "HBM", "HBM"), /**
	 * The '<em><b>Datamapper ORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATAMAPPER_ORM_VALUE
	 * @generated
	 * @ordered
	 */
	DATAMAPPER_ORM(2, "DatamapperORM", "DatamapperORM"), /**
	 * The '<em><b>Gas ORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAS_ORM_VALUE
	 * @generated
	 * @ordered
	 */
	GAS_ORM(3, "GasORM", "GasORM");

	/**
	 * The '<em><b>JPA2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JPA2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JPA2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JPA2_VALUE = 0;

	/**
	 * The '<em><b>HBM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HBM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HBM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HBM_VALUE = 0;

	/**
	 * The '<em><b>Datamapper ORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Datamapper ORM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATAMAPPER_ORM
	 * @model name="DatamapperORM"
	 * @generated
	 * @ordered
	 */
	public static final int DATAMAPPER_ORM_VALUE = 2;

	/**
	 * The '<em><b>Gas ORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gas ORM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAS_ORM
	 * @model name="GasORM"
	 * @generated
	 * @ordered
	 */
	public static final int GAS_ORM_VALUE = 3;

	/**
	 * An array of all the '<em><b>Orm Technologies</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrmTechnologies[] VALUES_ARRAY =
		new OrmTechnologies[] {
			JPA2,
			HBM,
			DATAMAPPER_ORM,
			GAS_ORM,
		};

	/**
	 * A public read-only list of all the '<em><b>Orm Technologies</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrmTechnologies> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Orm Technologies</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrmTechnologies get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrmTechnologies result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Orm Technologies</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrmTechnologies getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrmTechnologies result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Orm Technologies</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrmTechnologies get(int value) {
		switch (value) {
			case JPA2_VALUE: return JPA2;
			case DATAMAPPER_ORM_VALUE: return DATAMAPPER_ORM;
			case GAS_ORM_VALUE: return GAS_ORM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OrmTechnologies(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //OrmTechnologies
