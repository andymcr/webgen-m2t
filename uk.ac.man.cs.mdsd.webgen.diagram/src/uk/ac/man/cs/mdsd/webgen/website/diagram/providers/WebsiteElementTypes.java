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
	public static final IElementType DataType_2002 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.DataType_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DynamicMenu_2008 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DynamicMenu_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnumerationType_2006 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.EnumerationType_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entity_2003 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.Entity_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType View_2010 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.View_2010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Service_2004 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.Service_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Page_2005 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.Page_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StaticMenu_2009 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.StaticMenu_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CasAuthentication_3055 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.CasAuthentication_3055"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LocalAuthenticationSystem_3029 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.LocalAuthenticationSystem_3029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnumerationLiteral_3028 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.EnumerationLiteral_3028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataTypeAttribute_3252 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DataTypeAttribute_3252"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DateAttribute_3253 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DateAttribute_3253"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UrlAttribute_3254 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UrlAttribute_3254"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType FileAttribute_3255 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.FileAttribute_3255"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ImageAttribute_3256 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.ImageAttribute_3256"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType LocationAttribute_3257 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.LocationAttribute_3257"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ModelLabel_3247 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.ModelLabel_3247"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ModelLabel_3248 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.ModelLabel_3248"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType EncapsulatedAttribute_3258 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.EncapsulatedAttribute_3258"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType EncapsulatedAssociation_3259 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.EncapsulatedAssociation_3259"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Selection_3150 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.Selection_3150"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType BusinessOperation_3260 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.BusinessOperation_3260"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CreateUnit_3103 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.CreateUnit_3103"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3169 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3169"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3170 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3170"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataTypeField_3201 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DataTypeField_3201"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DateField_3207 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.DateField_3207"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitSupportAction_3232 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitSupportAction_3232"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CreateUpdateUnit_3104 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.CreateUpdateUnit_3104"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3171 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3171"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3172 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3172"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CreateUpdateUnit_3249 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.CreateUpdateUnit_3249"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataTypeField_3202 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DataTypeField_3202"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DateField_3208 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.DateField_3208"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CreateSitemapUnit_3157 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.CreateSitemapUnit_3157"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DetailsUnit_3105 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DetailsUnit_3105"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3173 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3173"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SelectAction_3102 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3102"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3174 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3174"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DetailsUnit_3112 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DetailsUnit_3112"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3175 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3175"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3176 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3176"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DetailsUnit_3113 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DetailsUnit_3113"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3177 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3177"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IndexUnit_3106 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3106"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3178 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3178"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IndexUnit_3114 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3114"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3179 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3179"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3180 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3180"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DetailsUnit_3116 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DetailsUnit_3116"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3181 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3181"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3182 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3182"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IndexUnit_3118 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3118"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3185 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3185"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3186 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3186"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IndexUnit_3136 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3136"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3193 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3193"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IndexUnit_3120 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3120"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3187 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3187"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3188 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3188"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SelectAction_3107 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3107"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DetailsUnit_3129 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DetailsUnit_3129"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3183 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3183"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3184 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3184"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SelectAction_3126 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3126"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataTypeField_3203 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DataTypeField_3203"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DateField_3209 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.DateField_3209"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SelectAction_3128 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3128"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataTypeField_3204 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DataTypeField_3204"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DateField_3210 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.DateField_3210"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SelectAction_3127 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3127"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3194 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3194"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DeleteAction_3101 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DeleteAction_3101"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SearchUnit_3109 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SearchUnit_3109"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3195 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3195"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3196 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3196"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DetailsUnit_3219 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DetailsUnit_3219"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataTypeField_3205 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DataTypeField_3205"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DateField_3211 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.DateField_3211"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DetailsUnit_3131 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DetailsUnit_3131"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3189 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3189"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3190 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3190"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StaticUnit_3110 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.StaticUnit_3110"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UpdateUnit_3111 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UpdateUnit_3111"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3220 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3220"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3221 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3221"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IndexUnit_3222 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3222"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UnitElement_3250 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3250"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3197 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3197"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3198 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3198"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IndexUnit_3143 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3143"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3215 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3215"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3216 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3216"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3199 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3199"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3200 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3200"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SelectAction_3153 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3153"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DeleteAction_3154 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DeleteAction_3154"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ActionMenuEntry_3236 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.ActionMenuEntry_3236"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataTypeField_3206 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DataTypeField_3206"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DateField_3212 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.DateField_3212"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SliderUnit_3261 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SliderUnit_3261"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SelectAction_3146 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.SelectAction_3146"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DeleteAction_3147 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.DeleteAction_3147"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FeatureSupportAction_3234 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.FeatureSupportAction_3234"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MapUnit_3228 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.MapUnit_3228"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IndexUnit_3133 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.IndexUnit_3133"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitElement_3191 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitElement_3191"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitAssociation_3192 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.UnitAssociation_3192"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EditStaticTextMenuEntry_3156 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.EditStaticTextMenuEntry_3156"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AssociationWithoutContainment_4001 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.AssociationWithoutContainment_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssociationWithContainment_4002 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.AssociationWithContainment_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ViewAssociation_4004 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.diagram.ViewAssociation_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PageLink_4003 = getElementType("uk.ac.man.cs.mdsd.webgen.diagram.PageLink_4003"); //$NON-NLS-1$

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

			elements.put(DataType_2002, WebsitePackage.eINSTANCE.getDataType());

			elements.put(DynamicMenu_2008, WebsitePackage.eINSTANCE.getDynamicMenu());

			elements.put(EnumerationType_2006, WebsitePackage.eINSTANCE.getEnumerationType());

			elements.put(Entity_2003, WebsitePackage.eINSTANCE.getEntity());

			elements.put(View_2010, WebsitePackage.eINSTANCE.getView());

			elements.put(Page_2005, WebsitePackage.eINSTANCE.getPage());

			elements.put(StaticMenu_2009, WebsitePackage.eINSTANCE.getStaticMenu());

			elements.put(Service_2004, WebsitePackage.eINSTANCE.getService());

			elements.put(CasAuthentication_3055, WebsitePackage.eINSTANCE.getCasAuthentication());

			elements.put(LocalAuthenticationSystem_3029, WebsitePackage.eINSTANCE.getLocalAuthenticationSystem());

			elements.put(EnumerationLiteral_3028, WebsitePackage.eINSTANCE.getEnumerationLiteral());

			elements.put(DataTypeAttribute_3252, WebsitePackage.eINSTANCE.getDataTypeAttribute());

			elements.put(DateAttribute_3253, WebsitePackage.eINSTANCE.getDateAttribute());

			elements.put(UrlAttribute_3254, WebsitePackage.eINSTANCE.getUrlAttribute());

			elements.put(FileAttribute_3255, WebsitePackage.eINSTANCE.getFileAttribute());

			elements.put(ImageAttribute_3256, WebsitePackage.eINSTANCE.getImageAttribute());

			elements.put(LocationAttribute_3257, WebsitePackage.eINSTANCE.getLocationAttribute());

			elements.put(ModelLabel_3247, WebsitePackage.eINSTANCE.getModelLabel());

			elements.put(ModelLabel_3248, WebsitePackage.eINSTANCE.getModelLabel());

			elements.put(EncapsulatedAttribute_3258, WebsitePackage.eINSTANCE.getEncapsulatedAttribute());

			elements.put(EncapsulatedAssociation_3259, WebsitePackage.eINSTANCE.getEncapsulatedAssociation());

			elements.put(CreateUnit_3103, WebsitePackage.eINSTANCE.getCreateUnit());

			elements.put(UnitElement_3169, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3170, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(DataTypeField_3201, WebsitePackage.eINSTANCE.getDataTypeField());

			elements.put(DateField_3207, WebsitePackage.eINSTANCE.getDateField());

			elements.put(CreateUpdateUnit_3104, WebsitePackage.eINSTANCE.getCreateUpdateUnit());

			elements.put(UnitElement_3171, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3172, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(CreateUpdateUnit_3249, WebsitePackage.eINSTANCE.getCreateUpdateUnit());

			elements.put(UnitElement_3173, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(DataTypeField_3202, WebsitePackage.eINSTANCE.getDataTypeField());

			elements.put(DateField_3208, WebsitePackage.eINSTANCE.getDateField());

			elements.put(CreateSitemapUnit_3157, WebsitePackage.eINSTANCE.getCreateSitemapUnit());

			elements.put(DetailsUnit_3105, WebsitePackage.eINSTANCE.getDetailsUnit());

			elements.put(UnitElement_3175, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(SelectAction_3102, WebsitePackage.eINSTANCE.getSelectAction());

			elements.put(UnitAssociation_3174, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(DetailsUnit_3112, WebsitePackage.eINSTANCE.getDetailsUnit());

			elements.put(UnitElement_3177, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3176, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(DetailsUnit_3113, WebsitePackage.eINSTANCE.getDetailsUnit());

			elements.put(UnitElement_3178, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(IndexUnit_3106, WebsitePackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3179, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(IndexUnit_3114, WebsitePackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3181, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3180, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(DetailsUnit_3116, WebsitePackage.eINSTANCE.getDetailsUnit());

			elements.put(UnitElement_3183, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3182, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(DetailsUnit_3129, WebsitePackage.eINSTANCE.getDetailsUnit());

			elements.put(UnitElement_3185, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3184, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(IndexUnit_3118, WebsitePackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3187, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3186, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(IndexUnit_3120, WebsitePackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3189, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3188, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(DetailsUnit_3131, WebsitePackage.eINSTANCE.getDetailsUnit());

			elements.put(UnitElement_3191, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3190, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(IndexUnit_3133, WebsitePackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3193, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3192, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(SelectAction_3107, WebsitePackage.eINSTANCE.getSelectAction());

			elements.put(DeleteAction_3101, WebsitePackage.eINSTANCE.getDeleteAction());

			elements.put(SelectAction_3126, WebsitePackage.eINSTANCE.getSelectAction());

			elements.put(DataTypeField_3203, WebsitePackage.eINSTANCE.getDataTypeField());

			elements.put(DateField_3209, WebsitePackage.eINSTANCE.getDateField());

			elements.put(UnitSupportAction_3232, WebsitePackage.eINSTANCE.getUnitSupportAction());

			elements.put(IndexUnit_3136, WebsitePackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3195, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(SelectAction_3127, WebsitePackage.eINSTANCE.getSelectAction());

			elements.put(UnitAssociation_3194, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(DetailsUnit_3219, WebsitePackage.eINSTANCE.getDetailsUnit());

			elements.put(UnitElement_3197, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3196, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(IndexUnit_3143, WebsitePackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3199, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3198, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(SelectAction_3128, WebsitePackage.eINSTANCE.getSelectAction());

			elements.put(DataTypeField_3204, WebsitePackage.eINSTANCE.getDataTypeField());

			elements.put(DateField_3210, WebsitePackage.eINSTANCE.getDateField());

			elements.put(SelectAction_3146, WebsitePackage.eINSTANCE.getSelectAction());

			elements.put(DeleteAction_3147, WebsitePackage.eINSTANCE.getDeleteAction());

			elements.put(FeatureSupportAction_3234, WebsitePackage.eINSTANCE.getFeatureSupportAction());

			elements.put(MapUnit_3228, WebsitePackage.eINSTANCE.getMapUnit());

			elements.put(SearchUnit_3109, WebsitePackage.eINSTANCE.getSearchUnit());

			elements.put(UnitElement_3215, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3200, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(DataTypeField_3205, WebsitePackage.eINSTANCE.getDataTypeField());

			elements.put(DateField_3211, WebsitePackage.eINSTANCE.getDateField());

			elements.put(StaticUnit_3110, WebsitePackage.eINSTANCE.getStaticUnit());

			elements.put(UpdateUnit_3111, WebsitePackage.eINSTANCE.getUpdateUnit());

			elements.put(UnitElement_3220, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3216, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(IndexUnit_3222, WebsitePackage.eINSTANCE.getIndexUnit());

			elements.put(UnitElement_3250, WebsitePackage.eINSTANCE.getUnitElement());

			elements.put(UnitAssociation_3221, WebsitePackage.eINSTANCE.getUnitAssociation());

			elements.put(SelectAction_3153, WebsitePackage.eINSTANCE.getSelectAction());

			elements.put(DeleteAction_3154, WebsitePackage.eINSTANCE.getDeleteAction());

			elements.put(DataTypeField_3206, WebsitePackage.eINSTANCE.getDataTypeField());

			elements.put(DateField_3212, WebsitePackage.eINSTANCE.getDateField());

			elements.put(SliderUnit_3261, WebsitePackage.eINSTANCE.getSliderUnit());

			elements.put(ActionMenuEntry_3236, WebsitePackage.eINSTANCE.getActionMenuEntry());

			elements.put(EditStaticTextMenuEntry_3156, WebsitePackage.eINSTANCE.getEditStaticTextMenuEntry());

			elements.put(Selection_3150, WebsitePackage.eINSTANCE.getSelection());

			elements.put(BusinessOperation_3260, WebsitePackage.eINSTANCE.getBusinessOperation());

			elements.put(AssociationWithoutContainment_4001,
					WebsitePackage.eINSTANCE.getAssociationWithoutContainment());

			elements.put(AssociationWithContainment_4002, WebsitePackage.eINSTANCE.getAssociationWithContainment());

			elements.put(ViewAssociation_4004, WebsitePackage.eINSTANCE.getViewAssociation());

			elements.put(PageLink_4003, WebsitePackage.eINSTANCE.getPageLink());
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
			KNOWN_ELEMENT_TYPES.add(DataType_2002);
			KNOWN_ELEMENT_TYPES.add(DynamicMenu_2008);
			KNOWN_ELEMENT_TYPES.add(EnumerationType_2006);
			KNOWN_ELEMENT_TYPES.add(Entity_2003);
			KNOWN_ELEMENT_TYPES.add(View_2010);
			KNOWN_ELEMENT_TYPES.add(Page_2005);
			KNOWN_ELEMENT_TYPES.add(StaticMenu_2009);
			KNOWN_ELEMENT_TYPES.add(Service_2004);
			KNOWN_ELEMENT_TYPES.add(CasAuthentication_3055);
			KNOWN_ELEMENT_TYPES.add(LocalAuthenticationSystem_3029);
			KNOWN_ELEMENT_TYPES.add(EnumerationLiteral_3028);
			KNOWN_ELEMENT_TYPES.add(DataTypeAttribute_3252);
			KNOWN_ELEMENT_TYPES.add(DateAttribute_3253);
			KNOWN_ELEMENT_TYPES.add(UrlAttribute_3254);
			KNOWN_ELEMENT_TYPES.add(FileAttribute_3255);
			KNOWN_ELEMENT_TYPES.add(ImageAttribute_3256);
			KNOWN_ELEMENT_TYPES.add(LocationAttribute_3257);
			KNOWN_ELEMENT_TYPES.add(ModelLabel_3247);
			KNOWN_ELEMENT_TYPES.add(ModelLabel_3248);
			KNOWN_ELEMENT_TYPES.add(EncapsulatedAttribute_3258);
			KNOWN_ELEMENT_TYPES.add(EncapsulatedAssociation_3259);
			KNOWN_ELEMENT_TYPES.add(CreateUnit_3103);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3169);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3170);
			KNOWN_ELEMENT_TYPES.add(DataTypeField_3201);
			KNOWN_ELEMENT_TYPES.add(DateField_3207);
			KNOWN_ELEMENT_TYPES.add(CreateUpdateUnit_3104);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3171);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3172);
			KNOWN_ELEMENT_TYPES.add(CreateUpdateUnit_3249);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3173);
			KNOWN_ELEMENT_TYPES.add(DataTypeField_3202);
			KNOWN_ELEMENT_TYPES.add(DateField_3208);
			KNOWN_ELEMENT_TYPES.add(CreateSitemapUnit_3157);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3105);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3175);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3102);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3174);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3112);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3177);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3176);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3113);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3178);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3106);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3179);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3114);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3181);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3180);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3116);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3183);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3182);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3129);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3185);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3184);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3118);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3187);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3186);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3120);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3189);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3188);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3131);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3191);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3190);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3133);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3193);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3192);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3107);
			KNOWN_ELEMENT_TYPES.add(DeleteAction_3101);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3126);
			KNOWN_ELEMENT_TYPES.add(DataTypeField_3203);
			KNOWN_ELEMENT_TYPES.add(DateField_3209);
			KNOWN_ELEMENT_TYPES.add(UnitSupportAction_3232);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3136);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3195);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3127);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3194);
			KNOWN_ELEMENT_TYPES.add(DetailsUnit_3219);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3197);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3196);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3143);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3199);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3198);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3128);
			KNOWN_ELEMENT_TYPES.add(DataTypeField_3204);
			KNOWN_ELEMENT_TYPES.add(DateField_3210);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3146);
			KNOWN_ELEMENT_TYPES.add(DeleteAction_3147);
			KNOWN_ELEMENT_TYPES.add(FeatureSupportAction_3234);
			KNOWN_ELEMENT_TYPES.add(MapUnit_3228);
			KNOWN_ELEMENT_TYPES.add(SearchUnit_3109);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3215);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3200);
			KNOWN_ELEMENT_TYPES.add(DataTypeField_3205);
			KNOWN_ELEMENT_TYPES.add(DateField_3211);
			KNOWN_ELEMENT_TYPES.add(StaticUnit_3110);
			KNOWN_ELEMENT_TYPES.add(UpdateUnit_3111);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3220);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3216);
			KNOWN_ELEMENT_TYPES.add(IndexUnit_3222);
			KNOWN_ELEMENT_TYPES.add(UnitElement_3250);
			KNOWN_ELEMENT_TYPES.add(UnitAssociation_3221);
			KNOWN_ELEMENT_TYPES.add(SelectAction_3153);
			KNOWN_ELEMENT_TYPES.add(DeleteAction_3154);
			KNOWN_ELEMENT_TYPES.add(DataTypeField_3206);
			KNOWN_ELEMENT_TYPES.add(DateField_3212);
			KNOWN_ELEMENT_TYPES.add(SliderUnit_3261);
			KNOWN_ELEMENT_TYPES.add(ActionMenuEntry_3236);
			KNOWN_ELEMENT_TYPES.add(EditStaticTextMenuEntry_3156);
			KNOWN_ELEMENT_TYPES.add(Selection_3150);
			KNOWN_ELEMENT_TYPES.add(BusinessOperation_3260);
			KNOWN_ELEMENT_TYPES.add(AssociationWithoutContainment_4001);
			KNOWN_ELEMENT_TYPES.add(AssociationWithContainment_4002);
			KNOWN_ELEMENT_TYPES.add(ViewAssociation_4004);
			KNOWN_ELEMENT_TYPES.add(PageLink_4003);
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
			return DataType_2002;
		case DynamicMenuEditPart.VISUAL_ID:
			return DynamicMenu_2008;
		case EnumerationTypeEditPart.VISUAL_ID:
			return EnumerationType_2006;
		case EntityEditPart.VISUAL_ID:
			return Entity_2003;
		case ViewEditPart.VISUAL_ID:
			return View_2010;
		case PageEditPart.VISUAL_ID:
			return Page_2005;
		case StaticMenuEditPart.VISUAL_ID:
			return StaticMenu_2009;
		case ServiceEditPart.VISUAL_ID:
			return Service_2004;
		case CasAuthenticationEditPart.VISUAL_ID:
			return CasAuthentication_3055;
		case LocalAuthenticationSystemEditPart.VISUAL_ID:
			return LocalAuthenticationSystem_3029;
		case EnumerationLiteralEditPart.VISUAL_ID:
			return EnumerationLiteral_3028;
		case DataTypeAttributeEditPart.VISUAL_ID:
			return DataTypeAttribute_3252;
		case DateAttributeEditPart.VISUAL_ID:
			return DateAttribute_3253;
		case UrlAttributeEditPart.VISUAL_ID:
			return UrlAttribute_3254;
		case FileAttributeEditPart.VISUAL_ID:
			return FileAttribute_3255;
		case ImageAttributeEditPart.VISUAL_ID:
			return ImageAttribute_3256;
		case LocationAttributeEditPart.VISUAL_ID:
			return LocationAttribute_3257;
		case ModelLabelEditPart.VISUAL_ID:
			return ModelLabel_3247;
		case ModelLabel2EditPart.VISUAL_ID:
			return ModelLabel_3248;
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return EncapsulatedAttribute_3258;
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return EncapsulatedAssociation_3259;
		case CreateUnitEditPart.VISUAL_ID:
			return CreateUnit_3103;
		case UnitElementEditPart.VISUAL_ID:
			return UnitElement_3169;
		case UnitAssociationEditPart.VISUAL_ID:
			return UnitAssociation_3170;
		case DataTypeFieldEditPart.VISUAL_ID:
			return DataTypeField_3201;
		case DateFieldEditPart.VISUAL_ID:
			return DateField_3207;
		case CreateUpdateUnitEditPart.VISUAL_ID:
			return CreateUpdateUnit_3104;
		case UnitElement2EditPart.VISUAL_ID:
			return UnitElement_3171;
		case UnitAssociation2EditPart.VISUAL_ID:
			return UnitAssociation_3172;
		case CreateUpdateUnit2EditPart.VISUAL_ID:
			return CreateUpdateUnit_3249;
		case UnitElement3EditPart.VISUAL_ID:
			return UnitElement_3173;
		case DataTypeField2EditPart.VISUAL_ID:
			return DataTypeField_3202;
		case DateField2EditPart.VISUAL_ID:
			return DateField_3208;
		case CreateSitemapUnitEditPart.VISUAL_ID:
			return CreateSitemapUnit_3157;
		case DetailsUnitEditPart.VISUAL_ID:
			return DetailsUnit_3105;
		case UnitElement4EditPart.VISUAL_ID:
			return UnitElement_3175;
		case SelectActionEditPart.VISUAL_ID:
			return SelectAction_3102;
		case UnitAssociation3EditPart.VISUAL_ID:
			return UnitAssociation_3174;
		case DetailsUnit2EditPart.VISUAL_ID:
			return DetailsUnit_3112;
		case UnitElement5EditPart.VISUAL_ID:
			return UnitElement_3177;
		case UnitAssociation4EditPart.VISUAL_ID:
			return UnitAssociation_3176;
		case DetailsUnit3EditPart.VISUAL_ID:
			return DetailsUnit_3113;
		case UnitElement6EditPart.VISUAL_ID:
			return UnitElement_3178;
		case IndexUnitEditPart.VISUAL_ID:
			return IndexUnit_3106;
		case UnitElement7EditPart.VISUAL_ID:
			return UnitElement_3179;
		case IndexUnit2EditPart.VISUAL_ID:
			return IndexUnit_3114;
		case UnitElement8EditPart.VISUAL_ID:
			return UnitElement_3181;
		case UnitAssociation5EditPart.VISUAL_ID:
			return UnitAssociation_3180;
		case DetailsUnit4EditPart.VISUAL_ID:
			return DetailsUnit_3116;
		case UnitElement9EditPart.VISUAL_ID:
			return UnitElement_3183;
		case UnitAssociation6EditPart.VISUAL_ID:
			return UnitAssociation_3182;
		case DetailsUnit5EditPart.VISUAL_ID:
			return DetailsUnit_3129;
		case UnitElement10EditPart.VISUAL_ID:
			return UnitElement_3185;
		case UnitAssociation7EditPart.VISUAL_ID:
			return UnitAssociation_3184;
		case IndexUnit3EditPart.VISUAL_ID:
			return IndexUnit_3118;
		case UnitElement11EditPart.VISUAL_ID:
			return UnitElement_3187;
		case UnitAssociation8EditPart.VISUAL_ID:
			return UnitAssociation_3186;
		case IndexUnit4EditPart.VISUAL_ID:
			return IndexUnit_3120;
		case UnitElement12EditPart.VISUAL_ID:
			return UnitElement_3189;
		case UnitAssociation9EditPart.VISUAL_ID:
			return UnitAssociation_3188;
		case DetailsUnit6EditPart.VISUAL_ID:
			return DetailsUnit_3131;
		case UnitElement13EditPart.VISUAL_ID:
			return UnitElement_3191;
		case UnitAssociation10EditPart.VISUAL_ID:
			return UnitAssociation_3190;
		case IndexUnit5EditPart.VISUAL_ID:
			return IndexUnit_3133;
		case UnitElement14EditPart.VISUAL_ID:
			return UnitElement_3193;
		case UnitAssociation11EditPart.VISUAL_ID:
			return UnitAssociation_3192;
		case SelectAction2EditPart.VISUAL_ID:
			return SelectAction_3107;
		case DeleteActionEditPart.VISUAL_ID:
			return DeleteAction_3101;
		case SelectAction3EditPart.VISUAL_ID:
			return SelectAction_3126;
		case DataTypeField3EditPart.VISUAL_ID:
			return DataTypeField_3203;
		case DateField3EditPart.VISUAL_ID:
			return DateField_3209;
		case UnitSupportActionEditPart.VISUAL_ID:
			return UnitSupportAction_3232;
		case IndexUnit6EditPart.VISUAL_ID:
			return IndexUnit_3136;
		case UnitElement15EditPart.VISUAL_ID:
			return UnitElement_3195;
		case SelectAction4EditPart.VISUAL_ID:
			return SelectAction_3127;
		case UnitAssociation12EditPart.VISUAL_ID:
			return UnitAssociation_3194;
		case DetailsUnit7EditPart.VISUAL_ID:
			return DetailsUnit_3219;
		case UnitElement16EditPart.VISUAL_ID:
			return UnitElement_3197;
		case UnitAssociation13EditPart.VISUAL_ID:
			return UnitAssociation_3196;
		case IndexUnit7EditPart.VISUAL_ID:
			return IndexUnit_3143;
		case UnitElement17EditPart.VISUAL_ID:
			return UnitElement_3199;
		case UnitAssociation14EditPart.VISUAL_ID:
			return UnitAssociation_3198;
		case SelectAction5EditPart.VISUAL_ID:
			return SelectAction_3128;
		case DataTypeField4EditPart.VISUAL_ID:
			return DataTypeField_3204;
		case DateField4EditPart.VISUAL_ID:
			return DateField_3210;
		case SelectAction6EditPart.VISUAL_ID:
			return SelectAction_3146;
		case DeleteAction2EditPart.VISUAL_ID:
			return DeleteAction_3147;
		case FeatureSupportActionEditPart.VISUAL_ID:
			return FeatureSupportAction_3234;
		case MapUnitEditPart.VISUAL_ID:
			return MapUnit_3228;
		case SearchUnitEditPart.VISUAL_ID:
			return SearchUnit_3109;
		case UnitElement18EditPart.VISUAL_ID:
			return UnitElement_3215;
		case UnitAssociation15EditPart.VISUAL_ID:
			return UnitAssociation_3200;
		case DataTypeField5EditPart.VISUAL_ID:
			return DataTypeField_3205;
		case DateField5EditPart.VISUAL_ID:
			return DateField_3211;
		case StaticUnitEditPart.VISUAL_ID:
			return StaticUnit_3110;
		case UpdateUnitEditPart.VISUAL_ID:
			return UpdateUnit_3111;
		case UnitElement19EditPart.VISUAL_ID:
			return UnitElement_3220;
		case UnitAssociation16EditPart.VISUAL_ID:
			return UnitAssociation_3216;
		case IndexUnit8EditPart.VISUAL_ID:
			return IndexUnit_3222;
		case UnitElement20EditPart.VISUAL_ID:
			return UnitElement_3250;
		case UnitAssociation17EditPart.VISUAL_ID:
			return UnitAssociation_3221;
		case SelectAction7EditPart.VISUAL_ID:
			return SelectAction_3153;
		case DeleteAction3EditPart.VISUAL_ID:
			return DeleteAction_3154;
		case DataTypeField6EditPart.VISUAL_ID:
			return DataTypeField_3206;
		case DateField6EditPart.VISUAL_ID:
			return DateField_3212;
		case SliderUnitEditPart.VISUAL_ID:
			return SliderUnit_3261;
		case ActionMenuEntryEditPart.VISUAL_ID:
			return ActionMenuEntry_3236;
		case EditStaticTextMenuEntryEditPart.VISUAL_ID:
			return EditStaticTextMenuEntry_3156;
		case SelectionEditPart.VISUAL_ID:
			return Selection_3150;
		case BusinessOperationEditPart.VISUAL_ID:
			return BusinessOperation_3260;
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return AssociationWithoutContainment_4001;
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return AssociationWithContainment_4002;
		case ViewAssociationEditPart.VISUAL_ID:
			return ViewAssociation_4004;
		case PageLinkEditPart.VISUAL_ID:
			return PageLink_4003;
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
