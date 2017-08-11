package com.slby.model.system;

import java.util.List;


public class Menu {

	private String id;		//菜单ID
	private String menu_name;	//菜单名称
	private String menu_url;	//链接
	private String parent_id;	//上级菜单ID
	private String menu_order;	//排序
	private String menu_icon;	//图标
	private String menu_type;	//类型
	private String menu_status;	//菜单状态
	private String target;
	private Menu parentMenu;
	private List<Menu> subMenu;
	private boolean hasMenu = false;
	
	public Menu() {
		super();
	}

	public Menu(String id, String menu_name, String menu_url, String parent_id, String menu_order, String menu_icon,
			String menu_type, String menu_status, String target, Menu parentMenu, List<Menu> subMenu, boolean hasMenu) {
		super();
		this.id = id;
		this.menu_name = menu_name;
		this.menu_url = menu_url;
		this.parent_id = parent_id;
		this.menu_order = menu_order;
		this.menu_icon = menu_icon;
		this.menu_type = menu_type;
		this.menu_status = menu_status;
		this.target = target;
		this.parentMenu = parentMenu;
		this.subMenu = subMenu;
		this.hasMenu = hasMenu;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public String getMenu_url() {
		return menu_url;
	}

	public void setMenu_url(String menu_url) {
		this.menu_url = menu_url;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public String getMenu_order() {
		return menu_order;
	}

	public void setMenu_order(String menu_order) {
		this.menu_order = menu_order;
	}

	public String getMenu_icon() {
		return menu_icon;
	}

	public void setMenu_icon(String menu_icon) {
		this.menu_icon = menu_icon;
	}

	public String getMenu_type() {
		return menu_type;
	}

	public void setMenu_type(String menu_type) {
		this.menu_type = menu_type;
	}

	public String getMenu_status() {
		return menu_status;
	}

	public void setMenu_status(String menu_status) {
		this.menu_status = menu_status;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Menu getParentMenu() {
		return parentMenu;
	}

	public void setParentMenu(Menu parentMenu) {
		this.parentMenu = parentMenu;
	}

	public List<Menu> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(List<Menu> subMenu) {
		this.subMenu = subMenu;
	}

	public boolean isHasMenu() {
		return hasMenu;
	}

	public void setHasMenu(boolean hasMenu) {
		this.hasMenu = hasMenu;
	}
	
	
}
