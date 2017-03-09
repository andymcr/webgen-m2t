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
public class WebuiModelingAssistantProviderOfCreateUnitEditPart extends WebuiModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WebuiElementTypes.UnitAssociation_3012);
		types.add(WebuiElementTypes.UnitElement_3013);
		return types;
	}

}
