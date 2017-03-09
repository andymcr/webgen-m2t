package uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiElementTypes;
import uk.ac.man.cs.mdsd.webgen.webpage.diagram.providers.WebuiModelingAssistantProvider;

/**
 * @generated
 */
public class WebuiModelingAssistantProviderOfPageEditPart extends WebuiModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(11);
		types.add(WebuiElementTypes.CreateUnit_3001);
		types.add(WebuiElementTypes.CreateUpdateUnit_3002);
		types.add(WebuiElementTypes.DetailsUnit_3003);
		types.add(WebuiElementTypes.GalleryUnit_3004);
		types.add(WebuiElementTypes.ImageIndexUnit_3005);
		types.add(WebuiElementTypes.IndexUnit_3006);
		types.add(WebuiElementTypes.MapUnit_3007);
		types.add(WebuiElementTypes.SearchUnit_3008);
		types.add(WebuiElementTypes.SliderUnit_3009);
		types.add(WebuiElementTypes.StaticUnit_3010);
		types.add(WebuiElementTypes.UpdateUnit_3011);
		return types;
	}

}
