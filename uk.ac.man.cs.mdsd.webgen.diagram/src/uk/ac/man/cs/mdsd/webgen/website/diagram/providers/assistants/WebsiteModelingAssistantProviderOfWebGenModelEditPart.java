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
public class WebsiteModelingAssistantProviderOfWebGenModelEditPart extends WebsiteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(9);
		types.add(WebsiteElementTypes.WebsiteProperties_2001);
		types.add(WebsiteElementTypes.DataType_2013);
		types.add(WebsiteElementTypes.DynamicMenu_2008);
		types.add(WebsiteElementTypes.EnumerationType_2014);
		types.add(WebsiteElementTypes.Entity_2015);
		types.add(WebsiteElementTypes.View_2016);
		types.add(WebsiteElementTypes.Page_2005);
		types.add(WebsiteElementTypes.StaticMenu_2009);
		types.add(WebsiteElementTypes.Service_2017);
		return types;
	}

}
