/**
 */
package uk.ac.man.cs.mdsd.jsf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Page Top Menu Options</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage#getPageTopMenuOptions()
 * @model
 * @generated
 */
public enum PageTopMenuOptions implements Enumerator {
	/**
	 * The '<em><b>Never Include</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER_INCLUDE_VALUE
	 * @generated
	 * @ordered
	 */
	NEVER_INCLUDE(0, "NeverInclude", "NeverInclude"),

	/**
	 * The '<em><b>Always Include</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_INCLUDE_VALUE
	 * @generated
	 * @ordered
	 */
	ALWAYS_INCLUDE(0, "AlwaysInclude", "AlwaysInclude"),

	/**
	 * The '<em><b>Include When Authenticated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDE_WHEN_AUTHENTICATED_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDE_WHEN_AUTHENTICATED(0, "IncludeWhenAuthenticated", "IncludeWhenAuthenticated");

	/**
	 * The '<em><b>Never Include</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Never Include</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEVER_INCLUDE
	 * @model name="NeverInclude"
	 * @generated
	 * @ordered
	 */
	public static final int NEVER_INCLUDE_VALUE = 0;

	/**
	 * The '<em><b>Always Include</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Always Include</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_INCLUDE
	 * @model name="AlwaysInclude"
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS_INCLUDE_VALUE = 0;

	/**
	 * The '<em><b>Include When Authenticated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Include When Authenticated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCLUDE_WHEN_AUTHENTICATED
	 * @model name="IncludeWhenAuthenticated"
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDE_WHEN_AUTHENTICATED_VALUE = 0;

	/**
	 * An array of all the '<em><b>Page Top Menu Options</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PageTopMenuOptions[] VALUES_ARRAY =
		new PageTopMenuOptions[] {
			NEVER_INCLUDE,
			ALWAYS_INCLUDE,
			INCLUDE_WHEN_AUTHENTICATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Page Top Menu Options</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PageTopMenuOptions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Page Top Menu Options</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PageTopMenuOptions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PageTopMenuOptions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Page Top Menu Options</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PageTopMenuOptions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PageTopMenuOptions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Page Top Menu Options</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PageTopMenuOptions get(int value) {
		switch (value) {
			case NEVER_INCLUDE_VALUE: return NEVER_INCLUDE;
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
	private PageTopMenuOptions(int value, String name, String literal) {
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
	
} //PageTopMenuOptions
