/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelectOneofOptions.java,v 1.1 2010/03/23 10:47:10 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Select Oneof Options</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getSelectOneofOptions()
 * @model
 * @generated
 */
public enum SelectOneofOptions implements Enumerator {
	/**
	 * The '<em><b>Menu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENU_VALUE
	 * @generated
	 * @ordered
	 */
	MENU(0, "Menu", "Menu"),

	/**
	 * The '<em><b>Radio Horizontal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_HORIZONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	RADIO_HORIZONTAL(0, "RadioHorizontal", "RadioHorizontal"),

	/**
	 * The '<em><b>Radio Vertical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_VERTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	RADIO_VERTICAL(0, "RadioVertical", "RadioVertical");

	/**
	 * The '<em><b>Menu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Menu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENU
	 * @model name="Menu"
	 * @generated
	 * @ordered
	 */
	public static final int MENU_VALUE = 0;

	/**
	 * The '<em><b>Radio Horizontal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Radio Horizontal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIO_HORIZONTAL
	 * @model name="RadioHorizontal"
	 * @generated
	 * @ordered
	 */
	public static final int RADIO_HORIZONTAL_VALUE = 0;

	/**
	 * The '<em><b>Radio Vertical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Radio Vertical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIO_VERTICAL
	 * @model name="RadioVertical"
	 * @generated
	 * @ordered
	 */
	public static final int RADIO_VERTICAL_VALUE = 0;

	/**
	 * An array of all the '<em><b>Select Oneof Options</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SelectOneofOptions[] VALUES_ARRAY =
		new SelectOneofOptions[] {
			MENU,
			RADIO_HORIZONTAL,
			RADIO_VERTICAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Select Oneof Options</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SelectOneofOptions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Select Oneof Options</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SelectOneofOptions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SelectOneofOptions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Select Oneof Options</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SelectOneofOptions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SelectOneofOptions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Select Oneof Options</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SelectOneofOptions get(int value) {
		switch (value) {
			case MENU_VALUE: return MENU;
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
	private SelectOneofOptions(int value, String name, String literal) {
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
	
} //SelectOneofOptions
