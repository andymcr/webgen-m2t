/**
 */
package uk.ac.man.cs.mdsd.genjsf.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import uk.ac.man.cs.mdsd.criteria.provider.CriteriaEditPlugin;
import uk.ac.man.cs.mdsd.gencriteria.provider.GenCriteriaEditPlugin;
import uk.ac.man.cs.mdsd.genorm.provider.GenOrmEditPlugin;

import uk.ac.man.cs.mdsd.jsf.provider.JsfEditPlugin;

import uk.ac.man.cs.mdsd.orm.provider.OrmEditPlugin;

/**
 * This is the central singleton for the GenJsf edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class GenJsfEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GenJsfEditPlugin INSTANCE = new GenJsfEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenJsfEditPlugin() {
		super
		  (new ResourceLocator [] {
		     CriteriaEditPlugin.INSTANCE,
		     GenCriteriaEditPlugin.INSTANCE,
		     GenOrmEditPlugin.INSTANCE,
		     JsfEditPlugin.INSTANCE,
		     OrmEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
