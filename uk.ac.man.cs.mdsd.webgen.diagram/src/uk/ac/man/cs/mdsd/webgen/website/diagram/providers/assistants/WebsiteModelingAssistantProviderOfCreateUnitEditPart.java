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
public class WebsiteModelingAssistantProviderOfCreateUnitEditPart extends WebsiteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(WebsiteElementTypes.UnitElement_3287);
		types.add(WebsiteElementTypes.UnitAssociation_3288);
		types.add(WebsiteElementTypes.DataTypeField_3289);
		types.add(WebsiteElementTypes.DateField_3290);
		return types;
	}

}
