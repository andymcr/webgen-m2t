/**
 */
package uk.ac.man.cs.mdsd.jsf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Framework Technologies</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getFrameworkTechnologies()
 * @model
 * @generated
 */
public enum FrameworkTechnologies implements Enumerator {
	/**
	 * The '<em><b>JSF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSF_VALUE
	 * @generated
	 * @ordered
	 */
	JSF(0, "JSF", "JSF"),

	/**
	 * The '<em><b>Cake PHP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAKE_PHP_VALUE
	 * @generated
	 * @ordered
	 */
	CAKE_PHP(1, "CakePHP", "CakePHP"),

	/**
	 * The '<em><b>Code Igniter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_IGNITER_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_IGNITER(2, "CodeIgniter", "CodeIgniter"),

	/**
	 * The '<em><b>Kohana</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KOHANA_VALUE
	 * @generated
	 * @ordered
	 */
	KOHANA(3, "Kohana", "Kohana"),

	/**
	 * The '<em><b>Laravel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARAVEL_VALUE
	 * @generated
	 * @ordered
	 */
	LARAVEL(4, "Laravel", "Laravel"), /**
	 * The '<em><b>Symfony</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMFONY_VALUE
	 * @generated
	 * @ordered
	 */
	SYMFONY(5, "Symfony", "Symfony");

	/**
	 * The '<em><b>JSF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JSF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JSF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JSF_VALUE = 0;

	/**
	 * The '<em><b>Cake PHP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cake PHP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAKE_PHP
	 * @model name="CakePHP"
	 * @generated
	 * @ordered
	 */
	public static final int CAKE_PHP_VALUE = 1;

	/**
	 * The '<em><b>Code Igniter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Code Igniter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODE_IGNITER
	 * @model name="CodeIgniter"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_IGNITER_VALUE = 2;

	/**
	 * The '<em><b>Kohana</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kohana</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KOHANA
	 * @model name="Kohana"
	 * @generated
	 * @ordered
	 */
	public static final int KOHANA_VALUE = 3;

	/**
	 * The '<em><b>Laravel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Laravel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LARAVEL
	 * @model name="Laravel"
	 * @generated
	 * @ordered
	 */
	public static final int LARAVEL_VALUE = 4;

	/**
	 * The '<em><b>Symfony</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Symfony</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYMFONY
	 * @model name="Symfony"
	 * @generated
	 * @ordered
	 */
	public static final int SYMFONY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Framework Technologies</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FrameworkTechnologies[] VALUES_ARRAY =
		new FrameworkTechnologies[] {
			JSF,
			CAKE_PHP,
			CODE_IGNITER,
			KOHANA,
			LARAVEL,
			SYMFONY,
		};

	/**
	 * A public read-only list of all the '<em><b>Framework Technologies</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FrameworkTechnologies> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Framework Technologies</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FrameworkTechnologies get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FrameworkTechnologies result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Framework Technologies</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FrameworkTechnologies getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FrameworkTechnologies result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Framework Technologies</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FrameworkTechnologies get(int value) {
		switch (value) {
			case JSF_VALUE: return JSF;
			case CAKE_PHP_VALUE: return CAKE_PHP;
			case CODE_IGNITER_VALUE: return CODE_IGNITER;
			case KOHANA_VALUE: return KOHANA;
			case LARAVEL_VALUE: return LARAVEL;
			case SYMFONY_VALUE: return SYMFONY;
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
	private FrameworkTechnologies(int value, String name, String literal) {
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
	
} //FrameworkTechnologies
