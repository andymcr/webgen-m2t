package uk.ac.man.cs.mdsd.webgen.website.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteModelingAssistantProvider;

/**
 * @generated
 */
public class WebsiteModelingAssistantProviderOfActionUnitEditPart extends WebsiteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(WebsiteElementTypes.UnitElement_3169);
		types.add(WebsiteElementTypes.UnitAssociation_3170);
		types.add(WebsiteElementTypes.DataTypeField_3201);
		types.add(WebsiteElementTypes.DateField_3207);
		types.add(WebsiteElementTypes.UnitSupportAction_3232);
		return types;
	}

}
