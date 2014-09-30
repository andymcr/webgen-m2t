/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenJsfEditorPlugin.java,v 1.2 2014/01/27 16:45:56 andy Exp $
 */
package uk.ac.man.cs.mdsd.genjsf.presentation;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import uk.ac.man.cs.mdsd.criteria.provider.CriteriaEditPlugin;
import uk.ac.man.cs.mdsd.gencriteria.provider.GenCriteriaEditPlugin;
import uk.ac.man.cs.mdsd.genorm.provider.GenOrmEditPlugin;

import uk.ac.man.cs.mdsd.jsf.provider.JsfEditPlugin;

import uk.ac.man.cs.mdsd.orm.provider.OrmEditPlugin;

/**
 * This is the central singleton for the GenJsf editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class GenJsfEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GenJsfEditorPlugin INSTANCE = new GenJsfEditorPlugin();
	
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
	public GenJsfEditorPlugin() {
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
	public static class Implementation extends EclipseUIPlugin {
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
