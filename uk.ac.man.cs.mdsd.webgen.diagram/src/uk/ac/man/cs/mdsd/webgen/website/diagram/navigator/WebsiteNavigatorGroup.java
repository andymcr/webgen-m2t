package uk.ac.man.cs.mdsd.webgen.website.diagram.navigator;

import java.util.Collection;
import java.util.LinkedList;

/**
 * @generated
 */
public class WebsiteNavigatorGroup extends WebsiteAbstractNavigatorItem {

	/**
	 * @generated
	 */
	private String myGroupName;

	/**
	 * @generated
	 */
	private String myIcon;

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	private Collection myChildren = new LinkedList();

	/**
	 * @generated
	 */
	WebsiteNavigatorGroup(String groupName, String icon, Object parent) {
		super(parent);
		myGroupName = groupName;
		myIcon = icon;
	}

	/**
	 * @generated
	 */
	public String getGroupName() {
		return myGroupName;
	}

	/**
	 * @generated
	 */
	public String getIcon() {
		return myIcon;
	}

	/**
	 * @generated
	 */
	public Object[] getChildren() {
		return myChildren.toArray();
	}

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addChildren(Collection children) {
		myChildren.addAll(children);
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void addChild(Object child) {
		myChildren.add(child);
	}

	/**
	 * @generated
	 */
	public boolean isEmpty() {
		return myChildren.size() == 0;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof uk.ac.man.cs.mdsd.webgen.website.diagram.navigator.WebsiteNavigatorGroup) {
			uk.ac.man.cs.mdsd.webgen.website.diagram.navigator.WebsiteNavigatorGroup anotherGroup = (uk.ac.man.cs.mdsd.webgen.website.diagram.navigator.WebsiteNavigatorGroup) obj;
			if (getGroupName().equals(anotherGroup.getGroupName())) {
				return getParent().equals(anotherGroup.getParent());
			}
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return getGroupName().hashCode();
	}

}
