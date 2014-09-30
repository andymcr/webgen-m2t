/**
 * <copyright>
 * </copyright>
 *
 * $Id: InputMessagePlacementOptions.java,v 1.1 2010/03/23 10:47:06 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Input Message Placement Options</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.genjsf.GenJsfPackage#getInputMessagePlacementOptions()
 * @model
 * @generated
 */
public enum InputMessagePlacementOptions implements Enumerator {
	/**
	 * The '<em><b>Form Head</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORM_HEAD_VALUE
	 * @generated
	 * @ordered
	 */
	FORM_HEAD(0, "FormHead", "FormHead"),

	/**
	 * The '<em><b>Form Foot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORM_FOOT_VALUE
	 * @generated
	 * @ordered
	 */
	FORM_FOOT(0, "FormFoot", "FormFoot"),

	/**
	 * The '<em><b>On Feature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_FEATURE_VALUE
	 * @generated
	 * @ordered
	 */
	ON_FEATURE(0, "OnFeature", "OnFeature"),

	/**
	 * The '<em><b>Form Head And Foot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORM_HEAD_AND_FOOT_VALUE
	 * @generated
	 * @ordered
	 */
	FORM_HEAD_AND_FOOT(0, "FormHeadAndFoot", "FormHeadAndFoot"),

	/**
	 * The '<em><b>Form And On Feature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORM_AND_ON_FEATURE_VALUE
	 * @generated
	 * @ordered
	 */
	FORM_AND_ON_FEATURE(0, "FormAndOnFeature", "FormAndOnFeature");

	/**
	 * The '<em><b>Form Head</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Form Head</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORM_HEAD
	 * @model name="FormHead"
	 * @generated
	 * @ordered
	 */
	public static final int FORM_HEAD_VALUE = 0;

	/**
	 * The '<em><b>Form Foot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Form Foot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORM_FOOT
	 * @model name="FormFoot"
	 * @generated
	 * @ordered
	 */
	public static final int FORM_FOOT_VALUE = 0;

	/**
	 * The '<em><b>On Feature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On Feature</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_FEATURE
	 * @model name="OnFeature"
	 * @generated
	 * @ordered
	 */
	public static final int ON_FEATURE_VALUE = 0;

	/**
	 * The '<em><b>Form Head And Foot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Form Head And Foot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORM_HEAD_AND_FOOT
	 * @model name="FormHeadAndFoot"
	 * @generated
	 * @ordered
	 */
	public static final int FORM_HEAD_AND_FOOT_VALUE = 0;

	/**
	 * The '<em><b>Form And On Feature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Form And On Feature</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORM_AND_ON_FEATURE
	 * @model name="FormAndOnFeature"
	 * @generated
	 * @ordered
	 */
	public static final int FORM_AND_ON_FEATURE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Input Message Placement Options</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InputMessagePlacementOptions[] VALUES_ARRAY =
		new InputMessagePlacementOptions[] {
			FORM_HEAD,
			FORM_FOOT,
			ON_FEATURE,
			FORM_HEAD_AND_FOOT,
			FORM_AND_ON_FEATURE,
		};

	/**
	 * A public read-only list of all the '<em><b>Input Message Placement Options</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InputMessagePlacementOptions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Input Message Placement Options</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InputMessagePlacementOptions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InputMessagePlacementOptions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Input Message Placement Options</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InputMessagePlacementOptions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InputMessagePlacementOptions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Input Message Placement Options</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InputMessagePlacementOptions get(int value) {
		switch (value) {
			case FORM_HEAD_VALUE: return FORM_HEAD;
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
	private InputMessagePlacementOptions(int value, String name, String literal) {
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
	
} //InputMessagePlacementOptions
