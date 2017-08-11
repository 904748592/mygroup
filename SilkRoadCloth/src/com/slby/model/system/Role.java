package com.slby.model.system;

public class Role {

	
	private int id;
	private String rolename;
	private String rights;
	private int parent_id;
	private String add_qx;
	private String del_qx;
	private String edit_qx;
	private String cha_qx;
	
	public Role() {
		super();
	}

	public Role(int id, String rolename, String rights, int parent_id, String add_qx, String del_qx, String edit_qx,
			String cha_qx) {
		super();
		this.id = id;
		this.rolename = rolename;
		this.rights = rights;
		this.parent_id = parent_id;
		this.add_qx = add_qx;
		this.del_qx = del_qx;
		this.edit_qx = edit_qx;
		this.cha_qx = cha_qx;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRights() {
		return rights;
	}

	public void setRights(String rights) {
		this.rights = rights;
	}

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public String getAdd_qx() {
		return add_qx;
	}

	public void setAdd_qx(String add_qx) {
		this.add_qx = add_qx;
	}

	public String getDel_qx() {
		return del_qx;
	}

	public void setDel_qx(String del_qx) {
		this.del_qx = del_qx;
	}

	public String getEdit_qx() {
		return edit_qx;
	}

	public void setEdit_qx(String edit_qx) {
		this.edit_qx = edit_qx;
	}

	public String getCha_qx() {
		return cha_qx;
	}

	public void setCha_qx(String cha_qx) {
		this.cha_qx = cha_qx;
	}
	
	
}
