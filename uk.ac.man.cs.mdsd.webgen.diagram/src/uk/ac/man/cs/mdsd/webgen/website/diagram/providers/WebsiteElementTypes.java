package uk.ac.man.cs.mdsd.webgen.website.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import security.SecurityPackage;
import uk.ac.man.cs.mdsd.webgen.base.BasePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.service.ServicePackage;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.*;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.AssociationWithContainmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.AssociationWithoutContainmentEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.CasAuthenticationEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.CreateSitemapUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.CreateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.CreateUpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DataTypeAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DataTypeEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DateAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DeleteAction2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DeleteAction3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DeleteActionEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnit2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnit3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnit4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnit5EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnit6EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DetailsUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.DynamicMenuEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EditStaticTextMenuEntryEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EntityEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EnumerationLiteralEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.EnumerationTypeEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.FileAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit5EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit6EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnit7EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.IndexUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.LocalAuthenticationSystemEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.PageEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.PageLinkEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SearchUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectAction2EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectAction3EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectAction4EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectAction5EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectAction6EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectAction7EditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectActionEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.SelectionEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.ServiceEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.StaticMenuEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.StaticUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.UpdateUnitEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.WebGenModelEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts.WebsitePropertiesEditPart;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteDiagramEditorPlugin;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * @generated
 */
public class WebsiteElementTypes {

	/**
	 * @generated
	 */
	private WebsiteElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			WebsiteDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType WebGenModel_1000 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.WebGenModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WebsiteProperties_2001 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.WebsiteProperties_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataType_2013 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.DataType_2013"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DynamicMenu_2018 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DynamicMenu_2018"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType EnumerationType_2014 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.EnumerationType_2014"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Entity_2015 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.Entity_2015"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType View_2016 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.View_2016"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Page_2019 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.Page_2019"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType LocalAuthenticationSystem_3382 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.LocalAuthenticationSystem_3382"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CasAuthentication_3383 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.CasAuthentication_3383"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType StaticMenu_2020 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.StaticMenu_2020"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Service_2017 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.Service_2017"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType EnumerationLiteral_3273 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.EnumerationLiteral_3273"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DataTypeAttribute_3274 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DataTypeAttribute_3274"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DateAttribute_3275 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DateAttribute_3275"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UrlAttribute_3276 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UrlAttribute_3276"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType FileAttribute_3277 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.FileAttribute_3277"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ImageAttribute_3278 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.ImageAttribute_3278"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType LocationAttribute_3279 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.LocationAttribute_3279"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ModelLabel_3280 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.ModelLabel_3280"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ModelLabel_3281 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.ModelLabel_3281"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType EncapsulatedAttribute_3282 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.EncapsulatedAttribute_3282"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType EncapsulatedAssociation_3283 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.EncapsulatedAssociation_3283"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CreateUnit_3286 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.CreateUnit_3286"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3287 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3287"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3288 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3288"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DataTypeField_3289 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DataTypeField_3289"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DateField_3290 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.DateField_3290"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CreateUpdateUnit_3291 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.CreateUpdateUnit_3291"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3292 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3292"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3293 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3293"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CreateUpdateUnit_3294 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.CreateUpdateUnit_3294"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3295 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3295"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DataTypeField_3296 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DataTypeField_3296"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DateField_3297 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.DateField_3297"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CreateSitemapUnit_3298 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.CreateSitemapUnit_3298"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DetailsUnit_3299 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DetailsUnit_3299"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3300 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3300"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SelectAction_3301 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3301"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3302 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3302"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DetailsUnit_3303 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DetailsUnit_3303"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3304 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3304"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3305 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3305"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DetailsUnit_3306 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DetailsUnit_3306"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3307 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3307"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType IndexUnit_3308 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3308"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3309 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3309"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType IndexUnit_3310 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3310"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3311 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3311"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3312 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3312"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DetailsUnit_3313 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DetailsUnit_3313"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3314 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3314"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3315 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3315"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DetailsUnit_3316 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DetailsUnit_3316"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3317 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3317"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3318 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3318"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType IndexUnit_3319 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3319"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3320 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3320"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3321 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3321"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType IndexUnit_3322 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3322"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3323 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3323"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3324 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3324"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DetailsUnit_3325 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DetailsUnit_3325"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3326 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3326"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3327 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3327"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType IndexUnit_3328 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3328"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3329 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3329"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3330 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3330"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SelectAction_3331 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3331"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DeleteAction_3332 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DeleteAction_3332"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ImageIndexUnit_3333 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.ImageIndexUnit_3333"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SelectAction_3334 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3334"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DeleteAction_3335 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DeleteAction_3335"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType FeatureSupportAction_3336 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.FeatureSupportAction_3336"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SelectAction_3337 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3337"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DataTypeField_3338 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DataTypeField_3338"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DateField_3339 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.DateField_3339"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitSupportAction_3340 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitSupportAction_3340"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType IndexUnit_3341 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3341"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3342 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3342"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SelectAction_3343 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3343"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3344 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3344"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DetailsUnit_3345 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DetailsUnit_3345"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3346 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3346"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3347 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3347"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType IndexUnit_3348 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3348"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3349 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3349"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3350 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3350"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SelectAction_3351 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3351"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DataTypeField_3352 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DataTypeField_3352"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DateField_3353 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.DateField_3353"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SelectAction_3354 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3354"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DeleteAction_3355 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DeleteAction_3355"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType FeatureSupportAction_3356 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.FeatureSupportAction_3356"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType MapUnit_3357 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.MapUnit_3357"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SearchUnit_3358 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SearchUnit_3358"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3359 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3359"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3360 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3360"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DataTypeField_3361 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DataTypeField_3361"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DateField_3362 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.DateField_3362"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType StaticUnit_3363 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.StaticUnit_3363"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UpdateUnit_3364 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UpdateUnit_3364"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3365 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3365"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3366 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3366"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType IndexUnit_3367 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3367"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3368 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3368"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitAssociation_3369 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3369"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SelectAction_3370 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3370"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DeleteAction_3371 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DeleteAction_3371"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DataTypeField_3372 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DataTypeField_3372"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DateField_3373 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.DateField_3373"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ImageIndexUnit_3374 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.ImageIndexUnit_3374"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SelectAction_3375 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3375"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DeleteAction_3376 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DeleteAction_3376"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType FeatureSupportAction_3377 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.FeatureSupportAction_3377"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SliderUnit_3378 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SliderUnit_3378"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType GalleryUnit_3379 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.GalleryUnit_3379"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ActionMenuEntry_3380 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.ActionMenuEntry_3380"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType EditStaticTextMenuEntry_3381 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.EditStaticTextMenuEntry_3381"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType AssociationWithoutContainment_4005 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.AssociationWithoutContainment_4005"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType AssociationWithContainment_4006 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.AssociationWithContainment_4006"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ViewAssociation_4007 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.ViewAssociation_4007"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PageLink_4008 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.PageLink_4008"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Selection_3284 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.Selection_3284"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType BusinessOperation_3285 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.BusinessOperation_3285"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(WebGenModel_1000, WebsitePackage.eINSTANCE.getWebGenModel());

			elements.put(WebsiteProperties_2001, WebsitePackage.eINSTANCE.getWebsiteProperties());

			elements.put(DataType_2013, BasePackage.eINSTANCE.getDataType());

			elements.put(EnumerationType_2014, BasePackage.eINSTANCE.getEnumerationType());

			elements.put(Entity_2015, PersistencePackage.eINSTANCE.getEntity());

			elements.put(View_2016, PersistencePackage.eINSTANCE.getView());

			elements.put(Service_2017, ServicePackage.eINSTANCE.getService());

			elements.put(DynamicMenu_2018, WebuiPackage.eINSTANCE.getDynamicMenu());

			elements.put(StaticMenu_2020, WebuiPackage.eINSTANCE.getStaticMenu());

			elements.put(Page_2019, WebuiPackage.eINSTANCE.getPage());

			elements.put(LocalAuthenticationSystem_3382, SecurityPackage.eINSTANCE.getLocalAuthenticationSystem());

			elements.put(CasAuthentication_3383, SecurityPackage.eINSTANCE.getCasAuthentication());

			elements.put(EnumerationLiteral_3273, BasePackage.eINSTANCE.getEnumerationLiteral());

			elements.put(DataTypeAttribute_3274, PersistencePackage.eINSTANCE.getDataTypeAttribute());

			elements.put(DateAttribute_3275, PersistencePackage.eINSTANCE.getDateAttribute());

			elements.put(UrlAttribute_3276, PersistencePackage.eINSTANCE.getUrlAttribute());

			elements.put(FileAttribute_3277, PersistencePackage.eINSTANCE.getFileAttribute());

			elements.put(ImageAttribute_3278, PersistencePackage.eINSTANCE.getImageAttribute());

			elements.put(LocationAttribute_3279, PersistencePackage.eINSTANCE.getLocationAttribute());

			elements.put(ModelLabel_3280, PersistencePackage.eINSTANCE.getModelLabel());

			elements.put(ModelLabel_3281, PersistencePackage.eINSTANCE.getModelLabel());

			elements.put(EncapsulatedAttribute_3282, PersistencePackage.eINSTANCE.getEncapsulatedAttribute());

			elements.put(EncapsulatedAssociation_3283, PersistencePackage.eINSTANCE.getEncapsulatedAssociation());

			elements.put(Selection_3284, ServicePackage.eINSTANCE.getSelection());

			elements.put(BusinessOperation_3285, ServicePackage.eINSTANCE.getBusinessOperation());

			elements.put(ActionMenuEntry_3380, WebuiPackage.eINSTANCE.getActionMenuEntry());

			elements.put(EditStaticTextMenuEntry_3381, WebuiPackage.eINSTANCE.getEditStaticTextMenuEntry());

			elements.put(CreateUnit_3286, WebuiPackage.eINSTANCE.getCreateUnit());

			elements.put(UnitElement_3287, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3288, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(DataTypeField_3289, WebuiPackage.eINSTANCE.getDataTypeField());

			elements.put(DateField_3290, WebuiPackage.eINSTANCE.getDateField());

			elements.put(CreateUpdateUnit_3291, WebuiPackage.eINSTANCE.getCreateUpdateUnit());

			elements.put(UnitElement_3292, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3293, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(CreateUpdateUnit_3294, WebuiPackage.eINSTANCE.getCreateUpdateUnit());

			elements.put(UnitElement_3295, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(DataTypeField_3296, WebuiPackage.eINSTANCE.getDataTypeField());

			elements.put(DateField_3297, WebuiPackage.eINSTANCE.getDateField());

			elements.put(CreateSitemapUnit_3298, WebuiPackage.eINSTANCE.getCreateSitemapUnit());

			elements.put(DetailsUnit_3299, WebuiPackage.eINSTANCE.getDetailsUnit());

			elements.put(UnitElement_3300, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(SelectAction_3301, WebuiPackage.eINSTANCE.getSelectAction());

			elements.put(UnitAssociation_3302, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(DetailsUnit_3303, WebuiPackage.eINSTANCE.getDetailsUnit());

			elements.put(UnitElement_3304, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3305, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(DetailsUnit_3306, WebuiPackage.eINSTANCE.getDetailsUnit());

			elements.put(UnitElement_3307, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(IndexUnit_3308, WebuiPackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3309, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(IndexUnit_3310, WebuiPackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3311, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3312, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(DetailsUnit_3313, WebuiPackage.eINSTANCE.getDetailsUnit());

			elements.put(UnitElement_3314, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3315, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(DetailsUnit_3316, WebuiPackage.eINSTANCE.getDetailsUnit());

			elements.put(UnitElement_3317, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3318, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(IndexUnit_3319, WebuiPackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3320, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3321, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(IndexUnit_3322, WebuiPackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3323, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3324, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(DetailsUnit_3325, WebuiPackage.eINSTANCE.getDetailsUnit());

			elements.put(UnitElement_3326, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3327, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(IndexUnit_3328, WebuiPackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3329, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3330, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(SelectAction_3331, WebuiPackage.eINSTANCE.getSelectAction());

			elements.put(DeleteAction_3332, WebuiPackage.eINSTANCE.getDeleteAction());

			elements.put(ImageIndexUnit_3333, WebuiPackage.eINSTANCE.getImageIndexUnit());

			elements.put(SelectAction_3334, WebuiPackage.eINSTANCE.getSelectAction());

			elements.put(DeleteAction_3335, WebuiPackage.eINSTANCE.getDeleteAction());

			elements.put(FeatureSupportAction_3336, WebuiPackage.eINSTANCE.getFeatureSupportAction());

			elements.put(SelectAction_3337, WebuiPackage.eINSTANCE.getSelectAction());

			elements.put(DataTypeField_3338, WebuiPackage.eINSTANCE.getDataTypeField());

			elements.put(DateField_3339, WebuiPackage.eINSTANCE.getDateField());

			elements.put(UnitSupportAction_3340, WebuiPackage.eINSTANCE.getUnitSupportAction());

			elements.put(IndexUnit_3341, WebuiPackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3342, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(SelectAction_3343, WebuiPackage.eINSTANCE.getSelectAction());

			elements.put(UnitAssociation_3344, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(DetailsUnit_3345, WebuiPackage.eINSTANCE.getDetailsUnit());

			elements.put(UnitElement_3346, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3347, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(IndexUnit_3348, WebuiPackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3349, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3350, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(SelectAction_3351, WebuiPackage.eINSTANCE.getSelectAction());

			elements.put(DataTypeField_3352, WebuiPackage.eINSTANCE.getDataTypeField());

			elements.put(DateField_3353, WebuiPackage.eINSTANCE.getDateField());

			elements.put(SelectAction_3354, WebuiPackage.eINSTANCE.getSelectAction());

			elements.put(DeleteAction_3355, WebuiPackage.eINSTANCE.getDeleteAction());

			elements.put(FeatureSupportAction_3356, WebuiPackage.eINSTANCE.getFeatureSupportAction());

			elements.put(MapUnit_3357, WebuiPackage.eINSTANCE.getMapUnit());

			elements.put(SearchUnit_3358, WebuiPackage.eINSTANCE.getSearchUnit());

			elements.put(UnitElement_3359, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3360, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(DataTypeField_3361, WebuiPackage.eINSTANCE.getDataTypeField());

			elements.put(DateField_3362, WebuiPackage.eINSTANCE.getDateField());

			elements.put(StaticUnit_3363, WebuiPackage.eINSTANCE.getStaticUnit());

			elements.put(UpdateUnit_3364, WebuiPackage.eINSTANCE.getUpdateUnit());

			elements.put(UnitElement_3365, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3366, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(IndexUnit_3367, WebuiPackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3368, WebuiPackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3369, WebuiPackage.eINSTANCE.getUnitAssociation());

			elements.put(SelectAction_3370, WebuiPackage.eINSTANCE.getSelectAction());

			elements.put(DeleteAction_3371, WebuiPackage.eINSTANCE.getDeleteAction());

			elements.put(DataTypeField_3372, WebuiPackage.eINSTANCE.getDataTypeField());

			elements.put(DateField_3373, WebuiPackage.eINSTANCE.getDateField());

			elements.put(ImageIndexUnit_3374, WebuiPackage.eINSTANCE.getImageIndexUnit());

			elements.put(SelectAction_3375, WebuiPackage.eINSTANCE.getSelectAction());

			elements.put(DeleteAction_3376, WebuiPackage.eINSTANCE.getDeleteAction());

			elements.put(FeatureSupportAction_3377, WebuiPackage.eINSTANCE.getFeatureSupportAction());

			elements.put(SliderUnit_3378, WebuiPackage.eINSTANCE.getSliderUnit());

			elements.put(GalleryUnit_3379, WebuiPackage.eINSTANCE.getGalleryUnit());

			elements.put(AssociationWithoutContainment_4005,
					PersistencePackage.eINSTANCE.getAssociationWithoutContainment());

			elements.put(AssociationWithContainment_4006, PersistencePackage.eINSTANCE.getAssociationWithContainment());

			elements.put(ViewAssociation_4007, PersistencePackage.eINSTANCE.getViewAssociation());

			elements.put(PageLink_4008, WebuiPackage.eINSTANCE.getPageLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(WebGenModel_1000);
			KNOWN_ELEMENT_TYPES.add(WebsiteProperties_2001);
			KNOWN_ELEMENT_TYPES.add(DataType_2013);
			KNOWN_ELEMENT_TYPES.add(EnumerationType_2014);
			KNOWN_ELEMENT_TYPES.add(Entity_2015);
			KNOWN_ELEMENT_TYPES.add(View_2016);
			KNOWN_ELEMENT_TYPES.add(Service_2017);
			KNOWN_ELEMENT_TYPES.add(DynamicMenu_2018);
			KNOWN_ELEMENT_TYPES.add(StaticMenu_2020);
			KNOWN_ELEMENT_TYPES.add(Page_2019);
			KNOWN_ELEMENT_TYPES.add(LocalAuthenticationSystem_3382);
			KNOWN_ELEMENT_TYPES.add(CasAuthentication_3383);
			KNOWN_ELEMENT_TYPES.add(EnumerationLiteral_3273);
			KNOWN_ELEMENT_TYPES.add(DataTypeAttribute_3274);
			KNOWN_ELEMENT_TYPES.add(DateAttribute_3275);
			KNOWN_ELEMENT_TYPES.add(UrlAttribute_3276);
			KNOWN_ELEMENT_TYPES.add(FileAttribute_3277);
			KNOWN_ELEMENT_TYPES.add(ImageAttribute_3278);
			KNOWN_ELEMENT_TYPES.add(LocationAttribute_3279);
			KNOWN_ELEMENT_TYPES.add(ModelLabel_3280);
			KNOWN_ELEMENT_TYPES.add(ModelLabel_3281);
			KNOWN_ELEMENT_TYPES.add(EncapsulatedAttribute_3282);
			KNOWN_ELEMENT_TYPES.add(EncapsulatedAssociation_3283);
			KNOWN_ELEMENT_TYPES.add(Selection_3284);
			KNOWN_ELEMENT_TYPES.add(BusinessOperation_3285);
			KNOWN_ELEMENT_TYPES.add(ActionMenuEntry_3380);
			KNOWN_ELEMENT_TYPES.add(EditStaticTextMenuEntry_3381);
			KNOWN_ELEMENT_TYPES.add(CreateUnit_3286);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3287);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3288);
			KNOWN_ELEMENT_TYPES.add(DataTypeField_3289);
			KNOWN_ELEMENT_TYPES.add(DateField_3290);
			KNOWN_ELEMENT_TYPES.add(CreateUpdateUnit_3291);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3292);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3293);
			KNOWN_ELEMENT_TYPES.add(CreateUpdateUnit_3294);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3295);
			KNOWN_ELEMENT_TYPES.add(DataTypeField_3296);
			KNOWN_ELEMENT_TYPES.add(DateField_3297);
			KNOWN_ELEMENT_TYPES.add(CreateSitemapUnit_3298);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3299);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3300);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3301);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3302);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3303);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3304);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3305);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3306);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3307);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3308);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3309);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3310);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3311);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3312);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3313);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3314);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3315);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3316);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3317);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3318);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3319);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3320);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3321);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3322);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3323);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3324);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3325);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3326);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3327);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3328);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3329);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3330);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3331);
			KNOWN_ELEMENT_TYPES.add(DeleteAction_3332);
			KNOWN_ELEMENT_TYPES.add(ImageIndexUnit_3333);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3334);
			KNOWN_ELEMENT_TYPES.add(DeleteAction_3335);
			KNOWN_ELEMENT_TYPES.add(FeatureSupportAction_3336);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3337);
			KNOWN_ELEMENT_TYPES.add(DataTypeField_3338);
			KNOWN_ELEMENT_TYPES.add(DateField_3339);
			KNOWN_ELEMENT_TYPES.add(UnitSupportAction_3340);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3341);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3342);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3343);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3344);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3345);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3346);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3347);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3348);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3349);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3350);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3351);
			KNOWN_ELEMENT_TYPES.add(DataTypeField_3352);
			KNOWN_ELEMENT_TYPES.add(DateField_3353);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3354);
			KNOWN_ELEMENT_TYPES.add(DeleteAction_3355);
			KNOWN_ELEMENT_TYPES.add(FeatureSupportAction_3356);
			KNOWN_ELEMENT_TYPES.add(MapUnit_3357);
			KNOWN_ELEMENT_TYPES.add(SearchUnit_3358);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3359);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3360);
			KNOWN_ELEMENT_TYPES.add(DataTypeField_3361);
			KNOWN_ELEMENT_TYPES.add(DateField_3362);
			KNOWN_ELEMENT_TYPES.add(StaticUnit_3363);
			KNOWN_ELEMENT_TYPES.add(UpdateUnit_3364);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3365);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3366);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3367);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3368);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3369);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3370);
			KNOWN_ELEMENT_TYPES.add(DeleteAction_3371);
			KNOWN_ELEMENT_TYPES.add(DataTypeField_3372);
			KNOWN_ELEMENT_TYPES.add(DateField_3373);
			KNOWN_ELEMENT_TYPES.add(ImageIndexUnit_3374);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3375);
			KNOWN_ELEMENT_TYPES.add(DeleteAction_3376);
			KNOWN_ELEMENT_TYPES.add(FeatureSupportAction_3377);
			KNOWN_ELEMENT_TYPES.add(SliderUnit_3378);
			KNOWN_ELEMENT_TYPES.add(GalleryUnit_3379);
			KNOWN_ELEMENT_TYPES.add(AssociationWithoutContainment_4005);
			KNOWN_ELEMENT_TYPES.add(AssociationWithContainment_4006);
			KNOWN_ELEMENT_TYPES.add(ViewAssociation_4007);
			KNOWN_ELEMENT_TYPES.add(PageLink_4008);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WebGenModelEditPart.VISUAL_ID:
			return WebGenModel_1000;
		case WebsitePropertiesEditPart.VISUAL_ID:
			return WebsiteProperties_2001;
		case DataTypeEditPart.VISUAL_ID:
			return DataType_2013;
		case EnumerationTypeEditPart.VISUAL_ID:
			return EnumerationType_2014;
		case EntityEditPart.VISUAL_ID:
			return Entity_2015;
		case ViewEditPart.VISUAL_ID:
			return View_2016;
		case ServiceEditPart.VISUAL_ID:
			return Service_2017;
		case DynamicMenuEditPart.VISUAL_ID:
			return DynamicMenu_2018;
		case StaticMenuEditPart.VISUAL_ID:
			return StaticMenu_2020;
		case PageEditPart.VISUAL_ID:
			return Page_2019;
		case LocalAuthenticationSystemEditPart.VISUAL_ID:
			return LocalAuthenticationSystem_3382;
		case CasAuthenticationEditPart.VISUAL_ID:
			return CasAuthentication_3383;
		case EnumerationLiteralEditPart.VISUAL_ID:
			return EnumerationLiteral_3273;
		case DataTypeAttributeEditPart.VISUAL_ID:
			return DataTypeAttribute_3274;
		case DateAttributeEditPart.VISUAL_ID:
			return DateAttribute_3275;
		case UrlAttributeEditPart.VISUAL_ID:
			return UrlAttribute_3276;
		case FileAttributeEditPart.VISUAL_ID:
			return FileAttribute_3277;
		case ImageAttributeEditPart.VISUAL_ID:
			return ImageAttribute_3278;
		case LocationAttributeEditPart.VISUAL_ID:
			return LocationAttribute_3279;
		case ModelLabelEditPart.VISUAL_ID:
			return ModelLabel_3280;
		case ModelLabel2EditPart.VISUAL_ID:
			return ModelLabel_3281;
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return EncapsulatedAttribute_3282;
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return EncapsulatedAssociation_3283;
		case SelectionEditPart.VISUAL_ID:
			return Selection_3284;
		case BusinessOperationEditPart.VISUAL_ID:
			return BusinessOperation_3285;
		case ActionMenuEntryEditPart.VISUAL_ID:
			return ActionMenuEntry_3380;
		case EditStaticTextMenuEntryEditPart.VISUAL_ID:
			return EditStaticTextMenuEntry_3381;
		case CreateUnitEditPart.VISUAL_ID:
			return CreateUnit_3286;
		case UnitElementEditPart.VISUAL_ID:
			return UnitElement_3287;
		case UnitAssociationEditPart.VISUAL_ID:
			return UnitAssociation_3288;
		case DataTypeFieldEditPart.VISUAL_ID:
			return DataTypeField_3289;
		case DateFieldEditPart.VISUAL_ID:
			return DateField_3290;
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return CreateUpdateUnit_3291;
		case UnitElement2EditPart.VISUAL_ID:
			return UnitElement_3292;
		case UnitAssociation2EditPart.VISUAL_ID:
			return UnitAssociation_3293;
		case CreateUpdateUnit2EditPart.VISUAL_ID:
			return CreateUpdateUnit_3294;
		case UnitElement3EditPart.VISUAL_ID:
			return UnitElement_3295;
		case DataTypeField2EditPart.VISUAL_ID:
			return DataTypeField_3296;
		case DateField2EditPart.VISUAL_ID:
			return DateField_3297;
		case CreateSitemapUnitEditPart.VISUAL_ID:
			return CreateSitemapUnit_3298;
		case DetailsUnitEditPart.VISUAL_ID:
			return DetailsUnit_3299;
		case UnitElement4EditPart.VISUAL_ID:
			return UnitElement_3300;
		case SelectActionEditPart.VISUAL_ID:
			return SelectAction_3301;
		case UnitAssociation3EditPart.VISUAL_ID:
			return UnitAssociation_3302;
		case DetailsUnit2EditPart.VISUAL_ID:
			return DetailsUnit_3303;
		case UnitElement5EditPart.VISUAL_ID:
			return UnitElement_3304;
		case UnitAssociation4EditPart.VISUAL_ID:
			return UnitAssociation_3305;
		case DetailsUnit3EditPart.VISUAL_ID:
			return DetailsUnit_3306;
		case UnitElement6EditPart.VISUAL_ID:
			return UnitElement_3307;
		case IndexUnitEditPart.VISUAL_ID:
			return IndexUnit_3308;
		case UnitElement7EditPart.VISUAL_ID:
			return UnitElement_3309;
		case IndexUnit2EditPart.VISUAL_ID:
			return IndexUnit_3310;
		case UnitElement8EditPart.VISUAL_ID:
			return UnitElement_3311;
		case UnitAssociation5EditPart.VISUAL_ID:
			return UnitAssociation_3312;
		case DetailsUnit4EditPart.VISUAL_ID:
			return DetailsUnit_3313;
		case UnitElement9EditPart.VISUAL_ID:
			return UnitElement_3314;
		case UnitAssociation6EditPart.VISUAL_ID:
			return UnitAssociation_3315;
		case DetailsUnit5EditPart.VISUAL_ID:
			return DetailsUnit_3316;
		case UnitElement10EditPart.VISUAL_ID:
			return UnitElement_3317;
		case UnitAssociation7EditPart.VISUAL_ID:
			return UnitAssociation_3318;
		case IndexUnit3EditPart.VISUAL_ID:
			return IndexUnit_3319;
		case UnitElement11EditPart.VISUAL_ID:
			return UnitElement_3320;
		case UnitAssociation8EditPart.VISUAL_ID:
			return UnitAssociation_3321;
		case IndexUnit4EditPart.VISUAL_ID:
			return IndexUnit_3322;
		case UnitElement12EditPart.VISUAL_ID:
			return UnitElement_3323;
		case UnitAssociation9EditPart.VISUAL_ID:
			return UnitAssociation_3324;
		case DetailsUnit6EditPart.VISUAL_ID:
			return DetailsUnit_3325;
		case UnitElement13EditPart.VISUAL_ID:
			return UnitElement_3326;
		case UnitAssociation10EditPart.VISUAL_ID:
			return UnitAssociation_3327;
		case IndexUnit5EditPart.VISUAL_ID:
			return IndexUnit_3328;
		case UnitElement14EditPart.VISUAL_ID:
			return UnitElement_3329;
		case UnitAssociation11EditPart.VISUAL_ID:
			return UnitAssociation_3330;
		case SelectAction2EditPart.VISUAL_ID:
			return SelectAction_3331;
		case DeleteActionEditPart.VISUAL_ID:
			return DeleteAction_3332;
		case ImageIndexUnitEditPart.VISUAL_ID:
			return ImageIndexUnit_3333;
		case SelectAction3EditPart.VISUAL_ID:
			return SelectAction_3334;
		case DeleteAction2EditPart.VISUAL_ID:
			return DeleteAction_3335;
		case FeatureSupportActionEditPart.VISUAL_ID:
			return FeatureSupportAction_3336;
		case SelectAction4EditPart.VISUAL_ID:
			return SelectAction_3337;
		case DataTypeField3EditPart.VISUAL_ID:
			return DataTypeField_3338;
		case DateField3EditPart.VISUAL_ID:
			return DateField_3339;
		case UnitSupportActionEditPart.VISUAL_ID:
			return UnitSupportAction_3340;
		case IndexUnit6EditPart.VISUAL_ID:
			return IndexUnit_3341;
		case UnitElement15EditPart.VISUAL_ID:
			return UnitElement_3342;
		case SelectAction5EditPart.VISUAL_ID:
			return SelectAction_3343;
		case UnitAssociation12EditPart.VISUAL_ID:
			return UnitAssociation_3344;
		case DetailsUnit7EditPart.VISUAL_ID:
			return DetailsUnit_3345;
		case UnitElement16EditPart.VISUAL_ID:
			return UnitElement_3346;
		case UnitAssociation13EditPart.VISUAL_ID:
			return UnitAssociation_3347;
		case IndexUnit7EditPart.VISUAL_ID:
			return IndexUnit_3348;
		case UnitElement17EditPart.VISUAL_ID:
			return UnitElement_3349;
		case UnitAssociation14EditPart.VISUAL_ID:
			return UnitAssociation_3350;
		case SelectAction6EditPart.VISUAL_ID:
			return SelectAction_3351;
		case DataTypeField4EditPart.VISUAL_ID:
			return DataTypeField_3352;
		case DateField4EditPart.VISUAL_ID:
			return DateField_3353;
		case SelectAction7EditPart.VISUAL_ID:
			return SelectAction_3354;
		case DeleteAction3EditPart.VISUAL_ID:
			return DeleteAction_3355;
		case FeatureSupportAction2EditPart.VISUAL_ID:
			return FeatureSupportAction_3356;
		case MapUnitEditPart.VISUAL_ID:
			return MapUnit_3357;
		case SearchUnitEditPart.VISUAL_ID:
			return SearchUnit_3358;
		case UnitElement18EditPart.VISUAL_ID:
			return UnitElement_3359;
		case UnitAssociation15EditPart.VISUAL_ID:
			return UnitAssociation_3360;
		case DataTypeField5EditPart.VISUAL_ID:
			return DataTypeField_3361;
		case DateField5EditPart.VISUAL_ID:
			return DateField_3362;
		case StaticUnitEditPart.VISUAL_ID:
			return StaticUnit_3363;
		case UpdateUnitEditPart.VISUAL_ID:
			return UpdateUnit_3364;
		case UnitElement19EditPart.VISUAL_ID:
			return UnitElement_3365;
		case UnitAssociation16EditPart.VISUAL_ID:
			return UnitAssociation_3366;
		case IndexUnit8EditPart.VISUAL_ID:
			return IndexUnit_3367;
		case UnitElement20EditPart.VISUAL_ID:
			return UnitElement_3368;
		case UnitAssociation17EditPart.VISUAL_ID:
			return UnitAssociation_3369;
		case SelectAction8EditPart.VISUAL_ID:
			return SelectAction_3370;
		case DeleteAction4EditPart.VISUAL_ID:
			return DeleteAction_3371;
		case DataTypeField6EditPart.VISUAL_ID:
			return DataTypeField_3372;
		case DateField6EditPart.VISUAL_ID:
			return DateField_3373;
		case ImageIndexUnit2EditPart.VISUAL_ID:
			return ImageIndexUnit_3374;
		case SelectAction9EditPart.VISUAL_ID:
			return SelectAction_3375;
		case DeleteAction5EditPart.VISUAL_ID:
			return DeleteAction_3376;
		case FeatureSupportAction3EditPart.VISUAL_ID:
			return FeatureSupportAction_3377;
		case SliderUnitEditPart.VISUAL_ID:
			return SliderUnit_3378;
		case GalleryUnitEditPart.VISUAL_ID:
			return GalleryUnit_3379;
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return AssociationWithoutContainment_4005;
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return AssociationWithContainment_4006;
		case ViewAssociationEditPart.VISUAL_ID:
			return ViewAssociation_4007;
		case PageLinkEditPart.VISUAL_ID:
			return PageLink_4008;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
